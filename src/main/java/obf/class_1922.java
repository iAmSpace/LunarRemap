package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

public class class_1922
extends class_0703 {
    private int lllIIIllIIIIlllIlIIllIIll;
    private final List lllIlIIlIIIlIlIIIllIlllIl = new ArrayList();

    public class_1922() {
    }

    public class_1922(int n, Collection collection) {
        this.lllIIIllIIIIlllIlIIllIIll = n;
        for (class_1685 class_16852 : collection) {
            this.lllIlIIlIIIlIlIIIllIlllIl.add(new class_1341(this, class_16852.lllIIIllIIIIlllIlIIllIIll().lllIIIllIIIIlllIlIIllIIll(), class_16852.lllIlIIlIIIlIlIIIllIlllIl(), class_16852.IlIllllllIIlIIllllIIlIIIl()));
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0181 class_01812) {
        this.lllIIIllIIIIlllIlIIllIIll = class_01812.readInt();
        int n = class_01812.readInt();
        for (int i = 0; i < n; ++i) {
            String string = class_01812.IlIllllllIIlIIllllIIlIIIl(64);
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
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0181 class_01812) {
        class_01812.writeInt(this.lllIIIllIIIIlllIlIIllIIll);
        class_01812.writeInt(this.lllIlIIlIIIlIlIIIllIlllIl.size());
        for (class_1341 class_13412 : this.lllIlIIlIIIlIlIIIllIlllIl) {
            class_01812.lllIIIllIIIIlllIlIIllIIll(class_13412.lllIIIllIIIIlllIlIIllIIll());
            class_01812.writeDouble(class_13412.lllIlIIlIIIlIlIIIllIlllIl());
            class_01812.writeShort(class_13412.IlIllllllIIlIIllllIIlIIIl().size());
            for (class_1256 class_12562 : class_13412.IlIllllllIIlIIllllIIlIIIl()) {
                class_01812.writeLong(class_12562.lllIIIllIIIIlllIlIIllIIll().getMostSignificantBits());
                class_01812.writeLong(class_12562.lllIIIllIIIIlllIlIIllIIll().getLeastSignificantBits());
                class_01812.writeDouble(class_12562.lIlllIlllIIIIlIIlllIllIII());
                class_01812.writeByte(class_12562.IlIllllllIIlIIllllIIlIIIl());
            }
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0596 class_05962) {
        class_05962.lllIIIllIIIIlllIlIIllIIll(this);
    }

    public int IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public List lIlllIlllIIIIlIIlllIllIII() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_2075 class_20752) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0596)class_20752);
    }
}

