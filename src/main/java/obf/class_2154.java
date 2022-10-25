package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.block.Block;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class class_2154
extends class_1603 {
    private static final ResourceLocation IIIllIIlIIIIIIlIlIIllIIlI = new ResourceLocation("textures/entity/minecart.png");
    protected class_1382 lllIIIllIIIIlllIlIIllIIll = new class_0230();
    protected final class_1333 lIllllIIlIIIlIllllllIIIll;

    public class_2154() {
        this.lIlllIlllIIIIlIIlllIllIII = 0.5f;
        this.lIllllIIlIIIlIllllllIIIll = new class_1333();
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1860 class_18602, double d, double d2, double d3, float f, float f2) {
        GL11.glPushMatrix();
        this.lllIlIIlIIIlIlIIIllIlllIl(class_18602);
        long l = (long)class_18602.llllllIlIllllIlIlIlIIIIlI() * 493286711L;
        l = l * l * 4392167121L + l * 98761L;
        float f3 = (((float)(l >> 16 & 7L) + 0.5f) / 8.0f - 0.5f) * 0.004f;
        float f4 = (((float)(l >> 20 & 7L) + 0.5f) / 8.0f - 0.5f) * 0.004f;
        float f5 = (((float)(l >> 24 & 7L) + 0.5f) / 8.0f - 0.5f) * 0.004f;
        GL11.glTranslatef((float)f3, (float)f4, (float)f5);
        double d4 = class_18602.lIIIlIIIlIlllIllIIIlIIIlI + (class_18602.IlIIlllllIIlIlIlllllIllll - class_18602.lIIIlIIIlIlllIllIIIlIIIlI) * (double)f2;
        double d5 = class_18602.lIIlIlllIllIlIlllIIIIIIII + (class_18602.llIIlIlIlllIIllIlIlllIllI - class_18602.lIIlIlllIllIlIlllIIIIIIII) * (double)f2;
        double d6 = class_18602.IIlIllIIlllllIIlIIllllIIl + (class_18602.IllIIIIllIIllIllIlllIlIIl - class_18602.IIlIllIIlllllIIlIIllllIIl) * (double)f2;
        double d7 = 0.3f;
        class_0864 class_08642 = class_18602.IllIIIllIIIIlIlIlIllIIlll(d4, d5, d6);
        float f6 = class_18602.llIIIIllIIIIIIIlIIIlIIIIl + (class_18602.IlIlIIlllIllllllllIIIlIlI - class_18602.llIIIIllIIIIIIIlIIIlIIIIl) * f2;
        if (class_08642 != null) {
            class_0864 class_08643 = class_18602.lllIIIllIIIIlllIlIIllIIll(d4, d5, d6, d7);
            class_0864 class_08644 = class_18602.lllIIIllIIIIlllIlIIllIIll(d4, d5, d6, -d7);
            if (class_08643 == null) {
                class_08643 = class_08642;
            }
            if (class_08644 == null) {
                class_08644 = class_08642;
            }
            d += class_08642.lllIIIllIIIIlllIlIIllIIll - d4;
            d2 += (class_08643.lllIlIIlIIIlIlIIIllIlllIl + class_08644.lllIlIIlIIIlIlIIIllIlllIl) / 2.0 - d5;
            d3 += class_08642.IlIllllllIIlIIllllIIlIIIl - d6;
            class_0864 class_08645 = class_08644.IlIllllllIIlIIllllIIlIIIl(-class_08643.lllIIIllIIIIlllIlIIllIIll, -class_08643.lllIlIIlIIIlIlIIIllIlllIl, -class_08643.IlIllllllIIlIIllllIIlIIIl);
            if (class_08645.lllIlIIlIIIlIlIIIllIlllIl() != 0.0) {
                class_08645 = class_08645.lllIIIllIIIIlllIlIIllIIll();
                f = (float)(Math.atan2(class_08645.IlIllllllIIlIIllllIIlIIIl, class_08645.lllIIIllIIIIlllIlIIllIIll) * 180.0 / Math.PI);
                f6 = (float)(Math.atan(class_08645.lllIlIIlIIIlIlIIIllIlllIl) * 73.0);
            }
        }
        GL11.glTranslatef((float)((float)d), (float)((float)d2), (float)((float)d3));
        GL11.glRotatef((float)(180.0f - f), (float)0.0f, (float)1.0f, (float)0.0f);
        GL11.glRotatef((float)(-f6), (float)0.0f, (float)0.0f, (float)1.0f);
        float f7 = (float)class_18602.lllIIlIIIllllllIIIIlIlIlI() - f2;
        float f8 = class_18602.IllIIlllllllIIlIIlIIIIlIl() - f2;
        if (f8 < 0.0f) {
            f8 = 0.0f;
        }
        if (f7 > 0.0f) {
            GL11.glRotatef((float)(MathHelper.lllIIIllIIIIlllIlIIllIIll(f7) * f7 * f8 / 10.0f * (float)class_18602.IlIlllIIIIIIlIIllIIllIlll()), (float)1.0f, (float)0.0f, (float)0.0f);
        }
        int n = class_18602.lIIlIIIIIlIlllIlIIlIlIlll();
        Block class_05492 = class_18602.IlIlIIlIlIllIIlIlIIllIIIl();
        int n2 = class_18602.lllllIlllIIllIlIIlIIIllII();
        if (class_05492.lIIIIlIlIIlllllIIllIIlIII() != -1) {
            GL11.glPushMatrix();
            this.lllIIIllIIIIlllIlIIllIIll(class_1511.lllIIIllIIIIlllIlIIllIIll);
            float f9 = 0.75f;
            GL11.glScalef((float)f9, (float)f9, (float)f9);
            GL11.glTranslatef((float)0.0f, (float)((float)n / 16.0f), (float)0.0f);
            this.lllIIIllIIIIlllIlIIllIIll(class_18602, f2, class_05492, n2);
            GL11.glPopMatrix();
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            this.lllIlIIlIIIlIlIIIllIlllIl(class_18602);
        }
        GL11.glScalef((float)-1.0f, (float)-1.0f, (float)1.0f);
        this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(class_18602, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, 0.0625f);
        GL11.glPopMatrix();
    }

    protected ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_1860 class_18602) {
        return IIIllIIlIIIIIIlIlIIllIIlI;
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_1860 class_18602, float f, Block class_05492, int n) {
        float f2 = class_18602.lllIlIIlIIIlIlIIIllIlllIl(f);
        GL11.glPushMatrix();
        this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(class_05492, n, f2);
        GL11.glPopMatrix();
    }

    @Override
    public ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_1860)class_15212);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, double d, double d2, double d3, float f, float f2) {
        this.lllIIIllIIIIlllIlIIllIIll((class_1860)class_15212, d, d2, d3, f, f2);
    }
}

