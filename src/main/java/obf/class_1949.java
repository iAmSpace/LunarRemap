package obf;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1949
extends Item {
    public final int IIIllIllIIlIlIlIlIllllIIl;
    private final int IllIIIllIIIIlIlIlIllIIlll;
    private final float lIIIIlIlIIlllllIIllIIlIII;
    private final boolean llIIlllIllIllllIIIlIIIIII;
    private boolean llIIllIllIlIIlIIllIllllll;
    private int lllIIlIIIllllllIIIIlIlIlI;
    private int IlIlllIIIIIIlIIllIIllIlll;
    private int IlIlIIlIlIllIIlIlIIllIIIl;
    private float lllllIlllIIllIlIIlIIIllII;

    public class_1949(int n, float f, boolean bl) {
        this.IIIllIllIIlIlIlIlIllllIIl = 32;
        this.IllIIIllIIIIlIlIlIllIIlll = n;
        this.llIIlllIllIllllIIIlIIIIII = bl;
        this.lIIIIlIlIIlllllIIllIIlIII = f;
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.IllIIlllllllIIlIIlIIIIlIl);
    }

    public class_1949(int n, boolean bl) {
        this(n, 0.6f, bl);
    }

    @Override
    public ItemStack lllIlIIlIIIlIlIIIllIlllIl(ItemStack class_08972, class_1334 class_13342, class_0814 class_08142) {
        --class_08972.lllIlIIlIIIlIlIIIllIlllIl;
        class_08142.lIllIIlllIIIlIlIIIlllIlIl().lllIIIllIIIIlllIlIIllIIll(this, class_08972);
        class_13342.lllIIIllIIIIlllIlIIllIIll((class_1521)class_08142, "random.burp", 0.5f, class_13342.lllllIlllIIllIlIIlIIIllII.nextFloat() * 0.1f + 0.9f);
        this.lIlllIlllIIIIlIIlllIllIII(class_08972, class_13342, class_08142);
        return class_08972;
    }

    protected void lIlllIlllIIIIlIIlllIllIII(ItemStack class_08972, class_1334 class_13342, class_0814 class_08142) {
        if (!class_13342.IllIIIIllIIllIllIlllIlIIl && this.lllIIlIIIllllllIIIIlIlIlI > 0 && class_13342.lllllIlllIIllIlIIlIIIllII.nextFloat() < this.lllllIlllIIllIlIIlIIIllII) {
            class_08142.lllIIIllIIIIlllIlIIllIIll(new class_1852(this.lllIIlIIIllllllIIIIlIlIlI, this.IlIlllIIIIIIlIIllIIllIlll * 20, this.IlIlIIlIlIllIIlIlIIllIIIl));
        }
    }

    @Override
    public int lIllllIIlIIIlIllllllIIIll(ItemStack class_08972) {
        return 32;
    }

    @Override
    public class_1484 IlIIIIIllllllIIlllIllllll(ItemStack class_08972) {
        return class_1484.lllIlIIlIIIlIlIIIllIlllIl;
    }

    @Override
    public ItemStack lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, class_1334 class_13342, class_0814 class_08142) {
        if (class_08142.IlIllllllIIlIIllllIIlIIIl(this.llIIllIllIlIIlIIllIllllll)) {
            class_08142.IlIllllllIIlIIllllIIlIIIl(class_08972, this.lIllllIIlIIIlIllllllIIIll(class_08972));
        }
        return class_08972;
    }

    public int llIIllIllIlIIlIIllIllllll(ItemStack class_08972) {
        return this.IllIIIllIIIIlIlIlIllIIlll;
    }

    public float lllIIlIIIllllllIIIIlIlIlI(ItemStack class_08972) {
        return this.lIIIIlIlIIlllllIIllIIlIII;
    }

    public boolean IlIIIlIIIIllIIIllIIIIIIll() {
        return this.llIIlllIllIllllIIIlIIIIII;
    }

    public class_1949 lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, float f) {
        this.lllIIlIIIllllllIIIIlIlIlI = n;
        this.IlIlllIIIIIIlIIllIIllIlll = n2;
        this.IlIlIIlIlIllIIlIlIIllIIIl = n3;
        this.lllllIlllIIllIlIIlIIIllII = f;
        return this;
    }

    public class_1949 IIlllIlIlllIllIIIlllIIlIl() {
        this.llIIllIllIlIIlIIllIllllll = true;
        return this;
    }
}

