package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.util.MathHelper;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class class_0419
extends class_1327 {
    private class_1252 lllIIIllIIIIlllIlIIllIIll;
    private double lllIlIIlIIIlIlIIIllIlllIl;
    private class_2086 IlIllllllIIlIIllllIIlIIIl;
    private class_1529 lIlllIlllIIIIlIIlllIllIII;
    private boolean IlIIIIIllllllIIlllIllllll;
    private List lIllllIIlIIIlIllllllIIIll = new ArrayList();

    public class_0419(class_1252 class_12522, double d, boolean bl) {
        this.lllIIIllIIIIlllIlIIllIIll = class_12522;
        this.lllIlIIlIIIlIlIIIllIlllIl = d;
        this.IlIIIIIllllllIIlllIllllll = bl;
        this.lllIIIllIIIIlllIlIIllIIll(1);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll() {
        this.IllIIlllllllIIlIIlIIIIlIl();
        if (this.IlIIIIIllllllIIlllIllllll && this.lllIIIllIIIIlllIlIIllIIll.lIlIllIIlIIlIIlIIlIIlIIll.lIIIIlIlIIlllllIIllIIlIII()) {
            return false;
        }
        class_0938 class_09382 = this.lllIIIllIIIIlllIlIIllIIll.lIlIllIIlIIlIIlIIlIIlIIll.llIllllIlIllIIIlIllIIlIlI.lllIIIllIIIIlllIlIIllIIll(MathHelper.IlIllllllIIlIIllllIIlIIIl(this.lllIIIllIIIIlllIlIIllIIll.IlIIlllllIIlIlIlllllIllll), MathHelper.IlIllllllIIlIIllllIIlIIIl(this.lllIIIllIIIIlllIlIIllIIll.llIIlIlIlllIIllIlIlllIllI), MathHelper.IlIllllllIIlIIllllIIlIIIl(this.lllIIIllIIIIlllIlIIllIIll.IllIIIIllIIllIllIlllIlIIl), 0);
        if (class_09382 == null) {
            return false;
        }
        this.lIlllIlllIIIIlIIlllIllIII = this.lllIIIllIIIIlllIlIIllIIll(class_09382);
        if (this.lIlllIlllIIIIlIIlllIllIII == null) {
            return false;
        }
        boolean bl = this.lllIIIllIIIIlllIlIIllIIll.IllIIIIllIIllIllIlllIlIIl().lllIlIIlIIIlIlIIIllIlllIl();
        this.lllIIIllIIIIlllIlIIllIIll.IllIIIIllIIllIllIlllIlIIl().lllIlIIlIIIlIlIIIllIlllIl(false);
        this.IlIllllllIIlIIllllIIlIIIl = this.lllIIIllIIIIlllIlIIllIIll.IllIIIIllIIllIllIlllIlIIl().lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll, this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl, this.lIlllIlllIIIIlIIlllIllIII.IlIllllllIIlIIllllIIlIIIl);
        this.lllIIIllIIIIlllIlIIllIIll.IllIIIIllIIllIllIlllIlIIl().lllIlIIlIIIlIlIIIllIlllIl(bl);
        if (this.IlIllllllIIlIIllllIIlIIIl != null) {
            return true;
        }
        class_0864 class_08642 = class_1008.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, 10, 7, class_0864.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll, this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl, this.lIlllIlllIIIIlIIlllIllIII.IlIllllllIIlIIllllIIlIIIl));
        if (class_08642 == null) {
            return false;
        }
        this.lllIIIllIIIIlllIlIIllIIll.IllIIIIllIIllIllIlllIlIIl().lllIlIIlIIIlIlIIIllIlllIl(false);
        this.IlIllllllIIlIIllllIIlIIIl = this.lllIIIllIIIIlllIlIIllIIll.IllIIIIllIIllIllIlllIlIIl().lllIIIllIIIIlllIlIIllIIll(class_08642.lllIIIllIIIIlllIlIIllIIll, class_08642.lllIlIIlIIIlIlIIIllIlllIl, class_08642.IlIllllllIIlIIllllIIlIIIl);
        this.lllIIIllIIIIlllIlIIllIIll.IllIIIIllIIllIllIlllIlIIl().lllIlIIlIIIlIlIIIllIlllIl(bl);
        return this.IlIllllllIIlIIllllIIlIIIl != null;
    }

    @Override
    public boolean lllIlIIlIIIlIlIIIllIlllIl() {
        if (this.lllIIIllIIIIlllIlIIllIIll.IllIIIIllIIllIllIlllIlIIl().lIllllIIlIIIlIllllllIIIll()) {
            return false;
        }
        float f = this.lllIIIllIIIIlllIlIIllIIll.IIIIlIlIIlIIIIlIlllIlIIII + 4.0f;
        return this.lllIIIllIIIIlllIlIIllIIll.lIllllIIlIIIlIllllllIIIll(this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll, this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl, this.lIlllIlllIIIIlIIlllIllIII.IlIllllllIIlIIllllIIlIIIl) > (double)(f * f);
    }

    @Override
    public void IlIIIIIllllllIIlllIllllll() {
        this.lllIIIllIIIIlllIlIIllIIll.IllIIIIllIIllIllIlllIlIIl().lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl, this.lllIlIIlIIIlIlIIIllIlllIl);
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
        if (this.lllIIIllIIIIlllIlIIllIIll.IllIIIIllIIllIllIlllIlIIl().lIllllIIlIIIlIllllllIIIll() || this.lllIIIllIIIIlllIlIIllIIll.lIllllIIlIIIlIllllllIIIll(this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll, this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl, this.lIlllIlllIIIIlIIlllIllIII.IlIllllllIIlIIllllIIlIIIl) < 16.0) {
            this.lIllllIIlIIIlIllllllIIIll.add(this.lIlllIlllIIIIlIIlllIllIII);
        }
    }

    private class_1529 lllIIIllIIIIlllIlIIllIIll(class_0938 class_09382) {
        class_1529 class_15292 = null;
        int n = Integer.MAX_VALUE;
        List list = class_09382.lIllllIIlIIIlIllllllIIIll();
        for (class_1529 class_15293 : list) {
            int n2 = class_15293.lllIIIllIIIIlllIlIIllIIll(MathHelper.IlIllllllIIlIIllllIIlIIIl(this.lllIIIllIIIIlllIlIIllIIll.IlIIlllllIIlIlIlllllIllll), MathHelper.IlIllllllIIlIIllllIIlIIIl(this.lllIIIllIIIIlllIlIIllIIll.llIIlIlIlllIIllIlIlllIllI), MathHelper.IlIllllllIIlIIllllIIlIIIl(this.lllIIIllIIIIlllIlIIllIIll.IllIIIIllIIllIllIlllIlIIl));
            if (n2 >= n || this.lllIIIllIIIIlllIlIIllIIll(class_15293)) continue;
            class_15292 = class_15293;
            n = n2;
        }
        return class_15292;
    }

    private boolean lllIIIllIIIIlllIlIIllIIll(class_1529 class_15292) {
        class_1529 class_15293;
        Iterator iterator = this.lIllllIIlIIIlIllllllIIIll.iterator();
        do {
            if (!iterator.hasNext()) {
                return false;
            }
            class_15293 = (class_1529)iterator.next();
        } while (class_15292.lllIIIllIIIIlllIlIIllIIll != class_15293.lllIIIllIIIIlllIlIIllIIll || class_15292.lllIlIIlIIIlIlIIIllIlllIl != class_15293.lllIlIIlIIIlIlIIIllIlllIl || class_15292.IlIllllllIIlIIllllIIlIIIl != class_15293.IlIllllllIIlIIllllIIlIIIl);
        return true;
    }

    private void IllIIlllllllIIlIIlIIIIlIl() {
        if (this.lIllllIIlIIIlIllllllIIIll.size() > 15) {
            this.lIllllIIlIIIlIllllllIIIll.remove(0);
        }
    }
}

