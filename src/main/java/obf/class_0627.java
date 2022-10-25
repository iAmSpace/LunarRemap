package obf;/*
 * Decompiled with CFR 0.150.
 */
import optifine.Config;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Set;

public class class_0627 {
    public static Properties lllIIIllIIIIlllIlIIllIIll(ResourceLocation class_17732) {
        String string = class_17732.lllIIIllIIIIlllIlIIllIIll();
        Properties properties = new Properties();
        String string2 = ".png";
        if (!string.endsWith(string2)) {
            return properties;
        }
        String string3 = string.substring(0, string.length() - string2.length()) + ".properties";
        try {
            ResourceLocation class_17733 = new ResourceLocation(class_17732.lllIlIIlIIIlIlIIIllIlllIl(), string3);
            InputStream inputStream = Config.lllIIIllIIIIlllIlIIllIIll(Config.lIIIlIIIlIlllIllIIIlIIIlI(), class_17733);
            if (inputStream == null) {
                return properties;
            }
            Config.lIlllIlllIIIIlIIlllIllIII("Loading " + string3);
            properties.load(inputStream);
        }
        catch (FileNotFoundException fileNotFoundException) {
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        return properties;
    }

    public static void lllIIIllIIIIlllIlIIllIIll(Properties properties, float[] arrf) {
        Set<Object> set = properties.keySet();
        for (String string : set) {
            String string2;
            float f;
            String string3;
            int n;
            String string4;
            if (!string.startsWith(string4 = "width.") || (n = Config.lllIIIllIIIIlllIlIIllIIll(string3 = string.substring(string4.length()), -1)) < 0 || n >= arrf.length || !((f = Config.lllIIIllIIIIlllIlIIllIIll(string2 = properties.getProperty(string), -1.0f)) >= 0.0f)) continue;
            arrf[n] = f;
        }
    }

    public static float lllIIIllIIIIlllIlIIllIIll(Properties properties, String string, float f) {
        String string2 = properties.getProperty(string);
        if (string2 == null) {
            return f;
        }
        float f2 = Config.lllIIIllIIIIlllIlIIllIIll(string2, Float.MIN_VALUE);
        if (f2 == Float.MIN_VALUE) {
            Config.lllIlIIlIIIlIlIIIllIlllIl("Invalid value for " + string + ": " + string2);
            return f;
        }
        return f2;
    }

    public static ResourceLocation lllIlIIlIIIlIlIIIllIlllIl(ResourceLocation class_17732) {
        if (!Config.lIlIIlllllIlllllIlIIIllll()) {
            return class_17732;
        }
        if (class_17732 == null) {
            return class_17732;
        }
        String string = class_17732.lllIIIllIIIIlllIlIIllIIll();
        String string2 = "textures/";
        String string3 = "mcpatcher/";
        if (!string.startsWith(string2)) {
            return class_17732;
        }
        string = string.substring(string2.length());
        string = string3 + string;
        ResourceLocation class_17733 = new ResourceLocation(class_17732.lllIlIIlIIIlIlIIIllIlllIl(), string);
        return Config.lllIlIIlIIIlIlIIIllIlllIl(Config.lIIIlIIIlIlllIllIIIlIIIlI(), class_17733) ? class_17733 : class_17732;
    }
}

