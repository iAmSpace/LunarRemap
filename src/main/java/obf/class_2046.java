package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_2046 {
    public int lllIIIllIIIIlllIlIIllIIll;
    public int lllIlIIlIIIlIlIIIllIlllIl;
    public int IlIllllllIIlIIllllIIlIIIl;
    public int lIlllIlllIIIIlIIlllIllIII;
    public int IlIIIIIllllllIIlllIllllll;
    public int lIllllIIlIIIlIllllllIIIll;

    public class_2046() {
    }

    public class_2046(int[] arrn) {
        if (arrn.length == 6) {
            this.lllIIIllIIIIlllIlIIllIIll = arrn[0];
            this.lllIlIIlIIIlIlIIIllIlllIl = arrn[1];
            this.IlIllllllIIlIIllllIIlIIIl = arrn[2];
            this.lIlllIlllIIIIlIIlllIllIII = arrn[3];
            this.IlIIIIIllllllIIlllIllllll = arrn[4];
            this.lIllllIIlIIIlIllllllIIIll = arrn[5];
        }
    }

    public static class_2046 lllIIIllIIIIlllIlIIllIIll() {
        return new class_2046(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public static class_2046 lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10) {
        switch (n10) {
            case 0: {
                return new class_2046(n + n4, n2 + n5, n3 + n6, n + n7 - 1 + n4, n2 + n8 - 1 + n5, n3 + n9 - 1 + n6);
            }
            case 1: {
                return new class_2046(n - n9 + 1 + n6, n2 + n5, n3 + n4, n + n6, n2 + n8 - 1 + n5, n3 + n7 - 1 + n4);
            }
            case 2: {
                return new class_2046(n + n4, n2 + n5, n3 - n9 + 1 + n6, n + n7 - 1 + n4, n2 + n8 - 1 + n5, n3 + n6);
            }
            case 3: {
                return new class_2046(n + n6, n2 + n5, n3 + n4, n + n9 - 1 + n6, n2 + n8 - 1 + n5, n3 + n7 - 1 + n4);
            }
        }
        return new class_2046(n + n4, n2 + n5, n3 + n6, n + n7 - 1 + n4, n2 + n8 - 1 + n5, n3 + n9 - 1 + n6);
    }

    public class_2046(class_2046 class_20462) {
        this.lllIIIllIIIIlllIlIIllIIll = class_20462.lllIIIllIIIIlllIlIIllIIll;
        this.lllIlIIlIIIlIlIIIllIlllIl = class_20462.lllIlIIlIIIlIlIIIllIlllIl;
        this.IlIllllllIIlIIllllIIlIIIl = class_20462.IlIllllllIIlIIllllIIlIIIl;
        this.lIlllIlllIIIIlIIlllIllIII = class_20462.lIlllIlllIIIIlIIlllIllIII;
        this.IlIIIIIllllllIIlllIllllll = class_20462.IlIIIIIllllllIIlllIllllll;
        this.lIllllIIlIIIlIllllllIIIll = class_20462.lIllllIIlIIIlIllllllIIIll;
    }

    public class_2046(int n, int n2, int n3, int n4, int n5, int n6) {
        this.lllIIIllIIIIlllIlIIllIIll = n;
        this.lllIlIIlIIIlIlIIIllIlllIl = n2;
        this.IlIllllllIIlIIllllIIlIIIl = n3;
        this.lIlllIlllIIIIlIIlllIllIII = n4;
        this.IlIIIIIllllllIIlllIllllll = n5;
        this.lIllllIIlIIIlIllllllIIIll = n6;
    }

    public class_2046(int n, int n2, int n3, int n4) {
        this.lllIIIllIIIIlllIlIIllIIll = n;
        this.IlIllllllIIlIIllllIIlIIIl = n2;
        this.lIlllIlllIIIIlIIlllIllIII = n3;
        this.lIllllIIlIIIlIllllllIIIll = n4;
        this.lllIlIIlIIIlIlIIIllIlllIl = 1;
        this.IlIIIIIllllllIIlllIllllll = 512;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_2046 class_20462) {
        return this.lIlllIlllIIIIlIIlllIllIII >= class_20462.lllIIIllIIIIlllIlIIllIIll && this.lllIIIllIIIIlllIlIIllIIll <= class_20462.lIlllIlllIIIIlIIlllIllIII && this.lIllllIIlIIIlIllllllIIIll >= class_20462.IlIllllllIIlIIllllIIlIIIl && this.IlIllllllIIlIIllllIIlIIIl <= class_20462.lIllllIIlIIIlIllllllIIIll && this.IlIIIIIllllllIIlllIllllll >= class_20462.lllIlIIlIIIlIlIIIllIlllIl && this.lllIlIIlIIIlIlIIIllIlllIl <= class_20462.IlIIIIIllllllIIlllIllllll;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4) {
        return this.lIlllIlllIIIIlIIlllIllIII >= n && this.lllIIIllIIIIlllIlIIllIIll <= n3 && this.lIllllIIlIIIlIllllllIIIll >= n2 && this.IlIllllllIIlIIllllIIlIIIl <= n4;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(class_2046 class_20462) {
        this.lllIIIllIIIIlllIlIIllIIll = Math.min(this.lllIIIllIIIIlllIlIIllIIll, class_20462.lllIIIllIIIIlllIlIIllIIll);
        this.lllIlIIlIIIlIlIIIllIlllIl = Math.min(this.lllIlIIlIIIlIlIIIllIlllIl, class_20462.lllIlIIlIIIlIlIIIllIlllIl);
        this.IlIllllllIIlIIllllIIlIIIl = Math.min(this.IlIllllllIIlIIllllIIlIIIl, class_20462.IlIllllllIIlIIllllIIlIIIl);
        this.lIlllIlllIIIIlIIlllIllIII = Math.max(this.lIlllIlllIIIIlIIlllIllIII, class_20462.lIlllIlllIIIIlIIlllIllIII);
        this.IlIIIIIllllllIIlllIllllll = Math.max(this.IlIIIIIllllllIIlllIllllll, class_20462.IlIIIIIllllllIIlllIllllll);
        this.lIllllIIlIIIlIllllllIIIll = Math.max(this.lIllllIIlIIIlIllllllIIIll, class_20462.lIllllIIlIIIlIllllllIIIll);
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        this.lllIIIllIIIIlllIlIIllIIll += n;
        this.lllIlIIlIIIlIlIIIllIlllIl += n2;
        this.IlIllllllIIlIIllllIIlIIIl += n3;
        this.lIlllIlllIIIIlIIlllIllIII += n;
        this.IlIIIIIllllllIIlllIllllll += n2;
        this.lIllllIIlIIIlIllllllIIIll += n3;
    }

    public boolean lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, int n3) {
        return n >= this.lllIIIllIIIIlllIlIIllIIll && n <= this.lIlllIlllIIIIlIIlllIllIII && n3 >= this.IlIllllllIIlIIllllIIlIIIl && n3 <= this.lIllllIIlIIIlIllllllIIIll && n2 >= this.lllIlIIlIIIlIlIIIllIlllIl && n2 <= this.IlIIIIIllllllIIlllIllllll;
    }

    public int lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lIlllIlllIIIIlIIlllIllIII - this.lllIIIllIIIIlllIlIIllIIll + 1;
    }

    public int IlIllllllIIlIIllllIIlIIIl() {
        return this.IlIIIIIllllllIIlllIllllll - this.lllIlIIlIIIlIlIIIllIlllIl + 1;
    }

    public int lIlllIlllIIIIlIIlllIllIII() {
        return this.lIllllIIlIIIlIllllllIIIll - this.IlIllllllIIlIIllllIIlIIIl + 1;
    }

    public int IlIIIIIllllllIIlllIllllll() {
        return this.lllIIIllIIIIlllIlIIllIIll + (this.lIlllIlllIIIIlIIlllIllIII - this.lllIIIllIIIIlllIlIIllIIll + 1) / 2;
    }

    public int lIllllIIlIIIlIllllllIIIll() {
        return this.lllIlIIlIIIlIlIIIllIlllIl + (this.IlIIIIIllllllIIlllIllllll - this.lllIlIIlIIIlIlIIIllIlllIl + 1) / 2;
    }

    public int IIIllIIlIIIIIIlIlIIllIIlI() {
        return this.IlIllllllIIlIIllllIIlIIIl + (this.lIllllIIlIIIlIllllllIIIll - this.IlIllllllIIlIIllllIIlIIIl + 1) / 2;
    }

    public String toString() {
        return "(" + this.lllIIIllIIIIlllIlIIllIIll + ", " + this.lllIlIIlIIIlIlIIIllIlllIl + ", " + this.IlIllllllIIlIIllllIIlIIIl + "; " + this.lIlllIlllIIIIlIIlllIllIII + ", " + this.IlIIIIIllllllIIlllIllllll + ", " + this.lIllllIIlIIIlIllllllIIIll + ")";
    }

    public class_1794 IllIIlllllllIIlIIlIIIIlIl() {
        return new class_1794(new int[]{this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll, this.lIllllIIlIIIlIllllllIIIll});
    }
}

