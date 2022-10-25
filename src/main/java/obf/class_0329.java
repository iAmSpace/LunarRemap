package obf;

import net.minecraft.client.settings.GameSettings;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0329
extends class_0229 {
    private final class_0229 lllIlIIlIIIlIlIIIllIlllIl;
    private final GameSettings IlIllllllIIlIIllllIIlIIIl;
    protected String lllIIIllIIIIlllIlIIllIIll = "Options";
    private String lIlllIlllIIIIlIIlllIllIII;

    public class_0329(class_0229 class_02292, GameSettings class_17512) {
        this.lllIlIIlIIIlIlIIIllIlllIl = class_02292;
        this.IlIllllllIIlIIllllIIlIIIl = class_17512;
    }

    @Override
    public void n_() {
        int n = 0;
        this.lllIIIllIIIIlllIlIIllIIll = class_0616.lllIIIllIIIIlllIlIIllIIll("options.sounds.title", new Object[0]);
        this.lIlllIlllIIIIlIIlllIllIII = class_0616.lllIIIllIIIIlllIlIIllIIll("options.off", new Object[0]);
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_2216(this, class_0617.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl(), this.IlIlIIlllIIlIllIIIlllllIl / 2 - 155 + n % 2 * 160, this.lIIlIIIIIlIlllIlIIlIlIlll / 6 - 12 + 24 * (n >> 1), class_0617.lllIIIllIIIIlllIlIIllIIll, true));
        int n2 = n + 2;
        for (class_0617 class_06172 : class_0617.values()) {
            if (class_06172 == class_0617.lllIIIllIIIIlllIlIIllIIll) continue;
            this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_2216(this, class_06172.lllIlIIlIIIlIlIIIllIlllIl(), this.IlIlIIlllIIlIllIIIlllllIl / 2 - 155 + n2 % 2 * 160, this.lIIlIIIIIlIlllIlIIlIlIlll / 6 - 12 + 24 * (n2 >> 1), class_06172, false));
            ++n2;
        }
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1197(200, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 100, this.lIIlIIIIIlIlllIlIIlIlIlll / 6 + 168, class_0616.lllIIIllIIIIlllIlIIllIIll("gui.done", new Object[0])));
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1197 class_11972) {
        if (class_11972.IllIIIllIIIIlIlIlIllIIlll && class_11972.IIIllIllIIlIlIlIlIllllIIl == 200) {
            this.lllllIlllIIllIlIIlIIIllII.gameSettings.IlIllllllIIlIIllllIIlIIIl();
            this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
        this.llIIlIllIllllIlIIIIlIIlll();
        this.lllIIIllIIIIlllIlIIllIIll(this.lIlIllIIlIIlIIlIIlIIlIIll, this.lllIIIllIIIIlllIlIIllIIll, this.IlIlIIlllIIlIllIIIlllllIl / 2, 15, 0xFFFFFF);
        super.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
    }

    protected String lllIIIllIIIIlllIlIIllIIll(class_0617 class_06172) {
        float f = this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(class_06172);
        return f == 0.0f ? this.lIlllIlllIIIIlIIlllIllIII : (int)(f * 100.0f) + "%";
    }

    static /* synthetic */ GameSettings lllIIIllIIIIlllIlIIllIIll(class_0329 class_03292) {
        return class_03292.IlIllllllIIlIIllllIIlIIIl;
    }
}

