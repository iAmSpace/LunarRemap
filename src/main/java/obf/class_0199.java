package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  io.netty.util.concurrent.GenericFutureListener
 */
import io.netty.util.concurrent.GenericFutureListener;
import net.minecraft.network.status.client.C00PacketServerQuery;
import net.minecraft.network.status.client.C01PacketPing;
import net.minecraft.network.status.server.S00PacketServerInfo;
import net.minecraft.network.status.server.S01PacketPong;
import net.minecraft.util.IChatComponent;

public class class_0199
implements class_0367 {
    private final class_0220 lllIIIllIIIIlllIlIIllIIll;
    private final class_0800 lllIlIIlIIIlIlIIIllIlllIl;

    public class_0199(class_0220 class_02202, class_0800 class_08002) {
        this.lllIIIllIIIIlllIlIIllIIll = class_02202;
        this.lllIlIIlIIIlIlIIIllIlllIl = class_08002;
    }

    @Override
    public void onDisconnect(IChatComponent class_22552) {
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(EnumConnectionState class_05462, EnumConnectionState class_05463) {
        if (class_05463 != EnumConnectionState.STATUS) {
            throw new UnsupportedOperationException("Unexpected change in protocol to " + (Object)((Object)class_05463));
        }
    }

    @Override
    public void onNetworkTick() {
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(C00PacketServerQuery class_17232) {
        this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(new S00PacketServerInfo(this.lllIIIllIIIIlllIlIIllIIll.lIlIIllIllIIIIIlIllllIIIl()), new GenericFutureListener[0]);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(C01PacketPing class_18942) {
        this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(new S01PacketPong(class_18942.IlIllllllIIlIIllllIIlIIIl()), new GenericFutureListener[0]);
    }
}

