package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.StringUtils
 */
import org.apache.commons.lang3.StringUtils;

public class class_0287
extends class_0703 {
    private String lllIIIllIIIIlllIlIIllIIll;

    public class_0287() {
    }

    public class_0287(String string) {
        this.lllIIIllIIIIlllIlIIllIIll = string;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0181 class_01812) {
        this.lllIIIllIIIIlllIlIIllIIll = class_01812.IlIllllllIIlIIllllIIlIIIl(32767);
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0181 class_01812) {
        class_01812.lllIIIllIIIIlllIlIIllIIll(StringUtils.substring((String)this.lllIIIllIIIIlllIlIIllIIll, (int)0, (int)32767));
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1829 class_18292) {
        class_18292.lllIIIllIIIIlllIlIIllIIll(this);
    }

    public String IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    @Override
    public String lllIlIIlIIIlIlIIIllIlllIl() {
        return String.format("message='%s'", this.lllIIIllIIIIlllIlIIllIIll);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_2075 class_20752) {
        this.lllIIIllIIIIlllIlIIllIIll((class_1829)class_20752);
    }
}

