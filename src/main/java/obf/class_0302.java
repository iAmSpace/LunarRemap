package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0302
extends class_0703 {
    private int lllIIIllIIIIlllIlIIllIIll;
    private String lllIlIIlIIIlIlIIIllIlllIl;
    private int IlIllllllIIlIIllllIIlIIIl;
    private class_0546 lIlllIlllIIIIlIIlllIllIII;

    public class_0302() {
    }

    public class_0302(int n, String string, int n2, class_0546 class_05462) {
        this.lllIIIllIIIIlllIlIIllIIll = n;
        this.lllIlIIlIIIlIlIIIllIlllIl = string;
        this.IlIllllllIIlIIllllIIlIIIl = n2;
        this.lIlllIlllIIIIlIIlllIllIII = class_05462;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0181 class_01812) {
        this.lllIIIllIIIIlllIlIIllIIll = class_01812.lllIIIllIIIIlllIlIIllIIll();
        this.lllIlIIlIIIlIlIIIllIlllIl = class_01812.IlIllllllIIlIIllllIIlIIIl(255);
        this.IlIllllllIIlIIllllIIlIIIl = class_01812.readUnsignedShort();
        this.lIlllIlllIIIIlIIlllIllIII = class_0546.lllIIIllIIIIlllIlIIllIIll(class_01812.lllIIIllIIIIlllIlIIllIIll());
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0181 class_01812) {
        class_01812.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll);
        class_01812.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl);
        class_01812.writeShort(this.IlIllllllIIlIIllllIIlIIIl);
        class_01812.lllIlIIlIIIlIlIIIllIlllIl(this.lIlllIlllIIIIlIIlllIllIII.IlIllllllIIlIIllllIIlIIIl());
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_2128 class_21282) {
        class_21282.lllIIIllIIIIlllIlIIllIIll(this);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll() {
        return true;
    }

    public class_0546 IlIllllllIIlIIllllIIlIIIl() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    public int lIlllIlllIIIIlIIlllIllIII() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_2075 class_20752) {
        this.lllIIIllIIIIlllIlIIllIIll((class_2128)class_20752);
    }
}

