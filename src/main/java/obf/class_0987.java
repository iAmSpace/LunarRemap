package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.crash.CrashReport;

import java.util.concurrent.Callable;

class class_0987
implements Callable {
    final /* synthetic */ CrashReport lllIIIllIIIIlllIlIIllIIll;

    class_0987(CrashReport class_02232) {
        this.lllIIIllIIIIlllIlIIllIIll = class_02232;
    }

    public String lllIIIllIIIIlllIlIIllIIll() {
        return System.getProperty("java.version") + ", " + System.getProperty("java.vendor");
    }

    public /* synthetic */ Object call() {
        return this.lllIIIllIIIIlllIlIIllIIll();
    }
}

