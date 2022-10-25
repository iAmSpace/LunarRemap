package obf;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
class class_0073
extends class_1291 {
    final /* synthetic */ class_1387 lllIIIllIIIIlllIlIIllIIll;

    class_0073(class_1387 class_13872, class_0850 class_08502, int n, int n2, int n3) {
        this.lllIIIllIIIIlllIlIIllIIll = class_13872;
        super(class_08502, n, n2, n3);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972) {
        return super.lllIIIllIIIIlllIlIIllIIll(class_08972) && class_08972.lllIIIllIIIIlllIlIIllIIll() == Items.saddle && !this.lllIlIIlIIIlIlIIIllIlllIl();
    }
}

