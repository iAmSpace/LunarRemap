package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1460 {
    public float[][] lllIIIllIIIIlllIlIIllIIll = new float[16][16];
    public float[] lllIlIIlIIIlIlIIIllIlllIl = new float[16];
    public float[] IlIllllllIIlIIllllIIlIIIl = new float[16];
    public float[] lIlllIlllIIIIlIIlllIllIII = new float[16];

    public boolean lllIIIllIIIIlllIlIIllIIll(double d, double d2, double d3, double d4, double d5, double d6) {
        for (int i = 0; i < 6; ++i) {
            float f = (float)d;
            float f2 = (float)d2;
            float f3 = (float)d3;
            float f4 = (float)d4;
            float f5 = (float)d5;
            float f6 = (float)d6;
            if (!(this.lllIIIllIIIIlllIlIIllIIll[i][0] * f + this.lllIIIllIIIIlllIlIIllIIll[i][1] * f2 + this.lllIIIllIIIIlllIlIIllIIll[i][2] * f3 + this.lllIIIllIIIIlllIlIIllIIll[i][3] <= 0.0f) || !(this.lllIIIllIIIIlllIlIIllIIll[i][0] * f4 + this.lllIIIllIIIIlllIlIIllIIll[i][1] * f2 + this.lllIIIllIIIIlllIlIIllIIll[i][2] * f3 + this.lllIIIllIIIIlllIlIIllIIll[i][3] <= 0.0f) || !(this.lllIIIllIIIIlllIlIIllIIll[i][0] * f + this.lllIIIllIIIIlllIlIIllIIll[i][1] * f5 + this.lllIIIllIIIIlllIlIIllIIll[i][2] * f3 + this.lllIIIllIIIIlllIlIIllIIll[i][3] <= 0.0f) || !(this.lllIIIllIIIIlllIlIIllIIll[i][0] * f4 + this.lllIIIllIIIIlllIlIIllIIll[i][1] * f5 + this.lllIIIllIIIIlllIlIIllIIll[i][2] * f3 + this.lllIIIllIIIIlllIlIIllIIll[i][3] <= 0.0f) || !(this.lllIIIllIIIIlllIlIIllIIll[i][0] * f + this.lllIIIllIIIIlllIlIIllIIll[i][1] * f2 + this.lllIIIllIIIIlllIlIIllIIll[i][2] * f6 + this.lllIIIllIIIIlllIlIIllIIll[i][3] <= 0.0f) || !(this.lllIIIllIIIIlllIlIIllIIll[i][0] * f4 + this.lllIIIllIIIIlllIlIIllIIll[i][1] * f2 + this.lllIIIllIIIIlllIlIIllIIll[i][2] * f6 + this.lllIIIllIIIIlllIlIIllIIll[i][3] <= 0.0f) || !(this.lllIIIllIIIIlllIlIIllIIll[i][0] * f + this.lllIIIllIIIIlllIlIIllIIll[i][1] * f5 + this.lllIIIllIIIIlllIlIIllIIll[i][2] * f6 + this.lllIIIllIIIIlllIlIIllIIll[i][3] <= 0.0f) || !(this.lllIIIllIIIIlllIlIIllIIll[i][0] * f4 + this.lllIIIllIIIIlllIlIIllIIll[i][1] * f5 + this.lllIIIllIIIIlllIlIIllIIll[i][2] * f6 + this.lllIIIllIIIIlllIlIIllIIll[i][3] <= 0.0f)) continue;
            return false;
        }
        return true;
    }

    public boolean lllIlIIlIIIlIlIIIllIlllIl(double d, double d2, double d3, double d4, double d5, double d6) {
        for (int i = 0; i < 6; ++i) {
            float f = (float)d;
            float f2 = (float)d2;
            float f3 = (float)d3;
            float f4 = (float)d4;
            float f5 = (float)d5;
            float f6 = (float)d6;
            if (!(i < 4 ? this.lllIIIllIIIIlllIlIIllIIll[i][0] * f + this.lllIIIllIIIIlllIlIIllIIll[i][1] * f2 + this.lllIIIllIIIIlllIlIIllIIll[i][2] * f3 + this.lllIIIllIIIIlllIlIIllIIll[i][3] <= 0.0f || this.lllIIIllIIIIlllIlIIllIIll[i][0] * f4 + this.lllIIIllIIIIlllIlIIllIIll[i][1] * f2 + this.lllIIIllIIIIlllIlIIllIIll[i][2] * f3 + this.lllIIIllIIIIlllIlIIllIIll[i][3] <= 0.0f || this.lllIIIllIIIIlllIlIIllIIll[i][0] * f + this.lllIIIllIIIIlllIlIIllIIll[i][1] * f5 + this.lllIIIllIIIIlllIlIIllIIll[i][2] * f3 + this.lllIIIllIIIIlllIlIIllIIll[i][3] <= 0.0f || this.lllIIIllIIIIlllIlIIllIIll[i][0] * f4 + this.lllIIIllIIIIlllIlIIllIIll[i][1] * f5 + this.lllIIIllIIIIlllIlIIllIIll[i][2] * f3 + this.lllIIIllIIIIlllIlIIllIIll[i][3] <= 0.0f || this.lllIIIllIIIIlllIlIIllIIll[i][0] * f + this.lllIIIllIIIIlllIlIIllIIll[i][1] * f2 + this.lllIIIllIIIIlllIlIIllIIll[i][2] * f6 + this.lllIIIllIIIIlllIlIIllIIll[i][3] <= 0.0f || this.lllIIIllIIIIlllIlIIllIIll[i][0] * f4 + this.lllIIIllIIIIlllIlIIllIIll[i][1] * f2 + this.lllIIIllIIIIlllIlIIllIIll[i][2] * f6 + this.lllIIIllIIIIlllIlIIllIIll[i][3] <= 0.0f || this.lllIIIllIIIIlllIlIIllIIll[i][0] * f + this.lllIIIllIIIIlllIlIIllIIll[i][1] * f5 + this.lllIIIllIIIIlllIlIIllIIll[i][2] * f6 + this.lllIIIllIIIIlllIlIIllIIll[i][3] <= 0.0f || this.lllIIIllIIIIlllIlIIllIIll[i][0] * f4 + this.lllIIIllIIIIlllIlIIllIIll[i][1] * f5 + this.lllIIIllIIIIlllIlIIllIIll[i][2] * f6 + this.lllIIIllIIIIlllIlIIllIIll[i][3] <= 0.0f : this.lllIIIllIIIIlllIlIIllIIll[i][0] * f + this.lllIIIllIIIIlllIlIIllIIll[i][1] * f2 + this.lllIIIllIIIIlllIlIIllIIll[i][2] * f3 + this.lllIIIllIIIIlllIlIIllIIll[i][3] <= 0.0f && this.lllIIIllIIIIlllIlIIllIIll[i][0] * f4 + this.lllIIIllIIIIlllIlIIllIIll[i][1] * f2 + this.lllIIIllIIIIlllIlIIllIIll[i][2] * f3 + this.lllIIIllIIIIlllIlIIllIIll[i][3] <= 0.0f && this.lllIIIllIIIIlllIlIIllIIll[i][0] * f + this.lllIIIllIIIIlllIlIIllIIll[i][1] * f5 + this.lllIIIllIIIIlllIlIIllIIll[i][2] * f3 + this.lllIIIllIIIIlllIlIIllIIll[i][3] <= 0.0f && this.lllIIIllIIIIlllIlIIllIIll[i][0] * f4 + this.lllIIIllIIIIlllIlIIllIIll[i][1] * f5 + this.lllIIIllIIIIlllIlIIllIIll[i][2] * f3 + this.lllIIIllIIIIlllIlIIllIIll[i][3] <= 0.0f && this.lllIIIllIIIIlllIlIIllIIll[i][0] * f + this.lllIIIllIIIIlllIlIIllIIll[i][1] * f2 + this.lllIIIllIIIIlllIlIIllIIll[i][2] * f6 + this.lllIIIllIIIIlllIlIIllIIll[i][3] <= 0.0f && this.lllIIIllIIIIlllIlIIllIIll[i][0] * f4 + this.lllIIIllIIIIlllIlIIllIIll[i][1] * f2 + this.lllIIIllIIIIlllIlIIllIIll[i][2] * f6 + this.lllIIIllIIIIlllIlIIllIIll[i][3] <= 0.0f && this.lllIIIllIIIIlllIlIIllIIll[i][0] * f + this.lllIIIllIIIIlllIlIIllIIll[i][1] * f5 + this.lllIIIllIIIIlllIlIIllIIll[i][2] * f6 + this.lllIIIllIIIIlllIlIIllIIll[i][3] <= 0.0f && this.lllIIIllIIIIlllIlIIllIIll[i][0] * f4 + this.lllIIIllIIIIlllIlIIllIIll[i][1] * f5 + this.lllIIIllIIIIlllIlIIllIIll[i][2] * f6 + this.lllIIIllIIIIlllIlIIllIIll[i][3] <= 0.0f)) continue;
            return false;
        }
        return true;
    }
}

