package obf;

import net.minecraft.client.settings.GameSettings;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1432
extends class_0960 {
    private GameSettings lllIIIllIIIIlllIlIIllIIll;

    public class_1432(GameSettings class_17512) {
        this.lllIIIllIIIIlllIlIIllIIll = class_17512;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll() {
        this.IIIllIIlIIIIIIlIlIIllIIlI = 0.0f;
        this.IllIIlllllllIIlIIlIIIIlIl = 0.0f;
        if (this.lllIIIllIIIIlllIlIIllIIll.lllIIIlllIlllIIlIllllIIlI.lIlllIlllIIIIlIIlllIllIII()) {
            this.IllIIlllllllIIlIIlIIIIlIl += 1.0f;
        }
        if (this.lllIIIllIIIIlllIlIIllIIll.lIIlIIIlIlIIlllIlIllIllIl.lIlllIlllIIIIlIIlllIllIII()) {
            this.IllIIlllllllIIlIIlIIIIlIl -= 1.0f;
        }
        if (this.lllIIIllIIIIlllIlIIllIIll.lIIlIlllIIlllIIlllIIlIlII.lIlllIlllIIIIlIIlllIllIII()) {
            this.IIIllIIlIIIIIIlIlIIllIIlI += 1.0f;
        }
        if (this.lllIIIllIIIIlllIlIIllIIll.lIIlIlIIIIIllIIIIllIlIlII.lIlllIlllIIIIlIIlllIllIII()) {
            this.IIIllIIlIIIIIIlIlIIllIIlI -= 1.0f;
        }
        this.IIIllIllIIlIlIlIlIllllIIl = this.lllIIIllIIIIlllIlIIllIIll.lIIIIlIIIIllIlIIllllIlIII.lIlllIlllIIIIlIIlllIllIII();
        this.IllIIIllIIIIlIlIlIllIIlll = this.lllIIIllIIIIlllIlIIllIIll.lIIIlllllllIlllIIllllllll.lIlllIlllIIIIlIIlllIllIII();
        if (this.IllIIIllIIIIlIlIlIllIIlll) {
            this.IIIllIIlIIIIIIlIlIIllIIlI = (float)((double)this.IIIllIIlIIIIIIlIlIIllIIlI * 0.3);
            this.IllIIlllllllIIlIIlIIIIlIl = (float)((double)this.IllIIlllllllIIlIIlIIIIlIl * 0.3);
        }
    }
}

