package obf;

import net.minecraft.init.Items;
import net.minecraft.item.Item;

/*
 * Decompiled with CFR 0.150.
 */
public class class_2070
extends class_0435 {
    private class_2102[] llllllIlIllllIlIlIlIIIIlI;

    @Override
    public class_2102 lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
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
        return Items.lIlIllllIlIIIIIllIIIIlIlI;
    }

    @Override
    protected Item IIIIlIIlIIIllIIIIllIIIlII() {
        return Items.lIlIllllIlIIIIIllIIIIlIlI;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
        this.llllllIlIllllIlIlIlIIIIlI = new class_2102[4];
        for (int i = 0; i < this.llllllIlIllllIlIlIlIIIIlI.length; ++i) {
            this.llllllIlIllllIlIlIlIIIIlI[i] = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_stage_" + i);
        }
    }
}

