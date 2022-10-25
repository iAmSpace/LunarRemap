package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class class_1329
implements class_0951 {
    private final List lllIIIllIIIIlllIlIIllIIll = Lists.newArrayList();
    private final Random lllIlIIlIIIlIlIIIllIlllIl = new Random();
    private final ResourceLocation IlIllllllIIlIIllllIIlIIIl;
    private final class_0617 lIlllIlllIIIIlIIlllIllIII;
    private double IlIIIIIllllllIIlllIllllll;
    private double lIllllIIlIIIlIllllllIIIll;

    public class_1329(ResourceLocation class_17732, double d, double d2, class_0617 class_06172) {
        this.IlIllllllIIlIIllllIIlIIIl = class_17732;
        this.lIllllIIlIIIlIllllllIIIll = d2;
        this.IlIIIIIllllllIIlllIllllll = d;
        this.lIlllIlllIIIIlIIlllIllIII = class_06172;
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll() {
        int n = 0;
        for (class_0951 class_09512 : this.lllIIIllIIIIlllIlIIllIIll) {
            n += class_09512.lllIIIllIIIIlllIlIIllIIll();
        }
        return n;
    }

    public class_1883 IlIllllllIIlIIllllIIlIIIl() {
        int n = this.lllIIIllIIIIlllIlIIllIIll();
        if (!this.lllIIIllIIIIlllIlIIllIIll.isEmpty() && n != 0) {
            class_0951 class_09512;
            int n2 = this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(n);
            Iterator iterator = this.lllIIIllIIIIlllIlIIllIIll.iterator();
            do {
                if (iterator.hasNext()) continue;
                return class_1300.lllIIIllIIIIlllIlIIllIIll;
            } while ((n2 -= (class_09512 = (class_0951)iterator.next()).lllIIIllIIIIlllIlIIllIIll()) >= 0);
            class_1883 class_18832 = (class_1883)class_09512.lllIlIIlIIIlIlIIIllIlllIl();
            class_18832.lllIIIllIIIIlllIlIIllIIll(class_18832.lllIlIIlIIIlIlIIIllIlllIl() * this.IlIIIIIllllllIIlllIllllll);
            class_18832.lllIlIIlIIIlIlIIIllIlllIl(class_18832.IlIllllllIIlIIllllIIlIIIl() * this.lIllllIIlIIIlIllllllIIIll);
            return class_18832;
        }
        return class_1300.lllIIIllIIIIlllIlIIllIIll;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0951 class_09512) {
        this.lllIIIllIIIIlllIlIIllIIll.add(class_09512);
    }

    public ResourceLocation lIlllIlllIIIIlIIlllIllIII() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public class_0617 IlIIIIIllllllIIlllIllllll() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    @Override
    public /* synthetic */ Object lllIlIIlIIIlIlIIIllIlllIl() {
        return this.IlIllllllIIlIIllllIIlIIIl();
    }
}

