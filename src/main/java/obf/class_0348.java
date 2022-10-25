package obf;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0348
extends class_0435 {
    private IIcon[] llllllIlIllllIlIlIlIIIIlI;

    @Override
    public IIcon lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        if (n2 < 7) {
            if (n2 == 6) {
                n2 = 5;
            }
            return this.llllllIlIllllIlIlIlIIIIlI[n2 >> 1];
        }
        return this.llllllIlIllllIlIlIlIIIIlI[3];
    }

    @Override
    protected Item llIlllIIllIlllIlIlIlIIIll() {
        return Items.IIlllllIIlIIlIlIIlIIlIlII;
    }

    @Override
    protected Item IIIIlIIlIIIllIIIIllIIIlII() {
        return Items.IIlllllIIlIIlIlIIlIIlIlII;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, int n4, float f, int n5) {
        super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, n4, f, n5);
        if (!class_13342.IllIIIIllIIllIllIlllIlIIl && n4 >= 7 && class_13342.lllllIlllIIllIlIIlIIIllII.nextInt(50) == 0) {
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, new ItemStack(Items.IlIlIIllIlIlIIIIIlIlllllI));
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
        this.llllllIlIllllIlIlIlIIIIlI = new IIcon[4];
        for (int i = 0; i < this.llllllIlIllllIlIlIlIIIIlI.length; ++i) {
            this.llllllIlIllllIlIlIlIIIIlI[i] = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_stage_" + i);
        }
    }
}

