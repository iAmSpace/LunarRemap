package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.Hashtable;
import javax.naming.directory.Attributes;
import javax.naming.directory.InitialDirContext;

public class class_1408 {
    private final String lllIIIllIIIIlllIlIIllIIll;
    private final int lllIlIIlIIIlIlIIIllIlllIl;

    protected class_1408(String string, int n) {
        this.lllIIIllIIIIlllIlIIllIIll = string;
        this.lllIlIIlIIIlIlIIIllIlllIl = n;
    }

    public String lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public int lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public static class_1408 lllIIIllIIIIlllIlIIllIIll(String string) {
        int n;
        Object object;
        int n2;
        if (string == null) {
            return null;
        }
        String[] arrstring = string.split(":");
        if (string.startsWith("[") && (n2 = string.indexOf("]")) > 0) {
            String string2 = string.substring(1, n2);
            object = string.substring(n2 + 1).trim();
            if (object.startsWith(":") && object.length() > 0) {
                object = object.substring(1);
                arrstring = new String[]{string2, object};
            } else {
                arrstring = new String[]{string2};
            }
        }
        if (arrstring.length > 2) {
            arrstring = new String[]{string};
        }
        String string3 = arrstring[0];
        int n3 = n = arrstring.length > 1 ? class_1408.lllIIIllIIIIlllIlIIllIIll(arrstring[1], 25565) : 25565;
        if (n == 25565) {
            object = class_1408.lllIlIIlIIIlIlIIIllIlllIl(string3);
            string3 = object[0];
            n = class_1408.lllIIIllIIIIlllIlIIllIIll(object[1], 25565);
        }
        return new class_1408(string3, n);
    }

    private static String[] lllIlIIlIIIlIlIIIllIlllIl(String string) {
        try {
            String string2 = "com.sun.jndi.dns.DnsContextFactory";
            Class.forName("com.sun.jndi.dns.DnsContextFactory");
            Hashtable<String, String> hashtable = new Hashtable<String, String>();
            hashtable.put("java.naming.factory.initial", "com.sun.jndi.dns.DnsContextFactory");
            hashtable.put("java.naming.provider.url", "dns:");
            hashtable.put("com.sun.jndi.dns.timeout.retries", "1");
            InitialDirContext initialDirContext = new InitialDirContext(hashtable);
            Attributes attributes = initialDirContext.getAttributes("_minecraft._tcp." + string, new String[]{"SRV"});
            String[] arrstring = attributes.get("srv").get().toString().split(" ", 4);
            return new String[]{arrstring[3], arrstring[2]};
        }
        catch (Throwable throwable) {
            return new String[]{string, Integer.toString(25565)};
        }
    }

    private static int lllIIIllIIIIlllIlIIllIIll(String string, int n) {
        try {
            return Integer.parseInt(string.trim());
        }
        catch (Exception exception) {
            return n;
        }
    }
}

