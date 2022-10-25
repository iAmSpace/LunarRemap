package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;

public class class_0041 {
    private int IlIllllllIIlIIllllIIlIIIl;
    private int lIlllIlllIIIIlIIlllIllIII;
    private Object IlIIIIIllllllIIlllIllllll = new Object();
    private Object lIllllIIlIIIlIllllllIIIll = new Object();
    private static int IIIllIIlIIIIIIlIlIIllIIlI = 16;
    private static int IllIIlllllllIIlIIlIIIIlIl = 0;
    private static int IIIllIllIIlIlIlIlIllllIIl = 1;
    private static int IllIIIllIIIIlIlIlIllIIlll = 2;
    private static int lIIIIlIlIIlllllIIllIIlIII = 3;
    private static int llIIlllIllIllllIIIlIIIIII = 4;
    private static int llIIllIllIlIIlIIllIllllll = 5;
    private static int lllIIlIIIllllllIIIIlIlIlI = 6;
    private static int IlIlllIIIIIIlIIllIIllIlll = 7;
    private static int IlIlIIlIlIllIIlIlIIllIIIl = 8;
    private static int lllllIlllIIllIlIIlIIIllII = 9;
    private static int IlIlIIlllIIlIllIIIlllllIl = 10;
    private static int lIIlIIIIIlIlllIlIIlIlIlll = 11;
    private static int lIlIlIIlIIIIlIIIIIlllIIII = 12;
    private static int IlIIIlIIIIllIIIllIIIIIIll = 13;
    private static int IIlllIlIlllIllIIIlllIIlIl = 14;
    private static int lIlIllIIlIIlIIlIIlIIlIIll = 15;
    private int[] llIIlIllIllllIlIIIIlIIlll;
    public class_1847[][] lllIIIllIIIIlllIlIIllIIll;
    public ArrayList lllIlIIlIIIlIlIIIllIlllIl;
    private ArrayList llIllllIlIllIIIlIllIIlIlI = new ArrayList();

    public class_0041(int n, int n2) {
        this.IlIllllllIIlIIllllIIlIIIl = n;
        this.lIlllIlllIIIIlIIlllIllIII = n2;
        this.llIIlIllIllllIlIIIIlIIlll = new int[n * n2 * IIIllIIlIIIIIIlIlIIllIIlI];
    }

