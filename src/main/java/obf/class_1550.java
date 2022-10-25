package obf;

import net.minecraft.util.IChatComponent;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1550 {
    private final int lllIIIllIIIIlllIlIIllIIll;
    private final IChatComponent lllIlIIlIIIlIlIIIllIlllIl;
    private final int IlIllllllIIlIIllllIIlIIIl;
    private boolean lIlllIlllIIIIlIIlllIllIII;

    public class_1550(int n, IChatComponent class_22552, int n2) {
        this.lllIlIIlIIIlIlIIIllIlllIl = class_22552;
        this.lllIIIllIIIIlllIlIIllIIll = n;
        this.IlIllllllIIlIIllllIIlIIIl = n2;
        if (class_22552 instanceof class_0722 && ((class_0722)class_22552).IllIIlllllllIIlIIlIIIIlIl()) {
            this.lIlllIlllIIIIlIIlllIllIII = true;
        }
    }

    public IChatComponent lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public int lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public int IlIllllllIIlIIllllIIlIIIl() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public boolean lIlllIlllIIIIlIIlllIllIII() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    public void lllIIIllIIIIlllIlIIllIIll(boolean bl) {
        this.lIlllIlllIIIIlIIlllIllIII = bl;
    }
}

