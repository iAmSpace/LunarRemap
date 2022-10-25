package obf;

import net.minecraft.block.BlockDispenser;
import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0926
implements class_1677 {
    @Override
    public final ItemStack lllIIIllIIIIlllIlIIllIIll(class_1728 class_17282, ItemStack class_08972) {
        ItemStack class_08973 = this.lllIlIIlIIIlIlIIIllIlllIl(class_17282, class_08972);
        this.lllIIIllIIIIlllIlIIllIIll(class_17282);
        this.lllIIIllIIIIlllIlIIllIIll(class_17282, BlockDispenser.IllIIlllllllIIlIIlIIIIlIl(class_17282.IllIIlllllllIIlIIlIIIIlIl()));
        return class_08973;
    }

    protected ItemStack lllIlIIlIIIlIlIIIllIlllIl(class_1728 class_17282, ItemStack class_08972) {
        class_1188 class_11882 = BlockDispenser.IllIIlllllllIIlIIlIIIIlIl(class_17282.IllIIlllllllIIlIIlIIIIlIl());
        class_2132 class_21322 = BlockDispenser.lllIIIllIIIIlllIlIIllIIll(class_17282);
        ItemStack class_08973 = class_08972.lllIIIllIIIIlllIlIIllIIll(1);
        class_0926.lllIIIllIIIIlllIlIIllIIll(class_17282.lllIIIllIIIIlllIlIIllIIll(), class_08973, 6, class_11882, class_21322);
        return class_08972;
    }

    public static void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, ItemStack class_08972, int n, class_1188 class_11882, class_2132 class_21322) {
        double d = class_21322.lllIlIIlIIIlIlIIIllIlllIl();
        double d2 = class_21322.IlIllllllIIlIIllllIIlIIIl();
        double d3 = class_21322.lIlllIlllIIIIlIIlllIllIII();
        class_1781 class_17812 = new class_1781(class_13342, d, d2 - 0.3, d3, class_08972);
        double d4 = class_13342.lllllIlllIIllIlIIlIIIllII.nextDouble() * 0.1 + 0.2;
        class_17812.IIIIIIIIlIllIIllIIlllIllI = (double)class_11882.lllIIIllIIIIlllIlIIllIIll() * d4;
        class_17812.IIlIIlIlIlIllIIlIlIIIIlll = 0.2f;
        class_17812.llIIIlllIlllIlIllIIIIllIl = (double)class_11882.IlIllllllIIlIIllllIIlIIIl() * d4;
        class_17812.IIIIIIIIlIllIIllIIlllIllI += class_13342.lllllIlllIIllIlIIlIIIllII.nextGaussian() * (double)0.0075f * (double)n;
        class_17812.IIlIIlIlIlIllIIlIlIIIIlll += class_13342.lllllIlllIIllIlIIlIIIllII.nextGaussian() * (double)0.0075f * (double)n;
        class_17812.llIIIlllIlllIlIllIIIIllIl += class_13342.lllllIlllIIllIlIIlIIIllII.nextGaussian() * (double)0.0075f * (double)n;
        class_13342.lllIIIllIIIIlllIlIIllIIll(class_17812);
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_1728 class_17282) {
        class_17282.lllIIIllIIIIlllIlIIllIIll().IlIllllllIIlIIllllIIlIIIl(1000, class_17282.IlIIIIIllllllIIlllIllllll(), class_17282.lIllllIIlIIIlIllllllIIIll(), class_17282.IIIllIIlIIIIIIlIlIIllIIlI(), 0);
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_1728 class_17282, class_1188 class_11882) {
        class_17282.lllIIIllIIIIlllIlIIllIIll().IlIllllllIIlIIllllIIlIIIl(2000, class_17282.IlIIIIIllllllIIlllIllllll(), class_17282.lIllllIIlIIIlIllllllIIIll(), class_17282.IIIllIIlIIIIIIlIlIIllIIlI(), this.lllIIIllIIIIlllIlIIllIIll(class_11882));
    }

    private int lllIIIllIIIIlllIlIIllIIll(class_1188 class_11882) {
        return class_11882.lllIIIllIIIIlllIlIIllIIll() + 1 + (class_11882.IlIllllllIIlIIllllIIlIIIl() + 1) * 3;
    }
}

