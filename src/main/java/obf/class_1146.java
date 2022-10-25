package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class class_1146
extends class_1382 {
    private class_0744 IIIllIIlIIIIIIlIlIIllIIlI;
    private class_0744 IllIIlllllllIIlIIlIIIIlIl = new class_0744(this, "glass");
    private class_0744 IIIllIllIIlIlIlIlIllllIIl;

    public class_1146(float f, boolean bl) {
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(0, 0).lllIIIllIIIIlllIlIIllIIll(-4.0f, -4.0f, -4.0f, 8, 8, 8);
        this.IIIllIIlIIIIIIlIlIIllIIlI = new class_0744(this, "cube");
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(32, 0).lllIIIllIIIIlllIlIIllIIll(-4.0f, -4.0f, -4.0f, 8, 8, 8);
        if (bl) {
            this.IIIllIllIIlIlIlIlIllllIIl = new class_0744(this, "base");
            this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(0, 16).lllIIIllIIIIlllIlIIllIIll(-6.0f, 0.0f, -6.0f, 12, 4, 12);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, float f, float f2, float f3, float f4, float f5, float f6) {
        GL11.glPushMatrix();
        GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
        GL11.glTranslatef((float)0.0f, (float)-0.5f, (float)0.0f);
        if (this.IIIllIllIIlIlIlIlIllllIIl != null) {
            this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(f6);
        }
        GL11.glRotatef((float)f2, (float)0.0f, (float)1.0f, (float)0.0f);
        GL11.glTranslatef((float)0.0f, (float)(0.8f + f3), (float)0.0f);
        GL11.glRotatef((float)60.0f, (float)0.7071f, (float)0.0f, (float)0.7071f);
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(f6);
        float f7 = 0.875f;
        GL11.glScalef((float)f7, (float)f7, (float)f7);
        GL11.glRotatef((float)60.0f, (float)0.7071f, (float)0.0f, (float)0.7071f);
        GL11.glRotatef((float)f2, (float)0.0f, (float)1.0f, (float)0.0f);
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(f6);
        GL11.glScalef((float)f7, (float)f7, (float)f7);
        GL11.glRotatef((float)60.0f, (float)0.7071f, (float)0.0f, (float)0.7071f);
        GL11.glRotatef((float)f2, (float)0.0f, (float)1.0f, (float)0.0f);
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(f6);
        GL11.glPopMatrix();
    }
}

