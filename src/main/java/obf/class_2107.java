package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.util.MathHelper;

import java.util.List;

public class class_2107 {
    private class_1334 lllIIIllIIIIlllIlIIllIIll;
    private boolean lllIlIIlIIIlIlIIIllIlllIl;
    private int IlIllllllIIlIIllllIIlIIIl = -1;
    private int lIlllIlllIIIIlIIlllIllIII;
    private int IlIIIIIllllllIIlllIllllll;
    private class_0938 lIllllIIlIIIlIllllllIIIll;
    private int IIIllIIlIIIIIIlIlIIllIIlI;
    private int IllIIlllllllIIlIIlIIIIlIl;
    private int IIIllIllIIlIlIlIlIllllIIl;

    public class_2107(class_1334 class_13342) {
        this.lllIIIllIIIIlllIlIIllIIll = class_13342;
    }

    public void lllIIIllIIIIlllIlIIllIIll() {
        boolean bl = false;
        if (bl) {
            if (this.IlIllllllIIlIIllllIIlIIIl == 2) {
                this.lIlllIlllIIIIlIIlllIllIII = 100;
                return;
            }
        } else {
            if (this.lllIIIllIIIIlllIlIIllIIll.lIIIIlIlIIlllllIIllIIlIII()) {
                this.IlIllllllIIlIIllllIIlIIIl = 0;
                return;
            }
            if (this.IlIllllllIIlIIllllIIlIIIl == 2) {
                return;
            }
            if (this.IlIllllllIIlIIllllIIlIIIl == 0) {
                float f = this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl(0.0f);
                if ((double)f < 0.5 || (double)f > 0.501) {
                    return;
                }
                this.IlIllllllIIlIIllllIIlIIIl = this.lllIIIllIIIIlllIlIIllIIll.lllllIlllIIllIlIIlIIIllII.nextInt(10) == 0 ? 1 : 2;
                this.lllIlIIlIIIlIlIIIllIlllIl = false;
                if (this.IlIllllllIIlIIllllIIlIIIl == 2) {
                    return;
                }
            }
        }
        if (!this.lllIlIIlIIIlIlIIIllIlllIl) {
            if (!this.lllIlIIlIIIlIlIIIllIlllIl()) {
                return;
            }
            this.lllIlIIlIIIlIlIIIllIlllIl = true;
        }
        if (this.IlIIIIIllllllIIlllIllllll > 0) {
            --this.IlIIIIIllllllIIlllIllllll;
        } else {
            this.IlIIIIIllllllIIlllIllllll = 2;
            if (this.lIlllIlllIIIIlIIlllIllIII > 0) {
                this.IlIllllllIIlIIllllIIlIIIl();
                --this.lIlllIlllIIIIlIIlllIllIII;
            } else {
                this.IlIllllllIIlIIllllIIlIIIl = 2;
            }
        }
    }

