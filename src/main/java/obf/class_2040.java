package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.ChannelOutboundHandlerAdapter
 *  io.netty.channel.ChannelPromise
 */
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelOutboundHandlerAdapter;
import io.netty.channel.ChannelPromise;
import javax.crypto.SecretKey;

public class class_2040
extends ChannelOutboundHandlerAdapter {
    private long lllIIIllIIIIlllIlIIllIIll = 1L;
    private long lllIlIIlIIIlIlIIIllIlllIl = 0L;
    private long IlIllllllIIlIIllllIIlIIIl;
    private final byte[] lIlllIlllIIIIlIIlllIllIII = class_1980.lllIlIIlIIIlIlIIIllIlllIl;

    public class_2040(SecretKey secretKey) {
        for (byte by : secretKey.getEncoded()) {
            this.lllIIIllIIIIlllIlIIllIIll = (this.lllIIIllIIIIlllIlIIllIIll + (long)(by & 0xFF)) % 65521L;
            this.lllIlIIlIIIlIlIIIllIlllIl = (this.lllIlIIlIIIlIlIIIllIlllIl + this.lllIIIllIIIIlllIlIIllIIll) % 65521L;
        }
    }

    public void write(ChannelHandlerContext channelHandlerContext, Object object, ChannelPromise channelPromise) {
        ByteBuf byteBuf = (ByteBuf)object;
        while (byteBuf.readableBytes() > 0) {
            int n = byteBuf.readByte() & 0xFF;
            this.lllIIIllIIIIlllIlIIllIIll = (this.lllIIIllIIIIlllIlIIllIIll + (long)n) % 65521L;
            this.lllIlIIlIIIlIlIIIllIlllIl = (this.lllIlIIlIIIlIlIIIllIlllIl + this.lllIIIllIIIIlllIlIIllIIll) % 65521L;
        }
        byteBuf.readerIndex(0);
        for (byte by : this.lIlllIlllIIIIlIIlllIllIII) {
            this.lllIIIllIIIIlllIlIIllIIll = (this.lllIIIllIIIIlllIlIIllIIll + (long)(by & 0xFF)) % 65521L;
            this.lllIlIIlIIIlIlIIIllIlllIl = (this.lllIlIIlIIIlIlIIIllIlllIl + this.lllIIIllIIIIlllIlIIllIIll) % 65521L;
        }
        this.IlIllllllIIlIIllllIIlIIIl = this.lllIlIIlIIIlIlIIIllIlllIl << 16 | this.lllIIIllIIIIlllIlIIllIIll;
        super.write(channelHandlerContext, object, channelPromise);
    }

    public long lllIIIllIIIIlllIlIIllIIll() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }
}

