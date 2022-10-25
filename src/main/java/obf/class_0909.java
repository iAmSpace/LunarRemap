package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.awt.Color;

import com.moonsworth.lunar.client.LunarClient;
import org.lwjgl.opengl.GL11;

public class class_0909
extends class_1546 {
    private class_0980 lIllllIIlIIIlIllllllIIIll;
    private class_0980 IIIllIIlIIIIIIlIlIIllIIlI;
    private final class_0847 IllIIlllllllIIlIIlIIIIlIl;
    public static int lllIlIIlIIIlIlIIIllIlllIl;
    private class_1623 IIIllIllIIlIlIlIlIllllIIl;

    public class_0909() {
        this.lIllllIIlIIIlIllllllIIIll = new class_0980("SINGLEPLAYER", LunarClient.getInstance().robotoLight18px);
        this.IIIllIIlIIIIIIlIlIIllIIlI = new class_0980("MULTIPLAYER", LunarClient.getInstance().robotoLight18px);
        this.IllIIlllllllIIlIIlIIIIlIl = new class_0847(400L);
    }

    @Override
    public void a_() {
        super.a_();
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
        super.IlIllllllIIlIIllllIIlIIIl();
        if (this.lllIIlIIIllllllIIIIlIlIlI() && !this.IllIIlllllllIIlIIlIIIIlIl.lIlllIlllIIIIlIIlllIllIII()) {
            this.IllIIlllllllIIlIIlIIIIlIl.lllIlIIlIIIlIlIIIllIlllIl();
        }
    }

    @Override
    public void n_() {
        super.n_();
        this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll() / 2.0f - 50.0f, this.IIIllIIlIIIIIIlIlIIllIIlI() / 2.0f + 5.0f, 100.0f, (float) LunarClient.getInstance().robotoLight18px.lllIIIllIIIIlllIlIIllIIll() + 9.5f);
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll() / 2.0f - 50.0f, this.IIIllIIlIIIIIIlIlIIllIIlI() / 2.0f + 24.0f, 100.0f, (float) LunarClient.getInstance().robotoLight18px.lllIIIllIIIIlllIlIIllIIll() + 9.5f);
        ++lllIlIIlIIIlIlIIIllIlllIl;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(float f, float f2) {
        super.lllIIIllIIIIlllIlIIllIIll(f, f2);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        this.lIllllIIlIIIlIllllllIIIll.lllIlIIlIIIlIlIIIllIlllIl(f, f2, true);
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIlIIlIIIlIlIIIllIlllIl(f, f2, true);
        if (this.lllIIlIIIllllllIIIIlIlIlI()) {
            class_0210.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, this.lIllllIIlIIIlIllllllIIIll(), this.IIIllIIlIIIIIIlIlIIllIIlI(), new Color(0.2f, 0.2f, 0.2f, 1.0f - 1.0f * this.IllIIlllllllIIlIIlIIIIlIl.IllIIlllllllIIlIIlIIIIlIl()).getRGB());
        }
        this.lllIIIllIIIIlllIlIIllIIll((double)this.lIllllIIlIIIlIllllllIIIll(), (double)this.IIIllIIlIIIIIIlIlIIllIIlI());
        float f3 = this.lIllllIIlIIIlIllllllIIIll() / 2.0f - 80.0f;
        float f4 = this.IIIllIIlIIIIIIlIlIIllIIlI() - 40.0f;
        class_0857.lllIIIllIIIIlllIlIIllIIll((double)f3, (double)f4, (double)(f3 + 160.0f), (double)(f4 + 10.0f), 8.0, new Color(218, 66, 83, 0).getRGB());
    }

    private void lllIIIllIIIIlllIlIIllIIll(double d, double d2) {
        float f = 64.0f;
        float f2 = (float)(d / 2.0 - (double)(f / 2.0f));
        float f3 = (float)(d2 / 2.0 - (double)f - 12.0);
        if (this.IIIllIllIIlIlIlIlIllllIIl == null) {
            this.IIIllIllIIlIlIlIlIllllIIl = new class_1623();
        }
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(f2, f3, 64.0f, 58.5f);
        this.IIIllIllIIlIlIlIlIllllIIl.lllIlIIlIIIlIlIIIllIlllIl(0.0f, 0.0f, true);
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(float f, float f2, int n) {
        super.lllIIIllIIIIlllIlIIllIIll(f, f2, n);
        this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(f, f2, n, true);
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(f, f2, n, true);
        if (this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(f, f2)) {
            this.lllllIlllIIllIlIIlIIIllII.IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
            this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(new class_2083(this));
        } else if (this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(f, f2)) {
            this.lllllIlllIIllIlIIlIIIllII.IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
            this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(new class_1381(this));
        }
    }

    public boolean lllIIlIIIllllllIIIIlIlIlI() {
        return lllIlIIlIIIlIlIIIllIlllIl == 1;
    }

    public class_0847 IlIlllIIIIIIlIIllIIllIlll() {
        return this.IllIIlllllllIIlIIlIIIIlIl;
    }
}

