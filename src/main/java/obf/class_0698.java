package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.util.ResourceLocation;
import optifine.Config;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TreeSet;

public class class_0698 {
    public String lllIIIllIIIIlllIlIIllIIll = null;
    public String lllIlIIlIIIlIlIIIllIlllIl = null;
    public int IlIllllllIIlIIllllIIlIIIl = 1;
    public int[] lIlllIlllIIIIlIIlllIllIII = null;
    public String IlIIIIIllllllIIlllIllllll = null;
    public Map lIllllIIlIIIlIllllllIIIll = null;
    public class_1475 IIIllIIlIIIIIIlIlIIllIIlI = null;
    public boolean IllIIlllllllIIlIIlIIIIlIl = false;
    public int IIIllIllIIlIlIlIlIllllIIl = 0;
    public class_1475 IllIIIllIIIIlIlIlIllIIlll = null;
    public class_1475 lIIIIlIlIIlllllIIllIIlIII = null;
    public class_1475 llIIlllIllIllllIIIlIIIIII = null;
    public class_1269[] llIIllIllIlIIlIIllIllllll = null;
    public int lllIIlIIIllllllIIIIlIlIlI = 1;
    public int IlIlllIIIIIIlIIllIIllIlll = 0;
    public int IlIlIIlIlIllIIlIlIIllIIIl = 0;
    public int lllllIlllIIllIlIIlIIIllII = 0;
    public int IlIlIIlllIIlIllIIIlllllIl = 1;
    public int lIIlIIIIIlIlllIlIIlIlIlll = 0;
    public IIcon lIlIlIIlIIIIlIIIIIlllIIII = null;
    public Map IlIIIlIIIIllIIIllIIIIIIll = null;
    public static final int IIlllIlIlllIllIIIlllIIlIl = 0;
    public static final int lIlIllIIlIIlIIlIIlIIlIIll = 1;
    public static final int llIIlIllIllllIlIIIIlIIlll = 2;
    public static final int llIllllIlIllIIIlIllIIlIlI = 3;

    public class_0698(Properties properties, String string) {
        this.lllIIIllIIIIlllIlIIllIIll = class_0698.lllIlIIlIIIlIlIIIllIlllIl(string);
        this.lllIlIIlIIIlIlIIIllIlllIl = class_0698.IlIllllllIIlIIllllIIlIIIl(string);
        this.IlIllllllIIlIIllllIIlIIIl = this.lIlllIlllIIIIlIIlllIllIII(properties.getProperty("type"));
        this.lIlllIlllIIIIlIIlllIllIII = this.lllIIIllIIIIlllIlIIllIIll(properties.getProperty("items"), properties.getProperty("matchItems"));
        this.IlIIIIIllllllIIlllIllllll = class_0698.lllIIIllIIIIlllIlIIllIIll(properties.getProperty("texture"), properties.getProperty("tile"), properties.getProperty("source"), string, this.lllIlIIlIIIlIlIIIllIlllIl);
        this.lIllllIIlIIIlIllllllIIIll = class_0698.lllIIIllIIIIlllIlIIllIIll(properties, this.lllIlIIlIIIlIlIIIllIlllIl);
        String string2 = properties.getProperty("damage");
        if (string2 != null) {
            this.IllIIlllllllIIlIIlIIIIlIl = string2.contains("%");
            string2.replace("%", "");
            this.IIIllIIlIIIIIIlIlIIllIIlI = this.IlIIIIIllllllIIlllIllllll(string2);
            this.IIIllIllIIlIlIlIlIllllIIl = this.lllIIIllIIIIlllIlIIllIIll(properties.getProperty("damageMask"), 0);
        }
        this.IllIIIllIIIIlIlIlIllIIlll = this.IlIIIIIllllllIIlllIllllll(properties.getProperty("stackSize"));
        this.lIIIIlIlIIlllllIIllIIlIII = this.IlIIIIIllllllIIlllIllllll(properties.getProperty("enchantmentIDs"));
        this.llIIlllIllIllllIIIlIIIIII = this.IlIIIIIllllllIIlllIllllll(properties.getProperty("enchantmentLevels"));
        this.llIIllIllIlIIlIIllIllllll = this.lllIIIllIIIIlllIlIIllIIll(properties);
        this.lllIIlIIIllllllIIIIlIlIlI = class_0934.lllIIIllIIIIlllIlIIllIIll(properties.getProperty("blend"));
        this.IlIlllIIIIIIlIIllIIllIlll = this.lllIIIllIIIIlllIlIIllIIll(properties.getProperty("speed"), 0);
        this.IlIlIIlIlIllIIlIlIIllIIIl = this.lllIIIllIIIIlllIlIIllIIll(properties.getProperty("rotation"), 0);
        this.lllllIlllIIllIlIIlIIIllII = this.lllIIIllIIIIlllIlIIllIIll(properties.getProperty("layer"), 0);
        this.lIIlIIIIIlIlllIlIIlIlIlll = this.lllIIIllIIIIlllIlIIllIIll(properties.getProperty("weight"), 0);
        this.IlIlIIlllIIlIllIIIlllllIl = this.lllIIIllIIIIlllIlIIllIIll(properties.getProperty("duration"), 1);
    }

