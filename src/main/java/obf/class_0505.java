package obf;

import net.minecraft.util.ResourceLocation;

/*
 * Decompiled with CFR 0.150.
 */
public abstract class class_0505
implements class_0308 {
    protected final ResourceLocation lllIlIIlIIIlIlIIIllIlllIl;
    protected float IlIllllllIIlIIllllIIlIIIl = 1.0f;
    protected float lIlllIlllIIIIlIIlllIllIII = 1.0f;
    protected float IlIIIIIllllllIIlllIllllll;
    protected float lIllllIIlIIIlIllllllIIIll;
    protected float IIIllIIlIIIIIIlIlIIllIIlI;
    protected boolean IllIIlllllllIIlIIlIIIIlIl = false;
    protected int IIIllIllIIlIlIlIlIllllIIl = 0;
    protected AttenuationType IllIIIllIIIIlIlIlIllIIlll = AttenuationType.LINEAR;

    protected class_0505(ResourceLocation class_17732) {
        this.lllIlIIlIIIlIlIIIllIlllIl = class_17732;
    }

    @Override
    public ResourceLocation lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    @Override
    public boolean lllIlIIlIIIlIlIIIllIlllIl() {
        return this.IllIIlllllllIIlIIlIIIIlIl;
    }

    @Override
    public int IlIllllllIIlIIllllIIlIIIl() {
        return this.IIIllIllIIlIlIlIlIllllIIl;
    }

    @Override
    public float lIlllIlllIIIIlIIlllIllIII() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    @Override
    public float IlIIIIIllllllIIlllIllllll() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    @Override
    public float lIllllIIlIIIlIllllllIIIll() {
        return this.IlIIIIIllllllIIlllIllllll;
    }

    @Override
    public float IIIllIIlIIIIIIlIlIIllIIlI() {
        return this.lIllllIIlIIIlIllllllIIIll;
    }

    @Override
    public float IllIIlllllllIIlIIlIIIIlIl() {
        return this.IIIllIIlIIIIIIlIlIIllIIlI;
    }

    @Override
    public AttenuationType IIIllIllIIlIlIlIlIllllIIl() {
        return this.IllIIIllIIIIlIlIlIllIIlll;
    }
}

