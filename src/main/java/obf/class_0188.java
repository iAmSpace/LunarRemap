package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.exceptions.AuthenticationException
 *  com.mojang.authlib.exceptions.AuthenticationUnavailableException
 *  com.mojang.authlib.exceptions.InvalidCredentialsException
 *  com.mojang.authlib.minecraft.MinecraftSessionService
 *  com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.mojang.authlib.exceptions.AuthenticationException;
import com.mojang.authlib.exceptions.AuthenticationUnavailableException;
import com.mojang.authlib.exceptions.InvalidCredentialsException;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import java.math.BigInteger;
import java.security.PublicKey;
import java.util.UUID;
import javax.crypto.SecretKey;

import com.moonsworth.lunar.client.LunarClient;
import net.minecraft.client.Minecraft;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.ChatComponentTranslation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_0188
implements class_0774 {
    private static final Logger lllIIIllIIIIlllIlIIllIIll = LogManager.getLogger();
    private final Minecraft lllIlIIlIIIlIlIIIllIlllIl;
    private final class_0229 IlIllllllIIlIIllllIIlIIIl;
    private final class_0800 lIlllIlllIIIIlIIlllIllIII;

    public class_0188(class_0800 class_08002, Minecraft class_06672, class_0229 class_02292) {
        this.lIlllIlllIIIIlIIlllIllIII = class_08002;
        this.lllIlIIlIIIlIlIIIllIlllIl = class_06672;
        this.IlIllllllIIlIIllllIIlIIIl = class_02292;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0201 class_02012) {
        PublicKey publicKey;
        SecretKey secretKey;
        block6: {
            secretKey = class_0936.lllIIIllIIIIlllIlIIllIIll();
            String string = class_02012.IlIllllllIIlIIllllIIlIIIl();
            publicKey = class_02012.lIlllIlllIIIIlIIlllIllIII();
            String string2 = new BigInteger(class_0936.lllIIIllIIIIlllIlIIllIIll(string, publicKey, secretKey)).toString(16);
            boolean bl = this.lllIlIIlIIIlIlIIIllIlllIl.llIIIlllIlllIlIllIIIIllIl() == null || !this.lllIlIIlIIIlIlIIIllIlllIl.llIIIlllIlllIlIllIIIIllIl().lIlllIlllIIIIlIIlllIllIII();
            try {
                this.lllIlIIlIIIlIlIIIllIlllIl().joinServer(this.lllIlIIlIIIlIlIIIllIlllIl.getSession().func_148256_e(), this.lllIlIIlIIIlIlIIIllIlllIl.getSession().getToken(), string2);
            }
            catch (AuthenticationUnavailableException authenticationUnavailableException) {
                if (bl) {
                    this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(new ChatComponentTranslation("disconnect.loginFailedInfo", new ChatComponentTranslation("disconnect.loginFailedInfo.serversUnavailable", new Object[0])));
                    return;
                }
            }
            catch (InvalidCredentialsException invalidCredentialsException) {
                if (bl) {
                    this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(new ChatComponentTranslation("disconnect.loginFailedInfo", new ChatComponentTranslation("disconnect.loginFailedInfo.invalidSession", new Object[0])));
                    return;
                }
            }
            catch (AuthenticationException authenticationException) {
                if (!bl) break block6;
                this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(new ChatComponentTranslation("disconnect.loginFailedInfo", authenticationException.getMessage()));
                return;
            }
        }
        this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(new class_2042(secretKey, publicKey, class_02012.IlIIIIIllllllIIlllIllllll()), new class_1028(this, secretKey));
    }

    private MinecraftSessionService lllIlIIlIIIlIlIIIllIlllIl() {
        return new YggdrasilAuthenticationService(this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIIIIlIlllIIlIlIIIllI(), UUID.randomUUID().toString()).createMinecraftSessionService();
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0336 class_03362) {
        this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(class_0546.lllIlIIlIIIlIlIIIllIlllIl);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(IChatComponent class_22552) {
        if (class_22552.IlIllllllIIlIIllllIIlIIIl().endsWith("Invalid session (Try restarting your game)")) {
            LunarClient.getInstance().IlIIlllllIIlIlIlllllIllll().IllIIIllIIIIlIlIlIllIIlll().IlIIIIIllllllIIlllIllllll().IlIllllllIIlIIllllIIlIIIl(null);
            LunarClient.getInstance().IlIIlllllIIlIlIlllllIllll().lIllllIIlIIIlIllllllIIIll();
            this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(new class_1893(false, "current", true));
            ((class_1893)this.lllIlIIlIIIlIlIIIllIlllIl.lllllIlllIIllIlIIlIIIllII).lllIIIllIIIIlllIlIIllIIll("You have an invalid session, please log back in.", 10000L);
        } else {
            this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(new class_0768(this.IlIllllllIIlIIllllIIlIIIl, "connect.failed", class_22552));
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0546 class_05462, class_0546 class_05463) {
        lllIIIllIIIIlllIlIIllIIll.debug("Switching protocol from " + (Object)((Object)class_05462) + " to " + (Object)((Object)class_05463));
        if (class_05463 == class_0546.lllIlIIlIIIlIlIIIllIlllIl) {
            this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(new class_1764(this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII));
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll() {
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0116 class_01162) {
        this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(class_01162.IlIllllllIIlIIllllIIlIIIl());
    }

    static /* synthetic */ class_0800 lllIIIllIIIIlllIlIIllIIll(class_0188 class_01882) {
        return class_01882.lIlllIlllIIIIlIIlllIllIII;
    }
}

