package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;

import java.util.List;
import java.util.Random;

public class class_0706
extends Block {
    private IIcon llllllIlIllllIlIlIlIIIIlI;
    private IIcon lIlIIllllIlIIIIllIIIIlIIl;
    private IIcon llIlllIIllIlllIlIlIlIIIll;

    public class_0706() {
        super(class_1855.lIllllIIlIIIlIllllllIIIll);
    }

    @Override
    public IIcon lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        return n == 1 ? this.lIlIIllllIlIIIIllIIIIlIIl : (n == 0 ? this.llIlllIIllIlllIlIlIlIIIll : this.llIIIIllIIIIIIIlIIIlIIIIl);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
        this.llllllIlIllllIlIlIlIIIIlI = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_inner");
        this.lIlIIllllIlIIIIllIIIIlIIl = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_top");
        this.llIlllIIllIlllIlIlIlIIIll = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_bottom");
        this.llIIIIllIIIIIIIlIIIlIIIIl = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_side");
    }

    public static IIcon lIlllIlllIIIIlIIlllIllIII(String string) {
        return string.equals("inner") ? Blocks.lllIlIIllllIIllIIIIllIlIl.llllllIlIllllIlIlIlIIIIlI : (string.equals("bottom") ? Blocks.lllIlIIllllIIllIIIIllIlIl.llIlllIIllIlllIlIlIlIIIll : null);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_1974 class_19742, List list, class_1521 class_15212) {
        this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, 1.0f, 0.3125f, 1.0f);
        super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_19742, list, class_15212);
        float f = 0.125f;
        this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, f, 1.0f, 1.0f);
        super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_19742, list, class_15212);
        this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, f);
        super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_19742, list, class_15212);
        this.lllIIIllIIIIlllIlIIllIIll(1.0f - f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_19742, list, class_15212);
        this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 1.0f - f, 1.0f, 1.0f, 1.0f);
        super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_19742, list, class_15212);
        this.lIlllIlllIlIIIIlllIlIlIIl();
    }

    @Override
    public void lIlllIlllIlIIIIlllIlIlIIl() {
        this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }

    @Override
    public boolean IlIlllIIIIIIlIIllIIllIlll() {
        return false;
    }

    @Override
    public int lIIIIlIlIIlllllIIllIIlIII() {
        return 24;
    }

    @Override
    public boolean IllIIIllIIIIlIlIlIllIIlll() {
        return false;
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_1334 class_13342, int n, int n2, int n3, class_1521 class_15212) {
        int n4 = class_0706.IllIIlllllllIIlIIlIIIIlIl(class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3));
        float f = (float)n2 + (6.0f + (float)(3 * n4)) / 16.0f;
        if (!class_13342.IllIIIIllIIllIllIlllIlIIl && class_15212.llIIIIIlIIlIIIIllIIIlIIII() && n4 > 0 && class_15212.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl <= (double)f) {
            class_15212.IllllIIIIlIIlIIIIlllIIIIl();
            this.IIIllIIlIIIIIIlIlIIllIIlI(class_13342, n, n2, n3, n4 - 1);
        }
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_0814 class_08142, int n4, float f, float f2, float f3) {
        if (class_13342.IllIIIIllIIllIllIlllIlIIl) {
            return true;
        }
        ItemStack class_08972 = class_08142.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll();
        if (class_08972 == null) {
            return true;
        }
        int n5 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        int n6 = class_0706.IllIIlllllllIIlIIlIIIIlIl(n5);
        if (class_08972.lllIIIllIIIIlllIlIIllIIll() == Items.water_bucket) {
            if (n6 < 3) {
                if (!class_08142.lIIlIlIlIlIllIIlIIllllIll.lIlllIlllIIIIlIIlllIllIII) {
                    class_08142.lllIIlIIIllllllIIIIlIlIlI.lllIlIIlIIIlIlIIIllIlllIl(class_08142.lllIIlIIIllllllIIIIlIlIlI.IlIllllllIIlIIllllIIlIIIl, new ItemStack(Items.bucket));
                }
                this.IIIllIIlIIIIIIlIlIIllIIlI(class_13342, n, n2, n3, 3);
            }
            return true;
        }
        if (class_08972.lllIIIllIIIIlllIlIIllIIll() == Items.lIIlllIIIlIIlIllIIIIIlIlI) {
            if (n6 > 0) {
                if (!class_08142.lIIlIlIlIlIllIIlIIllllIll.lIlllIlllIIIIlIIlllIllIII) {
                    ItemStack class_08973 = new ItemStack(Items.potionitem, 1, 0);
                    if (!class_08142.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(class_08973)) {
                        class_13342.lllIIIllIIIIlllIlIIllIIll(new class_1781(class_13342, (double)n + 0.5, (double)n2 + 1.5, (double)n3 + 0.5, class_08973));
                    } else if (class_08142 instanceof class_1822) {
                        ((class_1822)class_08142).lllIIIllIIIIlllIlIIllIIll(class_08142.IlIlllIIIIIIlIIllIIllIlll);
                    }
                    --class_08972.lllIlIIlIIIlIlIIIllIlllIl;
                    if (class_08972.lllIlIIlIIIlIlIIIllIlllIl <= 0) {
                        class_08142.lllIIlIIIllllllIIIIlIlIlI.lllIlIIlIIIlIlIIIllIlllIl(class_08142.lllIIlIIIllllllIIIIlIlIlI.IlIllllllIIlIIllllIIlIIIl, null);
                    }
                }
                this.IIIllIIlIIIIIIlIlIIllIIlI(class_13342, n, n2, n3, n6 - 1);
            }
        } else if (n6 > 0 && class_08972.lllIIIllIIIIlllIlIIllIIll() instanceof ItemArmor && ((ItemArmor)class_08972.lllIIIllIIIIlllIlIIllIIll()).IlIIIlIIIIllIIIllIIIIIIll() == ArmorMaterial.CLOTH) {
            ItemArmor class_09812 = (ItemArmor)class_08972.lllIIIllIIIIlllIlIIllIIll();
            class_09812.IlIlllIIIIIIlIIllIIllIlll(class_08972);
            this.IIIllIIlIIIIIIlIlIIllIIlI(class_13342, n, n2, n3, n6 - 1);
            return true;
        }
        return false;
    }

    public void IIIllIIlIIIIIIlIlIIllIIlI(class_1334 class_13342, int n, int n2, int n3, int n4) {
        class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, MathHelper.lllIIIllIIIIlllIlIIllIIll(n4, 0, 3), 2);
        class_13342.lIllllIIlIIIlIllllllIIIll(n, n2, n3, this);
    }

    @Override
    public void IIIllIllIIlIlIlIlIllllIIl(class_1334 class_13342, int n, int n2, int n3) {
        int n4;
        if (class_13342.lllllIlllIIllIlIIlIIIllII.nextInt(20) == 1 && (n4 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3)) < 3) {
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n4 + 1, 2);
        }
    }

    @Override
    public Item lllIIIllIIIIlllIlIIllIIll(int n, Random random, int n2) {
        return Items.IIllIIIlIIllllIIIIIIIIlll;
    }

    @Override
    public Item IIIllIIlIIIIIIlIlIIllIIlI(class_1334 class_13342, int n, int n2, int n3) {
        return Items.IIllIIIlIIllllIIIIIIIIlll;
    }

    @Override
    public boolean IIllIllIIllIIlllIIIlIlllI() {
        return true;
    }

    @Override
    public int lIllllIIlIIIlIllllllIIIll(class_1334 class_13342, int n, int n2, int n3, int n4) {
        int n5 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        return class_0706.IllIIlllllllIIlIIlIIIIlIl(n5);
    }

    public static int IllIIlllllllIIlIIlIIIIlIl(int n) {
        return n;
    }

    public static float IIIllIllIIlIlIlIlIllllIIl(int n) {
        int n2 = MathHelper.lllIIIllIIIIlllIlIIllIIll(n, 0, 3);
        return (float)(6 + 3 * n2) / 16.0f;
    }
}

