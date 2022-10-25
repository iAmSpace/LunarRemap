package obf;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.MathHelper;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1799
extends class_1327 {
    private class_0339 lllIlIIlIIIlIlIIIllIlllIl;
    private class_1334 IlIllllllIIlIIllllIIlIIIl;
    int lllIIIllIIIIlllIlIIllIIll;

    public class_1799(class_0339 class_03392) {
        this.lllIlIIlIIIlIlIIIllIlllIl = class_03392;
        this.IlIllllllIIlIIllllIIlIIIl = class_03392.lIlIllIIlIIlIIlIIlIIlIIll;
        this.lllIIIllIIIIlllIlIIllIIll(7);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll() {
        int n;
        int n2;
        if (this.lllIlIIlIIIlIlIIIllIlllIl.IlllIIIlIIlIIIIllllIllllI().nextInt(this.lllIlIIlIIIlIlIIIllIlllIl.g_() ? 50 : 1000) != 0) {
            return false;
        }
        int n3 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.lllIlIIlIIIlIlIIIllIlllIl.IlIIlllllIIlIlIlllllIllll);
        return this.IlIllllllIIlIIllllIIlIIIl.a_(n3, n2 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.lllIlIIlIIIlIlIIIllIlllIl.llIIlIlIlllIIllIlIlllIllI), n = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.lllIlIIlIIIlIlIIIllIlllIl.IllIIIIllIIllIllIlllIlIIl)) == Blocks.IlIlIIlllIllllllllIIIlIlI && this.IlIllllllIIlIIllllIIlIIIl.IlIllllllIIlIIllllIIlIIIl(n3, n2, n) == 1 ? true : this.IlIllllllIIlIIllllIIlIIIl.a_(n3, n2 - 1, n) == Blocks.IlIllllllIIlIIllllIIlIIIl;
    }

    @Override
    public void IlIIIIIllllllIIlllIllllll() {
        this.lllIIIllIIIIlllIlIIllIIll = 40;
        this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll((class_1521)this.lllIlIIlIIIlIlIIIllIlllIl, (byte)10);
        this.lllIlIIlIIIlIlIIIllIlllIl.IllIIIIllIIllIllIlllIlIIl().IIIllIIlIIIIIIlIlIIllIIlI();
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
        this.lllIIIllIIIIlllIlIIllIIll = 0;
    }

    @Override
    public boolean lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lllIIIllIIIIlllIlIIllIIll > 0;
    }

    public int IllIIlllllllIIlIIlIIIIlIl() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    @Override
    public void lIlllIlllIIIIlIIlllIllIII() {
        this.lllIIIllIIIIlllIlIIllIIll = Math.max(0, this.lllIIIllIIIIlllIlIIllIIll - 1);
        if (this.lllIIIllIIIIlllIlIIllIIll == 4) {
            int n;
            int n2;
            int n3 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.lllIlIIlIIIlIlIIIllIlllIl.IlIIlllllIIlIlIlllllIllll);
            if (this.IlIllllllIIlIIllllIIlIIIl.a_(n3, n2 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.lllIlIIlIIIlIlIIIllIlllIl.llIIlIlIlllIIllIlIlllIllI), n = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.lllIlIIlIIIlIlIIIllIlllIl.IllIIIIllIIllIllIlllIlIIl)) == Blocks.IlIlIIlllIllllllllIIIlIlI) {
                if (this.IlIllllllIIlIIllllIIlIIIl.IlIIlllllIIlIlIlllllIllll().lllIlIIlIIIlIlIIIllIlllIl("mobGriefing")) {
                    this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(n3, n2, n, false);
                }
                this.lllIlIIlIIIlIlIIIllIlllIl.IlIlIIlllIllllllllIIIlIlI();
            } else if (this.IlIllllllIIlIIllllIIlIIIl.a_(n3, n2 - 1, n) == Blocks.IlIllllllIIlIIllllIIlIIIl) {
                if (this.IlIllllllIIlIIllllIIlIIIl.IlIIlllllIIlIlIlllllIllll().lllIlIIlIIIlIlIIIllIlllIl("mobGriefing")) {
                    this.IlIllllllIIlIIllllIIlIIIl.IlIllllllIIlIIllllIIlIIIl(2001, n3, n2 - 1, n, Block.lllIIIllIIIIlllIlIIllIIll(Blocks.IlIllllllIIlIIllllIIlIIIl));
                    this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(n3, n2 - 1, n, Blocks.lIlllIlllIIIIlIIlllIllIII, 0, 2);
                }
                this.lllIlIIlIIIlIlIIIllIlllIl.IlIlIIlllIllllllllIIIlIlI();
            }
        }
    }
}

