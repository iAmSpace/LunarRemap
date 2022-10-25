package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

public abstract class class_1036 {
    protected class_2046 IlIIIIIllllllIIlllIllllll;
    protected int lIllllIIlIIIlIllllllIIIll;
    protected int IIIllIIlIIIIIIlIlIIllIIlI;

    public class_1036() {
    }

    protected class_1036(int n) {
        this.IIIllIIlIIIIIIlIlIIllIIlI = n;
        this.lIllllIIlIIIlIllllllIIIll = -1;
    }

    public class_0775 lllIIIllIIIIlllIlIIllIIll() {
        class_0775 class_07752 = new class_0775();
        class_07752.lllIIIllIIIIlllIlIIllIIll("id", class_1756.lllIIIllIIIIlllIlIIllIIll(this));
        class_07752.lllIIIllIIIIlllIlIIllIIll("BB", this.IlIIIIIllllllIIlllIllllll.IllIIlllllllIIlIIlIIIIlIl());
        class_07752.lllIIIllIIIIlllIlIIllIIll("O", this.lIllllIIlIIIlIllllllIIIll);
        class_07752.lllIIIllIIIIlllIlIIllIIll("GD", this.IIIllIIlIIIIIIlIlIIllIIlI);
        this.lllIIIllIIIIlllIlIIllIIll(class_07752);
        return class_07752;
    }

