package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1402
extends class_0164 {
    private static final ResourceLocation lllIIIllIIIIlllIlIIllIIll = new ResourceLocation("textures/entity/pig/pig_saddle.png");
    private static final ResourceLocation lIllllIIlIIIlIllllllIIIll = new ResourceLocation("textures/entity/pig/pig.png");

    public class_1402(class_1382 class_13822, class_1382 class_13823, float f) {
        super(class_13822, f);
        this.lllIIIllIIIIlllIlIIllIIll(class_13823);
    }

    protected int lllIIIllIIIIlllIlIIllIIll(class_0161 class_01612, int n, float f) {
        if (n == 0 && class_01612.IIlIlIlIIlllIIIlIIIIlIIIl()) {
            this.lllIIIllIIIIlllIlIIllIIll(lllIIIllIIIIlllIlIIllIIll);
            return 1;
        }
        return -1;
    }

    protected ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_0161 class_01612) {
        return lIllllIIlIIIlIllllllIIIll;
    }

    @Override
    public int lllIlIIlIIIlIlIIIllIlllIl(class_1965 class_19652, int n, float f) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_0161)class_19652, n, f);
    }

    @Override
    public ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_0161)class_15212);
    }
}

