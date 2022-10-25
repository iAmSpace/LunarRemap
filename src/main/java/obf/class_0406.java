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

public class class_0406
extends MessageToByteEncoder {
    protected void lllIIIllIIIIlllIlIIllIIll(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, ByteBuf byteBuf2) {
        int n = byteBuf.readableBytes();
        int n2 = class_0181.lllIIIllIIIIlllIlIIllIIll(n);
        if (n2 > 3) {
            throw new IllegalArgumentException("unable to fit " + n + " into " + 3);
        }
        class_0181 class_01812 = new class_0181(byteBuf2);
        class_01812.ensureWritable(n2 + n);
        class_01812.lllIlIIlIIIlIlIIIllIlllIl(n);
        class_01812.writeBytes(byteBuf, byteBuf.readerIndex(), n);
    }

    protected void encode(ChannelHandlerContext channelHandlerContext, Object object, ByteBuf byteBuf) {
        this.lllIIIllIIIIlllIlIIllIIll(channelHandlerContext, (ByteBuf)object, byteBuf);
    }
}

