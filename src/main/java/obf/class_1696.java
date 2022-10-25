package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1696 {
    private final class_0801 lllIlIIlIIIlIlIIIllIlllIl;
    private final String IlIllllllIIlIIllllIIlIIIl;
    private final float lIlllIlllIIIIlIIlllIllIII;
    private final long IlIIIIIllllllIIlllIllllll;
    private final long lIllllIIlIIIlIllllllIIIll;
    private final long IIIllIIlIIIIIIlIlIIllIIlI;
    protected final long lllIIIllIIIIlllIlIIllIIll = System.currentTimeMillis();

    public class_1696(String string, class_0801 class_08012, float f, long l, long l2, long l3) {
        this.IlIllllllIIlIIllllIIlIIIl = string;
        this.lIlllIlllIIIIlIIlllIllIII = f;
        this.lllIlIIlIIIlIlIIIllIlllIl = class_08012;
        this.IlIIIIIllllllIIlllIllllll = l == 0L ? 5000L : l;
        this.lIllllIIlIIIlIllllllIIIll = l2;
        this.IIIllIIlIIIIIIlIlIIllIIlI = l3;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll() {
        return System.currentTimeMillis() < this.lllIIIllIIIIlllIlIIllIIll + this.lIllllIIlIIIlIllllllIIIll;
    }

    public boolean lllIlIIlIIIlIlIIIllIlllIl() {
        return System.currentTimeMillis() > this.lllIIIllIIIIlllIlIIllIIll + this.IlIIIIIllllllIIlllIllllll - this.IIIllIIlIIIIIIlIlIIllIIlI;
    }

    public class_0801 IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public String lIlllIlllIIIIlIIlllIllIII() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public float IlIIIIIllllllIIlllIllllll() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    public long lIllllIIlIIIlIllllllIIIll() {
        return this.IlIIIIIllllllIIlllIllllll;
    }

    public long IIIllIIlIIIIIIlIlIIllIIlI() {
        return this.lIllllIIlIIIlIllllllIIIll;
    }

    public long IllIIlllllllIIlIIlIIIIlIl() {
        return this.IIIllIIlIIIIIIlIlIIllIIlI;
    }

    static /* synthetic */ class_0801 lllIIIllIIIIlllIlIIllIIll(class_1696 class_16962) {
        return class_16962.lllIlIIlIIIlIlIIIllIlllIl;
    }

    static /* synthetic */ float lllIlIIlIIIlIlIIIllIlllIl(class_1696 class_16962) {
        return class_16962.lIlllIlllIIIIlIIlllIllIII;
    }

    static /* synthetic */ long IlIllllllIIlIIllllIIlIIIl(class_1696 class_16962) {
        return class_16962.lIllllIIlIIIlIllllllIIIll;
    }

    static /* synthetic */ long lIlllIlllIIIIlIIlllIllIII(class_1696 class_16962) {
        return class_16962.IlIIIIIllllllIIlllIllllll;
    }

    static /* synthetic */ long IlIIIIIllllllIIlllIllllll(class_1696 class_16962) {
        return class_16962.IIIllIIlIIIIIIlIlIIllIIlI;
    }

    static /* synthetic */ String lIllllIIlIIIlIllllllIIIll(class_1696 class_16962) {
        return class_16962.IlIllllllIIlIIllllIIlIIIl;
    }
}

