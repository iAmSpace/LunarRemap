package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.concurrent.Callable;

class class_1133
implements Callable {
    final /* synthetic */ class_0220 lllIIIllIIIIlllIlIIllIIll;

    class_1133(class_0220 class_02202) {
        this.lllIIIllIIIIlllIlIIllIIll = class_02202;
    }

    public String lllIIIllIIIIlllIlIIllIIll() {
        int n = 0;
        int n2 = 56 * n;
        int n3 = n2 / 1024 / 1024;
        int n4 = 0;
        int n5 = 56 * n4;
        int n6 = n5 / 1024 / 1024;
        return n + " (" + n2 + " bytes; " + n3 + " MB) allocated, " + n4 + " (" + n5 + " bytes; " + n6 + " MB) used";
    }

    public /* synthetic */ Object call() {
        return this.lllIIIllIIIIlllIlIIllIIll();
    }
}

