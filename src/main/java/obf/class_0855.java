package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 */
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class class_0855
extends class_1287 {
    public class_1561 lllIIIllIIIIlllIlIIllIIll(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        boolean bl = class_0463.lllIIIllIIIIlllIlIIllIIll(jsonObject, "blur", false);
        boolean bl2 = class_0463.lllIIIllIIIIlllIlIIllIIll(jsonObject, "clamp", false);
        ArrayList arrayList = Lists.newArrayList();
        if (jsonObject.has("mipmaps")) {
            try {
                JsonArray jsonArray = jsonObject.getAsJsonArray("mipmaps");
                for (int i = 0; i < jsonArray.size(); ++i) {
                    JsonElement jsonElement2 = jsonArray.get(i);
                    if (jsonElement2.isJsonPrimitive()) {
                        try {
                            arrayList.add(jsonElement2.getAsInt());
                            continue;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw new JsonParseException("Invalid texture->mipmap->" + i + ": expected number, was " + (Object)jsonElement2, (Throwable)numberFormatException);
                        }
                    }
                    if (!jsonElement2.isJsonObject()) continue;
                    throw new JsonParseException("Invalid texture->mipmap->" + i + ": expected number, was " + (Object)jsonElement2);
                }
            }
            catch (ClassCastException classCastException) {
                throw new JsonParseException("Invalid texture->mipmaps: expected array, was " + (Object)jsonObject.get("mipmaps"), (Throwable)classCastException);
            }
        }
        return new class_1561(bl, bl2, arrayList);
    }

    @Override
    public String lllIIIllIIIIlllIlIIllIIll() {
        return "texture";
    }

    public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return this.lllIIIllIIIIlllIlIIllIIll(jsonElement, type, jsonDeserializationContext);
    }
}

