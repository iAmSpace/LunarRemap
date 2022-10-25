package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.init.Blocks;

import java.util.Random;

public class class_0964 {
    protected class_1334 lllIIIllIIIIlllIlIIllIIll;
    protected Random lllIlIIlIIIlIlIIIllIlllIl;
    protected int IlIllllllIIlIIllllIIlIIIl;
    protected int lIlllIlllIIIIlIIlllIllIII;
    protected class_1067 IlIIIIIllllllIIlllIllllll = new class_0943(4);
    protected class_1067 lIllllIIlIIIlIllllllIIIll = new class_1576(Blocks.llIIllIllIlIIlIIllIllllll, 7);
    protected class_1067 IIIllIIlIIIIIIlIlIIllIIlI = new class_1576(Blocks.lllIIlIIIllllllIIIIlIlIlI, 6);
    protected class_1067 IllIIlllllllIIlIIlIIIIlIl = new class_1580(Blocks.lIlllIlllIIIIlIIlllIllIII, 32);
    protected class_1067 IIIllIllIIlIlIlIlIllllIIl = new class_1580(Blocks.lllIIlIIIllllllIIIIlIlIlI, 32);
    protected class_1067 IllIIIllIIIIlIlIlIllIIlll = new class_1580(Blocks.lllllIlllIIllIlIIlIIIllII, 16);
    protected class_1067 lIIIIlIlIIlllllIIllIIlIII = new class_1580(Blocks.IlIlIIlIlIllIIlIlIIllIIIl, 8);
    protected class_1067 llIIlllIllIllllIIIlIIIIII = new class_1580(Blocks.IlIlllIIIIIIlIIllIIllIlll, 8);
    protected class_1067 llIIllIllIlIIlIIllIllllll = new class_1580(Blocks.lIIIlIIllIllIIlIIlIIIllII, 7);
    protected class_1067 lllIIlIIIllllllIIIIlIlIlI = new class_1580(Blocks.diamond_ore, 7);
    protected class_1067 IlIlllIIIIIIlIIllIIllIlll = new class_1580(Blocks.llIIlIllIllllIlIIIIlIIlll, 6);
    protected class_1362 IlIlIIlIlIllIIlIlIIllIIIl = new class_1362(Blocks.llIlllIIllIlllIlIlIlIIIll);
    protected class_1067 lllllIlllIIllIlIIlIIIllII = new class_1362(Blocks.lllIIIIIIlIlllIIlIlIIIllI);
    protected class_1067 IlIlIIlllIIlIllIIIlllllIl = new class_1362(Blocks.llIIlIIllIIllIlIIllIIllII);
    protected class_1067 lIIlIIIIIlIlllIlIIlIlIlll = new class_0049();
    protected class_1067 lIlIlIIlIIIIlIIIIIlllIIII = new class_1828();
    protected class_1067 IlIIIlIIIIllIIIllIIIIIIll = new class_1857();
    protected class_1067 IIlllIlIlllIllIIIlllIIlIl = new class_0992();
    protected int lIlIllIIlIIlIIlIIlIIlIIll;
    protected int llIIlIllIllllIlIIIIlIIlll;
    protected int llIllllIlIllIIIlIllIIlIlI = 2;
    protected int lIlllIlllIlIIIIlllIlIlIIl = 1;
    protected int IlIIlllllIIlIlIlllllIllll;
    protected int llIIlIlIlllIIllIlIlllIllI;
    protected int IllIIIIllIIllIllIlllIlIIl;
    protected int IIIIIIIIlIllIIllIIlllIllI;
    protected int IIlIIlIlIlIllIIlIlIIIIlll = 1;
    protected int llIIIlllIlllIlIllIIIIllIl = 3;
    protected int IIIIlIllIlIIlIIlIllIlIlll = 1;
    protected int IlIlIIlllIllllllllIIIlIlI;
    public boolean llllIIIIlIIIlIIIIIIlIllll = true;

    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, Random random, class_0672 class_06722, int n, int n2) {
        if (this.lllIIIllIIIIlllIlIIllIIll != null) {
            throw new RuntimeException("Already decorating!!");
        }
        this.lllIIIllIIIIlllIlIIllIIll = class_13342;
        this.lllIlIIlIIIlIlIIIllIlllIl = random;
        this.IlIllllllIIlIIllllIIlIIIl = n;
        this.lIlllIlllIIIIlIIlllIllIII = n2;
        this.lllIIIllIIIIlllIlIIllIIll(class_06722);
        this.lllIIIllIIIIlllIlIIllIIll = null;
        this.lllIlIIlIIIlIlIIIllIlllIl = null;
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_0672 class_06722) {
        Object object;
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        this.lllIIIllIIIIlllIlIIllIIll();
        for (n5 = 0; n5 < this.llIIIlllIlllIlIllIIIIllIl; ++n5) {
            n4 = this.IlIllllllIIlIIllllIIlIIIl + this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(16) + 8;
            n3 = this.lIlllIlllIIIIlIIlllIllIII + this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(16) + 8;
            this.lIllllIIlIIIlIllllllIIIll.a_(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl, n4, this.lllIIIllIIIIlllIlIIllIIll.IIIllIllIIlIlIlIlIllllIIl(n4, n3), n3);
        }
        for (n5 = 0; n5 < this.IIIIlIllIlIIlIIlIllIlIlll; ++n5) {
            n4 = this.IlIllllllIIlIIllllIIlIIIl + this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(16) + 8;
            n3 = this.lIlllIlllIIIIlIIlllIllIII + this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(16) + 8;
            this.IlIIIIIllllllIIlllIllllll.a_(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl, n4, this.lllIIIllIIIIlllIlIIllIIll.IIIllIllIIlIlIlIlIllllIIl(n4, n3), n3);
        }
        for (n5 = 0; n5 < this.IIlIIlIlIlIllIIlIlIIIIlll; ++n5) {
            n4 = this.IlIllllllIIlIIllllIIlIIIl + this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(16) + 8;
            n3 = this.lIlllIlllIIIIlIIlllIllIII + this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(16) + 8;
            this.IIIllIIlIIIIIIlIlIIllIIlI.a_(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl, n4, this.lllIIIllIIIIlllIlIIllIIll.IIIllIllIIlIlIlIlIllllIIl(n4, n3), n3);
        }
        n5 = this.llIIlIllIllllIlIIIIlIIlll;
        if (this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(10) == 0) {
            ++n5;
        }
        for (n4 = 0; n4 < n5; ++n4) {
            n3 = this.IlIllllllIIlIIllllIIlIIIl + this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(16) + 8;
            n2 = this.lIlllIlllIIIIlIIlllIllIII + this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(16) + 8;
            n = this.lllIIIllIIIIlllIlIIllIIll.lIllllIIlIIIlIllllllIIIll(n3, n2);
            object = class_06722.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl);
            ((class_1067)object).lllIIIllIIIIlllIlIIllIIll(1.0, 1.0, 1.0);
            if (!((class_1067)object).a_(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl, n3, n, n2)) continue;
            ((class_1174)object).lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl, n3, n, n2);
        }
        for (n4 = 0; n4 < this.IlIlIIlllIllllllllIIIlIlI; ++n4) {
            n3 = this.IlIllllllIIlIIllllIIlIIIl + this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(16) + 8;
            n2 = this.lIlllIlllIIIIlIIlllIllIII + this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(16) + 8;
            this.lIIlIIIIIlIlllIlIIlIlIlll.a_(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl, n3, this.lllIIIllIIIIlllIlIIllIIll.lIllllIIlIIIlIllllllIIIll(n3, n2), n2);
        }
        for (n4 = 0; n4 < this.llIllllIlIllIIIlIllIIlIlI; ++n4) {
            n3 = this.IlIllllllIIlIIllllIIlIIIl + this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(16) + 8;
            object = class_06722.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl, n3, n = this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(this.lllIIIllIIIIlllIlIIllIIll.lIllllIIlIIIlIllllllIIIll(n3, n2 = this.lIlllIlllIIIIlIIlllIllIII + this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(16) + 8) + 32), n2);
            class_1209 class_12092 = class_1209.lIlllIlllIIIIlIIlllIllIII((String)object);
            if (class_12092.lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll) continue;
            this.IlIlIIlIlIllIIlIlIIllIIIl.lllIIIllIIIIlllIlIIllIIll(class_12092, class_1209.IlIIIIIllllllIIlllIllllll((String)object));
            this.IlIlIIlIlIllIIlIlIIllIIIl.a_(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl, n3, n, n2);
        }
        for (n4 = 0; n4 < this.lIlllIlllIlIIIIlllIlIlIIl; ++n4) {
            n3 = this.IlIllllllIIlIIllllIIlIIIl + this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(16) + 8;
            n2 = this.lIlllIlllIIIIlIIlllIllIII + this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(16) + 8;
            n = this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(this.lllIIIllIIIIlllIlIIllIIll.lIllllIIlIIIlIllllllIIIll(n3, n2) * 2);
            object = class_06722.lllIlIIlIIIlIlIIIllIlllIl(this.lllIlIIlIIIlIlIIIllIlllIl);
            ((class_1067)object).a_(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl, n3, n, n2);
        }
        for (n4 = 0; n4 < this.IlIIlllllIIlIlIlllllIllll; ++n4) {
            n3 = this.IlIllllllIIlIIllllIIlIIIl + this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(16) + 8;
            n2 = this.lIlllIlllIIIIlIIlllIllIII + this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(16) + 8;
            n = this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(this.lllIIIllIIIIlllIlIIllIIll.lIllllIIlIIIlIllllllIIIll(n3, n2) * 2);
            new class_1575(Blocks.llllIIIIlIIIlIIIIIIlIllll).a_(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl, n3, n, n2);
        }
        for (n4 = 0; n4 < this.lIlIllIIlIIlIIlIIlIIlIIll; ++n4) {
            n3 = this.IlIllllllIIlIIllllIIlIIIl + this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(16) + 8;
            n2 = this.lIlllIlllIIIIlIIlllIllIII + this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(16) + 8;
            for (n = this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(this.lllIIIllIIIIlllIlIIllIIll.lIllllIIlIIIlIllllllIIIll(n3, n2) * 2); n > 0 && this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII(n3, n - 1, n2); --n) {
            }
            this.IIlllIlIlllIllIIIlllIIlIl.a_(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl, n3, n, n2);
        }
        for (n4 = 0; n4 < this.llIIlIlIlllIIllIlIlllIllI; ++n4) {
            if (this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(4) == 0) {
                n3 = this.IlIllllllIIlIIllllIIlIIIl + this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(16) + 8;
                n2 = this.lIlllIlllIIIIlIIlllIllIII + this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(16) + 8;
                n = this.lllIIIllIIIIlllIlIIllIIll.lIllllIIlIIIlIllllllIIIll(n3, n2);
                this.lllllIlllIIllIlIIlIIIllII.a_(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl, n3, n, n2);
            }
            if (this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(8) != 0) continue;
            n3 = this.IlIllllllIIlIIllllIIlIIIl + this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(16) + 8;
            n2 = this.lIlllIlllIIIIlIIlllIllIII + this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(16) + 8;
            n = this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(this.lllIIIllIIIIlllIlIIllIIll.lIllllIIlIIIlIllllllIIIll(n3, n2) * 2);
            this.IlIlIIlllIIlIllIIIlllllIl.a_(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl, n3, n, n2);
        }
        if (this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(4) == 0) {
            n4 = this.IlIllllllIIlIIllllIIlIIIl + this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(16) + 8;
            n3 = this.lIlllIlllIIIIlIIlllIllIII + this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(16) + 8;
            n2 = this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(this.lllIIIllIIIIlllIlIIllIIll.lIllllIIlIIIlIllllllIIIll(n4, n3) * 2);
            this.lllllIlllIIllIlIIlIIIllII.a_(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl, n4, n2, n3);
        }
        if (this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(8) == 0) {
            n4 = this.IlIllllllIIlIIllllIIlIIIl + this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(16) + 8;
            n3 = this.lIlllIlllIIIIlIIlllIllIII + this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(16) + 8;
            n2 = this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(this.lllIIIllIIIIlllIlIIllIIll.lIllllIIlIIIlIllllllIIIll(n4, n3) * 2);
            this.IlIlIIlllIIlIllIIIlllllIl.a_(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl, n4, n2, n3);
        }
        for (n4 = 0; n4 < this.IllIIIIllIIllIllIlllIlIIl; ++n4) {
            n3 = this.IlIllllllIIlIIllllIIlIIIl + this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(16) + 8;
            n2 = this.lIlllIlllIIIIlIIlllIllIII + this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(16) + 8;
            n = this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(this.lllIIIllIIIIlllIlIIllIIll.lIllllIIlIIIlIllllllIIIll(n3, n2) * 2);
            this.lIlIlIIlIIIIlIIIIIlllIIII.a_(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl, n3, n, n2);
        }
        for (n4 = 0; n4 < 10; ++n4) {
            n3 = this.IlIllllllIIlIIllllIIlIIIl + this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(16) + 8;
            n2 = this.lIlllIlllIIIIlIIlllIllIII + this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(16) + 8;
            n = this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(this.lllIIIllIIIIlllIlIIllIIll.lIllllIIlIIIlIllllllIIIll(n3, n2) * 2);
            this.lIlIlIIlIIIIlIIIIIlllIIII.a_(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl, n3, n, n2);
        }
        if (this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(32) == 0) {
            n4 = this.IlIllllllIIlIIllllIIlIIIl + this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(16) + 8;
            n3 = this.lIlllIlllIIIIlIIlllIllIII + this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(16) + 8;
            n2 = this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(this.lllIIIllIIIIlllIlIIllIIll.lIllllIIlIIIlIllllllIIIll(n4, n3) * 2);
            new class_1896().a_(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl, n4, n2, n3);
        }
        for (n4 = 0; n4 < this.IIIIIIIIlIllIIllIIlllIllI; ++n4) {
            n3 = this.IlIllllllIIlIIllllIIlIIIl + this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(16) + 8;
            n2 = this.lIlllIlllIIIIlIIlllIllIII + this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(16) + 8;
            n = this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(this.lllIIIllIIIIlllIlIIllIIll.lIllllIIlIIIlIllllllIIIll(n3, n2) * 2);
            this.IlIIIlIIIIllIIIllIIIIIIll.a_(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl, n3, n, n2);
        }
        if (this.llllIIIIlIIIlIIIIIIlIllll) {
            for (n4 = 0; n4 < 50; ++n4) {
                n3 = this.IlIllllllIIlIIllllIIlIIIl + this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(16) + 8;
                n2 = this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(248) + 8);
                n = this.lIlllIlllIIIIlIIlllIllIII + this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(16) + 8;
                new class_0109(Blocks.IIIllIllIIlIlIlIlIllllIIl).a_(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl, n3, n2, n);
            }
            for (n4 = 0; n4 < 20; ++n4) {
                n3 = this.IlIllllllIIlIIllllIIlIIIl + this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(16) + 8;
                n2 = this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(240) + 8) + 8);
                n = this.lIlllIlllIIIIlIIlllIllIII + this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(16) + 8;
                new class_0109(Blocks.lIIIIlIlIIlllllIIllIIlIII).a_(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl, n3, n2, n);
            }
        }
    }

    protected void lllIIIllIIIIlllIlIIllIIll(int n, class_1067 class_10672, int n2, int n3) {
        for (int i = 0; i < n; ++i) {
            int n4 = this.IlIllllllIIlIIllllIIlIIIl + this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(16);
            int n5 = this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(n3 - n2) + n2;
            int n6 = this.lIlllIlllIIIIlIIlllIllIII + this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(16);
            class_10672.a_(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl, n4, n5, n6);
        }
    }

    protected void lllIlIIlIIIlIlIIIllIlllIl(int n, class_1067 class_10672, int n2, int n3) {
        for (int i = 0; i < n; ++i) {
            int n4 = this.IlIllllllIIlIIllllIIlIIIl + this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(16);
            int n5 = this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(n3) + this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(n3) + (n2 - n3);
            int n6 = this.lIlllIlllIIIIlIIlllIllIII + this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(16);
            class_10672.a_(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl, n4, n5, n6);
        }
    }

    protected void lllIIIllIIIIlllIlIIllIIll() {
        this.lllIIIllIIIIlllIlIIllIIll(20, this.IllIIlllllllIIlIIlIIIIlIl, 0, 256);
        this.lllIIIllIIIIlllIlIIllIIll(10, this.IIIllIllIIlIlIlIlIllllIIl, 0, 256);
        this.lllIIIllIIIIlllIlIIllIIll(20, this.IllIIIllIIIIlIlIlIllIIlll, 0, 128);
        this.lllIIIllIIIIlllIlIIllIIll(20, this.lIIIIlIlIIlllllIIllIIlIII, 0, 64);
        this.lllIIIllIIIIlllIlIIllIIll(2, this.llIIlllIllIllllIIIlIIIIII, 0, 32);
        this.lllIIIllIIIIlllIlIIllIIll(8, this.llIIllIllIlIIlIIllIllllll, 0, 16);
        this.lllIIIllIIIIlllIlIIllIIll(1, this.lllIIlIIIllllllIIIIlIlIlI, 0, 16);
        this.lllIlIIlIIIlIlIIIllIlllIl(1, this.IlIlllIIIIIIlIIllIIllIlll, 16, 16);
    }
}

