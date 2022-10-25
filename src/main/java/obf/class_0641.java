package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.util.glu.GLU
 */
import java.awt.Color;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.List;

import com.moonsworth.lunar.client.LunarClient;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.settings.Options;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.GLU;

public class class_0641 {
    public FloatBuffer lllIIIllIIIIlllIlIIllIIll = BufferUtils.createFloatBuffer((int)16);
    public FloatBuffer lllIlIIlIIIlIlIIIllIlllIl = BufferUtils.createFloatBuffer((int)16);
    private List IlIllllllIIlIIllllIIlIIIl;
    private int[] lIlllIlllIIIIlIIlllIllIII = new int[]{-15007996, -43234, -3603713, -16580641, -8912129, -16601345, -2786, -64828, -15629042, -10744187};
    private boolean IlIIIIIllllllIIlllIllllll = false;
    private Minecraft lIllllIIlIIIlIllllllIIIll = Minecraft.getMinecraft();

    public class_0641() {
        this.IlIllllllIIlIIllllIIlIIIl = new ArrayList();
    }

    public double lllIIIllIIIIlllIlIIllIIll(double d, double d2, double d3) {
        double d4 = d - this.lIllllIIlIIIlIllllllIIIll.lIIIIlIlIIlllllIIllIIlIII.IlIIlllllIIlIlIlllllIllll;
        double d5 = d2 - this.lIllllIIlIIIlIllllllIIIll.lIIIIlIlIIlllllIIllIIlIII.llIIlIlIlllIIllIlIlllIllI;
        double d6 = d3 - this.lIllllIIlIIIlIllllllIIIll.lIIIIlIlIIlllllIIllIIlIII.IllIIIIllIIllIllIlllIlIIl;
        return Math.sqrt(d4 * d4 + d5 * d5 + d6 * d6);
    }

