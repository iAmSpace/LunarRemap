package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1662 {
    public static final class_1662[] lllIIIllIIIIlllIlIIllIIll = new class_1662[64];
    public static final class_1662 lllIlIIlIIIlIlIIIllIlllIl = new class_1662(0, 0);
    public static final class_1662 IlIllllllIIlIIllllIIlIIIl = new class_1662(1, 8368696);
    public static final class_1662 lIlllIlllIIIIlIIlllIllIII = new class_1662(2, 16247203);
    public static final class_1662 IlIIIIIllllllIIlllIllllll = new class_1662(3, 0xA7A7A7);
    public static final class_1662 lIllllIIlIIIlIllllllIIIll = new class_1662(4, 0xFF0000);
    public static final class_1662 IIIllIIlIIIIIIlIlIIllIIlI = new class_1662(5, 0xA0A0FF);
    public static final class_1662 IllIIlllllllIIlIIlIIIIlIl = new class_1662(6, 0xA7A7A7);
    public static final class_1662 IIIllIllIIlIlIlIlIllllIIl = new class_1662(7, 31744);
    public static final class_1662 IllIIIllIIIIlIlIlIllIIlll = new class_1662(8, 0xFFFFFF);
    public static final class_1662 lIIIIlIlIIlllllIIllIIlIII = new class_1662(9, 10791096);
    public static final class_1662 llIIlllIllIllllIIIlIIIIII = new class_1662(10, 12020271);
    public static final class_1662 llIIllIllIlIIlIIllIllllll = new class_1662(11, 0x707070);
    public static final class_1662 lllIIlIIIllllllIIIIlIlIlI = new class_1662(12, 0x4040FF);
    public static final class_1662 IlIlllIIIIIIlIIllIIllIlll = new class_1662(13, 6837042);
    public static final class_1662 IlIlIIlIlIllIIlIlIIllIIIl = new class_1662(14, 0xFFFCF5);
    public static final class_1662 lllllIlllIIllIlIIlIIIllII = new class_1662(15, 14188339);
    public static final class_1662 IlIlIIlllIIlIllIIIlllllIl = new class_1662(16, 11685080);
    public static final class_1662 lIIlIIIIIlIlllIlIIlIlIlll = new class_1662(17, 6724056);
    public static final class_1662 lIlIlIIlIIIIlIIIIIlllIIII = new class_1662(18, 0xE5E533);
    public static final class_1662 IlIIIlIIIIllIIIllIIIIIIll = new class_1662(19, 8375321);
    public static final class_1662 IIlllIlIlllIllIIIlllIIlIl = new class_1662(20, 15892389);
    public static final class_1662 lIlIllIIlIIlIIlIIlIIlIIll = new class_1662(21, 0x4C4C4C);
    public static final class_1662 llIIlIllIllllIlIIIIlIIlll = new class_1662(22, 0x999999);
    public static final class_1662 llIllllIlIllIIIlIllIIlIlI = new class_1662(23, 5013401);
    public static final class_1662 lIlllIlllIlIIIIlllIlIlIIl = new class_1662(24, 8339378);
    public static final class_1662 IlIIlllllIIlIlIlllllIllll = new class_1662(25, 3361970);
    public static final class_1662 llIIlIlIlllIIllIlIlllIllI = new class_1662(26, 6704179);
    public static final class_1662 IllIIIIllIIllIllIlllIlIIl = new class_1662(27, 6717235);
    public static final class_1662 IIIIIIIIlIllIIllIIlllIllI = new class_1662(28, 0x993333);
    public static final class_1662 IIlIIlIlIlIllIIlIlIIIIlll = new class_1662(29, 0x191919);
    public static final class_1662 llIIIlllIlllIlIllIIIIllIl = new class_1662(30, 16445005);
    public static final class_1662 IIIIlIllIlIIlIIlIllIlIlll = new class_1662(31, 6085589);
    public static final class_1662 IlIlIIlllIllllllllIIIlIlI = new class_1662(32, 4882687);
    public static final class_1662 llllIIIIlIIIlIIIIIIlIllll = new class_1662(33, 55610);
    public static final class_1662 llIIIIllIIIIIIIlIIIlIIIIl = new class_1662(34, 1381407);
    public static final class_1662 IIllIllIIllIIlllIIIlIlllI = new class_1662(35, 0x700200);
    public final int llllllIlIllllIlIlIlIIIIlI;
    public final int lIlIIllllIlIIIIllIIIIlIIl;

    private class_1662(int n, int n2) {
        if (n < 0 || n > 63) {
            throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
        }
        this.lIlIIllllIlIIIIllIIIIlIIl = n;
        this.llllllIlIllllIlIlIlIIIIlI = n2;
        class_1662.lllIIIllIIIIlllIlIIllIIll[n] = this;
    }

    public static class_1662 lllIIIllIIIIlllIlIIllIIll(int n) {
        switch (class_0974.IIIllIllIIlIlIlIlIllllIIl(n)) {
            case 0: {
                return IIlIIlIlIlIllIIlIlIIIIlll;
            }
            case 1: {
                return IIIIIIIIlIllIIllIIlllIllI;
            }
            case 2: {
                return IllIIIIllIIllIllIlllIlIIl;
            }
            case 3: {
                return llIIlIlIlllIIllIlIlllIllI;
            }
            case 4: {
                return IlIIlllllIIlIlIlllllIllll;
            }
            case 5: {
                return lIlllIlllIlIIIIlllIlIlIIl;
            }
            case 6: {
                return llIllllIlIllIIIlIllIIlIlI;
            }
            case 7: {
                return llIIlIllIllllIlIIIIlIIlll;
            }
            case 8: {
                return lIlIllIIlIIlIIlIIlIIlIIll;
            }
            case 9: {
                return IIlllIlIlllIllIIIlllIIlIl;
            }
            case 10: {
                return IlIIIlIIIIllIIIllIIIIIIll;
            }
            case 11: {
                return lIlIlIIlIIIIlIIIIIlllIIII;
            }
            case 12: {
                return lIIlIIIIIlIlllIlIIlIlIlll;
            }
            case 13: {
                return IlIlIIlllIIlIllIIIlllllIl;
            }
            case 14: {
                return lllllIlllIIllIlIIlIIIllII;
            }
            case 15: {
                return IllIIIllIIIIlIlIlIllIIlll;
            }
        }
        return lllIlIIlIIIlIlIIIllIlllIl;
    }

    public int lllIlIIlIIIlIlIIIllIlllIl(int n) {
        int n2 = 220;
        if (n == 3) {
            n2 = 135;
        }
        if (n == 2) {
            n2 = 255;
        }
        if (n == 1) {
            n2 = 220;
        }
        if (n == 0) {
            n2 = 180;
        }
        int n3 = (this.llllllIlIllllIlIlIlIIIIlI >> 16 & 0xFF) * n2 / 255;
        int n4 = (this.llllllIlIllllIlIlIlIIIIlI >> 8 & 0xFF) * n2 / 255;
        int n5 = (this.llllllIlIllllIlIlIlIIIIlI & 0xFF) * n2 / 255;
        return 0xFF000000 | n3 << 16 | n4 << 8 | n5;
    }
}

