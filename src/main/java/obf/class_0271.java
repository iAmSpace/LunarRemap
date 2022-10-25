package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0271
extends class_0703 {
    private int lllIIIllIIIIlllIlIIllIIll;
    private class_1999 lllIlIIlIIIlIlIIIllIlllIl;
    private class_2243 IlIllllllIIlIIllllIIlIIIl;
    private class_1074 lIlllIlllIIIIlIIlllIllIII;

    public class_0271() {
    }

    public class_0271(int n, class_1999 class_19992, class_1074 class_10742, class_2243 class_22432) {
        this.lllIIIllIIIIlllIlIIllIIll = n;
        this.lllIlIIlIIIlIlIIIllIlllIl = class_19992;
        this.IlIllllllIIlIIllllIIlIIIl = class_22432;
        this.lIlllIlllIIIIlIIlllIllIII = class_10742;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0596 class_05962) {
        class_05962.lllIIIllIIIIlllIlIIllIIll(this);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0181 class_01812) {
        this.lllIIIllIIIIlllIlIIllIIll = class_01812.readInt();
        this.lllIlIIlIIIlIlIIIllIlllIl = class_1999.lllIIIllIIIIlllIlIIllIIll(class_01812.readUnsignedByte());
        this.IlIllllllIIlIIllllIIlIIIl = class_2243.lllIIIllIIIIlllIlIIllIIll(class_01812.readUnsignedByte());
        this.lIlllIlllIIIIlIIlllIllIII = class_1074.lllIIIllIIIIlllIlIIllIIll(class_01812.IlIllllllIIlIIllllIIlIIIl(16));
        if (this.lIlllIlllIIIIlIIlllIllIII == null) {
            this.lIlllIlllIIIIlIIlllIllIII = class_1074.lllIlIIlIIIlIlIIIllIlllIl;
        }
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0181 class_01812) {
        class_01812.writeInt(this.lllIIIllIIIIlllIlIIllIIll);
        class_01812.writeByte(this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll());
        class_01812.writeByte(this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll());
        class_01812.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll());
    }

    public int IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public class_1999 lIlllIlllIIIIlIIlllIllIII() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public class_2243 IlIIIIIllllllIIlllIllllll() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public class_1074 lIllllIIlIIIlIllllllIIIll() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_2075 class_20752) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0596)class_20752);
    }
}

