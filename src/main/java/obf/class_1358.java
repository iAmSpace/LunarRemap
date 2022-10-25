package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.network.Packet;

import java.util.concurrent.Callable;

class class_1358
implements Callable {
    final /* synthetic */ Packet lllIIIllIIIIlllIlIIllIIll;
    final /* synthetic */ class_0634 lllIlIIlIIIlIlIIIllIlllIl;

    class_1358(class_0634 class_06342, Packet class_07032) {
        this.lllIlIIlIIIlIlIIIllIlllIl = class_06342;
        this.lllIIIllIIIIlllIlIIllIIll = class_07032;
    }

    public String lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIIIllIIIIlllIlIIllIIll.getClass().getCanonicalName();
    }

    public /* synthetic */ Object call() {
        return this.lllIIIllIIIIlllIlIIllIIll();
    }
}

