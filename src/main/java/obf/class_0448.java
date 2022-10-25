package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0448 {
    private int lllIIIllIIIIlllIlIIllIIll = 18;
    private int lllIlIIlIIIlIlIIIllIlllIl = 128;
    private int IlIllllllIIlIIllllIIlIIIl = 18;
    private int lIlllIlllIIIIlIIlllIllIII = 0;
    private int IlIIIIIllllllIIlllIllllll = 0;
    private int lIllllIIlIIIlIllllllIIIll = 0;
    private int[][][] IIIllIIlIIIIIIlIlIIllIIlI = null;
    private int[] IllIIlllllllIIlIIlIIIIlIl = null;
    private int IIIllIllIIlIlIlIlIllllIIl = 0;

    public class_0448(int n, int n2, int n3) {
        this.lllIIIllIIIIlllIlIIllIIll = n;
        this.lllIlIIlIIIlIlIIIllIlllIl = n2;
        this.IlIllllllIIlIIllllIIlIIIl = n3;
        this.IIIllIIlIIIIIIlIlIIllIIlI = new int[n][n2][n3];
        this.lllIIIllIIIIlllIlIIllIIll();
    }

    public void lllIIIllIIIIlllIlIIllIIll() {
        for (int i = 0; i < this.lllIIIllIIIIlllIlIIllIIll; ++i) {
            int[][] arrn = this.IIIllIIlIIIIIIlIlIIllIIlI[i];
            for (int j = 0; j < this.lllIlIIlIIIlIlIIIllIlllIl; ++j) {
                int[] arrn2 = arrn[j];
                for (int k = 0; k < this.IlIllllllIIlIIllllIIlIIIl; ++k) {
                    arrn2[k] = -1;
                }
            }
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        this.lIlllIlllIIIIlIIlllIllIII = n;
        this.IlIIIIIllllllIIlllIllllll = n2;
        this.lIllllIIlIIIlIllllllIIIll = n3;
        this.lllIIIllIIIIlllIlIIllIIll();
    }

    public int lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, int n3) {
        try {
            this.IllIIlllllllIIlIIlIIIIlIl = this.IIIllIIlIIIIIIlIlIIllIIlI[n - this.lIlllIlllIIIIlIIlllIllIII][n2 - this.IlIIIIIllllllIIlllIllllll];
            this.IIIllIllIIlIlIlIlIllllIIl = n3 - this.lIllllIIlIIIlIllllllIIIll;
            return this.IllIIlllllllIIlIIlIIIIlIl[this.IIIllIllIIlIlIlIlIllllIIl];
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            arrayIndexOutOfBoundsException.printStackTrace();
            return -1;
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n) {
        try {
            this.IllIIlllllllIIlIIlIIIIlIl[this.IIIllIllIIlIlIlIlIllllIIl] = n;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}

