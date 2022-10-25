package obf;

import net.minecraft.client.Minecraft;

/*
 * Decompiled with CFR 0.150.
 */
public abstract class class_0079
extends class_0579 {
    public class_0079(Minecraft class_06672, int n, int n2, int n3, int n4, int n5) {
        super(class_06672, n, n2, n3, n4, n5);
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(int n, boolean bl, int n2, int n3) {
    }

    @Override
    protected boolean lllIIIllIIIIlllIlIIllIIll(int n) {
        return false;
    }

    @Override
    protected void IlIllllllIIlIIllllIIlIIIl() {
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4, class_0868 class_08682, int n5, int n6) {
        this.lllIlIIlIIIlIlIIIllIlllIl(n).lllIIIllIIIIlllIlIIllIIll(n, n2, n3, this.IlIIIIIllllllIIlllIllllll(), n4, class_08682, n5, n6, this.IlIllllllIIlIIllllIIlIIIl(n5, n6) == n);
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        int n4;
        if (this.lIlllIlllIIIIlIIlllIllIII(n2) && (n4 = this.IlIllllllIIlIIllllIIlIIIl(n, n2)) >= 0) {
            int n5 = this.IIIllIIlIIIIIIlIlIIllIIlI + this.IlIllllllIIlIIllllIIlIIIl / 2 - this.IlIIIIIllllllIIlllIllllll() / 2 + 2;
            int n6 = this.lIlllIlllIIIIlIIlllIllIII + 4 - this.IIIllIllIIlIlIlIlIllllIIl() + n4 * this.IllIIlllllllIIlIIlIIIIlIl + this.llIIlllIllIllllIIIlIIIIII;
            int n7 = n - n5;
            int n8 = n2 - n6;
            if (this.lllIlIIlIIIlIlIIIllIlllIl(n4).lllIIIllIIIIlllIlIIllIIll(n4, n, n2, n3, n7, n8)) {
                this.lllIlIIlIIIlIlIIIllIlllIl(false);
                return true;
            }
        }
        return false;
    }

    public boolean lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, int n3) {
        for (int i = 0; i < this.lllIIIllIIIIlllIlIIllIIll(); ++i) {
            int n4 = this.IIIllIIlIIIIIIlIlIIllIIlI + this.IlIllllllIIlIIllllIIlIIIl / 2 - this.IlIIIIIllllllIIlllIllllll() / 2 + 2;
            int n5 = this.lIlllIlllIIIIlIIlllIllIII + 4 - this.IIIllIllIIlIlIlIlIllllIIl() + i * this.IllIIlllllllIIlIIlIIIIlIl + this.llIIlllIllIllllIIIlIIIIII;
            int n6 = n - n4;
            int n7 = n2 - n5;
            this.lllIlIIlIIIlIlIIIllIlllIl(i).lllIlIIlIIIlIlIIIllIlllIl(i, n, n2, n3, n6, n7);
        }
        this.lllIlIIlIIIlIlIIIllIlllIl(true);
        return false;
    }

    public abstract class_0677 lllIlIIlIIIlIlIIIllIlllIl(int var1);
}

