package obf;

/*
 * Decompiled with CFR 0.150.
 */
public abstract class class_1453
implements class_0353 {
    protected class_1453() {
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int lllIlIIlIIIlIlIIIllIlllIl(int n) {
        int n2 = n;
        while (n2-- != 0 && this.hasNext()) {
            this.next();
        }
        return n - n2 - 1;
    }
}

