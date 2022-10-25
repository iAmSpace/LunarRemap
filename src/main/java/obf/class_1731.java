package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.io.Files
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonObject
 *  org.apache.commons.io.IOUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.base.Charsets;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.io.Files;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.ParameterizedType;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_1731 {
    protected static final Logger lllIIIllIIIIlllIlIIllIIll = LogManager.getLogger();
    protected final Gson lllIlIIlIIIlIlIIIllIlllIl;
    private final File IlIllllllIIlIIllllIIlIIIl;
    private final Map lIlllIlllIIIIlIIlllIllIII = Maps.newHashMap();
    private boolean IlIIIIIllllllIIlllIllllll = true;
    private static final ParameterizedType lIllllIIlIIIlIllllllIIIll = new class_0347();

    public class_1731(File file) {
        this.IlIllllllIIlIIllllIIlIIIl = file;
        GsonBuilder gsonBuilder = new GsonBuilder().setPrettyPrinting();
        gsonBuilder.registerTypeHierarchyAdapter(class_1356.class, (Object)new class_0815(this, null));
        this.lllIlIIlIIIlIlIIIllIlllIl = gsonBuilder.create();
    }

    public boolean lllIIIllIIIIlllIlIIllIIll() {
        return this.IlIIIIIllllllIIlllIllllll;
    }

    public void lllIIIllIIIIlllIlIIllIIll(boolean bl) {
        this.IlIIIIIllllllIIlllIllllll = bl;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1356 class_13562) {
        this.lIlllIlllIIIIlIIlllIllIII.put(this.IlIllllllIIlIIllllIIlIIIl(class_13562.lIlllIlllIIIIlIIlllIllIII()), class_13562);
        try {
            this.lIlllIlllIIIIlIIlllIllIII();
        }
        catch (IOException iOException) {
            lllIIIllIIIIlllIlIIllIIll.warn("Could not save the list after adding a user.", (Throwable)iOException);
        }
    }

    public class_1356 lllIIIllIIIIlllIlIIllIIll(Object object) {
        this.IlIIIIIllllllIIlllIllllll();
        return (class_1356)this.lIlllIlllIIIIlIIlllIllIII.get(this.IlIllllllIIlIIllllIIlIIIl(object));
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(Object object) {
        this.lIlllIlllIIIIlIIlllIllIII.remove(this.IlIllllllIIlIIllllIIlIIIl(object));
        try {
            this.lIlllIlllIIIIlIIlllIllIII();
        }
        catch (IOException iOException) {
            lllIIIllIIIIlllIlIIllIIll.warn("Could not save the list after removing a user.", (Throwable)iOException);
        }
    }

    public String[] lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lIlllIlllIIIIlIIlllIllIII.keySet().toArray(new String[this.lIlllIlllIIIIlIIlllIllIII.size()]);
    }

    protected String IlIllllllIIlIIllllIIlIIIl(Object object) {
        return object.toString();
    }

    protected boolean lIlllIlllIIIIlIIlllIllIII(Object object) {
        return this.lIlllIlllIIIIlIIlllIllIII.containsKey(this.IlIllllllIIlIIllllIIlIIIl(object));
    }

    private void IlIIIIIllllllIIlllIllllll() {
        ArrayList arrayList = Lists.newArrayList();
        for (Object object : this.lIlllIlllIIIIlIIlllIllIII.values()) {
            if (!((class_1356)object).IlIllllllIIlIIllllIIlIIIl()) continue;
            arrayList.add(((class_1356)object).lIlllIlllIIIIlIIlllIllIII());
        }
        for (Object object : arrayList) {
            this.lIlllIlllIIIIlIIlllIllIII.remove(object);
        }
    }

    protected class_1356 lllIIIllIIIIlllIlIIllIIll(JsonObject jsonObject) {
        return new class_1356(null, jsonObject);
    }

    protected Map IlIllllllIIlIIllllIIlIIIl() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void lIlllIlllIIIIlIIlllIllIII() {
        Collection collection = this.lIlllIlllIIIIlIIlllIllIII.values();
        String string = this.lllIlIIlIIIlIlIIIllIlllIl.toJson(collection);
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = Files.newWriter((File)this.IlIllllllIIlIIllllIIlIIIl, (Charset)Charsets.UTF_8);
            bufferedWriter.write(string);
        }
        catch (Throwable throwable) {
            IOUtils.closeQuietly(bufferedWriter);
            throw throwable;
        }
        IOUtils.closeQuietly((Writer)bufferedWriter);
    }
}

