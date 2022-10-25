package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.awt.Dimension;
import java.nio.IntBuffer;
import java.util.ArrayList;

import optifine.Config;
import org.lwjgl.opengl.GL11;

public class class_1348 {
    private final String lllIIIllIIIIlllIlIIllIIll;
    private final int lllIlIIlIIIlIlIIIllIlllIl;
    private final int IlIllllllIIlIIllllIIlIIIl;
    private final int[] lIlllIlllIIIIlIIlllIllIII;
    private final boolean IlIIIIIllllllIIlllIllllll;
    private int[][] lIllllIIlIIIlIllllllIIIll;
    private IntBuffer[] IIIllIIlIIIIIIlIlIIllIIlI;
    private Dimension[] IllIIlllllllIIlIIlIIIIlIl;

    public class_1348(String string, int n, int n2, int[] arrn, boolean bl) {
        this.lllIIIllIIIIlllIlIIllIIll = string;
        this.lllIlIIlIIIlIlIIIllIlllIl = n;
        this.IlIllllllIIlIIllllIIlIIIl = n2;
        this.lIlllIlllIIIIlIIlllIllIII = arrn;
        this.IlIIIIIllllllIIlllIllllll = bl;
        this.IllIIlllllllIIlIIlIIIIlIl = class_1348.lllIIIllIIIIlllIlIIllIIll(n, n2, string);
        this.lIllllIIlIIIlIllllllIIIll = class_1348.lllIIIllIIIIlllIlIIllIIll(arrn, n, n2, this.IllIIlllllllIIlIIlIIIIlIl);
        if (bl) {
            this.IIIllIIlIIIIIIlIlIIllIIlI = class_1348.lllIIIllIIIIlllIlIIllIIll(this.IllIIlllllllIIlIIlIIIIlIl, this.lIllllIIlIIIlIllllllIIIll);
        }
    }

    public static Dimension[] lllIIIllIIIIlllIlIIllIIll(int n, int n2, String string) {
        int n3 = class_1384.lllIIIllIIIIlllIlIIllIIll(n);
        int n4 = class_1384.lllIIIllIIIIlllIlIIllIIll(n2);
        if (n3 == n && n4 == n2) {
            ArrayList<Dimension> arrayList = new ArrayList<Dimension>();
            int n5 = n3;
            int n6 = n4;
            while (true) {
                if ((n5 /= 2) <= 0 && (n6 /= 2) <= 0) {
                    Dimension[] arrdimension = arrayList.toArray(new Dimension[arrayList.size()]);
                    return arrdimension;
                }
                if (n5 <= 0) {
                    n5 = 1;
                }
                if (n6 <= 0) {
                    n6 = 1;
                }
                int n7 = n5 * n6 * 4;
                Dimension dimension = new Dimension(n5, n6);
                arrayList.add(dimension);
            }
        }
        Config.lllIlIIlIIIlIlIIIllIlllIl("Mipmaps not possible (power of 2 dimensions needed), texture: " + string + ", dim: " + n + "x" + n2);
        return new Dimension[0];
    }

    public static int[][] lllIIIllIIIIlllIlIIllIIll(int[] arrn, int n, int n2, Dimension[] arrdimension) {
        int[] arrn2 = arrn;
        int n3 = n;
        boolean bl = true;
        int[][] arrarrn = new int[arrdimension.length][];
        for (int i = 0; i < arrdimension.length; ++i) {
            Dimension dimension = arrdimension[i];
            int n4 = dimension.width;
            int n5 = dimension.height;
            int[] arrn3 = new int[n4 * n5];
            arrarrn[i] = arrn3;
            int n6 = i + 1;
            if (bl) {
                for (int j = 0; j < n4; ++j) {
                    for (int k = 0; k < n5; ++k) {
                        int n7;
                        int n8 = arrn2[j * 2 + 0 + (k * 2 + 0) * n3];
                        int n9 = arrn2[j * 2 + 1 + (k * 2 + 0) * n3];
                        int n10 = arrn2[j * 2 + 1 + (k * 2 + 1) * n3];
                        int n11 = arrn2[j * 2 + 0 + (k * 2 + 1) * n3];
                        arrn3[j + k * n4] = n7 = class_1348.lllIIIllIIIIlllIlIIllIIll(n8, n9, n10, n11);
                    }
                }
            }
            arrn2 = arrn3;
            n3 = n4;
            if (n4 > 1 && n5 > 1) continue;
            bl = false;
        }
        return arrarrn;
    }

    public static int lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4) {
        int n5 = class_1348.lllIIIllIIIIlllIlIIllIIll(n, n2);
        int n6 = class_1348.lllIIIllIIIIlllIlIIllIIll(n3, n4);
        int n7 = class_1348.lllIIIllIIIIlllIlIIllIIll(n5, n6);
        return n7;
    }

    private static int lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        int n3 = (n & 0xFF000000) >> 24 & 0xFF;
        int n4 = (n2 & 0xFF000000) >> 24 & 0xFF;
        int n5 = (n3 + n4) / 2;
        if (n3 == 0 && n4 == 0) {
            n3 = 1;
            n4 = 1;
        } else {
            if (n3 == 0) {
                n = n2;
                n5 /= 2;
            }
            if (n4 == 0) {
                n2 = n;
                n5 /= 2;
            }
        }
        int n6 = (n >> 16 & 0xFF) * n3;
        int n7 = (n >> 8 & 0xFF) * n3;
        int n8 = (n & 0xFF) * n3;
        int n9 = (n2 >> 16 & 0xFF) * n4;
        int n10 = (n2 >> 8 & 0xFF) * n4;
        int n11 = (n2 & 0xFF) * n4;
        int n12 = (n6 + n9) / (n3 + n4);
        int n13 = (n7 + n10) / (n3 + n4);
        int n14 = (n8 + n11) / (n3 + n4);
        return n5 << 24 | n12 << 16 | n13 << 8 | n14;
    }

    private int lllIlIIlIIIlIlIIIllIlllIl(int n, int n2) {
        int n3 = (n & 0xFF000000) >> 24 & 0xFF;
        int n4 = (n2 & 0xFF000000) >> 24 & 0xFF;
        return (n3 + n4 >> 1 << 24) + ((n & 0xFEFEFE) + (n2 & 0xFEFEFE) >> 1);
    }

    public static IntBuffer[] lllIIIllIIIIlllIlIIllIIll(Dimension[] arrdimension, int[][] arrn) {
        if (arrdimension == null) {
            return null;
        }
        IntBuffer[] arrintBuffer = new IntBuffer[arrdimension.length];
        for (int i = 0; i < arrdimension.length; ++i) {
            Dimension dimension = arrdimension[i];
            int n = dimension.width * dimension.height;
            IntBuffer intBuffer = class_0994.lIlllIlllIIIIlIIlllIllIII(n);
            int[] arrn2 = arrn[i];
            intBuffer.clear();
            intBuffer.put(arrn2);
            intBuffer.clear();
            arrintBuffer[i] = intBuffer;
        }
        return arrintBuffer;
    }

    public static void lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, String string) {
        Dimension[] arrdimension = class_1348.lllIIIllIIIIlllIlIIllIIll(n, n2, string);
        for (int i = 0; i < arrdimension.length; ++i) {
            Dimension dimension = arrdimension[i];
            int n3 = dimension.width;
            int n4 = dimension.height;
            int n5 = i + 1;
            GL11.glTexImage2D((int)3553, (int)n5, (int)6408, (int)n3, (int)n4, (int)0, (int)32993, (int)33639, (IntBuffer)null);
        }
    }
}

