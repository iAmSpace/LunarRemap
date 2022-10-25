package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0022
extends class_0688 {
    private String lllIIIllIIIIlllIlIIllIIll;
    private String IlIllllllIIlIIllllIIlIIIl;

    public class_0022() {
    }

    public class_0022(String string, String string2) {
        this.lllIIIllIIIIlllIlIIllIIll = string;
        this.IlIllllllIIlIIllllIIlIIIl = string2;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(PacketBuffer class_01812) {
        class_01812.writeStringToBuffer(this.lllIIIllIIIIlllIlIIllIIll);
        class_01812.writeStringToBuffer(this.IlIllllllIIlIIllllIIlIIIl);
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(PacketBuffer class_01812) {
        this.lllIIIllIIIIlllIlIIllIIll = class_01812.readStringFromBuffer(52);
        this.IlIllllllIIlIIllllIIlIIIl = class_01812.readStringFromBuffer(32);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1982 class_19822) {
        class_19822.lllIIIllIIIIlllIlIIllIIll(this, false);
    }

    public String lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public String lllIlIIlIIIlIlIIIllIlllIl() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }
}

