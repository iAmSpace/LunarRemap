package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Multimap
 */
import com.google.common.collect.Multimap;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class class_1531
extends Item {
    private float IIIllIllIIlIlIlIlIllllIIl;
    private final class_1971 IllIIIllIIIIlIlIlIllIIlll;

    public class_1531(class_1971 class_19712) {
        this.IllIIIllIIIIlIlIlIllIIlll = class_19712;
        this.lIlllIlllIIIIlIIlllIllIII = 1;
        this.IlIIIIIllllllIIlllIllllll(class_19712.lllIIIllIIIIlllIlIIllIIll());
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.IllIIIllIIIIlIlIlIllIIlll);
        this.IIIllIllIIlIlIlIlIllllIIl = 4.0f + class_19712.IlIllllllIIlIIllllIIlIIIl();
    }

    public float IlIIIlIIIIllIIIllIIIIIIll() {
        return this.IllIIIllIIIIlIlIlIllIIlll.IlIllllllIIlIIllllIIlIIIl();
    }

    @Override
    public float lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, Block class_05492) {
        if (class_05492 == Blocks.IIIIlIllIlIIlIIlIllIlIlll) {
            return 15.0f;
        }
        class_1855 class_18552 = class_05492.lIllllIIlIIIlIllllllIIIll();
        return class_18552 != class_1855.lIIIIlIlIIlllllIIllIIlIII && class_18552 != class_1855.llIIlllIllIllllIIIlIIIIII && class_18552 != class_1855.IIlllIlIlllIllIIIlllIIlIl && class_18552 != class_1855.IllIIIllIIIIlIlIlIllIIlll && class_18552 != class_1855.IllIIIIllIIllIllIlllIlIIl ? 1.0f : 1.5f;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, class_1965 class_19652, class_1965 class_19653) {
        class_08972.lllIIIllIIIIlllIlIIllIIll(1, class_19653);
        return true;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, class_1334 class_13342, Block class_05492, int n, int n2, int n3, class_1965 class_19652) {
        if ((double)class_05492.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3) != 0.0) {
            class_08972.lllIIIllIIIIlllIlIIllIIll(2, class_19652);
        }
        return true;
    }

    @Override
    public boolean IllIIlllllllIIlIIlIIIIlIl() {
        return true;
    }

    @Override
    public class_1484 IlIIIIIllllllIIlllIllllll(ItemStack class_08972) {
        return class_1484.lIlllIlllIIIIlIIlllIllIII;
    }

    @Override
    public int lIllllIIlIIIlIllllllIIIll(ItemStack class_08972) {
        return 72000;
    }

    @Override
    public ItemStack lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, class_1334 class_13342, class_0814 class_08142) {
        class_08142.IlIllllllIIlIIllllIIlIIIl(class_08972, this.lIllllIIlIIIlIllllllIIIll(class_08972));
        return class_08972;
    }

    @Override
    public boolean lllIlIIlIIIlIlIIIllIlllIl(Block class_05492) {
        return class_05492 == Blocks.IIIIlIllIlIIlIIlIllIlIlll;
    }

    @Override
    public int IlIlllIIIIIIlIIllIIllIlll() {
        return this.IllIIIllIIIIlIlIlIllIIlll.IlIIIIIllllllIIlllIllllll();
    }

    public String IIlllIlIlllIllIIIlllIIlIl() {
        return this.IllIIIllIIIIlIlIlIllIIlll.toString();
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, ItemStack class_08973) {
        return this.IllIIIllIIIIlIlIlIllIIlll.lIllllIIlIIIlIllllllIIIll() == class_08973.lllIIIllIIIIlllIlIIllIIll() ? true : super.lllIIIllIIIIlllIlIIllIIll(class_08972, class_08973);
    }

    @Override
    public Multimap lIIlIIIIIlIlllIlIIlIlIlll() {
        Multimap multimap = super.lIIlIIIIIlIlllIlIIlIlIlll();
        multimap.put((Object)class_1152.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(), (Object)new class_1256(lllIlIIlIIIlIlIIIllIlllIl, "Weapon modifier", this.IIIllIllIIlIlIlIlIllllIIl, 0));
        return multimap;
    }
}

