package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1112 {
    public class_1431 lllIIIllIIIIlllIlIIllIIll;
    public int lllIlIIlIIIlIlIIIllIlllIl;
    public int IlIllllllIIlIIllllIIlIIIl;
    public int lIlllIlllIIIIlIIlllIllIII;
    public int IlIIIIIllllllIIlllIllllll;
    public class_0864 lIllllIIlIIIlIllllllIIIll;
    public class_1521 IIIllIIlIIIIIIlIlIIllIIlI;

    public class_1112(int n, int n2, int n3, int n4, class_0864 class_08642) {
        this(n, n2, n3, n4, class_08642, true);
    }

    public class_1112(int n, int n2, int n3, int n4, class_0864 class_08642, boolean bl) {
        this.lllIIIllIIIIlllIlIIllIIll = bl ? class_1431.lllIlIIlIIIlIlIIIllIlllIl : class_1431.lllIIIllIIIIlllIlIIllIIll;
        this.lllIlIIlIIIlIlIIIllIlllIl = n;
        this.IlIllllllIIlIIllllIIlIIIl = n2;
        this.lIlllIlllIIIIlIIlllIllIII = n3;
        this.IlIIIIIllllllIIlllIllllll = n4;
        this.lIllllIIlIIIlIllllllIIIll = class_0864.lllIIIllIIIIlllIlIIllIIll(class_08642.lllIIIllIIIIlllIlIIllIIll, class_08642.lllIlIIlIIIlIlIIIllIlllIl, class_08642.IlIllllllIIlIIllllIIlIIIl);
    }

    public class_1112(class_1521 class_15212) {
        this(class_15212, class_0864.lllIIIllIIIIlllIlIIllIIll(class_15212.IlIIlllllIIlIlIlllllIllll, class_15212.llIIlIlIlllIIllIlIlllIllI, class_15212.IllIIIIllIIllIllIlllIlIIl));
    }

    public class_1112(class_1521 class_15212, class_0864 class_08642) {
        this.lllIIIllIIIIlllIlIIllIIll = class_1431.IlIllllllIIlIIllllIIlIIIl;
        this.IIIllIIlIIIIIIlIlIIllIIlI = class_15212;
        this.lIllllIIlIIIlIllllllIIIll = class_08642;
    }

    public String toString() {
        return "HitResult{type=" + (Object)((Object)this.lllIIIllIIIIlllIlIIllIIll) + ", x=" + this.lllIlIIlIIIlIlIIIllIlllIl + ", y=" + this.IlIllllllIIlIIllllIIlIIIl + ", z=" + this.lIlllIlllIIIIlIIlllIllIII + ", f=" + this.IlIIIIIllllllIIlllIllllll + ", pos=" + this.lIllllIIlIIIlIllllllIIIll + ", entity=" + this.IIIllIIlIIIIIIlIlIIllIIlI + '}';
    }
}

