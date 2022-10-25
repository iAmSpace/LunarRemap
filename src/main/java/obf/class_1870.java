package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;
import java.util.Random;

public class class_1870
extends class_2257 {
    private Random llllllIlIllllIlIlIlIIIIlI = new Random();
    private class_2102 lIlIIllllIlIIIIllIIIIlIIl;

    public class_1870() {
        super(class_1855.lIllllIIlIIIlIllllllIIIll);
    }

    @Override
    public boolean IlIlllIIIIIIlIIllIIllIlll() {
        return false;
    }

    @Override
    public int lIIIIlIlIIlllllIIllIIlIII() {
        return 25;
    }

    @Override
    public class_1774 lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n) {
        return new class_0647();
    }

    @Override
    public boolean IllIIIllIIIIlIlIlIllIIlll() {
        return false;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_1974 class_19742, List list, class_1521 class_15212) {
        this.lllIIIllIIIIlllIlIIllIIll(0.4375f, 0.0f, 0.4375f, 0.5625f, 0.875f, 0.5625f);
        super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_19742, list, class_15212);
        this.lIlllIlllIlIIIIlllIlIlIIl();
        super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_19742, list, class_15212);
    }

    @Override
    public void lIlllIlllIlIIIIlllIlIlIIl() {
        this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, 1.0f, 0.125f, 1.0f);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_0814 class_08142, int n4, float f, float f2, float f3) {
        if (class_13342.IllIIIIllIIllIllIlllIlIIl) {
            return true;
        }
        class_0647 class_06472 = (class_0647)class_13342.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3);
        if (class_06472 != null) {
            class_08142.lllIIIllIIIIlllIlIIllIIll(class_06472);
        }
        return true;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_1965 class_19652, ItemStack class_08972) {
        if (class_08972.IlIIIlIIIIllIIIllIIIIIIll()) {
            ((class_0647)class_13342.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3)).lllIIIllIIIIlllIlIIllIIll(class_08972.lIIlIIIIIlIlllIlIIlIlIlll());
        }
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_1334 class_13342, int n, int n2, int n3, Random random) {
        double d = (float)n + 0.4f + random.nextFloat() * 0.2f;
        double d2 = (float)n2 + 0.7f + random.nextFloat() * 0.3f;
        double d3 = (float)n3 + 0.4f + random.nextFloat() * 0.2f;
        class_13342.lllIIIllIIIIlllIlIIllIIll("smoke", d, d2, d3, 0.0, 0.0, 0.0);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Block class_05492, int n4) {
        class_1774 class_17742 = class_13342.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3);
        if (class_17742 instanceof class_0647) {
            class_0647 class_06472 = (class_0647)class_17742;
            for (int i = 0; i < class_06472.IlIIIIIllllllIIlllIllllll(); ++i) {
                ItemStack class_08972 = class_06472.llIIllIllIlIIlIIllIllllll(i);
                if (class_08972 == null) continue;
                float f = this.llllllIlIllllIlIlIlIIIIlI.nextFloat() * 0.8f + 0.1f;
                float f2 = this.llllllIlIllllIlIlIlIIIIlI.nextFloat() * 0.8f + 0.1f;
                float f3 = this.llllllIlIllllIlIlIlIIIIlI.nextFloat() * 0.8f + 0.1f;
                while (class_08972.lllIlIIlIIIlIlIIIllIlllIl > 0) {
                    int n5 = this.llllllIlIllllIlIlIlIIIIlI.nextInt(21) + 10;
                    if (n5 > class_08972.lllIlIIlIIIlIlIIIllIlllIl) {
                        n5 = class_08972.lllIlIIlIIIlIlIIIllIlllIl;
                    }
                    class_08972.lllIlIIlIIIlIlIIIllIlllIl -= n5;
                    class_1781 class_17812 = new class_1781(class_13342, (float)n + f, (float)n2 + f2, (float)n3 + f3, new ItemStack(class_08972.lllIIIllIIIIlllIlIIllIIll(), n5, class_08972.IllIIIllIIIIlIlIlIllIIlll()));
                    float f4 = 0.05f;
                    class_17812.IIIIIIIIlIllIIllIIlllIllI = (float)this.llllllIlIllllIlIlIlIIIIlI.nextGaussian() * f4;
                    class_17812.IIlIIlIlIlIllIIlIlIIIIlll = (float)this.llllllIlIllllIlIlIlIIIIlI.nextGaussian() * f4 + 0.2f;
                    class_17812.llIIIlllIlllIlIllIIIIllIl = (float)this.llllllIlIllllIlIlIlIIIIlI.nextGaussian() * f4;
                    class_13342.lllIIIllIIIIlllIlIIllIIll(class_17812);
                }
            }
        }
        super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_05492, n4);
    }

    @Override
    public Item lllIIIllIIIIlllIlIIllIIll(int n, Random random, int n2) {
        return Items.IlIIllIIIlIlIlIIlIlIllIIl;
    }

    @Override
    public Item IIIllIIlIIIIIIlIlIIllIIlI(class_1334 class_13342, int n, int n2, int n3) {
        return Items.IlIIllIIIlIlIlIIlIlIllIIl;
    }

    @Override
    public boolean IIllIllIIllIIlllIIIlIlllI() {
        return true;
    }

    @Override
    public int lIllllIIlIIIlIllllllIIIll(class_1334 class_13342, int n, int n2, int n3, int n4) {
        return class_1071.lllIlIIlIIIlIlIIIllIlllIl((class_0850)((Object)class_13342.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3)));
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
        super.lllIIIllIIIIlllIlIIllIIll(class_08872);
        this.lIlIIllllIlIIIIllIIIIlIIl = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_base");
    }

    public class_2102 llIlllIIllIlllIlIlIlIIIll() {
        return this.lIlIIllllIlIIIIllIIIIlIIl;
    }
}

