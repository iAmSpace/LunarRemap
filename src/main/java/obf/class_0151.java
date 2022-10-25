package obf;

import net.minecraft.client.Minecraft;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0151 {
    private int lllIIIllIIIIlllIlIIllIIll = 0;
    private int lllIlIIlIIIlIlIIIllIlllIl = 0;
    private int IlIllllllIIlIIllllIIlIIIl;
    private int lIlllIlllIIIIlIIlllIllIII;
    private class_0723 IlIIIIIllllllIIlllIllllll;
    private boolean lIllllIIlIIIlIllllllIIIll = false;

    public class_0151(int n, int n2) {
        this.lllIIIllIIIIlllIlIIllIIll = n;
        this.lllIlIIlIIIlIlIIIllIlllIl = n2;
        this.IlIIIIIllllllIIlllIllllll = Minecraft.getMinecraft().theWorld.IlIIIIIllllllIIlllIllllll(n, n2);
        this.lIllllIIlIIIlIllllllIIIll = this.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0785 class_07852, boolean bl) {
        if (this.lllIIIllIIIIlllIlIIllIIll() || bl && this.lllIlIIlIIIlIlIIIllIlllIl()) {
            class_07852.lllIIIllIIIIlllIlIIllIIll(this.IlIIIIIllllllIIlllIllllll);
            if (bl) {
                this.IlIIIIIllllllIIlllIllllll.lllIIlIIIllllllIIIIlIlIlI = false;
            }
        }
    }

    private boolean lllIIIllIIIIlllIlIIllIIll() {
        boolean bl = false;
        if (!this.lIllllIIlIIIlIllllllIIIll) {
            this.IlIIIIIllllllIIlllIllllll = Minecraft.getMinecraft().theWorld.IlIIIIIllllllIIlllIllllll(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl);
            if (this.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII) {
                this.lIllllIIlIIIlIllllllIIIll = true;
                bl = true;
            }
        } else if (this.lIllllIIlIIIlIllllllIIIll && !this.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII) {
            this.lIllllIIlIIIlIllllllIIIll = false;
            bl = true;
        }
        return bl;
    }

    private boolean lllIlIIlIIIlIlIIIllIlllIl() {
        boolean bl = false;
        if (this.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII && this.IlIIIIIllllllIIlllIllllll.lllIIlIIIllllllIIIIlIlIlI) {
            bl = true;
        }
        return bl;
    }
}

