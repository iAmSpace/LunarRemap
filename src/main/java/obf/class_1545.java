package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  io.netty.util.concurrent.GenericFutureListener
 */
import io.netty.util.concurrent.GenericFutureListener;
import net.minecraft.network.handshake.client.C00Handshake;
import net.minecraft.network.login.server.S00PacketDisconnect;
import net.minecraft.util.IChatComponent;

public class class_1545
implements class_2128 {
    private final class_0220 lllIIIllIIIIlllIlIIllIIll;
    private final class_0800 lllIlIIlIIIlIlIIIllIlllIl;

    public class_1545(class_0220 class_02202, class_0800 class_08002) {
        this.lllIIIllIIIIlllIlIIllIIll = class_02202;
        this.lllIlIIlIIIlIlIIIllIlllIl = class_08002;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(C00Handshake class_03022) {
        switch (class_03022.IlIllllllIIlIIllllIIlIIIl()) {
            case lIlllIlllIIIIlIIlllIllIII: {
                this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(EnumConnectionState.LOGIN);
                if (class_03022.lIlllIlllIIIIlIIlllIllIII() > 5) {
                    class_0722 class_07222 = new class_0722("Outdated server! I'm still on 1.7.10");
                    this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(new S00PacketDisconnect(class_07222), new GenericFutureListener[0]);
                    this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(class_07222);
                    break;
                }
                if (class_03022.lIlllIlllIIIIlIIlllIllIII() < 5) {
                    class_0722 class_07223 = new class_0722("Outdated client! Please use 1.7.10");
                    this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(new S00PacketDisconnect(class_07223), new GenericFutureListener[0]);
                    this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(class_07223);
                    break;
                }
                this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(new class_0296(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl));
                break;
            }
            case IlIllllllIIlIIllllIIlIIIl: {
                this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(EnumConnectionState.STATUS);
                this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(new class_0199(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl));
                break;
            }
            default: {
                throw new UnsupportedOperationException("Invalid intention " + (Object)((Object)class_03022.IlIllllllIIlIIllllIIlIIIl()));
            }
        }
    }

    @Override
    public void onDisconnect(IChatComponent class_22552) {
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(EnumConnectionState class_05462, EnumConnectionState class_05463) {
        if (class_05463 != EnumConnectionState.LOGIN && class_05463 != EnumConnectionState.STATUS) {
            throw new UnsupportedOperationException("Invalid state " + (Object)((Object)class_05463));
        }
    }

    @Override
    public void onNetworkTick() {
    }
}

