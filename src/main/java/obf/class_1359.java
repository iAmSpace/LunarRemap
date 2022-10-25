package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class class_1359
extends class_2052 {
    private static final ResourceLocation lllIIIllIIIIlllIlIIllIIll = new ResourceLocation("textures/entity/chest/ender.png");
    private class_0686 IlIllllllIIlIIllllIIlIIIl = new class_0686();

    public void lllIIIllIIIIlllIlIIllIIll(class_1314 class_13142, double d, double d2, double d3, float f) {
        int n = 0;
        if (class_13142.lllIlIIlIIIlIlIIIllIlllIl()) {
            n = class_13142.lIlllIlllIIIIlIIlllIllIII();
        }
        this.lllIIIllIIIIlllIlIIllIIll(lllIIIllIIIIlllIlIIllIIll);
        GL11.glPushMatrix();
        GL11.glEnable((int)32826);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glTranslatef((float)((float)d), (float)((float)d2 + 1.0f), (float)((float)d3 + 1.0f));
        GL11.glScalef((float)1.0f, (float)-1.0f, (float)-1.0f);
        GL11.glTranslatef((float)0.5f, (float)0.5f, (float)0.5f);
        int n2 = 0;
        if (n == 2) {
            n2 = 180;
        }
        if (n == 3) {
            n2 = 0;
        }
        if (n == 4) {
            n2 = 90;
        }
        if (n == 5) {
            n2 = -90;
        }
        GL11.glRotatef((float)n2, (float)0.0f, (float)1.0f, (float)0.0f);
        GL11.glTranslatef((float)-0.5f, (float)-0.5f, (float)-0.5f);
        float f2 = class_13142.IIIllIllIIlIlIlIlIllllIIl + (class_13142.IllIIlllllllIIlIIlIIIIlIl - class_13142.IIIllIllIIlIlIlIlIllllIIl) * f;
        f2 = 1.0f - f2;
        f2 = 1.0f - f2 * f2 * f2;
        this.IlIllllllIIlIIllllIIlIIIl.IIIllIIlIIIIIIlIlIIllIIlI.lIllllIIlIIIlIllllllIIIll = -(f2 * (float)Math.PI / 2.0f);
        this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll();
        GL11.glDisable((int)32826);
        GL11.glPopMatrix();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1774 class_17742, double d, double d2, double d3, float f) {
        this.lllIIIllIIIIlllIlIIllIIll((class_1314)class_17742, d, d2, d3, f);
    }
}

