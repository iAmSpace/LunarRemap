package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0383
extends class_0688 {
    private boolean lllIIIllIIIIlllIlIIllIIll;
    private String IlIllllllIIlIIllllIIlIIIl;

    public class_0383() {
    }

    public class_0383(boolean bl, String string) {
        this.lllIIIllIIIIlllIlIIllIIll = bl;
        this.IlIllllllIIlIIllllIIlIIIl = string;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(PacketBuffer class_01812) {
        class_01812.writeBoolean(this.lllIIIllIIIIlllIlIIllIIll);
        class_01812.writeStringToBuffer(this.IlIllllllIIlIIllllIIlIIIl);
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(PacketBuffer class_01812) {
        this.lllIIIllIIIIlllIlIIllIIll = class_01812.readBoolean();
        this.IlIllllllIIlIIllllIIlIIIl = class_01812.readStringFromBuffer(52);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1982 class_19822) {
        class_19822.lllIIIllIIIIlllIlIIllIIll(this);
    }

    public boolean lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public String lllIlIIlIIIlIlIIIllIlllIl() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }
}

