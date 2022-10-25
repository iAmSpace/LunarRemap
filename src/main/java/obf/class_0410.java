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

class class_0410
extends ChannelInitializer {
    final /* synthetic */ class_0267 lllIIIllIIIIlllIlIIllIIll;

    class_0410(class_0267 class_02672) {
        this.lllIIIllIIIIlllIlIIllIIll = class_02672;
    }

    protected void initChannel(Channel channel) {
        try {
            channel.config().setOption(ChannelOption.TCP_NODELAY, (Object)true);
        }
        catch (ChannelException channelException) {
            // empty catch block
        }
        channel.pipeline().addLast("timeout", (ChannelHandler)new ReadTimeoutHandler(30)).addLast("legacy_query", (ChannelHandler)new class_1404(this.lllIIIllIIIIlllIlIIllIIll)).addLast("splitter", (ChannelHandler)new class_1538()).addLast("decoder", (ChannelHandler)new class_1668(class_0800.IllIIlllllllIIlIIlIIIIlIl)).addLast("prepender", (ChannelHandler)new class_0406()).addLast("encoder", (ChannelHandler)new class_0701(class_0800.IllIIlllllllIIlIIlIIIIlIl));
        class_0800 class_08002 = new class_0800(false);
        class_0267.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll).add(class_08002);
        channel.pipeline().addLast("packet_handler", (ChannelHandler)class_08002);
        class_08002.lllIIIllIIIIlllIlIIllIIll(new class_1545(class_0267.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll), class_08002));
    }
}

