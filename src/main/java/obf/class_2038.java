package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_2038
extends class_0703 {
    protected int lllIIIllIIIIlllIlIIllIIll;
    protected byte lllIlIIlIIIlIlIIIllIlllIl;
    protected byte IlIllllllIIlIIllllIIlIIIl;
    protected byte lIlllIlllIIIIlIIlllIllIII;
    protected byte IlIIIIIllllllIIlllIllllll;
    protected byte lIllllIIlIIIlIllllllIIIll;
    protected boolean IIIllIIlIIIIIIlIlIIllIIlI;

    public class_2038() {
    }

    public class_2038(int n) {
        this.lllIIIllIIIIlllIlIIllIIll = n;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0181 class_01812) {
        this.lllIIIllIIIIlllIlIIllIIll = class_01812.readInt();
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0181 class_01812) {
        class_01812.writeInt(this.lllIIIllIIIIlllIlIIllIIll);
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0596 class_05962) {
        class_05962.lllIIIllIIIIlllIlIIllIIll(this);
    }

    @Override
    public String lllIlIIlIIIlIlIIIllIlllIl() {
        return String.format("id=%d", this.lllIIIllIIIIlllIlIIllIIll);
    }

    @Override
    public String toString() {
        return "Entity_" + super.toString();
    }

    public class_1521 lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342) {
        return class_13342.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll);
    }

    public byte IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public byte lIlllIlllIIIIlIIlllIllIII() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public byte IlIIIIIllllllIIlllIllllll() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    public byte lIllllIIlIIIlIllllllIIIll() {
        return this.IlIIIIIllllllIIlllIllllll;
    }

    public byte IIIllIIlIIIIIIlIlIIllIIlI() {
        return this.lIllllIIlIIIlIllllllIIIll;
    }

    public boolean IllIIlllllllIIlIIlIIIIlIl() {
        return this.IIIllIIlIIIIIIlIlIIllIIlI;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_2075 class_20752) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0596)class_20752);
    }
}

