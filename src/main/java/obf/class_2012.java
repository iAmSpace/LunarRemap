package obf;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public class class_2012 {
    private Object[][] lllIIIllIIIIlllIlIIllIIll = new Object[][]{{Blocks.lIlIlIIIIIIlIIllllIlIIllI, new ItemStack(Items.lIIIIlIlIIlllllIIllIIlIII, 9)}, {Blocks.IllllIIIIlIIlIIIIlllIIIIl, new ItemStack(Items.iron_ingot, 9)}, {Blocks.IlllIIlllllllIIllIlIllllI, new ItemStack(Items.diamond, 9)}, {Blocks.lIlIlllIllllIIlllIlllIIIl, new ItemStack(Items.IIllllIIlIlIlIlllIIIllIIl, 9)}, {Blocks.llIllllIlIllIIIlIllIIlIlI, new ItemStack(Items.dye, 9, 4)}, {Blocks.IlIllIIIIllllIIllIllIIIIl, new ItemStack(Items.lIIIlIIllIllIIlIIlIIIllII, 9)}, {Blocks.IllIIlIIlIIIIlIlIlIIlIlIl, new ItemStack(Items.IllIIlllllllIIlIIlIIIIlIl, 9, 0)}, {Blocks.lIlIllIIIlIlIlIlIIIllllll, new ItemStack(Items.wheat, 9)}};

    public void lllIIIllIIIIlllIlIIllIIll(class_0172 class_01722) {
        for (int i = 0; i < this.lllIIIllIIIIlllIlIIllIIll.length; ++i) {
            Block class_05492 = (Block)this.lllIIIllIIIIlllIlIIllIIll[i][0];
            ItemStack class_08972 = (ItemStack)this.lllIIIllIIIIlllIlIIllIIll[i][1];
            class_01722.lllIIIllIIIIlllIlIIllIIll(new ItemStack(class_05492), "###", "###", "###", Character.valueOf('#'), class_08972);
            class_01722.lllIIIllIIIIlllIlIIllIIll(class_08972, "#", Character.valueOf('#'), class_05492);
        }
        class_01722.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Items.lIIIIlIlIIlllllIIllIIlIII), "###", "###", "###", Character.valueOf('#'), Items.llIllIlllIllIlIIIIlIIlIII);
        class_01722.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Items.llIllIlllIllIlIIIIlIIlIII, 9), "#", Character.valueOf('#'), Items.lIIIIlIlIIlllllIIllIIlIII);
    }
}

