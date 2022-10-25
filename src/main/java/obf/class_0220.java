package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.GameProfileRepository
 *  com.mojang.authlib.minecraft.MinecraftSessionService
 *  com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.ByteBufOutputStream
 *  io.netty.buffer.Unpooled
 *  io.netty.handler.codec.base64.Base64
 *  org.apache.commons.lang3.Validate
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.base.Charsets;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufOutputStream;
import io.netty.buffer.Unpooled;
import io.netty.handler.codec.base64.Base64;
import java.awt.GraphicsEnvironment;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.OutputStream;
import java.net.Proxy;
import java.security.KeyPair;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import javax.imageio.ImageIO;

import net.minecraft.crash.CrashReport;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.MathHelper;
import net.minecraft.profiler.Profiler;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class class_0220
implements class_1969,
Runnable,
class_0721 {
    private static final Logger IIIllIllIIlIlIlIlIllllIIl = LogManager.getLogger();
    public static final File lllIIIllIIIIlllIlIIllIIll = new File("usercache.json");
    private static class_0220 IllIIIllIIIIlIlIlIllIIlll;
    private final class_2055 lIIIIlIlIIlllllIIllIIlIII;
    private final class_1296 llIIlllIllIllllIIIlIIIIII = new class_1296("server", this, class_0220.lllIIIlIIlIlIllIIIIIlIIll());
    private final File llIIllIllIlIIlIIllIllllll;
    private final List lllIIlIIIllllllIIIIlIlIlI = new ArrayList();
    private final class_0044 IlIlllIIIIIIlIIllIIllIlll;
    public final Profiler lllIlIIlIIIlIlIIIllIlllIl = new Profiler();
    private final class_0267 IlIlIIlIlIllIIlIlIIllIIIl;
    private final class_0111 lllllIlllIIllIlIIlIIIllII = new class_0111();
    private final Random IlIlIIlllIIlIllIIIlllllIl = new Random();
    private int lIIlIIIIIlIlllIlIIlIlIlll = -1;
    public class_0976[] IlIllllllIIlIIllllIIlIIIl;
    private class_2116 lIlIlIIlIIIIlIIIIIlllIIII;
    private boolean IlIIIlIIIIllIIIllIIIIIIll = true;
    private boolean IIlllIlIlllIllIIIlllIIlIl;
    private int lIlIllIIlIIlIIlIIlIIlIIll;
    protected final Proxy lIlllIlllIIIIlIIlllIllIII;
    public String IlIIIIIllllllIIlllIllllll;
    public int lIllllIIlIIIlIllllllIIIll;
    private boolean llIIlIllIllllIlIIIIlIIlll;
    private boolean llIllllIlIllIIIlIllIIlIlI;
    private boolean lIlllIlllIlIIIIlllIlIlIIl;
    private boolean IlIIlllllIIlIlIlllllIllll;
    private boolean llIIlIlIlllIIllIlIlllIllI;
    private String IllIIIIllIIllIllIlllIlIIl;
    private int IIIIIIIIlIllIIllIIlllIllI;
    private int IIlIIlIlIlIllIIlIlIIIIlll = 0;
    public final long[] IIIllIIlIIIIIIlIlIIllIIlI = new long[100];
    public long[][] IllIIlllllllIIlIIlIIIIlIl;
    private KeyPair llIIIlllIlllIlIllIIIIllIl;
    private String IIIIlIllIlIIlIIlIllIlIlll;
    private String IlIlIIlllIllllllllIIIlIlI;
    private String llllIIIIlIIIlIIIIIIlIllll;
    private boolean llIIIIllIIIIIIIlIIIlIIIIl;
    private boolean IIllIllIIllIIlllIIIlIlllI;
    private boolean llllllIlIllllIlIlIlIIIIlI;
    private String lIlIIllllIlIIIIllIIIIlIIl = "";
    private boolean llIlllIIllIlllIlIlIlIIIll;
    private long IIIIlIIlIIIllIIIIllIIIlII;
    private String lllIIIIIIlIlllIIlIlIIIllI;
    private boolean llIIlIIllIIllIlIIllIIllII;
    private boolean lIlIlIIIIIIlIIllllIlIIllI;
    private final YggdrasilAuthenticationService IllllIIIIlIIlIIIIlllIIIIl;
    private final MinecraftSessionService llllIlIIIIIIIIIlllIIlIIIl;
    private long IIIIlIlIIlIIIIlIlllIlIIII = 0L;
    private final GameProfileRepository lllIIIIlIlIIlIIlllIIIIIIl;
    private final class_2119 llIlIIlllIIIIIllIIlIlIIII = new class_2119(this, lllIIIllIIIIlllIlIIllIIll);

    public class_0220(File file, Proxy proxy) {
        IllIIIllIIIIlIlIlIllIIlll = this;
        this.lIlllIlllIIIIlIIlllIllIII = proxy;
        this.llIIllIllIlIIlIIllIllllll = file;
        this.IlIlIIlIlIllIIlIlIIllIIIl = new class_0267(this);
        this.IlIlllIIIIIIlIIllIIllIlll = new class_1055();
        this.lIIIIlIlIIlllllIIllIIlIII = new class_0720(file);
        this.IllllIIIIlIIlIIIIlllIIIIl = new YggdrasilAuthenticationService(proxy, UUID.randomUUID().toString());
        this.llllIlIIIIIIIIIlllIIlIIIl = this.IllllIIIIlIIlIIIIlllIIIIl.createMinecraftSessionService();
        this.lllIIIIlIlIIlIIlllIIIIIIl = this.IllllIIIIlIIlIIIIlllIIIIl.createProfileRepository();
    }

    protected abstract boolean lllIIIllIIIIlllIlIIllIIll();

    protected void lllIIIllIIIIlllIlIIllIIll(String string) {
        if (this.llIlllIIllIlllIlIlIlIIIll().lllIlIIlIIIlIlIIIllIlllIl(string)) {
            IIIllIllIIlIlIlIlIllllIIl.info("Converting map!");
            this.lllIlIIlIIIlIlIIIllIlllIl("menu.convertingLevel");
            this.llIlllIIllIlllIlIlIlIIIll().lllIIIllIIIIlllIlIIllIIll(string, new class_0516(this));
        }
    }

    protected synchronized void lllIlIIlIIIlIlIIIllIlllIl(String string) {
        this.lllIIIIIIlIlllIIlIlIIIllI = string;
    }

    public synchronized String lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lllIIIIIIlIlllIIlIlIIIllI;
    }

    protected void lllIIIllIIIIlllIlIIllIIll(String string, String string2, long l, class_1074 class_10742, String string3) {
        class_1078 class_10782;
        this.lllIIIllIIIIlllIlIIllIIll(string);
        this.lllIlIIlIIIlIlIIIllIlllIl("menu.loadingLevel");
        this.IlIllllllIIlIIllllIIlIIIl = new class_0976[3];
        this.IllIIlllllllIIlIIlIIIIlIl = new long[this.IlIllllllIIlIIllllIIlIIIl.length][100];
        class_0028 class_00282 = this.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(string, true);
        class_0770 class_07702 = class_00282.IlIllllllIIlIIllllIIlIIIl();
        if (class_07702 == null) {
            class_10782 = new class_1078(l, this.IlIIIIIllllllIIlllIllllll(), this.lIlllIlllIIIIlIIlllIllIII(), this.IIIllIIlIIIIIIlIlIIllIIlI(), class_10742);
            class_10782.lllIIIllIIIIlllIlIIllIIll(string3);
        } else {
            class_10782 = new class_1078(class_07702);
        }
        if (this.IIllIllIIllIIlllIIIlIlllI) {
            class_10782.lllIIIllIIIIlllIlIIllIIll();
        }
        for (int i = 0; i < this.IlIllllllIIlIIllllIIlIIIl.length; ++i) {
            int n = 0;
            if (i == 1) {
                n = -1;
            }
            if (i == 2) {
                n = 1;
            }
            this.IlIllllllIIlIIllllIIlIIIl[i] = i == 0 ? (this.lIlIIllllIlIIIIllIIIIlIIl() ? new class_0595(this, class_00282, string2, n, this.lllIlIIlIIIlIlIIIllIlllIl) : new class_0976(this, class_00282, string2, n, class_10782, this.lllIlIIlIIIlIlIIIllIlllIl)) : new class_1399(this, class_00282, string2, n, class_10782, this.IlIllllllIIlIIllllIIlIIIl[0], this.lllIlIIlIIIlIlIIIllIlllIl);
            this.IlIllllllIIlIIllllIIlIIIl[i].lllIIIllIIIIlllIlIIllIIll(new class_2175(this, this.IlIllllllIIlIIllllIIlIIIl[i]));
            if (!this.llIIIlllIlllIlIllIIIIllIl()) {
                this.IlIllllllIIlIIllllIIlIIIl[i].lIlllIlllIlIIIIlllIlIlIIl().lllIIIllIIIIlllIlIIllIIll(this.IlIIIIIllllllIIlllIllllll());
            }
            this.lIlIlIIlIIIIlIIIIIlllIIII.lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl);
        }
        this.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll());
        this.IlIllllllIIlIIllllIIlIIIl();
    }

    protected void IlIllllllIIlIIllllIIlIIIl() {
        boolean bl = true;
        boolean bl2 = true;
        boolean bl3 = true;
        boolean bl4 = true;
        int n = 0;
        this.lllIlIIlIIIlIlIIIllIlllIl("menu.generatingTerrain");
        int n2 = 0;
        IIIllIllIIlIlIlIlIllllIIl.info("Preparing start region for level " + n2);
        class_0976 class_09762 = this.IlIllllllIIlIIllllIIlIIIl[n2];
        class_2208 class_22082 = class_09762.lIlIllIIlIIlIIlIIlIIlIIll();
        long l = class_0220.lllIIIlIIlIlIllIIIIIlIIll();
        for (int i = -192; i <= 192 && this.llIIlllIllIllllIIIlIIIIII(); i += 16) {
            for (int j = -192; j <= 192 && this.llIIlllIllIllllIIIlIIIIII(); j += 16) {
                long l2 = class_0220.lllIIIlIIlIlIllIIIIIlIIll();
                if (l2 - l > 1000L) {
                    this.lllIIIllIIIIlllIlIIllIIll("Preparing spawn area", n * 100 / 625);
                    l = l2;
                }
                ++n;
                class_09762.IlIlIIlllIllllllllIIIlIlI.IlIllllllIIlIIllllIIlIIIl(class_22082.lllIIIllIIIIlllIlIIllIIll + i >> 4, class_22082.IlIllllllIIlIIllllIIlIIIl + j >> 4);
            }
        }
        this.IllIIIllIIIIlIlIlIllIIlll();
    }

    public abstract boolean lIlllIlllIIIIlIIlllIllIII();

    public abstract class_2243 IlIIIIIllllllIIlllIllllll();

    public abstract class_1999 lIllllIIlIIIlIllllllIIIll();

    public abstract boolean IIIllIIlIIIIIIlIlIIllIIlI();

    public abstract int IllIIlllllllIIlIIlIIIIlIl();

    public abstract boolean IIIllIllIIlIlIlIlIllllIIl();

    protected void lllIIIllIIIIlllIlIIllIIll(String string, int n) {
        this.IlIIIIIllllllIIlllIllllll = string;
        this.lIllllIIlIIIlIllllllIIIll = n;
        IIIllIllIIlIlIlIlIllllIIl.info(string + ": " + n + "%");
    }

    protected void IllIIIllIIIIlIlIlIllIIlll() {
        this.IlIIIIIllllllIIlllIllllll = null;
        this.lIllllIIlIIIlIllllllIIIll = 0;
    }

    protected void lllIIIllIIIIlllIlIIllIIll(boolean bl) {
        if (!this.llllllIlIllllIlIlIlIIIIlI) {
            for (class_0976 class_09762 : this.IlIllllllIIlIIllllIIlIIIl) {
                if (class_09762 == null) continue;
                if (!bl) {
                    IIIllIllIIlIlIlIlIllllIIl.info("Saving chunks for level '" + class_09762.lIlllIlllIlIIIIlllIlIlIIl().lIIIIlIlIIlllllIIllIIlIII() + "'/" + class_09762.IlIlIIlllIIlIllIIIlllllIl.llIIlllIllIllllIIIlIIIIII());
                }
                try {
                    class_09762.lllIIIllIIIIlllIlIIllIIll(true, (class_1832)null);
                }
                catch (class_1038 class_10382) {
                    IIIllIllIIlIlIlIlIllllIIl.warn(class_10382.getMessage());
                }
            }
        }
    }

    public void lIIIIlIlIIlllllIIllIIlIII() {
        if (!this.llllllIlIllllIlIlIlIIIIlI) {
            IIIllIllIIlIlIlIlIllllIIl.info("Stopping server");
            if (this.lIIIlIIIlIlllIllIIIlIIIlI() != null) {
                this.lIIIlIIIlIlllIllIIIlIIIlI().lllIlIIlIIIlIlIIIllIlllIl();
            }
            if (this.lIlIlIIlIIIIlIIIIIlllIIII != null) {
                IIIllIllIIlIlIlIlIllllIIl.info("Saving players");
                this.lIlIlIIlIIIIlIIIIIlllIIII.IllIIIllIIIIlIlIlIllIIlll();
                this.lIlIlIIlIIIIlIIIIIlllIIII.lIlIlIIlIIIIlIIIIIlllIIII();
            }
            if (this.IlIllllllIIlIIllllIIlIIIl != null) {
                IIIllIllIIlIlIlIlIllllIIl.info("Saving worlds");
                this.lllIIIllIIIIlllIlIIllIIll(false);
                for (int i = 0; i < this.IlIllllllIIlIIllllIIlIIIl.length; ++i) {
                    class_0976 class_09762 = this.IlIllllllIIlIIllllIIlIIIl[i];
                    class_09762.lllIIIIIIlIlllIIlIlIIIllI();
                }
            }
            if (this.llIIlllIllIllllIIIlIIIIII.lIlllIlllIIIIlIIlllIllIII()) {
                this.llIIlllIllIllllIIIlIIIIII.IlIIIIIllllllIIlllIllllll();
            }
        }
    }

    public boolean llIIlllIllIllllIIIlIIIIII() {
        return this.IlIIIlIIIIllIIIllIIIIIIll;
    }

    public void llIIllIllIlIIlIIllIllllll() {
        this.IlIIIlIIIIllIIIllIIIIIIll = false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        try {
            if (this.lllIIIllIIIIlllIlIIllIIll()) {
                long l = class_0220.lllIIIlIIlIlIllIIIIIlIIll();
                long l2 = 0L;
                this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(new class_0722(this.IllIIIIllIIllIllIlllIlIIl));
                this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(new class_0496("1.7.10", 5));
                this.lllIIIllIIIIlllIlIIllIIll(this.lllllIlllIIllIlIIlIIIllII);
                while (this.IlIIIlIIIIllIIIllIIIIIIll) {
                    long l3 = class_0220.lllIIIlIIlIlIllIIIIIlIIll();
                    long l4 = l3 - l;
                    if (l4 > 2000L && l - this.IIIIlIIlIIIllIIIIllIIIlII >= 15000L) {
                        IIIllIllIIlIlIlIlIllllIIl.warn("Can't keep up! Did the system time change, or is the server overloaded? Running {}ms behind, skipping {} tick(s)", new Object[]{l4, l4 / 50L});
                        l4 = 2000L;
                        this.IIIIlIIlIIIllIIIIllIIIlII = l;
                    }
                    if (l4 < 0L) {
                        IIIllIllIIlIlIlIlIllllIIl.warn("Time ran backwards! Did the system time change?");
                        l4 = 0L;
                    }
                    l2 += l4;
                    l = l3;
                    if (this.IlIllllllIIlIIllllIIlIIIl[0].IIllIllIIllIIlllIIIlIlllI()) {
                        this.lllllIlllIIllIlIIlIIIllII();
                        l2 = 0L;
                    } else {
                        while (l2 > 50L) {
                            l2 -= 50L;
                            this.lllllIlllIIllIlIIlIIIllII();
                        }
                    }
                    Thread.sleep(Math.max(1L, 50L - l2));
                    this.llIlllIIllIlllIlIlIlIIIll = true;
                }
            } else {
                this.lllIIIllIIIIlllIlIIllIIll((CrashReport)null);
            }
        }
        catch (Throwable throwable) {
            IIIllIllIIlIlIlIlIllllIIl.error("Encountered an unexpected exception", throwable);
            CrashReport class_02232 = null;
            class_02232 = throwable instanceof class_0892 ? this.lllIlIIlIIIlIlIIIllIlllIl(((class_0892)throwable).lllIIIllIIIIlllIlIIllIIll()) : this.lllIlIIlIIIlIlIIIllIlllIl(new CrashReport("Exception in server tick loop", throwable));
            File file = new File(new File(this.IlIlllIIIIIIlIIllIIllIlll(), "crash-reports"), "crash-" + new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss").format(new Date()) + "-server.txt");
            if (class_02232.lllIIIllIIIIlllIlIIllIIll(file)) {
                IIIllIllIIlIlIlIlIllllIIl.error("This crash report has been saved to: " + file.getAbsolutePath());
            } else {
                IIIllIllIIlIlIlIlIllllIIl.error("We were unable to save this crash report to disk.");
            }
            this.lllIIIllIIIIlllIlIIllIIll(class_02232);
        }
        finally {
            try {
                this.lIIIIlIlIIlllllIIllIIlIII();
                this.IIlllIlIlllIllIIIlllIIlIl = true;
            }
            catch (Throwable throwable) {
                IIIllIllIIlIlIlIlIllllIIl.error("Exception stopping the server", throwable);
            }
            finally {
                this.IlIlIIlIlIllIIlIlIIllIIIl();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void lllIIIllIIIIlllIlIIllIIll(class_0111 class_01112) {
        File file = this.IlIllllllIIlIIllllIIlIIIl("server-icon.png");
        if (file.isFile()) {
            ByteBuf byteBuf = Unpooled.buffer();
            try {
                BufferedImage bufferedImage = ImageIO.read(file);
                Validate.validState((bufferedImage.getWidth() == 64 ? 1 : 0) != 0, (String)"Must be 64 pixels wide", (Object[])new Object[0]);
                Validate.validState((bufferedImage.getHeight() == 64 ? 1 : 0) != 0, (String)"Must be 64 pixels high", (Object[])new Object[0]);
                ImageIO.write((RenderedImage)bufferedImage, "PNG", (OutputStream)new ByteBufOutputStream(byteBuf));
                ByteBuf byteBuf2 = Base64.encode((ByteBuf)byteBuf);
                class_01112.lllIIIllIIIIlllIlIIllIIll("data:image/png;base64," + byteBuf2.toString(Charsets.UTF_8));
            }
            catch (Exception exception) {
                IIIllIllIIlIlIlIlIllllIIl.error("Couldn't load server icon", (Throwable)exception);
            }
            finally {
                byteBuf.release();
            }
        }
    }

    protected File IlIlllIIIIIIlIIllIIllIlll() {
        return new File(".");
    }

    protected void lllIIIllIIIIlllIlIIllIIll(CrashReport class_02232) {
    }

    protected void IlIlIIlIlIllIIlIlIIllIIIl() {
    }

    public void lllllIlllIIllIlIIlIIIllII() {
        long l = System.nanoTime();
        ++this.lIlIllIIlIIlIIlIIlIIlIIll;
        if (this.llIIlIIllIIllIlIIllIIllII) {
            this.llIIlIIllIIllIlIIllIIllII = false;
            this.lllIlIIlIIIlIlIIIllIlllIl.profilingEnabled = true;
            this.lllIlIIlIIIlIlIIIllIlllIl.clearProfiling();
        }
        this.lllIlIIlIIIlIlIIIllIlllIl.startSection("root");
        this.IlIlIIlllIIlIllIIIlllllIl();
        if (l - this.IIIIlIlIIlIIIIlIlllIlIIII >= 5000000000L) {
            this.IIIIlIlIIlIIIIlIlllIlIIII = l;
            this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(new class_0305(this.lIlIllIIlIIlIIlIIlIIlIIll(), this.IIlllIlIlllIllIIIlllIIlIl()));
            GameProfile[] arrgameProfile = new GameProfile[Math.min(this.IIlllIlIlllIllIIIlllIIlIl(), 12)];
            int n = MathHelper.lllIIIllIIIIlllIlIIllIIll(this.IlIlIIlllIIlIllIIIlllllIl, 0, this.IIlllIlIlllIllIIIlllIIlIl() - arrgameProfile.length);
            for (int i = 0; i < arrgameProfile.length; ++i) {
                arrgameProfile[i] = ((class_1822)this.lIlIlIIlIIIIlIIIIIlllIIII.IlIIIIIllllllIIlllIllllll.get(n + i)).lIIlIlllIIlIIIIlIlIIIIlll();
            }
            Collections.shuffle(Arrays.asList(arrgameProfile));
            this.lllllIlllIIllIlIIlIIIllII.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(arrgameProfile);
        }
        if (this.lIlIllIIlIIlIIlIIlIIlIIll % 900 == 0) {
            this.lllIlIIlIIIlIlIIIllIlllIl.startSection("save");
            this.lIlIlIIlIIIIlIIIIIlllIIII.IllIIIllIIIIlIlIlIllIIlll();
            this.lllIIIllIIIIlllIlIIllIIll(true);
            this.lllIlIIlIIIlIlIIIllIlllIl.endSection();
        }
        this.lllIlIIlIIIlIlIIIllIlllIl.startSection("tallying");
        this.IIIllIIlIIIIIIlIlIIllIIlI[this.lIlIllIIlIIlIIlIIlIIlIIll % 100] = System.nanoTime() - l;
        this.lllIlIIlIIIlIlIIIllIlllIl.endSection();
        this.lllIlIIlIIIlIlIIIllIlllIl.startSection("snooper");
        if (!this.llIIlllIllIllllIIIlIIIIII.lIlllIlllIIIIlIIlllIllIII() && this.lIlIllIIlIIlIIlIIlIIlIIll > 100) {
            this.llIIlllIllIllllIIIlIIIIII.lllIIIllIIIIlllIlIIllIIll();
        }
        if (this.lIlIllIIlIIlIIlIIlIIlIIll % 6000 == 0) {
            this.llIIlllIllIllllIIIlIIIIII.lllIlIIlIIIlIlIIIllIlllIl();
        }
        this.lllIlIIlIIIlIlIIIllIlllIl.endSection();
        this.lllIlIIlIIIlIlIIIllIlllIl.endSection();
    }

    public void IlIlIIlllIIlIllIIIlllllIl() {
        int n;
        this.lllIlIIlIIIlIlIIIllIlllIl.startSection("levels");
        for (n = 0; n < this.IlIllllllIIlIIllllIIlIIIl.length; ++n) {
            long l = System.nanoTime();
            if (n == 0 || this.lIIlIIIIIlIlllIlIIlIlIlll()) {
                class_0976 class_09762 = this.IlIllllllIIlIIllllIIlIIIl[n];
                this.lllIlIIlIIIlIlIIIllIlllIl.startSection(class_09762.lIlllIlllIlIIIIlllIlIlIIl().lIIIIlIlIIlllllIIllIIlIII());
                this.lllIlIIlIIIlIlIIIllIlllIl.startSection("pools");
                this.lllIlIIlIIIlIlIIIllIlllIl.endSection();
                if (this.lIlIllIIlIIlIIlIIlIIlIIll % 20 == 0) {
                    this.lllIlIIlIIIlIlIIIllIlllIl.startSection("timeSync");
                    this.lIlIlIIlIIIIlIIIIIlllIIII.lllIIIllIIIIlllIlIIllIIll(new class_1916(class_09762.IlIIIlIIIIllIIIllIIIIIIll(), class_09762.IIlllIlIlllIllIIIlllIIlIl(), class_09762.IlIIlllllIIlIlIlllllIllll().lllIlIIlIIIlIlIIIllIlllIl("doDaylightCycle")), class_09762.IlIlIIlllIIlIllIIIlllllIl.IIIllIllIIlIlIlIlIllllIIl);
                    this.lllIlIIlIIIlIlIIIllIlllIl.endSection();
                }
                this.lllIlIIlIIIlIlIIIllIlllIl.startSection("tick");
                try {
                    class_09762.lllIIIllIIIIlllIlIIllIIll();
                }
                catch (Throwable throwable) {
                    CrashReport class_02232 = CrashReport.lllIIIllIIIIlllIlIIllIIll(throwable, "Exception ticking world");
                    class_09762.addWorldInfoToCrashReport(class_02232);
                    throw new class_0892(class_02232);
                }
                try {
                    class_09762.lllIIlIIIllllllIIIIlIlIlI();
                }
                catch (Throwable throwable) {
                    CrashReport class_02233 = CrashReport.lllIIIllIIIIlllIlIIllIIll(throwable, "Exception ticking world entities");
                    class_09762.addWorldInfoToCrashReport(class_02233);
                    throw new class_0892(class_02233);
                }
                this.lllIlIIlIIIlIlIIIllIlllIl.endSection();
                this.lllIlIIlIIIlIlIIIllIlllIl.startSection("tracker");
                class_09762.lIlIlIIIIIIlIIllllIlIIllI().lllIIIllIIIIlllIlIIllIIll();
                this.lllIlIIlIIIlIlIIIllIlllIl.endSection();
                this.lllIlIIlIIIlIlIIIllIlllIl.endSection();
            }
            this.IllIIlllllllIIlIIlIIIIlIl[n][this.lIlIllIIlIIlIIlIIlIIlIIll % 100] = System.nanoTime() - l;
        }
        this.lllIlIIlIIIlIlIIIllIlllIl.endStartSection("connection");
        this.lIIIlIIIlIlllIllIIIlIIIlI().IlIllllllIIlIIllllIIlIIIl();
        this.lllIlIIlIIIlIlIIIllIlllIl.endStartSection("players");
        this.lIlIlIIlIIIIlIIIIIlllIIII.IlIIIIIllllllIIlllIllllll();
        this.lllIlIIlIIIlIlIIIllIlllIl.endStartSection("tickables");
        for (n = 0; n < this.lllIIlIIIllllllIIIIlIlIlI.size(); ++n) {
            ((class_1923)this.lllIIlIIIllllllIIIIlIlIlI.get(n)).lIIIIlIlIIlllllIIllIIlIII();
        }
        this.lllIlIIlIIIlIlIIIllIlllIl.endSection();
    }

    public boolean lIIlIIIIIlIlllIlIIlIlIlll() {
        return true;
    }

    public void lIlIlIIlIIIIlIIIIIlllIIII() {
        new class_0661(this, "Server thread").start();
    }

    public File IlIllllllIIlIIllllIIlIIIl(String string) {
        return new File(this.IlIlllIIIIIIlIIllIIllIlll(), string);
    }

    public void lIlllIlllIIIIlIIlllIllIII(String string) {
        IIIllIllIIlIlIlIlIllllIIl.warn(string);
    }

    public class_0976 lllIIIllIIIIlllIlIIllIIll(int n) {
        return n == -1 ? this.IlIllllllIIlIIllllIIlIIIl[1] : (n == 1 ? this.IlIllllllIIlIIllllIIlIIIl[2] : this.IlIllllllIIlIIllllIIlIIIl[0]);
    }

    public String IlIIIlIIIIllIIIllIIIIIIll() {
        return "1.7.10";
    }

    public int IIlllIlIlllIllIIIlllIIlIl() {
        return this.lIlIlIIlIIIIlIIIIIlllIIII.IlIlIIlIlIllIIlIlIIllIIIl();
    }

    public int lIlIllIIlIIlIIlIIlIIlIIll() {
        return this.lIlIlIIlIIIIlIIIIIlllIIII.lllllIlllIIllIlIIlIIIllII();
    }

    public String[] llIIlIllIllllIlIIIIlIIlll() {
        return this.lIlIlIIlIIIIlIIIIIlllIIII.lIllllIIlIIIlIllllllIIIll();
    }

    public GameProfile[] llIllllIlIllIIIlIllIIlIlI() {
        return this.lIlIlIIlIIIIlIIIIIlllIIII.IIIllIIlIIIIIIlIlIIllIIlI();
    }

    public String lIlllIlllIlIIIIlllIlIlIIl() {
        return "vanilla";
    }

    public CrashReport lllIlIIlIIIlIlIIIllIlllIl(CrashReport class_02232) {
        class_02232.getCategory().addCrashSectionCallable("Profiler Position", new class_1465(this));
        if (this.IlIllllllIIlIIllllIIlIIIl != null && this.IlIllllllIIlIIllllIIlIIIl.length > 0 && this.IlIllllllIIlIIllllIIlIIIl[0] != null) {
            class_02232.getCategory().addCrashSectionCallable("Vec3 Pool Size", new class_1133(this));
        }
        if (this.lIlIlIIlIIIIlIIIIIlllIIII != null) {
            class_02232.getCategory().addCrashSectionCallable("Player Count", new class_1600(this));
        }
        return class_02232;
    }

    public List lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692, String string) {
        ArrayList<String> arrayList = new ArrayList<String>();
        if (string.startsWith("/")) {
            boolean bl = !(string = string.substring(1)).contains(" ");
            List list = this.IlIlllIIIIIIlIIllIIllIlll.lllIlIIlIIIlIlIIIllIlllIl(class_19692, string);
            if (list != null) {
                for (String string2 : list) {
                    if (bl) {
                        arrayList.add("/" + string2);
                        continue;
                    }
                    arrayList.add(string2);
                }
            }
            return arrayList;
        }
        String[] arrstring = string.split(" ", -1);
        String string3 = arrstring[arrstring.length - 1];
        for (String string4 : this.lIlIlIIlIIIIlIIIIIlllIIII.lIllllIIlIIIlIllllllIIIll()) {
            if (!class_1246.lllIIIllIIIIlllIlIIllIIll(string3, string4)) continue;
            arrayList.add(string4);
        }
        return arrayList;
    }

    public static class_0220 IlIIlllllIIlIlIlllllIllll() {
        return IllIIIllIIIIlIlIlIllIIlll;
    }

    @Override
    public String llllIIIIlIIIlIIIIIIlIllll() {
        return "Server";
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(IChatComponent class_22552) {
        IIIllIllIIlIlIlIlIllllIIl.info(class_22552.IlIllllllIIlIIllllIIlIIIl());
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(int n, String string) {
        return true;
    }

    public class_0044 llIIlIlIlllIIllIlIlllIllI() {
        return this.IlIlllIIIIIIlIIllIIllIlll;
    }

    public KeyPair IllIIIIllIIllIllIlllIlIIl() {
        return this.llIIIlllIlllIlIllIIIIllIl;
    }

    public String IIIIIIIIlIllIIllIIlllIllI() {
        return this.IIIIlIllIlIIlIIlIllIlIlll;
    }

    public void IlIIIIIllllllIIlllIllllll(String string) {
        this.IIIIlIllIlIIlIIlIllIlIlll = string;
    }

    public boolean llIIIlllIlllIlIllIIIIllIl() {
        return this.IIIIlIllIlIIlIIlIllIlIlll != null;
    }

    public String IIIIlIllIlIIlIIlIllIlIlll() {
        return this.IlIlIIlllIllllllllIIIlIlI;
    }

    public void lIllllIIlIIIlIllllllIIIll(String string) {
        this.IlIlIIlllIllllllllIIIlIlI = string;
    }

    public void IIIllIIlIIIIIIlIlIIllIIlI(String string) {
        this.llllIIIIlIIIlIIIIIIlIllll = string;
    }

    public String IlIlIIlllIllllllllIIIlIlI() {
        return this.llllIIIIlIIIlIIIIIIlIllll;
    }

    public void lllIIIllIIIIlllIlIIllIIll(KeyPair keyPair) {
        this.llIIIlllIlllIlIllIIIIllIl = keyPair;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1999 class_19992) {
        for (int i = 0; i < this.IlIllllllIIlIIllllIIlIIIl.length; ++i) {
            class_0976 class_09762 = this.IlIllllllIIlIIllllIIlIIIl[i];
            if (class_09762 == null) continue;
            if (class_09762.lIlllIlllIlIIIIlllIlIlIIl().lIlIlIIlIIIIlIIIIIlllIIII()) {
                class_09762.IlIlIIlIlIllIIlIlIIllIIIl = class_1999.lIlllIlllIIIIlIIlllIllIII;
                class_09762.lllIIIllIIIIlllIlIIllIIll(true, true);
                continue;
            }
            if (this.llIIIlllIlllIlIllIIIIllIl()) {
                class_09762.IlIlIIlIlIllIIlIlIIllIIIl = class_19992;
                class_09762.lllIIIllIIIIlllIlIIllIIll(class_09762.IlIlIIlIlIllIIlIlIIllIIIl != class_1999.lllIIIllIIIIlllIlIIllIIll, true);
                continue;
            }
            class_09762.IlIlIIlIlIllIIlIlIIllIIIl = class_19992;
            class_09762.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI(), this.llIllllIlIllIIIlIllIIlIlI);
        }
    }

    protected boolean llllllIlIllllIlIlIlIIIIlI() {
        return true;
    }

    public boolean lIlIIllllIlIIIIllIIIIlIIl() {
        return this.llIIIIllIIIIIIIlIIIlIIIIl;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(boolean bl) {
        this.llIIIIllIIIIIIIlIIIlIIIIl = bl;
    }

    public void IlIllllllIIlIIllllIIlIIIl(boolean bl) {
        this.IIllIllIIllIIlllIIIlIlllI = bl;
    }

    public class_2055 llIlllIIllIlllIlIlIlIIIll() {
        return this.lIIIIlIlIIlllllIIllIIlIII;
    }

    public void IIIIlIIlIIIllIIIIllIIIlII() {
        this.llllllIlIllllIlIlIlIIIIlI = true;
        this.llIlllIIllIlllIlIlIlIIIll().lIlllIlllIIIIlIIlllIllIII();
        for (int i = 0; i < this.IlIllllllIIlIIllllIIlIIIl.length; ++i) {
            class_0976 class_09762 = this.IlIllllllIIlIIllllIIlIIIl[i];
            if (class_09762 == null) continue;
            class_09762.lllIIIIIIlIlllIIlIlIIIllI();
        }
        this.llIlllIIllIlllIlIlIlIIIll().IlIIIIIllllllIIlllIllllll(this.IlIllllllIIlIIllllIIlIIIl[0].llIllllIlIllIIIlIllIIlIlI().IIIllIIlIIIIIIlIlIIllIIlI());
        this.llIIllIllIlIIlIIllIllllll();
    }

    public String lllIIIIIIlIlllIIlIlIIIllI() {
        return this.lIlIIllllIlIIIIllIIIIlIIl;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1296 class_12962) {
        class_12962.func_152768_a("whitelist_enabled", false);
        class_12962.func_152768_a("whitelist_count", 0);
        class_12962.func_152768_a("players_current", this.IIlllIlIlllIllIIIlllIIlIl());
        class_12962.func_152768_a("players_max", this.lIlIllIIlIIlIIlIIlIIlIIll());
        class_12962.func_152768_a("players_seen", this.lIlIlIIlIIIIlIIIIIlllIIII.IlIlIIlllIIlIllIIIlllllIl().length);
        class_12962.func_152768_a("uses_auth", this.llIIlIllIllllIlIIIIlIIlll);
        class_12962.func_152768_a("gui_state", this.IIlIllIIlllllIIlIIllllIIl() ? "enabled" : "disabled");
        class_12962.func_152768_a("run_time", (class_0220.lllIIIlIIlIlIllIIIIIlIIll() - class_12962.IIIllIIlIIIIIIlIlIIllIIlI()) / 60L * 1000L);
        class_12962.func_152768_a("avg_tick_ms", (int)(MathHelper.lllIIIllIIIIlllIlIIllIIll(this.IIIllIIlIIIIIIlIlIIllIIlI) * 1.0E-6));
        int n = 0;
        for (int i = 0; i < this.IlIllllllIIlIIllllIIlIIIl.length; ++i) {
            if (this.IlIllllllIIlIIllllIIlIIIl[i] == null) continue;
            class_0976 class_09762 = this.IlIllllllIIlIIllllIIlIIIl[i];
            class_0770 class_07702 = class_09762.lIlllIlllIlIIIIlllIlIlIIl();
            class_12962.func_152768_a("world[" + n + "][dimension]", class_09762.IlIlIIlllIIlIllIIIlllllIl.IIIllIllIIlIlIlIlIllllIIl);
            class_12962.func_152768_a("world[" + n + "][mode]", (Object)class_07702.IlIlIIlllIIlIllIIIlllllIl());
            class_12962.func_152768_a("world[" + n + "][difficulty]", (Object)class_09762.IlIlIIlIlIllIIlIlIIllIIIl);
            class_12962.func_152768_a("world[" + n + "][hardcore]", class_07702.lIlIlIIlIIIIlIIIIIlllIIII());
            class_12962.func_152768_a("world[" + n + "][generator_name]", class_07702.IlIIIlIIIIllIIIllIIIIIIll().lllIIIllIIIIlllIlIIllIIll());
            class_12962.func_152768_a("world[" + n + "][generator_version]", class_07702.IlIIIlIIIIllIIIllIIIIIIll().lIlllIlllIIIIlIIlllIllIII());
            class_12962.func_152768_a("world[" + n + "][height]", this.IIIIIIIIlIllIIllIIlllIllI);
            class_12962.func_152768_a("world[" + n + "][chunks_loaded]", class_09762.llIIlIllIllllIlIIIIlIIlll().IlIIIIIllllllIIlllIllllll());
            ++n;
        }
        class_12962.func_152768_a("worlds", n);
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_1296 class_12962) {
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("singleplayer", this.llIIIlllIlllIlIllIIIIllIl());
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("server_brand", this.lIlllIlllIlIIIIlllIlIlIIl());
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("gui_supported", GraphicsEnvironment.isHeadless() ? "headless" : "supported");
        class_12962.lllIlIIlIIIlIlIIIllIlllIl("dedicated", this.llIIlIIllIIllIlIIllIIllII());
    }

    @Override
    public boolean IIlIIlIlIlIllIIlIlIIIIlll() {
        return true;
    }

    public abstract boolean llIIlIIllIIllIlIIllIIllII();

    public boolean lIlIlIIIIIIlIIllllIlIIllI() {
        return this.llIIlIllIllllIlIIIIlIIlll;
    }

    public void lIlllIlllIIIIlIIlllIllIII(boolean bl) {
        this.llIIlIllIllllIlIIIIlIIlll = bl;
    }

    public boolean IllllIIIIlIIlIIIIlllIIIIl() {
        return this.llIllllIlIllIIIlIllIIlIlI;
    }

    public void IlIIIIIllllllIIlllIllllll(boolean bl) {
        this.llIllllIlIllIIIlIllIIlIlI = bl;
    }

    public boolean llllIlIIIIIIIIIlllIIlIIIl() {
        return this.lIlllIlllIlIIIIlllIlIlIIl;
    }

    public void lIllllIIlIIIlIllllllIIIll(boolean bl) {
        this.lIlllIlllIlIIIIlllIlIlIIl = bl;
    }

    public boolean IIIIlIlIIlIIIIlIlllIlIIII() {
        return this.IlIIlllllIIlIlIlllllIllll;
    }

    public void IIIllIIlIIIIIIlIlIIllIIlI(boolean bl) {
        this.IlIIlllllIIlIlIlllllIllll = bl;
    }

    public boolean lllIIIIlIlIIlIIlllIIIIIIl() {
        return this.llIIlIlIlllIIllIlIlllIllI;
    }

    public void IllIIlllllllIIlIIlIIIIlIl(boolean bl) {
        this.llIIlIlIlllIIllIlIlllIllI = bl;
    }

    public abstract boolean llIlIIlllIIIIIllIIlIlIIII();

    public String IllIIIlllllIlIlllIlllllII() {
        return this.IllIIIIllIIllIllIlllIlIIl;
    }

    public void IllIIlllllllIIlIIlIIIIlIl(String string) {
        this.IllIIIIllIIllIllIlllIlIIl = string;
    }

    public int llIlllIlIIllIlIIIIllIIlIl() {
        return this.IIIIIIIIlIllIIllIIlllIllI;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(int n) {
        this.IIIIIIIIlIllIIllIIlllIllI = n;
    }

    public class_2116 lIIIllIIIIIllllIlIlIllIll() {
        return this.lIlIlIIlIIIIlIIIIIlllIIII;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_2116 class_21162) {
        this.lIlIlIIlIIIIlIIIIIlllIIII = class_21162;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_2243 class_22432) {
        for (int i = 0; i < this.IlIllllllIIlIIllllIIlIIIl.length; ++i) {
            class_0220.IlIIlllllIIlIlIlllllIllll().IlIllllllIIlIIllllIIlIIIl[i].lIlllIlllIlIIIIlllIlIlIIl().lllIIIllIIIIlllIlIIllIIll(class_22432);
        }
    }

    public class_0267 lIIIlIIIlIlllIllIIIlIIIlI() {
        return this.IlIlIIlIlIllIIlIlIIllIIIl;
    }

    public boolean lIIlIlllIllIlIlllIIIIIIII() {
        return this.llIlllIIllIlllIlIlIlIIIll;
    }

    public boolean IIlIllIIlllllIIlIIllllIIl() {
        return false;
    }

    public abstract String lllIIIllIIIIlllIlIIllIIll(class_2243 var1, boolean var2);

    public int IllllIIlIIIllIlllIlllIllI() {
        return this.lIlIllIIlIIlIIlIIlIIlIIll;
    }

    public void IllIlIlIIIlllIIllIIIIlIll() {
        this.llIIlIIllIIllIlIIllIIllII = true;
    }

    public class_1296 IlIIIlIllIIIllIIIIlIIlIll() {
        return this.llIIlllIllIllllIIIlIIIIII;
    }

    @Override
    public class_2208 lllIIlIIIllllllIIIIlIlIlI() {
        return new class_2208(0, 0, 0);
    }

    @Override
    public class_1334 IIllIllIIllIIlllIIIlIlllI() {
        return this.IlIllllllIIlIIllllIIlIIIl[0];
    }

    public int llllIIllIlIlllllllIIlIIlI() {
        return 16;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_0814 class_08142) {
        return false;
    }

    public boolean IlllIIlllllllIIllIlIllllI() {
        return this.lIlIlIIIIIIlIIllllIlIIllI;
    }

    public Proxy IlllIIIllllIIllIllIlIIlIl() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    public static long lllIIIlIIlIlIllIIIIIlIIll() {
        return System.currentTimeMillis();
    }

    public int IIIlIlIllIlllllIlIllllllI() {
        return this.IIlIIlIlIlIllIIlIlIIIIlll;
    }

    public void IlIllllllIIlIIllllIIlIIIl(int n) {
        this.IIlIIlIlIlIllIIlIlIIIIlll = n;
    }

    @Override
    public IChatComponent llIIIIllIIIIIIIlIIIlIIIIl() {
        return new class_0722(this.llllIIIIlIIIlIIIIIIlIllll());
    }

    public boolean IIIIlIllIlIIIIIllllIIlllI() {
        return true;
    }

    public MinecraftSessionService llllIlIIllIIlllllIIllIIll() {
        return this.llllIlIIIIIIIIIlllIIlIIIl;
    }

    public GameProfileRepository IlIlIllIIlIIIIlllIlIllIlI() {
        return this.lllIIIIlIlIIlIIlllIIIIIIl;
    }

    public class_2119 IlIIllIlIlIllIIIlIIlIlIIl() {
        return this.llIlIIlllIIIIIllIIlIlIIII;
    }

    public class_0111 lIlIIllIllIIIIIlIllllIIIl() {
        return this.lllllIlllIIllIlIIlIIIllII;
    }

    public void lIlllIIllIIIIIIlIlIIlIllI() {
        this.IIIIlIlIIlIIIIlIlllIlIIII = 0L;
    }

    static /* synthetic */ Logger llIIIlIlIlIIlIllIIIllIlIl() {
        return IIIllIllIIlIlIlIlIllllIIl;
    }

    static /* synthetic */ class_2116 lllIIIllIIIIlllIlIIllIIll(class_0220 class_02202) {
        return class_02202.lIlIlIIlIIIIlIIIIIlllIIII;
    }
}

