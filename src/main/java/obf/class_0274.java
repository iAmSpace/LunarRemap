package obf;

import net.minecraft.util.MathHelper;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0274
extends class_1931 {
    public class_0274() {
        this(0.0f, false);
    }

    protected class_0274(float f, float f2, int n, int n2) {
        super(f, f2, n, n2);
    }

    public class_0274(float f, boolean bl) {
        super(f, 0.0f, 64, bl ? 32 : 64);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(float f, float f2, float f3, float f4, float f5, float f6, class_1521 class_15212) {
        super.lllIIIllIIIIlllIlIIllIIll(f, f2, f3, f4, f5, f6, class_15212);
        float f7 = MathHelper.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll * (float)Math.PI);
        float f8 = MathHelper.lllIIIllIIIIlllIlIIllIIll((1.0f - (1.0f - this.lllIIIllIIIIlllIlIIllIIll) * (1.0f - this.lllIIIllIIIIlllIlIIllIIll)) * (float)Math.PI);
        this.IllIIIllIIIIlIlIlIllIIlll.IllIIlllllllIIlIIlIIIIlIl = 0.0f;
        this.lIIIIlIlIIlllllIIllIIlIII.IllIIlllllllIIlIIlIIIIlIl = 0.0f;
        this.IllIIIllIIIIlIlIlIllIIlll.IIIllIIlIIIIIIlIlIIllIIlI = -(0.1f - f7 * 0.6f);
        this.lIIIIlIlIIlllllIIllIIlIII.IIIllIIlIIIIIIlIlIIllIIlI = 0.1f - f7 * 0.6f;
        this.IllIIIllIIIIlIlIlIllIIlll.lIllllIIlIIIlIllllllIIIll = -1.5707964f;
        this.lIIIIlIlIIlllllIIllIIlIII.lIllllIIlIIIlIllllllIIIll = -1.5707964f;
        this.IllIIIllIIIIlIlIlIllIIlll.lIllllIIlIIIlIllllllIIIll -= f7 * 1.2f - f8 * 0.4f;
        this.lIIIIlIlIIlllllIIllIIlIII.lIllllIIlIIIlIllllllIIIll -= f7 * 1.2f - f8 * 0.4f;
        this.IllIIIllIIIIlIlIlIllIIlll.IllIIlllllllIIlIIlIIIIlIl += MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f3 * 0.09f) * 0.05f + 0.05f;
        this.lIIIIlIlIIlllllIIllIIlIII.IllIIlllllllIIlIIlIIIIlIl -= MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f3 * 0.09f) * 0.05f + 0.05f;
        this.IllIIIllIIIIlIlIlIllIIlll.lIllllIIlIIIlIllllllIIIll += MathHelper.lllIIIllIIIIlllIlIIllIIll(f3 * 0.067f) * 0.05f;
        this.lIIIIlIlIIlllllIIllIIlIII.lIllllIIlIIIlIllllllIIIll -= MathHelper.lllIIIllIIIIlllIlIIllIIll(f3 * 0.067f) * 0.05f;
    }
}

