package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.client.ClientBrandRetriever;
import optifine.Config;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class class_1213
extends Thread {
    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        HttpURLConnection httpURLConnection = null;
        try {
            Config.lllIIIllIIIIlllIlIIllIIll("Checking for new version");
            URL uRL = new URL("http://optifine.net/version/1.7.10/HD_U.txt");
            httpURLConnection = (HttpURLConnection)uRL.openConnection();
            if (Config.getGameSettings().llIIIlIIllIIllIllIIlIlllI) {
                httpURLConnection.setRequestProperty("OF-MC-Version", "1.7.10");
                httpURLConnection.setRequestProperty("OF-MC-Brand", "" + ClientBrandRetriever.getClientModName());
                httpURLConnection.setRequestProperty("OF-Edition", "HD_U");
                httpURLConnection.setRequestProperty("OF-Release", "D6");
                httpURLConnection.setRequestProperty("OF-Java-Version", "" + System.getProperty("java.version"));
                httpURLConnection.setRequestProperty("OF-CpuCount", "" + Config.lIIIIlIlIlIIIlIIllIIlIlIl());
                httpURLConnection.setRequestProperty("OF-OpenGL-Version", "" + Config.lIllllIIlIIIlIllllllIIIll);
                httpURLConnection.setRequestProperty("OF-OpenGL-Vendor", "" + Config.IllIIlllllllIIlIIlIIIIlIl);
            }
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(false);
            httpURLConnection.connect();
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                String string = Config.lllIlIIlIIIlIlIIIllIlllIl(inputStream);
                inputStream.close();
                String[] arrstring = Config.lllIIIllIIIIlllIlIIllIIll(string, "\n\r");
                if (arrstring.length < 1) {
                    return;
                }
                String string2 = arrstring[0].trim();
                Config.lllIIIllIIIIlllIlIIllIIll("Version found: " + string2);
                if (Config.lllIlIIlIIIlIlIIIllIlllIl(string2, "D6") > 0) {
                    Config.lIllllIIlIIIlIllllllIIIll(string2);
                    return;
                }
            }
            finally {
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
            }
        }
        catch (Exception exception) {
            Config.lllIIIllIIIIlllIlIIllIIll(exception.getClass().getName() + ": " + exception.getMessage());
        }
    }
}

