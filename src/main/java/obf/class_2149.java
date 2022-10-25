package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 *  org.apache.commons.io.IOUtils
 */
import com.google.common.collect.Maps;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Map;
import org.apache.commons.io.IOUtils;

public class class_2149
implements class_2234 {
    private final Map lllIIIllIIIIlllIlIIllIIll = Maps.newHashMap();
    private final ResourceLocation lllIlIIlIIIlIlIIIllIlllIl;
    private final InputStream IlIllllllIIlIIllllIIlIIIl;
    private final InputStream lIlllIlllIIIIlIIlllIllIII;
    private final class_0233 IlIIIIIllllllIIlllIllllll;
    private boolean lIllllIIlIIIlIllllllIIIll;
    private JsonObject IIIllIIlIIIIIIlIlIIllIIlI;

    public class_2149(ResourceLocation class_17732, InputStream inputStream, InputStream inputStream2, class_0233 class_02332) {
        this.lllIlIIlIIIlIlIIIllIlllIl = class_17732;
        this.IlIllllllIIlIIllllIIlIIIl = inputStream;
        this.lIlllIlllIIIIlIIlllIllIII = inputStream2;
        this.IlIIIIIllllllIIlllIllllll = class_02332;
    }

    @Override
    public InputStream getInputStream() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    @Override
    public boolean lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lIlllIlllIIIIlIIlllIllIII != null;
    }

    @Override
    public class_1574 lllIIIllIIIIlllIlIIllIIll(String string) {
        Object object;
        if (!this.lllIlIIlIIIlIlIIIllIlllIl()) {
            return null;
        }
        if (this.IIIllIIlIIIIIIlIlIIllIIlI == null && !this.lIllllIIlIIIlIllllllIIIll) {
            this.lIllllIIlIIIlIllllllIIIll = true;
            object = null;
            try {
                object = new BufferedReader(new InputStreamReader(this.lIlllIlllIIIIlIIlllIllIII));
                this.IIIllIIlIIIIIIlIlIIllIIlI = new JsonParser().parse((Reader)object).getAsJsonObject();
            }
            finally {
                IOUtils.closeQuietly((Reader)object);
            }
        }
        if ((object = (class_1574)this.lllIIIllIIIIlllIlIIllIIll.get(string)) == null) {
            object = this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(string, this.IIIllIIlIIIIIIlIlIIllIIlI);
        }
        return object;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof class_2149) {
            class_2149 class_21492 = (class_2149)object;
            return this.lllIlIIlIIIlIlIIIllIlllIl != null ? this.lllIlIIlIIIlIlIIIllIlllIl.equals(class_21492.lllIlIIlIIIlIlIIIllIlllIl) : class_21492.lllIlIIlIIIlIlIIIllIlllIl == null;
        }
        return false;
    }

    public int hashCode() {
        return this.lllIlIIlIIIlIlIIIllIlllIl == null ? 0 : this.lllIlIIlIIIlIlIIIllIlllIl.hashCode();
    }
}

