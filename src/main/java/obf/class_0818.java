package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;

import java.util.ArrayList;
import java.util.List;

public class class_0818 {
    private class_1334 lllIlIIlIIIlIlIIIllIlllIl;
    private int IlIllllllIIlIIllllIIlIIIl;
    private int lIlllIlllIIIIlIIlllIllIII;
    private int IlIIIIIllllllIIlllIllllll;
    private final boolean lIllllIIlIIIlIllllllIIIll;
    private List IIIllIIlIIIIIIlIlIIllIIlI = new ArrayList();
    final /* synthetic */ class_0609 lllIIIllIIIIlllIlIIllIIll;

    public class_0818(class_0609 class_06092, class_1334 class_13342, int n, int n2, int n3) {
        this.lllIIIllIIIIlllIlIIllIIll = class_06092;
        this.lllIlIIlIIIlIlIIIllIlllIl = class_13342;
        this.IlIllllllIIlIIllllIIlIIIl = n;
        this.lIlllIlllIIIIlIIlllIllIII = n2;
        this.IlIIIIIllllllIIlllIllllll = n3;
        Block class_05492 = class_13342.a_(n, n2, n3);
        int n4 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        if (((class_0609)class_05492).llllllIlIllllIlIlIlIIIIlI) {
            this.lIllllIIlIIIlIllllllIIIll = true;
            n4 &= 0xFFFFFFF7;
        } else {
            this.lIllllIIlIIIlIllllllIIIll = false;
        }
        this.lllIIIllIIIIlllIlIIllIIll(n4);
    }

    private void lllIIIllIIIIlllIlIIllIIll(int n) {
        this.IIIllIIlIIIIIIlIlIIllIIlI.clear();
        if (n == 0) {
            this.IIIllIIlIIIIIIlIlIIllIIlI.add(new class_2137(this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll - 1));
            this.IIIllIIlIIIIIIlIlIIllIIlI.add(new class_2137(this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll + 1));
        } else if (n == 1) {
            this.IIIllIIlIIIIIIlIlIIllIIlI.add(new class_2137(this.IlIllllllIIlIIllllIIlIIIl - 1, this.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll));
            this.IIIllIIlIIIIIIlIlIIllIIlI.add(new class_2137(this.IlIllllllIIlIIllllIIlIIIl + 1, this.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll));
        } else if (n == 2) {
            this.IIIllIIlIIIIIIlIlIIllIIlI.add(new class_2137(this.IlIllllllIIlIIllllIIlIIIl - 1, this.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll));
            this.IIIllIIlIIIIIIlIlIIllIIlI.add(new class_2137(this.IlIllllllIIlIIllllIIlIIIl + 1, this.lIlllIlllIIIIlIIlllIllIII + 1, this.IlIIIIIllllllIIlllIllllll));
        } else if (n == 3) {
            this.IIIllIIlIIIIIIlIlIIllIIlI.add(new class_2137(this.IlIllllllIIlIIllllIIlIIIl - 1, this.lIlllIlllIIIIlIIlllIllIII + 1, this.IlIIIIIllllllIIlllIllllll));
            this.IIIllIIlIIIIIIlIlIIllIIlI.add(new class_2137(this.IlIllllllIIlIIllllIIlIIIl + 1, this.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll));
        } else if (n == 4) {
            this.IIIllIIlIIIIIIlIlIIllIIlI.add(new class_2137(this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII + 1, this.IlIIIIIllllllIIlllIllllll - 1));
            this.IIIllIIlIIIIIIlIlIIllIIlI.add(new class_2137(this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll + 1));
        } else if (n == 5) {
            this.IIIllIIlIIIIIIlIlIIllIIlI.add(new class_2137(this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll - 1));
            this.IIIllIIlIIIIIIlIlIIllIIlI.add(new class_2137(this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII + 1, this.IlIIIIIllllllIIlllIllllll + 1));
        } else if (n == 6) {
            this.IIIllIIlIIIIIIlIlIIllIIlI.add(new class_2137(this.IlIllllllIIlIIllllIIlIIIl + 1, this.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll));
            this.IIIllIIlIIIIIIlIlIIllIIlI.add(new class_2137(this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll + 1));
        } else if (n == 7) {
            this.IIIllIIlIIIIIIlIlIIllIIlI.add(new class_2137(this.IlIllllllIIlIIllllIIlIIIl - 1, this.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll));
            this.IIIllIIlIIIIIIlIlIIllIIlI.add(new class_2137(this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll + 1));
        } else if (n == 8) {
            this.IIIllIIlIIIIIIlIlIIllIIlI.add(new class_2137(this.IlIllllllIIlIIllllIIlIIIl - 1, this.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll));
            this.IIIllIIlIIIIIIlIlIIllIIlI.add(new class_2137(this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll - 1));
        } else if (n == 9) {
            this.IIIllIIlIIIIIIlIlIIllIIlI.add(new class_2137(this.IlIllllllIIlIIllllIIlIIIl + 1, this.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll));
            this.IIIllIIlIIIIIIlIlIIllIIlI.add(new class_2137(this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll - 1));
        }
    }

