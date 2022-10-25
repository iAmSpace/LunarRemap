package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.mojang.authlib.GameProfile
 */
import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.util.Date;
import java.util.UUID;

public class class_0216
extends class_0277 {
    public class_0216(GameProfile gameProfile) {
        this(gameProfile, (Date)null, (String)null, (Date)null, (String)null);
    }

    public class_0216(GameProfile gameProfile, Date date, String string, Date date2, String string2) {
        super((Object)gameProfile, date2, string, date2, string2);
    }

    public class_0216(JsonObject jsonObject) {
        super((Object)class_0216.lllIlIIlIIIlIlIIIllIlllIl(jsonObject), jsonObject);
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(JsonObject jsonObject) {
        if (this.lIlllIlllIIIIlIIlllIllIII() != null) {
            jsonObject.addProperty("uuid", ((GameProfile)this.lIlllIlllIIIIlIIlllIllIII()).getId() == null ? "" : ((GameProfile)this.lIlllIlllIIIIlIIlllIllIII()).getId().toString());
            jsonObject.addProperty("name", ((GameProfile)this.lIlllIlllIIIIlIIlllIllIII()).getName());
            super.lllIIIllIIIIlllIlIIllIIll(jsonObject);
        }
    }

    private static GameProfile lllIlIIlIIIlIlIIIllIlllIl(JsonObject jsonObject) {
        if (jsonObject.has("uuid") && jsonObject.has("name")) {
            UUID uUID;
            String string = jsonObject.get("uuid").getAsString();
            try {
                uUID = UUID.fromString(string);
            }
            catch (Throwable throwable) {
                return null;
            }
            return new GameProfile(uUID, jsonObject.get("name").getAsString());
        }
        return null;
    }
}

