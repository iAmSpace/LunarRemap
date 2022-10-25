package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;
import java.util.List;

public class class_0404
extends class_0703 {
    private double lllIIIllIIIIlllIlIIllIIll;
    private double lllIlIIlIIIlIlIIIllIlllIl;
    private double IlIllllllIIlIIllllIIlIIIl;
    private float lIlllIlllIIIIlIIlllIllIII;
    private List IlIIIIIllllllIIlllIllllll;
    private float lIllllIIlIIIlIllllllIIIll;
    private float IIIllIIlIIIIIIlIlIIllIIlI;
    private float IllIIlllllllIIlIIlIIIIlIl;

    public class_0404() {
    }

    public class_0404(double d, double d2, double d3, float f, List list, class_0864 class_08642) {
        this.lllIIIllIIIIlllIlIIllIIll = d;
        this.lllIlIIlIIIlIlIIIllIlllIl = d2;
        this.IlIllllllIIlIIllllIIlIIIl = d3;
        this.lIlllIlllIIIIlIIlllIllIII = f;
        this.IlIIIIIllllllIIlllIllllll = new ArrayList(list);
        if (class_08642 != null) {
            this.lIllllIIlIIIlIllllllIIIll = (float)class_08642.lllIIIllIIIIlllIlIIllIIll;
            this.IIIllIIlIIIIIIlIlIIllIIlI = (float)class_08642.lllIlIIlIIIlIlIIIllIlllIl;
            this.IllIIlllllllIIlIIlIIIIlIl = (float)class_08642.IlIllllllIIlIIllllIIlIIIl;
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0181 class_01812) {
        this.lllIIIllIIIIlllIlIIllIIll = class_01812.readFloat();
        this.lllIlIIlIIIlIlIIIllIlllIl = class_01812.readFloat();
        this.IlIllllllIIlIIllllIIlIIIl = class_01812.readFloat();
        this.lIlllIlllIIIIlIIlllIllIII = class_01812.readFloat();
        int n = class_01812.readInt();
        this.IlIIIIIllllllIIlllIllllll = new ArrayList(n);
        int n2 = (int)this.lllIIIllIIIIlllIlIIllIIll;
        int n3 = (int)this.lllIlIIlIIIlIlIIIllIlllIl;
        int n4 = (int)this.IlIllllllIIlIIllllIIlIIIl;
        for (int i = 0; i < n; ++i) {
            int n5 = class_01812.readByte() + n2;
            int n6 = class_01812.readByte() + n3;
            int n7 = class_01812.readByte() + n4;
            this.IlIIIIIllllllIIlllIllllll.add(new class_2137(n5, n6, n7));
        }
        this.lIllllIIlIIIlIllllllIIIll = class_01812.readFloat();
        this.IIIllIIlIIIIIIlIlIIllIIlI = class_01812.readFloat();
        this.IllIIlllllllIIlIIlIIIIlIl = class_01812.readFloat();
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0181 class_01812) {
        class_01812.writeFloat((float)this.lllIIIllIIIIlllIlIIllIIll);
        class_01812.writeFloat((float)this.lllIlIIlIIIlIlIIIllIlllIl);
        class_01812.writeFloat((float)this.IlIllllllIIlIIllllIIlIIIl);
        class_01812.writeFloat(this.lIlllIlllIIIIlIIlllIllIII);
        class_01812.writeInt(this.IlIIIIIllllllIIlllIllllll.size());
        int n = (int)this.lllIIIllIIIIlllIlIIllIIll;
        int n2 = (int)this.lllIlIIlIIIlIlIIIllIlllIl;
        int n3 = (int)this.IlIllllllIIlIIllllIIlIIIl;
        for (class_2137 class_21372 : this.IlIIIIIllllllIIlllIllllll) {
            int n4 = class_21372.lllIIIllIIIIlllIlIIllIIll - n;
            int n5 = class_21372.lllIlIIlIIIlIlIIIllIlllIl - n2;
            int n6 = class_21372.IlIllllllIIlIIllllIIlIIIl - n3;
            class_01812.writeByte(n4);
            class_01812.writeByte(n5);
            class_01812.writeByte(n6);
        }
        class_01812.writeFloat(this.lIllllIIlIIIlIllllllIIIll);
        class_01812.writeFloat(this.IIIllIIlIIIIIIlIlIIllIIlI);
        class_01812.writeFloat(this.IllIIlllllllIIlIIlIIIIlIl);
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0596 class_05962) {
        class_05962.lllIIIllIIIIlllIlIIllIIll(this);
    }

    public float IlIllllllIIlIIllllIIlIIIl() {
        return this.lIllllIIlIIIlIllllllIIIll;
    }

    public float lIlllIlllIIIIlIIlllIllIII() {
        return this.IIIllIIlIIIIIIlIlIIllIIlI;
    }

    public float IlIIIIIllllllIIlllIllllll() {
        return this.IllIIlllllllIIlIIlIIIIlIl;
    }

    public double lIllllIIlIIIlIllllllIIIll() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public double IIIllIIlIIIIIIlIlIIllIIlI() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public double IllIIlllllllIIlIIlIIIIlIl() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public float IIIllIllIIlIlIlIlIllllIIl() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    public List IllIIIllIIIIlIlIlIllIIlll() {
        return this.IlIIIIIllllllIIlllIllllll;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_2075 class_20752) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0596)class_20752);
    }
}

