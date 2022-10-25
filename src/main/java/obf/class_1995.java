package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1995
extends class_0164 {
    private static final ResourceLocation lllIIIllIIIIlllIlIIllIIll = new ResourceLocation("textures/entity/blaze.png");
    private int lIllllIIlIIIlIllllllIIIll;

    public class_1995() {
        super(new class_0918(), 0.5f);
        this.lIllllIIlIIIlIllllllIIIll = ((class_0918)this.llIIllIllIlIIlIIllIllllll).lllIIIllIIIIlllIlIIllIIll();
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1819 class_18192, double d, double d2, double d3, float f, float f2) {
        int n = ((class_0918)this.llIIllIllIlIIlIIllIllllll).lllIIIllIIIIlllIlIIllIIll();
        if (n != this.lIllllIIlIIIlIllllllIIIll) {
            this.lIllllIIlIIIlIllllllIIIll = n;
            this.llIIllIllIlIIlIIllIllllll = new class_0918();
        }
        super.lllIIIllIIIIlllIlIIllIIll(class_18192, d, d2, d3, f, f2);
    }

    protected ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_1819 class_18192) {
        return lllIIIllIIIIlllIlIIllIIll;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0339 class_03392, double d, double d2, double d3, float f, float f2) {
        this.lllIIIllIIIIlllIlIIllIIll((class_1819)class_03392, d, d2, d3, f, f2);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652, double d, double d2, double d3, float f, float f2) {
        this.lllIIIllIIIIlllIlIIllIIll((class_1819)class_19652, d, d2, d3, f, f2);
    }

    @Override
    public ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_1819)class_15212);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, double d, double d2, double d3, float f, float f2) {
        this.lllIIIllIIIIlllIlIIllIIll((class_1819)class_15212, d, d2, d3, f, f2);
    }
}

