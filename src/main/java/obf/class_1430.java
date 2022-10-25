package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.util.MathHelper;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class class_1430
extends class_1340 {
    public static final List IlIIIIIllllllIIlllIllllll = Arrays.asList(class_0672.IlIlIIlIlIllIIlIlIIllIIIl, class_0672.lllllIlllIIllIlIIlIIIllII, class_0672.IllIIIlllllIlIlllIlllllII);
    private int lIllllIIlIIIlIllllllIIIll;
    private int IIIllIIlIIIIIIlIlIIllIIlI = 32;
    private int IllIIlllllllIIlIIlIIIIlIl = 8;

    public class_1430() {
    }

    public class_1430(Map map) {
        this();
        for (Map.Entry entry : map.entrySet()) {
            if (((String)entry.getKey()).equals("size")) {
                this.lIllllIIlIIIlIllllllIIIll = MathHelper.lllIIIllIIIIlllIlIIllIIll((String)entry.getValue(), this.lIllllIIlIIIlIllllllIIIll, 0);
                continue;
            }
            if (!((String)entry.getKey()).equals("distance")) continue;
            this.IIIllIIlIIIIIIlIlIIllIIlI = MathHelper.lllIIIllIIIIlllIlIIllIIll((String)entry.getValue(), this.IIIllIIlIIIIIIlIlIIllIIlI, this.IllIIlllllllIIlIIlIIIIlIl + 1);
        }
    }

    @Override
    public String lllIIIllIIIIlllIlIIllIIll() {
        return "Village";
    }

    @Override
    protected boolean lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        boolean bl;
        int n3 = n;
        int n4 = n2;
        if (n < 0) {
            n -= this.IIIllIIlIIIIIIlIlIIllIIlI - 1;
        }
        if (n2 < 0) {
            n2 -= this.IIIllIIlIIIIIIlIlIIllIIlI - 1;
        }
        int n5 = n / this.IIIllIIlIIIIIIlIlIIllIIlI;
        int n6 = n2 / this.IIIllIIlIIIIIIlIlIIllIIlI;
        Random random = this.IlIllllllIIlIIllllIIlIIIl.llIIlIllIllllIlIIIIlIIlll(n5, n6, 10387312);
        n5 *= this.IIIllIIlIIIIIIlIlIIllIIlI;
        n6 *= this.IIIllIIlIIIIIIlIlIIllIIlI;
        return n3 == (n5 += random.nextInt(this.IIIllIIlIIIIIIlIlIIllIIlI - this.IllIIlllllllIIlIIlIIIIlIl)) && n4 == (n6 += random.nextInt(this.IIIllIIlIIIIIIlIlIIllIIlI - this.IllIIlllllllIIlIIlIIIIlIl)) && (bl = this.IlIllllllIIlIIllllIIlIIIl.IIIllIllIIlIlIlIlIllllIIl().lllIIIllIIIIlllIlIIllIIll(n3 * 16 + 8, n4 * 16 + 8, 0, IlIIIIIllllllIIlllIllllll));
    }

    @Override
    protected class_1099 lllIlIIlIIIlIlIIIllIlllIl(int n, int n2) {
        return new class_0566(this.IlIllllllIIlIIllllIIlIIIl, this.lllIlIIlIIIlIlIIIllIlllIl, n, n2, this.lIllllIIlIIIlIllllllIIIll);
    }
}

