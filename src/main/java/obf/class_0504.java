package obf;

import net.minecraft.client.settings.GameSettings;
import net.minecraft.client.settings.Options;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0504
extends class_0229 {
    private class_0229 lllIlIIlIIIlIlIIIllIlllIl;
    protected String lllIIIllIIIIlllIlIIllIIll = "Animation Settings";
    private GameSettings IlIllllllIIlIIllllIIlIIIl;
    private static Options[] lIlllIlllIIIIlIIlllIllIII = new Options[]{Options.IllIlIlIIIlllIIllIIIIlIll, Options.IlIIIlIllIIIllIIIIlIIlIll, Options.llllIIllIlIlllllllIIlIIlI, Options.IlllIIlllllllIIllIlIllllI, Options.IlIlIllIIlIIIIlllIlIllIlI, Options.IlIIllIlIlIllIIIlIIlIlIIl, Options.lIlIIllIllIIIIIlIllllIIIl, Options.lIlllIIllIIIIIIlIlIIlIllI, Options.lIIllIIlIIIlllIlllIIlIIlI, Options.IllIIllIlIlllIllIllIlIIIl, Options.IIIlIllllIIIlllllIllIlIII, Options.IIIIIllIlIllIlIlIIlIllIIl, Options.lIIllIlIIlIIlllllIlIIllIl, Options.IlIIlIIlllllIlIIlIlIlIlIl, Options.lllllllIlIIlIlIIIlIlIIlll, Options.llIllllIIIIIlIIlIlllIIlll, Options.lllllIllllIIIIllIIlIlIlII, Options.lllllIlllIIllIlIIlIIIllII};

    public class_0504(class_0229 class_02292, GameSettings class_17512) {
        this.lllIlIIlIIIlIlIIIllIlllIl = class_02292;
        this.IlIllllllIIlIIllllIIlIIIl = class_17512;
    }

    @Override
    public void n_() {
        int n = 0;
        for (Options class_07282 : lIlllIlllIIIIlIIlllIllIII) {
            int n2 = this.IlIlIIlllIIlIllIIIlllllIl / 2 - 155 + n % 2 * 160;
            int n3 = this.lIIlIIIIIlIlllIlIIlIlIlll / 6 + 21 * (n / 2) - 10;
            if (!class_07282.getEnumFloat()) {
                this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1249(class_07282.returnEnumOrdinal(), n2, n3, class_07282, this.IlIllllllIIlIIllllIIlIIIl.IlIllllllIIlIIllllIIlIIIl(class_07282)));
            } else {
                this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1474(class_07282.returnEnumOrdinal(), n2, n3, class_07282));
            }
            ++n;
        }
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1197(210, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 155, this.lIIlIIIIIlIlllIlIIlIlIlll / 6 + 168 + 11, 70, 20, "All ON"));
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1197(211, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 155 + 80, this.lIIlIIIIIlIlllIlIIlIlIlll / 6 + 168 + 11, 70, 20, "All OFF"));
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1249(200, this.IlIlIIlllIIlIllIIIlllllIl / 2 + 5, this.lIIlIIIIIlIlllIlIIlIlIlll / 6 + 168 + 11, class_0616.lllIIIllIIIIlllIlIIllIIll("gui.done", new Object[0])));
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1197 class_11972) {
        if (class_11972.IllIIIllIIIIlIlIlIllIIlll) {
            if (class_11972.IIIllIllIIlIlIlIlIllllIIl < 200 && class_11972 instanceof class_1249) {
                this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(((class_1249)class_11972).lllIIIllIIIIlllIlIIllIIll(), 1);
                class_11972.IllIIlllllllIIlIIlIIIIlIl = this.IlIllllllIIlIIllllIIlIIIl.IlIllllllIIlIIllllIIlIIIl(Options.getEnumOptions(class_11972.IIIllIllIIlIlIlIlIllllIIl));
            }
            if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 200) {
                this.lllllIlllIIllIlIIlIIIllII.gameSettings.IlIllllllIIlIIllllIIlIIIl();
                this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl);
            }
            if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 210) {
                this.lllllIlllIIllIlIIlIIIllII.gameSettings.lllIIIllIIIIlllIlIIllIIll(true);
            }
            if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 211) {
                this.lllllIlllIIllIlIIlIIIllII.gameSettings.lllIIIllIIIIlllIlIIllIIll(false);
            }
            if (class_11972.IIIllIllIIlIlIlIlIllllIIl != Options.lIIIllIIIIIllllIlIlIllIll.ordinal()) {
                class_0321 class_03212 = new class_0321(this.lllllIlllIIllIlIIlIIIllII, this.lllllIlllIIllIlIIlIIIllII.displayWidth, this.lllllIlllIIllIlIIlIIIllII.displayHeight);
                int n = class_03212.lllIIIllIIIIlllIlIIllIIll();
                int n2 = class_03212.lllIlIIlIIIlIlIIIllIlllIl();
                this.lllIIIllIIIIlllIlIIllIIll(this.lllllIlllIIllIlIIlIIIllII, n, n2);
            }
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
        this.llIIlIllIllllIlIIIIlIIlll();
        this.lllIIIllIIIIlllIlIIllIIll(this.lIlIllIIlIIlIIlIIlIIlIIll, this.lllIIIllIIIIlllIlIIllIIll, this.IlIlIIlllIIlIllIIIlllllIl / 2, 20, 0xFFFFFF);
        super.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
    }
}

