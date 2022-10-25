package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import java.util.List;
import java.util.Random;

public class class_1657 {
    private static final class_0425[] lllIIIllIIIIlllIlIIllIIll = new class_0425[]{new class_0425(Items.iron_ingot, 0, 1, 5, 10), new class_0425(Items.lIIIIlIlIIlllllIIllIIlIII, 0, 1, 3, 5), new class_0425(Items.lIIIlIIllIllIIlIIlIIIllII, 0, 4, 9, 5), new class_0425(Items.dye, 4, 4, 9, 5), new class_0425(Items.diamond, 0, 1, 2, 3), new class_0425(Items.IllIIlllllllIIlIIlIIIIlIl, 0, 3, 8, 10), new class_0425(Items.bread, 0, 1, 3, 15), new class_0425(Items.lllIlIIlIIIlIlIIIllIlllIl, 0, 1, 1, 1), new class_0425(Item.getItemFromBlock(Blocks.rail), 0, 4, 8, 1), new class_0425(Items.IIIlIllIlllIlIIIlIlIIllII, 0, 2, 4, 10), new class_0425(Items.lIIIllIlIlIlIIIllIlIlIllI, 0, 2, 4, 10), new class_0425(Items.saddle, 0, 1, 1, 3), new class_0425(Items.IlIllIIIIllllIIllIllIIIIl, 0, 1, 1, 1)};

    public static void lllIIIllIIIIlllIlIIllIIll() {
        class_1756.lllIIIllIIIIlllIlIIllIIll(class_1986.class, "MSCorridor");
        class_1756.lllIIIllIIIIlllIlIIllIIll(class_0877.class, "MSCrossing");
        class_1756.lllIIIllIIIIlllIlIIllIIll(class_1671.class, "MSRoom");
        class_1756.lllIIIllIIIIlllIlIIllIIll(class_1509.class, "MSStairs");
    }

    private static class_1036 lllIIIllIIIIlllIlIIllIIll(List list, Random random, int n, int n2, int n3, int n4, int n5) {
        int n6 = random.nextInt(100);
        if (n6 >= 80) {
            class_2046 class_20462 = class_0877.lllIIIllIIIIlllIlIIllIIll(list, random, n, n2, n3, n4);
            if (class_20462 != null) {
                return new class_0877(n5, random, class_20462, n4);
            }
        } else if (n6 >= 70) {
            class_2046 class_20463 = class_1509.lllIIIllIIIIlllIlIIllIIll(list, random, n, n2, n3, n4);
            if (class_20463 != null) {
                return new class_1509(n5, random, class_20463, n4);
            }
        } else {
            class_2046 class_20464 = class_1986.lllIIIllIIIIlllIlIIllIIll(list, random, n, n2, n3, n4);
            if (class_20464 != null) {
                return new class_1986(n5, random, class_20464, n4);
            }
        }
        return null;
    }

    private static class_1036 lllIlIIlIIIlIlIIIllIlllIl(class_1036 class_10362, List list, Random random, int n, int n2, int n3, int n4, int n5) {
        if (n5 > 8) {
            return null;
        }
        if (Math.abs(n - class_10362.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll) <= 80 && Math.abs(n3 - class_10362.lllIlIIlIIIlIlIIIllIlllIl().IlIllllllIIlIIllllIIlIIIl) <= 80) {
            class_1036 class_10363 = class_1657.lllIIIllIIIIlllIlIIllIIll(list, random, n, n2, n3, n4, n5 + 1);
            if (class_10363 != null) {
                list.add(class_10363);
                class_10363.lllIIIllIIIIlllIlIIllIIll(class_10362, list, random);
            }
            return class_10363;
        }
        return null;
    }

    static /* synthetic */ class_1036 lllIIIllIIIIlllIlIIllIIll(class_1036 class_10362, List list, Random random, int n, int n2, int n3, int n4, int n5) {
        return class_1657.lllIlIIlIIIlIlIIIllIlllIl(class_10362, list, random, n, n2, n3, n4, n5);
    }

    static /* synthetic */ class_0425[] lllIlIIlIIIlIlIIIllIlllIl() {
        return lllIIIllIIIIlllIlIIllIIll;
    }
}

