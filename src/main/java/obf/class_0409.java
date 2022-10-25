package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.util.MathHelper;

import java.util.Random;

public class class_0409
extends class_1327 {
    private class_1252 lllIIIllIIIIlllIlIIllIIll;
    private double lllIlIIlIIIlIlIIIllIlllIl;
    private double IlIllllllIIlIIllllIIlIIIl;
    private double lIlllIlllIIIIlIIlllIllIII;
    private double IlIIIIIllllllIIlllIllllll;
    private class_1334 lIllllIIlIIIlIllllllIIIll;

    public class_0409(class_1252 class_12522, double d) {
        this.lllIIIllIIIIlllIlIIllIIll = class_12522;
        this.IlIIIIIllllllIIlllIllllll = d;
        this.lIllllIIlIIIlIllllllIIIll = class_12522.lIlIllIIlIIlIIlIIlIIlIIll;
        this.lllIIIllIIIIlllIlIIllIIll(1);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll() {
        if (!this.lIllllIIlIIIlIllllllIIIll.lIIIIlIlIIlllllIIllIIlIII()) {
            return false;
        }
        if (!this.lllIIIllIIIIlllIlIIllIIll.llIIIIIlIIlIIIIllIIIlIIII()) {
            return false;
        }
        if (!this.lIllllIIlIIIlIllllllIIIll.IllIIlllllllIIlIIlIIIIlIl(MathHelper.IlIllllllIIlIIllllIIlIIIl(this.lllIIIllIIIIlllIlIIllIIll.IlIIlllllIIlIlIlllllIllll), (int)this.lllIIIllIIIIlllIlIIllIIll.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl, MathHelper.IlIllllllIIlIIllllIIlIIIl(this.lllIIIllIIIIlllIlIIllIIll.IllIIIIllIIllIllIlllIlIIl))) {
            return false;
        }
        class_0864 class_08642 = this.IllIIlllllllIIlIIlIIIIlIl();
        if (class_08642 == null) {
            return false;
        }
        this.lllIlIIlIIIlIlIIIllIlllIl = class_08642.lllIIIllIIIIlllIlIIllIIll;
        this.IlIllllllIIlIIllllIIlIIIl = class_08642.lllIlIIlIIIlIlIIIllIlllIl;
        this.lIlllIlllIIIIlIIlllIllIII = class_08642.IlIllllllIIlIIllllIIlIIIl;
        return true;
    }

    @Override
    public boolean lllIlIIlIIIlIlIIIllIlllIl() {
        return !this.lllIIIllIIIIlllIlIIllIIll.IllIIIIllIIllIllIlllIlIIl().lIllllIIlIIIlIllllllIIIll();
    }

    @Override
    public void IlIIIIIllllllIIlllIllllll() {
        this.lllIIIllIIIIlllIlIIllIIll.IllIIIIllIIllIllIlllIlIIl().lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll);
    }

    private class_0864 IllIIlllllllIIlIIlIIIIlIl() {
        Random random = this.lllIIIllIIIIlllIlIIllIIll.IlllIIIlIIlIIIIllllIllllI();
        for (int i = 0; i < 10; ++i) {
            int n;
            int n2;
            int n3 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.lllIIIllIIIIlllIlIIllIIll.IlIIlllllIIlIlIlllllIllll + (double)random.nextInt(20) - 10.0);
            if (this.lIllllIIlIIIlIllllllIIIll.IllIIlllllllIIlIIlIIIIlIl(n3, n2 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.lllIIIllIIIIlllIlIIllIIll.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl + (double)random.nextInt(6) - 3.0), n = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.lllIIIllIIIIlllIlIIllIIll.IllIIIIllIIllIllIlllIlIIl + (double)random.nextInt(20) - 10.0)) || !(this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(n3, n2, n) < 0.0f)) continue;
            return class_0864.lllIIIllIIIIlllIlIIllIIll(n3, n2, n);
        }
        return null;
    }
}

