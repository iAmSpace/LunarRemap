package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1162
extends class_0688 {
    private String lllIIIllIIIIlllIlIIllIIll;

    public class_1162() {
    }

    public class_1162(String string) {
        this.lllIIIllIIIIlllIlIIllIIll = string;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(PacketBuffer class_01812) {
        class_01812.writeStringToBuffer(this.lllIIIllIIIIlllIlIIllIIll);
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(PacketBuffer class_01812) {
        this.lllIIIllIIIIlllIlIIllIIll = class_01812.readStringFromBuffer(52);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1982 class_19822) {
    }

    public String lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }
}

