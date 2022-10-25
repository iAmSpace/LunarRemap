package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public abstract class class_1194
extends class_2117 {
    protected double IllIIlllllllIIlIIlIIIIlIl = 0.0;
    public int IIIllIllIIlIlIlIlIllllIIl = 0;
    protected int IllIIIllIIIIlIlIlIllIIlll = 0;
    public int lIIIIlIlIIlllllIIllIIlIII;
    protected int llIIlllIllIllllIIIlIIIIII;
    public boolean llIIllIllIlIIlIIllIllllll = false;
    private boolean lllIIIllIIIIlllIlIIllIIll = false;
    private float lllIIlIIIllllllIIIIlIlIlI;

    public class_1194(float f, int n, int n2, int n3, int n4) {
        super(f);
        this.lIIIIlIlIIlllllIIllIIlIII = n;
        this.llIIlllIllIllllIIIlIIIIII = n2;
        this.lIlllIlllIIIIlIIlllIllIII = n;
        this.IlIIIIIllllllIIlllIllllll = n2;
        this.lIllllIIlIIIlIllllllIIIll = n3;
        this.IIIllIIlIIIIIIlIlIIllIIlI = n4;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(int n, int n2) {
        if (this.lllIIIllIIIIlllIlIIllIIll(n, n2)) {
            double d = Math.round(this.IllIIlllllllIIlIIlIIIIlIl / 25.0);
            this.IllIIlllllllIIlIIlIIIIlIl -= d;
            if (this.IllIIlllllllIIlIIlIIIIlIl != 0.0) {
                this.IIIllIllIIlIlIlIlIllllIIl = (int)((double)this.IIIllIllIIlIlIlIlIllllIIl + d);
            }
        } else {
            this.IllIIlllllllIIlIIlIIIIlIl = 0.0;
        }
        if (this.llIIllIllIlIIlIIllIllllll) {
            if (this.IIIllIllIIlIlIlIlIllllIIl < -this.IllIIIllIIIIlIlIlIllIIlll + this.IIIllIIlIIIIIIlIlIIllIIlI) {
                this.IIIllIllIIlIlIlIlIllllIIl = -this.IllIIIllIIIIlIlIlIllIIlll + this.IIIllIIlIIIIIIlIlIIllIIlI;
                this.IllIIlllllllIIlIIlIIIIlIl = 0.0;
            }
            if (this.IIIllIllIIlIlIlIlIllllIIl > 0) {
                this.IIIllIllIIlIlIlIlIllllIIl = 0;
                this.IllIIlllllllIIlIIlIIIIlIl = 0.0;
            }
        }
        GL11.glPushMatrix();
        GL11.glTranslatef((float)0.0f, (float)this.IIIllIllIIlIlIlIlIllllIIl, (float)0.0f);
    }

    public void IlIllllllIIlIIllllIIlIIIl(int n, int n2) {
        boolean bl;
        this.llIIllIllIlIIlIIllIllllll = true;
        GL11.glPopMatrix();
        boolean bl2 = bl = this.IllIIIllIIIIlIlIlIllIIlll > this.IIIllIIlIIIIIIlIlIIllIIlI;
        if (!(!this.lllIIIllIIIIlllIlIIllIIll || Mouse.isButtonDown((int)0) && this.lllIIIllIIIIlllIlIIllIIll(n, n2))) {
            this.lllIIIllIIIIlllIlIIllIIll = false;
        }
        double d = this.IIIllIIlIIIIIIlIlIIllIIlI - 8;
        double d2 = this.IllIIIllIIIIlIlIlIllIIlll;
        double d3 = d / d2 * 100.0;
        double d4 = d / 100.0 * d3;
        double d5 = (double)this.IIIllIllIIlIlIlIlIllllIIl / 100.0 * d3;
        if (bl) {
            boolean bl3;
            int n3 = this.IIIllIIlIIIIIIlIlIIllIIlI;
            boolean bl4 = (float)n > (float)(this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll - 9) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n < (float)(this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll - 3) * this.lllIlIIlIIIlIlIIIllIlllIl && (double)n2 > ((double)(this.IlIIIIIllllllIIlllIllllll + 11) - d5) * (double)this.lllIlIIlIIIlIlIIIllIlllIl && (double)n2 < ((double)(this.IlIIIIIllllllIIlllIllllll + 8) + d4 - d5) * (double)this.lllIlIIlIIIlIlIIIllIlllIl;
            boolean bl5 = bl3 = (float)n > (float)(this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll - 9) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n < (float)(this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll - 3) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n2 > (float)(this.IlIIIIIllllllIIlllIllllll + 11) * this.lllIlIIlIIIlIlIIIllIlllIl && (double)n2 < ((double)(this.IlIIIIIllllllIIlllIllllll + 6) + d - 3.0) * (double)this.lllIlIIlIIIlIlIIIllIlllIl;
            if (Mouse.isButtonDown((int)0) && !this.lllIIIllIIIIlllIlIIllIIll && bl3) {
                this.lllIIIllIIIIlllIlIIllIIll = true;
            }
            if (this.lllIIIllIIIIlllIlIIllIIll) {
                if ((float)this.IIIllIllIIlIlIlIlIllllIIl != this.lllIIlIIIllllllIIIIlIlIlI && (double)this.lllIIlIIIllllllIIIIlIlIlI != d4 / 2.0 && (double)this.lllIIlIIIllllllIIIIlIlIlI != d4 / 2.0 + (double)(-this.IllIIIllIIIIlIlIlIllIIlll) + (double)n3) {
                    if ((double)n2 > ((double)(this.IlIIIIIllllllIIlllIllllll + 11) + d4 - d4 / 4.0 - d5) * (double)this.lllIlIIlIIIlIlIIIllIlllIl) {
                        this.IIIllIllIIlIlIlIlIllllIIl = (int)((double)this.IIIllIllIIlIlIlIlIllllIIl - d2 / 7.0);
                    } else if ((double)n2 < ((double)(this.IlIIIIIllllllIIlllIllllll + 11) + d4 / 4.0 - d5) * (double)this.lllIlIIlIIIlIlIIIllIlllIl) {
                        this.IIIllIllIIlIlIlIlIllllIIl = (int)((double)this.IIIllIllIIlIlIlIlIllllIIl + d2 / 7.0);
                    }
                    this.lllIIlIIIllllllIIIIlIlIlI = this.IIIllIllIIlIlIlIlIllllIIl;
                } else if ((double)n2 > ((double)(this.IlIIIIIllllllIIlllIllllll + 11) + d4 - d4 / 4.0 - d5) * (double)this.lllIlIIlIIIlIlIIIllIlllIl || (double)n2 < ((double)(this.IlIIIIIllllllIIlllIllllll + 11) + d4 / 4.0 - d5) * (double)this.lllIlIIlIIIlIlIIIllIlllIl) {
                    this.lllIIlIIIllllllIIIIlIlIlI = 1.0f;
                }
            }
            if (this.IIIllIllIIlIlIlIlIllllIIl < -this.IllIIIllIIIIlIlIlIllIIlll + n3) {
                this.IIIllIllIIlIlIlIlIllllIIl = -this.IllIIIllIIIIlIlIlIllIIlll + n3;
                this.IllIIlllllllIIlIIlIIIIlIl = 0.0;
            }
            if (this.IIIllIllIIlIlIlIlIllllIIl > 0) {
                this.IIIllIllIIlIlIlIlIllllIIl = 0;
                this.IllIIlllllllIIlIIlIIIIlIl = 0.0;
            }
            class_0857.lllIIIllIIIIlllIlIIllIIll((double)(this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll - 6), (double)(this.IlIIIIIllllllIIlllIllllll + 11), (double)(this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll - 4), (double)(this.IlIIIIIllllllIIlllIllllll + 6) + d - 3.0, 2.0, bl3 && !bl4 ? 0x6F000000 : 0x3F000000);
            class_0857.lllIIIllIIIIlllIlIIllIIll((double)(this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll - 7), (double)(this.IlIIIIIllllllIIlllIllllll + 11) - d5, (double)(this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll - 3), (double)(this.IlIIIIIllllllIIlllIllllll + 8) + d4 - d5, 2.0, bl4 || this.lllIIIllIIIIlllIlIIllIIll ? -754974721 : -2130706433);
        }
        if (!bl && this.IIIllIllIIlIlIlIlIllllIIl != 0) {
            this.IIIllIllIIlIlIlIlIllllIIl = 0;
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n) {
        if (n != 0 && this.IllIIIllIIIIlIlIlIllIIlll >= this.IIIllIIlIIIIIIlIlIIllIIlI) {
            this.IllIIlllllllIIlIIlIIIIlIl += (double)(n / 2);
        }
    }

    public abstract boolean lllIIIllIIIIlllIlIIllIIll(class_1665 var1);

    public abstract void lllIlIIlIIIlIlIIIllIlllIl(class_1665 var1);
}

