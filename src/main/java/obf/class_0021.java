package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.Random;

public class class_0021
extends class_0854 {
    private class_2102[] llllllIlIllllIlIlIlIIIIlI;

    protected class_0021() {
        this.lllIIIllIIIIlllIlIIllIIll(true);
        float f = 0.5f;
        this.lllIIIllIIIIlllIlIIllIIll(0.5f - f, 0.0f, 0.5f - f, 0.5f + f, 0.25f, 0.5f + f);
        this.lllIIIllIIIIlllIlIIllIIll((class_0931)null);
    }

    @Override
    protected boolean IlIllllllIIlIIllllIIlIIIl(Block class_05492) {
        return class_05492 == Blocks.llIllllIIIIIlIIlIlllIIlll;
    }

    @Override
    public boolean lIllllIIlIIIlIllllllIIIll(class_1334 class_13342, int n, int n2, int n3) {
        return this.IlIllllllIIlIIllllIIlIIIl(class_13342.a_(n, n2 - 1, n3));
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Random random) {
        int n4 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        if (n4 < 3 && random.nextInt(10) == 0) {
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, ++n4, 2);
        }
        super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, random);
    }

    @Override
    public class_2102 lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        return n2 >= 3 ? this.llllllIlIllllIlIlIlIIIIlI[2] : (n2 > 0 ? this.llllllIlIllllIlIlIlIIIIlI[1] : this.llllllIlIllllIlIlIlIIIIlI[0]);
    }

    @Override
    public int lIIIIlIlIIlllllIIllIIlIII() {
        return 6;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, int n4, float f, int n5) {
        if (!class_13342.IllIIIIllIIllIllIlllIlIIl) {
            int n6 = 1;
            if (n4 >= 3) {
                n6 = 2 + class_13342.lllllIlllIIllIlIIlIIIllII.nextInt(3);
                if (n5 > 0) {
                    n6 += class_13342.lllllIlllIIllIlIIlIIIllII.nextInt(n5 + 1);
                }
            }
            for (int i = 0; i < n6; ++i) {
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, new ItemStack(Items.IlllIIIlIIlIIIIllllIllllI));
            }
        }
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
    public Item IIIllIIlIIIIIIlIlIIllIIlI(class_1334 class_13342, int n, int n2, int n3) {
        return Items.IlllIIIlIIlIIIIllllIllllI;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
        this.llllllIlIllllIlIlIlIIIIlI = new class_2102[3];
        for (int i = 0; i < this.llllllIlIllllIlIlIlIIIIlI.length; ++i) {
            this.llllllIlIllllIlIlIlIIIIlI[i] = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_stage_" + i);
        }
    }
}

