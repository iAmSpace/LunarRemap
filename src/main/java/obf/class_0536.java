package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.Comparator;

public class class_0536
implements Comparator {
    private float lllIIIllIIIIlllIlIIllIIll;
    private float lllIlIIlIIIlIlIIIllIlllIl;
    private float IlIllllllIIlIIllllIIlIIIl;
    private int[] lIlllIlllIIIIlIIlllIllIII;

    public class_0536(int[] arrn, float f, float f2, float f3) {
        this.lIlllIlllIIIIlIIlllIllIII = arrn;
        this.lllIIIllIIIIlllIlIIllIIll = f;
        this.lllIlIIlIIIlIlIIIllIlllIl = f2;
        this.IlIllllllIIlIIllllIIlIIIl = f3;
    }

    public int lllIIIllIIIIlllIlIIllIIll(Integer n, Integer n2) {
        float f = Float.intBitsToFloat(this.lIlllIlllIIIIlIIlllIllIII[n]) - this.lllIIIllIIIIlllIlIIllIIll;
        float f2 = Float.intBitsToFloat(this.lIlllIlllIIIIlIIlllIllIII[n + 1]) - this.lllIlIIlIIIlIlIIIllIlllIl;
        float f3 = Float.intBitsToFloat(this.lIlllIlllIIIIlIIlllIllIII[n + 2]) - this.IlIllllllIIlIIllllIIlIIIl;
        float f4 = Float.intBitsToFloat(this.lIlllIlllIIIIlIIlllIllIII[n + 8]) - this.lllIIIllIIIIlllIlIIllIIll;
        float f5 = Float.intBitsToFloat(this.lIlllIlllIIIIlIIlllIllIII[n + 9]) - this.lllIlIIlIIIlIlIIIllIlllIl;
        float f6 = Float.intBitsToFloat(this.lIlllIlllIIIIlIIlllIllIII[n + 10]) - this.IlIllllllIIlIIllllIIlIIIl;
        float f7 = Float.intBitsToFloat(this.lIlllIlllIIIIlIIlllIllIII[n + 16]) - this.lllIIIllIIIIlllIlIIllIIll;
        float f8 = Float.intBitsToFloat(this.lIlllIlllIIIIlIIlllIllIII[n + 17]) - this.lllIlIIlIIIlIlIIIllIlllIl;
        float f9 = Float.intBitsToFloat(this.lIlllIlllIIIIlIIlllIllIII[n + 18]) - this.IlIllllllIIlIIllllIIlIIIl;
        float f10 = Float.intBitsToFloat(this.lIlllIlllIIIIlIIlllIllIII[n + 24]) - this.lllIIIllIIIIlllIlIIllIIll;
        float f11 = Float.intBitsToFloat(this.lIlllIlllIIIIlIIlllIllIII[n + 25]) - this.lllIlIIlIIIlIlIIIllIlllIl;
        float f12 = Float.intBitsToFloat(this.lIlllIlllIIIIlIIlllIllIII[n + 26]) - this.IlIllllllIIlIIllllIIlIIIl;
        float f13 = Float.intBitsToFloat(this.lIlllIlllIIIIlIIlllIllIII[n2]) - this.lllIIIllIIIIlllIlIIllIIll;
        float f14 = Float.intBitsToFloat(this.lIlllIlllIIIIlIIlllIllIII[n2 + 1]) - this.lllIlIIlIIIlIlIIIllIlllIl;
        float f15 = Float.intBitsToFloat(this.lIlllIlllIIIIlIIlllIllIII[n2 + 2]) - this.IlIllllllIIlIIllllIIlIIIl;
        float f16 = Float.intBitsToFloat(this.lIlllIlllIIIIlIIlllIllIII[n2 + 8]) - this.lllIIIllIIIIlllIlIIllIIll;
        float f17 = Float.intBitsToFloat(this.lIlllIlllIIIIlIIlllIllIII[n2 + 9]) - this.lllIlIIlIIIlIlIIIllIlllIl;
        float f18 = Float.intBitsToFloat(this.lIlllIlllIIIIlIIlllIllIII[n2 + 10]) - this.IlIllllllIIlIIllllIIlIIIl;
        float f19 = Float.intBitsToFloat(this.lIlllIlllIIIIlIIlllIllIII[n2 + 16]) - this.lllIIIllIIIIlllIlIIllIIll;
        float f20 = Float.intBitsToFloat(this.lIlllIlllIIIIlIIlllIllIII[n2 + 17]) - this.lllIlIIlIIIlIlIIIllIlllIl;
        float f21 = Float.intBitsToFloat(this.lIlllIlllIIIIlIIlllIllIII[n2 + 18]) - this.IlIllllllIIlIIllllIIlIIIl;
        float f22 = Float.intBitsToFloat(this.lIlllIlllIIIIlIIlllIllIII[n2 + 24]) - this.lllIIIllIIIIlllIlIIllIIll;
        float f23 = Float.intBitsToFloat(this.lIlllIlllIIIIlIIlllIllIII[n2 + 25]) - this.lllIlIIlIIIlIlIIIllIlllIl;
        float f24 = Float.intBitsToFloat(this.lIlllIlllIIIIlIIlllIllIII[n2 + 26]) - this.IlIllllllIIlIIllllIIlIIIl;
        float f25 = (f + f4 + f7 + f10) * 0.25f;
        float f26 = (f2 + f5 + f8 + f11) * 0.25f;
        float f27 = (f3 + f6 + f9 + f12) * 0.25f;
        float f28 = (f13 + f16 + f19 + f22) * 0.25f;
        float f29 = (f14 + f17 + f20 + f23) * 0.25f;
        float f30 = (f15 + f18 + f21 + f24) * 0.25f;
        float f31 = f25 * f25 + f26 * f26 + f27 * f27;
        float f32 = f28 * f28 + f29 * f29 + f30 * f30;
        return Float.compare(f32, f31);
    }

    public int compare(Object object, Object object2) {
        return this.lllIIIllIIIIlllIlIIllIIll((Integer)object, (Integer)object2);
    }
}

