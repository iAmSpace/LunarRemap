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
 */
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

class class_0815
implements JsonDeserializer,
JsonSerializer {
    final /* synthetic */ class_1731 lllIIIllIIIIlllIlIIllIIll;

    private class_0815(class_1731 class_17312) {
        this.lllIIIllIIIIlllIlIIllIIll = class_17312;
    }

    public JsonElement lllIIIllIIIIlllIlIIllIIll(class_1356 class_13562, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject = new JsonObject();
        class_13562.lllIIIllIIIIlllIlIIllIIll(jsonObject);
        return jsonObject;
    }

    public class_1356 lllIIIllIIIIlllIlIIllIIll(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        if (jsonElement.isJsonObject()) {
            JsonObject jsonObject = jsonElement.getAsJsonObject();
            class_1356 class_13562 = this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(jsonObject);
            return class_13562;
        }
        return null;
    }

    public JsonElement serialize(Object object, Type type, JsonSerializationContext jsonSerializationContext) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_1356)object, type, jsonSerializationContext);
    }

    public Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return this.lllIIIllIIIIlllIlIIllIIll(jsonElement, type, jsonDeserializationContext);
    }

    class_0815(class_1731 class_17312, Object object) {
        this(class_17312);
    }
}

