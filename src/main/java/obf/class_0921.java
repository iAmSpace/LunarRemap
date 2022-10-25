package obf;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0921
extends class_1327 {
    private class_1305 lllIIIllIIIIlllIlIIllIIll;
    private class_0814 lllIlIIlIIIlIlIIIllIlllIl;
    private class_1334 IlIllllllIIlIIllllIIlIIIl;
    private float lIlllIlllIIIIlIIlllIllIII;
    private int IlIIIIIllllllIIlllIllllll;

    public class_0921(class_1305 class_13052, float f) {
        this.lllIIIllIIIIlllIlIIllIIll = class_13052;
        this.IlIllllllIIlIIllllIIlIIIl = class_13052.lIlIllIIlIIlIIlIIlIIlIIll;
        this.lIlllIlllIIIIlIIlllIllIII = f;
        this.lllIIIllIIIIlllIlIIllIIll(2);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll() {
        this.lllIlIIlIIIlIlIIIllIlllIl = this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll((class_1521)this.lllIIIllIIIIlllIlIIllIIll, (double)this.lIlllIlllIIIIlIIlllIllIII);
        return this.lllIlIIlIIIlIlIIIllIlllIl == null ? false : this.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl);
    }

    @Override
    public boolean lllIlIIlIIIlIlIIIllIlllIl() {
        return !this.lllIlIIlIIIlIlIIIllIlllIl.IlllIIlllllllIIllIlIllllI() ? false : (this.lllIIIllIIIIlllIlIIllIIll.IlIIIIIllllllIIlllIllllll((class_1521)this.lllIlIIlIIIlIlIIIllIlllIl) > (double)(this.lIlllIlllIIIIlIIlllIllIII * this.lIlllIlllIIIIlIIlllIllIII) ? false : this.IlIIIIIllllllIIlllIllllll > 0 && this.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl));
    }

    @Override
    public void IlIIIIIllllllIIlllIllllll() {
        this.lllIIIllIIIIlllIlIIllIIll.llIIllIllIlIIlIIllIllllll(true);
        this.IlIIIIIllllllIIlllIllllll = 40 + this.lllIIIllIIIIlllIlIIllIIll.IlllIIIlIIlIIIIllllIllllI().nextInt(40);
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
        this.lllIIIllIIIIlllIlIIllIIll.llIIllIllIlIIlIIllIllllll(false);
        this.lllIlIIlIIIlIlIIIllIlllIl = null;
    }

    @Override
    public void lIlllIlllIIIIlIIlllIllIII() {
        this.lllIIIllIIIIlllIlIIllIIll.llIllllIlIllIIIlIllIIlIlI().lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl.IlIIlllllIIlIlIlllllIllll, this.lllIlIIlIIIlIlIIIllIlllIl.llIIlIlIlllIIllIlIlllIllI + (double)this.lllIlIIlIIIlIlIIIllIlllIl.llIIllIllIlIIlIIllIllllll(), this.lllIlIIlIIIlIlIIIllIlllIl.IllIIIIllIIllIllIlllIlIIl, 10.0f, this.lllIIIllIIIIlllIlIIllIIll.IIIlllIlIIllIIlIlIllIlIIl());
        --this.IlIIIIIllllllIIlllIllllll;
    }

    private boolean lllIIIllIIIIlllIlIIllIIll(class_0814 class_08142) {
        ItemStack class_08972 = class_08142.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll();
        return class_08972 == null ? false : (!this.lllIIIllIIIIlllIlIIllIIll.lllIIIIlIIllIIIlIllIlllII() && class_08972.lllIIIllIIIIlllIlIIllIIll() == Items.bone ? true : this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl(class_08972));
    }
}

