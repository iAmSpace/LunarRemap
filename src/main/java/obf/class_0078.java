package obf;

import com.moonsworth.lunar.client.LunarClient;
import net.minecraft.client.Minecraft;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0078 {
    private final class_0556 lllIIIllIIIIlllIlIIllIIll = new class_0894(275L);
    private static final int lllIlIIlIIIlIlIIIllIlllIl = 140;
    private static final int IlIllllllIIlIIllllIIlIIIl = 55;
    private boolean lIlllIlllIIIIlIIlllIllIII;
    private float IlIIIIIllllllIIlllIllllll;
    private float lIllllIIlIIIlIllllllIIIll;
    private float IIIllIIlIIIIIIlIlIIllIIlI;
    private final String IllIIlllllllIIlIIlIIIIlIl;
    private final String[] IIIllIllIIlIlIlIlIllllIIl;
    private final long IllIIIllIIIIlIlIlIllIIlll;

    public class_0078(String string, String[] arrstring, float f, float f2) {
        this.IllIIlllllllIIlIIlIIIIlIl = string;
        this.IIIllIllIIlIlIlIlIllllIIl = arrstring;
        this.IlIIIIIllllllIIlllIllllll = f;
        this.IIIllIIlIIIIIIlIlIIllIIlI = f2;
        this.lIllllIIlIIIlIllllllIIIll = f2;
        this.IllIIIllIIIIlIlIlIllIIlll = System.currentTimeMillis();
    }

    public void lllIIIllIIIIlllIlIIllIIll() {
        float f = this.lIllllIIlIIIlIllllllIIIll - (this.lIllllIIlIIIlIllllllIIIll - this.IIIllIIlIIIIIIlIlIIllIIlI) * this.lllIIIllIIIIlllIlIIllIIll.IllIIlllllllIIlIIlIIIIlIl();
        if (this.lIlllIlllIIIIlIIlllIllIII) {
            class_0210.lllIIIllIIIIlllIlIIllIIll(this.IlIIIIIllllllIIlllIllllll, f, this.IlIIIIIllllllIIlllIllllll + 140.0f, f + 55.0f, -819057106, -822083584);
            for (int i = 0; i < this.IIIllIllIIlIlIlIlIllllIIl.length && i <= 3; ++i) {
                LunarClient.getInstance().robotoMedium13px.lllIIIllIIIIlllIlIIllIIll(this.IIIllIllIIlIlIlIlIllllIIl[i], this.IlIIIIIllllllIIlllIllllll + 4.0f, f + 4.0f + (float)(i * 10), -1);
            }
        } else {
            class_0210.lllIIIllIIIIlllIlIIllIIll(this.IlIIIIIllllllIIlllIllllll, f, this.IlIIIIIllllllIIlllIllllll + 140.0f, f + 55.0f, -819057106, -822083584);
            LunarClient.getInstance().robotoMedium13px.lllIIIllIIIIlllIlIIllIIll(this.IllIIlllllllIIlIIlIIIIlIl, (double)(this.IlIIIIIllllllIIlllIllllll + 4.0f), (double)(f + 4.0f), -1);
            class_0210.lllIIIllIIIIlllIlIIllIIll(this.IlIIIIIllllllIIlllIllllll + 4.0f, f + 14.5f, this.IlIIIIIllllllIIlllIllllll + 140.0f - 5.0f, f + 15.0f, 0x2E5E5E5E);
            for (int i = 0; i < this.IIIllIllIIlIlIlIlIllllIIl.length && i <= 2; ++i) {
                LunarClient.getInstance().robotoMedium13px.lllIIIllIIIIlllIlIIllIIll(this.IIIllIllIIlIlIlIlIllllIIl[i], this.IlIIIIIllllllIIlllIllllll + 4.0f, f + 17.0f + (float)(i * 10), -1);
            }
        }
        if (!(Minecraft.getMinecraft().lllllIlllIIllIlIIlIIIllII instanceof class_0713)) {
            LunarClient.getInstance().robotoMedium13px.lllIIIllIIIIlllIlIIllIIll("Press Shift + Tab", this.IlIIIIIllllllIIlllIllllll + 4.0f, f + (float)class_0078.IlIIIIIllllllIIlllIllllll() - 12.0f, 0x6FFFFFFF);
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(float f) {
        this.lIllllIIlIIIlIllllllIIIll = this.IIIllIIlIIIIIIlIlIIllIIlI;
        this.IIIllIIlIIIIIIlIlIIllIIlI = f;
        this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl();
    }

    public boolean lllIlIIlIIIlIlIIIllIlllIl() {
        return !this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII() || this.lllIIIllIIIIlllIlIIllIIll.IlIIIIIllllllIIlllIllllll();
    }

    public boolean IlIllllllIIlIIllllIIlIIIl() {
        return System.currentTimeMillis() - this.IllIIIllIIIIlIlIlIllIIlll > 3500L;
    }

    public static void lllIIIllIIIIlllIlIIllIIll(String string, String string2) {
        class_0713.IlIlllIIIIIIlIIllIIllIlll().lllIIIllIIIIlllIlIIllIIll(string, string2);
    }

    public static void lllIIIllIIIIlllIlIIllIIll(String string) {
        class_0713.IlIlllIIIIIIlIIllIIllIlll().lllIIIllIIIIlllIlIIllIIll(string);
    }

    public static int lIlllIlllIIIIlIIlllIllIII() {
        return 140;
    }

    public static int IlIIIIIllllllIIlllIllllll() {
        return 55;
    }

    public void lllIIIllIIIIlllIlIIllIIll(boolean bl) {
        this.lIlllIlllIIIIlIIlllIllIII = bl;
    }

    public float lIllllIIlIIIlIllllllIIIll() {
        return this.IlIIIIIllllllIIlllIllllll;
    }

    public float IIIllIIlIIIIIIlIlIIllIIlI() {
        return this.lIllllIIlIIIlIllllllIIIll;
    }

    public float IllIIlllllllIIlIIlIIIIlIl() {
        return this.IIIllIIlIIIIIIlIlIIllIIlI;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(float f) {
        this.IlIIIIIllllllIIlllIllllll = f;
    }

    public void IlIllllllIIlIIllllIIlIIIl(float f) {
        this.lIllllIIlIIIlIllllllIIIll = f;
    }

    public void lIlllIlllIIIIlIIlllIllIII(float f) {
        this.IIIllIIlIIIIIIlIlIIllIIlI = f;
    }
}

