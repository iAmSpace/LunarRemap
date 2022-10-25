package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.init.Blocks;
import net.minecraft.util.MathHelper;

import java.util.List;

public class class_0411
extends class_1602 {
    private int lllIlIIlIIIlIlIIIllIlllIl;
    public long lllIIIllIIIIlllIlIIllIIll;
    private int IlIllllllIIlIIllllIIlIIIl;

    public class_0411(class_1334 class_13342, double d, double d2, double d3) {
        super(class_13342);
        this.lllIlIIlIIIlIlIIIllIlllIl(d, d2, d3, 0.0f, 0.0f);
        this.lllIlIIlIIIlIlIIIllIlllIl = 2;
        this.lllIIIllIIIIlllIlIIllIIll = this.IlllIIlllllllIIllIlIllllI.nextLong();
        this.IlIllllllIIlIIllllIIlIIIl = this.IlllIIlllllllIIllIlIllllI.nextInt(3) + 1;
        if (!class_13342.IllIIIIllIIllIllIlllIlIIl && class_13342.IlIIlllllIIlIlIlllllIllll().lllIlIIlIIIlIlIIIllIlllIl("doFireTick") && (class_13342.IlIlIIlIlIllIIlIlIIllIIIl == class_1999.IlIllllllIIlIIllllIIlIIIl || class_13342.IlIlIIlIlIllIIlIlIIllIIIl == class_1999.lIlllIlllIIIIlIIlllIllIII) && class_13342.IlIllllllIIlIIllllIIlIIIl(MathHelper.IlIllllllIIlIIllllIIlIIIl(d), MathHelper.IlIllllllIIlIIllllIIlIIIl(d2), MathHelper.IlIllllllIIlIIllllIIlIIIl(d3), 10)) {
            int n;
            int n2;
            int n3 = MathHelper.IlIllllllIIlIIllllIIlIIIl(d);
            if (class_13342.a_(n3, n2 = MathHelper.IlIllllllIIlIIllllIIlIIIl(d2), n = MathHelper.IlIllllllIIlIIllllIIlIIIl(d3)).lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll && Blocks.lIIlIlllIllIlIlllIIIIIIII.IlIIIIIllllllIIlllIllllll(class_13342, n3, n2, n)) {
                class_13342.lllIIIllIIIIlllIlIIllIIll(n3, n2, n, Blocks.lIIlIlllIllIlIlllIIIIIIII);
            }
            for (n3 = 0; n3 < 4; ++n3) {
                int n4;
                n2 = MathHelper.IlIllllllIIlIIllllIIlIIIl(d) + this.IlllIIlllllllIIllIlIllllI.nextInt(3) - 1;
                if (class_13342.a_(n2, n = MathHelper.IlIllllllIIlIIllllIIlIIIl(d2) + this.IlllIIlllllllIIllIlIllllI.nextInt(3) - 1, n4 = MathHelper.IlIllllllIIlIIllllIIlIIIl(d3) + this.IlllIIlllllllIIllIlIllllI.nextInt(3) - 1).lIllllIIlIIIlIllllllIIIll() != class_1855.lllIIIllIIIIlllIlIIllIIll || !Blocks.lIIlIlllIllIlIlllIIIIIIII.IlIIIIIllllllIIlllIllllll(class_13342, n2, n, n4)) continue;
                class_13342.lllIIIllIIIIlllIlIIllIIll(n2, n, n4, Blocks.lIIlIlllIllIlIlllIIIIIIII);
            }
        }
    }

    @Override
    public void s_() {
        super.s_();
        if (this.lllIlIIlIIIlIlIIIllIlllIl == 2) {
            this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI, this.IllIIIIllIIllIllIlllIlIIl, "ambient.weather.thunder", 10000.0f, 0.8f + this.IlllIIlllllllIIllIlIllllI.nextFloat() * 0.2f);
            this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI, this.IllIIIIllIIllIllIlllIlIIl, "random.explode", 2.0f, 0.5f + this.IlllIIlllllllIIllIlIllllI.nextFloat() * 0.2f);
        }
        --this.lllIlIIlIIIlIlIIIllIlllIl;
        if (this.lllIlIIlIIIlIlIIIllIlllIl < 0) {
            if (this.IlIllllllIIlIIllllIIlIIIl == 0) {
                this.IIIIlIIlIIIllIIIIllIIIlII();
            } else if (this.lllIlIIlIIIlIlIIIllIlllIl < -this.IlllIIlllllllIIllIlIllllI.nextInt(10)) {
                int n;
                int n2;
                int n3;
                --this.IlIllllllIIlIIllllIIlIIIl;
                this.lllIlIIlIIIlIlIIIllIlllIl = 1;
                this.lllIIIllIIIIlllIlIIllIIll = this.IlllIIlllllllIIllIlIllllI.nextLong();
                if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl && this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIlllllIIlIlIlllllIllll().lllIlIIlIIIlIlIIIllIlllIl("doFireTick") && this.lIlIllIIlIIlIIlIIlIIlIIll.IlIllllllIIlIIllllIIlIIIl(MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll), MathHelper.IlIllllllIIlIIllllIIlIIIl(this.llIIlIlIlllIIllIlIlllIllI), MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IllIIIIllIIllIllIlllIlIIl), 10) && this.lIlIllIIlIIlIIlIIlIIlIIll.a_(n3 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll), n2 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.llIIlIlIlllIIllIlIlllIllI), n = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IllIIIIllIIllIllIlllIlIIl)).lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll && Blocks.lIIlIlllIllIlIlllIIIIIIII.IlIIIIIllllllIIlllIllllll(this.lIlIllIIlIIlIIlIIlIIlIIll, n3, n2, n)) {
                    this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(n3, n2, n, Blocks.lIIlIlllIllIlIlllIIIIIIII);
                }
            }
        }
        if (this.lllIlIIlIIIlIlIIIllIlllIl >= 0) {
            if (this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
                this.lIlIllIIlIIlIIlIIlIIlIIll.IlIlllIIIIIIlIIllIIllIlll = 2;
            } else {
                double d = 3.0;
                List list = this.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl((class_1521)this, class_1974.lllIIIllIIIIlllIlIIllIIll(this.IlIIlllllIIlIlIlllllIllll - d, this.llIIlIlIlllIIllIlIlllIllI - d, this.IllIIIIllIIllIllIlllIlIIl - d, this.IlIIlllllIIlIlIlllllIllll + d, this.llIIlIlIlllIIllIlIlllIllI + 6.0 + d, this.IllIIIIllIIllIllIlllIlIIl + d));
                for (int i = 0; i < list.size(); ++i) {
                    class_1521 class_15212 = (class_1521)list.get(i);
                    class_15212.lllIIIllIIIIlllIlIIllIIll(this);
                }
            }
        }
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl() {
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
    }
}

