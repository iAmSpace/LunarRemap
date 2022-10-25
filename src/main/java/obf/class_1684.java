package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

import java.util.Random;

public class class_1684
extends class_0743 {
    public class_1684(int n, class_0672 class_06722) {
        super(n, class_06722);
        this.llIIIlIlIlIIlIllIIIllIlIl.llIIlIllIllllIlIIIIlIIlll = 2;
        this.llIIIlIlIlIIlIllIIIllIlIl.llIllllIlIllIIIlIllIIlIlI = 2;
        this.llIIIlIlIlIIlIllIIIllIlIl.lIlllIlllIlIIIIlllIlIlIIl = 5;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, Random random, Block[] arrclass_0549, byte[] arrby, int n, int n2, double d) {
        this.IlllIIIllllIIllIllIlIIlIl = Blocks.IlIllllllIIlIIllllIIlIIIl;
        this.lllIIIlIIlIlIllIIIIIlIIll = 0;
        this.IIIlIlIllIlllllIlIllllllI = Blocks.lIlllIlllIIIIlIIlllIllIII;
        if (d > 1.75) {
            this.IlllIIIllllIIllIllIlIIlIl = Blocks.lllIlIIlIIIlIlIIIllIlllIl;
            this.IIIlIlIllIlllllIlIllllllI = Blocks.lllIlIIlIIIlIlIIIllIlllIl;
        } else if (d > -0.5) {
            this.IlllIIIllllIIllIllIlIIlIl = Blocks.lIlllIlllIIIIlIIlllIllIII;
            this.lllIIIlIIlIlIllIIIIIlIIll = 1;
        }
        this.lllIlIIlIIIlIlIIIllIlllIl(class_13342, random, arrclass_0549, arrby, n, n2, d);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, Random random, int n, int n2) {
        this.llIIIlIlIlIIlIllIIIllIlIl.lllIIIllIIIIlllIlIIllIIll(class_13342, random, this, n, n2);
    }
}

