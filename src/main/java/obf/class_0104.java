package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class class_0104
extends class_0164 {
    private static final ResourceLocation lllIIIllIIIIlllIlIIllIIll = new ResourceLocation("textures/entity/slime/slime.png");
    private class_1382 lIllllIIlIIIlIllllllIIIll;

    public class_0104(class_1382 class_13822, class_1382 class_13823, float f) {
        super(class_13822, f);
        this.lIllllIIlIIIlIllllllIIIll = class_13823;
    }

    protected int lllIIIllIIIIlllIlIIllIIll(class_2105 class_21052, int n, float f) {
        if (class_21052.lIIlIlIIllIIIlIIlIlIIIlII()) {
            return 0;
        }
        if (n == 0) {
            this.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll);
            GL11.glEnable((int)2977);
            GL11.glEnable((int)3042);
            GL11.glBlendFunc((int)770, (int)771);
            return 1;
        }
        if (n == 1) {
            GL11.glDisable((int)3042);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        }
        return -1;
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_2105 class_21052, float f) {
        float f2 = class_21052.IlIIIlIIIIllIIIllIIIIIIll();
        float f3 = (class_21052.IlIllllllIIlIIllllIIlIIIl + (class_21052.lllIlIIlIIIlIlIIIllIlllIl - class_21052.IlIllllllIIlIIllllIIlIIIl) * f) / (f2 * 0.5f + 1.0f);
        float f4 = 1.0f / (f3 + 1.0f);
        GL11.glScalef((float)(f4 * f2), (float)(1.0f / f4 * f2), (float)(f4 * f2));
    }

    protected ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_2105 class_21052) {
        return lllIIIllIIIIlllIlIIllIIll;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652, float f) {
        this.lllIIIllIIIIlllIlIIllIIll((class_2105)class_19652, f);
    }

    @Override
    public int lllIlIIlIIIlIlIIIllIlllIl(class_1965 class_19652, int n, float f) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_2105)class_19652, n, f);
    }

    @Override
    public ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_2105)class_15212);
    }
}

