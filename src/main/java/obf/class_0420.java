package obf;

import net.minecraft.init.Items;
import net.minecraft.stats.AchievementList;
import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
class class_0420
extends class_1291 {
    private class_0814 lllIIIllIIIIlllIlIIllIIll;

    public class_0420(class_0814 class_08142, class_0850 class_08502, int n, int n2, int n3) {
        super(class_08502, n, n2, n3);
        this.lllIIIllIIIIlllIlIIllIIll = class_08142;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972) {
        return class_0420.IlIllllllIIlIIllllIIlIIIl(class_08972);
    }

    @Override
    public int lIlllIlllIIIIlIIlllIllIII() {
        return 1;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0814 class_08142, ItemStack class_08972) {
        if (class_08972.lllIIIllIIIIlllIlIIllIIll() == Items.potionitem && class_08972.IllIIIllIIIIlIlIlIllIIlll() > 0) {
            this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(AchievementList.potion, 1);
        }
        super.lllIIIllIIIIlllIlIIllIIll(class_08142, class_08972);
    }

    public static boolean IlIllllllIIlIIllllIIlIIIl(ItemStack class_08972) {
        return class_08972 != null && (class_08972.lllIIIllIIIIlllIlIIllIIll() == Items.potionitem || class_08972.lllIIIllIIIIlllIlIIllIIll() == Items.lIIlllIIIlIIlIllIIIIIlIlI);
    }
}

