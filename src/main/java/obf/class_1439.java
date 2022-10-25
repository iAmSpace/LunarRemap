package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1439
extends class_1163 {
    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl() {
        this.IlIIIIIllllllIIlllIllllll = new class_2231(class_0672.lIlIllIIlIIlIIlIIlIIlIIll, 0.0f);
        this.lIllllIIlIIIlIllllllIIIll = true;
        this.IIIllIIlIIIIIIlIlIIllIIlI = true;
        this.IIIllIllIIlIlIlIlIllllIIl = -1;
    }

    @Override
    public class_0864 lllIlIIlIIIlIlIIIllIlllIl(float f, float f2) {
        return class_0864.lllIIIllIIIIlllIlIIllIIll(0.2f, 0.03f, 0.03f);
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll() {
        float f = 0.1f;
        for (int i = 0; i <= 15; ++i) {
            float f2 = 1.0f - (float)i / 15.0f;
            this.IllIIlllllllIIlIIlIIIIlIl[i] = (1.0f - f2) / (f2 * 3.0f + 1.0f) * (1.0f - f) + f;
        }
    }

    @Override
    public class_1848 IlIllllllIIlIIllllIIlIIIl() {
        return new class_0176(this.lllIlIIlIIIlIlIIIllIlllIl, this.lllIlIIlIIIlIlIIIllIlllIl.lIlIlIIlIIIIlIIIIIlllIIII());
    }

    @Override
    public boolean lIlllIlllIIIIlIIlllIllIII() {
        return false;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        return false;
    }

    @Override
    public float lllIIIllIIIIlllIlIIllIIll(long l, float f) {
        return 0.5f;
    }

    @Override
    public boolean IlIIIIIllllllIIlllIllllll() {
        return false;
    }

    @Override
    public boolean lllIlIIlIIIlIlIIIllIlllIl(int n, int n2) {
        return true;
    }

    @Override
    public String llIIlllIllIllllIIIlIIIIII() {
        return "Nether";
    }
}

