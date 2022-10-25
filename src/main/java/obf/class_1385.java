package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;
import java.util.Random;

public class class_1385
extends class_1099 {
    public class_1385() {
    }

    public class_1385(class_1334 class_13342, Random random, int n, int n2) {
        super(n, n2);
        class_1486 class_14862 = new class_1486(random, (n << 4) + 2, (n2 << 4) + 2);
        this.lllIIIllIIIIlllIlIIllIIll.add(class_14862);
        class_14862.lllIIIllIIIIlllIlIIllIIll(class_14862, this.lllIIIllIIIIlllIlIIllIIll, random);
        ArrayList arrayList = class_14862.IllIIlllllllIIlIIlIIIIlIl;
        while (!arrayList.isEmpty()) {
            int n3 = random.nextInt(arrayList.size());
            class_1036 class_10362 = (class_1036)arrayList.remove(n3);
            class_10362.lllIIIllIIIIlllIlIIllIIll(class_14862, this.lllIIIllIIIIlllIlIIllIIll, random);
        }
        this.lIlllIlllIIIIlIIlllIllIII();
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, random, 48, 70);
    }
}

