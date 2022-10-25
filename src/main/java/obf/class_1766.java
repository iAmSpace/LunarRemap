package obf;

import net.minecraft.util.MathHelper;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1766
extends class_0313 {
    private final int llllllIlIllllIlIlIlIIIIlI;

    protected class_1766(String string, class_1855 class_18552, int n) {
        super(string, class_18552);
        this.llllllIlIllllIlIlIlIIIIlI = n;
    }

    @Override
    protected int lIIIIlIlIIlllllIIllIIlIII(class_1334 class_13342, int n, int n2, int n3) {
        int n4 = Math.min(class_13342.lllIIIllIIIIlllIlIIllIIll(class_1521.class, this.lllIIIllIIIIlllIlIIllIIll(n, n2, n3)).size(), this.llllllIlIllllIlIlIlIIIIlI);
        if (n4 <= 0) {
            return 0;
        }
        float f = (float)Math.min(this.llllllIlIllllIlIlIlIIIIlI, n4) / (float)this.llllllIlIllllIlIlIlIIIIlI;
        return MathHelper.lIllllIIlIIIlIllllllIIIll(f * 15.0f);
    }

    @Override
    protected int IIIllIllIIlIlIlIlIllllIIl(int n) {
        return n;
    }

    @Override
    protected int IllIIIllIIIIlIlIlIllIIlll(int n) {
        return n;
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342) {
        return 10;
    }
}

