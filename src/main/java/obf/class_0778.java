package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.nio.ByteBuffer;

import net.minecraft.client.renderer.OpenGlHelper;
import org.lwjgl.opengl.GL11;

public class class_0778 {
    public int lllIIIllIIIIlllIlIIllIIll;
    public int lllIlIIlIIIlIlIIIllIlllIl;
    public int IlIllllllIIlIIllllIIlIIIl;
    public int lIlllIlllIIIIlIIlllIllIII;
    public boolean IlIIIIIllllllIIlllIllllll;
    public int lIllllIIlIIIlIllllllIIIll;
    public int IIIllIIlIIIIIIlIlIIllIIlI;
    public int IllIIlllllllIIlIIlIIIIlIl;
    public float[] IIIllIllIIlIlIlIlIllllIIl;
    public int IllIIIllIIIIlIlIlIllIIlll;

    public class_0778(int n, int n2, boolean bl) {
        this.IlIIIIIllllllIIlllIllllll = bl;
        this.lIllllIIlIIIlIllllllIIIll = -1;
        this.IIIllIIlIIIIIIlIlIIllIIlI = -1;
        this.IllIIlllllllIIlIIlIIIIlIl = -1;
        this.IIIllIllIIlIlIlIlIllllIIl = new float[4];
        this.IIIllIllIIlIlIlIlIllllIIl[0] = 1.0f;
        this.IIIllIllIIlIlIlIlIllllIIl[1] = 1.0f;
        this.IIIllIllIIlIlIlIlIllllIIl[2] = 1.0f;
        this.IIIllIllIIlIlIlIlIllllIIl[3] = 0.0f;
        this.lllIIIllIIIIlllIlIIllIIll(n, n2);
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        if (!OpenGlHelper.IIIllIIlIIIIIIlIlIIllIIlI()) {
            this.IlIllllllIIlIIllllIIlIIIl = n;
            this.lIlllIlllIIIIlIIlllIllIII = n2;
        } else {
            GL11.glEnable((int)2929);
            if (this.lIllllIIlIIIlIllllllIIIll >= 0) {
                this.lllIIIllIIIIlllIlIIllIIll();
            }
            this.lllIlIIlIIIlIlIIIllIlllIl(n, n2);
            this.lllIlIIlIIIlIlIIIllIlllIl();
            OpenGlHelper.IIIllIIlIIIIIIlIlIIllIIlI(OpenGlHelper.IlIIIIIllllllIIlllIllllll, 0);
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll() {
        if (OpenGlHelper.IIIllIIlIIIIIIlIlIIllIIlI()) {
            this.lIlllIlllIIIIlIIlllIllIII();
            this.IlIIIIIllllllIIlllIllllll();
            if (this.IllIIlllllllIIlIIlIIIIlIl > -1) {
                OpenGlHelper.IIIllIIlIIIIIIlIlIIllIIlI(this.IllIIlllllllIIlIIlIIIIlIl);
                this.IllIIlllllllIIlIIlIIIIlIl = -1;
            }
            if (this.IIIllIIlIIIIIIlIlIIllIIlI > -1) {
                class_0231.lllIIIllIIIIlllIlIIllIIll(this.IIIllIIlIIIIIIlIlIIllIIlI);
                this.IIIllIIlIIIIIIlIlIIllIIlI = -1;
            }
            if (this.lIllllIIlIIIlIllllllIIIll > -1) {
                OpenGlHelper.IIIllIIlIIIIIIlIlIIllIIlI(OpenGlHelper.IlIIIIIllllllIIlllIllllll, 0);
                OpenGlHelper.IllIIlllllllIIlIIlIIIIlIl(this.lIllllIIlIIIlIllllllIIIll);
                this.lIllllIIlIIIlIllllllIIIll = -1;
            }
        }
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(int n, int n2) {
        this.IlIllllllIIlIIllllIIlIIIl = n;
        this.lIlllIlllIIIIlIIlllIllIII = n2;
        this.lllIIIllIIIIlllIlIIllIIll = n;
        this.lllIlIIlIIIlIlIIIllIlllIl = n2;
        if (!OpenGlHelper.IIIllIIlIIIIIIlIlIIllIIlI()) {
            this.lIllllIIlIIIlIllllllIIIll();
        } else {
            this.lIllllIIlIIIlIllllllIIIll = OpenGlHelper.IlIIIIIllllllIIlllIllllll();
            this.IIIllIIlIIIIIIlIlIIllIIlI = class_0231.lllIIIllIIIIlllIlIIllIIll();
            if (this.IlIIIIIllllllIIlllIllllll) {
                this.IllIIlllllllIIlIIlIIIIlIl = OpenGlHelper.lIllllIIlIIIlIllllllIIIll();
            }
            this.lllIIIllIIIIlllIlIIllIIll(9728);
            GL11.glBindTexture((int)3553, (int)this.IIIllIIlIIIIIIlIlIIllIIlI);
            GL11.glTexImage2D((int)3553, (int)0, (int)32856, (int)this.lllIIIllIIIIlllIlIIllIIll, (int)this.lllIlIIlIIIlIlIIIllIlllIl, (int)0, (int)6408, (int)5121, (ByteBuffer)null);
            OpenGlHelper.IIIllIIlIIIIIIlIlIIllIIlI(OpenGlHelper.IlIIIIIllllllIIlllIllllll, this.lIllllIIlIIIlIllllllIIIll);
            OpenGlHelper.lllIIIllIIIIlllIlIIllIIll(OpenGlHelper.IlIIIIIllllllIIlllIllllll, OpenGlHelper.IIIllIIlIIIIIIlIlIIllIIlI, 3553, this.IIIllIIlIIIIIIlIlIIllIIlI, 0);
            if (this.IlIIIIIllllllIIlllIllllll) {
                OpenGlHelper.IllIIlllllllIIlIIlIIIIlIl(OpenGlHelper.lIllllIIlIIIlIllllllIIIll, this.IllIIlllllllIIlIIlIIIIlIl);
                OpenGlHelper.lllIIIllIIIIlllIlIIllIIll(OpenGlHelper.lIllllIIlIIIlIllllllIIIll, 33190, this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl);
                OpenGlHelper.lllIlIIlIIIlIlIIIllIlllIl(OpenGlHelper.IlIIIIIllllllIIlllIllllll, OpenGlHelper.IllIIlllllllIIlIIlIIIIlIl, OpenGlHelper.lIllllIIlIIIlIllllllIIIll, this.IllIIlllllllIIlIIlIIIIlIl);
            }
            this.lIllllIIlIIIlIllllllIIIll();
            this.lIlllIlllIIIIlIIlllIllIII();
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n) {
        if (OpenGlHelper.IIIllIIlIIIIIIlIlIIllIIlI()) {
            this.IllIIIllIIIIlIlIlIllIIlll = n;
            GL11.glBindTexture((int)3553, (int)this.IIIllIIlIIIIIIlIlIIllIIlI);
            GL11.glTexParameterf((int)3553, (int)10241, (float)n);
            GL11.glTexParameterf((int)3553, (int)10240, (float)n);
            GL11.glTexParameterf((int)3553, (int)10242, (float)10496.0f);
            GL11.glTexParameterf((int)3553, (int)10243, (float)10496.0f);
            GL11.glBindTexture((int)3553, (int)0);
        }
    }

    public void lllIlIIlIIIlIlIIIllIlllIl() {
        int n = OpenGlHelper.IIIllIllIIlIlIlIlIllllIIl(OpenGlHelper.IlIIIIIllllllIIlllIllllll);
        if (n != OpenGlHelper.IIIllIllIIlIlIlIlIllllIIl) {
            if (n == OpenGlHelper.IllIIIllIIIIlIlIlIllIIlll) {
                throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT");
            }
            if (n == OpenGlHelper.lIIIIlIlIIlllllIIllIIlIII) {
                throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT");
            }
            if (n == OpenGlHelper.llIIlllIllIllllIIIlIIIIII) {
                throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_DRAW_BUFFER");
            }
            if (n == OpenGlHelper.llIIllIllIlIIlIIllIllllll) {
                throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_READ_BUFFER");
            }
            throw new RuntimeException("glCheckFramebufferStatus returned unknown status:" + n);
        }
    }

    public void IlIllllllIIlIIllllIIlIIIl() {
        if (OpenGlHelper.IIIllIIlIIIIIIlIlIIllIIlI()) {
            GL11.glBindTexture((int)3553, (int)this.IIIllIIlIIIIIIlIlIIllIIlI);
        }
    }

    public void lIlllIlllIIIIlIIlllIllIII() {
        if (OpenGlHelper.IIIllIIlIIIIIIlIlIIllIIlI()) {
            GL11.glBindTexture((int)3553, (int)0);
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(boolean bl) {
        if (OpenGlHelper.IIIllIIlIIIIIIlIlIIllIIlI()) {
            OpenGlHelper.IIIllIIlIIIIIIlIlIIllIIlI(OpenGlHelper.IlIIIIIllllllIIlllIllllll, this.lIllllIIlIIIlIllllllIIIll);
            if (bl) {
                GL11.glViewport((int)0, (int)0, (int)this.IlIllllllIIlIIllllIIlIIIl, (int)this.lIlllIlllIIIIlIIlllIllIII);
            }
        }
    }

    public void IlIIIIIllllllIIlllIllllll() {
        if (OpenGlHelper.IIIllIIlIIIIIIlIlIIllIIlI()) {
            OpenGlHelper.IIIllIIlIIIIIIlIlIIllIIlI(OpenGlHelper.IlIIIIIllllllIIlllIllllll, 0);
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(float f, float f2, float f3, float f4) {
        this.IIIllIllIIlIlIlIlIllllIIl[0] = f;
        this.IIIllIllIIlIlIlIlIllllIIl[1] = f2;
        this.IIIllIllIIlIlIlIlIllllIIl[2] = f3;
        this.IIIllIllIIlIlIlIlIllllIIl[3] = f4;
    }

    public void IlIllllllIIlIIllllIIlIIIl(int n, int n2) {
        if (OpenGlHelper.IIIllIIlIIIIIIlIlIIllIIlI()) {
            GL11.glColorMask((boolean)true, (boolean)true, (boolean)true, (boolean)false);
            GL11.glDisable((int)2929);
            GL11.glDepthMask((boolean)false);
            GL11.glMatrixMode((int)5889);
            GL11.glLoadIdentity();
            GL11.glOrtho((double)0.0, (double)n, (double)n2, (double)0.0, (double)1000.0, (double)3000.0);
            GL11.glMatrixMode((int)5888);
            GL11.glLoadIdentity();
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)-2000.0f);
            GL11.glViewport((int)0, (int)0, (int)n, (int)n2);
            GL11.glEnable((int)3553);
            GL11.glDisable((int)2896);
            GL11.glDisable((int)3008);
            GL11.glDisable((int)3042);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glEnable((int)2903);
            this.IlIllllllIIlIIllllIIlIIIl();
            float f = n;
            float f2 = n2;
            float f3 = (float)this.IlIllllllIIlIIllllIIlIIIl / (float)this.lllIIIllIIIIlllIlIIllIIll;
            float f4 = (float)this.lIlllIlllIIIIlIIlllIllIII / (float)this.lllIlIIlIIIlIlIIIllIlllIl;
            class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
            class_08682.lllIlIIlIIIlIlIIIllIlllIl();
            class_08682.IlIllllllIIlIIllllIIlIIIl(-1);
            class_08682.lllIIIllIIIIlllIlIIllIIll(0.0, f2, 0.0, 0.0, 0.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll(f, f2, 0.0, f3, 0.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll(f, 0.0, 0.0, f3, f4);
            class_08682.lllIIIllIIIIlllIlIIllIIll(0.0, 0.0, 0.0, 0.0, f4);
            class_08682.lllIIIllIIIIlllIlIIllIIll();
            this.lIlllIlllIIIIlIIlllIllIII();
            GL11.glDepthMask((boolean)true);
            GL11.glColorMask((boolean)true, (boolean)true, (boolean)true, (boolean)true);
        }
    }

    public void lIllllIIlIIIlIllllllIIIll() {
        this.lllIIIllIIIIlllIlIIllIIll(true);
        GL11.glClearColor((float)this.IIIllIllIIlIlIlIlIllllIIl[0], (float)this.IIIllIllIIlIlIlIlIllllIIl[1], (float)this.IIIllIllIIlIlIlIlIllllIIl[2], (float)this.IIIllIllIIlIlIlIlIllllIIl[3]);
        int n = 16384;
        if (this.IlIIIIIllllllIIlllIllllll) {
            GL11.glClearDepth((double)1.0);
            n |= 0x100;
        }
        GL11.glClear((int)n);
        this.IlIIIIIllllllIIlllIllllll();
    }
}

