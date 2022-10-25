package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;

public class class_1209
extends class_0854 {
    private static final String[][] llIlllIIllIlllIlIlIlIIIll = new String[][]{{"flower_dandelion"}, {"flower_rose", "flower_blue_orchid", "flower_allium", "flower_houstonia", "flower_tulip_red", "flower_tulip_orange", "flower_tulip_white", "flower_tulip_pink", "flower_oxeye_daisy"}};
    public static final String[] llllllIlIllllIlIlIlIIIIlI = new String[]{"poppy", "blueOrchid", "allium", "houstonia", "tulipRed", "tulipOrange", "tulipWhite", "tulipPink", "oxeyeDaisy"};
    public static final String[] lIlIIllllIlIIIIllIIIIlIIl = new String[]{"dandelion"};
    private class_2102[] IIIIlIIlIIIllIIIIllIIIlII;
    private int lllIIIIIIlIlllIIlIlIIIllI;

    protected class_1209(int n) {
        super(class_1855.lIIIIlIlIIlllllIIllIIlIII);
        this.lllIIIIIIlIlllIIlIlIIIllI = n;
    }

    @Override
    public class_2102 lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        if (n2 >= this.IIIIlIIlIIIllIIIIllIIIlII.length) {
            n2 = 0;
        }
        return this.IIIIlIIlIIIllIIIIllIIIlII[n2];
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
        this.IIIIlIIlIIIllIIIIllIIIlII = new class_2102[llIlllIIllIlllIlIlIlIIIll[this.lllIIIIIIlIlllIIlIlIIIllI].length];
        for (int i = 0; i < this.IIIIlIIlIIIllIIIIllIIIlII.length; ++i) {
            this.IIIIlIIlIIIllIIIIllIIIlII[i] = class_08872.lllIIIllIIIIlllIlIIllIIll(llIlllIIllIlllIlIlIlIIIll[this.lllIIIIIIlIlllIIlIlIIIllI][i]);
        }
    }

    @Override
    public int IlIIIIIllllllIIlllIllllll(int n) {
        return n;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(Item class_06112, class_0931 class_09312, List list) {
        for (int i = 0; i < this.IIIIlIIlIIIllIIIIllIIIlII.length; ++i) {
            list.add(new ItemStack(class_06112, 1, i));
        }
    }

    public static class_1209 lIlllIlllIIIIlIIlllIllIII(String string) {
        for (String string2 : lIlIIllllIlIIIIllIIIIlIIl) {
            if (!string2.equals(string)) continue;
            return Blocks.llIlllIIllIlllIlIlIlIIIll;
        }
        for (String string2 : llllllIlIllllIlIlIlIIIIlI) {
            if (!string2.equals(string)) continue;
            return Blocks.IIIIlIIlIIIllIIIIllIIIlII;
        }
        return null;
    }

    public static int IlIIIIIllllllIIlllIllllll(String string) {
        int n;
        for (n = 0; n < lIlIIllllIlIIIIllIIIIlIIl.length; ++n) {
            if (!lIlIIllllIlIIIIllIIIIlIIl[n].equals(string)) continue;
            return n;
        }
        for (n = 0; n < llllllIlIllllIlIlIlIIIIlI.length; ++n) {
            if (!llllllIlIllllIlIlIlIIIIlI[n].equals(string)) continue;
            return n;
        }
        return 0;
    }
}

