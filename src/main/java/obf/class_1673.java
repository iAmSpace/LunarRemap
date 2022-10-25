package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class class_1673
extends class_1522 {
    private static final ResourceLocation lllIIIllIIIIlllIlIIllIIll = new ResourceLocation("textures/gui/container/horse.png");
    private class_0850 lllIlIIlIIIlIlIIIllIlllIl;
    private class_0850 IlIllllllIIlIIllllIIlIIIl;
    private class_1627 lIlllIlllIIIIlIIlllIllIII;
    private float IlIIIIIllllllIIlllIllllll;
    private float lIllllIIlIIIlIllllllIIIll;

    public class_1673(class_0850 class_08502, class_0850 class_08503, class_1627 class_16272) {
        super(new class_1387(class_08502, class_08503, class_16272));
        this.lllIlIIlIIIlIlIIIllIlllIl = class_08502;
        this.IlIllllllIIlIIllllIIlIIIl = class_08503;
        this.lIlllIlllIIIIlIIlllIllIII = class_16272;
        this.IIlllIlIlllIllIIIlllIIlIl = false;
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        this.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl(this.IlIllllllIIlIIllllIIlIIIl.IIlllIlIlllIllIIIlllIIlIl() ? this.IlIllllllIIlIIllllIIlIIIl.IlIIlllllIIlIlIlllllIllll() : class_0616.lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl.IlIIlllllIIlIlIlllllIllll(), new Object[0]), 8, 6, 0x404040);
        this.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl(this.lllIlIIlIIIlIlIIIllIlllIl.IIlllIlIlllIllIIIlllIIlIl() ? this.lllIlIIlIIIlIlIIIllIlllIl.IlIIlllllIIlIlIlllllIllll() : class_0616.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl.IlIIlllllIIlIlIlllllIllll(), new Object[0]), 8, this.lIIIIlIlIIlllllIIllIIlIII - 96 + 2, 0x404040);
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(float f, int n, int n2) {
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        this.lllllIlllIIllIlIIlIIIllII.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(lllIIIllIIIIlllIlIIllIIll);
        int n3 = (this.IlIlIIlllIIlIllIIIlllllIl - this.IllIIIllIIIIlIlIlIllIIlll) / 2;
        int n4 = (this.lIIlIIIIIlIlllIlIIlIlIlll - this.lIIIIlIlIIlllllIIllIIlIII) / 2;
        class_1673.lllIIIllIIIIlllIlIIllIIll(n3, n4, 0, 0, this.IllIIIllIIIIlIlIlIllIIlll, this.lIIIIlIlIIlllllIIllIIlIII);
        if (this.lIlllIlllIIIIlIIlllIllIII.IIllllllIIllIlIllllIIIlll()) {
            class_1673.lllIIIllIIIIlllIlIIllIIll(n3 + 79, n4 + 17, 0, this.lIIIIlIlIIlllllIIllIIlIII, 90, 54);
        }
        if (this.lIlllIlllIIIIlIIlllIllIII.IIIIIIIllllllIIIIllIIIIII()) {
            class_1673.lllIIIllIIIIlllIlIIllIIll(n3 + 7, n4 + 35, 0, this.lIIIIlIlIIlllllIIllIIlIII + 54, 18, 18);
        }
        class_2085.lllIIIllIIIIlllIlIIllIIll(n3 + 51, n4 + 60, 17, (float)(n3 + 51) - this.IlIIIIIllllllIIlllIllllll, (float)(n4 + 75 - 50) - this.lIllllIIlIIIlIllllllIIIll, this.lIlllIlllIIIIlIIlllIllIII);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
        this.IlIIIIIllllllIIlllIllllll = n;
        this.lIllllIIlIIIlIllllllIIIll = n2;
        super.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
    }
}

