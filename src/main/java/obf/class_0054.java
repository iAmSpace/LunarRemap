package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_0054 {
    private static final Logger lllIlIIlIIIlIlIIIllIlllIl = LogManager.getLogger();
    private static Map IlIllllllIIlIIllllIIlIIIl = new HashMap();
    private static Map lIlllIlllIIIIlIIlllIllIII = new HashMap();
    private static Map IlIIIIIllllllIIlllIllllll = new HashMap();
    private static Map lIllllIIlIIIlIllllllIIIll = new HashMap();
    private static Map IIIllIIlIIIIIIlIlIIllIIlI = new HashMap();
    public static HashMap lllIIIllIIIIlllIlIIllIIll = new LinkedHashMap();

    private static void lllIIIllIIIIlllIlIIllIIll(Class class_, String string, int n) {
        if (IlIllllllIIlIIllllIIlIIIl.containsKey(string)) {
            throw new IllegalArgumentException("ID is already registered: " + string);
        }
        if (IlIIIIIllllllIIlllIllllll.containsKey(n)) {
            throw new IllegalArgumentException("ID is already registered: " + n);
        }
        IlIllllllIIlIIllllIIlIIIl.put(string, class_);
        lIlllIlllIIIIlIIlllIllIII.put(class_, string);
        IlIIIIIllllllIIlllIllllll.put(n, class_);
        lIllllIIlIIIlIllllllIIIll.put(class_, n);
        IIIllIIlIIIIIIlIlIIllIIlI.put(string, n);
    }

    private static void lllIIIllIIIIlllIlIIllIIll(Class class_, String string, int n, int n2, int n3) {
        class_0054.lllIIIllIIIIlllIlIIllIIll(class_, string, n);
        lllIIIllIIIIlllIlIIllIIll.put(n, new class_1128(n, n2, n3));
    }

    public static class_1521 lllIIIllIIIIlllIlIIllIIll(String string, class_1334 class_13342) {
        class_1521 class_15212 = null;
        try {
            Class class_ = (Class)IlIllllllIIlIIllllIIlIIIl.get(string);
            if (class_ != null) {
                class_15212 = (class_1521)class_.getConstructor(class_1334.class).newInstance(class_13342);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return class_15212;
    }

    public static class_1521 lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752, class_1334 class_13342) {
        class_1521 class_15212 = null;
        if ("Minecart".equals(class_07752.IllIIIllIIIIlIlIlIllIIlll("id"))) {
            switch (class_07752.lIllllIIlIIIlIllllllIIIll("Type")) {
                case 0: {
                    class_07752.lllIIIllIIIIlllIlIIllIIll("id", "MinecartRideable");
                    break;
                }
                case 1: {
                    class_07752.lllIIIllIIIIlllIlIIllIIll("id", "MinecartChest");
                    break;
                }
                case 2: {
                    class_07752.lllIIIllIIIIlllIlIIllIIll("id", "MinecartFurnace");
                }
            }
            class_07752.IlIlllIIIIIIlIIllIIllIlll("Type");
        }
        try {
            Class class_ = (Class)IlIllllllIIlIIllllIIlIIIl.get(class_07752.IllIIIllIIIIlIlIlIllIIlll("id"));
            if (class_ != null) {
                class_15212 = (class_1521)class_.getConstructor(class_1334.class).newInstance(class_13342);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        if (class_15212 != null) {
            class_15212.lIllllIIlIIIlIllllllIIIll(class_07752);
        } else {
            lllIlIIlIIIlIlIIIllIlllIl.warn("Skipping Entity with id " + class_07752.IllIIIllIIIIlIlIlIllIIlll("id"));
        }
        return class_15212;
    }

    public static class_1521 lllIIIllIIIIlllIlIIllIIll(int n, class_1334 class_13342) {
        class_1521 class_15212 = null;
        try {
            Class class_ = class_0054.lllIIIllIIIIlllIlIIllIIll(n);
            if (class_ != null) {
                class_15212 = (class_1521)class_.getConstructor(class_1334.class).newInstance(class_13342);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        if (class_15212 == null) {
            lllIlIIlIIIlIlIIIllIlllIl.warn("Skipping Entity with id " + n);
        }
        return class_15212;
    }

    public static int lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212) {
        Class<?> class_ = class_15212.getClass();
        return lIllllIIlIIIlIllllllIIIll.containsKey(class_) ? (Integer)lIllllIIlIIIlIllllllIIIll.get(class_) : 0;
    }

    public static Class lllIIIllIIIIlllIlIIllIIll(int n) {
        return (Class)IlIIIIIllllllIIlllIllllll.get(n);
    }

    public static String lllIlIIlIIIlIlIIIllIlllIl(class_1521 class_15212) {
        return (String)lIlllIlllIIIIlIIlllIllIII.get(class_15212.getClass());
    }

    public static String lllIlIIlIIIlIlIIIllIlllIl(int n) {
        Class class_ = class_0054.lllIIIllIIIIlllIlIIllIIll(n);
        return class_ != null ? (String)lIlllIlllIIIIlIIlllIllIII.get(class_) : null;
    }

    public static void lllIIIllIIIIlllIlIIllIIll() {
    }

    public static Set lllIlIIlIIIlIlIIIllIlllIl() {
        return Collections.unmodifiableSet(IIIllIIlIIIIIIlIlIIllIIlI.keySet());
    }

    static {
        class_0054.lllIIIllIIIIlllIlIIllIIll(class_1781.class, "Item", 1);
        class_0054.lllIIIllIIIIlllIlIIllIIll(class_1138.class, "XPOrb", 2);
        class_0054.lllIIIllIIIIlllIlIIllIIll(class_1215.class, "LeashKnot", 8);
        class_0054.lllIIIllIIIIlllIlIIllIIll(class_0146.class, "Painting", 9);
        class_0054.lllIIIllIIIIlllIlIIllIIll(class_0369.class, "Arrow", 10);
        class_0054.lllIIIllIIIIlllIlIIllIIll(class_0333.class, "Snowball", 11);
        class_0054.lllIIIllIIIIlllIlIIllIIll(class_1902.class, "Fireball", 12);
        class_0054.lllIIIllIIIIlllIlIIllIIll(class_1332.class, "SmallFireball", 13);
        class_0054.lllIIIllIIIIlllIlIIllIIll(class_1918.class, "ThrownEnderpearl", 14);
        class_0054.lllIIIllIIIIlllIlIIllIIll(class_0093.class, "EyeOfEnderSignal", 15);
        class_0054.lllIIIllIIIIlllIlIIllIIll(class_0426.class, "ThrownPotion", 16);
        class_0054.lllIIIllIIIIlllIlIIllIIll(class_1617.class, "ThrownExpBottle", 17);
        class_0054.lllIIIllIIIIlllIlIIllIIll(class_1094.class, "ItemFrame", 18);
        class_0054.lllIIIllIIIIlllIlIIllIIll(class_2166.class, "WitherSkull", 19);
        class_0054.lllIIIllIIIIlllIlIIllIIll(class_0034.class, "PrimedTnt", 20);
        class_0054.lllIIIllIIIIlllIlIIllIIll(class_0543.class, "FallingSand", 21);
        class_0054.lllIIIllIIIIlllIlIIllIIll(class_1800.class, "FireworksRocketEntity", 22);
        class_0054.lllIIIllIIIIlllIlIIllIIll(class_2263.class, "Boat", 41);
        class_0054.lllIIIllIIIIlllIlIIllIIll(class_0493.class, "MinecartRideable", 42);
        class_0054.lllIIIllIIIIlllIlIIllIIll(class_0656.class, "MinecartChest", 43);
        class_0054.lllIIIllIIIIlllIlIIllIIll(class_1775.class, "MinecartFurnace", 44);
        class_0054.lllIIIllIIIIlllIlIIllIIll(class_0858.class, "MinecartTNT", 45);
        class_0054.lllIIIllIIIIlllIlIIllIIll(class_2252.class, "MinecartHopper", 46);
        class_0054.lllIIIllIIIIlllIlIIllIIll(class_1989.class, "MinecartSpawner", 47);
        class_0054.lllIIIllIIIIlllIlIIllIIll(class_2200.class, "MinecartCommandBlock", 40);
        class_0054.lllIIIllIIIIlllIlIIllIIll(class_0339.class, "Mob", 48);
        class_0054.lllIIIllIIIIlllIlIIllIIll(class_1168.class, "Monster", 49);
        class_0054.lllIIIllIIIIlllIlIIllIIll(class_1234.class, "Creeper", 50, 894731, 0);
        class_0054.lllIIIllIIIIlllIlIIllIIll(class_0630.class, "Skeleton", 51, 0xC1C1C1, 0x494949);
        class_0054.lllIIIllIIIIlllIlIIllIIll(class_1051.class, "Spider", 52, 3419431, 11013646);
        class_0054.lllIIIllIIIIlllIlIIllIIll(class_0405.class, "Giant", 53);
        class_0054.lllIIIllIIIIlllIlIIllIIll(class_0724.class, "Zombie", 54, 44975, 7969893);
        class_0054.lllIIIllIIIIlllIlIIllIIll(class_2105.class, "Slime", 55, 5349438, 8306542);
        class_0054.lllIIIllIIIIlllIlIIllIIll(class_1413.class, "Ghast", 56, 0xF9F9F9, 0xBCBCBC);
        class_0054.lllIIIllIIIIlllIlIIllIIll(class_1144.class, "PigZombie", 57, 15373203, 5009705);
        class_0054.lllIIIllIIIIlllIlIIllIIll(class_0793.class, "Enderman", 58, 0x161616, 0);
        class_0054.lllIIIllIIIIlllIlIIllIIll(class_0249.class, "CaveSpider", 59, 803406, 11013646);
        class_0054.lllIIIllIIIIlllIlIIllIIll(class_0085.class, "Silverfish", 60, 0x6E6E6E, 0x303030);
        class_0054.lllIIIllIIIIlllIlIIllIIll(class_1819.class, "Blaze", 61, 16167425, 16775294);
        class_0054.lllIIIllIIIIlllIlIIllIIll(class_0882.class, "LavaSlime", 62, 0x340000, 0xFCFC00);
        class_0054.lllIIIllIIIIlllIlIIllIIll(class_1221.class, "EnderDragon", 63);
        class_0054.lllIIIllIIIIlllIlIIllIIll(class_0590.class, "WitherBoss", 64);
        class_0054.lllIIIllIIIIlllIlIIllIIll(class_0453.class, "Bat", 65, 4996656, 986895);
        class_0054.lllIIIllIIIIlllIlIIllIIll(class_0066.class, "Witch", 66, 0x340000, 5349438);
        class_0054.lllIIIllIIIIlllIlIIllIIll(class_0161.class, "Pig", 90, 15771042, 14377823);
        class_0054.lllIIIllIIIIlllIlIIllIIll(class_1317.class, "Sheep", 91, 0xE7E7E7, 0xFFB5B5);
        class_0054.lllIIIllIIIIlllIlIIllIIll(class_1802.class, "Cow", 92, 4470310, 0xA1A1A1);
        class_0054.lllIIIllIIIIlllIlIIllIIll(class_1554.class, "Chicken", 93, 0xA1A1A1, 0xFF0000);
        class_0054.lllIIIllIIIIlllIlIIllIIll(class_0002.class, "Squid", 94, 2243405, 7375001);
        class_0054.lllIIIllIIIIlllIlIIllIIll(class_1305.class, "Wolf", 95, 0xD7D3D3, 13545366);
        class_0054.lllIIIllIIIIlllIlIIllIIll(class_1584.class, "MushroomCow", 96, 10489616, 0xB7B7B7);
        class_0054.lllIIIllIIIIlllIlIIllIIll(class_1405.class, "SnowMan", 97);
        class_0054.lllIIIllIIIIlllIlIIllIIll(class_0673.class, "Ozelot", 98, 15720061, 5653556);
        class_0054.lllIIIllIIIIlllIlIIllIIll(class_0991.class, "VillagerGolem", 99);
        class_0054.lllIIIllIIIIlllIlIIllIIll(class_1627.class, "EntityHorse", 100, 12623485, 0xEEE500);
        class_0054.lllIIIllIIIIlllIlIIllIIll(class_1817.class, "Villager", 120, 5651507, 12422002);
        class_0054.lllIIIllIIIIlllIlIIllIIll(class_0355.class, "EnderCrystal", 200);
    }
}

