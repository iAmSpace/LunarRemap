package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;

import java.util.concurrent.Callable;

class class_1523
implements Callable {
    final /* synthetic */ Block lllIIIllIIIIlllIlIIllIIll;
    final /* synthetic */ class_1334 lllIlIIlIIIlIlIIIllIlllIl;

    class_1523(class_1334 class_13342, Block class_05492) {
        this.lllIlIIlIIIlIlIIIllIlllIl = class_13342;
        this.lllIIIllIIIIlllIlIIllIIll = class_05492;
    }

    public String lllIIIllIIIIlllIlIIllIIll() {
        try {
            return String.format("ID #%d (%s // %s)", Block.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll), this.lllIIIllIIIIlllIlIIllIIll.IllIIIIllIIllIllIlllIlIIl(), this.lllIIIllIIIIlllIlIIllIIll.getClass().getCanonicalName());
        }
        catch (Throwable throwable) {
            return "ID #" + Block.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll);
        }
    }

    public /* synthetic */ Object call() {
        return this.lllIIIllIIIIlllIlIIllIIll();
    }
}

