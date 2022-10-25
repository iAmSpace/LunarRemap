package obf;

import net.minecraft.util.MathHelper;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0654
extends class_1782 {
    public boolean llIIllIllIlIIlIIllIllllll;
    private class_0744 lllIIlIIIllllllIIIIlIlIlI = new class_0744(this).lllIlIIlIIIlIlIIIllIlllIl(64, 128);
    private class_0744 IlIlllIIIIIIlIIllIIllIlll;

    public class_0654(float f) {
        super(f, 0.0f, 64, 128);
        this.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(0.0f, -2.0f, 0.0f);
        this.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(0, 0).lllIIIllIIIIlllIlIIllIIll(0.0f, 3.0f, -6.75f, 1, 1, 1, -0.25f);
        this.llIIlllIllIllllIIIlIIIIII.lllIIIllIIIIlllIlIIllIIll(this.lllIIlIIIllllllIIIIlIlIlI);
        this.IlIlllIIIIIIlIIllIIllIlll = new class_0744(this).lllIlIIlIIIlIlIIIllIlllIl(64, 128);
        this.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(-5.0f, -10.03125f, -5.0f);
        this.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(0, 64).lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, 10, 2, 10);
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(this.IlIlllIIIIIIlIIllIIllIlll);
        class_0744 class_07442 = new class_0744(this).lllIlIIlIIIlIlIIIllIlllIl(64, 128);
        class_07442.lllIIIllIIIIlllIlIIllIIll(1.75f, -4.0f, 2.0f);
        class_07442.lllIIIllIIIIlllIlIIllIIll(0, 76).lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, 7, 4, 7);
        class_07442.lIllllIIlIIIlIllllllIIIll = -0.05235988f;
        class_07442.IllIIlllllllIIlIIlIIIIlIl = 0.02617994f;
        this.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(class_07442);
        class_0744 class_07443 = new class_0744(this).lllIlIIlIIIlIlIIIllIlllIl(64, 128);
        class_07443.lllIIIllIIIIlllIlIIllIIll(1.75f, -4.0f, 2.0f);
        class_07443.lllIIIllIIIIlllIlIIllIIll(0, 87).lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, 4, 4, 4);
        class_07443.lIllllIIlIIIlIllllllIIIll = -0.10471976f;
        class_07443.IllIIlllllllIIlIIlIIIIlIl = 0.05235988f;
        class_07442.lllIIIllIIIIlllIlIIllIIll(class_07443);
        class_0744 class_07444 = new class_0744(this).lllIlIIlIIIlIlIIIllIlllIl(64, 128);
        class_07444.lllIIIllIIIIlllIlIIllIIll(1.75f, -2.0f, 2.0f);
        class_07444.lllIIIllIIIIlllIlIIllIIll(0, 95).lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, 1, 2, 1, 0.25f);
        class_07444.lIllllIIlIIIlIllllllIIIll = -0.20943952f;
        class_07444.IllIIlllllllIIlIIlIIIIlIl = 0.10471976f;
        class_07443.lllIIIllIIIIlllIlIIllIIll(class_07444);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(float f, float f2, float f3, float f4, float f5, float f6, class_1521 class_15212) {
        super.lllIIIllIIIIlllIlIIllIIll(f, f2, f3, f4, f5, f6, class_15212);
        this.llIIlllIllIllllIIIlIIIIII.lllllIlllIIllIlIIlIIIllII = 0.0f;
        this.llIIlllIllIllllIIIlIIIIII.IlIlIIlIlIllIIlIlIIllIIIl = 0.0f;
        this.llIIlllIllIllllIIIlIIIIII.IlIlllIIIIIIlIIllIIllIlll = 0.0f;
        float f7 = 0.01f * (float)(class_15212.llllllIlIllllIlIlIlIIIIlI() % 10);
        this.llIIlllIllIllllIIIlIIIIII.lIllllIIlIIIlIllllllIIIll = MathHelper.lllIIIllIIIIlllIlIIllIIll((float)class_15212.IlllIIIllllIIllIllIlIIlIl * f7) * 4.5f * (float)Math.PI / 180.0f;
        this.llIIlllIllIllllIIIlIIIIII.IIIllIIlIIIIIIlIlIIllIIlI = 0.0f;
        this.llIIlllIllIllllIIIlIIIIII.IllIIlllllllIIlIIlIIIIlIl = MathHelper.lllIlIIlIIIlIlIIIllIlllIl((float)class_15212.IlllIIIllllIIllIllIlIIlIl * f7) * 2.5f * (float)Math.PI / 180.0f;
        if (this.llIIllIllIlIIlIIllIllllll) {
            this.llIIlllIllIllllIIIlIIIIII.lIllllIIlIIIlIllllllIIIll = -0.9f;
            this.llIIlllIllIllllIIIlIIIIII.lllllIlllIIllIlIIlIIIllII = -0.09375f;
            this.llIIlllIllIllllIIIlIIIIII.IlIlIIlIlIllIIlIlIIllIIIl = 0.1875f;
        }
    }
}

