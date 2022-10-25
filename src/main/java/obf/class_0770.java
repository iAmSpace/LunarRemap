package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0770 {
    private long lllIIIllIIIIlllIlIIllIIll;
    private class_1074 lllIlIIlIIIlIlIIIllIlllIl = class_1074.lllIlIIlIIIlIlIIIllIlllIl;
    private String IlIllllllIIlIIllllIIlIIIl = "";
    private int lIlllIlllIIIIlIIlllIllIII;
    private int IlIIIIIllllllIIlllIllllll;
    private int lIllllIIlIIIlIllllllIIIll;
    private long IIIllIIlIIIIIIlIlIIllIIlI;
    private long IllIIlllllllIIlIIlIIIIlIl;
    private long IIIllIllIIlIlIlIlIllllIIl;
    private long IllIIIllIIIIlIlIlIllIIlll;
    private class_0775 lIIIIlIlIIlllllIIllIIlIII;
    private int llIIlllIllIllllIIIlIIIIII;
    private String llIIllIllIlIIlIIllIllllll;
    private int lllIIlIIIllllllIIIIlIlIlI;
    private boolean IlIlllIIIIIIlIIllIIllIlll;
    private int IlIlIIlIlIllIIlIlIIllIIIl;
    private boolean lllllIlllIIllIlIIlIIIllII;
    private int IlIlIIlllIIlIllIIIlllllIl;
    private class_2243 lIIlIIIIIlIlllIlIIlIlIlll;
    private boolean lIlIlIIlIIIIlIIIIIlllIIII;
    private boolean IlIIIlIIIIllIIIllIIIIIIll;
    private boolean IIlllIlIlllIllIIIlllIIlIl;
    private boolean lIlIllIIlIIlIIlIIlIIlIIll;
    private class_1263 llIIlIllIllllIlIIIIlIIlll = new class_1263();

    protected class_0770() {
    }

    public class_0770(class_0775 class_07752) {
        this.lllIIIllIIIIlllIlIIllIIll = class_07752.IIIllIIlIIIIIIlIlIIllIIlI("RandomSeed");
        if (class_07752.lllIlIIlIIIlIlIIIllIlllIl("generatorName", 8)) {
            String string = class_07752.IllIIIllIIIIlIlIlIllIIlll("generatorName");
            this.lllIlIIlIIIlIlIIIllIlllIl = class_1074.lllIIIllIIIIlllIlIIllIIll(string);
            if (this.lllIlIIlIIIlIlIIIllIlllIl == null) {
                this.lllIlIIlIIIlIlIIIllIlllIl = class_1074.lllIlIIlIIIlIlIIIllIlllIl;
            } else if (this.lllIlIIlIIIlIlIIIllIlllIl.lIllllIIlIIIlIllllllIIIll()) {
                int n = 0;
                if (class_07752.lllIlIIlIIIlIlIIIllIlllIl("generatorVersion", 99)) {
                    n = class_07752.lIllllIIlIIIlIllllllIIIll("generatorVersion");
                }
                this.lllIlIIlIIIlIlIIIllIlllIl = this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(n);
            }
            if (class_07752.lllIlIIlIIIlIlIIIllIlllIl("generatorOptions", 8)) {
                this.IlIllllllIIlIIllllIIlIIIl = class_07752.IllIIIllIIIIlIlIlIllIIlll("generatorOptions");
            }
        }
        this.lIIlIIIIIlIlllIlIIlIlIlll = class_2243.lllIIIllIIIIlllIlIIllIIll(class_07752.lIllllIIlIIIlIllllllIIIll("GameType"));
        this.lIlIlIIlIIIIlIIIIIlllIIII = class_07752.lllIlIIlIIIlIlIIIllIlllIl("MapFeatures", 99) ? class_07752.lllIIlIIIllllllIIIIlIlIlI("MapFeatures") : true;
        this.lIlllIlllIIIIlIIlllIllIII = class_07752.lIllllIIlIIIlIllllllIIIll("SpawnX");
        this.IlIIIIIllllllIIlllIllllll = class_07752.lIllllIIlIIIlIllllllIIIll("SpawnY");
        this.lIllllIIlIIIlIllllllIIIll = class_07752.lIllllIIlIIIlIllllllIIIll("SpawnZ");
        this.IIIllIIlIIIIIIlIlIIllIIlI = class_07752.IIIllIIlIIIIIIlIlIIllIIlI("Time");
        this.IllIIlllllllIIlIIlIIIIlIl = class_07752.lllIlIIlIIIlIlIIIllIlllIl("DayTime", 99) ? class_07752.IIIllIIlIIIIIIlIlIIllIIlI("DayTime") : this.IIIllIIlIIIIIIlIlIIllIIlI;
        this.IIIllIllIIlIlIlIlIllllIIl = class_07752.IIIllIIlIIIIIIlIlIIllIIlI("LastPlayed");
        this.IllIIIllIIIIlIlIlIllIIlll = class_07752.IIIllIIlIIIIIIlIlIIllIIlI("SizeOnDisk");
        this.llIIllIllIlIIlIIllIllllll = class_07752.IllIIIllIIIIlIlIlIllIIlll("LevelName");
        this.lllIIlIIIllllllIIIIlIlIlI = class_07752.lIllllIIlIIIlIllllllIIIll("version");
        this.IlIlIIlIlIllIIlIlIIllIIIl = class_07752.lIllllIIlIIIlIllllllIIIll("rainTime");
        this.IlIlllIIIIIIlIIllIIllIlll = class_07752.lllIIlIIIllllllIIIIlIlIlI("raining");
        this.IlIlIIlllIIlIllIIIlllllIl = class_07752.lIllllIIlIIIlIllllllIIIll("thunderTime");
        this.lllllIlllIIllIlIIlIIIllII = class_07752.lllIIlIIIllllllIIIIlIlIlI("thundering");
        this.IlIIIlIIIIllIIIllIIIIIIll = class_07752.lllIIlIIIllllllIIIIlIlIlI("hardcore");
        this.lIlIllIIlIIlIIlIIlIIlIIll = class_07752.lllIlIIlIIIlIlIIIllIlllIl("initialized", 99) ? class_07752.lllIIlIIIllllllIIIIlIlIlI("initialized") : true;
        if (class_07752.lllIlIIlIIIlIlIIIllIlllIl("allowCommands", 99)) {
            this.IIlllIlIlllIllIIIlllIIlIl = class_07752.lllIIlIIIllllllIIIIlIlIlI("allowCommands");
        } else {
            boolean bl = this.IIlllIlIlllIllIIIlllIIlIl = this.lIIlIIIIIlIlllIlIIlIlIlll == class_2243.IlIllllllIIlIIllllIIlIIIl;
        }
        if (class_07752.lllIlIIlIIIlIlIIIllIlllIl("Player", 10)) {
            this.lIIIIlIlIIlllllIIllIIlIII = class_07752.llIIllIllIlIIlIIllIllllll("Player");
            this.llIIlllIllIllllIIIlIIIIII = this.lIIIIlIlIIlllllIIllIIlIII.lIllllIIlIIIlIllllllIIIll("Dimension");
        }
        if (class_07752.lllIlIIlIIIlIlIIIllIlllIl("GameRules", 10)) {
            this.llIIlIllIllllIlIIIIlIIlll.lllIIIllIIIIlllIlIIllIIll(class_07752.llIIllIllIlIIlIIllIllllll("GameRules"));
        }
    }

    public class_0770(class_1078 class_10782, String string) {
        this.lllIIIllIIIIlllIlIIllIIll = class_10782.lIlllIlllIIIIlIIlllIllIII();
        this.lIIlIIIIIlIlllIlIIlIlIlll = class_10782.IlIIIIIllllllIIlllIllllll();
        this.lIlIlIIlIIIIlIIIIIlllIIII = class_10782.IIIllIIlIIIIIIlIlIIllIIlI();
        this.llIIllIllIlIIlIIllIllllll = string;
        this.IlIIIlIIIIllIIIllIIIIIIll = class_10782.lIllllIIlIIIlIllllllIIIll();
        this.lllIlIIlIIIlIlIIIllIlllIl = class_10782.IllIIlllllllIIlIIlIIIIlIl();
        this.IlIllllllIIlIIllllIIlIIIl = class_10782.IllIIIllIIIIlIlIlIllIIlll();
        this.IIlllIlIlllIllIIIlllIIlIl = class_10782.IIIllIllIIlIlIlIlIllllIIl();
        this.lIlIllIIlIIlIIlIIlIIlIIll = false;
    }

    public class_0770(class_0770 class_07702) {
        this.lllIIIllIIIIlllIlIIllIIll = class_07702.lllIIIllIIIIlllIlIIllIIll;
        this.lllIlIIlIIIlIlIIIllIlllIl = class_07702.lllIlIIlIIIlIlIIIllIlllIl;
        this.IlIllllllIIlIIllllIIlIIIl = class_07702.IlIllllllIIlIIllllIIlIIIl;
        this.lIIlIIIIIlIlllIlIIlIlIlll = class_07702.lIIlIIIIIlIlllIlIIlIlIlll;
        this.lIlIlIIlIIIIlIIIIIlllIIII = class_07702.lIlIlIIlIIIIlIIIIIlllIIII;
        this.lIlllIlllIIIIlIIlllIllIII = class_07702.lIlllIlllIIIIlIIlllIllIII;
        this.IlIIIIIllllllIIlllIllllll = class_07702.IlIIIIIllllllIIlllIllllll;
        this.lIllllIIlIIIlIllllllIIIll = class_07702.lIllllIIlIIIlIllllllIIIll;
        this.IIIllIIlIIIIIIlIlIIllIIlI = class_07702.IIIllIIlIIIIIIlIlIIllIIlI;
        this.IllIIlllllllIIlIIlIIIIlIl = class_07702.IllIIlllllllIIlIIlIIIIlIl;
        this.IIIllIllIIlIlIlIlIllllIIl = class_07702.IIIllIllIIlIlIlIlIllllIIl;
        this.IllIIIllIIIIlIlIlIllIIlll = class_07702.IllIIIllIIIIlIlIlIllIIlll;
        this.lIIIIlIlIIlllllIIllIIlIII = class_07702.lIIIIlIlIIlllllIIllIIlIII;
        this.llIIlllIllIllllIIIlIIIIII = class_07702.llIIlllIllIllllIIIlIIIIII;
        this.llIIllIllIlIIlIIllIllllll = class_07702.llIIllIllIlIIlIIllIllllll;
        this.lllIIlIIIllllllIIIIlIlIlI = class_07702.lllIIlIIIllllllIIIIlIlIlI;
        this.IlIlIIlIlIllIIlIlIIllIIIl = class_07702.IlIlIIlIlIllIIlIlIIllIIIl;
        this.IlIlllIIIIIIlIIllIIllIlll = class_07702.IlIlllIIIIIIlIIllIIllIlll;
        this.IlIlIIlllIIlIllIIIlllllIl = class_07702.IlIlIIlllIIlIllIIIlllllIl;
        this.lllllIlllIIllIlIIlIIIllII = class_07702.lllllIlllIIllIlIIlIIIllII;
        this.IlIIIlIIIIllIIIllIIIIIIll = class_07702.IlIIIlIIIIllIIIllIIIIIIll;
        this.IIlllIlIlllIllIIIlllIIlIl = class_07702.IIlllIlIlllIllIIIlllIIlIl;
        this.lIlIllIIlIIlIIlIIlIIlIIll = class_07702.lIlIllIIlIIlIIlIIlIIlIIll;
        this.llIIlIllIllllIlIIIIlIIlll = class_07702.llIIlIllIllllIlIIIIlIIlll;
    }

    public class_0775 lllIIIllIIIIlllIlIIllIIll() {
        class_0775 class_07752 = new class_0775();
        this.lllIIIllIIIIlllIlIIllIIll(class_07752, this.lIIIIlIlIIlllllIIllIIlIII);
        return class_07752;
    }

    public class_0775 lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        class_0775 class_07753 = new class_0775();
        this.lllIIIllIIIIlllIlIIllIIll(class_07753, class_07752);
        return class_07753;
    }

    private void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752, class_0775 class_07753) {
        class_07752.lllIIIllIIIIlllIlIIllIIll("RandomSeed", this.lllIIIllIIIIlllIlIIllIIll);
        class_07752.lllIIIllIIIIlllIlIIllIIll("generatorName", this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll());
        class_07752.lllIIIllIIIIlllIlIIllIIll("generatorVersion", this.lllIlIIlIIIlIlIIIllIlllIl.lIlllIlllIIIIlIIlllIllIII());
        class_07752.lllIIIllIIIIlllIlIIllIIll("generatorOptions", this.IlIllllllIIlIIllllIIlIIIl);
        class_07752.lllIIIllIIIIlllIlIIllIIll("GameType", this.lIIlIIIIIlIlllIlIIlIlIlll.lllIIIllIIIIlllIlIIllIIll());
        class_07752.lllIIIllIIIIlllIlIIllIIll("MapFeatures", this.lIlIlIIlIIIIlIIIIIlllIIII);
        class_07752.lllIIIllIIIIlllIlIIllIIll("SpawnX", this.lIlllIlllIIIIlIIlllIllIII);
        class_07752.lllIIIllIIIIlllIlIIllIIll("SpawnY", this.IlIIIIIllllllIIlllIllllll);
        class_07752.lllIIIllIIIIlllIlIIllIIll("SpawnZ", this.lIllllIIlIIIlIllllllIIIll);
        class_07752.lllIIIllIIIIlllIlIIllIIll("Time", this.IIIllIIlIIIIIIlIlIIllIIlI);
        class_07752.lllIIIllIIIIlllIlIIllIIll("DayTime", this.IllIIlllllllIIlIIlIIIIlIl);
        class_07752.lllIIIllIIIIlllIlIIllIIll("SizeOnDisk", this.IllIIIllIIIIlIlIlIllIIlll);
        class_07752.lllIIIllIIIIlllIlIIllIIll("LastPlayed", class_0220.lllIIIlIIlIlIllIIIIIlIIll());
        class_07752.lllIIIllIIIIlllIlIIllIIll("LevelName", this.llIIllIllIlIIlIIllIllllll);
        class_07752.lllIIIllIIIIlllIlIIllIIll("version", this.lllIIlIIIllllllIIIIlIlIlI);
        class_07752.lllIIIllIIIIlllIlIIllIIll("rainTime", this.IlIlIIlIlIllIIlIlIIllIIIl);
        class_07752.lllIIIllIIIIlllIlIIllIIll("raining", this.IlIlllIIIIIIlIIllIIllIlll);
        class_07752.lllIIIllIIIIlllIlIIllIIll("thunderTime", this.IlIlIIlllIIlIllIIIlllllIl);
        class_07752.lllIIIllIIIIlllIlIIllIIll("thundering", this.lllllIlllIIllIlIIlIIIllII);
        class_07752.lllIIIllIIIIlllIlIIllIIll("hardcore", this.IlIIIlIIIIllIIIllIIIIIIll);
        class_07752.lllIIIllIIIIlllIlIIllIIll("allowCommands", this.IIlllIlIlllIllIIIlllIIlIl);
        class_07752.lllIIIllIIIIlllIlIIllIIll("initialized", this.lIlIllIIlIIlIIlIIlIIlIIll);
        class_07752.lllIIIllIIIIlllIlIIllIIll("GameRules", this.llIIlIllIllllIlIIIIlIIlll.lllIIIllIIIIlllIlIIllIIll());
        if (class_07753 != null) {
            class_07752.lllIIIllIIIIlllIlIIllIIll("Player", class_07753);
        }
    }

    public long lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public int IlIllllllIIlIIllllIIlIIIl() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    public int lIlllIlllIIIIlIIlllIllIII() {
        return this.IlIIIIIllllllIIlllIllllll;
    }

    public int IlIIIIIllllllIIlllIllllll() {
        return this.lIllllIIlIIIlIllllllIIIll;
    }

    public long lIllllIIlIIIlIllllllIIIll() {
        return this.IIIllIIlIIIIIIlIlIIllIIlI;
    }

    public long IIIllIIlIIIIIIlIlIIllIIlI() {
        return this.IllIIlllllllIIlIIlIIIIlIl;
    }

    public long IllIIlllllllIIlIIlIIIIlIl() {
        return this.IllIIIllIIIIlIlIlIllIIlll;
    }

    public class_0775 IIIllIllIIlIlIlIlIllllIIl() {
        return this.lIIIIlIlIIlllllIIllIIlIII;
    }

    public int IllIIIllIIIIlIlIlIllIIlll() {
        return this.llIIlllIllIllllIIIlIIIIII;
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n) {
        this.lIlllIlllIIIIlIIlllIllIII = n;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(int n) {
        this.IlIIIIIllllllIIlllIllllll = n;
    }

    public void IlIllllllIIlIIllllIIlIIIl(int n) {
        this.lIllllIIlIIIlIllllllIIIll = n;
    }

    public void lllIIIllIIIIlllIlIIllIIll(long l) {
        this.IIIllIIlIIIIIIlIlIIllIIlI = l;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(long l) {
        this.IllIIlllllllIIlIIlIIIIlIl = l;
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        this.lIlllIlllIIIIlIIlllIllIII = n;
        this.IlIIIIIllllllIIlllIllllll = n2;
        this.lIllllIIlIIIlIllllllIIIll = n3;
    }

    public String lIIIIlIlIIlllllIIllIIlIII() {
        return this.llIIllIllIlIIlIIllIllllll;
    }

    public void lllIIIllIIIIlllIlIIllIIll(String string) {
        this.llIIllIllIlIIlIIllIllllll = string;
    }

    public int llIIlllIllIllllIIIlIIIIII() {
        return this.lllIIlIIIllllllIIIIlIlIlI;
    }

    public void lIlllIlllIIIIlIIlllIllIII(int n) {
        this.lllIIlIIIllllllIIIIlIlIlI = n;
    }

    public long llIIllIllIlIIlIIllIllllll() {
        return this.IIIllIllIIlIlIlIlIllllIIl;
    }

    public boolean lllIIlIIIllllllIIIIlIlIlI() {
        return this.lllllIlllIIllIlIIlIIIllII;
    }

    public void lllIIIllIIIIlllIlIIllIIll(boolean bl) {
        this.lllllIlllIIllIlIIlIIIllII = bl;
    }

    public int IlIlllIIIIIIlIIllIIllIlll() {
        return this.IlIlIIlllIIlIllIIIlllllIl;
    }

    public void IlIIIIIllllllIIlllIllllll(int n) {
        this.IlIlIIlllIIlIllIIIlllllIl = n;
    }

    public boolean IlIlIIlIlIllIIlIlIIllIIIl() {
        return this.IlIlllIIIIIIlIIllIIllIlll;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(boolean bl) {
        this.IlIlllIIIIIIlIIllIIllIlll = bl;
    }

    public int lllllIlllIIllIlIIlIIIllII() {
        return this.IlIlIIlIlIllIIlIlIIllIIIl;
    }

    public void lIllllIIlIIIlIllllllIIIll(int n) {
        this.IlIlIIlIlIllIIlIlIIllIIIl = n;
    }

    public class_2243 IlIlIIlllIIlIllIIIlllllIl() {
        return this.lIIlIIIIIlIlllIlIIlIlIlll;
    }

    public boolean lIIlIIIIIlIlllIlIIlIlIlll() {
        return this.lIlIlIIlIIIIlIIIIIlllIIII;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_2243 class_22432) {
        this.lIIlIIIIIlIlllIlIIlIlIlll = class_22432;
    }

    public boolean lIlIlIIlIIIIlIIIIIlllIIII() {
        return this.IlIIIlIIIIllIIIllIIIIIIll;
    }

    public class_1074 IlIIIlIIIIllIIIllIIIIIIll() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1074 class_10742) {
        this.lllIlIIlIIIlIlIIIllIlllIl = class_10742;
    }

    public String llIllllIlIllIIIlIllIIlIlI() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public boolean IIlllIlIlllIllIIIlllIIlIl() {
        return this.IIlllIlIlllIllIIIlllIIlIl;
    }

    public boolean lIlIllIIlIIlIIlIIlIIlIIll() {
        return this.lIlIllIIlIIlIIlIIlIIlIIll;
    }

    public void IlIllllllIIlIIllllIIlIIIl(boolean bl) {
        this.lIlIllIIlIIlIIlIIlIIlIIll = bl;
    }

    public class_1263 llIIlIllIllllIlIIIIlIIlll() {
        return this.llIIlIllIllllIlIIIIlIIlll;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0799 class_07992) {
        class_07992.addCrashSectionCallable("Level seed", new class_1792(this));
        class_07992.addCrashSectionCallable("Level generator", new class_0289(this));
        class_07992.addCrashSectionCallable("Level generator options", new class_0665(this));
        class_07992.addCrashSectionCallable("Level spawn location", new class_0357(this));
        class_07992.addCrashSectionCallable("Level time", new class_0358(this));
        class_07992.addCrashSectionCallable("Level dimension", new class_1265(this));
        class_07992.addCrashSectionCallable("Level storage version", new class_0089(this));
        class_07992.addCrashSectionCallable("Level weather", new class_0655(this));
        class_07992.addCrashSectionCallable("Level game mode", new class_0555(this));
    }

    static /* synthetic */ class_1074 lllIIIllIIIIlllIlIIllIIll(class_0770 class_07702) {
        return class_07702.lllIlIIlIIIlIlIIIllIlllIl;
    }

    static /* synthetic */ boolean lllIlIIlIIIlIlIIIllIlllIl(class_0770 class_07702) {
        return class_07702.lIlIlIIlIIIIlIIIIIlllIIII;
    }

    static /* synthetic */ String IlIllllllIIlIIllllIIlIIIl(class_0770 class_07702) {
        return class_07702.IlIllllllIIlIIllllIIlIIIl;
    }

    static /* synthetic */ long lIlllIlllIIIIlIIlllIllIII(class_0770 class_07702) {
        return class_07702.IIIllIIlIIIIIIlIlIIllIIlI;
    }

    static /* synthetic */ long IlIIIIIllllllIIlllIllllll(class_0770 class_07702) {
        return class_07702.IllIIlllllllIIlIIlIIIIlIl;
    }

    static /* synthetic */ int lIllllIIlIIIlIllllllIIIll(class_0770 class_07702) {
        return class_07702.llIIlllIllIllllIIIlIIIIII;
    }

    static /* synthetic */ int IIIllIIlIIIIIIlIlIIllIIlI(class_0770 class_07702) {
        return class_07702.lllIIlIIIllllllIIIIlIlIlI;
    }

    static /* synthetic */ int IllIIlllllllIIlIIlIIIIlIl(class_0770 class_07702) {
        return class_07702.IlIlIIlIlIllIIlIlIIllIIIl;
    }

    static /* synthetic */ boolean IIIllIllIIlIlIlIlIllllIIl(class_0770 class_07702) {
        return class_07702.IlIlllIIIIIIlIIllIIllIlll;
    }

    static /* synthetic */ int IllIIIllIIIIlIlIlIllIIlll(class_0770 class_07702) {
        return class_07702.IlIlIIlllIIlIllIIIlllllIl;
    }

    static /* synthetic */ boolean lIIIIlIlIIlllllIIllIIlIII(class_0770 class_07702) {
        return class_07702.lllllIlllIIllIlIIlIIIllII;
    }

    static /* synthetic */ class_2243 llIIlllIllIllllIIIlIIIIII(class_0770 class_07702) {
        return class_07702.lIIlIIIIIlIlllIlIIlIlIlll;
    }

    static /* synthetic */ boolean llIIllIllIlIIlIIllIllllll(class_0770 class_07702) {
        return class_07702.IlIIIlIIIIllIIIllIIIIIIll;
    }

    static /* synthetic */ boolean lllIIlIIIllllllIIIIlIlIlI(class_0770 class_07702) {
        return class_07702.IIlllIlIlllIllIIIlllIIlIl;
    }
}

