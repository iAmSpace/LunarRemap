package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class class_1846
extends class_1603 {
    private static final ResourceLocation lllIIIllIIIIlllIlIIllIIll = new ResourceLocation("textures/entity/wither/wither_invulnerable.png");
    private static final ResourceLocation lIllllIIlIIIlIllllllIIIll = new ResourceLocation("textures/entity/wither/wither.png");
    private final class_1777 IIIllIIlIIIIIIlIlIIllIIlI = new class_1777();

    private float lllIIIllIIIIlllIlIIllIIll(float f, float f2, float f3) {
        float f4;
        for (f4 = f2 - f; f4 < -180.0f; f4 += 360.0f) {
        }
        while (f4 >= 180.0f) {
            f4 -= 360.0f;
        }
        return f + f3 * f4;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_2166 class_21662, double d, double d2, double d3, float f, float f2) {
        GL11.glPushMatrix();
        GL11.glDisable((int)2884);
        float f3 = this.lllIIIllIIIIlllIlIIllIIll(class_21662.llllIIIIlIIIlIIIIIIlIllll, class_21662.IIIIlIllIlIIlIIlIllIlIlll, f2);
        float f4 = class_21662.llIIIIllIIIIIIIlIIIlIIIIl + (class_21662.IlIlIIlllIllllllllIIIlIlI - class_21662.llIIIIllIIIIIIIlIIIlIIIIl) * f2;
        GL11.glTranslatef((float)((float)d), (float)((float)d2), (float)((float)d3));
        float f5 = 0.0625f;
        GL11.glEnable((int)32826);
        GL11.glScalef((float)-1.0f, (float)-1.0f, (float)1.0f);
        GL11.glEnable((int)3008);
        this.lllIlIIlIIIlIlIIIllIlllIl(class_21662);
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(class_21662, 0.0f, 0.0f, 0.0f, f3, f4, f5);
        GL11.glPopMatrix();
    }

    protected ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_2166 class_21662) {
        return class_21662.lIlllIlllIIIIlIIlllIllIII() ? lllIIIllIIIIlllIlIIllIIll : lIllllIIlIIIlIllllllIIIll;
    }

    @Override
    public ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_2166)class_15212);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, double d, double d2, double d3, float f, float f2) {
        this.lllIIIllIIIIlllIlIIllIIll((class_2166)class_15212, d, d2, d3, f, f2);
    }
}

