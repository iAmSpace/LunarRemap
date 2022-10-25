package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  com.mojang.authlib.GameProfile
 *  io.netty.util.concurrent.GenericFutureListener
 *  org.apache.commons.lang3.Validate
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.base.Charsets;
import com.mojang.authlib.GameProfile;
import io.netty.util.concurrent.GenericFutureListener;
import java.security.PrivateKey;
import java.util.Arrays;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.SecretKey;

import net.minecraft.network.EnumConnectionState;
import net.minecraft.network.login.client.C00PacketLoginStart;
import net.minecraft.network.login.client.C01PacketEncryptionResponse;
import net.minecraft.network.login.server.S00PacketDisconnect;
import net.minecraft.network.login.server.S01PacketEncryptionRequest;
import net.minecraft.network.login.server.S02PacketLoginSuccess;
import net.minecraft.util.IChatComponent;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_0296
implements INetHandlerLoginServer {
    private static final AtomicInteger lllIlIIlIIIlIlIIIllIlllIl = new AtomicInteger(0);
    private static final Logger IlIllllllIIlIIllllIIlIIIl = LogManager.getLogger();
    private static final Random lIlllIlllIIIIlIIlllIllIII = new Random();
    private final byte[] IlIIIIIllllllIIlllIllllll = new byte[4];
    private final class_0220 lIllllIIlIIIlIllllllIIIll;
    public final class_0800 lllIIIllIIIIlllIlIIllIIll;
    private class_0966 IIIllIIlIIIIIIlIlIIllIIlI = class_0966.lllIIIllIIIIlllIlIIllIIll;
    private int IllIIlllllllIIlIIlIIIIlIl;
    private GameProfile IIIllIllIIlIlIlIlIllllIIl;
    private String IllIIIllIIIIlIlIlIllIIlll = "";
    private SecretKey lIIIIlIlIIlllllIIllIIlIII;

    public class_0296(class_0220 class_02202, class_0800 class_08002) {
        this.lIllllIIlIIIlIllllllIIIll = class_02202;
        this.lllIIIllIIIIlllIlIIllIIll = class_08002;
        lIlllIlllIIIIlIIlllIllIII.nextBytes(this.IlIIIIIllllllIIlllIllllll);
    }

    @Override
    public void onNetworkTick() {
        if (this.IIIllIIlIIIIIIlIlIIllIIlI == class_0966.lIlllIlllIIIIlIIlllIllIII) {
            this.lllIlIIlIIIlIlIIIllIlllIl();
        }
        if (this.IllIIlllllllIIlIIlIIIIlIl++ == 600) {
            this.lllIIIllIIIIlllIlIIllIIll("Took too long to log in");
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(String string) {
        try {
            IlIllllllIIlIIllllIIlIIIl.info("Disconnecting " + this.IlIllllllIIlIIllllIIlIIIl() + ": " + string);
            class_0722 class_07222 = new class_0722(string);
            this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new S00PacketDisconnect(class_07222), new GenericFutureListener[0]);
            this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(class_07222);
        }
        catch (Exception exception) {
            IlIllllllIIlIIllllIIlIIIl.error("Error whilst disconnecting player", (Throwable)exception);
        }
    }

    public void lllIlIIlIIIlIlIIIllIlllIl() {
        String string;
        if (!this.IIIllIllIIlIlIlIlIllllIIl.isComplete()) {
            this.IIIllIllIIlIlIlIlIllllIIl = this.lllIIIllIIIIlllIlIIllIIll(this.IIIllIllIIlIlIlIlIllllIIl);
        }
        if ((string = this.lIllllIIlIIIlIllllllIIIll.lIIIllIIIIIllllIlIlIllIll().lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl(), this.IIIllIllIIlIlIlIlIllllIIl)) != null) {
            this.lllIIIllIIIIlllIlIIllIIll(string);
        } else {
            this.IIIllIIlIIIIIIlIlIIllIIlI = class_0966.IlIIIIIllllllIIlllIllllll;
            this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new S02PacketLoginSuccess(this.IIIllIllIIlIlIlIlIllllIIl), new GenericFutureListener[0]);
            this.lIllllIIlIIIlIllllllIIIll.lIIIllIIIIIllllIlIlIllIll().lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, this.lIllllIIlIIIlIllllllIIIll.lIIIllIIIIIllllIlIlIllIll().lllIIIllIIIIlllIlIIllIIll(this.IIIllIllIIlIlIlIlIllllIIl));
        }
    }

    @Override
    public void onDisconnect(IChatComponent class_22552) {
        IlIllllllIIlIIllllIIlIIIl.info(this.IlIllllllIIlIIllllIIlIIIl() + " lost connection: " + class_22552.IlIllllllIIlIIllllIIlIIIl());
    }

    public String IlIllllllIIlIIllllIIlIIIl() {
        return this.IIIllIllIIlIlIlIlIllllIIl != null ? this.IIIllIllIIlIlIlIlIllllIIl.toString() + " (" + this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl().toString() + ")" : String.valueOf(this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl());
    }

    @Override
    public void onConnectionStateTransition(EnumConnectionState class_05462, EnumConnectionState class_05463) {
        Validate.validState((this.IIIllIIlIIIIIIlIlIIllIIlI == class_0966.IlIIIIIllllllIIlllIllllll || this.IIIllIIlIIIIIIlIlIIllIIlI == class_0966.lllIIIllIIIIlllIlIIllIIll ? 1 : 0) != 0, (String)"Unexpected change in protocol", (Object[])new Object[0]);
        Validate.validState((class_05463 == EnumConnectionState.PLAY || class_05463 == EnumConnectionState.LOGIN ? 1 : 0) != 0, (String)("Unexpected protocol " + (Object)((Object)class_05463)), (Object[])new Object[0]);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(C00PacketLoginStart class_12222) {
        Validate.validState((this.IIIllIIlIIIIIIlIlIIllIIlI == class_0966.lllIIIllIIIIlllIlIIllIIll ? 1 : 0) != 0, (String)"Unexpected hello packet", (Object[])new Object[0]);
        this.IIIllIllIIlIlIlIlIllllIIl = class_12222.IlIllllllIIlIIllllIIlIIIl();
        if (this.lIllllIIlIIIlIllllllIIIll.lIlIlIIIIIIlIIllllIlIIllI() && !this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl()) {
            this.IIIllIIlIIIIIIlIlIIllIIlI = class_0966.lllIlIIlIIIlIlIIIllIlllIl;
            this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new S01PacketEncryptionRequest(this.IllIIIllIIIIlIlIlIllIIlll, this.lIllllIIlIIIlIllllllIIIll.IllIIIIllIIllIllIlllIlIIl().getPublic(), this.IlIIIIIllllllIIlllIllllll), new GenericFutureListener[0]);
        } else {
            this.IIIllIIlIIIIIIlIlIIllIIlI = class_0966.lIlllIlllIIIIlIIlllIllIII;
        }
    }

    @Override
    public void processEncryptionResponse(C01PacketEncryptionResponse class_20422) {
        Validate.validState((this.IIIllIIlIIIIIIlIlIIllIIlI == class_0966.lllIlIIlIIIlIlIIIllIlllIl ? 1 : 0) != 0, (String)"Unexpected key packet", (Object[])new Object[0]);
        PrivateKey privateKey = this.lIllllIIlIIIlIllllllIIIll.IllIIIIllIIllIllIlllIlIIl().getPrivate();
        if (!Arrays.equals(this.IlIIIIIllllllIIlllIllllll, class_20422.func_149299_b(privateKey))) {
            throw new IllegalStateException("Invalid nonce!");
        }
        this.lIIIIlIlIIlllllIIllIIlIII = class_20422.func_149300_a(privateKey);
        this.IIIllIIlIIIIIIlIlIIllIIlI = class_0966.IlIllllllIIlIIllllIIlIIIl;
        this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(this.lIIIIlIlIIlllllIIllIIlIII);
        new class_1037(this, "User Authenticator #" + lllIlIIlIIIlIlIIIllIlllIl.incrementAndGet()).start();
    }

    protected GameProfile lllIIIllIIIIlllIlIIllIIll(GameProfile gameProfile) {
        UUID uUID = UUID.nameUUIDFromBytes(("OfflinePlayer:" + gameProfile.getName()).getBytes(Charsets.UTF_8));
        return new GameProfile(uUID, gameProfile.getName());
    }

    static /* synthetic */ GameProfile lllIIIllIIIIlllIlIIllIIll(class_0296 class_02962) {
        return class_02962.IIIllIllIIlIlIlIlIllllIIl;
    }

    static /* synthetic */ String lllIlIIlIIIlIlIIIllIlllIl(class_0296 class_02962) {
        return class_02962.IllIIIllIIIIlIlIlIllIIlll;
    }

    static /* synthetic */ class_0220 IlIllllllIIlIIllllIIlIIIl(class_0296 class_02962) {
        return class_02962.lIllllIIlIIIlIllllllIIIll;
    }

    static /* synthetic */ SecretKey lIlllIlllIIIIlIIlllIllIII(class_0296 class_02962) {
        return class_02962.lIIIIlIlIIlllllIIllIIlIII;
    }

    static /* synthetic */ GameProfile lllIIIllIIIIlllIlIIllIIll(class_0296 class_02962, GameProfile gameProfile) {
        class_02962.IIIllIllIIlIlIlIlIllllIIl = gameProfile;
        return class_02962.IIIllIllIIlIlIlIlIllllIIl;
    }

    static /* synthetic */ Logger lIlllIlllIIIIlIIlllIllIII() {
        return IlIllllllIIlIIllllIIlIIIl;
    }

    static /* synthetic */ class_0966 lllIIIllIIIIlllIlIIllIIll(class_0296 class_02962, class_0966 class_09662) {
        class_02962.IIIllIIlIIIIIIlIlIIllIIlI = class_09662;
        return class_02962.IIIllIIlIIIIIIlIlIIllIIlI;
    }
}

