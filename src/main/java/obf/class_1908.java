package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;

import java.util.List;

public class class_1908
extends Item {
    public static final String[] IIIllIllIIlIlIlIlIllllIIl = new String[]{"black", "red", "green", "brown", "blue", "purple", "cyan", "silver", "gray", "pink", "lime", "yellow", "lightBlue", "magenta", "orange", "white"};
    public static final String[] IllIIIllIIIIlIlIlIllIIlll = new String[]{"black", "red", "green", "brown", "blue", "purple", "cyan", "silver", "gray", "pink", "lime", "yellow", "light_blue", "magenta", "orange", "white"};
    public static final int[] lIIIIlIlIIlllllIIllIIlIII = new int[]{0x1E1B1B, 11743532, 3887386, 5320730, 2437522, 8073150, 2651799, 0xABABAB, 0x434343, 14188952, 4312372, 14602026, 6719955, 12801229, 15435844, 0xF0F0F0};
    private IIcon[] llIIlllIllIllllIIIlIIIIII;

    public class_1908() {
        this.lllIIIllIIIIlllIlIIllIIll(true);
        this.IlIIIIIllllllIIlllIllllll(0);
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.llIIlllIllIllllIIIlIIIIII);
    }

    @Override
    public IIcon IlIllllllIIlIIllllIIlIIIl(int n) {
        int n2 = MathHelper.lllIIIllIIIIlllIlIIllIIll(n, 0, 15);
        return this.llIIlllIllIllllIIIlIIIIII[n2];
    }

    @Override
    public String IlIllllllIIlIIllllIIlIIIl(ItemStack class_08972) {
        int n = MathHelper.lllIIIllIIIIlllIlIIllIIll(class_08972.IllIIIllIIIIlIlIlIllIIlll(), 0, 15);
        return super.IllIIIllIIIIlIlIlIllIIlll() + "." + IIIllIllIIlIlIlIlIllllIIl[n];
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, class_0814 class_08142, class_1334 class_13342, int n, int n2, int n3, int n4, float f, float f2, float f3) {
        if (!class_08142.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n4, class_08972)) {
            return false;
        }
        if (class_08972.IllIIIllIIIIlIlIlIllIIlll() == 15) {
            if (class_1908.lllIIIllIIIIlllIlIIllIIll(class_08972, class_13342, n, n2, n3)) {
                if (!class_13342.IllIIIIllIIllIllIlllIlIIl) {
                    class_13342.IlIllllllIIlIIllllIIlIIIl(2005, n, n2, n3, 0);
                }
                return true;
            }
        } else if (class_08972.IllIIIllIIIIlIlIlIllIIlll() == 3) {
            Block class_05492 = class_13342.a_(n, n2, n3);
            int n5 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
            if (class_05492 == Blocks.log && class_1975.IIIllIllIIlIlIlIlIllllIIl(n5) == 3) {
                if (n4 == 0) {
                    return false;
                }
                if (n4 == 1) {
                    return false;
                }
                if (n4 == 2) {
                    --n3;
                }
                if (n4 == 3) {
                    ++n3;
                }
                if (n4 == 4) {
                    --n;
                }
                if (n4 == 5) {
                    ++n;
                }
                if (class_13342.lIlllIlllIIIIlIIlllIllIII(n, n2, n3)) {
                    int n6 = Blocks.lIIlIIIlIlIIlllIlIllIllIl.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, n4, f, f2, f3, 0);
                    class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, Blocks.lIIlIIIlIlIIlllIlIllIllIl, n6, 2);
                    if (!class_08142.lIIlIlIlIlIllIIlIIllllIll.lIlllIlllIIIIlIIlllIllIII) {
                        --class_08972.lllIlIIlIIIlIlIIIllIlllIl;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static boolean lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, class_1334 class_13342, int n, int n2, int n3) {
        class_0588 class_05882;
        Block class_05492 = class_13342.a_(n, n2, n3);
        if (class_05492 instanceof class_0588 && (class_05882 = (class_0588)((Object)class_05492)).lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_13342.IllIIIIllIIllIllIlllIlIIl)) {
            if (!class_13342.IllIIIIllIIllIllIlllIlIIl) {
                if (class_05882.lllIIIllIIIIlllIlIIllIIll(class_13342, class_13342.lllllIlllIIllIlIIlIIIllII, n, n2, n3)) {
                    class_05882.lllIlIIlIIIlIlIIIllIlllIl(class_13342, class_13342.lllllIlllIIllIlIIlIIIllII, n, n2, n3);
                }
                --class_08972.lllIlIIlIIIlIlIIIllIlllIl;
            }
            return true;
        }
        return false;
    }

    public static void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, int n4) {
        Block class_05492;
        if (n4 == 0) {
            n4 = 15;
        }
        if ((class_05492 = class_13342.a_(n, n2, n3)).lIllllIIlIIIlIllllllIIIll() != class_1855.lllIIIllIIIIlllIlIIllIIll) {
            class_05492.IlIllllllIIlIIllllIIlIIIl((class_1843)class_13342, n, n2, n3);
            for (int i = 0; i < n4; ++i) {
                double d = IlIllllllIIlIIllllIIlIIIl.nextGaussian() * 0.02;
                double d2 = IlIllllllIIlIIllllIIlIIIl.nextGaussian() * 0.02;
                double d3 = IlIllllllIIlIIllllIIlIIIl.nextGaussian() * 0.02;
                class_13342.lllIIIllIIIIlllIlIIllIIll("happyVillager", (double)((float)n + IlIllllllIIlIIllllIIlIIIl.nextFloat()), (double)n2 + (double)IlIllllllIIlIIllllIIlIIIl.nextFloat() * class_05492.IlIIIlIIIIllIIIllIIIIIIll(), (double)((float)n3 + IlIllllllIIlIIllllIIlIIIl.nextFloat()), d, d2, d3);
            }
        }
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, class_0814 class_08142, class_1965 class_19652) {
        if (class_19652 instanceof class_1317) {
            class_1317 class_13172 = (class_1317)class_19652;
            int n = class_0974.IllIIlllllllIIlIIlIIIIlIl(class_08972.IllIIIllIIIIlIlIlIllIIlll());
            if (!class_13172.lllIIIIlIIllIIIlIllIlllII() && class_13172.IIlIlIlIIlllIIIlIIIIlIIIl() != n) {
                class_13172.lIIlIIIIIlIlllIlIIlIlIlll(n);
                --class_08972.lllIlIIlIIIlIlIIIllIlllIl;
            }
            return true;
        }
        return false;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(Item class_06112, class_0931 class_09312, List list) {
        for (int i = 0; i < 16; ++i) {
            list.add(new ItemStack(class_06112, 1, i));
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
        this.llIIlllIllIllllIIIlIIIIII = new IIcon[IllIIIllIIIIlIlIlIllIIlll.length];
        for (int i = 0; i < IllIIIllIIIIlIlIlIllIIlll.length; ++i) {
            this.llIIlllIllIllllIIIlIIIIII[i] = class_08872.lllIIIllIIIIlllIlIIllIIll(this.lIlIlIIlIIIIlIIIIIlllIIII() + "_" + IllIIIllIIIIlIlIlIllIIlll[i]);
        }
    }
}

