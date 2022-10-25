package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class class_1222
extends class_0703 {
    private GameProfile lllIIIllIIIIlllIlIIllIIll;

    public class_1222() {
    }

    public class_1222(GameProfile gameProfile) {
        this.lllIIIllIIIIlllIlIIllIIll = gameProfile;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0181 class_01812) {
        this.lllIIIllIIIIlllIlIIllIIll = new GameProfile((UUID)null, class_01812.IlIllllllIIlIIllllIIlIIIl(16));
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0181 class_01812) {
        class_01812.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll.getName());
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1647 class_16472) {
        class_16472.lllIIIllIIIIlllIlIIllIIll(this);
    }

    public GameProfile IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_2075 class_20752) {
        this.lllIIIllIIIIlllIlIIllIIll((class_1647)class_20752);
    }
}

