package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonPrimitive
 *  com.google.gson.JsonSerializationContext
 *  com.google.gson.JsonSerializer
 *  com.google.gson.TypeAdapterFactory
 */
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.TypeAdapterFactory;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.ChatComponentTranslation;

import java.lang.reflect.Type;
import java.util.Map;

public class class_2095
implements JsonDeserializer,
JsonSerializer {
    private static final Gson lllIIIllIIIIlllIlIIllIIll;

    public IChatComponent lllIIIllIIIIlllIlIIllIIll(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        String string;
        class_1014 class_10142;
        if (jsonElement.isJsonPrimitive()) {
            return new class_0722(jsonElement.getAsString());
        }
        if (!jsonElement.isJsonObject()) {
            if (jsonElement.isJsonArray()) {
                JsonArray jsonArray = jsonElement.getAsJsonArray();
                IChatComponent class_22552 = null;
                for (JsonElement jsonElement2 : jsonArray) {
                    IChatComponent class_22553 = this.lllIIIllIIIIlllIlIIllIIll(jsonElement2, jsonElement2.getClass(), jsonDeserializationContext);
                    if (class_22552 == null) {
                        class_22552 = class_22553;
                        continue;
                    }
                    class_22552.lllIIIllIIIIlllIlIIllIIll(class_22553);
                }
                return class_22552;
            }
            throw new JsonParseException("Don't know how to turn " + jsonElement.toString() + " into a Component");
        }
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        if (jsonObject.has("text")) {
            class_10142 = new class_0722(jsonObject.get("text").getAsString());
        } else {
            if (!jsonObject.has("translate")) {
                throw new JsonParseException("Don't know how to turn " + jsonElement.toString() + " into a Component");
            }
            string = jsonObject.get("translate").getAsString();
            if (jsonObject.has("with")) {
                JsonArray jsonArray = jsonObject.getAsJsonArray("with");
                Object[] arrobject = new Object[jsonArray.size()];
                for (int i = 0; i < arrobject.length; ++i) {
                    class_0722 class_07222;
                    arrobject[i] = this.lllIIIllIIIIlllIlIIllIIll(jsonArray.get(i), type, jsonDeserializationContext);
                    if (!(arrobject[i] instanceof class_0722) || !(class_07222 = (class_0722)arrobject[i]).lllIlIIlIIIlIlIIIllIlllIl().IIIllIIlIIIIIIlIlIIllIIlI() || !class_07222.lllIIIllIIIIlllIlIIllIIll().isEmpty()) continue;
                    arrobject[i] = class_07222.IlIIIIIllllllIIlllIllllll();
                }
                class_10142 = new ChatComponentTranslation(string, arrobject);
            } else {
                class_10142 = new ChatComponentTranslation(string, new Object[0]);
            }
        }
        if (jsonObject.has("extra")) {
            string = jsonObject.getAsJsonArray("extra");
            if (string.size() <= 0) {
                throw new JsonParseException("Unexpected empty array of components");
            }
            for (int i = 0; i < string.size(); ++i) {
                ((IChatComponent)class_10142).lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll(string.get(i), type, jsonDeserializationContext));
            }
        }
        ((IChatComponent)class_10142).lllIIIllIIIIlllIlIIllIIll((class_1401)jsonDeserializationContext.deserialize(jsonElement, class_1401.class));
        return class_10142;
    }

    private void lllIIIllIIIIlllIlIIllIIll(class_1401 class_14012, JsonObject jsonObject, JsonSerializationContext jsonSerializationContext) {
        JsonElement jsonElement = jsonSerializationContext.serialize((Object)class_14012);
        if (jsonElement.isJsonObject()) {
            JsonObject jsonObject2 = (JsonObject)jsonElement;
            for (Map.Entry entry : jsonObject2.entrySet()) {
                jsonObject.add((String)entry.getKey(), (JsonElement)entry.getValue());
            }
        }
    }

    public JsonElement lllIIIllIIIIlllIlIIllIIll(IChatComponent class_22552, Type type, JsonSerializationContext jsonSerializationContext) {
        Object object;
        if (class_22552 instanceof class_0722 && class_22552.lllIlIIlIIIlIlIIIllIlllIl().IIIllIIlIIIIIIlIlIIllIIlI() && class_22552.lllIIIllIIIIlllIlIIllIIll().isEmpty()) {
            return new JsonPrimitive(((class_0722)class_22552).IlIIIIIllllllIIlllIllllll());
        }
        JsonObject jsonObject = new JsonObject();
        if (!class_22552.lllIlIIlIIIlIlIIIllIlllIl().IIIllIIlIIIIIIlIlIIllIIlI()) {
            this.lllIIIllIIIIlllIlIIllIIll(class_22552.lllIlIIlIIIlIlIIIllIlllIl(), jsonObject, jsonSerializationContext);
        }
        if (!class_22552.lllIIIllIIIIlllIlIIllIIll().isEmpty()) {
            object = new JsonArray();
            for (Object[] arrobject : class_22552.lllIIIllIIIIlllIlIIllIIll()) {
                object.add(this.lllIIIllIIIIlllIlIIllIIll((IChatComponent)arrobject, arrobject.getClass(), jsonSerializationContext));
            }
            jsonObject.add("extra", (JsonElement)object);
        }
        if (class_22552 instanceof class_0722) {
            jsonObject.addProperty("text", ((class_0722)class_22552).IlIIIIIllllllIIlllIllllll());
        } else {
            if (!(class_22552 instanceof ChatComponentTranslation)) {
                throw new IllegalArgumentException("Don't know how to serialize " + class_22552 + " as a Component");
            }
            object = (ChatComponentTranslation)class_22552;
            jsonObject.addProperty("translate", ((ChatComponentTranslation)object).IllIIlllllllIIlIIlIIIIlIl());
            if (((ChatComponentTranslation)object).IllIIIllIIIIlIlIlIllIIlll() != null && ((ChatComponentTranslation)object).IllIIIllIIIIlIlIlIllIIlll().length > 0) {
                JsonArray jsonArray = new JsonArray();
                for (Object object2 : ((ChatComponentTranslation)object).IllIIIllIIIIlIlIlIllIIlll()) {
                    if (object2 instanceof IChatComponent) {
                        jsonArray.add(this.lllIIIllIIIIlllIlIIllIIll((IChatComponent)object2, object2.getClass(), jsonSerializationContext));
                        continue;
                    }
                    jsonArray.add((JsonElement)new JsonPrimitive(String.valueOf(object2)));
                }
                jsonObject.add("with", (JsonElement)jsonArray);
            }
        }
        return jsonObject;
    }

    public static String lllIIIllIIIIlllIlIIllIIll(IChatComponent class_22552) {
        return lllIIIllIIIIlllIlIIllIIll.toJson((Object)class_22552);
    }

    public static IChatComponent lllIIIllIIIIlllIlIIllIIll(String string) {
        return (IChatComponent)lllIIIllIIIIlllIlIIllIIll.fromJson(string, IChatComponent.class);
    }

    public JsonElement serialize(Object object, Type type, JsonSerializationContext jsonSerializationContext) {
        return this.lllIIIllIIIIlllIlIIllIIll((IChatComponent)object, type, jsonSerializationContext);
    }

    public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return this.lllIIIllIIIIlllIlIIllIIll(jsonElement, type, jsonDeserializationContext);
    }

    static {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeHierarchyAdapter(IChatComponent.class, (Object)new class_2095());
        gsonBuilder.registerTypeHierarchyAdapter(class_1401.class, (Object)new class_2115());
        gsonBuilder.registerTypeAdapterFactory((TypeAdapterFactory)new class_1351());
        lllIIIllIIIIlllIlIIllIIll = gsonBuilder.create();
    }
}

