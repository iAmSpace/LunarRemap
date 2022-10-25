package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class class_1508
extends class_0164 {
    private static final ResourceLocation lllIIIllIIIIlllIlIIllIIll = new ResourceLocation("textures/entity/cat/black.png");
    private static final ResourceLocation lIllllIIlIIIlIllllllIIIll = new ResourceLocation("textures/entity/cat/ocelot.png");
    private static final ResourceLocation IIIllIIlIIIIIIlIlIIllIIlI = new ResourceLocation("textures/entity/cat/red.png");
    private static final ResourceLocation IllIIlllllllIIlIIlIIIIlIl = new ResourceLocation("textures/entity/cat/siamese.png");

    public class_1508(class_1382 class_13822, float f) {
        super(class_13822, f);
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0673 class_06732, double d, double d2, double d3, float f, float f2) {
        super.lllIIIllIIIIlllIlIIllIIll(class_06732, d, d2, d3, f, f2);
    }

    protected ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_0673 class_06732) {
        switch (class_06732.IIlIlIlIIlllIIIlIIIIlIIIl()) {
            default: {
                return lIllllIIlIIIlIllllllIIIll;
            }
            case 1: {
                return lllIIIllIIIIlllIlIIllIIll;
            }
            case 2: {
                return IIIllIIlIIIIIIlIlIIllIIlI;
            }
            case 3: 
        }
        return IllIIlllllllIIlIIlIIIIlIl;
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_0673 class_06732, float f) {
        super.lllIIIllIIIIlllIlIIllIIll(class_06732, f);
        if (class_06732.lllIIIIlIIllIIIlIllIlllII()) {
            GL11.glScalef((float)0.8f, (float)0.8f, (float)0.8f);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0339 class_03392, double d, double d2, double d3, float f, float f2) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0673)class_03392, d, d2, d3, f, f2);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652, float f) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0673)class_19652, f);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652, double d, double d2, double d3, float f, float f2) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0673)class_19652, d, d2, d3, f, f2);
    }

    @Override
    public ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_0673)class_15212);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, double d, double d2, double d3, float f, float f2) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0673)class_15212, d, d2, d3, f, f2);
    }
}

