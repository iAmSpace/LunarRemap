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
import net.minecraft.util.IChatComponent;

import java.lang.reflect.Type;

public class class_0538
implements JsonDeserializer,
JsonSerializer {
    public class_0111 lllIIIllIIIIlllIlIIllIIll(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        JsonObject jsonObject = class_0463.IlIIIIIllllllIIlllIllllll(jsonElement, "status");
        class_0111 class_01112 = new class_0111();
        if (jsonObject.has("description")) {
            class_01112.lllIIIllIIIIlllIlIIllIIll((IChatComponent)jsonDeserializationContext.deserialize(jsonObject.get("description"), IChatComponent.class));
        }
        if (jsonObject.has("players")) {
            class_01112.lllIIIllIIIIlllIlIIllIIll((class_0305)jsonDeserializationContext.deserialize(jsonObject.get("players"), class_0305.class));
        }
        if (jsonObject.has("version")) {
            class_01112.lllIIIllIIIIlllIlIIllIIll((class_0496)jsonDeserializationContext.deserialize(jsonObject.get("version"), class_0496.class));
        }
        if (jsonObject.has("favicon")) {
            class_01112.lllIIIllIIIIlllIlIIllIIll(class_0463.IlIIIIIllllllIIlllIllllll(jsonObject, "favicon"));
        }
        if (jsonObject.has("lcServer")) {
            class_01112.lllIIIllIIIIlllIlIIllIIll = jsonObject.get("lcServer").getAsString();
        }
        return class_01112;
    }

    public JsonElement lllIIIllIIIIlllIlIIllIIll(class_0111 class_01112, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject = new JsonObject();
        if (class_01112.lllIIIllIIIIlllIlIIllIIll() != null) {
            jsonObject.add("description", jsonSerializationContext.serialize((Object)class_01112.lllIIIllIIIIlllIlIIllIIll()));
        }
        if (class_01112.lllIlIIlIIIlIlIIIllIlllIl() != null) {
            jsonObject.add("players", jsonSerializationContext.serialize((Object)class_01112.lllIlIIlIIIlIlIIIllIlllIl()));
        }
        if (class_01112.IlIllllllIIlIIllllIIlIIIl() != null) {
            jsonObject.add("version", jsonSerializationContext.serialize((Object)class_01112.IlIllllllIIlIIllllIIlIIIl()));
        }
        if (class_01112.lIlllIlllIIIIlIIlllIllIII() != null) {
            jsonObject.addProperty("favicon", class_01112.lIlllIlllIIIIlIIlllIllIII());
        }
        return jsonObject;
    }

    public JsonElement serialize(Object object, Type type, JsonSerializationContext jsonSerializationContext) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_0111)object, type, jsonSerializationContext);
    }

    public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return this.lllIIIllIIIIlllIlIIllIIll(jsonElement, type, jsonDeserializationContext);
    }
}

