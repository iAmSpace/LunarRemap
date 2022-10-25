package obf;

import net.minecraft.util.ResourceLocation;
import com.moonsworth.lunar.client.LunarClient;

/*
 * Decompiled with CFR 0.150.
 */
public class class_2079
extends class_0935 {
    private class_0229 lllIIIllIIIIlllIlIIllIIll;
    private class_0944 lllIlIIlIIIlIlIIIllIlllIl;
    private class_0944 lIllllIIlIIIlIllllllIIIll;
    private class_0730 IIIllIIlIIIIIIlIlIIllIIlI;
    private boolean IllIIlllllllIIlIIlIIIIlIl;

    public class_2079(class_0229 class_02292) {
        this.lllIIIllIIIIlllIlIIllIIll = class_02292;
        this.IIIllIIlIIIIIIlIlIIllIIlI = new class_0730(2000L, -1, -52429);
        this.lllIlIIlIIIlIlIIIllIlllIl = new class_0944("Cancel");
        this.lIllllIIlIIIlIllllllIIIll = new class_0944("I understand, continue");
    }

    @Override
    public void n_() {
        this.lIlIlIIlIIIIlIIIIIlllIIII();
        this.IllIIlllllllIIlIIlIIIIlIl = true;
        float f = this.lIllllIIlIIIlIllllllIIIll() / 2.0f;
        float f2 = this.IIIllIIlIIIIIIlIlIIllIIlI() / 2.0f - 50.0f;
        this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(f - 75.0f, f2 + 50.0f, 150.0f, 12.0f);
        this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(f - 75.0f, f2 + 64.0f, 150.0f, 12.0f);
        this.lllIlIIlIIIlIlIIIllIlllIl.IllIIlllllllIIlIIlIIIIlIl();
    }

    @Override
    public void o_() {
        this.lllllIlllIIllIlIIlIIIllII.lIIlIIIIIlIlllIlIIlIlIlll.IlIllllllIIlIIllllIIlIIIl();
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(float f, float f2) {
        if (this.IllIIlllllllIIlIIlIIIIlIl && this.IIIllIIlIIIIIIlIlIIllIIlI.IlIIIIIllllllIIlllIllllll()) {
            this.IllIIlllllllIIlIIlIIIIlIl = false;
        } else if (!this.IllIIlllllllIIlIIlIIIIlIl && this.IIIllIIlIIIIIIlIlIIllIIlI.IlIIIIIllllllIIlllIllllll()) {
            this.IllIIlllllllIIlIIlIIIIlIl = true;
        }
        this.lllIlIIlIIIlIlIIIllIlllIl(this.lIllllIIlIIIlIllllllIIIll(), this.IIIllIIlIIIIIIlIlIIllIIlI());
        float f3 = this.lIllllIIlIIIlIllllllIIIll() / 2.0f;
        float f4 = this.IIIllIIlIIIIIIlIlIIllIIlI() / 2.0f - 50.0f;
        LunarClient.getInstance().robotoLight18px.lllIlIIlIIIlIlIIIllIlllIl("WARNING!", f3, f4, this.IIIllIIlIIIIIIlIlIIllIIlI.lllIlIIlIIIlIlIIIllIlllIl(this.IllIIlllllllIIlIIlIIIIlIl).getRGB());
        LunarClient.getInstance().robotoLight16px.lllIlIIlIIIlIlIIIllIlllIl("Leaving competitive games may result in penalties.", f3, f4 + 15.0f, -1);
        LunarClient.getInstance().robotoLight16px.lllIlIIlIIIlIlIIIllIlllIl("You may be suspended from competitive games if you continue leaving games!", f3, f4 + 25.0f, -1);
        this.lllIlIIlIIIlIlIIIllIlllIl.lllIlIIlIIIlIlIIIllIlllIl(f, f2, true);
        this.lIllllIIlIIIlIllllllIIIll.lllIlIIlIIIlIlIIIllIlllIl(f, f2, true);
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(float f, float f2, int n) {
        if (this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(f, f2)) {
            this.lllllIlllIIllIlIIlIIIllII.IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
            this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll);
        } else if (this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(f, f2)) {
            this.lllllIlllIIllIlIIlIIIllII.IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
            this.lllllIlllIIllIlIIlIIIllII.theWorld.q_();
            this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll((class_0564)null);
            this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(new class_2097());
        }
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(float f, float f2, int n) {
    }
}

