package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.concurrent.Callable;

class class_0290
implements Callable {
    final /* synthetic */ class_0321 lllIIIllIIIIlllIlIIllIIll;
    final /* synthetic */ class_0817 lllIlIIlIIIlIlIIIllIlllIl;

    class_0290(class_0817 class_08172, class_0321 class_03212) {
        this.lllIlIIlIIIlIlIIIllIlllIl = class_08172;
        this.lllIIIllIIIIlllIlIIllIIll = class_03212;
    }

    public String lllIIIllIIIIlllIlIIllIIll() {
        return String.format("Scaled: (%d, %d). Absolute: (%d, %d). Scale factor of %d", this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(), this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl(), class_0817.lllIIIllIIIIlllIlIIllIIll((class_0817)this.lllIlIIlIIIlIlIIIllIlllIl).displayWidth, class_0817.lllIIIllIIIIlllIlIIllIIll((class_0817)this.lllIlIIlIIIlIlIIIllIlllIl).displayHeight, this.lllIIIllIIIIlllIlIIllIIll.IlIIIIIllllllIIlllIllllll());
    }

    public /* synthetic */ Object call() {
        return this.lllIIIllIIIIlllIlIIllIIll();
    }
}

