package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.OpenGlHelper;
import org.lwjgl.opengl.GL11;

public class class_2069
implements class_1832 {
    private String lllIIIllIIIIlllIlIIllIIll = "";
    private Minecraft lllIlIIlIIIlIlIIIllIlllIl;
    private String IlIllllllIIlIIllllIIlIIIl = "";
    private long lIlllIlllIIIIlIIlllIllIII = Minecraft.llllllIlIllllIlIlIlIIIIlI();
    private boolean IlIIIIIllllllIIlllIllllll;
    private class_0321 lIllllIIlIIIlIllllllIIIll;
    private class_0778 IIIllIIlIIIIIIlIlIIllIIlI;

    public class_2069(Minecraft class_06672) {
        this.lllIlIIlIIIlIlIIIllIlllIl = class_06672;
        this.lIllllIIlIIIlIllllllIIIll = new class_0321(class_06672, class_06672.displayWidth, class_06672.displayHeight);
        this.IIIllIIlIIIIIIlIlIIllIIlI = new class_0778(class_06672.displayWidth, class_06672.displayHeight, false);
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(9728);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(String string) {
        this.IlIIIIIllllllIIlllIllllll = false;
        this.IlIllllllIIlIIllllIIlIIIl(string);
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(String string) {
        this.IlIIIIIllllllIIlllIllllll = true;
        this.IlIllllllIIlIIllllIIlIIIl(string);
    }

    public void IlIllllllIIlIIllllIIlIIIl(String string) {
        this.IlIllllllIIlIIllllIIlIIIl = string;
        if (!this.lllIlIIlIIIlIlIIIllIlllIl.IlIlIIlllIllllllllIIIlIlI) {
            if (!this.IlIIIIIllllllIIlllIllllll) {
                throw new class_1726();
            }
        } else {
            GL11.glClear((int)256);
            GL11.glMatrixMode((int)5889);
            GL11.glLoadIdentity();
            if (OpenGlHelper.IIIllIIlIIIIIIlIlIIllIIlI()) {
                int n = this.lIllllIIlIIIlIllllllIIIll.IlIIIIIllllllIIlllIllllll();
                GL11.glOrtho((double)0.0, (double)(this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll() * n), (double)(this.lIllllIIlIIIlIllllllIIIll.lllIlIIlIIIlIlIIIllIlllIl() * n), (double)0.0, (double)100.0, (double)300.0);
            } else {
                class_0321 class_03212 = new class_0321(this.lllIlIIlIIIlIlIIIllIlllIl, this.lllIlIIlIIIlIlIIIllIlllIl.displayWidth, this.lllIlIIlIIIlIlIIIllIlllIl.displayHeight);
                GL11.glOrtho((double)0.0, (double)class_03212.IlIllllllIIlIIllllIIlIIIl(), (double)class_03212.lIlllIlllIIIIlIIlllIllIII(), (double)0.0, (double)100.0, (double)300.0);
            }
            GL11.glMatrixMode((int)5888);
            GL11.glLoadIdentity();
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)-200.0f);
        }
    }

    @Override
    public void lIlllIlllIIIIlIIlllIllIII(String string) {
        if (!this.lllIlIIlIIIlIlIIIllIlllIl.IlIlIIlllIllllllllIIIlIlI) {
            if (!this.IlIIIIIllllllIIlllIllllll) {
                throw new class_1726();
            }
        } else {
            this.lIlllIlllIIIIlIIlllIllIII = 0L;
            this.lllIIIllIIIIlllIlIIllIIll = string;
            this.lllIIIllIIIIlllIlIIllIIll(-1);
            this.lIlllIlllIIIIlIIlllIllIII = 0L;
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n) {
        if (!this.lllIlIIlIIIlIlIIIllIlllIl.IlIlIIlllIllllllllIIIlIlI) {
            if (!this.IlIIIIIllllllIIlllIllllll) {
                throw new class_1726();
            }
        } else {
            long l = Minecraft.llllllIlIllllIlIlIlIIIIlI();
            if (l - this.lIlllIlllIIIIlIIlllIllIII >= 100L) {
                this.lIlllIlllIIIIlIIlllIllIII = l;
                class_0321 class_03212 = new class_0321(this.lllIlIIlIIIlIlIIIllIlllIl, this.lllIlIIlIIIlIlIIIllIlllIl.displayWidth, this.lllIlIIlIIIlIlIIIllIlllIl.displayHeight);
                int n2 = class_03212.IlIIIIIllllllIIlllIllllll();
                int n3 = class_03212.lllIIIllIIIIlllIlIIllIIll();
                int n4 = class_03212.lllIlIIlIIIlIlIIIllIlllIl();
                if (OpenGlHelper.IIIllIIlIIIIIIlIlIIllIIlI()) {
                    this.IIIllIIlIIIIIIlIlIIllIIlI.lIllllIIlIIIlIllllllIIIll();
                } else {
                    GL11.glClear((int)256);
                }
                this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(false);
                GL11.glMatrixMode((int)5889);
                GL11.glLoadIdentity();
                GL11.glOrtho((double)0.0, (double)class_03212.IlIllllllIIlIIllllIIlIIIl(), (double)class_03212.lIlllIlllIIIIlIIlllIllIII(), (double)0.0, (double)100.0, (double)300.0);
                GL11.glMatrixMode((int)5888);
                GL11.glLoadIdentity();
                GL11.glTranslatef((float)0.0f, (float)0.0f, (float)-200.0f);
                if (!OpenGlHelper.IIIllIIlIIIIIIlIlIIllIIlI()) {
                    GL11.glClear((int)16640);
                }
                class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
                this.lllIlIIlIIIlIlIIIllIlllIl.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(class_0210.llIIlllIllIllllIIIlIIIIII);
                float f = 32.0f;
                class_08682.lllIlIIlIIIlIlIIIllIlllIl();
                class_08682.IlIllllllIIlIIllllIIlIIIl(0x404040);
                class_08682.lllIIIllIIIIlllIlIIllIIll(0.0, n4, 0.0, 0.0, (float)n4 / f);
                class_08682.lllIIIllIIIIlllIlIIllIIll(n3, n4, 0.0, (float)n3 / f, (float)n4 / f);
                class_08682.lllIIIllIIIIlllIlIIllIIll(n3, 0.0, 0.0, (float)n3 / f, 0.0);
                class_08682.lllIIIllIIIIlllIlIIllIIll(0.0, 0.0, 0.0, 0.0, 0.0);
                class_08682.lllIIIllIIIIlllIlIIllIIll();
                if (n >= 0) {
                    int n5 = 100;
                    int n6 = 2;
                    int n7 = n3 / 2 - n5 / 2;
                    int n8 = n4 / 2 + 16;
                    GL11.glDisable((int)3553);
                    class_08682.lllIlIIlIIIlIlIIIllIlllIl();
                    class_08682.IlIllllllIIlIIllllIIlIIIl(0x808080);
                    class_08682.lllIIIllIIIIlllIlIIllIIll((double)n7, (double)n8, 0.0);
                    class_08682.lllIIIllIIIIlllIlIIllIIll((double)n7, (double)(n8 + n6), 0.0);
                    class_08682.lllIIIllIIIIlllIlIIllIIll((double)(n7 + n5), (double)(n8 + n6), 0.0);
                    class_08682.lllIIIllIIIIlllIlIIllIIll((double)(n7 + n5), (double)n8, 0.0);
                    class_08682.IlIllllllIIlIIllllIIlIIIl(0x80FF80);
                    class_08682.lllIIIllIIIIlllIlIIllIIll((double)n7, (double)n8, 0.0);
                    class_08682.lllIIIllIIIIlllIlIIllIIll((double)n7, (double)(n8 + n6), 0.0);
                    class_08682.lllIIIllIIIIlllIlIIllIIll((double)(n7 + n), (double)(n8 + n6), 0.0);
                    class_08682.lllIIIllIIIIlllIlIIllIIll((double)(n7 + n), (double)n8, 0.0);
                    class_08682.lllIIIllIIIIlllIlIIllIIll();
                    GL11.glEnable((int)3553);
                }
                GL11.glEnable((int)3042);
                OpenGlHelper.glBlendFunc(770, 771, 1, 0);
                this.lllIlIIlIIIlIlIIIllIlllIl.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl, (float)((n3 - this.lllIlIIlIIIlIlIIIllIlllIl.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl)) / 2), (float)(n4 / 2 - 4 - 16), 0xFFFFFF);
                this.lllIlIIlIIIlIlIIIllIlllIl.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, (float)((n3 - this.lllIlIIlIIIlIlIIIllIlllIl.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll)) / 2), (float)(n4 / 2 - 4 + 8), 0xFFFFFF);
                this.IIIllIIlIIIIIIlIlIIllIIlI.IlIIIIIllllllIIlllIllllll();
                if (OpenGlHelper.IIIllIIlIIIIIIlIlIIllIIlI()) {
                    this.IIIllIIlIIIIIIlIlIIllIIlI.IlIllllllIIlIIllllIIlIIIl(n3 * n2, n4 * n2);
                }
                this.lllIlIIlIIIlIlIIIllIlllIl.IIIllIllIIlIlIlIlIllllIIl();
                try {
                    Thread.yield();
                }
                catch (Exception exception) {
                    // empty catch block
                }
            }
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll() {
    }
}

