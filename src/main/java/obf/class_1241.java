package obf;

import net.minecraft.block.BlockDispenser;
import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1241
extends BlockDispenser {
    private final class_1677 llIIlIIllIIllIlIIllIIllII = new class_0926();

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
        this.llIIIIllIIIIIIIlIIIlIIIIl = class_08872.lllIIIllIIIIlllIlIIllIIll("furnace_side");
        this.llIlllIIllIlllIlIlIlIIIll = class_08872.lllIIIllIIIIlllIlIIllIIll("furnace_top");
        this.IIIIlIIlIIIllIIIIllIIIlII = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_front_horizontal");
        this.lllIIIIIIlIlllIIlIlIIIllI = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_front_vertical");
    }

    @Override
    protected class_1677 lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972) {
        return this.llIIlIIllIIllIlIIllIIllII;
    }

    @Override
    public class_1774 lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n) {
        return new class_1798();
    }

    @Override
    protected void IllIIIllIIIIlIlIlIllIIlll(class_1334 class_13342, int n, int n2, int n3) {
        class_1101 class_11012 = new class_1101(class_13342, n, n2, n3);
        class_1646 class_16462 = (class_1646)class_11012.IIIllIllIIlIlIlIlIllllIIl();
        if (class_16462 != null) {
            int n4 = class_16462.lllIIIllIIIIlllIlIIllIIll();
            if (n4 < 0) {
                class_13342.IlIllllllIIlIIllllIIlIIIl(1001, n, n2, n3, 0);
            } else {
                ItemStack class_08972;
                ItemStack class_08973 = class_16462.llIIllIllIlIIlIIllIllllll(n4);
                int n5 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3) & 7;
                class_0850 class_08502 = class_0879.lllIlIIlIIIlIlIIIllIlllIl(class_13342, n + class_0573.lllIlIIlIIIlIlIIIllIlllIl[n5], (double)(n2 + class_0573.IlIllllllIIlIIllllIIlIIIl[n5]), (double)(n3 + class_0573.lIlllIlllIIIIlIIlllIllIII[n5]));
                if (class_08502 != null) {
                    class_08972 = class_0879.lllIIIllIIIIlllIlIIllIIll(class_08502, class_08973.llIIlllIllIllllIIIlIIIIII().lllIIIllIIIIlllIlIIllIIll(1), class_0573.lllIIIllIIIIlllIlIIllIIll[n5]);
                    if (class_08972 == null) {
                        class_08972 = class_08973.llIIlllIllIllllIIIlIIIIII();
                        if (--class_08972.lllIlIIlIIIlIlIIIllIlllIl == 0) {
                            class_08972 = null;
                        }
                    } else {
                        class_08972 = class_08973.llIIlllIllIllllIIIlIIIIII();
                    }
                } else {
                    class_08972 = this.llIIlIIllIIllIlIIllIIllII.lllIIIllIIIIlllIlIIllIIll(class_11012, class_08973);
                    if (class_08972 != null && class_08972.lllIlIIlIIIlIlIIIllIlllIl == 0) {
                        class_08972 = null;
                    }
                }
                class_16462.lllIlIIlIIIlIlIIIllIlllIl(n4, class_08972);
            }
        }
    }
}

