package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1916
extends class_0703 {
    private long lllIIIllIIIIlllIlIIllIIll;
    private long lllIlIIlIIIlIlIIIllIlllIl;

    public class_1916() {
    }

    public class_1916(long l, long l2, boolean bl) {
        this.lllIIIllIIIIlllIlIIllIIll = l;
        this.lllIlIIlIIIlIlIIIllIlllIl = l2;
        if (!bl) {
            this.lllIlIIlIIIlIlIIIllIlllIl = -this.lllIlIIlIIIlIlIIIllIlllIl;
            if (this.lllIlIIlIIIlIlIIIllIlllIl == 0L) {
                this.lllIlIIlIIIlIlIIIllIlllIl = -1L;
            }
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0181 class_01812) {
        this.lllIIIllIIIIlllIlIIllIIll = class_01812.readLong();
        this.lllIlIIlIIIlIlIIIllIlllIl = class_01812.readLong();
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0181 class_01812) {
        class_01812.writeLong(this.lllIIIllIIIIlllIlIIllIIll);
        class_01812.writeLong(this.lllIlIIlIIIlIlIIIllIlllIl);
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0596 class_05962) {
        class_05962.lllIIIllIIIIlllIlIIllIIll(this);
    }

    @Override
    public String lllIlIIlIIIlIlIIIllIlllIl() {
        return String.format("time=%d,dtime=%d", this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl);
    }

    public long IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public long lIlllIlllIIIIlIIlllIllIII() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_2075 class_20752) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0596)class_20752);
    }
}

