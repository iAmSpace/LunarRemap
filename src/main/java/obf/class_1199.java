package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.util.ResourceLocation;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import org.lwjgl.opengl.GL11;

public class class_1199
extends class_0164 {
    private static final ResourceLocation lllIIIllIIIIlllIlIIllIIll = new ResourceLocation("textures/entity/cow/mooshroom.png");

    public class_1199(class_1382 class_13822, float f) {
        super(class_13822, f);
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1584 class_15842, double d, double d2, double d3, float f, float f2) {
        super.lllIIIllIIIIlllIlIIllIIll(class_15842, d, d2, d3, f, f2);
    }

    protected ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_1584 class_15842) {
        return lllIIIllIIIIlllIlIIllIIll;
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_1584 class_15842, float f) {
        super.lllIlIIlIIIlIlIIIllIlllIl(class_15842, f);
        if (!class_15842.g_()) {
            this.lllIIIllIIIIlllIlIIllIIll(class_1511.lllIIIllIIIIlllIlIIllIIll);
            GL11.glEnable((int)2884);
            GL11.glPushMatrix();
            GL11.glScalef((float)1.0f, (float)-1.0f, (float)1.0f);
            GL11.glTranslatef((float)0.2f, (float)0.4f, (float)0.5f);
            GL11.glRotatef((float)42.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll((Block) Blocks.llIIlIIllIIllIlIIllIIllII, 0, 1.0f);
            GL11.glTranslatef((float)0.1f, (float)0.0f, (float)-0.6f);
            GL11.glRotatef((float)42.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll((Block) Blocks.llIIlIIllIIllIlIIllIIllII, 0, 1.0f);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            ((class_0846)this.llIIllIllIlIIlIIllIllllll).IIIllIIlIIIIIIlIlIIllIIlI.IlIllllllIIlIIllllIIlIIIl(0.0625f);
            GL11.glScalef((float)1.0f, (float)-1.0f, (float)1.0f);
            GL11.glTranslatef((float)0.0f, (float)0.75f, (float)-0.2f);
            GL11.glRotatef((float)12.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll((Block) Blocks.llIIlIIllIIllIlIIllIIllII, 0, 1.0f);
            GL11.glPopMatrix();
            GL11.glDisable((int)2884);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0339 class_03392, double d, double d2, double d3, float f, float f2) {
        this.lllIIIllIIIIlllIlIIllIIll((class_1584)class_03392, d, d2, d3, f, f2);
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl(class_1965 class_19652, float f) {
        this.lllIIIllIIIIlllIlIIllIIll((class_1584)class_19652, f);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652, double d, double d2, double d3, float f, float f2) {
        this.lllIIIllIIIIlllIlIIllIIll((class_1584)class_19652, d, d2, d3, f, f2);
    }

    @Override
    public ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_1584)class_15212);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, double d, double d2, double d3, float f, float f2) {
        this.lllIIIllIIIIlllIlIIllIIll((class_1584)class_15212, d, d2, d3, f, f2);
    }
}

