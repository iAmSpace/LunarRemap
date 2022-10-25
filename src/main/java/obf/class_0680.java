package obf;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
class class_0680
extends class_1291 {
    final /* synthetic */ class_1410 lllIIIllIIIIlllIlIIllIIll;

    public class_0680(class_1410 class_14102, class_0850 class_08502, int n, int n2, int n3) {
        this.lllIIIllIIIIlllIlIIllIIll = class_14102;
        super(class_08502, n, n2, n3);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972) {
        return class_08972 == null ? false : class_08972.lllIIIllIIIIlllIlIIllIIll() == Items.IIllllIIlIlIlIlllIIIllIIl || class_08972.lllIIIllIIIIlllIlIIllIIll() == Items.diamond || class_08972.lllIIIllIIIIlllIlIIllIIll() == Items.lIIIIlIlIIlllllIIllIIlIII || class_08972.lllIIIllIIIIlllIlIIllIIll() == Items.iron_ingot;
    }

    @Override
    public int lIlllIlllIIIIlIIlllIllIII() {
        return 1;
    }
}

