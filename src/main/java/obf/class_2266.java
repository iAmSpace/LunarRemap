package obf;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public class class_2266
extends class_1272 {
    public class_2266(Block class_05492) {
        super(class_05492);
        this.IlIIIIIllllllIIlllIllllll(0);
        this.lllIIIllIIIIlllIlIIllIIll(true);
    }

    @Override
    public class_2102 IlIllllllIIlIIllllIIlIIIl(int n) {
        return this.IIIllIllIIlIlIlIlIllllIIl.lllIlIIlIIIlIlIIIllIlllIl(2, class_0974.IllIIlllllllIIlIIlIIIIlIl(n));
    }

    @Override
    public int lIlllIlllIIIIlIIlllIllIII(int n) {
        return n;
    }

    @Override
    public String IlIllllllIIlIIllllIIlIIIl(ItemStack class_08972) {
        return super.IllIIIllIIIIlIlIlIllIIlll() + "." + class_1908.IIIllIllIIlIlIlIlIllllIIl[class_0974.IllIIlllllllIIlIIlIIIIlIl(class_08972.IllIIIllIIIIlIlIlIllIIlll())];
    }
}

