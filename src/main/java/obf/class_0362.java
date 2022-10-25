package obf;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0362 {
    private String[][] lllIIIllIIIIlllIlIIllIIll = new String[][]{{"X", "X", "#"}};
    private Object[][] lllIlIIlIIIlIlIIIllIlllIl = new Object[][]{{Blocks.lIllllIIlIIIlIllllllIIIll, Blocks.IlIIIIIllllllIIlllIllllll, Items.iron_ingot, Items.diamond, Items.lIIIIlIlIIlllllIIllIIlIII}, {Items.wooden_sword, Items.lllllIlllIIllIlIIlIIIllII, Items.llIIlllIllIllllIIIlIIIIII, Items.diamond_sword, Items.llIIlIlIlllIIllIlIlllIllI}};

    public void lllIIIllIIIIlllIlIIllIIll(class_0172 class_01722) {
        for (int i = 0; i < this.lllIlIIlIIIlIlIIIllIlllIl[0].length; ++i) {
            Object object = this.lllIlIIlIIIlIlIIIllIlllIl[0][i];
            for (int j = 0; j < this.lllIlIIlIIIlIlIIIllIlllIl.length - 1; ++j) {
                Item class_06112 = (Item)this.lllIlIIlIIIlIlIIIllIlllIl[j + 1][i];
                class_01722.lllIIIllIIIIlllIlIIllIIll(new ItemStack(class_06112), this.lllIIIllIIIIlllIlIIllIIll[j], Character.valueOf('#'), Items.llIllllIlIllIIIlIllIIlIlI, Character.valueOf('X'), object);
            }
        }
        class_01722.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Items.bow, 1), " #X", "# X", " #X", Character.valueOf('X'), Items.llIIIlllIlllIlIllIIIIllIl, Character.valueOf('#'), Items.llIllllIlIllIIIlIllIIlIlI);
        class_01722.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Items.arrow, 4), "X", "#", "Y", Character.valueOf('Y'), Items.IIIIlIllIlIIlIIlIllIlIlll, Character.valueOf('X'), Items.IIIlIlIllIlllllIlIllllllI, Character.valueOf('#'), Items.llIllllIlIllIIIlIllIIlIlI);
    }
}

