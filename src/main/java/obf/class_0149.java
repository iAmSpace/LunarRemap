package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.item.ItemStack;

import java.util.Random;

public class class_0149
extends class_1469 {
    public class_0149(int n, int n2) {
        super(n, n2, class_0841.IlIIIIIllllllIIlllIllllll);
        this.lllIIIllIIIIlllIlIIllIIll("thorns");
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(int n) {
        return 10 + 20 * (n - 1);
    }

    @Override
    public int lllIlIIlIIIlIlIIIllIlllIl(int n) {
        return super.lllIIIllIIIIlllIlIIllIIll(n) + 50;
    }

    @Override
    public int IlIllllllIIlIIllllIIlIIIl() {
        return 3;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972) {
        return class_08972.lllIIIllIIIIlllIlIIllIIll() instanceof class_0981 ? true : super.lllIIIllIIIIlllIlIIllIIll(class_08972);
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_1965 class_19652, class_1521 class_15212, int n) {
        Random random = class_19652.IlllIIIlIIlIIIIllllIllllI();
        ItemStack class_08972 = class_1250.lllIIIllIIIIlllIlIIllIIll(class_1469.IllIIIllIIIIlIlIlIllIIlll, class_19652);
        if (class_0149.lllIIIllIIIIlllIlIIllIIll(n, random)) {
            class_15212.lllIIIllIIIIlllIlIIllIIll(class_0058.lllIIIllIIIIlllIlIIllIIll((class_1521)class_19652), (float)class_0149.lllIlIIlIIIlIlIIIllIlllIl(n, random));
            class_15212.lllIIIllIIIIlllIlIIllIIll("damage.thorns", 0.5f, 1.0f);
            if (class_08972 != null) {
                class_08972.lllIIIllIIIIlllIlIIllIIll(3, class_19652);
            }
        } else if (class_08972 != null) {
            class_08972.lllIIIllIIIIlllIlIIllIIll(1, class_19652);
        }
    }

    public static boolean lllIIIllIIIIlllIlIIllIIll(int n, Random random) {
        return n <= 0 ? false : random.nextFloat() < 0.15f * (float)n;
    }

    public static int lllIlIIlIIIlIlIIIllIlllIl(int n, Random random) {
        return n > 10 ? n - 10 : 1 + random.nextInt(4);
    }
}

