package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.BiMap
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.ByteToMessageDecoder
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.apache.logging.log4j.Marker
 *  org.apache.logging.log4j.MarkerManager
 */
import com.google.common.collect.BiMap;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import java.io.IOException;
import java.util.List;

import net.minecraft.network.Packet;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

public class class_1668
extends ByteToMessageDecoder {
    private static final Logger lllIIIllIIIIlllIlIIllIIll = LogManager.getLogger();
    private static final Marker lllIlIIlIIIlIlIIIllIlllIl = MarkerManager.getMarker((String)"PACKET_RECEIVED", (Marker)class_0800.lllIlIIlIIIlIlIIIllIlllIl);
    private final class_0670 IlIllllllIIlIIllllIIlIIIl;

    public class_1668(class_0670 class_06702) {
        this.IlIllllllIIlIIllllIIlIIIl = class_06702;
    }

    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List list) {
        int n = byteBuf.readableBytes();
        if (n != 0) {
            PacketBuffer class_01812 = new PacketBuffer(byteBuf);
            int n2 = class_01812.readVarIntFromBuffer();
            Packet class_07032 = Packet.generatePacket((BiMap)channelHandlerContext.channel().attr(class_0800.IlIIIIIllllllIIlllIllllll).get(), n2);
            if (class_07032 == null) {
                throw new IOException("Bad packet id " + n2);
            }
            class_07032.readPacketData(class_01812);
            if (class_01812.readableBytes() > 0) {
                throw new IOException("Packet was larger than I expected, found " + class_01812.readableBytes() + " bytes extra whilst reading packet " + n2);
            }
            list.add(class_07032);
            this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(n2, n);
            if (lllIIIllIIIIlllIlIIllIIll.isDebugEnabled()) {
                lllIIIllIIIIlllIlIIllIIll.debug(lllIlIIlIIIlIlIIIllIlllIl, " IN: [{}:{}] {}[{}]", new Object[]{channelHandlerContext.channel().attr(class_0800.lIlllIlllIIIIlIIlllIllIII).get(), n2, class_07032.getClass().getName(), class_07032.serialize()});
            }
        }
    }
}

