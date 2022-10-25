package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.Unpooled
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.ByteToMessageDecoder
 *  io.netty.handler.codec.CorruptedFrameException
 */
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import io.netty.handler.codec.CorruptedFrameException;
import java.util.List;

public class class_1538
extends ByteToMessageDecoder {
    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List list) {
        byteBuf.markReaderIndex();
        byte[] arrby = new byte[3];
        for (int i = 0; i < arrby.length; ++i) {
            if (!byteBuf.isReadable()) {
                byteBuf.resetReaderIndex();
                return;
            }
            arrby[i] = byteBuf.readByte();
            if (arrby[i] < 0) continue;
            class_0181 class_01812 = new class_0181(Unpooled.wrappedBuffer((byte[])arrby));
            try {
                int n = class_01812.lllIIIllIIIIlllIlIIllIIll();
                if (byteBuf.readableBytes() >= n) {
                    list.add(byteBuf.readBytes(n));
                    return;
                }
                byteBuf.resetReaderIndex();
            }
            finally {
                class_01812.release();
            }
            return;
        }
        throw new CorruptedFrameException("length wider than 21-bit");
    }
}

