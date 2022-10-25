package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import java.util.List;

public class class_0426
extends class_0512 {
    private ItemStack IlIllllllIIlIIllllIIlIIIl;

    public class_0426(class_1334 class_13342) {
        super(class_13342);
    }

    public class_0426(class_1334 class_13342, class_1965 class_19652, int n) {
        this(class_13342, class_19652, new ItemStack(Items.potionitem, 1, n));
    }

    public class_0426(class_1334 class_13342, class_1965 class_19652, ItemStack class_08972) {
        super(class_13342, class_19652);
        this.IlIllllllIIlIIllllIIlIIIl = class_08972;
    }

    public class_0426(class_1334 class_13342, double d, double d2, double d3, int n) {
        this(class_13342, d, d2, d3, new ItemStack(Items.potionitem, 1, n));
    }

    public class_0426(class_1334 class_13342, double d, double d2, double d3, ItemStack class_08972) {
        super(class_13342, d, d2, d3);
        this.IlIllllllIIlIIllllIIlIIIl = class_08972;
    }

    @Override
    protected float IlIllllllIIlIIllllIIlIIIl() {
        return 0.05f;
    }

    @Override
    protected float lIlllIlllIIIIlIIlllIllIII() {
        return 0.5f;
    }

    @Override
    protected float IlIIIIIllllllIIlllIllllll() {
        return -20.0f;
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n) {
        if (this.IlIllllllIIlIIllllIIlIIIl == null) {
            this.IlIllllllIIlIIllllIIlIIIl = new ItemStack(Items.potionitem, 1, 0);
        }
        this.IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl(n);
    }

    public int lIllllIIlIIIlIllllllIIIll() {
        if (this.IlIllllllIIlIIllllIIlIIIl == null) {
            this.IlIllllllIIlIIllllIIlIIIl = new ItemStack(Items.potionitem, 1, 0);
        }
        return this.IlIllllllIIlIIllllIIlIIIl.IllIIIllIIIIlIlIlIllIIlll();
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1112 class_11122) {
        if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
            class_1974 class_19742;
            List list;
            List list2 = Items.potionitem.llIIllIllIlIIlIIllIllllll(this.IlIllllllIIlIIllllIIlIIIl);
            if (list2 != null && !list2.isEmpty() && (list = this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(class_1965.class, class_19742 = this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl(4.0, 2.0, 4.0))) != null && !list.isEmpty()) {
                for (class_1965 class_19652 : list) {
                    double d = this.IlIIIIIllllllIIlllIllllll(class_19652);
                    if (!(d < 16.0)) continue;
                    double d2 = 1.0 - Math.sqrt(d) / 4.0;
                    if (class_19652 == class_11122.IIIllIIlIIIIIIlIlIIllIIlI) {
                        d2 = 1.0;
                    }
                    for (class_1852 class_18522 : list2) {
                        int n = class_18522.lllIIIllIIIIlllIlIIllIIll();
                        if (class_0700.lllIIIllIIIIlllIlIIllIIll[n].lllIlIIlIIIlIlIIIllIlllIl()) {
                            class_0700.lllIIIllIIIIlllIlIIllIIll[n].lllIIIllIIIIlllIlIIllIIll(this.IllIIlllllllIIlIIlIIIIlIl(), class_19652, class_18522.IlIllllllIIlIIllllIIlIIIl(), d2);
                            continue;
                        }
                        int n2 = (int)(d2 * (double)class_18522.lllIlIIlIIIlIlIIIllIlllIl() + 0.5);
                        if (n2 <= 20) continue;
                        class_19652.lllIIIllIIIIlllIlIIllIIll(new class_1852(n, n2, class_18522.IlIllllllIIlIIllllIIlIIIl()));
                    }
                }
            }
            this.lIlIllIIlIIlIIlIIlIIlIIll.IlIllllllIIlIIllllIIlIIIl(2002, (int)Math.round(this.IlIIlllllIIlIlIlllllIllll), (int)Math.round(this.llIIlIlIlllIIllIlIlllIllI), (int)Math.round(this.IllIIIIllIIllIllIlllIlIIl), this.lIllllIIlIIIlIllllllIIIll());
            this.IIIIlIIlIIIllIIIIllIIIlII();
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        super.lllIIIllIIIIlllIlIIllIIll(class_07752);
        if (class_07752.lllIlIIlIIIlIlIIIllIlllIl("Potion", 10)) {
            this.IlIllllllIIlIIllllIIlIIIl = ItemStack.lllIIIllIIIIlllIlIIllIIll(class_07752.llIIllIllIlIIlIIllIllllll("Potion"));
        } else {
            this.lllIIIllIIIIlllIlIIllIIll(class_07752.lIllllIIlIIIlIllllllIIIll("potionValue"));
        }
        if (this.IlIllllllIIlIIllllIIlIIIl == null) {
            this.IIIIlIIlIIIllIIIIllIIIlII();
        }
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        super.lllIlIIlIIIlIlIIIllIlllIl(class_07752);
        if (this.IlIllllllIIlIIllllIIlIIIl != null) {
            class_07752.lllIIIllIIIIlllIlIIllIIll("Potion", this.IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl(new class_0775()));
        }
    }
}

