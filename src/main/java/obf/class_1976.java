package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

import java.util.Random;

public class class_1976
extends Block {
    protected class_1976() {
        super(class_1855.lllllIlllIIllIlIIlIIIllII);
        this.lllIIIllIIIIlllIlIIllIIll(true);
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.IlIllllllIIlIIllllIIlIIIl);
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
        return 2;
    }

    private boolean lIIIIlIlIIlllllIIllIIlIII(class_1334 class_13342, int n, int n2, int n3) {
        if (class_1334.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3)) {
            return true;
        }
        Block class_05492 = class_13342.a_(n, n2, n3);
        return class_05492 == Blocks.lIlIIIllIIllIIlIllllllIll || class_05492 == Blocks.lllIlIIllllIllIIIlIlIIIll || class_05492 == Blocks.lIlIllIIlIIlIIlIIlIIlIIll || class_05492 == Blocks.lIllIIlIlllIllIlIlIlIllII;
    }

    @Override
    public boolean IlIIIIIllllllIIlllIllllll(class_1334 class_13342, int n, int n2, int n3) {
        return class_13342.IlIllllllIIlIIllllIIlIIIl(n - 1, n2, n3, true) ? true : (class_13342.IlIllllllIIlIIllllIIlIIIl(n + 1, n2, n3, true) ? true : (class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3 - 1, true) ? true : (class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3 + 1, true) ? true : this.lIIIIlIlIIlllllIIllIIlIII(class_13342, n, n2 - 1, n3))));
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, int n4, float f, float f2, float f3, int n5) {
        int n6 = n5;
        if (n4 == 1 && this.lIIIIlIlIIlllllIIllIIlIII(class_13342, n, n2 - 1, n3)) {
            n6 = 5;
        }
        if (n4 == 2 && class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3 + 1, true)) {
            n6 = 4;
        }
        if (n4 == 3 && class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3 - 1, true)) {
            n6 = 3;
        }
        if (n4 == 4 && class_13342.IlIllllllIIlIIllllIIlIIIl(n + 1, n2, n3, true)) {
            n6 = 2;
        }
        if (n4 == 5 && class_13342.IlIllllllIIlIIllllIIlIIIl(n - 1, n2, n3, true)) {
            n6 = 1;
        }
        return n6;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Random random) {
        super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, random);
        if (class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3) == 0) {
            this.lIlllIlllIIIIlIIlllIllIII(class_13342, n, n2, n3);
        }
    }

    @Override
    public void lIlllIlllIIIIlIIlllIllIII(class_1334 class_13342, int n, int n2, int n3) {
        if (class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3) == 0) {
            if (class_13342.IlIllllllIIlIIllllIIlIIIl(n - 1, n2, n3, true)) {
                class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, 1, 2);
            } else if (class_13342.IlIllllllIIlIIllllIIlIIIl(n + 1, n2, n3, true)) {
                class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, 2, 2);
            } else if (class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3 - 1, true)) {
                class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, 3, 2);
            } else if (class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3 + 1, true)) {
                class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, 4, 2);
            } else if (this.lIIIIlIlIIlllllIIllIIlIII(class_13342, n, n2 - 1, n3)) {
                class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, 5, 2);
            }
        }
        this.IllIIIllIIIIlIlIlIllIIlll(class_13342, n, n2, n3);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Block class_05492) {
        this.lllIlIIlIIIlIlIIIllIlllIl(class_13342, n, n2, n3, class_05492);
    }

    protected boolean lllIlIIlIIIlIlIIIllIlllIl(class_1334 class_13342, int n, int n2, int n3, Block class_05492) {
        if (this.IllIIIllIIIIlIlIlIllIIlll(class_13342, n, n2, n3)) {
            int n4 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
            boolean bl = false;
            if (!class_13342.IlIllllllIIlIIllllIIlIIIl(n - 1, n2, n3, true) && n4 == 1) {
                bl = true;
            }
            if (!class_13342.IlIllllllIIlIIllllIIlIIIl(n + 1, n2, n3, true) && n4 == 2) {
                bl = true;
            }
            if (!class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3 - 1, true) && n4 == 3) {
                bl = true;
            }
            if (!class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3 + 1, true) && n4 == 4) {
                bl = true;
            }
            if (!this.lIIIIlIlIIlllllIIllIIlIII(class_13342, n, n2 - 1, n3) && n4 == 5) {
                bl = true;
            }
            if (bl) {
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3), 0);
                class_13342.lIllllIIlIIIlIllllllIIIll(n, n2, n3);
                return true;
            }
            return false;
        }
        return true;
    }

    protected boolean IllIIIllIIIIlIlIlIllIIlll(class_1334 class_13342, int n, int n2, int n3) {
        if (!this.IlIIIIIllllllIIlllIllllll(class_13342, n, n2, n3)) {
            if (class_13342.a_(n, n2, n3) == this) {
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3), 0);
                class_13342.lIllllIIlIIIlIllllllIIIll(n, n2, n3);
            }
            return false;
        }
        return true;
    }

    @Override
    public class_1112 lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_0864 class_08642, class_0864 class_08643) {
        int n4 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3) & 7;
        float f = 0.15f;
        if (n4 == 1) {
            this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.2f, 0.5f - f, f * 2.0f, 0.8f, 0.5f + f);
        } else if (n4 == 2) {
            this.lllIIIllIIIIlllIlIIllIIll(1.0f - f * 2.0f, 0.2f, 0.5f - f, 1.0f, 0.8f, 0.5f + f);
        } else if (n4 == 3) {
            this.lllIIIllIIIIlllIlIIllIIll(0.5f - f, 0.2f, 0.0f, 0.5f + f, 0.8f, f * 2.0f);
        } else if (n4 == 4) {
            this.lllIIIllIIIIlllIlIIllIIll(0.5f - f, 0.2f, 1.0f - f * 2.0f, 0.5f + f, 0.8f, 1.0f);
        } else {
            f = 0.1f;
            this.lllIIIllIIIIlllIlIIllIIll(0.5f - f, 0.0f, 0.5f - f, 0.5f + f, 0.6f, 0.5f + f);
        }
        return super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_08642, class_08643);
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_1334 class_13342, int n, int n2, int n3, Random random) {
        int n4 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        double d = (float)n + 0.5f;
        double d2 = (float)n2 + 0.7f;
        double d3 = (float)n3 + 0.5f;
        double d4 = 0.22f;
        double d5 = 0.27f;
        if (n4 == 1) {
            class_13342.lllIIIllIIIIlllIlIIllIIll("smoke", d - d5, d2 + d4, d3, 0.0, 0.0, 0.0);
            class_13342.lllIIIllIIIIlllIlIIllIIll("flame", d - d5, d2 + d4, d3, 0.0, 0.0, 0.0);
        } else if (n4 == 2) {
            class_13342.lllIIIllIIIIlllIlIIllIIll("smoke", d + d5, d2 + d4, d3, 0.0, 0.0, 0.0);
            class_13342.lllIIIllIIIIlllIlIIllIIll("flame", d + d5, d2 + d4, d3, 0.0, 0.0, 0.0);
        } else if (n4 == 3) {
            class_13342.lllIIIllIIIIlllIlIIllIIll("smoke", d, d2 + d4, d3 - d5, 0.0, 0.0, 0.0);
            class_13342.lllIIIllIIIIlllIlIIllIIll("flame", d, d2 + d4, d3 - d5, 0.0, 0.0, 0.0);
        } else if (n4 == 4) {
            class_13342.lllIIIllIIIIlllIlIIllIIll("smoke", d, d2 + d4, d3 + d5, 0.0, 0.0, 0.0);
            class_13342.lllIIIllIIIIlllIlIIllIIll("flame", d, d2 + d4, d3 + d5, 0.0, 0.0, 0.0);
        } else {
            class_13342.lllIIIllIIIIlllIlIIllIIll("smoke", d, d2, d3, 0.0, 0.0, 0.0);
            class_13342.lllIIIllIIIIlllIlIIllIIll("flame", d, d2, d3, 0.0, 0.0, 0.0);
        }
    }
}

