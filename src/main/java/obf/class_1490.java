package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.util.glu.GLU
 */
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

import net.minecraft.block.Block;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.GLU;

public class class_1490 {
    public static float lllIIIllIIIIlllIlIIllIIll;
    public static float lllIlIIlIIIlIlIIIllIlllIl;
    public static float IlIllllllIIlIIllllIIlIIIl;
    private static IntBuffer IIIllIllIIlIlIlIlIllllIIl;
    private static FloatBuffer IllIIIllIIIIlIlIlIllIIlll;
    private static FloatBuffer lIIIIlIlIIlllllIIllIIlIII;
    private static FloatBuffer llIIlllIllIllllIIIlIIIIII;
    public static float lIlllIlllIIIIlIIlllIllIII;
    public static float IlIIIIIllllllIIlllIllllll;
    public static float lIllllIIlIIIlIllllllIIIll;
    public static float IIIllIIlIIIIIIlIlIIllIIlI;
    public static float IllIIlllllllIIlIIlIIIIlIl;

    public static void lllIIIllIIIIlllIlIIllIIll(class_0814 class_08142, boolean bl) {
        GL11.glGetFloat((int)2982, (FloatBuffer)IllIIIllIIIIlIlIlIllIIlll);
        GL11.glGetFloat((int)2983, (FloatBuffer)lIIIIlIlIIlllllIIllIIlIII);
        GL11.glGetInteger((int)2978, (IntBuffer)IIIllIllIIlIlIlIlIllllIIl);
        float f = (IIIllIllIIlIlIlIlIllllIIl.get(0) + IIIllIllIIlIlIlIlIllllIIl.get(2)) / 2;
        float f2 = (IIIllIllIIlIlIlIlIllllIIl.get(1) + IIIllIllIIlIlIlIlIllllIIl.get(3)) / 2;
        GLU.gluUnProject((float)f, (float)f2, (float)0.0f, (FloatBuffer)IllIIIllIIIIlIlIlIllIIlll, (FloatBuffer)lIIIIlIlIIlllllIIllIIlIII, (IntBuffer)IIIllIllIIlIlIlIlIllllIIl, (FloatBuffer)llIIlllIllIllllIIIlIIIIII);
        lllIIIllIIIIlllIlIIllIIll = llIIlllIllIllllIIIlIIIIII.get(0);
        lllIlIIlIIIlIlIIIllIlllIl = llIIlllIllIllllIIIlIIIIII.get(1);
        IlIllllllIIlIIllllIIlIIIl = llIIlllIllIllllIIIlIIIIII.get(2);
        int n = bl ? 1 : 0;
        float f3 = class_08142.IlIlIIlllIllllllllIIIlIlI;
        float f4 = class_08142.IIIIlIllIlIIlIIlIllIlIlll;
        lIlllIlllIIIIlIIlllIllIII = MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f4 * (float)Math.PI / 180.0f) * (float)(1 - n * 2);
        lIllllIIlIIIlIllllllIIIll = MathHelper.lllIIIllIIIIlllIlIIllIIll(f4 * (float)Math.PI / 180.0f) * (float)(1 - n * 2);
        IIIllIIlIIIIIIlIlIIllIIlI = -lIllllIIlIIIlIllllllIIIll * MathHelper.lllIIIllIIIIlllIlIIllIIll(f3 * (float)Math.PI / 180.0f) * (float)(1 - n * 2);
        IllIIlllllllIIlIIlIIIIlIl = lIlllIlllIIIIlIIlllIllIII * MathHelper.lllIIIllIIIIlllIlIIllIIll(f3 * (float)Math.PI / 180.0f) * (float)(1 - n * 2);
        IlIIIIIllllllIIlllIllllll = MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f3 * (float)Math.PI / 180.0f);
    }

    public static class_0864 lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652, double d) {
        double d2 = class_19652.llIIlIllIllllIlIIIIlIIlll + (class_19652.IlIIlllllIIlIlIlllllIllll - class_19652.llIIlIllIllllIlIIIIlIIlll) * d;
        double d3 = class_19652.llIllllIlIllIIIlIllIIlIlI + (class_19652.llIIlIlIlllIIllIlIlllIllI - class_19652.llIllllIlIllIIIlIllIIlIlI) * d + (double)class_19652.llIIllIllIlIIlIIllIllllll();
        double d4 = class_19652.lIlllIlllIlIIIIlllIlIlIIl + (class_19652.IllIIIIllIIllIllIlllIlIIl - class_19652.lIlllIlllIlIIIIlllIlIlIIl) * d;
        double d5 = d2 + (double)(lllIIIllIIIIlllIlIIllIIll * 1.0f);
        double d6 = d3 + (double)(lllIlIIlIIIlIlIIIllIlllIl * 1.0f);
        double d7 = d4 + (double)(IlIllllllIIlIIllllIIlIIIl * 1.0f);
        return class_0864.lllIIIllIIIIlllIlIIllIIll(d5, d6, d7);
    }

    public static Block lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, class_1965 class_19652, float f) {
        float f2;
        float f3;
        class_0864 class_08642 = class_1490.lllIIIllIIIIlllIlIIllIIll(class_19652, f);
        class_2137 class_21372 = new class_2137(class_08642);
        Block class_05492 = class_13342.a_(class_21372.lllIIIllIIIIlllIlIIllIIll, class_21372.lllIlIIlIIIlIlIIIllIlllIl, class_21372.IlIllllllIIlIIllllIIlIIIl);
        if (class_05492.lIllllIIlIIIlIllllllIIIll().lllIIIllIIIIlllIlIIllIIll() && class_08642.lllIlIIlIIIlIlIIIllIlllIl >= (double)(f3 = (float)(class_21372.lllIlIIlIIIlIlIIIllIlllIl + 1) - (f2 = class_0816.IllIIlllllllIIlIIlIIIIlIl(class_13342.IlIllllllIIlIIllllIIlIIIl(class_21372.lllIIIllIIIIlllIlIIllIIll, class_21372.lllIlIIlIIIlIlIIIllIlllIl, class_21372.IlIllllllIIlIIllllIIlIIIl)) - 0.11111111f))) {
            class_05492 = class_13342.a_(class_21372.lllIIIllIIIIlllIlIIllIIll, class_21372.lllIlIIlIIIlIlIIIllIlllIl + 1, class_21372.IlIllllllIIlIIllllIIlIIIl);
        }
        return class_05492;
    }

    static {
        IIIllIllIIlIlIlIlIllllIIl = class_0994.lIlllIlllIIIIlIIlllIllIII(16);
        IllIIIllIIIIlIlIlIllIIlll = class_0994.IlIIIIIllllllIIlllIllllll(16);
        lIIIIlIlIIlllllIIllIIlIII = class_0994.IlIIIIIllllllIIlllIllllll(16);
        llIIlllIllIllllIIIlIIIIII = class_0994.IlIIIIIllllllIIlllIllllll(3);
    }
}

