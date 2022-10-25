package obf;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1584
extends class_1802 {
    public class_1584(class_1334 class_13342) {
        super(class_13342);
        this.IlIIIIIllllllIIlllIllllll(0.9f, 1.3f);
    }

    @Override
    public boolean lIlllIlllIIIIlIIlllIllIII(class_0814 class_08142) {
        ItemStack class_08972 = class_08142.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll();
        if (class_08972 != null && class_08972.lllIIIllIIIIlllIlIIllIIll() == Items.lIlllIlllIlIIIIlllIlIlIIl && this.u_() >= 0) {
            if (class_08972.lllIlIIlIIIlIlIIIllIlllIl == 1) {
                class_08142.lllIIlIIIllllllIIIIlIlIlI.lllIlIIlIIIlIlIIIllIlllIl(class_08142.lllIIlIIIllllllIIIIlIlIlI.IlIllllllIIlIIllllIIlIIIl, new ItemStack(Items.IlIIlllllIIlIlIlllllIllll));
                return true;
            }
            if (class_08142.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Items.IlIIlllllIIlIlIlllllIllll)) && !class_08142.lIIlIlIlIlIllIIlIIllllIll.lIlllIlllIIIIlIIlllIllIII) {
                class_08142.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(class_08142.lllIIlIIIllllllIIIIlIlIlI.IlIllllllIIlIIllllIIlIIIl, 1);
                return true;
            }
        }
        if (class_08972 != null && class_08972.lllIIIllIIIIlllIlIIllIIll() == Items.llllIIllllIllIlllllIIlIlI && this.u_() >= 0) {
            this.IIIIlIIlIIIllIIIIllIIIlII();
            this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll("largeexplode", this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI + (double)(this.lllIIIIlIlIIlIIlllIIIIIIl / 2.0f), this.IllIIIIllIIllIllIlllIlIIl, 0.0, 0.0, 0.0);
            if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
                class_1802 class_18022 = new class_1802(this.lIlIllIIlIIlIIlIIlIIlIIll);
                class_18022.lllIlIIlIIIlIlIIIllIlllIl(this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI, this.IllIIIIllIIllIllIlllIlIIl, this.IIIIlIllIlIIlIIlIllIlIlll, this.IlIlIIlllIllllllllIIIlIlI);
                class_18022.IllIIIllIIIIlIlIlIllIIlll(this.lllIIIlllIlllIIlIllllIIlI());
                class_18022.lllllIllllIIIIllIIlIlIlII = this.lllllIllllIIIIllIIlIlIlII;
                this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(class_18022);
                for (int i = 0; i < 5; ++i) {
                    this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(new class_1781(this.lIlIllIIlIIlIIlIIlIIlIIll, this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI + (double)this.lllIIIIlIlIIlIIlllIIIIIIl, this.IllIIIIllIIllIllIlllIlIIl, new ItemStack(Blocks.llIIlIIllIIllIlIIllIIllII)));
                }
                class_08972.lllIIIllIIIIlllIlIIllIIll(1, (class_1965)class_08142);
                this.lllIIIllIIIIlllIlIIllIIll("mob.sheep.shear", 1.0f, 1.0f);
            }
            return true;
        }
        return super.lIlllIlllIIIIlIIlllIllIII(class_08142);
    }

    public class_1584 IlIllllllIIlIIllllIIlIIIl(class_0650 class_06502) {
        return new class_1584(this.lIlIllIIlIIlIIlIIlIIlIIll);
    }

    @Override
    public /* synthetic */ class_1802 lllIlIIlIIIlIlIIIllIlllIl(class_0650 class_06502) {
        return this.IlIllllllIIlIIllllIIlIIIl(class_06502);
    }

    @Override
    public /* synthetic */ class_0650 lllIIIllIIIIlllIlIIllIIll(class_0650 class_06502) {
        return this.IlIllllllIIlIIllllIIlIIIl(class_06502);
    }
}

