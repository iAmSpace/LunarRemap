package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.awt.Color;
import java.util.List;
import java.util.Random;

import net.minecraft.util.ResourceLocation;
import com.moonsworth.lunar.client.config.SettingsManager;
import com.moonsworth.lunar.client.LunarClient;
import net.minecraft.client.Minecraft;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.client.renderer.OpenGlHelper;
import org.lwjgl.opengl.GL11;

public class class_1176
extends class_0210 {
    private static final ResourceLocation IlIllllllIIlIIllllIIlIIIl = new ResourceLocation("textures/misc/vignette.png");
    private static final ResourceLocation lIlllIlllIIIIlIIlllIllIII = new ResourceLocation("textures/gui/widgets.png");
    private static final ResourceLocation IlIIIIIllllllIIlllIllllll = new ResourceLocation("textures/misc/pumpkinblur.png");
    private static final class_1785 lIllllIIlIIIlIllllllIIIll = new class_1785();
    private final Random IIIllIIlIIIIIIlIlIIllIIlI = new Random();
    private final Minecraft IllIIlllllllIIlIIlIIIIlIl;
    private final class_1063 IIIllIllIIlIlIlIlIllllIIl;
    private int IllIIIllIIIIlIlIlIllIIlll;
    private String lIIIIlIlIIlllllIIllIIlIII = "";
    private int IlIlIIlIlIllIIlIlIIllIIIl;
    private boolean lllllIlllIIllIlIIlIIIllII;
    public float lllIIIllIIIIlllIlIIllIIll = 1.0f;
    private int IlIlIIlllIIlIllIIIlllllIl;
    private ItemStack lIIlIIIIIlIlllIlIIlIlIlll;
    public static boolean lllIlIIlIIIlIlIIIllIlllIl = false;

    public class_1176(Minecraft class_06672) {
        this.IllIIlllllllIIlIIlIIIIlIl = class_06672;
        this.IIIllIllIIlIlIlIlIllllIIl = new class_1063(class_06672);
    }

    public void lllIIIllIIIIlllIlIIllIIll(float f, boolean bl, int n, int n2) {
        Object object;
        int n3;
        int n4;
        String string;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        float f2;
        int n10;
        int n11;
        float f3;
        class_0321 class_03212 = new class_0321(this.IllIIlllllllIIlIIlIIIIlIl, this.IllIIlllllllIIlIIlIIIIlIl.displayWidth, this.IllIIlllllllIIlIIlIIIIlIl.displayHeight);
        int n12 = class_03212.lllIIIllIIIIlllIlIIllIIll();
        int n13 = class_03212.lllIlIIlIIIlIlIIIllIlllIl();
        class_1854 class_18542 = this.IllIIlllllllIIlIIlIIIIlIl.IlIlllIIIIIIlIIllIIllIlll;
        this.IllIIlllllllIIlIIlIIIIlIl.lIIlIIIIIlIlllIlIIlIlIlll.IIIllIllIIlIlIlIlIllllIIl();
        GL11.glEnable((int)3042);
        if (Minecraft.lIlllIlllIlIIIIlllIlIlIIl()) {
            this.lllIIIllIIIIlllIlIIllIIll(this.IllIIlllllllIIlIIlIIIIlIl.lIIIIlIlIIlllllIIllIIlIII.lllIlIIlIIIlIlIIIllIlllIl(f), n12, n13);
        } else {
            OpenGlHelper.glBlendFunc(770, 771, 1, 0);
        }
        ItemStack class_08972 = this.IllIIlllllllIIlIIlIIIIlIl.lIIIIlIlIIlllllIIllIIlIII.lllIIlIIIllllllIIIIlIlIlI.lllIlIIlIIIlIlIIIllIlllIl(3);
        if (this.IllIIlllllllIIlIIlIIIIlIl.gameSettings.IIlIlIlIIlllIIIlIIIIlIIIl == 0 && class_08972 != null && class_08972.lllIIIllIIIIlllIlIIllIIll() == Item.getItemFromBlock(Blocks.lIlIIlllllIlllllIlIIIllll)) {
            this.lllIlIIlIIIlIlIIIllIlllIl(n12, n13);
        }
        if (!this.IllIIlllllllIIlIIlIIIIlIl.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(class_0700.lIIIIlIlIIlllllIIllIIlIII) && (f3 = this.IllIIlllllllIIlIIlIIIIlIl.lIIIIlIlIIlllllIIllIIlIII.llIIllIllIlIIlIIllIllllll + (this.IllIIlllllllIIlIIlIIIIlIl.lIIIIlIlIIlllllIIllIIlIII.llIIlllIllIllllIIIlIIIIII - this.IllIIlllllllIIlIIlIIIIlIl.lIIIIlIlIIlllllIIllIIlIII.llIIllIllIlIIlIIllIllllll) * f) > 0.0f) {
            this.lllIlIIlIIIlIlIIIllIlllIl(f3, n12, n13);
        }
        if (!this.IllIIlllllllIIlIIlIIIIlIl.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll()) {
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            this.IllIIlllllllIIlIIlIIIIlIl.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(lIlllIlllIIIIlIIlllIllIII);
            class_0503 class_05032 = this.IllIIlllllllIIlIIlIIIIlIl.lIIIIlIlIIlllllIIllIIlIII.lllIIlIIIllllllIIIIlIlIlI;
            IlIlllIIIIIIlIIllIIllIlll = -90.0f;
            class_1176.lllIIIllIIIIlllIlIIllIIll(n12 / 2 - 91, n13 - 22, 0, 0, 182, 22);
            class_1176.lllIIIllIIIIlllIlIIllIIll(n12 / 2 - 91 - 1 + class_05032.IlIllllllIIlIIllllIIlIIIl * 20, n13 - 22 - 1, 0, 22, 24, 22);
            this.IllIIlllllllIIlIIlIIIIlIl.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(lllIIlIIIllllllIIIIlIlIlI);
            GL11.glEnable((int)3042);
            GL11.glEnable((int)3008);
            OpenGlHelper.glBlendFunc(775, 769, 1, 0);
            SettingsManager class_06252 = LunarClient.getInstance().getSettingsManager();
            if (this.IllIIlllllllIIlIIlIIIIlIl.lllllIlllIIllIlIIlIIIllII == null || this.IllIIlllllllIIlIIlIIIIlIl.lllllIlllIIllIlIIlIIIllII instanceof class_1056) {
                if ((Boolean) class_06252.csCustomCrosshair.getValue()) {
                    GL11.glPushMatrix();
                    float f4 = 1.0f / LunarClient.IllIIIllIIIIlIlIlIllIIlll();
                    n11 = (int)((float)n12 / f4);
                    n10 = (int)((float)n13 / f4);
                    GL11.glScalef((float)f4, (float)f4, (float)f4);
                    f2 = (Float) class_06252.csSize.getValue();
                    float f5 = (Float) class_06252.csGap.getValue();
                    float f6 = (Float) class_06252.csThickness.getValue();
                    n9 = class_06252.csColor.lllIIIllIIIIlllIlIIllIIll();
                    n8 = (Boolean) class_06252.csOutline.getValue() ? 1 : 0;
                    n7 = n11 / 2;
                    int n14 = n10 / 2;
                    if (n8 != 0) {
                        class_0210.lllIlIIlIIIlIlIIIllIlllIl((float)n7 - f5 - f2, (float)n14 - f6 / 2.0f, (float)n7 - f5, (float)n14 + f6 / 2.0f, 0.5f, -1358954496, n9);
                        class_0210.lllIlIIlIIIlIlIIIllIlllIl((float)n7 + f5, (float)n14 - f6 / 2.0f, (float)n7 + f5 + f2, (float)n14 + f6 / 2.0f, 0.5f, -1358954496, n9);
                        class_0210.lllIlIIlIIIlIlIIIllIlllIl((float)n7 - f6 / 2.0f, (float)n14 - f5 - f2, (float)n7 + f6 / 2.0f, (float)n14 - f5, 0.5f, -1358954496, n9);
                        class_0210.lllIlIIlIIIlIlIIIllIlllIl((float)n7 - f6 / 2.0f, (float)n14 + f5, (float)n7 + f6 / 2.0f, (float)n14 + f5 + f2, 0.5f, -1358954496, n9);
                    } else {
                        class_0210.lllIIIllIIIIlllIlIIllIIll((float)n7 - f5 - f2, (float)n14 - f6 / 2.0f, (float)n7 - f5, (float)n14 + f6 / 2.0f, n9);
                        class_0210.lllIIIllIIIIlllIlIIllIIll((float)n7 + f5, (float)n14 - f6 / 2.0f, (float)n7 + f5 + f2, (float)n14 + f6 / 2.0f, n9);
                        class_0210.lllIIIllIIIIlllIlIIllIIll((float)n7 - f6 / 2.0f, (float)n14 - f5 - f2, (float)n7 + f6 / 2.0f, (float)n14 - f5, n9);
                        class_0210.lllIIIllIIIIlllIlIIllIIll((float)n7 - f6 / 2.0f, (float)n14 + f5, (float)n7 + f6 / 2.0f, (float)n14 + f5 + f2, n9);
                    }
                    GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                    GL11.glPopMatrix();
                } else {
                    class_1176.lllIIIllIIIIlllIlIIllIIll(n12 / 2 - 7, n13 / 2 - 7, 0, 0, 16, 16);
                }
            }
            OpenGlHelper.glBlendFunc(770, 771, 1, 0);
            this.IllIIlllllllIIlIIlIIIIlIl.mcProfiler.startSection("bossHealth");
            this.lIlllIlllIIIIlIIlllIllIII();
            this.IllIIlllllllIIlIIlIIIIlIl.mcProfiler.endSection();
            if (this.IllIIlllllllIIlIIlIIIIlIl.lIllllIIlIIIlIllllllIIIll.lllIlIIlIIIlIlIIIllIlllIl()) {
                this.lllIIIllIIIIlllIlIIllIIll(n12, n13);
            }
            this.IllIIlllllllIIlIIlIIIIlIl.mcProfiler.startSection("actionBar");
            GL11.glEnable((int)32826);
            class_0624.IlIllllllIIlIIllllIIlIIIl();
            for (int i = 0; i < 9; ++i) {
                n6 = n12 / 2 - 90 + i * 20 + 2;
                n5 = n13 - 16 - 3;
                this.lllIIIllIIIIlllIlIIllIIll(i, n6, n5, f);
            }
            class_0624.lllIIIllIIIIlllIlIIllIIll();
            GL11.glDisable((int)32826);
            this.IllIIlllllllIIlIIlIIIIlIl.mcProfiler.endSection();
            GL11.glDisable((int)3042);
        }
        if (this.IllIIlllllllIIlIIlIIIIlIl.lIIIIlIlIIlllllIIllIIlIII.lIIIIIlIllIllIlIlIIllllll() > 0) {
            this.IllIIlllllllIIlIIlIIIIlIl.mcProfiler.startSection("sleep");
            GL11.glDisable((int)2929);
            GL11.glDisable((int)3008);
            int n15 = this.IllIIlllllllIIlIIlIIIIlIl.lIIIIlIlIIlllllIIllIIlIII.lIIIIIlIllIllIlIlIIllllll();
            float f7 = (float)n15 / 100.0f;
            if (f7 > 1.0f) {
                f7 = 1.0f - (float)(n15 - 100) / 10.0f;
            }
            n6 = (int)(220.0f * f7) << 24 | 0x101020;
            class_1176.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, n12, n13, n6);
            GL11.glEnable((int)3008);
            GL11.glEnable((int)2929);
            this.IllIIlllllllIIlIIlIIIIlIl.mcProfiler.endSection();
        }
        int n16 = 0xFFFFFF;
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        int n17 = n12 / 2 - 91;
        if (this.IllIIlllllllIIlIIlIIIIlIl.lIIIIlIlIIlllllIIllIIlIII.IIIIlIllIlIIlIIlIllIlIlll()) {
            this.IllIIlllllllIIlIIlIIIIlIl.mcProfiler.startSection("jumpBar");
            this.IllIIlllllllIIlIIlIIIIlIl.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(class_0210.lllIIlIIIllllllIIIIlIlIlI);
            f2 = this.IllIIlllllllIIlIIlIIIIlIl.lIIIIlIlIIlllllIIllIIlIII.IlIlIIlllIllllllllIIIlIlI();
            int n18 = 182;
            int n19 = (int)(f2 * (float)(n18 + 1));
            int n20 = n13 - 32 + 3;
            class_1176.lllIIIllIIIIlllIlIIllIIll(n17, n20, 0, 84, n18, 5);
            if (n19 > 0) {
                class_1176.lllIIIllIIIIlllIlIIllIIll(n17, n20, 0, 89, n19, 5);
            }
            this.IllIIlllllllIIlIIlIIIIlIl.mcProfiler.endSection();
        } else if (this.IllIIlllllllIIlIIlIIIIlIl.lIllllIIlIIIlIllllllIIIll.lIllllIIlIIIlIllllllIIIll()) {
            this.IllIIlllllllIIlIIlIIIIlIl.mcProfiler.startSection("expBar");
            this.IllIIlllllllIIlIIlIIIIlIl.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(class_0210.lllIIlIIIllllllIIIIlIlIlI);
            n6 = this.IllIIlllllllIIlIIlIIIIlIl.lIIIIlIlIIlllllIIllIIlIII.IIlIlIIIIlIlllIIlIIlIIIII();
            if (n6 > 0) {
                int n21 = 182;
                int n22 = (int)(this.IllIIlllllllIIlIIlIIIIlIl.lIIIIlIlIIlllllIIllIIlIII.llIlllllIIlIIlIIllllIllll * (float)(n21 + 1));
                int n23 = n13 - 32 + 3;
                class_1176.lllIIIllIIIIlllIlIIllIIll(n17, n23, 0, 64, n21, 5);
                if (n22 > 0) {
                    class_1176.lllIIIllIIIIlllIlIIllIIll(n17, n23, 0, 69, n22, 5);
                }
            }
            this.IllIIlllllllIIlIIlIIIIlIl.mcProfiler.endSection();
            if (this.IllIIlllllllIIlIIlIIIIlIl.lIIIIlIlIIlllllIIllIIlIII.lllIlllllIllIlIIlIlIIIlll > 0) {
                this.IllIIlllllllIIlIIlIIIIlIl.mcProfiler.startSection("expLevel");
                boolean bl2 = false;
                int n24 = bl2 ? 0xFFFFFF : 8453920;
                String string2 = "" + this.IllIIlllllllIIlIIlIIIIlIl.lIIIIlIlIIlllllIIllIIlIII.lllIlllllIllIlIIlIlIIIlll;
                n11 = (n12 - class_18542.lllIIIllIIIIlllIlIIllIIll(string2)) / 2;
                n10 = n13 - 31 - 4;
                n8 = 0;
                class_18542.lllIlIIlIIIlIlIIIllIlllIl(string2, n11 + 1, n10, 0);
                class_18542.lllIlIIlIIIlIlIIIllIlllIl(string2, n11 - 1, n10, 0);
                class_18542.lllIlIIlIIIlIlIIIllIlllIl(string2, n11, n10 + 1, 0);
                class_18542.lllIlIIlIIIlIlIIIllIlllIl(string2, n11, n10 - 1, 0);
                class_18542.lllIlIIlIIIlIlIIIllIlllIl(string2, n11, n10, n24);
                this.IllIIlllllllIIlIIlIIIIlIl.mcProfiler.endSection();
            }
        }
        if (this.IllIIlllllllIIlIIlIIIIlIl.gameSettings.lIIlIlllIIlIIIIlIlIIIIlll) {
            this.IllIIlllllllIIlIIlIIIIlIl.mcProfiler.startSection("toolHighlight");
            if (this.IlIlIIlllIIlIllIIIlllllIl > 0 && this.lIIlIIIIIlIlllIlIIlIlIlll != null) {
                int n25;
                String string3 = this.lIIlIIIIIlIlllIlIIlIlIlll.lIIlIIIIIlIlllIlIIlIlIlll();
                n5 = (n12 - class_18542.lllIIIllIIIIlllIlIIllIIll(string3)) / 2;
                int n26 = n13 - 59;
                if (!this.IllIIlllllllIIlIIlIIIIlIl.lIllllIIlIIIlIllllllIIIll.lllIlIIlIIIlIlIIIllIlllIl()) {
                    n26 += 14;
                }
                if ((n25 = (int)((float)this.IlIlIIlllIIlIllIIIlllllIl * 256.0f / 10.0f)) > 255) {
                    n25 = 255;
                }
                if (n25 > 0) {
                    GL11.glPushMatrix();
                    GL11.glEnable((int)3042);
                    OpenGlHelper.glBlendFunc(770, 771, 1, 0);
                    class_18542.lllIIIllIIIIlllIlIIllIIll(string3, (float)n5, (float)n26, 0xFFFFFF + (n25 << 24));
                    GL11.glDisable((int)3042);
                    GL11.glPopMatrix();
                }
            }
            this.IllIIlllllllIIlIIlIIIIlIl.mcProfiler.endSection();
        }
        if (this.IllIIlllllllIIlIIlIIIIlIl.lIlIllIIlIIlIIlIIlIIlIIll()) {
            this.IllIIlllllllIIlIIlIIIIlIl.mcProfiler.startSection("demo");
            String string4 = "";
            string4 = this.IllIIlllllllIIlIIlIIIIlIl.theWorld.IlIIIlIIIIllIIIllIIIIIIll() >= 120500L ? class_0616.lllIIIllIIIIlllIlIIllIIll("demo.demoExpired", new Object[0]) : class_0616.lllIIIllIIIIlllIlIIllIIll("demo.remainingTime", class_1911.lllIIIllIIIIlllIlIIllIIll((int)(120500L - this.IllIIlllllllIIlIIlIIIIlIl.theWorld.IlIIIlIIIIllIIIllIIIIIIll())));
            n5 = class_18542.lllIIIllIIIIlllIlIIllIIll(string4);
            class_18542.lllIIIllIIIIlllIlIIllIIll(string4, (float)(n12 - n5 - 10), 5.0f, 0xFFFFFF);
            this.IllIIlllllllIIlIIlIIIIlIl.mcProfiler.endSection();
        }
        if (this.IllIIlllllllIIlIIlIIIIlIl.gameSettings.showDebugInfo) {
            this.IllIIlllllllIIlIIlIIIIlIl.mcProfiler.startSection("debug");
            GL11.glPushMatrix();
            class_18542.lllIIIllIIIIlllIlIIllIIll("Minecraft 1.7.10 (" + this.IllIIlllllllIIlIIlIIIIlIl.llllIIIIlIIIlIIIIIIlIllll + ")", 2.0f, 2.0f, 0xFFFFFF);
            class_18542.lllIIIllIIIIlllIlIIllIIll(this.IllIIlllllllIIlIIlIIIIlIl.lIIlIIIIIlIlllIlIIlIlIlll(), 2.0f, 12.0f, 0xFFFFFF);
            class_18542.lllIIIllIIIIlllIlIIllIIll(this.IllIIlllllllIIlIIlIIIIlIl.lIlIlIIlIIIIlIIIIIlllIIII(), 2.0f, 22.0f, 0xFFFFFF);
            class_18542.lllIIIllIIIIlllIlIIllIIll(this.IllIIlllllllIIlIIlIIIIlIl.IIlllIlIlllIllIIIlllIIlIl(), 2.0f, 32.0f, 0xFFFFFF);
            class_18542.lllIIIllIIIIlllIlIIllIIll(this.IllIIlllllllIIlIIlIIIIlIl.IlIIIlIIIIllIIIllIIIIIIll(), 2.0f, 42.0f, 0xFFFFFF);
            long l = Runtime.getRuntime().maxMemory();
            long l2 = Runtime.getRuntime().totalMemory();
            long l3 = Runtime.getRuntime().freeMemory();
            long l4 = l2 - l3;
            string = "Used memory: " + l4 * 100L / l + "% (" + l4 / 1024L / 1024L + "MB) of " + l / 1024L / 1024L + "MB";
            n9 = 0xE0E0E0;
            this.lllIlIIlIIIlIlIIIllIlllIl(class_18542, string, n12 - class_18542.lllIIIllIIIIlllIlIIllIIll(string) - 2, 2, 0xE0E0E0);
            string = "Allocated memory: " + l2 * 100L / l + "% (" + l2 / 1024L / 1024L + "MB)";
            this.lllIlIIlIIIlIlIIIllIlllIl(class_18542, string, n12 - class_18542.lllIIIllIIIIlllIlIIllIIll(string) - 2, 12, 0xE0E0E0);
            n8 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IllIIlllllllIIlIIlIIIIlIl.lIIIIlIlIIlllllIIllIIlIII.IlIIlllllIIlIlIlllllIllll);
            n7 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IllIIlllllllIIlIIlIIIIlIl.lIIIIlIlIIlllllIIllIIlIII.llIIlIlIlllIIllIlIlllIllI);
            n4 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IllIIlllllllIIlIIlIIIIlIl.lIIIIlIlIIlllllIIllIIlIII.IllIIIIllIIllIllIlllIlIIl);
            this.lllIlIIlIIIlIlIIIllIlllIl(class_18542, String.format("x: %.5f (%d) // c: %d (%d)", this.IllIIlllllllIIlIIlIIIIlIl.lIIIIlIlIIlllllIIllIIlIII.IlIIlllllIIlIlIlllllIllll, n8, n8 >> 4, n8 & 0xF), 2, 64, 0xE0E0E0);
            this.lllIlIIlIIIlIlIIIllIlllIl(class_18542, String.format("y: %.3f (feet pos, %.3f eyes pos)", this.IllIIlllllllIIlIIlIIIIlIl.lIIIIlIlIIlllllIIllIIlIII.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl, this.IllIIlllllllIIlIIlIIIIlIl.lIIIIlIlIIlllllIIllIIlIII.llIIlIlIlllIIllIlIlllIllI), 2, 72, 0xE0E0E0);
            this.lllIlIIlIIIlIlIIIllIlllIl(class_18542, String.format("z: %.5f (%d) // c: %d (%d)", this.IllIIlllllllIIlIIlIIIIlIl.lIIIIlIlIIlllllIIllIIlIII.IllIIIIllIIllIllIlllIlIIl, n4, n4 >> 4, n4 & 0xF), 2, 80, 0xE0E0E0);
            n3 = MathHelper.IlIllllllIIlIIllllIIlIIIl((double)(this.IllIIlllllllIIlIIlIIIIlIl.lIIIIlIlIIlllllIIllIIlIII.IIIIlIllIlIIlIIlIllIlIlll * 4.0f / 360.0f) + 0.5) & 3;
            this.lllIlIIlIIIlIlIIIllIlllIl(class_18542, "f: " + n3 + " (" + class_1632.IlIllllllIIlIIllllIIlIIIl[n3] + ") / " + MathHelper.IIIllIIlIIIIIIlIlIIllIIlI(this.IllIIlllllllIIlIIlIIIIlIl.lIIIIlIlIIlllllIIllIIlIII.IIIIlIllIlIIlIIlIllIlIlll), 2, 88, 0xE0E0E0);
            if (this.IllIIlllllllIIlIIlIIIIlIl.theWorld != null && this.IllIIlllllllIIlIIlIIIIlIl.theWorld.IlIIIIIllllllIIlllIllllll(n8, n7, n4)) {
                object = this.IllIIlllllllIIlIIlIIIIlIl.theWorld.lIlllIlllIIIIlIIlllIllIII(n8, n4);
                this.lllIlIIlIIIlIlIIIllIlllIl(class_18542, "lc: " + (((class_0723)object).lllIIIllIIIIlllIlIIllIIll() + 15) + " b: " + ((class_0723)object).lllIIIllIIIIlllIlIIllIIll((int)(n8 & 15), (int)(n4 & 15), (class_1076)this.IllIIlllllllIIlIIlIIIIlIl.theWorld.IIIllIllIIlIlIlIlIllllIIl()).IlIIIlIllIIIllIIIIlIIlIll + " bl: " + ((class_0723)object).lllIIIllIIIIlllIlIIllIIll(class_1346.lllIlIIlIIIlIlIIIllIlllIl, n8 & 0xF, n7, n4 & 0xF) + " sl: " + ((class_0723)object).lllIIIllIIIIlllIlIIllIIll(class_1346.lllIIIllIIIIlllIlIIllIIll, n8 & 0xF, n7, n4 & 0xF) + " rl: " + ((class_0723)object).lllIlIIlIIIlIlIIIllIlllIl(n8 & 0xF, n7, n4 & 0xF, 0), 2, 96, 0xE0E0E0);
            }
            this.lllIlIIlIIIlIlIIIllIlllIl(class_18542, String.format("ws: %.3f, fs: %.3f, g: %b, fl: %d", this.IllIIlllllllIIlIIlIIIIlIl.lIIIIlIlIIlllllIIllIIlIII.lIIlIlIlIlIllIIlIIllllIll.lllIlIIlIIIlIlIIIllIlllIl(), Float.valueOf(this.IllIIlllllllIIlIIlIIIIlIl.lIIIIlIlIIlllllIIllIIlIII.lIIlIlIlIlIllIIlIIllllIll.lllIIIllIIIIlllIlIIllIIll()), this.IllIIlllllllIIlIIlIIIIlIl.lIIIIlIlIIlllllIIllIIlIII.llllllIlIllllIlIlIlIIIIlI, this.IllIIlllllllIIlIIlIIIIlIl.theWorld.lIllllIIlIIIlIllllllIIIll(n8, n4)), 2, 104, 0xE0E0E0);
            if (this.IllIIlllllllIIlIIlIIIIlIl.lIIlIIIIIlIlllIlIIlIlIlll != null && this.IllIIlllllllIIlIIlIIIIlIl.lIIlIIIIIlIlllIlIIlIlIlll.lllIIIllIIIIlllIlIIllIIll()) {
                this.lllIlIIlIIIlIlIIIllIlllIl(class_18542, String.format("shader: %s", this.IllIIlllllllIIlIIlIIIIlIl.lIIlIIIIIlIlllIlIIlIlIlll.IllIIlllllllIIlIIlIIIIlIl().lllIlIIlIIIlIlIIIllIlllIl()), 2, 112, 0xE0E0E0);
            }
            GL11.glPopMatrix();
            this.IllIIlllllllIIlIIlIIIIlIl.mcProfiler.endSection();
        }
        if (lllIlIIlIIIlIlIIIllIlllIl) {
            this.IllIIlllllllIIlIIlIIIIlIl.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll("Uploading screenshot...", 4.0f, (float)(class_03212.lllIlIIlIIIlIlIIIllIlllIl() - 24), -1);
        }
        if (this.IllIIlllllllIIlIIlIIIIlIl.lllllIlllIIllIlIIlIIIllII instanceof class_0822 || this.IllIIlllllllIIlIIlIIIIlIl.lllllIlllIIllIlIIlIIIllII instanceof class_1998) {
            LunarClient.getInstance().getEventBus().callEvent(new class_1217(class_03212));
        }
        LunarClient.getInstance().getEventBus().callEvent(new class_0097(class_03212));
        if (!this.IllIIlllllllIIlIIlIIIIlIl.gameSettings.showDebugInfo || ((Boolean) LunarClient.getInstance().getSettingsManager().rsShowHudInDbg.getValue()).booleanValue()) {
            LunarClient.getInstance().getEventBus().callEvent(new class_2201(class_03212));
        }
        if (this.IllIIlllllllIIlIIlIIIIlIl.lllllIlllIIllIlIIlIIIllII == null) {
            class_0713.IlIlllIIIIIIlIIllIIllIlll().lllIIlIIIllllllIIIIlIlIlI();
        }
        if (this.IlIlIIlIlIllIIlIlIIllIIIl > 0) {
            this.IllIIlllllllIIlIIlIIIIlIl.mcProfiler.startSection("overlayMessage");
            f2 = (float)this.IlIlIIlIlIllIIlIlIIllIIIl - f;
            n5 = (int)(f2 * 255.0f / 20.0f);
            if (n5 > 255) {
                n5 = 255;
            }
            if (n5 > 8) {
                GL11.glPushMatrix();
                GL11.glTranslatef((float)(n12 / 2), (float)(n13 - 68), (float)0.0f);
                GL11.glEnable((int)3042);
                OpenGlHelper.glBlendFunc(770, 771, 1, 0);
                int n27 = 0xFFFFFF;
                if (this.lllllIlllIIllIlIIlIIIllII) {
                    n27 = Color.HSBtoRGB(f2 / 50.0f, 0.7f, 0.6f) & 0xFFFFFF;
                }
                class_18542.lllIlIIlIIIlIlIIIllIlllIl(this.lIIIIlIlIIlllllIIllIIlIII, -class_18542.lllIIIllIIIIlllIlIIllIIll(this.lIIIIlIlIIlllllIIllIIlIII) / 2, -4, n27 + (n5 << 24 & 0xFF000000));
                GL11.glDisable((int)3042);
                GL11.glPopMatrix();
            }
            this.IllIIlllllllIIlIIlIIIIlIl.mcProfiler.endSection();
        }
        class_0693 class_06932 = this.IllIIlllllllIIlIIlIIIIlIl.theWorld.IlIlIIlllIllllllllIIIlIlI().lllIIIllIIIIlllIlIIllIIll(1);
        GL11.glEnable((int)3042);
        OpenGlHelper.glBlendFunc(770, 771, 1, 0);
        GL11.glDisable((int)3008);
        GL11.glPushMatrix();
        GL11.glTranslatef((float)0.0f, (float)(n13 - 48), (float)0.0f);
        this.IllIIlllllllIIlIIlIIIIlIl.mcProfiler.startSection("chat");
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(this.IllIIIllIIIIlIlIlIllIIlll);
        this.IllIIlllllllIIlIIlIIIIlIl.mcProfiler.endSection();
        GL11.glPopMatrix();
        class_06932 = this.IllIIlllllllIIlIIlIIIIlIl.theWorld.IlIlIIlllIllllllllIIIlIlI().lllIIIllIIIIlllIlIIllIIll(0);
        if (this.IllIIlllllllIIlIIlIIIIlIl.gameSettings.lIlIIIlIlIllIlIlIIIlIlIII.lIlllIlllIIIIlIIlllIllIII() && (!this.IllIIlllllllIIlIIlIIIIlIl.isIntegratedServerRunning() || this.IllIIlllllllIIlIIlIIIIlIl.lIIIIlIlIIlllllIIllIIlIII.lllIlIIlIIIlIlIIIllIlllIl.lllIlIIlIIIlIlIIIllIlllIl.size() > 1 || class_06932 != null)) {
            int n28;
            this.IllIIlllllllIIlIIlIIIIlIl.mcProfiler.startSection("playerList");
            class_1764 class_17642 = this.IllIIlllllllIIlIIlIIIIlIl.lIIIIlIlIIlllllIIllIIlIII.lllIlIIlIIIlIlIIIllIlllIl;
            List list = class_17642.lllIlIIlIIIlIlIIIllIlllIl;
            n11 = n28 = class_17642.IlIllllllIIlIIllllIIlIIIl;
            n10 = 1;
            while (n11 > 20) {
                n11 = (n28 + ++n10 - 1) / n10;
            }
            int n29 = 300 / n10;
            if (n29 > 150) {
                n29 = 150;
            }
            int n30 = (n12 - n10 * n29) / 2;
            int n31 = 15;
            class_1176.lllIIIllIIIIlllIlIIllIIll(n30 - 1, n31 - 1, n30 + n29 * n10, n31 + 9 * n11, Integer.MIN_VALUE);
            for (n9 = 0; n9 < n28; ++n9) {
                n8 = n30 + n9 % n10 * n29;
                n7 = n31 + n9 / n10 * 9;
                class_1176.lllIIIllIIIIlllIlIIllIIll(n8, n7, n8 + n29 - 1, n7 + 8, 0x20FFFFFF);
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                GL11.glEnable((int)3008);
                if (n9 >= list.size()) continue;
                class_0958 class_09582 = (class_0958)list.get(n9);
                class_0531 class_05312 = this.IllIIlllllllIIlIIlIIIIlIl.theWorld.IlIlIIlllIllllllllIIIlIlI().IIIllIIlIIIIIIlIlIIllIIlI(class_09582.lllIIIllIIIIlllIlIIllIIll);
                string = class_0531.lllIIIllIIIIlllIlIIllIIll(class_05312, class_09582.lllIIIllIIIIlllIlIIllIIll);
                class_18542.lllIIIllIIIIlllIlIIllIIll(string, (float)n8, (float)n7, 0xFFFFFF);
                if (class_06932 != null && (n3 = n8 + n29 - 12 - 5) - (n4 = n8 + class_18542.lllIIIllIIIIlllIlIIllIIll(string) + 5) > 5) {
                    object = class_06932.lllIIIllIIIIlllIlIIllIIll().lllIIIllIIIIlllIlIIllIIll(class_09582.lllIIIllIIIIlllIlIIllIIll, class_06932);
                    String string5 = (Object)((Object) EnumChatFormatting.YELLOW) + "" + ((class_0678)object).lllIlIIlIIIlIlIIIllIlllIl();
                    class_18542.lllIIIllIIIIlllIlIIllIIll(string5, (float)(n3 - class_18542.lllIIIllIIIIlllIlIIllIIll(string5)), (float)n7, 0xFFFFFF);
                }
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                if (class_09582.lllIlIIlIIIlIlIIIllIlllIl == -1) continue;
                this.IllIIlllllllIIlIIlIIIIlIl.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(lllIIlIIIllllllIIIIlIlIlI);
                n4 = 0;
                n3 = class_09582.lllIlIIlIIIlIlIIIllIlllIl < -1 ? 5 : (class_09582.lllIlIIlIIIlIlIIIllIlllIl < 150 ? 0 : (class_09582.lllIlIIlIIIlIlIIIllIlllIl < 300 ? 1 : (class_09582.lllIlIIlIIIlIlIIIllIlllIl < 600 ? 2 : (class_09582.lllIlIIlIIIlIlIIIllIlllIl < 1000 ? 3 : 4))));
                IlIlllIIIIIIlIIllIIllIlll += 100.0f;
                class_1176.lllIIIllIIIIlllIlIIllIIll(n8 + n29 - 12, n7, 0 + n4 * 10, 176 + n3 * 8, 10, 8);
                IlIlllIIIIIIlIIllIIllIlll -= 100.0f;
            }
        }
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glDisable((int)2896);
        GL11.glEnable((int)3008);
    }

    private void lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        boolean bl;
        boolean bl2 = bl = this.IllIIlllllllIIlIIlIIIIlIl.lIIIIlIlIIlllllIIllIIlIII.IIIIlIllIlIIIIIllllIIlllI / 3 % 2 == 1;
        if (this.IllIIlllllllIIlIIlIIIIlIl.lIIIIlIlIIlllllIIllIIlIII.IIIIlIllIlIIIIIllllIIlllI < 10) {
            bl = false;
        }
        int n9 = MathHelper.lIllllIIlIIIlIllllllIIIll(this.IllIIlllllllIIlIIlIIIIlIl.lIIIIlIlIIlllllIIllIIlIII.lllIIIlllIlllIIlIllllIIlI());
        int n10 = MathHelper.lIllllIIlIIIlIllllllIIIll(this.IllIIlllllllIIlIIlIIIIlIl.lIIIIlIlIIlllllIIllIIlIII.IIIIIllIlIllIlIlIIlIllIIl);
        this.IIIllIIlIIIIIIlIlIIllIIlI.setSeed(this.IllIIIllIIIIlIlIlIllIIlll * 312871);
        boolean bl3 = false;
        class_0955 class_09552 = this.IllIIlllllllIIlIIlIIIIlIl.lIIIIlIlIIlllllIIllIIlIII.lIllIIlllIIIlIlIIIlllIlIl();
        int n11 = class_09552.lllIIIllIIIIlllIlIIllIIll();
        int n12 = class_09552.lllIlIIlIIIlIlIIIllIlllIl();
        class_1685 class_16852 = this.IllIIlllllllIIlIIlIIIIlIl.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(class_1152.lllIIIllIIIIlllIlIIllIIll);
        int n13 = n / 2 - 91;
        int n14 = n / 2 + 91;
        int n15 = n2 - 39;
        float f = (float)class_16852.IlIIIIIllllllIIlllIllllll();
        float f2 = this.IllIIlllllllIIlIIlIIIIlIl.lIIIIlIlIIlllllIIllIIlIII.lllIlllllIllIlIIlIlIIIlll();
        int n16 = MathHelper.lIllllIIlIIIlIllllllIIIll((f + f2) / 2.0f / 10.0f);
        int n17 = Math.max(10 - (n16 - 2), 3);
        int n18 = n15 - (n16 - 1) * n17 - 10;
        float f3 = f2;
        int n19 = this.IllIIlllllllIIlIIlIIIIlIl.lIIIIlIlIIlllllIIllIIlIII.lIIlIlIIIIIllIIIIllIlIlII();
        int n20 = -1;
        if (this.IllIIlllllllIIlIIlIIIIlIl.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(class_0700.llIIlllIllIllllIIIlIIIIII)) {
            n20 = this.IllIIIllIIIIlIlIlIllIIlll % MathHelper.lIllllIIlIIIlIllllllIIIll(f + 5.0f);
        }
        this.IllIIlllllllIIlIIlIIIIlIl.mcProfiler.startSection("armor");
        for (n8 = 0; n8 < 10; ++n8) {
            if (n19 <= 0) continue;
            n7 = n13 + n8 * 8;
            if (n8 * 2 + 1 < n19) {
                class_1176.lllIIIllIIIIlllIlIIllIIll(n7, n18, 34, 9, 9, 9);
            }
            if (n8 * 2 + 1 == n19) {
                class_1176.lllIIIllIIIIlllIlIIllIIll(n7, n18, 25, 9, 9, 9);
            }
            if (n8 * 2 + 1 <= n19) continue;
            class_1176.lllIIIllIIIIlllIlIIllIIll(n7, n18, 16, 9, 9, 9);
        }
        this.IllIIlllllllIIlIIlIIIIlIl.mcProfiler.endStartSection("health");
        for (n8 = MathHelper.lIllllIIlIIIlIllllllIIIll((f + f2) / 2.0f) - 1; n8 >= 0; --n8) {
            n7 = 16;
            if (this.IllIIlllllllIIlIIlIIIIlIl.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(class_0700.IlIIIlIIIIllIIIllIIIIIIll)) {
                n7 += 36;
            } else if (this.IllIIlllllllIIlIIlIIIIlIl.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(class_0700.IIlllIlIlllIllIIIlllIIlIl)) {
                n7 += 72;
            }
            int n21 = 0;
            if (bl) {
                n21 = 1;
            }
            n6 = MathHelper.lIllllIIlIIIlIllllllIIIll((float)(n8 + 1) / 10.0f) - 1;
            n5 = n13 + n8 % 10 * 8;
            n4 = n15 - n6 * n17;
            if (n9 <= 4) {
                n4 += this.IIIllIIlIIIIIIlIlIIllIIlI.nextInt(2);
            }
            if (n8 == n20) {
                n4 -= 2;
            }
            n3 = 0;
            if (this.IllIIlllllllIIlIIlIIIIlIl.theWorld.lIlllIlllIlIIIIlllIlIlIIl().lIlIlIIlIIIIlIIIIIlllIIII()) {
                n3 = 5;
            }
            class_1176.lllIIIllIIIIlllIlIIllIIll(n5, n4, 16 + n21 * 9, 9 * n3, 9, 9);
            if (bl) {
                if (n8 * 2 + 1 < n10) {
                    class_1176.lllIIIllIIIIlllIlIIllIIll(n5, n4, n7 + 54, 9 * n3, 9, 9);
                }
                if (n8 * 2 + 1 == n10) {
                    class_1176.lllIIIllIIIIlllIlIIllIIll(n5, n4, n7 + 63, 9 * n3, 9, 9);
                }
            }
            if (f3 > 0.0f) {
                if (f3 == f2 && f2 % 2.0f == 1.0f) {
                    class_1176.lllIIIllIIIIlllIlIIllIIll(n5, n4, n7 + 153, 9 * n3, 9, 9);
                } else {
                    class_1176.lllIIIllIIIIlllIlIIllIIll(n5, n4, n7 + 144, 9 * n3, 9, 9);
                }
                f3 -= 2.0f;
                continue;
            }
            if (n8 * 2 + 1 < n9) {
                class_1176.lllIIIllIIIIlllIlIIllIIll(n5, n4, n7 + 36, 9 * n3, 9, 9);
            }
            if (n8 * 2 + 1 != n9) continue;
            class_1176.lllIIIllIIIIlllIlIIllIIll(n5, n4, n7 + 45, 9 * n3, 9, 9);
        }
        class_1521 class_15212 = this.IllIIlllllllIIlIIlIIIIlIl.lIIIIlIlIIlllllIIllIIlIII.IlIIIlIIIIllIIIllIIIIIIll;
        if (class_15212 == null) {
            this.IllIIlllllllIIlIIlIIIIlIl.mcProfiler.endStartSection("food");
            for (n7 = 0; n7 < 10; ++n7) {
                n3 = n15;
                n6 = 16;
                int n22 = 0;
                if (this.IllIIlllllllIIlIIlIIIIlIl.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(class_0700.lIIlIIIIIlIlllIlIIlIlIlll)) {
                    n6 += 36;
                    n22 = 13;
                }
                if (this.IllIIlllllllIIlIIlIIIIlIl.lIIIIlIlIIlllllIIllIIlIII.lIllIIlllIIIlIlIIIlllIlIl().lIlllIlllIIIIlIIlllIllIII() <= 0.0f && this.IllIIIllIIIIlIlIlIllIIlll % (n11 * 3 + 1) == 0) {
                    n3 = n15 + (this.IIIllIIlIIIIIIlIlIIllIIlI.nextInt(3) - 1);
                }
                if (bl3) {
                    n22 = 1;
                }
                n4 = n14 - n7 * 8 - 9;
                class_1176.lllIIIllIIIIlllIlIIllIIll(n4, n3, 16 + n22 * 9, 27, 9, 9);
                if (bl3) {
                    if (n7 * 2 + 1 < n12) {
                        class_1176.lllIIIllIIIIlllIlIIllIIll(n4, n3, n6 + 54, 27, 9, 9);
                    }
                    if (n7 * 2 + 1 == n12) {
                        class_1176.lllIIIllIIIIlllIlIIllIIll(n4, n3, n6 + 63, 27, 9, 9);
                    }
                }
                if (n7 * 2 + 1 < n11) {
                    class_1176.lllIIIllIIIIlllIlIIllIIll(n4, n3, n6 + 36, 27, 9, 9);
                }
                if (n7 * 2 + 1 != n11) continue;
                class_1176.lllIIIllIIIIlllIlIIllIIll(n4, n3, n6 + 45, 27, 9, 9);
            }
        } else if (class_15212 instanceof class_1965) {
            this.IllIIlllllllIIlIIlIIIIlIl.mcProfiler.endStartSection("mountHealth");
            class_1965 class_19652 = (class_1965)class_15212;
            n3 = (int)Math.ceil(class_19652.lllIIIlllIlllIIlIllllIIlI());
            float f4 = class_19652.IIllllIIlIlIlIlllIIIllIIl();
            n5 = (int)(f4 + 0.5f) / 2;
            if (n5 > 30) {
                n5 = 30;
            }
            n4 = n15;
            int n23 = 0;
            while (n5 > 0) {
                int n24 = Math.min(n5, 10);
                n5 -= n24;
                for (int i = 0; i < n24; ++i) {
                    int n25 = 52;
                    int n26 = 0;
                    if (bl3) {
                        n26 = 1;
                    }
                    int n27 = n14 - i * 8 - 9;
                    class_1176.lllIIIllIIIIlllIlIIllIIll(n27, n4, n25 + n26 * 9, 9, 9, 9);
                    if (i * 2 + 1 + n23 < n3) {
                        class_1176.lllIIIllIIIIlllIlIIllIIll(n27, n4, n25 + 36, 9, 9, 9);
                    }
                    if (i * 2 + 1 + n23 != n3) continue;
                    class_1176.lllIIIllIIIIlllIlIIllIIll(n27, n4, n25 + 45, 9, 9, 9);
                }
                n4 -= 10;
                n23 += 20;
            }
        }
        this.IllIIlllllllIIlIIlIIIIlIl.mcProfiler.endStartSection("air");
        if (this.IllIIlllllllIIlIIlIIIIlIl.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(class_1855.IllIIlllllllIIlIIlIIIIlIl)) {
            n7 = this.IllIIlllllllIIlIIlIIIIlIl.lIIIIlIlIIlllllIIllIIlIII.lIlIllIIllIIIIlllIlIlllIl();
            n3 = MathHelper.lIllllIIlIIIlIllllllIIIll((double)(n7 - 2) * 10.0 / 300.0);
            n6 = MathHelper.lIllllIIlIIIlIllllllIIIll((double)n7 * 10.0 / 300.0) - n3;
            for (n5 = 0; n5 < n3 + n6; ++n5) {
                if (n5 < n3) {
                    class_1176.lllIIIllIIIIlllIlIIllIIll(n14 - n5 * 8 - 9, n18, 16, 18, 9, 9);
                    continue;
                }
                class_1176.lllIIIllIIIIlllIlIIllIIll(n14 - n5 * 8 - 9, n18, 25, 18, 9, 9);
            }
        }
        this.IllIIlllllllIIlIIlIIIIlIl.mcProfiler.endSection();
    }

    private void lIlllIlllIIIIlIIlllIllIII() {
        if (class_0178.IlIllllllIIlIIllllIIlIIIl != null && class_0178.lllIlIIlIIIlIlIIIllIlllIl > 0) {
            this.IllIIlllllllIIlIIlIIIIlIl.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(lllIIlIIIllllllIIIIlIlIlI);
        }
    }

    private void lllIlIIlIIIlIlIIIllIlllIl(int n, int n2) {
        GL11.glDisable((int)2929);
        GL11.glDepthMask((boolean)false);
        OpenGlHelper.glBlendFunc(770, 771, 1, 0);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glDisable((int)3008);
        this.IllIIlllllllIIlIIlIIIIlIl.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(IlIIIIIllllllIIlllIllllll);
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        class_08682.lllIlIIlIIIlIlIIIllIlllIl();
        class_08682.lllIIIllIIIIlllIlIIllIIll(0.0, n2, -90.0, 0.0, 1.0);
        class_08682.lllIIIllIIIIlllIlIIllIIll(n, n2, -90.0, 1.0, 1.0);
        class_08682.lllIIIllIIIIlllIlIIllIIll(n, 0.0, -90.0, 1.0, 0.0);
        class_08682.lllIIIllIIIIlllIlIIllIIll(0.0, 0.0, -90.0, 0.0, 0.0);
        class_08682.lllIIIllIIIIlllIlIIllIIll();
        GL11.glDepthMask((boolean)true);
        GL11.glEnable((int)2929);
        GL11.glEnable((int)3008);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }

    private void lllIIIllIIIIlllIlIIllIIll(float f, int n, int n2) {
        if ((f = 1.0f - f) < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        this.lllIIIllIIIIlllIlIIllIIll = (float)((double)this.lllIIIllIIIIlllIlIIllIIll + (double)(f - this.lllIIIllIIIIlllIlIIllIIll) * 0.01);
        GL11.glDisable((int)2929);
        GL11.glDepthMask((boolean)false);
        OpenGlHelper.glBlendFunc(0, 769, 1, 0);
        GL11.glColor4f((float)this.lllIIIllIIIIlllIlIIllIIll, (float)this.lllIIIllIIIIlllIlIIllIIll, (float)this.lllIIIllIIIIlllIlIIllIIll, (float)1.0f);
        this.IllIIlllllllIIlIIlIIIIlIl.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(IlIllllllIIlIIllllIIlIIIl);
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        class_08682.lllIlIIlIIIlIlIIIllIlllIl();
        class_08682.lllIIIllIIIIlllIlIIllIIll(0.0, n2, -90.0, 0.0, 1.0);
        class_08682.lllIIIllIIIIlllIlIIllIIll(n, n2, -90.0, 1.0, 1.0);
        class_08682.lllIIIllIIIIlllIlIIllIIll(n, 0.0, -90.0, 1.0, 0.0);
        class_08682.lllIIIllIIIIlllIlIIllIIll(0.0, 0.0, -90.0, 0.0, 0.0);
        class_08682.lllIIIllIIIIlllIlIIllIIll();
        GL11.glDepthMask((boolean)true);
        GL11.glEnable((int)2929);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        OpenGlHelper.glBlendFunc(770, 771, 1, 0);
    }

    private void lllIlIIlIIIlIlIIIllIlllIl(float f, int n, int n2) {
        if (f < 1.0f) {
            f *= f;
            f *= f;
            f = f * 0.8f + 0.2f;
        }
        GL11.glDisable((int)3008);
        GL11.glDisable((int)2929);
        GL11.glDepthMask((boolean)false);
        OpenGlHelper.glBlendFunc(770, 771, 1, 0);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)f);
        IIcon class_21022 = Blocks.IIIIIIlIIIIIIIIIIlIlIlIlI.lIlllIlllIIIIlIIlllIllIII(1);
        this.IllIIlllllllIIlIIlIIIIlIl.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(class_1511.lllIIIllIIIIlllIlIIllIIll);
        float f2 = class_21022.IlIllllllIIlIIllllIIlIIIl();
        float f3 = class_21022.IlIIIIIllllllIIlllIllllll();
        float f4 = class_21022.lIlllIlllIIIIlIIlllIllIII();
        float f5 = class_21022.lIllllIIlIIIlIllllllIIIll();
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        class_08682.lllIlIIlIIIlIlIIIllIlllIl();
        class_08682.lllIIIllIIIIlllIlIIllIIll(0.0, n2, -90.0, f2, f5);
        class_08682.lllIIIllIIIIlllIlIIllIIll(n, n2, -90.0, f4, f5);
        class_08682.lllIIIllIIIIlllIlIIllIIll(n, 0.0, -90.0, f4, f3);
        class_08682.lllIIIllIIIIlllIlIIllIIll(0.0, 0.0, -90.0, f2, f3);
        class_08682.lllIIIllIIIIlllIlIIllIIll();
        GL11.glDepthMask((boolean)true);
        GL11.glEnable((int)2929);
        GL11.glEnable((int)3008);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }

    private void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, float f) {
        ItemStack class_08972 = this.IllIIlllllllIIlIIlIIIIlIl.lIIIIlIlIIlllllIIllIIlIII.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll[n];
        if (class_08972 != null) {
            float f2 = (float)class_08972.IlIllllllIIlIIllllIIlIIIl - f;
            if (f2 > 0.0f) {
                GL11.glPushMatrix();
                float f3 = 1.0f + f2 / 5.0f;
                GL11.glTranslatef((float)(n2 + 8), (float)(n3 + 12), (float)0.0f);
                GL11.glScalef((float)(1.0f / f3), (float)((f3 + 1.0f) / 2.0f), (float)1.0f);
                GL11.glTranslatef((float)(-(n2 + 8)), (float)(-(n3 + 12)), (float)0.0f);
            }
            lIllllIIlIIIlIllllllIIIll.lllIlIIlIIIlIlIIIllIlllIl(this.IllIIlllllllIIlIIlIIIIlIl.IlIlllIIIIIIlIIllIIllIlll, this.IllIIlllllllIIlIIlIIIIlIl.llIIlIIllIIllIlIIllIIllII(), class_08972, n2, n3);
            if (f2 > 0.0f) {
                GL11.glPopMatrix();
            }
            lIllllIIlIIIlIllllllIIIll.IlIllllllIIlIIllllIIlIIIl(this.IllIIlllllllIIlIIlIIIIlIl.IlIlllIIIIIIlIIllIIllIlll, this.IllIIlllllllIIlIIlIIIIlIl.llIIlIIllIIllIlIIllIIllII(), class_08972, n2, n3);
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll() {
        if (this.IlIlIIlIlIllIIlIlIIllIIIl > 0) {
            --this.IlIlIIlIlIllIIlIlIIllIIIl;
        }
        ++this.IllIIIllIIIIlIlIlIllIIlll;
        if (this.IllIIlllllllIIlIIlIIIIlIl.lIIIIlIlIIlllllIIllIIlIII != null) {
            ItemStack class_08972 = this.IllIIlllllllIIlIIlIIIIlIl.lIIIIlIlIIlllllIIllIIlIII.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll();
            if (class_08972 == null) {
                this.IlIlIIlllIIlIllIIIlllllIl = 0;
            } else if (this.lIIlIIIIIlIlllIlIIlIlIlll != null && class_08972.lllIIIllIIIIlllIlIIllIIll() == this.lIIlIIIIIlIlllIlIIlIlIlll.lllIIIllIIIIlllIlIIllIIll() && ItemStack.lllIIIllIIIIlllIlIIllIIll(class_08972, this.lIIlIIIIIlIlllIlIIlIlIlll) && (class_08972.lIllllIIlIIIlIllllllIIIll() || class_08972.IllIIIllIIIIlIlIlIllIIlll() == this.lIIlIIIIIlIlllIlIIlIlIlll.IllIIIllIIIIlIlIlIllIIlll())) {
                if (this.IlIlIIlllIIlIllIIIlllllIl > 0) {
                    --this.IlIlIIlllIIlIllIIIlllllIl;
                }
            } else {
                this.IlIlIIlllIIlIllIIIlllllIl = 40;
            }
            this.lIIlIIIIIlIlllIlIIlIlIlll = class_08972;
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(String string) {
        this.lllIIIllIIIIlllIlIIllIIll(class_0616.lllIIIllIIIIlllIlIIllIIll("record.nowPlaying", string), true);
    }

    public void lllIIIllIIIIlllIlIIllIIll(String string, boolean bl) {
        this.lIIIIlIlIIlllllIIllIIlIII = string;
        this.IlIlIIlIlIllIIlIlIIllIIIl = 60;
        this.lllllIlllIIllIlIIlIIIllII = bl;
    }

    public class_1063 lllIlIIlIIIlIlIIIllIlllIl() {
        return this.IIIllIllIIlIlIlIlIllllIIl;
    }

    public int IlIllllllIIlIIllllIIlIIIl() {
        return this.IllIIIllIIIIlIlIlIllIIlll;
    }
}

