package obf;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.MathHelper;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1378
extends class_0164 {
    private static final ResourceLocation lllIIIllIIIIlllIlIIllIIll = new ResourceLocation("textures/entity/chicken.png");

    public class_1378(class_1382 class_13822, float f) {
        super(class_13822, f);
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1554 class_15542, double d, double d2, double d3, float f, float f2) {
        super.lllIIIllIIIIlllIlIIllIIll(class_15542, d, d2, d3, f, f2);
    }

    protected ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_1554 class_15542) {
        return lllIIIllIIIIlllIlIIllIIll;
    }

    protected float lllIIIllIIIIlllIlIIllIIll(class_1554 class_15542, float f) {
        float f2 = class_15542.lIIlIIIlIlIIlllIlIllIllIl + (class_15542.lIIIlIllllIlllIIIIIllIIIl - class_15542.lIIlIIIlIlIIlllIlIllIllIl) * f;
        float f3 = class_15542.lIIlIlllIIlllIIlllIIlIlII + (class_15542.lllIIIlllIlllIIlIllllIIlI - class_15542.lIIlIlllIIlllIIlllIIlIlII) * f;
        return (MathHelper.lllIIIllIIIIlllIlIIllIIll(f2) + 1.0f) * f3;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0339 class_03392, double d, double d2, double d3, float f, float f2) {
        this.lllIIIllIIIIlllIlIIllIIll((class_1554)class_03392, d, d2, d3, f, f2);
    }

    @Override
    protected float IlIllllllIIlIIllllIIlIIIl(class_1965 class_19652, float f) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_1554)class_19652, f);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652, double d, double d2, double d3, float f, float f2) {
        this.lllIIIllIIIIlllIlIIllIIll((class_1554)class_19652, d, d2, d3, f, f2);
    }

    @Override
    public ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_1554)class_15212);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, double d, double d2, double d3, float f, float f2) {
        this.lllIIIllIIIIlllIlIIllIIll((class_1554)class_15212, d, d2, d3, f, f2);
    }
}

