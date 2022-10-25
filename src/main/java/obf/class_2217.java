package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class class_2217
extends class_1382 {
    private class_0744 IIIllIIlIIIIIIlIlIIllIIlI;
    private class_0744 IllIIlllllllIIlIIlIIIIlIl;
    private class_0744 IIIllIllIIlIlIlIlIllllIIl;
    private class_0744 IllIIIllIIIIlIlIlIllIIlll;
    private class_0744 lIIIIlIlIIlllllIIllIIlIII;
    private class_0744 llIIlllIllIllllIIIlIIIIII;
    private class_0744 llIIllIllIlIIlIIllIllllll;
    private class_0744 lllIIlIIIllllllIIIIlIlIlI;
    private class_0744 IlIlllIIIIIIlIIllIIllIlll;
    private class_0744 IlIlIIlIlIllIIlIlIIllIIIl;
    private class_0744 lllllIlllIIllIlIIlIIIllII;
    private class_0744 IlIlIIlllIIlIllIIIlllllIl;
    private float lIIlIIIIIlIlllIlIIlIlIlll;

    public class_2217(float f) {
        this.IlIIIIIllllllIIlllIllllll = 256;
        this.lIllllIIlIIIlIllllllIIIll = 256;
        this.lllIIIllIIIIlllIlIIllIIll("body.body", 0, 0);
        this.lllIIIllIIIIlllIlIIllIIll("wing.skin", -56, 88);
        this.lllIIIllIIIIlllIlIIllIIll("wingtip.skin", -56, 144);
        this.lllIIIllIIIIlllIlIIllIIll("rearleg.main", 0, 0);
        this.lllIIIllIIIIlllIlIIllIIll("rearfoot.main", 112, 0);
        this.lllIIIllIIIIlllIlIIllIIll("rearlegtip.main", 196, 0);
        this.lllIIIllIIIIlllIlIIllIIll("head.upperhead", 112, 30);
        this.lllIIIllIIIIlllIlIIllIIll("wing.bone", 112, 88);
        this.lllIIIllIIIIlllIlIIllIIll("head.upperlip", 176, 44);
        this.lllIIIllIIIIlllIlIIllIIll("jaw.jaw", 176, 65);
        this.lllIIIllIIIIlllIlIIllIIll("frontleg.main", 112, 104);
        this.lllIIIllIIIIlllIlIIllIIll("wingtip.bone", 112, 136);
        this.lllIIIllIIIIlllIlIIllIIll("frontfoot.main", 144, 104);
        this.lllIIIllIIIIlllIlIIllIIll("neck.box", 192, 104);
        this.lllIIIllIIIIlllIlIIllIIll("frontlegtip.main", 226, 138);
        this.lllIIIllIIIIlllIlIIllIIll("body.scale", 220, 53);
        this.lllIIIllIIIIlllIlIIllIIll("head.scale", 0, 0);
        this.lllIIIllIIIIlllIlIIllIIll("neck.scale", 48, 0);
        this.lllIIIllIIIIlllIlIIllIIll("head.nostril", 112, 0);
        float f2 = -16.0f;
        this.IIIllIIlIIIIIIlIlIIllIIlI = new class_0744(this, "head");
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll("upperlip", -6.0f, -1.0f, -8.0f + f2, 12, 5, 16);
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll("upperhead", -8.0f, -8.0f, 6.0f + f2, 16, 16, 16);
        this.IIIllIIlIIIIIIlIlIIllIIlI.IIIllIllIIlIlIlIlIllllIIl = true;
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll("scale", -5.0f, -12.0f, 12.0f + f2, 2, 4, 6);
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll("nostril", -5.0f, -3.0f, -6.0f + f2, 2, 2, 4);
        this.IIIllIIlIIIIIIlIlIIllIIlI.IIIllIllIIlIlIlIlIllllIIl = false;
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll("scale", 3.0f, -12.0f, 12.0f + f2, 2, 4, 6);
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll("nostril", 3.0f, -3.0f, -6.0f + f2, 2, 2, 4);
        this.IIIllIllIIlIlIlIlIllllIIl = new class_0744(this, "jaw");
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(0.0f, 4.0f, 8.0f + f2);
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll("jaw", -6.0f, 0.0f, -16.0f, 12, 4, 16);
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(this.IIIllIllIIlIlIlIlIllllIIl);
        this.IllIIlllllllIIlIIlIIIIlIl = new class_0744(this, "neck");
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll("box", -5.0f, -5.0f, -5.0f, 10, 10, 10);
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll("scale", -1.0f, -9.0f, -3.0f, 2, 4, 6);
        this.IllIIIllIIIIlIlIlIllIIlll = new class_0744(this, "body");
        this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(0.0f, 4.0f, 8.0f);
        this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll("body", -12.0f, 0.0f, -16.0f, 24, 24, 64);
        this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll("scale", -1.0f, -6.0f, -10.0f, 2, 6, 12);
        this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll("scale", -1.0f, -6.0f, 10.0f, 2, 6, 12);
        this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll("scale", -1.0f, -6.0f, 30.0f, 2, 6, 12);
        this.lllllIlllIIllIlIIlIIIllII = new class_0744(this, "wing");
        this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(-12.0f, 5.0f, 2.0f);
        this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll("bone", -56.0f, -4.0f, -4.0f, 56, 8, 8);
        this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll("skin", -56.0f, 0.0f, 2.0f, 56, 0, 56);
        this.IlIlIIlllIIlIllIIIlllllIl = new class_0744(this, "wingtip");
        this.IlIlIIlllIIlIllIIIlllllIl.lllIIIllIIIIlllIlIIllIIll(-56.0f, 0.0f, 0.0f);
        this.IlIlIIlllIIlIllIIIlllllIl.lllIIIllIIIIlllIlIIllIIll("bone", -56.0f, -2.0f, -2.0f, 56, 4, 4);
        this.IlIlIIlllIIlIllIIIlllllIl.lllIIIllIIIIlllIlIIllIIll("skin", -56.0f, 0.0f, 2.0f, 56, 0, 56);
        this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(this.IlIlIIlllIIlIllIIIlllllIl);
        this.llIIlllIllIllllIIIlIIIIII = new class_0744(this, "frontleg");
        this.llIIlllIllIllllIIIlIIIIII.lllIIIllIIIIlllIlIIllIIll(-12.0f, 20.0f, 2.0f);
        this.llIIlllIllIllllIIIlIIIIII.lllIIIllIIIIlllIlIIllIIll("main", -4.0f, -4.0f, -4.0f, 8, 24, 8);
        this.lllIIlIIIllllllIIIIlIlIlI = new class_0744(this, "frontlegtip");
        this.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(0.0f, 20.0f, -1.0f);
        this.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll("main", -3.0f, -1.0f, -3.0f, 6, 24, 6);
        this.llIIlllIllIllllIIIlIIIIII.lllIIIllIIIIlllIlIIllIIll(this.lllIIlIIIllllllIIIIlIlIlI);
        this.IlIlIIlIlIllIIlIlIIllIIIl = new class_0744(this, "frontfoot");
        this.IlIlIIlIlIllIIlIlIIllIIIl.lllIIIllIIIIlllIlIIllIIll(0.0f, 23.0f, 0.0f);
        this.IlIlIIlIlIllIIlIlIIllIIIl.lllIIIllIIIIlllIlIIllIIll("main", -4.0f, 0.0f, -12.0f, 8, 4, 16);
        this.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(this.IlIlIIlIlIllIIlIlIIllIIIl);
        this.lIIIIlIlIIlllllIIllIIlIII = new class_0744(this, "rearleg");
        this.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(-16.0f, 16.0f, 42.0f);
        this.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll("main", -8.0f, -4.0f, -8.0f, 16, 32, 16);
        this.llIIllIllIlIIlIIllIllllll = new class_0744(this, "rearlegtip");
        this.llIIllIllIlIIlIIllIllllll.lllIIIllIIIIlllIlIIllIIll(0.0f, 32.0f, -4.0f);
        this.llIIllIllIlIIlIIllIllllll.lllIIIllIIIIlllIlIIllIIll("main", -6.0f, -2.0f, 0.0f, 12, 32, 12);
        this.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(this.llIIllIllIlIIlIIllIllllll);
        this.IlIlllIIIIIIlIIllIIllIlll = new class_0744(this, "rearfoot");
        this.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(0.0f, 31.0f, 4.0f);
        this.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll("main", -9.0f, 0.0f, -20.0f, 18, 6, 24);
        this.llIIllIllIlIIlIIllIllllll.lllIIIllIIIIlllIlIIllIIll(this.IlIlllIIIIIIlIIllIIllIlll);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652, float f, float f2, float f3) {
        this.lIIlIIIIIlIlllIlIIlIlIlll = f3;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, float f, float f2, float f3, float f4, float f5, float f6) {
        float f7;
        GL11.glPushMatrix();
        class_1221 class_12212 = (class_1221)class_15212;
        float f8 = class_12212.IIIllIIIlIlllllllIIIlllll + (class_12212.lIlIlllIllllIIlllIlllIIIl - class_12212.IIIllIIIlIlllllllIIIlllll) * this.lIIlIIIIIlIlllIlIIlIlIlll;
        this.IIIllIllIIlIlIlIlIllllIIl.lIllllIIlIIIlIllllllIIIll = (float)(Math.sin(f8 * (float)Math.PI * 2.0f) + 1.0) * 0.2f;
        float f9 = (float)(Math.sin(f8 * (float)Math.PI * 2.0f - 1.0f) + 1.0);
        f9 = (f9 * f9 * 1.0f + f9 * 2.0f) * 0.05f;
        GL11.glTranslatef((float)0.0f, (float)(f9 - 2.0f), (float)-3.0f);
        GL11.glRotatef((float)(f9 * 2.0f), (float)1.0f, (float)0.0f, (float)0.0f);
        float f10 = -30.0f;
        float f11 = 0.0f;
        float f12 = 1.5f;
        double[] arrd = class_12212.lllIlIIlIIIlIlIIIllIlllIl(6, this.lIIlIIIIIlIlllIlIIlIlIlll);
        float f13 = this.lllIIIllIIIIlllIlIIllIIll(class_12212.lllIlIIlIIIlIlIIIllIlllIl(5, this.lIIlIIIIIlIlllIlIIlIlIlll)[0] - class_12212.lllIlIIlIIIlIlIIIllIlllIl(10, this.lIIlIIIIIlIlllIlIIlIlIlll)[0]);
        float f14 = this.lllIIIllIIIIlllIlIIllIIll(class_12212.lllIlIIlIIIlIlIIIllIlllIl(5, this.lIIlIIIIIlIlllIlIIlIlIlll)[0] + (double)(f13 / 2.0f));
        f10 += 2.0f;
        float f15 = f8 * (float)Math.PI * 2.0f;
        f10 = 20.0f;
        float f16 = -12.0f;
        for (int i = 0; i < 5; ++i) {
            double[] arrd2 = class_12212.lllIlIIlIIIlIlIIIllIlllIl(5 - i, this.lIIlIIIIIlIlllIlIIlIlIlll);
            f7 = (float)Math.cos((float)i * 0.45f + f15) * 0.15f;
            this.IllIIlllllllIIlIIlIIIIlIl.IIIllIIlIIIIIIlIlIIllIIlI = this.lllIIIllIIIIlllIlIIllIIll(arrd2[0] - arrd[0]) * (float)Math.PI / 180.0f * f12;
            this.IllIIlllllllIIlIIlIIIIlIl.lIllllIIlIIIlIllllllIIIll = f7 + (float)(arrd2[1] - arrd[1]) * (float)Math.PI / 180.0f * f12 * 5.0f;
            this.IllIIlllllllIIlIIlIIIIlIl.IllIIlllllllIIlIIlIIIIlIl = -this.lllIIIllIIIIlllIlIIllIIll(arrd2[0] - (double)f14) * (float)Math.PI / 180.0f * f12;
            this.IllIIlllllllIIlIIlIIIIlIl.lIlllIlllIIIIlIIlllIllIII = f10;
            this.IllIIlllllllIIlIIlIIIIlIl.IlIIIIIllllllIIlllIllllll = f16;
            this.IllIIlllllllIIlIIlIIIIlIl.IlIllllllIIlIIllllIIlIIIl = f11;
            f10 = (float)((double)f10 + Math.sin(this.IllIIlllllllIIlIIlIIIIlIl.lIllllIIlIIIlIllllllIIIll) * 10.0);
            f16 = (float)((double)f16 - Math.cos(this.IllIIlllllllIIlIIlIIIIlIl.IIIllIIlIIIIIIlIlIIllIIlI) * Math.cos(this.IllIIlllllllIIlIIlIIIIlIl.lIllllIIlIIIlIllllllIIIll) * 10.0);
            f11 = (float)((double)f11 - Math.sin(this.IllIIlllllllIIlIIlIIIIlIl.IIIllIIlIIIIIIlIlIIllIIlI) * Math.cos(this.IllIIlllllllIIlIIlIIIIlIl.lIllllIIlIIIlIllllllIIIll) * 10.0);
            this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(f6);
        }
        this.IIIllIIlIIIIIIlIlIIllIIlI.lIlllIlllIIIIlIIlllIllIII = f10;
        this.IIIllIIlIIIIIIlIlIIllIIlI.IlIIIIIllllllIIlllIllllll = f16;
        this.IIIllIIlIIIIIIlIlIIllIIlI.IlIllllllIIlIIllllIIlIIIl = f11;
        double[] arrd3 = class_12212.lllIlIIlIIIlIlIIIllIlllIl(0, this.lIIlIIIIIlIlllIlIIlIlIlll);
        this.IIIllIIlIIIIIIlIlIIllIIlI.IIIllIIlIIIIIIlIlIIllIIlI = this.lllIIIllIIIIlllIlIIllIIll(arrd3[0] - arrd[0]) * (float)Math.PI / 180.0f * 1.0f;
        this.IIIllIIlIIIIIIlIlIIllIIlI.IllIIlllllllIIlIIlIIIIlIl = -this.lllIIIllIIIIlllIlIIllIIll(arrd3[0] - (double)f14) * (float)Math.PI / 180.0f * 1.0f;
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(f6);
        GL11.glPushMatrix();
        GL11.glTranslatef((float)0.0f, (float)1.0f, (float)0.0f);
        GL11.glRotatef((float)(-f13 * f12 * 1.0f), (float)0.0f, (float)0.0f, (float)1.0f);
        GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)0.0f);
        this.IllIIIllIIIIlIlIlIllIIlll.IllIIlllllllIIlIIlIIIIlIl = 0.0f;
        this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(f6);
        for (int i = 0; i < 2; ++i) {
            GL11.glEnable((int)2884);
            f7 = f8 * (float)Math.PI * 2.0f;
            this.lllllIlllIIllIlIIlIIIllII.lIllllIIlIIIlIllllllIIIll = 0.125f - (float)Math.cos(f7) * 0.2f;
            this.lllllIlllIIllIlIIlIIIllII.IIIllIIlIIIIIIlIlIIllIIlI = 0.25f;
            this.lllllIlllIIllIlIIlIIIllII.IllIIlllllllIIlIIlIIIIlIl = (float)(Math.sin(f7) + 0.125) * 0.8f;
            this.IlIlIIlllIIlIllIIIlllllIl.IllIIlllllllIIlIIlIIIIlIl = -((float)(Math.sin(f7 + 2.0f) + 0.5)) * 0.75f;
            this.lIIIIlIlIIlllllIIllIIlIII.lIllllIIlIIIlIllllllIIIll = 1.0f + f9 * 0.1f;
            this.llIIllIllIlIIlIIllIllllll.lIllllIIlIIIlIllllllIIIll = 0.5f + f9 * 0.1f;
            this.IlIlllIIIIIIlIIllIIllIlll.lIllllIIlIIIlIllllllIIIll = 0.75f + f9 * 0.1f;
            this.llIIlllIllIllllIIIlIIIIII.lIllllIIlIIIlIllllllIIIll = 1.3f + f9 * 0.1f;
            this.lllIIlIIIllllllIIIIlIlIlI.lIllllIIlIIIlIllllllIIIll = -0.5f - f9 * 0.1f;
            this.IlIlIIlIlIllIIlIlIIllIIIl.lIllllIIlIIIlIllllllIIIll = 0.75f + f9 * 0.1f;
            this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(f6);
            this.llIIlllIllIllllIIIlIIIIII.lllIIIllIIIIlllIlIIllIIll(f6);
            this.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(f6);
            GL11.glScalef((float)-1.0f, (float)1.0f, (float)1.0f);
            if (i != 0) continue;
            GL11.glCullFace((int)1028);
        }
        GL11.glPopMatrix();
        GL11.glCullFace((int)1029);
        GL11.glDisable((int)2884);
        float f17 = -((float)Math.sin(f8 * (float)Math.PI * 2.0f)) * 0.0f;
        f15 = f8 * (float)Math.PI * 2.0f;
        f10 = 10.0f;
        f16 = 60.0f;
        f11 = 0.0f;
        arrd = class_12212.lllIlIIlIIIlIlIIIllIlllIl(11, this.lIIlIIIIIlIlllIlIIlIlIlll);
        for (int i = 0; i < 12; ++i) {
            arrd3 = class_12212.lllIlIIlIIIlIlIIIllIlllIl(12 + i, this.lIIlIIIIIlIlllIlIIlIlIlll);
            f17 = (float)((double)f17 + Math.sin((float)i * 0.45f + f15) * (double)0.05f);
            this.IllIIlllllllIIlIIlIIIIlIl.IIIllIIlIIIIIIlIlIIllIIlI = (this.lllIIIllIIIIlllIlIIllIIll(arrd3[0] - arrd[0]) * f12 + 180.0f) * (float)Math.PI / 180.0f;
            this.IllIIlllllllIIlIIlIIIIlIl.lIllllIIlIIIlIllllllIIIll = f17 + (float)(arrd3[1] - arrd[1]) * (float)Math.PI / 180.0f * f12 * 5.0f;
            this.IllIIlllllllIIlIIlIIIIlIl.IllIIlllllllIIlIIlIIIIlIl = this.lllIIIllIIIIlllIlIIllIIll(arrd3[0] - (double)f14) * (float)Math.PI / 180.0f * f12;
            this.IllIIlllllllIIlIIlIIIIlIl.lIlllIlllIIIIlIIlllIllIII = f10;
            this.IllIIlllllllIIlIIlIIIIlIl.IlIIIIIllllllIIlllIllllll = f16;
            this.IllIIlllllllIIlIIlIIIIlIl.IlIllllllIIlIIllllIIlIIIl = f11;
            f10 = (float)((double)f10 + Math.sin(this.IllIIlllllllIIlIIlIIIIlIl.lIllllIIlIIIlIllllllIIIll) * 10.0);
            f16 = (float)((double)f16 - Math.cos(this.IllIIlllllllIIlIIlIIIIlIl.IIIllIIlIIIIIIlIlIIllIIlI) * Math.cos(this.IllIIlllllllIIlIIlIIIIlIl.lIllllIIlIIIlIllllllIIIll) * 10.0);
            f11 = (float)((double)f11 - Math.sin(this.IllIIlllllllIIlIIlIIIIlIl.IIIllIIlIIIIIIlIlIIllIIlI) * Math.cos(this.IllIIlllllllIIlIIlIIIIlIl.lIllllIIlIIIlIllllllIIIll) * 10.0);
            this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(f6);
        }
        GL11.glPopMatrix();
    }

    private float lllIIIllIIIIlllIlIIllIIll(double d) {
        while (d >= 180.0) {
            d -= 360.0;
        }
        while (d < -180.0) {
            d += 360.0;
        }
        return (float)d;
    }
}

