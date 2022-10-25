package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.ThreadFactoryBuilder
 *  io.netty.bootstrap.ServerBootstrap
 *  io.netty.channel.ChannelFuture
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.EventLoopGroup
 *  io.netty.channel.local.LocalAddress
 *  io.netty.channel.local.LocalServerChannel
 *  io.netty.channel.nio.NioEventLoopGroup
 *  io.netty.channel.socket.nio.NioServerSocketChannel
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandler;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.local.LocalAddress;
import io.netty.channel.local.LocalServerChannel;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import net.minecraft.crash.CrashReport;
import net.minecraft.network.play.server.S40PacketDisconnect;
import net.minecraft.util.IChatComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_0267 {
    private static final Logger lllIlIIlIIIlIlIIIllIlllIl = LogManager.getLogger();
    private static final NioEventLoopGroup IlIllllllIIlIIllllIIlIIIl = new NioEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty IO #%d").setDaemon(true).build());
    private final class_0220 lIlllIlllIIIIlIIlllIllIII;
    public volatile boolean lllIIIllIIIIlllIlIIllIIll;
    private final List IlIIIIIllllllIIlllIllllll = Collections.synchronizedList(new ArrayList());
    private final List lIllllIIlIIIlIllllllIIIll = Collections.synchronizedList(new ArrayList());

    public class_0267(class_0220 class_02202) {
        this.lIlllIlllIIIIlIIlllIllIII = class_02202;
        this.lllIIIllIIIIlllIlIIllIIll = true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void lllIIIllIIIIlllIlIIllIIll(InetAddress inetAddress, int n) {
        List list = this.IlIIIIIllllllIIlllIllllll;
        List list2 = this.IlIIIIIllllllIIlllIllllll;
        synchronized (list2) {
            this.IlIIIIIllllllIIlllIllllll.add(((ServerBootstrap)((ServerBootstrap)new ServerBootstrap().channel(NioServerSocketChannel.class)).childHandler((ChannelHandler)new class_0410(this)).group((EventLoopGroup)IlIllllllIIlIIllllIIlIIIl).localAddress(inetAddress, n)).bind().syncUninterruptibly());
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public SocketAddress lllIIIllIIIIlllIlIIllIIll() {
        ChannelFuture channelFuture;
        List list = this.IlIIIIIllllllIIlllIllllll;
        List list2 = this.IlIIIIIllllllIIlllIllllll;
        synchronized (list2) {
            channelFuture = ((ServerBootstrap)((ServerBootstrap)new ServerBootstrap().channel(LocalServerChannel.class)).childHandler((ChannelHandler)new class_1730(this)).group((EventLoopGroup)IlIllllllIIlIIllllIIlIIIl).localAddress((SocketAddress)LocalAddress.ANY)).bind().syncUninterruptibly();
            this.IlIIIIIllllllIIlllIllllll.add(channelFuture);
        }
        return channelFuture.channel().localAddress();
    }

    public void lllIlIIlIIIlIlIIIllIlllIl() {
        this.lllIIIllIIIIlllIlIIllIIll = false;
        for (ChannelFuture channelFuture : this.IlIIIIIllllllIIlllIllllll) {
            channelFuture.channel().close().syncUninterruptibly();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void IlIllllllIIlIIllllIIlIIIl() {
        List list = this.lIllllIIlIIIlIllllllIIIll;
        List list2 = this.lIllllIIlIIIlIllllllIIIll;
        synchronized (list2) {
            Iterator iterator = this.lIllllIIlIIIlIllllllIIIll.iterator();
            while (iterator.hasNext()) {
                class_0800 class_08002 = (class_0800)((Object)iterator.next());
                if (!class_08002.lIlllIlllIIIIlIIlllIllIII()) {
                    iterator.remove();
                    if (class_08002.lIllllIIlIIIlIllllllIIIll() != null) {
                        class_08002.IlIIIIIllllllIIlllIllllll().onDisconnect(class_08002.lIllllIIlIIIlIllllllIIIll());
                        continue;
                    }
                    if (class_08002.IlIIIIIllllllIIlllIllllll() == null) continue;
                    class_08002.IlIIIIIllllllIIlllIllllll().onDisconnect(new class_0722("Disconnected"));
                    continue;
                }
                try {
                    class_08002.lllIIIllIIIIlllIlIIllIIll();
                }
                catch (Exception exception) {
                    Object object;
                    if (class_08002.IlIllllllIIlIIllllIIlIIIl()) {
                        object = CrashReport.lllIIIllIIIIlllIlIIllIIll(exception, "Ticking memory connection");
                        class_0799 class_07992 = ((CrashReport)object).lllIIIllIIIIlllIlIIllIIll("Ticking connection");
                        class_07992.addCrashSectionCallable("Connection", new class_0927(this, class_08002));
                        throw new class_0892((CrashReport)object);
                    }
                    lllIlIIlIIIlIlIIIllIlllIl.warn("Failed to handle packet for " + class_08002.lllIlIIlIIIlIlIIIllIlllIl(), (Throwable)exception);
                    object = new class_0722("Internal server error");
                    class_08002.lllIIIllIIIIlllIlIIllIIll(new S40PacketDisconnect((IChatComponent)object), new class_0521(this, class_08002, (class_0722)object));
                    class_08002.IIIllIIlIIIIIIlIlIIllIIlI();
                }
            }
        }
    }

    public class_0220 lIlllIlllIIIIlIIlllIllIII() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    static /* synthetic */ List lllIIIllIIIIlllIlIIllIIll(class_0267 class_02672) {
        return class_02672.lIllllIIlIIIlIllllllIIIll;
    }

    static /* synthetic */ class_0220 lllIlIIlIIIlIlIIIllIlllIl(class_0267 class_02672) {
        return class_02672.lIlllIlllIIIIlIIlllIllIII;
    }
}

