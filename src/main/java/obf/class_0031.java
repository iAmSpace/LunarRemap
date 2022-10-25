package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public class class_0031
extends class_1246 {
    @Override
    public String lllIIIllIIIIlllIlIIllIIll() {
        return "summon";
    }

    @Override
    public int lllIlIIlIIIlIlIIIllIlllIl() {
        return 2;
    }

    @Override
    public String lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692) {
        return "commands.summon.usage";
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692, String[] arrstring) {
        class_1334 class_13342;
        if (arrstring.length < 1) {
            throw new class_0932("commands.summon.usage", new Object[0]);
        }
        String string = arrstring[0];
        double d = (double)class_19692.lllIIlIIIllllllIIIIlIlIlI().lllIIIllIIIIlllIlIIllIIll + 0.5;
        double d2 = class_19692.lllIIlIIIllllllIIIIlIlIlI().lllIlIIlIIIlIlIIIllIlllIl;
        double d3 = (double)class_19692.lllIIlIIIllllllIIIIlIlIlI().IlIllllllIIlIIllllIIlIIIl + 0.5;
        if (arrstring.length >= 4) {
            d = class_0031.lllIIIllIIIIlllIlIIllIIll(class_19692, d, arrstring[1]);
            d2 = class_0031.lllIIIllIIIIlllIlIIllIIll(class_19692, d2, arrstring[2]);
            d3 = class_0031.lllIIIllIIIIlllIlIIllIIll(class_19692, d3, arrstring[3]);
        }
        if (!(class_13342 = class_19692.IIllIllIIllIIlllIIIlIlllI()).IlIIIIIllllllIIlllIllllll((int)d, (int)d2, (int)d3)) {
            class_0031.lllIIIllIIIIlllIlIIllIIll(class_19692, (class_0291)this, "commands.summon.outOfWorld", new Object[0]);
        } else {
            Object object;
            Object object2;
            class_0775 class_07752 = new class_0775();
            boolean bl = false;
            if (arrstring.length >= 5) {
                object2 = class_0031.lllIIIllIIIIlllIlIIllIIll(class_19692, arrstring, 4);
                try {
                    object = class_0605.lllIIIllIIIIlllIlIIllIIll(object2.IlIllllllIIlIIllllIIlIIIl());
                    if (!(object instanceof class_0775)) {
                        class_0031.lllIIIllIIIIlllIlIIllIIll(class_19692, (class_0291)this, "commands.summon.tagError", "Not a valid tag");
                        return;
                    }
                    class_07752 = (class_0775)object;
                    bl = true;
                }
                catch (class_1323 class_13232) {
                    class_0031.lllIIIllIIIIlllIlIIllIIll(class_19692, (class_0291)this, "commands.summon.tagError", class_13232.getMessage());
                    return;
                }
            }
            class_07752.lllIIIllIIIIlllIlIIllIIll("id", string);
            object2 = class_0054.lllIIIllIIIIlllIlIIllIIll(class_07752, class_13342);
            if (object2 == null) {
                class_0031.lllIIIllIIIIlllIlIIllIIll(class_19692, (class_0291)this, "commands.summon.failed", new Object[0]);
            } else {
                ((class_1521)object2).lllIlIIlIIIlIlIIIllIlllIl(d, d2, d3, ((class_1521)object2).IIIIlIllIlIIlIIlIllIlIlll, ((class_1521)object2).IlIlIIlllIllllllllIIIlIlI);
                if (!bl && object2 instanceof class_0339) {
                    ((class_0339)object2).lllIIIllIIIIlllIlIIllIIll((class_2025)null);
                }
                class_13342.lllIIIllIIIIlllIlIIllIIll((class_1521)object2);
                object = object2;
                class_0775 class_07753 = class_07752;
                while (object != null && class_07753.lllIlIIlIIIlIlIIIllIlllIl("Riding", 10)) {
                    class_1521 class_15212 = class_0054.lllIIIllIIIIlllIlIIllIIll(class_07753.llIIllIllIlIIlIIllIllllll("Riding"), class_13342);
                    if (class_15212 != null) {
                        class_15212.lllIlIIlIIIlIlIIIllIlllIl(d, d2, d3, class_15212.IIIIlIllIlIIlIIlIllIlIlll, class_15212.IlIlIIlllIllllllllIIIlIlI);
                        class_13342.lllIIIllIIIIlllIlIIllIIll(class_15212);
                        ((class_1521)object).lllIIIllIIIIlllIlIIllIIll(class_15212);
                    }
                    object = class_15212;
                    class_07753 = class_07753.llIIllIllIlIIlIIllIllllll("Riding");
                }
                class_0031.lllIIIllIIIIlllIlIIllIIll(class_19692, (class_0291)this, "commands.summon.success", new Object[0]);
            }
        }
    }

    @Override
    public List lllIlIIlIIIlIlIIIllIlllIl(class_1969 class_19692, String[] arrstring) {
        return arrstring.length == 1 ? class_0031.lllIIIllIIIIlllIlIIllIIll(arrstring, this.lIlllIlllIIIIlIIlllIllIII()) : null;
    }

    protected String[] lIlllIlllIIIIlIIlllIllIII() {
        return class_0054.lllIlIIlIIIlIlIIIllIlllIl().toArray(new String[0]);
    }
}

