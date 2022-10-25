package obf;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1590
extends class_1327 {
    private final class_0673 lllIIIllIIIIlllIlIIllIIll;
    private final double lllIlIIlIIIlIlIIIllIlllIl;
    private int IlIllllllIIlIIllllIIlIIIl;
    private int lIlllIlllIIIIlIIlllIllIII;
    private int IlIIIIIllllllIIlllIllllll;
    private int lIllllIIlIIIlIllllllIIIll;
    private int IIIllIIlIIIIIIlIlIIllIIlI;
    private int IllIIlllllllIIlIIlIIIIlIl;

    public class_1590(class_0673 class_06732, double d) {
        this.lllIIIllIIIIlllIlIIllIIll = class_06732;
        this.lllIlIIlIIIlIlIIIllIlllIl = d;
        this.lllIIIllIIIIlllIlIIllIIll(5);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIIIllIIIIlllIlIIllIIll.lllIIIIlIIllIIIlIllIlllII() && !this.lllIIIllIIIIlllIlIIllIIll.IlIllIIIIllllIIllIllIIIIl() && this.lllIIIllIIIIlllIlIIllIIll.IlllIIIlIIlIIIIllllIllllI().nextDouble() <= (double)0.0065f && this.IllIIlllllllIIlIIlIIIIlIl();
    }

    @Override
    public boolean lllIlIIlIIIlIlIIIllIlllIl() {
        return this.IlIllllllIIlIIllllIIlIIIl <= this.IlIIIIIllllllIIlllIllllll && this.lIlllIlllIIIIlIIlllIllIII <= 60 && this.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll.lIlIllIIlIIlIIlIIlIIlIIll, this.lIllllIIlIIIlIllllllIIIll, this.IIIllIIlIIIIIIlIlIIllIIlI, this.IllIIlllllllIIlIIlIIIIlIl);
    }

    @Override
    public void IlIIIIIllllllIIlllIllllll() {
        this.lllIIIllIIIIlllIlIIllIIll.IllIIIIllIIllIllIlllIlIIl().lllIIIllIIIIlllIlIIllIIll((double)this.lIllllIIlIIIlIllllllIIIll + 0.5, this.IIIllIIlIIIIIIlIlIIllIIlI + 1, (double)this.IllIIlllllllIIlIIlIIIIlIl + 0.5, this.lllIlIIlIIIlIlIIIllIlllIl);
        this.IlIllllllIIlIIllllIIlIIIl = 0;
        this.lIlllIlllIIIIlIIlllIllIII = 0;
        this.IlIIIIIllllllIIlllIllllll = this.lllIIIllIIIIlllIlIIllIIll.IlllIIIlIIlIIIIllllIllllI().nextInt(this.lllIIIllIIIIlllIlIIllIIll.IlllIIIlIIlIIIIllllIllllI().nextInt(1200) + 1200) + 1200;
        this.lllIIIllIIIIlllIlIIllIIll.llllIllllllIllIIIlIlIIllI().lllIIIllIIIIlllIlIIllIIll(false);
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
        this.lllIIIllIIIIlllIlIIllIIll.lIIIIlIlIIlllllIIllIIlIII(false);
    }

    @Override
    public void lIlllIlllIIIIlIIlllIllIII() {
        ++this.IlIllllllIIlIIllllIIlIIIl;
        this.lllIIIllIIIIlllIlIIllIIll.llllIllllllIllIIIlIlIIllI().lllIIIllIIIIlllIlIIllIIll(false);
        if (this.lllIIIllIIIIlllIlIIllIIll.lIllllIIlIIIlIllllllIIIll(this.lIllllIIlIIIlIllllllIIIll, this.IIIllIIlIIIIIIlIlIIllIIlI + 1, this.IllIIlllllllIIlIIlIIIIlIl) > 1.0) {
            this.lllIIIllIIIIlllIlIIllIIll.lIIIIlIlIIlllllIIllIIlIII(false);
            this.lllIIIllIIIIlllIlIIllIIll.IllIIIIllIIllIllIlllIlIIl().lllIIIllIIIIlllIlIIllIIll((double)this.lIllllIIlIIIlIllllllIIIll + 0.5, this.IIIllIIlIIIIIIlIlIIllIIlI + 1, (double)this.IllIIlllllllIIlIIlIIIIlIl + 0.5, this.lllIlIIlIIIlIlIIIllIlllIl);
            ++this.lIlllIlllIIIIlIIlllIllIII;
        } else if (!this.lllIIIllIIIIlllIlIIllIIll.IlIllIIIIllllIIllIllIIIIl()) {
            this.lllIIIllIIIIlllIlIIllIIll.lIIIIlIlIIlllllIIllIIlIII(true);
        } else {
            --this.lIlllIlllIIIIlIIlllIllIII;
        }
    }

    private boolean IllIIlllllllIIlIIlIIIIlIl() {
        int n = (int)this.lllIIIllIIIIlllIlIIllIIll.llIIlIlIlllIIllIlIlllIllI;
        double d = 2.147483647E9;
        int n2 = (int)this.lllIIIllIIIIlllIlIIllIIll.IlIIlllllIIlIlIlllllIllll - 8;
        while ((double)n2 < this.lllIIIllIIIIlllIlIIllIIll.IlIIlllllIIlIlIlllllIllll + 8.0) {
            int n3 = (int)this.lllIIIllIIIIlllIlIIllIIll.IllIIIIllIIllIllIlllIlIIl - 8;
            while ((double)n3 < this.lllIIIllIIIIlllIlIIllIIll.IllIIIIllIIllIllIlllIlIIl + 8.0) {
                double d2;
                if (this.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll.lIlIllIIlIIlIIlIIlIIlIIll, n2, n, n3) && this.lllIIIllIIIIlllIlIIllIIll.lIlIllIIlIIlIIlIIlIIlIIll.lIlllIlllIIIIlIIlllIllIII(n2, n + 1, n3) && (d2 = this.lllIIIllIIIIlllIlIIllIIll.lIllllIIlIIIlIllllllIIIll(n2, n, n3)) < d) {
                    this.lIllllIIlIIIlIllllllIIIll = n2;
                    this.IIIllIIlIIIIIIlIlIIllIIlI = n;
                    this.IllIIlllllllIIlIIlIIIIlIl = n3;
                    d = d2;
                }
                ++n3;
            }
            ++n2;
        }
        return d < 2.147483647E9;
    }

    private boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3) {
        Block class_05492 = class_13342.a_(n, n2, n3);
        int n4 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        if (class_05492 == Blocks.IllIlIlIIIlllIIllIIIIlIll) {
            class_0071 class_00712 = (class_0071)class_13342.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3);
            if (class_00712.IlIlllIIIIIIlIIllIIllIlll < 1) {
                return true;
            }
        } else {
            if (class_05492 == Blocks.llllIlIIllIIlllllIIllIIll) {
                return true;
            }
            if (class_05492 == Blocks.IllIIIIllIIllIllIlllIlIIl && !class_0736.IllIIlllllllIIlIIlIIIIlIl(n4)) {
                return true;
            }
        }
        return false;
    }
}

