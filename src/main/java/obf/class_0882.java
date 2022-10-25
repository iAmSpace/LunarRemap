package obf;

import net.minecraft.init.Items;
import net.minecraft.item.Item;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0882
extends class_2105 {
    public class_0882(class_1334 class_13342) {
        super(class_13342);
        this.llllIlIIllIIlllllIIllIIll = true;
    }

    @Override
    protected void llIIlIllIllllIlIIIIlIIlll() {
        super.llIIlIllIllllIlIIIIlIIlll();
        this.lllIIIllIIIIlllIlIIllIIll(class_1152.lIlllIlllIIIIlIIlllIllIII).lllIIIllIIIIlllIlIIllIIll(0.2f);
    }

    @Override
    public boolean lllIIlIIIllllllIIIIlIlIlI() {
        return this.lIlIllIIlIIlIIlIIlIIlIIll.IlIlIIlIlIllIIlIlIIllIIIl != class_1999.lllIIIllIIIIlllIlIIllIIll && this.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl(this.IIllIllIIllIIlllIIIlIlllI) && this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll((class_1521)this, this.IIllIllIIllIIlllIIIlIlllI).isEmpty() && !this.lIlIllIIlIIlIIlIIlIIlIIll.lIlllIlllIIIIlIIlllIllIII(this.IIllIllIIllIIlllIIIlIlllI);
    }

    @Override
    public int lIIlIlIIIIIllIIIIllIlIlII() {
        return this.IlIIIlIIIIllIIIllIIIIIIll() * 3;
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(float f) {
        return 0xF000F0;
    }

    @Override
    public float lllIlIIlIIIlIlIIIllIlllIl(float f) {
        return 1.0f;
    }

    @Override
    protected String IlIIIIIllllllIIlllIllllll() {
        return "flame";
    }

    @Override
    protected class_2105 lIllllIIlIIIlIllllllIIIll() {
        return new class_0882(this.lIlIllIIlIIlIIlIIlIIlIIll);
    }

    @Override
    protected Item llIllllIIIIIlIIlIlllIIlll() {
        return Items.IlIIIIIIllIIlIllIIllIllIl;
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(boolean bl, int n) {
        Item class_06112 = this.llIllllIIIIIlIIlIlllIIlll();
        if (class_06112 != null && this.IlIIIlIIIIllIIIllIIIIIIll() > 1) {
            int n2 = this.IlllIIlllllllIIllIlIllllI.nextInt(4) - 2;
            if (n > 0) {
                n2 += this.IlllIIlllllllIIllIlIllllI.nextInt(n + 1);
            }
            for (int i = 0; i < n2; ++i) {
                this.lllIIIllIIIIlllIlIIllIIll(class_06112, 1);
            }
        }
    }

    @Override
    public boolean llIIIIIlIIlIIIIllIIIlIIII() {
        return false;
    }

    @Override
    protected int IllIIlllllllIIlIIlIIIIlIl() {
        return super.IllIIlllllllIIlIIlIIIIlIl() * 4;
    }

    @Override
    protected void IlIlllIIIIIIlIIllIIllIlll() {
        this.lllIIIllIIIIlllIlIIllIIll *= 0.9f;
    }

    @Override
    protected void f_() {
        this.IIlIIlIlIlIllIIlIlIIIIlll = 0.42f + (float)this.IlIIIlIIIIllIIIllIIIIIIll() * 0.1f;
        this.lIIlIlIIllIIIlIIlIlIIIlII = true;
    }

    @Override
    protected void lIllllIIlIIIlIllllllIIIll(float f) {
    }

    @Override
    protected boolean IlIlIIlIlIllIIlIlIIllIIIl() {
        return true;
    }

    @Override
    protected int lllllIlllIIllIlIIlIIIllII() {
        return super.lllllIlllIIllIlIIlIIIllII() + 2;
    }

    @Override
    protected String IlIlIIlllIIlIllIIIlllllIl() {
        return this.IlIIIlIIIIllIIIllIIIIIIll() > 1 ? "mob.magmacube.big" : "mob.magmacube.small";
    }

    @Override
    public boolean lIIlIlllIllIlIlllIIIIIIII() {
        return false;
    }

    @Override
    protected boolean lIlIlIIlIIIIlIIIIIlllIIII() {
        return true;
    }
}

