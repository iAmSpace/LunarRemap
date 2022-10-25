package obf;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1748
extends Item {
    private class_2102 IIIllIllIIlIlIlIlIllllIIl;

    public class_1748() {
        this.IlIIIIIllllllIIlllIllllll(64);
        this.lllIlIIlIIIlIlIIIllIlllIl(1);
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.IIIllIllIIlIlIlIlIllllIIl);
    }

    @Override
    public boolean IllIIlllllllIIlIIlIIIIlIl() {
        return true;
    }

    @Override
    public boolean IIIllIllIIlIlIlIlIllllIIl() {
        return true;
    }

    @Override
    public ItemStack lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, class_1334 class_13342, class_0814 class_08142) {
        if (class_08142.IIlIlIIIIlIlllIIlIIlIIIII != null) {
            int n = class_08142.IIlIlIIIIlIlllIIlIIlIIIII.IlIllllllIIlIIllllIIlIIIl();
            class_08972.lllIIIllIIIIlllIlIIllIIll(n, (class_1965)class_08142);
            class_08142.lIIlIIIIIlIlllIlIIlIlIlll();
        } else {
            class_13342.lllIIIllIIIIlllIlIIllIIll((class_1521)class_08142, "random.bow", 0.5f, 0.4f / (IlIllllllIIlIIllllIIlIIIl.nextFloat() * 0.4f + 0.8f));
            if (!class_13342.IllIIIIllIIllIllIlllIlIIl) {
                class_13342.lllIIIllIIIIlllIlIIllIIll(new class_2050(class_13342, class_08142));
            }
            class_08142.lIIlIIIIIlIlllIlIIlIlIlll();
        }
        return class_08972;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
        this.IIIllIIlIIIIIIlIlIIllIIlI = class_08872.lllIIIllIIIIlllIlIIllIIll(this.lIlIlIIlIIIIlIIIIIlllIIII() + "_uncast");
        this.IIIllIllIIlIlIlIlIllllIIl = class_08872.lllIIIllIIIIlllIlIIllIIll(this.lIlIlIIlIIIIlIIIIIlllIIII() + "_cast");
    }

    public class_2102 IlIIIlIIIIllIIIllIIIIIIll() {
        return this.IIIllIllIIlIlIlIlIllllIIl;
    }

    @Override
    public boolean llIIlllIllIllllIIIlIIIIII(ItemStack class_08972) {
        return super.llIIlllIllIllllIIIlIIIIII(class_08972);
    }

    @Override
    public int IlIlllIIIIIIlIIllIIllIlll() {
        return 1;
    }
}

