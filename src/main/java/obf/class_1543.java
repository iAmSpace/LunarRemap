package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1543
extends class_1246 {
    @Override
    public String lllIIIllIIIIlllIlIIllIIll() {
        return "setidletimeout";
    }

    @Override
    public int lllIlIIlIIIlIlIIIllIlllIl() {
        return 3;
    }

    @Override
    public String lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692) {
        return "commands.setidletimeout.usage";
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692, String[] arrstring) {
        if (arrstring.length != 1) {
            throw new class_0932("commands.setidletimeout.usage", new Object[0]);
        }
        int n = class_1543.lllIIIllIIIIlllIlIIllIIll(class_19692, arrstring[0], 0);
        class_0220.IlIIlllllIIlIlIlllllIllll().IlIllllllIIlIIllllIIlIIIl(n);
        class_1543.lllIIIllIIIIlllIlIIllIIll(class_19692, (class_0291)this, "commands.setidletimeout.success", n);
    }
}

