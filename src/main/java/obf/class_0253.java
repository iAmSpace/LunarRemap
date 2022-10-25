package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSerializationContext
 *  com.google.gson.JsonSerializer
 *  com.mojang.authlib.GameProfile
 */
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.mojang.authlib.GameProfile;
import java.lang.reflect.Type;
import java.util.UUID;

public class class_0253
implements JsonDeserializer,
JsonSerializer {
    public class_0305 lllIIIllIIIIlllIlIIllIIll(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        JsonArray jsonArray;
        JsonObject jsonObject = class_0463.IlIIIIIllllllIIlllIllllll(jsonElement, "players");
        class_0305 class_03052 = new class_0305(class_0463.IllIIlllllllIIlIIlIIIIlIl(jsonObject, "max"), class_0463.IllIIlllllllIIlIIlIIIIlIl(jsonObject, "online"));
        if (class_0463.lllIlIIlIIIlIlIIIllIlllIl(jsonObject, "sample") && (jsonArray = class_0463.IllIIIllIIIIlIlIlIllIIlll(jsonObject, "sample")).size() > 0) {
            GameProfile[] arrgameProfile = new GameProfile[jsonArray.size()];
            for (int i = 0; i < arrgameProfile.length; ++i) {
                JsonObject jsonObject2 = class_0463.IlIIIIIllllllIIlllIllllll(jsonArray.get(i), "player[" + i + "]");
                String string = class_0463.IlIIIIIllllllIIlllIllllll(jsonObject2, "id");
                arrgameProfile[i] = new GameProfile(UUID.fromString(string), class_0463.IlIIIIIllllllIIlllIllllll(jsonObject2, "name"));
            }
            class_03052.lllIIIllIIIIlllIlIIllIIll(arrgameProfile);
        }
        return class_03052;
    }

    public JsonElement lllIIIllIIIIlllIlIIllIIll(class_0305 class_03052, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("max", (Number)class_03052.lllIIIllIIIIlllIlIIllIIll());
        jsonObject.addProperty("online", (Number)class_03052.lllIlIIlIIIlIlIIIllIlllIl());
        if (class_03052.IlIllllllIIlIIllllIIlIIIl() != null && class_03052.IlIllllllIIlIIllllIIlIIIl().length > 0) {
            JsonArray jsonArray = new JsonArray();
            for (int i = 0; i < class_03052.IlIllllllIIlIIllllIIlIIIl().length; ++i) {
                JsonObject jsonObject2 = new JsonObject();
                UUID uUID = class_03052.IlIllllllIIlIIllllIIlIIIl()[i].getId();
                jsonObject2.addProperty("id", uUID == null ? "" : uUID.toString());
                jsonObject2.addProperty("name", class_03052.IlIllllllIIlIIllllIIlIIIl()[i].getName());
                jsonArray.add((JsonElement)jsonObject2);
            }
            jsonObject.add("sample", (JsonElement)jsonArray);
        }
        return jsonObject;
    }

    public JsonElement serialize(Object object, Type type, JsonSerializationContext jsonSerializationContext) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_0305)object, type, jsonSerializationContext);
    }

    public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return this.lllIIIllIIIIlllIlIIllIIll(jsonElement, type, jsonDeserializationContext);
    }
}

