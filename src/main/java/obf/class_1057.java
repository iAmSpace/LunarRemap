package obf;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1057
extends Item {
    private Block IIIllIllIIlIlIlIlIllllIIl;

    public class_1057(Block class_05492) {
        this.lIlllIlllIIIIlIIlllIllIII = 1;
        this.IIIllIllIIlIlIlIlIllllIIl = class_05492;
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.lIllllIIlIIIlIllllllIIIll);
    }

    @Override
    public ItemStack lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, class_1334 class_13342, class_0814 class_08142) {
        boolean bl = this.IIIllIllIIlIlIlIlIllllIIl == Blocks.lllIIIllIIIIlllIlIIllIIll;
        class_1112 class_11122 = this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_08142, bl);
        if (class_11122 == null) {
            return class_08972;
        }
        if (class_11122.lllIIIllIIIIlllIlIIllIIll == class_1431.lllIlIIlIIIlIlIIIllIlllIl) {
            int n = class_11122.lllIlIIlIIIlIlIIIllIlllIl;
            int n2 = class_11122.IlIllllllIIlIIllllIIlIIIl;
            int n3 = class_11122.lIlllIlllIIIIlIIlllIllIII;
            if (!class_13342.lllIIIllIIIIlllIlIIllIIll(class_08142, n, n2, n3)) {
                return class_08972;
            }
            if (bl) {
                if (!class_08142.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, class_11122.IlIIIIIllllllIIlllIllllll, class_08972)) {
                    return class_08972;
                }
                class_1855 class_18552 = class_13342.a_(n, n2, n3).lIllllIIlIIIlIllllllIIIll();
                int n4 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
                if (class_18552 == class_1855.IllIIlllllllIIlIIlIIIIlIl && n4 == 0) {
                    class_13342.lIllllIIlIIIlIllllllIIIll(n, n2, n3);
                    return this.lllIIIllIIIIlllIlIIllIIll(class_08972, class_08142, Items.water_bucket);
                }
                if (class_18552 == class_1855.IIIllIllIIlIlIlIlIllllIIl && n4 == 0) {
                    class_13342.lIllllIIlIIIlIllllllIIIll(n, n2, n3);
                    return this.lllIIIllIIIIlllIlIIllIIll(class_08972, class_08142, Items.lava_bucket);
                }
            } else {
                if (this.IIIllIllIIlIlIlIlIllllIIl == Blocks.lllIIIllIIIIlllIlIIllIIll) {
                    return new ItemStack(Items.bucket);
                }
                if (class_11122.IlIIIIIllllllIIlllIllllll == 0) {
                    --n2;
                }
                if (class_11122.IlIIIIIllllllIIlllIllllll == 1) {
                    ++n2;
                }
                if (class_11122.IlIIIIIllllllIIlllIllllll == 2) {
                    --n3;
                }
                if (class_11122.IlIIIIIllllllIIlllIllllll == 3) {
                    ++n3;
                }
                if (class_11122.IlIIIIIllllllIIlllIllllll == 4) {
                    --n;
                }
                if (class_11122.IlIIIIIllllllIIlllIllllll == 5) {
                    ++n;
                }
                if (!class_08142.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, class_11122.IlIIIIIllllllIIlllIllllll, class_08972)) {
                    return class_08972;
                }
                if (this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3) && !class_08142.lIIlIlIlIlIllIIlIIllllIll.lIlllIlllIIIIlIIlllIllIII) {
                    return new ItemStack(Items.bucket);
                }
            }
        }
        return class_08972;
    }

    private ItemStack lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, class_0814 class_08142, Item class_06112) {
        if (class_08142.lIIlIlIlIlIllIIlIIllllIll.lIlllIlllIIIIlIIlllIllIII) {
            return class_08972;
        }
        if (--class_08972.lllIlIIlIIIlIlIIIllIlllIl <= 0) {
            return new ItemStack(class_06112);
        }
        if (!class_08142.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(new ItemStack(class_06112))) {
            class_08142.lllIIIllIIIIlllIlIIllIIll(new ItemStack(class_06112, 1, 0), false);
        }
        return class_08972;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3) {
        boolean bl;
        if (this.IIIllIllIIlIlIlIlIllllIIl == Blocks.lllIIIllIIIIlllIlIIllIIll) {
            return false;
        }
        class_1855 class_18552 = class_13342.a_(n, n2, n3).lIllllIIlIIIlIllllllIIIll();
        boolean bl2 = bl = !class_18552.lllIlIIlIIIlIlIIIllIlllIl();
        if (!class_13342.lIlllIlllIIIIlIIlllIllIII(n, n2, n3) && !bl) {
            return false;
        }
        if (class_13342.IlIlIIlllIIlIllIIIlllllIl.lIllllIIlIIIlIllllllIIIll && this.IIIllIllIIlIlIlIlIllllIIl == Blocks.IIIllIllIIlIlIlIlIllllIIl) {
            class_13342.lllIIIllIIIIlllIlIIllIIll((float)n + 0.5f, (double)((float)n2 + 0.5f), (double)((float)n3 + 0.5f), "random.fizz", 0.5f, 2.6f + (class_13342.lllllIlllIIllIlIIlIIIllII.nextFloat() - class_13342.lllllIlllIIllIlIIlIIIllII.nextFloat()) * 0.8f);
            for (int i = 0; i < 8; ++i) {
                class_13342.lllIIIllIIIIlllIlIIllIIll("largesmoke", (double)n + Math.random(), (double)n2 + Math.random(), (double)n3 + Math.random(), 0.0, 0.0, 0.0);
            }
        } else {
            if (!class_13342.IllIIIIllIIllIllIlllIlIIl && bl && !class_18552.lllIIIllIIIIlllIlIIllIIll()) {
                class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, true);
            }
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, this.IIIllIllIIlIlIlIlIllllIIl, 0, 3);
        }
        return true;
    }
}

