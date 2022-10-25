package obf;

import net.minecraft.init.Items;
import net.minecraft.item.Item;

/*
 * Decompiled with CFR 0.150.
 */
public enum class_0557 {
    lllIIIllIIIIlllIlIIllIIll("CLOTH", 0, 5, new int[]{1, 3, 2, 1}, 15),
    lllIlIIlIIIlIlIIIllIlllIl("CHAIN", 1, 15, new int[]{2, 5, 4, 1}, 12),
    IlIllllllIIlIIllllIIlIIIl("IRON", 2, 15, new int[]{2, 6, 5, 2}, 9),
    lIlllIlllIIIIlIIlllIllIII("GOLD", 3, 7, new int[]{2, 5, 3, 1}, 25),
    IlIIIIIllllllIIlllIllllll("DIAMOND", 4, 33, new int[]{3, 8, 6, 3}, 10);

    private int lIllllIIlIIIlIllllllIIIll;
    private int[] IIIllIIlIIIIIIlIlIIllIIlI;
    private int IllIIlllllllIIlIIlIIIIlIl;
    private static final class_0557[] IIIllIllIIlIlIlIlIllllIIl;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private class_0557(int n, int[] arrn, int n2) {
        void var7_5;
        void var6_4;
        this.lIllllIIlIIIlIllllllIIIll = n2;
        this.IIIllIIlIIIIIIlIlIIllIIlI = var6_4;
        this.IllIIlllllllIIlIIlIIIIlIl = var7_5;
    }

    public int lllIIIllIIIIlllIlIIllIIll(int n) {
        return class_0981.IIlllIlIlllIllIIIlllIIlIl()[n] * this.lIllllIIlIIIlIllllllIIIll;
    }

    public int lllIlIIlIIIlIlIIIllIlllIl(int n) {
        return this.IIIllIIlIIIIIIlIlIIllIIlI[n];
    }

    public int lllIIIllIIIIlllIlIIllIIll() {
        return this.IllIIlllllllIIlIIlIIIIlIl;
    }

    public Item lllIlIIlIIIlIlIIIllIlllIl() {
        return this == lllIIIllIIIIlllIlIIllIIll ? Items.leather : (this == lllIlIIlIIIlIlIIIllIlllIl ? Items.iron_ingot : (this == lIlllIlllIIIIlIIlllIllIII ? Items.lIIIIlIlIIlllllIIllIIlIII : (this == IlIllllllIIlIIllllIIlIIIl ? Items.iron_ingot : (this == IlIIIIIllllllIIlllIllllll ? Items.diamond : null))));
    }

    static {
        IIIllIllIIlIlIlIlIllllIIl = new class_0557[]{lllIIIllIIIIlllIlIIllIIll, lllIlIIlIIIlIlIIIllIlllIl, IlIllllllIIlIIllllIIlIIIl, lIlllIlllIIIIlIIlllIllIII, IlIIIIIllllllIIlllIllllll};
    }
}

