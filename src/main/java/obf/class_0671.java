package obf;

import net.minecraft.client.settings.GameSettings;
import net.minecraft.client.settings.Options;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0671
extends class_0229 {
    protected class_0229 lllIIIllIIIIlllIlIIllIIll;
    private class_0547 lllIlIIlIIIlIlIIIllIlllIl;
    private final GameSettings IlIllllllIIlIIllllIIlIIIl;
    private final class_1882 lIlllIlllIIIIlIIlllIllIII;
    private class_1249 IlIIIIIllllllIIlllIllllll;
    private class_1249 lIllllIIlIIIlIllllllIIIll;

    public class_0671(class_0229 class_02292, GameSettings class_17512, class_1882 class_18822) {
        this.lllIIIllIIIIlllIlIIllIIll = class_02292;
        this.IlIllllllIIlIIllllIIlIIIl = class_17512;
        this.lIlllIlllIIIIlIIlllIllIII = class_18822;
    }

    @Override
    public void n_() {
        boolean bl = false;
        if (this.IlIIIIIllllllIIlllIllllll != null) {
            // empty if block
        }
        this.IlIIIIIllllllIIlllIllllll = new class_1249(100, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 155, this.lIIlIIIIIlIlllIlIIlIlIlll - 38, Options.IlIlIIlllIllllllllIIIlIlI, this.IlIllllllIIlIIllllIIlIIIl.IlIllllllIIlIIllllIIlIIIl(Options.IlIlIIlllIllllllllIIIlIlI));
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(this.IlIIIIIllllllIIlllIllllll);
        this.lIllllIIlIIIlIllllllIIIll = new class_1249(6, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 155 + 160, this.lIIlIIIIIlIlllIlIIlIlIlll - 38, class_0616.lllIIIllIIIIlllIlIIllIIll("gui.done", new Object[0]));
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(this.lIllllIIlIIIlIllllllIIIll);
        this.lllIlIIlIIIlIlIIIllIlllIl = new class_0547(this);
        this.lllIlIIlIIIlIlIIIllIlllIl.lIlllIlllIIIIlIIlllIllIII(7, 8);
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1197 class_11972) {
        if (class_11972.IllIIIllIIIIlIlIlIllIIlll) {
            switch (class_11972.IIIllIllIIlIlIlIlIllllIIl) {
                case 5: {
                    break;
                }
                case 6: {
                    this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll);
                    break;
                }
                case 100: {
                    if (!(class_11972 instanceof class_1249)) break;
                    this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(((class_1249)class_11972).lllIIIllIIIIlllIlIIllIIll(), 1);
                    class_11972.IllIIlllllllIIlIIlIIIIlIl = this.IlIllllllIIlIIllllIIlIIIl.IlIllllllIIlIIllllIIlIIIl(Options.IlIlIIlllIllllllllIIIlIlI);
                    class_0321 class_03212 = new class_0321(this.lllllIlllIIllIlIIlIIIllII, this.lllllIlllIIllIlIIlIIIllII.displayWidth, this.lllllIlllIIllIlIIlIIIllII.displayHeight);
                    int n = class_03212.lllIIIllIIIIlllIlIIllIIll();
                    int n2 = class_03212.lllIlIIlIIIlIlIIIllIlllIl();
                    this.lllIIIllIIIIlllIlIIllIIll(this.lllllIlllIIllIlIIlIIIllII, n, n2);
                    break;
                }
                default: {
                    this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(class_11972);
                }
            }
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
        this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
        this.lllIIIllIIIIlllIlIIllIIll(this.lIlIllIIlIIlIIlIIlIIlIIll, class_0616.lllIIIllIIIIlllIlIIllIIll("options.language", new Object[0]), this.IlIlIIlllIIlIllIIIlllllIl / 2, 16, 0xFFFFFF);
        this.lllIIIllIIIIlllIlIIllIIll(this.lIlIllIIlIIlIIlIIlIIlIIll, "(" + class_0616.lllIIIllIIIIlllIlIIllIIll("options.languageWarning", new Object[0]) + ")", this.IlIlIIlllIIlIllIIIlllllIl / 2, this.lIIlIIIIIlIlllIlIIlIlIlll - 56, 0x808080);
        super.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
    }

    static /* synthetic */ class_1882 lllIIIllIIIIlllIlIIllIIll(class_0671 class_06712) {
        return class_06712.lIlllIlllIIIIlIIlllIllIII;
    }

    static /* synthetic */ GameSettings lllIlIIlIIIlIlIIIllIlllIl(class_0671 class_06712) {
        return class_06712.IlIllllllIIlIIllllIIlIIIl;
    }

    static /* synthetic */ class_1249 IlIllllllIIlIIllllIIlIIIl(class_0671 class_06712) {
        return class_06712.lIllllIIlIIIlIllllllIIIll;
    }

    static /* synthetic */ class_1249 lIlllIlllIIIIlIIlllIllIII(class_0671 class_06712) {
        return class_06712.IlIIIIIllllllIIlllIllllll;
    }
}

