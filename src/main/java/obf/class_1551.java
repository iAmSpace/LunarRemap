package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1551 {
    private class_1724[] IllIIlllllllIIlIIlIIIIlIl;
    private class_0875[] IIIllIllIIlIlIlIlIllllIIl;
    public final float lllIIIllIIIIlllIlIIllIIll;
    public final float lllIlIIlIIIlIlIIIllIlllIl;
    public final float IlIllllllIIlIIllllIIlIIIl;
    public final float lIlllIlllIIIIlIIlllIllIII;
    public final float IlIIIIIllllllIIlllIllllll;
    public final float lIllllIIlIIIlIllllllIIIll;
    public String IIIllIIlIIIIIIlIlIIllIIlI;

    public class_1551(class_0744 class_07442, int n, int n2, float f, float f2, float f3, int n3, int n4, int n5, float f4) {
        this.lllIIIllIIIIlllIlIIllIIll = f;
        this.lllIlIIlIIIlIlIIIllIlllIl = f2;
        this.IlIllllllIIlIIllllIIlIIIl = f3;
        this.lIlllIlllIIIIlIIlllIllIII = f + (float)n3;
        this.IlIIIIIllllllIIlllIllllll = f2 + (float)n4;
        this.lIllllIIlIIIlIllllllIIIll = f3 + (float)n5;
        this.IllIIlllllllIIlIIlIIIIlIl = new class_1724[8];
        this.IIIllIllIIlIlIlIlIllllIIl = new class_0875[6];
        float f5 = f + (float)n3;
        float f6 = f2 + (float)n4;
        float f7 = f3 + (float)n5;
        f -= f4;
        f2 -= f4;
        f3 -= f4;
        f5 += f4;
        f6 += f4;
        f7 += f4;
        if (class_07442.IIIllIllIIlIlIlIlIllllIIl) {
            float f8 = f5;
            f5 = f;
            f = f8;
        }
        class_1724 class_17242 = new class_1724(f, f2, f3, 0.0f, 0.0f);
        class_1724 class_17243 = new class_1724(f5, f2, f3, 0.0f, 8.0f);
        class_1724 class_17244 = new class_1724(f5, f6, f3, 8.0f, 8.0f);
        class_1724 class_17245 = new class_1724(f, f6, f3, 8.0f, 0.0f);
        class_1724 class_17246 = new class_1724(f, f2, f7, 0.0f, 0.0f);
        class_1724 class_17247 = new class_1724(f5, f2, f7, 0.0f, 8.0f);
        class_1724 class_17248 = new class_1724(f5, f6, f7, 8.0f, 8.0f);
        class_1724 class_17249 = new class_1724(f, f6, f7, 8.0f, 0.0f);
        this.IllIIlllllllIIlIIlIIIIlIl[0] = class_17242;
        this.IllIIlllllllIIlIIlIIIIlIl[1] = class_17243;
        this.IllIIlllllllIIlIIlIIIIlIl[2] = class_17244;
        this.IllIIlllllllIIlIIlIIIIlIl[3] = class_17245;
        this.IllIIlllllllIIlIIlIIIIlIl[4] = class_17246;
        this.IllIIlllllllIIlIIlIIIIlIl[5] = class_17247;
        this.IllIIlllllllIIlIIlIIIIlIl[6] = class_17248;
        this.IllIIlllllllIIlIIlIIIIlIl[7] = class_17249;
        this.IIIllIllIIlIlIlIlIllllIIl[0] = new class_0875(new class_1724[]{class_17247, class_17243, class_17244, class_17248}, n + n5 + n3, n2 + n5, n + n5 + n3 + n5, n2 + n5 + n4, class_07442.lllIIIllIIIIlllIlIIllIIll, class_07442.lllIlIIlIIIlIlIIIllIlllIl);
        this.IIIllIllIIlIlIlIlIllllIIl[1] = new class_0875(new class_1724[]{class_17242, class_17246, class_17249, class_17245}, n, n2 + n5, n + n5, n2 + n5 + n4, class_07442.lllIIIllIIIIlllIlIIllIIll, class_07442.lllIlIIlIIIlIlIIIllIlllIl);
        this.IIIllIllIIlIlIlIlIllllIIl[2] = new class_0875(new class_1724[]{class_17247, class_17246, class_17242, class_17243}, n + n5, n2, n + n5 + n3, n2 + n5, class_07442.lllIIIllIIIIlllIlIIllIIll, class_07442.lllIlIIlIIIlIlIIIllIlllIl);
        this.IIIllIllIIlIlIlIlIllllIIl[3] = new class_0875(new class_1724[]{class_17244, class_17245, class_17249, class_17248}, n + n5 + n3, n2 + n5, n + n5 + n3 + n3, n2, class_07442.lllIIIllIIIIlllIlIIllIIll, class_07442.lllIlIIlIIIlIlIIIllIlllIl);
        this.IIIllIllIIlIlIlIlIllllIIl[4] = new class_0875(new class_1724[]{class_17243, class_17242, class_17245, class_17244}, n + n5, n2 + n5, n + n5 + n3, n2 + n5 + n4, class_07442.lllIIIllIIIIlllIlIIllIIll, class_07442.lllIlIIlIIIlIlIIIllIlllIl);
        this.IIIllIllIIlIlIlIlIllllIIl[5] = new class_0875(new class_1724[]{class_17246, class_17247, class_17248, class_17249}, n + n5 + n3 + n5, n2 + n5, n + n5 + n3 + n5 + n3, n2 + n5 + n4, class_07442.lllIIIllIIIIlllIlIIllIIll, class_07442.lllIlIIlIIIlIlIIIllIlllIl);
        if (class_07442.IIIllIllIIlIlIlIlIllllIIl) {
            for (int i = 0; i < this.IIIllIllIIlIlIlIlIllllIIl.length; ++i) {
                this.IIIllIllIIlIlIlIlIllllIIl[i].lllIIIllIIIIlllIlIIllIIll();
            }
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0868 class_08682, float f) {
        for (int i = 0; i < this.IIIllIllIIlIlIlIlIllllIIl.length; ++i) {
            this.IIIllIllIIlIlIlIlIllllIIl[i].lllIIIllIIIIlllIlIIllIIll(class_08682, f);
        }
    }

    public class_1551 lllIIIllIIIIlllIlIIllIIll(String string) {
        this.IIIllIIlIIIIIIlIlIIllIIlI = string;
        return this;
    }
}

