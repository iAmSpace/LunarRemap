package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.Random;

public class class_0425
extends class_1006 {
    private ItemStack lllIIIllIIIIlllIlIIllIIll;
    private int lllIlIIlIIIlIlIIIllIlllIl;
    private int IlIllllllIIlIIllllIIlIIIl;

    public class_0425(Item class_06112, int n, int n2, int n3, int n4) {
        super(n4);
        this.lllIIIllIIIIlllIlIIllIIll = new ItemStack(class_06112, 1, n);
        this.lllIlIIlIIIlIlIIIllIlllIl = n2;
        this.IlIllllllIIlIIllllIIlIIIl = n3;
    }

    public class_0425(ItemStack class_08972, int n, int n2, int n3) {
        super(n3);
        this.lllIIIllIIIIlllIlIIllIIll = class_08972;
        this.lllIlIIlIIIlIlIIIllIlllIl = n;
        this.IlIllllllIIlIIllllIIlIIIl = n2;
    }

    public static void lllIIIllIIIIlllIlIIllIIll(Random random, class_0425[] arrclass_0425, class_0850 class_08502, int n) {
        for (int i = 0; i < n; ++i) {
            class_0425 class_04252 = (class_0425)class_0242.lllIIIllIIIIlllIlIIllIIll(random, arrclass_0425);
            int n2 = class_04252.lllIlIIlIIIlIlIIIllIlllIl + random.nextInt(class_04252.IlIllllllIIlIIllllIIlIIIl - class_04252.lllIlIIlIIIlIlIIIllIlllIl + 1);
            if (class_04252.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII() >= n2) {
                ItemStack class_08972 = class_04252.lllIIIllIIIIlllIlIIllIIll.llIIlllIllIllllIIIlIIIIII();
                class_08972.lllIlIIlIIIlIlIIIllIlllIl = n2;
                class_08502.lllIlIIlIIIlIlIIIllIlllIl(random.nextInt(class_08502.IlIIIIIllllllIIlllIllllll()), class_08972);
                continue;
            }
            for (int j = 0; j < n2; ++j) {
                ItemStack class_08973 = class_04252.lllIIIllIIIIlllIlIIllIIll.llIIlllIllIllllIIIlIIIIII();
                class_08973.lllIlIIlIIIlIlIIIllIlllIl = 1;
                class_08502.lllIlIIlIIIlIlIIIllIlllIl(random.nextInt(class_08502.IlIIIIIllllllIIlllIllllll()), class_08973);
            }
        }
    }

    public static void lllIIIllIIIIlllIlIIllIIll(Random random, class_0425[] arrclass_0425, class_1646 class_16462, int n) {
        for (int i = 0; i < n; ++i) {
            class_0425 class_04252 = (class_0425)class_0242.lllIIIllIIIIlllIlIIllIIll(random, arrclass_0425);
            int n2 = class_04252.lllIlIIlIIIlIlIIIllIlllIl + random.nextInt(class_04252.IlIllllllIIlIIllllIIlIIIl - class_04252.lllIlIIlIIIlIlIIIllIlllIl + 1);
            if (class_04252.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII() >= n2) {
                ItemStack class_08972 = class_04252.lllIIIllIIIIlllIlIIllIIll.llIIlllIllIllllIIIlIIIIII();
                class_08972.lllIlIIlIIIlIlIIIllIlllIl = n2;
                class_16462.lllIlIIlIIIlIlIIIllIlllIl(random.nextInt(class_16462.IlIIIIIllllllIIlllIllllll()), class_08972);
                continue;
            }
            for (int j = 0; j < n2; ++j) {
                ItemStack class_08973 = class_04252.lllIIIllIIIIlllIlIIllIIll.llIIlllIllIllllIIIlIIIIII();
                class_08973.lllIlIIlIIIlIlIIIllIlllIl = 1;
                class_16462.lllIlIIlIIIlIlIIIllIlllIl(random.nextInt(class_16462.IlIIIIIllllllIIlllIllllll()), class_08973);
            }
        }
    }

    public static class_0425[] lllIIIllIIIIlllIlIIllIIll(class_0425[] arrclass_0425, class_0425 ... arrclass_04252) {
        class_0425[] arrclass_04253 = new class_0425[arrclass_0425.length + arrclass_04252.length];
        int n = 0;
        for (int i = 0; i < arrclass_0425.length; ++i) {
            arrclass_04253[n++] = arrclass_0425[i];
        }
        class_0425[] arrclass_04254 = arrclass_04252;
        int n2 = arrclass_04252.length;
        for (int i = 0; i < n2; ++i) {
            class_0425 class_04252 = arrclass_04254[i];
            arrclass_04253[n++] = class_04252;
        }
        return arrclass_04253;
    }
}

