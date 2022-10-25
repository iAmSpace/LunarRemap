package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandlerContext
 */
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import javax.crypto.Cipher;

public class class_1072 {
    private final Cipher lllIIIllIIIIlllIlIIllIIll;
    private byte[] lllIlIIlIIIlIlIIIllIlllIl = new byte[0];
    private byte[] IlIllllllIIlIIllllIIlIIIl = new byte[0];

    protected class_1072(Cipher cipher) {
        this.lllIIIllIIIIlllIlIIllIIll = cipher;
    }

    private byte[] lllIIIllIIIIlllIlIIllIIll(ByteBuf byteBuf) {
        int n = byteBuf.readableBytes();
        if (this.lllIlIIlIIIlIlIIIllIlllIl.length < n) {
            this.lllIlIIlIIIlIlIIIllIlllIl = new byte[n];
        }
        byteBuf.readBytes(this.lllIlIIlIIIlIlIIIllIlllIl, 0, n);
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    protected ByteBuf lllIIIllIIIIlllIlIIllIIll(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf) {
        int n = byteBuf.readableBytes();
        byte[] arrby = this.lllIIIllIIIIlllIlIIllIIll(byteBuf);
        ByteBuf byteBuf2 = channelHandlerContext.alloc().heapBuffer(this.lllIIIllIIIIlllIlIIllIIll.getOutputSize(n));
        byteBuf2.writerIndex(this.lllIIIllIIIIlllIlIIllIIll.update(arrby, 0, n, byteBuf2.array(), byteBuf2.arrayOffset()));
        return byteBuf2;
    }

    protected void lllIIIllIIIIlllIlIIllIIll(ByteBuf byteBuf, ByteBuf byteBuf2) {
        int n = byteBuf.readableBytes();
        byte[] arrby = this.lllIIIllIIIIlllIlIIllIIll(byteBuf);
        int n2 = this.lllIIIllIIIIlllIlIIllIIll.getOutputSize(n);
        if (this.IlIllllllIIlIIllllIIlIIIl.length < n2) {
            this.IlIllllllIIlIIllllIIlIIIl = new byte[n2];
        }
        byteBuf2.writeBytes(this.IlIllllllIIlIIllllIIlIIIl, 0, this.lllIIIllIIIIlllIlIIllIIll.update(arrby, 0, n, this.IlIllllllIIlIIllllIIlIIIl));
    }
}

