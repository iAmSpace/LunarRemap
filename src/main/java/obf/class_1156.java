package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1156
extends class_1246 {
    @Override
    public String lllIIIllIIIIlllIlIIllIIll() {
        return "playsound";
    }

    @Override
    public int lllIlIIlIIIlIlIIIllIlllIl() {
        return 2;
    }

    @Override
    public String lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692) {
        return "commands.playsound.usage";
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692, String[] arrstring) {
        if (arrstring.length < 2) {
            throw new class_0932(this.lllIIIllIIIIlllIlIIllIIll(class_19692), new Object[0]);
        }
        int n = 0;
        int n2 = n + 1;
        String string = arrstring[n];
        class_1822 class_18222 = class_1156.lIlllIlllIIIIlIIlllIllIII(class_19692, arrstring[n2++]);
        double d = class_18222.lllIIlIIIllllllIIIIlIlIlI().lllIIIllIIIIlllIlIIllIIll;
        double d2 = class_18222.lllIIlIIIllllllIIIIlIlIlI().lllIlIIlIIIlIlIIIllIlllIl;
        double d3 = class_18222.lllIIlIIIllllllIIIIlIlIlI().IlIllllllIIlIIllllIIlIIIl;
        double d4 = 1.0;
        double d5 = 1.0;
        double d6 = 0.0;
        if (arrstring.length > n2) {
            d = class_1156.lllIIIllIIIIlllIlIIllIIll(class_19692, d, arrstring[n2++]);
        }
        if (arrstring.length > n2) {
            d2 = class_1156.lllIIIllIIIIlllIlIIllIIll(class_19692, d2, arrstring[n2++], 0, 0);
        }
        if (arrstring.length > n2) {
            d3 = class_1156.lllIIIllIIIIlllIlIIllIIll(class_19692, d3, arrstring[n2++]);
        }
        if (arrstring.length > n2) {
            d4 = class_1156.lllIIIllIIIIlllIlIIllIIll(class_19692, arrstring[n2++], 0.0, 3.4028234663852886E38);
        }
        if (arrstring.length > n2) {
            d5 = class_1156.lllIIIllIIIIlllIlIIllIIll(class_19692, arrstring[n2++], 0.0, 2.0);
        }
        if (arrstring.length > n2) {
            d6 = class_1156.lllIIIllIIIIlllIlIIllIIll(class_19692, arrstring[n2++], 0.0, 1.0);
        }
        double d7 = d4 > 1.0 ? d4 * 16.0 : 16.0;
        double d8 = class_18222.IIIllIIlIIIIIIlIlIIllIIlI(d, d2, d3);
        if (d8 > d7) {
            if (d6 <= 0.0) {
                throw new class_1953("commands.playsound.playerTooFar", class_18222.llllIIIIlIIIlIIIIIIlIllll());
            }
            double d9 = d - class_18222.IlIIlllllIIlIlIlllllIllll;
            double d10 = d2 - class_18222.llIIlIlIlllIIllIlIlllIllI;
            double d11 = d3 - class_18222.IllIIIIllIIllIllIlllIlIIl;
            double d12 = Math.sqrt(d9 * d9 + d10 * d10 + d11 * d11);
            double d13 = class_18222.IlIIlllllIIlIlIlllllIllll;
            double d14 = class_18222.llIIlIlIlllIIllIlIlllIllI;
            double d15 = class_18222.IllIIIIllIIllIllIlllIlIIl;
            if (d12 > 0.0) {
                d13 += d9 / d12 * 2.0;
                d14 += d10 / d12 * 2.0;
                d15 += d11 / d12 * 2.0;
            }
            class_18222.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new class_0633(string, d13, d14, d15, (float)d6, (float)d5));
        } else {
            class_18222.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new class_0633(string, d, d2, d3, (float)d4, (float)d5));
        }
        class_1156.lllIIIllIIIIlllIlIIllIIll(class_19692, (class_0291)this, "commands.playsound.success", string, class_18222.llllIIIIlIIIlIIIIIIlIllll());
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(String[] arrstring, int n) {
        return n == 1;
    }
}

