package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1974 {
    public double lllIIIllIIIIlllIlIIllIIll;
    public double lllIlIIlIIIlIlIIIllIlllIl;
    public double IlIllllllIIlIIllllIIlIIIl;
    public double lIlllIlllIIIIlIIlllIllIII;
    public double IlIIIIIllllllIIlllIllllll;
    public double lIllllIIlIIIlIllllllIIIll;

    public static class_1974 lllIIIllIIIIlllIlIIllIIll(double d, double d2, double d3, double d4, double d5, double d6) {
        return new class_1974(d, d2, d3, d4, d5, d6);
    }

    public class_1974(double d, double d2, double d3, double d4, double d5, double d6) {
        this.lllIIIllIIIIlllIlIIllIIll = d;
        this.lllIlIIlIIIlIlIIIllIlllIl = d2;
        this.IlIllllllIIlIIllllIIlIIIl = d3;
        this.lIlllIlllIIIIlIIlllIllIII = d4;
        this.IlIIIIIllllllIIlllIllllll = d5;
        this.lIllllIIlIIIlIllllllIIIll = d6;
    }

    public class_1974 lllIlIIlIIIlIlIIIllIlllIl(double d, double d2, double d3, double d4, double d5, double d6) {
        this.lllIIIllIIIIlllIlIIllIIll = d;
        this.lllIlIIlIIIlIlIIIllIlllIl = d2;
        this.IlIllllllIIlIIllllIIlIIIl = d3;
        this.lIlllIlllIIIIlIIlllIllIII = d4;
        this.IlIIIIIllllllIIlllIllllll = d5;
        this.lIllllIIlIIIlIllllllIIIll = d6;
        return this;
    }

    public class_1974 lllIIIllIIIIlllIlIIllIIll(double d, double d2, double d3) {
        double d4 = this.lllIIIllIIIIlllIlIIllIIll;
        double d5 = this.lllIlIIlIIIlIlIIIllIlllIl;
        double d6 = this.IlIllllllIIlIIllllIIlIIIl;
        double d7 = this.lIlllIlllIIIIlIIlllIllIII;
        double d8 = this.IlIIIIIllllllIIlllIllllll;
        double d9 = this.lIllllIIlIIIlIllllllIIIll;
        if (d < 0.0) {
            d4 += d;
        }
        if (d > 0.0) {
            d7 += d;
        }
        if (d2 < 0.0) {
            d5 += d2;
        }
        if (d2 > 0.0) {
            d8 += d2;
        }
        if (d3 < 0.0) {
            d6 += d3;
        }
        if (d3 > 0.0) {
            d9 += d3;
        }
        return class_1974.lllIIIllIIIIlllIlIIllIIll(d4, d5, d6, d7, d8, d9);
    }

    public class_1974 lllIlIIlIIIlIlIIIllIlllIl(double d, double d2, double d3) {
        double d4 = this.lllIIIllIIIIlllIlIIllIIll - d;
        double d5 = this.lllIlIIlIIIlIlIIIllIlllIl - d2;
        double d6 = this.IlIllllllIIlIIllllIIlIIIl - d3;
        double d7 = this.lIlllIlllIIIIlIIlllIllIII + d;
        double d8 = this.IlIIIIIllllllIIlllIllllll + d2;
        double d9 = this.lIllllIIlIIIlIllllllIIIll + d3;
        return class_1974.lllIIIllIIIIlllIlIIllIIll(d4, d5, d6, d7, d8, d9);
    }

    public class_1974 lllIIIllIIIIlllIlIIllIIll(class_1974 class_19742) {
        double d = Math.min(this.lllIIIllIIIIlllIlIIllIIll, class_19742.lllIIIllIIIIlllIlIIllIIll);
        double d2 = Math.min(this.lllIlIIlIIIlIlIIIllIlllIl, class_19742.lllIlIIlIIIlIlIIIllIlllIl);
        double d3 = Math.min(this.IlIllllllIIlIIllllIIlIIIl, class_19742.IlIllllllIIlIIllllIIlIIIl);
        double d4 = Math.max(this.lIlllIlllIIIIlIIlllIllIII, class_19742.lIlllIlllIIIIlIIlllIllIII);
        double d5 = Math.max(this.IlIIIIIllllllIIlllIllllll, class_19742.IlIIIIIllllllIIlllIllllll);
        double d6 = Math.max(this.lIllllIIlIIIlIllllllIIIll, class_19742.lIllllIIlIIIlIllllllIIIll);
        return class_1974.lllIIIllIIIIlllIlIIllIIll(d, d2, d3, d4, d5, d6);
    }

    public class_1974 IlIllllllIIlIIllllIIlIIIl(double d, double d2, double d3) {
        return class_1974.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll + d, this.lllIlIIlIIIlIlIIIllIlllIl + d2, this.IlIllllllIIlIIllllIIlIIIl + d3, this.lIlllIlllIIIIlIIlllIllIII + d, this.IlIIIIIllllllIIlllIllllll + d2, this.lIllllIIlIIIlIllllllIIIll + d3);
    }

    public double lllIIIllIIIIlllIlIIllIIll(class_1974 class_19742, double d) {
        if (class_19742.IlIIIIIllllllIIlllIllllll > this.lllIlIIlIIIlIlIIIllIlllIl && class_19742.lllIlIIlIIIlIlIIIllIlllIl < this.IlIIIIIllllllIIlllIllllll) {
            if (class_19742.lIllllIIlIIIlIllllllIIIll > this.IlIllllllIIlIIllllIIlIIIl && class_19742.IlIllllllIIlIIllllIIlIIIl < this.lIllllIIlIIIlIllllllIIIll) {
                double d2;
                if (d > 0.0 && class_19742.lIlllIlllIIIIlIIlllIllIII <= this.lllIIIllIIIIlllIlIIllIIll && (d2 = this.lllIIIllIIIIlllIlIIllIIll - class_19742.lIlllIlllIIIIlIIlllIllIII) < d) {
                    d = d2;
                }
                if (d < 0.0 && class_19742.lllIIIllIIIIlllIlIIllIIll >= this.lIlllIlllIIIIlIIlllIllIII && (d2 = this.lIlllIlllIIIIlIIlllIllIII - class_19742.lllIIIllIIIIlllIlIIllIIll) > d) {
                    d = d2;
                }
                return d;
            }
            return d;
        }
        return d;
    }

    public double lllIlIIlIIIlIlIIIllIlllIl(class_1974 class_19742, double d) {
        if (class_19742.lIlllIlllIIIIlIIlllIllIII > this.lllIIIllIIIIlllIlIIllIIll && class_19742.lllIIIllIIIIlllIlIIllIIll < this.lIlllIlllIIIIlIIlllIllIII) {
            if (class_19742.lIllllIIlIIIlIllllllIIIll > this.IlIllllllIIlIIllllIIlIIIl && class_19742.IlIllllllIIlIIllllIIlIIIl < this.lIllllIIlIIIlIllllllIIIll) {
                double d2;
                if (d > 0.0 && class_19742.IlIIIIIllllllIIlllIllllll <= this.lllIlIIlIIIlIlIIIllIlllIl && (d2 = this.lllIlIIlIIIlIlIIIllIlllIl - class_19742.IlIIIIIllllllIIlllIllllll) < d) {
                    d = d2;
                }
                if (d < 0.0 && class_19742.lllIlIIlIIIlIlIIIllIlllIl >= this.IlIIIIIllllllIIlllIllllll && (d2 = this.IlIIIIIllllllIIlllIllllll - class_19742.lllIlIIlIIIlIlIIIllIlllIl) > d) {
                    d = d2;
                }
                return d;
            }
            return d;
        }
        return d;
    }

    public double IlIllllllIIlIIllllIIlIIIl(class_1974 class_19742, double d) {
        if (class_19742.lIlllIlllIIIIlIIlllIllIII > this.lllIIIllIIIIlllIlIIllIIll && class_19742.lllIIIllIIIIlllIlIIllIIll < this.lIlllIlllIIIIlIIlllIllIII) {
            if (class_19742.IlIIIIIllllllIIlllIllllll > this.lllIlIIlIIIlIlIIIllIlllIl && class_19742.lllIlIIlIIIlIlIIIllIlllIl < this.IlIIIIIllllllIIlllIllllll) {
                double d2;
                if (d > 0.0 && class_19742.lIllllIIlIIIlIllllllIIIll <= this.IlIllllllIIlIIllllIIlIIIl && (d2 = this.IlIllllllIIlIIllllIIlIIIl - class_19742.lIllllIIlIIIlIllllllIIIll) < d) {
                    d = d2;
                }
                if (d < 0.0 && class_19742.IlIllllllIIlIIllllIIlIIIl >= this.lIllllIIlIIIlIllllllIIIll && (d2 = this.lIllllIIlIIIlIllllllIIIll - class_19742.IlIllllllIIlIIllllIIlIIIl) > d) {
                    d = d2;
                }
                return d;
            }
            return d;
        }
        return d;
    }

    public boolean lllIlIIlIIIlIlIIIllIlllIl(class_1974 class_19742) {
        return class_19742.lIlllIlllIIIIlIIlllIllIII > this.lllIIIllIIIIlllIlIIllIIll && class_19742.lllIIIllIIIIlllIlIIllIIll < this.lIlllIlllIIIIlIIlllIllIII ? (class_19742.IlIIIIIllllllIIlllIllllll > this.lllIlIIlIIIlIlIIIllIlllIl && class_19742.lllIlIIlIIIlIlIIIllIlllIl < this.IlIIIIIllllllIIlllIllllll ? class_19742.lIllllIIlIIIlIllllllIIIll > this.IlIllllllIIlIIllllIIlIIIl && class_19742.IlIllllllIIlIIllllIIlIIIl < this.lIllllIIlIIIlIllllllIIIll : false) : false;
    }

    public class_1974 lIlllIlllIIIIlIIlllIllIII(double d, double d2, double d3) {
        this.lllIIIllIIIIlllIlIIllIIll += d;
        this.lllIlIIlIIIlIlIIIllIlllIl += d2;
        this.IlIllllllIIlIIllllIIlIIIl += d3;
        this.lIlllIlllIIIIlIIlllIllIII += d;
        this.IlIIIIIllllllIIlllIllllll += d2;
        this.lIllllIIlIIIlIllllllIIIll += d3;
        return this;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_0864 class_08642) {
        return class_08642.lllIIIllIIIIlllIlIIllIIll > this.lllIIIllIIIIlllIlIIllIIll && class_08642.lllIIIllIIIIlllIlIIllIIll < this.lIlllIlllIIIIlIIlllIllIII ? (class_08642.lllIlIIlIIIlIlIIIllIlllIl > this.lllIlIIlIIIlIlIIIllIlllIl && class_08642.lllIlIIlIIIlIlIIIllIlllIl < this.IlIIIIIllllllIIlllIllllll ? class_08642.IlIllllllIIlIIllllIIlIIIl > this.IlIllllllIIlIIllllIIlIIIl && class_08642.IlIllllllIIlIIllllIIlIIIl < this.lIllllIIlIIIlIllllllIIIll : false) : false;
    }

    public double lllIIIllIIIIlllIlIIllIIll() {
        double d = this.lIlllIlllIIIIlIIlllIllIII - this.lllIIIllIIIIlllIlIIllIIll;
        double d2 = this.IlIIIIIllllllIIlllIllllll - this.lllIlIIlIIIlIlIIIllIlllIl;
        double d3 = this.lIllllIIlIIIlIllllllIIIll - this.IlIllllllIIlIIllllIIlIIIl;
        return (d + d2 + d3) / 3.0;
    }

    public class_1974 IlIIIIIllllllIIlllIllllll(double d, double d2, double d3) {
        double d4 = this.lllIIIllIIIIlllIlIIllIIll + d;
        double d5 = this.lllIlIIlIIIlIlIIIllIlllIl + d2;
        double d6 = this.IlIllllllIIlIIllllIIlIIIl + d3;
        double d7 = this.lIlllIlllIIIIlIIlllIllIII - d;
        double d8 = this.IlIIIIIllllllIIlllIllllll - d2;
        double d9 = this.lIllllIIlIIIlIllllllIIIll - d3;
        return class_1974.lllIIIllIIIIlllIlIIllIIll(d4, d5, d6, d7, d8, d9);
    }

    public class_1974 lllIlIIlIIIlIlIIIllIlllIl() {
        return class_1974.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll, this.lIllllIIlIIIlIllllllIIIll);
    }

    public class_1112 lllIIIllIIIIlllIlIIllIIll(class_0864 class_08642, class_0864 class_08643) {
        class_0864 class_08644 = class_08642.lllIIIllIIIIlllIlIIllIIll(class_08643, this.lllIIIllIIIIlllIlIIllIIll);
        class_0864 class_08645 = class_08642.lllIIIllIIIIlllIlIIllIIll(class_08643, this.lIlllIlllIIIIlIIlllIllIII);
        class_0864 class_08646 = class_08642.lllIlIIlIIIlIlIIIllIlllIl(class_08643, this.lllIlIIlIIIlIlIIIllIlllIl);
        class_0864 class_08647 = class_08642.lllIlIIlIIIlIlIIIllIlllIl(class_08643, this.IlIIIIIllllllIIlllIllllll);
        class_0864 class_08648 = class_08642.IlIllllllIIlIIllllIIlIIIl(class_08643, this.IlIllllllIIlIIllllIIlIIIl);
        class_0864 class_08649 = class_08642.IlIllllllIIlIIllllIIlIIIl(class_08643, this.lIllllIIlIIIlIllllllIIIll);
        if (!this.lllIlIIlIIIlIlIIIllIlllIl(class_08644)) {
            class_08644 = null;
        }
        if (!this.lllIlIIlIIIlIlIIIllIlllIl(class_08645)) {
            class_08645 = null;
        }
        if (!this.IlIllllllIIlIIllllIIlIIIl(class_08646)) {
            class_08646 = null;
        }
        if (!this.IlIllllllIIlIIllllIIlIIIl(class_08647)) {
            class_08647 = null;
        }
        if (!this.lIlllIlllIIIIlIIlllIllIII(class_08648)) {
            class_08648 = null;
        }
        if (!this.lIlllIlllIIIIlIIlllIllIII(class_08649)) {
            class_08649 = null;
        }
        class_0864 class_086410 = null;
        if (class_08644 != null && (class_086410 == null || class_08642.IlIIIIIllllllIIlllIllllll(class_08644) < class_08642.IlIIIIIllllllIIlllIllllll(class_086410))) {
            class_086410 = class_08644;
        }
        if (class_08645 != null && (class_086410 == null || class_08642.IlIIIIIllllllIIlllIllllll(class_08645) < class_08642.IlIIIIIllllllIIlllIllllll(class_086410))) {
            class_086410 = class_08645;
        }
        if (class_08646 != null && (class_086410 == null || class_08642.IlIIIIIllllllIIlllIllllll(class_08646) < class_08642.IlIIIIIllllllIIlllIllllll(class_086410))) {
            class_086410 = class_08646;
        }
        if (class_08647 != null && (class_086410 == null || class_08642.IlIIIIIllllllIIlllIllllll(class_08647) < class_08642.IlIIIIIllllllIIlllIllllll(class_086410))) {
            class_086410 = class_08647;
        }
        if (class_08648 != null && (class_086410 == null || class_08642.IlIIIIIllllllIIlllIllllll(class_08648) < class_08642.IlIIIIIllllllIIlllIllllll(class_086410))) {
            class_086410 = class_08648;
        }
        if (class_08649 != null && (class_086410 == null || class_08642.IlIIIIIllllllIIlllIllllll(class_08649) < class_08642.IlIIIIIllllllIIlllIllllll(class_086410))) {
            class_086410 = class_08649;
        }
        if (class_086410 == null) {
            return null;
        }
        int n = -1;
        if (class_086410 == class_08644) {
            n = 4;
        }
        if (class_086410 == class_08645) {
            n = 5;
        }
        if (class_086410 == class_08646) {
            n = 0;
        }
        if (class_086410 == class_08647) {
            n = 1;
        }
        if (class_086410 == class_08648) {
            n = 2;
        }
        if (class_086410 == class_08649) {
            n = 3;
        }
        return new class_1112(0, 0, 0, n, class_086410);
    }

    private boolean lllIlIIlIIIlIlIIIllIlllIl(class_0864 class_08642) {
        return class_08642 == null ? false : class_08642.lllIlIIlIIIlIlIIIllIlllIl >= this.lllIlIIlIIIlIlIIIllIlllIl && class_08642.lllIlIIlIIIlIlIIIllIlllIl <= this.IlIIIIIllllllIIlllIllllll && class_08642.IlIllllllIIlIIllllIIlIIIl >= this.IlIllllllIIlIIllllIIlIIIl && class_08642.IlIllllllIIlIIllllIIlIIIl <= this.lIllllIIlIIIlIllllllIIIll;
    }

    private boolean IlIllllllIIlIIllllIIlIIIl(class_0864 class_08642) {
        return class_08642 == null ? false : class_08642.lllIIIllIIIIlllIlIIllIIll >= this.lllIIIllIIIIlllIlIIllIIll && class_08642.lllIIIllIIIIlllIlIIllIIll <= this.lIlllIlllIIIIlIIlllIllIII && class_08642.IlIllllllIIlIIllllIIlIIIl >= this.IlIllllllIIlIIllllIIlIIIl && class_08642.IlIllllllIIlIIllllIIlIIIl <= this.lIllllIIlIIIlIllllllIIIll;
    }

    private boolean lIlllIlllIIIIlIIlllIllIII(class_0864 class_08642) {
        return class_08642 == null ? false : class_08642.lllIIIllIIIIlllIlIIllIIll >= this.lllIIIllIIIIlllIlIIllIIll && class_08642.lllIIIllIIIIlllIlIIllIIll <= this.lIlllIlllIIIIlIIlllIllIII && class_08642.lllIlIIlIIIlIlIIIllIlllIl >= this.lllIlIIlIIIlIlIIIllIlllIl && class_08642.lllIlIIlIIIlIlIIIllIlllIl <= this.IlIIIIIllllllIIlllIllllll;
    }

    public void IlIllllllIIlIIllllIIlIIIl(class_1974 class_19742) {
        this.lllIIIllIIIIlllIlIIllIIll = class_19742.lllIIIllIIIIlllIlIIllIIll;
        this.lllIlIIlIIIlIlIIIllIlllIl = class_19742.lllIlIIlIIIlIlIIIllIlllIl;
        this.IlIllllllIIlIIllllIIlIIIl = class_19742.IlIllllllIIlIIllllIIlIIIl;
        this.lIlllIlllIIIIlIIlllIllIII = class_19742.lIlllIlllIIIIlIIlllIllIII;
        this.IlIIIIIllllllIIlllIllllll = class_19742.IlIIIIIllllllIIlllIllllll;
        this.lIllllIIlIIIlIllllllIIIll = class_19742.lIllllIIlIIIlIllllllIIIll;
    }

    public String toString() {
        return "box[" + this.lllIIIllIIIIlllIlIIllIIll + ", " + this.lllIlIIlIIIlIlIIIllIlllIl + ", " + this.IlIllllllIIlIIllllIIlIIIl + " -> " + this.lIlllIlllIIIIlIIlllIllIII + ", " + this.IlIIIIIllllllIIlllIllllll + ", " + this.lIllllIIlIIIlIllllllIIIll + "]";
    }
}

