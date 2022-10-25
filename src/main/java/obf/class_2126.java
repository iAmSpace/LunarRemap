package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;

import java.util.List;

public class class_2126
extends Item {
    private class_2102 IIIllIllIIlIlIlIlIllllIIl;

    public class_2126() {
        this.lllIIIllIIIIlllIlIIllIIll(true);
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.lIllllIIlIIIlIllllllIIIll);
    }

    @Override
    public String IIIllIllIIlIlIlIlIllllIIl(ItemStack class_08972) {
        String string = ("" + class_1586.lllIIIllIIIIlllIlIIllIIll(this.IllIIIllIIIIlIlIlIllIIlll() + ".name")).trim();
        String string2 = class_0054.lllIlIIlIIIlIlIIIllIlllIl(class_08972.IllIIIllIIIIlIlIlIllIIlll());
        if (string2 != null) {
            string = string + " " + class_1586.lllIIIllIIIIlllIlIIllIIll("entity." + string2 + ".name");
        }
        return string;
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, int n) {
        class_1128 class_11282 = (class_1128)class_0054.lllIIIllIIIIlllIlIIllIIll.get(class_08972.IllIIIllIIIIlIlIlIllIIlll());
        return class_11282 != null ? (n == 0 ? class_11282.lllIlIIlIIIlIlIIIllIlllIl : class_11282.IlIllllllIIlIIllllIIlIIIl) : 0xFFFFFF;
    }

    @Override
    public boolean IlIlIIlIlIllIIlIlIIllIIIl() {
        return true;
    }

    @Override
    public class_2102 lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        return n2 > 0 ? this.IIIllIllIIlIlIlIlIllllIIl : super.lllIIIllIIIIlllIlIIllIIll(n, n2);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, class_0814 class_08142, class_1334 class_13342, int n, int n2, int n3, int n4, float f, float f2, float f3) {
        class_1521 class_15212;
        if (class_13342.IllIIIIllIIllIllIlllIlIIl) {
            return true;
        }
        Block class_05492 = class_13342.a_(n, n2, n3);
        n += class_0573.lllIlIIlIIIlIlIIIllIlllIl[n4];
        n2 += class_0573.IlIllllllIIlIIllllIIlIIIl[n4];
        n3 += class_0573.lIlllIlllIIIIlIIlllIllIII[n4];
        double d = 0.0;
        if (n4 == 1 && class_05492.lIIIIlIlIIlllllIIllIIlIII() == 11) {
            d = 0.5;
        }
        if ((class_15212 = class_2126.lllIIIllIIIIlllIlIIllIIll(class_13342, class_08972.IllIIIllIIIIlIlIlIllIIlll(), (double)n + 0.5, (double)n2 + d, (double)n3 + 0.5)) != null) {
            if (class_15212 instanceof class_1965 && class_08972.IlIIIlIIIIllIIIllIIIIIIll()) {
                ((class_0339)class_15212).lllIIIllIIIIlllIlIIllIIll(class_08972.lIIlIIIIIlIlllIlIIlIlIlll());
            }
            if (!class_08142.lIIlIlIlIlIllIIlIIllllIll.lIlllIlllIIIIlIIlllIllIII) {
                --class_08972.lllIlIIlIIIlIlIIIllIlllIl;
            }
        }
        return true;
    }

    @Override
    public ItemStack lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, class_1334 class_13342, class_0814 class_08142) {
        if (class_13342.IllIIIIllIIllIllIlllIlIIl) {
            return class_08972;
        }
        class_1112 class_11122 = this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_08142, true);
        if (class_11122 == null) {
            return class_08972;
        }
        if (class_11122.lllIIIllIIIIlllIlIIllIIll == class_1431.lllIlIIlIIIlIlIIIllIlllIl) {
            class_1521 class_15212;
            int n = class_11122.lllIlIIlIIIlIlIIIllIlllIl;
            int n2 = class_11122.IlIllllllIIlIIllllIIlIIIl;
            int n3 = class_11122.lIlllIlllIIIIlIIlllIllIII;
            if (!class_13342.lllIIIllIIIIlllIlIIllIIll(class_08142, n, n2, n3)) {
                return class_08972;
            }
            if (!class_08142.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, class_11122.IlIIIIIllllllIIlllIllllll, class_08972)) {
                return class_08972;
            }
            if (class_13342.a_(n, n2, n3) instanceof class_0816 && (class_15212 = class_2126.lllIIIllIIIIlllIlIIllIIll(class_13342, class_08972.IllIIIllIIIIlIlIlIllIIlll(), n, n2, n3)) != null) {
                if (class_15212 instanceof class_1965 && class_08972.IlIIIlIIIIllIIIllIIIIIIll()) {
                    ((class_0339)class_15212).lllIIIllIIIIlllIlIIllIIll(class_08972.lIIlIIIIIlIlllIlIIlIlIlll());
                }
                if (!class_08142.lIIlIlIlIlIllIIlIIllllIll.lIlllIlllIIIIlIIlllIllIII) {
                    --class_08972.lllIlIIlIIIlIlIIIllIlllIl;
                }
            }
        }
        return class_08972;
    }

    public static class_1521 lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, double d, double d2, double d3) {
        if (!class_0054.lllIIIllIIIIlllIlIIllIIll.containsKey(n)) {
            return null;
        }
        class_1521 class_15212 = null;
        for (int i = 0; i < 1; ++i) {
            class_15212 = class_0054.lllIIIllIIIIlllIlIIllIIll(n, class_13342);
            if (class_15212 == null || !(class_15212 instanceof class_1965)) continue;
            class_0339 class_03392 = (class_0339)class_15212;
            class_15212.lllIlIIlIIIlIlIIIllIlllIl(d, d2, d3, MathHelper.IIIllIIlIIIIIIlIlIIllIIlI(class_13342.lllllIlllIIllIlIIlIIIllII.nextFloat() * 360.0f), 0.0f);
            class_03392.lIIllllIllIlllllIIllIllIl = class_03392.IIIIlIllIlIIlIIlIllIlIlll;
            class_03392.lllllIllllIIIIllIIlIlIlII = class_03392.IIIIlIllIlIIlIIlIllIlIlll;
            class_03392.lllIIIllIIIIlllIlIIllIIll((class_2025)null);
            class_13342.lllIIIllIIIIlllIlIIllIIll(class_15212);
            class_03392.lIlIIIllIIllIIlIllllllIll();
        }
        return class_15212;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(Item class_06112, class_0931 class_09312, List list) {
        for (class_1128 class_11282 : class_0054.lllIIIllIIIIlllIlIIllIIll.values()) {
            list.add(new ItemStack(class_06112, 1, class_11282.lllIIIllIIIIlllIlIIllIIll));
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
        super.lllIIIllIIIIlllIlIIllIIll(class_08872);
        this.IIIllIllIIlIlIlIlIllllIIl = class_08872.lllIIIllIIIIlllIlIIllIIll(this.lIlIlIIlIIIIlIIIIIlllIIII() + "_overlay");
    }
}

