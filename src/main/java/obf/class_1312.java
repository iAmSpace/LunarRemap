package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class class_1312
extends class_0270 {
    private double lllIlIIlIIIlIlIIIllIlllIl;
    private float IlIllllllIIlIIllllIIlIIIl = 0.0f;
    private ResourceLocation lIlllIlllIIIIlIIlllIllIII = new ResourceLocation("client/logo_1024.png");

    @Override
    public void n_() {
        int n = this.lIIlIIIIIlIlllIlIIlIlIlll / 4 + 48;
        this.lllIIIllIIIIlllIlIIllIIll(n, 24);
        super.n_();
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
        super.IlIllllllIIlIIllllIIlIIIl();
        this.lllIlIIlIIIlIlIIIllIlllIl += 0.06283185307179587;
        this.IlIllllllIIlIIllllIIlIIIl = (float)((Math.sin(this.lllIlIIlIIIlIlIIIllIlllIl) / 2.0 + 0.5) * 180.0);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
        super.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        GL11.glPushMatrix();
        GL11.glTranslatef((float)0.0f, (float)20.0f, (float)0.0f);
        class_1312.lllIIIllIIIIlllIlIIllIIll(this.IlIlIIlllIIlIllIIIlllllIl / 2 - 71, this.lIIlIIIIIlIlllIlIIlIlIlll / 4 - 40, this.IlIlIIlllIIlIllIIIlllllIl / 2 + 71, this.lIIlIIIIIlIlllIlIIlIlIlll / 4 + 110, -1342177281);
        class_1312.lllIIIllIIIIlllIlIIllIIll(this.IlIlIIlllIIlIllIIIlllllIl / 2 - 73, this.lIIlIIIIIlIlllIlIIlIlIlll / 4 - 42, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 71, this.lIIlIIIIIlIlllIlIIlIlIlll / 4 + 112, 0x3FFFFFFF);
        class_1312.lllIIIllIIIIlllIlIIllIIll(this.IlIlIIlllIIlIllIIIlllllIl / 2 + 71, this.lIIlIIIIIlIlllIlIIlIlIlll / 4 - 42, this.IlIlIIlllIIlIllIIIlllllIl / 2 + 73, this.lIIlIIIIIlIlllIlIIlIlIlll / 4 + 112, 0x3FFFFFFF);
        class_1312.lllIIIllIIIIlllIlIIllIIll(this.IlIlIIlllIIlIllIIIlllllIl / 2 - 71, this.lIIlIIIIIlIlllIlIIlIlIlll / 4 + 110, this.IlIlIIlllIIlIllIIIlllllIl / 2 + 71, this.lIIlIIIIIlIlllIlIIlIlIlll / 4 + 112, 0x3FFFFFFF);
        class_1312.lllIIIllIIIIlllIlIIllIIll(this.IlIlIIlllIIlIllIIIlllllIl / 2 - 71, this.lIIlIIIIIlIlllIlIIlIlIlll / 4 - 42, this.IlIlIIlllIIlIllIIIlllllIl / 2 + 71, this.lIIlIIIIIlIlllIlIIlIlIlll / 4 - 40, 0x3FFFFFFF);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)0.9f);
        GL11.glPushMatrix();
        float f2 = 0.65f;
        GL11.glScalef((float)f2, (float)f2, (float)f2);
        GL11.glPushMatrix();
        GL11.glTranslatef((float)(((float)(this.IlIlIIlllIIlIllIIIlllllIl / 2) - 40.0f * f2) / f2), (float)(((float)(this.lIIlIIIIIlIlllIlIIlIlIlll / 4) - 40.0f * f2) / f2), (float)0.0f);
        int n3 = 64;
        GL11.glTranslatef((float)n3, (float)n3, (float)n3);
        GL11.glRotatef((float)this.IlIllllllIIlIIllllIIlIIIl, (float)0.0f, (float)0.0f, (float)1.0f);
        GL11.glTranslatef((float)(-n3), (float)(-n3), (float)(-n3));
        class_0857.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII, (float)n3, 0.0f, 0.0f);
        GL11.glPopMatrix();
        GL11.glPopMatrix();
        GL11.glPopMatrix();
        class_08682.IlIllllllIIlIIllllIIlIIIl(-1);
        super.lllIlIIlIIIlIlIIIllIlllIl(n, n2);
    }
}

