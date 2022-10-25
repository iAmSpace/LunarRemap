package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;

public class class_0984
extends Item {
    private class_2102 IIIllIllIIlIlIlIlIllllIIl;

    public class_0984() {
        this.lllIIIllIIIIlllIlIIllIIll(true);
        this.IlIIIIIllllllIIlllIllllll(0);
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.llIIlllIllIllllIIIlIIIIII);
    }

    @Override
    public String IlIllllllIIlIIllllIIlIIIl(ItemStack class_08972) {
        return class_08972.IllIIIllIIIIlIlIlIllIIlll() == 1 ? "item.charcoal" : "item.coal";
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(Item class_06112, class_0931 class_09312, List list) {
        list.add(new ItemStack(class_06112, 1, 0));
        list.add(new ItemStack(class_06112, 1, 1));
    }

    @Override
    public class_2102 IlIllllllIIlIIllllIIlIIIl(int n) {
        return n == 1 ? this.IIIllIllIIlIlIlIlIllllIIl : super.IlIllllllIIlIIllllIIlIIIl(n);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
        super.lllIIIllIIIIlllIlIIllIIll(class_08872);
        this.IIIllIllIIlIlIlIlIllllIIl = class_08872.lllIIIllIIIIlllIlIIllIIll("charcoal");
    }
}

