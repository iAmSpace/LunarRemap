package obf;

import net.minecraft.util.ResourceLocation;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0132
extends class_0505 {
    public static class_0132 lllIIIllIIIIlllIlIIllIIll(ResourceLocation class_17732, float f) {
        return new class_0132(class_17732, 0.25f, f, false, 0, AttenuationType.NONE, 0.0f, 0.0f, 0.0f);
    }

    public static class_0132 lllIIIllIIIIlllIlIIllIIll(ResourceLocation class_17732) {
        return new class_0132(class_17732, 1.0f, 1.0f, false, 0, AttenuationType.NONE, 0.0f, 0.0f, 0.0f);
    }

    public static class_0132 lllIIIllIIIIlllIlIIllIIll(ResourceLocation class_17732, float f, float f2, float f3) {
        return new class_0132(class_17732, 4.0f, 1.0f, false, 0, AttenuationType.LINEAR, f, f2, f3);
    }

    public class_0132(ResourceLocation class_17732, float f, float f2, float f3, float f4, float f5) {
        this(class_17732, f, f2, false, 0, AttenuationType.LINEAR, f3, f4, f5);
    }

    private class_0132(ResourceLocation class_17732, float f, float f2, boolean bl, int n, AttenuationType class_03502, float f3, float f4, float f5) {
        super(class_17732);
        this.IlIllllllIIlIIllllIIlIIIl = f;
        this.lIlllIlllIIIIlIIlllIllIII = f2;
        this.IlIIIIIllllllIIlllIllllll = f3;
        this.lIllllIIlIIIlIllllllIIIll = f4;
        this.IIIllIIlIIIIIIlIlIIllIIlI = f5;
        this.IllIIlllllllIIlIIlIIIIlIl = bl;
        this.IIIllIllIIlIlIlIlIllllIIl = n;
        this.IllIIIllIIIIlIlIlIllIIlll = class_03502;
    }
}

