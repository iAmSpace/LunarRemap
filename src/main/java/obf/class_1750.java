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

public class class_1750
extends class_1356 {
    private final int lllIIIllIIIIlllIlIIllIIll;

    public class_1750(GameProfile gameProfile, int n) {
        super((Object)gameProfile);
        this.lllIIIllIIIIlllIlIIllIIll = n;
    }

    public class_1750(JsonObject jsonObject) {
        super((Object)class_1750.lllIlIIlIIIlIlIIIllIlllIl(jsonObject), jsonObject);
        this.lllIIIllIIIIlllIlIIllIIll = jsonObject.has("level") ? jsonObject.get("level").getAsInt() : 0;
    }

    public int lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(JsonObject jsonObject) {
        if (this.lIlllIlllIIIIlIIlllIllIII() != null) {
            jsonObject.addProperty("uuid", ((GameProfile)this.lIlllIlllIIIIlIIlllIllIII()).getId() == null ? "" : ((GameProfile)this.lIlllIlllIIIIlIIlllIllIII()).getId().toString());
            jsonObject.addProperty("name", ((GameProfile)this.lIlllIlllIIIIlIIlllIllIII()).getName());
            super.lllIIIllIIIIlllIlIIllIIll(jsonObject);
            jsonObject.addProperty("level", (Number)this.lllIIIllIIIIlllIlIIllIIll);
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

