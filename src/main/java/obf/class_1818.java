package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import net.minecraft.item.ItemStack;

import java.util.Map;

public enum class_1818 {
    lllIIIllIIIIlllIlIIllIIll("COD", 0, 0, "cod", 2, 0.1f, 5, 0.6f),
    lllIlIIlIIIlIlIIIllIlllIl("SALMON", 1, 1, "salmon", 2, 0.1f, 6, 0.8f),
    IlIllllllIIlIIllllIIlIIIl("CLOWNFISH", 2, 2, "clownfish", 1, 0.1f),
    lIlllIlllIIIIlIIlllIllIII("PUFFERFISH", 3, 3, "pufferfish", 1, 0.1f);

    private static final Map IlIIIIIllllllIIlllIllllll;
    private final int lIllllIIlIIIlIllllllIIIll;
    private final String IIIllIIlIIIIIIlIlIIllIIlI;
    private class_2102 IllIIlllllllIIlIIlIIIIlIl;
    private class_2102 IIIllIllIIlIlIlIlIllllIIl;
    private final int IllIIIllIIIIlIlIlIllIIlll;
    private final float lIIIIlIlIIlllllIIllIIlIII;
    private final int llIIlllIllIllllIIIlIIIIII;
    private final float llIIllIllIlIIlIIllIllllll;
    private boolean lllIIlIIIllllllIIIIlIlIlI = false;
    private static final class_1818[] IlIlllIIIIIIlIIllIIllIlll;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private class_1818(int n, String string3, int n2, float f, int n3, float f2) {
        void var10_8;
        void var9_7;
        this.lIllllIIlIIIlIllllllIIIll = n2;
        this.IIIllIIlIIIIIIlIlIIllIIlI = (String)f;
        this.IllIIIllIIIIlIlIlIllIIlll = n3;
        this.lIIIIlIlIIlllllIIllIIlIII = f2;
        this.llIIlllIllIllllIIIlIIIIII = var9_7;
        this.llIIllIllIlIIlIIllIllllll = var10_8;
        this.lllIIlIIIllllllIIIIlIlIlI = true;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private class_1818(int n, String string3, int n2, float f) {
        void var8_6;
        void var7_5;
        this.lIllllIIlIIIlIllllllIIIll = n2;
        this.IIIllIIlIIIIIIlIlIIllIIlI = (String)f;
        this.IllIIIllIIIIlIlIlIllIIlll = var7_5;
        this.lIIIIlIlIIlllllIIllIIlIII = var8_6;
        this.llIIlllIllIllllIIIlIIIIII = 0;
        this.llIIllIllIlIIlIIllIllllll = 0.0f;
        this.lllIIlIIIllllllIIIIlIlIlI = false;
    }

    public int lllIIIllIIIIlllIlIIllIIll() {
        return this.lIllllIIlIIIlIllllllIIIll;
    }

    public String lllIlIIlIIIlIlIIIllIlllIl() {
        return this.IIIllIIlIIIIIIlIlIIllIIlI;
    }

    public int IlIllllllIIlIIllllIIlIIIl() {
        return this.IllIIIllIIIIlIlIlIllIIlll;
    }

    public float lIlllIlllIIIIlIIlllIllIII() {
        return this.lIIIIlIlIIlllllIIllIIlIII;
    }

    public int IlIIIIIllllllIIlllIllllll() {
        return this.llIIlllIllIllllIIIlIIIIII;
    }

    public float lIllllIIlIIIlIllllllIIIll() {
        return this.llIIllIllIlIIlIIllIllllll;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
        this.IllIIlllllllIIlIIlIIIIlIl = class_08872.lllIIIllIIIIlllIlIIllIIll("fish_" + this.IIIllIIlIIIIIIlIlIIllIIlI + "_raw");
        if (this.lllIIlIIIllllllIIIIlIlIlI) {
            this.IIIllIllIIlIlIlIlIllllIIl = class_08872.lllIIIllIIIIlllIlIIllIIll("fish_" + this.IIIllIIlIIIIIIlIlIIllIIlI + "_cooked");
        }
    }

    public class_2102 IIIllIIlIIIIIIlIlIIllIIlI() {
        return this.IllIIlllllllIIlIIlIIIIlIl;
    }

    public class_2102 IllIIlllllllIIlIIlIIIIlIl() {
        return this.IIIllIllIIlIlIlIlIllllIIl;
    }

    public boolean IIIllIllIIlIlIlIlIllllIIl() {
        return this.lllIIlIIIllllllIIIIlIlIlI;
    }

    public static class_1818 lllIIIllIIIIlllIlIIllIIll(int n) {
        class_1818 class_18182 = (class_1818)((Object)IlIIIIIllllllIIlllIllllll.get(n));
        return class_18182 == null ? lllIIIllIIIIlllIlIIllIIll : class_18182;
    }

    public static class_1818 lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972) {
        return class_08972.lllIIIllIIIIlllIlIIllIIll() instanceof class_2054 ? class_1818.lllIIIllIIIIlllIlIIllIIll(class_08972.IllIIIllIIIIlIlIlIllIIlll()) : lllIIIllIIIIlllIlIIllIIll;
    }

    static {
        IlIIIIIllllllIIlllIllllll = Maps.newHashMap();
        IlIlllIIIIIIlIIllIIllIlll = new class_1818[]{lllIIIllIIIIlllIlIIllIIll, lllIlIIlIIIlIlIIIllIlllIl, IlIllllllIIlIIllllIIlIIIl, lIlllIlllIIIIlIIlllIllIII};
        for (class_1818 class_18182 : class_1818.values()) {
            IlIIIIIllllllIIlllIllllll.put(class_18182.lllIIIllIIIIlllIlIIllIIll(), class_18182);
        }
    }
}

