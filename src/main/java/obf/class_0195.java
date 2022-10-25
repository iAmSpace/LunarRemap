package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.GL11
 */
import java.awt.Color;

import com.moonsworth.lunar.client.LunarClient;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public class class_0195
extends class_2117 {
    private class_1609 lllIIIllIIIIlllIlIIllIIll;
    private float IllIIlllllllIIlIIlIIIIlIl = -1.0f;
    private float IIIllIllIIlIlIlIlIllllIIl;
    private boolean IllIIIllIIIIlIlIlIllIIlll = false;
    private ResourceLocation lIIIIlIlIIlllllIIllIIlIII = new ResourceLocation("client/icons/sun-64.png");
    private ResourceLocation llIIlllIllIllllIIIlIIIIII = new ResourceLocation("client/icons/moon-64.png");

    public class_0195(class_1609 class_16092, float f) {
        super(f);
        this.lllIIIllIIIIlllIlIIllIIll = class_16092;
        this.IIIllIIlIIIIIIlIlIIllIIlI = 22;
        this.IllIIlllllllIIlIIlIIIIlIl = Float.parseFloat("" + class_16092.lIlllIlllIIIIlIIlllIllIII());
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        boolean bl;
        int n4 = 170;
        boolean bl2 = bl = (float)n > (float)(this.lIlllIlllIIIIlIIlllIllIII + 170) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n < (float)(this.lIlllIlllIIIIlIIlllIllIII + 170 + n4 - 2) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n2 > (float)(this.IlIIIIIllllllIIlllIllllll + 4 + this.IlIllllllIIlIIllllIIlIIIl) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n2 < (float)(this.IlIIIIIllllllIIlllIllllll + 20 + this.IlIllllllIIlIIllllIIlIIIl) * this.lllIlIIlIIIlIlIIIllIlllIl;
        if (n3 == 0 && bl) {
            this.IllIIIllIIIIlIlIlIllIIlll = true;
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
        float f2;
        float f3;
        int n3 = 148;
        LunarClient.getInstance().ubuntuMedium16px.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll.lIllllIIlIIIlIllllllIIIll().toUpperCase(), this.lIlllIlllIIIIlIIlllIllIII + 8, (float)(this.IlIIIIIllllllIIlllIllllll + 8), Color.LIGHT_GRAY.getRGB());
        if (this.IllIIIllIIIIlIlIlIllIIlll && !Mouse.isButtonDown((int)0)) {
            this.IllIIIllIIIIlIlIlIllIIlll = false;
        }
        LunarClient.getInstance().ubuntuMedium16px.lllIlIIlIIIlIlIIIllIlllIl("SERVER", this.lIlllIlllIIIIlIIlllIllIII + 172 + n3 / 2, this.IlIIIIIllllllIIlllIllllll - 2, new Color(1.0f, 1.0f, 1.0f, 0.9f).getRGB());
        class_0210.lllIIIllIIIIlllIlIIllIIll((float)(this.lIlllIlllIIIIlIIlllIllIII + 172 + n3 / 2) - 0.5f, this.IlIIIIIllllllIIlllIllllll + 8, (float)(this.lIlllIlllIIIIlIIlllIllIII + 172 + n3 / 2) + 0.5f, this.IlIIIIIllllllIIlllIllllll + 14, 0x6F000000);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)0.9f);
        class_0857.lllIIIllIIIIlllIlIIllIIll(this.llIIlllIllIllllIIIlIIIIII, (float)(this.lIlllIlllIIIIlIIlllIllIII + 180) - 3.25f, (float)(this.IlIIIIIllllllIIlllIllllll + 3), 7.5f, 7.5f);
        class_0210.lllIIIllIIIIlllIlIIllIIll((float)(this.lIlllIlllIIIIlIIlllIllIII + 180) - 0.5f, this.IlIIIIIllllllIIlllIllllll + 12, (float)(this.lIlllIlllIIIIlIIlllIllIII + 180) + 0.5f, this.IlIIIIIllllllIIlllIllllll + 14, 0x6F000000);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)0.9f);
        class_0857.lllIIIllIIIIlllIlIIllIIll(this.lIIIIlIlIIlllllIIllIIlIII, (float)(this.lIlllIlllIIIIlIIlllIllIII + 170 + n3 - 10) - 5.0f, (float)(this.IlIIIIIllllllIIlllIllllll + 2), 10.0f, 10.0f);
        class_0210.lllIIIllIIIIlllIlIIllIIll((float)(this.lIlllIlllIIIIlIIlllIllIII + 170 + n3 - 10) - 0.5f, this.IlIIIIIllllllIIlllIllllll + 12, (float)(this.lIlllIlllIIIIlIIlllIllIII + 170 + n3 - 10) + 0.5f, this.IlIIIIIllllllIIlllIllllll + 14, 0x6F000000);
        boolean bl = (float)n > (float)(this.lIlllIlllIIIIlIIlllIllIII + 170) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n < (float)(this.lIlllIlllIIIIlIIlllIllIII + 170 + n3 - 2) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n2 > (float)(this.IlIIIIIllllllIIlllIllllll + 4 + this.IlIllllllIIlIIllllIIlIIIl) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n2 < (float)(this.IlIIIIIllllllIIlllIllllll + 20 + this.IlIllllllIIlIIllllIIlIIIl) * this.lllIlIIlIIIlIlIIIllIlllIl;
        class_0857.lllIIIllIIIIlllIlIIllIIll((double)(this.lIlllIlllIIIIlIIlllIllIII + 174), (double)(this.IlIIIIIllllllIIlllIllllll + 16), (double)(this.lIlllIlllIIIIlIIlllIllIII + 170 + n3 - 4), (double)(this.IlIIIIIllllllIIlllIllllll + 18), 1.0, bl ? -1895825408 : 0x6F000000);
        double d = n3 - 18;
        float f4 = Float.parseFloat("" + this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl());
        float f5 = Float.parseFloat("" + this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl());
        if (this.IllIIIllIIIIlIlIlIllIIlll) {
            this.IIIllIllIIlIlIlIlIllllIIl = (float)Math.round(((double)f4 + (double)((float)n - (float)(this.lIlllIlllIIIIlIIlllIllIII + 180) * this.lllIlIIlIIIlIlIIIllIlllIl) * ((double)(f5 - f4) / (d * (double)this.lllIlIIlIIIlIlIIIllIlllIl))) * 100.0) / 100.0f;
            if (this.IIIllIllIIlIlIlIlIllllIIl < -13490.0f && this.IIIllIllIIlIlIlIlIllllIIl > -15490.0f) {
                this.IIIllIllIIlIlIlIlIllllIIl = -14490.0f;
            }
            if (this.lllIIIllIIIIlllIlIIllIIll.IllIIIllIIIIlIlIlIllIIlll().equals((Object)class_1318.lIlllIlllIIIIlIIlllIllIII)) {
                this.IIIllIllIIlIlIlIlIllllIIl = Math.round(this.IIIllIllIIlIlIlIlIllllIIl);
            }
            if (this.IIIllIllIIlIlIlIlIllllIIl < f4) {
                this.IIIllIllIIlIlIlIlIllllIIl = f4;
            } else if (this.IIIllIllIIlIlIlIlIllllIIl > f5) {
                this.IIIllIllIIlIlIlIlIllllIIl = f5;
            }
            Minecraft.getMinecraft().theWorld.lllIIIllIIIIlllIlIIllIIll((long)((Integer) LunarClient.getInstance().getSettingsManager().lIlllIlllIlIIIIlllIlIlIIl.lIlllIlllIIIIlIIlllIllIII()).intValue());
            switch (this.lllIIIllIIIIlllIlIIllIIll.IllIIIllIIIIlIlIlIllIIlll()) {
                case lIlllIlllIIIIlIIlllIllIII: {
                    this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl(Integer.parseInt((int)this.IIIllIllIIlIlIlIlIllllIIl + ""));
                    break;
                }
                case IlIllllllIIlIIllllIIlIIIl: {
                    this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl(Float.valueOf(this.IIIllIllIIlIlIlIlIllllIIl));
                    break;
                }
                case IlIIIIIllllllIIlllIllllll: {
                    this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl(Double.parseDouble(this.IIIllIllIIlIlIlIlIllllIIl + ""));
                }
            }
        }
        f3 = (f3 = Float.parseFloat(this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII() + "")) < this.IllIIlllllllIIlIIlIIIIlIl ? this.IllIIlllllllIIlIIlIIIIlIl - f3 : (f3 -= this.IllIIlllllllIIlIIlIIIIlIl);
        float f6 = ((f5 - f4) / 20.0f + f3 * 8.0f) / (float)(Minecraft.IlIIlllllIIlIlIlllllIllll + 1);
        if ((double)f6 < 1.0E-4) {
            f6 = 1.0E-4f;
        }
        if (this.IllIIlllllllIIlIIlIIIIlIl < (f2 = Float.parseFloat(this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII() + ""))) {
            this.IllIIlllllllIIlIIlIIIIlIl = this.IllIIlllllllIIlIIlIIIIlIl + f6 <= f2 ? (this.IllIIlllllllIIlIIlIIIIlIl += f6) : f2;
        } else if (this.IllIIlllllllIIlIIlIIIIlIl > f2) {
            this.IllIIlllllllIIlIIlIIIIlIl = this.IllIIlllllllIIlIIlIIIIlIl - f6 >= f2 ? (this.IllIIlllllllIIlIIlIIIIlIl -= f6) : f2;
        }
        double d2 = 100.0f * ((this.IllIIlllllllIIlIIlIIIIlIl - f4) / (f5 - f4));
        class_0857.lllIIIllIIIIlllIlIIllIIll((double)(this.lIlllIlllIIIIlIIlllIllIII + 174), (double)(this.IlIIIIIllllllIIlllIllllll + 16), (double)(this.lIlllIlllIIIIlIIlllIllIII + 180) + d * d2 / 100.0, (double)(this.IlIIIIIllllllIIlllIllllll + 18), 4.0, new Color(1.0f, 1.0f, 1.0f, 0.9f).getRGB());
        GL11.glColor4f((float)0.0f, (float)0.0f, (float)0.0f, (float)0.3f);
        class_0857.lllIIIllIIIIlllIlIIllIIll((double)((float)this.lIlllIlllIIIIlIIlllIllIII + 181.25f) + d * d2 / 100.0, (float)this.IlIIIIIllllllIIlllIllllll + 17.25f, 4.5);
        if (this.IllIIlllllllIIlIIlIIIIlIl == -14490.0f) {
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        } else {
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)0.1f);
        }
        class_0857.lllIIIllIIIIlllIlIIllIIll((double)((float)this.lIlllIlllIIIIlIIlllIllIII + 181.25f) + d * d2 / 100.0, (float)this.IlIIIIIllllllIIlllIllllll + 17.25f, 2.7f);
    }
}

