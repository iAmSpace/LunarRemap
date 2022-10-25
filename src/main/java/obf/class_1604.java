package obf;

import net.minecraft.block.Block;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1604
extends class_0609 {
    protected class_2102 lIlIIllllIlIIIIllIIIIlIIl;

    protected class_1604() {
        super(true);
    }

    @Override
    public class_2102 lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        return (n2 & 8) == 0 ? this.llIIIIllIIIIIIIlIIIlIIIIl : this.lIlIIllllIlIIIIllIIIIlIIl;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
        super.lllIIIllIIIIlllIlIIllIIll(class_08872);
        this.lIlIIllllIlIIIIllIIIIlIIl = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_powered");
    }

    protected boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, int n4, boolean bl, int n5) {
        if (n5 >= 8) {
            return false;
        }
        int n6 = n4 & 7;
        boolean bl2 = true;
        switch (n6) {
            case 0: {
                if (bl) {
                    ++n3;
                    break;
                }
                --n3;
                break;
            }
            case 1: {
                if (bl) {
                    --n;
                    break;
                }
                ++n;
                break;
            }
            case 2: {
                if (bl) {
                    --n;
                } else {
                    ++n;
                    ++n2;
                    bl2 = false;
                }
                n6 = 1;
                break;
            }
            case 3: {
                if (bl) {
                    --n;
                    ++n2;
                    bl2 = false;
                } else {
                    ++n;
                }
                n6 = 1;
                break;
            }
            case 4: {
                if (bl) {
                    ++n3;
                } else {
                    --n3;
                    ++n2;
                    bl2 = false;
                }
                n6 = 0;
                break;
            }
            case 5: {
                if (bl) {
                    ++n3;
                    ++n2;
                    bl2 = false;
                } else {
                    --n3;
                }
                n6 = 0;
            }
        }
        return this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, bl, n5, n6) ? true : bl2 && this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2 - 1, n3, bl, n5, n6);
    }

    protected boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, boolean bl, int n4, int n5) {
        Block class_05492 = class_13342.a_(n, n2, n3);
        if (class_05492 == this) {
            int n6 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
            int n7 = n6 & 7;
            if (n5 == 1 && (n7 == 0 || n7 == 4 || n7 == 5)) {
                return false;
            }
            if (n5 == 0 && (n7 == 1 || n7 == 2 || n7 == 3)) {
                return false;
            }
            if ((n6 & 8) != 0) {
                if (class_13342.lIIlIIIIIlIlllIlIIlIlIlll(n, n2, n3)) {
                    return true;
                }
                return this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, n6, bl, n4 + 1);
            }
        }
        return false;
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, int n4, int n5, Block class_05492) {
        boolean bl = class_13342.lIIlIIIIIlIlllIlIIlIlIlll(n, n2, n3);
        bl = bl || this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, n4, true, 0) || this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, n4, false, 0);
        boolean bl2 = false;
        if (bl && (n4 & 8) == 0) {
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n5 | 8, 3);
            bl2 = true;
        } else if (!bl && (n4 & 8) != 0) {
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n5, 3);
            bl2 = true;
        }
        if (bl2) {
            class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2 - 1, n3, this);
            if (n5 == 2 || n5 == 3 || n5 == 4 || n5 == 5) {
                class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2 + 1, n3, this);
            }
        }
    }
}

