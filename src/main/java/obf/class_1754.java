package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

import java.util.Arrays;
import java.util.Random;

public class class_1754
extends class_0672 {
    private byte[] lIIllIIlIIIlllIlllIIlIIlI;
    private long IllIIllIlIlllIllIllIlIIIl;
    private class_1940 IIIlIllllIIIlllllIllIlIII;
    private class_1940 IIIIIllIlIllIlIlIIlIllIIl;
    private class_1940 lIIllIlIIlIIlllllIlIIllIl;
    private boolean lIIlllIIlIlIlIIIlIlllIIll;
    private boolean IlIIlIIlllllIlIIlIlIlIlIl;

    public class_1754(int n, boolean bl, boolean bl2) {
        super(n);
        this.lIIlllIIlIlIlIIIlIlllIIll = bl;
        this.IlIIlIIlllllIlIIlIlIlIlIl = bl2;
        this.lllIlIIlIIIlIlIIIllIlllIl();
        this.lllIIIllIIIIlllIlIIllIIll(2.0f, 0.0f);
        this.llIIIIIlIIlIIIIllIIIlIIII.clear();
        this.IlllIIIllllIIllIllIlIIlIl = Blocks.llIIllIllIlIIlIIllIllllll;
        this.lllIIIlIIlIlIllIIIIIlIIll = 1;
        this.IIIlIlIllIlllllIlIllllllI = Blocks.llllIIIllIllIIIllIlIIIIIl;
        this.llIIIlIlIlIIlIllIIIllIlIl.llIIlIllIllllIlIIIIlIIlll = -999;
        this.llIIIlIlIlIIlIllIIIllIlIl.IlIIlllllIIlIlIlllllIllll = 20;
        this.llIIIlIlIlIIlIllIIIllIlIl.IllIIIIllIIllIllIlllIlIIl = 3;
        this.llIIIlIlIlIIlIllIIIllIlIl.IIIIIIIIlIllIIllIIlllIllI = 5;
        this.llIIIlIlIlIIlIllIIIllIlIl.llIllllIlIllIIIlIllIIlIlI = 0;
        this.llIIIIIlIIlIIIIllIIIlIIII.clear();
        if (bl2) {
            this.llIIIlIlIlIIlIllIIIllIlIl.llIIlIllIllllIlIIIIlIIlll = 5;
        }
    }

    @Override
    public class_1174 lllIIIllIIIIlllIlIIllIIll(Random random) {
        return this.IlIIIlIIlllllIIIllIlIlIll;
    }

    @Override
    public int IlIllllllIIlIIllllIIlIIIl(int n, int n2, int n3) {
        return 10387789;
    }

    @Override
    public int lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, int n3) {
        return 9470285;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, Random random, int n, int n2) {
        super.lllIIIllIIIIlllIlIIllIIll(class_13342, random, n, n2);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, Random random, Block[] arrclass_0549, byte[] arrby, int n, int n2, double d) {
        int n3;
        int n4;
        if (this.lIIllIIlIIIlllIlllIIlIIlI == null || this.IllIIllIlIlllIllIllIlIIIl != class_13342.lIlIlIIlIIIIlIIIIIlllIIII()) {
            this.lllIIIllIIIIlllIlIIllIIll(class_13342.lIlIlIIlIIIIlIIIIIlllIIII());
        }
        if (this.IIIlIllllIIIlllllIllIlIII == null || this.IIIIIllIlIllIlIlIIlIllIIl == null || this.IllIIllIlIlllIllIllIlIIIl != class_13342.lIlIlIIlIIIIlIIIIIlllIIII()) {
            Random random2 = new Random(this.IllIIllIlIlllIllIllIlIIIl);
            this.IIIlIllllIIIlllllIllIlIII = new class_1940(random2, 4);
            this.IIIIIllIlIllIlIlIIlIllIIl = new class_1940(random2, 1);
        }
        this.IllIIllIlIlllIllIllIlIIIl = class_13342.lIlIlIIlIIIIlIIIIIlllIIII();
        double d2 = 0.0;
        if (this.lIIlllIIlIlIlIIIlIlllIIll) {
            n4 = (n & 0xFFFFFFF0) + (n2 & 0xF);
            n3 = (n2 & 0xFFFFFFF0) + (n & 0xF);
            double d3 = Math.min(Math.abs(d), this.IIIlIllllIIIlllllIllIlIII.lllIIIllIIIIlllIlIIllIIll((double)n4 * 0.25, (double)n3 * 0.25));
            if (d3 > 0.0) {
                d2 = d3 * d3 * 2.5;
                double d4 = 0.001953125;
                double d5 = Math.abs(this.IIIIIllIlIllIlIlIIlIllIIl.lllIIIllIIIIlllIlIIllIIll((double)n4 * d4, (double)n3 * d4));
                double d6 = Math.ceil(d5 * 50.0) + 14.0;
                if (d2 > d6) {
                    d2 = d6;
                }
                d2 += 64.0;
            }
        }
        n4 = n & 0xF;
        n3 = n2 & 0xF;
        boolean bl = true;
        Block class_05492 = Blocks.llllIIIllIllIIIllIlIIIIIl;
        Block class_05493 = this.IIIlIlIllIlllllIlIllllllI;
        int n5 = (int)(d / 3.0 + 3.0 + random.nextDouble() * 0.25);
        boolean bl2 = Math.cos(d / 3.0 * Math.PI) > 0.0;
        int n6 = -1;
        boolean bl3 = false;
        int n7 = arrclass_0549.length / 256;
        for (int i = 255; i >= 0; --i) {
            int n8 = (n3 * 16 + n4) * n7 + i;
            if ((arrclass_0549[n8] == null || arrclass_0549[n8].lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll) && i < (int)d2) {
                arrclass_0549[n8] = Blocks.lllIlIIlIIIlIlIIIllIlllIl;
            }
            if (i <= 0 + random.nextInt(5)) {
                arrclass_0549[n8] = Blocks.IllIIlllllllIIlIIlIIIIlIl;
                continue;
            }
            Block class_05494 = arrclass_0549[n8];
            if (class_05494 != null && class_05494.lIllllIIlIIIlIllllllIIIll() != class_1855.lllIIIllIIIIlllIlIIllIIll) {
                int n9;
                if (class_05494 != Blocks.lllIlIIlIIIlIlIIIllIlllIl) continue;
                if (n6 == -1) {
                    bl3 = false;
                    if (n5 <= 0) {
                        class_05492 = null;
                        class_05493 = Blocks.lllIlIIlIIIlIlIIIllIlllIl;
                    } else if (i >= 59 && i <= 64) {
                        class_05492 = Blocks.llllIIIllIllIIIllIlIIIIIl;
                        class_05493 = this.IIIlIlIllIlllllIlIllllllI;
                    }
                    if (i < 63 && (class_05492 == null || class_05492.lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll)) {
                        class_05492 = Blocks.IllIIIllIIIIlIlIlIllIIlll;
                    }
                    n6 = n5 + Math.max(0, i - 63);
                    if (i >= 62) {
                        if (this.IlIIlIIlllllIlIIlIlIlIlIl && i > 86 + n5 * 2) {
                            if (bl2) {
                                arrclass_0549[n8] = Blocks.lIlllIlllIIIIlIIlllIllIII;
                                arrby[n8] = 1;
                                continue;
                            }
                            arrclass_0549[n8] = Blocks.IlIllllllIIlIIllllIIlIIIl;
                            continue;
                        }
                        if (i > 66 + n5) {
                            n9 = 16;
                            if (i >= 64 && i <= 127) {
                                if (!bl2) {
                                    n9 = this.lIlllIlllIIIIlIIlllIllIII(n, i, n2);
                                }
                            } else {
                                n9 = 1;
                            }
                            if (n9 < 16) {
                                arrclass_0549[n8] = Blocks.llllIIIllIllIIIllIlIIIIIl;
                                arrby[n8] = n9;
                                continue;
                            }
                            arrclass_0549[n8] = Blocks.IllIlIIllIIllIlIIlIllIlIl;
                            continue;
                        }
                        arrclass_0549[n8] = this.IlllIIIllllIIllIllIlIIlIl;
                        arrby[n8] = (byte)this.lllIIIlIIlIlIllIIIIIlIIll;
                        bl3 = true;
                        continue;
                    }
                    arrclass_0549[n8] = class_05493;
                    if (class_05493 != Blocks.llllIIIllIllIIIllIlIIIIIl) continue;
                    arrby[n8] = 1;
                    continue;
                }
                if (n6 <= 0) continue;
                --n6;
                if (bl3) {
                    arrclass_0549[n8] = Blocks.llllIIIllIllIIIllIlIIIIIl;
                    arrby[n8] = 1;
                    continue;
                }
                n9 = this.lIlllIlllIIIIlIIlllIllIII(n, i, n2);
                if (n9 < 16) {
                    arrclass_0549[n8] = Blocks.llllIIIllIllIIIllIlIIIIIl;
                    arrby[n8] = n9;
                    continue;
                }
                arrclass_0549[n8] = Blocks.IllIlIIllIIllIlIIlIllIlIl;
                continue;
            }
            n6 = -1;
        }
    }

    private void lllIIIllIIIIlllIlIIllIIll(long l) {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        this.lIIllIIlIIIlllIlllIIlIIlI = new byte[64];
        Arrays.fill(this.lIIllIIlIIIlllIlllIIlIIlI, (byte)16);
        Random random = new Random(l);
        this.lIIllIlIIlIIlllllIlIIllIl = new class_1940(random, 1);
        for (n7 = 0; n7 < 64; ++n7) {
            if ((n7 += random.nextInt(5) + 1) >= 64) continue;
            this.lIIllIIlIIIlllIlllIIlIIlI[n7] = 1;
        }
        n7 = random.nextInt(4) + 2;
        for (n6 = 0; n6 < n7; ++n6) {
            n5 = random.nextInt(3) + 1;
            n4 = random.nextInt(64);
            for (n3 = 0; n4 + n3 < 64 && n3 < n5; ++n3) {
                this.lIIllIIlIIIlllIlllIIlIIlI[n4 + n3] = 4;
            }
        }
        n6 = random.nextInt(4) + 2;
        for (n5 = 0; n5 < n6; ++n5) {
            n4 = random.nextInt(3) + 2;
            n3 = random.nextInt(64);
            for (n2 = 0; n3 + n2 < 64 && n2 < n4; ++n2) {
                this.lIIllIIlIIIlllIlllIIlIIlI[n3 + n2] = 12;
            }
        }
        n5 = random.nextInt(4) + 2;
        for (n4 = 0; n4 < n5; ++n4) {
            n3 = random.nextInt(3) + 1;
            n2 = random.nextInt(64);
            for (n = 0; n2 + n < 64 && n < n3; ++n) {
                this.lIIllIIlIIIlllIlllIIlIIlI[n2 + n] = 14;
            }
        }
        n4 = random.nextInt(3) + 3;
        n3 = 0;
        for (n2 = 0; n2 < n4; ++n2) {
            n = 1;
            for (int i = 0; (n3 += random.nextInt(16) + 4) + i < 64 && i < n; ++i) {
                this.lIIllIIlIIIlllIlllIIlIIlI[n3 + i] = 0;
                if (n3 + i > 1 && random.nextBoolean()) {
                    this.lIIllIIlIIIlllIlllIIlIIlI[n3 + i - 1] = 8;
                }
                if (n3 + i >= 63 || !random.nextBoolean()) continue;
                this.lIIllIIlIIIlllIlllIIlIIlI[n3 + i + 1] = 8;
            }
        }
    }

    private byte lIlllIlllIIIIlIIlllIllIII(int n, int n2, int n3) {
        int n4 = (int)Math.round(this.lIIllIlIIlIIlllllIlIIllIl.lllIIIllIIIIlllIlIIllIIll((double)n * 1.0 / 512.0, (double)n * 1.0 / 512.0) * 2.0);
        return this.lIIllIIlIIIlllIlllIIlIIlI[(n2 + n4 + 64) % 64];
    }

    @Override
    protected class_0672 lIIIIlIlIIlllllIIllIIlIII() {
        boolean bl = this.lIlIllIIllIIIIlllIlIlllIl == class_0672.lIIIllIIIIIllllIlIlIllIll.lIlIllIIllIIIIlllIlIlllIl;
        class_1754 class_17542 = new class_1754(this.lIlIllIIllIIIIlllIlIlllIl + 128, bl, this.IlIIlIIlllllIlIIlIlIlIlIl);
        if (!bl) {
            class_17542.lllIIIllIIIIlllIlIIllIIll(IIIllIIlIIIIIIlIlIIllIIlI);
            class_17542.lllIIIllIIIIlllIlIIllIIll(this.IlIIIlIllIIIllIIIIlIIlIll + " M");
        } else {
            class_17542.lllIIIllIIIIlllIlIIllIIll(this.IlIIIlIllIIIllIIIIlIIlIll + " (Bryce)");
        }
        class_17542.lllIIIllIIIIlllIlIIllIIll(this.llllIIllIlIlllllllIIlIIlI, true);
        return class_17542;
    }
}

