package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.Validate
 */
import net.minecraft.network.handshake.client.C00Handshake;
import net.minecraft.util.IChatComponent;
import org.apache.commons.lang3.Validate;

public class class_1635
implements class_2128 {
    private final class_0220 lllIIIllIIIIlllIlIIllIIll;
    private final class_0800 lllIlIIlIIIlIlIIIllIlllIl;

    public class_1635(class_0220 class_02202, class_0800 class_08002) {
        this.lllIIIllIIIIlllIlIIllIIll = class_02202;
        this.lllIlIIlIIIlIlIIIllIlllIl = class_08002;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(C00Handshake class_03022) {
        this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(class_03022.IlIllllllIIlIIllllIIlIIIl());
    }

    @Override
    public void onDisconnect(IChatComponent class_22552) {
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(EnumConnectionState class_05462, EnumConnectionState class_05463) {
        Validate.validState((class_05463 == EnumConnectionState.LOGIN || class_05463 == EnumConnectionState.STATUS ? 1 : 0) != 0, (String)("Unexpected protocol " + (Object)((Object)class_05463)), (Object[])new Object[0]);
        switch (class_05463) {
            case lIlllIlllIIIIlIIlllIllIII: {
                this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(new class_0296(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl));
                break;
            }
            case IlIllllllIIlIIllllIIlIIIl: {
                throw new UnsupportedOperationException("NYI");
            }
        }
    }

    @Override
    public void onNetworkTick() {
    }
}

