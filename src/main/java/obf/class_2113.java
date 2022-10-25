package obf;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public class class_2113 {
    private String[][] lllIIIllIIIIlllIlIIllIIll = new String[][]{{"XXX", "X X"}, {"X X", "XXX", "XXX"}, {"XXX", "X X", "X X"}, {"X X", "X X"}};
    private Object[][] lllIlIIlIIIlIlIIIllIlllIl = new Object[][]{{Items.leather, Blocks.lIIlIlllIllIlIlllIIIIIIII, Items.iron_ingot, Items.diamond, Items.lIIIIlIlIIlllllIIllIIlIII}, {Items.llIIlIIllIIllIlIIllIIllII, Items.IIIIlIlIIlIIIIlIlllIlIIII, Items.llIlllIlIIllIlIIIIllIIlIl, Items.IIlIllIIlllllIIlIIllllIIl, Items.llllIIllIlIlllllllIIlIIlI}, {Items.lIlIlIIIIIIlIIllllIlIIllI, Items.lllIIIIlIlIIlIIlllIIIIIIl, Items.lIIIllIIIIIllllIlIlIllIll, Items.IllllIIlIIIllIlllIlllIllI, Items.IlllIIlllllllIIllIlIllllI}, {Items.IllllIIIIlIIlIIIIlllIIIIl, Items.llIlIIlllIIIIIllIIlIlIIII, Items.lIIIlIIIlIlllIllIIIlIIIlI, Items.IllIlIlIIIlllIIllIIIIlIll, Items.IlllIIIllllIIllIllIlIIlIl}, {Items.llllIlIIIIIIIIIlllIIlIIIl, Items.IllIIIlllllIlIlllIlllllII, Items.lIIlIlllIllIlIlllIIIIIIII, Items.diamond_boots, Items.lllIIIlIIlIlIllIIIIIlIIll}};

    public void lllIIIllIIIIlllIlIIllIIll(class_0172 class_01722) {
        for (int i = 0; i < this.lllIlIIlIIIlIlIIIllIlllIl[0].length; ++i) {
            Object object = this.lllIlIIlIIIlIlIIIllIlllIl[0][i];
            for (int j = 0; j < this.lllIlIIlIIIlIlIIIllIlllIl.length - 1; ++j) {
                Item class_06112 = (Item)this.lllIlIIlIIIlIlIIIllIlllIl[j + 1][i];
                class_01722.lllIIIllIIIIlllIlIIllIIll(new ItemStack(class_06112), this.lllIIIllIIIIlllIlIIllIIll[j], Character.valueOf('X'), object);
            }
        }
    }
}

