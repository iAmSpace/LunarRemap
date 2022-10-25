package obf;/*
 * Decompiled with CFR 0.150.
 */
import com.moonsworth.lunar.client.LunarClient;

import java.awt.Color;

public class class_2078
extends class_0229 {
    private int lllIIIllIIIIlllIlIIllIIll;
    private int lllIlIIlIIIlIlIIIllIlllIl;
    private class_1197 IlIllllllIIlIIllllIIlIIIl;
    private class_1623 lIlllIlllIIIIlIIlllIllIII;
    private long IlIIIIIllllllIIlllIllllll;
    private boolean lIllllIIlIIIlIllllllIIIll = false;
    private class_1746 IIIllIIlIIIIIIlIlIIllIIlI = new class_1746(1500L);

    @Override
    public void n_() {
        this.lllIIIllIIIIlllIlIIllIIll = 0;
        this.lIlIlIIlIIIIlIIIIIlllIIII.clear();
        int n = -16;
        boolean bl = true;
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1197(1, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 100, this.lIIlIIIIIlIlllIlIIlIlIlll / 4 + 120 + n, class_0616.lllIIIllIIIIlllIlIIllIIll("menu.returnToMenu", new Object[0])));
        if (!this.lllllIlllIIllIlIIlIIIllII.IIIIlIllIlIIlIIlIllIlIlll()) {
            ((class_1197)this.lIlIlIIlIIIIlIIIIIlllIIII.get((int)0)).IllIIlllllllIIlIIlIIIIlIl = class_0616.lllIIIllIIIIlllIlIIllIIll("menu.disconnect", new Object[0]);
        }
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1197(4, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 100, this.lIIlIIIIIlIlllIlIIlIlIlll / 4 + 24 + n, class_0616.lllIIIllIIIIlllIlIIllIIll("menu.returnToGame", new Object[0])));
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1197(0, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 100, this.lIIlIIIIIlIlllIlIIlIlIlll / 4 + 96 + n, 98, 20, class_0616.lllIIIllIIIIlllIlIIllIIll("menu.options", new Object[0])));
        class_1197 class_11972 = new class_1197(7, this.IlIlIIlllIIlIllIIIlllllIl / 2 + 2, this.lIIlIIIIIlIlllIlIIlIlIlll / 4 + 96 + n, 98, 20, class_0616.lllIIIllIIIIlllIlIIllIIll("menu.shareToLan", new Object[0]));
        class_11972.IllIIIllIIIIlIlIlIllIIlll = this.lllllIlllIIllIlIIlIIIllII.IlIlIIlllIllllllllIIIlIlI() && !this.lllllIlllIIllIlIIlIIIllII.llllIIIIlIIIlIIIIIIlIllll().lIIlIIlIllIlIIlIlIIlIlIlI();
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1197(5, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 100, this.lIIlIIIIIlIlllIlIIlIlIlll / 4 + 48 + n, 98, 20, class_0616.lllIIIllIIIIlllIlIIllIIll("gui.achievements", new Object[0])));
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1197(6, this.IlIlIIlllIIlIllIIIlllllIl / 2 + 2, this.lIIlIIIIIlIlllIlIIlIlIlll / 4 + 48 + n, 98, 20, class_0616.lllIIIllIIIIlllIlIIllIIll("gui.stats", new Object[0])));
        if (!class_11972.IllIIIllIIIIlIlIlIllIIlll) {
            this.IlIllllllIIlIIllllIIlIIIl = new class_1197(10, this.IlIlIIlllIIlIllIIIlllllIl / 2 + 2, this.lIIlIIIIIlIlllIlIIlIlIlll / 4 + 96 + n, 98, 20, "Mods");
            this.lIlIlIIlIIIIlIIIIIlllIIII.add(this.IlIllllllIIlIIllllIIlIIIl);
            this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1197(16, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 100, this.lIIlIIIIIlIlllIlIIlIlIlll / 4 + 72 + n, 200, 20, "Server List"));
        } else {
            this.lIlIlIIlIIIIlIIIIIlllIIII.add(class_11972);
            this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1197(16, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 100, this.lIIlIIIIIlIlllIlIIlIlIlll / 4 + 72 + n, 98, 20, "Server List"));
            this.IlIllllllIIlIIllllIIlIIIl = new class_1197(10, this.IlIlIIlllIIlIllIIIlllllIl / 2 + 2, this.lIIlIIIIIlIlllIlIIlIlIlll / 4 + 72 + n, 98, 20, "Mods");
            this.lIlIlIIlIIIIlIIIIIlllIIII.add(this.IlIllllllIIlIIllllIIlIIIl);
        }
    }

    private void lllIIIllIIIIlllIlIIllIIll(double d, double d2) {
        try {
            float f = 64.0f;
            float f2 = (float)d / 2.0f - f / 2.0f;
            float f3 = Math.max(this.lIlIlIIlIIIIlIIIIIlllIIII.size() > 2 ? (float)((class_1197)this.lIlIlIIlIIIIlIIIIIlllIIII.get((int)1)).IIIllIIlIIIIIIlIlIIllIIlI - f - 32.0f : -100.0f, f / 10.0f);
            if (this.lIlllIlllIIIIlIIlllIllIII == null) {
                this.lIlllIlllIIIIlIIlllIllIII = new class_1623(false);
            }
            this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(f2, f3, f, 58.5f);
            this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl(0.0f, 0.0f, true);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1197 class_11972) {
        this.lIllllIIlIIIlIllllllIIIll = false;
        switch (class_11972.IIIllIllIIlIlIlIlIllllIIl) {
            case 16: {
                this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(new class_1381(this));
                break;
            }
            case 0: {
                this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(new class_2003(this, this.lllllIlllIIllIlIIlIIIllII.gameSettings));
                break;
            }
            case 1: {
                if (LunarClient.getInstance().getNetworkManager().IIIllIIlIIIIIIlIlIIllIIlI()) {
                    this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(new class_2079(this));
                    break;
                }
                class_11972.IllIIIllIIIIlIlIlIllIIlll = false;
                this.lllllIlllIIllIlIIlIIIllII.theWorld.q_();
                this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll((class_0564)null);
                this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(new class_2097());
            }
            default: {
                break;
            }
            case 4: {
                this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll((class_0229)null);
                this.lllllIlllIIllIlIIlIIIllII.lllIIlIIIllllllIIIIlIlIlI();
                break;
            }
            case 5: {
                this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(new class_0699(this, this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII.IlIIlllllIIlIlIlllllIllll()));
                break;
            }
            case 6: {
                this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(new class_0342(this, this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII.IlIIlllllIIlIlIlllllIllll()));
                break;
            }
            case 7: {
                this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(new class_1330(this));
                break;
            }
            case 10: {
                this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(new class_0822());
            }
        }
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
        super.IlIllllllIIlIIllllIIlIIIl();
        ++this.lllIlIIlIIIlIlIIIllIlllIl;
        if (this.lIlllIlllIIIIlIIlllIllIII != null) {
            this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll();
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
        this.llIIlIllIllllIlIIIIlIIlll();
        int n3 = 255;
        int n4 = 255;
        double d = (double)Math.min(this.IlIlIIlllIIlIllIIIlllllIl, this.lIIlIIIIIlIlllIlIIlIlIlll) / ((double)n3 * 9.0);
        int n5 = (int)((double)n3 * d);
        int n6 = (int)((double)n4 * d);
        this.lllIIIllIIIIlllIlIIllIIll(this.IlIlIIlllIIlIllIIIlllllIl, (double)this.lIIlIIIIIlIlllIlIIlIlIlll);
        boolean bl = false;
        for (class_0227 class_02272 : LunarClient.getInstance().lllIlIIlIIIlIlIIIllIlllIl) {
            if (class_02272.lllIIIllIIIIlllIlIIllIIll() != class_2010.lllIlIIlIIIlIlIIIllIlllIl) continue;
            bl = true;
        }
        if (bl) {
            if (!this.IIIllIIlIIIIIIlIlIIllIIlI.lIlllIlllIIIIlIIlllIllIII()) {
                this.IIIllIIlIIIIIIlIlIIllIIlI.lllIlIIlIIIlIlIIIllIlllIl();
            }
            this.IIIllIIlIIIIIIlIlIIllIIlI.IlIllllllIIlIIllllIIlIIIl();
            class_0210.lllIIIllIIIIlllIlIIllIIll(this.IlIlIIlllIIlIllIIIlllllIl / 2 - 100, this.lIIlIIIIIlIlllIlIIlIlIlll / 4 + 128, this.IlIlIIlllIIlIllIIIlllllIl / 2 + 100, this.lIIlIIIIIlIlllIlIIlIlIlll / 4 + 142, 0x6F000000);
            class_0210.lllIIIllIIIIlllIlIIllIIll(this.IlIlIIlllIIlIllIIIlllllIl / 2 - 100, this.lIIlIIIIIlIlllIlIIlIlIlll / 4 + 128, this.IlIlIIlllIIlIllIIIlllllIl / 2 + 100, this.lIIlIIIIIlIlllIlIIlIlIlll / 4 + 142, new Color(1.0f, 0.15f, 0.15f, 0.65f * this.IIIllIIlIIIIIIlIlIIllIIlI.IllIIlllllllIIlIIlIIIIlIl()).getRGB());
            LunarClient.getInstance().ubuntuMedium16px.lllIlIIlIIIlIlIIIllIlllIl("Some login services might be offline".toUpperCase(), this.IlIlIIlllIIlIllIIIlllllIl / 2, this.lIIlIIIIIlIlllIlIIlIlIlll / 4 + 130, -1);
        }
        super.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
    }
}

