package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.item.Item;

import java.util.List;

public class class_0819
extends class_1246 {
    @Override
    public String lllIIIllIIIIlllIlIIllIIll() {
        return "clear";
    }

    @Override
    public String lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692) {
        return "commands.clear.usage";
    }

    @Override
    public int lllIlIIlIIIlIlIIIllIlllIl() {
        return 2;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692, String[] arrstring) {
        int n;
        class_1822 class_18222 = arrstring.length == 0 ? class_0819.IlIllllllIIlIIllllIIlIIIl(class_19692) : class_0819.lIlllIlllIIIIlIIlllIllIII(class_19692, arrstring[0]);
        Item class_06112 = arrstring.length >= 2 ? class_0819.lIllllIIlIIIlIllllllIIIll(class_19692, arrstring[1]) : null;
        int n2 = n = arrstring.length >= 3 ? class_0819.lllIIIllIIIIlllIlIIllIIll(class_19692, arrstring[2], 0) : -1;
        if (arrstring.length >= 2 && class_06112 == null) {
            throw new class_1953("commands.clear.failure", class_18222.llllIIIIlIIIlIIIIIIlIllll());
        }
        int n3 = class_18222.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(class_06112, n);
        class_18222.IlIlllIIIIIIlIIllIIllIlll.IlIllllllIIlIIllllIIlIIIl();
        if (!class_18222.lIIlIlIlIlIllIIlIIllllIll.lIlllIlllIIIIlIIlllIllIII) {
            class_18222.IlIlllIIIIIIlIIllIIllIlll();
        }
        if (n3 == 0) {
            throw new class_1953("commands.clear.failure", class_18222.llllIIIIlIIIlIIIIIIlIllll());
        }
        class_0819.lllIIIllIIIIlllIlIIllIIll(class_19692, (class_0291)this, "commands.clear.success", class_18222.llllIIIIlIIIlIIIIIIlIllll(), n3);
    }

    @Override
    public List lllIlIIlIIIlIlIIIllIlllIl(class_1969 class_19692, String[] arrstring) {
        return arrstring.length == 1 ? class_0819.lllIIIllIIIIlllIlIIllIIll(arrstring, this.lIlllIlllIIIIlIIlllIllIII()) : (arrstring.length == 2 ? class_0819.lllIIIllIIIIlllIlIIllIIll(arrstring, Item.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl()) : null);
    }

    protected String[] lIlllIlllIIIIlIIlllIllIII() {
        return class_0220.IlIIlllllIIlIlIlllllIllll().llIIlIllIllllIlIIIIlIIlll();
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(String[] arrstring, int n) {
        return n == 0;
    }
}

