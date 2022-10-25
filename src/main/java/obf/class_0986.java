package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.crash.CrashReport;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.util.List;
import java.util.concurrent.Callable;

class class_0986
implements Callable {
    final /* synthetic */ CrashReport lllIIIllIIIIlllIlIIllIIll;

    class_0986(CrashReport class_02232) {
        this.lllIIIllIIIIlllIlIIllIIll = class_02232;
    }

    public String lllIIIllIIIIlllIlIIllIIll() {
        RuntimeMXBean runtimeMXBean = ManagementFactory.getRuntimeMXBean();
        List<String> list = runtimeMXBean.getInputArguments();
        int n = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (String string : list) {
            if (!string.startsWith("-X")) continue;
            if (n++ > 0) {
                stringBuilder.append(" ");
            }
            stringBuilder.append(string);
        }
        return String.format("%d total; %s", n, stringBuilder.toString());
    }

    public /* synthetic */ Object call() {
        return this.lllIIIllIIIIlllIlIIllIIll();
    }
}

