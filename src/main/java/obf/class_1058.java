package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.concurrent.Callable;

class class_1058
implements Callable {
    final /* synthetic */ class_1774 lllIIIllIIIIlllIlIIllIIll;

    class_1058(class_1774 class_17742) {
        this.lllIIIllIIIIlllIlIIllIIll = class_17742;
    }

    public String lllIIIllIIIIlllIlIIllIIll() {
        int n = this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl(this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl, this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl, this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII);
        if (n < 0) {
            return "Unknown? (Got " + n + ")";
        }
        String string = String.format("%4s", Integer.toBinaryString(n)).replace(" ", "0");
        return String.format("%1$d / 0x%1$X / 0b%2$s", n, string);
    }

    public /* synthetic */ Object call() {
        return this.lllIIIllIIIIlllIlIIllIIll();
    }
}

