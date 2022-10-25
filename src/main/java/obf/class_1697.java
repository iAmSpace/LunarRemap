package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class class_1697
extends class_0164 {
    private static final ResourceLocation lllIIIllIIIIlllIlIIllIIll = new ResourceLocation("textures/entity/slime/magmacube.png");

    public class_1697() {
        super(new class_1945(), 0.25f);
    }

    protected ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_0882 class_08822) {
        return lllIIIllIIIIlllIlIIllIIll;
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_0882 class_08822, float f) {
        int n = class_08822.IlIIIlIIIIllIIIllIIIIIIll();
        float f2 = (class_08822.IlIllllllIIlIIllllIIlIIIl + (class_08822.lllIlIIlIIIlIlIIIllIlllIl - class_08822.IlIllllllIIlIIllllIIlIIIl) * f) / ((float)n * 0.5f + 1.0f);
        float f3 = 1.0f / (f2 + 1.0f);
        float f4 = n;
        GL11.glScalef((float)(f3 * f4), (float)(1.0f / f3 * f4), (float)(f3 * f4));
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652, float f) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0882)class_19652, f);
    }

    @Override
    public ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_0882)class_15212);
    }
}

