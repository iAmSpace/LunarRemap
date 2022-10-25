package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
import com.google.gson.JsonObject;
import java.util.Date;

public class class_2227
extends class_0277 {
    public class_2227(String string) {
        this(string, (Date)null, (String)null, (Date)null, (String)null);
    }

    public class_2227(String string, Date date, String string2, Date date2, String string3) {
        super(string, date, string2, date2, string3);
    }

    public class_2227(JsonObject jsonObject) {
        super(class_2227.lllIlIIlIIIlIlIIIllIlllIl(jsonObject), jsonObject);
    }

    private static String lllIlIIlIIIlIlIIIllIlllIl(JsonObject jsonObject) {
        return jsonObject.has("ip") ? jsonObject.get("ip").getAsString() : null;
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(JsonObject jsonObject) {
        if (this.lIlllIlllIIIIlIIlllIllIII() != null) {
            jsonObject.addProperty("ip", (String)this.lIlllIlllIIIIlIIlllIllIII());
            super.lllIIIllIIIIlllIlIIllIIll(jsonObject);
        }
    }
}

