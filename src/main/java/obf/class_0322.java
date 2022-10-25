package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0322 {
    private float lllIIIllIIIIlllIlIIllIIll;
    private float lllIlIIlIIIlIlIIIllIlllIl;
    private float IlIllllllIIlIIllllIIlIIIl;

    public float lllIIIllIIIIlllIlIIllIIll(float f, float f2) {
        this.lllIIIllIIIIlllIlIIllIIll += f;
        f = (this.lllIIIllIIIIlllIlIIllIIll - this.lllIlIIlIIIlIlIIIllIlllIl) * f2;
        this.IlIllllllIIlIIllllIIlIIIl += (f - this.IlIllllllIIlIIllllIIlIIIl) * 0.5f;
        if (f > 0.0f && f > this.IlIllllllIIlIIllllIIlIIIl || f < 0.0f && f < this.IlIllllllIIlIIllllIIlIIIl) {
            f = this.IlIllllllIIlIIllllIIlIIIl;
        }
        this.lllIlIIlIIIlIlIIIllIlllIl += f;
        return f;
    }
}

