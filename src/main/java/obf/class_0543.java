package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;

import java.util.ArrayList;

public class class_0543
extends class_1521 {
    private Block IlIIIIIllllllIIlllIllllll;
    public int lllIIIllIIIIlllIlIIllIIll;
    public int lllIlIIlIIIlIlIIIllIlllIl;
    public boolean IlIllllllIIlIIllllIIlIIIl = true;
    private boolean lIllllIIlIIIlIllllllIIIll;
    private boolean IIIllIIlIIIIIIlIlIIllIIlI;
    private int IllIIlllllllIIlIIlIIIIlIl = 40;
    private float IIIllIllIIlIlIlIlIllllIIl = 2.0f;
    public class_0775 lIlllIlllIIIIlIIlllIllIII;

    public class_0543(class_1334 class_13342) {
        super(class_13342);
    }

    public class_0543(class_1334 class_13342, double d, double d2, double d3, Block class_05492) {
        this(class_13342, d, d2, d3, class_05492, 0);
    }

    public class_0543(class_1334 class_13342, double d, double d2, double d3, Block class_05492, int n) {
        super(class_13342);
        this.IlIIIIIllllllIIlllIllllll = class_05492;
        this.lllIIIllIIIIlllIlIIllIIll = n;
        this.lIIlIIIIIlIlllIlIIlIlIlll = true;
        this.IlIIIIIllllllIIlllIllllll(0.98f, 0.98f);
        this.llllIlIIIIIIIIIlllIIlIIIl = this.lllIIIIlIlIIlIIlllIIIIIIl / 2.0f;
        this.IlIllllllIIlIIllllIIlIIIl(d, d2, d3);
        this.IIIIIIIIlIllIIllIIlllIllI = 0.0;
        this.IIlIIlIlIlIllIIlIlIIIIlll = 0.0;
        this.llIIIlllIlllIlIllIIIIllIl = 0.0;
        this.llIIlIllIllllIlIIIIlIIlll = d;
        this.llIllllIlIllIIIlIllIIlIlI = d2;
        this.lIlllIlllIlIIIIlllIlIlIIl = d3;
    }

    @Override
    protected boolean IIIllIIlIIIIIIlIlIIllIIlI() {
        return false;
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl() {
    }

    @Override
    public boolean IllllIIlIIIllIlllIlllIllI() {
        return !this.IllllIIIIlIIlIIIIlllIIIIl;
    }

    @Override
    public void s_() {
        if (this.IlIIIIIllllllIIlllIllllll.lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll) {
            this.IIIIlIIlIIIllIIIIllIIIlII();
        } else {
            this.llIIlIllIllllIlIIIIlIIlll = this.IlIIlllllIIlIlIlllllIllll;
            this.llIllllIlIllIIIlIllIIlIlI = this.llIIlIlIlllIIllIlIlllIllI;
            this.lIlllIlllIlIIIIlllIlIlIIl = this.IllIIIIllIIllIllIlllIlIIl;
            ++this.lllIlIIlIIIlIlIIIllIlllIl;
            this.IIlIIlIlIlIllIIlIlIIIIlll -= (double)0.04f;
            this.IlIIIIIllllllIIlllIllllll(this.IIIIIIIIlIllIIllIIlllIllI, this.IIlIIlIlIlIllIIlIlIIIIlll, this.llIIIlllIlllIlIllIIIIllIl);
            this.IIIIIIIIlIllIIllIIlllIllI *= (double)0.98f;
            this.IIlIIlIlIlIllIIlIlIIIIlll *= (double)0.98f;
            this.llIIIlllIlllIlIllIIIIllIl *= (double)0.98f;
            if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
                int n = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll);
                int n2 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.llIIlIlIlllIIllIlIlllIllI);
                int n3 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IllIIIIllIIllIllIlllIlIIl);
                if (this.lllIlIIlIIIlIlIIIllIlllIl == 1) {
                    if (this.lIlIllIIlIIlIIlIIlIIlIIll.a_(n, n2, n3) != this.IlIIIIIllllllIIlllIllllll) {
                        this.IIIIlIIlIIIllIIIIllIIIlII();
                        return;
                    }
                    this.lIlIllIIlIIlIIlIIlIIlIIll.lIllllIIlIIIlIllllllIIIll(n, n2, n3);
                }
                if (this.llllllIlIllllIlIlIlIIIIlI) {
                    this.IIIIIIIIlIllIIllIIlllIllI *= (double)0.7f;
                    this.llIIIlllIlllIlIllIIIIllIl *= (double)0.7f;
                    this.IIlIIlIlIlIllIIlIlIIIIlll *= -0.5;
                    if (this.lIlIllIIlIIlIIlIIlIIlIIll.a_(n, n2, n3) != Blocks.lIlIIllllIlIIIIllIIIIlIIl) {
                        this.IIIIlIIlIIIllIIIIllIIIlII();
                        if (!this.lIllllIIlIIIlIllllllIIIll && this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(this.IlIIIIIllllllIIlllIllllll, n, n2, n3, true, 1, null, null) && !class_0351.IllIIIllIIIIlIlIlIllIIlll(this.lIlIllIIlIIlIIlIIlIIlIIll, n, n2 - 1, n3) && this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, this.IlIIIIIllllllIIlllIllllll, this.lllIIIllIIIIlllIlIIllIIll, 3)) {
                            class_1774 class_17742;
                            if (this.IlIIIIIllllllIIlllIllllll instanceof class_0351) {
                                ((class_0351)this.IlIIIIIllllllIIlllIllllll).IIIllIIlIIIIIIlIlIIllIIlI(this.lIlIllIIlIIlIIlIIlIIlIIll, n, n2, n3, this.lllIIIllIIIIlllIlIIllIIll);
                            }
                            if (this.lIlllIlllIIIIlIIlllIllIII != null && this.IlIIIIIllllllIIlllIllllll instanceof class_1770 && (class_17742 = this.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3)) != null) {
                                class_0775 class_07752 = new class_0775();
                                class_17742.lllIlIIlIIIlIlIIIllIlllIl(class_07752);
                                for (String string : this.lIlllIlllIIIIlIIlllIllIII.lIlllIlllIIIIlIIlllIllIII()) {
                                    class_2037 class_20372 = this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(string);
                                    if (string.equals("x") || string.equals("y") || string.equals("z")) continue;
                                    class_07752.lllIIIllIIIIlllIlIIllIIll(string, class_20372.lllIlIIlIIIlIlIIIllIlllIl());
                                }
                                class_17742.lllIIIllIIIIlllIlIIllIIll(class_07752);
                                class_17742.llIIlIllIllllIlIIIIlIIlll();
                            }
                        } else if (this.IlIllllllIIlIIllllIIlIIIl && !this.lIllllIIlIIIlIllllllIIIll) {
                            this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(this.IlIIIIIllllllIIlllIllllll, 1, this.IlIIIIIllllllIIlllIllllll.IlIIIIIllllllIIlllIllllll(this.lllIIIllIIIIlllIlIIllIIll)), 0.0f);
                        }
                    }
                } else if (this.lllIlIIlIIIlIlIIIllIlllIl > 100 && !this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl && (n2 < 1 || n2 > 256) || this.lllIlIIlIIIlIlIIIllIlllIl > 600) {
                    if (this.IlIllllllIIlIIllllIIlIIIl) {
                        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(this.IlIIIIIllllllIIlllIllllll, 1, this.IlIIIIIllllllIIlllIllllll.IlIIIIIllllllIIlllIllllll(this.lllIIIllIIIIlllIlIIllIIll)), 0.0f);
                    }
                    this.IIIIlIIlIIIllIIIIllIIIlII();
                }
            }
        }
    }

    @Override
    protected void lIllllIIlIIIlIllllllIIIll(float f) {
        int n;
        if (this.IIIllIIlIIIIIIlIlIIllIIlI && (n = MathHelper.lIllllIIlIIIlIllllllIIIll(f - 1.0f)) > 0) {
            ArrayList arrayList = new ArrayList(this.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl((class_1521)this, this.IIllIllIIllIIlllIIIlIlllI));
            boolean bl = this.IlIIIIIllllllIIlllIllllll == Blocks.llIlllllIIlIIlIIllllIllll;
            class_0058 class_00582 = bl ? class_0058.llIIllIllIlIIlIIllIllllll : class_0058.lllIIlIIIllllllIIIIlIlIlI;
            for (class_1521 class_15212 : arrayList) {
                class_15212.lllIIIllIIIIlllIlIIllIIll(class_00582, (float)Math.min(MathHelper.lIlllIlllIIIIlIIlllIllIII((float)n * this.IIIllIllIIlIlIlIlIllllIIl), this.IllIIlllllllIIlIIlIIIIlIl));
            }
            if (bl && (double)this.IlllIIlllllllIIllIlIllllI.nextFloat() < (double)0.05f + (double)n * 0.05) {
                int n2 = this.lllIIIllIIIIlllIlIIllIIll >> 2;
                int n3 = this.lllIIIllIIIIlllIlIIllIIll & 3;
                if (++n2 > 2) {
                    this.lIllllIIlIIIlIllllllIIIll = true;
                } else {
                    this.lllIIIllIIIIlllIlIIllIIll = n3 | n2 << 2;
                }
            }
        }
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        class_07752.lllIIIllIIIIlllIlIIllIIll("Tile", (byte) Block.lllIIIllIIIIlllIlIIllIIll(this.IlIIIIIllllllIIlllIllllll));
        class_07752.lllIIIllIIIIlllIlIIllIIll("TileID", Block.lllIIIllIIIIlllIlIIllIIll(this.IlIIIIIllllllIIlllIllllll));
        class_07752.lllIIIllIIIIlllIlIIllIIll("Data", (byte)this.lllIIIllIIIIlllIlIIllIIll);
        class_07752.lllIIIllIIIIlllIlIIllIIll("Time", (byte)this.lllIlIIlIIIlIlIIIllIlllIl);
        class_07752.lllIIIllIIIIlllIlIIllIIll("DropItem", this.IlIllllllIIlIIllllIIlIIIl);
        class_07752.lllIIIllIIIIlllIlIIllIIll("HurtEntities", this.IIIllIIlIIIIIIlIlIIllIIlI);
        class_07752.lllIIIllIIIIlllIlIIllIIll("FallHurtAmount", this.IIIllIllIIlIlIlIlIllllIIl);
        class_07752.lllIIIllIIIIlllIlIIllIIll("FallHurtMax", this.IllIIlllllllIIlIIlIIIIlIl);
        if (this.lIlllIlllIIIIlIIlllIllIII != null) {
            class_07752.lllIIIllIIIIlllIlIIllIIll("TileEntityData", this.lIlllIlllIIIIlIIlllIllIII);
        }
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        this.IlIIIIIllllllIIlllIllllll = class_07752.lllIlIIlIIIlIlIIIllIlllIl("TileID", 99) ? Block.lllIIIllIIIIlllIlIIllIIll(class_07752.lIllllIIlIIIlIllllllIIIll("TileID")) : Block.lllIIIllIIIIlllIlIIllIIll(class_07752.lIlllIlllIIIIlIIlllIllIII("Tile") & 0xFF);
        this.lllIIIllIIIIlllIlIIllIIll = class_07752.lIlllIlllIIIIlIIlllIllIII("Data") & 0xFF;
        this.lllIlIIlIIIlIlIIIllIlllIl = class_07752.lIlllIlllIIIIlIIlllIllIII("Time") & 0xFF;
        if (class_07752.lllIlIIlIIIlIlIIIllIlllIl("HurtEntities", 99)) {
            this.IIIllIIlIIIIIIlIlIIllIIlI = class_07752.lllIIlIIIllllllIIIIlIlIlI("HurtEntities");
            this.IIIllIllIIlIlIlIlIllllIIl = class_07752.IllIIlllllllIIlIIlIIIIlIl("FallHurtAmount");
            this.IllIIlllllllIIlIIlIIIIlIl = class_07752.lIllllIIlIIIlIllllllIIIll("FallHurtMax");
        } else if (this.IlIIIIIllllllIIlllIllllll == Blocks.llIlllllIIlIIlIIllllIllll) {
            this.IIIllIIlIIIIIIlIlIIllIIlI = true;
        }
        if (class_07752.lllIlIIlIIIlIlIIIllIlllIl("DropItem", 99)) {
            this.IlIllllllIIlIIllllIIlIIIl = class_07752.lllIIlIIIllllllIIIIlIlIlI("DropItem");
        }
        if (class_07752.lllIlIIlIIIlIlIIIllIlllIl("TileEntityData", 10)) {
            this.lIlllIlllIIIIlIIlllIllIII = class_07752.llIIllIllIlIIlIIllIllllll("TileEntityData");
        }
        if (this.IlIIIIIllllllIIlllIllllll.lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll) {
            this.IlIIIIIllllllIIlllIllllll = Blocks.llIIllIllIlIIlIIllIllllll;
        }
    }

    @Override
    public float llIIlllIllIllllIIIlIIIIII() {
        return 0.0f;
    }

    public class_1334 IlIllllllIIlIIllllIIlIIIl() {
        return this.lIlIllIIlIIlIIlIIlIIlIIll;
    }

    public void lllIIIllIIIIlllIlIIllIIll(boolean bl) {
        this.IIIllIIlIIIIIIlIlIIllIIlI = bl;
    }

    @Override
    public boolean lIIllIlIIlIIlllllIlIIllIl() {
        return false;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0799 class_07992) {
        super.lllIIIllIIIIlllIlIIllIIll(class_07992);
        class_07992.lllIIIllIIIIlllIlIIllIIll("Immitating block ID", Block.lllIIIllIIIIlllIlIIllIIll(this.IlIIIIIllllllIIlllIllllll));
        class_07992.lllIIIllIIIIlllIlIIllIIll("Immitating block data", this.lllIIIllIIIIlllIlIIllIIll);
    }

    public Block lIlllIlllIIIIlIIlllIllIII() {
        return this.IlIIIIIllllllIIlllIllllll;
    }
}

