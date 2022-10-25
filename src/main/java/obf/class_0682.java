package obf;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0682
extends Item {
    public class_0682() {
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.lIllllIIlIIIlIllllllIIIll);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, class_0814 class_08142, class_1334 class_13342, int n, int n2, int n3, int n4, float f, float f2, float f3) {
        Block class_05492 = class_13342.a_(n, n2, n3);
        int n5 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        if (class_08142.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n4, class_08972) && class_05492 == Blocks.IIIlllllIIIIIllIllIIIIllI && !class_1865.IllIIlllllllIIlIIlIIIIlIl(n5)) {
            int n6;
            int n7;
            int n8;
            if (class_13342.IllIIIIllIIllIllIlllIlIIl) {
                return true;
            }
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n5 + 4, 2);
            class_13342.lIllllIIlIIIlIllllllIIIll(n, n2, n3, Blocks.IIIlllllIIIIIllIllIIIIllI);
            --class_08972.lllIlIIlIIIlIlIIIllIlllIl;
            for (n8 = 0; n8 < 16; ++n8) {
                double d = (float)n + (5.0f + IlIllllllIIlIIllllIIlIIIl.nextFloat() * 6.0f) / 16.0f;
                double d2 = (float)n2 + 0.8125f;
                double d3 = (float)n3 + (5.0f + IlIllllllIIlIIllllIIlIIIl.nextFloat() * 6.0f) / 16.0f;
                double d4 = 0.0;
                double d5 = 0.0;
                double d6 = 0.0;
                class_13342.lllIIIllIIIIlllIlIIllIIll("smoke", d, d2, d3, d4, d5, d6);
            }
            n8 = n5 & 3;
            int n9 = 0;
            int n10 = 0;
            boolean bl = false;
            boolean bl2 = true;
            int n11 = class_1632.IIIllIIlIIIIIIlIlIIllIIlI[n8];
            for (n7 = -2; n7 <= 2; ++n7) {
                n6 = n + class_1632.lllIIIllIIIIlllIlIIllIIll[n11] * n7;
                int n12 = n3 + class_1632.lllIlIIlIIIlIlIIIllIlllIl[n11] * n7;
                if (class_13342.a_(n6, n2, n12) != Blocks.IIIlllllIIIIIllIllIIIIllI) continue;
                if (!class_1865.IllIIlllllllIIlIIlIIIIlIl(class_13342.IlIllllllIIlIIllllIIlIIIl(n6, n2, n12))) {
                    bl2 = false;
                    break;
                }
                n10 = n7;
                if (bl) continue;
                n9 = n7;
                bl = true;
            }
            if (bl2 && n10 == n9 + 2) {
                for (n7 = n9; n7 <= n10; ++n7) {
                    n6 = n + class_1632.lllIIIllIIIIlllIlIIllIIll[n11] * n7;
                    int n13 = n3 + class_1632.lllIlIIlIIIlIlIIIllIlllIl[n11] * n7;
                    if (class_13342.a_(n6 += class_1632.lllIIIllIIIIlllIlIIllIIll[n8] * 4, n2, n13 += class_1632.lllIlIIlIIIlIlIIIllIlllIl[n8] * 4) == Blocks.IIIlllllIIIIIllIllIIIIllI && class_1865.IllIIlllllllIIlIIlIIIIlIl(class_13342.IlIllllllIIlIIllllIIlIIIl(n6, n2, n13))) continue;
                    bl2 = false;
                    break;
                }
                block3: for (n7 = n9 - 1; n7 <= n10 + 1; n7 += 4) {
                    for (n6 = 1; n6 <= 3; ++n6) {
                        int n14 = n + class_1632.lllIIIllIIIIlllIlIIllIIll[n11] * n7;
                        int n15 = n3 + class_1632.lllIlIIlIIIlIlIIIllIlllIl[n11] * n7;
                        if (class_13342.a_(n14 += class_1632.lllIIIllIIIIlllIlIIllIIll[n8] * n6, n2, n15 += class_1632.lllIlIIlIIIlIlIIIllIlllIl[n8] * n6) == Blocks.IIIlllllIIIIIllIllIIIIllI && class_1865.IllIIlllllllIIlIIlIIIIlIl(class_13342.IlIllllllIIlIIllllIIlIIIl(n14, n2, n15))) continue;
                        bl2 = false;
                        continue block3;
                    }
                }
                if (bl2) {
                    for (n7 = n9; n7 <= n10; ++n7) {
                        for (n6 = 1; n6 <= 3; ++n6) {
                            int n16 = n + class_1632.lllIIIllIIIIlllIlIIllIIll[n11] * n7;
                            int n17 = n3 + class_1632.lllIlIIlIIIlIlIIIllIlllIl[n11] * n7;
                            class_13342.lllIIIllIIIIlllIlIIllIIll(n16 += class_1632.lllIIIllIIIIlllIlIIllIIll[n8] * n6, n2, n17 += class_1632.lllIlIIlIIIlIlIIIllIlllIl[n8] * n6, Blocks.IllIIIIIllIlIIllIllllllIl, 0, 2);
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public ItemStack lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, class_1334 class_13342, class_0814 class_08142) {
        class_2137 class_21372;
        class_1112 class_11122 = this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_08142, false);
        if (class_11122 != null && class_11122.lllIIIllIIIIlllIlIIllIIll == class_1431.lllIlIIlIIIlIlIIIllIlllIl && class_13342.a_(class_11122.lllIlIIlIIIlIlIIIllIlllIl, class_11122.IlIllllllIIlIIllllIIlIIIl, class_11122.lIlllIlllIIIIlIIlllIllIII) == Blocks.IIIlllllIIIIIllIllIIIIllI) {
            return class_08972;
        }
        if (!class_13342.IllIIIIllIIllIllIlllIlIIl && (class_21372 = class_13342.lllIlIIlIIIlIlIIIllIlllIl("Stronghold", (int)class_08142.IlIIlllllIIlIlIlllllIllll, (int)class_08142.llIIlIlIlllIIllIlIlllIllI, (int)class_08142.IllIIIIllIIllIllIlllIlIIl)) != null) {
            class_0093 class_00932 = new class_0093(class_13342, class_08142.IlIIlllllIIlIlIlllllIllll, class_08142.llIIlIlIlllIIllIlIlllIllI + 1.62 - (double)class_08142.llllIlIIIIIIIIIlllIIlIIIl, class_08142.IllIIIIllIIllIllIlllIlIIl);
            class_00932.lllIIIllIIIIlllIlIIllIIll((double)class_21372.lllIIIllIIIIlllIlIIllIIll, class_21372.lllIlIIlIIIlIlIIIllIlllIl, (double)class_21372.IlIllllllIIlIIllllIIlIIIl);
            class_13342.lllIIIllIIIIlllIlIIllIIll(class_00932);
            class_13342.lllIIIllIIIIlllIlIIllIIll((class_1521)class_08142, "random.bow", 0.5f, 0.4f / (IlIllllllIIlIIllllIIlIIIl.nextFloat() * 0.4f + 0.8f));
            class_13342.lllIIIllIIIIlllIlIIllIIll(null, 1002, (int)class_08142.IlIIlllllIIlIlIlllllIllll, (int)class_08142.llIIlIlIlllIIllIlIlllIllI, (int)class_08142.IllIIIIllIIllIllIlllIlIIl, 0);
            if (!class_08142.lIIlIlIlIlIllIIlIIllllIll.lIlllIlllIIIIlIIlllIllIII) {
                --class_08972.lllIlIIlIIIlIlIIIllIlllIl;
            }
        }
        return class_08972;
    }
}

