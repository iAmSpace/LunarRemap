package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;

public abstract class class_0931 {
    public static final class_0931[] lllIIIllIIIIlllIlIIllIIll = new class_0931[12];
    public static final class_0931 lllIlIIlIIIlIlIIIllIlllIl = new class_1666(0, "buildingBlocks");
    public static final class_0931 IlIllllllIIlIIllllIIlIIIl = new class_1768(1, "decorations");
    public static final class_0931 lIlllIlllIIIIlIIlllIllIII = new class_0269(2, "redstone");
    public static final class_0931 IlIIIIIllllllIIlllIllllll = new class_1503(3, "transportation");
    public static final class_0931 lIllllIIlIIIlIllllllIIIll = new class_1238(4, "misc").lllIIIllIIIIlllIlIIllIIll(new class_0841[]{class_0841.lllIIIllIIIIlllIlIIllIIll});
    public static final class_0931 IIIllIIlIIIIIIlIlIIllIIlI = new class_0186(5, "search").lllIIIllIIIIlllIlIIllIIll("item_search.png");
    public static final class_0931 IllIIlllllllIIlIIlIIIIlIl = new class_1161(6, "food");
    public static final class_0931 IIIllIllIIlIlIlIlIllllIIl = new class_0584(7, "tools").lllIIIllIIIIlllIlIIllIIll(class_0841.IllIIlllllllIIlIIlIIIIlIl, class_0841.IIIllIllIIlIlIlIlIllllIIl, class_0841.IllIIIllIIIIlIlIlIllIIlll);
    public static final class_0931 IllIIIllIIIIlIlIlIllIIlll = new class_1116(8, "combat").lllIIIllIIIIlllIlIIllIIll(class_0841.lllIlIIlIIIlIlIIIllIlllIl, class_0841.IlIllllllIIlIIllllIIlIIIl, class_0841.lIllllIIlIIIlIllllllIIIll, class_0841.lIlllIlllIIIIlIIlllIllIII, class_0841.IlIIIIIllllllIIlllIllllll, class_0841.lIIIIlIlIIlllllIIllIIlIII, class_0841.IIIllIIlIIIIIIlIlIIllIIlI);
    public static final class_0931 lIIIIlIlIIlllllIIllIIlIII = new class_1784(9, "brewing");
    public static final class_0931 llIIlllIllIllllIIIlIIIIII = new class_0554(10, "materials");
    public static final class_0931 llIIllIllIlIIlIIllIllllll = new class_0873(11, "inventory").lllIIIllIIIIlllIlIIllIIll("inventory.png").lIIIIlIlIIlllllIIllIIlIII().IIIllIllIIlIlIlIlIllllIIl();
    private final int lllIIlIIIllllllIIIIlIlIlI;
    private final String IlIlllIIIIIIlIIllIIllIlll;
    private String IlIlIIlIlIllIIlIlIIllIIIl = "items.png";
    private boolean lllllIlllIIllIlIIlIIIllII = true;
    private boolean IlIlIIlllIIlIllIIIlllllIl = true;
    private class_0841[] lIIlIIIIIlIlllIlIIlIlIlll;
    private ItemStack lIlIlIIlIIIIlIIIIIlllIIII;

    public class_0931(int n, String string) {
        this.lllIIlIIIllllllIIIIlIlIlI = n;
        this.IlIlllIIIIIIlIIllIIllIlll = string;
        class_0931.lllIIIllIIIIlllIlIIllIIll[n] = this;
    }

