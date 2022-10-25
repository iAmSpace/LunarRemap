package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0298 {
    @class_1556
    public static native byte[] lllIIIllIIIIlllIlIIllIIll(String var0);

    @class_2112
    public static native boolean lllIlIIlIIIlIlIIIllIlllIl(String var0);

    public static boolean IlIllllllIIlIIllllIIlIIIl(String string) {
        boolean bl = false;
        try {
            bl = class_0298.lllIlIIlIIIlIlIIIllIlllIl(string);
        }
        catch (UnsatisfiedLinkError unsatisfiedLinkError) {
            // empty catch block
        }
        return bl;
    }
}

