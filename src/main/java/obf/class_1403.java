package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.init.Blocks;
import net.minecraft.util.MathHelper;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class class_1403 {
    private final class_0976 lllIIIllIIIIlllIlIIllIIll;
    private final Random lllIlIIlIIIlIlIIIllIlllIl;
    private final class_1562 IlIllllllIIlIIllllIIlIIIl = new class_1562();
    private final List lIlllIlllIIIIlIIlllIllIII = new ArrayList();

    public class_1403(class_0976 class_09762) {
        this.lllIIIllIIIIlllIlIIllIIll = class_09762;
        this.lllIlIIlIIIlIlIIIllIlllIl = new Random(class_09762.lIlIlIIlIIIIlIIIIIlllIIII());
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, double d, double d2, double d3, float f) {
        if (this.lllIIIllIIIIlllIlIIllIIll.IlIlIIlllIIlIllIIIlllllIl.IIIllIllIIlIlIlIlIllllIIl != 1) {
            if (!this.lllIlIIlIIIlIlIIIllIlllIl(class_15212, d, d2, d3, f)) {
                this.lllIIIllIIIIlllIlIIllIIll(class_15212);
                this.lllIlIIlIIIlIlIIIllIlllIl(class_15212, d, d2, d3, f);
            }
        } else {
            int n = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_15212.IlIIlllllIIlIlIlllllIllll);
            int n2 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_15212.llIIlIlIlllIIllIlIlllIllI) - 1;
            int n3 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_15212.IllIIIIllIIllIllIlllIlIIl);
            int n4 = 1;
            int n5 = 0;
            for (int i = -2; i <= 2; ++i) {
                for (int j = -2; j <= 2; ++j) {
                    for (int k = -1; k < 3; ++k) {
                        int n6 = n + j * n4 + i * n5;
                        int n7 = n2 + k;
                        int n8 = n3 + j * n5 - i * n4;
                        boolean bl = k < 0;
                        this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(n6, n7, n8, bl ? Blocks.obsidian : Blocks.lllIIIllIIIIlllIlIIllIIll);
                    }
                }
            }
            class_15212.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3, class_15212.IIIIlIllIlIIlIIlIllIlIlll, 0.0f);
            class_15212.llIIIlllIlllIlIllIIIIllIl = 0.0;
            class_15212.IIlIIlIlIlIllIIlIlIIIIlll = 0.0;
            class_15212.IIIIIIIIlIllIIllIIlllIllI = 0.0;
        }
    }

    public boolean lllIlIIlIIIlIlIIIllIlllIl(class_1521 class_15212, double d, double d2, double d3, float f) {
        double d4;
        int n;
        int n2;
        int n3 = 128;
        double d5 = -1.0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_15212.IlIIlllllIIlIlIlllllIllll);
        int n8 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_15212.IllIIIIllIIllIllIlllIlIIl);
        long l = class_1108.lllIIIllIIIIlllIlIIllIIll(n7, n8);
        boolean bl = true;
        if (this.IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl(l)) {
            class_0824 class_08242 = (class_0824)this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(l);
            d5 = 0.0;
            n4 = class_08242.lllIIIllIIIIlllIlIIllIIll;
            n5 = class_08242.lllIlIIlIIIlIlIIIllIlllIl;
            n6 = class_08242.IlIllllllIIlIIllllIIlIIIl;
            class_08242.lIlllIlllIIIIlIIlllIllIII = this.lllIIIllIIIIlllIlIIllIIll.IlIIIlIIIIllIIIllIIIIIIll();
            bl = false;
        } else {
            for (n2 = n7 - n3; n2 <= n7 + n3; ++n2) {
                double d6 = (double)n2 + 0.5 - class_15212.IlIIlllllIIlIlIlllllIllll;
                for (int i = n8 - n3; i <= n8 + n3; ++i) {
                    double d7 = (double)i + 0.5 - class_15212.IllIIIIllIIllIllIlllIlIIl;
                    for (n = this.lllIIIllIIIIlllIlIIllIIll.IIlIIlIlIlIllIIlIlIIIIlll() - 1; n >= 0; --n) {
                        if (this.lllIIIllIIIIlllIlIIllIIll.a_(n2, n, i) != Blocks.IIIIIIlIIIIIIIIIIlIlIlIlI) continue;
                        while (this.lllIIIllIIIIlllIlIIllIIll.a_(n2, n - 1, i) == Blocks.IIIIIIlIIIIIIIIIIlIlIlIlI) {
                            --n;
                        }
                        d4 = (double)n + 0.5 - class_15212.llIIlIlIlllIIllIlIlllIllI;
                        double d8 = d6 * d6 + d4 * d4 + d7 * d7;
                        if (!(d5 < 0.0) && !(d8 < d5)) continue;
                        d5 = d8;
                        n4 = n2;
                        n5 = n;
                        n6 = i;
                    }
                }
            }
        }
        if (d5 >= 0.0) {
            if (bl) {
                this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(l, new class_0824(this, n4, n5, n6, this.lllIIIllIIIIlllIlIIllIIll.IlIIIlIIIIllIIIllIIIIIIll()));
                this.lIlllIlllIIIIlIIlllIllIII.add(l);
            }
            double d9 = (double)n4 + 0.5;
            double d10 = (double)n5 + 0.5;
            d4 = (double)n6 + 0.5;
            int n9 = -1;
            if (this.lllIIIllIIIIlllIlIIllIIll.a_(n4 - 1, n5, n6) == Blocks.IIIIIIlIIIIIIIIIIlIlIlIlI) {
                n9 = 2;
            }
            if (this.lllIIIllIIIIlllIlIIllIIll.a_(n4 + 1, n5, n6) == Blocks.IIIIIIlIIIIIIIIIIlIlIlIlI) {
                n9 = 0;
            }
            if (this.lllIIIllIIIIlllIlIIllIIll.a_(n4, n5, n6 - 1) == Blocks.IIIIIIlIIIIIIIIIIlIlIlIlI) {
                n9 = 3;
            }
            if (this.lllIIIllIIIIlllIlIIllIIll.a_(n4, n5, n6 + 1) == Blocks.IIIIIIlIIIIIIIIIIlIlIlIlI) {
                n9 = 1;
            }
            n = class_15212.IIIlIllllIIIlllllIllIlIII();
            if (n9 > -1) {
                boolean bl2;
                int n10 = class_1632.lllIIIllIIIIlllIlIIllIIll[n9];
                int n11 = class_1632.IllIIlllllllIIlIIlIIIIlIl[n9];
                int n12 = class_1632.lllIIIllIIIIlllIlIIllIIll[n11];
                int n13 = class_1632.lllIlIIlIIIlIlIIIllIlllIl[n9];
                int n14 = class_1632.lllIlIIlIIIlIlIIIllIlllIl[n11];
                boolean bl3 = !this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII(n4 + n10 + n12, n5, n6 + n13 + n14) || !this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII(n4 + n10 + n12, n5 + 1, n6 + n13 + n14);
                boolean bl4 = bl2 = !this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII(n4 + n10, n5, n6 + n13) || !this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII(n4 + n10, n5 + 1, n6 + n13);
                if (bl3 && bl2) {
                    n9 = class_1632.lIllllIIlIIIlIllllllIIIll[n9];
                    n11 = class_1632.lIllllIIlIIIlIllllllIIIll[n11];
                    n10 = class_1632.lllIIIllIIIIlllIlIIllIIll[n9];
                    n13 = class_1632.lllIlIIlIIIlIlIIIllIlllIl[n9];
                    n12 = class_1632.lllIIIllIIIIlllIlIIllIIll[n11];
                    n14 = class_1632.lllIlIIlIIIlIlIIIllIlllIl[n11];
                    n2 = n4 - n12;
                    d9 -= (double)n12;
                    int n15 = n6 - n14;
                    d4 -= (double)n14;
                    bl3 = !this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII(n2 + n10 + n12, n5, n15 + n13 + n14) || !this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII(n2 + n10 + n12, n5 + 1, n15 + n13 + n14);
                    bl2 = !this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII(n2 + n10, n5, n15 + n13) || !this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII(n2 + n10, n5 + 1, n15 + n13);
                }
                float f2 = 0.5f;
                float f3 = 0.5f;
                if (!bl3 && bl2) {
                    f2 = 1.0f;
                } else if (bl3 && !bl2) {
                    f2 = 0.0f;
                } else if (bl3 && bl2) {
                    f3 = 0.0f;
                }
                d9 += (double)((float)n12 * f2 + f3 * (float)n10);
                d4 += (double)((float)n14 * f2 + f3 * (float)n13);
                float f4 = 0.0f;
                float f5 = 0.0f;
                float f6 = 0.0f;
                float f7 = 0.0f;
                if (n9 == n) {
                    f4 = 1.0f;
                    f5 = 1.0f;
                } else if (n9 == class_1632.lIllllIIlIIIlIllllllIIIll[n]) {
                    f4 = -1.0f;
                    f5 = -1.0f;
                } else if (n9 == class_1632.IIIllIIlIIIIIIlIlIIllIIlI[n]) {
                    f6 = 1.0f;
                    f7 = -1.0f;
                } else {
                    f6 = -1.0f;
                    f7 = 1.0f;
                }
                double d11 = class_15212.IIIIIIIIlIllIIllIIlllIllI;
                double d12 = class_15212.llIIIlllIlllIlIllIIIIllIl;
                class_15212.IIIIIIIIlIllIIllIIlllIllI = d11 * (double)f4 + d12 * (double)f7;
                class_15212.llIIIlllIlllIlIllIIIIllIl = d11 * (double)f6 + d12 * (double)f5;
                class_15212.IIIIlIllIlIIlIIlIllIlIlll = f - (float)(n * 90) + (float)(n9 * 90);
            } else {
                class_15212.llIIIlllIlllIlIllIIIIllIl = 0.0;
                class_15212.IIlIIlIlIlIllIIlIlIIIIlll = 0.0;
                class_15212.IIIIIIIIlIllIIllIIlllIllI = 0.0;
            }
            class_15212.lllIlIIlIIIlIlIIIllIlllIl(d9, d10, d4, class_15212.IIIIlIllIlIIlIIlIllIlIlll, class_15212.IlIlIIlllIllllllllIIIlIlI);
            return true;
        }
        return false;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212) {
        boolean bl;
        double d;
        double d2;
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        double d3;
        int n11;
        double d4;
        int n12;
        int n13 = 16;
        double d5 = -1.0;
        int n14 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_15212.IlIIlllllIIlIlIlllllIllll);
        int n15 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_15212.llIIlIlIlllIIllIlIlllIllI);
        int n16 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_15212.IllIIIIllIIllIllIlllIlIIl);
        int n17 = n14;
        int n18 = n15;
        int n19 = n16;
        int n20 = 0;
        int n21 = this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(4);
        for (n12 = n14 - n13; n12 <= n14 + n13; ++n12) {
            d4 = (double)n12 + 0.5 - class_15212.IlIIlllllIIlIlIlllllIllll;
            for (n11 = n16 - n13; n11 <= n16 + n13; ++n11) {
                d3 = (double)n11 + 0.5 - class_15212.IllIIIIllIIllIllIlllIlIIl;
                block2: for (n10 = this.lllIIIllIIIIlllIlIIllIIll.IIlIIlIlIlIllIIlIlIIIIlll() - 1; n10 >= 0; --n10) {
                    if (!this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII(n12, n10, n11)) continue;
                    while (n10 > 0 && this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII(n12, n10 - 1, n11)) {
                        --n10;
                    }
                    for (n9 = n21; n9 < n21 + 4; ++n9) {
                        n8 = n9 % 2;
                        n7 = 1 - n8;
                        if (n9 % 4 >= 2) {
                            n8 = -n8;
                            n7 = -n7;
                        }
                        for (n6 = 0; n6 < 3; ++n6) {
                            for (n5 = 0; n5 < 4; ++n5) {
                                for (n4 = -1; n4 < 4; ++n4) {
                                    n3 = n12 + (n5 - 1) * n8 + n6 * n7;
                                    n2 = n10 + n4;
                                    n = n11 + (n5 - 1) * n7 - n6 * n8;
                                    if (n4 < 0 && !this.lllIIIllIIIIlllIlIIllIIll.a_(n3, n2, n).lIllllIIlIIIlIllllllIIIll().lllIlIIlIIIlIlIIIllIlllIl() || n4 >= 0 && !this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII(n3, n2, n)) continue block2;
                                }
                            }
                        }
                        d2 = (double)n10 + 0.5 - class_15212.llIIlIlIlllIIllIlIlllIllI;
                        d = d4 * d4 + d2 * d2 + d3 * d3;
                        if (!(d5 < 0.0) && !(d < d5)) continue;
                        d5 = d;
                        n17 = n12;
                        n18 = n10;
                        n19 = n11;
                        n20 = n9 % 4;
                    }
                }
            }
        }
        if (d5 < 0.0) {
            for (n12 = n14 - n13; n12 <= n14 + n13; ++n12) {
                d4 = (double)n12 + 0.5 - class_15212.IlIIlllllIIlIlIlllllIllll;
                for (n11 = n16 - n13; n11 <= n16 + n13; ++n11) {
                    d3 = (double)n11 + 0.5 - class_15212.IllIIIIllIIllIllIlllIlIIl;
                    block10: for (n10 = this.lllIIIllIIIIlllIlIIllIIll.IIlIIlIlIlIllIIlIlIIIIlll() - 1; n10 >= 0; --n10) {
                        if (!this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII(n12, n10, n11)) continue;
                        while (n10 > 0 && this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII(n12, n10 - 1, n11)) {
                            --n10;
                        }
                        for (n9 = n21; n9 < n21 + 2; ++n9) {
                            n8 = n9 % 2;
                            n7 = 1 - n8;
                            for (n6 = 0; n6 < 4; ++n6) {
                                for (n5 = -1; n5 < 4; ++n5) {
                                    n4 = n12 + (n6 - 1) * n8;
                                    n3 = n10 + n5;
                                    n2 = n11 + (n6 - 1) * n7;
                                    if (n5 < 0 && !this.lllIIIllIIIIlllIlIIllIIll.a_(n4, n3, n2).lIllllIIlIIIlIllllllIIIll().lllIlIIlIIIlIlIIIllIlllIl() || n5 >= 0 && !this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII(n4, n3, n2)) continue block10;
                                }
                            }
                            d2 = (double)n10 + 0.5 - class_15212.llIIlIlIlllIIllIlIlllIllI;
                            d = d4 * d4 + d2 * d2 + d3 * d3;
                            if (!(d5 < 0.0) && !(d < d5)) continue;
                            d5 = d;
                            n17 = n12;
                            n18 = n10;
                            n19 = n11;
                            n20 = n9 % 2;
                        }
                    }
                }
            }
        }
        n = n17;
        int n22 = n18;
        n11 = n19;
        int n23 = n20 % 2;
        int n24 = 1 - n23;
        if (n20 % 4 >= 2) {
            n23 = -n23;
            n24 = -n24;
        }
        if (d5 < 0.0) {
            if (n18 < 70) {
                n18 = 70;
            }
            if (n18 > this.lllIIIllIIIIlllIlIIllIIll.IIlIIlIlIlIllIIlIlIIIIlll() - 10) {
                n18 = this.lllIIIllIIIIlllIlIIllIIll.IIlIIlIlIlIllIIlIlIIIIlll() - 10;
            }
            n22 = n18;
            for (n10 = -1; n10 <= 1; ++n10) {
                for (n9 = 1; n9 < 3; ++n9) {
                    for (n8 = -1; n8 < 3; ++n8) {
                        n7 = n + (n9 - 1) * n23 + n10 * n24;
                        n6 = n22 + n8;
                        n5 = n11 + (n9 - 1) * n24 - n10 * n23;
                        bl = n8 < 0;
                        this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(n7, n6, n5, bl ? Blocks.obsidian : Blocks.lllIIIllIIIIlllIlIIllIIll);
                    }
                }
            }
        }
        for (n10 = 0; n10 < 4; ++n10) {
            for (n9 = 0; n9 < 4; ++n9) {
                for (n8 = -1; n8 < 4; ++n8) {
                    n7 = n + (n9 - 1) * n23;
                    n6 = n22 + n8;
                    n5 = n11 + (n9 - 1) * n24;
                    bl = n9 == 0 || n9 == 3 || n8 == -1 || n8 == 3;
                    this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(n7, n6, n5, bl ? Blocks.obsidian : Blocks.IIIIIIlIIIIIIIIIIlIlIlIlI, 0, 2);
                }
            }
            for (n9 = 0; n9 < 4; ++n9) {
                for (n8 = -1; n8 < 4; ++n8) {
                    n7 = n + (n9 - 1) * n23;
                    n6 = n22 + n8;
                    n5 = n11 + (n9 - 1) * n24;
                    this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl(n7, n6, n5, this.lllIIIllIIIIlllIlIIllIIll.a_(n7, n6, n5));
                }
            }
        }
        return true;
    }

    public void lllIIIllIIIIlllIlIIllIIll(long l) {
        if (l % 100L == 0L) {
            Iterator iterator = this.lIlllIlllIIIIlIIlllIllIII.iterator();
            long l2 = l - 600L;
            while (iterator.hasNext()) {
                Long l3 = (Long)iterator.next();
                class_0824 class_08242 = (class_0824)this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(l3);
                if (class_08242 != null && class_08242.lIlllIlllIIIIlIIlllIllIII >= l2) continue;
                iterator.remove();
                this.IlIllllllIIlIIllllIIlIIIl.lIlllIlllIIIIlIIlllIllIII(l3);
            }
        }
    }
}

