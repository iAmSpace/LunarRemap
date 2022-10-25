package obf;

import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
class class_0228
extends class_1291 {
    final /* synthetic */ class_1627 lllIIIllIIIIlllIlIIllIIll;
    final /* synthetic */ class_1387 lllIlIIlIIIlIlIIIllIlllIl;

    class_0228(class_1387 class_13872, class_0850 class_08502, int n, int n2, int n3, class_1627 class_16272) {
        this.lllIlIIlIIIlIlIIIllIlllIl = class_13872;
        this.lllIIIllIIIIlllIlIIllIIll = class_16272;
        super(class_08502, n, n2, n3);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972) {
        return super.lllIIIllIIIIlllIlIIllIIll(class_08972) && this.lllIIIllIIIIlllIlIIllIIll.IIIIIIIllllllIIIIllIIIIII() && class_1627.lllIIIllIIIIlllIlIIllIIll(class_08972.lllIIIllIIIIlllIlIIllIIll());
    }

    @Override
    public boolean lIllllIIlIIIlIllllllIIIll() {
        return this.lllIIIllIIIIlllIlIIllIIll.IIIIIIIllllllIIIIllIIIIII();
    }
}

