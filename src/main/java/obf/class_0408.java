package obf;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0408
extends class_1272 {
    protected final Block IllIIIllIIIIlIlIlIllIIlll;
    protected final String[] lIIIIlIlIIlllllIIllIIlIII;

    public class_0408(Block class_05492, Block class_05493, String[] arrstring) {
        super(class_05492);
        this.IllIIIllIIIIlIlIlIllIIlll = class_05493;
        this.lIIIIlIlIIlllllIIllIIlIII = arrstring;
        this.IlIIIIIllllllIIlllIllllll(0);
        this.lllIIIllIIIIlllIlIIllIIll(true);
    }

    @Override
    public IIcon IlIllllllIIlIIllllIIlIIIl(int n) {
        return this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(2, n);
    }

    @Override
    public int lIlllIlllIIIIlIIlllIllIII(int n) {
        return n;
    }

    @Override
    public String IlIllllllIIlIIllllIIlIIIl(ItemStack class_08972) {
        int n = class_08972.IllIIIllIIIIlIlIlIllIIlll();
        if (n < 0 || n >= this.lIIIIlIlIIlllllIIllIIlIII.length) {
            n = 0;
        }
        return super.IllIIIllIIIIlIlIlIllIIlll() + "." + this.lIIIIlIlIIlllllIIllIIlIII[n];
    }
}

