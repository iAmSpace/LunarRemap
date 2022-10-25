package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.crash.CrashReport;
import net.minecraft.util.MathHelper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_0723 {
    private static final Logger lIlIlIIlIIIIlIIIIIlllIIII = LogManager.getLogger();
    public static boolean lllIIIllIIIIlllIlIIllIIll;
    private class_1532[] IlIIIlIIIIllIIIllIIIIIIll = new class_1532[16];
    private byte[] IIlllIlIlllIllIIIlllIIlIl = new byte[256];
    public int[] lllIlIIlIIIlIlIIIllIlllIl = new int[256];
    public boolean[] IlIllllllIIlIIllllIIlIIIl = new boolean[256];
    public boolean lIlllIlllIIIIlIIlllIllIII;
    public class_1334 IlIIIIIllllllIIlllIllllll;
    public int[] lIllllIIlIIIlIllllllIIIll;
    public final int IIIllIIlIIIIIIlIlIIllIIlI;
    public final int IllIIlllllllIIlIIlIIIIlIl;
    private boolean lIlIllIIlIIlIIlIIlIIlIIll;
    public Map IIIllIllIIlIlIlIlIllllIIl = new HashMap();
    public List[] IllIIIllIIIIlIlIlIllIIlll = new List[16];
    public boolean lIIIIlIlIIlllllIIllIIlIII;
    public boolean llIIlllIllIllllIIIlIIIIII;
    public boolean llIIllIllIlIIlIIllIllllll;
    public boolean lllIIlIIIllllllIIIIlIlIlI;
    public boolean IlIlllIIIIIIlIIllIIllIlll;
    public long IlIlIIlIlIllIIlIlIIllIIIl;
    public boolean lllllIlllIIllIlIIlIIIllII;
    public int IlIlIIlllIIlIllIIIlllllIl;
    public long lIIlIIIIIlIlllIlIIlIlIlll;
    private int llIIlIllIllllIlIIIIlIIlll = 4096;

    public class_0723(class_1334 class_13342, int n, int n2) {
        this.IlIIIIIllllllIIlllIllllll = class_13342;
        this.IIIllIIlIIIIIIlIlIIllIIlI = n;
        this.IllIIlllllllIIlIIlIIIIlIl = n2;
        this.lIllllIIlIIIlIllllllIIIll = new int[256];
        for (int i = 0; i < this.IllIIIllIIIIlIlIlIllIIlll.length; ++i) {
            this.IllIIIllIIIIlIlIlIllIIlll[i] = new ArrayList();
        }
        Arrays.fill(this.lllIlIIlIIIlIlIIIllIlllIl, -999);
        Arrays.fill(this.IIlllIlIlllIllIIIlllIIlIl, (byte)-1);
    }

    public class_0723(class_1334 class_13342, Block[] arrclass_0549, int n, int n2) {
        this(class_13342, n, n2);
        int n3 = arrclass_0549.length / 256;
        boolean bl = !class_13342.IlIlIIlllIIlIllIIIlllllIl.IIIllIIlIIIIIIlIlIIllIIlI;
        for (int i = 0; i < 16; ++i) {
            for (int j = 0; j < 16; ++j) {
                for (int k = 0; k < n3; ++k) {
                    Block class_05492 = arrclass_0549[i << 11 | j << 7 | k];
                    if (class_05492 == null || class_05492.lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll) continue;
                    int n4 = k >> 4;
                    if (this.IlIIIlIIIIllIIIllIIIIIIll[n4] == null) {
                        this.IlIIIlIIIIllIIIllIIIIIIll[n4] = new class_1532(n4 << 4, bl);
                    }
                    this.IlIIIlIIIIllIIIllIIIIIIll[n4].lllIIIllIIIIlllIlIIllIIll(i, k & 0xF, j, class_05492);
                }
            }
        }
    }

    public class_0723(class_1334 class_13342, Block[] arrclass_0549, byte[] arrby, int n, int n2) {
        this(class_13342, n, n2);
        int n3 = arrclass_0549.length / 256;
        boolean bl = !class_13342.IlIlIIlllIIlIllIIIlllllIl.IIIllIIlIIIIIIlIlIIllIIlI;
        for (int i = 0; i < 16; ++i) {
            for (int j = 0; j < 16; ++j) {
                for (int k = 0; k < n3; ++k) {
                    int n4 = i * n3 * 16 | j * n3 | k;
                    Block class_05492 = arrclass_0549[n4];
                    if (class_05492 == null || class_05492 == Blocks.lllIIIllIIIIlllIlIIllIIll) continue;
                    int n5 = k >> 4;
                    if (this.IlIIIlIIIIllIIIllIIIIIIll[n5] == null) {
                        this.IlIIIlIIIIllIIIllIIIIIIll[n5] = new class_1532(n5 << 4, bl);
                    }
                    this.IlIIIlIIIIllIIIllIIIIIIll[n5].lllIIIllIIIIlllIlIIllIIll(i, k & 0xF, j, class_05492);
                    this.IlIIIlIIIIllIIIllIIIIIIll[n5].lllIIIllIIIIlllIlIIllIIll(i, k & 0xF, j, arrby[n4]);
                }
            }
        }
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        return n == this.IIIllIIlIIIIIIlIlIIllIIlI && n2 == this.IllIIlllllllIIlIIlIIIIlIl;
    }

    public int lllIlIIlIIIlIlIIIllIlllIl(int n, int n2) {
        return this.lIllllIIlIIIlIllllllIIIll[n2 << 4 | n];
    }

    public int lllIIIllIIIIlllIlIIllIIll() {
        for (int i = this.IlIIIlIIIIllIIIllIIIIIIll.length - 1; i >= 0; --i) {
            if (this.IlIIIlIIIIllIIIllIIIIIIll[i] == null) continue;
            return this.IlIIIlIIIIllIIIllIIIIIIll[i].IlIllllllIIlIIllllIIlIIIl();
        }
        return 0;
    }

    public class_1532[] lllIlIIlIIIlIlIIIllIlllIl() {
        return this.IlIIIlIIIIllIIIllIIIIIIll;
    }

    public void IlIllllllIIlIIllllIIlIIIl() {
        int n = this.lllIIIllIIIIlllIlIIllIIll();
        this.IlIlIIlllIIlIllIIIlllllIl = Integer.MAX_VALUE;
        for (int i = 0; i < 16; ++i) {
            block1: for (int j = 0; j < 16; ++j) {
                this.lllIlIIlIIIlIlIIIllIlllIl[i + (j << 4)] = -999;
                for (int k = n + 16 - 1; k > 0; --k) {
                    Block class_05492 = this.lllIlIIlIIIlIlIIIllIlllIl(i, k - 1, j);
                    if (class_05492.lllIlIIlIIIlIlIIIllIlllIl() == 0) {
                        continue;
                    }
                    this.lIllllIIlIIIlIllllllIIIll[j << 4 | i] = k;
                    if (k >= this.IlIlIIlllIIlIllIIIlllllIl) continue block1;
                    this.IlIlIIlllIIlIllIIIlllllIl = k;
                    continue block1;
                }
            }
        }
        this.lllIIlIIIllllllIIIIlIlIlI = true;
    }

    public void lIlllIlllIIIIlIIlllIllIII() {
        int n = this.lllIIIllIIIIlllIlIIllIIll();
        this.IlIlIIlllIIlIllIIIlllllIl = Integer.MAX_VALUE;
        for (int i = 0; i < 16; ++i) {
            for (int j = 0; j < 16; ++j) {
                int n2;
                this.lllIlIIlIIIlIlIIIllIlllIl[i + (j << 4)] = -999;
                for (n2 = n + 16 - 1; n2 > 0; --n2) {
                    if (this.lllIIIllIIIIlllIlIIllIIll(i, n2 - 1, j) == 0) {
                        continue;
                    }
                    this.lIllllIIlIIIlIllllllIIIll[j << 4 | i] = n2;
                    if (n2 >= this.IlIlIIlllIIlIllIIIlllllIl) break;
                    this.IlIlIIlllIIlIllIIIlllllIl = n2;
                    break;
                }
                if (this.IlIIIIIllllllIIlllIllllll.IlIlIIlllIIlIllIIIlllllIl.IIIllIIlIIIIIIlIlIIllIIlI) continue;
                n2 = 15;
                int n3 = n + 16 - 1;
                do {
                    class_1532 class_15322;
                    int n4;
                    if ((n4 = this.lllIIIllIIIIlllIlIIllIIll(i, n3, j)) == 0 && n2 != 15) {
                        n4 = 1;
                    }
                    if ((n2 -= n4) <= 0 || (class_15322 = this.IlIIIlIIIIllIIIllIIIIIIll[n3 >> 4]) == null) continue;
                    class_15322.lllIlIIlIIIlIlIIIllIlllIl(i, n3 & 0xF, j, n2);
                    this.IlIIIIIllllllIIlllIllllll.lIIIIlIlIIlllllIIllIIlIII((this.IIIllIIlIIIIIIlIlIIllIIlI << 4) + i, n3, (this.IllIIlllllllIIlIIlIIIIlIl << 4) + j);
                } while (--n3 > 0 && n2 > 0);
            }
        }
        this.lllIIlIIIllllllIIIIlIlIlI = true;
    }

    private void IlIIIIIllllllIIlllIllllll(int n, int n2) {
        this.IlIllllllIIlIIllllIIlIIIl[n + n2 * 16] = true;
        this.lIlIllIIlIIlIIlIIlIIlIIll = true;
    }

    private void IlIllllllIIlIIllllIIlIIIl(boolean bl) {
        this.IlIIIIIllllllIIlllIllllll.IlIIlllllIIlIlIlllllIllll.startSection("recheckGaps");
        if (this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl(this.IIIllIIlIIIIIIlIlIIllIIlI * 16 + 8, 0, this.IllIIlllllllIIlIIlIIIIlIl * 16 + 8, 16)) {
            for (int i = 0; i < 16; ++i) {
                for (int j = 0; j < 16; ++j) {
                    if (!this.IlIllllllIIlIIllllIIlIIIl[i + j * 16]) continue;
                    this.IlIllllllIIlIIllllIIlIIIl[i + j * 16] = false;
                    int n = this.lllIlIIlIIIlIlIIIllIlllIl(i, j);
                    int n2 = this.IIIllIIlIIIIIIlIlIIllIIlI * 16 + i;
                    int n3 = this.IllIIlllllllIIlIIlIIIIlIl * 16 + j;
                    int n4 = this.IlIIIIIllllllIIlllIllllll.IIIllIIlIIIIIIlIlIIllIIlI(n2 - 1, n3);
                    int n5 = this.IlIIIIIllllllIIlllIllllll.IIIllIIlIIIIIIlIlIIllIIlI(n2 + 1, n3);
                    int n6 = this.IlIIIIIllllllIIlllIllllll.IIIllIIlIIIIIIlIlIIllIIlI(n2, n3 - 1);
                    int n7 = this.IlIIIIIllllllIIlllIllllll.IIIllIIlIIIIIIlIlIIllIIlI(n2, n3 + 1);
                    if (n5 < n4) {
                        n4 = n5;
                    }
                    if (n6 < n4) {
                        n4 = n6;
                    }
                    if (n7 < n4) {
                        n4 = n7;
                    }
                    this.IIIllIIlIIIIIIlIlIIllIIlI(n2, n3, n4);
                    this.IIIllIIlIIIIIIlIlIIllIIlI(n2 - 1, n3, n);
                    this.IIIllIIlIIIIIIlIlIIllIIlI(n2 + 1, n3, n);
                    this.IIIllIIlIIIIIIlIlIIllIIlI(n2, n3 - 1, n);
                    this.IIIllIIlIIIIIIlIlIIllIIlI(n2, n3 + 1, n);
                    if (!bl) continue;
                    this.IlIIIIIllllllIIlllIllllll.IlIIlllllIIlIlIlllllIllll.endSection();
                    return;
                }
            }
            this.lIlIllIIlIIlIIlIIlIIlIIll = false;
        }
        this.IlIIIIIllllllIIlllIllllll.IlIIlllllIIlIlIlllllIllll.endSection();
    }

    private void IIIllIIlIIIIIIlIlIIllIIlI(int n, int n2, int n3) {
        int n4 = this.IlIIIIIllllllIIlllIllllll.lIllllIIlIIIlIllllllIIIll(n, n2);
        if (n4 > n3) {
            this.IlIllllllIIlIIllllIIlIIIl(n, n2, n3, n4 + 1);
        } else if (n4 < n3) {
            this.IlIllllllIIlIIllllIIlIIIl(n, n2, n4, n3 + 1);
        }
    }

    private void IlIllllllIIlIIllllIIlIIIl(int n, int n2, int n3, int n4) {
        if (n4 > n3 && this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl(n, 0, n2, 16)) {
            for (int i = n3; i < n4; ++i) {
                this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl(class_1346.lllIIIllIIIIlllIlIIllIIll, n, i, n2);
            }
            this.lllIIlIIIllllllIIIIlIlIlI = true;
        }
    }

    private void IllIIlllllllIIlIIlIIIIlIl(int n, int n2, int n3) {
        int n4;
        int n5 = n4 = this.lIllllIIlIIIlIllllllIIIll[n3 << 4 | n] & 0xFF;
        if (n2 > n4) {
            n5 = n2;
        }
        while (n5 > 0 && this.lllIIIllIIIIlllIlIIllIIll(n, n5 - 1, n3) == 0) {
            --n5;
        }
        if (n5 != n4) {
            int n6;
            int n7;
            this.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII(n + this.IIIllIIlIIIIIIlIlIIllIIlI * 16, n3 + this.IllIIlllllllIIlIIlIIIIlIl * 16, n5, n4);
            this.lIllllIIlIIIlIllllllIIIll[n3 << 4 | n] = n5;
            int n8 = this.IIIllIIlIIIIIIlIlIIllIIlI * 16 + n;
            int n9 = this.IllIIlllllllIIlIIlIIIIlIl * 16 + n3;
            if (!this.IlIIIIIllllllIIlllIllllll.IlIlIIlllIIlIllIIIlllllIl.IIIllIIlIIIIIIlIlIIllIIlI) {
                class_1532 class_15322;
                if (n5 < n4) {
                    for (n7 = n5; n7 < n4; ++n7) {
                        class_15322 = this.IlIIIlIIIIllIIIllIIIIIIll[n7 >> 4];
                        if (class_15322 == null) continue;
                        class_15322.lllIlIIlIIIlIlIIIllIlllIl(n, n7 & 0xF, n3, 15);
                        this.IlIIIIIllllllIIlllIllllll.lIIIIlIlIIlllllIIllIIlIII((this.IIIllIIlIIIIIIlIlIIllIIlI << 4) + n, n7, (this.IllIIlllllllIIlIIlIIIIlIl << 4) + n3);
                    }
                } else {
                    for (n7 = n4; n7 < n5; ++n7) {
                        class_15322 = this.IlIIIlIIIIllIIIllIIIIIIll[n7 >> 4];
                        if (class_15322 == null) continue;
                        class_15322.lllIlIIlIIIlIlIIIllIlllIl(n, n7 & 0xF, n3, 0);
                        this.IlIIIIIllllllIIlllIllllll.lIIIIlIlIIlllllIIllIIlIII((this.IIIllIIlIIIIIIlIlIIllIIlI << 4) + n, n7, (this.IllIIlllllllIIlIIlIIIIlIl << 4) + n3);
                    }
                }
                n7 = 15;
                while (n5 > 0 && n7 > 0) {
                    class_1532 class_15323;
                    if ((n6 = this.lllIIIllIIIIlllIlIIllIIll(n, --n5, n3)) == 0) {
                        n6 = 1;
                    }
                    if ((n7 -= n6) < 0) {
                        n7 = 0;
                    }
                    if ((class_15323 = this.IlIIIlIIIIllIIIllIIIIIIll[n5 >> 4]) == null) continue;
                    class_15323.lllIlIIlIIIlIlIIIllIlllIl(n, n5 & 0xF, n3, n7);
                }
            }
            n7 = this.lIllllIIlIIIlIllllllIIIll[n3 << 4 | n];
            n6 = n4;
            int n10 = n7;
            if (n7 < n4) {
                n6 = n7;
                n10 = n4;
            }
            if (n7 < this.IlIlIIlllIIlIllIIIlllllIl) {
                this.IlIlIIlllIIlIllIIIlllllIl = n7;
            }
            if (!this.IlIIIIIllllllIIlllIllllll.IlIlIIlllIIlIllIIIlllllIl.IIIllIIlIIIIIIlIlIIllIIlI) {
                this.IlIllllllIIlIIllllIIlIIIl(n8 - 1, n9, n6, n10);
                this.IlIllllllIIlIIllllIIlIIIl(n8 + 1, n9, n6, n10);
                this.IlIllllllIIlIIllllIIlIIIl(n8, n9 - 1, n6, n10);
                this.IlIllllllIIlIIllllIIlIIIl(n8, n9 + 1, n6, n10);
                this.IlIllllllIIlIIllllIIlIIIl(n8, n9, n6, n10);
            }
            this.lllIIlIIIllllllIIIIlIlIlI = true;
        }
    }

    public int lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        return this.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3).lllIlIIlIIIlIlIIIllIlllIl();
    }

    public Block lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, int n3) {
        class_1532 class_15322;
        Block class_05492 = Blocks.lllIIIllIIIIlllIlIIllIIll;
        if (n2 >> 4 < this.IlIIIlIIIIllIIIllIIIIIIll.length && (class_15322 = this.IlIIIlIIIIllIIIllIIIIIIll[n2 >> 4]) != null) {
            try {
                class_05492 = class_15322.lllIIIllIIIIlllIlIIllIIll(n, n2 & 0xF, n3);
            }
            catch (Throwable throwable) {
                CrashReport class_02232 = CrashReport.lllIIIllIIIIlllIlIIllIIll(throwable, "Getting block");
                class_0799 class_07992 = class_02232.lllIIIllIIIIlllIlIIllIIll("net.minecraft.block.Block being got");
                class_07992.addCrashSectionCallable("Location", new class_2104(this));
                throw new class_0892(class_02232);
            }
        }
        return class_05492;
    }

    public int IlIllllllIIlIIllllIIlIIIl(int n, int n2, int n3) {
        if (n2 >> 4 >= this.IlIIIlIIIIllIIIllIIIIIIll.length) {
            return 0;
        }
        class_1532 class_15322 = this.IlIIIlIIIIllIIIllIIIIIIll[n2 >> 4];
        return class_15322 != null ? class_15322.lllIlIIlIIIlIlIIIllIlllIl(n, n2 & 0xF, n3) : 0;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, Block class_05492, int n4) {
        class_1774 class_17742;
        int n5 = n3 << 4 | n;
        if (n2 >= this.lllIlIIlIIIlIlIIIllIlllIl[n5] - 1) {
            this.lllIlIIlIIIlIlIIIllIlllIl[n5] = -999;
        }
        int n6 = this.lIllllIIlIIIlIllllllIIIll[n5];
        Block class_05493 = this.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3);
        int n7 = this.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        if (class_05493 == class_05492 && n7 == n4) {
            return false;
        }
        class_1532 class_15322 = this.IlIIIlIIIIllIIIllIIIIIIll[n2 >> 4];
        boolean bl = false;
        if (class_15322 == null) {
            if (class_05492 == Blocks.lllIIIllIIIIlllIlIIllIIll) {
                return false;
            }
            class_1532 class_15323 = new class_1532(n2 >> 4 << 4, !this.IlIIIIIllllllIIlllIllllll.IlIlIIlllIIlIllIIIlllllIl.IIIllIIlIIIIIIlIlIIllIIlI);
            this.IlIIIlIIIIllIIIllIIIIIIll[n2 >> 4] = class_15323;
            class_15322 = class_15323;
            bl = n2 >= n6;
        }
        int n8 = this.IIIllIIlIIIIIIlIlIIllIIlI * 16 + n;
        int n9 = this.IllIIlllllllIIlIIlIIIIlIl * 16 + n3;
        if (!this.IlIIIIIllllllIIlllIllllll.IllIIIIllIIllIllIlllIlIIl) {
            class_05493.IlIIIIIllllllIIlllIllllll(this.IlIIIIIllllllIIlllIllllll, n8, n2, n9, n7);
        }
        class_15322.lllIIIllIIIIlllIlIIllIIll(n, n2 & 0xF, n3, class_05492);
        if (!this.IlIIIIIllllllIIlllIllllll.IllIIIIllIIllIllIlllIlIIl) {
            class_05493.lllIIIllIIIIlllIlIIllIIll(this.IlIIIIIllllllIIlllIllllll, n8, n2, n9, class_05493, n7);
        } else if (class_05493 instanceof class_1770 && class_05493 != class_05492) {
            this.IlIIIIIllllllIIlllIllllll.llIIllIllIlIIlIIllIllllll(n8, n2, n9);
        }
        if (class_15322.lllIIIllIIIIlllIlIIllIIll(n, n2 & 0xF, n3) != class_05492) {
            return false;
        }
        class_15322.lllIIIllIIIIlllIlIIllIIll(n, n2 & 0xF, n3, n4);
        if (bl) {
            this.lIlllIlllIIIIlIIlllIllIII();
        } else {
            int n10 = class_05492.lllIlIIlIIIlIlIIIllIlllIl();
            int n11 = class_05493.lllIlIIlIIIlIlIIIllIlllIl();
            if (n10 > 0) {
                if (n2 >= n6) {
                    this.IllIIlllllllIIlIIlIIIIlIl(n, n2 + 1, n3);
                }
            } else if (n2 == n6 - 1) {
                this.IllIIlllllllIIlIIlIIIIlIl(n, n2, n3);
            }
            if (n10 != n11 && (n10 < n11 || this.lllIIIllIIIIlllIlIIllIIll(class_1346.lllIIIllIIIIlllIlIIllIIll, n, n2, n3) > 0 || this.lllIIIllIIIIlllIlIIllIIll(class_1346.lllIlIIlIIIlIlIIIllIlllIl, n, n2, n3) > 0)) {
                this.IlIIIIIllllllIIlllIllllll(n, n3);
            }
        }
        if (class_05493 instanceof class_1770 && (class_17742 = this.IlIIIIIllllllIIlllIllllll(n, n2, n3)) != null) {
            class_17742.llIIlllIllIllllIIIlIIIIII();
        }
        if (!this.IlIIIIIllllllIIlllIllllll.IllIIIIllIIllIllIlllIlIIl) {
            class_05492.lIlllIlllIIIIlIIlllIllIII(this.IlIIIIIllllllIIlllIllllll, n8, n2, n9);
        }
        if (class_05492 instanceof class_1770) {
            class_1774 class_17743 = this.IlIIIIIllllllIIlllIllllll(n, n2, n3);
            if (class_17743 == null) {
                class_17743 = ((class_1770)((Object)class_05492)).lllIIIllIIIIlllIlIIllIIll(this.IlIIIIIllllllIIlllIllllll, n4);
                this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(n8, n2, n9, class_17743);
            }
            if (class_17743 != null) {
                class_17743.llIIlllIllIllllIIIlIIIIII();
            }
        }
        this.lllIIlIIIllllllIIIIlIlIlI = true;
        return true;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4) {
        class_1774 class_17742;
        class_1532 class_15322 = this.IlIIIlIIIIllIIIllIIIIIIll[n2 >> 4];
        if (class_15322 == null) {
            return false;
        }
        int n5 = class_15322.lllIlIIlIIIlIlIIIllIlllIl(n, n2 & 0xF, n3);
        if (n5 == n4) {
            return false;
        }
        this.lllIIlIIIllllllIIIIlIlIlI = true;
        class_15322.lllIIIllIIIIlllIlIIllIIll(n, n2 & 0xF, n3, n4);
        if (class_15322.lllIIIllIIIIlllIlIIllIIll(n, n2 & 0xF, n3) instanceof class_1770 && (class_17742 = this.IlIIIIIllllllIIlllIllllll(n, n2, n3)) != null) {
            class_17742.llIIlllIllIllllIIIlIIIIII();
            class_17742.lIllllIIlIIIlIllllllIIIll = n4;
        }
        return true;
    }

    public int lllIIIllIIIIlllIlIIllIIll(class_1346 class_13462, int n, int n2, int n3) {
        class_1532 class_15322 = this.IlIIIlIIIIllIIIllIIIIIIll[n2 >> 4];
        return class_15322 == null ? (this.lIlllIlllIIIIlIIlllIllIII(n, n2, n3) ? class_13462.IlIllllllIIlIIllllIIlIIIl : 0) : (class_13462 == class_1346.lllIIIllIIIIlllIlIIllIIll ? (this.IlIIIIIllllllIIlllIllllll.IlIlIIlllIIlIllIIIlllllIl.IIIllIIlIIIIIIlIlIIllIIlI ? 0 : class_15322.IlIllllllIIlIIllllIIlIIIl(n, n2 & 0xF, n3)) : (class_13462 == class_1346.lllIlIIlIIIlIlIIIllIlllIl ? class_15322.lIlllIlllIIIIlIIlllIllIII(n, n2 & 0xF, n3) : class_13462.IlIllllllIIlIIllllIIlIIIl));
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1346 class_13462, int n, int n2, int n3, int n4) {
        class_1532 class_15322 = this.IlIIIlIIIIllIIIllIIIIIIll[n2 >> 4];
        if (class_15322 == null) {
            class_1532 class_15323 = new class_1532(n2 >> 4 << 4, !this.IlIIIIIllllllIIlllIllllll.IlIlIIlllIIlIllIIIlllllIl.IIIllIIlIIIIIIlIlIIllIIlI);
            this.IlIIIlIIIIllIIIllIIIIIIll[n2 >> 4] = class_15323;
            class_15322 = class_15323;
            this.lIlllIlllIIIIlIIlllIllIII();
        }
        this.lllIIlIIIllllllIIIIlIlIlI = true;
        if (class_13462 == class_1346.lllIIIllIIIIlllIlIIllIIll) {
            if (!this.IlIIIIIllllllIIlllIllllll.IlIlIIlllIIlIllIIIlllllIl.IIIllIIlIIIIIIlIlIIllIIlI) {
                class_15322.lllIlIIlIIIlIlIIIllIlllIl(n, n2 & 0xF, n3, n4);
            }
        } else if (class_13462 == class_1346.lllIlIIlIIIlIlIIIllIlllIl) {
            class_15322.IlIllllllIIlIIllllIIlIIIl(n, n2 & 0xF, n3, n4);
        }
    }

    public int lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, int n3, int n4) {
        int n5;
        int n6;
        class_1532 class_15322 = this.IlIIIlIIIIllIIIllIIIIIIll[n2 >> 4];
        if (class_15322 == null) {
            return !this.IlIIIIIllllllIIlllIllllll.IlIlIIlllIIlIllIIIlllllIl.IIIllIIlIIIIIIlIlIIllIIlI && n4 < class_1346.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl ? class_1346.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl - n4 : 0;
        }
        int n7 = n6 = this.IlIIIIIllllllIIlllIllllll.IlIlIIlllIIlIllIIIlllllIl.IIIllIIlIIIIIIlIlIIllIIlI ? 0 : class_15322.IlIllllllIIlIIllllIIlIIIl(n, n2 & 0xF, n3);
        if (n6 > 0) {
            lllIIIllIIIIlllIlIIllIIll = true;
        }
        if ((n5 = class_15322.lIlllIlllIIIIlIIlllIllIII(n, n2 & 0xF, n3)) > (n6 -= n4)) {
            n6 = n5;
        }
        return n6;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212) {
        int n;
        this.IlIlllIIIIIIlIIllIIllIlll = true;
        int n2 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_15212.IlIIlllllIIlIlIlllllIllll / 16.0);
        int n3 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_15212.IllIIIIllIIllIllIlllIlIIl / 16.0);
        if (n2 != this.IIIllIIlIIIIIIlIlIIllIIlI || n3 != this.IllIIlllllllIIlIIlIIIIlIl) {
            lIlIlIIlIIIIlIIIIIlllIIII.warn("Wrong location! " + class_15212 + " (at " + n2 + ", " + n3 + " instead of " + this.IIIllIIlIIIIIIlIlIIllIIlI + ", " + this.IllIIlllllllIIlIIlIIIIlIl + ")");
            Thread.dumpStack();
        }
        if ((n = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_15212.llIIlIlIlllIIllIlIlllIllI / 16.0)) < 0) {
            n = 0;
        }
        if (n >= this.IllIIIllIIIIlIlIlIllIIlll.length) {
            n = this.IllIIIllIIIIlIlIlIllIIlll.length - 1;
        }
        class_15212.IlIIllIlIlIllIIIlIIlIlIIl = true;
        class_15212.lIlIIllIllIIIIIlIllllIIIl = this.IIIllIIlIIIIIIlIlIIllIIlI;
        class_15212.lIlllIIllIIIIIIlIlIIlIllI = n;
        class_15212.llIIIlIlIlIIlIllIIIllIlIl = this.IllIIlllllllIIlIIlIIIIlIl;
        this.IllIIIllIIIIlIlIlIllIIlll[n].add(class_15212);
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(class_1521 class_15212) {
        this.lllIIIllIIIIlllIlIIllIIll(class_15212, class_15212.lIlllIIllIIIIIIlIlIIlIllI);
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, int n) {
        if (n < 0) {
            n = 0;
        }
        if (n >= this.IllIIIllIIIIlIlIlIllIIlll.length) {
            n = this.IllIIIllIIIIlIlIlIllIIlll.length - 1;
        }
        this.IllIIIllIIIIlIlIlIllIIlll[n].remove(class_15212);
    }

    public boolean lIlllIlllIIIIlIIlllIllIII(int n, int n2, int n3) {
        return n2 >= this.lIllllIIlIIIlIllllllIIIll[n3 << 4 | n];
    }

    public class_1774 IlIIIIIllllllIIlllIllllll(int n, int n2, int n3) {
        class_2137 class_21372 = new class_2137(n, n2, n3);
        class_1774 class_17742 = (class_1774)this.IIIllIllIIlIlIlIlIllllIIl.get(class_21372);
        if (class_17742 == null) {
            Block class_05492 = this.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3);
            if (!class_05492.lllIIlIIIllllllIIIIlIlIlI()) {
                return null;
            }
            class_17742 = ((class_1770)((Object)class_05492)).lllIIIllIIIIlllIlIIllIIll(this.IlIIIIIllllllIIlllIllllll, this.IlIllllllIIlIIllllIIlIIIl(n, n2, n3));
            this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(this.IIIllIIlIIIIIIlIlIIllIIlI * 16 + n, n2, this.IllIIlllllllIIlIIlIIIIlIl * 16 + n3, class_17742);
        }
        if (class_17742 != null && class_17742.IIIllIllIIlIlIlIlIllllIIl()) {
            this.IIIllIllIIlIlIlIlIllllIIl.remove(class_21372);
            return null;
        }
        return class_17742;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1774 class_17742) {
        int n = class_17742.lllIlIIlIIIlIlIIIllIlllIl - this.IIIllIIlIIIIIIlIlIIllIIlI * 16;
        int n2 = class_17742.IlIllllllIIlIIllllIIlIIIl;
        int n3 = class_17742.lIlllIlllIIIIlIIlllIllIII - this.IllIIlllllllIIlIIlIIIIlIl * 16;
        this.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, class_17742);
        if (this.lIlllIlllIIIIlIIlllIllIII) {
            this.IlIIIIIllllllIIlllIllllll.IlIIIIIllllllIIlllIllllll.add(class_17742);
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, class_1774 class_17742) {
        class_2137 class_21372 = new class_2137(n, n2, n3);
        class_17742.lllIIIllIIIIlllIlIIllIIll(this.IlIIIIIllllllIIlllIllllll);
        class_17742.lllIlIIlIIIlIlIIIllIlllIl = this.IIIllIIlIIIIIIlIlIIllIIlI * 16 + n;
        class_17742.IlIllllllIIlIIllllIIlIIIl = n2;
        class_17742.lIlllIlllIIIIlIIlllIllIII = this.IllIIlllllllIIlIIlIIIIlIl * 16 + n3;
        if (this.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3) instanceof class_1770) {
            if (this.IIIllIllIIlIlIlIlIllllIIl.containsKey(class_21372)) {
                ((class_1774)this.IIIllIllIIlIlIlIlIllllIIl.get(class_21372)).IllIIIllIIIIlIlIlIllIIlll();
            }
            class_17742.lIIIIlIlIIlllllIIllIIlIII();
            this.IIIllIllIIlIlIlIlIllllIIl.put(class_21372, class_17742);
        }
    }

    public void lIllllIIlIIIlIllllllIIIll(int n, int n2, int n3) {
        class_1774 class_17742;
        class_2137 class_21372 = new class_2137(n, n2, n3);
        if (this.lIlllIlllIIIIlIIlllIllIII && (class_17742 = (class_1774)this.IIIllIllIIlIlIlIlIllllIIl.remove(class_21372)) != null) {
            class_17742.IllIIIllIIIIlIlIlIllIIlll();
        }
    }

    public void IlIIIIIllllllIIlllIllllll() {
        this.lIlllIlllIIIIlIIlllIllIII = true;
        this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(this.IIIllIllIIlIlIlIlIllllIIl.values());
        for (int i = 0; i < this.IllIIIllIIIIlIlIlIllIIlll.length; ++i) {
            for (class_1521 class_15212 : this.IllIIIllIIIIlIlIlIllIIlll[i]) {
                class_15212.llllIIllIlIlllllllIIlIIlI();
            }
            this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(this.IllIIIllIIIIlIlIlIllIIlll[i]);
        }
    }

    public void lIllllIIlIIIlIllllllIIIll() {
        this.lIlllIlllIIIIlIIlllIllIII = false;
        for (class_1774 class_17742 : this.IIIllIllIIlIlIlIlIllllIIl.values()) {
            this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(class_17742);
        }
        for (int i = 0; i < this.IllIIIllIIIIlIlIlIllIIlll.length; ++i) {
            this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl(this.IllIIIllIIIIlIlIlIllIIlll[i]);
        }
    }

    public void IIIllIIlIIIIIIlIlIIllIIlI() {
        this.lllIIlIIIllllllIIIIlIlIlI = true;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, class_1974 class_19742, List list, class_0830 class_08302) {
        int n = MathHelper.IlIllllllIIlIIllllIIlIIIl((class_19742.lllIlIIlIIIlIlIIIllIlllIl - 2.0) / 16.0);
        int n2 = MathHelper.IlIllllllIIlIIllllIIlIIIl((class_19742.IlIIIIIllllllIIlllIllllll + 2.0) / 16.0);
        n = MathHelper.lllIIIllIIIIlllIlIIllIIll(n, 0, this.IllIIIllIIIIlIlIlIllIIlll.length - 1);
        n2 = MathHelper.lllIIIllIIIIlllIlIIllIIll(n2, 0, this.IllIIIllIIIIlIlIlIllIIlll.length - 1);
        for (int i = n; i <= n2; ++i) {
            List list2 = this.IllIIIllIIIIlIlIlIllIIlll[i];
            for (int j = 0; j < list2.size(); ++j) {
                class_1521 class_15213 = (class_1521)list2.get(j);
                if (class_15213 == class_15212 || !class_15213.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl(class_19742) || class_08302 != null && !class_08302.lllIIIllIIIIlllIlIIllIIll(class_15213)) continue;
                list.add(class_15213);
                class_1521[] arrclass_1521 = class_15213.lIIllllllllIlIllllllllIlI();
                if (arrclass_1521 == null) continue;
                for (int k = 0; k < arrclass_1521.length; ++k) {
                    class_15213 = arrclass_1521[k];
                    if (class_15213 == class_15212 || !class_15213.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl(class_19742) || class_08302 != null && !class_08302.lllIIIllIIIIlllIlIIllIIll(class_15213)) continue;
                    list.add(class_15213);
                }
            }
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(Class class_, class_1974 class_19742, List list, class_0830 class_08302) {
        int n = MathHelper.IlIllllllIIlIIllllIIlIIIl((class_19742.lllIlIIlIIIlIlIIIllIlllIl - 2.0) / 16.0);
        int n2 = MathHelper.IlIllllllIIlIIllllIIlIIIl((class_19742.IlIIIIIllllllIIlllIllllll + 2.0) / 16.0);
        n = MathHelper.lllIIIllIIIIlllIlIIllIIll(n, 0, this.IllIIIllIIIIlIlIlIllIIlll.length - 1);
        n2 = MathHelper.lllIIIllIIIIlllIlIIllIIll(n2, 0, this.IllIIIllIIIIlIlIlIllIIlll.length - 1);
        for (int i = n; i <= n2; ++i) {
            List list2 = this.IllIIIllIIIIlIlIlIllIIlll[i];
            for (int j = 0; j < list2.size(); ++j) {
                class_1521 class_15212 = (class_1521)list2.get(j);
                if (!class_.isAssignableFrom(class_15212.getClass()) || !class_15212.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl(class_19742) || class_08302 != null && !class_08302.lllIIIllIIIIlllIlIIllIIll(class_15212)) continue;
                list.add(class_15212);
            }
        }
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(boolean bl) {
        if (bl ? this.IlIlllIIIIIIlIIllIIllIlll && this.IlIIIIIllllllIIlllIllllll.IlIIIlIIIIllIIIllIIIIIIll() != this.IlIlIIlIlIllIIlIlIIllIIIl || this.lllIIlIIIllllllIIIIlIlIlI : this.IlIlllIIIIIIlIIllIIllIlll && this.IlIIIIIllllllIIlllIllllll.IlIIIlIIIIllIIIllIIIIIIll() >= this.IlIlIIlIlIllIIlIlIIllIIIl + 600L) {
            return true;
        }
        return this.lllIIlIIIllllllIIIIlIlIlI;
    }

    public Random lllIIIllIIIIlllIlIIllIIll(long l) {
        return new Random(this.IlIIIIIllllllIIlllIllllll.lIlIlIIlIIIIlIIIIIlllIIII() + (long)(this.IIIllIIlIIIIIIlIlIIllIIlI * this.IIIllIIlIIIIIIlIlIIllIIlI * 4987142) + (long)(this.IIIllIIlIIIIIIlIlIIllIIlI * 5947611) + (long)(this.IllIIlllllllIIlIIlIIIIlIl * this.IllIIlllllllIIlIIlIIIIlIl) * 4392871L + (long)(this.IllIIlllllllIIlIIlIIIIlIl * 389711) ^ l);
    }

    public boolean IllIIlllllllIIlIIlIIIIlIl() {
        return false;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1848 class_18482, class_1848 class_18483, int n, int n2) {
        if (!this.lIIIIlIlIIlllllIIllIIlIII && class_18482.lllIIIllIIIIlllIlIIllIIll(n + 1, n2 + 1) && class_18482.lllIIIllIIIIlllIlIIllIIll(n, n2 + 1) && class_18482.lllIIIllIIIIlllIlIIllIIll(n + 1, n2)) {
            class_18482.lllIIIllIIIIlllIlIIllIIll(class_18483, n, n2);
        }
        if (class_18482.lllIIIllIIIIlllIlIIllIIll(n - 1, n2) && !class_18482.lIlllIlllIIIIlIIlllIllIII((int)(n - 1), (int)n2).lIIIIlIlIIlllllIIllIIlIII && class_18482.lllIIIllIIIIlllIlIIllIIll(n - 1, n2 + 1) && class_18482.lllIIIllIIIIlllIlIIllIIll(n, n2 + 1) && class_18482.lllIIIllIIIIlllIlIIllIIll(n - 1, n2 + 1)) {
            class_18482.lllIIIllIIIIlllIlIIllIIll(class_18483, n - 1, n2);
        }
        if (class_18482.lllIIIllIIIIlllIlIIllIIll(n, n2 - 1) && !class_18482.lIlllIlllIIIIlIIlllIllIII((int)n, (int)(n2 - 1)).lIIIIlIlIIlllllIIllIIlIII && class_18482.lllIIIllIIIIlllIlIIllIIll(n + 1, n2 - 1) && class_18482.lllIIIllIIIIlllIlIIllIIll(n + 1, n2 - 1) && class_18482.lllIIIllIIIIlllIlIIllIIll(n + 1, n2)) {
            class_18482.lllIIIllIIIIlllIlIIllIIll(class_18483, n, n2 - 1);
        }
        if (class_18482.lllIIIllIIIIlllIlIIllIIll(n - 1, n2 - 1) && !class_18482.lIlllIlllIIIIlIIlllIllIII((int)(n - 1), (int)(n2 - 1)).lIIIIlIlIIlllllIIllIIlIII && class_18482.lllIIIllIIIIlllIlIIllIIll(n, n2 - 1) && class_18482.lllIIIllIIIIlllIlIIllIIll(n - 1, n2)) {
            class_18482.lllIIIllIIIIlllIlIIllIIll(class_18483, n - 1, n2 - 1);
        }
    }

    public int IlIllllllIIlIIllllIIlIIIl(int n, int n2) {
        int n3 = n | n2 << 4;
        int n4 = this.lllIlIIlIIIlIlIIIllIlllIl[n3];
        if (n4 == -999) {
            int n5 = this.lllIIIllIIIIlllIlIIllIIll() + 15;
            n4 = -1;
            while (n5 > 0 && n4 == -1) {
                Block class_05492 = this.lllIlIIlIIIlIlIIIllIlllIl(n, n5, n2);
                class_1855 class_18552 = class_05492.lIllllIIlIIIlIllllllIIIll();
                if (!class_18552.lIlllIlllIIIIlIIlllIllIII() && !class_18552.lllIIIllIIIIlllIlIIllIIll()) {
                    --n5;
                    continue;
                }
                n4 = n5 + 1;
            }
            this.lllIlIIlIIIlIlIIIllIlllIl[n3] = n4;
        }
        return n4;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(boolean bl) {
        if (this.lIlIllIIlIIlIIlIIlIIlIIll && !this.IlIIIIIllllllIIlllIllllll.IlIlIIlllIIlIllIIIlllllIl.IIIllIIlIIIIIIlIlIIllIIlI && !bl) {
            this.IlIllllllIIlIIllllIIlIIIl(this.IlIIIIIllllllIIlllIllllll.IllIIIIllIIllIllIlllIlIIl);
        }
        this.llIIllIllIlIIlIIllIllllll = true;
        if (!this.llIIlllIllIllllIIIlIIIIII && this.lIIIIlIlIIlllllIIllIIlIII) {
            this.lllIIlIIIllllllIIIIlIlIlI();
        }
    }

    public boolean IIIllIllIIlIlIlIlIllllIIl() {
        return this.llIIllIllIlIIlIIllIllllll && this.lIIIIlIlIIlllllIIllIIlIII && this.llIIlllIllIllllIIIlIIIIII;
    }

    public class_1108 IllIIIllIIIIlIlIlIllIIlll() {
        return new class_1108(this.IIIllIIlIIIIIIlIlIIllIIlI, this.IllIIlllllllIIlIIlIIIIlIl);
    }

    public boolean lIlllIlllIIIIlIIlllIllIII(int n, int n2) {
        if (n < 0) {
            n = 0;
        }
        if (n2 >= 256) {
            n2 = 255;
        }
        for (int i = n; i <= n2; i += 16) {
            class_1532 class_15322 = this.IlIIIlIIIIllIIIllIIIIIIll[i >> 4];
            if (class_15322 == null || class_15322.lllIIIllIIIIlllIlIIllIIll()) continue;
            return false;
        }
        return true;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1532[] arrclass_1532) {
        this.IlIIIlIIIIllIIIllIIIIIIll = arrclass_1532;
    }

    public void lllIIIllIIIIlllIlIIllIIll(byte[] arrby, int n, int n2, boolean bl) {
        Object object;
        int n3;
        int n4 = 0;
        boolean bl2 = !this.IlIIIIIllllllIIlllIllllll.IlIlIIlllIIlIllIIIlllllIl.IIIllIIlIIIIIIlIlIIllIIlI;
        for (n3 = 0; n3 < this.IlIIIlIIIIllIIIllIIIIIIll.length; ++n3) {
            if ((n & 1 << n3) != 0) {
                if (this.IlIIIlIIIIllIIIllIIIIIIll[n3] == null) {
                    this.IlIIIlIIIIllIIIllIIIIIIll[n3] = new class_1532(n3 << 4, bl2);
                }
                object = this.IlIIIlIIIIllIIIllIIIIIIll[n3].IlIIIIIllllllIIlllIllllll();
                System.arraycopy(arrby, n4, object, 0, ((byte[])object).length);
                n4 += ((byte[])object).length;
                continue;
            }
            if (!bl || this.IlIIIlIIIIllIIIllIIIIIIll[n3] == null) continue;
            this.IlIIIlIIIIllIIIllIIIIIIll[n3] = null;
        }
        for (n3 = 0; n3 < this.IlIIIlIIIIllIIIllIIIIIIll.length; ++n3) {
            if ((n & 1 << n3) == 0 || this.IlIIIlIIIIllIIIllIIIIIIll[n3] == null) continue;
            object = this.IlIIIlIIIIllIIIllIIIIIIll[n3].IllIIlllllllIIlIIlIIIIlIl();
            System.arraycopy(arrby, n4, object.lllIIIllIIIIlllIlIIllIIll, 0, object.lllIIIllIIIIlllIlIIllIIll.length);
            n4 += object.lllIIIllIIIIlllIlIIllIIll.length;
        }
        for (n3 = 0; n3 < this.IlIIIlIIIIllIIIllIIIIIIll.length; ++n3) {
            if ((n & 1 << n3) == 0 || this.IlIIIlIIIIllIIIllIIIIIIll[n3] == null) continue;
            object = this.IlIIIlIIIIllIIIllIIIIIIll[n3].IIIllIllIIlIlIlIlIllllIIl();
            System.arraycopy(arrby, n4, object.lllIIIllIIIIlllIlIIllIIll, 0, object.lllIIIllIIIIlllIlIIllIIll.length);
            n4 += object.lllIIIllIIIIlllIlIIllIIll.length;
        }
        if (bl2) {
            for (n3 = 0; n3 < this.IlIIIlIIIIllIIIllIIIIIIll.length; ++n3) {
                if ((n & 1 << n3) == 0 || this.IlIIIlIIIIllIIIllIIIIIIll[n3] == null) continue;
                object = this.IlIIIlIIIIllIIIllIIIIIIll[n3].IllIIIllIIIIlIlIlIllIIlll();
                System.arraycopy(arrby, n4, object.lllIIIllIIIIlllIlIIllIIll, 0, object.lllIIIllIIIIlllIlIIllIIll.length);
                n4 += object.lllIIIllIIIIlllIlIIllIIll.length;
            }
        }
        for (n3 = 0; n3 < this.IlIIIlIIIIllIIIllIIIIIIll.length; ++n3) {
            if ((n2 & 1 << n3) != 0) {
                if (this.IlIIIlIIIIllIIIllIIIIIIll[n3] == null) {
                    n4 += 2048;
                    continue;
                }
                object = this.IlIIIlIIIIllIIIllIIIIIIll[n3].IIIllIIlIIIIIIlIlIIllIIlI();
                if (object == null) {
                    object = this.IlIIIlIIIIllIIIllIIIIIIll[n3].lIIIIlIlIIlllllIIllIIlIII();
                }
                System.arraycopy(arrby, n4, object.lllIIIllIIIIlllIlIIllIIll, 0, object.lllIIIllIIIIlllIlIIllIIll.length);
                n4 += object.lllIIIllIIIIlllIlIIllIIll.length;
                continue;
            }
            if (!bl || this.IlIIIlIIIIllIIIllIIIIIIll[n3] == null || this.IlIIIlIIIIllIIIllIIIIIIll[n3].IIIllIIlIIIIIIlIlIIllIIlI() == null) continue;
            this.IlIIIlIIIIllIIIllIIIIIIll[n3].lIllllIIlIIIlIllllllIIIll();
        }
        if (bl) {
            System.arraycopy(arrby, n4, this.IIlllIlIlllIllIIIlllIIlIl, 0, this.IIlllIlIlllIllIIIlllIIlIl.length);
            int n5 = n4 + this.IIlllIlIlllIllIIIlllIIlIl.length;
        }
        for (n3 = 0; n3 < this.IlIIIlIIIIllIIIllIIIIIIll.length; ++n3) {
            if (this.IlIIIlIIIIllIIIllIIIIIIll[n3] == null || (n & 1 << n3) == 0) continue;
            this.IlIIIlIIIIllIIIllIIIIIIll[n3].lIlllIlllIIIIlIIlllIllIII();
        }
        this.llIIlllIllIllllIIIlIIIIII = true;
        this.lIIIIlIlIIlllllIIllIIlIII = true;
        this.IlIllllllIIlIIllllIIlIIIl();
        for (class_1774 class_17742 : this.IIIllIllIIlIlIlIlIllllIIl.values()) {
            class_17742.llIIlllIllIllllIIIlIIIIII();
        }
    }

    public class_0672 lllIIIllIIIIlllIlIIllIIll(int n, int n2, class_1076 class_10762) {
        class_0672 class_06722;
        int n3 = this.IIlllIlIlllIllIIIlllIIlIl[n2 << 4 | n] & 0xFF;
        if (n3 == 255 && (class_06722 = class_10762.lllIIIllIIIIlllIlIIllIIll((this.IIIllIIlIIIIIIlIlIIllIIlI << 4) + n, (this.IllIIlllllllIIlIIlIIIIlIl << 4) + n2)) != null) {
            n3 = class_06722.lIlIllIIllIIIIlllIlIlllIl;
            this.IIlllIlIlllIllIIIlllIIlIl[n2 << 4 | n] = (byte)(n3 & 0xFF);
        }
        return class_0672.lIlllIlllIIIIlIIlllIllIII(n3) == null ? class_0672.IlIlIIlIlIllIIlIlIIllIIIl : class_0672.lIlllIlllIIIIlIIlllIllIII(n3);
    }

    public byte[] lIIIIlIlIIlllllIIllIIlIII() {
        return this.IIlllIlIlllIllIIIlllIIlIl;
    }

    public void lllIIIllIIIIlllIlIIllIIll(byte[] arrby) {
        this.IIlllIlIlllIllIIIlllIIlIl = arrby;
    }

    public void llIIlllIllIllllIIIlIIIIII() {
        this.llIIlIllIllllIlIIIIlIIlll = 0;
    }

    public void llIIllIllIlIIlIIllIllllll() {
        for (int i = 0; i < 8; ++i) {
            if (this.llIIlIllIllllIlIIIIlIIlll >= 4096) {
                return;
            }
            int n = this.llIIlIllIllllIlIIIIlIIlll % 16;
            int n2 = this.llIIlIllIllllIlIIIIlIIlll / 16 % 16;
            int n3 = this.llIIlIllIllllIlIIIIlIIlll / 256;
            ++this.llIIlIllIllllIlIIIIlIIlll;
            int n4 = (this.IIIllIIlIIIIIIlIlIIllIIlI << 4) + n2;
            int n5 = (this.IllIIlllllllIIlIIlIIIIlIl << 4) + n3;
            for (int j = 0; j < 16; ++j) {
                int n6 = (n << 4) + j;
                if ((this.IlIIIlIIIIllIIIllIIIIIIll[n] != null || j != 0 && j != 15 && n2 != 0 && n2 != 15 && n3 != 0 && n3 != 15) && (this.IlIIIlIIIIllIIIllIIIIIIll[n] == null || this.IlIIIlIIIIllIIIllIIIIIIll[n].lllIIIllIIIIlllIlIIllIIll(n2, j, n3).lIllllIIlIIIlIllllllIIIll() != class_1855.lllIIIllIIIIlllIlIIllIIll)) continue;
                if (this.IlIIIIIllllllIIlllIllllll.a_(n4, n6 - 1, n5).lIlllIlllIIIIlIIlllIllIII() > 0) {
                    this.IlIIIIIllllllIIlllIllllll.lllllIlllIIllIlIIlIIIllII(n4, n6 - 1, n5);
                }
                if (this.IlIIIIIllllllIIlllIllllll.a_(n4, n6 + 1, n5).lIlllIlllIIIIlIIlllIllIII() > 0) {
                    this.IlIIIIIllllllIIlllIllllll.lllllIlllIIllIlIIlIIIllII(n4, n6 + 1, n5);
                }
                if (this.IlIIIIIllllllIIlllIllllll.a_(n4 - 1, n6, n5).lIlllIlllIIIIlIIlllIllIII() > 0) {
                    this.IlIIIIIllllllIIlllIllllll.lllllIlllIIllIlIIlIIIllII(n4 - 1, n6, n5);
                }
                if (this.IlIIIIIllllllIIlllIllllll.a_(n4 + 1, n6, n5).lIlllIlllIIIIlIIlllIllIII() > 0) {
                    this.IlIIIIIllllllIIlllIllllll.lllllIlllIIllIlIIlIIIllII(n4 + 1, n6, n5);
                }
                if (this.IlIIIIIllllllIIlllIllllll.a_(n4, n6, n5 - 1).lIlllIlllIIIIlIIlllIllIII() > 0) {
                    this.IlIIIIIllllllIIlllIllllll.lllllIlllIIllIlIIlIIIllII(n4, n6, n5 - 1);
                }
                if (this.IlIIIIIllllllIIlllIllllll.a_(n4, n6, n5 + 1).lIlllIlllIIIIlIIlllIllIII() > 0) {
                    this.IlIIIIIllllllIIlllIllllll.lllllIlllIIllIlIIlIIIllII(n4, n6, n5 + 1);
                }
                this.IlIIIIIllllllIIlllIllllll.lllllIlllIIllIlIIlIIIllII(n4, n6, n5);
            }
        }
    }

    public void lllIIlIIIllllllIIIIlIlIlI() {
        this.lIIIIlIlIIlllllIIllIIlIII = true;
        this.llIIlllIllIllllIIIlIIIIII = true;
        if (!this.IlIIIIIllllllIIlllIllllll.IlIlIIlllIIlIllIIIlllllIl.IIIllIIlIIIIIIlIlIIllIIlI) {
            if (this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl(this.IIIllIIlIIIIIIlIlIIllIIlI * 16 - 1, 0, this.IllIIlllllllIIlIIlIIIIlIl * 16 - 1, this.IIIllIIlIIIIIIlIlIIllIIlI * 16 + 1, 63, this.IllIIlllllllIIlIIlIIIIlIl * 16 + 1)) {
                block0: for (int i = 0; i < 16; ++i) {
                    for (int j = 0; j < 16; ++j) {
                        if (this.lIllllIIlIIIlIllllllIIIll(i, j)) continue;
                        this.llIIlllIllIllllIIIlIIIIII = false;
                        continue block0;
                    }
                }
                if (this.llIIlllIllIllllIIIlIIIIII) {
                    class_0723 class_07232 = this.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII(this.IIIllIIlIIIIIIlIlIIllIIlI * 16 - 1, this.IllIIlllllllIIlIIlIIIIlIl * 16);
                    class_07232.lllIIIllIIIIlllIlIIllIIll(3);
                    class_07232 = this.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII(this.IIIllIIlIIIIIIlIlIIllIIlI * 16 + 16, this.IllIIlllllllIIlIIlIIIIlIl * 16);
                    class_07232.lllIIIllIIIIlllIlIIllIIll(1);
                    class_07232 = this.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII(this.IIIllIIlIIIIIIlIlIIllIIlI * 16, this.IllIIlllllllIIlIIlIIIIlIl * 16 - 1);
                    class_07232.lllIIIllIIIIlllIlIIllIIll(0);
                    class_07232 = this.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII(this.IIIllIIlIIIIIIlIlIIllIIlI * 16, this.IllIIlllllllIIlIIlIIIIlIl * 16 + 16);
                    class_07232.lllIIIllIIIIlllIlIIllIIll(2);
                }
            } else {
                this.llIIlllIllIllllIIIlIIIIII = false;
            }
        }
    }

    private void lllIIIllIIIIlllIlIIllIIll(int n) {
        block4: {
            block7: {
                block6: {
                    block5: {
                        if (!this.lIIIIlIlIIlllllIIllIIlIII) break block4;
                        if (n != 3) break block5;
                        for (int i = 0; i < 16; ++i) {
                            this.lIllllIIlIIIlIllllllIIIll(15, i);
                        }
                        break block4;
                    }
                    if (n != 1) break block6;
                    for (int i = 0; i < 16; ++i) {
                        this.lIllllIIlIIIlIllllllIIIll(0, i);
                    }
                    break block4;
                }
                if (n != 0) break block7;
                for (int i = 0; i < 16; ++i) {
                    this.lIllllIIlIIIlIllllllIIIll(i, 15);
                }
                break block4;
            }
            if (n != 2) break block4;
            for (int i = 0; i < 16; ++i) {
                this.lIllllIIlIIIlIllllllIIIll(i, 0);
            }
        }
    }

    private boolean lIllllIIlIIIlIllllllIIIll(int n, int n2) {
        int n3;
        int n4 = this.lllIIIllIIIIlllIlIIllIIll();
        boolean bl = false;
        boolean bl2 = false;
        for (n3 = n4 + 16 - 1; n3 > 63 || n3 > 0 && !bl2; --n3) {
            int n5 = this.lllIIIllIIIIlllIlIIllIIll(n, n3, n2);
            if (n5 == 255 && n3 < 63) {
                bl2 = true;
            }
            if (!bl && n5 > 0) {
                bl = true;
                continue;
            }
            if (!bl || n5 != 0 || this.IlIIIIIllllllIIlllIllllll.lllllIlllIIllIlIIlIIIllII(this.IIIllIIlIIIIIIlIlIIllIIlI * 16 + n, n3, this.IllIIlllllllIIlIIlIIIIlIl * 16 + n2)) continue;
            return false;
        }
        while (n3 > 0) {
            if (this.lllIlIIlIIIlIlIIIllIlllIl(n, n3, n2).lIlllIlllIIIIlIIlllIllIII() > 0) {
                this.IlIIIIIllllllIIlllIllllll.lllllIlllIIllIlIIlIIIllII(this.IIIllIIlIIIIIIlIlIIllIIlI * 16 + n, n3, this.IllIIlllllllIIlIIlIIIIlIl * 16 + n2);
            }
            --n3;
        }
        return true;
    }
}

