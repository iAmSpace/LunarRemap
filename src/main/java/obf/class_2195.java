package obf;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public class class_2195
extends class_1774 {
    private ItemStack IllIIlllllllIIlIIlIIIIlIl;

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        super.lllIIIllIIIIlllIlIIllIIll(class_07752);
        if (class_07752.lllIlIIlIIIlIlIIIllIlllIl("RecordItem", 10)) {
            this.lllIIIllIIIIlllIlIIllIIll(ItemStack.lllIIIllIIIIlllIlIIllIIll(class_07752.llIIllIllIlIIlIIllIllllll("RecordItem")));
        } else if (class_07752.lIllllIIlIIIlIllllllIIIll("Record") > 0) {
            this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Item.lllIIIllIIIIlllIlIIllIIll(class_07752.lIllllIIlIIIlIllllllIIIll("Record")), 1, 0));
        }
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        super.lllIlIIlIIIlIlIIIllIlllIl(class_07752);
        if (this.lllIIIllIIIIlllIlIIllIIll() != null) {
            class_07752.lllIIIllIIIIlllIlIIllIIll("RecordItem", this.lllIIIllIIIIlllIlIIllIIll().lllIlIIlIIIlIlIIIllIlllIl(new class_0775()));
            class_07752.lllIIIllIIIIlllIlIIllIIll("Record", Item.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll().lllIIIllIIIIlllIlIIllIIll()));
        }
    }

    public ItemStack lllIIIllIIIIlllIlIIllIIll() {
        return this.IllIIlllllllIIlIIlIIIIlIl;
    }

    public void lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972) {
        this.IllIIlllllllIIlIIlIIIIlIl = class_08972;
        this.llIIlIllIllllIlIIIIlIIlll();
    }
}

