package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Splitter
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Maps
 *  org.apache.commons.io.Charsets
 *  org.apache.commons.io.IOUtils
 */
import com.google.common.base.Splitter;
import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.IllegalFormatException;
import java.util.Map;
import java.util.regex.Pattern;
import org.apache.commons.io.Charsets;
import org.apache.commons.io.IOUtils;

public class class_1311 {
    private static final Pattern lllIIIllIIIIlllIlIIllIIll = Pattern.compile("%(\\d+\\$)?[\\d\\.]*[df]");
    private static final Splitter lllIlIIlIIIlIlIIIllIlllIl = Splitter.on((char)'=').limit(2);
    private static class_1311 IlIllllllIIlIIllllIIlIIIl = new class_1311();
    private final Map lIlllIlllIIIIlIIlllIllIII = Maps.newHashMap();
    private long IlIIIIIllllllIIlllIllllll;

    public class_1311() {
        try {
            InputStream inputStream = class_1311.class.getResourceAsStream("/assets/minecraft/lang/en_US.lang");
            if (inputStream == null && class_0298.IlIllllllIIlIIllllIIlIIIl("assets/minecraft/lang/en_US.lang")) {
                inputStream = new ByteArrayInputStream(class_0298.lllIIIllIIIIlllIlIIllIIll("assets/minecraft/lang/en_US.lang"));
            }
            for (String string : IOUtils.readLines((InputStream)inputStream, (Charset)Charsets.UTF_8)) {
                String[] arrstring;
                if (string.isEmpty() || string.charAt(0) == '#' || (arrstring = (String[])Iterables.toArray((Iterable)lllIlIIlIIIlIlIIIllIlllIl.split((CharSequence)string), String.class)) == null || arrstring.length != 2) continue;
                String string2 = arrstring[0];
                String string3 = lllIIIllIIIIlllIlIIllIIll.matcher(arrstring[1]).replaceAll("%$1s");
                this.lIlllIlllIIIIlIIlllIllIII.put(string2, string3);
            }
            this.IlIIIIIllllllIIlllIllllll = System.currentTimeMillis();
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }

    static class_1311 lllIIIllIIIIlllIlIIllIIll() {
        return IlIllllllIIlIIllllIIlIIIl;
    }

    public static synchronized void lllIIIllIIIIlllIlIIllIIll(Map map) {
        class_1311.IlIllllllIIlIIllllIIlIIIl.lIlllIlllIIIIlIIlllIllIII.clear();
        class_1311.IlIllllllIIlIIllllIIlIIIl.lIlllIlllIIIIlIIlllIllIII.putAll(map);
        class_1311.IlIllllllIIlIIllllIIlIIIl.IlIIIIIllllllIIlllIllllll = System.currentTimeMillis();
    }

    public synchronized String lllIIIllIIIIlllIlIIllIIll(String string) {
        return this.IlIllllllIIlIIllllIIlIIIl(string);
    }

    public synchronized String lllIIIllIIIIlllIlIIllIIll(String string, Object ... arrobject) {
        String string2 = this.IlIllllllIIlIIllllIIlIIIl(string);
        try {
            return String.format(string2, arrobject);
        }
        catch (IllegalFormatException illegalFormatException) {
            return "Format error: " + string2;
        }
    }

    private String IlIllllllIIlIIllllIIlIIIl(String string) {
        String string2 = (String)this.lIlllIlllIIIIlIIlllIllIII.get(string);
        return string2 == null ? string : string2;
    }

    public synchronized boolean lllIlIIlIIIlIlIIIllIlllIl(String string) {
        return this.lIlllIlllIIIIlIIlllIllIII.containsKey(string);
    }

    public long lllIlIIlIIIlIlIIIllIlllIl() {
        return this.IlIIIIIllllllIIlllIllllll;
    }
}

