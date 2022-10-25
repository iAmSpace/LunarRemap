package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonParser
 */
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

public class class_1024
extends Thread {
    private final class_0708 lllIIIllIIIIlllIlIIllIIll;
    private final DateTimeFormatter lllIlIIlIIIlIlIIIllIlllIl = DateTimeFormatter.ofPattern("MM/dd/yyyy");

    public class_1024(class_0708 class_07082) {
        this.lllIIIllIIIIlllIlIIllIIll = class_07082;
    }

    @Override
    public void run() {
        try {
            URL uRL = new URL("https://api.mojang.com/user/profiles/" + this.lllIIIllIIIIlllIlIIllIIll.IIIllIllIIlIlIlIlIllllIIl().IlIllllllIIlIIllllIIlIIIl().replaceAll("-", "") + "/names");
            URLConnection uRLConnection = uRL.openConnection();
            ArrayList<String> arrayList = new ArrayList<String>();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(uRLConnection.getInputStream()));
            String string = bufferedReader.readLine();
            JsonParser jsonParser = new JsonParser();
            JsonElement jsonElement = jsonParser.parse("{\"Names\": " + string + "}");
            for (Map.Entry entry : jsonElement.getAsJsonObject().entrySet()) {
                if (!((String)entry.getKey()).equalsIgnoreCase("Names")) continue;
                for (JsonElement jsonElement2 : ((JsonElement)entry.getValue()).getAsJsonArray()) {
                    String string2 = jsonElement2.getAsJsonObject().get("name").getAsString();
                    if (jsonElement2.getAsJsonObject().has("changedToAt")) {
                        long l = jsonElement2.getAsJsonObject().get("changedToAt").getAsLong();
                        LocalDateTime localDateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(l), ZoneId.systemDefault());
                        arrayList.add((Object)((Object) EnumChatFormatting.GRAY) + localDateTime.format(this.lllIlIIlIIIlIlIIIllIlllIl) + (Object)((Object) EnumChatFormatting.RESET) + " " + string2);
                        continue;
                    }
                    arrayList.add(string2);
                }
            }
            Collections.reverse(arrayList);
            this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(arrayList);
            this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII(), this.lllIIIllIIIIlllIlIIllIIll.IlIIIIIllllllIIlllIllllll(), this.lllIIIllIIIIlllIlIIllIIll.lIllllIIlIIIlIllllllIIIll(), this.lllIIIllIIIIlllIlIIllIIll.IIIllIIlIIIIIIlIlIIllIIlI() + (float)(this.lllIIIllIIIIlllIlIIllIIll.IllIIIllIIIIlIlIlIllIIlll().size() * 10) - 10.0f);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}

