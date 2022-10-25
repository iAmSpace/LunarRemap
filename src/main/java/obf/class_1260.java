package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.item.ItemStack;

import java.util.Random;

public class class_1260
extends class_1006 {
    private final ItemStack lllIIIllIIIIlllIlIIllIIll;
    private float lllIlIIlIIIlIlIIIllIlllIl;
    private boolean IlIllllllIIlIIllllIIlIIIl;

    public class_1260(ItemStack class_08972, int n) {
        super(n);
        this.lllIIIllIIIIlllIlIIllIIll = class_08972;
    }

    public ItemStack lllIIIllIIIIlllIlIIllIIll(Random random) {
        ItemStack class_08972 = this.lllIIIllIIIIlllIlIIllIIll.llIIlllIllIllllIIIlIIIIII();
        if (this.lllIlIIlIIIlIlIIIllIlllIl > 0.0f) {
            int n = (int)(this.lllIlIIlIIIlIlIIIllIlllIl * (float)this.lllIIIllIIIIlllIlIIllIIll.lIIIIlIlIIlllllIIllIIlIII());
            int n2 = class_08972.lIIIIlIlIIlllllIIllIIlIII() - random.nextInt(random.nextInt(n) + 1);
            if (n2 > n) {
                n2 = n;
            }
            if (n2 < 1) {
                n2 = 1;
            }
            class_08972.lllIlIIlIIIlIlIIIllIlllIl(n2);
        }
        if (this.IlIllllllIIlIIllllIIlIIIl) {
            class_1250.lllIIIllIIIIlllIlIIllIIll(random, class_08972, 30);
        }
        return class_08972;
    }

    public class_1260 lllIIIllIIIIlllIlIIllIIll(float f) {
        this.lllIlIIlIIIlIlIIIllIlllIl = f;
        return this;
    }

    public class_1260 lllIIIllIIIIlllIlIIllIIll() {
        this.IlIllllllIIlIIllllIIlIIIl = true;
        return this;
    }
}

