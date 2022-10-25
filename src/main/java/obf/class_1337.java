package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.util.Properties;

import optifine.Config;
import org.lwjgl.opengl.GL11;

public class class_1337 {
    public String lllIIIllIIIIlllIlIIllIIll = null;
    private int lIlllIlllIIIIlIIlllIllIII = -1;
    private int IlIIIIIllllllIIlllIllllll = -1;
    private int lIllllIIlIIIlIllllllIIIll = -1;
    private int IIIllIIlIIIIIIlIlIIllIIlI = -1;
    private int IllIIlllllllIIlIIlIIIIlIl = 1;
    private boolean IIIllIllIIlIlIlIlIllllIIl = false;
    private float IllIIIllIIIIlIlIlIllIIlll = 1.0f;
    private float[] lIIIIlIlIIlllllIIllIIlIII = IlIllllllIIlIIllllIIlIIIl;
    public int lllIlIIlIIIlIlIIIllIlllIl = -1;
    public static final float[] IlIllllllIIlIIllllIIlIIIl = new float[]{1.0f, 0.0f, 0.0f};

    public class_1337(Properties properties, String string) {
        this.lllIIIllIIIIlllIlIIllIIll = properties.getProperty("source", string);
        this.lIlllIlllIIIIlIIlllIllIII = this.lllIlIIlIIIlIlIIIllIlllIl(properties.getProperty("startFadeIn"));
        this.IlIIIIIllllllIIlllIllllll = this.lllIlIIlIIIlIlIIIllIlllIl(properties.getProperty("endFadeIn"));
        this.lIllllIIlIIIlIllllllIIIll = this.lllIlIIlIIIlIlIIIllIlllIl(properties.getProperty("startFadeOut"));
        this.IIIllIIlIIIIIIlIlIIllIIlI = this.lllIlIIlIIIlIlIIIllIlllIl(properties.getProperty("endFadeOut"));
        this.IllIIlllllllIIlIIlIIIIlIl = class_0934.lllIIIllIIIIlllIlIIllIIll(properties.getProperty("blend"));
        this.IIIllIllIIlIlIlIlIllllIIl = this.lllIIIllIIIIlllIlIIllIIll(properties.getProperty("rotate"), true);
        this.IllIIIllIIIIlIlIlIllIIlll = this.lllIIIllIIIIlllIlIIllIIll(properties.getProperty("speed"), 1.0f);
        this.lIIIIlIlIIlllllIIllIIlIII = this.lllIIIllIIIIlllIlIIllIIll(properties.getProperty("axis"), IlIllllllIIlIIllllIIlIIIl);
    }

    private int lllIlIIlIIIlIlIIIllIlllIl(String string) {
        if (string == null) {
            return -1;
        }
        String[] arrstring = Config.lllIIIllIIIIlllIlIIllIIll(string, ":");
        if (arrstring.length != 2) {
            Config.lllIlIIlIIIlIlIIIllIlllIl("Invalid time: " + string);
            return -1;
        }
        String string2 = arrstring[0];
        String string3 = arrstring[1];
        int n = Config.lllIIIllIIIIlllIlIIllIIll(string2, -1);
        int n2 = Config.lllIIIllIIIIlllIlIIllIIll(string3, -1);
        if (n >= 0 && n <= 23 && n2 >= 0 && n2 <= 59) {
            if ((n -= 6) < 0) {
                n += 24;
            }
            int n3 = n * 1000 + (int)((double)n2 / 60.0 * 1000.0);
            return n3;
        }
        Config.lllIlIIlIIIlIlIIIllIlllIl("Invalid time: " + string);
        return -1;
    }

    private boolean lllIIIllIIIIlllIlIIllIIll(String string, boolean bl) {
        if (string == null) {
            return bl;
        }
        if (string.toLowerCase().equals("true")) {
            return true;
        }
        if (string.toLowerCase().equals("false")) {
            return false;
        }
        Config.lllIlIIlIIIlIlIIIllIlllIl("Unknown boolean: " + string);
        return bl;
    }

    private float lllIIIllIIIIlllIlIIllIIll(String string, float f) {
        if (string == null) {
            return f;
        }
        float f2 = Config.lllIIIllIIIIlllIlIIllIIll(string, Float.MIN_VALUE);
        if (f2 == Float.MIN_VALUE) {
            Config.lllIlIIlIIIlIlIIIllIlllIl("Invalid value: " + string);
            return f;
        }
        return f2;
    }

