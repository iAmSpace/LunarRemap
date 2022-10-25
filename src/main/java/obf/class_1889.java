package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.opengl.GL11
 */
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import java.nio.IntBuffer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;

import com.moonsworth.lunar.client.LunarClient;
import net.minecraft.client.Minecraft;
import net.minecraft.util.IChatComponent;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.util.ChatComponentTranslation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

public class class_1889 {
    private static final Logger lllIIIllIIIIlllIlIIllIIll = LogManager.getLogger();
    private static final DateFormat lllIlIIlIIIlIlIIIllIlllIl = new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss");
    private static IntBuffer IlIllllllIIlIIllllIIlIIIl;
    private static int[] lIlllIlllIIIIlIIlllIllIII;

    public static IChatComponent lllIIIllIIIIlllIlIIllIIll(File file, int n, int n2, class_0778 class_07782) {
        return class_1889.lllIIIllIIIIlllIlIIllIIll(file, null, n, n2, class_07782);
    }

    public static void lllIlIIlIIIlIlIIIllIlllIl(File file, int n, int n2, class_0778 class_07782) {
        try {
            LunarClient.getInstance().lllIIIllIIIIlllIlIIllIIll("shutter");
            File file2 = new File(file, "screenshots");
            if (!file2.exists()) {
                file2.mkdir();
            }
            if (OpenGlHelper.IIIllIIlIIIIIIlIlIIllIIlI()) {
                n = class_07782.lllIIIllIIIIlllIlIIllIIll;
                n2 = class_07782.lllIlIIlIIIlIlIIIllIlllIl;
            }
            int n3 = n * n2;
            if (IlIllllllIIlIIllllIIlIIIl == null || IlIllllllIIlIIllllIIlIIIl.capacity() < n3) {
                IlIllllllIIlIIllllIIlIIIl = BufferUtils.createIntBuffer((int)n3);
                lIlllIlllIIIIlIIlllIllIII = new int[n3];
            }
            GL11.glPixelStorei((int)3333, (int)1);
            GL11.glPixelStorei((int)3317, (int)1);
            IlIllllllIIlIIllllIIlIIIl.clear();
            if (OpenGlHelper.IIIllIIlIIIIIIlIlIIllIIlI()) {
                GL11.glBindTexture((int)3553, (int)class_07782.IIIllIIlIIIIIIlIlIIllIIlI);
                GL11.glGetTexImage((int)3553, (int)0, (int)32993, (int)33639, (IntBuffer)IlIllllllIIlIIllllIIlIIIl);
            } else {
                GL11.glReadPixels((int)0, (int)0, (int)n, (int)n2, (int)32993, (int)33639, (IntBuffer)IlIllllllIIlIIllllIIlIIIl);
            }
            IlIllllllIIlIIllllIIlIIIl.get(lIlllIlllIIIIlIIlllIllIII);
            int n4 = n;
            int n5 = n2;
            new Thread(() -> {
                class_0231.lllIIIllIIIIlllIlIIllIIll(lIlllIlllIIIIlIIlllIllIII, n4, n5);
                BufferedImage bufferedImage = null;
                if (OpenGlHelper.IIIllIIlIIIIIIlIlIIllIIlI()) {
                    int n3;
                    bufferedImage = new BufferedImage(class_07782.IlIllllllIIlIIllllIIlIIIl, class_07782.lIlllIlllIIIIlIIlllIllIII, 1);
                    for (int i = n3 = class_07782.lllIlIIlIIIlIlIIIllIlllIl - class_07782.lIlllIlllIIIIlIIlllIllIII; i < class_07782.lllIlIIlIIIlIlIIIllIlllIl; ++i) {
                        for (int j = 0; j < class_07782.IlIllllllIIlIIllllIIlIIIl; ++j) {
                            bufferedImage.setRGB(j, i - n3, lIlllIlllIIIIlIIlllIllIII[i * class_07782.lllIIIllIIIIlllIlIIllIIll + j]);
                        }
                    }
                } else {
                    bufferedImage = new BufferedImage(n4, n5, 1);
                    bufferedImage.setRGB(0, 0, n4, n5, lIlllIlllIIIIlIIlllIllIII, 0, n4);
                }
                File file2 = class_1889.lllIIIllIIIIlllIlIIllIIll(file2);
                try {
                    ImageIO.write((RenderedImage)bufferedImage, "png", file2);
                    class_0722 class_07222 = new class_0722((Object)((Object) EnumChatFormatting.GOLD) + "" + (Object)((Object) EnumChatFormatting.BOLD) + " [Open]");
                    class_07222.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(new class_0203(class_1936.lllIlIIlIIIlIlIIIllIlllIl, file2.getCanonicalPath()));
                    class_07222.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(new class_0015(class_0248.SHOW_TEXT, new class_0722(file2.getName())));
                    class_0722 class_07223 = new class_0722((Object)((Object) EnumChatFormatting.GREEN) + "" + (Object)((Object) EnumChatFormatting.BOLD) + " [Upload]");
                    class_07223.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(new class_0203(class_1936.lIllllIIlIIIlIllllllIIIll, file2.getName()));
                    class_07223.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(new class_0015(class_0248.SHOW_TEXT, new class_0722("Upload to " + (Object)((Object) EnumChatFormatting.GREEN) + "imgur.com & open")));
                    class_0722 class_07224 = new class_0722("Saved screenshot");
                    class_07224.lllIlIIlIIIlIlIIIllIlllIl().lIlllIlllIIIIlIIlllIllIII(true);
                    class_07224.lllIIIllIIIIlllIlIIllIIll(class_07222);
                    class_07224.lllIIIllIIIIlllIlIIllIIll(class_07223);
                    Minecraft.getMinecraft().IlIIIlIIIIllIIIllIIIIIIll.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(class_07224);
                }
                catch (IOException iOException) {
                    lllIIIllIIIIlllIlIIllIIll.warn("Couldn't save screenshot");
                }
            }).start();
        }
        catch (Exception exception) {
            lllIIIllIIIIlllIlIIllIIll.warn("Couldn't save screenshot", (Throwable)exception);
        }
    }

