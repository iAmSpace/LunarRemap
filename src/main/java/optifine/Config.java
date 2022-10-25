package optifine;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.init.Blocks;
import net.minecraft.client.resources.DefaultResourcePack;
import net.minecraft.client.settings.GameSettings;
import obf.*;
import org.lwjgl.LWJGLException;
import org.lwjgl.Sys;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.PixelFormat;
import org.lwjgl.util.glu.GLU;

public class Config {
    public static final String lllIIIllIIIIlllIlIIllIIll = "OptiFine";
    public static final String lllIlIIlIIIlIlIIIllIlllIl = "1.7.10";
    public static final String IlIllllllIIlIIllllIIlIIIl = "HD_U";
    public static final String lIlllIlllIIIIlIIlllIllIII = "D6";
    public static final String IlIIIIIllllllIIlllIllllll = "OptiFine_1.7.10_HD_U_D6";
    private static String lIlIllIIlIIlIIlIIlIIlIIll = null;
    private static boolean llIIlIllIllllIlIIIIlIIlll = false;
    public static String lIllllIIlIIIlIllllllIIIll = null;
    public static String IIIllIIlIIIIIIlIlIIllIIlI = null;
    public static String IllIIlllllllIIlIIlIIIIlIl = null;
    private static GameSettings llIllllIlIllIIIlIllIIlIlI = null;
    private static Minecraft lIlllIlllIlIIIIlllIlIlIIl = null;
    private static boolean IlIIlllllIIlIlIlllllIllll = false;
    private static Thread llIIlIlIlllIIllIlIlllIllI = null;
    private static DisplayMode IllIIIIllIIllIllIlllIlIIl = null;
    private static int IIIIIIIIlIllIIllIIlllIllI = 0;
    private static int IIlIIlIlIlIllIIlIlIIIIlll = 0;
    public static boolean IIIllIllIIlIlIlIlIllllIIl = false;
    private static int llIIIlllIlllIlIllIIIIllIl = 0;
    public static boolean IllIIIllIIIIlIlIlIllIIlll = false;
    private static boolean IIIIlIllIlIIlIIlIllIlIlll = false;
    private static boolean IlIlIIlllIllllllllIIIlIlI = false;
    private static PrintStream llllIIIIlIIIlIIIIIIlIllll = new PrintStream(new FileOutputStream(FileDescriptor.out));
    public static final Boolean lIIIIlIlIIlllllIIllIIlIII = true;
    public static final Float llIIlllIllIllllIIIlIIIIII = Float.valueOf(0.2f);
    public static final Boolean llIIllIllIlIIlIIllIllllll = false;
    public static final Boolean lllIIlIIIllllllIIIIlIlIlI = false;
    public static final Integer IlIlllIIIIIIlIIllIIllIlll = 0;
    public static final Integer IlIlIIlIlIllIIlIlIIllIIIl = 9984;
    public static final Float lllllIlllIIllIlIIlIIIllII = Float.valueOf(0.1f);
    public static final Boolean IlIlIIlllIIlIllIIIlllllIl = false;
    public static final Integer lIIlIIIIIlIlllIlIIlIlIlll = 0;
    public static final Integer lIlIlIIlIIIIlIIIIIlllIIII = 25;
    public static final Integer IlIIIlIIIIllIIIllIIIIIIll = 3;
    public static final Boolean IIlllIlIlllIllIIIlllIIlIl = false;
    private static DefaultResourcePack llIIIIllIIIIIIIlIIIlIIIIl = null;

    public static String lllIIIllIIIIlllIlIIllIIll() {
        return IlIIIIIllllllIIlllIllllll;
    }

    public static String lllIlIIlIIIlIlIIIllIlllIl() {
        StringBuffer stringBuffer = new StringBuffer(32);
        if (Config.lllIlIIllllIllIIIlIlIIIll()) {
            stringBuffer.append("DL: ");
            stringBuffer.append(String.valueOf(class_1825.lllIlIIlIIIlIlIIIllIlllIl()));
            stringBuffer.append(", ");
        }
        stringBuffer.append(IlIIIIIllllllIIlllIllllll);
        return stringBuffer.toString();
    }

    public static void lllIIIllIIIIlllIlIIllIIll(GameSettings class_17512) {
        if (llIllllIlIllIIIlIllIIlIlI == null) {
            llIllllIlIllIIIlIllIIlIlI = class_17512;
            lIlllIlllIlIIIIlllIlIlIIl = Minecraft.getMinecraft();
            IllIIIIllIIllIllIlllIlIIl = Display.getDesktopDisplayMode();
            Config.lllllIllllIIIIllIIlIlIlII();
        }
    }

    public static void IlIllllllIIlIIllllIIlIIIl() {
        Config.lIlllIlllIIIIlIIlllIllIII();
        IIIIIIIIlIllIIllIIlllIllI = Config.llIllllIlIllIIIlIllIIlIlI.IlIIIlIIIIllIIIllIIIIIIll;
        Config.IllIlIlIIIlIllIlIlIIlllII();
        Config.lIIIllIlIlIlIIIllIlIlIllI();
        llIIlIlIlllIIllIlIlllIllI = Thread.currentThread();
        Config.IllIIlllllllIIlIIlIIIIlIl();
    }

    public static void lIlllIlllIIIIlIIlllIllIII() {
        if (!IlIIlllllIIlIlIlllllIllll && Display.isCreated()) {
            IlIIlllllIIlIlIlllllIllll = true;
            Config.llIlIIIlllIIIllIllllIIIll();
        }
    }

    private static void llIlIIIlllIIIllIllllIIIll() {
        Config.lIlllIlllIIIIlIIlllIllIII("");
        Config.lIlllIlllIIIIlIIlllIllIII(Config.lllIIIllIIIIlllIlIIllIIll());
        Config.lIlllIlllIIIIlIIlllIllIII("Build: " + Config.lIIlllIIIlIIlIllIIIIIlIlI());
        Config.lIlllIlllIIIIlIIlllIllIII("OS: " + System.getProperty("os.name") + " (" + System.getProperty("os.arch") + ") version " + System.getProperty("os.version"));
        Config.lIlllIlllIIIIlIIlllIllIII("Java: " + System.getProperty("java.version") + ", " + System.getProperty("java.vendor"));
        Config.lIlllIlllIIIIlIIlllIllIII("VM: " + System.getProperty("java.vm.name") + " (" + System.getProperty("java.vm.info") + "), " + System.getProperty("java.vm.vendor"));
        Config.lIlllIlllIIIIlIIlllIllIII("LWJGL: " + Sys.getVersion());
        lIllllIIlIIIlIllllllIIIll = GL11.glGetString((int)7938);
        IIIllIIlIIIIIIlIlIIllIIlI = GL11.glGetString((int)7937);
        IllIIlllllllIIlIIlIIIIlIl = GL11.glGetString((int)7936);
        Config.lIlllIlllIIIIlIIlllIllIII("OpenGL: " + IIIllIIlIIIIIIlIlIIllIIlI + ", version " + lIllllIIlIIIlIllllllIIIll + ", " + IllIIlllllllIIlIIlIIIIlIl);
        Config.lIlllIlllIIIIlIIlllIllIII("OpenGL Version: " + Config.IIIllIIlIIIIIIlIlIIllIIlI());
        if (!GLContext.getCapabilities().OpenGL12) {
            Config.lIlllIlllIIIIlIIlllIllIII("OpenGL Mipmap levels: Not available (GL12.GL_TEXTURE_MAX_LEVEL)");
        }
        if (!GLContext.getCapabilities().GL_NV_fog_distance) {
            Config.lIlllIlllIIIIlIIlllIllIII("OpenGL Fancy fog: Not available (GL_NV_fog_distance)");
        }
        if (!GLContext.getCapabilities().GL_ARB_occlusion_query) {
            Config.lIlllIlllIIIIlIIlllIllIII("OpenGL Occlussion culling: Not available (GL_ARB_occlusion_query)");
        }
        int n = Minecraft.IIIIIIIIlIllIIllIIlllIllI();
        Config.lllIIIllIIIIlllIlIIllIIll("Maximum texture size: " + n + "x" + n);
    }

    private static String lIIlllIIIlIIlIllIIIIIlIlI() {
        try {
            InputStream inputStream = Config.class.getResourceAsStream("/buildof.txt");
            if (inputStream == null) {
                return null;
            }
            String string = Config.lllIIIllIIIIlllIlIIllIIll(inputStream)[0];
            return string;
        }
        catch (Exception exception) {
            Config.lllIlIIlIIIlIlIIIllIlllIl("" + exception.getClass().getName() + ": " + exception.getMessage());
            return null;
        }
    }

