package obf;

import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0761
extends class_2257 {
    private IIcon llllllIlIllllIlIlIlIIIIlI;

    protected class_0761() {
        super(class_1855.lIlllIlllIIIIlIIlllIllIII);
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.IlIllllllIIlIIllllIIlIIIl);
    }

    @Override
    public IIcon lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        return n == 1 ? this.llllllIlIllllIlIlIlIIIIlI : this.llIIIIllIIIIIIIlIIIlIIIIl;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_0814 class_08142, int n4, float f, float f2, float f3) {
        if (class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3) == 0) {
            return false;
        }
        this.IllIIIllIIIIlIlIlIllIIlll(class_13342, n, n2, n3);
        return true;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(class_1334 class_13342, int n, int n2, int n3, ItemStack class_08972) {
        class_2195 class_21952;
        if (!class_13342.IllIIIIllIIllIllIlllIlIIl && (class_21952 = (class_2195)class_13342.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3)) != null) {
            class_21952.lllIIIllIIIIlllIlIIllIIll(class_08972.llIIlllIllIllllIIIlIIIIII());
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, 1, 2);
        }
    }

    public void IllIIIllIIIIlIlIlIllIIlll(class_1334 class_13342, int n, int n2, int n3) {
        ItemStack class_08972;
        class_2195 class_21952;
        if (!class_13342.IllIIIIllIIllIllIlllIlIIl && (class_21952 = (class_2195)class_13342.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3)) != null && (class_08972 = class_21952.lllIIIllIIIIlllIlIIllIIll()) != null) {
            class_13342.IlIllllllIIlIIllllIIlIIIl(1005, n, n2, n3, 0);
            class_13342.lllIIIllIIIIlllIlIIllIIll((String)null, n, n2, n3);
            class_21952.lllIIIllIIIIlllIlIIllIIll((ItemStack)null);
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, 0, 2);
            float f = 0.7f;
            double d = (double)(class_13342.lllllIlllIIllIlIIlIIIllII.nextFloat() * f) + (double)(1.0f - f) * 0.5;
            double d2 = (double)(class_13342.lllllIlllIIllIlIIlIIIllII.nextFloat() * f) + (double)(1.0f - f) * 0.2 + 0.6;
            double d3 = (double)(class_13342.lllllIlllIIllIlIIlIIIllII.nextFloat() * f) + (double)(1.0f - f) * 0.5;
            ItemStack class_08973 = class_08972.llIIlllIllIllllIIIlIIIIII();
            class_1781 class_17812 = new class_1781(class_13342, (double)n + d, (double)n2 + d2, (double)n3 + d3, class_08973);
            class_17812.lllIlIIlIIIlIlIIIllIlllIl = 10;
            class_13342.lllIIIllIIIIlllIlIIllIIll(class_17812);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Block class_05492, int n4) {
        this.IllIIIllIIIIlIlIlIllIIlll(class_13342, n, n2, n3);
        super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_05492, n4);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, int n4, float f, int n5) {
        if (!class_13342.IllIIIIllIIllIllIlllIlIIl) {
            super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, n4, f, 0);
        }
    }

    @Override
    public class_1774 lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n) {
        return new class_2195();
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
        this.llIIIIllIIIIIIIlIIIlIIIIl = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_side");
        this.llllllIlIllllIlIlIlIIIIlI = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_top");
    }

    @Override
    public boolean IIllIllIIllIIlllIIIlIlllI() {
        return true;
    }

    @Override
    public int lIllllIIlIIIlIllllllIIIll(class_1334 class_13342, int n, int n2, int n3, int n4) {
        ItemStack class_08972 = ((class_2195)class_13342.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3)).lllIIIllIIIIlllIlIIllIIll();
        return class_08972 == null ? 0 : Item.lllIIIllIIIIlllIlIIllIIll(class_08972.lllIIIllIIIIlllIlIIllIIll()) + 1 - Item.lllIIIllIIIIlllIlIIllIIll(Items.IIllllllIIllIlIllllIIIlll);
    }
}

