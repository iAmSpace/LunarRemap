package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.util.MathHelper;

import java.util.Random;

public class class_1806
extends class_0672 {
    private int IIIIIllIlIllIlIlIIlIllIIl;
    protected static final class_1347 lIIllIIlIIIlllIlllIIlIIlI = new class_1347(false, true);
    protected static final class_1347 IllIIllIlIlllIllIllIlIIIl = new class_1347(false, false);
    protected static final class_1440 IIIlIllllIIIlllllIllIlIII = new class_1440(false);

    public class_1806(int n, int n2) {
        super(n);
        this.IIIIIllIlIllIlIlIIlIllIIl = n2;
        this.llIIIlIlIlIIlIllIIIllIlIl.llIIlIllIllllIlIIIIlIIlll = 10;
        this.llIIIlIlIlIIlIllIIIllIlIl.lIlllIlllIlIIIIlllIlIlIIl = 2;
        if (this.IIIIIllIlIllIlIlIIlIllIIl == 1) {
            this.llIIIlIlIlIIlIllIIIllIlIl.llIIlIllIllllIlIIIIlIIlll = 6;
            this.llIIIlIlIlIIlIllIIIllIlIl.llIllllIlIllIIIlIllIIlIlI = 100;
            this.llIIIlIlIlIIlIllIIIllIlIl.lIlllIlllIlIIIIlllIlIlIIl = 1;
        }
        this.lllIIIllIIIIlllIlIIllIIll(5159473);
        this.lllIIIllIIIIlllIlIIllIIll(0.7f, 0.8f);
        if (this.IIIIIllIlIllIlIlIIlIllIIl == 2) {
            this.IlllIIlllllllIIllIlIllllI = 353825;
            this.llllIIllIlIlllllllIIlIIlI = 3175492;
            this.lllIIIllIIIIlllIlIIllIIll(0.6f, 0.6f);
        }
        if (this.IIIIIllIlIllIlIlIIlIllIIl == 0) {
            this.llIIIIIlIIlIIIIllIIIlIIII.add(new class_0920(class_1305.class, 5, 4, 4));
        }
        if (this.IIIIIllIlIllIlIlIIlIllIIl == 3) {
            this.llIIIlIlIlIIlIllIIIllIlIl.llIIlIllIllllIlIIIIlIIlll = -999;
        }
    }

    @Override
    protected class_0672 lllIIIllIIIIlllIlIIllIIll(int n, boolean bl) {
        if (this.IIIIIllIlIllIlIlIIlIllIIl == 2) {
            this.IlllIIlllllllIIllIlIllllI = 353825;
            this.llllIIllIlIlllllllIIlIIlI = n;
            if (bl) {
                this.IlllIIlllllllIIllIlIllllI = (this.IlllIIlllllllIIllIlIllllI & 0xFEFEFE) >> 1;
            }
            return this;
        }
        return super.lllIIIllIIIIlllIlIIllIIll(n, bl);
    }

    @Override
    public class_1174 lllIIIllIIIIlllIlIIllIIll(Random random) {
        return this.IIIIIllIlIllIlIlIIlIllIIl == 3 && random.nextInt(3) > 0 ? IIIlIllllIIIlllllIllIlIII : (this.IIIIIllIlIllIlIlIIlIllIIl != 2 && random.nextInt(5) != 0 ? this.IlIIIlIIlllllIIIllIlIlIll : IllIIllIlIlllIllIllIlIIIl);
    }

    @Override
    public String lllIIIllIIIIlllIlIIllIIll(Random random, int n, int n2, int n3) {
        if (this.IIIIIllIlIllIlIlIIlIllIIl == 1) {
            double d = MathHelper.lllIIIllIIIIlllIlIIllIIll((1.0 + IllllIIlIIIllIlllIlllIllI.lllIIIllIIIIlllIlIIllIIll((double)n / 48.0, (double)n3 / 48.0)) / 2.0, 0.0, 0.9999);
            int n4 = (int)(d * (double)class_1209.llllllIlIllllIlIlIlIIIIlI.length);
            if (n4 == 1) {
                n4 = 0;
            }
            return class_1209.llllllIlIllllIlIlIlIIIIlI[n4];
        }
        return super.lllIIIllIIIIlllIlIIllIIll(random, n, n2, n3);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, Random random, int n, int n2) {
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        if (this.IIIIIllIlIllIlIlIIlIllIIl == 3) {
            for (n7 = 0; n7 < 4; ++n7) {
                for (n6 = 0; n6 < 4; ++n6) {
                    class_1067 class_10672;
                    n5 = n + n7 * 4 + 1 + 8 + random.nextInt(3);
                    n4 = n2 + n6 * 4 + 1 + 8 + random.nextInt(3);
                    n3 = class_13342.lIllllIIlIIIlIllllllIIIll(n5, n4);
                    if (random.nextInt(20) == 0) {
                        class_10672 = new class_0049();
                        ((class_0049)class_10672).a_(class_13342, random, n5, n3, n4);
                        continue;
                    }
                    class_10672 = this.lllIIIllIIIIlllIlIIllIIll(random);
                    class_10672.lllIIIllIIIIlllIlIIllIIll(1.0, 1.0, 1.0);
                    if (!class_10672.a_(class_13342, random, n5, n3, n4)) continue;
                    ((class_1174)class_10672).lllIIIllIIIIlllIlIIllIIll(class_13342, random, n5, n3, n4);
                }
            }
        }
        n7 = random.nextInt(5) - 3;
        if (this.IIIIIllIlIllIlIlIIlIllIIl == 1) {
            n7 += 2;
        }
        for (n6 = 0; n6 < n7; ++n6) {
            int n8;
            int n9;
            n5 = random.nextInt(3);
            if (n5 == 0) {
                IllIlIlIIIlllIIllIIIIlIll.lllIIIllIIIIlllIlIIllIIll(1);
            } else if (n5 == 1) {
                IllIlIlIIIlllIIllIIIIlIll.lllIIIllIIIIlllIlIIllIIll(4);
            } else if (n5 == 2) {
                IllIlIlIIIlllIIllIIIIlIll.lllIIIllIIIIlllIlIIllIIll(5);
            }
            for (n4 = 0; n4 < 5 && !IllIlIlIIIlllIIllIIIIlIll.a_(class_13342, random, n3 = n + random.nextInt(16) + 8, n9 = random.nextInt(class_13342.lIllllIIlIIIlIllllllIIIll(n3, n8 = n2 + random.nextInt(16) + 8) + 32), n8); ++n4) {
            }
        }
        super.lllIIIllIIIIlllIlIIllIIll(class_13342, random, n, n2);
    }

    @Override
    public int lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, int n3) {
        int n4 = super.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3);
        return this.IIIIIllIlIllIlIlIIlIllIIl == 3 ? (n4 & 0xFEFEFE) + 2634762 >> 1 : n4;
    }

    @Override
    protected class_0672 lIIIIlIlIIlllllIIllIIlIII() {
        if (this.lIlIllIIllIIIIlllIlIlllIl == class_0672.lIIlIIIIIlIlllIlIIlIlIlll.lIlIllIIllIIIIlllIlIlllIl) {
            class_1806 class_18062 = new class_1806(this.lIlIllIIllIIIIlllIlIlllIl + 128, 1);
            class_18062.lllIIIllIIIIlllIlIIllIIll(new class_0753(this.llllIlIIllIIlllllIIllIIll, this.IlIlIllIIlIIIIlllIlIllIlI + 0.2f));
            class_18062.lllIIIllIIIIlllIlIIllIIll("Flower Forest");
            class_18062.lllIIIllIIIIlllIlIIllIIll(6976549, true);
            class_18062.lllIIIllIIIIlllIlIIllIIll(8233509);
            return class_18062;
        }
        return this.lIlIllIIllIIIIlllIlIlllIl != class_0672.lllIIIIIIlIlllIIlIlIIIllI.lIlIllIIllIIIIlllIlIlllIl && this.lIlIllIIllIIIIlllIlIlllIl != class_0672.llIIlIIllIIllIlIIllIIllII.lIlIllIIllIIIIlllIlIlllIl ? new class_0218(this, this.lIlIllIIllIIIIlllIlIlllIl + 128, this) : new class_0776(this, this.lIlIllIIllIIIIlllIlIlllIl + 128, this);
    }
}