    private void lllIIIllIIIIlllIlIIllIIll(class_2201 class_22012) {
        if (this.IlIllllllIIlIIllllIIlIIIl.isEmpty()) {
            return;
        }
        IntBuffer intBuffer = BufferUtils.createIntBuffer((int)16);
        GL11.glGetInteger((int)2978, (IntBuffer)intBuffer);
        float f = this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll().lllIlIIlIIIlIlIIIllIlllIl;
        float f2 = (float)(this.lIllllIIlIIIlIllllllIIIll.lIIIIlIlIIlllllIIllIIlIII.lIIIlIIIlIlllIllIIIlIIIlI + (this.lIllllIIlIIIlIllllllIIIll.lIIIIlIlIIlllllIIllIIlIII.IlIIlllllIIlIlIlllllIllll - this.lIllllIIlIIIlIllllllIIIll.lIIIIlIlIIlllllIIllIIlIII.lIIIlIIIlIlllIllIIIlIIIlI) * (double)f);
        float f3 = (float)(this.lIllllIIlIIIlIllllllIIIll.lIIIIlIlIIlllllIIllIIlIII.lIIlIlllIllIlIlllIIIIIIII + (this.lIllllIIlIIIlIllllllIIIll.lIIIIlIlIIlllllIIllIIlIII.llIIlIlIlllIIllIlIlllIllI - this.lIllllIIlIIIlIllllllIIIll.lIIIIlIlIIlllllIIllIIlIII.lIIlIlllIllIlIlllIIIIIIII) * (double)f);
        float f4 = (float)(this.lIllllIIlIIIlIllllllIIIll.lIIIIlIlIIlllllIIllIIlIII.IIlIllIIlllllIIlIIllllIIl + (this.lIllllIIlIIIlIllllllIIIll.lIIIIlIlIIlllllIIllIIlIII.IllIIIIllIIllIllIlllIlIIl - this.lIllllIIlIIIlIllllllIIIll.lIIIIlIlIIlllllIIllIIlIII.IIlIllIIlllllIIlIIllllIIl) * (double)f);
        double d = (double)(this.lIllllIIlIIIlIllllllIIIll.lIIIIlIlIIlllllIIllIIlIII.IlIlIIlllIllllllllIIIlIlI + 90.0f) * Math.PI / 180.0;
        double d2 = (double)(this.lIllllIIlIIIlIllllllIIIll.lIIIIlIlIIlllllIIllIIlIII.IIIIlIllIlIIlIIlIllIlIlll + 90.0f) * Math.PI / 180.0;
        class_0864 class_08642 = new class_0864(Math.sin(d) * Math.cos(d2), Math.cos(d), Math.sin(d) * Math.sin(d2));
        if (this.lIllllIIlIIIlIllllllIIIll.gameSettings.IIlIlIlIIlllIIIlIIIIlIIIl == 2) {
            class_08642 = new class_0864(class_08642.lllIIIllIIIIlllIlIIllIIll * -1.0, class_08642.lllIlIIlIIIlIlIIIllIlllIl * -1.0, class_08642.IlIllllllIIlIIllllIIlIIIl * -1.0);
        }
        for (class_0726 class_07262 : this.IlIllllllIIlIIllllIIlIIIl) {
            class_0814 class_08142 = this.lIllllIIlIIIlIllllllIIIll.theWorld.lllIlIIlIIIlIlIIIllIlllIl(class_07262.IlIllllllIIlIIllllIIlIIIl());
            if (class_08142 == null) {
                double d3;
                if (System.currentTimeMillis() - class_07262.lllIlIIlIIIlIlIIIllIlllIl() > class_07262.lIlllIlllIIIIlIIlllIllIII()) continue;
                double d4 = class_07262.lllIIIllIIIIlllIlIIllIIll().getX() - (double)f2;
                double d5 = class_07262.lllIIIllIIIIlllIlIIllIIll().getY() - (double)f3;
                double d6 = class_07262.lllIIIllIIIIlllIlIIllIIll().getZ() - (double)f4;
                double d7 = this.lllIIIllIIIIlllIlIIllIIll(class_07262.lllIIIllIIIIlllIlIIllIIll().getX(), class_07262.lllIIIllIIIIlllIlIIllIIll().getY(), class_07262.lllIIIllIIIIlllIlIIllIIll().getZ());
                if (d7 > (d3 = (double)(this.lIllllIIlIIIlIllllllIIIll.gameSettings.lllIIIllIIIIlllIlIIllIIll(Options.RENDER_DISTANCE) * 16.0f))) {
                    d4 = d4 / d7 * d3;
                    d5 = d5 / d7 * d3;
                    d6 = d6 / d7 * d3;
                }
                this.lllIIIllIIIIlllIlIIllIIll(class_22012.lllIIIllIIIIlllIlIIllIIll(), class_07262, (float)d4, (float)d5, (float)d6, intBuffer, class_08642, (int)d7);
                continue;
            }
            if (class_08142 == this.lIllllIIlIIIlIllllllIIIll.lIIIIlIlIIlllllIIllIIlIII) continue;
            float f5 = (float)(class_08142.lIIIlIIIlIlllIllIIIlIIIlI + (class_08142.IlIIlllllIIlIlIlllllIllll - class_08142.lIIIlIIIlIlllIllIIIlIIIlI) * (double)f - (double)f2);
            float f6 = (float)(class_08142.lIIlIlllIllIlIlllIIIIIIII + (class_08142.llIIlIlIlllIIllIlIlllIllI - class_08142.lIIlIlllIllIlIlllIIIIIIII) * (double)f - (double)f3) + class_08142.lllIIIIlIlIIlIIlllIIIIIIl + 1.0f;
            float f7 = (float)(class_08142.IIlIllIIlllllIIlIIllllIIl + (class_08142.IllIIIIllIIllIllIlllIlIIl - class_08142.IIlIllIIlllllIIlIIllllIIl) * (double)f - (double)f4);
            double d8 = this.lllIIIllIIIIlllIlIIllIIll(class_08142.IlIIlllllIIlIlIlllllIllll, class_08142.llIIlIlIlllIIllIlIlllIllI, class_08142.IllIIIIllIIllIllIlllIlIIl);
            this.lllIIIllIIIIlllIlIIllIIll(class_22012.lllIIIllIIIIlllIlIIllIIll(), class_07262, f5, f6, f7, intBuffer, class_08642, (int)d8);
        }
    }

