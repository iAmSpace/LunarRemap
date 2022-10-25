package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.util.Random;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.MathHelper;
import net.minecraft.client.renderer.OpenGlHelper;
import org.lwjgl.opengl.GL11;

public class class_1906
extends class_0164 {
    private static final ResourceLocation lIllllIIlIIIlIllllllIIIll = new ResourceLocation("textures/entity/enderdragon/dragon_exploding.png");
    private static final ResourceLocation IIIllIIlIIIIIIlIlIIllIIlI = new ResourceLocation("textures/entity/endercrystal/endercrystal_beam.png");
    private static final ResourceLocation IllIIlllllllIIlIIlIIIIlIl = new ResourceLocation("textures/entity/enderdragon/dragon_eyes.png");
    private static final ResourceLocation IIIllIllIIlIlIlIlIllllIIl = new ResourceLocation("textures/entity/enderdragon/dragon.png");
    protected class_2217 lllIIIllIIIIlllIlIIllIIll;

    public class_1906() {
        super(new class_2217(0.0f), 0.5f);
        this.lllIIIllIIIIlllIlIIllIIll = (class_2217)this.llIIllIllIlIIlIIllIllllll;
        this.lllIIIllIIIIlllIlIIllIIll(this.llIIllIllIlIIlIIllIllllll);
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_1221 class_12212, float f, float f2, float f3) {
        float f4 = (float)class_12212.lllIlIIlIIIlIlIIIllIlllIl(7, f3)[0];
        float f5 = (float)(class_12212.lllIlIIlIIIlIlIIIllIlllIl(5, f3)[1] - class_12212.lllIlIIlIIIlIlIIIllIlllIl(10, f3)[1]);
        GL11.glRotatef((float)(-f4), (float)0.0f, (float)1.0f, (float)0.0f);
        GL11.glRotatef((float)(f5 * 10.0f), (float)1.0f, (float)0.0f, (float)0.0f);
        GL11.glTranslatef((float)0.0f, (float)0.0f, (float)1.0f);
        if (class_12212.lIlIIIllIIllIIlIllllllIll > 0) {
            float f6 = ((float)class_12212.lIlIIIllIIllIIlIllllllIll + f3 - 1.0f) / 20.0f * 1.6f;
            if ((f6 = MathHelper.IlIllllllIIlIIllllIIlIIIl(f6)) > 1.0f) {
                f6 = 1.0f;
            }
            GL11.glRotatef((float)(f6 * this.lllIlIIlIIIlIlIIIllIlllIl((class_1965)class_12212)), (float)0.0f, (float)0.0f, (float)1.0f);
        }
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_1221 class_12212, float f, float f2, float f3, float f4, float f5, float f6) {
        if (class_12212.IIlIlIIIIlIlllIlIlIIIIIlI > 0) {
            float f7 = (float)class_12212.IIlIlIIIIlIlllIlIlIIIIIlI / 200.0f;
            GL11.glDepthFunc((int)515);
            GL11.glEnable((int)3008);
            GL11.glAlphaFunc((int)516, (float)f7);
            this.lllIIIllIIIIlllIlIIllIIll(lIllllIIlIIIlIllllllIIIll);
            this.llIIllIllIlIIlIIllIllllll.lllIIIllIIIIlllIlIIllIIll(class_12212, f, f2, f3, f4, f5, f6);
            GL11.glAlphaFunc((int)516, (float)0.1f);
            GL11.glDepthFunc((int)514);
        }
        this.lllIlIIlIIIlIlIIIllIlllIl((class_1521)class_12212);
        this.llIIllIllIlIIlIIllIllllll.lllIIIllIIIIlllIlIIllIIll(class_12212, f, f2, f3, f4, f5, f6);
        if (class_12212.lIIllIlIIlIIlllllIlIIllIl > 0) {
            GL11.glDepthFunc((int)514);
            GL11.glDisable((int)3553);
            GL11.glEnable((int)3042);
            GL11.glBlendFunc((int)770, (int)771);
            GL11.glColor4f((float)1.0f, (float)0.0f, (float)0.0f, (float)0.5f);
            this.llIIllIllIlIIlIIllIllllll.lllIIIllIIIIlllIlIIllIIll(class_12212, f, f2, f3, f4, f5, f6);
            GL11.glEnable((int)3553);
            GL11.glDisable((int)3042);
            GL11.glDepthFunc((int)515);
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1221 class_12212, double d, double d2, double d3, float f, float f2) {
        class_0178.lllIIIllIIIIlllIlIIllIIll(class_12212, false);
        super.lllIIIllIIIIlllIlIIllIIll(class_12212, d, d2, d3, f, f2);
        if (class_12212.IlIlIIllIlIlIIIIIlIlllllI != null) {
            float f3 = (float)class_12212.IlIlIIllIlIlIIIIIlIlllllI.lllIIIllIIIIlllIlIIllIIll + f2;
            float f4 = MathHelper.lllIIIllIIIIlllIlIIllIIll(f3 * 0.2f) / 2.0f + 0.5f;
            f4 = (f4 * f4 + f4) * 0.2f;
            float f5 = (float)(class_12212.IlIlIIllIlIlIIIIIlIlllllI.IlIIlllllIIlIlIlllllIllll - class_12212.IlIIlllllIIlIlIlllllIllll - (class_12212.llIIlIllIllllIlIIIIlIIlll - class_12212.IlIIlllllIIlIlIlllllIllll) * (double)(1.0f - f2));
            float f6 = (float)((double)f4 + class_12212.IlIlIIllIlIlIIIIIlIlllllI.llIIlIlIlllIIllIlIlllIllI - 1.0 - class_12212.llIIlIlIlllIIllIlIlllIllI - (class_12212.llIllllIlIllIIIlIllIIlIlI - class_12212.llIIlIlIlllIIllIlIlllIllI) * (double)(1.0f - f2));
            float f7 = (float)(class_12212.IlIlIIllIlIlIIIIIlIlllllI.IllIIIIllIIllIllIlllIlIIl - class_12212.IllIIIIllIIllIllIlllIlIIl - (class_12212.lIlllIlllIlIIIIlllIlIlIIl - class_12212.IllIIIIllIIllIllIlllIlIIl) * (double)(1.0f - f2));
            float f8 = MathHelper.IlIllllllIIlIIllllIIlIIIl(f5 * f5 + f7 * f7);
            float f9 = MathHelper.IlIllllllIIlIIllllIIlIIIl(f5 * f5 + f6 * f6 + f7 * f7);
            GL11.glPushMatrix();
            GL11.glTranslatef((float)((float)d), (float)((float)d2 + 2.0f), (float)((float)d3));
            GL11.glRotatef((float)((float)(-Math.atan2(f7, f5)) * 180.0f / (float)Math.PI - 90.0f), (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)((float)(-Math.atan2(f8, f6)) * 180.0f / (float)Math.PI - 90.0f), (float)1.0f, (float)0.0f, (float)0.0f);
            class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
            class_0624.lllIIIllIIIIlllIlIIllIIll();
            GL11.glDisable((int)2884);
            this.lllIIIllIIIIlllIlIIllIIll(IIIllIIlIIIIIIlIlIIllIIlI);
            GL11.glShadeModel((int)7425);
            float f10 = 0.0f - ((float)class_12212.IlllIIIllllIIllIllIlIIlIl + f2) * 0.01f;
            float f11 = MathHelper.IlIllllllIIlIIllllIIlIIIl(f5 * f5 + f6 * f6 + f7 * f7) / 32.0f - ((float)class_12212.IlllIIIllllIIllIllIlIIlIl + f2) * 0.01f;
            class_08682.lllIIIllIIIIlllIlIIllIIll(5);
            int n = 8;
            for (int i = 0; i <= n; ++i) {
                float f12 = MathHelper.lllIIIllIIIIlllIlIIllIIll((float)(i % n) * (float)Math.PI * 2.0f / (float)n) * 0.75f;
                float f13 = MathHelper.lllIlIIlIIIlIlIIIllIlllIl((float)(i % n) * (float)Math.PI * 2.0f / (float)n) * 0.75f;
                float f14 = (float)(i % n) * 1.0f / (float)n;
                class_08682.IlIllllllIIlIIllllIIlIIIl(0);
                class_08682.lllIIIllIIIIlllIlIIllIIll(f12 * 0.2f, f13 * 0.2f, 0.0, f14, f11);
                class_08682.IlIllllllIIlIIllllIIlIIIl(0xFFFFFF);
                class_08682.lllIIIllIIIIlllIlIIllIIll(f12, f13, f9, f14, f10);
            }
            class_08682.lllIIIllIIIIlllIlIIllIIll();
            GL11.glEnable((int)2884);
            GL11.glShadeModel((int)7424);
            class_0624.lllIlIIlIIIlIlIIIllIlllIl();
            GL11.glPopMatrix();
        }
    }

    protected ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_1221 class_12212) {
        return IIIllIllIIlIlIlIlIllllIIl;
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_1221 class_12212, float f) {
        super.lllIlIIlIIIlIlIIIllIlllIl(class_12212, f);
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        if (class_12212.IIlIlIIIIlIlllIlIlIIIIIlI > 0) {
            class_0624.lllIIIllIIIIlllIlIIllIIll();
            float f2 = ((float)class_12212.IIlIlIIIIlIlllIlIlIIIIIlI + f) / 200.0f;
            float f3 = 0.0f;
            if (f2 > 0.8f) {
                f3 = (f2 - 0.8f) / 0.2f;
            }
            Random random = new Random(432L);
            GL11.glDisable((int)3553);
            GL11.glShadeModel((int)7425);
            GL11.glEnable((int)3042);
            GL11.glBlendFunc((int)770, (int)1);
            GL11.glDisable((int)3008);
            GL11.glEnable((int)2884);
            GL11.glDepthMask((boolean)false);
            GL11.glPushMatrix();
            GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)-2.0f);
            int n = 0;
            while ((float)n < (f2 + f2 * f2) / 2.0f * 60.0f) {
                GL11.glRotatef((float)(random.nextFloat() * 360.0f), (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)(random.nextFloat() * 360.0f), (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)(random.nextFloat() * 360.0f), (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glRotatef((float)(random.nextFloat() * 360.0f), (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)(random.nextFloat() * 360.0f), (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)(random.nextFloat() * 360.0f + f2 * 90.0f), (float)0.0f, (float)0.0f, (float)1.0f);
                class_08682.lllIIIllIIIIlllIlIIllIIll(6);
                float f4 = random.nextFloat() * 20.0f + 5.0f + f3 * 10.0f;
                float f5 = random.nextFloat() * 2.0f + 1.0f + f3 * 2.0f;
                class_08682.lllIIIllIIIIlllIlIIllIIll(0xFFFFFF, (int)(255.0f * (1.0f - f3)));
                class_08682.lllIIIllIIIIlllIlIIllIIll(0.0, 0.0, 0.0);
                class_08682.lllIIIllIIIIlllIlIIllIIll(0xFF00FF, 0);
                class_08682.lllIIIllIIIIlllIlIIllIIll(-0.866 * (double)f5, (double)f4, (double)(-0.5f * f5));
                class_08682.lllIIIllIIIIlllIlIIllIIll(0.866 * (double)f5, (double)f4, (double)(-0.5f * f5));
                class_08682.lllIIIllIIIIlllIlIIllIIll(0.0, (double)f4, (double)(1.0f * f5));
                class_08682.lllIIIllIIIIlllIlIIllIIll(-0.866 * (double)f5, (double)f4, (double)(-0.5f * f5));
                class_08682.lllIIIllIIIIlllIlIIllIIll();
                ++n;
            }
            GL11.glPopMatrix();
            GL11.glDepthMask((boolean)true);
            GL11.glDisable((int)2884);
            GL11.glDisable((int)3042);
            GL11.glShadeModel((int)7424);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glEnable((int)3553);
            GL11.glEnable((int)3008);
            class_0624.lllIlIIlIIIlIlIIIllIlllIl();
        }
    }

    protected int lllIIIllIIIIlllIlIIllIIll(class_1221 class_12212, int n, float f) {
        if (n == 1) {
            GL11.glDepthFunc((int)515);
        }
        if (n != 0) {
            return -1;
        }
        this.lllIIIllIIIIlllIlIIllIIll(IllIIlllllllIIlIIlIIIIlIl);
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3008);
        GL11.glBlendFunc((int)1, (int)1);
        GL11.glDisable((int)2896);
        GL11.glDepthFunc((int)514);
        int n2 = 61680;
        int n3 = n2 % 65536;
        int n4 = n2 / 65536;
        OpenGlHelper.lllIIIllIIIIlllIlIIllIIll(OpenGlHelper.IlIllllllIIlIIllllIIlIIIl, (float)n3 / 1.0f, (float)n4 / 1.0f);
        GL11.glEnable((int)2896);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        return 1;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0339 class_03392, double d, double d2, double d3, float f, float f2) {
        this.lllIIIllIIIIlllIlIIllIIll((class_1221)class_03392, d, d2, d3, f, f2);
    }

    @Override
    public int lllIlIIlIIIlIlIIIllIlllIl(class_1965 class_19652, int n, float f) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_1221)class_19652, n, f);
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl(class_1965 class_19652, float f) {
        this.lllIIIllIIIIlllIlIIllIIll((class_1221)class_19652, f);
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652, float f, float f2, float f3) {
        this.lllIIIllIIIIlllIlIIllIIll((class_1221)class_19652, f, f2, f3);
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652, float f, float f2, float f3, float f4, float f5, float f6) {
        this.lllIIIllIIIIlllIlIIllIIll((class_1221)class_19652, f, f2, f3, f4, f5, f6);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652, double d, double d2, double d3, float f, float f2) {
        this.lllIIIllIIIIlllIlIIllIIll((class_1221)class_19652, d, d2, d3, f, f2);
    }

    @Override
    public ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_1221)class_15212);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, double d, double d2, double d3, float f, float f2) {
        this.lllIIIllIIIIlllIlIIllIIll((class_1221)class_15212, d, d2, d3, f, f2);
    }
}

