package obf;/*
 * Decompiled with CFR 0.150.
 */
import optifine.Config;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;

public class class_1065 {
    private static class_1337[][] lllIIIllIIIIlllIlIIllIIll = null;

    public static void lllIIIllIIIIlllIlIIllIIll() {
        lllIIIllIIIIlllIlIIllIIll = null;
    }

    public static void lllIlIIlIIIlIlIIIllIlllIl() {
        class_1065.lllIIIllIIIIlllIlIIllIIll();
        if (Config.lIlIIIllIIllIIlIllllllIll()) {
            lllIIIllIIIIlllIlIIllIIll = class_1065.IlIllllllIIlIIllllIIlIIIl();
        }
    }

    private static class_1337[][] IlIllllllIIlIIllllIIlIIIl() {
        class_1337[][] arrclass_1337;
        int n;
        class_1337[][] arrclass_13372 = new class_1337[10][0];
        String string = "mcpatcher/sky/world";
        int n2 = -1;
        for (n = 0; n < arrclass_13372.length; ++n) {
            class_1337[] arrclass_13373;
            arrclass_1337 = string + n + "/sky";
            ArrayList<class_1337> arrayList = new ArrayList<class_1337>();
            for (int i = 1; i < 1000; ++i) {
                arrclass_13373 = (String)arrclass_1337 + i + ".properties";
                try {
                    ResourceLocation class_17732 = new ResourceLocation((String)arrclass_13373);
                    InputStream inputStream = Config.lllIIIllIIIIlllIlIIllIIll(class_17732);
                    if (inputStream == null) break;
                    Properties properties = new Properties();
                    properties.load(inputStream);
                    inputStream.close();
                    Config.lllIIIllIIIIlllIlIIllIIll("CustomSky properties: " + (String)arrclass_13373);
                    String string2 = (String)arrclass_1337 + i + ".png";
                    class_1337 class_13372 = new class_1337(properties, string2);
                    if (!class_13372.lllIIIllIIIIlllIlIIllIIll((String)arrclass_13373)) continue;
                    ResourceLocation class_17733 = new ResourceLocation(class_13372.lllIIIllIIIIlllIlIIllIIll);
                    class_0211 class_02112 = class_1384.lllIIIllIIIIlllIlIIllIIll(class_17733);
                    if (class_02112 == null) {
                        Config.lIlllIlllIIIIlIIlllIllIII("CustomSky: Texture not found: " + class_17733);
                        continue;
                    }
                    class_13372.lllIlIIlIIIlIlIIIllIlllIl = class_02112.lllIIIllIIIIlllIlIIllIIll();
                    arrayList.add(class_13372);
                    inputStream.close();
                    continue;
                }
                catch (FileNotFoundException fileNotFoundException) {
                    break;
                }
                catch (IOException iOException) {
                    iOException.printStackTrace();
                }
            }
            if (arrayList.size() <= 0) continue;
            arrclass_13373 = arrayList.toArray(new class_1337[arrayList.size()]);
            arrclass_13372[n] = arrclass_13373;
            n2 = n;
        }
        if (n2 < 0) {
            return null;
        }
        n = n2 + 1;
        arrclass_1337 = new class_1337[n][0];
        for (int i = 0; i < arrclass_1337.length; ++i) {
            arrclass_1337[i] = arrclass_13372[i];
        }
        return arrclass_1337;
    }

    public static void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, class_1682 class_16822, float f, float f2) {
        class_1337[] arrclass_1337;
        int n;
        if (lllIIIllIIIIlllIlIIllIIll != null && (n = class_13342.IlIlIIlllIIlIllIIIlllllIl.IIIllIllIIlIlIlIlIllllIIl) >= 0 && n < lllIIIllIIIIlllIlIIllIIll.length && (arrclass_1337 = lllIIIllIIIIlllIlIIllIIll[n]) != null) {
            long l = class_13342.IIlllIlIlllIllIIIlllIIlIl();
            int n2 = (int)(l % 24000L);
            for (int i = 0; i < arrclass_1337.length; ++i) {
                class_1337 class_13372 = arrclass_1337[i];
                if (!class_13372.lllIIIllIIIIlllIlIIllIIll(n2)) continue;
                class_13372.lllIIIllIIIIlllIlIIllIIll(n2, f, f2);
            }
            class_0934.lllIIIllIIIIlllIlIIllIIll(f2);
        }
    }

    public static boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342) {
        if (lllIIIllIIIIlllIlIIllIIll == null) {
            return false;
        }
        if (Config.getGameSettings().IlIllllllIIlIIllllIIlIIIl < 8) {
            return false;
        }
        int n = class_13342.IlIlIIlllIIlIllIIIlllllIl.IIIllIllIIlIlIlIlIllllIIl;
        if (n >= 0 && n < lllIIIllIIIIlllIlIIllIIll.length) {
            class_1337[] arrclass_1337 = lllIIIllIIIIlllIlIIllIIll[n];
            return arrclass_1337 == null ? false : arrclass_1337.length > 0;
        }
        return false;
    }
}

