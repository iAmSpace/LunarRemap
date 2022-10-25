package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterables
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.properties.Property
 */
import com.google.common.collect.Iterables;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import java.util.UUID;

public class class_0090
extends class_1774 {
    private int IllIIlllllllIIlIIlIIIIlIl;
    private int IIIllIllIIlIlIlIlIllllIIl;
    private GameProfile IllIIIllIIIIlIlIlIllIIlll = null;

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        super.lllIlIIlIIIlIlIIIllIlllIl(class_07752);
        class_07752.lllIIIllIIIIlllIlIIllIIll("SkullType", (byte)(this.IllIIlllllllIIlIIlIIIIlIl & 0xFF));
        class_07752.lllIIIllIIIIlllIlIIllIIll("Rot", (byte)(this.IIIllIllIIlIlIlIlIllllIIl & 0xFF));
        if (this.IllIIIllIIIIlIlIlIllIIlll != null) {
            class_0775 class_07753 = new class_0775();
            class_0860.lllIIIllIIIIlllIlIIllIIll(class_07753, this.IllIIIllIIIIlIlIlIllIIlll);
            class_07752.lllIIIllIIIIlllIlIIllIIll("Owner", class_07753);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        super.lllIIIllIIIIlllIlIIllIIll(class_07752);
        this.IllIIlllllllIIlIIlIIIIlIl = class_07752.lIlllIlllIIIIlIIlllIllIII("SkullType");
        this.IIIllIllIIlIlIlIlIllllIIl = class_07752.lIlllIlllIIIIlIIlllIllIII("Rot");
        if (this.IllIIlllllllIIlIIlIIIIlIl == 3) {
            if (class_07752.lllIlIIlIIIlIlIIIllIlllIl("Owner", 10)) {
                this.IllIIIllIIIIlIlIlIllIIlll = class_0860.lllIIIllIIIIlllIlIIllIIll(class_07752.llIIllIllIlIIlIIllIllllll("Owner"));
            } else if (class_07752.lllIlIIlIIIlIlIIIllIlllIl("ExtraType", 8) && !class_1911.lllIlIIlIIIlIlIIIllIlllIl(class_07752.IllIIIllIIIIlIlIlIllIIlll("ExtraType"))) {
                this.IllIIIllIIIIlIlIlIllIIlll = new GameProfile((UUID)null, class_07752.IllIIIllIIIIlIlIlIllIIlll("ExtraType"));
                this.IlIlllIIIIIIlIIllIIllIlll();
            }
        }
    }

    public GameProfile lllIIIllIIIIlllIlIIllIIll() {
        return this.IllIIIllIIIIlIlIlIllIIlll;
    }

    @Override
    public class_0703 IllIIlllllllIIlIIlIIIIlIl() {
        class_0775 class_07752 = new class_0775();
        this.lllIlIIlIIIlIlIIIllIlllIl(class_07752);
        return new class_1180(this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, 4, class_07752);
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n) {
        this.IllIIlllllllIIlIIlIIIIlIl = n;
        this.IllIIIllIIIIlIlIlIllIIlll = null;
    }

    public void lllIIIllIIIIlllIlIIllIIll(GameProfile gameProfile) {
        this.IllIIlllllllIIlIIlIIIIlIl = 3;
        this.IllIIIllIIIIlIlIlIllIIlll = gameProfile;
        this.IlIlllIIIIIIlIIllIIllIlll();
    }

    private void IlIlllIIIIIIlIIllIIllIlll() {
        GameProfile gameProfile;
        if (!(this.IllIIIllIIIIlIlIlIllIIlll == null || class_1911.lllIlIIlIIIlIlIIIllIlllIl(this.IllIIIllIIIIlIlIlIllIIlll.getName()) || this.IllIIIllIIIIlIlIlIllIIlll.isComplete() && this.IllIIIllIIIIlIlIlIllIIlll.getProperties().containsKey((Object)"textures") || (gameProfile = class_0220.IlIIlllllIIlIlIlllllIllll().IlIIllIlIlIllIIIlIIlIlIIl().lllIIIllIIIIlllIlIIllIIll(this.IllIIIllIIIIlIlIlIllIIlll.getName())) == null)) {
            Property property = (Property)Iterables.getFirst((Iterable)gameProfile.getProperties().get((Object)"textures"), null);
            if (property == null) {
                gameProfile = class_0220.IlIIlllllIIlIlIlllllIllll().llllIlIIllIIlllllIIllIIll().fillProfileProperties(gameProfile, true);
            }
            this.IllIIIllIIIIlIlIlIllIIlll = gameProfile;
            this.llIIlIllIllllIlIIIIlIIlll();
        }
    }

    public int IlIIIIIllllllIIlllIllllll() {
        return this.IllIIlllllllIIlIIlIIIIlIl;
    }

    public int lllIIlIIIllllllIIIIlIlIlI() {
        return this.IIIllIllIIlIlIlIlIllllIIl;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(int n) {
        this.IIIllIllIIlIlIlIlIllllIIl = n;
    }
}

