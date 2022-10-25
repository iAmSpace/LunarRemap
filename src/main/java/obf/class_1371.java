package obf;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
class class_1371
extends class_1291 {
    final /* synthetic */ int lllIIIllIIIIlllIlIIllIIll;
    final /* synthetic */ class_1414 lllIlIIlIIIlIlIIIllIlllIl;

    class_1371(class_1414 class_14142, class_0850 class_08502, int n, int n2, int n3, int n4) {
        this.lllIlIIlIIIlIlIIIllIlllIl = class_14142;
        this.lllIIIllIIIIlllIlIIllIIll = n4;
        super(class_08502, n, n2, n3);
    }

    @Override
    public int lIlllIlllIIIIlIIlllIllIII() {
        return 1;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972) {
        return class_08972 == null ? false : (class_08972.lllIIIllIIIIlllIlIIllIIll() instanceof class_0981 ? ((class_0981)class_08972.lllIIIllIIIIlllIlIIllIIll()).IllIIIllIIIIlIlIlIllIIlll == this.lllIIIllIIIIlllIlIIllIIll : (class_08972.lllIIIllIIIIlllIlIIllIIll() != Item.getItemFromBlock(Blocks.lIlIIlllllIlllllIlIIIllll) && class_08972.lllIIIllIIIIlllIlIIllIIll() != Items.skull ? false : this.lllIIIllIIIIlllIlIIllIIll == 0));
    }

    @Override
    public class_2102 IlIIIIIllllllIIlllIllllll() {
        return class_0981.lIllllIIlIIIlIllllllIIIll(this.lllIIIllIIIIlllIlIIllIIll);
    }
}

