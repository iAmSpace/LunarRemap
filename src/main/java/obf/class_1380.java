package obf;

/*
 * Decompiled with CFR 0.150.
 */
public abstract class class_1380
implements class_0211 {
    protected int lIlllIlllIIIIlIIlllIllIII = -1;

    @Override
    public int lllIIIllIIIIlllIlIIllIIll() {
        if (this.lIlllIlllIIIIlIIlllIllIII == -1) {
            this.lIlllIlllIIIIlIIlllIllIII = class_0231.lllIIIllIIIIlllIlIIllIIll();
        }
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    public void IlIllllllIIlIIllllIIlIIIl() {
        if (this.lIlllIlllIIIIlIIlllIllIII != -1) {
            class_0231.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII);
            this.lIlllIlllIIIIlIIlllIllIII = -1;
        }
    }
}

