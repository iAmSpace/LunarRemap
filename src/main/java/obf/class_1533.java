package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSerializationContext
 *  com.google.gson.JsonSerializer
 *  com.mojang.authlib.GameProfile
 */
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.mojang.authlib.GameProfile;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.util.Date;
import java.util.UUID;

class class_1533
implements JsonDeserializer,
JsonSerializer {
    final /* synthetic */ class_2119 lllIIIllIIIIlllIlIIllIIll;

    private class_1533(class_2119 class_21192) {
        this.lllIIIllIIIIlllIlIIllIIll = class_21192;
    }

    public JsonElement lllIIIllIIIIlllIlIIllIIll(class_1435 class_14352, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name", class_14352.lllIIIllIIIIlllIlIIllIIll().getName());
        UUID uUID = class_14352.lllIIIllIIIIlllIlIIllIIll().getId();
        jsonObject.addProperty("uuid", uUID == null ? "" : uUID.toString());
        jsonObject.addProperty("expiresOn", class_2119.lllIIIllIIIIlllIlIIllIIll.format(class_14352.lllIlIIlIIIlIlIIIllIlllIl()));
        return jsonObject;
    }

    public class_1435 lllIIIllIIIIlllIlIIllIIll(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        if (jsonElement.isJsonObject()) {
            JsonObject jsonObject = jsonElement.getAsJsonObject();
            JsonElement jsonElement2 = jsonObject.get("name");
            JsonElement jsonElement3 = jsonObject.get("uuid");
            JsonElement jsonElement4 = jsonObject.get("expiresOn");
            if (jsonElement2 != null && jsonElement3 != null) {
                String string = jsonElement3.getAsString();
                String string2 = jsonElement2.getAsString();
                Date date = null;
                if (jsonElement4 != null) {
                    try {
                        date = class_2119.lllIIIllIIIIlllIlIIllIIll.parse(jsonElement4.getAsString());
                    }
                    catch (ParseException parseException) {
                        date = null;
                    }
                }
                if (string2 != null && string != null) {
                    UUID uUID;
                    try {
                        uUID = UUID.fromString(string);
                    }
                    catch (Throwable throwable) {
                        return null;
                    }
                    class_2119 class_21192 = this.lllIIIllIIIIlllIlIIllIIll;
                    class_21192.getClass();
                    class_1435 class_14352 = new class_1435(class_21192, new GameProfile(uUID, string2), date, null);
                    return class_14352;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public JsonElement serialize(Object object, Type type, JsonSerializationContext jsonSerializationContext) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_1435)object, type, jsonSerializationContext);
    }

    public Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return this.lllIIIllIIIIlllIlIIllIIll(jsonElement, type, jsonDeserializationContext);
    }

    class_1533(class_2119 class_21192, Object object) {
        this(class_21192);
    }
}

