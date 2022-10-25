package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashMultiset
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Multiset
 *  com.google.common.collect.Multisets
 */
import com.google.common.collect.HashMultiset;
import com.google.common.collect.Iterables;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;

import java.util.List;

public class class_0746
extends class_1747 {
    protected class_0746() {
        this.lllIIIllIIIIlllIlIIllIIll(true);
    }

    public static class_0963 lllIIIllIIIIlllIlIIllIIll(int n, class_1334 class_13342) {
        String string = "map_" + n;
        class_0963 class_09632 = (class_0963)class_13342.lllIIIllIIIIlllIlIIllIIll(class_0963.class, string);
        if (class_09632 == null) {
            class_09632 = new class_0963(string);
            class_13342.lllIIIllIIIIlllIlIIllIIll(string, class_09632);
        }
        return class_09632;
    }

    public class_0963 lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, class_1334 class_13342) {
        String string = "map_" + class_08972.IllIIIllIIIIlIlIlIllIIlll();
        class_0963 class_09632 = (class_0963)class_13342.lllIIIllIIIIlllIlIIllIIll(class_0963.class, string);
        if (class_09632 == null && !class_13342.IllIIIIllIIllIllIlllIlIIl) {
            class_08972.lllIlIIlIIIlIlIIIllIlllIl(class_13342.IlIllllllIIlIIllllIIlIIIl("map"));
            string = "map_" + class_08972.IllIIIllIIIIlIlIlIllIIlll();
            class_09632 = new class_0963(string);
            class_09632.IlIIIIIllllllIIlllIllllll = (byte)3;
            int n = 128 * (1 << class_09632.IlIIIIIllllllIIlllIllllll);
            class_09632.lllIlIIlIIIlIlIIIllIlllIl = Math.round((float)class_13342.lIlllIlllIlIIIIlllIlIlIIl().IlIllllllIIlIIllllIIlIIIl() / (float)n) * n;
            class_09632.IlIllllllIIlIIllllIIlIIIl = Math.round(class_13342.lIlllIlllIlIIIIlllIlIlIIl().IlIIIIIllllllIIlllIllllll() / n) * n;
            class_09632.lIlllIlllIIIIlIIlllIllIII = (byte)class_13342.IlIlIIlllIIlIllIIIlllllIl.IIIllIllIIlIlIlIlIllllIIl;
            class_09632.lIlllIlllIIIIlIIlllIllIII();
            class_13342.lllIIIllIIIIlllIlIIllIIll(string, class_09632);
        }
        return class_09632;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, class_1521 class_15212, class_0963 class_09632) {
        if (class_13342.IlIlIIlllIIlIllIIIlllllIl.IIIllIllIIlIlIlIlIllllIIl == class_09632.lIlllIlllIIIIlIIlllIllIII && class_15212 instanceof class_0814) {
            int n = 1 << class_09632.IlIIIIIllllllIIlllIllllll;
            int n2 = class_09632.lllIlIIlIIIlIlIIIllIlllIl;
            int n3 = class_09632.IlIllllllIIlIIllllIIlIIIl;
            int n4 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_15212.IlIIlllllIIlIlIlllllIllll - (double)n2) / n + 64;
            int n5 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_15212.IllIIIIllIIllIllIlllIlIIl - (double)n3) / n + 64;
            int n6 = 128 / n;
            if (class_13342.IlIlIIlllIIlIllIIIlllllIl.IIIllIIlIIIIIIlIlIIllIIlI) {
                n6 /= 2;
            }
            class_1886 class_18862 = class_09632.lllIIIllIIIIlllIlIIllIIll((class_0814)class_15212);
            ++class_18862.lIlllIlllIIIIlIIlllIllIII;
            for (int i = n4 - n6 + 1; i < n4 + n6; ++i) {
                if ((i & 0xF) != (class_18862.lIlllIlllIIIIlIIlllIllIII & 0xF)) continue;
                int n7 = 255;
                int n8 = 0;
                double d = 0.0;
                for (int j = n5 - n6 - 1; j < n5 + n6; ++j) {
                    byte by;
                    class_1662 class_16622;
                    int n9;
                    int n10;
                    if (i < 0 || j < -1 || i >= 128 || j >= 128) continue;
                    int n11 = i - n4;
                    int n12 = j - n5;
                    boolean bl = n11 * n11 + n12 * n12 > (n6 - 2) * (n6 - 2);
                    int n13 = (n2 / n + i - 64) * n;
                    int n14 = (n3 / n + j - 64) * n;
                    HashMultiset hashMultiset = HashMultiset.create();
                    class_0723 class_07232 = class_13342.lIlllIlllIIIIlIIlllIllIII(n13, n14);
                    if (class_07232.IllIIlllllllIIlIIlIIIIlIl()) continue;
                    int n15 = n13 & 0xF;
                    int n16 = n14 & 0xF;
                    int n17 = 0;
                    double d2 = 0.0;
                    if (class_13342.IlIlIIlllIIlIllIIIlllllIl.IIIllIIlIIIIIIlIlIIllIIlI) {
                        n10 = n13 + n14 * 231871;
                        if (((n10 = n10 * n10 * 31287121 + n10 * 11) >> 20 & 1) == 0) {
                            hashMultiset.add((Object) Blocks.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl(0), 10);
                        } else {
                            hashMultiset.add((Object) Blocks.lllIlIIlIIIlIlIIIllIlllIl.lllIlIIlIIIlIlIIIllIlllIl(0), 100);
                        }
                        d2 = 100.0;
                    } else {
                        for (n10 = 0; n10 < n; ++n10) {
                            for (int k = 0; k < n; ++k) {
                                int n18 = class_07232.lllIlIIlIIIlIlIIIllIlllIl(n10 + n15, k + n16) + 1;
                                Block class_05492 = Blocks.lllIIIllIIIIlllIlIIllIIll;
                                int n19 = 0;
                                if (n18 > 1) {
                                    while ((class_05492 = class_07232.lllIlIIlIIIlIlIIIllIlllIl(n10 + n15, --n18, k + n16)).lllIlIIlIIIlIlIIIllIlllIl(n19 = class_07232.IlIllllllIIlIIllllIIlIIIl(n10 + n15, n18, k + n16)) == class_1662.lllIlIIlIIIlIlIIIllIlllIl && n18 > 0) {
                                    }
                                    if (n18 > 0 && class_05492.lIllllIIlIIIlIllllllIIIll().lllIIIllIIIIlllIlIIllIIll()) {
                                        Block class_05493;
                                        n9 = n18 - 1;
                                        do {
                                            class_05493 = class_07232.lllIlIIlIIIlIlIIIllIlllIl(n10 + n15, n9--, k + n16);
                                            ++n17;
                                        } while (n9 > 0 && class_05493.lIllllIIlIIIlIllllllIIIll().lllIIIllIIIIlllIlIIllIIll());
                                    }
                                }
                                d2 += (double)n18 / (double)(n * n);
                                hashMultiset.add((Object)class_05492.lllIlIIlIIIlIlIIIllIlllIl(n19));
                            }
                        }
                    }
                    n17 /= n * n;
                    double d3 = (d2 - d) * 4.0 / (double)(n + 4) + ((double)(i + j & 1) - 0.5) * 0.4;
                    int n20 = 1;
                    if (d3 > 0.6) {
                        n20 = 2;
                    }
                    if (d3 < -0.6) {
                        n20 = 0;
                    }
                    if ((class_16622 = (class_1662)Iterables.getFirst((Iterable)Multisets.copyHighestCountFirst((Multiset)hashMultiset), (Object)class_1662.lllIlIIlIIIlIlIIIllIlllIl)) == class_1662.lllIIlIIIllllllIIIIlIlIlI) {
                        d3 = (double)n17 * 0.1 + (double)(i + j & 1) * 0.2;
                        n20 = 1;
                        if (d3 < 0.5) {
                            n20 = 2;
                        }
                        if (d3 > 0.9) {
                            n20 = 0;
                        }
                    }
                    d = d2;
                    if (j < 0 || n11 * n11 + n12 * n12 >= n6 * n6 || bl && (i + j & 1) == 0 || (n9 = class_09632.lIllllIIlIIIlIllllllIIIll[i + j * 128]) == (by = (byte)(class_16622.lIlIIllllIlIIIIllIIIIlIIl * 4 + n20))) continue;
                    if (n7 > j) {
                        n7 = j;
                    }
                    if (n8 < j) {
                        n8 = j;
                    }
                    class_09632.lIllllIIlIIIlIllllllIIIll[i + j * 128] = by;
                }
                if (n7 > n8) continue;
                class_09632.lllIIIllIIIIlllIlIIllIIll(i, n7, n8);
            }
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, class_1334 class_13342, class_1521 class_15212, int n, boolean bl) {
        if (!class_13342.IllIIIIllIIllIllIlllIlIIl) {
            class_0963 class_09632 = this.lllIIIllIIIIlllIlIIllIIll(class_08972, class_13342);
            if (class_15212 instanceof class_0814) {
                class_0814 class_08142 = (class_0814)class_15212;
                class_09632.lllIIIllIIIIlllIlIIllIIll(class_08142, class_08972);
            }
            if (bl) {
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_15212, class_09632);
            }
        }
    }

    @Override
    public class_0703 lIlllIlllIIIIlIIlllIllIII(ItemStack class_08972, class_1334 class_13342, class_0814 class_08142) {
        byte[] arrby = this.lllIIIllIIIIlllIlIIllIIll(class_08972, class_13342).lllIIIllIIIIlllIlIIllIIll(class_08972, class_13342, class_08142);
        return arrby == null ? null : new class_1732(class_08972.IllIIIllIIIIlIlIlIllIIlll(), arrby);
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl(ItemStack class_08972, class_1334 class_13342, class_0814 class_08142) {
        if (class_08972.IlIlIIlIlIllIIlIlIIllIIIl() && class_08972.lllllIlllIIllIlIIlIIIllII().lllIIlIIIllllllIIIIlIlIlI("map_is_scaling")) {
            class_0963 class_09632 = Items.IIIIIlllIIllllIlllIlllIIl.lllIIIllIIIIlllIlIIllIIll(class_08972, class_13342);
            class_08972.lllIlIIlIIIlIlIIIllIlllIl(class_13342.IlIllllllIIlIIllllIIlIIIl("map"));
            class_0963 class_09633 = new class_0963("map_" + class_08972.IllIIIllIIIIlIlIlIllIIlll());
            class_09633.IlIIIIIllllllIIlllIllllll = (byte)(class_09632.IlIIIIIllllllIIlllIllllll + 1);
            if (class_09633.IlIIIIIllllllIIlllIllllll > 4) {
                class_09633.IlIIIIIllllllIIlllIllllll = (byte)4;
            }
            class_09633.lllIlIIlIIIlIlIIIllIlllIl = class_09632.lllIlIIlIIIlIlIIIllIlllIl;
            class_09633.IlIllllllIIlIIllllIIlIIIl = class_09632.IlIllllllIIlIIllllIIlIIIl;
            class_09633.lIlllIlllIIIIlIIlllIllIII = class_09632.lIlllIlllIIIIlIIlllIllIII;
            class_09633.lIlllIlllIIIIlIIlllIllIII();
            class_13342.lllIIIllIIIIlllIlIIllIIll("map_" + class_08972.IllIIIllIIIIlIlIlIllIIlll(), class_09633);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, class_0814 class_08142, List list, boolean bl) {
        class_0963 class_09632 = this.lllIIIllIIIIlllIlIIllIIll(class_08972, class_08142.lIlIllIIlIIlIIlIIlIIlIIll);
        if (bl) {
            if (class_09632 == null) {
                list.add("Unknown map");
            } else {
                list.add("Scaling at 1:" + (1 << class_09632.IlIIIIIllllllIIlllIllllll));
                list.add("(Level " + class_09632.IlIIIIIllllllIIlllIllllll + "/" + 4 + ")");
            }
        }
    }
}

