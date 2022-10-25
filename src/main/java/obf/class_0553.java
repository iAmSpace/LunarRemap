package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;

import java.util.Random;

public class class_0553
extends class_2257 {
    protected class_0553() {
        super(class_1855.IlIIIIIllllllIIlllIllllll);
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.IlIllllllIIlIIllllIIlIIIl);
        this.lllIIIllIIIIlllIlIIllIIll(0.0625f, 0.0f, 0.0625f, 0.9375f, 0.875f, 0.9375f);
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
        return 22;
    }

    @Override
    public Item lllIIIllIIIIlllIlIIllIIll(int n, Random random, int n2) {
        return Item.getItemFromBlock(Blocks.obsidian);
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(Random random) {
        return 8;
    }

    @Override
    protected boolean IlIIlllllIIlIlIlllllIllll() {
        return true;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_1965 class_19652, ItemStack class_08972) {
        int n4 = 0;
        int n5 = MathHelper.IlIllllllIIlIIllllIIlIIIl((double)(class_19652.IIIIlIllIlIIlIIlIllIlIlll * 4.0f / 360.0f) + 0.5) & 3;
        if (n5 == 0) {
            n4 = 2;
        }
        if (n5 == 1) {
            n4 = 5;
        }
        if (n5 == 2) {
            n4 = 3;
        }
        if (n5 == 3) {
            n4 = 4;
        }
        class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n4, 2);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_0814 class_08142, int n4, float f, float f2, float f3) {
        class_0407 class_04072 = class_08142.lllIIIIlIIllIIIlIllIlllII();
        class_1314 class_13142 = (class_1314)class_13342.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3);
        if (class_04072 != null && class_13142 != null) {
            if (class_13342.a_(n, n2 + 1, n3).IIIllIllIIlIlIlIlIllllIIl()) {
                return true;
            }
            if (class_13342.IllIIIIllIIllIllIlllIlIIl) {
                return true;
            }
            class_04072.lllIIIllIIIIlllIlIIllIIll(class_13142);
            class_08142.lllIIIllIIIIlllIlIIllIIll(class_04072);
            return true;
        }
        return true;
    }

    @Override
    public class_1774 lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n) {
        return new class_1314();
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_1334 class_13342, int n, int n2, int n3, Random random) {
        for (int i = 0; i < 3; ++i) {
            double d = (float)n + random.nextFloat();
            double d2 = (float)n2 + random.nextFloat();
            d = (float)n3 + random.nextFloat();
            double d3 = 0.0;
            double d4 = 0.0;
            double d5 = 0.0;
            int n4 = random.nextInt(2) * 2 - 1;
            int n5 = random.nextInt(2) * 2 - 1;
            d3 = ((double)random.nextFloat() - 0.5) * 0.125;
            d4 = ((double)random.nextFloat() - 0.5) * 0.125;
            d5 = ((double)random.nextFloat() - 0.5) * 0.125;
            double d6 = (double)n3 + 0.5 + 0.25 * (double)n5;
            d5 = random.nextFloat() * 1.0f * (float)n5;
            double d7 = (double)n + 0.5 + 0.25 * (double)n4;
            d3 = random.nextFloat() * 1.0f * (float)n4;
            class_13342.lllIIIllIIIIlllIlIIllIIll("portal", d7, d2, d6, d3, d4, d5);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
        this.llIIIIllIIIIIIIlIIIlIIIIl = class_08872.lllIIIllIIIIlllIlIIllIIll("obsidian");
    }
}

