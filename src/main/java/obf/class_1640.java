package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class class_1640
extends Block {
    private boolean llllllIlIllllIlIlIlIIIIlI = true;
    private Set lIlIIllllIlIIIIllIIIIlIIl = new HashSet();
    private class_2102 llIlllIIllIlllIlIlIlIIIll;
    private class_2102 IIIIlIIlIIIllIIIIllIIIlII;
    private class_2102 lllIIIIIIlIlllIIlIlIIIllI;
    private class_2102 llIIlIIllIIllIlIIllIIllII;

    public class_1640() {
        super(class_1855.lllllIlllIIllIlIIlIIIllII);
        this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, 1.0f, 0.0625f, 1.0f);
    }

    @Override
    public class_1974 IlIllllllIIlIIllllIIlIIIl(class_1334 class_13342, int n, int n2, int n3) {
        return null;
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
    public int lIIIIlIlIIlllllIIllIIlIII() {
        return 5;
    }

    @Override
    public int lIlllIlllIIIIlIIlllIllIII(class_1843 class_18432, int n, int n2, int n3) {
        return 0x800000;
    }

    @Override
    public boolean IlIIIIIllllllIIlllIllllll(class_1334 class_13342, int n, int n2, int n3) {
        return class_1334.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2 - 1, n3) || class_13342.a_(n, n2 - 1, n3) == Blocks.IIIIlllIIlIllllllIllIIlll;
    }

    private void IllIIIllIIIIlIlIlIllIIlll(class_1334 class_13342, int n, int n2, int n3) {
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, n, n2, n3);
        ArrayList arrayList = new ArrayList(this.lIlIIllllIlIIIIllIIIIlIIl);
        this.lIlIIllllIlIIIIllIIIIlIIl.clear();
        for (int i = 0; i < arrayList.size(); ++i) {
            class_2137 class_21372 = (class_2137)arrayList.get(i);
            class_13342.IlIllllllIIlIIllllIIlIIIl(class_21372.lllIIIllIIIIlllIlIIllIIll, class_21372.lllIlIIlIIIlIlIIIllIlllIl, class_21372.IlIllllllIIlIIllllIIlIIIl, this);
        }
    }

    private void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, int n4, int n5, int n6) {
        int n7 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        int n8 = 0;
        int n9 = this.IIIllIIlIIIIIIlIlIIllIIlI(class_13342, n4, n5, n6, n8);
        this.llllllIlIllllIlIlIlIIIIlI = false;
        int n10 = class_13342.lIlIlIIlIIIIlIIIIIlllIIII(n, n2, n3);
        this.llllllIlIllllIlIlIlIIIIlI = true;
        if (n10 > 0 && n10 > n9 - 1) {
            n9 = n10;
        }
        int n11 = 0;
        for (int i = 0; i < 4; ++i) {
            int n12 = n;
            int n13 = n3;
            if (i == 0) {
                n12 = n - 1;
            }
            if (i == 1) {
                ++n12;
            }
            if (i == 2) {
                n13 = n3 - 1;
            }
            if (i == 3) {
                ++n13;
            }
            if (n12 != n4 || n13 != n6) {
                n11 = this.IIIllIIlIIIIIIlIlIIllIIlI(class_13342, n12, n2, n13, n11);
            }
            if (class_13342.a_(n12, n2, n13).IIIllIllIIlIlIlIlIllllIIl() && !class_13342.a_(n, n2 + 1, n3).IIIllIllIIlIlIlIlIllllIIl()) {
                if (n12 == n4 && n13 == n6 || n2 < n5) continue;
                n11 = this.IIIllIIlIIIIIIlIlIIllIIlI(class_13342, n12, n2 + 1, n13, n11);
                continue;
            }
            if (class_13342.a_(n12, n2, n13).IIIllIllIIlIlIlIlIllllIIl() || n12 == n4 && n13 == n6 || n2 > n5) continue;
            n11 = this.IIIllIIlIIIIIIlIlIIllIIlI(class_13342, n12, n2 - 1, n13, n11);
        }
        n9 = n11 > n9 ? n11 - 1 : (n9 > 0 ? --n9 : 0);
        if (n10 > n9 - 1) {
            n9 = n10;
        }
        if (n7 != n9) {
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n9, 2);
            this.lIlIIllllIlIIIIllIIIIlIIl.add(new class_2137(n, n2, n3));
            this.lIlIIllllIlIIIIllIIIIlIIl.add(new class_2137(n - 1, n2, n3));
            this.lIlIIllllIlIIIIllIIIIlIIl.add(new class_2137(n + 1, n2, n3));
            this.lIlIIllllIlIIIIllIIIIlIIl.add(new class_2137(n, n2 - 1, n3));
            this.lIlIIllllIlIIIIllIIIIlIIl.add(new class_2137(n, n2 + 1, n3));
            this.lIlIIllllIlIIIIllIIIIlIIl.add(new class_2137(n, n2, n3 - 1));
            this.lIlIIllllIlIIIIllIIIIlIIl.add(new class_2137(n, n2, n3 + 1));
        }
    }

    private void lIIIIlIlIIlllllIIllIIlIII(class_1334 class_13342, int n, int n2, int n3) {
        if (class_13342.a_(n, n2, n3) == this) {
            class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3, this);
            class_13342.IlIllllllIIlIIllllIIlIIIl(n - 1, n2, n3, this);
            class_13342.IlIllllllIIlIIllllIIlIIIl(n + 1, n2, n3, this);
            class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3 - 1, this);
            class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3 + 1, this);
            class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2 - 1, n3, this);
            class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2 + 1, n3, this);
        }
    }

    @Override
    public void lIlllIlllIIIIlIIlllIllIII(class_1334 class_13342, int n, int n2, int n3) {
        super.lIlllIlllIIIIlIIlllIllIII(class_13342, n, n2, n3);
        if (!class_13342.IllIIIIllIIllIllIlllIlIIl) {
            this.IllIIIllIIIIlIlIlIllIIlll(class_13342, n, n2, n3);
            class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2 + 1, n3, this);
            class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2 - 1, n3, this);
            this.lIIIIlIlIIlllllIIllIIlIII(class_13342, n - 1, n2, n3);
            this.lIIIIlIlIIlllllIIllIIlIII(class_13342, n + 1, n2, n3);
            this.lIIIIlIlIIlllllIIllIIlIII(class_13342, n, n2, n3 - 1);
            this.lIIIIlIlIIlllllIIllIIlIII(class_13342, n, n2, n3 + 1);
            if (class_13342.a_(n - 1, n2, n3).IIIllIllIIlIlIlIlIllllIIl()) {
                this.lIIIIlIlIIlllllIIllIIlIII(class_13342, n - 1, n2 + 1, n3);
            } else {
                this.lIIIIlIlIIlllllIIllIIlIII(class_13342, n - 1, n2 - 1, n3);
            }
            if (class_13342.a_(n + 1, n2, n3).IIIllIllIIlIlIlIlIllllIIl()) {
                this.lIIIIlIlIIlllllIIllIIlIII(class_13342, n + 1, n2 + 1, n3);
            } else {
                this.lIIIIlIlIIlllllIIllIIlIII(class_13342, n + 1, n2 - 1, n3);
            }
            if (class_13342.a_(n, n2, n3 - 1).IIIllIllIIlIlIlIlIllllIIl()) {
                this.lIIIIlIlIIlllllIIllIIlIII(class_13342, n, n2 + 1, n3 - 1);
            } else {
                this.lIIIIlIlIIlllllIIllIIlIII(class_13342, n, n2 - 1, n3 - 1);
            }
            if (class_13342.a_(n, n2, n3 + 1).IIIllIllIIlIlIlIlIllllIIl()) {
                this.lIIIIlIlIIlllllIIllIIlIII(class_13342, n, n2 + 1, n3 + 1);
            } else {
                this.lIIIIlIlIIlllllIIllIIlIII(class_13342, n, n2 - 1, n3 + 1);
            }
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Block class_05492, int n4) {
        super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_05492, n4);
        if (!class_13342.IllIIIIllIIllIllIlllIlIIl) {
            class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2 + 1, n3, this);
            class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2 - 1, n3, this);
            class_13342.IlIllllllIIlIIllllIIlIIIl(n + 1, n2, n3, this);
            class_13342.IlIllllllIIlIIllllIIlIIIl(n - 1, n2, n3, this);
            class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3 + 1, this);
            class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3 - 1, this);
            this.IllIIIllIIIIlIlIlIllIIlll(class_13342, n, n2, n3);
            this.lIIIIlIlIIlllllIIllIIlIII(class_13342, n - 1, n2, n3);
            this.lIIIIlIlIIlllllIIllIIlIII(class_13342, n + 1, n2, n3);
            this.lIIIIlIlIIlllllIIllIIlIII(class_13342, n, n2, n3 - 1);
            this.lIIIIlIlIIlllllIIllIIlIII(class_13342, n, n2, n3 + 1);
            if (class_13342.a_(n - 1, n2, n3).IIIllIllIIlIlIlIlIllllIIl()) {
                this.lIIIIlIlIIlllllIIllIIlIII(class_13342, n - 1, n2 + 1, n3);
            } else {
                this.lIIIIlIlIIlllllIIllIIlIII(class_13342, n - 1, n2 - 1, n3);
            }
            if (class_13342.a_(n + 1, n2, n3).IIIllIllIIlIlIlIlIllllIIl()) {
                this.lIIIIlIlIIlllllIIllIIlIII(class_13342, n + 1, n2 + 1, n3);
            } else {
                this.lIIIIlIlIIlllllIIllIIlIII(class_13342, n + 1, n2 - 1, n3);
            }
            if (class_13342.a_(n, n2, n3 - 1).IIIllIllIIlIlIlIlIllllIIl()) {
                this.lIIIIlIlIIlllllIIllIIlIII(class_13342, n, n2 + 1, n3 - 1);
            } else {
                this.lIIIIlIlIIlllllIIllIIlIII(class_13342, n, n2 - 1, n3 - 1);
            }
            if (class_13342.a_(n, n2, n3 + 1).IIIllIllIIlIlIlIlIllllIIl()) {
                this.lIIIIlIlIIlllllIIllIIlIII(class_13342, n, n2 + 1, n3 + 1);
            } else {
                this.lIIIIlIlIIlllllIIllIIlIII(class_13342, n, n2 - 1, n3 + 1);
            }
        }
    }

    private int IIIllIIlIIIIIIlIlIIllIIlI(class_1334 class_13342, int n, int n2, int n3, int n4) {
        if (class_13342.a_(n, n2, n3) != this) {
            return n4;
        }
        int n5 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        return n5 > n4 ? n5 : n4;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Block class_05492) {
        if (!class_13342.IllIIIIllIIllIllIlllIlIIl) {
            boolean bl = this.IlIIIIIllllllIIlllIllllll(class_13342, n, n2, n3);
            if (bl) {
                this.IllIIIllIIIIlIlIlIllIIlll(class_13342, n, n2, n3);
            } else {
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, 0, 0);
                class_13342.lIllllIIlIIIlIllllllIIIll(n, n2, n3);
            }
            super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_05492);
        }
    }

    @Override
    public Item lllIIIllIIIIlllIlIIllIIll(int n, Random random, int n2) {
        return Items.lIIIlIIllIllIIlIIlIIIllII;
    }

    @Override
    public int IlIIIIIllllllIIlllIllllll(class_1843 class_18432, int n, int n2, int n3, int n4) {
        return !this.llllllIlIllllIlIlIlIIIIlI ? 0 : this.lIlllIlllIIIIlIIlllIllIII(class_18432, n, n2, n3, n4);
    }

    @Override
    public int lIlllIlllIIIIlIIlllIllIII(class_1843 class_18432, int n, int n2, int n3, int n4) {
        boolean bl;
        if (!this.llllllIlIllllIlIlIlIIIIlI) {
            return 0;
        }
        int n5 = class_18432.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        if (n5 == 0) {
            return 0;
        }
        if (n4 == 1) {
            return n5;
        }
        boolean bl2 = class_1640.IIIllIIlIIIIIIlIlIIllIIlI(class_18432, n - 1, n2, n3, 1) || !class_18432.a_(n - 1, n2, n3).IIIllIllIIlIlIlIlIllllIIl() && class_1640.IIIllIIlIIIIIIlIlIIllIIlI(class_18432, n - 1, n2 - 1, n3, -1);
        boolean bl3 = class_1640.IIIllIIlIIIIIIlIlIIllIIlI(class_18432, n + 1, n2, n3, 3) || !class_18432.a_(n + 1, n2, n3).IIIllIllIIlIlIlIlIllllIIl() && class_1640.IIIllIIlIIIIIIlIlIIllIIlI(class_18432, n + 1, n2 - 1, n3, -1);
        boolean bl4 = class_1640.IIIllIIlIIIIIIlIlIIllIIlI(class_18432, n, n2, n3 - 1, 2) || !class_18432.a_(n, n2, n3 - 1).IIIllIllIIlIlIlIlIllllIIl() && class_1640.IIIllIIlIIIIIIlIlIIllIIlI(class_18432, n, n2 - 1, n3 - 1, -1);
        boolean bl5 = bl = class_1640.IIIllIIlIIIIIIlIlIIllIIlI(class_18432, n, n2, n3 + 1, 0) || !class_18432.a_(n, n2, n3 + 1).IIIllIllIIlIlIlIlIllllIIl() && class_1640.IIIllIIlIIIIIIlIlIIllIIlI(class_18432, n, n2 - 1, n3 + 1, -1);
        if (!class_18432.a_(n, n2 + 1, n3).IIIllIllIIlIlIlIlIllllIIl()) {
            if (class_18432.a_(n - 1, n2, n3).IIIllIllIIlIlIlIlIllllIIl() && class_1640.IIIllIIlIIIIIIlIlIIllIIlI(class_18432, n - 1, n2 + 1, n3, -1)) {
                bl2 = true;
            }
            if (class_18432.a_(n + 1, n2, n3).IIIllIllIIlIlIlIlIllllIIl() && class_1640.IIIllIIlIIIIIIlIlIIllIIlI(class_18432, n + 1, n2 + 1, n3, -1)) {
                bl3 = true;
            }
            if (class_18432.a_(n, n2, n3 - 1).IIIllIllIIlIlIlIlIllllIIl() && class_1640.IIIllIIlIIIIIIlIlIIllIIlI(class_18432, n, n2 + 1, n3 - 1, -1)) {
                bl4 = true;
            }
            if (class_18432.a_(n, n2, n3 + 1).IIIllIllIIlIlIlIlIllllIIl() && class_1640.IIIllIIlIIIIIIlIlIIllIIlI(class_18432, n, n2 + 1, n3 + 1, -1)) {
                bl = true;
            }
        }
        return !bl4 && !bl3 && !bl2 && !bl && n4 >= 2 && n4 <= 5 ? n5 : (n4 == 2 && bl4 && !bl2 && !bl3 ? n5 : (n4 == 3 && bl && !bl2 && !bl3 ? n5 : (n4 == 4 && bl2 && !bl4 && !bl ? n5 : (n4 == 5 && bl3 && !bl4 && !bl ? n5 : 0))));
    }

    @Override
    public boolean llIllllIlIllIIIlIllIIlIlI() {
        return this.llllllIlIllllIlIlIlIIIIlI;
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_1334 class_13342, int n, int n2, int n3, Random random) {
        int n4 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        if (n4 > 0) {
            double d = (double)n + 0.5 + ((double)random.nextFloat() - 0.5) * 0.2;
            double d2 = (float)n2 + 0.0625f;
            double d3 = (double)n3 + 0.5 + ((double)random.nextFloat() - 0.5) * 0.2;
            float f = (float)n4 / 15.0f;
            float f2 = f * 0.6f + 0.4f;
            if (n4 == 0) {
                f2 = 0.0f;
            }
            float f3 = f * f * 0.7f - 0.5f;
            float f4 = f * f * 0.6f - 0.7f;
            if (f3 < 0.0f) {
                f3 = 0.0f;
            }
            if (f4 < 0.0f) {
                f4 = 0.0f;
            }
            class_13342.lllIIIllIIIIlllIlIIllIIll("reddust", d, d2, d3, (double)f2, (double)f3, f4);
        }
    }

    public static boolean lIllllIIlIIIlIllllllIIIll(class_1843 class_18432, int n, int n2, int n3, int n4) {
        Block class_05492 = class_18432.a_(n, n2, n3);
        if (class_05492 == Blocks.IlIIIlIllIIIllIIIIlIIlIll) {
            return true;
        }
        if (!Blocks.IIIlllIlIIllIIlIlIllIlIIl.IlIIIIIllllllIIlllIllllll(class_05492)) {
            return class_05492.llIllllIlIllIIIlIllIIlIlI() && n4 != -1;
        }
        int n5 = class_18432.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        return n4 == (n5 & 3) || n4 == class_1632.lIllllIIlIIIlIllllllIIIll[n5 & 3];
    }

    public static boolean IIIllIIlIIIIIIlIlIIllIIlI(class_1843 class_18432, int n, int n2, int n3, int n4) {
        if (class_1640.lIllllIIlIIIlIllllllIIIll(class_18432, n, n2, n3, n4)) {
            return true;
        }
        if (class_18432.a_(n, n2, n3) == Blocks.llllIIIlIlIlIlIIlIIIIIlIl) {
            int n5 = class_18432.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
            return n4 == (n5 & 3);
        }
        return false;
    }

    @Override
    public Item IIIllIIlIIIIIIlIlIIllIIlI(class_1334 class_13342, int n, int n2, int n3) {
        return Items.lIIIlIIllIllIIlIIlIIIllII;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
        this.llIlllIIllIlllIlIlIlIIIll = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_cross");
        this.IIIIlIIlIIIllIIIIllIIIlII = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_line");
        this.lllIIIIIIlIlllIIlIlIIIllI = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_cross_overlay");
        this.llIIlIIllIIllIlIIllIIllII = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_line_overlay");
        this.llIIIIllIIIIIIIlIIIlIIIIl = this.llIlllIIllIlllIlIlIlIIIll;
    }

    public static class_2102 lIlllIlllIIIIlIIlllIllIII(String string) {
        return string.equals("cross") ? Blocks.IlIIIlIllIIIllIIIIlIIlIll.llIlllIIllIlllIlIlIlIIIll : (string.equals("line") ? Blocks.IlIIIlIllIIIllIIIIlIIlIll.IIIIlIIlIIIllIIIIllIIIlII : (string.equals("cross_overlay") ? Blocks.IlIIIlIllIIIllIIIIlIIlIll.lllIIIIIIlIlllIIlIlIIIllI : (string.equals("line_overlay") ? Blocks.IlIIIlIllIIIllIIIIlIIlIll.llIIlIIllIIllIlIIllIIllII : null)));
    }
}

