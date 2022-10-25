package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class class_1266 {
    private static final Map lllIIIllIIIIlllIlIIllIIll = new HashMap();

    public static synchronized class_1938 lllIIIllIIIIlllIlIIllIIll(File file, int n, int n2) {
        File file2 = new File(file, "region");
        File file3 = new File(file2, "r." + (n >> 5) + "." + (n2 >> 5) + ".mca");
        class_1938 class_19382 = (class_1938)lllIIIllIIIIlllIlIIllIIll.get(file3);
        if (class_19382 != null) {
            return class_19382;
        }
        if (!file2.exists()) {
            file2.mkdirs();
        }
        if (lllIIIllIIIIlllIlIIllIIll.size() >= 256) {
            class_1266.lllIIIllIIIIlllIlIIllIIll();
        }
        class_1938 class_19383 = new class_1938(file3);
        lllIIIllIIIIlllIlIIllIIll.put(file3, class_19383);
        return class_19383;
    }

    public static synchronized void lllIIIllIIIIlllIlIIllIIll() {
        for (class_1938 class_19382 : lllIIIllIIIIlllIlIIllIIll.values()) {
            try {
                if (class_19382 == null) continue;
                class_19382.lllIIIllIIIIlllIlIIllIIll();
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
        lllIIIllIIIIlllIlIIllIIll.clear();
    }

    public static DataInputStream lllIlIIlIIIlIlIIIllIlllIl(File file, int n, int n2) {
        class_1938 class_19382 = class_1266.lllIIIllIIIIlllIlIIllIIll(file, n, n2);
        return class_19382.lllIIIllIIIIlllIlIIllIIll(n & 0x1F, n2 & 0x1F);
    }

    public static DataOutputStream IlIllllllIIlIIllllIIlIIIl(File file, int n, int n2) {
        class_1938 class_19382 = class_1266.lllIIIllIIIIlllIlIIllIIll(file, n, n2);
        return class_19382.lllIlIIlIIIlIlIIIllIlllIl(n & 0x1F, n2 & 0x1F);
    }
}

