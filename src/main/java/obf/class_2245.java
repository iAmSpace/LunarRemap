package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Splitter
 *  io.netty.bootstrap.Bootstrap
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.EventLoopGroup
 *  io.netty.channel.socket.nio.NioSocketChannel
 *  io.netty.util.concurrent.GenericFutureListener
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.base.Splitter;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelHandler;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.util.concurrent.GenericFutureListener;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_2245 {
    private static final Splitter lllIIIllIIIIlllIlIIllIIll = Splitter.on((char)'\u0000').limit(6);
    private static final Logger lllIlIIlIIIlIlIIIllIlllIl = LogManager.getLogger();
    private final List IlIllllllIIlIIllllIIlIIIl = Collections.synchronizedList(new ArrayList());

    public void lllIIIllIIIIlllIlIIllIIll(class_1092 class_10922) {
        class_1408 class_14082 = class_1408.lllIIIllIIIIlllIlIIllIIll(class_10922.lllIlIIlIIIlIlIIIllIlllIl);
        class_0800 class_08002 = class_0800.lllIIIllIIIIlllIlIIllIIll(InetAddress.getByName(class_14082.lllIIIllIIIIlllIlIIllIIll()), class_14082.lllIlIIlIIIlIlIIIllIlllIl());
        this.IlIllllllIIlIIllllIIlIIIl.add(class_08002);
        class_10922.lIllllIIlIIIlIllllllIIIll = "Pinging...";
        class_10922.IIIllIIlIIIIIIlIlIIllIIlI = -1L;
        class_10922.lIIIIlIlIIlllllIIllIIlIII = null;
        class_08002.lllIIIllIIIIlllIlIIllIIll(new class_0756(this, class_10922, class_08002));
        try {
            class_08002.lllIIIllIIIIlllIlIIllIIll(new class_0302(class_10922.IllIIlllllllIIlIIlIIIIlIl == -1332 ? -1332 : 5, class_14082.lllIIIllIIIIlllIlIIllIIll(), class_14082.lllIlIIlIIIlIlIIIllIlllIl(), class_0546.IlIllllllIIlIIllllIIlIIIl), new GenericFutureListener[0]);
            class_08002.lllIIIllIIIIlllIlIIllIIll(new class_1723(), new GenericFutureListener[0]);
        }
        catch (Throwable throwable) {
            lllIlIIlIIIlIlIIIllIlllIl.error((Object)throwable);
        }
    }

    private void lllIlIIlIIIlIlIIIllIlllIl(class_1092 class_10922) {
        class_1408 class_14082 = class_1408.lllIIIllIIIIlllIlIIllIIll(class_10922.lllIlIIlIIIlIlIIIllIlllIl);
        ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group((EventLoopGroup)class_0800.IIIllIIlIIIIIIlIlIIllIIlI)).handler((ChannelHandler)new class_0434(this, class_14082, class_10922))).channel(NioSocketChannel.class)).connect(class_14082.lllIIIllIIIIlllIlIIllIIll(), class_14082.lllIlIIlIIIlIlIIIllIlllIl());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void lllIIIllIIIIlllIlIIllIIll() {
        List list = this.IlIllllllIIlIIllllIIlIIIl;
        List list2 = this.IlIllllllIIlIIllllIIlIIIl;
        synchronized (list2) {
            Iterator iterator = this.IlIllllllIIlIIllllIIlIIIl.iterator();
            while (iterator.hasNext()) {
                class_0800 class_08002 = (class_0800)((Object)iterator.next());
                if (class_08002.lIlllIlllIIIIlIIlllIllIII()) {
                    class_08002.lllIIIllIIIIlllIlIIllIIll();
                    continue;
                }
                iterator.remove();
                if (class_08002.lIllllIIlIIIlIllllllIIIll() == null) continue;
                class_08002.IlIIIIIllllllIIlllIllllll().lllIIIllIIIIlllIlIIllIIll(class_08002.lIllllIIlIIIlIllllllIIIll());
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void lllIlIIlIIIlIlIIIllIlllIl() {
        List list = this.IlIllllllIIlIIllllIIlIIIl;
        List list2 = this.IlIllllllIIlIIllllIIlIIIl;
        synchronized (list2) {
            Iterator iterator = this.IlIllllllIIlIIllllIIlIIIl.iterator();
            while (iterator.hasNext()) {
                class_0800 class_08002 = (class_0800)((Object)iterator.next());
                if (!class_08002.lIlllIlllIIIIlIIlllIllIII()) continue;
                iterator.remove();
                class_08002.lllIIIllIIIIlllIlIIllIIll(new class_0722("Cancelled"));
            }
        }
    }

    static /* synthetic */ Logger IlIllllllIIlIIllllIIlIIIl() {
        return lllIlIIlIIIlIlIIIllIlllIl;
    }

    static /* synthetic */ void lllIIIllIIIIlllIlIIllIIll(class_2245 class_22452, class_1092 class_10922) {
        class_22452.lllIlIIlIIIlIlIIIllIlllIl(class_10922);
    }

    static /* synthetic */ Splitter lIlllIlllIIIIlIIlllIllIII() {
        return lllIIIllIIIIlllIlIIllIIll;
    }
}

