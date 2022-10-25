package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.MessageToByteEncoder
 */
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import javax.crypto.Cipher;

public class class_2121
extends MessageToByteEncoder {
    private final class_1072 lllIIIllIIIIlllIlIIllIIll;

    public class_2121(Cipher cipher) {
        this.lllIIIllIIIIlllIlIIllIIll = new class_1072(cipher);
    }

    protected void lllIIIllIIIIlllIlIIllIIll(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, ByteBuf byteBuf2) {
        this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(byteBuf, byteBuf2);
    }

    protected void encode(ChannelHandlerContext channelHandlerContext, Object object, ByteBuf byteBuf) {
        this.lllIIIllIIIIlllIlIIllIIll(channelHandlerContext, (ByteBuf)object, byteBuf);
    }
}

