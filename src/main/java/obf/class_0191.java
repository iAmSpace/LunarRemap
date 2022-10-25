package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.util.MathHelper;

import java.util.Random;

public class class_0191
extends class_2257 {
    private class_2102[] llllllIlIllllIlIlIlIIIIlI = new class_2102[2];

    public class_0191() {
        super(class_1855.lIlllIlllIIIIlIIlllIllIII);
        this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, 1.0f, 0.375f, 1.0f);
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.lIlllIlllIIIIlIIlllIllIII);
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl(class_1843 class_18432, int n, int n2, int n3) {
        this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, 1.0f, 0.375f, 1.0f);
    }

    @Override
    public int lIlllIlllIIIIlIIlllIllIII(class_1843 class_18432, int n, int n2, int n3, int n4) {
        return class_18432.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Random random) {
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Block class_05492) {
    }

    @Override
    public void lIlllIlllIIIIlIIlllIllIII(class_1334 class_13342, int n, int n2, int n3) {
    }

    public void IllIIIllIIIIlIlIlIllIIlll(class_1334 class_13342, int n, int n2, int n3) {
        if (!class_13342.IlIlIIlllIIlIllIIIlllllIl.IIIllIIlIIIIIIlIlIIllIIlI) {
            int n4 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
            int n5 = class_13342.lllIlIIlIIIlIlIIIllIlllIl(class_1346.lllIIIllIIIIlllIlIIllIIll, n, n2, n3) - class_13342.IllIIlllllllIIlIIlIIIIlIl;
            float f = class_13342.lIlllIlllIIIIlIIlllIllIII(1.0f);
            f = f < (float)Math.PI ? (f += (0.0f - f) * 0.2f) : (f += ((float)Math.PI * 2 - f) * 0.2f);
            n5 = Math.round((float)n5 * MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f));
            if (n5 < 0) {
                n5 = 0;
            }
            if (n5 > 15) {
                n5 = 15;
            }
            if (n4 != n5) {
                class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n5, 3);
            }
        }
    }

    @Override
    public boolean IllIIIllIIIIlIlIlIllIIlll() {
        return false;
    }

    @Override
    public boolean IlIlllIIIIIIlIIllIIllIlll() {
        return false;
    }

    @Override
    public boolean llIllllIlIllIIIlIllIIlIlI() {
        return true;
    }

    @Override
    public class_1774 lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n) {
        return new class_0045();
    }

    @Override
    public class_2102 lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        return n == 1 ? this.llllllIlIllllIlIlIlIIIIlI[0] : this.llllllIlIllllIlIlIlIIIIlI[1];
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
        this.llllllIlIllllIlIlIlIIIIlI[0] = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_top");
        this.llllllIlIllllIlIlIlIIIIlI[1] = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_side");
    }
}

