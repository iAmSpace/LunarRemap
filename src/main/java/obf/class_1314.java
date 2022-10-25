package obf;

import net.minecraft.init.Blocks;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1314
extends class_1774 {
    public float IllIIlllllllIIlIIlIIIIlIl;
    public float IIIllIllIIlIlIlIlIllllIIl;
    public int IllIIIllIIIIlIlIlIllIIlll;
    private int lIIIIlIlIIlllllIIllIIlIII;

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
        double d;
        super.IlIllllllIIlIIllllIIlIIIl();
        if (++this.lIIIIlIlIIlllllIIllIIlIII % 20 * 4 == 0) {
            this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII(this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, Blocks.lIIIlllllllIlllIIllllllll, 1, this.IllIIIllIIIIlIlIlIllIIlll);
        }
        this.IIIllIllIIlIlIlIlIllllIIl = this.IllIIlllllllIIlIIlIIIIlIl;
        float f = 0.1f;
        if (this.IllIIIllIIIIlIlIlIllIIlll > 0 && this.IllIIlllllllIIlIIlIIIIlIl == 0.0f) {
            double d2 = (double)this.lllIlIIlIIIlIlIIIllIlllIl + 0.5;
            d = (double)this.lIlllIlllIIIIlIIlllIllIII + 0.5;
            this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(d2, (double)this.IlIllllllIIlIIllllIIlIIIl + 0.5, d, "random.chestopen", 0.5f, this.lllIIIllIIIIlllIlIIllIIll.lllllIlllIIllIlIIlIIIllII.nextFloat() * 0.1f + 0.9f);
        }
        if (this.IllIIIllIIIIlIlIlIllIIlll == 0 && this.IllIIlllllllIIlIIlIIIIlIl > 0.0f || this.IllIIIllIIIIlIlIlIllIIlll > 0 && this.IllIIlllllllIIlIIlIIIIlIl < 1.0f) {
            float f2;
            float f3 = this.IllIIlllllllIIlIIlIIIIlIl;
            this.IllIIlllllllIIlIIlIIIIlIl = this.IllIIIllIIIIlIlIlIllIIlll > 0 ? (this.IllIIlllllllIIlIIlIIIIlIl += f) : (this.IllIIlllllllIIlIIlIIIIlIl -= f);
            if (this.IllIIlllllllIIlIIlIIIIlIl > 1.0f) {
                this.IllIIlllllllIIlIIlIIIIlIl = 1.0f;
            }
            if (this.IllIIlllllllIIlIIlIIIIlIl < (f2 = 0.5f) && f3 >= f2) {
                d = (double)this.lllIlIIlIIIlIlIIIllIlllIl + 0.5;
                double d3 = (double)this.lIlllIlllIIIIlIIlllIllIII + 0.5;
                this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(d, (double)this.IlIllllllIIlIIllllIIlIIIl + 0.5, d3, "random.chestclosed", 0.5f, this.lllIIIllIIIIlllIlIIllIIll.lllllIlllIIllIlIIlIIIllII.nextFloat() * 0.1f + 0.9f);
            }
            if (this.IllIIlllllllIIlIIlIIIIlIl < 0.0f) {
                this.IllIIlllllllIIlIIlIIIIlIl = 0.0f;
            }
        }
    }

    @Override
    public boolean lllIlIIlIIIlIlIIIllIlllIl(int n, int n2) {
        if (n == 1) {
            this.IllIIIllIIIIlIlIlIllIIlll = n2;
            return true;
        }
        return super.lllIlIIlIIIlIlIIIllIlllIl(n, n2);
    }

    @Override
    public void IllIIIllIIIIlIlIlIllIIlll() {
        this.llIIlllIllIllllIIIlIIIIII();
        super.IllIIIllIIIIlIlIlIllIIlll();
    }

    public void lllIIIllIIIIlllIlIIllIIll() {
        ++this.IllIIIllIIIIlIlIlIllIIlll;
        this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII(this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, Blocks.lIIIlllllllIlllIIllllllll, 1, this.IllIIIllIIIIlIlIlIllIIlll);
    }

    public void IlIIIIIllllllIIlllIllllll() {
        --this.IllIIIllIIIIlIlIlIllIIlll;
        this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII(this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, Blocks.lIIIlllllllIlllIIllllllll, 1, this.IllIIIllIIIIlIlIlIllIIlll);
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_0814 class_08142) {
        return this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl(this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII) != this ? false : class_08142.lIllllIIlIIIlIllllllIIIll((double)this.lllIlIIlIIIlIlIIIllIlllIl + 0.5, (double)this.IlIllllllIIlIIllllIIlIIIl + 0.5, (double)this.lIlllIlllIIIIlIIlllIllIII + 0.5) <= 64.0;
    }
}

