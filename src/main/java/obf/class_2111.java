package obf;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.MathHelper;

/*
 * Decompiled with CFR 0.150.
 */
public class class_2111 {
    private class_1843 lllIIIllIIIIlllIlIIllIIll;
    private class_0168 lllIlIIlIIIlIlIIIllIlllIl = new class_0168();
    private class_1890 IlIllllllIIlIIllllIIlIIIl = new class_1890();
    private class_2120[] lIlllIlllIIIIlIIlllIllIII = new class_2120[32];
    private boolean IlIIIIIllllllIIlllIllllll;
    private boolean lIllllIIlIIIlIllllllIIIll;
    private boolean IIIllIIlIIIIIIlIlIIllIIlI;
    private boolean IllIIlllllllIIlIIlIIIIlIl;

    public class_2111(class_1843 class_18432, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        this.lllIIIllIIIIlllIlIIllIIll = class_18432;
        this.IlIIIIIllllllIIlllIllllll = bl;
        this.lIllllIIlIIIlIllllllIIIll = bl2;
        this.IIIllIIlIIIIIIlIlIIllIIlI = bl3;
        this.IllIIlllllllIIlIIlIIIIlIl = bl4;
    }

    public class_2086 lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, class_1521 class_15213, float f) {
        return this.lllIIIllIIIIlllIlIIllIIll(class_15212, class_15213.IlIIlllllIIlIlIlllllIllll, class_15213.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl, class_15213.IllIIIIllIIllIllIlllIlIIl, f);
    }

    public class_2086 lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, int n, int n2, int n3, float f) {
        return this.lllIIIllIIIIlllIlIIllIIll(class_15212, (float)n + 0.5f, (float)n2 + 0.5f, (float)n3 + 0.5f, f);
    }

    private class_2086 lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, double d, double d2, double d3, float f) {
        Object object;
        this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll();
        this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll();
        boolean bl = this.IIIllIIlIIIIIIlIlIIllIIlI;
        int n = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_15212.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl + 0.5);
        if (this.IllIIlllllllIIlIIlIIIIlIl && class_15212.llIlllIlIIllIlIIIIllIIlIl()) {
            n = (int)class_15212.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl;
            object = this.lllIIIllIIIIlllIlIIllIIll.a_(MathHelper.IlIllllllIIlIIllllIIlIIIl(class_15212.IlIIlllllIIlIlIlllllIllll), n, MathHelper.IlIllllllIIlIIllllIIlIIIl(class_15212.IllIIIIllIIllIllIlllIlIIl));
            while (object == Blocks.IIIllIllIIlIlIlIlIllllIIl || object == Blocks.IllIIIllIIIIlIlIlIllIIlll) {
                object = this.lllIIIllIIIIlllIlIIllIIll.a_(MathHelper.IlIllllllIIlIIllllIIlIIIl(class_15212.IlIIlllllIIlIlIlllllIllll), ++n, MathHelper.IlIllllllIIlIIllllIIlIIIl(class_15212.IllIIIIllIIllIllIlllIlIIl));
            }
            bl = this.IIIllIIlIIIIIIlIlIIllIIlI;
            this.IIIllIIlIIIIIIlIlIIllIIlI = false;
        } else {
            n = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_15212.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl + 0.5);
        }
        object = this.lllIIIllIIIIlllIlIIllIIll(MathHelper.IlIllllllIIlIIllllIIlIIIl(class_15212.IIllIllIIllIIlllIIIlIlllI.lllIIIllIIIIlllIlIIllIIll), n, MathHelper.IlIllllllIIlIIllllIIlIIIl(class_15212.IIllIllIIllIIlllIIIlIlllI.IlIllllllIIlIIllllIIlIIIl));
        class_2120 class_21202 = this.lllIIIllIIIIlllIlIIllIIll(MathHelper.IlIllllllIIlIIllllIIlIIIl(d - (double)(class_15212.IIIIlIlIIlIIIIlIlllIlIIII / 2.0f)), MathHelper.IlIllllllIIlIIllllIIlIIIl(d2), MathHelper.IlIllllllIIlIIllllIIlIIIl(d3 - (double)(class_15212.IIIIlIlIIlIIIIlIlllIlIIII / 2.0f)));
        class_2120 class_21203 = new class_2120(MathHelper.lIlllIlllIIIIlIIlllIllIII(class_15212.IIIIlIlIIlIIIIlIlllIlIIII + 1.0f), MathHelper.lIlllIlllIIIIlIIlllIllIII(class_15212.lllIIIIlIlIIlIIlllIIIIIIl + 1.0f), MathHelper.lIlllIlllIIIIlIIlllIllIII(class_15212.IIIIlIlIIlIIIIlIlllIlIIII + 1.0f));
        class_2086 class_20862 = this.lllIIIllIIIIlllIlIIllIIll(class_15212, (class_2120)object, class_21202, class_21203, f);
        this.IIIllIIlIIIIIIlIlIIllIIlI = bl;
        return class_20862;
    }

    private class_2086 lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, class_2120 class_21202, class_2120 class_21203, class_2120 class_21204, float f) {
        class_21202.IlIIIIIllllllIIlllIllllll = 0.0f;
        class_21202.IIIllIIlIIIIIIlIlIIllIIlI = class_21202.lIllllIIlIIIlIllllllIIIll = class_21202.lllIlIIlIIIlIlIIIllIlllIl(class_21203);
        this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll();
        this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(class_21202);
        class_2120 class_21205 = class_21202;
        while (!this.lllIlIIlIIIlIlIIIllIlllIl.IlIllllllIIlIIllllIIlIIIl()) {
            class_2120 class_21206 = this.lllIlIIlIIIlIlIIIllIlllIl.lllIlIIlIIIlIlIIIllIlllIl();
            if (class_21206.equals(class_21203)) {
                return this.lllIIIllIIIIlllIlIIllIIll(class_21202, class_21203);
            }
            if (class_21206.lllIlIIlIIIlIlIIIllIlllIl(class_21203) < class_21205.lllIlIIlIIIlIlIIIllIlllIl(class_21203)) {
                class_21205 = class_21206;
            }
            class_21206.IIIllIllIIlIlIlIlIllllIIl = true;
            int n = this.lllIlIIlIIIlIlIIIllIlllIl(class_15212, class_21206, class_21204, class_21203, f);
            for (int i = 0; i < n; ++i) {
                class_2120 class_21207 = this.lIlllIlllIIIIlIIlllIllIII[i];
                float f2 = class_21206.IlIIIIIllllllIIlllIllllll + class_21206.lllIlIIlIIIlIlIIIllIlllIl(class_21207);
                if (class_21207.lllIIIllIIIIlllIlIIllIIll() && !(f2 < class_21207.IlIIIIIllllllIIlllIllllll)) continue;
                class_21207.IllIIlllllllIIlIIlIIIIlIl = class_21206;
                class_21207.IlIIIIIllllllIIlllIllllll = f2;
                class_21207.lIllllIIlIIIlIllllllIIIll = class_21207.lllIlIIlIIIlIlIIIllIlllIl(class_21203);
                if (class_21207.lllIIIllIIIIlllIlIIllIIll()) {
                    this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(class_21207, class_21207.IlIIIIIllllllIIlllIllllll + class_21207.lIllllIIlIIIlIllllllIIIll);
                    continue;
                }
                class_21207.IIIllIIlIIIIIIlIlIIllIIlI = class_21207.IlIIIIIllllllIIlllIllllll + class_21207.lIllllIIlIIIlIllllllIIIll;
                this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(class_21207);
            }
        }
        if (class_21205 == class_21202) {
            return null;
        }
        return this.lllIIIllIIIIlllIlIIllIIll(class_21202, class_21205);
    }

    private int lllIlIIlIIIlIlIIIllIlllIl(class_1521 class_15212, class_2120 class_21202, class_2120 class_21203, class_2120 class_21204, float f) {
        int n = 0;
        int n2 = 0;
        if (this.lllIIIllIIIIlllIlIIllIIll(class_15212, class_21202.lllIIIllIIIIlllIlIIllIIll, class_21202.lllIlIIlIIIlIlIIIllIlllIl + 1, class_21202.IlIllllllIIlIIllllIIlIIIl, class_21203) == 1) {
            n2 = 1;
        }
        class_2120 class_21205 = this.lllIIIllIIIIlllIlIIllIIll(class_15212, class_21202.lllIIIllIIIIlllIlIIllIIll, class_21202.lllIlIIlIIIlIlIIIllIlllIl, class_21202.IlIllllllIIlIIllllIIlIIIl + 1, class_21203, n2);
        class_2120 class_21206 = this.lllIIIllIIIIlllIlIIllIIll(class_15212, class_21202.lllIIIllIIIIlllIlIIllIIll - 1, class_21202.lllIlIIlIIIlIlIIIllIlllIl, class_21202.IlIllllllIIlIIllllIIlIIIl, class_21203, n2);
        class_2120 class_21207 = this.lllIIIllIIIIlllIlIIllIIll(class_15212, class_21202.lllIIIllIIIIlllIlIIllIIll + 1, class_21202.lllIlIIlIIIlIlIIIllIlllIl, class_21202.IlIllllllIIlIIllllIIlIIIl, class_21203, n2);
        class_2120 class_21208 = this.lllIIIllIIIIlllIlIIllIIll(class_15212, class_21202.lllIIIllIIIIlllIlIIllIIll, class_21202.lllIlIIlIIIlIlIIIllIlllIl, class_21202.IlIllllllIIlIIllllIIlIIIl - 1, class_21203, n2);
        if (class_21205 != null && !class_21205.IIIllIllIIlIlIlIlIllllIIl && class_21205.lllIIIllIIIIlllIlIIllIIll(class_21204) < f) {
            this.lIlllIlllIIIIlIIlllIllIII[n++] = class_21205;
        }
        if (class_21206 != null && !class_21206.IIIllIllIIlIlIlIlIllllIIl && class_21206.lllIIIllIIIIlllIlIIllIIll(class_21204) < f) {
            this.lIlllIlllIIIIlIIlllIllIII[n++] = class_21206;
        }
        if (class_21207 != null && !class_21207.IIIllIllIIlIlIlIlIllllIIl && class_21207.lllIIIllIIIIlllIlIIllIIll(class_21204) < f) {
            this.lIlllIlllIIIIlIIlllIllIII[n++] = class_21207;
        }
        if (class_21208 != null && !class_21208.IIIllIllIIlIlIlIlIllllIIl && class_21208.lllIIIllIIIIlllIlIIllIIll(class_21204) < f) {
            this.lIlllIlllIIIIlIIlllIllIII[n++] = class_21208;
        }
        return n;
    }

    private class_2120 lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, int n, int n2, int n3, class_2120 class_21202, int n4) {
        class_2120 class_21203 = null;
        int n5 = this.lllIIIllIIIIlllIlIIllIIll(class_15212, n, n2, n3, class_21202);
        if (n5 == 2) {
            return this.lllIIIllIIIIlllIlIIllIIll(n, n2, n3);
        }
        if (n5 == 1) {
            class_21203 = this.lllIIIllIIIIlllIlIIllIIll(n, n2, n3);
        }
        if (class_21203 == null && n4 > 0 && n5 != -3 && n5 != -4 && this.lllIIIllIIIIlllIlIIllIIll(class_15212, n, n2 + n4, n3, class_21202) == 1) {
            class_21203 = this.lllIIIllIIIIlllIlIIllIIll(n, n2 + n4, n3);
            n2 += n4;
        }
        if (class_21203 != null) {
            int n6 = 0;
            int n7 = 0;
            while (n2 > 0) {
                n7 = this.lllIIIllIIIIlllIlIIllIIll(class_15212, n, n2 - 1, n3, class_21202);
                if (this.IIIllIIlIIIIIIlIlIIllIIlI && n7 == -1) {
                    return null;
                }
                if (n7 != 1) break;
                if (n6++ >= class_15212.IllIIllIlIlllIllIllIlIIIl()) {
                    return null;
                }
                if (--n2 <= 0) continue;
                class_21203 = this.lllIIIllIIIIlllIlIIllIIll(n, n2, n3);
            }
            if (n7 == -2) {
                return null;
            }
        }
        return class_21203;
    }

    private final class_2120 lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        int n4 = class_2120.lllIIIllIIIIlllIlIIllIIll(n, n2, n3);
        class_2120 class_21202 = (class_2120)this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(n4);
        if (class_21202 == null) {
            class_21202 = new class_2120(n, n2, n3);
            this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(n4, class_21202);
        }
        return class_21202;
    }

    public int lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, int n, int n2, int n3, class_2120 class_21202) {
        return class_2111.lllIIIllIIIIlllIlIIllIIll(class_15212, n, n2, n3, class_21202, this.IIIllIIlIIIIIIlIlIIllIIlI, this.lIllllIIlIIIlIllllllIIIll, this.IlIIIIIllllllIIlllIllllll);
    }

    public static int lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, int n, int n2, int n3, class_2120 class_21202, boolean bl, boolean bl2, boolean bl3) {
        boolean bl4 = false;
        for (int i = n; i < n + class_21202.lllIIIllIIIIlllIlIIllIIll; ++i) {
            for (int j = n2; j < n2 + class_21202.lllIlIIlIIIlIlIIIllIlllIl; ++j) {
                for (int k = n3; k < n3 + class_21202.IlIllllllIIlIIllllIIlIIIl; ++k) {
                    Block class_05492 = class_15212.lIlIllIIlIIlIIlIIlIIlIIll.a_(i, j, k);
                    if (class_05492.lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll) continue;
                    if (class_05492 == Blocks.llIIIlIIllIIllIllIIlIlllI) {
                        bl4 = true;
                    } else if (class_05492 != Blocks.IIIllIllIIlIlIlIlIllllIIl && class_05492 != Blocks.IllIIIllIIIIlIlIlIllIIlll) {
                        if (!bl3 && class_05492 == Blocks.IlIIllIlIlIllIIIlIIlIlIIl) {
                            return 0;
                        }
                    } else {
                        if (bl) {
                            return -1;
                        }
                        bl4 = true;
                    }
                    int n4 = class_05492.lIIIIlIlIIlllllIIllIIlIII();
                    if (class_15212.lIlIllIIlIIlIIlIIlIIlIIll.a_(i, j, k).lIIIIlIlIIlllllIIllIIlIII() == 9) {
                        int n5;
                        int n6;
                        int n7 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_15212.IlIIlllllIIlIlIlllllIllll);
                        if (class_15212.lIlIllIIlIIlIIlIIlIIlIIll.a_(n7, n6 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_15212.llIIlIlIlllIIllIlIlllIllI), n5 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_15212.IllIIIIllIIllIllIlllIlIIl)).lIIIIlIlIIlllllIIllIIlIII() == 9 || class_15212.lIlIllIIlIIlIIlIIlIIlIIll.a_(n7, n6 - 1, n5).lIIIIlIlIIlllllIIllIIlIII() == 9) continue;
                        return -3;
                    }
                    if (class_05492.lllIIIllIIIIlllIlIIllIIll((class_1843)class_15212.lIlIllIIlIIlIIlIIlIIlIIll, i, j, k) || bl2 && class_05492 == Blocks.IlIIllIlIlIllIIIlIIlIlIIl) continue;
                    if (n4 == 11 || class_05492 == Blocks.IIIlIIllIIlIlIIlIIllIIIIl || n4 == 32) {
                        return -3;
                    }
                    if (class_05492 == Blocks.llIIIlIIllIIllIllIIlIlllI) {
                        return -4;
                    }
                    class_1855 class_18552 = class_05492.lIllllIIlIIIlIllllllIIIll();
                    if (class_18552 != class_1855.IIIllIllIIlIlIlIlIllllIIl) {
                        return 0;
                    }
                    if (class_15212.lIIlIlllIllIlIlllIIIIIIII()) continue;
                    return -2;
                }
            }
        }
        return bl4 ? 2 : 1;
    }

    private class_2086 lllIIIllIIIIlllIlIIllIIll(class_2120 class_21202, class_2120 class_21203) {
        int n = 1;
        class_2120 class_21204 = class_21203;
        while (class_21204.IllIIlllllllIIlIIlIIIIlIl != null) {
            ++n;
            class_21204 = class_21204.IllIIlllllllIIlIIlIIIIlIl;
        }
        class_2120[] arrclass_2120 = new class_2120[n];
        class_21204 = class_21203;
        arrclass_2120[--n] = class_21203;
        while (class_21204.IllIIlllllllIIlIIlIIIIlIl != null) {
            class_21204 = class_21204.IllIIlllllllIIlIIlIIIIlIl;
            arrclass_2120[--n] = class_21204;
        }
        return new class_2086(arrclass_2120);
    }
}

