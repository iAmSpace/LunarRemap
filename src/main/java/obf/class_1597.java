package obf;

import net.minecraft.block.BlockDispenser;
import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public abstract class class_1597
extends class_0926 {
    public static byte[] lllIIIllIIIIlllIlIIllIIll = new byte[]{-79, -43, -115, -37, 123, -61, -50, 32, 38, -121, -87, -31, -33, -40, -10, -15};

    @Override
    public ItemStack lllIlIIlIIIlIlIIIllIlllIl(class_1728 class_17282, ItemStack class_08972) {
        class_1334 class_13342 = class_17282.lllIIIllIIIIlllIlIIllIIll();
        class_2132 class_21322 = BlockDispenser.lllIIIllIIIIlllIlIIllIIll(class_17282);
        class_1188 class_11882 = BlockDispenser.IllIIlllllllIIlIIlIIIIlIl(class_17282.IllIIlllllllIIlIIlIIIIlIl());
        class_1946 class_19462 = this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_21322);
        class_19462.a_(class_11882.lllIIIllIIIIlllIlIIllIIll(), (float)class_11882.lllIlIIlIIIlIlIIIllIlllIl() + 0.1f, class_11882.IlIllllllIIlIIllllIIlIIIl(), this.lllIlIIlIIIlIlIIIllIlllIl(), this.lllIIIllIIIIlllIlIIllIIll());
        class_13342.lllIIIllIIIIlllIlIIllIIll((class_1521)((Object)class_19462));
        class_08972.lllIIIllIIIIlllIlIIllIIll(1);
        return class_08972;
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1728 class_17282) {
        class_17282.lllIIIllIIIIlllIlIIllIIll().IlIllllllIIlIIllllIIlIIIl(1002, class_17282.IlIIIIIllllllIIlllIllllll(), class_17282.lIllllIIlIIIlIllllllIIIll(), class_17282.IIIllIIlIIIIIIlIlIIllIIlI(), 0);
    }

    protected abstract class_1946 lllIIIllIIIIlllIlIIllIIll(class_1334 var1, class_2132 var2);

    protected float lllIIIllIIIIlllIlIIllIIll() {
        return 6.0f;
    }

    protected float lllIlIIlIIIlIlIIIllIlllIl() {
        return 1.1f;
    }
}

