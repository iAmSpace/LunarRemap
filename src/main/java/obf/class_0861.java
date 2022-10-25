package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class class_0861
extends class_1603 {
    private static final ResourceLocation lIllllIIlIIIlIllllllIIIll = new ResourceLocation("textures/entity/boat.png");
    protected class_1382 lllIIIllIIIIlllIlIIllIIll;

    public class_0861() {
        this.lIlllIlllIIIIlIIlllIllIII = 0.5f;
        this.lllIIIllIIIIlllIlIIllIIll = new class_0878();
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_2263 class_22632, double d, double d2, double d3, float f, float f2) {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)((float)d), (float)((float)d2), (float)((float)d3));
        GL11.glRotatef((float)(180.0f - f), (float)0.0f, (float)1.0f, (float)0.0f);
        float f3 = (float)class_22632.lIlllIlllIIIIlIIlllIllIII() - f2;
        float f4 = class_22632.IlIllllllIIlIIllllIIlIIIl() - f2;
        if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        if (f3 > 0.0f) {
            GL11.glRotatef((float)(MathHelper.lllIIIllIIIIlllIlIIllIIll(f3) * f3 * f4 / 10.0f * (float)class_22632.IlIIIIIllllllIIlllIllllll()), (float)1.0f, (float)0.0f, (float)0.0f);
        }
        float f5 = 0.75f;
        GL11.glScalef((float)f5, (float)f5, (float)f5);
        GL11.glScalef((float)(1.0f / f5), (float)(1.0f / f5), (float)(1.0f / f5));
        this.lllIlIIlIIIlIlIIIllIlllIl(class_22632);
        GL11.glScalef((float)-1.0f, (float)-1.0f, (float)1.0f);
        this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(class_22632, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, 0.0625f);
        GL11.glPopMatrix();
    }

    protected ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_2263 class_22632) {
        return lIllllIIlIIIlIllllllIIIll;
    }

    @Override
    public ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_2263)class_15212);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, double d, double d2, double d3, float f, float f2) {
        this.lllIIIllIIIIlllIlIIllIIll((class_2263)class_15212, d, d2, d3, f, f2);
    }
}

