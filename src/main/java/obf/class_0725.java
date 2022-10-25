package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.MathHelper;

import java.util.Random;

public class class_0725
extends class_1000 {
    private float[] lIlllIlllIIIIlIIlllIllIII = new float[1024];

    protected void lllIIIllIIIIlllIlIIllIIll(long l, int n, int n2, Block[] arrclass_0549, double d, double d2, double d3, float f, float f2, float f3, int n3, int n4, double d4) {
        int n5;
        Random random = new Random(l);
        double d5 = n * 16 + 8;
        double d6 = n2 * 16 + 8;
        float f4 = 0.0f;
        float f5 = 0.0f;
        if (n4 <= 0) {
            n5 = this.lllIIIllIIIIlllIlIIllIIll * 16 - 16;
            n4 = n5 - random.nextInt(n5 / 4);
        }
        n5 = 0;
        if (n3 == -1) {
            n3 = n4 / 2;
            n5 = 1;
        }
        float f6 = 1.0f;
        for (int i = 0; i < 256; ++i) {
            if (i == 0 || random.nextInt(3) == 0) {
                f6 = 1.0f + random.nextFloat() * random.nextFloat() * 1.0f;
            }
            this.lIlllIlllIIIIlIIlllIllIII[i] = f6 * f6;
        }
        while (n3 < n4) {
            double d7 = 1.5 + (double)(MathHelper.lllIIIllIIIIlllIlIIllIIll((float)n3 * (float)Math.PI / (float)n4) * f * 1.0f);
            double d8 = d7 * d4;
            d7 *= (double)random.nextFloat() * 0.25 + 0.75;
            d8 *= (double)random.nextFloat() * 0.25 + 0.75;
            float f7 = MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f3);
            float f8 = MathHelper.lllIIIllIIIIlllIlIIllIIll(f3);
            d += (double)(MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f2) * f7);
            d2 += (double)f8;
            d3 += (double)(MathHelper.lllIIIllIIIIlllIlIIllIIll(f2) * f7);
            f3 *= 0.7f;
            f3 += f5 * 0.05f;
            f2 += f4 * 0.05f;
            f5 *= 0.8f;
            f4 *= 0.5f;
            f5 += (random.nextFloat() - random.nextFloat()) * random.nextFloat() * 2.0f;
            f4 += (random.nextFloat() - random.nextFloat()) * random.nextFloat() * 4.0f;
            if (n5 != 0 || random.nextInt(4) != 0) {
                double d9 = d - d5;
                double d10 = d3 - d6;
                double d11 = n4 - n3;
                double d12 = f + 2.0f + 16.0f;
                if (d9 * d9 + d10 * d10 - d11 * d11 > d12 * d12) {
                    return;
                }
                if (d >= d5 - 16.0 - d7 * 2.0 && d3 >= d6 - 16.0 - d7 * 2.0 && d <= d5 + 16.0 + d7 * 2.0 && d3 <= d6 + 16.0 + d7 * 2.0) {
                    int n6;
                    int n7;
                    int n8 = MathHelper.IlIllllllIIlIIllllIIlIIIl(d - d7) - n * 16 - 1;
                    int n9 = MathHelper.IlIllllllIIlIIllllIIlIIIl(d + d7) - n * 16 + 1;
                    int n10 = MathHelper.IlIllllllIIlIIllllIIlIIIl(d2 - d8) - 1;
                    int n11 = MathHelper.IlIllllllIIlIIllllIIlIIIl(d2 + d8) + 1;
                    int n12 = MathHelper.IlIllllllIIlIIllllIIlIIIl(d3 - d7) - n2 * 16 - 1;
                    int n13 = MathHelper.IlIllllllIIlIIllllIIlIIIl(d3 + d7) - n2 * 16 + 1;
                    if (n8 < 0) {
                        n8 = 0;
                    }
                    if (n9 > 16) {
                        n9 = 16;
                    }
                    if (n10 < 1) {
                        n10 = 1;
                    }
                    if (n11 > 248) {
                        n11 = 248;
                    }
                    if (n12 < 0) {
                        n12 = 0;
                    }
                    if (n13 > 16) {
                        n13 = 16;
                    }
                    boolean bl = false;
                    for (n7 = n8; !bl && n7 < n9; ++n7) {
                        for (int i = n12; !bl && i < n13; ++i) {
                            for (int j = n11 + 1; !bl && j >= n10 - 1; --j) {
                                n6 = (n7 * 16 + i) * 256 + j;
                                if (j < 0 || j >= 256) continue;
                                Block class_05492 = arrclass_0549[n6];
                                if (class_05492 == Blocks.IIIllIllIIlIlIlIlIllllIIl || class_05492 == Blocks.IllIIIllIIIIlIlIlIllIIlll) {
                                    bl = true;
                                }
                                if (j == n10 - 1 || n7 == n8 || n7 == n9 - 1 || i == n12 || i == n13 - 1) continue;
                                j = n10;
                            }
                        }
                    }
                    if (!bl) {
                        for (n7 = n8; n7 < n9; ++n7) {
                            double d13 = ((double)(n7 + n * 16) + 0.5 - d) / d7;
                            for (n6 = n12; n6 < n13; ++n6) {
                                double d14 = ((double)(n6 + n2 * 16) + 0.5 - d3) / d7;
                                int n14 = (n7 * 16 + n6) * 256 + n11;
                                boolean bl2 = false;
                                if (!(d13 * d13 + d14 * d14 < 1.0)) continue;
                                for (int i = n11 - 1; i >= n10; --i) {
                                    double d15 = ((double)i + 0.5 - d2) / d8;
                                    if ((d13 * d13 + d14 * d14) * (double)this.lIlllIlllIIIIlIIlllIllIII[i] + d15 * d15 / 6.0 < 1.0) {
                                        Block class_05493 = arrclass_0549[n14];
                                        if (class_05493 == Blocks.IlIllllllIIlIIllllIIlIIIl) {
                                            bl2 = true;
                                        }
                                        if (class_05493 == Blocks.lllIlIIlIIIlIlIIIllIlllIl || class_05493 == Blocks.lIlllIlllIIIIlIIlllIllIII || class_05493 == Blocks.IlIllllllIIlIIllllIIlIIIl) {
                                            if (i < 10) {
                                                arrclass_0549[n14] = Blocks.lIIIIlIlIIlllllIIllIIlIII;
                                            } else {
                                                arrclass_0549[n14] = null;
                                                if (bl2 && arrclass_0549[n14 - 1] == Blocks.lIlllIlllIIIIlIIlllIllIII) {
                                                    arrclass_0549[n14 - 1] = this.IlIllllllIIlIIllllIIlIIIl.a_((int)(n7 + n * 16), (int)(n6 + n2 * 16)).IlllIIIllllIIllIllIlIIlIl;
                                                }
                                            }
                                        }
                                    }
                                    --n14;
                                }
                            }
                        }
                        if (n5 != 0) break;
                    }
                }
            }
            ++n3;
        }
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, int n4, Block[] arrclass_0549) {
        if (this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(50) == 0) {
            double d = n * 16 + this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(16);
            double d2 = this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(40) + 8) + 20;
            double d3 = n2 * 16 + this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(16);
            int n5 = 1;
            for (int i = 0; i < n5; ++i) {
                float f = this.lllIlIIlIIIlIlIIIllIlllIl.nextFloat() * (float)Math.PI * 2.0f;
                float f2 = (this.lllIlIIlIIIlIlIIIllIlllIl.nextFloat() - 0.5f) * 2.0f / 8.0f;
                float f3 = (this.lllIlIIlIIIlIlIIIllIlllIl.nextFloat() * 2.0f + this.lllIlIIlIIIlIlIIIllIlllIl.nextFloat()) * 2.0f;
                this.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl.nextLong(), n3, n4, arrclass_0549, d, d2, d3, f3, f, f2, 0, 0, 3.0);
            }
        }
    }
}

