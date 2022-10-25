package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1850
extends class_0689 {
    private class_0689 IlIllllllIIlIIllllIIlIIIl;
    private class_0689 lIlllIlllIIIIlIIlllIllIII;

    public class_1850(long l, class_0689 class_06892, class_0689 class_06893) {
        super(l);
        this.IlIllllllIIlIIllllIIlIIIl = class_06892;
        this.lIlllIlllIIIIlIIlllIllIII = class_06893;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(long l) {
        this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(l);
        this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(l);
        super.lllIIIllIIIIlllIlIIllIIll(l);
    }

    @Override
    public int[] lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4) {
        int[] arrn = this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n4);
        int[] arrn2 = this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n4);
        int[] arrn3 = class_0256.lllIIIllIIIIlllIlIIllIIll(n3 * n4);
        for (int i = 0; i < n3 * n4; ++i) {
            if (arrn[i] != class_0672.IlIlllIIIIIIlIIllIIllIlll.lIlIllIIllIIIIlllIlIlllIl && arrn[i] != class_0672.lIlIIllllIlIIIIllIIIIlIIl.lIlIllIIllIIIIlllIlIlllIl) {
                if (arrn2[i] == class_0672.IIlllIlIlllIllIIIlllIIlIl.lIlIllIIllIIIIlllIlIlllIl) {
                    if (arrn[i] == class_0672.IlIIlllllIIlIlIlllllIllll.lIlIllIIllIIIIlllIlIlllIl) {
                        arrn3[i] = class_0672.lIlllIlllIlIIIIlllIlIlIIl.lIlIllIIllIIIIlllIlIlllIl;
                        continue;
                    }
                    if (arrn[i] != class_0672.IllIIIIllIIllIllIlllIlIIl.lIlIllIIllIIIIlllIlIlllIl && arrn[i] != class_0672.IIIIIIIIlIllIIllIIlllIllI.lIlIllIIllIIIIlllIlIlllIl) {
                        arrn3[i] = arrn2[i] & 0xFF;
                        continue;
                    }
                    arrn3[i] = class_0672.IIIIIIIIlIllIIllIIlllIllI.lIlIllIIllIIIIlllIlIlllIl;
                    continue;
                }
                arrn3[i] = arrn[i];
                continue;
            }
            arrn3[i] = arrn[i];
        }
        return arrn3;
    }
}

