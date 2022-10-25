package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import java.util.ArrayList;

public class class_0998
implements class_2098 {
    private ItemStack lllIIIllIIIIlllIlIIllIIll;

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_0013 class_00132, class_1334 class_13342) {
        Object object;
        this.lllIIIllIIIIlllIlIIllIIll = null;
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        for (int i = 0; i < class_00132.IlIIIIIllllllIIlllIllllll(); ++i) {
            object = class_00132.llIIllIllIlIIlIIllIllllll(i);
            if (object == null) continue;
            if (((ItemStack)object).lllIIIllIIIIlllIlIIllIIll() == Items.IlIlIIlllIllllllllIIIlIlI) {
                ++n2;
                continue;
            }
            if (((ItemStack)object).lllIIIllIIIIlllIlIIllIIll() == Items.llIlllllIIlIIlIIllllIllll) {
                ++n4;
                continue;
            }
            if (((ItemStack)object).lllIIIllIIIIlllIlIIllIIll() == Items.dye) {
                ++n3;
                continue;
            }
            if (((ItemStack)object).lllIIIllIIIIlllIlIIllIIll() == Items.IIIIIllIlIllIlIlIIlIllIIl) {
                ++n;
                continue;
            }
            if (((ItemStack)object).lllIIIllIIIIlllIlIIllIIll() == Items.IIIIIIlIIIIIIIIIIlIlIlIlI) {
                ++n5;
                continue;
            }
            if (((ItemStack)object).lllIIIllIIIIlllIlIIllIIll() == Items.diamond) {
                ++n5;
                continue;
            }
            if (((ItemStack)object).lllIIIllIIIIlllIlIIllIIll() == Items.fire_charge) {
                ++n6;
                continue;
            }
            if (((ItemStack)object).lllIIIllIIIIlllIlIIllIIll() == Items.IIIIlIllIlIIlIIlIllIlIlll) {
                ++n6;
                continue;
            }
            if (((ItemStack)object).lllIIIllIIIIlllIlIIllIIll() == Items.llIllIlllIllIlIIIIlIIlIII) {
                ++n6;
                continue;
            }
            if (((ItemStack)object).lllIIIllIIIIlllIlIIllIIll() != Items.skull) {
                return false;
            }
            ++n6;
        }
        n5 += n3 + n6;
        if (n2 <= 3 && n <= 1) {
            if (n2 >= 1 && n == 1 && n5 == 0) {
                this.lllIIIllIIIIlllIlIIllIIll = new ItemStack(Items.fireworks);
                if (n4 > 0) {
                    class_0775 class_07752 = new class_0775();
                    object = new class_0775();
                    class_2145 class_21452 = new class_2145();
                    for (int i = 0; i < class_00132.IlIIIIIllllllIIlllIllllll(); ++i) {
                        ItemStack class_08972 = class_00132.llIIllIllIlIIlIIllIllllll(i);
                        if (class_08972 == null || class_08972.lllIIIllIIIIlllIlIIllIIll() != Items.llIlllllIIlIIlIIllllIllll || !class_08972.IlIlIIlIlIllIIlIlIIllIIIl() || !class_08972.lllllIlllIIllIlIIlIIIllII().lllIlIIlIIIlIlIIIllIlllIl("Explosion", 10)) continue;
                        class_21452.lllIIIllIIIIlllIlIIllIIll(class_08972.lllllIlllIIllIlIIlIIIllII().llIIllIllIlIIlIIllIllllll("Explosion"));
                    }
                    ((class_0775)object).lllIIIllIIIIlllIlIIllIIll("Explosions", class_21452);
                    ((class_0775)object).lllIIIllIIIIlllIlIIllIIll("Flight", (byte)n2);
                    class_07752.lllIIIllIIIIlllIlIIllIIll("Fireworks", (class_2037)object);
                    this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII(class_07752);
                }
                return true;
            }
            if (n2 == 1 && n == 0 && n4 == 0 && n3 > 0 && n6 <= 1) {
                this.lllIIIllIIIIlllIlIIllIIll = new ItemStack(Items.llIlllllIIlIIlIIllllIllll);
                class_0775 class_07753 = new class_0775();
                object = new class_0775();
                int n7 = 0;
                ArrayList<Integer> arrayList = new ArrayList<Integer>();
                for (int i = 0; i < class_00132.IlIIIIIllllllIIlllIllllll(); ++i) {
                    ItemStack class_08973 = class_00132.llIIllIllIlIIlIIllIllllll(i);
                    if (class_08973 == null) continue;
                    if (class_08973.lllIIIllIIIIlllIlIIllIIll() == Items.dye) {
                        arrayList.add(class_1908.lIIIIlIlIIlllllIIllIIlIII[class_08973.IllIIIllIIIIlIlIlIllIIlll()]);
                        continue;
                    }
                    if (class_08973.lllIIIllIIIIlllIlIIllIIll() == Items.IIIIIIlIIIIIIIIIIlIlIlIlI) {
                        ((class_0775)object).lllIIIllIIIIlllIlIIllIIll("Flicker", true);
                        continue;
                    }
                    if (class_08973.lllIIIllIIIIlllIlIIllIIll() == Items.diamond) {
                        ((class_0775)object).lllIIIllIIIIlllIlIIllIIll("Trail", true);
                        continue;
                    }
                    if (class_08973.lllIIIllIIIIlllIlIIllIIll() == Items.fire_charge) {
                        n7 = 1;
                        continue;
                    }
                    if (class_08973.lllIIIllIIIIlllIlIIllIIll() == Items.IIIIlIllIlIIlIIlIllIlIlll) {
                        n7 = 4;
                        continue;
                    }
                    if (class_08973.lllIIIllIIIIlllIlIIllIIll() == Items.llIllIlllIllIlIIIIlIIlIII) {
                        n7 = 2;
                        continue;
                    }
                    if (class_08973.lllIIIllIIIIlllIlIIllIIll() != Items.skull) continue;
                    n7 = 3;
                }
                int[] arrn = new int[arrayList.size()];
                for (int i = 0; i < arrn.length; ++i) {
                    arrn[i] = (Integer)arrayList.get(i);
                }
                ((class_0775)object).lllIIIllIIIIlllIlIIllIIll("Colors", arrn);
                ((class_0775)object).lllIIIllIIIIlllIlIIllIIll("Type", (byte)n7);
                class_07753.lllIIIllIIIIlllIlIIllIIll("Explosion", (class_2037)object);
                this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII(class_07753);
                return true;
            }
            if (n2 == 0 && n == 0 && n4 == 1 && n3 > 0 && n3 == n5) {
                ArrayList<Integer> arrayList = new ArrayList<Integer>();
                for (int i = 0; i < class_00132.IlIIIIIllllllIIlllIllllll(); ++i) {
                    ItemStack class_08974 = class_00132.llIIllIllIlIIlIIllIllllll(i);
                    if (class_08974 == null) continue;
                    if (class_08974.lllIIIllIIIIlllIlIIllIIll() == Items.dye) {
                        arrayList.add(class_1908.lIIIIlIlIIlllllIIllIIlIII[class_08974.IllIIIllIIIIlIlIlIllIIlll()]);
                        continue;
                    }
                    if (class_08974.lllIIIllIIIIlllIlIIllIIll() != Items.llIlllllIIlIIlIIllllIllll) continue;
                    this.lllIIIllIIIIlllIlIIllIIll = class_08974.llIIlllIllIllllIIIlIIIIII();
                    this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl = 1;
                }
                int[] arrn = new int[arrayList.size()];
                for (int i = 0; i < arrn.length; ++i) {
                    arrn[i] = (Integer)arrayList.get(i);
                }
                if (this.lllIIIllIIIIlllIlIIllIIll != null && this.lllIIIllIIIIlllIlIIllIIll.IlIlIIlIlIllIIlIlIIllIIIl()) {
                    class_0775 class_07754 = this.lllIIIllIIIIlllIlIIllIIll.lllllIlllIIllIlIIlIIIllII().llIIllIllIlIIlIIllIllllll("Explosion");
                    if (class_07754 == null) {
                        return false;
                    }
                    class_07754.lllIIIllIIIIlllIlIIllIIll("FadeColors", arrn);
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public ItemStack lllIIIllIIIIlllIlIIllIIll(class_0013 class_00132) {
        return this.lllIIIllIIIIlllIlIIllIIll.llIIlllIllIllllIIIlIIIIII();
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll() {
        return 10;
    }

    @Override
    public ItemStack lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }
}

