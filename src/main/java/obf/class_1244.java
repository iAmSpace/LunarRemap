package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1244
extends class_1246 {
    @Override
    public String lllIIIllIIIIlllIlIIllIIll() {
        return "setworldspawn";
    }

    @Override
    public int lllIlIIlIIIlIlIIIllIlllIl() {
        return 2;
    }

    @Override
    public String lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692) {
        return "commands.setworldspawn.usage";
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692, String[] arrstring) {
        if (arrstring.length == 3) {
            if (class_19692.IIllIllIIllIIlllIIIlIlllI() == null) {
                throw new class_0932("commands.setworldspawn.usage", new Object[0]);
            }
            int n = 0;
            int n2 = n + 1;
            int n3 = class_1244.lllIIIllIIIIlllIlIIllIIll(class_19692, arrstring[n], -30000000, 30000000);
            int n4 = class_1244.lllIIIllIIIIlllIlIIllIIll(class_19692, arrstring[n2++], 0, 256);
            int n5 = class_1244.lllIIIllIIIIlllIlIIllIIll(class_19692, arrstring[n2++], -30000000, 30000000);
            class_19692.IIllIllIIllIIlllIIIlIlllI().IlIIIlIIIIllIIIllIIIIIIll(n3, n4, n5);
            class_1244.lllIIIllIIIIlllIlIIllIIll(class_19692, (class_0291)this, "commands.setworldspawn.success", n3, n4, n5);
        } else {
            if (arrstring.length != 0) {
                throw new class_0932("commands.setworldspawn.usage", new Object[0]);
            }
            class_2208 class_22082 = class_1244.IlIllllllIIlIIllllIIlIIIl(class_19692).lllIIlIIIllllllIIIIlIlIlI();
            class_19692.IIllIllIIllIIlllIIIlIlllI().IlIIIlIIIIllIIIllIIIIIIll(class_22082.lllIIIllIIIIlllIlIIllIIll, class_22082.lllIlIIlIIIlIlIIIllIlllIl, class_22082.IlIllllllIIlIIllllIIlIIIl);
            class_1244.lllIIIllIIIIlllIlIIllIIll(class_19692, (class_0291)this, "commands.setworldspawn.success", class_22082.lllIIIllIIIIlllIlIIllIIll, class_22082.lllIlIIlIIIlIlIIIllIlllIl, class_22082.IlIllllllIIlIIllllIIlIIIl);
        }
    }
}

