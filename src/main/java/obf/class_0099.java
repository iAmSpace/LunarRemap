package obf;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0099 {
    private String[][] lllIIIllIIIIlllIlIIllIIll = new String[][]{{"XXX", " # ", " # "}, {"X", "#", "#"}, {"XX", "X#", " #"}, {"XX", " #", " #"}};
    private Object[][] lllIlIIlIIIlIlIIIllIlllIl = new Object[][]{{Blocks.lIllllIIlIIIlIllllllIIIll, Blocks.IlIIIIIllllllIIlllIllllll, Items.iron_ingot, Items.diamond, Items.lIIIIlIlIIlllllIIllIIlIII}, {Items.wooden_pickaxe, Items.stone_pickaxe, Items.lllIlIIlIIIlIlIIIllIlllIl, Items.lIlIllIIlIIlIIlIIlIIlIIll, Items.IIIIIIIIlIllIIllIIlllIllI}, {Items.lllIIlIIIllllllIIIIlIlIlI, Items.IlIlIIlllIIlIllIIIlllllIl, Items.lllIIIllIIIIlllIlIIllIIll, Items.IIlllIlIlllIllIIIlllIIlIl, Items.IllIIIIllIIllIllIlllIlIIl}, {Items.IlIlIIlIlIllIIlIlIIllIIIl, Items.lIlIlIIlIIIIlIIIIIlllIIII, Items.IlIllllllIIlIIllllIIlIIIl, Items.llIIlIllIllllIlIIIIlIIlll, Items.IIlIIlIlIlIllIIlIlIIIIlll}, {Items.wooden_hoe, Items.llIIIIllIIIIIIIlIIIlIIIIl, Items.IIllIllIIllIIlllIIIlIlllI, Items.llllllIlIllllIlIlIlIIIIlI, Items.lIlIIllllIlIIIIllIIIIlIIl}};

    public void lllIIIllIIIIlllIlIIllIIll(class_0172 class_01722) {
        for (int i = 0; i < this.lllIlIIlIIIlIlIIIllIlllIl[0].length; ++i) {
            Object object = this.lllIlIIlIIIlIlIIIllIlllIl[0][i];
            for (int j = 0; j < this.lllIlIIlIIIlIlIIIllIlllIl.length - 1; ++j) {
                Item class_06112 = (Item)this.lllIlIIlIIIlIlIIIllIlllIl[j + 1][i];
                class_01722.lllIIIllIIIIlllIlIIllIIll(new ItemStack(class_06112), this.lllIIIllIIIIlllIlIIllIIll[j], Character.valueOf('#'), Items.llIllllIlIllIIIlIllIIlIlI, Character.valueOf('X'), object);
            }
        }
        class_01722.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Items.llllIIllllIllIlllllIIlIlI), " #", "# ", Character.valueOf('#'), Items.iron_ingot);
    }
}

