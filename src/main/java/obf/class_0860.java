package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.properties.Property
 */
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import java.util.UUID;

public final class class_0860 {
    public static GameProfile lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        UUID uUID;
        String string = null;
        String string2 = null;
        if (class_07752.lllIlIIlIIIlIlIIIllIlllIl("Name", 8)) {
            string = class_07752.IllIIIllIIIIlIlIlIllIIlll("Name");
        }
        if (class_07752.lllIlIIlIIIlIlIIIllIlllIl("Id", 8)) {
            string2 = class_07752.IllIIIllIIIIlIlIlIllIIlll("Id");
        }
        if (class_1911.lllIlIIlIIIlIlIIIllIlllIl(string) && class_1911.lllIlIIlIIIlIlIIIllIlllIl(string2)) {
            return null;
        }
        try {
            uUID = UUID.fromString(string2);
        }
        catch (Throwable throwable) {
            uUID = null;
        }
        GameProfile gameProfile = new GameProfile(uUID, string);
        if (class_07752.lllIlIIlIIIlIlIIIllIlllIl("Properties", 10)) {
            class_0775 class_07753 = class_07752.llIIllIllIlIIlIIllIllllll("Properties");
            for (String string3 : class_07753.lIlllIlllIIIIlIIlllIllIII()) {
                class_2145 class_21452 = class_07753.IlIllllllIIlIIllllIIlIIIl(string3, 10);
                for (int i = 0; i < class_21452.lIlllIlllIIIIlIIlllIllIII(); ++i) {
                    class_0775 class_07754 = class_21452.lllIlIIlIIIlIlIIIllIlllIl(i);
                    String string4 = class_07754.IllIIIllIIIIlIlIlIllIIlll("Value");
                    if (class_07754.lllIlIIlIIIlIlIIIllIlllIl("Signature", 8)) {
                        gameProfile.getProperties().put((Object)string3, (Object)new Property(string3, string4, class_07754.IllIIIllIIIIlIlIlIllIIlll("Signature")));
                        continue;
                    }
                    gameProfile.getProperties().put((Object)string3, (Object)new Property(string3, string4));
                }
            }
        }
        return gameProfile;
    }

    public static void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752, GameProfile gameProfile) {
        if (!class_1911.lllIlIIlIIIlIlIIIllIlllIl(gameProfile.getName())) {
            class_07752.lllIIIllIIIIlllIlIIllIIll("Name", gameProfile.getName());
        }
        if (gameProfile.getId() != null) {
            class_07752.lllIIIllIIIIlllIlIIllIIll("Id", gameProfile.getId().toString());
        }
        if (!gameProfile.getProperties().isEmpty()) {
            class_0775 class_07753 = new class_0775();
            for (String string : gameProfile.getProperties().keySet()) {
                class_2145 class_21452 = new class_2145();
                for (Property property : gameProfile.getProperties().get((Object)string)) {
                    class_0775 class_07754 = new class_0775();
                    class_07754.lllIIIllIIIIlllIlIIllIIll("Value", property.getValue());
                    if (property.hasSignature()) {
                        class_07754.lllIIIllIIIIlllIlIIllIIll("Signature", property.getSignature());
                    }
                    class_21452.lllIIIllIIIIlllIlIIllIIll(class_07754);
                }
                class_07753.lllIIIllIIIIlllIlIIllIIll(string, class_21452);
            }
            class_07752.lllIIIllIIIIlllIlIIllIIll("Properties", class_07753);
        }
    }
}

