package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.item.Item;

import java.util.Random;

public class class_1141
extends Block {
    public class_1141() {
        super(class_1855.IIIIIIIIlIllIIllIIlllIllI);
        this.lllIIIllIIIIlllIlIIllIIll(0.0625f, 0.0f, 0.0625f, 0.9375f, 1.0f, 0.9375f);
    }

    @Override
    public void lIlllIlllIIIIlIIlllIllIII(class_1334 class_13342, int n, int n2, int n3) {
        class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3, this, this.lllIIIllIIIIlllIlIIllIIll(class_13342));
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Block class_05492) {
        class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3, this, this.lllIIIllIIIIlllIlIIllIIll(class_13342));
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Random random) {
        this.IllIIIllIIIIlIlIlIllIIlll(class_13342, n, n2, n3);
    }

    private void IllIIIllIIIIlIlIlIllIIlll(class_1334 class_13342, int n, int n2, int n3) {
        if (class_0351.IllIIIllIIIIlIlIlIllIIlll(class_13342, n, n2 - 1, n3) && n2 >= 0) {
            int n4 = 32;
            if (!class_0351.llIlllIIllIlllIlIlIlIIIll && class_13342.lllIlIIlIIIlIlIIIllIlllIl(n - n4, n2 - n4, n3 - n4, n + n4, n2 + n4, n3 + n4)) {
                class_0543 class_05432 = new class_0543(class_13342, (float)n + 0.5f, (float)n2 + 0.5f, (float)n3 + 0.5f, this);
                class_13342.lllIIIllIIIIlllIlIIllIIll(class_05432);
            } else {
                class_13342.lIllllIIlIIIlIllllllIIIll(n, n2, n3);
                while (class_0351.IllIIIllIIIIlIlIlIllIIlll(class_13342, n, n2 - 1, n3) && n2 > 0) {
                    --n2;
                }
                if (n2 > 0) {
                    class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, this, 0, 2);
                }
            }
        }
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_0814 class_08142, int n4, float f, float f2, float f3) {
        this.lIIIIlIlIIlllllIIllIIlIII(class_13342, n, n2, n3);
        return true;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_0814 class_08142) {
        this.lIIIIlIlIIlllllIIllIIlIII(class_13342, n, n2, n3);
    }

    private void lIIIIlIlIIlllllIIllIIlIII(class_1334 class_13342, int n, int n2, int n3) {
        if (class_13342.a_(n, n2, n3) == this) {
            for (int i = 0; i < 1000; ++i) {
                int n4 = n + class_13342.lllllIlllIIllIlIIlIIIllII.nextInt(16) - class_13342.lllllIlllIIllIlIIlIIIllII.nextInt(16);
                int n5 = n2 + class_13342.lllllIlllIIllIlIIlIIIllII.nextInt(8) - class_13342.lllllIlllIIllIlIIlIIIllII.nextInt(8);
                int n6 = n3 + class_13342.lllllIlllIIllIlIIlIIIllII.nextInt(16) - class_13342.lllllIlllIIllIlIIlIIIllII.nextInt(16);
                if (class_13342.a_((int)n4, (int)n5, (int)n6).IlIlIIlllIllllllllIIIlIlI != class_1855.lllIIIllIIIIlllIlIIllIIll) continue;
                if (!class_13342.IllIIIIllIIllIllIlllIlIIl) {
                    class_13342.lllIIIllIIIIlllIlIIllIIll(n4, n5, n6, this, class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3), 2);
                    class_13342.lIllllIIlIIIlIllllllIIIll(n, n2, n3);
                } else {
                    int n7 = 128;
                    for (int j = 0; j < n7; ++j) {
                        double d = class_13342.lllllIlllIIllIlIIlIIIllII.nextDouble();
                        float f = (class_13342.lllllIlllIIllIlIIlIIIllII.nextFloat() - 0.5f) * 0.2f;
                        float f2 = (class_13342.lllllIlllIIllIlIIlIIIllII.nextFloat() - 0.5f) * 0.2f;
                        float f3 = (class_13342.lllllIlllIIllIlIIlIIIllII.nextFloat() - 0.5f) * 0.2f;
                        double d2 = (double)n4 + (double)(n - n4) * d + (class_13342.lllllIlllIIllIlIIlIIIllII.nextDouble() - 0.5) * 1.0 + 0.5;
                        double d3 = (double)n5 + (double)(n2 - n5) * d + class_13342.lllllIlllIIllIlIIlIIIllII.nextDouble() * 1.0 - 0.5;
                        double d4 = (double)n6 + (double)(n3 - n6) * d + (class_13342.lllllIlllIIllIlIIlIIIllII.nextDouble() - 0.5) * 1.0 + 0.5;
                        class_13342.lllIIIllIIIIlllIlIIllIIll("portal", d2, d3, d4, (double)f, (double)f2, f3);
                    }
                }
                return;
            }
        }
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342) {
        return 5;
    }

    @Override
    public boolean IlIlllIIIIIIlIIllIIllIlll() {
        return false;
    }

    @Override
    public boolean IllIIIllIIIIlIlIlIllIIlll() {
        return false;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1843 class_18432, int n, int n2, int n3, int n4) {
        return true;
    }

    @Override
    public int lIIIIlIlIIlllllIIllIIlIII() {
        return 27;
    }

    @Override
    public Item IIIllIIlIIIIIIlIlIIllIIlI(class_1334 class_13342, int n, int n2, int n3) {
        return Item.lllIIIllIIIIlllIlIIllIIll(0);
    }
}

