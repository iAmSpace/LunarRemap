package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.item.Item;

import java.util.Random;

public class class_1613
extends class_2257 {
    protected class_1613() {
        super(class_1855.IlIIIIIllllllIIlllIllllll);
    }

    @Override
    public class_1774 lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n) {
        return new class_0933();
    }

    @Override
    public Item lllIIIllIIIIlllIlIIllIIll(int n, Random random, int n2) {
        return null;
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(Random random) {
        return 0;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, int n4, float f, int n5) {
        super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, n4, f, n5);
        int n6 = 15 + class_13342.lllllIlllIIllIlIIlIIIllII.nextInt(15) + class_13342.lllllIlllIIllIlIIlIIIllII.nextInt(15);
        this.lllIlIIlIIIlIlIIIllIlllIl(class_13342, n, n2, n3, n6);
    }

    @Override
    public boolean IlIlllIIIIIIlIIllIIllIlll() {
        return false;
    }

    @Override
    public Item IIIllIIlIIIIIIlIlIIllIIlI(class_1334 class_13342, int n, int n2, int n3) {
        return Item.lllIIIllIIIIlllIlIIllIIll(0);
    }
}