    public int lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        return this.lllIIIllIIIIlllIlIIllIIll(n, n2, IllIIlllllllIIlIIlIIIIlIl);
    }

    public int lllIlIIlIIIlIlIIIllIlllIl(int n, int n2) {
        return this.lllIIIllIIIIlllIlIIllIIll(n, n2, IIIllIllIIlIlIlIlIllllIIl);
    }

    public int IlIllllllIIlIIllllIIlIIIl(int n, int n2) {
        return this.lllIIIllIIIIlllIlIIllIIll(n, n2, IllIIIllIIIIlIlIlIllIIlll);
    }

    public int lIlllIlllIIIIlIIlllIllIII(int n, int n2) {
        return this.lllIIIllIIIIlllIlIIllIIll(n, n2, lIIIIlIlIIlllllIIllIIlIII);
    }

    public int IlIIIIIllllllIIlllIllllll(int n, int n2) {
        return this.lllIIIllIIIIlllIlIIllIIll(n, n2, llIIlllIllIllllIIIlIIIIII);
    }

    public int lIllllIIlIIIlIllllllIIIll(int n, int n2) {
        return this.lllIIIllIIIIlllIlIIllIIll(n, n2, llIIllIllIlIIlIIllIllllll);
    }

    public int IIIllIIlIIIIIIlIlIIllIIlI(int n, int n2) {
        return this.lllIIIllIIIIlllIlIIllIIll(n, n2, lllIIlIIIllllllIIIIlIlIlI);
    }

    public int IllIIlllllllIIlIIlIIIIlIl(int n, int n2) {
        return this.lllIIIllIIIIlllIlIIllIIll(n, n2, IlIlllIIIIIIlIIllIIllIlll);
    }

    public int IIIllIllIIlIlIlIlIllllIIl(int n, int n2) {
        return this.lllIIIllIIIIlllIlIIllIIll(n, n2, IlIlIIlIlIllIIlIlIIllIIIl);
    }

    public int IllIIIllIIIIlIlIlIllIIlll(int n, int n2) {
        return this.lllIIIllIIIIlllIlIIllIIll(n, n2, lllllIlllIIllIlIIlIIIllII);
    }

    public int lIIIIlIlIIlllllIIllIIlIII(int n, int n2) {
        return this.lllIIIllIIIIlllIlIIllIIll(n, n2, IlIlIIlllIIlIllIIIlllllIl);
    }

    public int llIIlllIllIllllIIIlIIIIII(int n, int n2) {
        return this.lllIIIllIIIIlllIlIIllIIll(n, n2, lIIlIIIIIlIlllIlIIlIlIlll);
    }

    public int llIIllIllIlIIlIIllIllllll(int n, int n2) {
        return this.lllIIIllIIIIlllIlIIllIIll(n, n2, lIlIlIIlIIIIlIIIIIlllIIII);
    }

    public int lllIIlIIIllllllIIIIlIlIlI(int n, int n2) {
        return this.lllIIIllIIIIlllIlIIllIIll(n, n2, IlIIIlIIIIllIIIllIIIIIIll);
    }

    public int IlIlllIIIIIIlIIllIIllIlll(int n, int n2) {
        return this.lllIIIllIIIIlllIlIIllIIll(n, n2, IIlllIlIlllIllIIIlllIIlIl);
    }

    public int IlIlIIlIlIllIIlIlIIllIIIl(int n, int n2) {
        return this.lllIIIllIIIIlllIlIIllIIll(n, n2, lIlIllIIlIIlIIlIIlIIlIIll);
    }

    public int lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        int n4 = (n + n2 * this.IlIllllllIIlIIllllIIlIIIl) * IIIllIIlIIIIIIlIlIIllIIlI + n3;
        return this.llIIlIllIllllIlIIIIlIIlll[n4];
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, int n3) {
        this.lllIIIllIIIIlllIlIIllIIll(n, n2, IllIIlllllllIIlIIlIIIIlIl, n3);
    }

    public void IlIllllllIIlIIllllIIlIIIl(int n, int n2, int n3) {
        this.lllIIIllIIIIlllIlIIllIIll(n, n2, IIIllIllIIlIlIlIlIllllIIl, n3);
    }

    public void lIlllIlllIIIIlIIlllIllIII(int n, int n2, int n3) {
        this.lllIIIllIIIIlllIlIIllIIll(n, n2, IllIIIllIIIIlIlIlIllIIlll, n3);
    }

    public void IlIIIIIllllllIIlllIllllll(int n, int n2, int n3) {
        this.lllIIIllIIIIlllIlIIllIIll(n, n2, lIIIIlIlIIlllllIIllIIlIII, n3);
    }

    public void lIllllIIlIIIlIllllllIIIll(int n, int n2, int n3) {
        this.lllIIIllIIIIlllIlIIllIIll(n, n2, llIIlllIllIllllIIIlIIIIII, n3);
    }

    public void IIIllIIlIIIIIIlIlIIllIIlI(int n, int n2, int n3) {
        this.lllIIIllIIIIlllIlIIllIIll(n, n2, llIIllIllIlIIlIIllIllllll, n3);
    }

    public void IllIIlllllllIIlIIlIIIIlIl(int n, int n2, int n3) {
        this.lllIIIllIIIIlllIlIIllIIll(n, n2, lllIIlIIIllllllIIIIlIlIlI, n3);
    }

    public void IIIllIllIIlIlIlIlIllllIIl(int n, int n2, int n3) {
        this.lllIIIllIIIIlllIlIIllIIll(n, n2, IlIlllIIIIIIlIIllIIllIlll, n3);
    }

    public void IllIIIllIIIIlIlIlIllIIlll(int n, int n2, int n3) {
        this.lllIIIllIIIIlllIlIIllIIll(n, n2, IlIlIIlIlIllIIlIlIIllIIIl, n3);
    }

    public void lIIIIlIlIIlllllIIllIIlIII(int n, int n2, int n3) {
        this.lllIIIllIIIIlllIlIIllIIll(n, n2, lllllIlllIIllIlIIlIIIllII, n3);
    }

    public void llIIlllIllIllllIIIlIIIIII(int n, int n2, int n3) {
        this.lllIIIllIIIIlllIlIIllIIll(n, n2, IlIlIIlllIIlIllIIIlllllIl, n3);
    }

    public void llIIllIllIlIIlIIllIllllll(int n, int n2, int n3) {
        this.lllIIIllIIIIlllIlIIllIIll(n, n2, lIIlIIIIIlIlllIlIIlIlIlll, n3);
    }

    public void lllIIlIIIllllllIIIIlIlIlI(int n, int n2, int n3) {
        this.lllIIIllIIIIlllIlIIllIIll(n, n2, lIlIlIIlIIIIlIIIIIlllIIII, n3);
    }

    public void IlIlllIIIIIIlIIllIIllIlll(int n, int n2, int n3) {
        this.lllIIIllIIIIlllIlIIllIIll(n, n2, IlIIIlIIIIllIIIllIIIIIIll, n3);
    }

    public void IlIlIIlIlIllIIlIlIIllIIIl(int n, int n2, int n3) {
        this.lllIIIllIIIIlllIlIIllIIll(n, n2, IIlllIlIlllIllIIIlllIIlIl, n3);
    }

    public void lllllIlllIIllIlIIlIIIllII(int n, int n2, int n3) {
        this.lllIIIllIIIIlllIlIIllIIll(n, n2, lIlIllIIlIIlIIlIIlIIlIIll, n3);
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4) {
        int n5 = (n + n2 * this.IlIllllllIIlIIllllIIlIIIl) * IIIllIIlIIIIIIlIlIIllIIlI + n3;
        this.llIIlIllIllllIlIIIIlIIlll[n5] = n4;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void lllIIIllIIIIlllIlIIllIIll(int n) {
        Object object = this.IlIIIIIllllllIIlllIllllll;
        synchronized (object) {
            if (n > 0) {
                System.arraycopy(this.llIIlIllIllllIlIIIIlIIlll, n * IIIllIIlIIIIIIlIlIIllIIlI, this.llIIlIllIllllIlIIIIlIIlll, 0, this.llIIlIllIllllIlIIIIlIIlll.length - n * IIIllIIlIIIIIIlIlIIllIIlI);
            } else if (n < 0) {
                System.arraycopy(this.llIIlIllIllllIlIIIIlIIlll, 0, this.llIIlIllIllllIlIIIIlIIlll, -n * IIIllIIlIIIIIIlIlIIllIIlI, this.llIIlIllIllllIlIIIIlIIlll.length + n * IIIllIIlIIIIIIlIlIIllIIlI);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void lllIlIIlIIIlIlIIIllIlllIl(int n) {
        Object object = this.IlIIIIIllllllIIlllIllllll;
        synchronized (object) {
            if (n > 0) {
                System.arraycopy(this.llIIlIllIllllIlIIIIlIIlll, n * this.IlIllllllIIlIIllllIIlIIIl * IIIllIIlIIIIIIlIlIIllIIlI, this.llIIlIllIllllIlIIIIlIIlll, 0, this.llIIlIllIllllIlIIIIlIIlll.length - n * this.IlIllllllIIlIIllllIIlIIIl * IIIllIIlIIIIIIlIlIIllIIlI);
            } else if (n < 0) {
                System.arraycopy(this.llIIlIllIllllIlIIIIlIIlll, 0, this.llIIlIllIllllIlIIIIlIIlll, -n * this.IlIllllllIIlIIllllIIlIIIl * IIIllIIlIIIIIIlIlIIllIIlI, this.llIIlIllIllllIlIIIIlIIlll.length + n * this.IlIllllllIIlIIllllIIlIIIl * IIIllIIlIIIIIIlIlIIllIIlI);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void lllIIIllIIIIlllIlIIllIIll() {
        int n;
        this.lllIIIllIIIIlllIlIIllIIll = new class_1847[this.IlIllllllIIlIIllllIIlIIIl][this.lIlllIlllIIIIlIIlllIllIII];
        this.lllIlIIlIIIlIlIIIllIlllIl = new ArrayList();
        for (int i = 0; i < this.IlIllllllIIlIIllllIIlIIIl; ++i) {
            for (n = 0; n < this.lIlllIlllIIIIlIIlllIllIII; ++n) {
                this.lllIIIllIIIIlllIlIIllIIll[i][n] = new class_1847(this, i, n, this.IlIlIIlIlIllIIlIlIIllIIIl(i, n));
            }
        }
        Object object = this.IlIIIIIllllllIIlllIllllll;
        synchronized (object) {
            for (n = 0; n < this.IlIllllllIIlIIllllIIlIIIl; ++n) {
                for (int i = 0; i < this.lIlllIlllIIIIlIIlllIllIII; ++i) {
                    if (this.lllIIIllIIIIlllIlIIllIIll[n][i].IlIllllllIIlIIllllIIlIIIl) continue;
                    class_1438 class_14382 = new class_1438(this, this.lllIIIllIIIIlllIlIIllIIll[n][i]);
                    this.lllIlIIlIIIlIlIIIllIlllIl.add(class_14382);
                    class_14382.lllIIIllIIIIlllIlIIllIIll();
                }
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void lllIlIIlIIIlIlIIIllIlllIl() {
        if (this.lllIlIIlIIIlIlIIIllIlllIl != null) {
            for (int i = 0; i < this.lllIlIIlIIIlIlIIIllIlllIl.size(); ++i) {
                class_1438 class_14382 = (class_1438)this.lllIlIIlIIIlIlIIIllIlllIl.get(i);
                if (class_14382.IlIllllllIIlIIllllIIlIIIl == -1) continue;
                class_14382.lllIlIIlIIIlIlIIIllIlllIl();
            }
        }
        Object object = this.lIllllIIlIIIlIllllllIIIll;
        synchronized (object) {
            this.llIllllIlIllIIIlIllIIlIlI.clear();
            if (this.lllIlIIlIIIlIlIIIllIlllIl != null) {
                for (int i = 0; i < this.lllIlIIlIIIlIlIIIllIlllIl.size(); ++i) {
                    class_1438 class_14383 = (class_1438)this.lllIlIIlIIIlIlIIIllIlllIl.get(i);
                    if (class_14383.IlIllllllIIlIIllllIIlIIIl == -1) continue;
                    class_1958 class_19582 = new class_1958(this);
                    class_19582.lllIIIllIIIIlllIlIIllIIll = class_14383.IlIllllllIIlIIllllIIlIIIl;
                    class_19582.lllIlIIlIIIlIlIIIllIlllIl = class_14383.lllIIIllIIIIlllIlIIllIIll.size();
                    class_19582.IlIllllllIIlIIllllIIlIIIl = class_14383.lIlllIlllIIIIlIIlllIllIII;
                    class_19582.lIlllIlllIIIIlIIlllIllIII = class_14383.IlIIIIIllllllIIlllIllllll;
                    this.llIllllIlIllIIIlIllIIlIlI.add(class_19582);
                }
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public ArrayList IlIllllllIIlIIllllIIlIIIl() {
        ArrayList arrayList = new ArrayList();
        Object object = this.lIllllIIlIIIlIllllllIIIll;
        synchronized (object) {
            arrayList.addAll(this.llIllllIlIllIIIlIllIIlIlI);
        }
        return arrayList;
    }

    static /* synthetic */ int lllIIIllIIIIlllIlIIllIIll(class_0041 class_00412) {
        return class_00412.IlIllllllIIlIIllllIIlIIIl;
    }

    static /* synthetic */ int lllIlIIlIIIlIlIIIllIlllIl(class_0041 class_00412) {
        return class_00412.lIlllIlllIIIIlIIlllIllIII;
    }
}

