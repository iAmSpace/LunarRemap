package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.util.MathHelper;

import java.util.Random;

public class class_1008 {
    private static class_0864 lllIIIllIIIIlllIlIIllIIll = class_0864.lllIIIllIIIIlllIlIIllIIll(0.0, 0.0, 0.0);

    public static class_0864 lllIIIllIIIIlllIlIIllIIll(class_1252 class_12522, int n, int n2) {
        return class_1008.IlIllllllIIlIIllllIIlIIIl(class_12522, n, n2, null);
    }

    public static class_0864 lllIIIllIIIIlllIlIIllIIll(class_1252 class_12522, int n, int n2, class_0864 class_08642) {
        class_1008.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll = class_08642.lllIIIllIIIIlllIlIIllIIll - class_12522.IlIIlllllIIlIlIlllllIllll;
        class_1008.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl = class_08642.lllIlIIlIIIlIlIIIllIlllIl - class_12522.llIIlIlIlllIIllIlIlllIllI;
        class_1008.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl = class_08642.IlIllllllIIlIIllllIIlIIIl - class_12522.IllIIIIllIIllIllIlllIlIIl;
        return class_1008.IlIllllllIIlIIllllIIlIIIl(class_12522, n, n2, lllIIIllIIIIlllIlIIllIIll);
    }

    public static class_0864 lllIlIIlIIIlIlIIIllIlllIl(class_1252 class_12522, int n, int n2, class_0864 class_08642) {
        class_1008.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll = class_12522.IlIIlllllIIlIlIlllllIllll - class_08642.lllIIIllIIIIlllIlIIllIIll;
        class_1008.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl = class_12522.llIIlIlIlllIIllIlIlllIllI - class_08642.lllIlIIlIIIlIlIIIllIlllIl;
        class_1008.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl = class_12522.IllIIIIllIIllIllIlllIlIIl - class_08642.IlIllllllIIlIIllllIIlIIIl;
        return class_1008.IlIllllllIIlIIllllIIlIIIl(class_12522, n, n2, lllIIIllIIIIlllIlIIllIIll);
    }

    private static class_0864 IlIllllllIIlIIllllIIlIIIl(class_1252 class_12522, int n, int n2, class_0864 class_08642) {
        double d;
        double d2;
        Random random = class_12522.IlllIIIlIIlIIIIllllIllllI();
        boolean bl = false;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        float f = -99999.0f;
        boolean bl2 = class_12522.IIlllIlIlllIllIIIlllIIlIl() ? (d2 = (double)(class_12522.IlIlIIlllIIlIllIIIlllllIl().lllIlIIlIIIlIlIIIllIlllIl(MathHelper.IlIllllllIIlIIllllIIlIIIl(class_12522.IlIIlllllIIlIlIlllllIllll), MathHelper.IlIllllllIIlIIllllIIlIIIl(class_12522.llIIlIlIlllIIllIlIlllIllI), MathHelper.IlIllllllIIlIIllllIIlIIIl(class_12522.IllIIIIllIIllIllIlllIlIIl)) + 4.0f)) < (d = (double)(class_12522.lIlIlIIlIIIIlIIIIIlllIIII() + (float)n)) * d : false;
        for (int i = 0; i < 10; ++i) {
            float f2;
            int n6 = random.nextInt(2 * n) - n;
            int n7 = random.nextInt(2 * n2) - n2;
            int n8 = random.nextInt(2 * n) - n;
            if (class_08642 != null && !((double)n6 * class_08642.lllIIIllIIIIlllIlIIllIIll + (double)n8 * class_08642.IlIllllllIIlIIllllIIlIIIl >= 0.0) || bl2 && !class_12522.lllIlIIlIIIlIlIIIllIlllIl(n6 += MathHelper.IlIllllllIIlIIllllIIlIIIl(class_12522.IlIIlllllIIlIlIlllllIllll), n7 += MathHelper.IlIllllllIIlIIllllIIlIIIl(class_12522.llIIlIlIlllIIllIlIlllIllI), n8 += MathHelper.IlIllllllIIlIIllllIIlIIIl(class_12522.IllIIIIllIIllIllIlllIlIIl)) || !((f2 = class_12522.lllIIIllIIIIlllIlIIllIIll(n6, n7, n8)) > f)) continue;
            f = f2;
            n3 = n6;
            n4 = n7;
            n5 = n8;
            bl = true;
        }
        if (bl) {
            return class_0864.lllIIIllIIIIlllIlIIllIIll(n3, n4, n5);
        }
        return null;
    }
}

