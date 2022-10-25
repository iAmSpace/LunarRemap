package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;

import java.util.List;

public class class_0628
extends class_0351 {
    public static final String[] llllllIlIllllIlIlIlIIIIlI = new String[]{"intact", "slightlyDamaged", "veryDamaged"};
    private static final String[] IIIIlIIlIIIllIIIIllIIIlII = new String[]{"anvil_top_damaged_0", "anvil_top_damaged_1", "anvil_top_damaged_2"};
    public int lIlIIllllIlIIIIllIIIIlIIl;
    private class_2102[] lllIIIIIIlIlllIIlIlIIIllI;

    protected class_0628() {
        super(class_1855.IIIllIIlIIIIIIlIlIIllIIlI);
        this.IlIllllllIIlIIllllIIlIIIl(0);
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.IlIllllllIIlIIllllIIlIIIl);
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
    public class_2102 lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        if (this.lIlIIllllIlIIIIllIIIIlIIl == 3 && n == 1) {
            int n3 = (n2 >> 2) % this.lllIIIIIIlIlllIIlIlIIIllI.length;
            return this.lllIIIIIIlIlllIIlIlIIIllI[n3];
        }
        return this.llIIIIllIIIIIIIlIIIlIIIIl;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
        this.llIIIIllIIIIIIIlIIIlIIIIl = class_08872.lllIIIllIIIIlllIlIIllIIll("anvil_base");
        this.lllIIIIIIlIlllIIlIlIIIllI = new class_2102[IIIIlIIlIIIllIIIIllIIIlII.length];
        for (int i = 0; i < this.lllIIIIIIlIlllIIlIlIIIllI.length; ++i) {
            this.lllIIIIIIlIlllIIlIlIIIllI[i] = class_08872.lllIIIllIIIIlllIlIIllIIll(IIIIlIIlIIIllIIIIllIIIlII[i]);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_1965 class_19652, ItemStack class_08972) {
        int n4 = MathHelper.IlIllllllIIlIIllllIIlIIIl((double)(class_19652.IIIIlIllIlIIlIIlIllIlIlll * 4.0f / 360.0f) + 0.5) & 3;
        int n5 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3) >> 2;
        ++n4;
        if ((n4 %= 4) == 0) {
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, 2 | n5 << 2, 2);
        }
        if (n4 == 1) {
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, 3 | n5 << 2, 2);
        }
        if (n4 == 2) {
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, 0 | n5 << 2, 2);
        }
        if (n4 == 3) {
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, 1 | n5 << 2, 2);
        }
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_0814 class_08142, int n4, float f, float f2, float f3) {
        if (class_13342.IllIIIIllIIllIllIlllIlIIl) {
            return true;
        }
        class_08142.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3);
        return true;
    }

    @Override
    public int lIIIIlIlIIlllllIIllIIlIII() {
        return 35;
    }

    @Override
    public int IlIIIIIllllllIIlllIllllll(int n) {
        return n >> 2;
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl(class_1843 class_18432, int n, int n2, int n3) {
        int n4 = class_18432.IlIllllllIIlIIllllIIlIIIl(n, n2, n3) & 3;
        if (n4 != 3 && n4 != 1) {
            this.lllIIIllIIIIlllIlIIllIIll(0.125f, 0.0f, 0.0f, 0.875f, 1.0f, 1.0f);
        } else {
            this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.125f, 1.0f, 1.0f, 0.875f);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(Item class_06112, class_0931 class_09312, List list) {
        list.add(new ItemStack(class_06112, 1, 0));
        list.add(new ItemStack(class_06112, 1, 1));
        list.add(new ItemStack(class_06112, 1, 2));
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_0543 class_05432) {
        class_05432.lllIIIllIIIIlllIlIIllIIll(true);
    }

    @Override
    public void IIIllIIlIIIIIIlIlIIllIIlI(class_1334 class_13342, int n, int n2, int n3, int n4) {
        class_13342.IlIllllllIIlIIllllIIlIIIl(1022, n, n2, n3, 0);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1843 class_18432, int n, int n2, int n3, int n4) {
        return true;
    }
}

