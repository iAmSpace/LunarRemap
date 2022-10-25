package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

import java.util.Random;

public class class_1206
extends class_1067 {
    private Block lllIIIllIIIIlllIlIIllIIll;

    public class_1206(Block class_05492) {
        this.lllIIIllIIIIlllIlIIllIIll = class_05492;
    }

    @Override
    public boolean a_(class_1334 class_13342, Random random, int n, int n2, int n3) {
        Object object;
        int n4;
        int n5;
        while (n2 > 5 && class_13342.lIlllIlllIIIIlIIlllIllIII(n -= 8, n2, n3 -= 8)) {
            --n2;
        }
        if (n2 <= 4) {
            return false;
        }
        n2 -= 4;
        boolean[] arrbl = new boolean[2048];
        int n6 = random.nextInt(4) + 4;
        for (n5 = 0; n5 < n6; ++n5) {
            double d = random.nextDouble() * 6.0 + 3.0;
            double d2 = random.nextDouble() * 4.0 + 2.0;
            double d3 = random.nextDouble() * 6.0 + 3.0;
            double d4 = random.nextDouble() * (16.0 - d - 2.0) + 1.0 + d / 2.0;
            double d5 = random.nextDouble() * (8.0 - d2 - 4.0) + 2.0 + d2 / 2.0;
            double d6 = random.nextDouble() * (16.0 - d3 - 2.0) + 1.0 + d3 / 2.0;
            for (int i = 1; i < 15; ++i) {
                for (int j = 1; j < 15; ++j) {
                    for (int k = 1; k < 7; ++k) {
                        double d7 = ((double)i - d4) / (d / 2.0);
                        double d8 = ((double)k - d5) / (d2 / 2.0);
                        double d9 = ((double)j - d6) / (d3 / 2.0);
                        double d10 = d7 * d7 + d8 * d8 + d9 * d9;
                        if (!(d10 < 1.0)) continue;
                        arrbl[(i * 16 + j) * 8 + k] = true;
                    }
                }
            }
        }
        for (n5 = 0; n5 < 16; ++n5) {
            for (n4 = 0; n4 < 16; ++n4) {
                for (int i = 0; i < 8; ++i) {
                    boolean bl;
                    boolean bl2 = bl = !arrbl[(n5 * 16 + n4) * 8 + i] && (n5 < 15 && arrbl[((n5 + 1) * 16 + n4) * 8 + i] || n5 > 0 && arrbl[((n5 - 1) * 16 + n4) * 8 + i] || n4 < 15 && arrbl[(n5 * 16 + n4 + 1) * 8 + i] || n4 > 0 && arrbl[(n5 * 16 + (n4 - 1)) * 8 + i] || i < 7 && arrbl[(n5 * 16 + n4) * 8 + i + 1] || i > 0 && arrbl[(n5 * 16 + n4) * 8 + (i - 1)]);
                    if (!bl) continue;
                    object = class_13342.a_(n + n5, n2 + i, n3 + n4).lIllllIIlIIIlIllllllIIIll();
                    if (i >= 4 && ((class_1855)object).lllIIIllIIIIlllIlIIllIIll()) {
                        return false;
                    }
                    if (i >= 4 || ((class_1855)object).lllIlIIlIIIlIlIIIllIlllIl() || class_13342.a_(n + n5, n2 + i, n3 + n4) == this.lllIIIllIIIIlllIlIIllIIll) continue;
                    return false;
                }
            }
        }
        for (n5 = 0; n5 < 16; ++n5) {
            for (n4 = 0; n4 < 16; ++n4) {
                for (int i = 0; i < 8; ++i) {
                    if (!arrbl[(n5 * 16 + n4) * 8 + i]) continue;
                    class_13342.lllIIIllIIIIlllIlIIllIIll(n + n5, n2 + i, n3 + n4, i >= 4 ? Blocks.lllIIIllIIIIlllIlIIllIIll : this.lllIIIllIIIIlllIlIIllIIll, 0, 2);
                }
            }
        }
        for (n5 = 0; n5 < 16; ++n5) {
            for (n4 = 0; n4 < 16; ++n4) {
                for (int i = 4; i < 8; ++i) {
                    if (!arrbl[(n5 * 16 + n4) * 8 + i] || class_13342.a_(n + n5, n2 + i - 1, n3 + n4) != Blocks.lIlllIlllIIIIlIIlllIllIII || class_13342.lllIlIIlIIIlIlIIIllIlllIl(class_1346.lllIIIllIIIIlllIlIIllIIll, n + n5, n2 + i, n3 + n4) <= 0) continue;
                    object = class_13342.a_(n + n5, n3 + n4);
                    if (((class_0672)object).IlllIIIllllIIllIllIlIIlIl == Blocks.lIIIlllIlIIIlIllIIIlIllll) {
                        class_13342.lllIIIllIIIIlllIlIIllIIll(n + n5, n2 + i - 1, n3 + n4, Blocks.lIIIlllIlIIIlIllIIIlIllll, 0, 2);
                        continue;
                    }
                    class_13342.lllIIIllIIIIlllIlIIllIIll(n + n5, n2 + i - 1, n3 + n4, Blocks.IlIllllllIIlIIllllIIlIIIl, 0, 2);
                }
            }
        }
        if (this.lllIIIllIIIIlllIlIIllIIll.lIllllIIlIIIlIllllllIIIll() == class_1855.IIIllIllIIlIlIlIlIllllIIl) {
            for (n5 = 0; n5 < 16; ++n5) {
                for (n4 = 0; n4 < 16; ++n4) {
                    for (int i = 0; i < 8; ++i) {
                        boolean bl;
                        boolean bl3 = bl = !arrbl[(n5 * 16 + n4) * 8 + i] && (n5 < 15 && arrbl[((n5 + 1) * 16 + n4) * 8 + i] || n5 > 0 && arrbl[((n5 - 1) * 16 + n4) * 8 + i] || n4 < 15 && arrbl[(n5 * 16 + n4 + 1) * 8 + i] || n4 > 0 && arrbl[(n5 * 16 + (n4 - 1)) * 8 + i] || i < 7 && arrbl[(n5 * 16 + n4) * 8 + i + 1] || i > 0 && arrbl[(n5 * 16 + n4) * 8 + (i - 1)]);
                        if (!bl || i >= 4 && random.nextInt(2) == 0 || !class_13342.a_(n + n5, n2 + i, n3 + n4).lIllllIIlIIIlIllllllIIIll().lllIlIIlIIIlIlIIIllIlllIl()) continue;
                        class_13342.lllIIIllIIIIlllIlIIllIIll(n + n5, n2 + i, n3 + n4, Blocks.lllIlIIlIIIlIlIIIllIlllIl, 0, 2);
                    }
                }
            }
        }
        if (this.lllIIIllIIIIlllIlIIllIIll.lIllllIIlIIIlIllllllIIIll() == class_1855.IllIIlllllllIIlIIlIIIIlIl) {
            for (n5 = 0; n5 < 16; ++n5) {
                for (n4 = 0; n4 < 16; ++n4) {
                    int n7 = 4;
                    if (!class_13342.IlIlllIIIIIIlIIllIIllIlll(n + n5, n2 + n7, n3 + n4)) continue;
                    class_13342.lllIIIllIIIIlllIlIIllIIll(n + n5, n2 + n7, n3 + n4, Blocks.IllIIllIlIlllIllIllIlIIIl, 0, 2);
                }
            }
        }
        return true;
    }
}

