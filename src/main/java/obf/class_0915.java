package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Stopwatch
 */
import com.google.common.base.Stopwatch;
import com.moonsworth.lunar.client.LunarClient;

import java.util.concurrent.TimeUnit;

public class class_0915
implements Runnable {
    private static int lllIIIllIIIIlllIlIIllIIll = "Lo6a$DMR".length() * "aAO20DQ6iIlP".length();
    private static int lllIlIIlIIIlIlIIIllIlllIl = lllIIIllIIIIlllIlIIllIIll * "yh9bV53gfZv4tBa49MF2G".length() - 16;
    private static int IlIllllllIIlIIllllIIlIIIl = "u2CXyEg4Fy32".length() - 2;
    private static double lIlllIlllIIIIlIIlllIllIII = 8000.0;
    private static double IlIIIIIllllllIIlllIllllll = 3.0;
    private static double lIllllIIlIIIlIllllllIIIll = 6.0;
    private static double IIIllIIlIIIIIIlIlIIllIIlI = 20.0;
    private static double IllIIlllllllIIlIIlIIIIlIl = 1.0;
    private Stopwatch IIIllIllIIlIlIlIlIllllIIl;

    @Override
    public void run() {
        while (true) {
            try {
                while (true) {
                    boolean bl = this.IIIllIllIIlIlIlIlIllllIIl == null || this.IIIllIllIIlIlIlIlIllllIIl.elapsed(TimeUnit.MINUTES) >= 10L;
                    boolean bl2 = false;
                    if (this.lllIIIllIIIIlllIlIIllIIll() && bl) {
                        bl2 = this.lllIIIllIIIIlllIlIIllIIll(0, lIlllIlllIIIIlIIlllIllIII);
                    }
                    if (this.lllIlIIlIIIlIlIIIllIlllIl() && bl) {
                        bl2 = this.lllIIIllIIIIlllIlIIllIIll(1, IlIIIIIllllllIIlllIllllll);
                    }
                    if (this.IlIllllllIIlIIllllIIlIIIl() && bl) {
                        bl2 = this.lllIIIllIIIIlllIlIIllIIll(2, lIllllIIlIIIlIllllllIIIll);
                    }
                    if (this.lIlllIlllIIIIlIIlllIllIII() && bl) {
                        bl2 = this.lllIIIllIIIIlllIlIIllIIll(3, IIIllIIlIIIIIIlIlIIllIIlI);
                    }
                    if (this.IlIIIIIllllllIIlllIllllll() && bl) {
                        bl2 = this.lllIIIllIIIIlllIlIIllIIll(4, IllIIlllllllIIlIIlIIIIlIl);
                    }
                    if (bl2) {
                        if (this.IIIllIllIIlIlIlIlIllllIIl == null) {
                            this.IIIllIllIIlIlIlIlIllllIIl = Stopwatch.createStarted();
                        } else {
                            this.IIIllIllIIlIlIlIlIllllIIl.reset();
                            this.IIIllIllIIlIlIlIlIllllIIl.start();
                        }
                    }
                    Thread.sleep(TimeUnit.SECONDS.toMillis(30L));
                }
            }
            catch (Exception exception) {
                continue;
            }
            break;
        }
    }

    private boolean lllIIIllIIIIlllIlIIllIIll(int n, double d) {
        if (LunarClient.getInstance() != null && LunarClient.getInstance().getWebsocket() != null) {
            LunarClient.getInstance().getWebsocket().lllIIIllIIIIlllIlIIllIIll(new class_1763(n, d));
            return true;
        }
        return false;
    }

    private boolean lllIIIllIIIIlllIlIIllIIll() {
        return lIlllIlllIIIIlIIlllIllIII != (double)lllIlIIlIIIlIlIIIllIlllIl * 4.0;
    }

    private boolean lllIlIIlIIIlIlIIIllIlllIl() {
        return IlIIIIIllllllIIlllIllllll != (double)(lllIIIllIIIIlllIlIIllIIll >> 5);
    }

    private boolean IlIllllllIIlIIllllIIlIIIl() {
        return lIllllIIlIIIlIllllllIIIll != (double)(lllIIIllIIIIlllIlIIllIIll >> 4);
    }

    private boolean lIlllIlllIIIIlIIlllIllIII() {
        return IIIllIIlIIIIIIlIlIIllIIlI != (double)(IlIllllllIIlIIllllIIlIIIl * 2);
    }

    private boolean IlIIIIIllllllIIlllIllllll() {
        return IllIIlllllllIIlIIlIIIIlIl != (double)(IlIllllllIIlIIllllIIlIIIl / 10);
    }
}

