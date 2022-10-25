package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class class_0846
extends class_1382 {
    public class_0744 IIIllIIlIIIIIIlIlIIllIIlI = new class_0744(this, 0, 0);
    public class_0744 IllIIlllllllIIlIIlIIIIlIl;
    public class_0744 IIIllIllIIlIlIlIlIllllIIl;
    public class_0744 IllIIIllIIIIlIlIlIllIIlll;
    public class_0744 lIIIIlIlIIlllllIIllIIlIII;
    public class_0744 llIIlllIllIllllIIIlIIIIII;
    protected float llIIllIllIlIIlIIllIllllll = 8.0f;
    protected float lllIIlIIIllllllIIIIlIlIlI = 4.0f;

    public class_0846(int n, float f) {
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(-4.0f, -4.0f, -8.0f, 8, 8, 8, f);
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(0.0f, 18 - n, -6.0f);
        this.IllIIlllllllIIlIIlIIIIlIl = new class_0744(this, 28, 8);
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(-5.0f, -10.0f, -7.0f, 10, 16, 8, f);
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(0.0f, 17 - n, 2.0f);
        this.IIIllIllIIlIlIlIlIllllIIl = new class_0744(this, 0, 16);
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(-2.0f, 0.0f, -2.0f, 4, n, 4, f);
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(-3.0f, 24 - n, 7.0f);
        this.IllIIIllIIIIlIlIlIllIIlll = new class_0744(this, 0, 16);
        this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(-2.0f, 0.0f, -2.0f, 4, n, 4, f);
        this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(3.0f, 24 - n, 7.0f);
        this.lIIIIlIlIIlllllIIllIIlIII = new class_0744(this, 0, 16);
        this.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(-2.0f, 0.0f, -2.0f, 4, n, 4, f);
        this.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(-3.0f, 24 - n, -5.0f);
        this.llIIlllIllIllllIIIlIIIIII = new class_0744(this, 0, 16);
        this.llIIlllIllIllllIIIlIIIIII.lllIIIllIIIIlllIlIIllIIll(-2.0f, 0.0f, -2.0f, 4, n, 4, f);
        this.llIIlllIllIllllIIIlIIIIII.lllIIIllIIIIlllIlIIllIIll(3.0f, 24 - n, -5.0f);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, float f, float f2, float f3, float f4, float f5, float f6) {
        this.lllIIIllIIIIlllIlIIllIIll(f, f2, f3, f4, f5, f6, class_15212);
        if (this.lIlllIlllIIIIlIIlllIllIII) {
            float f7 = 2.0f;
            GL11.glPushMatrix();
            GL11.glTranslatef((float)0.0f, (float)(this.llIIllIllIlIIlIIllIllllll * f6), (float)(this.lllIIlIIIllllllIIIIlIlIlI * f6));
            this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(f6);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glScalef((float)(1.0f / f7), (float)(1.0f / f7), (float)(1.0f / f7));
            GL11.glTranslatef((float)0.0f, (float)(24.0f * f6), (float)0.0f);
            this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(f6);
            this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(f6);
            this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(f6);
            this.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(f6);
            this.llIIlllIllIllllIIIlIIIIII.lllIIIllIIIIlllIlIIllIIll(f6);
            GL11.glPopMatrix();
        } else {
            this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(f6);
            this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(f6);
            this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(f6);
            this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(f6);
            this.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(f6);
            this.llIIlllIllIllllIIIlIIIIII.lllIIIllIIIIlllIlIIllIIll(f6);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(float f, float f2, float f3, float f4, float f5, float f6, class_1521 class_15212) {
        float f7 = 57.295776f;
        this.IIIllIIlIIIIIIlIlIIllIIlI.lIllllIIlIIIlIllllllIIIll = f5 / 57.295776f;
        this.IIIllIIlIIIIIIlIlIIllIIlI.IIIllIIlIIIIIIlIlIIllIIlI = f4 / 57.295776f;
        this.IllIIlllllllIIlIIlIIIIlIl.lIllllIIlIIIlIllllllIIIll = 1.5707964f;
        this.IIIllIllIIlIlIlIlIllllIIl.lIllllIIlIIIlIllllllIIIll = MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f * 0.6662f) * 1.4f * f2;
        this.IllIIIllIIIIlIlIlIllIIlll.lIllllIIlIIIlIllllllIIIll = MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f * 0.6662f + (float)Math.PI) * 1.4f * f2;
        this.lIIIIlIlIIlllllIIllIIlIII.lIllllIIlIIIlIllllllIIIll = MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f * 0.6662f + (float)Math.PI) * 1.4f * f2;
        this.llIIlllIllIllllIIIlIIIIII.lIllllIIlIIIlIllllllIIIll = MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f * 0.6662f) * 1.4f * f2;
    }
}

