package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.client.Minecraft;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class class_2184
extends class_1603 {
    private static final ResourceLocation lllIIIllIIIIlllIlIIllIIll = new ResourceLocation("textures/particle/particles.png");

    public void lllIIIllIIIIlllIlIIllIIll(class_2050 class_20502, double d, double d2, double d3, float f, float f2) {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)((float)d), (float)((float)d2), (float)((float)d3));
        GL11.glEnable((int)32826);
        GL11.glScalef((float)0.5f, (float)0.5f, (float)0.5f);
        this.lllIlIIlIIIlIlIIIllIlllIl(class_20502);
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        int n = 1;
        int n2 = 2;
        float f3 = (float)(n * 8 + 0) / 128.0f;
        float f4 = (float)(n * 8 + 8) / 128.0f;
        float f5 = (float)(n2 * 8 + 0) / 128.0f;
        float f6 = (float)(n2 * 8 + 8) / 128.0f;
        float f7 = 1.0f;
        float f8 = 0.5f;
        float f9 = 0.5f;
        GL11.glRotatef((float)(180.0f - this.lllIlIIlIIIlIlIIIllIlllIl.IllIIIllIIIIlIlIlIllIIlll), (float)0.0f, (float)1.0f, (float)0.0f);
        GL11.glRotatef((float)(-this.lllIlIIlIIIlIlIIIllIlllIl.lIIIIlIlIIlllllIIllIIlIII), (float)1.0f, (float)0.0f, (float)0.0f);
        class_08682.lllIlIIlIIIlIlIIIllIlllIl();
        class_08682.IlIllllllIIlIIllllIIlIIIl(0.0f, 1.0f, 0.0f);
        class_08682.lllIIIllIIIIlllIlIIllIIll(0.0f - f8, 0.0f - f9, 0.0, f3, f6);
        class_08682.lllIIIllIIIIlllIlIIllIIll(f7 - f8, 0.0f - f9, 0.0, f4, f6);
        class_08682.lllIIIllIIIIlllIlIIllIIll(f7 - f8, 1.0f - f9, 0.0, f4, f5);
        class_08682.lllIIIllIIIIlllIlIIllIIll(0.0f - f8, 1.0f - f9, 0.0, f3, f5);
        class_08682.lllIIIllIIIIlllIlIIllIIll();
        GL11.glDisable((int)32826);
        GL11.glPopMatrix();
        if (class_20502.lllIlIIlIIIlIlIIIllIlllIl != null) {
            double d4;
            float f10 = class_20502.lllIlIIlIIIlIlIIIllIlllIl.llIIllIllIlIIlIIllIllllll(f2);
            float f11 = MathHelper.lllIIIllIIIIlllIlIIllIIll(MathHelper.IlIllllllIIlIIllllIIlIIIl(f10) * (float)Math.PI);
            class_0864 class_08642 = class_0864.lllIIIllIIIIlllIlIIllIIll(-0.5, 0.03, 0.8);
            class_08642.lllIIIllIIIIlllIlIIllIIll(-(class_20502.lllIlIIlIIIlIlIIIllIlllIl.llIIIIllIIIIIIIlIIIlIIIIl + (class_20502.lllIlIIlIIIlIlIIIllIlllIl.IlIlIIlllIllllllllIIIlIlI - class_20502.lllIlIIlIIIlIlIIIllIlllIl.llIIIIllIIIIIIIlIIIlIIIIl) * f2) * (float)Math.PI / 180.0f);
            class_08642.lllIlIIlIIIlIlIIIllIlllIl(-(class_20502.lllIlIIlIIIlIlIIIllIlllIl.llllIIIIlIIIlIIIIIIlIllll + (class_20502.lllIlIIlIIIlIlIIIllIlllIl.IIIIlIllIlIIlIIlIllIlIlll - class_20502.lllIlIIlIIIlIlIIIllIlllIl.llllIIIIlIIIlIIIIIIlIllll) * f2) * (float)Math.PI / 180.0f);
            class_08642.lllIlIIlIIIlIlIIIllIlllIl(f11 * 0.5f);
            class_08642.lllIIIllIIIIlllIlIIllIIll(-f11 * 0.7f);
            double d5 = class_20502.lllIlIIlIIIlIlIIIllIlllIl.llIIlIllIllllIlIIIIlIIlll + (class_20502.lllIlIIlIIIlIlIIIllIlllIl.IlIIlllllIIlIlIlllllIllll - class_20502.lllIlIIlIIIlIlIIIllIlllIl.llIIlIllIllllIlIIIIlIIlll) * (double)f2 + class_08642.lllIIIllIIIIlllIlIIllIIll;
            double d6 = class_20502.lllIlIIlIIIlIlIIIllIlllIl.llIllllIlIllIIIlIllIIlIlI + (class_20502.lllIlIIlIIIlIlIIIllIlllIl.llIIlIlIlllIIllIlIlllIllI - class_20502.lllIlIIlIIIlIlIIIllIlllIl.llIllllIlIllIIIlIllIIlIlI) * (double)f2 + class_08642.lllIlIIlIIIlIlIIIllIlllIl;
            double d7 = class_20502.lllIlIIlIIIlIlIIIllIlllIl.lIlllIlllIlIIIIlllIlIlIIl + (class_20502.lllIlIIlIIIlIlIIIllIlllIl.IllIIIIllIIllIllIlllIlIIl - class_20502.lllIlIIlIIIlIlIIIllIlllIl.lIlllIlllIlIIIIlllIlIlIIl) * (double)f2 + class_08642.IlIllllllIIlIIllllIIlIIIl;
            double d8 = d4 = class_20502.lllIlIIlIIIlIlIIIllIlllIl == Minecraft.getMinecraft().lIIIIlIlIIlllllIIllIIlIII ? 0.0 : (double)class_20502.lllIlIIlIIIlIlIIIllIlllIl.llIIllIllIlIIlIIllIllllll();
            if (this.lllIlIIlIIIlIlIIIllIlllIl.llIIlllIllIllllIIIlIIIIII.IIlIlIlIIlllIIIlIIIIlIIIl > 0 || class_20502.lllIlIIlIIIlIlIIIllIlllIl != Minecraft.getMinecraft().lIIIIlIlIIlllllIIllIIlIII) {
                float f12 = (class_20502.lllIlIIlIIIlIlIIIllIlllIl.lIIllIlIllIlIlIIlIlIIIIll + (class_20502.lllIlIIlIIIlIlIIIllIlllIl.lllllIllllIIIIllIIlIlIlII - class_20502.lllIlIIlIIIlIlIIIllIlllIl.lIIllIlIllIlIlIIlIlIIIIll) * f2) * (float)Math.PI / 180.0f;
                double d9 = MathHelper.lllIIIllIIIIlllIlIIllIIll(f12);
                double d10 = MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f12);
                d5 = class_20502.lllIlIIlIIIlIlIIIllIlllIl.llIIlIllIllllIlIIIIlIIlll + (class_20502.lllIlIIlIIIlIlIIIllIlllIl.IlIIlllllIIlIlIlllllIllll - class_20502.lllIlIIlIIIlIlIIIllIlllIl.llIIlIllIllllIlIIIIlIIlll) * (double)f2 - d10 * 0.35 - d9 * 0.85;
                d6 = class_20502.lllIlIIlIIIlIlIIIllIlllIl.llIllllIlIllIIIlIllIIlIlI + d4 + (class_20502.lllIlIIlIIIlIlIIIllIlllIl.llIIlIlIlllIIllIlIlllIllI - class_20502.lllIlIIlIIIlIlIIIllIlllIl.llIllllIlIllIIIlIllIIlIlI) * (double)f2 - 0.45;
                d7 = class_20502.lllIlIIlIIIlIlIIIllIlllIl.lIlllIlllIlIIIIlllIlIlIIl + (class_20502.lllIlIIlIIIlIlIIIllIlllIl.IllIIIIllIIllIllIlllIlIIl - class_20502.lllIlIIlIIIlIlIIIllIlllIl.lIlllIlllIlIIIIlllIlIlIIl) * (double)f2 - d9 * 0.35 + d10 * 0.85;
            }
            double d11 = class_20502.llIIlIllIllllIlIIIIlIIlll + (class_20502.IlIIlllllIIlIlIlllllIllll - class_20502.llIIlIllIllllIlIIIIlIIlll) * (double)f2;
            double d12 = class_20502.llIllllIlIllIIIlIllIIlIlI + (class_20502.llIIlIlIlllIIllIlIlllIllI - class_20502.llIllllIlIllIIIlIllIIlIlI) * (double)f2 + 0.25;
            double d13 = class_20502.lIlllIlllIlIIIIlllIlIlIIl + (class_20502.IllIIIIllIIllIllIlllIlIIl - class_20502.lIlllIlllIlIIIIlllIlIlIIl) * (double)f2;
            double d14 = (float)(d5 - d11);
            double d15 = (float)(d6 - d12);
            double d16 = (float)(d7 - d13);
            GL11.glDisable((int)3553);
            GL11.glDisable((int)2896);
            class_08682.lllIIIllIIIIlllIlIIllIIll(3);
            class_08682.IlIllllllIIlIIllllIIlIIIl(0);
            int n3 = 16;
            for (int i = 0; i <= n3; ++i) {
                float f13 = (float)i / (float)n3;
                class_08682.lllIIIllIIIIlllIlIIllIIll(d + d14 * (double)f13, d2 + d15 * (double)(f13 * f13 + f13) * 0.5 + 0.25, d3 + d16 * (double)f13);
            }
            class_08682.lllIIIllIIIIlllIlIIllIIll();
            GL11.glEnable((int)2896);
            GL11.glEnable((int)3553);
        }
    }

    protected ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_2050 class_20502) {
        return lllIIIllIIIIlllIlIIllIIll;
    }

    @Override
    public ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_2050)class_15212);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, double d, double d2, double d3, float f, float f2) {
        this.lllIIIllIIIIlllIlIIllIIll((class_2050)class_15212, d, d2, d3, f, f2);
    }
}

