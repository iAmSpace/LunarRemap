package obf;

/*
 * Decompiled with CFR 0.150.
 */
public enum class_1553 {
    lllIIIllIIIIlllIlIIllIIll("Kebab", 0, "Kebab", 16, 16, 0, 0),
    lllIlIIlIIIlIlIIIllIlllIl("Aztec", 1, "Aztec", 16, 16, 16, 0),
    IlIllllllIIlIIllllIIlIIIl("Alban", 2, "Alban", 16, 16, 32, 0),
    lIlllIlllIIIIlIIlllIllIII("Aztec2", 3, "Aztec2", 16, 16, 48, 0),
    IlIIIIIllllllIIlllIllllll("Bomb", 4, "Bomb", 16, 16, 64, 0),
    lIllllIIlIIIlIllllllIIIll("Plant", 5, "Plant", 16, 16, 80, 0),
    IIIllIIlIIIIIIlIlIIllIIlI("Wasteland", 6, "Wasteland", 16, 16, 96, 0),
    IllIIlllllllIIlIIlIIIIlIl("Pool", 7, "Pool", 32, 16, 0, 32),
    IIIllIllIIlIlIlIlIllllIIl("Courbet", 8, "Courbet", 32, 16, 32, 32),
    IllIIIllIIIIlIlIlIllIIlll("Sea", 9, "Sea", 32, 16, 64, 32),
    lIIIIlIlIIlllllIIllIIlIII("Sunset", 10, "Sunset", 32, 16, 96, 32),
    llIIlllIllIllllIIIlIIIIII("Creebet", 11, "Creebet", 32, 16, 128, 32),
    llIIllIllIlIIlIIllIllllll("Wanderer", 12, "Wanderer", 16, 32, 0, 64),
    lllIIlIIIllllllIIIIlIlIlI("Graham", 13, "Graham", 16, 32, 16, 64),
    IlIlllIIIIIIlIIllIIllIlll("Match", 14, "Match", 32, 32, 0, 128),
    IlIlIIlIlIllIIlIlIIllIIIl("Bust", 15, "Bust", 32, 32, 32, 128),
    lllllIlllIIllIlIIlIIIllII("Stage", 16, "Stage", 32, 32, 64, 128),
    IlIlIIlllIIlIllIIIlllllIl("Void", 17, "Void", 32, 32, 96, 128),
    lIIlIIIIIlIlllIlIIlIlIlll("SkullAndRoses", 18, "SkullAndRoses", 32, 32, 128, 128),
    lIlIlIIlIIIIlIIIIIlllIIII("Wither", 19, "Wither", 32, 32, 160, 128),
    IlIIIlIIIIllIIIllIIIIIIll("Fighters", 20, "Fighters", 64, 32, 0, 96),
    IIlllIlIlllIllIIIlllIIlIl("Pointer", 21, "Pointer", 64, 64, 0, 192),
    lIlIllIIlIIlIIlIIlIIlIIll("Pigscene", 22, "Pigscene", 64, 64, 64, 192),
    llIIlIllIllllIlIIIIlIIlll("BurningSkull", 23, "BurningSkull", 64, 64, 128, 192),
    llIllllIlIllIIIlIllIIlIlI("Skeleton", 24, "Skeleton", 64, 48, 192, 64),
    lIlllIlllIlIIIIlllIlIlIIl("DonkeyKong", 25, "DonkeyKong", 64, 48, 192, 112);

    public static final int IlIIlllllIIlIlIlllllIllll;
    public final String llIIlIlIlllIIllIlIlllIllI;
    public final int IllIIIIllIIllIllIlllIlIIl;
    public final int IIIIIIIIlIllIIllIIlllIllI;
    public final int IIlIIlIlIlIllIIlIlIIIIlll;
    public final int llIIIlllIlllIlIllIIIIllIl;
    private static final class_1553[] IIIIlIllIlIIlIIlIllIlIlll;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private class_1553(String string3, int n, int n2, int n3, int n4) {
        void var9_7;
        void var8_6;
        this.llIIlIlIlllIIllIlIlllIllI = (String)n2;
        this.IllIIIIllIIllIllIlllIlIIl = n3;
        this.IIIIIIIIlIllIIllIIlllIllI = n4;
        this.IIlIIlIlIlIllIIlIlIIIIlll = var8_6;
        this.llIIIlllIlllIlIllIIIIllIl = var9_7;
    }

    static {
        IlIIlllllIIlIlIlllllIllll = "SkullAndRoses".length();
        IIIIlIllIlIIlIIlIllIlIlll = new class_1553[]{lllIIIllIIIIlllIlIIllIIll, lllIlIIlIIIlIlIIIllIlllIl, IlIllllllIIlIIllllIIlIIIl, lIlllIlllIIIIlIIlllIllIII, IlIIIIIllllllIIlllIllllll, lIllllIIlIIIlIllllllIIIll, IIIllIIlIIIIIIlIlIIllIIlI, IllIIlllllllIIlIIlIIIIlIl, IIIllIllIIlIlIlIlIllllIIl, IllIIIllIIIIlIlIlIllIIlll, lIIIIlIlIIlllllIIllIIlIII, llIIlllIllIllllIIIlIIIIII, llIIllIllIlIIlIIllIllllll, lllIIlIIIllllllIIIIlIlIlI, IlIlllIIIIIIlIIllIIllIlll, IlIlIIlIlIllIIlIlIIllIIIl, lllllIlllIIllIlIIlIIIllII, IlIlIIlllIIlIllIIIlllllIl, lIIlIIIIIlIlllIlIIlIlIlll, lIlIlIIlIIIIlIIIIIlllIIII, IlIIIlIIIIllIIIllIIIIIIll, IIlllIlIlllIllIIIlllIIlIl, lIlIllIIlIIlIIlIIlIIlIIll, llIIlIllIllllIlIIIIlIIlll, llIllllIlIllIIIlIllIIlIlI, lIlllIlllIlIIIIlllIlIlIIl};
    }
}

