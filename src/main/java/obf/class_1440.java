package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

import java.util.Random;

public class class_1440
extends class_1174 {
    public class_1440(boolean bl) {
        super(bl);
    }

    @Override
    public boolean a_(class_1334 class_13342, Random random, int n, int n2, int n3) {
        int n4 = random.nextInt(3) + random.nextInt(2) + 6;
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
                int n10;
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2 - 1, n3, Blocks.lIlllIlllIIIIlIIlllIllIII);
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, n + 1, n2 - 1, n3, Blocks.lIlllIlllIIIIlIIlllIllIII);
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, n + 1, n2 - 1, n3 + 1, Blocks.lIlllIlllIIIIlIIlllIllIII);
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2 - 1, n3 + 1, Blocks.lIlllIlllIIIIlIIlllIllIII);
                n7 = random.nextInt(4);
                n6 = n4 - random.nextInt(4);
                n5 = 2 - random.nextInt(3);
                int n11 = n;
                int n12 = n3;
                int n13 = 0;
                for (n10 = 0; n10 < n4; ++n10) {
                    Block class_05494;
                    n9 = n2 + n10;
                    if (n10 >= n6 && n5 > 0) {
                        n11 += class_1632.lllIIIllIIIIlllIlIIllIIll[n7];
                        n12 += class_1632.lllIlIIlIIIlIlIIIllIlllIl[n7];
                        --n5;
                    }
                    if ((class_05494 = class_13342.a_(n11, n9, n12)).lIllllIIlIIIlIllllllIIIll() != class_1855.lllIIIllIIIIlllIlIIllIIll && class_05494.lIllllIIlIIIlIllllllIIIll() != class_1855.IllIIIllIIIIlIlIlIllIIlll) continue;
                    this.lllIIIllIIIIlllIlIIllIIll(class_13342, n11, n9, n12, Blocks.lIIlIIIIIlIlllIlIIlIlIlll, 1);
                    this.lllIIIllIIIIlllIlIIllIIll(class_13342, n11 + 1, n9, n12, Blocks.lIIlIIIIIlIlllIlIIlIlIlll, 1);
                    this.lllIIIllIIIIlllIlIIllIIll(class_13342, n11, n9, n12 + 1, Blocks.lIIlIIIIIlIlllIlIIlIlIlll, 1);
                    this.lllIIIllIIIIlllIlIIllIIll(class_13342, n11 + 1, n9, n12 + 1, Blocks.lIIlIIIIIlIlllIlIIlIlIlll, 1);
                    n13 = n9;
                }
                for (n10 = -2; n10 <= 0; ++n10) {
                    for (n9 = -2; n9 <= 0; ++n9) {
                        int n14 = -1;
                        this.lllIIIllIIIIlllIlIIllIIll(class_13342, n11 + n10, n13 + n14, n12 + n9);
                        this.lllIIIllIIIIlllIlIIllIIll(class_13342, 1 + n11 - n10, n13 + n14, n12 + n9);
                        this.lllIIIllIIIIlllIlIIllIIll(class_13342, n11 + n10, n13 + n14, 1 + n12 - n9);
                        this.lllIIIllIIIIlllIlIIllIIll(class_13342, 1 + n11 - n10, n13 + n14, 1 + n12 - n9);
                        if (n10 <= -2 && n9 <= -1 || n10 == -1 && n9 == -2) continue;
                        n8 = 1;
                        this.lllIIIllIIIIlllIlIIllIIll(class_13342, n11 + n10, n13 + n8, n12 + n9);
                        this.lllIIIllIIIIlllIlIIllIIll(class_13342, 1 + n11 - n10, n13 + n8, n12 + n9);
                        this.lllIIIllIIIIlllIlIIllIIll(class_13342, n11 + n10, n13 + n8, 1 + n12 - n9);
                        this.lllIIIllIIIIlllIlIIllIIll(class_13342, 1 + n11 - n10, n13 + n8, 1 + n12 - n9);
                    }
                }
                if (random.nextBoolean()) {
                    this.lllIIIllIIIIlllIlIIllIIll(class_13342, n11, n13 + 2, n12);
                    this.lllIIIllIIIIlllIlIIllIIll(class_13342, n11 + 1, n13 + 2, n12);
                    this.lllIIIllIIIIlllIlIIllIIll(class_13342, n11 + 1, n13 + 2, n12 + 1);
                    this.lllIIIllIIIIlllIlIIllIIll(class_13342, n11, n13 + 2, n12 + 1);
                }
                for (n10 = -3; n10 <= 4; ++n10) {
                    for (n9 = -3; n9 <= 4; ++n9) {
                        if (n10 == -3 && n9 == -3 || n10 == -3 && n9 == 4 || n10 == 4 && n9 == -3 || n10 == 4 && n9 == 4 || Math.abs(n10) >= 3 && Math.abs(n9) >= 3) continue;
                        this.lllIIIllIIIIlllIlIIllIIll(class_13342, n11 + n10, n13, n12 + n9);
                    }
                }
                for (n10 = -1; n10 <= 2; ++n10) {
                    for (n9 = -1; n9 <= 2; ++n9) {
                        int n15;
                        if (n10 >= 0 && n10 <= 1 && n9 >= 0 && n9 <= 1 || random.nextInt(3) > 0) continue;
                        int n16 = random.nextInt(3) + 2;
                        for (n8 = 0; n8 < n16; ++n8) {
                            this.lllIIIllIIIIlllIlIIllIIll(class_13342, n + n10, n13 - n8 - 1, n3 + n9, Blocks.lIIlIIIIIlIlllIlIIlIlIlll, 1);
                        }
                        for (n8 = -1; n8 <= 1; ++n8) {
                            for (n15 = -1; n15 <= 1; ++n15) {
                                this.lllIIIllIIIIlllIlIIllIIll(class_13342, n11 + n10 + n8, n13 - 0, n12 + n9 + n15);
                            }
                        }
                        for (n8 = -2; n8 <= 2; ++n8) {
                            for (n15 = -2; n15 <= 2; ++n15) {
                                if (Math.abs(n8) == 2 && Math.abs(n15) == 2) continue;
                                this.lllIIIllIIIIlllIlIIllIIll(class_13342, n11 + n10 + n8, n13 - 1, n12 + n9 + n15);
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
        if (class_05492.lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll) {
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, Blocks.IlIIIlIIIIllIIIllIIIIIIll, 1);
        }
    }
}

