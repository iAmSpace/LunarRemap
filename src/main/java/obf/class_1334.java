package obf;/*
 * Decompiled with CFR 0.150.
 */
import com.moonsworth.lunar.client.LunarClient;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.crash.CrashReport;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.profiler.Profiler;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.UUID;

public abstract class class_1334
implements class_1843 {
    public boolean lllIlIIlIIIlIlIIIllIlllIl;
    public List IlIllllllIIlIIllllIIlIIIl = new ArrayList();
    protected List lIlllIlllIIIIlIIlllIllIII = new ArrayList();
    public List IlIIIIIllllllIIlllIllllll = new ArrayList();
    private List lllIIIllIIIIlllIlIIllIIll = new ArrayList();
    private List IlIlIIlllIllllllllIIIlIlI = new ArrayList();
    public List lIllllIIlIIIlIllllllIIIll = new ArrayList();
    public List IIIllIIlIIIIIIlIlIIllIIlI = new ArrayList();
    private long llllIIIIlIIIlIIIIIIlIllll = 0xFFFFFFL;
    public int IllIIlllllllIIlIIlIIIIlIl;
    protected int IIIllIllIIlIlIlIlIllllIIl = new Random().nextInt();
    protected final int IllIIIllIIIIlIlIlIllIIlll = 1013904223;
    protected float lIIIIlIlIIlllllIIllIIlIII;
    protected float llIIlllIllIllllIIIlIIIIII;
    protected float llIIllIllIlIIlIIllIllllll;
    protected float lllIIlIIIllllllIIIIlIlIlI;
    public int IlIlllIIIIIIlIIllIIllIlll;
    public class_1999 IlIlIIlIlIllIIlIlIIllIIIl;
    public Random lllllIlllIIllIlIIlIIIllII = new Random();
    public final class_1163 IlIlIIlllIIlIllIIIlllllIl;
    protected List lIIlIIIIIlIlllIlIIlIlIlll = new ArrayList();
    protected class_1848 lIlIlIIlIIIIlIIIIIlllIIII;
    protected final class_0028 IlIIIlIIIIllIIIllIIIIIIll;
    protected class_0770 IIlllIlIlllIllIIIlllIIlIl;
    public boolean lIlIllIIlIIlIIlIIlIIlIIll;
    public class_1641 llIIlIllIllllIlIIIIlIIlll;
    public final class_0180 llIllllIlIllIIIlIllIIlIlI;
    protected final class_2107 lIlllIlllIlIIIIlllIlIlIIl = new class_2107(this);
    public final Profiler IlIIlllllIIlIlIlllllIllll;
    private final Calendar llIIIIllIIIIIIIlIIIlIIIIl = Calendar.getInstance();
    protected class_0141 llIIlIlIlllIIllIlIlllIllI = new class_0141();
    public boolean IllIIIIllIIllIllIlllIlIIl;
    protected Set IIIIIIIIlIllIIllIIlllIllI = new HashSet();
    private int IIllIllIIllIIlllIIIlIlllI = this.lllllIlllIIllIlIIlIIIllII.nextInt(12000);
    protected boolean IIlIIlIlIlIllIIlIlIIIIlll = true;
    protected boolean llIIIlllIlllIlIllIIIIllIl = true;
    private ArrayList llllllIlIllllIlIlIlIIIIlI = new ArrayList();
    private boolean lIlIIllllIlIIIIllIIIIlIIl;
    int[] IIIIlIllIlIIlIIlIllIlIlll = new int[32768];

    @Override
    public class_0672 a_(int n, int n2) {
        if (this.IlIIIIIllllllIIlllIllllll(n, 0, n2)) {
            class_0723 class_07232 = this.lIlllIlllIIIIlIIlllIllIII(n, n2);
            try {
                return class_07232.lllIIIllIIIIlllIlIIllIIll(n & 0xF, n2 & 0xF, this.IlIlIIlllIIlIllIIIlllllIl.IlIIIIIllllllIIlllIllllll);
            }
            catch (Throwable throwable) {
                return class_0672.IlIlIIlIlIllIIlIlIIllIIIl;
            }
        }
        return this.IlIlIIlllIIlIllIIIlllllIl.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(n, n2);
    }

    public class_1076 IIIllIllIIlIlIlIlIllllIIl() {
        return this.IlIlIIlllIIlIllIIIlllllIl.IlIIIIIllllllIIlllIllllll;
    }

    public class_1334(class_0028 class_00282, String string, class_1163 class_11632, class_1078 class_10782, Profiler class_12422) {
        this.IlIIIlIIIIllIIIllIIIIIIll = class_00282;
        this.IlIIlllllIIlIlIlllllIllll = class_12422;
        this.IIlllIlIlllIllIIIlllIIlIl = new class_0770(class_10782, string);
        this.IlIlIIlllIIlIllIIIlllllIl = class_11632;
        this.llIIlIllIllllIlIIIIlIIlll = new class_1641(class_00282);
        class_0180 class_01802 = (class_0180)this.llIIlIllIllllIlIIIIlIIlll.lllIIIllIIIIlllIlIIllIIll(class_0180.class, "villages");
        if (class_01802 == null) {
            this.llIllllIlIllIIIlIllIIlIlI = new class_0180(this);
            this.llIIlIllIllllIlIIIIlIIlll.lllIIIllIIIIlllIlIIllIIll("villages", this.llIllllIlIllIIIlIllIIlIlI);
        } else {
            this.llIllllIlIllIIIlIllIIlIlI = class_01802;
            this.llIllllIlIllIIIlIllIIlIlI.lllIIIllIIIIlllIlIIllIIll(this);
        }
        class_11632.lllIIIllIIIIlllIlIIllIIll(this);
        this.lIlIlIIlIIIIlIIIIIlllIIII = this.lllIlIIlIIIlIlIIIllIlllIl();
        this.lllllIlllIIllIlIIlIIIllII();
        this.lIllllIIlIIIlIllllllIIIll();
    }

    public class_1334(class_0028 class_00282, String string, class_1078 class_10782, class_1163 class_11632, Profiler class_12422) {
        class_0180 class_01802;
        this.IlIIIlIIIIllIIIllIIIIIIll = class_00282;
        this.IlIIlllllIIlIlIlllllIllll = class_12422;
        this.llIIlIllIllllIlIIIIlIIlll = new class_1641(class_00282);
        this.IIlllIlIlllIllIIIlllIIlIl = class_00282.IlIllllllIIlIIllllIIlIIIl();
        this.IlIlIIlllIIlIllIIIlllllIl = class_11632 != null ? class_11632 : (this.IIlllIlIlllIllIIIlllIIlIl != null && this.IIlllIlIlllIllIIIlllIIlIl.IllIIIllIIIIlIlIlIllIIlll() != 0 ? class_1163.lllIIIllIIIIlllIlIIllIIll(this.IIlllIlIlllIllIIIlllIIlIl.IllIIIllIIIIlIlIlIllIIlll()) : class_1163.lllIIIllIIIIlllIlIIllIIll(0));
        if (this.IIlllIlIlllIllIIIlllIIlIl == null) {
            this.IIlllIlIlllIllIIIlllIIlIl = new class_0770(class_10782, string);
        } else {
            this.IIlllIlIlllIllIIIlllIIlIl.lllIIIllIIIIlllIlIIllIIll(string);
        }
        this.IlIlIIlllIIlIllIIIlllllIl.lllIIIllIIIIlllIlIIllIIll(this);
        this.lIlIlIIlIIIIlIIIIIlllIIII = this.lllIlIIlIIIlIlIIIllIlllIl();
        if (!this.IIlllIlIlllIllIIIlllIIlIl.lIlIllIIlIIlIIlIIlIIlIIll()) {
            try {
                this.lllIIIllIIIIlllIlIIllIIll(class_10782);
            }
            catch (Throwable throwable) {
                CrashReport class_02232 = CrashReport.lllIIIllIIIIlllIlIIllIIll(throwable, "Exception initializing level");
                try {
                    this.addWorldInfoToCrashReport(class_02232);
                }
                catch (Throwable throwable2) {
                    // empty catch block
                }
                throw new class_0892(class_02232);
            }
            this.IIlllIlIlllIllIIIlllIIlIl.IlIllllllIIlIIllllIIlIIIl(true);
        }
        if ((class_01802 = (class_0180)this.llIIlIllIllllIlIIIIlIIlll.lllIIIllIIIIlllIlIIllIIll(class_0180.class, "villages")) == null) {
            this.llIllllIlIllIIIlIllIIlIlI = new class_0180(this);
            this.llIIlIllIllllIlIIIIlIIlll.lllIIIllIIIIlllIlIIllIIll("villages", this.llIllllIlIllIIIlIllIIlIlI);
        } else {
            this.llIllllIlIllIIIlIllIIlIlI = class_01802;
            this.llIllllIlIllIIIlIllIIlIlI.lllIIIllIIIIlllIlIIllIIll(this);
        }
        this.lllllIlllIIllIlIIlIIIllII();
        this.lIllllIIlIIIlIllllllIIIll();
    }

    protected abstract class_1848 lllIlIIlIIIlIlIIIllIlllIl();

    protected void lllIIIllIIIIlllIlIIllIIll(class_1078 class_10782) {
        this.IIlllIlIlllIllIIIlllIIlIl.IlIllllllIIlIIllllIIlIIIl(true);
    }

    public void IllIIIllIIIIlIlIlIllIIlll() {
        this.IlIIIlIIIIllIIIllIIIIIIll(8, 64, 8);
    }

    public Block lllIlIIlIIIlIlIIIllIlllIl(int n, int n2) {
        int n3 = 63;
        while (!this.lIlllIlllIIIIlIIlllIllIII(n, n3 + 1, n2)) {
            ++n3;
        }
        return this.a_(n, n3, n2);
    }

    @Override
    public Block a_(int n, int n2, int n3) {
        if (n >= -30000000 && n3 >= -30000000 && n < 30000000 && n3 < 30000000 && n2 >= 0 && n2 < 256) {
            class_0723 class_07232 = null;
            try {
                class_07232 = this.IlIIIIIllllllIIlllIllllll(n >> 4, n3 >> 4);
                return class_07232.lllIlIIlIIIlIlIIIllIlllIl(n & 0xF, n2, n3 & 0xF);
            }
            catch (Throwable throwable) {
                CrashReport class_02232 = CrashReport.lllIIIllIIIIlllIlIIllIIll(throwable, "Exception getting block type in world");
                class_0799 class_07992 = class_02232.lllIIIllIIIIlllIlIIllIIll("Requested block coordinates");
                class_07992.lllIIIllIIIIlllIlIIllIIll("Found chunk", class_07232 == null);
                throw new class_0892(class_02232);
            }
        }
        return Blocks.lllIIIllIIIIlllIlIIllIIll;
    }

    @Override
    public boolean lIlllIlllIIIIlIIlllIllIII(int n, int n2, int n3) {
        return this.a_(n, n2, n3).lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll;
    }

    public boolean IlIIIIIllllllIIlllIllllll(int n, int n2, int n3) {
        return n2 >= 0 && n2 < 256 ? this.IlIllllllIIlIIllllIIlIIIl(n >> 4, n3 >> 4) : false;
    }

    public boolean IlIllllllIIlIIllllIIlIIIl(int n, int n2, int n3, int n4) {
        return this.lllIlIIlIIIlIlIIIllIlllIl(n - n4, n2 - n4, n3 - n4, n + n4, n2 + n4, n3 + n4);
    }

    public boolean lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, int n3, int n4, int n5, int n6) {
        if (n5 >= 0 && n2 < 256) {
            n3 >>= 4;
            n6 >>= 4;
            for (int i = n >>= 4; i <= (n4 >>= 4); ++i) {
                for (int j = n3; j <= n6; ++j) {
                    if (this.IlIllllllIIlIIllllIIlIIIl(i, j)) continue;
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    protected boolean IlIllllllIIlIIllllIIlIIIl(int n, int n2) {
        return this.lIlIlIIlIIIIlIIIIIlllIIII.lllIIIllIIIIlllIlIIllIIll(n, n2);
    }

    public class_0723 lIlllIlllIIIIlIIlllIllIII(int n, int n2) {
        return this.IlIIIIIllllllIIlllIllllll(n >> 4, n2 >> 4);
    }

    public class_0723 IlIIIIIllllllIIlllIllllll(int n, int n2) {
        return this.lIlIlIIlIIIIlIIIIIlllIIII.lIlllIlllIIIIlIIlllIllIII(n, n2);
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, Block class_05492, int n4, int n5) {
        if (n >= -30000000 && n3 >= -30000000 && n < 30000000 && n3 < 30000000) {
            if (n2 < 0) {
                return false;
            }
            if (n2 >= 256) {
                return false;
            }
            class_0723 class_07232 = this.IlIIIIIllllllIIlllIllllll(n >> 4, n3 >> 4);
            Block class_05493 = null;
            if ((n5 & 1) != 0) {
                class_05493 = class_07232.lllIlIIlIIIlIlIIIllIlllIl(n & 0xF, n2, n3 & 0xF);
            }
            boolean bl = class_07232.lllIIIllIIIIlllIlIIllIIll(n & 0xF, n2, n3 & 0xF, class_05492, n4);
            this.IlIIlllllIIlIlIlllllIllll.startSection("checkLight");
            this.lllllIlllIIllIlIIlIIIllII(n, n2, n3);
            this.IlIIlllllIIlIlIlllllIllll.endSection();
            if (bl) {
                if ((n5 & 2) != 0 && (!this.IllIIIIllIIllIllIlllIlIIl || (n5 & 4) == 0) && class_07232.IIIllIllIIlIlIlIlIllllIIl()) {
                    this.IIIllIIlIIIIIIlIlIIllIIlI(n, n2, n3);
                }
                if (!this.IllIIIIllIIllIllIlllIlIIl && (n5 & 1) != 0) {
                    this.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3, class_05493);
                    if (class_05492.IIllIllIIllIIlllIIIlIlllI()) {
                        this.lIllllIIlIIIlIllllllIIIll(n, n2, n3, class_05492);
                    }
                }
            }
            return bl;
        }
        return false;
    }

    @Override
    public int IlIllllllIIlIIllllIIlIIIl(int n, int n2, int n3) {
        if (n >= -30000000 && n3 >= -30000000 && n < 30000000 && n3 < 30000000) {
            if (n2 < 0) {
                return 0;
            }
            if (n2 >= 256) {
                return 0;
            }
            class_0723 class_07232 = this.IlIIIIIllllllIIlllIllllll(n >> 4, n3 >> 4);
            return class_07232.IlIllllllIIlIIllllIIlIIIl(n &= 0xF, n2, n3 &= 0xF);
        }
        return 0;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4, int n5) {
        if (n >= -30000000 && n3 >= -30000000 && n < 30000000 && n3 < 30000000) {
            int n6;
            int n7;
            if (n2 < 0) {
                return false;
            }
            if (n2 >= 256) {
                return false;
            }
            class_0723 class_07232 = this.IlIIIIIllllllIIlllIllllll(n >> 4, n3 >> 4);
            boolean bl = class_07232.lllIIIllIIIIlllIlIIllIIll(n7 = n & 0xF, n2, n6 = n3 & 0xF, n4);
            if (bl) {
                Block class_05492 = class_07232.lllIlIIlIIIlIlIIIllIlllIl(n7, n2, n6);
                if ((n5 & 2) != 0 && (!this.IllIIIIllIIllIllIlllIlIIl || (n5 & 4) == 0) && class_07232.IIIllIllIIlIlIlIlIllllIIl()) {
                    this.IIIllIIlIIIIIIlIlIIllIIlI(n, n2, n3);
                }
                if (!this.IllIIIIllIIllIllIlllIlIIl && (n5 & 1) != 0) {
                    this.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3, class_05492);
                    if (class_05492.IIllIllIIllIIlllIIIlIlllI()) {
                        this.lIllllIIlIIIlIllllllIIIll(n, n2, n3, class_05492);
                    }
                }
            }
            return bl;
        }
        return false;
    }

    public boolean lIllllIIlIIIlIllllllIIIll(int n, int n2, int n3) {
        return this.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, Blocks.lllIIIllIIIIlllIlIIllIIll, 0, 3);
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, boolean bl) {
        Block class_05492 = this.a_(n, n2, n3);
        if (class_05492.lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll) {
            return false;
        }
        int n4 = this.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        this.IlIllllllIIlIIllllIIlIIIl(2001, n, n2, n3, Block.lllIIIllIIIIlllIlIIllIIll(class_05492) + (n4 << 12));
        if (bl) {
            class_05492.lllIIIllIIIIlllIlIIllIIll(this, n, n2, n3, n4, 0);
        }
        return this.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, Blocks.lllIIIllIIIIlllIlIIllIIll, 0, 3);
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, Block class_05492) {
        return this.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, class_05492, 0, 3);
    }

    public void IIIllIIlIIIIIIlIlIIllIIlI(int n, int n2, int n3) {
        for (int i = 0; i < this.lIIlIIIIIlIlllIlIIlIlIlll.size(); ++i) {
            ((class_2249)this.lIIlIIIIIlIlllIlIIlIlIlll.get(i)).lllIIIllIIIIlllIlIIllIIll(n, n2, n3);
        }
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, int n3, Block class_05492) {
        this.IlIllllllIIlIIllllIIlIIIl(n, n2, n3, class_05492);
    }

    public void lIlllIlllIIIIlIIlllIllIII(int n, int n2, int n3, int n4) {
        int n5;
        if (n3 > n4) {
            n5 = n4;
            n4 = n3;
            n3 = n5;
        }
        if (!this.IlIlIIlllIIlIllIIIlllllIl.IIIllIIlIIIIIIlIlIIllIIlI) {
            for (n5 = n3; n5 <= n4; ++n5) {
                this.IlIllllllIIlIIllllIIlIIIl(class_1346.lllIIIllIIIIlllIlIIllIIll, n, n5, n2);
            }
        }
        this.IlIllllllIIlIIllllIIlIIIl(n, n3, n2, n, n4, n2);
    }

    public void IlIllllllIIlIIllllIIlIIIl(int n, int n2, int n3, int n4, int n5, int n6) {
        for (int i = 0; i < this.lIIlIIIIIlIlllIlIIlIlIlll.size(); ++i) {
            ((class_2249)this.lIIlIIIIIlIlllIlIIlIlIlll.get(i)).lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3, n4, n5, n6);
        }
    }

    public void IlIllllllIIlIIllllIIlIIIl(int n, int n2, int n3, Block class_05492) {
        this.lIlllIlllIIIIlIIlllIllIII(n - 1, n2, n3, class_05492);
        this.lIlllIlllIIIIlIIlllIllIII(n + 1, n2, n3, class_05492);
        this.lIlllIlllIIIIlIIlllIllIII(n, n2 - 1, n3, class_05492);
        this.lIlllIlllIIIIlIIlllIllIII(n, n2 + 1, n3, class_05492);
        this.lIlllIlllIIIIlIIlllIllIII(n, n2, n3 - 1, class_05492);
        this.lIlllIlllIIIIlIIlllIllIII(n, n2, n3 + 1, class_05492);
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, int n3, Block class_05492, int n4) {
        if (n4 != 4) {
            this.lIlllIlllIIIIlIIlllIllIII(n - 1, n2, n3, class_05492);
        }
        if (n4 != 5) {
            this.lIlllIlllIIIIlIIlllIllIII(n + 1, n2, n3, class_05492);
        }
        if (n4 != 0) {
            this.lIlllIlllIIIIlIIlllIllIII(n, n2 - 1, n3, class_05492);
        }
        if (n4 != 1) {
            this.lIlllIlllIIIIlIIlllIllIII(n, n2 + 1, n3, class_05492);
        }
        if (n4 != 2) {
            this.lIlllIlllIIIIlIIlllIllIII(n, n2, n3 - 1, class_05492);
        }
        if (n4 != 3) {
            this.lIlllIlllIIIIlIIlllIllIII(n, n2, n3 + 1, class_05492);
        }
    }

    public void lIlllIlllIIIIlIIlllIllIII(int n, int n2, int n3, Block class_05492) {
        if (!this.IllIIIIllIIllIllIlllIlIIl) {
            Block class_05493 = this.a_(n, n2, n3);
            try {
                class_05493.lllIIIllIIIIlllIlIIllIIll(this, n, n2, n3, class_05492);
            }
            catch (Throwable throwable) {
                int n4;
                CrashReport class_02232 = CrashReport.lllIIIllIIIIlllIlIIllIIll(throwable, "Exception while updating neighbours");
                class_0799 class_07992 = class_02232.lllIIIllIIIIlllIlIIllIIll("net.minecraft.block.Block being updated");
                try {
                    n4 = this.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
                }
                catch (Throwable throwable2) {
                    n4 = -1;
                }
                class_07992.addCrashSectionCallable("Source block type", new class_1523(this, class_05492));
                class_0799.lllIIIllIIIIlllIlIIllIIll(class_07992, n, n2, n3, class_05493, n4);
                throw new class_0892(class_02232);
            }
        }
    }

    public boolean IlIIIIIllllllIIlllIllllll(int n, int n2, int n3, Block class_05492) {
        return false;
    }

    public boolean IllIIlllllllIIlIIlIIIIlIl(int n, int n2, int n3) {
        return this.IlIIIIIllllllIIlllIllllll(n >> 4, n3 >> 4).lIlllIlllIIIIlIIlllIllIII(n & 0xF, n2, n3 & 0xF);
    }

    public int IIIllIllIIlIlIlIlIllllIIl(int n, int n2, int n3) {
        if (n2 < 0) {
            return 0;
        }
        if (n2 >= 256) {
            n2 = 255;
        }
        return this.IlIIIIIllllllIIlllIllllll(n >> 4, n3 >> 4).lllIlIIlIIIlIlIIIllIlllIl(n & 0xF, n2, n3 & 0xF, 0);
    }

    public int IllIIIllIIIIlIlIlIllIIlll(int n, int n2, int n3) {
        return this.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3, true);
    }

    public int lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, int n3, boolean bl) {
        if (n >= -30000000 && n3 >= -30000000 && n < 30000000 && n3 < 30000000) {
            if (bl && this.a_(n, n2, n3).IlIIIIIllllllIIlllIllllll()) {
                int n4 = this.lllIlIIlIIIlIlIIIllIlllIl(n, n2 + 1, n3, false);
                int n5 = this.lllIlIIlIIIlIlIIIllIlllIl(n + 1, n2, n3, false);
                int n6 = this.lllIlIIlIIIlIlIIIllIlllIl(n - 1, n2, n3, false);
                int n7 = this.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3 + 1, false);
                int n8 = this.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3 - 1, false);
                if (n5 > n4) {
                    n4 = n5;
                }
                if (n6 > n4) {
                    n4 = n6;
                }
                if (n7 > n4) {
                    n4 = n7;
                }
                if (n8 > n4) {
                    n4 = n8;
                }
                return n4;
            }
            if (n2 < 0) {
                return 0;
            }
            if (n2 >= 256) {
                n2 = 255;
            }
            class_0723 class_07232 = this.IlIIIIIllllllIIlllIllllll(n >> 4, n3 >> 4);
            return class_07232.lllIlIIlIIIlIlIIIllIlllIl(n &= 0xF, n2, n3 &= 0xF, this.IllIIlllllllIIlIIlIIIIlIl);
        }
        return 15;
    }

    public int lIllllIIlIIIlIllllllIIIll(int n, int n2) {
        if (n >= -30000000 && n2 >= -30000000 && n < 30000000 && n2 < 30000000) {
            if (!this.IlIllllllIIlIIllllIIlIIIl(n >> 4, n2 >> 4)) {
                return 0;
            }
            class_0723 class_07232 = this.IlIIIIIllllllIIlllIllllll(n >> 4, n2 >> 4);
            return class_07232.lllIlIIlIIIlIlIIIllIlllIl(n & 0xF, n2 & 0xF);
        }
        return 64;
    }

    public int IIIllIIlIIIIIIlIlIIllIIlI(int n, int n2) {
        if (n >= -30000000 && n2 >= -30000000 && n < 30000000 && n2 < 30000000) {
            if (!this.IlIllllllIIlIIllllIIlIIIl(n >> 4, n2 >> 4)) {
                return 0;
            }
            class_0723 class_07232 = this.IlIIIIIllllllIIlllIllllll(n >> 4, n2 >> 4);
            return class_07232.IlIlIIlllIIlIllIIIlllllIl;
        }
        return 64;
    }

    public int lllIIIllIIIIlllIlIIllIIll(class_1346 class_13462, int n, int n2, int n3) {
        if (this.IlIlIIlllIIlIllIIIlllllIl.IIIllIIlIIIIIIlIlIIllIIlI && class_13462 == class_1346.lllIIIllIIIIlllIlIIllIIll) {
            return 0;
        }
        if (n2 < 0) {
            n2 = 0;
        }
        if (n2 >= 256) {
            return class_13462.IlIllllllIIlIIllllIIlIIIl;
        }
        if (n >= -30000000 && n3 >= -30000000 && n < 30000000 && n3 < 30000000) {
            int n4 = n >> 4;
            int n5 = n3 >> 4;
            if (!this.IlIllllllIIlIIllllIIlIIIl(n4, n5)) {
                return class_13462.IlIllllllIIlIIllllIIlIIIl;
            }
            if (this.a_(n, n2, n3).IlIIIIIllllllIIlllIllllll()) {
                int n6 = this.lllIlIIlIIIlIlIIIllIlllIl(class_13462, n, n2 + 1, n3);
                int n7 = this.lllIlIIlIIIlIlIIIllIlllIl(class_13462, n + 1, n2, n3);
                int n8 = this.lllIlIIlIIIlIlIIIllIlllIl(class_13462, n - 1, n2, n3);
                int n9 = this.lllIlIIlIIIlIlIIIllIlllIl(class_13462, n, n2, n3 + 1);
                int n10 = this.lllIlIIlIIIlIlIIIllIlllIl(class_13462, n, n2, n3 - 1);
                if (n7 > n6) {
                    n6 = n7;
                }
                if (n8 > n6) {
                    n6 = n8;
                }
                if (n9 > n6) {
                    n6 = n9;
                }
                if (n10 > n6) {
                    n6 = n10;
                }
                return n6;
            }
            class_0723 class_07232 = this.IlIIIIIllllllIIlllIllllll(n4, n5);
            return class_07232.lllIIIllIIIIlllIlIIllIIll(class_13462, n & 0xF, n2, n3 & 0xF);
        }
        return class_13462.IlIllllllIIlIIllllIIlIIIl;
    }

    public int lllIlIIlIIIlIlIIIllIlllIl(class_1346 class_13462, int n, int n2, int n3) {
        if (n2 < 0) {
            n2 = 0;
        }
        if (n2 >= 256) {
            n2 = 255;
        }
        if (n >= -30000000 && n3 >= -30000000 && n < 30000000 && n3 < 30000000) {
            int n4 = n >> 4;
            int n5 = n3 >> 4;
            if (!this.IlIllllllIIlIIllllIIlIIIl(n4, n5)) {
                return class_13462.IlIllllllIIlIIllllIIlIIIl;
            }
            class_0723 class_07232 = this.IlIIIIIllllllIIlllIllllll(n4, n5);
            return class_07232.lllIIIllIIIIlllIlIIllIIll(class_13462, n & 0xF, n2, n3 & 0xF);
        }
        return class_13462.IlIllllllIIlIIllllIIlIIIl;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1346 class_13462, int n, int n2, int n3, int n4) {
        if (n >= -30000000 && n3 >= -30000000 && n < 30000000 && n3 < 30000000 && n2 >= 0 && n2 < 256 && this.IlIllllllIIlIIllllIIlIIIl(n >> 4, n3 >> 4)) {
            class_0723 class_07232 = this.IlIIIIIllllllIIlllIllllll(n >> 4, n3 >> 4);
            class_07232.lllIIIllIIIIlllIlIIllIIll(class_13462, n & 0xF, n2, n3 & 0xF, n4);
            for (int i = 0; i < this.lIIlIIIIIlIlllIlIIlIlIlll.size(); ++i) {
                ((class_2249)this.lIIlIIIIIlIlllIlIIlIlIlll.get(i)).lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3);
            }
        }
    }

    public void lIIIIlIlIIlllllIIllIIlIII(int n, int n2, int n3) {
        for (int i = 0; i < this.lIIlIIIIIlIlllIlIIlIlIlll.size(); ++i) {
            ((class_2249)this.lIIlIIIIIlIlllIlIIlIlIlll.get(i)).lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3);
        }
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4) {
        int n5 = this.lllIIIllIIIIlllIlIIllIIll(class_1346.lllIIIllIIIIlllIlIIllIIll, n, n2, n3);
        int n6 = this.lllIIIllIIIIlllIlIIllIIll(class_1346.lllIlIIlIIIlIlIIIllIlllIl, n, n2, n3);
        if (n6 < n4) {
            n6 = n4;
        }
        return n5 << 20 | n6 << 4;
    }

    public float llIIlllIllIllllIIIlIIIIII(int n, int n2, int n3) {
        return this.IlIlIIlllIIlIllIIIlllllIl.IllIIlllllllIIlIIlIIIIlIl[this.IllIIIllIIIIlIlIlIllIIlll(n, n2, n3)];
    }

    public boolean lIIIIlIlIIlllllIIllIIlIII() {
        return this.IllIIlllllllIIlIIlIIIIlIl < 4;
    }

    public class_1112 lllIIIllIIIIlllIlIIllIIll(class_0864 class_08642, class_0864 class_08643) {
        return this.lllIIIllIIIIlllIlIIllIIll(class_08642, class_08643, false, false, false);
    }

    public class_1112 lllIIIllIIIIlllIlIIllIIll(class_0864 class_08642, class_0864 class_08643, boolean bl) {
        return this.lllIIIllIIIIlllIlIIllIIll(class_08642, class_08643, bl, false, false);
    }

    public class_1112 lllIIIllIIIIlllIlIIllIIll(class_0864 class_08642, class_0864 class_08643, boolean bl, boolean bl2, boolean bl3) {
        if (!(Double.isNaN(class_08642.lllIIIllIIIIlllIlIIllIIll) || Double.isNaN(class_08642.lllIlIIlIIIlIlIIIllIlllIl) || Double.isNaN(class_08642.IlIllllllIIlIIllllIIlIIIl))) {
            if (!(Double.isNaN(class_08643.lllIIIllIIIIlllIlIIllIIll) || Double.isNaN(class_08643.lllIlIIlIIIlIlIIIllIlllIl) || Double.isNaN(class_08643.IlIllllllIIlIIllllIIlIIIl))) {
                class_1112 class_11122;
                int n = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_08643.lllIIIllIIIIlllIlIIllIIll);
                int n2 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_08643.lllIlIIlIIIlIlIIIllIlllIl);
                int n3 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_08643.IlIllllllIIlIIllllIIlIIIl);
                int n4 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_08642.lllIIIllIIIIlllIlIIllIIll);
                int n5 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_08642.lllIlIIlIIIlIlIIIllIlllIl);
                int n6 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_08642.IlIllllllIIlIIllllIIlIIIl);
                Block class_05492 = this.a_(n4, n5, n6);
                int n7 = this.IlIllllllIIlIIllllIIlIIIl(n4, n5, n6);
                if ((!bl2 || class_05492.IlIllllllIIlIIllllIIlIIIl(this, n4, n5, n6) != null) && class_05492.lllIIIllIIIIlllIlIIllIIll(n7, bl) && (class_11122 = class_05492.lllIIIllIIIIlllIlIIllIIll(this, n4, n5, n6, class_08642, class_08643)) != null) {
                    return class_11122;
                }
                class_11122 = null;
                n7 = 200;
                while (n7-- >= 0) {
                    int n8;
                    if (Double.isNaN(class_08642.lllIIIllIIIIlllIlIIllIIll) || Double.isNaN(class_08642.lllIlIIlIIIlIlIIIllIlllIl) || Double.isNaN(class_08642.IlIllllllIIlIIllllIIlIIIl)) {
                        return null;
                    }
                    if (n4 == n && n5 == n2 && n6 == n3) {
                        return bl3 ? class_11122 : null;
                    }
                    boolean bl4 = true;
                    boolean bl5 = true;
                    boolean bl6 = true;
                    double d = 999.0;
                    double d2 = 999.0;
                    double d3 = 999.0;
                    if (n > n4) {
                        d = (double)n4 + 1.0;
                    } else if (n < n4) {
                        d = (double)n4 + 0.0;
                    } else {
                        bl4 = false;
                    }
                    if (n2 > n5) {
                        d2 = (double)n5 + 1.0;
                    } else if (n2 < n5) {
                        d2 = (double)n5 + 0.0;
                    } else {
                        bl5 = false;
                    }
                    if (n3 > n6) {
                        d3 = (double)n6 + 1.0;
                    } else if (n3 < n6) {
                        d3 = (double)n6 + 0.0;
                    } else {
                        bl6 = false;
                    }
                    double d4 = 999.0;
                    double d5 = 999.0;
                    double d6 = 999.0;
                    double d7 = class_08643.lllIIIllIIIIlllIlIIllIIll - class_08642.lllIIIllIIIIlllIlIIllIIll;
                    double d8 = class_08643.lllIlIIlIIIlIlIIIllIlllIl - class_08642.lllIlIIlIIIlIlIIIllIlllIl;
                    double d9 = class_08643.IlIllllllIIlIIllllIIlIIIl - class_08642.IlIllllllIIlIIllllIIlIIIl;
                    if (bl4) {
                        d4 = (d - class_08642.lllIIIllIIIIlllIlIIllIIll) / d7;
                    }
                    if (bl5) {
                        d5 = (d2 - class_08642.lllIlIIlIIIlIlIIIllIlllIl) / d8;
                    }
                    if (bl6) {
                        d6 = (d3 - class_08642.IlIllllllIIlIIllllIIlIIIl) / d9;
                    }
                    boolean bl7 = false;
                    if (d4 < d5 && d4 < d6) {
                        n8 = n > n4 ? 4 : 5;
                        class_08642.lllIIIllIIIIlllIlIIllIIll = d;
                        class_08642.lllIlIIlIIIlIlIIIllIlllIl += d8 * d4;
                        class_08642.IlIllllllIIlIIllllIIlIIIl += d9 * d4;
                    } else if (d5 < d6) {
                        n8 = n2 > n5 ? 0 : 1;
                        class_08642.lllIIIllIIIIlllIlIIllIIll += d7 * d5;
                        class_08642.lllIlIIlIIIlIlIIIllIlllIl = d2;
                        class_08642.IlIllllllIIlIIllllIIlIIIl += d9 * d5;
                    } else {
                        n8 = n3 > n6 ? 2 : 3;
                        class_08642.lllIIIllIIIIlllIlIIllIIll += d7 * d6;
                        class_08642.lllIlIIlIIIlIlIIIllIlllIl += d8 * d6;
                        class_08642.IlIllllllIIlIIllllIIlIIIl = d3;
                    }
                    class_0864 class_08644 = class_0864.lllIIIllIIIIlllIlIIllIIll(class_08642.lllIIIllIIIIlllIlIIllIIll, class_08642.lllIlIIlIIIlIlIIIllIlllIl, class_08642.IlIllllllIIlIIllllIIlIIIl);
                    class_08644.lllIIIllIIIIlllIlIIllIIll = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_08642.lllIIIllIIIIlllIlIIllIIll);
                    n4 = (int)class_08644.lllIIIllIIIIlllIlIIllIIll;
                    if (n8 == 5) {
                        --n4;
                        class_08644.lllIIIllIIIIlllIlIIllIIll += 1.0;
                    }
                    class_08644.lllIlIIlIIIlIlIIIllIlllIl = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_08642.lllIlIIlIIIlIlIIIllIlllIl);
                    n5 = (int)class_08644.lllIlIIlIIIlIlIIIllIlllIl;
                    if (n8 == 1) {
                        --n5;
                        class_08644.lllIlIIlIIIlIlIIIllIlllIl += 1.0;
                    }
                    class_08644.IlIllllllIIlIIllllIIlIIIl = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_08642.IlIllllllIIlIIllllIIlIIIl);
                    n6 = (int)class_08644.IlIllllllIIlIIllllIIlIIIl;
                    if (n8 == 3) {
                        --n6;
                        class_08644.IlIllllllIIlIIllllIIlIIIl += 1.0;
                    }
                    Block class_05493 = this.a_(n4, n5, n6);
                    int n9 = this.IlIllllllIIlIIllllIIlIIIl(n4, n5, n6);
                    if (bl2 && class_05493.IlIllllllIIlIIllllIIlIIIl(this, n4, n5, n6) == null) continue;
                    if (class_05493.lllIIIllIIIIlllIlIIllIIll(n9, bl)) {
                        class_1112 class_11123 = class_05493.lllIIIllIIIIlllIlIIllIIll(this, n4, n5, n6, class_08642, class_08643);
                        if (class_11123 == null) continue;
                        return class_11123;
                    }
                    class_11122 = new class_1112(n4, n5, n6, n8, class_08642, false);
                }
                return bl3 ? class_11122 : null;
            }
            return null;
        }
        return null;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, String string, float f, float f2) {
        for (int i = 0; i < this.lIIlIIIIIlIlllIlIIlIlIlll.size(); ++i) {
            ((class_2249)this.lIIlIIIIIlIlllIlIIlIlIlll.get(i)).lllIIIllIIIIlllIlIIllIIll(string, class_15212.IlIIlllllIIlIlIlllllIllll, class_15212.llIIlIlIlllIIllIlIlllIllI - (double)class_15212.llllIlIIIIIIIIIlllIIlIIIl, class_15212.IllIIIIllIIllIllIlllIlIIl, f, f2);
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0814 class_08142, String string, float f, float f2) {
        for (int i = 0; i < this.lIIlIIIIIlIlllIlIIlIlIlll.size(); ++i) {
            ((class_2249)this.lIIlIIIIIlIlllIlIIlIlIlll.get(i)).lllIIIllIIIIlllIlIIllIIll(class_08142, string, class_08142.IlIIlllllIIlIlIlllllIllll, class_08142.llIIlIlIlllIIllIlIlllIllI - (double)class_08142.llllIlIIIIIIIIIlllIIlIIIl, class_08142.IllIIIIllIIllIllIlllIlIIl, f, f2);
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(double d, double d2, double d3, String string, float f, float f2) {
        for (int i = 0; i < this.lIIlIIIIIlIlllIlIIlIlIlll.size(); ++i) {
            ((class_2249)this.lIIlIIIIIlIlllIlIIlIlIlll.get(i)).lllIIIllIIIIlllIlIIllIIll(string, d, d2, d3, f, f2);
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(double d, double d2, double d3, String string, float f, float f2, boolean bl) {
    }

    public void lllIIIllIIIIlllIlIIllIIll(String string, int n, int n2, int n3) {
        for (int i = 0; i < this.lIIlIIIIIlIlllIlIIlIlIlll.size(); ++i) {
            ((class_2249)this.lIIlIIIIIlIlllIlIIlIlIlll.get(i)).lllIIIllIIIIlllIlIIllIIll(string, n, n2, n3);
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(String string, double d, double d2, double d3, double d4, double d5, double d6) {
        for (int i = 0; i < this.lIIlIIIIIlIlllIlIIlIlIlll.size(); ++i) {
            ((class_2249)this.lIIlIIIIIlIlllIlIIlIlIlll.get(i)).lllIIIllIIIIlllIlIIllIIll(string, d, d2, d3, d4, d5, d6);
        }
    }

    public boolean lIllllIIlIIIlIllllllIIIll(class_1521 class_15212) {
        this.IIIllIIlIIIIIIlIlIIllIIlI.add(class_15212);
        return true;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212) {
        int n = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_15212.IlIIlllllIIlIlIlllllIllll / 16.0);
        int n2 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_15212.IllIIIIllIIllIllIlllIlIIl / 16.0);
        boolean bl = class_15212.IIlllIlIlllIllIIIlllIIlIl;
        if (class_15212 instanceof class_0814) {
            bl = true;
        }
        if (!bl && !this.IlIllllllIIlIIllllIIlIIIl(n, n2)) {
            return false;
        }
        if (class_15212 instanceof class_0814) {
            class_0814 class_08142 = (class_0814)class_15212;
            this.lIllllIIlIIIlIllllllIIIll.add(class_08142);
            this.llIIlIlIlllIIllIlIlllIllI();
        }
        this.IlIIIIIllllllIIlllIllllll(n, n2).lllIIIllIIIIlllIlIIllIIll(class_15212);
        this.IlIllllllIIlIIllllIIlIIIl.add(class_15212);
        this.IlIllllllIIlIIllllIIlIIIl(class_15212);
        return true;
    }

    protected void IlIllllllIIlIIllllIIlIIIl(class_1521 class_15212) {
        for (int i = 0; i < this.lIIlIIIIIlIlllIlIIlIlIlll.size(); ++i) {
            ((class_2249)this.lIIlIIIIIlIlllIlIIlIlIlll.get(i)).lllIIIllIIIIlllIlIIllIIll(class_15212);
        }
    }

    protected void lIlllIlllIIIIlIIlllIllIII(class_1521 class_15212) {
        for (int i = 0; i < this.lIIlIIIIIlIlllIlIIlIlIlll.size(); ++i) {
            ((class_2249)this.lIIlIIIIIlIlllIlIIlIlIlll.get(i)).lllIlIIlIIIlIlIIIllIlllIl(class_15212);
        }
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(class_1521 class_15212) {
        if (class_15212.lIlIlIIlIIIIlIIIIIlllIIII != null) {
            class_15212.lIlIlIIlIIIIlIIIIIlllIIII.lllIIIllIIIIlllIlIIllIIll((class_1521)null);
        }
        if (class_15212.IlIIIlIIIIllIIIllIIIIIIll != null) {
            class_15212.lllIIIllIIIIlllIlIIllIIll((class_1521)null);
        }
        class_15212.IIIIlIIlIIIllIIIIllIIIlII();
        if (class_15212 instanceof class_0814) {
            this.lIllllIIlIIIlIllllllIIIll.remove(class_15212);
            this.llIIlIlIlllIIllIlIlllIllI();
            this.lIlllIlllIIIIlIIlllIllIII(class_15212);
        }
    }

    public void IIIllIIlIIIIIIlIlIIllIIlI(class_1521 class_15212) {
        class_15212.IIIIlIIlIIIllIIIIllIIIlII();
        if (class_15212 instanceof class_0814) {
            this.lIllllIIlIIIlIllllllIIIll.remove(class_15212);
            this.llIIlIlIlllIIllIlIlllIllI();
        }
        int n = class_15212.lIlIIllIllIIIIIlIllllIIIl;
        int n2 = class_15212.llIIIlIlIlIIlIllIIIllIlIl;
        if (class_15212.IlIIllIlIlIllIIIlIIlIlIIl && this.IlIllllllIIlIIllllIIlIIIl(n, n2)) {
            this.IlIIIIIllllllIIlllIllllll(n, n2).lllIlIIlIIIlIlIIIllIlllIl(class_15212);
        }
        this.IlIllllllIIlIIllllIIlIIIl.remove(class_15212);
        this.lIlllIlllIIIIlIIlllIllIII(class_15212);
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_2249 class_22492) {
        this.lIIlIIIIIlIlllIlIIlIlIlll.add(class_22492);
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(class_2249 class_22492) {
        this.lIIlIIIIIlIlllIlIIlIlIlll.remove(class_22492);
    }

    public List lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, class_1974 class_19742) {
        this.llllllIlIllllIlIlIlIIIIlI.clear();
        int n = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19742.lllIIIllIIIIlllIlIIllIIll);
        int n2 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19742.lIlllIlllIIIIlIIlllIllIII + 1.0);
        int n3 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19742.lllIlIIlIIIlIlIIIllIlllIl);
        int n4 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19742.IlIIIIIllllllIIlllIllllll + 1.0);
        int n5 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19742.IlIllllllIIlIIllllIIlIIIl);
        int n6 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19742.lIllllIIlIIIlIllllllIIIll + 1.0);
        for (int i = n; i < n2; ++i) {
            for (int j = n5; j < n6; ++j) {
                if (!this.IlIIIIIllllllIIlllIllllll(i, 64, j)) continue;
                for (int k = n3 - 1; k < n4; ++k) {
                    Block class_05492 = i >= -30000000 && i < 30000000 && j >= -30000000 && j < 30000000 ? this.a_(i, k, j) : Blocks.lllIlIIlIIIlIlIIIllIlllIl;
                    class_05492.lllIIIllIIIIlllIlIIllIIll(this, i, k, j, class_19742, this.llllllIlIllllIlIlIlIIIIlI, class_15212);
                }
            }
        }
        double d = 0.25;
        List list = this.lllIlIIlIIIlIlIIIllIlllIl(class_15212, class_19742.lllIlIIlIIIlIlIIIllIlllIl(d, d, d));
        for (int i = 0; i < list.size(); ++i) {
            class_1974 class_19743 = ((class_1521)list.get(i)).IllIIIllIIIIlIlIlIllIIlll();
            if (class_19743 != null && class_19743.lllIlIIlIIIlIlIIIllIlllIl(class_19742)) {
                this.llllllIlIllllIlIlIlIIIIlI.add(class_19743);
            }
            if ((class_19743 = class_15212.IIIllIIlIIIIIIlIlIIllIIlI((class_1521)list.get(i))) == null || !class_19743.lllIlIIlIIIlIlIIIllIlllIl(class_19742)) continue;
            this.llllllIlIllllIlIlIlIIIIlI.add(class_19743);
        }
        return this.llllllIlIllllIlIlIlIIIIlI;
    }

    public List lllIIIllIIIIlllIlIIllIIll(class_1974 class_19742) {
        this.llllllIlIllllIlIlIlIIIIlI.clear();
        int n = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19742.lllIIIllIIIIlllIlIIllIIll);
        int n2 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19742.lIlllIlllIIIIlIIlllIllIII + 1.0);
        int n3 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19742.lllIlIIlIIIlIlIIIllIlllIl);
        int n4 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19742.IlIIIIIllllllIIlllIllllll + 1.0);
        int n5 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19742.IlIllllllIIlIIllllIIlIIIl);
        int n6 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19742.lIllllIIlIIIlIllllllIIIll + 1.0);
        for (int i = n; i < n2; ++i) {
            for (int j = n5; j < n6; ++j) {
                if (!this.IlIIIIIllllllIIlllIllllll(i, 64, j)) continue;
                for (int k = n3 - 1; k < n4; ++k) {
                    Block class_05492 = i >= -30000000 && i < 30000000 && j >= -30000000 && j < 30000000 ? this.a_(i, k, j) : Blocks.IllIIlllllllIIlIIlIIIIlIl;
                    class_05492.lllIIIllIIIIlllIlIIllIIll(this, i, k, j, class_19742, this.llllllIlIllllIlIlIlIIIIlI, null);
                }
            }
        }
        return this.llllllIlIllllIlIlIlIIIIlI;
    }

    public int lllIIIllIIIIlllIlIIllIIll(float f) {
        float f2 = this.IlIllllllIIlIIllllIIlIIIl(f);
        float f3 = 1.0f - (MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f2 * (float)Math.PI * 2.0f) * 2.0f + 0.5f);
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        f3 = 1.0f - f3;
        f3 = (float)((double)f3 * (1.0 - (double)(this.IllIIIllIIIIlIlIlIllIIlll(f) * 5.0f) / 16.0));
        f3 = (float)((double)f3 * (1.0 - (double)(this.IllIIlllllllIIlIIlIIIIlIl(f) * 5.0f) / 16.0));
        f3 = 1.0f - f3;
        return (int)(f3 * 11.0f);
    }

    public float lllIlIIlIIIlIlIIIllIlllIl(float f) {
        float f2 = this.IlIllllllIIlIIllllIIlIIIl(f);
        float f3 = 1.0f - (MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f2 * (float)Math.PI * 2.0f) * 2.0f + 0.2f);
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        f3 = 1.0f - f3;
        f3 = (float)((double)f3 * (1.0 - (double)(this.IllIIIllIIIIlIlIlIllIIlll(f) * 5.0f) / 16.0));
        f3 = (float)((double)f3 * (1.0 - (double)(this.IllIIlllllllIIlIIlIIIIlIl(f) * 5.0f) / 16.0));
        return f3 * 0.8f + 0.2f;
    }

    public class_0864 lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, float f) {
        float f2;
        float f3;
        float f4 = this.IlIllllllIIlIIllllIIlIIIl(f);
        float f5 = MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f4 * (float)Math.PI * 2.0f) * 2.0f + 0.5f;
        if (f5 < 0.0f) {
            f5 = 0.0f;
        }
        if (f5 > 1.0f) {
            f5 = 1.0f;
        }
        int n = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_15212.IlIIlllllIIlIlIlllllIllll);
        int n2 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_15212.llIIlIlIlllIIllIlIlllIllI);
        int n3 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_15212.IllIIIIllIIllIllIlllIlIIl);
        class_0672 class_06722 = this.a_(n, n3);
        float f6 = class_06722.lllIIIllIIIIlllIlIIllIIll(n, n2, n3);
        int n4 = class_06722.lllIIIllIIIIlllIlIIllIIll(f6);
        float f7 = (float)(n4 >> 16 & 0xFF) / 255.0f;
        float f8 = (float)(n4 >> 8 & 0xFF) / 255.0f;
        float f9 = (float)(n4 & 0xFF) / 255.0f;
        f7 *= f5;
        f8 *= f5;
        f9 *= f5;
        float f10 = this.IllIIIllIIIIlIlIlIllIIlll(f);
        if (f10 > 0.0f) {
            f3 = (f7 * 0.3f + f8 * 0.59f + f9 * 0.11f) * 0.6f;
            f2 = 1.0f - f10 * 0.75f;
            f7 = f7 * f2 + f3 * (1.0f - f2);
            f8 = f8 * f2 + f3 * (1.0f - f2);
            f9 = f9 * f2 + f3 * (1.0f - f2);
        }
        if ((f3 = this.IllIIlllllllIIlIIlIIIIlIl(f)) > 0.0f) {
            f2 = (f7 * 0.3f + f8 * 0.59f + f9 * 0.11f) * 0.2f;
            float f11 = 1.0f - f3 * 0.75f;
            f7 = f7 * f11 + f2 * (1.0f - f11);
            f8 = f8 * f11 + f2 * (1.0f - f11);
            f9 = f9 * f11 + f2 * (1.0f - f11);
        }
        if (this.IlIlllIIIIIIlIIllIIllIlll > 0) {
            f2 = (float)this.IlIlllIIIIIIlIIllIIllIlll - f;
            if (f2 > 1.0f) {
                f2 = 1.0f;
            }
            f7 = f7 * (1.0f - (f2 *= 0.45f)) + 0.8f * f2;
            f8 = f8 * (1.0f - f2) + 0.8f * f2;
            f9 = f9 * (1.0f - f2) + 1.0f * f2;
        }
        return class_0864.lllIIIllIIIIlllIlIIllIIll(f7, f8, f9);
    }

    public float IlIllllllIIlIIllllIIlIIIl(float f) {
        return this.IlIlIIlllIIlIllIIIlllllIl.lllIIIllIIIIlllIlIIllIIll(this.IIlllIlIlllIllIIIlllIIlIl.IIIllIIlIIIIIIlIlIIllIIlI(), f);
    }

    public int llIIlllIllIllllIIIlIIIIII() {
        return this.IlIlIIlllIIlIllIIIlllllIl.lllIIIllIIIIlllIlIIllIIll(this.IIlllIlIlllIllIIIlllIIlIl.IIIllIIlIIIIIIlIlIIllIIlI());
    }

    public float llIIllIllIlIIlIIllIllllll() {
        return class_1163.lllIIIllIIIIlllIlIIllIIll[this.IlIlIIlllIIlIllIIIlllllIl.lllIIIllIIIIlllIlIIllIIll(this.IIlllIlIlllIllIIIlllIIlIl.IIIllIIlIIIIIIlIlIIllIIlI())];
    }

    public float lIlllIlllIIIIlIIlllIllIII(float f) {
        float f2 = this.IlIllllllIIlIIllllIIlIIIl(f);
        return f2 * (float)Math.PI * 2.0f;
    }

    public class_0864 IlIIIIIllllllIIlllIllllll(float f) {
        float f2;
        float f3;
        float f4 = this.IlIllllllIIlIIllllIIlIIIl(f);
        float f5 = MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f4 * (float)Math.PI * 2.0f) * 2.0f + 0.5f;
        if (f5 < 0.0f) {
            f5 = 0.0f;
        }
        if (f5 > 1.0f) {
            f5 = 1.0f;
        }
        float f6 = (float)(this.llllIIIIlIIIlIIIIIIlIllll >> 16 & 0xFFL) / 255.0f;
        float f7 = (float)(this.llllIIIIlIIIlIIIIIIlIllll >> 8 & 0xFFL) / 255.0f;
        float f8 = (float)(this.llllIIIIlIIIlIIIIIIlIllll & 0xFFL) / 255.0f;
        float f9 = this.IllIIIllIIIIlIlIlIllIIlll(f);
        if (f9 > 0.0f) {
            f3 = (f6 * 0.3f + f7 * 0.59f + f8 * 0.11f) * 0.6f;
            f2 = 1.0f - f9 * 0.95f;
            f6 = f6 * f2 + f3 * (1.0f - f2);
            f7 = f7 * f2 + f3 * (1.0f - f2);
            f8 = f8 * f2 + f3 * (1.0f - f2);
        }
        f6 *= f5 * 0.9f + 0.1f;
        f7 *= f5 * 0.9f + 0.1f;
        f8 *= f5 * 0.85f + 0.15f;
        f3 = this.IllIIlllllllIIlIIlIIIIlIl(f);
        if (f3 > 0.0f) {
            f2 = (f6 * 0.3f + f7 * 0.59f + f8 * 0.11f) * 0.2f;
            float f10 = 1.0f - f3 * 0.95f;
            f6 = f6 * f10 + f2 * (1.0f - f10);
            f7 = f7 * f10 + f2 * (1.0f - f10);
            f8 = f8 * f10 + f2 * (1.0f - f10);
        }
        return class_0864.lllIIIllIIIIlllIlIIllIIll(f6, f7, f8);
    }

    public class_0864 lIllllIIlIIIlIllllllIIIll(float f) {
        float f2 = this.IlIllllllIIlIIllllIIlIIIl(f);
        return this.IlIlIIlllIIlIllIIIlllllIl.lllIlIIlIIIlIlIIIllIlllIl(f2, f);
    }

    public int IllIIlllllllIIlIIlIIIIlIl(int n, int n2) {
        return this.lIlllIlllIIIIlIIlllIllIII(n, n2).IlIllllllIIlIIllllIIlIIIl(n & 0xF, n2 & 0xF);
    }

    public int IIIllIllIIlIlIlIlIllllIIl(int n, int n2) {
        class_0723 class_07232 = this.lIlllIlllIIIIlIIlllIllIII(n, n2);
        n &= 0xF;
        n2 &= 0xF;
        for (int i = class_07232.lllIIIllIIIIlllIlIIllIIll() + 15; i > 0; --i) {
            Block class_05492 = class_07232.lllIlIIlIIIlIlIIIllIlllIl(n, i, n2);
            if (!class_05492.lIllllIIlIIIlIllllllIIIll().lIlllIlllIIIIlIIlllIllIII() || class_05492.lIllllIIlIIIlIllllllIIIll() == class_1855.IllIIIllIIIIlIlIlIllIIlll) continue;
            return i + 1;
        }
        return -1;
    }

    public float IIIllIIlIIIIIIlIlIIllIIlI(float f) {
        float f2 = this.IlIllllllIIlIIllllIIlIIIl(f);
        float f3 = 1.0f - (MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f2 * (float)Math.PI * 2.0f) * 2.0f + 0.25f);
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        return f3 * f3 * 0.5f;
    }

    public void IlIllllllIIlIIllllIIlIIIl(int n, int n2, int n3, Block class_05492, int n4) {
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, int n3, Block class_05492, int n4, int n5) {
    }

    public void IlIllllllIIlIIllllIIlIIIl(int n, int n2, int n3, Block class_05492, int n4, int n5) {
    }

    public void lllIIlIIIllllllIIIIlIlIlI() {
        Object object;
        int n;
        int n2;
        class_1521 class_15212;
        int n3;
        this.IlIIlllllIIlIlIlllllIllll.startSection("entities");
        this.IlIIlllllIIlIlIlllllIllll.startSection("global");
        for (n3 = 0; n3 < this.IIIllIIlIIIIIIlIlIIllIIlI.size(); ++n3) {
            class_15212 = (class_1521)this.IIIllIIlIIIIIIlIlIIllIIlI.get(n3);
            try {
                ++class_15212.IlllIIIllllIIllIllIlIIlIl;
                class_15212.s_();
            }
            catch (Throwable throwable) {
                CrashReport class_02232 = CrashReport.lllIIIllIIIIlllIlIIllIIll(throwable, "Ticking entity");
                class_0799 class_07992 = class_02232.lllIIIllIIIIlllIlIIllIIll("Entity being ticked");
                if (class_15212 == null) {
                    class_07992.lllIIIllIIIIlllIlIIllIIll("Entity", "~~NULL~~");
                } else {
                    class_15212.lllIIIllIIIIlllIlIIllIIll(class_07992);
                }
                throw new class_0892(class_02232);
            }
            if (!class_15212.IllllIIIIlIIlIIIIlllIIIIl) continue;
            this.IIIllIIlIIIIIIlIlIIllIIlI.remove(n3--);
        }
        this.IlIIlllllIIlIlIlllllIllll.endStartSection("remove");
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
        this.IlIIlllllIIlIlIlllllIllll.endStartSection("regular");
        for (n3 = 0; n3 < this.IlIllllllIIlIIllllIIlIIIl.size(); ++n3) {
            class_15212 = (class_1521)this.IlIllllllIIlIIllllIIlIIIl.get(n3);
            if (class_15212.IlIIIlIIIIllIIIllIIIIIIll != null) {
                if (!class_15212.IlIIIlIIIIllIIIllIIIIIIll.IllllIIIIlIIlIIIIlllIIIIl && class_15212.IlIIIlIIIIllIIIllIIIIIIll.lIlIlIIlIIIIlIIIIIlllIIII == class_15212) continue;
                class_15212.IlIIIlIIIIllIIIllIIIIIIll.lIlIlIIlIIIIlIIIIIlllIIII = null;
                class_15212.IlIIIlIIIIllIIIllIIIIIIll = null;
            }
            this.IlIIlllllIIlIlIlllllIllll.startSection("tick");
            if (!class_15212.IllllIIIIlIIlIIIIlllIIIIl) {
                try {
                    this.IlIIIIIllllllIIlllIllllll(class_15212);
                }
                catch (Throwable throwable) {
                    CrashReport class_02233 = CrashReport.lllIIIllIIIIlllIlIIllIIll(throwable, "Ticking entity");
                    class_0799 class_07993 = class_02233.lllIIIllIIIIlllIlIIllIIll("Entity being ticked");
                    class_15212.lllIIIllIIIIlllIlIIllIIll(class_07993);
                    throw new class_0892(class_02233);
                }
            }
            this.IlIIlllllIIlIlIlllllIllll.endSection();
            this.IlIIlllllIIlIlIlllllIllll.startSection("remove");
            if (class_15212.IllllIIIIlIIlIIIIlllIIIIl) {
                n2 = class_15212.lIlIIllIllIIIIIlIllllIIIl;
                n = class_15212.llIIIlIlIlIIlIllIIIllIlIl;
                if (class_15212.IlIIllIlIlIllIIIlIIlIlIIl && this.IlIllllllIIlIIllllIIlIIIl(n2, n)) {
                    this.IlIIIIIllllllIIlllIllllll(n2, n).lllIlIIlIIIlIlIIIllIlllIl(class_15212);
                }
                this.IlIllllllIIlIIllllIIlIIIl.remove(n3--);
                this.lIlllIlllIIIIlIIlllIllIII(class_15212);
            }
            this.IlIIlllllIIlIlIlllllIllll.endSection();
        }
        this.IlIIlllllIIlIlIlllllIllll.endStartSection("blockEntities");
        this.lIlIIllllIlIIIIllIIIIlIIl = true;
        Iterator iterator = this.IlIIIIIllllllIIlllIllllll.iterator();
        while (iterator.hasNext()) {
            class_1774 class_17742 = (class_1774)iterator.next();
            if (!class_17742.IIIllIllIIlIlIlIlIllllIIl() && class_17742.lllIlIIlIIIlIlIIIllIlllIl() && this.IlIIIIIllllllIIlllIllllll(class_17742.lllIlIIlIIIlIlIIIllIlllIl, class_17742.IlIllllllIIlIIllllIIlIIIl, class_17742.lIlllIlllIIIIlIIlllIllIII)) {
                try {
                    class_17742.IlIllllllIIlIIllllIIlIIIl();
                }
                catch (Throwable throwable) {
                    CrashReport class_02234 = CrashReport.lllIIIllIIIIlllIlIIllIIll(throwable, "Ticking block entity");
                    class_0799 class_07994 = class_02234.lllIIIllIIIIlllIlIIllIIll("net.minecraft.block.Block entity being ticked");
                    class_17742.lllIIIllIIIIlllIlIIllIIll(class_07994);
                    throw new class_0892(class_02234);
                }
            }
            if (!class_17742.IIIllIllIIlIlIlIlIllllIIl()) continue;
            iterator.remove();
            if (!this.IlIllllllIIlIIllllIIlIIIl(class_17742.lllIlIIlIIIlIlIIIllIlllIl >> 4, class_17742.lIlllIlllIIIIlIIlllIllIII >> 4) || (object = this.IlIIIIIllllllIIlllIllllll(class_17742.lllIlIIlIIIlIlIIIllIlllIl >> 4, class_17742.lIlllIlllIIIIlIIlllIllIII >> 4)) == null) continue;
            ((class_0723)object).lIllllIIlIIIlIllllllIIIll(class_17742.lllIlIIlIIIlIlIIIllIlllIl & 0xF, class_17742.IlIllllllIIlIIllllIIlIIIl, class_17742.lIlllIlllIIIIlIIlllIllIII & 0xF);
        }
        this.lIlIIllllIlIIIIllIIIIlIIl = false;
        if (!this.IlIlIIlllIllllllllIIIlIlI.isEmpty()) {
            this.IlIIIIIllllllIIlllIllllll.removeAll(this.IlIlIIlllIllllllllIIIlIlI);
            this.IlIlIIlllIllllllllIIIlIlI.clear();
        }
        this.IlIIlllllIIlIlIlllllIllll.endStartSection("pendingBlockEntities");
        if (!this.lllIIIllIIIIlllIlIIllIIll.isEmpty()) {
            for (int i = 0; i < this.lllIIIllIIIIlllIlIIllIIll.size(); ++i) {
                class_0723 class_07232;
                object = (class_1774)this.lllIIIllIIIIlllIlIIllIIll.get(i);
                if (((class_1774)object).IIIllIllIIlIlIlIlIllllIIl()) continue;
                if (!this.IlIIIIIllllllIIlllIllllll.contains(object)) {
                    this.IlIIIIIllllllIIlllIllllll.add(object);
                }
                if (this.IlIllllllIIlIIllllIIlIIIl(((class_1774)object).lllIlIIlIIIlIlIIIllIlllIl >> 4, ((class_1774)object).lIlllIlllIIIIlIIlllIllIII >> 4) && (class_07232 = this.IlIIIIIllllllIIlllIllllll(((class_1774)object).lllIlIIlIIIlIlIIIllIlllIl >> 4, ((class_1774)object).lIlllIlllIIIIlIIlllIllIII >> 4)) != null) {
                    class_07232.lllIIIllIIIIlllIlIIllIIll(((class_1774)object).lllIlIIlIIIlIlIIIllIlllIl & 0xF, ((class_1774)object).IlIllllllIIlIIllllIIlIIIl, ((class_1774)object).lIlllIlllIIIIlIIlllIllIII & 0xF, (class_1774)object);
                }
                this.IIIllIIlIIIIIIlIlIIllIIlI(((class_1774)object).lllIlIIlIIIlIlIIIllIlllIl, ((class_1774)object).IlIllllllIIlIIllllIIlIIIl, ((class_1774)object).lIlllIlllIIIIlIIlllIllIII);
            }
            this.lllIIIllIIIIlllIlIIllIIll.clear();
        }
        this.IlIIlllllIIlIlIlllllIllll.endSection();
        this.IlIIlllllIIlIlIlllllIllll.endSection();
    }

    public void lllIIIllIIIIlllIlIIllIIll(Collection collection) {
        if (this.lIlIIllllIlIIIIllIIIIlIIl) {
            this.lllIIIllIIIIlllIlIIllIIll.addAll(collection);
        } else {
            this.IlIIIIIllllllIIlllIllllll.addAll(collection);
        }
    }

    public void IlIIIIIllllllIIlllIllllll(class_1521 class_15212) {
        this.lllIIIllIIIIlllIlIIllIIll(class_15212, true);
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, boolean bl) {
        int n = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_15212.IlIIlllllIIlIlIlllllIllll);
        int n2 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_15212.IllIIIIllIIllIllIlllIlIIl);
        int n3 = 32;
        if (!bl || this.lllIlIIlIIIlIlIIIllIlllIl(n - n3, 0, n2 - n3, n + n3, 0, n2 + n3)) {
            class_15212.lIIIlIIIlIlllIllIIIlIIIlI = class_15212.IlIIlllllIIlIlIlllllIllll;
            class_15212.lIIlIlllIllIlIlllIIIIIIII = class_15212.llIIlIlIlllIIllIlIlllIllI;
            class_15212.IIlIllIIlllllIIlIIllllIIl = class_15212.IllIIIIllIIllIllIlllIlIIl;
            class_15212.llllIIIIlIIIlIIIIIIlIllll = class_15212.IIIIlIllIlIIlIIlIllIlIlll;
            class_15212.llIIIIllIIIIIIIlIIIlIIIIl = class_15212.IlIlIIlllIllllllllIIIlIlI;
            if (bl && class_15212.IlIIllIlIlIllIIIlIIlIlIIl) {
                ++class_15212.IlllIIIllllIIllIllIlIIlIl;
                if (class_15212.IlIIIlIIIIllIIIllIIIIIIll != null) {
                    class_15212.lllIIIlIIlIlIllIIIIIlIIll();
                } else {
                    class_15212.s_();
                }
            }
            this.IlIIlllllIIlIlIlllllIllll.startSection("chunkCheck");
            if (Double.isNaN(class_15212.IlIIlllllIIlIlIlllllIllll) || Double.isInfinite(class_15212.IlIIlllllIIlIlIlllllIllll)) {
                class_15212.IlIIlllllIIlIlIlllllIllll = class_15212.lIIIlIIIlIlllIllIIIlIIIlI;
            }
            if (Double.isNaN(class_15212.llIIlIlIlllIIllIlIlllIllI) || Double.isInfinite(class_15212.llIIlIlIlllIIllIlIlllIllI)) {
                class_15212.llIIlIlIlllIIllIlIlllIllI = class_15212.lIIlIlllIllIlIlllIIIIIIII;
            }
            if (Double.isNaN(class_15212.IllIIIIllIIllIllIlllIlIIl) || Double.isInfinite(class_15212.IllIIIIllIIllIllIlllIlIIl)) {
                class_15212.IllIIIIllIIllIllIlllIlIIl = class_15212.IIlIllIIlllllIIlIIllllIIl;
            }
            if (Double.isNaN(class_15212.IlIlIIlllIllllllllIIIlIlI) || Double.isInfinite(class_15212.IlIlIIlllIllllllllIIIlIlI)) {
                class_15212.IlIlIIlllIllllllllIIIlIlI = class_15212.llIIIIllIIIIIIIlIIIlIIIIl;
            }
            if (Double.isNaN(class_15212.IIIIlIllIlIIlIIlIllIlIlll) || Double.isInfinite(class_15212.IIIIlIllIlIIlIIlIllIlIlll)) {
                class_15212.IIIIlIllIlIIlIIlIllIlIlll = class_15212.llllIIIIlIIIlIIIIIIlIllll;
            }
            int n4 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_15212.IlIIlllllIIlIlIlllllIllll / 16.0);
            int n5 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_15212.llIIlIlIlllIIllIlIlllIllI / 16.0);
            int n6 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_15212.IllIIIIllIIllIllIlllIlIIl / 16.0);
            if (!class_15212.IlIIllIlIlIllIIIlIIlIlIIl || class_15212.lIlIIllIllIIIIIlIllllIIIl != n4 || class_15212.lIlllIIllIIIIIIlIlIIlIllI != n5 || class_15212.llIIIlIlIlIIlIllIIIllIlIl != n6) {
                if (class_15212.IlIIllIlIlIllIIIlIIlIlIIl && this.IlIllllllIIlIIllllIIlIIIl(class_15212.lIlIIllIllIIIIIlIllllIIIl, class_15212.llIIIlIlIlIIlIllIIIllIlIl)) {
                    this.IlIIIIIllllllIIlllIllllll(class_15212.lIlIIllIllIIIIIlIllllIIIl, class_15212.llIIIlIlIlIIlIllIIIllIlIl).lllIIIllIIIIlllIlIIllIIll(class_15212, class_15212.lIlllIIllIIIIIIlIlIIlIllI);
                }
                if (this.IlIllllllIIlIIllllIIlIIIl(n4, n6)) {
                    class_15212.IlIIllIlIlIllIIIlIIlIlIIl = true;
                    this.IlIIIIIllllllIIlllIllllll(n4, n6).lllIIIllIIIIlllIlIIllIIll(class_15212);
                } else {
                    class_15212.IlIIllIlIlIllIIIlIIlIlIIl = false;
                }
            }
            this.IlIIlllllIIlIlIlllllIllll.endSection();
            if (bl && class_15212.IlIIllIlIlIllIIIlIIlIlIIl && class_15212.lIlIlIIlIIIIlIIIIIlllIIII != null) {
                if (!class_15212.lIlIlIIlIIIIlIIIIIlllIIII.IllllIIIIlIIlIIIIlllIIIIl && class_15212.lIlIlIIlIIIIlIIIIIlllIIII.IlIIIlIIIIllIIIllIIIIIIll == class_15212) {
                    this.IlIIIIIllllllIIlllIllllll(class_15212.lIlIlIIlIIIIlIIIIIlllIIII);
                } else {
                    class_15212.lIlIlIIlIIIIlIIIIIlllIIII.IlIIIlIIIIllIIIllIIIIIIll = null;
                    class_15212.lIlIlIIlIIIIlIIIIIlllIIII = null;
                }
            }
        }
    }

    public boolean lllIlIIlIIIlIlIIIllIlllIl(class_1974 class_19742) {
        return this.lllIIIllIIIIlllIlIIllIIll(class_19742, (class_1521)null);
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_1974 class_19742, class_1521 class_15212) {
        List list = this.lllIlIIlIIIlIlIIIllIlllIl((class_1521)null, class_19742);
        for (int i = 0; i < list.size(); ++i) {
            class_1521 class_15213 = (class_1521)list.get(i);
            if (class_15213.IllllIIIIlIIlIIIIlllIIIIl || !class_15213.lIIlIIIIIlIlllIlIIlIlIlll || class_15213 == class_15212) continue;
            return false;
        }
        return true;
    }

    public boolean IlIllllllIIlIIllllIIlIIIl(class_1974 class_19742) {
        int n = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19742.lllIIIllIIIIlllIlIIllIIll);
        int n2 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19742.lIlllIlllIIIIlIIlllIllIII + 1.0);
        int n3 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19742.lllIlIIlIIIlIlIIIllIlllIl);
        int n4 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19742.IlIIIIIllllllIIlllIllllll + 1.0);
        int n5 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19742.IlIllllllIIlIIllllIIlIIIl);
        int n6 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19742.lIllllIIlIIIlIllllllIIIll + 1.0);
        if (class_19742.lllIIIllIIIIlllIlIIllIIll < 0.0) {
            --n;
        }
        if (class_19742.lllIlIIlIIIlIlIIIllIlllIl < 0.0) {
            --n3;
        }
        if (class_19742.IlIllllllIIlIIllllIIlIIIl < 0.0) {
            --n5;
        }
        for (int i = n; i < n2; ++i) {
            for (int j = n3; j < n4; ++j) {
                for (int k = n5; k < n6; ++k) {
                    Block class_05492 = this.a_(i, j, k);
                    if (class_05492.lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll) continue;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean lIlllIlllIIIIlIIlllIllIII(class_1974 class_19742) {
        int n = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19742.lllIIIllIIIIlllIlIIllIIll);
        int n2 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19742.lIlllIlllIIIIlIIlllIllIII + 1.0);
        int n3 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19742.lllIlIIlIIIlIlIIIllIlllIl);
        int n4 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19742.IlIIIIIllllllIIlllIllllll + 1.0);
        int n5 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19742.IlIllllllIIlIIllllIIlIIIl);
        int n6 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19742.lIllllIIlIIIlIllllllIIIll + 1.0);
        if (class_19742.lllIIIllIIIIlllIlIIllIIll < 0.0) {
            --n;
        }
        if (class_19742.lllIlIIlIIIlIlIIIllIlllIl < 0.0) {
            --n3;
        }
        if (class_19742.IlIllllllIIlIIllllIIlIIIl < 0.0) {
            --n5;
        }
        for (int i = n; i < n2; ++i) {
            for (int j = n3; j < n4; ++j) {
                for (int k = n5; k < n6; ++k) {
                    Block class_05492 = this.a_(i, j, k);
                    if (!class_05492.lIllllIIlIIIlIllllllIIIll().lllIIIllIIIIlllIlIIllIIll()) continue;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean IlIIIIIllllllIIlllIllllll(class_1974 class_19742) {
        int n;
        int n2 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19742.lllIIIllIIIIlllIlIIllIIll);
        int n3 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19742.lIlllIlllIIIIlIIlllIllIII + 1.0);
        int n4 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19742.lllIlIIlIIIlIlIIIllIlllIl);
        int n5 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19742.IlIIIIIllllllIIlllIllllll + 1.0);
        int n6 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19742.IlIllllllIIlIIllllIIlIIIl);
        if (this.lllIlIIlIIIlIlIIIllIlllIl(n2, n4, n6, n3, n5, n = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19742.lIllllIIlIIIlIllllllIIIll + 1.0))) {
            for (int i = n2; i < n3; ++i) {
                for (int j = n4; j < n5; ++j) {
                    for (int k = n6; k < n; ++k) {
                        Block class_05492 = this.a_(i, j, k);
                        if (class_05492 != Blocks.lIIlIlllIllIlIlllIIIIIIII && class_05492 != Blocks.lIIIIlIlIIlllllIIllIIlIII && class_05492 != Blocks.llIIlllIllIllllIIIlIIIIII) continue;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_1974 class_19742, class_1855 class_18552, class_1521 class_15212) {
        int n;
        int n2 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19742.lllIIIllIIIIlllIlIIllIIll);
        int n3 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19742.lIlllIlllIIIIlIIlllIllIII + 1.0);
        int n4 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19742.lllIlIIlIIIlIlIIIllIlllIl);
        int n5 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19742.IlIIIIIllllllIIlllIllllll + 1.0);
        int n6 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19742.IlIllllllIIlIIllllIIlIIIl);
        if (!this.lllIlIIlIIIlIlIIIllIlllIl(n2, n4, n6, n3, n5, n = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19742.lIllllIIlIIIlIllllllIIIll + 1.0))) {
            return false;
        }
        boolean bl = false;
        class_0864 class_08642 = class_0864.lllIIIllIIIIlllIlIIllIIll(0.0, 0.0, 0.0);
        for (int i = n2; i < n3; ++i) {
            for (int j = n4; j < n5; ++j) {
                for (int k = n6; k < n; ++k) {
                    double d;
                    Block class_05492 = this.a_(i, j, k);
                    if (class_05492.lIllllIIlIIIlIllllllIIIll() != class_18552 || !((double)n5 >= (d = (double)((float)(j + 1) - class_0816.IllIIlllllllIIlIIlIIIIlIl(this.IlIllllllIIlIIllllIIlIIIl(i, j, k)))))) continue;
                    bl = true;
                    class_05492.lllIIIllIIIIlllIlIIllIIll(this, i, j, k, class_15212, class_08642);
                }
            }
        }
        if (class_08642.lllIlIIlIIIlIlIIIllIlllIl() > 0.0 && class_15212.IlIIlIIlllllIlIIlIlIlIlIl()) {
            class_08642 = class_08642.lllIIIllIIIIlllIlIIllIIll();
            double d = 0.014;
            class_15212.IIIIIIIIlIllIIllIIlllIllI += class_08642.lllIIIllIIIIlllIlIIllIIll * d;
            class_15212.IIlIIlIlIlIllIIlIlIIIIlll += class_08642.lllIlIIlIIIlIlIIIllIlllIl * d;
            class_15212.llIIIlllIlllIlIllIIIIllIl += class_08642.IlIllllllIIlIIllllIIlIIIl * d;
        }
        return bl;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_1974 class_19742, class_1855 class_18552) {
        int n = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19742.lllIIIllIIIIlllIlIIllIIll);
        int n2 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19742.lIlllIlllIIIIlIIlllIllIII + 1.0);
        int n3 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19742.lllIlIIlIIIlIlIIIllIlllIl);
        int n4 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19742.IlIIIIIllllllIIlllIllllll + 1.0);
        int n5 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19742.IlIllllllIIlIIllllIIlIIIl);
        int n6 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19742.lIllllIIlIIIlIllllllIIIll + 1.0);
        for (int i = n; i < n2; ++i) {
            for (int j = n3; j < n4; ++j) {
                for (int k = n5; k < n6; ++k) {
                    if (this.a_(i, j, k).lIllllIIlIIIlIllllllIIIll() != class_18552) continue;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean lllIlIIlIIIlIlIIIllIlllIl(class_1974 class_19742, class_1855 class_18552) {
        int n = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19742.lllIIIllIIIIlllIlIIllIIll);
        int n2 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19742.lIlllIlllIIIIlIIlllIllIII + 1.0);
        int n3 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19742.lllIlIIlIIIlIlIIIllIlllIl);
        int n4 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19742.IlIIIIIllllllIIlllIllllll + 1.0);
        int n5 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19742.IlIllllllIIlIIllllIIlIIIl);
        int n6 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19742.lIllllIIlIIIlIllllllIIIll + 1.0);
        for (int i = n; i < n2; ++i) {
            for (int j = n3; j < n4; ++j) {
                for (int k = n5; k < n6; ++k) {
                    Block class_05492 = this.a_(i, j, k);
                    if (class_05492.lIllllIIlIIIlIllllllIIIll() != class_18552) continue;
                    int n7 = this.IlIllllllIIlIIllllIIlIIIl(i, j, k);
                    double d = j + 1;
                    if (n7 < 8) {
                        d = (double)(j + 1) - (double)n7 / 8.0;
                    }
                    if (!(d >= class_19742.lllIlIIlIIIlIlIIIllIlllIl)) continue;
                    return true;
                }
            }
        }
        return false;
    }

    public class_1013 lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, double d, double d2, double d3, float f, boolean bl) {
        return this.lllIIIllIIIIlllIlIIllIIll(class_15212, d, d2, d3, f, false, bl);
    }

    public class_1013 lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, double d, double d2, double d3, float f, boolean bl, boolean bl2) {
        class_1013 class_10132 = new class_1013(this, class_15212, d, d2, d3, f);
        class_10132.lllIIIllIIIIlllIlIIllIIll = bl;
        class_10132.lllIlIIlIIIlIlIIIllIlllIl = bl2;
        class_10132.lllIIIllIIIIlllIlIIllIIll();
        class_10132.lllIIIllIIIIlllIlIIllIIll(true);
        return class_10132;
    }

    public float lllIIIllIIIIlllIlIIllIIll(class_0864 class_08642, class_1974 class_19742) {
        double d = 1.0 / ((class_19742.lIlllIlllIIIIlIIlllIllIII - class_19742.lllIIIllIIIIlllIlIIllIIll) * 2.0 + 1.0);
        double d2 = 1.0 / ((class_19742.IlIIIIIllllllIIlllIllllll - class_19742.lllIlIIlIIIlIlIIIllIlllIl) * 2.0 + 1.0);
        double d3 = 1.0 / ((class_19742.lIllllIIlIIIlIllllllIIIll - class_19742.IlIllllllIIlIIllllIIlIIIl) * 2.0 + 1.0);
        if (d >= 0.0 && d2 >= 0.0 && d3 >= 0.0) {
            int n = 0;
            int n2 = 0;
            float f = 0.0f;
            while (f <= 1.0f) {
                float f2 = 0.0f;
                while (f2 <= 1.0f) {
                    float f3 = 0.0f;
                    while (f3 <= 1.0f) {
                        double d4 = class_19742.lllIIIllIIIIlllIlIIllIIll + (class_19742.lIlllIlllIIIIlIIlllIllIII - class_19742.lllIIIllIIIIlllIlIIllIIll) * (double)f;
                        double d5 = class_19742.lllIlIIlIIIlIlIIIllIlllIl + (class_19742.IlIIIIIllllllIIlllIllllll - class_19742.lllIlIIlIIIlIlIIIllIlllIl) * (double)f2;
                        double d6 = class_19742.IlIllllllIIlIIllllIIlIIIl + (class_19742.lIllllIIlIIIlIllllllIIIll - class_19742.IlIllllllIIlIIllllIIlIIIl) * (double)f3;
                        if (this.lllIIIllIIIIlllIlIIllIIll(class_0864.lllIIIllIIIIlllIlIIllIIll(d4, d5, d6), class_08642) == null) {
                            ++n;
                        }
                        ++n2;
                        f3 = (float)((double)f3 + d3);
                    }
                    f2 = (float)((double)f2 + d2);
                }
                f = (float)((double)f + d);
            }
            return (float)n / (float)n2;
        }
        return 0.0f;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_0814 class_08142, int n, int n2, int n3, int n4) {
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
        if (this.a_(n, n2, n3) == Blocks.lIIlIlllIllIlIlllIIIIIIII) {
            this.lllIIIllIIIIlllIlIIllIIll(class_08142, 1004, n, n2, n3, 0);
            this.lIllllIIlIIIlIllllllIIIll(n, n2, n3);
            return true;
        }
        return false;
    }

    public String IlIlllIIIIIIlIIllIIllIlll() {
        return "All: " + this.IlIllllllIIlIIllllIIlIIIl.size();
    }

    public String IlIlIIlIlIllIIlIlIIllIIIl() {
        return this.lIlIlIIlIIIIlIIIIIlllIIII.lIlllIlllIIIIlIIlllIllIII();
    }

    @Override
    public class_1774 lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, int n3) {
        if (n2 >= 0 && n2 < 256) {
            class_0723 class_07232;
            class_1774 class_17742;
            int n4;
            class_1774 class_17743 = null;
            if (this.lIlIIllllIlIIIIllIIIIlIIl) {
                for (n4 = 0; n4 < this.lllIIIllIIIIlllIlIIllIIll.size(); ++n4) {
                    class_17742 = (class_1774)this.lllIIIllIIIIlllIlIIllIIll.get(n4);
                    if (class_17742.IIIllIllIIlIlIlIlIllllIIl() || class_17742.lllIlIIlIIIlIlIIIllIlllIl != n || class_17742.IlIllllllIIlIIllllIIlIIIl != n2 || class_17742.lIlllIlllIIIIlIIlllIllIII != n3) continue;
                    class_17743 = class_17742;
                    break;
                }
            }
            if (class_17743 == null && (class_07232 = this.IlIIIIIllllllIIlllIllllll(n >> 4, n3 >> 4)) != null) {
                class_17743 = class_07232.IlIIIIIllllllIIlllIllllll(n & 0xF, n2, n3 & 0xF);
            }
            if (class_17743 == null) {
                for (n4 = 0; n4 < this.lllIIIllIIIIlllIlIIllIIll.size(); ++n4) {
                    class_17742 = (class_1774)this.lllIIIllIIIIlllIlIIllIIll.get(n4);
                    if (class_17742.IIIllIllIIlIlIlIlIllllIIl() || class_17742.lllIlIIlIIIlIlIIIllIlllIl != n || class_17742.IlIllllllIIlIIllllIIlIIIl != n2 || class_17742.lIlllIlllIIIIlIIlllIllIII != n3) continue;
                    class_17743 = class_17742;
                    break;
                }
            }
            return class_17743;
        }
        return null;
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, class_1774 class_17742) {
        if (class_17742 != null && !class_17742.IIIllIllIIlIlIlIlIllllIIl()) {
            if (this.lIlIIllllIlIIIIllIIIIlIIl) {
                class_17742.lllIlIIlIIIlIlIIIllIlllIl = n;
                class_17742.IlIllllllIIlIIllllIIlIIIl = n2;
                class_17742.lIlllIlllIIIIlIIlllIllIII = n3;
                Iterator iterator = this.lllIIIllIIIIlllIlIIllIIll.iterator();
                while (iterator.hasNext()) {
                    class_1774 class_17743 = (class_1774)iterator.next();
                    if (class_17743.lllIlIIlIIIlIlIIIllIlllIl != n || class_17743.IlIllllllIIlIIllllIIlIIIl != n2 || class_17743.lIlllIlllIIIIlIIlllIllIII != n3) continue;
                    class_17743.IllIIIllIIIIlIlIlIllIIlll();
                    iterator.remove();
                }
                this.lllIIIllIIIIlllIlIIllIIll.add(class_17742);
            } else {
                this.IlIIIIIllllllIIlllIllllll.add(class_17742);
                class_0723 class_07232 = this.IlIIIIIllllllIIlllIllllll(n >> 4, n3 >> 4);
                if (class_07232 != null) {
                    class_07232.lllIIIllIIIIlllIlIIllIIll(n & 0xF, n2, n3 & 0xF, class_17742);
                }
            }
        }
    }

    public void llIIllIllIlIIlIIllIllllll(int n, int n2, int n3) {
        class_1774 class_17742 = this.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3);
        if (class_17742 != null && this.lIlIIllllIlIIIIllIIIIlIIl) {
            class_17742.IllIIIllIIIIlIlIlIllIIlll();
            this.lllIIIllIIIIlllIlIIllIIll.remove(class_17742);
        } else {
            class_0723 class_07232;
            if (class_17742 != null) {
                this.lllIIIllIIIIlllIlIIllIIll.remove(class_17742);
                this.IlIIIIIllllllIIlllIllllll.remove(class_17742);
            }
            if ((class_07232 = this.IlIIIIIllllllIIlllIllllll(n >> 4, n3 >> 4)) != null) {
                class_07232.lIllllIIlIIIlIllllllIIIll(n & 0xF, n2, n3 & 0xF);
            }
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1774 class_17742) {
        this.IlIlIIlllIllllllllIIIlIlI.add(class_17742);
    }

    public boolean lllIIlIIIllllllIIIIlIlIlI(int n, int n2, int n3) {
        class_1974 class_19742 = this.a_(n, n2, n3).IlIllllllIIlIIllllIIlIIIl(this, n, n2, n3);
        return class_19742 != null && class_19742.lllIIIllIIIIlllIlIIllIIll() >= 1.0;
    }

    public static boolean lllIIIllIIIIlllIlIIllIIll(class_1843 class_18432, int n, int n2, int n3) {
        Block class_05492 = class_18432.a_(n, n2, n3);
        int n4 = class_18432.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        return class_05492.lIllllIIlIIIlIllllllIIIll().IllIIIllIIIIlIlIlIllIIlll() && class_05492.IllIIIllIIIIlIlIlIllIIlll() ? true : (class_05492 instanceof class_1254 ? (n4 & 4) == 4 : (class_05492 instanceof class_2209 ? (n4 & 8) == 8 : (class_05492 instanceof class_1700 ? true : (class_05492 instanceof class_0337 ? (n4 & 7) == 7 : false))));
    }

    public boolean IlIllllllIIlIIllllIIlIIIl(int n, int n2, int n3, boolean bl) {
        if (n >= -30000000 && n3 >= -30000000 && n < 30000000 && n3 < 30000000) {
            class_0723 class_07232 = this.lIlIlIIlIIIIlIIIIIlllIIII.lIlllIlllIIIIlIIlllIllIII(n >> 4, n3 >> 4);
            if (class_07232 != null && !class_07232.IllIIlllllllIIlIIlIIIIlIl()) {
                Block class_05492 = this.a_(n, n2, n3);
                return class_05492.lIllllIIlIIIlIllllllIIIll().IllIIIllIIIIlIlIlIllIIlll() && class_05492.IllIIIllIIIIlIlIlIllIIlll();
            }
            return bl;
        }
        return bl;
    }

    public void lllllIlllIIllIlIIlIIIllII() {
        int n = this.lllIIIllIIIIlllIlIIllIIll(1.0f);
        if (n != this.IllIIlllllllIIlIIlIIIIlIl) {
            this.IllIIlllllllIIlIIlIIIIlIl = n;
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(boolean bl, boolean bl2) {
        this.IIlIIlIlIlIllIIlIlIIIIlll = bl;
        this.llIIIlllIlllIlIllIIIIllIl = bl2;
    }

    public void lllIIIllIIIIlllIlIIllIIll() {
        this.IlIIIIIllllllIIlllIllllll();
    }

    private void lIllllIIlIIIlIllllllIIIll() {
        if (this.IIlllIlIlllIllIIIlllIIlIl.IlIlIIlIlIllIIlIlIIllIIIl()) {
            this.llIIlllIllIllllIIIlIIIIII = 1.0f;
            if (this.IIlllIlIlllIllIIIlllIIlIl.lllIIlIIIllllllIIIIlIlIlI()) {
                this.lllIIlIIIllllllIIIIlIlIlI = 1.0f;
            }
        }
    }

    protected void IlIIIIIllllllIIlllIllllll() {
        if (!this.IlIlIIlllIIlIllIIIlllllIl.IIIllIIlIIIIIIlIlIIllIIlI && !this.IllIIIIllIIllIllIlllIlIIl) {
            int n = this.IIlllIlIlllIllIIIlllIIlIl.IlIlllIIIIIIlIIllIIllIlll();
            if (n <= 0) {
                if (this.IIlllIlIlllIllIIIlllIIlIl.lllIIlIIIllllllIIIIlIlIlI()) {
                    this.IIlllIlIlllIllIIIlllIIlIl.IlIIIIIllllllIIlllIllllll(this.lllllIlllIIllIlIIlIIIllII.nextInt(12000) + 3600);
                } else {
                    this.IIlllIlIlllIllIIIlllIIlIl.IlIIIIIllllllIIlllIllllll(this.lllllIlllIIllIlIIlIIIllII.nextInt(168000) + 12000);
                }
            } else {
                this.IIlllIlIlllIllIIIlllIIlIl.IlIIIIIllllllIIlllIllllll(--n);
                if (n <= 0) {
                    this.IIlllIlIlllIllIIIlllIIlIl.lllIIIllIIIIlllIlIIllIIll(!this.IIlllIlIlllIllIIIlllIIlIl.lllIIlIIIllllllIIIIlIlIlI());
                }
            }
            this.llIIllIllIlIIlIIllIllllll = this.lllIIlIIIllllllIIIIlIlIlI;
            this.lllIIlIIIllllllIIIIlIlIlI = this.IIlllIlIlllIllIIIlllIIlIl.lllIIlIIIllllllIIIIlIlIlI() ? (float)((double)this.lllIIlIIIllllllIIIIlIlIlI + 0.01) : (float)((double)this.lllIIlIIIllllllIIIIlIlIlI - 0.01);
            this.lllIIlIIIllllllIIIIlIlIlI = MathHelper.clamp_float(this.lllIIlIIIllllllIIIIlIlIlI, 0.0f, 1.0f);
            int n2 = this.IIlllIlIlllIllIIIlllIIlIl.lllllIlllIIllIlIIlIIIllII();
            if (n2 <= 0) {
                if (this.IIlllIlIlllIllIIIlllIIlIl.IlIlIIlIlIllIIlIlIIllIIIl()) {
                    this.IIlllIlIlllIllIIIlllIIlIl.lIllllIIlIIIlIllllllIIIll(this.lllllIlllIIllIlIIlIIIllII.nextInt(12000) + 12000);
                } else {
                    this.IIlllIlIlllIllIIIlllIIlIl.lIllllIIlIIIlIllllllIIIll(this.lllllIlllIIllIlIIlIIIllII.nextInt(168000) + 12000);
                }
            } else {
                this.IIlllIlIlllIllIIIlllIIlIl.lIllllIIlIIIlIllllllIIIll(--n2);
                if (n2 <= 0) {
                    this.IIlllIlIlllIllIIIlllIIlIl.lllIlIIlIIIlIlIIIllIlllIl(!this.IIlllIlIlllIllIIIlllIIlIl.IlIlIIlIlIllIIlIlIIllIIIl());
                }
            }
            this.lIIIIlIlIIlllllIIllIIlIII = this.llIIlllIllIllllIIIlIIIIII;
            this.llIIlllIllIllllIIIlIIIIII = this.IIlllIlIlllIllIIIlllIIlIl.IlIlIIlIlIllIIlIlIIllIIIl() ? (float)((double)this.llIIlllIllIllllIIIlIIIIII + 0.01) : (float)((double)this.llIIlllIllIllllIIIlIIIIII - 0.01);
            this.llIIlllIllIllllIIIlIIIIII = MathHelper.clamp_float(this.llIIlllIllIllllIIIlIIIIII, 0.0f, 1.0f);
        }
    }

    protected void r_() {
        int n;
        int n2;
        int n3;
        class_0814 class_08142;
        int n4;
        this.IIIIIIIIlIllIIllIIlllIllI.clear();
        this.IlIIlllllIIlIlIlllllIllll.startSection("buildList");
        if (!this.IllIIIIllIIllIllIlllIlIIl) {
            for (n4 = 0; n4 < this.lIllllIIlIIIlIllllllIIIll.size(); ++n4) {
                class_08142 = (class_0814)this.lIllllIIlIIIlIllllllIIIll.get(n4);
                n3 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_08142.IlIIlllllIIlIlIlllllIllll / 16.0);
                n2 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_08142.IllIIIIllIIllIllIlllIlIIl / 16.0);
                n = this.IIIllIIlIIIIIIlIlIIllIIlI();
                for (int i = -n; i <= n; ++i) {
                    for (int j = -n; j <= n; ++j) {
                        this.IIIIIIIIlIllIIllIIlllIllI.add(new class_1108(i + n3, j + n2));
                    }
                }
            }
        }
        this.IlIIlllllIIlIlIlllllIllll.endSection();
        if (this.IIllIllIIllIIlllIIIlIlllI > 0) {
            --this.IIllIllIIllIIlllIIIlIlllI;
        }
        this.IlIIlllllIIlIlIlllllIllll.startSection("playerCheckLight");
        if (!this.lIllllIIlIIIlIllllllIIIll.isEmpty()) {
            n4 = this.lllllIlllIIllIlIIlIIIllII.nextInt(this.lIllllIIlIIIlIllllllIIIll.size());
            class_08142 = (class_0814)this.lIllllIIlIIIlIllllllIIIll.get(n4);
            n3 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_08142.IlIIlllllIIlIlIlllllIllll) + this.lllllIlllIIllIlIIlIIIllII.nextInt(11) - 5;
            n2 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_08142.llIIlIlIlllIIllIlIlllIllI) + this.lllllIlllIIllIlIIlIIIllII.nextInt(11) - 5;
            n = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_08142.IllIIIIllIIllIllIlllIlIIl) + this.lllllIlllIIllIlIIlIIIllII.nextInt(11) - 5;
            this.lllllIlllIIllIlIIlIIIllII(n3, n2, n);
        }
        this.IlIIlllllIIlIlIlllllIllll.endSection();
    }

    protected abstract int IIIllIIlIIIIIIlIlIIllIIlI();

    protected void lllIIIllIIIIlllIlIIllIIll(int n, int n2, class_0723 class_07232) {
        this.IlIIlllllIIlIlIlllllIllll.endStartSection("moodSound");
        if (this.IIllIllIIllIIlllIIIlIlllI == 0 && !this.IllIIIIllIIllIllIlllIlIIl) {
            class_0814 class_08142;
            this.IIIllIllIIlIlIlIlIllllIIl = this.IIIllIllIIlIlIlIlIllllIIl * 3 + 1013904223;
            int n3 = this.IIIllIllIIlIlIlIlIllllIIl >> 2;
            int n4 = n3 & 0xF;
            int n5 = n3 >> 8 & 0xF;
            int n6 = n3 >> 16 & 0xFF;
            Block class_05492 = class_07232.lllIlIIlIIIlIlIIIllIlllIl(n4, n6, n5);
            if (class_05492.lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll && this.IIIllIllIIlIlIlIlIllllIIl(n4 += n, n6, n5 += n2) <= this.lllllIlllIIllIlIIlIIIllII.nextInt(8) && this.lllIlIIlIIIlIlIIIllIlllIl(class_1346.lllIIIllIIIIlllIlIIllIIll, n4, n6, n5) <= 0 && (class_08142 = this.lllIIIllIIIIlllIlIIllIIll((double)n4 + 0.5, (double)n6 + 0.5, (double)n5 + 0.5, 8.0)) != null && class_08142.lIllllIIlIIIlIllllllIIIll((double)n4 + 0.5, (double)n6 + 0.5, (double)n5 + 0.5) > 4.0) {
                this.lllIIIllIIIIlllIlIIllIIll((double)n4 + 0.5, (double)n6 + 0.5, (double)n5 + 0.5, "ambient.cave.cave", 0.7f, 0.8f + this.lllllIlllIIllIlIIlIIIllII.nextFloat() * 0.2f);
                this.IIllIllIIllIIlllIIIlIlllI = this.lllllIlllIIllIlIIlIIIllII.nextInt(12000) + 6000;
            }
        }
        this.IlIIlllllIIlIlIlllllIllll.endStartSection("checkLight");
        class_07232.llIIllIllIlIIlIIllIllllll();
    }

    protected void p_() {
        this.r_();
    }

    public boolean IlIlllIIIIIIlIIllIIllIlll(int n, int n2, int n3) {
        return this.lIlllIlllIIIIlIIlllIllIII(n, n2, n3, false);
    }

    public boolean IlIlIIlIlIllIIlIlIIllIIIl(int n, int n2, int n3) {
        return this.lIlllIlllIIIIlIIlllIllIII(n, n2, n3, true);
    }

    public boolean lIlllIlllIIIIlIIlllIllIII(int n, int n2, int n3, boolean bl) {
        Block class_05492;
        class_0672 class_06722 = this.a_(n, n3);
        float f = class_06722.lllIIIllIIIIlllIlIIllIIll(n, n2, n3);
        if (f > 0.15f) {
            return false;
        }
        if (n2 >= 0 && n2 < 256 && this.lllIlIIlIIIlIlIIIllIlllIl(class_1346.lllIlIIlIIIlIlIIIllIlllIl, n, n2, n3) < 10 && ((class_05492 = this.a_(n, n2, n3)) == Blocks.IllIIIllIIIIlIlIlIllIIlll || class_05492 == Blocks.IIIllIllIIlIlIlIlIllllIIl) && this.IlIllllllIIlIIllllIIlIIIl(n, n2, n3) == 0) {
            if (!bl) {
                return true;
            }
            boolean bl2 = true;
            if (bl2 && this.a_(n - 1, n2, n3).lIllllIIlIIIlIllllllIIIll() != class_1855.IllIIlllllllIIlIIlIIIIlIl) {
                bl2 = false;
            }
            if (bl2 && this.a_(n + 1, n2, n3).lIllllIIlIIIlIllllllIIIll() != class_1855.IllIIlllllllIIlIIlIIIIlIl) {
                bl2 = false;
            }
            if (bl2 && this.a_(n, n2, n3 - 1).lIllllIIlIIIlIllllllIIIll() != class_1855.IllIIlllllllIIlIIlIIIIlIl) {
                bl2 = false;
            }
            if (bl2 && this.a_(n, n2, n3 + 1).lIllllIIlIIIlIllllllIIIll() != class_1855.IllIIlllllllIIlIIlIIIIlIl) {
                bl2 = false;
            }
            if (!bl2) {
                return true;
            }
        }
        return false;
    }

    public boolean IlIIIIIllllllIIlllIllllll(int n, int n2, int n3, boolean bl) {
        Block class_05492;
        class_0672 class_06722 = this.a_(n, n3);
        float f = class_06722.lllIIIllIIIIlllIlIIllIIll(n, n2, n3);
        if (f > 0.15f) {
            return false;
        }
        if (!bl) {
            return true;
        }
        return n2 >= 0 && n2 < 256 && this.lllIlIIlIIIlIlIIIllIlllIl(class_1346.lllIlIIlIIIlIlIIIllIlllIl, n, n2, n3) < 10 && (class_05492 = this.a_(n, n2, n3)).lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll && Blocks.lIIllIIlIIIlllIlllIIlIIlI.IlIIIIIllllllIIlllIllllll(this, n, n2, n3);
    }

    public boolean lllllIlllIIllIlIIlIIIllII(int n, int n2, int n3) {
        boolean bl = false;
        if (!this.IlIlIIlllIIlIllIIIlllllIl.IIIllIIlIIIIIIlIlIIllIIlI) {
            bl |= this.IlIllllllIIlIIllllIIlIIIl(class_1346.lllIIIllIIIIlllIlIIllIIll, n, n2, n3);
        }
        return bl |= this.IlIllllllIIlIIllllIIlIIIl(class_1346.lllIlIIlIIIlIlIIIllIlllIl, n, n2, n3);
    }

    private int lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, class_1346 class_13462) {
        if (class_13462 == class_1346.lllIIIllIIIIlllIlIIllIIll && this.IllIIlllllllIIlIIlIIIIlIl(n, n2, n3)) {
            return 15;
        }
        Block class_05492 = this.a_(n, n2, n3);
        int n4 = class_13462 == class_1346.lllIIIllIIIIlllIlIIllIIll ? 0 : class_05492.lIlllIlllIIIIlIIlllIllIII();
        int n5 = class_05492.lllIlIIlIIIlIlIIIllIlllIl();
        if (n5 >= 15 && class_05492.lIlllIlllIIIIlIIlllIllIII() > 0) {
            n5 = 1;
        }
        if (n5 < 1) {
            n5 = 1;
        }
        if (n5 >= 15) {
            return 0;
        }
        if (n4 >= 14) {
            return n4;
        }
        for (int i = 0; i < 6; ++i) {
            int n6 = n + class_0573.lllIlIIlIIIlIlIIIllIlllIl[i];
            int n7 = n2 + class_0573.IlIllllllIIlIIllllIIlIIIl[i];
            int n8 = n3 + class_0573.lIlllIlllIIIIlIIlllIllIII[i];
            int n9 = this.lllIlIIlIIIlIlIIIllIlllIl(class_13462, n6, n7, n8) - n5;
            if (n9 > n4) {
                n4 = n9;
            }
            if (n4 < 14) continue;
            return n4;
        }
        return n4;
    }

    public boolean IlIllllllIIlIIllllIIlIIIl(class_1346 class_13462, int n, int n2, int n3) {
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        int n11;
        int n12;
        int n13;
        if (((Boolean) LunarClient.getInstance().getSettingsManager().IlIlIIlllIIlIllIIIlllllIl.lIlllIlllIIIIlIIlllIllIII()).booleanValue() && ((Boolean) LunarClient.getInstance().getSettingsManager().lIlIlIIlIIIIlIIIIIlllIIII.lIlllIlllIIIIlIIlllIllIII()).booleanValue()) {
            return true;
        }
        if (!this.IlIllllllIIlIIllllIIlIIIl(n, n2, n3, 17)) {
            return false;
        }
        int n14 = 0;
        int n15 = 0;
        this.IlIIlllllIIlIlIlllllIllll.startSection("getBrightness");
        int n16 = this.lllIlIIlIIIlIlIIIllIlllIl(class_13462, n, n2, n3);
        int n17 = this.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, class_13462);
        if (n17 > n16) {
            this.IIIIlIllIlIIlIIlIllIlIlll[n15++] = 133152;
        } else if (n17 < n16) {
            this.IIIIlIllIlIIlIIlIllIlIlll[n15++] = 0x20820 | n16 << 18;
            while (n14 < n15) {
                n13 = this.IIIIlIllIlIIlIIlIllIlIlll[n14++];
                n12 = (n13 & 0x3F) - 32 + n;
                n11 = (n13 >> 6 & 0x3F) - 32 + n2;
                n10 = (n13 >> 12 & 0x3F) - 32 + n3;
                n9 = n13 >> 18 & 0xF;
                n8 = this.lllIlIIlIIIlIlIIIllIlllIl(class_13462, n12, n11, n10);
                if (n8 != n9) continue;
                this.lllIIIllIIIIlllIlIIllIIll(class_13462, n12, n11, n10, 0);
                if (n9 <= 0 || (n7 = MathHelper.lllIIIllIIIIlllIlIIllIIll(n12 - n)) + (n6 = MathHelper.lllIIIllIIIIlllIlIIllIIll(n11 - n2)) + (n5 = MathHelper.lllIIIllIIIIlllIlIIllIIll(n10 - n3)) >= 17) continue;
                for (n4 = 0; n4 < 6; ++n4) {
                    int n18 = n12 + class_0573.lllIlIIlIIIlIlIIIllIlllIl[n4];
                    int n19 = n11 + class_0573.IlIllllllIIlIIllllIIlIIIl[n4];
                    int n20 = n10 + class_0573.lIlllIlllIIIIlIIlllIllIII[n4];
                    int n21 = Math.max(1, this.a_(n18, n19, n20).lllIlIIlIIIlIlIIIllIlllIl());
                    n8 = this.lllIlIIlIIIlIlIIIllIlllIl(class_13462, n18, n19, n20);
                    if (n8 != n9 - n21 || n15 >= this.IIIIlIllIlIIlIIlIllIlIlll.length) continue;
                    this.IIIIlIllIlIIlIIlIllIlIlll[n15++] = n18 - n + 32 | n19 - n2 + 32 << 6 | n20 - n3 + 32 << 12 | n9 - n21 << 18;
                }
            }
            n14 = 0;
        }
        this.IlIIlllllIIlIlIlllllIllll.endSection();
        this.IlIIlllllIIlIlIlllllIllll.startSection("checkedPosition < toCheckCount");
        while (n14 < n15) {
            n13 = this.IIIIlIllIlIIlIIlIllIlIlll[n14++];
            n12 = (n13 & 0x3F) - 32 + n;
            n11 = (n13 >> 6 & 0x3F) - 32 + n2;
            n10 = (n13 >> 12 & 0x3F) - 32 + n3;
            n9 = this.lllIlIIlIIIlIlIIIllIlllIl(class_13462, n12, n11, n10);
            n8 = this.lllIIIllIIIIlllIlIIllIIll(n12, n11, n10, class_13462);
            if (n8 == n9) continue;
            this.lllIIIllIIIIlllIlIIllIIll(class_13462, n12, n11, n10, n8);
            if (n8 <= n9) continue;
            n7 = Math.abs(n12 - n);
            n6 = Math.abs(n11 - n2);
            n5 = Math.abs(n10 - n3);
            int n22 = n4 = n15 < this.IIIIlIllIlIIlIIlIllIlIlll.length - 6 ? 1 : 0;
            if (n7 + n6 + n5 >= 17 || n4 == 0) continue;
            if (this.lllIlIIlIIIlIlIIIllIlllIl(class_13462, n12 - 1, n11, n10) < n8) {
                this.IIIIlIllIlIIlIIlIllIlIlll[n15++] = n12 - 1 - n + 32 + (n11 - n2 + 32 << 6) + (n10 - n3 + 32 << 12);
            }
            if (this.lllIlIIlIIIlIlIIIllIlllIl(class_13462, n12 + 1, n11, n10) < n8) {
                this.IIIIlIllIlIIlIIlIllIlIlll[n15++] = n12 + 1 - n + 32 + (n11 - n2 + 32 << 6) + (n10 - n3 + 32 << 12);
            }
            if (this.lllIlIIlIIIlIlIIIllIlllIl(class_13462, n12, n11 - 1, n10) < n8) {
                this.IIIIlIllIlIIlIIlIllIlIlll[n15++] = n12 - n + 32 + (n11 - 1 - n2 + 32 << 6) + (n10 - n3 + 32 << 12);
            }
            if (this.lllIlIIlIIIlIlIIIllIlllIl(class_13462, n12, n11 + 1, n10) < n8) {
                this.IIIIlIllIlIIlIIlIllIlIlll[n15++] = n12 - n + 32 + (n11 + 1 - n2 + 32 << 6) + (n10 - n3 + 32 << 12);
            }
            if (this.lllIlIIlIIIlIlIIIllIlllIl(class_13462, n12, n11, n10 - 1) < n8) {
                this.IIIIlIllIlIIlIIlIllIlIlll[n15++] = n12 - n + 32 + (n11 - n2 + 32 << 6) + (n10 - 1 - n3 + 32 << 12);
            }
            if (this.lllIlIIlIIIlIlIIIllIlllIl(class_13462, n12, n11, n10 + 1) >= n8) continue;
            this.IIIIlIllIlIIlIIlIllIlIlll[n15++] = n12 - n + 32 + (n11 - n2 + 32 << 6) + (n10 + 1 - n3 + 32 << 12);
        }
        this.IlIIlllllIIlIlIlllllIllll.endSection();
        return true;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(boolean bl) {
        return false;
    }

    public List lllIIIllIIIIlllIlIIllIIll(class_0723 class_07232, boolean bl) {
        return null;
    }

    public List lllIlIIlIIIlIlIIIllIlllIl(class_1521 class_15212, class_1974 class_19742) {
        return this.lllIIIllIIIIlllIlIIllIIll(class_15212, class_19742, (class_0830)null);
    }

    public List lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, class_1974 class_19742, class_0830 class_08302) {
        ArrayList arrayList = new ArrayList();
        int n = MathHelper.IlIllllllIIlIIllllIIlIIIl((class_19742.lllIIIllIIIIlllIlIIllIIll - 2.0) / 16.0);
        int n2 = MathHelper.IlIllllllIIlIIllllIIlIIIl((class_19742.lIlllIlllIIIIlIIlllIllIII + 2.0) / 16.0);
        int n3 = MathHelper.IlIllllllIIlIIllllIIlIIIl((class_19742.IlIllllllIIlIIllllIIlIIIl - 2.0) / 16.0);
        int n4 = MathHelper.IlIllllllIIlIIllllIIlIIIl((class_19742.lIllllIIlIIIlIllllllIIIll + 2.0) / 16.0);
        for (int i = n; i <= n2; ++i) {
            for (int j = n3; j <= n4; ++j) {
                if (!this.IlIllllllIIlIIllllIIlIIIl(i, j)) continue;
                this.IlIIIIIllllllIIlllIllllll(i, j).lllIIIllIIIIlllIlIIllIIll(class_15212, class_19742, arrayList, class_08302);
            }
        }
        return arrayList;
    }

    public List lllIIIllIIIIlllIlIIllIIll(Class class_, class_1974 class_19742) {
        return this.lllIIIllIIIIlllIlIIllIIll(class_, class_19742, (class_0830)null);
    }

    public List lllIIIllIIIIlllIlIIllIIll(Class class_, class_1974 class_19742, class_0830 class_08302) {
        int n = MathHelper.IlIllllllIIlIIllllIIlIIIl((class_19742.lllIIIllIIIIlllIlIIllIIll - 2.0) / 16.0);
        int n2 = MathHelper.IlIllllllIIlIIllllIIlIIIl((class_19742.lIlllIlllIIIIlIIlllIllIII + 2.0) / 16.0);
        int n3 = MathHelper.IlIllllllIIlIIllllIIlIIIl((class_19742.IlIllllllIIlIIllllIIlIIIl - 2.0) / 16.0);
        int n4 = MathHelper.IlIllllllIIlIIllllIIlIIIl((class_19742.lIllllIIlIIIlIllllllIIIll + 2.0) / 16.0);
        ArrayList arrayList = new ArrayList();
        for (int i = n; i <= n2; ++i) {
            for (int j = n3; j <= n4; ++j) {
                if (!this.IlIllllllIIlIIllllIIlIIIl(i, j)) continue;
                this.IlIIIIIllllllIIlllIllllll(i, j).lllIIIllIIIIlllIlIIllIIll(class_, class_19742, arrayList, class_08302);
            }
        }
        return arrayList;
    }

    public class_1521 lllIIIllIIIIlllIlIIllIIll(Class class_, class_1974 class_19742, class_1521 class_15212) {
        List list = this.lllIIIllIIIIlllIlIIllIIll(class_, class_19742);
        class_1521 class_15213 = null;
        double d = Double.MAX_VALUE;
        for (int i = 0; i < list.size(); ++i) {
            double d2;
            class_1521 class_15214 = (class_1521)list.get(i);
            if (class_15214 == class_15212 || !((d2 = class_15212.IlIIIIIllllllIIlllIllllll(class_15214)) <= d)) continue;
            class_15213 = class_15214;
            d = d2;
        }
        return class_15213;
    }

    public abstract class_1521 lllIIIllIIIIlllIlIIllIIll(int var1);

    public List IlIlIIlllIIlIllIIIlllllIl() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, int n3, class_1774 class_17742) {
        if (this.IlIIIIIllllllIIlllIllllll(n, n2, n3)) {
            this.lIlllIlllIIIIlIIlllIllIII(n, n3).IIIllIIlIIIIIIlIlIIllIIlI();
        }
    }

    public int lllIIIllIIIIlllIlIIllIIll(Class class_) {
        int n = 0;
        for (int i = 0; i < this.IlIllllllIIlIIllllIIlIIIl.size(); ++i) {
            class_1521 class_15212 = (class_1521)this.IlIllllllIIlIIllllIIlIIIl.get(i);
            if (class_15212 instanceof class_0339 && ((class_0339)class_15212).IIIlIIllIIlIlIIlIIllIIIIl() || !class_.isAssignableFrom(class_15212.getClass())) continue;
            ++n;
        }
        return n;
    }

    public void lllIIIllIIIIlllIlIIllIIll(List list) {
        this.IlIllllllIIlIIllllIIlIIIl.addAll(list);
        for (int i = 0; i < list.size(); ++i) {
            this.IlIllllllIIlIIllllIIlIIIl((class_1521)list.get(i));
        }
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(List list) {
        this.lIlllIlllIIIIlIIlllIllIII.addAll(list);
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(Block class_05492, int n, int n2, int n3, boolean bl, int n4, class_1521 class_15212, ItemStack class_08972) {
        class_1974 class_19742;
        Block class_05493 = this.a_(n, n2, n3);
        class_1974 class_19743 = class_19742 = bl ? null : class_05492.IlIllllllIIlIIllllIIlIIIl(this, n, n2, n3);
        return class_19742 != null && !this.lllIIIllIIIIlllIlIIllIIll(class_19742, class_15212) ? false : (class_05493.lIllllIIlIIIlIllllllIIIll() == class_1855.lllllIlllIIllIlIIlIIIllII && class_05492 == Blocks.llIlllllIIlIIlIIllllIllll ? true : class_05493.lIllllIIlIIIlIllllllIIIll().IIIllIllIIlIlIlIlIllllIIl() && class_05492.lllIIIllIIIIlllIlIIllIIll(this, n, n2, n3, n4, class_08972));
    }

    public class_2086 lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, class_1521 class_15213, float f, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        this.IlIIlllllIIlIlIlllllIllll.startSection("pathfind");
        int n = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_15212.IlIIlllllIIlIlIlllllIllll);
        int n2 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_15212.llIIlIlIlllIIllIlIlllIllI + 1.0);
        int n3 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_15212.IllIIIIllIIllIllIlllIlIIl);
        int n4 = (int)(f + 16.0f);
        int n5 = n - n4;
        int n6 = n2 - n4;
        int n7 = n3 - n4;
        int n8 = n + n4;
        int n9 = n2 + n4;
        int n10 = n3 + n4;
        class_1496 class_14962 = new class_1496(this, n5, n6, n7, n8, n9, n10, 0);
        class_2086 class_20862 = new class_2111(class_14962, bl, bl2, bl3, bl4).lllIIIllIIIIlllIlIIllIIll(class_15212, class_15213, f);
        this.IlIIlllllIIlIlIlllllIllll.endSection();
        return class_20862;
    }

    public class_2086 lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, int n, int n2, int n3, float f, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        this.IlIIlllllIIlIlIlllllIllll.startSection("pathfind");
        int n4 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_15212.IlIIlllllIIlIlIlllllIllll);
        int n5 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_15212.llIIlIlIlllIIllIlIlllIllI);
        int n6 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_15212.IllIIIIllIIllIllIlllIlIIl);
        int n7 = (int)(f + 8.0f);
        int n8 = n4 - n7;
        int n9 = n5 - n7;
        int n10 = n6 - n7;
        int n11 = n4 + n7;
        int n12 = n5 + n7;
        int n13 = n6 + n7;
        class_1496 class_14962 = new class_1496(this, n8, n9, n10, n11, n12, n13, 0);
        class_2086 class_20862 = new class_2111(class_14962, bl, bl2, bl3, bl4).lllIIIllIIIIlllIlIIllIIll(class_15212, n, n2, n3, f);
        this.IlIIlllllIIlIlIlllllIllll.endSection();
        return class_20862;
    }

    @Override
    public int lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, int n3, int n4) {
        return this.a_(n, n2, n3).IlIIIIIllllllIIlllIllllll((class_1843)this, n, n2, n3, n4);
    }

    public int IlIlIIlllIIlIllIIIlllllIl(int n, int n2, int n3) {
        int n4 = 0;
        int n5 = Math.max(n4, this.lllIlIIlIIIlIlIIIllIlllIl(n, n2 - 1, n3, 0));
        if (n5 >= 15) {
            return n5;
        }
        if ((n5 = Math.max(n5, this.lllIlIIlIIIlIlIIIllIlllIl(n, n2 + 1, n3, 1))) >= 15) {
            return n5;
        }
        if ((n5 = Math.max(n5, this.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3 - 1, 2))) >= 15) {
            return n5;
        }
        if ((n5 = Math.max(n5, this.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3 + 1, 3))) >= 15) {
            return n5;
        }
        if ((n5 = Math.max(n5, this.lllIlIIlIIIlIlIIIllIlllIl(n - 1, n2, n3, 4))) >= 15) {
            return n5;
        }
        return (n5 = Math.max(n5, this.lllIlIIlIIIlIlIIIllIlllIl(n + 1, n2, n3, 5))) >= 15 ? n5 : n5;
    }

    public boolean IlIIIIIllllllIIlllIllllll(int n, int n2, int n3, int n4) {
        return this.lIllllIIlIIIlIllllllIIIll(n, n2, n3, n4) > 0;
    }

    public int lIllllIIlIIIlIllllllIIIll(int n, int n2, int n3, int n4) {
        return this.a_(n, n2, n3).IIIllIllIIlIlIlIlIllllIIl() ? this.IlIlIIlllIIlIllIIIlllllIl(n, n2, n3) : this.a_(n, n2, n3).lIlllIlllIIIIlIIlllIllIII((class_1843)this, n, n2, n3, n4);
    }

    public boolean lIIlIIIIIlIlllIlIIlIlIlll(int n, int n2, int n3) {
        return this.lIllllIIlIIIlIllllllIIIll(n, n2 - 1, n3, 0) > 0 ? true : (this.lIllllIIlIIIlIllllllIIIll(n, n2 + 1, n3, 1) > 0 ? true : (this.lIllllIIlIIIlIllllllIIIll(n, n2, n3 - 1, 2) > 0 ? true : (this.lIllllIIlIIIlIllllllIIIll(n, n2, n3 + 1, 3) > 0 ? true : (this.lIllllIIlIIIlIllllllIIIll(n - 1, n2, n3, 4) > 0 ? true : this.lIllllIIlIIIlIllllllIIIll(n + 1, n2, n3, 5) > 0))));
    }

    public int lIlIlIIlIIIIlIIIIIlllIIII(int n, int n2, int n3) {
        int n4 = 0;
        for (int i = 0; i < 6; ++i) {
            int n5 = this.lIllllIIlIIIlIllllllIIIll(n + class_0573.lllIlIIlIIIlIlIIIllIlllIl[i], n2 + class_0573.IlIllllllIIlIIllllIIlIIIl[i], n3 + class_0573.lIlllIlllIIIIlIIlllIllIII[i], i);
            if (n5 >= 15) {
                return 15;
            }
            if (n5 <= n4) continue;
            n4 = n5;
        }
        return n4;
    }

    public class_0814 lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, double d) {
        return this.lllIIIllIIIIlllIlIIllIIll(class_15212.IlIIlllllIIlIlIlllllIllll, class_15212.llIIlIlIlllIIllIlIlllIllI, class_15212.IllIIIIllIIllIllIlllIlIIl, d);
    }

    public class_0814 lllIIIllIIIIlllIlIIllIIll(double d, double d2, double d3, double d4) {
        double d5 = -1.0;
        class_0814 class_08142 = null;
        for (int i = 0; i < this.lIllllIIlIIIlIllllllIIIll.size(); ++i) {
            class_0814 class_08143 = (class_0814)this.lIllllIIlIIIlIllllllIIIll.get(i);
            double d6 = class_08143.lIllllIIlIIIlIllllllIIIll(d, d2, d3);
            if (!(d4 < 0.0) && !(d6 < d4 * d4) || d5 != -1.0 && !(d6 < d5)) continue;
            d5 = d6;
            class_08142 = class_08143;
        }
        return class_08142;
    }

    public class_0814 lllIlIIlIIIlIlIIIllIlllIl(class_1521 class_15212, double d) {
        return this.lllIlIIlIIIlIlIIIllIlllIl(class_15212.IlIIlllllIIlIlIlllllIllll, class_15212.llIIlIlIlllIIllIlIlllIllI, class_15212.IllIIIIllIIllIllIlllIlIIl, d);
    }

    public class_0814 lllIlIIlIIIlIlIIIllIlllIl(double d, double d2, double d3, double d4) {
        double d5 = -1.0;
        class_0814 class_08142 = null;
        for (int i = 0; i < this.lIllllIIlIIIlIllllllIIIll.size(); ++i) {
            class_0814 class_08143 = (class_0814)this.lIllllIIlIIIlIllllllIIIll.get(i);
            if (class_08143.lIIlIlIlIlIllIIlIIllllIll.lllIIIllIIIIlllIlIIllIIll || !class_08143.IlllIIlllllllIIllIlIllllI()) continue;
            double d6 = class_08143.lIllllIIlIIIlIllllllIIIll(d, d2, d3);
            double d7 = d4;
            if (class_08143.IIlIIlIlIlIllIIlIlIIIIlll()) {
                d7 = d4 * (double)0.8f;
            }
            if (class_08143.lIIlIlIIllIIIlIIlIlIIIlII()) {
                float f = class_08143.llllIIllllIllIlllllIIlIlI();
                if (f < 0.1f) {
                    f = 0.1f;
                }
                d7 *= (double)(0.7f * f);
            }
            if (!(d4 < 0.0) && !(d6 < d7 * d7) || d5 != -1.0 && !(d6 < d5)) continue;
            d5 = d6;
            class_08142 = class_08143;
        }
        return class_08142;
    }

    public class_0814 lllIIIllIIIIlllIlIIllIIll(String string) {
        for (int i = 0; i < this.lIllllIIlIIIlIllllllIIIll.size(); ++i) {
            class_0814 class_08142 = (class_0814)this.lIllllIIlIIIlIllllllIIIll.get(i);
            if (!string.equals(class_08142.llllIIIIlIIIlIIIIIIlIllll())) continue;
            return class_08142;
        }
        return null;
    }

    public class_0814 lllIlIIlIIIlIlIIIllIlllIl(String string) {
        for (int i = 0; i < this.lIllllIIlIIIlIllllllIIIll.size(); ++i) {
            class_0814 class_08142 = (class_0814)this.lIllllIIlIIIlIllllllIIIll.get(i);
            if (!class_08142.IlllIIlllllllIIllIlIllllI() || !string.equals(class_08142.lIIlIlllIIlIIIIlIlIIIIlll().getId().toString()) && !string.equals(class_08142.lIIlIlllIIlIIIIlIlIIIIlll().getId().toString().replaceAll("-", ""))) continue;
            return class_08142;
        }
        return null;
    }

    public class_0814 lllIIIllIIIIlllIlIIllIIll(UUID uUID) {
        for (int i = 0; i < this.lIllllIIlIIIlIllllllIIIll.size(); ++i) {
            class_0814 class_08142 = (class_0814)this.lIllllIIlIIIlIllllllIIIll.get(i);
            if (!uUID.equals(class_08142.lIIlllIIlIlIlIIIlIlllIIll())) continue;
            return class_08142;
        }
        return null;
    }

    public void q_() {
    }

    public void lIIlIIIIIlIlllIlIIlIlIlll() {
        this.IlIIIlIIIIllIIIllIIIIIIll.lIlllIlllIIIIlIIlllIllIII();
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(long l) {
        this.IIlllIlIlllIllIIIlllIIlIl.lllIIIllIIIIlllIlIIllIIll(l);
    }

    public long lIlIlIIlIIIIlIIIIIlllIIII() {
        return this.IIlllIlIlllIllIIIlllIIlIl.lllIlIIlIIIlIlIIIllIlllIl();
    }

    public long IlIIIlIIIIllIIIllIIIIIIll() {
        return this.IIlllIlIlllIllIIIlllIIlIl.lIllllIIlIIIlIllllllIIIll();
    }

    public long IIlllIlIlllIllIIIlllIIlIl() {
        return this.IIlllIlIlllIllIIIlllIIlIl.IIIllIIlIIIIIIlIlIIllIIlI();
    }

    public void lllIIIllIIIIlllIlIIllIIll(long l) {
        this.IIlllIlIlllIllIIIlllIIlIl.lllIlIIlIIIlIlIIIllIlllIl(l);
    }

    public class_2208 lIlIllIIlIIlIIlIIlIIlIIll() {
        return new class_2208(this.IIlllIlIlllIllIIIlllIIlIl.IlIllllllIIlIIllllIIlIIIl(), this.IIlllIlIlllIllIIIlllIIlIl.lIlllIlllIIIIlIIlllIllIII(), this.IIlllIlIlllIllIIIlllIIlIl.IlIIIIIllllllIIlllIllllll());
    }

    public void IlIIIlIIIIllIIIllIIIIIIll(int n, int n2, int n3) {
        this.IIlllIlIlllIllIIIlllIIlIl.lllIIIllIIIIlllIlIIllIIll(n, n2, n3);
    }

    public void IllIIlllllllIIlIIlIIIIlIl(class_1521 class_15212) {
        int n = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_15212.IlIIlllllIIlIlIlllllIllll / 16.0);
        int n2 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_15212.IllIIIIllIIllIllIlllIlIIl / 16.0);
        int n3 = 2;
        for (int i = n - n3; i <= n + n3; ++i) {
            for (int j = n2 - n3; j <= n2 + n3; ++j) {
                this.IlIIIIIllllllIIlllIllllll(i, j);
            }
        }
        if (!this.IlIllllllIIlIIllllIIlIIIl.contains(class_15212)) {
            this.IlIllllllIIlIIllllIIlIIIl.add(class_15212);
        }
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_0814 class_08142, int n, int n2, int n3) {
        return true;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, byte by) {
    }

    public class_1848 llIIlIllIllllIlIIIIlIIlll() {
        return this.lIlIlIIlIIIIlIIIIIlllIIII;
    }

    public void lIlllIlllIIIIlIIlllIllIII(int n, int n2, int n3, Block class_05492, int n4, int n5) {
        class_05492.lllIlIIlIIIlIlIIIllIlllIl(this, n, n2, n3, n4, n5);
    }

    public class_0028 llIllllIlIllIIIlIllIIlIlI() {
        return this.IlIIIlIIIIllIIIllIIIIIIll;
    }

    public class_0770 lIlllIlllIlIIIIlllIlIlIIl() {
        return this.IIlllIlIlllIllIIIlllIIlIl;
    }

    public class_1263 IlIIlllllIIlIlIlllllIllll() {
        return this.IIlllIlIlllIllIIIlllIIlIl.llIIlIllIllllIlIIIIlIIlll();
    }

    public void llIIlIlIlllIIllIlIlllIllI() {
    }

    public float IllIIlllllllIIlIIlIIIIlIl(float f) {
        return (this.llIIllIllIlIIlIIllIllllll + (this.lllIIlIIIllllllIIIIlIlIlI - this.llIIllIllIlIIlIIllIllllll) * f) * this.IllIIIllIIIIlIlIlIllIIlll(f);
    }

    public void IIIllIllIIlIlIlIlIllllIIl(float f) {
        this.llIIllIllIlIIlIIllIllllll = f;
        this.lllIIlIIIllllllIIIIlIlIlI = f;
    }

    public float IllIIIllIIIIlIlIlIllIIlll(float f) {
        return this.lIIIIlIlIIlllllIIllIIlIII + (this.llIIlllIllIllllIIIlIIIIII - this.lIIIIlIlIIlllllIIllIIlIII) * f;
    }

    public void lIIIIlIlIIlllllIIllIIlIII(float f) {
        this.lIIIIlIlIIlllllIIllIIlIII = f;
        this.llIIlllIllIllllIIIlIIIIII = f;
    }

    public boolean IllIIIIllIIllIllIlllIlIIl() {
        return (double)this.IllIIlllllllIIlIIlIIIIlIl(1.0f) > 0.9;
    }

    public boolean IIIIIIIIlIllIIllIIlllIllI() {
        return (double)this.IllIIIllIIIIlIlIlIllIIlll(1.0f) > 0.2;
    }

    public boolean IIlllIlIlllIllIIIlllIIlIl(int n, int n2, int n3) {
        if (!this.IIIIIIIIlIllIIllIIlllIllI()) {
            return false;
        }
        if (!this.IllIIlllllllIIlIIlIIIIlIl(n, n2, n3)) {
            return false;
        }
        if (this.IllIIlllllllIIlIIlIIIIlIl(n, n3) > n2) {
            return false;
        }
        class_0672 class_06722 = this.a_(n, n3);
        return class_06722.lIlllIlllIIIIlIIlllIllIII() ? false : (this.IlIIIIIllllllIIlllIllllll(n, n2, n3, false) ? false : class_06722.IlIIIIIllllllIIlllIllllll());
    }

    public boolean lIlIllIIlIIlIIlIIlIIlIIll(int n, int n2, int n3) {
        class_0672 class_06722 = this.a_(n, n3);
        return class_06722.lIllllIIlIIIlIllllllIIIll();
    }

    public void lllIIIllIIIIlllIlIIllIIll(String string, class_0469 class_04692) {
        this.llIIlIllIllllIlIIIIlIIlll.lllIIIllIIIIlllIlIIllIIll(string, class_04692);
    }

    public class_0469 lllIIIllIIIIlllIlIIllIIll(Class class_, String string) {
        return this.llIIlIllIllllIlIIIIlIIlll.lllIIIllIIIIlllIlIIllIIll(class_, string);
    }

    public int IlIllllllIIlIIllllIIlIIIl(String string) {
        return this.llIIlIllIllllIlIIIIlIIlll.lllIIIllIIIIlllIlIIllIIll(string);
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, int n3, int n4, int n5) {
        for (int i = 0; i < this.lIIlIIIIIlIlllIlIIlIlIlll.size(); ++i) {
            ((class_2249)this.lIIlIIIIIlIlllIlIIlIlIlll.get(i)).lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n4, n5);
        }
    }

    public void IlIllllllIIlIIllllIIlIIIl(int n, int n2, int n3, int n4, int n5) {
        this.lllIIIllIIIIlllIlIIllIIll(null, n, n2, n3, n4, n5);
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0814 class_08142, int n, int n2, int n3, int n4, int n5) {
        try {
            for (int i = 0; i < this.lIIlIIIIIlIlllIlIIlIlIlll.size(); ++i) {
                ((class_2249)this.lIIlIIIIIlIlllIlIIlIlIlll.get(i)).lllIIIllIIIIlllIlIIllIIll(class_08142, n, n2, n3, n4, n5);
            }
        }
        catch (Throwable throwable) {
            CrashReport class_02232 = CrashReport.lllIIIllIIIIlllIlIIllIIll(throwable, "Playing level event");
            class_0799 class_07992 = class_02232.lllIIIllIIIIlllIlIIllIIll("Level event being played");
            class_07992.lllIIIllIIIIlllIlIIllIIll("Event source", class_08142);
            class_07992.lllIIIllIIIIlllIlIIllIIll("Event type", n);
            class_07992.lllIIIllIIIIlllIlIIllIIll("Event data", n5);
            throw new class_0892(class_02232);
        }
    }

    @Override
    public int lIlllIlllIIIIlIIlllIllIII() {
        return 256;
    }

    public int IIlIIlIlIlIllIIlIlIIIIlll() {
        return this.IlIlIIlllIIlIllIIIlllllIl.IIIllIIlIIIIIIlIlIIllIIlI ? 128 : 256;
    }

    public Random llIIlIllIllllIlIIIIlIIlll(int n, int n2, int n3) {
        long l = (long)n * 341873128712L + (long)n2 * 132897987541L + this.lIlllIlllIlIIIIlllIlIlIIl().lllIlIIlIIIlIlIIIllIlllIl() + (long)n3;
        this.lllllIlllIIllIlIIlIIIllII.setSeed(l);
        return this.lllllIlllIIllIlIIlIIIllII;
    }

    public class_2137 lllIlIIlIIIlIlIIIllIlllIl(String string, int n, int n2, int n3) {
        return this.llIIlIllIllllIlIIIIlIIlll().lllIIIllIIIIlllIlIIllIIll(this, string, n, n2, n3);
    }

    @Override
    public boolean IlIllllllIIlIIllllIIlIIIl() {
        return false;
    }

    public double llIIIlllIlllIlIllIIIIllIl() {
        return this.IIlllIlIlllIllIIIlllIIlIl.IlIIIlIIIIllIIIllIIIIIIll() == class_1074.IlIllllllIIlIIllllIIlIIIl ? 0.0 : 63.0;
    }

    public class_0799 addWorldInfoToCrashReport(CrashReport class_02232) {
        class_0799 class_07992 = class_02232.lllIIIllIIIIlllIlIIllIIll("Affected level", 1);
        class_07992.lllIIIllIIIIlllIlIIllIIll("Level name", this.IIlllIlIlllIllIIIlllIIlIl == null ? "????" : this.IIlllIlIlllIllIIIlllIIlIl.lIIIIlIlIIlllllIIllIIlIII());
        class_07992.addCrashSectionCallable("All players", new class_2071(this));
        class_07992.addCrashSectionCallable("Chunk stats", new class_2129(this));
        return class_07992;
    }

    public void lIlllIlllIIIIlIIlllIllIII(int n, int n2, int n3, int n4, int n5) {
        for (int i = 0; i < this.lIIlIIIIIlIlllIlIIlIlIlll.size(); ++i) {
            class_2249 class_22492 = (class_2249)this.lIIlIIIIIlIlllIlIIlIlIlll.get(i);
            class_22492.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3, n4, n5);
        }
    }

    public Calendar IIIIlIllIlIIlIIlIllIlIlll() {
        if (this.IlIIIlIIIIllIIIllIIIIIIll() % 600L == 0L) {
            this.llIIIIllIIIIIIIlIIIlIIIIl.setTimeInMillis(class_0220.lllIIIlIIlIlIllIIIIIlIIll());
        }
        return this.llIIIIllIIIIIIIlIIIlIIIIl;
    }

    public void lllIIIllIIIIlllIlIIllIIll(double d, double d2, double d3, double d4, double d5, double d6, class_0775 class_07752) {
    }

    public class_0141 IlIlIIlllIllllllllIIIlIlI() {
        return this.llIIlIlIlllIIllIlIlllIllI;
    }

    public void lIllllIIlIIIlIllllllIIIll(int n, int n2, int n3, Block class_05492) {
        for (int i = 0; i < 4; ++i) {
            Block class_05493;
            int n4 = n + class_1632.lllIIIllIIIIlllIlIIllIIll[i];
            int n5 = n3 + class_1632.lllIlIIlIIIlIlIIIllIlllIl[i];
            Block class_05494 = this.a_(n4, n2, n5);
            if (Blocks.lIllIIlllIIIlIlIIIlllIlIl.IlIIIIIllllllIIlllIllllll(class_05494)) {
                class_05494.lllIIIllIIIIlllIlIIllIIll(this, n4, n2, n5, class_05492);
                continue;
            }
            if (!class_05494.IIIllIllIIlIlIlIlIllllIIl() || !Blocks.lIllIIlllIIIlIlIIIlllIlIl.IlIIIIIllllllIIlllIllllll(class_05493 = this.a_(n4 += class_1632.lllIIIllIIIIlllIlIIllIIll[i], n2, n5 += class_1632.lllIlIIlIIIlIlIIIllIlllIl[i]))) continue;
            class_05493.lllIIIllIIIIlllIlIIllIIll(this, n4, n2, n5, class_05492);
        }
    }

    public float lllIIIllIIIIlllIlIIllIIll(double d, double d2, double d3) {
        return this.llIllllIlIllIIIlIllIIlIlI(MathHelper.IlIllllllIIlIIllllIIlIIIl(d), MathHelper.IlIllllllIIlIIllllIIlIIIl(d2), MathHelper.IlIllllllIIlIIllllIIlIIIl(d3));
    }

    public float llIllllIlIllIIIlIllIIlIlI(int n, int n2, int n3) {
        boolean bl;
        float f = 0.0f;
        boolean bl2 = bl = this.IlIlIIlIlIllIIlIlIIllIIIl == class_1999.lIlllIlllIIIIlIIlllIllIII;
        if (this.IlIIIIIllllllIIlllIllllll(n, n2, n3)) {
            float f2 = this.llIIllIllIlIIlIIllIllllll();
            f += MathHelper.clamp_float((float)this.lIlllIlllIIIIlIIlllIllIII((int)n, (int)n3).lIIlIIIIIlIlllIlIIlIlIlll / 3600000.0f, 0.0f, 1.0f) * (bl ? 1.0f : 0.75f);
            f += f2 * 0.25f;
        }
        if (this.IlIlIIlIlIllIIlIlIIllIIIl == class_1999.lllIlIIlIIIlIlIIIllIlllIl || this.IlIlIIlIlIllIIlIlIIllIIIl == class_1999.lllIIIllIIIIlllIlIIllIIll) {
            f *= (float)this.IlIlIIlIlIllIIlIlIIllIIIl.lllIIIllIIIIlllIlIIllIIll() / 2.0f;
        }
        return MathHelper.clamp_float(f, 0.0f, bl ? 1.5f : 1.0f);
    }

    public void llllIIIIlIIIlIIIIIIlIllll() {
        for (class_2249 class_22492 : this.lIIlIIIIIlIlllIlIIlIlIlll) {
            class_22492.lIlllIlllIIIIlIIlllIllIII();
        }
    }
}

