package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 */
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class class_1077
extends class_0688 {
    private String lllIIIllIIIIlllIlIIllIIll;
    private JsonArray IlIllllllIIlIIllllIIlIIIl;

    public class_1077() {
    }

    public class_1077(String string) {
        this.lllIIIllIIIIlllIlIIllIIll = string;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0181 class_01812) {
        class_01812.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll);
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0181 class_01812) {
        this.lllIIIllIIIIlllIlIIllIIll = class_01812.IlIllllllIIlIIllllIIlIIIl(32767);
        JsonObject jsonObject = new JsonParser().parse(this.lllIIIllIIIIlllIlIIllIIll).getAsJsonObject();
        this.IlIllllllIIlIIllllIIlIIIl = jsonObject.getAsJsonArray("bulk");
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1982 class_19822) {
        class_19822.lllIIIllIIIIlllIlIIllIIll(this);
    }

    public JsonArray lllIIIllIIIIlllIlIIllIIll() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }
}

