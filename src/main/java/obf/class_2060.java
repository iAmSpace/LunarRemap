package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import java.util.Random;

public class class_2060
extends Block {
    private IIcon llllllIlIllllIlIlIlIIIIlI;
    private IIcon lIlIIllllIlIIIIllIIIIlIIl;
    private IIcon llIlllIIllIlllIlIlIlIIIll;

    protected class_2060() {
        super(class_1855.llIIIlllIlllIlIllIIIIllIl);
        this.lllIIIllIIIIlllIlIIllIIll(true);
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl(class_1843 class_18432, int n, int n2, int n3) {
        int n4 = class_18432.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        float f = 0.0625f;
        float f2 = (float)(1 + n4 * 2) / 16.0f;
        float f3 = 0.5f;
        this.lllIIIllIIIIlllIlIIllIIll(f2, 0.0f, f, 1.0f - f, f3, 1.0f - f);
    }

    @Override
    public void lIlllIlllIlIIIIlllIlIlIIl() {
        float f = 0.0625f;
        float f2 = 0.5f;
        this.lllIIIllIIIIlllIlIIllIIll(f, 0.0f, f, 1.0f - f, f2, 1.0f - f);
    }

    @Override
    public class_1974 IlIllllllIIlIIllllIIlIIIl(class_1334 class_13342, int n, int n2, int n3) {
        int n4 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        float f = 0.0625f;
        float f2 = (float)(1 + n4 * 2) / 16.0f;
        float f3 = 0.5f;
        return class_1974.lllIIIllIIIIlllIlIIllIIll((float)n + f2, n2, (float)n3 + f, (float)(n + 1) - f, (float)n2 + f3 - f, (float)(n3 + 1) - f);
    }

    @Override
    public class_1974 lllIlIIlIIIlIlIIIllIlllIl(class_1334 class_13342, int n, int n2, int n3) {
        int n4 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        float f = 0.0625f;
        float f2 = (float)(1 + n4 * 2) / 16.0f;
        float f3 = 0.5f;
        return class_1974.lllIIIllIIIIlllIlIIllIIll((float)n + f2, n2, (float)n3 + f, (float)(n + 1) - f, (float)n2 + f3, (float)(n3 + 1) - f);
    }

    @Override
    public IIcon lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        return n == 1 ? this.llllllIlIllllIlIlIlIIIIlI : (n == 0 ? this.lIlIIllllIlIIIIllIIIIlIIl : (n2 > 0 && n == 4 ? this.llIlllIIllIlllIlIlIlIIIll : this.llIIIIllIIIIIIIlIIIlIIIIl));
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
        this.llIIIIllIIIIIIIlIIIlIIIIl = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_side");
        this.llIlllIIllIlllIlIlIlIIIll = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_inner");
        this.llllllIlIllllIlIlIlIIIIlI = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_top");
        this.lIlIIllllIlIIIIllIIIIlIIl = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_bottom");
    }

    @Override
    public boolean IllIIIllIIIIlIlIlIllIIlll() {
        return false;
    }

    @Override
    public boolean IlIlllIIIIIIlIIllIIllIlll() {
        return false;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_0814 class_08142, int n4, float f, float f2, float f3) {
        this.lllIlIIlIIIlIlIIIllIlllIl(class_13342, n, n2, n3, class_08142);
        return true;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_0814 class_08142) {
        this.lllIlIIlIIIlIlIIIllIlllIl(class_13342, n, n2, n3, class_08142);
    }

    private void lllIlIIlIIIlIlIIIllIlllIl(class_1334 class_13342, int n, int n2, int n3, class_0814 class_08142) {
        if (class_08142.IlIllllllIIlIIllllIIlIIIl(false)) {
            class_08142.lIllIIlllIIIlIlIIIlllIlIl().lllIIIllIIIIlllIlIIllIIll(2, 0.1f);
            int n4 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3) + 1;
            if (n4 >= 6) {
                class_13342.lIllllIIlIIIlIllllllIIIll(n, n2, n3);
            } else {
                class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n4, 2);
            }
        }
    }

    @Override
    public boolean IlIIIIIllllllIIlllIllllll(class_1334 class_13342, int n, int n2, int n3) {
        return !super.IlIIIIIllllllIIlllIllllll(class_13342, n, n2, n3) ? false : this.lIllllIIlIIIlIllllllIIIll(class_13342, n, n2, n3);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Block class_05492) {
        if (!this.lIllllIIlIIIlIllllllIIIll(class_13342, n, n2, n3)) {
            class_13342.lIllllIIlIIIlIllllllIIIll(n, n2, n3);
        }
    }

    @Override
    public boolean lIllllIIlIIIlIllllllIIIll(class_1334 class_13342, int n, int n2, int n3) {
        return class_13342.a_(n, n2 - 1, n3).lIllllIIlIIIlIllllllIIIll().lllIlIIlIIIlIlIIIllIlllIl();
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(Random random) {
        return 0;
    }

    @Override
    public Item lllIIIllIIIIlllIlIIllIIll(int n, Random random, int n2) {
        return null;
    }

    @Override
    public Item IIIllIIlIIIIIIlIlIIllIIlI(class_1334 class_13342, int n, int n2, int n3) {
        return Items.cake;
    }
}

