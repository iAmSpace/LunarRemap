package obf;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1405
extends class_0442
implements class_2176 {
    public class_1405(class_1334 class_13342) {
        super(class_13342);
        this.IlIIIIIllllllIIlllIllllll(0.4f, 1.8f);
        this.IllIIIIllIIllIllIlllIlIIl().lllIIIllIIIIlllIlIIllIIll(true);
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(1, new class_1997(this, 1.25, 20, 10.0f));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(2, new class_0454(this, 1.0));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(3, new class_0235(this, class_0814.class, 6.0f));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(4, new class_0558(this));
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(1, new class_1524(this, class_0339.class, 0, true, false, class_1310.b_));
    }

    @Override
    public boolean IIIIlllIIlIllllllIllIIlll() {
        return true;
    }

    @Override
    protected void llIIlIllIllllIlIIIIlIIlll() {
        super.llIIlIllIllllIlIIIIlIIlll();
        this.lllIIIllIIIIlllIlIIllIIll(class_1152.lllIIIllIIIIlllIlIIllIIll).lllIIIllIIIIlllIlIIllIIll(4.0);
        this.lllIIIllIIIIlllIlIIllIIll(class_1152.lIlllIlllIIIIlIIlllIllIII).lllIIIllIIIIlllIlIIllIIll(0.2f);
    }

    @Override
    public void d_() {
        super.d_();
        int n = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll);
        int n2 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.llIIlIlIlllIIllIlIlllIllI);
        int n3 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IllIIIIllIIllIllIlllIlIIl);
        if (this.IllIIIlllllIlIlllIlllllII()) {
            this.lllIIIllIIIIlllIlIIllIIll(class_0058.IlIIIIIllllllIIlllIllllll, 1.0f);
        }
        if (this.lIlIllIIlIIlIIlIIlIIlIIll.a_(n, n3).lllIIIllIIIIlllIlIIllIIll(n, n2, n3) > 1.0f) {
            this.lllIIIllIIIIlllIlIIllIIll(class_0058.lllIlIIlIIIlIlIIIllIlllIl, 1.0f);
        }
        for (int i = 0; i < 4; ++i) {
            n = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll + (double)((float)(i % 2 * 2 - 1) * 0.25f));
            if (this.lIlIllIIlIIlIIlIIlIIlIIll.a_(n, n2 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.llIIlIlIlllIIllIlIlllIllI), n3 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IllIIIIllIIllIllIlllIlIIl + (double)((float)(i / 2 % 2 * 2 - 1) * 0.25f))).lIllllIIlIIIlIllllllIIIll() != class_1855.lllIIIllIIIIlllIlIIllIIll || !(this.lIlIllIIlIIlIIlIIlIIlIIll.a_(n, n3).lllIIIllIIIIlllIlIIllIIll(n, n2, n3) < 0.8f) || !Blocks.lIIllIIlIIIlllIlllIIlIIlI.IlIIIIIllllllIIlllIllllll(this.lIlIllIIlIIlIIlIIlIIlIIll, n, n2, n3)) continue;
            this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, Blocks.lIIllIIlIIIlllIlllIIlIIlI);
        }
    }

    @Override
    protected Item llIllllIIIIIlIIlIlllIIlll() {
        return Items.snowball;
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(boolean bl, int n) {
        int n2 = this.IlllIIlllllllIIllIlIllllI.nextInt(16);
        for (int i = 0; i < n2; ++i) {
            this.lllIIIllIIIIlllIlIIllIIll(Items.snowball, 1);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652, float f) {
        class_0333 class_03332 = new class_0333(this.lIlIllIIlIIlIIlIIlIIlIIll, this);
        double d = class_19652.IlIIlllllIIlIlIlllllIllll - this.IlIIlllllIIlIlIlllllIllll;
        double d2 = class_19652.llIIlIlIlllIIllIlIlllIllI + (double)class_19652.llIIllIllIlIIlIIllIllllll() - (double)1.1f - class_03332.llIIlIlIlllIIllIlIlllIllI;
        double d3 = class_19652.IllIIIIllIIllIllIlllIlIIl - this.IllIIIIllIIllIllIlllIlIIl;
        float f2 = MathHelper.lllIIIllIIIIlllIlIIllIIll(d * d + d3 * d3) * 0.2f;
        class_03332.a_(d, d2 + (double)f2, d3, 1.6f, 12.0f);
        this.lllIIIllIIIIlllIlIIllIIll("random.bow", 1.0f, 1.0f / (this.IlllIIIlIIlIIIIllllIllllI().nextFloat() * 0.4f + 0.8f));
        this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(class_03332);
    }
}

