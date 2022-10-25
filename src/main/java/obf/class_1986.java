package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;

import java.util.List;
import java.util.Random;

public class class_1986
extends class_1036 {
    private boolean lllIIIllIIIIlllIlIIllIIll;
    private boolean lllIlIIlIIIlIlIIIllIlllIl;
    private boolean IlIllllllIIlIIllllIIlIIIl;
    private int lIlllIlllIIIIlIIlllIllIII;

    public class_1986() {
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        class_07752.lllIIIllIIIIlllIlIIllIIll("hr", this.lllIIIllIIIIlllIlIIllIIll);
        class_07752.lllIIIllIIIIlllIlIIllIIll("sc", this.lllIlIIlIIIlIlIIIllIlllIl);
        class_07752.lllIIIllIIIIlllIlIIllIIll("hps", this.IlIllllllIIlIIllllIIlIIIl);
        class_07752.lllIIIllIIIIlllIlIIllIIll("Num", this.lIlllIlllIIIIlIIlllIllIII);
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        this.lllIIIllIIIIlllIlIIllIIll = class_07752.lllIIlIIIllllllIIIIlIlIlI("hr");
        this.lllIlIIlIIIlIlIIIllIlllIl = class_07752.lllIIlIIIllllllIIIIlIlIlI("sc");
        this.IlIllllllIIlIIllllIIlIIIl = class_07752.lllIIlIIIllllllIIIIlIlIlI("hps");
        this.lIlllIlllIIIIlIIlllIllIII = class_07752.lIllllIIlIIIlIllllllIIIll("Num");
    }

    public class_1986(int n, Random random, class_2046 class_20462, int n2) {
        super(n);
        this.lIllllIIlIIIlIllllllIIIll = n2;
        this.IlIIIIIllllllIIlllIllllll = class_20462;
        this.lllIIIllIIIIlllIlIIllIIll = random.nextInt(3) == 0;
        this.lllIlIIlIIIlIlIIIllIlllIl = !this.lllIIIllIIIIlllIlIIllIIll && random.nextInt(23) == 0;
        this.lIlllIlllIIIIlIIlllIllIII = this.lIllllIIlIIIlIllllllIIIll != 2 && this.lIllllIIlIIIlIllllllIIIll != 0 ? class_20462.lllIlIIlIIIlIlIIIllIlllIl() / 5 : class_20462.lIlllIlllIIIIlIIlllIllIII() / 5;
    }

    public static class_2046 lllIIIllIIIIlllIlIIllIIll(List list, Random random, int n, int n2, int n3, int n4) {
        int n5;
        class_2046 class_20462 = new class_2046(n, n2, n3, n, n2 + 2, n3);
        for (n5 = random.nextInt(3) + 2; n5 > 0; --n5) {
            int n6 = n5 * 5;
            switch (n4) {
                case 0: {
                    class_20462.lIlllIlllIIIIlIIlllIllIII = n + 2;
                    class_20462.lIllllIIlIIIlIllllllIIIll = n3 + (n6 - 1);
                    break;
                }
                case 1: {
                    class_20462.lllIIIllIIIIlllIlIIllIIll = n - (n6 - 1);
                    class_20462.lIllllIIlIIIlIllllllIIIll = n3 + 2;
                    break;
                }
                case 2: {
                    class_20462.lIlllIlllIIIIlIIlllIllIII = n + 2;
                    class_20462.IlIllllllIIlIIllllIIlIIIl = n3 - (n6 - 1);
                    break;
                }
                case 3: {
                    class_20462.lIlllIlllIIIIlIIlllIllIII = n + (n6 - 1);
                    class_20462.lIllllIIlIIIlIllllllIIIll = n3 + 2;
                }
            }
            if (class_1036.lllIIIllIIIIlllIlIIllIIll(list, class_20462) == null) break;
        }
        return n5 > 0 ? class_20462 : null;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1036 class_10362, List list, Random random) {
        block24: {
            int n = this.IlIllllllIIlIIllllIIlIIIl();
            int n2 = random.nextInt(4);
            switch (this.lIllllIIlIIIlIllllllIIIll) {
                case 0: {
                    if (n2 <= 1) {
                        class_1657.lllIIIllIIIIlllIlIIllIIll(class_10362, list, random, this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl - 1 + random.nextInt(3), this.IlIIIIIllllllIIlllIllllll.lIllllIIlIIIlIllllllIIIll + 1, this.lIllllIIlIIIlIllllllIIIll, n);
                        break;
                    }
                    if (n2 == 2) {
                        class_1657.lllIIIllIIIIlllIlIIllIIll(class_10362, list, random, this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll - 1, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl - 1 + random.nextInt(3), this.IlIIIIIllllllIIlllIllllll.lIllllIIlIIIlIllllllIIIll - 3, 1, n);
                        break;
                    }
                    class_1657.lllIIIllIIIIlllIlIIllIIll(class_10362, list, random, this.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII + 1, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl - 1 + random.nextInt(3), this.IlIIIIIllllllIIlllIllllll.lIllllIIlIIIlIllllllIIIll - 3, 3, n);
                    break;
                }
                case 1: {
                    if (n2 <= 1) {
                        class_1657.lllIIIllIIIIlllIlIIllIIll(class_10362, list, random, this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll - 1, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl - 1 + random.nextInt(3), this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl, this.lIllllIIlIIIlIllllllIIIll, n);
                        break;
                    }
                    if (n2 == 2) {
                        class_1657.lllIIIllIIIIlllIlIIllIIll(class_10362, list, random, this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl - 1 + random.nextInt(3), this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl - 1, 2, n);
                        break;
                    }
                    class_1657.lllIIIllIIIIlllIlIIllIIll(class_10362, list, random, this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl - 1 + random.nextInt(3), this.IlIIIIIllllllIIlllIllllll.lIllllIIlIIIlIllllllIIIll + 1, 0, n);
                    break;
                }
                case 2: {
                    if (n2 <= 1) {
                        class_1657.lllIIIllIIIIlllIlIIllIIll(class_10362, list, random, this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl - 1 + random.nextInt(3), this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl - 1, this.lIllllIIlIIIlIllllllIIIll, n);
                        break;
                    }
                    if (n2 == 2) {
                        class_1657.lllIIIllIIIIlllIlIIllIIll(class_10362, list, random, this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll - 1, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl - 1 + random.nextInt(3), this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl, 1, n);
                        break;
                    }
                    class_1657.lllIIIllIIIIlllIlIIllIIll(class_10362, list, random, this.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII + 1, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl - 1 + random.nextInt(3), this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl, 3, n);
                    break;
                }
                case 3: {
                    if (n2 <= 1) {
                        class_1657.lllIIIllIIIIlllIlIIllIIll(class_10362, list, random, this.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII + 1, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl - 1 + random.nextInt(3), this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl, this.lIllllIIlIIIlIllllllIIIll, n);
                        break;
                    }
                    if (n2 == 2) {
                        class_1657.lllIIIllIIIIlllIlIIllIIll(class_10362, list, random, this.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII - 3, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl - 1 + random.nextInt(3), this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl - 1, 2, n);
                        break;
                    }
                    class_1657.lllIIIllIIIIlllIlIIllIIll(class_10362, list, random, this.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII - 3, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl - 1 + random.nextInt(3), this.IlIIIIIllllllIIlllIllllll.lIllllIIlIIIlIllllllIIIll + 1, 0, n);
                }
            }
            if (n >= 8) break block24;
            if (this.lIllllIIlIIIlIllllllIIIll != 2 && this.lIllllIIlIIIlIllllllIIIll != 0) {
                int n3 = this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll + 3;
                while (n3 + 3 <= this.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII) {
                    int n4 = random.nextInt(5);
                    if (n4 == 0) {
                        class_1657.lllIIIllIIIIlllIlIIllIIll(class_10362, list, random, n3, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl, this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl - 1, 2, n + 1);
                    } else if (n4 == 1) {
                        class_1657.lllIIIllIIIIlllIlIIllIIll(class_10362, list, random, n3, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl, this.IlIIIIIllllllIIlllIllllll.lIllllIIlIIIlIllllllIIIll + 1, 0, n + 1);
                    }
                    n3 += 5;
                }
            } else {
                int n5 = this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl + 3;
                while (n5 + 3 <= this.IlIIIIIllllllIIlllIllllll.lIllllIIlIIIlIllllllIIIll) {
                    int n6 = random.nextInt(5);
                    if (n6 == 0) {
                        class_1657.lllIIIllIIIIlllIlIIllIIll(class_10362, list, random, this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll - 1, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl, n5, 1, n + 1);
                    } else if (n6 == 1) {
                        class_1657.lllIIIllIIIIlllIlIIllIIll(class_10362, list, random, this.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII + 1, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl, n5, 3, n + 1);
                    }
                    n5 += 5;
                }
            }
        }
    }

    @Override
    protected boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, class_2046 class_20462, Random random, int n, int n2, int n3, class_0425[] arrclass_0425, int n4) {
        int n5;
        int n6;
        int n7 = this.lllIIIllIIIIlllIlIIllIIll(n, n3);
        if (class_20462.lllIlIIlIIIlIlIIIllIlllIl(n7, n6 = this.lllIIIllIIIIlllIlIIllIIll(n2), n5 = this.lllIlIIlIIIlIlIIIllIlllIl(n, n3)) && class_13342.a_(n7, n6, n5).lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll) {
            int n8 = random.nextBoolean() ? 1 : 0;
            class_13342.lllIIIllIIIIlllIlIIllIIll(n7, n6, n5, Blocks.rail, this.lllIIIllIIIIlllIlIIllIIll(Blocks.rail, n8), 2);
            class_0656 class_06562 = new class_0656(class_13342, (float)n7 + 0.5f, (float)n6 + 0.5f, (float)n5 + 0.5f);
            class_0425.lllIIIllIIIIlllIlIIllIIll(random, arrclass_0425, class_06562, n4);
            class_13342.lllIIIllIIIIlllIlIIllIIll(class_06562);
            return true;
        }
        return false;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, Random random, class_2046 class_20462) {
        int n;
        int n2;
        int n3;
        int n4;
        if (this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462)) {
            return false;
        }
        boolean bl = false;
        boolean bl2 = true;
        boolean bl3 = false;
        boolean bl4 = true;
        int n5 = this.lIlllIlllIIIIlIIlllIllIII * 5 - 1;
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 0, 0, 0, 2, 1, n5, Blocks.lllIIIllIIIIlllIlIIllIIll, Blocks.lllIIIllIIIIlllIlIIllIIll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, random, 0.8f, 0, 2, 0, 2, 2, n5, Blocks.lllIIIllIIIIlllIlIIllIIll, Blocks.lllIIIllIIIIlllIlIIllIIll, false);
        if (this.lllIlIIlIIIlIlIIIllIlllIl) {
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, random, 0.6f, 0, 0, 0, 2, 1, n5, Blocks.IIIIlIllIlIIlIIlIllIlIlll, Blocks.lllIIIllIIIIlllIlIIllIIll, false);
        }
        for (n4 = 0; n4 < this.lIlllIlllIIIIlIIlllIllIII; ++n4) {
            n3 = 2 + n4 * 5;
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 0, 0, n3, 0, 1, n3, Blocks.lIlIIIllIIllIIlIllllllIll, Blocks.lllIIIllIIIIlllIlIIllIIll, false);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 2, 0, n3, 2, 1, n3, Blocks.lIlIIIllIIllIIlIllllllIll, Blocks.lllIIIllIIIIlllIlIIllIIll, false);
            if (random.nextInt(4) == 0) {
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 0, 2, n3, 0, 2, n3, Blocks.lIllllIIlIIIlIllllllIIIll, Blocks.lllIIIllIIIIlllIlIIllIIll, false);
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 2, 2, n3, 2, 2, n3, Blocks.lIllllIIlIIIlIllllllIIIll, Blocks.lllIIIllIIIIlllIlIIllIIll, false);
            } else {
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 0, 2, n3, 2, 2, n3, Blocks.lIllllIIlIIIlIllllllIIIll, Blocks.lllIIIllIIIIlllIlIIllIIll, false);
            }
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, random, 0.1f, 0, 2, n3 - 1, Blocks.IIIIlIllIlIIlIIlIllIlIlll, 0);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, random, 0.1f, 2, 2, n3 - 1, Blocks.IIIIlIllIlIIlIIlIllIlIlll, 0);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, random, 0.1f, 0, 2, n3 + 1, Blocks.IIIIlIllIlIIlIIlIllIlIlll, 0);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, random, 0.1f, 2, 2, n3 + 1, Blocks.IIIIlIllIlIIlIIlIllIlIlll, 0);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, random, 0.05f, 0, 2, n3 - 2, Blocks.IIIIlIllIlIIlIIlIllIlIlll, 0);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, random, 0.05f, 2, 2, n3 - 2, Blocks.IIIIlIllIlIIlIIlIllIlIlll, 0);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, random, 0.05f, 0, 2, n3 + 2, Blocks.IIIIlIllIlIIlIIlIllIlIlll, 0);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, random, 0.05f, 2, 2, n3 + 2, Blocks.IIIIlIllIlIIlIIlIllIlIlll, 0);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, random, 0.05f, 1, 2, n3 - 1, Blocks.lIIIlIIIlIlllIllIIIlIIIlI, 0);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, random, 0.05f, 1, 2, n3 + 1, Blocks.lIIIlIIIlIlllIllIIIlIIIlI, 0);
            if (random.nextInt(100) == 0) {
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, random, 2, 0, n3 - 1, class_0425.lllIIIllIIIIlllIlIIllIIll(class_1657.lllIlIIlIIIlIlIIIllIlllIl(), Items.lIllIlIlIIIIlIlIIlIlIlllI.lllIIIllIIIIlllIlIIllIIll(random)), 3 + random.nextInt(4));
            }
            if (random.nextInt(100) == 0) {
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, random, 0, 0, n3 + 1, class_0425.lllIIIllIIIIlllIlIIllIIll(class_1657.lllIlIIlIIIlIlIIIllIlllIl(), Items.lIllIlIlIIIIlIlIIlIlIlllI.lllIIIllIIIIlllIlIIllIIll(random)), 3 + random.nextInt(4));
            }
            if (!this.lllIlIIlIIIlIlIIIllIlllIl || this.IlIllllllIIlIIllllIIlIIIl) continue;
            n2 = this.lllIIIllIIIIlllIlIIllIIll(0);
            int n6 = n3 - 1 + random.nextInt(3);
            n = this.lllIIIllIIIIlllIlIIllIIll(1, n6);
            if (!class_20462.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n6 = this.lllIlIIlIIIlIlIIIllIlllIl(1, n6))) continue;
            this.IlIllllllIIlIIllllIIlIIIl = true;
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n6, Blocks.IIlIllIIlllllIIlIIllllIIl, 0, 2);
            class_0933 class_09332 = (class_0933)class_13342.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n6);
            if (class_09332 == null) continue;
            class_09332.lllIIIllIIIIlllIlIIllIIll().lllIIIllIIIIlllIlIIllIIll("CaveSpider");
        }
        for (n4 = 0; n4 <= 2; ++n4) {
            for (n3 = 0; n3 <= n5; ++n3) {
                n2 = -1;
                Block class_05492 = this.lllIIIllIIIIlllIlIIllIIll(class_13342, n4, n2, n3, class_20462);
                if (class_05492.lIllllIIlIIIlIllllllIIIll() != class_1855.lllIIIllIIIIlllIlIIllIIll) continue;
                n = -1;
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIllllIIlIIIlIllllllIIIll, 0, n4, n, n3, class_20462);
            }
        }
        if (this.lllIIIllIIIIlllIlIIllIIll) {
            for (n4 = 0; n4 <= n5; ++n4) {
                Block class_05493 = this.lllIIIllIIIIlllIlIIllIIll(class_13342, 1, -1, n4, class_20462);
                if (class_05493.lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll || !class_05493.lllIIIllIIIIlllIlIIllIIll()) continue;
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, random, 0.7f, 1, 0, n4, Blocks.rail, this.lllIIIllIIIIlllIlIIllIIll(Blocks.rail, 0));
            }
        }
        return true;
    }
}

