package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import java.util.List;

public class class_1215
extends class_1309 {
    public class_1215(class_1334 class_13342) {
        super(class_13342);
    }

    public class_1215(class_1334 class_13342, int n, int n2, int n3) {
        super(class_13342, n, n2, n3, 0);
        this.IlIllllllIIlIIllllIIlIIIl((double)n + 0.5, (double)n2 + 0.5, (double)n3 + 0.5);
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl() {
        super.lllIlIIlIIIlIlIIIllIlllIl();
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n) {
    }

    @Override
    public int lIlllIlllIIIIlIIlllIllIII() {
        return 9;
    }

    @Override
    public int IlIIIIIllllllIIlllIllllll() {
        return 9;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(double d) {
        return d < 1024.0;
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_1521 class_15212) {
    }

    @Override
    public boolean lIlllIlllIIIIlIIlllIllIII(class_0775 class_07752) {
        return false;
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
    }

    @Override
    public boolean b_(class_0814 class_08142) {
        double d;
        List list;
        ItemStack class_08972 = class_08142.lIIIIlIlIlIIIlIIllIIlIlIl();
        boolean bl = false;
        if (class_08972 != null && class_08972.lllIIIllIIIIlllIlIIllIIll() == Items.IIlIlIIIlIIllIlIlIlIlIIll && !this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl && (list = this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(class_0339.class, class_1974.lllIIIllIIIIlllIlIIllIIll(this.IlIIlllllIIlIlIlllllIllll - (d = 7.0), this.llIIlIlIlllIIllIlIlllIllI - d, this.IllIIIIllIIllIllIlllIlIIl - d, this.IlIIlllllIIlIlIlllllIllll + d, this.llIIlIlIlllIIllIlIlllIllI + d, this.IllIIIIllIIllIllIlllIlIIl + d))) != null) {
            for (class_0339 class_03392 : list) {
                if (!class_03392.lIIIIIlIllIllIlIlIIllllll() || class_03392.lIIIlllIlIIIlIllIIIlIllll() != class_08142) continue;
                class_03392.lllIlIIlIIIlIlIIIllIlllIl((class_1521)this, true);
                bl = true;
            }
        }
        if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl && !bl) {
            this.IIIIlIIlIIIllIIIIllIIIlII();
            if (class_08142.lIIlIlIlIlIllIIlIIllllIll.lIlllIlllIIIIlIIlllIllIII && (list = this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(class_0339.class, class_1974.lllIIIllIIIIlllIlIIllIIll(this.IlIIlllllIIlIlIlllllIllll - (d = 7.0), this.llIIlIlIlllIIllIlIlllIllI - d, this.IllIIIIllIIllIllIlllIlIIl - d, this.IlIIlllllIIlIlIlllllIllll + d, this.llIIlIlIlllIIllIlIlllIllI + d, this.IllIIIIllIIllIllIlllIlIIl + d))) != null) {
                for (class_0339 class_03392 : list) {
                    if (!class_03392.lIIIIIlIllIllIlIlIIllllll() || class_03392.lIIIlllIlIIIlIllIIIlIllll() != this) continue;
                    class_03392.lllIIIllIIIIlllIlIIllIIll(true, false);
                }
            }
        }
        return true;
    }

    @Override
    public boolean IlIllllllIIlIIllllIIlIIIl() {
        return this.lIlIllIIlIIlIIlIIlIIlIIll.a_(this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII).lIIIIlIlIIlllllIIllIIlIII() == 11;
    }

    public static class_1215 lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3) {
        class_1215 class_12152 = new class_1215(class_13342, n, n2, n3);
        class_12152.IIlllIlIlllIllIIIlllIIlIl = true;
        class_13342.lllIIIllIIIIlllIlIIllIIll(class_12152);
        return class_12152;
    }

    public static class_1215 lllIlIIlIIIlIlIIIllIlllIl(class_1334 class_13342, int n, int n2, int n3) {
        List list = class_13342.lllIIIllIIIIlllIlIIllIIll(class_1215.class, class_1974.lllIIIllIIIIlllIlIIllIIll((double)n - 1.0, (double)n2 - 1.0, (double)n3 - 1.0, (double)n + 1.0, (double)n2 + 1.0, (double)n3 + 1.0));
        if (list != null) {
            for (class_1215 class_12152 : list) {
                if (class_12152.lllIlIIlIIIlIlIIIllIlllIl != n || class_12152.IlIllllllIIlIIllllIIlIIIl != n2 || class_12152.lIlllIlllIIIIlIIlllIllIII != n3) continue;
                return class_12152;
            }
        }
        return null;
    }
}

