package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0499
extends class_0703 {
    private class_1297 lllIIIllIIIIlllIlIIllIIll;

    public class_0499() {
    }

    public class_0499(class_1297 class_12972) {
        this.lllIIIllIIIIlllIlIIllIIll = class_12972;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0181 class_01812) {
        this.lllIIIllIIIIlllIlIIllIIll = class_1297.lllIIIllIIIIlllIlIIllIIll()[class_01812.readByte() % class_1297.lllIIIllIIIIlllIlIIllIIll().length];
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0181 class_01812) {
        class_01812.writeByte(class_1297.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll));
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1829 class_18292) {
        class_18292.lllIIIllIIIIlllIlIIllIIll(this);
    }

    public class_1297 IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_2075 class_20752) {
        this.lllIIIllIIIIlllIlIIllIIll((class_1829)class_20752);
    }
}

