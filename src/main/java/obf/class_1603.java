package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.util.List;

import com.moonsworth.lunar.client.LunarClient;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.MathHelper;
import net.minecraft.client.renderer.OpenGlHelper;
import org.lwjgl.opengl.GL11;

public abstract class class_1603 {
    private static final ResourceLocation lllIIIllIIIIlllIlIIllIIll = new ResourceLocation("textures/misc/shadow.png");
    protected class_2114 lllIlIIlIIIlIlIIIllIlllIl;
    protected class_1333 IlIllllllIIlIIllllIIlIIIl = new class_1333();
    protected float lIlllIlllIIIIlIIlllIllIII;
    protected float IlIIIIIllllllIIlllIllllll = 1.0f;
    private boolean lIllllIIlIIIlIllllllIIIll = false;

    public abstract void lllIIIllIIIIlllIlIIllIIll(class_1521 var1, double var2, double var4, double var6, float var8, float var9);

    public abstract ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_1521 var1);

    public boolean lllIIIllIIIIlllIlIIllIIll() {
        return this.lIllllIIlIIIlIllllllIIIll;
    }

    protected void lllIlIIlIIIlIlIIIllIlllIl(class_1521 class_15212) {
        this.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll(class_15212));
    }

    protected void lllIIIllIIIIlllIlIIllIIll(ResourceLocation class_17732) {
        this.lllIlIIlIIIlIlIIIllIlllIl.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(class_17732);
    }

    private void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, double d, double d2, double d3, float f) {
        GL11.glDisable((int)2896);
        class_2102 class_21022 = Blocks.lIIlIlllIllIlIlllIIIIIIII.IllIIlllllllIIlIIlIIIIlIl(0);
        class_2102 class_21023 = Blocks.lIIlIlllIllIlIlllIIIIIIII.IllIIlllllllIIlIIlIIIIlIl(1);
        GL11.glPushMatrix();
        GL11.glTranslatef((float)((float)d), (float)((float)d2), (float)((float)d3));
        float f2 = class_15212.IIIIlIlIIlIIIIlIlllIlIIII * 1.4f;
        GL11.glScalef((float)f2, (float)f2, (float)f2);
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        float f3 = 0.5f;
        float f4 = 0.0f;
        float f5 = class_15212.lllIIIIlIlIIlIIlllIIIIIIl / f2;
        float f6 = (float)(class_15212.llIIlIlIlllIIllIlIlllIllI - class_15212.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl);
        GL11.glRotatef((float)(-this.lllIlIIlIIIlIlIIIllIlllIl.IllIIIllIIIIlIlIlIllIIlll), (float)0.0f, (float)1.0f, (float)0.0f);
        GL11.glTranslatef((float)0.0f, (float)0.0f, (float)(-0.3f + (float)((int)f5) * 0.02f));
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        float f7 = 0.0f;
        int n = 0;
        class_08682.lllIlIIlIIIlIlIIIllIlllIl();
        while (f5 > 0.0f) {
            class_2102 class_21024 = n % 2 == 0 ? class_21022 : class_21023;
            this.lllIIIllIIIIlllIlIIllIIll(class_1511.lllIIIllIIIIlllIlIIllIIll);
            float f8 = class_21024.IlIllllllIIlIIllllIIlIIIl();
            float f9 = class_21024.IlIIIIIllllllIIlllIllllll();
            float f10 = class_21024.lIlllIlllIIIIlIIlllIllIII();
            float f11 = class_21024.lIllllIIlIIIlIllllllIIIll();
            if (n / 2 % 2 == 0) {
                float f12 = f10;
                f10 = f8;
                f8 = f12;
            }
            class_08682.lllIIIllIIIIlllIlIIllIIll(f3 - f4, 0.0f - f6, f7, f10, f11);
            class_08682.lllIIIllIIIIlllIlIIllIIll(-f3 - f4, 0.0f - f6, f7, f8, f11);
            class_08682.lllIIIllIIIIlllIlIIllIIll(-f3 - f4, 1.4f - f6, f7, f8, f9);
            class_08682.lllIIIllIIIIlllIlIIllIIll(f3 - f4, 1.4f - f6, f7, f10, f9);
            f5 -= 0.45f;
            f6 -= 0.45f;
            f3 *= 0.9f;
            f7 += 0.03f;
            ++n;
        }
        class_08682.lllIIIllIIIIlllIlIIllIIll();
        GL11.glPopMatrix();
        GL11.glEnable((int)2896);
    }

    private void IlIllllllIIlIIllllIIlIIIl(class_1521 class_15212, double d, double d2, double d3, float f, float f2) {
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        this.lllIlIIlIIIlIlIIIllIlllIl.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(lllIIIllIIIIlllIlIIllIIll);
        class_1334 class_13342 = this.IlIllllllIIlIIllllIIlIIIl();
        GL11.glDepthMask((boolean)false);
        float f3 = this.lIlllIlllIIIIlIIlllIllIII;
        if (class_15212 instanceof class_0339) {
            class_0339 class_03392 = (class_0339)class_15212;
            f3 *= class_03392.llllIIIlIlIlIlIIlIIIIIlIl();
            if (class_03392.g_()) {
                f3 *= 0.5f;
            }
        }
        double d4 = class_15212.lIIIlIIIlIlllIllIIIlIIIlI + (class_15212.IlIIlllllIIlIlIlllllIllll - class_15212.lIIIlIIIlIlllIllIIIlIIIlI) * (double)f2;
        double d5 = class_15212.lIIlIlllIllIlIlllIIIIIIII + (class_15212.llIIlIlIlllIIllIlIlllIllI - class_15212.lIIlIlllIllIlIlllIIIIIIII) * (double)f2 + (double)class_15212.llIIlllIllIllllIIIlIIIIII();
        double d6 = class_15212.IIlIllIIlllllIIlIIllllIIl + (class_15212.IllIIIIllIIllIllIlllIlIIl - class_15212.IIlIllIIlllllIIlIIllllIIl) * (double)f2;
        int n = MathHelper.IlIllllllIIlIIllllIIlIIIl(d4 - (double)f3);
        int n2 = MathHelper.IlIllllllIIlIIllllIIlIIIl(d4 + (double)f3);
        int n3 = MathHelper.IlIllllllIIlIIllllIIlIIIl(d5 - (double)f3);
        int n4 = MathHelper.IlIllllllIIlIIllllIIlIIIl(d5);
        int n5 = MathHelper.IlIllllllIIlIIllllIIlIIIl(d6 - (double)f3);
        int n6 = MathHelper.IlIllllllIIlIIllllIIlIIIl(d6 + (double)f3);
        double d7 = d - d4;
        double d8 = d2 - d5;
        double d9 = d3 - d6;
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        class_08682.lllIlIIlIIIlIlIIIllIlllIl();
        for (int i = n; i <= n2; ++i) {
            for (int j = n3; j <= n4; ++j) {
                for (int k = n5; k <= n6; ++k) {
                    Block class_05492 = class_13342.a_(i, j - 1, k);
                    if (class_05492.lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll || class_13342.IllIIIllIIIIlIlIlIllIIlll(i, j, k) <= 3) continue;
                    this.lllIIIllIIIIlllIlIIllIIll(class_05492, d, d2 + (double)class_15212.llIIlllIllIllllIIIlIIIIII(), d3, i, j, k, f, f3, d7, d8 + (double)class_15212.llIIlllIllIllllIIIlIIIIII(), d9);
                }
            }
        }
        class_08682.lllIIIllIIIIlllIlIIllIIll();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glDisable((int)3042);
        GL11.glDepthMask((boolean)true);
    }

    private class_1334 IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIlIIlIIIlIlIIIllIlllIl.IIIllIIlIIIIIIlIlIIllIIlI;
    }

    private void lllIIIllIIIIlllIlIIllIIll(Block class_05492, double d, double d2, double d3, int n, int n2, int n3, float f, float f2, double d4, double d5, double d6) {
        double d7;
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        if (class_05492.IllIIIllIIIIlIlIlIllIIlll() && (d7 = ((double)f - (d2 - ((double)n2 + d5)) / 2.0) * 0.5 * (double)this.IlIllllllIIlIIllllIIlIIIl().llIIlllIllIllllIIIlIIIIII(n, n2, n3)) >= 0.0) {
            if (d7 > 1.0) {
                d7 = 1.0;
            }
            class_08682.lllIIIllIIIIlllIlIIllIIll(1.0f, 1.0f, 1.0f, (float)d7);
            double d8 = (double)n + class_05492.IlIlIIlllIIlIllIIIlllllIl() + d4;
            double d9 = (double)n + class_05492.lIIlIIIIIlIlllIlIIlIlIlll() + d4;
            double d10 = (double)n2 + class_05492.lIlIlIIlIIIIlIIIIIlllIIII() + d5 + 0.015625;
            double d11 = (double)n3 + class_05492.IIlllIlIlllIllIIIlllIIlIl() + d6;
            double d12 = (double)n3 + class_05492.lIlIllIIlIIlIIlIIlIIlIIll() + d6;
            float f3 = (float)((d - d8) / 2.0 / (double)f2 + 0.5);
            float f4 = (float)((d - d9) / 2.0 / (double)f2 + 0.5);
            float f5 = (float)((d3 - d11) / 2.0 / (double)f2 + 0.5);
            float f6 = (float)((d3 - d12) / 2.0 / (double)f2 + 0.5);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d8, d10, d11, f3, f5);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d8, d10, d12, f3, f6);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d9, d10, d12, f4, f6);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d9, d10, d11, f4, f5);
        }
    }

    public static void lllIIIllIIIIlllIlIIllIIll(class_1974 class_19742, double d, double d2, double d3) {
        GL11.glDisable((int)3553);
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        class_08682.lllIlIIlIIIlIlIIIllIlllIl();
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(d, d2, d3);
        class_08682.IlIllllllIIlIIllllIIlIIIl(0.0f, 0.0f, -1.0f);
        class_08682.lllIIIllIIIIlllIlIIllIIll(class_19742.lllIIIllIIIIlllIlIIllIIll, class_19742.IlIIIIIllllllIIlllIllllll, class_19742.IlIllllllIIlIIllllIIlIIIl);
        class_08682.lllIIIllIIIIlllIlIIllIIll(class_19742.lIlllIlllIIIIlIIlllIllIII, class_19742.IlIIIIIllllllIIlllIllllll, class_19742.IlIllllllIIlIIllllIIlIIIl);
        class_08682.lllIIIllIIIIlllIlIIllIIll(class_19742.lIlllIlllIIIIlIIlllIllIII, class_19742.lllIlIIlIIIlIlIIIllIlllIl, class_19742.IlIllllllIIlIIllllIIlIIIl);
        class_08682.lllIIIllIIIIlllIlIIllIIll(class_19742.lllIIIllIIIIlllIlIIllIIll, class_19742.lllIlIIlIIIlIlIIIllIlllIl, class_19742.IlIllllllIIlIIllllIIlIIIl);
        class_08682.IlIllllllIIlIIllllIIlIIIl(0.0f, 0.0f, 1.0f);
        class_08682.lllIIIllIIIIlllIlIIllIIll(class_19742.lllIIIllIIIIlllIlIIllIIll, class_19742.lllIlIIlIIIlIlIIIllIlllIl, class_19742.lIllllIIlIIIlIllllllIIIll);
        class_08682.lllIIIllIIIIlllIlIIllIIll(class_19742.lIlllIlllIIIIlIIlllIllIII, class_19742.lllIlIIlIIIlIlIIIllIlllIl, class_19742.lIllllIIlIIIlIllllllIIIll);
        class_08682.lllIIIllIIIIlllIlIIllIIll(class_19742.lIlllIlllIIIIlIIlllIllIII, class_19742.IlIIIIIllllllIIlllIllllll, class_19742.lIllllIIlIIIlIllllllIIIll);
        class_08682.lllIIIllIIIIlllIlIIllIIll(class_19742.lllIIIllIIIIlllIlIIllIIll, class_19742.IlIIIIIllllllIIlllIllllll, class_19742.lIllllIIlIIIlIllllllIIIll);
        class_08682.IlIllllllIIlIIllllIIlIIIl(0.0f, -1.0f, 0.0f);
        class_08682.lllIIIllIIIIlllIlIIllIIll(class_19742.lllIIIllIIIIlllIlIIllIIll, class_19742.lllIlIIlIIIlIlIIIllIlllIl, class_19742.IlIllllllIIlIIllllIIlIIIl);
        class_08682.lllIIIllIIIIlllIlIIllIIll(class_19742.lIlllIlllIIIIlIIlllIllIII, class_19742.lllIlIIlIIIlIlIIIllIlllIl, class_19742.IlIllllllIIlIIllllIIlIIIl);
        class_08682.lllIIIllIIIIlllIlIIllIIll(class_19742.lIlllIlllIIIIlIIlllIllIII, class_19742.lllIlIIlIIIlIlIIIllIlllIl, class_19742.lIllllIIlIIIlIllllllIIIll);
        class_08682.lllIIIllIIIIlllIlIIllIIll(class_19742.lllIIIllIIIIlllIlIIllIIll, class_19742.lllIlIIlIIIlIlIIIllIlllIl, class_19742.lIllllIIlIIIlIllllllIIIll);
        class_08682.IlIllllllIIlIIllllIIlIIIl(0.0f, 1.0f, 0.0f);
        class_08682.lllIIIllIIIIlllIlIIllIIll(class_19742.lllIIIllIIIIlllIlIIllIIll, class_19742.IlIIIIIllllllIIlllIllllll, class_19742.lIllllIIlIIIlIllllllIIIll);
        class_08682.lllIIIllIIIIlllIlIIllIIll(class_19742.lIlllIlllIIIIlIIlllIllIII, class_19742.IlIIIIIllllllIIlllIllllll, class_19742.lIllllIIlIIIlIllllllIIIll);
        class_08682.lllIIIllIIIIlllIlIIllIIll(class_19742.lIlllIlllIIIIlIIlllIllIII, class_19742.IlIIIIIllllllIIlllIllllll, class_19742.IlIllllllIIlIIllllIIlIIIl);
        class_08682.lllIIIllIIIIlllIlIIllIIll(class_19742.lllIIIllIIIIlllIlIIllIIll, class_19742.IlIIIIIllllllIIlllIllllll, class_19742.IlIllllllIIlIIllllIIlIIIl);
        class_08682.IlIllllllIIlIIllllIIlIIIl(-1.0f, 0.0f, 0.0f);
        class_08682.lllIIIllIIIIlllIlIIllIIll(class_19742.lllIIIllIIIIlllIlIIllIIll, class_19742.lllIlIIlIIIlIlIIIllIlllIl, class_19742.lIllllIIlIIIlIllllllIIIll);
        class_08682.lllIIIllIIIIlllIlIIllIIll(class_19742.lllIIIllIIIIlllIlIIllIIll, class_19742.IlIIIIIllllllIIlllIllllll, class_19742.lIllllIIlIIIlIllllllIIIll);
        class_08682.lllIIIllIIIIlllIlIIllIIll(class_19742.lllIIIllIIIIlllIlIIllIIll, class_19742.IlIIIIIllllllIIlllIllllll, class_19742.IlIllllllIIlIIllllIIlIIIl);
        class_08682.lllIIIllIIIIlllIlIIllIIll(class_19742.lllIIIllIIIIlllIlIIllIIll, class_19742.lllIlIIlIIIlIlIIIllIlllIl, class_19742.IlIllllllIIlIIllllIIlIIIl);
        class_08682.IlIllllllIIlIIllllIIlIIIl(1.0f, 0.0f, 0.0f);
        class_08682.lllIIIllIIIIlllIlIIllIIll(class_19742.lIlllIlllIIIIlIIlllIllIII, class_19742.lllIlIIlIIIlIlIIIllIlllIl, class_19742.IlIllllllIIlIIllllIIlIIIl);
        class_08682.lllIIIllIIIIlllIlIIllIIll(class_19742.lIlllIlllIIIIlIIlllIllIII, class_19742.IlIIIIIllllllIIlllIllllll, class_19742.IlIllllllIIlIIllllIIlIIIl);
        class_08682.lllIIIllIIIIlllIlIIllIIll(class_19742.lIlllIlllIIIIlIIlllIllIII, class_19742.IlIIIIIllllllIIlllIllllll, class_19742.lIllllIIlIIIlIllllllIIIll);
        class_08682.lllIIIllIIIIlllIlIIllIIll(class_19742.lIlllIlllIIIIlIIlllIllIII, class_19742.lllIlIIlIIIlIlIIIllIlllIl, class_19742.lIllllIIlIIIlIllllllIIIll);
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(0.0, 0.0, 0.0);
        class_08682.lllIIIllIIIIlllIlIIllIIll();
        GL11.glEnable((int)3553);
    }

    public static void lllIIIllIIIIlllIlIIllIIll(class_1974 class_19742) {
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        class_08682.lllIlIIlIIIlIlIIIllIlllIl();
        class_08682.lllIIIllIIIIlllIlIIllIIll(class_19742.lllIIIllIIIIlllIlIIllIIll, class_19742.IlIIIIIllllllIIlllIllllll, class_19742.IlIllllllIIlIIllllIIlIIIl);
        class_08682.lllIIIllIIIIlllIlIIllIIll(class_19742.lIlllIlllIIIIlIIlllIllIII, class_19742.IlIIIIIllllllIIlllIllllll, class_19742.IlIllllllIIlIIllllIIlIIIl);
        class_08682.lllIIIllIIIIlllIlIIllIIll(class_19742.lIlllIlllIIIIlIIlllIllIII, class_19742.lllIlIIlIIIlIlIIIllIlllIl, class_19742.IlIllllllIIlIIllllIIlIIIl);
        class_08682.lllIIIllIIIIlllIlIIllIIll(class_19742.lllIIIllIIIIlllIlIIllIIll, class_19742.lllIlIIlIIIlIlIIIllIlllIl, class_19742.IlIllllllIIlIIllllIIlIIIl);
        class_08682.lllIIIllIIIIlllIlIIllIIll(class_19742.lllIIIllIIIIlllIlIIllIIll, class_19742.lllIlIIlIIIlIlIIIllIlllIl, class_19742.lIllllIIlIIIlIllllllIIIll);
        class_08682.lllIIIllIIIIlllIlIIllIIll(class_19742.lIlllIlllIIIIlIIlllIllIII, class_19742.lllIlIIlIIIlIlIIIllIlllIl, class_19742.lIllllIIlIIIlIllllllIIIll);
        class_08682.lllIIIllIIIIlllIlIIllIIll(class_19742.lIlllIlllIIIIlIIlllIllIII, class_19742.IlIIIIIllllllIIlllIllllll, class_19742.lIllllIIlIIIlIllllllIIIll);
        class_08682.lllIIIllIIIIlllIlIIllIIll(class_19742.lllIIIllIIIIlllIlIIllIIll, class_19742.IlIIIIIllllllIIlllIllllll, class_19742.lIllllIIlIIIlIllllllIIIll);
        class_08682.lllIIIllIIIIlllIlIIllIIll(class_19742.lllIIIllIIIIlllIlIIllIIll, class_19742.lllIlIIlIIIlIlIIIllIlllIl, class_19742.IlIllllllIIlIIllllIIlIIIl);
        class_08682.lllIIIllIIIIlllIlIIllIIll(class_19742.lIlllIlllIIIIlIIlllIllIII, class_19742.lllIlIIlIIIlIlIIIllIlllIl, class_19742.IlIllllllIIlIIllllIIlIIIl);
        class_08682.lllIIIllIIIIlllIlIIllIIll(class_19742.lIlllIlllIIIIlIIlllIllIII, class_19742.lllIlIIlIIIlIlIIIllIlllIl, class_19742.lIllllIIlIIIlIllllllIIIll);
        class_08682.lllIIIllIIIIlllIlIIllIIll(class_19742.lllIIIllIIIIlllIlIIllIIll, class_19742.lllIlIIlIIIlIlIIIllIlllIl, class_19742.lIllllIIlIIIlIllllllIIIll);
        class_08682.lllIIIllIIIIlllIlIIllIIll(class_19742.lllIIIllIIIIlllIlIIllIIll, class_19742.IlIIIIIllllllIIlllIllllll, class_19742.lIllllIIlIIIlIllllllIIIll);
        class_08682.lllIIIllIIIIlllIlIIllIIll(class_19742.lIlllIlllIIIIlIIlllIllIII, class_19742.IlIIIIIllllllIIlllIllllll, class_19742.lIllllIIlIIIlIllllllIIIll);
        class_08682.lllIIIllIIIIlllIlIIllIIll(class_19742.lIlllIlllIIIIlIIlllIllIII, class_19742.IlIIIIIllllllIIlllIllllll, class_19742.IlIllllllIIlIIllllIIlIIIl);
        class_08682.lllIIIllIIIIlllIlIIllIIll(class_19742.lllIIIllIIIIlllIlIIllIIll, class_19742.IlIIIIIllllllIIlllIllllll, class_19742.IlIllllllIIlIIllllIIlIIIl);
        class_08682.lllIIIllIIIIlllIlIIllIIll(class_19742.lllIIIllIIIIlllIlIIllIIll, class_19742.lllIlIIlIIIlIlIIIllIlllIl, class_19742.lIllllIIlIIIlIllllllIIIll);
        class_08682.lllIIIllIIIIlllIlIIllIIll(class_19742.lllIIIllIIIIlllIlIIllIIll, class_19742.IlIIIIIllllllIIlllIllllll, class_19742.lIllllIIlIIIlIllllllIIIll);
        class_08682.lllIIIllIIIIlllIlIIllIIll(class_19742.lllIIIllIIIIlllIlIIllIIll, class_19742.IlIIIIIllllllIIlllIllllll, class_19742.IlIllllllIIlIIllllIIlIIIl);
        class_08682.lllIIIllIIIIlllIlIIllIIll(class_19742.lllIIIllIIIIlllIlIIllIIll, class_19742.lllIlIIlIIIlIlIIIllIlllIl, class_19742.IlIllllllIIlIIllllIIlIIIl);
        class_08682.lllIIIllIIIIlllIlIIllIIll(class_19742.lIlllIlllIIIIlIIlllIllIII, class_19742.lllIlIIlIIIlIlIIIllIlllIl, class_19742.IlIllllllIIlIIllllIIlIIIl);
        class_08682.lllIIIllIIIIlllIlIIllIIll(class_19742.lIlllIlllIIIIlIIlllIllIII, class_19742.IlIIIIIllllllIIlllIllllll, class_19742.IlIllllllIIlIIllllIIlIIIl);
        class_08682.lllIIIllIIIIlllIlIIllIIll(class_19742.lIlllIlllIIIIlIIlllIllIII, class_19742.IlIIIIIllllllIIlllIllllll, class_19742.lIllllIIlIIIlIllllllIIIll);
        class_08682.lllIIIllIIIIlllIlIIllIIll(class_19742.lIlllIlllIIIIlIIlllIllIII, class_19742.lllIlIIlIIIlIlIIIllIlllIl, class_19742.lIllllIIlIIIlIllllllIIIll);
        class_08682.lllIIIllIIIIlllIlIIllIIll();
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_2114 class_21142) {
        this.lllIlIIlIIIlIlIIIllIlllIl = class_21142;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(class_1521 class_15212, double d, double d2, double d3, float f, float f2) {
        double d4;
        float f3;
        if (this.lllIlIIlIIIlIlIIIllIlllIl.llIIlllIllIllllIIIlIIIIII.IIIllIllIIlIlIlIlIllllIIl && this.lIlllIlllIIIIlIIlllIllIII > 0.0f && !class_15212.lIIlIlIIllIIIlIIlIlIIIlII() && (f3 = (float)((1.0 - (d4 = this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(class_15212.IlIIlllllIIlIlIlllllIllll, class_15212.llIIlIlIlllIIllIlIlllIllI, class_15212.IllIIIIllIIllIllIlllIlIIl)) / 256.0) * (double)this.IlIIIIIllllllIIlllIllllll)) > 0.0f) {
            this.IlIllllllIIlIIllllIIlIIIl(class_15212, d, d2, d3, f3, f2);
        }
        if (class_15212.lIIllIlIIlIIlllllIlIIllIl()) {
            this.lllIIIllIIIIlllIlIIllIIll(class_15212, d, d2, d3, f2);
        }
    }

    public class_1854 lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll();
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, String string, double d, double d2, double d3, int n) {
        double d4 = class_15212.IlIIIIIllllllIIlllIllllll(this.lllIlIIlIIIlIlIIIllIlllIl.IllIIlllllllIIlIIlIIIIlIl);
        if (d4 <= (double)(n * n)) {
            if (LunarClient.getInstance().getNetworkManager().IllIIIllIIIIlIlIlIllIIlll().containsKey(class_15212.lIIlllIIlIlIlIIIlIlllIIll())) {
                List list = (List) LunarClient.getInstance().getNetworkManager().IllIIIllIIIIlIlIlIllIIlll().get(class_15212.lIIlllIIlIlIlIIIlIlllIIll());
                int n2 = 0;
                for (String string2 : list) {
                    this.lllIIIllIIIIlllIlIIllIIll(-n2, class_15212, string2, d, d2, d3, n);
                    ++n2;
                }
            } else {
                this.lllIIIllIIIIlllIlIIllIIll(0.0, class_15212, string, d, d2, d3, n);
            }
        }
    }

    private void lllIIIllIIIIlllIlIIllIIll(double d, class_1521 class_15212, String string, double d2, double d3, double d4, int n) {
        class_1854 class_18542 = this.lllIlIIlIIIlIlIIIllIlllIl();
        float f = 1.6f;
        float f2 = 0.016666668f * f;
        GL11.glPushMatrix();
        GL11.glTranslatef((float)((float)d2 + 0.0f), (float)((float)(d3 + (double)class_15212.lllIIIIlIlIIlIIlllIIIIIIl + 0.5 - d / 3.5)), (float)((float)d4));
        GL11.glNormal3f((float)0.0f, (float)1.0f, (float)0.0f);
        GL11.glRotatef((float)(-this.lllIlIIlIIIlIlIIIllIlllIl.IllIIIllIIIIlIlIlIllIIlll), (float)0.0f, (float)1.0f, (float)0.0f);
        GL11.glRotatef((float)this.lllIlIIlIIIlIlIIIllIlllIl.lIIIIlIlIIlllllIIllIIlIII, (float)1.0f, (float)0.0f, (float)0.0f);
        GL11.glScalef((float)(-f2), (float)(-f2), (float)f2);
        GL11.glDisable((int)2896);
        GL11.glDepthMask((boolean)false);
        GL11.glDisable((int)2929);
        GL11.glEnable((int)3042);
        OpenGlHelper.glBlendFunc(770, 771, 1, 0);
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        int n2 = 0;
        GL11.glDisable((int)3553);
        class_08682.lllIlIIlIIIlIlIIIllIlllIl();
        int n3 = class_18542.lllIIIllIIIIlllIlIIllIIll(string) / 2;
        class_08682.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, 0.25f);
        class_08682.lllIIIllIIIIlllIlIIllIIll((double)(-n3 - 1), (double)(-1 + n2), 0.0);
        class_08682.lllIIIllIIIIlllIlIIllIIll((double)(-n3 - 1), (double)(8 + n2), 0.0);
        class_08682.lllIIIllIIIIlllIlIIllIIll((double)(n3 + 1), (double)(8 + n2), 0.0);
        class_08682.lllIIIllIIIIlllIlIIllIIll((double)(n3 + 1), (double)(-1 + n2), 0.0);
        class_08682.lllIIIllIIIIlllIlIIllIIll();
        GL11.glEnable((int)3553);
        class_18542.lllIlIIlIIIlIlIIIllIlllIl(string, -class_18542.lllIIIllIIIIlllIlIIllIIll(string) / 2, n2, 0x20FFFFFF);
        GL11.glEnable((int)2929);
        GL11.glDepthMask((boolean)true);
        class_18542.lllIlIIlIIIlIlIIIllIlllIl(string, -class_18542.lllIIIllIIIIlllIlIIllIIll(string) / 2, n2, -1);
        GL11.glEnable((int)2896);
        GL11.glDisable((int)3042);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glPopMatrix();
    }
}

