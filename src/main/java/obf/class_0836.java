package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0836
extends class_0703 {
    private float lllIIIllIIIIlllIlIIllIIll;
    private float lllIlIIlIIIlIlIIIllIlllIl;
    private boolean IlIllllllIIlIIllllIIlIIIl;
    private boolean lIlllIlllIIIIlIIlllIllIII;

    public class_0836() {
    }

    public class_0836(float f, float f2, boolean bl, boolean bl2) {
        this.lllIIIllIIIIlllIlIIllIIll = f;
        this.lllIlIIlIIIlIlIIIllIlllIl = f2;
        this.IlIllllllIIlIIllllIIlIIIl = bl;
        this.lIlllIlllIIIIlIIlllIllIII = bl2;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0181 class_01812) {
        this.lllIIIllIIIIlllIlIIllIIll = class_01812.readFloat();
        this.lllIlIIlIIIlIlIIIllIlllIl = class_01812.readFloat();
        this.IlIllllllIIlIIllllIIlIIIl = class_01812.readBoolean();
        this.lIlllIlllIIIIlIIlllIllIII = class_01812.readBoolean();
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0181 class_01812) {
        class_01812.writeFloat(this.lllIIIllIIIIlllIlIIllIIll);
        class_01812.writeFloat(this.lllIlIIlIIIlIlIIIllIlllIl);
        class_01812.writeBoolean(this.IlIllllllIIlIIllllIIlIIIl);
        class_01812.writeBoolean(this.lIlllIlllIIIIlIIlllIllIII);
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1829 class_18292) {
        class_18292.lllIIIllIIIIlllIlIIllIIll(this);
    }

    public float IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public float lIlllIlllIIIIlIIlllIllIII() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public boolean IlIIIIIllllllIIlllIllllll() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public boolean lIllllIIlIIIlIllllllIIIll() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_2075 class_20752) {
        this.lllIIIllIIIIlllIlIIllIIll((class_1829)class_20752);
    }
}

