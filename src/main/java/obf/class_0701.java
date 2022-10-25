package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.BiMap
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.MessageToByteEncoder
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.apache.logging.log4j.Marker
 *  org.apache.logging.log4j.MarkerManager
 */
import com.google.common.collect.BiMap;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import java.io.IOException;

import net.minecraft.network.Packet;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

public class class_0701
extends MessageToByteEncoder {
    private static final Logger lllIIIllIIIIlllIlIIllIIll = LogManager.getLogger();
    private static final Marker lllIlIIlIIIlIlIIIllIlllIl = MarkerManager.getMarker((String)"PACKET_SENT", (Marker)class_0800.lllIlIIlIIIlIlIIIllIlllIl);
    private final class_0670 IlIllllllIIlIIllllIIlIIIl;

    public class_0701(class_0670 class_06702) {
        this.IlIllllllIIlIIllllIIlIIIl = class_06702;
    }

    protected void lllIIIllIIIIlllIlIIllIIll(ChannelHandlerContext channelHandlerContext, Packet class_07032, ByteBuf byteBuf) {
        Integer n = (Integer)((BiMap)channelHandlerContext.channel().attr(class_0800.lIllllIIlIIIlIllllllIIIll).get()).inverse().get(class_07032.getClass());
        if (lllIIIllIIIIlllIlIIllIIll.isDebugEnabled()) {
            lllIIIllIIIIlllIlIIllIIll.debug(lllIlIIlIIIlIlIIIllIlllIl, "OUT: [{}:{}] {}[{}]", new Object[]{channelHandlerContext.channel().attr(class_0800.lIlllIlllIIIIlIIlllIllIII).get(), n, class_07032.getClass().getName(), class_07032.serialize()});
        }
        if (n == null) {
            throw new IOException("Can't serialize unregistered packet");
        }
        PacketBuffer class_01812 = new PacketBuffer(byteBuf);
        class_01812.writeVarIntToBuffer(n);
        class_07032.writePacketData(class_01812);
        this.IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl(n, class_01812.readableBytes());
    }

    protected void encode(ChannelHandlerContext channelHandlerContext, Object object, ByteBuf byteBuf) {
        this.lllIIIllIIIIlllIlIIllIIll(channelHandlerContext, (Packet)object, byteBuf);
    }
}