    public static IChatComponent lllIIIllIIIIlllIlIIllIIll(File file, String string, int n, int n2, class_0778 class_07782) {
        try {
            File file2 = new File(file, "screenshots");
            if (!file2.exists()) {
                file2.mkdir();
            }
            if (OpenGlHelper.IIIllIIlIIIIIIlIlIIllIIlI()) {
                n = class_07782.lllIIIllIIIIlllIlIIllIIll;
                n2 = class_07782.lllIlIIlIIIlIlIIIllIlllIl;
            }
            int n3 = n * n2;
            if (IlIllllllIIlIIllllIIlIIIl == null || IlIllllllIIlIIllllIIlIIIl.capacity() < n3) {
                IlIllllllIIlIIllllIIlIIIl = BufferUtils.createIntBuffer((int)n3);
                lIlllIlllIIIIlIIlllIllIII = new int[n3];
            }
            GL11.glPixelStorei((int)3333, (int)1);
            GL11.glPixelStorei((int)3317, (int)1);
            IlIllllllIIlIIllllIIlIIIl.clear();
            if (OpenGlHelper.IIIllIIlIIIIIIlIlIIllIIlI()) {
                GL11.glBindTexture((int)3553, (int)class_07782.IIIllIIlIIIIIIlIlIIllIIlI);
                GL11.glGetTexImage((int)3553, (int)0, (int)32993, (int)33639, (IntBuffer)IlIllllllIIlIIllllIIlIIIl);
            } else {
                GL11.glReadPixels((int)0, (int)0, (int)n, (int)n2, (int)32993, (int)33639, (IntBuffer)IlIllllllIIlIIllllIIlIIIl);
            }
            IlIllllllIIlIIllllIIlIIIl.get(lIlllIlllIIIIlIIlllIllIII);
            class_0231.lllIIIllIIIIlllIlIIllIIll(lIlllIlllIIIIlIIlllIllIII, n, n2);
            BufferedImage bufferedImage = null;
            if (OpenGlHelper.IIIllIIlIIIIIIlIlIIllIIlI()) {
                int n4;
                bufferedImage = new BufferedImage(class_07782.IlIllllllIIlIIllllIIlIIIl, class_07782.lIlllIlllIIIIlIIlllIllIII, 1);
                for (int i = n4 = class_07782.lllIlIIlIIIlIlIIIllIlllIl - class_07782.lIlllIlllIIIIlIIlllIllIII; i < class_07782.lllIlIIlIIIlIlIIIllIlllIl; ++i) {
                    for (int j = 0; j < class_07782.IlIllllllIIlIIllllIIlIIIl; ++j) {
                        bufferedImage.setRGB(j, i - n4, lIlllIlllIIIIlIIlllIllIII[i * class_07782.lllIIIllIIIIlllIlIIllIIll + j]);
                    }
                }
            } else {
                bufferedImage = new BufferedImage(n, n2, 1);
                bufferedImage.setRGB(0, 0, n, n2, lIlllIlllIIIIlIIlllIllIII, 0, n);
            }
            File file3 = string == null ? class_1889.lllIIIllIIIIlllIlIIllIIll(file2) : new File(file2, string);
            ImageIO.write((RenderedImage)bufferedImage, "png", file3);
            class_0722 class_07222 = new class_0722(file3.getName());
            class_07222.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(new class_0203(class_1936.lllIlIIlIIIlIlIIIllIlllIl, file3.getAbsolutePath()));
            class_07222.lllIlIIlIIIlIlIIIllIlllIl().lIlllIlllIIIIlIIlllIllIII(true);
            return new ChatComponentTranslation("screenshot.success", class_07222);
        }
        catch (Exception exception) {
            lllIIIllIIIIlllIlIIllIIll.warn("Couldn't save screenshot", (Throwable)exception);
            return new ChatComponentTranslation("screenshot.failure", exception.getMessage());
        }
    }

    private static File lllIIIllIIIIlllIlIIllIIll(File file) {
        String string = lllIlIIlIIIlIlIIIllIlllIl.format(new Date()).toString();
        int n = 1;
        File file2;
        while ((file2 = new File(file, string + (n == 1 ? "" : "_" + n) + ".png")).exists()) {
            ++n;
        }
        return file2;
    }
}

