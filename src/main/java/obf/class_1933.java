package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class class_1933
implements class_1848 {
    private class_1334 lllIIIllIIIIlllIlIIllIIll;
    private Random lllIlIIlIIIlIlIIIllIlllIl;
    private final Block[] IlIllllllIIlIIllllIIlIIIl = new Block[256];
    private final byte[] lIlllIlllIIIIlIIlllIllIII = new byte[256];
    private final class_0326 IlIIIIIllllllIIlllIllllll;
    private final List lIllllIIlIIIlIllllllIIIll = new ArrayList();
    private final boolean IIIllIIlIIIIIIlIlIIllIIlI;
    private final boolean IllIIlllllllIIlIIlIIIIlIl;
    private class_1206 IIIllIllIIlIlIlIlIllllIIl;
    private class_1206 IllIIIllIIIIlIlIlIllIIlll;

    public class_1933(class_1334 class_13342, long l, boolean bl, String string) {
        this.lllIIIllIIIIlllIlIIllIIll = class_13342;
        this.lllIlIIlIIIlIlIIIllIlllIl = new Random(l);
        this.IlIIIIIllllllIIlllIllllll = class_0326.lllIIIllIIIIlllIlIIllIIll(string);
        if (bl) {
            Map map = this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl();
            if (map.containsKey("village")) {
                Object object = (Map)map.get("village");
                if (!object.containsKey("size")) {
                    object.put("size", "1");
                }
                this.lIllllIIlIIIlIllllllIIIll.add(new class_1430((Map)object));
            }
            if (map.containsKey("biome_1")) {
                this.lIllllIIlIIIlIllllllIIIll.add(new class_0638((Map)map.get("biome_1")));
            }
            if (map.containsKey("mineshaft")) {
                this.lIllllIIlIIIlIllllllIIIll.add(new class_2096((Map)map.get("mineshaft")));
            }
            if (map.containsKey("stronghold")) {
                this.lIllllIIlIIIlIllllllIIIll.add(new class_0763((Map)map.get("stronghold")));
            }
        }
        this.IIIllIIlIIIIIIlIlIIllIIlI = this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl().containsKey("decoration");
        if (this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl().containsKey("lake")) {
            this.IIIllIllIIlIlIlIlIllllIIl = new class_1206(Blocks.IllIIIllIIIIlIlIlIllIIlll);
        }
        if (this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl().containsKey("lava_lake")) {
            this.IllIIIllIIIIlIlIlIllIIlll = new class_1206(Blocks.llIIlllIllIllllIIIlIIIIII);
        }
        this.IllIIlllllllIIlIIlIIIIlIl = this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl().containsKey("dungeon");
        for (Object object : this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl()) {
            for (int i = ((class_1324)object).lIlllIlllIIIIlIIlllIllIII(); i < ((class_1324)object).lIlllIlllIIIIlIIlllIllIII() + ((class_1324)object).lllIIIllIIIIlllIlIIllIIll(); ++i) {
                this.IlIllllllIIlIIllllIIlIIIl[i] = ((class_1324)object).lllIlIIlIIIlIlIIIllIlllIl();
                this.lIlllIlllIIIIlIIlllIllIII[i] = (byte)((class_1324)object).IlIllllllIIlIIllllIIlIIIl();
            }
        }
    }

    @Override
    public class_0723 IlIllllllIIlIIllllIIlIIIl(int n, int n2) {
        return this.lIlllIlllIIIIlIIlllIllIII(n, n2);
    }

    @Override
    public class_0723 lIlllIlllIIIIlIIlllIllIII(int n, int n2) {
        int n3;
        Object object;
        class_0723 class_07232 = new class_0723(this.lllIIIllIIIIlllIlIIllIIll, n, n2);
        for (int i = 0; i < this.IlIllllllIIlIIllllIIlIIIl.length; ++i) {
            object = this.IlIllllllIIlIIllllIIlIIIl[i];
            if (object == null) continue;
            n3 = i >> 4;
            Object object2 = class_07232.lllIlIIlIIIlIlIIIllIlllIl()[n3];
            if (object2 == null) {
                class_07232.lllIlIIlIIIlIlIIIllIlllIl()[n3] = object2 = new class_1532(i, !this.lllIIIllIIIIlllIlIIllIIll.IlIlIIlllIIlIllIIIlllllIl.IIIllIIlIIIIIIlIlIIllIIlI);
            }
            for (int j = 0; j < 16; ++j) {
                for (int k = 0; k < 16; ++k) {
                    ((class_1532)object2).lllIIIllIIIIlllIlIIllIIll(j, i & 0xF, k, (Block)object);
                    ((class_1532)object2).lllIIIllIIIIlllIlIIllIIll(j, i & 0xF, k, this.lIlllIlllIIIIlIIlllIllIII[i]);
                }
            }
        }
        class_07232.lIlllIlllIIIIlIIlllIllIII();
        class_0672[] arrclass_0672 = this.lllIIIllIIIIlllIlIIllIIll.IIIllIllIIlIlIlIlIllllIIl().lllIlIIlIIIlIlIIIllIlllIl(null, n * 16, n2 * 16, 16, 16);
        object = class_07232.lIIIIlIlIIlllllIIllIIlIII();
        for (n3 = 0; n3 < ((Object)object).length; ++n3) {
            object[n3] = (byte)arrclass_0672[n3].lIlIllIIllIIIIlllIlIlllIl;
        }
        for (class_1000 class_10002 : this.lIllllIIlIIIlIllllllIIIll) {
            class_10002.lllIIIllIIIIlllIlIIllIIll(this, this.lllIIIllIIIIlllIlIIllIIll, n, n2, null);
        }
        class_07232.lIlllIlllIIIIlIIlllIllIII();
        return class_07232;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        return true;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1848 class_18482, int n, int n2) {
        int n3;
        int n4;
        int n5 = n * 16;
        int n6 = n2 * 16;
        class_0672 class_06722 = this.lllIIIllIIIIlllIlIIllIIll.a_(n5 + 16, n6 + 16);
        boolean bl = false;
        this.lllIlIIlIIIlIlIIIllIlllIl.setSeed(this.lllIIIllIIIIlllIlIIllIIll.lIlIlIIlIIIIlIIIIIlllIIII());
        long l = this.lllIlIIlIIIlIlIIIllIlllIl.nextLong() / 2L * 2L + 1L;
        long l2 = this.lllIlIIlIIIlIlIIIllIlllIl.nextLong() / 2L * 2L + 1L;
        this.lllIlIIlIIIlIlIIIllIlllIl.setSeed((long)n * l + (long)n2 * l2 ^ this.lllIIIllIIIIlllIlIIllIIll.lIlIlIIlIIIIlIIIIIlllIIII());
        for (class_1340 class_13402 : this.lIllllIIlIIIlIllllllIIIll) {
            n4 = class_13402.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl, n, n2);
            if (!(class_13402 instanceof class_1430)) continue;
            bl |= n4;
        }
        if (this.IIIllIllIIlIlIlIlIllllIIl != null && !bl && this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(4) == 0) {
            int n7 = n5 + this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(16) + 8;
            n4 = this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(256);
            n3 = n6 + this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(16) + 8;
            this.IIIllIllIIlIlIlIlIllllIIl.a_(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl, n7, n4, n3);
        }
        if (this.IllIIIllIIIIlIlIlIllIIlll != null && !bl && this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(8) == 0) {
            int n8 = n5 + this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(16) + 8;
            n4 = this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(248) + 8);
            n3 = n6 + this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(16) + 8;
            if (n4 < 63 || this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(10) == 0) {
                this.IllIIIllIIIIlIlIlIllIIlll.a_(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl, n8, n4, n3);
            }
        }
        if (this.IllIIlllllllIIlIIlIIIIlIl) {
            for (int i = 0; i < 8; ++i) {
                n4 = n5 + this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(16) + 8;
                n3 = this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(256);
                int n9 = n6 + this.lllIlIIlIIIlIlIIIllIlllIl.nextInt(16) + 8;
                new class_1672().a_(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl, n4, n3, n9);
            }
        }
        if (this.IIIllIIlIIIIIIlIlIIllIIlI) {
            class_06722.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl, n5, n6);
        }
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(boolean bl, class_1832 class_18322) {
        return true;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll() {
    }

    @Override
    public boolean lllIlIIlIIIlIlIIIllIlllIl() {
        return false;
    }

    @Override
    public boolean IlIllllllIIlIIllllIIlIIIl() {
        return true;
    }

    @Override
    public String lIlllIlllIIIIlIIlllIllIII() {
        return "FlatLevelSource";
    }

    @Override
    public List lllIIIllIIIIlllIlIIllIIll(class_1012 class_10122, int n, int n2, int n3) {
        class_0672 class_06722 = this.lllIIIllIIIIlllIlIIllIIll.a_(n, n3);
        return class_06722.lllIIIllIIIIlllIlIIllIIll(class_10122);
    }

    @Override
    public class_2137 lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, String string, int n, int n2, int n3) {
        if ("Stronghold".equals(string)) {
            for (class_1340 class_13402 : this.lIllllIIlIIIlIllllllIIIll) {
                if (!(class_13402 instanceof class_0763)) continue;
                return class_13402.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3);
            }
        }
        return null;
    }

    @Override
    public int IlIIIIIllllllIIlllIllllll() {
        return 0;
    }

    @Override
    public void IlIIIIIllllllIIlllIllllll(int n, int n2) {
        for (class_1340 class_13402 : this.lIllllIIlIIIlIllllllIIIll) {
            class_13402.lllIIIllIIIIlllIlIIllIIll(this, this.lllIIIllIIIIlllIlIIllIIll, n, n2, null);
        }
    }
}

