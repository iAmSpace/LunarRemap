package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class class_1961
extends class_0164 {
    private static final ResourceLocation lllIIIllIIIIlllIlIIllIIll = new ResourceLocation("textures/entity/squid.png");

    public class_1961(class_1382 class_13822, float f) {
        super(class_13822, f);
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0002 class_00022, double d, double d2, double d3, float f, float f2) {
        super.lllIIIllIIIIlllIlIIllIIll(class_00022, d, d2, d3, f, f2);
    }

    protected ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_0002 class_00022) {
        return lllIIIllIIIIlllIlIIllIIll;
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_0002 class_00022, float f, float f2, float f3) {
        float f4 = class_00022.lllIIIlllIlllIIlIllllIIlI + (class_00022.lIIIlIllllIlllIIIIIllIIIl - class_00022.lllIIIlllIlllIIlIllllIIlI) * f3;
        float f5 = class_00022.lIIlIIIlIlIIlllIlIllIllIl + (class_00022.lIIlIlllIIlllIIlllIIlIlII - class_00022.lIIlIIIlIlIIlllIlIllIllIl) * f3;
        GL11.glTranslatef((float)0.0f, (float)0.5f, (float)0.0f);
        GL11.glRotatef((float)(180.0f - f2), (float)0.0f, (float)1.0f, (float)0.0f);
        GL11.glRotatef((float)f4, (float)1.0f, (float)0.0f, (float)0.0f);
        GL11.glRotatef((float)f5, (float)0.0f, (float)1.0f, (float)0.0f);
        GL11.glTranslatef((float)0.0f, (float)-1.2f, (float)0.0f);
    }

    protected float lllIIIllIIIIlllIlIIllIIll(class_0002 class_00022, float f) {
        return class_00022.IIllllIIlIlIlIlllIIIllIIl + (class_00022.lIIIlllllllIlllIIllllllll - class_00022.IIllllIIlIlIlIlllIIIllIIl) * f;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0339 class_03392, double d, double d2, double d3, float f, float f2) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0002)class_03392, d, d2, d3, f, f2);
    }

    @Override
    protected float IlIllllllIIlIIllllIIlIIIl(class_1965 class_19652, float f) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_0002)class_19652, f);
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652, float f, float f2, float f3) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0002)class_19652, f, f2, f3);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652, double d, double d2, double d3, float f, float f2) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0002)class_19652, d, d2, d3, f, f2);
    }

    @Override
    public ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_0002)class_15212);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, double d, double d2, double d3, float f, float f2) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0002)class_15212, d, d2, d3, f, f2);
    }
}

