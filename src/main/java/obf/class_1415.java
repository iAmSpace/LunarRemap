package obf;

import net.minecraft.block.Block;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1415 {
    static boolean lllIIIllIIIIlllIlIIllIIll = true;
    static boolean lllIlIIlIIIlIlIIIllIlllIl = true;
    static boolean IlIllllllIIlIIllllIIlIIIl = true;
    static boolean lIlllIlllIIIIlIIlllIllIII = true;
    static boolean IlIIIIIllllllIIlllIllllll = true;

    public static ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_1603 class_16032, class_1521 class_15212) {
        if (lIlllIlllIIIIlIIlllIllIII) {
            lIlllIlllIIIIlIIlllIllIII = false;
            return class_0705.lllIIIllIIIIlllIlIIllIIll(class_16032, class_15212);
        }
        return class_0705.lllIIIllIIIIlllIlIIllIIll(class_16032, class_15212);
    }

    public static class_1382 lllIIIllIIIIlllIlIIllIIll(class_1518 class_15182) {
        if (lllIlIIlIIIlIlIIIllIlllIl) {
            lllIlIIlIIIlIlIIIllIlllIl = false;
            return class_0705.lllIIIllIIIIlllIlIIllIIll(class_15182);
        }
        return class_0705.lllIIIllIIIIlllIlIIllIIll(class_15182);
    }

    public static class_1382 lllIlIIlIIIlIlIIIllIlllIl(class_1603 class_16032, class_1521 class_15212) {
        if (IlIllllllIIlIIllllIIlIIIl) {
            IlIllllllIIlIIllllIIlIIIl = false;
            return class_0705.lllIlIIlIIIlIlIIIllIlllIl(class_16032, class_15212);
        }
        return class_0705.lllIlIIlIIIlIlIIIllIlllIl(class_16032, class_15212);
    }

    public static void lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652, class_1518 class_15182) {
        if (lIlllIlllIIIIlIIlllIllIII) {
            lIlllIlllIIIIlIIlllIllIII = false;
            class_0705.lllIIIllIIIIlllIlIIllIIll(class_19652, class_15182);
        } else {
            class_0705.lllIIIllIIIIlllIlIIllIIll(class_19652, class_15182);
        }
    }

    public static void lllIIIllIIIIlllIlIIllIIll(Block class_05492, int n) {
        if (IlIIIIIllllllIIlllIllllll) {
            try {
                class_05492.IlIllllllIIlIIllllIIlIIIl(n);
            }
            catch (IllegalAccessError illegalAccessError) {
                IlIIIIIllllllIIlllIllllll = false;
                class_0517.lllIIIllIIIIlllIlIIllIIll(class_05492, n);
            }
        } else {
            class_0517.lllIIIllIIIIlllIlIIllIIll(class_05492, n);
        }
    }
}

