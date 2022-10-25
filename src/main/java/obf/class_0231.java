package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.opengl.GL11
 */
import java.awt.image.BufferedImage;
import java.nio.IntBuffer;
import javax.imageio.ImageIO;

import net.minecraft.util.ResourceLocation;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.OpenGlHelper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;

public class class_0231 {
    private static final Logger IlIllllllIIlIIllllIIlIIIl = LogManager.getLogger();
    private static final IntBuffer lIlllIlllIIIIlIIlllIllIII = class_0994.lIlllIlllIIIIlIIlllIllIII(0x400000);
    public static final class_2202 lllIIIllIIIIlllIlIIllIIll = new class_2202(16, 16);
    public static final int[] lllIlIIlIIIlIlIIIllIlllIl = lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII();
    private static int IlIIIIIllllllIIlllIllllll = -1;
    private static int lIllllIIlIIIlIllllllIIIll = -1;
    private static float IIIllIIlIIIIIIlIlIIllIIlI = -1.0f;
    private static final int[] IllIIlllllllIIlIIlIIIIlIl;

    public static int lllIIIllIIIIlllIlIIllIIll() {
        return GL11.glGenTextures();
    }

    public static void lllIIIllIIIIlllIlIIllIIll(int n) {
        GL11.glDeleteTextures((int)n);
    }

    public static int lllIIIllIIIIlllIlIIllIIll(int n, BufferedImage bufferedImage) {
        return class_0231.lllIIIllIIIIlllIlIIllIIll(n, bufferedImage, false, false);
    }

    public static void lllIIIllIIIIlllIlIIllIIll(int n, int[] arrn, int n2, int n3) {
        class_0231.lllIlIIlIIIlIlIIIllIlllIl(n);
        class_0231.lllIIIllIIIIlllIlIIllIIll(0, arrn, n2, n3, 0, 0, false, false, false);
    }

    public static int[][] lllIIIllIIIIlllIlIIllIIll(int n, int n2, int[][] arrn) {
        int[][] arrarrn = new int[n + 1][];
        arrarrn[0] = arrn[0];
        if (n > 0) {
            int n3;
            boolean bl = false;
            for (n3 = 0; n3 < arrn.length; ++n3) {
                if (arrn[0][n3] >> 24 != 0) continue;
                bl = true;
                break;
            }
            for (n3 = 1; n3 <= n; ++n3) {
                if (arrn[n3] != null) {
                    arrarrn[n3] = arrn[n3];
                    continue;
                }
                int[] arrn2 = arrarrn[n3 - 1];
                int[] arrn3 = new int[arrn2.length >> 2];
                int n4 = n2 >> n3;
                int n5 = arrn3.length / n4;
                int n6 = n4 << 1;
                for (int i = 0; i < n4; ++i) {
                    for (int j = 0; j < n5; ++j) {
                        int n7 = 2 * (i + j * n6);
                        arrn3[i + j * n4] = class_0231.lllIIIllIIIIlllIlIIllIIll(arrn2[n7 + 0], arrn2[n7 + 1], arrn2[n7 + 0 + n6], arrn2[n7 + 1 + n6], bl);
                    }
                }
                arrarrn[n3] = arrn3;
            }
        }
        return arrarrn;
    }

