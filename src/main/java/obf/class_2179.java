package obf;

import net.minecraft.block.Block;

/*
 * Decompiled with CFR 0.150.
 */
public class class_2179 {
    private static boolean lllIIIllIIIIlllIlIIllIIll = true;

    public static void lllIIIllIIIIlllIlIIllIIll(Block class_05492, int n) {
        if (lllIIIllIIIIlllIlIIllIIll) {
            try {
                class_05492.IlIllllllIIlIIllllIIlIIIl(n);
                return;
            }
            catch (IllegalAccessError illegalAccessError) {
                lllIIIllIIIIlllIlIIllIIll = false;
            }
        }
    }
}

