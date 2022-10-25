package obf;

import net.minecraft.block.Block;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0811
extends class_1407 {
    private int IIIllIllIIlIlIlIlIllllIIl;
    private int IllIIIllIIIIlIlIlIllIIlll = -1;

    public class_0811(class_0339 class_03392) {
        super(class_03392);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll() {
        return !super.lllIIIllIIIIlllIlIIllIIll() ? false : (!this.lllIIIllIIIIlllIlIIllIIll.lIlIllIIlIIlIIlIIlIIlIIll.IlIIlllllIIlIlIlllllIllll().lllIlIIlIIIlIlIIIllIlllIl("mobGriefing") ? false : !this.IlIIIIIllllllIIlllIllllll.lIllllIIlIIIlIllllllIIIll((class_1843)this.lllIIIllIIIIlllIlIIllIIll.lIlIllIIlIIlIIlIIlIIlIIll, this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII));
    }

    @Override
    public void IlIIIIIllllllIIlllIllllll() {
        super.IlIIIIIllllllIIlllIllllll();
        this.IIIllIllIIlIlIlIlIllllIIl = 0;
    }

    @Override
    public boolean lllIlIIlIIIlIlIIIllIlllIl() {
        double d = this.lllIIIllIIIIlllIlIIllIIll.lIllllIIlIIIlIllllllIIIll(this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII);
        return this.IIIllIllIIlIlIlIlIllllIIl <= 240 && !this.IlIIIIIllllllIIlllIllllll.lIllllIIlIIIlIllllllIIIll((class_1843)this.lllIIIllIIIIlllIlIIllIIll.lIlIllIIlIIlIIlIIlIIlIIll, this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII) && d < 4.0;
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
        super.IlIllllllIIlIIllllIIlIIIl();
        this.lllIIIllIIIIlllIlIIllIIll.lIlIllIIlIIlIIlIIlIIlIIll.lIlllIlllIIIIlIIlllIllIII(this.lllIIIllIIIIlllIlIIllIIll.llllllIlIllllIlIlIlIIIIlI(), this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, -1);
    }

    @Override
    public void lIlllIlllIIIIlIIlllIllIII() {
        super.lIlllIlllIIIIlIIlllIllIII();
        if (this.lllIIIllIIIIlllIlIIllIIll.IlllIIIlIIlIIIIllllIllllI().nextInt(20) == 0) {
            this.lllIIIllIIIIlllIlIIllIIll.lIlIllIIlIIlIIlIIlIIlIIll.IlIllllllIIlIIllllIIlIIIl(1010, this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, 0);
        }
        ++this.IIIllIllIIlIlIlIlIllllIIl;
        int n = (int)((float)this.IIIllIllIIlIlIlIlIllllIIl / 240.0f * 10.0f);
        if (n != this.IllIIIllIIIIlIlIlIllIIlll) {
            this.lllIIIllIIIIlllIlIIllIIll.lIlIllIIlIIlIIlIIlIIlIIll.lIlllIlllIIIIlIIlllIllIII(this.lllIIIllIIIIlllIlIIllIIll.llllllIlIllllIlIlIlIIIIlI(), this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, n);
            this.IllIIIllIIIIlIlIlIllIIlll = n;
        }
        if (this.IIIllIllIIlIlIlIlIllllIIl == 240 && this.lllIIIllIIIIlllIlIIllIIll.lIlIllIIlIIlIIlIIlIIlIIll.IlIlIIlIlIllIIlIlIIllIIIl == class_1999.lIlllIlllIIIIlIIlllIllIII) {
            this.lllIIIllIIIIlllIlIIllIIll.lIlIllIIlIIlIIlIIlIIlIIll.lIllllIIlIIIlIllllllIIIll(this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII);
            this.lllIIIllIIIIlllIlIIllIIll.lIlIllIIlIIlIIlIIlIIlIIll.IlIllllllIIlIIllllIIlIIIl(1012, this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, 0);
            this.lllIIIllIIIIlllIlIIllIIll.lIlIllIIlIIlIIlIIlIIlIIll.IlIllllllIIlIIllllIIlIIIl(2001, this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, Block.lllIIIllIIIIlllIlIIllIIll(this.IlIIIIIllllllIIlllIllllll));
        }
    }
}

