package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.client.Minecraft;
import optifine.Config;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

public class class_0482 {
    public static final String lllIIIllIIIIlllIlIIllIIll = "http://s.optifine.net";
    public static final String lllIlIIlIIIlIlIIIllIlllIl = "http://optifine.net";

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static byte[] lllIIIllIIIIlllIlIIllIIll(String string) {
        HttpURLConnection httpURLConnection = null;
        try {
            byte[] arrby;
            int n;
            URL uRL = new URL(string);
            httpURLConnection = (HttpURLConnection)uRL.openConnection(Minecraft.getMinecraft().lllIIIIIIlIlllIIlIlIIIllI());
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(false);
            httpURLConnection.connect();
            if (httpURLConnection.getResponseCode() / 100 != 2) {
                if (httpURLConnection.getErrorStream() != null) {
                    Config.IlIllllllIIlIIllllIIlIIIl(httpURLConnection.getErrorStream());
                }
                throw new IOException("HTTP response: " + httpURLConnection.getResponseCode());
            }
            InputStream inputStream = httpURLConnection.getInputStream();
            byte[] arrby2 = new byte[httpURLConnection.getContentLength()];
            int n2 = 0;
            do {
                if ((n = inputStream.read(arrby2, n2, arrby2.length - n2)) >= 0) continue;
                throw new IOException("Input stream closed: " + string);
            } while ((n2 += n) < arrby2.length);
            byte[] arrby3 = arrby = arrby2;
            return arrby3;
        }
        finally {
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static String lllIIIllIIIIlllIlIIllIIll(String string, Map map, byte[] arrby) {
        HttpURLConnection httpURLConnection = null;
        try {
            String string2;
            String string3;
            Object object;
            Object object2;
            Object object3;
            Object object4;
            URL uRL = new URL(string);
            httpURLConnection = (HttpURLConnection)uRL.openConnection();
            httpURLConnection.setRequestMethod("POST");
            if (map != null) {
                object4 = map.keySet();
                object3 = object4.iterator();
                while (object3.hasNext()) {
                    object2 = (String)object3.next();
                    object = "" + map.get(object2);
                    httpURLConnection.setRequestProperty((String)object2, (String)object);
                }
            }
            httpURLConnection.setRequestProperty("User-Agent", "Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10.4; en-US; rv:1.9.2.2) Gecko/20100316 Firefox/3.6.2");
            httpURLConnection.setRequestProperty("Content-Type", "text/plain");
            httpURLConnection.setRequestProperty("Content-Length", "" + arrby.length);
            httpURLConnection.setRequestProperty("Content-Language", "en-US");
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            object4 = httpURLConnection.getOutputStream();
            ((OutputStream)object4).write(arrby);
            ((OutputStream)object4).flush();
            ((OutputStream)object4).close();
            object3 = httpURLConnection.getInputStream();
            object2 = new InputStreamReader((InputStream)object3, "ASCII");
            object = new BufferedReader((Reader)object2);
            StringBuffer stringBuffer = new StringBuffer();
            while ((string3 = ((BufferedReader)object).readLine()) != null) {
                stringBuffer.append(string3);
                stringBuffer.append('\r');
            }
            ((BufferedReader)object).close();
            String string4 = string2 = stringBuffer.toString();
            return string4;
        }
        finally {
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
        }
    }
}

