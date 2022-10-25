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

public class class_0895
extends class_0854
implements class_0588 {
    private final Block llllllIlIllllIlIlIlIIIIlI;
    private class_2102 lIlIIllllIlIIIIllIIIIlIIl;

    protected class_0895(Block class_05492) {
        this.llllllIlIllllIlIlIlIIIIlI = class_05492;
        this.lllIIIllIIIIlllIlIIllIIll(true);
        float f = 0.125f;
        this.lllIIIllIIIIlllIlIIllIIll(0.5f - f, 0.0f, 0.5f - f, 0.5f + f, 0.25f, 0.5f + f);
        this.lllIIIllIIIIlllIlIIllIIll((class_0931)null);
    }

    @Override
    protected boolean IlIllllllIIlIIllllIIlIIIl(Block class_05492) {
        return class_05492 == Blocks.IIIlIlIllIlllllIlIllllllI;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Random random) {
        float f;
        super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, random);
        if (class_13342.IllIIIllIIIIlIlIlIllIIlll(n, n2 + 1, n3) >= 9 && random.nextInt((int)(25.0f / (f = this.llIIlllIllIllllIIIlIIIIII(class_13342, n, n2, n3))) + 1) == 0) {
            int n4 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
            if (n4 < 7) {
                class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, ++n4, 2);
            } else {
                if (class_13342.a_(n - 1, n2, n3) == this.llllllIlIllllIlIlIlIIIIlI) {
                    return;
                }
                if (class_13342.a_(n + 1, n2, n3) == this.llllllIlIllllIlIlIlIIIIlI) {
                    return;
                }
                if (class_13342.a_(n, n2, n3 - 1) == this.llllllIlIllllIlIlIlIIIIlI) {
                    return;
                }
                if (class_13342.a_(n, n2, n3 + 1) == this.llllllIlIllllIlIlIlIIIIlI) {
                    return;
                }
                int n5 = random.nextInt(4);
                int n6 = n;
                int n7 = n3;
                if (n5 == 0) {
                    n6 = n - 1;
                }
                if (n5 == 1) {
                    ++n6;
                }
                if (n5 == 2) {
                    n7 = n3 - 1;
                }
                if (n5 == 3) {
                    ++n7;
                }
                Block class_05492 = class_13342.a_(n6, n2 - 1, n7);
                if (class_13342.a_((int)n6, (int)n2, (int)n7).IlIlIIlllIllllllllIIIlIlI == class_1855.lllIIIllIIIIlllIlIIllIIll && (class_05492 == Blocks.IIIlIlIllIlllllIlIllllllI || class_05492 == Blocks.lIlllIlllIIIIlIIlllIllIII || class_05492 == Blocks.IlIllllllIIlIIllllIIlIIIl)) {
                    class_13342.lllIIIllIIIIlllIlIIllIIll(n6, n2, n7, this.llllllIlIllllIlIlIlIIIIlI);
                }
            }
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
                Block class_054910 = class_13342.a_(i, n2 - 1, j);
                float f2 = 0.0f;
                if (class_054910 == Blocks.IIIlIlIllIlllllIlIllllllI) {
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
    public int lIllllIIlIIIlIllllllIIIll(int n) {
        int n2 = n * 32;
        int n3 = 255 - n * 8;
        int n4 = n * 4;
        return n2 << 16 | n3 << 8 | n4;
    }

    @Override
    public int lIlllIlllIIIIlIIlllIllIII(class_1843 class_18432, int n, int n2, int n3) {
        return this.lIllllIIlIIIlIllllllIIIll(class_18432.IlIllllllIIlIIllllIIlIIIl(n, n2, n3));
    }

    @Override
    public void lIlllIlllIlIIIIlllIlIlIIl() {
        float f = 0.125f;
        this.lllIIIllIIIIlllIlIIllIIll(0.5f - f, 0.0f, 0.5f - f, 0.5f + f, 0.25f, 0.5f + f);
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl(class_1843 class_18432, int n, int n2, int n3) {
        this.IIIIIIIIlIllIIllIIlllIllI = (float)(class_18432.IlIllllllIIlIIllllIIlIIIl(n, n2, n3) * 2 + 2) / 16.0f;
        float f = 0.125f;
        this.lllIIIllIIIIlllIlIIllIIll(0.5f - f, 0.0f, 0.5f - f, 0.5f + f, (float)this.IIIIIIIIlIllIIllIIlllIllI, 0.5f + f);
    }

    @Override
    public int lIIIIlIlIIlllllIIllIIlIII() {
        return 19;
    }

    public int IlIIIIIllllllIIlllIllllll(class_1843 class_18432, int n, int n2, int n3) {
        int n4 = class_18432.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        return n4 < 7 ? -1 : (class_18432.a_(n - 1, n2, n3) == this.llllllIlIllllIlIlIlIIIIlI ? 0 : (class_18432.a_(n + 1, n2, n3) == this.llllllIlIllllIlIlIlIIIIlI ? 1 : (class_18432.a_(n, n2, n3 - 1) == this.llllllIlIllllIlIlIlIIIIlI ? 2 : (class_18432.a_(n, n2, n3 + 1) == this.llllllIlIllllIlIlIlIIIIlI ? 3 : -1))));
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, int n4, float f, int n5) {
        super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, n4, f, n5);
        if (!class_13342.IllIIIIllIIllIllIlllIlIIl) {
            Item class_06112 = null;
            if (this.llllllIlIllllIlIlIlIIIIlI == Blocks.lIlIIlllllIlllllIlIIIllll) {
                class_06112 = Items.lIIIllIlIlIlIIIllIlIlIllI;
            }
            if (this.llllllIlIllllIlIlIlIIIIlI == Blocks.IllIlIlIIIlIllIlIlIIlllII) {
                class_06112 = Items.IIIlIllIlllIlIIIlIlIIllII;
            }
            for (int i = 0; i < 3; ++i) {
                if (class_13342.lllllIlllIIllIlIIlIIIllII.nextInt(15) > n4) continue;
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, new ItemStack(class_06112));
            }
        }
    }

    @Override
    public Item lllIIIllIIIIlllIlIIllIIll(int n, Random random, int n2) {
        return null;
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(Random random) {
        return 1;
    }

    @Override
    public Item IIIllIIlIIIIIIlIlIIllIIlI(class_1334 class_13342, int n, int n2, int n3) {
        return this.llllllIlIllllIlIlIlIIIIlI == Blocks.lIlIIlllllIlllllIlIIIllll ? Items.lIIIllIlIlIlIIIllIlIlIllI : (this.llllllIlIllllIlIlIlIIIIlI == Blocks.IllIlIlIIIlIllIlIlIIlllII ? Items.IIIlIllIlllIlIIIlIlIIllII : Item.lllIIIllIIIIlllIlIIllIIll(0));
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
        this.llIIIIllIIIIIIIlIIIlIIIIl = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_disconnected");
        this.lIlIIllllIlIIIIllIIIIlIIl = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_connected");
    }

    public class_2102 llIlllIIllIlllIlIlIlIIIll() {
        return this.lIlIIllllIlIIIIllIIIIlIIl;
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

