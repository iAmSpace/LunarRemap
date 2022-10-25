package obf;

import net.minecraft.util.MathHelper;

/*
 * Decompiled with CFR 0.150.
 */
public class class_2120 {
    public final int lllIIIllIIIIlllIlIIllIIll;
    public final int lllIlIIlIIIlIlIIIllIlllIl;
    public final int IlIllllllIIlIIllllIIlIIIl;
    private final int IllIIIllIIIIlIlIlIllIIlll;
    int lIlllIlllIIIIlIIlllIllIII = -1;
    float IlIIIIIllllllIIlllIllllll;
    float lIllllIIlIIIlIllllllIIIll;
    float IIIllIIlIIIIIIlIlIIllIIlI;
    class_2120 IllIIlllllllIIlIIlIIIIlIl;
    public boolean IIIllIllIIlIlIlIlIllllIIl;

    public class_2120(int n, int n2, int n3) {
        this.lllIIIllIIIIlllIlIIllIIll = n;
        this.lllIlIIlIIIlIlIIIllIlllIl = n2;
        this.IlIllllllIIlIIllllIIlIIIl = n3;
        this.IllIIIllIIIIlIlIlIllIIlll = class_2120.lllIIIllIIIIlllIlIIllIIll(n, n2, n3);
    }

    public static int lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        return n2 & 0xFF | (n & 0x7FFF) << 8 | (n3 & 0x7FFF) << 24 | (n < 0 ? Integer.MIN_VALUE : 0) | (n3 < 0 ? 32768 : 0);
    }

    public float lllIIIllIIIIlllIlIIllIIll(class_2120 class_21202) {
        float f = class_21202.lllIIIllIIIIlllIlIIllIIll - this.lllIIIllIIIIlllIlIIllIIll;
        float f2 = class_21202.lllIlIIlIIIlIlIIIllIlllIl - this.lllIlIIlIIIlIlIIIllIlllIl;
        float f3 = class_21202.IlIllllllIIlIIllllIIlIIIl - this.IlIllllllIIlIIllllIIlIIIl;
        return MathHelper.IlIllllllIIlIIllllIIlIIIl(f * f + f2 * f2 + f3 * f3);
    }

    public float lllIlIIlIIIlIlIIIllIlllIl(class_2120 class_21202) {
        float f = class_21202.lllIIIllIIIIlllIlIIllIIll - this.lllIIIllIIIIlllIlIIllIIll;
        float f2 = class_21202.lllIlIIlIIIlIlIIIllIlllIl - this.lllIlIIlIIIlIlIIIllIlllIl;
        float f3 = class_21202.IlIllllllIIlIIllllIIlIIIl - this.IlIllllllIIlIIllllIIlIIIl;
        return f * f + f2 * f2 + f3 * f3;
    }

    public boolean equals(Object object) {
        if (!(object instanceof class_2120)) {
            return false;
        }
        class_2120 class_21202 = (class_2120)object;
        return this.IllIIIllIIIIlIlIlIllIIlll == class_21202.IllIIIllIIIIlIlIlIllIIlll && this.lllIIIllIIIIlllIlIIllIIll == class_21202.lllIIIllIIIIlllIlIIllIIll && this.lllIlIIlIIIlIlIIIllIlllIl == class_21202.lllIlIIlIIIlIlIIIllIlllIl && this.IlIllllllIIlIIllllIIlIIIl == class_21202.IlIllllllIIlIIllllIIlIIIl;
    }

    public int hashCode() {
        return this.IllIIIllIIIIlIlIlIllIIlll;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll() {
        return this.lIlllIlllIIIIlIIlllIllIII >= 0;
    }

    public String toString() {
        return this.lllIIIllIIIIlllIlIIllIIll + ", " + this.lllIlIIlIIIlIlIIIllIlllIl + ", " + this.IlIllllllIIlIIllllIIlIIIl;
    }
}

