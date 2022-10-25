package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.init.Blocks;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class class_1671
extends class_1036 {
    private List lllIIIllIIIIlllIlIIllIIll = new LinkedList();

    public class_1671() {
    }

    public class_1671(int n, Random random, int n2, int n3) {
        super(n);
        this.IlIIIIIllllllIIlllIllllll = new class_2046(n2, 50, n3, n2 + 7 + random.nextInt(6), 54 + random.nextInt(6), n3 + 7 + random.nextInt(6));
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1036 class_10362, List list, Random random) {
        class_2046 class_20462;
        class_1036 class_10363;
        int n;
        int n2 = this.IlIllllllIIlIIllllIIlIIIl();
        int n3 = this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl() - 3 - 1;
        if (n3 <= 0) {
            n3 = 1;
        }
        for (n = 0; n < this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl() && (n += random.nextInt(this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl())) + 3 <= this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl(); n += 4) {
            class_10363 = class_1657.lllIIIllIIIIlllIlIIllIIll(class_10362, list, random, this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll + n, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl + random.nextInt(n3) + 1, this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl - 1, 2, n2);
            if (class_10363 == null) continue;
            class_20462 = class_10363.lllIlIIlIIIlIlIIIllIlllIl();
            this.lllIIIllIIIIlllIlIIllIIll.add(new class_2046(class_20462.lllIIIllIIIIlllIlIIllIIll, class_20462.lllIlIIlIIIlIlIIIllIlllIl, this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl, class_20462.lIlllIlllIIIIlIIlllIllIII, class_20462.IlIIIIIllllllIIlllIllllll, this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl + 1));
        }
        for (n = 0; n < this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl() && (n += random.nextInt(this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl())) + 3 <= this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl(); n += 4) {
            class_10363 = class_1657.lllIIIllIIIIlllIlIIllIIll(class_10362, list, random, this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll + n, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl + random.nextInt(n3) + 1, this.IlIIIIIllllllIIlllIllllll.lIllllIIlIIIlIllllllIIIll + 1, 0, n2);
            if (class_10363 == null) continue;
            class_20462 = class_10363.lllIlIIlIIIlIlIIIllIlllIl();
            this.lllIIIllIIIIlllIlIIllIIll.add(new class_2046(class_20462.lllIIIllIIIIlllIlIIllIIll, class_20462.lllIlIIlIIIlIlIIIllIlllIl, this.IlIIIIIllllllIIlllIllllll.lIllllIIlIIIlIllllllIIIll - 1, class_20462.lIlllIlllIIIIlIIlllIllIII, class_20462.IlIIIIIllllllIIlllIllllll, this.IlIIIIIllllllIIlllIllllll.lIllllIIlIIIlIllllllIIIll));
        }
        for (n = 0; n < this.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII() && (n += random.nextInt(this.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII())) + 3 <= this.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII(); n += 4) {
            class_10363 = class_1657.lllIIIllIIIIlllIlIIllIIll(class_10362, list, random, this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll - 1, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl + random.nextInt(n3) + 1, this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl + n, 1, n2);
            if (class_10363 == null) continue;
            class_20462 = class_10363.lllIlIIlIIIlIlIIIllIlllIl();
            this.lllIIIllIIIIlllIlIIllIIll.add(new class_2046(this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll, class_20462.lllIlIIlIIIlIlIIIllIlllIl, class_20462.IlIllllllIIlIIllllIIlIIIl, this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll + 1, class_20462.IlIIIIIllllllIIlllIllllll, class_20462.lIllllIIlIIIlIllllllIIIll));
        }
        for (n = 0; n < this.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII() && (n += random.nextInt(this.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII())) + 3 <= this.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII(); n += 4) {
            class_10363 = class_1657.lllIIIllIIIIlllIlIIllIIll(class_10362, list, random, this.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII + 1, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl + random.nextInt(n3) + 1, this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl + n, 3, n2);
            if (class_10363 == null) continue;
            class_20462 = class_10363.lllIlIIlIIIlIlIIIllIlllIl();
            this.lllIIIllIIIIlllIlIIllIIll.add(new class_2046(this.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII - 1, class_20462.lllIlIIlIIIlIlIIIllIlllIl, class_20462.IlIllllllIIlIIllllIIlIIIl, this.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII, class_20462.IlIIIIIllllllIIlllIllllll, class_20462.lIllllIIlIIIlIllllllIIIll));
        }
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, Random random, class_2046 class_20462) {
        if (this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462)) {
            return false;
        }
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl, this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl, this.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl, this.IlIIIIIllllllIIlllIllllll.lIllllIIlIIIlIllllllIIIll, Blocks.lIlllIlllIIIIlIIlllIllIII, Blocks.lllIIIllIIIIlllIlIIllIIll, true);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl + 1, this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl, this.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII, Math.min(this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl + 3, this.IlIIIIIllllllIIlllIllllll.IlIIIIIllllllIIlllIllllll), this.IlIIIIIllllllIIlllIllllll.lIllllIIlIIIlIllllllIIIll, Blocks.lllIIIllIIIIlllIlIIllIIll, Blocks.lllIIIllIIIIlllIlIIllIIll, false);
        for (class_2046 class_20463 : this.lllIIIllIIIIlllIlIIllIIll) {
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, class_20463.lllIIIllIIIIlllIlIIllIIll, class_20463.IlIIIIIllllllIIlllIllllll - 2, class_20463.IlIllllllIIlIIllllIIlIIIl, class_20463.lIlllIlllIIIIlIIlllIllIII, class_20463.IlIIIIIllllllIIlllIllllll, class_20463.lIllllIIlIIIlIllllllIIIll, Blocks.lllIIIllIIIIlllIlIIllIIll, Blocks.lllIIIllIIIIlllIlIIllIIll, false);
        }
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl + 4, this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl, this.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll.IlIIIIIllllllIIlllIllllll, this.IlIIIIIllllllIIlllIllllll.lIllllIIlIIIlIllllllIIIll, Blocks.lllIIIllIIIIlllIlIIllIIll, false);
        return true;
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        class_2145 class_21452 = new class_2145();
        for (class_2046 class_20462 : this.lllIIIllIIIIlllIlIIllIIll) {
            class_21452.lllIIIllIIIIlllIlIIllIIll(class_20462.IllIIlllllllIIlIIlIIIIlIl());
        }
        class_07752.lllIIIllIIIIlllIlIIllIIll("Entrances", class_21452);
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        class_2145 class_21452 = class_07752.IlIllllllIIlIIllllIIlIIIl("Entrances", 11);
        for (int i = 0; i < class_21452.lIlllIlllIIIIlIIlllIllIII(); ++i) {
            this.lllIIIllIIIIlllIlIIllIIll.add(new class_2046(class_21452.IlIllllllIIlIIllllIIlIIIl(i)));
        }
    }
}

