package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

import java.util.Random;

public class class_1060
extends class_0816 {
    int llllllIlIllllIlIlIlIIIIlI;
    boolean[] lIlIIllllIlIIIIllIIIIlIIl = new boolean[4];
    int[] llIlllIIllIlllIlIlIlIIIll = new int[4];

    protected class_1060(class_1855 class_18552) {
        super(class_18552);
    }

    private void llIIlllIllIllllIIIlIIIIII(class_1334 class_13342, int n, int n2, int n3) {
        int n4 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, Block.lllIIIllIIIIlllIlIIllIIll(Block.lllIIIllIIIIlllIlIIllIIll(this) + 1), n4, 2);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Random random) {
        int n4;
        int n5 = this.IllIIIllIIIIlIlIlIllIIlll(class_13342, n, n2, n3);
        int n6 = 1;
        if (this.IlIlIIlllIllllllllIIIlIlI == class_1855.IIIllIllIIlIlIlIlIllllIIl && !class_13342.IlIlIIlllIIlIllIIIlllllIl.lIllllIIlIIIlIllllllIIIll) {
            n6 = 2;
        }
        boolean bl = true;
        int n7 = this.lllIIIllIIIIlllIlIIllIIll(class_13342);
        if (n5 > 0) {
            int n8 = -100;
            this.llllllIlIllllIlIlIlIIIIlI = 0;
            int n9 = this.IIIllIIlIIIIIIlIlIIllIIlI(class_13342, n - 1, n2, n3, n8);
            n9 = this.IIIllIIlIIIIIIlIlIIllIIlI(class_13342, n + 1, n2, n3, n9);
            n9 = this.IIIllIIlIIIIIIlIlIIllIIlI(class_13342, n, n2, n3 - 1, n9);
            n4 = (n9 = this.IIIllIIlIIIIIIlIlIIllIIlI(class_13342, n, n2, n3 + 1, n9)) + n6;
            if (n4 >= 8 || n9 < 0) {
                n4 = -1;
            }
            if (this.IllIIIllIIIIlIlIlIllIIlll(class_13342, n, n2 + 1, n3) >= 0) {
                int n10 = this.IllIIIllIIIIlIlIlIllIIlll(class_13342, n, n2 + 1, n3);
                n4 = n10 >= 8 ? n10 : n10 + 8;
            }
            if (this.llllllIlIllllIlIlIlIIIIlI >= 2 && this.IlIlIIlllIllllllllIIIlIlI == class_1855.IllIIlllllllIIlIIlIIIIlIl) {
                if (class_13342.a_(n, n2 - 1, n3).lIllllIIlIIIlIllllllIIIll().lllIlIIlIIIlIlIIIllIlllIl()) {
                    n4 = 0;
                } else if (class_13342.a_(n, n2 - 1, n3).lIllllIIlIIIlIllllllIIIll() == this.IlIlIIlllIllllllllIIIlIlI && class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2 - 1, n3) == 0) {
                    n4 = 0;
                }
            }
            if (this.IlIlIIlllIllllllllIIIlIlI == class_1855.IIIllIllIIlIlIlIlIllllIIl && n5 < 8 && n4 < 8 && n4 > n5 && random.nextInt(4) != 0) {
                n7 *= 4;
            }
            if (n4 == n5) {
                if (bl) {
                    this.llIIlllIllIllllIIIlIIIIII(class_13342, n, n2, n3);
                }
            } else {
                n5 = n4;
                if (n4 < 0) {
                    class_13342.lIllllIIlIIIlIllllllIIIll(n, n2, n3);
                } else {
                    class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n4, 2);
                    class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3, this, n7);
                    class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3, this);
                }
            }
        } else {
            this.llIIlllIllIllllIIIlIIIIII(class_13342, n, n2, n3);
        }
        if (this.IlIlllIIIIIIlIIllIIllIlll(class_13342, n, n2 - 1, n3)) {
            if (this.IlIlIIlllIllllllllIIIlIlI == class_1855.IIIllIllIIlIlIlIlIllllIIl && class_13342.a_(n, n2 - 1, n3).lIllllIIlIIIlIllllllIIIll() == class_1855.IllIIlllllllIIlIIlIIIIlIl) {
                class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2 - 1, n3, Blocks.lllIlIIlIIIlIlIIIllIlllIl);
                this.lIIIIlIlIIlllllIIllIIlIII(class_13342, n, n2 - 1, n3);
                return;
            }
            if (n5 >= 8) {
                this.IllIIlllllllIIlIIlIIIIlIl(class_13342, n, n2 - 1, n3, n5);
            } else {
                this.IllIIlllllllIIlIIlIIIIlIl(class_13342, n, n2 - 1, n3, n5 + 8);
            }
        } else if (n5 >= 0 && (n5 == 0 || this.lllIIlIIIllllllIIIIlIlIlI(class_13342, n, n2 - 1, n3))) {
            boolean[] arrbl = this.llIIllIllIlIIlIIllIllllll(class_13342, n, n2, n3);
            n4 = n5 + n6;
            if (n5 >= 8) {
                n4 = 1;
            }
            if (n4 >= 8) {
                return;
            }
            if (arrbl[0]) {
                this.IllIIlllllllIIlIIlIIIIlIl(class_13342, n - 1, n2, n3, n4);
            }
            if (arrbl[1]) {
                this.IllIIlllllllIIlIIlIIIIlIl(class_13342, n + 1, n2, n3, n4);
            }
            if (arrbl[2]) {
                this.IllIIlllllllIIlIIlIIIIlIl(class_13342, n, n2, n3 - 1, n4);
            }
            if (arrbl[3]) {
                this.IllIIlllllllIIlIIlIIIIlIl(class_13342, n, n2, n3 + 1, n4);
            }
        }
    }

    private void IllIIlllllllIIlIIlIIIIlIl(class_1334 class_13342, int n, int n2, int n3, int n4) {
        if (this.IlIlllIIIIIIlIIllIIllIlll(class_13342, n, n2, n3)) {
            Block class_05492 = class_13342.a_(n, n2, n3);
            if (this.IlIlIIlllIllllllllIIIlIlI == class_1855.IIIllIllIIlIlIlIlIllllIIl) {
                this.lIIIIlIlIIlllllIIllIIlIII(class_13342, n, n2, n3);
            } else {
                class_05492.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3), 0);
            }
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, this, n4, 3);
        }
    }

    private int IlIllllllIIlIIllllIIlIIIl(class_1334 class_13342, int n, int n2, int n3, int n4, int n5) {
        int n6 = 1000;
        for (int i = 0; i < 4; ++i) {
            int n7;
            if (i == 0 && n5 == 1 || i == 1 && n5 == 0 || i == 2 && n5 == 3 || i == 3 && n5 == 2) continue;
            int n8 = n;
            int n9 = n3;
            if (i == 0) {
                n8 = n - 1;
            }
            if (i == 1) {
                ++n8;
            }
            if (i == 2) {
                n9 = n3 - 1;
            }
            if (i == 3) {
                ++n9;
            }
            if (this.lllIIlIIIllllllIIIIlIlIlI(class_13342, n8, n2, n9) || class_13342.a_(n8, n2, n9).lIllllIIlIIIlIllllllIIIll() == this.IlIlIIlllIllllllllIIIlIlI && class_13342.IlIllllllIIlIIllllIIlIIIl(n8, n2, n9) == 0) continue;
            if (!this.lllIIlIIIllllllIIIIlIlIlI(class_13342, n8, n2 - 1, n9)) {
                return n4;
            }
            if (n4 >= 4 || (n7 = this.IlIllllllIIlIIllllIIlIIIl(class_13342, n8, n2, n9, n4 + 1, i)) >= n6) continue;
            n6 = n7;
        }
        return n6;
    }

    private boolean[] llIIllIllIlIIlIIllIllllll(class_1334 class_13342, int n, int n2, int n3) {
        int n4;
        int n5;
        for (n5 = 0; n5 < 4; ++n5) {
            this.llIlllIIllIlllIlIlIlIIIll[n5] = 1000;
            n4 = n;
            int n6 = n3;
            if (n5 == 0) {
                n4 = n - 1;
            }
            if (n5 == 1) {
                ++n4;
            }
            if (n5 == 2) {
                n6 = n3 - 1;
            }
            if (n5 == 3) {
                ++n6;
            }
            if (this.lllIIlIIIllllllIIIIlIlIlI(class_13342, n4, n2, n6) || class_13342.a_(n4, n2, n6).lIllllIIlIIIlIllllllIIIll() == this.IlIlIIlllIllllllllIIIlIlI && class_13342.IlIllllllIIlIIllllIIlIIIl(n4, n2, n6) == 0) continue;
            this.llIlllIIllIlllIlIlIlIIIll[n5] = this.lllIIlIIIllllllIIIIlIlIlI(class_13342, n4, n2 - 1, n6) ? this.IlIllllllIIlIIllllIIlIIIl(class_13342, n4, n2, n6, 1, n5) : 0;
        }
        n5 = this.llIlllIIllIlllIlIlIlIIIll[0];
        for (n4 = 1; n4 < 4; ++n4) {
            if (this.llIlllIIllIlllIlIlIlIIIll[n4] >= n5) continue;
            n5 = this.llIlllIIllIlllIlIlIlIIIll[n4];
        }
        for (n4 = 0; n4 < 4; ++n4) {
            this.lIlIIllllIlIIIIllIIIIlIIl[n4] = this.llIlllIIllIlllIlIlIlIIIll[n4] == n5;
        }
        return this.lIlIIllllIlIIIIllIIIIlIIl;
    }

    private boolean lllIIlIIIllllllIIIIlIlIlI(class_1334 class_13342, int n, int n2, int n3) {
        Block class_05492 = class_13342.a_(n, n2, n3);
        return class_05492 != Blocks.IlIIllIlIlIllIIIlIIlIlIIl && class_05492 != Blocks.IlIIIIIllIlllIIIIlIIIllIl && class_05492 != Blocks.IlIlIllIIlIIIIlllIlIllIlI && class_05492 != Blocks.lIlIIllIllIIIIIlIllllIIIl && class_05492 != Blocks.lIIlllIIlIlIlIIIlIlllIIll ? (class_05492.IlIlIIlllIllllllllIIIlIlI == class_1855.IIlIIlIlIlIllIIlIlIIIIlll ? true : class_05492.IlIlIIlllIllllllllIIIlIlI.lIlllIlllIIIIlIIlllIllIII()) : true;
    }

    protected int IIIllIIlIIIIIIlIlIIllIIlI(class_1334 class_13342, int n, int n2, int n3, int n4) {
        int n5 = this.IllIIIllIIIIlIlIlIllIIlll(class_13342, n, n2, n3);
        if (n5 < 0) {
            return n4;
        }
        if (n5 == 0) {
            ++this.llllllIlIllllIlIlIlIIIIlI;
        }
        if (n5 >= 8) {
            n5 = 0;
        }
        return n4 >= 0 && n5 >= n4 ? n4 : n5;
    }

    private boolean IlIlllIIIIIIlIIllIIllIlll(class_1334 class_13342, int n, int n2, int n3) {
        class_1855 class_18552 = class_13342.a_(n, n2, n3).lIllllIIlIIIlIllllllIIIll();
        return class_18552 == this.IlIlIIlllIllllllllIIIlIlI ? false : (class_18552 == class_1855.IIIllIllIIlIlIlIlIllllIIl ? false : !this.lllIIlIIIllllllIIIIlIlIlI(class_13342, n, n2, n3));
    }

    @Override
    public void lIlllIlllIIIIlIIlllIllIII(class_1334 class_13342, int n, int n2, int n3) {
        super.lIlllIlllIIIIlIIlllIllIII(class_13342, n, n2, n3);
        if (class_13342.a_(n, n2, n3) == this) {
            class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3, this, this.lllIIIllIIIIlllIlIIllIIll(class_13342));
        }
    }

    @Override
    public boolean llIIIIllIIIIIIIlIIIlIIIIl() {
        return true;
    }
}

