package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;

import java.util.List;
import java.util.Random;

public class class_1042
extends Block {
    private class_2102 llllllIlIllllIlIlIlIIIIlI;

    public class_1042() {
        super(class_1855.IlIlIIlllIllllllllIIIlIlI);
        this.lllIIIllIIIIlllIlIIllIIll(IIIllIIlIIIIIIlIlIIllIIlI);
        this.IlIllllllIIlIIllllIIlIIIl(0.5f);
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_2102 class_21022) {
        this.llllllIlIllllIlIlIlIIIIlI = class_21022;
    }

    public void llIlllIIllIlllIlIlIlIIIll() {
        this.llllllIlIllllIlIlIlIIIIlI = null;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, int n4, class_0814 class_08142) {
        int n5;
        Block class_05492;
        if (class_08142.lIIlIlIlIlIllIIlIIllllIll.lIlllIlllIIIIlIIlllIllIII && ((class_05492 = class_13342.a_(n - class_0573.lllIlIIlIIIlIlIIIllIlllIl[n5 = class_1042.IllIIlllllllIIlIIlIIIIlIl(n4)], n2 - class_0573.IlIllllllIIlIIllllIIlIIIl[n5], n3 - class_0573.lIlllIlllIIIIlIIlllIllIII[n5])) == Blocks.llIIIIllIIIIIIIlIIIlIIIIl || class_05492 == Blocks.llIIIlllIlllIlIllIIIIllIl)) {
            class_13342.lIllllIIlIIIlIllllllIIIll(n - class_0573.lllIlIIlIIIlIlIIIllIlllIl[n5], n2 - class_0573.IlIllllllIIlIIllllIIlIIIl[n5], n3 - class_0573.lIlllIlllIIIIlIIlllIllIII[n5]);
        }
        super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, n4, class_08142);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Block class_05492, int n4) {
        super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_05492, n4);
        int n5 = class_0573.lllIIIllIIIIlllIlIIllIIll[class_1042.IllIIlllllllIIlIIlIIIIlIl(n4)];
        Block class_05493 = class_13342.a_(n += class_0573.lllIlIIlIIIlIlIIIllIlllIl[n5], n2 += class_0573.IlIllllllIIlIIllllIIlIIIl[n5], n3 += class_0573.lIlllIlllIIIIlIIlllIllIII[n5]);
        if ((class_05493 == Blocks.llIIIIllIIIIIIIlIIIlIIIIl || class_05493 == Blocks.llIIIlllIlllIlIllIIIIllIl) && class_1039.IIIllIllIIlIlIlIlIllllIIl(n4 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3))) {
            class_05493.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, n4, 0);
            class_13342.lIllllIIlIIIlIllllllIIIll(n, n2, n3);
        }
    }

    @Override
    public class_2102 lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        int n3 = class_1042.IllIIlllllllIIlIIlIIIIlIl(n2);
        return n == n3 ? (this.llllllIlIllllIlIlIlIIIIlI != null ? this.llllllIlIllllIlIlIlIIIIlI : ((n2 & 8) != 0 ? class_1039.lIlllIlllIIIIlIIlllIllIII("piston_top_sticky") : class_1039.lIlllIlllIIIIlIIlllIllIII("piston_top_normal"))) : (n3 < 6 && n == class_0573.lllIIIllIIIIlllIlIIllIIll[n3] ? class_1039.lIlllIlllIIIIlIIlllIllIII("piston_top_normal") : class_1039.lIlllIlllIIIIlIIlllIllIII("piston_side"));
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
    }

    @Override
    public int lIIIIlIlIIlllllIIllIIlIII() {
        return 17;
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
    public boolean IlIIIIIllllllIIlllIllllll(class_1334 class_13342, int n, int n2, int n3) {
        return false;
    }

    @Override
    public boolean IlIllllllIIlIIllllIIlIIIl(class_1334 class_13342, int n, int n2, int n3, int n4) {
        return false;
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(Random random) {
        return 0;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_1974 class_19742, List list, class_1521 class_15212) {
        int n4 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        float f = 0.25f;
        float f2 = 0.375f;
        float f3 = 0.625f;
        float f4 = 0.25f;
        float f5 = 0.75f;
        switch (class_1042.IllIIlllllllIIlIIlIIIIlIl(n4)) {
            case 0: {
                this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, 1.0f, 0.25f, 1.0f);
                super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_19742, list, class_15212);
                this.lllIIIllIIIIlllIlIIllIIll(0.375f, 0.25f, 0.375f, 0.625f, 1.0f, 0.625f);
                super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_19742, list, class_15212);
                break;
            }
            case 1: {
                this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.75f, 0.0f, 1.0f, 1.0f, 1.0f);
                super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_19742, list, class_15212);
                this.lllIIIllIIIIlllIlIIllIIll(0.375f, 0.0f, 0.375f, 0.625f, 0.75f, 0.625f);
                super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_19742, list, class_15212);
                break;
            }
            case 2: {
                this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.25f);
                super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_19742, list, class_15212);
                this.lllIIIllIIIIlllIlIIllIIll(0.25f, 0.375f, 0.25f, 0.75f, 0.625f, 1.0f);
                super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_19742, list, class_15212);
                break;
            }
            case 3: {
                this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.75f, 1.0f, 1.0f, 1.0f);
                super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_19742, list, class_15212);
                this.lllIIIllIIIIlllIlIIllIIll(0.25f, 0.375f, 0.0f, 0.75f, 0.625f, 0.75f);
                super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_19742, list, class_15212);
                break;
            }
            case 4: {
                this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, 0.25f, 1.0f, 1.0f);
                super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_19742, list, class_15212);
                this.lllIIIllIIIIlllIlIIllIIll(0.375f, 0.25f, 0.25f, 0.625f, 0.75f, 1.0f);
                super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_19742, list, class_15212);
                break;
            }
            case 5: {
                this.lllIIIllIIIIlllIlIIllIIll(0.75f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
                super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_19742, list, class_15212);
                this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.375f, 0.25f, 0.75f, 0.625f, 0.75f);
                super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_19742, list, class_15212);
            }
        }
        this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl(class_1843 class_18432, int n, int n2, int n3) {
        int n4 = class_18432.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        float f = 0.25f;
        switch (class_1042.IllIIlllllllIIlIIlIIIIlIl(n4)) {
            case 0: {
                this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, 1.0f, 0.25f, 1.0f);
                break;
            }
            case 1: {
                this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.75f, 0.0f, 1.0f, 1.0f, 1.0f);
                break;
            }
            case 2: {
                this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.25f);
                break;
            }
            case 3: {
                this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.75f, 1.0f, 1.0f, 1.0f);
                break;
            }
            case 4: {
                this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, 0.25f, 1.0f, 1.0f);
                break;
            }
            case 5: {
                this.lllIIIllIIIIlllIlIIllIIll(0.75f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
            }
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Block class_05492) {
        int n4 = class_1042.IllIIlllllllIIlIIlIIIIlIl(class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3));
        Block class_05493 = class_13342.a_(n - class_0573.lllIlIIlIIIlIlIIIllIlllIl[n4], n2 - class_0573.IlIllllllIIlIIllllIIlIIIl[n4], n3 - class_0573.lIlllIlllIIIIlIIlllIllIII[n4]);
        if (class_05493 != Blocks.llIIIIllIIIIIIIlIIIlIIIIl && class_05493 != Blocks.llIIIlllIlllIlIllIIIIllIl) {
            class_13342.lIllllIIlIIIlIllllllIIIll(n, n2, n3);
        } else {
            class_05493.lllIIIllIIIIlllIlIIllIIll(class_13342, n - class_0573.lllIlIIlIIIlIlIIIllIlllIl[n4], n2 - class_0573.IlIllllllIIlIIllllIIlIIIl[n4], n3 - class_0573.lIlllIlllIIIIlIIlllIllIII[n4], class_05492);
        }
    }

    public static int IllIIlllllllIIlIIlIIIIlIl(int n) {
        return MathHelper.lllIIIllIIIIlllIlIIllIIll(n & 7, 0, class_0573.lllIlIIlIIIlIlIIIllIlllIl.length - 1);
    }

    @Override
    public Item IIIllIIlIIIIIIlIlIIllIIlI(class_1334 class_13342, int n, int n2, int n3) {
        int n4 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        return (n4 & 8) != 0 ? Item.getItemFromBlock(Blocks.llIIIlllIlllIlIllIIIIllIl) : Item.getItemFromBlock(Blocks.llIIIIllIIIIIIIlIIIlIIIIl);
    }
}

