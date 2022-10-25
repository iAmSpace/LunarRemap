package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.beans.ConstructorProperties;
import java.util.UUID;

public class class_0651
extends class_0688 {
    private UUID lllIIIllIIIIlllIlIIllIIll;
    private int IlIllllllIIlIIllllIIlIIIl;

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(PacketBuffer class_01812) {
        class_01812.writeLong(this.lllIIIllIIIIlllIlIIllIIll.getMostSignificantBits());
        class_01812.writeLong(this.lllIIIllIIIIlllIlIIllIIll.getLeastSignificantBits());
        class_01812.writeInt(this.IlIllllllIIlIIllllIIlIIIl);
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(PacketBuffer class_01812) {
        this.lllIIIllIIIIlllIlIIllIIll = new UUID(class_01812.readLong(), class_01812.readLong());
        this.IlIllllllIIlIIllllIIlIIIl = class_01812.readInt();
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1982 class_19822) {
        class_19822.lllIIIllIIIIlllIlIIllIIll(this);
    }

    @ConstructorProperties(value={"uuid", "emote"})
    public class_0651(UUID uUID, int n) {
        this.lllIIIllIIIIlllIlIIllIIll = uUID;
        this.IlIllllllIIlIIllllIIlIIIl = n;
    }

    public class_0651() {
    }

    public UUID lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public int lllIlIIlIIIlIlIIIllIlllIl() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }
}

