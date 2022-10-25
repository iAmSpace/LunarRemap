package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.util.ArrayList;
import java.util.List;

import net.minecraft.util.MathHelper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_0636 {
    private static final Logger lllIlIIlIIIlIlIIIllIlllIl = LogManager.getLogger();
    private final class_0976 IlIllllllIIlIIllllIIlIIIl;
    private final List lIlllIlllIIIIlIIlllIllIII = new ArrayList();
    private final class_1562 IlIIIIIllllllIIlllIllllll = new class_1562();
    private final List lIllllIIlIIIlIllllllIIIll = new ArrayList();
    private final List IIIllIIlIIIIIIlIlIIllIIlI = new ArrayList();
    public class_0284 lllIIIllIIIIlllIlIIllIIll = new class_0284(100, 0.8f);
    private int IllIIlllllllIIlIIlIIIIlIl;
    private long IIIllIllIIlIlIlIlIllllIIl;
    private final int[][] IllIIIllIIIIlIlIlIllIIlll = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

    public class_0636(class_0976 class_09762) {
        this.IlIllllllIIlIIllllIIlIIIl = class_09762;
        this.lllIIIllIIIIlllIlIIllIIll(class_09762.llIIlIIllIIllIlIIllIIllII().lIIIllIIIIIllllIlIlIllIll().lIIlIIIIIlIlllIlIIlIlIlll());
    }

    public class_0976 lllIIIllIIIIlllIlIIllIIll() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl() {
        class_1163 class_11632;
        class_0096 class_00962;
        int n;
        long l = this.IlIllllllIIlIIllllIIlIIIl.IlIIIlIIIIllIIIllIIIIIIll();
        if (l - this.IIIllIllIIlIlIlIlIllllIIl > 8000L) {
            this.IIIllIllIIlIlIlIlIllllIIl = l;
            for (n = 0; n < this.IIIllIIlIIIIIIlIlIIllIIlI.size(); ++n) {
                class_00962 = (class_0096)this.IIIllIIlIIIIIIlIlIIllIIlI.get(n);
                class_00962.lllIlIIlIIIlIlIIIllIlllIl();
                class_00962.lllIIIllIIIIlllIlIIllIIll();
            }
        } else {
            for (n = 0; n < this.lIllllIIlIIIlIllllllIIIll.size(); ++n) {
                class_00962 = (class_0096)this.lIllllIIlIIIlIllllllIIIll.get(n);
                class_00962.lllIlIIlIIIlIlIIIllIlllIl();
            }
        }
        this.lIllllIIlIIIlIllllllIIIll.clear();
        if (this.lIlllIlllIIIIlIIlllIllIII.isEmpty() && !(class_11632 = this.IlIllllllIIlIIllllIIlIIIl.IlIlIIlllIIlIllIIIlllllIl).IlIIIIIllllllIIlllIllllll()) {
            this.IlIllllllIIlIIllllIIlIIIl.IlIlIIlllIllllllllIIIlIlI.IIIllIIlIIIIIIlIlIIllIIlI();
        }
        if (this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII() > 0) {
            for (int i = 0; i < this.lIlllIlllIIIIlIIlllIllIII.size(); ++i) {
                int n2;
                class_1822 class_18222 = (class_1822)this.lIlllIlllIIIIlIIlllIllIII.get(i);
                int n3 = class_18222.lIlIIllIllIIIIIlIllllIIIl;
                int n4 = class_18222.llIIIlIlIlIIlIllIIIllIlIl;
                int n5 = this.IllIIlllllllIIlIIlIIIIlIl + 1;
                int n6 = n5 / 2;
                int n7 = n2 = n5 * n5 + n6 * n6;
                int n8 = -1;
                class_0096 class_00963 = null;
                class_1108 class_11082 = null;
                for (int j = 0; j < this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII(); ++j) {
                    class_1108 class_11083 = (class_1108)this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl(j);
                    if (class_11083 == null) continue;
                    class_0096 class_00964 = this.lllIIIllIIIIlllIlIIllIIll(class_11083.lllIIIllIIIIlllIlIIllIIll, class_11083.lllIlIIlIIIlIlIIIllIlllIl, false);
                    if (class_00964 != null && !class_00964.lllIIIllIIIIlllIlIIllIIll) {
                        int n9 = n3 - class_11083.lllIIIllIIIIlllIlIIllIIll;
                        int n10 = n4 - class_11083.lllIlIIlIIIlIlIIIllIlllIl;
                        int n11 = n9 * n9 + n10 * n10;
                        if (n11 >= n7) continue;
                        n7 = n11;
                        n8 = j;
                        class_00963 = class_00964;
                        class_11082 = class_11083;
                        continue;
                    }
                    this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl(j, null);
                }
                if (n8 >= 0) {
                    this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl(n8, null);
                }
                if (class_00963 == null) continue;
                class_00963.lllIIIllIIIIlllIlIIllIIll = true;
                this.lllIIIllIIIIlllIlIIllIIll().IlIlIIlllIllllllllIIIlIlI.IlIllllllIIlIIllllIIlIIIl(class_11082.lllIIIllIIIIlllIlIIllIIll, class_11082.lllIlIIlIIIlIlIIIllIlllIl);
                class_00963.IlIllllllIIlIIllllIIlIIIl();
                break;
            }
            this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl();
        }
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        long l = (long)n + Integer.MAX_VALUE | (long)n2 + Integer.MAX_VALUE << 32;
        return this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(l) != null;
    }

    public class_0096 lllIIIllIIIIlllIlIIllIIll(int n, int n2, boolean bl) {
        return this.lllIIIllIIIIlllIlIIllIIll(n, n2, bl, false);
    }

    public class_0096 lllIIIllIIIIlllIlIIllIIll(int n, int n2, boolean bl, boolean bl2) {
        long l = (long)n + Integer.MAX_VALUE | (long)n2 + Integer.MAX_VALUE << 32;
        class_0096 class_00962 = (class_0096)this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(l);
        if (class_00962 == null && bl) {
            class_00962 = new class_0096(this, n, n2, bl2);
            this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(l, class_00962);
            this.IIIllIIlIIIIIIlIlIIllIIlI.add(class_00962);
        }
        return class_00962;
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        int n4 = n >> 4;
        int n5 = n3 >> 4;
        class_0096 class_00962 = this.lllIIIllIIIIlllIlIIllIIll(n4, n5, false);
        if (class_00962 != null) {
            class_00962.lllIIIllIIIIlllIlIIllIIll(n & 0xF, n2, n3 & 0xF);
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1822 class_18222) {
        int n = (int)class_18222.IlIIlllllIIlIlIlllllIllll >> 4;
        int n2 = (int)class_18222.IllIIIIllIIllIllIlllIlIIl >> 4;
        class_18222.lIlllIlllIIIIlIIlllIllIII = class_18222.IlIIlllllIIlIlIlllllIllll;
        class_18222.IlIIIIIllllllIIlllIllllll = class_18222.IllIIIIllIIllIllIlllIlIIl;
        ArrayList<class_0723> arrayList = new ArrayList<class_0723>(1);
        for (int i = n - this.IllIIlllllllIIlIIlIIIIlIl; i <= n + this.IllIIlllllllIIlIIlIIIIlIl; ++i) {
            for (int j = n2 - this.IllIIlllllllIIlIIlIIIIlIl; j <= n2 + this.IllIIlllllllIIlIIlIIIIlIl; ++j) {
                this.lllIIIllIIIIlllIlIIllIIll(i, j, true).lllIIIllIIIIlllIlIIllIIll(class_18222);
                if (i < n - 1 || i > n + 1 || j < n2 - 1 || j > n2 + 1) continue;
                class_0723 class_07232 = this.lllIIIllIIIIlllIlIIllIIll().IlIlIIlllIllllllllIIIlIlI.IlIllllllIIlIIllllIIlIIIl(i, j);
                arrayList.add(class_07232);
            }
        }
        class_18222.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new class_2053(arrayList));
        this.lIlllIlllIIIIlIIlllIllIII.add(class_18222);
        this.lllIlIIlIIIlIlIIIllIlllIl(class_18222);
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(class_1822 class_18222) {
        int n;
        ArrayList arrayList = new ArrayList(class_18222.lIllllIIlIIIlIllllllIIIll);
        int n2 = 0;
        int n3 = this.IllIIlllllllIIlIIlIIIIlIl;
        int n4 = (int)class_18222.IlIIlllllIIlIlIlllllIllll >> 4;
        int n5 = (int)class_18222.IllIIIIllIIllIllIlllIlIIl >> 4;
        int n6 = 0;
        int n7 = 0;
        class_1108 class_11082 = class_0096.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll(n4, n5, true));
        class_18222.lIllllIIlIIIlIllllllIIIll.clear();
        if (arrayList.contains(class_11082)) {
            class_18222.lIllllIIlIIIlIllllllIIIll.add(class_11082);
        }
        for (n = 1; n <= n3 * 2; ++n) {
            for (int i = 0; i < 2; ++i) {
                int[] arrn = this.IllIIIllIIIIlIlIlIllIIlll[n2++ % 4];
                for (int j = 0; j < n; ++j) {
                    class_11082 = class_0096.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll(n4 + (n6 += arrn[0]), n5 + (n7 += arrn[1]), true));
                    if (!arrayList.contains(class_11082)) continue;
                    class_18222.lIllllIIlIIIlIllllllIIIll.add(class_11082);
                }
            }
        }
        n2 %= 4;
        for (n = 0; n < n3 * 2; ++n) {
            class_11082 = class_0096.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll(n4 + (n6 += this.IllIIIllIIIIlIlIlIllIIlll[n2][0]), n5 + (n7 += this.IllIIIllIIIIlIlIlIllIIlll[n2][1]), true));
            if (!arrayList.contains(class_11082)) continue;
            class_18222.lIllllIIlIIIlIllllllIIIll.add(class_11082);
        }
    }

    public void IlIllllllIIlIIllllIIlIIIl(class_1822 class_18222) {
        int n = (int)class_18222.lIlllIlllIIIIlIIlllIllIII >> 4;
        int n2 = (int)class_18222.IlIIIIIllllllIIlllIllllll >> 4;
        for (int i = n - this.IllIIlllllllIIlIIlIIIIlIl; i <= n + this.IllIIlllllllIIlIIlIIIIlIl; ++i) {
            for (int j = n2 - this.IllIIlllllllIIlIIlIIIIlIl; j <= n2 + this.IllIIlllllllIIlIIlIIIIlIl; ++j) {
                class_0096 class_00962 = this.lllIIIllIIIIlllIlIIllIIll(i, j, false);
                if (class_00962 == null) continue;
                class_00962.lllIIIllIIIIlllIlIIllIIll(class_18222, false);
            }
        }
        this.lIlllIlllIIIIlIIlllIllIII.remove(class_18222);
    }

    private boolean lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4, int n5) {
        int n6 = n - n3;
        int n7 = n2 - n4;
        return n6 >= -n5 && n6 <= n5 ? n7 >= -n5 && n7 <= n5 : false;
    }

    public void lIlllIlllIIIIlIIlllIllIII(class_1822 class_18222) {
        int n = (int)class_18222.IlIIlllllIIlIlIlllllIllll >> 4;
        int n2 = (int)class_18222.IllIIIIllIIllIllIlllIlIIl >> 4;
        double d = class_18222.lIlllIlllIIIIlIIlllIllIII - class_18222.IlIIlllllIIlIlIlllllIllll;
        double d2 = class_18222.IlIIIIIllllllIIlllIllllll - class_18222.IllIIIIllIIllIllIlllIlIIl;
        double d3 = d * d + d2 * d2;
        if (d3 >= 64.0) {
            int n3 = (int)class_18222.lIlllIlllIIIIlIIlllIllIII >> 4;
            int n4 = (int)class_18222.IlIIIIIllllllIIlllIllllll >> 4;
            int n5 = this.IllIIlllllllIIlIIlIIIIlIl;
            int n6 = n - n3;
            int n7 = n2 - n4;
            if (n6 != 0 || n7 != 0) {
                class_2203 class_22032 = null;
                if (this.IlIllllllIIlIIllllIIlIIIl instanceof class_2203) {
                    class_22032 = (class_2203)this.IlIllllllIIlIIllllIIlIIIl;
                }
                for (int i = n - n5; i <= n + n5; ++i) {
                    for (int j = n2 - n5; j <= n2 + n5; ++j) {
                        class_0096 class_00962;
                        if (!this.lllIIIllIIIIlllIlIIllIIll(i, j, n3, n4, n5)) {
                            this.lllIIIllIIIIlllIlIIllIIll(i, j, true, true).lllIIIllIIIIlllIlIIllIIll(class_18222);
                            if (class_22032 != null) {
                                class_22032.lllIIIllIIIIlllIlIIllIIll(i, j);
                            }
                        }
                        if (this.lllIIIllIIIIlllIlIIllIIll(i - n6, j - n7, n, n2, n5) || (class_00962 = this.lllIIIllIIIIlllIlIIllIIll(i - n6, j - n7, false)) == null) continue;
                        class_00962.lllIlIIlIIIlIlIIIllIlllIl(class_18222);
                    }
                }
                this.lllIlIIlIIIlIlIIIllIlllIl(class_18222);
                class_18222.lIlllIlllIIIIlIIlllIllIII = class_18222.IlIIlllllIIlIlIlllllIllll;
                class_18222.IlIIIIIllllllIIlllIllllll = class_18222.IllIIIIllIIllIllIlllIlIIl;
            }
        }
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_1822 class_18222, int n, int n2) {
        class_0096 class_00962 = this.lllIIIllIIIIlllIlIIllIIll(n, n2, false);
        return class_00962 != null && class_0096.lllIlIIlIIIlIlIIIllIlllIl(class_00962).contains(class_18222) && !class_18222.lIllllIIlIIIlIllllllIIIll.contains(class_0096.lllIIIllIIIIlllIlIIllIIll(class_00962));
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n) {
        if ((n = MathHelper.lllIIIllIIIIlllIlIIllIIll(n, 3, 32)) != this.IllIIlllllllIIlIIlIIIIlIl) {
            int n2 = n - this.IllIIlllllllIIlIIlIIIIlIl;
            for (class_1822 class_18222 : this.lIlllIlllIIIIlIIlllIllIII) {
                int n3;
                int n4;
                int n5 = (int)class_18222.IlIIlllllIIlIlIlllllIllll >> 4;
                int n6 = (int)class_18222.IllIIIIllIIllIllIlllIlIIl >> 4;
                if (n2 > 0) {
                    for (n4 = n5 - n; n4 <= n5 + n; ++n4) {
                        for (n3 = n6 - n; n3 <= n6 + n; ++n3) {
                            class_0096 class_00962 = this.lllIIIllIIIIlllIlIIllIIll(n4, n3, true, true);
                            if (class_0096.lllIlIIlIIIlIlIIIllIlllIl(class_00962).contains(class_18222)) continue;
                            class_00962.lllIIIllIIIIlllIlIIllIIll(class_18222);
                        }
                    }
                    continue;
                }
                for (n4 = n5 - this.IllIIlllllllIIlIIlIIIIlIl; n4 <= n5 + this.IllIIlllllllIIlIIlIIIIlIl; ++n4) {
                    for (n3 = n6 - this.IllIIlllllllIIlIIlIIIIlIl; n3 <= n6 + this.IllIIlllllllIIlIIlIIIIlIl; ++n3) {
                        if (this.lllIIIllIIIIlllIlIIllIIll(n4, n3, n5, n6, n)) continue;
                        this.lllIIIllIIIIlllIlIIllIIll(n4, n3, true).lllIlIIlIIIlIlIIIllIlllIl(class_18222);
                    }
                }
            }
            this.IllIIlllllllIIlIIlIIIIlIl = n;
        }
    }

    public static int lllIlIIlIIIlIlIIIllIlllIl(int n) {
        return n * 16 - 16;
    }

    static /* synthetic */ Logger IlIllllllIIlIIllllIIlIIIl() {
        return lllIlIIlIIIlIlIIIllIlllIl;
    }

    static /* synthetic */ class_0976 lllIIIllIIIIlllIlIIllIIll(class_0636 class_06362) {
        return class_06362.IlIllllllIIlIIllllIIlIIIl;
    }

    static /* synthetic */ class_1562 lllIlIIlIIIlIlIIIllIlllIl(class_0636 class_06362) {
        return class_06362.IlIIIIIllllllIIlllIllllll;
    }

    static /* synthetic */ List IlIllllllIIlIIllllIIlIIIl(class_0636 class_06362) {
        return class_06362.IIIllIIlIIIIIIlIlIIllIIlI;
    }

    static /* synthetic */ List lIlllIlllIIIIlIIlllIllIII(class_0636 class_06362) {
        return class_06362.lIllllIIlIIIlIllllllIIIll;
    }
}

