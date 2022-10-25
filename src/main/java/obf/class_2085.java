package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.client.renderer.OpenGlHelper;
import org.lwjgl.opengl.GL11;

public class class_2085
extends class_1338 {
    private float lllIIIllIIIIlllIlIIllIIll;
    private float lllIlIIlIIIlIlIIIllIlllIl;

    public class_2085(class_0814 class_08142) {
        super(class_08142.IlIlllIIIIIIlIIllIIllIlll);
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
        if (this.lllllIlllIIllIlIIlIIIllII.lIllllIIlIIIlIllllllIIIll.IllIIlllllllIIlIIlIIIIlIl()) {
            this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(new class_0528(this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII));
        }
    }

    @Override
    public void n_() {
        this.lIlIlIIlIIIIlIIIIIlllIIII.clear();
        if (this.lllllIlllIIllIlIIlIIIllII.lIllllIIlIIIlIllllllIIIll.IllIIlllllllIIlIIlIIIIlIl()) {
            this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(new class_0528(this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII));
        } else {
            super.n_();
        }
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        this.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl(class_0616.lllIIIllIIIIlllIlIIllIIll("container.crafting", new Object[0]), 86, 16, 0x404040);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
        super.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
        this.lllIIIllIIIIlllIlIIllIIll = n;
        this.lllIlIIlIIIlIlIIIllIlllIl = n2;
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(float f, int n, int n2) {
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        this.lllllIlllIIllIlIIlIIIllII.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(IIIllIllIIlIlIlIlIllllIIl);
        int n3 = this.IlIIlllllIIlIlIlllllIllll;
        int n4 = this.llIIlIlIlllIIllIlIlllIllI;
        class_2085.lllIIIllIIIIlllIlIIllIIll(n3, n4, 0, 0, this.IllIIIllIIIIlIlIlIllIIlll, this.lIIIIlIlIIlllllIIllIIlIII);
        class_2085.lllIIIllIIIIlllIlIIllIIll(n3 + 51, n4 + 75, 30, (float)(n3 + 51) - this.lllIIIllIIIIlllIlIIllIIll, (float)(n4 + 75 - 50) - this.lllIlIIlIIIlIlIIIllIlllIl, this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII);
    }

    public static void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, float f, float f2, class_1965 class_19652) {
        GL11.glEnable((int)2903);
        GL11.glPushMatrix();
        GL11.glTranslatef((float)n, (float)n2, (float)50.0f);
        GL11.glScalef((float)(-n3), (float)n3, (float)n3);
        GL11.glRotatef((float)180.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        float f3 = class_19652.lllllIllllIIIIllIIlIlIlII;
        float f4 = class_19652.IIIIlIllIlIIlIIlIllIlIlll;
        float f5 = class_19652.IlIlIIlllIllllllllIIIlIlI;
        float f6 = class_19652.IIIIIlllIIllllIlllIlllIIl;
        float f7 = class_19652.lIIllllIllIlllllIIllIllIl;
        GL11.glRotatef((float)135.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        class_0624.lllIlIIlIIIlIlIIIllIlllIl();
        GL11.glRotatef((float)-135.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        GL11.glRotatef((float)(-((float)Math.atan(f2 / 40.0f)) * 20.0f), (float)1.0f, (float)0.0f, (float)0.0f);
        class_19652.lllllIllllIIIIllIIlIlIlII = (float)Math.atan(f / 40.0f) * 20.0f;
        class_19652.IIIIlIllIlIIlIIlIllIlIlll = (float)Math.atan(f / 40.0f) * 40.0f;
        class_19652.IlIlIIlllIllllllllIIIlIlI = -((float)Math.atan(f2 / 40.0f)) * 20.0f;
        class_19652.lIIllllIllIlllllIIllIllIl = class_19652.IIIIlIllIlIIlIIlIllIlIlll;
        class_19652.IIIIIlllIIllllIlllIlllIIl = class_19652.IIIIlIllIlIIlIIlIllIlIlll;
        GL11.glTranslatef((float)0.0f, (float)class_19652.llllIlIIIIIIIIIlllIIlIIIl, (float)0.0f);
        class_2114.lllIIIllIIIIlllIlIIllIIll.IllIIIllIIIIlIlIlIllIIlll = 180.0f;
        class_2114.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(class_19652, 0.0, 0.0, 0.0, 0.0f, 1.0f);
        class_19652.lllllIllllIIIIllIIlIlIlII = f3;
        class_19652.IIIIlIllIlIIlIIlIllIlIlll = f4;
        class_19652.IlIlIIlllIllllllllIIIlIlI = f5;
        class_19652.IIIIIlllIIllllIlllIlllIIl = f6;
        class_19652.lIIllllIllIlllllIIllIllIl = f7;
        GL11.glPopMatrix();
        class_0624.lllIIIllIIIIlllIlIIllIIll();
        GL11.glDisable((int)32826);
        OpenGlHelper.IllIIIllIIIIlIlIlIllIIlll(OpenGlHelper.IlIllllllIIlIIllllIIlIIIl);
        GL11.glDisable((int)3553);
        OpenGlHelper.IllIIIllIIIIlIlIlIllIIlll(OpenGlHelper.lllIlIIlIIIlIlIIIllIlllIl);
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1197 class_11972) {
        if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 0) {
            this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(new class_0699(this, this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII.IlIIlllllIIlIlIlllllIllll()));
        }
        if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 1) {
            this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(new class_0342(this, this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII.IlIIlllllIIlIlIlllllIllll()));
        }
    }
}

