package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1271 {
    public static class_0767 lllIIIllIIIIlllIlIIllIIll(float f, float f2, class_0321 class_03212) {
        int n = class_03212.lllIIIllIIIIlllIlIIllIIll();
        int n2 = class_03212.lllIlIIlIIIlIlIIIllIlllIl();
        if (f < (float)(n / 3) && f2 < (float)(n2 / 3)) {
            return class_0767.lllIIIllIIIIlllIlIIllIIll;
        }
        if (f > (float)(n / 3 * 2) && f2 < (float)(n2 / 3)) {
            return class_0767.IllIIlllllllIIlIIlIIIIlIl;
        }
        if (f2 < (float)(n2 / 3)) {
            return class_0767.lIlllIlllIIIIlIIlllIllIII;
        }
        if (f < (float)(n / 3) && f2 < (float)(n2 / 3 * 2)) {
            return class_0767.lllIlIIlIIIlIlIIIllIlllIl;
        }
        if (f > (float)(n / 3 * 2) && f2 < (float)(n2 / 3 * 2)) {
            return class_0767.IIIllIllIIlIlIlIlIllllIIl;
        }
        if (f2 < (float)(n2 / 3 * 2)) {
            return class_0767.IlIIIIIllllllIIlllIllllll;
        }
        if (f < (float)(n / 3)) {
            return class_0767.IlIllllllIIlIIllllIIlIIIl;
        }
        if (f < (float)(n / 3 * 2)) {
            if (f > (float)(n / 3 + n / 6)) {
                return class_0767.IIIllIIlIIIIIIlIlIIllIIlI;
            }
            return class_0767.lIllllIIlIIIlIllllllIIIll;
        }
        return class_0767.IllIIIllIIIIlIlIlIllIIlll;
    }

    public static float[] lllIlIIlIIIlIlIIIllIlllIl(float f, float f2, class_0321 class_03212) {
        float f3 = class_03212.lllIIIllIIIIlllIlIIllIIll();
        float f4 = class_03212.lllIlIIlIIIlIlIIIllIlllIl();
        class_0767 class_07672 = class_1271.lllIIIllIIIIlllIlIIllIIll(f, f2, class_03212);
        float f5 = 0.0f;
        float f6 = 0.0f;
        switch (class_07672) {
            case lllIIIllIIIIlllIlIIllIIll: {
                f5 = 0.0f;
                f6 = 0.0f;
                break;
            }
            case IllIIlllllllIIlIIlIIIIlIl: {
                f5 = f3 / 3.0f * 2.0f;
                f6 = 0.0f;
                break;
            }
            case lIlllIlllIIIIlIIlllIllIII: {
                f5 = f3 / 3.0f;
                f6 = 0.0f;
                break;
            }
            case lllIlIIlIIIlIlIIIllIlllIl: {
                f5 = 0.0f;
                f6 = f4 / 3.0f;
                break;
            }
            case IIIllIllIIlIlIlIlIllllIIl: {
                f5 = f3 / 3.0f * 2.0f;
                f6 = f4 / 3.0f;
                break;
            }
            case IlIIIIIllllllIIlllIllllll: {
                f5 = f3 / 3.0f;
                f6 = f4 / 3.0f;
                break;
            }
            case IlIllllllIIlIIllllIIlIIIl: {
                f5 = 0.0f;
                f6 = f4 / 3.0f * 2.0f;
                break;
            }
            case IIIllIIlIIIIIIlIlIIllIIlI: {
                f5 = f3 / 3.0f + f3 / 6.0f;
                f6 = f4 / 3.0f * 2.0f;
                break;
            }
            case lIllllIIlIIIlIllllllIIIll: {
                f5 = f3 / 3.0f;
                f6 = f4 / 3.0f * 2.0f;
                break;
            }
            case IllIIIllIIIIlIlIlIllIIlll: {
                f5 = f3 / 3.0f * 2.0f;
                f6 = f4 / 3.0f * 2.0f;
            }
        }
        return new float[]{f5, f6};
    }

    public static float[] lllIIIllIIIIlllIlIIllIIll(class_0767 class_07672, class_0321 class_03212, float f, float f2, float f3) {
        float f4 = 0.0f;
        float f5 = 0.0f;
        f *= f3;
        f2 *= f3;
        switch (class_07672) {
            case lllIIIllIIIIlllIlIIllIIll: {
                f4 = 2.0f;
                f5 = 2.0f;
                break;
            }
            case lllIlIIlIIIlIlIIIllIlllIl: {
                f4 = 2.0f;
                f5 = (float)(class_03212.lllIlIIlIIIlIlIIIllIlllIl() / 2) - f2 / 2.0f;
                break;
            }
            case IlIllllllIIlIIllllIIlIIIl: {
                f5 = (float)class_03212.lllIlIIlIIIlIlIIIllIlllIl() - f2 - 2.0f;
                f4 = 2.0f;
                break;
            }
            case lIlllIlllIIIIlIIlllIllIII: {
                f4 = (float)(class_03212.lllIIIllIIIIlllIlIIllIIll() / 2) - f / 2.0f;
                f5 = 2.0f;
                break;
            }
            case IlIIIIIllllllIIlllIllllll: {
                f4 = (float)(class_03212.lllIIIllIIIIlllIlIIllIIll() / 2) - f / 2.0f;
                f5 = (float)(class_03212.lllIlIIlIIIlIlIIIllIlllIl() / 2) - f2 / 2.0f;
                break;
            }
            case lIllllIIlIIIlIllllllIIIll: {
                f4 = (float)(class_03212.lllIIIllIIIIlllIlIIllIIll() / 2) - f;
                f5 = (float)class_03212.lllIlIIlIIIlIlIIIllIlllIl() - f2 - 2.0f;
                break;
            }
            case IIIllIIlIIIIIIlIlIIllIIlI: {
                f4 = class_03212.lllIIIllIIIIlllIlIIllIIll() / 2;
                f5 = (float)class_03212.lllIlIIlIIIlIlIIIllIlllIl() - f2 - 2.0f;
                break;
            }
            case IllIIlllllllIIlIIlIIIIlIl: {
                f4 = (float)class_03212.lllIIIllIIIIlllIlIIllIIll() - f - 2.0f;
                f5 = 2.0f;
                break;
            }
            case IIIllIllIIlIlIlIlIllllIIl: {
                f4 = (float)class_03212.lllIIIllIIIIlllIlIIllIIll() - f;
                f5 = (float)(class_03212.lllIlIIlIIIlIlIIIllIlllIl() / 2) - f2 / 2.0f;
                break;
            }
            case IllIIIllIIIIlIlIlIllIIlll: {
                f4 = (float)class_03212.lllIIIllIIIIlllIlIIllIIll() - f;
                f5 = (float)class_03212.lllIlIIlIIIlIlIIIllIlllIl() - f2;
            }
        }
        return new float[]{f4, f5};
    }

    public static float[] lllIIIllIIIIlllIlIIllIIll(class_1665 class_16652, float f, float f2, class_0321 class_03212) {
        float f3 = class_03212.lllIIIllIIIIlllIlIIllIIll();
        float f4 = class_03212.lllIlIIlIIIlIlIIIllIlllIl();
        class_0767 class_07672 = class_1271.lllIIIllIIIIlllIlIIllIIll(f, f2, class_03212);
        float f5 = class_16652.llIllllIlIllIIIlIllIIlIlI * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue();
        float f6 = class_16652.lIlllIlllIlIIIIlllIlIlIIl * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue();
        float f7 = 0.0f;
        float f8 = 0.0f;
        switch (class_07672) {
            case lllIIIllIIIIlllIlIIllIIll: {
                f7 = f5 / 2.0f;
                f8 = f6 / 2.0f;
                break;
            }
            case IllIIlllllllIIlIIlIIIIlIl: {
                f7 = f3 / 3.0f - f5 / 2.0f;
                f8 = f6 / 2.0f;
                break;
            }
            case lIlllIlllIIIIlIIlllIllIII: {
                f7 = f3 / 6.0f;
                f8 = f6 / 2.0f;
                break;
            }
            case lllIlIIlIIIlIlIIIllIlllIl: {
                f7 = f5 / 2.0f;
                f8 = f4 / 6.0f;
                break;
            }
            case IIIllIllIIlIlIlIlIllllIIl: {
                f7 = f3 / 3.0f - f5 / 2.0f;
                f8 = f4 / 6.0f;
                break;
            }
            case IlIIIIIllllllIIlllIllllll: {
                f7 = f3 / 6.0f;
                f8 = f4 / 6.0f;
                break;
            }
            case IlIllllllIIlIIllllIIlIIIl: {
                f7 = f5 / 2.0f;
                f8 = f4 / 3.0f - f6 / 2.0f;
                break;
            }
            case IIIllIIlIIIIIIlIlIIllIIlI: {
                f7 = f5 / 2.0f;
                f8 = f4 / 3.0f - f6 / 2.0f;
                break;
            }
            case lIllllIIlIIIlIllllllIIIll: {
                f7 = f3 / 6.0f - f5 / 2.0f;
                f8 = f4 / 3.0f - f6 / 2.0f;
                break;
            }
            case IllIIIllIIIIlIlIlIllIIlll: {
                f7 = f3 / 3.0f - f5 / 2.0f;
                f8 = f4 / 3.0f - f6 / 2.0f;
            }
        }
        return new float[]{f7, f8};
    }

    public static float[] lllIIIllIIIIlllIlIIllIIll(class_0767 class_07672) {
        float f = 0.0f;
        float f2 = 0.0f;
        switch (class_07672) {
            case IIIllIllIIlIlIlIlIllllIIl: {
                f = -2.0f;
                break;
            }
            case IlIllllllIIlIIllllIIlIIIl: {
                f = 2.0f;
                f2 = -34.0f;
                break;
            }
            case IlIIIIIllllllIIlllIllllll: {
                f2 = -50.0f;
                f = 0.0f;
            }
        }
        return new float[]{f, f2};
    }

    public static class_1564 lllIlIIlIIIlIlIIIllIlllIl(class_0767 class_07672) {
        switch (class_07672) {
            case lllIIIllIIIIlllIlIIllIIll: 
            case IllIIlllllllIIlIIlIIIIlIl: 
            case lIlllIlllIIIIlIIlllIllIII: {
                return class_1564.lllIlIIlIIIlIlIIIllIlllIl;
            }
            case lllIlIIlIIIlIlIIIllIlllIl: 
            case IIIllIllIIlIlIlIlIllllIIl: 
            case IlIIIIIllllllIIlllIllllll: {
                return class_1564.IlIllllllIIlIIllllIIlIIIl;
            }
            case IlIllllllIIlIIllllIIlIIIl: 
            case IIIllIIlIIIIIIlIlIIllIIlI: 
            case lIllllIIlIIIlIllllllIIIll: 
            case IllIIIllIIIIlIlIlIllIIlll: {
                return class_1564.lllIIIllIIIIlllIlIIllIIll;
            }
        }
        return null;
    }

    public static class_1564 IlIllllllIIlIIllllIIlIIIl(class_0767 class_07672) {
        switch (class_07672) {
            case lllIIIllIIIIlllIlIIllIIll: 
            case lllIlIIlIIIlIlIIIllIlllIl: 
            case IlIllllllIIlIIllllIIlIIIl: 
            case IIIllIIlIIIIIIlIlIIllIIlI: {
                return class_1564.lIlllIlllIIIIlIIlllIllIII;
            }
            case lIlllIlllIIIIlIIlllIllIII: 
            case IlIIIIIllllllIIlllIllllll: {
                return class_1564.IlIllllllIIlIIllllIIlIIIl;
            }
            case IllIIlllllllIIlIIlIIIIlIl: 
            case IIIllIllIIlIlIlIlIllllIIl: 
            case lIllllIIlIIIlIllllllIIIll: 
            case IllIIIllIIIIlIlIlIllIIlll: {
                return class_1564.IlIIIIIllllllIIlllIllllll;
            }
        }
        return null;
    }
}

