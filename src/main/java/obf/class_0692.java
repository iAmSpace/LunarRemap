package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0692
extends class_0551 {
    class_0991 lllIIIllIIIIlllIlIIllIIll;
    class_1965 lllIlIIlIIIlIlIIIllIlllIl;

    public class_0692(class_0991 class_09912) {
        super(class_09912, false, true);
        this.lllIIIllIIIIlllIlIIllIIll = class_09912;
        this.lllIIIllIIIIlllIlIIllIIll(1);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll() {
        class_0938 class_09382 = this.lllIIIllIIIIlllIlIIllIIll.lllIIIlIllIlllIlIIllIllIl();
        if (class_09382 == null) {
            return false;
        }
        this.lllIlIIlIIIlIlIIIllIlllIl = class_09382.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll);
        if (!this.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl, false)) {
            if (this.IlIllllllIIlIIllllIIlIIIl.IlllIIIlIIlIIIIllllIllllI().nextInt(20) == 0) {
                this.lllIlIIlIIIlIlIIIllIlllIl = class_09382.IlIllllllIIlIIllllIIlIIIl(this.lllIIIllIIIIlllIlIIllIIll);
                return this.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl, false);
            }
            return false;
        }
        return true;
    }

    @Override
    public void IlIIIIIllllllIIlllIllllll() {
        this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl(this.lllIlIIlIIIlIlIIIllIlllIl);
        super.IlIIIIIllllllIIlllIllllll();
    }
}

