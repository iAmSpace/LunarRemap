package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0545
extends class_1030 {
    private Number lllIIIllIIIIlllIlIIllIIll;
    private Number lllIlIIlIIIlIlIIIllIlllIl;

    public class_0545(String string, String string2, Number number) {
        super("nr_" + string, string2, number);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(String string) {
        this.lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl(string));
    }

    public void lllIIIllIIIIlllIlIIllIIll(Number number) {
        int n = ((Comparable)((Object)number)).compareTo(this.lllIIIllIIIIlllIlIIllIIll);
        int n2 = ((Comparable)((Object)number)).compareTo(this.lllIlIIlIIIlIlIIIllIlllIl);
        if (n >= 0 && n2 <= 0) {
            super.lllIIIllIIIIlllIlIIllIIll(number);
        }
    }

    private Number IlIllllllIIlIIllllIIlIIIl(String string) {
        Double d = Double.parseDouble(string);
        Class<?> class_ = string.getClass();
        Number number = class_ == Integer.class ? (Number)((Number)d).intValue() : (Number)(class_ == Float.class ? (Number)Float.valueOf(((Number)d).floatValue()) : (Number)(class_ == Long.class ? (Number)((Number)d).longValue() : (Number)(class_ == Short.class ? (Number)((Number)d).shortValue() : (Number)d)));
        return number;
    }
}

