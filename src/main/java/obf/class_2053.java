package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.io.IOException;
import java.util.List;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

public class class_2053
extends class_0703 {
    private int[] lllIIIllIIIIlllIlIIllIIll;
    private int[] lllIlIIlIIIlIlIIIllIlllIl;
    private int[] IlIllllllIIlIIllllIIlIIIl;
    private int[] lIlllIlllIIIIlIIlllIllIII;
    private byte[] IlIIIIIllllllIIlllIllllll;
    private byte[][] lIllllIIlIIIlIllllllIIIll;
    private int IIIllIIlIIIIIIlIlIIllIIlI;
    private boolean IllIIlllllllIIlIIlIIIIlIl;
    private static byte[] IIIllIllIIlIlIlIlIllllIIl = new byte[0];

    public class_2053() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public class_2053(List list) {
        int n = list.size();
        this.lllIIIllIIIIlllIlIIllIIll = new int[n];
        this.lllIlIIlIIIlIlIIIllIlllIl = new int[n];
        this.IlIllllllIIlIIllllIIlIIIl = new int[n];
        this.lIlllIlllIIIIlIIlllIllIII = new int[n];
        this.lIllllIIlIIIlIllllllIIIll = new byte[n][];
        this.IllIIlllllllIIlIIlIIIIlIl = !list.isEmpty() && !((class_0723)list.get((int)0)).IlIIIIIllllllIIlllIllllll.IlIlIIlllIIlIllIIIlllllIl.IIIllIIlIIIIIIlIlIIllIIlI;
        int n2 = 0;
        for (int i = 0; i < n; ++i) {
            class_0723 class_07232 = (class_0723)list.get(i);
            class_0537 class_05372 = class_0150.lllIIIllIIIIlllIlIIllIIll(class_07232, true, 65535);
            if (IIIllIllIIlIlIlIlIllllIIl.length < n2 + class_05372.lllIIIllIIIIlllIlIIllIIll.length) {
                byte[] arrby = new byte[n2 + class_05372.lllIIIllIIIIlllIlIIllIIll.length];
                System.arraycopy(IIIllIllIIlIlIlIlIllllIIl, 0, arrby, 0, IIIllIllIIlIlIlIlIllllIIl.length);
                IIIllIllIIlIlIlIlIllllIIl = arrby;
            }
            System.arraycopy(class_05372.lllIIIllIIIIlllIlIIllIIll, 0, IIIllIllIIlIlIlIlIllllIIl, n2, class_05372.lllIIIllIIIIlllIlIIllIIll.length);
            n2 += class_05372.lllIIIllIIIIlllIlIIllIIll.length;
            this.lllIIIllIIIIlllIlIIllIIll[i] = class_07232.IIIllIIlIIIIIIlIlIIllIIlI;
            this.lllIlIIlIIIlIlIIIllIlllIl[i] = class_07232.IllIIlllllllIIlIIlIIIIlIl;
            this.IlIllllllIIlIIllllIIlIIIl[i] = class_05372.lllIlIIlIIIlIlIIIllIlllIl;
            this.lIlllIlllIIIIlIIlllIllIII[i] = class_05372.IlIllllllIIlIIllllIIlIIIl;
            this.lIllllIIlIIIlIllllllIIIll[i] = class_05372.lllIIIllIIIIlllIlIIllIIll;
        }
        Deflater deflater = new Deflater(-1);
        try {
            deflater.setInput(IIIllIllIIlIlIlIlIllllIIl, 0, n2);
            deflater.finish();
            this.IlIIIIIllllllIIlllIllllll = new byte[n2];
            this.IIIllIIlIIIIIIlIlIIllIIlI = deflater.deflate(this.IlIIIIIllllllIIlllIllllll);
        }
        finally {
            deflater.end();
        }
    }

    public static int IlIllllllIIlIIllllIIlIIIl() {
        return 5;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0181 class_01812) {
        int n = class_01812.readShort();
        this.IIIllIIlIIIIIIlIlIIllIIlI = class_01812.readInt();
        this.IllIIlllllllIIlIIlIIIIlIl = class_01812.readBoolean();
        this.lllIIIllIIIIlllIlIIllIIll = new int[n];
        this.lllIlIIlIIIlIlIIIllIlllIl = new int[n];
        this.IlIllllllIIlIIllllIIlIIIl = new int[n];
        this.lIlllIlllIIIIlIIlllIllIII = new int[n];
        this.lIllllIIlIIIlIllllllIIIll = new byte[n][];
        if (IIIllIllIIlIlIlIlIllllIIl.length < this.IIIllIIlIIIIIIlIlIIllIIlI) {
            IIIllIllIIlIlIlIlIllllIIl = new byte[this.IIIllIIlIIIIIIlIlIIllIIlI];
        }
        class_01812.readBytes(IIIllIllIIlIlIlIlIllllIIl, 0, this.IIIllIIlIIIIIIlIlIIllIIlI);
        byte[] arrby = new byte[class_0150.IlIllllllIIlIIllllIIlIIIl() * n];
        Inflater inflater = new Inflater();
        inflater.setInput(IIIllIllIIlIlIlIlIllllIIl, 0, this.IIIllIIlIIIIIIlIlIIllIIlI);
        try {
            inflater.inflate(arrby);
        }
        catch (DataFormatException dataFormatException) {
            throw new IOException("Bad compressed data format");
        }
        finally {
            inflater.end();
        }
        int n2 = 0;
        for (int i = 0; i < n; ++i) {
            int n3;
            this.lllIIIllIIIIlllIlIIllIIll[i] = class_01812.readInt();
            this.lllIlIIlIIIlIlIIIllIlllIl[i] = class_01812.readInt();
            this.IlIllllllIIlIIllllIIlIIIl[i] = class_01812.readShort();
            this.lIlllIlllIIIIlIIlllIllIII[i] = class_01812.readShort();
            int n4 = 0;
            int n5 = 0;
            for (n3 = 0; n3 < 16; ++n3) {
                n4 += this.IlIllllllIIlIIllllIIlIIIl[i] >> n3 & 1;
                n5 += this.lIlllIlllIIIIlIIlllIllIII[i] >> n3 & 1;
            }
            n3 = 8192 * n4 + 256;
            n3 += 2048 * n5;
            if (this.IllIIlllllllIIlIIlIIIIlIl) {
                n3 += 2048 * n4;
            }
            this.lIllllIIlIIIlIllllllIIIll[i] = new byte[n3];
            System.arraycopy(arrby, n2, this.lIllllIIlIIIlIllllllIIIll[i], 0, n3);
            n2 += n3;
        }
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0181 class_01812) {
        class_01812.writeShort(this.lllIIIllIIIIlllIlIIllIIll.length);
        class_01812.writeInt(this.IIIllIIlIIIIIIlIlIIllIIlI);
        class_01812.writeBoolean(this.IllIIlllllllIIlIIlIIIIlIl);
        class_01812.writeBytes(this.IlIIIIIllllllIIlllIllllll, 0, this.IIIllIIlIIIIIIlIlIIllIIlI);
        for (int i = 0; i < this.lllIIIllIIIIlllIlIIllIIll.length; ++i) {
            class_01812.writeInt(this.lllIIIllIIIIlllIlIIllIIll[i]);
            class_01812.writeInt(this.lllIlIIlIIIlIlIIIllIlllIl[i]);
            class_01812.writeShort((short)(this.IlIllllllIIlIIllllIIlIIIl[i] & 0xFFFF));
            class_01812.writeShort((short)(this.lIlllIlllIIIIlIIlllIllIII[i] & 0xFFFF));
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0596 class_05962) {
        class_05962.lllIIIllIIIIlllIlIIllIIll(this);
    }

    public int lllIIIllIIIIlllIlIIllIIll(int n) {
        return this.lllIIIllIIIIlllIlIIllIIll[n];
    }

    public int lllIlIIlIIIlIlIIIllIlllIl(int n) {
        return this.lllIlIIlIIIlIlIIIllIlllIl[n];
    }

    public int lIlllIlllIIIIlIIlllIllIII() {
        return this.lllIIIllIIIIlllIlIIllIIll.length;
    }

    public byte[] IlIllllllIIlIIllllIIlIIIl(int n) {
        return this.lIllllIIlIIIlIllllllIIIll[n];
    }

    @Override
    public String lllIlIIlIIIlIlIIIllIlllIl() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < this.lllIIIllIIIIlllIlIIllIIll.length; ++i) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(String.format("{x=%d, z=%d, sections=%d, adds=%d, data=%d}", this.lllIIIllIIIIlllIlIIllIIll[i], this.lllIlIIlIIIlIlIIIllIlllIl[i], this.IlIllllllIIlIIllllIIlIIIl[i], this.lIlllIlllIIIIlIIlllIllIII[i], this.lIllllIIlIIIlIllllllIIIll[i].length));
        }
        return String.format("size=%d, chunks=%d[%s]", this.IIIllIIlIIIIIIlIlIIllIIlI, this.lllIIIllIIIIlllIlIIllIIll.length, stringBuilder);
    }

    public int[] IlIIIIIllllllIIlllIllllll() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public int[] lIllllIIlIIIlIllllllIIIll() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_2075 class_20752) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0596)class_20752);
    }
}