    private void lllIIIllIIIIlllIlIIllIIll(class_0321 class_03212, class_0726 class_07262, float f, float f2, float f3, IntBuffer intBuffer, class_0864 class_08642, int n) {
        class_0864 class_08643 = new class_0864(f, f2, f3);
        double d = class_08643.lllIlIIlIIIlIlIIIllIlllIl();
        if (class_08642.lllIlIIlIIIlIlIIIllIlllIl(class_08643 = class_08643.lllIIIllIIIIlllIlIIllIIll()) <= 0.02) {
            double d2 = 1.5533430342749535;
            double d3 = Math.sin(1.5533430342749535);
            double d4 = Math.cos(1.5533430342749535);
            class_0864 class_08644 = class_08642.IlIllllllIIlIIllllIIlIIIl(class_08643);
            double d5 = class_08644.lllIIIllIIIIlllIlIIllIIll;
            double d6 = class_08644.lllIlIIlIIIlIlIIIllIlllIl;
            double d7 = class_08644.IlIllllllIIlIIllllIIlIIIl;
            double d8 = d4 + d5 * d5 * (1.0 - d4);
            double d9 = d5 * d6 * (1.0 - d4) - d7 * d3;
            double d10 = d5 * d7 * (1.0 - d4) + d6 * d3;
            double d11 = d6 * d5 * (1.0 - d4) + d7 * d3;
            double d12 = d4 + d6 * d6 * (1.0 - d4);
            double d13 = d6 * d7 * (1.0 - d4) - d5 * d3;
            double d14 = d7 * d5 * (1.0 - d4) - d6 * d3;
            double d15 = d7 * d6 * (1.0 - d4) + d5 * d3;
            double d16 = d4 + d7 * d7 * (1.0 - d4);
            f = (float)(d * (d8 * class_08642.lllIIIllIIIIlllIlIIllIIll + d9 * class_08642.lllIlIIlIIIlIlIIIllIlllIl + d10 * class_08642.IlIllllllIIlIIllllIIlIIIl));
            f2 = (float)(d * (d11 * class_08642.lllIIIllIIIIlllIlIIllIIll + d12 * class_08642.lllIlIIlIIIlIlIIIllIlllIl + d13 * class_08642.IlIllllllIIlIIllllIIlIIIl));
            f3 = (float)(d * (d14 * class_08642.lllIIIllIIIIlllIlIIllIIll + d15 * class_08642.lllIlIIlIIIlIlIIIllIlllIl + d16 * class_08642.IlIllllllIIlIIllllIIlIIIl));
        }
        FloatBuffer floatBuffer = BufferUtils.createFloatBuffer((int)3);
        GLU.gluProject((float)f, (float)f2, (float)f3, (FloatBuffer)this.lllIIIllIIIIlllIlIIllIIll, (FloatBuffer)this.lllIlIIlIIIlIlIIIllIlllIl, (IntBuffer)intBuffer, (FloatBuffer)floatBuffer);
        float f4 = floatBuffer.get(0) / (float)class_03212.IlIIIIIllllllIIlllIllllll();
        float f5 = floatBuffer.get(1) / (float)class_03212.IlIIIIIllllllIIlllIllllll();
        class_1392 class_13922 = null;
        int n2 = 8;
        int n3 = 10;
        int n4 = -4 - n3;
        float f6 = (float)class_03212.lllIlIIlIIIlIlIIIllIlllIl() - f5;
        if (f6 < 0.0f) {
            class_13922 = class_1392.lllIIIllIIIIlllIlIIllIIll;
            f5 = class_03212.lllIlIIlIIIlIlIIIllIlllIl() - 6;
        } else if (f6 > (float)(class_03212.lllIlIIlIIIlIlIIIllIlllIl() - n3)) {
            class_13922 = class_1392.IlIllllllIIlIIllllIIlIIIl;
            f5 = 6.0f;
        }
        if (f4 - (float)n2 < 0.0f) {
            class_13922 = class_1392.lllIlIIlIIIlIlIIIllIlllIl;
            f4 = 6.0f;
        } else if (f4 > (float)(class_03212.lllIIIllIIIIlllIlIIllIIll() - n2)) {
            class_13922 = class_1392.lIlllIlllIIIIlIIlllIllIII;
            f4 = class_03212.lllIIIllIIIIlllIlIIllIIll() - 6;
        }
        GL11.glPushMatrix();
        GL11.glTranslatef((float)f4, (float)((float)class_03212.lllIlIIlIIIlIlIIIllIlllIl() - f5), (float)0.0f);
        if (class_13922 != null) {
            if (((Boolean) LunarClient.getInstance().getSettingsManager().tvShowOffscreenMarker.getValue()).booleanValue()) {
                this.lllIIIllIIIIlllIlIIllIIll(class_07262, class_13922, 0.0f, 0.0f);
            }
        } else {
            this.lllIIIllIIIIlllIlIIllIIll(class_07262, n2, (float)n4, (float)n3);
            if (n > 40 && ((Boolean) LunarClient.getInstance().getSettingsManager().tvShowDistance.getValue()).booleanValue()) {
                this.lIllllIIlIIIlIllllllIIIll.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll("(" + n + "m)", 0, 10, -1);
            }
        }
        GL11.glPopMatrix();
    }

