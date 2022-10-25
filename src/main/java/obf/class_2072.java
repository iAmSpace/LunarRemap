package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  org.apache.commons.lang3.Validate
 */
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import org.apache.commons.lang3.Validate;

public class class_2072
extends class_1287 {
    public class_2194 lllIIIllIIIIlllIlIIllIIll(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        float[] arrf = new float[256];
        float[] arrf2 = new float[256];
        float[] arrf3 = new float[256];
        float f = 1.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        if (jsonObject.has("characters")) {
            if (!jsonObject.get("characters").isJsonObject()) {
                throw new JsonParseException("Invalid font->characters: expected object, was " + (Object)jsonObject.get("characters"));
            }
            JsonObject jsonObject2 = jsonObject.getAsJsonObject("characters");
            if (jsonObject2.has("default")) {
                if (!jsonObject2.get("default").isJsonObject()) {
                    throw new JsonParseException("Invalid font->characters->default: expected object, was " + (Object)jsonObject2.get("default"));
                }
                JsonObject jsonObject3 = jsonObject2.getAsJsonObject("default");
                f = class_0463.lllIIIllIIIIlllIlIIllIIll(jsonObject3, "width", f);
                Validate.inclusiveBetween((Object)Float.valueOf(0.0f), (Object)Float.valueOf(Float.MAX_VALUE), (Comparable)Float.valueOf(f), (String)"Invalid default width", (Object[])new Object[0]);
                f2 = class_0463.lllIIIllIIIIlllIlIIllIIll(jsonObject3, "spacing", f2);
                Validate.inclusiveBetween((Object)Float.valueOf(0.0f), (Object)Float.valueOf(Float.MAX_VALUE), (Comparable)Float.valueOf(f2), (String)"Invalid default spacing", (Object[])new Object[0]);
                f3 = class_0463.lllIIIllIIIIlllIlIIllIIll(jsonObject3, "left", f2);
                Validate.inclusiveBetween((Object)Float.valueOf(0.0f), (Object)Float.valueOf(Float.MAX_VALUE), (Comparable)Float.valueOf(f3), (String)"Invalid default left", (Object[])new Object[0]);
            }
            for (int i = 0; i < 256; ++i) {
                JsonElement jsonElement2 = jsonObject2.get(Integer.toString(i));
                float f4 = f;
                float f5 = f2;
                float f6 = f3;
                if (jsonElement2 != null) {
                    JsonObject jsonObject4 = class_0463.IlIIIIIllllllIIlllIllllll(jsonElement2, "characters[" + i + "]");
                    f4 = class_0463.lllIIIllIIIIlllIlIIllIIll(jsonObject4, "width", f);
                    Validate.inclusiveBetween((Object)Float.valueOf(0.0f), (Object)Float.valueOf(Float.MAX_VALUE), (Comparable)Float.valueOf(f4), (String)"Invalid width", (Object[])new Object[0]);
                    f5 = class_0463.lllIIIllIIIIlllIlIIllIIll(jsonObject4, "spacing", f2);
                    Validate.inclusiveBetween((Object)Float.valueOf(0.0f), (Object)Float.valueOf(Float.MAX_VALUE), (Comparable)Float.valueOf(f5), (String)"Invalid spacing", (Object[])new Object[0]);
                    f6 = class_0463.lllIIIllIIIIlllIlIIllIIll(jsonObject4, "left", f3);
                    Validate.inclusiveBetween((Object)Float.valueOf(0.0f), (Object)Float.valueOf(Float.MAX_VALUE), (Comparable)Float.valueOf(f6), (String)"Invalid left", (Object[])new Object[0]);
                }
                arrf[i] = f4;
                arrf2[i] = f5;
                arrf3[i] = f6;
            }
        }
        return new class_2194(arrf, arrf3, arrf2);
    }

    @Override
    public String lllIIIllIIIIlllIlIIllIIll() {
        return "font";
    }

    public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return this.lllIIIllIIIIlllIlIIllIIll(jsonElement, type, jsonDeserializationContext);
    }
}

