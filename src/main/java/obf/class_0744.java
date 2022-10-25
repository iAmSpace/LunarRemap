package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.util.ArrayList;
import java.util.List;
import org.lwjgl.opengl.GL11;

public class class_0744 {
    public float lllIIIllIIIIlllIlIIllIIll = 64.0f;
    public float lllIlIIlIIIlIlIIIllIlllIl = 32.0f;
    private int lIlIlIIlIIIIlIIIIIlllIIII;
    private int IlIIIlIIIIllIIIllIIIIIIll;
    public float IlIllllllIIlIIllllIIlIIIl;
    public float lIlllIlllIIIIlIIlllIllIII;
    public float IlIIIIIllllllIIlllIllllll;
    public float lIllllIIlIIIlIllllllIIIll;
    public float IIIllIIlIIIIIIlIlIIllIIlI;
    public float IllIIlllllllIIlIIlIIIIlIl;
    private boolean IIlllIlIlllIllIIIlllIIlIl;
    private int lIlIllIIlIIlIIlIIlIIlIIll;
    public boolean IIIllIllIIlIlIlIlIllllIIl;
    public boolean IllIIIllIIIIlIlIlIllIIlll = true;
    public boolean lIIIIlIlIIlllllIIllIIlIII;
    public List llIIlllIllIllllIIIlIIIIII;
    public List llIIllIllIlIIlIIllIllllll;
    public final String lllIIlIIIllllllIIIIlIlIlI;
    private class_1382 llIIlIllIllllIlIIIIlIIlll;
    public float IlIlllIIIIIIlIIllIIllIlll;
    public float IlIlIIlIlIllIIlIlIIllIIIl;
    public float lllllIlllIIllIlIIlIIIllII;
    public List IlIlIIlllIIlIllIIIlllllIl = new ArrayList();
    public boolean lIIlIIIIIlIlllIlIIlIlIlll = false;

    public class_0744(class_1382 class_13822, String string) {
        this.llIIlllIllIllllIIIlIIIIII = new ArrayList();
        this.llIIlIllIllllIlIIIIlIIlll = class_13822;
        class_13822.IlIllllllIIlIIllllIIlIIIl.add(this);
        this.lllIIlIIIllllllIIIIlIlIlI = string;
        this.lllIlIIlIIIlIlIIIllIlllIl(class_13822.IlIIIIIllllllIIlllIllllll, class_13822.lIllllIIlIIIlIllllllIIIll);
    }

    public class_0744(class_1382 class_13822) {
        this(class_13822, null);
    }

    public class_0744(class_1382 class_13822, int n, int n2) {
        this(class_13822);
        this.lllIIIllIIIIlllIlIIllIIll(n, n2);
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0744 class_07442) {
        if (this.llIIllIllIlIIlIIllIllllll == null) {
            this.llIIllIllIlIIlIIllIllllll = new ArrayList();
        }
        this.llIIllIllIlIIlIIllIllllll.add(class_07442);
    }

