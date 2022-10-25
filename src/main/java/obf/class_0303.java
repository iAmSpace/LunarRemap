package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.stats.AchievementList;
import net.minecraft.stats.StatList;

import java.util.List;
import java.util.Random;

public class class_0303
extends class_1327 {
    private class_0003 lIlllIlllIIIIlIIlllIllIII;
    class_1334 lllIIIllIIIIlllIlIIllIIll;
    private class_0003 IlIIIIIllllllIIlllIllllll;
    int lllIlIIlIIIlIlIIIllIlllIl;
    double IlIllllllIIlIIllllIIlIIIl;

    public class_0303(class_0003 class_00032, double d) {
        this.lIlllIlllIIIIlIIlllIllIII = class_00032;
        this.lllIIIllIIIIlllIlIIllIIll = class_00032.lIlIllIIlIIlIIlIIlIIlIIll;
        this.IlIllllllIIlIIllllIIlIIIl = d;
        this.lllIIIllIIIIlllIlIIllIIll(3);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll() {
        if (!this.lIlllIlllIIIIlIIlllIllIII.IIlIlIIIIlIlllIIlIIlIIIII()) {
            return false;
        }
        this.IlIIIIIllllllIIlllIllllll = this.IllIIlllllllIIlIIlIIIIlIl();
        return this.IlIIIIIllllllIIlllIllllll != null;
    }

    @Override
    public boolean lllIlIIlIIIlIlIIIllIlllIl() {
        return this.IlIIIIIllllllIIlllIllllll.IlllIIlllllllIIllIlIllllI() && this.IlIIIIIllllllIIlllIllllll.IIlIlIIIIlIlllIIlIIlIIIII() && this.lllIlIIlIIIlIlIIIllIlllIl < 60;
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
        this.IlIIIIIllllllIIlllIllllll = null;
        this.lllIlIIlIIIlIlIIIllIlllIl = 0;
    }

    @Override
    public void lIlllIlllIIIIlIIlllIllIII() {
        this.lIlllIlllIIIIlIIlllIllIII.llIllllIlIllIIIlIllIIlIlI().lllIIIllIIIIlllIlIIllIIll(this.IlIIIIIllllllIIlllIllllll, 10.0f, (float)this.lIlllIlllIIIIlIIlllIllIII.IIIlllIlIIllIIlIlIllIlIIl());
        this.lIlllIlllIIIIlIIlllIllIII.IllIIIIllIIllIllIlllIlIIl().lllIIIllIIIIlllIlIIllIIll(this.IlIIIIIllllllIIlllIllllll, this.IlIllllllIIlIIllllIIlIIIl);
        ++this.lllIlIIlIIIlIlIIIllIlllIl;
        if (this.lllIlIIlIIIlIlIIIllIlllIl >= 60 && this.lIlllIlllIIIIlIIlllIllIII.IlIIIIIllllllIIlllIllllll(this.IlIIIIIllllllIIlllIllllll) < 9.0) {
            this.IIIllIllIIlIlIlIlIllllIIl();
        }
    }

    private class_0003 IllIIlllllllIIlIIlIIIIlIl() {
        float f = 8.0f;
        List list = this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII.getClass(), this.lIlllIlllIIIIlIIlllIllIII.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl(f, f, f));
        double d = Double.MAX_VALUE;
        class_0003 class_00032 = null;
        for (class_0003 class_00033 : list) {
            if (!this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(class_00033) || !(this.lIlllIlllIIIIlIIlllIllIII.IlIIIIIllllllIIlllIllllll(class_00033) < d)) continue;
            class_00032 = class_00033;
            d = this.lIlllIlllIIIIlIIlllIllIII.IlIIIIIllllllIIlllIllllll(class_00033);
        }
        return class_00032;
    }

    private void IIIllIllIIlIlIlIlIllllIIl() {
        class_0650 class_06502 = this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll((class_0650)this.IlIIIIIllllllIIlllIllllll);
        if (class_06502 != null) {
            class_0814 class_08142 = this.lIlllIlllIIIIlIIlllIllIII.lllIIIlIllIlllIlIIllIllIl();
            if (class_08142 == null && this.IlIIIIIllllllIIlllIllllll.lllIIIlIllIlllIlIIllIllIl() != null) {
                class_08142 = this.IlIIIIIllllllIIlllIllllll.lllIIIlIllIlllIlIIllIllIl();
            }
            if (class_08142 != null) {
                class_08142.lllIIIllIIIIlllIlIIllIIll(StatList.llIIlIllIllllIlIIIIlIIlll);
                if (this.lIlllIlllIIIIlIIlllIllIII instanceof class_1802) {
                    class_08142.lllIIIllIIIIlllIlIIllIIll(AchievementList.field_150962_H);
                }
            }
            this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl(6000);
            this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl(6000);
            this.lIlllIlllIIIIlIIlllIllIII.lIllIIlllIIIlIlIIIlllIlIl();
            this.IlIIIIIllllllIIlllIllllll.lIllIIlllIIIlIlIIIlllIlIl();
            class_06502.lllIlIIlIIIlIlIIIllIlllIl(-24000);
            class_06502.lllIlIIlIIIlIlIIIllIlllIl(this.lIlllIlllIIIIlIIlllIllIII.IlIIlllllIIlIlIlllllIllll, this.lIlllIlllIIIIlIIlllIllIII.llIIlIlIlllIIllIlIlllIllI, this.lIlllIlllIIIIlIIlllIllIII.IllIIIIllIIllIllIlllIlIIl, 0.0f, 0.0f);
            this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(class_06502);
            Random random = this.lIlllIlllIIIIlIIlllIllIII.IlllIIIlIIlIIIIllllIllllI();
            for (int i = 0; i < 7; ++i) {
                double d = random.nextGaussian() * 0.02;
                double d2 = random.nextGaussian() * 0.02;
                double d3 = random.nextGaussian() * 0.02;
                this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll("heart", this.lIlllIlllIIIIlIIlllIllIII.IlIIlllllIIlIlIlllllIllll + (double)(random.nextFloat() * this.lIlllIlllIIIIlIIlllIllIII.IIIIlIlIIlIIIIlIlllIlIIII * 2.0f) - (double)this.lIlllIlllIIIIlIIlllIllIII.IIIIlIlIIlIIIIlIlllIlIIII, this.lIlllIlllIIIIlIIlllIllIII.llIIlIlIlllIIllIlIlllIllI + 0.5 + (double)(random.nextFloat() * this.lIlllIlllIIIIlIIlllIllIII.lllIIIIlIlIIlIIlllIIIIIIl), this.lIlllIlllIIIIlIIlllIllIII.IllIIIIllIIllIllIlllIlIIl + (double)(random.nextFloat() * this.lIlllIlllIIIIlIIlllIllIII.IIIIlIlIIlIIIIlIlllIlIIII * 2.0f) - (double)this.lIlllIlllIIIIlIIlllIllIII.IIIIlIlIIlIIIIlIlllIlIIII, d, d2, d3);
            }
            if (this.lllIIIllIIIIlllIlIIllIIll.IlIIlllllIIlIlIlllllIllll().lllIlIIlIIIlIlIIIllIlllIl("doMobLoot")) {
                this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new class_1138(this.lllIIIllIIIIlllIlIIllIIll, this.lIlllIlllIIIIlIIlllIllIII.IlIIlllllIIlIlIlllllIllll, this.lIlllIlllIIIIlIIlllIllIII.llIIlIlIlllIIllIlIlllIllI, this.lIlllIlllIIIIlIIlllIllIII.IllIIIIllIIllIllIlllIlIIl, random.nextInt(7) + 1));
            }
        }
    }
}

