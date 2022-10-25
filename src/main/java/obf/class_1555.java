package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.mojang.authlib.GameProfile
 */
import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class class_1555
extends class_1356 {
    public class_1555(GameProfile gameProfile) {
        super((Object)gameProfile);
    }

    public class_1555(JsonObject jsonObject) {
        super((Object)class_1555.lllIlIIlIIIlIlIIIllIlllIl(jsonObject), jsonObject);
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

