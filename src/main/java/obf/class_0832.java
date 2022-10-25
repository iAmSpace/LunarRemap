package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class class_0832
extends class_1382 {
    private ResourceLocation IIIllIIlIIIIIIlIlIIllIIlI = new ResourceLocation("textures/entity/enderdragon/dragon.png");
    private class_0744 IllIIlllllllIIlIIlIIIIlIl;
    private class_0744 IIIllIllIIlIlIlIlIllllIIl;

    public class_0832(float f) {
        this.IlIIIIIllllllIIlllIllllll = 256;
        this.lIllllIIlIIIlIllllllIIIll = 256;
        this.lllIIIllIIIIlllIlIIllIIll("wing.skin", -56, 88);
        this.lllIIIllIIIIlllIlIIllIIll("wingtip.skin", -56, 144);
        this.lllIIIllIIIIlllIlIIllIIll("wing.bone", 112, 88);
        this.lllIIIllIIIIlllIlIIllIIll("wingtip.bone", 112, 136);
        this.IllIIlllllllIIlIIlIIIIlIl = new class_0744(this, "wing");
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(-12.0f, 5.0f, 2.0f);
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll("bone", -56.0f, -4.0f, -4.0f, 56, 8, 8);
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll("skin", -56.0f, 0.0f, 2.0f, 56, 0, 56);
        this.IIIllIllIIlIlIlIlIllllIIl = new class_0744(this, "wingtip");
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(-56.0f, 0.0f, 0.0f);
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll("bone", -56.0f, -2.0f, -2.0f, 56, 4, 4);
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll("skin", -56.0f, 0.0f, 2.0f, 56, 0, 56);
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(this.IIIllIllIIlIlIlIlIllllIIl);
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, float f, float f2, float f3, float f4, float f5, float f6, float f7, ResourceLocation class_17732) {
        if (!(class_15212 instanceof class_0814)) {
            return;
        }
        class_0814 class_08142 = (class_0814)class_15212;
        Minecraft.getMinecraft().llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(class_17732);
        GL11.glPushMatrix();
        GL11.glScaled((double)f7, (double)f7, (double)f7);
        GL11.glRotatef((float)15.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        GL11.glTranslatef((float)0.0f, (float)0.5f, (float)0.25f);
        class_08142.IIlIlIIIIlIlllIlIlIIIIIlI = class_08142.IIlIlIIIIlIlllIlIlIIIIIlI >= 6.0f ? 0.0f : (class_08142.IIlIlIIIIlIlllIlIlIIIIIlI += 3.25f / (1.0f + (float) Minecraft.IlIIlllllIIlIlIlllllIllll));
        for (int i = 0; i < 2; ++i) {
            GL11.glEnable((int)2884);
            float f8 = 36.0f + class_08142.IIlIlIIIIlIlllIlIlIIIIIlI;
            this.IllIIlllllllIIlIIlIIIIlIl.lIllllIIlIIIlIllllllIIIll = -0.125f - (float)Math.cos(f8) * 0.2f;
            this.IllIIlllllllIIlIIlIIIIlIl.IIIllIIlIIIIIIlIlIIllIIlI = 0.75f;
            this.IllIIlllllllIIlIIlIIIIlIl.IllIIlllllllIIlIIlIIIIlIl = (float)(Math.sin(f8) + 0.125) * 0.8f;
            this.IIIllIllIIlIlIlIlIllllIIl.IllIIlllllllIIlIIlIIIIlIl = (float)(Math.sin(f8 + 2.0f) + 0.5) * 0.75f;
            this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(f6);
            GL11.glScalef((float)-1.0f, (float)1.0f, (float)1.0f);
            if (i != 0) continue;
            GL11.glCullFace((int)1028);
        }
        GL11.glPopMatrix();
        GL11.glCullFace((int)1029);
        GL11.glDisable((int)2884);
    }
}

