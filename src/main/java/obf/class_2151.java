package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.moonsworth.lunar.client.LunarClient;
import net.minecraft.client.Minecraft;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_2151 {
    private static final Logger lllIIIllIIIIlllIlIIllIIll = LogManager.getLogger();
    private final Minecraft lllIlIIlIIIlIlIIIllIlllIl;
    private final List IlIllllllIIlIIllllIIlIIIl = new ArrayList();

    public class_2151(Minecraft class_06672) {
        this.lllIlIIlIIIlIlIIIllIlllIl = class_06672;
        this.lllIIIllIIIIlllIlIIllIIll();
    }

    public void lllIIIllIIIIlllIlIIllIIll() {
        try {
            this.IlIllllllIIlIIllllIIlIIIl.clear();
            class_0775 class_07752 = class_0893.lllIIIllIIIIlllIlIIllIIll(new File(this.lllIlIIlIIIlIlIIIllIlllIl.mcDataDir, "servers.dat"));
            if (class_07752 == null) {
                return;
            }
            class_2145 class_21452 = class_07752.IlIllllllIIlIIllllIIlIIIl("servers", 10);
            for (Object object : LunarClient.getInstance().getSettingsManager().lllIlIIlIIIlIlIIIllIlllIl()) {
                this.IlIllllllIIlIIllllIIlIIIl.add(new class_1092(true, object[0], object[1]));
            }
            for (int i = 0; i < class_21452.lIlllIlllIIIIlIIlllIllIII(); ++i) {
                Object object;
                object = class_1092.lllIIIllIIIIlllIlIIllIIll(class_21452.lllIlIIlIIIlIlIIIllIlllIl(i));
                this.IlIllllllIIlIIllllIIlIIIl.add(class_1092.lllIIIllIIIIlllIlIIllIIll(class_21452.lllIlIIlIIIlIlIIIllIlllIl(i)));
            }
        }
        catch (Exception exception) {
            lllIIIllIIIIlllIlIIllIIll.error("Couldn't load server list", (Throwable)exception);
        }
    }

    public void lllIlIIlIIIlIlIIIllIlllIl() {
        try {
            Object object2;
            class_2145 class_21452 = new class_2145();
            for (Object object2 : this.IlIllllllIIlIIllllIIlIIIl) {
                if (((class_1092)object2).llIIlllIllIllllIIIlIIIIII) continue;
                class_21452.lllIIIllIIIIlllIlIIllIIll(((class_1092)object2).lllIIIllIIIIlllIlIIllIIll());
            }
            object2 = new class_0775();
            ((class_0775)object2).lllIIIllIIIIlllIlIIllIIll("servers", class_21452);
            class_0893.lllIIIllIIIIlllIlIIllIIll((class_0775)object2, new File(this.lllIlIIlIIIlIlIIIllIlllIl.mcDataDir, "servers.dat"));
        }
        catch (Exception exception) {
            lllIIIllIIIIlllIlIIllIIll.error("Couldn't save server list", (Throwable)exception);
        }
    }

    public class_1092 lllIIIllIIIIlllIlIIllIIll(int n) {
        return (class_1092)this.IlIllllllIIlIIllllIIlIIIl.get(n);
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(int n) {
        try {
            this.IlIllllllIIlIIllllIIlIIIl.remove(n);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1092 class_10922) {
        this.IlIllllllIIlIIllllIIlIIIl.add(class_10922);
    }

    public int IlIllllllIIlIIllllIIlIIIl() {
        return this.IlIllllllIIlIIllllIIlIIIl.size();
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        class_1092 class_10922 = this.lllIIIllIIIIlllIlIIllIIll(n2);
        class_1092 class_10923 = this.lllIIIllIIIIlllIlIIllIIll(n);
        if (class_10922.llIIlllIllIllllIIIlIIIIII || class_10923.llIIlllIllIllllIIIlIIIIII) {
            return;
        }
        this.IlIllllllIIlIIllllIIlIIIl.set(n, class_10922);
        this.IlIllllllIIlIIllllIIlIIIl.set(n2, class_10923);
        this.lllIlIIlIIIlIlIIIllIlllIl();
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n, class_1092 class_10922) {
        this.IlIllllllIIlIIllllIIlIIIl.set(n -= LunarClient.getInstance().getSettingsManager().lllIlIIlIIIlIlIIIllIlllIl().size(), class_10922);
    }

    public static void lllIlIIlIIIlIlIIIllIlllIl(class_1092 class_10922) {
        class_2151 class_21512 = new class_2151(Minecraft.getMinecraft());
        class_21512.lllIIIllIIIIlllIlIIllIIll();
        for (int i = 0; i < class_21512.IlIllllllIIlIIllllIIlIIIl(); ++i) {
            class_1092 class_10923 = class_21512.lllIIIllIIIIlllIlIIllIIll(i);
            if (!class_10923.lllIIIllIIIIlllIlIIllIIll.equals(class_10922.lllIIIllIIIIlllIlIIllIIll) || !class_10923.lllIlIIlIIIlIlIIIllIlllIl.equals(class_10922.lllIlIIlIIIlIlIIIllIlllIl)) continue;
            class_21512.lllIIIllIIIIlllIlIIllIIll(i, class_10922);
            break;
        }
        class_21512.lllIlIIlIIIlIlIIIllIlllIl();
    }
}

