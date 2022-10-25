package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  io.netty.util.concurrent.Future
 *  io.netty.util.concurrent.GenericFutureListener
 */
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;

class class_0521
implements GenericFutureListener {
    final /* synthetic */ class_0800 lllIIIllIIIIlllIlIIllIIll;
    final /* synthetic */ class_0722 lllIlIIlIIIlIlIIIllIlllIl;
    final /* synthetic */ class_0267 IlIllllllIIlIIllllIIlIIIl;

    class_0521(class_0267 class_02672, class_0800 class_08002, class_0722 class_07222) {
        this.IlIllllllIIlIIllllIIlIIIl = class_02672;
        this.lllIIIllIIIIlllIlIIllIIll = class_08002;
        this.lllIlIIlIIIlIlIIIllIlllIl = class_07222;
    }

    public void operationComplete(Future future) {
        this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl);
    }
}

