package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class class_0306
extends Item {
    private static final Map IllIIIllIIIIlIlIlIllIIlll = new HashMap();
    public final String IIIllIllIIlIlIlIlIllllIIl;

    protected class_0306(String string) {
        this.IIIllIllIIlIlIlIlIllllIIl = string;
        this.lIlllIlllIIIIlIIlllIllIII = 1;
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.lIllllIIlIIIlIllllllIIIll);
        IllIIIllIIIIlIlIlIllIIlll.put(string, this);
    }

    @Override
    public IIcon IlIllllllIIlIIllllIIlIIIl(int n) {
        return this.IIIllIIlIIIIIIlIlIIllIIlI;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, class_0814 class_08142, class_1334 class_13342, int n, int n2, int n3, int n4, float f, float f2, float f3) {
        if (class_13342.a_(n, n2, n3) == Blocks.IlIIlIIlllllIlIIlIlIlIlIl && class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3) == 0) {
            if (class_13342.IllIIIIllIIllIllIlllIlIIl) {
                return true;
            }
            ((class_0761) Blocks.IlIIlIIlllllIlIIlIlIlIlIl).lllIlIIlIIIlIlIIIllIlllIl(class_13342, n, n2, n3, class_08972);
            class_13342.lllIIIllIIIIlllIlIIllIIll(null, 1005, n, n2, n3, Item.lllIIIllIIIIlllIlIIllIIll(this));
            --class_08972.lllIlIIlIIIlIlIIIllIlllIl;
            return true;
        }
        return false;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, class_0814 class_08142, List list, boolean bl) {
        list.add(this.IlIIIlIIIIllIIIllIIIIIIll());
    }

    public String IlIIIlIIIIllIIIllIIIIIIll() {
        return class_1586.lllIIIllIIIIlllIlIIllIIll("item.record." + this.IIIllIllIIlIlIlIlIllllIIl + ".desc");
    }

    @Override
    public EnumRarity lIIIIlIlIIlllllIIllIIlIII(ItemStack class_08972) {
        return EnumRarity.rare;
    }

    public static class_0306 lIlllIlllIIIIlIIlllIllIII(String string) {
        return (class_0306)IllIIIllIIIIlIlIlIllIIlll.get(string);
    }
}

