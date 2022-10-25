package obf;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public abstract class class_0650
extends class_1252 {
    private float lIIIlIllllIlllIIIIIllIIIl = -1.0f;
    private float lllIIIlllIlllIIlIllllIIlI;

    public class_0650(class_1334 class_13342) {
        super(class_13342);
    }

    public abstract class_0650 lllIIIllIIIIlllIlIIllIIll(class_0650 var1);

    @Override
    public boolean lIlllIlllIIIIlIIlllIllIII(class_0814 class_08142) {
        ItemStack class_08972 = class_08142.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll();
        if (class_08972 != null && class_08972.lllIIIllIIIIlllIlIIllIIll() == Items.spawn_egg) {
            class_0650 class_06502;
            Class class_;
            if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl && (class_ = class_0054.lllIIIllIIIIlllIlIIllIIll(class_08972.IllIIIllIIIIlIlIlIllIIlll())) != null && class_.isAssignableFrom(this.getClass()) && (class_06502 = this.lllIIIllIIIIlllIlIIllIIll(this)) != null) {
                class_06502.lllIlIIlIIIlIlIIIllIlllIl(-24000);
                class_06502.lllIlIIlIIIlIlIIIllIlllIl(this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI, this.IllIIIIllIIllIllIlllIlIIl, 0.0f, 0.0f);
                this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(class_06502);
                if (class_08972.IlIIIlIIIIllIIIllIIIIIIll()) {
                    class_06502.lllIIIllIIIIlllIlIIllIIll(class_08972.lIIlIIIIIlIlllIlIIlIlIlll());
                }
                if (!class_08142.lIIlIlIlIlIllIIlIIllllIll.lIlllIlllIIIIlIIlllIllIII) {
                    --class_08972.lllIlIIlIIIlIlIIIllIlllIl;
                    if (class_08972.lllIlIIlIIIlIlIIIllIlllIl <= 0) {
                        class_08142.lllIIlIIIllllllIIIIlIlIlI.lllIlIIlIIIlIlIIIllIlllIl(class_08142.lllIIlIIIllllllIIIIlIlIlI.IlIllllllIIlIIllllIIlIIIl, null);
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl() {
        super.lllIlIIlIIIlIlIIIllIlllIl();
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(12, new Integer(0));
    }

    public int u_() {
        return this.IlIlIllIIlIIIIlllIlIllIlI.IlIllllllIIlIIllllIIlIIIl(12);
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n) {
        int n2 = this.u_();
        if ((n2 += n * 20) > 0) {
            n2 = 0;
        }
        this.lllIlIIlIIIlIlIIIllIlllIl(n2);
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(int n) {
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIlIIlIIIlIlIIIllIlllIl(12, n);
        this.lllIIIllIIIIlllIlIIllIIll(this.g_());
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        super.lllIlIIlIIIlIlIIIllIlllIl(class_07752);
        class_07752.lllIIIllIIIIlllIlIIllIIll("Age", this.u_());
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        super.lllIIIllIIIIlllIlIIllIIll(class_07752);
        this.lllIlIIlIIIlIlIIIllIlllIl(class_07752.lIllllIIlIIIlIllllllIIIll("Age"));
    }

    @Override
    public void d_() {
        super.d_();
        if (this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
            this.lllIIIllIIIIlllIlIIllIIll(this.g_());
        } else {
            int n = this.u_();
            if (n < 0) {
                this.lllIlIIlIIIlIlIIIllIlllIl(++n);
            } else if (n > 0) {
                this.lllIlIIlIIIlIlIIIllIlllIl(--n);
            }
        }
    }

    @Override
    public boolean g_() {
        return this.u_() < 0;
    }

    public void lllIIIllIIIIlllIlIIllIIll(boolean bl) {
        this.lIlllIlllIIIIlIIlllIllIII(bl ? 0.5f : 1.0f);
    }

    @Override
    protected final void IlIIIIIllllllIIlllIllllll(float f, float f2) {
        boolean bl = this.lIIIlIllllIlllIIIIIllIIIl > 0.0f;
        this.lIIIlIllllIlllIIIIIllIIIl = f;
        this.lllIIIlllIlllIIlIllllIIlI = f2;
        if (!bl) {
            this.lIlllIlllIIIIlIIlllIllIII(1.0f);
        }
    }

    protected final void lIlllIlllIIIIlIIlllIllIII(float f) {
        super.IlIIIIIllllllIIlllIllllll(this.lIIIlIllllIlllIIIIIllIIIl * f, this.lllIIIlllIlllIIlIllllIIlI * f);
    }
}

