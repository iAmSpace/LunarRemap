package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1577
extends class_0688 {
    private String lllIIIllIIIIlllIlIIllIIll;
    private String IlIllllllIIlIIllllIIlIIIl;

    public class_1577() {
    }

    public class_1577(String string, String string2) {
        this.IlIllllllIIlIIllllIIlIIIl = string;
        this.lllIIIllIIIIlllIlIIllIIll = string2;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(PacketBuffer class_01812) {
        class_01812.writeStringToBuffer(this.IlIllllllIIlIIllllIIlIIIl);
        class_01812.writeStringToBuffer(this.lllIIIllIIIIlllIlIIllIIll);
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(PacketBuffer class_01812) {
        this.IlIllllllIIlIIllllIIlIIIl = class_01812.readStringFromBuffer(52);
        this.lllIIIllIIIIlllIlIIllIIll = class_01812.readStringFromBuffer(100);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1982 class_19822) {
        class_19822.lllIIIllIIIIlllIlIIllIIll(this);
    }

    public String lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public String lllIlIIlIIIlIlIIIllIlllIl() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }
}

