package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class class_2231
extends class_1076 {
    private class_0672 lllIIIllIIIIlllIlIIllIIll;
    private float lllIlIIlIIIlIlIIIllIlllIl;

    public class_2231(class_0672 class_06722, float f) {
        this.lllIIIllIIIIlllIlIIllIIll = class_06722;
        this.lllIlIIlIIIlIlIIIllIlllIl = f;
    }

    @Override
    public class_0672 lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    @Override
    public class_0672[] lllIIIllIIIIlllIlIIllIIll(class_0672[] arrclass_0672, int n, int n2, int n3, int n4) {
        if (arrclass_0672 == null || arrclass_0672.length < n3 * n4) {
            arrclass_0672 = new class_0672[n3 * n4];
        }
        Arrays.fill(arrclass_0672, 0, n3 * n4, this.lllIIIllIIIIlllIlIIllIIll);
        return arrclass_0672;
    }

    @Override
    public float[] lllIIIllIIIIlllIlIIllIIll(float[] arrf, int n, int n2, int n3, int n4) {
        if (arrf == null || arrf.length < n3 * n4) {
            arrf = new float[n3 * n4];
        }
        Arrays.fill(arrf, 0, n3 * n4, this.lllIlIIlIIIlIlIIIllIlllIl);
        return arrf;
    }

    @Override
    public class_0672[] lllIlIIlIIIlIlIIIllIlllIl(class_0672[] arrclass_0672, int n, int n2, int n3, int n4) {
        if (arrclass_0672 == null || arrclass_0672.length < n3 * n4) {
            arrclass_0672 = new class_0672[n3 * n4];
        }
        Arrays.fill(arrclass_0672, 0, n3 * n4, this.lllIIIllIIIIlllIlIIllIIll);
        return arrclass_0672;
    }

    @Override
    public class_0672[] lllIIIllIIIIlllIlIIllIIll(class_0672[] arrclass_0672, int n, int n2, int n3, int n4, boolean bl) {
        return this.lllIlIIlIIIlIlIIIllIlllIl(arrclass_0672, n, n2, n3, n4);
    }

    @Override
    public class_2137 lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, List list, Random random) {
        return list.contains(this.lllIIIllIIIIlllIlIIllIIll) ? new class_2137(n - n3 + random.nextInt(n3 * 2 + 1), 0, n2 - n3 + random.nextInt(n3 * 2 + 1)) : null;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, List list) {
        return list.contains(this.lllIIIllIIIIlllIlIIllIIll);
    }
}

