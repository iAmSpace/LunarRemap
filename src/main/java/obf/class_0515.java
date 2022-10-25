package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import net.minecraft.util.ChatComponentTranslation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_0515
implements class_0044 {
    private static final Logger lllIIIllIIIIlllIlIIllIIll = LogManager.getLogger();
    private final Map lllIlIIlIIIlIlIIIllIlllIl = new HashMap();
    private final Set IlIllllllIIlIIllllIIlIIIl = new HashSet();

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692, String string) {
        if ((string = string.trim()).startsWith("/")) {
            string = string.substring(1);
        }
        String[] arrstring = string.split(" ");
        String string2 = arrstring[0];
        arrstring = class_0515.lllIIIllIIIIlllIlIIllIIll(arrstring);
        class_0291 class_02912 = (class_0291)this.lllIlIIlIIIlIlIIIllIlllIl.get(string2);
        int n = this.lllIIIllIIIIlllIlIIllIIll(class_02912, arrstring);
        int n2 = 0;
        try {
            if (class_02912 == null) {
                throw new class_1624();
            }
            if (class_02912.lllIlIIlIIIlIlIIIllIlllIl(class_19692)) {
                if (n > -1) {
                    class_1822[] arrclass_1822 = class_1093.IlIllllllIIlIIllllIIlIIIl(class_19692, arrstring[n]);
                    String string3 = arrstring[n];
                    class_1822[] arrclass_18222 = arrclass_1822;
                    int n3 = arrclass_1822.length;
                    for (int i = 0; i < n3; ++i) {
                        class_1822 class_18222 = arrclass_18222[i];
                        arrstring[n] = class_18222.llllIIIIlIIIlIIIIIIlIllll();
                        try {
                            class_02912.lllIIIllIIIIlllIlIIllIIll(class_19692, arrstring);
                            ++n2;
                            continue;
                        }
                        catch (class_1953 class_19532) {
                            ChatComponentTranslation class_17902 = new ChatComponentTranslation(class_19532.getMessage(), class_19532.lllIIIllIIIIlllIlIIllIIll());
                            class_17902.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(class_1227.llIIllIllIlIIlIIllIllllll);
                            class_19692.lllIIIllIIIIlllIlIIllIIll(class_17902);
                        }
                    }
                    arrstring[n] = string3;
                } else {
                    try {
                        class_02912.lllIIIllIIIIlllIlIIllIIll(class_19692, arrstring);
                        ++n2;
                    }
                    catch (class_1953 class_19533) {
                        ChatComponentTranslation class_17903 = new ChatComponentTranslation(class_19533.getMessage(), class_19533.lllIIIllIIIIlllIlIIllIIll());
                        class_17903.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(class_1227.llIIllIllIlIIlIIllIllllll);
                        class_19692.lllIIIllIIIIlllIlIIllIIll(class_17903);
                    }
                }
            } else {
                ChatComponentTranslation class_17904 = new ChatComponentTranslation("commands.generic.permission", new Object[0]);
                class_17904.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(class_1227.llIIllIllIlIIlIIllIllllll);
                class_19692.lllIIIllIIIIlllIlIIllIIll(class_17904);
            }
        }
        catch (class_0932 class_09322) {
            ChatComponentTranslation class_17905 = new ChatComponentTranslation("commands.generic.usage", new ChatComponentTranslation(class_09322.getMessage(), class_09322.lllIIIllIIIIlllIlIIllIIll()));
            class_17905.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(class_1227.llIIllIllIlIIlIIllIllllll);
            class_19692.lllIIIllIIIIlllIlIIllIIll(class_17905);
        }
        catch (class_1953 class_19534) {
            ChatComponentTranslation class_17906 = new ChatComponentTranslation(class_19534.getMessage(), class_19534.lllIIIllIIIIlllIlIIllIIll());
            class_17906.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(class_1227.llIIllIllIlIIlIIllIllllll);
            class_19692.lllIIIllIIIIlllIlIIllIIll(class_17906);
        }
        catch (Throwable throwable) {
            ChatComponentTranslation class_17907 = new ChatComponentTranslation("commands.generic.exception", new Object[0]);
            class_17907.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(class_1227.llIIllIllIlIIlIIllIllllll);
            class_19692.lllIIIllIIIIlllIlIIllIIll(class_17907);
            lllIIIllIIIIlllIlIIllIIll.error("Couldn't process command: '" + string + "'", throwable);
        }
        return n2;
    }

    public class_0291 lllIIIllIIIIlllIlIIllIIll(class_0291 class_02912) {
        List list = class_02912.IlIllllllIIlIIllllIIlIIIl();
        this.lllIlIIlIIIlIlIIIllIlllIl.put(class_02912.lllIIIllIIIIlllIlIIllIIll(), class_02912);
        this.IlIllllllIIlIIllllIIlIIIl.add(class_02912);
        if (list != null) {
            for (String string : list) {
                class_0291 class_02913 = (class_0291)this.lllIlIIlIIIlIlIIIllIlllIl.get(string);
                if (class_02913 != null && class_02913.lllIIIllIIIIlllIlIIllIIll().equals(string)) continue;
                this.lllIlIIlIIIlIlIIIllIlllIl.put(string, class_02912);
            }
        }
        return class_02912;
    }

    private static String[] lllIIIllIIIIlllIlIIllIIll(String[] arrstring) {
        String[] arrstring2 = new String[arrstring.length - 1];
        for (int i = 1; i < arrstring.length; ++i) {
            arrstring2[i - 1] = arrstring[i];
        }
        return arrstring2;
    }

    @Override
    public List lllIlIIlIIIlIlIIIllIlllIl(class_1969 class_19692, String string) {
        class_0291 class_02912;
        String[] arrstring = string.split(" ", -1);
        String string2 = arrstring[0];
        if (arrstring.length == 1) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : this.lllIlIIlIIIlIlIIIllIlllIl.entrySet()) {
                if (!class_1246.lllIIIllIIIIlllIlIIllIIll(string2, (String)entry.getKey()) || !((class_0291)entry.getValue()).lllIlIIlIIIlIlIIIllIlllIl(class_19692)) continue;
                arrayList.add(entry.getKey());
            }
            return arrayList;
        }
        if (arrstring.length > 1 && (class_02912 = (class_0291)this.lllIlIIlIIIlIlIIIllIlllIl.get(string2)) != null) {
            return class_02912.lllIlIIlIIIlIlIIIllIlllIl(class_19692, class_0515.lllIIIllIIIIlllIlIIllIIll(arrstring));
        }
        return null;
    }

    @Override
    public List lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692) {
        ArrayList<class_0291> arrayList = new ArrayList<class_0291>();
        for (class_0291 class_02912 : this.IlIllllllIIlIIllllIIlIIIl) {
            if (!class_02912.lllIlIIlIIIlIlIIIllIlllIl(class_19692)) continue;
            arrayList.add(class_02912);
        }
        return arrayList;
    }

    @Override
    public Map lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    private int lllIIIllIIIIlllIlIIllIIll(class_0291 class_02912, String[] arrstring) {
        if (class_02912 == null) {
            return -1;
        }
        for (int i = 0; i < arrstring.length; ++i) {
            if (!class_02912.lllIIIllIIIIlllIlIIllIIll(arrstring, i) || !class_1093.lllIIIllIIIIlllIlIIllIIll(arrstring[i])) continue;
            return i;
        }
        return -1;
    }
}

