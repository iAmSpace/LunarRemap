package obf;

/*
 * Decompiled with CFR 0.150.
 */
class class_0516
implements class_1832 {
    private long lllIlIIlIIIlIlIIIllIlllIl = System.currentTimeMillis();
    final /* synthetic */ class_0220 lllIIIllIIIIlllIlIIllIIll;

    class_0516(class_0220 class_02202) {
        this.lllIIIllIIIIlllIlIIllIIll = class_02202;
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(String string) {
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(String string) {
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n) {
        if (System.currentTimeMillis() - this.lllIlIIlIIIlIlIIIllIlllIl >= 1000L) {
            this.lllIlIIlIIIlIlIIIllIlllIl = System.currentTimeMillis();
            class_0220.llIIIlIlIlIIlIllIIIllIlIl().info("Converting... " + n + "%");
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll() {
    }

    @Override
    public void lIlllIlllIIIIlIIlllIllIII(String string) {
    }
}

