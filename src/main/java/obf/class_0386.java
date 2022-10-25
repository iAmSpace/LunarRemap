package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.util.Random;

import net.minecraft.util.ResourceLocation;
import net.minecraft.client.renderer.OpenGlHelper;
import org.lwjgl.opengl.GL11;

public class class_0386
extends class_0164 {
    private static final ResourceLocation lllIIIllIIIIlllIlIIllIIll = new ResourceLocation("textures/entity/enderman/enderman_eyes.png");
    private static final ResourceLocation lIllllIIlIIIlIllllllIIIll = new ResourceLocation("textures/entity/enderman/enderman.png");
    private class_2127 IIIllIIlIIIIIIlIlIIllIIlI;
    private Random IllIIlllllllIIlIIlIIIIlIl = new Random();

    public class_0386() {
        super(new class_2127(), 0.5f);
        this.IIIllIIlIIIIIIlIlIIllIIlI = (class_2127)this.llIIllIllIlIIlIIllIllllll;
        this.lllIIIllIIIIlllIlIIllIIll(this.IIIllIIlIIIIIIlIlIIllIIlI);
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0793 class_07932, double d, double d2, double d3, float f, float f2) {
        this.IIIllIIlIIIIIIlIlIIllIIlI.IlIIIlIIIIllIIIllIIIIIIll = class_07932.lIllIIlllIIIlIlIIIlllIlIl().lIllllIIlIIIlIllllllIIIll() != class_1855.lllIIIllIIIIlllIlIIllIIll;
        this.IIIllIIlIIIIIIlIlIIllIIlI.IIlllIlIlllIllIIIlllIIlIl = class_07932.lllIIIIlIIllIIIlIllIlllII();
        if (class_07932.lllIIIIlIIllIIIlIllIlllII()) {
            double d4 = 0.02;
            d += this.IllIIlllllllIIlIIlIIIIlIl.nextGaussian() * d4;
            d3 += this.IllIIlllllllIIlIIlIIIIlIl.nextGaussian() * d4;
        }
        super.lllIIIllIIIIlllIlIIllIIll(class_07932, d, d2, d3, f, f2);
    }

    protected ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_0793 class_07932) {
        return lIllllIIlIIIlIllllllIIIll;
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_0793 class_07932, float f) {
        super.lllIlIIlIIIlIlIIIllIlllIl(class_07932, f);
        if (class_07932.lIllIIlllIIIlIlIIIlllIlIl().lIllllIIlIIIlIllllllIIIll() != class_1855.lllIIIllIIIIlllIlIIllIIll) {
            GL11.glEnable((int)32826);
            GL11.glPushMatrix();
            float f2 = 0.5f;
            GL11.glTranslatef((float)0.0f, (float)0.6875f, (float)-0.75f);
            GL11.glRotatef((float)20.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)(-(f2 *= 1.0f)), (float)(-f2), (float)f2);
            int n = class_07932.lllIIIllIIIIlllIlIIllIIll(f);
            int n2 = n % 65536;
            int n3 = n / 65536;
            OpenGlHelper.lllIIIllIIIIlllIlIIllIIll(OpenGlHelper.IlIllllllIIlIIllllIIlIIIl, (float)n2 / 1.0f, (float)n3 / 1.0f);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            this.lllIIIllIIIIlllIlIIllIIll(class_1511.lllIIIllIIIIlllIlIIllIIll);
            this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(class_07932.lIllIIlllIIIlIlIIIlllIlIl(), class_07932.IIlIlIlIIlllIIIlIIIIlIIIl(), 1.0f);
            GL11.glPopMatrix();
            GL11.glDisable((int)32826);
        }
    }

    protected int lllIIIllIIIIlllIlIIllIIll(class_0793 class_07932, int n, float f) {
        if (n != 0) {
            return -1;
        }
        this.lllIIIllIIIIlllIlIIllIIll(lllIIIllIIIIlllIlIIllIIll);
        float f2 = 1.0f;
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3008);
        GL11.glBlendFunc((int)1, (int)1);
        GL11.glDisable((int)2896);
        if (class_07932.lIIlIlIIllIIIlIIlIlIIIlII()) {
            GL11.glDepthMask((boolean)false);
        } else {
            GL11.glDepthMask((boolean)true);
        }
        int n2 = 61680;
        int n3 = n2 % 65536;
        int n4 = n2 / 65536;
        OpenGlHelper.lllIIIllIIIIlllIlIIllIIll(OpenGlHelper.IlIllllllIIlIIllllIIlIIIl, (float)n3 / 1.0f, (float)n4 / 1.0f);
        GL11.glEnable((int)2896);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)f2);
        return 1;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0339 class_03392, double d, double d2, double d3, float f, float f2) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0793)class_03392, d, d2, d3, f, f2);
    }

    @Override
    public int lllIlIIlIIIlIlIIIllIlllIl(class_1965 class_19652, int n, float f) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_0793)class_19652, n, f);
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl(class_1965 class_19652, float f) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0793)class_19652, f);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652, double d, double d2, double d3, float f, float f2) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0793)class_19652, d, d2, d3, f, f2);
    }

    @Override
    public ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_0793)class_15212);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, double d, double d2, double d3, float f, float f2) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0793)class_15212, d, d2, d3, f, f2);
    }
}

