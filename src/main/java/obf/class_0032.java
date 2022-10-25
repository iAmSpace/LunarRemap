package obf;

import net.minecraft.client.Minecraft;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0032 {
    private int lllIIIllIIIIlllIlIIllIIll;
    private int lllIlIIlIIIlIlIIIllIlllIl;
    private class_0723 IlIllllllIIlIIllllIIlIIIl = null;
    private class_0151[] lIlllIlllIIIIlIIlllIllIII;
    private boolean IlIIIIIllllllIIlllIllllll = false;
    private class_0785 lIllllIIlIIIlIllllllIIIll;

    public class_0032(int n, int n2, class_0785 class_07852) {
        this.lllIIIllIIIIlllIlIIllIIll = n;
        this.lllIlIIlIIIlIlIIIllIlllIl = n2;
        this.lIlllIlllIIIIlIIlllIllIII = new class_0151[n * n2];
        this.lIllllIIlIIIlIllllllIIIll = class_07852;
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        class_0723 class_07232 = Minecraft.getMinecraft().theWorld.lIlllIlllIIIIlIIlllIllIII(n, n2);
        if (class_07232 != this.IlIllllllIIlIIllllIIlIIIl) {
            if (this.IlIllllllIIlIIllllIIlIIIl == null) {
                this.lllIlIIlIIIlIlIIIllIlllIl(n, n2);
                this.IlIllllllIIlIIllllIIlIIIl = class_07232;
                return;
            }
            int n3 = this.lllIIIllIIIIlllIlIIllIIll / 2;
            int n4 = this.lllIlIIlIIIlIlIIIllIlllIl / 2;
            int n5 = class_07232.IIIllIIlIIIIIIlIlIIllIIlI - this.IlIllllllIIlIIllllIIlIIIl.IIIllIIlIIIIIIlIlIIllIIlI;
            int n6 = class_07232.IllIIlllllllIIlIIlIIIIlIl - this.IlIllllllIIlIIllllIIlIIIl.IllIIlllllllIIlIIlIIIIlIl;
            if (Math.abs(n5) < this.lllIIIllIIIIlllIlIIllIIll && Math.abs(n6) < this.lllIlIIlIIIlIlIIIllIlllIl && class_07232.IlIIIIIllllllIIlllIllllll.equals(this.IlIllllllIIlIIllllIIlIIIl.IlIIIIIllllllIIlllIllllll)) {
                int n7;
                int n8;
                this.lllIIIllIIIIlllIlIIllIIll(n5);
                this.lllIlIIlIIIlIlIIIllIlllIl(n6);
                for (n8 = n6 > 0 ? this.lllIlIIlIIIlIlIIIllIlllIl - n6 : 0; n8 < (n6 > 0 ? this.lllIlIIlIIIlIlIIIllIlllIl : -n6); ++n8) {
                    for (n7 = 0; n7 < this.lllIIIllIIIIlllIlIIllIIll; ++n7) {
                        this.lIlllIlllIIIIlIIlllIllIII[n7 + n8 * this.lllIIIllIIIIlllIlIIllIIll] = new class_0151(class_07232.IIIllIIlIIIIIIlIlIIllIIlI - (n3 - n7), class_07232.IllIIlllllllIIlIIlIIIIlIl - (n4 - n8));
                    }
                }
                for (n8 = 0; n8 < this.lllIlIIlIIIlIlIIIllIlllIl; ++n8) {
                    for (n7 = n5 > 0 ? this.lllIIIllIIIIlllIlIIllIIll - n5 : 0; n7 < (n5 > 0 ? this.lllIIIllIIIIlllIlIIllIIll : -n5); ++n7) {
                        this.lIlllIlllIIIIlIIlllIllIII[n7 + n8 * this.lllIIIllIIIIlllIlIIllIIll] = new class_0151(class_07232.IIIllIIlIIIIIIlIlIIllIIlI - (n3 - n7), class_07232.IllIIlllllllIIlIIlIIIIlIl - (n4 - n8));
                    }
                }
            } else {
                this.lllIlIIlIIIlIlIIIllIlllIl(n, n2);
            }
            this.IlIllllllIIlIIllllIIlIIIl = class_07232;
        }
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(int n, int n2) {
        class_0723 class_07232 = Minecraft.getMinecraft().theWorld.lIlllIlllIIIIlIIlllIllIII(n, n2);
        int n3 = this.lllIIIllIIIIlllIlIIllIIll / 2;
        int n4 = this.lllIlIIlIIIlIlIIIllIlllIl / 2;
        for (int i = 0; i < this.lllIlIIlIIIlIlIIIllIlllIl; ++i) {
            for (int j = 0; j < this.lllIIIllIIIIlllIlIIllIIll; ++j) {
                this.lIlllIlllIIIIlIIlllIllIII[j + i * this.lllIIIllIIIIlllIlIIllIIll] = new class_0151(class_07232.IIIllIIlIIIIIIlIlIIllIIlI - (n3 - j), class_07232.IllIIlllllllIIlIIlIIIIlIl - (n4 - i));
            }
        }
        this.IlIIIIIllllllIIlllIllllll = true;
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n) {
        if (n > 0) {
            System.arraycopy(this.lIlllIlllIIIIlIIlllIllIII, n, this.lIlllIlllIIIIlIIlllIllIII, 0, this.lIlllIlllIIIIlIIlllIllIII.length - n);
        } else if (n < 0) {
            System.arraycopy(this.lIlllIlllIIIIlIIlllIllIII, 0, this.lIlllIlllIIIIlIIlllIllIII, -n, this.lIlllIlllIIIIlIIlllIllIII.length + n);
        }
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(int n) {
        if (n > 0) {
            System.arraycopy(this.lIlllIlllIIIIlIIlllIllIII, n * this.lllIIIllIIIIlllIlIIllIIll, this.lIlllIlllIIIIlIIlllIllIII, 0, this.lIlllIlllIIIIlIIlllIllIII.length - n * this.lllIIIllIIIIlllIlIIllIIll);
        } else if (n < 0) {
            System.arraycopy(this.lIlllIlllIIIIlIIlllIllIII, 0, this.lIlllIlllIIIIlIIlllIllIII, -n * this.lllIIIllIIIIlllIlIIllIIll, this.lIlllIlllIIIIlIIlllIllIII.length + n * this.lllIIIllIIIIlllIlIIllIIll);
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(boolean bl) {
        if (!this.IlIIIIIllllllIIlllIllllll) {
            return;
        }
        for (int i = this.lllIlIIlIIIlIlIIIllIlllIl - 1; i >= 0; --i) {
            for (int j = 0; j < this.lllIIIllIIIIlllIlIIllIIll; ++j) {
                this.lIlllIlllIIIIlIIlllIllIII[j + i * this.lllIIIllIIIIlllIlIIllIIll].lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll, bl);
            }
        }
    }
}