    private void lllIIIllIIIIlllIlIIllIIll(class_0726 class_07262, class_1392 class_13922, float f, float f2) {
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3553);
        OpenGlHelper.glBlendFunc(770, 771, 1, 0);
        if (class_07262.IlIIIIIllllllIIlllIllllll()) {
            GL11.glColor4f((float)0.0f, (float)0.0f, (float)1.0f, (float)0.66f);
        } else {
            Color color = class_07262.lIllllIIlIIIlIllllllIIIll();
            GL11.glColor4f((float)((float)color.getRed() / 255.0f), (float)((float)color.getGreen() / 255.0f), (float)((float)color.getBlue() / 255.0f), (float)0.66f);
        }
        float f3 = 8.0f;
        float f4 = 10.0f;
        GL11.glPushMatrix();
        GL11.glTranslatef((float)f, (float)f2, (float)0.0f);
        switch (class_13922) {
            case lllIlIIlIIIlIlIIIllIlllIl: {
                class_08682.lllIlIIlIIIlIlIIIllIlllIl();
                class_08682.lllIIIllIIIIlllIlIIllIIll((double)(f3 / 2.0f), (double)(f4 / 2.0f), 0.0);
                class_08682.lllIIIllIIIIlllIlIIllIIll((double)(-f3 / 2.0f), 0.0, 0.0);
                class_08682.lllIIIllIIIIlllIlIIllIIll((double)(f3 / 2.0f), (double)(-f4 / 2.0f), 0.0);
                class_08682.lllIIIllIIIIlllIlIIllIIll((double)(-f3 / 2.0f), 0.0, 0.0);
                class_08682.lllIIIllIIIIlllIlIIllIIll();
                break;
            }
            case lIlllIlllIIIIlIIlllIllIII: {
                class_08682.lllIlIIlIIIlIlIIIllIlllIl();
                class_08682.lllIIIllIIIIlllIlIIllIIll((double)(-f3 / 2.0f), (double)(f4 / 2.0f), 0.0);
                class_08682.lllIIIllIIIIlllIlIIllIIll((double)(f3 / 2.0f), 0.0, 0.0);
                class_08682.lllIIIllIIIIlllIlIIllIIll((double)(-f3 / 2.0f), (double)(-f4 / 2.0f), 0.0);
                class_08682.lllIIIllIIIIlllIlIIllIIll((double)(f3 / 2.0f), 0.0, 0.0);
                class_08682.lllIIIllIIIIlllIlIIllIIll();
                break;
            }
            case IlIllllllIIlIIllllIIlIIIl: {
                class_08682.lllIlIIlIIIlIlIIIllIlllIl();
                class_08682.lllIIIllIIIIlllIlIIllIIll((double)(-f3 / 2.0f), (double)(-f4 / 2.0f), 0.0);
                class_08682.lllIIIllIIIIlllIlIIllIIll(0.0, (double)(f4 / 2.0f), 0.0);
                class_08682.lllIIIllIIIIlllIlIIllIIll((double)(f3 / 2.0f), (double)(-f4 / 2.0f), 0.0);
                class_08682.lllIIIllIIIIlllIlIIllIIll(0.0, (double)(f4 / 2.0f), 0.0);
                class_08682.lllIIIllIIIIlllIlIIllIIll();
                break;
            }
            case lllIIIllIIIIlllIlIIllIIll: {
                class_08682.lllIlIIlIIIlIlIIIllIlllIl();
                class_08682.lllIIIllIIIIlllIlIIllIIll((double)(-f3 / 2.0f), (double)(f4 / 2.0f), 0.0);
                class_08682.lllIIIllIIIIlllIlIIllIIll(0.0, (double)(-f4 / 2.0f), 0.0);
                class_08682.lllIIIllIIIIlllIlIIllIIll((double)(f3 / 2.0f), (double)(f4 / 2.0f), 0.0);
                class_08682.lllIIIllIIIIlllIlIIllIIll(0.0, (double)(-f4 / 2.0f), 0.0);
                class_08682.lllIIIllIIIIlllIlIIllIIll();
            }
        }
        GL11.glPopMatrix();
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
    }

    private void lllIIIllIIIIlllIlIIllIIll(class_0726 class_07262, float f, float f2, float f3) {
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3553);
        OpenGlHelper.glBlendFunc(770, 771, 1, 0);
        if (class_07262.IlIIIIIllllllIIlllIllllll()) {
            GL11.glColor4f((float)0.0f, (float)0.0f, (float)1.0f, (float)0.66f);
        } else {
            Color color = class_07262.lIllllIIlIIIlIllllllIIIll();
            GL11.glColor4f((float)((float)color.getRed() / 255.0f), (float)((float)color.getGreen() / 255.0f), (float)((float)color.getBlue() / 255.0f), (float)0.66f);
        }
        GL11.glPushMatrix();
        GL11.glScalef((float)0.6f, (float)0.6f, (float)0.6f);
        GL11.glRotatef((float)45.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        GL11.glTranslatef((float)(f * 2.0f), (float)0.0f, (float)0.0f);
        GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)-1.0f);
        class_08682.lllIlIIlIIIlIlIIIllIlllIl();
        class_08682.lllIIIllIIIIlllIlIIllIIll((double)(-f), (double)f2, 0.0);
        class_08682.lllIIIllIIIIlllIlIIllIIll((double)(-f), (double)(f2 + f3 / 2.0f), 0.0);
        class_08682.lllIIIllIIIIlllIlIIllIIll((double)f, (double)(f2 + f3 / 2.0f), 0.0);
        class_08682.lllIIIllIIIIlllIlIIllIIll((double)f, (double)f2, 0.0);
        class_08682.lllIIIllIIIIlllIlIIllIIll();
        GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)-1.0f);
        GL11.glTranslatef((float)(f * 2.0f + 1.0f), (float)(f3 / 2.0f + 1.0f), (float)0.0f);
        class_08682.lllIlIIlIIIlIlIIIllIlllIl();
        class_08682.lllIIIllIIIIlllIlIIllIIll((double)(-f / 2.0f + 1.0f), (double)f2, 0.0);
        class_08682.lllIIIllIIIIlllIlIIllIIll((double)(-f / 2.0f + 1.0f), (double)(f2 + f3 / 2.0f), 0.0);
        class_08682.lllIIIllIIIIlllIlIIllIIll((double)f, (double)(f2 + f3 / 2.0f), 0.0);
        class_08682.lllIIIllIIIIlllIlIIllIIll((double)f, (double)f2, 0.0);
        class_08682.lllIIIllIIIIlllIlIIllIIll();
        GL11.glPopMatrix();
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
    }

    public List lllIIIllIIIIlllIlIIllIIll() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    private void lllIIIllIIIIlllIlIIllIIll(class_0780 class_07802) {
        this.IlIllllllIIlIIllllIIlIIIl.clear();
    }

    public class_0726 lllIIIllIIIIlllIlIIllIIll(String string) {
        for (class_0726 class_07262 : this.IlIllllllIIlIIllllIIlIIIl) {
            if (!class_07262.IlIllllllIIlIIllllIIlIIIl().equals(string)) continue;
            return class_07262;
        }
        return null;
    }

    public int[] lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    public boolean IlIllllllIIlIIllllIIlIIIl() {
        return this.IlIIIIIllllllIIlllIllllll;
    }

    public void lllIIIllIIIIlllIlIIllIIll(boolean bl) {
        if (bl && !this.IlIIIIIllllllIIlllIllllll) {
            this.IlIIIIIllllllIIlllIllllll = true;
            LunarClient.getInstance().getEventBus().addEvent(class_2201.class, this::lllIIIllIIIIlllIlIIllIIll);
            LunarClient.getInstance().getEventBus().addEvent(class_0780.class, this::lllIIIllIIIIlllIlIIllIIll);
        } else if (!bl && this.IlIIIIIllllllIIlllIllllll) {
            this.IlIIIIIllllllIIlllIllllll = false;
            LunarClient.getInstance().getEventBus().removeEvent(class_2201.class, this::lllIIIllIIIIlllIlIIllIIll);
            LunarClient.getInstance().getEventBus().removeEvent(class_0780.class, this::lllIIIllIIIIlllIlIIllIIll);
        }
    }
}

