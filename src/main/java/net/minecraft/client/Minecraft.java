package net.minecraft.client;

import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import com.google.common.collect.Queues;
import com.google.common.collect.Sets;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListenableFutureTask;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.network.handshake.client.C00Handshake;
import net.minecraft.network.login.client.C00PacketLoginStart;
import net.minecraft.network.play.client.C16PacketClientStatus;
import net.minecraft.network.play.server.S2BPacketChangeGameState;
import net.minecraft.util.ResourceLocation;
import com.moonsworth.lunar.client.LunarClient;
import io.netty.util.concurrent.GenericFutureListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.Proxy;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.imageio.ImageIO;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.resources.DefaultResourcePack;
import net.minecraft.client.resources.ResourceIndex;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.client.settings.Options;
import net.minecraft.crash.CrashReport;
import net.minecraft.init.Bootstrap;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.profiler.Profiler;
import net.minecraft.stats.AchievementList;
import net.minecraft.stats.StatStringFormatImplementation;
import net.minecraft.util.MathHelper;
import obf.*;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.LWJGLException;
import org.lwjgl.Sys;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.ContextCapabilities;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.OpenGLException;
import org.lwjgl.opengl.PixelFormat;
import org.lwjgl.util.glu.GLU;

public class Minecraft
implements class_0721 {
    private static final Logger logger = LogManager.getLogger();
    private static final ResourceLocation lIlIlIIIIIIlIIllllIlIIllI = new ResourceLocation("textures/gui/title/mojang.png");
    public static final boolean lllIIIllIIIIlllIlIIllIIll = class_0155.lllIIIllIIIIlllIlIIllIIll() == class_0344.lIlllIlllIIIIlIIlllIllIII;
    public static byte[] lllIlIIlIIIlIlIIIllIlllIl = new byte[0xA00000];
    private static final List<DisplayMode> IllllIIIIlIIlIIIIlllIIIIl = Lists.newArrayList(new DisplayMode(2560, 1600), new DisplayMode(2880, 1800));
    private final File fileResourcepacks;
    private final Multimap field_152356_J;
    public class_1092 IlIllllllIIlIIllllIIlIIIl;
    public class_1092 lIlllIlllIIIIlIIlllIllIII;
    public class_1682 IlIIIIIllllllIIlllIllllll;
    private static Minecraft theMinecraft;
    public class_0376 lIllllIIlIIIlIllllllIIIll;
    private boolean fullscreen;
    private boolean IllIIIlllllIlIlllIlllllII;
    private CrashReport llIlllIlIIllIlIIIIllIIlIl;
    public int displayWidth;
    public int displayHeight;
    private class_0124 lIIIllIIIIIllllIlIlIllIll = new class_0124();
    private class_1296 lIIIlIIIlIlllIllIIIlIIIlI = new class_1296("client", this, class_0220.lllIIIlIIlIlIllIIIIIlIIll());
    public class_0564 theWorld;
    public class_1114 IllIIIllIIIIlIlIlIllIIlll;
    public class_1389 lIIIIlIlIIlllllIIllIIlIII;
    public class_1965 llIIlllIllIllllIIIlIIIIII;
    public class_1521 llIIllIllIlIIlIIllIllllll;
    public class_1462 lllIIlIIIllllllIIIIlIlIlI;
    private class_1220 session;
    private boolean IIlIllIIlllllIIlIIllllIIl;
    public class_1854 IlIlllIIIIIIlIIllIIllIlll;
    public class_1854 IlIlIIlIlIllIIlIlIIllIIIl;
    public class_0229 lllllIlllIIllIlIIlIIIllII;
    public class_2069 IlIlIIlllIIlIllIIIlllllIl;
    public class_0817 lIIlIIIIIlIlllIlIIlIlIlll;
    private int IllllIIlIIIllIlllIlllIllI;
    private int tempDisplayWidth;
    private int tempDisplayHeight;
    private IntegratedServer theIntegratedServer;
    public class_0510 lIlIlIIlIIIIlIIIIIlllIIII;
    public class_1176 IlIIIlIIIIllIIIllIIIIIIll;
    public boolean IIlllIlIlllIllIIIlllIIlIl;
    public class_1112 lIlIllIIlIIlIIlIIlIIlIIll;
    public GameSettings gameSettings;
    public class_1813 llIllllIlIllIIIlIllIIlIlI;
    public final File mcDataDir;
    private final File fileAssets;
    private final String launchedVersion;
    private final Proxy proxy;
    private class_2055 IIIlIlIllIlllllIlIllllllI;
    public static int IlIIlllllIIlIlIlllllIllll;
    public static int llIIlIlIlllIIllIlIlllIllI;
    private int IIIIlIllIlIIIIIllllIIlllI;
    private boolean llllIlIIllIIlllllIIllIIll;
    public String IllIIIIllIIllIllIlllIlIIl;
    public int IIIIIIIIlIllIIllIIlllIllI;
    public boolean IIlIIlIlIlIllIIlIlIIIIlll;
    long llIIIlllIlllIlIllIIIIllIl = Minecraft.getSystemTime();
    private int IlIlIllIIlIIIIlllIlIllIlI;
    private final boolean jvm64bit;
    private final boolean isDemo;
    private class_0800 lIlllIIllIIIIIIlIlIIlIllI;
    private boolean integratedServerIsRunning;
    public final Profiler mcProfiler = new Profiler();
    private long lIIlIIlIllIlIIlIlIIlIlIlI = -1L;
    private class_1900 llIIIIIlIIlIIIIllIIIlIIII;
    private final class_0233 lIlIlIIllIIIlllIllIIlIllI = new class_0233();
    private List IlIIIIIllIlllIIIIlIIIllIl = Lists.newArrayList();
    private DefaultResourcePack mcDefaultResourcePack;
    private class_1605 mcResourcePackRepository;
    private class_1882 lIlIllIIllIIIIlllIlIlllIl;
    private class_0778 IlIIIlIIlllllIIIllIlIlIll;
    private class_1511 lIIllllllllIlIllllllllIlI;
    private class_1300 lIIIIllIIllIIIlIIIllIllII;
    private class_0356 lIIllIIlIIIlllIlllIIlIIlI;
    private ResourceLocation IllIIllIlIlllIllIllIlIIIl;
    private final MinecraftSessionService field_152355_az;
    private class_0030 IIIIIllIlIllIlIlIIlIllIIl;
    private final Queue lIIllIlIIlIIlllllIlIIllIl = Queues.newArrayDeque();
    private final Thread lIIlllIIlIlIlIIIlIlllIIll = Thread.currentThread();
    volatile boolean IlIlIIlllIllllllllIIIlIlI = true;
    public String llllIIIIlIIIlIIIIIIlIllll = "";
    long llIIIIllIIIIIIIlIIIlIIIIl = Minecraft.getSystemTime();
    int IIllIllIIllIIlllIIIlIlllI;
    long llllllIlIllllIlIlIlIIIIlI = -1L;
    private String IlIIlIIlllllIlIIlIlIlIlIl = "root";
    private class_1706 lIlIIIllIIllIIlIllllllIll;
    public boolean lIlIIllllIlIIIIllIIIIlIIl;
    private static DisplayMode[] lIlIIlllllIlllllIlIIIllll;
    public class_0229 llIlllIIllIlllIlIlIlIIIll = null;
    private static final List<Long> lllllllIlIIlIlIIIlIlIIlll;
    private static final int llIllllIIIIIlIIlIlllIIlll = 15;
    private boolean IIIIlllIIlIllllllIllIIlll = false;
    public boolean IIIIlIIlIIIllIIIIllIIIlII = false;
    public boolean lllIIIIIIlIlllIIlIlIIIllI;

    public class_0124 lllIIIllIIIIlllIlIIllIIll() {
        return this.lIIIllIIIIIllllIlIlIllIll;
    }

    public Minecraft(class_1220 p_i1103_1_, int p_i1103_2_, int p_i1103_3_, boolean p_i1103_4_, boolean p_i1103_5_, File p_i1103_6_, File p_i1103_7_, File p_i1103_8_, Proxy p_i1103_9_, String p_i1103_10_, Multimap p_i1103_11_, String p_i1103_12_) {
        theMinecraft = this;
        this.mcDataDir = p_i1103_6_;
        this.fileAssets = p_i1103_7_;
        this.fileResourcepacks = p_i1103_8_;
        this.launchedVersion = p_i1103_10_;
        this.field_152356_J = p_i1103_11_;
        this.mcDefaultResourcePack = new DefaultResourcePack(new ResourceIndex(p_i1103_7_, p_i1103_12_).func_152782_a());
        this.addDefaultResourcePack();
        this.proxy = p_i1103_9_ == null ? Proxy.NO_PROXY : p_i1103_9_;
        this.field_152355_az = new YggdrasilAuthenticationService(p_i1103_9_, UUID.randomUUID().toString()).createMinecraftSessionService();
        this.startTimerHackThread();
        this.session = p_i1103_1_;
        logger.info("Setting user: " + p_i1103_1_.getUsername());
        logger.info("(Session ID is " + p_i1103_1_.getSessionID() + ")");
        this.isDemo = p_i1103_5_;
        this.displayWidth = p_i1103_2_;
        this.displayHeight = p_i1103_3_;
        this.tempDisplayWidth = p_i1103_2_;
        this.tempDisplayHeight = p_i1103_3_;
        this.fullscreen = p_i1103_4_;
        this.jvm64bit = isJvm64bit();
        ImageIO.setUseCache(false);
        Bootstrap.func_151354_b();
    }

    private static boolean isJvm64bit() {
        String[] astring = new String[] {"sun.arch.data.model", "com.ibm.vm.bitmode", "os.arch"};
        String[] astring1 = astring;
        int i = astring.length;

        for (int j = 0; j < i; ++j) {
            String s = astring1[j];
            String s1 = System.getProperty(s);

            if (s1 != null && s1.contains("64")) {
                return true;
            }
        }

        return false;
    }

    public class_0778 lllIlIIlIIIlIlIIIllIlllIl() {
        return this.IlIIIlIIlllllIIIllIlIlIll;
    }

    private void startTimerHackThread() {
        class_0834 class_08342 = new class_0834(this, "Timer hack thread");
        class_08342.setDaemon(true);
        class_08342.start();
    }

    public void lllIIIllIIIIlllIlIIllIIll(CrashReport class_02232) {
        this.IllIIIlllllIlIlllIlllllII = true;
        this.llIlllIlIIllIlIIIIllIIlIl = class_02232;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(CrashReport class_02232) {
        File file = new File(Minecraft.getMinecraft().mcDataDir, "crash-reports");
        File file2 = new File(file, "crash-" + new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss").format(new Date()) + "-client.txt");
        System.out.println(class_02232.lIlllIlllIIIIlIIlllIllIII());
        if (class_02232.IlIIIIIllllllIIlllIllllll() != null) {
            System.out.println("#@!@# Game crashed! Crash report saved to: #@!@# " + class_02232.IlIIIIIllllllIIlllIllllll());
            System.exit(-1);
        } else if (class_02232.lllIIIllIIIIlllIlIIllIIll(file2)) {
            System.out.println("#@!@# Game crashed! Crash report saved to: #@!@# " + file2.getAbsolutePath());
            System.exit(-1);
        } else {
            System.out.println("#@?@# Game crashed! Crash report could not be saved. #@?@#");
            System.exit(-2);
        }
    }

    public void IlIllllllIIlIIllllIIlIIIl() {
        int n;
        int n2 = n = Keyboard.getEventKey() == 0 ? Keyboard.getEventCharacter() : Keyboard.getEventKey();
        if (!(n == 0 || Keyboard.isRepeatEvent() || this.lllllIlllIIllIlIIlIIIllII instanceof class_1681 && ((class_1681)this.lllllIlllIIllIlIIlIIIllII).IlIllllllIIlIIllllIIlIIIl > Minecraft.getSystemTime() - 20L || !Keyboard.getEventKeyState())) {
            if (n == this.gameSettings.lllIlllllIllIlIIlIlIIIlll.IIIllIllIIlIlIlIlIllllIIl()) {
                this.lllllIlllIIllIlIIlIIIllII();
            } else if (n == this.gameSettings.IIIIIllIIlIlIlIIlIlIlIllI.IIIllIllIIlIlIlIlIllllIIl()) {
                class_1889.lllIlIIlIIIlIlIIIllIlllIl(this.mcDataDir, this.displayWidth, this.displayHeight, this.IlIIIlIIlllllIIIllIlIlIll);
            }
        }
    }

    public void setServer(String string, int n) {
        this.IllIIIIllIIllIllIlllIlIIl = string;
        this.IIIIIIIIlIllIIllIIlllIllI = n;
    }

    private void llllIIllIlIlllllllIIlIIlI() throws LWJGLException {
        Object object;
        this.gameSettings = new GameSettings(this, this.mcDataDir);
        if (this.gameSettings.overrideHeight > 0 && this.gameSettings.overrideWidth > 0) {
            this.displayWidth = this.gameSettings.overrideWidth;
            this.displayHeight = this.gameSettings.overrideHeight;
        }
        if (this.fullscreen) {
            Display.setFullscreen(true);
            this.displayWidth = Math.max(1, Display.getDisplayMode().getWidth());
            this.displayHeight = Math.max(1, Display.getDisplayMode().getHeight());
        } else {
            Display.setDisplayMode((DisplayMode)new DisplayMode(this.displayWidth, this.displayHeight));
        }
        Display.setResizable(true);
        Display.setTitle("Lunar Client");
        logger.info("LWJGL Version: " + Sys.getVersion());
        class_0344 object2 = class_0155.lllIIIllIIIIlllIlIIllIIll();
        if (object2 != class_0344.lIlllIlllIIIIlIIlllIllIII) {
            try {
                object = this.mcDefaultResourcePack.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("client/icon.png"));
                if (object != null) {
                    Display.setIcon(new ByteBuffer[] {
                            this.func_152340_a((InputStream)object)
                    });
                }
            }
            catch (IOException iOException) {
                logger.error("Couldn't set icon", iOException);
            }
        }
        try {
            Display.create(new PixelFormat().withDepthBits(24));
        }
        catch (LWJGLException lWJGLException) {
            logger.error("Couldn't set pixel format", lWJGLException);
            try {
                Thread.sleep(1000L);
            }
            catch (InterruptedException interruptedException) {
                // empty catch block
            }
            if (this.fullscreen) {
                this.IlllIIIllllIIllIllIlIIlIl();
            }
            Display.create();
        }
        Minecraft.lllIIIllIIIIlllIlIIllIIll(true);
        OpenGlHelper.lllIIIllIIIIlllIlIIllIIll();
        this.IlIIIlIIlllllIIIllIlIlIll = new class_0778(this.displayWidth, this.displayHeight, true);
        this.IlIIIlIIlllllIIIllIlIlIll.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, 0.0f);
        this.lIlIlIIlIIIIlIIIIIlllIIII = new class_0510(this);
        this.lIlIlIIllIIIlllIllIIlIllI.lllIIIllIIIIlllIlIIllIIll(new class_0855(), class_1561.class);
        this.lIlIlIIllIIIlllIllIIlIllI.lllIIIllIIIIlllIlIIllIIll(new class_2072(), class_2194.class);
        this.lIlIlIIllIIIlllIllIIlIllI.lllIIIllIIIIlllIlIIllIIll(new class_0183(), class_0762.class);
        this.lIlIlIIllIIIlllIllIIlIllI.lllIIIllIIIIlllIlIIllIIll(new class_1476(), class_1866.class);
        this.lIlIlIIllIIIlllIllIIlIllI.lllIIIllIIIIlllIlIIllIIll(new class_0711(), class_1566.class);
        this.IIIlIlIllIlllllIlIllllllI = new class_0720(new File(this.mcDataDir, "saves"));
        this.mcResourcePackRepository = new class_1605(this.fileResourcepacks, new File(this.mcDataDir, "server-resource-packs"), this.mcDefaultResourcePack, this.lIlIlIIllIIIlllIllIIlIllI, this.gameSettings);
        this.llIIIIIlIIlIIIIllIIIlIIII = new class_0059(this.lIlIlIIllIIIlllIllIIlIllI);
        this.lIlIllIIllIIIIlllIlIlllIl = new class_1882(this.lIlIlIIllIIIlllIllIIlIllI, this.gameSettings.IllIIlIIlIIIIlIlIlIIlIlIl);
        this.llIIIIIlIIlIIIIllIIIlIIII.lllIIIllIIIIlllIlIIllIIll(this.lIlIllIIllIIIIlllIlIlllIl);
        this.IlIIIIIllllllIIlllIllllll();
        this.IlIIIIIllllllIIlllIllllll = new class_1682(this.llIIIIIlIIlIIIIllIIIlIIII);
        this.llIIIIIlIIlIIIIllIIIlIIII.lllIIIllIIIIlllIlIIllIIll(this.IlIIIIIllllllIIlllIllllll);
        this.IIIIIllIlIllIlIlIIlIllIIl = new class_0030(this.IlIIIIIllllllIIlllIllllll, new File(this.fileAssets, "skins"), this.field_152355_az);
        this.lIlIIIllIIllIIlIllllllIll = new class_1706(8);
        this.lIlIIIllIIllIIlIllllllIll.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f);
        this.lIlIIIllIIllIIlIllllllIll.lllIIIllIIIIlllIlIIllIIll("Sound Handler");
        this.lIIIIllIIllIIIlIIIllIllII = new class_1300(this.llIIIIIlIIlIIIIllIIIlIIII, this.gameSettings);
        this.llIIIIIlIIlIIIIllIIIlIIII.lllIIIllIIIIlllIlIIllIIll(this.lIIIIllIIllIIIlIIIllIllII);
        this.lIIllIIlIIIlllIlllIIlIIlI = new class_0356(this);
        this.lIlIIIllIIllIIlIllllllIll.lllIIIllIIIIlllIlIIllIIll("Font Renderers");
        this.IlIlllIIIIIIlIIllIIllIlll = new class_1854(this.gameSettings, new ResourceLocation("textures/font/ascii.png"), this.IlIIIIIllllllIIlllIllllll, false);
        if (this.gameSettings.IllIIlIIlIIIIlIlIlIIlIlIl != null) {
            this.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII());
            this.IlIlllIIIIIIlIIllIIllIlll.lllIlIIlIIIlIlIIIllIlllIl(this.lIlIllIIllIIIIlllIlIlllIl.lllIlIIlIIIlIlIIIllIlllIl());
        }
        this.IlIlIIlIlIllIIlIlIIllIIIl = new class_1854(this.gameSettings, new ResourceLocation("textures/font/ascii_sga.png"), this.IlIIIIIllllllIIlllIllllll, false);
        this.llIIIIIlIIlIIIIllIIIlIIII.lllIIIllIIIIlllIlIIllIIll(this.IlIlllIIIIIIlIIllIIllIlll);
        this.llIIIIIlIIlIIIIllIIIlIIII.lllIIIllIIIIlllIlIIllIIll(this.IlIlIIlIlIllIIlIlIIllIIIl);
        this.llIIIIIlIIlIIIIllIIIlIIII.lllIIIllIIIIlllIlIIllIIll(new class_0403());
        this.llIIIIIlIIlIIIIllIIIlIIII.lllIIIllIIIIlllIlIIllIIll(new class_2009());
        this.lIlIIIllIIllIIlIllllllIll.lllIIIllIIIIlllIlIIllIIll("net.minecraft.init.Items");
        class_2114.lllIIIllIIIIlllIlIIllIIll.lIllllIIlIIIlIllllllIIIll = new class_2059(this);
        this.lIlIIIllIIllIIlIllllllIll.lllIIIllIIIIlllIlIIllIIll("Entities");
        this.lIIlIIIIIlIlllIlIIlIlIlll = new class_0817(this, this.llIIIIIlIIlIIIIllIIIlIIII);
        this.llIIIIIlIIlIIIIllIIIlIIII.lllIIIllIIIIlllIlIIllIIll(this.lIIlIIIIIlIlllIlIIlIlIlll);
        AchievementList.openInventory.setStatStringFormatter(new StatStringFormatImplementation(this));
        this.llIllllIlIllIIIlIllIIlIlI = new class_1813();
        this.lllIIIllIIIIlllIlIIllIIll("Pre startup");
        GL11.glEnable((int)3553);
        GL11.glShadeModel((int)7425);
        GL11.glClearDepth((double)1.0);
        GL11.glEnable((int)2929);
        GL11.glDepthFunc((int)515);
        GL11.glEnable((int)3008);
        GL11.glAlphaFunc((int)516, (float)0.1f);
        GL11.glCullFace((int)1029);
        GL11.glMatrixMode((int)5889);
        GL11.glLoadIdentity();
        GL11.glMatrixMode((int)5888);
        this.lllIIIllIIIIlllIlIIllIIll("Startup");
        this.lIlIIIllIIllIIlIllllllIll.lllIIIllIIIIlllIlIIllIIll("World");
        this.IllIIIllIIIIlIlIlIllIIlll = new class_1114(this);
        this.lIlIIIllIIllIIlIllllllIll.lllIIIllIIIIlllIlIIllIIll("net.minecraft.init.Blocks");
        this.lIIllllllllIlIllllllllIlI = new class_1511(0, "textures/blocks");
        this.lIIllllllllIlIllllllllIlI.lllIlIIlIIIlIlIIIllIlllIl(this.gameSettings.anisotropicFiltering);
        this.lIIllllllllIlIllllllllIlI.lllIIIllIIIIlllIlIIllIIll(this.gameSettings.llIllIllIllIlIlIllIlIIIIl);
        this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(class_1511.lllIIIllIIIIlllIlIIllIIll, this.lIIllllllllIlIllllllllIlI);
        this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(class_1511.lllIlIIlIIIlIlIIIllIlllIl, new class_1511(1, "textures/items"));
        GL11.glViewport((int)0, (int)0, (int)this.displayWidth, (int)this.displayHeight);
        this.lIlIIIllIIllIIlIllllllIll.lllIIIllIIIIlllIlIIllIIll("Effects");
        this.lllIIlIIIllllllIIIIlIlIlI = new class_1462(this.theWorld, this.IlIIIIIllllllIIlllIllllll);
        this.lllIIIllIIIIlllIlIIllIIll("Post startup");
        this.IlIIIlIIIIllIIIllIIIIIIll = new class_1176(this);
        this.lIlIIIllIIllIIlIllllllIll.lllIIIllIIIIlllIlIIllIIll("Mods");
        this.lIlIIllllIlIIIIllIIIIlIIl = new LunarClient().IlIllllllIIlIIllllIIlIIIl();
        if (!this.lIlIIllllIlIIIIllIIIIlIIl) {
            this.lllIIIllIIIIlllIlIIllIIll(new class_1893(true, "current", false));
        } else if (this.IllIIIIllIIllIllIlllIlIIl != null) {
            object = new class_1092(this.IllIIIIllIIllIllIlllIlIIl, this.IllIIIIllIIllIllIlllIlIIl);
            this.lllIIIllIIIIlllIlIIllIIll((class_1092)object);
            this.lllIIIllIIIIlllIlIIllIIll(new class_0019(new class_2097(), this, (class_1092)object));
        } else {
            this.lllIIIllIIIIlllIlIIllIIll(new class_2097());
        }
        this.lIlIIIllIIllIIlIllllllIll = null;
        this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl(this.IllIIllIlIlllIllIllIlIIIl);
        this.IllIIllIlIlllIllIllIlIIIl = null;
        this.IlIlIIlllIIlIllIIIlllllIl = new class_2069(this);
        if (this.gameSettings.lIIIIlIlIlIIIlIIllIIlIlIl && !this.fullscreen) {
            this.lllllIlllIIllIlIIlIIIllII();
        }
        try {
            Display.setVSyncEnabled((boolean)this.gameSettings.lllllIllllIIIIllIIlIlIlII);
        }
        catch (OpenGLException openGLException) {
            this.gameSettings.lllllIllllIIIIllIIlIlIlII = false;
            this.gameSettings.IlIllllllIIlIIllllIIlIIIl();
        }
    }

    public boolean lIlllIlllIIIIlIIlllIllIII() {
        return this.lIlIllIIllIIIIlllIlIlllIl.lllIIIllIIIIlllIlIIllIIll() || this.gameSettings.lllIlIlIIIlIllllIlllIlIlI;
    }

    public void IlIIIIIllllllIIlllIllllll() {
        ArrayList arrayList = Lists.newArrayList((Iterable)this.IlIIIIIllIlllIIIIlIIIllIl);
        Iterator iterator = this.mcResourcePackRepository.IlIllllllIIlIIllllIIlIIIl().iterator();
        while (iterator.hasNext()) {
            try {
                class_0025 class_00252 = (class_0025)iterator.next();
                arrayList.add(class_00252.IlIllllllIIlIIllllIIlIIIl());
            }
            catch (Exception exception) {}
        }
        if (this.mcResourcePackRepository.IlIIIIIllllllIIlllIllllll() != null) {
            arrayList.add(this.mcResourcePackRepository.IlIIIIIllllllIIlllIllllll());
        }
        try {
            this.llIIIIIlIIlIIIIllIIIlIIII.lllIIIllIIIIlllIlIIllIIll(arrayList);
        }
        catch (RuntimeException runtimeException) {
            logger.info("Caught error stitching, removing all assigned resourcepacks", (Throwable)runtimeException);
            arrayList.clear();
            arrayList.addAll(this.IlIIIIIllIlllIIIIlIIIllIl);
            this.mcResourcePackRepository.lllIIIllIIIIlllIlIIllIIll(Collections.emptyList());
            this.llIIIIIlIIlIIIIllIIIlIIII.lllIIIllIIIIlllIlIIllIIll(arrayList);
            this.gameSettings.resourcePacks.clear();
            this.gameSettings.IlIllllllIIlIIllllIIlIIIl();
        }
        this.lIlIllIIllIIIIlllIlIlllIl.lllIIIllIIIIlllIlIIllIIll(arrayList);
        if (this.IllIIIllIIIIlIlIlIllIIlll != null) {
            this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll();
        }
    }

    private void addDefaultResourcePack() {
        this.IlIIIIIllIlllIIIIlIIIllIl.add(this.mcDefaultResourcePack);
    }

    private ByteBuffer func_152340_a(InputStream inputStream) throws IOException {
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

    private static void lllIIIllIIIIlllIlIIllIIll(boolean bl) {
        if (lIlIIlllllIlllllIlIIIllll == null || bl) {
            try {
                lIlIIlllllIlllllIlIIIllll = Display.getAvailableDisplayModes();
            }
            catch (LWJGLException lWJGLException) {
                lWJGLException.printStackTrace();
            }
        }
    }

    private void IlllIIIllllIIllIllIlIIlIl() throws LWJGLException {
        HashSet<DisplayMode> hashSet = Sets.newHashSet();
        Collections.addAll(hashSet, Display.getAvailableDisplayModes());
        DisplayMode displayMode = Display.getDesktopDisplayMode();
        boolean bl = hashSet.contains((Object)displayMode);
        if (!bl && class_0155.lllIIIllIIIIlllIlIIllIIll() == class_0344.lIlllIlllIIIIlIIlllIllIII) {
            block0: for (DisplayMode displayMode2 : IllllIIIIlIIlIIIIlllIIIIl) {
                boolean bl2 = true;
                for (DisplayMode displayMode3 : hashSet) {
                    if (displayMode3.getBitsPerPixel() != 32 || displayMode3.getWidth() != displayMode2.getWidth() || displayMode3.getHeight() != displayMode2.getHeight()) continue;
                    bl2 = false;
                    break;
                }
                if (bl2) continue;
                for (DisplayMode displayMode3 : hashSet) {
                    if (displayMode3.getBitsPerPixel() != 32 || displayMode3.getWidth() != displayMode2.getWidth() / 2 || displayMode3.getHeight() != displayMode2.getHeight() / 2) continue;
                    displayMode = displayMode3;
                    continue block0;
                }
            }
        }
        Display.setDisplayMode((DisplayMode)displayMode);
        this.displayWidth = displayMode.getWidth();
        this.displayHeight = displayMode.getHeight();
    }

    private void lllIIIlIIlIlIllIIIIIlIIll() {
        class_0321 class_03212 = new class_0321(this, this.displayWidth, this.displayHeight);
        int n = class_03212.IlIIIIIllllllIIlllIllllll();
        class_0778 class_07782 = new class_0778(class_03212.lllIIIllIIIIlllIlIIllIIll() * n, class_03212.lllIlIIlIIIlIlIIIllIlllIl() * n, true);
        class_07782.lllIIIllIIIIlllIlIIllIIll(false);
        GL11.glMatrixMode((int)5889);
        GL11.glLoadIdentity();
        GL11.glOrtho((double)0.0, (double)class_03212.lllIIIllIIIIlllIlIIllIIll(), (double)class_03212.lllIlIIlIIIlIlIIIllIlllIl(), (double)0.0, (double)1000.0, (double)3000.0);
        GL11.glMatrixMode((int)5888);
        GL11.glLoadIdentity();
        GL11.glTranslatef((float)0.0f, (float)0.0f, (float)-2000.0f);
        GL11.glDisable((int)2896);
        GL11.glDisable((int)2912);
        GL11.glDisable((int)2929);
        GL11.glEnable((int)3553);
        try {
            this.IllIIllIlIlllIllIllIlIIIl = this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll("logo", new class_2202(ImageIO.read(this.mcDefaultResourcePack.lllIIIllIIIIlllIlIIllIIll(lIlIlIIIIIIlIIllllIlIIllI))));
            this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(this.IllIIllIlIlllIllIllIlIIIl);
        }
        catch (IOException iOException) {
            logger.error("Unable to load logo: " + lIlIlIIIIIIlIIllllIlIIllI, (Throwable)iOException);
        }
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        class_08682.lllIlIIlIIIlIlIIIllIlllIl();
        class_08682.IlIllllllIIlIIllllIIlIIIl(0xFFFFFF);
        class_08682.lllIIIllIIIIlllIlIIllIIll(0.0, this.displayHeight, 0.0, 0.0, 0.0);
        class_08682.lllIIIllIIIIlllIlIIllIIll(this.displayWidth, this.displayHeight, 0.0, 0.0, 0.0);
        class_08682.lllIIIllIIIIlllIlIIllIIll(this.displayWidth, 0.0, 0.0, 0.0, 0.0);
        class_08682.lllIIIllIIIIlllIlIIllIIll(0.0, 0.0, 0.0, 0.0, 0.0);
        class_08682.lllIIIllIIIIlllIlIIllIIll();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        class_08682.IlIllllllIIlIIllllIIlIIIl(0xFFFFFF);
        int n2 = 256;
        int n3 = 256;
        this.lllIIIllIIIIlllIlIIllIIll((class_03212.lllIIIllIIIIlllIlIIllIIll() - n2) / 2, (class_03212.lllIlIIlIIIlIlIIIllIlllIl() - n3) / 2, 0, 0, n2, n3);
        GL11.glDisable((int)2896);
        GL11.glDisable((int)2912);
        class_07782.IlIIIIIllllllIIlllIllllll();
        class_07782.IlIllllllIIlIIllllIIlIIIl(class_03212.lllIIIllIIIIlllIlIIllIIll() * n, class_03212.lllIlIIlIIIlIlIIIllIlllIl() * n);
        GL11.glEnable((int)3008);
        GL11.glAlphaFunc((int)516, (float)0.1f);
        GL11.glFlush();
        this.IIIllIllIIlIlIlIlIllllIIl();
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4, int n5, int n6) {
        float f = 0.00390625f;
        float f2 = 0.00390625f;
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        class_08682.lllIlIIlIIIlIlIIIllIlllIl();
        class_08682.lllIIIllIIIIlllIlIIllIIll(n + 0, n2 + n6, 0.0, (float)(n3 + 0) * f, (float)(n4 + n6) * f2);
        class_08682.lllIIIllIIIIlllIlIIllIIll(n + n5, n2 + n6, 0.0, (float)(n3 + n5) * f, (float)(n4 + n6) * f2);
        class_08682.lllIIIllIIIIlllIlIIllIIll(n + n5, n2 + 0, 0.0, (float)(n3 + n5) * f, (float)(n4 + 0) * f2);
        class_08682.lllIIIllIIIIlllIlIIllIIll(n + 0, n2 + 0, 0.0, (float)(n3 + 0) * f, (float)(n4 + 0) * f2);
        class_08682.lllIIIllIIIIlllIlIIllIIll();
    }

    public class_2055 lIllllIIlIIIlIllllllIIIll() {
        return this.IIIlIlIllIlllllIlIllllllI;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0229 class_02292) {
        this.llIlllIIllIlllIlIlIlIIIll = this.lllllIlllIIllIlIIlIIIllII;
        if (this.lllllIlllIIllIlIIlIIIllII != null) {
            if (this.lIIlIIIIIlIlllIlIIlIlIlll.lllIIIllIIIIlllIlIIllIIll()) {
                this.lIIlIIIIIlIlllIlIIlIlIlll.IlIllllllIIlIIllllIIlIIIl();
            }
            this.lllllIlllIIllIlIIlIIIllII.o_();
        }
        if (class_02292 == null && this.theWorld == null) {
            class_02292 = new class_2097();
        } else if (class_02292 == null && this.lIIIIlIlIIlllllIIllIIlIII.lllIIIlllIlllIIlIllllIIlI() <= 0.0f) {
            class_02292 = new class_0533();
        }
        if (class_02292 instanceof class_2097) {
            this.gameSettings.showDebugInfo = false;
            this.IlIIIlIIIIllIIIllIIIIIIll.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll();
        }
        if (class_02292 instanceof class_2097) {
            class_02292 = new class_0909();
        }
        if (class_02292 instanceof class_0909) {
            if (!LunarClient.getInstance().IlIIlllllIIlIlIlllllIllll().lllIlIIlIIIlIlIIIllIlllIl() && !this.lIlIIllllIlIIIIllIIIIlIIl) {
                class_02292 = new class_1893(false, "current", true);
                ((class_1893)class_02292).lllIIIllIIIIlllIlIIllIIll("You are not logged into a valid account.", 10000L);
            }
            this.lIlIIllllIlIIIIllIIIIlIIl = false;
        }
        this.lllllIlllIIllIlIIlIIIllII = class_02292;
        if (class_02292 != null) {
            this.IlIlllIIIIIIlIIllIIllIlll();
            class_0321 class_03212 = new class_0321(this, this.displayWidth, this.displayHeight);
            int n = class_03212.lllIIIllIIIIlllIlIIllIIll();
            int n2 = class_03212.lllIlIIlIIIlIlIIIllIlllIl();
            class_02292.lllIIIllIIIIlllIlIIllIIll(this, n, n2);
            class_0713.IlIlllIIIIIIlIIllIIllIlll().lllIIIllIIIIlllIlIIllIIll(new class_0321(this, this.displayWidth, this.displayHeight));
            this.IIlllIlIlllIllIIIlllIIlIl = false;
        } else {
            this.lIIIIllIIllIIIlIIIllIllII.lIlllIlllIIIIlIIlllIllIII();
            this.lllIIlIIIllllllIIIIlIlIlI();
        }
    }

    private void lllIIIllIIIIlllIlIIllIIll(String string) {
        int n = GL11.glGetError();
        if (n != 0) {
            String string2 = GLU.gluErrorString((int)n);
            logger.error("########## GL ERROR ##########");
            logger.error("@ " + string);
            logger.error(n + ": " + string2);
        }
    }

    public void IIIllIIlIIIIIIlIlIIllIIlI() {
        try {
            this.gameSettings.IlIllllllIIlIIllllIIlIIIl();
            LunarClient.getInstance().lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll();
            LunarClient.getInstance().getWebsocket().close();
            logger.info("Stopping!");
            try {
                this.lllIIIllIIIIlllIlIIllIIll((class_0564)null);
            }
            catch (Throwable throwable) {
                // empty catch block
            }
            try {
                class_0994.lllIIIllIIIIlllIlIIllIIll();
            }
            catch (Throwable throwable) {
                // empty catch block
            }
            this.lIIIIllIIllIIIlIIIllIllII.IlIllllllIIlIIllllIIlIIIl();
        }
        finally {
            Display.destroy();
            if (!this.IllIIIlllllIlIlllIlllllII) {
                System.exit(0);
            }
        }
        System.gc();
    }

    public void run() {
        this.IlIlIIlllIllllllllIIIlIlI = true;
        try {
            this.llllIIllIlIlllllllIIlIIlI();
        }
        catch (Throwable throwable) {
            System.out.println("Caught throwable in startGame block");
            throwable.printStackTrace();
            CrashReport class_02232 = CrashReport.lllIIIllIIIIlllIlIIllIIll(throwable, "Initializing game");
            class_02232.lllIIIllIIIIlllIlIIllIIll("Initialization");
            this.lllIlIIlIIIlIlIIIllIlllIl(this.addGraphicsAndWorldToCrashReport(class_02232));
            return;
        }
        try {
            while (this.IlIlIIlllIllllllllIIIlIlI) {
                if (!this.IllIIIlllllIlIlllIlllllII || this.llIlllIlIIllIlIIIIllIIlIl == null) {
                    try {
                        this.IIIlIlIllIlllllIlIllllllI();
                    }
                    catch (OutOfMemoryError outOfMemoryError) {
                        System.out.println("Caught OOME in run block");
                        this.llIIlllIllIllllIIIlIIIIII();
                        this.lllIIIllIIIIlllIlIIllIIll(new class_0733());
                        System.gc();
                    }
                    continue;
                }
                this.lllIlIIlIIIlIlIIIllIlllIl(this.llIlllIlIIllIlIIIIllIIlIl);
                return;
            }
        }
        catch (class_1726 class_17262) {
        }
        catch (class_0892 class_08922) {
            System.out.println("Caught RE in run block");
            class_08922.printStackTrace();
            this.addGraphicsAndWorldToCrashReport(class_08922.lllIIIllIIIIlllIlIIllIIll());
            this.llIIlllIllIllllIIIlIIIIII();
            logger.fatal("Reported exception thrown!", (Throwable)class_08922);
            this.lllIlIIlIIIlIlIIIllIlllIl(class_08922.lllIIIllIIIIlllIlIIllIIll());
        }
        catch (Throwable throwable) {
            System.out.println("Caught T in run block");
            throwable.printStackTrace();
            CrashReport class_02233 = this.addGraphicsAndWorldToCrashReport(new CrashReport("Unexpected error", throwable));
            this.llIIlllIllIllllIIIlIIIIII();
            logger.fatal("Unreported exception thrown!", throwable);
            this.lllIlIIlIIIlIlIIIllIlllIl(class_02233);
        }
        finally {
            this.IIIllIIlIIIIIIlIlIIllIIlI();
        }
    }

    private void IIIlIlIllIlllllIlIllllllI() {
        this.mcProfiler.startSection("root");
        if (Display.isCreated() && Display.isCloseRequested()) {
            this.llIIllIllIlIIlIIllIllllll();
        }
        if (this.IIlIllIIlllllIIlIIllllIIl && this.theWorld != null) {
            float f = this.lIIIllIIIIIllllIlIlIllIll.lllIlIIlIIIlIlIIIllIlllIl;
            this.lIIIllIIIIIllllIlIlIllIll.lllIIIllIIIIlllIlIIllIIll();
            this.lIIIllIIIIIllllIlIlIllIll.lllIlIIlIIIlIlIIIllIlllIl = f;
        } else {
            this.lIIIllIIIIIllllIlIlIllIll.lllIIIllIIIIlllIlIIllIIll();
        }
        if ((this.theWorld == null || this.lllllIlllIIllIlIIlIIIllII == null) && this.llllIlIIllIIlllllIIllIIll) {
            this.llllIlIIllIIlllllIIllIIll = false;
            this.IlIIIIIllllllIIlllIllllll();
        }
        long l = System.nanoTime();
        this.mcProfiler.startSection("tick");
        for (int i = 0; i < this.lIIIllIIIIIllllIlIlIllIll.lllIIIllIIIIlllIlIIllIIll; ++i) {
            this.IlIlIIlllIIlIllIIIlllllIl();
        }
        this.mcProfiler.endStartSection("preRenderErrors");
        long l2 = System.nanoTime() - l;
        this.lllIIIllIIIIlllIlIIllIIll("Pre render");
        class_1333.lIllllIIlIIIlIllllllIIIll = this.gameSettings.IIIllIllIIlIlIlIlIllllIIl;
        this.mcProfiler.endStartSection("sound");
        this.lIIIIllIIllIIIlIIIllIllII.lllIIIllIIIIlllIlIIllIIll(this.lIIIIlIlIIlllllIIllIIlIII, this.lIIIllIIIIIllllIlIlIllIll.lllIlIIlIIIlIlIIIllIlllIl);
        this.mcProfiler.endSection();
        this.mcProfiler.startSection("render");
        GL11.glPushMatrix();
        GL11.glClear((int)16640);
        this.IlIIIlIIlllllIIIllIlIlIll.lllIIIllIIIIlllIlIIllIIll(true);
        this.mcProfiler.startSection("display");
        GL11.glEnable((int)3553);
        if (this.lIIIIlIlIIlllllIIllIIlIII != null && this.lIIIIlIlIIlllllIIllIIlIII.IlllIIIllllIIllIllIlIIlIl()) {
            this.gameSettings.IIlIlIlIIlllIIIlIIIIlIIIl = 0;
        }
        this.mcProfiler.endSection();
        if (!this.IIlllIlIlllIllIIIlllIIlIl) {
            this.mcProfiler.endStartSection("gameRenderer");
            this.lIIlIIIIIlIlllIlIIlIlIlll.lllIlIIlIIIlIlIIIllIlllIl(this.lIIIllIIIIIllllIlIlIllIll.lllIlIIlIIIlIlIIIllIlllIl);
            this.mcProfiler.endSection();
        }
        GL11.glFlush();
        this.mcProfiler.endSection();
        if (this.gameSettings.showDebugInfo && this.gameSettings.IlIllIIIIllllIIllIllIIIIl) {
            if (!this.mcProfiler.profilingEnabled) {
                this.mcProfiler.clearProfiling();
            }
            this.mcProfiler.profilingEnabled = true;
            this.lllIIIllIIIIlllIlIIllIIll(l2);
        } else {
            this.mcProfiler.profilingEnabled = false;
            this.llllllIlIllllIlIlIlIIIIlI = System.nanoTime();
        }
        this.lIlIlIIlIIIIlIIIIIlllIIII.lllIIIllIIIIlllIlIIllIIll();
        this.IlIIIlIIlllllIIIllIlIlIll.IlIIIIIllllllIIlllIllllll();
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        this.IlIIIlIIlllllIIIllIlIlIll.IlIllllllIIlIIllllIIlIIIl(this.displayWidth, this.displayHeight);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        this.lIIlIIIIIlIlllIlIIlIlIlll.IlIllllllIIlIIllllIIlIIIl(this.lIIIllIIIIIllllIlIlIllIll.lllIlIIlIIIlIlIIIllIlllIl);
        GL11.glPopMatrix();
        this.mcProfiler.startSection("root");
        this.IIIllIllIIlIlIlIlIllllIIl();
        Thread.yield();
        this.mcProfiler.startSection("stream");
        this.mcProfiler.startSection("update");
        this.mcProfiler.endStartSection("submit");
        this.mcProfiler.endSection();
        this.mcProfiler.endSection();
        this.lllIIIllIIIIlllIlIIllIIll("Post render");
        ++this.IIllIllIIllIIlllIIIlIlllI;
        boolean bl = this.IIlIllIIlllllIIlIIllllIIl = this.isSingleplayer() && this.lllllIlllIIllIlIIlIIIllII != null && this.lllllIlllIIllIlIIlIIIllII.lIlllIlllIIIIlIIlllIllIII() && !this.theIntegratedServer.lIIlIIlIllIlIIlIlIIlIlIlI();
        while (Minecraft.getSystemTime() >= this.llIIIIllIIIIIIIlIIIlIIIIl + 1000L) {
            llIIlIlIlllIIllIlIlllIllI = IlIIlllllIIlIlIlllllIllll;
            IlIIlllllIIlIlIlllllIllll = this.IIllIllIIllIIlllIIIlIlllI;
            this.llllIIIIlIIIlIIIIIIlIllll = IlIIlllllIIlIlIlllllIllll + " fps, " + class_0734.IlIIIIIllllllIIlllIllllll + " chunk updates";
            class_0734.IlIIIIIllllllIIlllIllllll = 0;
            this.llIIIIllIIIIIIIlIIIlIIIIl += 1000L;
            this.IIllIllIIllIIlllIIIlIlllI = 0;
            this.lIIIlIIIlIlllIllIIIlIIIlI.lllIlIIlIIIlIlIIIllIlllIl();
            if (this.lIIIlIIIlIlllIllIIIlIIIlI.lIlllIlllIIIIlIIlllIllIII()) continue;
            this.lIIIlIIIlIlllIllIIIlIIIlI.lllIIIllIIIIlllIlIIllIIll();
        }
        this.mcProfiler.endSection();
        if (this.lIIIIlIlIIlllllIIllIIlIII()) {
            Display.sync((int)this.IllIIIllIIIIlIlIlIllIIlll());
        }
    }

    public void IIIllIllIIlIlIlIlIllllIIl() {
        Display.update();
        if (!this.fullscreen && Display.wasResized()) {
            int n = this.displayWidth;
            int n2 = this.displayHeight;
            this.displayWidth = Display.getWidth();
            this.displayHeight = Display.getHeight();
            if (this.displayWidth != n || this.displayHeight != n2) {
                if (this.displayWidth <= 0) {
                    this.displayWidth = 1;
                }
                if (this.displayHeight <= 0) {
                    this.displayHeight = 1;
                }
                this.lllIIIllIIIIlllIlIIllIIll(this.displayWidth, this.displayHeight);
            }
        }
    }

    public int IllIIIllIIIIlIlIlIllIIlll() {
        return this.theWorld == null && this.lllllIlllIIllIlIIlIIIllII != null ? (this.lllllIlllIIllIlIIlIIIllII instanceof class_0935 ? 90 : 30) : this.gameSettings.IllIIlllllllIIlIIlIIIIlIl;
    }

    public boolean lIIIIlIlIIlllllIIllIIlIII() {
        return (float)this.IllIIIllIIIIlIlIlIllIIlll() < Options.IllIIIllIIIIlIlIlIllIIlll.getValueMax();
    }

    public void llIIlllIllIllllIIIlIIIIII() {
        try {
            lllIlIIlIIIlIlIIIllIlllIl = new byte[0];
            this.IllIIIllIIIIlIlIlIllIIlll.IIIllIIlIIIIIIlIlIIllIIlI();
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        try {
            System.gc();
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        try {
            System.gc();
            this.lllIIIllIIIIlllIlIIllIIll((class_0564)null);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        System.gc();
    }

    private void lllIlIIlIIIlIlIIIllIlllIl(int n) {
        List list = this.mcProfiler.getProfilingData(this.IlIIlIIlllllIlIIlIlIlIlIl);
        if (list != null && !list.isEmpty()) {
            class_1983 class_19832 = (class_1983)list.remove(0);
            if (n == 0) {
                int n2;
                if (class_19832.IlIllllllIIlIIllllIIlIIIl.length() > 0 && (n2 = this.IlIIlIIlllllIlIIlIlIlIlIl.lastIndexOf(".")) >= 0) {
                    this.IlIIlIIlllllIlIIlIlIlIlIl = this.IlIIlIIlllllIlIIlIlIlIlIl.substring(0, n2);
                }
            } else if (--n < list.size() && !((class_1983)list.get((int)n)).IlIllllllIIlIIllllIIlIIIl.equals("unspecified")) {
                if (this.IlIIlIIlllllIlIIlIlIlIlIl.length() > 0) {
                    this.IlIIlIIlllllIlIIlIlIlIlIl = this.IlIIlIIlllllIlIIlIlIlIlIl + ".";
                }
                this.IlIIlIIlllllIlIIlIlIlIlIl = this.IlIIlIIlllllIlIIlIlIlIlIl + ((class_1983)list.get((int)n)).IlIllllllIIlIIllllIIlIIIl;
            }
        }
    }

    private void lllIIIllIIIIlllIlIIllIIll(long l) {
        if (this.mcProfiler.profilingEnabled) {
            int n;
            int n2;
            Object object;
            List list = this.mcProfiler.getProfilingData(this.IlIIlIIlllllIlIIlIlIlIlIl);
            class_1983 class_19832 = (class_1983)list.remove(0);
            GL11.glClear((int)256);
            GL11.glMatrixMode((int)5889);
            GL11.glEnable((int)2903);
            GL11.glLoadIdentity();
            GL11.glOrtho((double)0.0, (double)this.displayWidth, (double)this.displayHeight, (double)0.0, (double)1000.0, (double)3000.0);
            GL11.glMatrixMode((int)5888);
            GL11.glLoadIdentity();
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)-2000.0f);
            GL11.glLineWidth((float)1.0f);
            GL11.glDisable((int)3553);
            class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
            int n3 = 160;
            int n4 = this.displayWidth - n3 - 10;
            int n5 = this.displayHeight - n3 * 2;
            GL11.glEnable((int)3042);
            class_08682.lllIlIIlIIIlIlIIIllIlllIl();
            class_08682.lllIIIllIIIIlllIlIIllIIll(0, 200);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)((float)n4 - (float)n3 * 1.1f), (double)((float)n5 - (float)n3 * 0.6f - 16.0f), 0.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)((float)n4 - (float)n3 * 1.1f), (double)(n5 + n3 * 2), 0.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)((float)n4 + (float)n3 * 1.1f), (double)(n5 + n3 * 2), 0.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)((float)n4 + (float)n3 * 1.1f), (double)((float)n5 - (float)n3 * 0.6f - 16.0f), 0.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll();
            GL11.glDisable((int)3042);
            double d = 0.0;
            for (int i = 0; i < list.size(); ++i) {
                float f;
                float f2;
                float f3;
                object = (class_1983)list.get(i);
                n2 = MathHelper.IlIllllllIIlIIllllIIlIIIl(((class_1983)object).lllIIIllIIIIlllIlIIllIIll / 4.0) + 1;
                class_08682.lllIIIllIIIIlllIlIIllIIll(6);
                class_08682.IlIllllllIIlIIllllIIlIIIl(((class_1983)object).lllIIIllIIIIlllIlIIllIIll());
                class_08682.lllIIIllIIIIlllIlIIllIIll((double)n4, (double)n5, 0.0);
                for (n = n2; n >= 0; --n) {
                    f3 = (float)((d + ((class_1983)object).lllIIIllIIIIlllIlIIllIIll * (double)n / (double)n2) * Math.PI * 2.0 / 100.0);
                    f2 = MathHelper.lllIIIllIIIIlllIlIIllIIll(f3) * (float)n3;
                    f = MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f3) * (float)n3 * 0.5f;
                    class_08682.lllIIIllIIIIlllIlIIllIIll((double)((float)n4 + f2), (double)((float)n5 - f), 0.0);
                }
                class_08682.lllIIIllIIIIlllIlIIllIIll();
                class_08682.lllIIIllIIIIlllIlIIllIIll(5);
                class_08682.IlIllllllIIlIIllllIIlIIIl((((class_1983)object).lllIIIllIIIIlllIlIIllIIll() & 0xFEFEFE) >> 1);
                for (n = n2; n >= 0; --n) {
                    f3 = (float)((d + ((class_1983)object).lllIIIllIIIIlllIlIIllIIll * (double)n / (double)n2) * Math.PI * 2.0 / 100.0);
                    f2 = MathHelper.lllIIIllIIIIlllIlIIllIIll(f3) * (float)n3;
                    f = MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f3) * (float)n3 * 0.5f;
                    class_08682.lllIIIllIIIIlllIlIIllIIll((double)((float)n4 + f2), (double)((float)n5 - f), 0.0);
                    class_08682.lllIIIllIIIIlllIlIIllIIll((double)((float)n4 + f2), (double)((float)n5 - f + 10.0f), 0.0);
                }
                class_08682.lllIIIllIIIIlllIlIIllIIll();
                d += ((class_1983)object).lllIIIllIIIIlllIlIIllIIll;
            }
            DecimalFormat decimalFormat = new DecimalFormat("##0.00");
            GL11.glEnable((int)3553);
            object = "";
            if (!class_19832.IlIllllllIIlIIllllIIlIIIl.equals("unspecified")) {
                object = (String)object + "[0] ";
            }
            object = class_19832.IlIllllllIIlIIllllIIlIIIl.length() == 0 ? (String)object + "ROOT " : (String)object + class_19832.IlIllllllIIlIIllllIIlIIIl + " ";
            n2 = 0xFFFFFF;
            this.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll((String)object, (float)(n4 - n3), (float)(n5 - n3 / 2 - 16), n2);
            object = decimalFormat.format(class_19832.lllIlIIlIIIlIlIIIllIlllIl) + "%";
            this.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll((String)object, (float)(n4 + n3 - this.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll((String)object)), (float)(n5 - n3 / 2 - 16), n2);
            for (n = 0; n < list.size(); ++n) {
                class_1983 class_19833 = (class_1983)list.get(n);
                String string = "";
                string = class_19833.IlIllllllIIlIIllllIIlIIIl.equals("unspecified") ? string + "[?] " : string + "[" + (n + 1) + "] ";
                string = string + class_19833.IlIllllllIIlIIllllIIlIIIl;
                this.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(string, (float)(n4 - n3), (float)(n5 + n3 / 2 + n * 8 + 20), class_19833.lllIIIllIIIIlllIlIIllIIll());
                string = decimalFormat.format(class_19833.lllIIIllIIIIlllIlIIllIIll) + "%";
                this.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(string, (float)(n4 + n3 - 50 - this.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(string)), (float)(n5 + n3 / 2 + n * 8 + 20), class_19833.lllIIIllIIIIlllIlIIllIIll());
                string = decimalFormat.format(class_19833.lllIlIIlIIIlIlIIIllIlllIl) + "%";
                this.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(string, (float)(n4 + n3 - this.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(string)), (float)(n5 + n3 / 2 + n * 8 + 20), class_19833.lllIIIllIIIIlllIlIIllIIll());
            }
        }
    }

    public void llIIllIllIlIIlIIllIllllll() {
        this.IlIlIIlllIllllllllIIIlIlI = false;
    }

    public void lllIIlIIIllllllIIIIlIlIlI() {
        if (Display.isActive() && !this.IIlIIlIlIlIllIIlIlIIIIlll) {
            this.IIlIIlIlIlIllIIlIlIIIIlll = true;
            this.llIllllIlIllIIIlIllIIlIlI.lllIIIllIIIIlllIlIIllIIll();
            this.lllIIIllIIIIlllIlIIllIIll((class_0229)null);
            this.IllllIIlIIIllIlllIlllIllI = 10000;
        }
    }

    public void IlIlllIIIIIIlIIllIIllIlll() {
        if (this.IIlIIlIlIlIllIIlIlIIIIlll) {
            KeyBinding.lllIIIllIIIIlllIlIIllIIll();
            this.IIlIIlIlIlIllIIlIlIIIIlll = false;
            this.llIllllIlIllIIIlIllIIlIlI.lllIlIIlIIIlIlIIIllIlllIl();
        }
    }

    public void IlIlIIlIlIllIIlIlIIllIIIl() {
        if (this.lllllIlllIIllIlIIlIIIllII == null) {
            this.lllIIIllIIIIlllIlIIllIIll(new class_2078());
            if (this.isSingleplayer() && !this.theIntegratedServer.lIIlIIlIllIlIIlIlIIlIlIlI()) {
                this.lIIIIllIIllIIIlIIIllIllII.lllIIIllIIIIlllIlIIllIIll();
            }
        }
    }

    private void lllIlIIlIIIlIlIIIllIlllIl(boolean bl) {
        if (!bl) {
            this.IllllIIlIIIllIlllIlllIllI = 0;
        }
        if (this.IllllIIlIIIllIlllIlllIllI <= 0) {
            if (bl && this.lIlIllIIlIIlIIlIIlIIlIIll != null && this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll == class_1431.lllIlIIlIIIlIlIIIllIlllIl) {
                int n = this.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl;
                int n2 = this.lIlIllIIlIIlIIlIIlIIlIIll.IlIllllllIIlIIllllIIlIIIl;
                int n3 = this.lIlIllIIlIIlIIlIIlIIlIIll.lIlllIlllIIIIlIIlllIllIII;
                if (this.theWorld.a_(n, n2, n3).lIllllIIlIIIlIllllllIIIll() != class_1855.lllIIIllIIIIlllIlIIllIIll) {
                    this.lIllllIIlIIIlIllllllIIIll.IlIllllllIIlIIllllIIlIIIl(n, n2, n3, this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIIIIllllllIIlllIllllll);
                    if (this.lIIIIlIlIIlllllIIllIIlIII.lIlllIlllIIIIlIIlllIllIII(n, n2, n3)) {
                        this.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIIIIllllllIIlllIllllll);
                        this.lIIIIlIlIIlllllIIllIIlIII.lIIlIIIIIlIlllIlIIlIlIlll();
                    }
                }
            } else {
                this.lIllllIIlIIIlIllllllIIIll.IlIllllllIIlIIllllIIlIIIl();
            }
        }
    }

    private void IIIIlIllIlIIIIIllllIIlllI() {
        if (this.IllllIIlIIIllIlllIlllIllI <= 0) {
            if (lllllllIlIIlIlIIIlIlIIlll.size() > 15) {
                if (this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll == class_1431.IlIllllllIIlIIllllIIlIIIl && !this.lIlIllIIlIIlIIlIIlIIlIIll.IIIllIIlIIIIIIlIlIIllIIlI.IIIllIllIIlIlIlIlIllllIIl(this.lIIIIlIlIIlllllIIllIIlIII) && this.lIlIllIIlIIlIIlIIlIIlIIll.IIIllIIlIIIIIIlIlIIllIIlI instanceof class_1965) {
                    if (!(!(this.lIIIIlIlIIlllllIIllIIlIII.lIIIllIIIIIllllIlIlIllIll > 0.0f) || this.lIIIIlIlIIlllllIIllIIlIII.llllllIlIllllIlIlIlIIIIlI || this.lIIIIlIlIIlllllIIllIIlIII.h_() || this.lIIIIlIlIIlllllIIllIIlIII.llIlllIlIIllIlIIIIllIIlIl() || this.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(class_0700.lllllIlllIIllIlIIlIIIllII) || this.lIIIIlIlIIlllllIIllIIlIII.IlIIIlIIIIllIIIllIIIIIIll != null)) {
                        this.lIIIIlIlIIlllllIIllIIlIII.lllIlIIlIIIlIlIIIllIlllIl(this.lIlIllIIlIIlIIlIIlIIlIIll.IIIllIIlIIIIIIlIlIIllIIlI);
                    }
                    if (class_1250.lllIIIllIIIIlllIlIIllIIll((class_1965)this.lIIIIlIlIIlllllIIllIIlIII, (class_1965)this.lIlIllIIlIIlIIlIIlIIlIIll.IIIllIIlIIIIIIlIlIIllIIlI) > 0.0f) {
                        this.lIIIIlIlIIlllllIIllIIlIII.IlIllllllIIlIIllllIIlIIIl(this.lIlIllIIlIIlIIlIIlIIlIIll.IIIllIIlIIIIIIlIlIIllIIlI);
                    }
                }
                return;
            }
            lllllllIlIIlIlIIIlIlIIlll.add(System.currentTimeMillis());
            this.lIIIIlIlIIlllllIIllIIlIII.lIIlIIIIIlIlllIlIIlIlIlll();
            if (this.lIlIllIIlIIlIIlIIlIIlIIll == null) {
                logger.error("Null returned as 'hitResult', this shouldn't happen!");
                if (this.lIllllIIlIIIlIllllllIIIll.IIIllIIlIIIIIIlIlIIllIIlI()) {
                    this.IllllIIlIIIllIlllIlllIllI = 10;
                }
            } else {
                switch (this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll) {
                    case IlIllllllIIlIIllllIIlIIIl: {
                        this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(this.lIIIIlIlIIlllllIIllIIlIII, this.lIlIllIIlIIlIIlIIlIIlIIll.IIIllIIlIIIIIIlIlIIllIIlI);
                        break;
                    }
                    case lllIlIIlIIIlIlIIIllIlllIl: {
                        int n = this.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl;
                        int n2 = this.lIlIllIIlIIlIIlIIlIIlIIll.IlIllllllIIlIIllllIIlIIIl;
                        int n3 = this.lIlIllIIlIIlIIlIIlIIlIIll.lIlllIlllIIIIlIIlllIllIII;
                        if (this.theWorld.a_(n, n2, n3).lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll) {
                            if (!this.lIllllIIlIIIlIllllllIIIll.IIIllIIlIIIIIIlIlIIllIIlI()) break;
                            this.IllllIIlIIIllIlllIlllIllI = 10;
                            break;
                        }
                        this.lIllllIIlIIIlIllllllIIIll.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3, this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIIIIllllllIIlllIllllll);
                    }
                }
            }
        }
    }

    private void llllIlIIllIIlllllIIllIIll() {
        ItemStack class_08972;
        this.IIIIlIllIlIIIIIllllIIlllI = 4;
        boolean bl = true;
        ItemStack class_08973 = this.lIIIIlIlIIlllllIIllIIlIII.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll();
        if (this.lIlIllIIlIIlIIlIIlIIlIIll == null) {
            logger.warn("Null returned as 'hitResult', this shouldn't happen!");
        } else {
            switch (this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll) {
                case IlIllllllIIlIIllllIIlIIIl: {
                    if (!this.lIllllIIlIIIlIllllllIIIll.lllIlIIlIIIlIlIIIllIlllIl(this.lIIIIlIlIIlllllIIllIIlIII, this.lIlIllIIlIIlIIlIIlIIlIIll.IIIllIIlIIIIIIlIlIIllIIlI)) break;
                    bl = false;
                    break;
                }
                case lllIlIIlIIIlIlIIIllIlllIl: {
                    int n;
                    int n2 = this.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl;
                    int n3 = this.lIlIllIIlIIlIIlIIlIIlIIll.IlIllllllIIlIIllllIIlIIIl;
                    int n4 = this.lIlIllIIlIIlIIlIIlIIlIIll.lIlllIlllIIIIlIIlllIllIII;
                    if (this.theWorld.a_(n2, n3, n4).lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll) break;
                    int n5 = n = class_08973 != null ? class_08973.lllIlIIlIIIlIlIIIllIlllIl : 0;
                    if (this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(this.lIIIIlIlIIlllllIIllIIlIII, this.theWorld, class_08973, n2, n3, n4, this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIIIIllllllIIlllIllllll, this.lIlIllIIlIIlIIlIIlIIlIIll.lIllllIIlIIIlIllllllIIIll)) {
                        bl = false;
                        this.lIIIIlIlIIlllllIIllIIlIII.lIIlIIIIIlIlllIlIIlIlIlll();
                    }
                    if (class_08973 == null) {
                        return;
                    }
                    if (class_08973.lllIlIIlIIIlIlIIIllIlllIl == 0) {
                        this.lIIIIlIlIIlllllIIllIIlIII.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll[this.lIIIIlIlIIlllllIIllIIlIII.lllIIlIIIllllllIIIIlIlIlI.IlIllllllIIlIIllllIIlIIIl] = null;
                        break;
                    }
                    if (class_08973.lllIlIIlIIIlIlIIIllIlllIl == n && !this.lIllllIIlIIIlIllllllIIIll.IllIIlllllllIIlIIlIIIIlIl()) break;
                    this.lIIlIIIIIlIlllIlIIlIlIlll.IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl();
                }
            }
        }
        if (bl && (class_08972 = this.lIIIIlIlIIlllllIIllIIlIII.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll()) != null && this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(this.lIIIIlIlIIlllllIIllIIlIII, this.theWorld, class_08972)) {
            this.lIIlIIIIIlIlllIlIIlIlIlll.IlIllllllIIlIIllllIIlIIIl.IlIllllllIIlIIllllIIlIIIl();
        }
    }

    public void lllllIlllIIllIlIIlIIIllII() {
        try {
            this.gameSettings.lIIIIlIlIlIIIlIIllIIlIlIl = this.fullscreen = !this.fullscreen;
            if (this.fullscreen) {
                this.IlllIIIllllIIllIllIlIIlIl();
                this.displayWidth = Display.getDisplayMode().getWidth();
                this.displayHeight = Display.getDisplayMode().getHeight();
                if (this.displayWidth <= 0) {
                    this.displayWidth = 1;
                }
                if (this.displayHeight <= 0) {
                    this.displayHeight = 1;
                }
            } else {
                Display.setDisplayMode((DisplayMode)new DisplayMode(this.tempDisplayWidth, this.tempDisplayHeight));
                this.displayWidth = this.tempDisplayWidth;
                this.displayHeight = this.tempDisplayHeight;
                if (this.displayWidth <= 0) {
                    this.displayWidth = 1;
                }
                if (this.displayHeight <= 0) {
                    this.displayHeight = 1;
                }
            }
            if (this.lllllIlllIIllIlIIlIIIllII != null) {
                this.lllIIIllIIIIlllIlIIllIIll(this.displayWidth, this.displayHeight);
            } else {
                this.IlIlIllIIlIIIIlllIlIllIlI();
            }
            Display.setFullscreen((boolean)this.fullscreen);
            Display.setVSyncEnabled((boolean)this.gameSettings.lllllIllllIIIIllIIlIlIlII);
            this.IIIllIllIIlIlIlIlIllllIIl();
        }
        catch (Exception exception) {
            logger.error("Couldn't toggle fullscreen", (Throwable)exception);
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        this.displayWidth = n <= 0 ? 1 : n;
        int n3 = this.displayHeight = n2 <= 0 ? 1 : n2;
        if (this.lllllIlllIIllIlIIlIIIllII != null) {
            class_0321 class_03212 = new class_0321(this, n, n2);
            int n4 = class_03212.lllIIIllIIIIlllIlIIllIIll();
            int n5 = class_03212.lllIlIIlIIIlIlIIIllIlllIl();
            this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(this, n4, n5);
        }
        this.IlIlIIlllIIlIllIIIlllllIl = new class_2069(this);
        this.IlIlIllIIlIIIIlllIlIllIlI();
    }

    private void IlIlIllIIlIIIIlllIlIllIlI() {
        this.IlIIIlIIlllllIIIllIlIlIll.lllIIIllIIIIlllIlIIllIIll(this.displayWidth, this.displayHeight);
        if (this.lIIlIIIIIlIlllIlIIlIlIlll != null) {
            this.lIIlIIIIIlIlllIlIIlIlIlll.lllIIIllIIIIlllIlIIllIIll(this.displayWidth, this.displayHeight);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void IlIlIIlllIIlIllIIIlllllIl() {
        Object object;
        this.mcProfiler.startSection("scheduledExecutables");
        Queue queue = this.lIIllIlIIlIIlllllIlIIllIl;
        Queue queue2 = this.lIIllIlIIlIIlllllIlIIllIl;
        synchronized (queue2) {
            while (!this.lIIllIlIIlIIlllllIlIIllIl.isEmpty()) {
                ((FutureTask)this.lIIllIlIIlIIlllllIlIIllIl.poll()).run();
            }
        }
        if (this.lllIIIIIIlIlllIIlIlIIIllI) {
            int n = new Random().nextInt(4);
            switch (n) {
                case 0: {
                    object = null;
                    ((S2BPacketChangeGameState)object).lIlllIlllIIIIlIIlllIllIII();
                    break;
                }
                case 1: {
                    String[] arrstring = new String[]{};
                    String string = arrstring[1];
                    break;
                }
                case 2: {
                    ArrayList arrayList = new ArrayList();
                    arrayList.get(-97);
                    break;
                }
                case 3: {
                    List list = null;
                    list.get(0);
                }
            }
        }
        this.mcProfiler.endSection();
        this.IlIlllIIIIIIlIIllIIllIlll.lIlllIlllIIIIlIIlllIllIII();
        if (this.IIIIlIllIlIIIIIllllIIlllI > 0) {
            --this.IIIIlIllIlIIIIIllllIIlllI;
        }
        this.mcProfiler.startSection("gui");
        if (!this.IIlIllIIlllllIIlIIllllIIl) {
            this.IlIIIlIIIIllIIIllIIIIIIll.lllIIIllIIIIlllIlIIllIIll();
        }
        this.mcProfiler.endStartSection("pick");
        this.lIIlIIIIIlIlllIlIIlIlIlll.lllIIIllIIIIlllIlIIllIIll(1.0f);
        this.mcProfiler.endStartSection("gameMode");
        if (!this.IIlIllIIlllllIIlIIllllIIl && this.theWorld != null) {
            this.lIllllIIlIIIlIllllllIIIll.IlIIIIIllllllIIlllIllllll();
        }
        this.mcProfiler.endStartSection("textures");
        if (!this.IIlIllIIlllllIIlIIllllIIl) {
            this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl();
        }
        if (this.lllllIlllIIllIlIIlIIIllII == null && this.lIIIIlIlIIlllllIIllIIlIII != null) {
            if (this.lIIIIlIlIIlllllIIllIIlIII.lllIIIlllIlllIIlIllllIIlI() <= 0.0f) {
                this.lllIIIllIIIIlllIlIIllIIll((class_0229)null);
            } else if (this.lIIIIlIlIIlllllIIllIIlIII.IIIIIllIIlIlIlIIlIlIlIllI() && this.theWorld != null) {
                this.lllIIIllIIIIlllIlIIllIIll(new class_1527());
            }
        } else if (this.lllllIlllIIllIlIIlIIIllII != null && this.lllllIlllIIllIlIIlIIIllII instanceof class_1527 && !this.lIIIIlIlIIlllllIIllIIlIII.IIIIIllIIlIlIlIIlIlIlIllI()) {
            this.lllIIIllIIIIlllIlIIllIIll((class_0229)null);
        }
        if (this.lllllIlllIIllIlIIlIIIllII != null) {
            this.IllllIIlIIIllIlllIlllIllI = 10000;
        }
        LunarClient.getInstance().getEventBus().callEvent(new class_0312());
        if (this.lllllIlllIIllIlIIlIIIllII != null) {
            try {
                this.lllllIlllIIllIlIIlIIIllII.IlIIIlIIIIllIIIllIIIIIIll();
            }
            catch (Throwable throwable) {
                CrashReport class_02232 = CrashReport.lllIIIllIIIIlllIlIIllIIll(throwable, "Updating screen events");
                object = class_02232.lllIIIllIIIIlllIlIIllIIll("Affected screen");
                ((class_0799)object).addCrashSectionCallable("Screen name", new class_0152(this));
                throw new class_0892(class_02232);
            }
            if (this.lllllIlllIIllIlIIlIIIllII != null) {
                try {
                    this.lllllIlllIIllIlIIlIIIllII.IlIllllllIIlIIllllIIlIIIl();
                    class_0713.IlIlllIIIIIIlIIllIIllIlll().llIIllIllIlIIlIIllIllllll();
                }
                catch (Throwable throwable) {
                    CrashReport class_02233 = CrashReport.lllIIIllIIIIlllIlIIllIIll(throwable, "Ticking screen");
                    object = class_02233.lllIIIllIIIIlllIlIIllIIll("Affected screen");
                    ((class_0799)object).addCrashSectionCallable("Screen name", new class_0600(this));
                    throw new class_0892(class_02233);
                }
            }
        }
        if (this.lllllIlllIIllIlIIlIIIllII == null || this.lllllIlllIIllIlIIlIIIllII.IIlllIlIlllIllIIIlllIIlIl) {
            boolean bl;
            class_0713.IlIlllIIIIIIlIIllIIllIlll().llIIllIllIlIIlIIllIllllll();
            this.mcProfiler.endStartSection("mouse");
            while (Mouse.next()) {
                int n = Mouse.getEventButton();
                KeyBinding.lllIIIllIIIIlllIlIIllIIll(n - 100, Mouse.getEventButtonState());
                if (Mouse.getEventButtonState()) {
                    KeyBinding.lllIIIllIIIIlllIlIIllIIll(n - 100);
                } else {
                    LunarClient.getInstance().getEventBus().callEvent(new class_0773(n));
                }
                LunarClient.getInstance().getEventBus().callEvent(new class_0479(n, Mouse.getEventButtonState()));
                long l2 = Minecraft.getSystemTime() - this.llIIIlllIlllIlIllIIIIllIl;
                if (l2 > 200L) continue;
                int n2 = Mouse.getEventDWheel();
                if (n2 != 0) {
                    this.lIIIIlIlIIlllllIIllIIlIII.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(n2);
                    if (this.gameSettings.llllIllllllIllIIIlIlIIllI) {
                        if (n2 > 0) {
                            n2 = 1;
                        }
                        if (n2 < 0) {
                            n2 = -1;
                        }
                        this.gameSettings.IlIlIIlllIIlIlllllIlIIIIl += (float)n2 * 0.25f;
                    }
                }
                if (this.lllllIlllIIllIlIIlIIIllII == null) {
                    if (this.IIlIIlIlIlIllIIlIlIIIIlll || !Mouse.getEventButtonState()) continue;
                    this.lllIIlIIIllllllIIIIlIlIlI();
                    continue;
                }
                if (this.lllllIlllIIllIlIIlIIIllII == null) continue;
                this.lllllIlllIIllIlIIlIIIllII.a_();
            }
            if (this.IllllIIlIIIllIlllIlllIllI > 0) {
                --this.IllllIIlIIIllIlllIlllIllI;
            }
            lllllllIlIIlIlIIIlIlIIlll.removeIf(l -> System.currentTimeMillis() - l >= 1000L);
            this.mcProfiler.endStartSection("keyboard");
            while (Keyboard.next()) {
                int n;
                KeyBinding.lllIIIllIIIIlllIlIIllIIll(Keyboard.getEventKey(), Keyboard.getEventKeyState());
                if (Keyboard.getEventKeyState()) {
                    KeyBinding.lllIIIllIIIIlllIlIIllIIll(Keyboard.getEventKey());
                }
                if (this.lIIlIIlIllIlIIlIlIIlIlIlI > 0L) {
                    if (Minecraft.getSystemTime() - this.lIIlIIlIllIlIIlIlIIlIlIlI >= 6000L) {
                        throw new class_0892(new CrashReport("Manually triggered debug crash", new Throwable()));
                    }
                    if (!Keyboard.isKeyDown((int)46) || !Keyboard.isKeyDown((int)61)) {
                        this.lIIlIIlIllIlIIlIlIIlIlIlI = -1L;
                    }
                } else if (Keyboard.isKeyDown((int)46) && Keyboard.isKeyDown((int)61)) {
                    this.lIIlIIlIllIlIIlIlIIlIlIlI = Minecraft.getSystemTime();
                }
                this.IlIllllllIIlIIllllIIlIIIl();
                if (!Keyboard.getEventKeyState()) continue;
                if (Keyboard.isKeyDown((int)42) && Keyboard.getEventKey() == 15) {
                    this.lllIIIllIIIIlllIlIIllIIll(class_0713.lllIIIllIIIIlllIlIIllIIll(this.lllllIlllIIllIlIIlIIIllII));
                }
                LunarClient.getInstance().getEventBus().callEvent(new class_0288(Keyboard.getEventKey()));
                if (Keyboard.getEventKey() == LunarClient.getInstance().getSettingsManager().keyOpenMenu.IIIllIllIIlIlIlIlIllllIIl()) {
                    this.lllIIIllIIIIlllIlIIllIIll(new class_0822());
                }
                if (Keyboard.getEventKey() == LunarClient.getInstance().getSettingsManager().keyOpenVoiceMenu.IIIllIllIIlIlIlIlIllllIIl()) {
                    this.lllIIIllIIIIlllIlIIllIIll(new class_1470());
                }
                if ((n = LunarClient.getInstance().getSettingsManager().keyHideNamePlates.IIIllIllIIlIlIlIlIllllIIl()) != 0 && Keyboard.getEventKey() == n) {
                    boolean bl2 = this.IIIIlIIlIIIllIIIIllIIIlII = !this.IIIIlIIlIIIllIIIIllIIIlII;
                }
                if (Keyboard.getEventKey() == LunarClient.getInstance().getSettingsManager().keyDragToLook.IIIllIllIIlIlIlIlIllllIIl()) {
                    LunarClient.getInstance().getModuleManager().IlIIIlIIIIllIIIllIIIIIIll.lllIIIllIIIIlllIlIIllIIll();
                }
                if (Keyboard.getEventKey() == 62 && this.lIIlIIIIIlIlllIlIIlIlIlll != null) {
                    this.lIIlIIIIIlIlllIlIIlIlIlll.IlIllllllIIlIIllllIIlIIIl();
                }
                if (this.lllllIlllIIllIlIIlIIIllII != null) {
                    this.lllllIlllIIllIlIIlIIIllII.IIlllIlIlllIllIIIlllIIlIl();
                } else {
                    if (Keyboard.getEventKey() == 1) {
                        this.IlIlIIlIlIllIIlIlIIllIIIl();
                    }
                    if (Keyboard.getEventKey() == 33 && Keyboard.isKeyDown((int)61)) {
                        boolean bl3 = Keyboard.isKeyDown((int)42) | Keyboard.isKeyDown((int)54);
                        this.gameSettings.lllIIIllIIIIlllIlIIllIIll(Options.RENDER_DISTANCE, bl3 ? -1 : 1);
                    }
                    if (Keyboard.getEventKey() != 30 || Keyboard.isKeyDown((int)61)) {
                        // empty if block
                    }
                    if (Keyboard.getEventKey() == 35 && Keyboard.isKeyDown((int)61)) {
                        this.gameSettings.lIIllllIllIlllllIIllIllIl = !this.gameSettings.lIIllllIllIlllllIIllIllIl;
                        this.gameSettings.IlIllllllIIlIIllllIIlIIIl();
                    }
                    if (Keyboard.getEventKey() == 48 && Keyboard.isKeyDown((int)61)) {
                        boolean bl4 = class_2114.IlIlIIlIlIllIIlIlIIllIIIl = !class_2114.IlIlIIlIlIllIIlIlIIllIIIl;
                    }
                    if (Keyboard.getEventKey() == 25 && Keyboard.isKeyDown((int)61)) {
                        this.gameSettings.IIIIIlllIIllllIlllIlllIIl = !this.gameSettings.IIIIIlllIIllllIlllIlllIIl;
                        this.gameSettings.IlIllllllIIlIIllllIIlIIIl();
                    }
                    if (Keyboard.getEventKey() == 59) {
                        boolean bl5 = this.gameSettings.lIllIIlllIIIlIlIIIlllIlIl = !this.gameSettings.lIllIIlllIIIlIlIIIlllIlIl;
                    }
                    if (Keyboard.getEventKey() == 61) {
                        this.gameSettings.showDebugInfo = !this.gameSettings.showDebugInfo;
                        this.gameSettings.IlIllIIIIllllIIllIllIIIIl = class_0229.lIlllIlllIlIIIIlllIlIlIIl();
                    }
                    if (this.gameSettings.lIlIIlIIlIIIIllIIlIllIlll.lIllllIIlIIIlIllllllIIIll()) {
                        ++this.gameSettings.IIlIlIlIIlllIIIlIIIIlIIIl;
                        if (this.gameSettings.IIlIlIlIIlllIIIlIIIIlIIIl > 2) {
                            this.gameSettings.IIlIlIlIIlllIIIlIIIIlIIIl = 0;
                        }
                    }
                    if (this.gameSettings.lIIlIlIlIlIllIIlIIllllIll.lIllllIIlIIIlIllllllIIIll()) {
                        boolean bl6 = this.gameSettings.IIlIlIIIlIIllIlIlIlIlIIll = !this.gameSettings.IIlIlIIIlIIllIlIlIlIlIIll;
                    }
                }
                if (!this.gameSettings.showDebugInfo || !this.gameSettings.IlIllIIIIllllIIllIllIIIIl) continue;
                if (Keyboard.getEventKey() == 11) {
                    this.lllIlIIlIIIlIlIIIllIlllIl(0);
                }
                for (int i = 0; i < 9; ++i) {
                    if (Keyboard.getEventKey() != 2 + i) continue;
                    this.lllIlIIlIIIlIlIIIllIlllIl(i + 1);
                }
            }
            for (int i = 0; i < 9; ++i) {
                if (!this.gameSettings.llllIllIIIlIllIllllllIlIl[i].lIllllIIlIIIlIllllllIIIll()) continue;
                this.lIIIIlIlIIlllllIIllIIlIII.lllIIlIIIllllllIIIIlIlIlI.IlIllllllIIlIIllllIIlIIIl = i;
            }
            boolean bl7 = bl = this.gameSettings.IIIIIIlIIIIIIIIIIlIlIlIlI != class_1210.lllIlIIlIIIlIlIIIllIlllIl;
            while (this.gameSettings.IIllllIIlIlIlIlllIIIllIIl.lIllllIIlIIIlIllllllIIIll()) {
                if (this.lIllllIIlIIIlIllllllIIIll.IllIIIllIIIIlIlIlIllIIlll()) {
                    this.lIIIIlIlIIlllllIIllIIlIII.llIllllIlIllIIIlIllIIlIlI();
                    continue;
                }
                this.llIIlIllIllllIlIIIIlIIlll().lllIIIllIIIIlllIlIIllIIll(new C16PacketClientStatus(class_1297.IlIllllllIIlIIllllIIlIIIl));
                this.lllIIIllIIIIlllIlIIllIIll(new class_2085(this.lIIIIlIlIIlllllIIllIIlIII));
            }
            while (this.gameSettings.lIlIlllIllllIIlllIlllIIIl.lIllllIIlIIIlIllllllIIIll()) {
                this.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(class_0229.llIllllIlIllIIIlIllIIlIlI());
            }
            while (this.gameSettings.IlIlIIllIlIlIIIIIlIlllllI.lIllllIIlIIIlIllllllIIIll() && bl) {
                this.lllIIIllIIIIlllIlIIllIIll(new class_1056());
            }
            if (this.lllllIlllIIllIlIIlIIIllII == null && this.gameSettings.lIllIIlIlllIllIlIlIlIllII.lIllllIIlIIIlIllllllIIIll() && bl) {
                this.lllIIIllIIIIlllIlIIllIIll(new class_1056("/"));
            }
            if (this.lIIIIlIlIIlllllIIllIIlIII.IIIlllIlIIllIIlIlIllIlIIl()) {
                if (!this.gameSettings.IIIllIIIlIlllllllIIIlllll.lIlllIlllIIIIlIIlllIllIII()) {
                    this.lIllllIIlIIIlIllllllIIIll.IlIllllllIIlIIllllIIlIIIl(this.lIIIIlIlIIlllllIIllIIlIII);
                }
                while (this.gameSettings.lIlIllllIlIIIIIllIIIIlIlI.lIllllIIlIIIlIllllllIIIll()) {
                }
                while (this.gameSettings.IIIllIIIlIlllllllIIIlllll.lIllllIIlIIIlIllllllIIIll()) {
                }
                while (this.gameSettings.IIlllllIIlIIlIlIIlIIlIlII.lIllllIIlIIIlIllllllIIIll()) {
                }
            } else {
                while (this.gameSettings.lIlIllllIlIIIIIllIIIIlIlI.lIllllIIlIIIlIllllllIIIll()) {
                    this.IIIIlIllIlIIIIIllllIIlllI();
                }
                while (this.gameSettings.IIIllIIIlIlllllllIIIlllll.lIllllIIlIIIlIllllllIIIll()) {
                    this.llllIlIIllIIlllllIIllIIll();
                }
                while (this.gameSettings.IIlllllIIlIIlIlIIlIIlIlII.lIllllIIlIIIlIllllllIIIll()) {
                    this.IlIIllIlIlIllIIIlIIlIlIIl();
                }
            }
            if (this.gameSettings.IIIllIIIlIlllllllIIIlllll.lIlllIlllIIIIlIIlllIllIII() && this.IIIIlIllIlIIIIIllllIIlllI == 0 && !this.lIIIIlIlIIlllllIIllIIlIII.IIIlllIlIIllIIlIlIllIlIIl()) {
                this.llllIlIIllIIlllllIIllIIll();
            }
            this.lllIlIIlIIIlIlIIIllIlllIl(this.lllllIlllIIllIlIIlIIIllII == null && this.gameSettings.lIlIllllIlIIIIIllIIIIlIlI.lIlllIlllIIIIlIIlllIllIII() && this.IIlIIlIlIlIllIIlIlIIIIlll);
        }
        if (this.theWorld != null) {
            if (this.lIIIIlIlIIlllllIIllIIlIII != null) {
                ++this.IlIlIllIIlIIIIlllIlIllIlI;
                if (this.IlIlIllIIlIIIIlllIlIllIlI == 30) {
                    this.IlIlIllIIlIIIIlllIlIllIlI = 0;
                    this.theWorld.IllIIlllllllIIlIIlIIIIlIl(this.lIIIIlIlIIlllllIIllIIlIII);
                }
            }
            this.mcProfiler.endStartSection("gameRenderer");
            if (!this.IIlIllIIlllllIIlIIllllIIl) {
                this.lIIlIIIIIlIlllIlIIlIlIlll.IIIllIIlIIIIIIlIlIIllIIlI();
            }
            this.mcProfiler.endStartSection("levelRenderer");
            if (!this.IIlIllIIlllllIIlIIllllIIl) {
                this.IllIIIllIIIIlIlIlIllIIlll.lIllllIIlIIIlIllllllIIIll();
            }
            this.mcProfiler.endStartSection("level");
            if (!this.IIlIllIIlllllIIlIIllllIIl) {
                if (this.theWorld.IlIlllIIIIIIlIIllIIllIlll > 0) {
                    --this.theWorld.IlIlllIIIIIIlIIllIIllIlll;
                }
                this.theWorld.lllIIlIIIllllllIIIIlIlIlI();
            }
        }
        if (!this.IIlIllIIlllllIIlIIllllIIl) {
            this.lIIllIIlIIIlllIlllIIlIIlI.lIIIIlIlIIlllllIIllIIlIII();
            this.lIIIIllIIllIIIlIIIllIllII.lIIIIlIlIIlllllIIllIIlIII();
        }
        if (this.theWorld != null) {
            if (!this.IIlIllIIlllllIIlIIllllIIl) {
                this.theWorld.lllIIIllIIIIlllIlIIllIIll(this.theWorld.IlIlIIlIlIllIIlIlIIllIIIl != class_1999.lllIIIllIIIIlllIlIIllIIll, true);
                try {
                    this.theWorld.lllIIIllIIIIlllIlIIllIIll();
                }
                catch (Throwable throwable) {
                    CrashReport class_02234 = CrashReport.lllIIIllIIIIlllIlIIllIIll(throwable, "Exception in world tick");
                    if (this.theWorld == null) {
                        object = class_02234.lllIIIllIIIIlllIlIIllIIll("Affected level");
                        ((class_0799)object).lllIIIllIIIIlllIlIIllIIll("Problem", "Level is null!");
                    } else {
                        this.theWorld.addWorldInfoToCrashReport(class_02234);
                    }
                    throw new class_0892(class_02234);
                }
            }
            this.mcProfiler.endStartSection("animateTick");
            if (!this.IIlIllIIlllllIIlIIllllIIl && this.theWorld != null) {
                this.theWorld.lllIIIllIIIIlllIlIIllIIll(MathHelper.IlIllllllIIlIIllllIIlIIIl(this.lIIIIlIlIIlllllIIllIIlIII.IlIIlllllIIlIlIlllllIllll), MathHelper.IlIllllllIIlIIllllIIlIIIl(this.lIIIIlIlIIlllllIIllIIlIII.llIIlIlIlllIIllIlIlllIllI), MathHelper.IlIllllllIIlIIllllIIlIIIl(this.lIIIIlIlIIlllllIIllIIlIII.IllIIIIllIIllIllIlllIlIIl));
            }
            this.mcProfiler.endStartSection("particles");
            if (!this.IIlIllIIlllllIIlIIllllIIl) {
                this.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll();
            }
        } else if (this.lIlllIIllIIIIIIlIlIIlIllI != null) {
            this.mcProfiler.endStartSection("pendingConnection");
            this.lIlllIIllIIIIIIlIlIIlIllI.lllIIIllIIIIlllIlIIllIIll();
        }
        this.mcProfiler.endSection();
        this.llIIIlllIlllIlIllIIIIllIl = Minecraft.getSystemTime();
    }

    public void lllIIIllIIIIlllIlIIllIIll(String string, String string2, class_1078 class_10782) {
        Object object;
        this.lllIIIllIIIIlllIlIIllIIll((class_0564)null);
        System.gc();
        class_0028 class_00282 = this.IIIlIlIllIlllllIlIllllllI.lllIIIllIIIIlllIlIIllIIll(string, false);
        class_0770 class_07702 = class_00282.IlIllllllIIlIIllllIIlIIIl();
        if (class_07702 == null && class_10782 != null) {
            class_07702 = new class_0770(class_10782, string);
            class_00282.lllIIIllIIIIlllIlIIllIIll(class_07702);
        }
        if (class_10782 == null) {
            class_10782 = new class_1078(class_07702);
        }
        try {
            this.theIntegratedServer = new IntegratedServer(this, string, string2, class_10782);
            this.theIntegratedServer.lIlIlIIlIIIIlIIIIIlllIIII();
            this.integratedServerIsRunning = true;
        }
        catch (Throwable throwable) {
            CrashReport class_02232 = CrashReport.lllIIIllIIIIlllIlIIllIIll(throwable, "Starting integrated server");
            class_0799 class_07992 = class_02232.lllIIIllIIIIlllIlIIllIIll("Starting integrated server");
            class_07992.lllIIIllIIIIlllIlIIllIIll("Level ID", string);
            class_07992.lllIIIllIIIIlllIlIIllIIll("Level Name", string2);
            throw new class_0892(class_02232);
        }
        this.IlIlIIlllIIlIllIIIlllllIl.lllIlIIlIIIlIlIIIllIlllIl(class_0616.lllIIIllIIIIlllIlIIllIIll("menu.loadingLevel", new Object[0]));
        while (!this.theIntegratedServer.lIIlIlllIllIlIlllIIIIIIII()) {
            object = this.theIntegratedServer.lllIlIIlIIIlIlIIIllIlllIl();
            if (object != null) {
                this.IlIlIIlllIIlIllIIIlllllIl.resetProgresAndWorkingMessage(class_0616.lllIIIllIIIIlllIlIIllIIll((String)object, new Object[0]));
            } else {
                this.IlIlIIlllIIlIllIIIlllllIl.resetProgresAndWorkingMessage("");
            }
            try {
                Thread.sleep(200L);
            }
            catch (InterruptedException interruptedException) {}
        }
        this.lllIIIllIIIIlllIlIIllIIll((class_0229)null);
        object = this.theIntegratedServer.lIIIlIIIlIlllIllIIIlIIIlI().lllIIIllIIIIlllIlIIllIIll();
        class_0800 class_08002 = class_0800.lllIIIllIIIIlllIlIIllIIll((SocketAddress)object);
        class_08002.lllIIIllIIIIlllIlIIllIIll(new class_0188(class_08002, this, null));
        class_08002.lllIIIllIIIIlllIlIIllIIll(new C00Handshake(5, object.toString(), 0, EnumConnectionState.LOGIN), new GenericFutureListener[0]);
        class_08002.lllIIIllIIIIlllIlIIllIIll(new C00PacketLoginStart(this.getSession().func_148256_e()), new GenericFutureListener[0]);
        this.lIlllIIllIIIIIIlIlIIlIllI = class_08002;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0564 class_05642) {
        this.lllIIIllIIIIlllIlIIllIIll(class_05642, "");
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0564 class_05642, String string) {
        LunarClient.getInstance().getNetworkManager().lllIIIllIIIIlllIlIIllIIll();
        if (class_05642 == null) {
            class_1764 class_17642 = this.llIIlIllIllllIlIIIIlIIlll();
            if (class_17642 != null) {
                class_17642.lllIlIIlIIIlIlIIIllIlllIl();
            }
            if (this.theIntegratedServer != null) {
                this.theIntegratedServer.llIIllIllIlIIlIIllIllllll();
            }
            this.theIntegratedServer = null;
            this.lIlIlIIlIIIIlIIIIIlllIIII.lllIlIIlIIIlIlIIIllIlllIl();
            this.lIIlIIIIIlIlllIlIIlIlIlll.IllIIIllIIIIlIlIlIllIIlll().lllIIIllIIIIlllIlIIllIIll();
        }
        this.llIIlllIllIllllIIIlIIIIII = null;
        this.lIlllIIllIIIIIIlIlIIlIllI = null;
        if (this.IlIlIIlllIIlIllIIIlllllIl != null) {
            this.IlIlIIlllIIlIllIIIlllllIl.resetProgressAndMessage(string);
            this.IlIlIIlllIIlIllIIIlllllIl.resetProgresAndWorkingMessage("");
        }
        if (class_05642 == null && this.theWorld != null) {
            if (this.mcResourcePackRepository.IlIIIIIllllllIIlllIllllll() != null) {
                this.IllIIIIllIIllIllIlllIlIIl();
            }
            this.mcResourcePackRepository.lIllllIIlIIIlIllllllIIIll();
            this.lllIIIllIIIIlllIlIIllIIll((class_1092)null);
            this.integratedServerIsRunning = false;
        }
        this.lIIIIllIIllIIIlIIIllIllII.lllIlIIlIIIlIlIIIllIlllIl();
        this.theWorld = class_05642;
        if (class_05642 != null) {
            LunarClient.getInstance().getEventBus().callEvent(new class_1016(class_05642));
            if (this.IllIIIllIIIIlIlIlIllIIlll != null) {
                this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(class_05642);
            }
            if (this.lllIIlIIIllllllIIIIlIlIlI != null) {
                this.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(class_05642);
            }
            if (this.lIIIIlIlIIlllllIIllIIlIII == null) {
                this.lIIIIlIlIIlllllIIllIIlIII = this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(class_05642, new class_1707());
                this.lIllllIIlIIIlIllllllIIIll.lllIlIIlIIIlIlIIIllIlllIl(this.lIIIIlIlIIlllllIIllIIlIII);
            }
            this.lIIIIlIlIIlllllIIllIIlIII.llIlllIIllIlllIlIlIlIIIll();
            class_05642.lllIIIllIIIIlllIlIIllIIll(this.lIIIIlIlIIlllllIIllIIlIII);
            this.lIIIIlIlIIlllllIIllIIlIII.lIlllIlllIIIIlIIlllIllIII = new class_1432(this.gameSettings);
            this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(this.lIIIIlIlIIlllllIIllIIlIII);
            this.llIIlllIllIllllIIIlIIIIII = this.lIIIIlIlIIlllllIIllIIlIII;
        } else {
            this.IIIlIlIllIlllllIlIllllllI.lIlllIlllIIIIlIIlllIllIII();
            this.lIIIIlIlIIlllllIIllIIlIII = null;
        }
        System.gc();
        this.llIIIlllIlllIlIllIIIIllIl = 0L;
    }

    public String lIIlIIIIIlIlllIlIIlIlIlll() {
        return this.IllIIIllIIIIlIlIlIllIIlll.lllIlIIlIIIlIlIIIllIlllIl();
    }

    public String lIlIlIIlIIIIlIIIIIlllIIII() {
        return this.IllIIIllIIIIlIlIlIllIIlll.IlIllllllIIlIIllllIIlIIIl();
    }

    public String IlIIIlIIIIllIIIllIIIIIIll() {
        return this.theWorld.IlIlIIlIlIllIIlIlIIllIIIl();
    }

    public String IIlllIlIlllIllIIIlllIIlIl() {
        return "P: " + this.lllIIlIIIllllllIIIIlIlIlI.lllIlIIlIIIlIlIIIllIlllIl() + ". T: " + this.theWorld.IlIlllIIIIIIlIIllIIllIlll();
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n) {
        this.theWorld.IllIIIllIIIIlIlIlIllIIlll();
        this.theWorld.IllIIlllllllIIlIIlIIIIlIl();
        int n2 = 0;
        String string = null;
        if (this.lIIIIlIlIIlllllIIllIIlIII != null) {
            n2 = this.lIIIIlIlIIlllllIIllIIlIII.llllllIlIllllIlIlIlIIIIlI();
            this.theWorld.lllIlIIlIIIlIlIIIllIlllIl(this.lIIIIlIlIIlllllIIllIIlIII);
            string = this.lIIIIlIlIIlllllIIllIIlIII.lIlllIlllIlIIIIlllIlIlIIl();
        }
        this.llIIlllIllIllllIIIlIIIIII = null;
        this.lIIIIlIlIIlllllIIllIIlIII = this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(this.theWorld, this.lIIIIlIlIIlllllIIllIIlIII == null ? new class_1707() : this.lIIIIlIlIIlllllIIllIIlIII.IlIIlllllIIlIlIlllllIllll());
        this.lIIIIlIlIIlllllIIllIIlIII.lIIllllllllIlIllllllllIlI = n;
        this.llIIlllIllIllllIIIlIIIIII = this.lIIIIlIlIIlllllIIllIIlIII;
        this.lIIIIlIlIIlllllIIllIIlIII.llIlllIIllIlllIlIlIlIIIll();
        this.lIIIIlIlIIlllllIIllIIlIII.IlIllllllIIlIIllllIIlIIIl(string);
        this.theWorld.lllIIIllIIIIlllIlIIllIIll(this.lIIIIlIlIIlllllIIllIIlIII);
        this.lIllllIIlIIIlIllllllIIIll.lllIlIIlIIIlIlIIIllIlllIl(this.lIIIIlIlIIlllllIIllIIlIII);
        this.lIIIIlIlIIlllllIIllIIlIII.lIlllIlllIIIIlIIlllIllIII = new class_1432(this.gameSettings);
        this.lIIIIlIlIIlllllIIllIIlIII.lIlllIlllIIIIlIIlllIllIII(n2);
        this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(this.lIIIIlIlIIlllllIIllIIlIII);
        if (this.lllllIlllIIllIlIIlIIIllII instanceof class_0533) {
            this.lllIIIllIIIIlllIlIIllIIll((class_0229)null);
        }
    }

    public final boolean lIlIllIIlIIlIIlIIlIIlIIll() {
        return this.isDemo;
    }

    public class_1764 llIIlIllIllllIlIIIIlIIlll() {
        return this.lIIIIlIlIIlllllIIllIIlIII != null ? this.lIIIIlIlIIlllllIIllIIlIII.lllIlIIlIIIlIlIIIllIlllIl : null;
    }

    public static boolean llIllllIlIllIIIlIllIIlIlI() {
        return theMinecraft == null || !Minecraft.theMinecraft.gameSettings.lIllIIlllIIIlIlIIIlllIlIl;
    }

    public static boolean lIlllIlllIlIIIIlllIlIlIIl() {
        return theMinecraft != null && Minecraft.theMinecraft.gameSettings.IIIllIllIIlIlIlIlIllllIIl;
    }

    public static boolean IlIIlllllIIlIlIlllllIllll() {
        return theMinecraft != null && Minecraft.theMinecraft.gameSettings.IllIIIllIIIIlIlIlIllIIlll != 0;
    }

    private void IlIIllIlIlIllIIIlIIlIlIIl() {
        if (this.lIlIllIIlIIlIIlIIlIIlIIll != null) {
            Item class_06112;
            int n;
            boolean bl = this.lIIIIlIlIIlllllIIllIIlIII.lIIlIlIlIlIllIIlIIllllIll.lIlllIlllIIIIlIIlllIllIII;
            int n2 = 0;
            boolean bl2 = false;
            if (this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll == class_1431.lllIlIIlIIIlIlIIIllIlllIl) {
                n = this.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl;
                int n3 = this.lIlIllIIlIIlIIlIIlIIlIIll.IlIllllllIIlIIllllIIlIIIl;
                int n4 = this.lIlIllIIlIIlIIlIIlIIlIIll.lIlllIlllIIIIlIIlllIllIII;
                Block class_05492 = this.theWorld.a_(n, n3, n4);
                if (class_05492.lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll) {
                    return;
                }
                class_06112 = class_05492.IIIllIIlIIIIIIlIlIIllIIlI(this.theWorld, n, n3, n4);
                if (class_06112 == null) {
                    return;
                }
                bl2 = class_06112.lIlllIlllIIIIlIIlllIllIII();
                Block class_05493 = class_06112 instanceof class_1272 && !class_05492.llllIIIIlIIIlIIIIIIlIllll() ? Block.lllIIIllIIIIlllIlIIllIIll(class_06112) : class_05492;
                n2 = class_05493.IllIIlllllllIIlIIlIIIIlIl(this.theWorld, n, n3, n4);
            } else {
                if (this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll != class_1431.IlIllllllIIlIIllllIIlIIIl || this.lIlIllIIlIIlIIlIIlIIlIIll.IIIllIIlIIIIIIlIlIIllIIlI == null || !bl) {
                    return;
                }
                if (this.lIlIllIIlIIlIIlIIlIIlIIll.IIIllIIlIIIIIIlIlIIllIIlI instanceof class_0146) {
                    class_06112 = Items.IlIlIllIIlIIIIlllIlIllIlI;
                } else if (this.lIlIllIIlIIlIIlIIlIIlIIll.IIIllIIlIIIIIIlIlIIllIIlI instanceof class_1215) {
                    class_06112 = Items.IIlIlIIIlIIllIlIlIlIlIIll;
                } else if (this.lIlIllIIlIIlIIlIIlIIlIIll.IIIllIIlIIIIIIlIlIIllIIlI instanceof class_1094) {
                    class_1094 class_10942 = (class_1094)this.lIlIllIIlIIlIIlIIlIIlIIll.IIIllIIlIIIIIIlIlIIllIIlI;
                    ItemStack class_08972 = class_10942.lIllllIIlIIIlIllllllIIIll();
                    if (class_08972 == null) {
                        class_06112 = Items.IIIllIIIlIlllllllIIIlllll;
                    } else {
                        class_06112 = class_08972.lllIIIllIIIIlllIlIIllIIll();
                        n2 = class_08972.IllIIIllIIIIlIlIlIllIIlll();
                        bl2 = true;
                    }
                } else if (this.lIlIllIIlIIlIIlIIlIIlIIll.IIIllIIlIIIIIIlIlIIllIIlI instanceof class_1860) {
                    class_1860 class_18602 = (class_1860)this.lIlIllIIlIIlIIlIIlIIlIIll.IIIllIIlIIIIIIlIlIIllIIlI;
                    class_06112 = class_18602.IlIllllllIIlIIllllIIlIIIl() == 2 ? Items.lIlIIIllIIllIIlIllllllIll : (class_18602.IlIllllllIIlIIllllIIlIIIl() == 1 ? Items.IlIIlIIlllllIlIIlIlIlIlIl : (class_18602.IlIllllllIIlIIllllIIlIIIl() == 3 ? Items.IIlIlIlIIlllIIIlIIIIlIIIl : (class_18602.IlIllllllIIlIIllllIIlIIIl() == 5 ? Items.lllIIIIlIIllIIIlIllIlllII : (class_18602.IlIllllllIIlIIllllIIlIIIl() == 6 ? Items.IlIlIIlllIIlIlllllIlIIIIl : Items.lIlIlIIllIIIlllIllIIlIllI))));
                } else if (this.lIlIllIIlIIlIIlIIlIIlIIll.IIIllIIlIIIIIIlIlIIllIIlI instanceof class_2263) {
                    class_06112 = Items.boat;
                } else {
                    class_06112 = Items.spawn_egg;
                    n2 = class_0054.lllIIIllIIIIlllIlIIllIIll(this.lIlIllIIlIIlIIlIIlIIlIIll.IIIllIIlIIIIIIlIlIIllIIlI);
                    bl2 = true;
                    if (n2 <= 0 || !class_0054.lllIIIllIIIIlllIlIIllIIll.containsKey(n2)) {
                        return;
                    }
                }
            }
            this.lIIIIlIlIIlllllIIllIIlIII.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(class_06112, n2, bl2, bl);
            if (bl) {
                n = this.lIIIIlIlIIlllllIIllIIlIII.IlIlllIIIIIIlIIllIIllIlll.IlIllllllIIlIIllllIIlIIIl.size() - 9 + this.lIIIIlIlIIlllllIIllIIlIII.lllIIlIIIllllllIIIIlIlIlI.IlIllllllIIlIIllllIIlIIIl;
                this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(this.lIIIIlIlIIlllllIIllIIlIII.lllIIlIIIllllllIIIIlIlIlI.llIIllIllIlIIlIIllIllllll(this.lIIIIlIlIIlllllIIllIIlIII.lllIIlIIIllllllIIIIlIlIlI.IlIllllllIIlIIllllIIlIIIl), n);
            }
        }
    }

    public CrashReport addGraphicsAndWorldToCrashReport(CrashReport p_71396_1_) {
        p_71396_1_.getCategory().addCrashSectionCallable("Launched Version", () -> Minecraft.this.launchedVersion);
        p_71396_1_.getCategory().addCrashSectionCallable("LWJGL", Sys::getVersion);
        p_71396_1_.getCategory().addCrashSectionCallable("OpenGL", () -> GL11.glGetString(GL11.GL_RENDERER) + " GL version " + GL11.glGetString(GL11.GL_VERSION) + ", " + GL11.glGetString(GL11.GL_VENDOR));
        p_71396_1_.getCategory().addCrashSectionCallable("GL Caps", OpenGlHelper::func_153172_c);
        p_71396_1_.getCategory().addCrashSectionCallable("Is Modded", () -> !ClientBrandRetriever.getClientModName().equals("vanilla") ? "Definitely; Client brand changed to \'" + ClientBrandRetriever.getClientModName() + "\'" : (Minecraft.class.getSigners() == null ? "Very likely; Jar signature invalidated" : "Probably not. Jar signature remains and client brand is untouched."));
        p_71396_1_.getCategory().addCrashSectionCallable("Type", () -> "Client (map_client.txt)");
        p_71396_1_.getCategory().addCrashSectionCallable("Resource Packs", () -> this.gameSettings.resourcePacks.toString());
        p_71396_1_.getCategory().addCrashSectionCallable("Profiler Position", () -> this.mcProfiler.profilingEnabled ? this.mcProfiler.getNameOfLastSection() : "N/A (disabled)");
        p_71396_1_.getCategory().addCrashSectionCallable("Vec3 Pool Size", new Callable() {
            private static final String __OBFID = "CL_00000637";
            public String call()
            {
                byte b0 = 0;
                int i = 56 * b0;
                int j = i / 1024 / 1024;
                byte b1 = 0;
                int k = 56 * b1;
                int l = k / 1024 / 1024;
                return b0 + " (" + i + " bytes; " + j + " MB) allocated, " + b1 + " (" + k + " bytes; " + l + " MB) used";
            }
        });
        p_71396_1_.getCategory().addCrashSectionCallable("Anisotropic Filtering", () -> this.gameSettings.anisotropicFiltering == 1 ? "Off (1)" : "On (" + this.gameSettings.anisotropicFiltering + ")");

        if (this.theWorld != null) {
            this.theWorld.addWorldInfoToCrashReport(p_71396_1_);
        }

        return p_71396_1_;
    }

    public static Minecraft getMinecraft() {
        return theMinecraft;
    }

    public void IllIIIIllIIllIllIlllIlIIl() {
        this.llllIlIIllIIlllllIIllIIll = true;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1296 class_12962) {
        class_12962.func_152768_a("fps", IlIIlllllIIlIlIlllllIllll);
        class_12962.func_152768_a("vsync_enabled", this.gameSettings.lllllIllllIIIIllIIlIlIlII);
        class_12962.func_152768_a("display_frequency", Display.getDisplayMode().getFrequency());
        class_12962.func_152768_a("display_type", this.fullscreen ? "fullscreen" : "windowed");
        class_12962.func_152768_a("run_time", (class_0220.lllIIIlIIlIlIllIIIIIlIIll() - class_12962.IIIllIIlIIIIIIlIlIIllIIlI()) / 60L * 1000L);
        class_12962.func_152768_a("resource_packs", this.mcResourcePackRepository.IlIllllllIIlIIllllIIlIIIl().size());
        int n = 0;
        for (class_0025 class_00252 : this.mcResourcePackRepository.IlIllllllIIlIIllllIIlIIIl()) {
            class_12962.func_152768_a("resource_pack[" + n++ + "]", class_00252.lIlllIlllIIIIlIIlllIllIII());
        }
        if (this.theIntegratedServer != null && this.theIntegratedServer.IlIIIlIllIIIllIIIIlIIlIll() != null) {
            class_12962.func_152768_a("snooper_partner", this.theIntegratedServer.IlIIIlIllIIIllIIIIlIIlIll().lIllllIIlIIIlIllllllIIIll());
        }
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_1296 class_12962) {
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("opengl_version", GL11.glGetString((int)7938));
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("opengl_vendor", GL11.glGetString((int)7936));
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("client_brand", ClientBrandRetriever.getClientModName());
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("launched_version", this.launchedVersion);
        ContextCapabilities contextCapabilities = GLContext.getCapabilities();
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[ARB_arrays_of_arrays]", contextCapabilities.GL_ARB_arrays_of_arrays);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[ARB_base_instance]", contextCapabilities.GL_ARB_base_instance);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[ARB_blend_func_extended]", contextCapabilities.GL_ARB_blend_func_extended);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[ARB_clear_buffer_object]", contextCapabilities.GL_ARB_clear_buffer_object);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[ARB_color_buffer_float]", contextCapabilities.GL_ARB_color_buffer_float);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[ARB_compatibility]", contextCapabilities.GL_ARB_compatibility);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[ARB_compressed_texture_pixel_storage]", contextCapabilities.GL_ARB_compressed_texture_pixel_storage);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[ARB_compute_shader]", contextCapabilities.GL_ARB_compute_shader);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[ARB_copy_buffer]", contextCapabilities.GL_ARB_copy_buffer);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[ARB_copy_image]", contextCapabilities.GL_ARB_copy_image);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[ARB_depth_buffer_float]", contextCapabilities.GL_ARB_depth_buffer_float);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[ARB_compute_shader]", contextCapabilities.GL_ARB_compute_shader);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[ARB_copy_buffer]", contextCapabilities.GL_ARB_copy_buffer);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[ARB_copy_image]", contextCapabilities.GL_ARB_copy_image);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[ARB_depth_buffer_float]", contextCapabilities.GL_ARB_depth_buffer_float);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[ARB_depth_clamp]", contextCapabilities.GL_ARB_depth_clamp);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[ARB_depth_texture]", contextCapabilities.GL_ARB_depth_texture);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[ARB_draw_buffers]", contextCapabilities.GL_ARB_draw_buffers);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[ARB_draw_buffers_blend]", contextCapabilities.GL_ARB_draw_buffers_blend);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[ARB_draw_elements_base_vertex]", contextCapabilities.GL_ARB_draw_elements_base_vertex);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[ARB_draw_indirect]", contextCapabilities.GL_ARB_draw_indirect);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[ARB_draw_instanced]", contextCapabilities.GL_ARB_draw_instanced);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[ARB_explicit_attrib_location]", contextCapabilities.GL_ARB_explicit_attrib_location);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[ARB_explicit_uniform_location]", contextCapabilities.GL_ARB_explicit_uniform_location);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[ARB_fragment_layer_viewport]", contextCapabilities.GL_ARB_fragment_layer_viewport);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[ARB_fragment_program]", contextCapabilities.GL_ARB_fragment_program);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[ARB_fragment_shader]", contextCapabilities.GL_ARB_fragment_shader);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[ARB_fragment_program_shadow]", contextCapabilities.GL_ARB_fragment_program_shadow);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[ARB_framebuffer_object]", contextCapabilities.GL_ARB_framebuffer_object);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[ARB_framebuffer_sRGB]", contextCapabilities.GL_ARB_framebuffer_sRGB);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[ARB_geometry_shader4]", contextCapabilities.GL_ARB_geometry_shader4);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[ARB_gpu_shader5]", contextCapabilities.GL_ARB_gpu_shader5);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[ARB_half_float_pixel]", contextCapabilities.GL_ARB_half_float_pixel);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[ARB_half_float_vertex]", contextCapabilities.GL_ARB_half_float_vertex);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[ARB_instanced_arrays]", contextCapabilities.GL_ARB_instanced_arrays);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[ARB_map_buffer_alignment]", contextCapabilities.GL_ARB_map_buffer_alignment);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[ARB_map_buffer_range]", contextCapabilities.GL_ARB_map_buffer_range);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[ARB_multisample]", contextCapabilities.GL_ARB_multisample);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[ARB_multitexture]", contextCapabilities.GL_ARB_multitexture);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[ARB_occlusion_query2]", contextCapabilities.GL_ARB_occlusion_query2);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[ARB_pixel_buffer_object]", contextCapabilities.GL_ARB_pixel_buffer_object);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[ARB_seamless_cube_map]", contextCapabilities.GL_ARB_seamless_cube_map);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[ARB_shader_objects]", contextCapabilities.GL_ARB_shader_objects);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[ARB_shader_stencil_export]", contextCapabilities.GL_ARB_shader_stencil_export);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[ARB_shader_texture_lod]", contextCapabilities.GL_ARB_shader_texture_lod);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[ARB_shadow]", contextCapabilities.GL_ARB_shadow);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[ARB_shadow_ambient]", contextCapabilities.GL_ARB_shadow_ambient);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[ARB_stencil_texturing]", contextCapabilities.GL_ARB_stencil_texturing);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[ARB_sync]", contextCapabilities.GL_ARB_sync);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[ARB_tessellation_shader]", contextCapabilities.GL_ARB_tessellation_shader);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[ARB_texture_border_clamp]", contextCapabilities.GL_ARB_texture_border_clamp);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[ARB_texture_buffer_object]", contextCapabilities.GL_ARB_texture_buffer_object);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[ARB_texture_cube_map]", contextCapabilities.GL_ARB_texture_cube_map);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[ARB_texture_cube_map_array]", contextCapabilities.GL_ARB_texture_cube_map_array);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[ARB_texture_non_power_of_two]", contextCapabilities.GL_ARB_texture_non_power_of_two);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[ARB_uniform_buffer_object]", contextCapabilities.GL_ARB_uniform_buffer_object);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[ARB_vertex_blend]", contextCapabilities.GL_ARB_vertex_blend);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[ARB_vertex_buffer_object]", contextCapabilities.GL_ARB_vertex_buffer_object);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[ARB_vertex_program]", contextCapabilities.GL_ARB_vertex_program);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[ARB_vertex_shader]", contextCapabilities.GL_ARB_vertex_shader);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[EXT_bindable_uniform]", contextCapabilities.GL_EXT_bindable_uniform);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[EXT_blend_equation_separate]", contextCapabilities.GL_EXT_blend_equation_separate);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[EXT_blend_func_separate]", contextCapabilities.GL_EXT_blend_func_separate);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[EXT_blend_minmax]", contextCapabilities.GL_EXT_blend_minmax);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[EXT_blend_subtract]", contextCapabilities.GL_EXT_blend_subtract);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[EXT_draw_instanced]", contextCapabilities.GL_EXT_draw_instanced);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[EXT_framebuffer_multisample]", contextCapabilities.GL_EXT_framebuffer_multisample);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[EXT_framebuffer_object]", contextCapabilities.GL_EXT_framebuffer_object);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[EXT_framebuffer_sRGB]", contextCapabilities.GL_EXT_framebuffer_sRGB);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[EXT_geometry_shader4]", contextCapabilities.GL_EXT_geometry_shader4);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[EXT_gpu_program_parameters]", contextCapabilities.GL_EXT_gpu_program_parameters);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[EXT_gpu_shader4]", contextCapabilities.GL_EXT_gpu_shader4);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[EXT_multi_draw_arrays]", contextCapabilities.GL_EXT_multi_draw_arrays);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[EXT_packed_depth_stencil]", contextCapabilities.GL_EXT_packed_depth_stencil);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[EXT_paletted_texture]", contextCapabilities.GL_EXT_paletted_texture);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[EXT_rescale_normal]", contextCapabilities.GL_EXT_rescale_normal);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[EXT_separate_shader_objects]", contextCapabilities.GL_EXT_separate_shader_objects);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[EXT_shader_image_load_store]", contextCapabilities.GL_EXT_shader_image_load_store);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[EXT_shadow_funcs]", contextCapabilities.GL_EXT_shadow_funcs);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[EXT_shared_texture_palette]", contextCapabilities.GL_EXT_shared_texture_palette);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[EXT_stencil_clear_tag]", contextCapabilities.GL_EXT_stencil_clear_tag);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[EXT_stencil_two_side]", contextCapabilities.GL_EXT_stencil_two_side);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[EXT_stencil_wrap]", contextCapabilities.GL_EXT_stencil_wrap);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[EXT_texture_3d]", contextCapabilities.GL_EXT_texture_3d);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[EXT_texture_array]", contextCapabilities.GL_EXT_texture_array);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[EXT_texture_buffer_object]", contextCapabilities.GL_EXT_texture_buffer_object);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[EXT_texture_filter_anisotropic]", contextCapabilities.GL_EXT_texture_filter_anisotropic);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[EXT_texture_integer]", contextCapabilities.GL_EXT_texture_integer);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[EXT_texture_lod_bias]", contextCapabilities.GL_EXT_texture_lod_bias);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[EXT_texture_sRGB]", contextCapabilities.GL_EXT_texture_sRGB);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[EXT_vertex_shader]", contextCapabilities.GL_EXT_vertex_shader);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[EXT_vertex_weighting]", contextCapabilities.GL_EXT_vertex_weighting);
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[gl_max_vertex_uniforms]", GL11.glGetInteger((int)35658));
        GL11.glGetError();
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[gl_max_fragment_uniforms]", GL11.glGetInteger((int)35657));
        GL11.glGetError();
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[gl_max_vertex_attribs]", GL11.glGetInteger((int)34921));
        GL11.glGetError();
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[gl_max_vertex_texture_image_units]", GL11.glGetInteger((int)35660));
        GL11.glGetError();
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[gl_max_texture_image_units]", GL11.glGetInteger((int)34930));
        GL11.glGetError();
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_caps[gl_max_texture_image_units]", GL11.glGetInteger((int)35071));
        GL11.glGetError();
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gl_max_texture_size", Minecraft.IIIIIIIIlIllIIllIIlllIllI());
    }

    public static int IIIIIIIIlIllIIllIIlllIllI() {
        for (int i = 16384; i > 0; i >>= 1) {
            GL11.glTexImage2D((int)32868, (int)0, (int)6408, (int)i, (int)i, (int)0, (int)6408, (int)5121, (ByteBuffer)null);
            int n = GL11.glGetTexLevelParameteri((int)32868, (int)0, (int)4096);
            if (n == 0) continue;
            return i;
        }
        return -1;
    }

    @Override
    public boolean IIlIIlIlIlIllIIlIlIIIIlll() {
        return false;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1092 class_10922) {
        this.lIlllIlllIIIIlIIlllIllIII = this.IlIllllllIIlIIllllIIlIIIl;
        this.IlIllllllIIlIIllllIIlIIIl = class_10922;
    }

    public class_1092 llIIIlllIlllIlIllIIIIllIl() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public boolean isIntegratedServerRunning() {
        return this.integratedServerIsRunning;
    }

    public boolean isSingleplayer() {
        return this.integratedServerIsRunning && this.theIntegratedServer != null;
    }

    public IntegratedServer getIntegratedServer() {
        return this.theIntegratedServer;
    }

    public static void stopIntegratedServer() {
        if (theMinecraft != null)
        {
            IntegratedServer integratedserver = theMinecraft.getIntegratedServer();

            if (integratedserver != null)
            {
                integratedserver.stopServer();
            }
        }
    }

    public class_1296 IIllIllIIllIIlllIIIlIlllI() {
        return this.lIIIlIIIlIlllIllIIIlIIIlI;
    }

    public static long getSystemTime() {
        return Sys.getTime() * 1000L / Sys.getTimerResolution();
    }

    public boolean lIlIIllllIlIIIIllIIIIlIIl() {
        return this.fullscreen;
    }

    public class_1220 getSession() {
        return this.session;
    }

    public Multimap IIIIlIIlIIIllIIIIllIIIlII() {
        return this.field_152356_J;
    }

    public Proxy lllIIIIIIlIlllIIlIlIIIllI() {
        return this.proxy;
    }

    public class_1682 llIIlIIllIIllIlIIllIIllII() {
        return this.IlIIIIIllllllIIlllIllllll;
    }

    public class_0947 getResourceManager() {
        return this.llIIIIIlIIlIIIIllIIIlIIII;
    }

    public class_1605 IllllIIIIlIIlIIIIlllIIIIl() {
        return this.mcResourcePackRepository;
    }

    public class_1882 llllIlIIIIIIIIIlllIIlIIIl() {
        return this.lIlIllIIllIIIIlllIlIlllIl;
    }

    public class_1511 IIIIlIlIIlIIIIlIlllIlIIII() {
        return this.lIIllllllllIlIllllllllIlI;
    }

    public boolean lllIIIIlIlIIlIIlllIIIIIIl() {
        return this.jvm64bit;
    }

    public boolean llIlIIlllIIIIIllIIlIlIIII() {
        return this.IIlIllIIlllllIIlIIllllIIl;
    }

    public class_1300 IllIIIlllllIlIlllIlllllII() {
        return this.lIIIIllIIllIIIlIIIllIllII;
    }

    public class_0260 llIlllIlIIllIlIIIIllIIlIl() {
        return this.lllllIlllIIllIlIIlIIIllII instanceof class_0867 ? class_0260.CREDITS : (this.lIIIIlIlIIlllllIIllIIlIII != null ? (this.lIIIIlIlIIlllllIIllIIlIII.lIlIllIIlIIlIIlIIlIIlIIll.IlIlIIlllIIlIllIIIlllllIl instanceof class_1439 ? class_0260.NETHER : (this.lIIIIlIlIIlllllIIllIIlIII.lIlIllIIlIIlIIlIIlIIlIIll.IlIlIIlllIIlIllIIIlllllIl instanceof class_1863 ? (class_0178.IlIllllllIIlIIllllIIlIIIl != null && class_0178.lllIlIIlIIIlIlIIIllIlllIl > 0 ? class_0260.END_BOSS : class_0260.END) : (this.lIIIIlIlIIlllllIIllIIlIII.lIIlIlIlIlIllIIlIIllllIll.lIlllIlllIIIIlIIlllIllIII && this.lIIIIlIlIIlllllIIllIIlIII.lIIlIlIlIlIllIIlIIllllIll.IlIllllllIIlIIllllIIlIIIl ? class_0260.CREATIVE : class_0260.GAME))) : class_0260.MENU);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public ListenableFuture lllIIIllIIIIlllIlIIllIIll(Callable callable) {
        Validate.notNull((Object)callable);
        if (!this.lIIIllIIIIIllllIlIlIllIll()) {
            ListenableFutureTask listenableFutureTask = ListenableFutureTask.create((Callable)callable);
            Queue queue = this.lIIllIlIIlIIlllllIlIIllIl;
            Queue queue2 = this.lIIllIlIIlIIlllllIlIIllIl;
            synchronized (queue2) {
                this.lIIllIlIIlIIlllllIlIIllIl.add(listenableFutureTask);
                return listenableFutureTask;
            }
        }
        try {
            return Futures.immediateFuture(callable.call());
        }
        catch (Exception exception) {
            return Futures.immediateFailedCheckedFuture((Exception)exception);
        }
    }

    public ListenableFuture lllIIIllIIIIlllIlIIllIIll(Runnable runnable) {
        Validate.notNull((Object)runnable);
        return this.lllIIIllIIIIlllIlIIllIIll(Executors.callable(runnable));
    }

    public boolean lIIIllIIIIIllllIlIlIllIll() {
        return Thread.currentThread() == this.lIIlllIIlIlIlIIIlIlllIIll;
    }

    public MinecraftSessionService lIIIlIIIlIlllIllIIIlIIIlI() {
        return this.field_152355_az;
    }

    public class_0030 lIIlIlllIllIlIlllIIIIIIII() {
        return this.IIIIIllIlIllIlIlIIlIllIIl;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1220 class_12202) {
        this.session = class_12202;
        try {
            System.out.println("[LC] Connecting to player assets server as " + class_12202.getUsername());
            LunarClient.getInstance().connectToWebsocket();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static native void lllIIIllIIIIlllIlIIllIIll(String var0, String var1, String var2, AtomicBoolean var3);

    public DefaultResourcePack IIlIllIIlllllIIlIIllllIIl() {
        return this.mcDefaultResourcePack;
    }

    public class_1706 IllllIIlIIIllIlllIlllIllI() {
        return this.lIlIIIllIIllIIlIllllllIll;
    }

    static /* synthetic */ String lllIIIllIIIIlllIlIIllIIll(Minecraft class_06672) {
        return class_06672.launchedVersion;
    }

    static {
        lIlIIlllllIlllllIlIIIllll = null;
        lllllllIlIIlIlIIIlIlIIlll = new ArrayList();
    }
}

