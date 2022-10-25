package obf;

import net.minecraft.client.settings.GameSettings;
import net.minecraft.client.settings.Options;

/*
 * Decompiled with CFR 0.150.
 */
public class class_2240
extends class_0229 {
    private static final Options[] lllIIIllIIIIlllIlIIllIIll = new Options[]{Options.IlIlIIlllIIlIllIIIlllllIl, Options.lIIlIIIIIlIlllIlIIlIlIlll, Options.lIlIlIIlIIIIlIIIIIlllIIII, Options.IlIIIlIIIIllIIIllIIIIIIll, Options.CHAT_LINKS_PROMPT, Options.CHAT_SCALE, Options.CHAT_HEIGHT_FOCUSED, Options.CHAT_HEIGHT_UNFOCUSED, Options.CHAT_WIDTH};
    private static final Options[] lllIlIIlIIIlIlIIIllIlllIl = new Options[]{Options.SHOW_CAPE};
    private final class_0229 IlIllllllIIlIIllllIIlIIIl;
    private final GameSettings lIlllIlllIIIIlIIlllIllIII;
    private String IlIIIIIllllllIIlllIllllll;
    private String lIllllIIlIIIlIllllllIIIll;
    private int IIIllIIlIIIIIIlIlIIllIIlI;

    public class_2240(class_0229 class_02292, GameSettings class_17512) {
        this.IlIllllllIIlIIllllIIlIIIl = class_02292;
        this.lIlllIlllIIIIlIIlllIllIII = class_17512;
    }

    @Override
    public void n_() {
        int n = 0;
        this.IlIIIIIllllllIIlllIllllll = class_0616.lllIIIllIIIIlllIlIIllIIll("options.chat.title", new Object[0]);
        this.lIllllIIlIIIlIllllllIIIll = class_0616.lllIIIllIIIIlllIlIIllIIll("options.multiplayer.title", new Object[0]);
        for (Options class_07282 : lllIIIllIIIIlllIlIIllIIll) {
            if (class_07282.getEnumFloat()) {
                this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1474(class_07282.returnEnumOrdinal(), this.IlIlIIlllIIlIllIIIlllllIl / 2 - 155 + n % 2 * 160, this.lIIlIIIIIlIlllIlIIlIlIlll / 6 + 24 * (n >> 1), class_07282));
            } else {
                this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1249(class_07282.returnEnumOrdinal(), this.IlIlIIlllIIlIllIIIlllllIl / 2 - 155 + n % 2 * 160, this.lIIlIIIIIlIlllIlIIlIlIlll / 6 + 24 * (n >> 1), class_07282, this.lIlllIlllIIIIlIIlllIllIII.IlIllllllIIlIIllllIIlIIIl(class_07282)));
            }
            ++n;
        }
        if (n % 2 == 1) {
            ++n;
        }
        this.IIIllIIlIIIIIIlIlIIllIIlI = this.lIIlIIIIIlIlllIlIIlIlIlll / 6 + 24 * (n >> 1);
        n += 2;
        for (Options class_07282 : lllIlIIlIIIlIlIIIllIlllIl) {
            if (class_07282.getEnumFloat()) {
                this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1474(class_07282.returnEnumOrdinal(), this.IlIlIIlllIIlIllIIIlllllIl / 2 - 155 + n % 2 * 160, this.lIIlIIIIIlIlllIlIIlIlIlll / 6 + 24 * (n >> 1), class_07282));
            } else {
                this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1249(class_07282.returnEnumOrdinal(), this.IlIlIIlllIIlIllIIIlllllIl / 2 - 155 + n % 2 * 160, this.lIIlIIIIIlIlllIlIIlIlIlll / 6 + 24 * (n >> 1), class_07282, this.lIlllIlllIIIIlIIlllIllIII.IlIllllllIIlIIllllIIlIIIl(class_07282)));
            }
            ++n;
        }
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1197(200, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 100, this.lIIlIIIIIlIlllIlIIlIlIlll / 6 + 168, class_0616.lllIIIllIIIIlllIlIIllIIll("gui.done", new Object[0])));
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1197 class_11972) {
        if (class_11972.IllIIIllIIIIlIlIlIllIIlll) {
            if (class_11972.IIIllIllIIlIlIlIlIllllIIl < 100 && class_11972 instanceof class_1249) {
                this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(((class_1249)class_11972).lllIIIllIIIIlllIlIIllIIll(), 1);
                class_11972.IllIIlllllllIIlIIlIIIIlIl = this.lIlllIlllIIIIlIIlllIllIII.IlIllllllIIlIIllllIIlIIIl(Options.getEnumOptions(class_11972.IIIllIllIIlIlIlIlIllllIIl));
            }
            if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 200) {
                this.lllllIlllIIllIlIIlIIIllII.gameSettings.IlIllllllIIlIIllllIIlIIIl();
                this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl);
            }
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
        this.llIIlIllIllllIlIIIIlIIlll();
        this.lllIIIllIIIIlllIlIIllIIll(this.lIlIllIIlIIlIIlIIlIIlIIll, this.IlIIIIIllllllIIlllIllllll, this.IlIlIIlllIIlIllIIIlllllIl / 2, 20, 0xFFFFFF);
        this.lllIIIllIIIIlllIlIIllIIll(this.lIlIllIIlIIlIIlIIlIIlIIll, this.lIllllIIlIIIlIllllllIIIll, this.IlIlIIlllIIlIllIIIlllllIl / 2, this.IIIllIIlIIIIIIlIlIIllIIlI + 7, 0xFFFFFF);
        super.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
    }
}

