package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0431
extends class_2038 {
    public class_0431() {
        this.IIIllIIlIIIIIIlIlIIllIIlI = true;
    }

    public class_0431(int n, byte by, byte by2) {
        super(n);
        this.IlIIIIIllllllIIlllIllllll = by;
        this.lIllllIIlIIIlIllllllIIIll = by2;
        this.IIIllIIlIIIIIIlIlIIllIIlI = true;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0181 class_01812) {
        super.lllIIIllIIIIlllIlIIllIIll(class_01812);
        this.IlIIIIIllllllIIlllIllllll = class_01812.readByte();
        this.lIllllIIlIIIlIllllllIIIll = class_01812.readByte();
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0181 class_01812) {
        super.lllIlIIlIIIlIlIIIllIlllIl(class_01812);
        class_01812.writeByte(this.IlIIIIIllllllIIlllIllllll);
        class_01812.writeByte(this.lIllllIIlIIIlIllllllIIIll);
    }

    @Override
    public String lllIlIIlIIIlIlIIIllIlllIl() {
        return super.lllIlIIlIIIlIlIIIllIlllIl() + String.format(", yRot=%d, xRot=%d", this.IlIIIIIllllllIIlllIllllll, this.lIllllIIlIIIlIllllllIIIll);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_2075 class_20752) {
        super.lllIIIllIIIIlllIlIIllIIll((class_0596)class_20752);
    }
}

