package obf;

import optifine.Config;

/*
 * Decompiled with CFR 0.150.
 */
public class class_2198 {
    private int lllIIIllIIIIlllIlIIllIIll = -1;
    private int[] lllIlIIlIIIlIlIIIllIlllIl = null;

    public class_2198(int n) {
        this.lllIIIllIIIIlllIlIIllIIll = n;
    }

    public class_2198(int n, int n2) {
        this.lllIIIllIIIIlllIlIIllIIll = n;
        if (n2 >= 0 && n2 <= 15) {
            this.lllIlIIlIIIlIlIIIllIlllIl = new int[]{n2};
        }
    }

    public class_2198(int n, int[] arrn) {
        this.lllIIIllIIIIlllIlIIllIIll = n;
        this.lllIlIIlIIIlIlIIIllIlllIl = arrn;
    }

    public int lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public int[] lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        if (n != this.lllIIIllIIIIlllIlIIllIIll) {
            return false;
        }
        if (this.lllIlIIlIIIlIlIIIllIlllIl != null) {
            boolean bl = false;
            for (int i = 0; i < this.lllIlIIlIIIlIlIIIllIlllIl.length; ++i) {
                int n3 = this.lllIlIIlIIIlIlIIIllIlllIl[i];
                if (n3 != n2) continue;
                bl = true;
                break;
            }
            if (!bl) {
                return false;
            }
        }
        return true;
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n) {
        if (this.lllIlIIlIIIlIlIIIllIlllIl != null && n >= 0 && n <= 15) {
            for (int i = 0; i < this.lllIlIIlIIIlIlIIIllIlllIl.length; ++i) {
                if (this.lllIlIIlIIIlIlIIIllIlllIl[i] != n) continue;
                return;
            }
            this.lllIlIIlIIIlIlIIIllIlllIl = Config.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl, n);
        }
    }

    public String toString() {
        return "" + this.lllIIIllIIIIlllIlIIllIIll + ":" + Config.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl);
    }
}

