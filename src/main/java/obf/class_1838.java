package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

import java.util.Random;

public class class_1838
extends class_1174 {
    public class_1838(boolean bl) {
        super(bl);
    }

    @Override
    public boolean a_(class_1334 class_13342, Random random, int n, int n2, int n3) {
        int n4 = random.nextInt(3) + random.nextInt(3) + 5;
        boolean bl = true;
        if (n2 >= 1 && n2 + n4 + 1 <= 256) {
            int n5;
            int n6;
            int n7;
            for (int i = n2; i <= n2 + 1 + n4; ++i) {
                n7 = 1;
                if (i == n2) {
                    n7 = 0;
                }
                if (i >= n2 + 1 + n4 - 2) {
                    n7 = 2;
                }
                for (n6 = n - n7; n6 <= n + n7 && bl; ++n6) {
                    for (n5 = n3 - n7; n5 <= n3 + n7 && bl; ++n5) {
                        if (i >= 0 && i < 256) {
                            Block class_05492 = class_13342.a_(n6, i, n5);
                            if (this.lllIIIllIIIIlllIlIIllIIll(class_05492)) continue;
                            bl = false;
                            continue;
                        }
                        bl = false;
                    }
                }
            }
            if (!bl) {
                return false;
            }
            Block class_05493 = class_13342.a_(n, n2 - 1, n3);
            if ((class_05493 == Blocks.IlIllllllIIlIIllllIIlIIIl || class_05493 == Blocks.lIlllIlllIIIIlIIlllIllIII) && n2 < 256 - n4 - 1) {
                int n8;
                int n9;
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2 - 1, n3, Blocks.lIlllIlllIIIIlIIlllIllIII);
                n7 = random.nextInt(4);
                n6 = n4 - random.nextInt(4) - 1;
                n5 = 3 - random.nextInt(3);
                int n10 = n;
                int n11 = n3;
                int n12 = 0;
                for (n9 = 0; n9 < n4; ++n9) {
                    Block class_05494;
                    n8 = n2 + n9;
                    if (n9 >= n6 && n5 > 0) {
                        n10 += class_1632.lllIIIllIIIIlllIlIIllIIll[n7];
                        n11 += class_1632.lllIlIIlIIIlIlIIIllIlllIl[n7];
                        --n5;
                    }
                    if ((class_05494 = class_13342.a_(n10, n8, n11)).lIllllIIlIIIlIllllllIIIll() != class_1855.lllIIIllIIIIlllIlIIllIIll && class_05494.lIllllIIlIIIlIllllllIIIll() != class_1855.IllIIIllIIIIlIlIlIllIIlll) continue;
                    this.lllIIIllIIIIlllIlIIllIIll(class_13342, n10, n8, n11, Blocks.lIIlIIIIIlIlllIlIIlIlIlll, 0);
                    n12 = n8;
                }
                for (n9 = -1; n9 <= 1; ++n9) {
                    for (n8 = -1; n8 <= 1; ++n8) {
                        this.lllIIIllIIIIlllIlIIllIIll(class_13342, n10 + n9, n12 + 1, n11 + n8);
                    }
                }
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, n10 + 2, n12 + 1, n11);
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, n10 - 2, n12 + 1, n11);
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, n10, n12 + 1, n11 + 2);
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, n10, n12 + 1, n11 - 2);
                for (n9 = -3; n9 <= 3; ++n9) {
                    for (n8 = -3; n8 <= 3; ++n8) {
                        if (Math.abs(n9) == 3 && Math.abs(n8) == 3) continue;
                        this.lllIIIllIIIIlllIlIIllIIll(class_13342, n10 + n9, n12, n11 + n8);
                    }
                }
                n10 = n;
                n11 = n3;
                n9 = random.nextInt(4);
                if (n9 != n7) {
                    int n13;
                    int n14;
                    n8 = n6 - random.nextInt(2) - 1;
                    int n15 = 1 + random.nextInt(3);
                    n12 = 0;
                    for (n14 = n8; n14 < n4 && n15 > 0; ++n14, --n15) {
                        Block class_05495;
                        if (n14 < 1 || (class_05495 = class_13342.a_(n10 += class_1632.lllIIIllIIIIlllIlIIllIIll[n9], n13 = n2 + n14, n11 += class_1632.lllIlIIlIIIlIlIIIllIlllIl[n9])).lIllllIIlIIIlIllllllIIIll() != class_1855.lllIIIllIIIIlllIlIIllIIll && class_05495.lIllllIIlIIIlIllllllIIIll() != class_1855.IllIIIllIIIIlIlIlIllIIlll) continue;
                        this.lllIIIllIIIIlllIlIIllIIll(class_13342, n10, n13, n11, Blocks.lIIlIIIIIlIlllIlIIlIlIlll, 0);
                        n12 = n13;
                    }
                    if (n12 > 0) {
                        for (n14 = -1; n14 <= 1; ++n14) {
                            for (n13 = -1; n13 <= 1; ++n13) {
                                this.lllIIIllIIIIlllIlIIllIIll(class_13342, n10 + n14, n12 + 1, n11 + n13);
                            }
                        }
                        for (n14 = -2; n14 <= 2; ++n14) {
                            for (n13 = -2; n13 <= 2; ++n13) {
                                if (Math.abs(n14) == 2 && Math.abs(n13) == 2) continue;
                                this.lllIIIllIIIIlllIlIIllIIll(class_13342, n10 + n14, n12, n11 + n13);
                            }
                        }
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    private void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3) {
        Block class_05492 = class_13342.a_(n, n2, n3);
        if (class_05492.lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll || class_05492.lIllllIIlIIIlIllllllIIIll() == class_1855.IllIIIllIIIIlIlIlIllIIlll) {
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, Blocks.IlIIIlIIIIllIIIllIIIIIIll, 0);
        }
    }
}

