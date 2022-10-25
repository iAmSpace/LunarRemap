package net.minecraft.network.play.server;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.network.Packet;
import obf.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

public class S20PacketEntityProperties
extends Packet {
    private int lllIIIllIIIIlllIlIIllIIll;
    private final List lllIlIIlIIIlIlIIIllIlllIl = new ArrayList();

    public S20PacketEntityProperties() {
    }

    public S20PacketEntityProperties(int n, Collection in) {
        Collection<class_1685> collection = (Collection<class_1685>) in;
        this.lllIIIllIIIIlllIlIIllIIll = n;
        for (class_1685 class_16852 : collection) {
            this.lllIlIIlIIIlIlIIIllIlllIl.add(new class_1341(this, class_16852.lllIIIllIIIIlllIlIIllIIll().lllIIIllIIIIlllIlIIllIIll(), class_16852.lllIlIIlIIIlIlIIIllIlllIl(), class_16852.IlIllllllIIlIIllllIIlIIIl()));
        }
    }

    @Override
    public void readPacketData(PacketBuffer class_01812) {
        this.lllIIIllIIIIlllIlIIllIIll = class_01812.readInt();
        int n = class_01812.readInt();
        for (int i = 0; i < n; ++i) {
            String string = class_01812.readStringFromBuffer(64);
            double d = class_01812.readDouble();
            ArrayList<class_1256> arrayList = new ArrayList<class_1256>();
            int n2 = class_01812.readShort();
            for (int j = 0; j < n2; ++j) {
                UUID uUID = new UUID(class_01812.readLong(), class_01812.readLong());
                arrayList.add(new class_1256(uUID, "Unknown synced attribute modifier", class_01812.readDouble(), class_01812.readByte()));
            }
            this.lllIlIIlIIIlIlIIIllIlllIl.add(new class_1341(this, string, d, arrayList));
        }
    }

    @Override
    public void writePacketData(PacketBuffer class_01812) {
        class_01812.writeInt(this.lllIIIllIIIIlllIlIIllIIll);
        class_01812.writeInt(this.lllIlIIlIIIlIlIIIllIlllIl.size());
        List<class_1341> this$lllIlIIlIIIlIlIIIllIlllIl = (List<class_1341>) this.lllIlIIlIIIlIlIIIllIlllIl;
        for (class_1341 class_13412 : this$lllIlIIlIIIlIlIIIllIlllIl) {
            class_01812.writeStringToBuffer(class_13412.lllIIIllIIIIlllIlIIllIIll());
            class_01812.writeDouble(class_13412.lllIlIIlIIIlIlIIIllIlllIl());
            class_01812.writeShort(class_13412.IlIllllllIIlIIllllIIlIIIl().size());
            Collection<class_1256> class_13412$IlIllllllIIlIIllllIIlIIIl = (Collection<class_1256>) class_13412.IlIllllllIIlIIllllIIlIIIl();
            for (class_1256 class_12562 : class_13412$IlIllllllIIlIIllllIIlIIIl) {
                class_01812.writeLong(class_12562.lllIIIllIIIIlllIlIIllIIll().getMostSignificantBits());
                class_01812.writeLong(class_12562.lllIIIllIIIIlllIlIIllIIll().getLeastSignificantBits());
                class_01812.writeDouble(class_12562.lIlllIlllIIIIlIIlllIllIII());
                class_01812.writeByte(class_12562.IlIllllllIIlIIllllIIlIIIl());
            }
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(INetHandlerPlayClient class_05962) {
        class_05962.lllIIIllIIIIlllIlIIllIIll(this);
    }

    public int IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public List<class_1341> lIlllIlllIIIIlIIlllIllIII() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    @Override
    public void processPacket(INetHandler class_20752) {
        this.lllIIIllIIIIlllIlIIllIIll((INetHandlerPlayClient)class_20752);
    }
}

