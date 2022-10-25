package obf;

import net.minecraft.item.Item;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0461
extends class_1774 {
    private Item IllIIlllllllIIlIIlIIIIlIl;
    private int IIIllIllIIlIlIlIlIllllIIl;

    public class_0461() {
    }

    public class_0461(Item class_06112, int n) {
        this.IllIIlllllllIIlIIlIIIIlIl = class_06112;
        this.IIIllIllIIlIlIlIlIllllIIl = n;
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        super.lllIlIIlIIIlIlIIIllIlllIl(class_07752);
        class_07752.lllIIIllIIIIlllIlIIllIIll("Item", Item.lllIIIllIIIIlllIlIIllIIll(this.IllIIlllllllIIlIIlIIIIlIl));
        class_07752.lllIIIllIIIIlllIlIIllIIll("Data", this.IIIllIllIIlIlIlIlIllllIIl);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        super.lllIIIllIIIIlllIlIIllIIll(class_07752);
        this.IllIIlllllllIIlIIlIIIIlIl = Item.lllIIIllIIIIlllIlIIllIIll(class_07752.lIllllIIlIIIlIllllllIIIll("Item"));
        this.IIIllIllIIlIlIlIlIllllIIl = class_07752.lIllllIIlIIIlIllllllIIIll("Data");
    }

    @Override
    public class_0703 IllIIlllllllIIlIIlIIIIlIl() {
        class_0775 class_07752 = new class_0775();
        this.lllIlIIlIIIlIlIIIllIlllIl(class_07752);
        return new class_1180(this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, 5, class_07752);
    }

    public void lllIIIllIIIIlllIlIIllIIll(Item class_06112, int n) {
        this.IllIIlllllllIIlIIlIIIIlIl = class_06112;
        this.IIIllIllIIlIlIlIlIllllIIl = n;
    }

    public Item lllIIIllIIIIlllIlIIllIIll() {
        return this.IllIIlllllllIIlIIlIIIIlIl;
    }

    public int IlIIIIIllllllIIlllIllllll() {
        return this.IIIllIllIIlIlIlIlIllllIIl;
    }
}

