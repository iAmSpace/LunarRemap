package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;
import java.util.List;

public class class_0694
extends class_0688 {
    private List lllIIIllIIIIlllIlIIllIIll;
    private String IlIllllllIIlIIllllIIlIIIl;

    public class_0694() {
    }

    public class_0694(String string, List list) {
        this.IlIllllllIIlIIllllIIlIIIl = string;
        this.lllIIIllIIIIlllIlIIllIIll = list;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0181 class_01812) {
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0181 class_01812) {
        this.IlIllllllIIlIIllllIIlIIIl = class_01812.IlIllllllIIlIIllllIIlIIIl(52);
        int n = class_01812.readInt();
        this.lllIIIllIIIIlllIlIIllIIll = new ArrayList();
        for (int i = 0; i < n; ++i) {
            long l = class_01812.readLong();
            float f = class_01812.readFloat();
            boolean bl = class_01812.readBoolean();
            String string = class_01812.IlIllllllIIlIIllllIIlIIIl(512);
            String string2 = class_01812.IlIllllllIIlIIllllIIlIIIl(128);
            String string3 = class_01812.IlIllllllIIlIIllllIIlIIIl(128);
            this.lllIIIllIIIIlllIlIIllIIll.add(new Cosmetic(l, this.IlIllllllIIlIIllllIIlIIIl, string2, string3, f, bl, string));
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1982 class_19822) {
        class_19822.lllIIIllIIIIlllIlIIllIIll(this);
    }

    public List lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public String lllIlIIlIIIlIlIIIllIlllIl() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }
}

