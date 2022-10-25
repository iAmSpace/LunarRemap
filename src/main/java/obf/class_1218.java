package obf;

import net.minecraft.util.MathHelper;

/*
 * Decompiled with CFR 0.150.
 */
public enum class_1218 {
    lllIIIllIIIIlllIlIIllIIll("SIZE_1", 0),
    lllIlIIlIIIlIlIIIllIlllIl("SIZE_2", 1),
    IlIllllllIIlIIllllIIlIIIl("SIZE_3", 2),
    lIlllIlllIIIIlIIlllIllIII("SIZE_4", 3),
    IlIIIIIllllllIIlllIllllll("SIZE_5", 4),
    lIllllIIlIIIlIllllllIIIll("SIZE_6", 5);

    private static final class_1218[] IIIllIIlIIIIIIlIlIIllIIlI;

    public int lllIIIllIIIIlllIlIIllIIll(double d) {
        double d2 = d - ((double) MathHelper.IlIllllllIIlIIllllIIlIIIl(d) + 0.5);
        switch (this) {
            case lllIIIllIIIIlllIlIIllIIll: {
                if (d2 < 0.0 ? d2 < -0.3125 : d2 < 0.3125) {
                    return MathHelper.lIllllIIlIIIlIllllllIIIll(d * 32.0);
                }
                return MathHelper.IlIllllllIIlIIllllIIlIIIl(d * 32.0);
            }
            case lllIlIIlIIIlIlIIIllIlllIl: {
                if (d2 < 0.0 ? d2 < -0.3125 : d2 < 0.3125) {
                    return MathHelper.IlIllllllIIlIIllllIIlIIIl(d * 32.0);
                }
                return MathHelper.lIllllIIlIIIlIllllllIIIll(d * 32.0);
            }
            case IlIllllllIIlIIllllIIlIIIl: {
                if (d2 > 0.0) {
                    return MathHelper.IlIllllllIIlIIllllIIlIIIl(d * 32.0);
                }
                return MathHelper.lIllllIIlIIIlIllllllIIIll(d * 32.0);
            }
            case lIlllIlllIIIIlIIlllIllIII: {
                if (d2 < 0.0 ? d2 < -0.1875 : d2 < 0.1875) {
                    return MathHelper.lIllllIIlIIIlIllllllIIIll(d * 32.0);
                }
                return MathHelper.IlIllllllIIlIIllllIIlIIIl(d * 32.0);
            }
            case IlIIIIIllllllIIlllIllllll: {
                if (d2 < 0.0 ? d2 < -0.1875 : d2 < 0.1875) {
                    return MathHelper.IlIllllllIIlIIllllIIlIIIl(d * 32.0);
                }
                return MathHelper.lIllllIIlIIIlIllllllIIIll(d * 32.0);
            }
        }
        if (d2 > 0.0) {
            return MathHelper.lIllllIIlIIIlIllllllIIIll(d * 32.0);
        }
        return MathHelper.IlIllllllIIlIIllllIIlIIIl(d * 32.0);
    }

    static {
        IIIllIIlIIIIIIlIlIIllIIlI = new class_1218[]{lllIIIllIIIIlllIlIIllIIll, lllIlIIlIIIlIlIIIllIlllIl, IlIllllllIIlIIllllIIlIIIl, lIlllIlllIIIIlIIlllIllIII, IlIIIIIllllllIIlllIllllll, lIllllIIlIIIlIllllllIIIll};
    }
}

