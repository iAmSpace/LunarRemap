package obf;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;

/*
 * Decompiled with CFR 0.150.
 */
public class class_2172
extends class_0143 {
    public class_2172() {
        super(class_1855.lIlllIlllIIIIlIIlllIllIII);
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.lIlllIlllIIIIlIIlllIllIII);
    }

    @Override
    public IIcon lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        return Blocks.lIllllIIlIIIlIllllllIIIll.lIlllIlllIIIIlIIlllIllIII(n);
    }

    @Override
    public boolean IlIIIIIllllllIIlllIllllll(class_1334 class_13342, int n, int n2, int n3) {
        return !class_13342.a_(n, n2 - 1, n3).lIllllIIlIIIlIllllllIIIll().lllIlIIlIIIlIlIIIllIlllIl() ? false : super.IlIIIIIllllllIIlllIllllll(class_13342, n, n2, n3);
    }

    @Override
    public class_1974 IlIllllllIIlIIllllIIlIIIl(class_1334 class_13342, int n, int n2, int n3) {
        int n4 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        return class_2172.IllIIlllllllIIlIIlIIIIlIl(n4) ? null : (n4 != 2 && n4 != 0 ? class_1974.lllIIIllIIIIlllIlIIllIIll((float)n + 0.375f, n2, n3, (float)n + 0.625f, (float)n2 + 1.5f, n3 + 1) : class_1974.lllIIIllIIIIlllIlIIllIIll(n, n2, (float)n3 + 0.375f, n + 1, (float)n2 + 1.5f, (float)n3 + 0.625f));
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl(class_1843 class_18432, int n, int n2, int n3) {
        int n4 = class_2172.IllIIIllIIIIlIlIlIllIIlll(class_18432.IlIllllllIIlIIllllIIlIIIl(n, n2, n3));
        if (n4 != 2 && n4 != 0) {
            this.lllIIIllIIIIlllIlIIllIIll(0.375f, 0.0f, 0.0f, 0.625f, 1.0f, 1.0f);
        } else {
            this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.375f, 1.0f, 1.0f, 0.625f);
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
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1843 class_18432, int n, int n2, int n3) {
        return class_2172.IllIIlllllllIIlIIlIIIIlIl(class_18432.IlIllllllIIlIIllllIIlIIIl(n, n2, n3));
    }

    @Override
    public int lIIIIlIlIIlllllIIllIIlIII() {
        return 21;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_1965 class_19652, ItemStack class_08972) {
        int n4 = (MathHelper.IlIllllllIIlIIllllIIlIIIl((double)(class_19652.IIIIlIllIlIIlIIlIllIlIlll * 4.0f / 360.0f) + 0.5) & 3) % 4;
        class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n4, 2);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_0814 class_08142, int n4, float f, float f2, float f3) {
        int n5 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        if (class_2172.IllIIlllllllIIlIIlIIIIlIl(n5)) {
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n5 & 0xFFFFFFFB, 2);
        } else {
            int n6 = (MathHelper.IlIllllllIIlIIllllIIlIIIl((double)(class_08142.IIIIlIllIlIIlIIlIllIlIlll * 4.0f / 360.0f) + 0.5) & 3) % 4;
            int n7 = class_2172.IllIIIllIIIIlIlIlIllIIlll(n5);
            if (n7 == (n6 + 2) % 4) {
                n5 = n6;
            }
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n5 | 4, 2);
        }
        class_13342.lllIIIllIIIIlllIlIIllIIll(class_08142, 1003, n, n2, n3, 0);
        return true;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Block class_05492) {
        if (!class_13342.IllIIIIllIIllIllIlllIlIIl) {
            int n4 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
            boolean bl = class_13342.lIIlIIIIIlIlllIlIIlIlIlll(n, n2, n3);
            if (bl || class_05492.llIllllIlIllIIIlIllIIlIlI()) {
                if (bl && !class_2172.IllIIlllllllIIlIIlIIIIlIl(n4)) {
                    class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n4 | 4, 2);
                    class_13342.lllIIIllIIIIlllIlIIllIIll(null, 1003, n, n2, n3, 0);
                } else if (!bl && class_2172.IllIIlllllllIIlIIlIIIIlIl(n4)) {
                    class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n4 & 0xFFFFFFFB, 2);
                    class_13342.lllIIIllIIIIlllIlIIllIIll(null, 1003, n, n2, n3, 0);
                }
            }
        }
    }

    public static boolean IllIIlllllllIIlIIlIIIIlIl(int n) {
        return (n & 4) != 0;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1843 class_18432, int n, int n2, int n3, int n4) {
        return true;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
    }
}

