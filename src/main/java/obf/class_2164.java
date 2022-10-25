package obf;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import optifine.Config;
import net.minecraft.client.settings.GameSettings;

/*
 * Decompiled with CFR 0.150.
 */
public class class_2164 {
    public static void lllIIIllIIIIlllIlIIllIIll(GameSettings class_17512, class_1334 class_13342) {
        class_1965 class_19652;
        class_1848 class_18482;
        if (class_17512 != null) {
            int n = 3;
            if (class_17512.llIIlIIllIIllIlIIllIIllII) {
                n = 1;
            }
            class_2179.lllIIIllIIIIlllIlIIllIIll(Blocks.IllIIIllIIIIlIlIlIllIIlll, n);
            class_2179.lllIIIllIIIIlllIlIIllIIll(Blocks.IIIllIllIIlIlIlIlIllllIIl, n);
        }
        if (class_13342 != null && (class_18482 = class_13342.llIIlIllIllllIlIIIIlIIlll()) != null && (class_19652 = Config.llIlllIlIIllIlIIIIllIIlIl().llIIlllIllIllllIIIlIIIIII) != null) {
            int n = (int)class_19652.IlIIlllllIIlIlIlllllIllll / 16;
            int n2 = (int)class_19652.IllIIIIllIIllIllIlllIlIIl / 16;
            int n3 = n - 512;
            int n4 = n + 512;
            int n5 = n2 - 512;
            int n6 = n2 + 512;
            int n7 = 0;
            for (int i = n3; i < n4; ++i) {
                for (int j = n5; j < n6; ++j) {
                    class_0723 class_07232;
                    if (!class_18482.lllIIIllIIIIlllIlIIllIIll(i, j) || (class_07232 = class_18482.lIlllIlllIIIIlIIlllIllIII(i, j)) == null || class_07232 instanceof class_1279) continue;
                    int n8 = i << 4;
                    int n9 = j << 4;
                    int n10 = n8 + 16;
                    int n11 = n9 + 16;
                    for (int k = n8; k < n10; ++k) {
                        block3: for (int i2 = n9; i2 < n11; ++i2) {
                            int n12 = class_13342.IllIIlllllllIIlIIlIIIIlIl(k, i2);
                            for (int i3 = 0; i3 < n12; ++i3) {
                                Block class_05492 = class_13342.a_(k, i3, i2);
                                if (class_05492.lIllllIIlIIIlIllllllIIIll() != class_1855.IllIIlllllllIIlIIlIIIIlIl) {
                                    continue;
                                }
                                class_13342.lIlllIlllIIIIlIIlllIllIII(k, i2, i3, n12);
                                ++n7;
                                continue block3;
                            }
                        }
                    }
                }
            }
            if (n7 > 0) {
                String string = "server";
                if (Config.IIIllIllIIlIlIlIlIllllIIl()) {
                    string = "client";
                }
                Config.lllIIIllIIIIlllIlIIllIIll("ClearWater (" + string + ") relighted " + n7 + " chunks");
            }
        }
    }
}

