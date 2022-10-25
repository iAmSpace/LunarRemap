package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;

import java.util.List;

public abstract class class_1860
extends class_1521 {
    private boolean lllIIIllIIIIlllIlIIllIIll;
    private String lllIlIIlIIIlIlIIIllIlllIl;
    private static final int[][][] IlIllllllIIlIIllllIIlIIIl = new int[][][]{new int[][]{{0, 0, -1}, {0, 0, 1}}, new int[][]{{-1, 0, 0}, {1, 0, 0}}, new int[][]{{-1, -1, 0}, {1, 0, 0}}, new int[][]{{-1, 0, 0}, {1, -1, 0}}, new int[][]{{0, 0, -1}, {0, -1, 1}}, new int[][]{{0, -1, -1}, {0, 0, 1}}, new int[][]{{0, 0, 1}, {1, 0, 0}}, new int[][]{{0, 0, 1}, {-1, 0, 0}}, new int[][]{{0, 0, -1}, {-1, 0, 0}}, new int[][]{{0, 0, -1}, {1, 0, 0}}};
    private int lIlllIlllIIIIlIIlllIllIII;
    private double IlIIIIIllllllIIlllIllllll;
    private double lIllllIIlIIIlIllllllIIIll;
    private double IIIllIIlIIIIIIlIlIIllIIlI;
    private double IllIIlllllllIIlIIlIIIIlIl;
    private double IIIllIllIIlIlIlIlIllllIIl;
    private double IllIIIllIIIIlIlIlIllIIlll;
    private double lIIIIlIlIIlllllIIllIIlIII;
    private double llIIlllIllIllllIIIlIIIIII;

    public class_1860(class_1334 class_13342) {
        super(class_13342);
        this.lIIlIIIIIlIlllIlIIlIlIlll = true;
        this.IlIIIIIllllllIIlllIllllll(0.98f, 0.7f);
        this.llllIlIIIIIIIIIlllIIlIIIl = this.lllIIIIlIlIIlIIlllIIIIIIl / 2.0f;
    }

    public static class_1860 lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, double d, double d2, double d3, int n) {
        switch (n) {
            case 1: {
                return new class_0656(class_13342, d, d2, d3);
            }
            case 2: {
                return new class_1775(class_13342, d, d2, d3);
            }
            case 3: {
                return new class_0858(class_13342, d, d2, d3);
            }
            case 4: {
                return new class_1989(class_13342, d, d2, d3);
            }
            case 5: {
                return new class_2252(class_13342, d, d2, d3);
            }
            case 6: {
                return new class_2200(class_13342, d, d2, d3);
            }
        }
        return new class_0493(class_13342, d, d2, d3);
    }

    @Override
    protected boolean IIIllIIlIIIIIIlIlIIllIIlI() {
        return false;
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl() {
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(17, new Integer(0));
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(18, new Integer(1));
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(19, new Float(0.0f));
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(20, new Integer(0));
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(21, new Integer(6));
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(22, (Object)0);
    }

    @Override
    public class_1974 IIIllIIlIIIIIIlIlIIllIIlI(class_1521 class_15212) {
        return class_15212.lIIIIlIlIIlllllIIllIIlIII() ? class_15212.IIllIllIIllIIlllIIIlIlllI : null;
    }

    @Override
    public class_1974 IllIIIllIIIIlIlIlIllIIlll() {
        return null;
    }

    @Override
    public boolean lIIIIlIlIIlllllIIllIIlIII() {
        return true;
    }

    public class_1860(class_1334 class_13342, double d, double d2, double d3) {
        this(class_13342);
        this.IlIllllllIIlIIllllIIlIIIl(d, d2, d3);
        this.IIIIIIIIlIllIIllIIlllIllI = 0.0;
        this.IIlIIlIlIlIllIIlIlIIIIlll = 0.0;
        this.llIIIlllIlllIlIllIIIIllIl = 0.0;
        this.llIIlIllIllllIlIIIIlIIlll = d;
        this.llIllllIlIllIIIlIllIIlIlI = d2;
        this.lIlllIlllIlIIIIlllIlIlIIl = d3;
    }

    @Override
    public double llllIlIIllIIlllllIIllIIll() {
        return (double)this.lllIIIIlIlIIlIIlllIIIIIIl * 0.0 - (double)0.3f;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_0058 class_00582, float f) {
        if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl && !this.IllllIIIIlIIlIIIIlllIIIIl) {
            boolean bl;
            if (this.lIIllIIlIIIlllIlllIIlIIlI()) {
                return false;
            }
            this.lllIlIIlIIIlIlIIIllIlllIl(-this.IlIlllIIIIIIlIIllIIllIlll());
            this.lllIIIllIIIIlllIlIIllIIll(10);
            this.IIlIllIIlllllIIlIIllllIIl();
            this.IlIllllllIIlIIllllIIlIIIl(this.IllIIlllllllIIlIIlIIIIlIl() + f * 10.0f);
            boolean bl2 = bl = class_00582.IllIIIllIIIIlIlIlIllIIlll() instanceof class_0814 && ((class_0814)class_00582.IllIIIllIIIIlIlIlIllIIlll()).lIIlIlIlIlIllIIlIIllllIll.lIlllIlllIIIIlIIlllIllIII;
            if (bl || this.IllIIlllllllIIlIIlIIIIlIl() > 40.0f) {
                if (this.lIlIlIIlIIIIlIIIIIlllIIII != null) {
                    this.lIlIlIIlIIIIlIIIIIlllIIII.lllIIIllIIIIlllIlIIllIIll(this);
                }
                if (bl && !this.IIlllIlIlllIllIIIlllIIlIl()) {
                    this.IIIIlIIlIIIllIIIIllIIIlII();
                } else {
                    this.lllIIIllIIIIlllIlIIllIIll(class_00582);
                }
            }
            return true;
        }
        return true;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0058 class_00582) {
        this.IIIIlIIlIIIllIIIIllIIIlII();
        ItemStack class_08972 = new ItemStack(Items.lIlIlIIllIIIlllIllIIlIllI, 1);
        if (this.lllIlIIlIIIlIlIIIllIlllIl != null) {
            class_08972.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl);
        }
        this.lllIIIllIIIIlllIlIIllIIll(class_08972, 0.0f);
    }

    @Override
    public void llIIIlIlIlIIlIllIIIllIlIl() {
        this.lllIlIIlIIIlIlIIIllIlllIl(-this.IlIlllIIIIIIlIIllIIllIlll());
        this.lllIIIllIIIIlllIlIIllIIll(10);
        this.IlIllllllIIlIIllllIIlIIIl(this.IllIIlllllllIIlIIlIIIIlIl() + this.IllIIlllllllIIlIIlIIIIlIl() * 10.0f);
    }

    @Override
    public boolean IllllIIlIIIllIlllIlllIllI() {
        return !this.IllllIIIIlIIlIIIIlllIIIIl;
    }

    @Override
    public void IIIIlIIlIIIllIIIIllIIIlII() {
        super.IIIIlIIlIIIllIIIIllIIIlII();
    }

    @Override
    public void s_() {
        int n;
        int n2;
        if (this.lllIIlIIIllllllIIIIlIlIlI() > 0) {
            this.lllIIIllIIIIlllIlIIllIIll(this.lllIIlIIIllllllIIIIlIlIlI() - 1);
        }
        if (this.IllIIlllllllIIlIIlIIIIlIl() > 0.0f) {
            this.IlIllllllIIlIIllllIIlIIIl(this.IllIIlllllllIIlIIlIIIIlIl() - 1.0f);
        }
        if (this.llIIlIlIlllIIllIlIlllIllI < -64.0) {
            this.llllIlIIIIIIIIIlllIIlIIIl();
        }
        if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl && this.lIlIllIIlIIlIIlIIlIIlIIll instanceof class_0976) {
            this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIlllllIIlIlIlllllIllll.startSection("portal");
            class_0220 class_02202 = ((class_0976)this.lIlIllIIlIIlIIlIIlIIlIIll).llIIlIIllIIllIlIIllIIllII();
            n2 = this.llIIlIIllIIllIlIIllIIllII();
            if (this.lIlIllIIllIIIIlllIlIlllIl) {
                if (class_02202.lIIlIIIIIlIlllIlIIlIlIlll()) {
                    if (this.IlIIIlIIIIllIIIllIIIIIIll == null && this.IlIIIlIIlllllIIIllIlIlIll++ >= n2) {
                        this.IlIIIlIIlllllIIIllIlIlIll = n2;
                        this.lIIIlIIllIllIIlIIlIIIllII = this.lIlllIIllIIIIIIlIlIIlIllI();
                        n = this.lIlIllIIlIIlIIlIIlIIlIIll.IlIlIIlllIIlIllIIIlllllIl.IIIllIllIIlIlIlIlIllllIIl == -1 ? 0 : -1;
                        this.IIIllIllIIlIlIlIlIllllIIl(n);
                    }
                    this.lIlIllIIllIIIIlllIlIlllIl = false;
                }
            } else {
                if (this.IlIIIlIIlllllIIIllIlIlIll > 0) {
                    this.IlIIIlIIlllllIIIllIlIlIll -= 4;
                }
                if (this.IlIIIlIIlllllIIIllIlIlIll < 0) {
                    this.IlIIIlIIlllllIIIllIlIlIll = 0;
                }
            }
            if (this.lIIIlIIllIllIIlIIlIIIllII > 0) {
                --this.lIIIlIIllIllIIlIIlIIIllII;
            }
            this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIlllllIIlIlIlllllIllll.endSection();
        }
        if (this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
            if (this.lIlllIlllIIIIlIIlllIllIII > 0) {
                double d = this.IlIIlllllIIlIlIlllllIllll + (this.IlIIIIIllllllIIlllIllllll - this.IlIIlllllIIlIlIlllllIllll) / (double)this.lIlllIlllIIIIlIIlllIllIII;
                double d2 = this.llIIlIlIlllIIllIlIlllIllI + (this.lIllllIIlIIIlIllllllIIIll - this.llIIlIlIlllIIllIlIlllIllI) / (double)this.lIlllIlllIIIIlIIlllIllIII;
                double d3 = this.IllIIIIllIIllIllIlllIlIIl + (this.IIIllIIlIIIIIIlIlIIllIIlI - this.IllIIIIllIIllIllIlllIlIIl) / (double)this.lIlllIlllIIIIlIIlllIllIII;
                double d4 = MathHelper.IIIllIIlIIIIIIlIlIIllIIlI(this.IllIIlllllllIIlIIlIIIIlIl - (double)this.IIIIlIllIlIIlIIlIllIlIlll);
                this.IIIIlIllIlIIlIIlIllIlIlll = (float)((double)this.IIIIlIllIlIIlIIlIllIlIlll + d4 / (double)this.lIlllIlllIIIIlIIlllIllIII);
                this.IlIlIIlllIllllllllIIIlIlI = (float)((double)this.IlIlIIlllIllllllllIIIlIlI + (this.IIIllIllIIlIlIlIlIllllIIl - (double)this.IlIlIIlllIllllllllIIIlIlI) / (double)this.lIlllIlllIIIIlIIlllIllIII);
                --this.lIlllIlllIIIIlIIlllIllIII;
                this.IlIllllllIIlIIllllIIlIIIl(d, d2, d3);
                this.lIllllIIlIIIlIllllllIIIll(this.IIIIlIllIlIIlIIlIllIlIlll, this.IlIlIIlllIllllllllIIIlIlI);
            } else {
                this.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI, this.IllIIIIllIIllIllIlllIlIIl);
                this.lIllllIIlIIIlIllllllIIIll(this.IIIIlIllIlIIlIIlIllIlIlll, this.IlIlIIlllIllllllllIIIlIlI);
            }
        } else {
            double d;
            this.llIIlIllIllllIlIIIIlIIlll = this.IlIIlllllIIlIlIlllllIllll;
            this.llIllllIlIllIIIlIllIIlIlI = this.llIIlIlIlllIIllIlIlllIllI;
            this.lIlllIlllIlIIIIlllIlIlIIl = this.IllIIIIllIIllIllIlllIlIIl;
            this.IIlIIlIlIlIllIIlIlIIIIlll -= (double)0.04f;
            int n3 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll);
            if (class_0609.IllIIIllIIIIlIlIlIllIIlll(this.lIlIllIIlIIlIIlIIlIIlIIll, n3, (n2 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.llIIlIlIlllIIllIlIlllIllI)) - 1, n = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IllIIIIllIIllIllIlllIlIIl))) {
                --n2;
            }
            double d5 = 0.4;
            double d6 = 0.0078125;
            Block class_05492 = this.lIlIllIIlIIlIIlIIlIIlIIll.a_(n3, n2, n);
            if (class_0609.IlIllllllIIlIIllllIIlIIIl(class_05492)) {
                int n4 = this.lIlIllIIlIIlIIlIIlIIlIIll.IlIllllllIIlIIllllIIlIIIl(n3, n2, n);
                this.lllIIIllIIIIlllIlIIllIIll(n3, n2, n, d5, d6, class_05492, n4);
                if (class_05492 == Blocks.IlIlIIlllIIlIlllllIlIIIIl) {
                    this.lllIIIllIIIIlllIlIIllIIll(n3, n2, n, (n4 & 8) != 0);
                }
            } else {
                this.lllIlIIlIIIlIlIIIllIlllIl(d5);
            }
            this.lllIIIIlIlIIlIIlllIIIIIIl();
            this.IlIlIIlllIllllllllIIIlIlI = 0.0f;
            double d7 = this.llIIlIllIllllIlIIIIlIIlll - this.IlIIlllllIIlIlIlllllIllll;
            double d8 = this.lIlllIlllIlIIIIlllIlIlIIl - this.IllIIIIllIIllIllIlllIlIIl;
            if (d7 * d7 + d8 * d8 > 0.001) {
                this.IIIIlIllIlIIlIIlIllIlIlll = (float)(Math.atan2(d8, d7) * 180.0 / Math.PI);
                if (this.lllIIIllIIIIlllIlIIllIIll) {
                    this.IIIIlIllIlIIlIIlIllIlIlll += 180.0f;
                }
            }
            if ((d = (double) MathHelper.IIIllIIlIIIIIIlIlIIllIIlI(this.IIIIlIllIlIIlIIlIllIlIlll - this.llllIIIIlIIIlIIIIIIlIllll)) < -170.0 || d >= 170.0) {
                this.IIIIlIllIlIIlIIlIllIlIlll += 180.0f;
                this.lllIIIllIIIIlllIlIIllIIll = !this.lllIIIllIIIIlllIlIIllIIll;
            }
            this.lIllllIIlIIIlIllllllIIIll(this.IIIIlIllIlIIlIIlIllIlIlll, this.IlIlIIlllIllllllllIIIlIlI);
            List list = this.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl((class_1521)this, this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl(0.2f, 0.0, 0.2f));
            if (list != null && !list.isEmpty()) {
                for (int i = 0; i < list.size(); ++i) {
                    class_1521 class_15212 = (class_1521)list.get(i);
                    if (class_15212 == this.lIlIlIIlIIIIlIIIIIlllIIII || !class_15212.lIIIIlIlIIlllllIIllIIlIII() || !(class_15212 instanceof class_1860)) continue;
                    class_15212.lIllllIIlIIIlIllllllIIIll(this);
                }
            }
            if (this.lIlIlIIlIIIIlIIIIIlllIIII != null && this.lIlIlIIlIIIIlIIIIIlllIIII.IllllIIIIlIIlIIIIlllIIIIl) {
                if (this.lIlIlIIlIIIIlIIIIIlllIIII.IlIIIlIIIIllIIIllIIIIIIll == this) {
                    this.lIlIlIIlIIIIlIIIIIlllIIII.IlIIIlIIIIllIIIllIIIIIIll = null;
                }
                this.lIlIlIIlIIIIlIIIIIlllIIII = null;
            }
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, boolean bl) {
    }

    protected void lllIlIIlIIIlIlIIIllIlllIl(double d) {
        if (this.IIIIIIIIlIllIIllIIlllIllI < -d) {
            this.IIIIIIIIlIllIIllIIlllIllI = -d;
        }
        if (this.IIIIIIIIlIllIIllIIlllIllI > d) {
            this.IIIIIIIIlIllIIllIIlllIllI = d;
        }
        if (this.llIIIlllIlllIlIllIIIIllIl < -d) {
            this.llIIIlllIlllIlIllIIIIllIl = -d;
        }
        if (this.llIIIlllIlllIlIllIIIIllIl > d) {
            this.llIIIlllIlllIlIllIIIIllIl = d;
        }
        if (this.llllllIlIllllIlIlIlIIIIlI) {
            this.IIIIIIIIlIllIIllIIlllIllI *= 0.5;
            this.IIlIIlIlIlIllIIlIlIIIIlll *= 0.5;
            this.llIIIlllIlllIlIllIIIIllIl *= 0.5;
        }
        this.IlIIIIIllllllIIlllIllllll(this.IIIIIIIIlIllIIllIIlllIllI, this.IIlIIlIlIlIllIIlIlIIIIlll, this.llIIIlllIlllIlIllIIIIllIl);
        if (!this.llllllIlIllllIlIlIlIIIIlI) {
            this.IIIIIIIIlIllIIllIIlllIllI *= (double)0.95f;
            this.IIlIIlIlIlIllIIlIlIIIIlll *= (double)0.95f;
            this.llIIIlllIlllIlIllIIIIllIl *= (double)0.95f;
        }
    }

    protected void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, double d, double d2, Block class_05492, int n4) {
        double d3;
        double d4;
        double d5;
        double d6;
        double d7;
        double d8;
        double d9;
        this.lIIIllIIIIIllllIlIlIllIll = 0.0f;
        class_0864 class_08642 = this.IllIIIllIIIIlIlIlIllIIlll(this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI, this.IllIIIIllIIllIllIlllIlIIl);
        this.llIIlIlIlllIIllIlIlllIllI = n2;
        boolean bl = false;
        boolean bl2 = false;
        if (class_05492 == Blocks.IIIIIIIIlIllIIllIIlllIllI) {
            bl = (n4 & 8) != 0;
            boolean bl3 = bl2 = !bl;
        }
        if (((class_0609)class_05492).llIlllIIllIlllIlIlIlIIIll()) {
            n4 &= 7;
        }
        if (n4 >= 2 && n4 <= 5) {
            this.llIIlIlIlllIIllIlIlllIllI = n2 + 1;
        }
        if (n4 == 2) {
            this.IIIIIIIIlIllIIllIIlllIllI -= d2;
        }
        if (n4 == 3) {
            this.IIIIIIIIlIllIIllIIlllIllI += d2;
        }
        if (n4 == 4) {
            this.llIIIlllIlllIlIllIIIIllIl += d2;
        }
        if (n4 == 5) {
            this.llIIIlllIlllIlIllIIIIllIl -= d2;
        }
        int[][] arrn = IlIllllllIIlIIllllIIlIIIl[n4];
        double d10 = arrn[1][0] - arrn[0][0];
        double d11 = arrn[1][2] - arrn[0][2];
        double d12 = Math.sqrt(d10 * d10 + d11 * d11);
        double d13 = this.IIIIIIIIlIllIIllIIlllIllI * d10 + this.llIIIlllIlllIlIllIIIIllIl * d11;
        if (d13 < 0.0) {
            d10 = -d10;
            d11 = -d11;
        }
        if ((d9 = Math.sqrt(this.IIIIIIIIlIllIIllIIlllIllI * this.IIIIIIIIlIllIIllIIlllIllI + this.llIIIlllIlllIlIllIIIIllIl * this.llIIIlllIlllIlIllIIIIllIl)) > 2.0) {
            d9 = 2.0;
        }
        this.IIIIIIIIlIllIIllIIlllIllI = d9 * d10 / d12;
        this.llIIIlllIlllIlIllIIIIllIl = d9 * d11 / d12;
        if (this.lIlIlIIlIIIIlIIIIIlllIIII != null && this.lIlIlIIlIIIIlIIIIIlllIIII instanceof class_1965 && (d8 = (double)((class_1965)this.lIlIlIIlIIIIlIIIIIlllIIII).llIlIIIlllIIIllIllllIIIll) > 0.0) {
            d7 = -Math.sin(this.lIlIlIIlIIIIlIIIIIlllIIII.IIIIlIllIlIIlIIlIllIlIlll * (float)Math.PI / 180.0f);
            d6 = Math.cos(this.lIlIlIIlIIIIlIIIIIlllIIII.IIIIlIllIlIIlIIlIllIlIlll * (float)Math.PI / 180.0f);
            d5 = this.IIIIIIIIlIllIIllIIlllIllI * this.IIIIIIIIlIllIIllIIlllIllI + this.llIIIlllIlllIlIllIIIIllIl * this.llIIIlllIlllIlIllIIIIllIl;
            if (d5 < 0.01) {
                this.IIIIIIIIlIllIIllIIlllIllI += d7 * 0.1;
                this.llIIIlllIlllIlIllIIIIllIl += d6 * 0.1;
                bl2 = false;
            }
        }
        if (bl2) {
            d8 = Math.sqrt(this.IIIIIIIIlIllIIllIIlllIllI * this.IIIIIIIIlIllIIllIIlllIllI + this.llIIIlllIlllIlIllIIIIllIl * this.llIIIlllIlllIlIllIIIIllIl);
            if (d8 < 0.03) {
                this.IIIIIIIIlIllIIllIIlllIllI *= 0.0;
                this.IIlIIlIlIlIllIIlIlIIIIlll *= 0.0;
                this.llIIIlllIlllIlIllIIIIllIl *= 0.0;
            } else {
                this.IIIIIIIIlIllIIllIIlllIllI *= 0.5;
                this.IIlIIlIlIlIllIIlIlIIIIlll *= 0.0;
                this.llIIIlllIlllIlIllIIIIllIl *= 0.5;
            }
        }
        d8 = 0.0;
        d7 = (double)n + 0.5 + (double)arrn[0][0] * 0.5;
        d6 = (double)n3 + 0.5 + (double)arrn[0][2] * 0.5;
        d5 = (double)n + 0.5 + (double)arrn[1][0] * 0.5;
        double d14 = (double)n3 + 0.5 + (double)arrn[1][2] * 0.5;
        d10 = d5 - d7;
        d11 = d14 - d6;
        if (d10 == 0.0) {
            this.IlIIlllllIIlIlIlllllIllll = (double)n + 0.5;
            d8 = this.IllIIIIllIIllIllIlllIlIIl - (double)n3;
        } else if (d11 == 0.0) {
            this.IllIIIIllIIllIllIlllIlIIl = (double)n3 + 0.5;
            d8 = this.IlIIlllllIIlIlIlllllIllll - (double)n;
        } else {
            d4 = this.IlIIlllllIIlIlIlllllIllll - d7;
            d3 = this.IllIIIIllIIllIllIlllIlIIl - d6;
            d8 = (d4 * d10 + d3 * d11) * 2.0;
        }
        this.IlIIlllllIIlIlIlllllIllll = d7 + d10 * d8;
        this.IllIIIIllIIllIllIlllIlIIl = d6 + d11 * d8;
        this.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI + (double)this.llllIlIIIIIIIIIlllIIlIIIl, this.IllIIIIllIIllIllIlllIlIIl);
        d4 = this.IIIIIIIIlIllIIllIIlllIllI;
        d3 = this.llIIIlllIlllIlIllIIIIllIl;
        if (this.lIlIlIIlIIIIlIIIIIlllIIII != null) {
            d4 *= 0.75;
            d3 *= 0.75;
        }
        if (d4 < -d) {
            d4 = -d;
        }
        if (d4 > d) {
            d4 = d;
        }
        if (d3 < -d) {
            d3 = -d;
        }
        if (d3 > d) {
            d3 = d;
        }
        this.IlIIIIIllllllIIlllIllllll(d4, 0.0, d3);
        if (arrn[0][1] != 0 && MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll) - n == arrn[0][0] && MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IllIIIIllIIllIllIlllIlIIl) - n3 == arrn[0][2]) {
            this.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI + (double)arrn[0][1], this.IllIIIIllIIllIllIlllIlIIl);
        } else if (arrn[1][1] != 0 && MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll) - n == arrn[1][0] && MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IllIIIIllIIllIllIlllIlIIl) - n3 == arrn[1][2]) {
            this.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI + (double)arrn[1][1], this.IllIIIIllIIllIllIlllIlIIl);
        }
        this.lIllllIIlIIIlIllllllIIIll();
        class_0864 class_08643 = this.IllIIIllIIIIlIlIlIllIIlll(this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI, this.IllIIIIllIIllIllIlllIlIIl);
        if (class_08643 != null && class_08642 != null) {
            double d15 = (class_08642.lllIlIIlIIIlIlIIIllIlllIl - class_08643.lllIlIIlIIIlIlIIIllIlllIl) * 0.05;
            d9 = Math.sqrt(this.IIIIIIIIlIllIIllIIlllIllI * this.IIIIIIIIlIllIIllIIlllIllI + this.llIIIlllIlllIlIllIIIIllIl * this.llIIIlllIlllIlIllIIIIllIl);
            if (d9 > 0.0) {
                this.IIIIIIIIlIllIIllIIlllIllI = this.IIIIIIIIlIllIIllIIlllIllI / d9 * (d9 + d15);
                this.llIIIlllIlllIlIllIIIIllIl = this.llIIIlllIlllIlIllIIIIllIl / d9 * (d9 + d15);
            }
            this.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll, class_08643.lllIlIIlIIIlIlIIIllIlllIl, this.IllIIIIllIIllIllIlllIlIIl);
        }
        int n5 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll);
        int n6 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IllIIIIllIIllIllIlllIlIIl);
        if (n5 != n || n6 != n3) {
            d9 = Math.sqrt(this.IIIIIIIIlIllIIllIIlllIllI * this.IIIIIIIIlIllIIllIIlllIllI + this.llIIIlllIlllIlIllIIIIllIl * this.llIIIlllIlllIlIllIIIIllIl);
            this.IIIIIIIIlIllIIllIIlllIllI = d9 * (double)(n5 - n);
            this.llIIIlllIlllIlIllIIIIllIl = d9 * (double)(n6 - n3);
        }
        if (bl) {
            double d16 = Math.sqrt(this.IIIIIIIIlIllIIllIIlllIllI * this.IIIIIIIIlIllIIllIIlllIllI + this.llIIIlllIlllIlIllIIIIllIl * this.llIIIlllIlllIlIllIIIIllIl);
            if (d16 > 0.01) {
                double d17 = 0.06;
                this.IIIIIIIIlIllIIllIIlllIllI += this.IIIIIIIIlIllIIllIIlllIllI / d16 * d17;
                this.llIIIlllIlllIlIllIIIIllIl += this.llIIIlllIlllIlIllIIIIllIl / d16 * d17;
            } else if (n4 == 1) {
                if (this.lIlIllIIlIIlIIlIIlIIlIIll.a_(n - 1, n2, n3).IIIllIllIIlIlIlIlIllllIIl()) {
                    this.IIIIIIIIlIllIIllIIlllIllI = 0.02;
                } else if (this.lIlIllIIlIIlIIlIIlIIlIIll.a_(n + 1, n2, n3).IIIllIllIIlIlIlIlIllllIIl()) {
                    this.IIIIIIIIlIllIIllIIlllIllI = -0.02;
                }
            } else if (n4 == 0) {
                if (this.lIlIllIIlIIlIIlIIlIIlIIll.a_(n, n2, n3 - 1).IIIllIllIIlIlIlIlIllllIIl()) {
                    this.llIIIlllIlllIlIllIIIIllIl = 0.02;
                } else if (this.lIlIllIIlIIlIIlIIlIIlIIll.a_(n, n2, n3 + 1).IIIllIllIIlIlIlIlIllllIIl()) {
                    this.llIIIlllIlllIlIllIIIIllIl = -0.02;
                }
            }
        }
    }

    protected void lIllllIIlIIIlIllllllIIIll() {
        if (this.lIlIlIIlIIIIlIIIIIlllIIII != null) {
            this.IIIIIIIIlIllIIllIIlllIllI *= (double)0.997f;
            this.IIlIIlIlIlIllIIlIlIIIIlll *= 0.0;
            this.llIIIlllIlllIlIllIIIIllIl *= (double)0.997f;
        } else {
            this.IIIIIIIIlIllIIllIIlllIllI *= (double)0.96f;
            this.IIlIIlIlIlIllIIlIlIIIIlll *= 0.0;
            this.llIIIlllIlllIlIllIIIIllIl *= (double)0.96f;
        }
    }

    public class_0864 lllIIIllIIIIlllIlIIllIIll(double d, double d2, double d3, double d4) {
        Block class_05492;
        int n;
        int n2;
        int n3 = MathHelper.IlIllllllIIlIIllllIIlIIIl(d);
        if (class_0609.IllIIIllIIIIlIlIlIllIIlll(this.lIlIllIIlIIlIIlIIlIIlIIll, n3, (n2 = MathHelper.IlIllllllIIlIIllllIIlIIIl(d2)) - 1, n = MathHelper.IlIllllllIIlIIllllIIlIIIl(d3))) {
            --n2;
        }
        if (!class_0609.IlIllllllIIlIIllllIIlIIIl(class_05492 = this.lIlIllIIlIIlIIlIIlIIlIIll.a_(n3, n2, n))) {
            return null;
        }
        int n4 = this.lIlIllIIlIIlIIlIIlIIlIIll.IlIllllllIIlIIllllIIlIIIl(n3, n2, n);
        if (((class_0609)class_05492).llIlllIIllIlllIlIlIlIIIll()) {
            n4 &= 7;
        }
        d2 = n2;
        if (n4 >= 2 && n4 <= 5) {
            d2 = n2 + 1;
        }
        int[][] arrn = IlIllllllIIlIIllllIIlIIIl[n4];
        double d5 = arrn[1][0] - arrn[0][0];
        double d6 = arrn[1][2] - arrn[0][2];
        double d7 = Math.sqrt(d5 * d5 + d6 * d6);
        if (arrn[0][1] != 0 && MathHelper.IlIllllllIIlIIllllIIlIIIl(d += (d5 /= d7) * d4) - n3 == arrn[0][0] && MathHelper.IlIllllllIIlIIllllIIlIIIl(d3 += (d6 /= d7) * d4) - n == arrn[0][2]) {
            d2 += (double)arrn[0][1];
        } else if (arrn[1][1] != 0 && MathHelper.IlIllllllIIlIIllllIIlIIIl(d) - n3 == arrn[1][0] && MathHelper.IlIllllllIIlIIllllIIlIIIl(d3) - n == arrn[1][2]) {
            d2 += (double)arrn[1][1];
        }
        return this.IllIIIllIIIIlIlIlIllIIlll(d, d2, d3);
    }

    public class_0864 IllIIIllIIIIlIlIlIllIIlll(double d, double d2, double d3) {
        Block class_05492;
        int n;
        int n2;
        int n3 = MathHelper.IlIllllllIIlIIllllIIlIIIl(d);
        if (class_0609.IllIIIllIIIIlIlIlIllIIlll(this.lIlIllIIlIIlIIlIIlIIlIIll, n3, (n2 = MathHelper.IlIllllllIIlIIllllIIlIIIl(d2)) - 1, n = MathHelper.IlIllllllIIlIIllllIIlIIIl(d3))) {
            --n2;
        }
        if (class_0609.IlIllllllIIlIIllllIIlIIIl(class_05492 = this.lIlIllIIlIIlIIlIIlIIlIIll.a_(n3, n2, n))) {
            int n4 = this.lIlIllIIlIIlIIlIIlIIlIIll.IlIllllllIIlIIllllIIlIIIl(n3, n2, n);
            d2 = n2;
            if (((class_0609)class_05492).llIlllIIllIlllIlIlIlIIIll()) {
                n4 &= 7;
            }
            if (n4 >= 2 && n4 <= 5) {
                d2 = n2 + 1;
            }
            int[][] arrn = IlIllllllIIlIIllllIIlIIIl[n4];
            double d4 = 0.0;
            double d5 = (double)n3 + 0.5 + (double)arrn[0][0] * 0.5;
            double d6 = (double)n2 + 0.5 + (double)arrn[0][1] * 0.5;
            double d7 = (double)n + 0.5 + (double)arrn[0][2] * 0.5;
            double d8 = (double)n3 + 0.5 + (double)arrn[1][0] * 0.5;
            double d9 = (double)n2 + 0.5 + (double)arrn[1][1] * 0.5;
            double d10 = (double)n + 0.5 + (double)arrn[1][2] * 0.5;
            double d11 = d8 - d5;
            double d12 = (d9 - d6) * 2.0;
            double d13 = d10 - d7;
            if (d11 == 0.0) {
                d = (double)n3 + 0.5;
                d4 = d3 - (double)n;
            } else if (d13 == 0.0) {
                d3 = (double)n + 0.5;
                d4 = d - (double)n3;
            } else {
                double d14 = d - d5;
                double d15 = d3 - d7;
                d4 = (d14 * d11 + d15 * d13) * 2.0;
            }
            d = d5 + d11 * d4;
            d2 = d6 + d12 * d4;
            d3 = d7 + d13 * d4;
            if (d12 < 0.0) {
                d2 += 1.0;
            }
            if (d12 > 0.0) {
                d2 += 0.5;
            }
            return class_0864.lllIIIllIIIIlllIlIIllIIll(d, d2, d3);
        }
        return null;
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        if (class_07752.lllIIlIIIllllllIIIIlIlIlI("CustomDisplayTile")) {
            this.IlIllllllIIlIIllllIIlIIIl(class_07752.lIllllIIlIIIlIllllllIIIll("DisplayTile"));
            this.lIIIIlIlIIlllllIIllIIlIII(class_07752.lIllllIIlIIIlIllllllIIIll("DisplayData"));
            this.llIIlllIllIllllIIIlIIIIII(class_07752.lIllllIIlIIIlIllllllIIIll("DisplayOffset"));
        }
        if (class_07752.lllIlIIlIIIlIlIIIllIlllIl("CustomName", 8) && class_07752.IllIIIllIIIIlIlIlIllIIlll("CustomName").length() > 0) {
            this.lllIlIIlIIIlIlIIIllIlllIl = class_07752.IllIIIllIIIIlIlIlIllIIlll("CustomName");
        }
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        if (this.IlIIIlIIIIllIIIllIIIIIIll()) {
            class_07752.lllIIIllIIIIlllIlIIllIIll("CustomDisplayTile", true);
            class_07752.lllIIIllIIIIlllIlIIllIIll("DisplayTile", this.IlIlIIlIlIllIIlIlIIllIIIl().lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll ? 0 : Block.lllIIIllIIIIlllIlIIllIIll(this.IlIlIIlIlIllIIlIlIIllIIIl()));
            class_07752.lllIIIllIIIIlllIlIIllIIll("DisplayData", this.lllllIlllIIllIlIIlIIIllII());
            class_07752.lllIIIllIIIIlllIlIIllIIll("DisplayOffset", this.lIIlIIIIIlIlllIlIIlIlIlll());
        }
        if (this.lllIlIIlIIIlIlIIIllIlllIl != null && this.lllIlIIlIIIlIlIIIllIlllIl.length() > 0) {
            class_07752.lllIIIllIIIIlllIlIIllIIll("CustomName", this.lllIlIIlIIIlIlIIIllIlllIl);
        }
    }

    @Override
    public float llIIlllIllIllllIIIlIIIIII() {
        return 0.0f;
    }

    @Override
    public void lIllllIIlIIIlIllllllIIIll(class_1521 class_15212) {
        if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl && class_15212 != this.lIlIlIIlIIIIlIIIIIlllIIII) {
            double d;
            double d2;
            double d3;
            if (class_15212 instanceof class_1965 && !(class_15212 instanceof class_0814) && !(class_15212 instanceof class_0991) && this.IlIllllllIIlIIllllIIlIIIl() == 0 && this.IIIIIIIIlIllIIllIIlllIllI * this.IIIIIIIIlIllIIllIIlllIllI + this.llIIIlllIlllIlIllIIIIllIl * this.llIIIlllIlllIlIllIIIIllIl > 0.01 && this.lIlIlIIlIIIIlIIIIIlllIIII == null && class_15212.IlIIIlIIIIllIIIllIIIIIIll == null) {
                class_15212.lllIIIllIIIIlllIlIIllIIll(this);
            }
            if ((d3 = (d2 = class_15212.IlIIlllllIIlIlIlllllIllll - this.IlIIlllllIIlIlIlllllIllll) * d2 + (d = class_15212.IllIIIIllIIllIllIlllIlIIl - this.IllIIIIllIIllIllIlllIlIIl) * d) >= (double)1.0E-4f) {
                d3 = MathHelper.lllIIIllIIIIlllIlIIllIIll(d3);
                d2 /= d3;
                d /= d3;
                double d4 = 1.0 / d3;
                if (d4 > 1.0) {
                    d4 = 1.0;
                }
                d2 *= d4;
                d *= d4;
                d2 *= (double)0.1f;
                d *= (double)0.1f;
                d2 *= (double)(1.0f - this.llllIIllIlIlllllllIIlIIlI);
                d *= (double)(1.0f - this.llllIIllIlIlllllllIIlIIlI);
                d2 *= 0.5;
                d *= 0.5;
                if (class_15212 instanceof class_1860) {
                    class_0864 class_08642;
                    double d5 = class_15212.IlIIlllllIIlIlIlllllIllll - this.IlIIlllllIIlIlIlllllIllll;
                    double d6 = class_15212.IllIIIIllIIllIllIlllIlIIl - this.IllIIIIllIIllIllIlllIlIIl;
                    class_0864 class_08643 = class_0864.lllIIIllIIIIlllIlIIllIIll(d5, 0.0, d6).lllIIIllIIIIlllIlIIllIIll();
                    double d7 = Math.abs(class_08643.lllIlIIlIIIlIlIIIllIlllIl(class_08642 = class_0864.lllIIIllIIIIlllIlIIllIIll(MathHelper.lllIlIIlIIIlIlIIIllIlllIl(this.IIIIlIllIlIIlIIlIllIlIlll * (float)Math.PI / 180.0f), 0.0, MathHelper.lllIIIllIIIIlllIlIIllIIll(this.IIIIlIllIlIIlIIlIllIlIlll * (float)Math.PI / 180.0f)).lllIIIllIIIIlllIlIIllIIll()));
                    if (d7 < (double)0.8f) {
                        return;
                    }
                    double d8 = class_15212.IIIIIIIIlIllIIllIIlllIllI + this.IIIIIIIIlIllIIllIIlllIllI;
                    double d9 = class_15212.llIIIlllIlllIlIllIIIIllIl + this.llIIIlllIlllIlIllIIIIllIl;
                    if (((class_1860)class_15212).IlIllllllIIlIIllllIIlIIIl() == 2 && this.IlIllllllIIlIIllllIIlIIIl() != 2) {
                        this.IIIIIIIIlIllIIllIIlllIllI *= (double)0.2f;
                        this.llIIIlllIlllIlIllIIIIllIl *= (double)0.2f;
                        this.IllIIlllllllIIlIIlIIIIlIl(class_15212.IIIIIIIIlIllIIllIIlllIllI - d2, 0.0, class_15212.llIIIlllIlllIlIllIIIIllIl - d);
                        class_15212.IIIIIIIIlIllIIllIIlllIllI *= (double)0.95f;
                        class_15212.llIIIlllIlllIlIllIIIIllIl *= (double)0.95f;
                    } else if (((class_1860)class_15212).IlIllllllIIlIIllllIIlIIIl() != 2 && this.IlIllllllIIlIIllllIIlIIIl() == 2) {
                        class_15212.IIIIIIIIlIllIIllIIlllIllI *= (double)0.2f;
                        class_15212.llIIIlllIlllIlIllIIIIllIl *= (double)0.2f;
                        class_15212.IllIIlllllllIIlIIlIIIIlIl(this.IIIIIIIIlIllIIllIIlllIllI + d2, 0.0, this.llIIIlllIlllIlIllIIIIllIl + d);
                        this.IIIIIIIIlIllIIllIIlllIllI *= (double)0.95f;
                        this.llIIIlllIlllIlIllIIIIllIl *= (double)0.95f;
                    } else {
                        this.IIIIIIIIlIllIIllIIlllIllI *= (double)0.2f;
                        this.llIIIlllIlllIlIllIIIIllIl *= (double)0.2f;
                        this.IllIIlllllllIIlIIlIIIIlIl((d8 /= 2.0) - d2, 0.0, (d9 /= 2.0) - d);
                        class_15212.IIIIIIIIlIllIIllIIlllIllI *= (double)0.2f;
                        class_15212.llIIIlllIlllIlIllIIIIllIl *= (double)0.2f;
                        class_15212.IllIIlllllllIIlIIlIIIIlIl(d8 + d2, 0.0, d9 + d);
                    }
                } else {
                    this.IllIIlllllllIIlIIlIIIIlIl(-d2, 0.0, -d);
                    class_15212.IllIIlllllllIIlIIlIIIIlIl(d2 / 4.0, 0.0, d / 4.0);
                }
            }
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(double d, double d2, double d3, float f, float f2, int n) {
        this.IlIIIIIllllllIIlllIllllll = d;
        this.lIllllIIlIIIlIllllllIIIll = d2;
        this.IIIllIIlIIIIIIlIlIIllIIlI = d3;
        this.IllIIlllllllIIlIIlIIIIlIl = f;
        this.IIIllIllIIlIlIlIlIllllIIl = f2;
        this.lIlllIlllIIIIlIIlllIllIII = n + 2;
        this.IIIIIIIIlIllIIllIIlllIllI = this.IllIIIllIIIIlIlIlIllIIlll;
        this.IIlIIlIlIlIllIIlIlIIIIlll = this.lIIIIlIlIIlllllIIllIIlIII;
        this.llIIIlllIlllIlIllIIIIllIl = this.llIIlllIllIllllIIIlIIIIII;
    }

    @Override
    public void IIIllIllIIlIlIlIlIllllIIl(double d, double d2, double d3) {
        this.IllIIIllIIIIlIlIlIllIIlll = this.IIIIIIIIlIllIIllIIlllIllI = d;
        this.lIIIIlIlIIlllllIIllIIlIII = this.IIlIIlIlIlIllIIlIlIIIIlll = d2;
        this.llIIlllIllIllllIIIlIIIIII = this.llIIIlllIlllIlIllIIIIllIl = d3;
    }

    public void IlIllllllIIlIIllllIIlIIIl(float f) {
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIlIIlIIIlIlIIIllIlllIl(19, Float.valueOf(f));
    }

    public float IllIIlllllllIIlIIlIIIIlIl() {
        return this.IlIlIllIIlIIIIlllIlIllIlI.lIlllIlllIIIIlIIlllIllIII(19);
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n) {
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIlIIlIIIlIlIIIllIlllIl(17, n);
    }

    public int lllIIlIIIllllllIIIIlIlIlI() {
        return this.IlIlIllIIlIIIIlllIlIllIlI.IlIllllllIIlIIllllIIlIIIl(17);
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(int n) {
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIlIIlIIIlIlIIIllIlllIl(18, n);
    }

    public int IlIlllIIIIIIlIIllIIllIlll() {
        return this.IlIlIllIIlIIIIlllIlIllIlI.IlIllllllIIlIIllllIIlIIIl(18);
    }

    public abstract int IlIllllllIIlIIllllIIlIIIl();

    public Block IlIlIIlIlIllIIlIlIIllIIIl() {
        if (!this.IlIIIlIIIIllIIIllIIIIIIll()) {
            return this.lIlllIlllIIIIlIIlllIllIII();
        }
        int n = this.lIlIIllllIlIIIIllIIIIlIIl().IlIllllllIIlIIllllIIlIIIl(20) & 0xFFFF;
        return Block.lllIIIllIIIIlllIlIIllIIll(n);
    }

    public Block lIlllIlllIIIIlIIlllIllIII() {
        return Blocks.lllIIIllIIIIlllIlIIllIIll;
    }

    public int lllllIlllIIllIlIIlIIIllII() {
        return !this.IlIIIlIIIIllIIIllIIIIIIll() ? this.IlIlIIlllIIlIllIIIlllllIl() : this.lIlIIllllIlIIIIllIIIIlIIl().IlIllllllIIlIIllllIIlIIIl(20) >> 16;
    }

    public int IlIlIIlllIIlIllIIIlllllIl() {
        return 0;
    }

    public int lIIlIIIIIlIlllIlIIlIlIlll() {
        return !this.IlIIIlIIIIllIIIllIIIIIIll() ? this.lIlIlIIlIIIIlIIIIIlllIIII() : this.lIlIIllllIlIIIIllIIIIlIIl().IlIllllllIIlIIllllIIlIIIl(21);
    }

    public int lIlIlIIlIIIIlIIIIIlllIIII() {
        return 6;
    }

    public void IlIllllllIIlIIllllIIlIIIl(int n) {
        this.lIlIIllllIlIIIIllIIIIlIIl().lllIlIIlIIIlIlIIIllIlllIl(20, n & 0xFFFF | this.lllllIlllIIllIlIIlIIIllII() << 16);
        this.lllIIIllIIIIlllIlIIllIIll(true);
    }

    public void lIIIIlIlIIlllllIIllIIlIII(int n) {
        this.lIlIIllllIlIIIIllIIIIlIIl().lllIlIIlIIIlIlIIIllIlllIl(20, Block.lllIIIllIIIIlllIlIIllIIll(this.IlIlIIlIlIllIIlIlIIllIIIl()) & 0xFFFF | n << 16);
        this.lllIIIllIIIIlllIlIIllIIll(true);
    }

    public void llIIlllIllIllllIIIlIIIIII(int n) {
        this.lIlIIllllIlIIIIllIIIIlIIl().lllIlIIlIIIlIlIIIllIlllIl(21, n);
        this.lllIIIllIIIIlllIlIIllIIll(true);
    }

    public boolean IlIIIlIIIIllIIIllIIIIIIll() {
        return this.lIlIIllllIlIIIIllIIIIlIIl().lllIIIllIIIIlllIlIIllIIll(22) == 1;
    }

    public void lllIIIllIIIIlllIlIIllIIll(boolean bl) {
        this.lIlIIllllIlIIIIllIIIIlIIl().lllIlIIlIIIlIlIIIllIlllIl(22, (byte)(bl ? 1 : 0));
    }

    public void lllIIIllIIIIlllIlIIllIIll(String string) {
        this.lllIlIIlIIIlIlIIIllIlllIl = string;
    }

    @Override
    public String llllIIIIlIIIlIIIIIIlIllll() {
        return this.lllIlIIlIIIlIlIIIllIlllIl != null ? this.lllIlIIlIIIlIlIIIllIlllIl : super.llllIIIIlIIIlIIIIIIlIllll();
    }

    public boolean IIlllIlIlllIllIIIlllIIlIl() {
        return this.lllIlIIlIIIlIlIIIllIlllIl != null;
    }

    public String lIlIllIIlIIlIIlIIlIIlIIll() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }
}

