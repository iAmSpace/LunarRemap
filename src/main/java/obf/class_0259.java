package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.concurrent.Callable;

class class_0259
implements Callable {
    final /* synthetic */ int[][] lllIIIllIIIIlllIlIIllIIll;
    final /* synthetic */ class_1585 lllIlIIlIIIlIlIIIllIlllIl;

    class_0259(class_1585 class_15852, int[][] arrn) {
        this.lllIlIIlIIIlIlIIIllIlllIl = class_15852;
        this.lllIIIllIIIIlllIlIIllIIll = arrn;
    }

    public String lllIIIllIIIIlllIlIIllIIll() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int[] arrn : this.lllIIIllIIIIlllIlIIllIIll) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(arrn == null ? "null" : Integer.valueOf(arrn.length));
        }
        return stringBuilder.toString();
    }

    public /* synthetic */ Object call() {
        return this.lllIIIllIIIIlllIlIIllIIll();
    }
}

