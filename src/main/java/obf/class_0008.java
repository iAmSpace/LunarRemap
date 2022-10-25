package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class class_0008
extends class_0796 {
    private static final ResourceLocation IIIllIllIIlIlIlIlIllllIIl = new ResourceLocation("textures/entity/skeleton/skeleton.png");
    private static final ResourceLocation IllIIIllIIIIlIlIlIllIIlll = new ResourceLocation("textures/entity/skeleton/wither_skeleton.png");

    public class_0008() {
        super(new class_2101(), 0.5f);
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_0630 class_06302, float f) {
        if (class_06302.lIllIIlllIIIlIlIIIlllIlIl() == 1) {
            GL11.glScalef((float)1.2f, (float)1.2f, (float)1.2f);
        }
    }

    @Override
    protected void lIlllIlllIIIIlIIlllIllIII() {
        GL11.glTranslatef((float)0.09375f, (float)0.1875f, (float)0.0f);
    }

    protected ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_0630 class_06302) {
        return class_06302.lIllIIlllIIIlIlIIIlllIlIl() == 1 ? IllIIIllIIIIlIlIlIllIIlll : IIIllIllIIlIlIlIlIllllIIl;
    }

    @Override
    protected ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_0339 class_03392) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_0630)class_03392);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652, float f) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0630)class_19652, f);
    }

    @Override
    public ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_0630)class_15212);
    }
}

