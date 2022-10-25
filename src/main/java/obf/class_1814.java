package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class class_1814
extends class_1099 {
    public class_1814() {
    }

    public class_1814(class_1334 class_13342, Random random, int n, int n2) {
        super(n, n2);
        class_0672 class_06722 = class_13342.a_(n * 16 + 8, n2 * 16 + 8);
        if (class_06722 != class_0672.llIIIIllIIIIIIIlIIIlIIIIl && class_06722 != class_0672.IIllIllIIllIIlllIIIlIlllI) {
            if (class_06722 == class_0672.IlIIIlIIIIllIIIllIIIIIIll) {
                class_0335 class_03352 = new class_0335(random, n * 16, n2 * 16);
                this.lllIIIllIIIIlllIlIIllIIll.add(class_03352);
            } else {
                class_0565 class_05652 = new class_0565(random, n * 16, n2 * 16);
                this.lllIIIllIIIIlllIlIIllIIll.add(class_05652);
            }
        } else {
            class_2251 class_22512 = new class_2251(random, n * 16, n2 * 16);
            this.lllIIIllIIIIlllIlIIllIIll.add(class_22512);
        }
        this.lIlllIlllIIIIlIIlllIllIII();
    }
}

