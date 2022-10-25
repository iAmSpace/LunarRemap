package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;

import java.util.Random;

public class class_1928
extends Block {
    protected class_1928() {
        super(class_1855.lllllIlllIIllIlIIlIIIllII);
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.IlIllllllIIlIIllllIIlIIIl);
    }

    @Override
    public class_1974 IlIllllllIIlIIllllIIlIIIl(class_1334 class_13342, int n, int n2, int n3) {
        this.IlIllllllIIlIIllllIIlIIIl((class_1843)class_13342, n, n2, n3);
        return super.IlIllllllIIlIIllllIIlIIIl(class_13342, n, n2, n3);
    }

    @Override
    public class_1974 lllIlIIlIIIlIlIIIllIlllIl(class_1334 class_13342, int n, int n2, int n3) {
        this.IlIllllllIIlIIllllIIlIIIl((class_1843)class_13342, n, n2, n3);
        return super.lllIlIIlIIIlIlIIIllIlllIl(class_13342, n, n2, n3);
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl(class_1843 class_18432, int n, int n2, int n3) {
        this.IllIIlllllllIIlIIlIIIIlIl(class_18432.IlIllllllIIlIIllllIIlIIIl(n, n2, n3));
    }

    public void IllIIlllllllIIlIIlIIIIlIl(int n) {
        float f = 0.125f;
        if (n == 2) {
            this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 1.0f - f, 1.0f, 1.0f, 1.0f);
        }
        if (n == 3) {
            this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, f);
        }
        if (n == 4) {
            this.lllIIIllIIIIlllIlIIllIIll(1.0f - f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        }
        if (n == 5) {
            this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, f, 1.0f, 1.0f);
        }
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
        return 8;
    }

    @Override
    public boolean IlIIIIIllllllIIlllIllllll(class_1334 class_13342, int n, int n2, int n3) {
        return class_13342.a_(n - 1, n2, n3).IIIllIllIIlIlIlIlIllllIIl() ? true : (class_13342.a_(n + 1, n2, n3).IIIllIllIIlIlIlIlIllllIIl() ? true : (class_13342.a_(n, n2, n3 - 1).IIIllIllIIlIlIlIlIllllIIl() ? true : class_13342.a_(n, n2, n3 + 1).IIIllIllIIlIlIlIlIllllIIl()));
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, int n4, float f, float f2, float f3, int n5) {
        int n6 = n5;
        if ((n5 == 0 || n4 == 2) && class_13342.a_(n, n2, n3 + 1).IIIllIllIIlIlIlIlIllllIIl()) {
            n6 = 2;
        }
        if ((n6 == 0 || n4 == 3) && class_13342.a_(n, n2, n3 - 1).IIIllIllIIlIlIlIlIllllIIl()) {
            n6 = 3;
        }
        if ((n6 == 0 || n4 == 4) && class_13342.a_(n + 1, n2, n3).IIIllIllIIlIlIlIlIllllIIl()) {
            n6 = 4;
        }
        if ((n6 == 0 || n4 == 5) && class_13342.a_(n - 1, n2, n3).IIIllIllIIlIlIlIlIllllIIl()) {
            n6 = 5;
        }
        return n6;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Block class_05492) {
        int n4 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        boolean bl = false;
        if (n4 == 2 && class_13342.a_(n, n2, n3 + 1).IIIllIllIIlIlIlIlIllllIIl()) {
            bl = true;
        }
        if (n4 == 3 && class_13342.a_(n, n2, n3 - 1).IIIllIllIIlIlIlIlIllllIIl()) {
            bl = true;
        }
        if (n4 == 4 && class_13342.a_(n + 1, n2, n3).IIIllIllIIlIlIlIlIllllIIl()) {
            bl = true;
        }
        if (n4 == 5 && class_13342.a_(n - 1, n2, n3).IIIllIllIIlIlIlIlIllllIIl()) {
            bl = true;
        }
        if (!bl) {
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, n4, 0);
            class_13342.lIllllIIlIIIlIllllllIIIll(n, n2, n3);
        }
        super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_05492);
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(Random random) {
        return 1;
    }
}

