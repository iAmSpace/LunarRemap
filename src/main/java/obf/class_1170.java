package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1170
extends class_0703 {
    private boolean lllIIIllIIIIlllIlIIllIIll;
    private boolean lllIlIIlIIIlIlIIIllIlllIl;
    private boolean IlIllllllIIlIIllllIIlIIIl;
    private boolean lIlllIlllIIIIlIIlllIllIII;
    private float IlIIIIIllllllIIlllIllllll;
    private float lIllllIIlIIIlIllllllIIIll;

    public class_1170() {
    }

    public class_1170(class_0372 class_03722) {
        this.lllIIIllIIIIlllIlIIllIIll(class_03722.lllIIIllIIIIlllIlIIllIIll);
        this.lllIlIIlIIIlIlIIIllIlllIl(class_03722.lllIlIIlIIIlIlIIIllIlllIl);
        this.IlIllllllIIlIIllllIIlIIIl(class_03722.IlIllllllIIlIIllllIIlIIIl);
        this.lIlllIlllIIIIlIIlllIllIII(class_03722.lIlllIlllIIIIlIIlllIllIII);
        this.lllIIIllIIIIlllIlIIllIIll(class_03722.lllIIIllIIIIlllIlIIllIIll());
        this.lllIlIIlIIIlIlIIIllIlllIl(class_03722.lllIlIIlIIIlIlIIIllIlllIl());
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0181 class_01812) {
        byte by = class_01812.readByte();
        this.lllIIIllIIIIlllIlIIllIIll((by & 1) > 0);
        this.lllIlIIlIIIlIlIIIllIlllIl((by & 2) > 0);
        this.IlIllllllIIlIIllllIIlIIIl((by & 4) > 0);
        this.lIlllIlllIIIIlIIlllIllIII((by & 8) > 0);
        this.lllIIIllIIIIlllIlIIllIIll(class_01812.readFloat());
        this.lllIlIIlIIIlIlIIIllIlllIl(class_01812.readFloat());
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0181 class_01812) {
        byte by = 0;
        if (this.IlIllllllIIlIIllllIIlIIIl()) {
            by = (byte)(by | true ? 1 : 0);
        }
        if (this.lIlllIlllIIIIlIIlllIllIII()) {
            by = (byte)(by | 2);
        }
        if (this.IlIIIIIllllllIIlllIllllll()) {
            by = (byte)(by | 4);
        }
        if (this.lIllllIIlIIIlIllllllIIIll()) {
            by = (byte)(by | 8);
        }
        class_01812.writeByte(by);
        class_01812.writeFloat(this.IlIIIIIllllllIIlllIllllll);
        class_01812.writeFloat(this.lIllllIIlIIIlIllllllIIIll);
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0596 class_05962) {
        class_05962.lllIIIllIIIIlllIlIIllIIll(this);
    }

    @Override
    public String lllIlIIlIIIlIlIIIllIlllIl() {
        return String.format("invuln=%b, flying=%b, canfly=%b, instabuild=%b, flyspeed=%.4f, walkspped=%.4f", this.IlIllllllIIlIIllllIIlIIIl(), this.lIlllIlllIIIIlIIlllIllIII(), this.IlIIIIIllllllIIlllIllllll(), this.lIllllIIlIIIlIllllllIIIll(), Float.valueOf(this.IIIllIIlIIIIIIlIlIIllIIlI()), Float.valueOf(this.IllIIlllllllIIlIIlIIIIlIl()));
    }

    public boolean IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public void lllIIIllIIIIlllIlIIllIIll(boolean bl) {
        this.lllIIIllIIIIlllIlIIllIIll = bl;
    }

    public boolean lIlllIlllIIIIlIIlllIllIII() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(boolean bl) {
        this.lllIlIIlIIIlIlIIIllIlllIl = bl;
    }

    public boolean IlIIIIIllllllIIlllIllllll() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public void IlIllllllIIlIIllllIIlIIIl(boolean bl) {
        this.IlIllllllIIlIIllllIIlIIIl = bl;
    }

    public boolean lIllllIIlIIIlIllllllIIIll() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    public void lIlllIlllIIIIlIIlllIllIII(boolean bl) {
        this.lIlllIlllIIIIlIIlllIllIII = bl;
    }

    public float IIIllIIlIIIIIIlIlIIllIIlI() {
        return this.IlIIIIIllllllIIlllIllllll;
    }

    public void lllIIIllIIIIlllIlIIllIIll(float f) {
        this.IlIIIIIllllllIIlllIllllll = f;
    }

    public float IllIIlllllllIIlIIlIIIIlIl() {
        return this.lIllllIIlIIIlIllllllIIIll;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(float f) {
        this.lIllllIIlIIIlIllllllIIIll = f;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_2075 class_20752) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0596)class_20752);
    }
}

