package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.nio.FloatBuffer;
import org.lwjgl.opengl.GL11;

public class class_0624 {
    private static FloatBuffer lllIIIllIIIIlllIlIIllIIll = class_0994.IlIIIIIllllllIIlllIllllll(16);
    private static final class_0864 lllIlIIlIIIlIlIIIllIlllIl = class_0864.lllIIIllIIIIlllIlIIllIIll(0.2f, 1.0, -0.7f).lllIIIllIIIIlllIlIIllIIll();
    private static final class_0864 IlIllllllIIlIIllllIIlIIIl = class_0864.lllIIIllIIIIlllIlIIllIIll(-0.2f, 1.0, 0.7f).lllIIIllIIIIlllIlIIllIIll();

    public static void lllIIIllIIIIlllIlIIllIIll() {
        GL11.glDisable((int)2896);
        GL11.glDisable((int)16384);
        GL11.glDisable((int)16385);
        GL11.glDisable((int)2903);
    }

    public static void lllIlIIlIIIlIlIIIllIlllIl() {
        GL11.glEnable((int)2896);
        GL11.glEnable((int)16384);
        GL11.glEnable((int)16385);
        GL11.glEnable((int)2903);
        GL11.glColorMaterial((int)1032, (int)5634);
        float f = 0.4f;
        float f2 = 0.6f;
        float f3 = 0.0f;
        GL11.glLight((int)16384, (int)4611, (FloatBuffer)class_0624.lllIIIllIIIIlllIlIIllIIll(class_0624.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll, class_0624.lllIlIIlIIIlIlIIIllIlllIl.lllIlIIlIIIlIlIIIllIlllIl, class_0624.lllIlIIlIIIlIlIIIllIlllIl.IlIllllllIIlIIllllIIlIIIl, 0.0));
        GL11.glLight((int)16384, (int)4609, (FloatBuffer)class_0624.lllIIIllIIIIlllIlIIllIIll(f2, f2, f2, 1.0f));
        GL11.glLight((int)16384, (int)4608, (FloatBuffer)class_0624.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, 1.0f));
        GL11.glLight((int)16384, (int)4610, (FloatBuffer)class_0624.lllIIIllIIIIlllIlIIllIIll(f3, f3, f3, 1.0f));
        GL11.glLight((int)16385, (int)4611, (FloatBuffer)class_0624.lllIIIllIIIIlllIlIIllIIll(class_0624.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll, class_0624.IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl, class_0624.IlIllllllIIlIIllllIIlIIIl.IlIllllllIIlIIllllIIlIIIl, 0.0));
        GL11.glLight((int)16385, (int)4609, (FloatBuffer)class_0624.lllIIIllIIIIlllIlIIllIIll(f2, f2, f2, 1.0f));
        GL11.glLight((int)16385, (int)4608, (FloatBuffer)class_0624.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, 1.0f));
        GL11.glLight((int)16385, (int)4610, (FloatBuffer)class_0624.lllIIIllIIIIlllIlIIllIIll(f3, f3, f3, 1.0f));
        GL11.glShadeModel((int)7424);
        GL11.glLightModel((int)2899, (FloatBuffer)class_0624.lllIIIllIIIIlllIlIIllIIll(f, f, f, 1.0f));
    }

    private static FloatBuffer lllIIIllIIIIlllIlIIllIIll(double d, double d2, double d3, double d4) {
        return class_0624.lllIIIllIIIIlllIlIIllIIll((float)d, (float)d2, (float)d3, (float)d4);
    }

    private static FloatBuffer lllIIIllIIIIlllIlIIllIIll(float f, float f2, float f3, float f4) {
        lllIIIllIIIIlllIlIIllIIll.clear();
        lllIIIllIIIIlllIlIIllIIll.put(f).put(f2).put(f3).put(f4);
        lllIIIllIIIIlllIlIIllIIll.flip();
        return lllIIIllIIIIlllIlIIllIIll;
    }

    public static void IlIllllllIIlIIllllIIlIIIl() {
        GL11.glPushMatrix();
        GL11.glRotatef((float)-30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        GL11.glRotatef((float)165.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        class_0624.lllIlIIlIIIlIlIIIllIlllIl();
        GL11.glPopMatrix();
    }
}

