package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0230
extends class_1382 {
    public class_0744[] IIIllIIlIIIIIIlIlIIllIIlI = new class_0744[7];

    public class_0230() {
        this.IIIllIIlIIIIIIlIlIIllIIlI[0] = new class_0744(this, 0, 10);
        this.IIIllIIlIIIIIIlIlIIllIIlI[1] = new class_0744(this, 0, 0);
        this.IIIllIIlIIIIIIlIlIIllIIlI[2] = new class_0744(this, 0, 0);
        this.IIIllIIlIIIIIIlIlIIllIIlI[3] = new class_0744(this, 0, 0);
        this.IIIllIIlIIIIIIlIlIIllIIlI[4] = new class_0744(this, 0, 0);
        this.IIIllIIlIIIIIIlIlIIllIIlI[5] = new class_0744(this, 44, 10);
        int n = 20;
        int n2 = 8;
        int n3 = 16;
        int n4 = 4;
        this.IIIllIIlIIIIIIlIlIIllIIlI[0].lllIIIllIIIIlllIlIIllIIll(-n / 2, (float)(-n3 / 2), -1.0f, n, n3, 2, 0.0f);
        this.IIIllIIlIIIIIIlIlIIllIIlI[0].lllIIIllIIIIlllIlIIllIIll(0.0f, n4, 0.0f);
        this.IIIllIIlIIIIIIlIlIIllIIlI[5].lllIIIllIIIIlllIlIIllIIll(-n / 2 + 1, (float)(-n3 / 2 + 1), -1.0f, n - 2, n3 - 2, 1, 0.0f);
        this.IIIllIIlIIIIIIlIlIIllIIlI[5].lllIIIllIIIIlllIlIIllIIll(0.0f, n4, 0.0f);
        this.IIIllIIlIIIIIIlIlIIllIIlI[1].lllIIIllIIIIlllIlIIllIIll(-n / 2 + 2, (float)(-n2 - 1), -1.0f, n - 4, n2, 2, 0.0f);
        this.IIIllIIlIIIIIIlIlIIllIIlI[1].lllIIIllIIIIlllIlIIllIIll(-n / 2 + 1, n4, 0.0f);
        this.IIIllIIlIIIIIIlIlIIllIIlI[2].lllIIIllIIIIlllIlIIllIIll(-n / 2 + 2, (float)(-n2 - 1), -1.0f, n - 4, n2, 2, 0.0f);
        this.IIIllIIlIIIIIIlIlIIllIIlI[2].lllIIIllIIIIlllIlIIllIIll(n / 2 - 1, n4, 0.0f);
        this.IIIllIIlIIIIIIlIlIIllIIlI[3].lllIIIllIIIIlllIlIIllIIll(-n / 2 + 2, (float)(-n2 - 1), -1.0f, n - 4, n2, 2, 0.0f);
        this.IIIllIIlIIIIIIlIlIIllIIlI[3].lllIIIllIIIIlllIlIIllIIll(0.0f, n4, -n3 / 2 + 1);
        this.IIIllIIlIIIIIIlIlIIllIIlI[4].lllIIIllIIIIlllIlIIllIIll(-n / 2 + 2, (float)(-n2 - 1), -1.0f, n - 4, n2, 2, 0.0f);
        this.IIIllIIlIIIIIIlIlIIllIIlI[4].lllIIIllIIIIlllIlIIllIIll(0.0f, n4, n3 / 2 - 1);
        this.IIIllIIlIIIIIIlIlIIllIIlI[0].lIllllIIlIIIlIllllllIIIll = 1.5707964f;
        this.IIIllIIlIIIIIIlIlIIllIIlI[1].IIIllIIlIIIIIIlIlIIllIIlI = 4.712389f;
        this.IIIllIIlIIIIIIlIlIIllIIlI[2].IIIllIIlIIIIIIlIlIIllIIlI = 1.5707964f;
        this.IIIllIIlIIIIIIlIlIIllIIlI[3].IIIllIIlIIIIIIlIlIIllIIlI = (float)Math.PI;
        this.IIIllIIlIIIIIIlIlIIllIIlI[5].lIllllIIlIIIlIllllllIIIll = -1.5707964f;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, float f, float f2, float f3, float f4, float f5, float f6) {
        this.IIIllIIlIIIIIIlIlIIllIIlI[5].lIlllIlllIIIIlIIlllIllIII = 4.0f - f3;
        for (int i = 0; i < 6; ++i) {
            this.IIIllIIlIIIIIIlIlIIllIIlI[i].lllIIIllIIIIlllIlIIllIIll(f6);
        }
    }
}

