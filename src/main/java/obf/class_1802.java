package obf;

import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1802
extends class_0003 {
    public class_1802(class_1334 class_13342) {
        super(class_13342);
        this.IlIIIIIllllllIIlllIllllll(0.9f, 1.3f);
        this.IllIIIIllIIllIllIlllIlIIl().lllIIIllIIIIlllIlIIllIIll(true);
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(0, new class_0866(this));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(1, new class_0826(this, 2.0));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(2, new class_0303(this, 1.0));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(3, new class_1801(this, 1.25, Items.wheat, false));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(4, new class_1954(this, 1.25));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(5, new class_0454(this, 1.0));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(6, new class_0235(this, class_0814.class, 6.0f));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(7, new class_0558(this));
    }

    @Override
    public boolean IIIIlllIIlIllllllIllIIlll() {
        return true;
    }

    @Override
    protected void llIIlIllIllllIlIIIIlIIlll() {
        super.llIIlIllIllllIlIIIIlIIlll();
        this.lllIIIllIIIIlllIlIIllIIll(class_1152.lllIIIllIIIIlllIlIIllIIll).lllIIIllIIIIlllIlIIllIIll(10.0);
        this.lllIIIllIIIIlllIlIIllIIll(class_1152.lIlllIlllIIIIlIIlllIllIII).lllIIIllIIIIlllIlIIllIIll(0.2f);
    }

    @Override
    protected String lllllllIlIIlIlIIIlIlIIlll() {
        return "mob.cow.say";
    }

    @Override
    protected String lIIlIlllIIlllIIlllIIlIlII() {
        return "mob.cow.hurt";
    }

    @Override
    protected String lIIlIIIlIlIIlllIlIllIllIl() {
        return "mob.cow.hurt";
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, Block class_05492) {
        this.lllIIIllIIIIlllIlIIllIIll("mob.cow.step", 0.15f, 1.0f);
    }

    @Override
    protected float IIlIlIIIIlIlllIlIlIIIIIlI() {
        return 0.4f;
    }

    @Override
    protected Item llIllllIIIIIlIIlIlllIIlll() {
        return Items.leather;
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(boolean bl, int n) {
        int n2;
        int n3 = this.IlllIIlllllllIIllIlIllllI.nextInt(3) + this.IlllIIlllllllIIllIlIllllI.nextInt(1 + n);
        for (n2 = 0; n2 < n3; ++n2) {
            this.lllIIIllIIIIlllIlIIllIIll(Items.leather, 1);
        }
        n3 = this.IlllIIlllllllIIllIlIllllI.nextInt(3) + 1 + this.IlllIIlllllllIIllIlIllllI.nextInt(1 + n);
        for (n2 = 0; n2 < n3; ++n2) {
            if (this.llIIIIIlIIlIIIIllIIIlIIII()) {
                this.lllIIIllIIIIlllIlIIllIIll(Items.IIIlIIllIIlIlIIlIIllIIIIl, 1);
                continue;
            }
            this.lllIIIllIIIIlllIlIIllIIll(Items.lIIlIlllIIlIIIIlIlIIIIlll, 1);
        }
    }

    @Override
    public boolean lIlllIlllIIIIlIIlllIllIII(class_0814 class_08142) {
        ItemStack class_08972 = class_08142.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll();
        if (class_08972 != null && class_08972.lllIIIllIIIIlllIlIIllIIll() == Items.bucket && !class_08142.lIIlIlIlIlIllIIlIIllllIll.lIlllIlllIIIIlIIlllIllIII) {
            if (class_08972.lllIlIIlIIIlIlIIIllIlllIl-- == 1) {
                class_08142.lllIIlIIIllllllIIIIlIlIlI.lllIlIIlIIIlIlIIIllIlllIl(class_08142.lllIIlIIIllllllIIIIlIlIlI.IlIllllllIIlIIllllIIlIIIl, new ItemStack(Items.lIIIIllIIllIIIlIIIllIllII));
            } else if (!class_08142.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Items.lIIIIllIIllIIIlIIIllIllII))) {
                class_08142.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Items.lIIIIllIIllIIIlIIIllIllII, 1, 0), false);
            }
            return true;
        }
        return super.lIlllIlllIIIIlIIlllIllIII(class_08142);
    }

    public class_1802 lllIlIIlIIIlIlIIIllIlllIl(class_0650 class_06502) {
        return new class_1802(this.lIlIllIIlIIlIIlIIlIIlIIll);
    }

    @Override
    public /* synthetic */ class_0650 lllIIIllIIIIlllIlIIllIIll(class_0650 class_06502) {
        return this.lllIlIIlIIIlIlIIIllIlllIl(class_06502);
    }
}

