package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.util.concurrent.atomic.AtomicInteger;

import net.minecraft.client.Minecraft;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_0019
extends class_0229 {
    private static final AtomicInteger lllIIIllIIIIlllIlIIllIIll = new AtomicInteger(0);
    private static final Logger lllIlIIlIIIlIlIIIllIlllIl = LogManager.getLogger();
    private class_0800 IlIllllllIIlIIllllIIlIIIl;
    private boolean lIlllIlllIIIIlIIlllIllIII;
    private final class_0229 IlIIIIIllllllIIlllIllllll;
    private static class_2245 lIllllIIlIIIlIllllllIIIll = new class_2245();

    public class_0019(class_0229 class_02292, Minecraft class_06672, class_1092 class_10922) {
        this.lllllIlllIIllIlIIlIIIllII = class_06672;
        this.IlIIIIIllllllIIlllIllllll = class_02292;
        class_1408 class_14082 = class_1408.lllIIIllIIIIlllIlIIllIIll(class_10922.lllIlIIlIIIlIlIIIllIlllIl);
        class_06672.lllIIIllIIIIlllIlIIllIIll((class_0564)null);
        class_06672.lllIIIllIIIIlllIlIIllIIll(class_10922);
        this.lllIIIllIIIIlllIlIIllIIll(class_14082.lllIIIllIIIIlllIlIIllIIll(), class_14082.lllIlIIlIIIlIlIIIllIlllIl());
    }

    public class_0019(class_0229 class_02292, Minecraft class_06672, String string, int n) {
        this.lllllIlllIIllIlIIlIIIllII = class_06672;
        this.IlIIIIIllllllIIlllIllllll = class_02292;
        class_06672.lllIIIllIIIIlllIlIIllIIll((class_0564)null);
        this.lllIIIllIIIIlllIlIIllIIll(string, n);
    }

    private void lllIIIllIIIIlllIlIIllIIll(String string, int n) {
        lllIlIIlIIIlIlIIIllIlllIl.info("Connecting to " + string + ", " + n);
        new class_0477(this, "Server Connector #" + lllIIIllIIIIlllIlIIllIIll.incrementAndGet(), string, n).start();
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
        if (this.IlIllllllIIlIIllllIIlIIIl != null) {
            if (this.IlIllllllIIlIIllllIIlIIIl.lIlllIlllIIIIlIIlllIllIII()) {
                this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll();
            } else if (this.IlIllllllIIlIIllllIIlIIIl.lIllllIIlIIIlIllllllIIIll() != null) {
                this.IlIllllllIIlIIllllIIlIIIl.IlIIIIIllllllIIlllIllllll().lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl.lIllllIIlIIIlIllllllIIIll());
            }
        }
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(char c, int n) {
    }

    @Override
    public void n_() {
        this.lIlIlIIlIIIIlIIIIIlllIIII.clear();
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1197(0, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 100, this.lIIlIIIIIlIlllIlIIlIlIlll / 2 + 50, class_0616.lllIIIllIIIIlllIlIIllIIll("gui.cancel", new Object[0])));
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1197 class_11972) {
        if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 0) {
            this.lIlllIlllIIIIlIIlllIllIII = true;
            if (this.IlIllllllIIlIIllllIIlIIIl != null) {
                this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(new class_0722("Aborted"));
            }
            this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(this.IlIIIIIllllllIIlllIllllll);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
        this.llIIlIllIllllIlIIIIlIIlll();
        if (this.IlIllllllIIlIIllllIIlIIIl == null) {
            this.lllIIIllIIIIlllIlIIllIIll(this.lIlIllIIlIIlIIlIIlIIlIIll, class_0616.lllIIIllIIIIlllIlIIllIIll("connect.connecting", new Object[0]), this.IlIlIIlllIIlIllIIIlllllIl / 2, this.lIIlIIIIIlIlllIlIIlIlIlll / 2 - 50, 0xFFFFFF);
        } else {
            this.lllIIIllIIIIlllIlIIllIIll(this.lIlIllIIlIIlIIlIIlIIlIIll, class_0616.lllIIIllIIIIlllIlIIllIIll("connect.authorizing", new Object[0]), this.IlIlIIlllIIlIllIIIlllllIl / 2, this.lIIlIIIIIlIlllIlIIlIlIlll / 2 - 50, 0xFFFFFF);
        }
        super.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
    }

    static /* synthetic */ boolean lllIIIllIIIIlllIlIIllIIll(class_0019 class_00192) {
        return class_00192.lIlllIlllIIIIlIIlllIllIII;
    }

    static /* synthetic */ class_2245 lIllllIIlIIIlIllllllIIIll() {
        return lIllllIIlIIIlIllllllIIIll;
    }

    static /* synthetic */ class_0800 lllIIIllIIIIlllIlIIllIIll(class_0019 class_00192, class_0800 class_08002) {
        class_00192.IlIllllllIIlIIllllIIlIIIl = class_08002;
        return class_00192.IlIllllllIIlIIllllIIlIIIl;
    }

    static /* synthetic */ class_0800 lllIlIIlIIIlIlIIIllIlllIl(class_0019 class_00192) {
        return class_00192.IlIllllllIIlIIllllIIlIIIl;
    }

    static /* synthetic */ Minecraft IlIllllllIIlIIllllIIlIIIl(class_0019 class_00192) {
        return class_00192.lllllIlllIIllIlIIlIIIllII;
    }

    static /* synthetic */ class_0229 lIlllIlllIIIIlIIlllIllIII(class_0019 class_00192) {
        return class_00192.IlIIIIIllllllIIlllIllllll;
    }

    static /* synthetic */ Minecraft IlIIIIIllllllIIlllIllllll(class_0019 class_00192) {
        return class_00192.lllllIlllIIllIlIIlIIIllII;
    }

    static /* synthetic */ Logger IIIllIIlIIIIIIlIlIIllIIlI() {
        return lllIlIIlIIIlIlIIIllIlllIl;
    }

    static /* synthetic */ Minecraft lIllllIIlIIIlIllllllIIIll(class_0019 class_00192) {
        return class_00192.lllllIlllIIllIlIIlIIIllII;
    }

    static /* synthetic */ Minecraft IIIllIIlIIIIIIlIlIIllIIlI(class_0019 class_00192) {
        return class_00192.lllllIlllIIllIlIIlIIIllII;
    }
}

