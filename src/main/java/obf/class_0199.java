package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  io.netty.util.concurrent.GenericFutureListener
 */
import io.netty.util.concurrent.GenericFutureListener;
import net.minecraft.util.IChatComponent;

public class class_0199
implements class_0367 {
    private final class_0220 lllIIIllIIIIlllIlIIllIIll;
    private final class_0800 lllIlIIlIIIlIlIIIllIlllIl;

    public class_0199(class_0220 class_02202, class_0800 class_08002) {
        this.lllIIIllIIIIlllIlIIllIIll = class_02202;
        this.lllIlIIlIIIlIlIIIllIlllIl = class_08002;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(IChatComponent class_22552) {
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0546 class_05462, class_0546 class_05463) {
        if (class_05463 != class_0546.IlIllllllIIlIIllllIIlIIIl) {
            throw new UnsupportedOperationException("Unexpected change in protocol to " + (Object)((Object)class_05463));
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll() {
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1723 class_17232) {
        this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(new class_0046(this.lllIIIllIIIIlllIlIIllIIll.lIlIIllIllIIIIIlIllllIIIl()), new GenericFutureListener[0]);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1894 class_18942) {
        this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(new class_1714(class_18942.IlIllllllIIlIIllllIIlIIIl()), new GenericFutureListener[0]);
    }
}

