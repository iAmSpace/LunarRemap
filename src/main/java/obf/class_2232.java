package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public class class_2232
extends class_0688 {
    private List lllIIIllIIIIlllIlIIllIIll;

    public class_2232() {
    }

    public class_2232(List list) {
        this.lllIIIllIIIIlllIlIIllIIll = list;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0181 class_01812) {
        class_01812.writeInt(this.lllIIIllIIIIlllIlIIllIIll.size());
        for (Cosmetic class_04332 : this.lllIIIllIIIIlllIlIIllIIll) {
            class_01812.writeLong(class_04332.lllIIIllIIIIlllIlIIllIIll());
            class_01812.writeBoolean(class_04332.IllIIlllllllIIlIIlIIIIlIl());
        }
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0181 class_01812) {
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1982 class_19822) {
    }

    public List lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }
}