    private static String lllIlIIlIIIlIlIIIllIlllIl(String string) {
        int n;
        String string2 = string;
        int n2 = string.lastIndexOf(47);
        if (n2 >= 0) {
            string2 = string.substring(n2 + 1);
        }
        if ((n = string2.lastIndexOf(46)) >= 0) {
            string2 = string2.substring(0, n);
        }
        return string2;
    }

    private static String IlIllllllIIlIIllllIIlIIIl(String string) {
        int n = string.lastIndexOf(47);
        return n < 0 ? "" : string.substring(0, n);
    }

    private int lIlllIlllIIIIlIIlllIllIII(String string) {
        if (string == null) {
            return 1;
        }
        if (string.equals("item")) {
            return 1;
        }
        if (string.equals("enchantment")) {
            return 2;
        }
        if (string.equals("armor")) {
            return 3;
        }
        Config.lllIlIIlIIIlIlIIIllIlllIl("Unknown method: " + string);
        return 0;
    }

    private int[] lllIIIllIIIIlllIlIIllIIll(String string, String string2) {
        int n;
        Object object;
        if (string == null) {
            string = string2;
        }
        if (string == null) {
            return null;
        }
        string = string.trim();
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        String[] arrstring = Config.lllIIIllIIIIlllIlIIllIIll(string, " ");
        for (int i = 0; i < arrstring.length; ++i) {
            int n2;
            Object object2;
            object = arrstring[i];
            n = Config.lllIIIllIIIIlllIlIIllIIll((String)object, -1);
            if (n >= 0) {
                treeSet.add(new Integer(n));
                continue;
            }
            if (((String)object).contains("-") && ((String[])(object2 = Config.lllIIIllIIIIlllIlIIllIIll((String)object, "-"))).length == 2) {
                int n3 = Config.lllIIIllIIIIlllIlIIllIIll(object2[0], -1);
                n2 = Config.lllIIIllIIIIlllIlIIllIIll(object2[1], -1);
                if (n3 >= 0 && n2 >= 0) {
                    int n4 = Math.min(n3, n2);
                    int n5 = Math.max(n3, n2);
                    for (int j = n4; j <= n5; ++j) {
                        treeSet.add(new Integer(j));
                    }
                    continue;
                }
            }
            if (!((object2 = Item.lllIIIllIIIIlllIlIIllIIll.getObject((String)object)) instanceof Item)) {
                Config.lllIIIllIIIIlllIlIIllIIll("Item not found: " + (String)object);
                continue;
            }
            Item class_06112 = (Item)object2;
            n2 = Item.lllIIIllIIIIlllIlIIllIIll(class_06112);
            if (n2 < 0) {
                Config.lllIIIllIIIIlllIlIIllIIll("Item not found: " + (String)object);
                continue;
            }
            treeSet.add(new Integer(n2));
        }
        Integer[] arrinteger = treeSet.toArray(new Integer[treeSet.size()]);
        object = new int[arrinteger.length];
        for (n = 0; n < ((Object)object).length; ++n) {
            object[n] = arrinteger[n];
        }
        return object;
    }

