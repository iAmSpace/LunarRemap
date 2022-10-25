package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class class_1478
extends class_1382 {
    class_0744 IIIllIIlIIIIIIlIlIIllIIlI;
    class_0744 IllIIlllllllIIlIIlIIIIlIl;
    class_0744 IIIllIllIIlIlIlIlIllllIIl;
    class_0744 IllIIIllIIIIlIlIlIllIIlll;
    class_0744 lIIIIlIlIIlllllIIllIIlIII;
    class_0744 llIIlllIllIllllIIIlIIIIII;
    class_0744 llIIllIllIlIIlIIllIllllll;
    class_0744 lllIIlIIIllllllIIIIlIlIlI;
    int IlIlllIIIIIIlIIllIIllIlll = 1;

    public class_1478() {
        this.lllIIIllIIIIlllIlIIllIIll("head.main", 0, 0);
        this.lllIIIllIIIIlllIlIIllIIll("head.nose", 0, 24);
        this.lllIIIllIIIIlllIlIIllIIll("head.ear1", 0, 10);
        this.lllIIIllIIIIlllIlIIllIIll("head.ear2", 6, 10);
        this.llIIllIllIlIIlIIllIllllll = new class_0744(this, "head");
        this.llIIllIllIlIIlIIllIllllll.lllIIIllIIIIlllIlIIllIIll("main", -2.5f, -2.0f, -3.0f, 5, 4, 5);
        this.llIIllIllIlIIlIIllIllllll.lllIIIllIIIIlllIlIIllIIll("nose", -1.5f, 0.0f, -4.0f, 3, 2, 2);
        this.llIIllIllIlIIlIIllIllllll.lllIIIllIIIIlllIlIIllIIll("ear1", -2.0f, -3.0f, 0.0f, 1, 1, 2);
        this.llIIllIllIlIIlIIllIllllll.lllIIIllIIIIlllIlIIllIIll("ear2", 1.0f, -3.0f, 0.0f, 1, 1, 2);
        this.llIIllIllIlIIlIIllIllllll.lllIIIllIIIIlllIlIIllIIll(0.0f, 15.0f, -9.0f);
        this.lllIIlIIIllllllIIIIlIlIlI = new class_0744(this, 20, 0);
        this.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(-2.0f, 3.0f, -8.0f, 4, 16, 6, 0.0f);
        this.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(0.0f, 12.0f, -10.0f);
        this.lIIIIlIlIIlllllIIllIIlIII = new class_0744(this, 0, 15);
        this.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(-0.5f, 0.0f, 0.0f, 1, 8, 1);
        this.lIIIIlIlIIlllllIIllIIlIII.lIllllIIlIIIlIllllllIIIll = 0.9f;
        this.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(0.0f, 15.0f, 8.0f);
        this.llIIlllIllIllllIIIlIIIIII = new class_0744(this, 4, 15);
        this.llIIlllIllIllllIIIlIIIIII.lllIIIllIIIIlllIlIIllIIll(-0.5f, 0.0f, 0.0f, 1, 8, 1);
        this.llIIlllIllIllllIIIlIIIIII.lllIIIllIIIIlllIlIIllIIll(0.0f, 20.0f, 14.0f);
        this.IIIllIIlIIIIIIlIlIIllIIlI = new class_0744(this, 8, 13);
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(-1.0f, 0.0f, 1.0f, 2, 6, 2);
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(1.1f, 18.0f, 5.0f);
        this.IllIIlllllllIIlIIlIIIIlIl = new class_0744(this, 8, 13);
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(-1.0f, 0.0f, 1.0f, 2, 6, 2);
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(-1.1f, 18.0f, 5.0f);
        this.IIIllIllIIlIlIlIlIllllIIl = new class_0744(this, 40, 0);
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(-1.0f, 0.0f, 0.0f, 2, 10, 2);
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(1.2f, 13.8f, -5.0f);
        this.IllIIIllIIIIlIlIlIllIIlll = new class_0744(this, 40, 0);
        this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(-1.0f, 0.0f, 0.0f, 2, 10, 2);
        this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(-1.2f, 13.8f, -5.0f);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, float f, float f2, float f3, float f4, float f5, float f6) {
        this.lllIIIllIIIIlllIlIIllIIll(f, f2, f3, f4, f5, f6, class_15212);
        if (this.lIlllIlllIIIIlIIlllIllIII) {
            float f7 = 2.0f;
            GL11.glPushMatrix();
            GL11.glScalef((float)(1.5f / f7), (float)(1.5f / f7), (float)(1.5f / f7));
            GL11.glTranslatef((float)0.0f, (float)(10.0f * f6), (float)(4.0f * f6));
            this.llIIllIllIlIIlIIllIllllll.lllIIIllIIIIlllIlIIllIIll(f6);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glScalef((float)(1.0f / f7), (float)(1.0f / f7), (float)(1.0f / f7));
            GL11.glTranslatef((float)0.0f, (float)(24.0f * f6), (float)0.0f);
            this.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(f6);
            this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(f6);
            this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(f6);
            this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(f6);
            this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(f6);
            this.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(f6);
            this.llIIlllIllIllllIIIlIIIIII.lllIIIllIIIIlllIlIIllIIll(f6);
            GL11.glPopMatrix();
        } else {
            this.llIIllIllIlIIlIIllIllllll.lllIIIllIIIIlllIlIIllIIll(f6);
            this.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(f6);
            this.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(f6);
            this.llIIlllIllIllllIIIlIIIIII.lllIIIllIIIIlllIlIIllIIll(f6);
            this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(f6);
            this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(f6);
            this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(f6);
            this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(f6);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(float f, float f2, float f3, float f4, float f5, float f6, class_1521 class_15212) {
        this.llIIllIllIlIIlIIllIllllll.lIllllIIlIIIlIllllllIIIll = f5 / 57.295776f;
        this.llIIllIllIlIIlIIllIllllll.IIIllIIlIIIIIIlIlIIllIIlI = f4 / 57.295776f;
        if (this.IlIlllIIIIIIlIIllIIllIlll != 3) {
            this.lllIIlIIIllllllIIIIlIlIlI.lIllllIIlIIIlIllllllIIIll = 1.5707964f;
            if (this.IlIlllIIIIIIlIIllIIllIlll == 2) {
                this.IIIllIIlIIIIIIlIlIIllIIlI.lIllllIIlIIIlIllllllIIIll = MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f * 0.6662f) * 1.0f * f2;
                this.IllIIlllllllIIlIIlIIIIlIl.lIllllIIlIIIlIllllllIIIll = MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f * 0.6662f + 0.3f) * 1.0f * f2;
                this.IIIllIllIIlIlIlIlIllllIIl.lIllllIIlIIIlIllllllIIIll = MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f * 0.6662f + (float)Math.PI + 0.3f) * 1.0f * f2;
                this.IllIIIllIIIIlIlIlIllIIlll.lIllllIIlIIIlIllllllIIIll = MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f * 0.6662f + (float)Math.PI) * 1.0f * f2;
                this.llIIlllIllIllllIIIlIIIIII.lIllllIIlIIIlIllllllIIIll = 1.7278761f + 0.31415927f * MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f) * f2;
            } else {
                this.IIIllIIlIIIIIIlIlIIllIIlI.lIllllIIlIIIlIllllllIIIll = MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f * 0.6662f) * 1.0f * f2;
                this.IllIIlllllllIIlIIlIIIIlIl.lIllllIIlIIIlIllllllIIIll = MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f * 0.6662f + (float)Math.PI) * 1.0f * f2;
                this.IIIllIllIIlIlIlIlIllllIIl.lIllllIIlIIIlIllllllIIIll = MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f * 0.6662f + (float)Math.PI) * 1.0f * f2;
                this.IllIIIllIIIIlIlIlIllIIlll.lIllllIIlIIIlIllllllIIIll = MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f * 0.6662f) * 1.0f * f2;
                this.llIIlllIllIllllIIIlIIIIII.lIllllIIlIIIlIllllllIIIll = this.IlIlllIIIIIIlIIllIIllIlll == 1 ? 1.7278761f + 0.7853982f * MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f) * f2 : 1.7278761f + 0.47123894f * MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f) * f2;
            }
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652, float f, float f2, float f3) {
        class_0673 class_06732 = (class_0673)class_19652;
        this.lllIIlIIIllllllIIIIlIlIlI.lIlllIlllIIIIlIIlllIllIII = 12.0f;
        this.lllIIlIIIllllllIIIIlIlIlI.IlIIIIIllllllIIlllIllllll = -10.0f;
        this.llIIllIllIlIIlIIllIllllll.lIlllIlllIIIIlIIlllIllIII = 15.0f;
        this.llIIllIllIlIIlIIllIllllll.IlIIIIIllllllIIlllIllllll = -9.0f;
        this.lIIIIlIlIIlllllIIllIIlIII.lIlllIlllIIIIlIIlllIllIII = 15.0f;
        this.lIIIIlIlIIlllllIIllIIlIII.IlIIIIIllllllIIlllIllllll = 8.0f;
        this.llIIlllIllIllllIIIlIIIIII.lIlllIlllIIIIlIIlllIllIII = 20.0f;
        this.llIIlllIllIllllIIIlIIIIII.IlIIIIIllllllIIlllIllllll = 14.0f;
        this.IllIIIllIIIIlIlIlIllIIlll.lIlllIlllIIIIlIIlllIllIII = 13.8f;
        this.IIIllIllIIlIlIlIlIllllIIl.lIlllIlllIIIIlIIlllIllIII = 13.8f;
        this.IllIIIllIIIIlIlIlIllIIlll.IlIIIIIllllllIIlllIllllll = -5.0f;
        this.IIIllIllIIlIlIlIlIllllIIl.IlIIIIIllllllIIlllIllllll = -5.0f;
        this.IllIIlllllllIIlIIlIIIIlIl.lIlllIlllIIIIlIIlllIllIII = 18.0f;
        this.IIIllIIlIIIIIIlIlIIllIIlI.lIlllIlllIIIIlIIlllIllIII = 18.0f;
        this.IllIIlllllllIIlIIlIIIIlIl.IlIIIIIllllllIIlllIllllll = 5.0f;
        this.IIIllIIlIIIIIIlIlIIllIIlI.IlIIIIIllllllIIlllIllllll = 5.0f;
        this.lIIIIlIlIIlllllIIllIIlIII.lIllllIIlIIIlIllllllIIIll = 0.9f;
        if (class_06732.IIlIIlIlIlIllIIlIlIIIIlll()) {
            this.lllIIlIIIllllllIIIIlIlIlI.lIlllIlllIIIIlIIlllIllIII += 1.0f;
            this.llIIllIllIlIIlIIllIllllll.lIlllIlllIIIIlIIlllIllIII += 2.0f;
            this.lIIIIlIlIIlllllIIllIIlIII.lIlllIlllIIIIlIIlllIllIII += 1.0f;
            this.llIIlllIllIllllIIIlIIIIII.lIlllIlllIIIIlIIlllIllIII += -4.0f;
            this.llIIlllIllIllllIIIlIIIIII.IlIIIIIllllllIIlllIllllll += 2.0f;
            this.lIIIIlIlIIlllllIIllIIlIII.lIllllIIlIIIlIllllllIIIll = 1.5707964f;
            this.llIIlllIllIllllIIIlIIIIII.lIllllIIlIIIlIllllllIIIll = 1.5707964f;
            this.IlIlllIIIIIIlIIllIIllIlll = 0;
        } else if (class_06732.IlIIIIIllIlllIIIIlIIIllIl()) {
            this.llIIlllIllIllllIIIlIIIIII.lIlllIlllIIIIlIIlllIllIII = this.lIIIIlIlIIlllllIIllIIlIII.lIlllIlllIIIIlIIlllIllIII;
            this.llIIlllIllIllllIIIlIIIIII.IlIIIIIllllllIIlllIllllll += 2.0f;
            this.lIIIIlIlIIlllllIIllIIlIII.lIllllIIlIIIlIllllllIIIll = 1.5707964f;
            this.llIIlllIllIllllIIIlIIIIII.lIllllIIlIIIlIllllllIIIll = 1.5707964f;
            this.IlIlllIIIIIIlIIllIIllIlll = 2;
        } else if (class_06732.IlIllIIIIllllIIllIllIIIIl()) {
            this.lllIIlIIIllllllIIIIlIlIlI.lIllllIIlIIIlIllllllIIIll = 0.7853982f;
            this.lllIIlIIIllllllIIIIlIlIlI.lIlllIlllIIIIlIIlllIllIII += -4.0f;
            this.lllIIlIIIllllllIIIIlIlIlI.IlIIIIIllllllIIlllIllllll += 5.0f;
            this.llIIllIllIlIIlIIllIllllll.lIlllIlllIIIIlIIlllIllIII += -3.3f;
            this.llIIllIllIlIIlIIllIllllll.IlIIIIIllllllIIlllIllllll += 1.0f;
            this.lIIIIlIlIIlllllIIllIIlIII.lIlllIlllIIIIlIIlllIllIII += 8.0f;
            this.lIIIIlIlIIlllllIIllIIlIII.IlIIIIIllllllIIlllIllllll += -2.0f;
            this.llIIlllIllIllllIIIlIIIIII.lIlllIlllIIIIlIIlllIllIII += 2.0f;
            this.llIIlllIllIllllIIIlIIIIII.IlIIIIIllllllIIlllIllllll += -0.8f;
            this.lIIIIlIlIIlllllIIllIIlIII.lIllllIIlIIIlIllllllIIIll = 1.7278761f;
            this.llIIlllIllIllllIIIlIIIIII.lIllllIIlIIIlIllllllIIIll = 2.670354f;
            this.IllIIIllIIIIlIlIlIllIIlll.lIllllIIlIIIlIllllllIIIll = -0.15707964f;
            this.IIIllIllIIlIlIlIlIllllIIl.lIllllIIlIIIlIllllllIIIll = -0.15707964f;
            this.IllIIIllIIIIlIlIlIllIIlll.lIlllIlllIIIIlIIlllIllIII = 15.8f;
            this.IIIllIllIIlIlIlIlIllllIIl.lIlllIlllIIIIlIIlllIllIII = 15.8f;
            this.IllIIIllIIIIlIlIlIllIIlll.IlIIIIIllllllIIlllIllllll = -7.0f;
            this.IIIllIllIIlIlIlIlIllllIIl.IlIIIIIllllllIIlllIllllll = -7.0f;
            this.IllIIlllllllIIlIIlIIIIlIl.lIllllIIlIIIlIllllllIIIll = -1.5707964f;
            this.IIIllIIlIIIIIIlIlIIllIIlI.lIllllIIlIIIlIllllllIIIll = -1.5707964f;
            this.IllIIlllllllIIlIIlIIIIlIl.lIlllIlllIIIIlIIlllIllIII = 21.0f;
            this.IIIllIIlIIIIIIlIlIIllIIlI.lIlllIlllIIIIlIIlllIllIII = 21.0f;
            this.IllIIlllllllIIlIIlIIIIlIl.IlIIIIIllllllIIlllIllllll = 1.0f;
            this.IIIllIIlIIIIIIlIlIIllIIlI.IlIIIIIllllllIIlllIllllll = 1.0f;
            this.IlIlllIIIIIIlIIllIIllIlll = 3;
        } else {
            this.IlIlllIIIIIIlIIllIIllIlll = 1;
        }
    }
}