    private float[] lllIIIllIIIIlllIlIIllIIll(String string, float[] arrf) {
        if (string == null) {
            return arrf;
        }
        String[] arrstring = Config.lllIIIllIIIIlllIlIIllIIll(string, " ");
        if (arrstring.length != 3) {
            Config.lllIlIIlIIIlIlIIIllIlllIl("Invalid axis: " + string);
            return arrf;
        }
        float[] arrf2 = new float[3];
        for (int i = 0; i < arrstring.length; ++i) {
            arrf2[i] = Config.lllIIIllIIIIlllIlIIllIIll(arrstring[i], Float.MIN_VALUE);
            if (arrf2[i] == Float.MIN_VALUE) {
                Config.lllIlIIlIIIlIlIIIllIlllIl("Invalid axis: " + string);
                return arrf;
            }
            if (!(arrf2[i] < -1.0f) && !(arrf2[i] > 1.0f)) continue;
            Config.lllIlIIlIIIlIlIIIllIlllIl("Invalid axis values: " + string);
            return arrf;
        }
        float f = arrf2[0];
        float f2 = arrf2[1];
        float f3 = arrf2[2];
        if (f * f + f2 * f2 + f3 * f3 < 1.0E-5f) {
            Config.lllIlIIlIIIlIlIIIllIlllIl("Invalid axis values: " + string);
            return arrf;
        }
        float[] arrf3 = new float[]{f3, f2, -f};
        return arrf3;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(String string) {
        if (this.lllIIIllIIIIlllIlIIllIIll == null) {
            Config.lllIlIIlIIIlIlIIIllIlllIl("No source texture: " + string);
            return false;
        }
        this.lllIIIllIIIIlllIlIIllIIll = class_1384.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, class_1384.lllIlIIlIIIlIlIIIllIlllIl(string));
        if (this.lIlllIlllIIIIlIIlllIllIII >= 0 && this.IlIIIIIllllllIIlllIllllll >= 0 && this.IIIllIIlIIIIIIlIlIIllIIlI >= 0) {
            int n;
            int n2;
            int n3;
            int n4;
            int n5 = this.lllIlIIlIIIlIlIIIllIlllIl(this.IlIIIIIllllllIIlllIllllll - this.lIlllIlllIIIIlIIlllIllIII);
            if (this.lIllllIIlIIIlIllllllIIIll < 0) {
                this.lIllllIIlIIIlIllllllIIIll = this.lllIlIIlIIIlIlIIIllIlllIl(this.IIIllIIlIIIIIIlIlIIllIIlI - n5);
                if (this.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll, this.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll)) {
                    this.lIllllIIlIIIlIllllllIIIll = this.IlIIIIIllllllIIlllIllllll;
                }
            }
            if ((n4 = n5 + (n3 = this.lllIlIIlIIIlIlIIIllIlllIl(this.lIllllIIlIIIlIllllllIIIll - this.IlIIIIIllllllIIlllIllllll)) + (n2 = this.lllIlIIlIIIlIlIIIllIlllIl(this.IIIllIIlIIIIIIlIlIIllIIlI - this.lIllllIIlIIIlIllllllIIIll)) + (n = this.lllIlIIlIIIlIlIIIllIlllIl(this.lIlllIlllIIIIlIIlllIllIII - this.IIIllIIlIIIIIIlIlIIllIIlI))) != 24000) {
                Config.lllIlIIlIIIlIlIIIllIlllIl("Invalid fadeIn/fadeOut times, sum is not 24h: " + n4);
                return false;
            }
            if (this.IllIIIllIIIIlIlIlIllIIlll < 0.0f) {
                Config.lllIlIIlIIIlIlIIIllIlllIl("Invalid speed: " + this.IllIIIllIIIIlIlIlIllIIlll);
                return false;
            }
            return true;
        }
        Config.lllIlIIlIIIlIlIIIllIlllIl("Invalid times, required are: startFadeIn, endFadeIn and endFadeOut.");
        return false;
    }

    private int lllIlIIlIIIlIlIIIllIlllIl(int n) {
        while (n >= 24000) {
            n -= 24000;
        }
        while (n < 0) {
            n += 24000;
        }
        return n;
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n, float f, float f2) {
        float f3 = f2 * this.IlIllllllIIlIIllllIIlIIIl(n);
        if ((f3 = Config.lllIIIllIIIIlllIlIIllIIll(f3, 0.0f, 1.0f)) >= 1.0E-4f) {
            GL11.glBindTexture((int)3553, (int)this.lllIlIIlIIIlIlIIIllIlllIl);
            class_0934.lllIIIllIIIIlllIlIIllIIll(this.IllIIlllllllIIlIIlIIIIlIl, f3);
            GL11.glPushMatrix();
            if (this.IIIllIllIIlIlIlIlIllllIIl) {
                GL11.glRotatef((float)(f * 360.0f * this.IllIIIllIIIIlIlIlIllIIlll), (float)this.lIIIIlIlIIlllllIIllIIlIII[0], (float)this.lIIIIlIlIIlllllIIllIIlIII[1], (float)this.lIIIIlIlIIlllllIIllIIlIII[2]);
            }
            class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
            GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            this.lllIIIllIIIIlllIlIIllIIll(class_08682, 4);
            GL11.glPushMatrix();
            GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            this.lllIIIllIIIIlllIlIIllIIll(class_08682, 1);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            this.lllIIIllIIIIlllIlIIllIIll(class_08682, 0);
            GL11.glPopMatrix();
            GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            this.lllIIIllIIIIlllIlIIllIIll(class_08682, 5);
            GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            this.lllIIIllIIIIlllIlIIllIIll(class_08682, 2);
            GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            this.lllIIIllIIIIlllIlIIllIIll(class_08682, 3);
            GL11.glPopMatrix();
        }
    }

    private float IlIllllllIIlIIllllIIlIIIl(int n) {
        if (this.lllIIIllIIIIlllIlIIllIIll(n, this.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll)) {
            int n2 = this.lllIlIIlIIIlIlIIIllIlllIl(this.IlIIIIIllllllIIlllIllllll - this.lIlllIlllIIIIlIIlllIllIII);
            int n3 = this.lllIlIIlIIIlIlIIIllIlllIl(n - this.lIlllIlllIIIIlIIlllIllIII);
            return (float)n3 / (float)n2;
        }
        if (this.lllIIIllIIIIlllIlIIllIIll(n, this.IlIIIIIllllllIIlllIllllll, this.lIllllIIlIIIlIllllllIIIll)) {
            return 1.0f;
        }
        if (this.lllIIIllIIIIlllIlIIllIIll(n, this.lIllllIIlIIIlIllllllIIIll, this.IIIllIIlIIIIIIlIlIIllIIlI)) {
            int n4 = this.lllIlIIlIIIlIlIIIllIlllIl(this.IIIllIIlIIIIIIlIlIIllIIlI - this.lIllllIIlIIIlIllllllIIIll);
            int n5 = this.lllIlIIlIIIlIlIIIllIlllIl(n - this.lIllllIIlIIIlIllllllIIIll);
            return 1.0f - (float)n5 / (float)n4;
        }
        return 0.0f;
    }

    private void lllIIIllIIIIlllIlIIllIIll(class_0868 class_08682, int n) {
        double d = (double)(n % 3) / 3.0;
        double d2 = (double)(n / 3) / 2.0;
        class_08682.lllIlIIlIIIlIlIIIllIlllIl();
        class_08682.lllIIIllIIIIlllIlIIllIIll(-70.0, -70.0, -70.0, d, d2);
        class_08682.lllIIIllIIIIlllIlIIllIIll(-70.0, -70.0, 70.0, d, d2 + 0.5);
        class_08682.lllIIIllIIIIlllIlIIllIIll(70.0, -70.0, 70.0, d + 0.3333333333333333, d2 + 0.5);
        class_08682.lllIIIllIIIIlllIlIIllIIll(70.0, -70.0, -70.0, d + 0.3333333333333333, d2);
        class_08682.lllIIIllIIIIlllIlIIllIIll();
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(int n) {
        return !this.lllIIIllIIIIlllIlIIllIIll(n, this.IIIllIIlIIIIIIlIlIIllIIlI, this.lIlllIlllIIIIlIIlllIllIII);
    }

    private boolean lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        return n2 <= n3 ? n >= n2 && n <= n3 : n >= n2 || n <= n3;
    }
}

