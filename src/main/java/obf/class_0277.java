package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
import com.google.gson.JsonObject;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class class_0277
extends class_1356 {
    public static final SimpleDateFormat lllIIIllIIIIlllIlIIllIIll = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
    protected final Date lllIlIIlIIIlIlIIIllIlllIl;
    protected final String IlIllllllIIlIIllllIIlIIIl;
    protected final Date lIlllIlllIIIIlIIlllIllIII;
    protected final String IlIIIIIllllllIIlllIllllll;

    public class_0277(Object object, Date date, String string, Date date2, String string2) {
        super(object);
        this.lllIlIIlIIIlIlIIIllIlllIl = date == null ? new Date() : date;
        this.IlIllllllIIlIIllllIIlIIIl = string == null ? "(Unknown)" : string;
        this.lIlllIlllIIIIlIIlllIllIII = date2;
        this.IlIIIIIllllllIIlllIllllll = string2 == null ? "Banned by an operator." : string2;
    }

    protected class_0277(Object object, JsonObject jsonObject) {
        super(object, jsonObject);
        Date date;
        Date date2;
        try {
            date2 = jsonObject.has("created") ? lllIIIllIIIIlllIlIIllIIll.parse(jsonObject.get("created").getAsString()) : new Date();
        }
        catch (ParseException parseException) {
            date2 = new Date();
        }
        this.lllIlIIlIIIlIlIIIllIlllIl = date2;
        this.IlIllllllIIlIIllllIIlIIIl = jsonObject.has("source") ? jsonObject.get("source").getAsString() : "(Unknown)";
        try {
            date = jsonObject.has("expires") ? lllIIIllIIIIlllIlIIllIIll.parse(jsonObject.get("expires").getAsString()) : null;
        }
        catch (ParseException parseException) {
            date = null;
        }
        this.lIlllIlllIIIIlIIlllIllIII = date;
        this.IlIIIIIllllllIIlllIllllll = jsonObject.has("reason") ? jsonObject.get("reason").getAsString() : "Banned by an operator.";
    }

    public Date lllIIIllIIIIlllIlIIllIIll() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    public String lllIlIIlIIIlIlIIIllIlllIl() {
        return this.IlIIIIIllllllIIlllIllllll;
    }

    @Override
    boolean IlIllllllIIlIIllllIIlIIIl() {
        return this.lIlllIlllIIIIlIIlllIllIII == null ? false : this.lIlllIlllIIIIlIIlllIllIII.before(new Date());
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(JsonObject jsonObject) {
        jsonObject.addProperty("created", lllIIIllIIIIlllIlIIllIIll.format(this.lllIlIIlIIIlIlIIIllIlllIl));
        jsonObject.addProperty("source", this.IlIllllllIIlIIllllIIlIIIl);
        jsonObject.addProperty("expires", this.lIlllIlllIIIIlIIlllIllIII == null ? "forever" : lllIIIllIIIIlllIlIIllIIll.format(this.lIlllIlllIIIIlIIlllIllIII));
        jsonObject.addProperty("reason", this.IlIIIIIllllllIIlllIllllll);
    }
}

