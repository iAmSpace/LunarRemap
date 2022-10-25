package obf;

/*
 * Decompiled with CFR 0.150.
 */
public abstract class class_2165
extends class_1453
implements class_0771 {
    protected class_2165() {
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(int n) {
        int n2 = n;
        while (n2-- != 0 && this.hasPrevious()) {
            this.previous();
        }
        return n - n2 - 1;
    }
}

