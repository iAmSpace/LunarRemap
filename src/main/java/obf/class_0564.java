package obf;/*
 * Decompiled with CFR 0.150.
 */
import com.moonsworth.lunar.client.LunarClient;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import optifine.Config;
import net.minecraft.crash.CrashReport;
import net.minecraft.profiler.Profiler;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class class_0564
extends class_1334 {
    private class_1764 IlIlIIlllIllllllllIIIlIlI;
    private class_0695 llllIIIIlIIIlIIIIIIlIllll;
    private class_1890 llIIIIllIIIIIIIlIIIlIIIIl = new class_1890();
    private Set IIllIllIIllIIlllIIIlIlllI = new HashSet();
    private Set llllllIlIllllIlIlIlIIIIlI = new HashSet();
    private final Minecraft lIlIIllllIlIIIIllIIIIlIIl = Minecraft.getMinecraft();
    private final Set llIlllIIllIlllIlIlIlIIIll = new HashSet();
    public boolean lllIIIllIIIIlllIlIIllIIll = false;

    public class_0564(class_1764 class_17642, class_1078 class_10782, int n, class_1999 class_19992, Profiler class_12422) {
        super((class_0028)new class_0069(), "MpServer", class_1163.lllIIIllIIIIlllIlIIllIIll(n), class_10782, class_12422);
        this.IlIlIIlllIllllllllIIIlIlI = class_17642;
        this.IlIlIIlIlIllIIlIlIIllIIIl = class_19992;
        this.llIIlIllIllllIlIIIIlIIlll = class_17642.lllIIIllIIIIlllIlIIllIIll;
        this.IlIIIlIIIIllIIIllIIIIIIll(8, 64, 8);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll() {
        super.lllIIIllIIIIlllIlIIllIIll();
        this.lllIlIIlIIIlIlIIIllIlllIl(this.IlIIIlIIIIllIIIllIIIIIIll() + 1L);
        if (this.IlIIlllllIIlIlIlllllIllll().lllIlIIlIIIlIlIIIllIlllIl("doDaylightCycle")) {
            this.lllIIIllIIIIlllIlIIllIIll(this.IIlllIlIlllIllIIIlllIIlIl() + 1L);
        }
        this.IlIIlllllIIlIlIlllllIllll.startSection("reEntryProcessing");
        for (int i = 0; i < 10 && !this.llllllIlIllllIlIlIlIIIIlI.isEmpty(); ++i) {
            class_1521 class_15212 = (class_1521)this.llllllIlIllllIlIlIlIIIIlI.iterator().next();
            this.llllllIlIllllIlIlIlIIIIlI.remove(class_15212);
            if (this.IlIllllllIIlIIllllIIlIIIl.contains(class_15212)) continue;
            this.lllIIIllIIIIlllIlIIllIIll(class_15212);
        }
        this.IlIIlllllIIlIlIlllllIllll.endStartSection("connection");
        this.IlIlIIlllIllllllllIIIlIlI.lllIIIllIIIIlllIlIIllIIll();
        this.IlIIlllllIIlIlIlllllIllll.endStartSection("chunkCache");
        this.llllIIIIlIIIlIIIIIIlIllll.lllIlIIlIIIlIlIIIllIlllIl();
        this.IlIIlllllIIlIlIlllllIllll.endStartSection("blocks");
        this.p_();
        this.IlIIlllllIIlIlIlllllIllll.endSection();
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4, int n5, int n6) {
    }

    @Override
    protected class_1848 lllIlIIlIIIlIlIIIllIlllIl() {
        this.llllIIIIlIIIlIIIIIIlIllll = new class_0695(this);
        return this.llllIIIIlIIIlIIIIIIlIllll;
    }

    @Override
    protected void p_() {
        super.p_();
        this.llIlllIIllIlllIlIlIlIIIll.retainAll(this.IIIIIIIIlIllIIllIIlllIllI);
        if (this.llIlllIIllIlllIlIlIlIIIll.size() == this.IIIIIIIIlIllIIllIIlllIllI.size()) {
            this.llIlllIIllIlllIlIlIlIIIll.clear();
        }
        int n = 0;
        for (class_1108 class_11082 : this.IIIIIIIIlIllIIllIIlllIllI) {
            if (this.llIlllIIllIlllIlIlIlIIIll.contains(class_11082)) continue;
            int n2 = class_11082.lllIIIllIIIIlllIlIIllIIll * 16;
            int n3 = class_11082.lllIlIIlIIIlIlIIIllIlllIl * 16;
            this.IlIIlllllIIlIlIlllllIllll.startSection("getChunk");
            class_0723 class_07232 = this.IlIIIIIllllllIIlllIllllll(class_11082.lllIIIllIIIIlllIlIIllIIll, class_11082.lllIlIIlIIIlIlIIIllIlllIl);
            this.lllIIIllIIIIlllIlIIllIIll(n2, n3, class_07232);
            this.IlIIlllllIIlIlIlllllIllll.endSection();
            this.llIlllIIllIlllIlIlIlIIIll.add(class_11082);
            if (++n < 10) continue;
            return;
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, boolean bl) {
        if (bl) {
            this.llllIIIIlIIIlIIIIIIlIllll.IlIllllllIIlIIllllIIlIIIl(n, n2);
        } else {
            this.llllIIIIlIIIlIIIIIIlIllll.lllIlIIlIIIlIlIIIllIlllIl(n, n2);
        }
        if (!bl) {
            this.IlIllllllIIlIIllllIIlIIIl(n * 16, 0, n2 * 16, n * 16 + 15, 256, n2 * 16 + 15);
        }
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212) {
        boolean bl = super.lllIIIllIIIIlllIlIIllIIll(class_15212);
        this.IIllIllIIllIIlllIIIlIlllI.add(class_15212);
        if (!bl) {
            this.llllllIlIllllIlIlIlIIIIlI.add(class_15212);
        } else if (class_15212 instanceof class_1860) {
            this.lIlIIllllIlIIIIllIIIIlIIl.IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(new class_1196((class_1860)class_15212));
        }
        return bl;
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_1521 class_15212) {
        super.lllIlIIlIIIlIlIIIllIlllIl(class_15212);
        this.IIllIllIIllIIlllIIIlIlllI.remove(class_15212);
    }

    @Override
    protected void IlIllllllIIlIIllllIIlIIIl(class_1521 class_15212) {
        super.IlIllllllIIlIIllllIIlIIIl(class_15212);
        if (this.llllllIlIllllIlIlIlIIIIlI.contains(class_15212)) {
            this.llllllIlIllllIlIlIlIIIIlI.remove(class_15212);
        }
    }

    @Override
    protected void lIlllIlllIIIIlIIlllIllIII(class_1521 class_15212) {
        super.lIlllIlllIIIIlIIlllIllIII(class_15212);
        boolean bl = false;
        if (this.IIllIllIIllIIlllIIIlIlllI.contains(class_15212)) {
            if (class_15212.IlllIIlllllllIIllIlIllllI()) {
                this.llllllIlIllllIlIlIlIIIIlI.add(class_15212);
                bl = true;
            } else {
                this.IIllIllIIllIIlllIIIlIlllI.remove(class_15212);
            }
        }
        if (class_2114.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(class_15212).lllIIIllIIIIlllIlIIllIIll() && !bl) {
            this.lIlIIllllIlIIIIllIIIIlIIl.IllIIIllIIIIlIlIlIllIIlll.lIlllIlllIIIIlIIlllIllIII();
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n, class_1521 class_15212) {
        class_1521 class_15213 = this.lllIIIllIIIIlllIlIIllIIll(n);
        if (class_15213 != null) {
            this.lllIlIIlIIIlIlIIIllIlllIl(class_15213);
        }
        this.IIllIllIIllIIlllIIIlIlllI.add(class_15212);
        class_15212.lIlllIlllIIIIlIIlllIllIII(n);
        if (!this.lllIIIllIIIIlllIlIIllIIll(class_15212)) {
            this.llllllIlIllllIlIlIlIIIIlI.add(class_15212);
        }
        this.llIIIIllIIIIIIIlIIIlIIIIl.lllIIIllIIIIlllIlIIllIIll(n, class_15212);
        if (class_2114.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(class_15212).lllIIIllIIIIlllIlIIllIIll()) {
            this.lIlIIllllIlIIIIllIIIIlIIl.IllIIIllIIIIlIlIlIllIIlll.lIlllIlllIIIIlIIlllIllIII();
        }
    }

    @Override
    public class_1521 lllIIIllIIIIlllIlIIllIIll(int n) {
        return n == this.lIlIIllllIlIIIIllIIIIlIIl.lIIIIlIlIIlllllIIllIIlIII.llllllIlIllllIlIlIlIIIIlI() ? this.lIlIIllllIlIIIIllIIIIlIIl.lIIIIlIlIIlllllIIllIIlIII : (class_1521)this.llIIIIllIIIIIIIlIIIlIIIIl.lllIIIllIIIIlllIlIIllIIll(n);
    }

    public class_1521 lllIlIIlIIIlIlIIIllIlllIl(int n) {
        class_1521 class_15212 = (class_1521)this.llIIIIllIIIIIIIlIIIlIIIIl.lIlllIlllIIIIlIIlllIllIII(n);
        if (class_15212 != null) {
            this.IIllIllIIllIIlllIIIlIlllI.remove(class_15212);
            this.lllIlIIlIIIlIlIIIllIlllIl(class_15212);
        }
        return class_15212;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, Block class_05492, int n4) {
        this.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n, n2, n3);
        return super.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, class_05492, n4, 3);
    }

    @Override
    public void q_() {
        LunarClient.getInstance().getEventBus().callEvent(new class_0780());
        this.IlIlIIlllIllllllllIIIlIlI.IlIllllllIIlIIllllIIlIIIl().lllIIIllIIIIlllIlIIllIIll(new class_0722("Quitting"));
    }

    @Override
    protected void IlIIIIIllllllIIlllIllllll() {
        super.IlIIIIIllllllIIlllIllllll();
    }

    public void lIllllIIlIIIlIllllllIIIll() {
        if (!this.IlIlIIlllIIlIllIIIlllllIl.IIIllIIlIIIIIIlIlIIllIIlI) {
            // empty if block
        }
    }

    @Override
    protected int IIIllIIlIIIIIIlIlIIllIIlI() {
        return this.lIlIIllllIlIIIIllIIIIlIIl.gameSettings.IlIllllllIIlIIllllIIlIIIl;
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        int n4 = 16;
        Random random = new Random();
        for (int i = 0; i < 1000; ++i) {
            int n5;
            int n6;
            int n7 = n + this.lllllIlllIIllIlIIlIIIllII.nextInt(n4) - this.lllllIlllIIllIlIIlIIIllII.nextInt(n4);
            Block class_05492 = this.a_(n7, n6 = n2 + this.lllllIlllIIllIlIIlIIIllII.nextInt(n4) - this.lllllIlllIIllIlIIlIIIllII.nextInt(n4), n5 = n3 + this.lllllIlllIIllIlIIlIIIllII.nextInt(n4) - this.lllllIlllIIllIlIIlIIIllII.nextInt(n4));
            if (class_05492.lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll) {
                if (this.lllllIlllIIllIlIIlIIIllII.nextInt(8) <= n6 || !this.IlIlIIlllIIlIllIIIlllllIl.IllIIIllIIIIlIlIlIllIIlll()) continue;
                this.lllIIIllIIIIlllIlIIllIIll("depthsuspend", (double)((float)n7 + this.lllllIlllIIllIlIIlIIIllII.nextFloat()), (double)((float)n6 + this.lllllIlllIIllIlIIlIIIllII.nextFloat()), (double)((float)n5 + this.lllllIlllIIllIlIIlIIIllII.nextFloat()), 0.0, 0.0, 0.0);
                continue;
            }
            class_05492.lllIlIIlIIIlIlIIIllIlllIl((class_1334)this, n7, n6, n5, random);
        }
    }

    public void IllIIlllllllIIlIIlIIIIlIl() {
        int n;
        int n2;
        class_1521 class_15212;
        int n3;
        this.IlIllllllIIlIIllllIIlIIIl.removeAll(this.lIlllIlllIIIIlIIlllIllIII);
        for (n3 = 0; n3 < this.lIlllIlllIIIIlIIlllIllIII.size(); ++n3) {
            class_15212 = (class_1521)this.lIlllIlllIIIIlIIlllIllIII.get(n3);
            n2 = class_15212.lIlIIllIllIIIIIlIllllIIIl;
            n = class_15212.llIIIlIlIlIIlIllIIIllIlIl;
            if (!class_15212.IlIIllIlIlIllIIIlIIlIlIIl || !this.IlIllllllIIlIIllllIIlIIIl(n2, n)) continue;
            this.IlIIIIIllllllIIlllIllllll(n2, n).lllIlIIlIIIlIlIIIllIlllIl(class_15212);
        }
        for (n3 = 0; n3 < this.lIlllIlllIIIIlIIlllIllIII.size(); ++n3) {
            this.lIlllIlllIIIIlIIlllIllIII((class_1521)this.lIlllIlllIIIIlIIlllIllIII.get(n3));
        }
        this.lIlllIlllIIIIlIIlllIllIII.clear();
        for (n3 = 0; n3 < this.IlIllllllIIlIIllllIIlIIIl.size(); ++n3) {
            class_15212 = (class_1521)this.IlIllllllIIlIIllllIIlIIIl.get(n3);
            if (class_15212.IlIIIlIIIIllIIIllIIIIIIll != null) {
                if (!class_15212.IlIIIlIIIIllIIIllIIIIIIll.IllllIIIIlIIlIIIIlllIIIIl && class_15212.IlIIIlIIIIllIIIllIIIIIIll.lIlIlIIlIIIIlIIIIIlllIIII == class_15212) continue;
                class_15212.IlIIIlIIIIllIIIllIIIIIIll.lIlIlIIlIIIIlIIIIIlllIIII = null;
                class_15212.IlIIIlIIIIllIIIllIIIIIIll = null;
            }
            if (!class_15212.IllllIIIIlIIlIIIIlllIIIIl) continue;
            n2 = class_15212.lIlIIllIllIIIIIlIllllIIIl;
            n = class_15212.llIIIlIlIlIIlIllIIIllIlIl;
            if (class_15212.IlIIllIlIlIllIIIlIIlIlIIl && this.IlIllllllIIlIIllllIIlIIIl(n2, n)) {
                this.IlIIIIIllllllIIlllIllllll(n2, n).lllIlIIlIIIlIlIIIllIlllIl(class_15212);
            }
            this.IlIllllllIIlIIllllIIlIIIl.remove(n3--);
            this.lIlllIlllIIIIlIIlllIllIII(class_15212);
        }
    }

    @Override
    public class_0799 addWorldInfoToCrashReport(CrashReport class_02232) {
        class_0799 class_07992 = super.addWorldInfoToCrashReport(class_02232);
        return class_07992;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(double d, double d2, double d3, String string, float f, float f2, boolean bl) {
        double d4 = this.lIlIIllllIlIIIIllIIIIlIIl.llIIlllIllIllllIIIlIIIIII.lIllllIIlIIIlIllllllIIIll(d, d2, d3);
        class_0132 class_01322 = new class_0132(new ResourceLocation(string), f, f2, (float)d, (float)d2, (float)d3);
        if (bl && d4 > 100.0) {
            double d5 = Math.sqrt(d4) / 40.0;
            this.lIlIIllllIlIIIIllIIIIlIIl.IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_01322, (int)(d5 * 20.0));
        } else {
            this.lIlIIllllIlIIIIllIIIIlIIl.IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_01322);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(double d, double d2, double d3, double d4, double d5, double d6, class_0775 class_07752) {
        this.lIlIIllllIlIIIIllIIIIlIIl.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(new class_0128(this, d, d2, d3, d4, d5, d6, this.lIlIIllllIlIIIIllIIIIlIIl.lllIIlIIIllllllIIIIlIlIlI, class_07752));
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0141 class_01412) {
        this.llIIlIlIlllIIllIlIlllIllI = class_01412;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(long l) {
        if (l < 0L) {
            l = -l;
            this.IlIIlllllIIlIlIlllllIllll().lllIlIIlIIIlIlIIIllIlllIl("doDaylightCycle", "false");
        } else {
            this.IlIIlllllIIlIlIlllllIllll().lllIlIIlIIIlIlIIIllIlllIl("doDaylightCycle", "true");
        }
        super.lllIIIllIIIIlllIlIIllIIll(l);
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4) {
        int n5 = super.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n4);
        if (Config.lllIlIIllllIllIIIlIlIIIll()) {
            if (this.lllIIIllIIIIlllIlIIllIIll) {
                n5 = class_1825.lllIIIllIIIIlllIlIIllIIll((class_1521)this.lIlIIllllIlIIIIllIIIIlIIl.llIIlllIllIllllIIIlIIIIII, n5);
            }
            if (!this.a_(n, n2, n3).IlIlllIIIIIIlIIllIIllIlll()) {
                n5 = class_1825.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n5);
            }
        }
        return n5;
    }
}

