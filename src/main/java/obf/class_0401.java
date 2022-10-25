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

public class class_0401
extends class_2117 {
    private Setting lllIIIllIIIIlllIlIIllIIll;
    private float IllIIlllllllIIlIIlIIIIlIl = -1.0f;
    private float IIIllIllIIlIlIlIlIllllIIl;
    private boolean IllIIIllIIIIlIlIlIllIIlll = false;

    public class_0401(Setting class_16092, float f) {
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
        boolean bl = (float)n > (float)(this.lIlllIlllIIIIlIIlllIllIII + 172) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n < (float)(this.lIlllIlllIIIIlIIlllIllIII + 172 + n3 - 2) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n2 > (float)(this.IlIIIIIllllllIIlllIllllll + 4 + this.IlIllllllIIlIIllllIIlIIIl) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n2 < (float)(this.IlIIIIIllllllIIlllIllllll + 10 + this.IlIllllllIIlIIllllIIlIIIl) * this.lllIlIIlIIIlIlIIIllIlllIl;
        LunarClient.getInstance().ubuntuMedium16px.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll.getName().toUpperCase(), this.lIlllIlllIIIIlIIlllIllIII + 10, (float)(this.IlIIIIIllllllIIlllIllllll + 2), bl ? Color.WHITE.getRGB() : Color.LIGHT_GRAY.getRGB());
        if (this.IllIIIllIIIIlIlIlIllIIlll && !Mouse.isButtonDown((int)0)) {
            this.IllIIIllIIIIlIlIlIllIIlll = false;
        }
        String string = this.lllIIIllIIIIlllIlIIllIIll.getValue() + "";
        LunarClient.getInstance().ubuntuMedium16px.lllIIIllIIIIlllIlIIllIIll(string, this.lIlllIlllIIIIlIIlllIllIII + 154, (float)(this.IlIIIIIllllllIIlllIllllll + 2), Color.WHITE.getRGB());
        class_0857.lllIIIllIIIIlllIlIIllIIll((double)(this.lIlllIlllIIIIlIIlllIllIII + 174), (double)(this.IlIIIIIllllllIIlllIllllll + 6), (double)(this.lIlllIlllIIIIlIIlllIllIII + 170 + n3 - 4), (double)(this.IlIIIIIllllllIIlllIllllll + 8), 1.0, bl ? -1895825408 : 0x6F000000);
        double d = n3 - 18;
        float f4 = Float.parseFloat("" + this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl());
        float f5 = Float.parseFloat("" + this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl());
        if (this.IllIIIllIIIIlIlIlIllIIlll) {
            this.IIIllIllIIlIlIlIlIllllIIl = (float)Math.round(((double)f4 + (double)((float)n - (float)(this.lIlllIlllIIIIlIIlllIllIII + 180) * this.lllIlIIlIIIlIlIIIllIlllIl) * ((double)(f5 - f4) / (d * (double)this.lllIlIIlIIIlIlIIIllIlllIl))) * 100.0) / 100.0f;
            if (this.lllIIIllIIIIlllIlIIllIIll.IllIIIllIIIIlIlIlIllIIlll().equals((Object)class_1318.lIlllIlllIIIIlIIlllIllIII)) {
                this.IIIllIllIIlIlIlIlIllllIIl = Math.round(this.IIIllIllIIlIlIlIlIllllIIl);
            }
            if (this.IIIllIllIIlIlIlIlIllllIIl < f4) {
                this.IIIllIllIIlIlIlIlIllllIIl = f4;
            } else if (this.IIIllIllIIlIlIlIlIllllIIl > f5) {
                this.IIIllIllIIlIlIlIlIllllIIl = f5;
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
            if (this.lllIIIllIIIIlllIlIIllIIll == LunarClient.getInstance().getModuleManager().IllIIlllllllIIlIIlIIIIlIl.lllIlIIlIIIlIlIIIllIlllIl) {
                // empty if block
            }
            LunarClient.getInstance().getModuleManager().IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll();
        }
        f3 = (f3 = Float.parseFloat(this.lllIIIllIIIIlllIlIIllIIll.getValue() + "")) < this.IllIIlllllllIIlIIlIIIIlIl ? this.IllIIlllllllIIlIIlIIIIlIl - f3 : (f3 -= this.IllIIlllllllIIlIIlIIIIlIl);
        float f6 = ((f5 - f4) / 20.0f + f3 * 8.0f) / (float)(Minecraft.IlIIlllllIIlIlIlllllIllll + 1);
        if ((double)f6 < 1.0E-4) {
            f6 = 1.0E-4f;
        }
        if (this.IllIIlllllllIIlIIlIIIIlIl < (f2 = Float.parseFloat(this.lllIIIllIIIIlllIlIIllIIll.getValue() + ""))) {
            this.IllIIlllllllIIlIIlIIIIlIl = this.IllIIlllllllIIlIIlIIIIlIl + f6 <= f2 ? (this.IllIIlllllllIIlIIlIIIIlIl += f6) : f2;
        } else if (this.IllIIlllllllIIlIIlIIIIlIl > f2) {
            this.IllIIlllllllIIlIIlIIIIlIl = this.IllIIlllllllIIlIIlIIIIlIl - f6 >= f2 ? (this.IllIIlllllllIIlIIlIIIIlIl -= f6) : f2;
        }
        double d2 = 100.0f * ((this.IllIIlllllllIIlIIlIIIIlIl - f4) / (f5 - f4));
        class_0857.lllIIIllIIIIlllIlIIllIIll((double)(this.lIlllIlllIIIIlIIlllIllIII + 174), (double)(this.IlIIIIIllllllIIlllIllllll + 6), (double)(this.lIlllIlllIIIIlIIlllIllIII + 180) + d * d2 / 100.0, (double)(this.IlIIIIIllllllIIlllIllllll + 8), 4.0, -754974721);
        GL11.glColor4f((float)(bl ? 1.0f : 0.0f), (float)(bl ? 1.0f : 0.0f), (float)(bl ? 1.0f : 0.0f), (float)(bl ? 0.6f : 0.3f));
        class_0857.lllIIIllIIIIlllIlIIllIIll((double)((float)this.lIlllIlllIIIIlIIlllIllIII + 181.25f) + d * d2 / 100.0, (float)this.IlIIIIIllllllIIlllIllllll + 7.25f, 4.5);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        class_0857.lllIIIllIIIIlllIlIIllIIll((double)((float)this.lIlllIlllIIIIlIIlllIllIII + 181.25f) + d * d2 / 100.0, (float)this.IlIIIIIllllllIIlllIllllll + 7.25f, 2.7f);
    }
}

