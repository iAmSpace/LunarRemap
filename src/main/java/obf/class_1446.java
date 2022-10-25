package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.util.ResourceLocation;
import optifine.Config;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class class_1446 {
    private static class_1363[] lllIIIllIIIIlllIlIIllIIll = new class_1363[0];

    public static void lllIIIllIIIIlllIlIIllIIll() {
        lllIIIllIIIIlllIlIIllIIll = new class_1363[0];
        if (Config.IIIIlllIIlIllllllIllIIlll()) {
            String string = "optifine/natural.properties";
            try {
                ResourceLocation class_17732 = new ResourceLocation(string);
                if (!Config.IlIllllllIIlIIllllIIlIIIl(class_17732)) {
                    Config.lllIIIllIIIIlllIlIIllIIll("NaturalTextures: configuration \"" + string + "\" not found");
                    lllIIIllIIIIlllIlIIllIIll = class_1446.lllIlIIlIIIlIlIIIllIlllIl();
                    return;
                }
                InputStream inputStream = Config.lllIIIllIIIIlllIlIIllIIll(class_17732);
                ArrayList<class_1363> arrayList = new ArrayList<class_1363>(256);
                String string2 = Config.lllIlIIlIIIlIlIIIllIlllIl(inputStream);
                inputStream.close();
                String[] arrstring = Config.lllIIIllIIIIlllIlIIllIIll(string2, "\n\r");
                Config.lllIIIllIIIIlllIlIIllIIll("Natural Textures: Parsing configuration \"" + string + "\"");
                for (int i = 0; i < arrstring.length; ++i) {
                    String string3 = arrstring[i].trim();
                    if (string3.startsWith("#")) continue;
                    String[] arrstring2 = Config.lllIIIllIIIIlllIlIIllIIll(string3, "=");
                    if (arrstring2.length != 2) {
                        Config.lllIlIIlIIIlIlIIIllIlllIl("Natural Textures: Invalid \"" + string + "\" line: " + string3);
                        continue;
                    }
                    String string4 = arrstring2[0].trim();
                    String string5 = arrstring2[1].trim();
                    class_1585 class_15852 = class_1511.lIllllIIlIIIlIllllllIIIll.lIlllIlllIIIIlIIlllIllIII(string4);
                    if (class_15852 == null) {
                        Config.lllIlIIlIIIlIlIIIllIlllIl("Natural Textures: Texture not found: \"" + string + "\" line: " + string3);
                        continue;
                    }
                    int n = class_15852.IlIlIIlIlIllIIlIlIIllIIIl();
                    if (n < 0) {
                        Config.lllIlIIlIIIlIlIIIllIlllIl("Natural Textures: Invalid \"" + string + "\" line: " + string3);
                        continue;
                    }
                    class_1363 class_13632 = new class_1363(string5);
                    if (!class_13632.lllIIIllIIIIlllIlIIllIIll()) continue;
                    while (arrayList.size() <= n) {
                        arrayList.add(null);
                    }
                    arrayList.set(n, class_13632);
                    Config.lllIIIllIIIIlllIlIIllIIll("NaturalTextures: " + string4 + " = " + string5);
                }
                lllIIIllIIIIlllIlIIllIIll = arrayList.toArray(new class_1363[arrayList.size()]);
            }
            catch (FileNotFoundException fileNotFoundException) {
                Config.lllIlIIlIIIlIlIIIllIlllIl("NaturalTextures: configuration \"" + string + "\" not found");
                lllIIIllIIIIlllIlIIllIIll = class_1446.lllIlIIlIIIlIlIIIllIlllIl();
                return;
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    public static class_1363 lllIIIllIIIIlllIlIIllIIll(IIcon class_21022) {
        if (!(class_21022 instanceof class_1585)) {
            return null;
        }
        class_1585 class_15852 = (class_1585)class_21022;
        int n = class_15852.IlIlIIlIlIllIIlIlIIllIIIl();
        if (n >= 0 && n < lllIIIllIIIIlllIlIIllIIll.length) {
            class_1363 class_13632 = lllIIIllIIIIlllIlIIllIIll[n];
            return class_13632;
        }
        return null;
    }

    private static class_1363[] lllIlIIlIIIlIlIIIllIlllIl() {
        Config.lllIIIllIIIIlllIlIIllIIll("NaturalTextures: Checking default configuration.");
        ArrayList arrayList = new ArrayList();
        class_1446.lllIIIllIIIIlllIlIIllIIll(arrayList, "grass_top", "4F");
        class_1446.lllIIIllIIIIlllIlIIllIIll(arrayList, "stone", "2F");
        class_1446.lllIIIllIIIIlllIlIIllIIll(arrayList, "dirt", "4F");
        class_1446.lllIIIllIIIIlllIlIIllIIll(arrayList, "grass_side", "F");
        class_1446.lllIIIllIIIIlllIlIIllIIll(arrayList, "grass_side_overlay", "F");
        class_1446.lllIIIllIIIIlllIlIIllIIll(arrayList, "stone_slab_top", "F");
        class_1446.lllIIIllIIIIlllIlIIllIIll(arrayList, "bedrock", "2F");
        class_1446.lllIIIllIIIIlllIlIIllIIll(arrayList, "sand", "4F");
        class_1446.lllIIIllIIIIlllIlIIllIIll(arrayList, "gravel", "2");
        class_1446.lllIIIllIIIIlllIlIIllIIll(arrayList, "log_oak", "2F");
        class_1446.lllIIIllIIIIlllIlIIllIIll(arrayList, "log_oak_top", "4F");
        class_1446.lllIIIllIIIIlllIlIIllIIll(arrayList, "gold_ore", "2F");
        class_1446.lllIIIllIIIIlllIlIIllIIll(arrayList, "iron_ore", "2F");
        class_1446.lllIIIllIIIIlllIlIIllIIll(arrayList, "coal_ore", "2F");
        class_1446.lllIIIllIIIIlllIlIIllIIll(arrayList, "diamond_ore", "2F");
        class_1446.lllIIIllIIIIlllIlIIllIIll(arrayList, "redstone_ore", "2F");
        class_1446.lllIIIllIIIIlllIlIIllIIll(arrayList, "lapis_ore", "2F");
        class_1446.lllIIIllIIIIlllIlIIllIIll(arrayList, "obsidian", "4F");
        class_1446.lllIIIllIIIIlllIlIIllIIll(arrayList, "leaves_oak", "2F");
        class_1446.lllIIIllIIIIlllIlIIllIIll(arrayList, "leaves_oak_opaque", "2F");
        class_1446.lllIIIllIIIIlllIlIIllIIll(arrayList, "leaves_jungle", "2");
        class_1446.lllIIIllIIIIlllIlIIllIIll(arrayList, "leaves_jungle_opaque", "2");
        class_1446.lllIIIllIIIIlllIlIIllIIll(arrayList, "snow", "4F");
        class_1446.lllIIIllIIIIlllIlIIllIIll(arrayList, "grass_side_snowed", "F");
        class_1446.lllIIIllIIIIlllIlIIllIIll(arrayList, "cactus_side", "2F");
        class_1446.lllIIIllIIIIlllIlIIllIIll(arrayList, "clay", "4F");
        class_1446.lllIIIllIIIIlllIlIIllIIll(arrayList, "mycelium_side", "F");
        class_1446.lllIIIllIIIIlllIlIIllIIll(arrayList, "mycelium_top", "4F");
        class_1446.lllIIIllIIIIlllIlIIllIIll(arrayList, "farmland_wet", "2F");
        class_1446.lllIIIllIIIIlllIlIIllIIll(arrayList, "farmland_dry", "2F");
        class_1446.lllIIIllIIIIlllIlIIllIIll(arrayList, "netherrack", "4F");
        class_1446.lllIIIllIIIIlllIlIIllIIll(arrayList, "soul_sand", "4F");
        class_1446.lllIIIllIIIIlllIlIIllIIll(arrayList, "glowstone", "4");
        class_1446.lllIIIllIIIIlllIlIIllIIll(arrayList, "log_spruce", "2F");
        class_1446.lllIIIllIIIIlllIlIIllIIll(arrayList, "log_birch", "F");
        class_1446.lllIIIllIIIIlllIlIIllIIll(arrayList, "leaves_spruce", "2F");
        class_1446.lllIIIllIIIIlllIlIIllIIll(arrayList, "leaves_spruce_opaque", "2F");
        class_1446.lllIIIllIIIIlllIlIIllIIll(arrayList, "log_jungle", "2F");
        class_1446.lllIIIllIIIIlllIlIIllIIll(arrayList, "end_stone", "4");
        class_1446.lllIIIllIIIIlllIlIIllIIll(arrayList, "sandstone_top", "4");
        class_1446.lllIIIllIIIIlllIlIIllIIll(arrayList, "sandstone_bottom", "4F");
        class_1446.lllIIIllIIIIlllIlIIllIIll(arrayList, "redstone_lamp_on", "4F");
        class_1363[] arrclass_1363 = arrayList.toArray(new class_1363[arrayList.size()]);
        return arrclass_1363;
    }

    private static void lllIIIllIIIIlllIlIIllIIll(List list, String string, String string2) {
        class_1511 class_15112 = class_1511.lIllllIIlIIIlIllllllIIIll;
        class_1585 class_15852 = class_15112.lIlllIlllIIIIlIIlllIllIII(string);
        if (class_15852 == null) {
            Config.lllIlIIlIIIlIlIIIllIlllIl("*** NaturalProperties: Icon not found: " + string + " ***");
        } else if (!(class_15852 instanceof class_1585)) {
            Config.lllIlIIlIIIlIlIIIllIlllIl("*** NaturalProperties: Icon is not IconStitched: " + string + ": " + class_15852.getClass().getName() + " ***");
        } else {
            class_1585 class_15853 = class_15852;
            int n = class_15853.IlIlIIlIlIllIIlIlIIllIIIl();
            if (n < 0) {
                Config.lllIlIIlIIIlIlIIIllIlllIl("*** NaturalProperties: Invalid index for icon: " + string + ": " + n + " ***");
            } else if (Config.lIlllIlllIIIIlIIlllIllIII(new ResourceLocation("textures/blocks/" + string + ".png"))) {
                while (n >= list.size()) {
                    list.add(null);
                }
                class_1363 class_13632 = new class_1363(string2);
                list.set(n, class_13632);
                Config.lllIIIllIIIIlllIlIIllIIll("NaturalTextures: " + string + " = " + string2);
            }
        }
    }
}

