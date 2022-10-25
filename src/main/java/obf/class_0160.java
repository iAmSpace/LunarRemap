package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class class_0160
extends class_0323 {
    private static final ResourceLocation lllIIIllIIIIlllIlIIllIIll = new ResourceLocation("textures/particle/footprint.png");
    private int IIIlIllllIIIlllllIllIlIII;
    private int IIIIIllIlIllIlIlIIlIllIIl;
    private class_1682 lIIllIlIIlIIlllllIlIIllIl;

    public class_0160(class_1682 class_16822, class_1334 class_13342, double d, double d2, double d3) {
        super(class_13342, d, d2, d3, 0.0, 0.0, 0.0);
        this.lIIllIlIIlIIlllllIlIIllIl = class_16822;
        this.llIIIlllIlllIlIllIIIIllIl = 0.0;
        this.IIlIIlIlIlIllIIlIlIIIIlll = 0.0;
        this.IIIIIIIIlIllIIllIIlllIllI = 0.0;
        this.IIIIIllIlIllIlIlIIlIllIIl = 200;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0868 class_08682, float f, float f2, float f3, float f4, float f5, float f6) {
        float f7;
        float f8 = ((float)this.IIIlIllllIIIlllllIllIlIII + f) / (float)this.IIIIIllIlIllIlIlIIlIllIIl;
        if ((f7 = 2.0f - (f8 *= f8) * 2.0f) > 1.0f) {
            f7 = 1.0f;
        }
        GL11.glDisable((int)2896);
        float f9 = 0.125f;
        float f10 = (float)(this.IlIIlllllIIlIlIlllllIllll - IlIlllIIIIIIlIIllIIllIlll);
        float f11 = (float)(this.llIIlIlIlllIIllIlIlllIllI - IlIlIIlIlIllIIlIlIIllIIIl);
        float f12 = (float)(this.IllIIIIllIIllIllIlllIlIIl - lllllIlllIIllIlIIlIIIllII);
        float f13 = this.lIlIllIIlIIlIIlIIlIIlIIll.llIIlllIllIllllIIIlIIIIII(MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll), MathHelper.IlIllllllIIlIIllllIIlIIIl(this.llIIlIlIlllIIllIlIlllIllI), MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IllIIIIllIIllIllIlllIlIIl));
        this.lIIllIlIIlIIlllllIlIIllIl.lllIIIllIIIIlllIlIIllIIll(lllIIIllIIIIlllIlIIllIIll);
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        class_08682.lllIlIIlIIIlIlIIIllIlllIl();
        class_08682.lllIIIllIIIIlllIlIIllIIll(f13, f13, f13, f7 *= 0.2f);
        class_08682.lllIIIllIIIIlllIlIIllIIll(f10 - f9, f11, f12 + f9, 0.0, 1.0);
        class_08682.lllIIIllIIIIlllIlIIllIIll(f10 + f9, f11, f12 + f9, 1.0, 1.0);
        class_08682.lllIIIllIIIIlllIlIIllIIll(f10 + f9, f11, f12 - f9, 1.0, 0.0);
        class_08682.lllIIIllIIIIlllIlIIllIIll(f10 - f9, f11, f12 - f9, 0.0, 0.0);
        class_08682.lllIIIllIIIIlllIlIIllIIll();
        GL11.glDisable((int)3042);
        GL11.glEnable((int)2896);
    }

    @Override
    public void s_() {
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

