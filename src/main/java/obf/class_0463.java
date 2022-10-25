package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonPrimitive
 *  com.google.gson.JsonSyntaxException
 *  org.apache.commons.lang3.StringUtils
 */
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import org.apache.commons.lang3.StringUtils;

public class class_0463 {
    public static boolean lllIIIllIIIIlllIlIIllIIll(JsonObject jsonObject, String string) {
        return !class_0463.IlIllllllIIlIIllllIIlIIIl(jsonObject, string) ? false : jsonObject.getAsJsonPrimitive(string).isString();
    }

    public static boolean lllIIIllIIIIlllIlIIllIIll(JsonElement jsonElement) {
        return !jsonElement.isJsonPrimitive() ? false : jsonElement.getAsJsonPrimitive().isString();
    }

    public static boolean lllIlIIlIIIlIlIIIllIlllIl(JsonObject jsonObject, String string) {
        return !class_0463.lIlllIlllIIIIlIIlllIllIII(jsonObject, string) ? false : jsonObject.get(string).isJsonArray();
    }

    public static boolean IlIllllllIIlIIllllIIlIIIl(JsonObject jsonObject, String string) {
        return !class_0463.lIlllIlllIIIIlIIlllIllIII(jsonObject, string) ? false : jsonObject.get(string).isJsonPrimitive();
    }

    public static boolean lIlllIlllIIIIlIIlllIllIII(JsonObject jsonObject, String string) {
        return jsonObject == null ? false : jsonObject.get(string) != null;
    }

    public static String lllIIIllIIIIlllIlIIllIIll(JsonElement jsonElement, String string) {
        if (jsonElement.isJsonPrimitive()) {
            return jsonElement.getAsString();
        }
        throw new JsonSyntaxException("Expected " + string + " to be a string, was " + class_0463.lllIlIIlIIIlIlIIIllIlllIl(jsonElement));
    }

    public static String IlIIIIIllllllIIlllIllllll(JsonObject jsonObject, String string) {
        if (jsonObject.has(string)) {
            return class_0463.lllIIIllIIIIlllIlIIllIIll(jsonObject.get(string), string);
        }
        throw new JsonSyntaxException("Missing " + string + ", expected to find a string");
    }

    public static String lllIIIllIIIIlllIlIIllIIll(JsonObject jsonObject, String string, String string2) {
        return jsonObject.has(string) ? class_0463.lllIIIllIIIIlllIlIIllIIll(jsonObject.get(string), string) : string2;
    }

    public static boolean lllIlIIlIIIlIlIIIllIlllIl(JsonElement jsonElement, String string) {
        if (jsonElement.isJsonPrimitive()) {
            return jsonElement.getAsBoolean();
        }
        throw new JsonSyntaxException("Expected " + string + " to be a Boolean, was " + class_0463.lllIlIIlIIIlIlIIIllIlllIl(jsonElement));
    }

    public static boolean lIllllIIlIIIlIllllllIIIll(JsonObject jsonObject, String string) {
        if (jsonObject.has(string)) {
            return class_0463.lllIlIIlIIIlIlIIIllIlllIl(jsonObject.get(string), string);
        }
        throw new JsonSyntaxException("Missing " + string + ", expected to find a Boolean");
    }

    public static boolean lllIIIllIIIIlllIlIIllIIll(JsonObject jsonObject, String string, boolean bl) {
        return jsonObject.has(string) ? class_0463.lllIlIIlIIIlIlIIIllIlllIl(jsonObject.get(string), string) : bl;
    }

    public static float IlIllllllIIlIIllllIIlIIIl(JsonElement jsonElement, String string) {
        if (jsonElement.isJsonPrimitive() && jsonElement.getAsJsonPrimitive().isNumber()) {
            return jsonElement.getAsFloat();
        }
        throw new JsonSyntaxException("Expected " + string + " to be a Float, was " + class_0463.lllIlIIlIIIlIlIIIllIlllIl(jsonElement));
    }

    public static float IIIllIIlIIIIIIlIlIIllIIlI(JsonObject jsonObject, String string) {
        if (jsonObject.has(string)) {
            return class_0463.IlIllllllIIlIIllllIIlIIIl(jsonObject.get(string), string);
        }
        throw new JsonSyntaxException("Missing " + string + ", expected to find a Float");
    }

