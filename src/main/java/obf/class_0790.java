package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.ServerSocket;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_0790 {
    private static final AtomicInteger lllIIIllIIIIlllIlIIllIIll = new AtomicInteger(0);
    private static final Logger lllIlIIlIIIlIlIIIllIlllIl = LogManager.getLogger();

    public static String lllIIIllIIIIlllIlIIllIIll(Map map) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append('&');
            }
            try {
                stringBuilder.append(URLEncoder.encode((String)entry.getKey(), "UTF-8"));
            }
            catch (UnsupportedEncodingException unsupportedEncodingException) {
                unsupportedEncodingException.printStackTrace();
            }
            if (entry.getValue() == null) continue;
            stringBuilder.append('=');
            try {
                stringBuilder.append(URLEncoder.encode(entry.getValue().toString(), "UTF-8"));
            }
            catch (UnsupportedEncodingException unsupportedEncodingException) {
                unsupportedEncodingException.printStackTrace();
            }
        }
        return stringBuilder.toString();
    }

    public static String lllIIIllIIIIlllIlIIllIIll(URL uRL, Map map, boolean bl) {
        return class_0790.lllIIIllIIIIlllIlIIllIIll(uRL, class_0790.lllIIIllIIIIlllIlIIllIIll(map), bl);
    }

    private static String lllIIIllIIIIlllIlIIllIIll(URL uRL, String string, boolean bl) {
        try {
            String string2;
            Proxy proxy;
            Proxy proxy2 = proxy = class_0220.IlIIlllllIIlIlIlllllIllll() == null ? null : class_0220.IlIIlllllIIlIlIlllllIllll().IlllIIIllllIIllIllIlIIlIl();
            if (proxy == null) {
                proxy = Proxy.NO_PROXY;
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection)uRL.openConnection(proxy);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            httpURLConnection.setRequestProperty("Content-Length", "" + string.getBytes().length);
            httpURLConnection.setRequestProperty("Content-Language", "en-US");
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            dataOutputStream.writeBytes(string);
            dataOutputStream.flush();
            dataOutputStream.close();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            StringBuffer stringBuffer = new StringBuffer();
            while ((string2 = bufferedReader.readLine()) != null) {
                stringBuffer.append(string2);
                stringBuffer.append('\r');
            }
            bufferedReader.close();
            return stringBuffer.toString();
        }
        catch (Exception exception) {
            if (!bl) {
                lllIlIIlIIIlIlIIIllIlllIl.error("Could not post to " + uRL, (Throwable)exception);
            }
            return "";
        }
    }

    public static void lllIIIllIIIIlllIlIIllIIll(File file, String string, class_1978 class_19782, Map map, int n, class_1832 class_18322, Proxy proxy) {
        Thread thread = new Thread((Runnable)new class_0845(class_18322, string, proxy, map, file, class_19782, n), "File Downloader #" + lllIIIllIIIIlllIlIIllIIll.incrementAndGet());
        thread.setDaemon(true);
        thread.start();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static int lllIIIllIIIIlllIlIIllIIll() {
        int n;
        ServerSocket serverSocket = null;
        boolean bl = true;
        try {
            serverSocket = new ServerSocket(0);
            n = serverSocket.getLocalPort();
        }
        finally {
            try {
                if (serverSocket != null) {
                    serverSocket.close();
                }
            }
            catch (IOException iOException) {}
        }
        return n;
    }

    public static String lllIIIllIIIIlllIlIIllIIll(URL uRL) {
        String string;
        HttpURLConnection httpURLConnection = (HttpURLConnection)uRL.openConnection();
        httpURLConnection.setRequestMethod("GET");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
        StringBuilder stringBuilder = new StringBuilder();
        while ((string = bufferedReader.readLine()) != null) {
            stringBuilder.append(string);
            stringBuilder.append('\r');
        }
        bufferedReader.close();
        return stringBuilder.toString();
    }

    static /* synthetic */ Logger lllIlIIlIIIlIlIIIllIlllIl() {
        return lllIlIIlIIIlIlIIIllIlllIl;
    }
}

