package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.input.Mouse
 */
import java.awt.Color;

import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

public class class_1573 {
    private String lllIIIllIIIIlllIlIIllIIll;
    private int lllIlIIlIIIlIlIIIllIlllIl;
    private float IlIllllllIIlIIllllIIlIIIl;
    private float lIlllIlllIIIIlIIlllIllIII;
    private boolean IlIIIIIllllllIIlllIllllll;
    private long lIllllIIlIIIlIllllllIIIll;
    private Color IIIllIIlIIIIIIlIlIIllIIlI;
    private Color IllIIlllllllIIlIIlIIIIlIl;

    public class_1573(String string, int n, float f, float f2) {
        this.lllIIIllIIIIlllIlIIllIIll = string;
        this.lllIlIIlIIIlIlIIIllIlllIl = n;
        this.IlIllllllIIlIIllllIIlIIIl = f;
        this.lIlllIlllIIIIlIIlllIllIII = f2;
    }

    public void lllIIIllIIIIlllIlIIllIIll(float f, float f2, int n, int n2, int n3, int n4) {
        int n5;
        boolean bl;
        int n6;
        Minecraft class_06672 = Minecraft.getMinecraft();
        int n7 = this.lllIlIIlIIIlIlIIIllIlllIl == -99 || this.lllIlIIlIIIlIlIIIllIlllIl == -100 ? (this.lllIlIIlIIIlIlIIIllIlllIl == -99 ? 0 : 1) : (n6 = -1);
        boolean bl2 = (class_06672.lllllIlllIIllIlIIlIIIllII == null || class_06672.lllllIlllIIllIlIIlIIIllII instanceof class_1522 || class_06672.lllllIlllIIllIlIIlIIIllII instanceof class_0822) && (n6 == -1 ? Keyboard.isKeyDown((int)this.lllIlIIlIIIlIlIIIllIlllIl) : Mouse.isButtonDown((int)n6)) ? true : (bl = false);
        if (bl && !this.IlIIIIIllllllIIlllIllllll) {
            this.IlIIIIIllllllIIlllIllllll = true;
            this.lIllllIIlIIIlIllllllIIIll = System.currentTimeMillis();
            this.IIIllIIlIIIIIIlIlIIllIIlI = new Color(n3, true);
            this.IllIIlllllllIIlIIlIIIIlIl = new Color(n4, true);
        } else if (this.IlIIIIIllllllIIlllIllllll && !bl) {
            this.IlIIIIIllllllIIlllIllllll = false;
            this.lIllllIIlIIIlIllllllIIIll = System.currentTimeMillis();
            this.IIIllIIlIIIIIIlIlIIllIIlI = new Color(n4, true);
            this.IllIIlllllllIIlIIlIIIIlIl = new Color(n3, true);
        }
        float f3 = 75.0f;
        if ((float)(System.currentTimeMillis() - this.lIllllIIlIIIlIllllllIIIll) < f3) {
            float f4 = System.currentTimeMillis() - this.lIllllIIlIIIlIllllllIIIll;
            float f5 = f4 / f3;
            int n8 = (int)Math.abs(f5 * (float)this.IllIIlllllllIIlIIlIIIIlIl.getRed() + (1.0f - f5) * (float)this.IIIllIIlIIIIIIlIlIIllIIlI.getRed());
            int n9 = (int)Math.abs(f5 * (float)this.IllIIlllllllIIlIIlIIIIlIl.getGreen() + (1.0f - f5) * (float)this.IIIllIIlIIIIIIlIlIIllIIlI.getGreen());
            int n10 = (int)Math.abs(f5 * (float)this.IllIIlllllllIIlIIlIIIIlIl.getBlue() + (1.0f - f5) * (float)this.IIIllIIlIIIIIIlIlIIllIIlI.getBlue());
            int n11 = (int)Math.abs(f5 * (float)this.IllIIlllllllIIlIIlIIIIlIl.getAlpha() + (1.0f - f5) * (float)this.IIIllIIlIIIIIIlIlIIllIIlI.getAlpha());
            n5 = new Color(n8, n9, n10, n11).getRGB();
        } else {
            n5 = bl ? n4 : n3;
        }
        class_0210.lllIIIllIIIIlllIlIIllIIll(f, f2, f + this.IlIllllllIIlIIllllIIlIIIl, f2 + this.lIlllIlllIIIIlIIlllIllIII, n5);
        if (this.lllIlIIlIIIlIlIIIllIlllIl == class_06672.gameSettings.lIIIIlIIIIllIlIIllllIlIII.IIIllIllIIlIlIlIlIllllIIl()) {
            class_0210.lllIIIllIIIIlllIlIIllIIll(f + this.IlIllllllIIlIIllllIIlIIIl / 2.0f - this.IlIllllllIIlIIllllIIlIIIl / 8.0f, f2 + 3.0f, f + this.IlIllllllIIlIIllllIIlIIIl / 2.0f + this.IlIllllllIIlIIllllIIlIIIl / 8.0f, f2 + 4.0f, 0xFF000000 | (bl ? n2 : n));
        } else {
            class_06672.IlIlllIIIIIIlIIllIIllIlll.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, f + this.IlIllllllIIlIIllllIIlIIIl / 2.0f, f2 + this.lIlllIlllIIIIlIIlllIllIII / 2.0f - (float)(class_06672.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll / 2) + 1.0f, bl ? n2 : n);
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n) {
        this.lllIlIIlIIIlIlIIIllIlllIl = n;
    }

    public String lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public float lllIlIIlIIIlIlIIIllIlllIl() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public float IlIllllllIIlIIllllIIlIIIl() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    public int lIlllIlllIIIIlIIlllIllIII() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }
}