    public class_0744 lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        this.lIlIlIIlIIIIlIIIIIlllIIII = n;
        this.IlIIIlIIIIllIIIllIIIIIIll = n2;
        return this;
    }

    public class_0744 lllIIIllIIIIlllIlIIllIIll(String string, float f, float f2, float f3, int n, int n2, int n3) {
        string = this.lllIIlIIIllllllIIIIlIlIlI + "." + string;
        class_0190 class_01902 = this.llIIlIllIllllIlIIIIlIIlll.lllIIIllIIIIlllIlIIllIIll(string);
        this.lllIIIllIIIIlllIlIIllIIll(class_01902.lllIIIllIIIIlllIlIIllIIll, class_01902.lllIlIIlIIIlIlIIIllIlllIl);
        this.llIIlllIllIllllIIIlIIIIII.add(new class_1551(this, this.lIlIlIIlIIIIlIIIIIlllIIII, this.IlIIIlIIIIllIIIllIIIIIIll, f, f2, f3, n, n2, n3, 0.0f).lllIIIllIIIIlllIlIIllIIll(string));
        return this;
    }

    public class_0744 lllIIIllIIIIlllIlIIllIIll(float f, float f2, float f3, int n, int n2, int n3) {
        this.llIIlllIllIllllIIIlIIIIII.add(new class_1551(this, this.lIlIlIIlIIIIlIIIIIlllIIII, this.IlIIIlIIIIllIIIllIIIIIIll, f, f2, f3, n, n2, n3, 0.0f));
        return this;
    }

    public void lllIIIllIIIIlllIlIIllIIll(float f, float f2, float f3, int n, int n2, int n3, float f4) {
        this.llIIlllIllIllllIIIlIIIIII.add(new class_1551(this, this.lIlIlIIlIIIIlIIIIIlllIIII, this.IlIIIlIIIIllIIIllIIIIIIll, f, f2, f3, n, n2, n3, f4));
    }

    public void lllIIIllIIIIlllIlIIllIIll(float f, float f2, float f3) {
        this.IlIllllllIIlIIllllIIlIIIl = f;
        this.lIlllIlllIIIIlIIlllIllIII = f2;
        this.IlIIIIIllllllIIlllIllllll = f3;
    }

    public void lllIIIllIIIIlllIlIIllIIll(float f) {
        if (!this.lIIIIlIlIIlllllIIllIIlIII && this.IllIIIllIIIIlIlIlIllIIlll) {
            if (!this.IIlllIlIlllIllIIIlllIIlIl) {
                this.lIlllIlllIIIIlIIlllIllIII(f);
            }
            GL11.glTranslatef((float)this.IlIlllIIIIIIlIIllIIllIlll, (float)this.IlIlIIlIlIllIIlIlIIllIIIl, (float)this.lllllIlllIIllIlIIlIIIllII);
            if (this.lIllllIIlIIIlIllllllIIIll == 0.0f && this.IIIllIIlIIIIIIlIlIIllIIlI == 0.0f && this.IllIIlllllllIIlIIlIIIIlIl == 0.0f) {
                if (this.IlIllllllIIlIIllllIIlIIIl == 0.0f && this.lIlllIlllIIIIlIIlllIllIII == 0.0f && this.IlIIIIIllllllIIlllIllllll == 0.0f) {
                    GL11.glCallList((int)this.lIlIllIIlIIlIIlIIlIIlIIll);
                    if (this.llIIllIllIlIIlIIllIllllll != null) {
                        for (int i = 0; i < this.llIIllIllIlIIlIIllIllllll.size(); ++i) {
                            ((class_0744)this.llIIllIllIlIIlIIllIllllll.get(i)).lllIIIllIIIIlllIlIIllIIll(f);
                        }
                    }
                } else {
                    GL11.glTranslatef((float)(this.IlIllllllIIlIIllllIIlIIIl * f), (float)(this.lIlllIlllIIIIlIIlllIllIII * f), (float)(this.IlIIIIIllllllIIlllIllllll * f));
                    GL11.glCallList((int)this.lIlIllIIlIIlIIlIIlIIlIIll);
                    if (this.llIIllIllIlIIlIIllIllllll != null) {
                        for (int i = 0; i < this.llIIllIllIlIIlIIllIllllll.size(); ++i) {
                            ((class_0744)this.llIIllIllIlIIlIIllIllllll.get(i)).lllIIIllIIIIlllIlIIllIIll(f);
                        }
                    }
                    GL11.glTranslatef((float)(-this.IlIllllllIIlIIllllIIlIIIl * f), (float)(-this.lIlllIlllIIIIlIIlllIllIII * f), (float)(-this.IlIIIIIllllllIIlllIllllll * f));
                }
            } else {
                GL11.glPushMatrix();
                GL11.glTranslatef((float)(this.IlIllllllIIlIIllllIIlIIIl * f), (float)(this.lIlllIlllIIIIlIIlllIllIII * f), (float)(this.IlIIIIIllllllIIlllIllllll * f));
                if (this.IllIIlllllllIIlIIlIIIIlIl != 0.0f) {
                    GL11.glRotatef((float)(this.IllIIlllllllIIlIIlIIIIlIl * 57.295776f), (float)0.0f, (float)0.0f, (float)1.0f);
                }
                if (this.IIIllIIlIIIIIIlIlIIllIIlI != 0.0f) {
                    GL11.glRotatef((float)(this.IIIllIIlIIIIIIlIlIIllIIlI * 57.295776f), (float)0.0f, (float)1.0f, (float)0.0f);
                }
                if (this.lIllllIIlIIIlIllllllIIIll != 0.0f) {
                    GL11.glRotatef((float)(this.lIllllIIlIIIlIllllllIIIll * 57.295776f), (float)1.0f, (float)0.0f, (float)0.0f);
                }
                GL11.glCallList((int)this.lIlIllIIlIIlIIlIIlIIlIIll);
                if (this.llIIllIllIlIIlIIllIllllll != null) {
                    for (int i = 0; i < this.llIIllIllIlIIlIIllIllllll.size(); ++i) {
                        ((class_0744)this.llIIllIllIlIIlIIllIllllll.get(i)).lllIIIllIIIIlllIlIIllIIll(f);
                    }
                }
                GL11.glPopMatrix();
            }
            GL11.glTranslatef((float)(-this.IlIlllIIIIIIlIIllIIllIlll), (float)(-this.IlIlIIlIlIllIIlIlIIllIIIl), (float)(-this.lllllIlllIIllIlIIlIIIllII));
        }
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(float f) {
        if (!this.lIIIIlIlIIlllllIIllIIlIII && this.IllIIIllIIIIlIlIlIllIIlll) {
            if (!this.IIlllIlIlllIllIIIlllIIlIl) {
                this.lIlllIlllIIIIlIIlllIllIII(f);
            }
            GL11.glPushMatrix();
            GL11.glTranslatef((float)(this.IlIllllllIIlIIllllIIlIIIl * f), (float)(this.lIlllIlllIIIIlIIlllIllIII * f), (float)(this.IlIIIIIllllllIIlllIllllll * f));
            if (this.IIIllIIlIIIIIIlIlIIllIIlI != 0.0f) {
                GL11.glRotatef((float)(this.IIIllIIlIIIIIIlIlIIllIIlI * 57.295776f), (float)0.0f, (float)1.0f, (float)0.0f);
            }
            if (this.lIllllIIlIIIlIllllllIIIll != 0.0f) {
                GL11.glRotatef((float)(this.lIllllIIlIIIlIllllllIIIll * 57.295776f), (float)1.0f, (float)0.0f, (float)0.0f);
            }
            if (this.IllIIlllllllIIlIIlIIIIlIl != 0.0f) {
                GL11.glRotatef((float)(this.IllIIlllllllIIlIIlIIIIlIl * 57.295776f), (float)0.0f, (float)0.0f, (float)1.0f);
            }
            GL11.glCallList((int)this.lIlIllIIlIIlIIlIIlIIlIIll);
            GL11.glPopMatrix();
        }
    }

    public void IlIllllllIIlIIllllIIlIIIl(float f) {
        if (!this.lIIIIlIlIIlllllIIllIIlIII && this.IllIIIllIIIIlIlIlIllIIlll) {
            if (!this.IIlllIlIlllIllIIIlllIIlIl) {
                this.lIlllIlllIIIIlIIlllIllIII(f);
            }
            if (this.lIllllIIlIIIlIllllllIIIll == 0.0f && this.IIIllIIlIIIIIIlIlIIllIIlI == 0.0f && this.IllIIlllllllIIlIIlIIIIlIl == 0.0f) {
                if (this.IlIllllllIIlIIllllIIlIIIl != 0.0f || this.lIlllIlllIIIIlIIlllIllIII != 0.0f || this.IlIIIIIllllllIIlllIllllll != 0.0f) {
                    GL11.glTranslatef((float)(this.IlIllllllIIlIIllllIIlIIIl * f), (float)(this.lIlllIlllIIIIlIIlllIllIII * f), (float)(this.IlIIIIIllllllIIlllIllllll * f));
                }
            } else {
                GL11.glTranslatef((float)(this.IlIllllllIIlIIllllIIlIIIl * f), (float)(this.lIlllIlllIIIIlIIlllIllIII * f), (float)(this.IlIIIIIllllllIIlllIllllll * f));
                if (this.IllIIlllllllIIlIIlIIIIlIl != 0.0f) {
                    GL11.glRotatef((float)(this.IllIIlllllllIIlIIlIIIIlIl * 57.295776f), (float)0.0f, (float)0.0f, (float)1.0f);
                }
                if (this.IIIllIIlIIIIIIlIlIIllIIlI != 0.0f) {
                    GL11.glRotatef((float)(this.IIIllIIlIIIIIIlIlIIllIIlI * 57.295776f), (float)0.0f, (float)1.0f, (float)0.0f);
                }
                if (this.lIllllIIlIIIlIllllllIIIll != 0.0f) {
                    GL11.glRotatef((float)(this.lIllllIIlIIIlIllllllIIIll * 57.295776f), (float)1.0f, (float)0.0f, (float)0.0f);
                }
            }
        }
    }

    private void lIlllIlllIIIIlIIlllIllIII(float f) {
        int n;
        this.lIlIllIIlIIlIIlIIlIIlIIll = class_0994.lllIIIllIIIIlllIlIIllIIll(1);
        GL11.glNewList((int)this.lIlIllIIlIIlIIlIIlIIlIIll, (int)4864);
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        for (n = 0; n < this.llIIlllIllIllllIIIlIIIIII.size(); ++n) {
            ((class_1551)this.llIIlllIllIllllIIIlIIIIII.get(n)).lllIIIllIIIIlllIlIIllIIll(class_08682, f);
        }
        for (n = 0; n < this.IlIlIIlllIIlIllIIIlllllIl.size(); ++n) {
            class_1018 class_10182 = (class_1018)this.IlIlIIlllIIlIllIIIlllllIl.get(n);
            class_10182.lllIIIllIIIIlllIlIIllIIll(class_0868.IlIIIIIllllllIIlllIllllll, f);
        }
        GL11.glEndList();
        this.IIlllIlIlllIllIIIlllIIlIl = true;
    }

    public class_0744 lllIlIIlIIIlIlIIIllIlllIl(int n, int n2) {
        this.lllIIIllIIIIlllIlIIllIIll = n;
        this.lllIlIIlIIIlIlIIIllIlllIl = n2;
        return this;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(float f, float f2, float f3, int n, int n2, int n3, float f4) {
        this.IlIlIIlllIIlIllIIIlllllIl.add(new class_1018(this, this.lIlIlIIlIIIIlIIIIIlllIIII, this.IlIIIlIIIIllIIIllIIIIIIll, f, f2, f3, n, n2, n3, f4));
    }
}

