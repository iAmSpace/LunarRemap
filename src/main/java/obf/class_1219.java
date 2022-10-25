package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

import java.util.Random;

public class class_1219
extends class_1174 {
    private final int lllIIIllIIIIlllIlIIllIIll;
    private final boolean lllIlIIlIIIlIlIIIllIlllIl;
    private final int IlIllllllIIlIIllllIIlIIIl;
    private final int lIlllIlllIIIIlIIlllIllIII;

    public class_1219(boolean bl) {
        this(bl, 4, 0, 0, false);
    }

    public class_1219(boolean bl, int n, int n2, int n3, boolean bl2) {
        super(bl);
        this.lllIIIllIIIIlllIlIIllIIll = n;
        this.IlIllllllIIlIIllllIIlIIIl = n2;
        this.lIlllIlllIIIIlIIlllIllIII = n3;
        this.lllIlIIlIIIlIlIIIllIlllIl = bl2;
    }

    @Override
    public boolean a_(class_1334 class_13342, Random random, int n, int n2, int n3) {
        int n4 = random.nextInt(3) + this.lllIIIllIIIIlllIlIIllIIll;
        boolean bl = true;
        if (n2 >= 1 && n2 + n4 + 1 <= 256) {
            Block class_05492;
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
                            class_05492 = class_13342.a_(n6, i, n5);
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
            if ((class_05493 == Blocks.IlIllllllIIlIIllllIIlIIIl || class_05493 == Blocks.lIlllIlllIIIIlIIlllIllIII || class_05493 == Blocks.IIIlIlIllIlllllIlIllllllI) && n2 < 256 - n4 - 1) {
                int n8;
                int n9;
                int n10;
                int n11;
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2 - 1, n3, Blocks.lIlllIlllIIIIlIIlllIllIII);
                n7 = 3;
                n6 = 0;
                for (n5 = n2 - n7 + n4; n5 <= n2 + n4; ++n5) {
                    n11 = n5 - (n2 + n4);
                    n10 = n6 + 1 - n11 / 2;
                    for (n9 = n - n10; n9 <= n + n10; ++n9) {
                        n8 = n9 - n;
                        for (int i = n3 - n10; i <= n3 + n10; ++i) {
                            Block class_05494;
                            int n12 = i - n3;
                            if (Math.abs(n8) == n10 && Math.abs(n12) == n10 && (random.nextInt(2) == 0 || n11 == 0) || (class_05494 = class_13342.a_(n9, n5, i)).lIllllIIlIIIlIllllllIIIll() != class_1855.lllIIIllIIIIlllIlIIllIIll && class_05494.lIllllIIlIIIlIllllllIIIll() != class_1855.IllIIIllIIIIlIlIlIllIIlll) continue;
                            this.lllIIIllIIIIlllIlIIllIIll(class_13342, n9, n5, i, Blocks.lIlIlIIlIIIIlIIIIIlllIIII, this.lIlllIlllIIIIlIIlllIllIII);
                        }
                    }
                }
                for (n5 = 0; n5 < n4; ++n5) {
                    class_05492 = class_13342.a_(n, n2 + n5, n3);
                    if (class_05492.lIllllIIlIIIlIllllllIIIll() != class_1855.lllIIIllIIIIlllIlIIllIIll && class_05492.lIllllIIlIIIlIllllllIIIll() != class_1855.IllIIIllIIIIlIlIlIllIIlll) continue;
                    this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2 + n5, n3, Blocks.log, this.IlIllllllIIlIIllllIIlIIIl);
                    if (!this.lllIlIIlIIIlIlIIIllIlllIl || n5 <= 0) continue;
                    if (random.nextInt(3) > 0 && class_13342.lIlllIlllIIIIlIIlllIllIII(n - 1, n2 + n5, n3)) {
                        this.lllIIIllIIIIlllIlIIllIIll(class_13342, n - 1, n2 + n5, n3, Blocks.lIIlIlllIIlIIIIlIlIIIIlll, 8);
                    }
                    if (random.nextInt(3) > 0 && class_13342.lIlllIlllIIIIlIIlllIllIII(n + 1, n2 + n5, n3)) {
                        this.lllIIIllIIIIlllIlIIllIIll(class_13342, n + 1, n2 + n5, n3, Blocks.lIIlIlllIIlIIIIlIlIIIIlll, 2);
                    }
                    if (random.nextInt(3) > 0 && class_13342.lIlllIlllIIIIlIIlllIllIII(n, n2 + n5, n3 - 1)) {
                        this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2 + n5, n3 - 1, Blocks.lIIlIlllIIlIIIIlIlIIIIlll, 1);
                    }
                    if (random.nextInt(3) <= 0 || !class_13342.lIlllIlllIIIIlIIlllIllIII(n, n2 + n5, n3 + 1)) continue;
                    this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2 + n5, n3 + 1, Blocks.lIIlIlllIIlIIIIlIlIIIIlll, 4);
                }
                if (this.lllIlIIlIIIlIlIIIllIlllIl) {
                    for (n5 = n2 - 3 + n4; n5 <= n2 + n4; ++n5) {
                        n11 = n5 - (n2 + n4);
                        n10 = 2 - n11 / 2;
                        for (n9 = n - n10; n9 <= n + n10; ++n9) {
                            for (n8 = n3 - n10; n8 <= n3 + n10; ++n8) {
                                if (class_13342.a_(n9, n5, n8).lIllllIIlIIIlIllllllIIIll() != class_1855.IllIIIllIIIIlIlIlIllIIlll) continue;
                                if (random.nextInt(4) == 0 && class_13342.a_(n9 - 1, n5, n8).lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll) {
                                    this.lllIIIllIIIIlllIlIIllIIll(class_13342, n9 - 1, n5, n8, 8);
                                }
                                if (random.nextInt(4) == 0 && class_13342.a_(n9 + 1, n5, n8).lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll) {
                                    this.lllIIIllIIIIlllIlIIllIIll(class_13342, n9 + 1, n5, n8, 2);
                                }
                                if (random.nextInt(4) == 0 && class_13342.a_(n9, n5, n8 - 1).lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll) {
                                    this.lllIIIllIIIIlllIlIIllIIll(class_13342, n9, n5, n8 - 1, 1);
                                }
                                if (random.nextInt(4) != 0 || class_13342.a_(n9, n5, n8 + 1).lIllllIIlIIIlIllllllIIIll() != class_1855.lllIIIllIIIIlllIlIIllIIll) continue;
                                this.lllIIIllIIIIlllIlIIllIIll(class_13342, n9, n5, n8 + 1, 4);
                            }
                        }
                    }
                    if (random.nextInt(5) == 0 && n4 > 5) {
                        for (n5 = 0; n5 < 2; ++n5) {
                            for (n11 = 0; n11 < 4; ++n11) {
                                if (random.nextInt(4 - n5) != 0) continue;
                                n10 = random.nextInt(3);
                                this.lllIIIllIIIIlllIlIIllIIll(class_13342, n + class_1632.lllIIIllIIIIlllIlIIllIIll[class_1632.lIllllIIlIIIlIllllllIIIll[n11]], n2 + n4 - 5 + n5, n3 + class_1632.lllIlIIlIIIlIlIIIllIlllIl[class_1632.lIllllIIlIIIlIllllllIIIll[n11]], Blocks.lIIlIIIlIlIIlllIlIllIllIl, n10 << 2 | n11);
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

