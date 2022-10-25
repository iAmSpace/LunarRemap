package obf;

import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public class class_2236
extends class_1272 {
    private final class_2259 IllIIIllIIIIlIlIlIllIIlll;

    public class_2236(class_2259 class_22592) {
        super(class_22592);
        this.IllIIIllIIIIlIlIlIllIIlll = class_22592;
        this.IlIIIIIllllllIIlllIllllll(0);
        this.lllIIIllIIIIlllIlIIllIIll(true);
    }

    @Override
    public int lIlllIlllIIIIlIIlllIllIII(int n) {
        return n | 4;
    }

    @Override
    public IIcon IlIllllllIIlIIllllIIlIIIl(int n) {
        return this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(0, n);
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, int n) {
        return this.IllIIIllIIIIlIlIlIllIIlll.lIllllIIlIIIlIllllllIIIll(class_08972.IllIIIllIIIIlIlIlIllIIlll());
    }

    @Override
    public String IlIllllllIIlIIllllIIlIIIl(ItemStack class_08972) {
        int n = class_08972.IllIIIllIIIIlIlIlIllIIlll();
        if (n < 0 || n >= this.IllIIIllIIIIlIlIlIllIIlll.llIlllIIllIlllIlIlIlIIIll().length) {
            n = 0;
        }
        return super.IllIIIllIIIIlIlIlIllIIlll() + "." + this.IllIIIllIIIIlIlIlIllIIlll.llIlllIIllIlllIlIlIlIIIll()[n];
    }
}

