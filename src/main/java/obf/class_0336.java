package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class class_0336
extends class_0703 {
    private GameProfile lllIIIllIIIIlllIlIIllIIll;

    public class_0336() {
    }

    public class_0336(GameProfile gameProfile) {
        this.lllIIIllIIIIlllIlIIllIIll = gameProfile;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0181 class_01812) {
        String string = class_01812.IlIllllllIIlIIllllIIlIIIl(36);
        String string2 = class_01812.IlIllllllIIlIIllllIIlIIIl(16);
        UUID uUID = UUID.fromString(string);
        this.lllIIIllIIIIlllIlIIllIIll = new GameProfile(uUID, string2);
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0181 class_01812) {
        UUID uUID = this.lllIIIllIIIIlllIlIIllIIll.getId();
        class_01812.lllIIIllIIIIlllIlIIllIIll(uUID == null ? "" : uUID.toString());
        class_01812.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll.getName());
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0774 class_07742) {
        class_07742.lllIIIllIIIIlllIlIIllIIll(this);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll() {
        return true;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_2075 class_20752) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0774)class_20752);
    }
}

