package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.GL11
 */
import com.moonsworth.lunar.client.LunarClient;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public class class_1998
extends class_0229 {
    private final class_1665 lllIIIllIIIIlllIlIIllIIll;
    private class_0822 lllIlIIlIIIlIlIIIllIlllIl;

    public class_1998(class_0822 class_08222, class_1665 class_16652) {
        class_16652.lllIIIllIIIIlllIlIIllIIll(true);
        this.lllIIIllIIIIlllIlIIllIIll = class_16652;
        this.lllIlIIlIIIlIlIIIllIlllIl = class_08222;
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
    }

    @Override
    public void n_() {
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
        this.llIIlIllIllllIlIIIIlIIlll();
        class_0857.lllIIIllIIIIlllIlIIllIIll(0.0, (double)(this.lIIlIIIIIlIlllIlIIlIlIlll / 3), (double)this.IlIlIIlllIIlIllIIIlllllIl, (double)((float)(this.lIIlIIIIIlIlllIlIIlIlIlll / 3) + 0.5f), 0.0, 0x6F000000);
        class_0857.lllIIIllIIIIlllIlIIllIIll(0.0, (double)(this.lIIlIIIIIlIlllIlIIlIlIlll / 3 * 2), (double)this.IlIlIIlllIIlIllIIIlllllIl, (double)((float)(this.lIIlIIIIIlIlllIlIIlIlIlll / 3 * 2) + 0.5f), 0.0, 0x6F000000);
        class_0857.lllIIIllIIIIlllIlIIllIIll((double)(this.IlIlIIlllIIlIllIIIlllllIl / 3), 0.0, (double)((float)(this.IlIlIIlllIIlIllIIIlllllIl / 3) + 0.5f), (double)this.lIIlIIIIIlIlllIlIIlIlIlll, 0.0, 0x6F000000);
        class_0857.lllIIIllIIIIlllIlIIllIIll((double)(this.IlIlIIlllIIlIllIIIlllllIl / 3 * 2), 0.0, (double)((float)(this.IlIlIIlllIIlIllIIIlllllIl / 3 * 2) + 0.5f), (double)this.lIIlIIIIIlIlllIlIIlIlIlll, 0.0, 0x6F000000);
        class_0857.lllIIIllIIIIlllIlIIllIIll((double)(this.IlIlIIlllIIlIllIIIlllllIl / 3 + this.IlIlIIlllIIlIllIIIlllllIl / 6), (double)(this.lIIlIIIIIlIlllIlIIlIlIlll / 3 * 2), (double)((float)(this.IlIlIIlllIIlIllIIIlllllIl / 3 + this.IlIlIIlllIIlIllIIIlllllIl / 6) + 0.5f), (double)this.lIIlIIIIIlIlllIlIIlIlIlll, 0.0, 0x6F000000);
        float f2 = 1.0f / LunarClient.IllIIIllIIIIlIlIlIllIIlll();
        float f3 = (float)(LunarClient.getInstance().ubuntuMedium16px.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll.IIIllIIlIIIIIIlIlIIllIIlI()) + 6) * f2;
        if (this.lllIIIllIIIIlllIlIIllIIll.llIllllIlIllIIIlIllIIlIlI < f3) {
            this.lllIIIllIIIIlllIlIIllIIll.llIllllIlIllIIIlIllIIlIlI = (int)f3;
        }
        if (this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIlIIIIlllIlIlIIl < 18.0f) {
            this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIlIIIIlllIlIlIIl = 18.0f;
        }
        class_0321 class_03212 = new class_0321(this.lllllIlllIIllIlIIlIIIllII, this.lllllIlllIIllIlIIlIIIllII.displayWidth, this.lllllIlllIIllIlIIlIIIllII.displayHeight);
        float[] arrf = class_1271.lllIlIIlIIIlIlIIIllIlllIl(n, n2, class_03212);
        class_0767 class_07672 = class_1271.lllIIIllIIIIlllIlIIllIIll(n, n2, class_03212);
        if (class_07672 != class_0767.IlIIIIIllllllIIlllIllllll) {
            if (class_07672 == class_0767.lIllllIIlIIIlIllllllIIIll || class_07672 == class_0767.IIIllIIlIIIIIIlIlIIllIIlI) {
                class_0210.lllIIIllIIIIlllIlIIllIIll(arrf[0], arrf[1], arrf[0] + (float)(class_03212.lllIIIllIIIIlllIlIIllIIll() / 6), arrf[1] + (float)(class_03212.lllIlIIlIIIlIlIIIllIlllIl() / 3), 0x2F000000);
            } else {
                class_0210.lllIIIllIIIIlllIlIIllIIll(arrf[0], arrf[1], arrf[0] + (float)(class_03212.lllIIIllIIIIlllIlIIllIIll() / 3), arrf[1] + (float)(class_03212.lllIlIIlIIIlIlIIIllIlllIl() / 3), 0x2F000000);
            }
        }
        int n3 = class_03212.lllIIIllIIIIlllIlIIllIIll();
        int n4 = class_03212.lllIlIIlIIIlIlIIIllIlllIl();
        float[] arrf2 = class_1271.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, n, n2, class_03212);
        if (class_07672 != this.lllIIIllIIIIlllIlIIllIIll.IlIlllIIIIIIlIIllIIllIlll()) {
            this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(class_07672);
            this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f);
        }
        if (!Mouse.isButtonDown((int)1)) {
            class_0857.lllIIIllIIIIlllIlIIllIIll(2.0, 0.0, 2.5, (double)n4, 0.0, -15599126);
            class_0857.lllIIIllIIIIlllIlIIllIIll((double)((float)n3 - 2.5f), 0.0, (double)(n3 - 2), (double)n4, 0.0, -15599126);
            class_0857.lllIIIllIIIIlllIlIIllIIll(0.0, 2.0, (double)n3, 2.5, 0.0, -15599126);
            class_0857.lllIIIllIIIIlllIlIIllIIll(0.0, (double)((float)n4 - 3.5f), (double)n3, (double)(n4 - 3), 0.0, -15599126);
        }
        float f4 = (float)n - arrf[0] - arrf2[0];
        float f5 = (float)n2 - arrf[1] - arrf2[1];
        if (!Mouse.isButtonDown((int)1)) {
            float[] arrf3 = this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(class_03212, false);
            f4 = this.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, f4, arrf3, (float)((int)(this.lllIIIllIIIIlllIlIIllIIll.llIllllIlIllIIIlIllIIlIlI * ((Float)this.lllIIIllIIIIlllIlIIllIIll.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue())), false);
            f5 = this.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, f5, arrf3, (float)((int)(this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIlIIIIlllIlIlIIl * ((Float)this.lllIIIllIIIIlllIlIIllIIll.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue())), false);
        }
        this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(f4, f5);
        GL11.glPushMatrix();
        this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(class_03212);
        class_0857.lllIIIllIIIIlllIlIIllIIll(-2.0, -2.0, (double)(this.lllIIIllIIIIlllIlIIllIIll.llIllllIlIllIIIlIllIIlIlI + 2.0f), (double)(this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIlIIIIlllIlIlIIl + 2.0f), 4.0, 551805923);
        GL11.glPushMatrix();
        GL11.glScalef((float)f2, (float)f2, (float)f2);
        LunarClient.getInstance().ubuntuMedium16px.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll.IIIllIIlIIIIIIlIlIIllIIlI(), 0.0, -1.0, -1, 0x6F000000);
        GL11.glPopMatrix();
        GL11.glPopMatrix();
    }

    private float lllIIIllIIIIlllIlIIllIIll(class_1665 class_16652, float f, float[] arrf, float f2, boolean bl) {
        int n;
        float f3 = f;
        int n2 = n = bl ? 0 : 3;
        if (f3 + arrf[0] < (float)n) {
            f3 = -arrf[0] + (float)n;
        } else if (f3 + arrf[0] * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() + f2 > (float)(this.IlIlIIlllIIlIllIIIlllllIl - n)) {
            f3 = (int)((float)this.IlIlIIlllIIlIllIIIlllllIl - arrf[0] * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() - f2 - (float)n);
        }
        return f3;
    }

    private float lllIlIIlIIIlIlIIIllIlllIl(class_1665 class_16652, float f, float[] arrf, float f2, boolean bl) {
        int n;
        float f3 = f;
        int n2 = n = bl ? 0 : 2;
        if (f3 + arrf[1] < (float)n) {
            f3 = -arrf[1] + (float)n;
        } else if (f3 + arrf[1] * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() + f2 > (float)(this.lIIlIIIIIlIlllIlIIlIlIlll - n)) {
            f3 = (int)((float)this.lIIlIIIIIlIlllIlIIlIlIlll - arrf[1] * ((Float)class_16652.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII()).floatValue() - f2 - (float)n);
        }
        return f3;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        if (n3 != 0) {
            return;
        }
        class_0321 class_03212 = new class_0321(this.lllllIlllIIllIlIIlIIIllII, this.lllllIlllIIllIlIIlIIIllII.displayWidth, this.lllllIlllIIllIlIIlIIIllII.displayHeight);
        class_0767 class_07672 = class_1271.lllIIIllIIIIlllIlIIllIIll(n, n2, class_03212);
        this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(class_07672);
        Minecraft.getMinecraft().IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
        this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(true);
        class_0822 class_08222 = new class_0822();
        this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(class_08222);
        class_08222.IllIIIllIIIIlIlIlIllIIlll = class_08222.IIIllIIlIIIIIIlIlIIllIIlI;
        class_08222.IllIIIllIIIIlIlIlIllIIlll.llIIllIllIlIIlIIllIllllll = false;
        class_08222.IllIIIllIIIIlIlIlIllIIlll.IIIllIllIIlIlIlIlIllllIIl = this.lllIlIIlIIIlIlIIIllIlllIl.IIIllIIlIIIIIIlIlIIllIIlI.IIIllIllIIlIlIlIlIllllIIl;
        class_08222.IllIIIllIIIIlIlIlIllIIlll.IlIllllllIIlIIllllIIlIIIl = 0;
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, int n3) {
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(char c, int n) {
    }
}

