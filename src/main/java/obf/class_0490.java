package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.MessageToMessageDecoder
 */
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;
import java.util.List;
import javax.crypto.Cipher;

public class class_0490
extends MessageToMessageDecoder {
    private final class_1072 lllIIIllIIIIlllIlIIllIIll;

    public class_0490(Cipher cipher) {
        this.lllIIIllIIIIlllIlIIllIIll = new class_1072(cipher);
    }

    protected void lllIIIllIIIIlllIlIIllIIll(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List list) {
        list.add(this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(channelHandlerContext, byteBuf));
    }

    protected void decode(ChannelHandlerContext channelHandlerContext, Object object, List list) {
        this.lllIIIllIIIIlllIlIIllIIll(channelHandlerContext, (ByteBuf)object, list);
    }
}

