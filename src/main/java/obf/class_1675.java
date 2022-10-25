package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  com.google.common.collect.Iterables
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.Unpooled
 *  io.netty.channel.ChannelFutureListener
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.SimpleChannelInboundHandler
 *  io.netty.util.concurrent.GenericFutureListener
 */
import com.google.common.base.Charsets;
import com.google.common.collect.Iterables;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.util.concurrent.GenericFutureListener;
import net.minecraft.util.MathHelper;

class class_1675
extends SimpleChannelInboundHandler {
    final /* synthetic */ class_0434 lllIIIllIIIIlllIlIIllIIll;

    class_1675(class_0434 class_04342) {
        this.lllIIIllIIIIlllIlIIllIIll = class_04342;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void channelActive(ChannelHandlerContext channelHandlerContext) {
        super.channelActive(channelHandlerContext);
        ByteBuf byteBuf = Unpooled.buffer();
        try {
            char c;
            int n;
            byteBuf.writeByte(254);
            byteBuf.writeByte(1);
            byteBuf.writeByte(250);
            char[] arrc = "MC|PingHost".toCharArray();
            byteBuf.writeShort(arrc.length);
            char[] arrc2 = arrc;
            int n2 = arrc.length;
            for (n = 0; n < n2; ++n) {
                c = arrc2[n];
                byteBuf.writeChar((int)c);
            }
            byteBuf.writeShort(7 + 2 * this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll().length());
            byteBuf.writeByte(127);
            arrc = this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll().toCharArray();
            byteBuf.writeShort(arrc.length);
            arrc2 = arrc;
            n2 = arrc.length;
            for (n = 0; n < n2; ++n) {
                c = arrc2[n];
                byteBuf.writeChar((int)c);
            }
            byteBuf.writeInt(this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl());
            channelHandlerContext.channel().writeAndFlush((Object)byteBuf).addListener((GenericFutureListener)ChannelFutureListener.CLOSE_ON_FAILURE);
        }
        finally {
            byteBuf.release();
        }
    }

    protected void lllIIIllIIIIlllIlIIllIIll(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf) {
        short s = byteBuf.readUnsignedByte();
        if (s == 255) {
            String string = new String(byteBuf.readBytes(byteBuf.readShort() * 2).array(), Charsets.UTF_16BE);
            String[] arrstring = (String[])Iterables.toArray((Iterable)class_2245.lIlllIlllIIIIlIIlllIllIII().split((CharSequence)string), String.class);
            if ("\u00a71".equals(arrstring[0])) {
                int n = MathHelper.lllIIIllIIIIlllIlIIllIIll(arrstring[1], 0);
                String string2 = arrstring[2];
                String string3 = arrstring[3];
                int n2 = MathHelper.lllIIIllIIIIlllIlIIllIIll(arrstring[4], -1);
                int n3 = MathHelper.lllIIIllIIIIlllIlIIllIIll(arrstring[5], -1);
                this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl.IllIIlllllllIIlIIlIIIIlIl = -1;
                this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl.IIIllIllIIlIlIlIlIllllIIl = string2;
                this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl.lIllllIIlIIIlIllllllIIIll = string3;
                this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl.IlIllllllIIlIIllllIIlIIIl = (Object)((Object)class_1227.IllIIlllllllIIlIIlIIIIlIl) + "" + n2 + "" + (Object)((Object)class_1227.IIIllIllIIlIlIlIlIllllIIl) + "/" + (Object)((Object)class_1227.IllIIlllllllIIlIIlIIIIlIl) + n3;
            }
        }
        channelHandlerContext.close();
    }

    public void exceptionCaught(ChannelHandlerContext channelHandlerContext, Throwable throwable) {
        channelHandlerContext.close();
    }

    protected void channelRead0(ChannelHandlerContext channelHandlerContext, Object object) {
        this.lllIIIllIIIIlllIlIIllIIll(channelHandlerContext, (ByteBuf)object);
    }
}

