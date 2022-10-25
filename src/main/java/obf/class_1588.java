package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1588
extends class_0703 {
    private String lllIIIllIIIIlllIlIIllIIll = "";
    private String lllIlIIlIIIlIlIIIllIlllIl = "";
    private int IlIllllllIIlIIllllIIlIIIl;
    private int lIlllIlllIIIIlIIlllIllIII;

    public class_1588() {
    }

    public class_1588(class_0678 class_06782, int n) {
        this.lllIIIllIIIIlllIlIIllIIll = class_06782.lIlllIlllIIIIlIIlllIllIII();
        this.lllIlIIlIIIlIlIIIllIlllIl = class_06782.IlIllllllIIlIIllllIIlIIIl().lllIlIIlIIIlIlIIIllIlllIl();
        this.IlIllllllIIlIIllllIIlIIIl = class_06782.lllIlIIlIIIlIlIIIllIlllIl();
        this.lIlllIlllIIIIlIIlllIllIII = n;
    }

    public class_1588(String string) {
        this.lllIIIllIIIIlllIlIIllIIll = string;
        this.lllIlIIlIIIlIlIIIllIlllIl = "";
        this.IlIllllllIIlIIllllIIlIIIl = 0;
        this.lIlllIlllIIIIlIIlllIllIII = 1;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0181 class_01812) {
        this.lllIIIllIIIIlllIlIIllIIll = class_01812.IlIllllllIIlIIllllIIlIIIl(16);
        this.lIlllIlllIIIIlIIlllIllIII = class_01812.readByte();
        if (this.lIlllIlllIIIIlIIlllIllIII != 1) {
            this.lllIlIIlIIIlIlIIIllIlllIl = class_01812.IlIllllllIIlIIllllIIlIIIl(16);
            this.IlIllllllIIlIIllllIIlIIIl = class_01812.readInt();
        }
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0181 class_01812) {
        class_01812.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll);
        class_01812.writeByte(this.lIlllIlllIIIIlIIlllIllIII);
        if (this.lIlllIlllIIIIlIIlllIllIII != 1) {
            class_01812.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl);
            class_01812.writeInt(this.IlIllllllIIlIIllllIIlIIIl);
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0596 class_05962) {
        class_05962.lllIIIllIIIIlllIlIIllIIll(this);
    }

    public String IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public String lIlllIlllIIIIlIIlllIllIII() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public int IlIIIIIllllllIIlllIllllll() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public int lIllllIIlIIIlIllllllIIIll() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_2075 class_20752) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0596)class_20752);
    }
}

