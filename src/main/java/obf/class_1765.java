package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture$Type
 */
import com.mojang.authlib.minecraft.MinecraftProfileTexture;

final class class_1765 {
    static final int[] lllIIIllIIIIlllIlIIllIIll = new int[MinecraftProfileTexture.Type.values().length];

    class_1765() {
    }

    static {
        try {
            class_1765.lllIIIllIIIIlllIlIIllIIll[MinecraftProfileTexture.Type.SKIN.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            class_1765.lllIIIllIIIIlllIlIIllIIll[MinecraftProfileTexture.Type.CAPE.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

