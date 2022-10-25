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
 *  com.google.gson.JsonPrimitive
 *  com.google.gson.JsonSerializationContext
 *  com.google.gson.JsonSerializer
 *  org.apache.commons.lang3.Validate
 */
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.ArrayList;
import org.apache.commons.lang3.Validate;

public class class_0183
extends class_1287
implements JsonSerializer {
    public class_0762 lllIIIllIIIIlllIlIIllIIll(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        int n;
        ArrayList arrayList = Lists.newArrayList();
        JsonObject jsonObject = class_0463.IlIIIIIllllllIIlllIllllll(jsonElement, "metadata section");
        int n2 = class_0463.lllIIIllIIIIlllIlIIllIIll(jsonObject, "frametime", 1);
        if (n2 != 1) {
            Validate.inclusiveBetween((Object)1, (Object)Integer.MAX_VALUE, (Comparable)Integer.valueOf(n2), (String)"Invalid default frame time", (Object[])new Object[0]);
        }
        if (jsonObject.has("frames")) {
            try {
                JsonArray jsonArray = class_0463.IllIIIllIIIIlIlIlIllIIlll(jsonObject, "frames");
                for (n = 0; n < jsonArray.size(); ++n) {
                    JsonElement jsonElement2 = jsonArray.get(n);
                    class_1451 class_14512 = this.lllIIIllIIIIlllIlIIllIIll(n, jsonElement2);
                    if (class_14512 == null) continue;
                    arrayList.add(class_14512);
                }
            }
            catch (ClassCastException classCastException) {
                throw new JsonParseException("Invalid animation->frames: expected array, was " + (Object)jsonObject.get("frames"), (Throwable)classCastException);
            }
        }
        int n3 = class_0463.lllIIIllIIIIlllIlIIllIIll(jsonObject, "width", -1);
        n = class_0463.lllIIIllIIIIlllIlIIllIIll(jsonObject, "height", -1);
        if (n3 != -1) {
            Validate.inclusiveBetween((Object)1, (Object)Integer.MAX_VALUE, (Comparable)Integer.valueOf(n3), (String)"Invalid width", (Object[])new Object[0]);
        }
        if (n != -1) {
            Validate.inclusiveBetween((Object)1, (Object)Integer.MAX_VALUE, (Comparable)Integer.valueOf(n), (String)"Invalid height", (Object[])new Object[0]);
        }
        return new class_0762(arrayList, n3, n, n2);
    }

    private class_1451 lllIIIllIIIIlllIlIIllIIll(int n, JsonElement jsonElement) {
        if (jsonElement.isJsonPrimitive()) {
            return new class_1451(class_0463.lIlllIlllIIIIlIIlllIllIII(jsonElement, "frames[" + n + "]"));
        }
        if (jsonElement.isJsonObject()) {
            JsonObject jsonObject = class_0463.IlIIIIIllllllIIlllIllllll(jsonElement, "frames[" + n + "]");
            int n2 = class_0463.lllIIIllIIIIlllIlIIllIIll(jsonObject, "time", -1);
            if (jsonObject.has("time")) {
                Validate.inclusiveBetween((Object)1, (Object)Integer.MAX_VALUE, (Comparable)Integer.valueOf(n2), (String)"Invalid frame time", (Object[])new Object[0]);
            }
            int n3 = class_0463.IllIIlllllllIIlIIlIIIIlIl(jsonObject, "index");
            Validate.inclusiveBetween((Object)0, (Object)Integer.MAX_VALUE, (Comparable)Integer.valueOf(n3), (String)"Invalid frame index", (Object[])new Object[0]);
            return new class_1451(n3, n2);
        }
        return null;
    }

    public JsonElement lllIIIllIIIIlllIlIIllIIll(class_0762 class_07622, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("frametime", (Number)class_07622.lIlllIlllIIIIlIIlllIllIII());
        if (class_07622.lllIlIIlIIIlIlIIIllIlllIl() != -1) {
            jsonObject.addProperty("width", (Number)class_07622.lllIlIIlIIIlIlIIIllIlllIl());
        }
        if (class_07622.lllIIIllIIIIlllIlIIllIIll() != -1) {
            jsonObject.addProperty("height", (Number)class_07622.lllIIIllIIIIlllIlIIllIIll());
        }
        if (class_07622.IlIllllllIIlIIllllIIlIIIl() > 0) {
            JsonArray jsonArray = new JsonArray();
            for (int i = 0; i < class_07622.IlIllllllIIlIIllllIIlIIIl(); ++i) {
                if (class_07622.lllIlIIlIIIlIlIIIllIlllIl(i)) {
                    JsonObject jsonObject2 = new JsonObject();
                    jsonObject2.addProperty("index", (Number)class_07622.IlIllllllIIlIIllllIIlIIIl(i));
                    jsonObject2.addProperty("time", (Number)class_07622.lllIIIllIIIIlllIlIIllIIll(i));
                    jsonArray.add((JsonElement)jsonObject2);
                    continue;
                }
                jsonArray.add((JsonElement)new JsonPrimitive((Number)class_07622.IlIllllllIIlIIllllIIlIIIl(i)));
            }
            jsonObject.add("frames", (JsonElement)jsonArray);
        }
        return jsonObject;
    }

    @Override
    public String lllIIIllIIIIlllIlIIllIIll() {
        return "animation";
    }

    public JsonElement serialize(Object object, Type type, JsonSerializationContext jsonSerializationContext) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_0762)object, type, jsonSerializationContext);
    }

    public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return this.lllIIIllIIIIlllIlIIllIIll(jsonElement, type, jsonDeserializationContext);
    }
}

