package obf;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1234
extends class_1168 {
    private int lIIIlIllllIlllIIIIIllIIIl;
    private int lllIIIlllIlllIIlIllllIIlI;
    private int lIIlIlllIIlllIIlllIIlIlII = 30;
    private int lIIlIIIlIlIIlllIlIllIllIl = 3;

    public class_1234(class_1334 class_13342) {
        super(class_13342);
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(1, new class_0866(this));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(2, new class_0346(this));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(3, new class_1365(this, class_0673.class, 6.0f, 1.0, 1.2));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(4, new class_1778(this, 1.0, false));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(5, new class_0454(this, 0.8));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(6, new class_0235(this, class_0814.class, 8.0f));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(6, new class_0558(this));
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(1, new class_1524(this, class_0814.class, 0, true));
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(2, new class_0366(this, false));
    }

    @Override
    protected void llIIlIllIllllIlIIIIlIIlll() {
        super.llIIlIllIllllIlIIIIlIIlll();
        this.lllIIIllIIIIlllIlIIllIIll(class_1152.lIlllIlllIIIIlIIlllIllIII).lllIIIllIIIIlllIlIIllIIll(0.25);
    }

    @Override
    public boolean IIIIlllIIlIllllllIllIIlll() {
        return true;
    }

    @Override
    public int IllIIllIlIlllIllIllIlIIIl() {
        return this.IIIIlIllIlIIlIIlIllIlIlll() == null ? 3 : 3 + (int)(this.lllIIIlllIlllIIlIllllIIlI() - 1.0f);
    }

    @Override
    protected void lIllllIIlIIIlIllllllIIIll(float f) {
        super.lIllllIIlIIIlIllllllIIIll(f);
        this.lllIIIlllIlllIIlIllllIIlI = (int)((float)this.lllIIIlllIlllIIlIllllIIlI + f * 1.5f);
        if (this.lllIIIlllIlllIIlIllllIIlI > this.lIIlIlllIIlllIIlllIIlIlII - 5) {
            this.lllIIIlllIlllIIlIllllIIlI = this.lIIlIlllIIlllIIlllIIlIlII - 5;
        }
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl() {
        super.lllIlIIlIIIlIlIIIllIlllIl();
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(16, (Object)-1);
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(17, (Object)0);
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(18, (Object)0);
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        super.lllIlIIlIIIlIlIIIllIlllIl(class_07752);
        if (this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(17) == 1) {
            class_07752.lllIIIllIIIIlllIlIIllIIll("powered", true);
        }
        class_07752.lllIIIllIIIIlllIlIIllIIll("Fuse", (short)this.lIIlIlllIIlllIIlllIIlIlII);
        class_07752.lllIIIllIIIIlllIlIIllIIll("ExplosionRadius", (byte)this.lIIlIIIlIlIIlllIlIllIllIl);
        class_07752.lllIIIllIIIIlllIlIIllIIll("ignited", this.IIlIlIlIIlllIIIlIIIIlIIIl());
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        super.lllIIIllIIIIlllIlIIllIIll(class_07752);
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIlIIlIIIlIlIIIllIlllIl(17, (byte)(class_07752.lllIIlIIIllllllIIIIlIlIlI("powered") ? 1 : 0));
        if (class_07752.lllIlIIlIIIlIlIIIllIlllIl("Fuse", 99)) {
            this.lIIlIlllIIlllIIlllIIlIlII = class_07752.IlIIIIIllllllIIlllIllllll("Fuse");
        }
        if (class_07752.lllIlIIlIIIlIlIIIllIlllIl("ExplosionRadius", 99)) {
            this.lIIlIIIlIlIIlllIlIllIllIl = class_07752.lIlllIlllIIIIlIIlllIllIII("ExplosionRadius");
        }
        if (class_07752.lllIIlIIIllllllIIIIlIlIlI("ignited")) {
            this.lllIIIIlIIllIIIlIllIlllII();
        }
    }

    @Override
    public void s_() {
        if (this.IlllIIlllllllIIllIlIllllI()) {
            int n;
            this.lIIIlIllllIlllIIIIIllIIIl = this.lllIIIlllIlllIIlIllllIIlI;
            if (this.IIlIlIlIIlllIIIlIIIIlIIIl()) {
                this.lllIIIllIIIIlllIlIIllIIll(1);
            }
            if ((n = this.lIllIIlllIIIlIlIIIlllIlIl()) > 0 && this.lllIIIlllIlllIIlIllllIIlI == 0) {
                this.lllIIIllIIIIlllIlIIllIIll("creeper.primed", 1.0f, 0.5f);
            }
            this.lllIIIlllIlllIIlIllllIIlI += n;
            if (this.lllIIIlllIlllIIlIllllIIlI < 0) {
                this.lllIIIlllIlllIIlIllllIIlI = 0;
            }
            if (this.lllIIIlllIlllIIlIllllIIlI >= this.lIIlIlllIIlllIIlllIIlIlII) {
                this.lllIIIlllIlllIIlIllllIIlI = this.lIIlIlllIIlllIIlllIIlIlII;
                this.IlIllIIIIllllIIllIllIIIIl();
            }
        }
        super.s_();
    }

    @Override
    protected String lIIlIlllIIlllIIlllIIlIlII() {
        return "mob.creeper.say";
    }

    @Override
    protected String lIIlIIIlIlIIlllIlIllIllIl() {
        return "mob.creeper.death";
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0058 class_00582) {
        super.lllIIIllIIIIlllIlIIllIIll(class_00582);
        if (class_00582.IllIIIllIIIIlIlIlIllIIlll() instanceof class_0630) {
            int n = Item.lllIIIllIIIIlllIlIIllIIll(Items.IIllllllIIllIlIllllIIIlll);
            int n2 = Item.lllIIIllIIIIlllIlIIllIIll(Items.IIllllllllIlllIIllllllllI);
            int n3 = n + this.IlllIIlllllllIIllIlIllllI.nextInt(n2 - n + 1);
            this.lllIIIllIIIIlllIlIIllIIll(Item.lllIIIllIIIIlllIlIIllIIll(n3), 1);
        }
    }

    @Override
    public boolean llIIllIllIlIIlIIllIllllll(class_1521 class_15212) {
        return true;
    }

    public boolean lllIIIlIllIlllIlIIllIllIl() {
        return this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(17) == 1;
    }

    public float lIlllIlllIIIIlIIlllIllIII(float f) {
        return ((float)this.lIIIlIllllIlllIIIIIllIIIl + (float)(this.lllIIIlllIlllIIlIllllIIlI - this.lIIIlIllllIlllIIIIIllIIIl) * f) / (float)(this.lIIlIlllIIlllIIlllIIlIlII - 2);
    }

    @Override
    protected Item llIllllIIIIIlIIlIlllIIlll() {
        return Items.IlIlIIlllIllllllllIIIlIlI;
    }

    public int lIllIIlllIIIlIlIIIlllIlIl() {
        return this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(16);
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n) {
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIlIIlIIIlIlIIIllIlllIl(16, (byte)n);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0411 class_04112) {
        super.lllIIIllIIIIlllIlIIllIIll(class_04112);
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIlIIlIIIlIlIIIllIlllIl(17, (byte)1);
    }

    @Override
    protected boolean lIlllIlllIIIIlIIlllIllIII(class_0814 class_08142) {
        ItemStack class_08972 = class_08142.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll();
        if (class_08972 != null && class_08972.lllIIIllIIIIlllIlIIllIIll() == Items.flint_and_steel) {
            this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(this.IlIIlllllIIlIlIlllllIllll + 0.5, this.llIIlIlIlllIIllIlIlllIllI + 0.5, this.IllIIIIllIIllIllIlllIlIIl + 0.5, "fire.ignite", 1.0f, this.IlllIIlllllllIIllIlIllllI.nextFloat() * 0.4f + 0.8f);
            class_08142.lIIlIIIIIlIlllIlIIlIlIlll();
            if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
                this.lllIIIIlIIllIIIlIllIlllII();
                class_08972.lllIIIllIIIIlllIlIIllIIll(1, (class_1965)class_08142);
                return true;
            }
        }
        return super.lIlllIlllIIIIlIIlllIllIII(class_08142);
    }

    private void IlIllIIIIllllIIllIllIIIIl() {
        if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
            boolean bl = this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIlllllIIlIlIlllllIllll().lllIlIIlIIIlIlIIIllIlllIl("mobGriefing");
            if (this.lllIIIlIllIlllIlIIllIllIl()) {
                this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(this, this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI, this.IllIIIIllIIllIllIlllIlIIl, (float)(this.lIIlIIIlIlIIlllIlIllIllIl * 2), bl);
            } else {
                this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(this, this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI, this.IllIIIIllIIllIllIlllIlIIl, (float)this.lIIlIIIlIlIIlllIlIllIllIl, bl);
            }
            this.IIIIlIIlIIIllIIIIllIIIlII();
        }
    }

    public boolean IIlIlIlIIlllIIIlIIIIlIIIl() {
        return this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(18) != 0;
    }

    public void lllIIIIlIIllIIIlIllIlllII() {
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIlIIlIIIlIlIIIllIlllIl(18, (byte)1);
    }
}

