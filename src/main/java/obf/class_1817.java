package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class class_1817
extends class_0650
implements class_1510,
class_0122 {
    private int lllIIIlllIlllIIlIllllIIlI;
    private boolean lIIlIlllIIlllIIlllIIlIlII;
    private boolean lIIlIIIlIlIIlllIlIllIllIl;
    class_0938 lIIIlIllllIlllIIIIIllIIIl;
    private class_0814 lIIlIlIIIIIllIIIIllIlIlII;
    private class_1596 lIIIIlIIIIllIlIIllllIlIII;
    private int lIIIlllllllIlllIIllllllll;
    private boolean IIllllIIlIlIlIlllIIIllIIl;
    private int IIIllIIIlIlllllllIIIlllll;
    private String lIlIlllIllllIIlllIlllIIIl;
    private boolean lIlIllllIlIIIIIllIIIIlIlI;
    private float IIlllllIIlIIlIlIIlIIlIlII;
    private static final Map IIlIlIIIIlIlllIlIlIIIIIlI = new HashMap();
    private static final Map IlIlIIllIlIlIIIIIlIlllllI = new HashMap();

    public class_1817(class_1334 class_13342) {
        this(class_13342, 0);
    }

    public class_1817(class_1334 class_13342, int n) {
        super(class_13342);
        this.lIIlIIIIIlIlllIlIIlIlIlll(n);
        this.IlIIIIIllllllIIlllIllllll(0.6f, 1.8f);
        this.IllIIIIllIIllIllIlllIlIIl().lllIlIIlIIIlIlIIIllIlllIl(true);
        this.IllIIIIllIIllIllIlllIlIIl().lllIIIllIIIIlllIlIIllIIll(true);
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(0, new class_0866(this));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(1, new class_1365(this, class_0724.class, 8.0f, 0.6, 0.6));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(1, new class_1232(this));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(1, new class_1516(this));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(2, new class_2148(this));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(3, new class_0389(this));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(4, new class_0429(this, true));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(5, new class_0649(this, 0.6));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(6, new class_0906(this));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(7, new class_0940(this));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(8, new class_0338(this, 0.32));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(9, new class_0364(this, class_0814.class, 3.0f, 1.0f));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(9, new class_0364(this, class_1817.class, 5.0f, 0.02f));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(9, new class_0454(this, 0.6));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(10, new class_0235(this, class_0339.class, 8.0f));
    }

    @Override
    protected void llIIlIllIllllIlIIIIlIIlll() {
        super.llIIlIllIllllIlIIIIlIIlll();
        this.lllIIIllIIIIlllIlIIllIIll(class_1152.lIlllIlllIIIIlIIlllIllIII).lllIIIllIIIIlllIlIIllIIll(0.5);
    }

    @Override
    public boolean IIIIlllIIlIllllllIllIIlll() {
        return true;
    }

    @Override
    protected void lIIlIlIlIlIllIIlIIllllIll() {
        if (--this.lllIIIlllIlllIIlIllllIIlI <= 0) {
            this.lIlIllIIlIIlIIlIIlIIlIIll.llIllllIlIllIIIlIllIIlIlI.lllIIIllIIIIlllIlIIllIIll(MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll), MathHelper.IlIllllllIIlIIllllIIlIIIl(this.llIIlIlIlllIIllIlIlllIllI), MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IllIIIIllIIllIllIlllIlIIl));
            this.lllIIIlllIlllIIlIllllIIlI = 70 + this.IlllIIlllllllIIllIlIllllI.nextInt(50);
            this.lIIIlIllllIlllIIIIIllIIIl = this.lIlIllIIlIIlIIlIIlIIlIIll.llIllllIlIllIIIlIllIIlIlI.lllIIIllIIIIlllIlIIllIIll(MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll), MathHelper.IlIllllllIIlIIllllIIlIIIl(this.llIIlIlIlllIIllIlIlllIllI), MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IllIIIIllIIllIllIlllIlIIl), 32);
            if (this.lIIIlIllllIlllIIIIIllIIIl == null) {
                this.IlIIIlIIIIllIIIllIIIIIIll();
            } else {
                class_2208 class_22082 = this.lIIIlIllllIlllIIIIIllIIIl.lllIIIllIIIIlllIlIIllIIll();
                this.lllIIIllIIIIlllIlIIllIIll(class_22082.lllIIIllIIIIlllIlIIllIIll, class_22082.lllIlIIlIIIlIlIIIllIlllIl, class_22082.IlIllllllIIlIIllllIIlIIIl, (int)((float)this.lIIIlIllllIlllIIIIIllIIIl.lllIlIIlIIIlIlIIIllIlllIl() * 0.6f));
                if (this.lIlIllllIlIIIIIllIIIIlIlI) {
                    this.lIlIllllIlIIIIIllIIIIlIlI = false;
                    this.lIIIlIllllIlllIIIIIllIIIl.lllIlIIlIIIlIlIIIllIlllIl(5);
                }
            }
        }
        if (!this.IIlIlIlIIlllIIIlIIIIlIIIl() && this.lIIIlllllllIlllIIllllllll > 0) {
            --this.lIIIlllllllIlllIIllllllll;
            if (this.lIIIlllllllIlllIIllllllll <= 0) {
                if (this.IIllllIIlIlIlIlllIIIllIIl) {
                    if (this.lIIIIlIIIIllIlIIllllIlIII.size() > 1) {
                        for (class_2187 class_21872 : this.lIIIIlIIIIllIlIIllllIlIII) {
                            if (!class_21872.lIllllIIlIIIlIllllllIIIll()) continue;
                            class_21872.lllIIIllIIIIlllIlIIllIIll(this.IlllIIlllllllIIllIlIllllI.nextInt(6) + this.IlllIIlllllllIIllIlIllllI.nextInt(6) + 2);
                        }
                    }
                    this.lIlIlIIlIIIIlIIIIIlllIIII(1);
                    this.IIllllIIlIlIlIlllIIIllIIl = false;
                    if (this.lIIIlIllllIlllIIIIIllIIIl != null && this.lIlIlllIllllIIlllIlllIIIl != null) {
                        this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll((class_1521)this, (byte)14);
                        this.lIIIlIllllIlllIIIIIllIIIl.lllIIIllIIIIlllIlIIllIIll(this.lIlIlllIllllIIlllIlllIIIl, 1);
                    }
                }
                this.lllIIIllIIIIlllIlIIllIIll(new class_1852(class_0700.llIIlllIllIllllIIIlIIIIII.IlIlIIlllIllllllllIIIlIlI, 200, 0));
            }
        }
        super.lIIlIlIlIlIllIIlIIllllIll();
    }

    @Override
    public boolean lIlllIlllIIIIlIIlllIllIII(class_0814 class_08142) {
        boolean bl;
        ItemStack class_08972 = class_08142.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll();
        boolean bl2 = bl = class_08972 != null && class_08972.lllIIIllIIIIlllIlIIllIIll() == Items.spawn_egg;
        if (!bl && this.IlllIIlllllllIIllIlIllllI() && !this.IIlIlIlIIlllIIIlIIIIlIIIl() && !this.g_()) {
            if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
                this.a_(class_08142);
                class_08142.lllIIIllIIIIlllIlIIllIIll(this, this.llllIIllllIllIlllllIIlIlI());
            }
            return true;
        }
        return super.lIlllIlllIIIIlIIlllIllIII(class_08142);
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl() {
        super.lllIlIIlIIIlIlIIIllIlllIl();
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(16, (Object)0);
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        super.lllIlIIlIIIlIlIIIllIlllIl(class_07752);
        class_07752.lllIIIllIIIIlllIlIIllIIll("Profession", this.lllIIIlIllIlllIlIIllIllIl());
        class_07752.lllIIIllIIIIlllIlIIllIIll("Riches", this.IIIllIIIlIlllllllIIIlllll);
        if (this.lIIIIlIIIIllIlIIllllIlIII != null) {
            class_07752.lllIIIllIIIIlllIlIIllIIll("Offers", this.lIIIIlIIIIllIlIIllllIlIII.lllIIIllIIIIlllIlIIllIIll());
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        super.lllIIIllIIIIlllIlIIllIIll(class_07752);
        this.lIIlIIIIIlIlllIlIIlIlIlll(class_07752.lIllllIIlIIIlIllllllIIIll("Profession"));
        this.IIIllIIIlIlllllllIIIlllll = class_07752.lIllllIIlIIIlIllllllIIIll("Riches");
        if (class_07752.lllIlIIlIIIlIlIIIllIlllIl("Offers", 10)) {
            class_0775 class_07753 = class_07752.llIIllIllIlIIlIIllIllllll("Offers");
            this.lIIIIlIIIIllIlIIllllIlIII = new class_1596(class_07753);
        }
    }

    @Override
    protected boolean IIIIIIlIIIIIIIIIIlIlIlIlI() {
        return false;
    }

    @Override
    protected String lllllllIlIIlIlIIIlIlIIlll() {
        return this.IIlIlIlIIlllIIIlIIIIlIIIl() ? "mob.villager.haggle" : "mob.villager.idle";
    }

    @Override
    protected String lIIlIlllIIlllIIlllIIlIlII() {
        return "mob.villager.hit";
    }

    @Override
    protected String lIIlIIIlIlIIlllIlIllIllIl() {
        return "mob.villager.death";
    }

    public void lIIlIIIIIlIlllIlIIlIlIlll(int n) {
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIlIIlIIIlIlIIIllIlllIl(16, n);
    }

    public int lllIIIlIllIlllIlIIllIllIl() {
        return this.IlIlIllIIlIIIIlllIlIllIlI.IlIllllllIIlIIllllIIlIIIl(16);
    }

    public boolean IIlIlIIIIlIlllIIlIIlIIIII() {
        return this.lIIlIlllIIlllIIlllIIlIlII;
    }

    public void IIIllIllIIlIlIlIlIllllIIl(boolean bl) {
        this.lIIlIlllIIlllIIlllIIlIlII = bl;
    }

    public void IllIIIllIIIIlIlIlIllIIlll(boolean bl) {
        this.lIIlIIIlIlIIlllIlIllIllIl = bl;
    }

    public boolean lIllIIlllIIIlIlIIIlllIlIl() {
        return this.lIIlIIIlIlIIlllIlIllIllIl;
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl(class_1965 class_19652) {
        super.IlIllllllIIlIIllllIIlIIIl(class_19652);
        if (this.lIIIlIllllIlllIIIIIllIIIl != null && class_19652 != null) {
            this.lIIIlIllllIlllIIIIIllIIIl.lllIIIllIIIIlllIlIIllIIll(class_19652);
            if (class_19652 instanceof class_0814) {
                int n = -1;
                if (this.g_()) {
                    n = -3;
                }
                this.lIIIlIllllIlllIIIIIllIIIl.lllIIIllIIIIlllIlIIllIIll(class_19652.llllIIIIlIIIlIIIIIIlIllll(), n);
                if (this.IlllIIlllllllIIllIlIllllI()) {
                    this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll((class_1521)this, (byte)13);
                }
            }
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0058 class_00582) {
        if (this.lIIIlIllllIlllIIIIIllIIIl != null) {
            class_0814 class_08142;
            class_1521 class_15212 = class_00582.IllIIIllIIIIlIlIlIllIIlll();
            if (class_15212 != null) {
                if (class_15212 instanceof class_0814) {
                    this.lIIIlIllllIlllIIIIIllIIIl.lllIIIllIIIIlllIlIIllIIll(class_15212.llllIIIIlIIIlIIIIIIlIllll(), -2);
                } else if (class_15212 instanceof class_1310) {
                    this.lIIIlIllllIlllIIIIIllIIIl.IllIIlllllllIIlIIlIIIIlIl();
                }
            } else if (class_15212 == null && (class_08142 = this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll((class_1521)this, 16.0)) != null) {
                this.lIIIlIllllIlllIIIIIllIIIl.IllIIlllllllIIlIIlIIIIlIl();
            }
        }
        super.lllIIIllIIIIlllIlIIllIIll(class_00582);
    }

    @Override
    public void a_(class_0814 class_08142) {
        this.lIIlIlIIIIIllIIIIllIlIlII = class_08142;
    }

    @Override
    public class_0814 lllIIIllIIIIlllIlIIllIIll() {
        return this.lIIlIlIIIIIllIIIIllIlIlII;
    }

    public boolean IIlIlIlIIlllIIIlIIIIlIIIl() {
        return this.lIIlIlIIIIIllIIIIllIlIlII != null;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_2187 class_21872) {
        class_21872.IlIIIIIllllllIIlllIllllll();
        this.lIllllIIlIIIlIllllllIIIll = -this.IIllIllIIllIIlllIIIlIlllI();
        this.lllIIIllIIIIlllIlIIllIIll("mob.villager.yes", this.IIlIlIIIIlIlllIlIlIIIIIlI(), this.IlIlIIllIlIlIIIIIlIlllllI());
        if (class_21872.lllIIIllIIIIlllIlIIllIIll((class_2187)this.lIIIIlIIIIllIlIIllllIlIII.get(this.lIIIIlIIIIllIlIIllllIlIII.size() - 1))) {
            this.lIIIlllllllIlllIIllllllll = 40;
            this.IIllllIIlIlIlIlllIIIllIIl = true;
            this.lIlIlllIllllIIlllIlllIIIl = this.lIIlIlIIIIIllIIIIllIlIlII != null ? this.lIIlIlIIIIIllIIIIllIlIlII.llllIIIIlIIIlIIIIIIlIllll() : null;
        }
        if (class_21872.lllIIIllIIIIlllIlIIllIIll().lllIIIllIIIIlllIlIIllIIll() == Items.IIllllIIlIlIlIlllIIIllIIl) {
            this.IIIllIIIlIlllllllIIIlllll += class_21872.lllIIIllIIIIlllIlIIllIIll().lllIlIIlIIIlIlIIIllIlllIl;
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972) {
        if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl && this.lIllllIIlIIIlIllllllIIIll > -this.IIllIllIIllIIlllIIIlIlllI() + 20) {
            this.lIllllIIlIIIlIllllllIIIll = -this.IIllIllIIllIIlllIIIlIlllI();
            if (class_08972 != null) {
                this.lllIIIllIIIIlllIlIIllIIll("mob.villager.yes", this.IIlIlIIIIlIlllIlIlIIIIIlI(), this.IlIlIIllIlIlIIIIIlIlllllI());
            } else {
                this.lllIIIllIIIIlllIlIIllIIll("mob.villager.no", this.IIlIlIIIIlIlllIlIlIIIIIlI(), this.IlIlIIllIlIlIIIIIlIlllllI());
            }
        }
    }

    @Override
    public class_1596 lllIlIIlIIIlIlIIIllIlllIl(class_0814 class_08142) {
        if (this.lIIIIlIIIIllIlIIllllIlIII == null) {
            this.lIlIlIIlIIIIlIIIIIlllIIII(1);
        }
        return this.lIIIIlIIIIllIlIIllllIlIII;
    }

    private float IlIlIIlIlIllIIlIlIIllIIIl(float f) {
        float f2 = f + this.IIlllllIIlIIlIlIIlIIlIlII;
        return f2 > 0.9f ? 0.9f - (f2 - 0.9f) : f2;
    }

    private void lIlIlIIlIIIIlIIIIIlllIIII(int n) {
        this.IIlllllIIlIIlIlIIlIIlIlII = this.lIIIIlIIIIllIlIIllllIlIII != null ? MathHelper.IlIllllllIIlIIllllIIlIIIl((float)this.lIIIIlIIIIllIlIIllllIlIII.size()) * 0.2f : 0.0f;
        class_1596 class_15962 = new class_1596();
        switch (this.lllIIIlIllIlllIlIIllIllIl()) {
            case 0: {
                class_1817.lllIIIllIIIIlllIlIIllIIll(class_15962, Items.wheat, this.IlllIIlllllllIIllIlIllllI, this.IlIlIIlIlIllIIlIlIIllIIIl(0.9f));
                class_1817.lllIIIllIIIIlllIlIIllIIll(class_15962, Item.getItemFromBlock(Blocks.llllllIlIllllIlIlIlIIIIlI), this.IlllIIlllllllIIllIlIllllI, this.IlIlIIlIlIllIIlIlIIllIIIl(0.5f));
                class_1817.lllIIIllIIIIlllIlIIllIIll(class_15962, Items.IIIIlIIIllIIIlIIlIIIIIlll, this.IlllIIlllllllIIllIlIllllI, this.IlIlIIlIlIllIIlIlIIllIIIl(0.5f));
                class_1817.lllIIIllIIIIlllIlIIllIIll(class_15962, Items.cooked_fished, this.IlllIIlllllllIIllIlIllllI, this.IlIlIIlIlIllIIlIlIIllIIIl(0.4f));
                class_1817.lllIlIIlIIIlIlIIIllIlllIl(class_15962, Items.bread, this.IlllIIlllllllIIllIlIllllI, this.IlIlIIlIlIllIIlIlIIllIIIl(0.9f));
                class_1817.lllIlIIlIIIlIlIIIllIlllIl(class_15962, Items.IllIlIlIIIlIllIlIlIIlllII, this.IlllIIlllllllIIllIlIllllI, this.IlIlIIlIlIllIIlIlIIllIIIl(0.3f));
                class_1817.lllIlIIlIIIlIlIIIllIlllIl(class_15962, Items.IlIIIIIllllllIIlllIllllll, this.IlllIIlllllllIIllIlIllllI, this.IlIlIIlIlIllIIlIlIIllIIIl(0.3f));
                class_1817.lllIlIIlIIIlIlIIIllIlllIl(class_15962, Items.lIIllllIllIlllllIIllIllIl, this.IlllIIlllllllIIllIlIllllI, this.IlIlIIlIlIllIIlIlIIllIIIl(0.3f));
                class_1817.lllIlIIlIIIlIlIIIllIlllIl(class_15962, Items.llllIIllllIllIlllllIIlIlI, this.IlllIIlllllllIIllIlIllllI, this.IlIlIIlIlIllIIlIlIIllIIIl(0.3f));
                class_1817.lllIlIIlIIIlIlIIIllIlllIl(class_15962, Items.flint_and_steel, this.IlllIIlllllllIIllIlIllllI, this.IlIlIIlIlIllIIlIlIIllIIIl(0.3f));
                class_1817.lllIlIIlIIIlIlIIIllIlllIl(class_15962, Items.lIIIIIlIllIllIlIlIIllllll, this.IlllIIlllllllIIllIlIllllI, this.IlIlIIlIlIllIIlIlIIllIIIl(0.3f));
                class_1817.lllIlIIlIIIlIlIIIllIlllIl(class_15962, Items.arrow, this.IlllIIlllllllIIllIlIllllI, this.IlIlIIlIlIllIIlIlIIllIIIl(0.5f));
                if (!(this.IlllIIlllllllIIllIlIllllI.nextFloat() < this.IlIlIIlIlIllIIlIlIIllIIIl(0.5f))) break;
                class_15962.add(new class_2187(new ItemStack(Blocks.lllIIlIIIllllllIIIIlIlIlI, 10), new ItemStack(Items.IIllllIIlIlIlIlllIIIllIIl), new ItemStack(Items.IIIlIlIllIlllllIlIllllllI, 4 + this.IlllIIlllllllIIllIlIllllI.nextInt(2), 0)));
                break;
            }
            case 1: {
                class_1817.lllIIIllIIIIlllIlIIllIIll(class_15962, Items.IIIIIllIlIllIlIlIIlIllIIl, this.IlllIIlllllllIIllIlIllllI, this.IlIlIIlIlIllIIlIlIIllIIIl(0.8f));
                class_1817.lllIIIllIIIIlllIlIIllIIll(class_15962, Items.book, this.IlllIIlllllllIIllIlIllllI, this.IlIlIIlIlIllIIlIlIIllIIIl(0.8f));
                class_1817.lllIIIllIIIIlllIlIIllIIll(class_15962, Items.lIIIlllllllIlllIIllllllll, this.IlllIIlllllllIIllIlIllllI, this.IlIlIIlIlIllIIlIlIIllIIIl(0.3f));
                class_1817.lllIlIIlIIIlIlIIIllIlllIl(class_15962, Item.getItemFromBlock(Blocks.bookshelf), this.IlllIIlllllllIIllIlIllllI, this.IlIlIIlIlIllIIlIlIIllIIIl(0.8f));
                class_1817.lllIlIIlIIIlIlIIIllIlllIl(class_15962, Item.getItemFromBlock(Blocks.lIlIllIIlIIlIIlIIlIIlIIll), this.IlllIIlllllllIIllIlIllllI, this.IlIlIIlIlIllIIlIlIIllIIIl(0.2f));
                class_1817.lllIlIIlIIIlIlIIIllIlllIl(class_15962, Items.lllllllIlIIlIlIIIlIlIIlll, this.IlllIIlllllllIIllIlIllllI, this.IlIlIIlIlIllIIlIlIIllIIIl(0.2f));
                class_1817.lllIlIIlIIIlIlIIIllIlllIl(class_15962, Items.IIIIlllIIlIllllllIllIIlll, this.IlllIIlllllllIIllIlIllllI, this.IlIlIIlIlIllIIlIlIIllIIIl(0.2f));
                if (!(this.IlllIIlllllllIIllIlIllllI.nextFloat() < this.IlIlIIlIlIllIIlIlIIllIIIl(0.07f))) break;
                Object object = class_1469.lllIlIIlIIIlIlIIIllIlllIl[this.IlllIIlllllllIIllIlIllllI.nextInt(class_1469.lllIlIIlIIIlIlIIIllIlllIl.length)];
                int n2 = MathHelper.lllIIIllIIIIlllIlIIllIIll(this.IlllIIlllllllIIllIlIllllI, ((class_1469)object).lllIlIIlIIIlIlIIIllIlllIl(), ((class_1469)object).IlIllllllIIlIIllllIIlIIIl());
                ItemStack class_08972 = Items.lIllIlIlIIIIlIlIIlIlIlllI.lllIIIllIIIIlllIlIIllIIll(new class_1129((class_1469)object, n2));
                int n3 = 2 + this.IlllIIlllllllIIllIlIllllI.nextInt(5 + n2 * 10) + 3 * n2;
                class_15962.add(new class_2187(new ItemStack(Items.book), new ItemStack(Items.IIllllIIlIlIlIlllIIIllIIl, n3), class_08972));
                break;
            }
            case 2: {
                int n3;
                class_1817.lllIlIIlIIIlIlIIIllIlllIl(class_15962, Items.ender_eye, this.IlllIIlllllllIIllIlIllllI, this.IlIlIIlIlIllIIlIlIIllIIIl(0.3f));
                class_1817.lllIlIIlIIIlIlIIIllIlllIl(class_15962, Items.experience_bottle, this.IlllIIlllllllIIllIlIllllI, this.IlIlIIlIlIllIIlIlIIllIIIl(0.2f));
                class_1817.lllIlIIlIIIlIlIIIllIlllIl(class_15962, Items.lIIIlIIllIllIIlIIlIIIllII, this.IlllIIlllllllIIllIlIllllI, this.IlIlIIlIlIllIIlIlIIllIIIl(0.4f));
                class_1817.lllIlIIlIIIlIlIIIllIlllIl(class_15962, Item.getItemFromBlock(Blocks.IIIIlllIIlIllllllIllIIlll), this.IlllIIlllllllIIllIlIllllI, this.IlIlIIlIlIllIIlIlIIllIIIl(0.3f));
                Object object = new Item[]{Items.llIIlllIllIllllIIIlIIIIII, Items.diamond_sword, Items.lIIIllIIIIIllllIlIlIllIll, Items.IllllIIlIIIllIlllIlllIllI, Items.IlIllllllIIlIIllllIIlIIIl, Items.llIIlIllIllllIlIIIIlIIlll, Items.lllIlIIlIIIlIlIIIllIlllIl, Items.lIlIllIIlIIlIIlIIlIIlIIll};
                Item[] arrclass_0611 = object;
                int n4 = ((Item[])object).length;
                for (n3 = 0; n3 < n4; ++n3) {
                    Item class_06112 = arrclass_0611[n3];
                    if (!(this.IlllIIlllllllIIllIlIllllI.nextFloat() < this.IlIlIIlIlIllIIlIlIIllIIIl(0.05f))) continue;
                    class_15962.add(new class_2187(new ItemStack(class_06112, 1, 0), new ItemStack(Items.IIllllIIlIlIlIlllIIIllIIl, 2 + this.IlllIIlllllllIIllIlIllllI.nextInt(3), 0), class_1250.lllIIIllIIIIlllIlIIllIIll(this.IlllIIlllllllIIllIlIllllI, new ItemStack(class_06112, 1, 0), 5 + this.IlllIIlllllllIIllIlIllllI.nextInt(15))));
                }
                break;
            }
            case 3: {
                class_1817.lllIIIllIIIIlllIlIIllIIll(class_15962, Items.IllIIlllllllIIlIIlIIIIlIl, this.IlllIIlllllllIIllIlIllllI, this.IlIlIIlIlIllIIlIlIIllIIIl(0.7f));
                class_1817.lllIIIllIIIIlllIlIIllIIll(class_15962, Items.iron_ingot, this.IlllIIlllllllIIllIlIllllI, this.IlIlIIlIlIllIIlIlIIllIIIl(0.5f));
                class_1817.lllIIIllIIIIlllIlIIllIIll(class_15962, Items.lIIIIlIlIIlllllIIllIIlIII, this.IlllIIlllllllIIllIlIllllI, this.IlIlIIlIlIllIIlIlIIllIIIl(0.5f));
                class_1817.lllIIIllIIIIlllIlIIllIIll(class_15962, Items.diamond, this.IlllIIlllllllIIllIlIllllI, this.IlIlIIlIlIllIIlIlIIllIIIl(0.5f));
                class_1817.lllIlIIlIIIlIlIIIllIlllIl(class_15962, Items.llIIlllIllIllllIIIlIIIIII, this.IlllIIlllllllIIllIlIllllI, this.IlIlIIlIlIllIIlIlIIllIIIl(0.5f));
                class_1817.lllIlIIlIIIlIlIIIllIlllIl(class_15962, Items.diamond_sword, this.IlllIIlllllllIIllIlIllllI, this.IlIlIIlIlIllIIlIlIIllIIIl(0.5f));
                class_1817.lllIlIIlIIIlIlIIIllIlllIl(class_15962, Items.IlIllllllIIlIIllllIIlIIIl, this.IlllIIlllllllIIllIlIllllI, this.IlIlIIlIlIllIIlIlIIllIIIl(0.3f));
                class_1817.lllIlIIlIIIlIlIIIllIlllIl(class_15962, Items.llIIlIllIllllIlIIIIlIIlll, this.IlllIIlllllllIIllIlIllllI, this.IlIlIIlIlIllIIlIlIIllIIIl(0.3f));
                class_1817.lllIlIIlIIIlIlIIIllIlllIl(class_15962, Items.lllIlIIlIIIlIlIIIllIlllIl, this.IlllIIlllllllIIllIlIllllI, this.IlIlIIlIlIllIIlIlIIllIIIl(0.5f));
                class_1817.lllIlIIlIIIlIlIIIllIlllIl(class_15962, Items.lIlIllIIlIIlIIlIIlIIlIIll, this.IlllIIlllllllIIllIlIllllI, this.IlIlIIlIlIllIIlIlIIllIIIl(0.5f));
                class_1817.lllIlIIlIIIlIlIIIllIlllIl(class_15962, Items.lllIIIllIIIIlllIlIIllIIll, this.IlllIIlllllllIIllIlIllllI, this.IlIlIIlIlIllIIlIlIIllIIIl(0.2f));
                class_1817.lllIlIIlIIIlIlIIIllIlllIl(class_15962, Items.IIlllIlIlllIllIIIlllIIlIl, this.IlllIIlllllllIIllIlIllllI, this.IlIlIIlIlIllIIlIlIIllIIIl(0.2f));
                class_1817.lllIlIIlIIIlIlIIIllIlllIl(class_15962, Items.IIllIllIIllIIlllIIIlIlllI, this.IlllIIlllllllIIllIlIllllI, this.IlIlIIlIlIllIIlIlIIllIIIl(0.2f));
                class_1817.lllIlIIlIIIlIlIIIllIlllIl(class_15962, Items.llllllIlIllllIlIlIlIIIIlI, this.IlllIIlllllllIIllIlIllllI, this.IlIlIIlIlIllIIlIlIIllIIIl(0.2f));
                class_1817.lllIlIIlIIIlIlIIIllIlllIl(class_15962, Items.lIIlIlllIllIlIlllIIIIIIII, this.IlllIIlllllllIIllIlIllllI, this.IlIlIIlIlIllIIlIlIIllIIIl(0.2f));
                class_1817.lllIlIIlIIIlIlIIIllIlllIl(class_15962, Items.diamond_boots, this.IlllIIlllllllIIllIlIllllI, this.IlIlIIlIlIllIIlIlIIllIIIl(0.2f));
                class_1817.lllIlIIlIIIlIlIIIllIlllIl(class_15962, Items.llIlllIlIIllIlIIIIllIIlIl, this.IlllIIlllllllIIllIlIllllI, this.IlIlIIlIlIllIIlIlIIllIIIl(0.2f));
                class_1817.lllIlIIlIIIlIlIIIllIlllIl(class_15962, Items.IIlIllIIlllllIIlIIllllIIl, this.IlllIIlllllllIIllIlIllllI, this.IlIlIIlIlIllIIlIlIIllIIIl(0.2f));
                class_1817.lllIlIIlIIIlIlIIIllIlllIl(class_15962, Items.lIIIllIIIIIllllIlIlIllIll, this.IlllIIlllllllIIllIlIllllI, this.IlIlIIlIlIllIIlIlIIllIIIl(0.2f));
                class_1817.lllIlIIlIIIlIlIIIllIlllIl(class_15962, Items.IllllIIlIIIllIlllIlllIllI, this.IlllIIlllllllIIllIlIllllI, this.IlIlIIlIlIllIIlIlIIllIIIl(0.2f));
                class_1817.lllIlIIlIIIlIlIIIllIlllIl(class_15962, Items.lIIIlIIIlIlllIllIIIlIIIlI, this.IlllIIlllllllIIllIlIllllI, this.IlIlIIlIlIllIIlIlIIllIIIl(0.2f));
                class_1817.lllIlIIlIIIlIlIIIllIlllIl(class_15962, Items.IllIlIlIIIlllIIllIIIIlIll, this.IlllIIlllllllIIllIlIllllI, this.IlIlIIlIlIllIIlIlIIllIIIl(0.2f));
                class_1817.lllIlIIlIIIlIlIIIllIlllIl(class_15962, Items.IllIIIlllllIlIlllIlllllII, this.IlllIIlllllllIIllIlIllllI, this.IlIlIIlIlIllIIlIlIIllIIIl(0.1f));
                class_1817.lllIlIIlIIIlIlIIIllIlllIl(class_15962, Items.IIIIlIlIIlIIIIlIlllIlIIII, this.IlllIIlllllllIIllIlIllllI, this.IlIlIIlIlIllIIlIlIIllIIIl(0.1f));
                class_1817.lllIlIIlIIIlIlIIIllIlllIl(class_15962, Items.lllIIIIlIlIIlIIlllIIIIIIl, this.IlllIIlllllllIIllIlIllllI, this.IlIlIIlIlIllIIlIlIIllIIIl(0.1f));
                class_1817.lllIlIIlIIIlIlIIIllIlllIl(class_15962, Items.llIlIIlllIIIIIllIIlIlIIII, this.IlllIIlllllllIIllIlIllllI, this.IlIlIIlIlIllIIlIlIIllIIIl(0.1f));
                break;
            }
            case 4: {
                class_1817.lllIIIllIIIIlllIlIIllIIll(class_15962, Items.IllIIlllllllIIlIIlIIIIlIl, this.IlllIIlllllllIIllIlIllllI, this.IlIlIIlIlIllIIlIlIIllIIIl(0.7f));
                class_1817.lllIIIllIIIIlllIlIIllIIll(class_15962, Items.IIIIlIllIlIIIIIllllIIlllI, this.IlllIIlllllllIIllIlIllllI, this.IlIlIIlIlIllIIlIlIIllIIIl(0.5f));
                class_1817.lllIIIllIIIIlllIlIIllIIll(class_15962, Items.lIIlIlllIIlIIIIlIlIIIIlll, this.IlllIIlllllllIIllIlIllllI, this.IlIlIIlIlIllIIlIlIIllIIIl(0.5f));
                class_1817.lllIlIIlIIIlIlIIIllIlllIl(class_15962, Items.saddle, this.IlllIIlllllllIIllIlIllllI, this.IlIlIIlIlIllIIlIlIIllIIIl(0.1f));
                class_1817.lllIlIIlIIIlIlIIIllIlllIl(class_15962, Items.lIlIlIIIIIIlIIllllIlIIllI, this.IlllIIlllllllIIllIlIllllI, this.IlIlIIlIlIllIIlIlIIllIIIl(0.3f));
                class_1817.lllIlIIlIIIlIlIIIllIlllIl(class_15962, Items.llllIlIIIIIIIIIlllIIlIIIl, this.IlllIIlllllllIIllIlIllllI, this.IlIlIIlIlIllIIlIlIIllIIIl(0.3f));
                class_1817.lllIlIIlIIIlIlIIIllIlllIl(class_15962, Items.llIIlIIllIIllIlIIllIIllII, this.IlllIIlllllllIIllIlIllllI, this.IlIlIIlIlIllIIlIlIIllIIIl(0.3f));
                class_1817.lllIlIIlIIIlIlIIIllIlllIl(class_15962, Items.IllllIIIIlIIlIIIIlllIIIIl, this.IlllIIlllllllIIllIlIllllI, this.IlIlIIlIlIllIIlIlIIllIIIl(0.3f));
                class_1817.lllIlIIlIIIlIlIIIllIlllIl(class_15962, Items.llllIlIIllIIlllllIIllIIll, this.IlllIIlllllllIIllIlIllllI, this.IlIlIIlIlIllIIlIlIIllIIIl(0.3f));
                class_1817.lllIlIIlIIIlIlIIIllIlllIl(class_15962, Items.IIIlIIllIIlIlIIlIIllIIIIl, this.IlllIIlllllllIIllIlIllllI, this.IlIlIIlIlIllIIlIlIIllIIIl(0.3f));
            }
        }
        if (class_15962.isEmpty()) {
            class_1817.lllIIIllIIIIlllIlIIllIIll(class_15962, Items.lIIIIlIlIIlllllIIllIIlIII, this.IlllIIlllllllIIllIlIllllI, 1.0f);
        }
        Collections.shuffle(class_15962);
        if (this.lIIIIlIIIIllIlIIllllIlIII == null) {
            this.lIIIIlIIIIllIlIIllllIlIII = new class_1596();
        }
        for (int i = 0; i < n && i < class_15962.size(); ++i) {
            this.lIIIIlIIIIllIlIIllllIlIII.lllIIIllIIIIlllIlIIllIIll((class_2187)class_15962.get(i));
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1596 class_15962) {
    }

    private static void lllIIIllIIIIlllIlIIllIIll(class_1596 class_15962, Item class_06112, Random random, float f) {
        if (random.nextFloat() < f) {
            class_15962.add(new class_2187(class_1817.lllIIIllIIIIlllIlIIllIIll(class_06112, random), Items.IIllllIIlIlIlIlllIIIllIIl));
        }
    }

    private static ItemStack lllIIIllIIIIlllIlIIllIIll(Item class_06112, Random random) {
        return new ItemStack(class_06112, class_1817.lllIlIIlIIIlIlIIIllIlllIl(class_06112, random), 0);
    }

    private static int lllIlIIlIIIlIlIIIllIlllIl(Item class_06112, Random random) {
        class_0804 class_08042 = (class_0804)IIlIlIIIIlIlllIlIlIIIIIlI.get(class_06112);
        return class_08042 == null ? 1 : ((Integer)class_08042.lllIIIllIIIIlllIlIIllIIll() >= (Integer)class_08042.lllIlIIlIIIlIlIIIllIlllIl() ? (Integer)class_08042.lllIIIllIIIIlllIlIIllIIll() : (Integer)class_08042.lllIIIllIIIIlllIlIIllIIll() + random.nextInt((Integer)class_08042.lllIlIIlIIIlIlIIIllIlllIl() - (Integer)class_08042.lllIIIllIIIIlllIlIIllIIll()));
    }

    private static void lllIlIIlIIIlIlIIIllIlllIl(class_1596 class_15962, Item class_06112, Random random, float f) {
        if (random.nextFloat() < f) {
            ItemStack class_08972;
            ItemStack class_08973;
            int n = class_1817.IlIllllllIIlIIllllIIlIIIl(class_06112, random);
            if (n < 0) {
                class_08973 = new ItemStack(Items.IIllllIIlIlIlIlllIIIllIIl, 1, 0);
                class_08972 = new ItemStack(class_06112, -n, 0);
            } else {
                class_08973 = new ItemStack(Items.IIllllIIlIlIlIlllIIIllIIl, n, 0);
                class_08972 = new ItemStack(class_06112, 1, 0);
            }
            class_15962.add(new class_2187(class_08973, class_08972));
        }
    }

    private static int IlIllllllIIlIIllllIIlIIIl(Item class_06112, Random random) {
        class_0804 class_08042 = (class_0804)IlIlIIllIlIlIIIIIlIlllllI.get(class_06112);
        return class_08042 == null ? 1 : ((Integer)class_08042.lllIIIllIIIIlllIlIIllIIll() >= (Integer)class_08042.lllIlIIlIIIlIlIIIllIlllIl() ? (Integer)class_08042.lllIIIllIIIIlllIlIIllIIll() : (Integer)class_08042.lllIIIllIIIIlllIlIIllIIll() + random.nextInt((Integer)class_08042.lllIlIIlIIIlIlIIIllIlllIl() - (Integer)class_08042.lllIIIllIIIIlllIlIIllIIll()));
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(byte by) {
        if (by == 12) {
            this.lllIlIIlIIIlIlIIIllIlllIl("heart");
        } else if (by == 13) {
            this.lllIlIIlIIIlIlIIIllIlllIl("angryVillager");
        } else if (by == 14) {
            this.lllIlIIlIIIlIlIIIllIlllIl("happyVillager");
        } else {
            super.lllIIIllIIIIlllIlIIllIIll(by);
        }
    }

    private void lllIlIIlIIIlIlIIIllIlllIl(String string) {
        for (int i = 0; i < 5; ++i) {
            double d = this.IlllIIlllllllIIllIlIllllI.nextGaussian() * 0.02;
            double d2 = this.IlllIIlllllllIIllIlIllllI.nextGaussian() * 0.02;
            double d3 = this.IlllIIlllllllIIllIlIllllI.nextGaussian() * 0.02;
            this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(string, this.IlIIlllllIIlIlIlllllIllll + (double)(this.IlllIIlllllllIIllIlIllllI.nextFloat() * this.IIIIlIlIIlIIIIlIlllIlIIII * 2.0f) - (double)this.IIIIlIlIIlIIIIlIlllIlIIII, this.llIIlIlIlllIIllIlIlllIllI + 1.0 + (double)(this.IlllIIlllllllIIllIlIllllI.nextFloat() * this.lllIIIIlIlIIlIIlllIIIIIIl), this.IllIIIIllIIllIllIlllIlIIl + (double)(this.IlllIIlllllllIIllIlIllllI.nextFloat() * this.IIIIlIlIIlIIIIlIlllIlIIII * 2.0f) - (double)this.IIIIlIlIIlIIIIlIlllIlIIII, d, d2, d3);
        }
    }

    @Override
    public class_2025 lllIIIllIIIIlllIlIIllIIll(class_2025 class_20252) {
        class_20252 = super.lllIIIllIIIIlllIlIIllIIll(class_20252);
        this.lIIlIIIIIlIlllIlIIlIlIlll(this.lIlIllIIlIIlIIlIIlIIlIIll.lllllIlllIIllIlIIlIIIllII.nextInt(5));
        return class_20252;
    }

    public void lllIIIIlIIllIIIlIllIlllII() {
        this.lIlIllllIlIIIIIllIIIIlIlI = true;
    }

    public class_1817 lllIlIIlIIIlIlIIIllIlllIl(class_0650 class_06502) {
        class_1817 class_18172 = new class_1817(this.lIlIllIIlIIlIIlIIlIIlIIll);
        class_18172.lllIIIllIIIIlllIlIIllIIll((class_2025)null);
        return class_18172;
    }

    @Override
    public boolean IIIIlIIIllIIIlIIlIIIIIlll() {
        return false;
    }

    @Override
    public /* synthetic */ class_0650 lllIIIllIIIIlllIlIIllIIll(class_0650 class_06502) {
        return this.lllIlIIlIIIlIlIIIllIlllIl(class_06502);
    }

    static {
        IIlIlIIIIlIlllIlIlIIIIIlI.put(Items.IllIIlllllllIIlIIlIIIIlIl, new class_0804(16, 24));
        IIlIlIIIIlIlllIlIlIIIIIlI.put(Items.iron_ingot, new class_0804(8, 10));
        IIlIlIIIIlIlllIlIlIIIIIlI.put(Items.lIIIIlIlIIlllllIIllIIlIII, new class_0804(8, 10));
        IIlIlIIIIlIlllIlIlIIIIIlI.put(Items.diamond, new class_0804(4, 6));
        IIlIlIIIIlIlllIlIlIIIIIlI.put(Items.IIIIIllIlIllIlIlIIlIllIIl, new class_0804(24, 36));
        IIlIlIIIIlIlllIlIlIIIIIlI.put(Items.book, new class_0804(11, 13));
        IIlIlIIIIlIlllIlIlIIIIIlI.put(Items.lIIIlllllllIlllIIllllllll, new class_0804(1, 1));
        IIlIlIIIIlIlllIlIlIIIIIlI.put(Items.IlIIIIIIIIIIlIIlllIIIlIlI, new class_0804(3, 4));
        IIlIlIIIIlIlllIlIlIIIIIlI.put(Items.ender_eye, new class_0804(2, 3));
        IIlIlIIIIlIlllIlIlIIIIIlI.put(Items.IIIIlIllIlIIIIIllllIIlllI, new class_0804(14, 18));
        IIlIlIIIIlIlllIlIlIIIIIlI.put(Items.lIIlIlllIIlIIIIlIlIIIIlll, new class_0804(14, 18));
        IIlIlIIIIlIlllIlIlIIIIIlI.put(Items.IIIIlIIIllIIIlIIlIIIIIlll, new class_0804(14, 18));
        IIlIlIIIIlIlllIlIlIIIIIlI.put(Items.cooked_fished, new class_0804(9, 13));
        IIlIlIIIIlIlllIlIlIIIIIlI.put(Items.llIlllIIllIlllIlIlIlIIIll, new class_0804(34, 48));
        IIlIlIIIIlIlllIlIlIIIIIlI.put(Items.IIIlIllIlllIlIIIlIlIIllII, new class_0804(30, 38));
        IIlIlIIIIlIlllIlIlIIIIIlI.put(Items.lIIIllIlIlIlIIIllIlIlIllI, new class_0804(30, 38));
        IIlIlIIIIlIlllIlIlIIIIIlI.put(Items.wheat, new class_0804(18, 22));
        IIlIlIIIIlIlllIlIlIIIIIlI.put(Item.getItemFromBlock(Blocks.llllllIlIllllIlIlIlIIIIlI), new class_0804(14, 22));
        IIlIlIIIIlIlllIlIlIIIIIlI.put(Items.lIIIlllIlIIIlIllIIIlIllll, new class_0804(36, 64));
        IlIlIIllIlIlIIIIIlIlllllI.put(Items.flint_and_steel, new class_0804(3, 4));
        IlIlIIllIlIlIIIIIlIlllllI.put(Items.llllIIllllIllIlllllIIlIlI, new class_0804(3, 4));
        IlIlIIllIlIlIIIIIlIlllllI.put(Items.llIIlllIllIllllIIIlIIIIII, new class_0804(7, 11));
        IlIlIIllIlIlIIIIIlIlllllI.put(Items.diamond_sword, new class_0804(12, 14));
        IlIlIIllIlIlIIIIIlIlllllI.put(Items.IlIllllllIIlIIllllIIlIIIl, new class_0804(6, 8));
        IlIlIIllIlIlIIIIIlIlllllI.put(Items.llIIlIllIllllIlIIIIlIIlll, new class_0804(9, 12));
        IlIlIIllIlIlIIIIIlIlllllI.put(Items.lllIlIIlIIIlIlIIIllIlllIl, new class_0804(7, 9));
        IlIlIIllIlIlIIIIIlIlllllI.put(Items.lIlIllIIlIIlIIlIIlIIlIIll, new class_0804(10, 12));
        IlIlIIllIlIlIIIIIlIlllllI.put(Items.lllIIIllIIIIlllIlIIllIIll, new class_0804(4, 6));
        IlIlIIllIlIlIIIIIlIlllllI.put(Items.IIlllIlIlllIllIIIlllIIlIl, new class_0804(7, 8));
        IlIlIIllIlIlIIIIIlIlllllI.put(Items.IIllIllIIllIIlllIIIlIlllI, new class_0804(4, 6));
        IlIlIIllIlIlIIIIIlIlllllI.put(Items.llllllIlIllllIlIlIlIIIIlI, new class_0804(7, 8));
        IlIlIIllIlIlIIIIIlIlllllI.put(Items.lIIlIlllIllIlIlllIIIIIIII, new class_0804(4, 6));
        IlIlIIllIlIlIIIIIlIlllllI.put(Items.diamond_boots, new class_0804(7, 8));
        IlIlIIllIlIlIIIIIlIlllllI.put(Items.llIlllIlIIllIlIIIIllIIlIl, new class_0804(4, 6));
        IlIlIIllIlIlIIIIIlIlllllI.put(Items.IIlIllIIlllllIIlIIllllIIl, new class_0804(7, 8));
        IlIlIIllIlIlIIIIIlIlllllI.put(Items.lIIIllIIIIIllllIlIlIllIll, new class_0804(10, 14));
        IlIlIIllIlIlIIIIIlIlllllI.put(Items.IllllIIlIIIllIlllIlllIllI, new class_0804(16, 19));
        IlIlIIllIlIlIIIIIlIlllllI.put(Items.lIIIlIIIlIlllIllIIIlIIIlI, new class_0804(8, 10));
        IlIlIIllIlIlIIIIIlIlllllI.put(Items.IllIlIlIIIlllIIllIIIIlIll, new class_0804(11, 14));
        IlIlIIllIlIlIIIIIlIlllllI.put(Items.IllIIIlllllIlIlllIlllllII, new class_0804(5, 7));
        IlIlIIllIlIlIIIIIlIlllllI.put(Items.IIIIlIlIIlIIIIlIlllIlIIII, new class_0804(5, 7));
        IlIlIIllIlIlIIIIIlIlllllI.put(Items.lllIIIIlIlIIlIIlllIIIIIIl, new class_0804(11, 15));
        IlIlIIllIlIlIIIIIlIlllllI.put(Items.llIlIIlllIIIIIllIIlIlIIII, new class_0804(9, 11));
        IlIlIIllIlIlIIIIIlIlllllI.put(Items.bread, new class_0804(-4, -2));
        IlIlIIllIlIlIIIIIlIlllllI.put(Items.IllIlIlIIIlIllIlIlIIlllII, new class_0804(-8, -4));
        IlIlIIllIlIlIIIIIlIlllllI.put(Items.IlIIIIIllllllIIlllIllllll, new class_0804(-8, -4));
        IlIlIIllIlIlIIIIIlIlllllI.put(Items.lIIllllIllIlllllIIllIllIl, new class_0804(-10, -7));
        IlIlIIllIlIlIIIIIlIlllllI.put(Item.getItemFromBlock(Blocks.lIlIllIIlIIlIIlIIlIIlIIll), new class_0804(-5, -3));
        IlIlIIllIlIlIIIIIlIlllllI.put(Item.getItemFromBlock(Blocks.bookshelf), new class_0804(3, 4));
        IlIlIIllIlIlIIIIIlIlllllI.put(Items.lIlIlIIIIIIlIIllllIlIIllI, new class_0804(4, 5));
        IlIlIIllIlIlIIIIIlIlllllI.put(Items.llllIlIIIIIIIIIlllIIlIIIl, new class_0804(2, 4));
        IlIlIIllIlIlIIIIIlIlllllI.put(Items.llIIlIIllIIllIlIIllIIllII, new class_0804(2, 4));
        IlIlIIllIlIlIIIIIlIlllllI.put(Items.IllllIIIIlIIlIIIIlllIIIIl, new class_0804(2, 4));
        IlIlIIllIlIlIIIIIlIlllllI.put(Items.saddle, new class_0804(6, 8));
        IlIlIIllIlIlIIIIIlIlllllI.put(Items.experience_bottle, new class_0804(-4, -1));
        IlIlIIllIlIlIIIIIlIlllllI.put(Items.lIIIlIIllIllIIlIIlIIIllII, new class_0804(-4, -1));
        IlIlIIllIlIlIIIIIlIlllllI.put(Items.lllllllIlIIlIlIIIlIlIIlll, new class_0804(10, 12));
        IlIlIIllIlIlIIIIIlIlllllI.put(Items.IIIIlllIIlIllllllIllIIlll, new class_0804(10, 12));
        IlIlIIllIlIlIIIIIlIlllllI.put(Item.getItemFromBlock(Blocks.IIIIlllIIlIllllllIllIIlll), new class_0804(-3, -1));
        IlIlIIllIlIlIIIIIlIlllllI.put(Items.llllIlIIllIIlllllIIllIIll, new class_0804(-7, -5));
        IlIlIIllIlIlIIIIIlIlllllI.put(Items.IIIlIIllIIlIlIIlIIllIIIIl, new class_0804(-7, -5));
        IlIlIIllIlIlIIIIIlIlllllI.put(Items.lIIIIIlIllIllIlIlIIllllll, new class_0804(-8, -6));
        IlIlIIllIlIlIIIIIlIlllllI.put(Items.ender_eye, new class_0804(7, 11));
        IlIlIIllIlIlIIIIIlIlllllI.put(Items.arrow, new class_0804(-12, -8));
    }
}

