package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

class class_0776
extends class_0743 {
    final /* synthetic */ class_1806 lIIllIIlIIIlllIlllIIlIIlI;

    class_0776(class_1806 class_18062, int n, class_0672 class_06722) {
        this.lIIllIIlIIIlllIlllIIlIIlI = class_18062;
        super(n, class_06722);
    }

    @Override
    public class_1174 lllIIIllIIIIlllIlIIllIIll(Random random) {
        return random.nextBoolean() ? class_1806.lIIllIIlIIIlllIlllIIlIIlI : class_1806.IllIIllIlIlllIllIllIlIIIl;
    }
}

