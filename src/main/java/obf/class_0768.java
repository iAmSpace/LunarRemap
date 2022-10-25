package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.util.IChatComponent;

import java.util.List;

public class class_0768
extends class_0229 {
    private String lllIIIllIIIIlllIlIIllIIll;
    private IChatComponent lllIlIIlIIIlIlIIIllIlllIl;
    private List IlIllllllIIlIIllllIIlIIIl;
    private final class_0229 lIlllIlllIIIIlIIlllIllIII;

    public class_0768(class_0229 class_02292, String string, IChatComponent class_22552) {
        this.lIlllIlllIIIIlIIlllIllIII = class_02292;
        this.lllIIIllIIIIlllIlIIllIIll = class_0616.lllIIIllIIIIlllIlIIllIIll(string, new Object[0]);
        this.lllIlIIlIIIlIlIIIllIlllIl = class_22552;
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(char c, int n) {
    }

    @Override
    public void n_() {
        this.lIlIlIIlIIIIlIIIIIlllIIII.clear();
        int n = this.lIIlIIIIIlIlllIlIIlIlIlll / 2 - 30 + (this.IlIllllllIIlIIllllIIlIIIl != null ? (this.IlIllllllIIlIIllllIIlIIIl.size() + 1) * this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll : 40);
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1197(0, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 100, n + 12, class_0616.lllIIIllIIIIlllIlIIllIIll("gui.toMenu", new Object[0])));
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1197(1, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 100, n + 36, "Reconnect"));
        this.IlIllllllIIlIIllllIIlIIIl = this.lIlIllIIlIIlIIlIIlIIlIIll.IlIllllllIIlIIllllIIlIIIl(this.lllIlIIlIIIlIlIIIllIlllIl.lIlllIlllIIIIlIIlllIllIII(), this.IlIlIIlllIIlIllIIIlllllIl - 50);
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1197 class_11972) {
        if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 0) {
            if (this.lIlllIlllIIIIlIIlllIllIII instanceof class_0768) {
                this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(new class_1381(new class_2097()));
            } else {
                this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII);
            }
        }
        if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 1) {
            if (this.lllllIlllIIllIlIIlIIIllII.lIlllIlllIIIIlIIlllIllIII != null) {
                this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(new class_0019(this, this.lllllIlllIIllIlIIlIIIllII, this.lllllIlllIIllIlIIlIIIllII.lIlllIlllIIIIlIIlllIllIII));
            } else if (this.lllllIlllIIllIlIIlIIIllII.IlIllllllIIlIIllllIIlIIIl != null) {
                this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(new class_0019(this, this.lllllIlllIIllIlIIlIIIllII, this.lllllIlllIIllIlIIlIIIllII.IlIllllllIIlIIllllIIlIIIl));
            }
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
        this.llIIlIllIllllIlIIIIlIIlll();
        this.lllIIIllIIIIlllIlIIllIIll(this.lIlIllIIlIIlIIlIIlIIlIIll, this.lllIIIllIIIIlllIlIIllIIll, this.IlIlIIlllIIlIllIIIlllllIl / 2, this.lIIlIIIIIlIlllIlIIlIlIlll / 2 - 50, 0xAAAAAA);
        int n3 = this.lIIlIIIIIlIlllIlIIlIlIlll / 2 - 30;
        if (this.IlIllllllIIlIIllllIIlIIIl != null) {
            for (String string : this.IlIllllllIIlIIllllIIlIIIl) {
                this.lllIIIllIIIIlllIlIIllIIll(this.lIlIllIIlIIlIIlIIlIIlIIll, string, this.IlIlIIlllIIlIllIIIlllllIl / 2, n3, 0xFFFFFF);
                n3 += this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll;
            }
        }
        super.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
    }
}