    private static String lllIIIllIIIIlllIlIIllIIll(String string, String string2, String string3, String string4, String string5) {
        int n;
        if (string == null) {
            string = string2;
        }
        if (string == null) {
            string = string3;
        }
        if (string != null) {
            String string6 = ".png";
            if (string.endsWith(string6)) {
                string = string.substring(0, string.length() - string6.length());
            }
            string = class_0698.lllIlIIlIIIlIlIIIllIlllIl(string, string5);
            return string;
        }
        String string7 = string4;
        int n2 = string4.lastIndexOf(47);
        if (n2 >= 0) {
            string7 = string4.substring(n2 + 1);
        }
        if ((n = string7.lastIndexOf(46)) >= 0) {
            string7 = string7.substring(0, n);
        }
        string7 = class_0698.lllIlIIlIIIlIlIIIllIlllIl(string7, string5);
        return string7;
    }

    private static Map lllIIIllIIIIlllIlIIllIIll(Properties properties, String string) {
        String string2 = "texture.";
        Map map = class_0698.lllIlIIlIIIlIlIIIllIlllIl(properties, string2);
        if (map.size() <= 0) {
            return null;
        }
        Set set = map.keySet();
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>();
        for (String string3 : set) {
            String string4 = (String)map.get(string3);
            string4 = class_0698.lllIlIIlIIIlIlIIIllIlllIl(string4, string);
            if (string3.startsWith(string2)) {
                string3 = string3.substring(string2.length());
            }
            linkedHashMap.put(string3, string4);
        }
        return linkedHashMap;
    }

    private static String lllIlIIlIIIlIlIIIllIlllIl(String string, String string2) {
        String string3;
        if (!((string = class_1384.lllIIIllIIIIlllIlIIllIIll(string, string2)).startsWith(string2) || string.startsWith("textures/") || string.startsWith("mcpatcher/"))) {
            string = string2 + "/" + string;
        }
        if (string.endsWith(".png")) {
            string = string.substring(0, string.length() - 4);
        }
        if (string.startsWith(string3 = "textures/blocks/")) {
            string = string.substring(string3.length());
        }
        if (string.startsWith("/")) {
            string = string.substring(1);
        }
        return string;
    }

    private int lllIIIllIIIIlllIlIIllIIll(String string, int n) {
        if (string == null) {
            return n;
        }
        int n2 = Config.lllIIIllIIIIlllIlIIllIIll(string = string.trim(), Integer.MIN_VALUE);
        if (n2 == Integer.MIN_VALUE) {
            Config.lllIlIIlIIIlIlIIIllIlllIl("Invalid integer: " + string);
            return n;
        }
        return n2;
    }

    private class_1475 IlIIIIIllllllIIlllIllllll(String string) {
        if (string == null) {
            return null;
        }
        String[] arrstring = Config.lllIIIllIIIIlllIlIIllIIll(string, " ");
        class_1475 class_14752 = new class_1475();
        for (int i = 0; i < arrstring.length; ++i) {
            String string2 = arrstring[i];
            class_1519 class_15192 = this.lIllllIIlIIIlIllllllIIIll(string2);
            if (class_15192 == null) {
                Config.lllIlIIlIIIlIlIIIllIlllIl("Invalid range list: " + string);
                return null;
            }
            class_14752.lllIIIllIIIIlllIlIIllIIll(class_15192);
        }
        return class_14752;
    }

    private class_1519 lIllllIIlIIIlIllllllIIIll(String string) {
        int n;
        if (string == null) {
            return null;
        }
        int n2 = (string = string.trim()).length() - string.replace("-", "").length();
        if (n2 > 1) {
            Config.lllIlIIlIIIlIlIIIllIlllIl("Invalid range: " + string);
            return null;
        }
        String[] arrstring = Config.lllIIIllIIIIlllIlIIllIIll(string, "- ");
        int[] arrn = new int[arrstring.length];
        for (n = 0; n < arrstring.length; ++n) {
            String string2 = arrstring[n];
            int n3 = Config.lllIIIllIIIIlllIlIIllIIll(string2, -1);
            if (n3 < 0) {
                Config.lllIlIIlIIIlIlIIIllIlllIl("Invalid range: " + string);
                return null;
            }
            arrn[n] = n3;
        }
        if (arrn.length == 1) {
            n = arrn[0];
            if (string.startsWith("-")) {
                return new class_1519(-1, n);
            }
            if (string.endsWith("-")) {
                return new class_1519(n, -1);
            }
            return new class_1519(n, n);
        }
        if (arrn.length == 2) {
            n = Math.min(arrn[0], arrn[1]);
            int n4 = Math.max(arrn[0], arrn[1]);
            return new class_1519(n, n4);
        }
        Config.lllIlIIlIIIlIlIIIllIlllIl("Invalid range: " + string);
        return null;
    }

