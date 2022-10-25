package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.init.Items;
import optifine.Config;
import net.minecraft.client.resources.DefaultResourcePack;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class class_1891 {
    private static class_0698[][] lllIIIllIIIIlllIlIIllIIll = null;
    private static Map lllIlIIlIIIlIlIIIllIlllIl = null;

    public static void lllIIIllIIIIlllIlIIllIIll(class_1511 class_15112) {
        lllIIIllIIIIlllIlIIllIIll = null;
        if (Config.lIIlIlllIIlIIIIlIlIIIIlll()) {
            class_0449[] arrclass_0449 = Config.lIIlIlllIllIlIlllIIIIIIII();
            for (int i = arrclass_0449.length - 1; i >= 0; --i) {
                class_0449 class_04492 = arrclass_0449[i];
                class_1891.lllIIIllIIIIlllIlIIllIIll(class_15112, class_04492);
            }
            class_1891.lllIIIllIIIIlllIlIIllIIll(class_15112, Config.IllllIIlIIIllIlllIlllIllI());
        }
    }

    public static void lllIIIllIIIIlllIlIIllIIll(class_1511 class_15112, class_0449 class_04492) {
        Collection<Object> collection;
        Object[] arrobject = class_1891.lllIIIllIIIIlllIlIIllIIll(class_04492, "mcpatcher/cit/", ".properties");
        Map map = class_1891.lllIIIllIIIIlllIlIIllIIll(class_04492);
        if (map.size() > 0) {
            collection = map.keySet();
            Object[] arrobject2 = collection.toArray(new String[collection.size()]);
            arrobject = (String[]) Config.lllIIIllIIIIlllIlIIllIIll(arrobject, arrobject2);
        }
        Arrays.sort(arrobject);
        collection = class_1891.lllIIIllIIIIlllIlIIllIIll(lllIIIllIIIIlllIlIIllIIll);
        for (int i = 0; i < arrobject.length; ++i) {
            Object object = arrobject[i];
            Config.lllIIIllIIIIlllIlIIllIIll("CustomItems: " + (String)object);
            try {
                class_0698 class_06982 = null;
                if (map.containsKey(object)) {
                    class_06982 = (class_0698)map.get(object);
                }
                if (class_06982 == null) {
                    ResourceLocation class_17732 = new ResourceLocation((String)object);
                    InputStream inputStream = class_04492.lllIIIllIIIIlllIlIIllIIll(class_17732);
                    if (inputStream == null) {
                        Config.lllIlIIlIIIlIlIIIllIlllIl("CustomItems file not found: " + (String)object);
                        continue;
                    }
                    Properties properties = new Properties();
                    properties.load(inputStream);
                    class_06982 = new class_0698(properties, (String)object);
                }
                if (!class_06982.lllIIIllIIIIlllIlIIllIIll((String)object)) continue;
                class_06982.lllIIIllIIIIlllIlIIllIIll(class_15112);
                class_1891.lllIIIllIIIIlllIlIIllIIll(class_06982, collection);
                continue;
            }
            catch (FileNotFoundException fileNotFoundException) {
                Config.lllIlIIlIIIlIlIIIllIlllIl("CustomItems file not found: " + (String)object);
                continue;
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
        lllIIIllIIIIlllIlIIllIIll = class_1891.lllIIIllIIIIlllIlIIllIIll(collection);
    }

    private static Map lllIIIllIIIIlllIlIIllIIll(class_0449 class_04492) {
        HashMap hashMap = new HashMap();
        hashMap.putAll(class_1891.lllIIIllIIIIlllIlIIllIIll(class_04492, false));
        hashMap.putAll(class_1891.lllIIIllIIIIlllIlIIllIIll(class_04492, true));
        return hashMap;
    }

    private static Map lllIIIllIIIIlllIlIIllIIll(class_0449 class_04492, boolean bl) {
        HashMap<String, class_0698> hashMap = new HashMap<String, class_0698>();
        String string = "mcpatcher/cit/potion/";
        string = bl ? string + "splash/" : string + "normal/";
        String string2 = ".png";
        String[] arrstring = class_1891.lllIIIllIIIIlllIlIIllIIll(class_04492, string, string2);
        for (int i = 0; i < arrstring.length; ++i) {
            String string3 = arrstring[i];
            if (string3.startsWith(string) && string3.endsWith(string2)) {
                String string4 = string3.substring(string.length(), string3.length() - string2.length());
                Properties properties = class_1891.lllIIIllIIIIlllIlIIllIIll(string4, bl, string3);
                if (properties == null) continue;
                String string5 = string3.substring(0, string3.length() - string2.length()) + ".properties";
                class_0698 class_06982 = new class_0698(properties, string5);
                hashMap.put(string5, class_06982);
                continue;
            }
            Config.lllIlIIlIIIlIlIIIllIlllIl("Invalid potion name: " + string3);
        }
        return hashMap;
    }

    private static Properties lllIIIllIIIIlllIlIIllIIll(String string, boolean bl, String string2) {
        int n;
        if (string.equals("empty") && !bl) {
            int n2 = Item.lllIIIllIIIIlllIlIIllIIll(Items.lIIlllIIIlIIlIllIIIIIlIlI);
            Properties properties = new Properties();
            properties.put("type", "item");
            properties.put("items", "" + n2);
            return properties;
        }
        int n3 = Item.lllIIIllIIIIlllIlIIllIIll(Items.potionitem);
        int[] arrn = (int[])class_1891.lllIIIllIIIIlllIlIIllIIll().get(string);
        if (arrn == null) {
            Config.lllIlIIlIIIlIlIIIllIlllIl("Potion not found for image: " + string2);
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (n = 0; n < arrn.length; ++n) {
            int n4 = arrn[n];
            if (bl) {
                n4 |= 0x4000;
            }
            if (n > 0) {
                stringBuffer.append(" ");
            }
            stringBuffer.append(n4);
        }
        n = 16447;
        Properties properties = new Properties();
        properties.put("type", "item");
        properties.put("items", "" + n3);
        properties.put("damage", "" + stringBuffer.toString());
        properties.put("damageMask", "" + n);
        return properties;
    }

    private static Map lllIIIllIIIIlllIlIIllIIll() {
        if (lllIlIIlIIIlIlIIIllIlllIl == null) {
            lllIlIIlIIIlIlIIIllIlllIl = new LinkedHashMap();
            lllIlIIlIIIlIlIIIllIlllIl.put("water", new int[]{0});
            lllIlIIlIIIlIlIIIllIlllIl.put("awkward", new int[]{16});
            lllIlIIlIIIlIlIIIllIlllIl.put("thick", new int[]{32});
            lllIlIIlIIIlIlIIIllIlllIl.put("potent", new int[]{48});
            lllIlIIlIIIlIlIIIllIlllIl.put("regeneration", class_1891.lllIIIllIIIIlllIlIIllIIll(1));
            lllIlIIlIIIlIlIIIllIlllIl.put("moveSpeed", class_1891.lllIIIllIIIIlllIlIIllIIll(2));
            lllIlIIlIIIlIlIIIllIlllIl.put("fireResistance", class_1891.lllIIIllIIIIlllIlIIllIIll(3));
            lllIlIIlIIIlIlIIIllIlllIl.put("poison", class_1891.lllIIIllIIIIlllIlIIllIIll(4));
            lllIlIIlIIIlIlIIIllIlllIl.put("heal", class_1891.lllIIIllIIIIlllIlIIllIIll(5));
            lllIlIIlIIIlIlIIIllIlllIl.put("nightVision", class_1891.lllIIIllIIIIlllIlIIllIIll(6));
            lllIlIIlIIIlIlIIIllIlllIl.put("clear", class_1891.lllIIIllIIIIlllIlIIllIIll(7));
            lllIlIIlIIIlIlIIIllIlllIl.put("bungling", class_1891.lllIIIllIIIIlllIlIIllIIll(23));
            lllIlIIlIIIlIlIIIllIlllIl.put("charming", class_1891.lllIIIllIIIIlllIlIIllIIll(39));
            lllIlIIlIIIlIlIIIllIlllIl.put("rank", class_1891.lllIIIllIIIIlllIlIIllIIll(55));
            lllIlIIlIIIlIlIIIllIlllIl.put("weakness", class_1891.lllIIIllIIIIlllIlIIllIIll(8));
            lllIlIIlIIIlIlIIIllIlllIl.put("damageBoost", class_1891.lllIIIllIIIIlllIlIIllIIll(9));
            lllIlIIlIIIlIlIIIllIlllIl.put("moveSlowdown", class_1891.lllIIIllIIIIlllIlIIllIIll(10));
            lllIlIIlIIIlIlIIIllIlllIl.put("diffuse", class_1891.lllIIIllIIIIlllIlIIllIIll(11));
            lllIlIIlIIIlIlIIIllIlllIl.put("smooth", class_1891.lllIIIllIIIIlllIlIIllIIll(27));
            lllIlIIlIIIlIlIIIllIlllIl.put("refined", class_1891.lllIIIllIIIIlllIlIIllIIll(43));
            lllIlIIlIIIlIlIIIllIlllIl.put("acrid", class_1891.lllIIIllIIIIlllIlIIllIIll(59));
            lllIlIIlIIIlIlIIIllIlllIl.put("harm", class_1891.lllIIIllIIIIlllIlIIllIIll(12));
            lllIlIIlIIIlIlIIIllIlllIl.put("waterBreathing", class_1891.lllIIIllIIIIlllIlIIllIIll(13));
            lllIlIIlIIIlIlIIIllIlllIl.put("invisibility", class_1891.lllIIIllIIIIlllIlIIllIIll(14));
            lllIlIIlIIIlIlIIIllIlllIl.put("thin", class_1891.lllIIIllIIIIlllIlIIllIIll(15));
            lllIlIIlIIIlIlIIIllIlllIl.put("debonair", class_1891.lllIIIllIIIIlllIlIIllIIll(31));
            lllIlIIlIIIlIlIIIllIlllIl.put("sparkling", class_1891.lllIIIllIIIIlllIlIIllIIll(47));
            lllIlIIlIIIlIlIIIllIlllIl.put("stinky", class_1891.lllIIIllIIIIlllIlIIllIIll(63));
        }
        return lllIlIIlIIIlIlIIIllIlllIl;
    }

    private static int[] lllIIIllIIIIlllIlIIllIIll(int n) {
        return new int[]{n, n + 16, n + 32, n + 48};
    }

    private static int lllIIIllIIIIlllIlIIllIIll(String string) {
        String string2 = "potion." + string;
        class_0700[] arrclass_0700 = class_0700.lllIIIllIIIIlllIlIIllIIll;
        for (int i = 0; i < arrclass_0700.length; ++i) {
            String string3;
            class_0700 class_07002 = arrclass_0700[i];
            if (class_07002 == null || !string2.equals(string3 = class_07002.IlIllllllIIlIIllllIIlIIIl())) continue;
            return class_07002.lllIIIllIIIIlllIlIIllIIll();
        }
        return -1;
    }

    private static List lllIIIllIIIIlllIlIIllIIll(class_0698[][] arrclass_0698) {
        ArrayList<ArrayList<class_0698>> arrayList = new ArrayList<ArrayList<class_0698>>();
        if (arrclass_0698 != null) {
            for (int i = 0; i < arrclass_0698.length; ++i) {
                class_0698[] arrclass_06982 = arrclass_0698[i];
                ArrayList<class_0698> arrayList2 = null;
                if (arrclass_06982 != null) {
                    arrayList2 = new ArrayList<class_0698>(Arrays.asList(arrclass_06982));
                }
                arrayList.add(arrayList2);
            }
        }
        return arrayList;
    }

    private static String[] lllIIIllIIIIlllIlIIllIIll(class_0449 class_04492, String string, String string2) {
        if (class_04492 instanceof DefaultResourcePack) {
            return class_1891.lllIlIIlIIIlIlIIIllIlllIl(class_04492);
        }
        if (!(class_04492 instanceof class_0821)) {
            return new String[0];
        }
        class_0821 class_08212 = (class_0821)class_04492;
        File file = class_0179.lllIIIllIIIIlllIlIIllIIll(class_08212);
        return file == null ? new String[0] : (file.isDirectory() ? class_1891.lllIIIllIIIIlllIlIIllIIll(file, "", string, string2) : (file.isFile() ? class_1891.lllIIIllIIIIlllIlIIllIIll(file, string, string2) : new String[0]));
    }

    private static String[] lllIlIIlIIIlIlIIIllIlllIl(class_0449 class_04492) {
        return new String[0];
    }

    private static String[] lllIIIllIIIIlllIlIIllIIll(File file, String string, String string2, String string3) {
        ArrayList<String> arrayList = new ArrayList<String>();
        String string4 = "assets/minecraft/";
        File[] arrfile = file.listFiles();
        if (arrfile == null) {
            return new String[0];
        }
        for (int i = 0; i < arrfile.length; ++i) {
            String string5;
            File file2 = arrfile[i];
            if (file2.isFile()) {
                string5 = string + file2.getName();
                if (!string5.startsWith(string4) || !(string5 = string5.substring(string4.length())).startsWith(string2) || !string5.endsWith(string3)) continue;
                arrayList.add(string5);
                continue;
            }
            if (!file2.isDirectory()) continue;
            string5 = string + file2.getName() + "/";
            String[] arrstring = class_1891.lllIIIllIIIIlllIlIIllIIll(file2, string5, string2, string3);
            for (int j = 0; j < arrstring.length; ++j) {
                String string6 = arrstring[j];
                arrayList.add(string6);
            }
        }
        String[] arrstring = arrayList.toArray(new String[arrayList.size()]);
        return arrstring;
    }

    private static String[] lllIIIllIIIIlllIlIIllIIll(File file, String string, String string2) {
        ArrayList<String> arrayList = new ArrayList<String>();
        String string3 = "assets/minecraft/";
        try {
            String[] arrstring;
            ZipFile zipFile = new ZipFile(file);
            Enumeration<? extends ZipEntry> enumeration = zipFile.entries();
            while (enumeration.hasMoreElements()) {
                arrstring = enumeration.nextElement();
                String string4 = arrstring.getName();
                if (!string4.startsWith(string3) || !(string4 = string4.substring(string3.length())).startsWith(string) || !string4.endsWith(string2)) continue;
                arrayList.add(string4);
            }
            zipFile.close();
            arrstring = arrayList.toArray(new String[arrayList.size()]);
            return arrstring;
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return new String[0];
        }
    }

    private static class_0698[][] lllIIIllIIIIlllIlIIllIIll(List list) {
        class_0698[][] arrclass_0698 = new class_0698[list.size()][];
        for (int i = 0; i < list.size(); ++i) {
            List list2 = (List)list.get(i);
            if (list2 == null) continue;
            class_0698[] arrclass_06982 = list2.toArray(new class_0698[list2.size()]);
            Arrays.sort(arrclass_06982, new class_1320());
            arrclass_0698[i] = arrclass_06982;
        }
        return arrclass_0698;
    }

    private static void lllIIIllIIIIlllIlIIllIIll(class_0698 class_06982, List list) {
        if (class_06982.lIlllIlllIIIIlIIlllIllIII != null) {
            for (int i = 0; i < class_06982.lIlllIlllIIIIlIIlllIllIII.length; ++i) {
                int n = class_06982.lIlllIlllIIIIlIIlllIllIII[i];
                if (n <= 0) {
                    Config.lllIlIIlIIIlIlIIIllIlllIl("Invalid item ID: " + n);
                    continue;
                }
                class_1891.lllIIIllIIIIlllIlIIllIIll(class_06982, list, n);
            }
        }
    }

    private static void lllIIIllIIIIlllIlIIllIIll(class_0698 class_06982, List list, int n) {
        while (n >= list.size()) {
            list.add(null);
        }
        ArrayList<class_0698> arrayList = (ArrayList<class_0698>)list.get(n);
        if (arrayList == null) {
            arrayList = new ArrayList<class_0698>();
            list.set(n, arrayList);
        }
        arrayList.add(class_06982);
    }

    public static class_2102 lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, class_2102 class_21022) {
        class_0698[] arrclass_0698;
        if (lllIIIllIIIIlllIlIIllIIll == null) {
            return class_21022;
        }
        if (class_08972 == null) {
            return class_21022;
        }
        Item class_06112 = class_08972.lllIIIllIIIIlllIlIIllIIll();
        int n = Item.lllIIIllIIIIlllIlIIllIIll(class_06112);
        if (n >= 0 && n < lllIIIllIIIIlllIlIIllIIll.length && (arrclass_0698 = lllIIIllIIIIlllIlIIllIIll[n]) != null) {
            for (int i = 0; i < arrclass_0698.length; ++i) {
                class_0698 class_06982 = arrclass_0698[i];
                class_2102 class_21023 = class_1891.lllIIIllIIIIlllIlIIllIIll(class_06982, class_08972, class_21022);
                if (class_21023 == null) continue;
                return class_21023;
            }
        }
        return class_21022;
    }

    public static class_2102 lllIIIllIIIIlllIlIIllIIll(class_0483 class_04832, int n) {
        class_0698[] arrclass_0698;
        if (lllIIIllIIIIlllIlIIllIIll == null) {
            return null;
        }
        int n2 = Item.lllIIIllIIIIlllIlIIllIIll(class_04832);
        if (n2 >= 0 && n2 < lllIIIllIIIIlllIlIIllIIll.length && (arrclass_0698 = lllIIIllIIIIlllIlIIllIIll[n2]) != null) {
            for (int i = 0; i < arrclass_0698.length; ++i) {
                class_0698 class_06982 = arrclass_0698[i];
                class_2102 class_21022 = class_1891.lllIIIllIIIIlllIlIIllIIll(class_06982, class_04832, n);
                if (class_21022 == null) continue;
                return class_21022;
            }
        }
        return null;
    }

    private static class_2102 lllIIIllIIIIlllIlIIllIIll(class_0698 class_06982, class_0483 class_04832, int n) {
        if (class_06982.IIIllIIlIIIIIIlIlIIllIIlI != null) {
            if (class_06982.IIIllIllIIlIlIlIlIllllIIl != 0) {
                n &= class_06982.IIIllIllIIlIlIlIlIllllIIl;
            }
            if (!class_06982.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(n)) {
                return null;
            }
        }
        return class_06982.lIlIlIIlIIIIlIIIIIlllIIII;
    }

    private static class_2102 lllIIIllIIIIlllIlIIllIIll(class_0698 class_06982, ItemStack class_08972, class_2102 class_21022) {
        boolean bl;
        int[] arrn;
        int n;
        int n2;
        Item class_06112 = class_08972.lllIIIllIIIIlllIlIIllIIll();
        if (class_06982.IIIllIIlIIIIIIlIlIIllIIlI != null) {
            n2 = class_08972.IllIIIllIIIIlIlIlIllIIlll();
            if (class_06982.IIIllIllIIlIlIlIlIllllIIl != 0) {
                n2 &= class_06982.IIIllIllIIlIlIlIlIllllIIl;
            }
            n = class_06112.IlIIIIIllllllIIlllIllllll();
            if (class_06982.IllIIlllllllIIlIIlIIIIlIl) {
                n2 = (int)((double)(n2 * 100) / (double)n);
            }
            if (!class_06982.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(n2)) {
                return null;
            }
        }
        if (class_06982.IllIIIllIIIIlIlIlIllIIlll != null && !class_06982.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(class_08972.lllIlIIlIIIlIlIIIllIlllIl)) {
            return null;
        }
        if (class_06982.lIIIIlIlIIlllllIIllIIlIII != null) {
            arrn = class_1891.lllIIIllIIIIlllIlIIllIIll(class_08972);
            bl = false;
            for (n2 = 0; n2 < arrn.length; ++n2) {
                n = arrn[n2];
                if (!class_06982.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(n)) continue;
                bl = true;
                break;
            }
            if (!bl) {
                return null;
            }
        }
        if (class_06982.llIIlllIllIllllIIIlIIIIII != null) {
            arrn = class_1891.lllIlIIlIIIlIlIIIllIlllIl(class_08972);
            bl = false;
            for (n2 = 0; n2 < arrn.length; ++n2) {
                n = arrn[n2];
                if (!class_06982.llIIlllIllIllllIIIlIIIIII.lllIIIllIIIIlllIlIIllIIll(n)) continue;
                bl = true;
                break;
            }
            if (!bl) {
                return null;
            }
        }
        if (class_06982.llIIllIllIlIIlIIllIllllll != null) {
            // empty if block
        }
        return class_06982.lIlIlIIlIIIIlIIIIIlllIIII;
    }

    private static int[] lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972) {
        Map map = class_1250.lllIIIllIIIIlllIlIIllIIll(class_08972);
        Set set = map.keySet();
        int[] arrn = new int[set.size()];
        int n = 0;
        for (Integer n2 : set) {
            arrn[n] = n2;
            ++n;
        }
        return arrn;
    }

    private static int[] lllIlIIlIIIlIlIIIllIlllIl(ItemStack class_08972) {
        Map map = class_1250.lllIIIllIIIIlllIlIIllIIll(class_08972);
        Collection collection = map.values();
        int[] arrn = new int[collection.size()];
        int n = 0;
        for (Integer n2 : collection) {
            arrn[n] = n2;
            ++n;
        }
        return arrn;
    }

    public static ResourceLocation lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, ResourceLocation class_17732) {
        return class_17732;
    }
}

