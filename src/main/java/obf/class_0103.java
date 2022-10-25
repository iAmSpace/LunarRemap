package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0103
extends class_0688 {
    private boolean lllIIIllIIIIlllIlIIllIIll;

    public class_0103(boolean bl) {
        this.lllIIIllIIIIlllIlIIllIIll = bl;
    }

    public class_0103() {
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0181 class_01812) {
        class_01812.writeBoolean(this.lllIIIllIIIIlllIlIIllIIll);
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0181 class_01812) {
        this.lllIIIllIIIIlllIlIIllIIll = class_01812.readBoolean();
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1982 class_19822) {
    }

    public boolean lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }
}