    protected abstract void lllIIIllIIIIlllIlIIllIIll(class_0775 var1);

    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, class_0775 class_07752) {
        if (class_07752.IlIllllllIIlIIllllIIlIIIl("BB")) {
            this.IlIIIIIllllllIIlllIllllll = new class_2046(class_07752.llIIlllIllIllllIIIlIIIIII("BB"));
        }
        this.lIllllIIlIIIlIllllllIIIll = class_07752.lIllllIIlIIIlIllllllIIIll("O");
        this.IIIllIIlIIIIIIlIlIIllIIlI = class_07752.lIllllIIlIIIlIllllllIIIll("GD");
        this.lllIlIIlIIIlIlIIIllIlllIl(class_07752);
    }

    protected abstract void lllIlIIlIIIlIlIIIllIlllIl(class_0775 var1);

    public void lllIIIllIIIIlllIlIIllIIll(class_1036 class_10362, List list, Random random) {
    }

    public abstract boolean lllIIIllIIIIlllIlIIllIIll(class_1334 var1, Random var2, class_2046 var3);

    public class_2046 lllIlIIlIIIlIlIIIllIlllIl() {
        return this.IlIIIIIllllllIIlllIllllll;
    }

    public int IlIllllllIIlIIllllIIlIIIl() {
        return this.IIIllIIlIIIIIIlIlIIllIIlI;
    }

    public static class_1036 lllIIIllIIIIlllIlIIllIIll(List list, class_2046 class_20462) {
        class_1036 class_10362;
        Iterator iterator = list.iterator();
        do {
            if (iterator.hasNext()) continue;
            return null;
        } while ((class_10362 = (class_1036)iterator.next()).lllIlIIlIIIlIlIIIllIlllIl() == null || !class_10362.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(class_20462));
        return class_10362;
    }

    public class_2137 lIlllIlllIIIIlIIlllIllIII() {
        return new class_2137(this.IlIIIIIllllllIIlllIllllll.IlIIIIIllllllIIlllIllllll(), this.IlIIIIIllllllIIlllIllllll.lIllllIIlIIIlIllllllIIIll(), this.IlIIIIIllllllIIlllIllllll.IIIllIIlIIIIIIlIlIIllIIlI());
    }

    protected boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, class_2046 class_20462) {
        int n;
        int n2;
        int n3 = Math.max(this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll - 1, class_20462.lllIIIllIIIIlllIlIIllIIll);
        int n4 = Math.max(this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl - 1, class_20462.lllIlIIlIIIlIlIIIllIlllIl);
        int n5 = Math.max(this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl - 1, class_20462.IlIllllllIIlIIllllIIlIIIl);
        int n6 = Math.min(this.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII + 1, class_20462.lIlllIlllIIIIlIIlllIllIII);
        int n7 = Math.min(this.IlIIIIIllllllIIlllIllllll.IlIIIIIllllllIIlllIllllll + 1, class_20462.IlIIIIIllllllIIlllIllllll);
        int n8 = Math.min(this.IlIIIIIllllllIIlllIllllll.lIllllIIlIIIlIllllllIIIll + 1, class_20462.lIllllIIlIIIlIllllllIIIll);
        for (n2 = n3; n2 <= n6; ++n2) {
            for (n = n5; n <= n8; ++n) {
                if (class_13342.a_(n2, n4, n).lIllllIIlIIIlIllllllIIIll().lllIIIllIIIIlllIlIIllIIll()) {
                    return true;
                }
                if (!class_13342.a_(n2, n7, n).lIllllIIlIIIlIllllllIIIll().lllIIIllIIIIlllIlIIllIIll()) continue;
                return true;
            }
        }
        for (n2 = n3; n2 <= n6; ++n2) {
            for (n = n4; n <= n7; ++n) {
                if (class_13342.a_(n2, n, n5).lIllllIIlIIIlIllllllIIIll().lllIIIllIIIIlllIlIIllIIll()) {
                    return true;
                }
                if (!class_13342.a_(n2, n, n8).lIllllIIlIIIlIllllllIIIll().lllIIIllIIIIlllIlIIllIIll()) continue;
                return true;
            }
        }
        for (n2 = n5; n2 <= n8; ++n2) {
            for (n = n4; n <= n7; ++n) {
                if (class_13342.a_(n3, n, n2).lIllllIIlIIIlIllllllIIIll().lllIIIllIIIIlllIlIIllIIll()) {
                    return true;
                }
                if (!class_13342.a_(n6, n, n2).lIllllIIlIIIlIllllllIIIll().lllIIIllIIIIlllIlIIllIIll()) continue;
                return true;
            }
        }
        return false;
    }

    protected int lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        switch (this.lIllllIIlIIIlIllllllIIIll) {
            case 0: 
            case 2: {
                return this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll + n;
            }
            case 1: {
                return this.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII - n2;
            }
            case 3: {
                return this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll + n2;
            }
        }
        return n;
    }

    protected int lllIIIllIIIIlllIlIIllIIll(int n) {
        return this.lIllllIIlIIIlIllllllIIIll == -1 ? n : n + this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl;
    }

    protected int lllIlIIlIIIlIlIIIllIlllIl(int n, int n2) {
        switch (this.lIllllIIlIIIlIllllllIIIll) {
            case 0: {
                return this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl + n2;
            }
            case 1: 
            case 3: {
                return this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl + n;
            }
            case 2: {
                return this.IlIIIIIllllllIIlllIllllll.lIllllIIlIIIlIllllllIIIll - n2;
            }
        }
        return n2;
    }

    protected int lllIIIllIIIIlllIlIIllIIll(Block class_05492, int n) {
        if (class_05492 == Blocks.rail) {
            if (this.lIllllIIlIIIlIllllllIIIll == 1 || this.lIllllIIlIIIlIllllllIIIll == 3) {
                if (n == 1) {
                    return 0;
                }
                return 1;
            }
        } else if (class_05492 != Blocks.IlIIllIlIlIllIIIlIIlIlIIl && class_05492 != Blocks.IlIIIIIllIlllIIIIlIIIllIl) {
            if (class_05492 != Blocks.llIIIlIlIlIIlIllIIIllIlIl && class_05492 != Blocks.IllllIIlIIIllIlllIlllIllI && class_05492 != Blocks.llIllIlllIllIlIIIIlIIlIII && class_05492 != Blocks.lIIIIIlIllIllIlIlIIllllll && class_05492 != Blocks.lIIlIlIIIIIllIIIIllIlIlII) {
                if (class_05492 == Blocks.lIlIIllIllIIIIIlIllllIIIl) {
                    if (this.lIllllIIlIIIlIllllllIIIll == 0) {
                        if (n == 2) {
                            return 3;
                        }
                        if (n == 3) {
                            return 2;
                        }
                    } else if (this.lIllllIIlIIIlIllllllIIIll == 1) {
                        if (n == 2) {
                            return 4;
                        }
                        if (n == 3) {
                            return 5;
                        }
                        if (n == 4) {
                            return 2;
                        }
                        if (n == 5) {
                            return 3;
                        }
                    } else if (this.lIllllIIlIIIlIllllllIIIll == 3) {
                        if (n == 2) {
                            return 5;
                        }
                        if (n == 3) {
                            return 4;
                        }
                        if (n == 4) {
                            return 2;
                        }
                        if (n == 5) {
                            return 3;
                        }
                    }
                } else if (class_05492 == Blocks.lIIIIllIIllIIIlIIIllIllII) {
                    if (this.lIllllIIlIIIlIllllllIIIll == 0) {
                        if (n == 3) {
                            return 4;
                        }
                        if (n == 4) {
                            return 3;
                        }
                    } else if (this.lIllllIIlIIIlIllllllIIIll == 1) {
                        if (n == 3) {
                            return 1;
                        }
                        if (n == 4) {
                            return 2;
                        }
                        if (n == 2) {
                            return 3;
                        }
                        if (n == 1) {
                            return 4;
                        }
                    } else if (this.lIllllIIlIIIlIllllllIIIll == 3) {
                        if (n == 3) {
                            return 2;
                        }
                        if (n == 4) {
                            return 1;
                        }
                        if (n == 2) {
                            return 3;
                        }
                        if (n == 1) {
                            return 4;
                        }
                    }
                } else if (class_05492 != Blocks.IIllllIIlIlIlIlllIIIllIIl && !(class_05492 instanceof class_0143)) {
                    if (class_05492 == Blocks.llIIIIllIIIIIIIlIIIlIIIIl || class_05492 == Blocks.llIIIlllIlllIlIllIIIIllIl || class_05492 == Blocks.llIIIIIlIIlIIIIllIIIlIIII || class_05492 == Blocks.lIlllIlllIlIIIIlllIlIlIIl) {
                        if (this.lIllllIIlIIIlIllllllIIIll == 0) {
                            if (n == 2 || n == 3) {
                                return class_0573.lllIIIllIIIIlllIlIIllIIll[n];
                            }
                        } else if (this.lIllllIIlIIIlIllllllIIIll == 1) {
                            if (n == 2) {
                                return 4;
                            }
                            if (n == 3) {
                                return 5;
                            }
                            if (n == 4) {
                                return 2;
                            }
                            if (n == 5) {
                                return 3;
                            }
                        } else if (this.lIllllIIlIIIlIllllllIIIll == 3) {
                            if (n == 2) {
                                return 5;
                            }
                            if (n == 3) {
                                return 4;
                            }
                            if (n == 4) {
                                return 2;
                            }
                            if (n == 5) {
                                return 3;
                            }
                        }
                    }
                } else if (this.lIllllIIlIIIlIllllllIIIll == 0) {
                    if (n == 0 || n == 2) {
                        return class_1632.lIllllIIlIIIlIllllllIIIll[n];
                    }
                } else if (this.lIllllIIlIIIlIllllllIIIll == 1) {
                    if (n == 2) {
                        return 1;
                    }
                    if (n == 0) {
                        return 3;
                    }
                    if (n == 1) {
                        return 2;
                    }
                    if (n == 3) {
                        return 0;
                    }
                } else if (this.lIllllIIlIIIlIllllllIIIll == 3) {
                    if (n == 2) {
                        return 3;
                    }
                    if (n == 0) {
                        return 1;
                    }
                    if (n == 1) {
                        return 2;
                    }
                    if (n == 3) {
                        return 0;
                    }
                }
            } else if (this.lIllllIIlIIIlIllllllIIIll == 0) {
                if (n == 2) {
                    return 3;
                }
                if (n == 3) {
                    return 2;
                }
            } else if (this.lIllllIIlIIIlIllllllIIIll == 1) {
                if (n == 0) {
                    return 2;
                }
                if (n == 1) {
                    return 3;
                }
                if (n == 2) {
                    return 0;
                }
                if (n == 3) {
                    return 1;
                }
            } else if (this.lIllllIIlIIIlIllllllIIIll == 3) {
                if (n == 0) {
                    return 2;
                }
                if (n == 1) {
                    return 3;
                }
                if (n == 2) {
                    return 1;
                }
                if (n == 3) {
                    return 0;
                }
            }
        } else if (this.lIllllIIlIIIlIllllllIIIll == 0) {
            if (n == 0) {
                return 2;
            }
            if (n == 2) {
                return 0;
            }
        } else {
            if (this.lIllllIIlIIIlIllllllIIIll == 1) {
                return n + 1 & 3;
            }
            if (this.lIllllIIlIIIlIllllllIIIll == 3) {
                return n + 3 & 3;
            }
        }
        return n;
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, Block class_05492, int n, int n2, int n3, int n4, class_2046 class_20462) {
        int n5;
        int n6;
        int n7 = this.lllIIIllIIIIlllIlIIllIIll(n2, n4);
        if (class_20462.lllIlIIlIIIlIlIIIllIlllIl(n7, n6 = this.lllIIIllIIIIlllIlIIllIIll(n3), n5 = this.lllIlIIlIIIlIlIIIllIlllIl(n2, n4))) {
            class_13342.lllIIIllIIIIlllIlIIllIIll(n7, n6, n5, class_05492, n, 2);
        }
    }

    protected Block lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_2046 class_20462) {
        int n4;
        int n5;
        int n6 = this.lllIIIllIIIIlllIlIIllIIll(n, n3);
        return !class_20462.lllIlIIlIIIlIlIIIllIlllIl(n6, n5 = this.lllIIIllIIIIlllIlIIllIIll(n2), n4 = this.lllIlIIlIIIlIlIIIllIlllIl(n, n3)) ? Blocks.lllIIIllIIIIlllIlIIllIIll : class_13342.a_(n6, n5, n4);
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, class_2046 class_20462, int n, int n2, int n3, int n4, int n5, int n6) {
        for (int i = n2; i <= n5; ++i) {
            for (int j = n; j <= n4; ++j) {
                for (int k = n3; k <= n6; ++k) {
                    this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllIIIllIIIIlllIlIIllIIll, 0, j, i, k, class_20462);
                }
            }
        }
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, class_2046 class_20462, int n, int n2, int n3, int n4, int n5, int n6, Block class_05492, Block class_05493, boolean bl) {
        for (int i = n2; i <= n5; ++i) {
            for (int j = n; j <= n4; ++j) {
                for (int k = n3; k <= n6; ++k) {
                    if (bl && this.lllIIIllIIIIlllIlIIllIIll(class_13342, j, i, k, class_20462).lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll) continue;
                    if (i != n2 && i != n5 && j != n && j != n4 && k != n3 && k != n6) {
                        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_05493, 0, j, i, k, class_20462);
                        continue;
                    }
                    this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_05492, 0, j, i, k, class_20462);
                }
            }
        }
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, class_2046 class_20462, int n, int n2, int n3, int n4, int n5, int n6, Block class_05492, int n7, Block class_05493, int n8, boolean bl) {
        for (int i = n2; i <= n5; ++i) {
            for (int j = n; j <= n4; ++j) {
                for (int k = n3; k <= n6; ++k) {
                    if (bl && this.lllIIIllIIIIlllIlIIllIIll(class_13342, j, i, k, class_20462).lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll) continue;
                    if (i != n2 && i != n5 && j != n && j != n4 && k != n3 && k != n6) {
                        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_05493, n8, j, i, k, class_20462);
                        continue;
                    }
                    this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_05492, n7, j, i, k, class_20462);
                }
            }
        }
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, class_2046 class_20462, int n, int n2, int n3, int n4, int n5, int n6, boolean bl, Random random, class_0068 class_00682) {
        for (int i = n2; i <= n5; ++i) {
            for (int j = n; j <= n4; ++j) {
                for (int k = n3; k <= n6; ++k) {
                    if (bl && this.lllIIIllIIIIlllIlIIllIIll(class_13342, j, i, k, class_20462).lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll) continue;
                    class_00682.lllIIIllIIIIlllIlIIllIIll(random, j, i, k, i == n2 || i == n5 || j == n || j == n4 || k == n3 || k == n6);
                    this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_00682.lllIIIllIIIIlllIlIIllIIll(), class_00682.lllIlIIlIIIlIlIIIllIlllIl(), j, i, k, class_20462);
                }
            }
        }
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, class_2046 class_20462, Random random, float f, int n, int n2, int n3, int n4, int n5, int n6, Block class_05492, Block class_05493, boolean bl) {
        for (int i = n2; i <= n5; ++i) {
            for (int j = n; j <= n4; ++j) {
                for (int k = n3; k <= n6; ++k) {
                    if (!(random.nextFloat() <= f) || bl && this.lllIIIllIIIIlllIlIIllIIll(class_13342, j, i, k, class_20462).lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll) continue;
                    if (i != n2 && i != n5 && j != n && j != n4 && k != n3 && k != n6) {
                        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_05493, 0, j, i, k, class_20462);
                        continue;
                    }
                    this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_05492, 0, j, i, k, class_20462);
                }
            }
        }
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, class_2046 class_20462, Random random, float f, int n, int n2, int n3, Block class_05492, int n4) {
        if (random.nextFloat() < f) {
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_05492, n4, n, n2, n3, class_20462);
        }
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, class_2046 class_20462, int n, int n2, int n3, int n4, int n5, int n6, Block class_05492, boolean bl) {
        float f = n4 - n + 1;
        float f2 = n5 - n2 + 1;
        float f3 = n6 - n3 + 1;
        float f4 = (float)n + f / 2.0f;
        float f5 = (float)n3 + f3 / 2.0f;
        for (int i = n2; i <= n5; ++i) {
            float f6 = (float)(i - n2) / f2;
            for (int j = n; j <= n4; ++j) {
                float f7 = ((float)j - f4) / (f * 0.5f);
                for (int k = n3; k <= n6; ++k) {
                    float f8;
                    float f9 = ((float)k - f5) / (f3 * 0.5f);
                    if (bl && this.lllIIIllIIIIlllIlIIllIIll(class_13342, j, i, k, class_20462).lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll || !((f8 = f7 * f7 + f6 * f6 + f9 * f9) <= 1.05f)) continue;
                    this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_05492, 0, j, i, k, class_20462);
                }
            }
        }
    }

    protected void lllIlIIlIIIlIlIIIllIlllIl(class_1334 class_13342, int n, int n2, int n3, class_2046 class_20462) {
        int n4;
        int n5;
        int n6 = this.lllIIIllIIIIlllIlIIllIIll(n, n3);
        if (class_20462.lllIlIIlIIIlIlIIIllIlllIl(n6, n5 = this.lllIIIllIIIIlllIlIIllIIll(n2), n4 = this.lllIlIIlIIIlIlIIIllIlllIl(n, n3))) {
            while (!class_13342.lIlllIlllIIIIlIIlllIllIII(n6, n5, n4) && n5 < 255) {
                class_13342.lllIIIllIIIIlllIlIIllIIll(n6, n5, n4, Blocks.lllIIIllIIIIlllIlIIllIIll, 0, 2);
                ++n5;
            }
        }
    }

    protected void lllIlIIlIIIlIlIIIllIlllIl(class_1334 class_13342, Block class_05492, int n, int n2, int n3, int n4, class_2046 class_20462) {
        int n5;
        int n6;
        int n7 = this.lllIIIllIIIIlllIlIIllIIll(n2, n4);
        if (class_20462.lllIlIIlIIIlIlIIIllIlllIl(n7, n6 = this.lllIIIllIIIIlllIlIIllIIll(n3), n5 = this.lllIlIIlIIIlIlIIIllIlllIl(n2, n4))) {
            while ((class_13342.lIlllIlllIIIIlIIlllIllIII(n7, n6, n5) || class_13342.a_(n7, n6, n5).lIllllIIlIIIlIllllllIIIll().lllIIIllIIIIlllIlIIllIIll()) && n6 > 1) {
                class_13342.lllIIIllIIIIlllIlIIllIIll(n7, n6, n5, class_05492, n, 2);
                --n6;
            }
        }
    }

    protected boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, class_2046 class_20462, Random random, int n, int n2, int n3, class_0425[] arrclass_0425, int n4) {
        int n5;
        int n6;
        int n7 = this.lllIIIllIIIIlllIlIIllIIll(n, n3);
        if (class_20462.lllIlIIlIIIlIlIIIllIlllIl(n7, n6 = this.lllIIIllIIIIlllIlIIllIIll(n2), n5 = this.lllIlIIlIIIlIlIIIllIlllIl(n, n3)) && class_13342.a_(n7, n6, n5) != Blocks.IllIlIlIIIlllIIllIIIIlIll) {
            class_13342.lllIIIllIIIIlllIlIIllIIll(n7, n6, n5, Blocks.IllIlIlIIIlllIIllIIIIlIll, 0, 2);
            class_0071 class_00712 = (class_0071)class_13342.lllIlIIlIIIlIlIIIllIlllIl(n7, n6, n5);
            if (class_00712 != null) {
                class_0425.lllIIIllIIIIlllIlIIllIIll(random, arrclass_0425, class_00712, n4);
            }
            return true;
        }
        return false;
    }

    protected boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, class_2046 class_20462, Random random, int n, int n2, int n3, int n4, class_0425[] arrclass_0425, int n5) {
        int n6;
        int n7;
        int n8 = this.lllIIIllIIIIlllIlIIllIIll(n, n3);
        if (class_20462.lllIlIIlIIIlIlIIIllIlllIl(n8, n7 = this.lllIIIllIIIIlllIlIIllIIll(n2), n6 = this.lllIlIIlIIIlIlIIIllIlllIl(n, n3)) && class_13342.a_(n8, n7, n6) != Blocks.lIlllIlllIlIIIIlllIlIlIIl) {
            class_13342.lllIIIllIIIIlllIlIIllIIll(n8, n7, n6, Blocks.lIlllIlllIlIIIIlllIlIlIIl, this.lllIIIllIIIIlllIlIIllIIll(Blocks.lIlllIlllIlIIIIlllIlIlIIl, n4), 2);
            class_1646 class_16462 = (class_1646)class_13342.lllIlIIlIIIlIlIIIllIlllIl(n8, n7, n6);
            if (class_16462 != null) {
                class_0425.lllIIIllIIIIlllIlIIllIIll(random, arrclass_0425, class_16462, n5);
            }
            return true;
        }
        return false;
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, class_2046 class_20462, Random random, int n, int n2, int n3, int n4) {
        int n5;
        int n6;
        int n7 = this.lllIIIllIIIIlllIlIIllIIll(n, n3);
        if (class_20462.lllIlIIlIIIlIlIIIllIlllIl(n7, n6 = this.lllIIIllIIIIlllIlIIllIIll(n2), n5 = this.lllIlIIlIIIlIlIIIllIlllIl(n, n3))) {
            class_0760.lllIIIllIIIIlllIlIIllIIll(class_13342, n7, n6, n5, n4, Blocks.IlIIllIlIlIllIIIlIIlIlIIl);
        }
    }
}

