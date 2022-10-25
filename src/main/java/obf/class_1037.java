package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.exceptions.AuthenticationUnavailableException
 */
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.exceptions.AuthenticationUnavailableException;
import java.math.BigInteger;
import java.util.UUID;

class class_1037
extends Thread {
    final /* synthetic */ class_0296 lllIIIllIIIIlllIlIIllIIll;

    class_1037(class_0296 class_02962, String string) {
        this.lllIIIllIIIIlllIlIIllIIll = class_02962;
        super(string);
    }

    @Override
    public void run() {
        GameProfile gameProfile = class_0296.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll);
        try {
            String string = new BigInteger(class_0936.lllIIIllIIIIlllIlIIllIIll(class_0296.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll), class_0296.IlIllllllIIlIIllllIIlIIIl(this.lllIIIllIIIIlllIlIIllIIll).IllIIIIllIIllIllIlllIlIIl().getPublic(), class_0296.lIlllIlllIIIIlIIlllIllIII(this.lllIIIllIIIIlllIlIIllIIll))).toString(16);
            class_0296.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, class_0296.IlIllllllIIlIIllllIIlIIIl(this.lllIIIllIIIIlllIlIIllIIll).llllIlIIllIIlllllIIllIIll().hasJoinedServer(new GameProfile((UUID)null, gameProfile.getName()), string));
            if (class_0296.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll) != null) {
                class_0296.lIlllIlllIIIIlIIlllIllIII().info("UUID of player " + class_0296.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll).getName() + " is " + class_0296.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll).getId());
                class_0296.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, class_0966.lIlllIlllIIIIlIIlllIllIII);
            } else if (class_0296.IlIllllllIIlIIllllIIlIIIl(this.lllIIIllIIIIlllIlIIllIIll).llIIIlllIlllIlIllIIIIllIl()) {
                class_0296.lIlllIlllIIIIlIIlllIllIII().warn("Failed to verify username but will let them in anyway!");
                class_0296.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(gameProfile));
                class_0296.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, class_0966.lIlllIlllIIIIlIIlllIllIII);
            } else {
                this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll("Failed to verify username!");
                class_0296.lIlllIlllIIIIlIIlllIllIII().error("Username '" + class_0296.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll).getName() + "' tried to join with an invalid session");
            }
        }
        catch (AuthenticationUnavailableException authenticationUnavailableException) {
            if (class_0296.IlIllllllIIlIIllllIIlIIIl(this.lllIIIllIIIIlllIlIIllIIll).llIIIlllIlllIlIllIIIIllIl()) {
                class_0296.lIlllIlllIIIIlIIlllIllIII().warn("Authentication servers are down but will let them in anyway!");
                class_0296.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(gameProfile));
                class_0296.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, class_0966.lIlllIlllIIIIlIIlllIllIII);
            }
            this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll("Authentication servers are down. Please try again later, sorry!");
            class_0296.lIlllIlllIIIIlIIlllIllIII().error("Couldn't verify username because servers are unavailable");
        }
    }
}

