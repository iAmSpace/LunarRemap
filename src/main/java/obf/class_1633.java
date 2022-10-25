package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1633 {
    public static final class_1633 lllIIIllIIIIlllIlIIllIIll = new class_0474(0L);
    private final long lllIlIIlIIIlIlIIIllIlllIl;
    private long IlIllllllIIlIIllllIIlIIIl;

    public class_1633(long l) {
        this.lllIlIIlIIIlIlIIIllIlllIl = l;
    }

    public void lllIIIllIIIIlllIlIIllIIll(long l) {
        this.IlIllllllIIlIIllllIIlIIIl += l / 8L;
        if (this.IlIllllllIIlIIllllIIlIIIl > this.lllIlIIlIIIlIlIIIllIlllIl) {
            throw new RuntimeException("Tried to read NBT tag that was too big; tried to allocate: " + this.IlIllllllIIlIIllllIIlIIIl + "bytes where max allowed: " + this.lllIlIIlIIIlIlIIIllIlllIl);
        }
    }
}

