package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.beans.ConstructorProperties;
import java.util.ArrayList;
import java.util.List;

public class class_2143
extends class_0688 {
    private List lllIIIllIIIIlllIlIIllIIll;

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(PacketBuffer class_01812) {
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(PacketBuffer class_01812) {
        int n = class_01812.readInt();
        this.lllIIIllIIIIlllIlIIllIIll = new ArrayList();
        for (int i = 0; i < n; ++i) {
            this.lllIIIllIIIIlllIlIIllIIll.add(class_01812.readInt());
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1982 class_19822) {
        class_19822.lllIIIllIIIIlllIlIIllIIll(this);
    }

    @ConstructorProperties(value={"emotes"})
    public class_2143(List list) {
        this.lllIIIllIIIIlllIlIIllIIll = list;
    }

    public class_2143() {
    }

    public List lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }
}

