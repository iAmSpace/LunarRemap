package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Random;

public class class_2235
extends class_1246 {
    @Override
    public String lllIIIllIIIIlllIlIIllIIll() {
        return "weather";
    }

    @Override
    public int lllIlIIlIIIlIlIIIllIlllIl() {
        return 2;
    }

    @Override
    public String lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692) {
        return "commands.weather.usage";
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692, String[] arrstring) {
        if (arrstring.length >= 1 && arrstring.length <= 2) {
            int n = (300 + new Random().nextInt(600)) * 20;
            if (arrstring.length >= 2) {
                n = class_2235.lllIIIllIIIIlllIlIIllIIll(class_19692, arrstring[1], 1, 1000000) * 20;
            }
            class_0976 class_09762 = class_0220.IlIIlllllIIlIlIlllllIllll().IlIllllllIIlIIllllIIlIIIl[0];
            class_0770 class_07702 = class_09762.lIlllIlllIlIIIIlllIlIlIIl();
            if ("clear".equalsIgnoreCase(arrstring[0])) {
                class_07702.lIllllIIlIIIlIllllllIIIll(0);
                class_07702.IlIIIIIllllllIIlllIllllll(0);
                class_07702.lllIlIIlIIIlIlIIIllIlllIl(false);
                class_07702.lllIIIllIIIIlllIlIIllIIll(false);
                class_2235.lllIIIllIIIIlllIlIIllIIll(class_19692, (class_0291)this, "commands.weather.clear", new Object[0]);
            } else if ("rain".equalsIgnoreCase(arrstring[0])) {
                class_07702.lIllllIIlIIIlIllllllIIIll(n);
                class_07702.lllIlIIlIIIlIlIIIllIlllIl(true);
                class_07702.lllIIIllIIIIlllIlIIllIIll(false);
                class_2235.lllIIIllIIIIlllIlIIllIIll(class_19692, (class_0291)this, "commands.weather.rain", new Object[0]);
            } else {
                if (!"thunder".equalsIgnoreCase(arrstring[0])) {
                    throw new class_0932("commands.weather.usage", new Object[0]);
                }
                class_07702.lIllllIIlIIIlIllllllIIIll(n);
                class_07702.IlIIIIIllllllIIlllIllllll(n);
                class_07702.lllIlIIlIIIlIlIIIllIlllIl(true);
                class_07702.lllIIIllIIIIlllIlIIllIIll(true);
                class_2235.lllIIIllIIIIlllIlIIllIIll(class_19692, (class_0291)this, "commands.weather.thunder", new Object[0]);
            }
        } else {
            throw new class_0932("commands.weather.usage", new Object[0]);
        }
    }

    @Override
    public List lllIlIIlIIIlIlIIIllIlllIl(class_1969 class_19692, String[] arrstring) {
        return arrstring.length == 1 ? class_2235.lllIIIllIIIIlllIlIIllIIll(arrstring, "clear", "rain", "thunder") : null;
    }
}

