package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.opengl.EXTFramebufferObject
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GLContext
 */
import java.awt.image.BufferedImage;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;

import net.minecraft.util.ResourceLocation;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLContext;

public class class_2210 {
    private static class_0868 lIllllIIlIIIlIllllllIIIll = class_0868.IlIIIIIllllllIIlllIllllll;
    public static class_1682 lllIIIllIIIIlllIlIIllIIll;
    public static int lllIlIIlIIIlIlIIIllIlllIl;
    public static boolean IlIllllllIIlIIllllIIlIIIl;
    public static int lIlllIlllIIIIlIIlllIllIII;
    private static int IIIllIIlIIIIIIlIlIIllIIlI;
    public static boolean IlIIIIIllllllIIlllIllllll;
    private static final IntBuffer IllIIlllllllIIlIIlIIIIlIl;

    public static void lllIIIllIIIIlllIlIIllIIll() {
        IIIllIIlIIIIIIlIlIIllIIlI = GL11.glGetInteger((int)36006);
        lllIlIIlIIIlIlIIIllIlllIl = EXTFramebufferObject.glGenFramebuffersEXT();
        lIlllIlllIIIIlIIlllIllIII = GL11.glGenTextures();
        int n = 256;
        int n2 = 256;
        EXTFramebufferObject.glBindFramebufferEXT((int)36160, (int)lllIlIIlIIIlIlIIIllIlllIl);
        ByteBuffer byteBuffer = BufferUtils.createByteBuffer((int)(4 * n * n2));
        GL11.glBindTexture((int)3553, (int)lIlllIlllIIIIlIIlllIllIII);
        GL11.glTexParameteri((int)3553, (int)10242, (int)10496);
        GL11.glTexParameteri((int)3553, (int)10243, (int)10496);
        GL11.glTexParameteri((int)3553, (int)10241, (int)9729);
        GL11.glTexParameteri((int)3553, (int)10240, (int)9729);
        GL11.glTexImage2D((int)3553, (int)0, (int)6408, (int)n, (int)n2, (int)0, (int)6408, (int)5120, (ByteBuffer)byteBuffer);
        EXTFramebufferObject.glFramebufferTexture2DEXT((int)36160, (int)36064, (int)3553, (int)lIlllIlllIIIIlIIlllIllIII, (int)0);
        int n3 = EXTFramebufferObject.glGenRenderbuffersEXT();
        EXTFramebufferObject.glBindRenderbufferEXT((int)36161, (int)n3);
        EXTFramebufferObject.glRenderbufferStorageEXT((int)36161, (int)33190, (int)256, (int)256);
        EXTFramebufferObject.glFramebufferRenderbufferEXT((int)36160, (int)36096, (int)36161, (int)n3);
        EXTFramebufferObject.glBindRenderbufferEXT((int)36161, (int)0);
        EXTFramebufferObject.glBindFramebufferEXT((int)36160, (int)IIIllIIlIIIIIIlIlIIllIIlI);
    }

    public static void lllIlIIlIIIlIlIIIllIlllIl() {
        IIIllIIlIIIIIIlIlIIllIIlI = GL11.glGetInteger((int)36006);
        EXTFramebufferObject.glBindFramebufferEXT((int)36160, (int)lllIlIIlIIIlIlIIIllIlllIl);
    }

    public static void IlIllllllIIlIIllllIIlIIIl() {
        EXTFramebufferObject.glBindFramebufferEXT((int)36160, (int)IIIllIIlIIIIIIlIlIIllIIlI);
    }

    public static void lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        class_2210.lllIIIllIIIIlllIlIIllIIll(n, n2, 128);
    }

    public static void lllIIIllIIIIlllIlIIllIIll(int n, float f, int n2) {
        int n3 = n2 / 4;
        class_2210.lllIIIllIIIIlllIlIIllIIll((double)(n - n3), f + (float)n3, 1.0, 0.0, 1.0);
        class_2210.lllIIIllIIIIlllIlIIllIIll((double)(n + n3), f + (float)n3, 1.0, 1.0, 1.0);
        class_2210.lllIIIllIIIIlllIlIIllIIll((double)(n + n3), f - (float)n3, 1.0, 1.0, 0.0);
        class_2210.lllIIIllIIIIlllIlIIllIIll((double)(n - n3), f - (float)n3, 1.0, 0.0, 0.0);
    }

    public static int lllIIIllIIIIlllIlIIllIIll(BufferedImage bufferedImage) {
        int n = GL11.glGenTextures();
        int n2 = bufferedImage.getWidth();
        int n3 = bufferedImage.getHeight();
        int[] arrn = new int[n2 * n3];
        bufferedImage.getRGB(0, 0, n2, n3, arrn, 0, n2);
        GL11.glBindTexture((int)3553, (int)n);
        IllIIlllllllIIlIIlIIIIlIl.clear();
        IllIIlllllllIIlIIlIIIIlIl.put(arrn, 0, n2 * n3);
        IllIIlllllllIIlIIlIIIIlIl.position(0).limit(n2 * n3);
        GL11.glTexImage2D((int)3553, (int)0, (int)6408, (int)n2, (int)n3, (int)0, (int)32993, (int)33639, (IntBuffer)IllIIlllllllIIlIIlIIIIlIl);
        return n;
    }

    public static void lllIIIllIIIIlllIlIIllIIll(String string) {
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation(string));
    }

    public static void lllIIIllIIIIlllIlIIllIIll(ResourceLocation class_17732) {
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(class_17732);
    }

    public static void lllIIIllIIIIlllIlIIllIIll(int n) {
        GL11.glBindTexture((int)3553, (int)n);
    }

    public static void lIlllIlllIIIIlIIlllIllIII() {
        lIllllIIlIIIlIllllllIIIll.lllIlIIlIIIlIlIIIllIlllIl();
    }

    public static void IlIIIIIllllllIIlllIllllll() {
        lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll();
    }

    public static void lllIlIIlIIIlIlIIIllIlllIl(int n) {
        GL11.glDeleteTextures((int)n);
    }

    public static void lllIIIllIIIIlllIlIIllIIll(int n, int n2, double d, double d2, double d3) {
        lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(n, n2, d, d2, d3);
    }

    public static void lllIIIllIIIIlllIlIIllIIll(double d, double d2, double d3) {
        lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(d, d2, d3);
    }

    public static void lllIIIllIIIIlllIlIIllIIll(double d, double d2, double d3, double d4, double d5) {
        lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(d, d2, d3, d4, d5);
    }

    static {
        lllIlIIlIIIlIlIIIllIlllIl = 0;
        IlIllllllIIlIIllllIIlIIIl = GLContext.getCapabilities().GL_EXT_framebuffer_object && GLContext.getCapabilities().OpenGL14;
        lIlllIlllIIIIlIIlllIllIII = 0;
        IIIllIIlIIIIIIlIlIIllIIlI = 0;
        IlIIIIIllllllIIlllIllllll = GL11.glGetInteger((int)3413) > 0;
        IllIIlllllllIIlIIlIIIIlIl = class_0994.lIlllIlllIIIIlIIlllIllIII(0x400000);
    }
}

