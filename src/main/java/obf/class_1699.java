package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.GL11
 */
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import com.moonsworth.lunar.client.LunarClient;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public class class_1699
extends class_2117 {
    private class_1609 lllIIIllIIIIlllIlIIllIIll;
    private List IllIIlllllllIIlIIlIIIIlIl;
    private boolean IIIllIllIIlIlIlIlIllllIIl = false;
    private boolean IllIIIllIIIIlIlIlIllIIlll = false;
    private boolean lIIIIlIlIIlllllIIllIIlIII = false;
    private boolean llIIlllIllIllllIIIlIIIIII = false;
    private class_1788 llIIllIllIlIIlIIllIllllll;
    private float lllIIlIIIllllllIIIIlIlIlI = 1.0f;
    private float IlIlllIIIIIIlIIllIIllIlll = 1.0f;
    private float IlIlIIlIlIllIIlIlIIllIIIl;
    private float lllllIlllIIllIlIIlIIIllII;
    private float IlIlIIlllIIlIllIIIlllllIl;
    private float lIIlIIIIIlIlllIlIIlIlIlll;
    private float lIlIlIIlIIIIlIIIIIlllIIII;
    private float IlIIIlIIIIllIIIllIIIIIIll;
    private int IIlllIlIlllIllIIIlllIIlIl;
    private int lIlIllIIlIIlIIlIIlIIlIIll;
    private int llIIlIllIllllIlIIIIlIIlll;
    private int llIllllIlIllIIIlIllIIlIlI;

    public class_1699(class_1609 class_16092, float f) {
        super(f);
        this.lllIIIllIIIIlllIlIIllIIll = class_16092;
        this.llIIllIllIlIIlIIllIllllll = new class_1788(f, (Integer)class_16092.lIlllIlllIIIIlIIlllIllIII(), 1.0f);
        this.IllIIlllllllIIlIIlIIIIlIl = new ArrayList();
        for (int i = 0; i < 16; ++i) {
            int n = Minecraft.getMinecraft().IlIlllIIIIIIlIIllIIllIlll.IlIllllllIIlIIllllIIlIIIl[i];
            this.IllIIlllllllIIlIIlIIIIlIl.add(new class_1788(f, n, 1.0f));
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
        String string;
        this.IIIllIIlIIIIIIlIlIIllIIlI = this.IIIllIllIIlIlIlIlIllllIIl ? 130 : 18;
        this.IlIlIIlIlIllIIlIlIIllIIIl = this.lIlllIlllIIIIlIIlllIllIII + 56;
        this.IlIlIIlllIIlIllIIIlllllIl = this.lIlllIlllIIIIlIIlllIllIII + 176;
        this.lllllIlllIIllIlIIlIIIllII = this.IlIIIIIllllllIIlllIllllll + 25;
        this.lIIlIIIIIlIlllIlIIlIlIlll = this.IlIIIIIllllllIIlllIllllll + 119;
        this.lIlIlIIlIIIIlIIIIIlllIIII = this.IlIlIIlllIIlIllIIIlllllIl - this.IlIlIIlIlIllIIlIlIIllIIIl;
        this.IlIIIlIIIIllIIIllIIIIIIll = this.lIIlIIIIIlIlllIlIIlIlIlll - this.lllllIlllIIllIlIIlIIIllII;
        LunarClient.getInstance().ubuntuMedium16px.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll.lIllllIIlIIIlIllllllIIIll().toUpperCase(), this.lIlllIlllIIIIlIIlllIllIII + 10, (float)(this.IlIIIIIllllllIIlllIllllll + 4), Color.LIGHT_GRAY.getRGB());
        this.llIIllIllIlIIlIIllIllllll.lllIIIllIIIIlllIlIIllIIll = this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll();
        this.llIIllIllIlIIlIIllIllllll.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII + 160, this.IlIIIIIllllllIIlllIllllll + 3, 14, 14);
        this.llIIllIllIlIIlIIllIllllll.IlIllllllIIlIIllllIIlIIIl = this.IlIllllllIIlIIllllIIlIIIl;
        this.llIIllIllIlIIlIIllIllllll.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
        class_0210.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII + 186, this.IlIIIIIllllllIIlllIllllll + 16, this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll - 16, this.IlIIIIIllllllIIlllIllllll + 17, Color.LIGHT_GRAY.getRGB());
        LunarClient.getInstance().robotoLight18px.lllIIIllIIIIlllIlIIllIIll("#", this.lIlllIlllIIIIlIIlllIllIII + 188, (float)(this.IlIIIIIllllllIIlllIllllll + 4), Color.LIGHT_GRAY.getRGB());
        LunarClient.getInstance().robotoLight18px.lllIIIllIIIIlllIlIIllIIll(Integer.toHexString(this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll()), this.lIlllIlllIIIIlIIlllIllIII + 194, (float)(this.IlIIIIIllllllIIlllIllllll + 4), Color.WHITE.getRGB());
        boolean bl = (float)n > (float)(this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll - 40) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n < (float)(this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll - 12) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n2 > (float)(this.IlIIIIIllllllIIlllIllllll + this.IlIllllllIIlIIllllIIlIIIl) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n2 < (float)(this.IlIIIIIllllllIIlllIllllll + 18 + this.IlIllllllIIlIIllllIIlIIIl) * this.lllIlIIlIIIlIlIIIllIlllIl;
        String string2 = string = bl ? "(Favorite)" : "(+)";
        if (LunarClient.getInstance().getSettingsManager().lllIIIllIIIIlllIlIIllIIll((Integer)this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII())) {
            string = bl ? "(Un-favorite)" : "(-)";
        }
        LunarClient.getInstance().robotoLight18px.lllIIIllIIIIlllIlIIllIIll(string, this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll - 16 - LunarClient.getInstance().robotoLight18px.lllIlIIlIIIlIlIIIllIlllIl(string), (float)(this.IlIIIIIllllllIIlllIllllll + 4), bl ? Color.WHITE.getRGB() : Color.LIGHT_GRAY.getRGB());
        if (this.IIIllIllIIlIlIlIlIllllIIl) {
            if (this.IllIIIllIIIIlIlIlIllIIlll && !Mouse.isButtonDown((int)0)) {
                this.IllIIIllIIIIlIlIlIllIIlll = false;
                this.lllIlIIlIIIlIlIIIllIlllIl();
            }
            if (this.lIIIIlIlIIlllllIIllIIlIII && !Mouse.isButtonDown((int)0)) {
                this.lIIIIlIlIIlllllIIllIIlIII = false;
                this.lllIlIIlIIIlIlIIIllIlllIl();
            }
            if (this.llIIlllIllIllllIIIlIIIIII && !Mouse.isButtonDown((int)0)) {
                this.llIIlllIllIllllIIIlIIIIII = false;
                this.lllIlIIlIIIlIlIIIllIlllIl();
            }
            class_0210.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII + 55, this.IlIIIIIllllllIIlllIllllll + 24, this.lIlllIlllIIIIlIIlllIllIII + 177, this.IlIIIIIllllllIIlllIllllll + 120, -822083584);
            class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
            GL11.glDisable((int)3553);
            class_08682.lllIlIIlIIIlIlIIIllIlllIl();
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)this.IlIlIIlIlIllIIlIlIIllIIIl, (double)this.lIIlIIIIIlIlllIlIIlIlIlll, 0.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)this.IlIlIIlllIIlIllIIIlllllIl, (double)this.lIIlIIIIIlIlllIlIIlIlIlll, 0.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)this.IlIlIIlllIIlIllIIIlllllIl, (double)this.lllllIlllIIllIlIIlIIIllII, 0.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)this.IlIlIIlIlIllIIlIlIIllIIIl, (double)this.lllllIlllIIllIlIIlIIIllII, 0.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll();
            int[] arrn = null;
            int n3 = 0;
            while ((float)n3 < this.lIlIlIIlIIIIlIIIIIlllIIII) {
                int n4 = 0;
                while ((float)n4 < this.IlIIIlIIIIllIIIllIIIIIIll) {
                    boolean bl2;
                    float f2 = (float)n3 / this.lIlIlIIlIIIIlIIIIIlllIIII;
                    float f3 = 1.0f - (float)n4 / this.IlIIIlIIIIllIIIllIIIIIIll;
                    int n5 = (int)this.IlIlllIIIIIIlIIllIIllIlll << 24 | Color.HSBtoRGB(this.lllIIlIIIllllllIIIIlIlIlI, f2, f3);
                    boolean bl3 = (float)n >= (this.IlIlIIlIlIllIIlIlIIllIIIl + (float)n3) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n <= (this.IlIlIIlIlIllIIlIlIIllIIIl + (float)n3 + 1.0f) * this.lllIlIIlIIIlIlIIIllIlllIl;
                    boolean bl4 = (float)n2 <= (this.lllllIlllIIllIlIIlIIIllII + (float)n4 + 1.0f + (float)this.IlIllllllIIlIIllllIIlIIIl) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n2 > (this.lllllIlllIIllIlIIlIIIllII + (float)n4 + (float)this.IlIllllllIIlIIllllIIlIIIl) * this.lllIlIIlIIIlIlIIIllIlllIl;
                    boolean bl5 = bl3 && bl4;
                    boolean bl6 = n3 == 0 && (float)n < this.IlIlIIlIlIllIIlIlIIllIIIl * this.lllIlIIlIIIlIlIIIllIlllIl && bl4;
                    boolean bl7 = n4 == 0 && (float)n2 < (this.lllllIlllIIllIlIIlIIIllII + (float)this.IlIllllllIIlIIllllIIlIIIl) * this.lllIlIIlIIIlIlIIIllIlllIl && bl3;
                    boolean bl8 = (float)n3 == this.lIlIlIIlIIIIlIIIIIlllIIII - 1.0f && (float)n > (this.IlIlIIlIlIllIIlIlIIllIIIl + this.lIlIlIIlIIIIlIIIIIlllIIII) * this.lllIlIIlIIIlIlIIIllIlllIl && bl4;
                    boolean bl9 = bl2 = (float)n4 == this.IlIIIlIIIIllIIIllIIIIIIll - 1.0f && (float)n2 > (this.lllllIlllIIllIlIIlIIIllII + this.IlIIIlIIIIllIIIllIIIIIIll + (float)this.IlIllllllIIlIIllllIIlIIIl) * this.lllIlIIlIIIlIlIIIllIlllIl && bl3;
                    if (this.IllIIIllIIIIlIlIlIllIIlll && (bl5 || bl6 || bl7 || bl8 || bl2)) {
                        this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl(n5);
                        this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl = new int[]{n3, n4};
                    }
                    if (this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl != null) {
                        arrn = this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl;
                    } else if (n5 == (Integer)this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII()) {
                        arrn = new int[]{n3, n4};
                    }
                    class_08682.lllIlIIlIIIlIlIIIllIlllIl();
                    GL11.glColor4f((float)((float)(n5 >> 16 & 0xFF) / 255.0f), (float)((float)(n5 >> 8 & 0xFF) / 255.0f), (float)((float)(n5 & 0xFF) / 255.0f), (float)1.0f);
                    class_08682.lllIIIllIIIIlllIlIIllIIll((double)(this.IlIlIIlIlIllIIlIlIIllIIIl + (float)n3), (double)(this.lllllIlllIIllIlIIlIIIllII + (float)n4 + 1.0f), 0.0);
                    class_08682.lllIIIllIIIIlllIlIIllIIll((double)(this.IlIlIIlIlIllIIlIlIIllIIIl + (float)n3 + 1.0f), (double)(this.lllllIlllIIllIlIIlIIIllII + (float)n4 + 1.0f), 0.0);
                    class_08682.lllIIIllIIIIlllIlIIllIIll((double)(this.IlIlIIlIlIllIIlIlIIllIIIl + (float)n3 + 1.0f), (double)(this.lllllIlllIIllIlIIlIIIllII + (float)n4), 0.0);
                    class_08682.lllIIIllIIIIlllIlIIllIIll((double)(this.IlIlIIlIlIllIIlIlIIllIIIl + (float)n3), (double)(this.lllllIlllIIllIlIIlIIIllII + (float)n4), 0.0);
                    class_08682.lllIIIllIIIIlllIlIIllIIll();
                    ++n4;
                }
                ++n3;
            }
            if (arrn != null) {
                GL11.glPushMatrix();
                GL11.glColor4f((float)0.0f, (float)0.0f, (float)0.0f, (float)0.75f);
                class_0857.lllIIIllIIIIlllIlIIllIIll(this.IlIlIIlIlIllIIlIlIIllIIIl + (float)arrn[0] + 1.115f, this.lllllIlllIIllIlIIlIIIllII + (float)arrn[1] + 1.115f, 4.0);
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                class_0857.lllIIIllIIIIlllIlIIllIIll(this.IlIlIIlIlIllIIlIlIIllIIIl + (float)arrn[0] + 1.115f, this.lllllIlllIIllIlIIlIIIllII + (float)arrn[1] + 1.115f, 2.7f);
                GL11.glPopMatrix();
            }
            class_0210.lllIIIllIIIIlllIlIIllIIll(this.IlIlIIlIlIllIIlIlIIllIIIl - 51.0f, this.lllllIlllIIllIlIIlIIIllII + 1.0f, this.IlIlIIlIlIllIIlIlIIllIIIl - 43.0f, this.lllllIlllIIllIlIIlIIIllII + 9.0f, -16777216);
            class_0210.lllIIIllIIIIlllIlIIllIIll(this.IlIlIIlIlIllIIlIlIIllIIIl - 50.0f, this.lllllIlllIIllIlIIlIIIllII + 2.0f, this.IlIlIIlIlIllIIlIlIIllIIIl - 44.0f, this.lllllIlllIIllIlIIlIIIllII + 8.0f, this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll ? -13369549 : -1);
            LunarClient.getInstance().robotoLight16px.lllIIIllIIIIlllIlIIllIIll("CHROMA", this.IlIlIIlIlIllIIlIlIIllIIIl - 40.0f, this.lllllIlllIIllIlIIlIIIllII, -1358954496);
            this.IlIllllllIIlIIllllIIlIIIl(n, n2);
            this.lllIlIIlIIIlIlIIIllIlllIl(n, n2);
            this.IIlllIlIlllIllIIIlllIIlIl = (int)(this.IlIlIIlIlIllIIlIlIIllIIIl + this.lIlIlIIlIIIIlIIIIIlllIIII + 64.0f);
            this.lIlIllIIlIIlIIlIIlIIlIIll = (int)this.lllllIlllIIllIlIIlIIIllII;
            this.lllIIIllIIIIlllIlIIllIIll(LunarClient.getInstance().getSettingsManager().lIlIlIIIIIIlIIllllIlIIllI, this.IIlllIlIlllIllIIIlllIIlIl, this.lIlIllIIlIIlIIlIIlIIlIIll, n, n2, (int)f);
            this.llIIlIllIllllIlIIIIlIIlll = (int)(this.IlIlIIlIlIllIIlIlIIllIIIl + this.lIlIlIIlIIIIlIIIIIlllIIII + 94.0f);
            this.llIllllIlIllIIIlIllIIlIlI = (int)this.lllllIlllIIllIlIIlIIIllII;
            this.lllIIIllIIIIlllIlIIllIIll(LunarClient.getInstance().getSettingsManager().llIIlIIllIIllIlIIllIIllII, this.llIIlIllIllllIlIIIIlIIlll, this.llIllllIlIllIIIlIllIIlIlI, n, n2, (int)f);
            this.lllIIIllIIIIlllIlIIllIIll(this.IllIIlllllllIIlIIlIIIIlIl, (int)(this.IlIlIIlIlIllIIlIlIIllIIIl + this.lIlIlIIlIIIIlIIIIIlllIIII + 34.0f), (int)this.lllllIlllIIllIlIIlIIIllII, n, n2, (int)f);
        }
    }

    private void lllIlIIlIIIlIlIIIllIlllIl() {
        if (LunarClient.getInstance().getSettingsManager().lIlIlIIIIIIlIIllllIlIIllI.size() >= 16) {
            LunarClient.getInstance().getSettingsManager().lIlIlIIIIIIlIIllllIlIIllI.remove(0);
        }
        LunarClient.getInstance().getSettingsManager().lIlIlIIIIIIlIIllllIlIIllI.add(new class_1788(this.lllIlIIlIIIlIlIIIllIlllIl, (Integer)this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII(), 1.0f));
        Minecraft.getMinecraft().IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
    }

    private void lllIlIIlIIIlIlIIIllIlllIl(int n, int n2) {
        class_0210.lllIIIllIIIIlllIlIIllIIll(this.IlIlIIlIlIllIIlIlIIllIIIl + this.lIlIlIIlIIIIlIIIIIlllIIII + 18.0f, this.lllllIlllIIllIlIIlIIIllII - 1.0f, this.IlIlIIlIlIllIIlIlIIllIIIl + this.lIlIlIIlIIIIlIIIIIlllIIII + 28.0f, this.lllllIlllIIllIlIIlIIIllII + 1.0f + this.IlIIIlIIIIllIIIllIIIIIIll, -822083584);
        this.IlIllllllIIlIIllllIIlIIIl();
        int n3 = 0;
        while ((float)n3 < this.IlIIIlIIIIllIIIllIIIIIIll) {
            int n4 = (Integer)this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII();
            int n5 = new Color(n4 >> 16 & 0xFF, n4 >> 8 & 0xFF, n4 & 0xFF, Math.round(255.0f - (float)n3 / this.IlIIIlIIIIllIIIllIIIIIIll * 255.0f)).getRGB();
            if (this.llIIlllIllIllllIIIlIIIIII && (float)n2 >= ((float)this.IlIllllllIIlIIllllIIlIIIl + this.lllllIlllIIllIlIIlIIIllII + (float)n3) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n2 <= ((float)this.IlIllllllIIlIIllllIIlIIIl + this.lllllIlllIIllIlIIlIIIllII + (float)n3 + 1.0f) * this.lllIlIIlIIIlIlIIIllIlllIl) {
                this.IlIlllIIIIIIlIIllIIllIlll = (float)n3 / this.IlIIIlIIIIllIIIllIIIIIIll;
                this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl(n5);
            }
            class_0210.lllIIIllIIIIlllIlIIllIIll(this.IlIlIIlIlIllIIlIlIIllIIIl + this.lIlIlIIlIIIIlIIIIIlllIIII + 19.0f, this.lllllIlllIIllIlIIlIIIllII + (float)n3, this.IlIlIIlIlIllIIlIlIIllIIIl + this.lIlIlIIlIIIIlIIIIIlllIIII + 27.0f, this.lllllIlllIIllIlIIlIIIllII + (float)n3 + 1.0f, n5);
            ++n3;
        }
        float f = -1.0f + this.IlIIIlIIIIllIIIllIIIIIIll * this.IlIlllIIIIIIlIIllIIllIlll;
        class_0210.lllIIIllIIIIlllIlIIllIIll(this.IlIlIIlIlIllIIlIlIIllIIIl + this.lIlIlIIlIIIIlIIIIIlllIIII + 18.0f, this.lllllIlllIIllIlIIlIIIllII + f, this.IlIlIIlIlIllIIlIlIIllIIIl + this.lIlIlIIlIIIIlIIIIIlllIIII + 28.0f, this.lllllIlllIIllIlIIlIIIllII + f + 3.0f, -822083584);
        class_0210.lllIIIllIIIIlllIlIIllIIll(this.IlIlIIlIlIllIIlIlIIllIIIl + this.lIlIlIIlIIIIlIIIIIlllIIII + 18.0f, this.lllllIlllIIllIlIIlIIIllII + f + 1.0f, this.IlIlIIlIlIllIIlIlIIllIIIl + this.lIlIlIIlIIIIlIIIIIlllIIII + 28.0f, this.lllllIlllIIllIlIIlIIIllII + f + 2.0f, -805306369);
    }

    private void IlIllllllIIlIIllllIIlIIIl(int n, int n2) {
        class_0210.lllIIIllIIIIlllIlIIllIIll(this.IlIlIIlIlIllIIlIlIIllIIIl + this.lIlIlIIlIIIIlIIIIIlllIIII + 4.0f, this.lllllIlllIIllIlIIlIIIllII - 1.0f, this.IlIlIIlIlIllIIlIlIIllIIIl + this.lIlIlIIlIIIIlIIIIIlllIIII + 14.0f, this.lllllIlllIIllIlIIlIIIllII + 1.0f + this.IlIIIlIIIIllIIIllIIIIIIll, -822083584);
        int n3 = 0;
        while ((float)n3 < this.IlIIIlIIIIllIIIllIIIIIIll) {
            int n4;
            if (this.lIIIIlIlIIlllllIIllIIlIII && (float)n2 >= ((float)this.IlIllllllIIlIIllllIIlIIIl + this.lllllIlllIIllIlIIlIIIllII + (float)n3) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n2 <= ((float)this.IlIllllllIIlIIllllIIlIIIl + this.lllllIlllIIllIlIIlIIIllII + (float)n3 + 1.0f) * this.lllIlIIlIIIlIlIIIllIlllIl) {
                n4 = (Integer)this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII();
                float[] arrf = Color.RGBtoHSB(n4 >> 16 & 0xFF, n4 >> 8 & 0xFF, n4 & 0xFF, null);
                this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl(Color.HSBtoRGB(this.lllIIlIIIllllllIIIIlIlIlI, arrf[1], arrf[2]));
                this.lllIIlIIIllllllIIIIlIlIlI = (float)n3 / this.IlIIIlIIIIllIIIllIIIIIIll;
            }
            n4 = Color.HSBtoRGB((float)n3 / this.IlIIIlIIIIllIIIllIIIIIIll, 1.0f, 1.0f);
            class_0210.lllIIIllIIIIlllIlIIllIIll(this.IlIlIIlIlIllIIlIlIIllIIIl + this.lIlIlIIlIIIIlIIIIIlllIIII + 5.0f, this.lllllIlllIIllIlIIlIIIllII + (float)n3, this.IlIlIIlIlIllIIlIlIIllIIIl + this.lIlIlIIlIIIIlIIIIIlllIIII + 13.0f, this.lllllIlllIIllIlIIlIIIllII + (float)n3 + 1.0f, n4);
            ++n3;
        }
        float f = -1.0f + this.IlIIIlIIIIllIIIllIIIIIIll * this.lllIIlIIIllllllIIIIlIlIlI;
        class_0210.lllIIIllIIIIlllIlIIllIIll(this.IlIlIIlIlIllIIlIlIIllIIIl + this.lIlIlIIlIIIIlIIIIIlllIIII + 4.0f, this.lllllIlllIIllIlIIlIIIllII + f, this.IlIlIIlIlIllIIlIlIIllIIIl + this.lIlIlIIlIIIIlIIIIIlllIIII + 14.0f, this.lllllIlllIIllIlIIlIIIllII + f + 3.0f, -822083584);
        class_0210.lllIIIllIIIIlllIlIIllIIll(this.IlIlIIlIlIllIIlIlIIllIIIl + this.lIlIlIIlIIIIlIIIIIlllIIII + 4.0f, this.lllllIlllIIllIlIIlIIIllII + f + 1.0f, this.IlIlIIlIlIllIIlIlIIllIIIl + this.lIlIlIIlIIIIlIIIIIlllIIII + 14.0f, this.lllllIlllIIllIlIIlIIIllII + f + 2.0f, -805306369);
    }

    private void IlIllllllIIlIIllllIIlIIIl() {
        boolean bl = true;
        int n = 2;
        while ((float)n < this.IlIIIlIIIIllIIIllIIIIIIll - 4.0f) {
            if (!bl) {
                class_0210.lllIIIllIIIIlllIlIIllIIll(this.IlIlIIlIlIllIIlIlIIllIIIl + this.lIlIlIIlIIIIlIIIIIlllIIII + 19.0f, this.lllllIlllIIllIlIIlIIIllII + (float)n, this.IlIlIIlIlIllIIlIlIIllIIIl + this.lIlIlIIlIIIIlIIIIIlllIIII + 23.0f, this.lllllIlllIIllIlIIlIIIllII + (float)n + 4.0f, -1);
                class_0210.lllIIIllIIIIlllIlIIllIIll(this.IlIlIIlIlIllIIlIlIIllIIIl + this.lIlIlIIlIIIIlIIIIIlllIIII + 23.0f, this.lllllIlllIIllIlIIlIIIllII + (float)n + 4.0f, this.IlIlIIlIlIllIIlIlIIllIIIl + this.lIlIlIIlIIIIlIIIIIlllIIII + 27.0f, this.lllllIlllIIllIlIIlIIIllII + (float)n + 8.0f, -1);
                class_0210.lllIIIllIIIIlllIlIIllIIll(this.IlIlIIlIlIllIIlIlIIllIIIl + this.lIlIlIIlIIIIlIIIIIlllIIII + 23.0f, this.lllllIlllIIllIlIIlIIIllII + (float)n, this.IlIlIIlIlIllIIlIlIIllIIIl + this.lIlIlIIlIIIIlIIIIIlllIIII + 27.0f, this.lllllIlllIIllIlIIlIIIllII + (float)n + 4.0f, -7303024);
                class_0210.lllIIIllIIIIlllIlIIllIIll(this.IlIlIIlIlIllIIlIlIIllIIIl + this.lIlIlIIlIIIIlIIIIIlllIIII + 19.0f, this.lllllIlllIIllIlIIlIIIllII + (float)n + 4.0f, this.IlIlIIlIlIllIIlIlIIllIIIl + this.lIlIlIIlIIIIlIIIIIlllIIII + 23.0f, this.lllllIlllIIllIlIIlIIIllII + (float)n + 8.0f, -7303024);
            }
            bl = !bl;
            n += 4;
        }
    }

    private void lllIIIllIIIIlllIlIIllIIll(List list, int n, int n2, int n3, int n4, int n5) {
        int n6 = 0;
        int n7 = 0;
        int n8 = 8;
        for (class_1788 class_17882 : list) {
            int n9;
            int n10;
            class_17882.lllIlIIlIIIlIlIIIllIlllIl = this.lllIlIIlIIIlIlIIIllIlllIl;
            if (n6 == n8) {
                ++n7;
                n6 = 0;
            }
            if (list == this.IllIIlllllllIIlIIlIIIIlIl) {
                int n11 = n8 * 2 / 8 * 12;
                n10 = n + n11 - n7 * 12 - 12;
                n9 = n2 + n6 * n11 - n6 * 12;
                class_17882.IlIllllllIIlIIllllIIlIIIl = this.IlIllllllIIlIIllllIIlIIIl;
                class_17882.lllIIIllIIIIlllIlIIllIIll(n10, n9, 10, 10);
                String string = "0123456789abcdefklmnor";
                int n12 = n6 + n7 * n8;
                String string2 = string.substring(n12, n12 + 1);
                if (class_17882.lllIIIllIIIIlllIlIIllIIll(n3, n4)) {
                    class_0210.lllIIIllIIIIlllIlIIllIIll(n10 + 12, n9 - 1, n10 + 26, n9 + 11, -1087492562);
                    LunarClient.getInstance().ubuntuMedium16px.lllIIIllIIIIlllIlIIllIIll("&" + string2, (double)(n10 + 14), (double)n9, -1);
                }
            } else {
                n10 = n + n7 * 12;
                n9 = n2 + n6 * 12;
                class_17882.IlIllllllIIlIIllllIIlIIIl = this.IlIllllllIIlIIllllIIlIIIl;
                class_17882.lllIIIllIIIIlllIlIIllIIll(n10, n9, 10, 10);
            }
            class_17882.lllIIIllIIIIlllIlIIllIIll(n3, n4, (float)n5);
            ++n6;
        }
    }

    private void lllIIIllIIIIlllIlIIllIIll(List list, int n, int n2, int n3, int n4) {
        int n5 = 0;
        int n6 = 0;
        int n7 = 8;
        for (class_1788 class_17882 : list) {
            int n8;
            if (list != this.IllIIlllllllIIlIIlIIIIlIl) {
                if (n5 == n7) {
                    ++n6;
                    n5 = 0;
                }
                int n9 = n + n6 * 12;
                n8 = n2 + n5 * 12;
                class_17882.IlIllllllIIlIIllllIIlIIIl = this.IlIllllllIIlIIllllIIlIIIl;
                class_17882.IlIllllllIIlIIllllIIlIIIl = this.IlIllllllIIlIIllllIIlIIIl;
                class_17882.lllIIIllIIIIlllIlIIllIIll(n9, n8, 10, 10);
            }
            if (class_17882.lllIIIllIIIIlllIlIIllIIll(n3, n4)) {
                if (list == this.IllIIlllllllIIlIIlIIIIlIl) {
                    this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl(new Color(class_17882.lllIIIllIIIIlllIlIIllIIll).getRGB());
                } else {
                    this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl(new Color(class_17882.lllIIIllIIIIlllIlIIllIIll, true).getRGB());
                }
                Minecraft.getMinecraft().IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
                float[] arrf = Color.RGBtoHSB(class_17882.lllIIIllIIIIlllIlIIllIIll >> 16 & 0xFF, class_17882.lllIIIllIIIIlllIlIIllIIll >> 8 & 0xFF, class_17882.lllIIIllIIIIlllIlIIllIIll & 0xFF, null);
                this.lllIIlIIIllllllIIIIlIlIlI = arrf[0];
                n8 = (int)(arrf[1] * this.lIlIlIIlIIIIlIIIIIlllIIII);
                int n10 = (int)(this.IlIIIlIIIIllIIIllIIIIIIll - arrf[2] * this.IlIIIlIIIIllIIIllIIIIIIll);
                this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl = new int[]{n8, n10};
            }
            ++n5;
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        boolean bl;
        boolean bl2 = (float)n > (float)(this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll - 40) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n < (float)(this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll - 12) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n2 > (float)(this.IlIIIIIllllllIIlllIllllll + this.IlIllllllIIlIIllllIIlIIIl) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n2 < (float)(this.IlIIIIIllllllIIlllIllllll + 18 + this.IlIllllllIIlIIllllIIlIIIl) * this.lllIlIIlIIIlIlIIIllIlllIl;
        boolean bl3 = bl = (float)n > (float)this.lIlllIlllIIIIlIIlllIllIII * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n < (float)(this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll - 40) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n2 > (float)(this.IlIIIIIllllllIIlllIllllll + this.IlIllllllIIlIIllllIIlIIIl) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n2 < (float)(this.IlIIIIIllllllIIlllIllllll + 18 + this.IlIllllllIIlIIllllIIlIIIl) * this.lllIlIIlIIIlIlIIIllIlllIl;
        if (bl) {
            Minecraft.getMinecraft().IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
            float[] arrf = Color.RGBtoHSB((Integer)this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII() >> 16 & 0xFF, (Integer)this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII() >> 8 & 0xFF, (Integer)this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII() & 0xFF, null);
            this.lllIIlIIIllllllIIIIlIlIlI = arrf[0];
            int n4 = (int)(arrf[1] * this.lIlIlIIlIIIIlIIIIIlllIIII);
            int n5 = (int)(this.IlIIIlIIIIllIIIllIIIIIIll - arrf[2] * this.IlIIIlIIIIllIIIllIIIIIIll);
            this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl = new int[]{n4, n5};
            this.IIIllIllIIlIlIlIlIllllIIl = !this.IIIllIllIIlIlIlIlIllllIIl;
        } else if (bl2) {
            if (LunarClient.getInstance().getSettingsManager().lllIIIllIIIIlllIlIIllIIll((Integer)this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII())) {
                LunarClient.getInstance().getSettingsManager().lllIlIIlIIIlIlIIIllIlllIl((Integer)this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII());
            } else {
                if (LunarClient.getInstance().getSettingsManager().llIIlIIllIIllIlIIllIIllII.size() >= 16) {
                    LunarClient.getInstance().getSettingsManager().llIIlIIllIIllIlIIllIIllII.remove(0);
                }
                LunarClient.getInstance().getSettingsManager().llIIlIIllIIllIlIIllIIllII.add(new class_1788(this.lllIlIIlIIIlIlIIIllIlllIl, (Integer)this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII(), 1.0f));
            }
            Minecraft.getMinecraft().IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
        } else if (this.IIIllIllIIlIlIlIlIllllIIl) {
            boolean bl4;
            this.lllIIIllIIIIlllIlIIllIIll(this.IllIIlllllllIIlIIlIIIIlIl, 0, 0, n, n2);
            this.lllIIIllIIIIlllIlIIllIIll(LunarClient.getInstance().getSettingsManager().lIlIlIIIIIIlIIllllIlIIllI, this.IIlllIlIlllIllIIIlllIIlIl, this.lIlIllIIlIIlIIlIIlIIlIIll, n, n2);
            this.lllIIIllIIIIlllIlIIllIIll(LunarClient.getInstance().getSettingsManager().llIIlIIllIIllIlIIllIIllII, this.llIIlIllIllllIlIIIIlIIlll, this.llIllllIlIllIIIlIllIIlIlI, n, n2);
            boolean bl5 = bl4 = (float)n > (this.IlIlIIlIlIllIIlIlIIllIIIl - 51.0f) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n2 > (this.lllllIlllIIllIlIIlIIIllII + 1.0f + (float)this.IlIllllllIIlIIllllIIlIIIl) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n < (this.IlIlIIlIlIllIIlIlIIllIIIl - 43.0f) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n2 < (this.lllllIlllIIllIlIIlIIIllII + 9.0f + (float)this.IlIllllllIIlIIllllIIlIIIl) * this.lllIlIIlIIIlIlIIIllIlllIl;
            if ((float)n > this.IlIlIIlIlIllIIlIlIIllIIIl * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n < (this.IlIlIIlIlIllIIlIlIIllIIIl + this.lIlIlIIlIIIIlIIIIIlllIIII) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n2 > (this.lllllIlllIIllIlIIlIIIllII + (float)this.IlIllllllIIlIIllllIIlIIIl) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n2 < (this.lllllIlllIIllIlIIlIIIllII + this.IlIIIlIIIIllIIIllIIIIIIll + (float)this.IlIllllllIIlIIllllIIlIIIl) * this.lllIlIIlIIIlIlIIIllIlllIl) {
                this.IllIIIllIIIIlIlIlIllIIlll = true;
            }
            if ((float)n > (this.IlIlIIlIlIllIIlIlIIllIIIl + this.lIlIlIIlIIIIlIIIIIlllIIII + 4.0f) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n < (this.IlIlIIlIlIllIIlIlIIllIIIl + this.lIlIlIIlIIIIlIIIIIlllIIII + 14.0f) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n2 > (this.lllllIlllIIllIlIIlIIIllII - 1.0f + (float)this.IlIllllllIIlIIllllIIlIIIl) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n2 < (this.lllllIlllIIllIlIIlIIIllII + 1.0f + this.IlIIIlIIIIllIIIllIIIIIIll + (float)this.IlIllllllIIlIIllllIIlIIIl) * this.lllIlIIlIIIlIlIIIllIlllIl) {
                this.lIIIIlIlIIlllllIIllIIlIII = true;
            }
            if ((float)n > (this.IlIlIIlIlIllIIlIlIIllIIIl + this.lIlIlIIlIIIIlIIIIIlllIIII + 18.0f) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n < (this.IlIlIIlIlIllIIlIlIIllIIIl + this.lIlIlIIlIIIIlIIIIIlllIIII + 28.0f) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n2 > (this.lllllIlllIIllIlIIlIIIllII - 1.0f + (float)this.IlIllllllIIlIIllllIIlIIIl) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n2 < (this.lllllIlllIIllIlIIlIIIllII + 1.0f + this.IlIIIlIIIIllIIIllIIIIIIll + (float)this.IlIllllllIIlIIllllIIlIIIl) * this.lllIlIIlIIIlIlIIIllIlllIl) {
                this.llIIlllIllIllllIIIlIIIIII = true;
            }
            if (bl4) {
                Minecraft.getMinecraft().IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
                this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll = !this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll;
            }
        }
    }
}

