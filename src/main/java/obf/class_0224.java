package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.item.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class class_0224
implements class_2098 {
    private final ItemStack lllIIIllIIIIlllIlIIllIIll;
    private final List lllIlIIlIIIlIlIIIllIlllIl;

    public class_0224(ItemStack class_08972, List list) {
        this.lllIIIllIIIIlllIlIIllIIll = class_08972;
        this.lllIlIIlIIIlIlIIIllIlllIl = list;
    }

    @Override
    public ItemStack lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_0013 class_00132, class_1334 class_13342) {
        ArrayList arrayList = new ArrayList(this.lllIlIIlIIIlIlIIIllIlllIl);
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                ItemStack class_08972 = class_00132.lllIlIIlIIIlIlIIIllIlllIl(j, i);
                if (class_08972 == null) continue;
                boolean bl = false;
                for (ItemStack class_08973 : arrayList) {
                    if (class_08972.lllIIIllIIIIlllIlIIllIIll() != class_08973.lllIIIllIIIIlllIlIIllIIll() || class_08973.IllIIIllIIIIlIlIlIllIIlll() != 32767 && class_08972.IllIIIllIIIIlIlIlIllIIlll() != class_08973.IllIIIllIIIIlIlIlIllIIlll()) continue;
                    bl = true;
                    arrayList.remove(class_08973);
                    break;
                }
                if (bl) continue;
                return false;
            }
        }
        return arrayList.isEmpty();
    }

    @Override
    public ItemStack lllIIIllIIIIlllIlIIllIIll(class_0013 class_00132) {
        return this.lllIIIllIIIIlllIlIIllIIll.llIIlllIllIllllIIIlIIIIII();
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIlIIlIIIlIlIIIllIlllIl.size();
    }
}

