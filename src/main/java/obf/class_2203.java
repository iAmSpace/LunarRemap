package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import net.minecraft.network.play.server.S2BPacketChangeGameState;
import optifine.Config;
import net.minecraft.util.MathHelper;
import net.minecraft.profiler.Profiler;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_2203
extends class_0976 {
    private class_0209 llIIIIllIIIIIIIlIIIlIIIIl;
    private TreeSet IIllIllIIllIIlllIIIlIlllI;
    private List llllllIlIllllIlIlIlIIIIlI = new ArrayList();
    private int lIlIIllllIlIIIIllIIIIlIIl = 0;
    private boolean llIlllIIllIlllIlIlIlIIIll = false;
    public Set lllIIIllIIIIlllIlIIllIIll = new HashSet();
    private Set IIIIlIIlIIIllIIIIllIIIlII = new HashSet();
    private static final Logger lllIIIIIIlIlllIIlIlIIIllI = LogManager.getLogger();

    public class_2203(class_0220 class_02202, class_0028 class_00282, String string, int n, class_1078 class_10782, Profiler class_12422) {
        super(class_02202, class_00282, string, n, class_10782, class_12422);
        this.IIIIlIlIIlIIIIlIlllIlIIII();
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1078 class_10782) {
        super.lllIIIllIIIIlllIlIIllIIll(class_10782);
        this.IIIIlIlIIlIIIIlIlllIlIIII();
    }

    private void IIIIlIlIIlIIIIlIlllIlIIII() {
        try {
            Field[] arrfield = class_0976.class.getDeclaredFields();
            int n = this.lllIIIllIIIIlllIlIIllIIll(arrfield, Set.class, 0);
            int n2 = this.lllIIIllIIIIlllIlIIllIIll(arrfield, TreeSet.class, n);
            int n3 = this.lllIIIllIIIIlllIlIIllIIll(arrfield, List.class, n2);
            if (n >= 0 && n2 >= 0 && n3 >= 0) {
                Field field = arrfield[n];
                Field field2 = arrfield[n2];
                Field field3 = arrfield[n3];
                field.setAccessible(true);
                field2.setAccessible(true);
                field3.setAccessible(true);
                this.IIllIllIIllIIlllIIIlIlllI = (TreeSet)field2.get(this);
                this.llllllIlIllllIlIlIlIIIIlI = (List)field3.get(this);
                Set set = (Set)field.get(this);
                if (set instanceof class_0209) {
                    return;
                }
                this.llIIIIllIIIIIIIlIIIlIIIIl = new class_0209(set);
                field.set(this, this.llIIIIllIIIIIIIlIIIlIIIIl);
                Config.lllIIIllIIIIlllIlIIllIIll("WorldServer.nextTickSet updated");
                return;
            }
            Config.lllIlIIlIIIlIlIIIllIlllIl("Error updating WorldServer.nextTickSet");
        }
        catch (Exception exception) {
            Config.lllIlIIlIIIlIlIIIllIlllIl("Error setting WorldServer.nextTickSet: " + exception.getMessage());
        }
    }

    private int lllIIIllIIIIlllIlIIllIIll(Field[] arrfield, Class class_, int n) {
        if (n < 0) {
            return -1;
        }
        for (int i = n; i < arrfield.length; ++i) {
            Field field = arrfield[i];
            if (field.getType() != class_) continue;
            return i;
        }
        return -1;
    }

    @Override
    public List lllIIIllIIIIlllIlIIllIIll(class_0723 class_07232, boolean bl) {
        if (this.llIIIIllIIIIIIIlIIIlIIIIl != null && this.IIllIllIIllIIlllIIIlIlllI != null && this.llllllIlIllllIlIlIlIIIIlI != null) {
            ArrayList<Object> arrayList = null;
            class_1108 class_11082 = class_07232.IllIIIllIIIIlIlIlIllIIlll();
            int n = (class_11082.lllIIIllIIIIlllIlIIllIIll << 4) - 2;
            int n2 = n + 16 + 2;
            int n3 = (class_11082.lllIlIIlIIIlIlIIIllIlllIl << 4) - 2;
            int n4 = n3 + 16 + 2;
            for (int i = 0; i < 2; ++i) {
                Iterator iterator;
                Object object;
                if (i == 0) {
                    object = new TreeSet();
                    for (int j = -1; j <= 1; ++j) {
                        for (int k = -1; k <= 1; ++k) {
                            HashSet hashSet = this.llIIIIllIIIIIIIlIIIlIIIIl.lllIlIIlIIIlIlIIIllIlllIl(class_11082.lllIIIllIIIIlllIlIIllIIll + j, class_11082.lllIlIIlIIIlIlIIIllIlllIl + k);
                            ((TreeSet)object).addAll(hashSet);
                        }
                    }
                    iterator = ((TreeSet)object).iterator();
                } else {
                    iterator = this.llllllIlIllllIlIlIlIIIIlI.iterator();
                    if (!this.llllllIlIllllIlIlIlIIIIlI.isEmpty()) {
                        lllIIIIIIlIlllIIlIlIIIllI.debug("toBeTicked = " + this.llllllIlIllllIlIlIlIIIIlI.size());
                    }
                }
                while (iterator.hasNext()) {
                    object = (class_1505)iterator.next();
                    if (((class_1505)object).lllIIIllIIIIlllIlIIllIIll < n || ((class_1505)object).lllIIIllIIIIlllIlIIllIIll >= n2 || ((class_1505)object).IlIllllllIIlIIllllIIlIIIl < n3 || ((class_1505)object).IlIllllllIIlIIllllIIlIIIl >= n4) continue;
                    if (bl) {
                        this.llIIIIllIIIIIIIlIIIlIIIIl.remove(object);
                        this.IIllIllIIllIIlllIIIlIlllI.remove(object);
                        iterator.remove();
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList<Object>();
                    }
                    arrayList.add(object);
                }
            }
            return arrayList;
        }
        return super.lllIIIllIIIIlllIlIIllIIll(class_07232, bl);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll() {
        super.lllIIIllIIIIlllIlIIllIIll();
        if (!Config.IlIIllIlIlIllIIIlIIlIlIIl()) {
            this.llIlIIlllIIIIIllIIlIlIIII();
        }
        if (Config.IllIIIllIIIIlIlIlIllIIlll) {
            Config.IllIIIllIIIIlIlIlIllIIlll = false;
            class_2164.lllIIIllIIIIlllIlIIllIIll(Config.getGameSettings(), this);
        }
    }

    @Override
    protected void IlIIIIIllllllIIlllIllllll() {
        if (!Config.IlllIIIllllIIllIllIlIIlIl()) {
            this.lllIIIIlIlIIlIIlllIIIIIIl();
        }
        super.IlIIIIIllllllIIlllIllllll();
    }

    private void lllIIIIlIlIIlIIlllIIIIIIl() {
        if (this.IIlllIlIlllIllIIIlllIIlIl.IlIlIIlIlIllIIlIlIIllIIIl() || this.IIlllIlIlllIllIIIlllIIlIl.lllIIlIIIllllllIIIIlIlIlI()) {
            this.IIlllIlIlllIllIIIlllIIlIl.lIllllIIlIIIlIllllllIIIll(0);
            this.IIlllIlIlllIllIIIlllIIlIl.lllIlIIlIIIlIlIIIllIlllIl(false);
            this.lIIIIlIlIIlllllIIllIIlIII(0.0f);
            this.IIlllIlIlllIllIIIlllIIlIl.IlIIIIIllllllIIlllIllllll(0);
            this.IIlllIlIlllIllIIIlllIIlIl.lllIIIllIIIIlllIlIIllIIll(false);
            this.IIIllIllIIlIlIlIlIllllIIl(0.0f);
            this.llIIlIIllIIllIlIIllIIllII().lIIIllIIIIIllllIlIlIllIll().lllIIIllIIIIlllIlIIllIIll(new S2BPacketChangeGameState(2, 0.0f));
            this.llIIlIIllIIllIlIIllIIllII().lIIIllIIIIIllllIlIlIllIll().lllIIIllIIIIlllIlIIllIIll(new S2BPacketChangeGameState(7, 0.0f));
            this.llIIlIIllIIllIlIIllIIllII().lIIIllIIIIIllllIlIlIllIll().lllIIIllIIIIlllIlIIllIIll(new S2BPacketChangeGameState(8, 0.0f));
        }
    }

    private void llIlIIlllIIIIIllIIlIlIIII() {
        if (this.IIlllIlIlllIllIIIlllIIlIl.IlIlIIlllIIlIllIIIlllllIl().lllIIIllIIIIlllIlIIllIIll() == 1) {
            long l = this.IIlllIlIlllIllIIIlllIIlIl();
            long l2 = l % 24000L;
            if (Config.IlIlIllIIlIIIIlllIlIllIlI()) {
                if (l2 <= 1000L) {
                    this.lllIIIllIIIIlllIlIIllIIll(l - l2 + 1001L);
                }
                if (l2 >= 11000L) {
                    this.lllIIIllIIIIlllIlIIllIIll(l - l2 + 24001L);
                }
            }
            if (Config.lIlIIllIllIIIIIlIllllIIIl()) {
                if (l2 <= 14000L) {
                    this.lllIIIllIIIIlllIlIIllIIll(l - l2 + 14001L);
                }
                if (l2 >= 22000L) {
                    this.lllIIIllIIIIlllIlIIllIIll(l - l2 + 24000L + 14001L);
                }
            }
        }
    }

    @Override
    public void IlIIIIIllllllIIlllIllllll(class_1521 class_15212) {
        if (this.IIIllIllIIlIlIlIlIllllIIl(class_15212) && class_15212 instanceof class_1965) {
            float f;
            class_1965 class_19652 = (class_1965)class_15212;
            int n = class_1812.lllIIIllIIIIlllIlIIllIIll(class_19652);
            ++n;
            if (class_19652 instanceof class_1168 && (f = class_19652.lllIlIIlIIIlIlIIIllIlllIl(1.0f)) > 0.5f) {
                n += 2;
            }
            class_1812.lllIIIllIIIIlllIlIIllIIll(class_19652, n);
            if (class_19652 instanceof class_0339) {
                class_0339 class_03392 = (class_0339)class_19652;
                class_1812.lllIIIllIIIIlllIlIIllIIll(class_03392);
            }
        } else {
            super.IlIIIIIllllllIIlllIllllll(class_15212);
            if (Config.lIIllllIllIlllllIIllIllIl()) {
                Thread.currentThread();
                Thread.yield();
            }
        }
    }

    private boolean IIIllIllIIlIlIlIlIllllIIl(class_1521 class_15212) {
        double d;
        if (!(class_15212 instanceof class_1965)) {
            return false;
        }
        class_1965 class_19652 = (class_1965)class_15212;
        if (class_19652.g_()) {
            return false;
        }
        if (class_19652.lIIllIlIIlIIlllllIlIIllIl > 0) {
            return false;
        }
        if (class_15212.IlllIIIllllIIllIllIlIIlIl < 20) {
            return false;
        }
        if (this.lIllllIIlIIIlIllllllIIIll.size() != 1) {
            return false;
        }
        class_1521 class_15213 = (class_1521)this.lIllllIIlIIIlIllllllIIIll.get(0);
        double d2 = Math.max(Math.abs(class_15212.IlIIlllllIIlIlIlllllIllll - class_15213.IlIIlllllIIlIlIlllllIllll) - 16.0, 0.0);
        double d3 = d2 * d2 + (d = Math.max(Math.abs(class_15212.IllIIIIllIIllIllIlllIlIIl - class_15213.IllIIIIllIIllIllIlllIlIIl) - 16.0, 0.0)) * d;
        return !class_15212.lllIIIllIIIIlllIlIIllIIll(d3);
    }

    @Override
    protected void r_() {
        super.r_();
        this.IIIIlIIlIIIllIIIIllIIIlII.clear();
        int n = this.IIIllIIlIIIIIIlIlIIllIIlI();
        if (n > 10) {
            if (n != this.lIlIIllllIlIIIIllIIIIlIIl) {
                this.lIlIIllllIlIIIIllIIIIlIIl = n;
                this.llIlllIIllIlllIlIlIlIIIll = false;
            } else if (!this.llIlllIIllIlllIlIlIlIIIll) {
                this.llIlllIIllIlllIlIlIlIIIll = true;
            } else {
                for (int i = 0; i < this.lIllllIIlIIIlIllllllIIIll.size(); ++i) {
                    class_0814 class_08142 = (class_0814)this.lIllllIIlIIIlIllllllIIIll.get(i);
                    int n2 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_08142.IlIIlllllIIlIlIlllllIllll / 16.0);
                    int n3 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_08142.IllIIIIllIIllIllIlllIlIIl / 16.0);
                    int n4 = 10;
                    for (int j = -n4; j <= n4; ++j) {
                        for (int k = -n4; k <= n4; ++k) {
                            this.IIIIlIIlIIIllIIIIllIIIlII.add(new class_1108(j + n2, k + n3));
                        }
                    }
                }
                if (this.lllIIIllIIIIlllIlIIllIIll.size() > 0) {
                    this.IIIIlIIlIIIllIIIIllIIIlII.addAll(this.lllIIIllIIIIlllIlIIllIIll);
                    this.lllIIIllIIIIlllIlIIllIIll.clear();
                }
            }
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        int n3 = this.IIIllIIlIIIIIIlIlIIllIIlI();
        if (n3 > 10) {
            this.lllIIIllIIIIlllIlIIllIIll.add(new class_1108(n, n2));
        }
    }

    @Override
    protected void p_() {
        Set set = this.IIIIIIIIlIllIIllIIlllIllI;
        if (this.IIIIlIIlIIIllIIIIllIIIlII.size() > 0) {
            this.IIIIIIIIlIllIIllIIlllIllI = this.IIIIlIIlIIIllIIIIllIIIlII;
        }
        super.p_();
        this.IIIIIIIIlIllIIllIIlllIllI = set;
    }
}

