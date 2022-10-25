package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public abstract class class_1099 {
    protected LinkedList lllIIIllIIIIlllIlIIllIIll = new LinkedList();
    protected class_2046 lllIlIIlIIIlIlIIIllIlllIl;
    private int IlIllllllIIlIIllllIIlIIIl;
    private int lIlllIlllIIIIlIIlllIllIII;

    public class_1099() {
    }

    public class_1099(int n, int n2) {
        this.IlIllllllIIlIIllllIIlIIIl = n;
        this.lIlllIlllIIIIlIIlllIllIII = n2;
    }

    public class_2046 lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public LinkedList IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, Random random, class_2046 class_20462) {
        Iterator iterator = this.lllIIIllIIIIlllIlIIllIIll.iterator();
        while (iterator.hasNext()) {
            class_1036 class_10362 = (class_1036)iterator.next();
            if (!class_10362.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(class_20462) || class_10362.lllIIIllIIIIlllIlIIllIIll(class_13342, random, class_20462)) continue;
            iterator.remove();
        }
    }

    protected void lIlllIlllIIIIlIIlllIllIII() {
        this.lllIlIIlIIIlIlIIIllIlllIl = class_2046.lllIIIllIIIIlllIlIIllIIll();
        for (class_1036 class_10362 : this.lllIIIllIIIIlllIlIIllIIll) {
            this.lllIlIIlIIIlIlIIIllIlllIl.lllIlIIlIIIlIlIIIllIlllIl(class_10362.lllIlIIlIIIlIlIIIllIlllIl());
        }
    }

    public class_0775 lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        class_0775 class_07752 = new class_0775();
        class_07752.lllIIIllIIIIlllIlIIllIIll("id", class_1756.lllIIIllIIIIlllIlIIllIIll(this));
        class_07752.lllIIIllIIIIlllIlIIllIIll("ChunkX", n);
        class_07752.lllIIIllIIIIlllIlIIllIIll("ChunkZ", n2);
        class_07752.lllIIIllIIIIlllIlIIllIIll("BB", this.lllIlIIlIIIlIlIIIllIlllIl.IllIIlllllllIIlIIlIIIIlIl());
        class_2145 class_21452 = new class_2145();
        for (class_1036 class_10362 : this.lllIIIllIIIIlllIlIIllIIll) {
            class_21452.lllIIIllIIIIlllIlIIllIIll(class_10362.lllIIIllIIIIlllIlIIllIIll());
        }
        class_07752.lllIIIllIIIIlllIlIIllIIll("Children", class_21452);
        this.lllIIIllIIIIlllIlIIllIIll(class_07752);
        return class_07752;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, class_0775 class_07752) {
        this.IlIllllllIIlIIllllIIlIIIl = class_07752.lIllllIIlIIIlIllllllIIIll("ChunkX");
        this.lIlllIlllIIIIlIIlllIllIII = class_07752.lIllllIIlIIIlIllllllIIIll("ChunkZ");
        if (class_07752.IlIllllllIIlIIllllIIlIIIl("BB")) {
            this.lllIlIIlIIIlIlIIIllIlllIl = new class_2046(class_07752.llIIlllIllIllllIIIlIIIIII("BB"));
        }
        class_2145 class_21452 = class_07752.IlIllllllIIlIIllllIIlIIIl("Children", 10);
        for (int i = 0; i < class_21452.lIlllIlllIIIIlIIlllIllIII(); ++i) {
            this.lllIIIllIIIIlllIlIIllIIll.add(class_1756.lllIlIIlIIIlIlIIIllIlllIl(class_21452.lllIlIIlIIIlIlIIIllIlllIl(i), class_13342));
        }
        this.lllIlIIlIIIlIlIIIllIlllIl(class_07752);
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, Random random, int n) {
        int n2 = 63 - n;
        int n3 = this.lllIlIIlIIIlIlIIIllIlllIl.IlIllllllIIlIIllllIIlIIIl() + 1;
        if (n3 < n2) {
            n3 += random.nextInt(n2 - n3);
        }
        int n4 = n3 - this.lllIlIIlIIIlIlIIIllIlllIl.IlIIIIIllllllIIlllIllllll;
        this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(0, n4, 0);
        for (class_1036 class_10362 : this.lllIIIllIIIIlllIlIIllIIll) {
            class_10362.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(0, n4, 0);
        }
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, Random random, int n, int n2) {
        int n3 = n2 - n + 1 - this.lllIlIIlIIIlIlIIIllIlllIl.IlIllllllIIlIIllllIIlIIIl();
        boolean bl = true;
        int n4 = n3 > 1 ? n + random.nextInt(n3) : n;
        int n5 = n4 - this.lllIlIIlIIIlIlIIIllIlllIl.lllIlIIlIIIlIlIIIllIlllIl;
        this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(0, n5, 0);
        for (class_1036 class_10362 : this.lllIIIllIIIIlllIlIIllIIll) {
            class_10362.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(0, n5, 0);
        }
    }

    public boolean lllIIIllIIIIlllIlIIllIIll() {
        return true;
    }

    public int IlIIIIIllllllIIlllIllllll() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public int lIllllIIlIIIlIllllllIIIll() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }
}

