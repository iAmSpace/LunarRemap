package obf;

import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0587
extends class_2257 {
    public class_0587() {
        super(class_1855.lIIlIIIIIlIlllIlIIlIlIlll);
        this.IlIllllllIIlIIllllIIlIIIl(3.0f);
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.lIllllIIlIIIlIllllllIIIll);
    }

    @Override
    public class_1774 lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n) {
        return new class_0396();
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_0814 class_08142, int n4, float f, float f2, float f3) {
        if (class_13342.IllIIIIllIIllIllIlllIlIIl) {
            return true;
        }
        class_0396 class_03962 = (class_0396)class_13342.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3);
        if (class_03962 != null) {
            class_08142.lllIIIllIIIIlllIlIIllIIll(class_03962);
        }
        return true;
    }

    @Override
    public boolean IlIlllIIIIIIlIIllIIllIlll() {
        return false;
    }

    @Override
    public boolean IllIIIllIIIIlIlIlIllIIlll() {
        return false;
    }

    @Override
    public int lIIIIlIlIIlllllIIllIIlIII() {
        return 34;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
        super.lllIIIllIIIIlllIlIIllIIll(class_08872);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_1965 class_19652, ItemStack class_08972) {
        super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_19652, class_08972);
        if (class_08972.IlIIIlIIIIllIIIllIIIIIIll()) {
            ((class_0396)class_13342.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3)).lllIIIllIIIIlllIlIIllIIll(class_08972.lIIlIIIIIlIlllIlIIlIlIlll());
        }
    }
}

