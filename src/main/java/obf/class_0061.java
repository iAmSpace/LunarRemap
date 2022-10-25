package obf;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0061
extends class_0143 {
    private boolean llllllIlIllllIlIlIlIIIIlI;
    private class_2102 lIlIIllllIlIIIIllIIIIlIIl;
    private class_2102 llIlllIIllIlllIlIlIlIIIll;

    protected class_0061(boolean bl) {
        super(class_1855.IllIIIIllIIllIllIlllIlIIl);
        this.lllIIIllIIIIlllIlIIllIIll(true);
        this.llllllIlIllllIlIlIlIIIIlI = bl;
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.lllIlIIlIIIlIlIIIllIlllIl);
    }

    @Override
    public class_2102 lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        return n == 1 ? this.lIlIIllllIlIIIIllIIIIlIIl : (n == 0 ? this.lIlIIllllIlIIIIllIIIIlIIl : (n2 == 2 && n == 2 ? this.llIlllIIllIlllIlIlIlIIIll : (n2 == 3 && n == 5 ? this.llIlllIIllIlllIlIlIlIIIll : (n2 == 0 && n == 3 ? this.llIlllIIllIlllIlIlIlIIIll : (n2 == 1 && n == 4 ? this.llIlllIIllIlllIlIlIlIIIll : this.llIIIIllIIIIIIIlIIIlIIIIl)))));
    }

    @Override
    public void lIlllIlllIIIIlIIlllIllIII(class_1334 class_13342, int n, int n2, int n3) {
        super.lIlllIlllIIIIlIIlllIllIII(class_13342, n, n2, n3);
        if (class_13342.a_(n, n2 - 1, n3) == Blocks.IIIlIllllIIIlllllIllIlIII && class_13342.a_(n, n2 - 2, n3) == Blocks.IIIlIllllIIIlllllIllIlIII) {
            if (!class_13342.IllIIIIllIIllIllIlllIlIIl) {
                class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, class_0061.lllIIIllIIIIlllIlIIllIIll(0), 0, 2);
                class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2 - 1, n3, class_0061.lllIIIllIIIIlllIlIIllIIll(0), 0, 2);
                class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2 - 2, n3, class_0061.lllIIIllIIIIlllIlIIllIIll(0), 0, 2);
                class_1405 class_14052 = new class_1405(class_13342);
                class_14052.lllIlIIlIIIlIlIIIllIlllIl((double)n + 0.5, (double)n2 - 1.95, (double)n3 + 0.5, 0.0f, 0.0f);
                class_13342.lllIIIllIIIIlllIlIIllIIll(class_14052);
                class_13342.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3, class_0061.lllIIIllIIIIlllIlIIllIIll(0));
                class_13342.lllIlIIlIIIlIlIIIllIlllIl(n, n2 - 1, n3, class_0061.lllIIIllIIIIlllIlIIllIIll(0));
                class_13342.lllIlIIlIIIlIlIIIllIlllIl(n, n2 - 2, n3, class_0061.lllIIIllIIIIlllIlIIllIIll(0));
            }
            for (int i = 0; i < 120; ++i) {
                class_13342.lllIIIllIIIIlllIlIIllIIll("snowshovel", (double)n + class_13342.lllllIlllIIllIlIIlIIIllII.nextDouble(), (double)(n2 - 2) + class_13342.lllllIlllIIllIlIIlIIIllII.nextDouble() * 2.5, (double)n3 + class_13342.lllllIlllIIllIlIIlIIIllII.nextDouble(), 0.0, 0.0, 0.0);
            }
        } else if (class_13342.a_(n, n2 - 1, n3) == Blocks.IllllIIIIlIIlIIIIlllIIIIl && class_13342.a_(n, n2 - 2, n3) == Blocks.IllllIIIIlIIlIIIIlllIIIIl) {
            boolean bl;
            boolean bl2 = class_13342.a_(n - 1, n2 - 1, n3) == Blocks.IllllIIIIlIIlIIIIlllIIIIl && class_13342.a_(n + 1, n2 - 1, n3) == Blocks.IllllIIIIlIIlIIIIlllIIIIl;
            boolean bl3 = bl = class_13342.a_(n, n2 - 1, n3 - 1) == Blocks.IllllIIIIlIIlIIIIlllIIIIl && class_13342.a_(n, n2 - 1, n3 + 1) == Blocks.IllllIIIIlIIlIIIIlllIIIIl;
            if (bl2 || bl) {
                class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, class_0061.lllIIIllIIIIlllIlIIllIIll(0), 0, 2);
                class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2 - 1, n3, class_0061.lllIIIllIIIIlllIlIIllIIll(0), 0, 2);
                class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2 - 2, n3, class_0061.lllIIIllIIIIlllIlIIllIIll(0), 0, 2);
                if (bl2) {
                    class_13342.lllIIIllIIIIlllIlIIllIIll(n - 1, n2 - 1, n3, class_0061.lllIIIllIIIIlllIlIIllIIll(0), 0, 2);
                    class_13342.lllIIIllIIIIlllIlIIllIIll(n + 1, n2 - 1, n3, class_0061.lllIIIllIIIIlllIlIIllIIll(0), 0, 2);
                } else {
                    class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2 - 1, n3 - 1, class_0061.lllIIIllIIIIlllIlIIllIIll(0), 0, 2);
                    class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2 - 1, n3 + 1, class_0061.lllIIIllIIIIlllIlIIllIIll(0), 0, 2);
                }
                class_0991 class_09912 = new class_0991(class_13342);
                class_09912.IIIllIllIIlIlIlIlIllllIIl(true);
                class_09912.lllIlIIlIIIlIlIIIllIlllIl((double)n + 0.5, (double)n2 - 1.95, (double)n3 + 0.5, 0.0f, 0.0f);
                class_13342.lllIIIllIIIIlllIlIIllIIll(class_09912);
                for (int i = 0; i < 120; ++i) {
                    class_13342.lllIIIllIIIIlllIlIIllIIll("snowballpoof", (double)n + class_13342.lllllIlllIIllIlIIlIIIllII.nextDouble(), (double)(n2 - 2) + class_13342.lllllIlllIIllIlIIlIIIllII.nextDouble() * 3.9, (double)n3 + class_13342.lllllIlllIIllIlIIlIIIllII.nextDouble(), 0.0, 0.0, 0.0);
                }
                class_13342.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3, class_0061.lllIIIllIIIIlllIlIIllIIll(0));
                class_13342.lllIlIIlIIIlIlIIIllIlllIl(n, n2 - 1, n3, class_0061.lllIIIllIIIIlllIlIIllIIll(0));
                class_13342.lllIlIIlIIIlIlIIIllIlllIl(n, n2 - 2, n3, class_0061.lllIIIllIIIIlllIlIIllIIll(0));
                if (bl2) {
                    class_13342.lllIlIIlIIIlIlIIIllIlllIl(n - 1, n2 - 1, n3, class_0061.lllIIIllIIIIlllIlIIllIIll(0));
                    class_13342.lllIlIIlIIIlIlIIIllIlllIl(n + 1, n2 - 1, n3, class_0061.lllIIIllIIIIlllIlIIllIIll(0));
                } else {
                    class_13342.lllIlIIlIIIlIlIIIllIlllIl(n, n2 - 1, n3 - 1, class_0061.lllIIIllIIIIlllIlIIllIIll(0));
                    class_13342.lllIlIIlIIIlIlIIIllIlllIl(n, n2 - 1, n3 + 1, class_0061.lllIIIllIIIIlllIlIIllIIll(0));
                }
            }
        }
    }

    @Override
    public boolean IlIIIIIllllllIIlllIllllll(class_1334 class_13342, int n, int n2, int n3) {
        return class_13342.a_((int)n, (int)n2, (int)n3).IlIlIIlllIllllllllIIIlIlI.IIIllIllIIlIlIlIlIllllIIl() && class_1334.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2 - 1, n3);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_1965 class_19652, ItemStack class_08972) {
        int n4 = MathHelper.IlIllllllIIlIIllllIIlIIIl((double)(class_19652.IIIIlIllIlIIlIIlIllIlIlll * 4.0f / 360.0f) + 2.5) & 3;
        class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n4, 2);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
        this.llIlllIIllIlllIlIlIlIIIll = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_face_" + (this.llllllIlIllllIlIlIlIIIIlI ? "on" : "off"));
        this.lIlIIllllIlIIIIllIIIIlIIl = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_top");
        this.llIIIIllIIIIIIIlIIIlIIIIl = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_side");
    }
}

