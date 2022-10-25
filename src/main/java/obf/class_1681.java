package obf;

import com.moonsworth.lunar.client.LunarClient;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.client.settings.Options;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1681
extends class_0229 {
    private static final Options[] lIlllIlllIIIIlIIlllIllIII = new Options[]{Options.INVERT_MOUSE, Options.SENSITIVITY, Options.TOUCHSCREEN};
    private class_0229 IlIIIIIllllllIIlllIllllll;
    protected String lllIIIllIIIIlllIlIIllIIll = "Controls";
    private GameSettings lIllllIIlIIIlIllllllIIIll;
    public class_1335 lllIlIIlIIIlIlIIIllIlllIl = null;
    public long IlIllllllIIlIIllllIIlIIIl;
    private class_2035 IIIllIIlIIIIIIlIlIIllIIlI;
    private class_1197 IllIIlllllllIIlIIlIIIIlIl;

    public class_1681(class_0229 class_02292, GameSettings class_17512) {
        this.IlIIIIIllllllIIlllIllllll = class_02292;
        this.lIllllIIlIIIlIllllllIIIll = class_17512;
    }

    @Override
    public void n_() {
        this.IIIllIIlIIIIIIlIlIIllIIlI = new class_2035(this, this.lllllIlllIIllIlIIlIIIllII);
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1197(200, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 155, this.lIIlIIIIIlIlllIlIIlIlIlll - 29, 150, 20, class_0616.lllIIIllIIIIlllIlIIllIIll("gui.done", new Object[0])));
        this.IllIIlllllllIIlIIlIIIIlIl = new class_1197(201, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 155 + 160, this.lIIlIIIIIlIlllIlIIlIlIlll - 29, 150, 20, class_0616.lllIIIllIIIIlllIlIIllIIll("controls.resetAll", new Object[0]));
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(this.IllIIlllllllIIlIIlIIIIlIl);
        this.lllIIIllIIIIlllIlIIllIIll = class_0616.lllIIIllIIIIlllIlIIllIIll("controls.title", new Object[0]);
        int n = 0;
        for (Options class_07282 : lIlllIlllIIIIlIIlllIllIII) {
            if (class_07282.getEnumFloat()) {
                this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1474(class_07282.returnEnumOrdinal(), this.IlIlIIlllIIlIllIIIlllllIl / 2 - 155 + n % 2 * 160, 18 + 24 * (n >> 1), class_07282));
            } else {
                this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1249(class_07282.returnEnumOrdinal(), this.IlIlIIlllIIlIllIIIlllllIl / 2 - 155 + n % 2 * 160, 18 + 24 * (n >> 1), class_07282, this.lIllllIIlIIIlIllllllIIIll.IlIllllllIIlIIllllIIlIIIl(class_07282)));
            }
            ++n;
        }
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1197 class_11972) {
        if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 200) {
            this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(this.IlIIIIIllllllIIlllIllllll);
        } else if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 201) {
            for (class_1335 class_13352 : this.lllllIlllIIllIlIIlIIIllII.gameSettings.llIlllllIIlIIlIIllllIllll) {
                class_13352.lllIlIIlIIIlIlIIIllIlllIl(class_13352.IllIIlllllllIIlIIlIIIIlIl());
            }
            class_1335.lllIlIIlIIIlIlIIIllIlllIl();
        } else if (class_11972.IIIllIllIIlIlIlIlIllllIIl < 100 && class_11972 instanceof class_1249) {
            this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(((class_1249)class_11972).lllIIIllIIIIlllIlIIllIIll(), 1);
            class_11972.IllIIlllllllIIlIIlIIIIlIl = this.lIllllIIlIIIlIllllllIIIll.IlIllllllIIlIIllllIIlIIIl(Options.getEnumOptions(class_11972.IIIllIllIIlIlIlIlIllllIIl));
        }
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        if (this.lllIlIIlIIIlIlIIIllIlllIl != null) {
            this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl, -100 + n3);
            this.lllIlIIlIIIlIlIIIllIlllIl = null;
            class_1335.lllIlIIlIIIlIlIIIllIlllIl();
        } else if (n3 != 0 || !this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(n, n2, n3)) {
            super.lllIIIllIIIIlllIlIIllIIll(n, n2, n3);
        }
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, int n3) {
        if (n3 != 0 || !this.IIIllIIlIIIIIIlIlIIllIIlI.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3)) {
            super.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3);
        }
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(char c, int n) {
        if (this.lllIlIIlIIIlIlIIIllIlllIl != null) {
            if (n == 1) {
                this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl, 0);
            } else {
                this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl, n);
            }
            this.lllIlIIlIIIlIlIIIllIlllIl = null;
            this.IlIllllllIIlIIllllIIlIIIl = Minecraft.llllllIlIllllIlIlIlIIIIlI();
            class_1335.lllIlIIlIIIlIlIIIllIlllIl();
            LunarClient.getInstance().getModuleManager().IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll();
        } else {
            super.lllIIIllIIIIlllIlIIllIIll(c, n);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
        this.llIIlIllIllllIlIIIIlIIlll();
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
        this.lllIIIllIIIIlllIlIIllIIll(this.lIlIllIIlIIlIIlIIlIIlIIll, this.lllIIIllIIIIlllIlIIllIIll, this.IlIlIIlllIIlIllIIIlllllIl / 2, 8, 0xFFFFFF);
        boolean bl = true;
        for (class_1335 class_13352 : this.lIllllIIlIIIlIllllllIIIll.llIlllllIIlIIlIIllllIllll) {
            if (class_13352.IIIllIllIIlIlIlIlIllllIIl() == class_13352.IllIIlllllllIIlIIlIIIIlIl()) continue;
            bl = false;
            break;
        }
        this.IllIIlllllllIIlIIlIIIIlIl.IllIIIllIIIIlIlIlIllIIlll = !bl;
        super.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
    }
}

