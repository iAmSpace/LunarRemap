package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Random;

public class class_0566
extends class_1099 {
    private boolean IlIllllllIIlIIllllIIlIIIl;

    public class_0566() {
    }

    public class_0566(class_1334 class_13342, Random random, int n, int n2, int n3) {
        super(n, n2);
        int n4;
        List list = class_1979.lllIIIllIIIIlllIlIIllIIll(random, n3);
        class_0206 class_02062 = new class_0206(class_13342.IIIllIllIIlIlIlIlIllllIIl(), 0, random, (n << 4) + 2, (n2 << 4) + 2, list, n3);
        this.lllIIIllIIIIlllIlIIllIIll.add(class_02062);
        class_02062.lllIIIllIIIIlllIlIIllIIll(class_02062, this.lllIIIllIIIIlllIlIIllIIll, random);
        List list2 = class_02062.IllIIIllIIIIlIlIlIllIIlll;
        List list3 = class_02062.IIIllIllIIlIlIlIlIllllIIl;
        while (!list2.isEmpty() || !list3.isEmpty()) {
            Object object;
            if (list2.isEmpty()) {
                n4 = random.nextInt(list3.size());
                object = (class_1036)list3.remove(n4);
                ((class_1036)object).lllIIIllIIIIlllIlIIllIIll(class_02062, this.lllIIIllIIIIlllIlIIllIIll, random);
                continue;
            }
            n4 = random.nextInt(list2.size());
            object = (class_1036)list2.remove(n4);
            ((class_1036)object).lllIIIllIIIIlllIlIIllIIll(class_02062, this.lllIIIllIIIIlllIlIIllIIll, random);
        }
        this.lIlllIlllIIIIlIIlllIllIII();
        n4 = 0;
        for (class_1036 class_10362 : this.lllIIIllIIIIlllIlIIllIIll) {
            if (class_10362 instanceof class_0615) continue;
            ++n4;
        }
        this.IlIllllllIIlIIllllIIlIIIl = n4 > 2;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        super.lllIIIllIIIIlllIlIIllIIll(class_07752);
        class_07752.lllIIIllIIIIlllIlIIllIIll("Valid", this.IlIllllllIIlIIllllIIlIIIl);
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        super.lllIlIIlIIIlIlIIIllIlllIl(class_07752);
        this.IlIllllllIIlIIllllIIlIIIl = class_07752.lllIIlIIIllllllIIIIlIlIlI("Valid");
    }
}

