package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Queues
 *  com.google.common.util.concurrent.ThreadFactoryBuilder
 *  io.netty.bootstrap.Bootstrap
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelFutureListener
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.EventLoopGroup
 *  io.netty.channel.SimpleChannelInboundHandler
 *  io.netty.channel.local.LocalChannel
 *  io.netty.channel.local.LocalServerChannel
 *  io.netty.channel.nio.NioEventLoopGroup
 *  io.netty.channel.socket.nio.NioSocketChannel
 *  io.netty.handler.timeout.TimeoutException
 *  io.netty.util.AttributeKey
 *  io.netty.util.concurrent.GenericFutureListener
 *  io.netty.util.concurrent.ScheduledFuture
 *  org.apache.commons.lang3.Validate
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.apache.logging.log4j.Marker
 *  org.apache.logging.log4j.MarkerManager
 */
import com.google.common.collect.Queues;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.local.LocalChannel;
import io.netty.channel.local.LocalServerChannel;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.timeout.TimeoutException;
import io.netty.util.AttributeKey;
import io.netty.util.concurrent.GenericFutureListener;
import io.netty.util.concurrent.ScheduledFuture;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import javax.crypto.SecretKey;

import net.minecraft.client.Minecraft;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.ChatComponentTranslation;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

public class class_0800
extends SimpleChannelInboundHandler {
    private static final Logger IllIIIllIIIIlIlIlIllIIlll = LogManager.getLogger();
    public static final Marker lllIIIllIIIIlllIlIIllIIll = MarkerManager.getMarker((String)"NETWORK");
    public static final Marker lllIlIIlIIIlIlIIIllIlllIl = MarkerManager.getMarker((String)"NETWORK_PACKETS", (Marker)lllIIIllIIIIlllIlIIllIIll);
    public static final Marker IlIllllllIIlIIllllIIlIIIl = MarkerManager.getMarker((String)"NETWORK_STAT", (Marker)lllIIIllIIIIlllIlIIllIIll);
    public static final AttributeKey lIlllIlllIIIIlIIlllIllIII = new AttributeKey("protocol");
    public static final AttributeKey IlIIIIIllllllIIlllIllllll = new AttributeKey("receivable_packets");
    public static final AttributeKey lIllllIIlIIIlIllllllIIIll = new AttributeKey("sendable_packets");
    public static final NioEventLoopGroup IIIllIIlIIIIIIlIlIIllIIlI = new NioEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Client IO #%d").setDaemon(true).build());
    public static final class_0670 IllIIlllllllIIlIIlIIIIlIl = new class_0670();
    private final boolean lIIIIlIlIIlllllIIllIIlIII;
    private final Queue llIIlllIllIllllIIIlIIIIII = Queues.newConcurrentLinkedQueue();
    private final Queue llIIllIllIlIIlIIllIllllll = Queues.newConcurrentLinkedQueue();
    private Channel lllIIlIIIllllllIIIIlIlIlI;
    private SocketAddress IlIlllIIIIIIlIIllIIllIlll;
    private class_2075 IlIlIIlIlIllIIlIlIIllIIIl;
    private class_0546 lllllIlllIIllIlIIlIIIllII;
    private IChatComponent IlIlIIlllIIlIllIIIlllllIl;
    private boolean lIIlIIIIIlIlllIlIIlIlIlll;
    public boolean IIIllIllIIlIlIlIlIllllIIl = false;
    private class_2040 lIlIlIIlIIIIlIIIIIlllIIII;
    private ScheduledFuture IlIIIlIIIIllIIIllIIIIIIll;

    public class_0800(boolean bl) {
        this.lIIIIlIlIIlllllIIllIIlIII = bl;
    }

    public void channelActive(ChannelHandlerContext channelHandlerContext) {
        super.channelActive(channelHandlerContext);
        this.lllIIlIIIllllllIIIIlIlIlI = channelHandlerContext.channel();
        this.IlIlllIIIIIIlIIllIIllIlll = this.lllIIlIIIllllllIIIIlIlIlI.remoteAddress();
        this.lllIIIllIIIIlllIlIIllIIll(class_0546.lllIIIllIIIIlllIlIIllIIll);
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0546 class_05462) {
        this.lllllIlllIIllIlIIlIIIllII = (class_0546)((Object)this.lllIIlIIIllllllIIIIlIlIlI.attr(lIlllIlllIIIIlIIlllIllIII).getAndSet((Object)class_05462));
        this.lllIIlIIIllllllIIIIlIlIlI.attr(IlIIIIIllllllIIlllIllllll).set((Object)class_05462.lllIIIllIIIIlllIlIIllIIll(this.lIIIIlIlIIlllllIIllIIlIII));
        this.lllIIlIIIllllllIIIIlIlIlI.attr(lIllllIIlIIIlIllllllIIIll).set((Object)class_05462.lllIlIIlIIIlIlIIIllIlllIl(this.lIIIIlIlIIlllllIIllIIlIII));
        this.lllIIlIIIllllllIIIIlIlIlI.config().setAutoRead(true);
        IllIIIllIIIIlIlIlIllIIlll.debug("Enabled auto read");
    }

    public void channelInactive(ChannelHandlerContext channelHandlerContext) {
        this.lllIIIllIIIIlllIlIIllIIll(new ChatComponentTranslation("disconnect.endOfStream", new Object[0]));
    }

    public void exceptionCaught(ChannelHandlerContext channelHandlerContext, Throwable throwable) {
        ChatComponentTranslation class_17902 = throwable instanceof TimeoutException ? new ChatComponentTranslation("disconnect.timeout", new Object[0]) : new ChatComponentTranslation("disconnect.genericReason", "Internal Exception: " + throwable);
        this.lllIIIllIIIIlllIlIIllIIll(class_17902);
    }

    protected void lllIIIllIIIIlllIlIIllIIll(ChannelHandlerContext channelHandlerContext, class_0703 class_07032) {
        if (this.lllIIlIIIllllllIIIIlIlIlI.isOpen()) {
            if (class_07032.lllIIIllIIIIlllIlIIllIIll()) {
                class_07032.lllIIIllIIIIlllIlIIllIIll(this.IlIlIIlIlIllIIlIlIIllIIIl);
            } else {
                this.llIIlllIllIllllIIIlIIIIII.add(class_07032);
            }
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_2075 class_20752) {
        Validate.notNull((Object)class_20752, (String)"packetListener", (Object[])new Object[0]);
        IllIIIllIIIIlIlIlIllIIlll.debug("Set listener of {} to {}", new Object[]{this, class_20752});
        this.IlIlIIlIlIllIIlIlIIllIIIl = class_20752;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0703 class_07032, GenericFutureListener ... arrgenericFutureListener) {
        if (this.lllIIlIIIllllllIIIIlIlIlI != null && this.lllIIlIIIllllllIIIIlIlIlI.isOpen()) {
            this.IIIllIllIIlIlIlIlIllllIIl();
            this.lllIlIIlIIIlIlIIIllIlllIl(class_07032, arrgenericFutureListener);
        } else {
            this.llIIllIllIlIIlIIllIllllll.add(new class_0244(class_07032, arrgenericFutureListener));
        }
    }

    private void lllIlIIlIIIlIlIIIllIlllIl(class_0703 class_07032, GenericFutureListener[] arrgenericFutureListener) {
        class_0546 class_05462 = class_0546.lllIIIllIIIIlllIlIIllIIll(class_07032);
        class_0546 class_05463 = (class_0546)((Object)this.lllIIlIIIllllllIIIIlIlIlI.attr(lIlllIlllIIIIlIIlllIllIII).get());
        if (class_05463 != class_05462) {
            IllIIIllIIIIlIlIlIllIIlll.debug("Disabled auto read");
            this.lllIIlIIIllllllIIIIlIlIlI.config().setAutoRead(false);
        }
        if (this.lllIIlIIIllllllIIIIlIlIlI.eventLoop().inEventLoop()) {
            if (class_05462 != class_05463) {
                this.lllIIIllIIIIlllIlIIllIIll(class_05462);
            }
            this.lllIIlIIIllllllIIIIlIlIlI.writeAndFlush((Object)class_07032).addListeners(arrgenericFutureListener).addListener((GenericFutureListener)ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE);
        } else {
            this.lllIIlIIIllllllIIIIlIlIlI.eventLoop().execute((Runnable)new class_1718(this, class_05462, class_05463, class_07032, arrgenericFutureListener));
        }
    }

    private void IIIllIllIIlIlIlIlIllllIIl() {
        if (this.lllIIlIIIllllllIIIIlIlIlI != null && this.lllIIlIIIllllllIIIIlIlIlI.isOpen()) {
            while (!this.llIIllIllIlIIlIIllIllllll.isEmpty()) {
                class_0244 class_02442 = (class_0244)this.llIIllIllIlIIlIIllIllllll.poll();
                this.lllIlIIlIIIlIlIIIllIlllIl(class_0244.lllIIIllIIIIlllIlIIllIIll(class_02442), class_0244.lllIlIIlIIIlIlIIIllIlllIl(class_02442));
            }
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll() {
        this.IIIllIllIIlIlIlIlIllllIIl();
        class_0546 class_05462 = (class_0546)((Object)this.lllIIlIIIllllllIIIIlIlIlI.attr(lIlllIlllIIIIlIIlllIllIII).get());
        if (this.lllllIlllIIllIlIIlIIIllII != class_05462) {
            if (this.lllllIlllIIllIlIIlIIIllII != null) {
                this.IlIlIIlIlIllIIlIlIIllIIIl.lllIIIllIIIIlllIlIIllIIll(this.lllllIlllIIllIlIIlIIIllII, class_05462);
            }
            this.lllllIlllIIllIlIIlIIIllII = class_05462;
        }
        if (this.IlIlIIlIlIllIIlIlIIllIIIl != null) {
            for (int i = 1000; !this.llIIlllIllIllllIIIlIIIIII.isEmpty() && i >= 0; --i) {
                class_0703 class_07032 = (class_0703)this.llIIlllIllIllllIIIlIIIIII.poll();
                class_07032.lllIIIllIIIIlllIlIIllIIll(this.IlIlIIlIlIllIIlIlIIllIIIl);
            }
            this.IlIlIIlIlIllIIlIlIIllIIIl.lllIIIllIIIIlllIlIIllIIll();
        }
        this.lllIIlIIIllllllIIIIlIlIlI.flush();
    }

    public SocketAddress lllIlIIlIIIlIlIIIllIlllIl() {
        return this.IlIlllIIIIIIlIIllIIllIlll;
    }

    public void lllIIIllIIIIlllIlIIllIIll(IChatComponent class_22552) {
        if (this.lllIIlIIIllllllIIIIlIlIlI.isOpen()) {
            if (this.IlIIIlIIIIllIIIllIIIIIIll != null) {
                this.IlIIIlIIIIllIIIllIIIIIIll.cancel(false);
            }
            this.lllIIlIIIllllllIIIIlIlIlI.close();
            this.IlIlIIlllIIlIllIIIlllllIl = class_22552;
        }
    }

    public boolean IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIIlIIIllllllIIIIlIlIlI instanceof LocalChannel || this.lllIIlIIIllllllIIIIlIlIlI instanceof LocalServerChannel;
    }

    public static class_0800 lllIIIllIIIIlllIlIIllIIll(InetAddress inetAddress, int n) {
        class_0800 class_08002 = new class_0800(true);
        ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group((EventLoopGroup)IIIllIIlIIIIIIlIlIIllIIlI)).handler((ChannelHandler)new class_0795(class_08002))).channel(NioSocketChannel.class)).connect(inetAddress, n).syncUninterruptibly();
        return class_08002;
    }

    public static class_0800 lllIIIllIIIIlllIlIIllIIll(SocketAddress socketAddress) {
        class_0800 class_08002 = new class_0800(true);
        ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group((EventLoopGroup)IIIllIIlIIIIIIlIlIIllIIlI)).handler((ChannelHandler)new class_1477(class_08002))).channel(LocalChannel.class)).connect(socketAddress).syncUninterruptibly();
        return class_08002;
    }

    public void lllIIIllIIIIlllIlIIllIIll(SecretKey secretKey) {
        this.lllIIlIIIllllllIIIIlIlIlI.pipeline().addBefore("splitter", "decrypt", (ChannelHandler)new class_0490(class_0936.lllIIIllIIIIlllIlIIllIIll(2, secretKey)));
        this.lllIIlIIIllllllIIIIlIlIlI.pipeline().addBefore("prepender", "encrypt", (ChannelHandler)new class_2121(class_0936.lllIIIllIIIIlllIlIIllIIll(1, secretKey)));
        if (this.IIIllIllIIlIlIlIlIllllIIl) {
            Object object;
            String string = Minecraft.getMinecraft().getSession().getPlayerID();
            try {
                object = MessageDigest.getInstance("SHA-512");
                ((MessageDigest)object).update(secretKey.getEncoded());
                ((MessageDigest)object).update(class_0817.class.getName().getBytes());
                ((MessageDigest)object).update(class_0852.class.getName().getBytes());
                ((MessageDigest)object).update(string.getBytes());
                ((MessageDigest)object).update(Minecraft.getMinecraft().IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl.getBytes());
                this.lllIIlIIIllllllIIIIlIlIlI.writeAndFlush((Object)new class_0917("LC|INIT", ((MessageDigest)object).digest()));
                System.out.println("Sent LC|INIT");
            }
            catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                // empty catch block
            }
            this.lIlIlIIlIIIIlIIIIIlllIIII = new class_2040(secretKey);
            this.lllIIlIIIllllllIIIIlIlIlI.pipeline().addBefore("encoder", "lc-checksum-out", (ChannelHandler)this.lIlIlIIlIIIIlIIIIIlllIIII);
            object = new class_1991(secretKey);
            this.lllIIlIIIllllllIIIIlIlIlI.pipeline().addAfter("splitter", "lc-checksum-in", (ChannelHandler)object);
            this.lllIIlIIIllllllIIIIlIlIlI.pipeline().addAfter("decoder", "lc-checksum-verify", (ChannelHandler)new class_2168((class_1991)((Object)object)));
            this.IlIIIlIIIIllIIIllIIIIIIll = this.lllIIlIIIllllllIIIIlIlIlI.eventLoop().scheduleAtFixedRate(() -> {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                try {
                    dataOutputStream.writeInt((int)this.lIlIlIIlIIIIlIIIIIlllIIII.lllIIIllIIIIlllIlIIllIIll());
                    dataOutputStream.writeLong(System.nanoTime());
                }
                catch (IOException iOException) {
                    // empty catch block
                }
                this.lllIIlIIIllllllIIIIlIlIlI.writeAndFlush((Object)new class_0917("LC|PING", byteArrayOutputStream.toByteArray()));
            }, 1L, 5L, TimeUnit.SECONDS);
        }
        this.lIIlIIIIIlIlllIlIIlIlIlll = true;
    }

    public boolean lIlllIlllIIIIlIIlllIllIII() {
        return this.lllIIlIIIllllllIIIIlIlIlI != null && this.lllIIlIIIllllllIIIIlIlIlI.isOpen();
    }

    public class_2075 IlIIIIIllllllIIlllIllllll() {
        return this.IlIlIIlIlIllIIlIlIIllIIIl;
    }

    public IChatComponent lIllllIIlIIIlIllllllIIIll() {
        return this.IlIlIIlllIIlIllIIIlllllIl;
    }

    public void IIIllIIlIIIIIIlIlIIllIIlI() {
        this.lllIIlIIIllllllIIIIlIlIlI.config().setAutoRead(false);
    }

    protected void channelRead0(ChannelHandlerContext channelHandlerContext, Object object) {
        this.lllIIIllIIIIlllIlIIllIIll(channelHandlerContext, (class_0703)object);
    }

    public Channel IllIIlllllllIIlIIlIIIIlIl() {
        return this.lllIIlIIIllllllIIIIlIlIlI;
    }

    static /* synthetic */ Channel lllIIIllIIIIlllIlIIllIIll(class_0800 class_08002) {
        return class_08002.lllIIlIIIllllllIIIIlIlIlI;
    }
}

