package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.concurrent.Callable;

class class_1629
implements Callable {
    final /* synthetic */ int lllIIIllIIIIlllIlIIllIIll;
    final /* synthetic */ int lllIlIIlIIIlIlIIIllIlllIl;
    final /* synthetic */ class_1340 IlIllllllIIlIIllllIIlIIIl;

    class_1629(class_1340 class_13402, int n, int n2) {
        this.IlIllllllIIlIIllllIIlIIIl = class_13402;
        this.lllIIIllIIIIlllIlIIllIIll = n;
        this.lllIlIIlIIIlIlIIIllIlllIl = n2;
    }

    public String lllIIIllIIIIlllIlIIllIIll() {
        return this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl) ? "True" : "False";
    }

    public /* synthetic */ Object call() {
        return this.lllIIIllIIIIlllIlIIllIIll();
    }
}

