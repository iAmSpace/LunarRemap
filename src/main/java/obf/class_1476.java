package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSerializationContext
 *  com.google.gson.JsonSerializer
 */
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import net.minecraft.util.IChatComponent;

import java.lang.reflect.Type;

public class class_1476
extends class_1287
implements JsonSerializer {
    public class_1866 lllIIIllIIIIlllIlIIllIIll(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        IChatComponent class_22552 = (IChatComponent)jsonDeserializationContext.deserialize(jsonObject.get("description"), IChatComponent.class);
        int n = class_0463.IllIIlllllllIIlIIlIIIIlIl(jsonObject, "pack_format");
        return new class_1866(class_22552, n);
    }

    public JsonElement lllIIIllIIIIlllIlIIllIIll(class_1866 class_18662, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("pack_format", (Number)class_18662.lllIlIIlIIIlIlIIIllIlllIl());
        jsonObject.add("description", jsonSerializationContext.serialize((Object)class_18662.lllIIIllIIIIlllIlIIllIIll()));
        return jsonObject;
    }

    @Override
    public String lllIIIllIIIIlllIlIIllIIll() {
        return "pack";
    }

    public JsonElement serialize(Object object, Type type, JsonSerializationContext jsonSerializationContext) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_1866)object, type, jsonSerializationContext);
    }

    public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return this.lllIIIllIIIIlllIlIIllIIll(jsonElement, type, jsonDeserializationContext);
    }
}

