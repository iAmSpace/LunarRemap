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

public class class_0750
implements JsonDeserializer,
JsonSerializer {
    public class_0496 lllIIIllIIIIlllIlIIllIIll(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        JsonObject jsonObject = class_0463.IlIIIIIllllllIIlllIllllll(jsonElement, "version");
        return new class_0496(class_0463.IlIIIIIllllllIIlllIllllll(jsonObject, "name"), class_0463.IllIIlllllllIIlIIlIIIIlIl(jsonObject, "protocol"));
    }

    public JsonElement lllIIIllIIIIlllIlIIllIIll(class_0496 class_04962, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name", class_04962.lllIIIllIIIIlllIlIIllIIll());
        jsonObject.addProperty("protocol", (Number)class_04962.lllIlIIlIIIlIlIIIllIlllIl());
        return jsonObject;
    }

    public JsonElement serialize(Object object, Type type, JsonSerializationContext jsonSerializationContext) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_0496)object, type, jsonSerializationContext);
    }

    public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return this.lllIIIllIIIIlllIlIIllIIll(jsonElement, type, jsonDeserializationContext);
    }
}

