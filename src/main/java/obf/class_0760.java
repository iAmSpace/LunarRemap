package obf;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0760
extends Item {
    private class_1855 IIIllIllIIlIlIlIlIllllIIl;

    public class_0760(class_1855 class_18552) {
        this.IIIllIllIIlIlIlIlIllllIIl = class_18552;
        this.lIlllIlllIIIIlIIlllIllIII = 1;
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.lIlllIlllIIIIlIIlllIllIII);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, class_0814 class_08142, class_1334 class_13342, int n, int n2, int n3, int n4, float f, float f2, float f3) {
        if (n4 != 1) {
            return false;
        }
        Block class_05492 = this.IIIllIllIIlIlIlIlIllllIIl == class_1855.lIlllIlllIIIIlIIlllIllIII ? Blocks.IlIIllIlIlIllIIIlIIlIlIIl : Blocks.IlIIIIIllIlllIIIIlIIIllIl;
        if (class_08142.lllIIIllIIIIlllIlIIllIIll(n, ++n2, n3, n4, class_08972) && class_08142.lllIIIllIIIIlllIlIIllIIll(n, n2 + 1, n3, n4, class_08972)) {
            if (!class_05492.IlIIIIIllllllIIlllIllllll(class_13342, n, n2, n3)) {
                return false;
            }
            int n5 = MathHelper.IlIllllllIIlIIllllIIlIIIl((double)((class_08142.IIIIlIllIlIIlIIlIllIlIlll + 180.0f) * 4.0f / 360.0f) - 0.5) & 3;
            class_0760.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, n5, class_05492);
            --class_08972.lllIlIIlIIIlIlIIIllIlllIl;
            return true;
        }
        return false;
    }

    public static void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, int n4, Block class_05492) {
        int n5 = 0;
        int n6 = 0;
        if (n4 == 0) {
            n6 = 1;
        }
        if (n4 == 1) {
            n5 = -1;
        }
        if (n4 == 2) {
            n6 = -1;
        }
        if (n4 == 3) {
            n5 = 1;
        }
        int n7 = (class_13342.a_(n - n5, n2, n3 - n6).IIIllIllIIlIlIlIlIllllIIl() ? 1 : 0) + (class_13342.a_(n - n5, n2 + 1, n3 - n6).IIIllIllIIlIlIlIlIllllIIl() ? 1 : 0);
        int n8 = (class_13342.a_(n + n5, n2, n3 + n6).IIIllIllIIlIlIlIlIllllIIl() ? 1 : 0) + (class_13342.a_(n + n5, n2 + 1, n3 + n6).IIIllIllIIlIlIlIlIllllIIl() ? 1 : 0);
        boolean bl = class_13342.a_(n - n5, n2, n3 - n6) == class_05492 || class_13342.a_(n - n5, n2 + 1, n3 - n6) == class_05492;
        boolean bl2 = class_13342.a_(n + n5, n2, n3 + n6) == class_05492 || class_13342.a_(n + n5, n2 + 1, n3 + n6) == class_05492;
        boolean bl3 = false;
        if (bl && !bl2) {
            bl3 = true;
        } else if (n8 > n7) {
            bl3 = true;
        }
        class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, class_05492, n4, 2);
        class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2 + 1, n3, class_05492, 8 | (bl3 ? 1 : 0), 2);
        class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3, class_05492);
        class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2 + 1, n3, class_05492);
    }
}

