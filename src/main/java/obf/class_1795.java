package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class class_1795
extends class_1976 {
    private boolean llllllIlIllllIlIlIlIIIIlI;
    private static Map lIlIIllllIlIIIIllIIIIlIIl = new HashMap();

    private boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, boolean bl) {
        if (!lIlIIllllIlIIIIllIIIIlIIl.containsKey(class_13342)) {
            lIlIIllllIlIIIIllIIIIlIIl.put(class_13342, new ArrayList());
        }
        List list = (List)lIlIIllllIlIIIIllIIIIlIIl.get(class_13342);
        if (bl) {
            list.add(new class_0586(n, n2, n3, class_13342.IlIIIlIIIIllIIIllIIIIIIll()));
        }
        int n4 = 0;
        for (int i = 0; i < list.size(); ++i) {
            class_0586 class_05862 = (class_0586)list.get(i);
            if (class_05862.lllIIIllIIIIlllIlIIllIIll != n || class_05862.lllIlIIlIIIlIlIIIllIlllIl != n2 || class_05862.IlIllllllIIlIIllllIIlIIIl != n3 || ++n4 < 8) continue;
            return true;
        }
        return false;
    }

    protected class_1795(boolean bl) {
        this.llllllIlIllllIlIlIlIIIIlI = bl;
        this.lllIIIllIIIIlllIlIIllIIll(true);
        this.lllIIIllIIIIlllIlIIllIIll((class_0931)null);
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342) {
        return 2;
    }

    @Override
    public void lIlllIlllIIIIlIIlllIllIII(class_1334 class_13342, int n, int n2, int n3) {
        if (class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3) == 0) {
            super.lIlllIlllIIIIlIIlllIllIII(class_13342, n, n2, n3);
        }
        if (this.llllllIlIllllIlIlIlIIIIlI) {
            class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2 - 1, n3, this);
            class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2 + 1, n3, this);
            class_13342.IlIllllllIIlIIllllIIlIIIl(n - 1, n2, n3, this);
            class_13342.IlIllllllIIlIIllllIIlIIIl(n + 1, n2, n3, this);
            class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3 - 1, this);
            class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3 + 1, this);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Block class_05492, int n4) {
        if (this.llllllIlIllllIlIlIlIIIIlI) {
            class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2 - 1, n3, this);
            class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2 + 1, n3, this);
            class_13342.IlIllllllIIlIIllllIIlIIIl(n - 1, n2, n3, this);
            class_13342.IlIllllllIIlIIllllIIlIIIl(n + 1, n2, n3, this);
            class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3 - 1, this);
            class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3 + 1, this);
        }
    }

    @Override
    public int lIlllIlllIIIIlIIlllIllIII(class_1843 class_18432, int n, int n2, int n3, int n4) {
        if (!this.llllllIlIllllIlIlIlIIIIlI) {
            return 0;
        }
        int n5 = class_18432.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        return n5 == 5 && n4 == 1 ? 0 : (n5 == 3 && n4 == 3 ? 0 : (n5 == 4 && n4 == 2 ? 0 : (n5 == 1 && n4 == 5 ? 0 : (n5 == 2 && n4 == 4 ? 0 : 15))));
    }

    private boolean lIIIIlIlIIlllllIIllIIlIII(class_1334 class_13342, int n, int n2, int n3) {
        int n4 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        return n4 == 5 && class_13342.IlIIIIIllllllIIlllIllllll(n, n2 - 1, n3, 0) ? true : (n4 == 3 && class_13342.IlIIIIIllllllIIlllIllllll(n, n2, n3 - 1, 2) ? true : (n4 == 4 && class_13342.IlIIIIIllllllIIlllIllllll(n, n2, n3 + 1, 3) ? true : (n4 == 1 && class_13342.IlIIIIIllllllIIlllIllllll(n - 1, n2, n3, 4) ? true : n4 == 2 && class_13342.IlIIIIIllllllIIlllIllllll(n + 1, n2, n3, 5))));
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Random random) {
        boolean bl = this.lIIIIlIlIIlllllIIllIIlIII(class_13342, n, n2, n3);
        List list = (List)lIlIIllllIlIIIIllIIIIlIIl.get(class_13342);
        while (list != null && !list.isEmpty() && class_13342.IlIIIlIIIIllIIIllIIIIIIll() - ((class_0586)list.get((int)0)).lIlllIlllIIIIlIIlllIllIII > 60L) {
            list.remove(0);
        }
        if (this.llllllIlIllllIlIlIlIIIIlI) {
            if (bl) {
                class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, Blocks.IlIIIlIIlllllIIIllIlIlIll, class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3), 3);
                if (this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, true)) {
                    class_13342.lllIIIllIIIIlllIlIIllIIll((float)n + 0.5f, (double)((float)n2 + 0.5f), (double)((float)n3 + 0.5f), "random.fizz", 0.5f, 2.6f + (class_13342.lllllIlllIIllIlIIlIIIllII.nextFloat() - class_13342.lllllIlllIIllIlIIlIIIllII.nextFloat()) * 0.8f);
                    for (int i = 0; i < 5; ++i) {
                        double d = (double)n + random.nextDouble() * 0.6 + 0.2;
                        double d2 = (double)n2 + random.nextDouble() * 0.6 + 0.2;
                        double d3 = (double)n3 + random.nextDouble() * 0.6 + 0.2;
                        class_13342.lllIIIllIIIIlllIlIIllIIll("smoke", d, d2, d3, 0.0, 0.0, 0.0);
                    }
                }
            }
        } else if (!bl && !this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, false)) {
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, Blocks.lIIllllllllIlIllllllllIlI, class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3), 3);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Block class_05492) {
        if (!this.lllIlIIlIIIlIlIIIllIlllIl(class_13342, n, n2, n3, class_05492)) {
            boolean bl = this.lIIIIlIlIIlllllIIllIIlIII(class_13342, n, n2, n3);
            if (this.llllllIlIllllIlIlIlIIIIlI && bl || !this.llllllIlIllllIlIlIlIIIIlI && !bl) {
                class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3, this, this.lllIIIllIIIIlllIlIIllIIll(class_13342));
            }
        }
    }

    @Override
    public int IlIIIIIllllllIIlllIllllll(class_1843 class_18432, int n, int n2, int n3, int n4) {
        return n4 == 0 ? this.lIlllIlllIIIIlIIlllIllIII(class_18432, n, n2, n3, n4) : 0;
    }

    @Override
    public Item lllIIIllIIIIlllIlIIllIIll(int n, Random random, int n2) {
        return Item.getItemFromBlock(Blocks.lIIllllllllIlIllllllllIlI);
    }

    @Override
    public boolean llIllllIlIllIIIlIllIIlIlI() {
        return true;
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_1334 class_13342, int n, int n2, int n3, Random random) {
        if (this.llllllIlIllllIlIlIlIIIIlI) {
            int n4 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
            double d = (double)((float)n + 0.5f) + (double)(random.nextFloat() - 0.5f) * 0.2;
            double d2 = (double)((float)n2 + 0.7f) + (double)(random.nextFloat() - 0.5f) * 0.2;
            double d3 = (double)((float)n3 + 0.5f) + (double)(random.nextFloat() - 0.5f) * 0.2;
            double d4 = 0.22f;
            double d5 = 0.27f;
            if (n4 == 1) {
                class_13342.lllIIIllIIIIlllIlIIllIIll("reddust", d - d5, d2 + d4, d3, 0.0, 0.0, 0.0);
            } else if (n4 == 2) {
                class_13342.lllIIIllIIIIlllIlIIllIIll("reddust", d + d5, d2 + d4, d3, 0.0, 0.0, 0.0);
            } else if (n4 == 3) {
                class_13342.lllIIIllIIIIlllIlIIllIIll("reddust", d, d2 + d4, d3 - d5, 0.0, 0.0, 0.0);
            } else if (n4 == 4) {
                class_13342.lllIIIllIIIIlllIlIIllIIll("reddust", d, d2 + d4, d3 + d5, 0.0, 0.0, 0.0);
            } else {
                class_13342.lllIIIllIIIIlllIlIIllIIll("reddust", d, d2, d3, 0.0, 0.0, 0.0);
            }
        }
    }

    @Override
    public Item IIIllIIlIIIIIIlIlIIllIIlI(class_1334 class_13342, int n, int n2, int n3) {
        return Item.getItemFromBlock(Blocks.lIIllllllllIlIllllllllIlI);
    }

    @Override
    public boolean lllIlIIlIIIlIlIIIllIlllIl(Block class_05492) {
        return class_05492 == Blocks.IlIIIlIIlllllIIIllIlIlIll || class_05492 == Blocks.lIIllllllllIlIllllllllIlI;
    }
}

