package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL14
 */
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import java.lang.reflect.Method;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.SocketException;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TreeSet;

import com.moonsworth.lunar.client.LunarClient;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.util.MathHelper;
import net.minecraft.client.settings.Options;
import org.lwjgl.BufferUtils;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL14;

public class class_1139
implements Runnable,
class_0785 {
    private class_2013 llIIIIllIIIIIIIlIIIlIIIIl;
    public Minecraft lllIIIllIIIIlllIlIIllIIll;
    public String lllIlIIlIIIlIlIIIllIlllIl = "v1.2.0";
    private class_1334 IIllIllIIllIIlllIIIlIlllI = null;
    private int llllllIlIllllIlIlIlIIIIlI = 256;
    private boolean lIlIIllllIlIIIIllIIIIlIIl = false;
    public class_1835 IlIllllllIIlIIllllIIlIIIl = null;
    public class_0441 lIlllIlllIIIIlIIlllIllIII = null;
    public class_1845 IlIIIIIllllllIIlllIllllll = null;
    public class_0237 lIllllIIlIIIlIllllllIIIll = null;
    public class_0153 IIIllIIlIIIIIIlIlIIllIIlI = null;
    public class_1251 IllIIlllllllIIlIIlIIIIlIl = null;
    private int llIlllIIllIlllIlIlIlIIIll = Runtime.getRuntime().availableProcessors();
    public boolean IIIllIllIIlIlIlIlIllllIIl = this.llIlllIIllIlllIlIlIlIIIll > 0;
    private class_0041[] IIIIlIIlIIIllIIIIllIIIlII = new class_0041[4];
    private class_0032[] lllIIIIIIlIlllIIlIlIIIllI = new class_0032[4];
    private class_0243[] llIIlIIllIIllIlIIllIIllII = new class_0243[4];
    private class_0243 lIlIlIIIIIIlIIllllIlIIllI;
    private boolean IllllIIIIlIIlIIIIlllIIIIl = true;
    private class_2202 llllIlIIIIIIIIIlllIIlIIIl = null;
    private boolean IIIIlIlIIlIIIIlIlllIlIIII = true;
    private final float[] lllIIIIlIlIIlIIlllIIIIIIl = new float[16];
    private float llIlIIlllIIIIIllIIlIlIIII = 0.0f;
    private float IllIIIlllllIlIlllIlllllII = 0.0f;
    private float llIlllIlIIllIlIIIIllIIlIl = 0.0f;
    private float lIIIllIIIIIllllIlIlIllIll = 0.0f;
    private int[] lIIIlIIIlIlllIllIIIlIIIlI = new int[]{-16777216, -16777216, -16777216, -16777216, -16777216, -16777216, -16777216, -16777216, -16777216, -16777216, -16777216, -16777216, -16777216, -16777216, -16777216, -16777216};
    private boolean lIIlIlllIllIlIlllIIIIIIII = false;
    boolean IllIIIllIIIIlIlIlIllIIlll = false;
    private boolean IIlIllIIlllllIIlIIllllIIl = true;
    private int IllllIIlIIIllIlllIlllIllI = 0;
    private int IllIlIlIIIlllIIllIIIIlIll = 0;
    public Random lIIIIlIlIIlllllIIllIIlIII = new Random();
    public int llIIlllIllIllllIIIlIIIIII = 1;
    private class_0229 IlIIIlIllIIIllIIIIlIIlIll = null;
    private boolean llllIIllIlIlllllllIIlIIlI = true;
    public boolean llIIllIllIlIIlIIllIllllll = false;
    public boolean lllIIlIIIllllllIIIIlIlIlI = false;
    public int IlIlllIIIIIIlIIllIIllIlll = 2;
    public int IlIlIIlIlIllIIlIlIIllIIIl = 37;
    public int lllllIlllIIllIlIIlIIIllII = 37;
    int IlIlIIlllIIlIllIIIlllllIl;
    int lIIlIIIIIlIlllIlIIlIlIlll;
    private String IlllIIlllllllIIllIlIllllI = "";
    private String[] IlllIIIllllIIllIllIlIIlIl = new String[8];
    private int lllIIIlIIlIlIllIIIIIlIIll = 0;
    private int IIIlIlIllIlllllIlIllllllI = 0;
    private int IIIIlIllIlIIIIIllllIIlllI = 0;
    public boolean lIlIlIIlIIIIlIIIIIlllIIII = true;
    private boolean llllIlIIllIIlllllIIllIIll;
    public int IlIIIlIIIIllIIIllIIIIIIll = 0;
    public int IIlllIlIlllIllIIIlllIIlIl = 0;
    private int IlIlIllIIlIIIIlllIlIllIlI = 0;
    private int IlIIllIlIlIllIIIlIIlIlIIl = 0;
    private int lIlIIllIllIIIIIlIllllIIIl = 0;
    private boolean lIlllIIllIIIIIIlIlIIlIllI = false;
    public int lIlIllIIlIIlIIlIIlIIlIIll = 0;
    private float llIIIlIlIlIIlIllIIIllIlIl = 0.0f;
    public float llIIlIllIllllIlIIIIlIIlll;
    public float llIllllIlIllIIIlIllIIlIlI;
    public boolean lIlllIlllIlIIIIlllIlIlIIl = false;
    public boolean IlIIlllllIIlIlIlllllIllll = false;
    class_0220 llIIlIlIlllIIllIlIlllIllI;
    private String lIIlIIlIllIlIIlIlIIlIlIlI = "";
    Long IllIIIIllIIllIllIlllIlIIl = 0L;
    boolean IIIIIIIIlIllIIllIIlllIllI = false;
    class_1550 IIlIIlIlIlIllIIlIlIIIIlll = null;
    private int llIIIIIlIIlIIIIllIIIlIIII = this.IIIllIllIIlIlIlIlIllllIIl ? 2 : 5;
    private int lIlIlIIllIIIlllIllIIlIllI = this.IIIllIllIIlIlIlIlIllllIIl ? 300 : 3000;
    public boolean llIIIlllIlllIlIllIIIIllIl = false;
    public int IIIIlIllIlIIlIIlIllIlIlll = 0;
    public Thread IlIlIIlllIllllllllIIIlIlI = new Thread((Runnable)this, "Voxelmap Map Calculation Thread");
    public boolean llllIIIIlIIIlIIIIIIlIllll = this.IIIllIllIIlIlIlIlIllllIIl;
    private class_1854 IlIIIIIllIlllIIIIlIIIllIl;
    private int[] lIIlIlIIllIIIlIIlIlIIIlII = new int[256];
    private boolean lIIIlIIllIllIIlIIlIIIllII = false;
    private boolean lIlIllIIllIIIIlllIlIlllIl = false;
    private final int[] IlIIIlIIlllllIIIllIlIlIll = new int[]{"minecraftxteria".toLowerCase().hashCode(), "jacoboom100".toLowerCase().hashCode(), "Laserpigofdoom".toLowerCase().hashCode(), "DesignVenomz".toLowerCase().hashCode(), "ElectronTowel".toLowerCase().hashCode(), "Fighterbear12".toLowerCase().hashCode(), "KillmurCS".toLowerCase().hashCode()};
    private boolean lIIllllllllIlIllllllllIlI = false;
    private final Object lIIIIllIIllIIIlIIIllIllII = new Object();

    public class_1139(class_2013 class_20132) {
        class_2114 class_21142;
        this.llIIIIllIIIIIIIlIIIlIIIIl = class_20132;
        this.lllIIIllIIIIlllIlIIllIIll = class_0006.lllIIIllIIIIlllIlIIllIIll();
        this.IlIllllllIIlIIllllIIlIIIl = class_20132.lllIlIIlIIIlIlIIIllIlllIl();
        this.lIlllIlllIIIIlIIlllIllIII = class_20132.IlIIIIIllllllIIlllIllllll();
        this.lIllllIIlIIIlIllllllIIIll = class_20132.lIllllIIlIIIlIllllllIIIll();
        this.IIIllIIlIIIIIIlIlIIllIIlI = class_20132.IIIllIIlIIIIIIlIlIIllIIlI();
        this.IllIIlllllllIIlIIlIIIIlIl = class_20132.IllIIlllllllIIlIIlIIIIlIl();
        this.IlIIIIIllllllIIlllIllllll = new class_1845();
        try {
            class_1449.lllIIIllIIIIlllIlIIllIIll();
        }
        catch (SocketException socketException) {
            System.err.println("could not get network interface addresses");
            socketException.printStackTrace();
        }
        ArrayList<class_1335> arrayList = new ArrayList<class_1335>();
        arrayList.addAll(Arrays.asList(this.lllIIIllIIIIlllIlIIllIIll.gameSettings.llIlllllIIlIIlIIllllIllll));
        arrayList.addAll(Arrays.asList(this.IlIllllllIIlIIllllIIlIIIl.lllIIIIIIlIlllIIlIlIIIllI));
        this.lllIIIllIIIIlllIlIIllIIll.gameSettings.llIlllllIIlIIlIIllllIllll = arrayList.toArray(new class_1335[arrayList.size()]);
        this.IlIlIIlllIllllllllIIIlIlI.start();
        this.IlIlIIlllIllllllllIIIlIlI.setPriority(5);
        this.IIIIlIIlIIIllIIIIllIIIlII[0] = new class_0041(32, 32);
        this.IIIIlIIlIIIllIIIIllIIIlII[1] = new class_0041(64, 64);
        this.IIIIlIIlIIIllIIIIllIIIlII[2] = new class_0041(128, 128);
        this.IIIIlIIlIIIllIIIIllIIIlII[3] = new class_0041(256, 256);
        this.lllIIIIIIlIlllIIlIlIIIllI[0] = new class_0032(3, 3, this);
        this.lllIIIIIIlIlllIIlIlIIIllI[1] = new class_0032(5, 5, this);
        this.lllIIIIIIlIlllIIlIlIIIllI[2] = new class_0032(9, 9, this);
        this.lllIIIIIIlIlllIIlIlIIIllI[3] = new class_0032(17, 17, this);
        this.llIIlIIllIIllIlIIllIIllII[0] = new class_0243(32, 32, 6);
        this.llIIlIIllIIllIlIIllIIllII[1] = new class_0243(64, 64, 6);
        this.llIIlIIllIIllIlIIllIIllII[2] = new class_0243(128, 128, 6);
        this.llIIlIIllIIllIlIIllIIllII[3] = new class_0243(256, 256, 6);
        this.lIlIlIIIIIIlIIllllIlIIllI = new class_0243(128, 128, 6);
        this.IlllIIIllllIIllIllIlIIlIl[0] = (Object)((Object)class_1227.IlIIIIIllllllIIlllIllllll) + "VoxelMap" + (Object)((Object)class_1227.IlIlIIlIlIllIIlIlIIllIIIl) + "! " + this.lllIlIIlIIIlIlIIIllIlllIl + " " + class_0950.lllIIIllIIIIlllIlIIllIIll("minimap.ui.welcome1");
        this.IlllIIIllllIIllIllIlIIlIl[1] = class_0950.lllIIIllIIIIlllIlIIllIIll("minimap.ui.welcome2");
        this.IlllIIIllllIIllIllIlIIlIl[2] = class_0950.lllIIIllIIIIlllIlIIllIIll("minimap.ui.welcome3");
        this.IlllIIIllllIIllIllIlIIlIl[3] = class_0950.lllIIIllIIIIlllIlIIllIIll("minimap.ui.welcome4");
        this.IlllIIIllllIIllIllIlIIlIl[4] = (Object)((Object)class_1227.llIIlllIllIllllIIIlIIIIII) + class_1835.IlIllllllIIlIIllllIIlIIIl(this.IlIllllllIIlIIllllIIlIIIl.llIIIIllIIIIIIIlIIIlIIIIl.IIIllIllIIlIlIlIlIllllIIl()) + (Object)((Object)class_1227.IlIlIIlIlIllIIlIlIIllIIIl) + ": " + class_0950.lllIIIllIIIIlllIlIIllIIll("minimap.ui.welcome5a") + ", " + (Object)((Object)class_1227.llIIlllIllIllllIIIlIIIIII) + ": " + class_1835.IlIllllllIIlIIllllIIlIIIl(this.IlIllllllIIlIIllllIIlIIIl.llllllIlIllllIlIlIlIIIIlI.IIIllIllIIlIlIlIlIllllIIl()) + (Object)((Object)class_1227.IlIlIIlIlIllIIlIlIIllIIIl) + ": " + class_0950.lllIIIllIIIIlllIlIIllIIll("minimap.ui.welcome5b");
        this.IlllIIIllllIIllIllIlIIlIl[5] = (Object)((Object)class_1227.llIIlllIllIllllIIIlIIIIII) + class_1835.IlIllllllIIlIIllllIIlIIIl(this.IlIllllllIIlIIllllIIlIIIl.IIllIllIIllIIlllIIIlIlllI.IIIllIllIIlIlIlIlIllllIIl()) + (Object)((Object)class_1227.IlIlIIlIlIllIIlIlIIllIIIl) + ": " + class_0950.lllIIIllIIIIlllIlIIllIIll("minimap.ui.welcome6");
        this.IlllIIIllllIIllIllIlIIlIl[6] = (Object)((Object)class_1227.llIIlllIllIllllIIIlIIIIII) + class_1835.IlIllllllIIlIIllllIIlIIIl(this.IlIllllllIIlIIllllIIlIIIl.llIlllIIllIlllIlIlIlIIIll.IIIllIllIIlIlIlIlIllllIIl()) + (Object)((Object)class_1227.IlIlIIlIlIllIIlIlIIllIIIl) + ": " + class_0950.lllIIIllIIIIlllIlIIllIIll("minimap.ui.welcome7");
        this.IlllIIIllllIIllIllIlIIlIl[7] = (Object)((Object)class_1227.IlIlIIlIlIllIIlIlIIllIIIl) + class_1835.IlIllllllIIlIIllllIIlIIIl(this.IlIllllllIIlIIllllIIlIIIl.llIIIIllIIIIIIIlIIIlIIIIl.IIIllIllIIlIlIlIlIllllIIl()) + (Object)((Object)class_1227.IllIIlllllllIIlIIlIIIIlIl) + ": " + class_0950.lllIIIllIIIIlllIlIIllIIll("minimap.ui.welcome8");
        if (class_2210.IlIllllllIIlIIllllIIlIIIl) {
            class_2210.lllIIIllIIIIlllIlIIllIIll();
        }
        if ((class_21142 = class_2114.lllIIIllIIIIlllIlIIllIIll) != null) {
            Object object = class_1736.lllIIIllIIIIlllIlIIllIIll(class_21142, class_2114.class, class_1139.class);
            if (object == null) {
                System.out.println("could not get entityRenderMap");
            } else {
                class_1745 class_17452 = new class_1745(this.IlIllllllIIlIIllllIIlIIIl);
                ((HashMap)object).put(class_2163.class, class_17452);
                class_17452.lllIIIllIIIIlllIlIIllIIll(class_2114.lllIIIllIIIIlllIlIIllIIll);
                this.lIlIIllllIlIIIIllIIIIlIIl = true;
            }
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(boolean bl) {
        this.lIlIlIIlIIIIlIIIIIlllIIII = bl;
    }

    @Override
    public float lllIIIllIIIIlllIlIIllIIll() {
        return this.llIIlIllIllllIlIIIIlIIlll;
    }

    @Override
    public float lllIlIIlIIIlIlIIIllIlllIl() {
        return this.llIllllIlIllIIIlIllIIlIlI;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        if (this.lllIIIllIIIIlllIlIIllIIll == null) {
            return;
        }
        while (true) {
            Thread thread;
            if (this.llllIIIIlIIIlIIIIIIlIllll) {
                this.lllIIlIIIllllllIIIIlIlIlI = true;
                while (this.lllIIIllIIIIlllIlIIllIIll.lIIIIlIlIIlllllIIllIIlIII != null && this.lllIIlIIIllllllIIIIlIlIlI) {
                    if (!this.IlIllllllIIlIIllllIIlIIIl.lIlllIlllIIIIlIIlllIllIII) {
                        try {
                            this.IlIllllllIIlIIllllIIlIIIl(this.lIlIlIIlIIIIlIIIIIlllIIII);
                            if (!this.lIlIlIIlIIIIlIIIIIlllIIII) {
                                boolean bl = !this.IlIllllllIIlIIllllIIlIIIl.IlIlIIlllIllllllllIIIlIlI && !this.lIIIlIIllIllIIlIIlIIIllII;
                                this.lllIIIIIIlIlllIIlIlIIIllI[this.IlIlllIIIIIIlIIllIIllIlll].lllIIIllIIIIlllIlIIllIIll(this.IlIIIlIIIIllIIIllIIIIIIll, this.IIlllIlIlllIllIIIlllIIlIl);
                                this.lllIIIIIIlIlllIIlIlIIIllI[this.IlIlllIIIIIIlIIllIIllIlll].lllIIIllIIIIlllIlIIllIIll(bl);
                                if (bl != (!this.IlIllllllIIlIIllllIIlIIIl.IlIlIIlllIllllllllIIIlIlI && !this.lIIIlIIllIllIIlIIlIIIllII)) {
                                    this.lllIlIIlIIIlIlIIIllIlllIl(true);
                                }
                            }
                        }
                        catch (Exception exception) {
                            // empty catch block
                        }
                    }
                    this.lIlIlIIlIIIIlIIIIIlllIIII = this.llllIlIIllIIlllllIIllIIll;
                    this.llllIlIIllIIlllllIIllIIll = false;
                    this.lllIIlIIIllllllIIIIlIlIlI = false;
                }
                thread = this.IlIlIIlllIllllllllIIIlIlI;
                synchronized (thread) {
                    try {
                        this.IlIlIIlllIllllllllIIIlIlI.wait(0L);
                    }
                    catch (InterruptedException interruptedException) {
                        // empty catch block
                    }
                }
            }
            thread = this.IlIlIIlllIllllllllIIIlIlI;
            synchronized (thread) {
                try {
                    this.IlIlIIlllIllllllllIIIlIlI.wait(0L);
                }
                catch (InterruptedException interruptedException) {
                    // empty catch block
                }
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void lllIIIllIIIIlllIlIIllIIll(Minecraft class_06672) {
        Object object;
        Object object2;
        int n = this.IIIIlIllIlIIlIIlIllIlIlll = this.IlIllllllIIlIIllllIIlIIIl.lllllIlllIIllIlIIlIIIllII ? 90 : 0;
        if (this.lllIIIllIIIIlllIlIIllIIll == null) {
            this.lllIIIllIIIIlllIlIIllIIll = class_06672;
        }
        if (this.IlIIIIIllIlllIIIIlIIIllIl == null) {
            this.IlIIIIIllIlllIIIIlIIIllIl = this.lllIIIllIIIIlllIlIIllIIll.IlIlllIIIIIIlIIllIIllIlll;
        }
        if (class_2210.lllIIIllIIIIlllIlIIllIIll == null) {
            class_2210.lllIIIllIIIIlllIlIIllIIll = this.lllIIIllIIIIlllIlIIllIIll.llIIlIIllIIllIlIIllIIllII();
        }
        if (this.llllIlIIIIIIIIIlllIIlIIIl == null) {
            this.llllIlIIIIIIIIIlllIIlIIIl = this.IllIIIllIIIIlIlIlIllIIlll();
        }
        if (!this.lIlIIllllIlIIIIllIIIIlIIl && (object2 = class_2114.lllIIIllIIIIlllIlIIllIIll) != null && (object = class_1736.lllIIIllIIIIlllIlIIllIIll(object2, class_2114.class, Map.class)) != null) {
            class_1745 class_17452 = new class_1745(this.IlIllllllIIlIIllllIIlIIIl);
            ((HashMap)object).put(class_2163.class, class_17452);
            class_17452.lllIIIllIIIIlllIlIIllIIll(class_2114.lllIIIllIIIIlllIlIIllIIll);
            this.lIlIIllllIlIIIIllIIIIlIIl = true;
        }
        if (this.lllIIIllIIIIlllIlIIllIIll.lllllIlllIIllIlIIlIIIllII == null && this.IlIllllllIIlIIllllIIlIIIl.llllllIlIllllIlIlIlIIIIlI.lIllllIIlIIIlIllllllIIIll()) {
            this.llIIlllIllIllllIIIlIIIIII = 0;
            if (this.IlIllllllIIlIIllllIIlIIIl.IIlllIlIlllIllIIIlllIIlIl) {
                this.IlIllllllIIlIIllllIIlIIIl.IIlllIlIlllIllIIIlllIIlIl = false;
                this.IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl();
            }
            this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new class_0658(this.llIIIIllIIIIIIIlIIIlIIIIl));
        }
        if (this.lllIIIllIIIIlllIlIIllIIll.lllllIlllIIllIlIIlIIIllII == null && this.IlIllllllIIlIIllllIIlIIIl.llIlllIIllIlllIlIlIlIIIll.lIllllIIlIIIlIllllllIIIll()) {
            float f;
            float f2;
            float f3;
            this.llIIlllIllIllllIIIlIIIIII = 0;
            if (this.IlIllllllIIlIIllllIIlIIIl.IIlllIlIlllIllIIIlllIIlIl) {
                this.IlIllllllIIlIIllllIIlIIIl.IIlllIlIlllIllIIIlllIIlIl = false;
                this.IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl();
            }
            if (this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll().size() == 0) {
                f3 = 0.0f;
                f2 = 1.0f;
                f = 0.0f;
            } else {
                f3 = this.lIIIIlIlIIlllllIIllIIlIII.nextFloat();
                f2 = this.lIIIIlIlIIlllllIIllIIlIII.nextFloat();
                f = this.lIIIIlIlIIlllllIIllIIlIII.nextFloat();
            }
            TreeSet<Integer> treeSet = new TreeSet<Integer>();
            treeSet.add(this.lllIIIllIIIIlllIlIIllIIll.lIIIIlIlIIlllllIIllIIlIII.lIIllllllllIlIllllllllIlI);
            class_0368 class_03682 = new class_0368("", class_0006.lIlllIlllIIIIlIIlllIllIII(), class_0006.IlIIIIIllllllIIlllIllllll(), class_0006.lIllllIIlIIIlIllllllIIIll() - 1, true, f3, f2, f, "", this.llIIIIllIIIIIIIlIIIlIIIIl.IIIllIIlIIIIIIlIlIIllIIlI().IlIllllllIIlIIllllIIlIIIl(), treeSet);
            class_03682.IlIIIIIllllllIIlllIllllll = LunarClient.getInstance().getNetworkManager().IIIllIllIIlIlIlIlIllllIIl();
            this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new class_1661(this.llIIIIllIIIIIIIlIIIlIIIIl, null, class_03682, false));
        }
        if (this.lllIIIllIIIIlllIlIIllIIll.lllllIlllIIllIlIIlIIIllII == null && this.IlIllllllIIlIIllllIIlIIIl.IIIIlIIlIIIllIIIIllIIIlII.lIllllIIlIIIlIllllllIIIll()) {
            if (this.IlIllllllIIlIIllllIIlIIIl.IIlllIlIlllIllIIIlllIIlIl) {
                this.IlIllllllIIlIIllllIIlIIIl.IIlllIlIlllIllIIIlllIIlIl = false;
                this.IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl();
            }
            this.llIIIIllIIIIIIIlIIIlIIIIl.IlIllllllIIlIIllllIIlIIIl().lllIIIllIIIIlllIlIIllIIll(class_1002.lIIlIIIIIlIlllIlIIlIlIlll, 0);
            this.IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl();
        }
        if (this.lllIIIllIIIIlllIlIIllIIll.lllllIlllIIllIlIIlIIIllII == null && this.IlIllllllIIlIIllllIIlIIIl.llIIIIllIIIIIIIlIIIlIIIIl.lIllllIIlIIIlIllllllIIIll()) {
            if (this.IlIllllllIIlIIllllIIlIIIl.IIlllIlIlllIllIIIlllIIlIl) {
                this.IlIllllllIIlIIllllIIlIIIl.IIlllIlIlllIllIIIlllIIlIl = false;
                this.IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl();
            }
            this.IIIllIIlIIIIIIlIlIIllIIlI();
        }
        if (this.lllIIIllIIIIlllIlIIllIIll.lllllIlllIIllIlIIlIIIllII == null && this.IlIllllllIIlIIllllIIlIIIl.IIllIllIIllIIlllIIIlIlllI.lIllllIIlIIIlIllllllIIIll()) {
            if (this.IlIllllllIIlIIllllIIlIIIl.IIlllIlIlllIllIIIlllIIlIl) {
                this.IlIllllllIIlIIllllIIlIIIl.IIlllIlIlllIllIIIlllIIlIl = false;
                this.IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl();
            }
            boolean bl = this.llIIllIllIlIIlIIllIllllll = !this.llIIllIllIlIIlIIllIllllll;
            this.IlllIIlllllllIIllIlIllllI = this.IlIlllIIIIIIlIIllIIllIlll == 3 ? class_0950.lllIIIllIIIIlllIlIIllIIll("minimap.ui.zoomlevel") + " (0.5x)" : (this.IlIlllIIIIIIlIIllIIllIlll == 2 ? class_0950.lllIIIllIIIIlllIlIIllIIll("minimap.ui.zoomlevel") + " (1.0x)" : (this.IlIlllIIIIIIlIIllIIllIlll == 1 ? class_0950.lllIIIllIIIIlllIlIIllIIll("minimap.ui.zoomlevel") + " (2.0x)" : class_0950.lllIIIllIIIIlllIlIIllIIll("minimap.ui.zoomlevel") + " (4.0x)"));
        }
        this.llIIlllIllIllllIIIlIIIIII();
        if (this.lllIIIllIIIIlllIlIIllIIll.lllllIlllIIllIlIIlIIIllII instanceof class_0533 && !(this.IlIIIlIllIIIllIIIIlIIlIll instanceof class_0533)) {
            this.IIIllIIlIIIIIIlIlIIllIIlI.lllIlIIlIIIlIlIIIllIlllIl();
        }
        this.IlIIIlIllIIIllIIIIlIIlIll = this.lllIIIllIIIIlllIlIIllIIll.lllllIlllIIllIlIIlIIIllII;
        this.IIIllIIlIIIIIIlIlIIllIIlI.IIIllIllIIlIlIlIlIllllIIl();
        this.IlIllllllIIlIIllllIIlIIIl();
        if (this.llllIIIIlIIIlIIIIIIlIllll) {
            if (!this.IlIlIIlllIllllllllIIIlIlI.isAlive() && this.llllIIIIlIIIlIIIIIIlIllll) {
                this.IlIlIIlllIllllllllIIIlIlI = new Thread((Runnable)this, "Map Calculation");
                this.IlIlIIlllIllllllllIIIlIlI.setPriority(5);
                this.IlIlIIlllIllllllllIIIlIlI.start();
            }
            if (!(this.lllIIIllIIIIlllIlIIllIIll.lllllIlllIIllIlIIlIIIllII instanceof class_0533) && !(this.lllIIIllIIIIlllIlIIllIIll.lllllIlllIIllIlIIlIIIllII instanceof class_0733)) {
                object2 = this.IlIlIIlllIllllllllIIIlIlI;
                synchronized (object2) {
                    this.IlIlIIlllIllllllllIIIlIlI.notify();
                }
            }
        } else if (!this.llllIIIIlIIIlIIIIIIlIllll) {
            if (!(this.IlIllllllIIlIIllllIIlIIIl.lIlllIlllIIIIlIIlllIllIII || class_1304.lllIIIllIIIIlllIlIIllIIll != class_0561.lllIIIllIIIIlllIlIIllIIll && class_1304.lllIIIllIIIIlllIlIIllIIll != class_0561.lllIlIIlIIIlIlIIIllIlllIl)) {
                this.IlIllllllIIlIIllllIIlIIIl(this.lIlIlIIlIIIIlIIIIIlllIIII);
                if (!this.lIlIlIIlIIIIlIIIIIlllIIII) {
                    boolean bl = !this.IlIllllllIIlIIllllIIlIIIl.IlIlIIlllIllllllllIIIlIlI && !this.lIIIlIIllIllIIlIIlIIIllII;
                    this.lllIIIIIIlIlllIIlIlIIIllI[this.IlIlllIIIIIIlIIllIIllIlll].lllIIIllIIIIlllIlIIllIIll(this.IlIIIlIIIIllIIIllIIIIIIll, this.IIlllIlIlllIllIIIlllIIlIl);
                    this.lllIIIIIIlIlllIIlIlIIIllI[this.IlIlllIIIIIIlIIllIIllIlll].lllIIIllIIIIlllIlIIllIIll(bl);
                }
            }
            this.lIlIlIIlIIIIlIIIIIlllIIII = false;
        }
        if (this.llIIlllIllIllllIIIlIIIIII == 1 && !this.IlIllllllIIlIIllllIIlIIIl.IIlllIlIlllIllIIIlllIIlIl) {
            this.llIIlllIllIllllIIIlIIIIII = 0;
        }
        this.llllIIllIlIlllllllIIlIIlI = !(class_06672.gameSettings.lIllIIlllIIIlIlIIIlllIlIl && this.lllIIIllIIIIlllIlIIllIIll.lllllIlllIIllIlIIlIIIllII == null || !this.IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl && this.lllIIIllIIIIlllIlIIllIIll.lllllIlllIIllIlIIlIIIllII != null && !(this.lllIIIllIIIIlllIlIIllIIll.lllllIlllIIllIlIIlIIIllII instanceof class_1056) || Keyboard.isKeyDown((int)61));
        this.llIIIlIlIlIIlIllIIIllIlIl = class_0006.IIIllIllIIlIlIlIlIllllIIl() + 180.0f + (float)this.IIIIlIllIlIIlIIlIllIlIlll;
        while (this.llIIIlIlIlIIlIllIIIllIlIl >= 360.0f) {
            this.llIIIlIlIlIIlIllIIIllIlIl -= 360.0f;
        }
        while (this.llIIIlIlIlIIlIllIIIllIlIl < 0.0f) {
            this.llIIIlIlIlIIlIllIIIllIlIl += 360.0f;
        }
        if (!this.IlllIIlllllllIIllIlIllllI.equals("") && this.lllIIIlIIlIlIllIIIIIlIIll == 0) {
            this.lllIIIlIIlIlIllIIIIIlIIll = 500;
        }
        if (this.lllIIIlIIlIlIllIIIIIlIIll > 0) {
            --this.lllIIIlIIlIlIllIIIIIlIIll;
        }
        if (this.lllIIIlIIlIlIllIIIIIlIIll == 0 && !this.IlllIIlllllllIIllIlIllllI.equals("")) {
            this.IlllIIlllllllIIllIlIllllI = "";
        }
        if (this.llllIIllIlIlllllllIIlIIlI && (class_1304.lllIIIllIIIIlllIlIIllIIll == class_0561.lllIIIllIIIIlllIlIIllIIll || class_1304.lllIIIllIIIIlllIlIIllIIll == class_0561.lllIlIIlIIIlIlIIIllIlllIl)) {
            this.lllIlIIlIIIlIlIIIllIlllIl(class_06672);
        }
        int n2 = this.IIIIlIllIlIIIIIllllIIlllI = this.IIIIlIllIlIIIIIllllIIlllI > 5000 ? 0 : this.IIIIlIllIlIIIIIllllIIlllI + 1;
        if (this.IIIIlIllIlIIIIIllllIIlllI == 5000 && this.lllIIIllIIIIlllIlIIllIIll.lIIIIlIlIIlllllIIllIIlIII.lIIllllllllIlIllllllllIlI == 0) {
            this.IIIllIIlIIIIIIlIlIIllIIlI.IIIllIIlIIIIIIlIlIIllIIlI();
        }
    }

    private class_2202 IllIIIllIIIIlIlIlIllIIlll() {
        Object object = class_1736.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll.lIIlIIIIIlIlllIlIIlIlIlll, class_0817.class, class_2202.class);
        if (object == null) {
            return null;
        }
        return (class_2202)object;
    }

    public void IlIllllllIIlIIllllIIlIIIl() {
        int n;
        int n2;
        boolean bl;
        int n3;
        if (!this.lIlIIllllIlIIIIllIIIIlIIl) {
            return;
        }
        if (this.lllIIIllIIIIlllIlIIllIIll.gameSettings.lllIIIllIIIIlllIlIIllIIll() != this.llIlIIlllIIIIIllIIlIlIIII) {
            this.IIIIlIlIIlIIIIlIlllIlIIII = true;
            this.llIlIIlllIIIIIllIIlIlIIII = this.lllIIIllIIIIlllIlIIllIIll.gameSettings.lllIIIllIIIIlllIlIIllIIll();
        }
        for (int i = 0; i < 16; ++i) {
            if (this.IIllIllIIllIIlllIIIlIlllI.IlIlIIlllIIlIllIIIlllllIl.IllIIlllllllIIlIIlIIIIlIl[i] == this.lllIIIIlIlIIlIIlllIIIIIIl[i]) continue;
            this.IIIIlIlIIlIIIIlIlllIlIIII = true;
            this.lllIIIIlIlIIlIIlllIIIIIIl[i] = this.IIllIllIIllIIlllIIIlIlllI.IlIlIIlllIIlIllIIIlllllIl.IllIIlllllllIIlIIlIIIIlIl[i];
        }
        float f = this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl(1.0f);
        if ((double)Math.abs(this.IllIIIlllllIlIlllIlllllII - f) > 0.01 || (double)f == 1.0 && f != this.IllIIIlllllIlIlllIlllllII || (double)f == 0.0 && f != this.IllIIIlllllIlIlllIlllllII) {
            this.IIIIlIlIIlIIIIlIlllIlIIII = true;
            this.IllIIIllIIIIlIlIlIllIIlll = true;
            this.IllIIIlllllIlIlllIlllllII = f;
        }
        float f2 = 0.0f;
        if (this.lllIIIllIIIIlllIlIIllIIll.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(class_0700.IlIlIIlllIIlIllIIIlllllIl)) {
            n3 = this.lllIIIllIIIIlllIlIIllIIll.lIIIIlIlIIlllllIIllIIlIII.lllIlIIlIIIlIlIIIllIlllIl(class_0700.IlIlIIlllIIlIllIIIlllllIl).lllIlIIlIIIlIlIIIllIlllIl();
            float f3 = f2 = n3 > 200 ? 1.0f : 0.7f + MathHelper.lllIIIllIIIIlllIlIIllIIll(((float)n3 - 1.0f) * (float)Math.PI * 0.2f) * 0.3f;
        }
        if (this.lIIIllIIIIIllllIlIlIllIll != f2) {
            this.lIIIllIIIIIllllIlIlIllIll = f2;
            this.IIIIlIlIIlIIIIlIlllIlIIII = true;
        }
        if (this.llIlllIlIIllIlIIIIllIIlIl != (float)(n3 = this.IIllIllIIllIIlllIIIlIlllI.IlIlllIIIIIIlIIllIIllIlll)) {
            this.llIlllIlIIllIlIIIIllIIlIl = n3;
            this.IIIIlIlIIlIIIIlIlllIlIIII = true;
        }
        boolean bl2 = bl = (this.IIIIlIllIlIIIIIllllIIlllI - 50) % (this.lllIIIllIIIIlllIlIIllIIll.lIIIIlIlIIlllllIIllIIlIII.lIIllllllllIlIllllllllIlI != -1 ? 500 : (this.lllIIIIlIlIIlIIlllIIIIIIl[0] == 0.0f ? 250 : 5000)) == 0;
        if (this.IlIllllllIIlIIllllIIlIIIl.IIIllIIlIIIIIIlIlIIllIIlI && (this.IIIIlIlIIlIIIIlIlllIlIIII || bl || this.IlIllllllIIlIIllllIIlIIIl.llllIIIIlIIIlIIIIIIlIllll)) {
            this.lIIlIlIIllIIIlIIlIlIIIlII = (int[])this.llllIlIIIIIIIIIlllIIlIIIl.lIlllIlllIIIIlIIlllIllIII().clone();
            n2 = 0;
            if (this.IlIllllllIIlIIllllIIlIIIl.llllIIIIlIIIlIIIIIIlIllll) {
                n2 = 8;
            }
            for (n = 0; n < 16; ++n) {
                if (this.lIIlIlIIllIIIlIIlIlIIIlII[n * 16 + n2] == this.lIIIlIIIlIlllIllIIIlIIIlI[n]) continue;
                this.IIIIlIlIIlIIIIlIlllIlIIII = false;
            }
        }
        int n4 = n2 = this.lllIIIllIIIIlllIlIIllIIll.lIIIIlIlIIlllllIIllIIlIII.lllIIlIIIllllllIIIIlIlIlI((float)0.0f).lllIlIIlIIIlIlIIIllIlllIl >= this.IIllIllIIllIIlllIIIlIlllI.llIIIlllIlllIlIllIIIIllIl() ? 1 : 0;
        if (n2 != this.IIlIllIIlllllIIlIIllllIIl) {
            this.IllIIIllIIIIlIlIlIllIIlll = true;
            this.IIlIllIIlllllIIlIIllllIIl = n2;
        }
        if ((n = this.IIllIllIIllIIlllIIIlIlllI.a_((int)class_0006.lIlllIlllIIIIlIIlllIllIII(), (int)class_0006.IlIIIIIllllllIIlllIllllll()).lIlIllIIllIIIIlllIlIlllIl) != this.IllllIIlIIIllIlllIlllIllI) {
            this.IllIIIllIIIIlIlIlIllIIlll = true;
            this.IllllIIlIIIllIlllIlllIllI = n;
        }
        if (this.IllIIIllIIIIlIlIlIllIIlll || bl) {
            this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(this.lIIIIlIlIIlllllIIllIIlIII());
        }
    }

    private int lIIIIlIlIIlllllIIllIIlIII() {
        this.IllIIIllIIIIlIlIlIllIIlll = false;
        boolean bl = this.lllIIIllIIIIlllIlIIllIIll.lIIIIlIlIIlllllIIllIIlIII.lllIIlIIIllllllIIIIlIlIlI((float)0.0f).lllIlIIlIIIlIlIIIllIlllIl >= this.IIllIllIIllIIlllIIIlIlllI.llIIIlllIlllIlIllIIIIllIl();
        float[] arrf = new float[16];
        FloatBuffer floatBuffer = BufferUtils.createFloatBuffer((int)16);
        GL11.glGetFloat((int)3106, (FloatBuffer)floatBuffer);
        floatBuffer.get(arrf);
        double d = arrf[0];
        double d2 = arrf[1];
        double d3 = arrf[2];
        int n = -16777216 + (int)(d * 255.0) * 65536 + (int)(d2 * 255.0) * 256 + (int)(d3 * 255.0);
        if (this.lllIIIllIIIIlllIlIIllIIll.theWorld.IlIlIIlllIIlIllIIIlllllIl.lIlllIlllIIIIlIIlllIllIII() && this.lllIIIllIIIIlllIlIIllIIll.gameSettings.lllIIIllIIIIlllIlIIllIIll(Options.RENDER_DISTANCE) >= 4.0f) {
            double d4;
            double d5;
            double d6;
            if (!bl) {
                d6 = 0.0;
                d5 = 0.0;
                d4 = 0.0;
            } else {
                class_0864 class_08642 = this.IIllIllIIllIIlllIIIlIlllI.lllIIIllIIIIlllIlIIllIIll((class_1521)this.lllIIIllIIIIlllIlIIllIIll.lIIIIlIlIIlllllIIllIIlIII, 0.0f);
                d4 = class_08642.lllIIIllIIIIlllIlIIllIIll;
                d5 = class_08642.lllIlIIlIIIlIlIIIllIlllIl;
                d6 = class_08642.IlIllllllIIlIIllllIIlIIIl;
                if (this.IIllIllIIllIIlllIIIlIlllI.IlIlIIlllIIlIllIIIlllllIl.IIIllIIlIIIIIIlIlIIllIIlI()) {
                    d4 = d4 * (double)0.2f + (double)0.04f;
                    d5 = d5 * (double)0.2f + (double)0.04f;
                    d6 = d6 * (double)0.6f + (double)0.1f;
                }
            }
            boolean bl2 = this.IIllIllIIllIIlllIIIlIlllI.IlIlIIlllIIlIllIIIlllllIl.lllIlIIlIIIlIlIIIllIlllIl(class_0006.lIlllIlllIIIIlIIlllIllIII(), class_0006.IlIIIIIllllllIIlllIllllll());
            float f = this.lllIIIllIIIIlllIlIIllIIll.gameSettings.lllIIIllIIIIlllIlIIllIIll(Options.RENDER_DISTANCE) * 16.0f;
            float f2 = 0.0f;
            float f3 = 0.0f;
            if (bl2) {
                f2 = f * 0.05f;
                f3 = Math.min(f, 192.0f) * 0.5f;
            } else {
                f3 = f * 0.8f;
            }
            float f4 = Math.max(0.0f, Math.min(1.0f, (f3 - ((float)class_0006.lIllllIIlIIIlIllllllIIIll() - (float)this.lllIIIllIIIIlllIlIIllIIll.theWorld.llIIIlllIlllIlIllIIIIllIl())) / (f3 - f2)));
            int n2 = (int)(f4 * 255.0f) * 0x1000000 + (int)(d4 * 255.0) * 65536 + (int)(d5 * 255.0) * 256 + (int)(d6 * 255.0);
            return this.lIllllIIlIIIlIllllllIIIll.IlIllllllIIlIIllllIIlIIIl(n2, n);
        }
        return n;
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(Minecraft class_06672) {
        int n = 1;
        while (this.lllIIIllIIIIlllIlIIllIIll.displayWidth / (n + 1) >= 320 && this.lllIIIllIIIIlllIlIIllIIll.displayHeight / (n + 1) >= 240) {
            ++n;
        }
        if ((n += this.llIIllIllIlIIlIIllIllllll ? 0 : this.IlIllllllIIlIIllllIIlIIIl.llIllllIlIllIIIlIllIIlIlI) == 0) {
            n = 1;
        }
        double d = this.lllIIIllIIIIlllIlIIllIIll.displayWidth / n;
        double d2 = this.lllIIIllIIIIlllIlIIllIIll.displayHeight / n;
        this.IlIlIIlllIIlIllIIIlllllIl = MathHelper.lIllllIIlIIIlIllllllIIIll(d);
        this.lIIlIIIIIlIlllIlIIlIlIlll = MathHelper.lIllllIIlIIIlIllllllIIIll(d2);
        GL11.glMatrixMode((int)5889);
        GL11.glPushMatrix();
        GL11.glLoadIdentity();
        GL11.glOrtho((double)0.0, (double)d, (double)d2, (double)0.0, (double)1000.0, (double)3000.0);
        GL11.glMatrixMode((int)5888);
        GL11.glPushMatrix();
        GL11.glLoadIdentity();
        GL11.glTranslatef((float)0.0f, (float)0.0f, (float)-2000.0f);
        this.IlIlIIlIlIllIIlIlIIllIIIl = this.IlIllllllIIlIIllllIIlIIIl.lIlllIlllIlIIIIlllIlIlIIl == 0 || this.IlIllllllIIlIIllllIIlIIIl.lIlllIlllIlIIIIlllIlIlIIl == 3 ? 37 : this.IlIlIIlllIIlIllIIIlllllIl - 37;
        this.lllllIlllIIllIlIIlIIIllII = this.IlIllllllIIlIIllllIIlIIIl.lIlllIlllIlIIIIlllIlIlIIl == 0 || this.IlIllllllIIlIIllllIIlIIIl.lIlllIlllIlIIIIlllIlIlIIl == 1 ? 37 : this.lIIlIIIIIlIlllIlIIlIlIlll - 37;
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)0);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        if (!(this.IlIllllllIIlIIllllIIlIIIl.lIlllIlllIIIIlIIlllIllIII || class_1304.lllIIIllIIIIlllIlIIllIIll != class_0561.lllIIIllIIIIlllIlIIllIIll && class_1304.lllIIIllIIIIlllIlIIllIIll != class_0561.lllIlIIlIIIlIlIIIllIlllIl)) {
            GL11.glEnable((int)2929);
            if (this.llIIllIllIlIIlIIllIllllll) {
                this.lllIlIIlIIIlIlIIIllIlllIl(this.IlIlIIlllIIlIllIIIlllllIl, this.lIIlIIIIIlIlllIlIIlIlIlll);
            } else {
                this.lllIIIllIIIIlllIlIIllIIll(this.IlIlIIlIlIllIIlIlIIllIIIl, this.lllllIlllIIllIlIIlIIIllII, n);
            }
            GL11.glDisable((int)2929);
            if (this.lIlllIlllIIIIlIIlllIllIII != null && this.IlIllllllIIlIIllllIIlIIIl.IlIIlllllIIlIlIlllllIllll.booleanValue() && !this.llIIllIllIlIIlIIllIllllll) {
                this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(n, this.IlIlIIlIlIllIIlIlIIllIIIl, this.lllllIlllIIllIlIIlIIIllII, this.IlIlllIIIIIIlIIllIIllIlll);
                this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(class_06672, this.IlIIIIIllllllIIlllIllllll);
            }
            if (!this.llIIllIllIlIIlIIllIllllll) {
                this.IlIIIIIllllllIIlllIllllll(this.IlIlIIlIlIllIIlIlIIllIIIl, this.lllllIlllIIllIlIIlIIIllII);
            }
            if ((this.IlIllllllIIlIIllllIIlIIIl.IlIlIIlIlIllIIlIlIIllIIIl || this.llIIllIllIlIIlIIllIllllll) && !this.IlIllllllIIlIIllllIIlIIIl.lIlllIlllIIIIlIIlllIllIII) {
                if (this.llIIllIllIlIIlIIllIllllll) {
                    this.lllIIIllIIIIlllIlIIllIIll(this.IlIlIIlllIIlIllIIIlllllIl / 2, this.lIIlIIIIIlIlllIlIIlIlIlll / 2);
                } else {
                    this.lllIIIllIIIIlllIlIIllIIll(this.IlIlIIlIlIllIIlIlIIllIIIl, this.lllllIlllIIllIlIIlIIIllII);
                }
            }
            if (this.lIIllllllllIlIllllllllIlI) {
                class_2210.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("voxelmap/lang/i18n.txt"));
                class_2210.lIlllIlllIIIIlIIlllIllIII();
                class_2210.lllIIIllIIIIlllIlIIllIIll(this.IlIlIIlIlIllIIlIlIIllIIIl, this.lllllIlllIIllIlIIlIIIllII);
                class_2210.IlIIIIIllllllIIlllIllllll();
            }
        }
        if (this.IlIllllllIIlIIllllIIlIIIl.IlIIIIIllllllIIlllIllllll && !LunarClient.getInstance().getModuleManager().IlIllllllIIlIIllllIIlIIIl.lIllllIIlIIIlIllllllIIIll()) {
            this.lIllllIIlIIIlIllllllIIIll(this.IlIlIIlIlIllIIlIlIIllIIIl, this.lllllIlllIIllIlIIlIIIllII);
        }
        if (this.llIIlllIllIllllIIIlIIIIII > 0) {
            // empty if block
        }
        GL11.glDepthMask((boolean)true);
        GL11.glEnable((int)2929);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glMatrixMode((int)5889);
        GL11.glPopMatrix();
        GL11.glMatrixMode((int)5888);
        GL11.glPopMatrix();
    }

    private void llIIlllIllIllllIIIlIIIIII() {
        Object object;
        Object object2;
        boolean bl = false;
        class_0220 class_02202 = class_0220.IlIIlllllIIlIlIlllllIllll();
        if (class_02202 != null && class_02202 != this.llIIlIlIlllIIllIlIlllIllI) {
            this.llIIlIlIlllIIllIlIlllIllI = class_02202;
            object2 = class_02202.llIIlIlIlllIIllIlIlllIllI();
            object = (class_1055)object2;
            ((class_0515)object).lllIIIllIIIIlllIlIIllIIll(new class_1915(this.IIIllIIlIIIIIIlIlIIllIIlI));
        }
        if (this.IIIIIIIIlIllIIllIIlllIllI) {
            this.llIIllIllIlIIlIIllIllllll();
        }
        if (class_0006.lllIlIIlIIIlIlIIIllIlllIl() != null && !class_0006.lllIlIIlIIIlIlIIIllIlllIl().equals(this.IIllIllIIllIIlllIIIlIlllI)) {
            if (this.lllIIIllIIIIlllIlIIllIIll.IIIIlIllIlIIlIIlIllIlIlll()) {
                object2 = this.lIlllIlllIIIIlIIlllIllIII();
            } else {
                object2 = this.IlIIIIIllllllIIlllIllllll();
                if (object2 != null) {
                    object2 = ((String)object2).toLowerCase();
                }
            }
            if (!this.lIIlIIlIllIlIIlIlIIlIlIlI.equals(object2) && object2 != null && !((String)object2).equals("")) {
                this.llllIlIIIIIIIIIlllIIlIIIl = this.IllIIIllIIIIlIlIlIllIIlll();
                bl = true;
                this.lIIlIIlIllIlIIlIlIIlIlIlI = object2;
                this.IIIllIIlIIIIIIlIlIIllIIlI.IlIIIIIllllllIIlllIllllll();
                this.IlIllllllIIlIIllllIIlIIIl.IlIIlllllIIlIlIlllllIllll = this.lIlllIlllIIIIlIIlllIllIII != null;
                this.IlIllllllIIlIIllllIIlIIIl.llIIlIlIlllIIllIlIlllIllI = this.lIlllIlllIIIIlIIlllIllIII != null;
                if (!this.lllIIIllIIIIlllIlIIllIIll.IIIIlIllIlIIlIIlIllIlIlll()) {
                    this.IllIIIIllIIllIllIlllIlIIl = System.currentTimeMillis();
                    this.IIIIIIIIlIllIIllIIlllIllI = true;
                }
                this.IllIIlllllllIIlIIlIIIIlIl.lllIlIIlIIIlIlIIIllIlllIl();
                this.lIIllllllllIlIllllllllIlI = false;
                if (this.lllIIIllIIIIlllIlIIllIIll.lIIIIlIlIIlllllIIllIIlIII != null) {
                    try {
                        object = class_1736.lllIIIllIIIIlllIlIIllIIll(0, class_0814.class, String.class, new Class[0]);
                        int n = ((String)((Method)object).invoke(this.lllIIIllIIIIlllIlIIllIIll.lIIIIlIlIIlllllIIllIIlIII, new Object[0])).toLowerCase().hashCode();
                        for (int i = 0; i < this.IlIIIlIIlllllIIIllIlIlIll.length; ++i) {
                            if (n != this.IlIIIlIIlllllIIIllIlIlIll[i]) continue;
                            this.lIIllllllllIlIllllllllIlI = true;
                        }
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                }
            }
            bl = true;
            this.IIllIllIIllIIlllIIIlIlllI = class_0006.lllIlIIlIIIlIlIIIllIlllIl();
            this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll.lIIIIlIlIIlllllIIllIIlIII.lIIllllllllIlIllllllllIlI);
            this.IllIIlllllllIIlIIlIIIIlIl.lllIlIIlIIIlIlIIIllIlllIl(this.IIllIllIIllIIlllIIIlIlllI.IlIlIIlllIIlIllIIIlllllIl.IIIllIllIIlIlIlIlIllllIIl);
        }
        if (this.lIllllIIlIIIlIllllllIIIll.IIIllIIlIIIIIIlIlIIllIIlI()) {
            bl = true;
        }
        if (this.IlIllllllIIlIIllllIIlIIIl.IlIllllllIIlIIllllIIlIIIl()) {
            bl = true;
        }
        if (bl) {
            this.lIlIlIIlIIIIlIIIIIlllIIII = true;
        }
        if (this.lIIIlIIllIllIIlIIlIIIllII && !this.lIlIllIIllIIIIlllIlIlllIl) {
            this.lllIlIIlIIIlIlIIIllIlllIl(true);
        }
        this.lIlIllIIllIIIIlllIlIlllIl = this.lIIIlIIllIllIIlIIlIIIllII;
    }

    public String lIlllIlllIIIIlIIlllIllIII() {
        return this.lllIIIllIIIIlllIlIIllIIll.llllIIIIlIIIlIIIIIIlIllll().IlIlIIlllIllllllllIIIlIlI();
    }

    public String IlIIIIIllllllIIlllIllllll() {
        block7: {
            try {
                class_1092 class_10922 = this.lllIIIllIIIIlllIlIIllIIll.llIIIlllIlllIlIllIIIIllIl();
                if (class_10922 == null) break block7;
                boolean bl = false;
                if (class_10922.IlIllllllIIlIIllllIIlIIIl == null && class_10922.lIllllIIlIIIlIllllllIIIll == null) {
                    try {
                        String string = class_10922.lllIlIIlIIIlIlIIIllIlllIl;
                        int n = string.lastIndexOf(":");
                        if (n != -1) {
                            string = string.substring(0, n);
                        }
                        InetAddress inetAddress = Inet4Address.getByName(string);
                        bl = class_1449.lllIIIllIIIIlllIlIIllIIll(inetAddress);
                    }
                    catch (Exception exception) {
                        System.err.println("Error resolving address as part of LAN check (will assume internet server)");
                        exception.printStackTrace();
                    }
                }
                if (bl) {
                    System.out.println("LAN server detected!");
                    return class_10922.lllIIIllIIIIlllIlIIllIIll;
                }
                return class_10922.lllIlIIlIIIlIlIIIllIlllIl;
            }
            catch (Exception exception) {
                System.err.println("error getting ServerData");
                exception.printStackTrace();
            }
        }
        return "";
    }

    @Override
    public String lIllllIIlIIIlIllllllIIIll() {
        return this.lIIlIIlIllIlIIlIlIIlIlIlI;
    }

    private void llIIllIllIlIIlIIllIllllll() {
        if (System.currentTimeMillis() - this.IllIIIIllIIllIllIlllIlIIl < 5000L) {
            class_1063 class_10632 = this.lllIIIllIIIIlllIlIIllIIll.IlIIIlIIIIllIIIllIIIIIIll.lllIlIIlIIIlIlIIIllIlllIl();
            if (class_10632 == null) {
                System.out.println("failed to get guiNewChat");
            } else {
                Object object = class_1736.lllIIIllIIIIlllIlIIllIIll(class_10632, class_1063.class, List.class, 1);
                if (object == null) {
                    System.out.println("could not get chatlist");
                } else {
                    class_1550 class_15502;
                    boolean bl = false;
                    boolean bl2 = false;
                    for (int i = 0; i < ((List)object).size() && !(class_15502 = (class_1550)((List)object).get(i)).equals(this.IIlIIlIlIlIllIIlIlIIIIlll); ++i) {
                        String string = class_15502.lllIIIllIIIIlllIlIIllIIll().lIlllIlllIIIIlIIlllIllIII();
                        if ((string = string.replaceAll("\u00ef\u00bf\u00bdr", "")).contains("\u00ef\u00bf\u00bd3 \u00ef\u00bf\u00bd6 \u00ef\u00bf\u00bd3 \u00ef\u00bf\u00bd6 \u00ef\u00bf\u00bd3 \u00ef\u00bf\u00bd6 \u00ef\u00bf\u00bde")) {
                            bl = true;
                            this.IlllIIlllllllIIllIlIllllI = "Server disabled radar";
                        }
                        if (!string.contains("\u00ef\u00bf\u00bd3 \u00ef\u00bf\u00bd6 \u00ef\u00bf\u00bd3 \u00ef\u00bf\u00bd6 \u00ef\u00bf\u00bd3 \u00ef\u00bf\u00bd6 \u00ef\u00bf\u00bdd")) continue;
                        bl2 = true;
                        this.IlllIIlllllllIIllIlIllllI = "Server disabled cavemapping";
                    }
                    this.IlIllllllIIlIIllllIIlIIIl.IlIIlllllIIlIlIlllllIllll = this.IlIllllllIIlIIllllIIlIIIl.IlIIlllllIIlIlIlllllIllll != false && !bl;
                    this.IlIllllllIIlIIllllIIlIIIl.llIIlIlIlllIIllIlIlllIllI = this.IlIllllllIIlIIllllIIlIIIl.llIIlIlIlllIIllIlIlllIllI != false && !bl2;
                    this.IIlIIlIlIlIllIIlIlIIIIlll = ((List)object).size() > 0 ? (class_1550)((List)object).get(0) : null;
                }
            }
        } else {
            this.IIIIIIIIlIllIIllIIlllIllI = false;
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(boolean bl, boolean bl2) {
        this.IlIllllllIIlIIllllIIlIIIl.IlIIlllllIIlIlIlllllIllll = bl;
        this.IlIllllllIIlIIllllIIlIIIl.llIIlIlIlllIIllIlIlllIllI = bl2;
    }

    protected void IIIllIIlIIIIIIlIlIIllIIlI() {
        if (this.llIIlllIllIllllIIIlIIIIII != 0) {
            this.llIIlllIllIllllIIIlIIIIII = 0;
            if (this.IIIllIllIIlIlIlIlIllllIIl() != null) {
                this.IllIIlllllllIIlIIlIIIIlIl();
            }
        } else {
            if (this.IlIllllllIIlIIllllIIlIIIl.lIlIllIIlIIlIIlIIlIIlIIll == 0) {
                this.IlIllllllIIlIIllllIIlIIIl.lIlIllIIlIIlIIlIIlIIlIIll = 3;
                this.IlllIIlllllllIIllIlIllllI = class_0950.lllIIIllIIIIlllIlIIllIIll("minimap.ui.zoomlevel") + " (0.5x)";
            } else if (this.IlIllllllIIlIIllllIIlIIIl.lIlIllIIlIIlIIlIIlIIlIIll == 3) {
                this.IlIllllllIIlIIllllIIlIIIl.lIlIllIIlIIlIIlIIlIIlIIll = 2;
                this.IlllIIlllllllIIllIlIllllI = class_0950.lllIIIllIIIIlllIlIIllIIll("minimap.ui.zoomlevel") + " (1.0x)";
            } else if (this.IlIllllllIIlIIllllIIlIIIl.lIlIllIIlIIlIIlIIlIIlIIll == 2) {
                this.IlIllllllIIlIIllllIIlIIIl.lIlIllIIlIIlIIlIIlIIlIIll = 1;
                this.IlllIIlllllllIIllIlIllllI = class_0950.lllIIIllIIIIlllIlIIllIIll("minimap.ui.zoomlevel") + " (2.0x)";
            } else {
                this.IlIllllllIIlIIllllIIlIIIl.lIlIllIIlIIlIIlIIlIIlIIll = 0;
                this.IlllIIlllllllIIllIlIllllI = class_0950.lllIIIllIIIIlllIlIIllIIll("minimap.ui.zoomlevel") + " (4.0x)";
            }
            this.IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl();
            this.llIIlIIllIIllIlIIllIIllII[this.IlIllllllIIlIIllllIIlIIIl.lIlIllIIlIIlIIlIIlIIlIIll].IlIllllllIIlIIllllIIlIIIl();
            this.llllIlIIllIIlllllIIllIIll = true;
            this.lIlIlIIlIIIIlIIIIIlllIIII = true;
        }
    }

    private void lllIlIIlIIIlIlIIIllIlllIl(boolean bl) {
        class_0723 class_07232 = this.lllIIIllIIIIlllIlIIllIIll.theWorld.lIlllIlllIIIIlIIlllIllIII(this.IlIIIlIIIIllIIIllIIIIIIll, this.IIlllIlIlllIllIIIlllIIlIl);
        int n = class_07232.IIIllIIlIIIIIIlIlIIllIIlI;
        int n2 = class_07232.IllIIlllllllIIlIIlIIIIlIl;
        boolean bl2 = true;
        for (int i = 0; bl2 && i < 25; ++i) {
            class_0723 class_07233;
            int n3;
            bl2 = false;
            for (n3 = n - i; n3 <= n + i; ++n3) {
                class_07233 = this.lllIIIllIIIIlllIlIIllIIll.theWorld.IlIIIIIllllllIIlllIllllll(n3, n2 - i);
                if (class_07233.lIlllIlllIIIIlIIlllIllIII) {
                    class_07233.lllIIlIIIllllllIIIIlIlIlI = bl;
                    bl2 = true;
                }
                class_07233 = this.lllIIIllIIIIlllIlIIllIIll.theWorld.IlIIIIIllllllIIlllIllllll(n3, n2 + i);
                if (!class_07233.lIlllIlllIIIIlIIlllIllIII) continue;
                class_07233.lllIIlIIIllllllIIIIlIlIlI = bl;
                bl2 = true;
            }
            for (n3 = n2 - i + 1; n3 <= n2 + i - 1; ++n3) {
                class_07233 = this.lllIIIllIIIIlllIlIIllIIll.theWorld.IlIIIIIllllllIIlllIllllll(n - i, n3);
                if (class_07233.lIlllIlllIIIIlIIlllIllIII) {
                    class_07233.lllIIlIIIllllllIIIIlIlIlI = bl;
                    bl2 = true;
                }
                class_07233 = this.lllIIIllIIIIlllIlIIllIIll.theWorld.IlIIIIIllllllIIlllIllllll(n + i, n3);
                if (!class_07233.lIlllIlllIIIIlIIlllIllIII) continue;
                class_07233.lllIIlIIIllllllIIIIlIlIlI = bl;
                bl2 = true;
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void IlIllllllIIlIIllllIIlIIIl(boolean bl) {
        int n;
        int n2;
        int n3;
        this.IlIlllIIIIIIlIIllIIllIlll = this.IlIllllllIIlIIllllIIlIIIl.lIlIllIIlIIlIIlIIlIIlIIll;
        int n4 = class_0006.lIlllIlllIIIIlIIlllIllIII();
        int n5 = class_0006.IlIIIIIllllllIIlllIllllll();
        int n6 = class_0006.lIllllIIlIIIlIllllllIIIll();
        int n7 = n4 - this.IlIIIlIIIIllIIIllIIIIIIll;
        int n8 = n5 - this.IIlllIlIlllIllIIIlllIIlIl;
        int n9 = n6 - this.IlIlIllIIlIIIIlllIlIllIlI;
        int n10 = (int)Math.pow(2.0, this.IlIlllIIIIIIlIIllIIllIlll);
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = false;
        boolean bl5 = false;
        int n11 = this.lIllllIIlIIIlIllllllIIIll.lllIlIIlIIIlIlIIIllIlllIl(0, 0, 0);
        if (this.IllIlIlIIIlllIIllIIIIlIll != n11) {
            bl5 = true;
            this.IllIlIlIIIlllIIllIIIIlIll = n11;
        }
        if (this.IlIllllllIIlIIllllIIlIIIl.IIIllIIlIIIIIIlIlIIllIIlI) {
            n3 = 0;
            if (this.IlIllllllIIlIIllllIIlIIIl.llllIIIIlIIIlIIIIIIlIllll) {
                n3 = 8;
            }
            for (n2 = 0; n2 < 16; ++n2) {
                if (this.lIIIlIIIlIlllIllIIIlIIIlI[n2] == this.lIIlIlIIllIIIlIIlIlIIIlII[n2 * 16 + n3]) continue;
                bl4 = true;
                this.lIIIlIIIlIlllIllIIIlIIIlI[n2] = this.lIIlIlIIllIIIlIIlIlIIIlII[n2 * 16 + n3];
            }
        }
        if (n9 != 0) {
            ++this.IIIlIlIllIlllllIlIllllllI;
        } else if (this.IIIlIlIllIlllllIlIllllllI != 0) {
            ++this.IIIlIlIllIlllllIlIllllllI;
        }
        if (bl || Math.abs(n9) >= this.llIIIIIlIIlIIIIllIIIlIIII || this.IIIlIlIllIlllllIlIllllllI > this.lIlIlIIllIIIlllIllIIlIllI) {
            this.IlIlIllIIlIIIIlllIlIllIlI = n6;
            bl3 = true;
            this.IIIlIlIllIlllllIlIllllllI = 0;
        }
        if (n7 > 32 * n10 || n7 < -32 * n10 || n8 > 32 * n10 || n8 < -32 * n10) {
            bl = true;
        }
        n3 = 0;
        n2 = 0;
        boolean bl6 = false;
        if (this.lllIIIllIIIIlllIlIIllIIll.lIIIIlIlIIlllllIIllIIlIII.lIIllllllllIlIllllllllIlI != -1) {
            n2 = this.IlIllllllIIlIIllllIIlIIIl.llIIlIlIlllIIllIlIlllIllI.booleanValue() && this.IlIllllllIIlIIllllIIlIIIl.lIllllIIlIIIlIllllllIIIll && this.IIllIllIIllIIlllIIIlIlllI.lIlllIlllIIIIlIIlllIllIII(this.IlIIIlIIIIllIIIllIIIIIIll, this.IIlllIlIlllIllIIIlllIIlIl).lllIIIllIIIIlllIlIIllIIll(class_1346.lllIIIllIIIIlllIlIIllIIll, this.IlIIIlIIIIllIIIllIIIIIIll & 0xF, Math.max(Math.min(class_0006.lIllllIIlIIIlIllllllIIIll(), 255), 0), this.IIlllIlIlllIllIIIlllIIlIl & 0xF) <= 0 ? 1 : 0;
        } else {
            n3 = 1;
            bl6 = this.IIllIllIIllIIlllIIIlIlllI.lIllllIIlIIIlIllllllIIIll(this.IlIIIlIIIIllIIIllIIIIIIll, this.IIlllIlIlllIllIIIlllIIlIl) < class_0006.lIllllIIlIIIlIllllllIIIll();
        }
        if (this.lIIlIlllIllIlIlllIIIIIIII != (n2 != 0 || n3 != 0 && (n6 <= 125 || !bl6 && this.IlIllllllIIlIIllllIIlIIIl.lIllllIIlIIIlIllllllIIIll))) {
            this.lIIlIlllIllIlIlllIIIIIIII = n2 != 0 || n3 != 0 && (n6 <= 125 || !bl6 && this.IlIllllllIIlIIllllIIlIIIl.lIllllIIlIIIlIllllllIIIll);
            bl = true;
        }
        bl2 = bl3 && (n3 != 0 || n2 != 0);
        int n12 = -1;
        Object object = this.lIIIIllIIllIIIlIIIllIllII;
        synchronized (object) {
            if (!bl) {
                this.llIIlIIllIIllIlIIllIIllII[this.IlIlllIIIIIIlIIllIIllIlll].lllIlIIlIIIlIlIIIllIlllIl(n8);
                this.llIIlIIllIIllIlIIllIIllII[this.IlIlllIIIIIIlIIllIIllIlll].lllIIIllIIIIlllIlIIllIIll(n7);
            }
            this.IlIIIlIIIIllIIIllIIIIIIll = n4;
            this.IIlllIlIlllIllIIIlllIIlIl = n5;
        }
        n4 -= 16 * n10;
        n5 -= 16 * n10;
        if (!bl) {
            int n13;
            this.IIIIlIIlIIIllIIIIllIIIlII[this.IlIlllIIIIIIlIIllIIllIlll].lllIlIIlIIIlIlIIIllIlllIl(n8);
            this.IIIIlIIlIIIllIIIIllIIIlII[this.IlIlllIIIIIIlIIllIIllIlll].lllIIIllIIIIlllIlIIllIIll(n7);
            for (n13 = n8 > 0 ? 32 * n10 - 1 : -n8 - 1; n13 >= (n8 > 0 ? 32 * n10 - n8 : 0); --n13) {
                for (n = 0; n < 32 * n10; ++n) {
                    n12 = this.lllIIIllIIIIlllIlIIllIIll(true, true, true, true, n3 != 0, bl6, n2 != 0, this.IIllIllIIllIIlllIIIlIlllI, n10, n4, n5, n, n13);
                    this.llIIlIIllIIllIlIIllIIllII[this.IlIlllIIIIIIlIIllIIllIlll].setRGB(n, n13, n12);
                }
            }
            for (n13 = 32 * n10 - 1; n13 >= 0; --n13) {
                for (n = n7 > 0 ? 32 * n10 - n7 : 0; n < (n7 > 0 ? 32 * n10 : -n7); ++n) {
                    n12 = this.lllIIIllIIIIlllIlIIllIIll(true, true, true, true, n3 != 0, bl6, n2 != 0, this.IIllIllIIllIIlllIIIlIlllI, n10, n4, n5, n, n13);
                    this.llIIlIIllIIllIlIIllIIllII[this.IlIlllIIIIIIlIIllIIllIlll].setRGB(n, n13, n12);
                }
            }
        }
        if (bl || this.IlIllllllIIlIIllllIIlIIIl.IllIIlllllllIIlIIlIIIIlIl && bl3 || bl2 || this.IlIllllllIIlIIllllIIlIIIl.IIIllIIlIIIIIIlIlIIllIIlI && bl4 || bl5) {
            for (int i = 32 * n10 - 1; i >= 0; --i) {
                for (n = 0; n < 32 * n10; ++n) {
                    n12 = this.lllIIIllIIIIlllIlIIllIIll(bl, bl || bl2, bl, bl || bl4 || bl2, n3 != 0, bl6, n2 != 0, this.IIllIllIIllIIlllIIIlIlllI, n10, n4, n5, n, i);
                    this.llIIlIIllIIllIlIIllIIllII[this.IlIlllIIIIIIlIIllIIllIlll].setRGB(n, i, n12);
                }
            }
        }
        if ((bl || n7 != 0 || n8 != 0 || !this.lIlllIIllIIIIIIlIlIIlIllI) && this.llIIllIllIlIIlIIllIllllll && this.IlIllllllIIlIIllllIIlIIIl.lllIIlIIIllllllIIIIlIlIlI > 0) {
            this.IIIIlIIlIIIllIIIIllIIIlII[this.IlIlllIIIIIIlIIllIIllIlll].lllIIIllIIIIlllIlIIllIIll();
            this.IIIIlIIlIIIllIIIIllIIIlII[this.IlIlllIIIIIIlIIllIIllIlll].lllIlIIlIIIlIlIIIllIlllIl();
        }
        this.lIlllIIllIIIIIIlIlIIlIllI = this.llIIllIllIlIIlIIllIllllll;
        if (bl || n7 != 0 || n8 != 0 || bl3 || bl4 || bl5) {
            this.IllllIIIIlIIlIIIIlllIIIIl = true;
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0723 class_07232) {
        this.llIIIIllIIIIIIIlIIIlIIIIl.lllIIIllIIIIlllIlIIllIIll().lllIIIllIIIIlllIlIIllIIll(class_07232);
        this.lllIIIllIIIIlllIlIIllIIll(class_07232.IIIllIIlIIIIIIlIlIIllIIlI * 16, class_07232.IllIIlllllllIIlIIlIIIIlIl * 16, class_07232.IIIllIIlIIIIIIlIlIIllIIlI * 16 + 15, class_07232.IllIIlllllllIIlIIlIIIIlIl * 16 + 15);
    }

    private void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4) {
        boolean bl = false;
        boolean bl2 = false;
        boolean bl3 = false;
        if (this.lllIIIllIIIIlllIlIIllIIll.lIIIIlIlIIlllllIIllIIlIII.lIIllllllllIlIllllllllIlI != -1) {
            bl2 = this.IlIllllllIIlIIllllIIlIIIl.llIIlIlIlllIIllIlIlllIllI.booleanValue() && this.IlIllllllIIlIIllllIIlIIIl.lIllllIIlIIIlIllllllIIIll && this.IIllIllIIllIIlllIIIlIlllI.lIlllIlllIIIIlIIlllIllIII(this.IlIIIlIIIIllIIIllIIIIIIll, this.IIlllIlIlllIllIIIlllIIlIl).lllIIIllIIIIlllIlIIllIIll(class_1346.lllIIIllIIIIlllIlIIllIIll, this.IlIIIlIIIIllIIIllIIIIIIll & 0xF, Math.max(Math.min(class_0006.lIllllIIlIIIlIllllllIIIll(), 255), 0), this.IIlllIlIlllIllIIIlllIIlIl & 0xF) <= 0;
        } else {
            bl = true;
            bl3 = this.IIllIllIIllIIlllIIIlIlllI.lIllllIIlIIIlIllllllIIIll(this.IlIIIlIIIIllIIIllIIIIIIll, this.IIlllIlIlllIllIIIlllIIlIl) < class_0006.lIllllIIlIIIlIllllllIIIll();
        }
        int n5 = this.IlIIIlIIIIllIIIllIIIIIIll;
        int n6 = this.IIlllIlIlllIllIIIlllIIlIl;
        int n7 = (int)Math.pow(2.0, this.IlIlllIIIIIIlIIllIIllIlll);
        n = n - (n5 -= 16 * n7) - 1;
        n3 = n3 - n5 + 1;
        n2 = n2 - (n6 -= 16 * n7) - 1;
        n4 = n4 - n6 + 1;
        n = Math.max(0, n);
        n3 = Math.min(32 * n7 - 1, n3);
        n2 = Math.max(0, n2);
        n4 = Math.min(32 * n7 - 1, n4);
        int n8 = 0;
        for (int i = n4; i >= n2; --i) {
            for (int j = n; j <= n3; ++j) {
                n8 = this.lllIIIllIIIIlllIlIIllIIll(true, true, true, true, bl, bl3, bl2, this.IIllIllIIllIIlllIIIlIlllI, n7, n5, n6, j, i);
                this.llIIlIIllIIllIlIIllIIllII[this.IlIlllIIIIIIlIIllIIllIlll].setRGB(j, i, n8);
            }
        }
        this.IllllIIIIlIIlIIIIlllIIIIl = true;
    }

    private int lllIIIllIIIIlllIlIIllIIll(boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6, boolean bl7, class_1334 class_13342, int n, int n2, int n3, int n4, int n5) {
        int n6;
        int n7;
        int n8;
        Object object;
        int n9 = 0;
        int n10 = 0;
        if (bl) {
            n10 = class_13342.lIlllIlllIIIIlIIlllIllIII((int)(n2 + n4), (int)(n3 + n5)).lIlllIlllIIIIlIIlllIllIII ? class_13342.a_((int)(n2 + n4), (int)(n3 + n5)).lIlIllIIllIIIIlllIlIlllIl : -1;
            this.IIIIlIIlIIIllIIIIllIIIlII[this.IlIlllIIIIIIlIIllIIllIlll].lllllIlllIIllIlIIlIIIllII(n4, n5, n10);
        } else {
            n10 = this.IIIIlIIlIIIllIIIIllIIIlII[this.IlIlllIIIIIIlIIllIIllIlll].IlIlIIlIlIllIIlIlIIllIIIl(n4, n5);
        }
        if (this.IlIllllllIIlIIllllIIlIIIl.lllIIlIIIllllllIIIIlIlIlI == 1) {
            n9 = n10 >= 0 ? class_0672.lllIIlIIIllllllIIIIlIlIlI()[n10].llllIIllIlIlllllllIIlIIlI | 0xFF000000 : 0;
            if (this.IlIllllllIIlIIllllIIlIIIl.IlIlllIIIIIIlIIllIIllIlll && ((n2 + n4) % 16 == 0 || (n3 + n5) % 16 == 0)) {
                n9 = this.lIllllIIlIIIlIllllllIIIll.IlIllllllIIlIIllllIIlIIIl(0x7D000000, n9);
            }
            return n9;
        }
        int n11 = 0;
        boolean bl8 = false;
        boolean bl9 = false;
        if (bl2) {
            n11 = this.lllIIIllIIIIlllIlIIllIIll(bl5, bl6, bl7, class_13342, n2 + n4, n3 + n5, class_0006.lIllllIIlIIIlIllllllIIIll());
            this.IIIIlIIlIIIllIIIIllIIIlII[this.IlIlllIIIIIIlIIllIIllIlll].lllIlIIlIIIlIlIIIllIlllIl(n4, n5, n11);
        } else {
            n11 = this.IIIIlIIlIIIllIIIIllIIIlII[this.IlIlllIIIIIIlIIllIIllIlll].lllIIIllIIIIlllIlIIllIIll(n4, n5);
        }
        if (n11 == -1) {
            n11 = this.IlIlIllIIlIIIIlllIlIllIlI + 1;
            bl9 = true;
        }
        int n12 = -1;
        int n13 = 0;
        if (bl2) {
            Block class_05492 = class_13342.a_(n2 + n4, n11, n3 + n5);
            if (class_05492.lIllllIIlIIIlIllllllIIIll() == class_1855.llIllllIlIllIIIlIllIIlIlI) {
                n12 = Block.blockRegistry.IlIllllllIIlIIllllIIlIIIl(class_05492);
                n13 = class_13342.IlIllllllIIlIIllllIIlIIIl(n2 + n4, n11, n3 + n5);
            } else {
                object = class_13342.a_(n2 + n4, n11 - 1, n3 + n5);
                n12 = Block.blockRegistry.IlIllllllIIlIIllllIIlIIIl(object);
                n13 = class_13342.IlIllllllIIlIIllllIIlIIIl(n2 + n4, n11 - 1, n3 + n5);
            }
            if (this.IlIllllllIIlIIllllIIlIIIl.llIIllIllIlIIlIIllIllllll && n12 != this.IIIIlIIlIIIllIIIIllIIIlII[this.IlIlllIIIIIIlIIllIIllIlll].lllIlIIlIIIlIlIIIllIlllIl(n4, n5)) {
                bl8 = true;
            }
            this.IIIIlIIlIIIllIIIIllIIIlII[this.IlIlllIIIIIIlIIllIIllIlll].IlIllllllIIlIIllllIIlIIIl(n4, n5, n12);
            this.IIIIlIIlIIIllIIIIllIIIlII[this.IlIlllIIIIIIlIIllIIllIlll].lIlllIlllIIIIlIIlllIllIII(n4, n5, n13);
        } else {
            n12 = this.IIIIlIIlIIIllIIIIllIIIlII[this.IlIlllIIIIIIlIIllIIllIlll].lllIlIIlIIIlIlIIIllIlllIl(n4, n5);
            n13 = this.IIIIlIIlIIIllIIIIllIIIlII[this.IlIlllIIIIIIlIIllIIllIlll].IlIllllllIIlIIllllIIlIIIl(n4, n5);
        }
        if (n12 == class_1498.lIlllIlllIIIIlIIlllIllIII) {
            bl9 = false;
        }
        if ((n9 = this.IlIllllllIIlIIllllIIlIIIl.llIIllIllIlIIlIIllIllllll ? this.lIllllIIlIIIlIllllllIIIll.lllIlIIlIIIlIlIIIllIlllIl(n12, n13, n10) : this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(n12, n13, n10)) == -65025) {
            n9 = 0;
        }
        if (this.IlIllllllIIlIIllllIIlIIIl.llIIllIllIlIIlIIllIllllll && n12 != -1) {
            int n14 = -1;
            if (bl3 || bl8) {
                n14 = this.lllIIIllIIIIlllIlIIllIIll(n12, n13, n2 + n4, n11 - 1, n3 + n5);
                this.IIIIlIIlIIIllIIIIllIIIlII[this.IlIlllIIIIIIlIIllIIllIlll].IlIIIIIllllllIIlllIllllll(n4, n5, n14);
            } else {
                n14 = this.IIIIlIIlIIIllIIIIllIIIlII[this.IlIlllIIIIIIlIIllIIllIlll].lIlllIlllIIIIlIIlllIllIII(n4, n5);
            }
            if (n14 != -1) {
                n9 = this.lIllllIIlIIIlIllllllIIIll.lllIlIIlIIIlIlIIIllIlllIl(n9, n14);
            }
        }
        n9 = this.lllIIIllIIIIlllIlIIllIIll(n9, bl5, bl6, bl7, class_13342, n, n2, n3, n4, n5, n11, bl9, 1);
        int n15 = n8 = bl9 ? 0 : 255;
        if (bl4) {
            n8 = this.lllIIIllIIIIlllIlIIllIIll(n9, n12, class_13342, n2 + n4, n3 + n5, n11, bl9);
            this.IIIIlIIlIIIllIIIIllIIIlII[this.IlIlllIIIIIIlIIllIIllIlll].lIllllIIlIIIlIllllllIIIll(n4, n5, n8);
        } else {
            n8 = this.IIIIlIIlIIIllIIIIllIIIlII[this.IlIlllIIIIIIlIIllIIllIlll].IlIIIIIllllllIIlllIllllll(n4, n5);
        }
        if (n8 == 0) {
            n9 = 0;
        } else if (n8 != 255) {
            n9 = this.lIllllIIlIIIlIllllllIIIll.lllIlIIlIIIlIlIIIllIlllIl(n9, n8);
        }
        if (this.IlIllllllIIlIIllllIIlIIIl.lIIIIlIlIIlllllIIllIIlIII && ((object = ((Block) Block.blockRegistry.lllIIIllIIIIlllIlIIllIIll(n12)).lIllllIIlIIIlIllllllIIIll()) == class_1855.IllIIlllllllIIlIIlIIIIlIl || object == class_1855.lIlIllIIlIIlIIlIIlIIlIIll)) {
            int n16;
            if (bl2) {
                n16 = this.lllIIIllIIIIlllIlIIllIIll(class_13342, n2 + n4, n3 + n5, n11);
                this.IIIIlIIlIIIllIIIIllIIIlII[this.IlIlllIIIIIIlIIllIIllIlll].IIIllIIlIIIIIIlIlIIllIIlI(n4, n5, n16);
            } else {
                n16 = this.IIIIlIIlIIIllIIIIllIIIlII[this.IlIlllIIIIIIlIIllIIllIlll].lIllllIIlIIIlIllllllIIIll(n4, n5);
            }
            n7 = 0;
            if (bl2) {
                Block class_05493 = class_13342.a_(n2 + n4, n16 - 1, n3 + n5);
                n12 = Block.blockRegistry.IlIllllllIIlIIllllIIlIIIl(class_05493);
                n13 = class_13342.IlIllllllIIlIIllllIIlIIIl(n2 + n4, n16 - 1, n3 + n5);
                if (class_05493.lIllllIIlIIIlIllllllIIIll() == class_1855.IllIIlllllllIIlIIlIIIIlIl) {
                    n12 = class_1498.lllIIIllIIIIlllIlIIllIIll;
                    n13 = 0;
                }
                if (this.IlIllllllIIlIIllllIIlIIIl.llIIllIllIlIIlIIllIllllll && n12 != this.IIIIlIIlIIIllIIIIllIIIlII[this.IlIlllIIIIIIlIIllIIllIlll].IIIllIIlIIIIIIlIlIIllIIlI(n4, n5)) {
                    bl8 = true;
                }
                this.IIIIlIIlIIIllIIIIllIIIlII[this.IlIlllIIIIIIlIIllIIllIlll].IllIIlllllllIIlIIlIIIIlIl(n4, n5, n12);
                this.IIIIlIIlIIIllIIIIllIIIlII[this.IlIlllIIIIIIlIIllIIllIlll].IIIllIllIIlIlIlIlIllllIIl(n4, n5, n13);
            } else {
                n12 = this.IIIIlIIlIIIllIIIIllIIIlII[this.IlIlllIIIIIIlIIllIIllIlll].IIIllIIlIIIIIIlIlIIllIIlI(n4, n5);
                n13 = this.IIIIlIIlIIIllIIIIllIIIlII[this.IlIlllIIIIIIlIIllIIllIlll].IllIIlllllllIIlIIlIIIIlIl(n4, n5);
            }
            n7 = this.IlIllllllIIlIIllllIIlIIIl.llIIllIllIlIIlIIllIllllll ? this.lIllllIIlIIIlIllllllIIIll.lllIlIIlIIIlIlIIIllIlllIl(n12, n13, n10) : this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(n12, n13, n10);
            if (this.IlIllllllIIlIIllllIIlIIIl.llIIllIllIlIIlIIllIllllll && n12 != -1) {
                int n17 = -1;
                if (bl3 || bl8) {
                    n17 = this.lllIIIllIIIIlllIlIIllIIll(n12, n13, n2 + n4, n16 - 1, n3 + n5);
                    this.IIIIlIIlIIIllIIIIllIIIlII[this.IlIlllIIIIIIlIIllIIllIlll].IllIIIllIIIIlIlIlIllIIlll(n4, n5, n17);
                } else {
                    n17 = this.IIIIlIIlIIIllIIIIllIIIlII[this.IlIlllIIIIIIlIIllIIllIlll].IIIllIllIIlIlIlIlIllllIIl(n4, n5);
                }
                if (n17 != -1) {
                    n7 = this.lIllllIIlIIIlIllllllIIIll.lllIlIIlIIIlIlIIIllIlllIl(n7, n17);
                }
            }
            n7 = this.lllIIIllIIIIlllIlIIllIIll(n7, bl5, bl6, bl7, class_13342, n, n2, n3, n4, n5, n16, bl9, 0);
            n6 = 255;
            if (bl4) {
                n6 = this.lllIIIllIIIIlllIlIIllIIll(n7, n12, class_13342, n2 + n4, n3 + n5, n16, bl9);
                if (this.IlIllllllIIlIIllllIIlIIIl.IIIllIIlIIIIIIlIlIIllIIlI && object == class_1855.lIlIllIIlIIlIIlIIlIIlIIll && (n16 == n11 - 1 || class_13342.a_(n2 + n4, n16, n3 + n5).lIllllIIlIIIlIllllllIIIll() == class_1855.lIlIllIIlIIlIIlIIlIIlIIll)) {
                    n6 = this.lIllllIIlIIIlIllllllIIIll.lllIlIIlIIIlIlIIIllIlllIl(n6, 0x555555);
                }
                this.IIIIlIIlIIIllIIIIllIIIlII[this.IlIlllIIIIIIlIIllIIllIlll].lIIIIlIlIIlllllIIllIIlIII(n4, n5, n6);
            } else {
                n6 = this.IIIIlIIlIIIllIIIIllIIIlII[this.IlIlllIIIIIIlIIllIIllIlll].IllIIIllIIIIlIlIlIllIIlll(n4, n5);
            }
            if (n6 == 0) {
                n7 = 0;
            } else if (n6 != 255) {
                n7 = this.lIllllIIlIIIlIllllllIIIll.lllIlIIlIIIlIlIIIllIlllIl(n7, n6);
            }
            n9 = this.lIllllIIlIIIlIllllllIIIll.IlIllllllIIlIIllllIIlIIIl(n9, n7);
        }
        if (this.IlIllllllIIlIIllllIIlIIIl.llIIlllIllIllllIIIlIIIIII) {
            int n18 = -1;
            if (bl2) {
                n18 = this.lllIlIIlIIIlIlIIIllIlllIl(bl5, bl6, bl7, class_13342, n2 + n4, n3 + n5, n11);
                this.IIIIlIIlIIIllIIIIllIIIlII[this.IlIlllIIIIIIlIIllIIllIlll].llIIlllIllIllllIIIlIIIIII(n4, n5, n18);
            } else {
                n18 = this.IIIIlIIlIIIllIIIIllIIIlII[this.IlIlllIIIIIIlIIllIIllIlll].lIIIIlIlIIlllllIIllIIlIII(n4, n5);
            }
            if (bl2) {
                if (n18 != -1 && n18 > n11) {
                    Block class_05494 = class_13342.a_(n2 + n4, n18 - 1, n3 + n5);
                    n12 = Block.blockRegistry.IlIllllllIIlIIllllIIlIIIl(class_05494);
                    n13 = class_13342.IlIllllllIIlIIllllIIlIIIl(n2 + n4, n18 - 1, n3 + n5);
                } else {
                    n12 = 0;
                    n13 = 0;
                }
                if (this.IlIllllllIIlIIllllIIlIIIl.llIIllIllIlIIlIIllIllllll && n12 != this.IIIIlIIlIIIllIIIIllIIIlII[this.IlIlllIIIIIIlIIllIIllIlll].llIIlllIllIllllIIIlIIIIII(n4, n5)) {
                    bl8 = true;
                }
                this.IIIIlIIlIIIllIIIIllIIIlII[this.IlIlllIIIIIIlIIllIIllIlll].llIIllIllIlIIlIIllIllllll(n4, n5, n12);
                this.IIIIlIIlIIIllIIIIllIIIlII[this.IlIlllIIIIIIlIIllIIllIlll].lllIIlIIIllllllIIIIlIlIlI(n4, n5, n13);
            } else {
                n12 = this.IIIIlIIlIIIllIIIIllIIIlII[this.IlIlllIIIIIIlIIllIIllIlll].llIIlllIllIllllIIIlIIIIII(n4, n5);
                n13 = this.IIIIlIIlIIIllIIIIllIIIlII[this.IlIlllIIIIIIlIIllIIllIlll].llIIllIllIlIIlIIllIllllll(n4, n5);
            }
            if (n12 != 0) {
                int n19 = 0;
                n19 = this.IlIllllllIIlIIllllIIlIIIl.llIIllIllIlIIlIIllIllllll ? this.lIllllIIlIIIlIllllllIIIll.lllIlIIlIIIlIlIIIllIlllIl(n12, n13, n10) : this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(n12, n13, n10);
                if (this.IlIllllllIIlIIllllIIlIIIl.llIIllIllIlIIlIIllIllllll) {
                    n7 = -1;
                    if (bl3 || bl8) {
                        n7 = this.lllIIIllIIIIlllIlIIllIIll(n12, n13, n2 + n4, n11, n3 + n5);
                        this.IIIIlIIlIIIllIIIIllIIIlII[this.IlIlllIIIIIIlIIllIIllIlll].IlIlllIIIIIIlIIllIIllIlll(n4, n5, n7);
                    } else {
                        n7 = this.IIIIlIIlIIIllIIIIllIIIlII[this.IlIlllIIIIIIlIIllIIllIlll].lllIIlIIIllllllIIIIlIlIlI(n4, n5);
                    }
                    if (n7 != -1) {
                        n19 = this.lIllllIIlIIIlIllllllIIIll.lllIlIIlIIIlIlIIIllIlllIl(n19, n7);
                    }
                }
                n19 = this.lllIIIllIIIIlllIlIIllIIll(n19, bl5, bl6, bl7, class_13342, n, n2, n3, n4, n5, n18, bl9, 2);
                n7 = 255;
                if (bl4) {
                    n7 = this.lllIIIllIIIIlllIlIIllIIll(n19, n12, class_13342, n2 + n4, n3 + n5, n18, bl9);
                    this.IIIIlIIlIIIllIIIIllIIIlII[this.IlIlllIIIIIIlIIllIIllIlll].IlIlIIlIlIllIIlIlIIllIIIl(n4, n5, n7);
                } else {
                    n7 = this.IIIIlIIlIIIllIIIIllIIIlII[this.IlIlllIIIIIIlIIllIIllIlll].IlIlllIIIIIIlIIllIIllIlll(n4, n5);
                }
                if (n7 == 0) {
                    n19 = 0;
                } else if (n7 != 255) {
                    n19 = this.lIllllIIlIIIlIllllllIIIll.lllIlIIlIIIlIlIIIllIlllIl(n19, n7);
                }
                n9 = this.lIllllIIlIIIlIllllllIIIll.IlIllllllIIlIIllllIIlIIIl(n19, n9);
            }
        }
        if (this.IlIllllllIIlIIllllIIlIIIl.lllIIlIIIllllllIIIIlIlIlI == 2) {
            int n20 = 0;
            if (n10 >= 0) {
                n20 = class_0672.lllIIlIIIllllllIIIIlIlIlI()[n10].llllIIllIlIlllllllIIlIIlI;
            }
            int n21 = n20 >> 16 & 0xFF;
            n7 = n20 >> 8 & 0xFF;
            n6 = n20 >> 0 & 0xFF;
            n20 = 0x7F000000 | (n21 & 0xFF) << 16 | (n7 & 0xFF) << 8 | n6 & 0xFF;
            n9 = this.lIllllIIlIIIlIllllllIIIll.IlIllllllIIlIIllllIIlIIIl(n20, n9);
        }
        if (this.IlIllllllIIlIIllllIIlIIIl.IlIlllIIIIIIlIIllIIllIlll && ((n2 + n4) % 16 == 0 || (n3 + n5) % 16 == 0)) {
            n9 = this.lIllllIIlIIIlIllllllIIIll.IlIllllllIIlIIllllIIlIIIl(0x7D000000, n9);
        }
        return n9;
    }

    private int lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4, int n5) {
        int n6;
        block7: {
            n6 = -1;
            if (this.lIllllIIlIIIlIllllllIIIll.lIlllIlllIIIIlIIlllIllIII()) {
                try {
                    Integer[] arrinteger = (Integer[])this.lIllllIIlIIIlIllllllIIIll.IlIIIIIllllllIIlllIllllll().get(n + " " + n2);
                    if (arrinteger != null) {
                        int n7 = 0;
                        int n8 = 0;
                        int n9 = 0;
                        for (int i = -1; i <= 1; ++i) {
                            for (int j = -1; j <= 1; ++j) {
                                int n10 = arrinteger[this.IIllIllIIllIIlllIIIlIlllI.a_((int)(n3 + j), (int)(n5 + i)).lIlIllIIllIIIIlllIlIlllIl];
                                n7 += (n10 & 0xFF0000) >> 16;
                                n8 += (n10 & 0xFF00) >> 8;
                                n9 += n10 & 0xFF;
                            }
                        }
                        n6 = 0xFF000000 | (n7 / 9 & 0xFF) << 16 | (n8 / 9 & 0xFF) << 8 | n9 / 9 & 0xFF;
                        break block7;
                    }
                    n6 = this.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3, n4, n5);
                }
                catch (Exception exception) {
                    n6 = this.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3, n4, n5);
                }
            } else {
                n6 = this.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3, n4, n5);
            }
        }
        return n6;
    }

    private int lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, int n3, int n4, int n5) {
        int n6 = -1;
        if (n == class_1498.IIIllIIlIIIIIIlIlIIllIIlI || n == class_1498.IllIIlllllllIIlIIlIIIIlIl || n == class_1498.llIIllIllIlIIlIIllIllllll || n == class_1498.IIIllIllIIlIlIlIlIllllIIl || n == class_1498.lIIIIlIlIIlllllIIllIIlIII || n == class_1498.lllIIlIIIllllllIIIIlIlIlI || n == class_1498.lllIlIIlIIIlIlIIIllIlllIl || n == class_1498.IlIllllllIIlIIllllIIlIIIl || this.lIllllIIlIIIlIllllllIIIll.IlIllllllIIlIIllllIIlIIIl().contains(n)) {
            n6 = ((Block) Block.blockRegistry.lllIIIllIIIIlllIlIIllIIll(n)).lIlllIlllIIIIlIIlllIllIII((class_1843)this.IIllIllIIllIIlllIIIlIlllI, n3, n4, n5) | 0xFF000000;
        }
        return n6;
    }

    private final int lllIIIllIIIIlllIlIIllIIll(boolean bl, boolean bl2, boolean bl3, class_1334 class_13342, int n, int n2, int n3) {
        int n4 = class_13342.lIllllIIlIIIlIllllllIIIll(n, n2);
        if (!bl && !bl3 || n4 < n3 || bl && n3 > 125 && (!this.IlIllllllIIlIIllllIIlIIIl.lIllllIIlIIIlIllllllIIIll || bl2)) {
            Block class_05492;
            int n5 = class_13342.IllIIlllllllIIlIIlIIIIlIl(n, n2);
            if (n5 != n4 && (class_05492 = class_13342.a_(n, n5 - 1, n2)).lIllllIIlIIIlIllllllIIIll() == class_1855.IIIllIllIIlIlIlIlIllllIIl) {
                n4 = n5;
            }
            for (int i = (n4 >> 4) * 16 + 15; i < this.llllllIlIllllIlIlIlIIIIlI; i += 16) {
                Block class_05493 = class_13342.a_(n, i, n2);
                if (class_05493.lllIlIIlIIIlIlIIIllIlllIl() <= 0) continue;
                n4 = i + 1;
            }
            return n4;
        }
        int n6 = this.IlIlIllIIlIIIIlllIlIllIlI;
        Block class_05494 = class_13342.a_(n, n6, n2);
        if (class_05494.lllIlIIlIIIlIlIIIllIlllIl() == 0 && class_05494.lIllllIIlIIIlIllllllIIIll() != class_1855.IIIllIllIIlIlIlIlIllllIIl) {
            while (n6 > 0) {
                if ((class_05494 = class_13342.a_(n, --n6, n2)).lllIlIIlIIIlIlIIIllIlllIl() <= 0 && class_05494.lIllllIIlIIIlIllllllIIIll() != class_1855.IIIllIllIIlIlIlIlIllllIIl) continue;
                return n6 + 1;
            }
            return n6;
        }
        while (n6 <= n3 + 10) {
            if (n6 >= (bl && n3 < 126 ? 127 : 255) || (class_05494 = class_13342.a_(n, ++n6, n2)).lllIlIIlIIIlIlIIIllIlllIl() != 0 || class_05494.lIllllIIlIIIlIllllllIIIll() == class_1855.IIIllIllIIlIlIlIlIllllIIl) continue;
            return n6;
        }
        return -1;
    }

    private final int lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3) {
        int n4 = n3;
        Block class_05492 = class_13342.a_(n, n4 - 1, n2);
        while (class_05492.lllIlIIlIIIlIlIIIllIlllIl() < 5 && class_05492.lIllllIIlIIIlIllllllIIIll() != class_1855.IllIIIllIIIIlIlIlIllIIlll && n4 > 1) {
            class_05492 = class_13342.a_(n, --n4 - 1, n2);
        }
        return n4;
    }

    private final int lllIlIIlIIIlIlIIIllIlllIl(boolean bl, boolean bl2, boolean bl3, class_1334 class_13342, int n, int n2, int n3) {
        int n4;
        int n5 = -1;
        n5 = (bl3 || bl) && (!bl || n3 <= 125 || this.IlIllllllIIlIIllllIIlIIIl.lIllllIIlIIIlIllllllIIIll && !bl2) ? n3 + 1 : ((n4 = class_13342.IllIIlllllllIIlIIlIIIIlIl(n, n2)) <= n3 ? n3 + 1 : n4);
        class_1855 class_18552 = class_13342.a_(n, n5 - 1, n2).lIllllIIlIIIlIllllllIIIll();
        if (class_18552 == class_1855.llIllllIlIllIIIlIllIIlIlI || class_18552 == class_1855.lllIIIllIIIIlllIlIIllIIll) {
            n5 = -1;
        }
        return n5;
    }

    private int lllIIIllIIIIlllIlIIllIIll(int n, boolean bl, boolean bl2, boolean bl3, class_1334 class_13342, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl4, int n8) {
        if (n != this.lIllllIIlIIIlIllllllIIIll.lllIlIIlIIIlIlIIIllIlllIl() && n != 0) {
            int n9 = 0;
            if ((this.IlIllllllIIlIIllllIIlIIIl.IllIIlllllllIIlIIlIIIIlIl || this.IlIllllllIIlIIllllIIlIIIl.IIIllIllIIlIlIlIlIllllIIl) && !bl4) {
                int n10 = 0;
                double d = 0.0;
                if (this.IlIllllllIIlIIllllIIlIIIl.IIIllIllIIlIlIlIlIllllIIl) {
                    if (n5 > 0 && n6 < 32 * n2 - 1) {
                        Block class_05492;
                        if (n8 == 0) {
                            n9 = this.IIIIlIIlIIIllIIIIllIIIlII[this.IlIlllIIIIIIlIIllIIllIlll].lIllllIIlIIIlIllllllIIIll(n5 - 1, n6 + 1);
                        }
                        if (n8 == 1) {
                            n9 = this.IIIIlIIlIIIllIIIIllIIIlII[this.IlIlllIIIIIIlIIllIIllIlll].lllIIIllIIIIlllIlIIllIIll(n5 - 1, n6 + 1);
                        }
                        if (n8 == 2 && (n9 = this.IIIIlIIlIIIllIIIIllIIIlII[this.IlIlllIIIIIIlIIllIIllIlll].lIIIIlIlIIlllllIIllIIlIII(n5 - 1, n6 + 1)) == -1 && ((class_05492 = Block.lllIIIllIIIIlllIlIIllIIll(this.IIIIlIIlIIIllIIIIllIIIlII[this.IlIlllIIIIIIlIIllIIllIlll].llIIlllIllIllllIIIlIIIIII(n5, n6))) instanceof class_0166 || class_05492 instanceof class_2258)) {
                            n9 = this.IIIIlIIlIIIllIIIIllIIIlII[this.IlIlllIIIIIIlIIllIIllIlll].lllIIIllIIIIlllIlIIllIIll(n5 - 1, n6 + 1);
                        }
                    } else {
                        Block class_05493;
                        int n11;
                        if (n8 == 0) {
                            n11 = this.lllIIIllIIIIlllIlIIllIIll(bl, bl2, bl3, class_13342, n3 + n5 - 1, n4 + n6 + 1, this.IlIlIllIIlIIIIlllIlIllIlI);
                            n9 = this.lllIIIllIIIIlllIlIIllIIll(class_13342, n3 + n5 - 1, n4 + n6 + 1, n11);
                        }
                        if (n8 == 1) {
                            n9 = this.lllIIIllIIIIlllIlIIllIIll(bl, bl2, bl3, class_13342, n3 + n5 - 1, n4 + n6 + 1, this.IlIlIllIIlIIIIlllIlIllIlI);
                        }
                        if (n8 == 2 && (n9 = this.lllIlIIlIIIlIlIIIllIlllIl(bl, bl2, bl3, class_13342, n3 + n5 - 1, n4 + n6 + 1, n11 = this.lllIIIllIIIIlllIlIIllIIll(bl, bl2, bl3, class_13342, n3 + n5 - 1, n4 + n6 + 1, this.IlIlIllIIlIIIIlllIlIllIlI))) == -1 && ((class_05493 = class_13342.a_(n3 + n5, n7 - 1, n4 + n6)) instanceof class_0166 || class_05493 instanceof class_2258)) {
                            n9 = n11;
                        }
                    }
                    if (n9 == -1) {
                        n9 = n7;
                    }
                    if ((n10 = n9 - n7) != 0) {
                        d = n10 < 0 ? -1.0 : (n10 > 0 ? 1.0 : 0.0);
                        d /= 8.0;
                    }
                    if (this.IlIllllllIIlIIllllIIlIIIl.IllIIlllllllIIlIIlIIIIlIl) {
                        n10 = n7 - this.IlIlIllIIlIIIIlllIlIllIlI;
                        double d2 = Math.log10((double)Math.abs(n10) / 8.0 + 1.0) / 3.0;
                        d = n10 > 0 ? d + d2 : d - d2;
                    }
                } else if (this.IlIllllllIIlIIllllIIlIIIl.IllIIlllllllIIlIIlIIIIlIl) {
                    n10 = n7 - this.IlIlIllIIlIIIIlllIlIllIlI;
                    d = Math.log10((double)Math.abs(n10) / 8.0 + 1.0) / 1.8;
                    if (n10 < 0) {
                        d = 0.0 - d;
                    }
                }
                int n12 = n >> 24 & 0xFF;
                int n13 = n >> 16 & 0xFF;
                int n14 = n >> 8 & 0xFF;
                int n15 = n >> 0 & 0xFF;
                if (d > 0.0) {
                    n13 = (int)(d * (double)(255 - n13)) + n13;
                    n14 = (int)(d * (double)(255 - n14)) + n14;
                    n15 = (int)(d * (double)(255 - n15)) + n15;
                } else if (d < 0.0) {
                    d = Math.abs(d);
                    n13 -= (int)(d * (double)n13);
                    n14 -= (int)(d * (double)n14);
                    n15 -= (int)(d * (double)n15);
                }
                n = n12 * 0x1000000 + n13 * 65536 + n14 * 256 + n15;
            }
        }
        return n;
    }

    private int lllIIIllIIIIlllIlIIllIIll(int n, int n2, class_1334 class_13342, int n3, int n4, int n5, boolean bl) {
        int n6 = 255;
        if (bl) {
            n6 = 0;
        } else if (!(n == this.lIllllIIlIIIlIllllllIIIll.lllIlIIlIIIlIlIIIllIlllIl() || n == 0 || !this.IlIllllllIIlIIllllIIlIIIl.IIIllIIlIIIIIIlIlIIllIIlI || ((Boolean) LunarClient.getInstance().getSettingsManager().IlIlIIlllIIlIllIIIlllllIl.lIlllIlllIIIIlIIlllIllIII()).booleanValue() && ((Boolean) LunarClient.getInstance().getSettingsManager().lIlIlIIlIIIIlIIIIIlllIIII.lIlllIlllIIIIlIIlllIllIII()).booleanValue())) {
            class_0723 class_07232 = class_13342.lIlllIlllIIIIlIIlllIllIII(n3, n4);
            int n7 = class_07232.lllIIIllIIIIlllIlIIllIIll(class_1346.lllIlIIlIIIlIlIIIllIlllIl, n3 & 0xF, Math.max(Math.min(n5, 255), 0), n4 & 0xF);
            int n8 = class_07232.lllIIIllIIIIlllIlIIllIIll(class_1346.lllIIIllIIIIlllIlIIllIIll, n3 & 0xF, Math.max(Math.min(n5, 255), 0), n4 & 0xF);
            if (n2 == class_1498.lIlllIlllIIIIlIIlllIllIII && n7 < 14) {
                n7 = 14;
            }
            n6 = this.lIIlIlIIllIIIlIIlIlIIIlII[n7 + n8 * 16];
        }
        return n6;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        float f;
        boolean bl = this.lIlIllIIlIIlIIlIIlIIlIIll != n3 || this.IlIllllllIIlIIllllIIlIIIl.IlIlIIlIlIllIIlIlIIllIIIl != this.llIIIlllIlllIlIllIIIIllIl;
        this.lIlIllIIlIIlIIlIIlIIlIIll = n3;
        this.llIIIlllIlllIlIllIIIIllIl = this.IlIllllllIIlIIllllIIlIIIl.IlIlIIlIlIllIIlIlIIllIIIl;
        if (class_2210.IlIIIIIllllllIIlllIllllll) {
            GL11.glColorMask((boolean)false, (boolean)false, (boolean)false, (boolean)true);
            GL11.glBindTexture((int)3553, (int)0);
            GL11.glBlendFunc((int)0, (int)0);
            GL11.glColor3f((float)0.0f, (float)0.0f, (float)255.0f);
            GL11.glBegin((int)7);
            GL11.glVertex2f((float)(n - 47), (float)(n2 + 47));
            GL11.glVertex2f((float)(n + 47), (float)(n2 + 47));
            GL11.glVertex2f((float)(n + 47), (float)(n2 - 47));
            GL11.glVertex2f((float)(n - 47), (float)(n2 - 47));
            GL11.glEnd();
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glColorMask((boolean)true, (boolean)true, (boolean)true, (boolean)true);
            GL11.glBlendFunc((int)770, (int)771);
            class_2210.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("voxelmap/" + (this.IlIllllllIIlIIllllIIlIIIl.IlIlIIlIlIllIIlIlIIllIIIl ? "images/square.png" : "images/circle.png")));
            class_2210.lIlllIlllIIIIlIIlllIllIII();
            class_2210.lllIIIllIIIIlllIlIIllIIll(n, n2);
            class_2210.IlIIIIIllllllIIlllIllllll();
            GL11.glColorMask((boolean)true, (boolean)true, (boolean)true, (boolean)true);
            GL11.glBlendFunc((int)772, (int)773);
            Object object = this.lIIIIllIIllIIIlIIIllIllII;
            synchronized (object) {
                if (this.IllllIIIIlIIlIIIIlllIIIIl) {
                    this.IllllIIIIlIIlIIIIlllIIIIl = false;
                    this.llIIlIIllIIllIlIIllIIllII[this.IlIlllIIIIIIlIIllIIllIlll].lllIlIIlIIIlIlIIIllIlllIl();
                    this.IlIIllIlIlIllIIIlIIlIlIIl = this.IlIIIlIIIIllIIIllIIIIIIll;
                    this.lIlIIllIllIIIIIlIllllIIIl = this.IIlllIlIlllIllIIIlllIIlIl;
                }
            }
            f = 2.0f / (float)Math.pow(2.0, this.IlIlllIIIIIIlIIllIIllIlll);
            this.llIIlIllIllllIlIIIIlIIlll = (float)(class_0006.IIIllIIlIIIIIIlIlIIllIIlI() - (double)this.IlIIllIlIlIllIIIlIIlIlIIl);
            this.llIllllIlIllIIIlIllIIlIlI = (float)(class_0006.IllIIlllllllIIlIIlIIIIlIl() - (double)this.lIlIIllIllIIIIIlIllllIIIl);
            this.llIIlIllIllllIlIIIIlIIlll *= f;
            this.llIllllIlIllIIIlIllIIlIlI *= f;
            if (this.IlIlllIIIIIIlIIllIIllIlll == 3) {
                GL11.glPushMatrix();
                GL11.glScalef((float)0.5f, (float)0.5f, (float)1.0f);
                class_2210.lllIIIllIIIIlllIlIIllIIll(this.llIIlIIllIIllIlIIllIIllII[this.IlIlllIIIIIIlIIllIIllIlll].lllIlIIlIIIlIlIIIllIlllIl);
                GL11.glPopMatrix();
            } else {
                class_2210.lllIIIllIIIIlllIlIIllIIll(this.llIIlIIllIIllIlIIllIIllII[this.IlIlllIIIIIIlIIllIIllIlll].lllIlIIlIIIlIlIIIllIlllIl);
            }
            GL11.glPushMatrix();
            GL11.glTranslatef((float)n, (float)n2, (float)0.0f);
            GL11.glRotatef((float)(this.IlIllllllIIlIIllllIIlIIIl.IlIlIIlIlIllIIlIlIIllIIIl ? (float)this.IIIIlIllIlIIlIIlIllIlIlll : -this.llIIIlIlIlIIlIllIIIllIlIl + (float)this.IIIIlIllIlIIlIIlIllIlIlll), (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)(-n), (float)(-n2), (float)0.0f);
            GL11.glTranslatef((float)(-this.llIIlIllIllllIlIIIIlIIlll), (float)(-this.llIllllIlIllIIIlIllIIlIlI), (float)0.0f);
            if (this.IlIllllllIIlIIllllIIlIIIl.IllIIIllIIIIlIlIlIllIIlll) {
                GL11.glTexParameteri((int)3553, (int)10241, (int)9729);
                GL11.glTexParameteri((int)3553, (int)10240, (int)9729);
            }
        } else if (class_2210.IlIllllllIIlIIllllIIlIIIl) {
            GL11.glBindTexture((int)3553, (int)0);
            GL11.glPushAttrib((int)22528);
            GL11.glViewport((int)0, (int)0, (int)256, (int)256);
            GL11.glMatrixMode((int)5889);
            GL11.glPushMatrix();
            GL11.glLoadIdentity();
            GL11.glOrtho((double)0.0, (double)256.0, (double)256.0, (double)0.0, (double)1000.0, (double)3000.0);
            GL11.glMatrixMode((int)5888);
            GL11.glPushMatrix();
            GL11.glLoadIdentity();
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)-2000.0f);
            class_2210.lllIlIIlIIIlIlIIIllIlllIl();
            GL11.glDepthMask((boolean)false);
            GL11.glDisable((int)2929);
            if (bl) {
                GL11.glClearColor((float)0.0f, (float)0.0f, (float)0.0f, (float)0.0f);
                GL11.glClear((int)16384);
            }
            GL11.glBlendFunc((int)770, (int)0);
            class_2210.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("voxelmap/" + (this.IlIllllllIIlIIllllIIlIIIl.IlIlIIlIlIllIIlIlIIllIIIl ? "images/square.png" : "images/circle.png")));
            class_2210.lIlllIlllIIIIlIIlllIllIII();
            class_2210.lllIIIllIIIIlllIlIIllIIll(0.0, 256.0, 1.0, 0.0, 0.0);
            class_2210.lllIIIllIIIIlllIlIIllIIll(256.0, 256.0, 1.0, 1.0, 0.0);
            class_2210.lllIIIllIIIIlllIlIIllIIll(256.0, 0.0, 1.0, 1.0, 1.0);
            class_2210.lllIIIllIIIIlllIlIIllIIll(0.0, 0.0, 1.0, 0.0, 1.0);
            class_2210.IlIIIIIllllllIIlllIllllll();
            GL14.glBlendFuncSeparate((int)1, (int)0, (int)774, (int)0);
            Object object = this.lIIIIllIIllIIIlIIIllIllII;
            synchronized (object) {
                if (this.IllllIIIIlIIlIIIIlllIIIIl) {
                    this.IllllIIIIlIIlIIIIlllIIIIl = false;
                    this.llIIlIIllIIllIlIIllIIllII[this.IlIlllIIIIIIlIIllIIllIlll].lllIlIIlIIIlIlIIIllIlllIl();
                    this.IlIIllIlIlIllIIIlIIlIlIIl = this.IlIIIlIIIIllIIIllIIIIIIll;
                    this.lIlIIllIllIIIIIlIllllIIIl = this.IIlllIlIlllIllIIIlllIIlIl;
                }
            }
            f = 2.0f / (float)Math.pow(2.0, this.IlIlllIIIIIIlIIllIIllIlll);
            this.llIIlIllIllllIlIIIIlIIlll = (float)(class_0006.IIIllIIlIIIIIIlIlIIllIIlI() - (double)this.IlIIllIlIlIllIIIlIIlIlIIl);
            this.llIllllIlIllIIIlIllIIlIlI = (float)(class_0006.IllIIlllllllIIlIIlIIIIlIl() - (double)this.lIlIIllIllIIIIIlIllllIIIl);
            this.llIIlIllIllllIlIIIIlIIlll *= f;
            this.llIllllIlIllIIIlIllIIlIlI *= f;
            if (this.IlIlllIIIIIIlIIllIIllIlll == 3) {
                GL11.glPushMatrix();
                GL11.glScalef((float)0.5f, (float)0.5f, (float)1.0f);
                class_2210.lllIIIllIIIIlllIlIIllIIll(this.llIIlIIllIIllIlIIllIIllII[this.IlIlllIIIIIIlIIllIIllIlll].lllIlIIlIIIlIlIIIllIlllIl);
                GL11.glPopMatrix();
            } else {
                class_2210.lllIIIllIIIIlllIlIIllIIll(this.llIIlIIllIIllIlIIllIIllII[this.IlIlllIIIIIIlIIllIIllIlll].lllIlIIlIIIlIlIIIllIlllIl);
            }
            if (this.IlIllllllIIlIIllllIIlIIIl.IllIIIllIIIIlIlIlIllIIlll) {
                GL11.glTexParameteri((int)3553, (int)10241, (int)9729);
                GL11.glTexParameteri((int)3553, (int)10240, (int)9729);
            }
            GL11.glTranslatef((float)128.0f, (float)128.0f, (float)0.0f);
            if (this.IlIllllllIIlIIllllIIlIIIl.IlIlIIlIlIllIIlIlIIllIIIl) {
                GL11.glRotatef((float)(-this.IIIIlIllIlIIlIIlIllIlIlll), (float)0.0f, (float)0.0f, (float)1.0f);
            } else {
                GL11.glRotatef((float)(this.llIIIlIlIlIIlIllIIIllIlIl - (float)this.IIIIlIllIlIIlIIlIllIlIlll), (float)0.0f, (float)0.0f, (float)1.0f);
            }
            GL11.glTranslatef((float)-128.0f, (float)-128.0f, (float)0.0f);
            GL11.glTranslatef((float)(-this.llIIlIllIllllIlIIIIlIIlll * 4.0f), (float)(this.llIllllIlIllIIIlIllIIlIlI * 4.0f), (float)0.0f);
            class_2210.lIlllIlllIIIIlIIlllIllIII();
            class_2210.lllIIIllIIIIlllIlIIllIIll(0.0, 256.0, 1.0, 0.0, 0.0);
            class_2210.lllIIIllIIIIlllIlIIllIIll(256.0, 256.0, 1.0, 1.0, 0.0);
            class_2210.lllIIIllIIIIlllIlIIllIIll(256.0, 0.0, 1.0, 1.0, 1.0);
            class_2210.lllIIIllIIIIlllIlIIllIIll(0.0, 0.0, 1.0, 0.0, 1.0);
            class_2210.IlIIIIIllllllIIlllIllllll();
            GL11.glDepthMask((boolean)true);
            GL11.glEnable((int)2929);
            class_2210.IlIllllllIIlIIllllIIlIIIl();
            GL11.glMatrixMode((int)5889);
            GL11.glPopMatrix();
            GL11.glMatrixMode((int)5888);
            GL11.glPopMatrix();
            GL11.glPopAttrib();
            GL11.glPushMatrix();
            GL11.glBlendFunc((int)770, (int)0);
            GL11.glEnable((int)3008);
            class_2210.lllIIIllIIIIlllIlIIllIIll(class_2210.lIlllIlllIIIIlIIlllIllIII);
        } else {
            if (this.IlIllllllIIlIIllllIIlIIIl.IlIlIIlIlIllIIlIlIIllIIIl) {
                if (this.IlIllllllIIlIIllllIIlIIIl.IllIIIllIIIIlIlIlIllIIlll && this.IlIlllIIIIIIlIIllIIllIlll == 0 && this.lIlllIlllIlIIIIlllIlIlIIl != this.llIIlIllIllllIlIIIIlIIlll > 1.0f) {
                    this.lIlllIlllIlIIIIlllIlIlIIl = this.llIIlIllIllllIlIIIIlIIlll > 1.0f;
                    this.IllllIIIIlIIlIIIIlllIIIIl = true;
                }
                if (this.IlIllllllIIlIIllllIIlIIIl.IllIIIllIIIIlIlIlIllIIlll && this.IlIlllIIIIIIlIIllIIllIlll == 0 && this.IlIIlllllIIlIlIlllllIllll != this.llIllllIlIllIIIlIllIIlIlI > 1.0f) {
                    this.IlIIlllllIIlIlIlllllIllll = this.llIllllIlIllIIIlIllIIlIlI > 1.0f;
                    this.IllllIIIIlIIlIIIIlllIIIIl = true;
                }
            }
            if (this.IllllIIIIlIIlIIIIlllIIIIl) {
                this.IllllIIIIlIIlIIIIlllIIIIl = false;
                if (this.IlIllllllIIlIIllllIIlIIIl.IlIlIIlIlIllIIlIlIIllIIIl) {
                    Object object = this.lIIIIllIIllIIIlIIIllIllII;
                    synchronized (object) {
                        this.llIIlIIllIIllIlIIllIIllII[this.IlIlllIIIIIIlIIllIIllIlll].lllIlIIlIIIlIlIIIllIlllIl();
                        this.IlIIllIlIlIllIIIlIIlIlIIl = this.IlIIIlIIIIllIIIllIIIIIIll;
                        this.lIlIIllIllIIIIIlIllllIIIl = this.IIlllIlIlllIllIIIlllIIlIl;
                    }
                }
                int n4 = this.llIIlIIllIIllIlIIllIIllII[this.IlIlllIIIIIIlIIllIIllIlll].getWidth();
                if (this.lIlIlIIIIIIlIIllllIlIIllI != null) {
                    this.lIlIlIIIIIIlIIllllIlIIllI.lllIIIllIIIIlllIlIIllIIll();
                }
                this.lIlIlIIIIIIlIIllllIlIIllI = new class_0243(n4, n4, 6);
                Ellipse2D.Double double_ = new Ellipse2D.Double(this.IlIlllIIIIIIlIIllIIllIlll * 10 / 6, this.IlIlllIIIIIIlIIllIIllIlll * 10 / 6, n4 - this.IlIlllIIIIIIlIIllIIllIlll * 2, n4 - this.IlIlllIIIIIIlIIllIIllIlll * 2);
                Graphics2D graphics2D = this.lIlIlIIIIIIlIIllllIlIIllI.createGraphics();
                graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                graphics2D.setClip(double_);
                graphics2D.setColor(new Color(0.1f, 0.0f, 0.0f, 0.1f));
                graphics2D.fillRect(0, 0, n4, n4);
                Object object = this.lIIIIllIIllIIIlIIIllIllII;
                synchronized (object) {
                    graphics2D.drawImage((Image)this.llIIlIIllIIllIlIIllIIllII[this.IlIlllIIIIIIlIIllIIllIlll], 0, 0, null);
                    this.IlIIllIlIlIllIIIlIIlIlIIl = this.IlIIIlIIIIllIIIllIIIIIIll;
                    this.lIlIIllIllIIIIIlIllllIIIl = this.IIlllIlIlllIllIIIlllIIlIl;
                }
                graphics2D.dispose();
                this.lIlIlIIIIIIlIIllllIlIIllI.lllIlIIlIIIlIlIIIllIlllIl();
            }
            f = 2.0f / (float)Math.pow(2.0, this.IlIlllIIIIIIlIIllIIllIlll);
            this.llIIlIllIllllIlIIIIlIIlll = (float)(class_0006.IIIllIIlIIIIIIlIlIIllIIlI() - (double)this.IlIIllIlIlIllIIIlIIlIlIIl);
            this.llIllllIlIllIIIlIllIIlIlI = (float)(class_0006.IllIIlllllllIIlIIlIIIIlIl() - (double)this.lIlIIllIllIIIIIlIllllIIIl);
            this.llIIlIllIllllIlIIIIlIIlll *= f;
            this.llIllllIlIllIIIlIllIIlIlI *= f;
            GL11.glBlendFunc((int)770, (int)0);
            if (this.IlIlllIIIIIIlIIllIIllIlll == 3) {
                GL11.glPushMatrix();
                GL11.glScalef((float)0.5f, (float)0.5f, (float)1.0f);
                class_2210.lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl.IlIlIIlIlIllIIlIlIIllIIIl ? this.llIIlIIllIIllIlIIllIIllII[this.IlIlllIIIIIIlIIllIIllIlll].lllIlIIlIIIlIlIIIllIlllIl : this.lIlIlIIIIIIlIIllllIlIIllI.lllIlIIlIIIlIlIIIllIlllIl);
                GL11.glPopMatrix();
            } else {
                class_2210.lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl.IlIlIIlIlIllIIlIlIIllIIIl ? this.llIIlIIllIIllIlIIllIIllII[this.IlIlllIIIIIIlIIllIIllIlll].lllIlIIlIIIlIlIIIllIlllIl : this.lIlIlIIIIIIlIIllllIlIIllI.lllIlIIlIIIlIlIIIllIlllIl);
            }
            if (this.IlIllllllIIlIIllllIIlIIIl.IllIIIllIIIIlIlIlIllIIlll) {
                GL11.glTexParameteri((int)3553, (int)10241, (int)9729);
                GL11.glTexParameteri((int)3553, (int)10240, (int)9729);
            }
            GL11.glPushMatrix();
            GL11.glTranslatef((float)n, (float)n2, (float)0.0f);
            GL11.glRotatef((float)(this.IlIllllllIIlIIllllIIlIIIl.IlIlIIlIlIllIIlIlIIllIIIl ? (float)this.IIIIlIllIlIIlIIlIllIlIlll : -this.llIIIlIlIlIIlIllIIIllIlIl + (float)this.IIIIlIllIlIIlIIlIllIlIlll), (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)(-n), (float)(-n2), (float)0.0f);
            GL11.glTranslatef((float)(-this.llIIlIllIllllIlIIIIlIIlll), (float)(-this.llIllllIlIllIIIlIllIIlIlI), (float)0.0f);
        }
        class_2210.lIlllIlllIIIIlIIlllIllIII();
        class_2210.lllIIIllIIIIlllIlIIllIIll(n, n2);
        class_2210.IlIIIIIllllllIIlllIllllll();
        GL11.glPopMatrix();
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        if (this.IlIllllllIIlIIllllIIlIIIl.IlIlIIlIlIllIIlIlIIllIIIl) {
            this.IlIllllllIIlIIllllIIlIIIl(n, n2);
        } else {
            this.lIlllIlllIIIIlIIlllIllIII(n, n2);
        }
        double d = class_0006.IIIllIIlIIIIIIlIlIIllIIlI();
        double d2 = class_0006.IllIIlllllllIIlIIlIIIIlIl();
        for (class_0368 class_03682 : this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll()) {
            if (!class_03682.lllIlIIlIIIlIlIIIllIlllIl()) continue;
            double d3 = d - (double)class_03682.IlIllllllIIlIIllllIIlIIIl() - 0.5;
            double d4 = d2 - (double)class_03682.lIlllIlllIIIIlIIlllIllIII() - 0.5;
            float f2 = (float)Math.toDegrees(Math.atan2(d3, d4));
            double d5 = Math.sqrt(d3 * d3 + d4 * d4);
            boolean bl2 = false;
            if (this.IlIllllllIIlIIllllIIlIIIl.IlIlIIlIlIllIIlIlIIllIIIl) {
                boolean bl3 = bl2 = Math.abs(d3) / (Math.pow(2.0, this.IlIlllIIIIIIlIIllIIllIlll) / 2.0) > 28.5 || Math.abs(d4) / (Math.pow(2.0, this.IlIlllIIIIIIlIIllIIllIlll) / 2.0) > 28.5;
                d5 = bl2 ? d5 / Math.max(Math.abs(d3), Math.abs(d4)) * 30.0 : (d5 /= Math.pow(2.0, this.IlIlllIIIIIIlIIllIIllIlll) / 2.0);
            } else {
                f2 += this.llIIIlIlIlIIlIllIIIllIlIl;
                boolean bl4 = bl2 = (d5 /= Math.pow(2.0, this.IlIlllIIIIIIlIIllIIllIlll) / 2.0) >= 31.0;
                if (bl2) {
                    d5 = 34.0;
                }
            }
            if (bl2) {
                try {
                    GL11.glPushMatrix();
                    GL11.glColor3f((float)class_03682.IlIlIIlIlIllIIlIlIIllIIIl, (float)class_03682.lllllIlllIIllIlIIlIIIllII, (float)class_03682.IlIlIIlllIIlIllIIIlllllIl);
                    if (n3 >= 3) {
                        class_2210.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("voxelmap/images/marker" + class_03682.lllIlIIlIIIlIlIIIllIlllIl + ".png"));
                    } else {
                        class_2210.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("voxelmap/images/marker" + class_03682.lllIlIIlIIIlIlIIIllIlllIl + "Small.png"));
                    }
                    GL11.glTexParameteri((int)3553, (int)10241, (int)9729);
                    GL11.glTexParameteri((int)3553, (int)10240, (int)9729);
                    GL11.glTranslatef((float)n, (float)n2, (float)0.0f);
                    GL11.glRotatef((float)(-f2 + (float)this.IIIIlIllIlIIlIIlIllIlIlll), (float)0.0f, (float)0.0f, (float)1.0f);
                    GL11.glTranslatef((float)(-n), (float)(-n2), (float)0.0f);
                    GL11.glTranslated((double)0.0, (double)(-d5), (double)0.0);
                    class_2210.lIlllIlllIIIIlIIlllIllIII();
                    class_2210.lllIIIllIIIIlllIlIIllIIll(n, n2, 16);
                    class_2210.IlIIIIIllllllIIlllIllllll();
                    continue;
                }
                catch (Exception exception) {
                    this.IlllIIlllllllIIllIlIllllI = "Error: marker overlay not found!";
                    continue;
                }
                finally {
                    GL11.glPopMatrix();
                    continue;
                }
            }
            try {
                GL11.glPushMatrix();
                GL11.glColor3f((float)class_03682.IlIlIIlIlIllIIlIlIIllIIIl, (float)class_03682.lllllIlllIIllIlIIlIIIllII, (float)class_03682.IlIlIIlllIIlIllIIIlllllIl);
                if (n3 >= 3) {
                    class_2210.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("voxelmap/images/waypoint" + class_03682.lllIlIIlIIIlIlIIIllIlllIl + ".png"));
                } else {
                    class_2210.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("voxelmap/images/waypoint" + class_03682.lllIlIIlIIIlIlIIIllIlllIl + "Small.png"));
                }
                GL11.glTexParameteri((int)3553, (int)10241, (int)9729);
                GL11.glTexParameteri((int)3553, (int)10240, (int)9729);
                GL11.glRotatef((float)(-f2 + (float)this.IIIIlIllIlIIlIIlIllIlIlll), (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslated((double)0.0, (double)(-d5), (double)0.0);
                GL11.glRotatef((float)(-(-f2 + (float)this.IIIIlIllIlIIlIIlIllIlIlll)), (float)0.0f, (float)0.0f, (float)1.0f);
                class_2210.lIlllIlllIIIIlIIlllIllIII();
                class_2210.lllIIIllIIIIlllIlIIllIIll(n, n2, 16);
                class_2210.IlIIIIIllllllIIlllIllllll();
            }
            catch (Exception exception) {
                this.IlllIIlllllllIIllIlIllllI = "Error: waypoint overlay not found!";
            }
            finally {
                GL11.glPopMatrix();
            }
        }
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        try {
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glBlendFunc((int)770, (int)771);
            GL11.glPushMatrix();
            class_2210.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("voxelmap/images/mmarrow.png"));
            GL11.glTexParameteri((int)3553, (int)10241, (int)9729);
            GL11.glTexParameteri((int)3553, (int)10240, (int)9729);
            GL11.glTranslatef((float)n, (float)n2, (float)0.0f);
            GL11.glRotatef((float)this.llIIIlIlIlIIlIllIIIllIlIl, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)(-n), (float)(-n2), (float)0.0f);
            class_2210.lIlllIlllIIIIlIIlllIllIII();
            class_2210.lllIIIllIIIIlllIlIIllIIll(n, n2, 16);
            class_2210.IlIIIIIllllllIIlllIllllll();
        }
        catch (Exception exception) {
            this.IlllIIlllllllIIllIlIllllI = "Error: minimap arrow not found!";
        }
        finally {
            GL11.glPopMatrix();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void lllIlIIlIIIlIlIIIllIlllIl(int n, int n2) {
        Object object = this.lIIIIllIIllIIIlIIIllIllII;
        synchronized (object) {
            if (this.IllllIIIIlIIlIIIIlllIIIIl) {
                this.IllllIIIIlIIlIIIIlllIIIIl = false;
                this.llIIlIIllIIllIlIIllIIllII[this.IlIlllIIIIIIlIIllIIllIlll].lllIlIIlIIIlIlIIIllIlllIl();
                this.IlIIllIlIlIllIIIlIIlIlIIl = this.IlIIIlIIIIllIIIllIIIIIIll;
                this.lIlIIllIllIIIIIlIllllIIIl = this.IIlllIlIlllIllIIIlllIIlIl;
            }
        }
        class_2210.lllIIIllIIIIlllIlIIllIIll(this.llIIlIIllIIllIlIIllIIllII[this.IlIlllIIIIIIlIIllIIllIlll].lllIlIIlIIIlIlIIIllIlllIl);
        if (this.IlIllllllIIlIIllllIIlIIIl.IllIIIllIIIIlIlIlIllIIlll) {
            GL11.glTexParameteri((int)3553, (int)10241, (int)9729);
            GL11.glTexParameteri((int)3553, (int)10240, (int)9729);
        }
        GL11.glPushMatrix();
        GL11.glTranslatef((float)((float)n / 2.0f), (float)((float)n2 / 2.0f), (float)0.0f);
        GL11.glRotatef((float)this.IIIIlIllIlIIlIIlIllIlIlll, (float)0.0f, (float)0.0f, (float)1.0f);
        GL11.glTranslatef((float)(-((float)n / 2.0f)), (float)(-((float)n2 / 2.0f)), (float)0.0f);
        class_2210.lIlllIlllIIIIlIIlllIllIII();
        int n3 = n / 2 - 128;
        int n4 = n2 / 2 - 128;
        class_2210.lllIIIllIIIIlllIlIIllIIll(n3, n4 + 256, 67.0, 0.0, 1.0);
        class_2210.lllIIIllIIIIlllIlIIllIIll(n3 + 256, n4 + 256, 67.0, 1.0, 1.0);
        class_2210.lllIIIllIIIIlllIlIIllIIll(n3 + 256, n4, 67.0, 1.0, 0.0);
        class_2210.lllIIIllIIIIlllIlIIllIIll(n3, n4, 67.0, 0.0, 0.0);
        class_2210.IlIIIIIllllllIIlllIllllll();
        GL11.glPopMatrix();
        if (this.IlIllllllIIlIIllllIIlIIIl.lllIIlIIIllllllIIIIlIlIlI > 0) {
            int n5 = (int)Math.pow(2.0, 3 - this.IlIlllIIIIIIlIIllIIllIlll);
            int n6 = (int)Math.pow(2.0, this.IlIlllIIIIIIlIIllIIllIlll);
            n6 *= n6;
            ArrayList arrayList = this.IIIIlIIlIIIllIIIIllIIIlII[this.IlIlllIIIIIIlIIllIIllIlll].IlIllllllIIlIIllllIIlIIIl();
            GL11.glDisable((int)2929);
            for (int i = 0; i < arrayList.size(); ++i) {
                class_1958 class_19582 = (class_1958)arrayList.get(i);
                if (class_19582.lllIlIIlIIIlIlIIIllIlllIl <= n6) continue;
                String string = class_0672.lllIIlIIIllllllIIIIlIlIlI()[class_19582.lllIIIllIIIIlllIlIIllIIll].IlIIIlIllIIIllIIIIlIIlIll;
                int n7 = this.lllIIIllIIIIlllIlIIllIIll(string);
                int n8 = class_19582.IlIllllllIIlIIllllIIlIIIl * n5;
                int n9 = class_19582.lIlllIlllIIIIlIIlllIllIII * n5;
                if (this.IlIllllllIIlIIllllIIlIIIl.lllllIlllIIllIlIIlIIIllII) {
                    this.lllIIIllIIIIlllIlIIllIIll(string, n3 + 256 - n9 - n7 / 2, n4 + n8 - 3, 0xFFFFFF);
                    continue;
                }
                this.lllIIIllIIIIlllIlIIllIIll(string, n3 + n8 - n7 / 2, n4 + n9 - 3, 0xFFFFFF);
            }
            GL11.glEnable((int)2929);
        }
    }

    private void IlIllllllIIlIIllllIIlIIIl(int n, int n2) {
        try {
            class_2210.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll());
            GL11.glTexParameteri((int)3553, (int)10241, (int)9729);
            GL11.glTexParameteri((int)3553, (int)10240, (int)9729);
            GL11.glTexParameteri((int)3553, (int)10242, (int)10496);
            GL11.glTexParameteri((int)3553, (int)10243, (int)10496);
            class_2210.lIlllIlllIIIIlIIlllIllIII();
            class_2210.lllIIIllIIIIlllIlIIllIIll(n, n2);
            class_2210.IlIIIIIllllllIIlllIllllll();
        }
        catch (Exception exception) {
            this.IlllIIlllllllIIllIlIllllI = "error: minimap overlay not found!";
        }
    }

    private void lIlllIlllIIIIlIIlllIllIII(int n, int n2) {
        try {
            class_2210.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("voxelmap/images/roundmap.png"));
            GL11.glTexParameteri((int)3553, (int)10241, (int)9729);
            GL11.glTexParameteri((int)3553, (int)10240, (int)9729);
            class_2210.lIlllIlllIIIIlIIlllIllIII();
            class_2210.lllIIIllIIIIlllIlIIllIIll(n, n2);
            class_2210.IlIIIIIllllllIIlllIllllll();
        }
        catch (Exception exception) {
            this.IlllIIlllllllIIllIlIllllI = "Error: minimap overlay not found!";
        }
    }

    private void IlIIIIIllllllIIlllIllllll(int n, int n2) {
        float f;
        float f2;
        if (this.IlIllllllIIlIIllllIIlIIIl.IlIlIIlIlIllIIlIlIIllIIIl) {
            f2 = -90.0f;
            f = 67.0f;
        } else {
            f2 = -this.llIIIlIlIlIIlIllIIIllIlIl - 90.0f;
            f = 64.0f;
        }
        GL11.glPushMatrix();
        GL11.glScalef((float)0.5f, (float)0.5f, (float)1.0f);
        GL11.glTranslated((double)((double)f * Math.sin(Math.toRadians(-((double)f2 - 90.0)))), (double)((double)f * Math.cos(Math.toRadians(-((double)f2 - 90.0)))), (double)0.0);
        this.lllIIIllIIIIlllIlIIllIIll("N", n * 2 - 2, n2 * 2 - 4, 0xFFFFFF);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glScalef((float)0.5f, (float)0.5f, (float)1.0f);
        GL11.glTranslated((double)((double)f * Math.sin(Math.toRadians(-f2))), (double)((double)f * Math.cos(Math.toRadians(-f2))), (double)0.0);
        this.lllIIIllIIIIlllIlIIllIIll("E", n * 2 - 2, n2 * 2 - 4, 0xFFFFFF);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glScalef((float)0.5f, (float)0.5f, (float)1.0f);
        GL11.glTranslated((double)((double)f * Math.sin(Math.toRadians(-((double)f2 + 90.0)))), (double)((double)f * Math.cos(Math.toRadians(-((double)f2 + 90.0)))), (double)0.0);
        this.lllIIIllIIIIlllIlIIllIIll("S", n * 2 - 2, n2 * 2 - 4, 0xFFFFFF);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glScalef((float)0.5f, (float)0.5f, (float)1.0f);
        GL11.glTranslated((double)((double)f * Math.sin(Math.toRadians(-((double)f2 + 180.0)))), (double)((double)f * Math.cos(Math.toRadians(-((double)f2 + 180.0)))), (double)0.0);
        this.lllIIIllIIIIlllIlIIllIIll("W", n * 2 - 2, n2 * 2 - 4, 0xFFFFFF);
        GL11.glPopMatrix();
    }

    private void lIllllIIlIIIlIllllllIIIll(int n, int n2) {
        int n3 = n2 > this.lIIlIIIIIlIlllIlIIlIlIlll - 37 - 32 - 4 - 15 ? n2 - 32 - 4 - 9 : n2 + 32 + 4;
        if (!this.IlIllllllIIlIIllllIIlIIIl.lIlllIlllIIIIlIIlllIllIII && !this.llIIllIllIlIIlIIllIllllll) {
            GL11.glPushMatrix();
            GL11.glScalef((float)0.5f, (float)0.5f, (float)1.0f);
            String string = "";
            string = this.lllIIIllIIIIlllIlIIllIIll(class_0006.lIlllIlllIIIIlIIlllIllIII()) + ", " + this.lllIIIllIIIIlllIlIIllIIll(class_0006.IlIIIIIllllllIIlllIllllll());
            int n4 = this.lllIIIllIIIIlllIlIIllIIll(string) / 2;
            this.lllIIIllIIIIlllIlIIllIIll(string, n * 2 - n4, n3 * 2, 0xFFFFFF);
            string = Integer.toString(class_0006.lIllllIIlIIIlIllllllIIIll());
            n4 = this.lllIIIllIIIIlllIlIIllIIll(string) / 2;
            this.lllIIIllIIIIlllIlIIllIIll(string, n * 2 - n4, n3 * 2 + 10, 0xFFFFFF);
            if (this.lllIIIlIIlIlIllIIIIIlIIll > 0) {
                n4 = this.lllIIIllIIIIlllIlIIllIIll(this.IlllIIlllllllIIllIlIllllI) / 2;
                this.lllIIIllIIIIlllIlIIllIIll(this.IlllIIlllllllIIllIlIllllI, n * 2 - n4, n3 * 2 + 19, 0xFFFFFF);
            }
            GL11.glPopMatrix();
        } else {
            String string = "";
            string = "(" + this.lllIIIllIIIIlllIlIIllIIll(class_0006.lIlllIlllIIIIlIIlllIllIII()) + ", " + class_0006.lIllllIIlIIIlIllllllIIIll() + ", " + this.lllIIIllIIIIlllIlIIllIIll(class_0006.IlIIIIIllllllIIlllIllllll()) + ") " + (int)this.llIIIlIlIlIIlIllIIIllIlIl + "'";
            int n5 = this.lllIIIllIIIIlllIlIIllIIll(string) / 2;
            this.lllIIIllIIIIlllIlIIllIIll(string, this.IlIlIIlllIIlIllIIIlllllIl / 2 - n5, 5, 0xFFFFFF);
            if (this.lllIIIlIIlIlIllIIIIIlIIll > 0) {
                n5 = this.lllIIIllIIIIlllIlIIllIIll(this.IlllIIlllllllIIllIlIllllI) / 2;
                this.lllIIIllIIIIlllIlIIllIIll(this.IlllIIlllllllIIllIlIllllI, this.IlIlIIlllIIlIllIIIlllllIl / 2 - n5, 15, 0xFFFFFF);
            }
        }
    }

    private String lllIIIllIIIIlllIlIIllIIll(int n) {
        if (n < 0) {
            return "-" + Math.abs(n);
        }
        if (n > 0) {
            return "+" + n;
        }
        return " " + n;
    }

    private int lllIIIllIIIIlllIlIIllIIll(String string) {
        return this.IlIIIIIllIlllIIIIlIIIllIl.lllIIIllIIIIlllIlIIllIIll(string);
    }

    private void lllIIIllIIIIlllIlIIllIIll(String string, int n, int n2, int n3) {
        this.IlIIIIIllIlllIIIIlIIIllIl.lllIIIllIIIIlllIlIIllIIll(string, (float)n, (float)n2, n3);
    }

    public void IllIIlllllllIIlIIlIIIIlIl() {
        this.lllIIIllIIIIlllIlIIllIIll.lllllIlllIIllIlIIlIIIllII = null;
    }

    public Object IIIllIllIIlIlIlIlIllllIIl() {
        return this.lllIIIllIIIIlllIlIIllIIll.lllllIlllIIllIlIIlIIIllII;
    }

    private void IIIllIIlIIIIIIlIlIIllIIlI(int n, int n2) {
        int n3;
        GL11.glBlendFunc((int)770, (int)771);
        int n4 = 0;
        int n5 = 2;
        String string = this.IlllIIIllllIIllIllIlIIlIl[0];
        for (n3 = 1; n3 < this.IlllIIIllllIIllIllIlIIlIl.length - 1; ++n3) {
            if (this.lllIIIllIIIIlllIlIIllIIll(this.IlllIIIllllIIllIllIlIIlIl[n3]) <= n4) continue;
            n4 = this.lllIIIllIIIIlllIlIIllIIll(this.IlllIIIllllIIllIllIlIIlIl[n3]);
        }
        int n6 = this.lllIIIllIIIIlllIlIIllIIll(string);
        int n7 = (int)((double)(n + 5) / 2.0);
        int n8 = (int)((double)(n2 + 5) / 2.0);
        String string2 = this.IlllIIIllllIIllIllIlIIlIl[this.IlllIIIllllIIllIllIlIIlIl.length - 1];
        int n9 = this.lllIIIllIIIIlllIlIIllIIll(string2);
        GL11.glDisable((int)3553);
        GL11.glColor4f((float)0.0f, (float)0.0f, (float)0.0f, (float)0.7f);
        double d = (double)n7 - (double)n6 / 2.0 - (double)n5;
        double d2 = (double)n7 + (double)n6 / 2.0 + (double)n5;
        double d3 = (double)n8 - (double)(n3 - 1) / 2.0 * 10.0 - (double)n5 - 20.0;
        double d4 = (double)n8 - (double)(n3 - 1) / 2.0 * 10.0 + (double)n5 - 10.0;
        this.lllIIIllIIIIlllIlIIllIIll(d, d2, d3, d4);
        d = (double)n7 - (double)n4 / 2.0 - (double)n5;
        d2 = (double)n7 + (double)n4 / 2.0 + (double)n5;
        d3 = (double)n8 - (double)(n3 - 1) / 2.0 * 10.0 - (double)n5;
        d4 = (double)n8 + (double)(n3 - 1) / 2.0 * 10.0 + (double)n5;
        this.lllIIIllIIIIlllIlIIllIIll(d, d2, d3, d4);
        d = (double)n7 - (double)n9 / 2.0 - (double)n5;
        d2 = (double)n7 + (double)n9 / 2.0 + (double)n5;
        d3 = (double)n8 + (double)(n3 - 1) / 2.0 * 10.0 - (double)n5 + 10.0;
        d4 = (double)n8 + (double)(n3 - 1) / 2.0 * 10.0 + (double)n5 + 20.0;
        this.lllIIIllIIIIlllIlIIllIIll(d, d2, d3, d4);
        GL11.glEnable((int)3553);
        this.lllIIIllIIIIlllIlIIllIIll(string, n7 - n6 / 2, n8 - (n3 - 1) * 10 / 2 - 19, 0xFFFFFF);
        for (int i = 1; i < n3; ++i) {
            this.lllIIIllIIIIlllIlIIllIIll(this.IlllIIIllllIIllIllIlIIlIl[i], n7 - n4 / 2, n8 - (n3 - 1) * 10 / 2 + i * 10 - 9, 0xFFFFFF);
        }
        this.lllIIIllIIIIlllIlIIllIIll(string2, n7 - n9 / 2, (n2 + 5) / 2 + (n3 - 1) * 10 / 2 + 11, 0xFFFFFF);
    }

    private void lllIIIllIIIIlllIlIIllIIll(double d, double d2, double d3, double d4) {
        class_2210.lIlllIlllIIIIlIIlllIllIII();
        class_2210.lllIIIllIIIIlllIlIIllIIll(d, d4, 0.0);
        class_2210.lllIIIllIIIIlllIlIIllIIll(d2, d4, 0.0);
        class_2210.lllIIIllIIIIlllIlIIllIIll(d2, d3, 0.0);
        class_2210.lllIIIllIIIIlllIlIIllIIll(d, d3, 0.0);
        class_2210.IlIIIIIllllllIIlllIllllll();
    }
}

