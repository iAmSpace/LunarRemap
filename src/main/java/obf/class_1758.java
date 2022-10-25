package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class class_1758
extends class_0164 {
    private static final ResourceLocation lllIIIllIIIIlllIlIIllIIll = new ResourceLocation("textures/entity/ghast/ghast.png");
    private static final ResourceLocation lIllllIIlIIIlIllllllIIIll = new ResourceLocation("textures/entity/ghast/ghast_shooting.png");

    public class_1758() {
        super(new class_0967(), 0.5f);
    }

    protected ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_1413 class_14132) {
        return class_14132.IlIIIIIllllllIIlllIllllll() ? lIllllIIlIIIlIllllllIIIll : lllIIIllIIIIlllIlIIllIIll;
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_1413 class_14132, float f) {
        float f2 = ((float)class_14132.IlIIIIIllllllIIlllIllllll + (float)(class_14132.lIIIlIllllIlllIIIIIllIIIl - class_14132.IlIIIIIllllllIIlllIllllll) * f) / 20.0f;
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        f2 = 1.0f / (f2 * f2 * f2 * f2 * f2 * 2.0f + 1.0f);
        float f3 = (8.0f + f2) / 2.0f;
        float f4 = (8.0f + 1.0f / f2) / 2.0f;
        GL11.glScalef((float)f4, (float)f3, (float)f4);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652, float f) {
        this.lllIIIllIIIIlllIlIIllIIll((class_1413)class_19652, f);
    }

    @Override
    public ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_1413)class_15212);
    }
}

