package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.item.Item;

import java.util.Random;

public class class_1293
extends class_2257 {
    public class_1293() {
        super(class_1855.IlIlIIlllIllllllllIIIlIlI);
        this.IlIllllllIIlIIllllIIlIIIl(-1.0f);
    }

    @Override
    public class_1774 lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n) {
        return null;
    }

    @Override
    public void lIlllIlllIIIIlIIlllIllIII(class_1334 class_13342, int n, int n2, int n3) {
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Block class_05492, int n4) {
        class_1774 class_17742 = class_13342.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3);
        if (class_17742 instanceof class_0919) {
            ((class_0919)class_17742).IlIlIIlIlIllIIlIlIIllIIIl();
        } else {
            super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_05492, n4);
        }
    }

    @Override
    public boolean IlIIIIIllllllIIlllIllllll(class_1334 class_13342, int n, int n2, int n3) {
        return false;
    }

    @Override
    public boolean IlIllllllIIlIIllllIIlIIIl(class_1334 class_13342, int n, int n2, int n3, int n4) {
        return false;
    }

    @Override
    public int lIIIIlIlIIlllllIIllIIlIII() {
        return -1;
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
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_0814 class_08142, int n4, float f, float f2, float f3) {
        if (!class_13342.IllIIIIllIIllIllIlllIlIIl && class_13342.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3) == null) {
            class_13342.lIllllIIlIIIlIllllllIIIll(n, n2, n3);
            return true;
        }
        return false;
    }

    @Override
    public Item lllIIIllIIIIlllIlIIllIIll(int n, Random random, int n2) {
        return null;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, int n4, float f, int n5) {
        class_0919 class_09192;
        if (!class_13342.IllIIIIllIIllIllIlllIlIIl && (class_09192 = this.IlIIIIIllllllIIlllIllllll((class_1843)class_13342, n, n2, n3)) != null) {
            class_09192.lllIIIllIIIIlllIlIIllIIll().lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_09192.lIlllIlllIIIIlIIlllIllIII(), 0);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Block class_05492) {
        if (!class_13342.IllIIIIllIIllIllIlllIlIIl) {
            class_13342.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3);
        }
    }

    public static class_1774 lllIIIllIIIIlllIlIIllIIll(Block class_05492, int n, int n2, boolean bl, boolean bl2) {
        return new class_0919(class_05492, n, n2, bl, bl2);
    }

    @Override
    public class_1974 IlIllllllIIlIIllllIIlIIIl(class_1334 class_13342, int n, int n2, int n3) {
        class_0919 class_09192 = this.IlIIIIIllllllIIlllIllllll((class_1843)class_13342, n, n2, n3);
        if (class_09192 == null) {
            return null;
        }
        float f = class_09192.lllIIIllIIIIlllIlIIllIIll(0.0f);
        if (class_09192.IlIIIIIllllllIIlllIllllll()) {
            f = 1.0f - f;
        }
        return this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_09192.lllIIIllIIIIlllIlIIllIIll(), f, class_09192.lllIIlIIIllllllIIIIlIlIlI());
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl(class_1843 class_18432, int n, int n2, int n3) {
        class_0919 class_09192 = this.IlIIIIIllllllIIlllIllllll(class_18432, n, n2, n3);
        if (class_09192 != null) {
            Block class_05492 = class_09192.lllIIIllIIIIlllIlIIllIIll();
            if (class_05492 == this || class_05492.lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll) {
                return;
            }
            class_05492.IlIllllllIIlIIllllIIlIIIl(class_18432, n, n2, n3);
            float f = class_09192.lllIIIllIIIIlllIlIIllIIll(0.0f);
            if (class_09192.IlIIIIIllllllIIlllIllllll()) {
                f = 1.0f - f;
            }
            int n4 = class_09192.lllIIlIIIllllllIIIIlIlIlI();
            this.lIlllIlllIlIIIIlllIlIlIIl = class_05492.IlIlIIlllIIlIllIIIlllllIl() - (double)((float)class_0573.lllIlIIlIIIlIlIIIllIlllIl[n4] * f);
            this.IlIIlllllIIlIlIlllllIllll = class_05492.lIlIlIIlIIIIlIIIIIlllIIII() - (double)((float)class_0573.IlIllllllIIlIIllllIIlIIIl[n4] * f);
            this.llIIlIlIlllIIllIlIlllIllI = class_05492.IIlllIlIlllIllIIIlllIIlIl() - (double)((float)class_0573.lIlllIlllIIIIlIIlllIllIII[n4] * f);
            this.IllIIIIllIIllIllIlllIlIIl = class_05492.lIIlIIIIIlIlllIlIIlIlIlll() - (double)((float)class_0573.lllIlIIlIIIlIlIIIllIlllIl[n4] * f);
            this.IIIIIIIIlIllIIllIIlllIllI = class_05492.IlIIIlIIIIllIIIllIIIIIIll() - (double)((float)class_0573.IlIllllllIIlIIllllIIlIIIl[n4] * f);
            this.IIlIIlIlIlIllIIlIlIIIIlll = class_05492.lIlIllIIlIIlIIlIIlIIlIIll() - (double)((float)class_0573.lIlllIlllIIIIlIIlllIllIII[n4] * f);
        }
    }

    public class_1974 lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Block class_05492, float f, int n4) {
        if (class_05492 != this && class_05492.lIllllIIlIIIlIllllllIIIll() != class_1855.lllIIIllIIIIlllIlIIllIIll) {
            class_1974 class_19742 = class_05492.IlIllllllIIlIIllllIIlIIIl(class_13342, n, n2, n3);
            if (class_19742 == null) {
                return null;
            }
            if (class_0573.lllIlIIlIIIlIlIIIllIlllIl[n4] < 0) {
                class_19742.lllIIIllIIIIlllIlIIllIIll -= (double)((float)class_0573.lllIlIIlIIIlIlIIIllIlllIl[n4] * f);
            } else {
                class_19742.lIlllIlllIIIIlIIlllIllIII -= (double)((float)class_0573.lllIlIIlIIIlIlIIIllIlllIl[n4] * f);
            }
            if (class_0573.IlIllllllIIlIIllllIIlIIIl[n4] < 0) {
                class_19742.lllIlIIlIIIlIlIIIllIlllIl -= (double)((float)class_0573.IlIllllllIIlIIllllIIlIIIl[n4] * f);
            } else {
                class_19742.IlIIIIIllllllIIlllIllllll -= (double)((float)class_0573.IlIllllllIIlIIllllIIlIIIl[n4] * f);
            }
            if (class_0573.lIlllIlllIIIIlIIlllIllIII[n4] < 0) {
                class_19742.IlIllllllIIlIIllllIIlIIIl -= (double)((float)class_0573.lIlllIlllIIIIlIIlllIllIII[n4] * f);
            } else {
                class_19742.lIllllIIlIIIlIllllllIIIll -= (double)((float)class_0573.lIlllIlllIIIIlIIlllIllIII[n4] * f);
            }
            return class_19742;
        }
        return null;
    }

    private class_0919 IlIIIIIllllllIIlllIllllll(class_1843 class_18432, int n, int n2, int n3) {
        class_1774 class_17742 = class_18432.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3);
        return class_17742 instanceof class_0919 ? (class_0919)class_17742 : null;
    }

    @Override
    public Item IIIllIIlIIIIIIlIlIIllIIlI(class_1334 class_13342, int n, int n2, int n3) {
        return Item.lllIIIllIIIIlllIlIIllIIll(0);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
        this.llIIIIllIIIIIIIlIIIlIIIIl = class_08872.lllIIIllIIIIlllIlIIllIIll("piston_top_normal");
    }
}

