package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.opengl.GL11
 */
import java.util.List;
import java.util.Random;

import net.minecraft.util.ResourceLocation;
import com.moonsworth.lunar.client.LunarClient;
import net.minecraft.client.Minecraft;
import net.minecraft.util.MathHelper;
import net.minecraft.client.renderer.OpenGlHelper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;

public abstract class class_1518
extends class_1603 {
    private static final Logger lllIIIllIIIIlllIlIIllIIll = LogManager.getLogger();
    private static final ResourceLocation lIllllIIlIIIlIllllllIIIll = new ResourceLocation("textures/misc/enchanted_item_glint.png");
    public class_1382 llIIllIllIlIIlIIllIllllll;
    public class_1382 lllIIlIIIllllllIIIIlIlIlI;

    public class_1518(class_1382 class_13822, float f) {
        this.llIIllIllIlIIlIIllIllllll = class_13822;
        this.lIlllIlllIIIIlIIlllIllIII = f;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1382 class_13822) {
        this.lllIIlIIIllllllIIIIlIlIlI = class_13822;
    }

    private float lllIIIllIIIIlllIlIIllIIll(float f, float f2, float f3) {
        float f4;
        for (f4 = f2 - f; f4 < -180.0f; f4 += 360.0f) {
        }
        while (f4 >= 180.0f) {
            f4 -= 360.0f;
        }
        return f + f3 * f4;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652, double d, double d2, double d3, float f, float f2) {
        GL11.glPushMatrix();
        GL11.glDisable((int)2884);
        this.llIIllIllIlIIlIIllIllllll.lllIIIllIIIIlllIlIIllIIll = this.lIlllIlllIIIIlIIlllIllIII(class_19652, f2);
        if (this.lllIIlIIIllllllIIIIlIlIlI != null) {
            this.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll = this.llIIllIllIlIIlIIllIllllll.lllIIIllIIIIlllIlIIllIIll;
        }
        this.llIIllIllIlIIlIIllIllllll.lllIlIIlIIIlIlIIIllIlllIl = class_19652.lIlIlIIllIIIlllIllIIlIllI();
        if (this.lllIIlIIIllllllIIIIlIlIlI != null) {
            this.lllIIlIIIllllllIIIIlIlIlI.lllIlIIlIIIlIlIIIllIlllIl = this.llIIllIllIlIIlIIllIllllll.lllIlIIlIIIlIlIIIllIlllIl;
        }
        this.llIIllIllIlIIlIIllIllllll.lIlllIlllIIIIlIIlllIllIII = class_19652.g_();
        if (this.lllIIlIIIllllllIIIIlIlIlI != null) {
            this.lllIIlIIIllllllIIIIlIlIlI.lIlllIlllIIIIlIIlllIllIII = this.llIIllIllIlIIlIIllIllllll.lIlllIlllIIIIlIIlllIllIII;
        }
        try {
            float f3;
            int n;
            float f4;
            float f5;
            int n2;
            float f6;
            float f7 = this.lllIIIllIIIIlllIlIIllIIll(class_19652.lIIllIlIllIlIlIIlIlIIIIll, class_19652.lllllIllllIIIIllIIlIlIlII, f2);
            float f8 = this.lllIIIllIIIIlllIlIIllIIll(class_19652.IIIIIlllIIllllIlllIlllIIl, class_19652.lIIllllIllIlllllIIllIllIl, f2);
            if (class_19652.lIlIlIIllIIIlllIllIIlIllI() && class_19652.IlIIIlIIIIllIIIllIIIIIIll instanceof class_1965) {
                class_1965 class_19653 = (class_1965)class_19652.IlIIIlIIIIllIIIllIIIIIIll;
                f7 = this.lllIIIllIIIIlllIlIIllIIll(class_19653.lIIllIlIllIlIlIIlIlIIIIll, class_19653.lllllIllllIIIIllIIlIlIlII, f2);
                f6 = MathHelper.IIIllIIlIIIIIIlIlIIllIIlI(f8 - f7);
                if (f6 < -85.0f) {
                    f6 = -85.0f;
                }
                if (f6 >= 85.0f) {
                    f6 = 85.0f;
                }
                f7 = f8 - f6;
                if (f6 * f6 > 2500.0f) {
                    f7 += f6 * 0.2f;
                }
            }
            float f9 = class_19652.llIIIIllIIIIIIIlIIIlIIIIl + (class_19652.IlIlIIlllIllllllllIIIlIlI - class_19652.llIIIIllIIIIIIIlIIIlIIIIl) * f2;
            this.lllIIIllIIIIlllIlIIllIIll(class_19652, d, d2, d3);
            f6 = this.IlIllllllIIlIIllllIIlIIIl(class_19652, f2);
            this.lllIIIllIIIIlllIlIIllIIll(class_19652, f6, f7, f2);
            float f10 = 0.0625f;
            GL11.glEnable((int)32826);
            GL11.glScalef((float)-1.0f, (float)-1.0f, (float)1.0f);
            this.lllIIIllIIIIlllIlIIllIIll(class_19652, f2);
            GL11.glTranslatef((float)0.0f, (float)(-24.0f * f10 - 0.0078125f), (float)0.0f);
            float f11 = class_19652.IIIIlllIIlIllllllIllIIlll + (class_19652.IIIIIIlIIIIIIIIIIlIlIlIlI - class_19652.IIIIlllIIlIllllllIllIIlll) * f2;
            float f12 = class_19652.IllIlllIIIlllllIllIIlIlIl - class_19652.IIIIIIlIIIIIIIIIIlIlIlIlI * (1.0f - f2);
            if (class_19652.g_()) {
                f12 *= 3.0f;
            }
            if (f11 > 1.0f) {
                f11 = 1.0f;
            }
            GL11.glEnable((int)3008);
            this.llIIllIllIlIIlIIllIllllll.lllIIIllIIIIlllIlIIllIIll(class_19652, f12, f11, f2);
            this.lllIIIllIIIIlllIlIIllIIll(class_19652, f12, f11, f6, f8 - f7, f9, f10);
            for (int i = 0; i < 4; ++i) {
                n2 = this.lllIlIIlIIIlIlIIIllIlllIl(class_19652, i, f2);
                if (n2 <= 0) continue;
                if (this.lllIIlIIIllllllIIIIlIlIlI instanceof class_1931) {
                    ((class_1931)this.lllIIlIIIllllllIIIIlIlIlI).lIlIlIIlIIIIlIIIIIlllIIII = true;
                }
                this.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(class_19652, f12, f11, f2);
                this.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(class_19652, f12, f11, f6, f8 - f7, f9, f10);
                if ((n2 & 0xF0) == 16) {
                    this.lllIIIllIIIIlllIlIIllIIll(class_19652, i, f2);
                    this.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(class_19652, f12, f11, f6, f8 - f7, f9, f10);
                }
                if ((n2 & 0xF) == 15 && LunarClient.getInstance().getSettingsManager().lllIIIllIIIIlllIlIIllIIll()) {
                    f5 = (float)class_19652.IlllIIIllllIIllIllIlIIlIl + f2;
                    this.lllIIIllIIIIlllIlIIllIIll(lIllllIIlIIIlIllllllIIIll);
                    GL11.glEnable((int)3042);
                    f4 = 0.5f;
                    GL11.glColor4f((float)f4, (float)f4, (float)f4, (float)1.0f);
                    GL11.glDepthFunc((int)514);
                    GL11.glDepthMask((boolean)false);
                    for (n = 0; n < 2; ++n) {
                        GL11.glDisable((int)2896);
                        f3 = 0.76f;
                        GL11.glColor4f((float)(0.5f * f3), (float)(0.25f * f3), (float)(0.8f * f3), (float)1.0f);
                        GL11.glBlendFunc((int)768, (int)1);
                        GL11.glMatrixMode((int)5890);
                        GL11.glLoadIdentity();
                        float f13 = f5 * (0.001f + (float)n * 0.003f) * 20.0f;
                        float f14 = 0.33333334f;
                        GL11.glScalef((float)f14, (float)f14, (float)f14);
                        GL11.glRotatef((float)(30.0f - (float)n * 60.0f), (float)0.0f, (float)0.0f, (float)1.0f);
                        GL11.glTranslatef((float)0.0f, (float)f13, (float)0.0f);
                        GL11.glMatrixMode((int)5888);
                        this.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(class_19652, f12, f11, f6, f8 - f7, f9, f10);
                    }
                    GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                    GL11.glMatrixMode((int)5890);
                    GL11.glDepthMask((boolean)true);
                    GL11.glLoadIdentity();
                    GL11.glMatrixMode((int)5888);
                    GL11.glEnable((int)2896);
                    GL11.glDisable((int)3042);
                    GL11.glDepthFunc((int)515);
                }
                GL11.glDisable((int)3042);
                GL11.glEnable((int)3008);
            }
            GL11.glDepthMask((boolean)true);
            this.lllIlIIlIIIlIlIIIllIlllIl(class_19652, f2);
            float f15 = class_19652.lllIlIIlIIIlIlIIIllIlllIl(f2);
            n2 = this.lllIIIllIIIIlllIlIIllIIll(class_19652, f15, f2);
            OpenGlHelper.IllIIIllIIIIlIlIlIllIIlll(OpenGlHelper.IlIllllllIIlIIllllIIlIIIl);
            GL11.glDisable((int)3553);
            OpenGlHelper.IllIIIllIIIIlIlIlIllIIlll(OpenGlHelper.lllIlIIlIIIlIlIIIllIlllIl);
            if ((n2 >> 24 & 0xFF) > 0 || class_19652.lIIllIlIIlIIlllllIlIIllIl > 0 || class_19652.lIlIIIllIIllIIlIllllllIll > 0) {
                GL11.glDisable((int)3553);
                GL11.glDisable((int)3008);
                GL11.glEnable((int)3042);
                GL11.glBlendFunc((int)770, (int)771);
                GL11.glDepthFunc((int)514);
                if (class_19652.lIIllIlIIlIIlllllIlIIllIl > 0 || class_19652.lIlIIIllIIllIIlIllllllIll > 0) {
                    GL11.glColor4f((float)f15, (float)0.0f, (float)0.0f, (float)0.4f);
                    this.llIIllIllIlIIlIIllIllllll.lllIIIllIIIIlllIlIIllIIll(class_19652, f12, f11, f6, f8 - f7, f9, f10);
                    for (n = 0; n < 4; ++n) {
                        if (this.IlIllllllIIlIIllllIIlIIIl(class_19652, n, f2) < 0) continue;
                        GL11.glColor4f((float)f15, (float)0.0f, (float)0.0f, (float)0.4f);
                        this.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(class_19652, f12, f11, f6, f8 - f7, f9, f10);
                    }
                }
                if ((n2 >> 24 & 0xFF) > 0) {
                    f5 = (float)(n2 >> 16 & 0xFF) / 255.0f;
                    f4 = (float)(n2 >> 8 & 0xFF) / 255.0f;
                    float f16 = (float)(n2 & 0xFF) / 255.0f;
                    f3 = (float)(n2 >> 24 & 0xFF) / 255.0f;
                    GL11.glColor4f((float)f5, (float)f4, (float)f16, (float)f3);
                    this.llIIllIllIlIIlIIllIllllll.lllIIIllIIIIlllIlIIllIIll(class_19652, f12, f11, f6, f8 - f7, f9, f10);
                    for (int i = 0; i < 4; ++i) {
                        if (this.IlIllllllIIlIIllllIIlIIIl(class_19652, i, f2) < 0) continue;
                        GL11.glColor4f((float)f5, (float)f4, (float)f16, (float)f3);
                        this.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(class_19652, f12, f11, f6, f8 - f7, f9, f10);
                    }
                }
                GL11.glDepthFunc((int)515);
                GL11.glDisable((int)3042);
                GL11.glEnable((int)3008);
                GL11.glEnable((int)3553);
            }
            GL11.glDisable((int)32826);
        }
        catch (Exception exception) {
            lllIIIllIIIIlllIlIIllIIll.error("Couldn't render entity", (Throwable)exception);
        }
        OpenGlHelper.IllIIIllIIIIlIlIlIllIIlll(OpenGlHelper.IlIllllllIIlIIllllIIlIIIl);
        GL11.glEnable((int)3553);
        OpenGlHelper.IllIIIllIIIIlIlIlIllIIlll(OpenGlHelper.lllIlIIlIIIlIlIIIllIlllIl);
        GL11.glEnable((int)2884);
        GL11.glPopMatrix();
        this.lllIlIIlIIIlIlIIIllIlllIl(class_19652, d, d2, d3);
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652, float f, float f2, float f3, float f4, float f5, float f6) {
        this.lllIlIIlIIIlIlIIIllIlllIl((class_1521)class_19652);
        if (!class_19652.lIIlIlIIllIIIlIIlIlIIIlII()) {
            this.llIIllIllIlIIlIIllIllllll.lllIIIllIIIIlllIlIIllIIll(class_19652, f, f2, f3, f4, f5, f6);
        } else if (!class_19652.IlIllllllIIlIIllllIIlIIIl(Minecraft.getMinecraft().lIIIIlIlIIlllllIIllIIlIII)) {
            GL11.glPushMatrix();
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)0.15f);
            GL11.glDepthMask((boolean)false);
            GL11.glEnable((int)3042);
            GL11.glBlendFunc((int)770, (int)771);
            GL11.glAlphaFunc((int)516, (float)0.003921569f);
            this.llIIllIllIlIIlIIllIllllll.lllIIIllIIIIlllIlIIllIIll(class_19652, f, f2, f3, f4, f5, f6);
            GL11.glDisable((int)3042);
            GL11.glAlphaFunc((int)516, (float)0.1f);
            GL11.glPopMatrix();
            GL11.glDepthMask((boolean)true);
        } else {
            this.llIIllIllIlIIlIIllIllllll.lllIIIllIIIIlllIlIIllIIll(f, f2, f3, f4, f5, f6, class_19652);
        }
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652, double d, double d2, double d3) {
        GL11.glTranslatef((float)((float)d), (float)((float)d2), (float)((float)d3));
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652, float f, float f2, float f3) {
        GL11.glRotatef((float)(180.0f - f2), (float)0.0f, (float)1.0f, (float)0.0f);
        if (class_19652.lIlIIIllIIllIIlIllllllIll > 0) {
            float f4 = ((float)class_19652.lIlIIIllIIllIIlIllllllIll + f3 - 1.0f) / 20.0f * 1.6f;
            if ((f4 = MathHelper.IlIllllllIIlIIllllIIlIIIl(f4)) > 1.0f) {
                f4 = 1.0f;
            }
            GL11.glRotatef((float)(f4 * this.lllIlIIlIIIlIlIIIllIlllIl(class_19652)), (float)0.0f, (float)0.0f, (float)1.0f);
        } else {
            String string = EnumChatFormatting.getTextWithoutFormattingCodes(class_19652.llllIIIIlIIIlIIIIIIlIllll());
            if (!(!string.equals("Dinnerbone") && !string.equals("Grumm") || class_19652 instanceof class_0814 && ((class_0814)class_19652).IlIllIIIIllllIIllIllIIIIl())) {
                GL11.glTranslatef((float)0.0f, (float)(class_19652.lllIIIIlIlIIlIIlllIIIIIIl + 0.1f), (float)0.0f);
                GL11.glRotatef((float)180.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            }
        }
    }

    protected float lIlllIlllIIIIlIIlllIllIII(class_1965 class_19652, float f) {
        return class_19652.llIIllIllIlIIlIIllIllllll(f);
    }

    protected float IlIllllllIIlIIllllIIlIIIl(class_1965 class_19652, float f) {
        return (float)class_19652.IlllIIIllllIIllIllIlIIlIl + f;
    }

    protected void lllIlIIlIIIlIlIIIllIlllIl(class_1965 class_19652, float f) {
    }

    protected void IlIIIIIllllllIIlllIllllll(class_1965 class_19652, float f) {
        int n = class_19652.IIIllIIIlIlllllllIIIlllll();
        if (n > 0) {
            class_0369 class_03692 = new class_0369(class_19652.lIlIllIIlIIlIIlIIlIIlIIll, class_19652.IlIIlllllIIlIlIlllllIllll, class_19652.llIIlIlIlllIIllIlIlllIllI, class_19652.IllIIIIllIIllIllIlllIlIIl);
            Random random = new Random(class_19652.llllllIlIllllIlIlIlIIIIlI());
            class_0624.lllIIIllIIIIlllIlIIllIIll();
            for (int i = 0; i < n; ++i) {
                GL11.glPushMatrix();
                class_0744 class_07442 = this.llIIllIllIlIIlIIllIllllll.lllIIIllIIIIlllIlIIllIIll(random);
                class_1551 class_15512 = (class_1551)class_07442.llIIlllIllIllllIIIlIIIIII.get(random.nextInt(class_07442.llIIlllIllIllllIIIlIIIIII.size()));
                class_07442.IlIllllllIIlIIllllIIlIIIl(0.0625f);
                float f2 = random.nextFloat();
                float f3 = random.nextFloat();
                float f4 = random.nextFloat();
                float f5 = (class_15512.lllIIIllIIIIlllIlIIllIIll + (class_15512.lIlllIlllIIIIlIIlllIllIII - class_15512.lllIIIllIIIIlllIlIIllIIll) * f2) / 16.0f;
                float f6 = (class_15512.lllIlIIlIIIlIlIIIllIlllIl + (class_15512.IlIIIIIllllllIIlllIllllll - class_15512.lllIlIIlIIIlIlIIIllIlllIl) * f3) / 16.0f;
                float f7 = (class_15512.IlIllllllIIlIIllllIIlIIIl + (class_15512.lIllllIIlIIIlIllllllIIIll - class_15512.IlIllllllIIlIIllllIIlIIIl) * f4) / 16.0f;
                GL11.glTranslatef((float)f5, (float)f6, (float)f7);
                f2 = f2 * 2.0f - 1.0f;
                f3 = f3 * 2.0f - 1.0f;
                f4 = f4 * 2.0f - 1.0f;
                float f8 = MathHelper.IlIllllllIIlIIllllIIlIIIl((f2 *= -1.0f) * f2 + (f4 *= -1.0f) * f4);
                class_03692.llllIIIIlIIIlIIIIIIlIllll = class_03692.IIIIlIllIlIIlIIlIllIlIlll = (float)(Math.atan2(f2, f4) * 180.0 / Math.PI);
                class_03692.llIIIIllIIIIIIIlIIIlIIIIl = class_03692.IlIlIIlllIllllllllIIIlIlI = (float)(Math.atan2(f3 *= -1.0f, f8) * 180.0 / Math.PI);
                double d = 0.0;
                double d2 = 0.0;
                double d3 = 0.0;
                float f9 = 0.0f;
                this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(class_03692, d, d2, d3, f9, f);
                GL11.glPopMatrix();
            }
            class_0624.lllIlIIlIIIlIlIIIllIlllIl();
        }
    }

    protected int IlIllllllIIlIIllllIIlIIIl(class_1965 class_19652, int n, float f) {
        return this.lllIlIIlIIIlIlIIIllIlllIl(class_19652, n, f);
    }

    public int lllIlIIlIIIlIlIIIllIlllIl(class_1965 class_19652, int n, float f) {
        return -1;
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652, int n, float f) {
    }

    protected float lllIlIIlIIIlIlIIIllIlllIl(class_1965 class_19652) {
        return 90.0f;
    }

    protected int lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652, float f, float f2) {
        return 0;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652, float f) {
    }

    protected void lllIlIIlIIIlIlIIIllIlllIl(class_1965 class_19652, double d, double d2, double d3) {
        GL11.glAlphaFunc((int)516, (float)0.1f);
        if (this.lllIIIllIIIIlllIlIIllIIll(class_19652)) {
            float f;
            float f2 = 1.6f;
            float f3 = 0.016666668f * f2;
            double d4 = class_19652.IlIIIIIllllllIIlllIllllll(this.lllIlIIlIIIlIlIIIllIlllIl.IllIIlllllllIIlIIlIIIIlIl);
            float f4 = f = class_19652.IIlIIlIlIlIllIIlIlIIIIlll() ? 32.0f : 64.0f;
            if (!Minecraft.getMinecraft().IIIIlIIlIIIllIIIIllIIIlII && d4 < (double)(f * f)) {
                String string = class_19652.llIIIIllIIIIIIIlIIIlIIIIl().lIlllIlllIIIIlIIlllIllIII();
                if (class_19652.IIlIIlIlIlIllIIlIlIIIIlll()) {
                    if (LunarClient.getInstance().getNetworkManager().IllIIIllIIIIlIlIlIllIIlll().containsKey(class_19652.lIIlllIIlIlIlIIIlIlllIIll())) {
                        List list = (List) LunarClient.getInstance().getNetworkManager().IllIIIllIIIIlIlIlIllIIlll().get(class_19652.lIIlllIIlIlIlIIIlIlllIIll());
                        int n = 0;
                        for (String string2 : list) {
                            this.lllIIIllIIIIlllIlIIllIIll(f3, string2, (float)(-n), class_19652, d, d2, d3);
                            ++n;
                        }
                    } else {
                        this.lllIIIllIIIIlllIlIIllIIll(f3, string, 0.0f, class_19652, d, d2, d3);
                    }
                } else {
                    this.lllIIIllIIIIlllIlIIllIIll(class_19652, d, d2, d3, string, f3, d4);
                }
            }
        }
    }

    private void lllIIIllIIIIlllIlIIllIIll(float f, String string, float f2, class_1965 class_19652, double d, double d2, double d3) {
        class_1854 class_18542 = this.lllIlIIlIIIlIlIIIllIlllIl();
        GL11.glPushMatrix();
        GL11.glTranslatef((float)((float)d + 0.0f), (float)((float)d2 + class_19652.lllIIIIlIlIIlIIlllIIIIIIl + 0.5f - f2 / 3.0f), (float)((float)d3));
        GL11.glNormal3f((float)0.0f, (float)1.0f, (float)0.0f);
        GL11.glRotatef((float)(-this.lllIlIIlIIIlIlIIIllIlllIl.IllIIIllIIIIlIlIlIllIIlll), (float)0.0f, (float)1.0f, (float)0.0f);
        GL11.glRotatef((float)this.lllIlIIlIIIlIlIIIllIlllIl.lIIIIlIlIIlllllIIllIIlIII, (float)1.0f, (float)0.0f, (float)0.0f);
        GL11.glScalef((float)(-f), (float)(-f), (float)f);
        GL11.glDisable((int)2896);
        GL11.glTranslatef((float)0.0f, (float)(0.25f / f), (float)0.0f);
        GL11.glDepthMask((boolean)false);
        GL11.glEnable((int)3042);
        OpenGlHelper.glBlendFunc(770, 771, 1, 0);
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        GL11.glDisable((int)3553);
        class_08682.lllIlIIlIIIlIlIIIllIlllIl();
        int n = class_18542.lllIIIllIIIIlllIlIIllIIll(string) / 2;
        class_08682.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, 0.25f);
        class_08682.lllIIIllIIIIlllIlIIllIIll((double)(-n - 1), -1.0, 0.0);
        class_08682.lllIIIllIIIIlllIlIIllIIll((double)(-n - 1), 8.0, 0.0);
        class_08682.lllIIIllIIIIlllIlIIllIIll((double)(n + 1), 8.0, 0.0);
        class_08682.lllIIIllIIIIlllIlIIllIIll((double)(n + 1), -1.0, 0.0);
        class_08682.lllIIIllIIIIlllIlIIllIIll();
        GL11.glEnable((int)3553);
        GL11.glDepthMask((boolean)true);
        class_18542.lllIlIIlIIIlIlIIIllIlllIl(string, -class_18542.lllIIIllIIIIlllIlIIllIIll(string) / 2, 0, 0x20FFFFFF);
        GL11.glEnable((int)2896);
        GL11.glDisable((int)3042);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glPopMatrix();
    }

    protected boolean lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652) {
        return Minecraft.llIllllIlIllIIIlIllIIlIlI() && class_19652 != this.lllIlIIlIIIlIlIIIllIlllIl.IllIIlllllllIIlIIlIIIIlIl && !class_19652.IlIllllllIIlIIllllIIlIIIl(Minecraft.getMinecraft().lIIIIlIlIIlllllIIllIIlIII) && class_19652.lIlIlIIlIIIIlIIIIIlllIIII == null;
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652, double d, double d2, double d3, String string, float f, double d4) {
        if (class_19652.IIIIIllIIlIlIlIIlIlIlIllI()) {
            this.lllIIIllIIIIlllIlIIllIIll((class_1521)class_19652, string, d, d2 - 1.5, d3, 64);
        } else {
            this.lllIIIllIIIIlllIlIIllIIll((class_1521)class_19652, string, d, d2, d3, 64);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, double d, double d2, double d3, float f, float f2) {
        this.lllIIIllIIIIlllIlIIllIIll((class_1965)class_15212, d, d2, d3, f, f2);
    }
}

