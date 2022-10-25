package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class class_0840
extends class_0164 {
    private static final ResourceLocation lllIIIllIIIIlllIlIIllIIll = new ResourceLocation("textures/entity/wither/wither_invulnerable.png");
    private static final ResourceLocation lIllllIIlIIIlIllllllIIIll = new ResourceLocation("textures/entity/wither/wither.png");
    private int IIIllIIlIIIIIIlIlIIllIIlI;

    public class_0840() {
        super(new class_2140(), 1.0f);
        this.IIIllIIlIIIIIIlIlIIllIIlI = ((class_2140)this.llIIllIllIlIIlIIllIllllll).lllIIIllIIIIlllIlIIllIIll();
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0590 class_05902, double d, double d2, double d3, float f, float f2) {
        class_0178.lllIIIllIIIIlllIlIIllIIll(class_05902, true);
        int n = ((class_2140)this.llIIllIllIlIIlIIllIllllll).lllIIIllIIIIlllIlIIllIIll();
        if (n != this.IIIllIIlIIIIIIlIlIIllIIlI) {
            this.IIIllIIlIIIIIIlIlIIllIIlI = n;
            this.llIIllIllIlIIlIIllIllllll = new class_2140();
        }
        super.lllIIIllIIIIlllIlIIllIIll(class_05902, d, d2, d3, f, f2);
    }

    protected ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_0590 class_05902) {
        int n = class_05902.IIlIlIIIIlIlllIIlIIlIIIII();
        return n > 0 && (n > 80 || n / 5 % 2 != 1) ? lllIIIllIIIIlllIlIIllIIll : lIllllIIlIIIlIllllllIIIll;
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_0590 class_05902, float f) {
        int n = class_05902.IIlIlIIIIlIlllIIlIIlIIIII();
        if (n > 0) {
            float f2 = 2.0f - ((float)n - f) / 220.0f * 0.5f;
            GL11.glScalef((float)f2, (float)f2, (float)f2);
        } else {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
        }
    }

    protected int lllIIIllIIIIlllIlIIllIIll(class_0590 class_05902, int n, float f) {
        if (class_05902.lIllIIlllIIIlIlIIIlllIlIl()) {
            if (class_05902.lIIlIlIIllIIIlIIlIlIIIlII()) {
                GL11.glDepthMask((boolean)false);
            } else {
                GL11.glDepthMask((boolean)true);
            }
            if (n == 1) {
                float f2 = (float)class_05902.IlllIIIllllIIllIllIlIIlIl + f;
                this.lllIIIllIIIIlllIlIIllIIll(lllIIIllIIIIlllIlIIllIIll);
                GL11.glMatrixMode((int)5890);
                GL11.glLoadIdentity();
                float f3 = MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f2 * 0.02f) * 3.0f;
                float f4 = f2 * 0.01f;
                GL11.glTranslatef((float)f3, (float)f4, (float)0.0f);
                this.lllIIIllIIIIlllIlIIllIIll(this.llIIllIllIlIIlIIllIllllll);
                GL11.glMatrixMode((int)5888);
                GL11.glEnable((int)3042);
                float f5 = 0.5f;
                GL11.glColor4f((float)f5, (float)f5, (float)f5, (float)1.0f);
                GL11.glDisable((int)2896);
                GL11.glBlendFunc((int)1, (int)1);
                GL11.glTranslatef((float)0.0f, (float)-0.01f, (float)0.0f);
                GL11.glScalef((float)1.1f, (float)1.1f, (float)1.1f);
                return 1;
            }
            if (n == 2) {
                GL11.glMatrixMode((int)5890);
                GL11.glLoadIdentity();
                GL11.glMatrixMode((int)5888);
                GL11.glEnable((int)2896);
                GL11.glDisable((int)3042);
            }
        }
        return -1;
    }

    protected int lllIlIIlIIIlIlIIIllIlllIl(class_0590 class_05902, int n, float f) {
        return -1;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0339 class_03392, double d, double d2, double d3, float f, float f2) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0590)class_03392, d, d2, d3, f, f2);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652, float f) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0590)class_19652, f);
    }

    @Override
    public int lllIlIIlIIIlIlIIIllIlllIl(class_1965 class_19652, int n, float f) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_0590)class_19652, n, f);
    }

    @Override
    protected int IlIllllllIIlIIllllIIlIIIl(class_1965 class_19652, int n, float f) {
        return this.lllIlIIlIIIlIlIIIllIlllIl((class_0590)class_19652, n, f);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652, double d, double d2, double d3, float f, float f2) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0590)class_19652, d, d2, d3, f, f2);
    }

    @Override
    public ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_0590)class_15212);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, double d, double d2, double d3, float f, float f2) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0590)class_15212, d, d2, d3, f, f2);
    }
}

