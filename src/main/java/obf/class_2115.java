package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonPrimitive
 *  com.google.gson.JsonSerializationContext
 *  com.google.gson.JsonSerializer
 */
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import net.minecraft.util.IChatComponent;

import java.lang.reflect.Type;

public class class_2115
implements JsonDeserializer,
JsonSerializer {
    public class_1401 lllIIIllIIIIlllIlIIllIIll(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        if (jsonElement.isJsonObject()) {
            Object object;
            class_1936 class_19362;
            JsonPrimitive jsonPrimitive;
            JsonObject jsonObject;
            class_1401 class_14012 = new class_1401();
            JsonObject jsonObject2 = jsonElement.getAsJsonObject();
            if (jsonObject2 == null) {
                return null;
            }
            if (jsonObject2.has("bold")) {
                class_1401.lllIIIllIIIIlllIlIIllIIll(class_14012, jsonObject2.get("bold").getAsBoolean());
            }
            if (jsonObject2.has("italic")) {
                class_1401.lllIlIIlIIIlIlIIIllIlllIl(class_14012, jsonObject2.get("italic").getAsBoolean());
            }
            if (jsonObject2.has("underlined")) {
                class_1401.IlIllllllIIlIIllllIIlIIIl(class_14012, jsonObject2.get("underlined").getAsBoolean());
            }
            if (jsonObject2.has("strikethrough")) {
                class_1401.lIlllIlllIIIIlIIlllIllIII(class_14012, jsonObject2.get("strikethrough").getAsBoolean());
            }
            if (jsonObject2.has("obfuscated")) {
                class_1401.IlIIIIIllllllIIlllIllllll(class_14012, jsonObject2.get("obfuscated").getAsBoolean());
            }
            if (jsonObject2.has("color")) {
                class_1401.lllIIIllIIIIlllIlIIllIIll(class_14012, (class_1227)((Object)jsonDeserializationContext.deserialize(jsonObject2.get("color"), class_1227.class)));
            }
            if (jsonObject2.has("clickEvent") && (jsonObject = jsonObject2.getAsJsonObject("clickEvent")) != null) {
                String string;
                jsonPrimitive = jsonObject.getAsJsonPrimitive("action");
                class_19362 = jsonPrimitive == null ? null : class_1936.lllIIIllIIIIlllIlIIllIIll(jsonPrimitive.getAsString());
                object = jsonObject.getAsJsonPrimitive("value");
                String string2 = string = object == null ? null : object.getAsString();
                if (class_19362 != null && string != null && class_19362.lllIIIllIIIIlllIlIIllIIll()) {
                    class_1401.lllIIIllIIIIlllIlIIllIIll(class_14012, new class_0203(class_19362, string));
                }
            }
            if (jsonObject2.has("hoverEvent") && (jsonObject = jsonObject2.getAsJsonObject("hoverEvent")) != null) {
                jsonPrimitive = jsonObject.getAsJsonPrimitive("action");
                class_19362 = jsonPrimitive == null ? null : class_0248.lllIIIllIIIIlllIlIIllIIll(jsonPrimitive.getAsString());
                object = (IChatComponent)jsonDeserializationContext.deserialize(jsonObject.get("value"), IChatComponent.class);
                if (class_19362 != null && object != null && ((class_0248)((Object)class_19362)).lllIIIllIIIIlllIlIIllIIll()) {
                    class_1401.lllIIIllIIIIlllIlIIllIIll(class_14012, new class_0015((class_0248)((Object)class_19362), (IChatComponent)object));
                }
            }
            return class_14012;
        }
        return null;
    }

    public JsonElement lllIIIllIIIIlllIlIIllIIll(class_1401 class_14012, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject;
        if (class_14012.IIIllIIlIIIIIIlIlIIllIIlI()) {
            return null;
        }
        JsonObject jsonObject2 = new JsonObject();
        if (class_1401.lllIlIIlIIIlIlIIIllIlllIl(class_14012) != null) {
            jsonObject2.addProperty("bold", class_1401.lllIlIIlIIIlIlIIIllIlllIl(class_14012));
        }
        if (class_1401.IlIllllllIIlIIllllIIlIIIl(class_14012) != null) {
            jsonObject2.addProperty("italic", class_1401.IlIllllllIIlIIllllIIlIIIl(class_14012));
        }
        if (class_1401.lIlllIlllIIIIlIIlllIllIII(class_14012) != null) {
            jsonObject2.addProperty("underlined", class_1401.lIlllIlllIIIIlIIlllIllIII(class_14012));
        }
        if (class_1401.IlIIIIIllllllIIlllIllllll(class_14012) != null) {
            jsonObject2.addProperty("strikethrough", class_1401.IlIIIIIllllllIIlllIllllll(class_14012));
        }
        if (class_1401.lIllllIIlIIIlIllllllIIIll(class_14012) != null) {
            jsonObject2.addProperty("obfuscated", class_1401.lIllllIIlIIIlIllllllIIIll(class_14012));
        }
        if (class_1401.IIIllIIlIIIIIIlIlIIllIIlI(class_14012) != null) {
            jsonObject2.add("color", jsonSerializationContext.serialize((Object)class_1401.IIIllIIlIIIIIIlIlIIllIIlI(class_14012)));
        }
        if (class_1401.IllIIlllllllIIlIIlIIIIlIl(class_14012) != null) {
            jsonObject = new JsonObject();
            jsonObject.addProperty("action", class_1401.IllIIlllllllIIlIIlIIIIlIl(class_14012).lllIIIllIIIIlllIlIIllIIll().lllIlIIlIIIlIlIIIllIlllIl());
            jsonObject.addProperty("value", class_1401.IllIIlllllllIIlIIlIIIIlIl(class_14012).lllIlIIlIIIlIlIIIllIlllIl());
            jsonObject2.add("clickEvent", (JsonElement)jsonObject);
        }
        if (class_1401.IIIllIllIIlIlIlIlIllllIIl(class_14012) != null) {
            jsonObject = new JsonObject();
            jsonObject.addProperty("action", class_1401.IIIllIllIIlIlIlIlIllllIIl(class_14012).lllIIIllIIIIlllIlIIllIIll().lllIlIIlIIIlIlIIIllIlllIl());
            jsonObject.add("value", jsonSerializationContext.serialize((Object)class_1401.IIIllIllIIlIlIlIlIllllIIl(class_14012).lllIlIIlIIIlIlIIIllIlllIl()));
            jsonObject2.add("hoverEvent", (JsonElement)jsonObject);
        }
        return jsonObject2;
    }

    public JsonElement serialize(Object object, Type type, JsonSerializationContext jsonSerializationContext) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_1401)object, type, jsonSerializationContext);
    }

    public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return this.lllIIIllIIIIlllIlIIllIIll(jsonElement, type, jsonDeserializationContext);
    }
}

