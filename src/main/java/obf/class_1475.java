package obf;

import optifine.Config;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1475 {
    private class_1519[] lllIIIllIIIIlllIlIIllIIll = new class_1519[0];

    public void lllIIIllIIIIlllIlIIllIIll(class_1519 class_15192) {
        this.lllIIIllIIIIlllIlIIllIIll = (class_1519[]) Config.lllIIIllIIIIlllIlIIllIIll((Object[])this.lllIIIllIIIIlllIlIIllIIll, (Object)class_15192);
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(int n) {
        for (int i = 0; i < this.lllIIIllIIIIlllIlIIllIIll.length; ++i) {
            class_1519 class_15192 = this.lllIIIllIIIIlllIlIIllIIll[i];
            if (!class_15192.lllIIIllIIIIlllIlIIllIIll(n)) continue;
            return true;
        }
        return false;
    }

    public int lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIIIllIIIIlllIlIIllIIll.length;
    }

    public class_1519 lllIlIIlIIIlIlIIIllIlllIl(int n) {
        return this.lllIIIllIIIIlllIlIIllIIll[n];
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        for (int i = 0; i < this.lllIIIllIIIIlllIlIIllIIll.length; ++i) {
            class_1519 class_15192 = this.lllIIIllIIIIlllIlIIllIIll[i];
            if (i > 0) {
                stringBuffer.append(", ");
            }
            stringBuffer.append(class_15192.toString());
        }
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}

