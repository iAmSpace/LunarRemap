package obf;

import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0955 {
    private int lllIlIIlIIIlIlIIIllIlllIl = 20;
    private float IlIllllllIIlIIllllIIlIIIl = 5.0f;
    public float lllIIIllIIIIlllIlIIllIIll;
    private int lIlllIlllIIIIlIIlllIllIII;
    private int IlIIIIIllllllIIlllIllllll = 20;

    public void lllIIIllIIIIlllIlIIllIIll(int n, float f) {
        this.lllIlIIlIIIlIlIIIllIlllIl = Math.min(n + this.lllIlIIlIIIlIlIIIllIlllIl, 20);
        this.IlIllllllIIlIIllllIIlIIIl = Math.min(this.IlIllllllIIlIIllllIIlIIIl + (float)n * f * 2.0f, (float)this.lllIlIIlIIIlIlIIIllIlllIl);
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1949 class_19492, ItemStack class_08972) {
        this.lllIIIllIIIIlllIlIIllIIll(class_19492.llIIllIllIlIIlIIllIllllll(class_08972), class_19492.lllIIlIIIllllllIIIIlIlIlI(class_08972));
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0814 class_08142) {
        class_1999 class_19992 = class_08142.lIlIllIIlIIlIIlIIlIIlIIll.IlIlIIlIlIllIIlIlIIllIIIl;
        this.IlIIIIIllllllIIlllIllllll = this.lllIlIIlIIIlIlIIIllIlllIl;
        if (this.lllIIIllIIIIlllIlIIllIIll > 4.0f) {
            this.lllIIIllIIIIlllIlIIllIIll -= 4.0f;
            if (this.IlIllllllIIlIIllllIIlIIIl > 0.0f) {
                this.IlIllllllIIlIIllllIIlIIIl = Math.max(this.IlIllllllIIlIIllllIIlIIIl - 1.0f, 0.0f);
            } else if (class_19992 != class_1999.lllIIIllIIIIlllIlIIllIIll) {
                this.lllIlIIlIIIlIlIIIllIlllIl = Math.max(this.lllIlIIlIIIlIlIIIllIlllIl - 1, 0);
            }
        }
        if (class_08142.lIlIllIIlIIlIIlIIlIIlIIll.IlIIlllllIIlIlIlllllIllll().lllIlIIlIIIlIlIIIllIlllIl("naturalRegeneration") && this.lllIlIIlIIIlIlIIIllIlllIl >= 18 && class_08142.IIlIlIlIIlllIIIlIIIIlIIIl()) {
            ++this.lIlllIlllIIIIlIIlllIllIII;
            if (this.lIlllIlllIIIIlIIlllIllIII >= 80) {
                class_08142.IlIllllllIIlIIllllIIlIIIl(1.0f);
                this.lllIIIllIIIIlllIlIIllIIll(3.0f);
                this.lIlllIlllIIIIlIIlllIllIII = 0;
            }
        } else if (this.lllIlIIlIIIlIlIIIllIlllIl <= 0) {
            ++this.lIlllIlllIIIIlIIlllIllIII;
            if (this.lIlllIlllIIIIlIIlllIllIII >= 80) {
                if (class_08142.lllIIIlllIlllIIlIllllIIlI() > 10.0f || class_19992 == class_1999.lIlllIlllIIIIlIIlllIllIII || class_08142.lllIIIlllIlllIIlIllllIIlI() > 1.0f && class_19992 == class_1999.IlIllllllIIlIIllllIIlIIIl) {
                    class_08142.lllIIIllIIIIlllIlIIllIIll(class_0058.lIllllIIlIIIlIllllllIIIll, 1.0f);
                }
                this.lIlllIlllIIIIlIIlllIllIII = 0;
            }
        } else {
            this.lIlllIlllIIIIlIIlllIllIII = 0;
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        if (class_07752.lllIlIIlIIIlIlIIIllIlllIl("foodLevel", 99)) {
            this.lllIlIIlIIIlIlIIIllIlllIl = class_07752.lIllllIIlIIIlIllllllIIIll("foodLevel");
            this.lIlllIlllIIIIlIIlllIllIII = class_07752.lIllllIIlIIIlIllllllIIIll("foodTickTimer");
            this.IlIllllllIIlIIllllIIlIIIl = class_07752.IllIIlllllllIIlIIlIIIIlIl("foodSaturationLevel");
            this.lllIIIllIIIIlllIlIIllIIll = class_07752.IllIIlllllllIIlIIlIIIIlIl("foodExhaustionLevel");
        }
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        class_07752.lllIIIllIIIIlllIlIIllIIll("foodLevel", this.lllIlIIlIIIlIlIIIllIlllIl);
        class_07752.lllIIIllIIIIlllIlIIllIIll("foodTickTimer", this.lIlllIlllIIIIlIIlllIllIII);
        class_07752.lllIIIllIIIIlllIlIIllIIll("foodSaturationLevel", this.IlIllllllIIlIIllllIIlIIIl);
        class_07752.lllIIIllIIIIlllIlIIllIIll("foodExhaustionLevel", this.lllIIIllIIIIlllIlIIllIIll);
    }

    public int lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public int lllIlIIlIIIlIlIIIllIlllIl() {
        return this.IlIIIIIllllllIIlllIllllll;
    }

    public boolean IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIlIIlIIIlIlIIIllIlllIl < 20;
    }

    public void lllIIIllIIIIlllIlIIllIIll(float f) {
        this.lllIIIllIIIIlllIlIIllIIll = Math.min(this.lllIIIllIIIIlllIlIIllIIll + f, 40.0f);
    }

    public float lIlllIlllIIIIlIIlllIllIII() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n) {
        this.lllIlIIlIIIlIlIIIllIlllIl = n;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(float f) {
        this.IlIllllllIIlIIllllIIlIIIl = f;
    }
}

