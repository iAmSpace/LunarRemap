package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;

public class class_1296 {
    private final Map lllIIIllIIIIlllIlIIllIIll = Maps.newHashMap();
    private final Map lllIlIIlIIIlIlIIIllIlllIl = Maps.newHashMap();
    private final String IlIllllllIIlIIllllIIlIIIl = UUID.randomUUID().toString();
    private final URL lIlllIlllIIIIlIIlllIllIII;
    private final class_0721 IlIIIIIllllllIIlllIllllll;
    private final Timer lIllllIIlIIIlIllllllIIIll = new Timer("Snooper Timer", true);
    private final Object IIIllIIlIIIIIIlIlIIllIIlI = new Object();
    private final long IllIIlllllllIIlIIlIIIIlIl;
    private boolean IIIllIllIIlIlIlIlIllllIIl;
    private int IllIIIllIIIIlIlIlIllIIlll;

    public class_1296(String string, class_0721 class_07212, long l) {
        try {
            this.lIlllIlllIIIIlIIlllIllIII = new URL("http://snoop.minecraft.net/" + string + "?version=" + 2);
        }
        catch (MalformedURLException malformedURLException) {
            throw new IllegalArgumentException();
        }
        this.IlIIIIIllllllIIlllIllllll = class_07212;
        this.IllIIlllllllIIlIIlIIIIlIl = l;
    }

    public void lllIIIllIIIIlllIlIIllIIll() {
        if (!this.IIIllIllIIlIlIlIlIllllIIl) {
            this.IIIllIllIIlIlIlIlIllllIIl = true;
            this.IllIIlllllllIIlIIlIIIIlIl();
            this.lIllllIIlIIIlIllllllIIIll.schedule((TimerTask)new class_1885(this), 0L, 900000L);
        }
    }

    private void IllIIlllllllIIlIIlIIIIlIl() {
        this.IIIllIllIIlIlIlIlIllllIIl();
        this.func_152768_a("snooper_token", this.IlIllllllIIlIIllllIIlIIIl);
        this.lllIlIIlIIIlIlIIIllIlllIl("snooper_token", this.IlIllllllIIlIIllllIIlIIIl);
        this.lllIlIIlIIIlIlIIIllIlllIl("os_name", System.getProperty("os.name"));
        this.lllIlIIlIIIlIlIIIllIlllIl("os_version", System.getProperty("os.version"));
        this.lllIlIIlIIIlIlIIIllIlllIl("os_architecture", System.getProperty("os.arch"));
        this.lllIlIIlIIIlIlIIIllIlllIl("java_version", System.getProperty("java.version"));
        this.lllIlIIlIIIlIlIIIllIlllIl("version", "1.7.10");
        this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl(this);
    }

    private void IIIllIllIIlIlIlIlIllllIIl() {
        RuntimeMXBean runtimeMXBean = ManagementFactory.getRuntimeMXBean();
        List<String> list = runtimeMXBean.getInputArguments();
        int n = 0;
        for (String string : list) {
            if (!string.startsWith("-X")) continue;
            this.func_152768_a("jvm_arg[" + n++ + "]", string);
        }
        this.func_152768_a("jvm_args", n);
    }

    public void lllIlIIlIIIlIlIIIllIlllIl() {
        this.lllIlIIlIIIlIlIIIllIlllIl("memory_total", Runtime.getRuntime().totalMemory());
        this.lllIlIIlIIIlIlIIIllIlllIl("memory_max", Runtime.getRuntime().maxMemory());
        this.lllIlIIlIIIlIlIIIllIlllIl("memory_free", Runtime.getRuntime().freeMemory());
        this.lllIlIIlIIIlIlIIIllIlllIl("cpu_cores", Runtime.getRuntime().availableProcessors());
        this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(this);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void func_152768_a(String string, Object object) {
        Object object2 = this.IIIllIIlIIIIIIlIlIIllIIlI;
        Object object3 = this.IIIllIIlIIIIIIlIlIIllIIlI;
        synchronized (object3) {
            this.lllIlIIlIIIlIlIIIllIlllIl.put(string, object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void lllIlIIlIIIlIlIIIllIlllIl(String string, Object object) {
        Object object2 = this.IIIllIIlIIIIIIlIlIIllIIlI;
        Object object3 = this.IIIllIIlIIIIIIlIlIIllIIlI;
        synchronized (object3) {
            this.lllIIIllIIIIlllIlIIllIIll.put(string, object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Map IlIllllllIIlIIllllIIlIIIl() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object object = this.IIIllIIlIIIIIIlIlIIllIIlI;
        Object object2 = this.IIIllIIlIIIIIIlIlIIllIIlI;
        synchronized (object2) {
            this.lllIlIIlIIIlIlIIIllIlllIl();
            for (Map.Entry entry : this.lllIIIllIIIIlllIlIIllIIll.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue().toString());
            }
            for (Map.Entry entry : this.lllIlIIlIIIlIlIIIllIlllIl.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue().toString());
            }
            return linkedHashMap;
        }
    }

    public boolean lIlllIlllIIIIlIIlllIllIII() {
        return this.IIIllIllIIlIlIlIlIllllIIl;
    }

    public void IlIIIIIllllllIIlllIllllll() {
        this.lIllllIIlIIIlIllllllIIIll.cancel();
    }

    public String lIllllIIlIIIlIllllllIIIll() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public long IIIllIIlIIIIIIlIlIIllIIlI() {
        return this.IllIIlllllllIIlIIlIIIIlIl;
    }

    static int lllIIIllIIIIlllIlIIllIIll(class_1296 class_12962) {
        return class_12962.IllIIIllIIIIlIlIlIllIIlll++;
    }

    static /* synthetic */ class_0721 lllIlIIlIIIlIlIIIllIlllIl(class_1296 class_12962) {
        return class_12962.IlIIIIIllllllIIlllIllllll;
    }

    static /* synthetic */ Object IlIllllllIIlIIllllIIlIIIl(class_1296 class_12962) {
        return class_12962.IIIllIIlIIIIIIlIlIIllIIlI;
    }

    static /* synthetic */ Map lIlllIlllIIIIlIIlllIllIII(class_1296 class_12962) {
        return class_12962.lllIlIIlIIIlIlIIIllIlllIl;
    }

    static /* synthetic */ int IlIIIIIllllllIIlllIllllll(class_1296 class_12962) {
        return class_12962.IllIIIllIIIIlIlIlIllIIlll;
    }

    static /* synthetic */ Map lIllllIIlIIIlIllllllIIIll(class_1296 class_12962) {
        return class_12962.lllIIIllIIIIlllIlIIllIIll;
    }

    static /* synthetic */ String IIIllIIlIIIIIIlIlIIllIIlI(class_1296 class_12962) {
        return class_12962.IlIllllllIIlIIllllIIlIIIl;
    }

    static /* synthetic */ URL IllIIlllllllIIlIIlIIIIlIl(class_1296 class_12962) {
        return class_12962.lIlllIlllIIIIlIIlllIllIII;
    }
}

