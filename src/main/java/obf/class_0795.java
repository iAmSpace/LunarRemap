package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelException
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelInitializer
 *  io.netty.channel.ChannelOption
 *  io.netty.handler.timeout.ReadTimeoutHandler
 */
import io.netty.channel.Channel;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.handler.timeout.ReadTimeoutHandler;

final class class_0795
extends ChannelInitializer {
    final /* synthetic */ class_0800 lllIIIllIIIIlllIlIIllIIll;

    class_0795(class_0800 class_08002) {
        this.lllIIIllIIIIlllIlIIllIIll = class_08002;
    }

    protected void initChannel(Channel channel) {
        try {
            channel.config().setOption(ChannelOption.TCP_NODELAY, (Object)true);
        }
        catch (ChannelException channelException) {
            // empty catch block
        }
        channel.pipeline().addLast("timeout", (ChannelHandler)new ReadTimeoutHandler(20)).addLast("splitter", (ChannelHandler)new class_1538()).addLast("decoder", (ChannelHandler)new class_1668(class_0800.IllIIlllllllIIlIIlIIIIlIl)).addLast("prepender", (ChannelHandler)new class_0406()).addLast("encoder", (ChannelHandler)new class_0701(class_0800.IllIIlllllllIIlIIlIIIIlIl)).addLast("packet_handler", (ChannelHandler)this.lllIIIllIIIIlllIlIIllIIll);
    }
}

