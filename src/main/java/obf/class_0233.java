package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.TypeAdapterFactory
 */
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapterFactory;
import net.minecraft.util.IChatComponent;

import java.lang.reflect.Type;

public class class_0233 {
    private final class_1737 lllIIIllIIIIlllIlIIllIIll = new class_0265();
    private final GsonBuilder lllIlIIlIIIlIlIIIllIlllIl = new GsonBuilder();
    private Gson IlIllllllIIlIIllllIIlIIIl;

    public class_0233() {
        this.lllIlIIlIIIlIlIIIllIlllIl.registerTypeHierarchyAdapter(IChatComponent.class, (Object)new class_2095());
        this.lllIlIIlIIIlIlIIIllIlllIl.registerTypeHierarchyAdapter(class_1401.class, (Object)new class_2115());
        this.lllIlIIlIIIlIlIIIllIlllIl.registerTypeAdapterFactory((TypeAdapterFactory)new class_1351());
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1122 class_11222, Class class_) {
        this.lllIIIllIIIIlllIlIIllIIll.putObject(class_11222.lllIIIllIIIIlllIlIIllIIll(), new class_0418(this, class_11222, class_, null));
        this.lllIlIIlIIIlIlIIIllIlllIl.registerTypeAdapter((Type)class_, (Object)class_11222);
        this.IlIllllllIIlIIllllIIlIIIl = null;
    }

    public class_1574 lllIIIllIIIIlllIlIIllIIll(String string, JsonObject jsonObject) {
        if (string == null) {
            throw new IllegalArgumentException("Metadata section name cannot be null");
        }
        if (!jsonObject.has(string)) {
            return null;
        }
        if (!jsonObject.get(string).isJsonObject()) {
            throw new IllegalArgumentException("Invalid metadata for '" + string + "' - expected object, found " + (Object)jsonObject.get(string));
        }
        class_0418 class_04182 = (class_0418)this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(string);
        if (class_04182 == null) {
            throw new IllegalArgumentException("Don't know how to handle metadata section '" + string + "'");
        }
        return (class_1574)this.lllIIIllIIIIlllIlIIllIIll().fromJson((JsonElement)jsonObject.getAsJsonObject(string), class_04182.lllIlIIlIIIlIlIIIllIlllIl);
    }

    private Gson lllIIIllIIIIlllIlIIllIIll() {
        if (this.IlIllllllIIlIIllllIIlIIIl == null) {
            this.IlIllllllIIlIIllllIIlIIIl = this.lllIlIIlIIIlIlIIIllIlllIl.create();
        }
        return this.IlIllllllIIlIIllllIIlIIIl;
    }
}

