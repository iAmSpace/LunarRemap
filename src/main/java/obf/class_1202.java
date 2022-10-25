package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1202
extends class_2038 {
    public class_1202() {
    }

    public class_1202(int n, byte by, byte by2, byte by3) {
        super(n);
        this.lllIlIIlIIIlIlIIIllIlllIl = by;
        this.IlIllllllIIlIIllllIIlIIIl = by2;
        this.lIlllIlllIIIIlIIlllIllIII = by3;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0181 class_01812) {
        super.lllIIIllIIIIlllIlIIllIIll(class_01812);
        this.lllIlIIlIIIlIlIIIllIlllIl = class_01812.readByte();
        this.IlIllllllIIlIIllllIIlIIIl = class_01812.readByte();
        this.lIlllIlllIIIIlIIlllIllIII = class_01812.readByte();
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0181 class_01812) {
        super.lllIlIIlIIIlIlIIIllIlllIl(class_01812);
        class_01812.writeByte(this.lllIlIIlIIIlIlIIIllIlllIl);
        class_01812.writeByte(this.IlIllllllIIlIIllllIIlIIIl);
        class_01812.writeByte(this.lIlllIlllIIIIlIIlllIllIII);
    }

    @Override
    public String lllIlIIlIIIlIlIIIllIlllIl() {
        return super.lllIlIIlIIIlIlIIIllIlllIl() + String.format(", xa=%d, ya=%d, za=%d", this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_2075 class_20752) {
        super.lllIIIllIIIIlllIlIIllIIll((class_0596)class_20752);
    }
}

