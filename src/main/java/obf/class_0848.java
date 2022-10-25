package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.item.ItemStack;

import java.util.List;

public class class_0848
extends class_1246 {
    @Override
    public String lllIIIllIIIIlllIlIIllIIll() {
        return "enchant";
    }

    @Override
    public int lllIlIIlIIIlIlIIIllIlllIl() {
        return 2;
    }

    @Override
    public String lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692) {
        return "commands.enchant.usage";
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692, String[] arrstring) {
        class_2145 class_21452;
        if (arrstring.length < 2) {
            throw new class_0932("commands.enchant.usage", new Object[0]);
        }
        class_1822 class_18222 = class_0848.lIlllIlllIIIIlIIlllIllIII(class_19692, arrstring[0]);
        int n = class_0848.lllIIIllIIIIlllIlIIllIIll(class_19692, arrstring[1], 0, class_1469.lllIIIllIIIIlllIlIIllIIll.length - 1);
        int n2 = 1;
        ItemStack class_08972 = class_18222.IllIlIlIIIlIllIlIlIIlllII();
        if (class_08972 == null) {
            throw new class_1953("commands.enchant.noItem", new Object[0]);
        }
        class_1469 class_14692 = class_1469.lllIIIllIIIIlllIlIIllIIll[n];
        if (class_14692 == null) {
            throw new class_1956("commands.enchant.notFound", n);
        }
        if (!class_14692.lllIIIllIIIIlllIlIIllIIll(class_08972)) {
            throw new class_1953("commands.enchant.cantEnchant", new Object[0]);
        }
        if (arrstring.length >= 3) {
            n2 = class_0848.lllIIIllIIIIlllIlIIllIIll(class_19692, arrstring[2], class_14692.lllIlIIlIIIlIlIIIllIlllIl(), class_14692.IlIllllllIIlIIllllIIlIIIl());
        }
        if (class_08972.IlIlIIlIlIllIIlIlIIllIIIl() && (class_21452 = class_08972.IlIlIIlllIIlIllIIIlllllIl()) != null) {
            for (int i = 0; i < class_21452.lIlllIlllIIIIlIIlllIllIII(); ++i) {
                class_1469 class_14693;
                short s = class_21452.lllIlIIlIIIlIlIIIllIlllIl(i).IlIIIIIllllllIIlllIllllll("id");
                if (class_1469.lllIIIllIIIIlllIlIIllIIll[s] == null || (class_14693 = class_1469.lllIIIllIIIIlllIlIIllIIll[s]).lllIIIllIIIIlllIlIIllIIll(class_14692)) continue;
                throw new class_1953("commands.enchant.cantCombine", class_14692.IlIllllllIIlIIllllIIlIIIl(n2), class_14693.IlIllllllIIlIIllllIIlIIIl(class_21452.lllIlIIlIIIlIlIIIllIlllIl(i).IlIIIIIllllllIIlllIllllll("lvl")));
            }
        }
        class_08972.lllIIIllIIIIlllIlIIllIIll(class_14692, n2);
        class_0848.lllIIIllIIIIlllIlIIllIIll(class_19692, (class_0291)this, "commands.enchant.success", new Object[0]);
    }

    @Override
    public List lllIlIIlIIIlIlIIIllIlllIl(class_1969 class_19692, String[] arrstring) {
        return arrstring.length == 1 ? class_0848.lllIIIllIIIIlllIlIIllIIll(arrstring, this.lIlllIlllIIIIlIIlllIllIII()) : null;
    }

    protected String[] lIlllIlllIIIIlIIlllIllIII() {
        return class_0220.IlIIlllllIIlIlIlllllIllll().llIIlIllIllllIlIIIIlIIlll();
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(String[] arrstring, int n) {
        return n == 0;
    }
}

