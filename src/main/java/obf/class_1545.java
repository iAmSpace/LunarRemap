package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  io.netty.util.concurrent.GenericFutureListener
 */
import io.netty.util.concurrent.GenericFutureListener;
import net.minecraft.util.IChatComponent;

public class class_1545
implements class_2128 {
    private final class_0220 lllIIIllIIIIlllIlIIllIIll;
    private final class_0800 lllIlIIlIIIlIlIIIllIlllIl;

    public class_1545(class_0220 class_02202, class_0800 class_08002) {
        this.lllIIIllIIIIlllIlIIllIIll = class_02202;
        this.lllIlIIlIIIlIlIIIllIlllIl = class_08002;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0302 class_03022) {
        switch (class_03022.IlIllllllIIlIIllllIIlIIIl()) {
            case lIlllIlllIIIIlIIlllIllIII: {
                this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(class_0546.lIlllIlllIIIIlIIlllIllIII);
                if (class_03022.lIlllIlllIIIIlIIlllIllIII() > 5) {
                    class_0722 class_07222 = new class_0722("Outdated server! I'm still on 1.7.10");
                    this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(new class_0116(class_07222), new GenericFutureListener[0]);
                    this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(class_07222);
                    break;
                }
                if (class_03022.lIlllIlllIIIIlIIlllIllIII() < 5) {
                    class_0722 class_07223 = new class_0722("Outdated client! Please use 1.7.10");
                    this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(new class_0116(class_07223), new GenericFutureListener[0]);
                    this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(class_07223);
                    break;
                }
                this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(new class_0296(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl));
                break;
            }
            case IlIllllllIIlIIllllIIlIIIl: {
                this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(class_0546.IlIllllllIIlIIllllIIlIIIl);
                this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(new class_0199(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl));
                break;
            }
            default: {
                throw new UnsupportedOperationException("Invalid intention " + (Object)((Object)class_03022.IlIllllllIIlIIllllIIlIIIl()));
            }
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(IChatComponent class_22552) {
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0546 class_05462, class_0546 class_05463) {
        if (class_05463 != class_0546.lIlllIlllIIIIlIIlllIllIII && class_05463 != class_0546.IlIllllllIIlIIllllIIlIIIl) {
            throw new UnsupportedOperationException("Invalid state " + (Object)((Object)class_05463));
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll() {
    }
}

