package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.InflaterInputStream;

public class class_1938 {
    private static final byte[] lllIIIllIIIIlllIlIIllIIll = new byte[4096];
    private final File lllIlIIlIIIlIlIIIllIlllIl;
    private RandomAccessFile IlIllllllIIlIIllllIIlIIIl;
    private final int[] lIlllIlllIIIIlIIlllIllIII = new int[1024];
    private final int[] IlIIIIIllllllIIlllIllllll = new int[1024];
    private ArrayList lIllllIIlIIIlIllllllIIIll;
    private int IIIllIIlIIIIIIlIlIIllIIlI;
    private long IllIIlllllllIIlIIlIIIIlIl;

    public class_1938(File file) {
        this.lllIlIIlIIIlIlIIIllIlllIl = file;
        this.IIIllIIlIIIIIIlIlIIllIIlI = 0;
        try {
            int n;
            int n2;
            int n3;
            if (file.exists()) {
                this.IllIIlllllllIIlIIlIIIIlIl = file.lastModified();
            }
            this.IlIllllllIIlIIllllIIlIIIl = new RandomAccessFile(file, "rw");
            if (this.IlIllllllIIlIIllllIIlIIIl.length() < 4096L) {
                for (n3 = 0; n3 < 1024; ++n3) {
                    this.IlIllllllIIlIIllllIIlIIIl.writeInt(0);
                }
                for (n3 = 0; n3 < 1024; ++n3) {
                    this.IlIllllllIIlIIllllIIlIIIl.writeInt(0);
                }
                this.IIIllIIlIIIIIIlIlIIllIIlI += 8192;
            }
            if ((this.IlIllllllIIlIIllllIIlIIIl.length() & 0xFFFL) != 0L) {
                n3 = 0;
                while ((long)n3 < (this.IlIllllllIIlIIllllIIlIIIl.length() & 0xFFFL)) {
                    this.IlIllllllIIlIIllllIIlIIIl.write(0);
                    ++n3;
                }
            }
            n3 = (int)this.IlIllllllIIlIIllllIIlIIIl.length() / 4096;
            this.lIllllIIlIIIlIllllllIIIll = new ArrayList(n3);
            for (n2 = 0; n2 < n3; ++n2) {
                this.lIllllIIlIIIlIllllllIIIll.add(true);
            }
            this.lIllllIIlIIIlIllllllIIIll.set(0, false);
            this.lIllllIIlIIIlIllllllIIIll.set(1, false);
            this.IlIllllllIIlIIllllIIlIIIl.seek(0L);
            for (n2 = 0; n2 < 1024; ++n2) {
                this.lIlllIlllIIIIlIIlllIllIII[n2] = n = this.IlIllllllIIlIIllllIIlIIIl.readInt();
                if (n == 0 || (n >> 8) + (n & 0xFF) > this.lIllllIIlIIIlIllllllIIIll.size()) continue;
                for (int i = 0; i < (n & 0xFF); ++i) {
                    this.lIllllIIlIIIlIllllllIIIll.set((n >> 8) + i, false);
                }
            }
            for (n2 = 0; n2 < 1024; ++n2) {
                this.IlIIIIIllllllIIlllIllllll[n2] = n = this.IlIllllllIIlIIllllIIlIIIl.readInt();
            }
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    public synchronized DataInputStream lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        if (this.lIlllIlllIIIIlIIlllIllIII(n, n2)) {
            return null;
        }
        try {
            int n3 = this.IlIIIIIllllllIIlllIllllll(n, n2);
            if (n3 == 0) {
                return null;
            }
            int n4 = n3 >> 8;
            int n5 = n3 & 0xFF;
            if (n4 + n5 > this.lIllllIIlIIIlIllllllIIIll.size()) {
                return null;
            }
            this.IlIllllllIIlIIllllIIlIIIl.seek(n4 * 4096);
            int n6 = this.IlIllllllIIlIIllllIIlIIIl.readInt();
            if (n6 > 4096 * n5) {
                return null;
            }
            if (n6 <= 0) {
                return null;
            }
            byte by = this.IlIllllllIIlIIllllIIlIIIl.readByte();
            if (by == 1) {
                byte[] arrby = new byte[n6 - 1];
                this.IlIllllllIIlIIllllIIlIIIl.read(arrby);
                return new DataInputStream(new BufferedInputStream(new GZIPInputStream(new ByteArrayInputStream(arrby))));
            }
            if (by == 2) {
                byte[] arrby = new byte[n6 - 1];
                this.IlIllllllIIlIIllllIIlIIIl.read(arrby);
                return new DataInputStream(new BufferedInputStream(new InflaterInputStream(new ByteArrayInputStream(arrby))));
            }
            return null;
        }
        catch (IOException iOException) {
            return null;
        }
    }

    public DataOutputStream lllIlIIlIIIlIlIIIllIlllIl(int n, int n2) {
        return this.lIlllIlllIIIIlIIlllIllIII(n, n2) ? null : new DataOutputStream(new DeflaterOutputStream(new class_1743(this, n, n2)));
    }

    protected synchronized void lllIIIllIIIIlllIlIIllIIll(int n, int n2, byte[] arrby, int n3) {
        try {
            int n4 = this.IlIIIIIllllllIIlllIllllll(n, n2);
            int n5 = n4 >> 8;
            int n6 = n4 & 0xFF;
            int n7 = (n3 + 5) / 4096 + 1;
            if (n7 >= 256) {
                return;
            }
            if (n5 != 0 && n6 == n7) {
                this.lllIIIllIIIIlllIlIIllIIll(n5, arrby, n3);
            } else {
                int n8;
                int n9;
                for (n9 = 0; n9 < n6; ++n9) {
                    this.lIllllIIlIIIlIllllllIIIll.set(n5 + n9, true);
                }
                n9 = this.lIllllIIlIIIlIllllllIIIll.indexOf(true);
                int n10 = 0;
                if (n9 != -1) {
                    for (n8 = n9; n8 < this.lIllllIIlIIIlIllllllIIIll.size(); ++n8) {
                        if (n10 != 0) {
                            n10 = ((Boolean)this.lIllllIIlIIIlIllllllIIIll.get(n8)).booleanValue() ? ++n10 : 0;
                        } else if (((Boolean)this.lIllllIIlIIIlIllllllIIIll.get(n8)).booleanValue()) {
                            n9 = n8;
                            n10 = 1;
                        }
                        if (n10 >= n7) break;
                    }
                }
                if (n10 >= n7) {
                    n5 = n9;
                    this.lllIIIllIIIIlllIlIIllIIll(n, n2, n9 << 8 | n7);
                    for (n8 = 0; n8 < n7; ++n8) {
                        this.lIllllIIlIIIlIllllllIIIll.set(n5 + n8, false);
                    }
                    this.lllIIIllIIIIlllIlIIllIIll(n5, arrby, n3);
                } else {
                    this.IlIllllllIIlIIllllIIlIIIl.seek(this.IlIllllllIIlIIllllIIlIIIl.length());
                    n5 = this.lIllllIIlIIIlIllllllIIIll.size();
                    for (n8 = 0; n8 < n7; ++n8) {
                        this.IlIllllllIIlIIllllIIlIIIl.write(lllIIIllIIIIlllIlIIllIIll);
                        this.lIllllIIlIIIlIllllllIIIll.add(false);
                    }
                    this.IIIllIIlIIIIIIlIlIIllIIlI += 4096 * n7;
                    this.lllIIIllIIIIlllIlIIllIIll(n5, arrby, n3);
                    this.lllIIIllIIIIlllIlIIllIIll(n, n2, n5 << 8 | n7);
                }
            }
            this.lllIlIIlIIIlIlIIIllIlllIl(n, n2, (int)(class_0220.lllIIIlIIlIlIllIIIIIlIIll() / 1000L));
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    private void lllIIIllIIIIlllIlIIllIIll(int n, byte[] arrby, int n2) {
        this.IlIllllllIIlIIllllIIlIIIl.seek(n * 4096);
        this.IlIllllllIIlIIllllIIlIIIl.writeInt(n2 + 1);
        this.IlIllllllIIlIIllllIIlIIIl.writeByte(2);
        this.IlIllllllIIlIIllllIIlIIIl.write(arrby, 0, n2);
    }

    private boolean lIlllIlllIIIIlIIlllIllIII(int n, int n2) {
        return n < 0 || n >= 32 || n2 < 0 || n2 >= 32;
    }

    private int IlIIIIIllllllIIlllIllllll(int n, int n2) {
        return this.lIlllIlllIIIIlIIlllIllIII[n + n2 * 32];
    }

    public boolean IlIllllllIIlIIllllIIlIIIl(int n, int n2) {
        return this.IlIIIIIllllllIIlllIllllll(n, n2) != 0;
    }

    private void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        this.lIlllIlllIIIIlIIlllIllIII[n + n2 * 32] = n3;
        this.IlIllllllIIlIIllllIIlIIIl.seek((n + n2 * 32) * 4);
        this.IlIllllllIIlIIllllIIlIIIl.writeInt(n3);
    }

    private void lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, int n3) {
        this.IlIIIIIllllllIIlllIllllll[n + n2 * 32] = n3;
        this.IlIllllllIIlIIllllIIlIIIl.seek(4096 + (n + n2 * 32) * 4);
        this.IlIllllllIIlIIllllIIlIIIl.writeInt(n3);
    }

    public void lllIIIllIIIIlllIlIIllIIll() {
        if (this.IlIllllllIIlIIllllIIlIIIl != null) {
            this.IlIllllllIIlIIllllIIlIIIl.close();
        }
    }
}

