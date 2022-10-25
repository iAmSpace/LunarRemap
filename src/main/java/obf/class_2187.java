package obf;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public class class_2187 {
    private ItemStack lllIIIllIIIIlllIlIIllIIll;
    private ItemStack lllIlIIlIIIlIlIIIllIlllIl;
    private ItemStack IlIllllllIIlIIllllIIlIIIl;
    private int lIlllIlllIIIIlIIlllIllIII;
    private int IlIIIIIllllllIIlllIllllll;

    public class_2187(class_0775 class_07752) {
        this.lllIIIllIIIIlllIlIIllIIll(class_07752);
    }

    public class_2187(ItemStack class_08972, ItemStack class_08973, ItemStack class_08974) {
        this.lllIIIllIIIIlllIlIIllIIll = class_08972;
        this.lllIlIIlIIIlIlIIIllIlllIl = class_08973;
        this.IlIllllllIIlIIllllIIlIIIl = class_08974;
        this.IlIIIIIllllllIIlllIllllll = 7;
    }

    public class_2187(ItemStack class_08972, ItemStack class_08973) {
        this(class_08972, null, class_08973);
    }

    public class_2187(ItemStack class_08972, Item class_06112) {
        this(class_08972, new ItemStack(class_06112));
    }

    public ItemStack lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public ItemStack lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public boolean IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIlIIlIIIlIlIIIllIlllIl != null;
    }

    public ItemStack lIlllIlllIIIIlIIlllIllIII() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_2187 class_21872) {
        return this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll() == class_21872.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll() && this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll() == class_21872.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll() ? this.lllIlIIlIIIlIlIIIllIlllIl == null && class_21872.lllIlIIlIIIlIlIIIllIlllIl == null || this.lllIlIIlIIIlIlIIIllIlllIl != null && class_21872.lllIlIIlIIIlIlIIIllIlllIl != null && this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll() == class_21872.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll() : false;
    }

    public boolean lllIlIIlIIIlIlIIIllIlllIl(class_2187 class_21872) {
        return this.lllIIIllIIIIlllIlIIllIIll(class_21872) && (this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl < class_21872.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl || this.lllIlIIlIIIlIlIIIllIlllIl != null && this.lllIlIIlIIIlIlIIIllIlllIl.lllIlIIlIIIlIlIIIllIlllIl < class_21872.lllIlIIlIIIlIlIIIllIlllIl.lllIlIIlIIIlIlIIIllIlllIl);
    }

    public void IlIIIIIllllllIIlllIllllll() {
        ++this.lIlllIlllIIIIlIIlllIllIII;
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n) {
        this.IlIIIIIllllllIIlllIllllll += n;
    }

    public boolean lIllllIIlIIIlIllllllIIIll() {
        return this.lIlllIlllIIIIlIIlllIllIII >= this.IlIIIIIllllllIIlllIllllll;
    }

    public void IIIllIIlIIIIIIlIlIIllIIlI() {
        this.lIlllIlllIIIIlIIlllIllIII = this.IlIIIIIllllllIIlllIllllll;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        class_0775 class_07753 = class_07752.llIIllIllIlIIlIIllIllllll("buy");
        this.lllIIIllIIIIlllIlIIllIIll = ItemStack.lllIIIllIIIIlllIlIIllIIll(class_07753);
        class_0775 class_07754 = class_07752.llIIllIllIlIIlIIllIllllll("sell");
        this.IlIllllllIIlIIllllIIlIIIl = ItemStack.lllIIIllIIIIlllIlIIllIIll(class_07754);
        if (class_07752.lllIlIIlIIIlIlIIIllIlllIl("buyB", 10)) {
            this.lllIlIIlIIIlIlIIIllIlllIl = ItemStack.lllIIIllIIIIlllIlIIllIIll(class_07752.llIIllIllIlIIlIIllIllllll("buyB"));
        }
        if (class_07752.lllIlIIlIIIlIlIIIllIlllIl("uses", 99)) {
            this.lIlllIlllIIIIlIIlllIllIII = class_07752.lIllllIIlIIIlIllllllIIIll("uses");
        }
        this.IlIIIIIllllllIIlllIllllll = class_07752.lllIlIIlIIIlIlIIIllIlllIl("maxUses", 99) ? class_07752.lIllllIIlIIIlIllllllIIIll("maxUses") : 7;
    }

    public class_0775 IllIIlllllllIIlIIlIIIIlIl() {
        class_0775 class_07752 = new class_0775();
        class_07752.lllIIIllIIIIlllIlIIllIIll("buy", this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl(new class_0775()));
        class_07752.lllIIIllIIIIlllIlIIllIIll("sell", this.IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl(new class_0775()));
        if (this.lllIlIIlIIIlIlIIIllIlllIl != null) {
            class_07752.lllIIIllIIIIlllIlIIllIIll("buyB", this.lllIlIIlIIIlIlIIIllIlllIl.lllIlIIlIIIlIlIIIllIlllIl(new class_0775()));
        }
        class_07752.lllIIIllIIIIlllIlIIllIIll("uses", this.lIlllIlllIIIIlIIlllIllIII);
        class_07752.lllIIIllIIIIlllIlIIllIIll("maxUses", this.IlIIIIIllllllIIlllIllllll);
        return class_07752;
    }
}

