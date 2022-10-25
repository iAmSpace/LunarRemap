package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import com.moonsworth.lunar.client.LunarClient;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class class_1931
extends class_1382 {
    public class_0744 IIIllIIlIIIIIIlIlIIllIIlI;
    public class_0744 IllIIlllllllIIlIIlIIIIlIl;
    public class_0744 IIIllIllIIlIlIlIlIllllIIl;
    public class_0744 IllIIIllIIIIlIlIlIllIIlll;
    public class_0744 lIIIIlIlIIlllllIIllIIlIII;
    public class_0744 llIIlllIllIllllIIIlIIIIII;
    public class_0744 llIIllIllIlIIlIIllIllllll;
    public class_0744 lllIIlIIIllllllIIIIlIlIlI;
    public class_0744 IlIlllIIIIIIlIIllIIllIlll;
    private class_0832 IlIIIlIIIIllIIIllIIIIIIll;
    public int IlIlIIlIlIllIIlIlIIllIIIl;
    public int lllllIlllIIllIlIIlIIIllII;
    public boolean IlIlIIlllIIlIllIIIlllllIl;
    public boolean lIIlIIIIIlIlllIlIIlIlIlll;
    public boolean lIlIlIIlIIIIlIIIIIlllIIII = false;

    public class_1931() {
        this(0.0f);
    }

    public class_1931(float f) {
        this(f, 0.0f, 64, 32);
    }

    public class_1931(float f, float f2, int n, int n2) {
        this.IlIIIIIllllllIIlllIllllll = n;
        this.lIllllIIlIIIlIllllllIIIll = n2;
        this.IlIlllIIIIIIlIIllIIllIlll = new class_0744(this, 0, 0);
        this.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(-5.0f, 0.0f, -1.0f, 10, 16, 1, f);
        this.lllIIlIIIllllllIIIIlIlIlI = new class_0744(this, 24, 0);
        this.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(-3.0f, -6.0f, -1.0f, 6, 6, 1, f);
        this.IIIllIIlIIIIIIlIlIIllIIlI = new class_0744(this, 0, 0);
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(-4.0f, -8.0f, -4.0f, 8, 8, 8, f);
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f + f2, 0.0f);
        this.IllIIlllllllIIlIIlIIIIlIl = new class_0744(this, 32, 0);
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(-4.0f, -8.0f, -4.0f, 8, 8, 8, f + 0.5f);
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f + f2, 0.0f);
        this.IIIllIllIIlIlIlIlIllllIIl = new class_0744(this, 16, 16);
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(-4.0f, 0.0f, -2.0f, 8, 12, 4, f);
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f + f2, 0.0f);
        this.IllIIIllIIIIlIlIlIllIIlll = new class_0744(this, 40, 16);
        this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(-3.0f, -2.0f, -2.0f, 4, 12, 4, f);
        this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(-5.0f, 2.0f + f2, 0.0f);
        this.lIIIIlIlIIlllllIIllIIlIII = new class_0744(this, 40, 16);
        this.lIIIIlIlIIlllllIIllIIlIII.IIIllIllIIlIlIlIlIllllIIl = true;
        this.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(-1.0f, -2.0f, -2.0f, 4, 12, 4, f);
        this.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(5.0f, 2.0f + f2, 0.0f);
        this.llIIlllIllIllllIIIlIIIIII = new class_0744(this, 0, 16);
        this.llIIlllIllIllllIIIlIIIIII.lllIIIllIIIIlllIlIIllIIll(-2.0f, 0.0f, -2.0f, 4, 12, 4, f);
        this.llIIlllIllIllllIIIlIIIIII.lllIIIllIIIIlllIlIIllIIll(-1.9f, 12.0f + f2, 0.0f);
        this.llIIllIllIlIIlIIllIllllll = new class_0744(this, 0, 16);
        this.llIIllIllIlIIlIIllIllllll.IIIllIllIIlIlIlIlIllllIIl = true;
        this.llIIllIllIlIIlIIllIllllll.lllIIIllIIIIlllIlIIllIIll(-2.0f, 0.0f, -2.0f, 4, 12, 4, f);
        this.llIIllIllIlIIlIIllIllllll.lllIIIllIIIIlllIlIIllIIll(1.9f, 12.0f + f2, 0.0f);
        this.IlIIIlIIIIllIIIllIIIIIIll = new class_0832(0.0f);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, float f, float f2, float f3, float f4, float f5, float f6) {
        this.lllIIIllIIIIlllIlIIllIIll(f, f2, f3, f4, f5, f6, class_15212);
        if (class_15212 instanceof class_2174) {
            LunarClient.getInstance().getEventBus().callEvent(new class_0387(class_1880.lllIIIllIIIIlllIlIIllIIll, (class_2174)class_15212, this, f6));
        }
        if (this.lIlllIlllIIIIlIIlllIllIII) {
            float f7 = 2.0f;
            GL11.glPushMatrix();
            GL11.glScalef((float)(1.5f / f7), (float)(1.5f / f7), (float)(1.5f / f7));
            GL11.glTranslatef((float)0.0f, (float)(16.0f * f6), (float)0.0f);
            this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(f6);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glScalef((float)(1.0f / f7), (float)(1.0f / f7), (float)(1.0f / f7));
            GL11.glTranslatef((float)0.0f, (float)(24.0f * f6), (float)0.0f);
            this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(f6);
            this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(f6);
            this.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(f6);
            this.llIIlllIllIllllIIIlIIIIII.lllIIIllIIIIlllIlIIllIIll(f6);
            this.llIIllIllIlIIlIIllIllllll.lllIIIllIIIIlllIlIIllIIll(f6);
            this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(f6);
            GL11.glPopMatrix();
        } else {
            class_0814 class_08142;
            this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(f6);
            this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(f6);
            this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(f6);
            this.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(f6);
            this.llIIlllIllIllllIIIlIIIIII.lllIIIllIIIIlllIlIIllIIll(f6);
            this.llIIllIllIlIIlIIllIllllll.lllIIIllIIIIlllIlIIllIIll(f6);
            this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(f6);
            if (!this.lIlIlIIlIIIIlIIIIIlllIIII && class_15212 instanceof class_0814 && (class_08142 = (class_0814)class_15212).lllllllIlIIlIlIIIlIlIIlll()) {
                switch (class_08142.llIllllIIIIIlIIlIlllIIlll().lIlllIlllIIIIlIIlllIllIII()) {
                    case "dragon_wings": {
                        this.IlIIIlIIIIllIIIllIIIIIIll.lllIIIllIIIIlllIlIIllIIll(class_15212, f, f2, f3, f4, f5, f6, class_08142.llIllllIIIIIlIIlIlllIIlll().IlIIIIIllllllIIlllIllllll(), class_08142.llIllllIIIIIlIIlIlllIIlll().getLocation());
                    }
                }
            }
        }
        if (class_15212 instanceof class_2174) {
            LunarClient.getInstance().getEventBus().callEvent(new class_0387(class_1880.lllIlIIlIIIlIlIIIllIlllIl, (class_2174)class_15212, this, f6));
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(float f, float f2, float f3, float f4, float f5, float f6, class_1521 class_15212) {
        float f7;
        float f8;
        this.IIIllIIlIIIIIIlIlIIllIIlI.IIIllIIlIIIIIIlIlIIllIIlI = f4 / 57.295776f;
        this.IIIllIIlIIIIIIlIlIIllIIlI.lIllllIIlIIIlIllllllIIIll = f5 / 57.295776f;
        this.IllIIlllllllIIlIIlIIIIlIl.IIIllIIlIIIIIIlIlIIllIIlI = this.IIIllIIlIIIIIIlIlIIllIIlI.IIIllIIlIIIIIIlIlIIllIIlI;
        this.IllIIlllllllIIlIIlIIIIlIl.lIllllIIlIIIlIllllllIIIll = this.IIIllIIlIIIIIIlIlIIllIIlI.lIllllIIlIIIlIllllllIIIll;
        this.IllIIIllIIIIlIlIlIllIIlll.lIllllIIlIIIlIllllllIIIll = MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f * 0.6662f + (float)Math.PI) * 2.0f * f2 * 0.5f;
        this.lIIIIlIlIIlllllIIllIIlIII.lIllllIIlIIIlIllllllIIIll = MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f * 0.6662f) * 2.0f * f2 * 0.5f;
        this.IllIIIllIIIIlIlIlIllIIlll.IllIIlllllllIIlIIlIIIIlIl = 0.0f;
        this.lIIIIlIlIIlllllIIllIIlIII.IllIIlllllllIIlIIlIIIIlIl = 0.0f;
        this.llIIlllIllIllllIIIlIIIIII.lIllllIIlIIIlIllllllIIIll = MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f * 0.6662f) * 1.4f * f2;
        this.llIIllIllIlIIlIIllIllllll.lIllllIIlIIIlIllllllIIIll = MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f * 0.6662f + (float)Math.PI) * 1.4f * f2;
        this.llIIlllIllIllllIIIlIIIIII.IIIllIIlIIIIIIlIlIIllIIlI = 0.0f;
        this.llIIllIllIlIIlIIllIllllll.IIIllIIlIIIIIIlIlIIllIIlI = 0.0f;
        this.IIIllIllIIlIlIlIlIllllIIl.IllIIlllllllIIlIIlIIIIlIl = 0.0f;
        this.IlIlllIIIIIIlIIllIIllIlll.IllIIlllllllIIlIIlIIIIlIl = 0.0f;
        this.llIIllIllIlIIlIIllIllllll.IllIIlllllllIIlIIlIIIIlIl = 0.0f;
        this.llIIllIllIlIIlIIllIllllll.IlIlllIIIIIIlIIllIIllIlll = 0.0f;
        this.llIIllIllIlIIlIIllIllllll.IlIlIIlIlIllIIlIlIIllIIIl = 0.0f;
        this.llIIllIllIlIIlIIllIllllll.lllllIlllIIllIlIIlIIIllII = 0.0f;
        this.llIIlllIllIllllIIIlIIIIII.IllIIlllllllIIlIIlIIIIlIl = 0.0f;
        this.llIIlllIllIllllIIIlIIIIII.IlIlllIIIIIIlIIllIIllIlll = 0.0f;
        this.llIIlllIllIllllIIIlIIIIII.IlIlIIlIlIllIIlIlIIllIIIl = 0.0f;
        this.llIIlllIllIllllIIIlIIIIII.lllllIlllIIllIlIIlIIIllII = 0.0f;
        this.IIIllIIlIIIIIIlIlIIllIIlI.IllIIlllllllIIlIIlIIIIlIl = 0.0f;
        this.IllIIlllllllIIlIIlIIIIlIl.IllIIlllllllIIlIIlIIIIlIl = 0.0f;
        this.IllIIIllIIIIlIlIlIllIIlll.IlIlIIlIlIllIIlIlIIllIIIl = 0.0f;
        this.lIIIIlIlIIlllllIIllIIlIII.IlIlIIlIlIllIIlIlIIllIIIl = 0.0f;
        this.IIIllIIlIIIIIIlIlIIllIIlI.IlIlIIlIlIllIIlIlIIllIIIl = 0.0f;
        this.IllIIlllllllIIlIIlIIIIlIl.IlIlIIlIlIllIIlIlIIllIIIl = 0.0f;
        if (this.lllIlIIlIIIlIlIIIllIlllIl) {
            this.IllIIIllIIIIlIlIlIllIIlll.lIllllIIlIIIlIllllllIIIll += -0.62831855f;
            this.lIIIIlIlIIlllllIIllIIlIII.lIllllIIlIIIlIllllllIIIll += -0.62831855f;
            this.llIIlllIllIllllIIIlIIIIII.lIllllIIlIIIlIllllllIIIll = -1.2566371f;
            this.llIIllIllIlIIlIIllIllllll.lIllllIIlIIIlIllllllIIIll = -1.2566371f;
            this.llIIlllIllIllllIIIlIIIIII.IIIllIIlIIIIIIlIlIIllIIlI = 0.31415927f;
            this.llIIllIllIlIIlIIllIllllll.IIIllIIlIIIIIIlIlIIllIIlI = -0.31415927f;
        }
        if (this.IlIlIIlIlIllIIlIlIIllIIIl != 0) {
            this.lIIIIlIlIIlllllIIllIIlIII.lIllllIIlIIIlIllllllIIIll = this.lIIIIlIlIIlllllIIllIIlIII.lIllllIIlIIIlIllllllIIIll * 0.5f - 0.31415927f * (float)this.IlIlIIlIlIllIIlIlIIllIIIl;
        }
        if (this.lllllIlllIIllIlIIlIIIllII != 0) {
            this.IllIIIllIIIIlIlIlIllIIlll.lIllllIIlIIIlIllllllIIIll = this.IllIIIllIIIIlIlIlIllIIlll.lIllllIIlIIIlIllllllIIIll * 0.5f - 0.31415927f * (float)this.lllllIlllIIllIlIIlIIIllII;
        }
        this.IllIIIllIIIIlIlIlIllIIlll.IIIllIIlIIIIIIlIlIIllIIlI = 0.0f;
        this.lIIIIlIlIIlllllIIllIIlIII.IIIllIIlIIIIIIlIlIIllIIlI = 0.0f;
        if (this.lllIIIllIIIIlllIlIIllIIll > -9990.0f) {
            f8 = this.lllIIIllIIIIlllIlIIllIIll;
            this.IIIllIllIIlIlIlIlIllllIIl.IIIllIIlIIIIIIlIlIIllIIlI = MathHelper.lllIIIllIIIIlllIlIIllIIll(MathHelper.IlIllllllIIlIIllllIIlIIIl(f8) * (float)Math.PI * 2.0f) * 0.2f;
            this.IllIIIllIIIIlIlIlIllIIlll.IlIIIIIllllllIIlllIllllll = MathHelper.lllIIIllIIIIlllIlIIllIIll(this.IIIllIllIIlIlIlIlIllllIIl.IIIllIIlIIIIIIlIlIIllIIlI) * 5.0f;
            this.IllIIIllIIIIlIlIlIllIIlll.IlIllllllIIlIIllllIIlIIIl = -MathHelper.lllIlIIlIIIlIlIIIllIlllIl(this.IIIllIllIIlIlIlIlIllllIIl.IIIllIIlIIIIIIlIlIIllIIlI) * 5.0f;
            this.lIIIIlIlIIlllllIIllIIlIII.IlIIIIIllllllIIlllIllllll = -MathHelper.lllIIIllIIIIlllIlIIllIIll(this.IIIllIllIIlIlIlIlIllllIIl.IIIllIIlIIIIIIlIlIIllIIlI) * 5.0f;
            this.lIIIIlIlIIlllllIIllIIlIII.IlIllllllIIlIIllllIIlIIIl = MathHelper.lllIlIIlIIIlIlIIIllIlllIl(this.IIIllIllIIlIlIlIlIllllIIl.IIIllIIlIIIIIIlIlIIllIIlI) * 5.0f;
            this.IllIIIllIIIIlIlIlIllIIlll.IIIllIIlIIIIIIlIlIIllIIlI += this.IIIllIllIIlIlIlIlIllllIIl.IIIllIIlIIIIIIlIlIIllIIlI;
            this.lIIIIlIlIIlllllIIllIIlIII.IIIllIIlIIIIIIlIlIIllIIlI += this.IIIllIllIIlIlIlIlIllllIIl.IIIllIIlIIIIIIlIlIIllIIlI;
            this.lIIIIlIlIIlllllIIllIIlIII.lIllllIIlIIIlIllllllIIIll += this.IIIllIllIIlIlIlIlIllllIIl.IIIllIIlIIIIIIlIlIIllIIlI;
            f8 = 1.0f - this.lllIIIllIIIIlllIlIIllIIll;
            f8 *= f8;
            f8 *= f8;
            f8 = 1.0f - f8;
            f7 = MathHelper.lllIIIllIIIIlllIlIIllIIll(f8 * (float)Math.PI);
            float f9 = MathHelper.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll * (float)Math.PI) * -(this.IIIllIIlIIIIIIlIlIIllIIlI.lIllllIIlIIIlIllllllIIIll - 0.7f) * 0.75f;
            this.IllIIIllIIIIlIlIlIllIIlll.lIllllIIlIIIlIllllllIIIll = (float)((double)this.IllIIIllIIIIlIlIlIllIIlll.lIllllIIlIIIlIllllllIIIll - ((double)f7 * 1.2 + (double)f9));
            this.IllIIIllIIIIlIlIlIllIIlll.IIIllIIlIIIIIIlIlIIllIIlI += this.IIIllIllIIlIlIlIlIllllIIl.IIIllIIlIIIIIIlIlIIllIIlI * 2.0f;
            this.IllIIIllIIIIlIlIlIllIIlll.IllIIlllllllIIlIIlIIIIlIl = MathHelper.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll * (float)Math.PI) * -0.4f;
        }
        if (this.IlIlIIlllIIlIllIIIlllllIl) {
            this.IIIllIllIIlIlIlIlIllllIIl.lIllllIIlIIIlIllllllIIIll = 0.5f;
            this.IllIIIllIIIIlIlIlIllIIlll.lIllllIIlIIIlIllllllIIIll += 0.4f;
            this.lIIIIlIlIIlllllIIllIIlIII.lIllllIIlIIIlIllllllIIIll += 0.4f;
            this.llIIlllIllIllllIIIlIIIIII.IlIIIIIllllllIIlllIllllll = 4.0f;
            this.llIIllIllIlIIlIIllIllllll.IlIIIIIllllllIIlllIllllll = 4.0f;
            this.llIIlllIllIllllIIIlIIIIII.lIlllIlllIIIIlIIlllIllIII = 9.0f;
            this.llIIllIllIlIIlIIllIllllll.lIlllIlllIIIIlIIlllIllIII = 9.0f;
            this.IIIllIIlIIIIIIlIlIIllIIlI.lIlllIlllIIIIlIIlllIllIII = 1.0f;
            this.IllIIlllllllIIlIIlIIIIlIl.lIlllIlllIIIIlIIlllIllIII = 1.0f;
        } else {
            this.IIIllIllIIlIlIlIlIllllIIl.lIllllIIlIIIlIllllllIIIll = 0.0f;
            this.llIIlllIllIllllIIIlIIIIII.IlIIIIIllllllIIlllIllllll = 0.1f;
            this.llIIllIllIlIIlIIllIllllll.IlIIIIIllllllIIlllIllllll = 0.1f;
            this.llIIlllIllIllllIIIlIIIIII.lIlllIlllIIIIlIIlllIllIII = 12.0f;
            this.llIIllIllIlIIlIIllIllllll.lIlllIlllIIIIlIIlllIllIII = 12.0f;
            this.IIIllIIlIIIIIIlIlIIllIIlI.lIlllIlllIIIIlIIlllIllIII = 0.0f;
            this.IllIIlllllllIIlIIlIIIIlIl.lIlllIlllIIIIlIIlllIllIII = 0.0f;
        }
        this.IllIIIllIIIIlIlIlIllIIlll.IllIIlllllllIIlIIlIIIIlIl += MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f3 * 0.09f) * 0.05f + 0.05f;
        this.lIIIIlIlIIlllllIIllIIlIII.IllIIlllllllIIlIIlIIIIlIl -= MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f3 * 0.09f) * 0.05f + 0.05f;
        this.IllIIIllIIIIlIlIlIllIIlll.lIllllIIlIIIlIllllllIIIll += MathHelper.lllIIIllIIIIlllIlIIllIIll(f3 * 0.067f) * 0.05f;
        this.lIIIIlIlIIlllllIIllIIlIII.lIllllIIlIIIlIllllllIIIll -= MathHelper.lllIIIllIIIIlllIlIIllIIll(f3 * 0.067f) * 0.05f;
        if (this.lIIlIIIIIlIlllIlIIlIlIlll) {
            f8 = 0.0f;
            f7 = 0.0f;
            this.IllIIIllIIIIlIlIlIllIIlll.IllIIlllllllIIlIIlIIIIlIl = 0.0f;
            this.lIIIIlIlIIlllllIIllIIlIII.IllIIlllllllIIlIIlIIIIlIl = 0.0f;
            this.IllIIIllIIIIlIlIlIllIIlll.IIIllIIlIIIIIIlIlIIllIIlI = -(0.1f - f8 * 0.6f) + this.IIIllIIlIIIIIIlIlIIllIIlI.IIIllIIlIIIIIIlIlIIllIIlI;
            this.lIIIIlIlIIlllllIIllIIlIII.IIIllIIlIIIIIIlIlIIllIIlI = 0.1f - f8 * 0.6f + this.IIIllIIlIIIIIIlIlIIllIIlI.IIIllIIlIIIIIIlIlIIllIIlI + 0.4f;
            this.IllIIIllIIIIlIlIlIllIIlll.lIllllIIlIIIlIllllllIIIll = -1.5707964f + this.IIIllIIlIIIIIIlIlIIllIIlI.lIllllIIlIIIlIllllllIIIll;
            this.lIIIIlIlIIlllllIIllIIlIII.lIllllIIlIIIlIllllllIIIll = -1.5707964f + this.IIIllIIlIIIIIIlIlIIllIIlI.lIllllIIlIIIlIllllllIIIll;
            this.IllIIIllIIIIlIlIlIllIIlll.lIllllIIlIIIlIllllllIIIll -= f8 * 1.2f - f7 * 0.4f;
            this.lIIIIlIlIIlllllIIllIIlIII.lIllllIIlIIIlIllllllIIIll -= f8 * 1.2f - f7 * 0.4f;
            this.IllIIIllIIIIlIlIlIllIIlll.IllIIlllllllIIlIIlIIIIlIl += MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f3 * 0.09f) * 0.05f + 0.05f;
            this.lIIIIlIlIIlllllIIllIIlIII.IllIIlllllllIIlIIlIIIIlIl -= MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f3 * 0.09f) * 0.05f + 0.05f;
            this.IllIIIllIIIIlIlIlIllIIlll.lIllllIIlIIIlIllllllIIIll += MathHelper.lllIIIllIIIIlllIlIIllIIll(f3 * 0.067f) * 0.05f;
            this.lIIIIlIlIIlllllIIllIIlIII.lIllllIIlIIIlIllllllIIIll -= MathHelper.lllIIIllIIIIlllIlIIllIIll(f3 * 0.067f) * 0.05f;
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(float f) {
        this.lllIIlIIIllllllIIIIlIlIlI.IIIllIIlIIIIIIlIlIIllIIlI = this.IIIllIIlIIIIIIlIlIIllIIlI.IIIllIIlIIIIIIlIlIIllIIlI;
        this.lllIIlIIIllllllIIIIlIlIlI.lIllllIIlIIIlIllllllIIIll = this.IIIllIIlIIIIIIlIlIIllIIlI.lIllllIIlIIIlIllllllIIIll;
        this.lllIIlIIIllllllIIIIlIlIlI.IlIllllllIIlIIllllIIlIIIl = 0.0f;
        this.lllIIlIIIllllllIIIIlIlIlI.lIlllIlllIIIIlIIlllIllIII = 0.0f;
        this.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(f);
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(float f) {
        this.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(f);
    }
}

