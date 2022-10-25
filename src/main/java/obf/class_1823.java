package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1823 {
    public static final String lllIIIllIIIIlllIlIIllIIll = "VoxelMap No Radar";
    public static final String lllIlIIlIIIlIlIIIllIlllIl = "voxelmap";
    public static final String IlIllllllIIlIIllllIIlIIIl = "1.7.10";
    public static final boolean lIlllIlllIIIIlIIlllIllIII = true;
    private boolean IIIllIIlIIIIIIlIlIIllIIlI = true;
    static final boolean IlIIIIIllllllIIlllIllllll = class_1823.lllIIIllIIIIlllIlIIllIIll("net.minecraftforge.common.MinecraftForge");
    public static class_1823 lIllllIIlIIIlIllllllIIIll;

    public class_1823() {
        lIllllIIlIIIlIllllllIIIll = this;
    }

    public void lllIIIllIIIIlllIlIIllIIll(boolean bl) {
        this.IIIllIIlIIIIIIlIlIIllIIlI = bl;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll() {
        return this.IIIllIIlIIIIIIlIlIIllIIlI;
    }

    private static boolean lllIIIllIIIIlllIlIIllIIll(String string) {
        try {
            Class.forName(string);
            return true;
        }
        catch (ClassNotFoundException classNotFoundException) {
            return false;
        }
    }
}

