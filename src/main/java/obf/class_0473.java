package obf;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0473
extends class_0408 {
    public class_0473(Block class_05492, class_1487 class_14872, String[] arrstring) {
        super(class_05492, class_14872, arrstring);
    }

    @Override
    public IIcon IlIllllllIIlIIllllIIlIIIl(int n) {
        return class_1487.IIIllIllIIlIlIlIlIllllIIl(n) == 0 ? ((class_1487)this.IllIIIllIIIIlIlIlIllIIlll).lIlIIllllIlIIIIllIIIIlIIl[0] : ((class_1487)this.IllIIIllIIIIlIlIlIllIIlll).lllIIIllIIIIlllIlIIllIIll(true, n);
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, int n) {
        int n2 = class_1487.IIIllIllIIlIlIlIlIllllIIl(class_08972.IllIIIllIIIIlIlIlIllIIlll());
        return n2 != 2 && n2 != 3 ? super.lllIIIllIIIIlllIlIIllIIll(class_08972, n) : class_0614.lllIIIllIIIIlllIlIIllIIll(0.5, 1.0);
    }
}

