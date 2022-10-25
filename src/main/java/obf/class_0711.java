package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 */
import com.google.common.collect.Sets;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class class_0711
extends class_1287 {
    public class_1566 lllIIIllIIIIlllIlIIllIIll(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        boolean bl;
        String string;
        String string2;
        String string3;
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        HashSet hashSet = Sets.newHashSet();
        Iterator iterator = jsonObject.entrySet().iterator();
        do {
            if (!iterator.hasNext()) {
                return new class_1566(hashSet);
            }
            Map.Entry entry = (Map.Entry)iterator.next();
            string3 = (String)entry.getKey();
            JsonObject jsonObject2 = class_0463.IlIIIIIllllllIIlllIllllll((JsonElement)entry.getValue(), "language");
            string2 = class_0463.IlIIIIIllllllIIlllIllllll(jsonObject2, "region");
            string = class_0463.IlIIIIIllllllIIlllIllllll(jsonObject2, "name");
            bl = class_0463.lllIIIllIIIIlllIlIIllIIll(jsonObject2, "bidirectional", false);
            if (string2.isEmpty()) {
                throw new JsonParseException("Invalid language->'" + string3 + "'->region: empty value");
            }
            if (!string.isEmpty()) continue;
            throw new JsonParseException("Invalid language->'" + string3 + "'->name: empty value");
        } while (hashSet.add(new class_1977(string3, string2, string, bl)));
        throw new JsonParseException("Duplicate language->'" + string3 + "' defined");
    }

    @Override
    public String lllIIIllIIIIlllIlIIllIIll() {
        return "language";
    }

    public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return this.lllIIIllIIIIlllIlIIllIIll(jsonElement, type, jsonDeserializationContext);
    }
}

