package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonSyntaxException
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.Display
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GLContext
 *  org.lwjgl.util.glu.GLU
 *  org.lwjgl.util.glu.Project
 */
import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.FloatBuffer;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;

import com.moonsworth.lunar.client.LunarClient;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.crash.CrashReport;
import net.minecraft.init.Blocks;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.MathHelper;
import optifine.Config;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.util.glu.GLU;
import org.lwjgl.util.glu.Project;

public class class_0817
implements class_0334 {
    private static final Logger llIIlIllIllllIlIIIIlIIlll = LogManager.getLogger();
    private static final ResourceLocation llIllllIlIllIIIlIllIIlIlI = new ResourceLocation("textures/environment/rain.png");
    private static final ResourceLocation lIlllIlllIlIIIIlllIlIlIIl = new ResourceLocation("textures/environment/snow.png");
    public static boolean lllIIIllIIIIlllIlIIllIIll;
    public static int lllIlIIlIIIlIlIIIllIlllIl;
    private static int IlIIlllllIIlIlIlllllIllll;
    private Minecraft llIIlIlIlllIIllIlIlllIllI;
    private float IllIIIIllIIllIllIlllIlIIl;
    public class_2059 IlIllllllIIlIIllllIIlIIIl;
    private final class_0975 IIIIIIIIlIllIIllIIlllIllI;
    private int IIlIIlIlIlIllIIlIlIIIIlll;
    private class_1521 llIIIlllIlllIlIllIIIIllIl;
    private class_0322 IIIIlIllIlIIlIIlIllIlIlll = new class_0322();
    private class_0322 IlIlIIlllIllllllllIIIlIlI = new class_0322();
    private class_0322 llllIIIIlIIIlIIIIIIlIllll = new class_0322();
    private class_0322 llIIIIllIIIIIIIlIIIlIIIIl = new class_0322();
    private class_0322 IIllIllIIllIIlllIIIlIlllI = new class_0322();
    private class_0322 llllllIlIllllIlIlIlIIIIlI = new class_0322();
    private float lIlIIllllIlIIIIllIIIIlIIl = 4.0f;
    private float llIlllIIllIlllIlIlIlIIIll = 4.0f;
    private float IIIIlIIlIIIllIIIIllIIIlII;
    private float lllIIIIIIlIlllIIlIlIIIllI;
    private float llIIlIIllIIllIlIIllIIllII;
    private float lIlIlIIIIIIlIIllllIlIIllI;
    private float IllllIIIIlIIlIIIIlllIIIIl;
    private float llllIlIIIIIIIIIlllIIlIIIl;
    private float IIIIlIlIIlIIIIlIlllIlIIII;
    private float lllIIIIlIlIIlIIlllIIIIIIl;
    private float llIlIIlllIIIIIllIIlIlIIII;
    private float IllIIIlllllIlIlllIlllllII;
    private float llIlllIlIIllIlIIIIllIIlIl;
    private float lIIIllIIIIIllllIlIlIllIll;
    private float lIIIlIIIlIlllIllIIIlIIIlI;
    private float lIIlIlllIllIlIlllIIIIIIII = 0.0f;
    private final class_2202 IIlIllIIlllllIIlIIllllIIl;
    private final int[] IllllIIlIIIllIlllIlllIllI;
    private final ResourceLocation IllIlIlIIIlllIIllIIIIlIll;
    private float IlIIIlIllIIIllIIIIlIIlIll;
    private float llllIIllIlIlllllllIIlIIlI;
    private float IlllIIlllllllIIllIlIllllI;
    private float IlllIIIllllIIllIllIlIIlIl;
    private float lllIIIlIIlIlIllIIIIIlIIll;
    private boolean IIIlIlIllIlllllIlIllllllI;
    private final class_0947 IIIIlIllIlIIIIIllllIIlllI;
    public class_1711 lIlllIlllIIIIlIIlllIllIII;
    private static final ResourceLocation[] llllIlIIllIIlllllIIllIIll;
    private static final ResourceLocation IlIlIllIIlIIIIlllIlIllIlI;
    private static final ResourceLocation IlIIllIlIlIllIIIlIIlIlIIl;
    public static final int IlIIIIIllllllIIlllIllllll;
    private int lIlIIllIllIIIIIlIllllIIIl;
    private double lIlllIIllIIIIIIlIlIIlIllI = 1.0;
    private double llIIIlIlIlIIlIllIIIllIlIl;
    private double lIIlIIlIllIlIIlIlIIlIlIlI;
    private long llIIIIIlIIlIIIIllIIIlIIII;
    private long lIlIlIIllIIIlllIllIIlIllI;
    private boolean IlIIIIIllIlllIIIIlIIIllIl;
    float lIllllIIlIIIlIllllllIIIll;
    float IIIllIIlIIIIIIlIlIIllIIlI;
    float IllIIlllllllIIlIIlIIIIlIl;
    float IIIllIllIIlIlIlIlIllllIIl;
    private Random lIIlIlIIllIIIlIIlIlIIIlII;
    private int lIIIlIIllIllIIlIIlIIIllII;
    float[] IllIIIllIIIIlIlIlIllIIlll;
    float[] lIIIIlIlIIlllllIIllIIlIII;
    FloatBuffer llIIlllIllIllllIIIlIIIIII;
    float llIIllIllIlIIlIIllIllllll;
    float lllIIlIIIllllllIIIIlIlIlI;
    float IlIlllIIIIIIlIIllIIllIlll;
    private float lIlIllIIllIIIIlllIlIlllIl;
    private float IlIIIlIIlllllIIIllIlIlIll;
    public int IlIlIIlIlIllIIlIlIIllIIIl;
    private boolean lIIllllllllIlIllllllllIlI = false;
    private class_1334 lIIIIllIIllIIIlIIIllIllII = null;
    private boolean lIIllIIlIIIlllIlllIIlIIlI = false;
    public boolean lllllIlllIIllIlIIlIIIllII = false;
    private long IllIIllIlIlllIllIllIlIIIl = 0L;
    private int IIIlIllllIIIlllllIllIlIII = 0;
    private int IIIIIllIlIllIlIlIIlIllIIl = 0;
    private int lIIllIlIIlIIlllllIlIIllIl = 0;
    private float lIIlllIIlIlIlIIIlIlllIIll = 0.0f;
    private float IlIIlIIlllllIlIIlIlIlIlIl = 0.0f;
    public long[] IlIlIIlllIIlIllIIIlllllIl = new long[512];
    public long[] lIIlIIIIIlIlllIlIIlIlIlll = new long[512];
    public long[] lIlIlIIlIIIIlIIIIIlllIIII = new long[512];
    public long[] IlIIIlIIIIllIIIllIIIIIIll = new long[512];
    public int IIlllIlIlllIllIIIlllIIlIl = 0;
    public long lIlIllIIlIIlIIlIIlIIlIIll = -1L;
    private boolean lIlIIIllIIllIIlIllllllIll = false;
    private boolean lIlIIlllllIlllllIlIIIllll = false;
    private long lllllllIlIIlIlIIIlIlIIlll = 0L;

    public class_0817(Minecraft class_06672, class_0947 class_09472) {
        this.lIlIIllIllIIIIIlIllllIIIl = IlIIIIIllllllIIlllIllllll;
        this.llIIIIIlIIlIIIIllIIIlIIII = Minecraft.llllllIlIllllIlIlIlIIIIlI();
        this.lIIlIlIIllIIIlIIlIlIIIlII = new Random();
        this.llIIlllIllIllllIIIlIIIIII = class_0994.IlIIIIIllllllIIlllIllllll(16);
        this.llIIlIlIlllIIllIlIlllIllI = class_06672;
        this.IIIIlIllIlIIIIIllllIIlllI = class_09472;
        this.IIIIIIIIlIllIIllIIlllIllI = new class_0975(class_06672.llIIlIIllIIllIlIIllIIllII());
        this.IlIllllllIIlIIllllIIlIIIl = new class_2059(class_06672);
        this.IIlIllIIlllllIIlIIllllIIl = new class_2202(16, 16);
        this.IllIlIlIIIlllIIllIIIIlIll = class_06672.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll("lightMap", this.IIlIllIIlllllIIlIIllllIIl);
        this.IllllIIlIIIllIlllIlllIllI = this.IIlIllIIlllllIIlIIllllIIl.lIlllIlllIIIIlIIlllIllIII();
        this.lIlllIlllIIIIlIIlllIllIII = null;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll() {
        return OpenGlHelper.IIlllIlIlllIllIIIlllIIlIl && this.lIlllIlllIIIIlIIlllIllIII != null;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl() {
        if (this.lIlllIlllIIIIlIIlllIllIII != null) {
            this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll();
        }
        this.lIlllIlllIIIIlIIlllIllIII = null;
        this.lIlIIllIllIIIIIlIllllIIIl = IlIIIIIllllllIIlllIllllll;
    }

    public void IlIllllllIIlIIllllIIlIIIl() {
        if (this.lIlllIlllIIIIlIIlllIllIII != null) {
            this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll();
        }
        this.lIlllIlllIIIIlIIlllIllIII = null;
        this.lIlIIllIllIIIIIlIllllIIIl = IlIIIIIllllllIIlllIllllll;
    }

    public void lIlllIlllIIIIlIIlllIllIII() {
        if (OpenGlHelper.IIIllIIlIIIIIIlIlIIllIIlI() && OpenGlHelper.IIlllIlIlllIllIIIlllIIlIl) {
            if (this.lIlllIlllIIIIlIIlllIllIII != null) {
                this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll();
            }
            this.lIlIIllIllIIIIIlIllllIIIl = (this.lIlIIllIllIIIIIlIllllIIIl + 1) % (llllIlIIllIIlllllIIllIIll.length + 1);
            if (this.lIlIIllIllIIIIIlIllllIIIl != IlIIIIIllllllIIlllIllllll) {
                try {
                    llIIlIllIllllIlIIIIlIIlll.info("Selecting effect " + llllIlIIllIIlllllIIllIIll[this.lIlIIllIllIIIIIlIllllIIIl]);
                    this.lIlllIlllIIIIlIIlllIllIII = new class_1711(this.llIIlIlIlllIIllIlIlllIllI.llIIlIIllIIllIlIIllIIllII(), this.IIIIlIllIlIIIIIllllIIlllI, this.llIIlIlIlllIIllIlIlllIllI.lllIlIIlIIIlIlIIIllIlllIl(), llllIlIIllIIlllllIIllIIll[this.lIlIIllIllIIIIIlIllllIIIl]);
                    this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(this.llIIlIlIlllIIllIlIlllIllI.displayWidth, this.llIIlIlIlllIIllIlIlllIllI.displayHeight);
                }
                catch (IOException iOException) {
                    llIIlIllIllllIlIIIIlIIlll.warn("Failed to load shader: " + llllIlIIllIIlllllIIllIIll[this.lIlIIllIllIIIIIlIllllIIIl], (Throwable)iOException);
                    this.lIlIIllIllIIIIIlIllllIIIl = IlIIIIIllllllIIlllIllllll;
                }
                catch (JsonSyntaxException jsonSyntaxException) {
                    llIIlIllIllllIlIIIIlIIlll.warn("Failed to load shader: " + llllIlIIllIIlllllIIllIIll[this.lIlIIllIllIIIIIlIllllIIIl], (Throwable)jsonSyntaxException);
                    this.lIlIIllIllIIIIIlIllllIIIl = IlIIIIIllllllIIlllIllllll;
                }
            } else {
                this.lIlllIlllIIIIlIIlllIllIII = null;
                llIIlIllIllllIlIIIIlIIlll.info("No effect selected");
            }
        }
    }

    public void IlIIIIIllllllIIlllIllllll() {
        if (OpenGlHelper.IIIllIIlIIIIIIlIlIIllIIlI() && OpenGlHelper.IIlllIlIlllIllIIIlllIIlIl) {
            if (this.lIlllIlllIIIIlIIlllIllIII != null) {
                this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll();
            }
            try {
                this.lIlllIlllIIIIlIIlllIllIII = new class_1711(this.llIIlIlIlllIIllIlIlllIllI.llIIlIIllIIllIlIIllIIllII(), this.IIIIlIllIlIIIIIllllIIlllI, this.llIIlIlIlllIIllIlIlllIllI.lllIlIIlIIIlIlIIIllIlllIl(), IlIlIllIIlIIIIlllIlIllIlI);
                this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(this.llIIlIlIlllIIllIlIlllIllI.displayWidth, this.llIIlIlIlllIIllIlIlllIllI.displayHeight);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    public void lIllllIIlIIIlIllllllIIIll() {
        if (OpenGlHelper.IIIllIIlIIIIIIlIlIIllIIlI() && OpenGlHelper.IIlllIlIlllIllIIIlllIIlIl) {
            if (this.lIlllIlllIIIIlIIlllIllIII != null) {
                this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll();
            }
            try {
                this.lIlllIlllIIIIlIIlllIllIII = new class_1711(this.llIIlIlIlllIIllIlIlllIllI.llIIlIIllIIllIlIIllIIllII(), this.IIIIlIllIlIIIIIllllIIlllI, this.llIIlIlIlllIIllIlIlllIllI.lllIlIIlIIIlIlIIIllIlllIl(), IlIIllIlIlIllIIIlIIlIlIIl);
                this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(this.llIIlIlIlllIIllIlIlllIllI.displayWidth, this.llIIlIlIlllIIllIlIlllIllI.displayHeight);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0947 class_09472) {
        if (this.lIlllIlllIIIIlIIlllIllIII != null) {
            this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll();
        }
        if (this.lIlIIllIllIIIIIlIllllIIIl != IlIIIIIllllllIIlllIllllll) {
            try {
                this.lIlllIlllIIIIlIIlllIllIII = new class_1711(this.llIIlIlIlllIIllIlIlllIllI.llIIlIIllIIllIlIIllIIllII(), class_09472, this.llIIlIlIlllIIllIlIlllIllI.lllIlIIlIIIlIlIIIllIlllIl(), llllIlIIllIIlllllIIllIIll[this.lIlIIllIllIIIIIlIllllIIIl]);
                this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(this.llIIlIlIlllIIllIlIlllIllI.displayWidth, this.llIIlIlIlllIIllIlIlllIllI.displayHeight);
            }
            catch (IOException iOException) {
                llIIlIllIllllIlIIIIlIIlll.warn("Failed to load shader: " + llllIlIIllIIlllllIIllIIll[this.lIlIIllIllIIIIIlIllllIIIl], (Throwable)iOException);
                this.lIlIIllIllIIIIIlIllllIIIl = IlIIIIIllllllIIlllIllllll;
            }
        }
    }

    public void IIIllIIlIIIIIIlIlIIllIIlI() {
        float f;
        float f2;
        if (OpenGlHelper.IIlllIlIlllIllIIIlllIIlIl && class_2011.lllIlIIlIIIlIlIIIllIlllIl() == null) {
            class_2011.lllIIIllIIIIlllIlIIllIIll();
        }
        this.lIIIIlIlIIlllllIIllIIlIII();
        this.llIIlllIllIllllIIIlIIIIII();
        this.lIlIllIIllIIIIlllIlIlllIl = this.IlIIIlIIlllllIIIllIlIlIll;
        this.llIlllIIllIlllIlIlIlIIIll = this.lIlIIllllIlIIIIllIIIIlIIl;
        this.lllIIIIIIlIlllIIlIlIIIllI = this.IIIIlIIlIIIllIIIIllIIIlII;
        this.lIlIlIIIIIIlIIllllIlIIllI = this.llIIlIIllIIllIlIIllIIllII;
        this.llIlllIlIIllIlIIIIllIIlIl = this.IllIIIlllllIlIlllIlllllII;
        this.lIIIlIIIlIlllIllIIIlIIIlI = this.lIIIllIIIIIllllIlIlIllIll;
        if (this.llIIlIlIlllIIllIlIlllIllI.gameSettings.IIlIlIIIlIIllIlIlIlIlIIll) {
            f2 = this.llIIlIlIlllIIllIlIlllIllI.gameSettings.lllIIIllIIIIlllIlIIllIIll * 0.6f + 0.2f;
            f = f2 * f2 * f2 * 8.0f;
            this.IIIIlIlIIlIIIIlIlllIlIIII = this.IIIIlIllIlIIlIIlIllIlIlll.lllIIIllIIIIlllIlIIllIIll(this.IllllIIIIlIIlIIIIlllIIIIl, 0.05f * f);
            this.lllIIIIlIlIIlIIlllIIIIIIl = this.IlIlIIlllIllllllllIIIlIlI.lllIIIllIIIIlllIlIIllIIll(this.llllIlIIIIIIIIIlllIIlIIIl, 0.05f * f);
            this.llIlIIlllIIIIIllIIlIlIIII = 0.0f;
            this.IllllIIIIlIIlIIIIlllIIIIl = 0.0f;
            this.llllIlIIIIIIIIIlllIIlIIIl = 0.0f;
        }
        if (this.llIIlIlIlllIIllIlIlllIllI.llIIlllIllIllllIIIlIIIIII == null) {
            this.llIIlIlIlllIIllIlIlllIllI.llIIlllIllIllllIIIlIIIIII = this.llIIlIlIlllIIllIlIlllIllI.lIIIIlIlIIlllllIIllIIlIII;
        }
        f2 = this.llIIlIlIlllIIllIlIlllIllI.theWorld.llIIlllIllIllllIIIlIIIIII(MathHelper.IlIllllllIIlIIllllIIlIIIl(this.llIIlIlIlllIIllIlIlllIllI.llIIlllIllIllllIIIlIIIIII.IlIIlllllIIlIlIlllllIllll), MathHelper.IlIllllllIIlIIllllIIlIIIl(this.llIIlIlIlllIIllIlIlllIllI.llIIlllIllIllllIIIlIIIIII.llIIlIlIlllIIllIlIlllIllI), MathHelper.IlIllllllIIlIIllllIIlIIIl(this.llIIlIlIlllIIllIlIlllIllI.llIIlllIllIllllIIIlIIIIII.IllIIIIllIIllIllIlllIlIIl));
        f = (float)this.llIIlIlIlllIIllIlIlllIllI.gameSettings.IlIllllllIIlIIllllIIlIIIl / 16.0f;
        float f3 = f2 * (1.0f - f) + f;
        this.IlIIIlIIlllllIIIllIlIlIll += (f3 - this.IlIIIlIIlllllIIIllIlIlIll) * 0.1f;
        ++this.IIlIIlIlIlIllIIlIlIIIIlll;
        this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll();
        this.llIIllIllIlIIlIIllIllllll();
        this.lllIIIlIIlIlIllIIIIIlIIll = this.IlllIIIllllIIllIllIlIIlIl;
        if (class_0178.lIlllIlllIIIIlIIlllIllIII) {
            this.IlllIIIllllIIllIllIlIIlIl += 0.05f;
            if (this.IlllIIIllllIIllIllIlIIlIl > 1.0f) {
                this.IlllIIIllllIIllIllIlIIlIl = 1.0f;
            }
            class_0178.lIlllIlllIIIIlIIlllIllIII = false;
        } else if (this.IlllIIIllllIIllIllIlIIlIl > 0.0f) {
            this.IlllIIIllllIIllIllIlIIlIl -= 0.0125f;
        }
    }

    public class_1711 IllIIlllllllIIlIIlIIIIlIl() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        if (OpenGlHelper.IIlllIlIlllIllIIIlllIIlIl && this.lIlllIlllIIIIlIIlllIllIII != null) {
            this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(n, n2);
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(float f) {
        if (this.llIIlIlIlllIIllIlIlllIllI.llIIlllIllIllllIIIlIIIIII != null && this.llIIlIlIlllIIllIlIlllIllI.theWorld != null) {
            this.llIIlIlIlllIIllIlIlllIllI.llIIllIllIlIIlIIllIllllll = null;
            double d = this.llIIlIlIlllIIllIlIlllIllI.lIllllIIlIIIlIllllllIIIll.lIlllIlllIIIIlIIlllIllIII();
            this.llIIlIlIlllIIllIlIlllIllI.lIlIllIIlIIlIIlIIlIIlIIll = this.llIIlIlIlllIIllIlIlllIllI.llIIlllIllIllllIIIlIIIIII.lllIIIllIIIIlllIlIIllIIll(d, f);
            double d2 = d;
            class_0864 class_08642 = this.llIIlIlIlllIIllIlIlllIllI.llIIlllIllIllllIIIlIIIIII.lllIIlIIIllllllIIIIlIlIlI(f);
            if (this.llIIlIlIlllIIllIlIlllIllI.lIllllIIlIIIlIllllllIIIll.IIIllIllIIlIlIlIlIllllIIl()) {
                d = IlIIlllllIIlIlIlllllIllll >> 4;
                d2 = IlIIlllllIIlIlIlllllIllll >> 4;
            } else {
                if (d > (double)(IlIIlllllIIlIlIlllllIllll >> 5)) {
                    d2 = IlIIlllllIIlIlIlllllIllll >> 5;
                }
                d = d2;
            }
            if (this.llIIlIlIlllIIllIlIlllIllI.lIlIllIIlIIlIIlIIlIIlIIll != null) {
                d2 = this.llIIlIlIlllIIllIlIlllIllI.lIlIllIIlIIlIIlIIlIIlIIll.lIllllIIlIIIlIllllllIIIll.lIlllIlllIIIIlIIlllIllIII(class_08642);
            }
            class_0864 class_08643 = this.llIIlIlIlllIIllIlIlllIllI.llIIlllIllIllllIIIlIIIIII.llIIlllIllIllllIIIlIIIIII(f);
            class_0864 class_08644 = class_08642.IlIllllllIIlIIllllIIlIIIl(class_08643.lllIIIllIIIIlllIlIIllIIll * d, class_08643.lllIlIIlIIIlIlIIIllIlllIl * d, class_08643.IlIllllllIIlIIllllIIlIIIl * d);
            this.llIIIlllIlllIlIllIIIIllIl = null;
            class_0864 class_08645 = null;
            float f2 = 1.0f;
            List list = this.llIIlIlIlllIIllIlIlllIllI.theWorld.lllIlIIlIIIlIlIIIllIlllIl((class_1521)this.llIIlIlIlllIIllIlIlllIllI.llIIlllIllIllllIIIlIIIIII, this.llIIlIlIlllIIllIlIlllIllI.llIIlllIllIllllIIIlIIIIII.IIllIllIIllIIlllIIIlIlllI.lllIIIllIIIIlllIlIIllIIll(class_08643.lllIIIllIIIIlllIlIIllIIll * d, class_08643.lllIlIIlIIIlIlIIIllIlllIl * d, class_08643.IlIllllllIIlIIllllIIlIIIl * d).lllIlIIlIIIlIlIIIllIlllIl(f2, f2, f2));
            double d3 = d2;
            for (int i = 0; i < list.size(); ++i) {
                double d4;
                class_1521 class_15212 = (class_1521)list.get(i);
                if (!class_15212.IllllIIlIIIllIlllIlllIllI()) continue;
                float f3 = class_15212.IlIlIllIIlIIIIlllIlIllIlI();
                class_1974 class_19742 = class_15212.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl(f3, f3, f3);
                class_1112 class_11122 = class_19742.lllIIIllIIIIlllIlIIllIIll(class_08642, class_08644);
                if (class_19742.lllIIIllIIIIlllIlIIllIIll(class_08642)) {
                    if (!(0.0 < d3) && d3 != 0.0) continue;
                    this.llIIIlllIlllIlIllIIIIllIl = class_15212;
                    class_08645 = class_11122 == null ? class_08642 : class_11122.lIllllIIlIIIlIllllllIIIll;
                    d3 = 0.0;
                    continue;
                }
                if (class_11122 == null || !((d4 = class_08642.lIlllIlllIIIIlIIlllIllIII(class_11122.lIllllIIlIIIlIllllllIIIll)) < d3) && d3 != 0.0) continue;
                boolean bl = false;
                if (class_15212 == this.llIIlIlIlllIIllIlIlllIllI.llIIlllIllIllllIIIlIIIIII.IlIIIlIIIIllIIIllIIIIIIll && !bl) {
                    if (d3 != 0.0) continue;
                    this.llIIIlllIlllIlIllIIIIllIl = class_15212;
                    class_08645 = class_11122.lIllllIIlIIIlIllllllIIIll;
                    continue;
                }
                this.llIIIlllIlllIlIllIIIIllIl = class_15212;
                class_08645 = class_11122.lIllllIIlIIIlIllllllIIIll;
                d3 = d4;
            }
            if (this.llIIIlllIlllIlIllIIIIllIl != null && (d3 < d2 || this.llIIlIlIlllIIllIlIlllIllI.lIlIllIIlIIlIIlIIlIIlIIll == null)) {
                this.llIIlIlIlllIIllIlIlllIllI.lIlIllIIlIIlIIlIIlIIlIIll = new class_1112(this.llIIIlllIlllIlIllIIIIllIl, class_08645);
                if (this.llIIIlllIlllIlIllIIIIllIl instanceof class_1965 || this.llIIIlllIlllIlIllIIIIllIl instanceof class_1094) {
                    this.llIIlIlIlllIIllIlIlllIllI.llIIllIllIlIIlIIllIllllll = this.llIIIlllIlllIlIllIIIIllIl;
                }
            }
        }
    }

    private void lIIIIlIlIIlllllIIllIIlIII() {
        if (this.llIIlIlIlllIIllIlIlllIllI.llIIlllIllIllllIIIlIIIIII instanceof class_0139) {
            class_0139 class_01392 = (class_0139)this.llIIlIlIlllIIllIlIlllIllI.llIIlllIllIllllIIIlIIIIII;
            this.IlllIIlllllllIIllIlIllllI = class_01392.IIIIIIIIlIllIIllIIlllIllI();
        } else {
            this.IlllIIlllllllIIllIlIllllI = this.llIIlIlIlllIIllIlIlllIllI.lIIIIlIlIIlllllIIllIIlIII.IIIIIIIIlIllIIllIIlllIllI();
        }
        this.llllIIllIlIlllllllIIlIIlI = this.IlIIIlIllIIIllIIIIlIIlIll;
        this.IlIIIlIllIIIllIIIIlIIlIll += (this.IlllIIlllllllIIllIlIllllI - this.IlIIIlIllIIIllIIIIlIIlIll) * 0.5f;
        if (this.IlIIIlIllIIIllIIIIlIIlIll > 1.5f) {
            this.IlIIIlIllIIIllIIIIlIIlIll = 1.5f;
        }
        if (this.IlIIIlIllIIIllIIIIlIIlIll < 0.1f) {
            this.IlIIIlIllIIIllIIIIlIIlIll = 0.1f;
        }
    }

    private float lllIIIllIIIIlllIlIIllIIll(float f, boolean bl) {
        Block class_05492;
        if (this.IlIlIIlIlIllIIlIlIIllIIIl > 0) {
            return 90.0f;
        }
        class_1965 class_19652 = this.llIIlIlIlllIIllIlIlllIllI.llIIlllIllIllllIIIlIIIIII;
        float f2 = 70.0f;
        if (bl) {
            f2 = this.llIIlIlIlllIIllIlIlllIllI.gameSettings.llllIIIllIllIIIllIlIIIIIl;
            if (Config.llIllIllIllIlIlIllIlIIIIl()) {
                f2 *= this.llllIIllIlIlllllllIIlIIlI + (this.IlIIIlIllIIIllIIIIlIIlIll - this.llllIIllIlIlllllllIIlIIlI) * f;
            }
        }
        boolean bl2 = false;
        if (this.llIIlIlIlllIIllIlIlllIllI.lllllIlllIIllIlIIlIIIllII == null) {
            bl2 = this.llIIlIlIlllIIllIlIlllIllI.gameSettings.lIlIIlllllIlllllIlIIIllll.IIIllIllIIlIlIlIlIllllIIl() < 0 ? Mouse.isButtonDown((int)(this.llIIlIlIlllIIllIlIlllIllI.gameSettings.lIlIIlllllIlllllIlIIIllll.IIIllIllIIlIlIlIlIllllIIl() + 100)) : Keyboard.isKeyDown((int)this.llIIlIlIlllIIllIlIlllIllI.gameSettings.lIlIIlllllIlllllIlIIIllll.IIIllIllIIlIlIlIlIllllIIl());
        }
        if (bl2) {
            if (!Config.IIIllIllIIlIlIlIlIllllIIl) {
                Config.IIIllIllIIlIlIlIlIllllIIl = true;
                this.llIIlIlIlllIIllIlIlllIllI.gameSettings.IIlIlIIIlIIllIlIlIlIlIIll = true;
            }
            if (Config.IIIllIllIIlIlIlIlIllllIIl) {
                f2 /= 4.0f;
            }
        } else if (Config.IIIllIllIIlIlIlIlIllllIIl) {
            Config.IIIllIllIIlIlIlIlIllllIIl = false;
            this.llIIlIlIlllIIllIlIlllIllI.gameSettings.IIlIlIIIlIIllIlIlIlIlIIll = false;
            this.IIIIlIllIlIIlIIlIllIlIlll = new class_0322();
            this.IlIlIIlllIllllllllIIIlIlI = new class_0322();
        }
        if (class_19652.lllIIIlllIlllIIlIllllIIlI() <= 0.0f) {
            float f3 = (float)class_19652.lIlIIIllIIllIIlIllllllIll + f;
            f2 /= (1.0f - 500.0f / (f3 + 500.0f)) * 2.0f + 1.0f;
        }
        if ((class_05492 = class_1490.lllIIIllIIIIlllIlIIllIIll(this.llIIlIlIlllIIllIlIlllIllI.theWorld, class_19652, f)).lIllllIIlIIIlIllllllIIIll() == class_1855.IllIIlllllllIIlIIlIIIIlIl) {
            f2 = f2 * 60.0f / 70.0f;
        }
        return f2 + this.llIlllIlIIllIlIIIIllIIlIl + (this.IllIIIlllllIlIlllIlllllII - this.llIlllIlIIllIlIIIIllIIlIl) * f;
    }

    private void IlIIIIIllllllIIlllIllllll(float f) {
        float f2;
        class_1965 class_19652 = this.llIIlIlIlllIIllIlIlllIllI.llIIlllIllIllllIIIlIIIIII;
        float f3 = (float)class_19652.lIIllIlIIlIIlllllIlIIllIl - f;
        if (class_19652.lllIIIlllIlllIIlIllllIIlI() <= 0.0f) {
            f2 = (float)class_19652.lIlIIIllIIllIIlIllllllIll + f;
            GL11.glRotatef((float)(40.0f - 8000.0f / (f2 + 200.0f)), (float)0.0f, (float)0.0f, (float)1.0f);
        }
        if (f3 >= 0.0f) {
            f3 /= (float)class_19652.lIIlllIIlIlIlIIIlIlllIIll;
            f3 = MathHelper.lllIIIllIIIIlllIlIIllIIll(f3 * f3 * f3 * f3 * (float)Math.PI);
            f2 = class_19652.IlIIlIIlllllIlIIlIlIlIlIl;
            GL11.glRotatef((float)(-f2), (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)(-f3 * 14.0f), (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)f2, (float)0.0f, (float)1.0f, (float)0.0f);
        }
    }

    private void lIllllIIlIIIlIllllllIIIll(float f) {
        if (this.llIIlIlIlllIIllIlIlllIllI.llIIlllIllIllllIIIlIIIIII instanceof class_0814) {
            class_0814 class_08142 = (class_0814)this.llIIlIlIlllIIllIlIlllIllI.llIIlllIllIllllIIIlIIIIII;
            float f2 = class_08142.IllIIIlllllIlIlllIlllllII - class_08142.llIlIIlllIIIIIllIIlIlIIII;
            float f3 = -(class_08142.IllIIIlllllIlIlllIlllllII + f2 * f);
            float f4 = class_08142.lIIlIIIlIlIIlllIlIllIllIl + (class_08142.lIIlIlIIIIIllIIIIllIlIlII - class_08142.lIIlIIIlIlIIlllIlIllIllIl) * f;
            float f5 = class_08142.IIIlllIlIIllIIlIlIllIlIIl + (class_08142.llllIIIlIlIlIlIIlIIIIIlIl - class_08142.IIIlllIlIIllIIlIlIllIlIIl) * f;
            GL11.glTranslatef((float)(MathHelper.lllIIIllIIIIlllIlIIllIIll(f3 * (float)Math.PI) * f4 * 0.5f), (float)(-Math.abs(MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f3 * (float)Math.PI) * f4)), (float)0.0f);
            GL11.glRotatef((float)(MathHelper.lllIIIllIIIIlllIlIIllIIll(f3 * (float)Math.PI) * f4 * 3.0f), (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)(Math.abs(MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f3 * (float)Math.PI - 0.2f) * f4) * 5.0f), (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)f5, (float)1.0f, (float)0.0f, (float)0.0f);
        }
    }

    private void IIIllIIlIIIIIIlIlIIllIIlI(float f) {
        class_1488 class_14882 = LunarClient.getInstance().getModuleManager().IlIIIlIIIIllIIIllIIIIIIll;
        class_1965 class_19652 = this.llIIlIlIlllIIllIlIlllIllI.llIIlllIllIllllIIIlIIIIII;
        float f2 = class_19652.llllIlIIIIIIIIIlllIIlIIIl - 1.62f;
        double d = class_19652.llIIlIllIllllIlIIIIlIIlll + (class_19652.IlIIlllllIIlIlIlllllIllll - class_19652.llIIlIllIllllIlIIIIlIIlll) * (double)f;
        double d2 = class_19652.llIllllIlIllIIIlIllIIlIlI + (class_19652.llIIlIlIlllIIllIlIlllIllI - class_19652.llIllllIlIllIIIlIllIIlIlI) * (double)f - (double)f2;
        double d3 = class_19652.lIlllIlllIlIIIIlllIlIlIIl + (class_19652.IllIIIIllIIllIllIlllIlIIl - class_19652.lIlllIlllIlIIIIlllIlIlIIl) * (double)f;
        GL11.glRotatef((float)(this.lIIIlIIIlIlllIllIIIlIIIlI + (this.lIIIllIIIIIllllIlIlIllIll - this.lIIIlIIIlIlllIllIIIlIIIlI) * f), (float)0.0f, (float)0.0f, (float)1.0f);
        if (class_19652.IIIIIllIIlIlIlIIlIlIlIllI()) {
            f2 = (float)((double)f2 + 1.0);
            GL11.glTranslatef((float)0.0f, (float)0.3f, (float)0.0f);
            if (!this.llIIlIlIlllIIllIlIlllIllI.gameSettings.IIIIlllllIlllIIllIIIlIllI) {
                Block class_05492 = this.llIIlIlIlllIIllIlIlllIllI.theWorld.a_(MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19652.IlIIlllllIIlIlIlllllIllll), MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19652.llIIlIlIlllIIllIlIlllIllI), MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19652.IllIIIIllIIllIllIlllIlIIl));
                if (class_05492 == Blocks.IllIIIIllIIllIllIlllIlIIl) {
                    int n = this.llIIlIlIlllIIllIlIlllIllI.theWorld.IlIllllllIIlIIllllIIlIIIl(MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19652.IlIIlllllIIlIlIlllllIllll), MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19652.llIIlIlIlllIIllIlIlllIllI), MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19652.IllIIIIllIIllIllIlllIlIIl));
                    int n2 = n & 3;
                    GL11.glRotatef((float)(n2 * 90), (float)0.0f, (float)1.0f, (float)0.0f);
                }
                GL11.glRotatef((float)(class_14882.IlIllllllIIlIIllllIIlIIIl + (class_14882.lllIlIIlIIIlIlIIIllIlllIl - class_14882.IlIllllllIIlIIllllIIlIIIl) * f + 180.0f), (float)0.0f, (float)-1.0f, (float)0.0f);
                GL11.glRotatef((float)(class_14882.IlIIIIIllllllIIlllIllllll + (class_14882.lIlllIlllIIIIlIIlllIllIII - class_14882.IlIIIIIllllllIIlllIllllll) * f), (float)-1.0f, (float)0.0f, (float)0.0f);
            }
        } else if (this.llIIlIlIlllIIllIlIlllIllI.gameSettings.IIlIlIlIIlllIIIlIIIIlIIIl > 0) {
            double d4 = this.llIlllIIllIlllIlIlIlIIIll + (this.lIlIIllllIlIIIIllIIIIlIIl - this.llIlllIIllIlllIlIlIlIIIll) * f;
            if (this.llIIlIlIlllIIllIlIlllIllI.gameSettings.IIIIlllllIlllIIllIIIlIllI) {
                float f3 = this.lllIIIIIIlIlllIIlIlIIIllI + (this.IIIIlIIlIIIllIIIIllIIIlII - this.lllIIIIIIlIlllIIlIlIIIllI) * f;
                float f4 = this.lIlIlIIIIIIlIIllllIlIIllI + (this.llIIlIIllIIllIlIIllIIllII - this.lIlIlIIIIIIlIIllllIlIIllI) * f;
                GL11.glTranslatef((float)0.0f, (float)0.0f, (float)((float)(-d4)));
                GL11.glRotatef((float)f4, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)f3, (float)0.0f, (float)1.0f, (float)0.0f);
            } else {
                float f5 = class_14882.lllIlIIlIIIlIlIIIllIlllIl;
                float f6 = class_14882.lIlllIlllIIIIlIIlllIllIII;
                if (this.llIIlIlIlllIIllIlIlllIllI.gameSettings.IIlIlIlIIlllIIIlIIIIlIIIl == 2) {
                    f6 += 180.0f;
                }
                double d5 = (double)(-MathHelper.lllIIIllIIIIlllIlIIllIIll(f5 / 180.0f * (float)Math.PI) * MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f6 / 180.0f * (float)Math.PI)) * d4;
                double d6 = (double)(MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f5 / 180.0f * (float)Math.PI) * MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f6 / 180.0f * (float)Math.PI)) * d4;
                double d7 = (double)(-MathHelper.lllIIIllIIIIlllIlIIllIIll(f6 / 180.0f * (float)Math.PI)) * d4;
                for (int i = 0; i < 8; ++i) {
                    double d8;
                    class_1112 class_11122;
                    float f7 = (i & 1) * 2 - 1;
                    float f8 = (i >> 1 & 1) * 2 - 1;
                    float f9 = (i >> 2 & 1) * 2 - 1;
                    if ((class_11122 = this.llIIlIlIlllIIllIlIlllIllI.theWorld.lllIIIllIIIIlllIlIIllIIll(class_0864.lllIIIllIIIIlllIlIIllIIll(d + (double)(f7 *= 0.1f), d2 + (double)(f8 *= 0.1f), d3 + (double)(f9 *= 0.1f)), class_0864.lllIIIllIIIIlllIlIIllIIll(d - d5 + (double)f7 + (double)f9, d2 - d7 + (double)f8, d3 - d6 + (double)f9))) == null || !((d8 = class_11122.lIllllIIlIIIlIllllllIIIll.lIlllIlllIIIIlIIlllIllIII(class_0864.lllIIIllIIIIlllIlIIllIIll(d, d2, d3))) < d4)) continue;
                    d4 = d8;
                }
                if (this.llIIlIlIlllIIllIlIlllIllI.gameSettings.IIlIlIlIIlllIIIlIIIIlIIIl == 2) {
                    GL11.glRotatef((float)180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                }
                GL11.glRotatef((float)(class_14882.lIlllIlllIIIIlIIlllIllIII - f6), (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)(class_14882.lllIlIIlIIIlIlIIIllIlllIl - f5), (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glTranslatef((float)0.0f, (float)0.0f, (float)((float)(-d4)));
                GL11.glRotatef((float)(f5 - class_14882.lllIlIIlIIIlIlIIIllIlllIl), (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)(f6 - class_14882.lIlllIlllIIIIlIIlllIllIII), (float)1.0f, (float)0.0f, (float)0.0f);
            }
        } else {
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)-0.1f);
        }
        if (!this.llIIlIlIlllIIllIlIlllIllI.gameSettings.IIIIlllllIlllIIllIIIlIllI) {
            GL11.glRotatef((float)(class_14882.IlIIIIIllllllIIlllIllllll + (class_14882.lIlllIlllIIIIlIIlllIllIII - class_14882.IlIIIIIllllllIIlllIllllll) * f), (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)(class_14882.IlIllllllIIlIIllllIIlIIIl + (class_14882.lllIlIIlIIIlIlIIIllIlllIl - class_14882.IlIllllllIIlIIllllIIlIIIl) * f + 180.0f), (float)0.0f, (float)1.0f, (float)0.0f);
        }
        GL11.glTranslatef((float)0.0f, (float)f2, (float)0.0f);
        d = class_19652.llIIlIllIllllIlIIIIlIIlll + (class_19652.IlIIlllllIIlIlIlllllIllll - class_19652.llIIlIllIllllIlIIIIlIIlll) * (double)f;
        d2 = class_19652.llIllllIlIllIIIlIllIIlIlI + (class_19652.llIIlIlIlllIIllIlIlllIllI - class_19652.llIllllIlIllIIIlIllIIlIlI) * (double)f - (double)f2;
        d3 = class_19652.lIlllIlllIlIIIIlllIlIlIIl + (class_19652.IllIIIIllIIllIllIlllIlIIl - class_19652.lIlllIlllIlIIIIlllIlIlIIl) * (double)f;
        this.IIIlIlIllIlllllIlIllllllI = this.llIIlIlIlllIIllIlIlllIllI.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(d, d2, d3, f);
    }

    private void IllIIlllllllIIlIIlIIIIlIl(float f) {
        class_1965 class_19652 = this.llIIlIlIlllIIllIlIlllIllI.llIIlllIllIllllIIIlIIIIII;
        float f2 = class_19652.llllIlIIIIIIIIIlllIIlIIIl - 1.62f;
        double d = class_19652.llIIlIllIllllIlIIIIlIIlll + (class_19652.IlIIlllllIIlIlIlllllIllll - class_19652.llIIlIllIllllIlIIIIlIIlll) * (double)f;
        double d2 = class_19652.llIllllIlIllIIIlIllIIlIlI + (class_19652.llIIlIlIlllIIllIlIlllIllI - class_19652.llIllllIlIllIIIlIllIIlIlI) * (double)f - (double)f2;
        double d3 = class_19652.lIlllIlllIlIIIIlllIlIlIIl + (class_19652.IllIIIIllIIllIllIlllIlIIl - class_19652.lIlllIlllIlIIIIlllIlIlIIl) * (double)f;
        GL11.glRotatef((float)(this.lIIIlIIIlIlllIllIIIlIIIlI + (this.lIIIllIIIIIllllIlIlIllIll - this.lIIIlIIIlIlllIllIIIlIIIlI) * f), (float)0.0f, (float)0.0f, (float)1.0f);
        if (class_19652.IIIIIllIIlIlIlIIlIlIlIllI()) {
            f2 = (float)((double)f2 + 1.0);
            GL11.glTranslatef((float)0.0f, (float)0.3f, (float)0.0f);
            if (!this.llIIlIlIlllIIllIlIlllIllI.gameSettings.IIIIlllllIlllIIllIIIlIllI) {
                Block class_05492 = this.llIIlIlIlllIIllIlIlllIllI.theWorld.a_(MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19652.IlIIlllllIIlIlIlllllIllll), MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19652.llIIlIlIlllIIllIlIlllIllI), MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19652.IllIIIIllIIllIllIlllIlIIl));
                if (class_05492 == Blocks.IllIIIIllIIllIllIlllIlIIl) {
                    int n = this.llIIlIlIlllIIllIlIlllIllI.theWorld.IlIllllllIIlIIllllIIlIIIl(MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19652.IlIIlllllIIlIlIlllllIllll), MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19652.llIIlIlIlllIIllIlIlllIllI), MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19652.IllIIIIllIIllIllIlllIlIIl));
                    int n2 = n & 3;
                    GL11.glRotatef((float)(n2 * 90), (float)0.0f, (float)1.0f, (float)0.0f);
                }
                GL11.glRotatef((float)(class_19652.llllIIIIlIIIlIIIIIIlIllll + (class_19652.IIIIlIllIlIIlIIlIllIlIlll - class_19652.llllIIIIlIIIlIIIIIIlIllll) * f + 180.0f), (float)0.0f, (float)-1.0f, (float)0.0f);
                GL11.glRotatef((float)(class_19652.llIIIIllIIIIIIIlIIIlIIIIl + (class_19652.IlIlIIlllIllllllllIIIlIlI - class_19652.llIIIIllIIIIIIIlIIIlIIIIl) * f), (float)-1.0f, (float)0.0f, (float)0.0f);
            }
        } else if (this.llIIlIlIlllIIllIlIlllIllI.gameSettings.IIlIlIlIIlllIIIlIIIIlIIIl > 0) {
            double d4 = this.llIlllIIllIlllIlIlIlIIIll + (this.lIlIIllllIlIIIIllIIIIlIIl - this.llIlllIIllIlllIlIlIlIIIll) * f;
            if (this.llIIlIlIlllIIllIlIlllIllI.gameSettings.IIIIlllllIlllIIllIIIlIllI) {
                float f3 = this.lllIIIIIIlIlllIIlIlIIIllI + (this.IIIIlIIlIIIllIIIIllIIIlII - this.lllIIIIIIlIlllIIlIlIIIllI) * f;
                float f4 = this.lIlIlIIIIIIlIIllllIlIIllI + (this.llIIlIIllIIllIlIIllIIllII - this.lIlIlIIIIIIlIIllllIlIIllI) * f;
                GL11.glTranslatef((float)0.0f, (float)0.0f, (float)((float)(-d4)));
                GL11.glRotatef((float)f4, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)f3, (float)0.0f, (float)1.0f, (float)0.0f);
            } else {
                float f5 = class_19652.IIIIlIllIlIIlIIlIllIlIlll;
                float f6 = class_19652.IlIlIIlllIllllllllIIIlIlI;
                if (this.llIIlIlIlllIIllIlIlllIllI.gameSettings.IIlIlIlIIlllIIIlIIIIlIIIl == 2) {
                    f6 += 180.0f;
                }
                double d5 = (double)(-MathHelper.lllIIIllIIIIlllIlIIllIIll(f5 / 180.0f * (float)Math.PI) * MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f6 / 180.0f * (float)Math.PI)) * d4;
                double d6 = (double)(MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f5 / 180.0f * (float)Math.PI) * MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f6 / 180.0f * (float)Math.PI)) * d4;
                double d7 = (double)(-MathHelper.lllIIIllIIIIlllIlIIllIIll(f6 / 180.0f * (float)Math.PI)) * d4;
                for (int i = 0; i < 8; ++i) {
                    double d8;
                    class_1112 class_11122;
                    float f7 = (i & 1) * 2 - 1;
                    float f8 = (i >> 1 & 1) * 2 - 1;
                    float f9 = (i >> 2 & 1) * 2 - 1;
                    if ((class_11122 = this.llIIlIlIlllIIllIlIlllIllI.theWorld.lllIIIllIIIIlllIlIIllIIll(class_0864.lllIIIllIIIIlllIlIIllIIll(d + (double)(f7 *= 0.1f), d2 + (double)(f8 *= 0.1f), d3 + (double)(f9 *= 0.1f)), class_0864.lllIIIllIIIIlllIlIIllIIll(d - d5 + (double)f7 + (double)f9, d2 - d7 + (double)f8, d3 - d6 + (double)f9))) == null || !((d8 = class_11122.lIllllIIlIIIlIllllllIIIll.lIlllIlllIIIIlIIlllIllIII(class_0864.lllIIIllIIIIlllIlIIllIIll(d, d2, d3))) < d4)) continue;
                    d4 = d8;
                }
                if (this.llIIlIlIlllIIllIlIlllIllI.gameSettings.IIlIlIlIIlllIIIlIIIIlIIIl == 2) {
                    GL11.glRotatef((float)180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                }
                GL11.glRotatef((float)(class_19652.IlIlIIlllIllllllllIIIlIlI - f6), (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)(class_19652.IIIIlIllIlIIlIIlIllIlIlll - f5), (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glTranslatef((float)0.0f, (float)0.0f, (float)((float)(-d4)));
                GL11.glRotatef((float)(f5 - class_19652.IIIIlIllIlIIlIIlIllIlIlll), (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)(f6 - class_19652.IlIlIIlllIllllllllIIIlIlI), (float)1.0f, (float)0.0f, (float)0.0f);
            }
        } else {
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)-0.1f);
        }
        if (!this.llIIlIlIlllIIllIlIlllIllI.gameSettings.IIIIlllllIlllIIllIIIlIllI) {
            GL11.glRotatef((float)(class_19652.llIIIIllIIIIIIIlIIIlIIIIl + (class_19652.IlIlIIlllIllllllllIIIlIlI - class_19652.llIIIIllIIIIIIIlIIIlIIIIl) * f), (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)(class_19652.llllIIIIlIIIlIIIIIIlIllll + (class_19652.IIIIlIllIlIIlIIlIllIlIlll - class_19652.llllIIIIlIIIlIIIIIIlIllll) * f + 180.0f), (float)0.0f, (float)1.0f, (float)0.0f);
        }
        GL11.glTranslatef((float)0.0f, (float)f2, (float)0.0f);
        d = class_19652.llIIlIllIllllIlIIIIlIIlll + (class_19652.IlIIlllllIIlIlIlllllIllll - class_19652.llIIlIllIllllIlIIIIlIIlll) * (double)f;
        d2 = class_19652.llIllllIlIllIIIlIllIIlIlI + (class_19652.llIIlIlIlllIIllIlIlllIllI - class_19652.llIllllIlIllIIIlIllIIlIlI) * (double)f - (double)f2;
        d3 = class_19652.lIlllIlllIlIIIIlllIlIlIIl + (class_19652.IllIIIIllIIllIllIlllIlIIl - class_19652.lIlllIlllIlIIIIlllIlIlIIl) * (double)f;
        this.IIIlIlIllIlllllIlIllllllI = this.llIIlIlIlllIIllIlIlllIllI.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(d, d2, d3, f);
    }

    private void lllIIIllIIIIlllIlIIllIIll(float f, int n, boolean bl) {
        int n2;
        float f2;
        float f3;
        this.IllIIIIllIIllIllIlllIlIIl = this.llIIlIlIlllIIllIlIlllIllI.gameSettings.IlIllllllIIlIIllllIIlIIIl * 16;
        if (Config.IlIlllIIIIIIlIIllIIllIlll()) {
            this.IllIIIIllIIllIllIlllIlIIl *= 0.95f;
        }
        if (Config.IlIlIIlIlIllIIlIlIIllIIIl()) {
            this.IllIIIIllIIllIllIlllIlIIl *= 0.83f;
        }
        GL11.glMatrixMode((int)5889);
        GL11.glLoadIdentity();
        float f4 = 0.07f;
        if (this.llIIlIlIlllIIllIlIlllIllI.gameSettings.IlIIIIIllllllIIlllIllllll) {
            GL11.glTranslatef((float)((float)(-(n * 2 - 1)) * f4), (float)0.0f, (float)0.0f);
        }
        if ((f3 = this.IllIIIIllIIllIllIlllIlIIl * 2.0f) < 128.0f) {
            f3 = 128.0f;
        }
        if (this.llIIlIlIlllIIllIlIlllIllI.theWorld.IlIlIIlllIIlIllIIIlllllIl.IIIllIllIIlIlIlIlIllllIIl == 1) {
            f3 = 256.0f;
        }
        if (this.lIlllIIllIIIIIIlIlIIlIllI != 1.0) {
            GL11.glTranslatef((float)((float)this.llIIIlIlIlIIlIllIIIllIlIl), (float)((float)(-this.lIIlIIlIllIlIIlIlIIlIlIlI)), (float)0.0f);
            GL11.glScaled((double)this.lIlllIIllIIIIIIlIlIIlIllI, (double)this.lIlllIIllIIIIIIlIlIIlIllI, (double)1.0);
        }
        Project.gluPerspective((float)this.lllIIIllIIIIlllIlIIllIIll(f, true), (float)((float)this.llIIlIlIlllIIllIlIlllIllI.displayWidth / (float)this.llIIlIlIlllIIllIlIlllIllI.displayHeight), (float)0.05f, (float)f3);
        if (this.llIIlIlIlllIIllIlIlllIllI.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll()) {
            f2 = 0.6666667f;
            GL11.glScalef((float)1.0f, (float)f2, (float)1.0f);
        }
        GL11.glMatrixMode((int)5888);
        GL11.glLoadIdentity();
        if (this.llIIlIlIlllIIllIlIlllIllI.gameSettings.IlIIIIIllllllIIlllIllllll) {
            GL11.glTranslatef((float)((float)(n * 2 - 1) * 0.1f), (float)0.0f, (float)0.0f);
        }
        this.IlIIIIIllllllIIlllIllllll(f);
        if (this.llIIlIlIlllIIllIlIlllIllI.gameSettings.lIlllIlllIIIIlIIlllIllIII) {
            this.lIllllIIlIIIlIllllllIIIll(f);
        }
        if ((f2 = this.llIIlIlIlllIIllIlIlllIllI.lIIIIlIlIIlllllIIllIIlIII.llIIllIllIlIIlIIllIllllll + (this.llIIlIlIlllIIllIlIlllIllI.lIIIIlIlIIlllllIIllIIlIII.llIIlllIllIllllIIIlIIIIII - this.llIIlIlIlllIIllIlIlllIllI.lIIIIlIlIIlllllIIllIIlIII.llIIllIllIlIIlIIllIllllll) * f) > 0.0f) {
            n2 = 20;
            if (this.llIIlIlIlllIIllIlIlllIllI.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(class_0700.lIIIIlIlIIlllllIIllIIlIII)) {
                n2 = 7;
            }
            float f5 = 5.0f / (f2 * f2 + 5.0f) - f2 * 0.04f;
            f5 *= f5;
            GL11.glRotatef((float)(((float)this.IIlIIlIlIlIllIIlIlIIIIlll + f) * (float)n2), (float)0.0f, (float)1.0f, (float)1.0f);
            GL11.glScalef((float)(1.0f / f5), (float)1.0f, (float)1.0f);
            GL11.glRotatef((float)(-((float)this.IIlIIlIlIlIllIIlIlIIIIlll + f) * (float)n2), (float)0.0f, (float)1.0f, (float)1.0f);
        }
        if (bl) {
            this.IIIllIIlIIIIIIlIlIIllIIlI(f);
        } else {
            this.IllIIlllllllIIlIIlIIIIlIl(f);
        }
        if (this.IlIlIIlIlIllIIlIlIIllIIIl > 0) {
            n2 = this.IlIlIIlIlIllIIlIlIIllIIIl - 1;
            if (n2 == 1) {
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            }
            if (n2 == 2) {
                GL11.glRotatef((float)180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            }
            if (n2 == 3) {
                GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            }
            if (n2 == 4) {
                GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            }
            if (n2 == 5) {
                GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            }
        }
    }

    private void lllIIIllIIIIlllIlIIllIIll(float f, int n) {
        if (this.IlIlIIlIlIllIIlIlIIllIIIl <= 0) {
            GL11.glMatrixMode((int)5889);
            GL11.glLoadIdentity();
            float f2 = 0.07f;
            if (this.llIIlIlIlllIIllIlIlllIllI.gameSettings.IlIIIIIllllllIIlllIllllll) {
                GL11.glTranslatef((float)((float)(-(n * 2 - 1)) * f2), (float)0.0f, (float)0.0f);
            }
            if (this.lIlllIIllIIIIIIlIlIIlIllI != 1.0) {
                GL11.glTranslatef((float)((float)this.llIIIlIlIlIIlIllIIIllIlIl), (float)((float)(-this.lIIlIIlIllIlIIlIlIIlIlIlI)), (float)0.0f);
                GL11.glScaled((double)this.lIlllIIllIIIIIIlIlIIlIllI, (double)this.lIlllIIllIIIIIIlIlIIlIllI, (double)1.0);
            }
            Project.gluPerspective((float)this.lllIIIllIIIIlllIlIIllIIll(f, false), (float)((float)this.llIIlIlIlllIIllIlIlllIllI.displayWidth / (float)this.llIIlIlIlllIIllIlIlllIllI.displayHeight), (float)0.05f, (float)(this.IllIIIIllIIllIllIlllIlIIl * 2.0f));
            if (this.llIIlIlIlllIIllIlIlllIllI.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll()) {
                float f3 = 0.6666667f;
                GL11.glScalef((float)1.0f, (float)f3, (float)1.0f);
            }
            GL11.glMatrixMode((int)5888);
            GL11.glLoadIdentity();
            if (this.llIIlIlIlllIIllIlIlllIllI.gameSettings.IlIIIIIllllllIIlllIllllll) {
                GL11.glTranslatef((float)((float)(n * 2 - 1) * 0.1f), (float)0.0f, (float)0.0f);
            }
            GL11.glPushMatrix();
            this.IlIIIIIllllllIIlllIllllll(f);
            if (this.llIIlIlIlllIIllIlIlllIllI.gameSettings.lIlllIlllIIIIlIIlllIllIII) {
                this.lIllllIIlIIIlIllllllIIIll(f);
            }
            if (!(this.llIIlIlIlllIIllIlIlllIllI.gameSettings.IIlIlIlIIlllIIIlIIIIlIIIl != 0 || this.llIIlIlIlllIIllIlIlllIllI.llIIlllIllIllllIIIlIIIIII.IIIIIllIIlIlIlIIlIlIlIllI() || this.llIIlIlIlllIIllIlIlllIllI.gameSettings.lIllIIlllIIIlIlIIIlllIlIl || this.llIIlIlIlllIIllIlIlllIllI.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll())) {
                this.lllIlIIlIIIlIlIIIllIlllIl((double)f);
                this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(f);
                this.lllIIIllIIIIlllIlIIllIIll((double)f);
            }
            GL11.glPopMatrix();
            if (this.llIIlIlIlllIIllIlIlllIllI.gameSettings.IIlIlIlIIlllIIIlIIIIlIIIl == 0 && !this.llIIlIlIlllIIllIlIlllIllI.llIIlllIllIllllIIIlIIIIII.IIIIIllIIlIlIlIIlIlIlIllI()) {
                this.IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl(f);
                this.IlIIIIIllllllIIlllIllllll(f);
            }
            if (this.llIIlIlIlllIIllIlIlllIllI.gameSettings.lIlllIlllIIIIlIIlllIllIII) {
                this.lIllllIIlIIIlIllllllIIIll(f);
            }
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(double d) {
        OpenGlHelper.IllIIIllIIIIlIlIlIllIIlll(OpenGlHelper.IlIllllllIIlIIllllIIlIIIl);
        GL11.glDisable((int)3553);
        OpenGlHelper.IllIIIllIIIIlIlIlIllIIlll(OpenGlHelper.lllIlIIlIIIlIlIIIllIlllIl);
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(double d) {
        OpenGlHelper.IllIIIllIIIIlIlIlIllIIlll(OpenGlHelper.IlIllllllIIlIIllllIIlIIIl);
        GL11.glMatrixMode((int)5890);
        GL11.glLoadIdentity();
        float f = 0.00390625f;
        GL11.glScalef((float)f, (float)f, (float)f);
        GL11.glTranslatef((float)8.0f, (float)8.0f, (float)8.0f);
        GL11.glMatrixMode((int)5888);
        this.llIIlIlIlllIIllIlIlllIllI.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(this.IllIlIlIIIlllIIllIIIIlIll);
        GL11.glTexParameteri((int)3553, (int)10241, (int)9729);
        GL11.glTexParameteri((int)3553, (int)10240, (int)9729);
        GL11.glTexParameteri((int)3553, (int)10242, (int)10496);
        GL11.glTexParameteri((int)3553, (int)10243, (int)10496);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glEnable((int)3553);
        OpenGlHelper.IllIIIllIIIIlIlIlIllIIlll(OpenGlHelper.lllIlIIlIIIlIlIIIllIlllIl);
    }

    private void llIIlllIllIllllIIIlIIIIII() {
        this.IIIllIIlIIIIIIlIlIIllIIlI = (float)((double)this.IIIllIIlIIIIIIlIlIIllIIlI + (Math.random() - Math.random()) * Math.random() * Math.random());
        this.IIIllIllIIlIlIlIlIllllIIl = (float)((double)this.IIIllIllIIlIlIlIlIllllIIl + (Math.random() - Math.random()) * Math.random() * Math.random());
        this.IIIllIIlIIIIIIlIlIIllIIlI = (float)((double)this.IIIllIIlIIIIIIlIlIIllIIlI * 0.9);
        this.IIIllIllIIlIlIlIlIllllIIl = (float)((double)this.IIIllIllIIlIlIlIlIllllIIl * 0.9);
        this.lIllllIIlIIIlIllllllIIIll += (this.IIIllIIlIIIIIIlIlIIllIIlI - this.lIllllIIlIIIlIllllllIIIll) * 1.0f;
        this.IllIIlllllllIIlIIlIIIIlIl += (this.IIIllIllIIlIlIlIlIllllIIl - this.IllIIlllllllIIlIIlIIIIlIl) * 1.0f;
        this.IlIIIIIllIlllIIIIlIIIllIl = true;
    }

    private void IIIllIllIIlIlIlIlIllllIIl(float f) {
        class_0564 class_05642 = this.llIIlIlIlllIIllIlIlllIllI.theWorld;
        if (class_05642 != null) {
            if (class_1689.lllIIIllIIIIlllIlIIllIIll(class_05642, this.lIllllIIlIIIlIllllllIIIll, this.IllllIIlIIIllIlllIlllIllI, this.llIIlIlIlllIIllIlIlllIllI.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(class_0700.IlIlIIlllIIlIllIIIlllllIl))) {
                this.IIlIllIIlllllIIlIIllllIIl.lllIlIIlIIIlIlIIIllIlllIl();
                this.IlIIIIIllIlllIIIIlIIIllIl = false;
                return;
            }
            for (int i = 0; i < 256; ++i) {
                float f2;
                float f3;
                float f4 = class_05642.lllIlIIlIIIlIlIIIllIlllIl(1.0f) * 0.95f + 0.05f;
                float f5 = class_05642.IlIlIIlllIIlIllIIIlllllIl.IllIIlllllllIIlIIlIIIIlIl[i / 16] * f4;
                float f6 = class_05642.IlIlIIlllIIlIllIIIlllllIl.IllIIlllllllIIlIIlIIIIlIl[i % 16] * (this.lIllllIIlIIIlIllllllIIIll * 0.1f + 1.5f);
                if (class_05642.IlIlllIIIIIIlIIllIIllIlll > 0) {
                    f5 = class_05642.IlIlIIlllIIlIllIIIlllllIl.IllIIlllllllIIlIIlIIIIlIl[i / 16];
                }
                float f7 = f5 * (class_05642.lllIlIIlIIIlIlIIIllIlllIl(1.0f) * 0.65f + 0.35f);
                float f8 = f5 * (class_05642.lllIlIIlIIIlIlIIIllIlllIl(1.0f) * 0.65f + 0.35f);
                float f9 = f6 * ((f6 * 0.6f + 0.4f) * 0.6f + 0.4f);
                float f10 = f6 * (f6 * f6 * 0.6f + 0.4f);
                float f11 = f7 + f6;
                float f12 = f8 + f9;
                float f13 = f5 + f10;
                f11 = f11 * 0.96f + 0.03f;
                f12 = f12 * 0.96f + 0.03f;
                f13 = f13 * 0.96f + 0.03f;
                if (this.IlllIIIllllIIllIllIlIIlIl > 0.0f) {
                    f3 = this.lllIIIlIIlIlIllIIIIIlIIll + (this.IlllIIIllllIIllIllIlIIlIl - this.lllIIIlIIlIlIllIIIIIlIIll) * f;
                    f11 = f11 * (1.0f - f3) + f11 * 0.7f * f3;
                    f12 = f12 * (1.0f - f3) + f12 * 0.6f * f3;
                    f13 = f13 * (1.0f - f3) + f13 * 0.6f * f3;
                }
                if (class_05642.IlIlIIlllIIlIllIIIlllllIl.IIIllIllIIlIlIlIlIllllIIl == 1) {
                    f11 = 0.22f + f6 * 0.75f;
                    f12 = 0.28f + f9 * 0.75f;
                    f13 = 0.25f + f10 * 0.75f;
                }
                if (this.llIIlIlIlllIIllIlIlllIllI.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(class_0700.IlIlIIlllIIlIllIIIlllllIl)) {
                    f3 = this.lllIIIllIIIIlllIlIIllIIll(this.llIIlIlIlllIIllIlIlllIllI.lIIIIlIlIIlllllIIllIIlIII, f);
                    f2 = 1.0f / f11;
                    if (f2 > 1.0f / f12) {
                        f2 = 1.0f / f12;
                    }
                    if (f2 > 1.0f / f13) {
                        f2 = 1.0f / f13;
                    }
                    f11 = f11 * (1.0f - f3) + f11 * f2 * f3;
                    f12 = f12 * (1.0f - f3) + f12 * f2 * f3;
                    f13 = f13 * (1.0f - f3) + f13 * f2 * f3;
                }
                if (f11 > 1.0f) {
                    f11 = 1.0f;
                }
                if (f12 > 1.0f) {
                    f12 = 1.0f;
                }
                if (f13 > 1.0f) {
                    f13 = 1.0f;
                }
                f3 = this.llIIlIlIlllIIllIlIlllIllI.gameSettings.lllIIIllIIIIlllIlIIllIIll();
                f2 = 1.0f - f11;
                float f14 = 1.0f - f12;
                float f15 = 1.0f - f13;
                f2 = 1.0f - f2 * f2 * f2 * f2;
                f14 = 1.0f - f14 * f14 * f14 * f14;
                f15 = 1.0f - f15 * f15 * f15 * f15;
                f11 = f11 * (1.0f - f3) + f2 * f3;
                f12 = f12 * (1.0f - f3) + f14 * f3;
                f13 = f13 * (1.0f - f3) + f15 * f3;
                f11 = f11 * 0.96f + 0.03f;
                f12 = f12 * 0.96f + 0.03f;
                f13 = f13 * 0.96f + 0.03f;
                if (f11 > 1.0f) {
                    f11 = 1.0f;
                }
                if (f12 > 1.0f) {
                    f12 = 1.0f;
                }
                if (f13 > 1.0f) {
                    f13 = 1.0f;
                }
                if (f11 < 0.0f) {
                    f11 = 0.0f;
                }
                if (f12 < 0.0f) {
                    f12 = 0.0f;
                }
                if (f13 < 0.0f) {
                    f13 = 0.0f;
                }
                int n = 255;
                int n2 = (int)(f11 * 255.0f);
                int n3 = (int)(f12 * 255.0f);
                int n4 = (int)(f13 * 255.0f);
                this.IllllIIlIIIllIlllIlllIllI[i] = n << 24 | n2 << 16 | n3 << 8 | n4;
            }
            this.IIlIllIIlllllIIlIIllllIIl.lllIlIIlIIIlIlIIIllIlllIl();
            this.IlIIIIIllIlllIIIIlIIIllIl = false;
        }
    }

    private float lllIIIllIIIIlllIlIIllIIll(class_0814 class_08142, float f) {
        int n = class_08142.lllIlIIlIIIlIlIIIllIlllIl(class_0700.IlIlIIlllIIlIllIIIlllllIl).lllIlIIlIIIlIlIIIllIlllIl();
        return n > 200 ? 1.0f : 0.7f + MathHelper.lllIIIllIIIIlllIlIIllIIll(((float)n - f) * (float)Math.PI * 0.2f) * 0.3f;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(float f) {
        int n;
        Object object;
        Object object2;
        this.llIIlIlIlllIIllIlIlllIllI.mcProfiler.startSection("lightTex");
        if (!this.lIIllllllllIlIllllllllIlI) {
            class_1384.IlIllllllIIlIIllllIIlIIIl();
            class_1670.IlIllllllIIlIIllllIIlIIIl();
            this.IlIllllllIIlIIllllIIlIIIl = object2 = new class_1767(this.llIIlIlIlllIIllIlIlllIllI);
            class_2114.lllIIIllIIIIlllIlIIllIIll.lIllllIIlIIIlIllllllIIIll = object2;
            if (Config.IIIIlIIIllIIIlIIlIIIIIlll() == 64 && Config.lIIIIIlIllIllIlIlIIllllll() == 32) {
                Config.lllIIIllIIIIlllIlIIllIIll(true);
            }
            this.lIIllllllllIlIllllllllIlI = true;
        }
        Config.lIIIllIlIlIlIIIllIlIlIllI();
        object2 = this.llIIlIlIlllIIllIlIlllIllI.theWorld;
        if (object2 != null) {
            Object object3;
            if (Config.llllIIIlIlIlIlIIlIIIIIlIl() != null) {
                object3 = "HD_U".replace("HD_U", "HD Ultra").replace("L", "Light");
                object = (String)object3 + " " + Config.llllIIIlIlIlIlIIlIIIIIlIl();
                class_0722 class_07222 = new class_0722("A new \u00a7eOptiFine\u00a7f version is available: \u00a7e" + (String)object + "\u00a7f");
                this.llIIlIlIlllIIllIlIlllIllI.IlIIIlIIIIllIIIllIIIIIIll.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(class_07222);
                Config.lIllllIIlIIIlIllllllIIIll(null);
            }
            if (Config.lIIIlllIlIIIlIllIIIlIllll()) {
                Config.lllIIIllIIIIlllIlIIllIIll(false);
                object3 = new class_0722(class_0616.lllIIIllIIIIlllIlIIllIIll("You can install \u00a7e64-bit Java\u00a7f to increase performance", new Object[0]));
                this.llIIlIlIlllIIllIlIlllIllI.IlIIIlIIIIllIIIllIIIIIIll.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll((IChatComponent)object3);
            }
        }
        if (this.llIIlIlIlllIIllIlIlllIllI.lllllIlllIIllIlIIlIIIllII instanceof class_2097) {
            this.lllIIIllIIIIlllIlIIllIIll((class_2097)this.llIIlIlIlllIIllIlIlllIllI.lllllIlllIIllIlIIlIIIllII);
        }
        if (this.lIIIIllIIllIIIlIIIllIllII != object2) {
            class_1630.lllIIIllIIIIlllIlIIllIIll(this.lIIIIllIIllIIIlIIIllIllII, (class_1334)object2);
            Config.IllIIlllllllIIlIIlIIIIlIl();
            this.IllIIllIlIlllIllIllIlIIIl = 0L;
            this.IIIlIllllIIIlllllIllIlIII = 0;
            this.lIIIIllIIllIIIlIIIllIllII = object2;
        }
        class_1333.lIllllIIlIIIlIllllllIIIll = Config.llIIIlllIlllIlIllIIIIllIl() || Config.IlllIIlllllllIIllIlIllllI();
        Blocks.lIlIlIIlIIIIlIIIIIlllIIII.lllIlIIlIIIlIlIIIllIlllIl(Config.IIlIIlIlIlIllIIlIlIIIIlll());
        if (this.IlIIIIIllIlllIIIIlIIIllIl) {
            this.IIIllIllIIlIlIlIlIllllIIl(f);
        }
        this.llIIlIlIlllIIllIlIlllIllI.mcProfiler.endSection();
        boolean bl = Display.isActive();
        if (!(bl || !this.llIIlIlIlllIIllIlIlllIllI.gameSettings.IIIIIlllIIllllIlllIlllIIl || this.llIIlIlIlllIIllIlIlllIllI.gameSettings.IllIlIlIIIlIllIlIlIIlllII && Mouse.isButtonDown((int)1))) {
            if (Minecraft.llllllIlIllllIlIlIlIIIIlI() - this.llIIIIIlIIlIIIIllIIIlIIII > 500L) {
                this.llIIlIlIlllIIllIlIlllIllI.IlIlIIlIlIllIIlIlIIllIIIl();
            }
        } else {
            this.llIIIIIlIIlIIIIllIIIlIIII = Minecraft.llllllIlIllllIlIlIlIIIIlI();
        }
        this.llIIlIlIlllIIllIlIlllIllI.mcProfiler.startSection("mouse");
        if (this.llIIlIlIlllIIllIlIlllIllI.IIlIIlIlIlIllIIlIlIIIIlll && bl) {
            float f2;
            this.llIIlIlIlllIIllIlIlllIllI.llIllllIlIllIIIlIllIIlIlI.IlIllllllIIlIIllllIIlIIIl();
            float f3 = this.llIIlIlIlllIIllIlIlllIllI.gameSettings.lllIIIllIIIIlllIlIIllIIll * 0.6f + 0.2f;
            float f4 = f3 * f3 * f3 * 8.0f;
            float f5 = (float)this.llIIlIlIlllIIllIlIlllIllI.llIllllIlIllIIIlIllIIlIlI.lllIIIllIIIIlllIlIIllIIll * f4;
            float f6 = (float)this.llIIlIlIlllIIllIlIlllIllI.llIllllIlIllIIIlIllIIlIlI.lllIlIIlIIIlIlIIIllIlllIl * f4;
            n = 1;
            if (this.llIIlIlIlllIIllIlIlllIllI.gameSettings.lllIlIIlIIIlIlIIIllIlllIl) {
                n = -1;
            }
            class_1488 class_14882 = LunarClient.getInstance().getModuleManager().IlIIIlIIIIllIIIllIIIIIIll;
            if (!class_14882.lllIIIllIIIIlllIlIIllIIll) {
                if (this.llIIlIlIlllIIllIlIlllIllI.gameSettings.IIlIlIIIlIIllIlIlIlIlIIll) {
                    this.IllllIIIIlIIlIIIIlllIIIIl += f5;
                    this.llllIlIIIIIIIIIlllIIlIIIl += f6;
                    f2 = f - this.llIlIIlllIIIIIllIIlIlIIII;
                    this.llIlIIlllIIIIIllIIlIlIIII = f;
                    f5 = this.IIIIlIlIIlIIIIlIlllIlIIII * f2;
                    f6 = this.lllIIIIlIlIIlIIlllIIIIIIl * f2;
                    this.llIIlIlIlllIIllIlIlllIllI.lIIIIlIlIIlllllIIllIIlIII.IIIllIIlIIIIIIlIlIIllIIlI(f5, f6 * (float)n);
                } else {
                    this.llIIlIlIlllIIllIlIlllIllI.lIIIIlIlIIlllllIIllIIlIII.IIIllIIlIIIIIIlIlIIllIIlI(f5, f6 * (float)n);
                }
            } else if (this.llIIlIlIlllIIllIlIlllIllI.gameSettings.IIlIlIIIlIIllIlIlIlIlIIll) {
                this.IllllIIIIlIIlIIIIlllIIIIl += f5;
                this.llllIlIIIIIIIIIlllIIlIIIl += f6;
                f2 = f - this.llIlIIlllIIIIIllIIlIlIIII;
                this.llIlIIlllIIIIIllIIlIlIIII = f;
                f5 = this.IIIIlIlIIlIIIIlIlllIlIIII * f2;
                f6 = this.lllIIIIlIlIIlIIlllIIIIIIl * f2;
                class_14882.lllIIIllIIIIlllIlIIllIIll(f5, f6 * (float)n);
            } else {
                class_14882.lllIIIllIIIIlllIlIIllIIll(f5, f6 * (float)n);
            }
        }
        this.llIIlIlIlllIIllIlIlllIllI.mcProfiler.endSection();
        if (!this.llIIlIlIlllIIllIlIlllIllI.IIlllIlIlllIllIIIlllIIlIl) {
            lllIIIllIIIIlllIlIIllIIll = this.llIIlIlIlllIIllIlIlllIllI.gameSettings.IlIIIIIllllllIIlllIllllll;
            object = new class_0321(this.llIIlIlIlllIIllIlIlllIllI, this.llIIlIlIlllIIllIlIlllIllI.displayWidth, this.llIIlIlIlllIIllIlIlllIllI.displayHeight);
            int n2 = ((class_0321)object).lllIIIllIIIIlllIlIIllIIll();
            int n3 = ((class_0321)object).lllIlIIlIIIlIlIIIllIlllIl();
            int n4 = Mouse.getX() * n2 / this.llIIlIlIlllIIllIlIlllIllI.displayWidth;
            n = n3 - Mouse.getY() * n3 / this.llIIlIlIlllIIllIlIlllIllI.displayHeight - 1;
            int n5 = this.llIIlIlIlllIIllIlIlllIllI.gameSettings.IllIIlllllllIIlIIlIIIIlIl;
            if (this.llIIlIlIlllIIllIlIlllIllI.theWorld != null) {
                this.llIIlIlIlllIIllIlIlllIllI.mcProfiler.startSection("level");
                if (this.llIIlIlIlllIIllIlIlllIllI.lIIIIlIlIIlllllIIllIIlIII()) {
                    this.lllIIIllIIIIlllIlIIllIIll(f, this.lIlIlIIllIIIlllIllIIlIllI + (long)(1000000000 / n5));
                } else {
                    this.lllIIIllIIIIlllIlIIllIIll(f, 0L);
                }
                if (OpenGlHelper.IIlllIlIlllIllIIIlllIIlIl) {
                    if (this.lIlllIlllIIIIlIIlllIllIII != null) {
                        GL11.glMatrixMode((int)5890);
                        GL11.glPushMatrix();
                        GL11.glLoadIdentity();
                        this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(f);
                        GL11.glPopMatrix();
                    }
                    this.llIIlIlIlllIIllIlIlllIllI.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(true);
                }
                this.lIlIlIIllIIIlllIllIIlIllI = System.nanoTime();
                this.llIIlIlIlllIIllIlIlllIllI.mcProfiler.endStartSection("gui");
                if (!this.llIIlIlIlllIIllIlIlllIllI.gameSettings.lIllIIlllIIIlIlIIIlllIlIl || this.llIIlIlIlllIIllIlIlllIllI.lllllIlllIIllIlIIlIIIllII != null) {
                    GL11.glAlphaFunc((int)516, (float)0.1f);
                    boolean bl2 = this.llIIlIlIlllIIllIlIlllIllI.gameSettings.IIIllIllIIlIlIlIlIllllIIl;
                    if (!Config.IIIIlIllIlIIIIIllllIIlllI()) {
                        this.llIIlIlIlllIIllIlIlllIllI.gameSettings.IIIllIllIIlIlIlIlIllllIIl = false;
                    }
                    this.llIIlIlIlllIIllIlIlllIllI.IlIIIlIIIIllIIIllIIIIIIll.lllIIIllIIIIlllIlIIllIIll(f, this.llIIlIlIlllIIllIlIlllIllI.lllllIlllIIllIlIIlIIIllII != null, n4, n);
                    this.llIIlIlIlllIIllIlIlllIllI.gameSettings.IIIllIllIIlIlIlIlIllllIIl = bl2;
                    if (this.llIIlIlIlllIIllIlIlllIllI.gameSettings.IIIIlIllIlIIlIIlIllIlIlll && !this.llIIlIlIlllIIllIlIlllIllI.gameSettings.showDebugInfo) {
                        Config.IIIlIIllIIlIlIIlIIllIIIIl();
                    }
                }
                this.llIIlIlIlllIIllIlIlllIllI.mcProfiler.endSection();
            } else {
                GL11.glViewport((int)0, (int)0, (int)this.llIIlIlIlllIIllIlIlllIllI.displayWidth, (int)this.llIIlIlIlllIIllIlIlllIllI.displayHeight);
                GL11.glMatrixMode((int)5889);
                GL11.glLoadIdentity();
                GL11.glMatrixMode((int)5888);
                GL11.glLoadIdentity();
                this.IIIllIllIIlIlIlIlIllllIIl();
                this.lIlIlIIllIIIlllIllIIlIllI = System.nanoTime();
            }
            if (this.llIIlIlIlllIIllIlIlllIllI.lllllIlllIIllIlIIlIIIllII != null) {
                GL11.glClear((int)256);
                try {
                    this.llIIlIlIlllIIllIlIlllIllI.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(n4, n, f);
                    class_0713.IlIlllIIIIIIlIIllIIllIlll().lllIIlIIIllllllIIIIlIlIlI();
                }
                catch (Throwable throwable) {
                    CrashReport class_02232 = CrashReport.lllIIIllIIIIlllIlIIllIIll(throwable, "Rendering screen");
                    class_0799 class_07992 = class_02232.lllIIIllIIIIlllIlIIllIIll("Screen render details");
                    class_07992.addCrashSectionCallable("Screen name", new class_1996(this));
                    class_07992.addCrashSectionCallable("Mouse location", new class_0416(this, n4, n));
                    class_07992.addCrashSectionCallable("Screen size", new class_0290(this, (class_0321)object));
                    throw new class_0892(class_02232);
                }
            }
        }
        this.IlIlllIIIIIIlIIllIIllIlll();
        this.lllIIlIIIllllllIIIIlIlIlI();
        if (this.llIIlIlIlllIIllIlIlllIllI.gameSettings.showDebugInfo != this.lIlIIIllIIllIIlIllllllIll) {
            this.lIlIIlllllIlllllIlIIIllll = this.llIIlIlIlllIIllIlIlllIllI.gameSettings.IlIllIIIIllllIIllIllIIIIl;
            this.lIlIIIllIIllIIlIllllllIll = this.llIIlIlIlllIIllIlIlllIllI.gameSettings.showDebugInfo;
        }
        if (this.llIIlIlIlllIIllIlIlllIllI.gameSettings.showDebugInfo) {
            this.lllIIIllIIIIlllIlIIllIIll(this.llIIlIlIlllIIllIlIlllIllI.mcProfiler.timeTickNano, this.llIIlIlIlllIIllIlIlllIllI.mcProfiler.timeUpdateChunksNano);
        }
        if (this.llIIlIlIlllIIllIlIlllIllI.gameSettings.llIIIlllIlllIlIllIIIIllIl) {
            this.llIIlIlIlllIIllIlIlllIllI.gameSettings.IlIllIIIIllllIIllIllIIIIl = true;
        }
    }

    public void IlIllllllIIlIIllllIIlIIIl(float f) {
        this.IIIllIllIIlIlIlIlIllllIIl();
    }

    public void lllIIIllIIIIlllIlIIllIIll(float f, long l) {
        float f2 = ((Integer) LunarClient.getInstance().getSettingsManager().lIIlIIIIIlIlllIlIIlIlIlll.lIlllIlllIIIIlIIlllIllIII()).intValue();
        if (f2 == 100.0f || !((Boolean) LunarClient.getInstance().getSettingsManager().IlIlIIlllIIlIllIIIlllllIl.lIlllIlllIIIIlIIlllIllIII()).booleanValue()) {
            this.lIIlIlllIllIlIlllIIIIIIII = 0.0f;
        }
        this.llIIlIlIlllIIllIlIlllIllI.mcProfiler.startSection("lightTex");
        if (this.IlIIIIIllIlllIIIIlIIIllIl) {
            this.IIIllIllIIlIlIlIlIllllIIl(f);
        }
        GL11.glEnable((int)2884);
        GL11.glEnable((int)2929);
        GL11.glEnable((int)3008);
        GL11.glAlphaFunc((int)516, (float)0.1f);
        if (this.llIIlIlIlllIIllIlIlllIllI.llIIlllIllIllllIIIlIIIIII == null) {
            this.llIIlIlIlllIIllIlIlllIllI.llIIlllIllIllllIIIlIIIIII = this.llIIlIlIlllIIllIlIlllIllI.lIIIIlIlIIlllllIIllIIlIII;
        }
        boolean bl = LunarClient.getInstance().getModuleManager().IlIIIlIIIIllIIIllIIIIIIll.lllIIIllIIIIlllIlIIllIIll;
        this.llIIlIlIlllIIllIlIlllIllI.mcProfiler.endStartSection("pick");
        this.lllIIIllIIIIlllIlIIllIIll(f);
        class_1965 class_19652 = this.llIIlIlIlllIIllIlIlllIllI.llIIlllIllIllllIIIlIIIIII;
        class_1114 class_11142 = this.llIIlIlIlllIIllIlIlllIllI.IllIIIllIIIIlIlIlIllIIlll;
        class_1462 class_14622 = this.llIIlIlIlllIIllIlIlllIllI.lllIIlIIIllllllIIIIlIlIlI;
        double d = class_19652.lIIIlIIIlIlllIllIIIlIIIlI + (class_19652.IlIIlllllIIlIlIlllllIllll - class_19652.lIIIlIIIlIlllIllIIIlIIIlI) * (double)f;
        double d2 = class_19652.lIIlIlllIllIlIlllIIIIIIII + (class_19652.llIIlIlIlllIIllIlIlllIllI - class_19652.lIIlIlllIllIlIlllIIIIIIII) * (double)f;
        double d3 = class_19652.IIlIllIIlllllIIlIIllllIIl + (class_19652.IllIIIIllIIllIllIlllIlIIl - class_19652.IIlIllIIlllllIIlIIllllIIl) * (double)f;
        this.llIIlIlIlllIIllIlIlllIllI.mcProfiler.endStartSection("center");
        for (int i = 0; i < 2; ++i) {
            if (this.llIIlIlIlllIIllIlIlllIllI.gameSettings.IlIIIIIllllllIIlllIllllll) {
                lllIlIIlIIIlIlIIIllIlllIl = i;
                if (lllIlIIlIIIlIlIIIllIlllIl == 0) {
                    GL11.glColorMask((boolean)false, (boolean)true, (boolean)true, (boolean)false);
                } else {
                    GL11.glColorMask((boolean)true, (boolean)false, (boolean)false, (boolean)false);
                }
            }
            this.llIIlIlIlllIIllIlIlllIllI.mcProfiler.endStartSection("clear");
            GL11.glViewport((int)0, (int)0, (int)this.llIIlIlIlllIIllIlIlllIllI.displayWidth, (int)this.llIIlIlIlllIIllIlIlllIllI.displayHeight);
            this.IllIIIllIIIIlIlIlIllIIlll(f);
            GL11.glClear((int)16640);
            GL11.glEnable((int)2884);
            this.llIIlIlIlllIIllIlIlllIllI.mcProfiler.endStartSection("camera");
            this.lllIIIllIIIIlllIlIIllIIll(f, i, bl);
            class_1490.lllIIIllIIIIlllIlIIllIIll(this.llIIlIlIlllIIllIlIlllIllI.lIIIIlIlIIlllllIIllIIlIII, this.llIIlIlIlllIIllIlIlllIllI.gameSettings.IIlIlIlIIlllIIIlIIIIlIIIl == 2);
            this.llIIlIlIlllIIllIlIlllIllI.mcProfiler.endStartSection("frustrum");
            class_1972.lllIIIllIIIIlllIlIIllIIll();
            if (!(Config.lllIIIlIIlIlIllIIIIIlIIll() || Config.IIIlIlIllIlllllIlIllllllI() || Config.llllIlIIllIIlllllIIllIIll())) {
                GL11.glDisable((int)3042);
            } else {
                this.lllIIIllIIIIlllIlIIllIIll(-1, f);
                this.llIIlIlIlllIIllIlIlllIllI.mcProfiler.endStartSection("sky");
                class_11142.lllIIIllIIIIlllIlIIllIIll(f);
            }
            GL11.glEnable((int)2912);
            this.lllIIIllIIIIlllIlIIllIIll(1, f);
            if (this.llIIlIlIlllIIllIlIlllIllI.gameSettings.IllIIIllIIIIlIlIlIllIIlll != 0) {
                GL11.glShadeModel((int)7425);
            }
            this.llIIlIlIlllIIllIlIlllIllI.mcProfiler.endStartSection("culling");
            class_1544 class_15442 = new class_1544();
            class_15442.lllIIIllIIIIlllIlIIllIIll(d, d2, d3);
            this.llIIlIlIlllIIllIlIlllIllI.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(class_15442, f);
            if (i == 0) {
                this.llIIlIlIlllIIllIlIlllIllI.mcProfiler.endStartSection("updatechunks");
                if (this.lIIlIlllIllIlIlllIIIIIIII == 0.0f) {
                    long l2;
                    while (!this.llIIlIlIlllIIllIlIlllIllI.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(class_19652, false) && l != 0L && (l2 = l - System.nanoTime()) >= 0L && l2 <= 1000000000L) {
                    }
                }
                this.lIIlIlllIllIlIlllIIIIIIII += 1.0f;
                if (this.lIIlIlllIllIlIlllIIIIIIII >= 100.0f / f2) {
                    this.lIIlIlllIllIlIlllIIIIIIII = 0.0f;
                }
            }
            if (class_19652.llIIlIlIlllIIllIlIlllIllI < 128.0) {
                this.lllIIIllIIIIlllIlIIllIIll(class_11142, f);
            }
            this.llIIlIlIlllIIllIlIlllIllI.mcProfiler.endStartSection("prepareterrain");
            this.lllIIIllIIIIlllIlIIllIIll(0, f);
            GL11.glEnable((int)2912);
            this.llIIlIlIlllIIllIlIlllIllI.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(class_1511.lllIIIllIIIIlllIlIIllIIll);
            class_0624.lllIIIllIIIIlllIlIIllIIll();
            this.llIIlIlIlllIIllIlIlllIllI.mcProfiler.endStartSection("terrain");
            GL11.glMatrixMode((int)5888);
            GL11.glPushMatrix();
            class_11142.lllIIIllIIIIlllIlIIllIIll(class_19652, 0, (double)f);
            GL11.glShadeModel((int)7424);
            GL11.glAlphaFunc((int)516, (float)0.1f);
            if (this.IlIlIIlIlIllIIlIlIIllIIIl == 0) {
                GL11.glMatrixMode((int)5888);
                GL11.glPopMatrix();
                GL11.glPushMatrix();
                class_0624.lllIlIIlIIIlIlIIIllIlllIl();
                this.llIIlIlIlllIIllIlIlllIllI.mcProfiler.endStartSection("entities");
                class_11142.lllIIIllIIIIlllIlIIllIIll(class_19652, class_15442, f);
                class_0624.lllIIIllIIIIlllIlIIllIIll();
                this.lllIIIllIIIIlllIlIIllIIll((double)f);
                GL11.glMatrixMode((int)5888);
                GL11.glPopMatrix();
                GL11.glPushMatrix();
                if (this.llIIlIlIlllIIllIlIlllIllI.lIlIllIIlIIlIIlIIlIIlIIll != null && class_19652.lllIIIllIIIIlllIlIIllIIll(class_1855.IllIIlllllllIIlIIlIIIIlIl) && class_19652 instanceof class_0814 && !this.llIIlIlIlllIIllIlIlllIllI.gameSettings.lIllIIlllIIIlIlIIIlllIlIl) {
                    class_0814 class_08142 = (class_0814)class_19652;
                    GL11.glDisable((int)3008);
                    this.llIIlIlIlllIIllIlIlllIllI.mcProfiler.endStartSection("outline");
                    if (!this.llIIlIlIlllIIllIlIlllIllI.gameSettings.lIllIIlllIIIlIlIIIlllIlIl) {
                        class_11142.lllIIIllIIIIlllIlIIllIIll(class_08142, this.llIIlIlIlllIIllIlIlllIllI.lIlIllIIlIIlIIlIIlIIlIIll, 0, f);
                    }
                    GL11.glEnable((int)3008);
                }
            }
            GL11.glMatrixMode((int)5888);
            GL11.glPopMatrix();
            if (this.lIlllIIllIIIIIIlIlIIlIllI == 1.0 && class_19652 instanceof class_0814 && !this.llIIlIlIlllIIllIlIlllIllI.gameSettings.lIllIIlllIIIlIlIIIlllIlIl && this.llIIlIlIlllIIllIlIlllIllI.lIlIllIIlIIlIIlIIlIIlIIll != null && !class_19652.lllIIIllIIIIlllIlIIllIIll(class_1855.IllIIlllllllIIlIIlIIIIlIl)) {
                class_0814 class_08143 = (class_0814)class_19652;
                GL11.glDisable((int)3008);
                this.llIIlIlIlllIIllIlIlllIllI.mcProfiler.endStartSection("outline");
                if (!this.llIIlIlIlllIIllIlIlllIllI.gameSettings.lIllIIlllIIIlIlIIIlllIlIl) {
                    class_11142.lllIIIllIIIIlllIlIIllIIll(class_08143, this.llIIlIlIlllIIllIlIlllIllI.lIlIllIIlIIlIIlIIlIIlIIll, 0, f);
                }
                GL11.glEnable((int)3008);
            }
            this.llIIlIlIlllIIllIlIlllIllI.mcProfiler.endStartSection("destroyProgress");
            GL11.glEnable((int)3042);
            OpenGlHelper.glBlendFunc(770, 1, 1, 0);
            class_11142.lllIIIllIIIIlllIlIIllIIll(class_0868.IlIIIIIllllllIIlllIllllll, class_19652, f);
            GL11.glDisable((int)3042);
            if (this.IlIlIIlIlIllIIlIlIIllIIIl == 0) {
                this.lllIlIIlIIIlIlIIIllIlllIl((double)f);
                this.llIIlIlIlllIIllIlIlllIllI.mcProfiler.endStartSection("litParticles");
                class_14622.lllIlIIlIIIlIlIIIllIlllIl(class_19652, f);
                class_0624.lllIIIllIIIIlllIlIIllIIll();
                this.lllIIIllIIIIlllIlIIllIIll(0, f);
                this.llIIlIlIlllIIllIlIlllIllI.mcProfiler.endStartSection("particles");
                class_14622.lllIIIllIIIIlllIlIIllIIll(class_19652, f);
                this.lllIIIllIIIIlllIlIIllIIll((double)f);
            }
            GL11.glDepthMask((boolean)false);
            GL11.glEnable((int)2884);
            this.llIIlIlIlllIIllIlIlllIllI.mcProfiler.endStartSection("weather");
            this.lIlllIlllIIIIlIIlllIllIII(f);
            GL11.glDepthMask((boolean)true);
            LunarClient.getInstance().getEventBus().callEvent(new class_0281(f));
            GL11.glDisable((int)3042);
            GL11.glEnable((int)2884);
            OpenGlHelper.glBlendFunc(770, 771, 1, 0);
            GL11.glAlphaFunc((int)516, (float)0.1f);
            this.lllIIIllIIIIlllIlIIllIIll(0, f);
            GL11.glEnable((int)3042);
            GL11.glDepthMask((boolean)false);
            this.llIIlIlIlllIIllIlIlllIllI.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(class_1511.lllIIIllIIIIlllIlIIllIIll);
            class_1379.IlIllllllIIlIIllllIIlIIIl();
            if (Config.lIlllIlllIlIIIIlllIlIlIIl()) {
                this.llIIlIlIlllIIllIlIlllIllI.mcProfiler.endStartSection("water");
                if (this.llIIlIlIlllIIllIlIlllIllI.gameSettings.IllIIIllIIIIlIlIlIllIIlll != 0) {
                    GL11.glShadeModel((int)7425);
                }
                GL11.glEnable((int)3042);
                OpenGlHelper.glBlendFunc(770, 771, 1, 0);
                if (this.llIIlIlIlllIIllIlIlllIllI.gameSettings.IlIIIIIllllllIIlllIllllll) {
                    if (lllIlIIlIIIlIlIIIllIlllIl == 0) {
                        GL11.glColorMask((boolean)false, (boolean)true, (boolean)true, (boolean)true);
                    } else {
                        GL11.glColorMask((boolean)true, (boolean)false, (boolean)false, (boolean)true);
                    }
                    class_11142.lllIlIIlIIIlIlIIIllIlllIl(1, f);
                } else {
                    class_11142.lllIlIIlIIIlIlIIIllIlllIl(1, f);
                }
                GL11.glDisable((int)3042);
                GL11.glShadeModel((int)7424);
            } else {
                this.llIIlIlIlllIIllIlIlllIllI.mcProfiler.endStartSection("water");
                class_11142.lllIlIIlIIIlIlIIIllIlllIl(1, f);
            }
            if (LunarClient.getInstance().getModuleManager().IlIlIIlllIIlIllIIIlllllIl.lIllllIIlIIIlIllllllIIIll()) {
                LunarClient.getInstance().getModuleManager().IlIlIIlllIIlIllIIIlllllIl.lllIIIllIIIIlllIlIIllIIll.rewind();
                GL11.glGetFloat((int)2982, (FloatBuffer) LunarClient.getInstance().getModuleManager().IlIlIIlllIIlIllIIIlllllIl.lllIIIllIIIIlllIlIIllIIll);
                LunarClient.getInstance().getModuleManager().IlIlIIlllIIlIllIIIlllllIl.lllIlIIlIIIlIlIIIllIlllIl.rewind();
                GL11.glGetFloat((int)2983, (FloatBuffer) LunarClient.getInstance().getModuleManager().IlIlIIlllIIlIllIIIlllllIl.lllIlIIlIIIlIlIIIllIlllIl);
            }
            if (LunarClient.getInstance().getModuleManager().IIlllIlIlllIllIIIlllIIlIl.IlIllllllIIlIIllllIIlIIIl()) {
                LunarClient.getInstance().getModuleManager().IIlllIlIlllIllIIIlllIIlIl.lllIIIllIIIIlllIlIIllIIll.rewind();
                GL11.glGetFloat((int)2982, (FloatBuffer) LunarClient.getInstance().getModuleManager().IIlllIlIlllIllIIIlllIIlIl.lllIIIllIIIIlllIlIIllIIll);
                LunarClient.getInstance().getModuleManager().IIlllIlIlllIllIIIlllIIlIl.lllIlIIlIIIlIlIIIllIlllIl.rewind();
                GL11.glGetFloat((int)2983, (FloatBuffer) LunarClient.getInstance().getModuleManager().IIlllIlIlllIllIIIlllIIlIl.lllIlIIlIIIlIlIIIllIlllIl);
            }
            class_1379.lIlllIlllIIIIlIIlllIllIII();
            GL11.glDepthMask((boolean)true);
            GL11.glEnable((int)2884);
            GL11.glDisable((int)3042);
            GL11.glDisable((int)2912);
            if (class_19652.llIIlIlIlllIIllIlIlllIllI >= 128.0 + (double)(this.llIIlIlIlllIIllIlIlllIllI.gameSettings.lIlIllIIlIIlIIlIIlIIlIIll * 128.0f)) {
                this.llIIlIlIlllIIllIlIlllIllI.mcProfiler.endStartSection("aboveClouds");
                this.lllIIIllIIIIlllIlIIllIIll(class_11142, f);
            }
            this.llIIlIlIlllIIllIlIlllIllI.mcProfiler.endStartSection("hand");
            if (this.lIlllIIllIIIIIIlIlIIlIllI == 1.0) {
                GL11.glClear((int)256);
                this.lllIIIllIIIIlllIlIIllIIll(f, i);
            }
            if (this.llIIlIlIlllIIllIlIlllIllI.gameSettings.IlIIIIIllllllIIlllIllllll) continue;
            this.llIIlIlIlllIIllIlIlllIllI.mcProfiler.endSection();
            return;
        }
        GL11.glColorMask((boolean)true, (boolean)true, (boolean)true, (boolean)false);
        this.llIIlIlIlllIIllIlIlllIllI.mcProfiler.endSection();
    }

    private void lllIIIllIIIIlllIlIIllIIll(class_1114 class_11142, float f) {
        if (this.llIIlIlIlllIIllIlIlllIllI.gameSettings.IlIIIIIllllllIIlllIllllll()) {
            this.llIIlIlIlllIIllIlIlllIllI.mcProfiler.endStartSection("clouds");
            GL11.glPushMatrix();
            this.lllIIIllIIIIlllIlIIllIIll(0, f);
            GL11.glEnable((int)2912);
            class_11142.lllIlIIlIIIlIlIIIllIlllIl(f);
            GL11.glDisable((int)2912);
            this.lllIIIllIIIIlllIlIIllIIll(1, f);
            GL11.glPopMatrix();
        }
    }

    private void llIIllIllIlIIlIIllIllllll() {
        float f = this.llIIlIlIlllIIllIlIlllIllI.theWorld.IllIIIllIIIIlIlIlIllIIlll(1.0f);
        if (!Config.llIllllIlIllIIIlIllIIlIlI()) {
            f /= 2.0f;
        }
        if (f != 0.0f && Config.llllIlIIIIIIIIIlllIIlIIIl()) {
            this.lIIlIlIIllIIIlIIlIlIIIlII.setSeed((long)this.IIlIIlIlIlIllIIlIlIIIIlll * 312987231L);
            class_1965 class_19652 = this.llIIlIlIlllIIllIlIlllIllI.llIIlllIllIllllIIIlIIIIII;
            class_0564 class_05642 = this.llIIlIlIlllIIllIlIlllIllI.theWorld;
            int n = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19652.IlIIlllllIIlIlIlllllIllll);
            int n2 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19652.llIIlIlIlllIIllIlIlllIllI);
            int n3 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19652.IllIIIIllIIllIllIlllIlIIl);
            int n4 = 10;
            double d = 0.0;
            double d2 = 0.0;
            double d3 = 0.0;
            int n5 = 0;
            int n6 = (int)(100.0f * f * f);
            if (this.llIIlIlIlllIIllIlIlllIllI.gameSettings.IllIlIIllIIllIlIIlIllIlIl == 1) {
                n6 >>= 1;
            } else if (this.llIIlIlIlllIIllIlIlllIllI.gameSettings.IllIlIIllIIllIlIIlIllIlIl == 2) {
                n6 = 0;
            }
            for (int i = 0; i < n6; ++i) {
                int n7 = n + this.lIIlIlIIllIIIlIIlIlIIIlII.nextInt(n4) - this.lIIlIlIIllIIIlIIlIlIIIlII.nextInt(n4);
                int n8 = n3 + this.lIIlIlIIllIIIlIIlIlIIIlII.nextInt(n4) - this.lIIlIlIIllIIIlIIlIlIIIlII.nextInt(n4);
                int n9 = class_05642.IllIIlllllllIIlIIlIIIIlIl(n7, n8);
                Block class_05492 = class_05642.a_(n7, n9 - 1, n8);
                class_0672 class_06722 = class_05642.a_(n7, n8);
                if (n9 > n2 + n4 || n9 < n2 - n4 || !class_06722.IlIIIIIllllllIIlllIllllll() || !(class_06722.lllIIIllIIIIlllIlIIllIIll(n7, n9, n8) >= 0.15f)) continue;
                float f2 = this.lIIlIlIIllIIIlIIlIlIIIlII.nextFloat();
                float f3 = this.lIIlIlIIllIIIlIIlIlIIIlII.nextFloat();
                if (class_05492.lIllllIIlIIIlIllllllIIIll() == class_1855.IIIllIllIIlIlIlIlIllllIIl) {
                    this.llIIlIlIlllIIllIlIlllIllI.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(new class_2185(class_05642, (float)n7 + f2, (double)((float)n9 + 0.1f) - class_05492.lIlIlIIlIIIIlIIIIIlllIIII(), (float)n8 + f3, 0.0, 0.0, 0.0));
                    continue;
                }
                if (class_05492.lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll) continue;
                if (this.lIIlIlIIllIIIlIIlIlIIIlII.nextInt(++n5) == 0) {
                    d = (float)n7 + f2;
                    d2 = (double)((float)n9 + 0.1f) - class_05492.lIlIlIIlIIIIlIIIIIlllIIII();
                    d3 = (float)n8 + f3;
                }
                class_2229 class_22292 = new class_2229(class_05642, (float)n7 + f2, (double)((float)n9 + 0.1f) - class_05492.lIlIlIIlIIIIlIIIIIlllIIII(), (float)n8 + f3);
                class_1689.lllIIIllIIIIlllIlIIllIIll(class_22292, class_05642);
                this.llIIlIlIlllIIllIlIlllIllI.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(class_22292);
            }
            if (n5 > 0 && this.lIIlIlIIllIIIlIIlIlIIIlII.nextInt(3) < this.lIIIlIIllIllIIlIIlIIIllII++) {
                this.lIIIlIIllIllIIlIIlIIIllII = 0;
                if (d2 > class_19652.llIIlIlIlllIIllIlIlllIllI + 1.0 && class_05642.IllIIlllllllIIlIIlIIIIlIl(MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19652.IlIIlllllIIlIlIlllllIllll), MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19652.IllIIIIllIIllIllIlllIlIIl)) > MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19652.llIIlIlIlllIIllIlIlllIllI)) {
                    this.llIIlIlIlllIIllIlIlllIllI.theWorld.lllIIIllIIIIlllIlIIllIIll(d, d2, d3, "ambient.weather.rain", 0.1f, 0.5f, false);
                } else {
                    this.llIIlIlIlllIIllIlIlllIllI.theWorld.lllIIIllIIIIlllIlIIllIIll(d, d2, d3, "ambient.weather.rain", 0.2f, 1.0f, false);
                }
            }
        }
    }

    protected void lIlllIlllIIIIlIIlllIllIII(float f) {
        float f2 = this.llIIlIlIlllIIllIlIlllIllI.theWorld.IllIIIllIIIIlIlIlIllIIlll(f);
        if (f2 > 0.0f) {
            this.lllIlIIlIIIlIlIIIllIlllIl((double)f);
            if (this.IllIIIllIIIIlIlIlIllIIlll == null) {
                this.IllIIIllIIIIlIlIlIllIIlll = new float[1024];
                this.lIIIIlIlIIlllllIIllIIlIII = new float[1024];
                for (int i = 0; i < 32; ++i) {
                    for (int j = 0; j < 32; ++j) {
                        float f3 = j - 16;
                        float f4 = i - 16;
                        float f5 = MathHelper.IlIllllllIIlIIllllIIlIIIl(f3 * f3 + f4 * f4);
                        this.IllIIIllIIIIlIlIlIllIIlll[i << 5 | j] = -f4 / f5;
                        this.lIIIIlIlIIlllllIIllIIlIII[i << 5 | j] = f3 / f5;
                    }
                }
            }
            if (Config.IlIIlllllIIlIlIlllllIllll()) {
                return;
            }
            class_1965 class_19652 = this.llIIlIlIlllIIllIlIlllIllI.llIIlllIllIllllIIIlIIIIII;
            class_0564 class_05642 = this.llIIlIlIlllIIllIlIlllIllI.theWorld;
            int n = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19652.IlIIlllllIIlIlIlllllIllll);
            int n2 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19652.llIIlIlIlllIIllIlIlllIllI);
            int n3 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19652.IllIIIIllIIllIllIlllIlIIl);
            class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
            GL11.glDisable((int)2884);
            GL11.glNormal3f((float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glEnable((int)3042);
            OpenGlHelper.glBlendFunc(770, 771, 1, 0);
            GL11.glAlphaFunc((int)516, (float)0.1f);
            double d = class_19652.lIIIlIIIlIlllIllIIIlIIIlI + (class_19652.IlIIlllllIIlIlIlllllIllll - class_19652.lIIIlIIIlIlllIllIIIlIIIlI) * (double)f;
            double d2 = class_19652.lIIlIlllIllIlIlllIIIIIIII + (class_19652.llIIlIlIlllIIllIlIlllIllI - class_19652.lIIlIlllIllIlIlllIIIIIIII) * (double)f;
            double d3 = class_19652.IIlIllIIlllllIIlIIllllIIl + (class_19652.IllIIIIllIIllIllIlllIlIIl - class_19652.IIlIllIIlllllIIlIIllllIIl) * (double)f;
            int n4 = MathHelper.IlIllllllIIlIIllllIIlIIIl(d2);
            int n5 = 5;
            if (Config.llIllllIlIllIIIlIllIIlIlI()) {
                n5 = 10;
            }
            boolean bl = false;
            int n6 = -1;
            float f6 = (float)this.IIlIIlIlIlIllIIlIlIIIIlll + f;
            if (Config.llIllllIlIllIIIlIllIIlIlI()) {
                n5 = 10;
            }
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            bl = false;
            for (int i = n3 - n5; i <= n3 + n5; ++i) {
                for (int j = n - n5; j <= n + n5; ++j) {
                    double d4;
                    float f7;
                    int n7 = (i - n3 + 16) * 32 + j - n + 16;
                    float f8 = this.IllIIIllIIIIlIlIlIllIIlll[n7] * 0.5f;
                    float f9 = this.lIIIIlIlIIlllllIIllIIlIII[n7] * 0.5f;
                    class_0672 class_06722 = class_05642.a_(j, i);
                    if (!class_06722.IlIIIIIllllllIIlllIllllll() && !class_06722.lIlllIlllIIIIlIIlllIllIII()) continue;
                    int n8 = class_05642.IllIIlllllllIIlIIlIIIIlIl(j, i);
                    int n9 = n2 - n5;
                    int n10 = n2 + n5;
                    if (n9 < n8) {
                        n9 = n8;
                    }
                    if (n10 < n8) {
                        n10 = n8;
                    }
                    float f10 = 1.0f;
                    int n11 = n8;
                    if (n8 < n4) {
                        n11 = n4;
                    }
                    if (n9 == n10) continue;
                    this.lIIlIlIIllIIIlIIlIlIIIlII.setSeed(j * j * 3121 + j * 45238971 ^ i * i * 418711 + i * 13761);
                    float f11 = class_06722.lllIIIllIIIIlllIlIIllIIll(j, n9, i);
                    if (class_05642.IIIllIllIIlIlIlIlIllllIIl().lllIIIllIIIIlllIlIIllIIll(f11, n8) >= 0.15f) {
                        if (n6 != 0) {
                            if (n6 >= 0) {
                                class_08682.lllIIIllIIIIlllIlIIllIIll();
                            }
                            n6 = 0;
                            this.llIIlIlIlllIIllIlIlllIllI.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(llIllllIlIllIIIlIllIIlIlI);
                            class_08682.lllIlIIlIIIlIlIIIllIlllIl();
                        }
                        f7 = ((float)(this.IIlIIlIlIlIllIIlIlIIIIlll + j * j * 3121 + j * 45238971 + i * i * 418711 + i * 13761 & 0x1F) + f) / 32.0f * (3.0f + this.lIIlIlIIllIIIlIIlIlIIIlII.nextFloat());
                        double d5 = (double)((float)j + 0.5f) - class_19652.IlIIlllllIIlIlIlllllIllll;
                        d4 = (double)((float)i + 0.5f) - class_19652.IllIIIIllIIllIllIlllIlIIl;
                        float f12 = MathHelper.lllIIIllIIIIlllIlIIllIIll(d5 * d5 + d4 * d4) / (float)n5;
                        float f13 = 1.0f;
                        class_08682.lllIlIIlIIIlIlIIIllIlllIl(class_05642.lllIIIllIIIIlllIlIIllIIll(j, n11, i, 0));
                        class_08682.lllIIIllIIIIlllIlIIllIIll(f13, f13, f13, ((1.0f - f12 * f12) * 0.5f + 0.5f) * f2);
                        class_08682.lllIlIIlIIIlIlIIIllIlllIl(-d * 1.0, -d2 * 1.0, -d3 * 1.0);
                        class_08682.lllIIIllIIIIlllIlIIllIIll((double)((float)j - f8) + 0.5, n9, (double)((float)i - f9) + 0.5, 0.0f * f10, (float)n9 * f10 / 4.0f + f7 * f10);
                        class_08682.lllIIIllIIIIlllIlIIllIIll((double)((float)j + f8) + 0.5, n9, (double)((float)i + f9) + 0.5, 1.0f * f10, (float)n9 * f10 / 4.0f + f7 * f10);
                        class_08682.lllIIIllIIIIlllIlIIllIIll((double)((float)j + f8) + 0.5, n10, (double)((float)i + f9) + 0.5, 1.0f * f10, (float)n10 * f10 / 4.0f + f7 * f10);
                        class_08682.lllIIIllIIIIlllIlIIllIIll((double)((float)j - f8) + 0.5, n10, (double)((float)i - f9) + 0.5, 0.0f * f10, (float)n10 * f10 / 4.0f + f7 * f10);
                        class_08682.lllIlIIlIIIlIlIIIllIlllIl(0.0, 0.0, 0.0);
                        continue;
                    }
                    if (n6 != 1) {
                        if (n6 >= 0) {
                            class_08682.lllIIIllIIIIlllIlIIllIIll();
                        }
                        n6 = 1;
                        this.llIIlIlIlllIIllIlIlllIllI.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(lIlllIlllIlIIIIlllIlIlIIl);
                        class_08682.lllIlIIlIIIlIlIIIllIlllIl();
                    }
                    f7 = ((float)(this.IIlIIlIlIlIllIIlIlIIIIlll & 0x1FF) + f) / 512.0f;
                    float f14 = this.lIIlIlIIllIIIlIIlIlIIIlII.nextFloat() + f6 * 0.01f * (float)this.lIIlIlIIllIIIlIIlIlIIIlII.nextGaussian();
                    float f15 = this.lIIlIlIIllIIIlIIlIlIIIlII.nextFloat() + f6 * (float)this.lIIlIlIIllIIIlIIlIlIIIlII.nextGaussian() * 0.001f;
                    d4 = (double)((float)j + 0.5f) - class_19652.IlIIlllllIIlIlIlllllIllll;
                    double d6 = (double)((float)i + 0.5f) - class_19652.IllIIIIllIIllIllIlllIlIIl;
                    float f16 = MathHelper.lllIIIllIIIIlllIlIIllIIll(d4 * d4 + d6 * d6) / (float)n5;
                    float f17 = 1.0f;
                    class_08682.lllIlIIlIIIlIlIIIllIlllIl((class_05642.lllIIIllIIIIlllIlIIllIIll(j, n11, i, 0) * 3 + 0xF000F0) / 4);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(f17, f17, f17, ((1.0f - f16 * f16) * 0.3f + 0.5f) * f2);
                    class_08682.lllIlIIlIIIlIlIIIllIlllIl(-d * 1.0, -d2 * 1.0, -d3 * 1.0);
                    class_08682.lllIIIllIIIIlllIlIIllIIll((double)((float)j - f8) + 0.5, n9, (double)((float)i - f9) + 0.5, 0.0f * f10 + f14, (float)n9 * f10 / 4.0f + f7 * f10 + f15);
                    class_08682.lllIIIllIIIIlllIlIIllIIll((double)((float)j + f8) + 0.5, n9, (double)((float)i + f9) + 0.5, 1.0f * f10 + f14, (float)n9 * f10 / 4.0f + f7 * f10 + f15);
                    class_08682.lllIIIllIIIIlllIlIIllIIll((double)((float)j + f8) + 0.5, n10, (double)((float)i + f9) + 0.5, 1.0f * f10 + f14, (float)n10 * f10 / 4.0f + f7 * f10 + f15);
                    class_08682.lllIIIllIIIIlllIlIIllIIll((double)((float)j - f8) + 0.5, n10, (double)((float)i - f9) + 0.5, 0.0f * f10 + f14, (float)n10 * f10 / 4.0f + f7 * f10 + f15);
                    class_08682.lllIlIIlIIIlIlIIIllIlllIl(0.0, 0.0, 0.0);
                }
            }
            if (n6 >= 0) {
                class_08682.lllIIIllIIIIlllIlIIllIIll();
            }
            GL11.glEnable((int)2884);
            GL11.glDisable((int)3042);
            GL11.glAlphaFunc((int)516, (float)0.1f);
            this.lllIIIllIIIIlllIlIIllIIll((double)f);
        }
    }

    public void IIIllIllIIlIlIlIlIllllIIl() {
        class_0321 class_03212 = new class_0321(this.llIIlIlIlllIIllIlIlllIllI, this.llIIlIlIlllIIllIlIlllIllI.displayWidth, this.llIIlIlIlllIIllIlIlllIllI.displayHeight);
        GL11.glClear((int)256);
        GL11.glMatrixMode((int)5889);
        GL11.glLoadIdentity();
        GL11.glOrtho((double)0.0, (double)class_03212.IlIllllllIIlIIllllIIlIIIl(), (double)class_03212.lIlllIlllIIIIlIIlllIllIII(), (double)0.0, (double)1000.0, (double)3000.0);
        GL11.glMatrixMode((int)5888);
        GL11.glLoadIdentity();
        GL11.glTranslatef((float)0.0f, (float)0.0f, (float)-2000.0f);
    }

    private void IllIIIllIIIIlIlIlIllIIlll(float f) {
        float f2;
        float f3;
        float f4;
        class_0564 class_05642 = this.llIIlIlIlllIIllIlIlllIllI.theWorld;
        class_1965 class_19652 = this.llIIlIlIlllIIllIlIlllIllI.llIIlllIllIllllIIIlIIIIII;
        float f5 = 0.25f + 0.75f * (float)this.llIIlIlIlllIIllIlIlllIllI.gameSettings.IlIllllllIIlIIllllIIlIIIl / 16.0f;
        f5 = 1.0f - (float)Math.pow(f5, 0.25);
        class_0864 class_08642 = class_05642.lllIIIllIIIIlllIlIIllIIll((class_1521)this.llIIlIlIlllIIllIlIlllIllI.llIIlllIllIllllIIIlIIIIII, f);
        class_08642 = class_1689.lllIIIllIIIIlllIlIIllIIll(class_08642, class_05642, this.llIIlIlIlllIIllIlIlllIllI.llIIlllIllIllllIIIlIIIIII, f);
        float f6 = (float)class_08642.lllIIIllIIIIlllIlIIllIIll;
        float f7 = (float)class_08642.lllIlIIlIIIlIlIIIllIlllIl;
        float f8 = (float)class_08642.IlIllllllIIlIIllllIIlIIIl;
        class_0864 class_08643 = class_05642.lIllllIIlIIIlIllllllIIIll(f);
        class_08643 = class_1689.lllIIIllIIIIlllIlIIllIIll(class_08643, class_05642, f);
        this.llIIllIllIlIIlIIllIllllll = (float)class_08643.lllIIIllIIIIlllIlIIllIIll;
        this.lllIIlIIIllllllIIIIlIlIlI = (float)class_08643.lllIlIIlIIIlIlIIIllIlllIl;
        this.IlIlllIIIIIIlIIllIIllIlll = (float)class_08643.IlIllllllIIlIIllllIIlIIIl;
        if (this.llIIlIlIlllIIllIlIlllIllI.gameSettings.IlIllllllIIlIIllllIIlIIIl >= 4) {
            float[] arrf;
            class_0864 class_08644 = MathHelper.lllIIIllIIIIlllIlIIllIIll(class_05642.lIlllIlllIIIIlIIlllIllIII(f)) > 0.0f ? class_0864.lllIIIllIIIIlllIlIIllIIll(-1.0, 0.0, 0.0) : class_0864.lllIIIllIIIIlllIlIIllIIll(1.0, 0.0, 0.0);
            f4 = (float)class_19652.llIIlllIllIllllIIIlIIIIII(f).lllIlIIlIIIlIlIIIllIlllIl(class_08644);
            if (f4 < 0.0f) {
                f4 = 0.0f;
            }
            if (f4 > 0.0f && (arrf = class_05642.IlIlIIlllIIlIllIIIlllllIl.lllIIIllIIIIlllIlIIllIIll(class_05642.IlIllllllIIlIIllllIIlIIIl(f), f)) != null) {
                this.llIIllIllIlIIlIIllIllllll = this.llIIllIllIlIIlIIllIllllll * (1.0f - (f4 *= arrf[3])) + arrf[0] * f4;
                this.lllIIlIIIllllllIIIIlIlIlI = this.lllIIlIIIllllllIIIIlIlIlI * (1.0f - f4) + arrf[1] * f4;
                this.IlIlllIIIIIIlIIllIIllIlll = this.IlIlllIIIIIIlIIllIIllIlll * (1.0f - f4) + arrf[2] * f4;
            }
        }
        this.llIIllIllIlIIlIIllIllllll += (f6 - this.llIIllIllIlIIlIIllIllllll) * f5;
        this.lllIIlIIIllllllIIIIlIlIlI += (f7 - this.lllIIlIIIllllllIIIIlIlIlI) * f5;
        this.IlIlllIIIIIIlIIllIIllIlll += (f8 - this.IlIlllIIIIIIlIIllIIllIlll) * f5;
        float f9 = class_05642.IllIIIllIIIIlIlIlIllIIlll(f);
        if (f9 > 0.0f) {
            f4 = 1.0f - f9 * 0.5f;
            float f10 = 1.0f - f9 * 0.4f;
            this.llIIllIllIlIIlIIllIllllll *= f4;
            this.lllIIlIIIllllllIIIIlIlIlI *= f4;
            this.IlIlllIIIIIIlIIllIIllIlll *= f10;
        }
        if ((f4 = class_05642.IllIIlllllllIIlIIlIIIIlIl(f)) > 0.0f) {
            float f11 = 1.0f - f4 * 0.5f;
            this.llIIllIllIlIIlIIllIllllll *= f11;
            this.lllIIlIIIllllllIIIIlIlIlI *= f11;
            this.IlIlllIIIIIIlIIllIIllIlll *= f11;
        }
        Block class_05492 = class_1490.lllIIIllIIIIlllIlIIllIIll(this.llIIlIlIlllIIllIlIlllIllI.theWorld, class_19652, f);
        if (this.IIIlIlIllIlllllIlIllllllI) {
            class_0864 class_08645 = class_05642.IlIIIIIllllllIIlllIllllll(f);
            this.llIIllIllIlIIlIIllIllllll = (float)class_08645.lllIIIllIIIIlllIlIIllIIll;
            this.lllIIlIIIllllllIIIIlIlIlI = (float)class_08645.lllIlIIlIIIlIlIIIllIlllIl;
            this.IlIlllIIIIIIlIIllIIllIlll = (float)class_08645.IlIllllllIIlIIllllIIlIIIl;
        } else if (class_05492.lIllllIIlIIIlIllllllIIIll() == class_1855.IllIIlllllllIIlIIlIIIIlIl) {
            f3 = (float)class_1250.lllIlIIlIIIlIlIIIllIlllIl(class_19652) * 0.2f;
            this.llIIllIllIlIIlIIllIllllll = 0.02f + f3;
            this.lllIIlIIIllllllIIIIlIlIlI = 0.02f + f3;
            this.IlIlllIIIIIIlIIllIIllIlll = 0.2f + f3;
            class_0864 class_08646 = class_1689.lllIIIllIIIIlllIlIIllIIll((class_1843)this.llIIlIlIlllIIllIlIlllIllI.theWorld, this.llIIlIlIlllIIllIlIlllIllI.llIIlllIllIllllIIIlIIIIII.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI.llIIlllIllIllllIIIlIIIIII.llIIlIlIlllIIllIlIlllIllI + 1.0, this.llIIlIlIlllIIllIlIlllIllI.llIIlllIllIllllIIIlIIIIII.IllIIIIllIIllIllIlllIlIIl);
            if (class_08646 != null) {
                this.llIIllIllIlIIlIIllIllllll = (float)class_08646.lllIIIllIIIIlllIlIIllIIll;
                this.lllIIlIIIllllllIIIIlIlIlI = (float)class_08646.lllIlIIlIIIlIlIIIllIlllIl;
                this.IlIlllIIIIIIlIIllIIllIlll = (float)class_08646.IlIllllllIIlIIllllIIlIIIl;
            }
        } else if (class_05492.lIllllIIlIIIlIllllllIIIll() == class_1855.IIIllIllIIlIlIlIlIllllIIl) {
            this.llIIllIllIlIIlIIllIllllll = 0.6f;
            this.lllIIlIIIllllllIIIIlIlIlI = 0.1f;
            this.IlIlllIIIIIIlIIllIIllIlll = 0.0f;
        }
        f3 = this.lIlIllIIllIIIIlllIlIlllIl + (this.IlIIIlIIlllllIIIllIlIlIll - this.lIlIllIIllIIIIlllIlIlllIl) * f;
        this.llIIllIllIlIIlIIllIllllll *= f3;
        this.lllIIlIIIllllllIIIIlIlIlI *= f3;
        this.IlIlllIIIIIIlIIllIIllIlll *= f3;
        double d = class_05642.IlIlIIlllIIlIllIIIlllllIl.lIIIIlIlIIlllllIIllIIlIII();
        if (!Config.llIlIIlllIIIIIllIIlIlIIII()) {
            d = 1.0;
        }
        double d2 = (class_19652.lIIlIlllIllIlIlllIIIIIIII + (class_19652.llIIlIlIlllIIllIlIlllIllI - class_19652.lIIlIlllIllIlIlllIIIIIIII) * (double)f) * d;
        if (class_19652.lllIIIllIIIIlllIlIIllIIll(class_0700.lllllIlllIIllIlIIlIIIllII)) {
            int n = class_19652.lllIlIIlIIIlIlIIIllIlllIl(class_0700.lllllIlllIIllIlIIlIIIllII).lllIlIIlIIIlIlIIIllIlllIl();
            d2 = n < 20 ? (d2 *= (double)(1.0f - (float)n / 20.0f)) : 0.0;
        }
        if (d2 < 1.0) {
            if (d2 < 0.0) {
                d2 = 0.0;
            }
            d2 *= d2;
            this.llIIllIllIlIIlIIllIllllll = (float)((double)this.llIIllIllIlIIlIIllIllllll * d2);
            this.lllIIlIIIllllllIIIIlIlIlI = (float)((double)this.lllIIlIIIllllllIIIIlIlIlI * d2);
            this.IlIlllIIIIIIlIIllIIllIlll = (float)((double)this.IlIlllIIIIIIlIIllIIllIlll * d2);
        }
        if (this.IlllIIIllllIIllIllIlIIlIl > 0.0f) {
            float f12 = this.lllIIIlIIlIlIllIIIIIlIIll + (this.IlllIIIllllIIllIllIlIIlIl - this.lllIIIlIIlIlIllIIIIIlIIll) * f;
            this.llIIllIllIlIIlIIllIllllll = this.llIIllIllIlIIlIIllIllllll * (1.0f - f12) + this.llIIllIllIlIIlIIllIllllll * 0.7f * f12;
            this.lllIIlIIIllllllIIIIlIlIlI = this.lllIIlIIIllllllIIIIlIlIlI * (1.0f - f12) + this.lllIIlIIIllllllIIIIlIlIlI * 0.6f * f12;
            this.IlIlllIIIIIIlIIllIIllIlll = this.IlIlllIIIIIIlIIllIIllIlll * (1.0f - f12) + this.IlIlllIIIIIIlIIllIIllIlll * 0.6f * f12;
        }
        if (class_19652.lllIIIllIIIIlllIlIIllIIll(class_0700.IlIlIIlllIIlIllIIIlllllIl)) {
            float f13 = this.lllIIIllIIIIlllIlIIllIIll(this.llIIlIlIlllIIllIlIlllIllI.lIIIIlIlIIlllllIIllIIlIII, f);
            f2 = 1.0f / this.llIIllIllIlIIlIIllIllllll;
            if (f2 > 1.0f / this.lllIIlIIIllllllIIIIlIlIlI) {
                f2 = 1.0f / this.lllIIlIIIllllllIIIIlIlIlI;
            }
            if (f2 > 1.0f / this.IlIlllIIIIIIlIIllIIllIlll) {
                f2 = 1.0f / this.IlIlllIIIIIIlIIllIIllIlll;
            }
            this.llIIllIllIlIIlIIllIllllll = this.llIIllIllIlIIlIIllIllllll * (1.0f - f13) + this.llIIllIllIlIIlIIllIllllll * f2 * f13;
            this.lllIIlIIIllllllIIIIlIlIlI = this.lllIIlIIIllllllIIIIlIlIlI * (1.0f - f13) + this.lllIIlIIIllllllIIIIlIlIlI * f2 * f13;
            this.IlIlllIIIIIIlIIllIIllIlll = this.IlIlllIIIIIIlIIllIIllIlll * (1.0f - f13) + this.IlIlllIIIIIIlIIllIIllIlll * f2 * f13;
        }
        if (this.llIIlIlIlllIIllIlIlllIllI.gameSettings.IlIIIIIllllllIIlllIllllll) {
            float f14 = (this.llIIllIllIlIIlIIllIllllll * 30.0f + this.lllIIlIIIllllllIIIIlIlIlI * 59.0f + this.IlIlllIIIIIIlIIllIIllIlll * 11.0f) / 100.0f;
            f2 = (this.llIIllIllIlIIlIIllIllllll * 30.0f + this.lllIIlIIIllllllIIIIlIlIlI * 70.0f) / 100.0f;
            float f15 = (this.llIIllIllIlIIlIIllIllllll * 30.0f + this.IlIlllIIIIIIlIIllIIllIlll * 70.0f) / 100.0f;
            this.llIIllIllIlIIlIIllIllllll = f14;
            this.lllIIlIIIllllllIIIIlIlIlI = f2;
            this.IlIlllIIIIIIlIIllIIllIlll = f15;
        }
        GL11.glClearColor((float)this.llIIllIllIlIIlIIllIllllll, (float)this.lllIIlIIIllllllIIIIlIlIlI, (float)this.IlIlllIIIIIIlIIllIIllIlll, (float)0.0f);
    }

    private void lllIIIllIIIIlllIlIIllIIll(int n, float f) {
        class_1965 class_19652 = this.llIIlIlIlllIIllIlIlllIllI.llIIlllIllIllllIIIlIIIIII;
        boolean bl = false;
        this.lllllIlllIIllIlIIlIIIllII = false;
        if (class_19652 instanceof class_0814) {
            bl = ((class_0814)class_19652).lIIlIlIlIlIllIIlIIllllIll.lIlllIlllIIIIlIIlllIllIII;
        }
        if (n == 999) {
            GL11.glFog((int)2918, (FloatBuffer)this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, 1.0f));
            GL11.glFogi((int)2917, (int)9729);
            GL11.glFogf((int)2915, (float)0.0f);
            GL11.glFogf((int)2916, (float)8.0f);
            if (GLContext.getCapabilities().GL_NV_fog_distance) {
                GL11.glFogi((int)34138, (int)34139);
            }
            GL11.glFogf((int)2915, (float)0.0f);
        } else {
            GL11.glFog((int)2918, (FloatBuffer)this.lllIIIllIIIIlllIlIIllIIll(this.llIIllIllIlIIlIIllIllllll, this.lllIIlIIIllllllIIIIlIlIlI, this.IlIlllIIIIIIlIIllIIllIlll, 1.0f));
            GL11.glNormal3f((float)0.0f, (float)-1.0f, (float)0.0f);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            Block class_05492 = class_1490.lllIIIllIIIIlllIlIIllIIll(this.llIIlIlIlllIIllIlIlllIllI.theWorld, class_19652, f);
            if (class_19652.lllIIIllIIIIlllIlIIllIIll(class_0700.lllllIlllIIllIlIIlIIIllII)) {
                float f2 = 5.0f;
                int n2 = class_19652.lllIlIIlIIIlIlIIIllIlllIl(class_0700.lllllIlllIIllIlIIlIIIllII).lllIlIIlIIIlIlIIIllIlllIl();
                if (n2 < 20) {
                    f2 = 5.0f + (this.IllIIIIllIIllIllIlllIlIIl - 5.0f) * (1.0f - (float)n2 / 20.0f);
                }
                GL11.glFogi((int)2917, (int)9729);
                if (n < 0) {
                    GL11.glFogf((int)2915, (float)0.0f);
                    GL11.glFogf((int)2916, (float)(f2 * 0.8f));
                } else {
                    GL11.glFogf((int)2915, (float)(f2 * 0.25f));
                    GL11.glFogf((int)2916, (float)f2);
                }
                if (Config.IlIlllIIIIIIlIIllIIllIlll()) {
                    GL11.glFogi((int)34138, (int)34139);
                }
            } else if (this.IIIlIlIllIlllllIlIllllllI) {
                GL11.glFogi((int)2917, (int)2048);
                GL11.glFogf((int)2914, (float)0.1f);
            } else if (class_05492.lIllllIIlIIIlIllllllIIIll() == class_1855.IllIIlllllllIIlIIlIIIIlIl) {
                GL11.glFogi((int)2917, (int)2048);
                if (class_19652.lllIIIllIIIIlllIlIIllIIll(class_0700.IlIlllIIIIIIlIIllIIllIlll)) {
                    GL11.glFogf((int)2914, (float)0.05f);
                } else {
                    GL11.glFogf((int)2914, (float)(0.1f - (float)class_1250.lllIlIIlIIIlIlIIIllIlllIl(class_19652) * 0.03f));
                }
                if (Config.lIlllIIllIIIIIIlIlIIlIllI()) {
                    GL11.glFogf((int)2914, (float)0.02f);
                }
            } else if (class_05492.lIllllIIlIIIlIllllllIIIll() == class_1855.IIIllIllIIlIlIlIlIllllIIl) {
                GL11.glFogi((int)2917, (int)2048);
                GL11.glFogf((int)2914, (float)2.0f);
            } else {
                double d;
                float f3 = this.IllIIIIllIIllIllIlllIlIIl;
                this.lllllIlllIIllIlIIlIIIllII = true;
                if (Config.llIlIIlllIIIIIllIIlIlIIII() && this.llIIlIlIlllIIllIlIlllIllI.theWorld.IlIlIIlllIIlIllIIIlllllIl.IllIIIllIIIIlIlIlIllIIlll() && !bl && (d = (double)((class_19652.lllIIIllIIIIlllIlIIllIIll(f) & 0xF00000) >> 20) / 16.0 + (class_19652.lIIlIlllIllIlIlllIIIIIIII + (class_19652.llIIlIlIlllIIllIlIlllIllI - class_19652.lIIlIlllIllIlIlllIIIIIIII) * (double)f + 4.0) / 32.0) < 1.0) {
                    float f4;
                    if (d < 0.0) {
                        d = 0.0;
                    }
                    if ((f4 = 100.0f * (float)(d *= d)) < 5.0f) {
                        f4 = 5.0f;
                    }
                    if (f3 > f4) {
                        f3 = f4;
                    }
                }
                GL11.glFogi((int)2917, (int)9729);
                if (n < 0) {
                    GL11.glFogf((int)2915, (float)0.0f);
                    GL11.glFogf((int)2916, (float)f3);
                } else {
                    GL11.glFogf((int)2915, (float)(f3 * Config.IlIlIIlllIIlIllIIIlllllIl()));
                    GL11.glFogf((int)2916, (float)f3);
                }
                if (GLContext.getCapabilities().GL_NV_fog_distance) {
                    if (Config.IlIlllIIIIIIlIIllIIllIlll()) {
                        GL11.glFogi((int)34138, (int)34139);
                    }
                    if (Config.IlIlIIlIlIllIIlIlIIllIIIl()) {
                        GL11.glFogi((int)34138, (int)34140);
                    }
                }
                if (this.llIIlIlIlllIIllIlIlllIllI.theWorld.IlIlIIlllIIlIllIIIlllllIl.lllIlIIlIIIlIlIIIllIlllIl((int)class_19652.IlIIlllllIIlIlIlllllIllll, (int)class_19652.IllIIIIllIIllIllIlllIlIIl)) {
                    f3 = this.IllIIIIllIIllIllIlllIlIIl;
                    GL11.glFogf((int)2915, (float)(f3 * 0.05f));
                    GL11.glFogf((int)2916, (float)f3);
                }
            }
            GL11.glEnable((int)2903);
            GL11.glColorMaterial((int)1028, (int)4608);
        }
    }

    private FloatBuffer lllIIIllIIIIlllIlIIllIIll(float f, float f2, float f3, float f4) {
        this.llIIlllIllIllllIIIlIIIIII.clear();
        this.llIIlllIllIllllIIIlIIIIII.put(f).put(f2).put(f3).put(f4);
        this.llIIlllIllIllllIIIlIIIIII.flip();
        return this.llIIlllIllIllllIIIlIIIIII;
    }

    public class_0975 IllIIIllIIIIlIlIlIllIIlll() {
        return this.IIIIIIIIlIllIIllIIlllIllI;
    }

    private void lllIIlIIIllllllIIIIlIlIlI() {
        this.lIIllIlIIlIIlllllIlIIllIl = 0;
        if (!Config.lIIllllIllIlllllIIllIllIl()) {
            this.IllIIllIlIlllIllIllIlIIIl = 0L;
            this.IIIlIllllIIIlllllIllIlIII = 0;
        } else if (this.llIIlIlIlllIIllIlIlllIllI.llllIIIIlIIIlIIIIIIlIllll() != null) {
            class_0519 class_05192 = this.llIIlIlIlllIIllIlIlllIllI.llllIIIIlIIIlIIIIIIlIllll();
            boolean bl = this.llIIlIlIlllIIllIlIlllIllI.llIlIIlllIIIIIllIIlIlIIII();
            if (!bl && !(this.llIIlIlIlllIIllIlIlllIllI.lllllIlllIIllIlIIlIIIllII instanceof class_2224)) {
                if (this.IIIIIllIlIllIlIlIIlIllIIl > 0) {
                    Config.lllIIIllIIIIlllIlIIllIIll((long)this.IIIIIllIlIllIlIlIIlIllIIl);
                    this.lIIllIlIIlIIlllllIlIIllIl = this.IIIIIllIlIllIlIlIIlIllIIl;
                }
                long l = System.nanoTime() / 1000000L;
                if (this.IllIIllIlIlllIllIllIlIIIl != 0L && this.IIIlIllllIIIlllllIllIlIII != 0) {
                    long l2 = l - this.IllIIllIlIlllIllIllIlIIIl;
                    if (l2 < 0L) {
                        this.IllIIllIlIlllIllIllIlIIIl = l;
                        l2 = 0L;
                    }
                    if (l2 >= 50L) {
                        this.IllIIllIlIlllIllIllIlIIIl = l;
                        int n = class_05192.IllllIIlIIIllIlllIlllIllI();
                        int n2 = n - this.IIIlIllllIIIlllllIllIlIII;
                        if (n2 < 0) {
                            this.IIIlIllllIIIlllllIllIlIII = n;
                            n2 = 0;
                        }
                        if (n2 < 1 && this.IIIIIllIlIllIlIlIIlIllIIl < 100) {
                            this.IIIIIllIlIllIlIlIIlIllIIl += 2;
                        }
                        if (n2 > 1 && this.IIIIIllIlIllIlIlIIlIllIIl > 0) {
                            --this.IIIIIllIlIllIlIlIIlIllIIl;
                        }
                        this.IIIlIllllIIIlllllIllIlIII = n;
                    }
                } else {
                    this.IllIIllIlIlllIllIllIlIIIl = l;
                    this.IIIlIllllIIIlllllIllIlIII = class_05192.IllllIIlIIIllIlllIlllIllI();
                    this.IlIIlIIlllllIlIIlIlIlIlIl = 1.0f;
                    this.lIIlllIIlIlIlIIIlIlllIIll = 50.0f;
                }
            } else {
                if (this.llIIlIlIlllIIllIlIlllIllI.lllllIlllIIllIlIIlIIIllII instanceof class_2224) {
                    Config.lllIIIllIIIIlllIlIIllIIll(20L);
                }
                this.IllIIllIlIlllIllIllIlIIIl = 0L;
                this.IIIlIllllIIIlllllIllIlIII = 0;
            }
        }
    }

    private void lllIIIllIIIIlllIlIIllIIll(long l, long l2) {
        if (this.llIIlIlIlllIIllIlIlllIllI.gameSettings.IIlIIlIlIlIllIIlIlIIIIlll || this.lIlIIlllllIlllllIlIIIllll) {
            if (this.lIlIllIIlIIlIIlIIlIIlIIll == -1L) {
                this.lIlIllIIlIIlIIlIIlIIlIIll = System.nanoTime();
            }
            long l3 = System.nanoTime();
            int n = this.IIlllIlIlllIllIIIlllIIlIl & this.IlIlIIlllIIlIllIIIlllllIl.length - 1;
            this.lIIlIIIIIlIlllIlIIlIlIlll[n] = l;
            this.lIlIlIIlIIIIlIIIIIlllIIII[n] = l2;
            this.IlIIIlIIIIllIIIllIIIIIIll[n] = this.lIIllIlIIlIIlllllIlIIllIl;
            this.IlIlIIlllIIlIllIIIlllllIl[n] = l3 - this.lIlIllIIlIIlIIlIIlIIlIIll;
            ++this.IIlllIlIlllIllIIIlllIIlIl;
            this.lIlIllIIlIIlIIlIIlIIlIIll = l3;
            GL11.glClear((int)256);
            GL11.glMatrixMode((int)5889);
            GL11.glPushMatrix();
            GL11.glEnable((int)2903);
            GL11.glLoadIdentity();
            GL11.glOrtho((double)0.0, (double)this.llIIlIlIlllIIllIlIlllIllI.displayWidth, (double)this.llIIlIlIlllIIllIlIlllIllI.displayHeight, (double)0.0, (double)1000.0, (double)3000.0);
            GL11.glMatrixMode((int)5888);
            GL11.glPushMatrix();
            GL11.glLoadIdentity();
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)-2000.0f);
            GL11.glLineWidth((float)1.0f);
            GL11.glDisable((int)3553);
            class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
            class_08682.lllIIIllIIIIlllIlIIllIIll(1);
            for (int i = 0; i < this.IlIlIIlllIIlIllIIIlllllIl.length; ++i) {
                int n2 = (i - this.IIlllIlIlllIllIIIlllIIlIl & this.IlIlIIlllIIlIllIIIlllllIl.length - 1) * 255 / this.IlIlIIlllIIlIllIIIlllllIl.length;
                long l4 = this.IlIlIIlllIIlIllIIIlllllIl[i] / 200000L;
                float f = this.llIIlIlIlllIIllIlIlllIllI.displayHeight;
                class_08682.IlIllllllIIlIIllllIIlIIIl(-16777216 + n2 * 256);
                class_08682.lllIIIllIIIIlllIlIIllIIll((double)((float)i + 0.5f), (double)(f - (float)l4 + 0.5f), 0.0);
                class_08682.lllIIIllIIIIlllIlIIllIIll((double)((float)i + 0.5f), (double)(f + 0.5f), 0.0);
                long l5 = this.lIIlIIIIIlIlllIlIIlIlIlll[i] / 200000L;
                class_08682.IlIllllllIIlIIllllIIlIIIl(-16777216 + n2 * 65536 + n2 * 256 + n2 * 1);
                class_08682.lllIIIllIIIIlllIlIIllIIll((double)((float)i + 0.5f), (double)((f -= (float)l4) + 0.5f), 0.0);
                class_08682.lllIIIllIIIIlllIlIIllIIll((double)((float)i + 0.5f), (double)(f + (float)l5 + 0.5f), 0.0);
                long l6 = this.lIlIlIIlIIIIlIIIIIlllIIII[i] / 200000L;
                class_08682.IlIllllllIIlIIllllIIlIIIl(-16777216 + n2 * 65536);
                class_08682.lllIIIllIIIIlllIlIIllIIll((double)((float)i + 0.5f), (double)((f += (float)l5) + 0.5f), 0.0);
                class_08682.lllIIIllIIIIlllIlIIllIIll((double)((float)i + 0.5f), (double)(f + (float)l6 + 0.5f), 0.0);
                f += (float)l6;
                long l7 = this.IlIIIlIIIIllIIIllIIIIIIll[i];
                if (l7 <= 0L) continue;
                long l8 = l7 * 1000000L / 200000L;
                class_08682.IlIllllllIIlIIllllIIlIIIl(-16777216 + n2 * 1);
                class_08682.lllIIIllIIIIlllIlIIllIIll((double)((float)i + 0.5f), (double)(f + 0.5f), 0.0);
                class_08682.lllIIIllIIIIlllIlIIllIIll((double)((float)i + 0.5f), (double)(f + (float)l8 + 0.5f), 0.0);
            }
            class_08682.lllIIIllIIIIlllIlIIllIIll();
            GL11.glMatrixMode((int)5889);
            GL11.glPopMatrix();
            GL11.glMatrixMode((int)5888);
            GL11.glPopMatrix();
            GL11.glEnable((int)3553);
        }
    }

    private void IlIlllIIIIIIlIIllIIllIlll() {
        long l;
        if (this.llIIlIlIlllIIllIlIlllIllI.theWorld != null && (l = System.currentTimeMillis()) > this.lllllllIlIIlIlIIIlIlIIlll + 10000L) {
            this.lllllllIlIIlIlIIIlIlIIlll = l;
            int n = GL11.glGetError();
            if (n != 0) {
                String string = GLU.gluErrorString((int)n);
                class_0722 class_07222 = new class_0722("\u00a7eOpenGL Error\u00a7f: " + n + " (" + string + ")");
                this.llIIlIlIlllIIllIlIlllIllI.IlIIIlIIIIllIIIllIIIIIIll.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(class_07222);
            }
        }
    }

    private void lllIIIllIIIIlllIlIIllIIll(class_2097 class_20972) {
        try {
            String string = null;
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(new Date());
            int n = calendar.get(5);
            int n2 = calendar.get(2) + 1;
            if (n == 8 && n2 == 4) {
                string = "Happy birthday, OptiFine!";
            }
            if (n == 14 && n2 == 8) {
                string = "Happy birthday, sp614x!";
            }
            if (string == null) {
                return;
            }
            Field[] arrfield = class_2097.class.getDeclaredFields();
            for (int i = 0; i < arrfield.length; ++i) {
                if (arrfield[i].getType() != String.class) continue;
                arrfield[i].setAccessible(true);
                arrfield[i].set(class_20972, string);
                break;
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    static /* synthetic */ Minecraft lllIIIllIIIIlllIlIIllIIll(class_0817 class_08172) {
        return class_08172.llIIlIlIlllIIllIlIlllIllI;
    }

    static {
        IlIIlllllIIlIlIlllllIllll = "7Hqvhj".length() * "raXIoG4y".length() * 2;
        llllIlIIllIIlllllIIllIIll = new ResourceLocation[]{new ResourceLocation("shaders/post/notch.json"), new ResourceLocation("shaders/post/fxaa.json"), new ResourceLocation("shaders/post/art.json"), new ResourceLocation("shaders/post/bumpy.json"), new ResourceLocation("shaders/post/blobs2.json"), new ResourceLocation("shaders/post/pencil.json"), new ResourceLocation("shaders/post/color_convolve.json"), new ResourceLocation("shaders/post/deconverge.json"), new ResourceLocation("shaders/post/flip.json"), new ResourceLocation("shaders/post/invert.json"), new ResourceLocation("shaders/post/ntsc.json"), new ResourceLocation("shaders/post/outline.json"), new ResourceLocation("shaders/post/phosphor.json"), new ResourceLocation("shaders/post/scan_pincushion.json"), new ResourceLocation("shaders/post/sobel.json"), new ResourceLocation("shaders/post/bits.json"), new ResourceLocation("shaders/post/desaturate.json"), new ResourceLocation("shaders/post/green.json"), new ResourceLocation("shaders/post/blur.json"), new ResourceLocation("shaders/post/wobble.json"), new ResourceLocation("shaders/post/blobs.json"), new ResourceLocation("shaders/post/antialias.json")};
        IlIlIllIIlIIIIlllIlIllIlI = new ResourceLocation("shaders/post/animblur.json");
        IlIIllIlIlIllIIIlIIlIlIIl = new ResourceLocation("shaders/post/motionblur.json");
        IlIIIIIllllllIIlllIllllll = llllIlIIllIIlllllIIllIIll.length;
    }
}

