package obf;

import net.minecraft.util.MathHelper;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0918
extends class_1382 {
    private class_0744[] IIIllIIlIIIIIIlIlIIllIIlI = new class_0744[12];
    private class_0744 IllIIlllllllIIlIIlIIIIlIl;

    public class_0918() {
        for (int i = 0; i < this.IIIllIIlIIIIIIlIlIIllIIlI.length; ++i) {
            this.IIIllIIlIIIIIIlIlIIllIIlI[i] = new class_0744(this, 0, 16);
            this.IIIllIIlIIIIIIlIlIIllIIlI[i].lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, 2, 8, 2);
        }
        this.IllIIlllllllIIlIIlIIIIlIl = new class_0744(this, 0, 0);
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(-4.0f, -4.0f, -4.0f, 8, 8, 8);
    }

    public int lllIIIllIIIIlllIlIIllIIll() {
        return 8;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, float f, float f2, float f3, float f4, float f5, float f6) {
        this.lllIIIllIIIIlllIlIIllIIll(f, f2, f3, f4, f5, f6, class_15212);
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(f6);
        for (int i = 0; i < this.IIIllIIlIIIIIIlIlIIllIIlI.length; ++i) {
            this.IIIllIIlIIIIIIlIlIIllIIlI[i].lllIIIllIIIIlllIlIIllIIll(f6);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(float f, float f2, float f3, float f4, float f5, float f6, class_1521 class_15212) {
        int n;
        float f7 = f3 * (float)Math.PI * -0.1f;
        for (n = 0; n < 4; ++n) {
            this.IIIllIIlIIIIIIlIlIIllIIlI[n].lIlllIlllIIIIlIIlllIllIII = -2.0f + MathHelper.lllIlIIlIIIlIlIIIllIlllIl(((float)(n * 2) + f3) * 0.25f);
            this.IIIllIIlIIIIIIlIlIIllIIlI[n].IlIllllllIIlIIllllIIlIIIl = MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f7) * 9.0f;
            this.IIIllIIlIIIIIIlIlIIllIIlI[n].IlIIIIIllllllIIlllIllllll = MathHelper.lllIIIllIIIIlllIlIIllIIll(f7) * 9.0f;
            f7 += 1.0f;
        }
        f7 = 0.7853982f + f3 * (float)Math.PI * 0.03f;
        for (n = 4; n < 8; ++n) {
            this.IIIllIIlIIIIIIlIlIIllIIlI[n].lIlllIlllIIIIlIIlllIllIII = 2.0f + MathHelper.lllIlIIlIIIlIlIIIllIlllIl(((float)(n * 2) + f3) * 0.25f);
            this.IIIllIIlIIIIIIlIlIIllIIlI[n].IlIllllllIIlIIllllIIlIIIl = MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f7) * 7.0f;
            this.IIIllIIlIIIIIIlIlIIllIIlI[n].IlIIIIIllllllIIlllIllllll = MathHelper.lllIIIllIIIIlllIlIIllIIll(f7) * 7.0f;
            f7 += 1.0f;
        }
        f7 = 0.47123894f + f3 * (float)Math.PI * -0.05f;
        for (n = 8; n < 12; ++n) {
            this.IIIllIIlIIIIIIlIlIIllIIlI[n].lIlllIlllIIIIlIIlllIllIII = 11.0f + MathHelper.lllIlIIlIIIlIlIIIllIlllIl(((float)n * 1.5f + f3) * 0.5f);
            this.IIIllIIlIIIIIIlIlIIllIIlI[n].IlIllllllIIlIIllllIIlIIIl = MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f7) * 5.0f;
            this.IIIllIIlIIIIIIlIlIIllIIlI[n].IlIIIIIllllllIIlllIllllll = MathHelper.lllIIIllIIIIlllIlIIllIIll(f7) * 5.0f;
            f7 += 1.0f;
        }
        this.IllIIlllllllIIlIIlIIIIlIl.IIIllIIlIIIIIIlIlIIllIIlI = f4 / 57.295776f;
        this.IllIIlllllllIIlIIlIIIIlIl.lIllllIIlIIIlIllllllIIIll = f5 / 57.295776f;
    }
}

