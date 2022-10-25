package obf;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public class class_2033
extends class_1272 {
    private final Block IllIIIllIIIIlIlIlIllIIlll;
    private String[] lIIIIlIlIIlllllIIllIIlIII;

    public class_2033(Block class_05492, boolean bl) {
        super(class_05492);
        this.IllIIIllIIIIlIlIlIllIIlll = class_05492;
        if (bl) {
            this.IlIIIIIllllllIIlllIllllll(0);
            this.lllIIIllIIIIlllIlIIllIIll(true);
        }
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, int n) {
        return this.IllIIIllIIIIlIlIlIllIIlll.lIllllIIlIIIlIllllllIIIll(class_08972.IllIIIllIIIIlIlIlIllIIlll());
    }

    @Override
    public class_2102 IlIllllllIIlIIllllIIlIIIl(int n) {
        return this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(0, n);
    }

    @Override
    public int lIlllIlllIIIIlIIlllIllIII(int n) {
        return n;
    }

    public class_2033 lllIIIllIIIIlllIlIIllIIll(String[] arrstring) {
        this.lIIIIlIlIIlllllIIllIIlIII = arrstring;
        return this;
    }

    @Override
    public String IlIllllllIIlIIllllIIlIIIl(ItemStack class_08972) {
        if (this.lIIIIlIlIIlllllIIllIIlIII == null) {
            return super.IlIllllllIIlIIllllIIlIIIl(class_08972);
        }
        int n = class_08972.IllIIIllIIIIlIlIlIllIIlll();
        return n >= 0 && n < this.lIIIIlIlIIlllllIIllIIlIII.length ? super.IlIllllllIIlIIllllIIlIIIl(class_08972) + "." + this.lIIIIlIlIIlllllIIllIIlIII[n] : super.IlIllllllIIlIIllllIIlIIIl(class_08972);
    }
}

