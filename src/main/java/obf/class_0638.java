package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.util.MathHelper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class class_0638
extends class_1340 {
    private static List IlIIIIIllllllIIlllIllllll = Arrays.asList(class_0672.lllllIlllIIllIlIIlIIIllII, class_0672.llIIIlllIlllIlIllIIIIllIl, class_0672.llIIIIllIIIIIIIlIIIlIIIIl, class_0672.IIllIllIIllIIlllIIIlIlllI, class_0672.IlIIIlIIIIllIIIllIIIIIIll);
    private List lIllllIIlIIIlIllllllIIIll = new ArrayList();
    private int IIIllIIlIIIIIIlIlIIllIIlI = 32;
    private int IllIIlllllllIIlIIlIIIIlIl = 8;

    public class_0638() {
        this.lIllllIIlIIIlIllllllIIIll.add(new class_0920(class_0066.class, 1, 1, 1));
    }

    public class_0638(Map map) {
        this();
        for (Map.Entry entry : map.entrySet()) {
            if (!((String)entry.getKey()).equals("distance")) continue;
            this.IIIllIIlIIIIIIlIlIIllIIlI = MathHelper.lllIIIllIIIIlllIlIIllIIll((String)entry.getValue(), this.IIIllIIlIIIIIIlIlIIllIIlI, this.IllIIlllllllIIlIIlIIIIlIl + 1);
        }
    }

    @Override
    public String lllIIIllIIIIlllIlIIllIIll() {
        return "Temple";
    }

    @Override
    protected boolean lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
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
        Random random = this.IlIllllllIIlIIllllIIlIIIl.llIIlIllIllllIlIIIIlIIlll(n5, n6, 14357617);
        n5 *= this.IIIllIIlIIIIIIlIlIIllIIlI;
        n6 *= this.IIIllIIlIIIIIIlIlIIllIIlI;
        if (n3 == (n5 += random.nextInt(this.IIIllIIlIIIIIIlIlIIllIIlI - this.IllIIlllllllIIlIIlIIIIlIl)) && n4 == (n6 += random.nextInt(this.IIIllIIlIIIIIIlIlIIllIIlI - this.IllIIlllllllIIlIIlIIIIlIl))) {
            class_0672 class_06722 = this.IlIllllllIIlIIllllIIlIIIl.IIIllIllIIlIlIlIlIllllIIl().lllIIIllIIIIlllIlIIllIIll(n3 * 16 + 8, n4 * 16 + 8);
            for (class_0672 class_06723 : IlIIIIIllllllIIlllIllllll) {
                if (class_06722 != class_06723) continue;
                return true;
            }
        }
        return false;
    }

    @Override
    protected class_1099 lllIlIIlIIIlIlIIIllIlllIl(int n, int n2) {
        return new class_1814(this.IlIllllllIIlIIllllIIlIIIl, this.lllIlIIlIIIlIlIIIllIlllIl, n, n2);
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        class_1099 class_10992 = this.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        if (class_10992 != null && class_10992 instanceof class_1814 && !class_10992.lllIIIllIIIIlllIlIIllIIll.isEmpty()) {
            class_1036 class_10362 = (class_1036)class_10992.lllIIIllIIIIlllIlIIllIIll.getFirst();
            return class_10362 instanceof class_0335;
        }
        return false;
    }

    public List w_() {
        return this.lIllllIIlIIIlIllllllIIIll;
    }
}

