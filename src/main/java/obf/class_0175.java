package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0175
extends class_0703 {
    private int[] lllIIIllIIIIlllIlIIllIIll;

    public class_0175() {
    }

    public class_0175(int ... arrn) {
        this.lllIIIllIIIIlllIlIIllIIll = arrn;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0181 class_01812) {
        this.lllIIIllIIIIlllIlIIllIIll = new int[class_01812.readByte()];
        for (int i = 0; i < this.lllIIIllIIIIlllIlIIllIIll.length; ++i) {
            this.lllIIIllIIIIlllIlIIllIIll[i] = class_01812.readInt();
        }
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0181 class_01812) {
        class_01812.writeByte(this.lllIIIllIIIIlllIlIIllIIll.length);
        for (int i = 0; i < this.lllIIIllIIIIlllIlIIllIIll.length; ++i) {
            class_01812.writeInt(this.lllIIIllIIIIlllIlIIllIIll[i]);
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0596 class_05962) {
        class_05962.lllIIIllIIIIlllIlIIllIIll(this);
    }

    @Override
    public String lllIlIIlIIIlIlIIIllIlllIl() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < this.lllIIIllIIIIlllIlIIllIIll.length; ++i) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(this.lllIIIllIIIIlllIlIIllIIll[i]);
        }
        return String.format("entities=%d[%s]", this.lllIIIllIIIIlllIlIIllIIll.length, stringBuilder);
    }

    public int[] IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_2075 class_20752) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0596)class_20752);
    }
}

