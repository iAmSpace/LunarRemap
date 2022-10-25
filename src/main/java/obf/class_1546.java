package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.util.glu.Project
 */
import java.awt.Color;

import com.moonsworth.lunar.client.LunarClient;
import net.minecraft.client.Minecraft;
import net.minecraft.util.MathHelper;
import net.minecraft.client.renderer.OpenGlHelper;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.Project;

public class class_1546
extends class_0935 {
    private final ResourceLocation lllIlIIlIIIlIlIIIllIlllIl = new ResourceLocation("client/logo_1024.png");
    private class_2202 lIllllIIlIIIlIllllllIIIll;
    private ResourceLocation IIIllIIlIIIIIIlIlIIllIIlI;
    public static int lllIIIllIIIIlllIlIIllIIll = 4100;
    private final class_0980 IllIIlllllllIIlIIlIIIIlIl;
    private final class_0980 IIIllIllIIlIlIlIlIllllIIl;
    private final class_0968 IllIIIllIIIIlIlIlIllIIlll;
    private final class_1663 lIIIIlIlIIlllllIIllIIlIII = new class_1663("OPTIONS");
    private final class_1663 lIlllIlllIlIIIIlllIlIlIIl;
    private final class_1663 IlIIlllllIIlIlIlllllIllll = new class_1663("COSMETICS");
    private final class_0730 llIIlIlIlllIIllIlIlllIllI;
    private static final ResourceLocation[] IllIIIIllIIllIllIlllIlIIl = new ResourceLocation[]{new ResourceLocation("client/panorama/0.png"), new ResourceLocation("client/panorama/1.png"), new ResourceLocation("client/panorama/2.png"), new ResourceLocation("client/panorama/3.png"), new ResourceLocation("client/panorama/4.png"), new ResourceLocation("client/panorama/5.png")};
    private float IIIIIIIIlIllIIllIIlllIllI;

    public class_1546() {
        this.lIlllIlllIlIIIIlllIlIlIIl = new class_1663("CHANGELOG");
        this.llIIlIlIlllIIllIlIlllIllI = new class_0730(0xF000000, -16777216);
        this.IllIIlllllllIIlIIlIIIIlIl = new class_0980(2.0f, new ResourceLocation("client/icons/delete-64.png"));
        this.IIIllIllIIlIlIlIlIllllIIl = new class_0980(6.0f, new ResourceLocation("client/icons/globe-24.png"));
        for (class_2051 class_20512 : LunarClient.getInstance().IlIIlllllIIlIlIlllllIllll().lllIIIllIIIIlllIlIIllIIll()) {
            String string = class_20512.IlIIIIIllllllIIlllIllllll().lIlllIlllIIIIlIIlllIllIII();
            this.IIIIIIIIlIllIIllIIlllIllI = Math.max(this.IIIIIIIIlIllIIllIIlllIllI, (float) LunarClient.getInstance().robotoRegular13px.lllIlIIlIIIlIlIIIllIlllIl(string));
        }
        this.IllIIIllIIIIlIlIlIllIIlll = new class_0968(this, Minecraft.getMinecraft().getSession().getUsername(), LunarClient.getInstance().lllIIIllIIIIlllIlIIllIIll(Minecraft.getMinecraft().getSession().getUsername(), Minecraft.getMinecraft().getSession().getPlayerID()));
    }

    @Override
    public void a_() {
        super.a_();
        if (this.IllIIIllIIIIlIlIlIllIIlll != null) {
            this.IllIIIllIIIIlIlIlIllIIlll.IlIllllllIIlIIllllIIlIIIl();
        }
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
        super.IlIllllllIIlIIllllIIlIIIl();
        ++lllIIIllIIIIlllIlIIllIIll;
    }

    @Override
    public void n_() {
        super.n_();
        this.lIllllIIlIIIlIllllllIIIll = new class_2202(256, 256);
        this.IIIllIIlIIIIIIlIlIIllIIlI = this.lllllIlllIIllIlIIlIIIllII.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll("background", this.lIllllIIlIIIlIllllllIIIll);
        this.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(114.0f, 10.0f, 42.0f, 20.0f);
        this.IlIIlllllIIlIlIlllllIllll.lllIIIllIIIIlllIlIIllIIll(157.0f, 10.0f, 48.0f, 20.0f);
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll() - 30.0f, 11.0f, 23.0f, 17.0f);
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll() / 2.0f - 13.0f, this.IIIllIIlIIIIIIlIlIIllIIlI() - 17.0f, 26.0f, 18.0f);
        this.llIIllIllIlIIlIIllIllllll();
    }

    public void llIIllIllIlIIlIIllIllllll() {
        this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll() - 35.0f - this.IllIIIllIIIIlIlIlIllIIlll.IlIIIIIllllllIIlllIllllll(this.IIIIIIIIlIllIIllIIlllIllI), 11.0f, this.IllIIIllIIIIlIlIlIllIIlll.IlIIIIIllllllIIlllIllllll(this.IIIIIIIIlIllIIllIIlllIllI), 17.0f);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
        GL11.glDisable((int)3008);
        this.lllIlIIlIIIlIlIIIllIlllIl(n, n2, 1.0f);
        GL11.glEnable((int)3008);
        super.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(float f, float f2) {
        boolean bl = f < this.lIIIIlIlIIlllllIIllIIlIII.lIlllIlllIIIIlIIlllIllIII() && f2 < 30.0f;
        Color color = this.llIIlIlIlllIIllIlIlllIllI.lllIlIIlIIIlIlIIIllIlllIl(bl);
        LunarClient.getInstance().robotoRegular24px.lllIIIllIIIIlllIlIIllIIll("Lunar Client", 27.0f, 13.0f, color.getRGB());
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        LunarClient.getInstance().robotoRegular24px.lllIIIllIIIIlllIlIIllIIll("Lunar Client", 26.0f, 12.0f, -1);
        String string = "Lunar Client Alpha (" + LunarClient.getGitCommitIdAbbrv() + "/" + LunarClient.llIIlllIllIllllIIIlIIIIII() + ")";
        LunarClient.getInstance().robotoLight18px.lllIIIllIIIIlllIlIIllIIll(string, 5.0, (double)(this.IIIllIIlIIIIIIlIlIIllIIlI() - 14.0f), -1879048193);
        String string2 = "Copyright Mojang AB. Do not distribute!";
        LunarClient.getInstance().robotoLight18px.lllIIIllIIIIlllIlIIllIIll(string2, (double)(this.lIllllIIlIIIlIllllllIIIll() - (float) LunarClient.getInstance().robotoLight18px.lllIlIIlIIIlIlIIIllIlllIl(string2) - 5.0f), (double)(this.IIIllIIlIIIIIIlIlIIllIIlI() - 14.0f), -1879048193);
        this.IllIIlllllllIIlIIlIIIIlIl.lllIlIIlIIIlIlIIIllIlllIl(f, f2, true);
        this.IIIllIllIIlIlIlIlIllllIIl.lllIlIIlIIIlIlIIIllIlllIl(f, f2, true);
        this.IllIIIllIIIIlIlIlIllIIlll.lllIlIIlIIIlIlIIIllIlllIl(f, f2, true);
        this.lIIIIlIlIIlllllIIllIIlIII.lllIlIIlIIIlIlIIIllIlllIl(f, f2, true);
        this.IlIIlllllIIlIlIlllllIllll.lllIlIIlIIIlIlIIIllIlllIl(f, f2, true);
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(float f, float f2, int n) {
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(f, f2, n, true);
        this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(f, f2, n, true);
        if (this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(f, f2)) {
            this.lllllIlllIIllIlIIlIIIllII.IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
            this.lllllIlllIIllIlIIlIIIllII.llIIllIllIlIIlIIllIllllll();
        } else if (this.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(f, f2)) {
            this.lllllIlllIIllIlIIlIIIllII.IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
            this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(new class_2003(this, this.lllllIlllIIllIlIIlIIIllII.gameSettings));
        } else if (this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(f, f2)) {
            this.lllllIlllIIllIlIIlIIIllII.IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
            this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(new class_0671(this, this.lllllIlllIIllIlIIlIIIllII.gameSettings, this.lllllIlllIIllIlIIlIIIllII.llllIlIIIIIIIIIlllIIlIIIl()));
        } else if (this.IlIIlllllIIlIlIlllllIllll.lllIIIllIIIIlllIlIIllIIll(f, f2)) {
            this.lllllIlllIIllIlIIlIIIllII.IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
            this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(new class_0252());
        } else {
            boolean bl;
            boolean bl2 = bl = f < this.lIIIIlIlIIlllllIIllIIlIII.lIlllIlllIIIIlIIlllIllIII() && f2 < 30.0f;
            if (bl && !(this.lllllIlllIIllIlIIlIIIllII.lllllIlllIIllIlIIlIIIllII instanceof class_0909)) {
                this.lllllIlllIIllIlIIlIIIllII.IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
                this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(new class_0909());
            }
        }
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(float f, float f2, int n) {
    }

    private void lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, float f) {
        this.lllllIlllIIllIlIIlIIIllII.lllIlIIlIIIlIlIIIllIlllIl().IlIIIIIllllllIIlllIllllll();
        GL11.glViewport((int)0, (int)0, (int)256, (int)256);
        this.IlIllllllIIlIIllllIIlIIIl(n, n2, f);
        this.lllIIIllIIIIlllIlIIllIIll(f);
        this.lllIIIllIIIIlllIlIIllIIll(f);
        this.lllIIIllIIIIlllIlIIllIIll(f);
        this.lllIIIllIIIIlllIlIIllIIll(f);
        this.lllIIIllIIIIlllIlIIllIIll(f);
        this.lllIIIllIIIIlllIlIIllIIll(f);
        this.lllIIIllIIIIlllIlIIllIIll(f);
        this.lllllIlllIIllIlIIlIIIllII.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(true);
        GL11.glViewport((int)0, (int)0, (int)this.lllllIlllIIllIlIIlIIIllII.displayWidth, (int)this.lllllIlllIIllIlIIlIIIllII.displayHeight);
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        class_08682.lllIlIIlIIIlIlIIIllIlllIl();
        float f2 = this.IlIlIIlllIIlIllIIIlllllIl > this.lIIlIIIIIlIlllIlIIlIlIlll ? 120.0f / (float)this.IlIlIIlllIIlIllIIIlllllIl : 120.0f / (float)this.lIIlIIIIIlIlllIlIIlIlIlll;
        float f3 = (float)this.lIIlIIIIIlIlllIlIIlIlIlll * f2 / 256.0f;
        float f4 = (float)this.IlIlIIlllIIlIllIIIlllllIl * f2 / 256.0f;
        class_08682.lllIIIllIIIIlllIlIIllIIll(1.0f, 1.0f, 1.0f, 1.0f);
        float f5 = this.IlIlIIlllIIlIllIIIlllllIl;
        float f6 = this.lIIlIIIIIlIlllIlIIlIlIlll;
        class_08682.lllIIIllIIIIlllIlIIllIIll(0.0, f6, IlIlllIIIIIIlIIllIIllIlll, 0.5f - f3, 0.5f + f4);
        class_08682.lllIIIllIIIIlllIlIIllIIll(f5, f6, IlIlllIIIIIIlIIllIIllIlll, 0.5f - f3, 0.5f - f4);
        class_08682.lllIIIllIIIIlllIlIIllIIll(f5, 0.0, IlIlllIIIIIIlIIllIIllIlll, 0.5f + f3, 0.5f - f4);
        class_08682.lllIIIllIIIIlllIlIIllIIll(0.0, 0.0, IlIlllIIIIIIlIIllIIllIlll, 0.5f + f3, 0.5f + f4);
        class_08682.lllIIIllIIIIlllIlIIllIIll();
    }

    private void IlIllllllIIlIIllllIIlIIIl(int n, int n2, float f) {
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        GL11.glMatrixMode((int)5889);
        GL11.glPushMatrix();
        GL11.glLoadIdentity();
        Project.gluPerspective((float)120.0f, (float)1.0f, (float)0.05f, (float)10.0f);
        GL11.glMatrixMode((int)5888);
        GL11.glPushMatrix();
        GL11.glLoadIdentity();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glRotatef((float)180.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3008);
        GL11.glDisable((int)2884);
        GL11.glDepthMask((boolean)false);
        OpenGlHelper.glBlendFunc(770, 771, 1, 0);
        int n3 = 8;
        for (int i = 0; i < n3 * n3; ++i) {
            GL11.glPushMatrix();
            float f2 = ((float)(i % n3) / (float)n3 - 0.5f) / 64.0f;
            float f3 = ((float)(i / n3) / (float)n3 - 0.5f) / 64.0f;
            float f4 = 0.0f;
            GL11.glTranslatef((float)f2, (float)f3, (float)f4);
            GL11.glRotatef((float)(MathHelper.lllIIIllIIIIlllIlIIllIIll(((float)lllIIIllIIIIlllIlIIllIIll + f) / 400.0f) * 25.0f + 20.0f), (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)(-((float)lllIIIllIIIIlllIlIIllIIll + f) * 0.1f), (float)0.0f, (float)1.0f, (float)0.0f);
            for (int j = 0; j < 6; ++j) {
                GL11.glPushMatrix();
                if (j == 1) {
                    GL11.glRotatef((float)90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                }
                if (j == 2) {
                    GL11.glRotatef((float)180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                }
                if (j == 3) {
                    GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                }
                if (j == 4) {
                    GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                }
                if (j == 5) {
                    GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                }
                this.lllllIlllIIllIlIIlIIIllII.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(IllIIIIllIIllIllIlllIlIIl[j]);
                class_08682.lllIlIIlIIIlIlIIIllIlllIl();
                class_08682.lllIIIllIIIIlllIlIIllIIll(0xFFFFFF, 255 / (i + 1));
                float f5 = 0.0f;
                class_08682.lllIIIllIIIIlllIlIIllIIll(-1.0, -1.0, 1.0, 0.0f + f5, 0.0f + f5);
                class_08682.lllIIIllIIIIlllIlIIllIIll(1.0, -1.0, 1.0, 1.0f - f5, 0.0f + f5);
                class_08682.lllIIIllIIIIlllIlIIllIIll(1.0, 1.0, 1.0, 1.0f - f5, 1.0f - f5);
                class_08682.lllIIIllIIIIlllIlIIllIIll(-1.0, 1.0, 1.0, 0.0f + f5, 1.0f - f5);
                class_08682.lllIIIllIIIIlllIlIIllIIll();
                GL11.glPopMatrix();
            }
            GL11.glPopMatrix();
            GL11.glColorMask((boolean)true, (boolean)true, (boolean)true, (boolean)false);
        }
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(0.0, 0.0, 0.0);
        GL11.glColorMask((boolean)true, (boolean)true, (boolean)true, (boolean)true);
        GL11.glMatrixMode((int)5889);
        GL11.glPopMatrix();
        GL11.glMatrixMode((int)5888);
        GL11.glPopMatrix();
        GL11.glDepthMask((boolean)true);
        GL11.glEnable((int)2884);
        GL11.glEnable((int)2929);
    }

    private void lllIIIllIIIIlllIlIIllIIll(float f) {
        this.lllllIlllIIllIlIIlIIIllII.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(this.IIIllIIlIIIIIIlIlIIllIIlI);
        GL11.glTexParameteri((int)3553, (int)10241, (int)9729);
        GL11.glTexParameteri((int)3553, (int)10240, (int)9729);
        GL11.glCopyTexSubImage2D((int)3553, (int)0, (int)0, (int)0, (int)0, (int)0, (int)256, (int)256);
        GL11.glEnable((int)3042);
        OpenGlHelper.glBlendFunc(770, 771, 1, 0);
        GL11.glColorMask((boolean)true, (boolean)true, (boolean)true, (boolean)false);
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        class_08682.lllIlIIlIIIlIlIIIllIlllIl();
        GL11.glDisable((int)3008);
        int n = 3;
        for (int i = 0; i < n; ++i) {
            class_08682.lllIIIllIIIIlllIlIIllIIll(1.0f, 1.0f, 1.0f, 1.0f / (float)(i + 1));
            float f2 = this.IlIlIIlllIIlIllIIIlllllIl;
            float f3 = this.lIIlIIIIIlIlllIlIIlIlIlll;
            float f4 = (float)(i - n / 2) / 256.0f;
            class_08682.lllIIIllIIIIlllIlIIllIIll(f2, f3, IlIlllIIIIIIlIIllIIllIlll, 0.0f + f4, 1.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll(f2, 0.0, IlIlllIIIIIIlIIllIIllIlll, 1.0f + f4, 1.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll(0.0, 0.0, IlIlllIIIIIIlIIllIIllIlll, 1.0f + f4, 0.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll(0.0, f3, IlIlllIIIIIIlIIllIIllIlll, 0.0f + f4, 0.0);
        }
        class_08682.lllIIIllIIIIlllIlIIllIIll();
        GL11.glEnable((int)3008);
        GL11.glColorMask((boolean)true, (boolean)true, (boolean)true, (boolean)true);
    }
}