    public static float lllIIIllIIIIlllIlIIllIIll(JsonObject jsonObject, String string, float f) {
        return jsonObject.has(string) ? class_0463.IlIllllllIIlIIllllIIlIIIl(jsonObject.get(string), string) : f;
    }

    public static int lIlllIlllIIIIlIIlllIllIII(JsonElement jsonElement, String string) {
        if (jsonElement.isJsonPrimitive() && jsonElement.getAsJsonPrimitive().isNumber()) {
            return jsonElement.getAsInt();
        }
        throw new JsonSyntaxException("Expected " + string + " to be a Int, was " + class_0463.lllIlIIlIIIlIlIIIllIlllIl(jsonElement));
    }

    public static int IllIIlllllllIIlIIlIIIIlIl(JsonObject jsonObject, String string) {
        if (jsonObject.has(string)) {
            return class_0463.lIlllIlllIIIIlIIlllIllIII(jsonObject.get(string), string);
        }
        throw new JsonSyntaxException("Missing " + string + ", expected to find a Int");
    }

    public static int lllIIIllIIIIlllIlIIllIIll(JsonObject jsonObject, String string, int n) {
        return jsonObject.has(string) ? class_0463.lIlllIlllIIIIlIIlllIllIII(jsonObject.get(string), string) : n;
    }

    public static JsonObject IlIIIIIllllllIIlllIllllll(JsonElement jsonElement, String string) {
        if (jsonElement.isJsonObject()) {
            return jsonElement.getAsJsonObject();
        }
        throw new JsonSyntaxException("Expected " + string + " to be a JsonObject, was " + class_0463.lllIlIIlIIIlIlIIIllIlllIl(jsonElement));
    }

    public static JsonObject IIIllIllIIlIlIlIlIllllIIl(JsonObject jsonObject, String string) {
        if (jsonObject.has(string)) {
            return class_0463.IlIIIIIllllllIIlllIllllll(jsonObject.get(string), string);
        }
        throw new JsonSyntaxException("Missing " + string + ", expected to find a JsonObject");
    }

    public static JsonObject lllIIIllIIIIlllIlIIllIIll(JsonObject jsonObject, String string, JsonObject jsonObject2) {
        return jsonObject.has(string) ? class_0463.IlIIIIIllllllIIlllIllllll(jsonObject.get(string), string) : jsonObject2;
    }

    public static JsonArray lIllllIIlIIIlIllllllIIIll(JsonElement jsonElement, String string) {
        if (jsonElement.isJsonArray()) {
            return jsonElement.getAsJsonArray();
        }
        throw new JsonSyntaxException("Expected " + string + " to be a JsonArray, was " + class_0463.lllIlIIlIIIlIlIIIllIlllIl(jsonElement));
    }

    public static JsonArray IllIIIllIIIIlIlIlIllIIlll(JsonObject jsonObject, String string) {
        if (jsonObject.has(string)) {
            return class_0463.lIllllIIlIIIlIllllllIIIll(jsonObject.get(string), string);
        }
        throw new JsonSyntaxException("Missing " + string + ", expected to find a JsonArray");
    }

    public static JsonArray lllIIIllIIIIlllIlIIllIIll(JsonObject jsonObject, String string, JsonArray jsonArray) {
        return jsonObject.has(string) ? class_0463.lIllllIIlIIIlIllllllIIIll(jsonObject.get(string), string) : jsonArray;
    }

    public static String lllIlIIlIIIlIlIIIllIlllIl(JsonElement jsonElement) {
        String string = StringUtils.abbreviateMiddle((String)String.valueOf((Object)jsonElement), (String)"...", (int)10);
        if (jsonElement == null) {
            return "null (missing)";
        }
        if (jsonElement.isJsonNull()) {
            return "null (json)";
        }
        if (jsonElement.isJsonArray()) {
            return "an array (" + string + ")";
        }
        if (jsonElement.isJsonObject()) {
            return "an object (" + string + ")";
        }
        if (jsonElement.isJsonPrimitive()) {
            JsonPrimitive jsonPrimitive = jsonElement.getAsJsonPrimitive();
            if (jsonPrimitive.isNumber()) {
                return "a number (" + string + ")";
            }
            if (jsonPrimitive.isBoolean()) {
                return "a boolean (" + string + ")";
            }
        }
        return string;
    }
}