    public static boolean IlIIIIIllllllIIlllIllllll() {
        return GLContext.getCapabilities().GL_NV_fog_distance;
    }

    public static boolean lIllllIIlIIIlIllllllIIIll() {
        return GLContext.getCapabilities().GL_ARB_occlusion_query;
    }

    public static String IIIllIIlIIIIIIlIlIIllIIlI() {
        int n = Config.lllIlIIllllIIllIIIIllIlIl();
        String string = "" + n / 10 + "." + n % 10;
        return string;
    }

    private static int lllIlIIllllIIllIIIIllIlIl() {
        return !GLContext.getCapabilities().OpenGL11 ? 10 : (!GLContext.getCapabilities().OpenGL12 ? 11 : (!GLContext.getCapabilities().OpenGL13 ? 12 : (!GLContext.getCapabilities().OpenGL14 ? 13 : (!GLContext.getCapabilities().OpenGL15 ? 14 : (!GLContext.getCapabilities().OpenGL20 ? 15 : (!GLContext.getCapabilities().OpenGL21 ? 20 : (!GLContext.getCapabilities().OpenGL30 ? 21 : (!GLContext.getCapabilities().OpenGL31 ? 30 : (!GLContext.getCapabilities().OpenGL32 ? 31 : (!GLContext.getCapabilities().OpenGL33 ? 32 : (!GLContext.getCapabilities().OpenGL40 ? 33 : 40)))))))))));
    }

    public static void IllIIlllllllIIlIIlIIIIlIl() {
        try {
            ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
            if (threadGroup == null) {
                return;
            }
            int n = (threadGroup.activeCount() + 10) * 2;
            Thread[] arrthread = new Thread[n];
            threadGroup.enumerate(arrthread, false);
            int n2 = 5;
            int n3 = 5;
            if (Config.lIIllllIllIlllllIIllIllIl()) {
                n3 = 3;
            }
            llIIlIlIlllIIllIlIlllIllI.setPriority(n2);
            for (int i = 0; i < arrthread.length; ++i) {
                Thread thread = arrthread[i];
                if (thread == null || !Config.lllIIIllIIIIlllIlIIllIIll((Object)thread.getName(), (Object)"Server thread") || thread.getPriority() == n3) continue;
                thread.setPriority(n3);
                Config.lllIIIllIIIIlllIlIIllIIll("Set server thread priority: " + n3 + ", " + thread);
            }
        }
        catch (Throwable throwable) {
            Config.lllIIIllIIIIlllIlIIllIIll(throwable.getClass().getName() + ": " + throwable.getMessage());
        }
    }

    public static boolean IIIllIllIIlIlIlIlIllllIIl() {
        return Thread.currentThread() == llIIlIlIlllIIllIlIlllIllI;
    }

    private static void IllIIIIIllIlIIllIllllllIl() {
        class_1213 class_12132 = new class_1213();
        class_12132.start();
    }

    public static boolean IllIIIllIIIIlIlIlIllIIlll() {
        return Config.llIllllIlIllIIIlIllIIlIlI.llIllIllIllIlIlIllIlIIIIl > 0;
    }

    public static int lIIIIlIlIIlllllIIllIIlIII() {
        return Config.llIllllIlIllIIIlIllIIlIlI.llIllIllIllIlIlIllIlIIIIl;
    }

    public static int llIIlllIllIllllIIIlIIIIII() {
        if (llIllllIlIllIIIlIllIIlIlI == null) {
            return IlIlIIlIlIllIIlIlIIllIIIl;
        }
        switch (Config.llIllllIlIllIIIlIllIIlIlI.llIIllIllIlIIlIIllIllllll) {
            case 0: {
                return 9984;
            }
            case 1: {
                return 9986;
            }
            case 2: {
                if (Config.lIlIlIIllIIIlllIllIIlIllI()) {
                    return 9985;
                }
                return 9986;
            }
            case 3: {
                if (Config.lIlIlIIllIIIlllIllIIlIllI()) {
                    return 9987;
                }
                return 9986;
            }
        }
        return 9984;
    }

    public static boolean llIIllIllIlIIlIIllIllllll() {
        float f = Config.lllIIlIIIllllllIIIIlIlIlI();
        return f > lllllIlllIIllIlIIlIIIllII.floatValue() + 1.0E-5f;
    }

    public static float lllIIlIIIllllllIIIIlIlIlI() {
        return lllllIlllIIllIlIIlIIIllII.floatValue();
    }

    public static boolean IlIlllIIIIIIlIIllIIllIlll() {
        return !Config.IlIIIIIllllllIIlllIllllll() ? false : Config.llIllllIlIllIIIlIllIIlIlI.lIIIIlIlIIlllllIIllIIlIII == 2;
    }

    public static boolean IlIlIIlIlIllIIlIlIIllIIIl() {
        return Config.llIllllIlIllIIIlIllIIlIlI.lIIIIlIlIIlllllIIllIIlIII == 1;
    }

    public static boolean lllllIlllIIllIlIIlIIIllII() {
        return Config.llIllllIlIllIIIlIllIIlIlI.lIIIIlIlIIlllllIIllIIlIII == 3;
    }

    public static float IlIlIIlllIIlIllIIIlllllIl() {
        return Config.llIllllIlIllIIIlIllIIlIlI.llIIlllIllIllllIIIlIIIIII;
    }

    public static boolean lIIlIIIIIlIlllIlIIlIlIlll() {
        return Config.llIllllIlIllIIIlIllIIlIlI.lIllllIIlIIIlIllllllIIIll;
    }

    public static boolean lIlIlIIlIIIIlIIIIIlllIIII() {
        return !Config.lIIlIIIIIlIlllIlIIlIlIlll() ? false : Config.llIllllIlIllIIIlIllIIlIlI.IlIlIIlIlIllIIlIlIIllIIIl;
    }

    public static boolean IlIIIlIIIIllIIIllIIIIIIll() {
        return Config.llIllllIlIllIIIlIllIIlIlI.lllIIlIIIllllllIIIIlIlIlI;
    }

    public static int IIlllIlIlllIllIIIlllIIlIl() {
        return Config.llIllllIlIllIIIlIllIIlIlI.IlIlllIIIIIIlIIllIIllIlll;
    }

    public static void lllIIIllIIIIlllIlIIllIIll(String string) {
        llllIIIIlIIIlIIIIIIlIllll.print("[OptiFine] ");
        llllIIIIlIIIlIIIIIIlIllll.println(string);
    }

    public static void lllIlIIlIIIlIlIIIllIlllIl(String string) {
        llllIIIIlIIIlIIIIIIlIllll.print("[OptiFine] [WARN] ");
        llllIIIIlIIIlIIIIIIlIllll.println(string);
    }

    public static void IlIllllllIIlIIllllIIlIIIl(String string) {
        llllIIIIlIIIlIIIIIIlIllll.print("[OptiFine] [ERROR] ");
        llllIIIIlIIIlIIIIIIlIllll.println(string);
    }

    public static void lIlllIlllIIIIlIIlllIllIII(String string) {
        Config.lllIIIllIIIIlllIlIIllIIll(string);
    }

    public static int lIlIllIIlIIlIIlIIlIIlIIll() {
        return Config.llIllllIlIllIIIlIllIIlIlI.lIlIIllllIlIIIIllIIIIlIIl;
    }

    public static boolean llIIlIllIllllIlIIIIlIIlll() {
        return Config.llIllllIlIllIIIlIllIIlIlI.IIIIlIIlIIIllIIIIllIIIlII;
    }

    public static boolean llIllllIlIllIIIlIllIIlIlI() {
        return Config.llIllllIlIllIIIlIllIIlIlI.lIlllIlllIlIIIIlllIlIlIIl == 0 ? Config.llIllllIlIllIIIlIllIIlIlI.IIIllIllIIlIlIlIlIllllIIl : Config.llIllllIlIllIIIlIllIIlIlI.lIlllIlllIlIIIIlllIlIlIIl == 2;
    }

    public static boolean lIlllIlllIlIIIIlllIlIlIIl() {
        return Config.llIllllIlIllIIIlIllIIlIlI.IlIIlllllIIlIlIlllllIllll == 0 ? Config.llIllllIlIllIIIlIllIIlIlI.IIIllIllIIlIlIlIlIllllIIl : Config.llIllllIlIllIIIlIllIIlIlI.IlIIlllllIIlIlIlllllIllll == 2;
    }

    public static boolean IlIIlllllIIlIlIlllllIllll() {
        return Config.llIllllIlIllIIIlIllIIlIlI.lIlllIlllIlIIIIlllIlIlIIl == 3;
    }

