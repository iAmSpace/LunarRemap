package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.beans.ConstructorProperties;
import java.util.ArrayList;
import java.util.List;

public class class_0263
extends class_0688 {
    private List IlIllllllIIlIIllllIIlIIIl;
    public static byte[] lllIIIllIIIIlllIlIIllIIll = new byte[]{36, -70, -63, 3, -116, 46, -121, -127, 117, 64, 58, 5, 75, 96, -63, 36};

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0181 class_01812) {
        class_01812.writeInt(this.IlIllllllIIlIIllllIIlIIIl.size());
        for (String string : this.IlIllllllIIlIIllllIIlIIIl) {
            class_01812.lllIIIllIIIIlllIlIIllIIll(string);
        }
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0181 class_01812) {
        int n = class_01812.readInt();
        this.IlIllllllIIlIIllllIIlIIIl = new ArrayList();
        for (int i = 0; i < n; ++i) {
            this.IlIllllllIIlIIllllIIlIIIl.add(class_01812.IlIllllllIIlIIllllIIlIIIl(512));
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1982 class_19822) {
    }

    public class_0263() {
    }

    @ConstructorProperties(value={"processes"})
    public class_0263(List list) {
        this.IlIllllllIIlIIllllIIlIIIl = list;
    }

    public List lllIIIllIIIIlllIlIIllIIll() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }
}

