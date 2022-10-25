package obf;

import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1935
implements class_0830 {
    private final ItemStack lIlllIlllIIIIlIIlllIllIII;

    public class_1935(ItemStack class_08972) {
        this.lIlllIlllIIIIlIIlllIllIII = class_08972;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212) {
        if (!class_15212.IlllIIlllllllIIllIlIllllI()) {
            return false;
        }
        if (!(class_15212 instanceof class_1965)) {
            return false;
        }
        class_1965 class_19652 = (class_1965)class_15212;
        return class_19652.IlIllllllIIlIIllllIIlIIIl(class_0339.a_(this.lIlllIlllIIIIlIIlllIllIII)) != null ? false : (class_19652 instanceof class_0339 ? ((class_0339)class_19652).lIIlIlllIIlIIIIlIlIIIIlll() : class_19652 instanceof class_0814);
    }
}

