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
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.IllegalFormatException;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import net.minecraft.util.ResourceLocation;
import org.apache.commons.io.Charsets;
import org.apache.commons.io.IOUtils;

public class class_1715 {
    private static final Splitter lllIlIIlIIIlIlIIIllIlllIl = Splitter.on((char)'=').limit(2);
    private static final Pattern IlIllllllIIlIIllllIIlIIIl = Pattern.compile("%(\\d+\\$)?[\\d\\.]*[df]");
    Map lllIIIllIIIIlllIlIIllIIll = Maps.newHashMap();
    private boolean lIlllIlllIIIIlIIlllIllIII;

    public synchronized void lllIIIllIIIIlllIlIIllIIll(class_0947 class_09472, List list) {
        this.lllIIIllIIIIlllIlIIllIIll.clear();
        for (String string : list) {
            String string2 = String.format("lang/%s.lang", string);
            for (String string3 : class_09472.lllIIIllIIIIlllIlIIllIIll()) {
                try {
                    this.lllIIIllIIIIlllIlIIllIIll(class_09472.lllIlIIlIIIlIlIIIllIlllIl(new ResourceLocation(string3, string2)));
                }
                catch (IOException iOException) {}
            }
        }
        this.lllIlIIlIIIlIlIIIllIlllIl();
    }

    public boolean lllIIIllIIIIlllIlIIllIIll() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    private void lllIlIIlIIIlIlIIIllIlllIl() {
        this.lIlllIlllIIIIlIIlllIllIII = false;
        int n = 0;
        int n2 = 0;
        for (String string : this.lllIIIllIIIIlllIlIIllIIll.values()) {
            int n3 = string.length();
            n2 += n3;
            for (int i = 0; i < n3; ++i) {
                if (string.charAt(i) < '\u0100') continue;
                ++n;
            }
        }
        float f = (float)n / (float)n2;
        this.lIlllIlllIIIIlIIlllIllIII = (double)f > 0.1;
    }

    private void lllIIIllIIIIlllIlIIllIIll(List list) {
        for (class_2234 class_22342 : list) {
            this.lllIIIllIIIIlllIlIIllIIll(class_22342.getInputStream());
        }
    }

    private void lllIIIllIIIIlllIlIIllIIll(InputStream inputStream) {
        for (String string : IOUtils.readLines((InputStream)inputStream, (Charset)Charsets.UTF_8)) {
            String[] arrstring;
            if (string.isEmpty() || string.charAt(0) == '#' || (arrstring = (String[])Iterables.toArray((Iterable)lllIlIIlIIIlIlIIIllIlllIl.split((CharSequence)string), String.class)) == null || arrstring.length != 2) continue;
            String string2 = arrstring[0];
            String string3 = IlIllllllIIlIIllllIIlIIIl.matcher(arrstring[1]).replaceAll("%$1s");
            this.lllIIIllIIIIlllIlIIllIIll.put(string2, string3);
        }
    }

    private String lllIIIllIIIIlllIlIIllIIll(String string) {
        String string2 = (String)this.lllIIIllIIIIlllIlIIllIIll.get(string);
        return string2 == null ? string : string2;
    }

    public String lllIIIllIIIIlllIlIIllIIll(String string, Object[] arrobject) {
        String string2 = this.lllIIIllIIIIlllIlIIllIIll(string);
        try {
            return String.format(string2, arrobject);
        }
        catch (IllegalFormatException illegalFormatException) {
            return "Format error: " + string2;
        }
    }
}

