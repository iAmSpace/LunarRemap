package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.util.ResourceLocation;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.client.renderer.OpenGlHelper;
import org.lwjgl.opengl.GL11;

public class class_0331
extends class_0164 {
    private static final ResourceLocation lllIIIllIIIIlllIlIIllIIll = new ResourceLocation("textures/entity/iron_golem.png");
    private final class_0949 lIllllIIlIIIlIllllllIIIll;

    public class_0331() {
        super(new class_0949(), 0.5f);
        this.lIllllIIlIIIlIllllllIIIll = (class_0949)this.llIIllIllIlIIlIIllIllllll;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0991 class_09912, double d, double d2, double d3, float f, float f2) {
        super.lllIIIllIIIIlllIlIIllIIll(class_09912, d, d2, d3, f, f2);
    }

    protected ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_0991 class_09912) {
        return lllIIIllIIIIlllIlIIllIIll;
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_0991 class_09912, float f, float f2, float f3) {
        super.lllIIIllIIIIlllIlIIllIIll((class_1965)class_09912, f, f2, f3);
        if ((double)class_09912.IIIIIIlIIIIIIIIIIlIlIlIlI >= 0.01) {
            float f4 = 13.0f;
            float f5 = class_09912.IllIlllIIIlllllIllIIlIlIl - class_09912.IIIIIIlIIIIIIIIIIlIlIlIlI * (1.0f - f3) + 6.0f;
            float f6 = (Math.abs(f5 % f4 - f4 * 0.5f) - f4 * 0.25f) / (f4 * 0.25f);
            GL11.glRotatef((float)(6.5f * f6), (float)0.0f, (float)0.0f, (float)1.0f);
        }
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_0991 class_09912, float f) {
        super.lllIlIIlIIIlIlIIIllIlllIl(class_09912, f);
        if (class_09912.lIllIIlllIIIlIlIIIlllIlIl() != 0) {
            GL11.glEnable((int)32826);
            GL11.glPushMatrix();
            GL11.glRotatef((float)(5.0f + 180.0f * this.lIllllIIlIIIlIllllllIIIll.IIIllIllIIlIlIlIlIllllIIl.lIllllIIlIIIlIllllllIIIll / (float)Math.PI), (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glTranslatef((float)-0.6875f, (float)1.25f, (float)-0.9375f);
            GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            float f2 = 0.8f;
            GL11.glScalef((float)f2, (float)(-f2), (float)f2);
            int n = class_09912.lllIIIllIIIIlllIlIIllIIll(f);
            int n2 = n % 65536;
            int n3 = n / 65536;
            OpenGlHelper.lllIIIllIIIIlllIlIIllIIll(OpenGlHelper.IlIllllllIIlIIllllIIlIIIl, (float)n2 / 1.0f, (float)n3 / 1.0f);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            this.lllIIIllIIIIlllIlIIllIIll(class_1511.lllIIIllIIIIlllIlIIllIIll);
            this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll((Block) Blocks.IIIIlIIlIIIllIIIIllIIIlII, 0, 1.0f);
            GL11.glPopMatrix();
            GL11.glDisable((int)32826);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0339 class_03392, double d, double d2, double d3, float f, float f2) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0991)class_03392, d, d2, d3, f, f2);
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl(class_1965 class_19652, float f) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0991)class_19652, f);
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652, float f, float f2, float f3) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0991)class_19652, f, f2, f3);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652, double d, double d2, double d3, float f, float f2) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0991)class_19652, d, d2, d3, f, f2);
    }

    @Override
    public ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_0991)class_15212);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, double d, double d2, double d3, float f, float f2) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0991)class_15212, d, d2, d3, f, f2);
    }
}

