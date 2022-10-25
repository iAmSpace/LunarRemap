package net.minecraft.block;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.init.Blocks;
import obf.*;

import java.util.Random;

public class BlockFire
extends Block {
    private int[] llllllIlIllllIlIlIlIIIIlI = new int[256];
    private int[] lIlIIllllIlIIIIllIIIIlIIl = new int[256];
    private IIcon[] llIlllIIllIlllIlIlIlIIIll;

    protected BlockFire() {
        super(class_1855.IlIlllIIIIIIlIIllIIllIlll);
        this.lllIIIllIIIIlllIlIIllIIll(true);
    }

    public static void func_149843_e() {
        Blocks.lIIlIlllIllIlIlllIIIIIIII.lllIIIllIIIIlllIlIIllIIll(BlockFire.lllIIIllIIIIlllIlIIllIIll(Blocks.lIllllIIlIIIlIllllllIIIll), 5, 20);
        Blocks.lIIlIlllIllIlIlllIIIIIIII.lllIIIllIIIIlllIlIIllIIll(BlockFire.lllIIIllIIIIlllIlIIllIIll(Blocks.lllIIIlllIlllIIlIllllIIlI), 5, 20);
        Blocks.lIIlIlllIllIlIlllIIIIIIII.lllIIIllIIIIlllIlIIllIIll(BlockFire.lllIIIllIIIIlllIlIIllIIll(Blocks.lIIlIlllIIlllIIlllIIlIlII), 5, 20);
        Blocks.lIIlIlllIllIlIlllIIIIIIII.lllIIIllIIIIlllIlIIllIIll(BlockFire.lllIIIllIIIIlllIlIIllIIll(Blocks.lIlIIIllIIllIIlIllllllIll), 5, 20);
        Blocks.lIIlIlllIllIlIlllIIIIIIII.lllIIIllIIIIlllIlIIllIIll(BlockFire.lllIIIllIIIIlllIlIIllIIll(Blocks.IllllIIlIIIllIlllIlllIllI), 5, 20);
        Blocks.lIIlIlllIllIlIlllIIIIIIII.lllIIIllIIIIlllIlIIllIIll(BlockFire.lllIIIllIIIIlllIlIIllIIll(Blocks.IIlllllIIlIIlIlIIlIIlIlII), 5, 20);
        Blocks.lIIlIlllIllIlIlllIIIIIIII.lllIIIllIIIIlllIlIIllIIll(BlockFire.lllIIIllIIIIlllIlIIllIIll(Blocks.lIlIllllIlIIIIIllIIIIlIlI), 5, 20);
        Blocks.lIIlIlllIllIlIlllIIIIIIII.lllIIIllIIIIlllIlIIllIIll(BlockFire.lllIIIllIIIIlllIlIIllIIll(Blocks.IIlIlIIIIlIlllIlIlIIIIIlI), 5, 20);
        Blocks.lIIlIlllIllIlIlllIIIIIIII.lllIIIllIIIIlllIlIIllIIll(BlockFire.lllIIIllIIIIlllIlIIllIIll(Blocks.log), 5, 5);
        Blocks.lIIlIlllIllIlIlllIIIIIIII.lllIIIllIIIIlllIlIIllIIll(BlockFire.lllIIIllIIIIlllIlIIllIIll(Blocks.lIIlIIIIIlIlllIlIIlIlIlll), 5, 5);
        Blocks.lIIlIlllIllIlIlllIIIIIIII.lllIIIllIIIIlllIlIIllIIll(BlockFire.lllIIIllIIIIlllIlIIllIIll(Blocks.lIlIlIIlIIIIlIIIIIlllIIII), 30, 60);
        Blocks.lIIlIlllIllIlIlllIIIIIIII.lllIIIllIIIIlllIlIIllIIll(BlockFire.lllIIIllIIIIlllIlIIllIIll(Blocks.IlIIIlIIIIllIIIllIIIIIIll), 30, 60);
        Blocks.lIIlIlllIllIlIlllIIIIIIII.lllIIIllIIIIlllIlIIllIIll(BlockFire.lllIIIllIIIIlllIlIIllIIll(Blocks.bookshelf), 30, 20);
        Blocks.lIIlIlllIllIlIlllIIIIIIII.lllIIIllIIIIlllIlIIllIIll(BlockFire.lllIIIllIIIIlllIlIIllIIll(Blocks.tnt), 15, 100);
        Blocks.lIIlIlllIllIlIlllIIIIIIII.lllIIIllIIIIlllIlIIllIIll(BlockFire.lllIIIllIIIIlllIlIIllIIll(Blocks.IlIlIIlllIllllllllIIIlIlI), 60, 100);
        Blocks.lIIlIlllIllIlIlllIIIIIIII.lllIIIllIIIIlllIlIIllIIll(BlockFire.lllIIIllIIIIlllIlIIllIIll(Blocks.IIIlIlIIlIIlIlIIIIIlIlIlI), 60, 100);
        Blocks.lIIlIlllIllIlIlllIIIIIIII.lllIIIllIIIIlllIlIIllIIll(BlockFire.lllIIIllIIIIlllIlIIllIIll(Blocks.llIlllIIllIlllIlIlIlIIIll), 60, 100);
        Blocks.lIIlIlllIllIlIlllIIIIIIII.lllIIIllIIIIlllIlIIllIIll(BlockFire.lllIIIllIIIIlllIlIIllIIll(Blocks.IIIIlIIlIIIllIIIIllIIIlII), 60, 100);
        Blocks.lIIlIlllIllIlIlllIIIIIIII.lllIIIllIIIIlllIlIIllIIll(BlockFire.lllIIIllIIIIlllIlIIllIIll(Blocks.llllllIlIllllIlIlIlIIIIlI), 30, 60);
        Blocks.lIIlIlllIllIlIlllIIIIIIII.lllIIIllIIIIlllIlIIllIIll(BlockFire.lllIIIllIIIIlllIlIIllIIll(Blocks.lIIlIlllIIlIIIIlIlIIIIlll), 15, 100);
        Blocks.lIIlIlllIllIlIlllIIIIIIII.lllIIIllIIIIlllIlIIllIIll(BlockFire.lllIIIllIIIIlllIlIIllIIll(Blocks.IllIIlIIlIIIIlIlIlIIlIlIl), 5, 5);
        Blocks.lIIlIlllIllIlIlllIIIIIIII.lllIIIllIIIIlllIlIIllIIll(BlockFire.lllIIIllIIIIlllIlIIllIIll(Blocks.lIlIllIIIlIlIlIlIIIllllll), 60, 20);
        Blocks.lIIlIlllIllIlIlllIIIIIIII.lllIIIllIIIIlllIlIIllIIll(BlockFire.lllIIIllIIIIlllIlIIllIIll(Blocks.IllIIIIIllIIlllIlIIIlIlll), 60, 20);
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        this.llllllIlIllllIlIlIlIIIIlI[n] = n2;
        this.lIlIIllllIlIIIIllIIIIlIIl[n] = n3;
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
        return 3;
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(Random random) {
        return 0;
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342) {
        return 30;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Random random) {
        if (class_13342.IlIIlllllIIlIlIlllllIllll().lllIlIIlIIIlIlIIIllIlllIl("doFireTick")) {
            boolean bl;
            boolean bl2 = bl = class_13342.a_(n, n2 - 1, n3) == Blocks.lllllllIlIIlIlIIIlIlIIlll;
            if (class_13342.IlIlIIlllIIlIllIIIlllllIl instanceof class_1863 && class_13342.a_(n, n2 - 1, n3) == Blocks.IllIIlllllllIIlIIlIIIIlIl) {
                bl = true;
            }
            if (!this.IlIIIIIllllllIIlllIllllll(class_13342, n, n2, n3)) {
                class_13342.lIllllIIlIIIlIllllllIIIll(n, n2, n3);
            }
            if (!bl && class_13342.IIIIIIIIlIllIIllIIlllIllI() && (class_13342.IIlllIlIlllIllIIIlllIIlIl(n, n2, n3) || class_13342.IIlllIlIlllIllIIIlllIIlIl(n - 1, n2, n3) || class_13342.IIlllIlIlllIllIIIlllIIlIl(n + 1, n2, n3) || class_13342.IIlllIlIlllIllIIIlllIIlIl(n, n2, n3 - 1) || class_13342.IIlllIlIlllIllIIIlllIIlIl(n, n2, n3 + 1))) {
                class_13342.lIllllIIlIIIlIllllllIIIll(n, n2, n3);
            } else {
                int n4 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
                if (n4 < 15) {
                    class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n4 + random.nextInt(3) / 2, 4);
                }
                class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3, this, this.lllIIIllIIIIlllIlIIllIIll(class_13342) + random.nextInt(10));
                if (!bl && !this.IllIIIllIIIIlIlIlIllIIlll(class_13342, n, n2, n3)) {
                    if (!class_1334.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2 - 1, n3) || n4 > 3) {
                        class_13342.lIllllIIlIIIlIllllllIIIll(n, n2, n3);
                    }
                } else if (!bl && !this.IlIIIIIllllllIIlllIllllll((class_1843)class_13342, n, n2 - 1, n3) && n4 == 15 && random.nextInt(4) == 0) {
                    class_13342.lIllllIIlIIIlIllllllIIIll(n, n2, n3);
                } else {
                    boolean bl3 = class_13342.lIlIllIIlIIlIIlIIlIIlIIll(n, n2, n3);
                    int n5 = 0;
                    if (bl3) {
                        n5 = -50;
                    }
                    this.lllIIIllIIIIlllIlIIllIIll(class_13342, n + 1, n2, n3, 300 + n5, random, n4);
                    this.lllIIIllIIIIlllIlIIllIIll(class_13342, n - 1, n2, n3, 300 + n5, random, n4);
                    this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2 - 1, n3, 250 + n5, random, n4);
                    this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2 + 1, n3, 250 + n5, random, n4);
                    this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3 - 1, 300 + n5, random, n4);
                    this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3 + 1, 300 + n5, random, n4);
                    for (int i = n - 1; i <= n + 1; ++i) {
                        for (int j = n3 - 1; j <= n3 + 1; ++j) {
                            for (int k = n2 - 1; k <= n2 + 4; ++k) {
                                int n6;
                                if (i == n && k == n2 && j == n3) continue;
                                int n7 = 100;
                                if (k > n2 + 1) {
                                    n7 += (k - (n2 + 1)) * 100;
                                }
                                if ((n6 = this.lIIIIlIlIIlllllIIllIIlIII(class_13342, i, k, j)) <= 0) continue;
                                int n8 = (n6 + 40 + class_13342.IlIlIIlIlIllIIlIlIIllIIIl.lllIIIllIIIIlllIlIIllIIll() * 7) / (n4 + 30);
                                if (bl3) {
                                    n8 /= 2;
                                }
                                if (n8 <= 0 || random.nextInt(n7) > n8 || class_13342.IIIIIIIIlIllIIllIIlllIllI() && class_13342.IIlllIlIlllIllIIIlllIIlIl(i, k, j) || class_13342.IIlllIlIlllIllIIIlllIIlIl(i - 1, k, n3) || class_13342.IIlllIlIlllIllIIIlllIIlIl(i + 1, k, j) || class_13342.IIlllIlIlllIllIIIlllIIlIl(i, k, j - 1) || class_13342.IIlllIlIlllIllIIIlllIIlIl(i, k, j + 1)) continue;
                                int n9 = n4 + random.nextInt(5) / 4;
                                if (n9 > 15) {
                                    n9 = 15;
                                }
                                class_13342.lllIIIllIIIIlllIlIIllIIll(i, k, j, this, n9, 3);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override
    public boolean llIIIIllIIIIIIIlIIIlIIIIl() {
        return false;
    }

    private void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, int n4, Random random, int n5) {
        int n6 = this.lIlIIllllIlIIIIllIIIIlIIl[Block.lllIIIllIIIIlllIlIIllIIll(class_13342.a_(n, n2, n3))];
        if (random.nextInt(n4) < n6) {
            boolean bl;
            boolean bl2 = bl = class_13342.a_(n, n2, n3) == Blocks.tnt;
            if (random.nextInt(n5 + 10) < 5 && !class_13342.IIlllIlIlllIllIIIlllIIlIl(n, n2, n3)) {
                int n7 = n5 + random.nextInt(5) / 4;
                if (n7 > 15) {
                    n7 = 15;
                }
                class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, this, n7, 3);
            } else {
                class_13342.lIllllIIlIIIlIllllllIIIll(n, n2, n3);
            }
            if (bl) {
                Blocks.tnt.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, 1);
            }
        }
    }

    private boolean IllIIIllIIIIlIlIlIllIIlll(class_1334 class_13342, int n, int n2, int n3) {
        return this.IlIIIIIllllllIIlllIllllll((class_1843)class_13342, n + 1, n2, n3) ? true : (this.IlIIIIIllllllIIlllIllllll((class_1843)class_13342, n - 1, n2, n3) ? true : (this.IlIIIIIllllllIIlllIllllll((class_1843)class_13342, n, n2 - 1, n3) ? true : (this.IlIIIIIllllllIIlllIllllll((class_1843)class_13342, n, n2 + 1, n3) ? true : (this.IlIIIIIllllllIIlllIllllll((class_1843)class_13342, n, n2, n3 - 1) ? true : this.IlIIIIIllllllIIlllIllllll((class_1843)class_13342, n, n2, n3 + 1)))));
    }

    private int lIIIIlIlIIlllllIIllIIlIII(class_1334 class_13342, int n, int n2, int n3) {
        int n4 = 0;
        if (!class_13342.lIlllIlllIIIIlIIlllIllIII(n, n2, n3)) {
            return 0;
        }
        int n5 = this.IIIllIIlIIIIIIlIlIIllIIlI(class_13342, n + 1, n2, n3, n4);
        n5 = this.IIIllIIlIIIIIIlIlIIllIIlI(class_13342, n - 1, n2, n3, n5);
        n5 = this.IIIllIIlIIIIIIlIlIIllIIlI(class_13342, n, n2 - 1, n3, n5);
        n5 = this.IIIllIIlIIIIIIlIlIIllIIlI(class_13342, n, n2 + 1, n3, n5);
        n5 = this.IIIllIIlIIIIIIlIlIIllIIlI(class_13342, n, n2, n3 - 1, n5);
        n5 = this.IIIllIIlIIIIIIlIlIIllIIlI(class_13342, n, n2, n3 + 1, n5);
        return n5;
    }

    @Override
    public boolean IlIlIIlIlIllIIlIlIIllIIIl() {
        return false;
    }

    public boolean IlIIIIIllllllIIlllIllllll(class_1843 class_18432, int n, int n2, int n3) {
        return this.llllllIlIllllIlIlIlIIIIlI[Block.lllIIIllIIIIlllIlIIllIIll(class_18432.a_(n, n2, n3))] > 0;
    }

    public int IIIllIIlIIIIIIlIlIIllIIlI(class_1334 class_13342, int n, int n2, int n3, int n4) {
        int n5 = this.llllllIlIllllIlIlIlIIIIlI[Block.lllIIIllIIIIlllIlIIllIIll(class_13342.a_(n, n2, n3))];
        return n5 > n4 ? n5 : n4;
    }

    @Override
    public boolean IlIIIIIllllllIIlllIllllll(class_1334 class_13342, int n, int n2, int n3) {
        return class_1334.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2 - 1, n3) || this.IllIIIllIIIIlIlIlIllIIlll(class_13342, n, n2, n3);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Block class_05492) {
        if (!class_1334.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2 - 1, n3) && !this.IllIIIllIIIIlIlIlIllIIlll(class_13342, n, n2, n3)) {
            class_13342.lIllllIIlIIIlIllllllIIIll(n, n2, n3);
        }
    }

    @Override
    public void lIlllIlllIIIIlIIlllIllIII(class_1334 class_13342, int n, int n2, int n3) {
        if (class_13342.IlIlIIlllIIlIllIIIlllllIl.IIIllIllIIlIlIlIlIllllIIl > 0 || !Blocks.IIIIIIlIIIIIIIIIIlIlIlIlI.IllIIIllIIIIlIlIlIllIIlll(class_13342, n, n2, n3)) {
            if (!class_1334.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2 - 1, n3) && !this.IllIIIllIIIIlIlIlIllIIlll(class_13342, n, n2, n3)) {
                class_13342.lIllllIIlIIIlIllllllIIIll(n, n2, n3);
            } else {
                class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3, this, this.lllIIIllIIIIlllIlIIllIIll(class_13342) + class_13342.lllllIlllIIllIlIIlIIIllII.nextInt(10));
            }
        }
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_1334 class_13342, int n, int n2, int n3, Random random) {
        block12: {
            block11: {
                float f;
                float f2;
                float f3;
                int n4;
                if (random.nextInt(24) == 0) {
                    class_13342.lllIIIllIIIIlllIlIIllIIll((double)((float)n + 0.5f), (double)((float)n2 + 0.5f), (double)((float)n3 + 0.5f), "fire.fire", 1.0f + random.nextFloat(), random.nextFloat() * 0.7f + 0.3f, false);
                }
                if (class_1334.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2 - 1, n3) || Blocks.lIIlIlllIllIlIlllIIIIIIII.IlIIIIIllllllIIlllIllllll((class_1843)class_13342, n, n2 - 1, n3)) break block11;
                if (Blocks.lIIlIlllIllIlIlllIIIIIIII.IlIIIIIllllllIIlllIllllll((class_1843)class_13342, n - 1, n2, n3)) {
                    for (n4 = 0; n4 < 2; ++n4) {
                        f3 = (float)n + random.nextFloat() * 0.1f;
                        f2 = (float)n2 + random.nextFloat();
                        f = (float)n3 + random.nextFloat();
                        class_13342.lllIIIllIIIIlllIlIIllIIll("largesmoke", (double)f3, (double)f2, (double)f, 0.0, 0.0, 0.0);
                    }
                }
                if (Blocks.lIIlIlllIllIlIlllIIIIIIII.IlIIIIIllllllIIlllIllllll((class_1843)class_13342, n + 1, n2, n3)) {
                    for (n4 = 0; n4 < 2; ++n4) {
                        f3 = (float)(n + 1) - random.nextFloat() * 0.1f;
                        f2 = (float)n2 + random.nextFloat();
                        f = (float)n3 + random.nextFloat();
                        class_13342.lllIIIllIIIIlllIlIIllIIll("largesmoke", (double)f3, (double)f2, (double)f, 0.0, 0.0, 0.0);
                    }
                }
                if (Blocks.lIIlIlllIllIlIlllIIIIIIII.IlIIIIIllllllIIlllIllllll((class_1843)class_13342, n, n2, n3 - 1)) {
                    for (n4 = 0; n4 < 2; ++n4) {
                        f3 = (float)n + random.nextFloat();
                        f2 = (float)n2 + random.nextFloat();
                        f = (float)n3 + random.nextFloat() * 0.1f;
                        class_13342.lllIIIllIIIIlllIlIIllIIll("largesmoke", (double)f3, (double)f2, (double)f, 0.0, 0.0, 0.0);
                    }
                }
                if (Blocks.lIIlIlllIllIlIlllIIIIIIII.IlIIIIIllllllIIlllIllllll((class_1843)class_13342, n, n2, n3 + 1)) {
                    for (n4 = 0; n4 < 2; ++n4) {
                        f3 = (float)n + random.nextFloat();
                        f2 = (float)n2 + random.nextFloat();
                        f = (float)(n3 + 1) - random.nextFloat() * 0.1f;
                        class_13342.lllIIIllIIIIlllIlIIllIIll("largesmoke", (double)f3, (double)f2, (double)f, 0.0, 0.0, 0.0);
                    }
                }
                if (!Blocks.lIIlIlllIllIlIlllIIIIIIII.IlIIIIIllllllIIlllIllllll((class_1843)class_13342, n, n2 + 1, n3)) break block12;
                for (n4 = 0; n4 < 2; ++n4) {
                    f3 = (float)n + random.nextFloat();
                    f2 = (float)(n2 + 1) - random.nextFloat() * 0.1f;
                    f = (float)n3 + random.nextFloat();
                    class_13342.lllIIIllIIIIlllIlIIllIIll("largesmoke", (double)f3, (double)f2, (double)f, 0.0, 0.0, 0.0);
                }
                break block12;
            }
            for (int i = 0; i < 3; ++i) {
                float f = (float)n + random.nextFloat();
                float f4 = (float)n2 + random.nextFloat() * 0.5f + 0.5f;
                float f5 = (float)n3 + random.nextFloat();
                class_13342.lllIIIllIIIIlllIlIIllIIll("largesmoke", (double)f, (double)f4, (double)f5, 0.0, 0.0, 0.0);
            }
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
        this.llIlllIIllIlllIlIlIlIIIll = new IIcon[]{class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_layer_0"), class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_layer_1")};
    }

    public IIcon IllIIlllllllIIlIIlIIIIlIl(int n) {
        return this.llIlllIIllIlllIlIlIlIIIll[n];
    }

    @Override
    public IIcon lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        return this.llIlllIIllIlllIlIlIlIIIll[0];
    }

    @Override
    public class_1662 lllIlIIlIIIlIlIIIllIlllIl(int n) {
        return class_1662.lIllllIIlIIIlIllllllIIIll;
    }
}

