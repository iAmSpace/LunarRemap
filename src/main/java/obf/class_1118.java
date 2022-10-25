package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.beans.ConstructorProperties;

public class class_1118 {
    private final String lllIIIllIIIIlllIlIIllIIll;
    private final JsonObject lllIlIIlIIIlIlIIIllIlllIl = new JsonObject();

    public class_1118 lllIIIllIIIIlllIlIIllIIll(String string, String string2) {
        this.lllIlIIlIIIlIlIIIllIlllIl.addProperty(string, string2);
        return this;
    }

    public class_1118 lllIIIllIIIIlllIlIIllIIll(String string, JsonElement jsonElement) {
        this.lllIlIIlIIIlIlIIIllIlllIl.add(string, jsonElement);
        return this;
    }

    public class_1118 lllIIIllIIIIlllIlIIllIIll(String string, Number number) {
        this.lllIlIIlIIIlIlIIIllIlllIl.addProperty(string, number);
        return this;
    }

    public class_1118 lllIIIllIIIIlllIlIIllIIll(String string, Boolean bl) {
        this.lllIlIIlIIIlIlIIIllIlllIl.addProperty(string, bl);
        return this;
    }

    public class_1118 lllIIIllIIIIlllIlIIllIIll(String string, Character c) {
        this.lllIlIIlIIIlIlIIIllIlllIl.addProperty(string, c);
        return this;
    }

    public String lllIIIllIIIIlllIlIIllIIll() {
        this.lllIlIIlIIIlIlIIIllIlllIl.addProperty("action", this.lllIIIllIIIIlllIlIIllIIll);
        return this.lllIlIIlIIIlIlIIIllIlllIl.toString();
    }

    @ConstructorProperties(value={"action"})
    class_1118(String string) {
        this.lllIIIllIIIIlllIlIIllIIll = string;
    }

    public static class_0455 lllIlIIlIIIlIlIIIllIlllIl() {
        return new class_0455();
    }

    public String IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }
}

