package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import java.util.List;
import java.util.UUID;

public class class_1144
extends class_0724 {
    private static final UUID lllIIIlllIlllIIlIllllIIlI = UUID.fromString("49455A49-7EC5-45BA-B886-3B90B23A1718");
    private static final class_1256 lIIlIlllIIlllIIlllIIlIlII = new class_1256(lllIIIlllIlllIIlIllllIIlI, "Attacking speed boost", 0.45, 0).lllIIIllIIIIlllIlIIllIIll(false);
    private int lIIlIIIlIlIIlllIlIllIllIl;
    private int lIIlIlIIIIIllIIIIllIlIlII;
    private class_1521 lIIIIlIIIIllIlIIllllIlIII;

    public class_1144(class_1334 class_13342) {
        super(class_13342);
        this.llllIlIIllIIlllllIIllIIll = true;
    }

    @Override
    protected void llIIlIllIllllIlIIIIlIIlll() {
        super.llIIlIllIllllIlIIIIlIIlll();
        this.lllIIIllIIIIlllIlIIllIIll(lIIIlIllllIlllIIIIIllIIIl).lllIIIllIIIIlllIlIIllIIll(0.0);
        this.lllIIIllIIIIlllIlIIllIIll(class_1152.lIlllIlllIIIIlIIlllIllIII).lllIIIllIIIIlllIlIIllIIll(0.5);
        this.lllIIIllIIIIlllIlIIllIIll(class_1152.IlIIIIIllllllIIlllIllllll).lllIIIllIIIIlllIlIIllIIll(5.0);
    }

    @Override
    protected boolean IIIIlllIIlIllllllIllIIlll() {
        return false;
    }

    @Override
    public void s_() {
        if (this.lIIIIlIIIIllIlIIllllIlIII != this.IlIllllllIIlIIllllIIlIIIl && !this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
            class_1685 class_16852 = this.lllIIIllIIIIlllIlIIllIIll(class_1152.lIlllIlllIIIIlIIlllIllIII);
            class_16852.lllIlIIlIIIlIlIIIllIlllIl(lIIlIlllIIlllIIlllIIlIlII);
            if (this.IlIllllllIIlIIllllIIlIIIl != null) {
                class_16852.lllIIIllIIIIlllIlIIllIIll(lIIlIlllIIlllIIlllIIlIlII);
            }
        }
        this.lIIIIlIIIIllIlIIllllIlIII = this.IlIllllllIIlIIllllIIlIIIl;
        if (this.lIIlIlIIIIIllIIIIllIlIlII > 0 && --this.lIIlIlIIIIIllIIIIllIlIlII == 0) {
            this.lllIIIllIIIIlllIlIIllIIll("mob.zombiepig.zpigangry", this.IIlIlIIIIlIlllIlIlIIIIIlI() * 2.0f, ((this.IlllIIlllllllIIllIlIllllI.nextFloat() - this.IlllIIlllllllIIllIlIllllI.nextFloat()) * 0.2f + 1.0f) * 1.8f);
        }
        super.s_();
    }

    @Override
    public boolean lllIIlIIIllllllIIIIlIlIlI() {
        return this.lIlIllIIlIIlIIlIIlIIlIIll.IlIlIIlIlIllIIlIlIIllIIIl != class_1999.lllIIIllIIIIlllIlIIllIIll && this.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl(this.IIllIllIIllIIlllIIIlIlllI) && this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll((class_1521)this, this.IIllIllIIllIIlllIIIlIlllI).isEmpty() && !this.lIlIllIIlIIlIIlIIlIIlIIll.lIlllIlllIIIIlIIlllIllIII(this.IIllIllIIllIIlllIIIlIlllI);
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        super.lllIlIIlIIIlIlIIIllIlllIl(class_07752);
        class_07752.lllIIIllIIIIlllIlIIllIIll("Anger", (short)this.lIIlIIIlIlIIlllIlIllIllIl);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        super.lllIIIllIIIIlllIlIIllIIll(class_07752);
        this.lIIlIIIlIlIIlllIlIllIllIl = class_07752.IlIIIIIllllllIIlllIllllll("Anger");
    }

    @Override
    protected class_1521 IllIIlllllllIIlIIlIIIIlIl() {
        return this.lIIlIIIlIlIIlllIlIllIllIl == 0 ? null : super.IllIIlllllllIIlIIlIIIIlIl();
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_0058 class_00582, float f) {
        if (this.lIIllIIlIIIlllIlllIIlIIlI()) {
            return false;
        }
        class_1521 class_15212 = class_00582.IllIIIllIIIIlIlIlIllIIlll();
        if (class_15212 instanceof class_0814) {
            List list = this.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl((class_1521)this, this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl(32.0, 32.0, 32.0));
            for (int i = 0; i < list.size(); ++i) {
                class_1521 class_15213 = (class_1521)list.get(i);
                if (!(class_15213 instanceof class_1144)) continue;
                class_1144 class_11442 = (class_1144)class_15213;
                class_11442.IlIllllllIIlIIllllIIlIIIl(class_15212);
            }
            this.IlIllllllIIlIIllllIIlIIIl(class_15212);
        }
        return super.lllIIIllIIIIlllIlIIllIIll(class_00582, f);
    }

    private void IlIllllllIIlIIllllIIlIIIl(class_1521 class_15212) {
        this.IlIllllllIIlIIllllIIlIIIl = class_15212;
        this.lIIlIIIlIlIIlllIlIllIllIl = 400 + this.IlllIIlllllllIIllIlIllllI.nextInt(400);
        this.lIIlIlIIIIIllIIIIllIlIlII = this.IlllIIlllllllIIllIlIllllI.nextInt(40);
    }

    @Override
    protected String lllllllIlIIlIlIIIlIlIIlll() {
        return "mob.zombiepig.zpig";
    }

    @Override
    protected String lIIlIlllIIlllIIlllIIlIlII() {
        return "mob.zombiepig.zpighurt";
    }

    @Override
    protected String lIIlIIIlIlIIlllIlIllIllIl() {
        return "mob.zombiepig.zpigdeath";
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(boolean bl, int n) {
        int n2;
        int n3 = this.IlllIIlllllllIIllIlIllllI.nextInt(2 + n);
        for (n2 = 0; n2 < n3; ++n2) {
            this.lllIIIllIIIIlllIlIIllIIll(Items.lIIIlllIlIIIlIllIIIlIllll, 1);
        }
        n3 = this.IlllIIlllllllIIllIlIllllI.nextInt(2 + n);
        for (n2 = 0; n2 < n3; ++n2) {
            this.lllIIIllIIIIlllIlIIllIIll(Items.llIllIlllIllIlIIIIlIIlIII, 1);
        }
    }

    @Override
    public boolean lIlllIlllIIIIlIIlllIllIII(class_0814 class_08142) {
        return false;
    }

    @Override
    protected void IlIlIIlIlIllIIlIlIIllIIIl(int n) {
        this.lllIIIllIIIIlllIlIIllIIll(Items.lIIIIlIlIIlllllIIllIIlIII, 1);
    }

    @Override
    protected void lllllIllllIIIIllIIlIlIlII() {
        this.lllIIIllIIIIlllIlIIllIIll(0, new ItemStack(Items.llIIlIlIlllIIllIlIlllIllI));
    }

    @Override
    public class_2025 lllIIIllIIIIlllIlIIllIIll(class_2025 class_20252) {
        super.lllIIIllIIIIlllIlIIllIIll(class_20252);
        this.IllIIIllIIIIlIlIlIllIIlll(false);
        return class_20252;
    }
}

