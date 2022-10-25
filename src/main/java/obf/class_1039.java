package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;

import java.util.List;

public class class_1039
extends Block {
    private final boolean llllllIlIllllIlIlIlIIIIlI;
    private class_2102 lIlIIllllIlIIIIllIIIIlIIl;
    private class_2102 llIlllIIllIlllIlIlIlIIIll;
    private class_2102 IIIIlIIlIIIllIIIIllIIIlII;

    public class_1039(boolean bl) {
        super(class_1855.IlIlIIlllIllllllllIIIlIlI);
        this.llllllIlIllllIlIlIlIIIIlI = bl;
        this.lllIIIllIIIIlllIlIIllIIll(IIIllIIlIIIIIIlIlIIllIIlI);
        this.IlIllllllIIlIIllllIIlIIIl(0.5f);
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.lIlllIlllIIIIlIIlllIllIII);
    }

    public class_2102 llIlllIIllIlllIlIlIlIIIll() {
        return this.IIIIlIIlIIIllIIIIllIIIlII;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(float f, float f2, float f3, float f4, float f5, float f6) {
        this.lllIIIllIIIIlllIlIIllIIll(f, f2, f3, f4, f5, f6);
    }

    @Override
    public class_2102 lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        int n3 = class_1039.IllIIlllllllIIlIIlIIIIlIl(n2);
        return n3 > 5 ? this.IIIIlIIlIIIllIIIIllIIIlII : (n == n3 ? (!class_1039.IIIllIllIIlIlIlIlIllllIIl(n2) && this.lIlllIlllIlIIIIlllIlIlIIl <= 0.0 && this.IlIIlllllIIlIlIlllllIllll <= 0.0 && this.llIIlIlIlllIIllIlIlllIllI <= 0.0 && this.IllIIIIllIIllIllIlllIlIIl >= 1.0 && this.IIIIIIIIlIllIIllIIlllIllI >= 1.0 && this.IIlIIlIlIlIllIIlIlIIIIlll >= 1.0 ? this.IIIIlIIlIIIllIIIIllIIIlII : this.lIlIIllllIlIIIIllIIIIlIIl) : (n == class_0573.lllIIIllIIIIlllIlIIllIIll[n3] ? this.llIlllIIllIlllIlIlIlIIIll : this.llIIIIllIIIIIIIlIIIlIIIIl));
    }

    public static class_2102 lIlllIlllIIIIlIIlllIllIII(String string) {
        return string == "piston_side" ? Blocks.llIIIIllIIIIIIIlIIIlIIIIl.llIIIIllIIIIIIIlIIIlIIIIl : (string == "piston_top_normal" ? Blocks.llIIIIllIIIIIIIlIIIlIIIIl.IIIIlIIlIIIllIIIIllIIIlII : (string == "piston_top_sticky" ? Blocks.llIIIlllIlllIlIllIIIIllIl.IIIIlIIlIIIllIIIIllIIIlII : (string == "piston_inner" ? Blocks.llIIIIllIIIIIIIlIIIlIIIIl.lIlIIllllIlIIIIllIIIIlIIl : null)));
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
        this.llIIIIllIIIIIIIlIIIlIIIIl = class_08872.lllIIIllIIIIlllIlIIllIIll("piston_side");
        this.IIIIlIIlIIIllIIIIllIIIlII = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI ? "piston_top_sticky" : "piston_top_normal");
        this.lIlIIllllIlIIIIllIIIIlIIl = class_08872.lllIIIllIIIIlllIlIIllIIll("piston_inner");
        this.llIlllIIllIlllIlIlIlIIIll = class_08872.lllIIIllIIIIlllIlIIllIIll("piston_bottom");
    }

    @Override
    public int lIIIIlIlIIlllllIIllIIlIII() {
        return 16;
    }

    @Override
    public boolean IlIlllIIIIIIlIIllIIllIlll() {
        return false;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_0814 class_08142, int n4, float f, float f2, float f3) {
        return false;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_1965 class_19652, ItemStack class_08972) {
        int n4 = class_1039.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_19652);
        class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n4, 2);
        if (!class_13342.IllIIIIllIIllIllIlllIlIIl) {
            this.IllIIIllIIIIlIlIlIllIIlll(class_13342, n, n2, n3);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Block class_05492) {
        if (!class_13342.IllIIIIllIIllIllIlllIlIIl) {
            this.IllIIIllIIIIlIlIlIllIIlll(class_13342, n, n2, n3);
        }
    }

    @Override
    public void lIlllIlllIIIIlIIlllIllIII(class_1334 class_13342, int n, int n2, int n3) {
        if (!class_13342.IllIIIIllIIllIllIlllIlIIl && class_13342.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3) == null) {
            this.IllIIIllIIIIlIlIlIllIIlll(class_13342, n, n2, n3);
        }
    }

    private void IllIIIllIIIIlIlIlIllIIlll(class_1334 class_13342, int n, int n2, int n3) {
        int n4 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        int n5 = class_1039.IllIIlllllllIIlIIlIIIIlIl(n4);
        if (n5 != 7) {
            boolean bl = this.IIIllIIlIIIIIIlIlIIllIIlI(class_13342, n, n2, n3, n5);
            if (bl && !class_1039.IIIllIllIIlIlIlIlIllllIIl(n4)) {
                if (class_1039.IllIIlllllllIIlIIlIIIIlIl(class_13342, n, n2, n3, n5)) {
                    class_13342.lIlllIlllIIIIlIIlllIllIII(n, n2, n3, this, 0, n5);
                }
            } else if (!bl && class_1039.IIIllIllIIlIlIlIlIllllIIl(n4)) {
                class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n5, 2);
                class_13342.lIlllIlllIIIIlIIlllIllIII(n, n2, n3, this, 1, n5);
            }
        }
    }

    private boolean IIIllIIlIIIIIIlIlIIllIIlI(class_1334 class_13342, int n, int n2, int n3, int n4) {
        return n4 != 0 && class_13342.IlIIIIIllllllIIlllIllllll(n, n2 - 1, n3, 0) ? true : (n4 != 1 && class_13342.IlIIIIIllllllIIlllIllllll(n, n2 + 1, n3, 1) ? true : (n4 != 2 && class_13342.IlIIIIIllllllIIlllIllllll(n, n2, n3 - 1, 2) ? true : (n4 != 3 && class_13342.IlIIIIIllllllIIlllIllllll(n, n2, n3 + 1, 3) ? true : (n4 != 5 && class_13342.IlIIIIIllllllIIlllIllllll(n + 1, n2, n3, 5) ? true : (n4 != 4 && class_13342.IlIIIIIllllllIIlllIllllll(n - 1, n2, n3, 4) ? true : (class_13342.IlIIIIIllllllIIlllIllllll(n, n2, n3, 0) ? true : (class_13342.IlIIIIIllllllIIlllIllllll(n, n2 + 2, n3, 1) ? true : (class_13342.IlIIIIIllllllIIlllIllllll(n, n2 + 1, n3 - 1, 2) ? true : (class_13342.IlIIIIIllllllIIlllIllllll(n, n2 + 1, n3 + 1, 3) ? true : (class_13342.IlIIIIIllllllIIlllIllllll(n - 1, n2 + 1, n3, 4) ? true : class_13342.IlIIIIIllllllIIlllIllllll(n + 1, n2 + 1, n3, 5)))))))))));
    }

    @Override
    public boolean lllIlIIlIIIlIlIIIllIlllIl(class_1334 class_13342, int n, int n2, int n3, int n4, int n5) {
        if (!class_13342.IllIIIIllIIllIllIlllIlIIl) {
            boolean bl = this.IIIllIIlIIIIIIlIlIIllIIlI(class_13342, n, n2, n3, n5);
            if (bl && n4 == 1) {
                class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n5 | 8, 2);
                return false;
            }
            if (!bl && n4 == 0) {
                return false;
            }
        }
        if (n4 == 0) {
            if (!this.IIIllIllIIlIlIlIlIllllIIl(class_13342, n, n2, n3, n5)) {
                return false;
            }
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n5 | 8, 2);
            class_13342.lllIIIllIIIIlllIlIIllIIll((double)n + 0.5, (double)n2 + 0.5, (double)n3 + 0.5, "tile.piston.out", 0.5f, class_13342.lllllIlllIIllIlIIlIIIllII.nextFloat() * 0.25f + 0.6f);
        } else if (n4 == 1) {
            class_1774 class_17742 = class_13342.lllIlIIlIIIlIlIIIllIlllIl(n + class_0573.lllIlIIlIIIlIlIIIllIlllIl[n5], n2 + class_0573.IlIllllllIIlIIllllIIlIIIl[n5], n3 + class_0573.lIlllIlllIIIIlIIlllIllIII[n5]);
            if (class_17742 instanceof class_0919) {
                ((class_0919)class_17742).IlIlIIlIlIllIIlIlIIllIIIl();
            }
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, Blocks.lIlIIllllIlIIIIllIIIIlIIl, n5, 3);
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, class_1293.lllIIIllIIIIlllIlIIllIIll(this, n5, n5, false, true));
            if (this.llllllIlIllllIlIlIlIIIIlI) {
                class_0919 class_09192;
                class_1774 class_17743;
                int n6 = n + class_0573.lllIlIIlIIIlIlIIIllIlllIl[n5] * 2;
                int n7 = n2 + class_0573.IlIllllllIIlIIllllIIlIIIl[n5] * 2;
                int n8 = n3 + class_0573.lIlllIlllIIIIlIIlllIllIII[n5] * 2;
                Block class_05492 = class_13342.a_(n6, n7, n8);
                int n9 = class_13342.IlIllllllIIlIIllllIIlIIIl(n6, n7, n8);
                boolean bl = false;
                if (class_05492 == Blocks.lIlIIllllIlIIIIllIIIIlIIl && (class_17743 = class_13342.lllIlIIlIIIlIlIIIllIlllIl(n6, n7, n8)) instanceof class_0919 && (class_09192 = (class_0919)class_17743).lllIIlIIIllllllIIIIlIlIlI() == n5 && class_09192.IlIIIIIllllllIIlllIllllll()) {
                    class_09192.IlIlIIlIlIllIIlIlIIllIIIl();
                    class_05492 = class_09192.lllIIIllIIIIlllIlIIllIIll();
                    n9 = class_09192.lIlllIlllIIIIlIIlllIllIII();
                    bl = true;
                }
                if (!bl && class_05492.lIllllIIlIIIlIllllllIIIll() != class_1855.lllIIIllIIIIlllIlIIllIIll && class_1039.lllIIIllIIIIlllIlIIllIIll(class_05492, class_13342, n6, n7, n8, false) && (class_05492.llIIIlllIlllIlIllIIIIllIl() == 0 || class_05492 == Blocks.llIIIIllIIIIIIIlIIIlIIIIl || class_05492 == Blocks.llIIIlllIlllIlIllIIIIllIl)) {
                    class_13342.lllIIIllIIIIlllIlIIllIIll(n += class_0573.lllIlIIlIIIlIlIIIllIlllIl[n5], n2 += class_0573.IlIllllllIIlIIllllIIlIIIl[n5], n3 += class_0573.lIlllIlllIIIIlIIlllIllIII[n5], Blocks.lIlIIllllIlIIIIllIIIIlIIl, n9, 3);
                    class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, class_1293.lllIIIllIIIIlllIlIIllIIll(class_05492, n9, n5, false, false));
                    class_13342.lIllllIIlIIIlIllllllIIIll(n6, n7, n8);
                } else if (!bl) {
                    class_13342.lIllllIIlIIIlIllllllIIIll(n + class_0573.lllIlIIlIIIlIlIIIllIlllIl[n5], n2 + class_0573.IlIllllllIIlIIllllIIlIIIl[n5], n3 + class_0573.lIlllIlllIIIIlIIlllIllIII[n5]);
                }
            } else {
                class_13342.lIllllIIlIIIlIllllllIIIll(n + class_0573.lllIlIIlIIIlIlIIIllIlllIl[n5], n2 + class_0573.IlIllllllIIlIIllllIIlIIIl[n5], n3 + class_0573.lIlllIlllIIIIlIIlllIllIII[n5]);
            }
            class_13342.lllIIIllIIIIlllIlIIllIIll((double)n + 0.5, (double)n2 + 0.5, (double)n3 + 0.5, "tile.piston.in", 0.5f, class_13342.lllllIlllIIllIlIIlIIIllII.nextFloat() * 0.15f + 0.6f);
        }
        return true;
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl(class_1843 class_18432, int n, int n2, int n3) {
        int n4 = class_18432.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        if (class_1039.IIIllIllIIlIlIlIlIllllIIl(n4)) {
            float f = 0.25f;
            switch (class_1039.IllIIlllllllIIlIIlIIIIlIl(n4)) {
                case 0: {
                    this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.25f, 0.0f, 1.0f, 1.0f, 1.0f);
                    break;
                }
                case 1: {
                    this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, 1.0f, 0.75f, 1.0f);
                    break;
                }
                case 2: {
                    this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.25f, 1.0f, 1.0f, 1.0f);
                    break;
                }
                case 3: {
                    this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.75f);
                    break;
                }
                case 4: {
                    this.lllIIIllIIIIlllIlIIllIIll(0.25f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
                    break;
                }
                case 5: {
                    this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, 0.75f, 1.0f, 1.0f);
                }
            }
        } else {
            this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        }
    }

    @Override
    public void lIlllIlllIlIIIIlllIlIlIIl() {
        this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_1974 class_19742, List list, class_1521 class_15212) {
        this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_19742, list, class_15212);
    }

    @Override
    public class_1974 IlIllllllIIlIIllllIIlIIIl(class_1334 class_13342, int n, int n2, int n3) {
        this.IlIllllllIIlIIllllIIlIIIl((class_1843)class_13342, n, n2, n3);
        return super.IlIllllllIIlIIllllIIlIIIl(class_13342, n, n2, n3);
    }

    @Override
    public boolean IllIIIllIIIIlIlIlIllIIlll() {
        return false;
    }

    public static int IllIIlllllllIIlIIlIIIIlIl(int n) {
        return n & 7;
    }

    public static boolean IIIllIllIIlIlIlIlIllllIIl(int n) {
        return (n & 8) != 0;
    }

    public static int lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_1965 class_19652) {
        int n4;
        if (MathHelper.IlIIIIIllllllIIlllIllllll((float)class_19652.IlIIlllllIIlIlIlllllIllll - (float)n) < 2.0f && MathHelper.IlIIIIIllllllIIlllIllllll((float)class_19652.IllIIIIllIIllIllIlllIlIIl - (float)n3) < 2.0f) {
            double d = class_19652.llIIlIlIlllIIllIlIlllIllI + 1.82 - (double)class_19652.llllIlIIIIIIIIIlllIIlIIIl;
            if (d - (double)n2 > 2.0) {
                return 1;
            }
            if ((double)n2 - d > 0.0) {
                return 0;
            }
        }
        return (n4 = MathHelper.IlIllllllIIlIIllllIIlIIIl((double)(class_19652.IIIIlIllIlIIlIIlIllIlIlll * 4.0f / 360.0f) + 0.5) & 3) == 0 ? 2 : (n4 == 1 ? 5 : (n4 == 2 ? 3 : (n4 == 3 ? 4 : 0)));
    }

    private static boolean lllIIIllIIIIlllIlIIllIIll(Block class_05492, class_1334 class_13342, int n, int n2, int n3, boolean bl) {
        if (class_05492 == Blocks.obsidian) {
            return false;
        }
        if (class_05492 != Blocks.llIIIIllIIIIIIIlIIIlIIIIl && class_05492 != Blocks.llIIIlllIlllIlIllIIIIllIl) {
            if (class_05492.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3) == -1.0f) {
                return false;
            }
            if (class_05492.llIIIlllIlllIlIllIIIIllIl() == 2) {
                return false;
            }
            if (class_05492.llIIIlllIlllIlIllIIIIllIl() == 1) {
                return bl;
            }
        } else if (class_1039.IIIllIllIIlIlIlIlIllllIIl(class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3))) {
            return false;
        }
        return !(class_05492 instanceof class_1770);
    }

    private static boolean IllIIlllllllIIlIIlIIIIlIl(class_1334 class_13342, int n, int n2, int n3, int n4) {
        int n5 = n + class_0573.lllIlIIlIIIlIlIIIllIlllIl[n4];
        int n6 = n2 + class_0573.IlIllllllIIlIIllllIIlIIIl[n4];
        int n7 = n3 + class_0573.lIlllIlllIIIIlIIlllIllIII[n4];
        for (int i = 0; i < 13; ++i) {
            if (n6 <= 0 || n6 >= 255) {
                return false;
            }
            Block class_05492 = class_13342.a_(n5, n6, n7);
            if (class_05492.lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll) break;
            if (!class_1039.lllIIIllIIIIlllIlIIllIIll(class_05492, class_13342, n5, n6, n7, true)) {
                return false;
            }
            if (class_05492.llIIIlllIlllIlIllIIIIllIl() == 1) break;
            if (i == 12) {
                return false;
            }
            n5 += class_0573.lllIlIIlIIIlIlIIIllIlllIl[n4];
            n6 += class_0573.IlIllllllIIlIIllllIIlIIIl[n4];
            n7 += class_0573.lIlllIlllIIIIlIIlllIllIII[n4];
        }
        return true;
    }

    private boolean IIIllIllIIlIlIlIlIllllIIl(class_1334 class_13342, int n, int n2, int n3, int n4) {
        int n5;
        int n6;
        int n7;
        int n8;
        int n9 = n + class_0573.lllIlIIlIIIlIlIIIllIlllIl[n4];
        int n10 = n2 + class_0573.IlIllllllIIlIIllllIIlIIIl[n4];
        int n11 = n3 + class_0573.lIlllIlllIIIIlIIlllIllIII[n4];
        for (n8 = 0; n8 < 13; ++n8) {
            if (n10 <= 0 || n10 >= 255) {
                return false;
            }
            Block class_05492 = class_13342.a_(n9, n10, n11);
            if (class_05492.lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll) break;
            if (!class_1039.lllIIIllIIIIlllIlIIllIIll(class_05492, class_13342, n9, n10, n11, true)) {
                return false;
            }
            if (class_05492.llIIIlllIlllIlIllIIIIllIl() != 1) {
                if (n8 == 12) {
                    return false;
                }
                n9 += class_0573.lllIlIIlIIIlIlIIIllIlllIl[n4];
                n10 += class_0573.IlIllllllIIlIIllllIIlIIIl[n4];
                n11 += class_0573.lIlllIlllIIIIlIIlllIllIII[n4];
                continue;
            }
            class_05492.lllIIIllIIIIlllIlIIllIIll(class_13342, n9, n10, n11, class_13342.IlIllllllIIlIIllllIIlIIIl(n9, n10, n11), 0);
            class_13342.lIllllIIlIIIlIllllllIIIll(n9, n10, n11);
            break;
        }
        n8 = n9;
        int n12 = n10;
        int n13 = n11;
        int n14 = 0;
        Block[] arrclass_0549 = new Block[13];
        while (n9 != n || n10 != n2 || n11 != n3) {
            n7 = n9 - class_0573.lllIlIIlIIIlIlIIIllIlllIl[n4];
            n6 = n10 - class_0573.IlIllllllIIlIIllllIIlIIIl[n4];
            n5 = n11 - class_0573.lIlllIlllIIIIlIIlllIllIII[n4];
            Block class_05493 = class_13342.a_(n7, n6, n5);
            int n15 = class_13342.IlIllllllIIlIIllllIIlIIIl(n7, n6, n5);
            if (class_05493 == this && n7 == n && n6 == n2 && n5 == n3) {
                class_13342.lllIIIllIIIIlllIlIIllIIll(n9, n10, n11, Blocks.lIlIIllllIlIIIIllIIIIlIIl, n4 | (this.llllllIlIllllIlIlIlIIIIlI ? 8 : 0), 4);
                class_13342.lllIIIllIIIIlllIlIIllIIll(n9, n10, n11, class_1293.lllIIIllIIIIlllIlIIllIIll(Blocks.IIllIllIIllIIlllIIIlIlllI, n4 | (this.llllllIlIllllIlIlIlIIIIlI ? 8 : 0), n4, true, false));
            } else {
                class_13342.lllIIIllIIIIlllIlIIllIIll(n9, n10, n11, Blocks.lIlIIllllIlIIIIllIIIIlIIl, n15, 4);
                class_13342.lllIIIllIIIIlllIlIIllIIll(n9, n10, n11, class_1293.lllIIIllIIIIlllIlIIllIIll(class_05493, n15, n4, true, false));
            }
            arrclass_0549[n14++] = class_05493;
            n9 = n7;
            n10 = n6;
            n11 = n5;
        }
        n9 = n8;
        n10 = n12;
        n11 = n13;
        n14 = 0;
        while (n9 != n || n10 != n2 || n11 != n3) {
            n7 = n9 - class_0573.lllIlIIlIIIlIlIIIllIlllIl[n4];
            n6 = n10 - class_0573.IlIllllllIIlIIllllIIlIIIl[n4];
            n5 = n11 - class_0573.lIlllIlllIIIIlIIlllIllIII[n4];
            class_13342.IlIllllllIIlIIllllIIlIIIl(n7, n6, n5, arrclass_0549[n14++]);
            n9 = n7;
            n10 = n6;
            n11 = n5;
        }
        return true;
    }
}

