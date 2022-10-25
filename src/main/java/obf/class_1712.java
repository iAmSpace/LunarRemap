package obf;

import net.minecraft.util.MathHelper;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1712
extends class_1469 {
    private static final String[] IIlIIlIlIlIllIIlIlIIIIlll = new String[]{"all", "fire", "fall", "explosion", "projectile"};
    private static final int[] llIIIlllIlllIlIllIIIIllIl = new int[]{1, 10, 5, 5, 3};
    private static final int[] IIIIlIllIlIIlIIlIllIlIlll = new int[]{11, 8, 6, 8, 6};
    private static final int[] IlIlIIlllIllllllllIIIlIlI = new int[]{20, 12, 10, 12, 15};
    public final int IIIIIIIIlIllIIllIIlllIllI;

    public class_1712(int n, int n2, int n3) {
        super(n, n2, class_0841.lllIlIIlIIIlIlIIIllIlllIl);
        this.IIIIIIIIlIllIIllIIlllIllI = n3;
        if (n3 == 2) {
            this.llIIlIlIlllIIllIlIlllIllI = class_0841.IlIllllllIIlIIllllIIlIIIl;
        }
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(int n) {
        return llIIIlllIlllIlIllIIIIllIl[this.IIIIIIIIlIllIIllIIlllIllI] + (n - 1) * IIIIlIllIlIIlIIlIllIlIlll[this.IIIIIIIIlIllIIllIIlllIllI];
    }

    @Override
    public int lllIlIIlIIIlIlIIIllIlllIl(int n) {
        return this.lllIIIllIIIIlllIlIIllIIll(n) + IlIlIIlllIllllllllIIIlIlI[this.IIIIIIIIlIllIIllIIlllIllI];
    }

    @Override
    public int IlIllllllIIlIIllllIIlIIIl() {
        return 4;
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(int n, class_0058 class_00582) {
        if (class_00582.IIIllIIlIIIIIIlIlIIllIIlI()) {
            return 0;
        }
        float f = (float)(6 + n * n) / 3.0f;
        return this.IIIIIIIIlIllIIllIIlllIllI == 0 ? MathHelper.lIlllIlllIIIIlIIlllIllIII(f * 0.75f) : (this.IIIIIIIIlIllIIllIIlllIllI == 1 && class_00582.IlIlllIIIIIIlIIllIIllIlll() ? MathHelper.lIlllIlllIIIIlIIlllIllIII(f * 1.25f) : (this.IIIIIIIIlIllIIllIIlllIllI == 2 && class_00582 == class_0058.IllIIlllllllIIlIIlIIIIlIl ? MathHelper.lIlllIlllIIIIlIIlllIllIII(f * 2.5f) : (this.IIIIIIIIlIllIIllIIlllIllI == 3 && class_00582.IlIllllllIIlIIllllIIlIIIl() ? MathHelper.lIlllIlllIIIIlIIlllIllIII(f * 1.5f) : (this.IIIIIIIIlIllIIllIIlllIllI == 4 && class_00582.lllIIIllIIIIlllIlIIllIIll() ? MathHelper.lIlllIlllIIIIlIIlllIllIII(f * 1.5f) : 0))));
    }

    @Override
    public String lIlllIlllIIIIlIIlllIllIII() {
        return "enchantment.protect." + IIlIIlIlIlIllIIlIlIIIIlll[this.IIIIIIIIlIllIIllIIlllIllI];
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1469 class_14692) {
        if (class_14692 instanceof class_1712) {
            class_1712 class_17122 = (class_1712)class_14692;
            return class_17122.IIIIIIIIlIllIIllIIlllIllI == this.IIIIIIIIlIllIIllIIlllIllI ? false : this.IIIIIIIIlIllIIllIIlllIllI == 2 || class_17122.IIIIIIIIlIllIIllIIlllIllI == 2;
        }
        return super.lllIIIllIIIIlllIlIIllIIll(class_14692);
    }

    public static int lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, int n) {
        int n2 = class_1250.lllIIIllIIIIlllIlIIllIIll(class_1469.lIlllIlllIIIIlIIlllIllIII.IlIIlllllIIlIlIlllllIllll, class_15212.lIIlIIlIllIlIIlIlIIlIlIlI());
        if (n2 > 0) {
            n -= MathHelper.lIlllIlllIIIIlIIlllIllIII((float)n * (float)n2 * 0.15f);
        }
        return n;
    }

    public static double lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, double d) {
        int n = class_1250.lllIIIllIIIIlllIlIIllIIll(class_1469.lIllllIIlIIIlIllllllIIIll.IlIIlllllIIlIlIlllllIllll, class_15212.lIIlIIlIllIlIIlIlIIlIlIlI());
        if (n > 0) {
            d -= (double) MathHelper.IlIllllllIIlIIllllIIlIIIl(d * (double)((float)n * 0.15f));
        }
        return d;
    }
}

