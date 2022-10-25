package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class class_1658
extends class_0164 {
    private static final ResourceLocation lllIIIllIIIIlllIlIIllIIll = new ResourceLocation("textures/entity/zombie/zombie.png");
    private float lIllllIIlIIIlIllllllIIIll;

    public class_1658(class_1382 class_13822, float f, float f2) {
        super(class_13822, f * f2);
        this.lIllllIIlIIIlIllllllIIIll = f2;
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_0405 class_04052, float f) {
        GL11.glScalef((float)this.lIllllIIlIIIlIllllllIIIll, (float)this.lIllllIIlIIIlIllllllIIIll, (float)this.lIllllIIlIIIlIllllllIIIll);
    }

    protected ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_0405 class_04052) {
        return lllIIIllIIIIlllIlIIllIIll;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652, float f) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0405)class_19652, f);
    }

    @Override
    public ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_0405)class_15212);
    }
}

