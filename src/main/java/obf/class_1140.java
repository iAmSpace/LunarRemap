package obf;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1140
extends Item {
    public class_1140() {
        this.lIlllIlllIIIIlIIlllIllIII = 16;
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.IlIllllllIIlIIllllIIlIIIl);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, class_0814 class_08142, class_1334 class_13342, int n, int n2, int n3, int n4, float f, float f2, float f3) {
        if (n4 == 0) {
            return false;
        }
        if (!class_13342.a_(n, n2, n3).lIllllIIlIIIlIllllllIIIll().lllIlIIlIIIlIlIIIllIlllIl()) {
            return false;
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
        if (!class_08142.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n4, class_08972)) {
            return false;
        }
        if (!Blocks.IlIlIllIIlIIIIlllIlIllIlI.IlIIIIIllllllIIlllIllllll(class_13342, n, n2, n3)) {
            return false;
        }
        if (class_13342.IllIIIIllIIllIllIlllIlIIl) {
            return true;
        }
        if (n4 == 1) {
            int n5 = MathHelper.IlIllllllIIlIIllllIIlIIIl((double)((class_08142.IIIIlIllIlIIlIIlIllIlIlll + 180.0f) * 16.0f / 360.0f) + 0.5) & 0xF;
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, Blocks.IlIlIllIIlIIIIlllIlIllIlI, n5, 3);
        } else {
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, Blocks.lIIlIIlIllIlIIlIlIIlIlIlI, n4, 3);
        }
        --class_08972.lllIlIIlIIIlIlIIIllIlllIl;
        class_2219 class_22192 = (class_2219)class_13342.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3);
        if (class_22192 != null) {
            class_08142.lllIIIllIIIIlllIlIIllIIll(class_22192);
        }
        return true;
    }
}

