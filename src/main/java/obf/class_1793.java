package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.util.MathHelper;
import net.minecraft.client.renderer.OpenGlHelper;
import org.lwjgl.opengl.GL11;

public class class_1793
extends class_1603 {
    private static final ResourceLocation lllIIIllIIIIlllIlIIllIIll = new ResourceLocation("textures/painting/paintings_kristoffer_zetterstrand.png");

    public void lllIIIllIIIIlllIlIIllIIll(class_0146 class_01462, double d, double d2, double d3, float f, float f2) {
        GL11.glPushMatrix();
        GL11.glTranslated((double)d, (double)d2, (double)d3);
        GL11.glRotatef((float)f, (float)0.0f, (float)1.0f, (float)0.0f);
        GL11.glEnable((int)32826);
        this.lllIlIIlIIIlIlIIIllIlllIl(class_01462);
        class_1553 class_15532 = class_01462.IlIIIIIllllllIIlllIllllll;
        float f3 = 0.0625f;
        GL11.glScalef((float)f3, (float)f3, (float)f3);
        this.lllIIIllIIIIlllIlIIllIIll(class_01462, class_15532.IllIIIIllIIllIllIlllIlIIl, class_15532.IIIIIIIIlIllIIllIIlllIllI, class_15532.IIlIIlIlIlIllIIlIlIIIIlll, class_15532.llIIIlllIlllIlIllIIIIllIl);
        GL11.glDisable((int)32826);
        GL11.glPopMatrix();
    }

    protected ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_0146 class_01462) {
        return lllIIIllIIIIlllIlIIllIIll;
    }

    private void lllIIIllIIIIlllIlIIllIIll(class_0146 class_01462, int n, int n2, int n3, int n4) {
        float f = (float)(-n) / 2.0f;
        float f2 = (float)(-n2) / 2.0f;
        float f3 = 0.5f;
        float f4 = 0.75f;
        float f5 = 0.8125f;
        float f6 = 0.0f;
        float f7 = 0.0625f;
        float f8 = 0.75f;
        float f9 = 0.8125f;
        float f10 = 0.001953125f;
        float f11 = 0.001953125f;
        float f12 = 0.7519531f;
        float f13 = 0.7519531f;
        float f14 = 0.0f;
        float f15 = 0.0625f;
        for (int i = 0; i < n / 16; ++i) {
            for (int j = 0; j < n2 / 16; ++j) {
                float f16 = f + (float)((i + 1) * 16);
                float f17 = f + (float)(i * 16);
                float f18 = f2 + (float)((j + 1) * 16);
                float f19 = f2 + (float)(j * 16);
                this.lllIIIllIIIIlllIlIIllIIll(class_01462, (f16 + f17) / 2.0f, (f18 + f19) / 2.0f);
                float f20 = (float)(n3 + n - i * 16) / 256.0f;
                float f21 = (float)(n3 + n - (i + 1) * 16) / 256.0f;
                float f22 = (float)(n4 + n2 - j * 16) / 256.0f;
                float f23 = (float)(n4 + n2 - (j + 1) * 16) / 256.0f;
                class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
                class_08682.lllIlIIlIIIlIlIIIllIlllIl();
                class_08682.IlIllllllIIlIIllllIIlIIIl(0.0f, 0.0f, -1.0f);
                class_08682.lllIIIllIIIIlllIlIIllIIll(f16, f19, -f3, f21, f22);
                class_08682.lllIIIllIIIIlllIlIIllIIll(f17, f19, -f3, f20, f22);
                class_08682.lllIIIllIIIIlllIlIIllIIll(f17, f18, -f3, f20, f23);
                class_08682.lllIIIllIIIIlllIlIIllIIll(f16, f18, -f3, f21, f23);
                class_08682.IlIllllllIIlIIllllIIlIIIl(0.0f, 0.0f, 1.0f);
                class_08682.lllIIIllIIIIlllIlIIllIIll(f16, f18, f3, f4, f6);
                class_08682.lllIIIllIIIIlllIlIIllIIll(f17, f18, f3, f5, f6);
                class_08682.lllIIIllIIIIlllIlIIllIIll(f17, f19, f3, f5, f7);
                class_08682.lllIIIllIIIIlllIlIIllIIll(f16, f19, f3, f4, f7);
                class_08682.IlIllllllIIlIIllllIIlIIIl(0.0f, 1.0f, 0.0f);
                class_08682.lllIIIllIIIIlllIlIIllIIll(f16, f18, -f3, f8, f10);
                class_08682.lllIIIllIIIIlllIlIIllIIll(f17, f18, -f3, f9, f10);
                class_08682.lllIIIllIIIIlllIlIIllIIll(f17, f18, f3, f9, f11);
                class_08682.lllIIIllIIIIlllIlIIllIIll(f16, f18, f3, f8, f11);
                class_08682.IlIllllllIIlIIllllIIlIIIl(0.0f, -1.0f, 0.0f);
                class_08682.lllIIIllIIIIlllIlIIllIIll(f16, f19, f3, f8, f10);
                class_08682.lllIIIllIIIIlllIlIIllIIll(f17, f19, f3, f9, f10);
                class_08682.lllIIIllIIIIlllIlIIllIIll(f17, f19, -f3, f9, f11);
                class_08682.lllIIIllIIIIlllIlIIllIIll(f16, f19, -f3, f8, f11);
                class_08682.IlIllllllIIlIIllllIIlIIIl(-1.0f, 0.0f, 0.0f);
                class_08682.lllIIIllIIIIlllIlIIllIIll(f16, f18, f3, f13, f14);
                class_08682.lllIIIllIIIIlllIlIIllIIll(f16, f19, f3, f13, f15);
                class_08682.lllIIIllIIIIlllIlIIllIIll(f16, f19, -f3, f12, f15);
                class_08682.lllIIIllIIIIlllIlIIllIIll(f16, f18, -f3, f12, f14);
                class_08682.IlIllllllIIlIIllllIIlIIIl(1.0f, 0.0f, 0.0f);
                class_08682.lllIIIllIIIIlllIlIIllIIll(f17, f18, -f3, f13, f14);
                class_08682.lllIIIllIIIIlllIlIIllIIll(f17, f19, -f3, f13, f15);
                class_08682.lllIIIllIIIIlllIlIIllIIll(f17, f19, f3, f12, f15);
                class_08682.lllIIIllIIIIlllIlIIllIIll(f17, f18, f3, f12, f14);
                class_08682.lllIIIllIIIIlllIlIIllIIll();
            }
        }
    }

    private void lllIIIllIIIIlllIlIIllIIll(class_0146 class_01462, float f, float f2) {
        int n = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_01462.IlIIlllllIIlIlIlllllIllll);
        int n2 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_01462.llIIlIlIlllIIllIlIlllIllI + (double)(f2 / 16.0f));
        int n3 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_01462.IllIIIIllIIllIllIlllIlIIl);
        if (class_01462.lllIIIllIIIIlllIlIIllIIll == 2) {
            n = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_01462.IlIIlllllIIlIlIlllllIllll + (double)(f / 16.0f));
        }
        if (class_01462.lllIIIllIIIIlllIlIIllIIll == 1) {
            n3 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_01462.IllIIIIllIIllIllIlllIlIIl - (double)(f / 16.0f));
        }
        if (class_01462.lllIIIllIIIIlllIlIIllIIll == 0) {
            n = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_01462.IlIIlllllIIlIlIlllllIllll - (double)(f / 16.0f));
        }
        if (class_01462.lllIIIllIIIIlllIlIIllIIll == 3) {
            n3 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_01462.IllIIIIllIIllIllIlllIlIIl + (double)(f / 16.0f));
        }
        int n4 = this.lllIlIIlIIIlIlIIIllIlllIl.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, 0);
        int n5 = n4 % 65536;
        int n6 = n4 / 65536;
        OpenGlHelper.lllIIIllIIIIlllIlIIllIIll(OpenGlHelper.IlIllllllIIlIIllllIIlIIIl, n5, n6);
        GL11.glColor3f((float)1.0f, (float)1.0f, (float)1.0f);
    }

    @Override
    public ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_0146)class_15212);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, double d, double d2, double d3, float f, float f2) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0146)class_15212, d, d2, d3, f, f2);
    }
}

