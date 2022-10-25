package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;

import java.util.concurrent.Callable;

class class_2214
implements Callable {
    final /* synthetic */ class_1774 lllIIIllIIIIlllIlIIllIIll;

    class_2214(class_1774 class_17742) {
        this.lllIIIllIIIIlllIlIIllIIll = class_17742;
    }

    public String lllIIIllIIIIlllIlIIllIIll() {
        int n = Block.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll.a_(this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl, this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl, this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII));
        try {
            return String.format("ID #%d (%s // %s)", n, Block.lllIIIllIIIIlllIlIIllIIll(n).IllIIIIllIIllIllIlllIlIIl(), Block.lllIIIllIIIIlllIlIIllIIll(n).getClass().getCanonicalName());
        }
        catch (Throwable throwable) {
            return "ID #" + n;
        }
    }

    public /* synthetic */ Object call() {
        return this.lllIIIllIIIIlllIlIIllIIll();
    }
}

