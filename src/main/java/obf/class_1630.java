package obf;/*
 * Decompiled with CFR 0.150.
 */
import optifine.Config;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Random;
import java.util.UUID;

public class class_1630 {
    private static Map IlIIIIIllllllIIlllIllllll = new HashMap();
    private static class_1114 lIllllIIlIIIlIllllllIIIll = null;
    private static boolean IIIllIIlIIIIIIlIlIIllIIlI = false;
    private static Random IllIIlllllllIIlIIlIIIIlIl = new Random();
    private static boolean IIIllIllIIlIlIlIlIllllIIl = false;
    public static final String lllIIIllIIIIlllIlIIllIIll = ".png";
    public static final String lllIlIIlIIIlIlIIIllIlllIl = ".properties";
    public static final String IlIllllllIIlIIllllIIlIIIl = "textures/entity/";
    public static final String lIlllIlllIIIIlIIlllIllIII = "mcpatcher/mob/";
    private static final String[] IllIIIllIIIIlIlIlIllIIlll = new String[]{"_armor", "_eyes", "_exploding", "_shooting", "_fur", "_eyes", "_invulnerable", "_angry", "_tame", "_collar"};

    public static void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, class_1334 class_13342) {
        if (class_15212 instanceof class_0339 && class_13342 != null) {
            class_1521 class_15213;
            class_0339 class_03392 = (class_0339)class_15212;
            class_03392.IlIlllIIIIIIlIIllIIllIlll = new class_2020((int)class_03392.IlIIlllllIIlIlIlllllIllll, (int)class_03392.llIIlIlIlllIIllIlIlllIllI, (int)class_03392.IllIIIIllIIllIllIlllIlIIl);
            class_03392.lllIIlIIIllllllIIIIlIlIlI = class_13342.a_((int)class_03392.IlIIlllllIIlIlIlllllIllll, (int)class_03392.IllIIIIllIIllIllIlllIlIIl);
            class_0976 class_09762 = Config.llIIIlIIllIIllIllIIlIlllI();
            if (class_09762 != null && (class_15213 = class_09762.lllIIIllIIIIlllIlIIllIIll(class_15212.llllllIlIllllIlIlIlIIIIlI())) instanceof class_0339) {
                int n;
                class_0339 class_03393 = (class_0339)class_15213;
                UUID uUID = class_03393.lIIlllIIlIlIlIIIlIlllIIll();
                long l = uUID.getLeastSignificantBits();
                class_03392.llIIllIllIlIIlIIllIllllll = n = (int)(l & Integer.MAX_VALUE);
            }
        }
    }

    public static void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, class_1334 class_13343) {
        if (class_13343 != null) {
            List list = class_13343.IlIlIIlllIIlIllIIIlllllIl();
            for (int i = 0; i < list.size(); ++i) {
                class_1521 class_15212 = (class_1521)list.get(i);
                class_1630.lllIIIllIIIIlllIlIIllIIll(class_15212, class_13343);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static ResourceLocation lllIIIllIIIIlllIlIIllIIll(ResourceLocation class_17732) {
        ResourceLocation class_17733;
        if (IIIllIllIIlIlIlIlIllllIIl) {
            return class_17732;
        }
        try {
            IIIllIllIIlIlIlIlIllllIIl = true;
            if (!IIIllIIlIIIIIIlIlIIllIIlI) {
                class_1630.lllIlIIlIIIlIlIIIllIlllIl();
            }
            if (lIllllIIlIIIlIllllllIIIll == null) {
                ResourceLocation class_17734;
                ResourceLocation class_17735 = class_17734 = class_17732;
                return class_17735;
            }
            class_1521 class_15212 = class_1630.lIllllIIlIIIlIllllllIIIll.lIlIllIIlIIlIIlIIlIIlIIll;
            if (!(class_15212 instanceof class_0339)) {
                ResourceLocation class_17736;
                ResourceLocation class_17737 = class_17736 = class_17732;
                return class_17737;
            }
            class_0339 class_03392 = (class_0339)class_15212;
            String string = class_17732.lllIIIllIIIIlllIlIIllIIll();
            if (!string.startsWith(IlIllllllIIlIIllllIIlIIIl)) {
                ResourceLocation class_17738;
                ResourceLocation class_17739 = class_17738 = class_17732;
                return class_17739;
            }
            class_2093 class_20932 = class_1630.IlIllllllIIlIIllllIIlIIIl(class_17732);
            if (class_20932 != null) {
                ResourceLocation class_177310;
                ResourceLocation class_177311 = class_177310 = class_20932.lllIIIllIIIIlllIlIIllIIll(class_17732, class_03392);
                return class_177311;
            }
            class_17733 = class_17732;
        }
        finally {
            IIIllIllIIlIlIlIlIllllIIl = false;
        }
        return class_17733;
    }

    private static class_2093 IlIllllllIIlIIllllIIlIIIl(ResourceLocation class_17732) {
        String string = class_17732.lllIIIllIIIIlllIlIIllIIll();
        class_2093 class_20932 = (class_2093)IlIIIIIllllllIIlllIllllll.get(string);
        if (class_20932 == null) {
            class_20932 = class_1630.lIlllIlllIIIIlIIlllIllIII(class_17732);
            IlIIIIIllllllIIlllIllllll.put(string, class_20932);
        }
        return class_20932;
    }

    private static class_2093 lIlllIlllIIIIlIIlllIllIII(ResourceLocation class_17732) {
        ResourceLocation[] arrclass_1773;
        String string = class_17732.lllIIIllIIIIlllIlIIllIIll();
        ResourceLocation class_17733 = class_1630.IlIIIIIllllllIIlllIllllll(class_17732);
        if (class_17733 != null && (arrclass_1773 = class_1630.lllIIIllIIIIlllIlIIllIIll(class_17733, class_17732)) != null) {
            return arrclass_1773;
        }
        arrclass_1773 = class_1630.lIllllIIlIIIlIllllllIIIll(class_17732);
        return new class_2093(string, arrclass_1773);
    }

    private static class_2093 lllIIIllIIIIlllIlIIllIIll(ResourceLocation class_17732, ResourceLocation class_17733) {
        try {
            String string = class_17732.lllIIIllIIIIlllIlIIllIIll();
            Config.lllIIIllIIIIlllIlIIllIIll("RandomMobs: " + class_17733.lllIIIllIIIIlllIlIIllIIll() + ", variants: " + string);
            InputStream inputStream = Config.lllIIIllIIIIlllIlIIllIIll(class_17732);
            if (inputStream == null) {
                Config.lllIlIIlIIIlIlIIIllIlllIl("RandomMobs properties not found: " + string);
                return null;
            }
            Properties properties = new Properties();
            properties.load(inputStream);
            inputStream.close();
            class_2093 class_20932 = new class_2093(properties, string, class_17733);
            return !class_20932.lllIIIllIIIIlllIlIIllIIll(string) ? null : class_20932;
        }
        catch (FileNotFoundException fileNotFoundException) {
            Config.lllIlIIlIIIlIlIIIllIlllIl("RandomMobs file not found: " + class_17733.lllIIIllIIIIlllIlIIllIIll());
            return null;
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return null;
        }
    }

    private static ResourceLocation IlIIIIIllllllIIlllIllllll(ResourceLocation class_17732) {
        String string;
        ResourceLocation class_17733;
        String string2;
        ResourceLocation class_17734 = class_1630.lllIlIIlIIIlIlIIIllIlllIl(class_17732);
        if (class_17734 == null) {
            return null;
        }
        String string3 = class_17734.lllIlIIlIIIlIlIIIllIlllIl();
        String string4 = string2 = class_17734.lllIIIllIIIIlllIlIIllIIll();
        if (string2.endsWith(lllIIIllIIIIlllIlIIllIIll)) {
            string4 = string2.substring(0, string2.length() - lllIIIllIIIIlllIlIIllIIll.length());
        }
        if (Config.IlIllllllIIlIIllllIIlIIIl(class_17733 = new ResourceLocation(string3, string = string4 + lllIlIIlIIIlIlIIIllIlllIl))) {
            return class_17733;
        }
        String string5 = class_1630.lllIIIllIIIIlllIlIIllIIll(string4);
        if (string5 == null) {
            return null;
        }
        ResourceLocation class_17735 = new ResourceLocation(string3, string5 + lllIlIIlIIIlIlIIIllIlllIl);
        return Config.IlIllllllIIlIIllllIIlIIIl(class_17735) ? class_17735 : null;
    }

    public static ResourceLocation lllIlIIlIIIlIlIIIllIlllIl(ResourceLocation class_17732) {
        String string = class_17732.lllIIIllIIIIlllIlIIllIIll();
        if (!string.startsWith(IlIllllllIIlIIllllIIlIIIl)) {
            return null;
        }
        String string2 = lIlllIlllIIIIlIIlllIllIII + string.substring(IlIllllllIIlIIllllIIlIIIl.length());
        return new ResourceLocation(class_17732.lllIlIIlIIIlIlIIIllIlllIl(), string2);
    }

    public static ResourceLocation lllIIIllIIIIlllIlIIllIIll(ResourceLocation class_17732, int n) {
        if (class_17732 == null) {
            return null;
        }
        String string = class_17732.lllIIIllIIIIlllIlIIllIIll();
        int n2 = string.lastIndexOf(46);
        if (n2 < 0) {
            return null;
        }
        String string2 = string.substring(0, n2);
        String string3 = string.substring(n2);
        String string4 = string2 + n + string3;
        ResourceLocation class_17733 = new ResourceLocation(class_17732.lllIlIIlIIIlIlIIIllIlllIl(), string4);
        return class_17733;
    }

    private static String lllIIIllIIIIlllIlIIllIIll(String string) {
        for (int i = 0; i < IllIIIllIIIIlIlIlIllIIlll.length; ++i) {
            String string2 = IllIIIllIIIIlIlIlIllIIlll[i];
            if (!string.endsWith(string2)) continue;
            String string3 = string.substring(0, string.length() - string2.length());
            return string3;
        }
        return null;
    }

    private static ResourceLocation[] lIllllIIlIIIlIllllllIIIll(ResourceLocation class_17732) {
        ArrayList<ResourceLocation> arrayList = new ArrayList<ResourceLocation>();
        arrayList.add(class_17732);
        ResourceLocation class_17733 = class_1630.lllIlIIlIIIlIlIIIllIlllIl(class_17732);
        if (class_17733 == null) {
            return null;
        }
        for (int i = 1; i < arrayList.size() + 10; ++i) {
            int n = i + 1;
            ResourceLocation class_17734 = class_1630.lllIIIllIIIIlllIlIIllIIll(class_17733, n);
            if (!Config.IlIllllllIIlIIllllIIlIIIl(class_17734)) continue;
            arrayList.add(class_17734);
        }
        if (arrayList.size() <= 1) {
            return null;
        }
        ResourceLocation[] arrclass_1773 = arrayList.toArray(new ResourceLocation[arrayList.size()]);
        Config.lllIIIllIIIIlllIlIIllIIll("RandomMobs: " + class_17732.lllIIIllIIIIlllIlIIllIIll() + ", variants: " + arrclass_1773.length);
        return arrclass_1773;
    }

    public static void lllIIIllIIIIlllIlIIllIIll() {
        IlIIIIIllllllIIlllIllllll.clear();
        if (Config.lIIllIlIIlIIlllllIlIIllIl()) {
            class_1630.lllIlIIlIIIlIlIIIllIlllIl();
        }
    }

    private static void lllIlIIlIIIlIlIIIllIlllIl() {
        lIllllIIlIIIlIllllllIIIll = Config.IllIlIlIIIlllIIllIIIIlIll();
        if (lIllllIIlIIIlIllllllIIIll != null) {
            IIIllIIlIIIIIIlIlIIllIIlI = true;
            ArrayList<String> arrayList = new ArrayList<String>();
            arrayList.add("bat");
            arrayList.add("blaze");
            arrayList.add("cat/black");
            arrayList.add("cat/ocelot");
            arrayList.add("cat/red");
            arrayList.add("cat/siamese");
            arrayList.add("chicken");
            arrayList.add("cow/cow");
            arrayList.add("cow/mooshroom");
            arrayList.add("creeper/creeper");
            arrayList.add("enderman/enderman");
            arrayList.add("enderman/enderman_eyes");
            arrayList.add("ghast/ghast");
            arrayList.add("ghast/ghast_shooting");
            arrayList.add("iron_golem");
            arrayList.add("pig/pig");
            arrayList.add("sheep/sheep");
            arrayList.add("sheep/sheep_fur");
            arrayList.add("silverfish");
            arrayList.add("skeleton/skeleton");
            arrayList.add("skeleton/wither_skeleton");
            arrayList.add("slime/slime");
            arrayList.add("slime/magmacube");
            arrayList.add("snowman");
            arrayList.add("spider/cave_spider");
            arrayList.add("spider/spider");
            arrayList.add("spider_eyes");
            arrayList.add("squid");
            arrayList.add("villager/villager");
            arrayList.add("villager/butcher");
            arrayList.add("villager/farmer");
            arrayList.add("villager/librarian");
            arrayList.add("villager/priest");
            arrayList.add("villager/smith");
            arrayList.add("wither/wither");
            arrayList.add("wither/wither_armor");
            arrayList.add("wither/wither_invulnerable");
            arrayList.add("wolf/wolf");
            arrayList.add("wolf/wolf_angry");
            arrayList.add("wolf/wolf_collar");
            arrayList.add("wolf/wolf_tame");
            arrayList.add("zombie_pigman");
            arrayList.add("zombie/zombie");
            arrayList.add("zombie/zombie_villager");
            for (int i = 0; i < arrayList.size(); ++i) {
                String string = (String)arrayList.get(i);
                String string2 = IlIllllllIIlIIllllIIlIIIl + string + lllIIIllIIIIlllIlIIllIIll;
                ResourceLocation class_17732 = new ResourceLocation(string2);
                if (!Config.IlIllllllIIlIIllllIIlIIIl(class_17732)) {
                    Config.lllIlIIlIIIlIlIIIllIlllIl("Not found: " + class_17732);
                }
                class_1630.IlIllllllIIlIIllllIIlIIIl(class_17732);
            }
        }
    }
}

