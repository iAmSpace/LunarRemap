package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.MathHelper;
import net.minecraft.client.renderer.OpenGlHelper;
import org.lwjgl.opengl.GL11;

public class class_0675
extends class_1603 {
    private static final ResourceLocation lllIIIllIIIIlllIlIIllIIll = new ResourceLocation("textures/entity/experience_orb.png");

    public class_0675() {
        this.lIlllIlllIIIIlIIlllIllIII = 0.15f;
        this.IlIIIIIllllllIIlllIllllll = 0.75f;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1138 class_11382, double d, double d2, double d3, float f, float f2) {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)((float)d), (float)((float)d2), (float)((float)d3));
        this.lllIlIIlIIIlIlIIIllIlllIl(class_11382);
        int n = class_11382.lIlllIlllIIIIlIIlllIllIII();
        float f3 = (float)(n % 4 * 16 + 0) / 64.0f;
        float f4 = (float)(n % 4 * 16 + 16) / 64.0f;
        float f5 = (float)(n / 4 * 16 + 0) / 64.0f;
        float f6 = (float)(n / 4 * 16 + 16) / 64.0f;
        float f7 = 1.0f;
        float f8 = 0.5f;
        float f9 = 0.25f;
        int n2 = class_11382.lllIIIllIIIIlllIlIIllIIll(f2);
        int n3 = n2 % 65536;
        int n4 = n2 / 65536;
        OpenGlHelper.lllIIIllIIIIlllIlIIllIIll(OpenGlHelper.IlIllllllIIlIIllllIIlIIIl, (float)n3 / 1.0f, (float)n4 / 1.0f);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        float f10 = 255.0f;
        float f11 = ((float)class_11382.lllIIIllIIIIlllIlIIllIIll + f2) / 2.0f;
        n4 = (int)((MathHelper.lllIIIllIIIIlllIlIIllIIll(f11 + 0.0f) + 1.0f) * 0.5f * f10);
        int n5 = (int)f10;
        int n6 = (int)((MathHelper.lllIIIllIIIIlllIlIIllIIll(f11 + 4.1887903f) + 1.0f) * 0.1f * f10);
        int n7 = n4 << 16 | n5 << 8 | n6;
        GL11.glRotatef((float)(180.0f - this.lllIlIIlIIIlIlIIIllIlllIl.IllIIIllIIIIlIlIlIllIIlll), (float)0.0f, (float)1.0f, (float)0.0f);
        GL11.glRotatef((float)(-this.lllIlIIlIIIlIlIIIllIlllIl.lIIIIlIlIIlllllIIllIIlIII), (float)1.0f, (float)0.0f, (float)0.0f);
        float f12 = 0.3f;
        GL11.glScalef((float)f12, (float)f12, (float)f12);
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        class_08682.lllIlIIlIIIlIlIIIllIlllIl();
        class_08682.lllIIIllIIIIlllIlIIllIIll(n7, 128);
        class_08682.IlIllllllIIlIIllllIIlIIIl(0.0f, 1.0f, 0.0f);
        class_08682.lllIIIllIIIIlllIlIIllIIll(0.0f - f8, 0.0f - f9, 0.0, f3, f6);
        class_08682.lllIIIllIIIIlllIlIIllIIll(f7 - f8, 0.0f - f9, 0.0, f4, f6);
        class_08682.lllIIIllIIIIlllIlIIllIIll(f7 - f8, 1.0f - f9, 0.0, f4, f5);
        class_08682.lllIIIllIIIIlllIlIIllIIll(0.0f - f8, 1.0f - f9, 0.0, f3, f5);
        class_08682.lllIIIllIIIIlllIlIIllIIll();
        GL11.glDisable((int)3042);
        GL11.glDisable((int)32826);
        GL11.glPopMatrix();
    }

    protected ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_1138 class_11382) {
        return lllIIIllIIIIlllIlIIllIIll;
    }

    @Override
    public ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_1138)class_15212);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, double d, double d2, double d3, float f, float f2) {
        this.lllIIIllIIIIlllIlIIllIIll((class_1138)class_15212, d, d2, d3, f, f2);
    }
}

