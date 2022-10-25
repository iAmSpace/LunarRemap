package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class class_1526
extends class_0672 {
    private static final class_1838 lIIllIIlIIIlllIlllIIlIIlI = new class_1838(false);

    protected class_1526(int n) {
        super(n);
        this.llIIIIIlIIlIIIIllIIIlIIII.add(new class_0920(class_1627.class, 1, 2, 6));
        this.llIIIlIlIlIIlIllIIIllIlIl.llIIlIllIllllIlIIIIlIIlll = 1;
        this.llIIIlIlIlIIlIllIIIllIlIl.llIllllIlIllIIIlIllIIlIlI = 4;
        this.llIIIlIlIlIIlIllIIIllIlIl.lIlllIlllIlIIIIlllIlIlIIl = 20;
    }

    @Override
    public class_1174 lllIIIllIIIIlllIlIIllIIll(Random random) {
        return random.nextInt(5) > 0 ? lIIllIIlIIIlllIlllIIlIIlI : this.IlIIIlIIlllllIIIllIlIlIll;
    }

    @Override
    protected class_0672 lIIIIlIlIIlllllIIllIIlIII() {
        class_1684 class_16842 = new class_1684(this.lIlIllIIllIIIIlllIlIlllIl + 128, this);
        class_16842.IlIIllIlIlIllIIIlIIlIlIIl = (this.IlIIllIlIlIllIIIlIIlIlIIl + 1.0f) * 0.5f;
        class_16842.llllIlIIllIIlllllIIllIIll = this.llllIlIIllIIlllllIIllIIll * 0.5f + 0.3f;
        class_16842.IlIlIllIIlIIIIlllIlIllIlI = this.IlIlIllIIlIIIIlllIlIllIlI * 0.5f + 1.2f;
        return class_16842;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, Random random, int n, int n2) {
        IllIlIlIIIlllIIllIIIIlIll.lllIIIllIIIIlllIlIIllIIll(2);
        for (int i = 0; i < 7; ++i) {
            int n3 = n + random.nextInt(16) + 8;
            int n4 = n2 + random.nextInt(16) + 8;
            int n5 = random.nextInt(class_13342.lIllllIIlIIIlIllllllIIIll(n3, n4) + 32);
            IllIlIlIIIlllIIllIIIIlIll.a_(class_13342, random, n3, n5, n4);
        }
        super.lllIIIllIIIIlllIlIIllIIll(class_13342, random, n, n2);
    }
}

