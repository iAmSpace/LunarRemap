package obf;/*
 * Decompiled with CFR 0.150.
 */
import optifine.Config;

import java.util.ArrayList;
import java.util.Properties;

public class class_2093 {
    public String lllIIIllIIIIlllIlIIllIIll = null;
    public String lllIlIIlIIIlIlIIIllIlllIl = null;
    public ResourceLocation[] IlIllllllIIlIIllllIIlIIIl = null;
    public class_0285[] lIlllIlllIIIIlIIlllIllIII = null;

    public class_2093(String string, ResourceLocation[] arrclass_1773) {
        class_0925 class_09252 = new class_0925("RandomMobs");
        this.lllIIIllIIIIlllIlIIllIIll = class_09252.lllIIIllIIIIlllIlIIllIIll(string);
        this.lllIlIIlIIIlIlIIIllIlllIl = class_09252.lllIlIIlIIIlIlIIIllIlllIl(string);
        this.IlIllllllIIlIIllllIIlIIIl = arrclass_1773;
    }

    public class_2093(Properties properties, String string, ResourceLocation class_17732) {
        class_0925 class_09252 = new class_0925("RandomMobs");
        this.lllIIIllIIIIlllIlIIllIIll = class_09252.lllIIIllIIIIlllIlIIllIIll(string);
        this.lllIlIIlIIIlIlIIIllIlllIl = class_09252.lllIlIIlIIIlIlIIIllIlllIl(string);
        this.lIlllIlllIIIIlIIlllIllIII = this.lllIIIllIIIIlllIlIIllIIll(properties, class_17732, class_09252);
    }

    public ResourceLocation lllIIIllIIIIlllIlIIllIIll(ResourceLocation class_17732, class_0339 class_03392) {
        int n;
        if (this.lIlllIlllIIIIlIIlllIllIII != null) {
            for (n = 0; n < this.lIlllIlllIIIIlIIlllIllIII.length; ++n) {
                class_0285 class_02852 = this.lIlllIlllIIIIlIIlllIllIII[n];
                if (!class_02852.lllIIIllIIIIlllIlIIllIIll(class_03392)) continue;
                return class_02852.lllIIIllIIIIlllIlIIllIIll(class_17732, class_03392.llIIllIllIlIIlIIllIllllll);
            }
        }
        if (this.IlIllllllIIlIIllllIIlIIIl != null) {
            n = class_03392.llIIllIllIlIIlIIllIllllll;
            int n2 = n % this.IlIllllllIIlIIllllIIlIIIl.length;
            return this.IlIllllllIIlIIllllIIlIIIl[n2];
        }
        return class_17732;
    }

    private class_0285[] lllIIIllIIIIlllIlIIllIIll(Properties properties, ResourceLocation class_17732, class_0925 class_09252) {
        ArrayList<class_0285> arrayList = new ArrayList<class_0285>();
        int n = properties.size();
        for (int i = 0; i < n; ++i) {
            int n2 = i + 1;
            String string = properties.getProperty("skins." + n2);
            if (string == null) continue;
            int[] arrn = class_09252.IIIllIllIIlIlIlIlIllllIIl(string);
            int[] arrn2 = class_09252.IIIllIllIIlIlIlIlIllllIIl(properties.getProperty("weights." + n2));
            class_0672[] arrclass_0672 = class_09252.lIllllIIlIIIlIllllllIIIll(properties.getProperty("biomes." + n2));
            class_1475 class_14752 = class_09252.llIIlllIllIllllIIIlIIIIII(properties.getProperty("heights." + n2));
            if (class_14752 == null) {
                class_14752 = this.lllIIIllIIIIlllIlIIllIIll(properties, n2);
            }
            class_0285 class_02852 = new class_0285(class_17732, arrn, arrn2, arrclass_0672, class_14752);
            arrayList.add(class_02852);
        }
        class_0285[] arrclass_0285 = arrayList.toArray(new class_0285[arrayList.size()]);
        return arrclass_0285;
    }

    private class_1475 lllIIIllIIIIlllIlIIllIIll(Properties properties, int n) {
        String string = properties.getProperty("minHeight." + n);
        String string2 = properties.getProperty("maxHeight." + n);
        if (string == null && string2 == null) {
            return null;
        }
        int n2 = 0;
        if (string != null && (n2 = Config.lllIIIllIIIIlllIlIIllIIll(string, -1)) < 0) {
            Config.lllIlIIlIIIlIlIIIllIlllIl("Invalid minHeight: " + string);
            return null;
        }
        int n3 = 256;
        if (string2 != null && (n3 = Config.lllIIIllIIIIlllIlIIllIIll(string2, -1)) < 0) {
            Config.lllIlIIlIIIlIlIIIllIlllIl("Invalid maxHeight: " + string2);
            return null;
        }
        if (n3 < 0) {
            Config.lllIlIIlIIIlIlIIIllIlllIl("Invalid minHeight, maxHeight: " + string + ", " + string2);
            return null;
        }
        class_1475 class_14752 = new class_1475();
        class_14752.lllIIIllIIIIlllIlIIllIIll(new class_1519(n2, n3));
        return class_14752;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(String string) {
        Object object;
        int n;
        if (this.IlIllllllIIlIIllllIIlIIIl == null && this.lIlllIlllIIIIlIIlllIllIII == null) {
            Config.lllIlIIlIIIlIlIIIllIlllIl("No skins specified: " + string);
            return false;
        }
        if (this.lIlllIlllIIIIlIIlllIllIII != null) {
            for (n = 0; n < this.lIlllIlllIIIIlIIlllIllIII.length; ++n) {
                object = this.lIlllIlllIIIIlIIlllIllIII[n];
                if (((class_0285)object).lllIIIllIIIIlllIlIIllIIll(string)) continue;
                return false;
            }
        }
        if (this.IlIllllllIIlIIllllIIlIIIl != null) {
            for (n = 0; n < this.IlIllllllIIlIIllllIIlIIIl.length; ++n) {
                object = this.IlIllllllIIlIIllllIIlIIIl[n];
                if (Config.IlIllllllIIlIIllllIIlIIIl((ResourceLocation)object)) continue;
                Config.lllIlIIlIIIlIlIIIllIlllIl("Texture not found: " + ((ResourceLocation)object).lllIIIllIIIIlllIlIIllIIll());
                return false;
            }
        }
        return true;
    }
}

