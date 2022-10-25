package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;

import java.util.Random;

public class class_1084
extends class_0143
implements class_0588 {
    private class_2102[] llllllIlIllllIlIlIlIIIIlI;

    public class_1084() {
        super(class_1855.lIIIIlIlIIlllllIIllIIlIII);
        this.lllIIIllIIIIlllIlIIllIIll(true);
    }

    @Override
    public class_2102 lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        return this.llllllIlIllllIlIlIlIIIIlI[2];
    }

    public class_2102 IllIIlllllllIIlIIlIIIIlIl(int n) {
        if (n < 0 || n >= this.llllllIlIllllIlIlIlIIIIlI.length) {
            n = this.llllllIlIllllIlIlIlIIIIlI.length - 1;
        }
        return this.llllllIlIllllIlIlIlIIIIlI[n];
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Random random) {
        int n4;
        int n5;
        if (!this.lIllllIIlIIIlIllllllIIIll(class_13342, n, n2, n3)) {
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3), 0);
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, class_1084.lllIIIllIIIIlllIlIIllIIll(0), 0, 2);
        } else if (class_13342.lllllIlllIIllIlIIlIIIllII.nextInt(5) == 0 && (n5 = class_1084.IIIllIllIIlIlIlIlIllllIIl(n4 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3))) < 2) {
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, ++n5 << 2 | class_1084.IllIIIllIIIIlIlIlIllIIlll(n4), 2);
        }
    }

    @Override
    public boolean lIllllIIlIIIlIllllllIIIll(class_1334 class_13342, int n, int n2, int n3) {
        int n4;
        Block class_05492;
        return (class_05492 = class_13342.a_(n += class_1632.lllIIIllIIIIlllIlIIllIIll[n4 = class_1084.IllIIIllIIIIlIlIlIllIIlll(class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3))], n2, n3 += class_1632.lllIlIIlIIIlIlIIIllIlllIl[n4])) == Blocks.log && class_1975.IIIllIllIIlIlIlIlIllllIIl(class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3)) == 3;
    }

    @Override
    public int lIIIIlIlIIlllllIIllIIlIII() {
        return 28;
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
        int n4 = class_18432.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        int n5 = class_1084.IllIIIllIIIIlIlIlIllIIlll(n4);
        int n6 = class_1084.IIIllIllIIlIlIlIlIllllIIl(n4);
        int n7 = 4 + n6 * 2;
        int n8 = 5 + n6 * 2;
        float f = (float)n7 / 2.0f;
        switch (n5) {
            case 0: {
                this.lllIIIllIIIIlllIlIIllIIll((8.0f - f) / 16.0f, (12.0f - (float)n8) / 16.0f, (15.0f - (float)n7) / 16.0f, (8.0f + f) / 16.0f, 0.75f, 0.9375f);
                break;
            }
            case 1: {
                this.lllIIIllIIIIlllIlIIllIIll(0.0625f, (12.0f - (float)n8) / 16.0f, (8.0f - f) / 16.0f, (1.0f + (float)n7) / 16.0f, 0.75f, (8.0f + f) / 16.0f);
                break;
            }
            case 2: {
                this.lllIIIllIIIIlllIlIIllIIll((8.0f - f) / 16.0f, (12.0f - (float)n8) / 16.0f, 0.0625f, (8.0f + f) / 16.0f, 0.75f, (1.0f + (float)n7) / 16.0f);
                break;
            }
            case 3: {
                this.lllIIIllIIIIlllIlIIllIIll((15.0f - (float)n7) / 16.0f, (12.0f - (float)n8) / 16.0f, (8.0f - f) / 16.0f, 0.9375f, 0.75f, (8.0f + f) / 16.0f);
            }
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_1965 class_19652, ItemStack class_08972) {
        int n4 = ((MathHelper.IlIllllllIIlIIllllIIlIIIl((double)(class_19652.IIIIlIllIlIIlIIlIllIlIlll * 4.0f / 360.0f) + 0.5) & 3) + 0) % 4;
        class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n4, 2);
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, int n4, float f, float f2, float f3, int n5) {
        if (n4 == 1 || n4 == 0) {
            n4 = 2;
        }
        return class_1632.lIllllIIlIIIlIllllllIIIll[class_1632.IlIIIIIllllllIIlllIllllll[n4]];
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Block class_05492) {
        if (!this.lIllllIIlIIIlIllllllIIIll(class_13342, n, n2, n3)) {
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3), 0);
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, class_1084.lllIIIllIIIIlllIlIIllIIll(0), 0, 2);
        }
    }

    public static int IIIllIllIIlIlIlIlIllllIIl(int n) {
        return (n & 0xC) >> 2;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, int n4, float f, int n5) {
        int n6 = class_1084.IIIllIllIIlIlIlIlIllllIIl(n4);
        int n7 = 1;
        if (n6 >= 2) {
            n7 = 3;
        }
        for (int i = 0; i < n7; ++i) {
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, new ItemStack(Items.dye, 1, 3));
        }
    }

    @Override
    public Item IIIllIIlIIIIIIlIlIIllIIlI(class_1334 class_13342, int n, int n2, int n3) {
        return Items.dye;
    }

    @Override
    public int IllIIlllllllIIlIIlIIIIlIl(class_1334 class_13342, int n, int n2, int n3) {
        return 3;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
        this.llllllIlIllllIlIlIlIIIIlI = new class_2102[3];
        for (int i = 0; i < this.llllllIlIllllIlIlIlIIIIlI.length; ++i) {
            this.llllllIlIllllIlIlIlIIIIlI[i] = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_stage_" + i);
        }
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, boolean bl) {
        int n4 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        int n5 = class_1084.IIIllIllIIlIlIlIlIllllIIl(n4);
        return n5 < 2;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, Random random, int n, int n2, int n3) {
        return true;
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_1334 class_13342, Random random, int n, int n2, int n3) {
        int n4 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        int n5 = class_0143.IllIIIllIIIIlIlIlIllIIlll(n4);
        int n6 = class_1084.IIIllIllIIlIlIlIlIllllIIl(n4);
        class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, ++n6 << 2 | n5, 2);
    }
}

