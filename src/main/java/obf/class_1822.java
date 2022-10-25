package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  com.mojang.authlib.GameProfile
 *  io.netty.buffer.Unpooled
 *  org.apache.commons.io.Charsets
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.collect.Sets;
import com.mojang.authlib.GameProfile;
import io.netty.buffer.Unpooled;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import net.minecraft.crash.CrashReport;
import net.minecraft.item.ItemStack;
import net.minecraft.scoreboard.IScoreObjectiveCriteria;
import net.minecraft.stats.AchievementList;
import net.minecraft.stats.StatBase;
import net.minecraft.stats.StatList;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.JsonSerializableSet;
import net.minecraft.util.MathHelper;
import org.apache.commons.io.Charsets;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_1822
extends class_0814
implements class_1283 {
    private static final Logger IllIIIllIIIIlIlIlIllIIlll = LogManager.getLogger();
    private String lIIIIlIlIIlllllIIllIIlIII = "en_US";
    public class_0634 lllIIIllIIIIlllIlIIllIIll;
    public final class_0220 lllIlIIlIIIlIlIIIllIlllIl;
    public final class_0388 IlIllllllIIlIIllllIIlIIIl;
    public double lIlllIlllIIIIlIIlllIllIII;
    public double IlIIIIIllllllIIlllIllllll;
    public final List lIllllIIlIIIlIllllllIIIll = new LinkedList();
    private final List llIIlllIllIllllIIIlIIIIII = new LinkedList();
    private final class_0084 llIIllIllIlIIlIIllIllllll;
    private float lIllIIlllIIIlIlIIIlllIlIl = Float.MIN_VALUE;
    private float IIlIlIlIIlllIIIlIIIIlIIIl = -1.0E8f;
    private int lllIIIIlIIllIIIlIllIlllII = -99999999;
    private boolean IlIllIIIIllllIIllIllIIIIl = true;
    private int lIlIlIIllIlIIIIIlIIlllIlI = -99999999;
    private int llllIllllllIllIIIlIlIIllI = 60;
    private class_1210 IIlIlIIIlIIllIlIlIlIlIIll;
    private boolean IIIIlllllIlllIIllIIIlIllI = true;
    private long IlIlIIlllIIlIlllllIlIIIIl = System.currentTimeMillis();
    private int IIllllllIIllIlIllllIIIlll;
    public boolean IIIllIIlIIIIIIlIlIIllIIlI;
    public int IllIIlllllllIIlIIlIIIIlIl;
    public boolean IIIllIllIIlIlIlIlIllllIIl;

    public class_1822(class_0220 class_02202, class_0976 class_09762, GameProfile gameProfile, class_0388 class_03882) {
        super(class_09762, gameProfile);
        class_03882.lllIlIIlIIIlIlIIIllIlllIl = this;
        this.IlIllllllIIlIIllllIIlIIIl = class_03882;
        class_2208 class_22082 = class_09762.lIlIllIIlIIlIIlIIlIIlIIll();
        int n = class_22082.lllIIIllIIIIlllIlIIllIIll;
        int n2 = class_22082.IlIllllllIIlIIllllIIlIIIl;
        int n3 = class_22082.lllIlIIlIIIlIlIIIllIlllIl;
        if (!class_09762.IlIlIIlllIIlIllIIIlllllIl.IIIllIIlIIIIIIlIlIIllIIlI && class_09762.lIlllIlllIlIIIIlllIlIlIIl().IlIlIIlllIIlIllIIIlllllIl() != class_2243.lIlllIlllIIIIlIIlllIllIII) {
            int n4 = Math.max(5, class_02202.llllIIllIlIlllllllIIlIIlI() - 6);
            n3 = class_09762.IIIllIllIIlIlIlIlIllllIIl(n += this.IlllIIlllllllIIllIlIllllI.nextInt(n4 * 2) - n4, n2 += this.IlllIIlllllllIIllIlIllllI.nextInt(n4 * 2) - n4);
        }
        this.lllIlIIlIIIlIlIIIllIlllIl = class_02202;
        this.llIIllIllIlIIlIIllIllllll = class_02202.lIIIllIIIIIllllIlIlIllIll().lllIIIllIIIIlllIlIIllIIll((class_0814)this);
        this.IllIlIlIIIlllIIllIIIIlIll = 0.0f;
        this.llllIlIIIIIIIIIlllIIlIIIl = 0.0f;
        this.lllIlIIlIIIlIlIIIllIlllIl((double)n + 0.5, n3, (double)n2 + 0.5, 0.0f, 0.0f);
        while (!class_09762.lllIIIllIIIIlllIlIIllIIll((class_1521)this, this.IIllIllIIllIIlllIIIlIlllI).isEmpty()) {
            this.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI + 1.0, this.IllIIIIllIIllIllIlllIlIIl);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        super.lllIIIllIIIIlllIlIIllIIll(class_07752);
        if (class_07752.lllIlIIlIIIlIlIIIllIlllIl("playerGameType", 99)) {
            if (class_0220.IlIIlllllIIlIlIlllllIllll().IlllIIlllllllIIllIlIllllI()) {
                this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(class_0220.IlIIlllllIIlIlIlllllIllll().IlIIIIIllllllIIlllIllllll());
            } else {
                this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(class_2243.lllIIIllIIIIlllIlIIllIIll(class_07752.lIllllIIlIIIlIllllllIIIll("playerGameType")));
            }
        }
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        super.lllIlIIlIIIlIlIIIllIlllIl(class_07752);
        class_07752.lllIIIllIIIIlllIlIIllIIll("playerGameType", this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll().lllIIIllIIIIlllIlIIllIIll());
    }

    @Override
    public void IlIIIlIIIIllIIIllIIIIIIll(int n) {
        super.IlIIIlIIIIllIIIllIIIIIIll(n);
        this.lIlIlIIllIlIIIIIlIIlllIlI = -1;
    }

    public void IlIIIIIllllllIIlllIllllll() {
        this.lIIIlIllllIlllIIIIIllIIIl.lllIIIllIIIIlllIlIIllIIll(this);
    }

    @Override
    protected void e_() {
        this.llllIlIIIIIIIIIlllIIlIIIl = 0.0f;
    }

    @Override
    public float llIIllIllIlIIlIIllIllllll() {
        return 1.62f;
    }

    @Override
    public void s_() {
        Object object;
        Object object2;
        this.IlIllllllIIlIIllllIIlIIIl.IlIllllllIIlIIllllIIlIIIl();
        --this.llllIllllllIllIIIlIlIIllI;
        if (this.IIIIlIllIlIIIIIllllIIlllI > 0) {
            --this.IIIIlIllIlIIIIIllllIIlllI;
        }
        this.lIIIlIllllIlllIIIIIllIIIl.IlIllllllIIlIIllllIIlIIIl();
        if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl && !this.lIIIlIllllIlllIIIIIllIIIl.lllIIIllIIIIlllIlIIllIIll(this)) {
            this.IlIIIlIIIIllIIIllIIIIIIll();
            this.lIIIlIllllIlllIIIIIllIIIl = this.IlIlllIIIIIIlIIllIIllIlll;
        }
        while (!this.llIIlllIllIllllIIIlIIIIII.isEmpty()) {
            int n = Math.min(this.llIIlllIllIllllIIIlIIIIII.size(), 127);
            object2 = new int[n];
            object = this.llIIlllIllIllllIIIlIIIIII.iterator();
            int n2 = 0;
            while (object.hasNext() && n2 < n) {
                object2[n2++] = (Integer)object.next();
                object.remove();
            }
            this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new class_0175((int[])object2));
        }
        if (!this.lIllllIIlIIIlIllllllIIIll.isEmpty()) {
            Object object3;
            ArrayList<class_0723> arrayList = new ArrayList<class_0723>();
            object2 = this.lIllllIIlIIIlIllllllIIIll.iterator();
            object = new ArrayList();
            while (object2.hasNext() && arrayList.size() < class_2053.IlIllllllIIlIIllllIIlIIIl()) {
                object3 = (class_1108)object2.next();
                if (object3 != null) {
                    class_0723 class_07232;
                    if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIIIIllllllIIlllIllllll(((class_1108)object3).lllIIIllIIIIlllIlIIllIIll << 4, 0, ((class_1108)object3).lllIlIIlIIIlIlIIIllIlllIl << 4) || !(class_07232 = this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIIIIllllllIIlllIllllll(((class_1108)object3).lllIIIllIIIIlllIlIIllIIll, ((class_1108)object3).lllIlIIlIIIlIlIIIllIlllIl)).IIIllIllIIlIlIlIlIllllIIl()) continue;
                    arrayList.add(class_07232);
                    ((ArrayList)object).addAll(((class_0976)this.lIlIllIIlIIlIIlIIlIIlIIll).lllIIIllIIIIlllIlIIllIIll(((class_1108)object3).lllIIIllIIIIlllIlIIllIIll * 16, 0, ((class_1108)object3).lllIlIIlIIIlIlIIIllIlllIl * 16, ((class_1108)object3).lllIIIllIIIIlllIlIIllIIll * 16 + 16, 256, ((class_1108)object3).lllIlIIlIIIlIlIIIllIlllIl * 16 + 16));
                    object2.remove();
                    continue;
                }
                object2.remove();
            }
            if (!arrayList.isEmpty()) {
                this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new class_2053(arrayList));
                object3 = ((ArrayList)object).iterator();
                while (object3.hasNext()) {
                    class_1774 class_17742 = (class_1774)object3.next();
                    this.lllIlIIlIIIlIlIIIllIlllIl(class_17742);
                }
                for (class_0723 class_07233 : arrayList) {
                    this.IIlllIlIlllIllIIIlllIIlIl().lIlIlIIIIIIlIIllllIlIIllI().lllIIIllIIIIlllIlIIllIIll(this, class_07233);
                }
            }
        }
    }

    public void lIllllIIlIIIlIllllllIIIll() {
        try {
            super.s_();
            for (int i = 0; i < this.lllIIlIIIllllllIIIIlIlIlI.IlIIIIIllllllIIlllIllllll(); ++i) {
                Object object;
                ItemStack class_08972 = this.lllIIlIIIllllllIIIIlIlIlI.llIIllIllIlIIlIIllIllllll(i);
                if (class_08972 == null || !class_08972.lllIIIllIIIIlllIlIIllIIll().lllIIlIIIllllllIIIIlIlIlI() || (object = ((class_1747)class_08972.lllIIIllIIIIlllIlIIllIIll()).lIlllIlllIIIIlIIlllIllIII(class_08972, this.lIlIllIIlIIlIIlIIlIIlIIll, this)) == null) continue;
                this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll((class_0703)object);
            }
            if (this.lllIIIlllIlllIIlIllllIIlI() != this.IIlIlIlIIlllIIIlIIIIlIIIl || this.lllIIIIlIIllIIIlIllIlllII != this.lllIIIlllIlllIIlIllllIIlI.lllIIIllIIIIlllIlIIllIIll() || this.lllIIIlllIlllIIlIllllIIlI.lIlllIlllIIIIlIIlllIllIII() == 0.0f != this.IlIllIIIIllllIIllIllIIIIl) {
                this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new class_1160(this.lllIIIlllIlllIIlIllllIIlI(), this.lllIIIlllIlllIIlIllllIIlI.lllIIIllIIIIlllIlIIllIIll(), this.lllIIIlllIlllIIlIllllIIlI.lIlllIlllIIIIlIIlllIllIII()));
                this.IIlIlIlIIlllIIIlIIIIlIIIl = this.lllIIIlllIlllIIlIllllIIlI();
                this.lllIIIIlIIllIIIlIllIlllII = this.lllIIIlllIlllIIlIllllIIlI.lllIIIllIIIIlllIlIIllIIll();
                boolean bl = this.IlIllIIIIllllIIllIllIIIIl = this.lllIIIlllIlllIIlIllllIIlI.lIlllIlllIIIIlIIlllIllIII() == 0.0f;
            }
            if (this.lllIIIlllIlllIIlIllllIIlI() + this.lllIlllllIllIlIIlIlIIIlll() != this.lIllIIlllIIIlIlIIIlllIlIl) {
                this.lIllIIlllIIIlIlIIIlllIlIl = this.lllIIIlllIlllIIlIllllIIlI() + this.lllIlllllIllIlIIlIlIIIlll();
                Collection collection = this.lIlIlIIllIlIIIIIlIIlllIlI().lllIIIllIIIIlllIlIIllIIll(IScoreObjectiveCriteria.lIllllIIlIIIlIllllllIIIll);
                for (Object object : collection) {
                    this.lIlIlIIllIlIIIIIlIIlllIlI().lllIIIllIIIIlllIlIIllIIll(this.llllIIIIlIIIlIIIIIIlIllll(), (class_0693)object).lllIIIllIIIIlllIlIIllIIll(Arrays.asList(this));
                }
            }
            if (this.llllIllIIIlIllIllllllIlIl != this.lIlIlIIllIlIIIIIlIIlllIlI) {
                this.lIlIlIIllIlIIIIIlIIlllIlI = this.llllIllIIIlIllIllllllIlIl;
                this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new class_1134(this.llIlllllIIlIIlIIllllIllll, this.llllIllIIIlIllIllllllIlIl, this.lllIlllllIllIlIIlIlIIIlll));
            }
            if (this.IlllIIIllllIIllIllIlIIlIl % 20 * 5 == 0 && !this.IllIIIIllIIllIllIlllIlIIl().lllIIIllIIIIlllIlIIllIIll(AchievementList.field_150961_L)) {
                this.IllIIlllllllIIlIIlIIIIlIl();
            }
        }
        catch (Throwable throwable) {
            CrashReport class_02232 = CrashReport.lllIIIllIIIIlllIlIIllIIll(throwable, "Ticking player");
            class_0799 class_07992 = class_02232.lllIIIllIIIIlllIlIIllIIll("Player being ticked");
            this.lllIIIllIIIIlllIlIIllIIll(class_07992);
            throw new class_0892(class_02232);
        }
    }

    protected void IllIIlllllllIIlIIlIIIIlIl() {
        class_0672 class_06722 = this.lIlIllIIlIIlIIlIIlIIlIIll.a_(MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll), MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IllIIIIllIIllIllIlllIlIIl));
        if (class_06722 != null) {
            String string = class_06722.IlIIIlIllIIIllIIIIlIIlIll;
            JsonSerializableSet class_11262 = (JsonSerializableSet)this.IllIIIIllIIllIllIlllIlIIl().lllIlIIlIIIlIlIIIllIlllIl((StatBase) AchievementList.field_150961_L);
            if (class_11262 == null) {
                class_11262 = (JsonSerializableSet)this.IllIIIIllIIllIllIlllIlIIl().lllIIIllIIIIlllIlIIllIIll(AchievementList.field_150961_L, new JsonSerializableSet());
            }
            class_11262.add(string);
            if (this.IllIIIIllIIllIllIlllIlIIl().lllIlIIlIIIlIlIIIllIlllIl(AchievementList.field_150961_L) && class_11262.size() == class_0672.lllIIlIIIllllllIIIIlIlIlI.size()) {
                HashSet hashSet = Sets.newHashSet((Iterable)class_0672.lllIIlIIIllllllIIIIlIlIlI);
                Iterator iterator = class_11262.iterator();
                while (iterator.hasNext()) {
                    String string2 = (String)iterator.next();
                    Iterator iterator2 = hashSet.iterator();
                    while (iterator2.hasNext()) {
                        class_0672 class_06723 = (class_0672)iterator2.next();
                        if (!class_06723.IlIIIlIllIIIllIIIIlIIlIll.equals(string2)) continue;
                        iterator2.remove();
                    }
                    if (!hashSet.isEmpty()) continue;
                    break;
                }
                if (hashSet.isEmpty()) {
                    this.lllIIIllIIIIlllIlIIllIIll(AchievementList.field_150961_L);
                }
            }
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0058 class_00582) {
        Object object2;
        this.lllIlIIlIIIlIlIIIllIlllIl.lIIIllIIIIIllllIlIlIllIll().lllIIIllIIIIlllIlIIllIIll(this.lIIIIlIIIIllIlIIllllIlIII().lllIlIIlIIIlIlIIIllIlllIl());
        if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIlllllIIlIlIlllllIllll().lllIlIIlIIIlIlIIIllIlllIl("keepInventory")) {
            this.lllIIlIIIllllllIIIIlIlIlI.IIIllIIlIIIIIIlIlIIllIIlI();
        }
        Collection collection = this.lIlIllIIlIIlIIlIIlIIlIIll.IlIlIIlllIllllllllIIIlIlI().lllIIIllIIIIlllIlIIllIIll(IScoreObjectiveCriteria.IlIllllllIIlIIllllIIlIIIl);
        for (Object object2 : collection) {
            class_0678 class_06782 = this.lIlIlIIllIlIIIIIlIIlllIlI().lllIIIllIIIIlllIlIIllIIll(this.llllIIIIlIIIlIIIIIIlIllll(), (class_0693)object2);
            class_06782.lllIIIllIIIIlllIlIIllIIll();
        }
        object2 = this.lIIIlllllllIlllIIllllllll();
        if (object2 != null) {
            int n = class_0054.lllIIIllIIIIlllIlIIllIIll((class_1521)object2);
            class_1128 class_11282 = (class_1128)class_0054.lllIIIllIIIIlllIlIIllIIll.get(n);
            if (class_11282 != null) {
                this.lllIIIllIIIIlllIlIIllIIll(class_11282.IlIIIIIllllllIIlllIllllll, 1);
            }
            ((class_1521)object2).lllIlIIlIIIlIlIIIllIlllIl(this, this.llIllIllIllIlIlIllIlIIIIl);
        }
        this.lllIIIllIIIIlllIlIIllIIll(StatList.IIlllIlIlllIllIIIlllIIlIl, 1);
        this.lIIIIlIIIIllIlIIllllIlIII().lIlllIlllIIIIlIIlllIllIII();
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_0058 class_00582, float f) {
        boolean bl;
        if (this.lIIllIIlIIIlllIlllIIlIIlI()) {
            return false;
        }
        boolean bl2 = bl = this.lllIlIIlIIIlIlIIIllIlllIl.llIIlIIllIIllIlIIllIIllII() && this.lllIlIIlIIIlIlIIIllIlllIl.IIIIlIlIIlIIIIlIlllIlIIII() && "fall".equals(class_00582.IlIlllIIIIIIlIIllIIllIlll);
        if (!bl && this.llllIllllllIllIIIlIlIIllI > 0 && class_00582 != class_0058.IIIllIllIIlIlIlIlIllllIIl) {
            return false;
        }
        if (class_00582 instanceof class_1494) {
            class_1521 class_15212 = class_00582.IllIIIllIIIIlIlIlIllIIlll();
            if (class_15212 instanceof class_0814 && !this.lIlllIlllIIIIlIIlllIllIII((class_0814)class_15212)) {
                return false;
            }
            if (class_15212 instanceof class_0369) {
                class_0369 class_03692 = (class_0369)class_15212;
                if (class_03692.IlIllllllIIlIIllllIIlIIIl instanceof class_0814 && !this.lIlllIlllIIIIlIIlllIllIII((class_0814)class_03692.IlIllllllIIlIIllllIIlIIIl)) {
                    return false;
                }
            }
        }
        return super.lllIIIllIIIIlllIlIIllIIll(class_00582, f);
    }

    @Override
    public boolean lIlllIlllIIIIlIIlllIllIII(class_0814 class_08142) {
        return !this.lllIlIIlIIIlIlIIIllIlllIl.IIIIlIlIIlIIIIlIlllIlIIII() ? false : super.lIlllIlllIIIIlIIlllIllIII(class_08142);
    }

    @Override
    public void IIIllIllIIlIlIlIlIllllIIl(int n) {
        if (this.lIIllllllllIlIllllllllIlI == 1 && n == 1) {
            this.lllIIIllIIIIlllIlIIllIIll(AchievementList.theEnd2);
            this.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl(this);
            this.IIIllIllIIlIlIlIlIllllIIl = true;
            this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new class_0742(4, 0.0f));
        } else {
            if (this.lIIllllllllIlIllllllllIlI == 0 && n == 1) {
                this.lllIIIllIIIIlllIlIIllIIll(AchievementList.theEnd);
                class_2208 class_22082 = this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(n).llIlllIIllIlllIlIlIlIIIll();
                if (class_22082 != null) {
                    this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(class_22082.lllIIIllIIIIlllIlIIllIIll, class_22082.lllIlIIlIIIlIlIIIllIlllIl, class_22082.IlIllllllIIlIIllllIIlIIIl, 0.0f, 0.0f);
                }
                n = 1;
            } else {
                this.lllIIIllIIIIlllIlIIllIIll(AchievementList.portal);
            }
            this.lllIlIIlIIIlIlIIIllIlllIl.lIIIllIIIIIllllIlIlIllIll().lllIIIllIIIIlllIlIIllIIll(this, n);
            this.lIlIlIIllIlIIIIIlIIlllIlI = -1;
            this.IIlIlIlIIlllIIIlIIIIlIIIl = -1.0f;
            this.lllIIIIlIIllIIIlIllIlllII = -1;
        }
    }

    private void lllIlIIlIIIlIlIIIllIlllIl(class_1774 class_17742) {
        class_0703 class_07032;
        if (class_17742 != null && (class_07032 = class_17742.IllIIlllllllIIlIIlIIIIlIl()) != null) {
            this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(class_07032);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, int n) {
        super.lllIIIllIIIIlllIlIIllIIll(class_15212, n);
        this.lIIIlIllllIlllIIIIIllIIIl.IlIllllllIIlIIllllIIlIIIl();
    }

    @Override
    public class_0690 IlIllllllIIlIIllllIIlIIIl(int n, int n2, int n3) {
        class_0690 class_06902 = super.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        if (class_06902 == class_0690.lllIIIllIIIIlllIlIIllIIll) {
            class_1089 class_10892 = new class_1089(this, n, n2, n3);
            this.IIlllIlIlllIllIIIlllIIlIl().lIlIlIIIIIIlIIllllIlIIllI().lllIIIllIIIIlllIlIIllIIll((class_1521)this, class_10892);
            this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI, this.IllIIIIllIIllIllIlllIlIIl, this.IIIIlIllIlIIlIIlIllIlIlll, this.IlIlIIlllIllllllllIIIlIlI);
            this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(class_10892);
        }
        return class_06902;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(boolean bl, boolean bl2, boolean bl3) {
        if (this.IIIIIllIIlIlIlIIlIlIlIllI()) {
            this.IIlllIlIlllIllIIIlllIIlIl().lIlIlIIIIIIlIIllllIlIIllI().lllIlIIlIIIlIlIIIllIlllIl(this, new class_0842(this, 2));
        }
        super.lllIIIllIIIIlllIlIIllIIll(bl, bl2, bl3);
        if (this.lllIIIllIIIIlllIlIIllIIll != null) {
            this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI, this.IllIIIIllIIllIllIlllIlIIl, this.IIIIlIllIlIIlIIlIllIlIlll, this.IlIlIIlllIllllllllIIIlIlI);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212) {
        super.lllIIIllIIIIlllIlIIllIIll(class_15212);
        this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new class_2218(0, this, this.IlIIIlIIIIllIIIllIIIIIIll));
        this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI, this.IllIIIIllIIllIllIlllIlIIl, this.IIIIlIllIlIIlIIlIllIlIlll, this.IlIlIIlllIllllllllIIIlIlI);
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(double d, boolean bl) {
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(double d, boolean bl) {
        super.lllIIIllIIIIlllIlIIllIIll(d, bl);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1774 class_17742) {
        if (class_17742 instanceof class_2219) {
            ((class_2219)class_17742).lllIIIllIIIIlllIlIIllIIll(this);
            this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new class_1504(class_17742.lllIlIIlIIIlIlIIIllIlllIl, class_17742.IlIllllllIIlIIllllIIlIIIl, class_17742.lIlllIlllIIIIlIIlllIllIII));
        }
    }

    private void IIIIlIllIlIIlIIlIllIlIlll() {
        this.IIllllllIIllIlIllllIIIlll = this.IIllllllIIllIlIllllIIIlll % 100 + 1;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        this.IIIIlIllIlIIlIIlIllIlIlll();
        this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new class_2247(this.IIllllllIIllIlIllllIIIlll, 1, "Crafting", 9, true));
        this.lIIIlIllllIlllIIIIIllIIIl = new class_0491(this.lllIIlIIIllllllIIIIlIlIlI, this.lIlIllIIlIIlIIlIIlIIlIIll, n, n2, n3);
        this.lIIIlIllllIlllIIIIIllIIIl.lIlllIlllIIIIlIIlllIllIII = this.IIllllllIIllIlIllllIIIlll;
        this.lIIIlIllllIlllIIIIIllIIIl.lllIIIllIIIIlllIlIIllIIll(this);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, String string) {
        this.IIIIlIllIlIIlIIlIllIlIlll();
        this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new class_2247(this.IIllllllIIllIlIllllIIIlll, 4, string == null ? "" : string, 9, string != null));
        this.lIIIlIllllIlllIIIIIllIIIl = new class_1495(this.lllIIlIIIllllllIIIIlIlIlI, this.lIlIllIIlIIlIIlIIlIIlIIll, n, n2, n3);
        this.lIIIlIllllIlllIIIIIllIIIl.lIlllIlllIIIIlIIlllIllIII = this.IIllllllIIllIlIllllIIIlll;
        this.lIIIlIllllIlllIIIIIllIIIl.lllIIIllIIIIlllIlIIllIIll(this);
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, int n3) {
        this.IIIIlIllIlIIlIIlIllIlIlll();
        this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new class_2247(this.IIllllllIIllIlIllllIIIlll, 8, "Repairing", 9, true));
        this.lIIIlIllllIlllIIIIIllIIIl = new class_0631(this.lllIIlIIIllllllIIIIlIlIlI, this.lIlIllIIlIIlIIlIIlIIlIIll, n, n2, n3, this);
        this.lIIIlIllllIlllIIIIIllIIIl.lIlllIlllIIIIlIIlllIllIII = this.IIllllllIIllIlIllllIIIlll;
        this.lIIIlIllllIlllIIIIIllIIIl.lllIIIllIIIIlllIlIIllIIll(this);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0850 class_08502) {
        if (this.lIIIlIllllIlllIIIIIllIIIl != this.IlIlllIIIIIIlIIllIIllIlll) {
            this.IlIIIlIIIIllIIIllIIIIIIll();
        }
        this.IIIIlIllIlIIlIIlIllIlIlll();
        this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new class_2247(this.IIllllllIIllIlIllllIIIlll, 0, class_08502.IlIIlllllIIlIlIlllllIllll(), class_08502.IlIIIIIllllllIIlllIllllll(), class_08502.IIlllIlIlllIllIIIlllIIlIl()));
        this.lIIIlIllllIlllIIIIIllIIIl = new class_0965(this.lllIIlIIIllllllIIIIlIlIlI, class_08502);
        this.lIIIlIllllIlllIIIIIllIIIl.lIlllIlllIIIIlIIlllIllIII = this.IIllllllIIllIlIllllIIIlll;
        this.lIIIlIllllIlllIIIIIllIIIl.lllIIIllIIIIlllIlIIllIIll(this);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0879 class_08792) {
        this.IIIIlIllIlIIlIIlIllIlIlll();
        this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new class_2247(this.IIllllllIIllIlIllllIIIlll, 9, class_08792.IlIIlllllIIlIlIlllllIllll(), class_08792.IlIIIIIllllllIIlllIllllll(), class_08792.IIlllIlIlllIllIIIlllIIlIl()));
        this.lIIIlIllllIlllIIIIIllIIIl = new class_0080(this.lllIIlIIIllllllIIIIlIlIlI, class_08792);
        this.lIIIlIllllIlllIIIIIllIIIl.lIlllIlllIIIIlIIlllIllIII = this.IIllllllIIllIlIllllIIIlll;
        this.lIIIlIllllIlllIIIIIllIIIl.lllIIIllIIIIlllIlIIllIIll(this);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_2252 class_22522) {
        this.IIIIlIllIlIIlIIlIllIlIlll();
        this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new class_2247(this.IIllllllIIllIlIllllIIIlll, 9, class_22522.IlIIlllllIIlIlIlllllIllll(), class_22522.IlIIIIIllllllIIlllIllllll(), class_22522.IIlllIlIlllIllIIIlllIIlIl()));
        this.lIIIlIllllIlllIIIIIllIIIl = new class_0080(this.lllIIlIIIllllllIIIIlIlIlI, class_22522);
        this.lIIIlIllllIlllIIIIIllIIIl.lIlllIlllIIIIlIIlllIllIII = this.IIllllllIIllIlIllllIIIlll;
        this.lIIIlIllllIlllIIIIIllIIIl.lllIIIllIIIIlllIlIIllIIll(this);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1587 class_15872) {
        this.IIIIlIllIlIIlIIlIllIlIlll();
        this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new class_2247(this.IIllllllIIllIlIllllIIIlll, 2, class_15872.IlIIlllllIIlIlIlllllIllll(), class_15872.IlIIIIIllllllIIlllIllllll(), class_15872.IIlllIlIlllIllIIIlllIIlIl()));
        this.lIIIlIllllIlllIIIIIllIIIl = new class_1370(this.lllIIlIIIllllllIIIIlIlIlI, class_15872);
        this.lIIIlIllllIlllIIIIIllIIIl.lIlllIlllIIIIlIIlllIllIII = this.IIllllllIIllIlIllllIIIlll;
        this.lIIIlIllllIlllIIIIIllIIIl.lllIIIllIIIIlllIlIIllIIll(this);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1646 class_16462) {
        this.IIIIlIllIlIIlIIlIllIlIlll();
        this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new class_2247(this.IIllllllIIllIlIllllIIIlll, class_16462 instanceof class_1798 ? 10 : 3, class_16462.IlIIlllllIIlIlIlllllIllll(), class_16462.IlIIIIIllllllIIlllIllllll(), class_16462.IIlllIlIlllIllIIIlllIIlIl()));
        this.lIIIlIllllIlllIIIIIllIIIl = new class_1837(this.lllIIlIIIllllllIIIIlIlIlI, class_16462);
        this.lIIIlIllllIlllIIIIIllIIIl.lIlllIlllIIIIlIIlllIllIII = this.IIllllllIIllIlIllllIIIlll;
        this.lIIIlIllllIlllIIIIIllIIIl.lllIIIllIIIIlllIlIIllIIll(this);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0647 class_06472) {
        this.IIIIlIllIlIIlIIlIllIlIlll();
        this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new class_2247(this.IIllllllIIllIlIllllIIIlll, 5, class_06472.IlIIlllllIIlIlIlllllIllll(), class_06472.IlIIIIIllllllIIlllIllllll(), class_06472.IIlllIlIlllIllIIIlllIIlIl()));
        this.lIIIlIllllIlllIIIIIllIIIl = new class_0177(this.lllIIlIIIllllllIIIIlIlIlI, class_06472);
        this.lIIIlIllllIlllIIIIIllIIIl.lIlllIlllIIIIlIIlllIllIII = this.IIllllllIIllIlIllllIIIlll;
        this.lIIIlIllllIlllIIIIIllIIIl.lllIIIllIIIIlllIlIIllIIll(this);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0396 class_03962) {
        this.IIIIlIllIlIIlIIlIllIlIlll();
        this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new class_2247(this.IIllllllIIllIlIllllIIIlll, 7, class_03962.IlIIlllllIIlIlIlllllIllll(), class_03962.IlIIIIIllllllIIlllIllllll(), class_03962.IIlllIlIlllIllIIIlllIIlIl()));
        this.lIIIlIllllIlllIIIIIllIIIl = new class_1410(this.lllIIlIIIllllllIIIIlIlIlI, class_03962);
        this.lIIIlIllllIlllIIIIIllIIIl.lIlllIlllIIIIlIIlllIllIII = this.IIllllllIIllIlIllllIIIlll;
        this.lIIIlIllllIlllIIIIIllIIIl.lllIIIllIIIIlllIlIIllIIll(this);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1510 class_15102, String string) {
        this.IIIIlIllIlIIlIIlIllIlIlll();
        this.lIIIlIllllIlllIIIIIllIIIl = new class_0610(this.lllIIlIIIllllllIIIIlIlIlI, class_15102, this.lIlIllIIlIIlIIlIIlIIlIIll);
        this.lIIIlIllllIlllIIIIIllIIIl.lIlllIlllIIIIlIIlllIllIII = this.IIllllllIIllIlIllllIIIlll;
        this.lIIIlIllllIlllIIIIIllIIIl.lllIIIllIIIIlllIlIIllIIll(this);
        class_1086 class_10862 = ((class_0610)this.lIIIlIllllIlllIIIIIllIIIl).lllIIIllIIIIlllIlIIllIIll();
        this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new class_2247(this.IIllllllIIllIlIllllIIIlll, 6, string == null ? "" : string, class_10862.IlIIIIIllllllIIlllIllllll(), string != null));
        class_1596 class_15962 = class_15102.lllIlIIlIIIlIlIIIllIlllIl(this);
        if (class_15962 != null) {
            class_0181 class_01812 = new class_0181(Unpooled.buffer());
            try {
                class_01812.writeInt(this.IIllllllIIllIlIllllIIIlll);
                class_15962.lllIIIllIIIIlllIlIIllIIll(class_01812);
                this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new class_1147("MC|TrList", class_01812));
            }
            catch (IOException iOException) {
                IllIIIllIIIIlIlIlIllIIlll.error("Couldn't send trade list", (Throwable)iOException);
            }
            finally {
                class_01812.release();
            }
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1627 class_16272, class_0850 class_08502) {
        if (this.lIIIlIllllIlllIIIIIllIIIl != this.IlIlllIIIIIIlIIllIIllIlll) {
            this.IlIIIlIIIIllIIIllIIIIIIll();
        }
        this.IIIIlIllIlIIlIIlIllIlIlll();
        this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new class_2247(this.IIllllllIIllIlIllllIIIlll, 11, class_08502.IlIIlllllIIlIlIlllllIllll(), class_08502.IlIIIIIllllllIIlllIllllll(), class_08502.IIlllIlIlllIllIIIlllIIlIl(), class_16272.llllllIlIllllIlIlIlIIIIlI()));
        this.lIIIlIllllIlllIIIIIllIIIl = new class_1387(this.lllIIlIIIllllllIIIIlIlIlI, class_08502, class_16272);
        this.lIIIlIllllIlllIIIIIllIIIl.lIlllIlllIIIIlIIlllIllIII = this.IIllllllIIllIlIllllIIIlll;
        this.lIIIlIllllIlllIIIIIllIIIl.lllIIIllIIIIlllIlIIllIIll(this);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1071 class_10712, int n, ItemStack class_08972) {
        if (!(class_10712.lllIIIllIIIIlllIlIIllIIll(n) instanceof class_1373) && !this.IIIllIIlIIIIIIlIlIIllIIlI) {
            this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new class_1480(class_10712.lIlllIlllIIIIlIIlllIllIII, n, class_08972));
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1071 class_10712) {
        this.lllIIIllIIIIlllIlIIllIIll(class_10712, class_10712.lllIlIIlIIIlIlIIIllIlllIl());
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1071 class_10712, List list) {
        this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new class_1804(class_10712.lIlllIlllIIIIlIIlllIllIII, list));
        this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new class_1480(-1, -1, this.lllIIlIIIllllllIIIIlIlIlI.IllIIlllllllIIlIIlIIIIlIl()));
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1071 class_10712, int n, int n2) {
        this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new class_1236(class_10712.lIlllIlllIIIIlIIlllIllIII, n, n2));
    }

    @Override
    public void IlIIIlIIIIllIIIllIIIIIIll() {
        this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new class_1009(this.lIIIlIllllIlllIIIIIllIIIl.lIlllIlllIIIIlIIlllIllIII));
        this.IlIlIIlIlIllIIlIlIIllIIIl();
    }

    public void IlIlllIIIIIIlIIllIIllIlll() {
        if (!this.IIIllIIlIIIIIIlIlIIllIIlI) {
            this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new class_1480(-1, -1, this.lllIIlIIIllllllIIIIlIlIlI.IllIIlllllllIIlIIlIIIIlIl()));
        }
    }

    public void IlIlIIlIlIllIIlIlIIllIIIl() {
        this.lIIIlIllllIlllIIIIIllIIIl.lllIlIIlIIIlIlIIIllIlllIl(this);
        this.lIIIlIllllIlllIIIIIllIIIl = this.IlIlllIIIIIIlIIllIIllIlll;
    }

    public void lllIIIllIIIIlllIlIIllIIll(float f, float f2, boolean bl, boolean bl2) {
        if (this.IlIIIlIIIIllIIIllIIIIIIll != null) {
            if (f >= -1.0f && f <= 1.0f) {
                this.IlllIIIlIIlIIIIllllIllllI = f;
            }
            if (f2 >= -1.0f && f2 <= 1.0f) {
                this.llIlIIIlllIIIllIllllIIIll = f2;
            }
            this.llIllIlllIllIlIIIIlIIlIII = bl;
            this.lIlllIlllIIIIlIIlllIllIII(bl2);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(StatBase class_03192, int n) {
        if (class_03192 != null) {
            this.llIIllIllIlIIlIIllIllllll.lllIIIllIIIIlllIlIIllIIll(this, class_03192, n);
            for (class_0693 class_06932 : this.lIlIlIIllIlIIIIIlIIlllIlI().lllIIIllIIIIlllIlIIllIIll(class_03192.lIIIIlIlIIlllllIIllIIlIII())) {
                this.lIlIlIIllIlIIIIIlIIlllIlI().lllIIIllIIIIlllIlIIllIIll(this.llllIIIIlIIIlIIIIIIlIllll(), class_06932).lllIIIllIIIIlllIlIIllIIll();
            }
            if (this.llIIllIllIlIIlIIllIllllll.IlIIIIIllllllIIlllIllllll()) {
                this.llIIllIllIlIIlIIllIllllll.lllIIIllIIIIlllIlIIllIIll(this);
            }
        }
    }

    public void lllllIlllIIllIlIIlIIIllII() {
        if (this.lIlIlIIlIIIIlIIIIIlllIIII != null) {
            this.lIlIlIIlIIIIlIIIIIlllIIII.lllIIIllIIIIlllIlIIllIIll((class_1521)this);
        }
        if (this.IlIlIIllIlIlIIIIIlIlllllI) {
            this.lllIIIllIIIIlllIlIIllIIll(true, false, false);
        }
    }

    public void IlIlIIlllIIlIllIIIlllllIl() {
        this.IIlIlIlIIlllIIIlIIIIlIIIl = -1.0E8f;
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(IChatComponent class_22552) {
        this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new class_0710(class_22552));
    }

    @Override
    protected void lIIllllIllIlllllIIllIllIl() {
        this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new class_0514(this, 9));
        super.lIIllllIllIlllllIIllIllIl();
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl(ItemStack class_08972, int n) {
        super.IlIllllllIIlIIllllIIlIIIl(class_08972, n);
        if (class_08972 != null && class_08972.lllIIIllIIIIlllIlIIllIIll() != null && class_08972.lllIIIllIIIIlllIlIIllIIll().IlIIIIIllllllIIlllIllllll(class_08972) == class_1484.lllIlIIlIIIlIlIIIllIlllIl) {
            this.IIlllIlIlllIllIIIlllIIlIl().lIlIlIIIIIIlIIllllIlIIllI().lllIlIIlIIIlIlIIIllIlllIl(this, new class_0842(this, 3));
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0814 class_08142, boolean bl) {
        super.lllIIIllIIIIlllIlIIllIIll(class_08142, bl);
        this.lIlIlIIllIlIIIIIlIIlllIlI = -1;
        this.IIlIlIlIIlllIIIlIIIIlIIIl = -1.0f;
        this.lllIIIIlIIllIIIlIllIlllII = -1;
        this.llIIlllIllIllllIIIlIIIIII.addAll(((class_1822)class_08142).llIIlllIllIllllIIIlIIIIII);
    }

    @Override
    protected void IlIllllllIIlIIllllIIlIIIl(class_1852 class_18522) {
        super.IlIllllllIIlIIllllIIlIIIl(class_18522);
        this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new class_0570(this.llllllIlIllllIlIlIlIIIIlI(), class_18522));
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1852 class_18522, boolean bl) {
        super.lllIIIllIIIIlllIlIIllIIll(class_18522, bl);
        this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new class_0570(this.llllllIlIllllIlIlIlIIIIlI(), class_18522));
    }

    @Override
    protected void lIlllIlllIIIIlIIlllIllIII(class_1852 class_18522) {
        super.lIlllIlllIIIIlIIlllIllIII(class_18522);
        this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new class_1027(this.llllllIlIllllIlIlIlIIIIlI(), class_18522));
    }

    @Override
    public void IllIIIllIIIIlIlIlIllIIlll(double d, double d2, double d3) {
        this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(d, d2, d3, this.IIIIlIllIlIIlIIlIllIlIlll, this.IlIlIIlllIllllllllIIIlIlI);
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_1521 class_15212) {
        this.IIlllIlIlllIllIIIlllIIlIl().lIlIlIIIIIIlIIllllIlIIllI().lllIlIIlIIIlIlIIIllIlllIl(this, new class_0842(class_15212, 4));
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl(class_1521 class_15212) {
        this.IIlllIlIlllIllIIIlllIIlIl().lIlIlIIIIIIlIIllllIlIIllI().lllIlIIlIIIlIlIIIllIlllIl(this, new class_0842(class_15212, 5));
    }

    @Override
    public void lIlIllIIlIIlIIlIIlIIlIIll() {
        if (this.lllIIIllIIIIlllIlIIllIIll != null) {
            this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new class_1170(this.lIIlIlIlIlIllIIlIIllllIll));
        }
    }

    public class_0976 IIlllIlIlllIllIIIlllIIlIl() {
        return (class_0976)this.lIlIllIIlIIlIIlIIlIIlIIll;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_2243 class_22432) {
        this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(class_22432);
        this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new class_0742(3, class_22432.lllIIIllIIIIlllIlIIllIIll()));
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(IChatComponent class_22552) {
        this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new class_0710(class_22552));
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(int n, String string) {
        if ("seed".equals(string) && !this.lllIlIIlIIIlIlIIIllIlllIl.llIIlIIllIIllIlIIllIIllII()) {
            return true;
        }
        if (!("tell".equals(string) || "help".equals(string) || "me".equals(string))) {
            if (this.lllIlIIlIIIlIlIIIllIlllIl.lIIIllIIIIIllllIlIlIllIll().IlIIIIIllllllIIlllIllllll(this.lIIlIlllIIlIIIIlIlIIIIlll())) {
                class_1750 class_17502 = (class_1750)this.lllIlIIlIIIlIlIIIllIlllIl.lIIIllIIIIIllllIlIlIllIll().llIIllIllIlIIlIIllIllllll().lllIIIllIIIIlllIlIIllIIll((Object)this.lIIlIlllIIlIIIIlIlIIIIlll());
                return class_17502 != null ? class_17502.lllIIIllIIIIlllIlIIllIIll() >= n : this.lllIlIIlIIIlIlIIIllIlllIl.IllIIlllllllIIlIIlIIIIlIl() >= n;
            }
            return false;
        }
        return true;
    }

    public String llIllllIlIllIIIlIllIIlIlI() {
        String string = this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl().toString();
        string = string.substring(string.indexOf("/") + 1);
        string = string.substring(0, string.indexOf(":"));
        return string;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0681 class_06812) {
        this.lIIIIlIlIIlllllIIllIIlIII = class_06812.IlIllllllIIlIIllllIIlIIIl();
        int n = 256 >> class_06812.lIlllIlllIIIIlIIlllIllIII();
        if (n <= 3 || n < 20) {
            // empty if block
        }
        this.IIlIlIIIlIIllIlIlIlIlIIll = class_06812.IlIIIIIllllllIIlllIllllll();
        this.IIIIlllllIlllIIllIIIlIllI = class_06812.lIllllIIlIIIlIllllllIIIll();
        if (this.lllIlIIlIIIlIlIIIllIlllIl.llIIIlllIlllIlIllIIIIllIl() && this.lllIlIIlIIIlIlIIIllIlllIl.IIIIIIIIlIllIIllIIlllIllI().equals(this.llllIIIIlIIIlIIIIIIlIllll())) {
            this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(class_06812.IIIllIIlIIIIIIlIlIIllIIlI());
        }
        this.lllIlIIlIIIlIlIIIllIlllIl(1, !class_06812.IllIIlllllllIIlIIlIIIIlIl());
    }

    public class_1210 lIlllIlllIlIIIIlllIlIlIIl() {
        return this.IIlIlIIIlIIllIlIlIlIlIIll;
    }

    public void lllIIIllIIIIlllIlIIllIIll(String string) {
        this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new class_1147("MC|RPack", string.getBytes(Charsets.UTF_8)));
    }

    @Override
    public class_2208 lllIIlIIIllllllIIIIlIlIlI() {
        return new class_2208(MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll), MathHelper.IlIllllllIIlIIllllIIlIIIl(this.llIIlIlIlllIIllIlIlllIllI + 0.5), MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IllIIIIllIIllIllIlllIlIIl));
    }

    public void IlIIlllllIIlIlIlllllIllll() {
        this.IlIlIIlllIIlIlllllIlIIIIl = class_0220.lllIIIlIIlIlIllIIIIIlIIll();
    }

    public class_0084 IllIIIIllIIllIllIlllIlIIl() {
        return this.llIIllIllIlIIlIIllIllllll;
    }

    public void IlIlIIlllIIlIllIIIlllllIl(class_1521 class_15212) {
        if (class_15212 instanceof class_0814) {
            this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new class_0175(class_15212.llllllIlIllllIlIlIlIIIIlI()));
        } else {
            this.llIIlllIllIllllIIIlIIIIII.add(class_15212.llllllIlIllllIlIlIlIIIIlI());
        }
    }

    public long IIIIIIIIlIllIIllIIlllIllI() {
        return this.IlIlIIlllIIlIlllllIlIIIIl;
    }
}

