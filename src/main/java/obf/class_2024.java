package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;
import java.util.List;

public class class_2024 {
    private final int lllIIIllIIIIlllIlIIllIIll;
    private final int lllIlIIlIIIlIlIIIllIlllIl;
    private final int IlIllllllIIlIIllllIIlIIIl;
    private final int lIlllIlllIIIIlIIlllIllIII;
    private List IlIIIIIllllllIIlllIllllll;
    private class_1797 lIllllIIlIIIlIllllllIIIll;

    public class_2024(int n, int n2, int n3, int n4) {
        this.lllIIIllIIIIlllIlIIllIIll = n;
        this.lllIlIIlIIIlIlIIIllIlllIl = n2;
        this.IlIllllllIIlIIllllIIlIIIl = n3;
        this.lIlllIlllIIIIlIIlllIllIII = n4;
    }

    public class_1797 lllIIIllIIIIlllIlIIllIIll() {
        return this.lIllllIIlIIIlIllllllIIIll;
    }

    public int lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public int IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_1797 class_17972) {
        if (this.lIllllIIlIIIlIllllllIIIll != null) {
            return false;
        }
        int n = class_17972.lllIlIIlIIIlIlIIIllIlllIl();
        int n2 = class_17972.IlIllllllIIlIIllllIIlIIIl();
        if (n <= this.IlIllllllIIlIIllllIIlIIIl && n2 <= this.lIlllIlllIIIIlIIlllIllIII) {
            if (n == this.IlIllllllIIlIIllllIIlIIIl && n2 == this.lIlllIlllIIIIlIIlllIllIII) {
                this.lIllllIIlIIIlIllllllIIIll = class_17972;
                return true;
            }
            if (this.IlIIIIIllllllIIlllIllllll == null) {
                this.IlIIIIIllllllIIlllIllllll = new ArrayList(1);
                this.IlIIIIIllllllIIlllIllllll.add(new class_2024(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl, n, n2));
                int n3 = this.IlIllllllIIlIIllllIIlIIIl - n;
                int n4 = this.lIlllIlllIIIIlIIlllIllIII - n2;
                if (n4 > 0 && n3 > 0) {
                    int n5;
                    int n6 = Math.max(this.lIlllIlllIIIIlIIlllIllIII, n3);
                    if (n6 >= (n5 = Math.max(this.IlIllllllIIlIIllllIIlIIIl, n4))) {
                        this.IlIIIIIllllllIIlllIllllll.add(new class_2024(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl + n2, n, n4));
                        this.IlIIIIIllllllIIlllIllllll.add(new class_2024(this.lllIIIllIIIIlllIlIIllIIll + n, this.lllIlIIlIIIlIlIIIllIlllIl, n3, this.lIlllIlllIIIIlIIlllIllIII));
                    } else {
                        this.IlIIIIIllllllIIlllIllllll.add(new class_2024(this.lllIIIllIIIIlllIlIIllIIll + n, this.lllIlIIlIIIlIlIIIllIlllIl, n3, n2));
                        this.IlIIIIIllllllIIlllIllllll.add(new class_2024(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl + n2, this.IlIllllllIIlIIllllIIlIIIl, n4));
                    }
                } else if (n3 == 0) {
                    this.IlIIIIIllllllIIlllIllllll.add(new class_2024(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl + n2, n, n4));
                } else if (n4 == 0) {
                    this.IlIIIIIllllllIIlllIllllll.add(new class_2024(this.lllIIIllIIIIlllIlIIllIIll + n, this.lllIlIIlIIIlIlIIIllIlllIl, n3, n2));
                }
            }
            for (class_2024 class_20242 : this.IlIIIIIllllllIIlllIllllll) {
                if (!class_20242.lllIIIllIIIIlllIlIIllIIll(class_17972)) continue;
                return true;
            }
            return false;
        }
        return false;
    }

    public void lllIIIllIIIIlllIlIIllIIll(List list) {
        if (this.lIllllIIlIIIlIllllllIIIll != null) {
            list.add(this);
        } else if (this.IlIIIIIllllllIIlllIllllll != null) {
            for (class_2024 class_20242 : this.IlIIIIIllllllIIlllIllllll) {
                class_20242.lllIIIllIIIIlllIlIIllIIll(list);
            }
        }
    }

    public String toString() {
        return "Slot{originX=" + this.lllIIIllIIIIlllIlIIllIIll + ", originY=" + this.lllIlIIlIIIlIlIIIllIlllIl + ", width=" + this.IlIllllllIIlIIllllIIlIIIl + ", height=" + this.lIlllIlllIIIIlIIlllIllIII + ", texture=" + this.lIllllIIlIIIlIllllllIIIll + ", subSlots=" + this.IlIIIIIllllllIIlllIllllll + '}';
    }
}

