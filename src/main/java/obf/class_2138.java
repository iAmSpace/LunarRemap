package obf;

import net.minecraft.util.MathHelper;

/*
 * Decompiled with CFR 0.150.
 */
public class class_2138
extends class_1382 {
    private class_0744[] IIIllIIlIIIIIIlIlIIllIIlI = new class_0744[7];
    private class_0744[] IllIIlllllllIIlIIlIIIIlIl;
    private float[] IIIllIllIIlIlIlIlIllllIIl = new float[7];
    private static final int[][] IllIIIllIIIIlIlIlIllIIlll = new int[][]{{3, 2, 2}, {4, 3, 2}, {6, 4, 3}, {3, 3, 3}, {2, 2, 3}, {2, 1, 2}, {1, 1, 2}};
    private static final int[][] lIIIIlIlIIlllllIIllIIlIII = new int[][]{{0, 0}, {0, 4}, {0, 9}, {0, 16}, {0, 22}, {11, 0}, {13, 4}};

    public class_2138() {
        float f = -3.5f;
        for (int i = 0; i < this.IIIllIIlIIIIIIlIlIIllIIlI.length; ++i) {
            this.IIIllIIlIIIIIIlIlIIllIIlI[i] = new class_0744(this, lIIIIlIlIIlllllIIllIIlIII[i][0], lIIIIlIlIIlllllIIllIIlIII[i][1]);
            this.IIIllIIlIIIIIIlIlIIllIIlI[i].lllIIIllIIIIlllIlIIllIIll((float)IllIIIllIIIIlIlIlIllIIlll[i][0] * -0.5f, 0.0f, (float)IllIIIllIIIIlIlIlIllIIlll[i][2] * -0.5f, IllIIIllIIIIlIlIlIllIIlll[i][0], IllIIIllIIIIlIlIlIllIIlll[i][1], IllIIIllIIIIlIlIlIllIIlll[i][2]);
            this.IIIllIIlIIIIIIlIlIIllIIlI[i].lllIIIllIIIIlllIlIIllIIll(0.0f, 24 - IllIIIllIIIIlIlIlIllIIlll[i][1], f);
            this.IIIllIllIIlIlIlIlIllllIIl[i] = f;
            if (i >= this.IIIllIIlIIIIIIlIlIIllIIlI.length - 1) continue;
            f += (float)(IllIIIllIIIIlIlIlIllIIlll[i][2] + IllIIIllIIIIlIlIlIllIIlll[i + 1][2]) * 0.5f;
        }
        this.IllIIlllllllIIlIIlIIIIlIl = new class_0744[3];
        this.IllIIlllllllIIlIIlIIIIlIl[0] = new class_0744(this, 20, 0);
        this.IllIIlllllllIIlIIlIIIIlIl[0].lllIIIllIIIIlllIlIIllIIll(-5.0f, 0.0f, (float)IllIIIllIIIIlIlIlIllIIlll[2][2] * -0.5f, 10, 8, IllIIIllIIIIlIlIlIllIIlll[2][2]);
        this.IllIIlllllllIIlIIlIIIIlIl[0].lllIIIllIIIIlllIlIIllIIll(0.0f, 16.0f, this.IIIllIllIIlIlIlIlIllllIIl[2]);
        this.IllIIlllllllIIlIIlIIIIlIl[1] = new class_0744(this, 20, 11);
        this.IllIIlllllllIIlIIlIIIIlIl[1].lllIIIllIIIIlllIlIIllIIll(-3.0f, 0.0f, (float)IllIIIllIIIIlIlIlIllIIlll[4][2] * -0.5f, 6, 4, IllIIIllIIIIlIlIlIllIIlll[4][2]);
        this.IllIIlllllllIIlIIlIIIIlIl[1].lllIIIllIIIIlllIlIIllIIll(0.0f, 20.0f, this.IIIllIllIIlIlIlIlIllllIIl[4]);
        this.IllIIlllllllIIlIIlIIIIlIl[2] = new class_0744(this, 20, 18);
        this.IllIIlllllllIIlIIlIIIIlIl[2].lllIIIllIIIIlllIlIIllIIll(-3.0f, 0.0f, (float)IllIIIllIIIIlIlIlIllIIlll[4][2] * -0.5f, 6, 5, IllIIIllIIIIlIlIlIllIIlll[1][2]);
        this.IllIIlllllllIIlIIlIIIIlIl[2].lllIIIllIIIIlllIlIIllIIll(0.0f, 19.0f, this.IIIllIllIIlIlIlIlIllllIIl[1]);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, float f, float f2, float f3, float f4, float f5, float f6) {
        int n;
        this.lllIIIllIIIIlllIlIIllIIll(f, f2, f3, f4, f5, f6, class_15212);
        for (n = 0; n < this.IIIllIIlIIIIIIlIlIIllIIlI.length; ++n) {
            this.IIIllIIlIIIIIIlIlIIllIIlI[n].lllIIIllIIIIlllIlIIllIIll(f6);
        }
        for (n = 0; n < this.IllIIlllllllIIlIIlIIIIlIl.length; ++n) {
            this.IllIIlllllllIIlIIlIIIIlIl[n].lllIIIllIIIIlllIlIIllIIll(f6);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(float f, float f2, float f3, float f4, float f5, float f6, class_1521 class_15212) {
        for (int i = 0; i < this.IIIllIIlIIIIIIlIlIIllIIlI.length; ++i) {
            this.IIIllIIlIIIIIIlIlIIllIIlI[i].IIIllIIlIIIIIIlIlIIllIIlI = MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f3 * 0.9f + (float)i * 0.15f * (float)Math.PI) * (float)Math.PI * 0.05f * (float)(1 + Math.abs(i - 2));
            this.IIIllIIlIIIIIIlIlIIllIIlI[i].IlIllllllIIlIIllllIIlIIIl = MathHelper.lllIIIllIIIIlllIlIIllIIll(f3 * 0.9f + (float)i * 0.15f * (float)Math.PI) * (float)Math.PI * 0.2f * (float)Math.abs(i - 2);
        }
        this.IllIIlllllllIIlIIlIIIIlIl[0].IIIllIIlIIIIIIlIlIIllIIlI = this.IIIllIIlIIIIIIlIlIIllIIlI[2].IIIllIIlIIIIIIlIlIIllIIlI;
        this.IllIIlllllllIIlIIlIIIIlIl[1].IIIllIIlIIIIIIlIlIIllIIlI = this.IIIllIIlIIIIIIlIlIIllIIlI[4].IIIllIIlIIIIIIlIlIIllIIlI;
        this.IllIIlllllllIIlIIlIIIIlIl[1].IlIllllllIIlIIllllIIlIIIl = this.IIIllIIlIIIIIIlIlIIllIIlI[4].IlIllllllIIlIIllllIIlIIIl;
        this.IllIIlllllllIIlIIlIIIIlIl[2].IIIllIIlIIIIIIlIlIIllIIlI = this.IIIllIIlIIIIIIlIlIIllIIlI[1].IIIllIIlIIIIIIlIlIIllIIlI;
        this.IllIIlllllllIIlIIlIIIIlIl[2].IlIllllllIIlIIllllIIlIIIl = this.IIIllIIlIIIIIIlIlIIllIIlI[1].IlIllllllIIlIIllllIIlIIIl;
    }
}

