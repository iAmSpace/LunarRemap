package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  io.netty.channel.ChannelFutureListener
 *  io.netty.util.concurrent.GenericFutureListener
 */
import io.netty.channel.ChannelFutureListener;
import io.netty.util.concurrent.GenericFutureListener;
import net.minecraft.network.Packet;

class class_1718
implements Runnable {
    final /* synthetic */ EnumConnectionState lllIIIllIIIIlllIlIIllIIll;
    final /* synthetic */ EnumConnectionState lllIlIIlIIIlIlIIIllIlllIl;
    final /* synthetic */ Packet IlIllllllIIlIIllllIIlIIIl;
    final /* synthetic */ GenericFutureListener[] lIlllIlllIIIIlIIlllIllIII;
    final /* synthetic */ class_0800 IlIIIIIllllllIIlllIllllll;

    class_1718(class_0800 class_08002, EnumConnectionState class_05462, EnumConnectionState class_05463, Packet class_07032, GenericFutureListener[] arrgenericFutureListener) {
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

