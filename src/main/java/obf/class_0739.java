package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_0739 {
    private static final Logger IlIlIIlIlIllIIlIlIIllIIIl = LogManager.getLogger();
    public class_1521 lllIIIllIIIIlllIlIIllIIll;
    public int lllIlIIlIIIlIlIIIllIlllIl;
    public int IlIllllllIIlIIllllIIlIIIl;
    public int lIlllIlllIIIIlIIlllIllIII;
    public int IlIIIIIllllllIIlllIllllll;
    public int lIllllIIlIIIlIllllllIIIll;
    public int IIIllIIlIIIIIIlIlIIllIIlI;
    public int IllIIlllllllIIlIIlIIIIlIl;
    public int IIIllIllIIlIlIlIlIllllIIl;
    public double IllIIIllIIIIlIlIlIllIIlll;
    public double lIIIIlIlIIlllllIIllIIlIII;
    public double llIIlllIllIllllIIIlIIIIII;
    public int llIIllIllIlIIlIIllIllllll;
    private double lllllIlllIIllIlIIlIIIllII;
    private double IlIlIIlllIIlIllIIIlllllIl;
    private double lIIlIIIIIlIlllIlIIlIlIlll;
    private boolean lIlIlIIlIIIIlIIIIIlllIIII;
    private boolean IlIIIlIIIIllIIIllIIIIIIll;
    private int IIlllIlIlllIllIIIlllIIlIl;
    private class_1521 lIlIllIIlIIlIIlIIlIIlIIll;
    private boolean llIIlIllIllllIlIIIIlIIlll;
    public boolean lllIIlIIIllllllIIIIlIlIlI;
    public Set IlIlllIIIIIIlIIllIIllIlll = new HashSet();

    public class_0739(class_1521 class_15212, int n, int n2, boolean bl) {
        this.lllIIIllIIIIlllIlIIllIIll = class_15212;
        this.lllIlIIlIIIlIlIIIllIlllIl = n;
        this.IlIllllllIIlIIllllIIlIIIl = n2;
        this.IlIIIlIIIIllIIIllIIIIIIll = bl;
        this.lIlllIlllIIIIlIIlllIllIII = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_15212.IlIIlllllIIlIlIlllllIllll * 32.0);
        this.IlIIIIIllllllIIlllIllllll = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_15212.llIIlIlIlllIIllIlIlllIllI * 32.0);
        this.lIllllIIlIIIlIllllllIIIll = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_15212.IllIIIIllIIllIllIlllIlIIl * 32.0);
        this.IIIllIIlIIIIIIlIlIIllIIlI = MathHelper.lIlllIlllIIIIlIIlllIllIII(class_15212.IIIIlIllIlIIlIIlIllIlIlll * 256.0f / 360.0f);
        this.IllIIlllllllIIlIIlIIIIlIl = MathHelper.lIlllIlllIIIIlIIlllIllIII(class_15212.IlIlIIlllIllllllllIIIlIlI * 256.0f / 360.0f);
        this.IIIllIllIIlIlIlIlIllllIIl = MathHelper.lIlllIlllIIIIlIIlllIllIII(class_15212.lIIIIllIIllIIIlIIIllIllII() * 256.0f / 360.0f);
    }

    public boolean equals(Object object) {
        return object instanceof class_0739 ? ((class_0739)object).lllIIIllIIIIlllIlIIllIIll.llllllIlIllllIlIlIlIIIIlI() == this.lllIIIllIIIIlllIlIIllIIll.llllllIlIllllIlIlIlIIIIlI() : false;
    }

    public int hashCode() {
        return this.lllIIIllIIIIlllIlIIllIIll.llllllIlIllllIlIlIlIIIIlI();
    }

    public void lllIIIllIIIIlllIlIIllIIll(List list) {
        this.lllIIlIIIllllllIIIIlIlIlI = false;
        if (!this.lIlIlIIlIIIIlIIIIIlllIIII || this.lllIIIllIIIIlllIlIIllIIll.lIllllIIlIIIlIllllllIIIll(this.lllllIlllIIllIlIIlIIIllII, this.IlIlIIlllIIlIllIIIlllllIl, this.lIIlIIIIIlIlllIlIIlIlIlll) > 16.0) {
            this.lllllIlllIIllIlIIlIIIllII = this.lllIIIllIIIIlllIlIIllIIll.IlIIlllllIIlIlIlllllIllll;
            this.IlIlIIlllIIlIllIIIlllllIl = this.lllIIIllIIIIlllIlIIllIIll.llIIlIlIlllIIllIlIlllIllI;
            this.lIIlIIIIIlIlllIlIIlIlIlll = this.lllIIIllIIIIlllIlIIllIIll.IllIIIIllIIllIllIlllIlIIl;
            this.lIlIlIIlIIIIlIIIIIlllIIII = true;
            this.lllIIlIIIllllllIIIIlIlIlI = true;
            this.lllIlIIlIIIlIlIIIllIlllIl(list);
        }
        if (this.lIlIllIIlIIlIIlIIlIIlIIll != this.lllIIIllIIIIlllIlIIllIIll.IlIIIlIIIIllIIIllIIIIIIll || this.lllIIIllIIIIlllIlIIllIIll.IlIIIlIIIIllIIIllIIIIIIll != null && this.llIIllIllIlIIlIIllIllllll % 60 == 0) {
            this.lIlIllIIlIIlIIlIIlIIlIIll = this.lllIIIllIIIIlllIlIIllIIll.IlIIIlIIIIllIIIllIIIIIIll;
            this.lllIIIllIIIIlllIlIIllIIll(new class_2218(0, this.lllIIIllIIIIlllIlIIllIIll, this.lllIIIllIIIIlllIlIIllIIll.IlIIIlIIIIllIIIllIIIIIIll));
        }
        if (this.lllIIIllIIIIlllIlIIllIIll instanceof class_1094 && this.llIIllIllIlIIlIIllIllllll % 10 == 0) {
            class_1094 class_10942 = (class_1094)this.lllIIIllIIIIlllIlIIllIIll;
            ItemStack class_08972 = class_10942.lIllllIIlIIIlIllllllIIIll();
            if (class_08972 != null && class_08972.lllIIIllIIIIlllIlIIllIIll() instanceof class_0746) {
                class_0963 class_09632 = Items.IIIIIlllIIllllIlllIlllIIl.lllIIIllIIIIlllIlIIllIIll(class_08972, this.lllIIIllIIIIlllIlIIllIIll.lIlIllIIlIIlIIlIIlIIlIIll);
                for (class_0814 class_08142 : list) {
                    class_1822 class_18222 = (class_1822)class_08142;
                    class_09632.lllIIIllIIIIlllIlIIllIIll(class_18222, class_08972);
                    class_0703 class_07032 = Items.IIIIIlllIIllllIlllIlllIIl.lIlllIlllIIIIlIIlllIllIII(class_08972, this.lllIIIllIIIIlllIlIIllIIll.lIlIllIIlIIlIIlIIlIIlIIll, class_18222);
                    if (class_07032 == null) continue;
                    class_18222.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(class_07032);
                }
            }
            this.lllIlIIlIIIlIlIIIllIlllIl();
        } else if (this.llIIllIllIlIIlIIllIllllll % this.IlIllllllIIlIIllllIIlIIIl == 0 || this.lllIIIllIIIIlllIlIIllIIll.lIIlIlIIllIIIlIIlIlIIIlII || this.lllIIIllIIIIlllIlIIllIIll.lIlIIllllIlIIIIllIIIIlIIl().lllIIIllIIIIlllIlIIllIIll()) {
            int n;
            if (this.lllIIIllIIIIlllIlIIllIIll.IlIIIlIIIIllIIIllIIIIIIll == null) {
                double d;
                double d2;
                double d3;
                double d4;
                double d5;
                boolean bl;
                ++this.IIlllIlIlllIllIIIlllIIlIl;
                n = this.lllIIIllIIIIlllIlIIllIIll.IllIIllIlIlllIllIllIlIIIl.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll.IlIIlllllIIlIlIlllllIllll);
                int n2 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.lllIIIllIIIIlllIlIIllIIll.llIIlIlIlllIIllIlIlllIllI * 32.0);
                int n3 = this.lllIIIllIIIIlllIlIIllIIll.IllIIllIlIlllIllIllIlIIIl.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll.IllIIIIllIIllIllIlllIlIIl);
                int n4 = MathHelper.lIlllIlllIIIIlIIlllIllIII(this.lllIIIllIIIIlllIlIIllIIll.IIIIlIllIlIIlIIlIllIlIlll * 256.0f / 360.0f);
                int n5 = MathHelper.lIlllIlllIIIIlIIlllIllIII(this.lllIIIllIIIIlllIlIIllIIll.IlIlIIlllIllllllllIIIlIlI * 256.0f / 360.0f);
                int n6 = n - this.lIlllIlllIIIIlIIlllIllIII;
                int n7 = n2 - this.IlIIIIIllllllIIlllIllllll;
                int n8 = n3 - this.lIllllIIlIIIlIllllllIIIll;
                class_0703 class_07033 = null;
                boolean bl2 = Math.abs(n6) >= 4 || Math.abs(n7) >= 4 || Math.abs(n8) >= 4 || this.llIIllIllIlIIlIIllIllllll % 60 == 0;
                boolean bl3 = bl = Math.abs(n4 - this.IIIllIIlIIIIIIlIlIIllIIlI) >= 4 || Math.abs(n5 - this.IllIIlllllllIIlIIlIIIIlIl) >= 4;
                if (this.llIIllIllIlIIlIIllIllllll > 0 || this.lllIIIllIIIIlllIlIIllIIll instanceof class_0369) {
                    if (n6 >= -128 && n6 < 128 && n7 >= -128 && n7 < 128 && n8 >= -128 && n8 < 128 && this.IIlllIlIlllIllIIIlllIIlIl <= 400 && !this.llIIlIllIllllIlIIIIlIIlll) {
                        if (bl2 && bl) {
                            class_07033 = new class_1445(this.lllIIIllIIIIlllIlIIllIIll.llllllIlIllllIlIlIlIIIIlI(), (byte)n6, (byte)n7, (byte)n8, (byte)n4, (byte)n5);
                        } else if (bl2) {
                            class_07033 = new class_1202(this.lllIIIllIIIIlllIlIIllIIll.llllllIlIllllIlIlIlIIIIlI(), (byte)n6, (byte)n7, (byte)n8);
                        } else if (bl) {
                            class_07033 = new class_0431(this.lllIIIllIIIIlllIlIIllIIll.llllllIlIllllIlIlIlIIIIlI(), (byte)n4, (byte)n5);
                        }
                    } else {
                        this.IIlllIlIlllIllIIIlllIIlIl = 0;
                        class_07033 = new class_1353(this.lllIIIllIIIIlllIlIIllIIll.llllllIlIllllIlIlIlIIIIlI(), n, n2, n3, (byte)n4, (byte)n5);
                    }
                }
                if (this.IlIIIlIIIIllIIIllIIIIIIll && ((d5 = (d4 = this.lllIIIllIIIIlllIlIIllIIll.IIIIIIIIlIllIIllIIlllIllI - this.IllIIIllIIIIlIlIlIllIIlll) * d4 + (d3 = this.lllIIIllIIIIlllIlIIllIIll.IIlIIlIlIlIllIIlIlIIIIlll - this.lIIIIlIlIIlllllIIllIIlIII) * d3 + (d2 = this.lllIIIllIIIIlllIlIIllIIll.llIIIlllIlllIlIllIIIIllIl - this.llIIlllIllIllllIIIlIIIIII) * d2) > (d = 0.02) * d || d5 > 0.0 && this.lllIIIllIIIIlllIlIIllIIll.IIIIIIIIlIllIIllIIlllIllI == 0.0 && this.lllIIIllIIIIlllIlIIllIIll.IIlIIlIlIlIllIIlIlIIIIlll == 0.0 && this.lllIIIllIIIIlllIlIIllIIll.llIIIlllIlllIlIllIIIIllIl == 0.0)) {
                    this.IllIIIllIIIIlIlIlIllIIlll = this.lllIIIllIIIIlllIlIIllIIll.IIIIIIIIlIllIIllIIlllIllI;
                    this.lIIIIlIlIIlllllIIllIIlIII = this.lllIIIllIIIIlllIlIIllIIll.IIlIIlIlIlIllIIlIlIIIIlll;
                    this.llIIlllIllIllllIIIlIIIIII = this.lllIIIllIIIIlllIlIIllIIll.llIIIlllIlllIlIllIIIIllIl;
                    this.lllIIIllIIIIlllIlIIllIIll(new class_0852(this.lllIIIllIIIIlllIlIIllIIll.llllllIlIllllIlIlIlIIIIlI(), this.IllIIIllIIIIlIlIlIllIIlll, this.lIIIIlIlIIlllllIIllIIlIII, this.llIIlllIllIllllIIIlIIIIII));
                }
                if (class_07033 != null) {
                    this.lllIIIllIIIIlllIlIIllIIll(class_07033);
                }
                this.lllIlIIlIIIlIlIIIllIlllIl();
                if (bl2) {
                    this.lIlllIlllIIIIlIIlllIllIII = n;
                    this.IlIIIIIllllllIIlllIllllll = n2;
                    this.lIllllIIlIIIlIllllllIIIll = n3;
                }
                if (bl) {
                    this.IIIllIIlIIIIIIlIlIIllIIlI = n4;
                    this.IllIIlllllllIIlIIlIIIIlIl = n5;
                }
                this.llIIlIllIllllIlIIIIlIIlll = false;
            } else {
                boolean bl;
                n = MathHelper.lIlllIlllIIIIlIIlllIllIII(this.lllIIIllIIIIlllIlIIllIIll.IIIIlIllIlIIlIIlIllIlIlll * 256.0f / 360.0f);
                int n9 = MathHelper.lIlllIlllIIIIlIIlllIllIII(this.lllIIIllIIIIlllIlIIllIIll.IlIlIIlllIllllllllIIIlIlI * 256.0f / 360.0f);
                boolean bl4 = bl = Math.abs(n - this.IIIllIIlIIIIIIlIlIIllIIlI) >= 4 || Math.abs(n9 - this.IllIIlllllllIIlIIlIIIIlIl) >= 4;
                if (bl) {
                    this.lllIIIllIIIIlllIlIIllIIll(new class_0431(this.lllIIIllIIIIlllIlIIllIIll.llllllIlIllllIlIlIlIIIIlI(), (byte)n, (byte)n9));
                    this.IIIllIIlIIIIIIlIlIIllIIlI = n;
                    this.IllIIlllllllIIlIIlIIIIlIl = n9;
                }
                this.lIlllIlllIIIIlIIlllIllIII = this.lllIIIllIIIIlllIlIIllIIll.IllIIllIlIlllIllIllIlIIIl.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll.IlIIlllllIIlIlIlllllIllll);
                this.IlIIIIIllllllIIlllIllllll = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.lllIIIllIIIIlllIlIIllIIll.llIIlIlIlllIIllIlIlllIllI * 32.0);
                this.lIllllIIlIIIlIllllllIIIll = this.lllIIIllIIIIlllIlIIllIIll.IllIIllIlIlllIllIllIlIIIl.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll.IllIIIIllIIllIllIlllIlIIl);
                this.lllIlIIlIIIlIlIIIllIlllIl();
                this.llIIlIllIllllIlIIIIlIIlll = true;
            }
            n = MathHelper.lIlllIlllIIIIlIIlllIllIII(this.lllIIIllIIIIlllIlIIllIIll.lIIIIllIIllIIIlIIIllIllII() * 256.0f / 360.0f);
            if (Math.abs(n - this.IIIllIllIIlIlIlIlIllllIIl) >= 4) {
                this.lllIIIllIIIIlllIlIIllIIll(new class_0423(this.lllIIIllIIIIlllIlIIllIIll, (byte)n));
                this.IIIllIllIIlIlIlIlIllllIIl = n;
            }
            this.lllIIIllIIIIlllIlIIllIIll.lIIlIlIIllIIIlIIlIlIIIlII = false;
        }
        ++this.llIIllIllIlIIlIIllIllllll;
        if (this.lllIIIllIIIIlllIlIIllIIll.lllIIIIIIlIlllIIlIlIIIllI) {
            this.lllIlIIlIIIlIlIIIllIlllIl(new class_0852(this.lllIIIllIIIIlllIlIIllIIll));
            this.lllIIIllIIIIlllIlIIllIIll.lllIIIIIIlIlllIIlIlIIIllI = false;
        }
    }

    private void lllIlIIlIIIlIlIIIllIlllIl() {
        class_0788 class_07882 = this.lllIIIllIIIIlllIlIIllIIll.lIlIIllllIlIIIIllIIIIlIIl();
        if (class_07882.lllIIIllIIIIlllIlIIllIIll()) {
            this.lllIlIIlIIIlIlIIIllIlllIl(new class_0292(this.lllIIIllIIIIlllIlIIllIIll.llllllIlIllllIlIlIlIIIIlI(), class_07882, false));
        }
        if (this.lllIIIllIIIIlllIlIIllIIll instanceof class_1965) {
            class_1539 class_15392 = (class_1539)((class_1965)this.lllIIIllIIIIlllIlIIllIIll).lIlIllllIlIIIIIllIIIIlIlI();
            Set set = class_15392.lllIlIIlIIIlIlIIIllIlllIl();
            if (!set.isEmpty()) {
                this.lllIlIIlIIIlIlIIIllIlllIl(new class_1922(this.lllIIIllIIIIlllIlIIllIIll.llllllIlIllllIlIlIlIIIIlI(), set));
            }
            set.clear();
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0703 class_07032) {
        for (class_1822 class_18222 : this.IlIlllIIIIIIlIIllIIllIlll) {
            class_18222.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(class_07032);
        }
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(class_0703 class_07032) {
        this.lllIIIllIIIIlllIlIIllIIll(class_07032);
        if (this.lllIIIllIIIIlllIlIIllIIll instanceof class_1822) {
            ((class_1822)this.lllIIIllIIIIlllIlIIllIIll).lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(class_07032);
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll() {
        for (class_1822 class_18222 : this.IlIlllIIIIIIlIIllIIllIlll) {
            class_18222.IlIlIIlllIIlIllIIIlllllIl(this.lllIIIllIIIIlllIlIIllIIll);
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1822 class_18222) {
        if (this.IlIlllIIIIIIlIIllIIllIlll.contains(class_18222)) {
            class_18222.IlIlIIlllIIlIllIIIlllllIl(this.lllIIIllIIIIlllIlIIllIIll);
            this.IlIlllIIIIIIlIIllIIllIlll.remove(class_18222);
        }
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(class_1822 class_18222) {
        if (class_18222 != this.lllIIIllIIIIlllIlIIllIIll) {
            double d = class_18222.IlIIlllllIIlIlIlllllIllll - (double)(this.lIlllIlllIIIIlIIlllIllIII / 32);
            double d2 = class_18222.IllIIIIllIIllIllIlllIlIIl - (double)(this.lIllllIIlIIIlIllllllIIIll / 32);
            if (d >= (double)(-this.lllIlIIlIIIlIlIIIllIlllIl) && d <= (double)this.lllIlIIlIIIlIlIIIllIlllIl && d2 >= (double)(-this.lllIlIIlIIIlIlIIIllIlllIl) && d2 <= (double)this.lllIlIIlIIIlIlIIIllIlllIl) {
                if (!this.IlIlllIIIIIIlIIllIIllIlll.contains(class_18222) && (this.lIlllIlllIIIIlIIlllIllIII(class_18222) || this.lllIIIllIIIIlllIlIIllIIll.IIlllIlIlllIllIIIlllIIlIl)) {
                    Object object;
                    Object object2;
                    this.IlIlllIIIIIIlIIllIIllIlll.add(class_18222);
                    class_0703 class_07032 = this.IlIllllllIIlIIllllIIlIIIl();
                    class_18222.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(class_07032);
                    if (!this.lllIIIllIIIIlllIlIIllIIll.lIlIIllllIlIIIIllIIIIlIIl().lIlllIlllIIIIlIIlllIllIII()) {
                        class_18222.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new class_0292(this.lllIIIllIIIIlllIlIIllIIll.llllllIlIllllIlIlIlIIIIlI(), this.lllIIIllIIIIlllIlIIllIIll.lIlIIllllIlIIIIllIIIIlIIl(), true));
                    }
                    if (this.lllIIIllIIIIlllIlIIllIIll instanceof class_1965 && !(object2 = ((class_1539)(object = (class_1539)((class_1965)this.lllIIIllIIIIlllIlIIllIIll).lIlIllllIlIIIIIllIIIIlIlI())).IlIllllllIIlIIllllIIlIIIl()).isEmpty()) {
                        class_18222.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new class_1922(this.lllIIIllIIIIlllIlIIllIIll.llllllIlIllllIlIlIlIIIIlI(), (Collection)object2));
                    }
                    this.IllIIIllIIIIlIlIlIllIIlll = this.lllIIIllIIIIlllIlIIllIIll.IIIIIIIIlIllIIllIIlllIllI;
                    this.lIIIIlIlIIlllllIIllIIlIII = this.lllIIIllIIIIlllIlIIllIIll.IIlIIlIlIlIllIIlIlIIIIlll;
                    this.llIIlllIllIllllIIIlIIIIII = this.lllIIIllIIIIlllIlIIllIIll.llIIIlllIlllIlIllIIIIllIl;
                    if (this.IlIIIlIIIIllIIIllIIIIIIll && !(class_07032 instanceof class_2192)) {
                        class_18222.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new class_0852(this.lllIIIllIIIIlllIlIIllIIll.llllllIlIllllIlIlIlIIIIlI(), this.lllIIIllIIIIlllIlIIllIIll.IIIIIIIIlIllIIllIIlllIllI, this.lllIIIllIIIIlllIlIIllIIll.IIlIIlIlIlIllIIlIlIIIIlll, this.lllIIIllIIIIlllIlIIllIIll.llIIIlllIlllIlIllIIIIllIl));
                    }
                    if (this.lllIIIllIIIIlllIlIIllIIll.IlIIIlIIIIllIIIllIIIIIIll != null) {
                        class_18222.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new class_2218(0, this.lllIIIllIIIIlllIlIIllIIll, this.lllIIIllIIIIlllIlIIllIIll.IlIIIlIIIIllIIIllIIIIIIll));
                    }
                    if (this.lllIIIllIIIIlllIlIIllIIll instanceof class_0339 && ((class_0339)this.lllIIIllIIIIlllIlIIllIIll).lIIIlllIlIIIlIllIIIlIllll() != null) {
                        class_18222.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new class_2218(1, this.lllIIIllIIIIlllIlIIllIIll, ((class_0339)this.lllIIIllIIIIlllIlIIllIIll).lIIIlllIlIIIlIllIIIlIllll()));
                    }
                    if (this.lllIIIllIIIIlllIlIIllIIll instanceof class_1965) {
                        for (int i = 0; i < 5; ++i) {
                            object2 = ((class_1965)this.lllIIIllIIIIlllIlIIllIIll).IlIllllllIIlIIllllIIlIIIl(i);
                            if (object2 == null) continue;
                            class_18222.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new class_2225(this.lllIIIllIIIIlllIlIIllIIll.llllllIlIllllIlIlIlIIIIlI(), i, (ItemStack)object2));
                        }
                    }
                    if (this.lllIIIllIIIIlllIlIIllIIll instanceof class_0814 && ((class_0814)(object = (class_0814)this.lllIIIllIIIIlllIlIIllIIll)).IIIIIllIIlIlIlIIlIlIlIllI()) {
                        class_18222.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new class_1089((class_0814)object, MathHelper.IlIllllllIIlIIllllIIlIIIl(this.lllIIIllIIIIlllIlIIllIIll.IlIIlllllIIlIlIlllllIllll), MathHelper.IlIllllllIIlIIllllIIlIIIl(this.lllIIIllIIIIlllIlIIllIIll.llIIlIlIlllIIllIlIlllIllI), MathHelper.IlIllllllIIlIIllllIIlIIIl(this.lllIIIllIIIIlllIlIIllIIll.IllIIIIllIIllIllIlllIlIIl)));
                    }
                    if (this.lllIIIllIIIIlllIlIIllIIll instanceof class_1965) {
                        object = (class_1965)this.lllIIIllIIIIlllIlIIllIIll;
                        for (class_1852 class_18522 : ((class_1965)object).IIllIIIlIIllllIIIIIIIIlll()) {
                            class_18222.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new class_0570(this.lllIIIllIIIIlllIlIIllIIll.llllllIlIllllIlIlIlIIIIlI(), class_18522));
                        }
                    }
                }
            } else if (this.IlIlllIIIIIIlIIllIIllIlll.contains(class_18222)) {
                this.IlIlllIIIIIIlIIllIIllIlll.remove(class_18222);
                class_18222.IlIlIIlllIIlIllIIIlllllIl(this.lllIIIllIIIIlllIlIIllIIll);
            }
        }
    }

    private boolean lIlllIlllIIIIlIIlllIllIII(class_1822 class_18222) {
        return class_18222.IIlllIlIlllIllIIIlllIIlIl().IllllIIIIlIIlIIIIlllIIIIl().lllIIIllIIIIlllIlIIllIIll(class_18222, this.lllIIIllIIIIlllIlIIllIIll.lIlIIllIllIIIIIlIllllIIIl, this.lllIIIllIIIIlllIlIIllIIll.llIIIlIlIlIIlIllIIIllIlIl);
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(List list) {
        for (int i = 0; i < list.size(); ++i) {
            this.lllIlIIlIIIlIlIIIllIlllIl((class_1822)list.get(i));
        }
    }

    private class_0703 IlIllllllIIlIIllllIIlIIIl() {
        if (this.lllIIIllIIIIlllIlIIllIIll.IllllIIIIlIIlIIIIlllIIIIl) {
            IlIlIIlIlIllIIlIlIIllIIIl.warn("Fetching addPacket for removed entity");
        }
        if (this.lllIIIllIIIIlllIlIIllIIll instanceof class_1781) {
            return new class_1631(this.lllIIIllIIIIlllIlIIllIIll, 2, 1);
        }
        if (this.lllIIIllIIIIlllIlIIllIIll instanceof class_1822) {
            return new class_1179((class_0814)this.lllIIIllIIIIlllIlIIllIIll);
        }
        if (this.lllIIIllIIIIlllIlIIllIIll instanceof class_1860) {
            class_1860 class_18602 = (class_1860)this.lllIIIllIIIIlllIlIIllIIll;
            return new class_1631(this.lllIIIllIIIIlllIlIIllIIll, 10, class_18602.IlIllllllIIlIIllllIIlIIIl());
        }
        if (this.lllIIIllIIIIlllIlIIllIIll instanceof class_2263) {
            return new class_1631(this.lllIIIllIIIIlllIlIIllIIll, 1);
        }
        if (!(this.lllIIIllIIIIlllIlIIllIIll instanceof class_1463) && !(this.lllIIIllIIIIlllIlIIllIIll instanceof class_1221)) {
            if (this.lllIIIllIIIIlllIlIIllIIll instanceof class_2050) {
                class_0814 class_08142 = ((class_2050)this.lllIIIllIIIIlllIlIIllIIll).lllIlIIlIIIlIlIIIllIlllIl;
                return new class_1631(this.lllIIIllIIIIlllIlIIllIIll, 90, class_08142 != null ? class_08142.llllllIlIllllIlIlIlIIIIlI() : this.lllIIIllIIIIlllIlIIllIIll.llllllIlIllllIlIlIlIIIIlI());
            }
            if (this.lllIIIllIIIIlllIlIIllIIll instanceof class_0369) {
                class_1521 class_15212 = ((class_0369)this.lllIIIllIIIIlllIlIIllIIll).IlIllllllIIlIIllllIIlIIIl;
                return new class_1631(this.lllIIIllIIIIlllIlIIllIIll, 60, class_15212 != null ? class_15212.llllllIlIllllIlIlIlIIIIlI() : this.lllIIIllIIIIlllIlIIllIIll.llllllIlIllllIlIlIlIIIIlI());
            }
            if (this.lllIIIllIIIIlllIlIIllIIll instanceof class_0333) {
                return new class_1631(this.lllIIIllIIIIlllIlIIllIIll, 61);
            }
            if (this.lllIIIllIIIIlllIlIIllIIll instanceof class_0426) {
                return new class_1631(this.lllIIIllIIIIlllIlIIllIIll, 73, ((class_0426)this.lllIIIllIIIIlllIlIIllIIll).lIllllIIlIIIlIllllllIIIll());
            }
            if (this.lllIIIllIIIIlllIlIIllIIll instanceof class_1617) {
                return new class_1631(this.lllIIIllIIIIlllIlIIllIIll, 75);
            }
            if (this.lllIIIllIIIIlllIlIIllIIll instanceof class_1918) {
                return new class_1631(this.lllIIIllIIIIlllIlIIllIIll, 65);
            }
            if (this.lllIIIllIIIIlllIlIIllIIll instanceof class_0093) {
                return new class_1631(this.lllIIIllIIIIlllIlIIllIIll, 72);
            }
            if (this.lllIIIllIIIIlllIlIIllIIll instanceof class_1800) {
                return new class_1631(this.lllIIIllIIIIlllIlIIllIIll, 76);
            }
            if (this.lllIIIllIIIIlllIlIIllIIll instanceof class_1937) {
                class_1937 class_19372 = (class_1937)this.lllIIIllIIIIlllIlIIllIIll;
                class_1631 class_16312 = null;
                int n = 63;
                if (this.lllIIIllIIIIlllIlIIllIIll instanceof class_1332) {
                    n = 64;
                } else if (this.lllIIIllIIIIlllIlIIllIIll instanceof class_2166) {
                    n = 66;
                }
                class_16312 = class_19372.lllIIIllIIIIlllIlIIllIIll != null ? new class_1631(this.lllIIIllIIIIlllIlIIllIIll, n, ((class_1937)this.lllIIIllIIIIlllIlIIllIIll).lllIIIllIIIIlllIlIIllIIll.llllllIlIllllIlIlIlIIIIlI()) : new class_1631(this.lllIIIllIIIIlllIlIIllIIll, n, 0);
                class_16312.lIlllIlllIIIIlIIlllIllIII((int)(class_19372.lllIlIIlIIIlIlIIIllIlllIl * 8000.0));
                class_16312.IlIIIIIllllllIIlllIllllll((int)(class_19372.IlIllllllIIlIIllllIIlIIIl * 8000.0));
                class_16312.lIllllIIlIIIlIllllllIIIll((int)(class_19372.lIlllIlllIIIIlIIlllIllIII * 8000.0));
                return class_16312;
            }
            if (this.lllIIIllIIIIlllIlIIllIIll instanceof class_0525) {
                return new class_1631(this.lllIIIllIIIIlllIlIIllIIll, 62);
            }
            if (this.lllIIIllIIIIlllIlIIllIIll instanceof class_0034) {
                return new class_1631(this.lllIIIllIIIIlllIlIIllIIll, 50);
            }
            if (this.lllIIIllIIIIlllIlIIllIIll instanceof class_0355) {
                return new class_1631(this.lllIIIllIIIIlllIlIIllIIll, 51);
            }
            if (this.lllIIIllIIIIlllIlIIllIIll instanceof class_0543) {
                class_0543 class_05432 = (class_0543)this.lllIIIllIIIIlllIlIIllIIll;
                return new class_1631(this.lllIIIllIIIIlllIlIIllIIll, 70, Block.lllIIIllIIIIlllIlIIllIIll(class_05432.lIlllIlllIIIIlIIlllIllIII()) | class_05432.lllIIIllIIIIlllIlIIllIIll << 16);
            }
            if (this.lllIIIllIIIIlllIlIIllIIll instanceof class_0146) {
                return new class_1364((class_0146)this.lllIIIllIIIIlllIlIIllIIll);
            }
            if (this.lllIIIllIIIIlllIlIIllIIll instanceof class_1094) {
                class_1094 class_10942 = (class_1094)this.lllIIIllIIIIlllIlIIllIIll;
                class_1631 class_16313 = new class_1631(this.lllIIIllIIIIlllIlIIllIIll, 71, class_10942.lllIIIllIIIIlllIlIIllIIll);
                class_16313.lllIIIllIIIIlllIlIIllIIll(MathHelper.lIlllIlllIIIIlIIlllIllIII((float)(class_10942.lllIlIIlIIIlIlIIIllIlllIl * 32)));
                class_16313.lllIlIIlIIIlIlIIIllIlllIl(MathHelper.lIlllIlllIIIIlIIlllIllIII((float)(class_10942.IlIllllllIIlIIllllIIlIIIl * 32)));
                class_16313.IlIllllllIIlIIllllIIlIIIl(MathHelper.lIlllIlllIIIIlIIlllIllIII((float)(class_10942.lIlllIlllIIIIlIIlllIllIII * 32)));
                return class_16313;
            }
            if (this.lllIIIllIIIIlllIlIIllIIll instanceof class_1215) {
                class_1215 class_12152 = (class_1215)this.lllIIIllIIIIlllIlIIllIIll;
                class_1631 class_16314 = new class_1631(this.lllIIIllIIIIlllIlIIllIIll, 77);
                class_16314.lllIIIllIIIIlllIlIIllIIll(MathHelper.lIlllIlllIIIIlIIlllIllIII((float)(class_12152.lllIlIIlIIIlIlIIIllIlllIl * 32)));
                class_16314.lllIlIIlIIIlIlIIIllIlllIl(MathHelper.lIlllIlllIIIIlIIlllIllIII((float)(class_12152.IlIllllllIIlIIllllIIlIIIl * 32)));
                class_16314.IlIllllllIIlIIllllIIlIIIl(MathHelper.lIlllIlllIIIIlIIlllIllIII((float)(class_12152.lIlllIlllIIIIlIIlllIllIII * 32)));
                return class_16314;
            }
            if (this.lllIIIllIIIIlllIlIIllIIll instanceof class_1138) {
                return new class_1720((class_1138)this.lllIIIllIIIIlllIlIIllIIll);
            }
            throw new IllegalArgumentException("Don't know how to add " + this.lllIIIllIIIIlllIlIIllIIll.getClass() + "!");
        }
        this.IIIllIllIIlIlIlIlIllllIIl = MathHelper.lIlllIlllIIIIlIIlllIllIII(this.lllIIIllIIIIlllIlIIllIIll.lIIIIllIIllIIIlIIIllIllII() * 256.0f / 360.0f);
        return new class_2192((class_1965)this.lllIIIllIIIIlllIlIIllIIll);
    }

    public void IlIllllllIIlIIllllIIlIIIl(class_1822 class_18222) {
        if (this.IlIlllIIIIIIlIIllIIllIlll.contains(class_18222)) {
            this.IlIlllIIIIIIlIIllIIllIlll.remove(class_18222);
            class_18222.IlIlIIlllIIlIllIIIlllllIl(this.lllIIIllIIIIlllIlIIllIIll);
        }
    }
}

