package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.TypeAdapter
 *  com.google.gson.stream.JsonReader
 *  com.google.gson.stream.JsonToken
 *  com.google.gson.stream.JsonWriter
 */
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.util.HashMap;

class class_1642
extends TypeAdapter {
    final /* synthetic */ HashMap lllIIIllIIIIlllIlIIllIIll;
    final /* synthetic */ class_1351 lllIlIIlIIIlIlIIIllIlllIl;

    class_1642(class_1351 class_13512, HashMap hashMap) {
        this.lllIlIIlIIIlIlIIIllIlllIl = class_13512;
        this.lllIIIllIIIIlllIlIIllIIll = hashMap;
    }

    public void write(JsonWriter jsonWriter, Object object) {
        if (object == null) {
            jsonWriter.nullValue();
        } else {
            jsonWriter.value(class_1351.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl, object));
        }
    }

    public Object read(JsonReader jsonReader) {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        return this.lllIIIllIIIIlllIlIIllIIll.get(jsonReader.nextString());
    }
}

