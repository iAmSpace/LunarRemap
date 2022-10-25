package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1540
extends class_0983 {
    public class_1540() {
        this.IIIllIllIIlIlIlIlIllllIIl = true;
    }

    public class_1540(float f, float f2, boolean bl) {
        this.IlIIIIIllllllIIlllIllllll = f;
        this.lIllllIIlIIIlIllllllIIIll = f2;
        this.IIIllIIlIIIIIIlIlIIllIIlI = bl;
        this.IIIllIllIIlIlIlIlIllllIIl = true;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0181 class_01812) {
        this.IlIIIIIllllllIIlllIllllll = class_01812.readFloat();
        this.lIllllIIlIIIlIllllllIIIll = class_01812.readFloat();
        super.lllIIIllIIIIlllIlIIllIIll(class_01812);
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0181 class_01812) {
        class_01812.writeFloat(this.IlIIIIIllllllIIlllIllllll);
        class_01812.writeFloat(this.lIllllIIlIIIlIllllllIIIll);
        super.lllIlIIlIIIlIlIIIllIlllIl(class_01812);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_2075 class_20752) {
        super.lllIIIllIIIIlllIlIIllIIll((class_1829)class_20752);
    }
}

