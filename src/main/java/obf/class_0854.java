package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

import java.util.Random;

public class class_0854
extends Block {
    protected class_0854(class_1855 class_18552) {
        super(class_18552);
        this.lllIIIllIIIIlllIlIIllIIll(true);
        float f = 0.2f;
        this.lllIIIllIIIIlllIlIIllIIll(0.5f - f, 0.0f, 0.5f - f, 0.5f + f, f * 3.0f, 0.5f + f);
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.IlIllllllIIlIIllllIIlIIIl);
    }

    protected class_0854() {
        this(class_1855.lIIIIlIlIIlllllIIllIIlIII);
    }

    @Override
    public boolean IlIIIIIllllllIIlllIllllll(class_1334 class_13342, int n, int n2, int n3) {
        return super.IlIIIIIllllllIIlllIllllll(class_13342, n, n2, n3) && this.IlIllllllIIlIIllllIIlIIIl(class_13342.a_(n, n2 - 1, n3));
    }

    protected boolean IlIllllllIIlIIllllIIlIIIl(Block class_05492) {
        return class_05492 == Blocks.IlIllllllIIlIIllllIIlIIIl || class_05492 == Blocks.lIlllIlllIIIIlIIlllIllIII || class_05492 == Blocks.IIIlIlIllIlllllIlIllllllI;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Block class_05492) {
        super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_05492);
        this.IllIIIllIIIIlIlIlIllIIlll(class_13342, n, n2, n3);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Random random) {
        this.IllIIIllIIIIlIlIlIllIIlll(class_13342, n, n2, n3);
    }

    protected void IllIIIllIIIIlIlIlIllIIlll(class_1334 class_13342, int n, int n2, int n3) {
        if (!this.lIllllIIlIIIlIllllllIIIll(class_13342, n, n2, n3)) {
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3), 0);
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, class_0854.lllIIIllIIIIlllIlIIllIIll(0), 0, 2);
        }
    }

    @Override
    public boolean lIllllIIlIIIlIllllllIIIll(class_1334 class_13342, int n, int n2, int n3) {
        return this.IlIllllllIIlIIllllIIlIIIl(class_13342.a_(n, n2 - 1, n3));
    }

    @Override
    public class_1974 IlIllllllIIlIIllllIIlIIIl(class_1334 class_13342, int n, int n2, int n3) {
        return null;
    }

    @Override
    public boolean IlIlllIIIIIIlIIllIIllIlll() {
        return false;
    }

    @Override
    public boolean IllIIIllIIIIlIlIlIllIIlll() {
        return false;
    }

    @Override
    public int lIIIIlIlIIlllllIIllIIlIII() {
        return 1;
    }
}

