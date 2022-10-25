package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  org.apache.commons.lang3.Validate
 */
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.reflect.Type;
import org.apache.commons.lang3.Validate;

public class class_0004
implements JsonDeserializer {
    public class_0871 lllIIIllIIIIlllIlIIllIIll(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        JsonObject jsonObject = class_0463.IlIIIIIllllllIIlllIllllll(jsonElement, "entry");
        class_0871 class_08712 = new class_0871();
        class_08712.lllIIIllIIIIlllIlIIllIIll(class_0463.lllIIIllIIIIlllIlIIllIIll(jsonObject, "replace", false));
        class_0617 class_06172 = class_0617.lllIIIllIIIIlllIlIIllIIll(class_0463.lllIIIllIIIIlllIlIIllIIll(jsonObject, "category", class_0617.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll()));
        class_08712.lllIIIllIIIIlllIlIIllIIll(class_06172);
        Validate.notNull((Object)((Object)class_06172), (String)"Invalid category", (Object[])new Object[0]);
        if (jsonObject.has("sounds")) {
            JsonArray jsonArray = class_0463.IllIIIllIIIIlIlIlIllIIlll(jsonObject, "sounds");
            for (int i = 0; i < jsonArray.size(); ++i) {
                JsonElement jsonElement2 = jsonArray.get(i);
                class_2190 class_21902 = new class_2190();
                if (class_0463.lllIIIllIIIIlllIlIIllIIll(jsonElement2)) {
                    class_21902.lllIIIllIIIIlllIlIIllIIll(class_0463.lllIIIllIIIIlllIlIIllIIll(jsonElement2, "sound"));
                } else {
                    JsonObject jsonObject2 = class_0463.IlIIIIIllllllIIlllIllllll(jsonElement2, "sound");
                    class_21902.lllIIIllIIIIlllIlIIllIIll(class_0463.IlIIIIIllllllIIlllIllllll(jsonObject2, "name"));
                    if (jsonObject2.has("type")) {
                        class_1601 class_16012 = class_1601.lllIIIllIIIIlllIlIIllIIll(class_0463.IlIIIIIllllllIIlllIllllll(jsonObject2, "type"));
                        Validate.notNull((Object)((Object)class_16012), (String)"Invalid type", (Object[])new Object[0]);
                        class_21902.lllIIIllIIIIlllIlIIllIIll(class_16012);
                    }
                    if (jsonObject2.has("volume")) {
                        float f = class_0463.IIIllIIlIIIIIIlIlIIllIIlI(jsonObject2, "volume");
                        Validate.isTrue((f > 0.0f ? 1 : 0) != 0, (String)"Invalid volume", (Object[])new Object[0]);
                        class_21902.lllIIIllIIIIlllIlIIllIIll(f);
                    }
                    if (jsonObject2.has("pitch")) {
                        float f = class_0463.IIIllIIlIIIIIIlIlIIllIIlI(jsonObject2, "pitch");
                        Validate.isTrue((f > 0.0f ? 1 : 0) != 0, (String)"Invalid pitch", (Object[])new Object[0]);
                        class_21902.lllIlIIlIIIlIlIIIllIlllIl(f);
                    }
                    if (jsonObject2.has("weight")) {
                        int n = class_0463.IllIIlllllllIIlIIlIIIIlIl(jsonObject2, "weight");
                        Validate.isTrue((n > 0 ? 1 : 0) != 0, (String)"Invalid weight", (Object[])new Object[0]);
                        class_21902.lllIIIllIIIIlllIlIIllIIll(n);
                    }
                    if (jsonObject2.has("stream")) {
                        class_21902.lllIIIllIIIIlllIlIIllIIll(class_0463.lIllllIIlIIIlIllllllIIIll(jsonObject2, "stream"));
                    }
                }
                class_08712.lllIIIllIIIIlllIlIIllIIll().add(class_21902);
            }
        }
        return class_08712;
    }

    public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return this.lllIIIllIIIIlllIlIIllIIll(jsonElement, type, jsonDeserializationContext);
    }
}

