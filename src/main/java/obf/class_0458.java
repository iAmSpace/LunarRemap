package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class class_0458
extends class_1603 {
    private static final ResourceLocation lllIIIllIIIIlllIlIIllIIll = new ResourceLocation("textures/entity/endercrystal/endercrystal.png");
    private class_1382 lIllllIIlIIIlIllllllIIIll;

    public class_0458() {
        this.lIlllIlllIIIIlIIlllIllIII = 0.5f;
        this.lIllllIIlIIIlIllllllIIIll = new class_1146(0.0f, true);
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0355 class_03552, double d, double d2, double d3, float f, float f2) {
        float f3 = (float)class_03552.lllIIIllIIIIlllIlIIllIIll + f2;
        GL11.glPushMatrix();
        GL11.glTranslatef((float)((float)d), (float)((float)d2), (float)((float)d3));
        this.lllIIIllIIIIlllIlIIllIIll(lllIIIllIIIIlllIlIIllIIll);
        float f4 = MathHelper.lllIIIllIIIIlllIlIIllIIll(f3 * 0.2f) / 2.0f + 0.5f;
        f4 += f4 * f4;
        this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(class_03552, 0.0f, f3 * 3.0f, f4 * 0.2f, 0.0f, 0.0f, 0.0625f);
        GL11.glPopMatrix();
    }

    protected ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_0355 class_03552) {
        return lllIIIllIIIIlllIlIIllIIll;
    }

    @Override
    public ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_0355)class_15212);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, double d, double d2, double d3, float f, float f2) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0355)class_15212, d, d2, d3, f, f2);
    }
}

