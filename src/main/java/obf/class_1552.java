package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import net.minecraft.block.Block;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_1552
implements class_1831,
class_0489 {
    private static final Logger lllIIIllIIIIlllIlIIllIIll = LogManager.getLogger();
    private List lllIlIIlIIIlIlIIIllIlllIl = new ArrayList();
    private Set IlIllllllIIlIIllllIIlIIIl = new HashSet();
    private Object lIlllIlllIIIIlIIlllIllIII = new Object();
    private final File IlIIIIIllllllIIlllIllllll;

    public class_1552(File file) {
        this.IlIIIIIllllllIIlllIllllll = file;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public class_0723 lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2) {
        class_0775 class_07752 = null;
        class_1108 class_11082 = new class_1108(n, n2);
        Object object = this.lIlllIlllIIIIlIIlllIllIII;
        Object object2 = this.lIlllIlllIIIIlIIlllIllIII;
        synchronized (object2) {
            if (this.IlIllllllIIlIIllllIIlIIIl.contains(class_11082)) {
                for (int i = 0; i < this.lllIlIIlIIIlIlIIIllIlllIl.size(); ++i) {
                    if (!((class_0105)this.lllIlIIlIIIlIlIIIllIlllIl.get((int)i)).lllIIIllIIIIlllIlIIllIIll.equals(class_11082)) continue;
                    class_07752 = ((class_0105)this.lllIlIIlIIIlIlIIIllIlllIl.get((int)i)).lllIlIIlIIIlIlIIIllIlllIl;
                    break;
                }
            }
        }
        if (class_07752 == null) {
            object2 = class_1266.lllIlIIlIIIlIlIIIllIlllIl(this.IlIIIIIllllllIIlllIllllll, n, n2);
            if (object2 == null) {
                return null;
            }
            class_07752 = class_0893.lllIIIllIIIIlllIlIIllIIll((DataInputStream)object2);
        }
        return this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, class_07752);
    }

    protected class_0723 lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, class_0775 class_07752) {
        if (!class_07752.lllIlIIlIIIlIlIIIllIlllIl("Level", 10)) {
            lllIIIllIIIIlllIlIIllIIll.error("Chunk file at " + n + "," + n2 + " is missing level data, skipping");
            return null;
        }
        if (!class_07752.llIIllIllIlIIlIIllIllllll("Level").lllIlIIlIIIlIlIIIllIlllIl("Sections", 9)) {
            lllIIIllIIIIlllIlIIllIIll.error("Chunk file at " + n + "," + n2 + " is missing block data, skipping");
            return null;
        }
        class_0723 class_07232 = this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_07752.llIIllIllIlIIlIIllIllllll("Level"));
        if (!class_07232.lllIIIllIIIIlllIlIIllIIll(n, n2)) {
            lllIIIllIIIIlllIlIIllIIll.error("Chunk file at " + n + "," + n2 + " is in the wrong location; relocating. (Expected " + n + ", " + n2 + ", got " + class_07232.IIIllIIlIIIIIIlIlIIllIIlI + ", " + class_07232.IllIIlllllllIIlIIlIIIIlIl + ")");
            class_07752.lllIIIllIIIIlllIlIIllIIll("xPos", n);
            class_07752.lllIIIllIIIIlllIlIIllIIll("zPos", n2);
            class_07232 = this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_07752.llIIllIllIlIIlIIllIllllll("Level"));
        }
        return class_07232;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, class_0723 class_07232) {
        class_13342.lIIlIIIIIlIlllIlIIlIlIlll();
        try {
            class_0775 class_07752 = new class_0775();
            class_0775 class_07753 = new class_0775();
            class_07752.lllIIIllIIIIlllIlIIllIIll("Level", class_07753);
            this.lllIIIllIIIIlllIlIIllIIll(class_07232, class_13342, class_07753);
            this.lllIIIllIIIIlllIlIIllIIll(class_07232.IllIIIllIIIIlIlIlIllIIlll(), class_07752);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void lllIIIllIIIIlllIlIIllIIll(class_1108 class_11082, class_0775 class_07752) {
        Object object = this.lIlllIlllIIIIlIIlllIllIII;
        Object object2 = this.lIlllIlllIIIIlIIlllIllIII;
        synchronized (object2) {
            if (this.IlIllllllIIlIIllllIIlIIIl.contains(class_11082)) {
                for (int i = 0; i < this.lllIlIIlIIIlIlIIIllIlllIl.size(); ++i) {
                    if (!((class_0105)this.lllIlIIlIIIlIlIIIllIlllIl.get((int)i)).lllIIIllIIIIlllIlIIllIIll.equals(class_11082)) continue;
                    this.lllIlIIlIIIlIlIIIllIlllIl.set(i, new class_0105(class_11082, class_07752));
                    return;
                }
            }
            this.lllIlIIlIIIlIlIIIllIlllIl.add(new class_0105(class_11082, class_07752));
            this.IlIllllllIIlIIllllIIlIIIl.add(class_11082);
            class_0829.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(this);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll() {
        class_0105 class_01052 = null;
        Object object = this.lIlllIlllIIIIlIIlllIllIII;
        Object object2 = this.lIlllIlllIIIIlIIlllIllIII;
        synchronized (object2) {
            if (this.lllIlIIlIIIlIlIIIllIlllIl.isEmpty()) {
                return false;
            }
            class_01052 = (class_0105)this.lllIlIIlIIIlIlIIIllIlllIl.remove(0);
            this.IlIllllllIIlIIllllIIlIIIl.remove(class_01052.lllIIIllIIIIlllIlIIllIIll);
        }
        if (class_01052 != null) {
            try {
                this.lllIIIllIIIIlllIlIIllIIll(class_01052);
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        return true;
    }

    private void lllIIIllIIIIlllIlIIllIIll(class_0105 class_01052) {
        DataOutputStream dataOutputStream = class_1266.IlIllllllIIlIIllllIIlIIIl(this.IlIIIIIllllllIIlllIllllll, class_01052.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll, class_01052.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl);
        class_0893.lllIIIllIIIIlllIlIIllIIll(class_01052.lllIlIIlIIIlIlIIIllIlllIl, (DataOutput)dataOutputStream);
        dataOutputStream.close();
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_1334 class_13342, class_0723 class_07232) {
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl() {
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
        while (this.lllIIIllIIIIlllIlIIllIIll()) {
        }
    }

    private void lllIIIllIIIIlllIlIIllIIll(class_0723 class_07232, class_1334 class_13342, class_0775 class_07752) {
        Object object3;
        Object object22;
        class_0775 class_07753;
        class_07752.lllIIIllIIIIlllIlIIllIIll("V", (byte)1);
        class_07752.lllIIIllIIIIlllIlIIllIIll("xPos", class_07232.IIIllIIlIIIIIIlIlIIllIIlI);
        class_07752.lllIIIllIIIIlllIlIIllIIll("zPos", class_07232.IllIIlllllllIIlIIlIIIIlIl);
        class_07752.lllIIIllIIIIlllIlIIllIIll("LastUpdate", class_13342.IlIIIlIIIIllIIIllIIIIIIll());
        class_07752.lllIIIllIIIIlllIlIIllIIll("HeightMap", class_07232.lIllllIIlIIIlIllllllIIIll);
        class_07752.lllIIIllIIIIlllIlIIllIIll("TerrainPopulated", class_07232.lIIIIlIlIIlllllIIllIIlIII);
        class_07752.lllIIIllIIIIlllIlIIllIIll("LightPopulated", class_07232.llIIlllIllIllllIIIlIIIIII);
        class_07752.lllIIIllIIIIlllIlIIllIIll("InhabitedTime", class_07232.lIIlIIIIIlIlllIlIIlIlIlll);
        class_1532[] arrclass_1532 = class_07232.lllIlIIlIIIlIlIIIllIlllIl();
        class_2145 class_21452 = new class_2145();
        boolean bl = !class_13342.IlIlIIlllIIlIllIIIlllllIl.IIIllIIlIIIIIIlIlIIllIIlI;
        class_1532[] arrclass_15322 = arrclass_1532;
        int n = arrclass_1532.length;
        for (int i = 0; i < n; ++i) {
            class_1532 class_15322 = arrclass_15322[i];
            if (class_15322 == null) continue;
            class_07753 = new class_0775();
            class_07753.lllIIIllIIIIlllIlIIllIIll("Y", (byte)(class_15322.IlIllllllIIlIIllllIIlIIIl() >> 4 & 0xFF));
            class_07753.lllIIIllIIIIlllIlIIllIIll("net.minecraft.init.Blocks", class_15322.IlIIIIIllllllIIlllIllllll());
            if (class_15322.IIIllIIlIIIIIIlIlIIllIIlI() != null) {
                class_07753.lllIIIllIIIIlllIlIIllIIll("Add", class_15322.IIIllIIlIIIIIIlIlIIllIIlI().lllIIIllIIIIlllIlIIllIIll);
            }
            class_07753.lllIIIllIIIIlllIlIIllIIll("Data", class_15322.IllIIlllllllIIlIIlIIIIlIl().lllIIIllIIIIlllIlIIllIIll);
            class_07753.lllIIIllIIIIlllIlIIllIIll("BlockLight", class_15322.IIIllIllIIlIlIlIlIllllIIl().lllIIIllIIIIlllIlIIllIIll);
            if (bl) {
                class_07753.lllIIIllIIIIlllIlIIllIIll("SkyLight", class_15322.IllIIIllIIIIlIlIlIllIIlll().lllIIIllIIIIlllIlIIllIIll);
            } else {
                class_07753.lllIIIllIIIIlllIlIIllIIll("SkyLight", new byte[class_15322.IIIllIllIIlIlIlIlIllllIIl().lllIIIllIIIIlllIlIIllIIll.length]);
            }
            class_21452.lllIIIllIIIIlllIlIIllIIll(class_07753);
        }
        class_07752.lllIIIllIIIIlllIlIIllIIll("Sections", class_21452);
        class_07752.lllIIIllIIIIlllIlIIllIIll("Biomes", class_07232.lIIIIlIlIIlllllIIllIIlIII());
        class_07232.IlIlllIIIIIIlIIllIIllIlll = false;
        class_2145 class_21453 = new class_2145();
        for (n = 0; n < class_07232.IllIIIllIIIIlIlIlIllIIlll.length; ++n) {
            for (Object object22 : class_07232.IllIIIllIIIIlIlIlIllIIlll[n]) {
                if (!((class_1521)object22).lIlllIlllIIIIlIIlllIllIII(class_07753 = new class_0775())) continue;
                class_07232.IlIlllIIIIIIlIIllIIllIlll = true;
                class_21453.lllIIIllIIIIlllIlIIllIIll(class_07753);
            }
        }
        class_07752.lllIIIllIIIIlllIlIIllIIll("Entities", class_21453);
        object22 = new class_2145();
        for (Object object3 : class_07232.IIIllIllIIlIlIlIlIllllIIl.values()) {
            class_07753 = new class_0775();
            ((class_1774)object3).lllIlIIlIIIlIlIIIllIlllIl(class_07753);
            ((class_2145)object22).lllIIIllIIIIlllIlIIllIIll(class_07753);
        }
        class_07752.lllIIIllIIIIlllIlIIllIIll("TileEntities", (class_2037)object22);
        object3 = class_13342.lllIIIllIIIIlllIlIIllIIll(class_07232, false);
        if (object3 != null) {
            long l = class_13342.IlIIIlIIIIllIIIllIIIIIIll();
            class_2145 class_21454 = new class_2145();
            Iterator iterator = object3.iterator();
            while (iterator.hasNext()) {
                class_1505 class_15052 = (class_1505)iterator.next();
                class_0775 class_07754 = new class_0775();
                class_07754.lllIIIllIIIIlllIlIIllIIll("i", Block.lllIIIllIIIIlllIlIIllIIll(class_15052.lllIIIllIIIIlllIlIIllIIll()));
                class_07754.lllIIIllIIIIlllIlIIllIIll("x", class_15052.lllIIIllIIIIlllIlIIllIIll);
                class_07754.lllIIIllIIIIlllIlIIllIIll("y", class_15052.lllIlIIlIIIlIlIIIllIlllIl);
                class_07754.lllIIIllIIIIlllIlIIllIIll("z", class_15052.IlIllllllIIlIIllllIIlIIIl);
                class_07754.lllIIIllIIIIlllIlIIllIIll("t", (int)(class_15052.lIlllIlllIIIIlIIlllIllIII - l));
                class_07754.lllIIIllIIIIlllIlIIllIIll("p", class_15052.IlIIIIIllllllIIlllIllllll);
                class_21454.lllIIIllIIIIlllIlIIllIIll(class_07754);
            }
            class_07752.lllIIIllIIIIlllIlIIllIIll("TileTicks", class_21454);
        }
    }

    private class_0723 lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, class_0775 class_07752) {
        class_2145 class_21452;
        class_2145 class_21453;
        Object object;
        class_2145 class_21454;
        Object object2;
        int n = class_07752.lIllllIIlIIIlIllllllIIIll("xPos");
        int n2 = class_07752.lIllllIIlIIIlIllllllIIIll("zPos");
        class_0723 class_07232 = new class_0723(class_13342, n, n2);
        class_07232.lIllllIIlIIIlIllllllIIIll = class_07752.llIIlllIllIllllIIIlIIIIII("HeightMap");
        class_07232.lIIIIlIlIIlllllIIllIIlIII = class_07752.lllIIlIIIllllllIIIIlIlIlI("TerrainPopulated");
        class_07232.llIIlllIllIllllIIIlIIIIII = class_07752.lllIIlIIIllllllIIIIlIlIlI("LightPopulated");
        class_07232.lIIlIIIIIlIlllIlIIlIlIlll = class_07752.IIIllIIlIIIIIIlIlIIllIIlI("InhabitedTime");
        class_2145 class_21455 = class_07752.IlIllllllIIlIIllllIIlIIIl("Sections", 10);
        int n3 = 16;
        class_1532[] arrclass_1532 = new class_1532[n3];
        boolean bl = !class_13342.IlIlIIlllIIlIllIIIlllllIl.IIIllIIlIIIIIIlIlIIllIIlI;
        for (int i = 0; i < class_21455.lIlllIlllIIIIlIIlllIllIII(); ++i) {
            class_0775 class_07753 = class_21455.lllIlIIlIIIlIlIIIllIlllIl(i);
            byte by = class_07753.lIlllIlllIIIIlIIlllIllIII("Y");
            object2 = new class_1532(by << 4, bl);
            ((class_1532)object2).lllIIIllIIIIlllIlIIllIIll(class_07753.lIIIIlIlIIlllllIIllIIlIII("net.minecraft.init.Blocks"));
            if (class_07753.lllIlIIlIIIlIlIIIllIlllIl("Add", 7)) {
                ((class_1532)object2).lllIIIllIIIIlllIlIIllIIll(new class_0783(class_07753.lIIIIlIlIIlllllIIllIIlIII("Add"), 4));
            }
            ((class_1532)object2).lllIlIIlIIIlIlIIIllIlllIl(new class_0783(class_07753.lIIIIlIlIIlllllIIllIIlIII("Data"), 4));
            ((class_1532)object2).IlIllllllIIlIIllllIIlIIIl(new class_0783(class_07753.lIIIIlIlIIlllllIIllIIlIII("BlockLight"), 4));
            if (bl) {
                ((class_1532)object2).lIlllIlllIIIIlIIlllIllIII(new class_0783(class_07753.lIIIIlIlIIlllllIIllIIlIII("SkyLight"), 4));
            }
            ((class_1532)object2).lIlllIlllIIIIlIIlllIllIII();
            arrclass_1532[by] = object2;
        }
        class_07232.lllIIIllIIIIlllIlIIllIIll(arrclass_1532);
        if (class_07752.lllIlIIlIIIlIlIIIllIlllIl("Biomes", 7)) {
            class_07232.lllIIIllIIIIlllIlIIllIIll(class_07752.lIIIIlIlIIlllllIIllIIlIII("Biomes"));
        }
        if ((class_21454 = class_07752.IlIllllllIIlIIllllIIlIIIl("Entities", 10)) != null) {
            for (int i = 0; i < class_21454.lIlllIlllIIIIlIIlllIllIII(); ++i) {
                class_0775 class_07754 = class_21454.lllIlIIlIIIlIlIIIllIlllIl(i);
                object2 = class_0054.lllIIIllIIIIlllIlIIllIIll(class_07754, class_13342);
                class_07232.IlIlllIIIIIIlIIllIIllIlll = true;
                if (object2 == null) continue;
                class_07232.lllIIIllIIIIlllIlIIllIIll((class_1521)object2);
                object = object2;
                class_0775 class_07755 = class_07754;
                while (class_07755.lllIlIIlIIIlIlIIIllIlllIl("Riding", 10)) {
                    class_1521 class_15212 = class_0054.lllIIIllIIIIlllIlIIllIIll(class_07755.llIIllIllIlIIlIIllIllllll("Riding"), class_13342);
                    if (class_15212 != null) {
                        class_07232.lllIIIllIIIIlllIlIIllIIll(class_15212);
                        ((class_1521)object).lllIIIllIIIIlllIlIIllIIll(class_15212);
                    }
                    object = class_15212;
                    class_07755 = class_07755.llIIllIllIlIIlIIllIllllll("Riding");
                }
            }
        }
        if ((class_21453 = class_07752.IlIllllllIIlIIllllIIlIIIl("TileEntities", 10)) != null) {
            for (int i = 0; i < class_21453.lIlllIlllIIIIlIIlllIllIII(); ++i) {
                object2 = class_21453.lllIlIIlIIIlIlIIIllIlllIl(i);
                object = class_1774.IlIllllllIIlIIllllIIlIIIl((class_0775)object2);
                if (object == null) continue;
                class_07232.lllIIIllIIIIlllIlIIllIIll((class_1774)object);
            }
        }
        if (class_07752.lllIlIIlIIIlIlIIIllIlllIl("TileTicks", 9) && (class_21452 = class_07752.IlIllllllIIlIIllllIIlIIIl("TileTicks", 10)) != null) {
            for (int i = 0; i < class_21452.lIlllIlllIIIIlIIlllIllIII(); ++i) {
                object = class_21452.lllIlIIlIIIlIlIIIllIlllIl(i);
                class_13342.IlIllllllIIlIIllllIIlIIIl(((class_0775)object).lIllllIIlIIIlIllllllIIIll("x"), ((class_0775)object).lIllllIIlIIIlIllllllIIIll("y"), ((class_0775)object).lIllllIIlIIIlIllllllIIIll("z"), Block.lllIIIllIIIIlllIlIIllIIll(((class_0775)object).lIllllIIlIIIlIllllllIIIll("i")), ((class_0775)object).lIllllIIlIIIlIllllllIIIll("t"), ((class_0775)object).lIllllIIlIIIlIllllllIIIll("p"));
            }
        }
        return class_07232;
    }
}

