package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.crash.CrashReport;
import net.minecraft.item.Item;
import net.minecraft.network.play.server.*;
import net.minecraft.profiler.Profiler;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_0976
extends class_1334 {
    private static final Logger lllIIIllIIIIlllIlIIllIIll = LogManager.getLogger();
    private final class_0220 llIIIIllIIIIIIIlIIIlIIIIl;
    private final class_1105 IIllIllIIllIIlllIIIlIlllI;
    private final class_0636 llllllIlIllllIlIlIlIIIIlI;
    private Set lIlIIllllIlIIIIllIIIIlIIl;
    private TreeSet llIlllIIllIlllIlIlIlIIIll;
    public class_0769 IlIlIIlllIllllllllIIIlIlI;
    public boolean llllIIIIlIIIlIIIIIIlIllll;
    private boolean IIIIlIIlIIIllIIIIllIIIlII;
    private int lllIIIIIIlIlllIIlIlIIIllI;
    private final class_1403 llIIlIIllIIllIlIIllIIllII;
    private final class_0907 lIlIlIIIIIIlIIllllIlIIllI = new class_0907();
    private class_2156[] IllllIIIIlIIlIIIIlllIIIIl = new class_2156[]{new class_2156((Object)null), new class_2156((Object)null)};
    private int llllIlIIIIIIIIIlllIIlIIIl;
    private static final class_0425[] IIIIlIlIIlIIIIlIlllIlIIII = new class_0425[]{new class_0425(Items.llIllllIlIllIIIlIllIIlIlI, 0, 1, 3, 10), new class_0425(Item.getItemFromBlock(Blocks.lIllllIIlIIIlIllllllIIIll), 0, 1, 3, 10), new class_0425(Item.getItemFromBlock(Blocks.log), 0, 1, 3, 10), new class_0425(Items.lIlIlIIlIIIIlIIIIIlllIIII, 0, 1, 1, 3), new class_0425(Items.IlIlIIlIlIllIIlIlIIllIIIl, 0, 1, 1, 5), new class_0425(Items.stone_pickaxe, 0, 1, 1, 3), new class_0425(Items.wooden_pickaxe, 0, 1, 1, 5), new class_0425(Items.IlIIIIIllllllIIlllIllllll, 0, 2, 3, 5), new class_0425(Items.bread, 0, 2, 3, 3), new class_0425(Item.getItemFromBlock(Blocks.lIIlIIIIIlIlllIlIIlIlIlll), 0, 1, 3, 10)};
    private List lllIIIIlIlIIlIIlllIIIIIIl = new ArrayList();
    private class_1890 llIlIIlllIIIIIllIIlIlIIII;

    public class_0976(class_0220 class_02202, class_0028 class_00282, String string, int n, class_1078 class_10782, Profiler class_12422) {
        super(class_00282, string, class_10782, class_1163.lllIIIllIIIIlllIlIIllIIll(n), class_12422);
        this.llIIIIllIIIIIIIlIIIlIIIIl = class_02202;
        this.IIllIllIIllIIlllIIIlIlllI = new class_1105(this);
        this.llllllIlIllllIlIlIlIIIIlI = new class_0636(this);
        if (this.llIlIIlllIIIIIllIIlIlIIII == null) {
            this.llIlIIlllIIIIIllIIlIlIIII = new class_1890();
        }
        if (this.lIlIIllllIlIIIIllIIIIlIIl == null) {
            this.lIlIIllllIlIIIIllIIIIlIIl = new HashSet();
        }
        if (this.llIlllIIllIlllIlIlIlIIIll == null) {
            this.llIlllIIllIlllIlIlIlIIIll = new TreeSet();
        }
        this.llIIlIIllIIllIlIIllIIllII = new class_1403(this);
        this.llIIlIlIlllIIllIlIlllIllI = new class_2183(class_02202);
        class_0390 class_03902 = (class_0390)this.llIIlIllIllllIlIIIIlIIlll.lllIIIllIIIIlllIlIIllIIll(class_0390.class, "scoreboard");
        if (class_03902 == null) {
            class_03902 = new class_0390();
            this.llIIlIllIllllIlIIIIlIIlll.lllIIIllIIIIlllIlIIllIIll("scoreboard", class_03902);
        }
        class_03902.lllIIIllIIIIlllIlIIllIIll(this.llIIlIlIlllIIllIlIlllIllI);
        ((class_2183)this.llIIlIlIlllIIllIlIlllIllI).lllIIIllIIIIlllIlIIllIIll(class_03902);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll() {
        super.lllIIIllIIIIlllIlIIllIIll();
        if (this.lIlllIlllIlIIIIlllIlIlIIl().lIlIlIIlIIIIlIIIIIlllIIII() && this.IlIlIIlIlIllIIlIlIIllIIIl != class_1999.lIlllIlllIIIIlIIlllIllIII) {
            this.IlIlIIlIlIllIIlIlIIllIIIl = class_1999.lIlllIlllIIIIlIIlllIllIII;
        }
        this.IlIlIIlllIIlIllIIIlllllIl.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl();
        if (this.IIllIllIIllIIlllIIIlIlllI()) {
            if (this.IlIIlllllIIlIlIlllllIllll().lllIlIIlIIIlIlIIIllIlllIl("doDaylightCycle")) {
                long l = this.IIlllIlIlllIllIIIlllIIlIl.IIIllIIlIIIIIIlIlIIllIIlI() + 24000L;
                this.IIlllIlIlllIllIIIlllIIlIl.lllIlIIlIIIlIlIIIllIlllIl(l - l % 24000L);
            }
            this.llIIIIllIIIIIIIlIIIlIIIIl();
        }
        this.IlIIlllllIIlIlIlllllIllll.startSection("mobSpawner");
        if (this.IlIIlllllIIlIlIlllllIllll().lllIlIIlIIIlIlIIIllIlllIl("doMobSpawning")) {
            this.lIlIlIIIIIIlIIllllIlIIllI.lllIIIllIIIIlllIlIIllIIll(this, this.IIlIIlIlIlIllIIlIlIIIIlll, this.llIIIlllIlllIlIllIIIIllIl, this.IIlllIlIlllIllIIIlllIIlIl.lIllllIIlIIIlIllllllIIIll() % 400L == 0L);
        }
        this.IlIIlllllIIlIlIlllllIllll.endStartSection("chunkSource");
        this.lIlIlIIlIIIIlIIIIIlllIIII.lllIlIIlIIIlIlIIIllIlllIl();
        int n = this.lllIIIllIIIIlllIlIIllIIll(1.0f);
        if (n != this.IllIIlllllllIIlIIlIIIIlIl) {
            this.IllIIlllllllIIlIIlIIIIlIl = n;
        }
        this.IIlllIlIlllIllIIIlllIIlIl.lllIIIllIIIIlllIlIIllIIll(this.IIlllIlIlllIllIIIlllIIlIl.lIllllIIlIIIlIllllllIIIll() + 1L);
        if (this.IlIIlllllIIlIlIlllllIllll().lllIlIIlIIIlIlIIIllIlllIl("doDaylightCycle")) {
            this.IIlllIlIlllIllIIIlllIIlIl.lllIlIIlIIIlIlIIIllIlllIl(this.IIlllIlIlllIllIIIlllIIlIl.IIIllIIlIIIIIIlIlIIllIIlI() + 1L);
        }
        this.IlIIlllllIIlIlIlllllIllll.endStartSection("tickPending");
        this.lllIIIllIIIIlllIlIIllIIll(false);
        this.IlIIlllllIIlIlIlllllIllll.endStartSection("tickBlocks");
        this.p_();
        this.IlIIlllllIIlIlIlllllIllll.endStartSection("chunkMap");
        this.llllllIlIllllIlIlIlIIIIlI.lllIlIIlIIIlIlIIIllIlllIl();
        this.IlIIlllllIIlIlIlllllIllll.endStartSection("village");
        this.llIllllIlIllIIIlIllIIlIlI.lllIIIllIIIIlllIlIIllIIll();
        this.lIlllIlllIlIIIIlllIlIlIIl.lllIIIllIIIIlllIlIIllIIll();
        this.IlIIlllllIIlIlIlllllIllll.endStartSection("portalForcer");
        this.llIIlIIllIIllIlIIllIIllII.lllIIIllIIIIlllIlIIllIIll(this.IlIIIlIIIIllIIIllIIIIIIll());
        this.IlIIlllllIIlIlIlllllIllll.endSection();
        this.lllIIIIlIlIIlIIlllIIIIIIl();
    }

    public class_0920 lllIIIllIIIIlllIlIIllIIll(class_1012 class_10122, int n, int n2, int n3) {
        List list = this.llIIlIllIllllIlIIIIlIIlll().lllIIIllIIIIlllIlIIllIIll(class_10122, n, n2, n3);
        return list != null && !list.isEmpty() ? (class_0920)class_0242.lllIIIllIIIIlllIlIIllIIll(this.lllllIlllIIllIlIIlIIIllII, list) : null;
    }

    @Override
    public void llIIlIlIlllIIllIlIlllIllI() {
        this.IIIIlIIlIIIllIIIIllIIIlII = !this.lIllllIIlIIIlIllllllIIIll.isEmpty();
        for (class_0814 class_08142 : this.lIllllIIlIIIlIllllllIIIll) {
            if (class_08142.IIIIIllIIlIlIlIIlIlIlIllI()) continue;
            this.IIIIlIIlIIIllIIIIllIIIlII = false;
            break;
        }
    }

    protected void llIIIIllIIIIIIIlIIIlIIIIl() {
        this.IIIIlIIlIIIllIIIIllIIIlII = false;
        for (class_0814 class_08142 : this.lIllllIIlIIIlIllllllIIIll) {
            if (!class_08142.IIIIIllIIlIlIlIIlIlIlIllI()) continue;
            class_08142.lllIIIllIIIIlllIlIIllIIll(false, false, true);
        }
        this.IIIIlIlIIlIIIIlIlllIlIIII();
    }

    private void IIIIlIlIIlIIIIlIlllIlIIII() {
        this.IIlllIlIlllIllIIIlllIIlIl.lIllllIIlIIIlIllllllIIIll(0);
        this.IIlllIlIlllIllIIIlllIIlIl.lllIlIIlIIIlIlIIIllIlllIl(false);
        this.IIlllIlIlllIllIIIlllIIlIl.IlIIIIIllllllIIlllIllllll(0);
        this.IIlllIlIlllIllIIIlllIIlIl.lllIIIllIIIIlllIlIIllIIll(false);
    }

    public boolean IIllIllIIllIIlllIIIlIlllI() {
        if (this.IIIIlIIlIIIllIIIIllIIIlII && !this.IllIIIIllIIllIllIlllIlIIl) {
            class_0814 class_08142;
            Iterator iterator = this.lIllllIIlIIIlIllllllIIIll.iterator();
            do {
                if (iterator.hasNext()) continue;
                return true;
            } while ((class_08142 = (class_0814)iterator.next()).IIIIlIIIllIIIlIIlIIIIIlll());
            return false;
        }
        return false;
    }

    @Override
    public void IllIIIllIIIIlIlIlIllIIlll() {
        if (this.IIlllIlIlllIllIIIlllIIlIl.lIlllIlllIIIIlIIlllIllIII() <= 0) {
            this.IIlllIlIlllIllIIIlllIIlIl.lllIlIIlIIIlIlIIIllIlllIl(64);
        }
        int n = this.IIlllIlIlllIllIIIlllIIlIl.IlIllllllIIlIIllllIIlIIIl();
        int n2 = this.IIlllIlIlllIllIIIlllIIlIl.IlIIIIIllllllIIlllIllllll();
        int n3 = 0;
        while (this.lllIlIIlIIIlIlIIIllIlllIl(n, n2).lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll) {
            n += this.lllllIlllIIllIlIIlIIIllII.nextInt(8) - this.lllllIlllIIllIlIIlIIIllII.nextInt(8);
            n2 += this.lllllIlllIIllIlIIlIIIllII.nextInt(8) - this.lllllIlllIIllIlIIlIIIllII.nextInt(8);
            if (++n3 != 10000) continue;
        }
        this.IIlllIlIlllIllIIIlllIIlIl.lllIIIllIIIIlllIlIIllIIll(n);
        this.IIlllIlIlllIllIIIlllIIlIl.IlIllllllIIlIIllllIIlIIIl(n2);
    }

    @Override
    protected void p_() {
        super.p_();
        int n = 0;
        int n2 = 0;
        for (class_1108 class_11082 : this.IIIIIIIIlIllIIllIIlllIllI) {
            int n3;
            int n4;
            int n5;
            int n6;
            int n7 = class_11082.lllIIIllIIIIlllIlIIllIIll * 16;
            int n8 = class_11082.lllIlIIlIIIlIlIIIllIlllIl * 16;
            this.IlIIlllllIIlIlIlllllIllll.startSection("getChunk");
            class_0723 class_07232 = this.IlIIIIIllllllIIlllIllllll(class_11082.lllIIIllIIIIlllIlIIllIIll, class_11082.lllIlIIlIIIlIlIIIllIlllIl);
            this.lllIIIllIIIIlllIlIIllIIll(n7, n8, class_07232);
            this.IlIIlllllIIlIlIlllllIllll.endStartSection("tickChunk");
            class_07232.lllIlIIlIIIlIlIIIllIlllIl(false);
            this.IlIIlllllIIlIlIlllllIllll.endStartSection("thunder");
            if (this.lllllIlllIIllIlIIlIIIllII.nextInt(100000) == 0 && this.IIIIIIIIlIllIIllIIlllIllI() && this.IllIIIIllIIllIllIlllIlIIl()) {
                this.IIIllIllIIlIlIlIlIllllIIl = this.IIIllIllIIlIlIlIlIllllIIl * 3 + 1013904223;
                n6 = this.IIIllIllIIlIlIlIlIllllIIl >> 2;
                n5 = n7 + (n6 & 0xF);
                n4 = n8 + (n6 >> 8 & 0xF);
                n3 = this.IllIIlllllllIIlIIlIIIIlIl(n5, n4);
                if (this.IIlllIlIlllIllIIIlllIIlIl(n5, n3, n4)) {
                    this.lIllllIIlIIIlIllllllIIIll(new class_0411(this, n5, n3, n4));
                }
            }
            this.IlIIlllllIIlIlIlllllIllll.endStartSection("iceandsnow");
            if (this.lllllIlllIIllIlIIlIIIllII.nextInt(16) == 0) {
                Object object;
                this.IIIllIllIIlIlIlIlIllllIIl = this.IIIllIllIIlIlIlIlIllllIIl * 3 + 1013904223;
                n6 = this.IIIllIllIIlIlIlIlIllllIIl >> 2;
                n5 = n6 & 0xF;
                n4 = n6 >> 8 & 0xF;
                n3 = this.IllIIlllllllIIlIIlIIIIlIl(n5 + n7, n4 + n8);
                if (this.IlIlIIlIlIllIIlIlIIllIIIl(n5 + n7, n3 - 1, n4 + n8)) {
                    this.lllIIIllIIIIlllIlIIllIIll(n5 + n7, n3 - 1, n4 + n8, Blocks.IllIIllIlIlllIllIllIlIIIl);
                }
                if (this.IIIIIIIIlIllIIllIIlllIllI() && this.IlIIIIIllllllIIlllIllllll(n5 + n7, n3, n4 + n8, true)) {
                    this.lllIIIllIIIIlllIlIIllIIll(n5 + n7, n3, n4 + n8, Blocks.lIIllIIlIIIlllIlllIIlIIlI);
                }
                if (this.IIIIIIIIlIllIIllIIlllIllI() && ((class_0672)(object = this.a_(n5 + n7, n4 + n8))).IlIIIIIllllllIIlllIllllll()) {
                    this.a_(n5 + n7, n3 - 1, n4 + n8).IIIllIllIIlIlIlIlIllllIIl(this, n5 + n7, n3 - 1, n4 + n8);
                }
            }
            this.IlIIlllllIIlIlIlllllIllll.endStartSection("tickBlocks");
            for (class_1532 class_15322 : class_07232.lllIlIIlIIIlIlIIIllIlllIl()) {
                if (class_15322 == null || !class_15322.lllIlIIlIIIlIlIIIllIlllIl()) continue;
                for (int i = 0; i < 3; ++i) {
                    this.IIIllIllIIlIlIlIlIllllIIl = this.IIIllIllIIlIlIlIlIllllIIl * 3 + 1013904223;
                    int n9 = this.IIIllIllIIlIlIlIlIllllIIl >> 2;
                    int n10 = n9 & 0xF;
                    int n11 = n9 >> 8 & 0xF;
                    int n12 = n9 >> 16 & 0xF;
                    ++n2;
                    Block class_05492 = class_15322.lllIIIllIIIIlllIlIIllIIll(n10, n12, n11);
                    if (!class_05492.llIIllIllIlIIlIIllIllllll()) continue;
                    ++n;
                    class_05492.lllIIIllIIIIlllIlIIllIIll((class_1334)this, n10 + n7, n12 + class_15322.IlIllllllIIlIIllllIIlIIIl(), n11 + n8, this.lllllIlllIIllIlIIlIIIllII);
                }
            }
            this.IlIIlllllIIlIlIlllllIllll.endSection();
        }
    }

    @Override
    public boolean IlIIIIIllllllIIlllIllllll(int n, int n2, int n3, Block class_05492) {
        class_1505 class_15052 = new class_1505(n, n2, n3, class_05492);
        return this.lllIIIIlIlIIlIIlllIIIIIIl.contains(class_15052);
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl(int n, int n2, int n3, Block class_05492, int n4) {
        this.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3, class_05492, n4, 0);
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, int n3, Block class_05492, int n4, int n5) {
        class_1505 class_15052 = new class_1505(n, n2, n3, class_05492);
        int n6 = 0;
        if (this.lllIlIIlIIIlIlIIIllIlllIl && class_05492.lIllllIIlIIIlIllllllIIIll() != class_1855.lllIIIllIIIIlllIlIIllIIll) {
            if (class_05492.llIIIIllIIIIIIIlIIIlIIIIl()) {
                Block class_05493;
                n6 = 8;
                if (this.lllIlIIlIIIlIlIIIllIlllIl(class_15052.lllIIIllIIIIlllIlIIllIIll - n6, class_15052.lllIlIIlIIIlIlIIIllIlllIl - n6, class_15052.IlIllllllIIlIIllllIIlIIIl - n6, class_15052.lllIIIllIIIIlllIlIIllIIll + n6, class_15052.lllIlIIlIIIlIlIIIllIlllIl + n6, class_15052.IlIllllllIIlIIllllIIlIIIl + n6) && (class_05493 = this.a_(class_15052.lllIIIllIIIIlllIlIIllIIll, class_15052.lllIlIIlIIIlIlIIIllIlllIl, class_15052.IlIllllllIIlIIllllIIlIIIl)).lIllllIIlIIIlIllllllIIIll() != class_1855.lllIIIllIIIIlllIlIIllIIll && class_05493 == class_15052.lllIIIllIIIIlllIlIIllIIll()) {
                    class_05493.lllIIIllIIIIlllIlIIllIIll((class_1334)this, class_15052.lllIIIllIIIIlllIlIIllIIll, class_15052.lllIlIIlIIIlIlIIIllIlllIl, class_15052.IlIllllllIIlIIllllIIlIIIl, this.lllllIlllIIllIlIIlIIIllII);
                }
                return;
            }
            n4 = 1;
        }
        if (this.lllIlIIlIIIlIlIIIllIlllIl(n - n6, n2 - n6, n3 - n6, n + n6, n2 + n6, n3 + n6)) {
            if (class_05492.lIllllIIlIIIlIllllllIIIll() != class_1855.lllIIIllIIIIlllIlIIllIIll) {
                class_15052.lllIIIllIIIIlllIlIIllIIll((long)n4 + this.IIlllIlIlllIllIIIlllIIlIl.lIllllIIlIIIlIllllllIIIll());
                class_15052.lllIIIllIIIIlllIlIIllIIll(n5);
            }
            if (!this.lIlIIllllIlIIIIllIIIIlIIl.contains(class_15052)) {
                this.lIlIIllllIlIIIIllIIIIlIIl.add(class_15052);
                this.llIlllIIllIlllIlIlIlIIIll.add(class_15052);
            }
        }
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl(int n, int n2, int n3, Block class_05492, int n4, int n5) {
        class_1505 class_15052 = new class_1505(n, n2, n3, class_05492);
        class_15052.lllIIIllIIIIlllIlIIllIIll(n5);
        if (class_05492.lIllllIIlIIIlIllllllIIIll() != class_1855.lllIIIllIIIIlllIlIIllIIll) {
            class_15052.lllIIIllIIIIlllIlIIllIIll((long)n4 + this.IIlllIlIlllIllIIIlllIIlIl.lIllllIIlIIIlIllllllIIIll());
        }
        if (!this.lIlIIllllIlIIIIllIIIIlIIl.contains(class_15052)) {
            this.lIlIIllllIlIIIIllIIIIlIIl.add(class_15052);
            this.llIlllIIllIlllIlIlIlIIIll.add(class_15052);
        }
    }

    @Override
    public void lllIIlIIIllllllIIIIlIlIlI() {
        if (this.lIllllIIlIIIlIllllllIIIll.isEmpty()) {
            if (this.lllIIIIIIlIlllIIlIlIIIllI++ >= 1200) {
                return;
            }
        } else {
            this.llllllIlIllllIlIlIlIIIIlI();
        }
        super.lllIIlIIIllllllIIIIlIlIlI();
    }

    public void llllllIlIllllIlIlIlIIIIlI() {
        this.lllIIIIIIlIlllIIlIlIIIllI = 0;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(boolean bl) {
        class_1505 class_15052;
        int n = this.llIlllIIllIlllIlIlIlIIIll.size();
        if (n != this.lIlIIllllIlIIIIllIIIIlIIl.size()) {
            throw new IllegalStateException("TickNextTick list out of synch");
        }
        if (n > 1000) {
            n = 1000;
        }
        this.IlIIlllllIIlIlIlllllIllll.startSection("cleaning");
        for (int i = 0; i < n; ++i) {
            class_15052 = (class_1505)this.llIlllIIllIlllIlIlIlIIIll.first();
            if (!bl && class_15052.lIlllIlllIIIIlIIlllIllIII > this.IIlllIlIlllIllIIIlllIIlIl.lIllllIIlIIIlIllllllIIIll()) break;
            this.llIlllIIllIlllIlIlIlIIIll.remove(class_15052);
            this.lIlIIllllIlIIIIllIIIIlIIl.remove(class_15052);
            this.lllIIIIlIlIIlIIlllIIIIIIl.add(class_15052);
        }
        this.IlIIlllllIIlIlIlllllIllll.endSection();
        this.IlIIlllllIIlIlIlllllIllll.startSection("ticking");
        Iterator iterator = this.lllIIIIlIlIIlIIlllIIIIIIl.iterator();
        while (iterator.hasNext()) {
            class_15052 = (class_1505)iterator.next();
            iterator.remove();
            int n2 = 0;
            if (this.lllIlIIlIIIlIlIIIllIlllIl(class_15052.lllIIIllIIIIlllIlIIllIIll - n2, class_15052.lllIlIIlIIIlIlIIIllIlllIl - n2, class_15052.IlIllllllIIlIIllllIIlIIIl - n2, class_15052.lllIIIllIIIIlllIlIIllIIll + n2, class_15052.lllIlIIlIIIlIlIIIllIlllIl + n2, class_15052.IlIllllllIIlIIllllIIlIIIl + n2)) {
                Block class_05492 = this.a_(class_15052.lllIIIllIIIIlllIlIIllIIll, class_15052.lllIlIIlIIIlIlIIIllIlllIl, class_15052.IlIllllllIIlIIllllIIlIIIl);
                if (class_05492.lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll || !Block.lllIIIllIIIIlllIlIIllIIll(class_05492, class_15052.lllIIIllIIIIlllIlIIllIIll())) continue;
                try {
                    class_05492.lllIIIllIIIIlllIlIIllIIll((class_1334)this, class_15052.lllIIIllIIIIlllIlIIllIIll, class_15052.lllIlIIlIIIlIlIIIllIlllIl, class_15052.IlIllllllIIlIIllllIIlIIIl, this.lllllIlllIIllIlIIlIIIllII);
                    continue;
                }
                catch (Throwable throwable) {
                    int n3;
                    CrashReport class_02232 = CrashReport.lllIIIllIIIIlllIlIIllIIll(throwable, "Exception while ticking a block");
                    class_0799 class_07992 = class_02232.lllIIIllIIIIlllIlIIllIIll("net.minecraft.block.Block being ticked");
                    try {
                        n3 = this.IlIllllllIIlIIllllIIlIIIl(class_15052.lllIIIllIIIIlllIlIIllIIll, class_15052.lllIlIIlIIIlIlIIIllIlllIl, class_15052.IlIllllllIIlIIllllIIlIIIl);
                    }
                    catch (Throwable throwable2) {
                        n3 = -1;
                    }
                    class_0799.lllIIIllIIIIlllIlIIllIIll(class_07992, class_15052.lllIIIllIIIIlllIlIIllIIll, class_15052.lllIlIIlIIIlIlIIIllIlllIl, class_15052.IlIllllllIIlIIllllIIlIIIl, class_05492, n3);
                    throw new class_0892(class_02232);
                }
            }
            this.IlIllllllIIlIIllllIIlIIIl(class_15052.lllIIIllIIIIlllIlIIllIIll, class_15052.lllIlIIlIIIlIlIIIllIlllIl, class_15052.IlIllllllIIlIIllllIIlIIIl, class_15052.lllIIIllIIIIlllIlIIllIIll(), 0);
        }
        this.IlIIlllllIIlIlIlllllIllll.endSection();
        this.lllIIIIlIlIIlIIlllIIIIIIl.clear();
        return !this.llIlllIIllIlllIlIlIlIIIll.isEmpty();
    }

    @Override
    public List lllIIIllIIIIlllIlIIllIIll(class_0723 class_07232, boolean bl) {
        ArrayList<class_1505> arrayList = null;
        class_1108 class_11082 = class_07232.IllIIIllIIIIlIlIlIllIIlll();
        int n = (class_11082.lllIIIllIIIIlllIlIIllIIll << 4) - 2;
        int n2 = n + 16 + 2;
        int n3 = (class_11082.lllIlIIlIIIlIlIIIllIlllIl << 4) - 2;
        int n4 = n3 + 16 + 2;
        for (int i = 0; i < 2; ++i) {
            Iterator iterator;
            if (i == 0) {
                iterator = this.llIlllIIllIlllIlIlIlIIIll.iterator();
            } else {
                iterator = this.lllIIIIlIlIIlIIlllIIIIIIl.iterator();
                if (!this.lllIIIIlIlIIlIIlllIIIIIIl.isEmpty()) {
                    lllIIIllIIIIlllIlIIllIIll.debug("toBeTicked = " + this.lllIIIIlIlIIlIIlllIIIIIIl.size());
                }
            }
            while (iterator.hasNext()) {
                class_1505 class_15052 = (class_1505)iterator.next();
                if (class_15052.lllIIIllIIIIlllIlIIllIIll < n || class_15052.lllIIIllIIIIlllIlIIllIIll >= n2 || class_15052.IlIllllllIIlIIllllIIlIIIl < n3 || class_15052.IlIllllllIIlIIllllIIlIIIl >= n4) continue;
                if (bl) {
                    this.lIlIIllllIlIIIIllIIIIlIIl.remove(class_15052);
                    iterator.remove();
                }
                if (arrayList == null) {
                    arrayList = new ArrayList<class_1505>();
                }
                arrayList.add(class_15052);
            }
        }
        return arrayList;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, boolean bl) {
        if (!this.llIIIIllIIIIIIIlIIIlIIIIl.IllllIIIIlIIlIIIIlllIIIIl() && (class_15212 instanceof class_0003 || class_15212 instanceof class_1349)) {
            class_15212.IIIIlIIlIIIllIIIIllIIIlII();
        }
        if (!this.llIIIIllIIIIIIIlIIIlIIIIl.llllIlIIIIIIIIIlllIIlIIIl() && class_15212 instanceof class_0122) {
            class_15212.IIIIlIIlIIIllIIIIllIIIlII();
        }
        super.lllIIIllIIIIlllIlIIllIIll(class_15212, bl);
    }

    @Override
    protected class_1848 lllIlIIlIIIlIlIIIllIlllIl() {
        class_1831 class_18312 = this.IlIIIlIIIIllIIIllIIIIIIll.lllIIIllIIIIlllIlIIllIIll(this.IlIlIIlllIIlIllIIIlllllIl);
        this.IlIlIIlllIllllllllIIIlIlI = new class_0769(this, class_18312, this.IlIlIIlllIIlIllIIIlllllIl.IlIllllllIIlIIllllIIlIIIl());
        return this.IlIlIIlllIllllllllIIIlIlI;
    }

    public List lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4, int n5, int n6) {
        ArrayList<class_1774> arrayList = new ArrayList<class_1774>();
        for (int i = 0; i < this.IlIIIIIllllllIIlllIllllll.size(); ++i) {
            class_1774 class_17742 = (class_1774)this.IlIIIIIllllllIIlllIllllll.get(i);
            if (class_17742.lllIlIIlIIIlIlIIIllIlllIl < n || class_17742.IlIllllllIIlIIllllIIlIIIl < n2 || class_17742.lIlllIlllIIIIlIIlllIllIII < n3 || class_17742.lllIlIIlIIIlIlIIIllIlllIl >= n4 || class_17742.IlIllllllIIlIIllllIIlIIIl >= n5 || class_17742.lIlllIlllIIIIlIIlllIllIII >= n6) continue;
            arrayList.add(class_17742);
        }
        return arrayList;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_0814 class_08142, int n, int n2, int n3) {
        return !this.llIIIIllIIIIIIIlIIIlIIIIl.lllIIIllIIIIlllIlIIllIIll(this, n, n2, n3, class_08142);
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1078 class_10782) {
        if (this.llIlIIlllIIIIIllIIlIlIIII == null) {
            this.llIlIIlllIIIIIllIIlIlIIII = new class_1890();
        }
        if (this.lIlIIllllIlIIIIllIIIIlIIl == null) {
            this.lIlIIllllIlIIIIllIIIIlIIl = new HashSet();
        }
        if (this.llIlllIIllIlllIlIlIlIIIll == null) {
            this.llIlllIIllIlllIlIlIlIIIll = new TreeSet();
        }
        this.lllIlIIlIIIlIlIIIllIlllIl(class_10782);
        super.lllIIIllIIIIlllIlIIllIIll(class_10782);
    }

    protected void lllIlIIlIIIlIlIIIllIlllIl(class_1078 class_10782) {
        if (!this.IlIlIIlllIIlIllIIIlllllIl.IlIIIIIllllllIIlllIllllll()) {
            this.IIlllIlIlllIllIIIlllIIlIl.lllIIIllIIIIlllIlIIllIIll(0, this.IlIlIIlllIIlIllIIIlllllIl.IIIllIllIIlIlIlIlIllllIIl(), 0);
        } else {
            this.lIlIllIIlIIlIIlIIlIIlIIll = true;
            class_1076 class_10762 = this.IlIlIIlllIIlIllIIIlllllIl.IlIIIIIllllllIIlllIllllll;
            List list = class_10762.lllIIIllIIIIlllIlIIllIIll();
            Random random = new Random(this.lIlIlIIlIIIIlIIIIIlllIIII());
            class_2137 class_21372 = class_10762.lllIIIllIIIIlllIlIIllIIll(0, 0, 256, list, random);
            int n = 0;
            int n2 = this.IlIlIIlllIIlIllIIIlllllIl.IIIllIllIIlIlIlIlIllllIIl();
            int n3 = 0;
            if (class_21372 != null) {
                n = class_21372.lllIIIllIIIIlllIlIIllIIll;
                n3 = class_21372.IlIllllllIIlIIllllIIlIIIl;
            } else {
                lllIIIllIIIIlllIlIIllIIll.warn("Unable to find spawn biome");
            }
            int n4 = 0;
            while (!this.IlIlIIlllIIlIllIIIlllllIl.lllIIIllIIIIlllIlIIllIIll(n, n3)) {
                n += random.nextInt(64) - random.nextInt(64);
                n3 += random.nextInt(64) - random.nextInt(64);
                if (++n4 != 1000) continue;
            }
            this.IIlllIlIlllIllIIIlllIIlIl.lllIIIllIIIIlllIlIIllIIll(n, n2, n3);
            this.lIlIllIIlIIlIIlIIlIIlIIll = false;
            if (class_10782.IlIllllllIIlIIllllIIlIIIl()) {
                this.lIlIIllllIlIIIIllIIIIlIIl();
            }
        }
    }

    protected void lIlIIllllIlIIIIllIIIIlIIl() {
        int n;
        int n2;
        int n3;
        class_0247 class_02472 = new class_0247(IIIIlIlIIlIIIIlIlllIlIIII, 10);
        for (int i = 0; i < 10 && !class_02472.a_(this, this.lllllIlllIIllIlIIlIIIllII, n3 = this.IIlllIlIlllIllIIIlllIIlIl.IlIllllllIIlIIllllIIlIIIl() + this.lllllIlllIIllIlIIlIIIllII.nextInt(6) - this.lllllIlllIIllIlIIlIIIllII.nextInt(6), n2 = this.IIIllIllIIlIlIlIlIllllIIl(n3, n = this.IIlllIlIlllIllIIIlllIIlIl.IlIIIIIllllllIIlllIllllll() + this.lllllIlllIIllIlIIlIIIllII.nextInt(6) - this.lllllIlllIIllIlIIlIIIllII.nextInt(6)) + 1, n); ++i) {
        }
    }

    public class_2208 llIlllIIllIlllIlIlIlIIIll() {
        return this.IlIlIIlllIIlIllIIIlllllIl.IllIIlllllllIIlIIlIIIIlIl();
    }

    public void lllIIIllIIIIlllIlIIllIIll(boolean bl, class_1832 class_18322) {
        if (this.lIlIlIIlIIIIlIIIIIlllIIII.IlIllllllIIlIIllllIIlIIIl()) {
            if (class_18322 != null) {
                class_18322.lllIlIIlIIIlIlIIIllIlllIl("Saving level");
            }
            this.lIllllIIlIIIlIllllllIIIll();
            if (class_18322 != null) {
                class_18322.resetProgresAndWorkingMessage("Saving chunks");
            }
            this.lIlIlIIlIIIIlIIIIIlllIIII.lllIIIllIIIIlllIlIIllIIll(bl, class_18322);
            ArrayList arrayList = Lists.newArrayList((Iterable)this.IlIlIIlllIllllllllIIIlIlI.lIllllIIlIIIlIllllllIIIll());
            for (class_0723 class_07232 : arrayList) {
                if (class_07232 == null || this.llllllIlIllllIlIlIlIIIIlI.lllIIIllIIIIlllIlIIllIIll(class_07232.IIIllIIlIIIIIIlIlIIllIIlI, class_07232.IllIIlllllllIIlIIlIIIIlIl)) continue;
                this.IlIlIIlllIllllllllIIIlIlI.lllIlIIlIIIlIlIIIllIlllIl(class_07232.IIIllIIlIIIIIIlIlIIllIIlI, class_07232.IllIIlllllllIIlIIlIIIIlIl);
            }
        }
    }

    public void IIIIlIIlIIIllIIIIllIIIlII() {
        if (this.lIlIlIIlIIIIlIIIIIlllIIII.IlIllllllIIlIIllllIIlIIIl()) {
            this.lIlIlIIlIIIIlIIIIIlllIIII.lllIIIllIIIIlllIlIIllIIll();
        }
    }

    protected void lIllllIIlIIIlIllllllIIIll() {
        this.lIIlIIIIIlIlllIlIIlIlIlll();
        this.IlIIIlIIIIllIIIllIIIIIIll.lllIIIllIIIIlllIlIIllIIll(this.IIlllIlIlllIllIIIlllIIlIl, this.llIIIIllIIIIIIIlIIIlIIIIl.lIIIllIIIIIllllIlIlIllIll().lllIlIIlIIIlIlIIIllIlllIl());
        this.llIIlIllIllllIlIIIIlIIlll.lllIIIllIIIIlllIlIIllIIll();
    }

    @Override
    protected void IlIllllllIIlIIllllIIlIIIl(class_1521 class_15212) {
        super.IlIllllllIIlIIllllIIlIIIl(class_15212);
        this.llIlIIlllIIIIIllIIlIlIIII.lllIIIllIIIIlllIlIIllIIll(class_15212.llllllIlIllllIlIlIlIIIIlI(), class_15212);
        class_1521[] arrclass_1521 = class_15212.lIIllllllllIlIllllllllIlI();
        if (arrclass_1521 != null) {
            for (int i = 0; i < arrclass_1521.length; ++i) {
                this.llIlIIlllIIIIIllIIlIlIIII.lllIIIllIIIIlllIlIIllIIll(arrclass_1521[i].llllllIlIllllIlIlIlIIIIlI(), arrclass_1521[i]);
            }
        }
    }

    @Override
    protected void lIlllIlllIIIIlIIlllIllIII(class_1521 class_15212) {
        super.lIlllIlllIIIIlIIlllIllIII(class_15212);
        this.llIlIIlllIIIIIllIIlIlIIII.lIlllIlllIIIIlIIlllIllIII(class_15212.llllllIlIllllIlIlIlIIIIlI());
        class_1521[] arrclass_1521 = class_15212.lIIllllllllIlIllllllllIlI();
        if (arrclass_1521 != null) {
            for (int i = 0; i < arrclass_1521.length; ++i) {
                this.llIlIIlllIIIIIllIIlIlIIII.lIlllIlllIIIIlIIlllIllIII(arrclass_1521[i].llllllIlIllllIlIlIlIIIIlI());
            }
        }
    }

    @Override
    public class_1521 lllIIIllIIIIlllIlIIllIIll(int n) {
        return (class_1521)this.llIlIIlllIIIIIllIIlIlIIII.lllIIIllIIIIlllIlIIllIIll(n);
    }

    @Override
    public boolean lIllllIIlIIIlIllllllIIIll(class_1521 class_15212) {
        if (super.lIllllIIlIIIlIllllllIIIll(class_15212)) {
            this.llIIIIllIIIIIIIlIIIlIIIIl.lIIIllIIIIIllllIlIlIllIll().lllIIIllIIIIlllIlIIllIIll(class_15212.IlIIlllllIIlIlIlllllIllll, class_15212.llIIlIlIlllIIllIlIlllIllI, class_15212.IllIIIIllIIllIllIlllIlIIl, 512.0, this.IlIlIIlllIIlIllIIIlllllIl.IIIllIllIIlIlIlIlIllllIIl, new S2CPacketSpawnGlobalEntity(class_15212));
            return true;
        }
        return false;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, byte by) {
        this.lIlIlIIIIIIlIIllllIlIIllI().lllIlIIlIIIlIlIIIllIlllIl(class_15212, new S19PacketEntityStatus(class_15212, by));
    }

    @Override
    public class_1013 lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, double d, double d2, double d3, float f, boolean bl, boolean bl2) {
        class_1013 class_10132 = new class_1013(this, class_15212, d, d2, d3, f);
        class_10132.lllIIIllIIIIlllIlIIllIIll = bl;
        class_10132.lllIlIIlIIIlIlIIIllIlllIl = bl2;
        class_10132.lllIIIllIIIIlllIlIIllIIll();
        class_10132.lllIIIllIIIIlllIlIIllIIll(false);
        if (!bl2) {
            class_10132.IllIIlllllllIIlIIlIIIIlIl.clear();
        }
        for (class_0814 class_08142 : this.lIllllIIlIIIlIllllllIIIll) {
            if (!(class_08142.lIllllIIlIIIlIllllllIIIll(d, d2, d3) < 4096.0)) continue;
            ((class_1822)class_08142).lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new S27PacketExplosion(d, d2, d3, f, class_10132.IllIIlllllllIIlIIlIIIIlIl, (class_0864)class_10132.lllIlIIlIIIlIlIIIllIlllIl().get(class_08142)));
        }
        return class_10132;
    }

    @Override
    public void lIlllIlllIIIIlIIlllIllIII(int n, int n2, int n3, Block class_05492, int n4, int n5) {
        class_1103 class_11032;
        class_1103 class_11033 = new class_1103(n, n2, n3, class_05492, n4, n5);
        Iterator iterator = this.IllllIIIIlIIlIIIIlllIIIIl[this.llllIlIIIIIIIIIlllIIlIIIl].iterator();
        do {
            if (iterator.hasNext()) continue;
            this.IllllIIIIlIIlIIIIlllIIIIl[this.llllIlIIIIIIIIIlllIIlIIIl].add(class_11033);
            return;
        } while (!(class_11032 = (class_1103)iterator.next()).equals(class_11033));
    }

    private void lllIIIIlIlIIlIIlllIIIIIIl() {
        while (!this.IllllIIIIlIIlIIIIlllIIIIl[this.llllIlIIIIIIIIIlllIIlIIIl].isEmpty()) {
            int n = this.llllIlIIIIIIIIIlllIIlIIIl;
            this.llllIlIIIIIIIIIlllIIlIIIl ^= 1;
            for (class_1103 class_11032 : this.IllllIIIIlIIlIIIIlllIIIIl[n]) {
                if (!this.lllIIIllIIIIlllIlIIllIIll(class_11032)) continue;
                this.llIIIIllIIIIIIIlIIIlIIIIl.lIIIllIIIIIllllIlIlIllIll().lllIIIllIIIIlllIlIIllIIll(class_11032.lllIIIllIIIIlllIlIIllIIll(), class_11032.lllIlIIlIIIlIlIIIllIlllIl(), class_11032.IlIllllllIIlIIllllIIlIIIl(), 64.0, this.IlIlIIlllIIlIllIIIlllllIl.IIIllIllIIlIlIlIlIllllIIl, new S24PacketBlockAction(class_11032.lllIIIllIIIIlllIlIIllIIll(), class_11032.lllIlIIlIIIlIlIIIllIlllIl(), class_11032.IlIllllllIIlIIllllIIlIIIl(), class_11032.lIllllIIlIIIlIllllllIIIll(), class_11032.lIlllIlllIIIIlIIlllIllIII(), class_11032.IlIIIIIllllllIIlllIllllll()));
            }
            this.IllllIIIIlIIlIIIIlllIIIIl[n].clear();
        }
    }

    private boolean lllIIIllIIIIlllIlIIllIIll(class_1103 class_11032) {
        Block class_05492 = this.a_(class_11032.lllIIIllIIIIlllIlIIllIIll(), class_11032.lllIlIIlIIIlIlIIIllIlllIl(), class_11032.IlIllllllIIlIIllllIIlIIIl());
        return class_05492 == class_11032.lIllllIIlIIIlIllllllIIIll() ? class_05492.lllIlIIlIIIlIlIIIllIlllIl(this, class_11032.lllIIIllIIIIlllIlIIllIIll(), class_11032.lllIlIIlIIIlIlIIIllIlllIl(), class_11032.IlIllllllIIlIIllllIIlIIIl(), class_11032.lIlllIlllIIIIlIIlllIllIII(), class_11032.IlIIIIIllllllIIlllIllllll()) : false;
    }

    public void lllIIIIIIlIlllIIlIlIIIllI() {
        this.IlIIIlIIIIllIIIllIIIIIIll.lllIIIllIIIIlllIlIIllIIll();
    }

    @Override
    protected void IlIIIIIllllllIIlllIllllll() {
        boolean bl = this.IIIIIIIIlIllIIllIIlllIllI();
        super.IlIIIIIllllllIIlllIllllll();
        if (this.lIIIIlIlIIlllllIIllIIlIII != this.llIIlllIllIllllIIIlIIIIII) {
            this.llIIIIllIIIIIIIlIIIlIIIIl.lIIIllIIIIIllllIlIlIllIll().lllIIIllIIIIlllIlIIllIIll(new S2BPacketChangeGameState(7, this.llIIlllIllIllllIIIlIIIIII), this.IlIlIIlllIIlIllIIIlllllIl.IIIllIllIIlIlIlIlIllllIIl);
        }
        if (this.llIIllIllIlIIlIIllIllllll != this.lllIIlIIIllllllIIIIlIlIlI) {
            this.llIIIIllIIIIIIIlIIIlIIIIl.lIIIllIIIIIllllIlIlIllIll().lllIIIllIIIIlllIlIIllIIll(new S2BPacketChangeGameState(8, this.lllIIlIIIllllllIIIIlIlIlI), this.IlIlIIlllIIlIllIIIlllllIl.IIIllIllIIlIlIlIlIllllIIl);
        }
        if (bl != this.IIIIIIIIlIllIIllIIlllIllI()) {
            if (bl) {
                this.llIIIIllIIIIIIIlIIIlIIIIl.lIIIllIIIIIllllIlIlIllIll().lllIIIllIIIIlllIlIIllIIll(new S2BPacketChangeGameState(2, 0.0f));
            } else {
                this.llIIIIllIIIIIIIlIIIlIIIIl.lIIIllIIIIIllllIlIlIllIll().lllIIIllIIIIlllIlIIllIIll(new S2BPacketChangeGameState(1, 0.0f));
            }
            this.llIIIIllIIIIIIIlIIIlIIIIl.lIIIllIIIIIllllIlIlIllIll().lllIIIllIIIIlllIlIIllIIll(new S2BPacketChangeGameState(7, this.llIIlllIllIllllIIIlIIIIII));
            this.llIIIIllIIIIIIIlIIIlIIIIl.lIIIllIIIIIllllIlIlIllIll().lllIIIllIIIIlllIlIIllIIll(new S2BPacketChangeGameState(8, this.lllIIlIIIllllllIIIIlIlIlI));
        }
    }

    @Override
    protected int IIIllIIlIIIIIIlIlIIllIIlI() {
        return this.llIIIIllIIIIIIIlIIIlIIIIl.lIIIllIIIIIllllIlIlIllIll().lIIlIIIIIlIlllIlIIlIlIlll();
    }

    public class_0220 llIIlIIllIIllIlIIllIIllII() {
        return this.llIIIIllIIIIIIIlIIIlIIIIl;
    }

    public class_1105 lIlIlIIIIIIlIIllllIlIIllI() {
        return this.IIllIllIIllIIlllIIIlIlllI;
    }

    public class_0636 IllllIIIIlIIlIIIIlllIIIIl() {
        return this.llllllIlIllllIlIlIlIIIIlI;
    }

    public class_1403 llllIlIIIIIIIIIlllIIlIIIl() {
        return this.llIIlIIllIIllIlIIllIIllII;
    }

    public void lllIIIllIIIIlllIlIIllIIll(String string, double d, double d2, double d3, int n, double d4, double d5, double d6, double d7) {
        S2APacketParticles class_11782 = new S2APacketParticles(string, (float)d, (float)d2, (float)d3, (float)d4, (float)d5, (float)d6, (float)d7, n);
        for (int i = 0; i < this.lIllllIIlIIIlIllllllIIIll.size(); ++i) {
            class_1822 class_18222 = (class_1822)this.lIllllIIlIIIlIllllllIIIll.get(i);
            class_2208 class_22082 = class_18222.lllIIlIIIllllllIIIIlIlIlI();
            double d8 = d - (double)class_22082.lllIIIllIIIIlllIlIIllIIll;
            double d9 = d2 - (double)class_22082.lllIlIIlIIIlIlIIIllIlllIl;
            double d10 = d3 - (double)class_22082.IlIllllllIIlIIllllIIlIIIl;
            double d11 = d8 * d8 + d9 * d9 + d10 * d10;
            if (!(d11 <= 256.0)) continue;
            class_18222.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(class_11782);
        }
    }
}

