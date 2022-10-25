package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.io.File;
import java.io.IOException;

import net.minecraft.client.Minecraft;
import net.minecraft.crash.CrashReport;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class IntegratedServer
extends class_0220 {
    private static final Logger IIIllIllIIlIlIlIlIllllIIl = LogManager.getLogger();
    private final Minecraft IllIIIllIIIIlIlIlIllIIlll;
    private final class_1078 lIIIIlIlIIlllllIIllIIlIII;
    private boolean llIIlllIllIllllIIIlIIIIII;
    private boolean llIIllIllIlIIlIIllIllllll;
    private class_0014 lllIIlIIIllllllIIIIlIlIlI;

    public IntegratedServer(Minecraft class_06672, String string, String string2, class_1078 class_10782) {
        super(new File(class_06672.mcDataDir, "saves"), class_06672.lllIIIIIIlIlllIIlIlIIIllI());
        this.IlIIIIIllllllIIlllIllllll(class_06672.getSession().getUsername());
        this.lIllllIIlIIIlIllllllIIIll(string);
        this.IIIllIIlIIIIIIlIlIIllIIlI(string2);
        this.lllIlIIlIIIlIlIIIllIlllIl(class_06672.lIlIllIIlIIlIIlIIlIIlIIll());
        this.IlIllllllIIlIIllllIIlIIIl(class_10782.IlIllllllIIlIIllllIIlIIIl());
        this.lllIlIIlIIIlIlIIIllIlllIl(256);
        this.lllIIIllIIIIlllIlIIllIIll(new class_2267(this));
        this.IllIIIllIIIIlIlIlIllIIlll = class_06672;
        this.lIIIIlIlIIlllllIIllIIlIII = class_10782;
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(String string, String string2, long l, class_1074 class_10742, String string3) {
        this.lllIIIllIIIIlllIlIIllIIll(string);
        class_0028 class_00282 = this.llIlllIIllIlllIlIlIlIIIll().lllIIIllIIIIlllIlIIllIIll(string, true);
        this.IlIllllllIIlIIllllIIlIIIl = new class_0976[3];
        this.IllIIlllllllIIlIIlIIIIlIl = new long[this.IlIllllllIIlIIllllIIlIIIl.length][100];
        for (int i = 0; i < this.IlIllllllIIlIIllllIIlIIIl.length; ++i) {
            int n = 0;
            if (i == 1) {
                n = -1;
            }
            if (i == 2) {
                n = 1;
            }
            this.IlIllllllIIlIIllllIIlIIIl[i] = i == 0 ? (this.lIlIIllllIlIIIIllIIIIlIIl() ? new class_0595(this, class_00282, string2, n, this.lllIlIIlIIIlIlIIIllIlllIl) : new class_2203(this, class_00282, string2, n, this.lIIIIlIlIIlllllIIllIIlIII, this.lllIlIIlIIIlIlIIIllIlllIl)) : new class_1678(this, class_00282, string2, n, this.lIIIIlIlIIlllllIIllIIlIII, this.IlIllllllIIlIIllllIIlIIIl[0], this.lllIlIIlIIIlIlIIIllIlllIl);
            this.IlIllllllIIlIIllllIIlIIIl[i].lllIIIllIIIIlllIlIIllIIll(new class_2175(this, this.IlIllllllIIlIIllllIIlIIIl[i]));
            this.lIIIllIIIIIllllIlIlIllIll().lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl);
        }
        this.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll());
        this.IlIllllllIIlIIllllIIlIIIl();
    }

    @Override
    protected boolean lllIIIllIIIIlllIlIIllIIll() {
        IIIllIllIIlIlIlIlIllllIIl.info("Starting integrated minecraft server version 1.7.10");
        this.lIlllIlllIIIIlIIlllIllIII(true);
        this.IlIIIIIllllllIIlllIllllll(true);
        this.lIllllIIlIIIlIllllllIIIll(true);
        this.IIIllIIlIIIIIIlIlIIllIIlI(true);
        this.IllIIlllllllIIlIIlIIIIlIl(true);
        IIIllIllIIlIlIlIlIllllIIl.info("Generating keypair");
        this.lllIIIllIIIIlllIlIIllIIll(CryptManager.lllIlIIlIIIlIlIIIllIlllIl());
        this.lllIIIllIIIIlllIlIIllIIll(this.IIIIlIllIlIIlIIlIllIlIlll(), this.IlIlIIlllIllllllllIIIlIlI(), this.lIIIIlIlIIlllllIIllIIlIII.lIlllIlllIIIIlIIlllIllIII(), this.lIIIIlIlIIlllllIIllIIlIII.IllIIlllllllIIlIIlIIIIlIl(), this.lIIIIlIlIIlllllIIllIIlIII.IllIIIllIIIIlIlIlIllIIlll());
        this.IllIIlllllllIIlIIlIIIIlIl(this.IIIIIIIIlIllIIllIIlllIllI() + " - " + this.IlIllllllIIlIIllllIIlIIIl[0].lIlllIlllIlIIIIlllIlIlIIl().lIIIIlIlIIlllllIIllIIlIII());
        return true;
    }

    @Override
    public void lllllIlllIIllIlIIlIIIllII() {
        boolean bl = this.llIIlllIllIllllIIIlIIIIII;
        boolean bl2 = this.llIIlllIllIllllIIIlIIIIII = Minecraft.getMinecraft().llIIlIllIllllIlIIIIlIIlll() != null && Minecraft.getMinecraft().llIlIIlllIIIIIllIIlIlIIII();
        if (!bl && this.llIIlllIllIllllIIIlIIIIII) {
            IIIllIllIIlIlIlIlIllllIIl.info("Saving and pausing game...");
            this.lIIIllIIIIIllllIlIlIllIll().IllIIIllIIIIlIlIlIllIIlll();
            this.lllIIIllIIIIlllIlIIllIIll(false);
        }
        if (!this.llIIlllIllIllllIIIlIIIIII) {
            super.lllllIlllIIllIlIIlIIIllII();
            if (this.IllIIIllIIIIlIlIlIllIIlll.gameSettings.IlIllllllIIlIIllllIIlIIIl != this.lIIIllIIIIIllllIlIlIllIll().lIIlIIIIIlIlllIlIIlIlIlll()) {
                IIIllIllIIlIlIlIlIllllIIl.info("Changing view distance to {}, from {}", new Object[]{this.IllIIIllIIIIlIlIlIllIIlll.gameSettings.IlIllllllIIlIIllllIIlIIIl, this.lIIIllIIIIIllllIlIlIllIll().lIIlIIIIIlIlllIlIIlIlIlll()});
                this.lIIIllIIIIIllllIlIlIllIll().lllIIIllIIIIlllIlIIllIIll(this.IllIIIllIIIIlIlIlIllIIlll.gameSettings.IlIllllllIIlIIllllIIlIIIl);
            }
        }
    }

    @Override
    public boolean lIlllIlllIIIIlIIlllIllIII() {
        return false;
    }

    @Override
    public class_2243 IlIIIIIllllllIIlllIllllll() {
        return this.lIIIIlIlIIlllllIIllIIlIII.IlIIIIIllllllIIlllIllllll();
    }

    @Override
    public class_1999 lIllllIIlIIIlIllllllIIIll() {
        return this.IllIIIllIIIIlIlIlIllIIlll.gameSettings.IIlIlIIIIlIlllIIlIIlIIIII;
    }

    @Override
    public boolean IIIllIIlIIIIIIlIlIIllIIlI() {
        return this.lIIIIlIlIIlllllIIllIIlIII.lIllllIIlIIIlIllllllIIIll();
    }

    @Override
    public boolean IIIllIllIIlIlIlIlIllllIIl() {
        return false;
    }

    @Override
    protected File IlIlllIIIIIIlIIllIIllIlll() {
        return this.IllIIIllIIIIlIlIlIllIIlll.mcDataDir;
    }

    @Override
    public boolean llIIlIIllIIllIlIIllIIllII() {
        return false;
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(CrashReport class_02232) {
        this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(class_02232);
    }

    @Override
    public CrashReport lllIlIIlIIIlIlIIIllIlllIl(CrashReport class_02232) {
        class_02232 = super.lllIlIIlIIIlIlIIIllIlllIl(class_02232);
        class_02232.getCategory().addCrashSectionCallable("Type", new class_2080(this));
        class_02232.getCategory().addCrashSectionCallable("Is Modded", new class_0707(this));
        return class_02232;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1296 class_12962) {
        super.lllIIIllIIIIlllIlIIllIIll(class_12962);
        class_12962.func_152768_a("snooper_partner", this.IllIIIllIIIIlIlIlIllIIlll.IIllIllIIllIIlllIIIlIlllI().lIllllIIlIIIlIllllllIIIll());
    }

    @Override
    public boolean IIlIIlIlIlIllIIlIlIIIIlll() {
        return Minecraft.getMinecraft().IIlIIlIlIlIllIIlIlIIIIlll();
    }

    @Override
    public String lllIIIllIIIIlllIlIIllIIll(class_2243 class_22432, boolean bl) {
        try {
            int n = -1;
            try {
                n = HttpUtil.lllIIIllIIIIlllIlIIllIIll();
            }
            catch (IOException iOException) {
                // empty catch block
            }
            if (n <= 0) {
                n = 25564;
            }
            this.lIIIlIIIlIlllIllIIIlIIIlI().lllIIIllIIIIlllIlIIllIIll(null, n);
            IIIllIllIIlIlIlIlIllllIIl.info("Started on " + n);
            this.llIIllIllIlIIlIIllIllllll = true;
            this.lllIIlIIIllllllIIIIlIlIlI = new class_0014(this.IllIIIlllllIlIlllIlllllII(), n + "");
            this.lllIIlIIIllllllIIIIlIlIlI.start();
            this.lIIIllIIIIIllllIlIlIllIll().lllIIIllIIIIlllIlIIllIIll(class_22432);
            this.lIIIllIIIIIllllIlIlIllIll().IlIllllllIIlIIllllIIlIIIl(bl);
            return n + "";
        }
        catch (IOException iOException) {
            return null;
        }
    }

    @Override
    public void stopServer() {
        super.stopServer();
        if (this.lllIIlIIIllllllIIIIlIlIlI != null) {
            this.lllIIlIIIllllllIIIIlIlIlI.interrupt();
            this.lllIIlIIIllllllIIIIlIlIlI = null;
        }
    }

    @Override
    public void llIIllIllIlIIlIIllIllllll() {
        super.llIIllIllIlIIlIIllIllllll();
        if (this.lllIIlIIIllllllIIIIlIlIlI != null) {
            this.lllIIlIIIllllllIIIIlIlIlI.interrupt();
            this.lllIIlIIIllllllIIIIlIlIlI = null;
        }
    }

    public boolean lIIlIIlIllIlIIlIlIIlIlIlI() {
        return this.llIIllIllIlIIlIIllIllllll;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_2243 class_22432) {
        this.lIIIllIIIIIllllIlIlIllIll().lllIIIllIIIIlllIlIIllIIll(class_22432);
    }

    @Override
    public boolean llIlIIlllIIIIIllIIlIlIIII() {
        return true;
    }

    @Override
    public int IllIIlllllllIIlIIlIIIIlIl() {
        return 4;
    }
}

