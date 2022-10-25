package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class class_0399
extends class_1382 {
    public class_0744 IIIllIIlIIIIIIlIlIIllIIlI;
    public class_0744 IllIIlllllllIIlIIlIIIIlIl;
    public class_0744 IIIllIllIIlIlIlIlIllllIIl;
    public class_0744 IllIIIllIIIIlIlIlIllIIlll;
    public class_0744 lIIIIlIlIIlllllIIllIIlIII;
    public class_0744 llIIlllIllIllllIIIlIIIIII;
    public class_0744 llIIllIllIlIIlIIllIllllll;
    public class_0744 lllIIlIIIllllllIIIIlIlIlI;

    public class_0399() {
        int n = 16;
        this.IIIllIIlIIIIIIlIlIIllIIlI = new class_0744(this, 0, 0);
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(-2.0f, -6.0f, -2.0f, 4, 6, 3, 0.0f);
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(0.0f, -1 + n, -4.0f);
        this.llIIllIllIlIIlIIllIllllll = new class_0744(this, 14, 0);
        this.llIIllIllIlIIlIIllIllllll.lllIIIllIIIIlllIlIIllIIll(-2.0f, -4.0f, -4.0f, 4, 2, 2, 0.0f);
        this.llIIllIllIlIIlIIllIllllll.lllIIIllIIIIlllIlIIllIIll(0.0f, -1 + n, -4.0f);
        this.lllIIlIIIllllllIIIIlIlIlI = new class_0744(this, 14, 4);
        this.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(-1.0f, -2.0f, -3.0f, 2, 2, 2, 0.0f);
        this.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(0.0f, -1 + n, -4.0f);
        this.IllIIlllllllIIlIIlIIIIlIl = new class_0744(this, 0, 9);
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(-3.0f, -4.0f, -3.0f, 6, 8, 6, 0.0f);
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(0.0f, n, 0.0f);
        this.IIIllIllIIlIlIlIlIllllIIl = new class_0744(this, 26, 0);
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(-1.0f, 0.0f, -3.0f, 3, 5, 3);
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(-2.0f, 3 + n, 1.0f);
        this.IllIIIllIIIIlIlIlIllIIlll = new class_0744(this, 26, 0);
        this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(-1.0f, 0.0f, -3.0f, 3, 5, 3);
        this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(1.0f, 3 + n, 1.0f);
        this.lIIIIlIlIIlllllIIllIIlIII = new class_0744(this, 24, 13);
        this.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, -3.0f, 1, 4, 6);
        this.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(-4.0f, -3 + n, 0.0f);
        this.llIIlllIllIllllIIIlIIIIII = new class_0744(this, 24, 13);
        this.llIIlllIllIllllIIIlIIIIII.lllIIIllIIIIlllIlIIllIIll(-1.0f, 0.0f, -3.0f, 1, 4, 6);
        this.llIIlllIllIllllIIIlIIIIII.lllIIIllIIIIlllIlIIllIIll(4.0f, -3 + n, 0.0f);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, float f, float f2, float f3, float f4, float f5, float f6) {
        this.lllIIIllIIIIlllIlIIllIIll(f, f2, f3, f4, f5, f6, class_15212);
        if (this.lIlllIlllIIIIlIIlllIllIII) {
            float f7 = 2.0f;
            GL11.glPushMatrix();
            GL11.glTranslatef((float)0.0f, (float)(5.0f * f6), (float)(2.0f * f6));
            this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(f6);
            this.llIIllIllIlIIlIIllIllllll.lllIIIllIIIIlllIlIIllIIll(f6);
            this.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(f6);
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
            this.llIIllIllIlIIlIIllIllllll.lllIIIllIIIIlllIlIIllIIll(f6);
            this.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(f6);
            this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(f6);
            this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(f6);
            this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(f6);
            this.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(f6);
            this.llIIlllIllIllllIIIlIIIIII.lllIIIllIIIIlllIlIIllIIll(f6);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(float f, float f2, float f3, float f4, float f5, float f6, class_1521 class_15212) {
        this.IIIllIIlIIIIIIlIlIIllIIlI.lIllllIIlIIIlIllllllIIIll = f5 / 57.295776f;
        this.IIIllIIlIIIIIIlIlIIllIIlI.IIIllIIlIIIIIIlIlIIllIIlI = f4 / 57.295776f;
        this.llIIllIllIlIIlIIllIllllll.lIllllIIlIIIlIllllllIIIll = this.IIIllIIlIIIIIIlIlIIllIIlI.lIllllIIlIIIlIllllllIIIll;
        this.llIIllIllIlIIlIIllIllllll.IIIllIIlIIIIIIlIlIIllIIlI = this.IIIllIIlIIIIIIlIlIIllIIlI.IIIllIIlIIIIIIlIlIIllIIlI;
        this.lllIIlIIIllllllIIIIlIlIlI.lIllllIIlIIIlIllllllIIIll = this.IIIllIIlIIIIIIlIlIIllIIlI.lIllllIIlIIIlIllllllIIIll;
        this.lllIIlIIIllllllIIIIlIlIlI.IIIllIIlIIIIIIlIlIIllIIlI = this.IIIllIIlIIIIIIlIlIIllIIlI.IIIllIIlIIIIIIlIlIIllIIlI;
        this.IllIIlllllllIIlIIlIIIIlIl.lIllllIIlIIIlIllllllIIIll = 1.5707964f;
        this.IIIllIllIIlIlIlIlIllllIIl.lIllllIIlIIIlIllllllIIIll = MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f * 0.6662f) * 1.4f * f2;
        this.IllIIIllIIIIlIlIlIllIIlll.lIllllIIlIIIlIllllllIIIll = MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f * 0.6662f + (float)Math.PI) * 1.4f * f2;
        this.lIIIIlIlIIlllllIIllIIlIII.IllIIlllllllIIlIIlIIIIlIl = f3;
        this.llIIlllIllIllllIIIlIIIIII.IllIIlllllllIIlIIlIIIIlIl = -f3;
    }
}

