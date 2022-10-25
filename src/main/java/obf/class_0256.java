package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;
import java.util.List;

public class class_0256 {
    private static int lllIIIllIIIIlllIlIIllIIll = 256;
    private static List lllIlIIlIIIlIlIIIllIlllIl = new ArrayList();
    private static List IlIllllllIIlIIllllIIlIIIl = new ArrayList();
    private static List lIlllIlllIIIIlIIlllIllIII = new ArrayList();
    private static List IlIIIIIllllllIIlllIllllll = new ArrayList();

    public static synchronized int[] lllIIIllIIIIlllIlIIllIIll(int n) {
        if (n <= 256) {
            if (lllIlIIlIIIlIlIIIllIlllIl.isEmpty()) {
                int[] arrn = new int[256];
                IlIllllllIIlIIllllIIlIIIl.add(arrn);
                return arrn;
            }
            int[] arrn = (int[])lllIlIIlIIIlIlIIIllIlllIl.remove(lllIlIIlIIIlIlIIIllIlllIl.size() - 1);
            IlIllllllIIlIIllllIIlIIIl.add(arrn);
            return arrn;
        }
        if (n > lllIIIllIIIIlllIlIIllIIll) {
            lllIIIllIIIIlllIlIIllIIll = n;
            lIlllIlllIIIIlIIlllIllIII.clear();
            IlIIIIIllllllIIlllIllllll.clear();
            int[] arrn = new int[lllIIIllIIIIlllIlIIllIIll];
            IlIIIIIllllllIIlllIllllll.add(arrn);
            return arrn;
        }
        if (lIlllIlllIIIIlIIlllIllIII.isEmpty()) {
            int[] arrn = new int[lllIIIllIIIIlllIlIIllIIll];
            IlIIIIIllllllIIlllIllllll.add(arrn);
            return arrn;
        }
        int[] arrn = (int[])lIlllIlllIIIIlIIlllIllIII.remove(lIlllIlllIIIIlIIlllIllIII.size() - 1);
        IlIIIIIllllllIIlllIllllll.add(arrn);
        return arrn;
    }

    public static synchronized void lllIIIllIIIIlllIlIIllIIll() {
        if (!lIlllIlllIIIIlIIlllIllIII.isEmpty()) {
            lIlllIlllIIIIlIIlllIllIII.remove(lIlllIlllIIIIlIIlllIllIII.size() - 1);
        }
        if (!lllIlIIlIIIlIlIIIllIlllIl.isEmpty()) {
            lllIlIIlIIIlIlIIIllIlllIl.remove(lllIlIIlIIIlIlIIIllIlllIl.size() - 1);
        }
        lIlllIlllIIIIlIIlllIllIII.addAll(IlIIIIIllllllIIlllIllllll);
        lllIlIIlIIIlIlIIIllIlllIl.addAll(IlIllllllIIlIIllllIIlIIIl);
        IlIIIIIllllllIIlllIllllll.clear();
        IlIllllllIIlIIllllIIlIIIl.clear();
    }

    public static synchronized String lllIlIIlIIIlIlIIIllIlllIl() {
        return "cache: " + lIlllIlllIIIIlIIlllIllIII.size() + ", tcache: " + lllIlIIlIIIlIlIIIllIlllIl.size() + ", allocated: " + IlIIIIIllllllIIlllIllllll.size() + ", tallocated: " + IlIllllllIIlIIllllIIlIIIl.size();
    }
}

