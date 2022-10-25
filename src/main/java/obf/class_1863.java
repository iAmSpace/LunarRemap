package obf;

import net.minecraft.util.MathHelper;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1863
extends class_1163 {
    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl() {
        this.IlIIIIIllllllIIlllIllllll = new class_2231(class_0672.llIIlIllIllllIlIIIIlIIlll, 0.0f);
        this.IIIllIllIIlIlIlIlIllllIIl = 1;
        this.IIIllIIlIIIIIIlIlIIllIIlI = true;
    }

    @Override
    public class_1848 IlIllllllIIlIIllllIIlIIIl() {
        return new class_1368(this.lllIlIIlIIIlIlIIIllIlllIl, this.lllIlIIlIIIlIlIIIllIlllIl.lIlIlIIlIIIIlIIIIIlllIIII());
    }

    @Override
    public float lllIIIllIIIIlllIlIIllIIll(long l, float f) {
        return 0.0f;
    }

    @Override
    public float[] lllIIIllIIIIlllIlIIllIIll(float f, float f2) {
        return null;
    }

    @Override
    public class_0864 lllIlIIlIIIlIlIIIllIlllIl(float f, float f2) {
        int n = 0xA080A0;
        float f3 = MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f * (float)Math.PI * 2.0f) * 2.0f + 0.5f;
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        float f4 = (float)(n >> 16 & 0xFF) / 255.0f;
        float f5 = (float)(n >> 8 & 0xFF) / 255.0f;
        float f6 = (float)(n & 0xFF) / 255.0f;
        return class_0864.lllIIIllIIIIlllIlIIllIIll(f4 *= f3 * 0.0f + 0.15f, f5 *= f3 * 0.0f + 0.15f, f6 *= f3 * 0.0f + 0.15f);
    }

    @Override
    public boolean IIIllIIlIIIIIIlIlIIllIIlI() {
        return false;
    }

    @Override
    public boolean IlIIIIIllllllIIlllIllllll() {
        return false;
    }

    @Override
    public boolean lIlllIlllIIIIlIIlllIllIII() {
        return false;
    }

    @Override
    public float lIllllIIlIIIlIllllllIIIll() {
        return 8.0f;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        return this.lllIlIIlIIIlIlIIIllIlllIl.lllIlIIlIIIlIlIIIllIlllIl(n, n2).lIllllIIlIIIlIllllllIIIll().lIlllIlllIIIIlIIlllIllIII();
    }

    @Override
    public class_2208 IllIIlllllllIIlIIlIIIIlIl() {
        return new class_2208(100, 50, 0);
    }

    @Override
    public int IIIllIllIIlIlIlIlIllllIIl() {
        return 50;
    }

    @Override
    public boolean lllIlIIlIIIlIlIIIllIlllIl(int n, int n2) {
        return true;
    }

    @Override
    public String llIIlllIllIllllIIIlIIIIII() {
        return "The End";
    }
}

