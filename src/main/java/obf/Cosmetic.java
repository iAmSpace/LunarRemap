package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class Cosmetic {
    private long lllIIIllIIIIlllIlIIllIIll;
    private String lllIlIIlIIIlIlIIIllIlllIl;
    private String IlIllllllIIlIIllllIIlIIIl;
    private String lIlllIlllIIIIlIIlllIllIII;
    private float IlIIIIIllllllIIlllIllllll;
    private ResourceLocation location;
    private ResourceLocation previewLocation;
    private boolean IllIIlllllllIIlIIlIIIIlIl;

    public Cosmetic(long l, String string, String string2, String string3, float f, boolean bl, String string4) {
        this.lllIIIllIIIIlllIlIIllIIll = l;
        this.lllIlIIlIIIlIlIIIllIlllIl = string;
        this.IlIllllllIIlIIllllIIlIIIl = string2;
        this.lIlllIlllIIIIlIIlllIllIII = string3;
        this.IlIIIIIllllllIIlllIllllll = f;
        this.IllIIlllllllIIlIIlIIIIlIl = bl;
        this.location = new ResourceLocation(string4);
        this.previewLocation = new ResourceLocation("preview/" + string4);
    }

    public long lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public String lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public String IlIllllllIIlIIllllIIlIIIl() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public String lIlllIlllIIIIlIIlllIllIII() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    public float IlIIIIIllllllIIlllIllllll() {
        return this.IlIIIIIllllllIIlllIllllll;
    }

    public ResourceLocation getLocation() {
        return this.location;
    }

    public ResourceLocation getPreviewLocation() {
        return this.previewLocation;
    }

    public boolean IllIIlllllllIIlIIlIIIIlIl() {
        return this.IllIIlllllllIIlIIlIIIIlIl;
    }

    public void lllIIIllIIIIlllIlIIllIIll(boolean bl) {
        this.IllIIlllllllIIlIIlIIIIlIl = bl;
    }
}

