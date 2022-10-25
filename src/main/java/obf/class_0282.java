package obf;

import net.minecraft.util.ResourceLocation;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0282
extends class_0796 {
    private static final ResourceLocation IlIlllIIIIIIlIIllIIllIlll = new ResourceLocation("textures/entity/zombie_pigman.png");
    private static final ResourceLocation IlIlIIlIlIllIIlIlIIllIIIl = new ResourceLocation("textures/entity/zombie/zombie.png");
    private static final ResourceLocation lllllIlllIIllIlIIlIIIllII = new ResourceLocation("textures/entity/zombie/zombie_villager.png");
    private class_1931 IlIlIIlllIIlIllIIIlllllIl = this.lllIIIllIIIIlllIlIIllIIll;
    private class_2167 lIIlIIIIIlIlllIlIIlIlIlll = new class_2167();
    protected class_1931 IIIllIllIIlIlIlIlIllllIIl;
    protected class_1931 IllIIIllIIIIlIlIlIllIIlll;
    protected class_1931 lIIIIlIlIIlllllIIllIIlIII;
    protected class_1931 llIIlllIllIllllIIIlIIIIII;
    private int lIlIlIIlIIIIlIIIIIlllIIII = 1;

    public class_0282() {
        super(new class_0274(), 0.5f, 1.0f);
    }

    @Override
    protected void IlIllllllIIlIIllllIIlIIIl() {
        this.IIIllIIlIIIIIIlIlIIllIIlI = new class_0274(1.0f, true);
        this.IllIIlllllllIIlIIlIIIIlIl = new class_0274(0.5f, true);
        this.IIIllIllIIlIlIlIlIllllIIl = this.IIIllIIlIIIIIIlIlIIllIIlI;
        this.IllIIIllIIIIlIlIlIllIIlll = this.IllIIlllllllIIlIIlIIIIlIl;
        this.lIIIIlIlIIlllllIIllIIlIII = new class_2167(1.0f, 0.0f, true);
        this.llIIlllIllIllllIIIlIIIIII = new class_2167(0.5f, 0.0f, true);
    }

    protected int lllIIIllIIIIlllIlIIllIIll(class_0724 class_07242, int n, float f) {
        this.lllIlIIlIIIlIlIIIllIlllIl(class_07242);
        return super.lllIIIllIIIIlllIlIIllIIll(class_07242, n, f);
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0724 class_07242, double d, double d2, double d3, float f, float f2) {
        this.lllIlIIlIIIlIlIIIllIlllIl(class_07242);
        super.lllIIIllIIIIlllIlIIllIIll(class_07242, d, d2, d3, f, f2);
    }

    protected ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_0724 class_07242) {
        return class_07242 instanceof class_1144 ? IlIlllIIIIIIlIIllIIllIlll : (class_07242.lIllIIlllIIIlIlIIIlllIlIl() ? lllllIlllIIllIlIIlIIIllII : IlIlIIlIlIllIIlIlIIllIIIl);
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_0724 class_07242, float f) {
        this.lllIlIIlIIIlIlIIIllIlllIl(class_07242);
        super.lllIIIllIIIIlllIlIIllIIll((class_0339)class_07242, f);
    }

    private void lllIlIIlIIIlIlIIIllIlllIl(class_0724 class_07242) {
        if (class_07242.lIllIIlllIIIlIlIIIlllIlIl()) {
            if (this.lIlIlIIlIIIIlIIIIIlllIIII != this.lIIlIIIIIlIlllIlIIlIlIlll.lllIIIllIIIIlllIlIIllIIll()) {
                this.lIIlIIIIIlIlllIlIIlIlIlll = new class_2167();
                this.lIlIlIIlIIIIlIIIIIlllIIII = this.lIIlIIIIIlIlllIlIIlIlIlll.lllIIIllIIIIlllIlIIllIIll();
                this.lIIIIlIlIIlllllIIllIIlIII = new class_2167(1.0f, 0.0f, true);
                this.llIIlllIllIllllIIIlIIIIII = new class_2167(0.5f, 0.0f, true);
            }
            this.llIIllIllIlIIlIIllIllllll = this.lIIlIIIIIlIlllIlIIlIlIlll;
            this.IIIllIIlIIIIIIlIlIIllIIlI = this.lIIIIlIlIIlllllIIllIIlIII;
            this.IllIIlllllllIIlIIlIIIIlIl = this.llIIlllIllIllllIIIlIIIIII;
        } else {
            this.llIIllIllIlIIlIIllIllllll = this.IlIlIIlllIIlIllIIIlllllIl;
            this.IIIllIIlIIIIIIlIlIIllIIlI = this.IIIllIllIIlIlIlIlIllllIIl;
            this.IllIIlllllllIIlIIlIIIIlIl = this.IllIIIllIIIIlIlIlIllIIlll;
        }
        this.lllIIIllIIIIlllIlIIllIIll = (class_1931)this.llIIllIllIlIIlIIllIllllll;
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_0724 class_07242, float f, float f2, float f3) {
        if (class_07242.IIlIlIlIIlllIIIlIIIIlIIIl()) {
            f2 += (float)(Math.cos((double)class_07242.IlllIIIllllIIllIllIlIIlIl * 3.25) * Math.PI * 0.25);
        }
        super.lllIIIllIIIIlllIlIIllIIll((class_1965)class_07242, f, f2, f3);
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_0339 class_03392, float f) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0724)class_03392, f);
    }

    @Override
    protected ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_0339 class_03392) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_0724)class_03392);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0339 class_03392, double d, double d2, double d3, float f, float f2) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0724)class_03392, d, d2, d3, f, f2);
    }

    @Override
    protected int lllIIIllIIIIlllIlIIllIIll(class_0339 class_03392, int n, float f) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_0724)class_03392, n, f);
    }

    @Override
    public int lllIlIIlIIIlIlIIIllIlllIl(class_1965 class_19652, int n, float f) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_0724)class_19652, n, f);
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl(class_1965 class_19652, float f) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0724)class_19652, f);
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652, float f, float f2, float f3) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0724)class_19652, f, f2, f3);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652, double d, double d2, double d3, float f, float f2) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0724)class_19652, d, d2, d3, f, f2);
    }

    @Override
    public ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_0724)class_15212);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, double d, double d2, double d3, float f, float f2) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0724)class_15212, d, d2, d3, f, f2);
    }
}

