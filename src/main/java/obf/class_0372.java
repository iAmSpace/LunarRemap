package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0372 {
    public boolean lllIIIllIIIIlllIlIIllIIll;
    public boolean lllIlIIlIIIlIlIIIllIlllIl;
    public boolean IlIllllllIIlIIllllIIlIIIl;
    public boolean lIlllIlllIIIIlIIlllIllIII;
    public boolean IlIIIIIllllllIIlllIllllll = true;
    private float lIllllIIlIIIlIllllllIIIll = 0.05f;
    private float IIIllIIlIIIIIIlIlIIllIIlI = 0.1f;

    public void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        class_0775 class_07753 = new class_0775();
        class_07753.lllIIIllIIIIlllIlIIllIIll("invulnerable", this.lllIIIllIIIIlllIlIIllIIll);
        class_07753.lllIIIllIIIIlllIlIIllIIll("flying", this.lllIlIIlIIIlIlIIIllIlllIl);
        class_07753.lllIIIllIIIIlllIlIIllIIll("mayfly", this.IlIllllllIIlIIllllIIlIIIl);
        class_07753.lllIIIllIIIIlllIlIIllIIll("instabuild", this.lIlllIlllIIIIlIIlllIllIII);
        class_07753.lllIIIllIIIIlllIlIIllIIll("mayBuild", this.IlIIIIIllllllIIlllIllllll);
        class_07753.lllIIIllIIIIlllIlIIllIIll("flySpeed", this.lIllllIIlIIIlIllllllIIIll);
        class_07753.lllIIIllIIIIlllIlIIllIIll("walkSpeed", this.IIIllIIlIIIIIIlIlIIllIIlI);
        class_07752.lllIIIllIIIIlllIlIIllIIll("abilities", class_07753);
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        if (class_07752.lllIlIIlIIIlIlIIIllIlllIl("abilities", 10)) {
            class_0775 class_07753 = class_07752.llIIllIllIlIIlIIllIllllll("abilities");
            this.lllIIIllIIIIlllIlIIllIIll = class_07753.lllIIlIIIllllllIIIIlIlIlI("invulnerable");
            this.lllIlIIlIIIlIlIIIllIlllIl = class_07753.lllIIlIIIllllllIIIIlIlIlI("flying");
            this.IlIllllllIIlIIllllIIlIIIl = class_07753.lllIIlIIIllllllIIIIlIlIlI("mayfly");
            this.lIlllIlllIIIIlIIlllIllIII = class_07753.lllIIlIIIllllllIIIIlIlIlI("instabuild");
            if (class_07753.lllIlIIlIIIlIlIIIllIlllIl("flySpeed", 99)) {
                this.lIllllIIlIIIlIllllllIIIll = class_07753.IllIIlllllllIIlIIlIIIIlIl("flySpeed");
                this.IIIllIIlIIIIIIlIlIIllIIlI = class_07753.IllIIlllllllIIlIIlIIIIlIl("walkSpeed");
            }
            if (class_07753.lllIlIIlIIIlIlIIIllIlllIl("mayBuild", 1)) {
                this.IlIIIIIllllllIIlllIllllll = class_07753.lllIIlIIIllllllIIIIlIlIlI("mayBuild");
            }
        }
    }

    public float lllIIIllIIIIlllIlIIllIIll() {
        return this.lIllllIIlIIIlIllllllIIIll;
    }

    public void lllIIIllIIIIlllIlIIllIIll(float f) {
        this.lIllllIIlIIIlIllllllIIIll = f;
    }

    public float lllIlIIlIIIlIlIIIllIlllIl() {
        return this.IIIllIIlIIIIIIlIlIIllIIlI;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(float f) {
        this.IIIllIIlIIIIIIlIlIIllIIlI = f;
    }
}

