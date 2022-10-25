package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

import java.util.List;

public class class_0071
extends class_1774
implements class_0850 {
    private ItemStack[] IlIlIIlIlIllIIlIlIIllIIIl = new ItemStack[36];
    public boolean IllIIlllllllIIlIIlIIIIlIl;
    public class_0071 IIIllIllIIlIlIlIlIllllIIl;
    public class_0071 IllIIIllIIIIlIlIlIllIIlll;
    public class_0071 lIIIIlIlIIlllllIIllIIlIII;
    public class_0071 llIIlllIllIllllIIIlIIIIII;
    public float llIIllIllIlIIlIIllIllllll;
    public float lllIIlIIIllllllIIIIlIlIlI;
    public int IlIlllIIIIIIlIIllIIllIlll;
    private int lllllIlllIIllIlIIlIIIllII;
    private int IlIlIIlllIIlIllIIIlllllIl;
    private String lIIlIIIIIlIlllIlIIlIlIlll;

    public class_0071() {
        this.IlIlIIlllIIlIllIIIlllllIl = -1;
    }

    public class_0071(int n) {
        this.IlIlIIlllIIlIllIIIlllllIl = n;
    }

    @Override
    public int IlIIIIIllllllIIlllIllllll() {
        return 27;
    }

    @Override
    public ItemStack llIIllIllIlIIlIIllIllllll(int n) {
        return this.IlIlIIlIlIllIIlIlIIllIIIl[n];
    }

    @Override
    public ItemStack lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        if (this.IlIlIIlIlIllIIlIlIIllIIIl[n] != null) {
            if (this.IlIlIIlIlIllIIlIlIIllIIIl[n].lllIlIIlIIIlIlIIIllIlllIl <= n2) {
                ItemStack class_08972 = this.IlIlIIlIlIllIIlIlIIllIIIl[n];
                this.IlIlIIlIlIllIIlIlIIllIIIl[n] = null;
                this.llIIlIllIllllIlIIIIlIIlll();
                return class_08972;
            }
            ItemStack class_08973 = this.IlIlIIlIlIllIIlIlIIllIIIl[n].lllIIIllIIIIlllIlIIllIIll(n2);
            if (this.IlIlIIlIlIllIIlIlIIllIIIl[n].lllIlIIlIIIlIlIIIllIlllIl == 0) {
                this.IlIlIIlIlIllIIlIlIIllIIIl[n] = null;
            }
            this.llIIlIllIllllIlIIIIlIIlll();
            return class_08973;
        }
        return null;
    }

    @Override
    public ItemStack lllIIlIIIllllllIIIIlIlIlI(int n) {
        if (this.IlIlIIlIlIllIIlIlIIllIIIl[n] != null) {
            ItemStack class_08972 = this.IlIlIIlIlIllIIlIlIIllIIIl[n];
            this.IlIlIIlIlIllIIlIlIIllIIIl[n] = null;
            return class_08972;
        }
        return null;
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(int n, ItemStack class_08972) {
        this.IlIlIIlIlIllIIlIlIIllIIIl[n] = class_08972;
        if (class_08972 != null && class_08972.lllIlIIlIIIlIlIIIllIlllIl > this.llIIlIlIlllIIllIlIlllIllI()) {
            class_08972.lllIlIIlIIIlIlIIIllIlllIl = this.llIIlIlIlllIIllIlIlllIllI();
        }
        this.llIIlIllIllllIlIIIIlIIlll();
    }

    @Override
    public String IlIIlllllIIlIlIlllllIllll() {
        return this.IIlllIlIlllIllIIIlllIIlIl() ? this.lIIlIIIIIlIlllIlIIlIlIlll : "container.chest";
    }

    @Override
    public boolean IIlllIlIlllIllIIIlllIIlIl() {
        return this.lIIlIIIIIlIlllIlIIlIlIlll != null && this.lIIlIIIIIlIlllIlIIlIlIlll.length() > 0;
    }

    public void lllIIIllIIIIlllIlIIllIIll(String string) {
        this.lIIlIIIIIlIlllIlIIlIlIlll = string;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        super.lllIIIllIIIIlllIlIIllIIll(class_07752);
        class_2145 class_21452 = class_07752.IlIllllllIIlIIllllIIlIIIl("net.minecraft.init.Items", 10);
        this.IlIlIIlIlIllIIlIlIIllIIIl = new ItemStack[this.IlIIIIIllllllIIlllIllllll()];
        if (class_07752.lllIlIIlIIIlIlIIIllIlllIl("CustomName", 8)) {
            this.lIIlIIIIIlIlllIlIIlIlIlll = class_07752.IllIIIllIIIIlIlIlIllIIlll("CustomName");
        }
        for (int i = 0; i < class_21452.lIlllIlllIIIIlIIlllIllIII(); ++i) {
            class_0775 class_07753 = class_21452.lllIlIIlIIIlIlIIIllIlllIl(i);
            int n = class_07753.lIlllIlllIIIIlIIlllIllIII("Slot") & 0xFF;
            if (n < 0 || n >= this.IlIlIIlIlIllIIlIlIIllIIIl.length) continue;
            this.IlIlIIlIlIllIIlIlIIllIIIl[n] = ItemStack.lllIIIllIIIIlllIlIIllIIll(class_07753);
        }
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        super.lllIlIIlIIIlIlIIIllIlllIl(class_07752);
        class_2145 class_21452 = new class_2145();
        for (int i = 0; i < this.IlIlIIlIlIllIIlIlIIllIIIl.length; ++i) {
            if (this.IlIlIIlIlIllIIlIlIIllIIIl[i] == null) continue;
            class_0775 class_07753 = new class_0775();
            class_07753.lllIIIllIIIIlllIlIIllIIll("Slot", (byte)i);
            this.IlIlIIlIlIllIIlIlIIllIIIl[i].lllIlIIlIIIlIlIIIllIlllIl(class_07753);
            class_21452.lllIIIllIIIIlllIlIIllIIll(class_07753);
        }
        class_07752.lllIIIllIIIIlllIlIIllIIll("net.minecraft.init.Items", class_21452);
        if (this.IIlllIlIlllIllIIIlllIIlIl()) {
            class_07752.lllIIIllIIIIlllIlIIllIIll("CustomName", this.lIIlIIIIIlIlllIlIIlIlIlll);
        }
    }

    @Override
    public int llIIlIlIlllIIllIlIlllIllI() {
        return 64;
    }

    @Override
    public boolean lIlllIlllIIIIlIIlllIllIII(class_0814 class_08142) {
        return this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl(this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII) != this ? false : class_08142.lIllllIIlIIIlIllllllIIIll((double)this.lllIlIIlIIIlIlIIIllIlllIl + 0.5, (double)this.IlIllllllIIlIIllllIIlIIIl + 0.5, (double)this.lIlllIlllIIIIlIIlllIllIII + 0.5) <= 64.0;
    }

    @Override
    public void llIIlllIllIllllIIIlIIIIII() {
        super.llIIlllIllIllllIIIlIIIIII();
        this.IllIIlllllllIIlIIlIIIIlIl = false;
    }

    private void lllIIIllIIIIlllIlIIllIIll(class_0071 class_00712, int n) {
        if (class_00712.IIIllIllIIlIlIlIlIllllIIl()) {
            this.IllIIlllllllIIlIIlIIIIlIl = false;
        } else if (this.IllIIlllllllIIlIIlIIIIlIl) {
            switch (n) {
                case 0: {
                    if (this.llIIlllIllIllllIIIlIIIIII == class_00712) break;
                    this.IllIIlllllllIIlIIlIIIIlIl = false;
                    break;
                }
                case 1: {
                    if (this.lIIIIlIlIIlllllIIllIIlIII == class_00712) break;
                    this.IllIIlllllllIIlIIlIIIIlIl = false;
                    break;
                }
                case 2: {
                    if (this.IIIllIllIIlIlIlIlIllllIIl == class_00712) break;
                    this.IllIIlllllllIIlIIlIIIIlIl = false;
                    break;
                }
                case 3: {
                    if (this.IllIIIllIIIIlIlIlIllIIlll == class_00712) break;
                    this.IllIIlllllllIIlIIlIIIIlIl = false;
                }
            }
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll() {
        if (!this.IllIIlllllllIIlIIlIIIIlIl) {
            class_1774 class_17742;
            this.IllIIlllllllIIlIIlIIIIlIl = true;
            this.IIIllIllIIlIlIlIlIllllIIl = null;
            this.IllIIIllIIIIlIlIlIllIIlll = null;
            this.lIIIIlIlIIlllllIIllIIlIII = null;
            this.llIIlllIllIllllIIIlIIIIII = null;
            if (this.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl - 1, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII) && (class_17742 = this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl(this.lllIlIIlIIIlIlIIIllIlllIl - 1, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII)) instanceof class_0071) {
                this.lIIIIlIlIIlllllIIllIIlIII = (class_0071)class_17742;
            }
            if (this.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl + 1, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII) && (class_17742 = this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl(this.lllIlIIlIIIlIlIIIllIlllIl + 1, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII)) instanceof class_0071) {
                this.IllIIIllIIIIlIlIlIllIIlll = (class_0071)class_17742;
            }
            if (this.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII - 1) && (class_17742 = this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl(this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII - 1)) instanceof class_0071) {
                this.IIIllIllIIlIlIlIlIllllIIl = (class_0071)class_17742;
            }
            if (this.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII + 1) && (class_17742 = this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl(this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII + 1)) instanceof class_0071) {
                this.llIIlllIllIllllIIIlIIIIII = (class_0071)class_17742;
            }
            if (this.IIIllIllIIlIlIlIlIllllIIl != null) {
                this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(this, 0);
            }
            if (this.llIIlllIllIllllIIIlIIIIII != null) {
                this.llIIlllIllIllllIIIlIIIIII.lllIIIllIIIIlllIlIIllIIll(this, 2);
            }
            if (this.IllIIIllIIIIlIlIlIllIIlll != null) {
                this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(this, 1);
            }
            if (this.lIIIIlIlIIlllllIIllIIlIII != null) {
                this.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(this, 3);
            }
        }
    }

    private boolean lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        if (this.lllIIIllIIIIlllIlIIllIIll == null) {
            return false;
        }
        Block class_05492 = this.lllIIIllIIIIlllIlIIllIIll.a_(n, n2, n3);
        return class_05492 instanceof class_1041 && ((class_1041)class_05492).llllllIlIllllIlIlIlIIIIlI == this.lllIIlIIIllllllIIIIlIlIlI();
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
        float f;
        super.IlIllllllIIlIIllllIIlIIIl();
        this.lllIIIllIIIIlllIlIIllIIll();
        ++this.lllllIlllIIllIlIIlIIIllII;
        if (!this.lllIIIllIIIIlllIlIIllIIll.IllIIIIllIIllIllIlllIlIIl && this.IlIlllIIIIIIlIIllIIllIlll != 0 && (this.lllllIlllIIllIlIIlIIIllII + this.lllIlIIlIIIlIlIIIllIlllIl + this.IlIllllllIIlIIllllIIlIIIl + this.lIlllIlllIIIIlIIlllIllIII) % 200 == 0) {
            this.IlIlllIIIIIIlIIllIIllIlll = 0;
            f = 5.0f;
            List list = this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(class_0814.class, class_1974.lllIIIllIIIIlllIlIIllIIll((float)this.lllIlIIlIIIlIlIIIllIlllIl - f, (float)this.IlIllllllIIlIIllllIIlIIIl - f, (float)this.lIlllIlllIIIIlIIlllIllIII - f, (float)(this.lllIlIIlIIIlIlIIIllIlllIl + 1) + f, (float)(this.IlIllllllIIlIIllllIIlIIIl + 1) + f, (float)(this.lIlllIlllIIIIlIIlllIllIII + 1) + f));
            for (class_0814 class_08142 : list) {
                class_0850 class_08502;
                if (!(class_08142.lIIIlIllllIlllIIIIIllIIIl instanceof class_0965) || (class_08502 = ((class_0965)class_08142.lIIIlIllllIlllIIIIIllIIIl).lllIIIllIIIIlllIlIIllIIll()) != this && (!(class_08502 instanceof class_1369) || !((class_1369)class_08502).lllIIIllIIIIlllIlIIllIIll(this))) continue;
                ++this.IlIlllIIIIIIlIIllIIllIlll;
            }
        }
        this.lllIIlIIIllllllIIIIlIlIlI = this.llIIllIllIlIIlIIllIllllll;
        f = 0.1f;
        if (this.IlIlllIIIIIIlIIllIIllIlll > 0 && this.llIIllIllIlIIlIIllIllllll == 0.0f && this.IIIllIllIIlIlIlIlIllllIIl == null && this.lIIIIlIlIIlllllIIllIIlIII == null) {
            double d = (double)this.lllIlIIlIIIlIlIIIllIlllIl + 0.5;
            double d2 = (double)this.lIlllIlllIIIIlIIlllIllIII + 0.5;
            if (this.llIIlllIllIllllIIIlIIIIII != null) {
                d2 += 0.5;
            }
            if (this.IllIIIllIIIIlIlIlIllIIlll != null) {
                d += 0.5;
            }
            this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(d, (double)this.IlIllllllIIlIIllllIIlIIIl + 0.5, d2, "random.chestopen", 0.5f, this.lllIIIllIIIIlllIlIIllIIll.lllllIlllIIllIlIIlIIIllII.nextFloat() * 0.1f + 0.9f);
        }
        if (this.IlIlllIIIIIIlIIllIIllIlll == 0 && this.llIIllIllIlIIlIIllIllllll > 0.0f || this.IlIlllIIIIIIlIIllIIllIlll > 0 && this.llIIllIllIlIIlIIllIllllll < 1.0f) {
            float f2;
            float f3 = this.llIIllIllIlIIlIIllIllllll;
            this.llIIllIllIlIIlIIllIllllll = this.IlIlllIIIIIIlIIllIIllIlll > 0 ? (this.llIIllIllIlIIlIIllIllllll += f) : (this.llIIllIllIlIIlIIllIllllll -= f);
            if (this.llIIllIllIlIIlIIllIllllll > 1.0f) {
                this.llIIllIllIlIIlIIllIllllll = 1.0f;
            }
            if (this.llIIllIllIlIIlIIllIllllll < (f2 = 0.5f) && f3 >= f2 && this.IIIllIllIIlIlIlIlIllllIIl == null && this.lIIIIlIlIIlllllIIllIIlIII == null) {
                double d = (double)this.lllIlIIlIIIlIlIIIllIlllIl + 0.5;
                double d3 = (double)this.lIlllIlllIIIIlIIlllIllIII + 0.5;
                if (this.llIIlllIllIllllIIIlIIIIII != null) {
                    d3 += 0.5;
                }
                if (this.IllIIIllIIIIlIlIlIllIIlll != null) {
                    d += 0.5;
                }
                this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(d, (double)this.IlIllllllIIlIIllllIIlIIIl + 0.5, d3, "random.chestclosed", 0.5f, this.lllIIIllIIIIlllIlIIllIIll.lllllIlllIIllIlIIlIIIllII.nextFloat() * 0.1f + 0.9f);
            }
            if (this.llIIllIllIlIIlIIllIllllll < 0.0f) {
                this.llIIllIllIlIIlIIllIllllll = 0.0f;
            }
        }
    }

    @Override
    public boolean lllIlIIlIIIlIlIIIllIlllIl(int n, int n2) {
        if (n == 1) {
            this.IlIlllIIIIIIlIIllIIllIlll = n2;
            return true;
        }
        return super.lllIlIIlIIIlIlIIIllIlllIl(n, n2);
    }

    @Override
    public void llIllllIlIllIIIlIllIIlIlI() {
        if (this.IlIlllIIIIIIlIIllIIllIlll < 0) {
            this.IlIlllIIIIIIlIIllIIllIlll = 0;
        }
        ++this.IlIlllIIIIIIlIIllIIllIlll;
        this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII(this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, this.IIIllIIlIIIIIIlIlIIllIIlI(), 1, this.IlIlllIIIIIIlIIllIIllIlll);
        this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl(this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, this.IIIllIIlIIIIIIlIlIIllIIlI());
        this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl(this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl - 1, this.lIlllIlllIIIIlIIlllIllIII, this.IIIllIIlIIIIIIlIlIIllIIlI());
    }

    @Override
    public void lIlllIlllIlIIIIlllIlIlIIl() {
        if (this.IIIllIIlIIIIIIlIlIIllIIlI() instanceof class_1041) {
            --this.IlIlllIIIIIIlIIllIIllIlll;
            this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII(this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, this.IIIllIIlIIIIIIlIlIIllIIlI(), 1, this.IlIlllIIIIIIlIIllIIllIlll);
            this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl(this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, this.IIIllIIlIIIIIIlIlIIllIIlI());
            this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl(this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl - 1, this.lIlllIlllIIIIlIIlllIllIII, this.IIIllIIlIIIIIIlIlIIllIIlI());
        }
    }

    @Override
    public boolean IlIllllllIIlIIllllIIlIIIl(int n, ItemStack class_08972) {
        return true;
    }

    @Override
    public void IllIIIllIIIIlIlIlIllIIlll() {
        super.IllIIIllIIIIlIlIlIllIIlll();
        this.llIIlllIllIllllIIIlIIIIII();
        this.lllIIIllIIIIlllIlIIllIIll();
    }

    public int lllIIlIIIllllllIIIIlIlIlI() {
        if (this.IlIlIIlllIIlIllIIIlllllIl == -1) {
            if (this.lllIIIllIIIIlllIlIIllIIll == null || !(this.IIIllIIlIIIIIIlIlIIllIIlI() instanceof class_1041)) {
                return 0;
            }
            this.IlIlIIlllIIlIllIIIlllllIl = ((class_1041)this.IIIllIIlIIIIIIlIlIIllIIlI()).llllllIlIllllIlIlIlIIIIlI;
        }
        return this.IlIlIIlllIIlIllIIIlllllIl;
    }
}

