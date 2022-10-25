package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonParser
 */
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import optifine.Config;

public class class_1295
implements class_1286 {
    private String lllIIIllIIIIlllIlIIllIIll = null;

    public class_1295(String string) {
        this.lllIIIllIIIIlllIlIIllIIll = string;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(String string, byte[] arrby, Throwable throwable) {
        if (arrby != null) {
            try {
                String string2 = new String(arrby, "ASCII");
                JsonParser jsonParser = new JsonParser();
                JsonElement jsonElement = jsonParser.parse(string2);
                class_0896 class_08962 = new class_0896(this.lllIIIllIIIIlllIlIIllIIll);
                class_1925 class_19252 = class_08962.lllIIIllIIIIlllIlIIllIIll(jsonElement);
                if (class_19252 != null) {
                    class_19252.lllIIIllIIIIlllIlIIllIIll(true);
                    class_0384.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, class_19252);
                }
            }
            catch (Exception exception) {
                Config.lllIIIllIIIIlllIlIIllIIll("Error parsing configuration: " + string + ", " + exception.getClass().getName() + ": " + exception.getMessage());
            }
        }
    }
}

