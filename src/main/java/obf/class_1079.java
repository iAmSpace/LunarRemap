package obf;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1079
extends Item {
    protected class_1971 IIIllIllIIlIlIlIlIllllIIl;

    public class_1079(class_1971 class_19712) {
        this.IIIllIllIIlIlIlIlIllllIIl = class_19712;
        this.lIlllIlllIIIIlIIlllIllIII = 1;
        this.IlIIIIIllllllIIlllIllllll(class_19712.lllIIIllIIIIlllIlIIllIIll());
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.IIIllIllIIlIlIlIlIllllIIl);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, class_0814 class_08142, class_1334 class_13342, int n, int n2, int n3, int n4, float f, float f2, float f3) {
        if (!class_08142.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n4, class_08972)) {
            return false;
        }
        Block class_05492 = class_13342.a_(n, n2, n3);
        if (n4 != 0 && class_13342.a_(n, n2 + 1, n3).lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll && (class_05492 == Blocks.IlIllllllIIlIIllllIIlIIIl || class_05492 == Blocks.lIlllIlllIIIIlIIlllIllIII)) {
            Block class_05493 = Blocks.IIIlIlIllIlllllIlIllllllI;
            class_13342.lllIIIllIIIIlllIlIIllIIll((float)n + 0.5f, (double)((float)n2 + 0.5f), (double)((float)n3 + 0.5f), class_05493.llIIIlllIlllIlIllIIIIllIl.IlIIIIIllllllIIlllIllllll(), (class_05493.llIIIlllIlllIlIllIIIIllIl.IlIllllllIIlIIllllIIlIIIl() + 1.0f) / 2.0f, class_05493.llIIIlllIlllIlIllIIIIllIl.lIlllIlllIIIIlIIlllIllIII() * 0.8f);
            if (class_13342.IllIIIIllIIllIllIlllIlIIl) {
                return true;
            }
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, class_05493);
            class_08972.lllIIIllIIIIlllIlIIllIIll(1, (class_1965)class_08142);
            return true;
        }
        return false;
    }

    @Override
    public boolean IllIIlllllllIIlIIlIIIIlIl() {
        return true;
    }

    public String IlIIIlIIIIllIIIllIIIIIIll() {
        return this.IIIllIllIIlIlIlIlIllllIIl.toString();
    }
}

