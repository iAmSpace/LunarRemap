package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class class_1464
extends class_0164 {
    private static final ResourceLocation lllIIIllIIIIlllIlIIllIIll = new ResourceLocation("textures/entity/creeper/creeper_armor.png");
    private static final ResourceLocation lIllllIIlIIIlIllllllIIIll = new ResourceLocation("textures/entity/creeper/creeper.png");
    private class_1382 IIIllIIlIIIIIIlIlIIllIIlI = new class_0786(2.0f);

    public class_1464() {
        super(new class_0786(), 0.5f);
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_1234 class_12342, float f) {
        float f2 = class_12342.lIlllIlllIIIIlIIlllIllIII(f);
        float f3 = 1.0f + MathHelper.lllIIIllIIIIlllIlIIllIIll(f2 * 100.0f) * f2 * 0.01f;
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        f2 *= f2;
        f2 *= f2;
        float f4 = (1.0f + f2 * 0.4f) * f3;
        float f5 = (1.0f + f2 * 0.1f) / f3;
        GL11.glScalef((float)f4, (float)f5, (float)f4);
    }

    protected int lllIIIllIIIIlllIlIIllIIll(class_1234 class_12342, float f, float f2) {
        float f3 = class_12342.lIlllIlllIIIIlIIlllIllIII(f2);
        if ((int)(f3 * 10.0f) % 2 == 0) {
            return 0;
        }
        int n = (int)(f3 * 0.2f * 255.0f);
        if (n < 0) {
            n = 0;
        }
        if (n > 255) {
            n = 255;
        }
        int n2 = 255;
        int n3 = 255;
        int n4 = 255;
        return n << 24 | n2 << 16 | n3 << 8 | n4;
    }

    protected int lllIIIllIIIIlllIlIIllIIll(class_1234 class_12342, int n, float f) {
        if (class_12342.lllIIIlIllIlllIlIIllIllIl()) {
            if (class_12342.lIIlIlIIllIIIlIIlIlIIIlII()) {
                GL11.glDepthMask((boolean)false);
            } else {
                GL11.glDepthMask((boolean)true);
            }
            if (n == 1) {
                float f2 = (float)class_12342.IlllIIIllllIIllIllIlIIlIl + f;
                this.lllIIIllIIIIlllIlIIllIIll(lllIIIllIIIIlllIlIIllIIll);
                GL11.glMatrixMode((int)5890);
                GL11.glLoadIdentity();
                float f3 = f2 * 0.01f;
                float f4 = f2 * 0.01f;
                GL11.glTranslatef((float)f3, (float)f4, (float)0.0f);
                this.lllIIIllIIIIlllIlIIllIIll(this.IIIllIIlIIIIIIlIlIIllIIlI);
                GL11.glMatrixMode((int)5888);
                GL11.glEnable((int)3042);
                float f5 = 0.5f;
                GL11.glColor4f((float)f5, (float)f5, (float)f5, (float)1.0f);
                GL11.glDisable((int)2896);
                GL11.glBlendFunc((int)1, (int)1);
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

    protected int lllIlIIlIIIlIlIIIllIlllIl(class_1234 class_12342, int n, float f) {
        return -1;
    }

    protected ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_1234 class_12342) {
        return lIllllIIlIIIlIllllllIIIll;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652, float f) {
        this.lllIIIllIIIIlllIlIIllIIll((class_1234)class_19652, f);
    }

    @Override
    protected int lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652, float f, float f2) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_1234)class_19652, f, f2);
    }

    @Override
    public int lllIlIIlIIIlIlIIIllIlllIl(class_1965 class_19652, int n, float f) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_1234)class_19652, n, f);
    }

    @Override
    protected int IlIllllllIIlIIllllIIlIIIl(class_1965 class_19652, int n, float f) {
        return this.lllIlIIlIIIlIlIIIllIlllIl((class_1234)class_19652, n, f);
    }

    @Override
    public ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_1234)class_15212);
    }
}

