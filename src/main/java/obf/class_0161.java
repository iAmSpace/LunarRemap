package obf;

import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.stats.AchievementList;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0161
extends class_0003 {
    private final class_1907 lIIIlIllllIlllIIIIIllIIIl;

    public class_0161(class_1334 class_13342) {
        super(class_13342);
        this.IlIIIIIllllllIIlllIllllll(0.9f, 0.9f);
        this.IllIIIIllIIllIllIlllIlIIl().lllIIIllIIIIlllIlIIllIIll(true);
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(0, new class_0866(this));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(1, new class_0826(this, 1.25));
        this.lIIIlIllllIlllIIIIIllIIIl = new class_1907(this, 0.3f);
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(2, this.lIIIlIllllIlllIIIIIllIIIl);
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(3, new class_0303(this, 1.0));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(4, new class_1801(this, 1.2, Items.lIlIIlIIlIIIIllIIlIllIlll, false));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(4, new class_1801(this, 1.2, Items.lIlIllllIlIIIIIllIIIIlIlI, false));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(5, new class_1954(this, 1.1));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(6, new class_0454(this, 1.0));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(7, new class_0235(this, class_0814.class, 6.0f));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(8, new class_0558(this));
    }

    @Override
    public boolean IIIIlllIIlIllllllIllIIlll() {
        return true;
    }

    @Override
    protected void llIIlIllIllllIlIIIIlIIlll() {
        super.llIIlIllIllllIlIIIIlIIlll();
        this.lllIIIllIIIIlllIlIIllIIll(class_1152.lllIIIllIIIIlllIlIIllIIll).lllIIIllIIIIlllIlIIllIIll(10.0);
        this.lllIIIllIIIIlllIlIIllIIll(class_1152.lIlllIlllIIIIlIIlllIllIII).lllIIIllIIIIlllIlIIllIIll(0.25);
    }

    @Override
    protected void IllIIIIlIIlllllllllIlIlII() {
        super.IllIIIIlIIlllllllllIlIlII();
    }

    @Override
    public boolean lIIllllIllIlllllIIllIllIl() {
        ItemStack class_08972 = ((class_0814)this.lIlIlIIlIIIIlIIIIIlllIIII).lIIIIlIlIlIIIlIIllIIlIlIl();
        return class_08972 != null && class_08972.lllIIIllIIIIlllIlIIllIIll() == Items.lIlIIlIIlIIIIllIIlIllIlll;
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl() {
        super.lllIlIIlIIIlIlIIIllIlllIl();
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(16, (Object)0);
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        super.lllIlIIlIIIlIlIIIllIlllIl(class_07752);
        class_07752.lllIIIllIIIIlllIlIIllIIll("Saddle", this.IIlIlIlIIlllIIIlIIIIlIIIl());
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        super.lllIIIllIIIIlllIlIIllIIll(class_07752);
        this.IIIllIllIIlIlIlIlIllllIIl(class_07752.lllIIlIIIllllllIIIIlIlIlI("Saddle"));
    }

    @Override
    protected String lllllllIlIIlIlIIIlIlIIlll() {
        return "mob.pig.say";
    }

    @Override
    protected String lIIlIlllIIlllIIlllIIlIlII() {
        return "mob.pig.say";
    }

    @Override
    protected String lIIlIIIlIlIIlllIlIllIllIl() {
        return "mob.pig.death";
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, Block class_05492) {
        this.lllIIIllIIIIlllIlIIllIIll("mob.pig.step", 0.15f, 1.0f);
    }

    @Override
    public boolean lIlllIlllIIIIlIIlllIllIII(class_0814 class_08142) {
        if (super.lIlllIlllIIIIlIIlllIllIII(class_08142)) {
            return true;
        }
        if (this.IIlIlIlIIlllIIIlIIIIlIIIl() && !this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl && (this.lIlIlIIlIIIIlIIIIIlllIIII == null || this.lIlIlIIlIIIIlIIIIIlllIIII == class_08142)) {
            class_08142.lllIIIllIIIIlllIlIIllIIll((class_1521)this);
            return true;
        }
        return false;
    }

    @Override
    protected Item llIllllIIIIIlIIlIlllIIlll() {
        return this.llIIIIIlIIlIIIIllIIIlIIII() ? Items.llllIlIIllIIlllllIIllIIll : Items.IIIIlIllIlIIIIIllllIIlllI;
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(boolean bl, int n) {
        int n2 = this.IlllIIlllllllIIllIlIllllI.nextInt(3) + 1 + this.IlllIIlllllllIIllIlIllllI.nextInt(1 + n);
        for (int i = 0; i < n2; ++i) {
            if (this.llIIIIIlIIlIIIIllIIIlIIII()) {
                this.lllIIIllIIIIlllIlIIllIIll(Items.llllIlIIllIIlllllIIllIIll, 1);
                continue;
            }
            this.lllIIIllIIIIlllIlIIllIIll(Items.IIIIlIllIlIIIIIllllIIlllI, 1);
        }
        if (this.IIlIlIlIIlllIIIlIIIIlIIIl()) {
            this.lllIIIllIIIIlllIlIIllIIll(Items.saddle, 1);
        }
    }

    public boolean IIlIlIlIIlllIIIlIIIIlIIIl() {
        return (this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(16) & 1) != 0;
    }

    public void IIIllIllIIlIlIlIlIllllIIl(boolean bl) {
        if (bl) {
            this.IlIlIllIIlIIIIlllIlIllIlI.lllIlIIlIIIlIlIIIllIlllIl(16, (byte)1);
        } else {
            this.IlIlIllIIlIIIIlllIlIllIlI.lllIlIIlIIIlIlIIIllIlllIl(16, (byte)0);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0411 class_04112) {
        if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
            class_1144 class_11442 = new class_1144(this.lIlIllIIlIIlIIlIIlIIlIIll);
            class_11442.lllIIIllIIIIlllIlIIllIIll(0, new ItemStack(Items.llIIlIlIlllIIllIlIlllIllI));
            class_11442.lllIlIIlIIIlIlIIIllIlllIl(this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI, this.IllIIIIllIIllIllIlllIlIIl, this.IIIIlIllIlIIlIIlIllIlIlll, this.IlIlIIlllIllllllllIIIlIlI);
            this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(class_11442);
            this.IIIIlIIlIIIllIIIIllIIIlII();
        }
    }

    @Override
    protected void lIllllIIlIIIlIllllllIIIll(float f) {
        super.lIllllIIlIIIlIllllllIIIll(f);
        if (f > 5.0f && this.lIlIlIIlIIIIlIIIIIlllIIII instanceof class_0814) {
            ((class_0814)this.lIlIlIIlIIIIlIIIIIlllIIII).lllIIIllIIIIlllIlIIllIIll(AchievementList.flyPig);
        }
    }

    public class_0161 lllIlIIlIIIlIlIIIllIlllIl(class_0650 class_06502) {
        return new class_0161(this.lIlIllIIlIIlIIlIIlIIlIIll);
    }

    @Override
    public boolean IlIllllllIIlIIllllIIlIIIl(ItemStack class_08972) {
        return class_08972 != null && class_08972.lllIIIllIIIIlllIlIIllIIll() == Items.lIlIllllIlIIIIIllIIIIlIlI;
    }

    public class_1907 lllIIIIlIIllIIIlIllIlllII() {
        return this.lIIIlIllllIlllIIIIIllIIIl;
    }

    @Override
    public /* synthetic */ class_0650 lllIIIllIIIIlllIlIIllIIll(class_0650 class_06502) {
        return this.lllIlIIlIIIlIlIIIllIlllIl(class_06502);
    }
}

