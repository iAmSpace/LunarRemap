package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class class_0535
extends class_2052 {
    public void lllIIIllIIIIlllIlIIllIIll(class_0933 class_09332, double d, double d2, double d3, float f) {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)((float)d + 0.5f), (float)((float)d2), (float)((float)d3 + 0.5f));
        class_0535.lllIIIllIIIIlllIlIIllIIll(class_09332.lllIIIllIIIIlllIlIIllIIll(), d, d2, d3, f);
        GL11.glPopMatrix();
    }

    public static void lllIIIllIIIIlllIlIIllIIll(class_0526 class_05262, double d, double d2, double d3, float f) {
        class_1521 class_15212 = class_05262.IllIIlllllllIIlIIlIIIIlIl();
        if (class_15212 != null) {
            class_15212.lllIIIllIIIIlllIlIIllIIll(class_05262.lllIIIllIIIIlllIlIIllIIll());
            float f2 = 0.4375f;
            GL11.glTranslatef((float)0.0f, (float)0.4f, (float)0.0f);
            GL11.glRotatef((float)((float)(class_05262.lIlllIlllIIIIlIIlllIllIII + (class_05262.IlIllllllIIlIIllllIIlIIIl - class_05262.lIlllIlllIIIIlIIlllIllIII) * (double)f) * 10.0f), (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)-30.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glTranslatef((float)0.0f, (float)-0.4f, (float)0.0f);
            GL11.glScalef((float)f2, (float)f2, (float)f2);
            class_15212.lllIlIIlIIIlIlIIIllIlllIl(d, d2, d3, 0.0f, 0.0f);
            class_2114.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(class_15212, 0.0, 0.0, 0.0, 0.0f, f);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1774 class_17742, double d, double d2, double d3, float f) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0933)class_17742, d, d2, d3, f);
    }
}

