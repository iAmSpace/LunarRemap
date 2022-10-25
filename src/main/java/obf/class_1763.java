package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.beans.ConstructorProperties;

public class class_1763
extends class_0688 {
    private int lllIIIllIIIIlllIlIIllIIll;
    private double IlIllllllIIlIIllllIIlIIIl;

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0181 class_01812) {
        class_01812.writeInt(this.lllIIIllIIIIlllIlIIllIIll);
        class_01812.writeDouble(this.IlIllllllIIlIIllllIIlIIIl);
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0181 class_01812) {
        this.lllIIIllIIIIlllIlIIllIIll = class_01812.readInt();
        this.IlIllllllIIlIIllllIIlIIIl = class_01812.readDouble();
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1982 class_19822) {
    }

    public class_1763() {
    }

    @ConstructorProperties(value={"id", "value"})
    public class_1763(int n, double d) {
        this.lllIIIllIIIIlllIlIIllIIll = n;
        this.IlIllllllIIlIIllllIIlIIIl = d;
    }
}

