package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.item.ItemStack;

import java.util.List;

public class class_1804
extends class_0703 {
    private int lllIIIllIIIIlllIlIIllIIll;
    private ItemStack[] lllIlIIlIIIlIlIIIllIlllIl;

    public class_1804() {
    }

    public class_1804(int n, List list) {
        this.lllIIIllIIIIlllIlIIllIIll = n;
        this.lllIlIIlIIIlIlIIIllIlllIl = new ItemStack[list.size()];
        for (int i = 0; i < this.lllIlIIlIIIlIlIIIllIlllIl.length; ++i) {
            ItemStack class_08972 = (ItemStack)list.get(i);
            this.lllIlIIlIIIlIlIIIllIlllIl[i] = class_08972 == null ? null : class_08972.llIIlllIllIllllIIIlIIIIII();
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0181 class_01812) {
        this.lllIIIllIIIIlllIlIIllIIll = class_01812.readUnsignedByte();
        int n = class_01812.readShort();
        this.lllIlIIlIIIlIlIIIllIlllIl = new ItemStack[n];
        for (int i = 0; i < n; ++i) {
            this.lllIlIIlIIIlIlIIIllIlllIl[i] = class_01812.IlIllllllIIlIIllllIIlIIIl();
        }
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0181 class_01812) {
        class_01812.writeByte(this.lllIIIllIIIIlllIlIIllIIll);
        class_01812.writeShort(this.lllIlIIlIIIlIlIIIllIlllIl.length);
        for (ItemStack class_08972 : this.lllIlIIlIIIlIlIIIllIlllIl) {
            class_01812.lllIIIllIIIIlllIlIIllIIll(class_08972);
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0596 class_05962) {
        class_05962.lllIIIllIIIIlllIlIIllIIll(this);
    }

    public int IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public ItemStack[] lIlllIlllIIIIlIIlllIllIII() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_2075 class_20752) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0596)class_20752);
    }
}

