package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.concurrent.Callable;

class class_1428
implements Callable {
    final /* synthetic */ int lllIIIllIIIIlllIlIIllIIll;
    final /* synthetic */ class_1105 lllIlIIlIIIlIlIIIllIlllIl;

    class_1428(class_1105 class_11052, int n) {
        this.lllIlIIlIIIlIlIIIllIlllIl = class_11052;
        this.lllIIIllIIIIlllIlIIllIIll = n;
    }

    public String lllIIIllIIIIlllIlIIllIIll() {
        String string = "Once per " + this.lllIIIllIIIIlllIlIIllIIll + " ticks";
        if (this.lllIIIllIIIIlllIlIIllIIll == Integer.MAX_VALUE) {
            string = "Maximum (" + string + ")";
        }
        return string;
    }

    public /* synthetic */ Object call() {
        return this.lllIIIllIIIIlllIlIIllIIll();
    }
}

