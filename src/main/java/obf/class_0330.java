package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.GL11
 */
import java.awt.Color;

import com.moonsworth.lunar.client.config.Setting;
import com.moonsworth.lunar.client.LunarClient;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public class class_0330
extends class_2117 {
    private Setting lllIIIllIIIIlllIlIIllIIll;
    private float IllIIlllllllIIlIIlIIIIlIl = -1.0f;
    private float IIIllIllIIlIlIlIlIllllIIl;
    private boolean IllIIIllIIIIlIlIlIllIIlll = false;

    public class_0330(Setting class_16092, float f) {
        super(f);
        this.lllIIIllIIIIlllIlIIllIIll = class_16092;
        this.IIIllIIlIIIIIIlIlIIllIIlI = 14;
        this.IllIIlllllllIIlIIlIIIIlIl = Float.parseFloat("" + class_16092.getValue());
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        boolean bl;
        int n4 = 170;
        boolean bl2 = bl = (float)n > (float)(this.lIlllIlllIIIIlIIlllIllIII + 170) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n < (float)(this.lIlllIlllIIIIlIIlllIllIII + 170 + n4 - 2) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n2 > (float)(this.IlIIIIIllllllIIlllIllllll + 4 + this.IlIllllllIIlIIllllIIlIIIl) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n2 < (float)(this.IlIIIIIllllllIIlllIllllll + 10 + this.IlIllllllIIlIIllllIIlIIIl) * this.lllIlIIlIIIlIlIIIllIlllIl;
        if (n3 == 0 && bl) {
            this.IllIIIllIIIIlIlIlIllIIlll = true;
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
        float f2;
        float f3;
        int n3 = 148;
        float f4 = n3 - 18;
        LunarClient.getInstance().ubuntuMedium16px.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll.getName().toUpperCase(), this.lIlllIlllIIIIlIIlllIllIII + 10, (float)(this.IlIIIIIllllllIIlllIllllll + 2), -1895825408);
        if (this.IllIIIllIIIIlIlIlIllIIlll && !Mouse.isButtonDown((int)0)) {
            this.IllIIIllIIIIlIlIlIllIIlll = false;
        }
        class_0210.lllIIIllIIIIlllIlIIllIIll((float)this.lIlllIlllIIIIlIIlllIllIII + 179.5f, (float)this.IlIIIIIllllllIIlllIllllll + 5.5f, (float)this.lIlllIlllIIIIlIIlllIllIII + 180.5f + f4, (float)this.IlIIIIIllllllIIlllIllllll + 8.5f, -822083584);
        int n4 = 0;
        while ((float)n4 < f4) {
            int n5 = Color.HSBtoRGB((float)n4 / f4, 1.0f, 1.0f);
            class_0210.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII + 180 + n4, this.IlIIIIIllllllIIlllIllllll + 6, this.lIlllIlllIIIIlIIlllIllIII + 181 + n4, this.IlIIIIIllllllIIlllIllllll + 8, n5);
            ++n4;
        }
        float f5 = Float.parseFloat("" + this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl());
        float f6 = Float.parseFloat("" + this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl());
        if (this.IllIIIllIIIIlIlIlIllIIlll) {
            this.IIIllIllIIlIlIlIlIllllIIl = (float)((double)(f5 + ((float)n - (float)(this.lIlllIlllIIIIlIIlllIllIII + 180) * this.lllIlIIlIIIlIlIIIllIlllIl) * ((f6 - f5) / (f4 * this.lllIlIIlIIIlIlIIIllIlllIl))) * 100.0) / 100.0f;
            if (this.lllIIIllIIIIlllIlIIllIIll.IllIIIllIIIIlIlIlIllIIlll().equals((Object)class_1318.lIlllIlllIIIIlIIlllIllIII)) {
                this.IIIllIllIIlIlIlIlIllllIIl = Math.round(this.IIIllIllIIlIlIlIlIllllIIl);
            }
            if (this.IIIllIllIIlIlIlIlIllllIIl < f5) {
                this.IIIllIllIIlIlIlIlIllllIIl = f5;
            } else if (this.IIIllIllIIlIlIlIlIllllIIl > f6) {
                this.IIIllIllIIlIlIlIlIllllIIl = f6;
            }
            switch (this.lllIIIllIIIIlllIlIIllIIll.IllIIIllIIIIlIlIlIllIIlll()) {
                case lIlllIlllIIIIlIIlllIllIII: {
                    this.lllIIIllIIIIlllIlIIllIIll.setValue(Integer.parseInt((int)this.IIIllIllIIlIlIlIlIllllIIl + ""));
                    break;
                }
                case IlIllllllIIlIIllllIIlIIIl: {
                    this.lllIIIllIIIIlllIlIIllIIll.setValue(Float.valueOf(this.IIIllIllIIlIlIlIlIllllIIl));
                    break;
                }
                case IlIIIIIllllllIIlllIllllll: {
                    this.lllIIIllIIIIlllIlIIllIIll.setValue(Double.parseDouble(this.IIIllIllIIlIlIlIlIllllIIl + ""));
                }
            }
        }
        f3 = (f3 = Float.parseFloat(this.lllIIIllIIIIlllIlIIllIIll.getValue() + "")) < this.IllIIlllllllIIlIIlIIIIlIl ? this.IllIIlllllllIIlIIlIIIIlIl - f3 : (f3 -= this.IllIIlllllllIIlIIlIIIIlIl);
        float f7 = ((f6 - f5) / 20.0f + f3 * 8.0f) / (float)(Minecraft.IlIIlllllIIlIlIlllllIllll + 1);
        if ((double)f7 < 1.0E-4) {
            f7 = 1.0E-4f;
        }
        if (this.IllIIlllllllIIlIIlIIIIlIl < (f2 = Float.parseFloat(this.lllIIIllIIIIlllIlIIllIIll.getValue() + ""))) {
            this.IllIIlllllllIIlIIlIIIIlIl = this.IllIIlllllllIIlIIlIIIIlIl + f7 <= f2 ? (this.IllIIlllllllIIlIIlIIIIlIl += f7) : f2;
        } else if (this.IllIIlllllllIIlIIlIIIIlIl > f2) {
            this.IllIIlllllllIIlIIlIIIIlIl = this.IllIIlllllllIIlIIlIIIIlIl - f7 >= f2 ? (this.IllIIlllllllIIlIIlIIIIlIl -= f7) : f2;
        }
        double d = 100.0f * ((this.IllIIlllllllIIlIIlIIIIlIl - f5) / (f6 - f5));
        GL11.glColor4f((float)0.25f, (float)0.45f, (float)1.0f, (float)1.0f);
        class_0857.lllIIIllIIIIlllIlIIllIIll((double)((float)this.lIlllIlllIIIIlIIlllIllIII + 181.25f) + (double)f4 * d / 100.0, (float)this.IlIIIIIllllllIIlllIllllll + 7.25f, 4.5);
        float f8 = ((Float)this.lllIIIllIIIIlllIlIIllIIll.getValue()).floatValue();
        int n6 = f8 == 0.0f ? -1 : Color.HSBtoRGB(f8, 1.0f, 1.0f);
        GL11.glColor4f((float)((float)(n6 >> 16 & 0xFF) / 255.0f), (float)((float)(n6 >> 8 & 0xFF) / 255.0f), (float)((float)(n6 & 0xFF) / 255.0f), (float)1.0f);
        class_0857.lllIIIllIIIIlllIlIIllIIll((double)((float)this.lIlllIlllIIIIlIIlllIllIII + 181.25f) + (double)f4 * d / 100.0, (float)this.IlIIIIIllllllIIlllIllllll + 7.25f, 2.7f);
    }
}

