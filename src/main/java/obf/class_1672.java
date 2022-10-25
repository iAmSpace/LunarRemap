package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;

import java.util.Random;

public class class_1672
extends class_1067 {
    private static final class_0425[] lllIIIllIIIIlllIlIIllIIll = new class_0425[]{new class_0425(Items.saddle, 0, 1, 1, 10), new class_0425(Items.iron_ingot, 0, 1, 4, 10), new class_0425(Items.bread, 0, 1, 1, 10), new class_0425(Items.wheat, 0, 1, 4, 10), new class_0425(Items.IlIlIIlllIllllllllIIIlIlI, 0, 1, 4, 10), new class_0425(Items.llIIIlllIlllIlIllIIIIllIl, 0, 1, 4, 10), new class_0425(Items.bucket, 0, 1, 1, 10), new class_0425(Items.IlIIllIlIlIllIIIlIIlIlIIl, 0, 1, 1, 1), new class_0425(Items.lIIIlIIllIllIIlIIlIIIllII, 0, 1, 4, 10), new class_0425(Items.IIllllllIIllIlIllllIIIlll, 0, 1, 1, 10), new class_0425(Items.llllIIIllIllIIIllIlIIIIIl, 0, 1, 1, 10), new class_0425(Items.IIIIlllllIlllIIllIIIlIllI, 0, 1, 1, 10), new class_0425(Items.lIlIlIIllIlIIIIIlIIlllIlI, 0, 1, 1, 2), new class_0425(Items.IlIllIIIIllllIIllIllIIIIl, 0, 1, 1, 5), new class_0425(Items.llllIllllllIllIIIlIlIIllI, 0, 1, 1, 1)};

    @Override
    public boolean a_(class_1334 class_13342, Random random, int n, int n2, int n3) {
        int n4;
        int n5;
        int n6;
        int n7 = 3;
        int n8 = random.nextInt(2) + 2;
        int n9 = random.nextInt(2) + 2;
        int n10 = 0;
        for (n6 = n - n8 - 1; n6 <= n + n8 + 1; ++n6) {
            for (n5 = n2 - 1; n5 <= n2 + n7 + 1; ++n5) {
                for (n4 = n3 - n9 - 1; n4 <= n3 + n9 + 1; ++n4) {
                    class_1855 class_18552 = class_13342.a_(n6, n5, n4).lIllllIIlIIIlIllllllIIIll();
                    if (n5 == n2 - 1 && !class_18552.lllIlIIlIIIlIlIIIllIlllIl()) {
                        return false;
                    }
                    if (n5 == n2 + n7 + 1 && !class_18552.lllIlIIlIIIlIlIIIllIlllIl()) {
                        return false;
                    }
                    if (n6 != n - n8 - 1 && n6 != n + n8 + 1 && n4 != n3 - n9 - 1 && n4 != n3 + n9 + 1 || n5 != n2 || !class_13342.lIlllIlllIIIIlIIlllIllIII(n6, n5, n4) || !class_13342.lIlllIlllIIIIlIIlllIllIII(n6, n5 + 1, n4)) continue;
                    ++n10;
                }
            }
        }
        if (n10 >= 1 && n10 <= 5) {
            for (n6 = n - n8 - 1; n6 <= n + n8 + 1; ++n6) {
                for (n5 = n2 + n7; n5 >= n2 - 1; --n5) {
                    for (n4 = n3 - n9 - 1; n4 <= n3 + n9 + 1; ++n4) {
                        if (n6 != n - n8 - 1 && n5 != n2 - 1 && n4 != n3 - n9 - 1 && n6 != n + n8 + 1 && n5 != n2 + n7 + 1 && n4 != n3 + n9 + 1) {
                            class_13342.lIllllIIlIIIlIllllllIIIll(n6, n5, n4);
                            continue;
                        }
                        if (n5 >= 0 && !class_13342.a_(n6, n5 - 1, n4).lIllllIIlIIIlIllllllIIIll().lllIlIIlIIIlIlIIIllIlllIl()) {
                            class_13342.lIllllIIlIIIlIllllllIIIll(n6, n5, n4);
                            continue;
                        }
                        if (!class_13342.a_(n6, n5, n4).lIllllIIlIIIlIllllllIIIll().lllIlIIlIIIlIlIIIllIlllIl()) continue;
                        if (n5 == n2 - 1 && random.nextInt(4) != 0) {
                            class_13342.lllIIIllIIIIlllIlIIllIIll(n6, n5, n4, Blocks.llIlllIlIIllIlIIIIllIIlIl, 0, 2);
                            continue;
                        }
                        class_13342.lllIIIllIIIIlllIlIIllIIll(n6, n5, n4, Blocks.IlIIIIIllllllIIlllIllllll, 0, 2);
                    }
                }
            }
            block6: for (n6 = 0; n6 < 2; ++n6) {
                for (n5 = 0; n5 < 3; ++n5) {
                    int n11;
                    n4 = n + random.nextInt(n8 * 2 + 1) - n8;
                    if (!class_13342.lIlllIlllIIIIlIIlllIllIII(n4, n2, n11 = n3 + random.nextInt(n9 * 2 + 1) - n9)) continue;
                    int n12 = 0;
                    if (class_13342.a_(n4 - 1, n2, n11).lIllllIIlIIIlIllllllIIIll().lllIlIIlIIIlIlIIIllIlllIl()) {
                        ++n12;
                    }
                    if (class_13342.a_(n4 + 1, n2, n11).lIllllIIlIIIlIllllllIIIll().lllIlIIlIIIlIlIIIllIlllIl()) {
                        ++n12;
                    }
                    if (class_13342.a_(n4, n2, n11 - 1).lIllllIIlIIIlIllllllIIIll().lllIlIIlIIIlIlIIIllIlllIl()) {
                        ++n12;
                    }
                    if (class_13342.a_(n4, n2, n11 + 1).lIllllIIlIIIlIllllllIIIll().lllIlIIlIIIlIlIIIllIlllIl()) {
                        ++n12;
                    }
                    if (n12 != 1) continue;
                    class_13342.lllIIIllIIIIlllIlIIllIIll(n4, n2, n11, Blocks.IllIlIlIIIlllIIllIIIIlIll, 0, 2);
                    class_0425[] arrclass_0425 = class_0425.lllIIIllIIIIlllIlIIllIIll(lllIIIllIIIIlllIlIIllIIll, Items.lIllIlIlIIIIlIlIIlIlIlllI.lllIIIllIIIIlllIlIIllIIll(random));
                    class_0071 class_00712 = (class_0071)class_13342.lllIlIIlIIIlIlIIIllIlllIl(n4, n2, n11);
                    if (class_00712 == null) continue block6;
                    class_0425.lllIIIllIIIIlllIlIIllIIll(random, arrclass_0425, class_00712, 8);
                    continue block6;
                }
            }
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, Blocks.IIlIllIIlllllIIlIIllllIIl, 0, 2);
            class_0933 class_09332 = (class_0933)class_13342.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3);
            if (class_09332 != null) {
                class_09332.lllIIIllIIIIlllIlIIllIIll().lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll(random));
            } else {
                System.err.println("Failed to fetch mob spawner entity at (" + n + ", " + n2 + ", " + n3 + ")");
            }
            return true;
        }
        return false;
    }

    private String lllIIIllIIIIlllIlIIllIIll(Random random) {
        int n = random.nextInt(4);
        return n == 0 ? "Skeleton" : (n == 1 ? "Zombie" : (n == 2 ? "Zombie" : (n == 3 ? "Spider" : "")));
    }
}

