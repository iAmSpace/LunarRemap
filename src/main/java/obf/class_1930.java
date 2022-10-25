package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

import java.util.Random;

public class class_1930
extends Block {
    private class_2102 llllllIlIllllIlIlIlIIIIlI;
    private class_2102 lIlIIllllIlIIIIllIIIIlIIl;

    protected class_1930() {
        super(class_1855.lllIlIIlIIIlIlIIIllIlllIl);
        this.lllIIIllIIIIlllIlIIllIIll(true);
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.lllIlIIlIIIlIlIIIllIlllIl);
    }

    @Override
    public class_2102 lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        return n == 1 ? this.llllllIlIllllIlIlIlIIIIlI : (n == 0 ? Blocks.lIlllIlllIIIIlIIlllIllIII.lIlllIlllIIIIlIIlllIllIII(n) : this.llIIIIllIIIIIIIlIIIlIIIIl);
    }

    @Override
    public class_2102 IlIllllllIIlIIllllIIlIIIl(class_1843 class_18432, int n, int n2, int n3, int n4) {
        if (n4 == 1) {
            return this.llllllIlIllllIlIlIlIIIIlI;
        }
        if (n4 == 0) {
            return Blocks.lIlllIlllIIIIlIIlllIllIII.lIlllIlllIIIIlIIlllIllIII(n4);
        }
        class_1855 class_18552 = class_18432.a_(n, n2 + 1, n3).lIllllIIlIIIlIllllllIIIll();
        return class_18552 != class_1855.llIllllIlIllIIIlIllIIlIlI && class_18552 != class_1855.lIlllIlllIlIIIIlllIlIlIIl ? this.llIIIIllIIIIIIIlIIIlIIIIl : this.lIlIIllllIlIIIIllIIIIlIIl;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
        this.llIIIIllIIIIIIIlIIIlIIIIl = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_side");
        this.llllllIlIllllIlIlIlIIIIlI = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_top");
        this.lIlIIllllIlIIIIllIIIIlIIl = class_08872.lllIIIllIIIIlllIlIIllIIll("grass_side_snowed");
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Random random) {
        if (!class_13342.IllIIIIllIIllIllIlllIlIIl) {
            if (class_13342.IllIIIllIIIIlIlIlIllIIlll(n, n2 + 1, n3) < 4 && class_13342.a_(n, n2 + 1, n3).lllIlIIlIIIlIlIIIllIlllIl() > 2) {
                class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, Blocks.lIlllIlllIIIIlIIlllIllIII);
            } else if (class_13342.IllIIIllIIIIlIlIlIllIIlll(n, n2 + 1, n3) >= 9) {
                for (int i = 0; i < 4; ++i) {
                    int n4 = n + random.nextInt(3) - 1;
                    int n5 = n2 + random.nextInt(5) - 3;
                    int n6 = n3 + random.nextInt(3) - 1;
                    Block class_05492 = class_13342.a_(n4, n5 + 1, n6);
                    if (class_13342.a_(n4, n5, n6) != Blocks.lIlllIlllIIIIlIIlllIllIII || class_13342.IlIllllllIIlIIllllIIlIIIl(n4, n5, n6) != 0 || class_13342.IllIIIllIIIIlIlIlIllIIlll(n4, n5 + 1, n6) < 4 || class_05492.lllIlIIlIIIlIlIIIllIlllIl() > 2) continue;
                    class_13342.lllIIIllIIIIlllIlIIllIIll(n4, n5, n6, this);
                }
            }
        }
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_1334 class_13342, int n, int n2, int n3, Random random) {
        super.lllIlIIlIIIlIlIIIllIlllIl(class_13342, n, n2, n3, random);
        if (random.nextInt(10) == 0) {
            class_13342.lllIIIllIIIIlllIlIIllIIll("townaura", (double)((float)n + random.nextFloat()), (double)((float)n2 + 1.1f), (double)((float)n3 + random.nextFloat()), 0.0, 0.0, 0.0);
        }
    }

    @Override
    public Item lllIIIllIIIIlllIlIIllIIll(int n, Random random, int n2) {
        return Blocks.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(0, random, n2);
    }
}

