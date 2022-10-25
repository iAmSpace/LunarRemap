package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

import java.util.ArrayList;
import java.util.List;

public class class_0919
extends class_1774 {
    private Block IllIIlllllllIIlIIlIIIIlIl;
    private int IIIllIllIIlIlIlIlIllllIIl;
    private int IllIIIllIIIIlIlIlIllIIlll;
    private boolean lIIIIlIlIIlllllIIllIIlIII;
    private boolean llIIlllIllIllllIIIlIIIIII;
    private float llIIllIllIlIIlIIllIllllll;
    private float lllIIlIIIllllllIIIIlIlIlI;
    private List IlIlllIIIIIIlIIllIIllIlll = new ArrayList();

    public class_0919() {
    }

    public class_0919(Block class_05492, int n, int n2, boolean bl, boolean bl2) {
        this.IllIIlllllllIIlIIlIIIIlIl = class_05492;
        this.IIIllIllIIlIlIlIlIllllIIl = n;
        this.IllIIIllIIIIlIlIlIllIIlll = n2;
        this.lIIIIlIlIIlllllIIllIIlIII = bl;
        this.llIIlllIllIllllIIIlIIIIII = bl2;
    }

    public Block lllIIIllIIIIlllIlIIllIIll() {
        return this.IllIIlllllllIIlIIlIIIIlIl;
    }

    @Override
    public int lIlllIlllIIIIlIIlllIllIII() {
        return this.IIIllIllIIlIlIlIlIllllIIl;
    }

    public boolean IlIIIIIllllllIIlllIllllll() {
        return this.lIIIIlIlIIlllllIIllIIlIII;
    }

    public int lllIIlIIIllllllIIIIlIlIlI() {
        return this.IllIIIllIIIIlIlIlIllIIlll;
    }

    public boolean IlIlllIIIIIIlIIllIIllIlll() {
        return this.llIIlllIllIllllIIIlIIIIII;
    }

    public float lllIIIllIIIIlllIlIIllIIll(float f) {
        if (f > 1.0f) {
            f = 1.0f;
        }
        return this.lllIIlIIIllllllIIIIlIlIlI + (this.llIIllIllIlIIlIIllIllllll - this.lllIIlIIIllllllIIIIlIlIlI) * f;
    }

    public float lllIlIIlIIIlIlIIIllIlllIl(float f) {
        return this.lIIIIlIlIIlllllIIllIIlIII ? (this.lllIIIllIIIIlllIlIIllIIll(f) - 1.0f) * (float)class_0573.lllIlIIlIIIlIlIIIllIlllIl[this.IllIIIllIIIIlIlIlIllIIlll] : (1.0f - this.lllIIIllIIIIlllIlIIllIIll(f)) * (float)class_0573.lllIlIIlIIIlIlIIIllIlllIl[this.IllIIIllIIIIlIlIlIllIIlll];
    }

    public float IlIllllllIIlIIllllIIlIIIl(float f) {
        return this.lIIIIlIlIIlllllIIllIIlIII ? (this.lllIIIllIIIIlllIlIIllIIll(f) - 1.0f) * (float)class_0573.IlIllllllIIlIIllllIIlIIIl[this.IllIIIllIIIIlIlIlIllIIlll] : (1.0f - this.lllIIIllIIIIlllIlIIllIIll(f)) * (float)class_0573.IlIllllllIIlIIllllIIlIIIl[this.IllIIIllIIIIlIlIlIllIIlll];
    }

    public float lIlllIlllIIIIlIIlllIllIII(float f) {
        return this.lIIIIlIlIIlllllIIllIIlIII ? (this.lllIIIllIIIIlllIlIIllIIll(f) - 1.0f) * (float)class_0573.lIlllIlllIIIIlIIlllIllIII[this.IllIIIllIIIIlIlIlIllIIlll] : (1.0f - this.lllIIIllIIIIlllIlIIllIIll(f)) * (float)class_0573.lIlllIlllIIIIlIIlllIllIII[this.IllIIIllIIIIlIlIlIllIIlll];
    }

    private void lllIIIllIIIIlllIlIIllIIll(float f, float f2) {
        List list;
        f = this.lIIIIlIlIIlllllIIllIIlIII ? 1.0f - f : (f -= 1.0f);
        class_1974 class_19742 = Blocks.lIlIIllllIlIIIIllIIIIlIIl.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, this.IllIIlllllllIIlIIlIIIIlIl, f, this.IllIIIllIIIIlIlIlIllIIlll);
        if (class_19742 != null && !(list = this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl((class_1521)null, class_19742)).isEmpty()) {
            this.IlIlllIIIIIIlIIllIIllIlll.addAll(list);
            for (class_1521 class_15212 : this.IlIlllIIIIIIlIIllIIllIlll) {
                class_15212.IlIIIIIllllllIIlllIllllll(f2 * (float)class_0573.lllIlIIlIIIlIlIIIllIlllIl[this.IllIIIllIIIIlIlIlIllIIlll], f2 * (float)class_0573.IlIllllllIIlIIllllIIlIIIl[this.IllIIIllIIIIlIlIlIllIIlll], f2 * (float)class_0573.lIlllIlllIIIIlIIlllIllIII[this.IllIIIllIIIIlIlIlIllIIlll]);
            }
            this.IlIlllIIIIIIlIIllIIllIlll.clear();
        }
    }

    public void IlIlIIlIlIllIIlIlIIllIIIl() {
        if (this.lllIIlIIIllllllIIIIlIlIlI < 1.0f && this.lllIIIllIIIIlllIlIIllIIll != null) {
            this.llIIllIllIlIIlIIllIllllll = 1.0f;
            this.lllIIlIIIllllllIIIIlIlIlI = 1.0f;
            this.lllIIIllIIIIlllIlIIllIIll.llIIllIllIlIIlIIllIllllll(this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII);
            this.IllIIIllIIIIlIlIlIllIIlll();
            if (this.lllIIIllIIIIlllIlIIllIIll.a_(this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII) == Blocks.lIlIIllllIlIIIIllIIIIlIIl) {
                this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, this.IllIIlllllllIIlIIlIIIIlIl, this.IIIllIllIIlIlIlIlIllllIIl, 3);
                this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII(this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, this.IllIIlllllllIIlIIlIIIIlIl);
            }
        }
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
        this.lllIIlIIIllllllIIIIlIlIlI = this.llIIllIllIlIIlIIllIllllll;
        if (this.lllIIlIIIllllllIIIIlIlIlI >= 1.0f) {
            this.lllIIIllIIIIlllIlIIllIIll(1.0f, 0.25f);
            this.lllIIIllIIIIlllIlIIllIIll.llIIllIllIlIIlIIllIllllll(this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII);
            this.IllIIIllIIIIlIlIlIllIIlll();
            if (this.lllIIIllIIIIlllIlIIllIIll.a_(this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII) == Blocks.lIlIIllllIlIIIIllIIIIlIIl) {
                this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, this.IllIIlllllllIIlIIlIIIIlIl, this.IIIllIllIIlIlIlIlIllllIIl, 3);
                this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII(this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, this.IllIIlllllllIIlIIlIIIIlIl);
            }
        } else {
            this.llIIllIllIlIIlIIllIllllll += 0.5f;
            if (this.llIIllIllIlIIlIIllIllllll >= 1.0f) {
                this.llIIllIllIlIIlIIllIllllll = 1.0f;
            }
            if (this.lIIIIlIlIIlllllIIllIIlIII) {
                this.lllIIIllIIIIlllIlIIllIIll(this.llIIllIllIlIIlIIllIllllll, this.llIIllIllIlIIlIIllIllllll - this.lllIIlIIIllllllIIIIlIlIlI + 0.0625f);
            }
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        super.lllIIIllIIIIlllIlIIllIIll(class_07752);
        this.IllIIlllllllIIlIIlIIIIlIl = Block.lllIIIllIIIIlllIlIIllIIll(class_07752.lIllllIIlIIIlIllllllIIIll("blockId"));
        this.IIIllIllIIlIlIlIlIllllIIl = class_07752.lIllllIIlIIIlIllllllIIIll("blockData");
        this.IllIIIllIIIIlIlIlIllIIlll = class_07752.lIllllIIlIIIlIllllllIIIll("facing");
        this.lllIIlIIIllllllIIIIlIlIlI = this.llIIllIllIlIIlIIllIllllll = class_07752.IllIIlllllllIIlIIlIIIIlIl("progress");
        this.lIIIIlIlIIlllllIIllIIlIII = class_07752.lllIIlIIIllllllIIIIlIlIlI("extending");
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        super.lllIlIIlIIIlIlIIIllIlllIl(class_07752);
        class_07752.lllIIIllIIIIlllIlIIllIIll("blockId", Block.lllIIIllIIIIlllIlIIllIIll(this.IllIIlllllllIIlIIlIIIIlIl));
        class_07752.lllIIIllIIIIlllIlIIllIIll("blockData", this.IIIllIllIIlIlIlIlIllllIIl);
        class_07752.lllIIIllIIIIlllIlIIllIIll("facing", this.IllIIIllIIIIlIlIlIllIIlll);
        class_07752.lllIIIllIIIIlllIlIIllIIll("progress", this.lllIIlIIIllllllIIIIlIlIlI);
        class_07752.lllIIIllIIIIlllIlIIllIIll("extending", this.lIIIIlIlIIlllllIIllIIlIII);
    }
}

