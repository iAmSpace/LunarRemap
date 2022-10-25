package obf;

/*
 * Decompiled with CFR 0.150.
 */
public enum class_1002 {
    lllIIIllIIIIlllIlIIllIIll("options.minimap.showcoordinates", false, true, false),
    lllIlIIlIIIlIlIIIllIlllIl("options.minimap.hideminimap", false, true, false),
    IlIllllllIIlIIllllIIlIIIl("options.minimap.cavemode", false, true, false),
    lIlllIlllIIIIlIIlllIllIII("options.minimap.dynamiclighting", false, true, false),
    IlIIIIIllllllIIlllIllllll("options.minimap.terraindepth", false, false, true),
    lIllllIIlIIIlIllllllIIIll("options.minimap.squaremap", false, true, false),
    IIIllIIlIIIIIIlIlIIllIIlI("options.minimap.oldnorth", false, true, false),
    IllIIlllllllIIlIIlIIIIlIl("options.minimap.ingamewaypoints", false, false, true),
    IIIllIllIIlIlIlIlIllllIIl("Welcome Screen", false, true, false),
    IllIIIllIIIIlIlIlIllIIlll("option.minimapZoom", false, true, false),
    lIIIIlIlIIlllllIIllIIlIII("options.minimap.location", false, false, true),
    llIIlllIllIllllIIIlIIIIII("options.minimap.size", false, false, true),
    llIIllIllIlIIlIIllIllllll("options.minimap.filtering", false, true, false),
    lllIIlIIIllllllIIIIlIlIlI("options.minimap.watertransparency", false, true, false),
    IlIlllIIIIIIlIIllIIllIlll("options.minimap.blocktransparency", false, true, false),
    IlIlIIlIlIllIIlIlIIllIIIl("options.minimap.biomes", false, true, false),
    lllllIlllIIllIlIIlIIIllII("options.minimap.biomeoverlay", false, false, true),
    IlIlIIlllIIlIllIIIlllllIl("options.minimap.chunkgrid", false, true, false),
    lIIlIIIIIlIlllIlIIlIlIlll("options.minimap.radar.showradar", false, true, false),
    lIlIlIIlIIIIlIIIIIlllIIII("options.minimap.radar.showhostiles", false, true, false),
    IlIIIlIIIIllIIIllIIIIIIll("options.minimap.radar.showplayers", false, true, false),
    IIlllIlIlllIllIIIlllIIlIl("options.minimap.radar.showneutrals", false, true, false),
    lIlIllIIlIIlIIlIIlIIlIIll("options.minimap.radar.showplayerhelmets", false, true, false),
    llIIlIllIllllIlIIIIlIIlll("options.minimap.radar.showmobhelmets", false, true, false),
    llIllllIlIllIIIlIllIIlIlI("options.minimap.radar.showplayernames", false, true, false),
    lIlllIlllIlIIIIlllIlIlIIl("options.minimap.radar.iconoutlines", false, true, false),
    IlIIlllllIIlIlIlllllIllll("options.minimap.radar.iconfiltering", false, true, false),
    llIIlIlIlllIIllIlIlllIllI("options.minimap.radar.randomobs", false, true, false),
    IllIIIIllIIllIllIlllIlIIl("options.minimap.waypoints.distance", true, false, false),
    IIIIIIIIlIllIIllIIlllIllI("options.minimap.waypoints.deathpoints", false, false, true);

    private final boolean IIlIIlIlIlIllIIlIlIIIIlll;
    private final boolean llIIIlllIlllIlIllIIIIllIl;
    private final boolean IIIIlIllIlIIlIIlIllIlIlll;
    private final String IlIlIIlllIllllllllIIIlIlI;

    public static class_1002 lllIIIllIIIIlllIlIIllIIll(int n) {
        for (class_1002 class_10022 : class_1002.values()) {
            if (class_10022.lIlllIlllIIIIlIIlllIllIII() != n) continue;
            return class_10022;
        }
        return null;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private class_1002(boolean bl, boolean bl2) {
        void var6_4;
        void var5_3;
        this.IlIlIIlllIllllllllIIIlIlI = (String)bl;
        this.IIlIIlIlIlIllIIlIlIIIIlll = bl2;
        this.llIIIlllIlllIlIllIIIIllIl = var5_3;
        this.IIIIlIllIlIIlIIlIllIlIlll = var6_4;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll() {
        return this.IIlIIlIlIlIllIIlIlIIIIlll;
    }

    public boolean lllIlIIlIIIlIlIIIllIlllIl() {
        return this.llIIIlllIlllIlIllIIIIllIl;
    }

    public boolean IlIllllllIIlIIllllIIlIIIl() {
        return this.IIIIlIllIlIIlIIlIllIlIlll;
    }

    public int lIlllIlllIIIIlIIlllIllIII() {
        return this.ordinal();
    }

    public String IlIIIIIllllllIIlllIllllll() {
        return this.IlIlIIlllIllllllllIIIlIlI;
    }
}

