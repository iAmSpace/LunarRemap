package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Random;

public class class_0082
extends class_1099 {
    public class_0082() {
    }

    public class_0082(class_1334 class_13342, Random random, int n, int n2) {
        super(n, n2);
        class_1942.lllIlIIlIIIlIlIIIllIlllIl();
        class_1844 class_18442 = new class_1844(0, random, (n << 4) + 2, (n2 << 4) + 2);
        this.lllIIIllIIIIlllIlIIllIIll.add(class_18442);
        class_18442.lllIIIllIIIIlllIlIIllIIll(class_18442, this.lllIIIllIIIIlllIlIIllIIll, random);
        List list = class_18442.IlIllllllIIlIIllllIIlIIIl;
        while (!list.isEmpty()) {
            int n3 = random.nextInt(list.size());
            class_1036 class_10362 = (class_1036)list.remove(n3);
            class_10362.lllIIIllIIIIlllIlIIllIIll(class_18442, this.lllIIIllIIIIlllIlIIllIIll, random);
        }
        this.lIlllIlllIIIIlIIlllIllIII();
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, random, 10);
    }
}

