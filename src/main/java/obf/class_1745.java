package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.util.ResourceLocation;
import com.moonsworth.lunar.client.LunarClient;
import net.minecraft.client.settings.Options;
import org.lwjgl.opengl.GL11;

public class class_1745
extends class_1603 {
    class_1835 lllIIIllIIIIlllIlIIllIIll = null;

    public class_1745(class_1835 class_18352) {
        this.lllIIIllIIIIlllIlIIllIIll = class_18352;
    }

    @Override
    public ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212) {
        return new ResourceLocation("", "");
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_2163 class_21632, double d, double d2, double d3, float f, float f2) {
        if (!LunarClient.getInstance().getModuleManager().lIlllIlllIIIIlIIlllIllIII.lIllllIIlIIIlIllllllIIIll()) {
            return;
        }
        for (class_0368 class_03682 : class_21632.lllIIIllIIIIlllIlIIllIIll) {
            if (!class_03682.lllIlIIlIIIlIlIIIllIlllIl()) continue;
            int n = class_03682.IlIllllllIIlIIllllIIlIIIl();
            int n2 = class_03682.lIlllIlllIIIIlIIlllIllIII();
            int n3 = class_03682.IlIIIIIllllllIIlllIllllll();
            double d4 = Math.sqrt(class_03682.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl.IllIIlllllllIIlIIlIIIIlIl));
            if (this.lllIIIllIIIIlllIlIIllIIll.IlIlIIlllIIlIllIIIlllllIl && class_21632.lIlIllIIlIIlIIlIIlIIlIIll.lIlllIlllIIIIlIIlllIllIII((int)n, (int)n2).lIlllIlllIIIIlIIlllIllIII) {
                double d5 = 0.0 - class_2114.IlIllllllIIlIIllllIIlIIIl;
                this.lllIIIllIIIIlllIlIIllIIll(class_03682, (double)n - class_2114.lllIlIIlIIIlIlIIIllIlllIl, d5, (double)n2 - class_2114.lIlllIlllIIIIlIIlllIllIII, 64.0f, d4);
            }
            if (!this.lllIIIllIIIIlllIlIIllIIll.lIIlIIIIIlIlllIlIIlIlIlll || this.lllIIIllIIIIlllIlIIllIIll.llIIlIIllIIllIlIIllIIllII.gameSettings.lIllIIlllIIIlIlIIIlllIlIl) continue;
            String string = class_03682.lllIIIllIIIIlllIlIIllIIll;
            this.lllIIIllIIIIlllIlIIllIIll(class_03682, string, d + (double)n, d2 + (double)n3 + 1.0, d3 + (double)n2, 64, d4);
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0368 class_03682, double d, double d2, double d3, float f, double d4) {
        float f2;
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        GL11.glDisable((int)3553);
        GL11.glDisable((int)2896);
        GL11.glDisable((int)2912);
        GL11.glDepthMask((boolean)false);
        GL11.glEnable((int)3042);
        GL11.glAlphaFunc((int)516, (float)0.1f);
        GL11.glBlendFunc((int)770, (int)1);
        int n = 256;
        float f3 = 0.02f;
        double d5 = 1.05;
        double d6 = 1.05;
        float f4 = class_03682.IlIlIIlIlIllIIlIlIIllIIIl;
        float f5 = class_03682.IlIlIIlllIIlIllIIIlllllIl;
        float f6 = class_03682.lllllIlllIIllIlIIlIIIllII;
        float f7 = f2 = d4 < 30.0 ? (float)d4 / 30.0f : 1.0f;
        if (f2 < 0.2f) {
            f2 = 0.2f;
        }
        for (int i = 0; i < 4; ++i) {
            class_08682.lllIIIllIIIIlllIlIIllIIll(5);
            class_08682.lllIIIllIIIIlllIlIIllIIll(f4 * f3, f6 * f3, f5 * f3, 0.8f * f2);
            double d7 = 0.1 + (double)i * 0.2;
            d7 *= d5;
            double d8 = 0.1 + (double)i * 0.2;
            d8 *= d6;
            for (int j = 0; j < 5; ++j) {
                double d9 = d + 0.5 - d7;
                double d10 = d3 + 0.5 - d7;
                if (j == 1 || j == 2) {
                    d9 += d7 * 2.0;
                }
                if (j == 2 || j == 3) {
                    d10 += d7 * 2.0;
                }
                double d11 = d + 0.5 - d8;
                double d12 = d3 + 0.5 - d8;
                if (j == 1 || j == 2) {
                    d11 += d8 * 2.0;
                }
                if (j == 2 || j == 3) {
                    d12 += d8 * 2.0;
                }
                class_08682.lllIIIllIIIIlllIlIIllIIll(d11, d2 + 0.0, d12);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d9, d2 + (double)n, d10);
            }
            class_08682.lllIIIllIIIIlllIlIIllIIll();
        }
        GL11.glDisable((int)3042);
        GL11.glEnable((int)2912);
        GL11.glEnable((int)2896);
        GL11.glEnable((int)3553);
        GL11.glDepthMask((boolean)true);
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_0368 class_03682, String string, double d, double d2, double d3, int n, double d4) {
        GL11.glAlphaFunc((int)516, (float)0.1f);
        if (d4 <= (double)this.lllIIIllIIIIlllIlIIllIIll.IlIIIlIIIIllIIIllIIIIIIll || this.lllIIIllIIIIlllIlIIllIIll.IlIIIlIIIIllIIIllIIIIIIll < 0) {
            float f;
            string = string + " (" + (int)d4 + "m)";
            double d5 = (double)(this.lllIIIllIIIIlllIlIIllIIll.llIIlIIllIIllIlIIllIIllII.gameSettings.lllIIIllIIIIlllIlIIllIIll(Options.RENDER_DISTANCE) * 16.0f) * 0.75;
            double d6 = d4;
            if (d4 > d5) {
                d = d / d4 * d5;
                d2 = d2 / d4 * d5;
                d3 = d3 / d4 * d5;
                d6 = d5;
            }
            class_1854 class_18542 = this.lllIlIIlIIIlIlIIIllIlllIl();
            float f2 = ((float)d6 * 0.1f + 1.0f) * 0.0266f;
            GL11.glPushMatrix();
            GL11.glTranslatef((float)((float)d + 0.5f), (float)((float)d2 + 1.3f), (float)((float)d3 + 0.5f));
            GL11.glNormal3f((float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)(-this.lllIlIIlIIIlIlIIIllIlllIl.IllIIIllIIIIlIlIlIllIIlll), (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)this.lllIlIIlIIIlIlIIIllIlllIl.lIIIIlIlIIlllllIIllIIlIII, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)(-f2), (float)(-f2), (float)f2);
            GL11.glDisable((int)2896);
            GL11.glDisable((int)2912);
            GL11.glDepthMask((boolean)false);
            GL11.glDisable((int)2929);
            GL11.glEnable((int)3042);
            GL11.glBlendFunc((int)770, (int)771);
            class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
            int n2 = 0;
            GL11.glDisable((int)3553);
            int n3 = class_18542.lllIIIllIIIIlllIlIIllIIll(string) / 2;
            GL11.glEnable((int)2929);
            if (d4 < d5) {
                GL11.glDepthMask((boolean)true);
            }
            float f3 = f = d4 < 30.0 ? (float)d4 / 30.0f : 1.0f;
            if (f < 0.2f) {
                f = 0.2f;
            }
            GL11.glEnable((int)32823);
            GL11.glPolygonOffset((float)1.0f, (float)3.0f);
            class_08682.lllIlIIlIIIlIlIIIllIlllIl();
            class_08682.lllIIIllIIIIlllIlIIllIIll(class_03682.IlIlIIlIlIllIIlIlIIllIIIl, class_03682.lllllIlllIIllIlIIlIIIllII, class_03682.IlIlIIlllIIlIllIIIlllllIl, 0.6f * f);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)(-n3 - 2), (double)(-2 + n2), 0.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)(-n3 - 2), (double)(9 + n2), 0.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)(n3 + 2), (double)(9 + n2), 0.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)(n3 + 2), (double)(-2 + n2), 0.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll();
            GL11.glPolygonOffset((float)1.0f, (float)1.0f);
            class_08682.lllIlIIlIIIlIlIIIllIlllIl();
            class_08682.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, 0.15f);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)(-n3 - 1), (double)(-1 + n2), 0.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)(-n3 - 1), (double)(8 + n2), 0.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)(n3 + 1), (double)(8 + n2), 0.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)(n3 + 1), (double)(-1 + n2), 0.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll();
            GL11.glDisable((int)2929);
            GL11.glDepthMask((boolean)false);
            GL11.glPolygonOffset((float)1.0f, (float)7.0f);
            class_08682.lllIlIIlIIIlIlIIIllIlllIl();
            class_08682.lllIIIllIIIIlllIlIIllIIll(class_03682.IlIlIIlIlIllIIlIlIIllIIIl, class_03682.lllllIlllIIllIlIIlIIIllII, class_03682.IlIlIIlllIIlIllIIIlllllIl, 0.15f * f);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)(-n3 - 2), (double)(-2 + n2), 0.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)(-n3 - 2), (double)(9 + n2), 0.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)(n3 + 2), (double)(9 + n2), 0.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)(n3 + 2), (double)(-2 + n2), 0.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll();
            GL11.glPolygonOffset((float)1.0f, (float)5.0f);
            class_08682.lllIlIIlIIIlIlIIIllIlllIl();
            class_08682.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, 0.15f * f);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)(-n3 - 1), (double)(-1 + n2), 0.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)(-n3 - 1), (double)(8 + n2), 0.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)(n3 + 1), (double)(8 + n2), 0.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)(n3 + 1), (double)(-1 + n2), 0.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll();
            GL11.glDisable((int)32823);
            GL11.glEnable((int)3553);
            int n4 = 0xCCCCCC;
            int n5 = 0xFFFFFF;
            class_18542.lllIlIIlIIIlIlIIIllIlllIl(string, -class_18542.lllIIIllIIIIlllIlIIllIIll(string) / 2, n2, n4 | (int)(255.0f * f) << 24);
            GL11.glEnable((int)2929);
            class_18542.lllIlIIlIIIlIlIIIllIlllIl(string, -class_18542.lllIIIllIIIIlllIlIIllIIll(string) / 2, n2, n5 | (int)(255.0f * f) << 24);
            GL11.glEnable((int)2929);
            GL11.glDepthMask((boolean)true);
            GL11.glEnable((int)2912);
            GL11.glEnable((int)2896);
            GL11.glDisable((int)3042);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glPopMatrix();
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, double d, double d2, double d3, float f, float f2) {
        this.lllIIIllIIIIlllIlIIllIIll((class_2163)class_15212, d, d2, d3, f, f2);
    }
}

