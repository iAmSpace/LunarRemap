package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelException
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelInitializer
 *  io.netty.channel.ChannelOption
 */
import io.netty.channel.Channel;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;

class class_0434
extends ChannelInitializer {
    final /* synthetic */ class_1408 lllIIIllIIIIlllIlIIllIIll;
    final /* synthetic */ class_1092 lllIlIIlIIIlIlIIIllIlllIl;
    final /* synthetic */ class_2245 IlIllllllIIlIIllllIIlIIIl;

    class_0434(class_2245 class_22452, class_1408 class_14082, class_1092 class_10922) {
        this.IlIllllllIIlIIllllIIlIIIl = class_22452;
        this.lllIIIllIIIIlllIlIIllIIll = class_14082;
        this.lllIlIIlIIIlIlIIIllIlllIl = class_10922;
    }

    protected void initChannel(Channel channel) {
        try {
            channel.config().setOption(ChannelOption.IP_TOS, (Object)24);
        }
        catch (ChannelException channelException) {
            // empty catch block
        }
        try {
            channel.config().setOption(ChannelOption.TCP_NODELAY, (Object)true);
        }
        catch (ChannelException channelException) {
            // empty catch block
        }
        channel.pipeline().addLast(new ChannelHandler[]{new class_1675(this)});
    }
}

