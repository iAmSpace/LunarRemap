package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.crash.CrashReport;

import java.util.concurrent.Callable;

class class_1068
implements Callable {
    final /* synthetic */ CrashReport lllIIIllIIIIlllIlIIllIIll;

    class_1068(CrashReport class_02232) {
        this.lllIIIllIIIIlllIlIIllIIll = class_02232;
    }

    public String lllIIIllIIIIlllIlIIllIIll() {
        Runtime runtime = Runtime.getRuntime();
        long l = runtime.maxMemory();
        long l2 = runtime.totalMemory();
        long l3 = runtime.freeMemory();
        long l4 = l / 1024L / 1024L;
        long l5 = l2 / 1024L / 1024L;
        long l6 = l3 / 1024L / 1024L;
        return l3 + " bytes (" + l6 + " MB) / " + l2 + " bytes (" + l5 + " MB) up to " + l + " bytes (" + l4 + " MB)";
    }

    public /* synthetic */ Object call() {
        return this.lllIIIllIIIIlllIlIIllIIll();
    }
}

