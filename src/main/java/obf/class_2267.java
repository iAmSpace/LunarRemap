package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
import com.mojang.authlib.GameProfile;
import java.net.SocketAddress;

public class class_2267
extends class_2116 {
    private class_0775 IIIllIIlIIIIIIlIlIIllIIlI;

    public class_2267(IntegratedServer class_05192) {
        super(class_05192);
        this.lllIIIllIIIIlllIlIIllIIll(10);
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1822 class_18222) {
        if (class_18222.llllIIIIlIIIlIIIIIIlIllll().equals(this.lllIIIllIIIIlllIlIIllIIll().IIIIIIIIlIllIIllIIlllIllI())) {
            this.IIIllIIlIIIIIIlIlIIllIIlI = new class_0775();
            class_18222.IlIIIIIllllllIIlllIllllll(this.IIIllIIlIIIIIIlIlIIllIIlI);
        }
        super.lllIIIllIIIIlllIlIIllIIll(class_18222);
    }

    @Override
    public String lllIIIllIIIIlllIlIIllIIll(SocketAddress socketAddress, GameProfile gameProfile) {
        return gameProfile.getName().equalsIgnoreCase(this.lllIIIllIIIIlllIlIIllIIll().IIIIIIIIlIllIIllIIlllIllI()) && this.lllIIIllIIIIlllIlIIllIIll(gameProfile.getName()) != null ? "That name is already taken." : super.lllIIIllIIIIlllIlIIllIIll(socketAddress, gameProfile);
    }

    public IntegratedServer lllIIIllIIIIlllIlIIllIIll() {
        return (IntegratedServer)super.IlIllllllIIlIIllllIIlIIIl();
    }

    @Override
    public class_0775 lllIlIIlIIIlIlIIIllIlllIl() {
        return this.IIIllIIlIIIIIIlIlIIllIIlI;
    }

    @Override
    public /* synthetic */ class_0220 IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIIIllIIIIlllIlIIllIIll();
    }
}

