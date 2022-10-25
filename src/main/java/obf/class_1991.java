package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.ChannelInboundHandlerAdapter
 */
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import javax.crypto.SecretKey;

public class class_1991
extends ChannelInboundHandlerAdapter {
    private long lllIIIllIIIIlllIlIIllIIll = 1L;
    private long lllIlIIlIIIlIlIIIllIlllIl = 0L;
    private long IlIllllllIIlIIllllIIlIIIl;
    private long lIlllIlllIIIIlIIlllIllIII;
    private final byte[] IlIIIIIllllllIIlllIllllll = class_1980.lllIIIllIIIIlllIlIIllIIll;

    public class_1991(SecretKey secretKey) {
        for (byte by : secretKey.getEncoded()) {
            this.lllIIIllIIIIlllIlIIllIIll = (this.lllIIIllIIIIlllIlIIllIIll + (long)(by & 0xFF)) % 65521L;
            this.lllIlIIlIIIlIlIIIllIlllIl = (this.lllIlIIlIIIlIlIIIllIlllIl + this.lllIIIllIIIIlllIlIIllIIll) % 65521L;
        }
    }

    public void channelRead(ChannelHandlerContext channelHandlerContext, Object object) {
        ByteBuf byteBuf = (ByteBuf)object;
        while (byteBuf.readableBytes() > 0) {
            int n = byteBuf.readByte() & 0xFF;
            this.lllIIIllIIIIlllIlIIllIIll = (this.lllIIIllIIIIlllIlIIllIIll + (long)n) % 65521L;
            this.lllIlIIlIIIlIlIIIllIlllIl = (this.lllIlIIlIIIlIlIIIllIlllIl + this.lllIIIllIIIIlllIlIIllIIll) % 65521L;
        }
        byteBuf.readerIndex(0);
        for (byte by : this.IlIIIIIllllllIIlllIllllll) {
            this.lllIIIllIIIIlllIlIIllIIll = (this.lllIIIllIIIIlllIlIIllIIll + (long)(by & 0xFF)) % 65521L;
            this.lllIlIIlIIIlIlIIIllIlllIl = (this.lllIlIIlIIIlIlIIIllIlllIl + this.lllIIIllIIIIlllIlIIllIIll) % 65521L;
        }
        this.IlIllllllIIlIIllllIIlIIIl = this.lIlllIlllIIIIlIIlllIllIII;
        this.lIlllIlllIIIIlIIlllIllIII = this.lllIlIIlIIIlIlIIIllIlllIl << 16 | this.lllIIIllIIIIlllIlIIllIIll;
        super.channelRead(channelHandlerContext, object);
    }

    public long lllIIIllIIIIlllIlIIllIIll() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }
}

