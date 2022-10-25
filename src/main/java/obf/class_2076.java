package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonParser
 */
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import optifine.Config;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class class_2076 {
    private static JsonParser lIlIllIIlIIlIIlIIlIIlIIll = new JsonParser();
    public static final String lllIIIllIIIIlllIlIIllIIll = "type";
    public static final String lllIlIIlIIIlIlIIIllIlllIl = "textureSize";
    public static final String IlIllllllIIlIIllllIIlIIIl = "usePlayerTexture";
    public static final String lIlllIlllIIIIlIIlllIllIII = "models";
    public static final String IlIIIIIllllllIIlllIllllll = "id";
    public static final String lIllllIIlIIIlIllllllIIIll = "baseId";
    public static final String IIIllIIlIIIIIIlIlIIllIIlI = "type";
    public static final String IllIIlllllllIIlIIlIIIIlIl = "attachTo";
    public static final String IIIllIllIIlIlIlIlIllllIIl = "invertAxis";
    public static final String IllIIIllIIIIlIlIlIllIIlll = "mirrorTexture";
    public static final String lIIIIlIlIIlllllIIllIIlIII = "translate";
    public static final String llIIlllIllIllllIIIlIIIIII = "rotate";
    public static final String llIIllIllIlIIlIIllIllllll = "scale";
    public static final String lllIIlIIIllllllIIIIlIlIlI = "boxes";
    public static final String IlIlllIIIIIIlIIllIIllIlll = "sprites";
    public static final String IlIlIIlIlIllIIlIlIIllIIIl = "submodel";
    public static final String lllllIlllIIllIlIIlIIIllII = "submodels";
    public static final String IlIlIIlllIIlIllIIIlllllIl = "textureOffset";
    public static final String lIIlIIIIIlIlllIlIIlIlIlll = "coordinates";
    public static final String lIlIlIIlIIIIlIIIIIlllIIII = "sizeAdd";
    public static final String IlIIIlIIIIllIIIllIIIIIIll = "PlayerItem";
    public static final String IIlllIlIlllIllIIIlllIIlIl = "ModelBox";

    public static class_0524 lllIIIllIIIIlllIlIIllIIll(JsonObject jsonObject) {
        String string = class_0279.lllIIIllIIIIlllIlIIllIIll(jsonObject, "type");
        if (!Config.lllIIIllIIIIlllIlIIllIIll((Object)string, (Object)IlIIIlIIIIllIIIllIIIIIIll)) {
            throw new JsonParseException("Unknown model type: " + string);
        }
        int[] arrn = class_0279.lllIlIIlIIIlIlIIIllIlllIl(jsonObject.get(lllIlIIlIIIlIlIIIllIlllIl), 2);
        class_2076.lllIIIllIIIIlllIlIIllIIll(arrn, "Missing texture size");
        Dimension dimension = new Dimension(arrn[0], arrn[1]);
        boolean bl = class_0279.lllIIIllIIIIlllIlIIllIIll(jsonObject, IlIllllllIIlIIllllIIlIIIl, false);
        JsonArray jsonArray = (JsonArray)jsonObject.get(lIlllIlllIIIIlIIlllIllIII);
        class_2076.lllIIIllIIIIlllIlIIllIIll((Object)jsonArray, "Missing elements");
        HashMap<String, JsonObject> hashMap = new HashMap<String, JsonObject>();
        ArrayList<Object> arrayList = new ArrayList<Object>();
        new ArrayList();
        for (int i = 0; i < jsonArray.size(); ++i) {
            Object object;
            String string2;
            JsonObject jsonObject2 = (JsonObject)jsonArray.get(i);
            String string3 = class_0279.lllIIIllIIIIlllIlIIllIIll(jsonObject2, lIllllIIlIIIlIllllllIIIll);
            if (string3 != null) {
                string2 = (JsonObject)hashMap.get(string3);
                if (string2 == null) {
                    Config.lllIlIIlIIIlIlIIIllIlllIl("BaseID not found: " + string3);
                    continue;
                }
                object = string2.entrySet();
                Iterator iterator = object.iterator();
                while (iterator.hasNext()) {
                    Map.Entry entry = (Map.Entry)iterator.next();
                    if (jsonObject2.has((String)entry.getKey())) continue;
                    jsonObject2.add((String)entry.getKey(), (JsonElement)entry.getValue());
                }
            }
            if ((string2 = class_0279.lllIIIllIIIIlllIlIIllIIll(jsonObject2, IlIIIIIllllllIIlllIllllll)) != null) {
                if (!hashMap.containsKey(string2)) {
                    hashMap.put(string2, jsonObject2);
                } else {
                    Config.lllIlIIlIIIlIlIIIllIlllIl("Duplicate model ID: " + string2);
                }
            }
            if ((object = class_2076.lllIIIllIIIIlllIlIIllIIll(jsonObject2, dimension)) == null) continue;
            arrayList.add(object);
        }
        class_2108[] arrclass_2108 = arrayList.toArray(new class_2108[arrayList.size()]);
        return new class_0524(dimension, bl, arrclass_2108);
    }

    private static void lllIIIllIIIIlllIlIIllIIll(Object object, String string) {
        if (object == null) {
            throw new JsonParseException(string);
        }
    }

    private static ResourceLocation lllIIIllIIIIlllIlIIllIIll(String string) {
        int n = string.indexOf(58);
        if (n < 0) {
            return new ResourceLocation(string);
        }
        String string2 = string.substring(0, n);
        String string3 = string.substring(n + 1);
        return new ResourceLocation(string2, string3);
    }

    private static int lllIlIIlIIIlIlIIIllIlllIl(String string) {
        if (string == null) {
            return 0;
        }
        if (string.equals("body")) {
            return 0;
        }
        if (string.equals("head")) {
            return 1;
        }
        if (string.equals("leftArm")) {
            return 2;
        }
        if (string.equals("rightArm")) {
            return 3;
        }
        if (string.equals("leftLeg")) {
            return 4;
        }
        if (string.equals("rightLeg")) {
            return 5;
        }
        if (string.equals("cape")) {
            return 6;
        }
        Config.lllIlIIlIIIlIlIIIllIlllIl("Unknown attachModel: " + string);
        return 0;
    }

    private static class_2108 lllIIIllIIIIlllIlIIllIIll(JsonObject jsonObject, Dimension dimension) {
        String string = class_0279.lllIIIllIIIIlllIlIIllIIll(jsonObject, "type");
        if (!Config.lllIIIllIIIIlllIlIIllIIll((Object)string, (Object)IIlllIlIlllIllIIIlllIIlIl)) {
            Config.lllIlIIlIIIlIlIIIllIlllIl("Unknown model type: " + string);
            return null;
        }
        String string2 = class_0279.lllIIIllIIIIlllIlIIllIIll(jsonObject, IllIIlllllllIIlIIlIIIIlIl);
        int n = class_2076.lllIlIIlIIIlIlIIIllIlllIl(string2);
        float f = class_0279.lllIIIllIIIIlllIlIIllIIll(jsonObject, llIIllIllIlIIlIIllIllllll, 1.0f);
        class_0662 class_06622 = new class_0662();
        class_06622.IlIIIIIllllllIIlllIllllll = dimension.width;
        class_06622.lIllllIIlIIIlIllllllIIIll = dimension.height;
        class_0744 class_07442 = class_2076.lllIIIllIIIIlllIlIIllIIll(jsonObject, class_06622);
        class_2108 class_21082 = new class_2108(n, f, class_07442);
        return class_21082;
    }

    private static class_0744 lllIIIllIIIIlllIlIIllIIll(JsonObject jsonObject, class_1382 class_13822) {
        JsonArray jsonArray;
        Object object;
        JsonArray jsonArray2;
        Object object2;
        JsonObject jsonObject2;
        JsonArray jsonArray3;
        class_0744 class_07442 = new class_0744(class_13822);
        String string = class_0279.lllIIIllIIIIlllIlIIllIIll(jsonObject, IIIllIllIIlIlIlIlIllllIIl, "").toLowerCase();
        boolean bl = string.contains("x");
        boolean bl2 = string.contains("y");
        boolean bl3 = string.contains("z");
        float[] arrf = class_0279.lllIIIllIIIIlllIlIIllIIll(jsonObject.get(lIIIIlIlIIlllllIIllIIlIII), 3, new float[3]);
        if (bl) {
            arrf[0] = -arrf[0];
        }
        if (bl2) {
            arrf[1] = -arrf[1];
        }
        if (bl3) {
            arrf[2] = -arrf[2];
        }
        float[] arrf2 = class_0279.lllIIIllIIIIlllIlIIllIIll(jsonObject.get(llIIlllIllIllllIIIlIIIIII), 3, new float[3]);
        for (int i = 0; i < arrf2.length; ++i) {
            arrf2[i] = arrf2[i] / 180.0f * (float)Math.PI;
        }
        if (bl) {
            arrf2[0] = -arrf2[0];
        }
        if (bl2) {
            arrf2[1] = -arrf2[1];
        }
        if (bl3) {
            arrf2[2] = -arrf2[2];
        }
        class_07442.lllIIIllIIIIlllIlIIllIIll(arrf[0], arrf[1], arrf[2]);
        class_07442.lIllllIIlIIIlIllllllIIIll = arrf2[0];
        class_07442.IIIllIIlIIIIIIlIlIIllIIlI = arrf2[1];
        class_07442.IllIIlllllllIIlIIlIIIIlIl = arrf2[2];
        String string2 = class_0279.lllIIIllIIIIlllIlIIllIIll(jsonObject, IllIIIllIIIIlIlIlIllIIlll, "").toLowerCase();
        boolean bl4 = string2.contains("u");
        boolean bl5 = string2.contains("v");
        if (bl4) {
            class_07442.IIIllIllIIlIlIlIlIllllIIl = true;
        }
        if (bl5) {
            class_07442.lIIlIIIIIlIlllIlIIlIlIlll = true;
        }
        if ((jsonArray3 = jsonObject.getAsJsonArray(lllIIlIIIllllllIIIIlIlIlI)) != null) {
            for (int i = 0; i < jsonArray3.size(); ++i) {
                jsonObject2 = jsonArray3.get(i).getAsJsonObject();
                int[] arrn = class_0279.lllIlIIlIIIlIlIIIllIlllIl(jsonObject2.get(IlIlIIlllIIlIllIIIlllllIl), 2);
                if (arrn == null) {
                    throw new JsonParseException("Texture offset not specified");
                }
                object2 = class_0279.lllIIIllIIIIlllIlIIllIIll(jsonObject2.get(lIIlIIIIIlIlllIlIIlIlIlll), 6);
                if (object2 == null) {
                    throw new JsonParseException("Coordinates not specified");
                }
                if (bl) {
                    object2[0] = -object2[0] - object2[3];
                }
                if (bl2) {
                    object2[1] = -object2[1] - object2[4];
                }
                if (bl3) {
                    object2[2] = -object2[2] - object2[5];
                }
                float f = class_0279.lllIIIllIIIIlllIlIIllIIll(jsonObject2, lIlIlIIlIIIIlIIIIIlllIIII, 0.0f);
                class_07442.lllIIIllIIIIlllIlIIllIIll(arrn[0], arrn[1]);
                class_07442.lllIIIllIIIIlllIlIIllIIll((float)object2[0], (float)object2[1], (float)object2[2], (int)object2[3], (int)object2[4], (int)object2[5], f);
            }
        }
        if ((jsonArray2 = jsonObject.getAsJsonArray(IlIlllIIIIIIlIIllIIllIlll)) != null) {
            for (int i = 0; i < jsonArray2.size(); ++i) {
                object2 = jsonArray2.get(i).getAsJsonObject();
                int[] arrn = class_0279.lllIlIIlIIIlIlIIIllIlllIl(object2.get(IlIlIIlllIIlIllIIIlllllIl), 2);
                if (arrn == null) {
                    throw new JsonParseException("Texture offset not specified");
                }
                object = class_0279.lllIIIllIIIIlllIlIIllIIll(object2.get(lIIlIIIIIlIlllIlIIlIlIlll), 6);
                if (object == null) {
                    throw new JsonParseException("Coordinates not specified");
                }
                if (bl) {
                    object[0] = -object[0] - object[3];
                }
                if (bl2) {
                    object[1] = -object[1] - object[4];
                }
                if (bl3) {
                    object[2] = -object[2] - object[5];
                }
                float f = class_0279.lllIIIllIIIIlllIlIIllIIll(object2, lIlIlIIlIIIIlIIIIIlllIIII, 0.0f);
                class_07442.lllIIIllIIIIlllIlIIllIIll(arrn[0], arrn[1]);
                class_07442.lllIlIIlIIIlIlIIIllIlllIl(object[0], object[1], object[2], (int)object[3], (int)object[4], (int)object[5], f);
            }
        }
        if ((jsonObject2 = (JsonObject)jsonObject.get(IlIlIIlIlIllIIlIlIIllIIIl)) != null) {
            class_0744 class_07443 = class_2076.lllIIIllIIIIlllIlIIllIIll(jsonObject2, class_13822);
            class_07442.lllIIIllIIIIlllIlIIllIIll(class_07443);
        }
        if ((jsonArray = (JsonArray)jsonObject.get(lllllIlllIIllIlIIlIIIllII)) != null) {
            for (int i = 0; i < jsonArray.size(); ++i) {
                JsonObject jsonObject3 = (JsonObject)jsonArray.get(i);
                object = class_2076.lllIIIllIIIIlllIlIIllIIll(jsonObject3, class_13822);
                class_07442.lllIIIllIIIIlllIlIIllIIll((class_0744)object);
            }
        }
        return class_07442;
    }
}

