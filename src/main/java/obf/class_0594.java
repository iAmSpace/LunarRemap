package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.MathHelper;

import java.util.Random;

public class class_0594
extends class_1000 {
    protected void lllIIIllIIIIlllIlIIllIIll(long l, int n, int n2, Block[] arrclass_0549, double d, double d2, double d3) {
        this.lllIIIllIIIIlllIlIIllIIll(l, n, n2, arrclass_0549, d, d2, d3, 1.0f + this.lllIlIIlIIIlIlIIIllIlllIl.nextFloat() * 6.0f, 0.0f, 0.0f, -1, -1, 0.5);
    }

    protected void lllIIIllIIIIlllIlIIllIIll(long l, int n, int n2, Block[] arrclass_0549, double d, double d2, double d3, float f, float f2, float f3, int n3, int n4, double d4) {
        boolean bl;
        int n5;
        double d5 = n * 16 + 8;
        double d6 = n2 * 16 + 8;
        float f4 = 0.0f;
        float f5 = 0.0f;
        Random random = new Random(l);
        if (n4 <= 0) {
            n5 = this.lllIIIllIIIIlllIlIIllIIll * 16 - 16;
            n4 = n5 - random.nextInt(n5 / 4);
        }
        n5 = 0;
        if (n3 == -1) {
            n3 = n4 / 2;
            n5 = 1;
        }
        int n6 = random.nextInt(n4 / 2) + n4 / 4;
        boolean bl2 = bl = random.nextInt(6) == 0;
        while (n3 < n4) {
            double d7 = 1.5 + (double)(MathHelper.lllIIIllIIIIlllIlIIllIIll((float)n3 * (float)Math.PI / (float)n4) * f * 1.0f);
            double d8 = d7 * d4;
            float f6 = MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f3);
            float f7 = MathHelper.lllIIIllIIIIlllIlIIllIIll(f3);
            d += (double)(MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f2) * f6);
            d2 += (double)f7;
            d3 += (double)(MathHelper.lllIIIllIIIIlllIlIIllIIll(f2) * f6);
            f3 = bl ? (f3 *= 0.92f) : (f3 *= 0.7f);
            f3 += f5 * 0.1f;
            f2 += f4 * 0.1f;
            f5 *= 0.9f;
            f4 *= 0.75f;
            f5 += (random.nextFloat() - random.nextFloat()) * random.nextFloat() * 2.0f;
            f4 += (random.nextFloat() - random.nextFloat()) * random.nextFloat() * 4.0f;
            if (n5 == 0 && n3 == n6 && f > 1.0f) {
                this.lllIIIllIIIIlllIlIIllIIll(random.nextLong(), n, n2, arrclass_0549, d, d2, d3, random.nextFloat() * 0.5f + 0.5f, f2 - 1.5707964f, f3 / 3.0f, n3, n4, 1.0);
                this.lllIIIllIIIIlllIlIIllIIll(random.nextLong(), n, n2, arrclass_0549, d, d2, d3, random.nextFloat() * 0.5f + 0.5f, f2 + 1.5707964f, f3 / 3.0f, n3, n4, 1.0);
                return;
            }
            if (n5 != 0 || random.nextInt(4) != 0) {
                double d9 = d - d5;
                double d10 = d3 - d6;
                double d11 = n4 - n3;
                double d12 = f + 2.0f + 16.0f;
                if (d9 * d9 + d10 * d10 - d11 * d11 > d12 * d12) {
                    return;
                }
                if (d >= d5 - 16.0 - d7 * 2.0 && d3 >= d6 - 16.0 - d7 * 2.0 && d <= d5 + 16.0 + d7 * 2.0 && d3 <= d6 + 16.0 + d7 * 2.0) {
                    int n7;
                    int n8;
                    int n9 = MathHelper.IlIllllllIIlIIllllIIlIIIl(d - d7) - n * 16 - 1;
                    int n10 = MathHelper.IlIllllllIIlIIllllIIlIIIl(d + d7) - n * 16 + 1;
                    int n11 = MathHelper.IlIllllllIIlIIllllIIlIIIl(d2 - d8) - 1;
                    int n12 = MathHelper.IlIllllllIIlIIllllIIlIIIl(d2 + d8) + 1;
                    int n13 = MathHelper.IlIllllllIIlIIllllIIlIIIl(d3 - d7) - n2 * 16 - 1;
                    int n14 = MathHelper.IlIllllllIIlIIllllIIlIIIl(d3 + d7) - n2 * 16 + 1;
                    if (n9 < 0) {
                        n9 = 0;
                    }
                    if (n10 > 16) {
                        n10 = 16;
                    }
                    if (n11 < 1) {
                        n11 = 1;
                    }
                    if (n12 > 120) {
                        n12 = 120;
                    }
                    if (n13 < 0) {
                        n13 = 0;
                    }
                    if (n14 > 16) {
                        n14 = 16;
                    }
                    boolean bl3 = false;
                    for (n8 = n9; !bl3 && n8 < n10; ++n8) {
                        for (int i = n13; !bl3 && i < n14; ++i) {
                            for (int j = n12 + 1; !bl3 && j >= n11 - 1; --j) {
                                n7 = (n8 * 16 + i) * 128 + j;
                                if (j < 0 || j >= 128) continue;
                                Block class_05492 = arrclass_0549[n7];
                                if (class_05492 == Blocks.lIIIIlIlIIlllllIIllIIlIII || class_05492 == Blocks.llIIlllIllIllllIIIlIIIIII) {
                                    bl3 = true;
                                }
                                if (j == n11 - 1 || n8 == n9 || n8 == n10 - 1 || i == n13 || i == n14 - 1) continue;
                                j = n11;
                            }
                        }
                    }
                    if (!bl3) {
                        for (n8 = n9; n8 < n10; ++n8) {
                            double d13 = ((double)(n8 + n * 16) + 0.5 - d) / d7;
                            for (n7 = n13; n7 < n14; ++n7) {
                                double d14 = ((double)(n7 + n2 * 16) + 0.5 - d3) / d7;
                                int n15 = (n8 * 16 + n7) * 128 + n12;
                                for (int i = n12 - 1; i >= n11; --i) {
                                    Block class_05493;
                                    double d15 = ((double)i + 0.5 - d2) / d8;
                                    if (d15 > -0.7 && d13 * d13 + d15 * d15 + d14 * d14 < 1.0 && ((class_05493 = arrclass_0549[n15]) == Blocks.lllllllIlIIlIlIIIlIlIIlll || class_05493 == Blocks.lIlllIlllIIIIlIIlllIllIII || class_05493 == Blocks.IlIllllllIIlIIllllIIlIIIl)) {
                                        arrclass_0549[n15] = null;
                                    }
                                    --n15;
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
        int n5 = this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(10) + 1) + 1);
        if (this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(5) != 0) {
            n5 = 0;
        }
        for (int i = 0; i < n5; ++i) {
            double d = n * 16 + this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(16);
            double d2 = this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(128);
            double d3 = n2 * 16 + this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(16);
            int n6 = 1;
            if (this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(4) == 0) {
                this.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl.nextLong(), n3, n4, arrclass_0549, d, d2, d3);
                n6 += this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(4);
            }
            for (int j = 0; j < n6; ++j) {
                float f = this.lllIlIIlIIIlIlIIIllIlllIl.nextFloat() * (float)Math.PI * 2.0f;
                float f2 = (this.lllIlIIlIIIlIlIIIllIlllIl.nextFloat() - 0.5f) * 2.0f / 8.0f;
                float f3 = this.lllIlIIlIIIlIlIIIllIlllIl.nextFloat() * 2.0f + this.lllIlIIlIIIlIlIIIllIlllIl.nextFloat();
                this.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl.nextLong(), n3, n4, arrclass_0549, d, d2, d3, f3 * 2.0f, f, f2, 0, 0, 0.5);
            }
        }
    }
}

