package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0847
extends class_0894 {
    public class_0847(long l) {
        super(l);
    }

    @Override
    protected float lllIIIllIIIIlllIlIIllIIll() {
        float f = super.lllIIIllIIIIlllIlIIllIIll();
        return (double)f < 0.5 ? 2.0f * f * f : -1.0f + (4.0f - 2.0f * f) * f;
    }
}

