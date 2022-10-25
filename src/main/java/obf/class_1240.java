package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.MathHelper;

import java.util.Random;

public class class_1240
extends class_1174 {
    static final byte[] lllIIIllIIIIlllIlIIllIIll = new byte[]{2, 0, 0, 1, 2, 1};
    Random lllIlIIlIIIlIlIIIllIlllIl = new Random();
    class_1334 IlIllllllIIlIIllllIIlIIIl;
    int[] lIlllIlllIIIIlIIlllIllIII = new int[]{0, 0, 0};
    int IlIIIIIllllllIIlllIllllll;
    int lIllllIIlIIIlIllllllIIIll;
    double IIIllIIlIIIIIIlIlIIllIIlI = 0.618;
    double IllIIlllllllIIlIIlIIIIlIl = 1.0;
    double IIIllIllIIlIlIlIlIllllIIl = 0.381;
    double IllIIIllIIIIlIlIlIllIIlll = 1.0;
    double lIIIIlIlIIlllllIIllIIlIII = 1.0;
    int llIIlllIllIllllIIIlIIIIII = 1;
    int llIIllIllIlIIlIIllIllllll = 12;
    int lllIIlIIIllllllIIIIlIlIlI = 4;
    int[][] IlIlllIIIIIIlIIllIIllIlll;

    public class_1240(boolean bl) {
        super(bl);
    }

    void lllIIIllIIIIlllIlIIllIIll() {
        int n;
        this.lIllllIIlIIIlIllllllIIIll = (int)((double)this.IlIIIIIllllllIIlllIllllll * this.IIIllIIlIIIIIIlIlIIllIIlI);
        if (this.lIllllIIlIIIlIllllllIIIll >= this.IlIIIIIllllllIIlllIllllll) {
            this.lIllllIIlIIIlIllllllIIIll = this.IlIIIIIllllllIIlllIllllll - 1;
        }
        if ((n = (int)(1.382 + Math.pow(this.lIIIIlIlIIlllllIIllIIlIII * (double)this.IlIIIIIllllllIIlllIllllll / 13.0, 2.0))) < 1) {
            n = 1;
        }
        int[][] arrn = new int[n * this.IlIIIIIllllllIIlllIllllll][4];
        int n2 = this.lIlllIlllIIIIlIIlllIllIII[1] + this.IlIIIIIllllllIIlllIllllll - this.lllIIlIIIllllllIIIIlIlIlI;
        int n3 = 1;
        int n4 = this.lIlllIlllIIIIlIIlllIllIII[1] + this.lIllllIIlIIIlIllllllIIIll;
        int n5 = n2 - this.lIlllIlllIIIIlIIlllIllIII[1];
        arrn[0][0] = this.lIlllIlllIIIIlIIlllIllIII[0];
        arrn[0][1] = n2--;
        arrn[0][2] = this.lIlllIlllIIIIlIIlllIllIII[2];
        arrn[0][3] = n4;
        while (n5 >= 0) {
            float f = this.lllIIIllIIIIlllIlIIllIIll(n5);
            if (f < 0.0f) {
                --n2;
                --n5;
                continue;
            }
            double d = 0.5;
            for (int i = 0; i < n; ++i) {
                double d2 = this.IllIIIllIIIIlIlIlIllIIlll * (double)f * ((double)this.lllIlIIlIIIlIlIIIllIlllIl.nextFloat() + 0.328);
                double d3 = (double)this.lllIlIIlIIIlIlIIIllIlllIl.nextFloat() * 2.0 * Math.PI;
                int n6 = MathHelper.IlIllllllIIlIIllllIIlIIIl(d2 * Math.sin(d3) + (double)this.lIlllIlllIIIIlIIlllIllIII[0] + d);
                int n7 = MathHelper.IlIllllllIIlIIllllIIlIIIl(d2 * Math.cos(d3) + (double)this.lIlllIlllIIIIlIIlllIllIII[2] + d);
                int[] arrn2 = new int[]{n6, n2, n7};
                int[] arrn3 = new int[]{n6, n2 + this.lllIIlIIIllllllIIIIlIlIlI, n7};
                if (this.lllIIIllIIIIlllIlIIllIIll(arrn2, arrn3) != -1) continue;
                int[] arrn4 = new int[]{this.lIlllIlllIIIIlIIlllIllIII[0], this.lIlllIlllIIIIlIIlllIllIII[1], this.lIlllIlllIIIIlIIlllIllIII[2]};
                double d4 = Math.sqrt(Math.pow(Math.abs(this.lIlllIlllIIIIlIIlllIllIII[0] - arrn2[0]), 2.0) + Math.pow(Math.abs(this.lIlllIlllIIIIlIIlllIllIII[2] - arrn2[2]), 2.0));
                double d5 = d4 * this.IIIllIllIIlIlIlIlIllllIIl;
                arrn4[1] = (double)arrn2[1] - d5 > (double)n4 ? n4 : (int)((double)arrn2[1] - d5);
                if (this.lllIIIllIIIIlllIlIIllIIll(arrn4, arrn2) != -1) continue;
                arrn[n3][0] = n6;
                arrn[n3][1] = n2;
                arrn[n3][2] = n7;
                arrn[n3][3] = arrn4[1];
                ++n3;
            }
            --n2;
            --n5;
        }
        this.IlIlllIIIIIIlIIllIIllIlll = new int[n3][4];
        System.arraycopy(arrn, 0, this.IlIlllIIIIIIlIIllIIllIlll, 0, n3);
    }

    void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, float f, byte by, Block class_05492) {
        int n4 = (int)((double)f + 0.618);
        byte by2 = lllIIIllIIIIlllIlIIllIIll[by];
        byte by3 = lllIIIllIIIIlllIlIIllIIll[by + 3];
        int[] arrn = new int[]{n, n2, n3};
        int[] arrn2 = new int[]{0, 0, 0};
        int n5 = -n4;
        arrn2[by] = arrn[by];
        for (int i = -n4; i <= n4; ++i) {
            arrn2[by2] = arrn[by2] + i;
            n5 = -n4;
            while (n5 <= n4) {
                double d = Math.pow((double)Math.abs(i) + 0.5, 2.0) + Math.pow((double)Math.abs(n5) + 0.5, 2.0);
                if (d > (double)(f * f)) {
                    ++n5;
                    continue;
                }
                arrn2[by3] = arrn[by3] + n5;
                Block class_05493 = this.IlIllllllIIlIIllllIIlIIIl.a_(arrn2[0], arrn2[1], arrn2[2]);
                if (class_05493.lIllllIIlIIIlIllllllIIIll() != class_1855.lllIIIllIIIIlllIlIIllIIll && class_05493.lIllllIIlIIIlIllllllIIIll() != class_1855.IllIIIllIIIIlIlIlIllIIlll) {
                    ++n5;
                    continue;
                }
                this.lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl, arrn2[0], arrn2[1], arrn2[2], class_05492, 0);
                ++n5;
            }
        }
    }

    float lllIIIllIIIIlllIlIIllIIll(int n) {
        if ((double)n < (double)this.IlIIIIIllllllIIlllIllllll * 0.3) {
            return -1.618f;
        }
        float f = (float)this.IlIIIIIllllllIIlllIllllll / 2.0f;
        float f2 = (float)this.IlIIIIIllllllIIlllIllllll / 2.0f - (float)n;
        float f3 = f2 == 0.0f ? f : (Math.abs(f2) >= f ? 0.0f : (float)Math.sqrt(Math.pow(Math.abs(f), 2.0) - Math.pow(Math.abs(f2), 2.0)));
        return f3 *= 0.5f;
    }

    float lllIlIIlIIIlIlIIIllIlllIl(int n) {
        return n >= 0 && n < this.lllIIlIIIllllllIIIIlIlIlI ? (n != 0 && n != this.lllIIlIIIllllllIIIIlIlIlI - 1 ? 3.0f : 2.0f) : -1.0f;
    }

    void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        int n4 = n2 + this.lllIIlIIIllllllIIIIlIlIlI;
        for (int i = n2; i < n4; ++i) {
            float f = this.lllIlIIlIIIlIlIIIllIlllIl(i - n2);
            this.lllIIIllIIIIlllIlIIllIIll(n, i, n3, f, (byte)1, Blocks.lIlIlIIlIIIIlIIIIIlllIIII);
        }
    }

    void lllIIIllIIIIlllIlIIllIIll(int[] arrn, int[] arrn2, Block class_05492) {
        int[] arrn3 = new int[]{0, 0, 0};
        int n = 0;
        for (int n2 = 0; n2 < 3; n2 = (int)((byte)(n2 + 1))) {
            arrn3[n2] = arrn2[n2] - arrn[n2];
            if (Math.abs(arrn3[n2]) <= Math.abs(arrn3[n])) continue;
            n = n2;
        }
        if (arrn3[n] != 0) {
            byte by = lllIIIllIIIIlllIlIIllIIll[n];
            byte by2 = lllIIIllIIIIlllIlIIllIIll[n + 3];
            int n3 = arrn3[n] > 0 ? 1 : -1;
            double d = (double)arrn3[by] / (double)arrn3[n];
            double d2 = (double)arrn3[by2] / (double)arrn3[n];
            int[] arrn4 = new int[]{0, 0, 0};
            int n4 = arrn3[n] + n3;
            for (int i = 0; i != n4; i += n3) {
                int n5;
                arrn4[n] = MathHelper.IlIllllllIIlIIllllIIlIIIl((double)(arrn[n] + i) + 0.5);
                arrn4[by] = MathHelper.IlIllllllIIlIIllllIIlIIIl((double)arrn[by] + (double)i * d + 0.5);
                arrn4[by2] = MathHelper.IlIllllllIIlIIllllIIlIIIl((double)arrn[by2] + (double)i * d2 + 0.5);
                int n6 = 0;
                int n7 = Math.abs(arrn4[0] - arrn[0]);
                int n8 = Math.max(n7, n5 = Math.abs(arrn4[2] - arrn[2]));
                if (n8 > 0) {
                    if (n7 == n8) {
                        n6 = 4;
                    } else if (n5 == n8) {
                        n6 = 8;
                    }
                }
                this.lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl, arrn4[0], arrn4[1], arrn4[2], class_05492, n6);
            }
        }
    }

    void lllIlIIlIIIlIlIIIllIlllIl() {
        int n = this.IlIlllIIIIIIlIIllIIllIlll.length;
        for (int i = 0; i < n; ++i) {
            int n2 = this.IlIlllIIIIIIlIIllIIllIlll[i][0];
            int n3 = this.IlIlllIIIIIIlIIllIIllIlll[i][1];
            int n4 = this.IlIlllIIIIIIlIIllIIllIlll[i][2];
            this.lllIIIllIIIIlllIlIIllIIll(n2, n3, n4);
        }
    }

    boolean IlIllllllIIlIIllllIIlIIIl(int n) {
        return (double)n >= (double)this.IlIIIIIllllllIIlllIllllll * 0.2;
    }

    void IlIllllllIIlIIllllIIlIIIl() {
        int n = this.lIlllIlllIIIIlIIlllIllIII[0];
        int n2 = this.lIlllIlllIIIIlIIlllIllIII[1];
        int n3 = this.lIlllIlllIIIIlIIlllIllIII[1] + this.lIllllIIlIIIlIllllllIIIll;
        int n4 = this.lIlllIlllIIIIlIIlllIllIII[2];
        int[] arrn = new int[]{n, n2, n4};
        int[] arrn2 = new int[]{n, n3, n4};
        this.lllIIIllIIIIlllIlIIllIIll(arrn, arrn2, Blocks.log);
        if (this.llIIlllIllIllllIIIlIIIIII == 2) {
            arrn[0] = arrn[0] + 1;
            arrn2[0] = arrn2[0] + 1;
            this.lllIIIllIIIIlllIlIIllIIll(arrn, arrn2, Blocks.log);
            arrn[2] = arrn[2] + 1;
            arrn2[2] = arrn2[2] + 1;
            this.lllIIIllIIIIlllIlIIllIIll(arrn, arrn2, Blocks.log);
            arrn[0] = arrn[0] + -1;
            arrn2[0] = arrn2[0] + -1;
            this.lllIIIllIIIIlllIlIIllIIll(arrn, arrn2, Blocks.log);
        }
    }

    void lIlllIlllIIIIlIIlllIllIII() {
        int n = this.IlIlllIIIIIIlIIllIIllIlll.length;
        int[] arrn = new int[]{this.lIlllIlllIIIIlIIlllIllIII[0], this.lIlllIlllIIIIlIIlllIllIII[1], this.lIlllIlllIIIIlIIlllIllIII[2]};
        for (int i = 0; i < n; ++i) {
            int[] arrn2 = this.IlIlllIIIIIIlIIllIIllIlll[i];
            int[] arrn3 = new int[]{arrn2[0], arrn2[1], arrn2[2]};
            arrn[1] = arrn2[3];
            int n2 = arrn[1] - this.lIlllIlllIIIIlIIlllIllIII[1];
            if (!this.IlIllllllIIlIIllllIIlIIIl(n2)) continue;
            this.lllIIIllIIIIlllIlIIllIIll(arrn, arrn3, Blocks.log);
        }
    }

    int lllIIIllIIIIlllIlIIllIIll(int[] arrn, int[] arrn2) {
        int n;
        int[] arrn3 = new int[]{0, 0, 0};
        int n2 = 0;
        for (int n3 = 0; n3 < 3; n3 = (int)((byte)(n3 + 1))) {
            arrn3[n3] = arrn2[n3] - arrn[n3];
            if (Math.abs(arrn3[n3]) <= Math.abs(arrn3[n2])) continue;
            n2 = n3;
        }
        if (arrn3[n2] == 0) {
            return -1;
        }
        byte by = lllIIIllIIIIlllIlIIllIIll[n2];
        byte by2 = lllIIIllIIIIlllIlIIllIIll[n2 + 3];
        int n4 = arrn3[n2] > 0 ? 1 : -1;
        double d = (double)arrn3[by] / (double)arrn3[n2];
        double d2 = (double)arrn3[by2] / (double)arrn3[n2];
        int[] arrn4 = new int[]{0, 0, 0};
        int n5 = arrn3[n2] + n4;
        for (n = 0; n != n5; n += n4) {
            arrn4[n2] = arrn[n2] + n;
            arrn4[by] = MathHelper.IlIllllllIIlIIllllIIlIIIl((double)arrn[by] + (double)n * d);
            arrn4[by2] = MathHelper.IlIllllllIIlIIllllIIlIIIl((double)arrn[by2] + (double)n * d2);
            Block class_05492 = this.IlIllllllIIlIIllllIIlIIIl.a_(arrn4[0], arrn4[1], arrn4[2]);
            if (!this.lllIIIllIIIIlllIlIIllIIll(class_05492)) break;
        }
        return n == n5 ? -1 : Math.abs(n);
    }

    boolean IlIIIIIllllllIIlllIllllll() {
        int[] arrn = new int[]{this.lIlllIlllIIIIlIIlllIllIII[0], this.lIlllIlllIIIIlIIlllIllIII[1], this.lIlllIlllIIIIlIIlllIllIII[2]};
        int[] arrn2 = new int[]{this.lIlllIlllIIIIlIIlllIllIII[0], this.lIlllIlllIIIIlIIlllIllIII[1] + this.IlIIIIIllllllIIlllIllllll - 1, this.lIlllIlllIIIIlIIlllIllIII[2]};
        Block class_05492 = this.IlIllllllIIlIIllllIIlIIIl.a_(this.lIlllIlllIIIIlIIlllIllIII[0], this.lIlllIlllIIIIlIIlllIllIII[1] - 1, this.lIlllIlllIIIIlIIlllIllIII[2]);
        if (class_05492 != Blocks.lIlllIlllIIIIlIIlllIllIII && class_05492 != Blocks.IlIllllllIIlIIllllIIlIIIl && class_05492 != Blocks.IIIlIlIllIlllllIlIllllllI) {
            return false;
        }
        int n = this.lllIIIllIIIIlllIlIIllIIll(arrn, arrn2);
        if (n == -1) {
            return true;
        }
        if (n < 6) {
            return false;
        }
        this.IlIIIIIllllllIIlllIllllll = n;
        return true;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(double d, double d2, double d3) {
        this.llIIllIllIlIIlIIllIllllll = (int)(d * 12.0);
        if (d > 0.5) {
            this.lllIIlIIIllllllIIIIlIlIlI = 5;
        }
        this.IllIIIllIIIIlIlIlIllIIlll = d2;
        this.lIIIIlIlIIlllllIIllIIlIII = d3;
    }

    @Override
    public boolean a_(class_1334 class_13342, Random random, int n, int n2, int n3) {
        this.IlIllllllIIlIIllllIIlIIIl = class_13342;
        long l = random.nextLong();
        this.lllIlIIlIIIlIlIIIllIlllIl.setSeed(l);
        this.lIlllIlllIIIIlIIlllIllIII[0] = n;
        this.lIlllIlllIIIIlIIlllIllIII[1] = n2;
        this.lIlllIlllIIIIlIIlllIllIII[2] = n3;
        if (this.IlIIIIIllllllIIlllIllllll == 0) {
            this.IlIIIIIllllllIIlllIllllll = 5 + this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(this.llIIllIllIlIIlIIllIllllll);
        }
        if (!this.IlIIIIIllllllIIlllIllllll()) {
            return false;
        }
        this.lllIIIllIIIIlllIlIIllIIll();
        this.lllIlIIlIIIlIlIIIllIlllIl();
        this.IlIllllllIIlIIllllIIlIIIl();
        this.lIlllIlllIIIIlIIlllIllIII();
        return true;
    }
}

