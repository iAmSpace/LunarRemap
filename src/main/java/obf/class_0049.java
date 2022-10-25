package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

import java.util.Random;

public class class_0049
extends class_1067 {
    private int lllIIIllIIIIlllIlIIllIIll = -1;

    public class_0049(int n) {
        super(true);
        this.lllIIIllIIIIlllIlIIllIIll = n;
    }

    public class_0049() {
        super(false);
    }

    @Override
    public boolean a_(class_1334 class_13342, Random random, int n, int n2, int n3) {
        int n4 = random.nextInt(2);
        if (this.lllIIIllIIIIlllIlIIllIIll >= 0) {
            n4 = this.lllIIIllIIIIlllIlIIllIIll;
        }
        int n5 = random.nextInt(3) + 4;
        boolean bl = true;
        if (n2 >= 1 && n2 + n5 + 1 < 256) {
            int n6;
            int n7;
            int n8;
            for (int i = n2; i <= n2 + 1 + n5; ++i) {
                n8 = 3;
                if (i <= n2 + 3) {
                    n8 = 0;
                }
                for (n7 = n - n8; n7 <= n + n8 && bl; ++n7) {
                    for (n6 = n3 - n8; n6 <= n3 + n8 && bl; ++n6) {
                        if (i >= 0 && i < 256) {
                            Block class_05492 = class_13342.a_(n7, i, n6);
                            if (class_05492.lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll || class_05492.lIllllIIlIIIlIllllllIIIll() == class_1855.IllIIIllIIIIlIlIlIllIIlll) continue;
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
            if (class_05493 != Blocks.lIlllIlllIIIIlIIlllIllIII && class_05493 != Blocks.IlIllllllIIlIIllllIIlIIIl && class_05493 != Blocks.lIIIlllIlIIIlIllIIIlIllll) {
                return false;
            }
            n8 = n2 + n5;
            if (n4 == 1) {
                n8 = n2 + n5 - 3;
            }
            for (n7 = n8; n7 <= n2 + n5; ++n7) {
                n6 = 1;
                if (n7 < n2 + n5) {
                    ++n6;
                }
                if (n4 == 0) {
                    n6 = 3;
                }
                for (int i = n - n6; i <= n + n6; ++i) {
                    for (int j = n3 - n6; j <= n3 + n6; ++j) {
                        int n9 = 5;
                        if (i == n - n6) {
                            --n9;
                        }
                        if (i == n + n6) {
                            ++n9;
                        }
                        if (j == n3 - n6) {
                            n9 -= 3;
                        }
                        if (j == n3 + n6) {
                            n9 += 3;
                        }
                        if (n4 == 0 || n7 < n2 + n5) {
                            if ((i == n - n6 || i == n + n6) && (j == n3 - n6 || j == n3 + n6)) continue;
                            if (i == n - (n6 - 1) && j == n3 - n6) {
                                n9 = 1;
                            }
                            if (i == n - n6 && j == n3 - (n6 - 1)) {
                                n9 = 1;
                            }
                            if (i == n + (n6 - 1) && j == n3 - n6) {
                                n9 = 3;
                            }
                            if (i == n + n6 && j == n3 - (n6 - 1)) {
                                n9 = 3;
                            }
                            if (i == n - (n6 - 1) && j == n3 + n6) {
                                n9 = 7;
                            }
                            if (i == n - n6 && j == n3 + (n6 - 1)) {
                                n9 = 7;
                            }
                            if (i == n + (n6 - 1) && j == n3 + n6) {
                                n9 = 9;
                            }
                            if (i == n + n6 && j == n3 + (n6 - 1)) {
                                n9 = 9;
                            }
                        }
                        if (n9 == 5 && n7 < n2 + n5) {
                            n9 = 0;
                        }
                        if (n9 == 0 && n2 < n2 + n5 - 1 || class_13342.a_(i, n7, j).lllIIIllIIIIlllIlIIllIIll()) continue;
                        this.lllIIIllIIIIlllIlIIllIIll(class_13342, i, n7, j, Block.lllIIIllIIIIlllIlIIllIIll(Block.lllIIIllIIIIlllIlIIllIIll(Blocks.lIIllIlIllIlIlIIlIlIIIIll) + n4), n9);
                    }
                }
            }
            for (n7 = 0; n7 < n5; ++n7) {
                Block class_05494 = class_13342.a_(n, n2 + n7, n3);
                if (class_05494.lllIIIllIIIIlllIlIIllIIll()) continue;
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2 + n7, n3, Block.lllIIIllIIIIlllIlIIllIIll(Block.lllIIIllIIIIlllIlIIllIIll(Blocks.lIIllIlIllIlIlIIlIlIIIIll) + n4), 10);
            }
            return true;
        }
        return false;
    }
}

