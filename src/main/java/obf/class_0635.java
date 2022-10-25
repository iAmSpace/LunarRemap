package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.crash.CrashReport;

import java.util.concurrent.Callable;

class class_0635
implements Callable {
    final /* synthetic */ CrashReport lllIIIllIIIIlllIlIIllIIll;

    class_0635(CrashReport class_02232) {
        this.lllIIIllIIIIlllIlIIllIIll = class_02232;
    }

    public String lllIIIllIIIIlllIlIIllIIll() {
        return System.getProperty("os.name") + " (" + System.getProperty("os.arch") + ") version " + System.getProperty("os.version");
    }

    public /* synthetic */ Object call() {
        return this.lllIIIllIIIIlllIlIIllIIll();
    }
}

