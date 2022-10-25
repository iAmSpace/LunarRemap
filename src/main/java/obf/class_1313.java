package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class class_1313
extends class_0672 {
    protected boolean lIIllIIlIIIlllIlllIIlIIlI;

    protected class_1313(int n) {
        super(n);
        this.lllIIIllIIIIlllIlIIllIIll(0.8f, 0.4f);
        this.lllIIIllIIIIlllIlIIllIIll(IlIIIIIllllllIIlllIllllll);
        this.llIIIIIlIIlIIIIllIIIlIIII.add(new class_0920(class_1627.class, 5, 2, 6));
        this.llIIIlIlIlIIlIllIIIllIlIl.llIIlIllIllllIlIIIIlIIlll = -999;
        this.llIIIlIlIlIIlIllIIIllIlIl.llIllllIlIllIIIlIllIIlIlI = 4;
        this.llIIIlIlIlIIlIllIIIllIlIl.lIlllIlllIlIIIIlllIlIlIIl = 10;
    }

    @Override
    public String lllIIIllIIIIlllIlIIllIIll(Random random, int n, int n2, int n3) {
        double d = IllllIIlIIIllIlllIlllIllI.lllIIIllIIIIlllIlIIllIIll((double)n / 200.0, (double)n3 / 200.0);
        if (d < -0.8) {
            int n4 = random.nextInt(4);
            return class_1209.llllllIlIllllIlIlIlIIIIlI[4 + n4];
        }
        if (random.nextInt(3) > 0) {
            int n5 = random.nextInt(3);
            return n5 == 0 ? class_1209.llllllIlIllllIlIlIlIIIIlI[0] : (n5 == 1 ? class_1209.llllllIlIllllIlIlIlIIIIlI[3] : class_1209.llllllIlIllllIlIlIlIIIIlI[8]);
        }
        return class_1209.lIlIIllllIlIIIIllIIIIlIIl[0];
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, Random random, int n, int n2) {
        int n3;
        int n4;
        int n5;
        int n6;
        double d = IllllIIlIIIllIlllIlllIllI.lllIIIllIIIIlllIlIIllIIll((double)(n + 8) / 200.0, (double)(n2 + 8) / 200.0);
        if (d < -0.8) {
            this.llIIIlIlIlIIlIllIIIllIlIl.llIllllIlIllIIIlIllIIlIlI = 15;
            this.llIIIlIlIlIIlIllIIIllIlIl.lIlllIlllIlIIIIlllIlIlIIl = 5;
        } else {
            this.llIIIlIlIlIIlIllIIIllIlIl.llIllllIlIllIIIlIllIIlIlI = 4;
            this.llIIIlIlIlIIlIllIIIllIlIl.lIlllIlllIlIIIIlllIlIlIIl = 10;
            IllIlIlIIIlllIIllIIIIlIll.lllIIIllIIIIlllIlIIllIIll(2);
            for (n6 = 0; n6 < 7; ++n6) {
                n5 = n + random.nextInt(16) + 8;
                n4 = n2 + random.nextInt(16) + 8;
                n3 = random.nextInt(class_13342.lIllllIIlIIIlIllllllIIIll(n5, n4) + 32);
                IllIlIlIIIlllIIllIIIIlIll.a_(class_13342, random, n5, n3, n4);
            }
        }
        if (this.lIIllIIlIIIlllIlllIIlIIlI) {
            IllIlIlIIIlllIIllIIIIlIll.lllIIIllIIIIlllIlIIllIIll(0);
            for (n6 = 0; n6 < 10; ++n6) {
                n5 = n + random.nextInt(16) + 8;
                n4 = n2 + random.nextInt(16) + 8;
                n3 = random.nextInt(class_13342.lIllllIIlIIIlIllllllIIIll(n5, n4) + 32);
                IllIlIlIIIlllIIllIIIIlIll.a_(class_13342, random, n5, n3, n4);
            }
        }
        super.lllIIIllIIIIlllIlIIllIIll(class_13342, random, n, n2);
    }

    @Override
    protected class_0672 lIIIIlIlIIlllllIIllIIlIII() {
        class_1313 class_13132 = new class_1313(this.lIlIllIIllIIIIlllIlIlllIl + 128);
        class_13132.lllIIIllIIIIlllIlIIllIIll("Sunflower Plains");
        class_13132.lIIllIIlIIIlllIlllIIlIIlI = true;
        class_13132.lllIlIIlIIIlIlIIIllIlllIl(9286496);
        class_13132.IlllIIlllllllIIllIlIllllI = 14273354;
        return class_13132;
    }
}

