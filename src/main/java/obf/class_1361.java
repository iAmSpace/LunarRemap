package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;
import java.util.List;

public class class_1361
extends class_1340 {
    private List IlIIIIIllllllIIlllIllllll = new ArrayList();

    public class_1361() {
        this.IlIIIIIllllllIIlllIllllll.add(new class_0920(class_1819.class, 10, 2, 3));
        this.IlIIIIIllllllIIlllIllllll.add(new class_0920(class_1144.class, 5, 4, 4));
        this.IlIIIIIllllllIIlllIllllll.add(new class_0920(class_0630.class, 10, 4, 4));
        this.IlIIIIIllllllIIlllIllllll.add(new class_0920(class_0882.class, 3, 4, 4));
    }

    @Override
    public String lllIIIllIIIIlllIlIIllIIll() {
        return "Fortress";
    }

    public List v_() {
        return this.IlIIIIIllllllIIlllIllllll;
    }

    @Override
    protected boolean lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        int n3 = n >> 4;
        int n4 = n2 >> 4;
        this.lllIlIIlIIIlIlIIIllIlllIl.setSeed((long)(n3 ^ n4 << 4) ^ this.IlIllllllIIlIIllllIIlIIIl.lIlIlIIlIIIIlIIIIIlllIIII());
        this.lllIlIIlIIIlIlIIIllIlllIl.nextInt();
        return this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(3) != 0 ? false : (n != (n3 << 4) + 4 + this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(8) ? false : n2 == (n4 << 4) + 4 + this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(8));
    }

    @Override
    protected class_1099 lllIlIIlIIIlIlIIIllIlllIl(int n, int n2) {
        return new class_1385(this.IlIllllllIIlIIllllIIlIIIl, this.lllIlIIlIIIlIlIIIllIlllIl, n, n2);
    }
}