    private static int lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4, boolean bl) {
        return class_1348.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n4);
    }

    private static int lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4, int n5) {
        float f = (float)Math.pow((float)(n >> n5 & 0xFF) / 255.0f, 2.2);
        float f2 = (float)Math.pow((float)(n2 >> n5 & 0xFF) / 255.0f, 2.2);
        float f3 = (float)Math.pow((float)(n3 >> n5 & 0xFF) / 255.0f, 2.2);
        float f4 = (float)Math.pow((float)(n4 >> n5 & 0xFF) / 255.0f, 2.2);
        float f5 = (float)Math.pow((double)(f + f2 + f3 + f4) * 0.25, 0.45454545454545453);
        return (int)((double)f5 * 255.0);
    }

    public static void lllIIIllIIIIlllIlIIllIIll(int[][] arrn, int n, int n2, int n3, int n4, boolean bl, boolean bl2) {
        for (int i = 0; i < arrn.length; ++i) {
            int[] arrn2 = arrn[i];
            class_0231.lllIIIllIIIIlllIlIIllIIll(i, arrn2, n >> i, n2 >> i, n3 >> i, n4 >> i, bl, bl2, arrn.length > 1);
        }
    }

    private static void lllIIIllIIIIlllIlIIllIIll(int n, int[] arrn, int n2, int n3, int n4, int n5, boolean bl, boolean bl2, boolean bl3) {
        int n6;
        int n7 = 0x400000 / n2;
        class_0231.lllIIIllIIIIlllIlIIllIIll(bl, bl3);
        class_0231.lllIIIllIIIIlllIlIIllIIll(bl2);
        for (int i = 0; i < n2 * n3; i += n2 * n6) {
            int n8 = i / n2;
            n6 = Math.min(n7, n3 - n8);
            int n9 = n2 * n6;
            class_0231.lllIlIIlIIIlIlIIIllIlllIl(arrn, i, n9);
            GL11.glTexSubImage2D((int)3553, (int)n, (int)n4, (int)(n5 + n8), (int)n2, (int)n6, (int)32993, (int)33639, (IntBuffer)lIlllIlllIIIIlIIlllIllIII);
        }
    }

    public static int lllIIIllIIIIlllIlIIllIIll(int n, BufferedImage bufferedImage, boolean bl, boolean bl2) {
        class_0231.lllIIIllIIIIlllIlIIllIIll(n, bufferedImage.getWidth(), bufferedImage.getHeight());
        return class_0231.lllIIIllIIIIlllIlIIllIIll(n, bufferedImage, 0, 0, bl, bl2);
    }

    public static void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        class_0231.lllIIIllIIIIlllIlIIllIIll(n, 0, n2, n3, 1.0f);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4, float f) {
        Class<class_0231> class_;
        Class<class_0231> class_2 = class_ = class_0231.class;
        synchronized (class_2) {
            class_0231.lllIIIllIIIIlllIlIIllIIll(n);
            class_0231.lllIlIIlIIIlIlIIIllIlllIl(n);
        }
        if (OpenGlHelper.lIIlIIIIIlIlllIlIIlIlIlll) {
            GL11.glTexParameterf((int)3553, (int)34046, (float)f);
        }
        if (n2 > 0) {
            GL11.glTexParameteri((int)3553, (int)33085, (int)n2);
            GL11.glTexParameterf((int)3553, (int)33082, (float)0.0f);
            GL11.glTexParameterf((int)3553, (int)33083, (float)n2);
            GL11.glTexParameterf((int)3553, (int)34049, (float)0.0f);
        }
        for (int i = 0; i <= n2; ++i) {
            GL11.glTexImage2D((int)3553, (int)i, (int)6408, (int)(n3 >> i), (int)(n4 >> i), (int)0, (int)32993, (int)33639, (IntBuffer)null);
        }
    }

    public static int lllIIIllIIIIlllIlIIllIIll(int n, BufferedImage bufferedImage, int n2, int n3, boolean bl, boolean bl2) {
        class_0231.lllIlIIlIIIlIlIIIllIlllIl(n);
        class_0231.lllIIIllIIIIlllIlIIllIIll(bufferedImage, n2, n3, bl, bl2);
        return n;
    }

    private static void lllIIIllIIIIlllIlIIllIIll(BufferedImage bufferedImage, int n, int n2, boolean bl, boolean bl2) {
        int n3 = bufferedImage.getWidth();
        int n4 = bufferedImage.getHeight();
        int n5 = 0x400000 / n3;
        int[] arrn = new int[n5 * n3];
        class_0231.lllIlIIlIIIlIlIIIllIlllIl(bl);
        class_0231.lllIIIllIIIIlllIlIIllIIll(bl2);
        for (int i = 0; i < n3 * n4; i += n3 * n5) {
            int n6 = i / n3;
            int n7 = Math.min(n5, n4 - n6);
            int n8 = n3 * n7;
            bufferedImage.getRGB(0, n6, n3, n7, arrn, 0, n3);
            class_0231.lllIIIllIIIIlllIlIIllIIll(arrn, n8);
            GL11.glTexSubImage2D((int)3553, (int)0, (int)n, (int)(n2 + n6), (int)n3, (int)n7, (int)32993, (int)33639, (IntBuffer)lIlllIlllIIIIlIIlllIllIII);
        }
    }

    private static void lllIIIllIIIIlllIlIIllIIll(boolean bl) {
        if (bl) {
            GL11.glTexParameteri((int)3553, (int)10242, (int)10496);
            GL11.glTexParameteri((int)3553, (int)10243, (int)10496);
        } else {
            GL11.glTexParameteri((int)3553, (int)10242, (int)10497);
            GL11.glTexParameteri((int)3553, (int)10243, (int)10497);
        }
    }

    private static void lllIlIIlIIIlIlIIIllIlllIl(boolean bl) {
        class_0231.lllIIIllIIIIlllIlIIllIIll(bl, false);
    }

    public static void lllIIIllIIIIlllIlIIllIIll(boolean bl, boolean bl2, float f) {
        IlIIIIIllllllIIlllIllllll = GL11.glGetTexParameteri((int)3553, (int)10241);
        lIllllIIlIIIlIllllllIIIll = GL11.glGetTexParameteri((int)3553, (int)10240);
        IIIllIIlIIIIIIlIlIIllIIlI = GL11.glGetTexParameterf((int)3553, (int)34046);
        class_0231.lllIIIllIIIIlllIlIIllIIll(bl, bl2);
        class_0231.lllIIIllIIIIlllIlIIllIIll(f);
    }

    public static void lllIlIIlIIIlIlIIIllIlllIl() {
        if (IlIIIIIllllllIIlllIllllll >= 0 && lIllllIIlIIIlIllllllIIIll >= 0 && IIIllIIlIIIIIIlIlIIllIIlI >= 0.0f) {
            class_0231.lllIIIllIIIIlllIlIIllIIll(IlIIIIIllllllIIlllIllllll, lIllllIIlIIIlIllllllIIIll);
            class_0231.lllIIIllIIIIlllIlIIllIIll(IIIllIIlIIIIIIlIlIIllIIlI);
            IIIllIIlIIIIIIlIlIIllIIlI = -1.0f;
            IlIIIIIllllllIIlllIllllll = -1;
            lIllllIIlIIIlIllllllIIIll = -1;
        }
    }

    private static void lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        GL11.glTexParameteri((int)3553, (int)10241, (int)n);
        GL11.glTexParameteri((int)3553, (int)10240, (int)n2);
    }

    private static void lllIIIllIIIIlllIlIIllIIll(float f) {
        GL11.glTexParameterf((int)3553, (int)34046, (float)f);
    }

    private static void lllIIIllIIIIlllIlIIllIIll(boolean bl, boolean bl2) {
        if (bl) {
            GL11.glTexParameteri((int)3553, (int)10241, (int)(bl2 ? 9987 : 9729));
            GL11.glTexParameteri((int)3553, (int)10240, (int)9729);
        } else {
            GL11.glTexParameteri((int)3553, (int)10241, (int)(bl2 ? 9986 : 9728));
            GL11.glTexParameteri((int)3553, (int)10240, (int)9728);
        }
    }

    private static void lllIIIllIIIIlllIlIIllIIll(int[] arrn, int n) {
        class_0231.lllIlIIlIIIlIlIIIllIlllIl(arrn, 0, n);
    }

    private static void lllIlIIlIIIlIlIIIllIlllIl(int[] arrn, int n, int n2) {
        int[] arrn2 = arrn;
        if (Minecraft.getMinecraft().gameSettings.IlIIIIIllllllIIlllIllllll) {
            arrn2 = class_0231.lllIIIllIIIIlllIlIIllIIll(arrn);
        }
        lIlllIlllIIIIlIIlllIllIII.clear();
        lIlllIlllIIIIlIIlllIllIII.put(arrn2, n, n2);
        lIlllIlllIIIIlIIlllIllIII.position(0).limit(n2);
    }

    static void lllIlIIlIIIlIlIIIllIlllIl(int n) {
        GL11.glBindTexture((int)3553, (int)n);
    }

    public static int[] lllIIIllIIIIlllIlIIllIIll(class_0947 class_09472, ResourceLocation class_17732) {
        BufferedImage bufferedImage = ImageIO.read(class_09472.getResource(class_17732).getInputStream());
        if (bufferedImage == null) {
            return null;
        }
        int n = bufferedImage.getWidth();
        int n2 = bufferedImage.getHeight();
        int[] arrn = new int[n * n2];
        bufferedImage.getRGB(0, 0, n, n2, arrn, 0, n);
        return arrn;
    }

    public static int[] lllIIIllIIIIlllIlIIllIIll(int[] arrn) {
        int[] arrn2 = new int[arrn.length];
        for (int i = 0; i < arrn.length; ++i) {
            int n = arrn[i] >> 24 & 0xFF;
            int n2 = arrn[i] >> 16 & 0xFF;
            int n3 = arrn[i] >> 8 & 0xFF;
            int n4 = arrn[i] & 0xFF;
            int n5 = (n2 * 30 + n3 * 59 + n4 * 11) / 100;
            int n6 = (n2 * 30 + n3 * 70) / 100;
            int n7 = (n2 * 30 + n4 * 70) / 100;
            arrn2[i] = n << 24 | n5 << 16 | n6 << 8 | n7;
        }
        return arrn2;
    }

    public static int[] lllIIIllIIIIlllIlIIllIIll(int[] arrn, int n, int n2, int n3) {
        int n4;
        int n5;
        int n6 = n + 2 * n3;
        for (n5 = n2 - 1; n5 >= 0; --n5) {
            int n7;
            n4 = n5 * n;
            int n8 = n3 + (n5 + n3) * n6;
            for (n7 = 0; n7 < n3; n7 += n) {
                int n9 = Math.min(n, n3 - n7);
                System.arraycopy(arrn, n4 + n - n9, arrn, n8 - n7 - n9, n9);
            }
            System.arraycopy(arrn, n4, arrn, n8, n);
            for (n7 = 0; n7 < n3; n7 += n) {
                System.arraycopy(arrn, n4, arrn, n8 + n + n7, Math.min(n, n3 - n7));
            }
        }
        for (n5 = 0; n5 < n3; n5 += n2) {
            n4 = Math.min(n2, n3 - n5);
            System.arraycopy(arrn, (n3 + n2 - n4) * n6, arrn, (n3 - n5 - n4) * n6, n6 * n4);
        }
        for (n5 = 0; n5 < n3; n5 += n2) {
            n4 = Math.min(n2, n3 - n5);
            System.arraycopy(arrn, n3 * n6, arrn, (n2 + n3 + n5) * n6, n6 * n4);
        }
        return arrn;
    }

    public static void lllIIIllIIIIlllIlIIllIIll(int[] arrn, int n, int n2) {
        int[] arrn2 = new int[n];
        int n3 = n2 / 2;
        for (int i = 0; i < n3; ++i) {
            System.arraycopy(arrn, i * n, arrn2, 0, n);
            System.arraycopy(arrn, (n2 - 1 - i) * n, arrn, i * n, n);
            System.arraycopy(arrn2, 0, arrn, (n2 - 1 - i) * n, n);
        }
    }

    static {
        int n = -16777216;
        int n2 = -524040;
        int[] arrn = new int[]{-524040, -524040, -524040, -524040, -524040, -524040, -524040, -524040};
        int[] arrn2 = new int[]{-16777216, -16777216, -16777216, -16777216, -16777216, -16777216, -16777216, -16777216};
        int n3 = arrn.length;
        for (int i = 0; i < 16; ++i) {
            System.arraycopy(i < n3 ? arrn : arrn2, 0, lllIlIIlIIIlIlIIIllIlllIl, 16 * i, n3);
            System.arraycopy(i < n3 ? arrn2 : arrn, 0, lllIlIIlIIIlIlIIIllIlllIl, 16 * i + n3, n3);
        }
        lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl();
        IllIIlllllllIIlIIlIIIIlIl = new int[4];
    }
}

