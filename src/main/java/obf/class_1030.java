package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
import com.google.gson.JsonObject;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;

public abstract class class_1030
implements class_1239 {
    private Object lllIIIllIIIIlllIlIIllIIll;
    private Object lllIlIIlIIIlIlIIIllIlllIl;
    private String IlIllllllIIlIIllllIIlIIIl;
    private String lIlllIlllIIIIlIIlllIllIII;
    private String IlIIIIIllllllIIlllIllllll;
    private Optional lIllllIIlIIIlIllllllIIIll = Optional.empty();

    public class_1030(String string, String string2, Object object) {
        this.IlIllllllIIlIIllllIIlIIIl = string;
        this.lIlllIlllIIIIlIIlllIllIII = string2;
        this.lllIIIllIIIIlllIlIIllIIll = this.lllIlIIlIIIlIlIIIllIlllIl = object;
    }

    public void lllIIIllIIIIlllIlIIllIIll(Consumer consumer) {
        this.lIllllIIlIIIlIllllllIIIll = Optional.of(consumer);
    }

    public abstract void lllIIIllIIIIlllIlIIllIIll(String var1);

    public void lllIIIllIIIIlllIlIIllIIll(Object object) {
        if (!Objects.equals(this.lllIIIllIIIIlllIlIIllIIll, object)) {
            this.lllIIIllIIIIlllIlIIllIIll = object;
            this.lIllllIIlIIIlIllllllIIIll.ifPresent(consumer -> consumer.accept(object));
        }
    }

    public Object lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(JsonObject jsonObject) {
        jsonObject.addProperty(this.IlIllllllIIlIIllllIIlIIIl, this.lllIIIllIIIIlllIlIIllIIll.toString());
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(JsonObject jsonObject) {
        this.lllIIIllIIIIlllIlIIllIIll(jsonObject.getAsString());
    }

    public void lllIlIIlIIIlIlIIIllIlllIl() {
        this.lllIIIllIIIIlllIlIIllIIll = this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    protected Object IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    protected Object lIlllIlllIIIIlIIlllIllIII() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public String IlIIIIIllllllIIlllIllllll() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public String lIllllIIlIIIlIllllllIIIll() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(String string) {
        this.IlIIIIIllllllIIlllIllllll = string;
    }

    public String IIIllIIlIIIIIIlIlIIllIIlI() {
        return this.IlIIIIIllllllIIlllIllllll;
    }
}

