package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;

import java.util.List;
import java.util.Random;

public class class_1865
extends Block {
    private IIcon llllllIlIllllIlIlIlIIIIlI;
    private IIcon lIlIIllllIlIIIIllIIIIlIIl;

    public class_1865() {
        super(class_1855.IlIIIIIllllllIIlllIllllll);
    }

    @Override
    public IIcon lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        return n == 1 ? this.llllllIlIllllIlIlIlIIIIlI : (n == 0 ? Blocks.IlIIIIIIllIIlIllIIllIllIl.lIlllIlllIIIIlIIlllIllIII(n) : this.llIIIIllIIIIIIIlIIIlIIIIl);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
        this.llIIIIllIIIIIIIlIIIlIIIIl = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_side");
        this.llllllIlIllllIlIlIlIIIIlI = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_top");
        this.lIlIIllllIlIIIIllIIIIlIIl = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_eye");
    }

    public IIcon llIlllIIllIlllIlIlIlIIIll() {
        return this.lIlIIllllIlIIIIllIIIIlIIl;
    }

    @Override
    public boolean IlIlllIIIIIIlIIllIIllIlll() {
        return false;
    }

    @Override
    public int lIIIIlIlIIlllllIIllIIlIII() {
        return 26;
    }

    @Override
    public void lIlllIlllIlIIIIlllIlIlIIl() {
        this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, 1.0f, 0.8125f, 1.0f);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_1974 class_19742, List list, class_1521 class_15212) {
        this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, 1.0f, 0.8125f, 1.0f);
        super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_19742, list, class_15212);
        int n4 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        if (class_1865.IllIIlllllllIIlIIlIIIIlIl(n4)) {
            this.lllIIIllIIIIlllIlIIllIIll(0.3125f, 0.8125f, 0.3125f, 0.6875f, 1.0f, 0.6875f);
            super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_19742, list, class_15212);
        }
        this.lIlllIlllIlIIIIlllIlIlIIl();
    }

    public static boolean IllIIlllllllIIlIIlIIIIlIl(int n) {
        return (n & 4) != 0;
    }

    @Override
    public Item lllIIIllIIIIlllIlIIllIIll(int n, Random random, int n2) {
        return null;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_1965 class_19652, ItemStack class_08972) {
        int n4 = ((MathHelper.IlIllllllIIlIIllllIIlIIIl((double)(class_19652.IIIIlIllIlIIlIIlIllIlIlll * 4.0f / 360.0f) + 0.5) & 3) + 2) % 4;
        class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n4, 2);
    }

    @Override
    public boolean IIllIllIIllIIlllIIIlIlllI() {
        return true;
    }

    @Override
    public int lIllllIIlIIIlIllllllIIIll(class_1334 class_13342, int n, int n2, int n3, int n4) {
        int n5 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        return class_1865.IllIIlllllllIIlIIlIIIIlIl(n5) ? 15 : 0;
    }
}

