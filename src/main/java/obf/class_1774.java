package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.util.HashMap;
import java.util.Map;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.network.Packet;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_1774 {
    private static final Logger IllIIlllllllIIlIIlIIIIlIl = LogManager.getLogger();
    private static Map IIIllIllIIlIlIlIlIllllIIl = new HashMap();
    private static Map IllIIIllIIIIlIlIlIllIIlll = new HashMap();
    protected class_1334 lllIIIllIIIIlllIlIIllIIll;
    public int lllIlIIlIIIlIlIIIllIlllIl;
    public int IlIllllllIIlIIllllIIlIIIl;
    public int lIlllIlllIIIIlIIlllIllIII;
    protected boolean IlIIIIIllllllIIlllIllllll;
    public int lIllllIIlIIIlIllllllIIIll = -1;
    public Block IIIllIIlIIIIIIlIlIIllIIlI;

    private static void lllIIIllIIIIlllIlIIllIIll(Class class_, String string) {
        if (IIIllIllIIlIlIlIlIllllIIl.containsKey(string)) {
            throw new IllegalArgumentException("Duplicate id: " + string);
        }
        IIIllIllIIlIlIlIlIllllIIl.put(string, class_);
        IllIIIllIIIIlIlIlIllIIlll.put(class_, string);
    }

    public class_1334 IIIIIIIIlIllIIllIIlllIllI() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342) {
        this.lllIIIllIIIIlllIlIIllIIll = class_13342;
    }

    public boolean lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lllIIIllIIIIlllIlIIllIIll != null;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        this.lllIlIIlIIIlIlIIIllIlllIl = class_07752.lIllllIIlIIIlIllllllIIIll("x");
        this.IlIllllllIIlIIllllIIlIIIl = class_07752.lIllllIIlIIIlIllllllIIIll("y");
        this.lIlllIlllIIIIlIIlllIllIII = class_07752.lIllllIIlIIIlIllllllIIIll("z");
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        String string = (String)IllIIIllIIIIlIlIlIllIIlll.get(this.getClass());
        if (string == null) {
            throw new RuntimeException(this.getClass() + " is missing a mapping! This is a bug!");
        }
        class_07752.lllIIIllIIIIlllIlIIllIIll("id", string);
        class_07752.lllIIIllIIIIlllIlIIllIIll("x", this.lllIlIIlIIIlIlIIIllIlllIl);
        class_07752.lllIIIllIIIIlllIlIIllIIll("y", this.IlIllllllIIlIIllllIIlIIIl);
        class_07752.lllIIIllIIIIlllIlIIllIIll("z", this.lIlllIlllIIIIlIIlllIllIII);
    }

    public void IlIllllllIIlIIllllIIlIIIl() {
    }

    public static class_1774 IlIllllllIIlIIllllIIlIIIl(class_0775 class_07752) {
        class_1774 class_17742 = null;
        try {
            Class class_ = (Class)IIIllIllIIlIlIlIlIllllIIl.get(class_07752.IllIIIllIIIIlIlIlIllIIlll("id"));
            if (class_ != null) {
                class_17742 = (class_1774)class_.newInstance();
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        if (class_17742 != null) {
            class_17742.lllIIIllIIIIlllIlIIllIIll(class_07752);
        } else {
            IllIIlllllllIIlIIlIIIIlIl.warn("Skipping BlockEntity with id " + class_07752.IllIIIllIIIIlIlIlIllIIlll("id"));
        }
        return class_17742;
    }

    public int lIlllIlllIIIIlIIlllIllIII() {
        if (this.lIllllIIlIIIlIllllllIIIll == -1) {
            this.lIllllIIlIIIlIllllllIIIll = this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl(this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII);
        }
        return this.lIllllIIlIIIlIllllllIIIll;
    }

    public void llIIlIllIllllIlIIIIlIIlll() {
        if (this.lllIIIllIIIIlllIlIIllIIll != null) {
            this.lIllllIIlIIIlIllllllIIIll = this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl(this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII);
            this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl(this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, this);
            if (this.IIIllIIlIIIIIIlIlIIllIIlI() != Blocks.lllIIIllIIIIlllIlIIllIIll) {
                this.lllIIIllIIIIlllIlIIllIIll.lIllllIIlIIIlIllllllIIIll(this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, this.IIIllIIlIIIIIIlIlIIllIIlI());
            }
        }
    }

    public double lllIIIllIIIIlllIlIIllIIll(double d, double d2, double d3) {
        double d4 = (double)this.lllIlIIlIIIlIlIIIllIlllIl + 0.5 - d;
        double d5 = (double)this.IlIllllllIIlIIllllIIlIIIl + 0.5 - d2;
        double d6 = (double)this.lIlllIlllIIIIlIIlllIllIII + 0.5 - d3;
        return d4 * d4 + d5 * d5 + d6 * d6;
    }

    public double lIllllIIlIIIlIllllllIIIll() {
        return 4096.0;
    }

    public Block IIIllIIlIIIIIIlIlIIllIIlI() {
        if (this.IIIllIIlIIIIIIlIlIIllIIlI == null) {
            this.IIIllIIlIIIIIIlIlIIllIIlI = this.lllIIIllIIIIlllIlIIllIIll.a_(this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII);
        }
        return this.IIIllIIlIIIIIIlIlIIllIIlI;
    }

    public Packet IllIIlllllllIIlIIlIIIIlIl() {
        return null;
    }

    public boolean IIIllIllIIlIlIlIlIllllIIl() {
        return this.IlIIIIIllllllIIlllIllllll;
    }

    public void IllIIIllIIIIlIlIlIllIIlll() {
        this.IlIIIIIllllllIIlllIllllll = true;
    }

    public void lIIIIlIlIIlllllIIllIIlIII() {
        this.IlIIIIIllllllIIlllIllllll = false;
    }

    public boolean lllIlIIlIIIlIlIIIllIlllIl(int n, int n2) {
        return false;
    }

    public void llIIlllIllIllllIIIlIIIIII() {
        this.IIIllIIlIIIIIIlIlIIllIIlI = null;
        this.lIllllIIlIIIlIllllllIIIll = -1;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0799 class_07992) {
        class_07992.addCrashSectionCallable("Name", new class_0910(this));
        class_0799.lllIIIllIIIIlllIlIIllIIll(class_07992, this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, this.IIIllIIlIIIIIIlIlIIllIIlI(), this.lIlllIlllIIIIlIIlllIllIII());
        class_07992.addCrashSectionCallable("Actual block type", new class_2214(this));
        class_07992.addCrashSectionCallable("Actual block data value", new class_1058(this));
    }

    static /* synthetic */ Map llIIllIllIlIIlIIllIllllll() {
        return IllIIIllIIIIlIlIlIllIIlll;
    }

    static {
        class_1774.lllIIIllIIIIlllIlIIllIIll(class_1587.class, "Furnace");
        class_1774.lllIIIllIIIIlllIlIIllIIll(class_0071.class, "Chest");
        class_1774.lllIIIllIIIIlllIlIIllIIll(class_1314.class, "EnderChest");
        class_1774.lllIIIllIIIIlllIlIIllIIll(class_2195.class, "RecordPlayer");
        class_1774.lllIIIllIIIIlllIlIIllIIll(class_1646.class, "Trap");
        class_1774.lllIIIllIIIIlllIlIIllIIll(class_1798.class, "Dropper");
        class_1774.lllIIIllIIIIlllIlIIllIIll(class_2219.class, "Sign");
        class_1774.lllIIIllIIIIlllIlIIllIIll(class_0933.class, "MobSpawner");
        class_1774.lllIIIllIIIIlllIlIIllIIll(class_1394.class, "Music");
        class_1774.lllIIIllIIIIlllIlIIllIIll(class_0919.class, "Piston");
        class_1774.lllIIIllIIIIlllIlIIllIIll(class_0647.class, "Cauldron");
        class_1774.lllIIIllIIIIlllIlIIllIIll(class_2014.class, "EnchantTable");
        class_1774.lllIIIllIIIIlllIlIIllIIll(class_1525.class, "Airportal");
        class_1774.lllIIIllIIIIlllIlIIllIIll(class_1345.class, "Control");
        class_1774.lllIIIllIIIIlllIlIIllIIll(class_0396.class, "Beacon");
        class_1774.lllIIIllIIIIlllIlIIllIIll(class_0090.class, "Skull");
        class_1774.lllIIIllIIIIlllIlIIllIIll(class_0045.class, "DLDetector");
        class_1774.lllIIIllIIIIlllIlIIllIIll(class_0879.class, "Hopper");
        class_1774.lllIIIllIIIIlllIlIIllIIll(class_0134.class, "Comparator");
        class_1774.lllIIIllIIIIlllIlIIllIIll(class_0461.class, "FlowerPot");
    }
}

