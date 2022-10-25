package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.OpenGlHelper;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public abstract class class_1660 {
    private final Minecraft lllIIIllIIIIlllIlIIllIIll;
    protected int lllIlIIlIIIlIlIIIllIlllIl;
    private int llIIllIllIlIIlIIllIllllll;
    protected int IlIllllllIIlIIllllIIlIIIl;
    protected int lIlllIlllIIIIlIIlllIllIII;
    protected int IlIIIIIllllllIIlllIllllll;
    protected int lIllllIIlIIIlIllllllIIIll;
    protected int IIIllIIlIIIIIIlIlIIllIIlI = 220;
    protected final int IllIIlllllllIIlIIlIIIIlIl;
    private int lllIIlIIIllllllIIIIlIlIlI;
    private int IlIlllIIIIIIlIIllIIllIlll;
    protected int IIIllIllIIlIlIlIlIllllIIl;
    protected int IllIIIllIIIIlIlIlIllIIlll;
    protected boolean lIIIIlIlIIlllllIIllIIlIII = true;
    private float IlIlIIlIlIllIIlIlIIllIIIl = -2.0f;
    private float lllllIlllIIllIlIIlIIIllII;
    private float IlIlIIlllIIlIllIIIlllllIl;
    private int lIIlIIIIIlIlllIlIIlIlIlll = -1;
    private long lIlIlIIlIIIIlIIIIIlllIIII;
    private boolean IlIIIlIIIIllIIIllIIIIIIll = true;
    private boolean IIlllIlIlllIllIIIlllIIlIl = true;
    private boolean lIlIllIIlIIlIIlIIlIIlIIll = true;
    private boolean llIIlIllIllllIlIIIIlIIlll;
    protected int llIIlllIllIllllIIIlIIIIII;
    private boolean llIllllIlIllIIIlIllIIlIlI = true;

    public class_1660(Minecraft class_06672, int n, int n2, int n3, int n4, int n5) {
        this.lllIIIllIIIIlllIlIIllIIll = class_06672;
        this.lllIlIIlIIIlIlIIIllIlllIl = n;
        this.llIIllIllIlIIlIIllIllllll = n2;
        this.IlIllllllIIlIIllllIIlIIIl = n3;
        this.lIlllIlllIIIIlIIlllIllIII = n4;
        this.IllIIlllllllIIlIIlIIIIlIl = n5;
        this.lIllllIIlIIIlIllllllIIIll = 0;
        this.IlIIIIIllllllIIlllIllllll = n;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, int n3, int n4) {
        this.lllIlIIlIIIlIlIIIllIlllIl = n;
        this.llIIllIllIlIIlIIllIllllll = n2;
        this.IlIllllllIIlIIllllIIlIIIl = n3;
        this.lIlllIlllIIIIlIIlllIllIII = n4;
        this.lIllllIIlIIIlIllllllIIIll = 0;
        this.IlIIIIIllllllIIlllIllllll = n;
    }

    public void lllIIIllIIIIlllIlIIllIIll(boolean bl) {
        this.IlIIIlIIIIllIIIllIIIIIIll = bl;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(boolean bl) {
        this.IIlllIlIlllIllIIIlllIIlIl = bl;
    }

    public void IlIllllllIIlIIllllIIlIIIl(boolean bl) {
        this.lIlIllIIlIIlIIlIIlIIlIIll = bl;
    }

    protected void lllIIIllIIIIlllIlIIllIIll(boolean bl, int n) {
        this.llIIlIllIllllIlIIIIlIIlll = bl;
        this.llIIlllIllIllllIIIlIIIIII = n;
        if (!bl) {
            this.llIIlllIllIllllIIIlIIIIII = 0;
        }
    }

    protected abstract int lllIIIllIIIIlllIlIIllIIll();

    protected abstract void lllIIIllIIIIlllIlIIllIIll(int var1, boolean var2, int var3, int var4);

    protected abstract boolean lllIIIllIIIIlllIlIIllIIll(int var1);

    protected int lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lllIIIllIIIIlllIlIIllIIll() * this.IllIIlllllllIIlIIlIIIIlIl + this.llIIlllIllIllllIIIlIIIIII;
    }

    protected abstract void IlIllllllIIlIIllllIIlIIIl();

    protected abstract void lllIIIllIIIIlllIlIIllIIll(int var1, int var2, int var3, int var4, class_0868 var5, int var6, int var7);

    protected void lllIIIllIIIIlllIlIIllIIll(int n, int n2, class_0868 class_08682) {
    }

    protected void lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
    }

    protected void lllIlIIlIIIlIlIIIllIlllIl(int n, int n2) {
    }

    public int IlIllllllIIlIIllllIIlIIIl(int n, int n2) {
        int n3 = this.lIllllIIlIIIlIllllllIIIll + this.lllIlIIlIIIlIlIIIllIlllIl / 2 - this.IIIllIIlIIIIIIlIlIIllIIlI() / 2;
        int n4 = this.lIllllIIlIIIlIllllllIIIll + this.lllIlIIlIIIlIlIIIllIlllIl / 2 + this.IIIllIIlIIIIIIlIlIIllIIlI() / 2;
        int n5 = n2 - this.IlIllllllIIlIIllllIIlIIIl - this.llIIlllIllIllllIIIlIIIIII + (int)this.IlIlIIlllIIlIllIIIlllllIl - 4;
        int n6 = n5 / this.IllIIlllllllIIlIIlIIIIlIl;
        return n < this.IllIIlllllllIIlIIlIIIIlIl() && n >= n3 && n <= n4 && n6 >= 0 && n5 >= 0 && n6 < this.lllIIIllIIIIlllIlIIllIIll() ? n6 : -1;
    }

    public void lIlllIlllIIIIlIIlllIllIII(int n, int n2) {
        this.lllIIlIIIllllllIIIIlIlIlI = n;
        this.IlIlllIIIIIIlIIllIIllIlll = n2;
    }

    private void IllIIIllIIIIlIlIlIllIIlll() {
        int n = this.lIlllIlllIIIIlIIlllIllIII();
        if (n < 0) {
            n /= 2;
        }
        if (!this.lIIIIlIlIIlllllIIllIIlIII && n < 0) {
            n = 0;
        }
        if (this.IlIlIIlllIIlIllIIIlllllIl < 0.0f) {
            this.IlIlIIlllIIlIllIIIlllllIl = 0.0f;
        }
        if (this.IlIlIIlllIIlIllIIIlllllIl > (float)n) {
            this.IlIlIIlllIIlIllIIIlllllIl = n;
        }
    }

    public int lIlllIlllIIIIlIIlllIllIII() {
        return this.lllIlIIlIIIlIlIIIllIlllIl() - (this.lIlllIlllIIIIlIIlllIllIII - this.IlIllllllIIlIIllllIIlIIIl - 4);
    }

    public int IlIIIIIllllllIIlllIllllll() {
        return (int)this.IlIlIIlllIIlIllIIIlllllIl;
    }

    public boolean lllIlIIlIIIlIlIIIllIlllIl(int n) {
        return n >= this.IlIllllllIIlIIllllIIlIIIl && n <= this.lIlllIlllIIIIlIIlllIllIII;
    }

    public void IlIllllllIIlIIllllIIlIIIl(int n) {
        this.IlIlIIlllIIlIllIIIlllllIl += (float)n;
        this.IllIIIllIIIIlIlIlIllIIlll();
        this.IlIlIIlIlIllIIlIlIIllIIIl = -2.0f;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1197 class_11972) {
        if (class_11972.IllIIIllIIIIlIlIlIllIIlll) {
            if (class_11972.IIIllIllIIlIlIlIlIllllIIl == this.lllIIlIIIllllllIIIIlIlIlI) {
                this.IlIlIIlllIIlIllIIIlllllIl -= (float)(this.IllIIlllllllIIlIIlIIIIlIl * 2 / 3);
                this.IlIlIIlIlIllIIlIlIIllIIIl = -2.0f;
                this.IllIIIllIIIIlIlIlIllIIlll();
            } else if (class_11972.IIIllIllIIlIlIlIlIllllIIl == this.IlIlllIIIIIIlIIllIIllIlll) {
                this.IlIlIIlllIIlIllIIIlllllIl += (float)(this.IllIIlllllllIIlIIlIIIIlIl * 2 / 3);
                this.IlIlIIlIlIllIIlIlIIllIIIl = -2.0f;
                this.IllIIIllIIIIlIlIlIllIIlll();
            }
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        this.IIIllIllIIlIlIlIlIllllIIl = n;
        this.IllIIIllIIIIlIlIlIllIIlll = n2;
        this.IlIllllllIIlIIllllIIlIIIl();
        int n9 = this.lllIIIllIIIIlllIlIIllIIll();
        int n10 = this.IllIIlllllllIIlIIlIIIIlIl();
        int n11 = n10 + 6;
        if (n > this.lIllllIIlIIIlIllllllIIIll && n < this.IlIIIIIllllllIIlllIllllll && n2 > this.IlIllllllIIlIIllllIIlIIIl && n2 < this.lIlllIlllIIIIlIIlllIllIII) {
            int n12;
            if (Mouse.isButtonDown((int)0) && this.lIllllIIlIIIlIllllllIIIll()) {
                if (this.IlIlIIlIlIllIIlIlIIllIIIl == -1.0f) {
                    n12 = 1;
                    if (n2 >= this.IlIllllllIIlIIllllIIlIIIl && n2 <= this.lIlllIlllIIIIlIIlllIllIII) {
                        n8 = this.lllIlIIlIIIlIlIIIllIlllIl / 2 - this.IIIllIIlIIIIIIlIlIIllIIlI() / 2;
                        n7 = this.lllIlIIlIIIlIlIIIllIlllIl / 2 + this.IIIllIIlIIIIIIlIlIIllIIlI() / 2;
                        n6 = n2 - this.IlIllllllIIlIIllllIIlIIIl - this.llIIlllIllIllllIIIlIIIIII + (int)this.IlIlIIlllIIlIllIIIlllllIl - 4;
                        n5 = n6 / this.IllIIlllllllIIlIIlIIIIlIl;
                        if (n >= n8 && n <= n7 && n5 >= 0 && n6 >= 0 && n5 < n9) {
                            n4 = n5 == this.lIIlIIIIIlIlllIlIIlIlIlll && Minecraft.getSystemTime() - this.lIlIlIIlIIIIlIIIIIlllIIII < 250L ? 1 : 0;
                            this.lllIIIllIIIIlllIlIIllIIll(n5, n4 != 0, n, n2);
                            this.lIIlIIIIIlIlllIlIIlIlIlll = n5;
                            this.lIlIlIIlIIIIlIIIIIlllIIII = Minecraft.getSystemTime();
                        } else if (n >= n8 && n <= n7 && n6 < 0) {
                            this.lllIIIllIIIIlllIlIIllIIll(n - n8, n2 - this.IlIllllllIIlIIllllIIlIIIl + (int)this.IlIlIIlllIIlIllIIIlllllIl - 4);
                            n12 = 0;
                        }
                        if (n >= n10 && n <= n11) {
                            this.lllllIlllIIllIlIIlIIIllII = -1.0f;
                            n4 = this.lIlllIlllIIIIlIIlllIllIII();
                            if (n4 < 1) {
                                n4 = 1;
                            }
                            if ((n3 = (this.lIlllIlllIIIIlIIlllIllIII - this.IlIllllllIIlIIllllIIlIIIl) * (this.lIlllIlllIIIIlIIlllIllIII - this.IlIllllllIIlIIllllIIlIIIl) / this.lllIlIIlIIIlIlIIIllIlllIl()) < 32) {
                                n3 = 32;
                            }
                            if (n3 > this.lIlllIlllIIIIlIIlllIllIII - this.IlIllllllIIlIIllllIIlIIIl - 8) {
                                n3 = this.lIlllIlllIIIIlIIlllIllIII - this.IlIllllllIIlIIllllIIlIIIl - 8;
                            }
                            this.lllllIlllIIllIlIIlIIIllII /= (float)((this.lIlllIlllIIIIlIIlllIllIII - this.IlIllllllIIlIIllllIIlIIIl - n3) / n4);
                        } else {
                            this.lllllIlllIIllIlIIlIIIllII = 1.0f;
                        }
                        this.IlIlIIlIlIllIIlIlIIllIIIl = n12 != 0 ? (float)n2 : -2.0f;
                    } else {
                        this.IlIlIIlIlIllIIlIlIIllIIIl = -2.0f;
                    }
                } else if (this.IlIlIIlIlIllIIlIlIIllIIIl >= 0.0f) {
                    this.IlIlIIlllIIlIllIIIlllllIl -= ((float)n2 - this.IlIlIIlIlIllIIlIlIIllIIIl) * this.lllllIlllIIllIlIIlIIIllII;
                    this.IlIlIIlIlIllIIlIlIIllIIIl = n2;
                }
            } else {
                while (!this.lllIIIllIIIIlllIlIIllIIll.gameSettings.IllIlIlIIIlIllIlIlIIlllII && Mouse.next()) {
                    n12 = Mouse.getEventDWheel();
                    if (n12 != 0) {
                        if (n12 > 0) {
                            n12 = -1;
                        } else if (n12 < 0) {
                            n12 = 1;
                        }
                        this.IlIlIIlllIIlIllIIIlllllIl += (float)(n12 * this.IllIIlllllllIIlIIlIIIIlIl / 2);
                    }
                    this.lllIIIllIIIIlllIlIIllIIll.lllllIlllIIllIlIIlIIIllII.a_();
                }
                this.IlIlIIlIlIllIIlIlIIllIIIl = -1.0f;
            }
        }
        this.IllIIIllIIIIlIlIlIllIIlll();
        GL11.glDisable((int)2896);
        GL11.glDisable((int)2912);
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        if (this.lIlIllIIlIIlIIlIIlIIlIIll) {
            this.lllIIIllIIIIlllIlIIllIIll.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(class_0210.llIIlllIllIllllIIIlIIIIII);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            float f2 = 32.0f;
            class_08682.lllIlIIlIIIlIlIIIllIlllIl();
            class_08682.IlIllllllIIlIIllllIIlIIIl(0x202020);
            class_08682.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll, this.lIlllIlllIIIIlIIlllIllIII, 0.0, (float)this.lIllllIIlIIIlIllllllIIIll / f2, (float)(this.lIlllIlllIIIIlIIlllIllIII + (int)this.IlIlIIlllIIlIllIIIlllllIl) / f2);
            class_08682.lllIIIllIIIIlllIlIIllIIll(this.IlIIIIIllllllIIlllIllllll, this.lIlllIlllIIIIlIIlllIllIII, 0.0, (float)this.IlIIIIIllllllIIlllIllllll / f2, (float)(this.lIlllIlllIIIIlIIlllIllIII + (int)this.IlIlIIlllIIlIllIIIlllllIl) / f2);
            class_08682.lllIIIllIIIIlllIlIIllIIll(this.IlIIIIIllllllIIlllIllllll, this.IlIllllllIIlIIllllIIlIIIl, 0.0, (float)this.IlIIIIIllllllIIlllIllllll / f2, (float)(this.IlIllllllIIlIIllllIIlIIIl + (int)this.IlIlIIlllIIlIllIIIlllllIl) / f2);
            class_08682.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll, this.IlIllllllIIlIIllllIIlIIIl, 0.0, (float)this.lIllllIIlIIIlIllllllIIIll / f2, (float)(this.IlIllllllIIlIIllllIIlIIIl + (int)this.IlIlIIlllIIlIllIIIlllllIl) / f2);
            class_08682.lllIIIllIIIIlllIlIIllIIll();
        }
        n8 = this.lIllllIIlIIIlIllllllIIIll + this.lllIlIIlIIIlIlIIIllIlllIl / 2 - this.IIIllIIlIIIIIIlIlIIllIIlI() / 2 + 2;
        n7 = this.IlIllllllIIlIIllllIIlIIIl + 4 - (int)this.IlIlIIlllIIlIllIIIlllllIl;
        if (this.llIIlIllIllllIlIIIIlIIlll) {
            this.lllIIIllIIIIlllIlIIllIIll(n8, n7, class_08682);
        }
        this.IlIllllllIIlIIllllIIlIIIl(n8, n7, n, n2);
        GL11.glDisable((int)2929);
        n6 = 4;
        if (this.IIlllIlIlllIllIIIlllIIlIl) {
            this.lllIIIllIIIIlllIlIIllIIll(0, this.IlIllllllIIlIIllllIIlIIIl, 255, 255);
            this.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII, this.llIIllIllIlIIlIIllIllllll, 255, 255);
        }
        GL11.glEnable((int)3042);
        OpenGlHelper.glBlendFunc(770, 771, 0, 1);
        GL11.glDisable((int)3008);
        GL11.glShadeModel((int)7425);
        GL11.glDisable((int)3553);
        if (this.IIlllIlIlllIllIIIlllIIlIl) {
            class_08682.lllIlIIlIIIlIlIIIllIlllIl();
            class_08682.lllIIIllIIIIlllIlIIllIIll(0, 0);
            class_08682.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll, this.IlIllllllIIlIIllllIIlIIIl + n6, 0.0, 0.0, 1.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll(this.IlIIIIIllllllIIlllIllllll, this.IlIllllllIIlIIllllIIlIIIl + n6, 0.0, 1.0, 1.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll(0, 255);
            class_08682.lllIIIllIIIIlllIlIIllIIll(this.IlIIIIIllllllIIlllIllllll, this.IlIllllllIIlIIllllIIlIIIl, 0.0, 1.0, 0.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll, this.IlIllllllIIlIIllllIIlIIIl, 0.0, 0.0, 0.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll();
            class_08682.lllIlIIlIIIlIlIIIllIlllIl();
            class_08682.lllIIIllIIIIlllIlIIllIIll(0, 255);
            class_08682.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll, this.lIlllIlllIIIIlIIlllIllIII, 0.0, 0.0, 1.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll(this.IlIIIIIllllllIIlllIllllll, this.lIlllIlllIIIIlIIlllIllIII, 0.0, 1.0, 1.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll(0, 0);
            class_08682.lllIIIllIIIIlllIlIIllIIll(this.IlIIIIIllllllIIlllIllllll, this.lIlllIlllIIIIlIIlllIllIII - n6, 0.0, 1.0, 0.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll, this.lIlllIlllIIIIlIIlllIllIII - n6, 0.0, 0.0, 0.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll();
        }
        if ((n5 = this.lIlllIlllIIIIlIIlllIllIII()) > 0) {
            n4 = (this.lIlllIlllIIIIlIIlllIllIII - this.IlIllllllIIlIIllllIIlIIIl) * (this.lIlllIlllIIIIlIIlllIllIII - this.IlIllllllIIlIIllllIIlIIIl) / this.lllIlIIlIIIlIlIIIllIlllIl();
            if (n4 < 32) {
                n4 = 32;
            }
            if (n4 > this.lIlllIlllIIIIlIIlllIllIII - this.IlIllllllIIlIIllllIIlIIIl - 8) {
                n4 = this.lIlllIlllIIIIlIIlllIllIII - this.IlIllllllIIlIIllllIIlIIIl - 8;
            }
            if ((n3 = (int)this.IlIlIIlllIIlIllIIIlllllIl * (this.lIlllIlllIIIIlIIlllIllIII - this.IlIllllllIIlIIllllIIlIIIl - n4) / n5 + this.IlIllllllIIlIIllllIIlIIIl) < this.IlIllllllIIlIIllllIIlIIIl) {
                n3 = this.IlIllllllIIlIIllllIIlIIIl;
            }
            class_08682.lllIlIIlIIIlIlIIIllIlllIl();
            class_08682.lllIIIllIIIIlllIlIIllIIll(0, 255);
            class_08682.lllIIIllIIIIlllIlIIllIIll(n10, this.lIlllIlllIIIIlIIlllIllIII, 0.0, 0.0, 1.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll(n11, this.lIlllIlllIIIIlIIlllIllIII, 0.0, 1.0, 1.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll(n11, this.IlIllllllIIlIIllllIIlIIIl, 0.0, 1.0, 0.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll(n10, this.IlIllllllIIlIIllllIIlIIIl, 0.0, 0.0, 0.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll();
            class_08682.lllIlIIlIIIlIlIIIllIlllIl();
            class_08682.lllIIIllIIIIlllIlIIllIIll(0x808080, 255);
            class_08682.lllIIIllIIIIlllIlIIllIIll(n10, n3 + n4, 0.0, 0.0, 1.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll(n11, n3 + n4, 0.0, 1.0, 1.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll(n11, n3, 0.0, 1.0, 0.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll(n10, n3, 0.0, 0.0, 0.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll();
            class_08682.lllIlIIlIIIlIlIIIllIlllIl();
            class_08682.lllIIIllIIIIlllIlIIllIIll(0xC0C0C0, 255);
            class_08682.lllIIIllIIIIlllIlIIllIIll(n10, n3 + n4 - 1, 0.0, 0.0, 1.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll(n11 - 1, n3 + n4 - 1, 0.0, 1.0, 1.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll(n11 - 1, n3, 0.0, 1.0, 0.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll(n10, n3, 0.0, 0.0, 0.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll();
        }
        this.lllIlIIlIIIlIlIIIllIlllIl(n, n2);
        GL11.glEnable((int)3553);
        GL11.glShadeModel((int)7424);
        GL11.glEnable((int)3008);
        GL11.glDisable((int)3042);
    }

    public void lIlllIlllIIIIlIIlllIllIII(boolean bl) {
        this.llIllllIlIllIIIlIllIIlIlI = bl;
    }

    public boolean lIllllIIlIIIlIllllllIIIll() {
        return this.llIllllIlIllIIIlIllIIlIlI;
    }

    public int IIIllIIlIIIIIIlIlIIllIIlI() {
        return this.IIIllIIlIIIIIIlIlIIllIIlI;
    }

    public void lIlllIlllIIIIlIIlllIllIII(int n) {
        this.IIIllIIlIIIIIIlIlIIllIIlI = n;
    }

    protected void IlIllllllIIlIIllllIIlIIIl(int n, int n2, int n3, int n4) {
        int n5 = this.lllIIIllIIIIlllIlIIllIIll();
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        for (int i = 0; i < n5; ++i) {
            int n6;
            int n7 = n2 + i * this.IllIIlllllllIIlIIlIIIIlIl + this.llIIlllIllIllllIIIlIIIIII;
            int n8 = this.IIlllIlIlllIllIIIlllIIlIl ? this.IllIIlllllllIIlIIlIIIIlIl - 4 : 0;
            int n9 = n6 = this.IIlllIlIlllIllIIIlllIIlIl ? 0 : this.IllIIlllllllIIlIIlIIIIlIl - 4;
            if (n7 + n6 > this.lIlllIlllIIIIlIIlllIllIII || n7 + n8 < this.IlIllllllIIlIIllllIIlIIIl) continue;
            if (this.IlIIIlIIIIllIIIllIIIIIIll && this.lllIIIllIIIIlllIlIIllIIll(i)) {
                int n10 = this.lIllllIIlIIIlIllllllIIIll + (this.lllIlIIlIIIlIlIIIllIlllIl / 2 - this.IIIllIIlIIIIIIlIlIIllIIlI() / 2);
                int n11 = this.lIllllIIlIIIlIllllllIIIll + this.lllIlIIlIIIlIlIIIllIlllIl / 2 + this.IIIllIIlIIIIIIlIlIIllIIlI() / 2;
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                GL11.glDisable((int)3553);
                class_08682.lllIlIIlIIIlIlIIIllIlllIl();
                class_08682.IlIllllllIIlIIllllIIlIIIl(0x808080);
                class_08682.lllIIIllIIIIlllIlIIllIIll(n10, n7 + n8 + 2, 0.0, 0.0, 1.0);
                class_08682.lllIIIllIIIIlllIlIIllIIll(n11, n7 + n8 + 2, 0.0, 1.0, 1.0);
                class_08682.lllIIIllIIIIlllIlIIllIIll(n11, n7 - 2, 0.0, 1.0, 0.0);
                class_08682.lllIIIllIIIIlllIlIIllIIll(n10, n7 - 2, 0.0, 0.0, 0.0);
                class_08682.IlIllllllIIlIIllllIIlIIIl(0);
                class_08682.lllIIIllIIIIlllIlIIllIIll(n10 + 1, n7 + n8 + 1, 0.0, 0.0, 1.0);
                class_08682.lllIIIllIIIIlllIlIIllIIll(n11 - 1, n7 + n8 + 1, 0.0, 1.0, 1.0);
                class_08682.lllIIIllIIIIlllIlIIllIIll(n11 - 1, n7 - 1, 0.0, 1.0, 0.0);
                class_08682.lllIIIllIIIIlllIlIIllIIll(n10 + 1, n7 - 1, 0.0, 0.0, 0.0);
                class_08682.lllIIIllIIIIlllIlIIllIIll();
                GL11.glEnable((int)3553);
            }
            this.lllIIIllIIIIlllIlIIllIIll(i, n, n7, n8, class_08682, n3, n4);
        }
    }

    protected int IllIIlllllllIIlIIlIIIIlIl() {
        return this.lllIlIIlIIIlIlIIIllIlllIl / 2 + 124;
    }

    protected void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4) {
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        this.lllIIIllIIIIlllIlIIllIIll.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(class_0210.llIIlllIllIllllIIIlIIIIII);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        float f = 32.0f;
        class_08682.lllIlIIlIIIlIlIIIllIlllIl();
        class_08682.lllIIIllIIIIlllIlIIllIIll(0x404040, n4);
        class_08682.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll, n2, 0.0, 0.0, (float)n2 / f);
        class_08682.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll + this.lllIlIIlIIIlIlIIIllIlllIl, n2, 0.0, (float)this.lllIlIIlIIIlIlIIIllIlllIl / f, (float)n2 / f);
        class_08682.lllIIIllIIIIlllIlIIllIIll(0x404040, n3);
        class_08682.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll + this.lllIlIIlIIIlIlIIIllIlllIl, n, 0.0, (float)this.lllIlIIlIIIlIlIIIllIlllIl / f, (float)n / f);
        class_08682.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll, n, 0.0, 0.0, (float)n / f);
        class_08682.lllIIIllIIIIlllIlIIllIIll();
    }

    public void IlIIIIIllllllIIlllIllllll(int n) {
        this.lIllllIIlIIIlIllllllIIIll = n;
        this.IlIIIIIllllllIIlllIllllll = n + this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public int IIIllIllIIlIlIlIlIllllIIl() {
        return this.IllIIlllllllIIlIIlIIIIlIl;
    }
}

