package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class class_0439
extends class_1603 {
    private static final ResourceLocation lllIIIllIIIIlllIlIIllIIll = new ResourceLocation("textures/entity/lead_knot.png");
    private class_1824 lIllllIIlIIIlIllllllIIIll = new class_1824();

    public void lllIIIllIIIIlllIlIIllIIll(class_1215 class_12152, double d, double d2, double d3, float f, float f2) {
        GL11.glPushMatrix();
        GL11.glDisable((int)2884);
        GL11.glTranslatef((float)((float)d), (float)((float)d2), (float)((float)d3));
        float f3 = 0.0625f;
        GL11.glEnable((int)32826);
        GL11.glScalef((float)-1.0f, (float)-1.0f, (float)1.0f);
        GL11.glEnable((int)3008);
        this.lllIlIIlIIIlIlIIIllIlllIl(class_12152);
        this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(class_12152, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f3);
        GL11.glPopMatrix();
    }

    protected ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_1215 class_12152) {
        return lllIIIllIIIIlllIlIIllIIll;
    }

    @Override
    public ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_1215)class_15212);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, double d, double d2, double d3, float f, float f2) {
        this.lllIIIllIIIIlllIlIIllIIll((class_1215)class_15212, d, d2, d3, f, f2);
    }
}

