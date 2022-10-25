package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.BlockDispenser;
import net.minecraft.item.ItemStack;

import java.util.List;

final class class_1424
extends class_0926 {
    class_1424() {
    }

    @Override
    protected ItemStack lllIlIIlIIIlIlIIIllIlllIl(class_1728 class_17282, ItemStack class_08972) {
        class_1188 class_11882 = BlockDispenser.IllIIlllllllIIlIIlIIIIlIl(class_17282.IllIIlllllllIIlIIlIIIIlIl());
        int n = class_17282.IlIIIIIllllllIIlllIllllll() + class_11882.lllIIIllIIIIlllIlIIllIIll();
        int n2 = class_17282.lIllllIIlIIIlIllllllIIIll() + class_11882.lllIlIIlIIIlIlIIIllIlllIl();
        int n3 = class_17282.IIIllIIlIIIIIIlIlIIllIIlI() + class_11882.IlIllllllIIlIIllllIIlIIIl();
        class_1974 class_19742 = class_1974.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n + 1, n2 + 1, n3 + 1);
        List list = class_17282.lllIIIllIIIIlllIlIIllIIll().lllIIIllIIIIlllIlIIllIIll(class_1965.class, class_19742, (class_0830)new class_1935(class_08972));
        if (list.size() > 0) {
            class_1965 class_19652 = (class_1965)list.get(0);
            int n4 = class_19652 instanceof class_0814 ? 1 : 0;
            int n5 = class_0339.a_(class_08972);
            ItemStack class_08973 = class_08972.llIIlllIllIllllIIIlIIIIII();
            class_08973.lllIlIIlIIIlIlIIIllIlllIl = 1;
            class_19652.lllIIIllIIIIlllIlIIllIIll(n5 - n4, class_08973);
            if (class_19652 instanceof class_0339) {
                ((class_0339)class_19652).lllIIIllIIIIlllIlIIllIIll(n5, 2.0f);
            }
            --class_08972.lllIlIIlIIIlIlIIIllIlllIl;
            return class_08972;
        }
        return super.lllIlIIlIIIlIlIIIllIlllIl(class_17282, class_08972);
    }
}

