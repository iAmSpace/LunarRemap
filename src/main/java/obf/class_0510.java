package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.client.Minecraft;
import net.minecraft.stats.Achievement;
import org.lwjgl.opengl.GL11;

public class class_0510
extends class_0210 {
    private static final ResourceLocation lllIIIllIIIIlllIlIIllIIll = new ResourceLocation("textures/gui/achievement/achievement_background.png");
    private Minecraft lllIlIIlIIIlIlIIIllIlllIl;
    private int IlIllllllIIlIIllllIIlIIIl;
    private int lIlllIlllIIIIlIIlllIllIII;
    private String IlIIIIIllllllIIlllIllllll;
    private String lIllllIIlIIIlIllllllIIIll;
    private Achievement IIIllIIlIIIIIIlIlIIllIIlI;
    private long IllIIlllllllIIlIIlIIIIlIl;
    private class_1785 IIIllIllIIlIlIlIlIllllIIl;
    private boolean IllIIIllIIIIlIlIlIllIIlll;

    public class_0510(Minecraft class_06672) {
        this.lllIlIIlIIIlIlIIIllIlllIl = class_06672;
        this.IIIllIllIIlIlIlIlIllllIIl = new class_1785();
    }

    public void lllIIIllIIIIlllIlIIllIIll(Achievement class_07472) {
        this.IlIIIIIllllllIIlllIllllll = class_0616.lllIIIllIIIIlllIlIIllIIll("achievement.get", new Object[0]);
        this.lIllllIIlIIIlIllllllIIIll = class_07472.IlIIIIIllllllIIlllIllllll().IlIllllllIIlIIllllIIlIIIl();
        this.IllIIlllllllIIlIIlIIIIlIl = Minecraft.llllllIlIllllIlIlIlIIIIlI();
        this.IIIllIIlIIIIIIlIlIIllIIlI = class_07472;
        this.IllIIIllIIIIlIlIlIllIIlll = false;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(Achievement class_07472) {
        this.IlIIIIIllllllIIlllIllllll = class_07472.IlIIIIIllllllIIlllIllllll().IlIllllllIIlIIllllIIlIIIl();
        this.lIllllIIlIIIlIllllllIIIll = class_07472.lIllllIIlIIIlIllllllIIIll();
        this.IllIIlllllllIIlIIlIIIIlIl = Minecraft.llllllIlIllllIlIlIlIIIIlI() + 2500L;
        this.IIIllIIlIIIIIIlIlIIllIIlI = class_07472;
        this.IllIIIllIIIIlIlIlIllIIlll = true;
    }

    private void IlIllllllIIlIIllllIIlIIIl() {
        GL11.glViewport((int)0, (int)0, (int)this.lllIlIIlIIIlIlIIIllIlllIl.displayWidth, (int)this.lllIlIIlIIIlIlIIIllIlllIl.displayHeight);
        GL11.glMatrixMode((int)5889);
        GL11.glLoadIdentity();
        GL11.glMatrixMode((int)5888);
        GL11.glLoadIdentity();
        this.IlIllllllIIlIIllllIIlIIIl = this.lllIlIIlIIIlIlIIIllIlllIl.displayWidth;
        this.lIlllIlllIIIIlIIlllIllIII = this.lllIlIIlIIIlIlIIIllIlllIl.displayHeight;
        class_0321 class_03212 = new class_0321(this.lllIlIIlIIIlIlIIIllIlllIl, this.lllIlIIlIIIlIlIIIllIlllIl.displayWidth, this.lllIlIIlIIIlIlIIIllIlllIl.displayHeight);
        this.IlIllllllIIlIIllllIIlIIIl = class_03212.lllIIIllIIIIlllIlIIllIIll();
        this.lIlllIlllIIIIlIIlllIllIII = class_03212.lllIlIIlIIIlIlIIIllIlllIl();
        GL11.glClear((int)256);
        GL11.glMatrixMode((int)5889);
        GL11.glLoadIdentity();
        GL11.glOrtho((double)0.0, (double)this.IlIllllllIIlIIllllIIlIIIl, (double)this.lIlllIlllIIIIlIIlllIllIII, (double)0.0, (double)1000.0, (double)3000.0);
        GL11.glMatrixMode((int)5888);
        GL11.glLoadIdentity();
        GL11.glTranslatef((float)0.0f, (float)0.0f, (float)-2000.0f);
    }

    public void lllIIIllIIIIlllIlIIllIIll() {
        if (this.IIIllIIlIIIIIIlIlIIllIIlI != null && this.IllIIlllllllIIlIIlIIIIlIl != 0L && Minecraft.getMinecraft().lIIIIlIlIIlllllIIllIIlIII != null) {
            double d = (double)(Minecraft.llllllIlIllllIlIlIlIIIIlI() - this.IllIIlllllllIIlIIlIIIIlIl) / 3000.0;
            if (!this.IllIIIllIIIIlIlIlIllIIlll) {
                if (d < 0.0 || d > 1.0) {
                    this.IllIIlllllllIIlIIlIIIIlIl = 0L;
                    return;
                }
            } else if (d > 0.5) {
                d = 0.5;
            }
            this.IlIllllllIIlIIllllIIlIIIl();
            GL11.glDisable((int)2929);
            GL11.glDepthMask((boolean)false);
            double d2 = d * 2.0;
            if (d2 > 1.0) {
                d2 = 2.0 - d2;
            }
            d2 *= 4.0;
            if ((d2 = 1.0 - d2) < 0.0) {
                d2 = 0.0;
            }
            d2 *= d2;
            d2 *= d2;
            int n = this.IlIllllllIIlIIllllIIlIIIl - 160;
            int n2 = 0 - (int)(d2 * 36.0);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glEnable((int)3553);
            this.lllIlIIlIIIlIlIIIllIlllIl.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(lllIIIllIIIIlllIlIIllIIll);
            GL11.glDisable((int)2896);
            class_0510.lllIIIllIIIIlllIlIIllIIll(n, n2, 96, 202, 160, 32);
            if (this.IllIIIllIIIIlIlIlIllIIlll) {
                this.lllIlIIlIIIlIlIIIllIlllIl.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll, n + 30, n2 + 7, 120, -1);
            } else {
                this.lllIlIIlIIIlIlIIIllIlllIl.IlIlllIIIIIIlIIllIIllIlll.lllIlIIlIIIlIlIIIllIlllIl(this.IlIIIIIllllllIIlllIllllll, n + 30, n2 + 7, -256);
                this.lllIlIIlIIIlIlIIIllIlllIl.IlIlllIIIIIIlIIllIIllIlll.lllIlIIlIIIlIlIIIllIlllIl(this.lIllllIIlIIIlIllllllIIIll, n + 30, n2 + 18, -1);
            }
            class_0624.IlIllllllIIlIIllllIIlIIIl();
            GL11.glDisable((int)2896);
            GL11.glEnable((int)32826);
            GL11.glEnable((int)2903);
            GL11.glEnable((int)2896);
            this.IIIllIllIIlIlIlIlIllllIIl.lllIlIIlIIIlIlIIIllIlllIl(this.lllIlIIlIIIlIlIIIllIlllIl.IlIlllIIIIIIlIIllIIllIlll, this.lllIlIIlIIIlIlIIIllIlllIl.llIIlIIllIIllIlIIllIIllII(), this.IIIllIIlIIIIIIlIlIIllIIlI.theItemStack, n + 8, n2 + 8);
            GL11.glDisable((int)2896);
            GL11.glDepthMask((boolean)true);
            GL11.glEnable((int)2929);
        }
    }

    public void lllIlIIlIIIlIlIIIllIlllIl() {
        this.IIIllIIlIIIIIIlIlIIllIIlI = null;
        this.IllIIlllllllIIlIIlIIIIlIl = 0L;
    }
}

