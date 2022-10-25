package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.stats.AchievementList;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.stats.StatList;

import java.util.List;

public abstract class class_0003
extends class_0650
implements class_1463 {
    private int lIIIlIllllIlllIIIIIllIIIl;
    private int lllIIIlllIlllIIlIllllIIlI;
    private class_0814 lIIlIlllIIlllIIlllIIlIlII;

    public class_0003(class_1334 class_13342) {
        super(class_13342);
    }

    @Override
    protected void lIIlIlIlIlIllIIlIIllllIll() {
        if (this.u_() != 0) {
            this.lIIIlIllllIlllIIIIIllIIIl = 0;
        }
        super.lIIlIlIlIlIllIIlIIllllIll();
    }

    @Override
    public void d_() {
        super.d_();
        if (this.u_() != 0) {
            this.lIIIlIllllIlllIIIIIllIIIl = 0;
        }
        if (this.lIIIlIllllIlllIIIIIllIIIl > 0) {
            --this.lIIIlIllllIlllIIIIIllIIIl;
            String string = "heart";
            if (this.lIIIlIllllIlllIIIIIllIIIl % 10 == 0) {
                double d = this.IlllIIlllllllIIllIlIllllI.nextGaussian() * 0.02;
                double d2 = this.IlllIIlllllllIIllIlIllllI.nextGaussian() * 0.02;
                double d3 = this.IlllIIlllllllIIllIlIllllI.nextGaussian() * 0.02;
                this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(string, this.IlIIlllllIIlIlIlllllIllll + (double)(this.IlllIIlllllllIIllIlIllllI.nextFloat() * this.IIIIlIlIIlIIIIlIlllIlIIII * 2.0f) - (double)this.IIIIlIlIIlIIIIlIlllIlIIII, this.llIIlIlIlllIIllIlIlllIllI + 0.5 + (double)(this.IlllIIlllllllIIllIlIllllI.nextFloat() * this.lllIIIIlIlIIlIIlllIIIIIIl), this.IllIIIIllIIllIllIlllIlIIl + (double)(this.IlllIIlllllllIIllIlIllllI.nextFloat() * this.IIIIlIlIIlIIIIlIlllIlIIII * 2.0f) - (double)this.IIIIlIlIIlIIIIlIlllIlIIII, d, d2, d3);
            }
        } else {
            this.lllIIIlllIlllIIlIllllIIlI = 0;
        }
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, float f) {
        if (class_15212 instanceof class_0814) {
            class_0814 class_08142;
            if (f < 3.0f) {
                double d = class_15212.IlIIlllllIIlIlIlllllIllll - this.IlIIlllllIIlIlIlllllIllll;
                double d2 = class_15212.IllIIIIllIIllIllIlllIlIIl - this.IllIIIIllIIllIllIlllIlIIl;
                this.IIIIlIllIlIIlIIlIllIlIlll = (float)(Math.atan2(d2, d) * 180.0 / Math.PI) - 90.0f;
                this.lIlllIlllIIIIlIIlllIllIII = true;
            }
            if ((class_08142 = (class_0814)class_15212).IllIlIlIIIlIllIlIlIIlllII() == null || !this.IlIllllllIIlIIllllIIlIIIl(class_08142.IllIlIlIIIlIllIlIlIIlllII())) {
                this.IlIllllllIIlIIllllIIlIIIl = null;
            }
        } else if (class_15212 instanceof class_0003) {
            class_0003 class_00032 = (class_0003)class_15212;
            if (this.u_() > 0 && class_00032.u_() < 0) {
                if ((double)f < 2.5) {
                    this.lIlllIlllIIIIlIIlllIllIII = true;
                }
            } else if (this.lIIIlIllllIlllIIIIIllIIIl > 0 && class_00032.lIIIlIllllIlllIIIIIllIIIl > 0) {
                if (class_00032.IlIllllllIIlIIllllIIlIIIl == null) {
                    class_00032.IlIllllllIIlIIllllIIlIIIl = this;
                }
                if (class_00032.IlIllllllIIlIIllllIIlIIIl == this && (double)f < 3.5) {
                    ++class_00032.lIIIlIllllIlllIIIIIllIIIl;
                    ++this.lIIIlIllllIlllIIIIIllIIIl;
                    ++this.lllIIIlllIlllIIlIllllIIlI;
                    if (this.lllIIIlllIlllIIlIllllIIlI % 4 == 0) {
                        this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll("heart", this.IlIIlllllIIlIlIlllllIllll + (double)(this.IlllIIlllllllIIllIlIllllI.nextFloat() * this.IIIIlIlIIlIIIIlIlllIlIIII * 2.0f) - (double)this.IIIIlIlIIlIIIIlIlllIlIIII, this.llIIlIlIlllIIllIlIlllIllI + 0.5 + (double)(this.IlllIIlllllllIIllIlIllllI.nextFloat() * this.lllIIIIlIlIIlIIlllIIIIIIl), this.IllIIIIllIIllIllIlllIlIIl + (double)(this.IlllIIlllllllIIllIlIllllI.nextFloat() * this.IIIIlIlIIlIIIIlIlllIlIIII * 2.0f) - (double)this.IIIIlIlIIlIIIIlIlllIlIIII, 0.0, 0.0, 0.0);
                    }
                    if (this.lllIIIlllIlllIIlIllllIIlI == 60) {
                        this.lllIlIIlIIIlIlIIIllIlllIl((class_0003)class_15212);
                    }
                } else {
                    this.lllIIIlllIlllIIlIllllIIlI = 0;
                }
            } else {
                this.lllIIIlllIlllIIlIllllIIlI = 0;
                this.IlIllllllIIlIIllllIIlIIIl = null;
            }
        }
    }

    private void lllIlIIlIIIlIlIIIllIlllIl(class_0003 class_00032) {
        class_0650 class_06502 = this.lllIIIllIIIIlllIlIIllIIll((class_0650)class_00032);
        if (class_06502 != null) {
            if (this.lIIlIlllIIlllIIlllIIlIlII == null && class_00032.lllIIIlIllIlllIlIIllIllIl() != null) {
                this.lIIlIlllIIlllIIlllIIlIlII = class_00032.lllIIIlIllIlllIlIIllIllIl();
            }
            if (this.lIIlIlllIIlllIIlllIIlIlII != null) {
                this.lIIlIlllIIlllIIlllIIlIlII.lllIIIllIIIIlllIlIIllIIll(StatList.llIIlIllIllllIlIIIIlIIlll);
                if (this instanceof class_1802) {
                    this.lIIlIlllIIlllIIlllIIlIlII.lllIIIllIIIIlllIlIIllIIll(AchievementList.field_150962_H);
                }
            }
            this.lllIlIIlIIIlIlIIIllIlllIl(6000);
            class_00032.lllIlIIlIIIlIlIIIllIlllIl(6000);
            this.lIIIlIllllIlllIIIIIllIIIl = 0;
            this.lllIIIlllIlllIIlIllllIIlI = 0;
            this.IlIllllllIIlIIllllIIlIIIl = null;
            class_00032.IlIllllllIIlIIllllIIlIIIl = null;
            class_00032.lllIIIlllIlllIIlIllllIIlI = 0;
            class_00032.lIIIlIllllIlllIIIIIllIIIl = 0;
            class_06502.lllIlIIlIIIlIlIIIllIlllIl(-24000);
            class_06502.lllIlIIlIIIlIlIIIllIlllIl(this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI, this.IllIIIIllIIllIllIlllIlIIl, this.IIIIlIllIlIIlIIlIllIlIlll, this.IlIlIIlllIllllllllIIIlIlI);
            for (int i = 0; i < 7; ++i) {
                double d = this.IlllIIlllllllIIllIlIllllI.nextGaussian() * 0.02;
                double d2 = this.IlllIIlllllllIIllIlIllllI.nextGaussian() * 0.02;
                double d3 = this.IlllIIlllllllIIllIlIllllI.nextGaussian() * 0.02;
                this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll("heart", this.IlIIlllllIIlIlIlllllIllll + (double)(this.IlllIIlllllllIIllIlIllllI.nextFloat() * this.IIIIlIlIIlIIIIlIlllIlIIII * 2.0f) - (double)this.IIIIlIlIIlIIIIlIlllIlIIII, this.llIIlIlIlllIIllIlIlllIllI + 0.5 + (double)(this.IlllIIlllllllIIllIlIllllI.nextFloat() * this.lllIIIIlIlIIlIIlllIIIIIIl), this.IllIIIIllIIllIllIlllIlIIl + (double)(this.IlllIIlllllllIIllIlIllllI.nextFloat() * this.IIIIlIlIIlIIIIlIlllIlIIII * 2.0f) - (double)this.IIIIlIlIIlIIIIlIlllIlIIII, d, d2, d3);
            }
            this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(class_06502);
        }
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_0058 class_00582, float f) {
        class_1685 class_16852;
        if (this.lIIllIIlIIIlllIlllIIlIIlI()) {
            return false;
        }
        this.IlIIIIIllllllIIlllIllllll = 60;
        if (!this.IIIIlllIIlIllllllIllIIlll() && (class_16852 = this.lllIIIllIIIIlllIlIIllIIll(class_1152.lIlllIlllIIIIlIIlllIllIII)).lllIIIllIIIIlllIlIIllIIll(lllIIIllIIIIlllIlIIllIIll) == null) {
            class_16852.lllIIIllIIIIlllIlIIllIIll(lllIlIIlIIIlIlIIIllIlllIl);
        }
        this.IlIllllllIIlIIllllIIlIIIl = null;
        this.lIIIlIllllIlllIIIIIllIIIl = 0;
        return super.lllIIIllIIIIlllIlIIllIIll(class_00582, f);
    }

    @Override
    public float lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        return this.lIlIllIIlIIlIIlIIlIIlIIll.a_(n, n2 - 1, n3) == Blocks.IlIllllllIIlIIllllIIlIIIl ? 10.0f : this.lIlIllIIlIIlIIlIIlIIlIIll.llIIlllIllIllllIIIlIIIIII(n, n2, n3) - 0.5f;
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        super.lllIlIIlIIIlIlIIIllIlllIl(class_07752);
        class_07752.lllIIIllIIIIlllIlIIllIIll("InLove", this.lIIIlIllllIlllIIIIIllIIIl);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        super.lllIIIllIIIIlllIlIIllIIll(class_07752);
        this.lIIIlIllllIlllIIIIIllIIIl = class_07752.lIllllIIlIIIlIllllllIIIll("InLove");
    }

    @Override
    protected class_1521 IllIIlllllllIIlIIlIIIIlIl() {
        block5: {
            float f;
            block6: {
                block4: {
                    if (this.IlIIIIIllllllIIlllIllllll > 0) {
                        return null;
                    }
                    f = 8.0f;
                    if (this.lIIIlIllllIlllIIIIIllIIIl <= 0) break block4;
                    List list = this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(this.getClass(), this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl(f, f, f));
                    for (int i = 0; i < list.size(); ++i) {
                        class_0003 class_00032 = (class_0003)list.get(i);
                        if (class_00032 == this || class_00032.lIIIlIllllIlllIIIIIllIIIl <= 0) continue;
                        return class_00032;
                    }
                    break block5;
                }
                if (this.u_() != 0) break block6;
                List list = this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(class_0814.class, this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl(f, f, f));
                for (int i = 0; i < list.size(); ++i) {
                    class_0814 class_08142 = (class_0814)list.get(i);
                    if (class_08142.IllIlIlIIIlIllIlIlIIlllII() == null || !this.IlIllllllIIlIIllllIIlIIIl(class_08142.IllIlIlIIIlIllIlIlIIlllII())) continue;
                    return class_08142;
                }
                break block5;
            }
            if (this.u_() <= 0) break block5;
            List list = this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(this.getClass(), this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl(f, f, f));
            for (int i = 0; i < list.size(); ++i) {
                class_0003 class_00033 = (class_0003)list.get(i);
                if (class_00033 == this || class_00033.u_() >= 0) continue;
                return class_00033;
            }
        }
        return null;
    }

    @Override
    public boolean lllIIlIIIllllllIIIIlIlIlI() {
        int n;
        int n2;
        int n3 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll);
        return this.lIlIllIIlIIlIIlIIlIIlIIll.a_(n3, (n2 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl)) - 1, n = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IllIIIIllIIllIllIlllIlIIl)) == Blocks.IlIllllllIIlIIllllIIlIIIl && this.lIlIllIIlIIlIIlIIlIIlIIll.IIIllIllIIlIlIlIlIllllIIl(n3, n2, n) > 8 && super.lllIIlIIIllllllIIIIlIlIlI();
    }

    @Override
    public int IIllIllIIllIIlllIIIlIlllI() {
        return 120;
    }

    @Override
    protected boolean IIIIIIlIIIIIIIIIIlIlIlIlI() {
        return false;
    }

    @Override
    protected int IlIIIIIllllllIIlllIllllll(class_0814 class_08142) {
        return 1 + this.lIlIllIIlIIlIIlIIlIIlIIll.lllllIlllIIllIlIIlIIIllII.nextInt(3);
    }

    public boolean IlIllllllIIlIIllllIIlIIIl(ItemStack class_08972) {
        return class_08972.lllIIIllIIIIlllIlIIllIIll() == Items.wheat;
    }

    @Override
    public boolean lIlllIlllIIIIlIIlllIllIII(class_0814 class_08142) {
        ItemStack class_08972 = class_08142.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll();
        if (class_08972 != null && this.IlIllllllIIlIIllllIIlIIIl(class_08972) && this.u_() == 0 && this.lIIIlIllllIlllIIIIIllIIIl <= 0) {
            if (!class_08142.lIIlIlIlIlIllIIlIIllllIll.lIlllIlllIIIIlIIlllIllIII) {
                --class_08972.lllIlIIlIIIlIlIIIllIlllIl;
                if (class_08972.lllIlIIlIIIlIlIIIllIlllIl <= 0) {
                    class_08142.lllIIlIIIllllllIIIIlIlIlI.lllIlIIlIIIlIlIIIllIlllIl(class_08142.lllIIlIIIllllllIIIIlIlIlI.IlIllllllIIlIIllllIIlIIIl, null);
                }
            }
            this.lIllllIIlIIIlIllllllIIIll(class_08142);
            return true;
        }
        return super.lIlllIlllIIIIlIIlllIllIII(class_08142);
    }

    public void lIllllIIlIIIlIllllllIIIll(class_0814 class_08142) {
        this.lIIIlIllllIlllIIIIIllIIIl = 600;
        this.lIIlIlllIIlllIIlllIIlIlII = class_08142;
        this.IlIllllllIIlIIllllIIlIIIl = null;
        this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll((class_1521)this, (byte)18);
    }

    public class_0814 lllIIIlIllIlllIlIIllIllIl() {
        return this.lIIlIlllIIlllIIlllIIlIlII;
    }

    public boolean IIlIlIIIIlIlllIIlIIlIIIII() {
        return this.lIIIlIllllIlllIIIIIllIIIl > 0;
    }

    public void lIllIIlllIIIlIlIIIlllIlIl() {
        this.lIIIlIllllIlllIIIIIllIIIl = 0;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_0003 class_00032) {
        return class_00032 == this ? false : (class_00032.getClass() != this.getClass() ? false : this.IIlIlIIIIlIlllIIlIIlIIIII() && class_00032.IIlIlIIIIlIlllIIlIIlIIIII());
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(byte by) {
        if (by == 18) {
            for (int i = 0; i < 7; ++i) {
                double d = this.IlllIIlllllllIIllIlIllllI.nextGaussian() * 0.02;
                double d2 = this.IlllIIlllllllIIllIlIllllI.nextGaussian() * 0.02;
                double d3 = this.IlllIIlllllllIIllIlIllllI.nextGaussian() * 0.02;
                this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll("heart", this.IlIIlllllIIlIlIlllllIllll + (double)(this.IlllIIlllllllIIllIlIllllI.nextFloat() * this.IIIIlIlIIlIIIIlIlllIlIIII * 2.0f) - (double)this.IIIIlIlIIlIIIIlIlllIlIIII, this.llIIlIlIlllIIllIlIlllIllI + 0.5 + (double)(this.IlllIIlllllllIIllIlIllllI.nextFloat() * this.lllIIIIlIlIIlIIlllIIIIIIl), this.IllIIIIllIIllIllIlllIlIIl + (double)(this.IlllIIlllllllIIllIlIllllI.nextFloat() * this.IIIIlIlIIlIIIIlIlllIlIIII * 2.0f) - (double)this.IIIIlIlIIlIIIIlIlllIlIIII, d, d2, d3);
            }
        } else {
            super.lllIIIllIIIIlllIlIIllIIll(by);
        }
    }
}

