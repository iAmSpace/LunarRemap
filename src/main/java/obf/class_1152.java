package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.util.Collection;
import java.util.UUID;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_1152 {
    private static final Logger lIllllIIlIIIlIllllllIIIll = LogManager.getLogger();
    public static final class_2191 lllIIIllIIIIlllIlIIllIIll = new class_1904("generic.maxHealth", 20.0, 0.0, Double.MAX_VALUE).lllIIIllIIIIlllIlIIllIIll("Max Health").lllIIIllIIIIlllIlIIllIIll(true);
    public static final class_2191 lllIlIIlIIIlIlIIIllIlllIl = new class_1904("generic.followRange", 32.0, 0.0, 2048.0).lllIIIllIIIIlllIlIIllIIll("Follow Range");
    public static final class_2191 IlIllllllIIlIIllllIIlIIIl = new class_1904("generic.knockbackResistance", 0.0, 0.0, 1.0).lllIIIllIIIIlllIlIIllIIll("Knockback Resistance");
    public static final class_2191 lIlllIlllIIIIlIIlllIllIII = new class_1904("generic.movementSpeed", 0.7f, 0.0, Double.MAX_VALUE).lllIIIllIIIIlllIlIIllIIll("Movement Speed").lllIIIllIIIIlllIlIIllIIll(true);
    public static final class_2191 IlIIIIIllllllIIlllIllllll = new class_1904("generic.attackDamage", 2.0, 0.0, Double.MAX_VALUE);

    public static class_2145 lllIIIllIIIIlllIlIIllIIll(class_1901 class_19012) {
        class_2145 class_21452 = new class_2145();
        for (class_1685 class_16852 : class_19012.lllIIIllIIIIlllIlIIllIIll()) {
            class_21452.lllIIIllIIIIlllIlIIllIIll(class_1152.lllIIIllIIIIlllIlIIllIIll(class_16852));
        }
        return class_21452;
    }

    private static class_0775 lllIIIllIIIIlllIlIIllIIll(class_1685 class_16852) {
        class_0775 class_07752 = new class_0775();
        class_2191 class_21912 = class_16852.lllIIIllIIIIlllIlIIllIIll();
        class_07752.lllIIIllIIIIlllIlIIllIIll("Name", class_21912.lllIIIllIIIIlllIlIIllIIll());
        class_07752.lllIIIllIIIIlllIlIIllIIll("Base", class_16852.lllIlIIlIIIlIlIIIllIlllIl());
        Collection collection = class_16852.IlIllllllIIlIIllllIIlIIIl();
        if (collection != null && !collection.isEmpty()) {
            class_2145 class_21452 = new class_2145();
            for (class_1256 class_12562 : collection) {
                if (!class_12562.IlIIIIIllllllIIlllIllllll()) continue;
                class_21452.lllIIIllIIIIlllIlIIllIIll(class_1152.lllIIIllIIIIlllIlIIllIIll(class_12562));
            }
            class_07752.lllIIIllIIIIlllIlIIllIIll("Modifiers", class_21452);
        }
        return class_07752;
    }

    private static class_0775 lllIIIllIIIIlllIlIIllIIll(class_1256 class_12562) {
        class_0775 class_07752 = new class_0775();
        class_07752.lllIIIllIIIIlllIlIIllIIll("Name", class_12562.lllIlIIlIIIlIlIIIllIlllIl());
        class_07752.lllIIIllIIIIlllIlIIllIIll("Amount", class_12562.lIlllIlllIIIIlIIlllIllIII());
        class_07752.lllIIIllIIIIlllIlIIllIIll("Operation", class_12562.IlIllllllIIlIIllllIIlIIIl());
        class_07752.lllIIIllIIIIlllIlIIllIIll("UUIDMost", class_12562.lllIIIllIIIIlllIlIIllIIll().getMostSignificantBits());
        class_07752.lllIIIllIIIIlllIlIIllIIll("UUIDLeast", class_12562.lllIIIllIIIIlllIlIIllIIll().getLeastSignificantBits());
        return class_07752;
    }

    public static void lllIIIllIIIIlllIlIIllIIll(class_1901 class_19012, class_2145 class_21452) {
        for (int i = 0; i < class_21452.lIlllIlllIIIIlIIlllIllIII(); ++i) {
            class_0775 class_07752 = class_21452.lllIlIIlIIIlIlIIIllIlllIl(i);
            class_1685 class_16852 = class_19012.lllIIIllIIIIlllIlIIllIIll(class_07752.IllIIIllIIIIlIlIlIllIIlll("Name"));
            if (class_16852 != null) {
                class_1152.lllIIIllIIIIlllIlIIllIIll(class_16852, class_07752);
                continue;
            }
            lIllllIIlIIIlIllllllIIIll.warn("Ignoring unknown attribute '" + class_07752.IllIIIllIIIIlIlIlIllIIlll("Name") + "'");
        }
    }

    private static void lllIIIllIIIIlllIlIIllIIll(class_1685 class_16852, class_0775 class_07752) {
        class_16852.lllIIIllIIIIlllIlIIllIIll(class_07752.IIIllIllIIlIlIlIlIllllIIl("Base"));
        if (class_07752.lllIlIIlIIIlIlIIIllIlllIl("Modifiers", 9)) {
            class_2145 class_21452 = class_07752.IlIllllllIIlIIllllIIlIIIl("Modifiers", 10);
            for (int i = 0; i < class_21452.lIlllIlllIIIIlIIlllIllIII(); ++i) {
                class_1256 class_12562 = class_1152.lllIIIllIIIIlllIlIIllIIll(class_21452.lllIlIIlIIIlIlIIIllIlllIl(i));
                class_1256 class_12563 = class_16852.lllIIIllIIIIlllIlIIllIIll(class_12562.lllIIIllIIIIlllIlIIllIIll());
                if (class_12563 != null) {
                    class_16852.lllIlIIlIIIlIlIIIllIlllIl(class_12563);
                }
                class_16852.lllIIIllIIIIlllIlIIllIIll(class_12562);
            }
        }
    }

    public static class_1256 lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        UUID uUID = new UUID(class_07752.IIIllIIlIIIIIIlIlIIllIIlI("UUIDMost"), class_07752.IIIllIIlIIIIIIlIlIIllIIlI("UUIDLeast"));
        return new class_1256(uUID, class_07752.IllIIIllIIIIlIlIlIllIIlll("Name"), class_07752.IIIllIllIIlIlIlIlIllllIIl("Amount"), class_07752.lIllllIIlIIIlIllllllIIIll("Operation"));
    }
}

