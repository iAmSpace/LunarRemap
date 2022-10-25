package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelInitializer
 */
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;

final class class_1477
extends ChannelInitializer {
    final /* synthetic */ class_0800 lllIIIllIIIIlllIlIIllIIll;

    class_1477(class_0800 class_08002) {
        this.lllIIIllIIIIlllIlIIllIIll = class_08002;
    }

    protected void initChannel(Channel channel) {
        channel.pipeline().addLast("packet_handler", (ChannelHandler)this.lllIIIllIIIIlllIlIIllIIll);
    }
}

