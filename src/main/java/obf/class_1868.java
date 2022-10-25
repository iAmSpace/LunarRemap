package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 *  javazoom.jl.decoder.JavaLayerHook
 *  javazoom.jl.decoder.JavaLayerUtils
 *  javazoom.jl.player.AudioDevice
 *  javazoom.jl.player.Player
 */
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import javazoom.jl.decoder.JavaLayerHook;
import javazoom.jl.decoder.JavaLayerUtils;
import javazoom.jl.player.AudioDevice;
import javazoom.jl.player.Player;

public class class_1868 {
    private static final String lllIIIllIIIIlllIlIIllIIll = "https://dash-api.com/api/v3/allData.php";
    private static Player lllIlIIlIIIlIlIIIllIlllIl;
    private static boolean IlIllllllIIlIIllllIIlIIIl;
    private static class_0445 lIlllIlllIIIIlIIlllIllIII;

    public static List<class_1878> lllIIIllIIIIlllIlIIllIIll() {
        JavaLayerUtils.setHook((JavaLayerHook)new class_0037());
        ArrayList<class_1878> arrayList = new ArrayList<class_1878>();
        try {
            JsonObject jsonObject = new JsonParser().parse(class_1868.lllIIIllIIIIlllIlIIllIIll(lllIIIllIIIIlllIlIIllIIll)).getAsJsonObject();
            if (jsonObject.has("stations")) {
                JsonArray jsonArray = jsonObject.getAsJsonArray("stations");
                for (JsonElement jsonElement : jsonArray) {
                    JsonObject jsonObject2 = jsonElement.getAsJsonObject();
                    String string = jsonObject2.get("name").getAsString();
                    String string2 = jsonObject2.get("genre").getAsString();
                    String string3 = jsonObject2.get("square_logo_url").getAsString();
                    String string4 = jsonObject2.get("current_song_url").getAsString();
                    String string5 = jsonObject2.get("stream_url").getAsString();
                    class_1878 class_18782 = new class_1878(string, string3, string2, string4, string5);
                    arrayList.add(class_18782);
                }
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return arrayList;
    }

    public static String lllIIIllIIIIlllIlIIllIIll(String string) {
        try {
            URLConnection uRLConnection = new URL(string).openConnection();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(uRLConnection.getInputStream()));
            String string2 = bufferedReader.readLine();
            return string2;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    public static void lllIlIIlIIIlIlIIIllIlllIl() {
        if (lllIlIIlIIIlIlIIIllIlllIl != null) {
            lllIlIIlIIIlIlIIIllIlllIl.close();
            lllIlIIlIIIlIlIIIllIlllIl = null;
        }
        IlIllllllIIlIIllllIIlIIIl = false;
    }

    public static boolean IlIllllllIIlIIllllIIlIIIl() {
        return lllIlIIlIIIlIlIIIllIlllIl != null;
    }

    public static void lllIlIIlIIIlIlIIIllIlllIl(String string) {
        if (IlIllllllIIlIIllllIIlIIIl) {
            return;
        }
        IlIllllllIIlIIllllIIlIIIl = true;
        if (lllIlIIlIIIlIlIIIllIlllIl != null) {
            lllIlIIlIIIlIlIIIllIlllIl.close();
            lllIlIIlIIIlIlIIIllIlllIl = null;
            return;
        }
        new Thread(() -> {
            try {
                URL uRL = new URL(string);
                InputStream inputStream = uRL.openStream();
                lIlllIlllIIIIlIIlllIllIII = new class_0445();
                lllIlIIlIIIlIlIIIllIlllIl = new Player(inputStream, (AudioDevice)lIlllIlllIIIIlIIlllIllIII);
                lllIlIIlIIIlIlIIIllIlllIl.play();
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }).start();
    }

    public static class_0445 lIlllIlllIIIIlIIlllIllIII() {
        return lIlllIlllIIIIlIIlllIllIII;
    }

    static {
        lIlllIlllIIIIlIIlllIllIII = new class_0445();
    }
}

