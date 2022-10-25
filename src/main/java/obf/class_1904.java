package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1904
extends class_0067 {
    private final double lllIIIllIIIIlllIlIIllIIll;
    private final double lllIlIIlIIIlIlIIIllIlllIl;
    private String IlIllllllIIlIIllllIIlIIIl;

    public class_1904(String string, double d, double d2, double d3) {
        super(string, d);
        this.lllIIIllIIIIlllIlIIllIIll = d2;
        this.lllIlIIlIIIlIlIIIllIlllIl = d3;
        if (d2 > d3) {
            throw new IllegalArgumentException("Minimum value cannot be bigger than maximum value!");
        }
        if (d < d2) {
            throw new IllegalArgumentException("Default value cannot be lower than minimum value!");
        }
        if (d > d3) {
            throw new IllegalArgumentException("Default value cannot be bigger than maximum value!");
        }
    }

    public class_1904 lllIIIllIIIIlllIlIIllIIll(String string) {
        this.IlIllllllIIlIIllllIIlIIIl = string;
        return this;
    }

    public String lIlllIlllIIIIlIIlllIllIII() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    @Override
    public double lllIIIllIIIIlllIlIIllIIll(double d) {
        if (d < this.lllIIIllIIIIlllIlIIllIIll) {
            d = this.lllIIIllIIIIlllIlIIllIIll;
        }
        if (d > this.lllIlIIlIIIlIlIIIllIlllIl) {
            d = this.lllIlIIlIIIlIlIIIllIlllIl;
        }
        return d;
    }
}

