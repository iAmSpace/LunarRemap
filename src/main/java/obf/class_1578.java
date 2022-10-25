package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Multimap
 */
import com.google.common.collect.Multimap;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.Set;

public class class_1578
extends Item {
    private Set lIIIIlIlIIlllllIIllIIlIII;
    protected float IIIllIllIIlIlIlIlIllllIIl = 4.0f;
    private float llIIlllIllIllllIIIlIIIIII;
    protected class_1971 IllIIIllIIIIlIlIlIllIIlll;

    protected class_1578(float f, class_1971 class_19712, Set set) {
        this.IllIIIllIIIIlIlIlIllIIlll = class_19712;
        this.lIIIIlIlIIlllllIIllIIlIII = set;
        this.lIlllIlllIIIIlIIlllIllIII = 1;
        this.IlIIIIIllllllIIlllIllllll(class_19712.lllIIIllIIIIlllIlIIllIIll());
        this.IIIllIllIIlIlIlIlIllllIIl = class_19712.lllIlIIlIIIlIlIIIllIlllIl();
        this.llIIlllIllIllllIIIlIIIIII = f + class_19712.IlIllllllIIlIIllllIIlIIIl();
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.IIIllIllIIlIlIlIlIllllIIl);
    }

    @Override
    public float lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, Block class_05492) {
        return this.lIIIIlIlIIlllllIIllIIlIII.contains(class_05492) ? this.IIIllIllIIlIlIlIlIllllIIl : 1.0f;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, class_1965 class_19652, class_1965 class_19653) {
        class_08972.lllIIIllIIIIlllIlIIllIIll(2, class_19653);
        return true;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, class_1334 class_13342, Block class_05492, int n, int n2, int n3, class_1965 class_19652) {
        if ((double)class_05492.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3) != 0.0) {
            class_08972.lllIIIllIIIIlllIlIIllIIll(1, class_19652);
        }
        return true;
    }

    @Override
    public boolean IllIIlllllllIIlIIlIIIIlIl() {
        return true;
    }

    public class_1971 IlIIIlIIIIllIIIllIIIIIIll() {
        return this.IllIIIllIIIIlIlIlIllIIlll;
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
        multimap.put((Object)class_1152.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(), (Object)new class_1256(lllIlIIlIIIlIlIIIllIlllIl, "Tool modifier", this.llIIlllIllIllllIIIlIIIIII, 0));
        return multimap;
    }
}