    private boolean lllIlIIlIIIlIlIIIllIlllIl() {
        List list = this.lllIIIllIIIIlllIlIIllIIll.lIllllIIlIIIlIllllllIIIll;
        for (class_0814 class_08142 : list) {
            this.lIllllIIlIIIlIllllllIIIll = this.lllIIIllIIIIlllIlIIllIIll.llIllllIlIllIIIlIllIIlIlI.lllIIIllIIIIlllIlIIllIIll((int)class_08142.IlIIlllllIIlIlIlllllIllll, (int)class_08142.llIIlIlIlllIIllIlIlllIllI, (int)class_08142.IllIIIIllIIllIllIlllIlIIl, 1);
            if (this.lIllllIIlIIIlIllllllIIIll == null || this.lIllllIIlIIIlIllllllIIIll.IlIllllllIIlIIllllIIlIIIl() < 10 || this.lIllllIIlIIIlIllllllIIIll.lIlllIlllIIIIlIIlllIllIII() < 20 || this.lIllllIIlIIIlIllllllIIIll.IlIIIIIllllllIIlllIllllll() < 20) continue;
            class_2208 class_22082 = this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll();
            float f = this.lIllllIIlIIIlIllllllIIIll.lllIlIIlIIIlIlIIIllIlllIl();
            boolean bl = false;
            for (int i = 0; i < 10; ++i) {
                this.IIIllIIlIIIIIIlIlIIllIIlI = class_22082.lllIIIllIIIIlllIlIIllIIll + (int)((double)(MathHelper.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll.lllllIlllIIllIlIIlIIIllII.nextFloat() * (float)Math.PI * 2.0f) * f) * 0.9);
                this.IllIIlllllllIIlIIlIIIIlIl = class_22082.lllIlIIlIIIlIlIIIllIlllIl;
                this.IIIllIllIIlIlIlIlIllllIIl = class_22082.IlIllllllIIlIIllllIIlIIIl + (int)((double)(MathHelper.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll.lllllIlllIIllIlIIlIIIllII.nextFloat() * (float)Math.PI * 2.0f) * f) * 0.9);
                bl = false;
                for (class_0938 class_09382 : this.lllIIIllIIIIlllIlIIllIIll.llIllllIlIllIIIlIllIIlIlI.lllIlIIlIIIlIlIIIllIlllIl()) {
                    if (class_09382 == this.lIllllIIlIIIlIllllllIIIll || !class_09382.lllIIIllIIIIlllIlIIllIIll(this.IIIllIIlIIIIIIlIlIIllIIlI, this.IllIIlllllllIIlIIlIIIIlIl, this.IIIllIllIIlIlIlIlIllllIIl)) continue;
                    bl = true;
                    break;
                }
                if (!bl) break;
            }
            if (bl) {
                return false;
            }
            class_0864 class_08642 = this.lllIIIllIIIIlllIlIIllIIll(this.IIIllIIlIIIIIIlIlIIllIIlI, this.IllIIlllllllIIlIIlIIIIlIl, this.IIIllIllIIlIlIlIlIllllIIl);
            if (class_08642 == null) continue;
            this.IlIIIIIllllllIIlllIllllll = 0;
            this.lIlllIlllIIIIlIIlllIllIII = 20;
            return true;
        }
        return false;
    }

    private boolean IlIllllllIIlIIllllIIlIIIl() {
        class_0724 class_07242;
        class_0864 class_08642 = this.lllIIIllIIIIlllIlIIllIIll(this.IIIllIIlIIIIIIlIlIIllIIlI, this.IllIIlllllllIIlIIlIIIIlIl, this.IIIllIllIIlIlIlIlIllllIIl);
        if (class_08642 == null) {
            return false;
        }
        try {
            class_07242 = new class_0724(this.lllIIIllIIIIlllIlIIllIIll);
            class_07242.lllIIIllIIIIlllIlIIllIIll((class_2025)null);
            class_07242.IllIIIllIIIIlIlIlIllIIlll(false);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return false;
        }
        class_07242.lllIlIIlIIIlIlIIIllIlllIl(class_08642.lllIIIllIIIIlllIlIIllIIll, class_08642.lllIlIIlIIIlIlIIIllIlllIl, class_08642.IlIllllllIIlIIllllIIlIIIl, this.lllIIIllIIIIlllIlIIllIIll.lllllIlllIIllIlIIlIIIllII.nextFloat() * 360.0f, 0.0f);
        this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(class_07242);
        class_2208 class_22082 = this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll();
        class_07242.lllIIIllIIIIlllIlIIllIIll(class_22082.lllIIIllIIIIlllIlIIllIIll, class_22082.lllIlIIlIIIlIlIIIllIlllIl, class_22082.IlIllllllIIlIIllllIIlIIIl, this.lIllllIIlIIIlIllllllIIIll.lllIlIIlIIIlIlIIIllIlllIl());
        return true;
    }

    private class_0864 lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        for (int i = 0; i < 10; ++i) {
            int n4;
            int n5;
            int n6 = n + this.lllIIIllIIIIlllIlIIllIIll.lllllIlllIIllIlIIlIIIllII.nextInt(16) - 8;
            if (!this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(n6, n5 = n2 + this.lllIIIllIIIIlllIlIIllIIll.lllllIlllIIllIlIIlIIIllII.nextInt(6) - 3, n4 = n3 + this.lllIIIllIIIIlllIlIIllIIll.lllllIlllIIllIlIIlIIIllII.nextInt(16) - 8) || !class_0907.lllIIIllIIIIlllIlIIllIIll(class_1012.lllIIIllIIIIlllIlIIllIIll, this.lllIIIllIIIIlllIlIIllIIll, n6, n5, n4)) continue;
            class_0864.lllIIIllIIIIlllIlIIllIIll(n6, n5, n4);
        }
        return null;
    }
}

