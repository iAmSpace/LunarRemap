package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.MathHelper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class class_1013 {
    public boolean lllIIIllIIIIlllIlIIllIIll;
    public boolean lllIlIIlIIIlIlIIIllIlllIl = true;
    private int IIIllIllIIlIlIlIlIllllIIl = 16;
    private Random IllIIIllIIIIlIlIlIllIIlll = new Random();
    private class_1334 lIIIIlIlIIlllllIIllIIlIII;
    public double IlIllllllIIlIIllllIIlIIIl;
    public double lIlllIlllIIIIlIIlllIllIII;
    public double IlIIIIIllllllIIlllIllllll;
    public class_1521 lIllllIIlIIIlIllllllIIIll;
    public float IIIllIIlIIIIIIlIlIIllIIlI;
    public List IllIIlllllllIIlIIlIIIIlIl = new ArrayList();
    private Map llIIlllIllIllllIIIlIIIIII = new HashMap();

    public class_1013(class_1334 class_13342, class_1521 class_15212, double d, double d2, double d3, float f) {
        this.lIIIIlIlIIlllllIIllIIlIII = class_13342;
        this.lIllllIIlIIIlIllllllIIIll = class_15212;
        this.IIIllIIlIIIIIIlIlIIllIIlI = f;
        this.IlIllllllIIlIIllllIIlIIIl = d;
        this.lIlllIlllIIIIlIIlllIllIII = d2;
        this.IlIIIIIllllllIIlllIllllll = d3;
    }

    public void lllIIIllIIIIlllIlIIllIIll() {
        double d;
        double d2;
        double d3;
        int n;
        int n2;
        int n3;
        float f = this.IIIllIIlIIIIIIlIlIIllIIlI;
        HashSet<class_2137> hashSet = new HashSet<class_2137>();
        for (n3 = 0; n3 < this.IIIllIllIIlIlIlIlIllllIIl; ++n3) {
            for (n2 = 0; n2 < this.IIIllIllIIlIlIlIlIllllIIl; ++n2) {
                for (n = 0; n < this.IIIllIllIIlIlIlIlIllllIIl; ++n) {
                    if (n3 != 0 && n3 != this.IIIllIllIIlIlIlIlIllllIIl - 1 && n2 != 0 && n2 != this.IIIllIllIIlIlIlIlIllllIIl - 1 && n != 0 && n != this.IIIllIllIIlIlIlIlIllllIIl - 1) continue;
                    double d4 = (float)n3 / ((float)this.IIIllIllIIlIlIlIlIllllIIl - 1.0f) * 2.0f - 1.0f;
                    double d5 = (float)n2 / ((float)this.IIIllIllIIlIlIlIlIllllIIl - 1.0f) * 2.0f - 1.0f;
                    double d6 = (float)n / ((float)this.IIIllIllIIlIlIlIlIllllIIl - 1.0f) * 2.0f - 1.0f;
                    double d7 = Math.sqrt(d4 * d4 + d5 * d5 + d6 * d6);
                    d4 /= d7;
                    d5 /= d7;
                    d6 /= d7;
                    d3 = this.IlIllllllIIlIIllllIIlIIIl;
                    d2 = this.lIlllIlllIIIIlIIlllIllIII;
                    d = this.IlIIIIIllllllIIlllIllllll;
                    float f2 = 0.3f;
                    for (float f3 = this.IIIllIIlIIIIIIlIlIIllIIlI * (0.7f + this.lIIIIlIlIIlllllIIllIIlIII.lllllIlllIIllIlIIlIIIllII.nextFloat() * 0.6f); f3 > 0.0f; f3 -= f2 * 0.75f) {
                        int n4;
                        int n5;
                        int n6 = MathHelper.IlIllllllIIlIIllllIIlIIIl(d3);
                        Block class_05492 = this.lIIIIlIlIIlllllIIllIIlIII.a_(n6, n5 = MathHelper.IlIllllllIIlIIllllIIlIIIl(d2), n4 = MathHelper.IlIllllllIIlIIllllIIlIIIl(d));
                        if (class_05492.lIllllIIlIIIlIllllllIIIll() != class_1855.lllIIIllIIIIlllIlIIllIIll) {
                            float f4 = this.lIllllIIlIIIlIllllllIIIll != null ? this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(this, this.lIIIIlIlIIlllllIIllIIlIII, n6, n5, n4, class_05492) : class_05492.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll);
                            f3 -= (f4 + 0.3f) * f2;
                        }
                        if (f3 > 0.0f && (this.lIllllIIlIIIlIllllllIIIll == null || this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(this, this.lIIIIlIlIIlllllIIllIIlIII, n6, n5, n4, class_05492, f3))) {
                            hashSet.add(new class_2137(n6, n5, n4));
                        }
                        d3 += d4 * (double)f2;
                        d2 += d5 * (double)f2;
                        d += d6 * (double)f2;
                    }
                }
            }
        }
        this.IllIIlllllllIIlIIlIIIIlIl.addAll(hashSet);
        this.IIIllIIlIIIIIIlIlIIllIIlI *= 2.0f;
        n3 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIllllllIIlIIllllIIlIIIl - (double)this.IIIllIIlIIIIIIlIlIIllIIlI - 1.0);
        n2 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIllllllIIlIIllllIIlIIIl + (double)this.IIIllIIlIIIIIIlIlIIllIIlI + 1.0);
        n = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.lIlllIlllIIIIlIIlllIllIII - (double)this.IIIllIIlIIIIIIlIlIIllIIlI - 1.0);
        int n7 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.lIlllIlllIIIIlIIlllIllIII + (double)this.IIIllIIlIIIIIIlIlIIllIIlI + 1.0);
        int n8 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIIIIIllllllIIlllIllllll - (double)this.IIIllIIlIIIIIIlIlIIllIIlI - 1.0);
        int n9 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIIIIIllllllIIlllIllllll + (double)this.IIIllIIlIIIIIIlIlIIllIIlI + 1.0);
        List list = this.lIIIIlIlIIlllllIIllIIlIII.lllIlIIlIIIlIlIIIllIlllIl(this.lIllllIIlIIIlIllllllIIIll, class_1974.lllIIIllIIIIlllIlIIllIIll(n3, n, n8, n2, n7, n9));
        class_0864 class_08642 = class_0864.lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll);
        for (int i = 0; i < list.size(); ++i) {
            double d8;
            class_1521 class_15212 = (class_1521)list.get(i);
            double d9 = class_15212.IIIllIIlIIIIIIlIlIIllIIlI(this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll) / (double)this.IIIllIIlIIIIIIlIlIIllIIlI;
            if (!(d9 <= 1.0) || (d8 = (double) MathHelper.lllIIIllIIIIlllIlIIllIIll((d3 = class_15212.IlIIlllllIIlIlIlllllIllll - this.IlIllllllIIlIIllllIIlIIIl) * d3 + (d2 = class_15212.llIIlIlIlllIIllIlIlllIllI + (double)class_15212.llIIllIllIlIIlIIllIllllll() - this.lIlllIlllIIIIlIIlllIllIII) * d2 + (d = class_15212.IllIIIIllIIllIllIlllIlIIl - this.IlIIIIIllllllIIlllIllllll) * d)) == 0.0) continue;
            double d10 = this.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(class_08642, class_15212.IIllIllIIllIIlllIIIlIlllI);
            double d11 = (1.0 - d9) * d10;
            class_15212.lllIIIllIIIIlllIlIIllIIll(class_0058.lllIIIllIIIIlllIlIIllIIll(this), (float)((int)((d11 * d11 + d11) / 2.0 * 8.0 * (double)this.IIIllIIlIIIIIIlIlIIllIIlI + 1.0)));
            double d12 = class_1712.lllIIIllIIIIlllIlIIllIIll(class_15212, d11);
            class_15212.IIIIIIIIlIllIIllIIlllIllI += (d3 /= d8) * d12;
            class_15212.IIlIIlIlIlIllIIlIlIIIIlll += (d2 /= d8) * d12;
            class_15212.llIIIlllIlllIlIllIIIIllIl += (d /= d8) * d12;
            if (!(class_15212 instanceof class_0814)) continue;
            this.llIIlllIllIllllIIIlIIIIII.put((class_0814)class_15212, class_0864.lllIIIllIIIIlllIlIIllIIll(d3 * d11, d2 * d11, d * d11));
        }
        this.IIIllIIlIIIIIIlIlIIllIIlI = f;
    }

    public void lllIIIllIIIIlllIlIIllIIll(boolean bl) {
        Block class_05492;
        int n;
        int n2;
        int n3;
        this.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll, "random.explode", 4.0f, (1.0f + (this.lIIIIlIlIIlllllIIllIIlIII.lllllIlllIIllIlIIlIIIllII.nextFloat() - this.lIIIIlIlIIlllllIIllIIlIII.lllllIlllIIllIlIIlIIIllII.nextFloat()) * 0.2f) * 0.7f);
        if (this.IIIllIIlIIIIIIlIlIIllIIlI >= 2.0f && this.lllIlIIlIIIlIlIIIllIlllIl) {
            this.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll("hugeexplosion", this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll, 1.0, 0.0, 0.0);
        } else {
            this.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll("largeexplode", this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll, 1.0, 0.0, 0.0);
        }
        if (this.lllIlIIlIIIlIlIIIllIlllIl) {
            for (class_2137 class_21372 : this.IllIIlllllllIIlIIlIIIIlIl) {
                n3 = class_21372.lllIIIllIIIIlllIlIIllIIll;
                n2 = class_21372.lllIlIIlIIIlIlIIIllIlllIl;
                n = class_21372.IlIllllllIIlIIllllIIlIIIl;
                class_05492 = this.lIIIIlIlIIlllllIIllIIlIII.a_(n3, n2, n);
                if (bl) {
                    double d = (float)n3 + this.lIIIIlIlIIlllllIIllIIlIII.lllllIlllIIllIlIIlIIIllII.nextFloat();
                    double d2 = (float)n2 + this.lIIIIlIlIIlllllIIllIIlIII.lllllIlllIIllIlIIlIIIllII.nextFloat();
                    double d3 = (float)n + this.lIIIIlIlIIlllllIIllIIlIII.lllllIlllIIllIlIIlIIIllII.nextFloat();
                    double d4 = d - this.IlIllllllIIlIIllllIIlIIIl;
                    double d5 = d2 - this.lIlllIlllIIIIlIIlllIllIII;
                    double d6 = d3 - this.IlIIIIIllllllIIlllIllllll;
                    double d7 = MathHelper.lllIIIllIIIIlllIlIIllIIll(d4 * d4 + d5 * d5 + d6 * d6);
                    d4 /= d7;
                    d5 /= d7;
                    d6 /= d7;
                    double d8 = 0.5 / (d7 / (double)this.IIIllIIlIIIIIIlIlIIllIIlI + 0.1);
                    this.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll("explode", (d + this.IlIllllllIIlIIllllIIlIIIl * 1.0) / 2.0, (d2 + this.lIlllIlllIIIIlIIlllIllIII * 1.0) / 2.0, (d3 + this.IlIIIIIllllllIIlllIllllll * 1.0) / 2.0, d4 *= (d8 *= (double)(this.lIIIIlIlIIlllllIIllIIlIII.lllllIlllIIllIlIIlIIIllII.nextFloat() * this.lIIIIlIlIIlllllIIllIIlIII.lllllIlllIIllIlIIlIIIllII.nextFloat() + 0.3f)), d5 *= d8, d6 *= d8);
                    this.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll("smoke", d, d2, d3, d4, d5, d6);
                }
                if (class_05492.lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll) continue;
                if (class_05492.lllIIIllIIIIlllIlIIllIIll(this)) {
                    class_05492.lllIIIllIIIIlllIlIIllIIll(this.lIIIIlIlIIlllllIIllIIlIII, n3, n2, n, this.lIIIIlIlIIlllllIIllIIlIII.IlIllllllIIlIIllllIIlIIIl(n3, n2, n), 1.0f / this.IIIllIIlIIIIIIlIlIIllIIlI, 0);
                }
                this.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(n3, n2, n, Blocks.lllIIIllIIIIlllIlIIllIIll, 0, 3);
                class_05492.lllIIIllIIIIlllIlIIllIIll(this.lIIIIlIlIIlllllIIllIIlIII, n3, n2, n, this);
            }
        }
        if (this.lllIIIllIIIIlllIlIIllIIll) {
            for (class_2137 class_21372 : this.IllIIlllllllIIlIIlIIIIlIl) {
                n3 = class_21372.lllIIIllIIIIlllIlIIllIIll;
                n2 = class_21372.lllIlIIlIIIlIlIIIllIlllIl;
                n = class_21372.IlIllllllIIlIIllllIIlIIIl;
                class_05492 = this.lIIIIlIlIIlllllIIllIIlIII.a_(n3, n2, n);
                Block class_05493 = this.lIIIIlIlIIlllllIIllIIlIII.a_(n3, n2 - 1, n);
                if (class_05492.lIllllIIlIIIlIllllllIIIll() != class_1855.lllIIIllIIIIlllIlIIllIIll || !class_05493.lllIIIllIIIIlllIlIIllIIll() || this.IllIIIllIIIIlIlIlIllIIlll.nextInt(3) != 0) continue;
                this.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(n3, n2, n, Blocks.lIIlIlllIllIlIlllIIIIIIII);
            }
        }
    }

    public Map lllIlIIlIIIlIlIIIllIlllIl() {
        return this.llIIlllIllIllllIIIlIIIIII;
    }

    public class_1965 IlIllllllIIlIIllllIIlIIIl() {
        return this.lIllllIIlIIIlIllllllIIIll == null ? null : (this.lIllllIIlIIIlIllllllIIIll instanceof class_0034 ? ((class_0034)this.lIllllIIlIIIlIllllllIIIll).IlIllllllIIlIIllllIIlIIIl() : (this.lIllllIIlIIIlIllllllIIIll instanceof class_1965 ? (class_1965)this.lIllllIIlIIIlIllllllIIIll : null));
    }
}

