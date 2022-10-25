package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

import java.util.Random;

public class class_1075
extends class_1174 {
    public class_1075() {
        super(false);
    }

    @Override
    public boolean a_(class_1334 class_13342, Random random, int n, int n2, int n3) {
        int n4 = random.nextInt(4) + 5;
        while (class_13342.a_(n, n2 - 1, n3).lIllllIIlIIIlIllllllIIIll() == class_1855.IllIIlllllllIIlIIlIIIIlIl) {
            --n2;
        }
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
                    n7 = 3;
                }
                for (n6 = n - n7; n6 <= n + n7 && bl; ++n6) {
                    for (n5 = n3 - n7; n5 <= n3 + n7 && bl; ++n5) {
                        if (i >= 0 && i < 256) {
                            Block class_05492 = class_13342.a_(n6, i, n5);
                            if (class_05492.lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll || class_05492.lIllllIIlIIIlIllllllIIIll() == class_1855.IllIIIllIIIIlIlIlIllIIlll) continue;
                            if (class_05492 != Blocks.IllIIIllIIIIlIlIlIllIIlll && class_05492 != Blocks.IIIllIllIIlIlIlIlIllllIIl) {
                                bl = false;
                                continue;
                            }
                            if (i <= n2) continue;
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
                for (n9 = n2 - 3 + n4; n9 <= n2 + n4; ++n9) {
                    n6 = n9 - (n2 + n4);
                    n5 = 2 - n6 / 2;
                    for (n8 = n - n5; n8 <= n + n5; ++n8) {
                        n7 = n8 - n;
                        for (int i = n3 - n5; i <= n3 + n5; ++i) {
                            int n10 = i - n3;
                            if (Math.abs(n7) == n5 && Math.abs(n10) == n5 && (random.nextInt(2) == 0 || n6 == 0) || class_13342.a_(n8, n9, i).lllIIIllIIIIlllIlIIllIIll()) continue;
                            this.lllIIIllIIIIlllIlIIllIIll(class_13342, n8, n9, i, Blocks.lIlIlIIlIIIIlIIIIIlllIIII);
                        }
                    }
                }
                for (n9 = 0; n9 < n4; ++n9) {
                    Block class_05494 = class_13342.a_(n, n2 + n9, n3);
                    if (class_05494.lIllllIIlIIIlIllllllIIIll() != class_1855.lllIIIllIIIIlllIlIIllIIll && class_05494.lIllllIIlIIIlIllllllIIIll() != class_1855.IllIIIllIIIIlIlIlIllIIlll && class_05494 != Blocks.IIIllIllIIlIlIlIlIllllIIl && class_05494 != Blocks.IllIIIllIIIIlIlIlIllIIlll) continue;
                    this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2 + n9, n3, Blocks.log);
                }
                for (n9 = n2 - 3 + n4; n9 <= n2 + n4; ++n9) {
                    n6 = n9 - (n2 + n4);
                    n5 = 2 - n6 / 2;
                    for (n8 = n - n5; n8 <= n + n5; ++n8) {
                        for (n7 = n3 - n5; n7 <= n3 + n5; ++n7) {
                            if (class_13342.a_(n8, n9, n7).lIllllIIlIIIlIllllllIIIll() != class_1855.IllIIIllIIIIlIlIlIllIIlll) continue;
                            if (random.nextInt(4) == 0 && class_13342.a_(n8 - 1, n9, n7).lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll) {
                                this.lllIIIllIIIIlllIlIIllIIll(class_13342, n8 - 1, n9, n7, 8);
                            }
                            if (random.nextInt(4) == 0 && class_13342.a_(n8 + 1, n9, n7).lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll) {
                                this.lllIIIllIIIIlllIlIIllIIll(class_13342, n8 + 1, n9, n7, 2);
                            }
                            if (random.nextInt(4) == 0 && class_13342.a_(n8, n9, n7 - 1).lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll) {
                                this.lllIIIllIIIIlllIlIIllIIll(class_13342, n8, n9, n7 - 1, 1);
                            }
                            if (random.nextInt(4) != 0 || class_13342.a_(n8, n9, n7 + 1).lIllllIIlIIIlIllllllIIIll() != class_1855.lllIIIllIIIIlllIlIIllIIll) continue;
                            this.lllIIIllIIIIlllIlIIllIIll(class_13342, n8, n9, n7 + 1, 4);
                        }
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    private void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, int n4) {
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, Blocks.lIIlIlllIIlIIIIlIlIIIIlll, n4);
        int n5 = 4;
        while (class_13342.a_(n, --n2, n3).lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll && n5 > 0) {
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, Blocks.lIIlIlllIIlIIIIlIlIIIIlll, n4);
            --n5;
        }
        return;
    }
}

