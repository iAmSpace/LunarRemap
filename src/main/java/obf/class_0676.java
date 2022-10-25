package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.OpenGlHelper;
import org.lwjgl.opengl.GL11;

public class class_0676 {
    private final UUID lllIIIllIIIIlllIlIIllIIll;
    private String[] lllIlIIlIIIlIlIIIllIlllIl;
    private final double IlIllllllIIlIIllllIIlIIIl;
    private final double lIlllIlllIIIIlIIlllIllIII;
    private final double IlIIIIIllllllIIlllIllllll;
    private static final List lIllllIIlIIIlIllllllIIIll = new ArrayList();

    public class_0676(UUID uUID, double d, double d2, double d3) {
        this.lllIIIllIIIIlllIlIIllIIll = uUID;
        this.IlIllllllIIlIIllllIIlIIIl = d;
        this.lIlllIlllIIIIlIIlllIllIII = d2;
        this.IlIIIIIllllllIIlllIllllll = d3;
    }

    public static void lllIIIllIIIIlllIlIIllIIll() {
        class_1854 class_18542 = Minecraft.getMinecraft().IlIlllIIIIIIlIIllIIllIlll;
        class_2114 class_21142 = class_2114.lllIIIllIIIIlllIlIIllIIll;
        for (class_0676 class_06762 : lIllllIIlIIIlIllllllIIIll) {
            if (class_06762.IlIllllllIIlIIllllIIlIIIl() == null || class_06762.IlIllllllIIlIIllllIIlIIIl().length <= 0) continue;
            for (int i = class_06762.IlIllllllIIlIIllllIIlIIIl().length - 1; i >= 0; --i) {
                String string = class_06762.IlIllllllIIlIIllllIIlIIIl()[class_06762.IlIllllllIIlIIllllIIlIIIl().length - i - 1];
                float f = (float)(class_06762.lIlllIlllIIIIlIIlllIllIII() - (double)((float)class_2114.lllIlIIlIIIlIlIIIllIlllIl));
                float f2 = (float)(class_06762.IlIIIIIllllllIIlllIllllll() + 1.0 + (double)((float)i * 0.25f) - (double)((float)class_2114.IlIllllllIIlIIllllIIlIIIl));
                float f3 = (float)(class_06762.lIllllIIlIIIlIllllllIIIll() - (double)((float)class_2114.lIlllIlllIIIIlIIlllIllIII));
                float f4 = 1.6f;
                float f5 = 0.016666668f * f4;
                GL11.glPushMatrix();
                GL11.glTranslatef((float)f, (float)f2, (float)f3);
                GL11.glNormal3f((float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)(-class_21142.IllIIIllIIIIlIlIlIllIIlll), (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)class_21142.lIIIIlIlIIlllllIIllIIlIII, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScalef((float)(-f5), (float)(-f5), (float)f5);
                GL11.glDisable((int)2896);
                GL11.glDepthMask((boolean)false);
                GL11.glDisable((int)2929);
                GL11.glEnable((int)3042);
                OpenGlHelper.glBlendFunc(770, 771, 1, 0);
                class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
                int n = 0;
                GL11.glDisable((int)3553);
                class_08682.lllIlIIlIIIlIlIIIllIlllIl();
                int n2 = class_18542.lllIIIllIIIIlllIlIIllIIll(string) / 2;
                class_08682.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, 0.25f);
                class_08682.lllIIIllIIIIlllIlIIllIIll((double)(-n2 - 1), (double)(-1 + n), 0.0);
                class_08682.lllIIIllIIIIlllIlIIllIIll((double)(-n2 - 1), (double)(8 + n), 0.0);
                class_08682.lllIIIllIIIIlllIlIIllIIll((double)(n2 + 1), (double)(8 + n), 0.0);
                class_08682.lllIIIllIIIIlllIlIIllIIll((double)(n2 + 1), (double)(-1 + n), 0.0);
                class_08682.lllIIIllIIIIlllIlIIllIIll();
                GL11.glEnable((int)3553);
                class_18542.lllIlIIlIIIlIlIIIllIlllIl(string, -class_18542.lllIIIllIIIIlllIlIIllIIll(string) / 2, n, 0x20FFFFFF);
                GL11.glEnable((int)2929);
                GL11.glDepthMask((boolean)true);
                class_18542.lllIlIIlIIIlIlIIIllIlllIl(string, -class_18542.lllIIIllIIIIlllIlIIllIIll(string) / 2, n, -1);
                GL11.glEnable((int)2896);
                GL11.glDisable((int)3042);
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                GL11.glPopMatrix();
            }
        }
    }

    public UUID lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public String[] IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public void lllIIIllIIIIlllIlIIllIIll(String[] arrstring) {
        this.lllIlIIlIIIlIlIIIllIlllIl = arrstring;
    }

    public double lIlllIlllIIIIlIIlllIllIII() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public double IlIIIIIllllllIIlllIllllll() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    public double lIllllIIlIIIlIllllllIIIll() {
        return this.IlIIIIIllllllIIlllIllllll;
    }

    public static List IIIllIIlIIIIIIlIlIIllIIlI() {
        return lIllllIIlIIIlIllllllIIIll;
    }
}

