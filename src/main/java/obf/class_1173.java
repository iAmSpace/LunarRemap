package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.BlockDispenser;
import net.minecraft.item.ItemStack;

import java.util.Random;

final class class_1173
extends class_0926 {
    class_1173() {
    }

    @Override
    public ItemStack lllIlIIlIIIlIlIIIllIlllIl(class_1728 class_17282, ItemStack class_08972) {
        class_1188 class_11882 = BlockDispenser.IllIIlllllllIIlIIlIIIIlIl(class_17282.IllIIlllllllIIlIIlIIIIlIl());
        class_2132 class_21322 = BlockDispenser.lllIIIllIIIIlllIlIIllIIll(class_17282);
        double d = class_21322.lllIlIIlIIIlIlIIIllIlllIl() + (double)((float)class_11882.lllIIIllIIIIlllIlIIllIIll() * 0.3f);
        double d2 = class_21322.IlIllllllIIlIIllllIIlIIIl() + (double)((float)class_11882.lllIIIllIIIIlllIlIIllIIll() * 0.3f);
        double d3 = class_21322.lIlllIlllIIIIlIIlllIllIII() + (double)((float)class_11882.IlIllllllIIlIIllllIIlIIIl() * 0.3f);
        class_1334 class_13342 = class_17282.lllIIIllIIIIlllIlIIllIIll();
        Random random = class_13342.lllllIlllIIllIlIIlIIIllII;
        double d4 = random.nextGaussian() * 0.05 + (double)class_11882.lllIIIllIIIIlllIlIIllIIll();
        double d5 = random.nextGaussian() * 0.05 + (double)class_11882.lllIlIIlIIIlIlIIIllIlllIl();
        double d6 = random.nextGaussian() * 0.05 + (double)class_11882.IlIllllllIIlIIllllIIlIIIl();
        class_13342.lllIIIllIIIIlllIlIIllIIll(new class_1332(class_13342, d, d2, d3, d4, d5, d6));
        class_08972.lllIIIllIIIIlllIlIIllIIll(1);
        return class_08972;
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1728 class_17282) {
        class_17282.lllIIIllIIIIlllIlIIllIIll().IlIllllllIIlIIllllIIlIIIl(1009, class_17282.IlIIIIIllllllIIlllIllllll(), class_17282.lIllllIIlIIIlIllllllIIIll(), class_17282.IIIllIIlIIIIIIlIlIIllIIlI(), 0);
    }
}

