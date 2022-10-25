package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class class_1761
extends class_0323 {
    private static final ResourceLocation lllIIIllIIIIlllIlIIllIIll = new ResourceLocation("textures/entity/explosion.png");
    private int IIIlIllllIIIlllllIllIlIII;
    private int IIIIIllIlIllIlIlIIlIllIIl;
    private class_1682 lIIllIlIIlIIlllllIlIIllIl;
    private float lIIlllIIlIlIlIIIlIlllIIll;

    public class_1761(class_1682 class_16822, class_1334 class_13342, double d, double d2, double d3, double d4, double d5, double d6) {
        super(class_13342, d, d2, d3, 0.0, 0.0, 0.0);
        this.lIIllIlIIlIIlllllIlIIllIl = class_16822;
        this.IIIIIllIlIllIlIlIIlIllIIl = 6 + this.IlllIIlllllllIIllIlIllllI.nextInt(4);
        this.lIIIIlIlIIlllllIIllIIlIII = this.llIIlllIllIllllIIIlIIIIII = this.IlllIIlllllllIIllIlIllllI.nextFloat() * 0.6f + 0.4f;
        this.IllIIIllIIIIlIlIlIllIIlll = this.llIIlllIllIllllIIIlIIIIII;
        this.lIIlllIIlIlIlIIIlIlllIIll = 1.0f - (float)d4 * 0.5f;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0868 class_08682, float f, float f2, float f3, float f4, float f5, float f6) {
        int n = (int)(((float)this.IIIlIllllIIIlllllIllIlIII + f) * 15.0f / (float)this.IIIIIllIlIllIlIlIIlIllIIl);
        if (n <= 15) {
            this.lIIllIlIIlIIlllllIlIIllIl.lllIIIllIIIIlllIlIIllIIll(lllIIIllIIIIlllIlIIllIIll);
            float f7 = (float)(n % 4) / 4.0f;
            float f8 = f7 + 0.24975f;
            float f9 = (float)(n / 4) / 4.0f;
            float f10 = f9 + 0.24975f;
            float f11 = 2.0f * this.lIIlllIIlIlIlIIIlIlllIIll;
            float f12 = (float)(this.llIIlIllIllllIlIIIIlIIlll + (this.IlIIlllllIIlIlIlllllIllll - this.llIIlIllIllllIlIIIIlIIlll) * (double)f - IlIlllIIIIIIlIIllIIllIlll);
            float f13 = (float)(this.llIllllIlIllIIIlIllIIlIlI + (this.llIIlIlIlllIIllIlIlllIllI - this.llIllllIlIllIIIlIllIIlIlI) * (double)f - IlIlIIlIlIllIIlIlIIllIIIl);
            float f14 = (float)(this.lIlllIlllIlIIIIlllIlIlIIl + (this.IllIIIIllIIllIllIlllIlIIl - this.lIlllIlllIlIIIIlllIlIlIIl) * (double)f - lllllIlllIIllIlIIlIIIllII);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glDisable((int)2896);
            class_0624.lllIIIllIIIIlllIlIIllIIll();
            class_08682.lllIlIIlIIIlIlIIIllIlllIl();
            class_08682.lllIIIllIIIIlllIlIIllIIll(this.IllIIIllIIIIlIlIlIllIIlll, this.lIIIIlIlIIlllllIIllIIlIII, this.llIIlllIllIllllIIIlIIIIII, 1.0f);
            class_08682.IlIllllllIIlIIllllIIlIIIl(0.0f, 1.0f, 0.0f);
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(240);
            class_08682.lllIIIllIIIIlllIlIIllIIll(f12 - f2 * f11 - f5 * f11, f13 - f3 * f11, f14 - f4 * f11 - f6 * f11, f8, f10);
            class_08682.lllIIIllIIIIlllIlIIllIIll(f12 - f2 * f11 + f5 * f11, f13 + f3 * f11, f14 - f4 * f11 + f6 * f11, f8, f9);
            class_08682.lllIIIllIIIIlllIlIIllIIll(f12 + f2 * f11 + f5 * f11, f13 + f3 * f11, f14 + f4 * f11 + f6 * f11, f7, f9);
            class_08682.lllIIIllIIIIlllIlIIllIIll(f12 + f2 * f11 - f5 * f11, f13 - f3 * f11, f14 + f4 * f11 - f6 * f11, f7, f10);
            class_08682.lllIIIllIIIIlllIlIIllIIll();
            GL11.glPolygonOffset((float)0.0f, (float)0.0f);
            GL11.glEnable((int)2896);
        }
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(float f) {
        return 61680;
    }

    @Override
    public void s_() {
        this.llIIlIllIllllIlIIIIlIIlll = this.IlIIlllllIIlIlIlllllIllll;
        this.llIllllIlIllIIIlIllIIlIlI = this.llIIlIlIlllIIllIlIlllIllI;
        this.lIlllIlllIlIIIIlllIlIlIIl = this.IllIIIIllIIllIllIlllIlIIl;
        ++this.IIIlIllllIIIlllllIllIlIII;
        if (this.IIIlIllllIIIlllllIllIlIII == this.IIIIIllIlIllIlIlIIlIllIIl) {
            this.IIIIlIIlIIIllIIIIllIIIlII();
        }
    }

    @Override
    public int IlIllllllIIlIIllllIIlIIIl() {
        return 3;
    }
}

