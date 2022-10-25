package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.client.renderer.OpenGlHelper;
import org.lwjgl.opengl.GL11;

public class class_0262
extends class_0323 {
    private class_1521 lllIIIllIIIIlllIlIIllIIll;
    private class_1521 IIIlIllllIIIlllllIllIlIII;
    private int IIIIIllIlIllIlIlIIlIllIIl;
    private int lIIllIlIIlIIlllllIlIIllIl;
    private float lIIlllIIlIlIlIIIlIlllIIll;

    public class_0262(class_1334 class_13342, class_1521 class_15212, class_1521 class_15213, float f) {
        super(class_13342, class_15212.IlIIlllllIIlIlIlllllIllll, class_15212.llIIlIlIlllIIllIlIlllIllI, class_15212.IllIIIIllIIllIllIlllIlIIl, class_15212.IIIIIIIIlIllIIllIIlllIllI, class_15212.IIlIIlIlIlIllIIlIlIIIIlll, class_15212.llIIIlllIlllIlIllIIIIllIl);
        this.lllIIIllIIIIlllIlIIllIIll = class_15212;
        this.IIIlIllllIIIlllllIllIlIII = class_15213;
        this.lIIllIlIIlIIlllllIlIIllIl = 3;
        this.lIIlllIIlIlIlIIIlIlllIIll = f;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0868 class_08682, float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = ((float)this.IIIIIllIlIllIlIlIIlIllIIl + f) / (float)this.lIIllIlIIlIIlllllIlIIllIl;
        f7 *= f7;
        double d = this.lllIIIllIIIIlllIlIIllIIll.IlIIlllllIIlIlIlllllIllll;
        double d2 = this.lllIIIllIIIIlllIlIIllIIll.llIIlIlIlllIIllIlIlllIllI;
        double d3 = this.lllIIIllIIIIlllIlIIllIIll.IllIIIIllIIllIllIlllIlIIl;
        double d4 = this.IIIlIllllIIIlllllIllIlIII.lIIIlIIIlIlllIllIIIlIIIlI + (this.IIIlIllllIIIlllllIllIlIII.IlIIlllllIIlIlIlllllIllll - this.IIIlIllllIIIlllllIllIlIII.lIIIlIIIlIlllIllIIIlIIIlI) * (double)f;
        double d5 = this.IIIlIllllIIIlllllIllIlIII.lIIlIlllIllIlIlllIIIIIIII + (this.IIIlIllllIIIlllllIllIlIII.llIIlIlIlllIIllIlIlllIllI - this.IIIlIllllIIIlllllIllIlIII.lIIlIlllIllIlIlllIIIIIIII) * (double)f + (double)this.lIIlllIIlIlIlIIIlIlllIIll;
        double d6 = this.IIIlIllllIIIlllllIllIlIII.IIlIllIIlllllIIlIIllllIIl + (this.IIIlIllllIIIlllllIllIlIII.IllIIIIllIIllIllIlllIlIIl - this.IIIlIllllIIIlllllIllIlIII.IIlIllIIlllllIIlIIllllIIl) * (double)f;
        double d7 = d + (d4 - d) * (double)f7;
        double d8 = d2 + (d5 - d2) * (double)f7;
        double d9 = d3 + (d6 - d3) * (double)f7;
        int n = this.lllIIIllIIIIlllIlIIllIIll(f);
        int n2 = n % 65536;
        int n3 = n / 65536;
        OpenGlHelper.lllIIIllIIIIlllIlIIllIIll(OpenGlHelper.IlIllllllIIlIIllllIIlIIIl, (float)n2 / 1.0f, (float)n3 / 1.0f);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        class_2114.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, (float)(d7 -= IlIlllIIIIIIlIIllIIllIlll), (float)(d8 -= IlIlIIlIlIllIIlIlIIllIIIl), (float)(d9 -= lllllIlllIIllIlIIlIIIllII), this.lllIIIllIIIIlllIlIIllIIll.IIIIlIllIlIIlIIlIllIlIlll, f);
    }

    @Override
    public void s_() {
        ++this.IIIIIllIlIllIlIlIIlIllIIl;
        if (this.IIIIIllIlIllIlIlIIlIllIIl == this.lIIllIlIIlIIlllllIlIIllIl) {
            this.IIIIlIIlIIIllIIIIllIIIlII();
        }
    }

    @Override
    public int IlIllllllIIlIIllllIIlIIIl() {
        return 3;
    }
}

