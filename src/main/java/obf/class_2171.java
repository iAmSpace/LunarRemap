package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.init.Blocks;

import java.util.Random;

public class class_2171
extends class_0672 {
    private boolean lIIllIIlIIIlllIlllIIlIIlI;
    private class_2064 IllIIllIlIlllIllIllIlIIIl = new class_2064();
    private class_1049 IIIlIllllIIIlllllIllIlIII = new class_1049(4);

    public class_2171(int n, boolean bl) {
        super(n);
        this.lIIllIIlIIIlllIlllIIlIIlI = bl;
        if (bl) {
            this.IlllIIIllllIIllIllIlIIlIl = Blocks.IIIlIllllIIIlllllIllIlIII;
        }
        this.llIIIIIlIIlIIIIllIIIlIIII.clear();
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, Random random, int n, int n2) {
        if (this.lIIllIIlIIIlllIlllIIlIIlI) {
            int n3;
            int n4;
            int n5;
            for (n5 = 0; n5 < 3; ++n5) {
                n4 = n + random.nextInt(16) + 8;
                n3 = n2 + random.nextInt(16) + 8;
                this.IllIIllIlIlllIllIllIlIIIl.a_(class_13342, random, n4, class_13342.lIllllIIlIIIlIllllllIIIll(n4, n3), n3);
            }
            for (n5 = 0; n5 < 2; ++n5) {
                n4 = n + random.nextInt(16) + 8;
                n3 = n2 + random.nextInt(16) + 8;
                this.IIIlIllllIIIlllllIllIlIII.a_(class_13342, random, n4, class_13342.lIllllIIlIIIlIllllllIIIll(n4, n3), n3);
            }
        }
        super.lllIIIllIIIIlllIlIIllIIll(class_13342, random, n, n2);
    }

    @Override
    public class_1174 lllIIIllIIIIlllIlIIllIIll(Random random) {
        return new class_1121(false);
    }

    @Override
    protected class_0672 lIIIIlIlIIlllllIIllIIlIII() {
        class_0672 class_06722 = new class_2171(this.lIlIllIIllIIIIlllIlIlllIl + 128, true).lllIIIllIIIIlllIlIIllIIll(0xD2FFFF, true).lllIIIllIIIIlllIlIIllIIll(this.IlIIIlIllIIIllIIIIlIIlIll + " Spikes").IlIllllllIIlIIllllIIlIIIl().lllIIIllIIIIlllIlIIllIIll(0.0f, 0.5f).lllIIIllIIIIlllIlIIllIIll(new class_0753(this.llllIlIIllIIlllllIIllIIll + 0.1f, this.IlIlIllIIlIIIIlllIlIllIlI + 0.1f));
        class_06722.llllIlIIllIIlllllIIllIIll = this.llllIlIIllIIlllllIIllIIll + 0.3f;
        class_06722.IlIlIllIIlIIIIlllIlIllIlI = this.IlIlIllIIlIIIIlllIlIllIlI + 0.4f;
        return class_06722;
    }
}

