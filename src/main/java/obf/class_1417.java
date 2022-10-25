package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

import java.util.List;

public class class_1417
extends Block {
    private final String llllllIlIllllIlIlIlIIIIlI;

    public class_1417(String string, class_1855 class_18552) {
        super(class_18552);
        this.llllllIlIllllIlIlIlIIIIlI = string;
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.IlIllllllIIlIIllllIIlIIIl);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_1974 class_19742, List list, class_1521 class_15212) {
        boolean bl = this.IlIIIIIllllllIIlllIllllll((class_1843)class_13342, n, n2, n3 - 1);
        boolean bl2 = this.IlIIIIIllllllIIlllIllllll((class_1843)class_13342, n, n2, n3 + 1);
        boolean bl3 = this.IlIIIIIllllllIIlllIllllll((class_1843)class_13342, n - 1, n2, n3);
        boolean bl4 = this.IlIIIIIllllllIIlllIllllll((class_1843)class_13342, n + 1, n2, n3);
        float f = 0.375f;
        float f2 = 0.625f;
        float f3 = 0.375f;
        float f4 = 0.625f;
        if (bl) {
            f3 = 0.0f;
        }
        if (bl2) {
            f4 = 1.0f;
        }
        if (bl || bl2) {
            this.lllIIIllIIIIlllIlIIllIIll(f, 0.0f, f3, f2, 1.5f, f4);
            super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_19742, list, class_15212);
        }
        f3 = 0.375f;
        f4 = 0.625f;
        if (bl3) {
            f = 0.0f;
        }
        if (bl4) {
            f2 = 1.0f;
        }
        if (bl3 || bl4 || !bl && !bl2) {
            this.lllIIIllIIIIlllIlIIllIIll(f, 0.0f, f3, f2, 1.5f, f4);
            super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_19742, list, class_15212);
        }
        if (bl) {
            f3 = 0.0f;
        }
        if (bl2) {
            f4 = 1.0f;
        }
        this.lllIIIllIIIIlllIlIIllIIll(f, 0.0f, f3, f2, 1.0f, f4);
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl(class_1843 class_18432, int n, int n2, int n3) {
        boolean bl = this.IlIIIIIllllllIIlllIllllll(class_18432, n, n2, n3 - 1);
        boolean bl2 = this.IlIIIIIllllllIIlllIllllll(class_18432, n, n2, n3 + 1);
        boolean bl3 = this.IlIIIIIllllllIIlllIllllll(class_18432, n - 1, n2, n3);
        boolean bl4 = this.IlIIIIIllllllIIlllIllllll(class_18432, n + 1, n2, n3);
        float f = 0.375f;
        float f2 = 0.625f;
        float f3 = 0.375f;
        float f4 = 0.625f;
        if (bl) {
            f3 = 0.0f;
        }
        if (bl2) {
            f4 = 1.0f;
        }
        if (bl3) {
            f = 0.0f;
        }
        if (bl4) {
            f2 = 1.0f;
        }
        this.lllIIIllIIIIlllIlIIllIIll(f, 0.0f, f3, f2, 1.0f, f4);
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
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1843 class_18432, int n, int n2, int n3) {
        return false;
    }

    @Override
    public int lIIIIlIlIIlllllIIllIIlIII() {
        return 11;
    }

    public boolean IlIIIIIllllllIIlllIllllll(class_1843 class_18432, int n, int n2, int n3) {
        Block class_05492 = class_18432.a_(n, n2, n3);
        return class_05492 != this && class_05492 != Blocks.IIIlIIllIIlIlIIlIIllIIIIl ? (class_05492.IlIlIIlllIllllllllIIIlIlI.IllIIIllIIIIlIlIlIllIIlll() && class_05492.IllIIIllIIIIlIlIlIllIIlll() ? class_05492.IlIlIIlllIllllllllIIIlIlI != class_1855.IllIIIIllIIllIllIlllIlIIl : false) : true;
    }

    public static boolean IlIllllllIIlIIllllIIlIIIl(Block class_05492) {
        return class_05492 == Blocks.lIlIIIllIIllIIlIllllllIll || class_05492 == Blocks.lllIlIIllllIllIIIlIlIIIll;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1843 class_18432, int n, int n2, int n3, int n4) {
        return true;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
        this.llIIIIllIIIIIIIlIIIlIIIIl = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_0814 class_08142, int n4, float f, float f2, float f3) {
        return class_13342.IllIIIIllIIllIllIlllIlIIl ? true : class_0985.lllIIIllIIIIlllIlIIllIIll(class_08142, class_13342, n, n2, n3);
    }
}

