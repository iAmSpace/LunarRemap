package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1445
extends class_2038 {
    public class_1445() {
        this.IIIllIIlIIIIIIlIlIIllIIlI = true;
    }

    public class_1445(int n, byte by, byte by2, byte by3, byte by4, byte by5) {
        super(n);
        this.lllIlIIlIIIlIlIIIllIlllIl = by;
        this.IlIllllllIIlIIllllIIlIIIl = by2;
        this.lIlllIlllIIIIlIIlllIllIII = by3;
        this.IlIIIIIllllllIIlllIllllll = by4;
        this.lIllllIIlIIIlIllllllIIIll = by5;
        this.IIIllIIlIIIIIIlIlIIllIIlI = true;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0181 class_01812) {
        super.lllIIIllIIIIlllIlIIllIIll(class_01812);
        this.lllIlIIlIIIlIlIIIllIlllIl = class_01812.readByte();
        this.IlIllllllIIlIIllllIIlIIIl = class_01812.readByte();
        this.lIlllIlllIIIIlIIlllIllIII = class_01812.readByte();
        this.IlIIIIIllllllIIlllIllllll = class_01812.readByte();
        this.lIllllIIlIIIlIllllllIIIll = class_01812.readByte();
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0181 class_01812) {
        super.lllIlIIlIIIlIlIIIllIlllIl(class_01812);
        class_01812.writeByte(this.lllIlIIlIIIlIlIIIllIlllIl);
        class_01812.writeByte(this.IlIllllllIIlIIllllIIlIIIl);
        class_01812.writeByte(this.lIlllIlllIIIIlIIlllIllIII);
        class_01812.writeByte(this.IlIIIIIllllllIIlllIllllll);
        class_01812.writeByte(this.lIllllIIlIIIlIllllllIIIll);
    }

    @Override
    public String lllIlIIlIIIlIlIIIllIlllIl() {
        return super.lllIlIIlIIIlIlIIIllIlllIl() + String.format(", xa=%d, ya=%d, za=%d, yRot=%d, xRot=%d", this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll, this.lIllllIIlIIIlIllllllIIIll);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_2075 class_20752) {
        super.lllIIIllIIIIlllIlIIllIIll((class_0596)class_20752);
    }
}

