package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;
import java.util.List;

public class class_2043
extends class_0759 {
    protected final List IIIllIIlIIIIIIlIlIIllIIlI = new ArrayList();

    public class_2043(List list) {
        this.IIIllIIlIIIIIIlIlIIllIIlI.addAll(list);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(float f, float f2, boolean bl) {
        for (class_0759 class_07592 : this.IIIllIIlIIIIIIlIlIIllIIlI) {
            class_07592.lllIlIIlIIIlIlIIIllIlllIl(f, f2, bl);
        }
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl() {
        this.IIIllIIlIIIIIIlIlIIllIIlI.forEach(class_0759::lllIlIIlIIIlIlIIIllIlllIl);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll() {
        this.IIIllIIlIIIIIIlIlIIllIIlI.forEach(class_0759::lllIIIllIIIIlllIlIIllIIll);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(char c, int n) {
        this.IIIllIIlIIIIIIlIlIIllIIlI.forEach(class_07592 -> class_07592.lllIIIllIIIIlllIlIIllIIll(c, n));
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(float f, float f2, int n, boolean bl) {
        if (!bl) {
            return false;
        }
        boolean bl2 = false;
        for (class_0759 class_07592 : this.IIIllIIlIIIIIIlIlIIllIIlI) {
            if (bl2) break;
            bl2 = class_07592.lllIIIllIIIIlllIlIIllIIll(f, f2, n, bl);
        }
        return bl2;
    }

    @Override
    public boolean lllIlIIlIIIlIlIIIllIlllIl(float f, float f2, int n, boolean bl) {
        if (!bl) {
            return false;
        }
        boolean bl2 = false;
        for (class_0759 class_07592 : this.IIIllIIlIIIIIIlIlIIllIIlI) {
            if (bl2) break;
            bl2 = class_07592.lllIlIIlIIIlIlIIIllIlllIl(f, f2, n, bl);
        }
        return bl2;
    }

    public List IllIIlllllllIIlIIlIIIIlIl() {
        return this.IIIllIIlIIIIIIlIlIIllIIlI;
    }
}

