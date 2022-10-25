package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Proxy;
import java.net.URL;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class class_1186 {
    private static Map IllIIIllIIIIlIlIlIllIIlll = new HashMap();
    public static final String lllIIIllIIIIlllIlIIllIIll = "User-Agent";
    public static final String lllIlIIlIIIlIlIIIllIlllIl = "Host";
    public static final String IlIllllllIIlIIllllIIlIIIl = "Accept";
    public static final String lIlllIlllIIIIlIIlllIllIII = "Location";
    public static final String IlIIIIIllllllIIlllIllllll = "Keep-Alive";
    public static final String lIllllIIlIIIlIllllllIIIll = "Connection";
    public static final String IIIllIIlIIIIIIlIlIIllIIlI = "keep-alive";
    public static final String IllIIlllllllIIlIIlIIIIlIl = "Transfer-Encoding";
    public static final String IIIllIllIIlIlIlIlIllllIIl = "chunked";

    public static void lllIIIllIIIIlllIlIIllIIll(String string, class_1874 class_18742) {
        class_1186.lllIIIllIIIIlllIlIIllIIll(string, class_18742, Proxy.NO_PROXY);
    }

    public static void lllIIIllIIIIlllIlIIllIIll(String string, class_1874 class_18742, Proxy proxy) {
        class_1416 class_14162 = class_1186.lllIIIllIIIIlllIlIIllIIll(string, proxy);
        class_1929 class_19292 = new class_1929(class_14162, class_18742);
        class_1186.lllIIIllIIIIlllIlIIllIIll(class_19292);
    }

    public static class_1416 lllIIIllIIIIlllIlIIllIIll(String string, Proxy proxy) {
        URL uRL = new URL(string);
        if (!uRL.getProtocol().equals("http")) {
            throw new IOException("Only protocol http is supported: " + uRL);
        }
        String string2 = uRL.getFile();
        String string3 = uRL.getHost();
        int n = uRL.getPort();
        if (n <= 0) {
            n = 80;
        }
        String string4 = "GET";
        String string5 = "HTTP/1.1";
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>();
        linkedHashMap.put(lllIIIllIIIIlllIlIIllIIll, "Java/" + System.getProperty("java.version"));
        linkedHashMap.put(lllIlIIlIIIlIlIIIllIlllIl, string3);
        linkedHashMap.put(IlIllllllIIlIIllllIIlIIIl, "text/html, image/gif, image/png");
        linkedHashMap.put(lIllllIIlIIIlIllllllIIIll, IIIllIIlIIIIIIlIlIIllIIlI);
        byte[] arrby = new byte[]{};
        class_1416 class_14162 = new class_1416(string3, n, proxy, string4, string2, string5, linkedHashMap, arrby);
        return class_14162;
    }

    public static void lllIIIllIIIIlllIlIIllIIll(class_1929 class_19292) {
        class_1416 class_14162 = class_19292.lllIIIllIIIIlllIlIIllIIll();
        class_1506 class_15062 = class_1186.lllIIIllIIIIlllIlIIllIIll(class_14162.lllIIIllIIIIlllIlIIllIIll(), class_14162.lllIlIIlIIIlIlIIIllIlllIl(), class_14162.IIIllIllIIlIlIlIlIllllIIl());
        while (!class_15062.lllIIIllIIIIlllIlIIllIIll(class_19292)) {
            class_1186.lllIIIllIIIIlllIlIIllIIll(class_14162.lllIIIllIIIIlllIlIIllIIll(), class_14162.lllIlIIlIIIlIlIIIllIlllIl(), class_14162.IIIllIllIIlIlIlIlIllllIIl(), class_15062);
            class_15062 = class_1186.lllIIIllIIIIlllIlIIllIIll(class_14162.lllIIIllIIIIlllIlIIllIIll(), class_14162.lllIlIIlIIIlIlIIIllIlllIl(), class_14162.IIIllIllIIlIlIlIlIllllIIl());
        }
    }

    private static synchronized class_1506 lllIIIllIIIIlllIlIIllIIll(String string, int n, Proxy proxy) {
        String string2 = class_1186.lllIlIIlIIIlIlIIIllIlllIl(string, n, proxy);
        class_1506 class_15062 = (class_1506)IllIIIllIIIIlIlIlIllIIlll.get(string2);
        if (class_15062 == null) {
            class_15062 = new class_1506(string, n, proxy);
            IllIIIllIIIIlIlIlIllIIlll.put(string2, class_15062);
        }
        return class_15062;
    }

    private static synchronized void lllIIIllIIIIlllIlIIllIIll(String string, int n, Proxy proxy, class_1506 class_15062) {
        String string2 = class_1186.lllIlIIlIIIlIlIIIllIlllIl(string, n, proxy);
        class_1506 class_15063 = (class_1506)IllIIIllIIIIlIlIlIllIIlll.get(string2);
        if (class_15063 == class_15062) {
            IllIIIllIIIIlIlIlIllIIlll.remove(string2);
        }
    }

    private static String lllIlIIlIIIlIlIIIllIlllIl(String string, int n, Proxy proxy) {
        String string2 = string + ":" + n + "-" + proxy;
        return string2;
    }

    public static byte[] lllIIIllIIIIlllIlIIllIIll(String string) {
        return class_1186.lllIlIIlIIIlIlIIIllIlllIl(string, Proxy.NO_PROXY);
    }

    public static byte[] lllIlIIlIIIlIlIIIllIlllIl(String string, Proxy proxy) {
        class_1416 class_14162 = class_1186.lllIIIllIIIIlllIlIIllIIll(string, proxy);
        class_0962 class_09622 = class_1186.lllIIIllIIIIlllIlIIllIIll(class_14162);
        if (class_09622.lllIIIllIIIIlllIlIIllIIll() / 100 != 2) {
            throw new IOException("HTTP response: " + class_09622.lllIIIllIIIIlllIlIIllIIll());
        }
        return class_09622.lIlllIlllIIIIlIIlllIllIII();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static class_0962 lllIIIllIIIIlllIlIIllIIll(class_1416 class_14162) {
        HashMap hashMap = new HashMap();
        String string = "Response";
        String string2 = "Exception";
        class_1962 class_19622 = new class_1962(hashMap);
        HashMap hashMap2 = hashMap;
        synchronized (hashMap2) {
            class_1929 class_19292 = new class_1929(class_14162, class_19622);
            class_1186.lllIIIllIIIIlllIlIIllIIll(class_19292);
            try {
                hashMap.wait();
            }
            catch (InterruptedException interruptedException) {
                throw new InterruptedIOException("Interrupted");
            }
            Exception exception = (Exception)hashMap.get("Exception");
            if (exception != null) {
                if (exception instanceof IOException) {
                    throw (IOException)exception;
                }
                if (exception instanceof RuntimeException) {
                    throw (RuntimeException)exception;
                }
                throw new RuntimeException(exception.getMessage(), exception);
            }
            class_0962 class_09622 = (class_0962)hashMap.get("Response");
            if (class_09622 == null) {
                throw new IOException("Response is null");
            }
            return class_09622;
        }
    }

    public static boolean lllIIIllIIIIlllIlIIllIIll() {
        class_1506 class_15062;
        Collection collection = IllIIIllIIIIlIlIlIllIIlll.values();
        Iterator iterator = collection.iterator();
        do {
            if (iterator.hasNext()) continue;
            return false;
        } while (!(class_15062 = (class_1506)iterator.next()).IIIllIIlIIIIIIlIlIIllIIlI());
        return true;
    }
}

