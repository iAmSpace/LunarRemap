package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import java.util.Random;

public class class_1638
extends class_2257 {
    private Class llllllIlIllllIlIlIlIIIIlI;
    private boolean lIlIIllllIlIIIIllIIIIlIIl;

    protected class_1638(Class class_, boolean bl) {
        super(class_1855.lIlllIlllIIIIlIIlllIllIII);
        this.lIlIIllllIlIIIIllIIIIlIIl = bl;
        this.llllllIlIllllIlIlIlIIIIlI = class_;
        float f = 0.25f;
        float f2 = 1.0f;
        this.lllIIIllIIIIlllIlIIllIIll(0.5f - f, 0.0f, 0.5f - f, 0.5f + f, f2, 0.5f + f);
    }

    @Override
    public class_2102 lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        return Blocks.lIllllIIlIIIlIllllllIIIll.lIlllIlllIIIIlIIlllIllIII(n);
    }

    @Override
    public class_1974 IlIllllllIIlIIllllIIlIIIl(class_1334 class_13342, int n, int n2, int n3) {
        return null;
    }

    @Override
    public class_1974 lllIlIIlIIIlIlIIIllIlllIl(class_1334 class_13342, int n, int n2, int n3) {
        this.IlIllllllIIlIIllllIIlIIIl((class_1843)class_13342, n, n2, n3);
        return super.lllIlIIlIIIlIlIIIllIlllIl(class_13342, n, n2, n3);
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl(class_1843 class_18432, int n, int n2, int n3) {
        if (!this.lIlIIllllIlIIIIllIIIIlIIl) {
            int n4 = class_18432.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
            float f = 0.28125f;
            float f2 = 0.78125f;
            float f3 = 0.0f;
            float f4 = 1.0f;
            float f5 = 0.125f;
            this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
            if (n4 == 2) {
                this.lllIIIllIIIIlllIlIIllIIll(f3, f, 1.0f - f5, f4, f2, 1.0f);
            }
            if (n4 == 3) {
                this.lllIIIllIIIIlllIlIIllIIll(f3, f, 0.0f, f4, f2, f5);
            }
            if (n4 == 4) {
                this.lllIIIllIIIIlllIlIIllIIll(1.0f - f5, f, f3, 1.0f, f2, f4);
            }
            if (n4 == 5) {
                this.lllIIIllIIIIlllIlIIllIIll(0.0f, f, f3, f5, f2, f4);
            }
        }
    }

    @Override
    public int lIIIIlIlIIlllllIIllIIlIII() {
        return -1;
    }

    @Override
    public boolean IllIIIllIIIIlIlIlIllIIlll() {
        return false;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1843 class_18432, int n, int n2, int n3) {
        return true;
    }

    @Override
    public boolean IlIlllIIIIIIlIIllIIllIlll() {
        return false;
    }

    @Override
    public class_1774 lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n) {
        try {
            return (class_1774)this.llllllIlIllllIlIlIlIIIIlI.newInstance();
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    @Override
    public Item lllIIIllIIIIlllIlIIllIIll(int n, Random random, int n2) {
        return Items.lIlIIllIllIIIIIlIllllIIIl;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Block class_05492) {
        boolean bl = false;
        if (this.lIlIIllllIlIIIIllIIIIlIIl) {
            if (!class_13342.a_(n, n2 - 1, n3).lIllllIIlIIIlIllllllIIIll().lllIlIIlIIIlIlIIIllIlllIl()) {
                bl = true;
            }
        } else {
            int n4 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
            bl = true;
            if (n4 == 2 && class_13342.a_(n, n2, n3 + 1).lIllllIIlIIIlIllllllIIIll().lllIlIIlIIIlIlIIIllIlllIl()) {
                bl = false;
            }
            if (n4 == 3 && class_13342.a_(n, n2, n3 - 1).lIllllIIlIIIlIllllllIIIll().lllIlIIlIIIlIlIIIllIlllIl()) {
                bl = false;
            }
            if (n4 == 4 && class_13342.a_(n + 1, n2, n3).lIllllIIlIIIlIllllllIIIll().lllIlIIlIIIlIlIIIllIlllIl()) {
                bl = false;
            }
            if (n4 == 5 && class_13342.a_(n - 1, n2, n3).lIllllIIlIIIlIllllllIIIll().lllIlIIlIIIlIlIIIllIlllIl()) {
                bl = false;
            }
        }
        if (bl) {
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3), 0);
            class_13342.lIllllIIlIIIlIllllllIIIll(n, n2, n3);
        }
        super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_05492);
    }

    @Override
    public Item IIIllIIlIIIIIIlIlIIllIIlI(class_1334 class_13342, int n, int n2, int n3) {
        return Items.lIlIIllIllIIIIIlIllllIIIl;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
    }
}

