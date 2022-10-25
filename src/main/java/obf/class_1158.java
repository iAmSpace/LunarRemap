package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;

public class class_1158
extends class_1246 {
    @Override
    public String lllIIIllIIIIlllIlIIllIIll() {
        return "give";
    }

    @Override
    public int lllIlIIlIIIlIlIIIllIlllIl() {
        return 2;
    }

    @Override
    public String lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692) {
        return "commands.give.usage";
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692, String[] arrstring) {
        Object object;
        if (arrstring.length < 2) {
            throw new class_0932("commands.give.usage", new Object[0]);
        }
        class_1822 class_18222 = class_1158.lIlllIlllIIIIlIIlllIllIII(class_19692, arrstring[0]);
        Item class_06112 = class_1158.lIllllIIlIIIlIllllllIIIll(class_19692, arrstring[1]);
        int n = 1;
        int n2 = 0;
        if (arrstring.length >= 3) {
            n = class_1158.lllIIIllIIIIlllIlIIllIIll(class_19692, arrstring[2], 1, 64);
        }
        if (arrstring.length >= 4) {
            n2 = class_1158.lllIIIllIIIIlllIlIIllIIll(class_19692, arrstring[3]);
        }
        ItemStack class_08972 = new ItemStack(class_06112, n, n2);
        if (arrstring.length >= 5) {
            object = class_1158.lllIIIllIIIIlllIlIIllIIll(class_19692, arrstring, 4).IlIllllllIIlIIllllIIlIIIl();
            try {
                class_2037 class_20372 = class_0605.lllIIIllIIIIlllIlIIllIIll((String)object);
                if (!(class_20372 instanceof class_0775)) {
                    class_1158.lllIIIllIIIIlllIlIIllIIll(class_19692, (class_0291)this, "commands.give.tagError", "Not a valid tag");
                    return;
                }
                class_08972.lIlllIlllIIIIlIIlllIllIII((class_0775)class_20372);
            }
            catch (class_1323 class_13232) {
                class_1158.lllIIIllIIIIlllIlIIllIIll(class_19692, (class_0291)this, "commands.give.tagError", class_13232.getMessage());
                return;
            }
        }
        object = class_18222.lllIIIllIIIIlllIlIIllIIll(class_08972, false);
        ((class_1781)object).lllIlIIlIIIlIlIIIllIlllIl = 0;
        ((class_1781)object).lllIIIllIIIIlllIlIIllIIll(class_18222.llllIIIIlIIIlIIIIIIlIllll());
        class_1158.lllIIIllIIIIlllIlIIllIIll(class_19692, (class_0291)this, "commands.give.success", class_08972.IIlIIlIlIlIllIIlIlIIIIlll(), n, class_18222.llllIIIIlIIIlIIIIIIlIllll());
    }

    @Override
    public List lllIlIIlIIIlIlIIIllIlllIl(class_1969 class_19692, String[] arrstring) {
        return arrstring.length == 1 ? class_1158.lllIIIllIIIIlllIlIIllIIll(arrstring, this.lIlllIlllIIIIlIIlllIllIII()) : (arrstring.length == 2 ? class_1158.lllIIIllIIIIlllIlIIllIIll(arrstring, Item.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl()) : null);
    }

    protected String[] lIlllIlllIIIIlIIlllIllIII() {
        return class_0220.IlIIlllllIIlIlIlllllIllll().llIIlIllIllllIlIIIIlIIlll();
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(String[] arrstring, int n) {
        return n == 0;
    }
}

