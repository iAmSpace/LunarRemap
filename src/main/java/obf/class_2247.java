package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_2247
extends class_0703 {
    private int lllIIIllIIIIlllIlIIllIIll;
    private int lllIlIIlIIIlIlIIIllIlllIl;
    private String IlIllllllIIlIIllllIIlIIIl;
    private int lIlllIlllIIIIlIIlllIllIII;
    private boolean IlIIIIIllllllIIlllIllllll;
    private int lIllllIIlIIIlIllllllIIIll;

    public class_2247() {
    }

    public class_2247(int n, int n2, String string, int n3, boolean bl) {
        this.lllIIIllIIIIlllIlIIllIIll = n;
        this.lllIlIIlIIIlIlIIIllIlllIl = n2;
        this.IlIllllllIIlIIllllIIlIIIl = string;
        this.lIlllIlllIIIIlIIlllIllIII = n3;
        this.IlIIIIIllllllIIlllIllllll = bl;
    }

    public class_2247(int n, int n2, String string, int n3, boolean bl, int n4) {
        this(n, n2, string, n3, bl);
        this.lIllllIIlIIIlIllllllIIIll = n4;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0596 class_05962) {
        class_05962.lllIIIllIIIIlllIlIIllIIll(this);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0181 class_01812) {
        this.lllIIIllIIIIlllIlIIllIIll = class_01812.readUnsignedByte();
        this.lllIlIIlIIIlIlIIIllIlllIl = class_01812.readUnsignedByte();
        this.IlIllllllIIlIIllllIIlIIIl = class_01812.IlIllllllIIlIIllllIIlIIIl(32);
        this.lIlllIlllIIIIlIIlllIllIII = class_01812.readUnsignedByte();
        this.IlIIIIIllllllIIlllIllllll = class_01812.readBoolean();
        if (this.lllIlIIlIIIlIlIIIllIlllIl == 11) {
            this.lIllllIIlIIIlIllllllIIIll = class_01812.readInt();
        }
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0181 class_01812) {
        class_01812.writeByte(this.lllIIIllIIIIlllIlIIllIIll);
        class_01812.writeByte(this.lllIlIIlIIIlIlIIIllIlllIl);
        class_01812.lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl);
        class_01812.writeByte(this.lIlllIlllIIIIlIIlllIllIII);
        class_01812.writeBoolean(this.IlIIIIIllllllIIlllIllllll);
        if (this.lllIlIIlIIIlIlIIIllIlllIl == 11) {
            class_01812.writeInt(this.lIllllIIlIIIlIllllllIIIll);
        }
    }

    public int IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public int lIlllIlllIIIIlIIlllIllIII() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public String IlIIIIIllllllIIlllIllllll() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public int lIllllIIlIIIlIllllllIIIll() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    public boolean IIIllIIlIIIIIIlIlIIllIIlI() {
        return this.IlIIIIIllllllIIlllIllllll;
    }

    public int IllIIlllllllIIlIIlIIIIlIl() {
        return this.lIllllIIlIIIlIllllllIIIll;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_2075 class_20752) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0596)class_20752);
    }
}

