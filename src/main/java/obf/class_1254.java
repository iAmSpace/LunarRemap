package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;

import java.util.List;
import java.util.Random;

public class class_1254
extends Block {
    private static final int[][] llllllIlIllllIlIlIlIIIIlI = new int[][]{{2, 6}, {3, 7}, {2, 3}, {6, 7}, {0, 4}, {1, 5}, {0, 1}, {4, 5}};
    private final Block lIlIIllllIlIIIIllIIIIlIIl;
    private final int llIlllIIllIlllIlIlIlIIIll;
    private boolean IIIIlIIlIIIllIIIIllIIIlII;
    private int lllIIIIIIlIlllIIlIlIIIllI;

    protected class_1254(Block class_05492, int n) {
        super(class_05492.IlIlIIlllIllllllllIIIlIlI);
        this.lIlIIllllIlIIIIllIIIIlIIl = class_05492;
        this.llIlllIIllIlllIlIlIlIIIll = n;
        this.IlIllllllIIlIIllllIIlIIIl(class_05492.lIlIlIIlIIIIlIIIIIlllIIII);
        this.lllIlIIlIIIlIlIIIllIlllIl(class_05492.IlIIIlIIIIllIIIllIIIIIIll / 3.0f);
        this.lllIIIllIIIIlllIlIIllIIll(class_05492.llIIIlllIlllIlIllIIIIllIl);
        this.IlIllllllIIlIIllllIIlIIIl(255);
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.lllIlIIlIIIlIlIIIllIlllIl);
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl(class_1843 class_18432, int n, int n2, int n3) {
        if (this.IIIIlIIlIIIllIIIIllIIIlII) {
            this.lllIIIllIIIIlllIlIIllIIll(0.5f * (float)(this.lllIIIIIIlIlllIIlIlIIIllI % 2), 0.5f * (float)(this.lllIIIIIIlIlllIIlIlIIIllI / 2 % 2), 0.5f * (float)(this.lllIIIIIIlIlllIIlIlIIIllI / 4 % 2), 0.5f + 0.5f * (float)(this.lllIIIIIIlIlllIIlIlIIIllI % 2), 0.5f + 0.5f * (float)(this.lllIIIIIIlIlllIIlIlIIIllI / 2 % 2), 0.5f + 0.5f * (float)(this.lllIIIIIIlIlllIIlIlIIIllI / 4 % 2));
        } else {
            this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        }
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
        return 10;
    }

    public void IlIIIIIllllllIIlllIllllll(class_1843 class_18432, int n, int n2, int n3) {
        int n4 = class_18432.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        if ((n4 & 4) != 0) {
            this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.5f, 0.0f, 1.0f, 1.0f, 1.0f);
        } else {
            this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, 1.0f, 0.5f, 1.0f);
        }
    }

    public static boolean IlIllllllIIlIIllllIIlIIIl(Block class_05492) {
        return class_05492 instanceof class_1254;
    }

    private boolean lIllllIIlIIIlIllllllIIIll(class_1843 class_18432, int n, int n2, int n3, int n4) {
        Block class_05492 = class_18432.a_(n, n2, n3);
        return class_1254.IlIllllllIIlIIllllIIlIIIl(class_05492) && class_18432.IlIllllllIIlIIllllIIlIIIl(n, n2, n3) == n4;
    }

    public boolean lIllllIIlIIIlIllllllIIIll(class_1843 class_18432, int n, int n2, int n3) {
        int n4 = class_18432.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        int n5 = n4 & 3;
        float f = 0.5f;
        float f2 = 1.0f;
        if ((n4 & 4) != 0) {
            f = 0.0f;
            f2 = 0.5f;
        }
        float f3 = 0.0f;
        float f4 = 1.0f;
        float f5 = 0.0f;
        float f6 = 0.5f;
        boolean bl = true;
        if (n5 == 0) {
            f3 = 0.5f;
            f6 = 1.0f;
            Block class_05492 = class_18432.a_(n + 1, n2, n3);
            int n6 = class_18432.IlIllllllIIlIIllllIIlIIIl(n + 1, n2, n3);
            if (class_1254.IlIllllllIIlIIllllIIlIIIl(class_05492) && (n4 & 4) == (n6 & 4)) {
                int n7 = n6 & 3;
                if (n7 == 3 && !this.lIllllIIlIIIlIllllllIIIll(class_18432, n, n2, n3 + 1, n4)) {
                    f6 = 0.5f;
                    bl = false;
                } else if (n7 == 2 && !this.lIllllIIlIIIlIllllllIIIll(class_18432, n, n2, n3 - 1, n4)) {
                    f5 = 0.5f;
                    bl = false;
                }
            }
        } else if (n5 == 1) {
            f4 = 0.5f;
            f6 = 1.0f;
            Block class_05493 = class_18432.a_(n - 1, n2, n3);
            int n8 = class_18432.IlIllllllIIlIIllllIIlIIIl(n - 1, n2, n3);
            if (class_1254.IlIllllllIIlIIllllIIlIIIl(class_05493) && (n4 & 4) == (n8 & 4)) {
                int n9 = n8 & 3;
                if (n9 == 3 && !this.lIllllIIlIIIlIllllllIIIll(class_18432, n, n2, n3 + 1, n4)) {
                    f6 = 0.5f;
                    bl = false;
                } else if (n9 == 2 && !this.lIllllIIlIIIlIllllllIIIll(class_18432, n, n2, n3 - 1, n4)) {
                    f5 = 0.5f;
                    bl = false;
                }
            }
        } else if (n5 == 2) {
            f5 = 0.5f;
            f6 = 1.0f;
            Block class_05494 = class_18432.a_(n, n2, n3 + 1);
            int n10 = class_18432.IlIllllllIIlIIllllIIlIIIl(n, n2, n3 + 1);
            if (class_1254.IlIllllllIIlIIllllIIlIIIl(class_05494) && (n4 & 4) == (n10 & 4)) {
                int n11 = n10 & 3;
                if (n11 == 1 && !this.lIllllIIlIIIlIllllllIIIll(class_18432, n + 1, n2, n3, n4)) {
                    f4 = 0.5f;
                    bl = false;
                } else if (n11 == 0 && !this.lIllllIIlIIIlIllllllIIIll(class_18432, n - 1, n2, n3, n4)) {
                    f3 = 0.5f;
                    bl = false;
                }
            }
        } else if (n5 == 3) {
            Block class_05495 = class_18432.a_(n, n2, n3 - 1);
            int n12 = class_18432.IlIllllllIIlIIllllIIlIIIl(n, n2, n3 - 1);
            if (class_1254.IlIllllllIIlIIllllIIlIIIl(class_05495) && (n4 & 4) == (n12 & 4)) {
                int n13 = n12 & 3;
                if (n13 == 1 && !this.lIllllIIlIIIlIllllllIIIll(class_18432, n + 1, n2, n3, n4)) {
                    f4 = 0.5f;
                    bl = false;
                } else if (n13 == 0 && !this.lIllllIIlIIIlIllllllIIIll(class_18432, n - 1, n2, n3, n4)) {
                    f3 = 0.5f;
                    bl = false;
                }
            }
        }
        this.lllIIIllIIIIlllIlIIllIIll(f3, f, f5, f4, f2, f6);
        return bl;
    }

    public boolean IIIllIIlIIIIIIlIlIIllIIlI(class_1843 class_18432, int n, int n2, int n3) {
        int n4 = class_18432.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        int n5 = n4 & 3;
        float f = 0.5f;
        float f2 = 1.0f;
        if ((n4 & 4) != 0) {
            f = 0.0f;
            f2 = 0.5f;
        }
        float f3 = 0.0f;
        float f4 = 0.5f;
        float f5 = 0.5f;
        float f6 = 1.0f;
        boolean bl = false;
        if (n5 == 0) {
            Block class_05492 = class_18432.a_(n - 1, n2, n3);
            int n6 = class_18432.IlIllllllIIlIIllllIIlIIIl(n - 1, n2, n3);
            if (class_1254.IlIllllllIIlIIllllIIlIIIl(class_05492) && (n4 & 4) == (n6 & 4)) {
                int n7 = n6 & 3;
                if (n7 == 3 && !this.lIllllIIlIIIlIllllllIIIll(class_18432, n, n2, n3 - 1, n4)) {
                    f5 = 0.0f;
                    f6 = 0.5f;
                    bl = true;
                } else if (n7 == 2 && !this.lIllllIIlIIIlIllllllIIIll(class_18432, n, n2, n3 + 1, n4)) {
                    f5 = 0.5f;
                    f6 = 1.0f;
                    bl = true;
                }
            }
        } else if (n5 == 1) {
            Block class_05493 = class_18432.a_(n + 1, n2, n3);
            int n8 = class_18432.IlIllllllIIlIIllllIIlIIIl(n + 1, n2, n3);
            if (class_1254.IlIllllllIIlIIllllIIlIIIl(class_05493) && (n4 & 4) == (n8 & 4)) {
                f3 = 0.5f;
                f4 = 1.0f;
                int n9 = n8 & 3;
                if (n9 == 3 && !this.lIllllIIlIIIlIllllllIIIll(class_18432, n, n2, n3 - 1, n4)) {
                    f5 = 0.0f;
                    f6 = 0.5f;
                    bl = true;
                } else if (n9 == 2 && !this.lIllllIIlIIIlIllllllIIIll(class_18432, n, n2, n3 + 1, n4)) {
                    f5 = 0.5f;
                    f6 = 1.0f;
                    bl = true;
                }
            }
        } else if (n5 == 2) {
            Block class_05494 = class_18432.a_(n, n2, n3 - 1);
            int n10 = class_18432.IlIllllllIIlIIllllIIlIIIl(n, n2, n3 - 1);
            if (class_1254.IlIllllllIIlIIllllIIlIIIl(class_05494) && (n4 & 4) == (n10 & 4)) {
                f5 = 0.0f;
                f6 = 0.5f;
                int n11 = n10 & 3;
                if (n11 == 1 && !this.lIllllIIlIIIlIllllllIIIll(class_18432, n - 1, n2, n3, n4)) {
                    bl = true;
                } else if (n11 == 0 && !this.lIllllIIlIIIlIllllllIIIll(class_18432, n + 1, n2, n3, n4)) {
                    f3 = 0.5f;
                    f4 = 1.0f;
                    bl = true;
                }
            }
        } else if (n5 == 3) {
            Block class_05495 = class_18432.a_(n, n2, n3 + 1);
            int n12 = class_18432.IlIllllllIIlIIllllIIlIIIl(n, n2, n3 + 1);
            if (class_1254.IlIllllllIIlIIllllIIlIIIl(class_05495) && (n4 & 4) == (n12 & 4)) {
                int n13 = n12 & 3;
                if (n13 == 1 && !this.lIllllIIlIIIlIllllllIIIll(class_18432, n - 1, n2, n3, n4)) {
                    bl = true;
                } else if (n13 == 0 && !this.lIllllIIlIIIlIllllllIIIll(class_18432, n + 1, n2, n3, n4)) {
                    f3 = 0.5f;
                    f4 = 1.0f;
                    bl = true;
                }
            }
        }
        if (bl) {
            this.lllIIIllIIIIlllIlIIllIIll(f3, f, f5, f4, f2, f6);
        }
        return bl;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_1974 class_19742, List list, class_1521 class_15212) {
        this.IlIIIIIllllllIIlllIllllll((class_1843)class_13342, n, n2, n3);
        super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_19742, list, class_15212);
        boolean bl = this.lIllllIIlIIIlIllllllIIIll((class_1843)class_13342, n, n2, n3);
        super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_19742, list, class_15212);
        if (bl && this.IIIllIIlIIIIIIlIlIIllIIlI((class_1843)class_13342, n, n2, n3)) {
            super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_19742, list, class_15212);
        }
        this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_1334 class_13342, int n, int n2, int n3, Random random) {
        this.lIlIIllllIlIIIIllIIIIlIIl.lllIlIIlIIIlIlIIIllIlllIl(class_13342, n, n2, n3, random);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_0814 class_08142) {
        this.lIlIIllllIlIIIIllIIIIlIIl.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_08142);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, int n4) {
        this.lIlIIllllIlIIIIllIIIIlIIl.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, n4);
    }

    @Override
    public int lllIlIIlIIIlIlIIIllIlllIl(class_1843 class_18432, int n, int n2, int n3) {
        return this.lIlIIllllIlIIIIllIIIIlIIl.lllIlIIlIIIlIlIIIllIlllIl(class_18432, n, n2, n3);
    }

    @Override
    public float lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212) {
        return this.lIlIIllllIlIIIIllIIIIlIIl.lllIIIllIIIIlllIlIIllIIll(class_15212);
    }

    @Override
    public int lllllIlllIIllIlIIlIIIllII() {
        return this.lIlIIllllIlIIIIllIIIIlIIl.lllllIlllIIllIlIIlIIIllII();
    }

    @Override
    public IIcon lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        return this.lIlIIllllIlIIIIllIIIIlIIl.lllIIIllIIIIlllIlIIllIIll(n, this.llIlllIIllIlllIlIlIlIIIll);
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342) {
        return this.lIlIIllllIlIIIIllIIIIlIIl.lllIIIllIIIIlllIlIIllIIll(class_13342);
    }

    @Override
    public class_1974 lllIlIIlIIIlIlIIIllIlllIl(class_1334 class_13342, int n, int n2, int n3) {
        return this.lIlIIllllIlIIIIllIIIIlIIl.lllIlIIlIIIlIlIIIllIlllIl(class_13342, n, n2, n3);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_1521 class_15212, class_0864 class_08642) {
        this.lIlIIllllIlIIIIllIIIIlIIl.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_15212, class_08642);
    }

    @Override
    public boolean IlIlIIlIlIllIIlIlIIllIIIl() {
        return this.lIlIIllllIlIIIIllIIIIlIIl.IlIlIIlIlIllIIlIlIIllIIIl();
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(int n, boolean bl) {
        return this.lIlIIllllIlIIIIllIIIIlIIl.lllIIIllIIIIlllIlIIllIIll(n, bl);
    }

    @Override
    public boolean IlIIIIIllllllIIlllIllllll(class_1334 class_13342, int n, int n2, int n3) {
        return this.lIlIIllllIlIIIIllIIIIlIIl.IlIIIIIllllllIIlllIllllll(class_13342, n, n2, n3);
    }

    @Override
    public void lIlllIlllIIIIlIIlllIllIII(class_1334 class_13342, int n, int n2, int n3) {
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, Blocks.lllIIIllIIIIlllIlIIllIIll);
        this.lIlIIllllIlIIIIllIIIIlIIl.lIlllIlllIIIIlIIlllIllIII(class_13342, n, n2, n3);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Block class_05492, int n4) {
        this.lIlIIllllIlIIIIllIIIIlIIl.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_05492, n4);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_1521 class_15212) {
        this.lIlIIllllIlIIIIllIIIIlIIl.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_15212);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Random random) {
        this.lIlIIllllIlIIIIllIIIIlIIl.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, random);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_0814 class_08142, int n4, float f, float f2, float f3) {
        return this.lIlIIllllIlIIIIllIIIIlIIl.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_08142, 0, 0.0f, 0.0f, 0.0f);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_1013 class_10132) {
        this.lIlIIllllIlIIIIllIIIIlIIl.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_10132);
    }

    @Override
    public class_1662 lllIlIIlIIIlIlIIIllIlllIl(int n) {
        return this.lIlIIllllIlIIIIllIIIIlIIl.lllIlIIlIIIlIlIIIllIlllIl(this.llIlllIIllIlllIlIlIlIIIll);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_1965 class_19652, ItemStack class_08972) {
        int n4 = MathHelper.IlIllllllIIlIIllllIIlIIIl((double)(class_19652.IIIIlIllIlIIlIIlIllIlIlll * 4.0f / 360.0f) + 0.5) & 3;
        int n5 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3) & 4;
        if (n4 == 0) {
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, 2 | n5, 2);
        }
        if (n4 == 1) {
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, 1 | n5, 2);
        }
        if (n4 == 2) {
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, 3 | n5, 2);
        }
        if (n4 == 3) {
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, 0 | n5, 2);
        }
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, int n4, float f, float f2, float f3, int n5) {
        return n4 != 0 && (n4 == 1 || (double)f2 <= 0.5) ? n5 : n5 | 4;
    }

    @Override
    public class_1112 lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_0864 class_08642, class_0864 class_08643) {
        int n4;
        int n5;
        int n6;
        class_1112[] arrclass_1112 = new class_1112[8];
        int n7 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        int n8 = n7 & 3;
        boolean bl = (n7 & 4) == 4;
        int[] arrn = llllllIlIllllIlIlIlIIIIlI[n8 + (bl ? 4 : 0)];
        this.IIIIlIIlIIIllIIIIllIIIlII = true;
        for (int i = 0; i < 8; ++i) {
            this.lllIIIIIIlIlllIIlIlIIIllI = i;
            int[] arrn2 = arrn;
            n6 = arrn.length;
            for (n5 = 0; n5 < n6; ++n5) {
                n4 = arrn2[n5];
                if (n4 != i) continue;
            }
            arrclass_1112[i] = super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_08642, class_08643);
        }
        int[] arrn3 = arrn;
        int n9 = arrn.length;
        for (n6 = 0; n6 < n9; ++n6) {
            n5 = arrn3[n6];
            arrclass_1112[n5] = null;
        }
        class_1112 class_11122 = null;
        double d = 0.0;
        class_1112[] arrclass_11122 = arrclass_1112;
        n4 = arrclass_1112.length;
        for (int i = 0; i < n4; ++i) {
            double d2;
            class_1112 class_11123 = arrclass_11122[i];
            if (class_11123 == null || !((d2 = class_11123.lIllllIIlIIIlIllllllIIIll.IlIIIIIllllllIIlllIllllll(class_08643)) > d)) continue;
            class_11122 = class_11123;
            d = d2;
        }
        return class_11122;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
    }
}

