package obf;

import net.minecraft.client.settings.GameSettings;
import net.minecraft.client.settings.Options;

/*
 * Decompiled with CFR 0.150.
 */
public class class_2003
extends class_0229
implements class_0945 {
    private static final Options[] lllIlIIlIIIlIlIIIllIlllIl = new Options[]{Options.FOV, Options.llIIlllIllIllllIIIlIIIIII};
    private final class_0229 IlIllllllIIlIIllllIIlIIIl;
    private final GameSettings lIlllIlllIIIIlIIlllIllIII;
    protected String lllIIIllIIIIlllIlIIllIIll = "Options";

    public class_2003(class_0229 class_02292, GameSettings class_17512) {
        this.IlIllllllIIlIIllllIIlIIIl = class_02292;
        this.lIlllIlllIIIIlIIlllIllIII = class_17512;
    }

    @Override
    public void n_() {
        int n = 0;
        this.lllIIIllIIIIlllIlIIllIIll = class_0616.lllIIIllIIIIlllIlIIllIIll("options.title", new Object[0]);
        for (Options class_07282 : lllIlIIlIIIlIlIIIllIlllIl) {
            if (class_07282.getEnumFloat()) {
                this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1474(class_07282.returnEnumOrdinal(), this.IlIlIIlllIIlIllIIIlllllIl / 2 - 155 + n % 2 * 160, this.lIIlIIIIIlIlllIlIIlIlIlll / 6 + 12 + 24 * (n >> 1), class_07282));
            } else {
                class_1249 class_12492 = new class_1249(class_07282.returnEnumOrdinal(), this.IlIlIIlllIIlIllIIIlllllIl / 2 - 155 + n % 2 * 160, this.lIIlIIIIIlIlllIlIIlIlIlll / 6 + 12 + 24 * (n >> 1), class_07282, this.lIlllIlllIIIIlIIlllIllIII.IlIllllllIIlIIllllIIlIIIl(class_07282));
                if (class_07282 == Options.llIIlllIllIllllIIIlIIIIII && this.lllllIlllIIllIlIIlIIIllII.theWorld != null && this.lllllIlllIIllIlIIlIIIllII.theWorld.lIlllIlllIlIIIIlllIlIlIIl().lIlIlIIlIIIIlIIIIIlllIIII()) {
                    class_12492.IllIIIllIIIIlIlIlIllIIlll = false;
                    class_12492.IllIIlllllllIIlIIlIIIIlIl = class_0616.lllIIIllIIIIlllIlIIllIIll("options.difficulty", new Object[0]) + ": " + class_0616.lllIIIllIIIIlllIlIIllIIll("options.difficulty.hardcore", new Object[0]);
                }
                this.lIlIlIIlIIIIlIIIIIlllIIII.add(class_12492);
            }
            ++n;
        }
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1197(106, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 155, this.lIIlIIIIIlIlllIlIIlIlIlll / 6 + 72 - 6, 150, 20, class_0616.lllIIIllIIIIlllIlIIllIIll("options.sounds", new Object[0])));
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1197(101, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 155, this.lIIlIIIIIlIlllIlIIlIlIlll / 6 + 96 - 6, 150, 20, class_0616.lllIIIllIIIIlllIlIIllIIll("options.video", new Object[0])));
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1197(100, this.IlIlIIlllIIlIllIIIlllllIl / 2 + 5, this.lIIlIIIIIlIlllIlIIlIlIlll / 6 + 96 - 6, 150, 20, class_0616.lllIIIllIIIIlllIlIIllIIll("options.controls", new Object[0])));
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1197(102, this.IlIlIIlllIIlIllIIIlllllIl / 2 + 5, this.lIIlIIIIIlIlllIlIIlIlIlll / 6 + 72 - 6, 150, 20, class_0616.lllIIIllIIIIlllIlIIllIIll("options.language", new Object[0])));
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1197(103, this.IlIlIIlllIIlIllIIIlllllIl / 2 + 5, this.lIIlIIIIIlIlllIlIIlIlIlll / 6 + 120 - 6, 150, 20, class_0616.lllIIIllIIIIlllIlIIllIIll("options.multiplayer.title", new Object[0])));
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1197(105, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 155, this.lIIlIIIIIlIlllIlIIlIlIlll / 6 + 120 - 6, 150, 20, class_0616.lllIIIllIIIIlllIlIIllIIll("options.resourcepack", new Object[0])));
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1197(200, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 100, this.lIIlIIIIIlIlllIlIIlIlIlll / 6 + 168, class_0616.lllIIIllIIIIlllIlIIllIIll("gui.done", new Object[0])));
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1197 class_11972) {
        if (class_11972.IllIIIllIIIIlIlIlIllIIlll) {
            if (class_11972.IIIllIllIIlIlIlIlIllllIIl < 100 && class_11972 instanceof class_1249) {
                this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(((class_1249)class_11972).lllIIIllIIIIlllIlIIllIIll(), 1);
                class_11972.IllIIlllllllIIlIIlIIIIlIl = this.lIlllIlllIIIIlIIlllIllIII.IlIllllllIIlIIllllIIlIIIl(Options.getEnumOptions(class_11972.IIIllIllIIlIlIlIlIllllIIl));
            }
            if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 8675309) {
                this.lllllIlllIIllIlIIlIIIllII.lIIlIIIIIlIlllIlIIlIlIlll.lIlllIlllIIIIlIIlllIllIII();
            }
            if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 101) {
                this.lllllIlllIIllIlIIlIIIllII.gameSettings.IlIllllllIIlIIllllIIlIIIl();
                this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(new class_1987(this, this.lIlllIlllIIIIlIIlllIllIII));
            }
            if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 100) {
                this.lllllIlllIIllIlIIlIIIllII.gameSettings.IlIllllllIIlIIllllIIlIIIl();
                this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(new class_1681(this, this.lIlllIlllIIIIlIIlllIllIII));
            }
            if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 102) {
                this.lllllIlllIIllIlIIlIIIllII.gameSettings.IlIllllllIIlIIllllIIlIIIl();
                this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(new class_0671(this, this.lIlllIlllIIIIlIIlllIllIII, this.lllllIlllIIllIlIIlIIIllII.llllIlIIIIIIIIIlllIIlIIIl()));
            }
            if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 103) {
                this.lllllIlllIIllIlIIlIIIllII.gameSettings.IlIllllllIIlIIllllIIlIIIl();
                this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(new class_2240(this, this.lIlllIlllIIIIlIIlllIllIII));
            }
            if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 104) {
                this.lllllIlllIIllIlIIlIIIllII.gameSettings.IlIllllllIIlIIllllIIlIIIl();
                this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(new class_0382(this, this.lIlllIlllIIIIlIIlllIllIII));
            }
            if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 200) {
                this.lllllIlllIIllIlIIlIIIllII.gameSettings.IlIllllllIIlIIllllIIlIIIl();
                this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl);
            }
            if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 105) {
                this.lllllIlllIIllIlIIlIIIllII.gameSettings.IlIllllllIIlIIllllIIlIIIl();
                this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(new class_2018(this));
            }
            if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 106) {
                this.lllllIlllIIllIlIIlIIIllII.gameSettings.IlIllllllIIlIIllllIIlIIIl();
                this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(new class_0329(this, this.lIlllIlllIIIIlIIlllIllIII));
            }
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
        this.llIIlIllIllllIlIIIIlIIlll();
        this.lllIIIllIIIIlllIlIIllIIll(this.lIlIllIIlIIlIIlIIlIIlIIll, this.lllIIIllIIIIlllIlIIllIIll, this.IlIlIIlllIIlIllIIIlllllIl / 2, 15, 0xFFFFFF);
        super.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
    }
}