    public static boolean llIIlIlIlllIIllIlIlllIllI() {
        return Config.llIllllIlIllIIIlIllIIlIlI.IIlllIlIlllIllIIIlllIIlIl != 0 ? Config.llIllllIlIllIIIlIllIIlIlI.IIlllIlIlllIllIIIlllIIlIl == 2 : (llIIIlllIlllIlIllIIIIllIl != 0 ? llIIIlllIlllIlIllIIIIllIl == 2 : Config.llIllllIlIllIIIlIllIIlIlI.IIIllIllIIlIlIlIlIllllIIl);
    }

    public static boolean IllIIIIllIIllIllIlllIlIIl() {
        return Config.llIllllIlIllIIIlIllIIlIlI.IIlllIlIlllIllIIIlllIIlIl != 0 ? Config.llIllllIlIllIIIlIllIIlIlI.IIlllIlIlllIllIIIlllIIlIl == 3 : (llIIIlllIlllIlIllIIIIllIl != 0 ? llIIIlllIlllIlIllIIIIllIl == 3 : false);
    }

    public static void IIIIIIIIlIllIIllIIlllIllI() {
        llIIIlllIlllIlIllIIIIllIl = 0;
        class_0947 class_09472 = Config.lIIIlIIIlIlllIllIIIlIIIlI();
        if (class_09472 != null) {
            try {
                InputStream inputStream = class_09472.getResource(new ResourceLocation("mcpatcher/color.properties")).getInputStream();
                if (inputStream == null) {
                    return;
                }
                Properties properties = new Properties();
                properties.load(inputStream);
                inputStream.close();
                String string = properties.getProperty("clouds");
                if (string == null) {
                    return;
                }
                Config.lllIIIllIIIIlllIlIIllIIll("Texture pack clouds: " + string);
                string = string.toLowerCase();
                if (string.equals("fast")) {
                    llIIIlllIlllIlIllIIIIllIl = 1;
                }
                if (string.equals("fancy")) {
                    llIIIlllIlllIlIllIIIIllIl = 2;
                }
                if (string.equals("off")) {
                    llIIIlllIlllIlIllIIIIllIl = 3;
                }
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    public static boolean IIlIIlIlIlIllIIlIlIIIIlll() {
        return Config.llIllllIlIllIIIlIllIIlIlI.llIIlIllIllllIlIIIIlIIlll == 0 ? Config.llIllllIlIllIIIlIllIIlIlI.IIIllIllIIlIlIlIlIllllIIl : Config.llIllllIlIllIIIlIllIIlIlI.llIIlIllIllllIlIIIIlIIlll == 2;
    }

    public static boolean llIIIlllIlllIlIllIIIIllIl() {
        return Config.llIllllIlIllIIIlIllIIlIlI.llIllllIlIllIIIlIllIIlIlI == 0 ? Config.llIllllIlIllIIIlIllIIlIlI.IIIllIllIIlIlIlIlIllllIIl : Config.llIllllIlIllIIIlIllIIlIlI.llIllllIlIllIIIlIllIIlIlI == 2;
    }

    public static boolean IIIIlIllIlIIlIIlIllIlIlll() {
        return Config.llIllllIlIllIIIlIllIIlIlI.llIIlIlIlllIIllIlIlllIllI == 0 ? Config.llIllllIlIllIIIlIllIIlIlI.IIIllIllIIlIlIlIlIllllIIl : Config.llIllllIlIllIIIlIllIIlIlI.llIIlIlIlllIIllIlIlllIllI == 2;
    }

    public static int lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        return n < n2 ? n2 : (n > n3 ? n3 : n);
    }

    public static float lllIIIllIIIIlllIlIIllIIll(float f, float f2, float f3) {
        return f < f2 ? f2 : (f > f3 ? f3 : f);
    }

    public static double lllIIIllIIIIlllIlIIllIIll(double d, double d2, double d3) {
        return d < d2 ? d2 : (d > d3 ? d3 : d);
    }

    public static float lllIIIllIIIIlllIlIIllIIll(float f) {
        return f < 0.0f ? 0.0f : (f > 1.0f ? 1.0f : f);
    }

    public static boolean IlIlIIlllIllllllllIIIlIlI() {
        return Config.llIllllIlIllIIIlIllIIlIlI.IlllIIIllllIIllIllIlIIlIl != 2;
    }

    public static boolean llllIIIIlIIIlIIIIIIlIllll() {
        return Config.llIllllIlIllIIIlIllIIlIlI.IlllIIIllllIIllIllIlIIlIl == 1;
    }

    public static boolean llIIIIllIIIIIIIlIIIlIIIIl() {
        return Config.llIllllIlIllIIIlIllIIlIlI.IIIIlIllIlIIIIIllllIIlllI;
    }

    public static boolean IIllIllIIllIIlllIIIlIlllI() {
        return Config.llIllllIlIllIIIlIllIIlIlI.lllIIIlIIlIlIllIIIIIlIIll != 2;
    }

    public static boolean llllllIlIllllIlIlIlIIIIlI() {
        return Config.llIllllIlIllIIIlIllIIlIlI.lllIIIlIIlIlIllIIIIIlIIll == 1;
    }

    public static boolean lIlIIllllIlIIIIllIIIIlIIl() {
        return Config.llIllllIlIllIIIlIllIIlIlI.IIIlIlIllIlllllIlIllllllI;
    }

    public static boolean llIlllIIllIlllIlIlIlIIIll() {
        return Config.llIllllIlIllIIIlIllIIlIlI.llllIlIIllIIlllllIIllIIll;
    }

    public static boolean IIIIlIIlIIIllIIIIllIIIlII() {
        return Config.llIllllIlIllIIIlIllIIlIlI.IlIlIllIIlIIIIlllIlIllIlI;
    }

    public static boolean lllIIIIIIlIlllIIlIlIIIllI() {
        return Config.llIllllIlIllIIIlIllIIlIlI.IlIIllIlIlIllIIIlIIlIlIIl;
    }

    public static boolean llIIlIIllIIllIlIIllIIllII() {
        return Config.llIllllIlIllIIIlIllIIlIlI.lIlIIllIllIIIIIlIllllIIIl;
    }

    public static boolean lIlIlIIIIIIlIIllllIlIIllI() {
        return Config.llIllllIlIllIIIlIllIIlIlI.lIlllIIllIIIIIIlIlIIlIllI;
    }

    public static boolean IllllIIIIlIIlIIIIlllIIIIl() {
        return Config.llIllllIlIllIIIlIllIIlIlI.llIIIlIlIlIIlIllIIIllIlIl;
    }

    public static boolean llllIlIIIIIIIIIlllIIlIIIl() {
        return Config.llIllllIlIllIIIlIllIIlIlI.lIIlIIlIllIlIIlIlIIlIlIlI;
    }

    public static boolean IIIIlIlIIlIIIIlIlllIlIIII() {
        return Config.llIllllIlIllIIIlIllIIlIlI.llIIIIIlIIlIIIIllIIIlIIII;
    }

    public static boolean lllIIIIlIlIIlIIlllIIIIIIl() {
        return Config.llIllllIlIllIIIlIllIIlIlI.lIlIlIIllIIIlllIllIIlIllI;
    }

    public static boolean llIlIIlllIIIIIllIIlIlIIII() {
        return Config.llIllllIlIllIIIlIllIIlIlI.lIlIlIIIIIIlIIllllIlIIllI;
    }

    public static float IllIIIlllllIlIlllIlllllII() {
        return Config.llIllllIlIllIIIlIllIIlIlI.lIlIlIIlIIIIlIIIIIlllIIII;
    }

    private static Method lllIIIllIIIIlllIlIIllIIll(Class class_, String string, Object[] arrobject) {
        Method[] arrmethod = class_.getMethods();
        for (int i = 0; i < arrmethod.length; ++i) {
            Method method = arrmethod[i];
            if (!method.getName().equals(string) || method.getParameterTypes().length != arrobject.length) continue;
            return method;
        }
        Config.lllIlIIlIIIlIlIIIllIlllIl("No method found for: " + class_.getName() + "." + string + "(" + Config.lllIIIllIIIIlllIlIIllIIll(arrobject) + ")");
        return null;
    }

    public static String lllIIIllIIIIlllIlIIllIIll(Object[] arrobject) {
        if (arrobject == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(arrobject.length * 5);
        for (int i = 0; i < arrobject.length; ++i) {
            Object object = arrobject[i];
            if (i > 0) {
                stringBuffer.append(", ");
            }
            stringBuffer.append(String.valueOf(object));
        }
        return stringBuffer.toString();
    }

    public static String lllIIIllIIIIlllIlIIllIIll(int[] arrn) {
        if (arrn == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(arrn.length * 5);
        for (int i = 0; i < arrn.length; ++i) {
            int n = arrn[i];
            if (i > 0) {
                stringBuffer.append(", ");
            }
            stringBuffer.append(String.valueOf(n));
        }
        return stringBuffer.toString();
    }

    public static Minecraft llIlllIlIIllIlIIIIllIIlIl() {
        return lIlllIlllIlIIIIlllIlIlIIl;
    }

    public static class_1682 lIIIllIIIIIllllIlIlIllIll() {
        return lIlllIlllIlIIIIlllIlIlIIl.llIIlIIllIIllIlIIllIIllII();
    }

    public static class_0947 lIIIlIIIlIlllIllIIIlIIIlI() {
        return lIlllIlllIlIIIIlllIlIlIIl.getResourceManager();
    }

    public static InputStream lllIIIllIIIIlllIlIIllIIll(ResourceLocation class_17732) {
        return Config.lllIIIllIIIIlllIlIIllIIll(lIlllIlllIlIIIIlllIlIlIIl.getResourceManager(), class_17732);
    }

    public static InputStream lllIIIllIIIIlllIlIIllIIll(class_0947 class_09472, ResourceLocation class_17732) {
        class_2234 class_22342 = class_09472.getResource(class_17732);
        return class_22342 == null ? null : class_22342.getInputStream();
    }

    public static class_2234 lllIlIIlIIIlIlIIIllIlllIl(ResourceLocation class_17732) {
        return lIlllIlllIlIIIIlllIlIlIIl.getResourceManager().getResource(class_17732);
    }

    public static boolean IlIllllllIIlIIllllIIlIIIl(ResourceLocation class_17732) {
        try {
            class_2234 class_22342 = Config.lllIlIIlIIIlIlIIIllIlllIl(class_17732);
            return class_22342 != null;
        }
        catch (IOException iOException) {
            return false;
        }
    }

    public static boolean lllIlIIlIIIlIlIIIllIlllIl(class_0947 class_09472, ResourceLocation class_17732) {
        try {
            class_2234 class_22342 = class_09472.getResource(class_17732);
            return class_22342 != null;
        }
        catch (IOException iOException) {
            return false;
        }
    }

    public static class_0449[] lIIlIlllIllIlIlllIIIIIIII() {
        class_0449[] arrclass_04492;
        class_1605 class_16052 = lIlllIlllIlIIIIlllIlIlIIl.IllllIIIIlIIlIIIIlllIIIIl();
        List list = class_16052.IlIllllllIIlIIllllIIlIIIl();
        ArrayList<class_0449> arrayList = new ArrayList<class_0449>();
        for (class_0449[] arrclass_04492 : list) {
            arrayList.add(arrclass_04492.IlIllllllIIlIIllllIIlIIIl());
        }
        if (class_16052.IlIIIIIllllllIIlllIllllll() != null) {
            arrayList.add(class_16052.IlIIIIIllllllIIlllIllllll());
        }
        arrclass_04492 = arrayList.toArray(new class_0449[arrayList.size()]);
        return arrclass_04492;
    }

    public static String IIlIllIIlllllIIlIIllllIIl() {
        class_0449[] arrclass_0449 = Config.lIIlIlllIllIlIlllIIIIIIII();
        if (arrclass_0449.length <= 0) {
            return Config.IllllIIlIIIllIlllIlllIllI().IlIllllllIIlIIllllIIlIIIl();
        }
        String[] arrstring = new String[arrclass_0449.length];
        for (int i = 0; i < arrclass_0449.length; ++i) {
            arrstring[i] = arrclass_0449[i].IlIllllllIIlIIllllIIlIIIl();
        }
        String string = Config.lllIIIllIIIIlllIlIIllIIll(arrstring);
        return string;
    }

    public static DefaultResourcePack IllllIIlIIIllIlllIlllIllI() {
        if (llIIIIllIIIIIIIlIIIlIIIIl == null) {
            Object object;
            Minecraft class_06672 = Minecraft.getMinecraft();
            try {
                object = class_06672.getClass().getDeclaredFields();
                for (int i = 0; i < ((Field[])object).length; ++i) {
                    Field field = object[i];
                    if (field.getType() != DefaultResourcePack.class) continue;
                    field.setAccessible(true);
                    llIIIIllIIIIIIIlIIIlIIIIl = (DefaultResourcePack)field.get(class_06672);
                    break;
                }
            }
            catch (Exception exception) {
                Config.lllIlIIlIIIlIlIIIllIlllIl("Error getting default resource pack: " + exception.getClass().getName() + ": " + exception.getMessage());
            }
            if (llIIIIllIIIIIIIlIIIlIIIIl == null && (object = class_06672.IllllIIIIlIIlIIIIlllIIIIl()) != null) {
                llIIIIllIIIIIIIlIIIlIIIIl = (DefaultResourcePack)object.lllIlIIlIIIlIlIIIllIlllIl;
            }
        }
        return llIIIIllIIIIIIIlIIIlIIIIl;
    }

    public static boolean lIlllIlllIIIIlIIlllIllIII(ResourceLocation class_17732) {
        class_0449 class_04492 = Config.IlIIIIIllllllIIlllIllllll(class_17732);
        return class_04492 == Config.IllllIIlIIIllIlllIlllIllI();
    }

    public static class_0449 IlIIIIIllllllIIlllIllllll(ResourceLocation class_17732) {
        class_0449[] arrclass_0449 = Config.lIIlIlllIllIlIlllIIIIIIII();
        for (int i = arrclass_0449.length - 1; i >= 0; --i) {
            class_0449 class_04492 = arrclass_0449[i];
            if (!class_04492.lllIlIIlIIIlIlIIIllIlllIl(class_17732)) continue;
            return class_04492;
        }
        if (Config.IllllIIlIIIllIlllIlllIllI().lllIlIIlIIIlIlIIIllIlllIl(class_17732)) {
            return Config.IllllIIlIIIllIlllIlllIllI();
        }
        return null;
    }

    public static class_1114 IllIlIlIIIlllIIllIIIIlIll() {
        return lIlllIlllIlIIIIlllIlIlIIl == null ? null : Config.lIlllIlllIlIIIIlllIlIlIIl.IllIIIllIIIIlIlIlIllIIlll;
    }

    public static int IlIIIlIllIIIllIIIIlIIlIll() {
        return 64;
    }

    public static class_2102 lllIIIllIIIIlllIlIIllIIll(class_1843 class_18432, int n, int n2, int n3, int n4, class_2102 class_21022) {
        if (!Config.llllIIllIlIlllllllIIlIIlI()) {
            return class_21022;
        }
        class_2102 class_21023 = class_1384.IllllIIlIIIllIlllIlllIllI;
        Block class_05492 = Blocks.IlIllllllIIlIIllllIIlIIIl;
        if (class_21022 == class_1384.IlllIIIllllIIllIllIlIIlIl) {
            class_21023 = class_1384.lllIIIlIIlIlIllIIIIIlIIll;
            class_05492 = Blocks.lIIIlllIlIIIlIllIIIlIllll;
        }
        if (Config.IlllIIlllllllIIllIlIllllI()) {
            --n2;
            switch (n4) {
                case 2: {
                    --n3;
                    break;
                }
                case 3: {
                    ++n3;
                    break;
                }
                case 4: {
                    --n;
                    break;
                }
                case 5: {
                    ++n;
                }
            }
            Block class_05493 = class_18432.a_(n, n2, n3);
            if (class_05493 != class_05492) {
                return class_21022;
            }
        }
        return class_21023;
    }

    public static class_2102 lllIIIllIIIIlllIlIIllIIll(class_1843 class_18432, int n, int n2, int n3, int n4) {
        if (!Config.llllIIllIlIlllllllIIlIIlI()) {
            return class_1384.IlllIIlllllllIIllIlIllllI;
        }
        if (Config.IlllIIlllllllIIllIlIllllI()) {
            switch (n4) {
                case 2: {
                    --n3;
                    break;
                }
                case 3: {
                    ++n3;
                    break;
                }
                case 4: {
                    --n;
                    break;
                }
                case 5: {
                    ++n;
                }
            }
            Block class_05492 = class_18432.a_(n, n2, n3);
            if (class_05492 != Blocks.lIIllIIlIIIlllIlllIIlIIlI && class_05492 != Blocks.IIIlIllllIIIlllllIllIlIII) {
                return class_1384.IlllIIlllllllIIllIlIllllI;
            }
        }
        return class_1384.llllIIllIlIlllllllIIlIIlI;
    }

    public static boolean llllIIllIlIlllllllIIlIIlI() {
        return false;
    }

    public static boolean IlllIIlllllllIIllIlIllllI() {
        return Config.llIllllIlIllIIIlIllIIlIlI.IllIIIIllIIllIllIlllIlIIl == 2;
    }

    public static boolean IlllIIIllllIIllIllIlIIlIl() {
        return Config.llIllllIlIllIIIlIllIIlIlI.IlIlIIlllIllllllllIIIlIlI;
    }

    public static boolean lllIIIlIIlIlIllIIIIIlIIll() {
        return Config.llIllllIlIllIIIlIllIIlIlI.llllIIIIlIIIlIIIIIIlIllll;
    }

    public static boolean IIIlIlIllIlllllIlIllllllI() {
        return Config.llIllllIlIllIIIlIllIIlIlI.IIllIllIIllIIlllIIIlIlllI;
    }

    public static boolean IIIIlIllIlIIIIIllllIIlllI() {
        return Config.llIllllIlIllIIIlIllIIlIlI.llllllIlIllllIlIlIlIIIIlI == 0 ? Config.llIllllIlIllIIIlIllIIlIlI.IIIllIllIIlIlIlIlIllllIIl : Config.llIllllIlIllIIIlIllIIlIlI.llllllIlIllllIlIlIlIIIIlI == 2;
    }

    public static boolean llllIlIIllIIlllllIIllIIll() {
        return Config.llIllllIlIllIIIlIllIIlIlI.llIIIIllIIIIIIIlIIIlIIIIl;
    }

    public static void lllIIIllIIIIlllIlIIllIIll(long l) {
        try {
            Thread.currentThread();
            Thread.sleep(l);
        }
        catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
    }

    public static boolean IlIlIllIIlIIIIlllIlIllIlI() {
        return Config.llIllllIlIllIIIlIllIIlIlI.lllIIIIIIlIlllIIlIlIIIllI == 1;
    }

    public static boolean IlIIllIlIlIllIIIlIIlIlIIl() {
        return Config.llIllllIlIllIIIlIllIIlIlI.lllIIIIIIlIlllIIlIlIIIllI == 0 || Config.llIllllIlIllIIIlIllIIlIlI.lllIIIIIIlIlllIIlIlIIIllI == 2;
    }

    public static boolean lIlIIllIllIIIIIlIllllIIIl() {
        return Config.llIllllIlIllIIIlIllIIlIlI.lllIIIIIIlIlllIIlIlIIIllI == 3;
    }

    public static boolean lIlllIIllIIIIIIlIlIIlIllI() {
        return Config.llIllllIlIllIIIlIllIIlIlI.llIIlIIllIIllIlIIllIIllII;
    }

    public static int llIIIlIlIlIIlIllIIIllIlIl() {
        return Config.llIllllIlIllIIIlIllIIlIlI.anisotropicFiltering;
    }

    public static boolean lIIlIIlIllIlIIlIlIIlIlIlI() {
        return Config.llIIIlIlIlIIlIllIIIllIlIl() > 1;
    }

    public static int llIIIIIlIIlIIIIllIIIlIIII() {
        return IIIIIIIIlIllIIllIIlllIllI;
    }

    public static boolean lIlIlIIllIIIlllIllIIlIllI() {
        return false;
    }

    public static boolean lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, int n3) {
        return n >= n2 && n <= n3;
    }

    public static boolean IlIIIIIllIlllIIIIlIIIllIl() {
        return Config.llIllllIlIllIIIlIllIIlIlI.IlIIIIIllIlllIIIIlIIIllIl;
    }

    public static boolean lIIlIlIIllIIIlIIlIlIIIlII() {
        return Config.llIllllIlIllIIIlIllIIlIlI.IllllIIIIlIIlIIIIlllIIIIl;
    }

    public static Dimension lIIIlIIllIllIIlIIlIIIllII() {
        if (IllIIIIllIIllIllIlllIlIIl == null) {
            return null;
        }
        if (llIllllIlIllIIIlIllIIlIlI == null) {
            return new Dimension(IllIIIIllIIllIllIlllIlIIl.getWidth(), IllIIIIllIIllIllIlllIlIIl.getHeight());
        }
        String string = Config.llIllllIlIllIIIlIllIIlIlI.llllIlIIIIIIIIIlllIIlIIIl;
        if (string.equals("Default")) {
            return new Dimension(IllIIIIllIIllIllIlllIlIIl.getWidth(), IllIIIIllIIllIllIlllIlIIl.getHeight());
        }
        String[] arrstring = Config.lllIIIllIIIIlllIlIIllIIll(string, " x");
        return arrstring.length < 2 ? new Dimension(IllIIIIllIIllIllIlllIlIIl.getWidth(), IllIIIIllIIllIllIlllIlIIl.getHeight()) : new Dimension(Config.lllIIIllIIIIlllIlIIllIIll(arrstring[0], -1), Config.lllIIIllIIIIlllIlIIllIIll(arrstring[1], -1));
    }

    public static int lllIIIllIIIIlllIlIIllIIll(String string, int n) {
        try {
            if (string == null) {
                return n;
            }
            string = string.trim();
            return Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            return n;
        }
    }

    public static float lllIIIllIIIIlllIlIIllIIll(String string, float f) {
        try {
            if (string == null) {
                return f;
            }
            string = string.trim();
            return Float.parseFloat(string);
        }
        catch (NumberFormatException numberFormatException) {
            return f;
        }
    }

    public static boolean lllIIIllIIIIlllIlIIllIIll(String string, boolean bl) {
        try {
            if (string == null) {
                return bl;
            }
            string = string.trim();
            return Boolean.parseBoolean(string);
        }
        catch (NumberFormatException numberFormatException) {
            return bl;
        }
    }

    public static String[] lllIIIllIIIIlllIlIIllIIll(String string, String string2) {
        String[] arrstring;
        StringTokenizer stringTokenizer = new StringTokenizer(string, string2);
        ArrayList<String[]> arrayList = new ArrayList<String[]>();
        while (stringTokenizer.hasMoreTokens()) {
            arrstring = stringTokenizer.nextToken();
            arrayList.add(arrstring);
        }
        arrstring = arrayList.toArray(new String[arrayList.size()]);
        return arrstring;
    }

    public static DisplayMode lIlIllIIllIIIIlllIlIlllIl() {
        return IllIIIIllIIllIllIlllIlIIl;
    }

    public static DisplayMode[] IlIIIlIIlllllIIIllIlIlIll() {
        try {
            Object object;
            DisplayMode[] arrdisplayMode = Display.getAvailableDisplayModes();
            ArrayList<DisplayMode> arrayList = new ArrayList<DisplayMode>();
            for (int i = 0; i < arrdisplayMode.length; ++i) {
                object = arrdisplayMode[i];
                if (IllIIIIllIIllIllIlllIlIIl != null && (object.getBitsPerPixel() != IllIIIIllIIllIllIlllIlIIl.getBitsPerPixel() || object.getFrequency() != IllIIIIllIIllIllIlllIlIIl.getFrequency())) continue;
                arrayList.add((DisplayMode)object);
            }
            DisplayMode[] arrdisplayMode2 = arrayList.toArray((T[])new DisplayMode[arrayList.size()]);
            object = new class_1127();
            Arrays.sort(arrdisplayMode2, object);
            return arrdisplayMode2;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return new DisplayMode[]{IllIIIIllIIllIllIlllIlIIl};
        }
    }

    public static String[] lIIllllllllIlIllllllllIlI() {
        DisplayMode[] arrdisplayMode = Config.IlIIIlIIlllllIIIllIlIlIll();
        String[] arrstring = new String[arrdisplayMode.length];
        for (int i = 0; i < arrdisplayMode.length; ++i) {
            String string;
            DisplayMode displayMode = arrdisplayMode[i];
            arrstring[i] = string = "" + displayMode.getWidth() + "x" + displayMode.getHeight();
        }
        return arrstring;
    }

    public static DisplayMode lllIIIllIIIIlllIlIIllIIll(Dimension dimension) {
        DisplayMode[] arrdisplayMode = Display.getAvailableDisplayModes();
        for (int i = 0; i < arrdisplayMode.length; ++i) {
            DisplayMode displayMode = arrdisplayMode[i];
            if (displayMode.getWidth() != dimension.width || displayMode.getHeight() != dimension.height || IllIIIIllIIllIllIlllIlIIl != null && (displayMode.getBitsPerPixel() != IllIIIIllIIllIllIlllIlIIl.getBitsPerPixel() || displayMode.getFrequency() != IllIIIIllIIllIllIlllIlIIl.getFrequency())) continue;
            return displayMode;
        }
        return IllIIIIllIIllIllIlllIlIIl;
    }

    public static boolean lIIIIllIIllIIIlIIIllIllII() {
        return Config.llIIIIIlIIlIIIIllIIIlIIII() > 0;
    }

    public static boolean lIIllIIlIIIlllIlllIIlIIlI() {
        return Config.llIllllIlIllIIIlIllIIlIlI.lIIlIlIIllIIIlIIlIlIIIlII;
    }

    public static boolean IllIIllIlIlllIllIllIlIIIl() {
        return Config.llIllllIlIllIIIlIllIIlIlI.lIIIlIIllIllIIlIIlIIIllII;
    }

    public static boolean IIIlIllllIIIlllllIllIlIII() {
        return Config.llIllllIlIllIIIlIllIIlIlI.lIlIllIIllIIIIlllIlIlllIl;
    }

    public static boolean IIIIIllIlIllIlIlIIlIllIIl() {
        return Config.llIllllIlIllIIIlIllIIlIlI.IIIIlIlIIlIIIIlIlllIlIIII;
    }

    public static boolean lIIllIlIIlIIlllllIlIIllIl() {
        return Config.llIllllIlIllIIIlIllIIlIlI.lllIIIIlIlIIlIIlllIIIIIIl;
    }

    public static void IlIIIIIllllllIIlllIllllll(String string) {
        int n = GL11.glGetError();
        if (n != 0) {
            String string2 = GLU.gluErrorString((int)n);
            Config.IlIllllllIIlIIllllIIlIIIl("OpenGlError: " + n + " (" + string2 + "), at: " + string);
        }
    }

    public static boolean lIIlllIIlIlIlIIIlIlllIIll() {
        return Config.llIllllIlIllIIIlIllIIlIlI.llIlIIlllIIIIIllIIlIlIIII;
    }

    public static boolean IlIIlIIlllllIlIIlIlIlIlIl() {
        return Config.llIllllIlIllIIIlIllIIlIlI.llIlllIlIIllIlIIIIllIIlIl;
    }

    public static boolean lIlIIIllIIllIIlIllllllIll() {
        return Config.llIllllIlIllIIIlIllIIlIlI.lIIIllIIIIIllllIlIlIllIll;
    }

    public static boolean lIlIIlllllIlllllIlIIIllll() {
        return Config.llIllllIlIllIIIlIllIIlIlI.IllIIIlllllIlIlllIlllllII;
    }

    public static boolean lllllllIlIIlIlIIIlIlIIlll() {
        return Config.llIllllIlIllIIIlIllIIlIlI.lIIIlIIIlIlllIllIIIlIIIlI;
    }

    public static boolean llIllllIIIIIlIIlIlllIIlll() {
        return Config.llIllllIlIllIIIlIllIIlIlI.lIIlIlllIllIlIlllIIIIIIII != 3;
    }

    public static boolean IIIIlllIIlIllllllIllIIlll() {
        return Config.llIllllIlIllIIIlIllIIlIlI.IIlIllIIlllllIIlIIllllIIl;
    }

    public static boolean IIIIIIlIIIIIIIIIIlIlIlIlI() {
        return Config.llIllllIlIllIIIlIllIIlIlI.lIIlIlllIllIlIlllIIIIIIII == 2;
    }

    public static boolean IllIlllIIIlllllIllIIlIlIl() {
        return Config.llIllllIlIllIIIlIllIIlIlI.IllIlIlIIIlllIIllIIIIlIll;
    }

    public static boolean IllIIIIlIIlllllllllIlIlII() {
        return Config.llIllllIlIllIIIlIllIIlIlI.IlIIIlIllIIIllIIIIlIIlIll == 2;
    }

    public static String[] lllIIIllIIIIlllIlIIllIIll(File file) {
        FileInputStream fileInputStream = new FileInputStream(file);
        return Config.lllIIIllIIIIlllIlIIllIIll(fileInputStream);
    }

    public static String[] lllIIIllIIIIlllIlIIllIIll(InputStream inputStream) {
        ArrayList<String> arrayList = new ArrayList<String>();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "ASCII");
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        while (true) {
            String string;
            if ((string = bufferedReader.readLine()) == null) {
                String[] arrstring = arrayList.toArray(new String[arrayList.size()]);
                return arrstring;
            }
            arrayList.add(string);
        }
    }

    public static String lllIlIIlIIIlIlIIIllIlllIl(File file) {
        FileInputStream fileInputStream = new FileInputStream(file);
        return Config.lllIIIllIIIIlllIlIIllIIll(fileInputStream, "ASCII");
    }

    public static String lllIlIIlIIIlIlIIIllIlllIl(InputStream inputStream) {
        return Config.lllIIIllIIIIlllIlIIllIIll(inputStream, "ASCII");
    }

    public static String lllIIIllIIIIlllIlIIllIIll(InputStream inputStream, String string) {
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, string);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        StringBuffer stringBuffer = new StringBuffer();
        String string2;
        while ((string2 = bufferedReader.readLine()) != null) {
            stringBuffer.append(string2);
            stringBuffer.append("\n");
        }
        return stringBuffer.toString();
    }

    public static byte[] IlIllllllIIlIIllllIIlIIIl(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] arrby = new byte[1024];
        while (true) {
            int n;
            if ((n = inputStream.read(arrby)) < 0) {
                inputStream.close();
                byte[] arrby2 = byteArrayOutputStream.toByteArray();
                return arrby2;
            }
            byteArrayOutputStream.write(arrby, 0, n);
        }
    }

