package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;
import java.util.List;

public class class_1412 {
    private List lllIIIllIIIIlllIlIIllIIll = new ArrayList();
    private class_0460 lllIlIIlIIIlIlIIIllIlllIl = null;
    private int IlIllllllIIlIIllllIIlIIIl = -1;

    public int lllIIIllIIIIlllIlIIllIIll(int n) {
        if (n > 0 && n <= 16384) {
            if (this.lllIlIIlIIIlIlIIIllIlllIl == null || !this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(n)) {
                if (this.IlIllllllIIlIIllllIIlIIIl + 1 < this.lllIIIllIIIIlllIlIIllIIll.size()) {
                    ++this.IlIllllllIIlIIllllIIlIIIl;
                    this.lllIlIIlIIIlIlIIIllIlllIl = (class_0460)this.lllIIIllIIIIlllIlIIllIIll.get(this.IlIllllllIIlIIllllIIlIIIl);
                } else {
                    this.lllIlIIlIIIlIlIIIllIlllIl = new class_0460();
                    this.IlIllllllIIlIIllllIIlIIIl = this.lllIIIllIIIIlllIlIIllIIll.size();
                    this.lllIIIllIIIIlllIlIIllIIll.add(this.lllIlIIlIIIlIlIIIllIlllIl);
                }
                if (!this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(n)) {
                    throw new IllegalArgumentException("Can not allocate: " + n);
                }
            }
            return this.lllIlIIlIIIlIlIIIllIlllIl.lllIlIIlIIIlIlIIIllIlllIl(n);
        }
        throw new IllegalArgumentException("Invalid display list length: " + n);
    }

    public void lllIIIllIIIIlllIlIIllIIll() {
        this.lllIlIIlIIIlIlIIIllIlllIl = null;
        this.IlIllllllIIlIIllllIIlIIIl = -1;
        for (int i = 0; i < this.lllIIIllIIIIlllIlIIllIIll.size(); ++i) {
            class_0460 class_04602 = (class_0460)this.lllIIIllIIIIlllIlIIllIIll.get(i);
            class_04602.lllIIIllIIIIlllIlIIllIIll();
        }
    }

    public void lllIlIIlIIIlIlIIIllIlllIl() {
        for (int i = 0; i < this.lllIIIllIIIIlllIlIIllIIll.size(); ++i) {
            class_0460 class_04602 = (class_0460)this.lllIIIllIIIIlllIlIIllIIll.get(i);
            class_04602.lllIlIIlIIIlIlIIIllIlllIl();
        }
        this.lllIIIllIIIIlllIlIIllIIll.clear();
        this.lllIlIIlIIIlIlIIIllIlllIl = null;
        this.IlIllllllIIlIIllllIIlIIIl = -1;
    }
}

