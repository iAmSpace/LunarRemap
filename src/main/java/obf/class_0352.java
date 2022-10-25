package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

import java.util.List;

public class class_0352
extends class_0854 {
    protected class_0352() {
        float f = 0.5f;
        float f2 = 0.015625f;
        this.lllIIIllIIIIlllIlIIllIIll(0.5f - f, 0.0f, 0.5f - f, 0.5f + f, f2, 0.5f + f);
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.IlIllllllIIlIIllllIIlIIIl);
    }

    @Override
    public int lIIIIlIlIIlllllIIllIIlIII() {
        return 23;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_1974 class_19742, List list, class_1521 class_15212) {
        if (class_15212 == null || !(class_15212 instanceof class_2263)) {
            super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_19742, list, class_15212);
        }
    }

    @Override
    public class_1974 IlIllllllIIlIIllllIIlIIIl(class_1334 class_13342, int n, int n2, int n3) {
        return class_1974.lllIIIllIIIIlllIlIIllIIll((double)n + this.lIlllIlllIlIIIIlllIlIlIIl, (double)n2 + this.IlIIlllllIIlIlIlllllIllll, (double)n3 + this.llIIlIlIlllIIllIlIlllIllI, (double)n + this.IllIIIIllIIllIllIlllIlIIl, (double)n2 + this.IIIIIIIIlIllIIllIIlllIllI, (double)n3 + this.IIlIIlIlIlIllIIlIlIIIIlll);
    }

    @Override
    public int llIIlIllIllllIlIIIIlIIlll() {
        return 2129968;
    }

    @Override
    public int lIllllIIlIIIlIllllllIIIll(int n) {
        return 2129968;
    }

    @Override
    public int lIlllIlllIIIIlIIlllIllIII(class_1843 class_18432, int n, int n2, int n3) {
        return 2129968;
    }

    @Override
    protected boolean IlIllllllIIlIIllllIIlIIIl(Block class_05492) {
        return class_05492 == Blocks.IllIIIllIIIIlIlIlIllIIlll;
    }

    @Override
    public boolean lIllllIIlIIIlIllllllIIIll(class_1334 class_13342, int n, int n2, int n3) {
        return n2 >= 0 && n2 < 256 ? class_13342.a_(n, n2 - 1, n3).lIllllIIlIIIlIllllllIIIll() == class_1855.IllIIlllllllIIlIIlIIIIlIl && class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2 - 1, n3) == 0 : false;
    }
}

