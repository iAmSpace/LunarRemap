package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.stats.AchievementList;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;

import java.util.Random;

public class class_1710
extends class_2257 {
    protected class_1710() {
        super(class_1855.lllllIlllIIllIlIIlIIIllII);
        this.lllIIIllIIIIlllIlIIllIIll(0.25f, 0.0f, 0.25f, 0.75f, 0.5f, 0.75f);
    }

    @Override
    public int lIIIIlIlIIlllllIIllIIlIII() {
        return -1;
    }

    @Override
    public boolean IlIlllIIIIIIlIIllIIllIlll() {
        return false;
    }

    @Override
    public boolean IllIIIllIIIIlIlIlIllIIlll() {
        return false;
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl(class_1843 class_18432, int n, int n2, int n3) {
        int n4 = class_18432.IlIllllllIIlIIllllIIlIIIl(n, n2, n3) & 7;
        switch (n4) {
            default: {
                this.lllIIIllIIIIlllIlIIllIIll(0.25f, 0.0f, 0.25f, 0.75f, 0.5f, 0.75f);
                break;
            }
            case 2: {
                this.lllIIIllIIIIlllIlIIllIIll(0.25f, 0.25f, 0.5f, 0.75f, 0.75f, 1.0f);
                break;
            }
            case 3: {
                this.lllIIIllIIIIlllIlIIllIIll(0.25f, 0.25f, 0.0f, 0.75f, 0.75f, 0.5f);
                break;
            }
            case 4: {
                this.lllIIIllIIIIlllIlIIllIIll(0.5f, 0.25f, 0.25f, 1.0f, 0.75f, 0.75f);
                break;
            }
            case 5: {
                this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.25f, 0.25f, 0.5f, 0.75f, 0.75f);
            }
        }
    }

    @Override
    public class_1974 IlIllllllIIlIIllllIIlIIIl(class_1334 class_13342, int n, int n2, int n3) {
        this.IlIllllllIIlIIllllIIlIIIl((class_1843)class_13342, n, n2, n3);
        return super.IlIllllllIIlIIllllIIlIIIl(class_13342, n, n2, n3);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_1965 class_19652, ItemStack class_08972) {
        int n4 = MathHelper.IlIllllllIIlIIllllIIlIIIl((double)(class_19652.IIIIlIllIlIIlIIlIllIlIlll * 4.0f / 360.0f) + 2.5) & 3;
        class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n4, 2);
    }

    @Override
    public class_1774 lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n) {
        return new class_0090();
    }

    @Override
    public Item IIIllIIlIIIIIIlIlIIllIIlI(class_1334 class_13342, int n, int n2, int n3) {
        return Items.skull;
    }

    @Override
    public int IllIIlllllllIIlIIlIIIIlIl(class_1334 class_13342, int n, int n2, int n3) {
        class_1774 class_17742 = class_13342.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3);
        return class_17742 != null && class_17742 instanceof class_0090 ? ((class_0090)class_17742).IlIIIIIllllllIIlllIllllll() : super.IllIIlllllllIIlIIlIIIIlIl(class_13342, n, n2, n3);
    }

    @Override
    public int IlIIIIIllllllIIlllIllllll(int n) {
        return n;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, int n4, float f, int n5) {
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, int n4, class_0814 class_08142) {
        if (class_08142.lIIlIlIlIlIllIIlIIllllIll.lIlllIlllIIIIlIIlllIllIII) {
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n4 |= 8, 4);
        }
        super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, n4, class_08142);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Block class_05492, int n4) {
        if (!class_13342.IllIIIIllIIllIllIlllIlIIl) {
            if ((n4 & 8) == 0) {
                ItemStack class_08972 = new ItemStack(Items.skull, 1, this.IllIIlllllllIIlIIlIIIIlIl(class_13342, n, n2, n3));
                class_0090 class_00902 = (class_0090)class_13342.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3);
                if (class_00902.IlIIIIIllllllIIlllIllllll() == 3 && class_00902.lllIIIllIIIIlllIlIIllIIll() != null) {
                    class_08972.lIlllIlllIIIIlIIlllIllIII(new class_0775());
                    class_0775 class_07752 = new class_0775();
                    class_0860.lllIIIllIIIIlllIlIIllIIll(class_07752, class_00902.lllIIIllIIIIlllIlIIllIIll());
                    class_08972.lllllIlllIIllIlIIlIIIllII().lllIIIllIIIIlllIlIIllIIll("SkullOwner", class_07752);
                }
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_08972);
            }
            super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_05492, n4);
        }
    }

    @Override
    public Item lllIIIllIIIIlllIlIIllIIll(int n, Random random, int n2) {
        return Items.skull;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_0090 class_00902) {
        if (class_00902.IlIIIIIllllllIIlllIllllll() == 1 && n2 >= 2 && class_13342.IlIlIIlIlIllIIlIlIIllIIIl != class_1999.lllIIIllIIIIlllIlIIllIIll && !class_13342.IllIIIIllIIllIllIlllIlIIl) {
            int n4;
            for (n4 = -2; n4 <= 0; ++n4) {
                if (class_13342.a_(n, n2 - 1, n3 + n4) != Blocks.llIllllIIIIIlIIlIlllIIlll || class_13342.a_(n, n2 - 1, n3 + n4 + 1) != Blocks.llIllllIIIIIlIIlIlllIIlll || class_13342.a_(n, n2 - 2, n3 + n4 + 1) != Blocks.llIllllIIIIIlIIlIlllIIlll || class_13342.a_(n, n2 - 1, n3 + n4 + 2) != Blocks.llIllllIIIIIlIIlIlllIIlll || !this.IIIllIIlIIIIIIlIlIIllIIlI(class_13342, n, n2, n3 + n4, 1) || !this.IIIllIIlIIIIIIlIlIIllIIlI(class_13342, n, n2, n3 + n4 + 1, 1) || !this.IIIllIIlIIIIIIlIlIIllIIlI(class_13342, n, n2, n3 + n4 + 2, 1)) continue;
                class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3 + n4, 8, 2);
                class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3 + n4 + 1, 8, 2);
                class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3 + n4 + 2, 8, 2);
                class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3 + n4, class_1710.lllIIIllIIIIlllIlIIllIIll(0), 0, 2);
                class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3 + n4 + 1, class_1710.lllIIIllIIIIlllIlIIllIIll(0), 0, 2);
                class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3 + n4 + 2, class_1710.lllIIIllIIIIlllIlIIllIIll(0), 0, 2);
                class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2 - 1, n3 + n4, class_1710.lllIIIllIIIIlllIlIIllIIll(0), 0, 2);
                class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2 - 1, n3 + n4 + 1, class_1710.lllIIIllIIIIlllIlIIllIIll(0), 0, 2);
                class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2 - 1, n3 + n4 + 2, class_1710.lllIIIllIIIIlllIlIIllIIll(0), 0, 2);
                class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2 - 2, n3 + n4 + 1, class_1710.lllIIIllIIIIlllIlIIllIIll(0), 0, 2);
                if (!class_13342.IllIIIIllIIllIllIlllIlIIl) {
                    class_0590 class_05902 = new class_0590(class_13342);
                    class_05902.lllIlIIlIIIlIlIIIllIlllIl((double)n + 0.5, (double)n2 - 1.45, (double)(n3 + n4) + 1.5, 90.0f, 0.0f);
                    class_05902.lllllIllllIIIIllIIlIlIlII = 90.0f;
                    class_05902.lllIIIlIllIlllIlIIllIllIl();
                    if (!class_13342.IllIIIIllIIllIllIlllIlIIl) {
                        for (class_0814 class_08142 : class_13342.lllIIIllIIIIlllIlIIllIIll(class_0814.class, class_05902.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl(50.0, 50.0, 50.0))) {
                            class_08142.lllIIIllIIIIlllIlIIllIIll(AchievementList.field_150963_I);
                        }
                    }
                    class_13342.lllIIIllIIIIlllIlIIllIIll(class_05902);
                }
                for (int i = 0; i < 120; ++i) {
                    class_13342.lllIIIllIIIIlllIlIIllIIll("snowballpoof", (double)n + class_13342.lllllIlllIIllIlIIlIIIllII.nextDouble(), (double)(n2 - 2) + class_13342.lllllIlllIIllIlIIlIIIllII.nextDouble() * 3.9, (double)(n3 + n4 + 1) + class_13342.lllllIlllIIllIlIIlIIIllII.nextDouble(), 0.0, 0.0, 0.0);
                }
                class_13342.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3 + n4, class_1710.lllIIIllIIIIlllIlIIllIIll(0));
                class_13342.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3 + n4 + 1, class_1710.lllIIIllIIIIlllIlIIllIIll(0));
                class_13342.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3 + n4 + 2, class_1710.lllIIIllIIIIlllIlIIllIIll(0));
                class_13342.lllIlIIlIIIlIlIIIllIlllIl(n, n2 - 1, n3 + n4, class_1710.lllIIIllIIIIlllIlIIllIIll(0));
                class_13342.lllIlIIlIIIlIlIIIllIlllIl(n, n2 - 1, n3 + n4 + 1, class_1710.lllIIIllIIIIlllIlIIllIIll(0));
                class_13342.lllIlIIlIIIlIlIIIllIlllIl(n, n2 - 1, n3 + n4 + 2, class_1710.lllIIIllIIIIlllIlIIllIIll(0));
                class_13342.lllIlIIlIIIlIlIIIllIlllIl(n, n2 - 2, n3 + n4 + 1, class_1710.lllIIIllIIIIlllIlIIllIIll(0));
                return;
            }
            for (n4 = -2; n4 <= 0; ++n4) {
                if (class_13342.a_(n + n4, n2 - 1, n3) != Blocks.llIllllIIIIIlIIlIlllIIlll || class_13342.a_(n + n4 + 1, n2 - 1, n3) != Blocks.llIllllIIIIIlIIlIlllIIlll || class_13342.a_(n + n4 + 1, n2 - 2, n3) != Blocks.llIllllIIIIIlIIlIlllIIlll || class_13342.a_(n + n4 + 2, n2 - 1, n3) != Blocks.llIllllIIIIIlIIlIlllIIlll || !this.IIIllIIlIIIIIIlIlIIllIIlI(class_13342, n + n4, n2, n3, 1) || !this.IIIllIIlIIIIIIlIlIIllIIlI(class_13342, n + n4 + 1, n2, n3, 1) || !this.IIIllIIlIIIIIIlIlIIllIIlI(class_13342, n + n4 + 2, n2, n3, 1)) continue;
                class_13342.lllIIIllIIIIlllIlIIllIIll(n + n4, n2, n3, 8, 2);
                class_13342.lllIIIllIIIIlllIlIIllIIll(n + n4 + 1, n2, n3, 8, 2);
                class_13342.lllIIIllIIIIlllIlIIllIIll(n + n4 + 2, n2, n3, 8, 2);
                class_13342.lllIIIllIIIIlllIlIIllIIll(n + n4, n2, n3, class_1710.lllIIIllIIIIlllIlIIllIIll(0), 0, 2);
                class_13342.lllIIIllIIIIlllIlIIllIIll(n + n4 + 1, n2, n3, class_1710.lllIIIllIIIIlllIlIIllIIll(0), 0, 2);
                class_13342.lllIIIllIIIIlllIlIIllIIll(n + n4 + 2, n2, n3, class_1710.lllIIIllIIIIlllIlIIllIIll(0), 0, 2);
                class_13342.lllIIIllIIIIlllIlIIllIIll(n + n4, n2 - 1, n3, class_1710.lllIIIllIIIIlllIlIIllIIll(0), 0, 2);
                class_13342.lllIIIllIIIIlllIlIIllIIll(n + n4 + 1, n2 - 1, n3, class_1710.lllIIIllIIIIlllIlIIllIIll(0), 0, 2);
                class_13342.lllIIIllIIIIlllIlIIllIIll(n + n4 + 2, n2 - 1, n3, class_1710.lllIIIllIIIIlllIlIIllIIll(0), 0, 2);
                class_13342.lllIIIllIIIIlllIlIIllIIll(n + n4 + 1, n2 - 2, n3, class_1710.lllIIIllIIIIlllIlIIllIIll(0), 0, 2);
                if (!class_13342.IllIIIIllIIllIllIlllIlIIl) {
                    class_0590 class_05903 = new class_0590(class_13342);
                    class_05903.lllIlIIlIIIlIlIIIllIlllIl((double)(n + n4) + 1.5, (double)n2 - 1.45, (double)n3 + 0.5, 0.0f, 0.0f);
                    class_05903.lllIIIlIllIlllIlIIllIllIl();
                    if (!class_13342.IllIIIIllIIllIllIlllIlIIl) {
                        for (class_0814 class_08143 : class_13342.lllIIIllIIIIlllIlIIllIIll(class_0814.class, class_05903.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl(50.0, 50.0, 50.0))) {
                            class_08143.lllIIIllIIIIlllIlIIllIIll(AchievementList.field_150963_I);
                        }
                    }
                    class_13342.lllIIIllIIIIlllIlIIllIIll(class_05903);
                }
                for (int i = 0; i < 120; ++i) {
                    class_13342.lllIIIllIIIIlllIlIIllIIll("snowballpoof", (double)(n + n4 + 1) + class_13342.lllllIlllIIllIlIIlIIIllII.nextDouble(), (double)(n2 - 2) + class_13342.lllllIlllIIllIlIIlIIIllII.nextDouble() * 3.9, (double)n3 + class_13342.lllllIlllIIllIlIIlIIIllII.nextDouble(), 0.0, 0.0, 0.0);
                }
                class_13342.lllIlIIlIIIlIlIIIllIlllIl(n + n4, n2, n3, class_1710.lllIIIllIIIIlllIlIIllIIll(0));
                class_13342.lllIlIIlIIIlIlIIIllIlllIl(n + n4 + 1, n2, n3, class_1710.lllIIIllIIIIlllIlIIllIIll(0));
                class_13342.lllIlIIlIIIlIlIIIllIlllIl(n + n4 + 2, n2, n3, class_1710.lllIIIllIIIIlllIlIIllIIll(0));
                class_13342.lllIlIIlIIIlIlIIIllIlllIl(n + n4, n2 - 1, n3, class_1710.lllIIIllIIIIlllIlIIllIIll(0));
                class_13342.lllIlIIlIIIlIlIIIllIlllIl(n + n4 + 1, n2 - 1, n3, class_1710.lllIIIllIIIIlllIlIIllIIll(0));
                class_13342.lllIlIIlIIIlIlIIIllIlllIl(n + n4 + 2, n2 - 1, n3, class_1710.lllIIIllIIIIlllIlIIllIIll(0));
                class_13342.lllIlIIlIIIlIlIIIllIlllIl(n + n4 + 1, n2 - 2, n3, class_1710.lllIIIllIIIIlllIlIIllIIll(0));
                return;
            }
        }
    }

    private boolean IIIllIIlIIIIIIlIlIIllIIlI(class_1334 class_13342, int n, int n2, int n3, int n4) {
        if (class_13342.a_(n, n2, n3) != this) {
            return false;
        }
        class_1774 class_17742 = class_13342.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3);
        return class_17742 != null && class_17742 instanceof class_0090 ? ((class_0090)class_17742).IlIIIIIllllllIIlllIllllll() == n4 : false;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
    }

    @Override
    public IIcon lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        return Blocks.llIllllIIIIIlIIlIlllIIlll.lIlllIlllIIIIlIIlllIllIII(n);
    }

    @Override
    public String lIlIIllllIlIIIIllIIIIlIIl() {
        return this.llllllIlIllllIlIlIlIIIIlI() + "_" + class_0946.IIIllIllIIlIlIlIlIllllIIl[0];
    }
}

