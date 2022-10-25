package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.init.Blocks;
import org.lwjgl.opengl.GL11;

public class class_1107
extends class_1603 {
    private class_1333 lllIIIllIIIIlllIlIIllIIll = new class_1333();

    public class_1107() {
        this.lIlllIlllIIIIlIIlllIllIII = 0.5f;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0034 class_00342, double d, double d2, double d3, float f, float f2) {
        float f3;
        GL11.glPushMatrix();
        GL11.glTranslatef((float)((float)d), (float)((float)d2), (float)((float)d3));
        if ((float)class_00342.lllIIIllIIIIlllIlIIllIIll - f2 + 1.0f < 10.0f) {
            f3 = 1.0f - ((float)class_00342.lllIIIllIIIIlllIlIIllIIll - f2 + 1.0f) / 10.0f;
            if (f3 < 0.0f) {
                f3 = 0.0f;
            }
            if (f3 > 1.0f) {
                f3 = 1.0f;
            }
            f3 *= f3;
            f3 *= f3;
            float f4 = 1.0f + f3 * 0.3f;
            GL11.glScalef((float)f4, (float)f4, (float)f4);
        }
        f3 = (1.0f - ((float)class_00342.lllIIIllIIIIlllIlIIllIIll - f2 + 1.0f) / 100.0f) * 0.8f;
        this.lllIlIIlIIIlIlIIIllIlllIl(class_00342);
        this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(Blocks.tnt, 0, class_00342.lllIlIIlIIIlIlIIIllIlllIl(f2));
        if (class_00342.lllIIIllIIIIlllIlIIllIIll / 5 % 2 == 0) {
            GL11.glDisable((int)3553);
            GL11.glDisable((int)2896);
            GL11.glEnable((int)3042);
            GL11.glBlendFunc((int)770, (int)772);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)f3);
            this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(Blocks.tnt, 0, 1.0f);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glDisable((int)3042);
            GL11.glEnable((int)2896);
            GL11.glEnable((int)3553);
        }
        GL11.glPopMatrix();
    }

    protected ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_0034 class_00342) {
        return class_1511.lllIIIllIIIIlllIlIIllIIll;
    }

    @Override
    public ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_0034)class_15212);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, double d, double d2, double d3, float f, float f2) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0034)class_15212, d, d2, d3, f, f2);
    }
}

