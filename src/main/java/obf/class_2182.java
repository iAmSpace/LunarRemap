package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.nio.FloatBuffer;
import java.util.Random;

import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class class_2182
extends class_2052 {
    private static final ResourceLocation IlIllllllIIlIIllllIIlIIIl = new ResourceLocation("textures/environment/end_sky.png");
    private static final ResourceLocation lIlllIlllIIIIlIIlllIllIII = new ResourceLocation("textures/entity/end_portal.png");
    private static final Random IlIIIIIllllllIIlllIllllll = new Random(31100L);
    FloatBuffer lllIIIllIIIIlllIlIIllIIll = class_0994.IlIIIIIllllllIIlllIllllll(16);

    public void lllIIIllIIIIlllIlIIllIIll(class_1525 class_15252, double d, double d2, double d3, float f) {
        float f2 = (float)this.lllIlIIlIIIlIlIIIllIlllIl.IllIIIllIIIIlIlIlIllIIlll;
        float f3 = (float)this.lllIlIIlIIIlIlIIIllIlllIl.lIIIIlIlIIlllllIIllIIlIII;
        float f4 = (float)this.lllIlIIlIIIlIlIIIllIlllIl.llIIlllIllIllllIIIlIIIIII;
        GL11.glDisable((int)2896);
        IlIIIIIllllllIIlllIllllll.setSeed(31100L);
        float f5 = 0.75f;
        for (int i = 0; i < 16; ++i) {
            GL11.glPushMatrix();
            float f6 = 16 - i;
            float f7 = 0.0625f;
            float f8 = 1.0f / (f6 + 1.0f);
            if (i == 0) {
                this.lllIIIllIIIIlllIlIIllIIll(IlIllllllIIlIIllllIIlIIIl);
                f8 = 0.1f;
                f6 = 65.0f;
                f7 = 0.125f;
                GL11.glEnable((int)3042);
                GL11.glBlendFunc((int)770, (int)771);
            }
            if (i == 1) {
                this.lllIIIllIIIIlllIlIIllIIll(lIlllIlllIIIIlIIlllIllIII);
                GL11.glEnable((int)3042);
                GL11.glBlendFunc((int)1, (int)1);
                f7 = 0.5f;
            }
            float f9 = (float)(-(d2 + (double)f5));
            float f10 = f9 + class_1490.lllIlIIlIIIlIlIIIllIlllIl;
            float f11 = f9 + f6 + class_1490.lllIlIIlIIIlIlIIIllIlllIl;
            float f12 = f10 / f11;
            GL11.glTranslatef((float)f2, (float)(f12 += (float)(d2 + (double)f5)), (float)f4);
            GL11.glTexGeni((int)8192, (int)9472, (int)9217);
            GL11.glTexGeni((int)8193, (int)9472, (int)9217);
            GL11.glTexGeni((int)8194, (int)9472, (int)9217);
            GL11.glTexGeni((int)8195, (int)9472, (int)9216);
            GL11.glTexGen((int)8192, (int)9473, (FloatBuffer)this.lllIIIllIIIIlllIlIIllIIll(1.0f, 0.0f, 0.0f, 0.0f));
            GL11.glTexGen((int)8193, (int)9473, (FloatBuffer)this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 1.0f, 0.0f));
            GL11.glTexGen((int)8194, (int)9473, (FloatBuffer)this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, 1.0f));
            GL11.glTexGen((int)8195, (int)9474, (FloatBuffer)this.lllIIIllIIIIlllIlIIllIIll(0.0f, 1.0f, 0.0f, 0.0f));
            GL11.glEnable((int)3168);
            GL11.glEnable((int)3169);
            GL11.glEnable((int)3170);
            GL11.glEnable((int)3171);
            GL11.glPopMatrix();
            GL11.glMatrixMode((int)5890);
            GL11.glPushMatrix();
            GL11.glLoadIdentity();
            GL11.glTranslatef((float)0.0f, (float)((float)(Minecraft.llllllIlIllllIlIlIlIIIIlI() % 700000L) / 700000.0f), (float)0.0f);
            GL11.glScalef((float)f7, (float)f7, (float)f7);
            GL11.glTranslatef((float)0.5f, (float)0.5f, (float)0.0f);
            GL11.glRotatef((float)((float)(i * i * 4321 + i * 9) * 2.0f), (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.5f, (float)-0.5f, (float)0.0f);
            GL11.glTranslatef((float)(-f2), (float)(-f4), (float)(-f3));
            f10 = f9 + class_1490.lllIlIIlIIIlIlIIIllIlllIl;
            GL11.glTranslatef((float)(class_1490.lllIIIllIIIIlllIlIIllIIll * f6 / f10), (float)(class_1490.IlIllllllIIlIIllllIIlIIIl * f6 / f10), (float)(-f3));
            class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
            class_08682.lllIlIIlIIIlIlIIIllIlllIl();
            f12 = IlIIIIIllllllIIlllIllllll.nextFloat() * 0.5f + 0.1f;
            float f13 = IlIIIIIllllllIIlllIllllll.nextFloat() * 0.5f + 0.4f;
            float f14 = IlIIIIIllllllIIlllIllllll.nextFloat() * 0.5f + 0.5f;
            if (i == 0) {
                f14 = 1.0f;
                f13 = 1.0f;
                f12 = 1.0f;
            }
            class_08682.lllIIIllIIIIlllIlIIllIIll(f12 * f8, f13 * f8, f14 * f8, 1.0f);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d, d2 + (double)f5, d3);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d, d2 + (double)f5, d3 + 1.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d + 1.0, d2 + (double)f5, d3 + 1.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d + 1.0, d2 + (double)f5, d3);
            class_08682.lllIIIllIIIIlllIlIIllIIll();
            GL11.glPopMatrix();
            GL11.glMatrixMode((int)5888);
        }
        GL11.glDisable((int)3042);
        GL11.glDisable((int)3168);
        GL11.glDisable((int)3169);
        GL11.glDisable((int)3170);
        GL11.glDisable((int)3171);
        GL11.glEnable((int)2896);
    }

    private FloatBuffer lllIIIllIIIIlllIlIIllIIll(float f, float f2, float f3, float f4) {
        this.lllIIIllIIIIlllIlIIllIIll.clear();
        this.lllIIIllIIIIlllIlIIllIIll.put(f).put(f2).put(f3).put(f4);
        this.lllIIIllIIIIlllIlIIllIIll.flip();
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1774 class_17742, double d, double d2, double d3, float f) {
        this.lllIIIllIIIIlllIlIIllIIll((class_1525)class_17742, d, d2, d3, f);
    }
}

