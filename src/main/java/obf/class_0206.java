package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class class_0206
extends class_1235 {
    public class_1076 lllIIIllIIIIlllIlIIllIIll;
    public boolean lllIlIIlIIIlIlIIIllIlllIl;
    public int IlIllllllIIlIIllllIIlIIIl;
    public class_2135 lIlllIlllIIIIlIIlllIllIII;
    public List IllIIlllllllIIlIIlIIIIlIl;
    public List IIIllIllIIlIlIlIlIllllIIl = new ArrayList();
    public List IllIIIllIIIIlIlIlIllIIlll = new ArrayList();

    public class_0206() {
    }

    public class_0206(class_1076 class_10762, int n, Random random, int n2, int n3, List list, int n4) {
        super(null, 0, random, n2, n3);
        this.lllIIIllIIIIlllIlIIllIIll = class_10762;
        this.IllIIlllllllIIlIIlIIIIlIl = list;
        this.IlIllllllIIlIIllllIIlIIIl = n4;
        class_0672 class_06722 = class_10762.lllIIIllIIIIlllIlIIllIIll(n2, n3);
        this.lllIlIIlIIIlIlIIIllIlllIl = class_06722 == class_0672.lllllIlllIIllIlIIlIIIllII || class_06722 == class_0672.llIIIlllIlllIlIllIIIIllIl;
    }

    public class_1076 IlIIIIIllllllIIlllIllllll() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }
}

