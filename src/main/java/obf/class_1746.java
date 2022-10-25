package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1746
extends class_0894 {
    public class_1746(long l) {
        super(l, 0.0f);
    }

    @Override
    protected float lllIIIllIIIIlllIlIIllIIll() {
        float f = super.lllIIIllIIIIlllIlIIllIIll();
        float f2 = f * 2.0f - 1.0f;
        return (float)(Math.cos((double)f2 * Math.PI) + 1.0) / 2.0f;
    }
}

