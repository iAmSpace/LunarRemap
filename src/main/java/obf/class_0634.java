package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  com.google.common.collect.Lists
 *  io.netty.buffer.Unpooled
 *  io.netty.util.concurrent.GenericFutureListener
 *  org.apache.commons.lang3.StringUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.base.Charsets;
import com.google.common.collect.Lists;
import io.netty.buffer.Unpooled;
import io.netty.util.concurrent.GenericFutureListener;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import net.minecraft.init.Items;
import net.minecraft.stats.AchievementList;
import net.minecraft.crash.CrashReport;
import net.minecraft.util.IChatComponent;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentTranslation;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_0634
implements class_1829 {
    private static final Logger IlIllllllIIlIIllllIIlIIIl = LogManager.getLogger();
    public final class_0800 lllIIIllIIIIlllIlIIllIIll;
    private final class_0220 lIlllIlllIIIIlIIlllIllIII;
    public class_1822 lllIlIIlIIIlIlIIIllIlllIl;
    private int IlIIIIIllllllIIlllIllllll;
    private int lIllllIIlIIIlIllllllIIIll;
    private boolean IIIllIIlIIIIIIlIlIIllIIlI;
    private int IllIIlllllllIIlIIlIIIIlIl;
    private long IIIllIllIIlIlIlIlIllllIIl;
    private static Random IllIIIllIIIIlIlIlIllIIlll = new Random();
    private long lIIIIlIlIIlllllIIllIIlIII;
    private int llIIlllIllIllllIIIlIIIIII;
    private int llIIllIllIlIIlIIllIllllll;
    private class_1890 lllIIlIIIllllllIIIIlIlIlI = new class_1890();
    private double IlIlllIIIIIIlIIllIIllIlll;
    private double IlIlIIlIlIllIIlIlIIllIIIl;
    private double lllllIlllIIllIlIIlIIIllII;
    private boolean IlIlIIlllIIlIllIIIlllllIl = true;

    public class_0634(class_0220 class_02202, class_0800 class_08002, class_1822 class_18222) {
        this.lIlllIlllIIIIlIIlllIllIII = class_02202;
        this.lllIIIllIIIIlllIlIIllIIll = class_08002;
        class_08002.lllIIIllIIIIlllIlIIllIIll(this);
        this.lllIlIIlIIIlIlIIIllIlllIl = class_18222;
        class_18222.lllIIIllIIIIlllIlIIllIIll = this;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll() {
        this.IIIllIIlIIIIIIlIlIIllIIlI = false;
        ++this.IlIIIIIllllllIIlllIllllll;
        this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl.startSection("keepAlive");
        if ((long)this.IlIIIIIllllllIIlllIllllll - this.lIIIIlIlIIlllllIIllIIlIII > 40L) {
            this.lIIIIlIlIIlllllIIllIIlIII = this.IlIIIIIllllllIIlllIllllll;
            this.IIIllIllIIlIlIlIlIllllIIl = this.IlIllllllIIlIIllllIIlIIIl();
            this.IllIIlllllllIIlIIlIIIIlIl = (int)this.IIIllIllIIlIlIlIlIllllIIl;
            this.lllIIIllIIIIlllIlIIllIIll(new class_1080(this.IllIIlllllllIIlIIlIIIIlIl));
        }
        if (this.llIIlllIllIllllIIIlIIIIII > 0) {
            --this.llIIlllIllIllllIIIlIIIIII;
        }
        if (this.llIIllIllIlIIlIIllIllllll > 0) {
            --this.llIIllIllIlIIlIIllIllllll;
        }
        if (this.lllIlIIlIIIlIlIIIllIlllIl.IIIIIIIIlIllIIllIIlllIllI() > 0L && this.lIlllIlllIIIIlIIlllIllIII.IIIlIlIllIlllllIlIllllllI() > 0 && class_0220.lllIIIlIIlIlIllIIIIIlIIll() - this.lllIlIIlIIIlIlIIIllIlllIl.IIIIIIIIlIllIIllIIlllIllI() > (long)(this.lIlllIlllIIIIlIIlllIllIII.IIIlIlIllIlllllIlIllllllI() * 1000 * 60)) {
            this.lllIIIllIIIIlllIlIIllIIll("You have been idle for too long!");
        }
    }

    public class_0800 lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public void lllIIIllIIIIlllIlIIllIIll(String string) {
        class_0722 class_07222 = new class_0722(string);
        this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new class_0542(class_07222), new class_1559(this, class_07222));
        this.lllIIIllIIIIlllIlIIllIIll.IIIllIIlIIIIIIlIlIIllIIlI();
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0836 class_08362) {
        this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(class_08362.IlIllllllIIlIIllllIIlIIIl(), class_08362.lIlllIlllIIIIlIIlllIllIII(), class_08362.IlIIIIIllllllIIlllIllllll(), class_08362.lIllllIIlIIIlIllllllIIIll());
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0983 class_09832) {
        class_0976 class_09762 = this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl.lIIllllllllIlIllllllllIlI);
        this.IIIllIIlIIIIIIlIlIIllIIlI = true;
        if (!this.lllIlIIlIIIlIlIIIllIlllIl.IIIllIllIIlIlIlIlIllllIIl) {
            double d;
            if (!this.IlIlIIlllIIlIllIIIlllllIl) {
                d = class_09832.lIlllIlllIIIIlIIlllIllIII() - this.IlIlIIlIlIllIIlIlIIllIIIl;
                if (class_09832.IlIllllllIIlIIllllIIlIIIl() == this.IlIlllIIIIIIlIIllIIllIlll && d * d < 0.01 && class_09832.IlIIIIIllllllIIlllIllllll() == this.lllllIlllIIllIlIIlIIIllII) {
                    this.IlIlIIlllIIlIllIIIlllllIl = true;
                }
            }
            if (this.IlIlIIlllIIlIllIIIlllllIl) {
                double d2;
                double d3;
                double d4;
                if (this.lllIlIIlIIIlIlIIIllIlllIl.IlIIIlIIIIllIIIllIIIIIIll != null) {
                    float f = this.lllIlIIlIIIlIlIIIllIlllIl.IIIIlIllIlIIlIIlIllIlIlll;
                    float f2 = this.lllIlIIlIIIlIlIIIllIlllIl.IlIlIIlllIllllllllIIIlIlI;
                    this.lllIlIIlIIIlIlIIIllIlllIl.IlIIIlIIIIllIIIllIIIIIIll.IIIlIlIllIlllllIlIllllllI();
                    double d5 = this.lllIlIIlIIIlIlIIIllIlllIl.IlIIlllllIIlIlIlllllIllll;
                    double d6 = this.lllIlIIlIIIlIlIIIllIlllIl.llIIlIlIlllIIllIlIlllIllI;
                    double d7 = this.lllIlIIlIIIlIlIIIllIlllIl.IllIIIIllIIllIllIlllIlIIl;
                    if (class_09832.lIIIIlIlIIlllllIIllIIlIII()) {
                        f = class_09832.IIIllIIlIIIIIIlIlIIllIIlI();
                        f2 = class_09832.IllIIlllllllIIlIIlIIIIlIl();
                    }
                    this.lllIlIIlIIIlIlIIIllIlllIl.llllllIlIllllIlIlIlIIIIlI = class_09832.IIIllIllIIlIlIlIlIllllIIl();
                    this.lllIlIIlIIIlIlIIIllIlllIl.lIllllIIlIIIlIllllllIIIll();
                    this.lllIlIIlIIIlIlIIIllIlllIl.IllllIIlIIIllIlllIlllIllI = 0.0f;
                    this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(d5, d6, d7, f, f2);
                    if (this.lllIlIIlIIIlIlIIIllIlllIl.IlIIIlIIIIllIIIllIIIIIIll != null) {
                        this.lllIlIIlIIIlIlIIIllIlllIl.IlIIIlIIIIllIIIllIIIIIIll.IIIlIlIllIlllllIlIllllllI();
                    }
                    this.lIlllIlllIIIIlIIlllIllIII.lIIIllIIIIIllllIlIlIllIll().lIlllIlllIIIIlIIlllIllIII(this.lllIlIIlIIIlIlIIIllIlllIl);
                    if (this.IlIlIIlllIIlIllIIIlllllIl) {
                        this.IlIlllIIIIIIlIIllIIllIlll = this.lllIlIIlIIIlIlIIIllIlllIl.IlIIlllllIIlIlIlllllIllll;
                        this.IlIlIIlIlIllIIlIlIIllIIIl = this.lllIlIIlIIIlIlIIIllIlllIl.llIIlIlIlllIIllIlIlllIllI;
                        this.lllllIlllIIllIlIIlIIIllII = this.lllIlIIlIIIlIlIIIllIlllIl.IllIIIIllIIllIllIlllIlIIl;
                    }
                    class_09762.IlIIIIIllllllIIlllIllllll(this.lllIlIIlIIIlIlIIIllIlllIl);
                    return;
                }
                if (this.lllIlIIlIIIlIlIIIllIlllIl.IIIIIllIIlIlIlIIlIlIlIllI()) {
                    this.lllIlIIlIIIlIlIIIllIlllIl.lIllllIIlIIIlIllllllIIIll();
                    this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(this.IlIlllIIIIIIlIIllIIllIlll, this.IlIlIIlIlIllIIlIlIIllIIIl, this.lllllIlllIIllIlIIlIIIllII, this.lllIlIIlIIIlIlIIIllIlllIl.IIIIlIllIlIIlIIlIllIlIlll, this.lllIlIIlIIIlIlIIIllIlllIl.IlIlIIlllIllllllllIIIlIlI);
                    class_09762.IlIIIIIllllllIIlllIllllll(this.lllIlIIlIIIlIlIIIllIlllIl);
                    return;
                }
                d = this.lllIlIIlIIIlIlIIIllIlllIl.llIIlIlIlllIIllIlIlllIllI;
                this.IlIlllIIIIIIlIIllIIllIlll = this.lllIlIIlIIIlIlIIIllIlllIl.IlIIlllllIIlIlIlllllIllll;
                this.IlIlIIlIlIllIIlIlIIllIIIl = this.lllIlIIlIIIlIlIIIllIlllIl.llIIlIlIlllIIllIlIlllIllI;
                this.lllllIlllIIllIlIIlIIIllII = this.lllIlIIlIIIlIlIIIllIlllIl.IllIIIIllIIllIllIlllIlIIl;
                double d8 = this.lllIlIIlIIIlIlIIIllIlllIl.IlIIlllllIIlIlIlllllIllll;
                double d9 = this.lllIlIIlIIIlIlIIIllIlllIl.llIIlIlIlllIIllIlIlllIllI;
                double d10 = this.lllIlIIlIIIlIlIIIllIlllIl.IllIIIIllIIllIllIlllIlIIl;
                float f = this.lllIlIIlIIIlIlIIIllIlllIl.IIIIlIllIlIIlIIlIllIlIlll;
                float f3 = this.lllIlIIlIIIlIlIIIllIlllIl.IlIlIIlllIllllllllIIIlIlI;
                if (class_09832.IllIIIllIIIIlIlIlIllIIlll() && class_09832.lIlllIlllIIIIlIIlllIllIII() == -999.0 && class_09832.lIllllIIlIIIlIllllllIIIll() == -999.0) {
                    class_09832.lllIIIllIIIIlllIlIIllIIll(false);
                }
                if (class_09832.IllIIIllIIIIlIlIlIllIIlll()) {
                    d8 = class_09832.IlIllllllIIlIIllllIIlIIIl();
                    d9 = class_09832.lIlllIlllIIIIlIIlllIllIII();
                    d10 = class_09832.IlIIIIIllllllIIlllIllllll();
                    d4 = class_09832.lIllllIIlIIIlIllllllIIIll() - class_09832.lIlllIlllIIIIlIIlllIllIII();
                    if (!this.lllIlIIlIIIlIlIIIllIlllIl.IIIIIllIIlIlIlIIlIlIlIllI() && (d4 > 1.65 || d4 < 0.1)) {
                        this.lllIIIllIIIIlllIlIIllIIll("Illegal stance");
                        IlIllllllIIlIIllllIIlIIIl.warn(this.lllIlIIlIIIlIlIIIllIlllIl.llllIIIIlIIIlIIIIIIlIllll() + " had an illegal stance: " + d4);
                        return;
                    }
                    if (Math.abs(class_09832.IlIllllllIIlIIllllIIlIIIl()) > 3.2E7 || Math.abs(class_09832.IlIIIIIllllllIIlllIllllll()) > 3.2E7) {
                        this.lllIIIllIIIIlllIlIIllIIll("Illegal position");
                        return;
                    }
                }
                if (class_09832.lIIIIlIlIIlllllIIllIIlIII()) {
                    f = class_09832.IIIllIIlIIIIIIlIlIIllIIlI();
                    f3 = class_09832.IllIIlllllllIIlIIlIIIIlIl();
                }
                this.lllIlIIlIIIlIlIIIllIlllIl.lIllllIIlIIIlIllllllIIIll();
                this.lllIlIIlIIIlIlIIIllIlllIl.IllllIIlIIIllIlllIlllIllI = 0.0f;
                this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(this.IlIlllIIIIIIlIIllIIllIlll, this.IlIlIIlIlIllIIlIlIIllIIIl, this.lllllIlllIIllIlIIlIIIllII, f, f3);
                if (!this.IlIlIIlllIIlIllIIIlllllIl) {
                    return;
                }
                d4 = d8 - this.lllIlIIlIIIlIlIIIllIlllIl.IlIIlllllIIlIlIlllllIllll;
                double d11 = d9 - this.lllIlIIlIIIlIlIIIllIlllIl.llIIlIlIlllIIllIlIlllIllI;
                double d12 = d10 - this.lllIlIIlIIIlIlIIIllIlllIl.IllIIIIllIIllIllIlllIlIIl;
                double d13 = Math.min(Math.abs(d4), Math.abs(this.lllIlIIlIIIlIlIIIllIlllIl.IIIIIIIIlIllIIllIIlllIllI));
                double d14 = d13 * d13 + (d3 = Math.min(Math.abs(d11), Math.abs(this.lllIlIIlIIIlIlIIIllIlllIl.IIlIIlIlIlIllIIlIlIIIIlll))) * d3 + (d2 = Math.min(Math.abs(d12), Math.abs(this.lllIlIIlIIIlIlIIIllIlllIl.llIIIlllIlllIlIllIIIIllIl))) * d2;
                if (!(!(d14 > 100.0) || this.lIlllIlllIIIIlIIlllIllIII.llIIIlllIlllIlIllIIIIllIl() && this.lIlllIlllIIIIlIIlllIllIII.IIIIIIIIlIllIIllIIlllIllI().equals(this.lllIlIIlIIIlIlIIIllIlllIl.llllIIIIlIIIlIIIIIIlIllll()))) {
                    IlIllllllIIlIIllllIIlIIIl.warn(this.lllIlIIlIIIlIlIIIllIlllIl.llllIIIIlIIIlIIIIIIlIllll() + " moved too quickly! " + d4 + "," + d11 + "," + d12 + " (" + d13 + ", " + d3 + ", " + d2 + ")");
                    this.lllIIIllIIIIlllIlIIllIIll(this.IlIlllIIIIIIlIIllIIllIlll, this.IlIlIIlIlIllIIlIlIIllIIIl, this.lllllIlllIIllIlIIlIIIllII, this.lllIlIIlIIIlIlIIIllIlllIl.IIIIlIllIlIIlIIlIllIlIlll, this.lllIlIIlIIIlIlIIIllIlllIl.IlIlIIlllIllllllllIIIlIlI);
                    return;
                }
                float f4 = 0.0625f;
                boolean bl = class_09762.lllIIIllIIIIlllIlIIllIIll((class_1521)this.lllIlIIlIIIlIlIIIllIlllIl, this.lllIlIIlIIIlIlIIIllIlllIl.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl().IlIIIIIllllllIIlllIllllll(f4, f4, f4)).isEmpty();
                if (this.lllIlIIlIIIlIlIIIllIlllIl.llllllIlIllllIlIlIlIIIIlI && !class_09832.IIIllIllIIlIlIlIlIllllIIl() && d11 > 0.0) {
                    this.lllIlIIlIIIlIlIIIllIlllIl.f_();
                }
                this.lllIlIIlIIIlIlIIIllIlllIl.IlIIIIIllllllIIlllIllllll(d4, d11, d12);
                this.lllIlIIlIIIlIlIIIllIlllIl.llllllIlIllllIlIlIlIIIIlI = class_09832.IIIllIllIIlIlIlIlIllllIIl();
                this.lllIlIIlIIIlIlIIIllIlllIl.lIIIIlIlIIlllllIIllIIlIII(d4, d11, d12);
                double d15 = d11;
                d4 = d8 - this.lllIlIIlIIIlIlIIIllIlllIl.IlIIlllllIIlIlIlllllIllll;
                d11 = d9 - this.lllIlIIlIIIlIlIIIllIlllIl.llIIlIlIlllIIllIlIlllIllI;
                if (d11 > -0.5 || d11 < 0.5) {
                    d11 = 0.0;
                }
                d12 = d10 - this.lllIlIIlIIIlIlIIIllIlllIl.IllIIIIllIIllIllIlllIlIIl;
                d14 = d4 * d4 + d11 * d11 + d12 * d12;
                boolean bl2 = false;
                if (d14 > 0.0625 && !this.lllIlIIlIIIlIlIIIllIlllIl.IIIIIllIIlIlIlIIlIlIlIllI() && !this.lllIlIIlIIIlIlIIIllIlllIl.IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl()) {
                    bl2 = true;
                    IlIllllllIIlIIllllIIlIIIl.warn(this.lllIlIIlIIIlIlIIIllIlllIl.llllIIIIlIIIlIIIIIIlIllll() + " moved wrongly!");
                }
                this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(d8, d9, d10, f, f3);
                boolean bl3 = class_09762.lllIIIllIIIIlllIlIIllIIll((class_1521)this.lllIlIIlIIIlIlIIIllIlllIl, this.lllIlIIlIIIlIlIIIllIlllIl.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl().IlIIIIIllllllIIlllIllllll(f4, f4, f4)).isEmpty();
                if (bl && (bl2 || !bl3) && !this.lllIlIIlIIIlIlIIIllIlllIl.IIIIIllIIlIlIlIIlIlIlIllI()) {
                    this.lllIIIllIIIIlllIlIIllIIll(this.IlIlllIIIIIIlIIllIIllIlll, this.IlIlIIlIlIllIIlIlIIllIIIl, this.lllllIlllIIllIlIIlIIIllII, f, f3);
                    return;
                }
                class_1974 class_19742 = this.lllIlIIlIIIlIlIIIllIlllIl.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl().lllIlIIlIIIlIlIIIllIlllIl(f4, f4, f4).lllIIIllIIIIlllIlIIllIIll(0.0, -0.55, 0.0);
                if (!(this.lIlllIlllIIIIlIIlllIllIII.lllIIIIlIlIIlIIlllIIIIIIl() || this.lllIlIIlIIIlIlIIIllIlllIl.IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl() || class_09762.IlIllllllIIlIIllllIIlIIIl(class_19742))) {
                    if (d15 >= -0.03125) {
                        ++this.lIllllIIlIIIlIllllllIIIll;
                        if (this.lIllllIIlIIIlIllllllIIIll > 80) {
                            IlIllllllIIlIIllllIIlIIIl.warn(this.lllIlIIlIIIlIlIIIllIlllIl.llllIIIIlIIIlIIIIIIlIllll() + " was kicked for floating too long!");
                            this.lllIIIllIIIIlllIlIIllIIll("Flying is not enabled on this server");
                            return;
                        }
                    }
                } else {
                    this.lIllllIIlIIIlIllllllIIIll = 0;
                }
                this.lllIlIIlIIIlIlIIIllIlllIl.llllllIlIllllIlIlIlIIIIlI = class_09832.IIIllIllIIlIlIlIlIllllIIl();
                this.lIlllIlllIIIIlIIlllIllIII.lIIIllIIIIIllllIlIlIllIll().lIlllIlllIIIIlIIlllIllIII(this.lllIlIIlIIIlIlIIIllIlllIl);
                this.lllIlIIlIIIlIlIIIllIlllIl.lllIlIIlIIIlIlIIIllIlllIl(this.lllIlIIlIIIlIlIIIllIlllIl.llIIlIlIlllIIllIlIlllIllI - d, class_09832.IIIllIllIIlIlIlIlIllllIIl());
            } else if (this.IlIIIIIllllllIIlllIllllll % 20 == 0) {
                this.lllIIIllIIIIlllIlIIllIIll(this.IlIlllIIIIIIlIIllIIllIlll, this.IlIlIIlIlIllIIlIlIIllIIIl, this.lllllIlllIIllIlIIlIIIllII, this.lllIlIIlIIIlIlIIIllIlllIl.IIIIlIllIlIIlIIlIllIlIlll, this.lllIlIIlIIIlIlIIIllIlllIl.IlIlIIlllIllllllllIIIlIlI);
            }
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(double d, double d2, double d3, float f, float f2) {
        this.IlIlIIlllIIlIllIIIlllllIl = false;
        this.IlIlllIIIIIIlIIllIIllIlll = d;
        this.IlIlIIlIlIllIIlIlIIllIIIl = d2;
        this.lllllIlllIIllIlIIlIIIllII = d3;
        this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(d, d2, d3, f, f2);
        this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new class_0717(d, d2 + (double)1.62f, d3, f, f2, false));
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1557 class_15572) {
        class_0976 class_09762 = this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl.lIIllllllllIlIllllllllIlI);
        this.lllIlIIlIIIlIlIIIllIlllIl.IlIIlllllIIlIlIlllllIllll();
        if (class_15572.IIIllIIlIIIIIIlIlIIllIIlI() == 4) {
            this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(false);
        } else if (class_15572.IIIllIIlIIIIIIlIlIIllIIlI() == 3) {
            this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(true);
        } else if (class_15572.IIIllIIlIIIIIIlIlIIllIIlI() == 5) {
            this.lllIlIIlIIIlIlIIIllIlllIl.llIIIlIIllIIllIllIIlIlllI();
        } else {
            boolean bl = false;
            if (class_15572.IIIllIIlIIIIIIlIlIIllIIlI() == 0) {
                bl = true;
            }
            if (class_15572.IIIllIIlIIIIIIlIlIIllIIlI() == 1) {
                bl = true;
            }
            if (class_15572.IIIllIIlIIIIIIlIlIIllIIlI() == 2) {
                bl = true;
            }
            int n = class_15572.IlIllllllIIlIIllllIIlIIIl();
            int n2 = class_15572.lIlllIlllIIIIlIIlllIllIII();
            int n3 = class_15572.IlIIIIIllllllIIlllIllllll();
            if (bl) {
                double d = this.lllIlIIlIIIlIlIIIllIlllIl.IlIIlllllIIlIlIlllllIllll - ((double)n + 0.5);
                double d2 = this.lllIlIIlIIIlIlIIIllIlllIl.llIIlIlIlllIIllIlIlllIllI - ((double)n2 + 0.5) + 1.5;
                double d3 = this.lllIlIIlIIIlIlIIIllIlllIl.IllIIIIllIIllIllIlllIlIIl - ((double)n3 + 0.5);
                double d4 = d * d + d2 * d2 + d3 * d3;
                if (d4 > 36.0) {
                    return;
                }
                if (n2 >= this.lIlllIlllIIIIlIIlllIllIII.llIlllIlIIllIlIIIIllIIlIl()) {
                    return;
                }
            }
            if (class_15572.IIIllIIlIIIIIIlIlIIllIIlI() == 0) {
                if (!this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(class_09762, n, n2, n3, this.lllIlIIlIIIlIlIIIllIlllIl)) {
                    this.lllIlIIlIIIlIlIIIllIlllIl.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, class_15572.lIllllIIlIIIlIllllllIIIll());
                } else {
                    this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new class_2088(n, n2, n3, class_09762));
                }
            } else if (class_15572.IIIllIIlIIIIIIlIlIIllIIlI() == 2) {
                this.lllIlIIlIIIlIlIIIllIlllIl.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(n, n2, n3);
                if (class_09762.a_(n, n2, n3).lIllllIIlIIIlIllllllIIIll() != class_1855.lllIIIllIIIIlllIlIIllIIll) {
                    this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new class_2088(n, n2, n3, class_09762));
                }
            } else if (class_15572.IIIllIIlIIIIIIlIlIIllIIlI() == 1) {
                this.lllIlIIlIIIlIlIIIllIlllIl.IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3);
                if (class_09762.a_(n, n2, n3).lIllllIIlIIIlIllllllIIIll() != class_1855.lllIIIllIIIIlllIlIIllIIll) {
                    this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new class_2088(n, n2, n3, class_09762));
                }
            }
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_2016 class_20162) {
        Object object;
        class_0976 class_09762 = this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl.lIIllllllllIlIllllllllIlI);
        ItemStack class_08972 = this.lllIlIIlIIIlIlIIIllIlllIl.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll();
        boolean bl = false;
        int n = class_20162.IlIllllllIIlIIllllIIlIIIl();
        int n2 = class_20162.lIlllIlllIIIIlIIlllIllIII();
        int n3 = class_20162.IlIIIIIllllllIIlllIllllll();
        int n4 = class_20162.lIllllIIlIIIlIllllllIIIll();
        this.lllIlIIlIIIlIlIIIllIlllIl.IlIIlllllIIlIlIlllllIllll();
        if (class_20162.lIllllIIlIIIlIllllllIIIll() == 255) {
            if (class_08972 == null) {
                return;
            }
            this.lllIlIIlIIIlIlIIIllIlllIl.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl, class_09762, class_08972);
        } else if (class_20162.lIlllIlllIIIIlIIlllIllIII() >= this.lIlllIlllIIIIlIIlllIllIII.llIlllIlIIllIlIIIIllIIlIl() - 1 && (class_20162.lIllllIIlIIIlIllllllIIIll() == 1 || class_20162.lIlllIlllIIIIlIIlllIllIII() >= this.lIlllIlllIIIIlIIlllIllIII.llIlllIlIIllIlIIIIllIIlIl())) {
            object = new ChatComponentTranslation("build.tooHigh", this.lIlllIlllIIIIlIIlllIllIII.llIlllIlIIllIlIIIIllIIlIl());
            ((class_1014)object).lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(class_1227.llIIllIllIlIIlIIllIllllll);
            this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new class_0710((IChatComponent)object));
            bl = true;
        } else {
            if (this.IlIlIIlllIIlIllIIIlllllIl && this.lllIlIIlIIIlIlIIIllIlllIl.lIllllIIlIIIlIllllllIIIll((double)n + 0.5, (double)n2 + 0.5, (double)n3 + 0.5) < 64.0 && !this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(class_09762, n, n2, n3, this.lllIlIIlIIIlIlIIIllIlllIl)) {
                this.lllIlIIlIIIlIlIIIllIlllIl.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl, class_09762, class_08972, n, n2, n3, n4, class_20162.IllIIlllllllIIlIIlIIIIlIl(), class_20162.IIIllIllIIlIlIlIlIllllIIl(), class_20162.IllIIIllIIIIlIlIlIllIIlll());
            }
            bl = true;
        }
        if (bl) {
            this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new class_2088(n, n2, n3, class_09762));
            if (n4 == 0) {
                --n2;
            }
            if (n4 == 1) {
                ++n2;
            }
            if (n4 == 2) {
                --n3;
            }
            if (n4 == 3) {
                ++n3;
            }
            if (n4 == 4) {
                --n;
            }
            if (n4 == 5) {
                ++n;
            }
            this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new class_2088(n, n2, n3, class_09762));
        }
        if ((class_08972 = this.lllIlIIlIIIlIlIIIllIlllIl.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll()) != null && class_08972.lllIlIIlIIIlIlIIIllIlllIl == 0) {
            this.lllIlIIlIIIlIlIIIllIlllIl.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll[this.lllIlIIlIIIlIlIIIllIlllIl.lllIIlIIIllllllIIIIlIlIlI.IlIllllllIIlIIllllIIlIIIl] = null;
            class_08972 = null;
        }
        if (class_08972 == null || class_08972.lllIIlIIIllllllIIIIlIlIlI() == 0) {
            this.lllIlIIlIIIlIlIIIllIlllIl.IIIllIIlIIIIIIlIlIIllIIlI = true;
            this.lllIlIIlIIIlIlIIIllIlllIl.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll[this.lllIlIIlIIIlIlIIIllIlllIl.lllIIlIIIllllllIIIIlIlIlI.IlIllllllIIlIIllllIIlIIIl] = ItemStack.lllIlIIlIIIlIlIIIllIlllIl(this.lllIlIIlIIIlIlIIIllIlllIl.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll[this.lllIlIIlIIIlIlIIIllIlllIl.lllIIlIIIllllllIIIIlIlIlI.IlIllllllIIlIIllllIIlIIIl]);
            object = this.lllIlIIlIIIlIlIIIllIlllIl.lIIIlIllllIlllIIIIIllIIIl.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl.lllIIlIIIllllllIIIIlIlIlI, this.lllIlIIlIIIlIlIIIllIlllIl.lllIIlIIIllllllIIIIlIlIlI.IlIllllllIIlIIllllIIlIIIl);
            this.lllIlIIlIIIlIlIIIllIlllIl.lIIIlIllllIlllIIIIIllIIIl.IlIllllllIIlIIllllIIlIIIl();
            this.lllIlIIlIIIlIlIIIllIlllIl.IIIllIIlIIIIIIlIlIIllIIlI = false;
            if (!ItemStack.lllIlIIlIIIlIlIIIllIlllIl(this.lllIlIIlIIIlIlIIIllIlllIl.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(), class_20162.IIIllIIlIIIIIIlIlIIllIIlI())) {
                this.lllIIIllIIIIlllIlIIllIIll(new class_1480(this.lllIlIIlIIIlIlIIIllIlllIl.lIIIlIllllIlllIIIIIllIIIl.lIlllIlllIIIIlIIlllIllIII, ((class_1291)object).IIIllIIlIIIIIIlIlIIllIIlI, this.lllIlIIlIIIlIlIIIllIlllIl.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll()));
            }
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(IChatComponent class_22552) {
        IlIllllllIIlIIllllIIlIIIl.info(this.lllIlIIlIIIlIlIIIllIlllIl.llllIIIIlIIIlIIIIIIlIllll() + " lost connection: " + class_22552);
        this.lIlllIlllIIIIlIIlllIllIII.lIlllIIllIIIIIIlIlIIlIllI();
        ChatComponentTranslation class_17902 = new ChatComponentTranslation("multiplayer.player.left", this.lllIlIIlIIIlIlIIIllIlllIl.llIIIIllIIIIIIIlIIIlIIIIl());
        class_17902.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(class_1227.IlIlllIIIIIIlIIllIIllIlll);
        this.lIlllIlllIIIIlIIlllIllIII.lIIIllIIIIIllllIlIlIllIll().lllIIIllIIIIlllIlIIllIIll(class_17902);
        this.lllIlIIlIIIlIlIIIllIlllIl.lllllIlllIIllIlIIlIIIllII();
        this.lIlllIlllIIIIlIIlllIllIII.lIIIllIIIIIllllIlIlIllIll().IlIIIIIllllllIIlllIllllll(this.lllIlIIlIIIlIlIIIllIlllIl);
        if (this.lIlllIlllIIIIlIIlllIllIII.llIIIlllIlllIlIllIIIIllIl() && this.lllIlIIlIIIlIlIIIllIlllIl.llllIIIIlIIIlIIIIIIlIllll().equals(this.lIlllIlllIIIIlIIlllIllIII.IIIIIIIIlIllIIllIIlllIllI())) {
            IlIllllllIIlIIllllIIlIIIl.info("Stopping singleplayer server as player logged out");
            this.lIlllIlllIIIIlIIlllIllIII.llIIllIllIlIIlIIllIllllll();
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0703 class_07032) {
        Object object;
        if (class_07032 instanceof class_0710) {
            class_0710 class_07102 = (class_0710)class_07032;
            object = this.lllIlIIlIIIlIlIIIllIlllIl.lIlllIlllIlIIIIlllIlIlIIl();
            if (object == class_1210.lllIlIIlIIIlIlIIIllIlllIl) {
                return;
            }
        }
        try {
            this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(class_07032, new GenericFutureListener[0]);
        }
        catch (Throwable throwable) {
            object = CrashReport.lllIIIllIIIIlllIlIIllIIll(throwable, "Sending packet");
            class_0799 class_07992 = ((CrashReport)object).lllIIIllIIIIlllIlIIllIIll("Packet being sent");
            class_07992.addCrashSectionCallable("Packet class", new class_1358(this, class_07032));
            throw new class_0892((CrashReport)object);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0361 class_03612) {
        if (class_03612.IlIllllllIIlIIllllIIlIIIl() >= 0 && class_03612.IlIllllllIIlIIllllIIlIIIl() < class_0503.lllIlIIlIIIlIlIIIllIlllIl()) {
            this.lllIlIIlIIIlIlIIIllIlllIl.lllIIlIIIllllllIIIIlIlIlI.IlIllllllIIlIIllllIIlIIIl = class_03612.IlIllllllIIlIIllllIIlIIIl();
            this.lllIlIIlIIIlIlIIIllIlllIl.IlIIlllllIIlIlIlllllIllll();
        } else {
            IlIllllllIIlIIllllIIlIIIl.warn(this.lllIlIIlIIIlIlIIIllIlllIl.llllIIIIlIIIlIIIIIIlIllll() + " tried to set an invalid carried item");
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1960 class_19602) {
        if (this.lllIlIIlIIIlIlIIIllIlllIl.lIlllIlllIlIIIIlllIlIlIIl() == class_1210.lllIlIIlIIIlIlIIIllIlllIl) {
            ChatComponentTranslation class_17902 = new ChatComponentTranslation("chat.cannotSend", new Object[0]);
            class_17902.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(class_1227.llIIllIllIlIIlIIllIllllll);
            this.lllIIIllIIIIlllIlIIllIIll(new class_0710(class_17902));
        } else {
            this.lllIlIIlIIIlIlIIIllIlllIl.IlIIlllllIIlIlIlllllIllll();
            String string = class_19602.IlIllllllIIlIIllllIIlIIIl();
            string = StringUtils.normalizeSpace((String)string);
            for (int i = 0; i < string.length(); ++i) {
                if (class_1395.lllIIIllIIIIlllIlIIllIIll(string.charAt(i))) continue;
                this.lllIIIllIIIIlllIlIIllIIll("Illegal characters in chat");
                return;
            }
            if (string.startsWith("/")) {
                this.lllIlIIlIIIlIlIIIllIlllIl(string);
            } else {
                ChatComponentTranslation class_17903 = new ChatComponentTranslation("chat.type.text", this.lllIlIIlIIIlIlIIIllIlllIl.llIIIIllIIIIIIIlIIIlIIIIl(), string);
                this.lIlllIlllIIIIlIIlllIllIII.lIIIllIIIIIllllIlIlIllIll().lllIIIllIIIIlllIlIIllIIll(class_17903, false);
            }
            this.llIIlllIllIllllIIIlIIIIII += 20;
            if (this.llIIlllIllIllllIIIlIIIIII > 200 && !this.lIlllIlllIIIIlIIlllIllIII.lIIIllIIIIIllllIlIlIllIll().IlIIIIIllllllIIlllIllllll(this.lllIlIIlIIIlIlIIIllIlllIl.lIIlIlllIIlIIIIlIlIIIIlll())) {
                this.lllIIIllIIIIlllIlIIllIIll("disconnect.spam");
            }
        }
    }

    private void lllIlIIlIIIlIlIIIllIlllIl(String string) {
        this.lIlllIlllIIIIlIIlllIllIII.llIIlIlIlllIIllIlIlllIllI().lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl, string);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0012 class_00122) {
        this.lllIlIIlIIIlIlIIIllIlllIl.IlIIlllllIIlIlIlllllIllll();
        if (class_00122.IlIllllllIIlIIllllIIlIIIl() == 1) {
            this.lllIlIIlIIIlIlIIIllIlllIl.lIIlIIIIIlIlllIlIIlIlIlll();
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1233 class_12332) {
        this.lllIlIIlIIIlIlIIIllIlllIl.IlIIlllllIIlIlIlllllIllll();
        if (class_12332.IlIllllllIIlIIllllIIlIIIl() == 1) {
            this.lllIlIIlIIIlIlIIIllIlllIl.lIlllIlllIIIIlIIlllIllIII(true);
        } else if (class_12332.IlIllllllIIlIIllllIIlIIIl() == 2) {
            this.lllIlIIlIIIlIlIIIllIlllIl.lIlllIlllIIIIlIIlllIllIII(false);
        } else if (class_12332.IlIllllllIIlIIllllIIlIIIl() == 4) {
            this.lllIlIIlIIIlIlIIIllIlllIl.lllIlIIlIIIlIlIIIllIlllIl(true);
        } else if (class_12332.IlIllllllIIlIIllllIIlIIIl() == 5) {
            this.lllIlIIlIIIlIlIIIllIlllIl.lllIlIIlIIIlIlIIIllIlllIl(false);
        } else if (class_12332.IlIllllllIIlIIllllIIlIIIl() == 3) {
            this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(false, true, true);
            this.IlIlIIlllIIlIllIIIlllllIl = false;
        } else if (class_12332.IlIllllllIIlIIllllIIlIIIl() == 6) {
            if (this.lllIlIIlIIIlIlIIIllIlllIl.IlIIIlIIIIllIIIllIIIIIIll != null && this.lllIlIIlIIIlIlIIIllIlllIl.IlIIIlIIIIllIIIllIIIIIIll instanceof class_1627) {
                ((class_1627)this.lllIlIIlIIIlIlIIIllIlllIl.IlIIIlIIIIllIIIllIIIIIIll).lIlIllIIlIIlIIlIIlIIlIIll(class_12332.lIlllIlllIIIIlIIlllIllIII());
            }
        } else if (class_12332.IlIllllllIIlIIllllIIlIIIl() == 7 && this.lllIlIIlIIIlIlIIIllIlllIl.IlIIIlIIIIllIIIllIIIIIIll != null && this.lllIlIIlIIIlIlIIIllIlllIl.IlIIIlIIIIllIIIllIIIIIIll instanceof class_1627) {
            ((class_1627)this.lllIlIIlIIIlIlIIIllIlllIl.IlIIIlIIIIllIIIllIIIIIIll).IIIllIIlIIIIIIlIlIIllIIlI(this.lllIlIIlIIIlIlIIIllIlllIl);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1680 class_16802) {
        class_0976 class_09762 = this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl.lIIllllllllIlIllllllllIlI);
        class_1521 class_15212 = class_16802.lllIIIllIIIIlllIlIIllIIll(class_09762);
        this.lllIlIIlIIIlIlIIIllIlllIl.IlIIlllllIIlIlIlllllIllll();
        if (class_15212 != null) {
            boolean bl = this.lllIlIIlIIIlIlIIIllIlllIl.IlIlllIIIIIIlIIllIIllIlll(class_15212);
            double d = 36.0;
            if (!bl) {
                d = 9.0;
            }
            if (this.lllIlIIlIIIlIlIIIllIlllIl.IlIIIIIllllllIIlllIllllll(class_15212) < d) {
                if (class_16802.IlIllllllIIlIIllllIIlIIIl() == class_2158.lllIIIllIIIIlllIlIIllIIll) {
                    this.lllIlIIlIIIlIlIIIllIlllIl.IlIlIIlIlIllIIlIlIIllIIIl(class_15212);
                } else if (class_16802.IlIllllllIIlIIllllIIlIIIl() == class_2158.lllIlIIlIIIlIlIIIllIlllIl) {
                    if (class_15212 instanceof class_1781 || class_15212 instanceof class_1138 || class_15212 instanceof class_0369 || class_15212 == this.lllIlIIlIIIlIlIIIllIlllIl) {
                        this.lllIIIllIIIIlllIlIIllIIll("Attempting to attack an invalid entity");
                        this.lIlllIlllIIIIlIIlllIllIII.lIlllIlllIIIIlIIlllIllIII("Player " + this.lllIlIIlIIIlIlIIIllIlllIl.llllIIIIlIIIlIIIIIIlIllll() + " tried to attack an invalid entity");
                        return;
                    }
                    this.lllIlIIlIIIlIlIIIllIlllIl.lllllIlllIIllIlIIlIIIllII(class_15212);
                }
            }
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0499 class_04992) {
        this.lllIlIIlIIIlIlIIIllIlllIl.IlIIlllllIIlIlIlllllIllll();
        class_1297 class_12972 = class_04992.IlIllllllIIlIIllllIIlIIIl();
        switch (class_12972) {
            case lllIIIllIIIIlllIlIIllIIll: {
                if (this.lllIlIIlIIIlIlIIIllIlllIl.IIIllIllIIlIlIlIlIllllIIl) {
                    this.lllIlIIlIIIlIlIIIllIlllIl = this.lIlllIlllIIIIlIIlllIllIII.lIIIllIIIIIllllIlIlIllIll().lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl, 0, true);
                    break;
                }
                if (this.lllIlIIlIIIlIlIIIllIlllIl.IIlllIlIlllIllIIIlllIIlIl().lIlllIlllIlIIIIlllIlIlIIl().lIlIlIIlIIIIlIIIIIlllIIII()) {
                    if (this.lIlllIlllIIIIlIIlllIllIII.llIIIlllIlllIlIllIIIIllIl() && this.lllIlIIlIIIlIlIIIllIlllIl.llllIIIIlIIIlIIIIIIlIllll().equals(this.lIlllIlllIIIIlIIlllIllIII.IIIIIIIIlIllIIllIIlllIllI())) {
                        this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll("You have died. Game over, man, it's game over!");
                        this.lIlllIlllIIIIlIIlllIllIII.IIIIlIIlIIIllIIIIllIIIlII();
                        break;
                    }
                    class_0216 class_02162 = new class_0216(this.lllIlIIlIIIlIlIIIllIlllIl.lIIlIlllIIlIIIIlIlIIIIlll(), (Date)null, "(You just lost the game)", (Date)null, "Death in Hardcore");
                    this.lIlllIlllIIIIlIIlllIllIII.lIIIllIIIIIllllIlIlIllIll().IllIIlllllllIIlIIlIIIIlIl().lllIIIllIIIIlllIlIIllIIll(class_02162);
                    this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll("You have died. Game over, man, it's game over!");
                    break;
                }
                if (this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIlllIlllIIlIllllIIlI() > 0.0f) {
                    return;
                }
                this.lllIlIIlIIIlIlIIIllIlllIl = this.lIlllIlllIIIIlIIlllIllIII.lIIIllIIIIIllllIlIlIllIll().lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl, 0, false);
                break;
            }
            case lllIlIIlIIIlIlIIIllIlllIl: {
                this.lllIlIIlIIIlIlIIIllIlllIl.IllIIIIllIIllIllIlllIlIIl().lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl);
                break;
            }
            case IlIllllllIIlIIllllIIlIIIl: {
                this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(AchievementList.openInventory);
            }
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_2144 class_21442) {
        this.lllIlIIlIIIlIlIIIllIlllIl.IlIlIIlIlIllIIlIlIIllIIIl();
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1454 class_14542) {
        this.lllIlIIlIIIlIlIIIllIlllIl.IlIIlllllIIlIlIlllllIllll();
        if (this.lllIlIIlIIIlIlIIIllIlllIl.lIIIlIllllIlllIIIIIllIIIl.lIlllIlllIIIIlIIlllIllIII == class_14542.IlIllllllIIlIIllllIIlIIIl() && this.lllIlIIlIIIlIlIIIllIlllIl.lIIIlIllllIlllIIIIIllIIIl.IlIllllllIIlIIllllIIlIIIl(this.lllIlIIlIIIlIlIIIllIlllIl)) {
            ItemStack class_08972 = this.lllIlIIlIIIlIlIIIllIlllIl.lIIIlIllllIlllIIIIIllIIIl.lllIIIllIIIIlllIlIIllIIll(class_14542.lIlllIlllIIIIlIIlllIllIII(), class_14542.IlIIIIIllllllIIlllIllllll(), class_14542.IllIIlllllllIIlIIlIIIIlIl(), (class_0814)this.lllIlIIlIIIlIlIIIllIlllIl);
            if (ItemStack.lllIlIIlIIIlIlIIIllIlllIl(class_14542.IIIllIIlIIIIIIlIlIIllIIlI(), class_08972)) {
                this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new class_1434(class_14542.IlIllllllIIlIIllllIIlIIIl(), class_14542.lIllllIIlIIIlIllllllIIIll(), true));
                this.lllIlIIlIIIlIlIIIllIlllIl.IIIllIIlIIIIIIlIlIIllIIlI = true;
                this.lllIlIIlIIIlIlIIIllIlllIl.lIIIlIllllIlllIIIIIllIIIl.IlIllllllIIlIIllllIIlIIIl();
                this.lllIlIIlIIIlIlIIIllIlllIl.IlIlllIIIIIIlIIllIIllIlll();
                this.lllIlIIlIIIlIlIIIllIlllIl.IIIllIIlIIIIIIlIlIIllIIlI = false;
            } else {
                this.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl.lIIIlIllllIlllIIIIIllIIIl.lIlllIlllIIIIlIIlllIllIII, class_14542.lIllllIIlIIIlIllllllIIIll());
                this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new class_1434(class_14542.IlIllllllIIlIIllllIIlIIIl(), class_14542.lIllllIIlIIIlIllllllIIIll(), false));
                this.lllIlIIlIIIlIlIIIllIlllIl.lIIIlIllllIlllIIIIIllIIIl.lllIIIllIIIIlllIlIIllIIll((class_0814)this.lllIlIIlIIIlIlIIIllIlllIl, false);
                ArrayList<ItemStack> arrayList = new ArrayList<ItemStack>();
                for (int i = 0; i < this.lllIlIIlIIIlIlIIIllIlllIl.lIIIlIllllIlllIIIIIllIIIl.IlIllllllIIlIIllllIIlIIIl.size(); ++i) {
                    arrayList.add(((class_1291)this.lllIlIIlIIIlIlIIIllIlllIl.lIIIlIllllIlllIIIIIllIIIl.IlIllllllIIlIIllllIIlIIIl.get(i)).lllIIIllIIIIlllIlIIllIIll());
                }
                this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl.lIIIlIllllIlllIIIIIllIIIl, arrayList);
            }
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1853 class_18532) {
        this.lllIlIIlIIIlIlIIIllIlllIl.IlIIlllllIIlIlIlllllIllll();
        if (this.lllIlIIlIIIlIlIIIllIlllIl.lIIIlIllllIlllIIIIIllIIIl.lIlllIlllIIIIlIIlllIllIII == class_18532.IlIllllllIIlIIllllIIlIIIl() && this.lllIlIIlIIIlIlIIIllIlllIl.lIIIlIllllIlllIIIIIllIIIl.IlIllllllIIlIIllllIIlIIIl(this.lllIlIIlIIIlIlIIIllIlllIl)) {
            this.lllIlIIlIIIlIlIIIllIlllIl.lIIIlIllllIlllIIIIIllIIIl.lllIlIIlIIIlIlIIIllIlllIl(this.lllIlIIlIIIlIlIIIllIlllIl, class_18532.lIlllIlllIIIIlIIlllIllIII());
            this.lllIlIIlIIIlIlIIIllIlllIl.lIIIlIllllIlllIIIIIllIIIl.IlIllllllIIlIIllllIIlIIIl();
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0286 class_02862) {
        if (this.lllIlIIlIIIlIlIIIllIlllIl.IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl()) {
            boolean bl;
            boolean bl2 = class_02862.IlIllllllIIlIIllllIIlIIIl() < 0;
            ItemStack class_08972 = class_02862.lIlllIlllIIIIlIIlllIllIII();
            boolean bl3 = class_02862.IlIllllllIIlIIllllIIlIIIl() >= 1 && class_02862.IlIllllllIIlIIllllIIlIIIl() < 36 + class_0503.lllIlIIlIIIlIlIIIllIlllIl();
            boolean bl4 = class_08972 == null || class_08972.lllIIIllIIIIlllIlIIllIIll() != null;
            boolean bl5 = bl = class_08972 == null || class_08972.IllIIIllIIIIlIlIlIllIIlll() >= 0 && class_08972.lllIlIIlIIIlIlIIIllIlllIl <= 64 && class_08972.lllIlIIlIIIlIlIIIllIlllIl > 0;
            if (bl3 && bl4 && bl) {
                if (class_08972 == null) {
                    this.lllIlIIlIIIlIlIIIllIlllIl.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(class_02862.IlIllllllIIlIIllllIIlIIIl(), (ItemStack)null);
                } else {
                    this.lllIlIIlIIIlIlIIIllIlllIl.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(class_02862.IlIllllllIIlIIllllIIlIIIl(), class_08972);
                }
                this.lllIlIIlIIIlIlIIIllIlllIl.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll((class_0814)this.lllIlIIlIIIlIlIIIllIlllIl, true);
            } else if (bl2 && bl4 && bl && this.llIIllIllIlIIlIIllIllllll < 200) {
                this.llIIllIllIlIIlIIllIllllll += 20;
                class_1781 class_17812 = this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(class_08972, true);
                if (class_17812 != null) {
                    class_17812.IlIllllllIIlIIllllIIlIIIl();
                }
            }
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0039 class_00392) {
        Short s = (Short)this.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl.lIIIlIllllIlllIIIIIllIIIl.lIlllIlllIIIIlIIlllIllIII);
        if (s != null && class_00392.lIlllIlllIIIIlIIlllIllIII() == s.shortValue() && this.lllIlIIlIIIlIlIIIllIlllIl.lIIIlIllllIlllIIIIIllIIIl.lIlllIlllIIIIlIIlllIllIII == class_00392.IlIllllllIIlIIllllIIlIIIl() && !this.lllIlIIlIIIlIlIIIllIlllIl.lIIIlIllllIlllIIIIIllIIIl.IlIllllllIIlIIllllIIlIIIl(this.lllIlIIlIIIlIlIIIllIlllIl)) {
            this.lllIlIIlIIIlIlIIIllIlllIl.lIIIlIllllIlllIIIIIllIIIl.lllIIIllIIIIlllIlIIllIIll((class_0814)this.lllIlIIlIIIlIlIIIllIlllIl, true);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0317 class_03172) {
        this.lllIlIIlIIIlIlIIIllIlllIl.IlIIlllllIIlIlIlllllIllll();
        class_0976 class_09762 = this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl.lIIllllllllIlIllllllllIlI);
        if (class_09762.IlIIIIIllllllIIlllIllllll(class_03172.IlIllllllIIlIIllllIIlIIIl(), class_03172.lIlllIlllIIIIlIIlllIllIII(), class_03172.IlIIIIIllllllIIlllIllllll())) {
            int n;
            int n2;
            class_2219 class_22192;
            class_1774 class_17742 = class_09762.lllIlIIlIIIlIlIIIllIlllIl(class_03172.IlIllllllIIlIIllllIIlIIIl(), class_03172.lIlllIlllIIIIlIIlllIllIII(), class_03172.IlIIIIIllllllIIlllIllllll());
            if (class_17742 instanceof class_2219 && (!(class_22192 = (class_2219)class_17742).lllIIIllIIIIlllIlIIllIIll() || class_22192.IlIIIIIllllllIIlllIllllll() != this.lllIlIIlIIIlIlIIIllIlllIl)) {
                this.lIlllIlllIIIIlIIlllIllIII.lIlllIlllIIIIlIIlllIllIII("Player " + this.lllIlIIlIIIlIlIIIllIlllIl.llllIIIIlIIIlIIIIIIlIllll() + " just tried to change non-editable sign");
                return;
            }
            for (n2 = 0; n2 < 4; ++n2) {
                n = 1;
                if (class_03172.lIllllIIlIIIlIllllllIIIll()[n2].length() > 15) {
                    n = 0;
                } else {
                    for (int i = 0; i < class_03172.lIllllIIlIIIlIllllllIIIll()[n2].length(); ++i) {
                        if (class_1395.lllIIIllIIIIlllIlIIllIIll(class_03172.lIllllIIlIIIlIllllllIIIll()[n2].charAt(i))) continue;
                        n = 0;
                    }
                }
                if (n != 0) continue;
                class_03172.lIllllIIlIIIlIllllllIIIll()[n2] = "!?";
            }
            if (class_17742 instanceof class_2219) {
                n2 = class_03172.IlIllllllIIlIIllllIIlIIIl();
                n = class_03172.lIlllIlllIIIIlIIlllIllIII();
                int n3 = class_03172.IlIIIIIllllllIIlllIllllll();
                class_2219 class_22193 = (class_2219)class_17742;
                System.arraycopy(class_03172.lIllllIIlIIIlIllllllIIIll(), 0, class_22193.IllIIlllllllIIlIIlIIIIlIl, 0, 4);
                class_22193.llIIlIllIllllIlIIIIlIIlll();
                class_09762.IIIllIIlIIIIIIlIlIIllIIlI(n2, n, n3);
            }
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0062 class_00622) {
        if (class_00622.IlIllllllIIlIIllllIIlIIIl() == this.IllIIlllllllIIlIIlIIIIlIl) {
            int n = (int)(this.IlIllllllIIlIIllllIIlIIIl() - this.IIIllIllIIlIlIlIlIllllIIl);
            this.lllIlIIlIIIlIlIIIllIlllIl.IllIIlllllllIIlIIlIIIIlIl = (this.lllIlIIlIIIlIlIIIllIlllIl.IllIIlllllllIIlIIlIIIIlIl * 3 + n) / 4;
        }
    }

    private long IlIllllllIIlIIllllIIlIIIl() {
        return System.nanoTime() / 1000000L;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_2065 class_20652) {
        this.lllIlIIlIIIlIlIIIllIlllIl.lIIlIlIlIlIllIIlIIllllIll.lllIlIIlIIIlIlIIIllIlllIl = class_20652.lIlllIlllIIIIlIIlllIllIII() && this.lllIlIIlIIIlIlIIIllIlllIl.lIIlIlIlIlIllIIlIIllllIll.IlIllllllIIlIIllllIIlIIIl;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0287 class_02872) {
        ArrayList arrayList = Lists.newArrayList();
        for (String string : this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl, class_02872.IlIllllllIIlIIllllIIlIIIl())) {
            arrayList.add(string);
        }
        this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new class_1719(arrayList.toArray(new String[arrayList.size()])));
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0681 class_06812) {
        this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(class_06812);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0917 class_09172) {
        if ("MC|BEdit".equals(class_09172.IlIllllllIIlIIllllIIlIIIl())) {
            class_0181 class_01812 = new class_0181(Unpooled.wrappedBuffer((byte[])class_09172.lIlllIlllIIIIlIIlllIllIII()));
            try {
                ItemStack class_08972 = class_01812.IlIllllllIIlIIllllIIlIIIl();
                if (class_08972 == null) {
                    return;
                }
                if (!class_0789.lllIIIllIIIIlllIlIIllIIll(class_08972.lllllIlllIIllIlIIlIIIllII())) {
                    throw new IOException("Invalid book tag!");
                }
                ItemStack class_08973 = this.lllIlIIlIIIlIlIIIllIlllIl.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll();
                if (class_08973 == null) return;
                if (class_08972.lllIIIllIIIIlllIlIIllIIll() != Items.lIIIIlIIIIllIlIIllllIlIII || class_08972.lllIIIllIIIIlllIlIIllIIll() != class_08973.lllIIIllIIIIlllIlIIllIIll()) return;
                class_08973.lllIIIllIIIIlllIlIIllIIll("pages", class_08972.lllllIlllIIllIlIIlIIIllII().IlIllllllIIlIIllllIIlIIIl("pages", 8));
                return;
            }
            catch (Exception exception) {
                IlIllllllIIlIIllllIIlIIIl.error("Couldn't handle book info", (Throwable)exception);
                return;
            }
            finally {
                class_01812.release();
            }
        }
        if ("MC|BSign".equals(class_09172.IlIllllllIIlIIllllIIlIIIl())) {
            class_0181 class_01813 = new class_0181(Unpooled.wrappedBuffer((byte[])class_09172.lIlllIlllIIIIlIIlllIllIII()));
            try {
                ItemStack class_08974 = class_01813.IlIllllllIIlIIllllIIlIIIl();
                if (class_08974 == null) {
                    return;
                }
                if (!class_1827.lllIIIllIIIIlllIlIIllIIll(class_08974.lllllIlllIIllIlIIlIIIllII())) {
                    throw new IOException("Invalid book tag!");
                }
                ItemStack class_08975 = this.lllIlIIlIIIlIlIIIllIlllIl.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll();
                if (class_08975 == null) return;
                if (class_08974.lllIIIllIIIIlllIlIIllIIll() != Items.lIIIlllllllIlllIIllllllll || class_08975.lllIIIllIIIIlllIlIIllIIll() != Items.lIIIIlIIIIllIlIIllllIlIII) return;
                class_08975.lllIIIllIIIIlllIlIIllIIll("author", new class_0928(this.lllIlIIlIIIlIlIIIllIlllIl.llllIIIIlIIIlIIIIIIlIllll()));
                class_08975.lllIIIllIIIIlllIlIIllIIll("title", new class_0928(class_08974.lllllIlllIIllIlIIlIIIllII().IllIIIllIIIIlIlIlIllIIlll("title")));
                class_08975.lllIIIllIIIIlllIlIIllIIll("pages", class_08974.lllllIlllIIllIlIIlIIIllII().IlIllllllIIlIIllllIIlIIIl("pages", 8));
                class_08975.lllIIIllIIIIlllIlIIllIIll(Items.lIIIlllllllIlllIIllllllll);
                return;
            }
            catch (Exception exception) {
                IlIllllllIIlIIllllIIlIIIl.error("Couldn't sign book", (Throwable)exception);
                return;
            }
            finally {
                class_01813.release();
            }
        }
        if ("MC|TrSel".equals(class_09172.IlIllllllIIlIIllllIIlIIIl())) {
            try {
                DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(class_09172.lIlllIlllIIIIlIIlllIllIII()));
                int n = dataInputStream.readInt();
                class_1071 class_10712 = this.lllIlIIlIIIlIlIIIllIlllIl.lIIIlIllllIlllIIIIIllIIIl;
                if (!(class_10712 instanceof class_0610)) return;
                ((class_0610)class_10712).IlIIIIIllllllIIlllIllllll(n);
                return;
            }
            catch (Exception exception) {
                IlIllllllIIlIIllllIIlIIIl.error("Couldn't select trade", (Throwable)exception);
            }
            return;
        } else if ("MC|AdvCdm".equals(class_09172.IlIllllllIIlIIllllIIlIIIl())) {
            if (!this.lIlllIlllIIIIlIIlllIllIII.llIlIIlllIIIIIllIIlIlIIII()) {
                this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(new ChatComponentTranslation("advMode.notEnabled", new Object[0]));
                return;
            } else if (this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(2, "") && this.lllIlIIlIIIlIlIIIllIlllIl.lIIlIlIlIlIllIIlIIllllIll.lIlllIlllIIIIlIIlllIllIII) {
                class_0181 class_01814 = new class_0181(Unpooled.wrappedBuffer((byte[])class_09172.lIlllIlllIIIIlIIlllIllIII()));
                try {
                    Object object;
                    byte by = class_01814.readByte();
                    class_0484 class_04842 = null;
                    if (by == 0) {
                        object = this.lllIlIIlIIIlIlIIIllIlllIl.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl(class_01814.readInt(), class_01814.readInt(), class_01814.readInt());
                        if (object instanceof class_1345) {
                            class_04842 = ((class_1345)object).lllIIIllIIIIlllIlIIllIIll();
                        }
                    } else if (by == 1 && (object = this.lllIlIIlIIIlIlIIIllIlllIl.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(class_01814.readInt())) instanceof class_2200) {
                        class_04842 = ((class_2200)object).IlIIIIIllllllIIlllIllllll();
                    }
                    object = class_01814.IlIllllllIIlIIllllIIlIIIl(class_01814.readableBytes());
                    if (class_04842 == null) return;
                    class_04842.lllIIIllIIIIlllIlIIllIIll((String)object);
                    class_04842.lIlllIlllIIIIlIIlllIllIII();
                    this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(new ChatComponentTranslation("advMode.setCommand.success", object));
                    return;
                }
                catch (Exception exception) {
                    IlIllllllIIlIIllllIIlIIIl.error("Couldn't set command block", (Throwable)exception);
                    return;
                }
                finally {
                    class_01814.release();
                }
            } else {
                this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(new ChatComponentTranslation("advMode.notAllowed", new Object[0]));
            }
            return;
        } else if ("MC|Beacon".equals(class_09172.IlIllllllIIlIIllllIIlIIIl())) {
            if (!(this.lllIlIIlIIIlIlIIIllIlllIl.lIIIlIllllIlllIIIIIllIIIl instanceof class_1410)) return;
            try {
                DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(class_09172.lIlllIlllIIIIlIIlllIllIII()));
                int n = dataInputStream.readInt();
                int n2 = dataInputStream.readInt();
                class_1410 class_14102 = (class_1410)this.lllIlIIlIIIlIlIIIllIlllIl.lIIIlIllllIlllIIIIIllIIIl;
                class_1291 class_12912 = class_14102.lllIIIllIIIIlllIlIIllIIll(0);
                if (!class_12912.lllIlIIlIIIlIlIIIllIlllIl()) return;
                class_12912.lllIIIllIIIIlllIlIIllIIll(1);
                class_0396 class_03962 = class_14102.lllIIIllIIIIlllIlIIllIIll();
                class_03962.lllIlIIlIIIlIlIIIllIlllIl(n);
                class_03962.IlIllllllIIlIIllllIIlIIIl(n2);
                class_03962.llIIlIllIllllIlIIIIlIIlll();
                return;
            }
            catch (Exception exception) {
                IlIllllllIIlIIllllIIlIIIl.error("Couldn't set beacon", (Throwable)exception);
            }
            return;
        } else {
            if (!"MC|ItemName".equals(class_09172.IlIllllllIIlIIllllIIlIIIl()) || !(this.lllIlIIlIIIlIlIIIllIlllIl.lIIIlIllllIlllIIIIIllIIIl instanceof class_0631)) return;
            class_0631 class_06312 = (class_0631)this.lllIlIIlIIIlIlIIIllIlllIl.lIIIlIllllIlllIIIIIllIIIl;
            if (class_09172.lIlllIlllIIIIlIIlllIllIII() != null && class_09172.lIlllIlllIIIIlIIlllIllIII().length >= 1) {
                String string = class_1395.lllIIIllIIIIlllIlIIllIIll(new String(class_09172.lIlllIlllIIIIlIIlllIllIII(), Charsets.UTF_8));
                if (string.length() > 30) return;
                class_06312.lllIIIllIIIIlllIlIIllIIll(string);
                return;
            } else {
                class_06312.lllIIIllIIIIlllIlIIllIIll("");
            }
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0546 class_05462, class_0546 class_05463) {
        if (class_05463 != class_0546.lllIlIIlIIIlIlIIIllIlllIl) {
            throw new IllegalStateException("Unexpected change in protocol!");
        }
    }
}

