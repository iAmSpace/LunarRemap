package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class class_0172 {
    private static final class_0172 lllIIIllIIIIlllIlIIllIIll = new class_0172();
    private List lllIlIIlIIIlIlIIIllIlllIl = new ArrayList();

    public static final class_0172 lllIIIllIIIIlllIlIIllIIll() {
        return lllIIIllIIIIlllIlIIllIIll;
    }

    private class_0172() {
        new class_0099().lllIIIllIIIIlllIlIIllIIll(this);
        new class_0362().lllIIIllIIIIlllIlIIllIIll(this);
        new class_2012().lllIIIllIIIIlllIlIIllIIll(this);
        new class_1674().lllIIIllIIIIlllIlIIllIIll(this);
        new class_1110().lllIIIllIIIIlllIlIIllIIll(this);
        new class_2113().lllIIIllIIIIlllIlIIllIIll(this);
        new class_1563().lllIIIllIIIIlllIlIIllIIll(this);
        this.lllIlIIlIIIlIlIIIllIlllIl.add(new class_1457());
        this.lllIlIIlIIIlIlIIIllIlllIl.add(new class_0568());
        this.lllIlIIlIIIlIlIIIllIlllIl.add(new class_2181());
        this.lllIlIIlIIIlIlIIIllIlllIl.add(new class_1815());
        this.lllIlIIlIIIlIlIIIllIlllIl.add(new class_0998());
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Items.IIIIIllIlIllIlIlIIlIllIIl, 3), "###", Character.valueOf('#'), Items.IIIlIllllIIIlllllIllIlIII);
        this.lllIlIIlIIIlIlIIIllIlllIl(new ItemStack(Items.book, 1), Items.IIIIIllIlIllIlIlIIlIllIIl, Items.IIIIIllIlIllIlIlIIlIllIIl, Items.IIIIIllIlIllIlIlIIlIllIIl, Items.leather);
        this.lllIlIIlIIIlIlIIIllIlllIl(new ItemStack(Items.lIIIIlIIIIllIlIIllllIlIII, 1), Items.book, new ItemStack(Items.dye, 1, 0), Items.IIIIlIllIlIIlIIlIllIlIlll);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Blocks.lIlIIIllIIllIIlIllllllIll, 2), "###", "###", Character.valueOf('#'), Items.llIllllIlIllIIIlIllIIlIlI);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Blocks.lIllIIlIlllIllIlIlIlIllII, 6, 0), "###", "###", Character.valueOf('#'), Blocks.IlIIIIIllllllIIlllIllllll);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Blocks.lIllIIlIlllIllIlIlIlIllII, 6, 1), "###", "###", Character.valueOf('#'), Blocks.llIlllIlIIllIlIIIIllIIlIl);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Blocks.lllIlIIllllIllIIIlIlIIIll, 6), "###", "###", Character.valueOf('#'), Blocks.llIllIllIllIlIlIllIlIIIIl);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Blocks.IIIlIIllIIlIlIIlIIllIIIIl, 1), "#W#", "#W#", Character.valueOf('#'), Items.llIllllIlIllIIIlIllIIlIlI, Character.valueOf('W'), Blocks.lIllllIIlIIIlIllllllIIIll);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Blocks.IlIIlIIlllllIlIIlIlIlIlIl, 1), "###", "#X#", "###", Character.valueOf('#'), Blocks.lIllllIIlIIIlIllllllIIIll, Character.valueOf('X'), Items.diamond);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Items.IIlIlIIIlIIllIlIlIlIlIIll, 2), "~~ ", "~O ", "  ~", Character.valueOf('~'), Items.llIIIlllIlllIlIllIIIIllIl, Character.valueOf('O'), Items.lIIlllIIlIlIlIIIlIlllIIll);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Blocks.llIIlIlIlllIIllIlIlllIllI, 1), "###", "#X#", "###", Character.valueOf('#'), Blocks.lIllllIIlIIIlIllllllIIIll, Character.valueOf('X'), Items.lIIIlIIllIllIIlIIlIIIllII);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Blocks.bookshelf, 1), "###", "XXX", "###", Character.valueOf('#'), Blocks.lIllllIIlIIIlIllllllIIIll, Character.valueOf('X'), Items.book);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Blocks.IIIlIllllIIIlllllIllIlIII, 1), "##", "##", Character.valueOf('#'), Items.snowball);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Blocks.lIIllIIlIIIlllIlllIIlIIlI, 6), "###", Character.valueOf('#'), Blocks.IIIlIllllIIIlllllIllIlIII);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Blocks.lIIllIlIIlIIlllllIlIIllIl, 1), "##", "##", Character.valueOf('#'), Items.IllIIllIlIlllIllIllIlIIIl);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Blocks.lllIIIIlIlIIlIIlllIIIIIIl, 1), "##", "##", Character.valueOf('#'), Items.lIIllIIlIIIlllIlllIIlIIlI);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Blocks.IIIIlllIIlIllllllIllIIlll, 1), "##", "##", Character.valueOf('#'), Items.IIIIIIlIIIIIIIIIIlIlIlIlI);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Blocks.IIlIlIIIlIIllIlIlIlIlIIll, 1), "##", "##", Character.valueOf('#'), Items.lIllIIlllIIIlIlIIIlllIlIl);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Blocks.llllllIlIllllIlIlIlIIIIlI, 1), "##", "##", Character.valueOf('#'), Items.llIIIlllIlllIlIllIIIIllIl);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Blocks.tnt, 1), "X#X", "#X#", "X#X", Character.valueOf('X'), Items.IlIlIIlllIllllllllIIIlIlI, Character.valueOf('#'), Blocks.llIIllIllIlIIlIIllIllllll);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Blocks.IIIIlIlIIlIIIIlIlllIlIIII, 6, 3), "###", Character.valueOf('#'), Blocks.IlIIIIIllllllIIlllIllllll);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Blocks.IIIIlIlIIlIIIIlIlllIlIIII, 6, 0), "###", Character.valueOf('#'), Blocks.lllIlIIlIIIlIlIIIllIlllIl);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Blocks.IIIIlIlIIlIIIIlIlllIlIIII, 6, 1), "###", Character.valueOf('#'), Blocks.IlIIlllllIIlIlIlllllIllll);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Blocks.IIIIlIlIIlIIIIlIlllIlIIII, 6, 4), "###", Character.valueOf('#'), Blocks.lllIIIIlIlIIlIIlllIIIIIIl);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Blocks.IIIIlIlIIlIIIIlIlllIlIIII, 6, 5), "###", Character.valueOf('#'), Blocks.lllllIllllIIIIllIIlIlIlII);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Blocks.IIIIlIlIIlIIIIlIlllIlIIII, 6, 6), "###", Character.valueOf('#'), Blocks.llIllIllIllIlIlIllIlIIIIl);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Blocks.IIIIlIlIIlIIIIlIlllIlIIII, 6, 7), "###", Character.valueOf('#'), Blocks.IIlIlIIIlIIllIlIlIlIlIIll);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Blocks.lIIlIlllIIlllIIlllIIlIlII, 6, 0), "###", Character.valueOf('#'), new ItemStack(Blocks.lIllllIIlIIIlIllllllIIIll, 1, 0));
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Blocks.lIIlIlllIIlllIIlllIIlIlII, 6, 2), "###", Character.valueOf('#'), new ItemStack(Blocks.lIllllIIlIIIlIllllllIIIll, 1, 2));
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Blocks.lIIlIlllIIlllIIlllIIlIlII, 6, 1), "###", Character.valueOf('#'), new ItemStack(Blocks.lIllllIIlIIIlIllllllIIIll, 1, 1));
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Blocks.lIIlIlllIIlllIIlllIIlIlII, 6, 3), "###", Character.valueOf('#'), new ItemStack(Blocks.lIllllIIlIIIlIllllllIIIll, 1, 3));
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Blocks.lIIlIlllIIlllIIlllIIlIlII, 6, 4), "###", Character.valueOf('#'), new ItemStack(Blocks.lIllllIIlIIIlIllllllIIIll, 1, 4));
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Blocks.lIIlIlllIIlllIIlllIIlIlII, 6, 5), "###", Character.valueOf('#'), new ItemStack(Blocks.lIllllIIlIIIlIllllllIIIll, 1, 5));
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Blocks.lIlIIllIllIIIIIlIllllIIIl, 3), "# #", "###", "# #", Character.valueOf('#'), Items.llIllllIlIllIIIlIllIIlIlI);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Items.lIlllIIllIIIIIIlIlIIlIllI, 1), "##", "##", "##", Character.valueOf('#'), Blocks.lIllllIIlIIIlIllllllIIIll);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Blocks.llIIIlIIllIIllIllIIlIlllI, 2), "###", "###", Character.valueOf('#'), Blocks.lIllllIIlIIIlIllllllIIIll);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Items.lIIlIlIIllIIIlIIlIlIIIlII, 1), "##", "##", "##", Character.valueOf('#'), Items.iron_ingot);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Items.lIlIIllIllIIIIIlIllllIIIl, 3), "###", "###", " X ", Character.valueOf('#'), Blocks.lIllllIIlIIIlIllllllIIIll, Character.valueOf('X'), Items.llIllllIlIllIIIlIllIIlIlI);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Items.cake, 1), "AAA", "BEB", "CCC", Character.valueOf('A'), Items.lIIIIllIIllIIIlIIIllIllII, Character.valueOf('B'), Items.llIIIlIIllIIllIllIIlIlllI, Character.valueOf('C'), Items.wheat, Character.valueOf('E'), Items.egg);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Items.llIIIlIIllIIllIllIIlIlllI, 1), "#", Character.valueOf('#'), Items.IIIlIllllIIIlllllIllIlIII);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Blocks.lIllllIIlIIIlIllllllIIIll, 4, 0), "#", Character.valueOf('#'), new ItemStack(Blocks.log, 1, 0));
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Blocks.lIllllIIlIIIlIllllllIIIll, 4, 1), "#", Character.valueOf('#'), new ItemStack(Blocks.log, 1, 1));
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Blocks.lIllllIIlIIIlIllllllIIIll, 4, 2), "#", Character.valueOf('#'), new ItemStack(Blocks.log, 1, 2));
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Blocks.lIllllIIlIIIlIllllllIIIll, 4, 3), "#", Character.valueOf('#'), new ItemStack(Blocks.log, 1, 3));
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Blocks.lIllllIIlIIIlIllllllIIIll, 4, 4), "#", Character.valueOf('#'), new ItemStack(Blocks.lIIlIIIIIlIlllIlIIlIlIlll, 1, 0));
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Blocks.lIllllIIlIIIlIllllllIIIll, 4, 5), "#", Character.valueOf('#'), new ItemStack(Blocks.lIIlIIIIIlIlllIlIIlIlIlll, 1, 1));
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Items.llIllllIlIllIIIlIllIIlIlI, 4), "#", "#", Character.valueOf('#'), Blocks.lIllllIIlIIIlIllllllIIIll);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Blocks.lIIIlIIIlIlllIllIIIlIIIlI, 4), "X", "#", Character.valueOf('X'), Items.IllIIlllllllIIlIIlIIIIlIl, Character.valueOf('#'), Items.llIllllIlIllIIIlIllIIlIlI);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Blocks.lIIIlIIIlIlllIllIIIlIIIlI, 4), "X", "#", Character.valueOf('X'), new ItemStack(Items.IllIIlllllllIIlIIlIIIIlIl, 1, 1), Character.valueOf('#'), Items.llIllllIlIllIIIlIllIIlIlI);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Items.lIlllIlllIlIIIIlllIlIlIIl, 4), "# #", " # ", Character.valueOf('#'), Blocks.lIllllIIlIIIlIllllllIIIll);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Items.lIIlllIIIlIIlIllIIIIIlIlI, 3), "# #", " # ", Character.valueOf('#'), Blocks.lIlIllIIlIIlIIlIIlIIlIIll);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Blocks.rail, 16), "X X", "X#X", "X X", Character.valueOf('X'), Items.iron_ingot, Character.valueOf('#'), Items.llIllllIlIllIIIlIllIIlIlI);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Blocks.IIIIIIIIlIllIIllIIlllIllI, 6), "X X", "X#X", "XRX", Character.valueOf('X'), Items.lIIIIlIlIIlllllIIllIIlIII, Character.valueOf('R'), Items.lIIIlIIllIllIIlIIlIIIllII, Character.valueOf('#'), Items.llIllllIlIllIIIlIllIIlIlI);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Blocks.IlIlIIlllIIlIlllllIlIIIIl, 6), "XSX", "X#X", "XSX", Character.valueOf('X'), Items.iron_ingot, Character.valueOf('#'), Blocks.lIIllllllllIlIllllllllIlI, Character.valueOf('S'), Items.llIllllIlIllIIIlIllIIlIlI);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Blocks.IIlIIlIlIlIllIIlIlIIIIlll, 6), "X X", "X#X", "XRX", Character.valueOf('X'), Items.iron_ingot, Character.valueOf('R'), Items.lIIIlIIllIllIIlIIlIIIllII, Character.valueOf('#'), Blocks.lIlIlIIllIIIlllIllIIlIllI);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Items.lIlIlIIllIIIlllIllIIlIllI, 1), "# #", "###", Character.valueOf('#'), Items.iron_ingot);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Items.IIllIIIlIIllllIIIIIIIIlll, 1), "# #", "# #", "###", Character.valueOf('#'), Items.iron_ingot);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Items.IlIIllIIIlIlIlIIlIlIllIIl, 1), " B ", "###", Character.valueOf('#'), Blocks.IlIIIIIllllllIIlllIllllll, Character.valueOf('B'), Items.blaze_rod);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Blocks.IllIlllIIIlllllIllIIlIlIl, 1), "A", "B", Character.valueOf('A'), Blocks.lIlIIlllllIlllllIlIIIllll, Character.valueOf('B'), Blocks.lIIIlIIIlIlllIllIIIlIIIlI);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Items.IlIIlIIlllllIlIIlIlIlIlIl, 1), "A", "B", Character.valueOf('A'), Blocks.IllIlIlIIIlllIIllIIIIlIll, Character.valueOf('B'), Items.lIlIlIIllIIIlllIllIIlIllI);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Items.lIlIIIllIIllIIlIllllllIll, 1), "A", "B", Character.valueOf('A'), Blocks.furnace, Character.valueOf('B'), Items.lIlIlIIllIIIlllIllIIlIllI);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Items.IIlIlIlIIlllIIIlIIIIlIIIl, 1), "A", "B", Character.valueOf('A'), Blocks.tnt, Character.valueOf('B'), Items.lIlIlIIllIIIlllIllIIlIllI);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Items.lllIIIIlIIllIIIlIllIlllII, 1), "A", "B", Character.valueOf('A'), Blocks.llllIllllllIllIIIlIlIIllI, Character.valueOf('B'), Items.lIlIlIIllIIIlllIllIIlIllI);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Items.boat, 1), "# #", "###", Character.valueOf('#'), Blocks.lIllllIIlIIIlIllllllIIIll);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Items.bucket, 1), "# #", " # ", Character.valueOf('#'), Items.iron_ingot);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Items.lIlIlllIllllIIlllIlllIIIl, 1), "# #", " # ", Character.valueOf('#'), Items.lIIllIIlIIIlllIlllIIlIIlI);
        this.lllIlIIlIIIlIlIIIllIlllIl(new ItemStack(Items.flint_and_steel, 1), new ItemStack(Items.iron_ingot, 1), new ItemStack(Items.IIIlIlIllIlllllIlIllllllI, 1));
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Items.bread, 1), "###", Character.valueOf('#'), Items.wheat);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Blocks.IllllIIlIIIllIlllIlllIllI, 4), "#  ", "## ", "###", Character.valueOf('#'), new ItemStack(Blocks.lIllllIIlIIIlIllllllIIIll, 1, 0));
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Blocks.IIlllllIIlIIlIlIIlIIlIlII, 4), "#  ", "## ", "###", Character.valueOf('#'), new ItemStack(Blocks.lIllllIIlIIIlIllllllIIIll, 1, 2));
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Blocks.lIlIllllIlIIIIIllIIIIlIlI, 4), "#  ", "## ", "###", Character.valueOf('#'), new ItemStack(Blocks.lIllllIIlIIIlIllllllIIIll, 1, 1));
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Blocks.IIlIlIIIIlIlllIlIlIIIIIlI, 4), "#  ", "## ", "###", Character.valueOf('#'), new ItemStack(Blocks.lIllllIIlIIIlIllllllIIIll, 1, 3));
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Blocks.IIIIIlIIIIIllIIllIlIlIlIl, 4), "#  ", "## ", "###", Character.valueOf('#'), new ItemStack(Blocks.lIllllIIlIIIlIllllllIIIll, 1, 4));
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Blocks.lIIIlIIllIlIIIlIlIlIlIllI, 4), "#  ", "## ", "###", Character.valueOf('#'), new ItemStack(Blocks.lIllllIIlIIIlIllllllIIIll, 1, 5));
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Items.llIllllIIIIIlIIlIlllIIlll, 1), "  #", " #X", "# X", Character.valueOf('#'), Items.llIllllIlIllIIIlIllIIlIlI, Character.valueOf('X'), Items.llIIIlllIlllIlIllIIIIllIl);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Items.lIlIIlIIlIIIIllIIlIllIlll, 1), "# ", " X", Character.valueOf('#'), Items.llIllllIIIIIlIIlIlllIIlll, Character.valueOf('X'), Items.lIlIllllIlIIIIIllIIIIlIlI).IlIllllllIIlIIllllIIlIIIl();
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Blocks.llIIIlIlIlIIlIllIIIllIlIl, 4), "#  ", "## ", "###", Character.valueOf('#'), Blocks.IlIIIIIllllllIIlllIllllll);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Blocks.IIIIlIIIllIIIlIIlIIIIIlll, 4), "#  ", "## ", "###", Character.valueOf('#'), Blocks.lllIIIIlIlIIlIIlllIIIIIIl);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Blocks.lIIIIIlIllIllIlIlIIllllll, 4), "#  ", "## ", "###", Character.valueOf('#'), Blocks.lllllIllllIIIIllIIlIlIlII);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Blocks.llIllIlllIllIlIIIIlIIlIII, 4), "#  ", "## ", "###", Character.valueOf('#'), Blocks.llIllIllIllIlIlIllIlIIIIl);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Blocks.lIIlIlIIIIIllIIIIllIlIlII, 4), "#  ", "## ", "###", Character.valueOf('#'), Blocks.IlIIlllllIIlIlIlllllIllll);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Blocks.IIIIlllllIlllIIllIIIlIllI, 4), "#  ", "## ", "###", Character.valueOf('#'), Blocks.IIlIlIIIlIIllIlIlIlIlIIll);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Items.IlIlIllIIlIIIIlllIlIllIlI, 1), "###", "#X#", "###", Character.valueOf('#'), Items.llIllllIlIllIIIlIllIIlIlI, Character.valueOf('X'), Blocks.llllllIlIllllIlIlIlIIIIlI);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Items.IIIllIIIlIlllllllIIIlllll, 1), "###", "#X#", "###", Character.valueOf('#'), Items.llIllllIlIllIIIlIllIIlIlI, Character.valueOf('X'), Items.leather);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Items.IlIIllIlIlIllIIIlIIlIlIIl, 1, 0), "###", "#X#", "###", Character.valueOf('#'), Items.lIIIIlIlIIlllllIIllIIlIII, Character.valueOf('X'), Items.IlIIIIIllllllIIlllIllllll);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Items.IlIIllIlIlIllIIIlIIlIlIIl, 1, 1), "###", "#X#", "###", Character.valueOf('#'), Blocks.lIlIlIIIIIIlIIllllIlIIllI, Character.valueOf('X'), Items.IlIIIIIllllllIIlllIllllll);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Items.lIllIIlIlllIllIlIlIlIllII, 1, 0), "###", "#X#", "###", Character.valueOf('#'), Items.llIllIlllIllIlIIIIlIIlIII, Character.valueOf('X'), Items.lIlIllllIlIIIIIllIIIIlIlI);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Items.lllIIIlllIlllIIlIllllIIlI, 1), "###", "#X#", "###", Character.valueOf('#'), Items.llIllIlllIllIlIIIIlIIlIII, Character.valueOf('X'), Items.IllIlIlIIIlIllIlIlIIlllII);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Blocks.llIIIIIlIIlIIIIllIIIlIIII, 1), "X", "#", Character.valueOf('#'), Blocks.IlIIIIIllllllIIlllIllllll, Character.valueOf('X'), Items.llIllllIlIllIIIlIllIIlIlI);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Blocks.IIllllIIlIlIlIlllIIIllIIl, 2), "I", "S", "#", Character.valueOf('#'), Blocks.lIllllIIlIIIlIllllllIIIll, Character.valueOf('S'), Items.llIllllIlIllIIIlIllIIlIlI, Character.valueOf('I'), Items.iron_ingot);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Blocks.lIIllllllllIlIllllllllIlI, 1), "X", "#", Character.valueOf('#'), Items.llIllllIlIllIIIlIllIIlIlI, Character.valueOf('X'), Items.lIIIlIIllIllIIlIIlIIIllII);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Items.lIIllIlIllIlIlIIlIlIIIIll, 1), "#X#", "III", Character.valueOf('#'), Blocks.lIIllllllllIlIllllllllIlI, Character.valueOf('X'), Items.lIIIlIIllIllIIlIIlIIIllII, Character.valueOf('I'), Blocks.lllIlIIlIIIlIlIIIllIlllIl);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Items.lllIIIlIllIlllIlIIllIllIl, 1), " # ", "#X#", "III", Character.valueOf('#'), Blocks.lIIllllllllIlIllllllllIlI, Character.valueOf('X'), Items.lIllIIlllIIIlIlIIIlllIlIl, Character.valueOf('I'), Blocks.lllIlIIlIIIlIlIIIllIlllIl);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Items.IIIIlllIIlIllllllIllIIlll, 1), " # ", "#X#", " # ", Character.valueOf('#'), Items.lIIIIlIlIIlllllIIllIIlIII, Character.valueOf('X'), Items.lIIIlIIllIllIIlIIlIIIllII);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Items.lllllllIlIIlIlIIIlIlIIlll, 1), " # ", "#X#", " # ", Character.valueOf('#'), Items.iron_ingot, Character.valueOf('X'), Items.lIIIlIIllIllIIlIIlIIIllII);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Items.lIlIIIlIlIllIlIlIIIlIlIII, 1), "###", "#X#", "###", Character.valueOf('#'), Items.IIIIIllIlIllIlIlIIlIllIIl, Character.valueOf('X'), Items.lllllllIlIIlIlIIIlIlIIlll);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Blocks.lIIIIllIIllIIIlIIIllIllII, 1), "#", Character.valueOf('#'), Blocks.lllIlIIlIIIlIlIIIllIlllIl);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Blocks.lllIlllllIllIlIIlIlIIIlll, 1), "#", Character.valueOf('#'), Blocks.lIllllIIlIIIlIllllllIIIll);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Blocks.lIlIlIIllIIIlllIllIIlIllI, 1), "##", Character.valueOf('#'), Blocks.lllIlIIlIIIlIlIIIllIlllIl);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Blocks.lIIlIlIIllIIIlIIlIlIIIlII, 1), "##", Character.valueOf('#'), Blocks.lIllllIIlIIIlIllllllIIIll);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Blocks.IIlIlIIIIlIlllIIlIIlIIIII, 1), "##", Character.valueOf('#'), Items.iron_ingot);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Blocks.lllIIIlIllIlllIlIIllIllIl, 1), "##", Character.valueOf('#'), Items.lIIIIlIlIIlllllIIllIIlIII);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Blocks.lIlllIlllIlIIIIlllIlIlIIl, 1), "###", "#X#", "#R#", Character.valueOf('#'), Blocks.IlIIIIIllllllIIlllIllllll, Character.valueOf('X'), Items.bow, Character.valueOf('R'), Items.lIIIlIIllIllIIlIIlIIIllII);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Blocks.IIllllllIIllIlIllllIIIlll, 1), "###", "# #", "#R#", Character.valueOf('#'), Blocks.IlIIIIIllllllIIlllIllllll, Character.valueOf('R'), Items.lIIIlIIllIllIIlIIlIIIllII);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Blocks.llIIIIllIIIIIIIlIIIlIIIIl, 1), "TTT", "#X#", "#R#", Character.valueOf('#'), Blocks.IlIIIIIllllllIIlllIllllll, Character.valueOf('X'), Items.iron_ingot, Character.valueOf('R'), Items.lIIIlIIllIllIIlIIlIIIllII, Character.valueOf('T'), Blocks.lIllllIIlIIIlIllllllIIIll);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Blocks.llIIIlllIlllIlIllIIIIllIl, 1), "S", "P", Character.valueOf('S'), Items.lIIlllIIlIlIlIIIlIlllIIll, Character.valueOf('P'), Blocks.llIIIIllIIIIIIIlIIIlIIIIl);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Items.lllllIllllIIIIllIIlIlIlII, 1), "###", "XXX", Character.valueOf('#'), Blocks.llllllIlIllllIlIlIlIIIIlI, Character.valueOf('X'), Blocks.lIllllIIlIIIlIllllllIIIll);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Blocks.enchanting_table, 1), " B ", "D#D", "###", Character.valueOf('#'), Blocks.obsidian, Character.valueOf('B'), Items.book, Character.valueOf('D'), Items.diamond);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Blocks.llIlllllIIlIIlIIllllIllll, 1), "III", " i ", "iii", Character.valueOf('I'), Blocks.IllllIIIIlIIlIIIIlllIIIIl, Character.valueOf('i'), Items.iron_ingot);
        this.lllIlIIlIIIlIlIIIllIlllIl(new ItemStack(Items.ender_eye, 1), Items.IlIIIIIIIIIIlIIlllIIIlIlI, Items.IIIlllllIIIIIllIllIIIIllI);
        this.lllIlIIlIIIlIlIIIllIlllIl(new ItemStack(Items.fire_charge, 3), Items.IlIlIIlllIllllllllIIIlIlI, Items.IIIlllllIIIIIllIllIIIIllI, Items.IllIIlllllllIIlIIlIIIIlIl);
        this.lllIlIIlIIIlIlIIIllIlllIl(new ItemStack(Items.fire_charge, 3), Items.IlIlIIlllIllllllllIIIlIlI, Items.IIIlllllIIIIIllIllIIIIllI, new ItemStack(Items.IllIIlllllllIIlIIlIIIIlIl, 1, 1));
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Blocks.lllIIIIlIIllIIIlIllIlllII), "GGG", "QQQ", "WWW", Character.valueOf('G'), Blocks.lIlIllIIlIIlIIlIIlIIlIIll, Character.valueOf('Q'), Items.lIllIIlllIIIlIlIIIlllIlIl, Character.valueOf('W'), Blocks.lIIlIlllIIlllIIlllIIlIlII);
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Blocks.llllIllllllIllIIIlIlIIllI), "I I", "ICI", " I ", Character.valueOf('I'), Items.iron_ingot, Character.valueOf('C'), Blocks.IllIlIlIIIlllIIllIIIIlIll);
        Collections.sort(this.lllIlIIlIIIlIlIIIllIlllIl, new class_0660(this));
    }

    class_0208 lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, Object ... arrobject) {
        Object object;
        Object object2;
        String string = "";
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        if (arrobject[n] instanceof String[]) {
            object2 = (String[])arrobject[n++];
            for (int i = 0; i < ((String[])object2).length; ++i) {
                object = object2[i];
                ++n3;
                n2 = ((String)object).length();
                string = string + (String)object;
            }
        } else {
            while (arrobject[n] instanceof String) {
                object2 = (String)arrobject[n++];
                ++n3;
                n2 = ((String)object2).length();
                string = string + (String)object2;
            }
        }
        object2 = new HashMap();
        while (n < arrobject.length) {
            Character c = (Character)arrobject[n];
            object = null;
            if (arrobject[n + 1] instanceof Item) {
                object = new ItemStack((Item)arrobject[n + 1]);
            } else if (arrobject[n + 1] instanceof Block) {
                object = new ItemStack((Block)arrobject[n + 1], 1, 32767);
            } else if (arrobject[n + 1] instanceof ItemStack) {
                object = (ItemStack)arrobject[n + 1];
            }
            ((HashMap)object2).put(c, object);
            n += 2;
        }
        ItemStack[] arrclass_0897 = new ItemStack[n2 * n3];
        for (int i = 0; i < n2 * n3; ++i) {
            char c = string.charAt(i);
            arrclass_0897[i] = ((HashMap)object2).containsKey(Character.valueOf(c)) ? ((ItemStack)((HashMap)object2).get(Character.valueOf(c))).llIIlllIllIllllIIIlIIIIII() : null;
        }
        class_0208 class_02082 = new class_0208(n2, n3, arrclass_0897, class_08972);
        this.lllIlIIlIIIlIlIIIllIlllIl.add(class_02082);
        return class_02082;
    }

    void lllIlIIlIIIlIlIIIllIlllIl(ItemStack class_08972, Object ... arrobject) {
        ArrayList<ItemStack> arrayList = new ArrayList<ItemStack>();
        Object[] arrobject2 = arrobject;
        int n = arrobject.length;
        for (int i = 0; i < n; ++i) {
            Object object = arrobject2[i];
            if (object instanceof ItemStack) {
                arrayList.add(((ItemStack)object).llIIlllIllIllllIIIlIIIIII());
                continue;
            }
            if (object instanceof Item) {
                arrayList.add(new ItemStack((Item)object));
                continue;
            }
            if (!(object instanceof Block)) {
                throw new RuntimeException("Invalid shapeless recipy!");
            }
            arrayList.add(new ItemStack((Block)object));
        }
        this.lllIlIIlIIIlIlIIIllIlllIl.add(new class_0224(class_08972, arrayList));
    }

    public ItemStack lllIIIllIIIIlllIlIIllIIll(class_0013 class_00132, class_1334 class_13342) {
        Object object;
        int n;
        int n2 = 0;
        ItemStack class_08972 = null;
        ItemStack class_08973 = null;
        for (n = 0; n < class_00132.IlIIIIIllllllIIlllIllllll(); ++n) {
            object = class_00132.llIIllIllIlIIlIIllIllllll(n);
            if (object == null) continue;
            if (n2 == 0) {
                class_08972 = object;
            }
            if (n2 == 1) {
                class_08973 = object;
            }
            ++n2;
        }
        if (n2 == 2 && class_08972.lllIIIllIIIIlllIlIIllIIll() == class_08973.lllIIIllIIIIlllIlIIllIIll() && class_08972.lllIlIIlIIIlIlIIIllIlllIl == 1 && class_08973.lllIlIIlIIIlIlIIIllIlllIl == 1 && class_08972.lllIIIllIIIIlllIlIIllIIll().lIllllIIlIIIlIllllllIIIll()) {
            object = class_08972.lllIIIllIIIIlllIlIIllIIll();
            int n3 = ((Item)object).IlIIIIIllllllIIlllIllllll() - class_08972.IIIllIllIIlIlIlIlIllllIIl();
            int n4 = ((Item)object).IlIIIIIllllllIIlllIllllll() - class_08973.IIIllIllIIlIlIlIlIllllIIl();
            int n5 = n3 + n4 + ((Item)object).IlIIIIIllllllIIlllIllllll() * 5 / 100;
            int n6 = ((Item)object).IlIIIIIllllllIIlllIllllll() - n5;
            if (n6 < 0) {
                n6 = 0;
            }
            return new ItemStack(class_08972.lllIIIllIIIIlllIlIIllIIll(), 1, n6);
        }
        for (n = 0; n < this.lllIlIIlIIIlIlIIIllIlllIl.size(); ++n) {
            object = (class_2098)this.lllIlIIlIIIlIlIIIllIlllIl.get(n);
            if (!object.lllIIIllIIIIlllIlIIllIIll(class_00132, class_13342)) continue;
            return object.lllIIIllIIIIlllIlIIllIIll(class_00132);
        }
        return null;
    }

    public List lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }
}

