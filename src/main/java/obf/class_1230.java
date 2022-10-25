package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1230
extends class_0983 {
    public class_1230() {
        this.IllIIlllllllIIlIIlIIIIlIl = true;
    }

    public class_1230(double d, double d2, double d3, double d4, boolean bl) {
        this.lllIIIllIIIIlllIlIIllIIll = d;
        this.lllIlIIlIIIlIlIIIllIlllIl = d2;
        this.lIlllIlllIIIIlIIlllIllIII = d3;
        this.IlIllllllIIlIIllllIIlIIIl = d4;
        this.IIIllIIlIIIIIIlIlIIllIIlI = bl;
        this.IllIIlllllllIIlIIlIIIIlIl = true;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0181 class_01812) {
        this.lllIIIllIIIIlllIlIIllIIll = class_01812.readDouble();
        this.lllIlIIlIIIlIlIIIllIlllIl = class_01812.readDouble();
        this.lIlllIlllIIIIlIIlllIllIII = class_01812.readDouble();
        this.IlIllllllIIlIIllllIIlIIIl = class_01812.readDouble();
        super.lllIIIllIIIIlllIlIIllIIll(class_01812);
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0181 class_01812) {
        class_01812.writeDouble(this.lllIIIllIIIIlllIlIIllIIll);
        class_01812.writeDouble(this.lllIlIIlIIIlIlIIIllIlllIl);
        class_01812.writeDouble(this.lIlllIlllIIIIlIIlllIllIII);
        class_01812.writeDouble(this.IlIllllllIIlIIllllIIlIIIl);
        super.lllIlIIlIIIlIlIIIllIlllIl(class_01812);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_2075 class_20752) {
        super.lllIIIllIIIIlllIlIIllIIll((class_1829)class_20752);
    }
}

