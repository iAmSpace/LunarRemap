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
import net.minecraft.client.Minecraft;
import optifine.Config;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;

public class class_0896 {
    private String lIlllIlllIIIIlIIlllIllIII = null;
    public static final String lllIIIllIIIIlllIlIIllIIll = "items";
    public static final String lllIlIIlIIIlIlIIIllIlllIl = "type";
    public static final String IlIllllllIIlIIllllIIlIIIl = "active";

    public class_0896(String string) {
        this.lIlllIlllIIIIlIIlllIllIII = string;
    }

    public class_1925 lllIIIllIIIIlllIlIIllIIll(JsonElement jsonElement) {
        if (jsonElement == null) {
            throw new JsonParseException("JSON object is null, player: " + this.lIlllIlllIIIIlIIlllIllIII);
        }
        JsonObject jsonObject = (JsonObject)jsonElement;
        class_1925 class_19252 = new class_1925();
        JsonArray jsonArray = (JsonArray)jsonObject.get(lllIIIllIIIIlllIlIIllIIll);
        if (jsonArray != null) {
            for (int i = 0; i < jsonArray.size(); ++i) {
                class_0524 class_05242;
                JsonObject jsonObject2 = (JsonObject)jsonArray.get(i);
                boolean bl = class_0279.lllIIIllIIIIlllIlIIllIIll(jsonObject2, IlIllllllIIlIIllllIIlIIIl, true);
                if (!bl) continue;
                String string = class_0279.lllIIIllIIIIlllIlIIllIIll(jsonObject2, lllIlIIlIIIlIlIIIllIlllIl);
                if (string == null) {
                    Config.lllIlIIlIIIlIlIIIllIlllIl("Item type is null, player: " + this.lIlllIlllIIIIlIIlllIllIII);
                    continue;
                }
                String string2 = class_0279.lllIIIllIIIIlllIlIIllIIll(jsonObject2, "model");
                if (string2 == null) {
                    string2 = "items/" + string + "/model.cfg";
                }
                if ((class_05242 = this.lllIlIIlIIIlIlIIIllIlllIl(string2)) == null) continue;
                if (!class_05242.lIlllIlllIIIIlIIlllIllIII()) {
                    BufferedImage bufferedImage;
                    String string3 = class_0279.lllIIIllIIIIlllIlIIllIIll(jsonObject2, "texture");
                    if (string3 == null) {
                        string3 = "items/" + string + "/users/" + this.lIlllIlllIIIIlIIlllIllIII + ".png";
                    }
                    if ((bufferedImage = this.lllIIIllIIIIlllIlIIllIIll(string3)) == null) continue;
                    class_05242.lllIIIllIIIIlllIlIIllIIll(bufferedImage);
                    ResourceLocation class_17732 = new ResourceLocation("optifine.net", string3);
                    class_05242.lllIIIllIIIIlllIlIIllIIll(class_17732);
                }
                class_19252.lllIIIllIIIIlllIlIIllIIll(class_05242);
            }
        }
        return class_19252;
    }

    private BufferedImage lllIIIllIIIIlllIlIIllIIll(String string) {
        String string2 = "http://s.optifine.net/" + string;
        try {
            byte[] arrby = class_1186.lllIlIIlIIIlIlIIIllIlllIl(string2, Minecraft.getMinecraft().lllIIIIIIlIlllIIlIlIIIllI());
            BufferedImage bufferedImage = ImageIO.read(new ByteArrayInputStream(arrby));
            return bufferedImage;
        }
        catch (IOException iOException) {
            Config.lllIlIIlIIIlIlIIIllIlllIl("Error loading item texture " + string + ": " + iOException.getClass().getName() + ": " + iOException.getMessage());
            return null;
        }
    }

    private class_0524 lllIlIIlIIIlIlIIIllIlllIl(String string) {
        String string2 = "http://s.optifine.net/" + string;
        try {
            byte[] arrby = class_1186.lllIlIIlIIIlIlIIIllIlllIl(string2, Minecraft.getMinecraft().lllIIIIIIlIlllIIlIlIIIllI());
            String string3 = new String(arrby, "ASCII");
            JsonParser jsonParser = new JsonParser();
            JsonObject jsonObject = (JsonObject)jsonParser.parse(string3);
            class_2076 class_20762 = new class_2076();
            class_0524 class_05242 = class_2076.lllIIIllIIIIlllIlIIllIIll(jsonObject);
            return class_05242;
        }
        catch (Exception exception) {
            Config.lllIlIIlIIIlIlIIIllIlllIl("Error loading item model " + string + ": " + exception.getClass().getName() + ": " + exception.getMessage());
            return null;
        }
    }
}

