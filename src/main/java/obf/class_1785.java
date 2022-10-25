package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.util.Random;

import net.minecraft.util.ResourceLocation;
import com.moonsworth.lunar.client.LunarClient;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.crash.CrashReport;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.client.renderer.OpenGlHelper;
import org.lwjgl.opengl.GL11;

public class class_1785
extends class_1603 {
    private static final ResourceLocation IllIIlllllllIIlIIlIIIIlIl = new ResourceLocation("textures/misc/enchanted_item_glint.png");
    private class_1333 IIIllIllIIlIlIlIlIllllIIl = new class_1333();
    private Random IllIIIllIIIIlIlIlIllIIlll = new Random();
    public boolean lllIIIllIIIIlllIlIIllIIll = true;
    public float lIllllIIlIIIlIllllllIIIll;
    public static boolean IIIllIIlIIIIIIlIlIIllIIlI;

    public class_1785() {
        this.lIlllIlllIIIIlIIlllIllIII = 0.15f;
        this.IlIIIIIllllllIIlllIllllll = 0.75f;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1781 class_17812, double d, double d2, double d3, float f, float f2) {
        ItemStack class_08972 = class_17812.lIlllIlllIIIIlIIlllIllIII();
        if (class_08972.lllIIIllIIIIlllIlIIllIIll() != null) {
            this.lllIlIIlIIIlIlIIIllIlllIl(class_17812);
            class_0231.lllIIIllIIIIlllIlIIllIIll(false, false, 1.0f);
            this.IllIIIllIIIIlIlIlIllIIlll.setSeed(187L);
            GL11.glPushMatrix();
            float f3 = MathHelper.lllIIIllIIIIlllIlIIllIIll(((float)class_17812.lllIIIllIIIIlllIlIIllIIll + f2) / 10.0f + class_17812.IlIllllllIIlIIllllIIlIIIl) * 0.1f + 0.1f;
            float f4 = (((float)class_17812.lllIIIllIIIIlllIlIIllIIll + f2) / 20.0f + class_17812.IlIllllllIIlIIllllIIlIIIl) * 57.295776f;
            int n = 1;
            if (class_17812.lIlllIlllIIIIlIIlllIllIII().lllIlIIlIIIlIlIIIllIlllIl > 1) {
                n = 2;
            }
            if (class_17812.lIlllIlllIIIIlIIlllIllIII().lllIlIIlIIIlIlIIIllIlllIl > 5) {
                n = 3;
            }
            if (class_17812.lIlllIlllIIIIlIIlllIllIII().lllIlIIlIIIlIlIIIllIlllIl > 20) {
                n = 4;
            }
            if (class_17812.lIlllIlllIIIIlIIlllIllIII().lllIlIIlIIIlIlIIIllIlllIl > 40) {
                n = 5;
            }
            GL11.glTranslatef((float)((float)d), (float)((float)d2 + f3), (float)((float)d3));
            GL11.glEnable((int)32826);
            if (class_08972.IlIllllllIIlIIllllIIlIIIl() == 0 && class_08972.lllIIIllIIIIlllIlIIllIIll() instanceof class_1272 && class_1333.lllIIIllIIIIlllIlIIllIIll(Block.lllIIIllIIIIlllIlIIllIIll(class_08972.lllIIIllIIIIlllIlIIllIIll()).lIIIIlIlIIlllllIIllIIlIII())) {
                Block class_05492 = Block.lllIIIllIIIIlllIlIIllIIll(class_08972.lllIIIllIIIIlllIlIIllIIll());
                GL11.glRotatef((float)f4, (float)0.0f, (float)1.0f, (float)0.0f);
                if (IIIllIIlIIIIIIlIlIIllIIlI) {
                    GL11.glScalef((float)1.25f, (float)1.25f, (float)1.25f);
                    GL11.glTranslatef((float)0.0f, (float)0.05f, (float)0.0f);
                    GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                }
                float f5 = 0.25f;
                int n2 = class_05492.lIIIIlIlIIlllllIIllIIlIII();
                if (n2 == 1 || n2 == 19 || n2 == 12 || n2 == 2) {
                    f5 = 0.5f;
                }
                if (class_05492.lllllIlllIIllIlIIlIIIllII() > 0) {
                    GL11.glAlphaFunc((int)516, (float)0.1f);
                    GL11.glEnable((int)3042);
                    OpenGlHelper.glBlendFunc(770, 771, 1, 0);
                }
                GL11.glScalef((float)f5, (float)f5, (float)f5);
                for (int i = 0; i < n; ++i) {
                    GL11.glPushMatrix();
                    if (i > 0) {
                        float f6 = (this.IllIIIllIIIIlIlIlIllIIlll.nextFloat() * 2.0f - 1.0f) * 0.2f / f5;
                        float f7 = (this.IllIIIllIIIIlIlIlIllIIlll.nextFloat() * 2.0f - 1.0f) * 0.2f / f5;
                        float f8 = (this.IllIIIllIIIIlIlIlIllIIlll.nextFloat() * 2.0f - 1.0f) * 0.2f / f5;
                        GL11.glTranslatef((float)f6, (float)f7, (float)f8);
                    }
                    this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(class_05492, class_08972.IllIIIllIIIIlIlIlIllIIlll(), 1.0f);
                    GL11.glPopMatrix();
                }
                if (class_05492.lllllIlllIIllIlIIlIIIllII() > 0) {
                    GL11.glDisable((int)3042);
                }
            } else if (class_08972.IlIllllllIIlIIllllIIlIIIl() == 1 && class_08972.lllIIIllIIIIlllIlIIllIIll().IlIlIIlIlIllIIlIlIIllIIIl()) {
                if (IIIllIIlIIIIIIlIlIIllIIlI) {
                    GL11.glScalef((float)0.5128205f, (float)0.5128205f, (float)0.5128205f);
                    GL11.glTranslatef((float)0.0f, (float)-0.05f, (float)0.0f);
                } else {
                    GL11.glScalef((float)0.5f, (float)0.5f, (float)0.5f);
                }
                for (int i = 0; i <= 1; ++i) {
                    this.IllIIIllIIIIlIlIlIllIIlll.setSeed(187L);
                    IIcon class_21022 = class_08972.lllIIIllIIIIlllIlIIllIIll().lllIIIllIIIIlllIlIIllIIll(class_08972.IllIIIllIIIIlIlIlIllIIlll(), i);
                    if (this.lllIIIllIIIIlllIlIIllIIll) {
                        int n3 = class_08972.lllIIIllIIIIlllIlIIllIIll().lllIIIllIIIIlllIlIIllIIll(class_08972, i);
                        float f9 = (float)(n3 >> 16 & 0xFF) / 255.0f;
                        float f10 = (float)(n3 >> 8 & 0xFF) / 255.0f;
                        float f11 = (float)(n3 & 0xFF) / 255.0f;
                        GL11.glColor4f((float)f9, (float)f10, (float)f11, (float)1.0f);
                        this.lllIIIllIIIIlllIlIIllIIll(class_17812, class_21022, n, f2, f9, f10, f11);
                        continue;
                    }
                    this.lllIIIllIIIIlllIlIIllIIll(class_17812, class_21022, n, f2, 1.0f, 1.0f, 1.0f);
                }
            } else {
                if (class_08972 != null && class_08972.lllIIIllIIIIlllIlIIllIIll() instanceof class_2266) {
                    GL11.glAlphaFunc((int)516, (float)0.1f);
                    GL11.glEnable((int)3042);
                    OpenGlHelper.glBlendFunc(770, 771, 1, 0);
                }
                if (IIIllIIlIIIIIIlIlIIllIIlI) {
                    GL11.glScalef((float)0.5128205f, (float)0.5128205f, (float)0.5128205f);
                    GL11.glTranslatef((float)0.0f, (float)-0.05f, (float)0.0f);
                } else {
                    GL11.glScalef((float)0.5f, (float)0.5f, (float)0.5f);
                }
                IIcon class_21023 = class_08972.lllIlIIlIIIlIlIIIllIlllIl();
                if (this.lllIIIllIIIIlllIlIIllIIll) {
                    int n4 = class_08972.lllIIIllIIIIlllIlIIllIIll().lllIIIllIIIIlllIlIIllIIll(class_08972, 0);
                    float f12 = (float)(n4 >> 16 & 0xFF) / 255.0f;
                    float f13 = (float)(n4 >> 8 & 0xFF) / 255.0f;
                    float f14 = (float)(n4 & 0xFF) / 255.0f;
                    this.lllIIIllIIIIlllIlIIllIIll(class_17812, class_21023, n, f2, f12, f13, f14);
                } else {
                    this.lllIIIllIIIIlllIlIIllIIll(class_17812, class_21023, n, f2, 1.0f, 1.0f, 1.0f);
                }
                if (class_08972 != null && class_08972.lllIIIllIIIIlllIlIIllIIll() instanceof class_2266) {
                    GL11.glDisable((int)3042);
                }
            }
            GL11.glDisable((int)32826);
            GL11.glPopMatrix();
            this.lllIlIIlIIIlIlIIIllIlllIl(class_17812);
            class_0231.lllIlIIlIIIlIlIIIllIlllIl();
        }
    }

    protected ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_1781 class_17812) {
        return this.lllIlIIlIIIlIlIIIllIlllIl.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(class_17812.lIlllIlllIIIIlIIlllIllIII().IlIllllllIIlIIllllIIlIIIl());
    }

    private void lllIIIllIIIIlllIlIIllIIll(class_1781 class_17812, IIcon class_21022, int n, float f, float f2, float f3, float f4) {
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        if (class_21022 == null) {
            class_1682 class_16822 = Minecraft.getMinecraft().llIIlIIllIIllIlIIllIIllII();
            ResourceLocation class_17732 = class_16822.lllIIIllIIIIlllIlIIllIIll(class_17812.lIlllIlllIIIIlIIlllIllIII().IlIllllllIIlIIllllIIlIIIl());
            class_21022 = ((class_1511)class_16822.lllIlIIlIIIlIlIIIllIlllIl(class_17732)).lllIlIIlIIIlIlIIIllIlllIl("missingno");
        }
        float f5 = class_21022.IlIllllllIIlIIllllIIlIIIl();
        float f6 = class_21022.lIlllIlllIIIIlIIlllIllIII();
        float f7 = class_21022.IlIIIIIllllllIIlllIllllll();
        float f8 = class_21022.lIllllIIlIIIlIllllllIIIll();
        float f9 = 1.0f;
        float f10 = 0.5f;
        float f11 = 0.25f;
        if (this.lllIlIIlIIIlIlIIIllIlllIl.llIIlllIllIllllIIIlIIIIII.IIIllIllIIlIlIlIlIllllIIl) {
            GL11.glPushMatrix();
            if (IIIllIIlIIIIIIlIlIIllIIlI) {
                GL11.glRotatef((float)180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            } else {
                GL11.glRotatef((float)((((float)class_17812.lllIIIllIIIIlllIlIIllIIll + f) / 20.0f + class_17812.IlIllllllIIlIIllllIIlIIIl) * 57.295776f), (float)0.0f, (float)1.0f, (float)0.0f);
            }
            float f12 = 0.0625f;
            float f13 = 0.021875f;
            ItemStack class_08972 = class_17812.lIlllIlllIIIIlIIlllIllIII();
            int n2 = class_08972.lllIlIIlIIIlIlIIIllIlllIl;
            int n3 = n2 < 2 ? 1 : (n2 < 16 ? 2 : (n2 < 32 ? 3 : 4));
            GL11.glTranslatef((float)(-f10), (float)(-f11), (float)(-((f12 + f13) * (float)n3 / 2.0f)));
            for (int i = 0; i < n3; ++i) {
                GL11.glTranslatef((float)0.0f, (float)0.0f, (float)(f12 + f13));
                if (class_08972.IlIllllllIIlIIllllIIlIIIl() == 0) {
                    this.lllIIIllIIIIlllIlIIllIIll(class_1511.lllIIIllIIIIlllIlIIllIIll);
                } else {
                    this.lllIIIllIIIIlllIlIIllIIll(class_1511.lllIlIIlIIIlIlIIIllIlllIl);
                }
                GL11.glColor4f((float)f2, (float)f3, (float)f4, (float)1.0f);
                class_2059.lllIIIllIIIIlllIlIIllIIll(class_08682, f6, f7, f5, f8, class_21022.lllIIIllIIIIlllIlIIllIIll(), class_21022.lllIlIIlIIIlIlIIIllIlllIl(), f12);
                if (!class_08972.IIlllIlIlllIllIIIlllIIlIl()) continue;
                GL11.glDepthFunc((int)514);
                GL11.glDisable((int)2896);
                this.lllIlIIlIIIlIlIIIllIlllIl.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(IllIIlllllllIIlIIlIIIIlIl);
                GL11.glEnable((int)3042);
                GL11.glBlendFunc((int)768, (int)1);
                float f14 = 0.76f;
                GL11.glColor4f((float)(0.5f * f14), (float)(0.25f * f14), (float)(0.8f * f14), (float)1.0f);
                GL11.glMatrixMode((int)5890);
                GL11.glPushMatrix();
                float f15 = 0.125f;
                GL11.glScalef((float)f15, (float)f15, (float)f15);
                float f16 = (float)(Minecraft.getSystemTime() % 3000L) / 3000.0f * 8.0f;
                GL11.glTranslatef((float)f16, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                class_2059.lllIIIllIIIIlllIlIIllIIll(class_08682, 0.0f, 0.0f, 1.0f, 1.0f, 255, 255, f12);
                GL11.glPopMatrix();
                GL11.glPushMatrix();
                GL11.glScalef((float)f15, (float)f15, (float)f15);
                f16 = (float)(Minecraft.getSystemTime() % 4873L) / 4873.0f * 8.0f;
                GL11.glTranslatef((float)(-f16), (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                class_2059.lllIIIllIIIIlllIlIIllIIll(class_08682, 0.0f, 0.0f, 1.0f, 1.0f, 255, 255, f12);
                GL11.glPopMatrix();
                GL11.glMatrixMode((int)5888);
                GL11.glDisable((int)3042);
                GL11.glEnable((int)2896);
                GL11.glDepthFunc((int)515);
            }
            GL11.glPopMatrix();
        } else {
            for (int i = 0; i < n; ++i) {
                GL11.glPushMatrix();
                if (i > 0) {
                    float f17 = (this.IllIIIllIIIIlIlIlIllIIlll.nextFloat() * 2.0f - 1.0f) * 0.3f;
                    float f18 = (this.IllIIIllIIIIlIlIlIllIIlll.nextFloat() * 2.0f - 1.0f) * 0.3f;
                    float f19 = (this.IllIIIllIIIIlIlIlIllIIlll.nextFloat() * 2.0f - 1.0f) * 0.3f;
                    GL11.glTranslatef((float)f17, (float)f18, (float)f19);
                }
                if (!IIIllIIlIIIIIIlIlIIllIIlI) {
                    GL11.glRotatef((float)(180.0f - this.lllIlIIlIIIlIlIIIllIlllIl.IllIIIllIIIIlIlIlIllIIlll), (float)0.0f, (float)1.0f, (float)0.0f);
                }
                GL11.glColor4f((float)f2, (float)f3, (float)f4, (float)1.0f);
                class_08682.lllIlIIlIIIlIlIIIllIlllIl();
                class_08682.IlIllllllIIlIIllllIIlIIIl(0.0f, 1.0f, 0.0f);
                class_08682.lllIIIllIIIIlllIlIIllIIll(0.0f - f10, 0.0f - f11, 0.0, f5, f8);
                class_08682.lllIIIllIIIIlllIlIIllIIll(f9 - f10, 0.0f - f11, 0.0, f6, f8);
                class_08682.lllIIIllIIIIlllIlIIllIIll(f9 - f10, 1.0f - f11, 0.0, f6, f7);
                class_08682.lllIIIllIIIIlllIlIIllIIll(0.0f - f10, 1.0f - f11, 0.0, f5, f7);
                class_08682.lllIIIllIIIIlllIlIIllIIll();
                GL11.glPopMatrix();
            }
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1854 class_18542, class_1682 class_16822, ItemStack class_08972, int n, int n2) {
        int n3 = class_08972.IllIIIllIIIIlIlIlIllIIlll();
        IIcon class_21022 = class_08972.lllIlIIlIIIlIlIIIllIlllIl();
        if (class_08972.IlIllllllIIlIIllllIIlIIIl() == 0 && class_1333.lllIIIllIIIIlllIlIIllIIll(Block.lllIIIllIIIIlllIlIIllIIll(class_08972.lllIIIllIIIIlllIlIIllIIll()).lIIIIlIlIIlllllIIllIIlIII())) {
            class_16822.lllIIIllIIIIlllIlIIllIIll(class_1511.lllIIIllIIIIlllIlIIllIIll);
            Block class_05492 = Block.lllIIIllIIIIlllIlIIllIIll(class_08972.lllIIIllIIIIlllIlIIllIIll());
            GL11.glEnable((int)3008);
            if (class_05492.lllllIlllIIllIlIIlIIIllII() != 0) {
                GL11.glAlphaFunc((int)516, (float)0.1f);
                GL11.glEnable((int)3042);
                OpenGlHelper.glBlendFunc(770, 771, 1, 0);
            } else {
                GL11.glAlphaFunc((int)516, (float)0.5f);
                GL11.glDisable((int)3042);
            }
            GL11.glPushMatrix();
            GL11.glTranslatef((float)(n - 2), (float)(n2 + 3), (float)(-3.0f + this.lIllllIIlIIIlIllllllIIIll));
            GL11.glScalef((float)10.0f, (float)10.0f, (float)10.0f);
            GL11.glTranslatef((float)1.0f, (float)0.5f, (float)1.0f);
            GL11.glScalef((float)1.0f, (float)1.0f, (float)-1.0f);
            GL11.glRotatef((float)210.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            int n4 = class_08972.lllIIIllIIIIlllIlIIllIIll().lllIIIllIIIIlllIlIIllIIll(class_08972, 0);
            float f = (float)(n4 >> 16 & 0xFF) / 255.0f;
            float f2 = (float)(n4 >> 8 & 0xFF) / 255.0f;
            float f3 = (float)(n4 & 0xFF) / 255.0f;
            if (this.lllIIIllIIIIlllIlIIllIIll) {
                GL11.glColor4f((float)f, (float)f2, (float)f3, (float)1.0f);
            }
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            this.IIIllIllIIlIlIlIlIllllIIl.IllIIlllllllIIlIIlIIIIlIl = this.lllIIIllIIIIlllIlIIllIIll;
            this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(class_05492, n3, 1.0f);
            this.IIIllIllIIlIlIlIlIllllIIl.IllIIlllllllIIlIIlIIIIlIl = true;
            if (class_05492.lllllIlllIIllIlIIlIIIllII() == 0) {
                GL11.glAlphaFunc((int)516, (float)0.1f);
            }
            GL11.glPopMatrix();
        } else if (class_08972.lllIIIllIIIIlllIlIIllIIll().IlIlIIlIlIllIIlIlIIllIIIl()) {
            GL11.glDisable((int)2896);
            GL11.glEnable((int)3008);
            class_16822.lllIIIllIIIIlllIlIIllIIll(class_1511.lllIlIIlIIIlIlIIIllIlllIl);
            GL11.glDisable((int)3008);
            GL11.glDisable((int)3553);
            GL11.glEnable((int)3042);
            OpenGlHelper.glBlendFunc(0, 0, 0, 0);
            GL11.glColorMask((boolean)false, (boolean)false, (boolean)false, (boolean)true);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
            class_08682.lllIlIIlIIIlIlIIIllIlllIl();
            class_08682.IlIllllllIIlIIllllIIlIIIl(-1);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)(n - 2), (double)(n2 + 18), (double)this.lIllllIIlIIIlIllllllIIIll);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)(n + 18), (double)(n2 + 18), (double)this.lIllllIIlIIIlIllllllIIIll);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)(n + 18), (double)(n2 - 2), (double)this.lIllllIIlIIIlIllllllIIIll);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)(n - 2), (double)(n2 - 2), (double)this.lIllllIIlIIIlIllllllIIIll);
            class_08682.lllIIIllIIIIlllIlIIllIIll();
            GL11.glColorMask((boolean)true, (boolean)true, (boolean)true, (boolean)true);
            GL11.glEnable((int)3553);
            GL11.glEnable((int)3008);
            OpenGlHelper.glBlendFunc(770, 771, 1, 0);
            for (int i = 0; i <= 1; ++i) {
                IIcon class_21023 = class_08972.lllIIIllIIIIlllIlIIllIIll().lllIIIllIIIIlllIlIIllIIll(n3, i);
                int n5 = class_08972.lllIIIllIIIIlllIlIIllIIll().lllIIIllIIIIlllIlIIllIIll(class_08972, i);
                float f = (float)(n5 >> 16 & 0xFF) / 255.0f;
                float f4 = (float)(n5 >> 8 & 0xFF) / 255.0f;
                float f5 = (float)(n5 & 0xFF) / 255.0f;
                if (this.lllIIIllIIIIlllIlIIllIIll) {
                    GL11.glColor4f((float)f, (float)f4, (float)f5, (float)1.0f);
                }
                this.lllIIIllIIIIlllIlIIllIIll(n, n2, class_21023, 16, 16);
            }
            GL11.glEnable((int)2896);
        } else {
            GL11.glDisable((int)2896);
            GL11.glEnable((int)3042);
            OpenGlHelper.glBlendFunc(770, 771, 1, 0);
            ResourceLocation class_17732 = class_16822.lllIIIllIIIIlllIlIIllIIll(class_08972.IlIllllllIIlIIllllIIlIIIl());
            class_16822.lllIIIllIIIIlllIlIIllIIll(class_17732);
            if (class_21022 == null) {
                class_21022 = ((class_1511) Minecraft.getMinecraft().llIIlIIllIIllIlIIllIIllII().lllIlIIlIIIlIlIIIllIlllIl(class_17732)).lllIlIIlIIIlIlIIIllIlllIl("missingno");
            }
            int n6 = class_08972.lllIIIllIIIIlllIlIIllIIll().lllIIIllIIIIlllIlIIllIIll(class_08972, 0);
            float f = (float)(n6 >> 16 & 0xFF) / 255.0f;
            float f6 = (float)(n6 >> 8 & 0xFF) / 255.0f;
            float f7 = (float)(n6 & 0xFF) / 255.0f;
            if (this.lllIIIllIIIIlllIlIIllIIll) {
                GL11.glColor4f((float)f, (float)f6, (float)f7, (float)1.0f);
            }
            this.lllIIIllIIIIlllIlIIllIIll(n, n2, class_21022, 16, 16);
            GL11.glEnable((int)2896);
            GL11.glDisable((int)3042);
        }
        GL11.glEnable((int)2884);
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(class_1854 class_18542, class_1682 class_16822, ItemStack class_08972, int n, int n2) {
        if (class_08972 != null) {
            this.lIllllIIlIIIlIllllllIIIll += 50.0f;
            try {
                this.lllIIIllIIIIlllIlIIllIIll(class_18542, class_16822, class_08972, n, n2);
            }
            catch (Throwable throwable) {
                CrashReport class_02232 = CrashReport.lllIIIllIIIIlllIlIIllIIll(throwable, "Rendering item");
                class_0799 class_07992 = class_02232.lllIIIllIIIIlllIlIIllIIll("Item being rendered");
                class_07992.addCrashSectionCallable("Item Type", new class_1237(this, class_08972));
                class_07992.addCrashSectionCallable("Item Aux", new class_1734(this, class_08972));
                class_07992.addCrashSectionCallable("Item NBT", new class_0486(this, class_08972));
                class_07992.addCrashSectionCallable("Item Foil", new class_1423(this, class_08972));
                throw new class_0892(class_02232);
            }
            if (class_08972.IIlllIlIlllIllIIIlllIIlIl() && LunarClient.getInstance().getSettingsManager().lllIIIllIIIIlllIlIIllIIll()) {
                GL11.glDepthFunc((int)514);
                GL11.glDisable((int)2896);
                GL11.glDepthMask((boolean)false);
                class_16822.lllIIIllIIIIlllIlIIllIIll(IllIIlllllllIIlIIlIIIIlIl);
                GL11.glEnable((int)3008);
                GL11.glEnable((int)3042);
                GL11.glColor4f((float)0.5f, (float)0.25f, (float)0.8f, (float)1.0f);
                this.lllIIIllIIIIlllIlIIllIIll(n * 431278612 + n2 * 32178161, n - 2, n2 - 2, 20, 20);
                OpenGlHelper.glBlendFunc(770, 771, 1, 0);
                GL11.glDepthMask((boolean)true);
                GL11.glEnable((int)2896);
                GL11.glDepthFunc((int)515);
            }
            this.lIllllIIlIIIlIllllllIIIll -= 50.0f;
        }
    }

    private void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4, int n5) {
        for (int i = 0; i < 2; ++i) {
            OpenGlHelper.glBlendFunc((Boolean) LunarClient.getInstance().getSettingsManager().rsShinyPots.getValue() != false ? 773 : 772, 1, 0, 0);
            float f = 0.00390625f;
            float f2 = 0.00390625f;
            float f3 = (float)(Minecraft.getSystemTime() % (long)(3000 + i * 1873)) / (3000.0f + (float)(i * 1873)) * 256.0f;
            float f4 = 0.0f;
            class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
            float f5 = 4.0f;
            if (i == 1) {
                f5 = -1.0f;
            }
            class_08682.lllIlIIlIIIlIlIIIllIlllIl();
            class_08682.lllIIIllIIIIlllIlIIllIIll(n2 + 0, n3 + n5, this.lIllllIIlIIIlIllllllIIIll, (f3 + (float)n5 * f5) * f, (f4 + (float)n5) * f2);
            class_08682.lllIIIllIIIIlllIlIIllIIll(n2 + n4, n3 + n5, this.lIllllIIlIIIlIllllllIIIll, (f3 + (float)n4 + (float)n5 * f5) * f, (f4 + (float)n5) * f2);
            class_08682.lllIIIllIIIIlllIlIIllIIll(n2 + n4, n3 + 0, this.lIllllIIlIIIlIllllllIIIll, (f3 + (float)n4) * f, (f4 + 0.0f) * f2);
            class_08682.lllIIIllIIIIlllIlIIllIIll(n2 + 0, n3 + 0, this.lIllllIIlIIIlIllllllIIIll, (f3 + 0.0f) * f, (f4 + 0.0f) * f2);
            class_08682.lllIIIllIIIIlllIlIIllIIll();
        }
    }

    public void IlIllllllIIlIIllllIIlIIIl(class_1854 class_18542, class_1682 class_16822, ItemStack class_08972, int n, int n2) {
        this.lllIIIllIIIIlllIlIIllIIll(class_18542, class_16822, class_08972, n, n2, null);
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1854 class_18542, class_1682 class_16822, ItemStack class_08972, int n, int n2, String string) {
        if (class_08972 != null) {
            if (class_08972.lllIlIIlIIIlIlIIIllIlllIl > 1 || string != null) {
                String string2 = string == null ? String.valueOf(class_08972.lllIlIIlIIIlIlIIIllIlllIl) : string;
                GL11.glDisable((int)2896);
                GL11.glDisable((int)2929);
                GL11.glDisable((int)3042);
                class_18542.lllIIIllIIIIlllIlIIllIIll(string2, (float)(n + 19 - 2 - class_18542.lllIIIllIIIIlllIlIIllIIll(string2)), (float)(n2 + 6 + 3), 0xFFFFFF);
                GL11.glEnable((int)2896);
                GL11.glEnable((int)2929);
            }
            if (class_08972.IllIIlllllllIIlIIlIIIIlIl()) {
                int n3 = (int)Math.round(13.0 - (double)class_08972.IIIllIllIIlIlIlIlIllllIIl() * 13.0 / (double)class_08972.lIIIIlIlIIlllllIIllIIlIII());
                int n4 = (int)Math.round(255.0 - (double)class_08972.IIIllIllIIlIlIlIlIllllIIl() * 255.0 / (double)class_08972.lIIIIlIlIIlllllIIllIIlIII());
                GL11.glDisable((int)2896);
                GL11.glDisable((int)2929);
                GL11.glDisable((int)3553);
                GL11.glDisable((int)3008);
                GL11.glDisable((int)3042);
                class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
                int n5 = 255 - n4 << 16 | n4 << 8;
                int n6 = (255 - n4) / 4 << 16 | 0x3F00;
                this.lllIIIllIIIIlllIlIIllIIll(class_08682, n + 2, n2 + 13, 13, 2, 0);
                this.lllIIIllIIIIlllIlIIllIIll(class_08682, n + 2, n2 + 13, 12, 1, n6);
                this.lllIIIllIIIIlllIlIIllIIll(class_08682, n + 2, n2 + 13, n3, 1, n5);
                GL11.glEnable((int)3042);
                GL11.glEnable((int)3008);
                GL11.glEnable((int)3553);
                GL11.glEnable((int)2896);
                GL11.glEnable((int)2929);
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            }
        }
    }

    private void lllIIIllIIIIlllIlIIllIIll(class_0868 class_08682, int n, int n2, int n3, int n4, int n5) {
        class_08682.lllIlIIlIIIlIlIIIllIlllIl();
        class_08682.IlIllllllIIlIIllllIIlIIIl(n5);
        class_08682.lllIIIllIIIIlllIlIIllIIll((double)(n + 0), (double)(n2 + 0), 0.0);
        class_08682.lllIIIllIIIIlllIlIIllIIll((double)(n + 0), (double)(n2 + n4), 0.0);
        class_08682.lllIIIllIIIIlllIlIIllIIll((double)(n + n3), (double)(n2 + n4), 0.0);
        class_08682.lllIIIllIIIIlllIlIIllIIll((double)(n + n3), (double)(n2 + 0), 0.0);
        class_08682.lllIIIllIIIIlllIlIIllIIll();
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, IIcon class_21022, int n3, int n4) {
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        class_08682.lllIlIIlIIIlIlIIIllIlllIl();
        class_08682.lllIIIllIIIIlllIlIIllIIll(n + 0, n2 + n4, this.lIllllIIlIIIlIllllllIIIll, class_21022.IlIllllllIIlIIllllIIlIIIl(), class_21022.lIllllIIlIIIlIllllllIIIll());
        class_08682.lllIIIllIIIIlllIlIIllIIll(n + n3, n2 + n4, this.lIllllIIlIIIlIllllllIIIll, class_21022.lIlllIlllIIIIlIIlllIllIII(), class_21022.lIllllIIlIIIlIllllllIIIll());
        class_08682.lllIIIllIIIIlllIlIIllIIll(n + n3, n2 + 0, this.lIllllIIlIIIlIllllllIIIll, class_21022.lIlllIlllIIIIlIIlllIllIII(), class_21022.IlIIIIIllllllIIlllIllllll());
        class_08682.lllIIIllIIIIlllIlIIllIIll(n + 0, n2 + 0, this.lIllllIIlIIIlIllllllIIIll, class_21022.IlIllllllIIlIIllllIIlIIIl(), class_21022.IlIIIIIllllllIIlllIllllll());
        class_08682.lllIIIllIIIIlllIlIIllIIll();
    }

    @Override
    public ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_1781)class_15212);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, double d, double d2, double d3, float f, float f2) {
        this.lllIIIllIIIIlllIlIIllIIll((class_1781)class_15212, d, d2, d3, f, f2);
    }
}

