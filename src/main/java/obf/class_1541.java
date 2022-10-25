package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class class_1541
extends class_1382 {
    public class_0744 IIIllIIlIIIIIIlIlIIllIIlI;
    public class_0744 IllIIlllllllIIlIIlIIIIlIl;
    public class_0744 IIIllIllIIlIlIlIlIllllIIl;
    public class_0744 IllIIIllIIIIlIlIlIllIIlll;
    public class_0744 lIIIIlIlIIlllllIIllIIlIII;
    public class_0744 llIIlllIllIllllIIIlIIIIII;
    class_0744 llIIllIllIlIIlIIllIllllll;
    class_0744 lllIIlIIIllllllIIIIlIlIlI;

    public class_1541() {
        float f = 0.0f;
        float f2 = 13.5f;
        this.IIIllIIlIIIIIIlIlIIllIIlI = new class_0744(this, 0, 0);
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(-3.0f, -3.0f, -2.0f, 6, 6, 4, f);
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(-1.0f, f2, -7.0f);
        this.IllIIlllllllIIlIIlIIIIlIl = new class_0744(this, 18, 14);
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(-4.0f, -2.0f, -3.0f, 6, 9, 6, f);
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(0.0f, 14.0f, 2.0f);
        this.lllIIlIIIllllllIIIIlIlIlI = new class_0744(this, 21, 0);
        this.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(-4.0f, -3.0f, -3.0f, 8, 6, 7, f);
        this.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(-1.0f, 14.0f, 2.0f);
        this.IIIllIllIIlIlIlIlIllllIIl = new class_0744(this, 0, 18);
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(-1.0f, 0.0f, -1.0f, 2, 8, 2, f);
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(-2.5f, 16.0f, 7.0f);
        this.IllIIIllIIIIlIlIlIllIIlll = new class_0744(this, 0, 18);
        this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(-1.0f, 0.0f, -1.0f, 2, 8, 2, f);
        this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(0.5f, 16.0f, 7.0f);
        this.lIIIIlIlIIlllllIIllIIlIII = new class_0744(this, 0, 18);
        this.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(-1.0f, 0.0f, -1.0f, 2, 8, 2, f);
        this.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(-2.5f, 16.0f, -4.0f);
        this.llIIlllIllIllllIIIlIIIIII = new class_0744(this, 0, 18);
        this.llIIlllIllIllllIIIlIIIIII.lllIIIllIIIIlllIlIIllIIll(-1.0f, 0.0f, -1.0f, 2, 8, 2, f);
        this.llIIlllIllIllllIIIlIIIIII.lllIIIllIIIIlllIlIIllIIll(0.5f, 16.0f, -4.0f);
        this.llIIllIllIlIIlIIllIllllll = new class_0744(this, 9, 18);
        this.llIIllIllIlIIlIIllIllllll.lllIIIllIIIIlllIlIIllIIll(-1.0f, 0.0f, -1.0f, 2, 8, 2, f);
        this.llIIllIllIlIIlIIllIllllll.lllIIIllIIIIlllIlIIllIIll(-1.0f, 12.0f, 8.0f);
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(16, 14).lllIIIllIIIIlllIlIIllIIll(-3.0f, -5.0f, 0.0f, 2, 2, 1, f);
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(16, 14).lllIIIllIIIIlllIlIIllIIll(1.0f, -5.0f, 0.0f, 2, 2, 1, f);
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(0, 10).lllIIIllIIIIlllIlIIllIIll(-1.5f, 0.0f, -5.0f, 3, 3, 4, f);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, float f, float f2, float f3, float f4, float f5, float f6) {
        super.lllIIIllIIIIlllIlIIllIIll(class_15212, f, f2, f3, f4, f5, f6);
        this.lllIIIllIIIIlllIlIIllIIll(f, f2, f3, f4, f5, f6, class_15212);
        if (this.lIlllIlllIIIIlIIlllIllIII) {
            float f7 = 2.0f;
            GL11.glPushMatrix();
            GL11.glTranslatef((float)0.0f, (float)(5.0f * f6), (float)(2.0f * f6));
            this.IIIllIIlIIIIIIlIlIIllIIlI.lllIlIIlIIIlIlIIIllIlllIl(f6);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glScalef((float)(1.0f / f7), (float)(1.0f / f7), (float)(1.0f / f7));
            GL11.glTranslatef((float)0.0f, (float)(24.0f * f6), (float)0.0f);
            this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(f6);
            this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(f6);
            this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(f6);
            this.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(f6);
            this.llIIlllIllIllllIIIlIIIIII.lllIIIllIIIIlllIlIIllIIll(f6);
            this.llIIllIllIlIIlIIllIllllll.lllIlIIlIIIlIlIIIllIlllIl(f6);
            this.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(f6);
            GL11.glPopMatrix();
        } else {
            this.IIIllIIlIIIIIIlIlIIllIIlI.lllIlIIlIIIlIlIIIllIlllIl(f6);
            this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(f6);
            this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(f6);
            this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(f6);
            this.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(f6);
            this.llIIlllIllIllllIIIlIIIIII.lllIIIllIIIIlllIlIIllIIll(f6);
            this.llIIllIllIlIIlIIllIllllll.lllIlIIlIIIlIlIIIllIlllIl(f6);
            this.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(f6);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652, float f, float f2, float f3) {
        class_1305 class_13052 = (class_1305)class_19652;
        this.llIIllIllIlIIlIIllIllllll.IIIllIIlIIIIIIlIlIIllIIlI = class_13052.IIIIlllllIlllIIllIIIlIllI() ? 0.0f : MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f * 0.6662f) * 1.4f * f2;
        if (class_13052.IlIllIIIIllllIIllIllIIIIl()) {
            this.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(-1.0f, 16.0f, -3.0f);
            this.lllIIlIIIllllllIIIIlIlIlI.lIllllIIlIIIlIllllllIIIll = 1.2566371f;
            this.lllIIlIIIllllllIIIIlIlIlI.IIIllIIlIIIIIIlIlIIllIIlI = 0.0f;
            this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(0.0f, 18.0f, 0.0f);
            this.IllIIlllllllIIlIIlIIIIlIl.lIllllIIlIIIlIllllllIIIll = 0.7853982f;
            this.llIIllIllIlIIlIIllIllllll.lllIIIllIIIIlllIlIIllIIll(-1.0f, 21.0f, 6.0f);
            this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(-2.5f, 22.0f, 2.0f);
            this.IIIllIllIIlIlIlIlIllllIIl.lIllllIIlIIIlIllllllIIIll = 4.712389f;
            this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(0.5f, 22.0f, 2.0f);
            this.IllIIIllIIIIlIlIlIllIIlll.lIllllIIlIIIlIllllllIIIll = 4.712389f;
            this.lIIIIlIlIIlllllIIllIIlIII.lIllllIIlIIIlIllllllIIIll = 5.811947f;
            this.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(-2.49f, 17.0f, -4.0f);
            this.llIIlllIllIllllIIIlIIIIII.lIllllIIlIIIlIllllllIIIll = 5.811947f;
            this.llIIlllIllIllllIIIlIIIIII.lllIIIllIIIIlllIlIIllIIll(0.51f, 17.0f, -4.0f);
        } else {
            this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(0.0f, 14.0f, 2.0f);
            this.IllIIlllllllIIlIIlIIIIlIl.lIllllIIlIIIlIllllllIIIll = 1.5707964f;
            this.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(-1.0f, 14.0f, -3.0f);
            this.lllIIlIIIllllllIIIIlIlIlI.lIllllIIlIIIlIllllllIIIll = this.IllIIlllllllIIlIIlIIIIlIl.lIllllIIlIIIlIllllllIIIll;
            this.llIIllIllIlIIlIIllIllllll.lllIIIllIIIIlllIlIIllIIll(-1.0f, 12.0f, 8.0f);
            this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(-2.5f, 16.0f, 7.0f);
            this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(0.5f, 16.0f, 7.0f);
            this.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(-2.5f, 16.0f, -4.0f);
            this.llIIlllIllIllllIIIlIIIIII.lllIIIllIIIIlllIlIIllIIll(0.5f, 16.0f, -4.0f);
            this.IIIllIllIIlIlIlIlIllllIIl.lIllllIIlIIIlIllllllIIIll = MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f * 0.6662f) * 1.4f * f2;
            this.IllIIIllIIIIlIlIlIllIIlll.lIllllIIlIIIlIllllllIIIll = MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f * 0.6662f + (float)Math.PI) * 1.4f * f2;
            this.lIIIIlIlIIlllllIIllIIlIII.lIllllIIlIIIlIllllllIIIll = MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f * 0.6662f + (float)Math.PI) * 1.4f * f2;
            this.llIIlllIllIllllIIIlIIIIII.lIllllIIlIIIlIllllllIIIll = MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f * 0.6662f) * 1.4f * f2;
        }
        this.IIIllIIlIIIIIIlIlIIllIIlI.IllIIlllllllIIlIIlIIIIlIl = class_13052.lllllIlllIIllIlIIlIIIllII(f3) + class_13052.IlIllllllIIlIIllllIIlIIIl(f3, 0.0f);
        this.lllIIlIIIllllllIIIIlIlIlI.IllIIlllllllIIlIIlIIIIlIl = class_13052.IlIllllllIIlIIllllIIlIIIl(f3, -0.08f);
        this.IllIIlllllllIIlIIlIIIIlIl.IllIIlllllllIIlIIlIIIIlIl = class_13052.IlIllllllIIlIIllllIIlIIIl(f3, -0.16f);
        this.llIIllIllIlIIlIIllIllllll.IllIIlllllllIIlIIlIIIIlIl = class_13052.IlIllllllIIlIIllllIIlIIIl(f3, -0.2f);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(float f, float f2, float f3, float f4, float f5, float f6, class_1521 class_15212) {
        super.lllIIIllIIIIlllIlIIllIIll(f, f2, f3, f4, f5, f6, class_15212);
        this.IIIllIIlIIIIIIlIlIIllIIlI.lIllllIIlIIIlIllllllIIIll = f5 / 57.295776f;
        this.IIIllIIlIIIIIIlIlIIllIIlI.IIIllIIlIIIIIIlIlIIllIIlI = f4 / 57.295776f;
        this.llIIllIllIlIIlIIllIllllll.lIllllIIlIIIlIllllllIIIll = f3;
    }
}

