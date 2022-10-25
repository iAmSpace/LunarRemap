package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.ARBOcclusionQuery
 *  org.lwjgl.opengl.GL11
 */
import com.google.common.collect.Maps;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.crash.CrashReport;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.profiler.Profiler;
import net.minecraft.util.MathHelper;
import optifine.Config;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.BufferUtils;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.ARBOcclusionQuery;
import org.lwjgl.opengl.GL11;

public class class_1114
implements class_2249 {
    private static final Logger lIlllIlllIlIIIIlllIlIlIIl = LogManager.getLogger();
    private static final ResourceLocation IlIIlllllIIlIlIlllllIllll = new ResourceLocation("textures/environment/moon_phases.png");
    private static final ResourceLocation llIIlIlIlllIIllIlIlllIllI = new ResourceLocation("textures/environment/sun.png");
    private static final ResourceLocation IllIIIIllIIllIllIlllIlIIl = new ResourceLocation("textures/environment/clouds.png");
    private static final ResourceLocation IIIIIIIIlIllIIllIIlllIllI = new ResourceLocation("textures/environment/end_sky.png");
    public List lllIIIllIIIIlllIlIIllIIll = new ArrayList();
    public class_0564 lllIlIIlIIIlIlIIIllIlllIl;
    public final class_1682 IlIllllllIIlIIllllIIlIIIl;
    public class_0284 lIlllIlllIIIIlIIlllIllIII = new class_0284(100, 0.8f);
    private class_0734[] IIlIIlIlIlIllIIlIlIIIIlll;
    private class_0734[] llIIIlllIlllIlIllIIIIllIl;
    private int IIIIlIllIlIIlIIlIllIlIlll;
    private int IlIlIIlllIllllllllIIIlIlI;
    private int llllIIIIlIIIlIIIIIIlIllll;
    public int IlIIIIIllllllIIlllIllllll;
    public Minecraft lIllllIIlIIIlIllllllIIIll;
    public class_1333 IIIllIIlIIIIIIlIlIIllIIlI;
    private IntBuffer llIIIIllIIIIIIIlIIIlIIIIl;
    private boolean IIllIllIIllIIlllIIIlIlllI;
    private int llllllIlIllllIlIlIlIIIIlI;
    private int lIlIIllllIlIIIIllIIIIlIIl;
    private int llIlllIIllIlllIlIlIlIIIll;
    private int IIIIlIIlIIIllIIIIllIIIlII;
    private int lllIIIIIIlIlllIIlIlIIIllI;
    private int llIIlIIllIIllIlIIllIIllII;
    private int lIlIlIIIIIIlIIllllIlIIllI;
    private int IllllIIIIlIIlIIIIlllIIIIl;
    private int llllIlIIIIIIIIIlllIIlIIIl;
    private int IIIIlIlIIlIIIIlIlllIlIIII;
    public final Map IllIIlllllllIIlIIlIIIIlIl = new HashMap();
    private final Map lllIIIIlIlIIlIIlllIIIIIIl = Maps.newHashMap();
    private class_2102[] llIlIIlllIIIIIllIIlIlIIII;
    private boolean IllIIIlllllIlIlllIlllllII;
    private int llIlllIlIIllIlIIIIllIIlIl;
    private int lIIIllIIIIIllllIlIlIllIll = -1;
    private int lIIIlIIIlIlllIllIIIlIIIlI = 2;
    private int lIIlIlllIllIlIlllIIIIIIII;
    private int IIlIllIIlllllIIlIIllllIIl;
    private int IllllIIlIIIllIlllIlllIllI;
    IntBuffer IIIllIllIIlIlIlIlIllllIIl = class_0994.lIlllIlllIIIIlIIlllIllIII(64);
    private int IllIlIlIIIlllIIllIIIIlIll;
    private int IlIIIlIllIIIllIIIIlIIlIll;
    private int llllIIllIlIlllllllIIlIIlI;
    private int IlllIIlllllllIIllIlIllllI;
    private int IlllIIIllllIIllIllIlIIlIl;
    private int lllIIIlIIlIlIllIIIIIlIIll;
    private int IIIlIlIllIlllllIlIllllllI;
    private List IIIIlIllIlIIIIIllllIIlllI = new ArrayList();
    private class_2000[] llllIlIIllIIlllllIIllIIll = new class_2000[]{new class_2000(), new class_2000(), new class_2000(), new class_2000()};
    double IllIIIllIIIIlIlIlIllIIlll = -9999.0;
    double lIIIIlIlIIlllllIIllIIlIII = -9999.0;
    double llIIlllIllIllllIIIlIIIIII = -9999.0;
    double llIIllIllIlIIlIIllIllllll = -9999.0;
    double lllIIlIIIllllllIIIIlIlIlI = -9999.0;
    double IlIlllIIIIIIlIIllIIllIlll = -9999.0;
    int IlIlIIlIlIllIIlIlIIllIIIl = -999;
    int lllllIlllIIllIlIIlIIIllII = -999;
    int IlIlIIlllIIlIllIIIlllllIl = -999;
    int lIIlIIIIIlIlllIlIIlIlIlll;
    private IntBuffer IlIlIllIIlIIIIlllIlIllIlI = BufferUtils.createIntBuffer((int)65536);
    double lIlIlIIlIIIIlIIIIIlllIIII;
    double IlIIIlIIIIllIIIllIIIIIIll;
    double IIlllIlIlllIllIIIlllIIlIl;
    public class_1521 lIlIllIIlIIlIIlIIlIIlIIll;
    private int IlIIllIlIlIllIIIlIIlIlIIl = -1;
    private boolean lIlIIllIllIIIIIlIllllIIIl = false;
    private int lIlllIIllIIIIIIlIlIIlIllI = -99999;
    private double llIIIlIlIlIIlIllIIIllIlIl = 0.0;
    private double lIIlIIlIllIlIIlIlIIlIlIlI = 0.0;
    private double llIIIIIlIIlIIIIllIIIlIIII = 0.0;
    private int lIlIlIIllIIIlllIllIIlIllI = 0;
    private int IlIIIIIllIlllIIIIlIIIllIl = 0;
    private int lIIlIlIIllIIIlIIlIlIIIlII = 30;
    public class_1412 llIIlIllIllllIlIIIIlIIlll = new class_1412();
    public class_1965 llIllllIlIllIIIlIllIIlIlI;
    private int lIIIlIIllIllIIlIIlIIIllII;
    private long lIlIllIIllIIIIlllIlIlllIl = System.currentTimeMillis();
    private long IlIIIlIIlllllIIIllIlIlIll = System.currentTimeMillis();
    private static class_1974 lIIllllllllIlIllllllllIlI = class_1974.lllIIIllIIIIlllIlIIllIIll(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);

    public class_1114(Minecraft class_06672) {
        int n;
        int n2;
        this.IlIIllIlIlIllIIIlIIlIlIIl = class_0994.lllIIIllIIIIlllIlIIllIIll(1);
        this.lIllllIIlIIIlIllllllIIIll = class_06672;
        this.IlIllllllIIlIIllllIIlIIIl = class_06672.llIIlIIllIIllIlIIllIIllII();
        int n3 = 65;
        int n4 = 16;
        int n5 = n3 * n3 * n4;
        int n6 = n5 * 3;
        this.IlIIIIIllllllIIlllIllllll = class_0994.lllIIIllIIIIlllIlIIllIIll(n6);
        this.IllIIIlllllIlIlllIlllllII = false;
        this.llIlllIlIIllIlIIIIllIIlIl = class_0994.lllIIIllIIIIlllIlIIllIIll(1);
        this.IIllIllIIllIIlllIIIlIlllI = class_0437.lllIIIllIIIIlllIlIIllIIll();
        if (this.IIllIllIIllIIlllIIIlIlllI) {
            this.IIIllIllIIlIlIlIlIllllIIl.clear();
            this.llIIIIllIIIIIIIlIIIlIIIIl = class_0994.lIlllIlllIIIIlIIlllIllIII(n3 * n3 * n4);
            this.llIIIIllIIIIIIIlIIIlIIIIl.clear();
            this.llIIIIllIIIIIIIlIIIlIIIIl.position(0);
            this.llIIIIllIIIIIIIlIIIlIIIIl.limit(n3 * n3 * n4);
            ARBOcclusionQuery.glGenQueriesARB((IntBuffer)this.llIIIIllIIIIIIIlIIIlIIIIl);
        }
        this.lIlIIllllIlIIIIllIIIIlIIl = class_0994.lllIIIllIIIIlllIlIIllIIll(3);
        GL11.glPushMatrix();
        GL11.glNewList((int)this.lIlIIllllIlIIIIllIIIIlIIl, (int)4864);
        this.IlIlIIlIlIllIIlIlIIllIIIl();
        GL11.glEndList();
        GL11.glPopMatrix();
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        this.llIlllIIllIlllIlIlIlIIIll = this.lIlIIllllIlIIIIllIIIIlIIl + 1;
        GL11.glNewList((int)this.llIlllIIllIlllIlIlIlIIIll, (int)4864);
        int n7 = 64;
        int n8 = 256 / n7 + 2;
        float f = 16.0f;
        for (n2 = -n7 * n8; n2 <= n7 * n8; n2 += n7) {
            for (n = -n7 * n8; n <= n7 * n8; n += n7) {
                class_08682.lllIlIIlIIIlIlIIIllIlllIl();
                class_08682.lllIIIllIIIIlllIlIIllIIll((double)(n2 + 0), (double)f, (double)(n + 0));
                class_08682.lllIIIllIIIIlllIlIIllIIll((double)(n2 + n7), (double)f, (double)(n + 0));
                class_08682.lllIIIllIIIIlllIlIIllIIll((double)(n2 + n7), (double)f, (double)(n + n7));
                class_08682.lllIIIllIIIIlllIlIIllIIll((double)(n2 + 0), (double)f, (double)(n + n7));
                class_08682.lllIIIllIIIIlllIlIIllIIll();
            }
        }
        GL11.glEndList();
        this.IIIIlIIlIIIllIIIIllIIIlII = this.lIlIIllllIlIIIIllIIIIlIIl + 2;
        GL11.glNewList((int)this.IIIIlIIlIIIllIIIIllIIIlII, (int)4864);
        f = -16.0f;
        class_08682.lllIlIIlIIIlIlIIIllIlllIl();
        for (n2 = -n7 * n8; n2 <= n7 * n8; n2 += n7) {
            for (n = -n7 * n8; n <= n7 * n8; n += n7) {
                class_08682.lllIIIllIIIIlllIlIIllIIll((double)(n2 + n7), (double)f, (double)(n + 0));
                class_08682.lllIIIllIIIIlllIlIIllIIll((double)(n2 + 0), (double)f, (double)(n + 0));
                class_08682.lllIIIllIIIIlllIlIIllIIll((double)(n2 + 0), (double)f, (double)(n + n7));
                class_08682.lllIIIllIIIIlllIlIIllIIll((double)(n2 + n7), (double)f, (double)(n + n7));
            }
        }
        class_08682.lllIIIllIIIIlllIlIIllIIll();
        GL11.glEndList();
    }

    private void IlIlIIlIlIllIIlIlIIllIIIl() {
        Random random = new Random(10842L);
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        class_08682.lllIlIIlIIIlIlIIIllIlllIl();
        for (int i = 0; i < 1500; ++i) {
            double d = random.nextFloat() * 2.0f - 1.0f;
            double d2 = random.nextFloat() * 2.0f - 1.0f;
            double d3 = random.nextFloat() * 2.0f - 1.0f;
            double d4 = 0.15f + random.nextFloat() * 0.1f;
            double d5 = d * d + d2 * d2 + d3 * d3;
            if (!(d5 < 1.0) || !(d5 > 0.01)) continue;
            d5 = 1.0 / Math.sqrt(d5);
            double d6 = (d *= d5) * 100.0;
            double d7 = (d2 *= d5) * 100.0;
            double d8 = (d3 *= d5) * 100.0;
            double d9 = Math.atan2(d, d3);
            double d10 = Math.sin(d9);
            double d11 = Math.cos(d9);
            double d12 = Math.atan2(Math.sqrt(d * d + d3 * d3), d2);
            double d13 = Math.sin(d12);
            double d14 = Math.cos(d12);
            double d15 = random.nextDouble() * Math.PI * 2.0;
            double d16 = Math.sin(d15);
            double d17 = Math.cos(d15);
            for (int j = 0; j < 4; ++j) {
                double d18 = 0.0;
                double d19 = (double)((j & 2) - 1) * d4;
                double d20 = (double)((j + 1 & 2) - 1) * d4;
                double d21 = d19 * d17 - d20 * d16;
                double d22 = d20 * d17 + d19 * d16;
                double d23 = d21 * d13 + d18 * d14;
                double d24 = d18 * d13 - d21 * d14;
                double d25 = d24 * d10 - d22 * d11;
                double d26 = d22 * d10 + d24 * d11;
                class_08682.lllIIIllIIIIlllIlIIllIIll(d6 + d25, d7 + d23, d8 + d26);
            }
        }
        class_08682.lllIIIllIIIIlllIlIIllIIll();
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0564 class_05642) {
        if (this.lllIlIIlIIIlIlIIIllIlllIl != null) {
            this.lllIlIIlIIIlIlIIIllIlllIl.lllIlIIlIIIlIlIIIllIlllIl(this);
        }
        this.IllIIIllIIIIlIlIlIllIIlll = -9999.0;
        this.lIIIIlIlIIlllllIIllIIlIII = -9999.0;
        this.llIIlllIllIllllIIIlIIIIII = -9999.0;
        this.llIIllIllIlIIlIIllIllllll = -9999.0;
        this.lllIIlIIIllllllIIIIlIlIlI = -9999.0;
        this.IlIlllIIIIIIlIIllIIllIlll = -9999.0;
        this.IlIlIIlIlIllIIlIlIIllIIIl = -9999;
        this.lllllIlllIIllIlIIlIIIllII = -9999;
        this.IlIlIIlllIIlIllIIIlllllIl = -9999;
        class_2114.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(class_05642);
        this.lllIlIIlIIIlIlIIIllIlllIl = class_05642;
        this.IIIllIIlIIIIIIlIlIIllIIlI = new class_1333(class_05642);
        if (Config.lllIlIIllllIllIIIlIlIIIll()) {
            class_1825.lllIIIllIIIIlllIlIIllIIll();
        }
        if (class_05642 != null) {
            class_05642.lllIIIllIIIIlllIlIIllIIll(this);
            this.lllIIIllIIIIlllIlIIllIIll();
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll() {
        if (this.lllIlIIlIIIlIlIIIllIlllIl != null) {
            int n;
            int n2;
            int n3;
            Blocks.lIlIlIIlIIIIlIIIIIlllIIII.lllIlIIlIIIlIlIIIllIlllIl(Config.IIlIIlIlIlIllIIlIlIIIIlll());
            Blocks.IlIIIlIIIIllIIIllIIIIIIll.lllIlIIlIIIlIlIIIllIlllIl(Config.IIlIIlIlIlIllIIlIlIIIIlll());
            this.lIIIllIIIIIllllIlIlIllIll = this.lIllllIIlIIIlIllllllIIIll.gameSettings.IlIllllllIIlIIllllIIlIIIl;
            class_1379.IIIllIIlIIIIIIlIlIIllIIlI();
            if (this.llIIIlllIlllIlIllIIIIllIl != null) {
                for (n3 = 0; n3 < this.llIIIlllIlllIlIllIIIIllIl.length; ++n3) {
                    this.llIIIlllIlllIlIllIIIIllIl[n3].IlIllllllIIlIIllllIIlIIIl();
                }
            }
            if (Config.lllIlIIllllIllIIIlIlIIIll()) {
                class_1825.lllIIIllIIIIlllIlIIllIIll();
            }
            n3 = this.lIllllIIlIIIlIllllllIIIll.gameSettings.IlIllllllIIlIIllllIIlIIIl;
            int n4 = 16;
            if (Config.IlIIIlIIIIllIIIllIIIIIIll() && n3 < n4) {
                n3 = n4;
            }
            int n5 = Config.lllIIIllIIIIlllIlIIllIIll(n4 - n3, 0, 8);
            this.IlIIIIIllIlllIIIIlIIIllIl = Config.lllIIIllIIIIlllIlIIllIIll(Config.IIlllIlIlllIllIIIlllIIlIl(), 0, n5);
            int n6 = 32;
            if ((n3 += this.IlIIIIIllIlllIIIIlIIIllIl) > n6) {
                n3 = n6;
            }
            this.lIlIlIIlIIIIlIIIIIlllIIII = -9999.0;
            this.IlIIIlIIIIllIIIllIIIIIIll = -9999.0;
            this.IIlllIlIlllIllIIIlllIIlIl = -9999.0;
            this.IIIIlIllIlIIlIIlIllIlIlll = n2 = n3 * 2 + 1;
            this.IlIlIIlllIllllllllIIIlIlI = 16;
            this.llllIIIIlIIIlIIIIIIlIllll = n2;
            this.llIIIlllIlllIlIllIIIIllIl = new class_0734[this.IIIIlIllIlIIlIIlIllIlIlll * this.IlIlIIlllIllllllllIIIlIlI * this.llllIIIIlIIIlIIIIIIlIllll];
            this.IIlIIlIlIlIllIIlIlIIIIlll = new class_0734[this.IIIIlIllIlIIlIIlIllIlIlll * this.IlIlIIlllIllllllllIIIlIlI * this.llllIIIIlIIIlIIIIIIlIllll];
            this.lIlIlIIllIIIlllIllIIlIllI = 0;
            this.llIIlIllIllllIlIIIIlIIlll.lllIIIllIIIIlllIlIIllIIll();
            int n7 = 0;
            int n8 = 0;
            this.lllIIIIIIlIlllIIlIlIIIllI = 0;
            this.llIIlIIllIIllIlIIllIIllII = 0;
            this.lIlIlIIIIIIlIIllllIlIIllI = 0;
            this.IllllIIIIlIIlIIIIlllIIIIl = this.IIIIlIllIlIIlIIlIllIlIlll;
            this.llllIlIIIIIIIIIlllIIlIIIl = this.IlIlIIlllIllllllllIIIlIlI;
            this.IIIIlIlIIlIIIIlIlllIlIIII = this.llllIIIIlIIIlIIIIIIlIllll;
            for (n = 0; n < this.lIlllIlllIIIIlIIlllIllIII.lIlllIlllIIIIlIIlllIllIII(); ++n) {
                class_0734 class_07342 = (class_0734)this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl(n);
                if (class_07342 == null) continue;
                class_07342.lIlIlIIlIIIIlIIIIIlllIIII = false;
            }
            this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll();
            this.lllIIIllIIIIlllIlIIllIIll.clear();
            this.lIlllIlllIIIIlIIlllIllIII();
            for (n = 0; n < this.IIIIlIllIlIIlIIlIllIlIlll; ++n) {
                for (int i = 0; i < this.IlIlIIlllIllllllllIIIlIlI; ++i) {
                    for (int j = 0; j < this.llllIIIIlIIIlIIIIIIlIllll; ++j) {
                        int n9 = (j * this.IlIlIIlllIllllllllIIIlIlI + i) * this.IIIIlIllIlIIlIIlIllIlIlll + n;
                        this.llIIIlllIlllIlIllIIIIllIl[n9] = class_1379.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl, this.lllIIIllIIIIlllIlIIllIIll, n * 16, i * 16, j * 16, this.IlIIIIIllllllIIlllIllllll + n7);
                        if (this.IIllIllIIllIIlllIIIlIlllI) {
                            this.llIIIlllIlllIlIllIIIIllIl[n9].llIllllIlIllIIIlIllIIlIlI = this.llIIIIllIIIIIIIlIIIlIIIIl.get(n8);
                        }
                        this.llIIIlllIlllIlIllIIIIllIl[n9].llIIlIllIllllIlIIIIlIIlll = false;
                        this.llIIIlllIlllIlIllIIIIllIl[n9].lIlIllIIlIIlIIlIIlIIlIIll = true;
                        this.llIIIlllIlllIlIllIIIIllIl[n9].IlIlllIIIIIIlIIllIIllIlll = false;
                        this.llIIIlllIlllIlIllIIIIllIl[n9].IIlllIlIlllIllIIIlllIIlIl = n8++;
                        if (this.lllIlIIlIIIlIlIIIllIlllIl.IlIIIIIllllllIIlllIllllll(n << 4, 0, j << 4)) {
                            this.llIIIlllIlllIlIllIIIIllIl[n9].lIllllIIlIIIlIllllllIIIll();
                            this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(this.llIIIlllIlllIlIllIIIIllIl[n9]);
                        }
                        n7 += 3;
                    }
                }
            }
            if (this.lllIlIIlIIIlIlIIIllIlllIl != null) {
                class_1965 class_19652 = this.lIllllIIlIIIlIllllllIIIll.llIIlllIllIllllIIIlIIIIII;
                if (class_19652 == null) {
                    class_19652 = this.lIllllIIlIIIlIllllllIIIll.lIIIIlIlIIlllllIIllIIlIII;
                }
                if (class_19652 != null) {
                    this.IlIllllllIIlIIllllIIlIIIl(MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19652.IlIIlllllIIlIlIlllllIllll), MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19652.llIIlIlIlllIIllIlIlllIllI), MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19652.IllIIIIllIIllIllIlllIlIIl));
                    class_1441 class_14412 = new class_1441(class_19652);
                    class_14412.lllIIIllIIIIlllIlIIllIIll(this.IIlIIlIlIlIllIIlIlIIIIlll, this.lIlIlIIllIIIlllIllIIlIllI);
                    Arrays.sort(this.IIlIIlIlIlIllIIlIlIIIIlll, 0, this.lIlIlIIllIIIlllIllIIlIllI, class_14412);
                }
            }
            this.lIIIlIIIlIlllIllIIIlIIIlI = 2;
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652, class_1821 class_18212, float f) {
        int n = 0;
        if (this.lIIIlIIIlIlllIllIIIlIIIlI > 0) {
            if (n > 0) {
                return;
            }
            --this.lIIIlIIIlIlllIllIIIlIIIlI;
        } else {
            Class<?> class_;
            int n2;
            Object object;
            double d = class_19652.llIIlIllIllllIlIIIIlIIlll + (class_19652.IlIIlllllIIlIlIlllllIllll - class_19652.llIIlIllIllllIlIIIIlIIlll) * (double)f;
            double d2 = class_19652.llIllllIlIllIIIlIllIIlIlI + (class_19652.llIIlIlIlllIIllIlIlllIllI - class_19652.llIllllIlIllIIIlIllIIlIlI) * (double)f;
            double d3 = class_19652.lIlllIlllIlIIIIlllIlIlIIl + (class_19652.IllIIIIllIIllIllIlllIlIIl - class_19652.lIlllIlllIlIIIIlllIlIlIIl) * (double)f;
            this.lllIlIIlIIIlIlIIIllIlllIl.IlIIlllllIIlIlIlllllIllll.startSection("prepare");
            class_1683.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl, this.lIllllIIlIIIlIllllllIIIll.llIIlIIllIIllIlIIllIIllII(), this.lIllllIIlIIIlIllllllIIIll.IlIlllIIIIIIlIIllIIllIlll, this.lIllllIIlIIIlIllllllIIIll.llIIlllIllIllllIIIlIIIIII, f);
            class_2114.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl, this.lIllllIIlIIIlIllllllIIIll.llIIlIIllIIllIlIIllIIllII(), this.lIllllIIlIIIlIllllllIIIll.IlIlllIIIIIIlIIllIIllIlll, this.lIllllIIlIIIlIllllllIIIll.llIIlllIllIllllIIIlIIIIII, this.lIllllIIlIIIlIllllllIIIll.llIIllIllIlIIlIIllIllllll, this.lIllllIIlIIIlIllllllIIIll.gameSettings, f);
            if (n == 0) {
                this.lIIlIlllIllIlIlllIIIIIIII = 0;
                this.IIlIllIIlllllIIlIIllllIIl = 0;
                this.IllllIIlIIIllIlllIlllIllI = 0;
                this.lIIIlIIllIllIIlIIlIIIllII = 0;
                object = this.lIllllIIlIIIlIllllllIIIll.llIIlllIllIllllIIIlIIIIII;
                double d4 = ((class_1965)object).lIIIlIIIlIlllIllIIIlIIIlI + (((class_1965)object).IlIIlllllIIlIlIlllllIllll - ((class_1965)object).lIIIlIIIlIlllIllIIIlIIIlI) * (double)f;
                double d5 = ((class_1965)object).lIIlIlllIllIlIlllIIIIIIII + (((class_1965)object).llIIlIlIlllIIllIlIlllIllI - ((class_1965)object).lIIlIlllIllIlIlllIIIIIIII) * (double)f;
                double d6 = ((class_1965)object).IIlIllIIlllllIIlIIllllIIl + (((class_1965)object).IllIIIIllIIllIllIlllIlIIl - ((class_1965)object).IIlIllIIlllllIIlIIllllIIl) * (double)f;
                class_1683.lllIlIIlIIIlIlIIIllIlllIl = d4;
                class_1683.IlIllllllIIlIIllllIIlIIIl = d5;
                class_1683.lIlllIlllIIIIlIIlllIllIII = d6;
                this.lllIlIIlIIIlIlIIIllIlllIl.IlIIlllllIIlIlIlllllIllll.endStartSection("staticentities");
                if (this.IllIIIlllllIlIlllIlllllII) {
                    class_2114.lllIlIIlIIIlIlIIIllIlllIl = 0.0;
                    class_2114.IlIllllllIIlIIllllIIlIIIl = 0.0;
                    class_2114.lIlllIlllIIIIlIIlllIllIII = 0.0;
                    this.IlIIIIIllllllIIlllIllllll();
                }
                GL11.glMatrixMode((int)5888);
                GL11.glPushMatrix();
                GL11.glTranslated((double)(-d4), (double)(-d5), (double)(-d6));
                GL11.glCallList((int)this.llIlllIlIIllIlIIIIllIIlIl);
                GL11.glPopMatrix();
                class_2114.lllIlIIlIIIlIlIIIllIlllIl = d4;
                class_2114.IlIllllllIIlIIllllIIlIIIl = d5;
                class_2114.lIlllIlllIIIIlIIlllIllIII = d6;
            }
            this.lIllllIIlIIIlIllllllIIIll.lIIlIIIIIlIlllIlIIlIlIlll.lllIlIIlIIIlIlIIIllIlllIl((double)f);
            this.lllIlIIlIIIlIlIIIllIlllIl.IlIIlllllIIlIlIlllllIllll.endStartSection("global");
            object = this.lllIlIIlIIIlIlIIIllIlllIl.IlIlIIlllIIlIllIIIlllllIl();
            if (n == 0) {
                this.lIIlIlllIllIlIlllIIIIIIII = object.size();
            }
            if (Config.lllllIlllIIllIlIIlIIIllII() && this.lIllllIIlIIIlIllllllIIIll.lIIlIIIIIlIlllIlIIlIlIlll.lllllIlllIIllIlIIlIIIllII) {
                GL11.glDisable((int)2912);
            }
            for (n2 = 0; n2 < this.lllIlIIlIIIlIlIIIllIlllIl.IIIllIIlIIIIIIlIlIIllIIlI.size(); ++n2) {
                class_1521 class_15212 = (class_1521)this.lllIlIIlIIIlIlIIIllIlllIl.IIIllIIlIIIIIIlIlIIllIIlI.get(n2);
                ++this.IIlIllIIlllllIIlIIllllIIl;
                if (!class_15212.lllIIIllIIIIlllIlIIllIIll(d, d2, d3)) continue;
                class_2114.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(class_15212, f);
            }
            this.lllIlIIlIIIlIlIIIllIlllIl.IlIIlllllIIlIlIlllllIllll.endStartSection("entities");
            boolean bl = this.lIllllIIlIIIlIllllllIIIll.gameSettings.IIIllIllIIlIlIlIlIllllIIl;
            this.lIllllIIlIIIlIllllllIIIll.gameSettings.IIIllIllIIlIlIlIlIllllIIl = Config.IIIIlIllIlIIlIIlIllIlIlll();
            class_0676.lllIIIllIIIIlllIlIIllIIll();
            for (n2 = 0; n2 < object.size(); ++n2) {
                class_0339 class_03392;
                boolean bl2;
                class_1521 class_15213 = (class_1521)object.get(n2);
                boolean bl3 = bl2 = class_15213.lllIIIllIIIIlllIlIIllIIll(d, d2, d3) && (class_15213.IlIIIIIllIlllIIIIlIIIllIl || class_18212.lllIIIllIIIIlllIlIIllIIll(class_15213.IIllIllIIllIIlllIIIlIlllI) || class_15213.lIlIlIIlIIIIlIIIIIlllIIII == this.lIllllIIlIIIlIllllllIIIll.lIIIIlIlIIlllllIIllIIlIII);
                if (!bl2 && class_15213 instanceof class_0339 && (class_03392 = (class_0339)class_15213).lIIIIIlIllIllIlIlIIllllll() && class_03392.lIIIlllIlIIIlIllIIIlIllll() != null) {
                    class_ = class_03392.lIIIlllIlIIIlIllIIIlIllll();
                    bl2 = class_18212.lllIIIllIIIIlllIlIIllIIll(((class_1521)class_).IIllIllIIllIIlllIIIlIlllI);
                }
                if (!bl2 || class_15213 == this.lIllllIIlIIIlIllllllIIIll.llIIlllIllIllllIIIlIIIIII && this.lIllllIIlIIIlIllllllIIIll.gameSettings.IIlIlIlIIlllIIIlIIIIlIIIl == 0 && !this.lIllllIIlIIIlIllllllIIIll.llIIlllIllIllllIIIlIIIIII.IIIIIllIIlIlIlIIlIlIlIllI() || !this.lllIlIIlIIIlIlIIIllIlllIl.IlIIIIIllllllIIlllIllllll(MathHelper.IlIllllllIIlIIllllIIlIIIl(class_15213.IlIIlllllIIlIlIlllllIllll), 0, MathHelper.IlIllllllIIlIIllllIIlIIIl(class_15213.IllIIIIllIIllIllIlllIlIIl))) continue;
                ++this.IIlIllIIlllllIIlIIllllIIl;
                if (class_15213.getClass() == class_1094.class) {
                    class_15213.IlIlIIlllIIlIllIIIlllllIl = 0.06;
                }
                this.lIlIllIIlIIlIIlIIlIIlIIll = class_15213;
                class_2114.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(class_15213, f);
                this.lIlIllIIlIIlIIlIIlIIlIIll = null;
            }
            this.lIllllIIlIIIlIllllllIIIll.gameSettings.IIIllIllIIlIlIlIlIllllIIl = bl;
            this.lllIlIIlIIIlIlIIIllIlllIl.IlIIlllllIIlIlIlllllIllll.endStartSection("blockentities");
            class_0624.lllIlIIlIIIlIlIIIllIlllIl();
            for (n2 = 0; n2 < this.lllIIIllIIIIlllIlIIllIIll.size(); ++n2) {
                Object object2;
                class_1774 class_17742 = (class_1774)this.lllIIIllIIIIlllIlIIllIIll.get(n2);
                class_1974 class_19742 = this.lllIIIllIIIIlllIlIIllIIll(class_17742);
                if (class_19742 != lIIllllllllIlIllllllllIlI && !class_18212.lllIIIllIIIIlllIlIIllIIll(class_19742)) continue;
                class_ = class_17742.getClass();
                if (class_ == class_2219.class && !Config.IIIllIllIIlIlIlIlIllllIIl) {
                    object2 = this.lIllllIIlIIIlIllllllIIIll.lIIIIlIlIIlllllIIllIIlIII;
                    double d7 = class_17742.lllIIIllIIIIlllIlIIllIIll(((class_1389)object2).IlIIlllllIIlIlIlllllIllll, ((class_1389)object2).llIIlIlIlllIIllIlIlllIllI, ((class_1389)object2).IllIIIIllIIllIllIlllIlIIl);
                    if (d7 > 256.0) {
                        class_1854 class_18542 = class_1683.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll();
                        class_18542.lIllllIIlIIIlIllllllIIIll = false;
                        class_1683.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(class_17742, f);
                        ++this.lIIIlIIllIllIIlIIlIIIllII;
                        class_18542.lIllllIIlIIIlIllllllIIIll = true;
                        continue;
                    }
                }
                if (class_ == class_0071.class && !((object2 = this.lllIlIIlIIIlIlIIIllIlllIl.a_(class_17742.lllIlIIlIIIlIlIIIllIlllIl, class_17742.IlIllllllIIlIIllllIIlIIIl, class_17742.lIlllIlllIIIIlIIlllIllIII)) instanceof class_1041)) continue;
                class_1683.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(class_17742, f);
                ++this.lIIIlIIllIllIIlIIlIIIllII;
            }
            this.lIllllIIlIIIlIllllllIIIll.lIIlIIIIIlIlllIlIIlIlIlll.lllIIIllIIIIlllIlIIllIIll((double)f);
            this.lllIlIIlIIIlIlIIIllIlllIl.IlIIlllllIIlIlIlllllIllll.endSection();
        }
    }

    public String lllIlIIlIIIlIlIIIllIlllIl() {
        return "C: " + this.IlllIIlllllllIIllIlIllllI + "/" + this.IllIlIlIIIlllIIllIIIIlIll + ". F: " + this.IlIIIlIllIIIllIIIIlIIlIll + ", O: " + this.llllIIllIlIlllllllIIlIIlI + ", E: " + this.IlllIIIllllIIllIllIlIIlIl;
    }

    public String IlIllllllIIlIIllllIIlIIIl() {
        return "E: " + this.IIlIllIIlllllIIlIIllllIIl + "/" + this.lIIlIlllIllIlIlllIIIIIIII + ". B: " + this.IllllIIlIIIllIlllIlllIllI + ", I: " + (this.lIIlIlllIllIlIlllIIIIIIII - this.IllllIIlIIIllIlllIlllIllI - this.IIlIllIIlllllIIlIIllllIIl) + ", " + Config.lllIlIIlIIIlIlIIIllIlllIl();
    }

    @Override
    public void lIlllIlllIIIIlIIlllIllIII() {
        this.IllIIIlllllIlIlllIlllllII = true;
    }

    public void IlIIIIIllllllIIlllIllllll() {
        this.lllIlIIlIIIlIlIIIllIlllIl.IlIIlllllIIlIlIlllllIllll.startSection("staticentityrebuild");
        GL11.glPushMatrix();
        GL11.glNewList((int)this.llIlllIlIIllIlIIIIllIIlIl, (int)4864);
        List list = this.lllIlIIlIIIlIlIIIllIlllIl.IlIlIIlllIIlIllIIIlllllIl();
        this.IllIIIlllllIlIlllIlllllII = false;
        for (int i = 0; i < list.size(); ++i) {
            class_1521 class_15212 = (class_1521)list.get(i);
            if (!class_2114.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(class_15212).lllIIIllIIIIlllIlIIllIIll()) continue;
            this.IllIIIlllllIlIlllIlllllII = this.IllIIIlllllIlIlllIlllllII || !class_2114.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(class_15212, 0.0f, true);
        }
        GL11.glEndList();
        GL11.glPopMatrix();
        this.lllIlIIlIIIlIlIIIllIlllIl.IlIIlllllIIlIlIlllllIllll.endSection();
    }

    private void IlIllllllIIlIIllllIIlIIIl(int n, int n2, int n3) {
        n -= 8;
        n2 -= 8;
        n3 -= 8;
        this.lllIIIIIIlIlllIIlIlIIIllI = Integer.MAX_VALUE;
        this.llIIlIIllIIllIlIIllIIllII = Integer.MAX_VALUE;
        this.lIlIlIIIIIIlIIllllIlIIllI = Integer.MAX_VALUE;
        this.IllllIIIIlIIlIIIIlllIIIIl = Integer.MIN_VALUE;
        this.llllIlIIIIIIIIIlllIIlIIIl = Integer.MIN_VALUE;
        this.IIIIlIlIIlIIIIlIlllIlIIII = Integer.MIN_VALUE;
        int n4 = this.IIIIlIllIlIIlIIlIllIlIlll * 16;
        int n5 = n4 / 2;
        for (int i = 0; i < this.IIIIlIllIlIIlIIlIllIlIlll; ++i) {
            int n6 = i * 16;
            int n7 = n6 + n5 - n;
            if (n7 < 0) {
                n7 -= n4 - 1;
            }
            if ((n6 -= (n7 /= n4) * n4) < this.lllIIIIIIlIlllIIlIlIIIllI) {
                this.lllIIIIIIlIlllIIlIlIIIllI = n6;
            }
            if (n6 > this.IllllIIIIlIIlIIIIlllIIIIl) {
                this.IllllIIIIlIIlIIIIlllIIIIl = n6;
            }
            for (int j = 0; j < this.llllIIIIlIIIlIIIIIIlIllll; ++j) {
                int n8 = j * 16;
                int n9 = n8 + n5 - n3;
                if (n9 < 0) {
                    n9 -= n4 - 1;
                }
                if ((n8 -= (n9 /= n4) * n4) < this.lIlIlIIIIIIlIIllllIlIIllI) {
                    this.lIlIlIIIIIIlIIllllIlIIllI = n8;
                }
                if (n8 > this.IIIIlIlIIlIIIIlIlllIlIIII) {
                    this.IIIIlIlIIlIIIIlIlllIlIIII = n8;
                }
                for (int k = 0; k < this.IlIlIIlllIllllllllIIIlIlI; ++k) {
                    int n10 = k * 16;
                    if (n10 < this.llIIlIIllIIllIlIIllIIllII) {
                        this.llIIlIIllIIllIlIIllIIllII = n10;
                    }
                    if (n10 > this.llllIlIIIIIIIIIlllIIlIIIl) {
                        this.llllIlIIIIIIIIIlllIIlIIIl = n10;
                    }
                    class_0734 class_07342 = this.llIIIlllIlllIlIllIIIIllIl[(j * this.IlIlIIlllIllllllllIIIlIlI + k) * this.IIIIlIllIlIIlIIlIllIlIlll + i];
                    boolean bl = class_07342.lIlIlIIlIIIIlIIIIIlllIIII;
                    class_07342.lllIIIllIIIIlllIlIIllIIll(n6, n10, n8);
                    if (bl || !class_07342.lIlIlIIlIIIIlIIIIIlllIIII) continue;
                    this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(class_07342);
                }
            }
        }
    }

    public int lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652, int n, double d) {
        int n2;
        int n3;
        double d2;
        double d3;
        double d4;
        int n4;
        int n5;
        this.llIllllIlIllIIIlIllIIlIlI = class_19652;
        if (Config.lllIlIIllllIllIIIlIlIIIll()) {
            class_1825.lllIIIllIIIIlllIlIIllIIll(this);
        }
        Profiler class_12422 = this.lllIlIIlIIIlIlIIIllIlllIl.IlIIlllllIIlIlIlllllIllll;
        class_12422.startSection("sortchunks");
        if (this.lIlllIlllIIIIlIIlllIllIII.lIlllIlllIIIIlIIlllIllIII() < 10) {
            n5 = 10;
            for (n4 = 0; n4 < n5; ++n4) {
                this.IIIlIlIllIlllllIlIllllllI = (this.IIIlIlIllIlllllIlIllllllI + 1) % this.llIIIlllIlllIlIllIIIIllIl.length;
                class_0734 class_07342 = this.llIIIlllIlllIlIllIIIIllIl[this.IIIlIlIllIlllllIlIllllllI];
                if (!class_07342.lIlIlIIlIIIIlIIIIIlllIIII || this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl(class_07342)) continue;
                this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(class_07342);
            }
        }
        if (this.lIllllIIlIIIlIllllllIIIll.gameSettings.IlIllllllIIlIIllllIIlIIIl != this.lIIIllIIIIIllllIlIlIllIll && !Config.IlIIIlIIIIllIIIllIIIIIIll()) {
            this.lllIIIllIIIIlllIlIIllIIll();
        }
        if (n == 0) {
            this.IllIlIlIIIlllIIllIIIIlIll = 0;
            this.lllIIIlIIlIlIllIIIIIlIIll = 0;
            this.IlIIIlIllIIIllIIIIlIIlIll = 0;
            this.llllIIllIlIlllllllIIlIIlI = 0;
            this.IlllIIlllllllIIllIlIllllI = 0;
            this.IlllIIIllllIIllIllIlIIlIl = 0;
        }
        int n6 = n5 = this.IlIlIIlIlIllIIlIlIIllIIIl != class_19652.lIlIIllIllIIIIIlIllllIIIl || this.lllllIlllIIllIlIIlIIIllII != class_19652.lIlllIIllIIIIIIlIlIIlIllI || this.IlIlIIlllIIlIllIIIlllllIl != class_19652.llIIIlIlIlIIlIllIIIllIlIl ? 1 : 0;
        if (n5 == 0) {
            d4 = class_19652.IlIIlllllIIlIlIlllllIllll - this.IllIIIllIIIIlIlIlIllIIlll;
            double d5 = class_19652.llIIlIlIlllIIllIlIlllIllI - this.lIIIIlIlIIlllllIIllIIlIII;
            d3 = class_19652.IllIIIIllIIllIllIlllIlIIl - this.llIIlllIllIllllIIIlIIIIII;
            d2 = d4 * d4 + d5 * d5 + d3 * d3;
            int n7 = n5 = d2 > 16.0 ? 1 : 0;
        }
        if (n5 != 0) {
            this.IlIlIIlIlIllIIlIlIIllIIIl = class_19652.lIlIIllIllIIIIIlIllllIIIl;
            this.lllllIlllIIllIlIIlIIIllII = class_19652.lIlllIIllIIIIIIlIlIIlIllI;
            this.IlIlIIlllIIlIllIIIlllllIl = class_19652.llIIIlIlIlIIlIllIIIllIlIl;
            this.IllIIIllIIIIlIlIlIllIIlll = class_19652.IlIIlllllIIlIlIlllllIllll;
            this.lIIIIlIlIIlllllIIllIIlIII = class_19652.llIIlIlIlllIIllIlIlllIllI;
            this.llIIlllIllIllllIIIlIIIIII = class_19652.IllIIIIllIIllIllIlllIlIIl;
            double d6 = class_19652.IlIIlllllIIlIlIlllllIllll - this.lIlIlIIlIIIIlIIIIIlllIIII;
            double d7 = class_19652.llIIlIlIlllIIllIlIlllIllI - this.IlIIIlIIIIllIIIllIIIIIIll;
            double d8 = class_19652.IllIIIIllIIllIllIlllIlIIl - this.IIlllIlIlllIllIIIlllIIlIl;
            double d9 = d6 * d6 + d7 * d7 + d8 * d8;
            n4 = this.IlIIIIIllIlllIIIIlIIIllIl * 16;
            if (d9 > (double)(n4 * n4) + 16.0) {
                this.lIlIlIIlIIIIlIIIIIlllIIII = class_19652.IlIIlllllIIlIlIlllllIllll;
                this.IlIIIlIIIIllIIIllIIIIIIll = class_19652.llIIlIlIlllIIllIlIlllIllI;
                this.IIlllIlIlllIllIIIlllIIlIl = class_19652.IllIIIIllIIllIllIlllIlIIl;
                this.IlIllllllIIlIIllllIIlIIIl(MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19652.IlIIlllllIIlIlIlllllIllll), MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19652.llIIlIlIlllIIllIlIlllIllI), MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19652.IllIIIIllIIllIllIlllIlIIl));
            }
            class_1441 class_14412 = new class_1441(class_19652);
            class_14412.lllIIIllIIIIlllIlIIllIIll(this.IIlIIlIlIlIllIIlIlIIIIlll, this.lIlIlIIllIIIlllIllIIlIllI);
            Arrays.sort(this.IIlIIlIlIlIllIIlIlIIIIlll, 0, this.lIlIlIIllIIIlllIllIIlIllI, class_14412);
            if (Config.IllIlllIIIlllllIllIIlIlIl()) {
                n3 = (int)class_19652.IlIIlllllIIlIlIlllllIllll;
                n2 = (int)class_19652.IllIIIIllIIllIllIlllIlIIl;
                int n8 = 2000;
                if (Math.abs(n3 - class_0734.lIlIlIIIIIIlIIllllIlIIllI) > n8 || Math.abs(n2 - class_0734.IllllIIIIlIIlIIIIlllIIIIl) > n8) {
                    class_0734.lIlIlIIIIIIlIIllllIlIIllI = n3;
                    class_0734.IllllIIIIlIIlIIIIlllIIIIl = n2;
                    this.lllIIIllIIIIlllIlIIllIIll();
                }
            }
        }
        if (Config.IllIIIIlIIlllllllllIlIlII()) {
            class_0734 class_07343;
            d4 = class_19652.IlIIlllllIIlIlIlllllIllll - this.llIIllIllIlIIlIIllIllllll;
            double d10 = class_19652.llIIlIlIlllIIllIlIlllIllI - this.lllIIlIIIllllllIIIIlIlIlI;
            d3 = class_19652.IllIIIIllIIllIllIlllIlIIl - this.IlIlllIIIIIIlIIllIIllIlll;
            int n9 = Math.min(27, this.lIlIlIIllIIIlllIllIIlIllI);
            if (d4 * d4 + d10 * d10 + d3 * d3 > 1.0) {
                this.llIIllIllIlIIlIIllIllllll = class_19652.IlIIlllllIIlIlIlllllIllll;
                this.lllIIlIIIllllllIIIIlIlIlI = class_19652.llIIlIlIlllIIllIlIlllIllI;
                this.IlIlllIIIIIIlIIllIIllIlll = class_19652.IllIIIIllIIllIllIlllIlIIl;
                for (int i = 0; i < n9; ++i) {
                    class_07343 = this.IIlIIlIlIlIllIIlIlIIIIlll[i];
                    if (class_07343.lllIIIllIIIIlllIlIIllIIll == null || !(class_07343.llllllIlIllllIlIlIlIIIIlI < 1152.0f)) continue;
                    class_07343.lllIIIIIIlIlllIIlIlIIIllI = true;
                    if (this.lIIlIlIIllIIIlIIlIlIIIlII <= i) continue;
                    this.lIIlIlIIllIIIlIIlIlIIIlII = i;
                }
            }
            if (this.lIIlIlIIllIIIlIIlIlIIIlII < n9) {
                while (this.lIIlIlIIllIIIlIIlIlIIIlII < n9) {
                    class_07343 = this.IIlIIlIlIlIllIIlIlIIIIlll[this.lIIlIlIIllIIIlIIlIlIIIlII];
                    ++this.lIIlIlIIllIIIlIIlIlIIIlII;
                    if (!class_07343.lllIIIIIIlIlllIIlIlIIIllI) continue;
                    class_07343.lllIlIIlIIIlIlIIIllIlllIl(class_19652);
                    break;
                }
            }
        }
        class_0624.lllIIIllIIIIlllIlIIllIIll();
        class_1379.lllIIIllIIIIlllIlIIllIIll(this, class_19652);
        if (this.lIllllIIlIIIlIllllllIIIll.gameSettings.lllllIlllIIllIlIIlIIIllII && n == 0) {
            GL11.glFinish();
        }
        int n10 = 0;
        int n11 = 0;
        if (this.IIllIllIIllIIlllIIIlIlllI && this.lIllllIIlIIIlIllllllIIIll.gameSettings.lIllllIIlIIIlIllllllIIIll && !this.lIllllIIlIIIlIllllllIIIll.gameSettings.IlIIIIIllllllIIlllIllllll && n == 0) {
            double d11 = class_19652.lIIIlIIIlIlllIllIIIlIIIlI + (class_19652.IlIIlllllIIlIlIlllllIllll - class_19652.lIIIlIIIlIlllIllIIIlIIIlI) * d;
            d3 = class_19652.lIIlIlllIllIlIlllIIIIIIII + (class_19652.llIIlIlIlllIIllIlIlllIllI - class_19652.lIIlIlllIllIlIlllIIIIIIII) * d;
            d2 = class_19652.IIlIllIIlllllIIlIIllllIIl + (class_19652.IllIIIIllIIllIllIlllIlIIl - class_19652.IIlIllIIlllllIIlIIllllIIl) * d;
            int n12 = 0;
            int n13 = Math.min(20, this.lIlIlIIllIIIlllIllIIlIllI);
            this.lllIIIllIIIIlllIlIIllIIll(n12, n13, class_19652.IlIIlllllIIlIlIlllllIllll, class_19652.llIIlIlIlllIIllIlIlllIllI, class_19652.IllIIIIllIIllIllIlllIlIIl);
            for (n3 = n12; n3 < n13; ++n3) {
                this.IIlIIlIlIlIllIIlIlIIIIlll[n3].lIlIllIIlIIlIIlIIlIIlIIll = true;
            }
            class_12422.endStartSection("render");
            n4 = n10 + this.lllIIIllIIIIlllIlIIllIIll(n12, n13, n, d);
            n3 = n13;
            n2 = 0;
            int n14 = 40;
            int n15 = this.IIIIlIllIlIIlIIlIllIlIlll;
            while (n3 < this.lIlIlIIllIIIlllIllIIlIllI) {
                class_12422.endStartSection("occ");
                int n16 = n3;
                n2 = n2 < n15 ? ++n2 : --n2;
                if ((n3 += n2 * n14) <= n16) {
                    n3 = n16 + 10;
                }
                if (n3 > this.lIlIlIIllIIIlllIllIIlIllI) {
                    n3 = this.lIlIlIIllIIIlllIllIIlIllI;
                }
                GL11.glDisable((int)3553);
                GL11.glDisable((int)2896);
                GL11.glDisable((int)3008);
                GL11.glDisable((int)2912);
                GL11.glColorMask((boolean)false, (boolean)false, (boolean)false, (boolean)false);
                GL11.glDepthMask((boolean)false);
                class_12422.startSection("check");
                this.lllIIIllIIIIlllIlIIllIIll(n16, n3, class_19652.IlIIlllllIIlIlIlllllIllll, class_19652.llIIlIlIlllIIllIlIlllIllI, class_19652.IllIIIIllIIllIllIlllIlIIl);
                class_12422.endSection();
                GL11.glPushMatrix();
                float f = 0.0f;
                float f2 = 0.0f;
                float f3 = 0.0f;
                for (int i = n16; i < n3; ++i) {
                    class_0734 class_07344 = this.IIlIIlIlIlIllIIlIlIIIIlll[i];
                    if (class_07344.IlIIIIIllllllIIlllIllllll()) {
                        class_07344.IlIlllIIIIIIlIIllIIllIlll = false;
                        continue;
                    }
                    if (!class_07344.IIllIllIIllIIlllIIIlIlllI && !class_07344.llIIIIllIIIIIIIlIIIlIIIIl) {
                        float f4;
                        float f5;
                        float f6;
                        float f7;
                        if (!class_07344.IlIlllIIIIIIlIIllIIllIlll) continue;
                        if (Config.lIlIlIIlIIIIlIIIIIlllIIII() && !class_07344.llllIIIIlIIIlIIIIIIlIllll) {
                            class_07344.lIlIllIIlIIlIIlIIlIIlIIll = true;
                            continue;
                        }
                        if (!class_07344.IlIlllIIIIIIlIIllIIllIlll || class_07344.llIIlIllIllllIlIIIIlIIlll) continue;
                        if (class_07344.IIlIIlIlIlIllIIlIlIIIIlll) {
                            f7 = Math.abs((float)(class_07344.llIIIlllIlllIlIllIIIIllIl - class_19652.IlIIlllllIIlIlIlllllIllll));
                            f4 = f7 + (f6 = Math.abs((float)(class_07344.IIIIlIllIlIIlIIlIllIlIlll - class_19652.llIIlIlIlllIIllIlIlllIllI))) + (f5 = Math.abs((float)(class_07344.IlIlIIlllIllllllllIIIlIlI - class_19652.IllIIIIllIIllIllIlllIlIIl)));
                            if ((double)f4 < 10.0 + (double)i / 1000.0) {
                                class_07344.lIlIllIIlIIlIIlIIlIIlIIll = true;
                                continue;
                            }
                            class_07344.IIlIIlIlIlIllIIlIlIIIIlll = false;
                        }
                        f7 = (float)((double)class_07344.IIIllIllIIlIlIlIlIllllIIl - d11);
                        f6 = (float)((double)class_07344.IllIIIllIIIIlIlIlIllIIlll - d3);
                        f5 = (float)((double)class_07344.lIIIIlIlIIlllllIIllIIlIII - d2);
                        f4 = f7 - f;
                        float f8 = f6 - f2;
                        float f9 = f5 - f3;
                        if (f4 != 0.0f || f8 != 0.0f || f9 != 0.0f) {
                            GL11.glTranslatef((float)f4, (float)f8, (float)f9);
                            f += f4;
                            f2 += f8;
                            f3 += f9;
                        }
                        class_12422.startSection("bb");
                        ARBOcclusionQuery.glBeginQueryARB((int)35092, (int)class_07344.llIllllIlIllIIIlIllIIlIlI);
                        class_07344.lIlllIlllIIIIlIIlllIllIII();
                        ARBOcclusionQuery.glEndQueryARB((int)35092);
                        class_12422.endSection();
                        class_07344.llIIlIllIllllIlIIIIlIIlll = true;
                        ++n11;
                        continue;
                    }
                    class_07344.lIlIllIIlIIlIIlIIlIIlIIll = true;
                }
                GL11.glPopMatrix();
                if (this.lIllllIIlIIIlIllllllIIIll.gameSettings.IlIIIIIllllllIIlllIllllll) {
                    if (class_0817.lllIlIIlIIIlIlIIIllIlllIl == 0) {
                        GL11.glColorMask((boolean)false, (boolean)true, (boolean)true, (boolean)true);
                    } else {
                        GL11.glColorMask((boolean)true, (boolean)false, (boolean)false, (boolean)true);
                    }
                } else {
                    GL11.glColorMask((boolean)true, (boolean)true, (boolean)true, (boolean)true);
                }
                GL11.glDepthMask((boolean)true);
                GL11.glEnable((int)3553);
                GL11.glEnable((int)3008);
                GL11.glEnable((int)2912);
                class_12422.endStartSection("render");
                n4 += this.lllIIIllIIIIlllIlIIllIIll(n16, n3, n, d);
            }
        } else {
            class_12422.endStartSection("render");
            n4 = n10 + this.lllIIIllIIIIlllIlIIllIIll(0, this.lIlIlIIllIIIlllIllIIlIllI, n, d);
        }
        class_12422.endSection();
        class_1379.lIllllIIlIIIlIllllllIIIll();
        return n4;
    }

    private void lllIIIllIIIIlllIlIIllIIll(int n, int n2, double d, double d2, double d3) {
        for (int i = n; i < n2; ++i) {
            class_0734 class_07342 = this.IIlIIlIlIlIllIIlIlIIIIlll[i];
            if (!class_07342.llIIlIllIllllIlIIIIlIIlll) continue;
            this.IIIllIllIIlIlIlIlIllllIIl.clear();
            ARBOcclusionQuery.glGetQueryObjectuARB((int)class_07342.llIllllIlIllIIIlIllIIlIlI, (int)34919, (IntBuffer)this.IIIllIllIIlIlIlIlIllllIIl);
            if (this.IIIllIllIIlIlIlIlIllllIIl.get(0) == 0) continue;
            class_07342.llIIlIllIllllIlIIIIlIIlll = false;
            this.IIIllIllIIlIlIlIlIllllIIl.clear();
            ARBOcclusionQuery.glGetQueryObjectuARB((int)class_07342.llIllllIlIllIIIlIllIIlIlI, (int)34918, (IntBuffer)this.IIIllIllIIlIlIlIlIllllIIl);
            if (!class_07342.IIllIllIIllIIlllIIIlIlllI && !class_07342.llIIIIllIIIIIIIlIIIlIIIIl) {
                boolean bl = class_07342.lIlIllIIlIIlIIlIIlIIlIIll;
                boolean bl2 = class_07342.lIlIllIIlIIlIIlIIlIIlIIll = this.IIIllIllIIlIlIlIlIllllIIl.get(0) > 0;
                if (!bl || !class_07342.lIlIllIIlIIlIIlIIlIIlIIll) continue;
                class_07342.IIlIIlIlIlIllIIlIlIIIIlll = true;
                class_07342.llIIIlllIlllIlIllIIIIllIl = d;
                class_07342.IIIIlIllIlIIlIIlIllIlIlll = d2;
                class_07342.IlIlIIlllIllllllllIIIlIlI = d3;
                continue;
            }
            class_07342.lIlIllIIlIIlIIlIIlIIlIIll = true;
        }
    }

    private int lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, double d) {
        int n4;
        int n5;
        int n6;
        if (Config.IllIlllIIIlllllIllIIlIlIl()) {
            return this.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3, d);
        }
        this.IIIIlIllIlIIIIIllllIIlllI.clear();
        int n7 = 0;
        int n8 = n;
        int n9 = n2;
        int n10 = 1;
        if (n3 == 1) {
            n8 = this.lIlIlIIllIIIlllIllIIlIllI - 1 - n;
            n9 = this.lIlIlIIllIIIlllIllIIlIllI - 1 - n2;
            n10 = -1;
        }
        for (int i = n8; i != n9; i += n10) {
            int n11;
            if (n3 == 0) {
                ++this.IllIlIlIIIlllIIllIIIIlIll;
                if (this.IIlIIlIlIlIllIIlIlIIIIlll[i].IlIlIIlIlIllIIlIlIIllIIIl[n3]) {
                    ++this.IlllIIIllllIIllIllIlIIlIl;
                } else if (!this.IIlIIlIlIlIllIIlIlIIIIlll[i].IlIlllIIIIIIlIIllIIllIlll) {
                    ++this.IlIIIlIllIIIllIIIIlIIlIll;
                } else if (this.IIllIllIIllIIlllIIIlIlllI && !this.IIlIIlIlIlIllIIlIlIIIIlll[i].lIlIllIIlIIlIIlIIlIIlIIll) {
                    ++this.llllIIllIlIlllllllIIlIIlI;
                } else {
                    ++this.IlllIIlllllllIIllIlIllllI;
                }
            }
            if (this.IIlIIlIlIlIllIIlIlIIIIlll[i].IlIlIIlIlIllIIlIlIIllIIIl[n3] || !this.IIlIIlIlIlIllIIlIlIIIIlll[i].IlIlllIIIIIIlIIllIIllIlll || this.IIllIllIIllIIlllIIIlIlllI && !this.IIlIIlIlIlIllIIlIlIIIIlll[i].lIlIllIIlIIlIIlIIlIIlIIll || (n11 = this.IIlIIlIlIlIllIIlIlIIIIlll[i].lllIlIIlIIIlIlIIIllIlllIl(n3)) < 0) continue;
            this.IIIIlIllIlIIIIIllllIIlllI.add(this.IIlIIlIlIlIllIIlIlIIIIlll[i]);
            ++n7;
        }
        if (n7 == 0) {
            return 0;
        }
        class_1965 class_19652 = this.lIllllIIlIIIlIllllllIIIll.llIIlllIllIllllIIIlIIIIII;
        double d2 = class_19652.lIIIlIIIlIlllIllIIIlIIIlI + (class_19652.IlIIlllllIIlIlIlllllIllll - class_19652.lIIIlIIIlIlllIllIIIlIIIlI) * d;
        double d3 = class_19652.lIIlIlllIllIlIlllIIIIIIII + (class_19652.llIIlIlIlllIIllIlIlllIllI - class_19652.lIIlIlllIllIlIlllIIIIIIII) * d;
        double d4 = class_19652.IIlIllIIlllllIIlIIllllIIl + (class_19652.IllIIIIllIIllIllIlllIlIIl - class_19652.IIlIllIIlllllIIlIIllllIIl) * d;
        int n12 = 0;
        for (n6 = 0; n6 < this.llllIlIIllIIlllllIIllIIll.length; ++n6) {
            this.llllIlIIllIIlllllIIllIIll[n6].lllIlIIlIIIlIlIIIllIlllIl();
        }
        for (n6 = 0; n6 < this.IIIIlIllIlIIIIIllllIIlllI.size(); ++n6) {
            class_0734 class_07342 = (class_0734)this.IIIIlIllIlIIIIIllllIIlllI.get(n6);
            n5 = -1;
            for (n4 = 0; n4 < n12; ++n4) {
                if (!this.llllIlIIllIIlllllIIllIIll[n4].lllIIIllIIIIlllIlIIllIIll(class_07342.IIIllIllIIlIlIlIlIllllIIl, class_07342.IllIIIllIIIIlIlIlIllIIlll, class_07342.lIIIIlIlIIlllllIIllIIlIII)) continue;
                n5 = n4;
            }
            if (n5 < 0) {
                n5 = n12++;
                this.llllIlIIllIIlllllIIllIIll[n5].lllIIIllIIIIlllIlIIllIIll(class_07342.IIIllIllIIlIlIlIlIllllIIl, class_07342.IllIIIllIIIIlIlIlIllIIlll, class_07342.lIIIIlIlIIlllllIIllIIlIII, d2, d3, d4);
            }
            this.llllIlIIllIIlllllIIllIIll[n5].lllIIIllIIIIlllIlIIllIIll(class_07342.lllIlIIlIIIlIlIIIllIlllIl(n3));
        }
        if (Config.lllllIlllIIllIlIIlIIIllII() && this.lIllllIIlIIIlIllllllIIIll.lIIlIIIIIlIlllIlIIlIlIlll.lllllIlllIIllIlIIlIIIllII) {
            GL11.glDisable((int)2912);
        }
        n6 = MathHelper.IlIllllllIIlIIllllIIlIIIl(d2);
        int n13 = MathHelper.IlIllllllIIlIIllllIIlIIIl(d4);
        n5 = n6 - (n6 & 0x3FF);
        n4 = n13 - (n13 & 0x3FF);
        Arrays.sort(this.llllIlIIllIIlllllIIllIIll, new class_0118(n5, n4));
        this.lllIIIllIIIIlllIlIIllIIll(n3, d);
        return n7;
    }

    private int lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, int n3, double d) {
        this.IlIlIllIIlIIIIlllIlIllIlI.clear();
        int n4 = 0;
        boolean bl = this.lIllllIIlIIIlIllllllIIIll.gameSettings.showDebugInfo;
        int n5 = n;
        int n6 = n2;
        int n7 = 1;
        if (n3 == 1) {
            n5 = this.lIlIlIIllIIIlllIllIIlIllI - 1 - n;
            n6 = this.lIlIlIIllIIIlllIllIIlIllI - 1 - n2;
            n7 = -1;
        }
        for (int i = n5; i != n6; i += n7) {
            int n8;
            class_0734 class_07342 = this.IIlIIlIlIlIllIIlIlIIIIlll[i];
            if (bl && n3 == 0) {
                ++this.IllIlIlIIIlllIIllIIIIlIll;
                if (class_07342.IlIlIIlIlIllIIlIlIIllIIIl[n3]) {
                    ++this.IlllIIIllllIIllIllIlIIlIl;
                } else if (!class_07342.IlIlllIIIIIIlIIllIIllIlll) {
                    ++this.IlIIIlIllIIIllIIIIlIIlIll;
                } else if (this.IIllIllIIllIIlllIIIlIlllI && !class_07342.lIlIllIIlIIlIIlIIlIIlIIll) {
                    ++this.llllIIllIlIlllllllIIlIIlI;
                } else {
                    ++this.IlllIIlllllllIIllIlIllllI;
                }
            }
            if (!class_07342.IlIlllIIIIIIlIIllIIllIlll || class_07342.IlIlIIlIlIllIIlIlIIllIIIl[n3] || this.IIllIllIIllIIlllIIIlIlllI && !class_07342.lIlIllIIlIIlIIlIIlIIlIIll || (n8 = class_07342.lllIlIIlIIIlIlIIIllIlllIl(n3)) < 0) continue;
            this.IlIlIllIIlIIIIlllIlIllIlI.put(n8);
            ++n4;
        }
        if (n4 == 0) {
            return 0;
        }
        if (Config.lllllIlllIIllIlIIlIIIllII() && this.lIllllIIlIIIlIllllllIIIll.lIIlIIIIIlIlllIlIIlIlIlll.lllllIlllIIllIlIIlIIIllII) {
            GL11.glDisable((int)2912);
        }
        this.IlIlIllIIlIIIIlllIlIllIlI.flip();
        class_1965 class_19652 = this.lIllllIIlIIIlIllllllIIIll.llIIlllIllIllllIIIlIIIIII;
        double d2 = class_19652.lIIIlIIIlIlllIllIIIlIIIlI + (class_19652.IlIIlllllIIlIlIlllllIllll - class_19652.lIIIlIIIlIlllIllIIIlIIIlI) * d - (double)class_0734.lIlIlIIIIIIlIIllllIlIIllI;
        double d3 = class_19652.lIIlIlllIllIlIlllIIIIIIII + (class_19652.llIIlIlIlllIIllIlIlllIllI - class_19652.lIIlIlllIllIlIlllIIIIIIII) * d;
        double d4 = class_19652.IIlIllIIlllllIIlIIllllIIl + (class_19652.IllIIIIllIIllIllIlllIlIIl - class_19652.IIlIllIIlllllIIlIIllllIIl) * d - (double)class_0734.IllllIIIIlIIlIIIIlllIIIIl;
        this.lIllllIIlIIIlIllllllIIIll.lIIlIIIIIlIlllIlIIlIlIlll.lllIlIIlIIIlIlIIIllIlllIl(d);
        GL11.glTranslatef((float)((float)(-d2)), (float)((float)(-d3)), (float)((float)(-d4)));
        GL11.glCallLists((IntBuffer)this.IlIlIllIIlIIIIlllIlIllIlI);
        GL11.glTranslatef((float)((float)d2), (float)((float)d3), (float)((float)d4));
        this.lIllllIIlIIIlIllllllIIIll.lIIlIIIIIlIlllIlIIlIlIlll.lllIIIllIIIIlllIlIIllIIll(d);
        return n4;
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n, double d) {
        this.lIllllIIlIIIlIllllllIIIll.lIIlIIIIIlIlllIlIIlIlIlll.lllIlIIlIIIlIlIIIllIlllIl(d);
        for (int i = 0; i < this.llllIlIIllIIlllllIIllIIll.length; ++i) {
            this.llllIlIIllIIlllllIIllIIll[i].lllIIIllIIIIlllIlIIllIIll();
        }
        this.lIllllIIlIIIlIllllllIIIll.lIIlIIIIIlIlllIlIIlIlIlll.lllIIIllIIIIlllIlIIllIIll(d);
    }

    public void lIllllIIlIIIlIllllllIIIll() {
        ++this.llllllIlIllllIlIlIlIIIIlI;
        if (this.llllllIlIllllIlIlIlIIIIlI % 20 == 0) {
            Iterator iterator = this.IllIIlllllllIIlIIlIIIIlIl.values().iterator();
            while (iterator.hasNext()) {
                class_2047 class_20472 = (class_2047)iterator.next();
                int n = class_20472.IlIIIIIllllllIIlllIllllll();
                if (this.llllllIlIllllIlIlIlIIIIlI - n <= 400) continue;
                iterator.remove();
            }
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(float f) {
        if (this.lIllllIIlIIIlIllllllIIIll.theWorld.IlIlIIlllIIlIllIIIlllllIl.IIIllIllIIlIlIlIlIllllIIl == 1) {
            if (!Config.lllIIIlIIlIlIllIIIIIlIIll()) {
                return;
            }
            GL11.glDisable((int)2912);
            GL11.glDisable((int)3008);
            GL11.glEnable((int)3042);
            OpenGlHelper.glBlendFunc(770, 771, 1, 0);
            class_0624.lllIIIllIIIIlllIlIIllIIll();
            GL11.glDepthMask((boolean)false);
            this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(IIIIIIIIlIllIIllIIlllIllI);
            class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
            for (int i = 0; i < 6; ++i) {
                GL11.glPushMatrix();
                if (i == 1) {
                    GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                }
                if (i == 2) {
                    GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                }
                if (i == 3) {
                    GL11.glRotatef((float)180.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                }
                if (i == 4) {
                    GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                }
                if (i == 5) {
                    GL11.glRotatef((float)-90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                }
                class_08682.lllIlIIlIIIlIlIIIllIlllIl();
                class_08682.IlIllllllIIlIIllllIIlIIIl(0x282828);
                class_08682.lllIIIllIIIIlllIlIIllIIll(-100.0, -100.0, -100.0, 0.0, 0.0);
                class_08682.lllIIIllIIIIlllIlIIllIIll(-100.0, -100.0, 100.0, 0.0, 16.0);
                class_08682.lllIIIllIIIIlllIlIIllIIll(100.0, -100.0, 100.0, 16.0, 16.0);
                class_08682.lllIIIllIIIIlllIlIIllIIll(100.0, -100.0, -100.0, 16.0, 0.0);
                class_08682.lllIIIllIIIIlllIlIIllIIll();
                GL11.glPopMatrix();
            }
            GL11.glDepthMask((boolean)true);
            GL11.glEnable((int)3553);
            GL11.glEnable((int)3008);
        } else if (this.lIllllIIlIIIlIllllllIIIll.theWorld.IlIlIIlllIIlIllIIIlllllIl.lIlllIlllIIIIlIIlllIllIII()) {
            float f2;
            float f3;
            int n;
            int n2;
            float f4;
            float f5;
            float f6;
            float f7;
            float f8;
            float f9;
            GL11.glDisable((int)3553);
            class_0864 class_08642 = this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll((class_1521)this.lIllllIIlIIIlIllllllIIIll.llIIlllIllIllllIIIlIIIIII, f);
            class_08642 = class_1689.lllIIIllIIIIlllIlIIllIIll(class_08642, (class_1843)this.lIllllIIlIIIlIllllllIIIll.theWorld, this.lIllllIIlIIIlIllllllIIIll.llIIlllIllIllllIIIlIIIIII.IlIIlllllIIlIlIlllllIllll, this.lIllllIIlIIIlIllllllIIIll.llIIlllIllIllllIIIlIIIIII.llIIlIlIlllIIllIlIlllIllI + 1.0, this.lIllllIIlIIIlIllllllIIIll.llIIlllIllIllllIIIlIIIIII.IllIIIIllIIllIllIlllIlIIl);
            float f10 = (float)class_08642.lllIIIllIIIIlllIlIIllIIll;
            float f11 = (float)class_08642.lllIlIIlIIIlIlIIIllIlllIl;
            float f12 = (float)class_08642.IlIllllllIIlIIllllIIlIIIl;
            if (this.lIllllIIlIIIlIllllllIIIll.gameSettings.IlIIIIIllllllIIlllIllllll) {
                float f13 = (f10 * 30.0f + f11 * 59.0f + f12 * 11.0f) / 100.0f;
                float f14 = (f10 * 30.0f + f11 * 70.0f) / 100.0f;
                f9 = (f10 * 30.0f + f12 * 70.0f) / 100.0f;
                f10 = f13;
                f11 = f14;
                f12 = f9;
            }
            GL11.glColor3f((float)f10, (float)f11, (float)f12);
            class_0868 class_08683 = class_0868.IlIIIIIllllllIIlllIllllll;
            GL11.glDepthMask((boolean)false);
            GL11.glEnable((int)2912);
            GL11.glColor3f((float)f10, (float)f11, (float)f12);
            if (Config.lllIIIlIIlIlIllIIIIIlIIll()) {
                GL11.glCallList((int)this.llIlllIIllIlllIlIlIlIIIll);
            }
            GL11.glDisable((int)2912);
            GL11.glDisable((int)3008);
            GL11.glEnable((int)3042);
            OpenGlHelper.glBlendFunc(770, 771, 1, 0);
            class_0624.lllIIIllIIIIlllIlIIllIIll();
            float[] arrf = this.lllIlIIlIIIlIlIIIllIlllIl.IlIlIIlllIIlIllIIIlllllIl.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl.IlIllllllIIlIIllllIIlIIIl(f), f);
            if (arrf != null && Config.IIIlIlIllIlllllIlIllllllI()) {
                GL11.glDisable((int)3553);
                GL11.glShadeModel((int)7425);
                GL11.glPushMatrix();
                GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)(MathHelper.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl.lIlllIlllIIIIlIIlllIllIII(f)) < 0.0f ? 180.0f : 0.0f), (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                f9 = arrf[0];
                f8 = arrf[1];
                f7 = arrf[2];
                if (this.lIllllIIlIIIlIllllllIIIll.gameSettings.IlIIIIIllllllIIlllIllllll) {
                    f6 = (f9 * 30.0f + f8 * 59.0f + f7 * 11.0f) / 100.0f;
                    f5 = (f9 * 30.0f + f8 * 70.0f) / 100.0f;
                    f4 = (f9 * 30.0f + f7 * 70.0f) / 100.0f;
                    f9 = f6;
                    f8 = f5;
                    f7 = f4;
                }
                class_08683.lllIIIllIIIIlllIlIIllIIll(6);
                class_08683.lllIIIllIIIIlllIlIIllIIll(f9, f8, f7, arrf[3]);
                class_08683.lllIIIllIIIIlllIlIIllIIll(0.0, 100.0, 0.0);
                n2 = 16;
                class_08683.lllIIIllIIIIlllIlIIllIIll(arrf[0], arrf[1], arrf[2], 0.0f);
                for (n = 0; n <= n2; ++n) {
                    f4 = (float)n * (float)Math.PI * 2.0f / (float)n2;
                    f3 = MathHelper.lllIIIllIIIIlllIlIIllIIll(f4);
                    f2 = MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f4);
                    class_08683.lllIIIllIIIIlllIlIIllIIll((double)(f3 * 120.0f), (double)(f2 * 120.0f), (double)(-f2 * 40.0f * arrf[3]));
                }
                class_08683.lllIIIllIIIIlllIlIIllIIll();
                GL11.glPopMatrix();
                GL11.glShadeModel((int)7424);
            }
            GL11.glEnable((int)3553);
            OpenGlHelper.glBlendFunc(770, 1, 1, 0);
            GL11.glPushMatrix();
            f9 = 1.0f - this.lllIlIIlIIIlIlIIIllIlllIl.IllIIIllIIIIlIlIlIllIIlll(f);
            f8 = 0.0f;
            f7 = 0.0f;
            f6 = 0.0f;
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)f9);
            GL11.glTranslatef((float)f8, (float)f7, (float)f6);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            class_1065.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lllIlIIlIIIlIlIIIllIlllIl.IlIllllllIIlIIllllIIlIIIl(f), f9);
            GL11.glRotatef((float)(this.lllIlIIlIIIlIlIIIllIlllIl.IlIllllllIIlIIllllIIlIIIl(f) * 360.0f), (float)1.0f, (float)0.0f, (float)0.0f);
            if (Config.IIIlIlIllIlllllIlIllllllI()) {
                f5 = 30.0f;
                this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(llIIlIlIlllIIllIlIlllIllI);
                class_08683.lllIlIIlIIIlIlIIIllIlllIl();
                class_08683.lllIIIllIIIIlllIlIIllIIll(-f5, 100.0, -f5, 0.0, 0.0);
                class_08683.lllIIIllIIIIlllIlIIllIIll(f5, 100.0, -f5, 1.0, 0.0);
                class_08683.lllIIIllIIIIlllIlIIllIIll(f5, 100.0, f5, 1.0, 1.0);
                class_08683.lllIIIllIIIIlllIlIIllIIll(-f5, 100.0, f5, 0.0, 1.0);
                class_08683.lllIIIllIIIIlllIlIIllIIll();
                f5 = 20.0f;
                this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(IlIIlllllIIlIlIlllllIllll);
                n2 = this.lllIlIIlIIIlIlIIIllIlllIl.llIIlllIllIllllIIIlIIIIII();
                int n3 = n2 % 4;
                n = n2 / 4 % 2;
                f3 = (float)(n3 + 0) / 4.0f;
                f2 = (float)(n + 0) / 2.0f;
                float f15 = (float)(n3 + 1) / 4.0f;
                float f16 = (float)(n + 1) / 2.0f;
                class_08683.lllIlIIlIIIlIlIIIllIlllIl();
                class_08683.lllIIIllIIIIlllIlIIllIIll(-f5, -100.0, f5, f15, f16);
                class_08683.lllIIIllIIIIlllIlIIllIIll(f5, -100.0, f5, f3, f16);
                class_08683.lllIIIllIIIIlllIlIIllIIll(f5, -100.0, -f5, f3, f2);
                class_08683.lllIIIllIIIIlllIlIIllIIll(-f5, -100.0, -f5, f15, f2);
                class_08683.lllIIIllIIIIlllIlIIllIIll();
            }
            GL11.glDisable((int)3553);
            f4 = this.lllIlIIlIIIlIlIIIllIlllIl.IIIllIIlIIIIIIlIlIIllIIlI(f) * f9;
            if (f4 > 0.0f && Config.llllIlIIllIIlllllIIllIIll() && !class_1065.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl)) {
                GL11.glColor4f((float)f4, (float)f4, (float)f4, (float)f4);
                GL11.glCallList((int)this.lIlIIllllIlIIIIllIIIIlIIl);
            }
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glDisable((int)3042);
            GL11.glEnable((int)3008);
            GL11.glEnable((int)2912);
            GL11.glPopMatrix();
            GL11.glDisable((int)3553);
            GL11.glColor3f((float)0.0f, (float)0.0f, (float)0.0f);
            double d = this.lIllllIIlIIIlIllllllIIIll.lIIIIlIlIIlllllIIllIIlIII.lllIIlIIIllllllIIIIlIlIlI((float)f).lllIlIIlIIIlIlIIIllIlllIl - this.lllIlIIlIIIlIlIIIllIlllIl.llIIIlllIlllIlIllIIIIllIl();
            if (d < 0.0) {
                GL11.glPushMatrix();
                GL11.glTranslatef((float)0.0f, (float)12.0f, (float)0.0f);
                GL11.glCallList((int)this.IIIIlIIlIIIllIIIIllIIIlII);
                GL11.glPopMatrix();
                f7 = 1.0f;
                f6 = -((float)(d + 65.0));
                f5 = -f7;
                class_08683.lllIlIIlIIIlIlIIIllIlllIl();
                class_08683.lllIIIllIIIIlllIlIIllIIll(0, 255);
                class_08683.lllIIIllIIIIlllIlIIllIIll((double)(-f7), (double)f6, (double)f7);
                class_08683.lllIIIllIIIIlllIlIIllIIll((double)f7, (double)f6, (double)f7);
                class_08683.lllIIIllIIIIlllIlIIllIIll((double)f7, (double)f5, (double)f7);
                class_08683.lllIIIllIIIIlllIlIIllIIll((double)(-f7), (double)f5, (double)f7);
                class_08683.lllIIIllIIIIlllIlIIllIIll((double)(-f7), (double)f5, (double)(-f7));
                class_08683.lllIIIllIIIIlllIlIIllIIll((double)f7, (double)f5, (double)(-f7));
                class_08683.lllIIIllIIIIlllIlIIllIIll((double)f7, (double)f6, (double)(-f7));
                class_08683.lllIIIllIIIIlllIlIIllIIll((double)(-f7), (double)f6, (double)(-f7));
                class_08683.lllIIIllIIIIlllIlIIllIIll((double)f7, (double)f5, (double)(-f7));
                class_08683.lllIIIllIIIIlllIlIIllIIll((double)f7, (double)f5, (double)f7);
                class_08683.lllIIIllIIIIlllIlIIllIIll((double)f7, (double)f6, (double)f7);
                class_08683.lllIIIllIIIIlllIlIIllIIll((double)f7, (double)f6, (double)(-f7));
                class_08683.lllIIIllIIIIlllIlIIllIIll((double)(-f7), (double)f6, (double)(-f7));
                class_08683.lllIIIllIIIIlllIlIIllIIll((double)(-f7), (double)f6, (double)f7);
                class_08683.lllIIIllIIIIlllIlIIllIIll((double)(-f7), (double)f5, (double)f7);
                class_08683.lllIIIllIIIIlllIlIIllIIll((double)(-f7), (double)f5, (double)(-f7));
                class_08683.lllIIIllIIIIlllIlIIllIIll((double)(-f7), (double)f5, (double)(-f7));
                class_08683.lllIIIllIIIIlllIlIIllIIll((double)(-f7), (double)f5, (double)f7);
                class_08683.lllIIIllIIIIlllIlIIllIIll((double)f7, (double)f5, (double)f7);
                class_08683.lllIIIllIIIIlllIlIIllIIll((double)f7, (double)f5, (double)(-f7));
                class_08683.lllIIIllIIIIlllIlIIllIIll();
            }
            if (this.lllIlIIlIIIlIlIIIllIlllIl.IlIlIIlllIIlIllIIIlllllIl.IIIllIIlIIIIIIlIlIIllIIlI()) {
                GL11.glColor3f((float)(f10 * 0.2f + 0.04f), (float)(f11 * 0.2f + 0.04f), (float)(f12 * 0.6f + 0.1f));
            } else {
                GL11.glColor3f((float)f10, (float)f11, (float)f12);
            }
            if (this.lIllllIIlIIIlIllllllIIIll.gameSettings.IlIllllllIIlIIllllIIlIIIl <= 4) {
                GL11.glColor3f((float)this.lIllllIIlIIIlIllllllIIIll.lIIlIIIIIlIlllIlIIlIlIlll.llIIllIllIlIIlIIllIllllll, (float)this.lIllllIIlIIIlIllllllIIIll.lIIlIIIIIlIlllIlIIlIlIlll.lllIIlIIIllllllIIIIlIlIlI, (float)this.lIllllIIlIIIlIllllllIIIll.lIIlIIIIIlIlllIlIIlIlIlll.IlIlllIIIIIIlIIllIIllIlll);
            }
            GL11.glPushMatrix();
            GL11.glTranslatef((float)0.0f, (float)(-((float)(d - 16.0))), (float)0.0f);
            if (Config.lllIIIlIIlIlIllIIIIIlIIll()) {
                GL11.glCallList((int)this.IIIIlIIlIIIllIIIIllIIIlII);
            }
            GL11.glPopMatrix();
            GL11.glEnable((int)3553);
            GL11.glDepthMask((boolean)true);
        }
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(float f) {
        if (!Config.IllIIIIllIIllIllIlllIlIIl() && this.lIllllIIlIIIlIllllllIIIll.theWorld.IlIlIIlllIIlIllIIIlllllIl.lIlllIlllIIIIlIIlllIllIII()) {
            if (Config.llIIlIlIlllIIllIlIlllIllI()) {
                this.IlIllllllIIlIIllllIIlIIIl(f);
            } else {
                double d;
                double d2;
                float f2;
                Object object;
                float f3 = f;
                f = 0.0f;
                GL11.glDisable((int)2884);
                float f4 = (float)(this.lIllllIIlIIIlIllllllIIIll.llIIlllIllIllllIIIlIIIIII.lIIlIlllIllIlIlllIIIIIIII + (this.lIllllIIlIIIlIllllllIIIll.llIIlllIllIllllIIIlIIIIII.llIIlIlIlllIIllIlIlllIllI - this.lIllllIIlIIIlIllllllIIIll.llIIlllIllIllllIIIlIIIIII.lIIlIlllIllIlIlllIIIIIIII) * (double)f);
                int n = 32;
                int n2 = 256 / n;
                class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
                this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(IllIIIIllIIllIllIlllIlIIl);
                GL11.glEnable((int)3042);
                OpenGlHelper.glBlendFunc(770, 771, 1, 0);
                if (this.lIlIIllIllIIIIIlIllllIIIl || this.llllllIlIllllIlIlIlIIIIlI >= this.lIlllIIllIIIIIIlIlIIlIllI + 20) {
                    float f5;
                    GL11.glNewList((int)this.IlIIllIlIlIllIIIlIIlIlIIl, (int)4864);
                    object = this.lllIlIIlIIIlIlIIIllIlllIl.IlIIIIIllllllIIlllIllllll(f);
                    float f6 = (float)((class_0864)object).lllIIIllIIIIlllIlIIllIIll;
                    float f7 = (float)((class_0864)object).lllIlIIlIIIlIlIIIllIlllIl;
                    float f8 = (float)((class_0864)object).IlIllllllIIlIIllllIIlIIIl;
                    if (this.lIllllIIlIIIlIllllllIIIll.gameSettings.IlIIIIIllllllIIlllIllllll) {
                        f5 = (f6 * 30.0f + f7 * 59.0f + f8 * 11.0f) / 100.0f;
                        float f9 = (f6 * 30.0f + f7 * 70.0f) / 100.0f;
                        f2 = (f6 * 30.0f + f8 * 70.0f) / 100.0f;
                        f6 = f5;
                        f7 = f9;
                        f8 = f2;
                    }
                    f5 = 4.8828125E-4f;
                    d2 = (float)this.llllllIlIllllIlIlIlIIIIlI + f;
                    d = this.lIllllIIlIIIlIllllllIIIll.llIIlllIllIllllIIIlIIIIII.llIIlIllIllllIlIIIIlIIlll + (this.lIllllIIlIIIlIllllllIIIll.llIIlllIllIllllIIIlIIIIII.IlIIlllllIIlIlIlllllIllll - this.lIllllIIlIIIlIllllllIIIll.llIIlllIllIllllIIIlIIIIII.llIIlIllIllllIlIIIIlIIlll) * (double)f + d2 * (double)0.03f;
                    double d3 = this.lIllllIIlIIIlIllllllIIIll.llIIlllIllIllllIIIlIIIIII.lIlllIlllIlIIIIlllIlIlIIl + (this.lIllllIIlIIIlIllllllIIIll.llIIlllIllIllllIIIlIIIIII.IllIIIIllIIllIllIlllIlIIl - this.lIllllIIlIIIlIllllllIIIll.llIIlllIllIllllIIIlIIIIII.lIlllIlllIlIIIIlllIlIlIIl) * (double)f;
                    int n3 = MathHelper.IlIllllllIIlIIllllIIlIIIl(d / 2048.0);
                    int n4 = MathHelper.IlIllllllIIlIIllllIIlIIIl(d3 / 2048.0);
                    float f10 = this.lllIlIIlIIIlIlIIIllIlllIl.IlIlIIlllIIlIllIIIlllllIl.lIllllIIlIIIlIllllllIIIll() - f4 + 0.33f;
                    f10 += this.lIllllIIlIIIlIllllllIIIll.gameSettings.lIlIllIIlIIlIIlIIlIIlIIll * 128.0f;
                    float f11 = (float)((d -= (double)(n3 * 2048)) * (double)f5);
                    f4 = (float)((d3 -= (double)(n4 * 2048)) * (double)f5);
                    class_08682.lllIlIIlIIIlIlIIIllIlllIl();
                    class_08682.lllIIIllIIIIlllIlIIllIIll(f6, f7, f8, 0.8f);
                    for (int i = -n * n2; i < n * n2; i += n) {
                        for (int j = -n * n2; j < n * n2; j += n) {
                            class_08682.lllIIIllIIIIlllIlIIllIIll(i + 0, f10, j + n, (float)(i + 0) * f5 + f11, (float)(j + n) * f5 + f4);
                            class_08682.lllIIIllIIIIlllIlIIllIIll(i + n, f10, j + n, (float)(i + n) * f5 + f11, (float)(j + n) * f5 + f4);
                            class_08682.lllIIIllIIIIlllIlIIllIIll(i + n, f10, j + 0, (float)(i + n) * f5 + f11, (float)(j + 0) * f5 + f4);
                            class_08682.lllIIIllIIIIlllIlIIllIIll(i + 0, f10, j + 0, (float)(i + 0) * f5 + f11, (float)(j + 0) * f5 + f4);
                        }
                    }
                    class_08682.lllIIIllIIIIlllIlIIllIIll();
                    GL11.glEndList();
                    this.lIlIIllIllIIIIIlIllllIIIl = false;
                    this.lIlllIIllIIIIIIlIlIIlIllI = this.llllllIlIllllIlIlIlIIIIlI;
                    this.llIIIlIlIlIIlIllIIIllIlIl = this.lIllllIIlIIIlIllllllIIIll.llIIlllIllIllllIIIlIIIIII.llIIlIllIllllIlIIIIlIIlll;
                    this.lIIlIIlIllIlIIlIlIIlIlIlI = this.lIllllIIlIIIlIllllllIIIll.llIIlllIllIllllIIIlIIIIII.llIllllIlIllIIIlIllIIlIlI;
                    this.llIIIIIlIIlIIIIllIIIlIIII = this.lIllllIIlIIIlIllllllIIIll.llIIlllIllIllllIIIlIIIIII.lIlllIlllIlIIIIlllIlIlIIl;
                }
                object = this.lIllllIIlIIIlIllllllIIIll.llIIlllIllIllllIIIlIIIIII;
                double d4 = ((class_1965)object).llIIlIllIllllIlIIIIlIIlll + (((class_1965)object).IlIIlllllIIlIlIlllllIllll - ((class_1965)object).llIIlIllIllllIlIIIIlIIlll) * (double)f3;
                double d5 = ((class_1965)object).llIllllIlIllIIIlIllIIlIlI + (((class_1965)object).llIIlIlIlllIIllIlIlllIllI - ((class_1965)object).llIllllIlIllIIIlIllIIlIlI) * (double)f3;
                d2 = ((class_1965)object).lIlllIlllIlIIIIlllIlIlIIl + (((class_1965)object).IllIIIIllIIllIllIlllIlIIl - ((class_1965)object).lIlllIlllIlIIIIlllIlIlIIl) * (double)f3;
                d = (float)(this.llllllIlIllllIlIlIlIIIIlI - this.lIlllIIllIIIIIIlIlIIlIllI) + f3;
                float f12 = (float)(d4 - this.llIIIlIlIlIIlIllIIIllIlIl + d * 0.03);
                f2 = (float)(d5 - this.lIIlIIlIllIlIIlIlIIlIlIlI);
                float f13 = (float)(d2 - this.llIIIIIlIIlIIIIllIIIlIIII);
                GL11.glTranslatef((float)(-f12), (float)(-f2), (float)(-f13));
                GL11.glCallList((int)this.IlIIllIlIlIllIIIlIIlIlIIl);
                GL11.glTranslatef((float)f12, (float)f2, (float)f13);
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                GL11.glDisable((int)3042);
                GL11.glEnable((int)2884);
            }
        }
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(double d, double d2, double d3, float f) {
        return false;
    }

    public void IlIllllllIIlIIllllIIlIIIl(float f) {
        float f2;
        Object object;
        float f3 = f;
        f = 0.0f;
        GL11.glDisable((int)2884);
        float f4 = (float)(this.lIllllIIlIIIlIllllllIIIll.llIIlllIllIllllIIIlIIIIII.lIIlIlllIllIlIlllIIIIIIII + (this.lIllllIIlIIIlIllllllIIIll.llIIlllIllIllllIIIlIIIIII.llIIlIlIlllIIllIlIlllIllI - this.lIllllIIlIIIlIllllllIIIll.llIIlllIllIllllIIIlIIIIII.lIIlIlllIllIlIlllIIIIIIII) * (double)f);
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        float f5 = 12.0f;
        float f6 = 4.0f;
        double d = (float)this.llllllIlIllllIlIlIlIIIIlI + f;
        double d2 = (this.lIllllIIlIIIlIllllllIIIll.llIIlllIllIllllIIIlIIIIII.llIIlIllIllllIlIIIIlIIlll + (this.lIllllIIlIIIlIllllllIIIll.llIIlllIllIllllIIIlIIIIII.IlIIlllllIIlIlIlllllIllll - this.lIllllIIlIIIlIllllllIIIll.llIIlllIllIllllIIIlIIIIII.llIIlIllIllllIlIIIIlIIlll) * (double)f + d * (double)0.03f) / (double)f5;
        double d3 = (this.lIllllIIlIIIlIllllllIIIll.llIIlllIllIllllIIIlIIIIII.lIlllIlllIlIIIIlllIlIlIIl + (this.lIllllIIlIIIlIllllllIIIll.llIIlllIllIllllIIIlIIIIII.IllIIIIllIIllIllIlllIlIIl - this.lIllllIIlIIIlIllllllIIIll.llIIlllIllIllllIIIlIIIIII.lIlllIlllIlIIIIlllIlIlIIl) * (double)f) / (double)f5 + (double)0.33f;
        float f7 = this.lllIlIIlIIIlIlIIIllIlllIl.IlIlIIlllIIlIllIIIlllllIl.lIllllIIlIIIlIllllllIIIll() - f4 + 0.33f;
        f7 += this.lIllllIIlIIIlIllllllIIIll.gameSettings.lIlIllIIlIIlIIlIIlIIlIIll * 128.0f;
        int n = MathHelper.IlIllllllIIlIIllllIIlIIIl(d2 / 2048.0);
        int n2 = MathHelper.IlIllllllIIlIIllllIIlIIIl(d3 / 2048.0);
        d2 -= (double)(n * 2048);
        d3 -= (double)(n2 * 2048);
        this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(IllIIIIllIIllIllIlllIlIIl);
        GL11.glEnable((int)3042);
        OpenGlHelper.glBlendFunc(770, 771, 1, 0);
        if (!this.lIlIIllIllIIIIIlIllllIIIl || this.llllllIlIllllIlIlIlIIIIlI >= this.lIlllIIllIIIIIIlIlIIlIllI + 20) {
            float f8;
            float f9;
            float f10;
            GL11.glNewList((int)this.IlIIllIlIlIllIIIlIIlIlIIl, (int)4864);
            object = this.lllIlIIlIIIlIlIIIllIlllIl.IlIIIIIllllllIIlllIllllll(f);
            float f11 = (float)((class_0864)object).lllIIIllIIIIlllIlIIllIIll;
            float f12 = (float)((class_0864)object).lllIlIIlIIIlIlIIIllIlllIl;
            float f13 = (float)((class_0864)object).IlIllllllIIlIIllllIIlIIIl;
            if (this.lIllllIIlIIIlIllllllIIIll.gameSettings.IlIIIIIllllllIIlllIllllll) {
                f10 = (f11 * 30.0f + f12 * 59.0f + f13 * 11.0f) / 100.0f;
                f9 = (f11 * 30.0f + f12 * 70.0f) / 100.0f;
                f8 = (f11 * 30.0f + f13 * 70.0f) / 100.0f;
                f11 = f10;
                f12 = f9;
                f13 = f8;
            }
            f10 = (float)(d2 * 0.0);
            f9 = (float)(d3 * 0.0);
            f8 = 0.00390625f;
            f10 = (float) MathHelper.IlIllllllIIlIIllllIIlIIIl(d2) * f8;
            f9 = (float) MathHelper.IlIllllllIIlIIllllIIlIIIl(d3) * f8;
            float f14 = (float)(d2 - (double) MathHelper.IlIllllllIIlIIllllIIlIIIl(d2));
            float f15 = (float)(d3 - (double) MathHelper.IlIllllllIIlIIllllIIlIIIl(d3));
            int n3 = 8;
            int n4 = 4;
            f2 = 9.765625E-4f;
            GL11.glScalef((float)f5, (float)1.0f, (float)f5);
            for (int i = 0; i < 2; ++i) {
                if (i == 0) {
                    GL11.glColorMask((boolean)false, (boolean)false, (boolean)false, (boolean)false);
                } else if (this.lIllllIIlIIIlIllllllIIIll.gameSettings.IlIIIIIllllllIIlllIllllll) {
                    if (class_0817.lllIlIIlIIIlIlIIIllIlllIl == 0) {
                        GL11.glColorMask((boolean)false, (boolean)true, (boolean)true, (boolean)true);
                    } else {
                        GL11.glColorMask((boolean)true, (boolean)false, (boolean)false, (boolean)true);
                    }
                } else {
                    GL11.glColorMask((boolean)true, (boolean)true, (boolean)true, (boolean)true);
                }
                for (int j = -n4 + 1; j <= n4; ++j) {
                    for (int k = -n4 + 1; k <= n4; ++k) {
                        int n5;
                        class_08682.lllIlIIlIIIlIlIIIllIlllIl();
                        float f16 = j * n3;
                        float f17 = k * n3;
                        float f18 = f16 - f14;
                        float f19 = f17 - f15;
                        if (f7 > -f6 - 1.0f) {
                            class_08682.lllIIIllIIIIlllIlIIllIIll(f11 * 0.7f, f12 * 0.7f, f13 * 0.7f, 0.8f);
                            class_08682.IlIllllllIIlIIllllIIlIIIl(0.0f, -1.0f, 0.0f);
                            class_08682.lllIIIllIIIIlllIlIIllIIll(f18 + 0.0f, f7 + 0.0f, f19 + (float)n3, (f16 + 0.0f) * f8 + f10, (f17 + (float)n3) * f8 + f9);
                            class_08682.lllIIIllIIIIlllIlIIllIIll(f18 + (float)n3, f7 + 0.0f, f19 + (float)n3, (f16 + (float)n3) * f8 + f10, (f17 + (float)n3) * f8 + f9);
                            class_08682.lllIIIllIIIIlllIlIIllIIll(f18 + (float)n3, f7 + 0.0f, f19 + 0.0f, (f16 + (float)n3) * f8 + f10, (f17 + 0.0f) * f8 + f9);
                            class_08682.lllIIIllIIIIlllIlIIllIIll(f18 + 0.0f, f7 + 0.0f, f19 + 0.0f, (f16 + 0.0f) * f8 + f10, (f17 + 0.0f) * f8 + f9);
                        }
                        if (f7 <= f6 + 1.0f) {
                            class_08682.lllIIIllIIIIlllIlIIllIIll(f11, f12, f13, 0.8f);
                            class_08682.IlIllllllIIlIIllllIIlIIIl(0.0f, 1.0f, 0.0f);
                            class_08682.lllIIIllIIIIlllIlIIllIIll(f18 + 0.0f, f7 + f6 - f2, f19 + (float)n3, (f16 + 0.0f) * f8 + f10, (f17 + (float)n3) * f8 + f9);
                            class_08682.lllIIIllIIIIlllIlIIllIIll(f18 + (float)n3, f7 + f6 - f2, f19 + (float)n3, (f16 + (float)n3) * f8 + f10, (f17 + (float)n3) * f8 + f9);
                            class_08682.lllIIIllIIIIlllIlIIllIIll(f18 + (float)n3, f7 + f6 - f2, f19 + 0.0f, (f16 + (float)n3) * f8 + f10, (f17 + 0.0f) * f8 + f9);
                            class_08682.lllIIIllIIIIlllIlIIllIIll(f18 + 0.0f, f7 + f6 - f2, f19 + 0.0f, (f16 + 0.0f) * f8 + f10, (f17 + 0.0f) * f8 + f9);
                        }
                        class_08682.lllIIIllIIIIlllIlIIllIIll(f11 * 0.9f, f12 * 0.9f, f13 * 0.9f, 0.8f);
                        if (j > -1) {
                            class_08682.IlIllllllIIlIIllllIIlIIIl(-1.0f, 0.0f, 0.0f);
                            for (n5 = 0; n5 < n3; ++n5) {
                                class_08682.lllIIIllIIIIlllIlIIllIIll(f18 + (float)n5 + 0.0f, f7 + 0.0f, f19 + (float)n3, (f16 + (float)n5 + 0.5f) * f8 + f10, (f17 + (float)n3) * f8 + f9);
                                class_08682.lllIIIllIIIIlllIlIIllIIll(f18 + (float)n5 + 0.0f, f7 + f6, f19 + (float)n3, (f16 + (float)n5 + 0.5f) * f8 + f10, (f17 + (float)n3) * f8 + f9);
                                class_08682.lllIIIllIIIIlllIlIIllIIll(f18 + (float)n5 + 0.0f, f7 + f6, f19 + 0.0f, (f16 + (float)n5 + 0.5f) * f8 + f10, (f17 + 0.0f) * f8 + f9);
                                class_08682.lllIIIllIIIIlllIlIIllIIll(f18 + (float)n5 + 0.0f, f7 + 0.0f, f19 + 0.0f, (f16 + (float)n5 + 0.5f) * f8 + f10, (f17 + 0.0f) * f8 + f9);
                            }
                        }
                        if (j <= 1) {
                            class_08682.IlIllllllIIlIIllllIIlIIIl(1.0f, 0.0f, 0.0f);
                            for (n5 = 0; n5 < n3; ++n5) {
                                class_08682.lllIIIllIIIIlllIlIIllIIll(f18 + (float)n5 + 1.0f - f2, f7 + 0.0f, f19 + (float)n3, (f16 + (float)n5 + 0.5f) * f8 + f10, (f17 + (float)n3) * f8 + f9);
                                class_08682.lllIIIllIIIIlllIlIIllIIll(f18 + (float)n5 + 1.0f - f2, f7 + f6, f19 + (float)n3, (f16 + (float)n5 + 0.5f) * f8 + f10, (f17 + (float)n3) * f8 + f9);
                                class_08682.lllIIIllIIIIlllIlIIllIIll(f18 + (float)n5 + 1.0f - f2, f7 + f6, f19 + 0.0f, (f16 + (float)n5 + 0.5f) * f8 + f10, (f17 + 0.0f) * f8 + f9);
                                class_08682.lllIIIllIIIIlllIlIIllIIll(f18 + (float)n5 + 1.0f - f2, f7 + 0.0f, f19 + 0.0f, (f16 + (float)n5 + 0.5f) * f8 + f10, (f17 + 0.0f) * f8 + f9);
                            }
                        }
                        class_08682.lllIIIllIIIIlllIlIIllIIll(f11 * 0.8f, f12 * 0.8f, f13 * 0.8f, 0.8f);
                        if (k > -1) {
                            class_08682.IlIllllllIIlIIllllIIlIIIl(0.0f, 0.0f, -1.0f);
                            for (n5 = 0; n5 < n3; ++n5) {
                                class_08682.lllIIIllIIIIlllIlIIllIIll(f18 + 0.0f, f7 + f6, f19 + (float)n5 + 0.0f, (f16 + 0.0f) * f8 + f10, (f17 + (float)n5 + 0.5f) * f8 + f9);
                                class_08682.lllIIIllIIIIlllIlIIllIIll(f18 + (float)n3, f7 + f6, f19 + (float)n5 + 0.0f, (f16 + (float)n3) * f8 + f10, (f17 + (float)n5 + 0.5f) * f8 + f9);
                                class_08682.lllIIIllIIIIlllIlIIllIIll(f18 + (float)n3, f7 + 0.0f, f19 + (float)n5 + 0.0f, (f16 + (float)n3) * f8 + f10, (f17 + (float)n5 + 0.5f) * f8 + f9);
                                class_08682.lllIIIllIIIIlllIlIIllIIll(f18 + 0.0f, f7 + 0.0f, f19 + (float)n5 + 0.0f, (f16 + 0.0f) * f8 + f10, (f17 + (float)n5 + 0.5f) * f8 + f9);
                            }
                        }
                        if (k <= 1) {
                            class_08682.IlIllllllIIlIIllllIIlIIIl(0.0f, 0.0f, 1.0f);
                            for (n5 = 0; n5 < n3; ++n5) {
                                class_08682.lllIIIllIIIIlllIlIIllIIll(f18 + 0.0f, f7 + f6, f19 + (float)n5 + 1.0f - f2, (f16 + 0.0f) * f8 + f10, (f17 + (float)n5 + 0.5f) * f8 + f9);
                                class_08682.lllIIIllIIIIlllIlIIllIIll(f18 + (float)n3, f7 + f6, f19 + (float)n5 + 1.0f - f2, (f16 + (float)n3) * f8 + f10, (f17 + (float)n5 + 0.5f) * f8 + f9);
                                class_08682.lllIIIllIIIIlllIlIIllIIll(f18 + (float)n3, f7 + 0.0f, f19 + (float)n5 + 1.0f - f2, (f16 + (float)n3) * f8 + f10, (f17 + (float)n5 + 0.5f) * f8 + f9);
                                class_08682.lllIIIllIIIIlllIlIIllIIll(f18 + 0.0f, f7 + 0.0f, f19 + (float)n5 + 1.0f - f2, (f16 + 0.0f) * f8 + f10, (f17 + (float)n5 + 0.5f) * f8 + f9);
                            }
                        }
                        class_08682.lllIIIllIIIIlllIlIIllIIll();
                    }
                }
            }
            GL11.glEndList();
            this.lIlIIllIllIIIIIlIllllIIIl = true;
            this.lIlllIIllIIIIIIlIlIIlIllI = this.llllllIlIllllIlIlIlIIIIlI;
            this.llIIIlIlIlIIlIllIIIllIlIl = this.lIllllIIlIIIlIllllllIIIll.llIIlllIllIllllIIIlIIIIII.llIIlIllIllllIlIIIIlIIlll;
            this.lIIlIIlIllIlIIlIlIIlIlIlI = this.lIllllIIlIIIlIllllllIIIll.llIIlllIllIllllIIIlIIIIII.llIllllIlIllIIIlIllIIlIlI;
            this.llIIIIIlIIlIIIIllIIIlIIII = this.lIllllIIlIIIlIllllllIIIll.llIIlllIllIllllIIIlIIIIII.lIlllIlllIlIIIIlllIlIlIIl;
        }
        object = this.lIllllIIlIIIlIllllllIIIll.llIIlllIllIllllIIIlIIIIII;
        double d4 = ((class_1965)object).llIIlIllIllllIlIIIIlIIlll + (((class_1965)object).IlIIlllllIIlIlIlllllIllll - ((class_1965)object).llIIlIllIllllIlIIIIlIIlll) * (double)f3;
        double d5 = ((class_1965)object).llIllllIlIllIIIlIllIIlIlI + (((class_1965)object).llIIlIlIlllIIllIlIlllIllI - ((class_1965)object).llIllllIlIllIIIlIllIIlIlI) * (double)f3;
        double d6 = ((class_1965)object).lIlllIlllIlIIIIlllIlIlIIl + (((class_1965)object).IllIIIIllIIllIllIlllIlIIl - ((class_1965)object).lIlllIlllIlIIIIlllIlIlIIl) * (double)f3;
        double d7 = (float)(this.llllllIlIllllIlIlIlIIIIlI - this.lIlllIIllIIIIIIlIlIIlIllI) + f3;
        float f20 = (float)(d4 - this.llIIIlIlIlIIlIllIIIllIlIl + d7 * 0.03);
        float f21 = (float)(d5 - this.lIIlIIlIllIlIIlIlIIlIlIlI);
        f2 = (float)(d6 - this.llIIIIIlIIlIIIIllIIIlIIII);
        GL11.glTranslatef((float)(-f20), (float)(-f21), (float)(-f2));
        GL11.glCallList((int)this.IlIIllIlIlIllIIIlIIlIlIIl);
        GL11.glTranslatef((float)f20, (float)f21, (float)f2);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glDisable((int)3042);
        GL11.glEnable((int)2884);
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652, boolean bl) {
        this.llIllllIlIllIIIlIllIIlIlI = class_19652;
        if (class_1379.lllIIIllIIIIlllIlIIllIIll()) {
            return class_1379.lllIIIllIIIIlllIlIIllIIll(this, class_19652, bl);
        }
        if (this.lIlllIlllIIIIlIIlllIllIII.lIlllIlllIIIIlIIlllIllIII() <= 0) {
            return false;
        }
        int n = 0;
        int n2 = Config.lIlIllIIlIIlIIlIIlIIlIIll();
        if (Config.llIIlIllIllllIlIIIIlIIlll() && !this.lllIIIllIIIIlllIlIIllIIll(class_19652)) {
            n2 *= 3;
        }
        int n3 = 4;
        int n4 = 0;
        class_0734 class_07342 = null;
        float f = Float.MAX_VALUE;
        int n5 = -1;
        for (int i = 0; i < this.lIlllIlllIIIIlIIlllIllIII.lIlllIlllIIIIlIIlllIllIII(); ++i) {
            class_0734 class_07343 = (class_0734)this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl(i);
            if (class_07343 == null) continue;
            ++n4;
            if (!class_07343.lIlIlIIlIIIIlIIIIIlllIIII) {
                this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl(i, null);
                continue;
            }
            float f2 = class_07343.lllIIIllIIIIlllIlIIllIIll((class_1521)class_19652);
            if (f2 <= 256.0f && this.IllIIIllIIIIlIlIlIllIIlll()) {
                class_07343.lllIIIllIIIIlllIlIIllIIll(class_19652);
                class_07343.lIlIlIIlIIIIlIIIIIlllIIII = false;
                this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl(i, null);
                ++n;
                continue;
            }
            if (f2 > 256.0f && n >= n2) break;
            if (!class_07343.IlIlllIIIIIIlIIllIIllIlll) {
                f2 *= (float)n3;
            }
            if (class_07342 == null) {
                class_07342 = class_07343;
                f = f2;
                n5 = i;
                continue;
            }
            if (!(f2 < f)) continue;
            class_07342 = class_07343;
            f = f2;
            n5 = i;
        }
        if (class_07342 != null) {
            class_07342.lllIIIllIIIIlllIlIIllIIll(class_19652);
            class_07342.lIlIlIIlIIIIlIIIIIlllIIII = false;
            this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl(n5, null);
            ++n;
            float f3 = f / 5.0f;
            for (int i = 0; i < this.lIlllIlllIIIIlIIlllIllIII.lIlllIlllIIIIlIIlllIllIII() && n < n2; ++i) {
                float f4;
                class_0734 class_07344 = (class_0734)this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl(i);
                if (class_07344 == null) continue;
                float f5 = class_07344.lllIIIllIIIIlllIlIIllIIll((class_1521)class_19652);
                if (!class_07344.IlIlllIIIIIIlIIllIIllIlll) {
                    f5 *= (float)n3;
                }
                if (!((f4 = Math.abs(f5 - f)) < f3)) continue;
                class_07344.lllIIIllIIIIlllIlIIllIIll(class_19652);
                class_07344.lIlIlIIlIIIIlIIIIIlllIIII = false;
                this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl(i, null);
                ++n;
            }
        }
        if (n4 == 0) {
            this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll();
        }
        this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl();
        return true;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0868 class_08682, class_0814 class_08142, float f) {
        this.lllIIIllIIIIlllIlIIllIIll(class_08682, class_08142, f);
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0868 class_08682, class_1965 class_19652, float f) {
        double d = class_19652.lIIIlIIIlIlllIllIIIlIIIlI + (class_19652.IlIIlllllIIlIlIlllllIllll - class_19652.lIIIlIIIlIlllIllIIIlIIIlI) * (double)f;
        double d2 = class_19652.lIIlIlllIllIlIlllIIIIIIII + (class_19652.llIIlIlIlllIIllIlIlllIllI - class_19652.lIIlIlllIllIlIlllIIIIIIII) * (double)f;
        double d3 = class_19652.IIlIllIIlllllIIlIIllllIIl + (class_19652.IllIIIIllIIllIllIlllIlIIl - class_19652.IIlIllIIlllllIIlIIllllIIl) * (double)f;
        if (!this.IllIIlllllllIIlIIlIIIIlIl.isEmpty()) {
            OpenGlHelper.glBlendFunc(774, 768, 1, 0);
            this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(class_1511.lllIIIllIIIIlllIlIIllIIll);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)0.5f);
            GL11.glPushMatrix();
            GL11.glPolygonOffset((float)-3.0f, (float)-3.0f);
            GL11.glEnable((int)32823);
            GL11.glAlphaFunc((int)516, (float)0.1f);
            GL11.glEnable((int)3008);
            class_08682.lllIlIIlIIIlIlIIIllIlllIl();
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(-d, -d2, -d3);
            class_08682.IlIllllllIIlIIllllIIlIIIl();
            Iterator iterator = this.IllIIlllllllIIlIIlIIIIlIl.values().iterator();
            while (iterator.hasNext()) {
                double d4;
                double d5;
                class_2047 class_20472 = (class_2047)iterator.next();
                double d6 = (double)class_20472.lllIIIllIIIIlllIlIIllIIll() - d;
                if (d6 * d6 + (d5 = (double)class_20472.lllIlIIlIIIlIlIIIllIlllIl() - d2) * d5 + (d4 = (double)class_20472.IlIllllllIIlIIllllIIlIIIl() - d3) * d4 > 1024.0) {
                    iterator.remove();
                    continue;
                }
                Block class_05492 = this.lllIlIIlIIIlIlIIIllIlllIl.a_(class_20472.lllIIIllIIIIlllIlIIllIIll(), class_20472.lllIlIIlIIIlIlIIIllIlllIl(), class_20472.IlIllllllIIlIIllllIIlIIIl());
                if (class_05492.lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll) continue;
                this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(class_05492, class_20472.lllIIIllIIIIlllIlIIllIIll(), class_20472.lllIlIIlIIIlIlIIIllIlllIl(), class_20472.IlIllllllIIlIIllllIIlIIIl(), this.llIlIIlllIIIIIllIIlIlIIII[class_20472.lIlllIlllIIIIlIIlllIllIII()]);
            }
            class_08682.lllIIIllIIIIlllIlIIllIIll();
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(0.0, 0.0, 0.0);
            GL11.glDisable((int)3008);
            GL11.glPolygonOffset((float)0.0f, (float)0.0f);
            GL11.glDisable((int)32823);
            GL11.glEnable((int)3008);
            GL11.glDepthMask((boolean)true);
            GL11.glPopMatrix();
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0814 class_08142, class_1112 class_11122, int n, float f) {
        if (n == 0 && class_11122.lllIIIllIIIIlllIlIIllIIll == class_1431.lllIlIIlIIIlIlIIIllIlllIl) {
            GL11.glEnable((int)3042);
            OpenGlHelper.glBlendFunc(770, 771, 1, 0);
            GL11.glColor4f((float)0.0f, (float)0.0f, (float)0.0f, (float)0.4f);
            GL11.glLineWidth((float)2.0f);
            GL11.glDisable((int)3553);
            GL11.glDepthMask((boolean)false);
            float f2 = 0.002f;
            Block class_05492 = this.lllIlIIlIIIlIlIIIllIlllIl.a_(class_11122.lllIlIIlIIIlIlIIIllIlllIl, class_11122.IlIllllllIIlIIllllIIlIIIl, class_11122.lIlllIlllIIIIlIIlllIllIII);
            if (class_05492.lIllllIIlIIIlIllllllIIIll() != class_1855.lllIIIllIIIIlllIlIIllIIll) {
                class_05492.IlIllllllIIlIIllllIIlIIIl((class_1843)this.lllIlIIlIIIlIlIIIllIlllIl, class_11122.lllIlIIlIIIlIlIIIllIlllIl, class_11122.IlIllllllIIlIIllllIIlIIIl, class_11122.lIlllIlllIIIIlIIlllIllIII);
                double d = class_08142.lIIIlIIIlIlllIllIIIlIIIlI + (class_08142.IlIIlllllIIlIlIlllllIllll - class_08142.lIIIlIIIlIlllIllIIIlIIIlI) * (double)f;
                double d2 = class_08142.lIIlIlllIllIlIlllIIIIIIII + (class_08142.llIIlIlIlllIIllIlIlllIllI - class_08142.lIIlIlllIllIlIlllIIIIIIII) * (double)f;
                double d3 = class_08142.IIlIllIIlllllIIlIIllllIIl + (class_08142.IllIIIIllIIllIllIlllIlIIl - class_08142.IIlIllIIlllllIIlIIllllIIl) * (double)f;
                class_1114.lllIIIllIIIIlllIlIIllIIll(class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIlIIlIIIlIlIIIllIlllIl, class_11122.lllIlIIlIIIlIlIIIllIlllIl, class_11122.IlIllllllIIlIIllllIIlIIIl, class_11122.lIlllIlllIIIIlIIlllIllIII).lllIlIIlIIIlIlIIIllIlllIl(f2, f2, f2).IlIllllllIIlIIllllIIlIIIl(-d, -d2, -d3), -1);
            }
            GL11.glDepthMask((boolean)true);
            GL11.glEnable((int)3553);
            GL11.glDisable((int)3042);
        }
    }

    public static void lllIIIllIIIIlllIlIIllIIll(class_1974 class_19742, int n) {
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        class_08682.lllIIIllIIIIlllIlIIllIIll(3);
        if (n != -1) {
            class_08682.IlIllllllIIlIIllllIIlIIIl(n);
        }
        class_08682.lllIIIllIIIIlllIlIIllIIll(class_19742.lllIIIllIIIIlllIlIIllIIll, class_19742.lllIlIIlIIIlIlIIIllIlllIl, class_19742.IlIllllllIIlIIllllIIlIIIl);
        class_08682.lllIIIllIIIIlllIlIIllIIll(class_19742.lIlllIlllIIIIlIIlllIllIII, class_19742.lllIlIIlIIIlIlIIIllIlllIl, class_19742.IlIllllllIIlIIllllIIlIIIl);
        class_08682.lllIIIllIIIIlllIlIIllIIll(class_19742.lIlllIlllIIIIlIIlllIllIII, class_19742.lllIlIIlIIIlIlIIIllIlllIl, class_19742.lIllllIIlIIIlIllllllIIIll);
        class_08682.lllIIIllIIIIlllIlIIllIIll(class_19742.lllIIIllIIIIlllIlIIllIIll, class_19742.lllIlIIlIIIlIlIIIllIlllIl, class_19742.lIllllIIlIIIlIllllllIIIll);
        class_08682.lllIIIllIIIIlllIlIIllIIll(class_19742.lllIIIllIIIIlllIlIIllIIll, class_19742.lllIlIIlIIIlIlIIIllIlllIl, class_19742.IlIllllllIIlIIllllIIlIIIl);
        class_08682.lllIIIllIIIIlllIlIIllIIll();
        class_08682.lllIIIllIIIIlllIlIIllIIll(3);
        if (n != -1) {
            class_08682.IlIllllllIIlIIllllIIlIIIl(n);
        }
        class_08682.lllIIIllIIIIlllIlIIllIIll(class_19742.lllIIIllIIIIlllIlIIllIIll, class_19742.IlIIIIIllllllIIlllIllllll, class_19742.IlIllllllIIlIIllllIIlIIIl);
        class_08682.lllIIIllIIIIlllIlIIllIIll(class_19742.lIlllIlllIIIIlIIlllIllIII, class_19742.IlIIIIIllllllIIlllIllllll, class_19742.IlIllllllIIlIIllllIIlIIIl);
        class_08682.lllIIIllIIIIlllIlIIllIIll(class_19742.lIlllIlllIIIIlIIlllIllIII, class_19742.IlIIIIIllllllIIlllIllllll, class_19742.lIllllIIlIIIlIllllllIIIll);
        class_08682.lllIIIllIIIIlllIlIIllIIll(class_19742.lllIIIllIIIIlllIlIIllIIll, class_19742.IlIIIIIllllllIIlllIllllll, class_19742.lIllllIIlIIIlIllllllIIIll);
        class_08682.lllIIIllIIIIlllIlIIllIIll(class_19742.lllIIIllIIIIlllIlIIllIIll, class_19742.IlIIIIIllllllIIlllIllllll, class_19742.IlIllllllIIlIIllllIIlIIIl);
        class_08682.lllIIIllIIIIlllIlIIllIIll();
        class_08682.lllIIIllIIIIlllIlIIllIIll(1);
        if (n != -1) {
            class_08682.IlIllllllIIlIIllllIIlIIIl(n);
        }
        class_08682.lllIIIllIIIIlllIlIIllIIll(class_19742.lllIIIllIIIIlllIlIIllIIll, class_19742.lllIlIIlIIIlIlIIIllIlllIl, class_19742.IlIllllllIIlIIllllIIlIIIl);
        class_08682.lllIIIllIIIIlllIlIIllIIll(class_19742.lllIIIllIIIIlllIlIIllIIll, class_19742.IlIIIIIllllllIIlllIllllll, class_19742.IlIllllllIIlIIllllIIlIIIl);
        class_08682.lllIIIllIIIIlllIlIIllIIll(class_19742.lIlllIlllIIIIlIIlllIllIII, class_19742.lllIlIIlIIIlIlIIIllIlllIl, class_19742.IlIllllllIIlIIllllIIlIIIl);
        class_08682.lllIIIllIIIIlllIlIIllIIll(class_19742.lIlllIlllIIIIlIIlllIllIII, class_19742.IlIIIIIllllllIIlllIllllll, class_19742.IlIllllllIIlIIllllIIlIIIl);
        class_08682.lllIIIllIIIIlllIlIIllIIll(class_19742.lIlllIlllIIIIlIIlllIllIII, class_19742.lllIlIIlIIIlIlIIIllIlllIl, class_19742.lIllllIIlIIIlIllllllIIIll);
        class_08682.lllIIIllIIIIlllIlIIllIIll(class_19742.lIlllIlllIIIIlIIlllIllIII, class_19742.IlIIIIIllllllIIlllIllllll, class_19742.lIllllIIlIIIlIllllllIIIll);
        class_08682.lllIIIllIIIIlllIlIIllIIll(class_19742.lllIIIllIIIIlllIlIIllIIll, class_19742.lllIlIIlIIIlIlIIIllIlllIl, class_19742.lIllllIIlIIIlIllllllIIIll);
        class_08682.lllIIIllIIIIlllIlIIllIIll(class_19742.lllIIIllIIIIlllIlIIllIIll, class_19742.IlIIIIIllllllIIlllIllllll, class_19742.lIllllIIlIIIlIllllllIIIll);
        class_08682.lllIIIllIIIIlllIlIIllIIll();
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4, int n5, int n6) {
        int n7 = MathHelper.lllIIIllIIIIlllIlIIllIIll(n, 16);
        int n8 = MathHelper.lllIIIllIIIIlllIlIIllIIll(n2, 16);
        int n9 = MathHelper.lllIIIllIIIIlllIlIIllIIll(n3, 16);
        int n10 = MathHelper.lllIIIllIIIIlllIlIIllIIll(n4, 16);
        int n11 = MathHelper.lllIIIllIIIIlllIlIIllIIll(n5, 16);
        int n12 = MathHelper.lllIIIllIIIIlllIlIIllIIll(n6, 16);
        for (int i = n7; i <= n10; ++i) {
            int n13 = i % this.IIIIlIllIlIIlIIlIllIlIlll;
            if (n13 < 0) {
                n13 += this.IIIIlIllIlIIlIIlIllIlIlll;
            }
            for (int j = n8; j <= n11; ++j) {
                int n14 = j % this.IlIlIIlllIllllllllIIIlIlI;
                if (n14 < 0) {
                    n14 += this.IlIlIIlllIllllllllIIIlIlI;
                }
                for (int k = n9; k <= n12; ++k) {
                    int n15;
                    class_0734 class_07342;
                    int n16 = k % this.llllIIIIlIIIlIIIIIIlIllll;
                    if (n16 < 0) {
                        n16 += this.llllIIIIlIIIlIIIIIIlIllll;
                    }
                    if ((class_07342 = this.llIIIlllIlllIlIllIIIIllIl[n15 = (n16 * this.IlIlIIlllIllllllllIIIlIlI + n14) * this.IIIIlIllIlIIlIIlIllIlIlll + n13]) == null || class_07342.lIlIlIIlIIIIlIIIIIlllIIII) continue;
                    this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(class_07342);
                    class_07342.lIllllIIlIIIlIllllllIIIll();
                }
            }
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        this.lllIIIllIIIIlllIlIIllIIll(n - 1, n2 - 1, n3 - 1, n + 1, n2 + 1, n3 + 1);
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, int n3) {
        this.lllIIIllIIIIlllIlIIllIIll(n - 1, n2 - 1, n3 - 1, n + 1, n2 + 1, n3 + 1);
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, int n3, int n4, int n5, int n6) {
        this.lllIIIllIIIIlllIlIIllIIll(n - 1, n2 - 1, n3 - 1, n4 + 1, n5 + 1, n6 + 1);
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1821 class_18212, float f) {
        boolean bl = !Config.lllllIlllIIllIlIIlIIIllII();
        double d = this.lIIIllIIIIIllllIlIlIllIll * 16 * this.lIIIllIIIIIllllIlIlIllIll * 16;
        for (int i = 0; i < this.lIlIlIIllIIIlllIllIIlIllI; ++i) {
            class_0734 class_07342 = this.IIlIIlIlIlIllIIlIlIIIIlll[i];
            if (class_07342.IlIIIIIllllllIIlllIllllll()) continue;
            if (bl && class_07342.lIlIIllllIlIIIIllIIIIlIIl > d) {
                class_07342.IlIlllIIIIIIlIIllIIllIlll = false;
                continue;
            }
            class_07342.lllIIIllIIIIlllIlIIllIIll(class_18212);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(String string, int n, int n2, int n3) {
        class_2208 class_22082 = new class_2208(n, n2, n3);
        class_0308 class_03082 = (class_0308)this.lllIIIIlIlIIlIIlllIIIIIIl.get(class_22082);
        if (class_03082 != null) {
            this.lIllllIIlIIIlIllllllIIIll.IllIIIlllllIlIlllIlllllII().lllIlIIlIIIlIlIIIllIlllIl(class_03082);
            this.lllIIIIlIlIIlIIlllIIIIIIl.remove(class_22082);
        }
        if (string != null) {
            ResourceLocation class_17732;
            class_0306 class_03062 = class_0306.lIlllIlllIIIIlIIlllIllIII(string);
            if (class_03062 != null) {
                this.lIllllIIlIIIlIllllllIIIll.IlIIIlIIIIllIIIllIIIIIIll.lllIIIllIIIIlllIlIIllIIll(class_03062.IlIIIlIIIIllIIIllIIIIIIll());
            }
            if ((class_17732 = null) == null) {
                class_17732 = new ResourceLocation(string);
            }
            class_0132 class_01322 = class_0132.lllIIIllIIIIlllIlIIllIIll(class_17732, n, n2, n3);
            this.lllIIIIlIlIIlIIlllIIIIIIl.put(class_22082, class_01322);
            this.lIllllIIlIIIlIllllllIIIll.IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_01322);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(String string, double d, double d2, double d3, float f, float f2) {
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0814 class_08142, String string, double d, double d2, double d3, float f, float f2) {
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(String string, double d, double d2, double d3, double d4, double d5, double d6) {
        try {
            this.lllIlIIlIIIlIlIIIllIlllIl(string, d, d2, d3, d4, d5, d6);
        }
        catch (Throwable throwable) {
            CrashReport class_02232 = CrashReport.lllIIIllIIIIlllIlIIllIIll(throwable, "Exception while adding particle");
            class_0799 class_07992 = class_02232.lllIIIllIIIIlllIlIIllIIll("Particle being added");
            class_07992.lllIIIllIIIIlllIlIIllIIll("Name", string);
            class_07992.addCrashSectionCallable("Position", new class_1066(this));
            throw new class_0892(class_02232);
        }
    }

    public class_0323 lllIlIIlIIIlIlIIIllIlllIl(String string, double d, double d2, double d3, double d4, double d5, double d6) {
        if (this.lIllllIIlIIIlIllllllIIIll != null && this.lIllllIIlIIIlIllllllIIIll.llIIlllIllIllllIIIlIIIIII != null && this.lIllllIIlIIIlIllllllIIIll.lllIIlIIIllllllIIIIlIlIlI != null) {
            int n = this.lIllllIIlIIIlIllllllIIIll.gameSettings.IllIlIIllIIllIlIIlIllIlIl;
            if (n == 1 && this.lllIlIIlIIIlIlIIIllIlllIl.lllllIlllIIllIlIIlIIIllII.nextInt(3) == 0) {
                n = 2;
            }
            double d7 = this.lIllllIIlIIIlIllllllIIIll.llIIlllIllIllllIIIlIIIIII.IlIIlllllIIlIlIlllllIllll - d;
            double d8 = this.lIllllIIlIIIlIllllllIIIll.llIIlllIllIllllIIIlIIIIII.llIIlIlIlllIIllIlIlllIllI - d2;
            double d9 = this.lIllllIIlIIIlIllllllIIIll.llIIlllIllIllllIIIlIIIIII.IllIIIIllIIllIllIlllIlIIl - d3;
            class_0323 class_03232 = null;
            if (string.equals("hugeexplosion")) {
                if (Config.IIIIlIIlIIIllIIIIllIIIlII()) {
                    class_03232 = new class_0043(this.lllIlIIlIIIlIlIIIllIlllIl, d, d2, d3, d4, d5, d6);
                    this.lIllllIIlIIIlIllllllIIIll.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(class_03232);
                }
            } else if (string.equals("largeexplode")) {
                if (Config.IIIIlIIlIIIllIIIIllIIIlII()) {
                    class_03232 = new class_1761(this.IlIllllllIIlIIllllIIlIIIl, this.lllIlIIlIIIlIlIIIllIlllIl, d, d2, d3, d4, d5, d6);
                    this.lIllllIIlIIIlIllllllIIIll.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(class_03232);
                }
            } else if (string.equals("fireworksSpark")) {
                class_03232 = new class_1892(this.lllIlIIlIIIlIlIIIllIlllIl, d, d2, d3, d4, d5, d6, this.lIllllIIlIIIlIllllllIIIll.lllIIlIIIllllllIIIIlIlIlI);
                this.lIllllIIlIIIlIllllllIIIll.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(class_03232);
            }
            if (class_03232 != null) {
                return class_03232;
            }
            double d10 = 16.0;
            double d11 = 16.0;
            if (string.equals("crit")) {
                d10 = 196.0;
            }
            if (d7 * d7 + d8 * d8 + d9 * d9 > d10 * d10) {
                return null;
            }
            if (n > 1) {
                return null;
            }
            if (string.equals("bubble")) {
                class_03232 = new class_0727(this.lllIlIIlIIIlIlIIIllIlllIl, d, d2, d3, d4, d5, d6);
                class_1689.lllIIIllIIIIlllIlIIllIIll(class_03232, this.lllIlIIlIIIlIlIIIllIlllIl);
            } else if (string.equals("suspended")) {
                if (Config.IllllIIIIlIIlIIIIlllIIIIl()) {
                    class_03232 = new class_2030(this.lllIlIIlIIIlIlIIIllIlllIl, d, d2, d3, d4, d5, d6);
                }
            } else if (string.equals("depthsuspend")) {
                if (Config.lIlIlIIIIIIlIIllllIlIIllI()) {
                    class_03232 = new class_0345(this.lllIlIIlIIIlIlIIIllIlllIl, d, d2, d3, d4, d5, d6);
                }
            } else if (string.equals("townaura")) {
                class_03232 = new class_0345(this.lllIlIIlIIIlIlIIIllIlllIl, d, d2, d3, d4, d5, d6);
                class_1689.lllIlIIlIIIlIlIIIllIlllIl(class_03232);
            } else if (string.equals("crit")) {
                class_03232 = new class_1639(this.lllIlIIlIIIlIlIIIllIlllIl, d, d2, d3, d4, d5, d6);
            } else if (string.equals("magicCrit")) {
                class_03232 = new class_1639(this.lllIlIIlIIIlIlIIIllIlllIl, d, d2, d3, d4, d5, d6);
                class_03232.lllIlIIlIIIlIlIIIllIlllIl(class_03232.lIlllIlllIIIIlIIlllIllIII() * 0.3f, class_03232.IlIIIIIllllllIIlllIllllll() * 0.8f, class_03232.lIllllIIlIIIlIllllllIIIll());
                class_03232.IllIIlllllllIIlIIlIIIIlIl();
            } else if (string.equals("smoke")) {
                if (Config.llIIlIIllIIllIlIIllIIllII()) {
                    class_03232 = new class_2185(this.lllIlIIlIIIlIlIIIllIlllIl, d, d2, d3, d4, d5, d6);
                }
            } else if (string.equals("mobSpell")) {
                if (Config.lllIIIIlIlIIlIIlllIIIIIIl()) {
                    class_03232 = new class_1872(this.lllIlIIlIIIlIlIIIllIlllIl, d, d2, d3, 0.0, 0.0, 0.0);
                    class_03232.lllIlIIlIIIlIlIIIllIlllIl((float)d4, (float)d5, (float)d6);
                }
            } else if (string.equals("mobSpellAmbient")) {
                if (Config.lllIIIIlIlIIlIIlllIIIIIIl()) {
                    class_03232 = new class_1872(this.lllIlIIlIIIlIlIIIllIlllIl, d, d2, d3, 0.0, 0.0, 0.0);
                    class_03232.IlIIIIIllllllIIlllIllllll(0.15f);
                    class_03232.lllIlIIlIIIlIlIIIllIlllIl((float)d4, (float)d5, (float)d6);
                }
            } else if (string.equals("spell")) {
                if (Config.lllIIIIlIlIIlIIlllIIIIIIl()) {
                    class_03232 = new class_1872(this.lllIlIIlIIIlIlIIIllIlllIl, d, d2, d3, d4, d5, d6);
                }
            } else if (string.equals("instantSpell")) {
                if (Config.lllIIIIlIlIIlIIlllIIIIIIl()) {
                    class_03232 = new class_1872(this.lllIlIIlIIIlIlIIIllIlllIl, d, d2, d3, d4, d5, d6);
                    ((class_1872)class_03232).lllIIIllIIIIlllIlIIllIIll(144);
                }
            } else if (string.equals("witchMagic")) {
                if (Config.lllIIIIlIlIIlIIlllIIIIIIl()) {
                    class_03232 = new class_1872(this.lllIlIIlIIIlIlIIIllIlllIl, d, d2, d3, d4, d5, d6);
                    ((class_1872)class_03232).lllIIIllIIIIlllIlIIllIIll(144);
                    float f = this.lllIlIIlIIIlIlIIIllIlllIl.lllllIlllIIllIlIIlIIIllII.nextFloat() * 0.5f + 0.35f;
                    class_03232.lllIlIIlIIIlIlIIIllIlllIl(1.0f * f, 0.0f * f, 1.0f * f);
                }
            } else if (string.equals("note")) {
                class_03232 = new class_1426(this.lllIlIIlIIIlIlIIIllIlllIl, d, d2, d3, d4, d5, d6);
            } else if (string.equals("portal")) {
                if (Config.IIIIlIlIIlIIIIlIlllIlIIII()) {
                    class_03232 = new class_2196(this.lllIlIIlIIIlIlIIIllIlllIl, d, d2, d3, d4, d5, d6);
                    class_1689.lllIIIllIIIIlllIlIIllIIll(class_03232);
                }
            } else if (string.equals("enchantmenttable")) {
                class_03232 = new class_2056(this.lllIlIIlIIIlIlIIIllIlllIl, d, d2, d3, d4, d5, d6);
            } else if (string.equals("explode")) {
                if (Config.IIIIlIIlIIIllIIIIllIIIlII()) {
                    class_03232 = new class_0972(this.lllIlIIlIIIlIlIIIllIlllIl, d, d2, d3, d4, d5, d6);
                }
            } else if (string.equals("flame")) {
                if (Config.lllIIIIIIlIlllIIlIlIIIllI()) {
                    class_03232 = new class_2036(this.lllIlIIlIIIlIlIIIllIlllIl, d, d2, d3, d4, d5, d6);
                }
            } else if (string.equals("lava")) {
                class_03232 = new class_1985(this.lllIlIIlIIIlIlIIIllIlllIl, d, d2, d3);
            } else if (string.equals("footstep")) {
                class_03232 = new class_0160(this.IlIllllllIIlIIllllIIlIIIl, this.lllIlIIlIIIlIlIIIllIlllIl, d, d2, d3);
            } else if (string.equals("splash")) {
                class_03232 = new class_2123(this.lllIlIIlIIIlIlIIIllIlllIl, d, d2, d3, d4, d5, d6);
                class_1689.lllIIIllIIIIlllIlIIllIIll(class_03232, this.lllIlIIlIIIlIlIIIllIlllIl);
            } else if (string.equals("wake")) {
                class_03232 = new class_1762(this.lllIlIIlIIIlIlIIIllIlllIl, d, d2, d3, d4, d5, d6);
            } else if (string.equals("largesmoke")) {
                if (Config.llIIlIIllIIllIlIIllIIllII()) {
                    class_03232 = new class_2185(this.lllIlIIlIIIlIlIIIllIlllIl, d, d2, d3, d4, d5, d6, 2.5f);
                }
            } else if (string.equals("cloud")) {
                class_03232 = new class_1425(this.lllIlIIlIIIlIlIIIllIlllIl, d, d2, d3, d4, d5, d6);
            } else if (string.equals("reddust")) {
                if (Config.llIlllIIllIlllIlIlIlIIIll()) {
                    class_03232 = new class_0464((class_1334)this.lllIlIIlIIIlIlIIIllIlllIl, d, d2, d3, (float)d4, (float)d5, (float)d6);
                    class_1689.lllIIIllIIIIlllIlIIllIIll(class_03232, (class_1843)this.lllIlIIlIIIlIlIIIllIlllIl, d7, d8, d9);
                }
            } else if (string.equals("snowballpoof")) {
                class_03232 = new class_2265(this.lllIlIIlIIIlIlIIIllIlllIl, d, d2, d3, Items.snowball);
            } else if (string.equals("dripWater")) {
                if (Config.IlIIIIIllIlllIIIIlIIIllIl()) {
                    class_03232 = new class_1111(this.lllIlIIlIIIlIlIIIllIlllIl, d, d2, d3, class_1855.IllIIlllllllIIlIIlIIIIlIl);
                }
            } else if (string.equals("dripLava")) {
                if (Config.IlIIIIIllIlllIIIIlIIIllIl()) {
                    class_03232 = new class_1111(this.lllIlIIlIIIlIlIIIllIlllIl, d, d2, d3, class_1855.IIIllIllIIlIlIlIlIllllIIl);
                }
            } else if (string.equals("snowshovel")) {
                class_03232 = new class_1372(this.lllIlIIlIIIlIlIIIllIlllIl, d, d2, d3, d4, d5, d6);
            } else if (string.equals("slime")) {
                class_03232 = new class_2265(this.lllIlIIlIIIlIlIIIllIlllIl, d, d2, d3, Items.lIIlllIIlIlIlIIIlIlllIIll);
            } else if (string.equals("heart")) {
                class_03232 = new class_1606(this.lllIlIIlIIIlIlIIIllIlllIl, d, d2, d3, d4, d5, d6);
            } else if (string.equals("angryVillager")) {
                class_03232 = new class_1606(this.lllIlIIlIIIlIlIIIllIlllIl, d, d2 + 0.5, d3, d4, d5, d6);
                class_03232.lllIlIIlIIIlIlIIIllIlllIl(81);
                class_03232.lllIlIIlIIIlIlIIIllIlllIl(1.0f, 1.0f, 1.0f);
            } else if (string.equals("happyVillager")) {
                class_03232 = new class_0345(this.lllIlIIlIIIlIlIIIllIlllIl, d, d2, d3, d4, d5, d6);
                class_03232.lllIlIIlIIIlIlIIIllIlllIl(82);
                class_03232.lllIlIIlIIIlIlIIIllIlllIl(1.0f, 1.0f, 1.0f);
            } else if (string.startsWith("iconcrack_")) {
                String[] arrstring = string.split("_", 3);
                int n2 = Integer.parseInt(arrstring[1]);
                if (arrstring.length > 2) {
                    int n3 = Integer.parseInt(arrstring[2]);
                    class_03232 = new class_2265(this.lllIlIIlIIIlIlIIIllIlllIl, d, d2, d3, d4, d5, d6, Item.lllIIIllIIIIlllIlIIllIIll(n2), n3);
                } else {
                    class_03232 = new class_2265(this.lllIlIIlIIIlIlIIIllIlllIl, d, d2, d3, d4, d5, d6, Item.lllIIIllIIIIlllIlIIllIIll(n2), 0);
                }
            } else if (string.startsWith("blockcrack_")) {
                String[] arrstring = string.split("_", 3);
                Block class_05492 = Block.lllIIIllIIIIlllIlIIllIIll(Integer.parseInt(arrstring[1]));
                int n4 = Integer.parseInt(arrstring[2]);
                class_03232 = new class_1331(this.lllIlIIlIIIlIlIIIllIlllIl, d, d2, d3, d4, d5, d6, class_05492, n4).lllIIIllIIIIlllIlIIllIIll(n4);
            } else if (string.startsWith("blockdust_")) {
                String[] arrstring = string.split("_", 3);
                Block class_05493 = Block.lllIIIllIIIIlllIlIIllIIll(Integer.parseInt(arrstring[1]));
                int n5 = Integer.parseInt(arrstring[2]);
                class_03232 = new class_0613(this.lllIlIIlIIIlIlIIIllIlllIl, d, d2, d3, d4, d5, d6, class_05493, n5).lllIIIllIIIIlllIlIIllIIll(n5);
            }
            if (class_03232 != null) {
                this.lIllllIIlIIIlIllllllIIIll.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(class_03232);
            }
            return class_03232;
        }
        return null;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212) {
        class_1630.lllIIIllIIIIlllIlIIllIIll(class_15212, (class_1334)this.lllIlIIlIIIlIlIIIllIlllIl);
        if (Config.lllIlIIllllIllIIIlIlIIIll()) {
            class_1825.lllIIIllIIIIlllIlIIllIIll(class_15212, this);
        }
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_1521 class_15212) {
        if (Config.lllIlIIllllIllIIIlIlIIIll()) {
            class_1825.lllIlIIlIIIlIlIIIllIlllIl(class_15212, this);
        }
    }

    public void IIIllIIlIIIIIIlIlIIllIIlI() {
        class_0994.lllIlIIlIIIlIlIIIllIlllIl(this.IlIIIIIllllllIIlllIllllll);
        this.llIIlIllIllllIlIIIIlIIlll.lllIlIIlIIIlIlIIIllIlllIl();
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4, int n5) {
        Random random = this.lllIlIIlIIIlIlIIIllIlllIl.lllllIlllIIllIlIIlIIIllII;
        switch (n) {
            case 1013: 
            case 1018: {
                if (this.lIllllIIlIIIlIllllllIIIll.llIIlllIllIllllIIIlIIIIII == null) break;
                double d = (double)n2 - this.lIllllIIlIIIlIllllllIIIll.llIIlllIllIllllIIIlIIIIII.IlIIlllllIIlIlIlllllIllll;
                double d2 = (double)n3 - this.lIllllIIlIIIlIllllllIIIll.llIIlllIllIllllIIIlIIIIII.llIIlIlIlllIIllIlIlllIllI;
                double d3 = (double)n4 - this.lIllllIIlIIIlIllllllIIIll.llIIlllIllIllllIIIlIIIIII.IllIIIIllIIllIllIlllIlIIl;
                double d4 = Math.sqrt(d * d + d2 * d2 + d3 * d3);
                double d5 = this.lIllllIIlIIIlIllllllIIIll.llIIlllIllIllllIIIlIIIIII.IlIIlllllIIlIlIlllllIllll;
                double d6 = this.lIllllIIlIIIlIllllllIIIll.llIIlllIllIllllIIIlIIIIII.llIIlIlIlllIIllIlIlllIllI;
                double d7 = this.lIllllIIlIIIlIllllllIIIll.llIIlllIllIllllIIIlIIIIII.IllIIIIllIIllIllIlllIlIIl;
                if (d4 > 0.0) {
                    d5 += d / d4 * 2.0;
                    d6 += d2 / d4 * 2.0;
                    d7 += d3 / d4 * 2.0;
                }
                if (n == 1013) {
                    this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(d5, d6, d7, "mob.wither.spawn", 1.0f, 1.0f, false);
                    break;
                }
                if (n != 1018) break;
                this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(d5, d6, d7, "mob.enderdragon.end", 5.0f, 1.0f, false);
            }
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0814 class_08142, int n, int n2, int n3, int n4, int n5) {
        Random random = this.lllIlIIlIIIlIlIIIllIlllIl.lllllIlllIIllIlIIlIIIllII;
        Block class_05492 = null;
        switch (n) {
            case 1000: {
                this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll((double)n2, (double)n3, (double)n4, "random.click", 1.0f, 1.0f, false);
                break;
            }
            case 1001: {
                this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll((double)n2, (double)n3, (double)n4, "random.click", 1.0f, 1.2f, false);
                break;
            }
            case 1002: {
                this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll((double)n2, (double)n3, (double)n4, "random.bow", 1.0f, 1.2f, false);
                break;
            }
            case 1003: {
                if (Math.random() < 0.5) {
                    this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll((double)n2 + 0.5, (double)n3 + 0.5, (double)n4 + 0.5, "random.door_open", 1.0f, this.lllIlIIlIIIlIlIIIllIlllIl.lllllIlllIIllIlIIlIIIllII.nextFloat() * 0.1f + 0.9f, false);
                    break;
                }
                this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll((double)n2 + 0.5, (double)n3 + 0.5, (double)n4 + 0.5, "random.door_close", 1.0f, this.lllIlIIlIIIlIlIIIllIlllIl.lllllIlllIIllIlIIlIIIllII.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 1004: {
                this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll((double)((float)n2 + 0.5f), (double)((float)n3 + 0.5f), (double)((float)n4 + 0.5f), "random.fizz", 0.5f, 2.6f + (random.nextFloat() - random.nextFloat()) * 0.8f, false);
                break;
            }
            case 1005: {
                if (Item.lllIIIllIIIIlllIlIIllIIll(n5) instanceof class_0306) {
                    this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll("records." + ((class_0306) Item.lllIIIllIIIIlllIlIIllIIll((int)n5)).IIIllIllIIlIlIlIlIllllIIl, n2, n3, n4);
                    break;
                }
                this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll((String)null, n2, n3, n4);
                break;
            }
            case 1007: {
                this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll((double)n2 + 0.5, (double)n3 + 0.5, (double)n4 + 0.5, "mob.ghast.charge", 10.0f, (random.nextFloat() - random.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1008: {
                this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll((double)n2 + 0.5, (double)n3 + 0.5, (double)n4 + 0.5, "mob.ghast.fireball", 10.0f, (random.nextFloat() - random.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1009: {
                this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll((double)n2 + 0.5, (double)n3 + 0.5, (double)n4 + 0.5, "mob.ghast.fireball", 2.0f, (random.nextFloat() - random.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1010: {
                this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll((double)n2 + 0.5, (double)n3 + 0.5, (double)n4 + 0.5, "mob.zombie.wood", 2.0f, (random.nextFloat() - random.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1011: {
                this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll((double)n2 + 0.5, (double)n3 + 0.5, (double)n4 + 0.5, "mob.zombie.metal", 2.0f, (random.nextFloat() - random.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1012: {
                this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll((double)n2 + 0.5, (double)n3 + 0.5, (double)n4 + 0.5, "mob.zombie.woodbreak", 2.0f, (random.nextFloat() - random.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1014: {
                this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll((double)n2 + 0.5, (double)n3 + 0.5, (double)n4 + 0.5, "mob.wither.shoot", 2.0f, (random.nextFloat() - random.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1015: {
                this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll((double)n2 + 0.5, (double)n3 + 0.5, (double)n4 + 0.5, "mob.bat.takeoff", 0.05f, (random.nextFloat() - random.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1016: {
                this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll((double)n2 + 0.5, (double)n3 + 0.5, (double)n4 + 0.5, "mob.zombie.infect", 2.0f, (random.nextFloat() - random.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1017: {
                this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll((double)n2 + 0.5, (double)n3 + 0.5, (double)n4 + 0.5, "mob.zombie.unfect", 2.0f, (random.nextFloat() - random.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1020: {
                this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll((double)((float)n2 + 0.5f), (double)((float)n3 + 0.5f), (double)((float)n4 + 0.5f), "random.anvil_break", 1.0f, this.lllIlIIlIIIlIlIIIllIlllIl.lllllIlllIIllIlIIlIIIllII.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 1021: {
                this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll((double)((float)n2 + 0.5f), (double)((float)n3 + 0.5f), (double)((float)n4 + 0.5f), "random.anvil_use", 1.0f, this.lllIlIIlIIIlIlIIIllIlllIl.lllllIlllIIllIlIIlIIIllII.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 1022: {
                this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll((double)((float)n2 + 0.5f), (double)((float)n3 + 0.5f), (double)((float)n4 + 0.5f), "random.anvil_land", 0.3f, this.lllIlIIlIIIlIlIIIllIlllIl.lllllIlllIIllIlIIlIIIllII.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 2000: {
                int n6 = n5 % 3 - 1;
                int n7 = n5 / 3 % 3 - 1;
                double d = (double)n2 + (double)n6 * 0.6 + 0.5;
                double d2 = (double)n3 + 0.5;
                double d3 = (double)n4 + (double)n7 * 0.6 + 0.5;
                for (int i = 0; i < 10; ++i) {
                    double d4 = random.nextDouble() * 0.2 + 0.01;
                    double d5 = d + (double)n6 * 0.01 + (random.nextDouble() - 0.5) * (double)n7 * 0.5;
                    double d6 = d2 + (random.nextDouble() - 0.5) * 0.5;
                    double d7 = d3 + (double)n7 * 0.01 + (random.nextDouble() - 0.5) * (double)n6 * 0.5;
                    double d8 = (double)n6 * d4 + random.nextGaussian() * 0.01;
                    double d9 = -0.03 + random.nextGaussian() * 0.01;
                    double d10 = (double)n7 * d4 + random.nextGaussian() * 0.01;
                    this.lllIIIllIIIIlllIlIIllIIll("smoke", d5, d6, d7, d8, d9, d10);
                }
                return;
            }
            case 2001: {
                class_05492 = Block.lllIIIllIIIIlllIlIIllIIll(n5 & 0xFFF);
                if (class_05492.lIllllIIlIIIlIllllllIIIll() != class_1855.lllIIIllIIIIlllIlIIllIIll) {
                    this.lIllllIIlIIIlIllllllIIIll.IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(new class_0132(new ResourceLocation(class_05492.llIIIlllIlllIlIllIIIIllIl.lllIIIllIIIIlllIlIIllIIll()), (class_05492.llIIIlllIlllIlIllIIIIllIl.IlIllllllIIlIIllllIIlIIIl() + 1.0f) / 2.0f, class_05492.llIIIlllIlllIlIllIIIIllIl.lIlllIlllIIIIlIIlllIllIII() * 0.8f, (float)n2 + 0.5f, (float)n3 + 0.5f, (float)n4 + 0.5f));
                }
                this.lIllllIIlIIIlIllllllIIIll.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(n2, n3, n4, class_05492, n5 >> 12 & 0xFF);
                break;
            }
            case 2002: {
                int n8;
                double d = n2;
                double d11 = n3;
                double d12 = n4;
                String string = "iconcrack_" + Item.lllIIIllIIIIlllIlIIllIIll(Items.potionitem) + "_" + n5;
                for (n8 = 0; n8 < 8; ++n8) {
                    this.lllIIIllIIIIlllIlIIllIIll(string, d, d11, d12, random.nextGaussian() * 0.15, random.nextDouble() * 0.2, random.nextGaussian() * 0.15);
                }
                n8 = Items.potionitem.IllIIlllllllIIlIIlIIIIlIl(n5);
                float f = (float)(n8 >> 16 & 0xFF) / 255.0f;
                float f2 = (float)(n8 >> 8 & 0xFF) / 255.0f;
                float f3 = (float)(n8 >> 0 & 0xFF) / 255.0f;
                String string2 = "spell";
                if (Items.potionitem.IIIllIllIIlIlIlIlIllllIIl(n5)) {
                    string2 = "instantSpell";
                }
                for (int i = 0; i < 100; ++i) {
                    double d13 = random.nextDouble() * 4.0;
                    double d14 = random.nextDouble() * Math.PI * 2.0;
                    double d15 = Math.cos(d14) * d13;
                    double d16 = 0.01 + random.nextDouble() * 0.5;
                    double d17 = Math.sin(d14) * d13;
                    class_0323 class_03232 = this.lllIlIIlIIIlIlIIIllIlllIl(string2, d + d15 * 0.1, d11 + 0.3, d12 + d17 * 0.1, d15, d16, d17);
                    if (class_03232 == null) continue;
                    float f4 = 0.75f + random.nextFloat() * 0.25f;
                    class_03232.lllIlIIlIIIlIlIIIllIlllIl(f * f4, f2 * f4, f3 * f4);
                    class_03232.IlIllllllIIlIIllllIIlIIIl((float)d13);
                }
                this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll((double)n2 + 0.5, (double)n3 + 0.5, (double)n4 + 0.5, "game.potion.smash", 1.0f, this.lllIlIIlIIIlIlIIIllIlllIl.lllllIlllIIllIlIIlIIIllII.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 2003: {
                double d = (double)n2 + 0.5;
                double d18 = n3;
                double d19 = (double)n4 + 0.5;
                String string = "iconcrack_" + Item.lllIIIllIIIIlllIlIIllIIll(Items.ender_eye);
                for (int i = 0; i < 8; ++i) {
                    this.lllIIIllIIIIlllIlIIllIIll(string, d, d18, d19, random.nextGaussian() * 0.15, random.nextDouble() * 0.2, random.nextGaussian() * 0.15);
                }
                for (double d20 = 0.0; d20 < Math.PI * 2; d20 += 0.15707963267948966) {
                    this.lllIIIllIIIIlllIlIIllIIll("portal", d + Math.cos(d20) * 5.0, d18 - 0.4, d19 + Math.sin(d20) * 5.0, Math.cos(d20) * -5.0, 0.0, Math.sin(d20) * -5.0);
                    this.lllIIIllIIIIlllIlIIllIIll("portal", d + Math.cos(d20) * 5.0, d18 - 0.4, d19 + Math.sin(d20) * 5.0, Math.cos(d20) * -7.0, 0.0, Math.sin(d20) * -7.0);
                }
                return;
            }
            case 2004: {
                for (int i = 0; i < 20; ++i) {
                    double d = (double)n2 + 0.5 + ((double)this.lllIlIIlIIIlIlIIIllIlllIl.lllllIlllIIllIlIIlIIIllII.nextFloat() - 0.5) * 2.0;
                    double d21 = (double)n3 + 0.5 + ((double)this.lllIlIIlIIIlIlIIIllIlllIl.lllllIlllIIllIlIIlIIIllII.nextFloat() - 0.5) * 2.0;
                    double d22 = (double)n4 + 0.5 + ((double)this.lllIlIIlIIIlIlIIIllIlllIl.lllllIlllIIllIlIIlIIIllII.nextFloat() - 0.5) * 2.0;
                    this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll("smoke", d, d21, d22, 0.0, 0.0, 0.0);
                    this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll("flame", d, d21, d22, 0.0, 0.0, 0.0);
                }
                return;
            }
            case 2005: {
                class_1908.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl, n2, n3, n4, n5);
                break;
            }
            case 2006: {
                class_05492 = this.lllIlIIlIIIlIlIIIllIlllIl.a_(n2, n3, n4);
                if (class_05492.lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll) break;
                double d = Math.min(0.2f + (float)n5 / 15.0f, 10.0f);
                if (d > 2.5) {
                    d = 2.5;
                }
                int n9 = (int)(150.0 * d);
                for (int i = 0; i < n9; ++i) {
                    float f = MathHelper.lllIIIllIIIIlllIlIIllIIll(random, 0.0f, (float)Math.PI * 2);
                    double d23 = MathHelper.lllIIIllIIIIlllIlIIllIIll(random, 0.75f, 1.0f);
                    double d24 = (double)0.2f + d / 100.0;
                    double d25 = (double)(MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f) * 0.2f) * d23 * d23 * (d + 0.2);
                    double d26 = (double)(MathHelper.lllIIIllIIIIlllIlIIllIIll(f) * 0.2f) * d23 * d23 * (d + 0.2);
                    this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll("blockdust_" + Block.lllIIIllIIIIlllIlIIllIIll(class_05492) + "_" + this.lllIlIIlIIIlIlIIIllIlllIl.IlIllllllIIlIIllllIIlIIIl(n2, n3, n4), (double)((float)n2 + 0.5f), (double)((float)n3 + 1.0f), (double)((float)n4 + 0.5f), d25, d24, d26);
                }
                break;
            }
        }
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, int n3, int n4, int n5) {
        if (n5 >= 0 && n5 < 10) {
            class_2047 class_20472 = (class_2047)this.IllIIlllllllIIlIIlIIIIlIl.get(n);
            if (class_20472 == null || class_20472.lllIIIllIIIIlllIlIIllIIll() != n2 || class_20472.lllIlIIlIIIlIlIIIllIlllIl() != n3 || class_20472.IlIllllllIIlIIllllIIlIIIl() != n4) {
                class_20472 = new class_2047(n, n2, n3, n4);
                this.IllIIlllllllIIlIIlIIIIlIl.put(n, class_20472);
            }
            class_20472.lllIIIllIIIIlllIlIIllIIll(n5);
            class_20472.lllIlIIlIIIlIlIIIllIlllIl(this.llllllIlIllllIlIlIlIIIIlI);
        } else {
            this.IllIIlllllllIIlIIlIIIIlIl.remove(n);
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
        this.llIlIIlllIIIIIllIIlIlIIII = new class_2102[10];
        for (int i = 0; i < this.llIlIIlllIIIIIllIIlIlIIII.length; ++i) {
            this.llIlIIlllIIIIIllIIlIlIIII[i] = class_08872.lllIIIllIIIIlllIlIIllIIll("destroy_stage_" + i);
        }
    }

    public void IllIIlllllllIIlIIlIIIIlIl() {
        if (this.llIIIlllIlllIlIllIIIIllIl != null) {
            for (int i = 0; i < this.llIIIlllIlllIlIllIIIIllIl.length; ++i) {
                this.llIIIlllIlllIlIllIIIIllIl[i].lIlIllIIlIIlIIlIIlIIlIIll = true;
            }
        }
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652) {
        boolean bl = this.lllIlIIlIIIlIlIIIllIlllIl(class_19652);
        if (bl) {
            this.lIlIllIIllIIIIlllIlIlllIl = System.currentTimeMillis();
            return true;
        }
        return System.currentTimeMillis() - this.lIlIllIIllIIIIlllIlIlllIl < 2000L;
    }

    private boolean lllIlIIlIIIlIlIIIllIlllIl(class_1965 class_19652) {
        double d = 0.001;
        return class_19652.IIlIIlIlIlIllIIlIlIIIIlll() ? true : ((double)class_19652.lllllllIlIIlIlIIIlIlIIlll > d ? true : (this.lIllllIIlIIIlIllllllIIIll.llIllllIlIllIIIlIllIIlIlI.lllIIIllIIIIlllIlIIllIIll != 0 ? true : (this.lIllllIIlIIIlIllllllIIIll.llIllllIlIllIIIlIllIIlIlI.lllIlIIlIIIlIlIIIllIlllIl != 0 ? true : (Math.abs(class_19652.IlIIlllllIIlIlIlllllIllll - class_19652.llIIlIllIllllIlIIIIlIIlll) > d ? true : (Math.abs(class_19652.llIIlIlIlllIIllIlIlllIllI - class_19652.llIllllIlIllIIIlIllIIlIlI) > d ? true : Math.abs(class_19652.IllIIIIllIIllIllIlllIlIIl - class_19652.lIlllIlllIlIIIIlllIlIlIIl) > d)))));
    }

    public boolean IIIllIllIIlIlIlIlIllllIIl() {
        boolean bl = this.IllIIIllIIIIlIlIlIllIIlll();
        if (bl) {
            this.IlIIIlIIlllllIIIllIlIlIll = System.currentTimeMillis();
            return true;
        }
        return System.currentTimeMillis() - this.IlIIIlIIlllllIIIllIlIlIll < 500L;
    }

    public boolean IllIIIllIIIIlIlIlIllIIlll() {
        return Mouse.isButtonDown((int)0) ? true : Mouse.isButtonDown((int)1);
    }

    public int lllIlIIlIIIlIlIIIllIlllIl(int n, double d) {
        return this.lllIIIllIIIIlllIlIIllIIll(0, this.lIlIlIIllIIIlllIllIIlIllI, n, d);
    }

    public void lIIIIlIlIIlllllIIllIIlIII() {
    }

    public class_1974 lllIIIllIIIIlllIlIIllIIll(class_1774 class_17742) {
        if (!class_17742.lllIlIIlIIIlIlIIIllIlllIl()) {
            return lIIllllllllIlIllllllllIlI;
        }
        Block class_05492 = class_17742.IIIllIIlIIIIIIlIlIIllIIlI();
        if (class_05492 == Blocks.enchanting_table) {
            return class_1974.lllIIIllIIIIlllIlIIllIIll(class_17742.lllIlIIlIIIlIlIIIllIlllIl, class_17742.IlIllllllIIlIIllllIIlIIIl, class_17742.lIlllIlllIIIIlIIlllIllIII, class_17742.lllIlIIlIIIlIlIIIllIlllIl + 1, class_17742.IlIllllllIIlIIllllIIlIIIl + 1, class_17742.lIlllIlllIIIIlIIlllIllIII + 1);
        }
        if (class_05492 != Blocks.IllIlIlIIIlllIIllIIIIlIll && class_05492 != Blocks.lIllIlIlIIIIlIlIIlIlIlllI) {
            class_1974 class_19742;
            if (class_05492 != null && class_05492 != Blocks.beacon && (class_19742 = class_05492.IlIllllllIIlIIllllIIlIIIl(class_17742.IIIIIIIIlIllIIllIIlllIllI(), class_17742.lllIlIIlIIIlIlIIIllIlllIl, class_17742.IlIllllllIIlIIllllIIlIIIl, class_17742.lIlllIlllIIIIlIIlllIllIII)) != null) {
                return class_19742;
            }
            return lIIllllllllIlIllllllllIlI;
        }
        return class_1974.lllIIIllIIIIlllIlIIllIIll(class_17742.lllIlIIlIIIlIlIIIllIlllIl - 1, class_17742.IlIllllllIIlIIllllIIlIIIl, class_17742.lIlllIlllIIIIlIIlllIllIII - 1, class_17742.lllIlIIlIIIlIlIIIllIlllIl + 2, class_17742.IlIllllllIIlIIllllIIlIIIl + 2, class_17742.lIlllIlllIIIIlIIlllIllIII + 2);
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0734 class_07342) {
        if (!class_07342.IIIIlIIlIIIllIIIIllIIIlII) {
            int n;
            int n2 = this.lIlIlIIllIIIlllIllIIlIllI;
            class_07342.lllIlIIlIIIlIlIIIllIlllIl((class_1521)this.llIllllIlIllIIIlIllIIlIlI);
            float f = class_07342.llllllIlIllllIlIlIlIIIIlI;
            if (this.lIlIlIIllIIIlllIllIIlIllI > 0) {
                n = 0;
                int n3 = this.lIlIlIIllIIIlllIllIIlIllI - 1;
                int n4 = (n + n3) / 2;
                while (n <= n3) {
                    n4 = (n + n3) / 2;
                    class_0734 class_07343 = this.IIlIIlIlIlIllIIlIlIIIIlll[n4];
                    if (f < class_07343.llllllIlIllllIlIlIlIIIIlI) {
                        n3 = n4 - 1;
                        continue;
                    }
                    n = n4 + 1;
                }
                n2 = n > n4 ? n4 + 1 : n4;
            }
            if ((n = this.lIlIlIIllIIIlllIllIIlIllI - n2) > 0) {
                System.arraycopy(this.IIlIIlIlIlIllIIlIlIIIIlll, n2, this.IIlIIlIlIlIllIIlIlIIIIlll, n2 + 1, n);
            }
            this.IIlIIlIlIlIllIIlIlIIIIlll[n2] = class_07342;
            class_07342.IIIIlIIlIIIllIIIIllIIIlII = true;
            ++this.lIlIlIIllIIIlllIllIIlIllI;
        }
    }

    public int llIIlllIllIllllIIIlIIIIII() {
        return this.IllIlIlIIIlllIIllIIIIlIll;
    }

    public int llIIllIllIlIIlIIllIllllll() {
        return this.IlllIIlllllllIIllIlIllllI;
    }

    public int lllIIlIIIllllllIIIIlIlIlI() {
        return this.IIlIllIIlllllIIlIIllllIIl;
    }

    public int IlIlllIIIIIIlIIllIIllIlll() {
        return this.lIIIlIIllIllIIlIIlIIIllII;
    }
}

