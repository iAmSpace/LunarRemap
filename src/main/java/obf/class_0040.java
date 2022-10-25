package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.util.ChatComponentTranslation;

import java.util.List;

public class class_0040
extends class_1246 {
    @Override
    public String lllIIIllIIIIlllIlIIllIIll() {
        return "effect";
    }

    @Override
    public int lllIlIIlIIIlIlIIIllIlllIl() {
        return 2;
    }

    @Override
    public String lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692) {
        return "commands.effect.usage";
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692, String[] arrstring) {
        if (arrstring.length < 2) {
            throw new class_0932("commands.effect.usage", new Object[0]);
        }
        class_1822 class_18222 = class_0040.lIlllIlllIIIIlIIlllIllIII(class_19692, arrstring[0]);
        if (arrstring[1].equals("clear")) {
            if (class_18222.IIllIIIlIIllllIIIIIIIIlll().isEmpty()) {
                throw new class_1953("commands.effect.failure.notActive.all", class_18222.llllIIIIlIIIlIIIIIIlIllll());
            }
            class_18222.IlIIllIIIlIlIlIIlIlIllIIl();
            class_0040.lllIIIllIIIIlllIlIIllIIll(class_19692, (class_0291)this, "commands.effect.success.removed.all", class_18222.llllIIIIlIIIlIIIIIIlIllll());
        } else {
            int n = class_0040.lllIIIllIIIIlllIlIIllIIll(class_19692, arrstring[1], 1);
            int n2 = 600;
            int n3 = 30;
            int n4 = 0;
            if (n < 0 || n >= class_0700.lllIIIllIIIIlllIlIIllIIll.length || class_0700.lllIIIllIIIIlllIlIIllIIll[n] == null) {
                throw new class_1956("commands.effect.notFound", n);
            }
            if (arrstring.length >= 3) {
                n3 = class_0040.lllIIIllIIIIlllIlIIllIIll(class_19692, arrstring[2], 0, 1000000);
                n2 = class_0700.lllIIIllIIIIlllIlIIllIIll[n].lllIlIIlIIIlIlIIIllIlllIl() ? n3 : n3 * 20;
            } else if (class_0700.lllIIIllIIIIlllIlIIllIIll[n].lllIlIIlIIIlIlIIIllIlllIl()) {
                n2 = 1;
            }
            if (arrstring.length >= 4) {
                n4 = class_0040.lllIIIllIIIIlllIlIIllIIll(class_19692, arrstring[3], 0, 255);
            }
            if (n3 == 0) {
                if (!class_18222.llIIllIllIlIIlIIllIllllll(n)) {
                    throw new class_1953("commands.effect.failure.notActive", new ChatComponentTranslation(class_0700.lllIIIllIIIIlllIlIIllIIll[n].IlIllllllIIlIIllllIIlIIIl(), new Object[0]), class_18222.llllIIIIlIIIlIIIIIIlIllll());
                }
                class_18222.IlIlllIIIIIIlIIllIIllIlll(n);
                class_0040.lllIIIllIIIIlllIlIIllIIll(class_19692, (class_0291)this, "commands.effect.success.removed", new ChatComponentTranslation(class_0700.lllIIIllIIIIlllIlIIllIIll[n].IlIllllllIIlIIllllIIlIIIl(), new Object[0]), class_18222.llllIIIIlIIIlIIIIIIlIllll());
            } else {
                class_1852 class_18522 = new class_1852(n, n2, n4);
                class_18222.lllIIIllIIIIlllIlIIllIIll(class_18522);
                class_0040.lllIIIllIIIIlllIlIIllIIll(class_19692, (class_0291)this, "commands.effect.success", new ChatComponentTranslation(class_18522.IlIIIIIllllllIIlllIllllll(), new Object[0]), n, n4, class_18222.llllIIIIlIIIlIIIIIIlIllll(), n3);
            }
        }
    }

    @Override
    public List lllIlIIlIIIlIlIIIllIlllIl(class_1969 class_19692, String[] arrstring) {
        return arrstring.length == 1 ? class_0040.lllIIIllIIIIlllIlIIllIIll(arrstring, this.lIlllIlllIIIIlIIlllIllIII()) : null;
    }

    protected String[] lIlllIlllIIIIlIIlllIllIII() {
        return class_0220.IlIIlllllIIlIlIlllllIllll().llIIlIllIllllIlIIIIlIIlll();
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(String[] arrstring, int n) {
        return n == 0;
    }
}

