package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;

import java.util.Random;

public class class_0435
extends class_0854
implements class_0588 {
    private IIcon[] llllllIlIllllIlIlIlIIIIlI;

    protected class_0435() {
        this.lllIIIllIIIIlllIlIIllIIll(true);
        float f = 0.5f;
        this.lllIIIllIIIIlllIlIIllIIll(0.5f - f, 0.0f, 0.5f - f, 0.5f + f, 0.25f, 0.5f + f);
        this.lllIIIllIIIIlllIlIIllIIll((class_0931)null);
        this.IlIllllllIIlIIllllIIlIIIl(0.0f);
        this.lllIIIllIIIIlllIlIIllIIll(lIllllIIlIIIlIllllllIIIll);
        this.IIlIIlIlIlIllIIlIlIIIIlll();
    }

    @Override
    protected boolean IlIllllllIIlIIllllIIlIIIl(Block class_05492) {
        return class_05492 == Blocks.IIIlIlIllIlllllIlIllllllI;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Random random) {
        float f;
        int n4;
        super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, random);
        if (class_13342.IllIIIllIIIIlIlIlIllIIlll(n, n2 + 1, n3) >= 9 && (n4 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3)) < 7 && random.nextInt((int)(25.0f / (f = this.llIIlllIllIllllIIIlIIIIII(class_13342, n, n2, n3))) + 1) == 0) {
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, ++n4, 2);
        }
    }

    public void lIIIIlIlIIlllllIIllIIlIII(class_1334 class_13342, int n, int n2, int n3) {
        int n4 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3) + MathHelper.lllIIIllIIIIlllIlIIllIIll(class_13342.lllllIlllIIllIlIIlIIIllII, 2, 5);
        if (n4 > 7) {
            n4 = 7;
        }
        class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n4, 2);
    }

    private float llIIlllIllIllllIIIlIIIIII(class_1334 class_13342, int n, int n2, int n3) {
        float f = 1.0f;
        Block class_05492 = class_13342.a_(n, n2, n3 - 1);
        Block class_05493 = class_13342.a_(n, n2, n3 + 1);
        Block class_05494 = class_13342.a_(n - 1, n2, n3);
        Block class_05495 = class_13342.a_(n + 1, n2, n3);
        Block class_05496 = class_13342.a_(n - 1, n2, n3 - 1);
        Block class_05497 = class_13342.a_(n + 1, n2, n3 - 1);
        Block class_05498 = class_13342.a_(n + 1, n2, n3 + 1);
        Block class_05499 = class_13342.a_(n - 1, n2, n3 + 1);
        boolean bl = class_05494 == this || class_05495 == this;
        boolean bl2 = class_05492 == this || class_05493 == this;
        boolean bl3 = class_05496 == this || class_05497 == this || class_05498 == this || class_05499 == this;
        for (int i = n - 1; i <= n + 1; ++i) {
            for (int j = n3 - 1; j <= n3 + 1; ++j) {
                float f2 = 0.0f;
                if (class_13342.a_(i, n2 - 1, j) == Blocks.IIIlIlIllIlllllIlIllllllI) {
                    f2 = 1.0f;
                    if (class_13342.IlIllllllIIlIIllllIIlIIIl(i, n2 - 1, j) > 0) {
                        f2 = 3.0f;
                    }
                }
                if (i != n || j != n3) {
                    f2 /= 4.0f;
                }
                f += f2;
            }
        }
        if (bl3 || bl && bl2) {
            f /= 2.0f;
        }
        return f;
    }

    @Override
    public IIcon lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        if (n2 < 0 || n2 > 7) {
            n2 = 7;
        }
        return this.llllllIlIllllIlIlIlIIIIlI[n2];
    }

    @Override
    public int lIIIIlIlIIlllllIIllIIlIII() {
        return 6;
    }

    protected Item llIlllIIllIlllIlIlIlIIIll() {
        return Items.llIlllIIllIlllIlIlIlIIIll;
    }

    protected Item IIIIlIIlIIIllIIIIllIIIlII() {
        return Items.wheat;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, int n4, float f, int n5) {
        super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, n4, f, 0);
        if (!class_13342.IllIIIIllIIllIllIlllIlIIl && n4 >= 7) {
            int n6 = 3 + n5;
            for (int i = 0; i < n6; ++i) {
                if (class_13342.lllllIlllIIllIlIIlIIIllII.nextInt(15) > n4) continue;
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, new ItemStack(this.llIlllIIllIlllIlIlIlIIIll(), 1, 0));
            }
        }
    }

    @Override
    public Item lllIIIllIIIIlllIlIIllIIll(int n, Random random, int n2) {
        return n == 7 ? this.IIIIlIIlIIIllIIIIllIIIlII() : this.llIlllIIllIlllIlIlIlIIIll();
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(Random random) {
        return 1;
    }

    @Override
    public Item IIIllIIlIIIIIIlIlIIllIIlI(class_1334 class_13342, int n, int n2, int n3) {
        return this.llIlllIIllIlllIlIlIlIIIll();
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
        this.llllllIlIllllIlIlIlIIIIlI = new IIcon[8];
        for (int i = 0; i < this.llllllIlIllllIlIlIlIIIIlI.length; ++i) {
            this.llllllIlIllllIlIlIlIIIIlI[i] = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_stage_" + i);
        }
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, boolean bl) {
        return class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3) != 7;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, Random random, int n, int n2, int n3) {
        return true;
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_1334 class_13342, Random random, int n, int n2, int n3) {
        this.lIIIIlIlIIlllllIIllIIlIII(class_13342, n, n2, n3);
    }
}

