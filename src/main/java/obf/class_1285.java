package obf;

import net.minecraft.client.settings.KeyBinding;
import net.minecraft.client.settings.GameSettings;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1285
implements class_0677 {
    private final KeyBinding lllIlIIlIIIlIlIIIllIlllIl;
    private final String IlIllllllIIlIIllllIIlIIIl;
    private final class_1197 lIlllIlllIIIIlIIlllIllIII;
    private final class_1197 IlIIIIIllllllIIlllIllllll;
    final /* synthetic */ class_2035 lllIIIllIIIIlllIlIIllIIll;

    private class_1285(class_2035 class_20352, KeyBinding class_13352) {
        this.lllIIIllIIIIlllIlIIllIIll = class_20352;
        this.lllIlIIlIIIlIlIIIllIlllIl = class_13352;
        this.IlIllllllIIlIIllllIIlIIIl = class_0616.lllIIIllIIIIlllIlIIllIIll(class_13352.IIIllIIlIIIIIIlIlIIllIIlI(), new Object[0]);
        this.lIlllIlllIIIIlIIlllIllIII = new class_1197(0, 0, 0, 75, 18, class_0616.lllIIIllIIIIlllIlIIllIIll(class_13352.IIIllIIlIIIIIIlIlIIllIIlI(), new Object[0]));
        this.IlIIIIIllllllIIlllIllllll = new class_1197(0, 0, 0, 50, 18, class_0616.lllIIIllIIIIlllIlIIllIIll("controls.reset", new Object[0]));
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4, int n5, class_0868 class_08682, int n6, int n7, boolean bl) {
        boolean bl2 = class_2035.lllIlIIlIIIlIlIIIllIlllIl((class_2035)this.lllIIIllIIIIlllIlIIllIIll).lllIlIIlIIIlIlIIIllIlllIl == this.lllIlIIlIIIlIlIIIllIlllIl;
        class_2035.lllIIIllIIIIlllIlIIllIIll((class_2035)this.lllIIIllIIIIlllIlIIllIIll).IlIlllIIIIIIlIIllIIllIlll.lllIlIIlIIIlIlIIIllIlllIl(this.IlIllllllIIlIIllllIIlIIIl, n2 + 90 - class_2035.IlIllllllIIlIIllllIIlIIIl(this.lllIIIllIIIIlllIlIIllIIll), n3 + n5 / 2 - class_2035.lllIIIllIIIIlllIlIIllIIll((class_2035)this.lllIIIllIIIIlllIlIIllIIll).IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll / 2, 0xFFFFFF);
        this.IlIIIIIllllllIIlllIllllll.lIllllIIlIIIlIllllllIIIll = n2 + 190;
        this.IlIIIIIllllllIIlllIllllll.IIIllIIlIIIIIIlIlIIllIIlI = n3;
        this.IlIIIIIllllllIIlllIllllll.IllIIIllIIIIlIlIlIllIIlll = this.lllIlIIlIIIlIlIIIllIlllIl.IIIllIllIIlIlIlIlIllllIIl() != this.lllIlIIlIIIlIlIIIllIlllIl.IllIIlllllllIIlIIlIIIIlIl();
        this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(class_2035.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll), n6, n7);
        this.lIlllIlllIIIIlIIlllIllIII.lIllllIIlIIIlIllllllIIIll = n2 + 105;
        this.lIlllIlllIIIIlIIlllIllIII.IIIllIIlIIIIIIlIlIIllIIlI = n3;
        this.lIlllIlllIIIIlIIlllIllIII.IllIIlllllllIIlIIlIIIIlIl = GameSettings.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl.IIIllIllIIlIlIlIlIllllIIl());
        boolean bl3 = false;
        if (this.lllIlIIlIIIlIlIIIllIlllIl.IIIllIllIIlIlIlIlIllllIIl() != 0) {
            for (KeyBinding class_13352 : class_2035.lllIIIllIIIIlllIlIIllIIll((class_2035)this.lllIIIllIIIIlllIlIIllIIll).gameSettings.keyBindings) {
                if (class_13352 == this.lllIlIIlIIIlIlIIIllIlllIl || class_13352.IIIllIllIIlIlIlIlIllllIIl() != this.lllIlIIlIIIlIlIIIllIlllIl.IIIllIllIIlIlIlIlIllllIIl()) continue;
                bl3 = true;
                break;
            }
        }
        if (bl2) {
            this.lIlllIlllIIIIlIIlllIllIII.IllIIlllllllIIlIIlIIIIlIl = (Object)((Object) EnumChatFormatting.WHITE) + "> " + (Object)((Object) EnumChatFormatting.YELLOW) + this.lIlllIlllIIIIlIIlllIllIII.IllIIlllllllIIlIIlIIIIlIl + (Object)((Object) EnumChatFormatting.WHITE) + " <";
        } else if (bl3) {
            this.lIlllIlllIIIIlIIlllIllIII.IllIIlllllllIIlIIlIIIIlIl = (Object)((Object) EnumChatFormatting.RED) + this.lIlllIlllIIIIlIIlllIllIII.IllIIlllllllIIlIIlIIIIlIl;
        }
        this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(class_2035.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll), n6, n7);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4, int n5, int n6) {
        if (this.lIlllIlllIIIIlIIlllIllIII.IlIllllllIIlIIllllIIlIIIl(class_2035.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll), n2, n3)) {
            class_2035.lllIlIIlIIIlIlIIIllIlllIl((class_2035)this.lllIIIllIIIIlllIlIIllIIll).lllIlIIlIIIlIlIIIllIlllIl = this.lllIlIIlIIIlIlIIIllIlllIl;
            return true;
        }
        if (this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl(class_2035.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll), n2, n3)) {
            class_2035.lllIIIllIIIIlllIlIIllIIll((class_2035)this.lllIIIllIIIIlllIlIIllIIll).gameSettings.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl, this.lllIlIIlIIIlIlIIIllIlllIl.IllIIlllllllIIlIIlIIIIlIl());
            KeyBinding.lllIlIIlIIIlIlIIIllIlllIl();
            return true;
        }
        return false;
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, int n3, int n4, int n5, int n6) {
        this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(n2, n3);
        this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(n2, n3);
    }

    class_1285(class_2035 class_20352, KeyBinding class_13352, Object object) {
        this(class_20352, class_13352);
    }
}

