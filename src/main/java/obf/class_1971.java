package obf;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

/*
 * Decompiled with CFR 0.150.
 */
public enum class_1971 {
    lllIIIllIIIIlllIlIIllIIll("WOOD", 0, 0, 59, 2.0f, 0.0f, 15),
    lllIlIIlIIIlIlIIIllIlllIl("STONE", 1, 1, 131, 4.0f, 1.0f, 5),
    IlIllllllIIlIIllllIIlIIIl("IRON", 2, 2, 250, 6.0f, 2.0f, 14),
    lIlllIlllIIIIlIIlllIllIII("EMERALD", 3, 3, 1561, 8.0f, 3.0f, 10),
    IlIIIIIllllllIIlllIllllll("GOLD", 4, 0, 32, 12.0f, 0.0f, 22);

    private final int lIllllIIlIIIlIllllllIIIll;
    private final int IIIllIIlIIIIIIlIlIIllIIlI;
    private final float IllIIlllllllIIlIIlIIIIlIl;
    private final float IIIllIllIIlIlIlIlIllllIIl;
    private final int IllIIIllIIIIlIlIlIllIIlll;
    private static final class_1971[] lIIIIlIlIIlllllIIllIIlIII;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private class_1971(int n, int n2, float f, float f2, int n3) {
        void var9_7;
        void var8_6;
        this.lIllllIIlIIIlIllllllIIIll = (int)f;
        this.IIIllIIlIIIIIIlIlIIllIIlI = (int)f2;
        this.IllIIlllllllIIlIIlIIIIlIl = n3;
        this.IIIllIllIIlIlIlIlIllllIIl = var8_6;
        this.IllIIIllIIIIlIlIlIllIIlll = var9_7;
    }

    public int lllIIIllIIIIlllIlIIllIIll() {
        return this.IIIllIIlIIIIIIlIlIIllIIlI;
    }

    public float lllIlIIlIIIlIlIIIllIlllIl() {
        return this.IllIIlllllllIIlIIlIIIIlIl;
    }

    public float IlIllllllIIlIIllllIIlIIIl() {
        return this.IIIllIllIIlIlIlIlIllllIIl;
    }

    public int lIlllIlllIIIIlIIlllIllIII() {
        return this.lIllllIIlIIIlIllllllIIIll;
    }

    public int IlIIIIIllllllIIlllIllllll() {
        return this.IllIIIllIIIIlIlIlIllIIlll;
    }

    public Item lIllllIIlIIIlIllllllIIIll() {
        return this == lllIIIllIIIIlllIlIIllIIll ? Item.getItemFromBlock(Blocks.lIllllIIlIIIlIllllllIIIll) : (this == lllIlIIlIIIlIlIIIllIlllIl ? Item.getItemFromBlock(Blocks.IlIIIIIllllllIIlllIllllll) : (this == IlIIIIIllllllIIlllIllllll ? Items.lIIIIlIlIIlllllIIllIIlIII : (this == IlIllllllIIlIIllllIIlIIIl ? Items.iron_ingot : (this == lIlllIlllIIIIlIIlllIllIII ? Items.diamond : null))));
    }

    static {
        lIIIIlIlIIlllllIIllIIlIII = new class_1971[]{lllIIIllIIIIlllIlIIllIIll, lllIlIIlIIIlIlIIIllIlllIl, IlIllllllIIlIIllllIIlIIIl, lIlllIlllIIIIlIIlllIllIII, IlIIIIIllllllIIlllIllllll};
    }
}

