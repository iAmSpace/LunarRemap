package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 */
import org.apache.commons.lang3.ArrayUtils;

public class class_1719
extends class_0703 {
    private String[] lllIIIllIIIIlllIlIIllIIll;

    public class_1719() {
    }

    public class_1719(String[] arrstring) {
        this.lllIIIllIIIIlllIlIIllIIll = arrstring;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0181 class_01812) {
        this.lllIIIllIIIIlllIlIIllIIll = new String[class_01812.lllIIIllIIIIlllIlIIllIIll()];
        for (int i = 0; i < this.lllIIIllIIIIlllIlIIllIIll.length; ++i) {
            this.lllIIIllIIIIlllIlIIllIIll[i] = class_01812.IlIllllllIIlIIllllIIlIIIl(32767);
        }
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0181 class_01812) {
        class_01812.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll.length);
        for (String string : this.lllIIIllIIIIlllIlIIllIIll) {
            class_01812.lllIIIllIIIIlllIlIIllIIll(string);
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0596 class_05962) {
        class_05962.lllIIIllIIIIlllIlIIllIIll(this);
    }

    public String[] IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    @Override
    public String lllIlIIlIIIlIlIIIllIlllIl() {
        return String.format("candidates='%s'", ArrayUtils.toString((Object)this.lllIIIllIIIIlllIlIIllIIll));
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_2075 class_20752) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0596)class_20752);
    }
}

