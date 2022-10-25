package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;

public class class_0985
extends Item {
    public class_0985() {
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.IIIllIllIIlIlIlIlIllllIIl);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, class_0814 class_08142, class_1334 class_13342, int n, int n2, int n3, int n4, float f, float f2, float f3) {
        Block class_05492 = class_13342.a_(n, n2, n3);
        if (class_05492.lIIIIlIlIIlllllIIllIIlIII() == 11) {
            if (class_13342.IllIIIIllIIllIllIlllIlIIl) {
                return true;
            }
            class_0985.lllIIIllIIIIlllIlIIllIIll(class_08142, class_13342, n, n2, n3);
            return true;
        }
        return false;
    }

    public static boolean lllIIIllIIIIlllIlIIllIIll(class_0814 class_08142, class_1334 class_13342, int n, int n2, int n3) {
        class_1215 class_12152 = class_1215.lllIlIIlIIIlIlIIIllIlllIl(class_13342, n, n2, n3);
        boolean bl = false;
        double d = 7.0;
        List list = class_13342.lllIIIllIIIIlllIlIIllIIll(class_0339.class, class_1974.lllIIIllIIIIlllIlIIllIIll((double)n - d, (double)n2 - d, (double)n3 - d, (double)n + d, (double)n2 + d, (double)n3 + d));
        if (list != null) {
            for (class_0339 class_03392 : list) {
                if (!class_03392.lIIIIIlIllIllIlIlIIllllll() || class_03392.lIIIlllIlIIIlIllIIIlIllll() != class_08142) continue;
                if (class_12152 == null) {
                    class_12152 = class_1215.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3);
                }
                class_03392.lllIlIIlIIIlIlIIIllIlllIl((class_1521)class_12152, true);
                bl = true;
            }
        }
        return bl;
    }
}

