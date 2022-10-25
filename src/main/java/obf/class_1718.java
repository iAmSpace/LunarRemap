package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  io.netty.channel.ChannelFutureListener
 *  io.netty.util.concurrent.GenericFutureListener
 */
import io.netty.channel.ChannelFutureListener;
import io.netty.util.concurrent.GenericFutureListener;

class class_1718
implements Runnable {
    final /* synthetic */ class_0546 lllIIIllIIIIlllIlIIllIIll;
    final /* synthetic */ class_0546 lllIlIIlIIIlIlIIIllIlllIl;
    final /* synthetic */ class_0703 IlIllllllIIlIIllllIIlIIIl;
    final /* synthetic */ GenericFutureListener[] lIlllIlllIIIIlIIlllIllIII;
    final /* synthetic */ class_0800 IlIIIIIllllllIIlllIllllll;

    class_1718(class_0800 class_08002, class_0546 class_05462, class_0546 class_05463, class_0703 class_07032, GenericFutureListener[] arrgenericFutureListener) {
        this.IlIIIIIllllllIIlllIllllll = class_08002;
        this.lllIIIllIIIIlllIlIIllIIll = class_05462;
        this.lllIlIIlIIIlIlIIIllIlllIl = class_05463;
        this.IlIllllllIIlIIllllIIlIIIl = class_07032;
        this.lIlllIlllIIIIlIIlllIllIII = arrgenericFutureListener;
    }

    @Override
    public void run() {
        if (this.lllIIIllIIIIlllIlIIllIIll != this.lllIlIIlIIIlIlIIIllIlllIl) {
            this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll);
        }
        class_0800.lllIIIllIIIIlllIlIIllIIll(this.IlIIIIIllllllIIlllIllllll).writeAndFlush((Object)this.IlIllllllIIlIIllllIIlIIIl).addListeners(this.lIlllIlllIIIIlIIlllIllIII).addListener((GenericFutureListener)ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE);
    }
}

