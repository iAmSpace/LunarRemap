package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.util.MathHelper;

import java.util.Iterator;
import java.util.List;

public abstract class class_1309
extends class_1521 {
    private int IlIIIIIllllllIIlllIllllll;
    public int lllIIIllIIIIlllIlIIllIIll;
    public int lllIlIIlIIIlIlIIIllIlllIl;
    public int IlIllllllIIlIIllllIIlIIIl;
    public int lIlllIlllIIIIlIIlllIllIII;

    public class_1309(class_1334 class_13342) {
        super(class_13342);
        this.llllIlIIIIIIIIIlllIIlIIIl = 0.0f;
        this.IlIIIIIllllllIIlllIllllll(0.5f, 0.5f);
    }

    public class_1309(class_1334 class_13342, int n, int n2, int n3, int n4) {
        this(class_13342);
        this.lllIlIIlIIIlIlIIIllIlllIl = n;
        this.IlIllllllIIlIIllllIIlIIIl = n2;
        this.lIlllIlllIIIIlIIlllIllIII = n3;
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl() {
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n) {
        this.lllIIIllIIIIlllIlIIllIIll = n;
        this.llllIIIIlIIIlIIIIIIlIllll = this.IIIIlIllIlIIlIIlIllIlIlll = (float)(n * 90);
        float f = this.lIlllIlllIIIIlIIlllIllIII();
        float f2 = this.IlIIIIIllllllIIlllIllllll();
        float f3 = this.lIlllIlllIIIIlIIlllIllIII();
        if (n != 2 && n != 0) {
            f = 0.5f;
        } else {
            f3 = 0.5f;
            this.IIIIlIllIlIIlIIlIllIlIlll = this.llllIIIIlIIIlIIIIIIlIllll = (float)(class_1632.lIllllIIlIIIlIllllllIIIll[n] * 90);
        }
        f /= 32.0f;
        f2 /= 32.0f;
        f3 /= 32.0f;
        float f4 = (float)this.lllIlIIlIIIlIlIIIllIlllIl + 0.5f;
        float f5 = (float)this.IlIllllllIIlIIllllIIlIIIl + 0.5f;
        float f6 = (float)this.lIlllIlllIIIIlIIlllIllIII + 0.5f;
        float f7 = 0.5625f;
        if (n == 2) {
            f6 -= f7;
        }
        if (n == 1) {
            f4 -= f7;
        }
        if (n == 0) {
            f6 += f7;
        }
        if (n == 3) {
            f4 += f7;
        }
        if (n == 2) {
            f4 -= this.lllIlIIlIIIlIlIIIllIlllIl(this.lIlllIlllIIIIlIIlllIllIII());
        }
        if (n == 1) {
            f6 += this.lllIlIIlIIIlIlIIIllIlllIl(this.lIlllIlllIIIIlIIlllIllIII());
        }
        if (n == 0) {
            f4 += this.lllIlIIlIIIlIlIIIllIlllIl(this.lIlllIlllIIIIlIIlllIllIII());
        }
        if (n == 3) {
            f6 -= this.lllIlIIlIIIlIlIIIllIlllIl(this.lIlllIlllIIIIlIIlllIllIII());
        }
        this.IlIllllllIIlIIllllIIlIIIl(f4, f5 += this.lllIlIIlIIIlIlIIIllIlllIl(this.IlIIIIIllllllIIlllIllllll()), f6);
        float f8 = -0.03125f;
        this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl(f4 - f - f8, f5 - f2 - f8, f6 - f3 - f8, f4 + f + f8, f5 + f2 + f8, f6 + f3 + f8);
    }

    private float lllIlIIlIIIlIlIIIllIlllIl(int n) {
        return n == 32 ? 0.5f : (n == 64 ? 0.5f : 0.0f);
    }

    @Override
    public void s_() {
        this.llIIlIllIllllIlIIIIlIIlll = this.IlIIlllllIIlIlIlllllIllll;
        this.llIllllIlIllIIIlIllIIlIlI = this.llIIlIlIlllIIllIlIlllIllI;
        this.lIlllIlllIlIIIIlllIlIlIIl = this.IllIIIIllIIllIllIlllIlIIl;
        if (this.IlIIIIIllllllIIlllIllllll++ == 100 && !this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
            this.IlIIIIIllllllIIlllIllllll = 0;
            if (!this.IllllIIIIlIIlIIIIlllIIIIl && !this.IlIllllllIIlIIllllIIlIIIl()) {
                this.IIIIlIIlIIIllIIIIllIIIlII();
                this.lllIlIIlIIIlIlIIIllIlllIl((class_1521)null);
            }
        }
    }

    public boolean IlIllllllIIlIIllllIIlIIIl() {
        Object object;
        if (!this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll((class_1521)this, this.IIllIllIIllIIlllIIIlIlllI).isEmpty()) {
            return false;
        }
        int n = Math.max(1, this.lIlllIlllIIIIlIIlllIllIII() / 16);
        int n2 = Math.max(1, this.IlIIIIIllllllIIlllIllllll() / 16);
        int n3 = this.lllIlIIlIIIlIlIIIllIlllIl;
        int n4 = this.IlIllllllIIlIIllllIIlIIIl;
        int n5 = this.lIlllIlllIIIIlIIlllIllIII;
        if (this.lllIIIllIIIIlllIlIIllIIll == 2) {
            n3 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll - (double)((float)this.lIlllIlllIIIIlIIlllIllIII() / 32.0f));
        }
        if (this.lllIIIllIIIIlllIlIIllIIll == 1) {
            n5 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IllIIIIllIIllIllIlllIlIIl - (double)((float)this.lIlllIlllIIIIlIIlllIllIII() / 32.0f));
        }
        if (this.lllIIIllIIIIlllIlIIllIIll == 0) {
            n3 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll - (double)((float)this.lIlllIlllIIIIlIIlllIllIII() / 32.0f));
        }
        if (this.lllIIIllIIIIlllIlIIllIIll == 3) {
            n5 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IllIIIIllIIllIllIlllIlIIl - (double)((float)this.lIlllIlllIIIIlIIlllIllIII() / 32.0f));
        }
        n4 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.llIIlIlIlllIIllIlIlllIllI - (double)((float)this.IlIIIIIllllllIIlllIllllll() / 32.0f));
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n2; ++j) {
                object = this.lllIIIllIIIIlllIlIIllIIll != 2 && this.lllIIIllIIIIlllIlIIllIIll != 0 ? this.lIlIllIIlIIlIIlIIlIIlIIll.a_(this.lllIlIIlIIIlIlIIIllIlllIl, n4 + j, n5 + i).lIllllIIlIIIlIllllllIIIll() : this.lIlIllIIlIIlIIlIIlIIlIIll.a_(n3 + i, n4 + j, this.lIlllIlllIIIIlIIlllIllIII).lIllllIIlIIIlIllllllIIIll();
                if (((class_1855)object).lllIlIIlIIIlIlIIIllIlllIl()) continue;
                return false;
            }
        }
        List list = this.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl((class_1521)this, this.IIllIllIIllIIlllIIIlIlllI);
        Iterator iterator = list.iterator();
        do {
            if (iterator.hasNext()) continue;
            return true;
        } while (!((object = (class_1521)iterator.next()) instanceof class_1309));
        return false;
    }

    @Override
    public boolean IllllIIlIIIllIlllIlllIllI() {
        return true;
    }

    @Override
    public boolean IIIllIllIIlIlIlIlIllllIIl(class_1521 class_15212) {
        return class_15212 instanceof class_0814 ? this.lllIIIllIIIIlllIlIIllIIll(class_0058.lllIIIllIIIIlllIlIIllIIll((class_0814)class_15212), 0.0f) : false;
    }

    @Override
    public void IllIIIllIIIIlIlIlIllIIlll(int n) {
        this.lIlIllIIlIIlIIlIIlIIlIIll.llllIIIIlIIIlIIIIIIlIllll();
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_0058 class_00582, float f) {
        if (this.lIIllIIlIIIlllIlllIIlIIlI()) {
            return false;
        }
        if (!this.IllllIIIIlIIlIIIIlllIIIIl && !this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
            this.IIIIlIIlIIIllIIIIllIIIlII();
            this.IIlIllIIlllllIIlIIllllIIl();
            this.lllIlIIlIIIlIlIIIllIlllIl(class_00582.IllIIIllIIIIlIlIlIllIIlll());
        }
        return true;
    }

    @Override
    public void IlIIIIIllllllIIlllIllllll(double d, double d2, double d3) {
        if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl && !this.IllllIIIIlIIlIIIIlllIIIIl && d * d + d2 * d2 + d3 * d3 > 0.0) {
            this.IIIIlIIlIIIllIIIIllIIIlII();
            this.lllIlIIlIIIlIlIIIllIlllIl((class_1521)null);
        }
    }

    @Override
    public void IllIIlllllllIIlIIlIIIIlIl(double d, double d2, double d3) {
        if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl && !this.IllllIIIIlIIlIIIIlllIIIIl && d * d + d2 * d2 + d3 * d3 > 0.0) {
            this.IIIIlIIlIIIllIIIIllIIIlII();
            this.lllIlIIlIIIlIlIIIllIlllIl((class_1521)null);
        }
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        class_07752.lllIIIllIIIIlllIlIIllIIll("Direction", (byte)this.lllIIIllIIIIlllIlIIllIIll);
        class_07752.lllIIIllIIIIlllIlIIllIIll("TileX", this.lllIlIIlIIIlIlIIIllIlllIl);
        class_07752.lllIIIllIIIIlllIlIIllIIll("TileY", this.IlIllllllIIlIIllllIIlIIIl);
        class_07752.lllIIIllIIIIlllIlIIllIIll("TileZ", this.lIlllIlllIIIIlIIlllIllIII);
        switch (this.lllIIIllIIIIlllIlIIllIIll) {
            case 0: {
                class_07752.lllIIIllIIIIlllIlIIllIIll("Dir", (byte)2);
                break;
            }
            case 1: {
                class_07752.lllIIIllIIIIlllIlIIllIIll("Dir", (byte)1);
                break;
            }
            case 2: {
                class_07752.lllIIIllIIIIlllIlIIllIIll("Dir", (byte)0);
                break;
            }
            case 3: {
                class_07752.lllIIIllIIIIlllIlIIllIIll("Dir", (byte)3);
            }
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        if (class_07752.lllIlIIlIIIlIlIIIllIlllIl("Direction", 99)) {
            this.lllIIIllIIIIlllIlIIllIIll = class_07752.lIlllIlllIIIIlIIlllIllIII("Direction");
        } else {
            switch (class_07752.lIlllIlllIIIIlIIlllIllIII("Dir")) {
                case 0: {
                    this.lllIIIllIIIIlllIlIIllIIll = 2;
                    break;
                }
                case 1: {
                    this.lllIIIllIIIIlllIlIIllIIll = 1;
                    break;
                }
                case 2: {
                    this.lllIIIllIIIIlllIlIIllIIll = 0;
                    break;
                }
                case 3: {
                    this.lllIIIllIIIIlllIlIIllIIll = 3;
                }
            }
        }
        this.lllIlIIlIIIlIlIIIllIlllIl = class_07752.lIllllIIlIIIlIllllllIIIll("TileX");
        this.IlIllllllIIlIIllllIIlIIIl = class_07752.lIllllIIlIIIlIllllllIIIll("TileY");
        this.lIlllIlllIIIIlIIlllIllIII = class_07752.lIllllIIlIIIlIllllllIIIll("TileZ");
        this.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll);
    }

    public abstract int lIlllIlllIIIIlIIlllIllIII();

    public abstract int IlIIIIIllllllIIlllIllllll();

    public abstract void lllIlIIlIIIlIlIIIllIlllIl(class_1521 var1);

    @Override
    protected boolean IllIlIlIIIlllIIllIIIIlIll() {
        return false;
    }
}

