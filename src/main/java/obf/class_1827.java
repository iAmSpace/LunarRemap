package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;

public class class_1827
extends Item {
    public class_1827() {
        this.lllIlIIlIIIlIlIIIllIlllIl(1);
    }

    public static boolean lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        if (!class_0789.lllIIIllIIIIlllIlIIllIIll(class_07752)) {
            return false;
        }
        if (!class_07752.lllIlIIlIIIlIlIIIllIlllIl("title", 8)) {
            return false;
        }
        String string = class_07752.IllIIIllIIIIlIlIlIllIIlll("title");
        return string != null && string.length() <= 16 ? class_07752.lllIlIIlIIIlIlIIIllIlllIl("author", 8) : false;
    }

    @Override
    public String IIIllIllIIlIlIlIlIllllIIl(ItemStack class_08972) {
        class_0775 class_07752;
        String string;
        if (class_08972.IlIlIIlIlIllIIlIlIIllIIIl() && !class_1911.lllIlIIlIIIlIlIIIllIlllIl(string = (class_07752 = class_08972.lllllIlllIIllIlIIlIIIllII()).IllIIIllIIIIlIlIlIllIIlll("title"))) {
            return string;
        }
        return super.IIIllIllIIlIlIlIlIllllIIl(class_08972);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, class_0814 class_08142, List list, boolean bl) {
        class_0775 class_07752;
        String string;
        if (class_08972.IlIlIIlIlIllIIlIlIIllIIIl() && !class_1911.lllIlIIlIIIlIlIIIllIlllIl(string = (class_07752 = class_08972.lllllIlllIIllIlIIlIIIllII()).IllIIIllIIIIlIlIlIllIIlll("author"))) {
            list.add((Object)((Object)class_1227.IllIIlllllllIIlIIlIIIIlIl) + class_1586.lllIIIllIIIIlllIlIIllIIll("book.byAuthor", string));
        }
    }

    @Override
    public ItemStack lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, class_1334 class_13342, class_0814 class_08142) {
        class_08142.lllIIIllIIIIlllIlIIllIIll(class_08972);
        return class_08972;
    }

    @Override
    public boolean lIIIIlIlIIlllllIIllIIlIII() {
        return true;
    }

    @Override
    public boolean IllIIIllIIIIlIlIlIllIIlll(ItemStack class_08972) {
        return true;
    }
}

