package obf;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.MathHelper;

/*
 * Decompiled with CFR 0.150.
 */
public abstract class class_1407
extends class_1327 {
    protected class_0339 lllIIIllIIIIlllIlIIllIIll;
    protected int lllIlIIlIIIlIlIIIllIlllIl;
    protected int IlIllllllIIlIIllllIIlIIIl;
    protected int lIlllIlllIIIIlIIlllIllIII;
    protected class_2089 IlIIIIIllllllIIlllIllllll;
    boolean lIllllIIlIIIlIllllllIIIll;
    float IIIllIIlIIIIIIlIlIIllIIlI;
    float IllIIlllllllIIlIIlIIIIlIl;

    public class_1407(class_0339 class_03392) {
        this.lllIIIllIIIIlllIlIIllIIll = class_03392;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll() {
        if (!this.lllIIIllIIIIlllIlIIllIIll.lIlIIllllIlIIIIllIIIIlIIl) {
            return false;
        }
        class_1939 class_19392 = this.lllIIIllIIIIlllIlIIllIIll.IllIIIIllIIllIllIlllIlIIl();
        class_2086 class_20862 = class_19392.lIlllIlllIIIIlIIlllIllIII();
        if (class_20862 != null && !class_20862.lllIlIIlIIIlIlIIIllIlllIl() && class_19392.lllIlIIlIIIlIlIIIllIlllIl()) {
            for (int i = 0; i < Math.min(class_20862.IlIIIIIllllllIIlllIllllll() + 2, class_20862.lIlllIlllIIIIlIIlllIllIII()); ++i) {
                class_2120 class_21202 = class_20862.lllIIIllIIIIlllIlIIllIIll(i);
                this.lllIlIIlIIIlIlIIIllIlllIl = class_21202.lllIIIllIIIIlllIlIIllIIll;
                this.IlIllllllIIlIIllllIIlIIIl = class_21202.lllIlIIlIIIlIlIIIllIlllIl + 1;
                this.lIlllIlllIIIIlIIlllIllIII = class_21202.IlIllllllIIlIIllllIIlIIIl;
                if (!(this.lllIIIllIIIIlllIlIIllIIll.lIllllIIlIIIlIllllllIIIll(this.lllIlIIlIIIlIlIIIllIlllIl, this.lllIIIllIIIIlllIlIIllIIll.llIIlIlIlllIIllIlIlllIllI, this.lIlllIlllIIIIlIIlllIllIII) <= 2.25)) continue;
                this.IlIIIIIllllllIIlllIllllll = this.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII);
                if (this.IlIIIIIllllllIIlllIllllll == null) continue;
                return true;
            }
            this.lllIlIIlIIIlIlIIIllIlllIl = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.lllIIIllIIIIlllIlIIllIIll.IlIIlllllIIlIlIlllllIllll);
            this.IlIllllllIIlIIllllIIlIIIl = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.lllIIIllIIIIlllIlIIllIIll.llIIlIlIlllIIllIlIlllIllI + 1.0);
            this.lIlllIlllIIIIlIIlllIllIII = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.lllIIIllIIIIlllIlIIllIIll.IllIIIIllIIllIllIlllIlIIl);
            this.IlIIIIIllllllIIlllIllllll = this.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII);
            return this.IlIIIIIllllllIIlllIllllll != null;
        }
        return false;
    }

    @Override
    public boolean lllIlIIlIIIlIlIIIllIlllIl() {
        return !this.lIllllIIlIIIlIllllllIIIll;
    }

    @Override
    public void IlIIIIIllllllIIlllIllllll() {
        this.lIllllIIlIIIlIllllllIIIll = false;
        this.IIIllIIlIIIIIIlIlIIllIIlI = (float)((double)((float)this.lllIlIIlIIIlIlIIIllIlllIl + 0.5f) - this.lllIIIllIIIIlllIlIIllIIll.IlIIlllllIIlIlIlllllIllll);
        this.IllIIlllllllIIlIIlIIIIlIl = (float)((double)((float)this.lIlllIlllIIIIlIIlllIllIII + 0.5f) - this.lllIIIllIIIIlllIlIIllIIll.IllIIIIllIIllIllIlllIlIIl);
    }

    @Override
    public void lIlllIlllIIIIlIIlllIllIII() {
        float f = (float)((double)((float)this.lllIlIIlIIIlIlIIIllIlllIl + 0.5f) - this.lllIIIllIIIIlllIlIIllIIll.IlIIlllllIIlIlIlllllIllll);
        float f2 = (float)((double)((float)this.lIlllIlllIIIIlIIlllIllIII + 0.5f) - this.lllIIIllIIIIlllIlIIllIIll.IllIIIIllIIllIllIlllIlIIl);
        float f3 = this.IIIllIIlIIIIIIlIlIIllIIlI * f + this.IllIIlllllllIIlIIlIIIIlIl * f2;
        if (f3 < 0.0f) {
            this.lIllllIIlIIIlIllllllIIIll = true;
        }
    }

    private class_2089 lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        Block class_05492 = this.lllIIIllIIIIlllIlIIllIIll.lIlIllIIlIIlIIlIIlIIlIIll.a_(n, n2, n3);
        return class_05492 != Blocks.IlIIllIlIlIllIIIlIIlIlIIl ? null : (class_2089)class_05492;
    }
}