    private class_1269[] lllIIIllIIIIlllIlIIllIIll(Properties properties) {
        class_1269[] arrclass_12692;
        Map map = class_0698.lllIlIIlIIIlIlIIIllIlllIl(properties, "nbt.");
        if (map.size() <= 0) {
            return null;
        }
        ArrayList<class_1269> arrayList = new ArrayList<class_1269>();
        Set set = map.keySet();
        for (class_1269[] arrclass_12692 : set) {
            String string = (String)map.get(arrclass_12692);
            class_1269 class_12692 = new class_1269((String)arrclass_12692, string);
            arrayList.add(class_12692);
        }
        arrclass_12692 = arrayList.toArray(new class_1269[arrayList.size()]);
        return arrclass_12692;
    }

    private static Map lllIlIIlIIIlIlIIIllIlllIl(Properties properties, String string) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>();
        Set<Object> set = properties.keySet();
        for (String string2 : set) {
            String string3 = properties.getProperty(string2);
            if (!string2.startsWith(string)) continue;
            linkedHashMap.put(string2, string3);
        }
        return linkedHashMap;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(String string) {
        if (this.lllIIIllIIIIlllIlIIllIIll != null && this.lllIIIllIIIIlllIlIIllIIll.length() > 0) {
            if (this.lllIlIIlIIIlIlIIIllIlllIl == null) {
                Config.lllIlIIlIIIlIlIIIllIlllIl("No base path found: " + string);
                return false;
            }
            if (this.IlIllllllIIlIIllllIIlIIIl == 0) {
                Config.lllIlIIlIIIlIlIIIllIlllIl("No type defined: " + string);
                return false;
            }
            if ((this.IlIllllllIIlIIllllIIlIIIl == 1 || this.IlIllllllIIlIIllllIIlIIIl == 3) && this.lIlllIlllIIIIlIIlllIllIII == null) {
                Config.lllIlIIlIIIlIlIIIllIlllIl("No items defined: " + string);
                return false;
            }
            if (this.IlIIIIIllllllIIlllIllllll == null && this.lIllllIIlIIIlIllllllIIIll == null) {
                Config.lllIlIIlIIIlIlIIIllIlllIl("No texture specified: " + string);
                return false;
            }
            return true;
        }
        Config.lllIlIIlIIIlIlIIIllIlllIl("No name found: " + string);
        return false;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1511 class_15112) {
        if (this.IlIIIIIllllllIIlllIllllll != null) {
            this.lIlIlIIlIIIIlIIIIIlllIIII = class_0698.lllIIIllIIIIlllIlIIllIIll(this.IlIIIIIllllllIIlllIllllll, class_15112);
        }
        if (this.lIllllIIlIIIlIllllllIIIll != null) {
            this.IlIIIlIIIIllIIIllIIIIIIll = new LinkedHashMap();
            Set set = this.lIllllIIlIIIlIllllllIIIll.keySet();
            for (String string : set) {
                String string2 = (String)this.lIllllIIlIIIlIllllllIIIll.get(string);
                IIcon class_21022 = class_0698.lllIIIllIIIIlllIlIIllIIll(string2, class_15112);
                this.IlIIIlIIIIllIIIllIIIIIIll.put(string, class_21022);
            }
        }
    }

    private static IIcon lllIIIllIIIIlllIlIIllIIll(String string, class_1511 class_15112) {
        String string2;
        ResourceLocation class_17732;
        boolean bl;
        if (string == null) {
            return null;
        }
        String string3 = string;
        if (!string.contains("/")) {
            string3 = "textures/blocks/" + string;
        }
        if (!(bl = Config.IlIllllllIIlIIllllIIlIIIl(class_17732 = new ResourceLocation(string2 = string3 + ".png")))) {
            Config.lllIlIIlIIIlIlIIIllIlllIl("File not found: " + string2);
        }
        IIcon class_21022 = class_15112.lllIIIllIIIIlllIlIIllIIll(string);
        return class_21022;
    }
}

