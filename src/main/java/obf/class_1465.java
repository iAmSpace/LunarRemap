package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.concurrent.Callable;

class class_1465
implements Callable {
    final /* synthetic */ class_0220 lllIIIllIIIIlllIlIIllIIll;

    class_1465(class_0220 class_02202) {
        this.lllIIIllIIIIlllIlIIllIIll = class_02202;
    }

    public String lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl.profilingEnabled ? this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl.getNameOfLastSection() : "N/A (disabled)";
    }

    public /* synthetic */ Object call() {
        return this.lllIIIllIIIIlllIlIIllIIll();
    }
}

