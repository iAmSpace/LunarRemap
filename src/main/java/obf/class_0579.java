package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.GL11
 */
import com.moonsworth.lunar.client.LunarClient;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.OpenGlHelper;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public abstract class class_0579 {
    private final Minecraft lllIIIllIIIIlllIlIIllIIll;
    protected int IlIllllllIIlIIllllIIlIIIl;
    private int lllIlIIlIIIlIlIIIllIlllIl;
    protected int lIlllIlllIIIIlIIlllIllIII;
    protected int IlIIIIIllllllIIlllIllllll;
    protected int lIllllIIlIIIlIllllllIIIll;
    protected int IIIllIIlIIIIIIlIlIIllIIlI;
    protected final int IllIIlllllllIIlIIlIIIIlIl;
    private int llIIllIllIlIIlIIllIllllll;
    private int lllIIlIIIllllllIIIIlIlIlI;
    protected int IIIllIllIIlIlIlIlIllllIIl;
    protected int IllIIIllIIIIlIlIlIllIIlll;
    protected boolean lIIIIlIlIIlllllIIllIIlIII = true;
    private float IlIlllIIIIIIlIIllIIllIlll = -2.0f;
    private float IlIlIIlIlIllIIlIlIIllIIIl;
    private float lllllIlllIIllIlIIlIIIllII;
    private int IlIlIIlllIIlIllIIIlllllIl = -1;
    private long lIIlIIIIIlIlllIlIIlIlIlll;
    private boolean lIlIlIIlIIIIlIIIIIlllIIII = true;
    private boolean IlIIIlIIIIllIIIllIIIIIIll;
    protected int llIIlllIllIllllIIIlIIIIII;
    private boolean IIlllIlIlllIllIIIlllIIlIl = true;

    public class_0579(Minecraft class_06672, int n, int n2, int n3, int n4, int n5) {
        this.lllIIIllIIIIlllIlIIllIIll = class_06672;
        this.IlIllllllIIlIIllllIIlIIIl = n;
        this.lllIlIIlIIIlIlIIIllIlllIl = n2;
        this.lIlllIlllIIIIlIIlllIllIII = n3;
        this.IlIIIIIllllllIIlllIllllll = n4;
        this.IllIIlllllllIIlIIlIIIIlIl = n5;
        this.IIIllIIlIIIIIIlIlIIllIIlI = 0;
        this.lIllllIIlIIIlIllllllIIIll = n;
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4) {
        this.IlIllllllIIlIIllllIIlIIIl = n;
        this.lllIlIIlIIIlIlIIIllIlllIl = n2;
        this.lIlllIlllIIIIlIIlllIllIII = n3;
        this.IlIIIIIllllllIIlllIllllll = n4;
        this.IIIllIIlIIIIIIlIlIIllIIlI = 0;
        this.lIllllIIlIIIlIllllllIIIll = n;
    }

    public void lllIIIllIIIIlllIlIIllIIll(boolean bl) {
        this.lIlIlIIlIIIIlIIIIIlllIIII = bl;
    }

    protected void lllIIIllIIIIlllIlIIllIIll(boolean bl, int n) {
        this.IlIIIlIIIIllIIIllIIIIIIll = bl;
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
        int n3 = this.IIIllIIlIIIIIIlIlIIllIIlI + this.IlIllllllIIlIIllllIIlIIIl / 2 - this.IlIIIIIllllllIIlllIllllll() / 2;
        int n4 = this.IIIllIIlIIIIIIlIlIIllIIlI + this.IlIllllllIIlIIllllIIlIIIl / 2 + this.IlIIIIIllllllIIlllIllllll() / 2;
        int n5 = n2 - this.lIlllIlllIIIIlIIlllIllIII - this.llIIlllIllIllllIIIlIIIIII + (int)this.lllllIlllIIllIlIIlIIIllII - 4;
        int n6 = n5 / this.IllIIlllllllIIlIIlIIIIlIl;
        return n < this.lIlllIlllIIIIlIIlllIllIII() && n >= n3 && n <= n4 && n6 >= 0 && n5 >= 0 && n6 < this.lllIIIllIIIIlllIlIIllIIll() ? n6 : -1;
    }

    public void lIlllIlllIIIIlIIlllIllIII(int n, int n2) {
        this.llIIllIllIlIIlIIllIllllll = n;
        this.lllIIlIIIllllllIIIIlIlIlI = n2;
    }

    private void lIllllIIlIIIlIllllllIIIll() {
        int n = this.IllIIlllllllIIlIIlIIIIlIl();
        if (n < 0) {
            n /= 2;
        }
        if (!this.lIIIIlIlIIlllllIIllIIlIII && n < 0) {
            n = 0;
        }
        if (this.lllllIlllIIllIlIIlIIIllII < 0.0f) {
            this.lllllIlllIIllIlIIlIIIllII = 0.0f;
        }
        if (this.lllllIlllIIllIlIIlIIIllII > (float)n) {
            this.lllllIlllIIllIlIIlIIIllII = n;
        }
    }

    public int IllIIlllllllIIlIIlIIIIlIl() {
        return this.lllIlIIlIIIlIlIIIllIlllIl() - (this.IlIIIIIllllllIIlllIllllll - this.lIlllIlllIIIIlIIlllIllIII - 4);
    }

    public int IIIllIllIIlIlIlIlIllllIIl() {
        return (int)this.lllllIlllIIllIlIIlIIIllII;
    }

    public boolean lIlllIlllIIIIlIIlllIllIII(int n) {
        return n >= this.lIlllIlllIIIIlIIlllIllIII && n <= this.IlIIIIIllllllIIlllIllllll;
    }

    public void IlIIIIIllllllIIlllIllllll(int n) {
        this.lllllIlllIIllIlIIlIIIllII += (float)n;
        this.lIllllIIlIIIlIllllllIIIll();
        this.IlIlllIIIIIIlIIllIIllIlll = -2.0f;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1197 class_11972) {
        if (class_11972.IllIIIllIIIIlIlIlIllIIlll) {
            if (class_11972.IIIllIllIIlIlIlIlIllllIIl == this.llIIllIllIlIIlIIllIllllll) {
                this.lllllIlllIIllIlIIlIIIllII -= (float)(this.IllIIlllllllIIlIIlIIIIlIl * 2 / 3);
                this.IlIlllIIIIIIlIIllIIllIlll = -2.0f;
                this.lIllllIIlIIIlIllllllIIIll();
            } else if (class_11972.IIIllIllIIlIlIlIlIllllIIl == this.lllIIlIIIllllllIIIIlIlIlI) {
                this.lllllIlllIIllIlIIlIIIllII += (float)(this.IllIIlllllllIIlIIlIIIIlIl * 2 / 3);
                this.IlIlllIIIIIIlIIllIIllIlll = -2.0f;
                this.lIllllIIlIIIlIllllllIIIll();
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
        boolean bl = (Boolean) LunarClient.getInstance().getSettingsManager().rsTransparentBg.getValue() == false || !(Minecraft.getMinecraft().lllllIlllIIllIlIIlIIIllII instanceof class_2018);
        this.IlIllllllIIlIIllllIIlIIIl();
        int n9 = this.lllIIIllIIIIlllIlIIllIIll();
        int n10 = this.lIlllIlllIIIIlIIlllIllIII();
        int n11 = n10 + 6;
        if (n > this.IIIllIIlIIIIIIlIlIIllIIlI && n < this.lIllllIIlIIIlIllllllIIIll && n2 > this.lIlllIlllIIIIlIIlllIllIII && n2 < this.IlIIIIIllllllIIlllIllllll) {
            int n12;
            if (Mouse.isButtonDown((int)0) && this.IllIIIllIIIIlIlIlIllIIlll()) {
                if (this.IlIlllIIIIIIlIIllIIllIlll == -1.0f) {
                    n12 = 1;
                    if (n2 >= this.lIlllIlllIIIIlIIlllIllIII && n2 <= this.IlIIIIIllllllIIlllIllllll) {
                        int n13 = this.IlIllllllIIlIIllllIIlIIIl / 2 - this.IlIIIIIllllllIIlllIllllll() / 2;
                        n8 = this.IlIllllllIIlIIllllIIlIIIl / 2 + this.IlIIIIIllllllIIlllIllllll() / 2;
                        n7 = n2 - this.lIlllIlllIIIIlIIlllIllIII - this.llIIlllIllIllllIIIlIIIIII + (int)this.lllllIlllIIllIlIIlIIIllII - 4;
                        n6 = n7 / this.IllIIlllllllIIlIIlIIIIlIl;
                        if (n >= n13 && n <= n8 && n6 >= 0 && n7 >= 0 && n6 < n9) {
                            n5 = n6 == this.IlIlIIlllIIlIllIIIlllllIl && Minecraft.getSystemTime() - this.lIIlIIIIIlIlllIlIIlIlIlll < 250L ? 1 : 0;
                            this.lllIIIllIIIIlllIlIIllIIll(n6, n5 != 0, n, n2);
                            this.IlIlIIlllIIlIllIIIlllllIl = n6;
                            this.lIIlIIIIIlIlllIlIIlIlIlll = Minecraft.getSystemTime();
                        } else if (n >= n13 && n <= n8 && n7 < 0) {
                            this.lllIIIllIIIIlllIlIIllIIll(n - n13, n2 - this.lIlllIlllIIIIlIIlllIllIII + (int)this.lllllIlllIIllIlIIlIIIllII - 4);
                            n12 = 0;
                        }
                        if (n >= n10 && n <= n11) {
                            this.IlIlIIlIlIllIIlIlIIllIIIl = -1.0f;
                            n4 = this.IllIIlllllllIIlIIlIIIIlIl();
                            if (n4 < 1) {
                                n4 = 1;
                            }
                            if ((n3 = (int)((float)((this.IlIIIIIllllllIIlllIllllll - this.lIlllIlllIIIIlIIlllIllIII) * (this.IlIIIIIllllllIIlllIllllll - this.lIlllIlllIIIIlIIlllIllIII)) / (float)this.lllIlIIlIIIlIlIIIllIlllIl())) < 32) {
                                n3 = 32;
                            }
                            if (n3 > this.IlIIIIIllllllIIlllIllllll - this.lIlllIlllIIIIlIIlllIllIII - 8) {
                                n3 = this.IlIIIIIllllllIIlllIllllll - this.lIlllIlllIIIIlIIlllIllIII - 8;
                            }
                            this.IlIlIIlIlIllIIlIlIIllIIIl /= (float)(this.IlIIIIIllllllIIlllIllllll - this.lIlllIlllIIIIlIIlllIllIII - n3) / (float)n4;
                        } else {
                            this.IlIlIIlIlIllIIlIlIIllIIIl = 1.0f;
                        }
                        this.IlIlllIIIIIIlIIllIIllIlll = n12 != 0 ? (float)n2 : -2.0f;
                    } else {
                        this.IlIlllIIIIIIlIIllIIllIlll = -2.0f;
                    }
                } else if (this.IlIlllIIIIIIlIIllIIllIlll >= 0.0f) {
                    this.lllllIlllIIllIlIIlIIIllII -= ((float)n2 - this.IlIlllIIIIIIlIIllIIllIlll) * this.IlIlIIlIlIllIIlIlIIllIIIl;
                    this.IlIlllIIIIIIlIIllIIllIlll = n2;
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
                        this.lllllIlllIIllIlIIlIIIllII += (float)(n12 * this.IllIIlllllllIIlIIlIIIIlIl / 2);
                    }
                    this.lllIIIllIIIIlllIlIIllIIll.lllllIlllIIllIlIIlIIIllII.a_();
                }
                this.IlIlllIIIIIIlIIllIIllIlll = -1.0f;
            }
        }
        this.lIllllIIlIIIlIllllllIIIll();
        GL11.glDisable((int)2896);
        GL11.glDisable((int)2912);
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        this.lllIIIllIIIIlllIlIIllIIll.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(class_0210.llIIlllIllIllllIIIlIIIIII);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        float f2 = 32.0f;
        if (bl) {
            class_08682.lllIlIIlIIIlIlIIIllIlllIl();
            class_08682.IlIllllllIIlIIllllIIlIIIl(0x202020);
            class_08682.lllIIIllIIIIlllIlIIllIIll(this.IIIllIIlIIIIIIlIlIIllIIlI, this.IlIIIIIllllllIIlllIllllll, 0.0, (float)this.IIIllIIlIIIIIIlIlIIllIIlI / f2, (float)(this.IlIIIIIllllllIIlllIllllll + (int)this.lllllIlllIIllIlIIlIIIllII) / f2);
            class_08682.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll, this.IlIIIIIllllllIIlllIllllll, 0.0, (float)this.lIllllIIlIIIlIllllllIIIll / f2, (float)(this.IlIIIIIllllllIIlllIllllll + (int)this.lllllIlllIIllIlIIlIIIllII) / f2);
            class_08682.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll, this.lIlllIlllIIIIlIIlllIllIII, 0.0, (float)this.lIllllIIlIIIlIllllllIIIll / f2, (float)(this.lIlllIlllIIIIlIIlllIllIII + (int)this.lllllIlllIIllIlIIlIIIllII) / f2);
            class_08682.lllIIIllIIIIlllIlIIllIIll(this.IIIllIIlIIIIIIlIlIIllIIlI, this.lIlllIlllIIIIlIIlllIllIII, 0.0, (float)this.IIIllIIlIIIIIIlIlIIllIIlI / f2, (float)(this.lIlllIlllIIIIlIIlllIllIII + (int)this.lllllIlllIIllIlIIlIIIllII) / f2);
            class_08682.lllIIIllIIIIlllIlIIllIIll();
        } else {
            class_0210.lllIIIllIIIIlllIlIIllIIll(this.IIIllIIlIIIIIIlIlIIllIIlI, this.lIlllIlllIIIIlIIlllIllIII, this.lIllllIIlIIIlIllllllIIIll, this.IlIIIIIllllllIIlllIllllll, -1358954496);
        }
        n8 = this.IIIllIIlIIIIIIlIlIIllIIlI + this.IlIllllllIIlIIllllIIlIIIl / 2 - this.IlIIIIIllllllIIlllIllllll() / 2 + 2;
        n7 = this.lIlllIlllIIIIlIIlllIllIII + 4 - (int)this.lllllIlllIIllIlIIlIIIllII;
        if (this.IlIIIlIIIIllIIIllIIIIIIll) {
            this.lllIIIllIIIIlllIlIIllIIll(n8, n7, class_08682);
        }
        this.lllIlIIlIIIlIlIIIllIlllIl(n8, n7, n, n2);
        GL11.glDisable((int)2929);
        n6 = 4;
        if (bl) {
            this.IlIllllllIIlIIllllIIlIIIl(0, this.lIlllIlllIIIIlIIlllIllIII, 255, 255);
            this.IlIllllllIIlIIllllIIlIIIl(this.IlIIIIIllllllIIlllIllllll, this.lllIlIIlIIIlIlIIIllIlllIl, 255, 255);
        }
        GL11.glEnable((int)3042);
        OpenGlHelper.glBlendFunc(770, 771, 0, 1);
        GL11.glDisable((int)3008);
        GL11.glShadeModel((int)7425);
        GL11.glDisable((int)3553);
        if (bl) {
            class_08682.lllIlIIlIIIlIlIIIllIlllIl();
            class_08682.lllIIIllIIIIlllIlIIllIIll(0, 0);
            class_08682.lllIIIllIIIIlllIlIIllIIll(this.IIIllIIlIIIIIIlIlIIllIIlI, this.lIlllIlllIIIIlIIlllIllIII + n6, 0.0, 0.0, 1.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll, this.lIlllIlllIIIIlIIlllIllIII + n6, 0.0, 1.0, 1.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll(0, 255);
            class_08682.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll, this.lIlllIlllIIIIlIIlllIllIII, 0.0, 1.0, 0.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll(this.IIIllIIlIIIIIIlIlIIllIIlI, this.lIlllIlllIIIIlIIlllIllIII, 0.0, 0.0, 0.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll();
            class_08682.lllIlIIlIIIlIlIIIllIlllIl();
            class_08682.lllIIIllIIIIlllIlIIllIIll(0, 255);
            class_08682.lllIIIllIIIIlllIlIIllIIll(this.IIIllIIlIIIIIIlIlIIllIIlI, this.IlIIIIIllllllIIlllIllllll, 0.0, 0.0, 1.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll, this.IlIIIIIllllllIIlllIllllll, 0.0, 1.0, 1.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll(0, 0);
            class_08682.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll, this.IlIIIIIllllllIIlllIllllll - n6, 0.0, 1.0, 0.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll(this.IIIllIIlIIIIIIlIlIIllIIlI, this.IlIIIIIllllllIIlllIllllll - n6, 0.0, 0.0, 0.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll();
        }
        if ((n4 = this.IllIIlllllllIIlIIlIIIIlIl()) > 0) {
            n3 = (this.IlIIIIIllllllIIlllIllllll - this.lIlllIlllIIIIlIIlllIllIII) * (this.IlIIIIIllllllIIlllIllllll - this.lIlllIlllIIIIlIIlllIllIII) / this.lllIlIIlIIIlIlIIIllIlllIl();
            if (n3 < 32) {
                n3 = 32;
            }
            if (n3 > this.IlIIIIIllllllIIlllIllllll - this.lIlllIlllIIIIlIIlllIllIII - 8) {
                n3 = this.IlIIIIIllllllIIlllIllllll - this.lIlllIlllIIIIlIIlllIllIII - 8;
            }
            if ((n5 = (int)this.lllllIlllIIllIlIIlIIIllII * (this.IlIIIIIllllllIIlllIllllll - this.lIlllIlllIIIIlIIlllIllIII - n3) / n4 + this.lIlllIlllIIIIlIIlllIllIII) < this.lIlllIlllIIIIlIIlllIllIII) {
                n5 = this.lIlllIlllIIIIlIIlllIllIII;
            }
            class_08682.lllIlIIlIIIlIlIIIllIlllIl();
            class_08682.lllIIIllIIIIlllIlIIllIIll(0, 255);
            class_08682.lllIIIllIIIIlllIlIIllIIll(n10, this.IlIIIIIllllllIIlllIllllll, 0.0, 0.0, 1.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll(n11, this.IlIIIIIllllllIIlllIllllll, 0.0, 1.0, 1.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll(n11, this.lIlllIlllIIIIlIIlllIllIII, 0.0, 1.0, 0.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll(n10, this.lIlllIlllIIIIlIIlllIllIII, 0.0, 0.0, 0.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll();
            class_08682.lllIlIIlIIIlIlIIIllIlllIl();
            class_08682.lllIIIllIIIIlllIlIIllIIll(0x808080, 255);
            class_08682.lllIIIllIIIIlllIlIIllIIll(n10, n5 + n3, 0.0, 0.0, 1.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll(n11, n5 + n3, 0.0, 1.0, 1.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll(n11, n5, 0.0, 1.0, 0.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll(n10, n5, 0.0, 0.0, 0.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll();
            class_08682.lllIlIIlIIIlIlIIIllIlllIl();
            class_08682.lllIIIllIIIIlllIlIIllIIll(0xC0C0C0, 255);
            class_08682.lllIIIllIIIIlllIlIIllIIll(n10, n5 + n3 - 1, 0.0, 0.0, 1.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll(n11 - 1, n5 + n3 - 1, 0.0, 1.0, 1.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll(n11 - 1, n5, 0.0, 1.0, 0.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll(n10, n5, 0.0, 0.0, 0.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll();
        }
        this.lllIlIIlIIIlIlIIIllIlllIl(n, n2);
        GL11.glEnable((int)3553);
        GL11.glShadeModel((int)7424);
        GL11.glEnable((int)3008);
        GL11.glDisable((int)3042);
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(boolean bl) {
        this.IIlllIlIlllIllIIIlllIIlIl = bl;
    }

    public boolean IllIIIllIIIIlIlIlIllIIlll() {
        return this.IIlllIlIlllIllIIIlllIIlIl;
    }

    public int IlIIIIIllllllIIlllIllllll() {
        return 220;
    }

    protected void lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, int n3, int n4) {
        int n5 = this.lllIIIllIIIIlllIlIIllIIll();
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        for (int i = 0; i < n5; ++i) {
            int n6 = n2 + i * this.IllIIlllllllIIlIIlIIIIlIl + this.llIIlllIllIllllIIIlIIIIII;
            int n7 = this.IllIIlllllllIIlIIlIIIIlIl - 4;
            if (n6 > this.IlIIIIIllllllIIlllIllllll || n6 + n7 < this.lIlllIlllIIIIlIIlllIllIII) continue;
            if (this.lIlIlIIlIIIIlIIIIIlllIIII && this.lllIIIllIIIIlllIlIIllIIll(i)) {
                int n8 = this.IIIllIIlIIIIIIlIlIIllIIlI + (this.IlIllllllIIlIIllllIIlIIIl / 2 - this.IlIIIIIllllllIIlllIllllll() / 2);
                int n9 = this.IIIllIIlIIIIIIlIlIIllIIlI + this.IlIllllllIIlIIllllIIlIIIl / 2 + this.IlIIIIIllllllIIlllIllllll() / 2;
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                GL11.glDisable((int)3553);
                class_08682.lllIlIIlIIIlIlIIIllIlllIl();
                class_08682.IlIllllllIIlIIllllIIlIIIl(0x808080);
                class_08682.lllIIIllIIIIlllIlIIllIIll(n8, n6 + n7 + 2, 0.0, 0.0, 1.0);
                class_08682.lllIIIllIIIIlllIlIIllIIll(n9, n6 + n7 + 2, 0.0, 1.0, 1.0);
                class_08682.lllIIIllIIIIlllIlIIllIIll(n9, n6 - 2, 0.0, 1.0, 0.0);
                class_08682.lllIIIllIIIIlllIlIIllIIll(n8, n6 - 2, 0.0, 0.0, 0.0);
                class_08682.IlIllllllIIlIIllllIIlIIIl(0);
                class_08682.lllIIIllIIIIlllIlIIllIIll(n8 + 1, n6 + n7 + 1, 0.0, 0.0, 1.0);
                class_08682.lllIIIllIIIIlllIlIIllIIll(n9 - 1, n6 + n7 + 1, 0.0, 1.0, 1.0);
                class_08682.lllIIIllIIIIlllIlIIllIIll(n9 - 1, n6 - 1, 0.0, 1.0, 0.0);
                class_08682.lllIIIllIIIIlllIlIIllIIll(n8 + 1, n6 - 1, 0.0, 0.0, 0.0);
                class_08682.lllIIIllIIIIlllIlIIllIIll();
                GL11.glEnable((int)3553);
            }
            this.lllIIIllIIIIlllIlIIllIIll(i, n, n6, n7, class_08682, n3, n4);
        }
    }

    protected int lIlllIlllIIIIlIIlllIllIII() {
        return this.IlIllllllIIlIIllllIIlIIIl / 2 + 124;
    }

    private void IlIllllllIIlIIllllIIlIIIl(int n, int n2, int n3, int n4) {
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        this.lllIIIllIIIIlllIlIIllIIll.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(class_0210.llIIlllIllIllllIIIlIIIIII);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        float f = 32.0f;
        class_08682.lllIlIIlIIIlIlIIIllIlllIl();
        class_08682.lllIIIllIIIIlllIlIIllIIll(0x404040, n4);
        class_08682.lllIIIllIIIIlllIlIIllIIll(this.IIIllIIlIIIIIIlIlIIllIIlI, n2, 0.0, 0.0, (float)n2 / f);
        class_08682.lllIIIllIIIIlllIlIIllIIll(this.IIIllIIlIIIIIIlIlIIllIIlI + this.IlIllllllIIlIIllllIIlIIIl, n2, 0.0, (float)this.IlIllllllIIlIIllllIIlIIIl / f, (float)n2 / f);
        class_08682.lllIIIllIIIIlllIlIIllIIll(0x404040, n3);
        class_08682.lllIIIllIIIIlllIlIIllIIll(this.IIIllIIlIIIIIIlIlIIllIIlI + this.IlIllllllIIlIIllllIIlIIIl, n, 0.0, (float)this.IlIllllllIIlIIllllIIlIIIl / f, (float)n / f);
        class_08682.lllIIIllIIIIlllIlIIllIIll(this.IIIllIIlIIIIIIlIlIIllIIlI, n, 0.0, 0.0, (float)n / f);
        class_08682.lllIIIllIIIIlllIlIIllIIll();
    }

    public void lIllllIIlIIIlIllllllIIIll(int n) {
        this.IIIllIIlIIIIIIlIlIIllIIlI = n;
        this.lIllllIIlIIIlIllllllIIIll = n + this.IlIllllllIIlIIllllIIlIIIl;
    }

    public int lIIIIlIlIIlllllIIllIIlIII() {
        return this.IllIIlllllllIIlIIlIIIIlIl;
    }
}

