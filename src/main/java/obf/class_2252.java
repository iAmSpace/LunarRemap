package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

import java.util.List;

public class class_2252
extends class_2178
implements class_1212 {
    private boolean lllIIIllIIIIlllIlIIllIIll = true;
    private int lllIlIIlIIIlIlIIIllIlllIl = -1;

    public class_2252(class_1334 class_13342) {
        super(class_13342);
    }

    public class_2252(class_1334 class_13342, double d, double d2, double d3) {
        super(class_13342, d, d2, d3);
    }

    @Override
    public int IlIllllllIIlIIllllIIlIIIl() {
        return 5;
    }

    @Override
    public Block lIlllIlllIIIIlIIlllIllIII() {
        return Blocks.llllIllllllIllIIIlIlIIllI;
    }

    @Override
    public int lIlIlIIlIIIIlIIIIIlllIIII() {
        return 1;
    }

    @Override
    public int IlIIIIIllllllIIlllIllllll() {
        return 5;
    }

    @Override
    public boolean b_(class_0814 class_08142) {
        if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
            class_08142.lllIIIllIIIIlllIlIIllIIll(this);
        }
        return true;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, boolean bl) {
        boolean bl2;
        boolean bl3 = bl2 = !bl;
        if (bl2 != this.IllIIIIllIIllIllIlllIlIIl()) {
            this.IlIllllllIIlIIllllIIlIIIl(bl2);
        }
    }

    public boolean IllIIIIllIIllIllIlllIlIIl() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public void IlIllllllIIlIIllllIIlIIIl(boolean bl) {
        this.lllIIIllIIIIlllIlIIllIIll = bl;
    }

    @Override
    public class_1334 IIIIIIIIlIllIIllIIlllIllI() {
        return this.lIlIllIIlIIlIIlIIlIIlIIll;
    }

    @Override
    public double llIIIlllIlllIlIllIIIIllIl() {
        return this.IlIIlllllIIlIlIlllllIllll;
    }

    @Override
    public double IIIIlIllIlIIlIIlIllIlIlll() {
        return this.llIIlIlIlllIIllIlIlllIllI;
    }

    @Override
    public double IlIlIIlllIllllllllIIIlIlI() {
        return this.IllIIIIllIIllIllIlllIlIIl;
    }

    @Override
    public void s_() {
        super.s_();
        if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl && this.IlllIIlllllllIIllIlIllllI() && this.IllIIIIllIIllIllIlllIlIIl()) {
            --this.lllIlIIlIIIlIlIIIllIlllIl;
            if (!this.lIlIIIllIIllIIlIllllllIll()) {
                this.IlIlllIIIIIIlIIllIIllIlll(0);
                if (this.IIllIllIIllIIlllIIIlIlllI()) {
                    this.IlIlllIIIIIIlIIllIIllIlll(4);
                    this.llIIlIllIllllIlIIIIlIIlll();
                }
            }
        }
    }

    public boolean IIllIllIIllIIlllIIIlIlllI() {
        if (class_0879.lllIIIllIIIIlllIlIIllIIll(this)) {
            return true;
        }
        List list = this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(class_1781.class, this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl(0.25, 0.0, 0.25), class_0830.lllIIIllIIIIlllIlIIllIIll);
        if (list.size() > 0) {
            class_0879.lllIIIllIIIIlllIlIIllIIll(this, (class_1781)list.get(0));
        }
        return false;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0058 class_00582) {
        super.lllIIIllIIIIlllIlIIllIIll(class_00582);
        this.lllIIIllIIIIlllIlIIllIIll(Item.getItemFromBlock(Blocks.llllIllllllIllIIIlIlIIllI), 1, 0.0f);
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        super.lllIlIIlIIIlIlIIIllIlllIl(class_07752);
        class_07752.lllIIIllIIIIlllIlIIllIIll("TransferCooldown", this.lllIlIIlIIIlIlIIIllIlllIl);
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        super.lllIIIllIIIIlllIlIIllIIll(class_07752);
        this.lllIlIIlIIIlIlIIIllIlllIl = class_07752.lIllllIIlIIIlIllllllIIIll("TransferCooldown");
    }

    public void IlIlllIIIIIIlIIllIIllIlll(int n) {
        this.lllIlIIlIIIlIlIIIllIlllIl = n;
    }

    public boolean lIlIIIllIIllIIlIllllllIll() {
        return this.lllIlIIlIIIlIlIIIllIlllIl > 0;
    }
}

