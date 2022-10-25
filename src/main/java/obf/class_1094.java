package obf;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1094
extends class_1309 {
    private float IlIIIIIllllllIIlllIllllll = 1.0f;

    public class_1094(class_1334 class_13342) {
        super(class_13342);
    }

    public class_1094(class_1334 class_13342, int n, int n2, int n3, int n4) {
        super(class_13342, n, n2, n3, n4);
        this.lllIIIllIIIIlllIlIIllIIll(n4);
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl() {
        this.lIlIIllllIlIIIIllIIIIlIIl().lllIIIllIIIIlllIlIIllIIll(2, 5);
        this.lIlIIllllIlIIIIllIIIIlIIl().lllIIIllIIIIlllIlIIllIIll(3, (Object)0);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_0058 class_00582, float f) {
        if (this.lIIllIIlIIIlllIlllIIlIIlI()) {
            return false;
        }
        if (this.lIllllIIlIIIlIllllllIIIll() != null) {
            if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
                this.lllIlIIlIIIlIlIIIllIlllIl(class_00582.IllIIIllIIIIlIlIlIllIIlll(), false);
                this.lllIIIllIIIIlllIlIIllIIll((ItemStack)null);
            }
            return true;
        }
        return super.lllIIIllIIIIlllIlIIllIIll(class_00582, f);
    }

    @Override
    public int lIlllIlllIIIIlIIlllIllIII() {
        return 9;
    }

    @Override
    public int IlIIIIIllllllIIlllIllllll() {
        return 9;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(double d) {
        double d2 = 16.0;
        return d < (d2 *= 64.0 * this.IlIlIIlllIIlIllIIIlllllIl) * d2;
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_1521 class_15212) {
        this.lllIlIIlIIIlIlIIIllIlllIl(class_15212, true);
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(class_1521 class_15212, boolean bl) {
        ItemStack class_08972 = this.lIllllIIlIIIlIllllllIIIll();
        if (class_15212 instanceof class_0814) {
            class_0814 class_08142 = (class_0814)class_15212;
            if (class_08142.lIIlIlIlIlIllIIlIIllllIll.lIlllIlllIIIIlIIlllIllIII) {
                this.lllIlIIlIIIlIlIIIllIlllIl(class_08972);
                return;
            }
        }
        if (bl) {
            this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Items.IIIllIIIlIlllllllIIIlllll), 0.0f);
        }
        if (class_08972 != null && this.IlllIIlllllllIIllIlIllllI.nextFloat() < this.IlIIIIIllllllIIlllIllllll) {
            class_08972 = class_08972.llIIlllIllIllllIIIlIIIIII();
            this.lllIlIIlIIIlIlIIIllIlllIl(class_08972);
            this.lllIIIllIIIIlllIlIIllIIll(class_08972, 0.0f);
        }
    }

    private void lllIlIIlIIIlIlIIIllIlllIl(ItemStack class_08972) {
        if (class_08972 != null) {
            if (class_08972.lllIIIllIIIIlllIlIIllIIll() == Items.IIIIIlllIIllllIlllIlllIIl) {
                class_0963 class_09632 = ((class_0746)class_08972.lllIIIllIIIIlllIlIIllIIll()).lllIIIllIIIIlllIlIIllIIll(class_08972, this.lIlIllIIlIIlIIlIIlIIlIIll);
                class_09632.IllIIlllllllIIlIIlIIIIlIl.remove("frame-" + this.llllllIlIllllIlIlIlIIIIlI());
            }
            class_08972.lllIIIllIIIIlllIlIIllIIll((class_1094)null);
        }
    }

    public ItemStack lIllllIIlIIIlIllllllIIIll() {
        return this.lIlIIllllIlIIIIllIIIIlIIl().lIllllIIlIIIlIllllllIIIll(2);
    }

    public void lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972) {
        if (class_08972 != null) {
            class_08972 = class_08972.llIIlllIllIllllIIIlIIIIII();
            class_08972.lllIlIIlIIIlIlIIIllIlllIl = 1;
            class_08972.lllIIIllIIIIlllIlIIllIIll(this);
        }
        this.lIlIIllllIlIIIIllIIIIlIIl().lllIlIIlIIIlIlIIIllIlllIl(2, class_08972);
        this.lIlIIllllIlIIIIllIIIIlIIl().IIIllIIlIIIIIIlIlIIllIIlI(2);
    }

    public int IllIIlllllllIIlIIlIIIIlIl() {
        return this.lIlIIllllIlIIIIllIIIIlIIl().lllIIIllIIIIlllIlIIllIIll(3);
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(int n) {
        this.lIlIIllllIlIIIIllIIIIlIIl().lllIlIIlIIIlIlIIIllIlllIl(3, (byte)(n % 4));
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        if (this.lIllllIIlIIIlIllllllIIIll() != null) {
            class_07752.lllIIIllIIIIlllIlIIllIIll("Item", this.lIllllIIlIIIlIllllllIIIll().lllIlIIlIIIlIlIIIllIlllIl(new class_0775()));
            class_07752.lllIIIllIIIIlllIlIIllIIll("ItemRotation", (byte)this.IllIIlllllllIIlIIlIIIIlIl());
            class_07752.lllIIIllIIIIlllIlIIllIIll("ItemDropChance", this.IlIIIIIllllllIIlllIllllll);
        }
        super.lllIlIIlIIIlIlIIIllIlllIl(class_07752);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        class_0775 class_07753 = class_07752.llIIllIllIlIIlIIllIllllll("Item");
        if (class_07753 != null && !class_07753.IlIIIIIllllllIIlllIllllll()) {
            this.lllIIIllIIIIlllIlIIllIIll(ItemStack.lllIIIllIIIIlllIlIIllIIll(class_07753));
            this.lllIlIIlIIIlIlIIIllIlllIl(class_07752.lIlllIlllIIIIlIIlllIllIII("ItemRotation"));
            if (class_07752.lllIlIIlIIIlIlIIIllIlllIl("ItemDropChance", 99)) {
                this.IlIIIIIllllllIIlllIllllll = class_07752.IllIIlllllllIIlIIlIIIIlIl("ItemDropChance");
            }
        }
        super.lllIIIllIIIIlllIlIIllIIll(class_07752);
    }

    @Override
    public boolean b_(class_0814 class_08142) {
        if (this.lIllllIIlIIIlIllllllIIIll() == null) {
            ItemStack class_08972 = class_08142.lIIIIlIlIlIIIlIIllIIlIlIl();
            if (class_08972 != null && !this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
                this.lllIIIllIIIIlllIlIIllIIll(class_08972);
                if (!class_08142.lIIlIlIlIlIllIIlIIllllIll.lIlllIlllIIIIlIIlllIllIII && --class_08972.lllIlIIlIIIlIlIIIllIlllIl <= 0) {
                    class_08142.lllIIlIIIllllllIIIIlIlIlI.lllIlIIlIIIlIlIIIllIlllIl(class_08142.lllIIlIIIllllllIIIIlIlIlI.IlIllllllIIlIIllllIIlIIIl, null);
                }
            }
        } else if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
            this.lllIlIIlIIIlIlIIIllIlllIl(this.IllIIlllllllIIlIIlIIIIlIl() + 1);
        }
        return true;
    }
}

