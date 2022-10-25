package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;

public class class_2054
extends class_1949 {
    private final boolean IllIIIllIIIIlIlIlIllIIlll;

    public class_2054(boolean bl) {
        super(0, 0.0f, false);
        this.IllIIIllIIIIlIlIlIllIIlll = bl;
    }

    @Override
    public int llIIllIllIlIIlIIllIllllll(ItemStack class_08972) {
        FishType class_18182 = FishType.lllIIIllIIIIlllIlIIllIIll(class_08972);
        return this.IllIIIllIIIIlIlIlIllIIlll && class_18182.IIIllIllIIlIlIlIlIllllIIl() ? class_18182.IlIIIIIllllllIIlllIllllll() : class_18182.IlIllllllIIlIIllllIIlIIIl();
    }

    @Override
    public float lllIIlIIIllllllIIIIlIlIlI(ItemStack class_08972) {
        FishType class_18182 = FishType.lllIIIllIIIIlllIlIIllIIll(class_08972);
        return this.IllIIIllIIIIlIlIlIllIIlll && class_18182.IIIllIllIIlIlIlIlIllllIIl() ? class_18182.lIllllIIlIIIlIllllllIIIll() : class_18182.lIlllIlllIIIIlIIlllIllIII();
    }

    @Override
    public String IIIllIIlIIIIIIlIlIIllIIlI(ItemStack class_08972) {
        return FishType.lllIIIllIIIIlllIlIIllIIll(class_08972) == FishType.PUFFERFISH ? class_0668.llIIllIllIlIIlIIllIllllll : null;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
        for (FishType class_18182 : FishType.values()) {
            class_18182.lllIIIllIIIIlllIlIIllIIll(class_08872);
        }
    }

    @Override
    protected void lIlllIlllIIIIlIIlllIllIII(ItemStack class_08972, class_1334 class_13342, class_0814 class_08142) {
        FishType class_18182 = FishType.lllIIIllIIIIlllIlIIllIIll(class_08972);
        if (class_18182 == FishType.PUFFERFISH) {
            class_08142.lllIIIllIIIIlllIlIIllIIll(new class_1852(class_0700.IlIIIlIIIIllIIIllIIIIIIll.IlIlIIlllIllllllllIIIlIlI, 1200, 3));
            class_08142.lllIIIllIIIIlllIlIIllIIll(new class_1852(class_0700.lIIlIIIIIlIlllIlIIlIlIlll.IlIlIIlllIllllllllIIIlIlI, 300, 2));
            class_08142.lllIIIllIIIIlllIlIIllIIll(new class_1852(class_0700.lIIIIlIlIIlllllIIllIIlIII.IlIlIIlllIllllllllIIIlIlI, 300, 1));
        }
        super.lIlllIlllIIIIlIIlllIllIII(class_08972, class_13342, class_08142);
    }

    @Override
    public IIcon IlIllllllIIlIIllllIIlIIIl(int n) {
        FishType class_18182 = FishType.lllIIIllIIIIlllIlIIllIIll(n);
        return this.IllIIIllIIIIlIlIlIllIIlll && class_18182.IIIllIllIIlIlIlIlIllllIIl() ? class_18182.IllIIlllllllIIlIIlIIIIlIl() : class_18182.IIIllIIlIIIIIIlIlIIllIIlI();
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(Item class_06112, class_0931 class_09312, List list) {
        for (FishType class_18182 : FishType.values()) {
            if (this.IllIIIllIIIIlIlIlIllIIlll && !class_18182.IIIllIllIIlIlIlIlIllllIIl()) continue;
            list.add(new ItemStack(this, 1, class_18182.lllIIIllIIIIlllIlIIllIIll()));
        }
    }

    @Override
    public String IlIllllllIIlIIllllIIlIIIl(ItemStack class_08972) {
        FishType class_18182 = FishType.lllIIIllIIIIlllIlIIllIIll(class_08972);
        return this.IllIIIllIIIIlIlIlIllIIlll() + "." + class_18182.lllIlIIlIIIlIlIIIllIlllIl() + "." + (this.IllIIIllIIIIlIlIlIllIIlll && class_18182.IIIllIllIIlIlIlIlIllllIIl() ? "cooked" : "raw");
    }
}