    public static GameSettings getGameSettings() {
        return llIllllIlIllIIIlIllIIlIlI;
    }

    public static String llllIIIlIlIlIlIIlIIIIIlIl() {
        return lIlIllIIlIIlIIlIIlIIlIIll;
    }

    public static void lIllllIIlIIIlIllllllIIIll(String string) {
    }

    public static int lllIlIIlIIIlIlIIIllIlllIl(String string, String string2) {
        int n;
        String[] arrstring;
        String string3;
        String[] arrstring2 = Config.IllIIlllllllIIlIIlIIIIlIl(string);
        String string4 = arrstring2[0];
        if (!string4.equals(string3 = (arrstring = Config.IllIIlllllllIIlIIlIIIIlIl(string2))[0])) {
            return string4.compareTo(string3);
        }
        int n2 = Config.lllIIIllIIIIlllIlIIllIIll(arrstring2[1], -1);
        if (n2 != (n = Config.lllIIIllIIIIlllIlIIllIIll(arrstring[1], -1))) {
            return n2 - n;
        }
        String string5 = arrstring2[2];
        String string6 = arrstring[2];
        if (!string5.equals(string6)) {
            if (string5.isEmpty()) {
                return 1;
            }
            if (string6.isEmpty()) {
                return -1;
            }
        }
        return string5.compareTo(string6);
    }

