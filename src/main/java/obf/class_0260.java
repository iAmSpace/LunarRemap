package obf;

/*
 * Decompiled with CFR 0.150.
 */
public enum class_0260 {
    lllIIIllIIIIlllIlIIllIIll("MENU", 0, new ResourceLocation("minecraft:music.menu"), 20, 600),
    lllIlIIlIIIlIlIIIllIlllIl("GAME", 1, new ResourceLocation("minecraft:music.game"), 12000, 24000),
    IlIllllllIIlIIllllIIlIIIl("CREATIVE", 2, new ResourceLocation("minecraft:music.game.creative"), 1200, 3600),
    lIlllIlllIIIIlIIlllIllIII("CREDITS", 3, new ResourceLocation("minecraft:music.game.end.credits"), Integer.MAX_VALUE, Integer.MAX_VALUE),
    IlIIIIIllllllIIlllIllllll("NETHER", 4, new ResourceLocation("minecraft:music.game.nether"), 1200, 3600),
    lIllllIIlIIIlIllllllIIIll("END_BOSS", 5, new ResourceLocation("minecraft:music.game.end.dragon"), 0, 0),
    IIIllIIlIIIIIIlIlIIllIIlI("END", 6, new ResourceLocation("minecraft:music.game.end"), 6000, 24000);

    private final ResourceLocation IllIIlllllllIIlIIlIIIIlIl;
    private final int IIIllIllIIlIlIlIlIllllIIl;
    private final int IllIIIllIIIIlIlIlIllIIlll;
    private static final class_0260[] lIIIIlIlIIlllllIIllIIlIII;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private class_0260(ResourceLocation class_17732, int n, int n2) {
        void var7_5;
        void var6_4;
        this.IllIIlllllllIIlIIlIIIIlIl = (ResourceLocation)n2;
        this.IIIllIllIIlIlIlIlIllllIIl = var6_4;
        this.IllIIIllIIIIlIlIlIllIIlll = var7_5;
    }

    public ResourceLocation lllIIIllIIIIlllIlIIllIIll() {
        return this.IllIIlllllllIIlIIlIIIIlIl;
    }

    public int lllIlIIlIIIlIlIIIllIlllIl() {
        return this.IIIllIllIIlIlIlIlIllllIIl;
    }

    public int IlIllllllIIlIIllllIIlIIIl() {
        return this.IllIIIllIIIIlIlIlIllIIlll;
    }

    static {
        lIIIIlIlIIlllllIIllIIlIII = new class_0260[]{lllIIIllIIIIlllIlIIllIIll, lllIlIIlIIIlIlIIIllIlllIl, IlIllllllIIlIIllllIIlIIIl, lIlllIlllIIIIlIIlllIllIII, IlIIIIIllllllIIlllIllllll, lIllllIIlIIIlIllllllIIIll, IIIllIIlIIIIIIlIlIIllIIlI};
    }
}

