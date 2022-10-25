package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

import java.util.List;
import java.util.Random;

public class class_1700
extends class_2257 {
    private final Random llllllIlIllllIlIlIlIIIIlI = new Random();
    private IIcon lIlIIllllIlIIIIllIIIIlIIl;
    private IIcon llIlllIIllIlllIlIlIlIIIll;
    private IIcon IIIIlIIlIIIllIIIIllIIIlII;

    public class_1700() {
        super(class_1855.lIllllIIlIIIlIllllllIIIll);
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.lIlllIlllIIIIlIIlllIllIII);
        this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl(class_1843 class_18432, int n, int n2, int n3) {
        this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_1974 class_19742, List list, class_1521 class_15212) {
        this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, 1.0f, 0.625f, 1.0f);
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
        this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, int n4, float f, float f2, float f3, int n5) {
        int n6 = class_0573.lllIIIllIIIIlllIlIIllIIll[n4];
        if (n6 == 1) {
            n6 = 0;
        }
        return n6;
    }

    @Override
    public class_1774 lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n) {
        return new class_0879();
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_1965 class_19652, ItemStack class_08972) {
        super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_19652, class_08972);
        if (class_08972.IlIIIlIIIIllIIIllIIIIIIll()) {
            class_0879 class_08792 = class_1700.IlIIIIIllllllIIlllIllllll(class_13342, n, n2, n3);
            class_08792.lllIIIllIIIIlllIlIIllIIll(class_08972.lIIlIIIIIlIlllIlIIlIlIlll());
        }
    }

    @Override
    public void lIlllIlllIIIIlIIlllIllIII(class_1334 class_13342, int n, int n2, int n3) {
        super.lIlllIlllIIIIlIIlllIllIII(class_13342, n, n2, n3);
        this.IllIIIllIIIIlIlIlIllIIlll(class_13342, n, n2, n3);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_0814 class_08142, int n4, float f, float f2, float f3) {
        if (class_13342.IllIIIIllIIllIllIlllIlIIl) {
            return true;
        }
        class_0879 class_08792 = class_1700.IlIIIIIllllllIIlllIllllll(class_13342, n, n2, n3);
        if (class_08792 != null) {
            class_08142.lllIIIllIIIIlllIlIIllIIll(class_08792);
        }
        return true;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Block class_05492) {
        this.IllIIIllIIIIlIlIlIllIIlll(class_13342, n, n2, n3);
    }

    private void IllIIIllIIIIlIlIlIllIIlll(class_1334 class_13342, int n, int n2, int n3) {
        boolean bl;
        int n4 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        int n5 = class_1700.IllIIlllllllIIlIIlIIIIlIl(n4);
        boolean bl2 = !class_13342.lIIlIIIIIlIlllIlIIlIlIlll(n, n2, n3);
        if (bl2 != (bl = class_1700.IIIllIllIIlIlIlIlIllllIIl(n4))) {
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n5 | (bl2 ? 0 : 8), 4);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Block class_05492, int n4) {
        class_0879 class_08792 = (class_0879)class_13342.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3);
        if (class_08792 != null) {
            for (int i = 0; i < class_08792.IlIIIIIllllllIIlllIllllll(); ++i) {
                ItemStack class_08972 = class_08792.llIIllIllIlIIlIIllIllllll(i);
                if (class_08972 == null) continue;
                float f = this.llllllIlIllllIlIlIlIIIIlI.nextFloat() * 0.8f + 0.1f;
                float f2 = this.llllllIlIllllIlIlIlIIIIlI.nextFloat() * 0.8f + 0.1f;
                float f3 = this.llllllIlIllllIlIlIlIIIIlI.nextFloat() * 0.8f + 0.1f;
                while (class_08972.lllIlIIlIIIlIlIIIllIlllIl > 0) {
                    int n5 = this.llllllIlIllllIlIlIlIIIIlI.nextInt(21) + 10;
                    if (n5 > class_08972.lllIlIIlIIIlIlIIIllIlllIl) {
                        n5 = class_08972.lllIlIIlIIIlIlIIIllIlllIl;
                    }
                    class_08972.lllIlIIlIIIlIlIIIllIlllIl -= n5;
                    class_1781 class_17812 = new class_1781(class_13342, (float)n + f, (float)n2 + f2, (float)n3 + f3, new ItemStack(class_08972.lllIIIllIIIIlllIlIIllIIll(), n5, class_08972.IllIIIllIIIIlIlIlIllIIlll()));
                    if (class_08972.IlIlIIlIlIllIIlIlIIllIIIl()) {
                        class_17812.lIlllIlllIIIIlIIlllIllIII().lIlllIlllIIIIlIIlllIllIII((class_0775)class_08972.lllllIlllIIllIlIIlIIIllII().lllIlIIlIIIlIlIIIllIlllIl());
                    }
                    float f4 = 0.05f;
                    class_17812.IIIIIIIIlIllIIllIIlllIllI = (float)this.llllllIlIllllIlIlIlIIIIlI.nextGaussian() * f4;
                    class_17812.IIlIIlIlIlIllIIlIlIIIIlll = (float)this.llllllIlIllllIlIlIlIIIIlI.nextGaussian() * f4 + 0.2f;
                    class_17812.llIIIlllIlllIlIllIIIIllIl = (float)this.llllllIlIllllIlIlIlIIIIlI.nextGaussian() * f4;
                    class_13342.lllIIIllIIIIlllIlIIllIIll(class_17812);
                }
            }
            class_13342.lIllllIIlIIIlIllllllIIIll(n, n2, n3, class_05492);
        }
        super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_05492, n4);
    }

    @Override
    public int lIIIIlIlIIlllllIIllIIlIII() {
        return 38;
    }

    @Override
    public boolean IllIIIllIIIIlIlIlIllIIlll() {
        return false;
    }

    @Override
    public boolean IlIlllIIIIIIlIIllIIllIlll() {
        return false;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1843 class_18432, int n, int n2, int n3, int n4) {
        return true;
    }

    @Override
    public IIcon lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        return n == 1 ? this.llIlllIIllIlllIlIlIlIIIll : this.lIlIIllllIlIIIIllIIIIlIIl;
    }

    public static int IllIIlllllllIIlIIlIIIIlIl(int n) {
        return n & 7;
    }

    public static boolean IIIllIllIIlIlIlIlIllllIIl(int n) {
        return (n & 8) != 8;
    }

    @Override
    public boolean IIllIllIIllIIlllIIIlIlllI() {
        return true;
    }

    @Override
    public int lIllllIIlIIIlIllllllIIIll(class_1334 class_13342, int n, int n2, int n3, int n4) {
        return class_1071.lllIlIIlIIIlIlIIIllIlllIl(class_1700.IlIIIIIllllllIIlllIllllll(class_13342, n, n2, n3));
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
        this.lIlIIllllIlIIIIllIIIIlIIl = class_08872.lllIIIllIIIIlllIlIIllIIll("hopper_outside");
        this.llIlllIIllIlllIlIlIlIIIll = class_08872.lllIIIllIIIIlllIlIIllIIll("hopper_top");
        this.IIIIlIIlIIIllIIIIllIIIlII = class_08872.lllIIIllIIIIlllIlIIllIIll("hopper_inside");
    }

    public static IIcon lIlllIlllIIIIlIIlllIllIII(String string) {
        return string.equals("hopper_outside") ? Blocks.llllIllllllIllIIIlIlIIllI.lIlIIllllIlIIIIllIIIIlIIl : (string.equals("hopper_inside") ? Blocks.llllIllllllIllIIIlIlIIllI.IIIIlIIlIIIllIIIIllIIIlII : null);
    }

    @Override
    public String lIlIIllllIlIIIIllIIIIlIIl() {
        return "hopper";
    }

    public static class_0879 IlIIIIIllllllIIlllIllllll(class_1843 class_18432, int n, int n2, int n3) {
        return (class_0879)class_18432.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3);
    }
}

