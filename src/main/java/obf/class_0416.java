package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Mouse
 */
import java.util.concurrent.Callable;
import org.lwjgl.input.Mouse;

class class_0416
implements Callable {
    final /* synthetic */ int lllIIIllIIIIlllIlIIllIIll;
    final /* synthetic */ int lllIlIIlIIIlIlIIIllIlllIl;
    final /* synthetic */ class_0817 IlIllllllIIlIIllllIIlIIIl;

    class_0416(class_0817 class_08172, int n, int n2) {
        this.IlIllllllIIlIIllllIIlIIIl = class_08172;
        this.lllIIIllIIIIlllIlIIllIIll = n;
        this.lllIlIIlIIIlIlIIIllIlllIl = n2;
    }

    public String lllIIIllIIIIlllIlIIllIIll() {
        return String.format("Scaled: (%d, %d). Absolute: (%d, %d)", this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl, Mouse.getX(), Mouse.getY());
    }

    public /* synthetic */ Object call() {
        return this.lllIIIllIIIIlllIlIIllIIll();
    }
}