    private static String[] IllIIlllllllIIlIIlIIIIlIl(String string) {
        if (string != null && string.length() > 0) {
            Pattern pattern = Pattern.compile("([A-Z])([0-9]+)(.*)");
            Matcher matcher = pattern.matcher(string);
            if (!matcher.matches()) {
                return new String[]{"", "", ""};
            }
            String string2 = Config.IIIllIIlIIIIIIlIlIIllIIlI(matcher.group(1));
            String string3 = Config.IIIllIIlIIIIIIlIlIIllIIlI(matcher.group(2));
            String string4 = Config.IIIllIIlIIIIIIlIlIIllIIlI(matcher.group(3));
            return new String[]{string2, string3, string4};
        }
        return new String[]{"", "", ""};
    }

    public static int lllIIIllIIIIlllIlIIllIIll(int n) {
        n = n ^ 0x3D ^ n >> 16;
        n += n << 3;
        n ^= n >> 4;
        n *= 668265261;
        n ^= n >> 15;
        return n;
    }

    public static int lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4) {
        int n5 = Config.lllIIIllIIIIlllIlIIllIIll(n4 + 37);
        n5 = Config.lllIIIllIIIIlllIlIIllIIll(n5 + n);
        n5 = Config.lllIIIllIIIIlllIlIIllIIll(n5 + n3);
        n5 = Config.lllIIIllIIIIlllIlIIllIIll(n5 + n2);
        return n5;
    }

    public static class_0976 llIIIlIIllIIllIllIIlIlllI() {
        if (lIlllIlllIlIIIIlllIlIlIIl == null) {
            return null;
        }
        class_0564 class_05642 = Config.lIlllIlllIlIIIIlllIlIlIIl.theWorld;
        if (class_05642 == null) {
            return null;
        }
        if (!lIlllIlllIlIIIIlllIlIlIIl.IIIIlIllIlIIlIIlIllIlIlll()) {
            return null;
        }
        class_0519 class_05192 = lIlllIlllIlIIIIlllIlIlIIl.llllIIIIlIIIlIIIIIIlIllll();
        if (class_05192 == null) {
            return null;
        }
        class_1163 class_11632 = class_05642.IlIlIIlllIIlIllIIIlllllIl;
        if (class_11632 == null) {
            return null;
        }
        int n = class_11632.IIIllIllIIlIlIlIlIllllIIl;
        try {
            class_0976 class_09762 = class_05192.lllIIIllIIIIlllIlIIllIIll(n);
            return class_09762;
        }
        catch (NullPointerException nullPointerException) {
            return null;
        }
    }

    public static int lIIIIlIlIlIIIlIIllIIlIlIl() {
        return IIlIIlIlIlIllIIlIlIIIIlll;
    }

    public static void lllllIllllIIIIllIIlIlIlII() {
        IIlIIlIlIlIllIIlIlIIIIlll = Runtime.getRuntime().availableProcessors();
    }

    public static boolean lIIllIlIllIlIlIIlIlIIIIll() {
        return Config.lIIIIlIlIlIIIlIIllIIlIlIl() <= 1;
    }

    public static boolean lIIllllIllIlllllIIllIllIl() {
        return !Config.lIIllIlIllIlIlIIlIlIIIIll() ? false : Config.llIllllIlIllIIIlIllIIlIlI.IlIlIIlllIIlIllIIIlllllIl;
    }

    public static boolean IIIIIlllIIllllIlllIlllIIl() {
        return !Config.lIIllIlIllIlIlIIlIlIIIIll() ? false : Config.llIllllIlIllIIIlIllIIlIlI.lIIlIIIIIlIlllIlIIlIlIlll;
    }

    public static int llllIIllllIllIlllllIIlIlI() {
        if (llIllllIlIllIIIlIllIIlIlI == null) {
            return 10;
        }
        int n = Config.llIllllIlIllIIIlIllIIlIlI.IlIllllllIIlIIllllIIlIIIl;
        return n;
    }

    public static boolean lllIIIllIIIIlllIlIIllIIll(Object object, Object object2) {
        return object == object2 ? true : (object == null ? false : object.equals(object2));
    }

    public static String IIIllIIlIIIIIIlIlIIllIIlI(String string) {
        return string == null ? "" : string;
    }

    public static void IllIlIlIIIlIllIlIlIIlllII() {
        int n = Config.llIIIIIlIIlIIIIllIIIlIIII();
        if (n > 0) {
            DisplayMode displayMode = Display.getDisplayMode();
            Config.lllIIIllIIIIlllIlIIllIIll("FSAA Samples: " + n);
            try {
                Display.destroy();
                Display.setDisplayMode((DisplayMode)displayMode);
                Display.create((PixelFormat)new PixelFormat().withDepthBits(24).withSamples(n));
                Display.setResizable((boolean)false);
                Display.setResizable((boolean)true);
            }
            catch (LWJGLException lWJGLException) {
                Config.lllIlIIlIIIlIlIIIllIlllIl("Error setting FSAA: " + n + "x");
                lWJGLException.printStackTrace();
                try {
                    Display.setDisplayMode((DisplayMode)displayMode);
                    Display.create((PixelFormat)new PixelFormat().withDepthBits(24));
                    Display.setResizable((boolean)false);
                    Display.setResizable((boolean)true);
                }
                catch (LWJGLException lWJGLException2) {
                    lWJGLException2.printStackTrace();
                    try {
                        Display.setDisplayMode((DisplayMode)displayMode);
                        Display.create();
                        Display.setResizable((boolean)false);
                        Display.setResizable((boolean)true);
                    }
                    catch (LWJGLException lWJGLException3) {
                        lWJGLException3.printStackTrace();
                    }
                }
            }
            if (class_0155.lllIIIllIIIIlllIlIIllIIll() != class_0344.lIlllIlllIIIIlIIlllIllIII) {
                InputStream inputStream = null;
                Object var3_5 = null;
                try {
                    inputStream = Config.IllllIIlIIIllIlllIlllIllI().lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("client/icon.png"));
                    if (inputStream != null) {
                        Display.setIcon((ByteBuffer[])new ByteBuffer[]{Config.lIlllIlllIIIIlIIlllIllIII(inputStream)});
                    }
                }
                catch (IOException iOException) {
                    Config.lllIlIIlIIIlIlIIIllIlllIl(iOException.getClass().getName() + ": " + iOException.getMessage());
                    iOException.printStackTrace();
                }
            }
        }
    }

    private static ByteBuffer lIlllIlllIIIIlIIlllIllIII(InputStream inputStream) {
        BufferedImage bufferedImage = ImageIO.read(inputStream);
        int[] arrn = bufferedImage.getRGB(0, 0, bufferedImage.getWidth(), bufferedImage.getHeight(), null, 0, bufferedImage.getWidth());
        ByteBuffer byteBuffer = ByteBuffer.allocate(4 * arrn.length);
        int[] arrn2 = arrn;
        int n = arrn.length;
        for (int i = 0; i < n; ++i) {
            int n2 = arrn2[i];
            byteBuffer.putInt(n2 << 8 | n2 >> 24 & 0xFF);
        }
        byteBuffer.flip();
        return byteBuffer;
    }

    private static ByteBuffer IlIllllllIIlIIllllIIlIIIl(File file) {
        BufferedImage bufferedImage = ImageIO.read(file);
        int[] arrn = bufferedImage.getRGB(0, 0, bufferedImage.getWidth(), bufferedImage.getHeight(), null, 0, bufferedImage.getWidth());
        ByteBuffer byteBuffer = ByteBuffer.allocate(4 * arrn.length);
        int[] arrn2 = arrn;
        int n = arrn.length;
        for (int i = 0; i < n; ++i) {
            int n2 = arrn2[i];
            byteBuffer.putInt(n2 << 8 | n2 >> 24 & 0xFF);
        }
        byteBuffer.flip();
        return byteBuffer;
    }

    public static void lIIIllIlIlIlIIIllIlIlIllI() {
        try {
            if (lIlllIlllIlIIIIlllIlIlIIl.lIlIIllllIlIIIIllIIIIlIIl()) {
                if (IIIIlIllIlIIlIIlIllIlIlll) {
                    return;
                }
                IIIIlIllIlIIlIIlIllIlIlll = true;
                IlIlIIlllIllllllllIIIlIlI = false;
                DisplayMode displayMode = Display.getDisplayMode();
                Dimension dimension = Config.lIIIlIIllIllIIlIIlIIIllII();
                if (dimension == null) {
                    return;
                }
                if (displayMode.getWidth() == dimension.width && displayMode.getHeight() == dimension.height) {
                    return;
                }
                DisplayMode displayMode2 = Config.lllIIIllIIIIlllIlIIllIIll(dimension);
                if (displayMode2 == null) {
                    return;
                }
                Display.setDisplayMode((DisplayMode)displayMode2);
                Config.lIlllIlllIlIIIIlllIlIlIIl.displayWidth = Display.getDisplayMode().getWidth();
                Config.lIlllIlllIlIIIIlllIlIlIIl.displayHeight = Display.getDisplayMode().getHeight();
                if (Config.lIlllIlllIlIIIIlllIlIlIIl.displayWidth <= 0) {
                    Config.lIlllIlllIlIIIIlllIlIlIIl.displayWidth = 1;
                }
                if (Config.lIlllIlllIlIIIIlllIlIlIIl.displayHeight <= 0) {
                    Config.lIlllIlllIlIIIIlllIlIlIIl.displayHeight = 1;
                }
                if (Config.lIlllIlllIlIIIIlllIlIlIIl.lllllIlllIIllIlIIlIIIllII != null) {
                    class_0321 class_03212 = new class_0321(lIlllIlllIlIIIIlllIlIlIIl, Config.lIlllIlllIlIIIIlllIlIlIIl.displayWidth, Config.lIlllIlllIlIIIIlllIlIlIIl.displayHeight);
                    int n = class_03212.lllIIIllIIIIlllIlIIllIIll();
                    int n2 = class_03212.lllIlIIlIIIlIlIIIllIlllIl();
                    Config.lIlllIlllIlIIIIlllIlIlIIl.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(lIlllIlllIlIIIIlllIlIlIIl, n, n2);
                }
                Config.lIlllIlllIlIIIIlllIlIlIIl.IlIlIIlllIIlIllIIIlllllIl = new class_2069(lIlllIlllIlIIIIlllIlIlIIl);
                Config.IIIlIllIlllIlIIIlIlIIllII();
                Display.setFullscreen((boolean)true);
                Config.lIlllIlllIlIIIIlllIlIlIIl.gameSettings.IIIllIllIIlIlIlIlIllllIIl();
                GL11.glEnable((int)3553);
            } else {
                if (IlIlIIlllIllllllllIIIlIlI) {
                    return;
                }
                IlIlIIlllIllllllllIIIlIlI = true;
                IIIIlIllIlIIlIIlIllIlIlll = false;
                Config.lIlllIlllIlIIIIlllIlIlIIl.gameSettings.IIIllIllIIlIlIlIlIllllIIl();
                Display.update();
                GL11.glEnable((int)3553);
                Display.setResizable((boolean)false);
                Display.setResizable((boolean)true);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static void IIIlIllIlllIlIIIlIlIIllII() {
        lIlllIlllIlIIIIlllIlIlIIl.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(Config.lIlllIlllIlIIIIlllIlIlIIl.displayWidth, Config.lIlllIlllIlIIIIlllIlIlIIl.displayHeight);
        if (Config.lIlllIlllIlIIIIlllIlIlIIl.lIIlIIIIIlIlllIlIIlIlIlll != null) {
            Config.lIlllIlllIlIIIIlllIlIlIIl.lIIlIIIIIlIlllIlIIlIlIlll.lllIIIllIIIIlllIlIIllIIll(Config.lIlllIlllIlIIIIlllIlIlIIl.displayWidth, Config.lIlllIlllIlIIIIlllIlIlIIl.displayHeight);
        }
    }

    public static Object[] lllIIIllIIIIlllIlIIllIIll(Object[] arrobject, Object object) {
        if (arrobject == null) {
            throw new NullPointerException("The given array is NULL");
        }
        int n = arrobject.length;
        int n2 = n + 1;
        Object[] arrobject2 = (Object[])Array.newInstance(arrobject.getClass().getComponentType(), n2);
        System.arraycopy(arrobject, 0, arrobject2, 0, n);
        arrobject2[n] = object;
        return arrobject2;
    }

    public static Object[] lllIIIllIIIIlllIlIIllIIll(Object[] arrobject, Object object, int n) {
        ArrayList<Object> arrayList = new ArrayList<Object>(Arrays.asList(arrobject));
        arrayList.add(n, object);
        Object[] arrobject2 = (Object[])Array.newInstance(arrobject.getClass().getComponentType(), arrayList.size());
        return arrayList.toArray(arrobject2);
    }

    public static Object[] lllIIIllIIIIlllIlIIllIIll(Object[] arrobject, Object[] arrobject2) {
        if (arrobject == null) {
            throw new NullPointerException("The given array is NULL");
        }
        if (arrobject2.length == 0) {
            return arrobject;
        }
        int n = arrobject.length;
        int n2 = n + arrobject2.length;
        Object[] arrobject3 = (Object[])Array.newInstance(arrobject.getClass().getComponentType(), n2);
        System.arraycopy(arrobject, 0, arrobject3, 0, n);
        System.arraycopy(arrobject2, 0, arrobject3, n, arrobject2.length);
        return arrobject3;
    }

    public static boolean lIIlIlllIIlIIIIlIlIIIIlll() {
        return false;
    }

    public static void IIIlIIllIIlIlIIlIIllIIIIl() {
        String string = Config.lIlllIlllIlIIIIlllIlIlIIl.llllIIIIlIIIlIIIIIIlIllll;
        int n = string.indexOf(32);
        if (n < 0) {
            n = 0;
        }
        String string2 = string.substring(0, n);
        String string3 = Config.IIIllIllIIlIlIlIlIllllIIl(Config.lIlllIlllIlIIIIlllIlIlIIl.llllIIIIlIIIlIIIIIIlIllll);
        int n2 = Config.lIlllIlllIlIIIIlllIlIlIIl.IllIIIllIIIIlIlIlIllIIlll.llIIllIllIlIIlIIllIllllll();
        int n3 = Config.lIlllIlllIlIIIIlllIlIlIIl.IllIIIllIIIIlIlIlIllIIlll.lllIIlIIIllllllIIIIlIlIlI();
        int n4 = Config.lIlllIlllIlIIIIlllIlIlIIl.IllIIIllIIIIlIlIlIllIIlll.IlIlllIIIIIIlIIllIIllIlll();
        String string4 = string2 + " fps, C: " + n2 + ", E: " + n3 + "+" + n4 + ", U: " + string3;
        Config.lIlllIlllIlIIIIlllIlIlIIl.IlIlllIIIIIIlIIllIIllIlll.lllIlIIlIIIlIlIIIllIlllIl(string4, 2, 2, -2039584);
    }

    private static String IIIllIllIIlIlIlIlIllllIIl(String string) {
        int n = string.indexOf(", ");
        if (n < 0) {
            return "";
        }
        int n2 = string.indexOf(32, n += 2);
        return n2 < 0 ? "" : string.substring(n, n2);
    }

    public static int IIIIlIIIllIIIlIIlIIIIIlll() {
        String string = System.getenv("ProgramFiles(X86)");
        return string != null ? 64 : 32;
    }

    public static int lIIIIIlIllIllIlIlIIllllll() {
        String[] arrstring = new String[]{"sun.arch.data.model", "com.ibm.vm.bitmode", "os.arch"};
        for (int i = 0; i < arrstring.length; ++i) {
            String string = arrstring[i];
            String string2 = System.getProperty(string);
            if (string2 == null || !string2.contains("64")) continue;
            return 64;
        }
        return 32;
    }

    public static boolean lIIIlllIlIIIlIllIIIlIllll() {
        return llIIlIllIllllIlIIIIlIIlll;
    }

    public static void lllIIIllIIIIlllIlIIllIIll(boolean bl) {
        llIIlIllIllllIlIIIIlIIlll = bl;
    }

    public static boolean IlIIIIIIIIIIlIIlllIIIlIlI() {
        return false;
    }

    public static String lllIIIllIIIIlllIlIIllIIll(String string, int n, char c) {
        if (string == null) {
            string = "";
        }
        if (string.length() >= n) {
            return string;
        }
        StringBuffer stringBuffer = new StringBuffer(string);
        while (stringBuffer.length() < n - string.length()) {
            stringBuffer.append(c);
        }
        return stringBuffer.toString() + string;
    }

    public static String lllIlIIlIIIlIlIIIllIlllIl(String string, int n, char c) {
        if (string == null) {
            string = "";
        }
        if (string.length() >= n) {
            return string;
        }
        StringBuffer stringBuffer = new StringBuffer(string);
        while (stringBuffer.length() < n) {
            stringBuffer.append(c);
        }
        return stringBuffer.toString();
    }

    public static int[] lllIIIllIIIIlllIlIIllIIll(int[] arrn, int n) {
        return Config.lllIIIllIIIIlllIlIIllIIll(arrn, new int[]{n});
    }

    public static int[] lllIIIllIIIIlllIlIIllIIll(int[] arrn, int[] arrn2) {
        if (arrn != null && arrn2 != null) {
            int n = arrn.length;
            int n2 = n + arrn2.length;
            int[] arrn3 = new int[n2];
            System.arraycopy(arrn, 0, arrn3, 0, n);
            for (int i = 0; i < arrn2.length; ++i) {
                arrn3[i + n] = arrn2[i];
            }
            return arrn3;
        }
        throw new NullPointerException("The given array is NULL");
    }

    public static class_2202 lllIIIllIIIIlllIlIIllIIll(class_2202 class_22022) {
        try {
            ResourceLocation class_17732 = new ResourceLocation("textures/gui/title/mojang.png");
            InputStream inputStream = Config.lllIIIllIIIIlllIlIIllIIll(class_17732);
            if (inputStream == null) {
                return class_22022;
            }
            class_2202 class_22023 = new class_2202(ImageIO.read(inputStream));
            return class_22023;
        }
        catch (Exception exception) {
            Config.lllIlIIlIIIlIlIIIllIlllIl(exception.getClass().getName() + ": " + exception.getMessage());
            return class_22022;
        }
    }

    public static void lllIIIllIIIIlllIlIIllIIll(File file, String string) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        byte[] arrby = string.getBytes("ASCII");
        fileOutputStream.write(arrby);
        fileOutputStream.close();
    }

    public static boolean llIllIllIllIlIlIllIlIIIIl() {
        return Config.llIllllIlIllIIIlIllIIlIlI.llllIIllIlIlllllllIIlIIlI;
    }

    public static boolean lllIlIIllllIllIIIlIlIIIll() {
        return Config.llIllllIlIllIIIlIllIIlIlI.IlllIIlllllllIIllIlIllllI != 3;
    }

    public static boolean llIllIlllIllIlIIIIlIIlIII() {
        return Config.llIllllIlIllIIIlIllIIlIlI.IlllIIlllllllIIllIlIllllI == 1;
    }

    public static boolean IlllIIIlIIlIIIIllllIllllI() {
        return Config.lllIlIIllllIllIIIlIlIIIll();
    }
}

