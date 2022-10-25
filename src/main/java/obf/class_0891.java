package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class class_0891
extends class_1603 {
    private static final ResourceLocation lllIIIllIIIIlllIlIIllIIll = new ResourceLocation("textures/entity/arrow.png");

    public void lllIIIllIIIIlllIlIIllIIll(class_0369 class_03692, double d, double d2, double d3, float f, float f2) {
        this.lllIlIIlIIIlIlIIIllIlllIl(class_03692);
        GL11.glPushMatrix();
        GL11.glTranslatef((float)((float)d), (float)((float)d2), (float)((float)d3));
        GL11.glRotatef((float)(class_03692.llllIIIIlIIIlIIIIIIlIllll + (class_03692.IIIIlIllIlIIlIIlIllIlIlll - class_03692.llllIIIIlIIIlIIIIIIlIllll) * f2 - 90.0f), (float)0.0f, (float)1.0f, (float)0.0f);
        GL11.glRotatef((float)(class_03692.llIIIIllIIIIIIIlIIIlIIIIl + (class_03692.IlIlIIlllIllllllllIIIlIlI - class_03692.llIIIIllIIIIIIIlIIIlIIIIl) * f2), (float)0.0f, (float)0.0f, (float)1.0f);
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        int n = 0;
        float f3 = 0.0f;
        float f4 = 0.5f;
        float f5 = (float)(0 + n * 10) / 32.0f;
        float f6 = (float)(5 + n * 10) / 32.0f;
        float f7 = 0.0f;
        float f8 = 0.15625f;
        float f9 = (float)(5 + n * 10) / 32.0f;
        float f10 = (float)(10 + n * 10) / 32.0f;
        float f11 = 0.05625f;
        GL11.glEnable((int)32826);
        float f12 = (float)class_03692.lllIlIIlIIIlIlIIIllIlllIl - f2;
        if (f12 > 0.0f) {
            float f13 = -MathHelper.lllIIIllIIIIlllIlIIllIIll(f12 * 3.0f) * f12;
            GL11.glRotatef((float)f13, (float)0.0f, (float)0.0f, (float)1.0f);
        }
        GL11.glRotatef((float)45.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        GL11.glScalef((float)f11, (float)f11, (float)f11);
        GL11.glTranslatef((float)-4.0f, (float)0.0f, (float)0.0f);
        GL11.glNormal3f((float)f11, (float)0.0f, (float)0.0f);
        class_08682.lllIlIIlIIIlIlIIIllIlllIl();
        class_08682.lllIIIllIIIIlllIlIIllIIll(-7.0, -2.0, -2.0, f7, f9);
        class_08682.lllIIIllIIIIlllIlIIllIIll(-7.0, -2.0, 2.0, f8, f9);
        class_08682.lllIIIllIIIIlllIlIIllIIll(-7.0, 2.0, 2.0, f8, f10);
        class_08682.lllIIIllIIIIlllIlIIllIIll(-7.0, 2.0, -2.0, f7, f10);
        class_08682.lllIIIllIIIIlllIlIIllIIll();
        GL11.glNormal3f((float)(-f11), (float)0.0f, (float)0.0f);
        class_08682.lllIlIIlIIIlIlIIIllIlllIl();
        class_08682.lllIIIllIIIIlllIlIIllIIll(-7.0, 2.0, -2.0, f7, f9);
        class_08682.lllIIIllIIIIlllIlIIllIIll(-7.0, 2.0, 2.0, f8, f9);
        class_08682.lllIIIllIIIIlllIlIIllIIll(-7.0, -2.0, 2.0, f8, f10);
        class_08682.lllIIIllIIIIlllIlIIllIIll(-7.0, -2.0, -2.0, f7, f10);
        class_08682.lllIIIllIIIIlllIlIIllIIll();
        for (int i = 0; i < 4; ++i) {
            GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glNormal3f((float)0.0f, (float)0.0f, (float)f11);
            class_08682.lllIlIIlIIIlIlIIIllIlllIl();
            class_08682.lllIIIllIIIIlllIlIIllIIll(-8.0, -2.0, 0.0, f3, f5);
            class_08682.lllIIIllIIIIlllIlIIllIIll(8.0, -2.0, 0.0, f4, f5);
            class_08682.lllIIIllIIIIlllIlIIllIIll(8.0, 2.0, 0.0, f4, f6);
            class_08682.lllIIIllIIIIlllIlIIllIIll(-8.0, 2.0, 0.0, f3, f6);
            class_08682.lllIIIllIIIIlllIlIIllIIll();
        }
        GL11.glDisable((int)32826);
        GL11.glPopMatrix();
    }

    protected ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_0369 class_03692) {
        return lllIIIllIIIIlllIlIIllIIll;
    }

    @Override
    public ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_0369)class_15212);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, double d, double d2, double d3, float f, float f2) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0369)class_15212, d, d2, d3, f, f2);
    }
}

