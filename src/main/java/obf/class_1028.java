package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  io.netty.util.concurrent.Future
 *  io.netty.util.concurrent.GenericFutureListener
 */
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import javax.crypto.SecretKey;

class class_1028
implements GenericFutureListener {
    final /* synthetic */ SecretKey lllIIIllIIIIlllIlIIllIIll;
    final /* synthetic */ class_0188 lllIlIIlIIIlIlIIIllIlllIl;

    class_1028(class_0188 class_01882, SecretKey secretKey) {
        this.lllIlIIlIIIlIlIIIllIlllIl = class_01882;
        this.lllIIIllIIIIlllIlIIllIIll = secretKey;
    }

    public void operationComplete(Future future) {
        class_0188.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl).lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll);
    }
}

