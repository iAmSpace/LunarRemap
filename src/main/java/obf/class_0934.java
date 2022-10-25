package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import optifine.Config;
import org.lwjgl.opengl.GL11;

public class class_0934 {
    public static final int lllIIIllIIIIlllIlIIllIIll = 0;
    public static final int lllIlIIlIIIlIlIIIllIlllIl = 1;
    public static final int IlIllllllIIlIIllllIIlIIIl = 2;
    public static final int lIlllIlllIIIIlIIlllIllIII = 3;
    public static final int IlIIIIIllllllIIlllIllllll = 4;
    public static final int lIllllIIlIIIlIllllllIIIll = 5;
    public static final int IIIllIIlIIIIIIlIlIIllIIlI = 6;
    public static final int IllIIlllllllIIlIIlIIIIlIl = 7;
    public static final int IIIllIllIIlIlIlIlIllllIIl = 8;
    public static final int IllIIIllIIIIlIlIlIllIIlll = 1;

    public static int lllIIIllIIIIlllIlIIllIIll(String string) {
        if (string == null) {
            return 1;
        }
        if ((string = string.toLowerCase().trim()).equals("alpha")) {
            return 0;
        }
        if (string.equals("add")) {
            return 1;
        }
        if (string.equals("subtract")) {
            return 2;
        }
        if (string.equals("multiply")) {
            return 3;
        }
        if (string.equals("dodge")) {
            return 4;
        }
        if (string.equals("burn")) {
            return 5;
        }
        if (string.equals("screen")) {
            return 6;
        }
        if (string.equals("overlay")) {
            return 7;
        }
        if (string.equals("replace")) {
            return 8;
        }
        Config.lllIlIIlIIIlIlIIIllIlllIl("Unknown blend: " + string);
        return 1;
    }

    public static void lllIIIllIIIIlllIlIIllIIll(int n, float f) {
        switch (n) {
            case 0: {
                GL11.glDisable((int)3008);
                GL11.glEnable((int)3042);
                GL11.glBlendFunc((int)770, (int)771);
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)f);
                break;
            }
            case 1: {
                GL11.glDisable((int)3008);
                GL11.glEnable((int)3042);
                GL11.glBlendFunc((int)770, (int)1);
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)f);
                break;
            }
            case 2: {
                GL11.glDisable((int)3008);
                GL11.glEnable((int)3042);
                GL11.glBlendFunc((int)775, (int)0);
                GL11.glColor4f((float)f, (float)f, (float)f, (float)1.0f);
                break;
            }
            case 3: {
                GL11.glDisable((int)3008);
                GL11.glEnable((int)3042);
                GL11.glBlendFunc((int)774, (int)771);
                GL11.glColor4f((float)f, (float)f, (float)f, (float)f);
                break;
            }
            case 4: {
                GL11.glDisable((int)3008);
                GL11.glEnable((int)3042);
                GL11.glBlendFunc((int)1, (int)1);
                GL11.glColor4f((float)f, (float)f, (float)f, (float)1.0f);
                break;
            }
            case 5: {
                GL11.glDisable((int)3008);
                GL11.glEnable((int)3042);
                GL11.glBlendFunc((int)0, (int)769);
                GL11.glColor4f((float)f, (float)f, (float)f, (float)1.0f);
                break;
            }
            case 6: {
                GL11.glDisable((int)3008);
                GL11.glEnable((int)3042);
                GL11.glBlendFunc((int)1, (int)769);
                GL11.glColor4f((float)f, (float)f, (float)f, (float)1.0f);
                break;
            }
            case 7: {
                GL11.glDisable((int)3008);
                GL11.glEnable((int)3042);
                GL11.glBlendFunc((int)774, (int)768);
                GL11.glColor4f((float)f, (float)f, (float)f, (float)1.0f);
                break;
            }
            case 8: {
                GL11.glEnable((int)3008);
                GL11.glDisable((int)3042);
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)f);
            }
        }
        GL11.glEnable((int)3553);
    }

    public static void lllIIIllIIIIlllIlIIllIIll(float f) {
        GL11.glDisable((int)3008);
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)1);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)f);
    }
}

