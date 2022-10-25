package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.item.ItemStack;

import java.util.ArrayList;

public abstract class class_1469 {
    public static final class_1469[] lllIIIllIIIIlllIlIIllIIll = new class_1469[256];
    public static final class_1469[] lllIlIIlIIIlIlIIIllIlllIl;
    public static final class_1469 IlIllllllIIlIIllllIIlIIIl;
    public static final class_1469 lIlllIlllIIIIlIIlllIllIII;
    public static final class_1469 IlIIIIIllllllIIlllIllllll;
    public static final class_1469 lIllllIIlIIIlIllllllIIIll;
    public static final class_1469 IIIllIIlIIIIIIlIlIIllIIlI;
    public static final class_1469 IllIIlllllllIIlIIlIIIIlIl;
    public static final class_1469 IIIllIllIIlIlIlIlIllllIIl;
    public static final class_1469 IllIIIllIIIIlIlIlIllIIlll;
    public static final class_1469 lIIIIlIlIIlllllIIllIIlIII;
    public static final class_1469 llIIlllIllIllllIIIlIIIIII;
    public static final class_1469 llIIllIllIlIIlIIllIllllll;
    public static final class_1469 lllIIlIIIllllllIIIIlIlIlI;
    public static final class_1469 IlIlllIIIIIIlIIllIIllIlll;
    public static final class_1469 IlIlIIlIlIllIIlIlIIllIIIl;
    public static final class_1469 lllllIlllIIllIlIIlIIIllII;
    public static final class_1469 IlIlIIlllIIlIllIIIlllllIl;
    public static final class_1469 lIIlIIIIIlIlllIlIIlIlIlll;
    public static final class_1469 lIlIlIIlIIIIlIIIIIlllIIII;
    public static final class_1469 IlIIIlIIIIllIIIllIIIIIIll;
    public static final class_1469 IIlllIlIlllIllIIIlllIIlIl;
    public static final class_1469 lIlIllIIlIIlIIlIIlIIlIIll;
    public static final class_1469 llIIlIllIllllIlIIIIlIIlll;
    public static final class_1469 llIllllIlIllIIIlIllIIlIlI;
    public static final class_1469 lIlllIlllIlIIIIlllIlIlIIl;
    public final int IlIIlllllIIlIlIlllllIllll;
    private final int IIIIIIIIlIllIIllIIlllIllI;
    public class_0841 llIIlIlIlllIIllIlIlllIllI;
    protected String IllIIIIllIIllIllIlllIlIIl;

    protected class_1469(int n, int n2, class_0841 class_08412) {
        this.IlIIlllllIIlIlIlllllIllll = n;
        this.IIIIIIIIlIllIIllIIlllIllI = n2;
        this.llIIlIlIlllIIllIlIlllIllI = class_08412;
        if (lllIIIllIIIIlllIlIIllIIll[n] != null) {
            throw new IllegalArgumentException("Duplicate enchantment id!");
        }
        class_1469.lllIIIllIIIIlllIlIIllIIll[n] = this;
    }

    public int lllIIIllIIIIlllIlIIllIIll() {
        return this.IIIIIIIIlIllIIllIIlllIllI;
    }

    public int lllIlIIlIIIlIlIIIllIlllIl() {
        return 1;
    }

    public int IlIllllllIIlIIllllIIlIIIl() {
        return 1;
    }

    public int lllIIIllIIIIlllIlIIllIIll(int n) {
        return 1 + n * 10;
    }

    public int lllIlIIlIIIlIlIIIllIlllIl(int n) {
        return this.lllIIIllIIIIlllIlIIllIIll(n) + 5;
    }

    public int lllIIIllIIIIlllIlIIllIIll(int n, class_0058 class_00582) {
        return 0;
    }

    public float lllIIIllIIIIlllIlIIllIIll(int n, class_0529 class_05292) {
        return 0.0f;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_1469 class_14692) {
        return this != class_14692;
    }

    public class_1469 lllIIIllIIIIlllIlIIllIIll(String string) {
        this.IllIIIIllIIllIllIlllIlIIl = string;
        return this;
    }

    public String lIlllIlllIIIIlIIlllIllIII() {
        return "enchantment." + this.IllIIIIllIIllIllIlllIlIIl;
    }

    public String IlIllllllIIlIIllllIIlIIIl(int n) {
        String string = class_1586.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII());
        return string + " " + class_1586.lllIIIllIIIIlllIlIIllIIll("enchantment.level." + n);
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972) {
        return this.llIIlIlIlllIIllIlIlllIllI.lllIIIllIIIIlllIlIIllIIll(class_08972.lllIIIllIIIIlllIlIIllIIll());
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652, class_1521 class_15212, int n) {
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(class_1965 class_19652, class_1521 class_15212, int n) {
    }

    static {
        IlIllllllIIlIIllllIIlIIIl = new class_1712(0, 10, 0);
        lIlllIlllIIIIlIIlllIllIII = new class_1712(1, 5, 1);
        IlIIIIIllllllIIlllIllllll = new class_1712(2, 5, 2);
        lIllllIIlIIIlIllllllIIIll = new class_1712(3, 2, 3);
        IIIllIIlIIIIIIlIlIIllIIlI = new class_1712(4, 5, 4);
        IllIIlllllllIIlIIlIIIIlIl = new class_0070(5, 2);
        IIIllIllIIlIlIlIlIllllIIl = new class_1589(6, 2);
        IllIIIllIIIIlIlIlIllIIlll = new class_0149(7, 1);
        lIIIIlIlIIlllllIIllIIlIII = new class_0922(16, 10, 0);
        llIIlllIllIllllIIIlIIIIII = new class_0922(17, 5, 1);
        llIIllIllIlIIlIIllIllllll = new class_0922(18, 5, 2);
        lllIIlIIIllllllIIIIlIlIlI = new class_2091(19, 5);
        IlIlllIIIIIIlIIllIIllIlll = new class_0916(20, 2);
        IlIlIIlIlIllIIlIlIIllIIIl = new class_0752(21, 2, class_0841.IIIllIIlIIIIIIlIlIIllIIlI);
        lllllIlllIIllIlIIlIIIllII = new class_1742(32, 10);
        IlIlIIlllIIlIllIIIlllllIl = new class_1278(33, 1);
        lIIlIIIIIlIlllIlIIlIlIlll = new class_1733(34, 5);
        lIlIlIIlIIIIlIIIIIlllIIII = new class_0752(35, 2, class_0841.IllIIlllllllIIlIIlIIIIlIl);
        IlIIIlIIIIllIIIllIIIIIIll = new class_1947(48, 10);
        IIlllIlIlllIllIIIlllIIlIl = new class_0977(49, 2);
        lIlIllIIlIIlIIlIIlIIlIIll = new class_0394(50, 2);
        llIIlIllIllllIlIIIIlIIlll = new class_1655(51, 1);
        llIllllIlIllIIIlIllIIlIlI = new class_0752(61, 2, class_0841.IIIllIllIIlIlIlIlIllllIIl);
        lIlllIlllIlIIIIlllIlIlIIl = new class_1614(62, 2, class_0841.IIIllIllIIlIlIlIlIllllIIl);
        ArrayList<class_1469> arrayList = new ArrayList<class_1469>();
        for (class_1469 class_14692 : lllIIIllIIIIlllIlIIllIIll) {
            if (class_14692 == null) continue;
            arrayList.add(class_14692);
        }
        lllIlIIlIIIlIlIIIllIlllIl = arrayList.toArray(new class_1469[0]);
    }
}