    private void lllIlIIlIIIlIlIIIllIlllIl() {
        for (int i = 0; i < this.IIIllIIlIIIIIIlIlIIllIIlI.size(); ++i) {
            class_0818 class_08182 = this.lllIIIllIIIIlllIlIIllIIll((class_2137)this.IIIllIIlIIIIIIlIlIIllIIlI.get(i));
            if (class_08182 != null && class_08182.lllIIIllIIIIlllIlIIllIIll(this)) {
                this.IIIllIIlIIIIIIlIlIIllIIlI.set(i, new class_2137(class_08182.IlIllllllIIlIIllllIIlIIIl, class_08182.lIlllIlllIIIIlIIlllIllIII, class_08182.IlIIIIIllllllIIlllIllllll));
                continue;
            }
            this.IIIllIIlIIIIIIlIlIIllIIlI.remove(i--);
        }
    }

    private boolean lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        return class_0609.IllIIIllIIIIlIlIlIllIIlll(this.lllIlIIlIIIlIlIIIllIlllIl, n, n2, n3) ? true : (class_0609.IllIIIllIIIIlIlIlIllIIlll(this.lllIlIIlIIIlIlIIIllIlllIl, n, n2 + 1, n3) ? true : class_0609.IllIIIllIIIIlIlIlIllIIlll(this.lllIlIIlIIIlIlIIIllIlllIl, n, n2 - 1, n3));
    }

    private class_0818 lllIIIllIIIIlllIlIIllIIll(class_2137 class_21372) {
        class_0818 class_08182;
        if (class_0609.IllIIIllIIIIlIlIlIllIIlll(this.lllIlIIlIIIlIlIIIllIlllIl, class_21372.lllIIIllIIIIlllIlIIllIIll, class_21372.lllIlIIlIIIlIlIIIllIlllIl, class_21372.IlIllllllIIlIIllllIIlIIIl)) {
            class_0609 class_06092 = this.lllIIIllIIIIlllIlIIllIIll;
            class_06092.getClass();
            class_08182 = new class_0818(class_06092, this.lllIlIIlIIIlIlIIIllIlllIl, class_21372.lllIIIllIIIIlllIlIIllIIll, class_21372.lllIlIIlIIIlIlIIIllIlllIl, class_21372.IlIllllllIIlIIllllIIlIIIl);
        } else if (class_0609.IllIIIllIIIIlIlIlIllIIlll(this.lllIlIIlIIIlIlIIIllIlllIl, class_21372.lllIIIllIIIIlllIlIIllIIll, class_21372.lllIlIIlIIIlIlIIIllIlllIl + 1, class_21372.IlIllllllIIlIIllllIIlIIIl)) {
            class_0609 class_06093 = this.lllIIIllIIIIlllIlIIllIIll;
            class_06093.getClass();
            class_08182 = new class_0818(class_06093, this.lllIlIIlIIIlIlIIIllIlllIl, class_21372.lllIIIllIIIIlllIlIIllIIll, class_21372.lllIlIIlIIIlIlIIIllIlllIl + 1, class_21372.IlIllllllIIlIIllllIIlIIIl);
        } else if (class_0609.IllIIIllIIIIlIlIlIllIIlll(this.lllIlIIlIIIlIlIIIllIlllIl, class_21372.lllIIIllIIIIlllIlIIllIIll, class_21372.lllIlIIlIIIlIlIIIllIlllIl - 1, class_21372.IlIllllllIIlIIllllIIlIIIl)) {
            class_0609 class_06094 = this.lllIIIllIIIIlllIlIIllIIll;
            class_06094.getClass();
            class_08182 = new class_0818(class_06094, this.lllIlIIlIIIlIlIIIllIlllIl, class_21372.lllIIIllIIIIlllIlIIllIIll, class_21372.lllIlIIlIIIlIlIIIllIlllIl - 1, class_21372.IlIllllllIIlIIllllIIlIIIl);
        } else {
            class_08182 = null;
        }
        return class_08182;
    }

    private boolean lllIIIllIIIIlllIlIIllIIll(class_0818 class_08182) {
        for (int i = 0; i < this.IIIllIIlIIIIIIlIlIIllIIlI.size(); ++i) {
            class_2137 class_21372 = (class_2137)this.IIIllIIlIIIIIIlIlIIllIIlI.get(i);
            if (class_21372.lllIIIllIIIIlllIlIIllIIll != class_08182.IlIllllllIIlIIllllIIlIIIl || class_21372.IlIllllllIIlIIllllIIlIIIl != class_08182.IlIIIIIllllllIIlllIllllll) continue;
            return true;
        }
        return false;
    }

    private boolean lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, int n3) {
        for (int i = 0; i < this.IIIllIIlIIIIIIlIlIIllIIlI.size(); ++i) {
            class_2137 class_21372 = (class_2137)this.IIIllIIlIIIIIIlIlIIllIIlI.get(i);
            if (class_21372.lllIIIllIIIIlllIlIIllIIll != n || class_21372.IlIllllllIIlIIllllIIlIIIl != n3) continue;
            return true;
        }
        return false;
    }

    protected int lllIIIllIIIIlllIlIIllIIll() {
        int n = 0;
        if (this.lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll - 1)) {
            ++n;
        }
        if (this.lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll + 1)) {
            ++n;
        }
        if (this.lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl - 1, this.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll)) {
            ++n;
        }
        if (this.lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl + 1, this.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll)) {
            ++n;
        }
        return n;
    }

    private boolean lllIlIIlIIIlIlIIIllIlllIl(class_0818 class_08182) {
        return this.lllIIIllIIIIlllIlIIllIIll(class_08182) ? true : (this.IIIllIIlIIIIIIlIlIIllIIlI.size() == 2 ? false : (this.IIIllIIlIIIIIIlIlIIllIIlI.isEmpty() ? true : true));
    }

    private void IlIllllllIIlIIllllIIlIIIl(class_0818 class_08182) {
        this.IIIllIIlIIIIIIlIlIIllIIlI.add(new class_2137(class_08182.IlIllllllIIlIIllllIIlIIIl, class_08182.lIlllIlllIIIIlIIlllIllIII, class_08182.IlIIIIIllllllIIlllIllllll));
        boolean bl = this.lllIlIIlIIIlIlIIIllIlllIl(this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll - 1);
        boolean bl2 = this.lllIlIIlIIIlIlIIIllIlllIl(this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll + 1);
        boolean bl3 = this.lllIlIIlIIIlIlIIIllIlllIl(this.IlIllllllIIlIIllllIIlIIIl - 1, this.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll);
        boolean bl4 = this.lllIlIIlIIIlIlIIIllIlllIl(this.IlIllllllIIlIIllllIIlIIIl + 1, this.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll);
        int n = -1;
        if (bl || bl2) {
            n = 0;
        }
        if (bl3 || bl4) {
            n = 1;
        }
        if (!this.lIllllIIlIIIlIllllllIIIll) {
            if (bl2 && bl4 && !bl && !bl3) {
                n = 6;
            }
            if (bl2 && bl3 && !bl && !bl4) {
                n = 7;
            }
            if (bl && bl3 && !bl2 && !bl4) {
                n = 8;
            }
            if (bl && bl4 && !bl2 && !bl3) {
                n = 9;
            }
        }
        if (n == 0) {
            if (class_0609.IllIIIllIIIIlIlIlIllIIlll(this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII + 1, this.IlIIIIIllllllIIlllIllllll - 1)) {
                n = 4;
            }
            if (class_0609.IllIIIllIIIIlIlIlIllIIlll(this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII + 1, this.IlIIIIIllllllIIlllIllllll + 1)) {
                n = 5;
            }
        }
        if (n == 1) {
            if (class_0609.IllIIIllIIIIlIlIlIllIIlll(this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl + 1, this.lIlllIlllIIIIlIIlllIllIII + 1, this.IlIIIIIllllllIIlllIllllll)) {
                n = 2;
            }
            if (class_0609.IllIIIllIIIIlIlIlIllIIlll(this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl - 1, this.lIlllIlllIIIIlIIlllIllIII + 1, this.IlIIIIIllllllIIlllIllllll)) {
                n = 3;
            }
        }
        if (n < 0) {
            n = 0;
        }
        int n2 = n;
        if (this.lIllllIIlIIIlIllllllIIIll) {
            n2 = this.lllIlIIlIIIlIlIIIllIlllIl.IlIllllllIIlIIllllIIlIIIl(this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll) & 8 | n;
        }
        this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll, n2, 3);
    }

    private boolean IlIllllllIIlIIllllIIlIIIl(int n, int n2, int n3) {
        class_0818 class_08182 = this.lllIIIllIIIIlllIlIIllIIll(new class_2137(n, n2, n3));
        if (class_08182 == null) {
            return false;
        }
        class_08182.lllIlIIlIIIlIlIIIllIlllIl();
        return class_08182.lllIlIIlIIIlIlIIIllIlllIl(this);
    }

    public void lllIIIllIIIIlllIlIIllIIll(boolean bl, boolean bl2) {
        boolean bl3 = this.IlIllllllIIlIIllllIIlIIIl(this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll - 1);
        boolean bl4 = this.IlIllllllIIlIIllllIIlIIIl(this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll + 1);
        boolean bl5 = this.IlIllllllIIlIIllllIIlIIIl(this.IlIllllllIIlIIllllIIlIIIl - 1, this.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll);
        boolean bl6 = this.IlIllllllIIlIIllllIIlIIIl(this.IlIllllllIIlIIllllIIlIIIl + 1, this.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll);
        int n = -1;
        if ((bl3 || bl4) && !bl5 && !bl6) {
            n = 0;
        }
        if ((bl5 || bl6) && !bl3 && !bl4) {
            n = 1;
        }
        if (!this.lIllllIIlIIIlIllllllIIIll) {
            if (bl4 && bl6 && !bl3 && !bl5) {
                n = 6;
            }
            if (bl4 && bl5 && !bl3 && !bl6) {
                n = 7;
            }
            if (bl3 && bl5 && !bl4 && !bl6) {
                n = 8;
            }
            if (bl3 && bl6 && !bl4 && !bl5) {
                n = 9;
            }
        }
        if (n == -1) {
            if (bl3 || bl4) {
                n = 0;
            }
            if (bl5 || bl6) {
                n = 1;
            }
            if (!this.lIllllIIlIIIlIllllllIIIll) {
                if (bl) {
                    if (bl4 && bl6) {
                        n = 6;
                    }
                    if (bl5 && bl4) {
                        n = 7;
                    }
                    if (bl6 && bl3) {
                        n = 9;
                    }
                    if (bl3 && bl5) {
                        n = 8;
                    }
                } else {
                    if (bl3 && bl5) {
                        n = 8;
                    }
                    if (bl6 && bl3) {
                        n = 9;
                    }
                    if (bl5 && bl4) {
                        n = 7;
                    }
                    if (bl4 && bl6) {
                        n = 6;
                    }
                }
            }
        }
        if (n == 0) {
            if (class_0609.IllIIIllIIIIlIlIlIllIIlll(this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII + 1, this.IlIIIIIllllllIIlllIllllll - 1)) {
                n = 4;
            }
            if (class_0609.IllIIIllIIIIlIlIlIllIIlll(this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII + 1, this.IlIIIIIllllllIIlllIllllll + 1)) {
                n = 5;
            }
        }
        if (n == 1) {
            if (class_0609.IllIIIllIIIIlIlIlIllIIlll(this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl + 1, this.lIlllIlllIIIIlIIlllIllIII + 1, this.IlIIIIIllllllIIlllIllllll)) {
                n = 2;
            }
            if (class_0609.IllIIIllIIIIlIlIlIllIIlll(this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl - 1, this.lIlllIlllIIIIlIIlllIllIII + 1, this.IlIIIIIllllllIIlllIllllll)) {
                n = 3;
            }
        }
        if (n < 0) {
            n = 0;
        }
        this.lllIIIllIIIIlllIlIIllIIll(n);
        int n2 = n;
        if (this.lIllllIIlIIIlIllllllIIIll) {
            n2 = this.lllIlIIlIIIlIlIIIllIlllIl.IlIllllllIIlIIllllIIlIIIl(this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll) & 8 | n;
        }
        if (bl2 || this.lllIlIIlIIIlIlIIIllIlllIl.IlIllllllIIlIIllllIIlIIIl(this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll) != n2) {
            this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll, n2, 3);
            for (int i = 0; i < this.IIIllIIlIIIIIIlIlIIllIIlI.size(); ++i) {
                class_0818 class_08182 = this.lllIIIllIIIIlllIlIIllIIll((class_2137)this.IIIllIIlIIIIIIlIlIIllIIlI.get(i));
                if (class_08182 == null) continue;
                class_08182.lllIlIIlIIIlIlIIIllIlllIl();
                if (!class_08182.lllIlIIlIIIlIlIIIllIlllIl(this)) continue;
                class_08182.IlIllllllIIlIIllllIIlIIIl(this);
            }
        }
    }
}

