package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.util.MathHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class class_0763
extends class_1340 {
    private List IlIIIIIllllllIIlllIllllll;
    private boolean lIllllIIlIIIlIllllllIIIll;
    private class_1108[] IIIllIIlIIIIIIlIlIIllIIlI = new class_1108[3];
    private double IllIIlllllllIIlIIlIIIIlIl = 32.0;
    private int IIIllIllIIlIlIlIlIllllIIl = 3;

    public class_0763() {
        this.IlIIIIIllllllIIlllIllllll = new ArrayList();
        for (class_0672 class_06722 : class_0672.lllIIlIIIllllllIIIIlIlIlI()) {
            if (class_06722 == null || !(class_06722.llllIlIIllIIlllllIIllIIll > 0.0f)) continue;
            this.IlIIIIIllllllIIlllIllllll.add(class_06722);
        }
    }

    public class_0763(Map map) {
        this();
        for (Map.Entry entry : map.entrySet()) {
            if (((String)entry.getKey()).equals("distance")) {
                this.IllIIlllllllIIlIIlIIIIlIl = MathHelper.lllIIIllIIIIlllIlIIllIIll((String)entry.getValue(), this.IllIIlllllllIIlIIlIIIIlIl, 1.0);
                continue;
            }
            if (((String)entry.getKey()).equals("count")) {
                this.IIIllIIlIIIIIIlIlIIllIIlI = new class_1108[MathHelper.lllIIIllIIIIlllIlIIllIIll((String)entry.getValue(), this.IIIllIIlIIIIIIlIlIIllIIlI.length, 1)];
                continue;
            }
            if (!((String)entry.getKey()).equals("spread")) continue;
            this.IIIllIllIIlIlIlIlIllllIIl = MathHelper.lllIIIllIIIIlllIlIIllIIll((String)entry.getValue(), this.IIIllIllIIlIlIlIlIllllIIl, 1);
        }
    }

    @Override
    public String lllIIIllIIIIlllIlIIllIIll() {
        return "Stronghold";
    }

    @Override
    protected boolean lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        if (!this.lIllllIIlIIIlIllllllIIIll) {
            Random random = new Random();
            random.setSeed(this.IlIllllllIIlIIllllIIlIIIl.lIlIlIIlIIIIlIIIIIlllIIII());
            double d = random.nextDouble() * Math.PI * 2.0;
            int n3 = 1;
            for (int i = 0; i < this.IIIllIIlIIIIIIlIlIIllIIlI.length; ++i) {
                double d2 = (1.25 * (double)n3 + random.nextDouble()) * this.IllIIlllllllIIlIIlIIIIlIl * (double)n3;
                int n4 = (int)Math.round(Math.cos(d) * d2);
                int n5 = (int)Math.round(Math.sin(d) * d2);
                class_2137 class_21372 = this.IlIllllllIIlIIllllIIlIIIl.IIIllIllIIlIlIlIlIllllIIl().lllIIIllIIIIlllIlIIllIIll((n4 << 4) + 8, (n5 << 4) + 8, 112, this.IlIIIIIllllllIIlllIllllll, random);
                if (class_21372 != null) {
                    n4 = class_21372.lllIIIllIIIIlllIlIIllIIll >> 4;
                    n5 = class_21372.IlIllllllIIlIIllllIIlIIIl >> 4;
                }
                this.IIIllIIlIIIIIIlIlIIllIIlI[i] = new class_1108(n4, n5);
                d += Math.PI * 2 * (double)n3 / (double)this.IIIllIllIIlIlIlIlIllllIIl;
                if (i != this.IIIllIllIIlIlIlIlIllllIIl) continue;
                n3 += 2 + random.nextInt(5);
                this.IIIllIllIIlIlIlIlIllllIIl += 1 + random.nextInt(2);
            }
            this.lIllllIIlIIIlIllllllIIIll = true;
        }
        for (class_1108 class_11082 : this.IIIllIIlIIIIIIlIlIIllIIlI) {
            if (n != class_11082.lllIIIllIIIIlllIlIIllIIll || n2 != class_11082.lllIlIIlIIIlIlIIIllIlllIl) continue;
            return true;
        }
        return false;
    }

    @Override
    protected List lllIlIIlIIIlIlIIIllIlllIl() {
        ArrayList<class_2137> arrayList = new ArrayList<class_2137>();
        for (class_1108 class_11082 : this.IIIllIIlIIIIIIlIlIIllIIlI) {
            if (class_11082 == null) continue;
            arrayList.add(class_11082.lllIIIllIIIIlllIlIIllIIll(64));
        }
        return arrayList;
    }

    @Override
    protected class_1099 lllIlIIlIIIlIlIIIllIlllIl(int n, int n2) {
        class_0082 class_00822 = new class_0082(this.IlIllllllIIlIIllllIIlIIIl, this.lllIlIIlIIIlIlIIIllIlllIl, n, n2);
        while (class_00822.IlIllllllIIlIIllllIIlIIIl().isEmpty() || ((class_1844)class_00822.IlIllllllIIlIIllllIIlIIIl().get((int)0)).lllIlIIlIIIlIlIIIllIlllIl == null) {
            class_00822 = new class_0082(this.IlIllllllIIlIIllllIIlIIIl, this.lllIlIIlIIIlIlIIIllIlllIl, n, n2);
        }
        return class_00822;
    }
}

