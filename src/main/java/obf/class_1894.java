package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1894
extends class_0703 {
    private long lllIIIllIIIIlllIlIIllIIll;

    public class_1894() {
    }

    public class_1894(long l) {
        this.lllIIIllIIIIlllIlIIllIIll = l;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0181 class_01812) {
        this.lllIIIllIIIIlllIlIIllIIll = class_01812.readLong();
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0181 class_01812) {
        class_01812.writeLong(this.lllIIIllIIIIlllIlIIllIIll);
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0367 class_03672) {
        class_03672.lllIIIllIIIIlllIlIIllIIll(this);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll() {
        return true;
    }

    public long IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_2075 class_20752) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0367)class_20752);
    }
}

