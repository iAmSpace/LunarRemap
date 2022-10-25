package obf;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0446
extends Block {
    protected class_0446() {
        super(class_1855.lllllIlllIIllIlIIlIIIllII);
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.lIlllIlllIIIIlIIlllIllIII);
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
        return 12;
    }

    @Override
    public boolean IlIllllllIIlIIllllIIlIIIl(class_1334 class_13342, int n, int n2, int n3, int n4) {
        return n4 == 0 && class_13342.a_(n, n2 + 1, n3).IIIllIllIIlIlIlIlIllllIIl() ? true : (n4 == 1 && class_1334.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2 - 1, n3) ? true : (n4 == 2 && class_13342.a_(n, n2, n3 + 1).IIIllIllIIlIlIlIlIllllIIl() ? true : (n4 == 3 && class_13342.a_(n, n2, n3 - 1).IIIllIllIIlIlIlIlIllllIIl() ? true : (n4 == 4 && class_13342.a_(n + 1, n2, n3).IIIllIllIIlIlIlIlIllllIIl() ? true : n4 == 5 && class_13342.a_(n - 1, n2, n3).IIIllIllIIlIlIlIlIllllIIl()))));
    }

    @Override
    public boolean IlIIIIIllllllIIlllIllllll(class_1334 class_13342, int n, int n2, int n3) {
        return class_13342.a_(n - 1, n2, n3).IIIllIllIIlIlIlIlIllllIIl() ? true : (class_13342.a_(n + 1, n2, n3).IIIllIllIIlIlIlIlIllllIIl() ? true : (class_13342.a_(n, n2, n3 - 1).IIIllIllIIlIlIlIlIllllIIl() ? true : (class_13342.a_(n, n2, n3 + 1).IIIllIllIIlIlIlIlIllllIIl() ? true : (class_1334.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2 - 1, n3) ? true : class_13342.a_(n, n2 + 1, n3).IIIllIllIIlIlIlIlIllllIIl()))));
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, int n4, float f, float f2, float f3, int n5) {
        int n6 = n5 & 8;
        int n7 = n5 & 7;
        int n8 = -1;
        if (n4 == 0 && class_13342.a_(n, n2 + 1, n3).IIIllIllIIlIlIlIlIllllIIl()) {
            n8 = 0;
        }
        if (n4 == 1 && class_1334.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2 - 1, n3)) {
            n8 = 5;
        }
        if (n4 == 2 && class_13342.a_(n, n2, n3 + 1).IIIllIllIIlIlIlIlIllllIIl()) {
            n8 = 4;
        }
        if (n4 == 3 && class_13342.a_(n, n2, n3 - 1).IIIllIllIIlIlIlIlIllllIIl()) {
            n8 = 3;
        }
        if (n4 == 4 && class_13342.a_(n + 1, n2, n3).IIIllIllIIlIlIlIlIllllIIl()) {
            n8 = 2;
        }
        if (n4 == 5 && class_13342.a_(n - 1, n2, n3).IIIllIllIIlIlIlIlIllllIIl()) {
            n8 = 1;
        }
        return n8 + n6;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_1965 class_19652, ItemStack class_08972) {
        int n4 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        int n5 = n4 & 7;
        int n6 = n4 & 8;
        if (n5 == class_0446.IllIIlllllllIIlIIlIIIIlIl(1)) {
            if ((MathHelper.IlIllllllIIlIIllllIIlIIIl((double)(class_19652.IIIIlIllIlIIlIIlIllIlIlll * 4.0f / 360.0f) + 0.5) & 1) == 0) {
                class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, 5 | n6, 2);
            } else {
                class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, 6 | n6, 2);
            }
        } else if (n5 == class_0446.IllIIlllllllIIlIIlIIIIlIl(0)) {
            if ((MathHelper.IlIllllllIIlIIllllIIlIIIl((double)(class_19652.IIIIlIllIlIIlIIlIllIlIlll * 4.0f / 360.0f) + 0.5) & 1) == 0) {
                class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, 7 | n6, 2);
            } else {
                class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, 0 | n6, 2);
            }
        }
    }

    public static int IllIIlllllllIIlIIlIIIIlIl(int n) {
        switch (n) {
            case 0: {
                return 0;
            }
            case 1: {
                return 5;
            }
            case 2: {
                return 4;
            }
            case 3: {
                return 3;
            }
            case 4: {
                return 2;
            }
            case 5: {
                return 1;
            }
        }
        return -1;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Block class_05492) {
        if (this.IllIIIllIIIIlIlIlIllIIlll(class_13342, n, n2, n3)) {
            int n4 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3) & 7;
            boolean bl = false;
            if (!class_13342.a_(n - 1, n2, n3).IIIllIllIIlIlIlIlIllllIIl() && n4 == 1) {
                bl = true;
            }
            if (!class_13342.a_(n + 1, n2, n3).IIIllIllIIlIlIlIlIllllIIl() && n4 == 2) {
                bl = true;
            }
            if (!class_13342.a_(n, n2, n3 - 1).IIIllIllIIlIlIlIlIllllIIl() && n4 == 3) {
                bl = true;
            }
            if (!class_13342.a_(n, n2, n3 + 1).IIIllIllIIlIlIlIlIllllIIl() && n4 == 4) {
                bl = true;
            }
            if (!class_1334.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2 - 1, n3) && n4 == 5) {
                bl = true;
            }
            if (!class_1334.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2 - 1, n3) && n4 == 6) {
                bl = true;
            }
            if (!class_13342.a_(n, n2 + 1, n3).IIIllIllIIlIlIlIlIllllIIl() && n4 == 0) {
                bl = true;
            }
            if (!class_13342.a_(n, n2 + 1, n3).IIIllIllIIlIlIlIlIllllIIl() && n4 == 7) {
                bl = true;
            }
            if (bl) {
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3), 0);
                class_13342.lIllllIIlIIIlIllllllIIIll(n, n2, n3);
            }
        }
    }

    private boolean IllIIIllIIIIlIlIlIllIIlll(class_1334 class_13342, int n, int n2, int n3) {
        if (!this.IlIIIIIllllllIIlllIllllll(class_13342, n, n2, n3)) {
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3), 0);
            class_13342.lIllllIIlIIIlIllllllIIIll(n, n2, n3);
            return false;
        }
        return true;
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl(class_1843 class_18432, int n, int n2, int n3) {
        int n4 = class_18432.IlIllllllIIlIIllllIIlIIIl(n, n2, n3) & 7;
        float f = 0.1875f;
        if (n4 == 1) {
            this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.2f, 0.5f - f, f * 2.0f, 0.8f, 0.5f + f);
        } else if (n4 == 2) {
            this.lllIIIllIIIIlllIlIIllIIll(1.0f - f * 2.0f, 0.2f, 0.5f - f, 1.0f, 0.8f, 0.5f + f);
        } else if (n4 == 3) {
            this.lllIIIllIIIIlllIlIIllIIll(0.5f - f, 0.2f, 0.0f, 0.5f + f, 0.8f, f * 2.0f);
        } else if (n4 == 4) {
            this.lllIIIllIIIIlllIlIIllIIll(0.5f - f, 0.2f, 1.0f - f * 2.0f, 0.5f + f, 0.8f, 1.0f);
        } else if (n4 != 5 && n4 != 6) {
            if (n4 == 0 || n4 == 7) {
                f = 0.25f;
                this.lllIIIllIIIIlllIlIIllIIll(0.5f - f, 0.4f, 0.5f - f, 0.5f + f, 1.0f, 0.5f + f);
            }
        } else {
            f = 0.25f;
            this.lllIIIllIIIIlllIlIIllIIll(0.5f - f, 0.0f, 0.5f - f, 0.5f + f, 0.6f, 0.5f + f);
        }
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_0814 class_08142, int n4, float f, float f2, float f3) {
        if (class_13342.IllIIIIllIIllIllIlllIlIIl) {
            return true;
        }
        int n5 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        int n6 = n5 & 7;
        int n7 = 8 - (n5 & 8);
        class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n6 + n7, 3);
        class_13342.lllIIIllIIIIlllIlIIllIIll((double)n + 0.5, (double)n2 + 0.5, (double)n3 + 0.5, "random.click", 0.3f, n7 > 0 ? 0.6f : 0.5f);
        class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3, this);
        if (n6 == 1) {
            class_13342.IlIllllllIIlIIllllIIlIIIl(n - 1, n2, n3, this);
        } else if (n6 == 2) {
            class_13342.IlIllllllIIlIIllllIIlIIIl(n + 1, n2, n3, this);
        } else if (n6 == 3) {
            class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3 - 1, this);
        } else if (n6 == 4) {
            class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3 + 1, this);
        } else if (n6 != 5 && n6 != 6) {
            if (n6 == 0 || n6 == 7) {
                class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2 + 1, n3, this);
            }
        } else {
            class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2 - 1, n3, this);
        }
        return true;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Block class_05492, int n4) {
        if ((n4 & 8) > 0) {
            class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3, this);
            int n5 = n4 & 7;
            if (n5 == 1) {
                class_13342.IlIllllllIIlIIllllIIlIIIl(n - 1, n2, n3, this);
            } else if (n5 == 2) {
                class_13342.IlIllllllIIlIIllllIIlIIIl(n + 1, n2, n3, this);
            } else if (n5 == 3) {
                class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3 - 1, this);
            } else if (n5 == 4) {
                class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3 + 1, this);
            } else if (n5 != 5 && n5 != 6) {
                if (n5 == 0 || n5 == 7) {
                    class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2 + 1, n3, this);
                }
            } else {
                class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2 - 1, n3, this);
            }
        }
        super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_05492, n4);
    }

    @Override
    public int lIlllIlllIIIIlIIlllIllIII(class_1843 class_18432, int n, int n2, int n3, int n4) {
        return (class_18432.IlIllllllIIlIIllllIIlIIIl(n, n2, n3) & 8) > 0 ? 15 : 0;
    }

    @Override
    public int IlIIIIIllllllIIlllIllllll(class_1843 class_18432, int n, int n2, int n3, int n4) {
        int n5 = class_18432.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        if ((n5 & 8) == 0) {
            return 0;
        }
        int n6 = n5 & 7;
        return n6 == 0 && n4 == 0 ? 15 : (n6 == 7 && n4 == 0 ? 15 : (n6 == 6 && n4 == 1 ? 15 : (n6 == 5 && n4 == 1 ? 15 : (n6 == 4 && n4 == 2 ? 15 : (n6 == 3 && n4 == 3 ? 15 : (n6 == 2 && n4 == 4 ? 15 : (n6 == 1 && n4 == 5 ? 15 : 0)))))));
    }

    @Override
    public boolean llIllllIlIllIIIlIllIIlIlI() {
        return true;
    }
}

