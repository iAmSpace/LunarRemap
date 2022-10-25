package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public class class_1326
extends class_0759 {
    protected final class_0759 IIIllIIlIIIIIIlIlIIllIIlI;
    protected double IllIIlllllllIIlIIlIIIIlIl;
    protected float IIIllIllIIlIlIlIlIllllIIl;
    protected float IllIIIllIIIIlIlIlIllIIlll;
    protected boolean lIIIIlIlIIlllllIIllIIlIII;
    protected boolean llIIlllIllIllllIIIlIIIIII;
    protected float llIIllIllIlIIlIIllIllllll;
    private float lllIIlIIIllllllIIIIlIlIlI;
    private boolean IlIlllIIIIIIlIIllIIllIlll;

    public class_1326(class_0759 class_07592) {
        this.IIIllIIlIIIIIIlIlIIllIIlI = class_07592;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(float f, float f2) {
        return f >= this.lllIIIllIIIIlllIlIIllIIll && f <= this.lllIIIllIIIIlllIlIIllIIll + this.IlIllllllIIlIIllllIIlIIIl && f2 > this.lllIlIIlIIIlIlIIIllIlllIl && f2 < this.lllIlIIlIIIlIlIIIllIlllIl + this.lIlllIlllIIIIlIIlllIllIII;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(float f, float f2, boolean bl) {
        float f3;
        this.llIIlllIllIllllIIIlIIIIII = true;
        GL11.glPopMatrix();
        boolean bl2 = this.IIIllIllIIlIlIlIlIllllIIl();
        if (!(!this.lIIIIlIlIIlllllIIllIIlIII || Mouse.isButtonDown((int)0) && this.lllIIIllIIIIlllIlIIllIIll(f, f2) && bl)) {
            this.lIIIIlIlIIlllllIIllIIlIII = false;
        }
        if (this.IlIlllIIIIIIlIIllIIllIlll && !Mouse.isButtonDown((int)0)) {
            this.IlIlllIIIIIIlIIllIIllIlll = false;
        }
        float f4 = this.lIlllIlllIIIIlIIlllIllIII;
        float f5 = this.IllIIIllIIIIlIlIlIllIIlll;
        float f6 = f4 / f5 * 100.0f;
        float f7 = f4 / 100.0f * f6;
        float f8 = this.IIIllIllIIlIlIlIlIllllIIl / 100.0f * f6;
        if (Mouse.isButtonDown((int)0) && this.IlIlllIIIIIIlIIllIIllIlll) {
            f3 = f2 - this.lllIlIIlIIIlIlIIIllIlllIl;
            float f9 = f3 / this.lIlllIlllIIIIlIIlllIllIII;
            this.IIIllIllIIlIlIlIlIllllIIl = -(this.IllIIIllIIIIlIlIlIllIIlll * f9) + f7 / 2.0f;
        }
        if (bl2) {
            boolean bl3;
            f3 = this.lIlllIlllIIIIlIIlllIllIII;
            boolean bl4 = f >= this.lllIIIllIIIIlllIlIIllIIll && f <= this.lllIIIllIIIIlllIlIIllIIll + this.IlIllllllIIlIIllllIIlIIIl && f2 > this.lllIlIIlIIIlIlIIIllIlllIl - f8 && f2 < this.lllIlIIlIIIlIlIIIllIlllIl + f7 - f8;
            boolean bl5 = bl3 = f >= this.lllIIIllIIIIlllIlIIllIIll && f <= this.lllIIIllIIIIlllIlIIllIIll + this.IlIllllllIIlIIllllIIlIIIl && f2 > this.lllIlIIlIIIlIlIIIllIlllIl && f2 < this.lllIlIIlIIIlIlIIIllIlllIl + f4 - 3.0f;
            if (!Mouse.isButtonDown((int)0) || this.lIIIIlIlIIlllllIIllIIlIII || bl3) {
                // empty if block
            }
            if (this.lIIIIlIlIIlllllIIllIIlIII) {
                if (this.IIIllIllIIlIlIlIlIllllIIl != this.llIIllIllIlIIlIIllIllllll && this.llIIllIllIlIIlIIllIllllll != f7 / 2.0f && this.llIIllIllIlIIlIIllIllllll != f7 / 2.0f + -this.IllIIIllIIIIlIlIlIllIIlll + f3) {
                    if (f2 > this.lllIlIIlIIIlIlIIIllIlllIl + f7 - f7 / 4.0f - f8) {
                        this.IIIllIllIIlIlIlIlIllllIIl -= f5 / 7.0f;
                    } else if (f2 < this.lllIlIIlIIIlIlIIIllIlllIl + f7 / 4.0f - f8) {
                        this.IIIllIllIIlIlIlIlIllllIIl += f5 / 7.0f;
                    }
                    this.llIIllIllIlIIlIIllIllllll = this.IIIllIllIIlIlIlIlIllllIIl;
                } else if (f2 > this.lllIlIIlIIIlIlIIIllIlllIl + f7 - f7 / 4.0f - f8 || f2 < this.lllIlIIlIIIlIlIIIllIlllIl + f7 / 4.0f - f8) {
                    this.llIIllIllIlIIlIIllIllllll = 1.0f;
                }
            }
            if (this.IIIllIllIIlIlIlIlIllllIIl < -this.IllIIIllIIIIlIlIlIllIIlll + f3) {
                this.IIIllIllIIlIlIlIlIllllIIl = -this.IllIIIllIIIIlIlIlIllIIlll + f3;
                this.IllIIlllllllIIlIIlIIIIlIl = 0.0;
            }
            if (this.IIIllIllIIlIlIlIlIllllIIl > 0.0f) {
                this.IIIllIllIIlIlIlIlIllllIIl = 0.0f;
                this.IllIIlllllllIIlIIlIIIIlIl = 0.0;
            }
            class_0210.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl, this.lllIIIllIIIIlllIlIIllIIll + this.IlIllllllIIlIIllllIIlIIIl, this.lllIlIIlIIIlIlIIIllIlllIl + this.lIlllIlllIIIIlIIlllIllIII, -13158601);
            class_0210.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl - f8, this.lllIIIllIIIIlllIlIIllIIll + this.IlIllllllIIlIIllllIIlIIIl, this.lllIlIIlIIIlIlIIIllIlllIl + f7 - f8, bl4 || this.lIIIIlIlIIlllllIIllIIlIII ? -52429 : -4180940);
        }
        if (!bl2 && this.IIIllIllIIlIlIlIlIllllIIl != 0.0f) {
            this.IIIllIllIIlIlIlIlIllllIIl = 0.0f;
        }
    }

    public void IlIllllllIIlIIllllIIlIIIl(float f, float f2, boolean bl) {
        if (bl && (this.IIIllIIlIIIIIIlIlIIllIIlI == null || this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(f, f2)) && this.IllIIlllllllIIlIIlIIIIlIl != 0.0) {
            this.IIIllIllIIlIlIlIlIllllIIl = (float)((double)this.IIIllIllIIlIlIlIlIllllIIl + this.IllIIlllllllIIlIIlIIIIlIl / 8.0);
            this.IllIIlllllllIIlIIlIIIIlIl = 0.0;
        }
        if (this.llIIlllIllIllllIIIlIIIIII) {
            if (this.IIIllIllIIlIlIlIlIllllIIl < -this.IllIIIllIIIIlIlIlIllIIlll + this.lIlllIlllIIIIlIIlllIllIII) {
                this.IIIllIllIIlIlIlIlIllllIIl = -this.IllIIIllIIIIlIlIlIllIIlll + this.lIlllIlllIIIIlIIlllIllIII;
                this.IllIIlllllllIIlIIlIIIIlIl = 0.0;
            }
            if (this.IIIllIllIIlIlIlIlIllllIIl > 0.0f) {
                this.IIIllIllIIlIlIlIlIllllIIl = 0.0f;
                this.IllIIlllllllIIlIIlIIIIlIl = 0.0;
            }
        }
        GL11.glPushMatrix();
        GL11.glTranslatef((float)0.0f, (float)this.IIIllIllIIlIlIlIlIllllIIl, (float)0.0f);
    }

    public void lIlllIlllIIIIlIIlllIllIII(float f, float f2, boolean bl) {
        float f3;
        this.llIIlllIllIllllIIIlIIIIII = true;
        GL11.glPopMatrix();
        boolean bl2 = this.IIIllIllIIlIlIlIlIllllIIl();
        if (!(!this.lIIIIlIlIIlllllIIllIIlIII || Mouse.isButtonDown((int)0) && this.lllIIIllIIIIlllIlIIllIIll(f, f2) && bl)) {
            this.lIIIIlIlIIlllllIIllIIlIII = false;
        }
        if (this.IlIlllIIIIIIlIIllIIllIlll && !Mouse.isButtonDown((int)0)) {
            this.IlIlllIIIIIIlIIllIIllIlll = false;
        }
        float f4 = this.lIlllIlllIIIIlIIlllIllIII;
        float f5 = this.IllIIIllIIIIlIlIlIllIIlll;
        float f6 = f4 / f5 * 100.0f;
        float f7 = f4 / 100.0f * f6;
        float f8 = this.IIIllIllIIlIlIlIlIllllIIl / 100.0f * f6;
        if (Mouse.isButtonDown((int)0) && this.IlIlllIIIIIIlIIllIIllIlll) {
            f3 = f2 - this.lllIlIIlIIIlIlIIIllIlllIl;
            float f9 = f3 / this.lIlllIlllIIIIlIIlllIllIII;
            this.IIIllIllIIlIlIlIlIllllIIl = -(this.IllIIIllIIIIlIlIlIllIIlll - this.lIlllIlllIIIIlIIlllIllIII / 2.0f) + this.IllIIIllIIIIlIlIlIllIIlll * f9 + f7 / 2.0f;
        }
        if (bl2) {
            boolean bl3;
            f3 = this.lIlllIlllIIIIlIIlllIllIII;
            boolean bl4 = f >= this.lllIIIllIIIIlllIlIIllIIll && f <= this.lllIIIllIIIIlllIlIIllIIll + this.IlIllllllIIlIIllllIIlIIIl && f2 > this.lllIlIIlIIIlIlIIIllIlllIl - f8 && f2 < this.lllIlIIlIIIlIlIIIllIlllIl + f7 - f8;
            boolean bl5 = bl3 = f >= this.lllIIIllIIIIlllIlIIllIIll && f <= this.lllIIIllIIIIlllIlIIllIIll + this.IlIllllllIIlIIllllIIlIIIl && f2 > this.lllIlIIlIIIlIlIIIllIlllIl && f2 < this.lllIlIIlIIIlIlIIIllIlllIl + f4 - 3.0f;
            if (!Mouse.isButtonDown((int)0) || this.lIIIIlIlIIlllllIIllIIlIII || bl3) {
                // empty if block
            }
            if (this.lIIIIlIlIIlllllIIllIIlIII) {
                if (this.IIIllIllIIlIlIlIlIllllIIl != this.llIIllIllIlIIlIIllIllllll && this.llIIllIllIlIIlIIllIllllll != f7 / 2.0f && this.llIIllIllIlIIlIIllIllllll != f7 / 2.0f + -this.IllIIIllIIIIlIlIlIllIIlll + f3) {
                    if (f2 > this.lllIlIIlIIIlIlIIIllIlllIl + this.lIlllIlllIIIIlIIlllIllIII - f7 - f7 / 4.0f + f8) {
                        this.IIIllIllIIlIlIlIlIllllIIl = f5 / 7.0f;
                    } else if (f2 < this.lllIlIIlIIIlIlIIIllIlllIl + this.lIlllIlllIIIIlIIlllIllIII - f7 / 4.0f + f8) {
                        this.IIIllIllIIlIlIlIlIllllIIl += f5 / 7.0f;
                    }
                    this.llIIllIllIlIIlIIllIllllll = this.IIIllIllIIlIlIlIlIllllIIl;
                } else if (f2 > this.lllIlIIlIIIlIlIIIllIlllIl + this.lIlllIlllIIIIlIIlllIllIII - f7 - f7 / 4.0f + f8 || f2 < this.lllIlIIlIIIlIlIIIllIlllIl + this.lIlllIlllIIIIlIIlllIllIII - f7 / 4.0f - f8) {
                    this.llIIllIllIlIIlIIllIllllll = 1.0f;
                }
            }
            if (this.IIIllIllIIlIlIlIlIllllIIl < -this.IllIIIllIIIIlIlIlIllIIlll + f3) {
                this.IIIllIllIIlIlIlIlIllllIIl = -this.IllIIIllIIIIlIlIlIllIIlll + f3;
                this.IllIIlllllllIIlIIlIIIIlIl = 0.0;
            }
            if (this.IIIllIllIIlIlIlIlIllllIIl > 0.0f) {
                this.IIIllIllIIlIlIlIlIllllIIl = 0.0f;
                this.IllIIlllllllIIlIIlIIIIlIl = 0.0;
            }
            class_0210.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl, this.lllIIIllIIIIlllIlIIllIIll + this.IlIllllllIIlIIllllIIlIIIl, this.lllIlIIlIIIlIlIIIllIlllIl + this.lIlllIlllIIIIlIIlllIllIII, -13158601);
            class_0210.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl + this.lIlllIlllIIIIlIIlllIllIII + f8, this.lllIIIllIIIIlllIlIIllIIll + this.IlIllllllIIlIIllllIIlIIIl, this.lllIlIIlIIIlIlIIIllIlllIl + this.lIlllIlllIIIIlIIlllIllIII - f7 + f8, bl4 || this.lIIIIlIlIIlllllIIllIIlIII ? -52429 : -4180940);
        }
        if (!bl2 && this.IIIllIllIIlIlIlIlIllllIIl != 0.0f) {
            this.IIIllIllIIlIlIlIlIllllIIl = 0.0f;
        }
    }

    public void IlIIIIIllllllIIlllIllllll(float f, float f2, boolean bl) {
        if (bl && (this.IIIllIIlIIIIIIlIlIIllIIlI == null || this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(f, f2)) && this.IllIIlllllllIIlIIlIIIIlIl != 0.0) {
            this.IIIllIllIIlIlIlIlIllllIIl = (float)((double)this.IIIllIllIIlIlIlIlIllllIIl - this.IllIIlllllllIIlIIlIIIIlIl / 8.0);
            this.IllIIlllllllIIlIIlIIIIlIl = 0.0;
        }
        if (this.llIIlllIllIllllIIIlIIIIII) {
            if (this.IIIllIllIIlIlIlIlIllllIIl < -this.IllIIIllIIIIlIlIlIllIIlll + this.lIlllIlllIIIIlIIlllIllIII) {
                this.IIIllIllIIlIlIlIlIllllIIl = -this.IllIIIllIIIIlIlIlIllIIlll + this.lIlllIlllIIIIlIIlllIllIII;
                this.IllIIlllllllIIlIIlIIIIlIl = 0.0;
            }
            if (this.IIIllIllIIlIlIlIlIllllIIl > 0.0f) {
                this.IIIllIllIIlIlIlIlIllllIIl = 0.0f;
                this.IllIIlllllllIIlIIlIIIIlIl = 0.0;
            }
        }
        GL11.glPushMatrix();
        GL11.glTranslatef((float)0.0f, (float)(-this.IIIllIllIIlIlIlIlIllllIIl), (float)0.0f);
    }

    public float IllIIlllllllIIlIIlIIIIlIl() {
        return this.IIIllIllIIlIlIlIlIllllIIl;
    }

    public boolean IIIllIllIIlIlIlIlIllllIIl() {
        return this.IllIIIllIIIIlIlIlIllIIlll > this.lIlllIlllIIIIlIIlllIllIII;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(float f, float f2, int n, boolean bl) {
        if (this.lllIIIllIIIIlllIlIIllIIll(f, f2) && bl) {
            this.lllIIlIIIllllllIIIIlIlIlI = f2 - this.lllIlIIlIIIlIlIIIllIlllIl;
            this.IlIlllIIIIIIlIIllIIllIlll = true;
        }
        return false;
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
        int n = Mouse.getEventDWheel();
        if (n != 0 && this.IllIIIllIIIIlIlIlIllIIlll >= this.lIlllIlllIIIIlIIlllIllIII) {
            this.IllIIlllllllIIlIIlIIIIlIl += (double)((float)n / 1.75f);
        }
    }

    public class_0759 IllIIIllIIIIlIlIlIllIIlll() {
        return this.IIIllIIlIIIIIIlIlIIllIIlI;
    }

    public void IlIIIIIllllllIIlllIllllll(float f) {
        this.IllIIIllIIIIlIlIlIllIIlll = f;
    }

    public boolean lIIIIlIlIIlllllIIllIIlIII() {
        return this.lIIIIlIlIIlllllIIllIIlIII;
    }

    public boolean llIIlllIllIllllIIIlIIIIII() {
        return this.IlIlllIIIIIIlIIllIIllIlll;
    }
}

