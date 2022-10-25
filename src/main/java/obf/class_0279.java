package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 */
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

public class class_0279 {
    public static float lllIIIllIIIIlllIlIIllIIll(JsonObject jsonObject, String string, float f) {
        JsonElement jsonElement = jsonObject.get(string);
        return jsonElement == null ? f : jsonElement.getAsFloat();
    }

    public static boolean lllIIIllIIIIlllIlIIllIIll(JsonObject jsonObject, String string, boolean bl) {
        JsonElement jsonElement = jsonObject.get(string);
        return jsonElement == null ? bl : jsonElement.getAsBoolean();
    }

    public static String lllIIIllIIIIlllIlIIllIIll(JsonObject jsonObject, String string) {
        return class_0279.lllIIIllIIIIlllIlIIllIIll(jsonObject, string, (String)null);
    }

    public static String lllIIIllIIIIlllIlIIllIIll(JsonObject jsonObject, String string, String string2) {
        JsonElement jsonElement = jsonObject.get(string);
        return jsonElement == null ? string2 : jsonElement.getAsString();
    }

    public static float[] lllIIIllIIIIlllIlIIllIIll(JsonElement jsonElement, int n) {
        return class_0279.lllIIIllIIIIlllIlIIllIIll(jsonElement, n, (float[])null);
    }

    public static float[] lllIIIllIIIIlllIlIIllIIll(JsonElement jsonElement, int n, float[] arrf) {
        if (jsonElement == null) {
            return arrf;
        }
        JsonArray jsonArray = jsonElement.getAsJsonArray();
        if (jsonArray.size() != n) {
            throw new JsonParseException("Wrong array length: " + jsonArray.size() + ", should be: " + n + ", array: " + (Object)jsonArray);
        }
        float[] arrf2 = new float[jsonArray.size()];
        for (int i = 0; i < arrf2.length; ++i) {
            arrf2[i] = jsonArray.get(i).getAsFloat();
        }
        return arrf2;
    }

    public static int[] lllIlIIlIIIlIlIIIllIlllIl(JsonElement jsonElement, int n) {
        return class_0279.lllIIIllIIIIlllIlIIllIIll(jsonElement, n, (int[])null);
    }

    public static int[] lllIIIllIIIIlllIlIIllIIll(JsonElement jsonElement, int n, int[] arrn) {
        if (jsonElement == null) {
            return arrn;
        }
        JsonArray jsonArray = jsonElement.getAsJsonArray();
        if (jsonArray.size() != n) {
            throw new JsonParseException("Wrong array length: " + jsonArray.size() + ", should be: " + n + ", array: " + (Object)jsonArray);
        }
        int[] arrn2 = new int[jsonArray.size()];
        for (int i = 0; i < arrn2.length; ++i) {
            arrn2[i] = jsonArray.get(i).getAsInt();
        }
        return arrn2;
    }
}

