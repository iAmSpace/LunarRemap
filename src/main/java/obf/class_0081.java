package obf;

import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
class class_0081
extends class_1597 {
    final /* synthetic */ ItemStack IlIllllllIIlIIllllIIlIIIl;
    final /* synthetic */ class_0360 lIlllIlllIIIIlIIlllIllIII;

    class_0081(class_0360 class_03602, ItemStack class_08972) {
        this.lIlllIlllIIIIlIIlllIllIII = class_03602;
        this.IlIllllllIIlIIllllIIlIIIl = class_08972;
    }

    @Override
    protected class_1946 lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, class_2132 class_21322) {
        return new class_0426(class_13342, class_21322.lllIlIIlIIIlIlIIIllIlllIl(), class_21322.IlIllllllIIlIIllllIIlIIIl(), class_21322.lIlllIlllIIIIlIIlllIllIII(), this.IlIllllllIIlIIllllIIlIIIl.llIIlllIllIllllIIIlIIIIII());
    }

    @Override
    protected float lllIIIllIIIIlllIlIIllIIll() {
        return super.lllIIIllIIIIlllIlIIllIIll() * 0.5f;
    }

    @Override
    protected float lllIlIIlIIIlIlIIIllIlllIl() {
        return super.lllIlIIlIIIlIlIIIllIlllIl() * 1.25f;
    }
}

