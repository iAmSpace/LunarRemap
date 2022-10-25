package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.ChannelInboundHandlerAdapter
 */
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import net.minecraft.client.Minecraft;
import net.minecraft.network.play.client.C17PacketCustomPayload;
import net.minecraft.network.play.server.S3FPacketCustomPayload;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class class_2168
extends ChannelInboundHandlerAdapter {
    private final class_1991 lllIIIllIIIIlllIlIIllIIll;
    private long lllIlIIlIIIlIlIIIllIlllIl = System.nanoTime() - 30000000000L;
    private final Minecraft IlIllllllIIlIIllllIIlIIIl = Minecraft.getMinecraft();
    private long lIlllIlllIIIIlIIlllIllIII = 0L;

    public class_2168(class_1991 class_19912) {
        this.lllIIIllIIIIlllIlIIllIIll = class_19912;
    }

    public void channelRead(ChannelHandlerContext channelHandlerContext, Object object) {
        S3FPacketCustomPayload class_11472;
        if (object instanceof S3FPacketCustomPayload && (class_11472 = (S3FPacketCustomPayload)object).IlIllllllIIlIIllllIIlIIIl().equals("LC|PING")) {
            this.lllIlIIlIIIlIlIIIllIlllIl = System.nanoTime();
            long l = (long)new DataInputStream(new ByteArrayInputStream(class_11472.lIlllIlllIIIIlIIlllIllIII())).readInt() & 0xFFFFFFFFL;
            if (l != this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll()) {
                throw new IOException("LC Protocol Error 4\n(Try updating your client)");
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.write(class_11472.lIlllIlllIIIIlIIlllIllIII());
                if ((this.lIlllIlllIIIIlIIlllIllIII++ & 7L) == 0L) {
                    dataOutputStream.writeLong(this.lIlllIlllIIIIlIIlllIllIII);
                    dataOutputStream.writeUTF(this.IlIllllllIIlIIllllIIlIIIl.IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl);
                    dataOutputStream.writeUTF(this.IlIllllllIIlIIllllIIlIIIl.getSession().getPlayerID());
                    dataOutputStream.writeUTF(this.IlIllllllIIlIIllllIIlIIIl.lIIlIIIIIlIlllIlIIlIlIlll.getClass().getName());
                }
            }
            catch (IOException iOException) {
                // empty catch block
            }
            channelHandlerContext.channel().eventLoop().execute(() -> channelHandlerContext.channel().writeAndFlush((Object)new C17PacketCustomPayload("LC|PONG", byteArrayOutputStream.toByteArray())));
        }
        if (System.nanoTime() - this.lllIlIIlIIIlIlIIIllIlllIl > 45000000000L) {
            throw new IOException("LC Protocol Error 5\n(Try updating your client)");
        }
        super.channelRead(channelHandlerContext, object);
    }
}

