package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;

import java.util.Random;

public abstract class class_1067 {
    private final boolean lllIIIllIIIIlllIlIIllIIll;

    public class_1067() {
        this.lllIIIllIIIIlllIlIIllIIll = false;
    }

    public class_1067(boolean bl) {
        this.lllIIIllIIIIlllIlIIllIIll = bl;
    }

    public abstract boolean a_(class_1334 var1, Random var2, int var3, int var4, int var5);

    public void lllIIIllIIIIlllIlIIllIIll(double d, double d2, double d3) {
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Block class_05492) {
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_05492, 0);
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Block class_05492, int n4) {
        if (this.lllIIIllIIIIlllIlIIllIIll) {
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, class_05492, n4, 3);
        } else {
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, class_05492, n4, 2);
        }
    }
}

