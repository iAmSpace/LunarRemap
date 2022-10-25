package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  io.netty.util.concurrent.Future
 *  io.netty.util.concurrent.GenericFutureListener
 */
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;

class class_1559
implements GenericFutureListener {
    final /* synthetic */ class_0722 lllIIIllIIIIlllIlIIllIIll;
    final /* synthetic */ class_0634 lllIlIIlIIIlIlIIIllIlllIl;

    class_1559(class_0634 class_06342, class_0722 class_07222) {
        this.lllIlIIlIIIlIlIIIllIlllIl = class_06342;
        this.lllIIIllIIIIlllIlIIllIIll = class_07222;
    }

    public void operationComplete(Future future) {
        this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll);
    }
}

