package obf;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1934
extends Item {
    private Block IIIllIllIIlIlIlIlIllllIIl;

    public class_1934(Block class_05492) {
        this.IIIllIllIIlIlIlIlIllllIIl = class_05492;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, class_0814 class_08142, class_1334 class_13342, int n, int n2, int n3, int n4, float f, float f2, float f3) {
        int n5;
        Block class_05492 = class_13342.a_(n, n2, n3);
        if (class_05492 == Blocks.lIIllIIlIIIlllIlllIIlIIlI && (class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3) & 7) < 1) {
            n4 = 1;
        } else if (class_05492 != Blocks.lIIlIlllIIlIIIIlIlIIIIlll && class_05492 != Blocks.IlIlIIlllIllllllllIIIlIlI && class_05492 != Blocks.llllIIIIlIIIlIIIIIIlIllll) {
            if (n4 == 0) {
                --n2;
            }
            if (n4 == 1) {
                ++n2;
            }
            if (n4 == 2) {
                --n3;
            }
            if (n4 == 3) {
                ++n3;
            }
            if (n4 == 4) {
                --n;
            }
            if (n4 == 5) {
                ++n;
            }
        }
        if (!class_08142.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n4, class_08972)) {
            return false;
        }
        if (class_08972.lllIlIIlIIIlIlIIIllIlllIl == 0) {
            return false;
        }
        if (class_13342.lllIIIllIIIIlllIlIIllIIll(this.IIIllIllIIlIlIlIlIllllIIl, n, n2, n3, false, n4, null, class_08972) && class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, this.IIIllIllIIlIlIlIlIllllIIl, n5 = this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, n4, f, f2, f3, 0), 3)) {
            if (class_13342.a_(n, n2, n3) == this.IIIllIllIIlIlIlIlIllllIIl) {
                this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_08142, class_08972);
                this.IIIllIllIIlIlIlIlIllllIIl.lIlllIlllIIIIlIIlllIllIII(class_13342, n, n2, n3, n5);
            }
            class_13342.lllIIIllIIIIlllIlIIllIIll((float)n + 0.5f, (double)((float)n2 + 0.5f), (double)((float)n3 + 0.5f), this.IIIllIllIIlIlIlIlIllllIIl.llIIIlllIlllIlIllIIIIllIl.lllIlIIlIIIlIlIIIllIlllIl(), (this.IIIllIllIIlIlIlIlIllllIIl.llIIIlllIlllIlIllIIIIllIl.IlIllllllIIlIIllllIIlIIIl() + 1.0f) / 2.0f, this.IIIllIllIIlIlIlIlIllllIIl.llIIIlllIlllIlIllIIIIllIl.lIlllIlllIIIIlIIlllIllIII() * 0.8f);
            --class_08972.lllIlIIlIIIlIlIIIllIlllIl;
        }
        return true;
    }
}

