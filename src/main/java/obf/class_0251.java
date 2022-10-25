package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0251
extends class_0688 {
    private String lllIIIllIIIIlllIlIIllIIll;
    private String IlIllllllIIlIIllllIIlIIIl;
    private long lIlllIlllIIIIlIIlllIllIII;
    private boolean IlIIIIIllllllIIlllIllllll;

    public class_0251() {
    }

    public class_0251(String string, String string2, long l, boolean bl) {
        this.lllIIIllIIIIlllIlIIllIIll = string;
        this.IlIllllllIIlIIllllIIlIIIl = string2;
        this.lIlllIlllIIIIlIIlllIllIII = l;
        this.IlIIIIIllllllIIlllIllllll = bl;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(PacketBuffer class_01812) {
        class_01812.writeStringToBuffer(this.lllIIIllIIIIlllIlIIllIIll);
        class_01812.writeStringToBuffer(this.IlIllllllIIlIIllllIIlIIIl);
        class_01812.writeLong(this.lIlllIlllIIIIlIIlllIllIII);
        class_01812.writeBoolean(this.IlIIIIIllllllIIlllIllllll);
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(PacketBuffer class_01812) {
        this.lllIIIllIIIIlllIlIIllIIll = class_01812.readStringFromBuffer(52);
        this.IlIllllllIIlIIllllIIlIIIl = class_01812.readStringFromBuffer(32);
        this.lIlllIlllIIIIlIIlllIllIII = class_01812.readLong();
        this.IlIIIIIllllllIIlllIllllll = class_01812.readBoolean();
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

    public long IlIllllllIIlIIllllIIlIIIl() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    public boolean lIlllIlllIIIIlIIlllIllIII() {
        return this.IlIIIIIllllllIIlllIllllll;
    }
}