    public int lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIIlIIIllllllIIIIlIlIlI;
    }

    public String lllIlIIlIIIlIlIIIllIlllIl() {
        return this.IlIlllIIIIIIlIIllIIllIlll;
    }

    public String IlIllllllIIlIIllllIIlIIIl() {
        return "itemGroup." + this.lllIlIIlIIIlIlIIIllIlllIl();
    }

    public ItemStack lIlllIlllIIIIlIIlllIllIII() {
        if (this.lIlIlIIlIIIIlIIIIIlllIIII == null) {
            this.lIlIlIIlIIIIlIIIIIlllIIII = new ItemStack(this.IlIIIIIllllllIIlllIllllll(), 1, this.lIllllIIlIIIlIllllllIIIll());
        }
        return this.lIlIlIIlIIIIlIIIIIlllIIII;
    }

    public abstract Item IlIIIIIllllllIIlllIllllll();

    public int lIllllIIlIIIlIllllllIIIll() {
        return 0;
    }

    public String IIIllIIlIIIIIIlIlIIllIIlI() {
        return this.IlIlIIlIlIllIIlIlIIllIIIl;
    }

    public class_0931 lllIIIllIIIIlllIlIIllIIll(String string) {
        this.IlIlIIlIlIllIIlIlIIllIIIl = string;
        return this;
    }

    public boolean IllIIlllllllIIlIIlIIIIlIl() {
        return this.IlIlIIlllIIlIllIIIlllllIl;
    }

    public class_0931 IIIllIllIIlIlIlIlIllllIIl() {
        this.IlIlIIlllIIlIllIIIlllllIl = false;
        return this;
    }

    public boolean IllIIIllIIIIlIlIlIllIIlll() {
        return this.lllllIlllIIllIlIIlIIIllII;
    }

    public class_0931 lIIIIlIlIIlllllIIllIIlIII() {
        this.lllllIlllIIllIlIIlIIIllII = false;
        return this;
    }

    public int llIIlllIllIllllIIIlIIIIII() {
        return this.lllIIlIIIllllllIIIIlIlIlI % 6;
    }

    public boolean llIIllIllIlIIlIIllIllllll() {
        return this.lllIIlIIIllllllIIIIlIlIlI < 6;
    }

    public class_0841[] lllIIlIIIllllllIIIIlIlIlI() {
        return this.lIIlIIIIIlIlllIlIIlIlIlll;
    }

    public class_0931 lllIIIllIIIIlllIlIIllIIll(class_0841 ... arrclass_0841) {
        this.lIIlIIIIIlIlllIlIIlIlIlll = arrclass_0841;
        return this;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_0841 class_08412) {
        if (this.lIIlIIIIIlIlllIlIIlIlIlll == null) {
            return false;
        }
        for (class_0841 class_08413 : this.lIIlIIIIIlIlllIlIIlIlIlll) {
            if (class_08413 != class_08412) continue;
            return true;
        }
        return false;
    }

    public void lllIIIllIIIIlllIlIIllIIll(List list) {
        for (Item class_06112 : Item.lllIIIllIIIIlllIlIIllIIll) {
            if (class_06112 == null || class_06112.lllllIlllIIllIlIIlIIIllII() != this) continue;
            class_06112.lllIIIllIIIIlllIlIIllIIll(class_06112, this, list);
        }
        if (this.lllIIlIIIllllllIIIIlIlIlI() != null) {
            this.lllIIIllIIIIlllIlIIllIIll(list, this.lllIIlIIIllllllIIIIlIlIlI());
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(List list, class_0841 ... arrclass_0841) {
        for (class_1469 class_14692 : class_1469.lllIIIllIIIIlllIlIIllIIll) {
            if (class_14692 == null || class_14692.llIIlIlIlllIIllIlIlllIllI == null) continue;
            boolean bl = false;
            for (int i = 0; i < arrclass_0841.length && !bl; ++i) {
                if (class_14692.llIIlIlIlllIIllIlIlllIllI != arrclass_0841[i]) continue;
                bl = true;
            }
            if (!bl) continue;
            list.add(Items.lIllIlIlIIIIlIlIIlIlIlllI.lllIIIllIIIIlllIlIIllIIll(new class_1129(class_14692, class_14692.IlIllllllIIlIIllllIIlIIIl())));
        }
    }
}

