package net.minecraft.util;

import com.google.common.collect.ForwardingSet;
import com.google.common.collect.Sets;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;

import java.util.Iterator;
import java.util.Set;

public class JsonSerializableSet extends ForwardingSet implements IJsonSerializable {
    private final Set underlyingSet = Sets.newHashSet();

    @Override
    public void func_152753_a(JsonElement p_152753_1_) {
        if (p_152753_1_.isJsonArray()) {
            Iterator<JsonElement> iterator = p_152753_1_.getAsJsonArray().iterator();

            while (iterator.hasNext()) {
                JsonElement element = iterator.next();
                this.add(element.getAsString());
            }
        }
    }

    @Override
    public JsonElement getSerializableElement() {
        JsonArray jsonarray = new JsonArray();
        Iterator<String> iterator = this.iterator();

        while (iterator.hasNext()) {
            String s = iterator.next();
            jsonarray.add(new JsonPrimitive(s));
        }

        return jsonarray;
    }

    protected Set delegate() {
        return this.underlyingSet;
    }
}

