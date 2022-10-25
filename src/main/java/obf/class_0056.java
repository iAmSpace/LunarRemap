package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public class class_0056
extends class_1246 {
    @Override
    public String lllIIIllIIIIlllIlIIllIIll() {
        return "gamerule";
    }

    @Override
    public int lllIlIIlIIIlIlIIIllIlllIl() {
        return 2;
    }

    @Override
    public String lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692) {
        return "commands.gamerule.usage";
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692, String[] arrstring) {
        if (arrstring.length == 2) {
            String string = arrstring[0];
            String string2 = arrstring[1];
            class_1263 class_12632 = this.lIlllIlllIIIIlIIlllIllIII();
            if (class_12632.IlIllllllIIlIIllllIIlIIIl(string)) {
                class_12632.lllIlIIlIIIlIlIIIllIlllIl(string, string2);
                class_0056.lllIIIllIIIIlllIlIIllIIll(class_19692, (class_0291)this, "commands.gamerule.success", new Object[0]);
            } else {
                class_0056.lllIIIllIIIIlllIlIIllIIll(class_19692, (class_0291)this, "commands.gamerule.norule", string);
            }
        } else if (arrstring.length == 1) {
            String string = arrstring[0];
            class_1263 class_12633 = this.lIlllIlllIIIIlIIlllIllIII();
            if (class_12633.IlIllllllIIlIIllllIIlIIIl(string)) {
                String string3 = class_12633.lllIIIllIIIIlllIlIIllIIll(string);
                class_19692.lllIIIllIIIIlllIlIIllIIll(new class_0722(string).lllIIIllIIIIlllIlIIllIIll(" = ").lllIIIllIIIIlllIlIIllIIll(string3));
            } else {
                class_0056.lllIIIllIIIIlllIlIIllIIll(class_19692, (class_0291)this, "commands.gamerule.norule", string);
            }
        } else if (arrstring.length == 0) {
            class_1263 class_12634 = this.lIlllIlllIIIIlIIlllIllIII();
            class_19692.lllIIIllIIIIlllIlIIllIIll(new class_0722(class_0056.lllIIIllIIIIlllIlIIllIIll(class_12634.lllIlIIlIIIlIlIIIllIlllIl())));
        } else {
            throw new class_0932("commands.gamerule.usage", new Object[0]);
        }
    }

    @Override
    public List lllIlIIlIIIlIlIIIllIlllIl(class_1969 class_19692, String[] arrstring) {
        return arrstring.length == 1 ? class_0056.lllIIIllIIIIlllIlIIllIIll(arrstring, this.lIlllIlllIIIIlIIlllIllIII().lllIlIIlIIIlIlIIIllIlllIl()) : (arrstring.length == 2 ? class_0056.lllIIIllIIIIlllIlIIllIIll(arrstring, "true", "false") : null);
    }

    private class_1263 lIlllIlllIIIIlIIlllIllIII() {
        return class_0220.IlIIlllllIIlIlIlllllIllll().lllIIIllIIIIlllIlIIllIIll(0).IlIIlllllIIlIlIlllllIllll();
    }
}

