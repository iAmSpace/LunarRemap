package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class class_1492
extends Item {
    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, class_0814 class_08142, class_1334 class_13342, int n, int n2, int n3, int n4, float f, float f2, float f3) {
        if (!class_13342.IllIIIIllIIllIllIlllIlIIl) {
            class_1800 class_18002 = new class_1800(class_13342, (float)n + f, (float)n2 + f2, (float)n3 + f3, class_08972);
            class_13342.lllIIIllIIIIlllIlIIllIIll(class_18002);
            if (!class_08142.lIIlIlIlIlIllIIlIIllllIll.lIlllIlllIIIIlIIlllIllIII) {
                --class_08972.lllIlIIlIIIlIlIIIllIlllIl;
            }
            return true;
        }
        return false;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, class_0814 class_08142, List list, boolean bl) {
        class_0775 class_07752;
        if (class_08972.IlIlIIlIlIllIIlIlIIllIIIl() && (class_07752 = class_08972.lllllIlllIIllIlIIlIIIllII().llIIllIllIlIIlIIllIllllll("Fireworks")) != null) {
            class_2145 class_21452;
            if (class_07752.lllIlIIlIIIlIlIIIllIlllIl("Flight", 99)) {
                list.add(class_1586.lllIIIllIIIIlllIlIIllIIll("item.fireworks.flight") + " " + class_07752.lIlllIlllIIIIlIIlllIllIII("Flight"));
            }
            if ((class_21452 = class_07752.IlIllllllIIlIIllllIIlIIIl("Explosions", 10)) != null && class_21452.lIlllIlllIIIIlIIlllIllIII() > 0) {
                for (int i = 0; i < class_21452.lIlllIlllIIIIlIIlllIllIII(); ++i) {
                    class_0775 class_07753 = class_21452.lllIlIIlIIIlIlIIIllIlllIl(i);
                    ArrayList<String> arrayList = new ArrayList<String>();
                    class_0374.lllIIIllIIIIlllIlIIllIIll(class_07753, arrayList);
                    if (arrayList.size() <= 0) continue;
                    for (int j = 1; j < arrayList.size(); ++j) {
                        arrayList.set(j, "  " + (String)arrayList.get(j));
                    }
                    list.addAll(arrayList);
                }
            }
        }
    }
}

