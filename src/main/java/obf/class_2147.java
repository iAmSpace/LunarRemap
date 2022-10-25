package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;
import java.util.List;

public class class_2147 {
    private final class_1076 lllIIIllIIIIlllIlIIllIIll;
    private long lllIlIIlIIIlIlIIIllIlllIl;
    private class_1562 IlIllllllIIlIIllllIIlIIIl = new class_1562();
    private List lIlllIlllIIIIlIIlllIllIII = new ArrayList();

    public class_2147(class_1076 class_10762) {
        this.lllIIIllIIIIlllIlIIllIIll = class_10762;
    }

    public class_1224 lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        long l = (long)(n >>= 4) & 0xFFFFFFFFL | ((long)(n2 >>= 4) & 0xFFFFFFFFL) << 32;
        class_1224 class_12242 = (class_1224)this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(l);
        if (class_12242 == null) {
            class_12242 = new class_1224(this, n, n2);
            this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(l, class_12242);
            this.lIlllIlllIIIIlIIlllIllIII.add(class_12242);
        }
        class_12242.IlIIIIIllllllIIlllIllllll = class_0220.lllIIIlIIlIlIllIIIIIlIIll();
        return class_12242;
    }

    public class_0672 lllIlIIlIIIlIlIIIllIlllIl(int n, int n2) {
        return this.lllIIIllIIIIlllIlIIllIIll(n, n2).lllIIIllIIIIlllIlIIllIIll(n, n2);
    }

    public void lllIIIllIIIIlllIlIIllIIll() {
        long l = class_0220.lllIIIlIIlIlIllIIIIIlIIll();
        long l2 = l - this.lllIlIIlIIIlIlIIIllIlllIl;
        if (l2 > 7500L || l2 < 0L) {
            this.lllIlIIlIIIlIlIIIllIlllIl = l;
            for (int i = 0; i < this.lIlllIlllIIIIlIIlllIllIII.size(); ++i) {
                class_1224 class_12242 = (class_1224)this.lIlllIlllIIIIlIIlllIllIII.get(i);
                long l3 = l - class_12242.IlIIIIIllllllIIlllIllllll;
                if (l3 <= 30000L && l3 >= 0L) continue;
                this.lIlllIlllIIIIlIIlllIllIII.remove(i--);
                long l4 = (long)class_12242.IlIllllllIIlIIllllIIlIIIl & 0xFFFFFFFFL | ((long)class_12242.lIlllIlllIIIIlIIlllIllIII & 0xFFFFFFFFL) << 32;
                this.IlIllllllIIlIIllllIIlIIIl.lIlllIlllIIIIlIIlllIllIII(l4);
            }
        }
    }

    public class_0672[] IlIllllllIIlIIllllIIlIIIl(int n, int n2) {
        return this.lllIIIllIIIIlllIlIIllIIll((int)n, (int)n2).lllIlIIlIIIlIlIIIllIlllIl;
    }

    static /* synthetic */ class_1076 lllIIIllIIIIlllIlIIllIIll(class_2147 class_21472) {
        return class_21472.lllIIIllIIIIlllIlIIllIIll;
    }
}

