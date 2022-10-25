package net.minecraft.item;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashMultimap
 *  com.google.common.collect.Multimap
 *  com.google.common.collect.Sets
 */
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.MathHelper;
import obf.*;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class Item {
    public static final class_1921 lllIIIllIIIIlllIlIIllIIll = new class_1921();
    protected static final UUID lllIlIIlIIIlIlIIIllIlllIl = UUID.fromString("CB3F55D3-645C-4F38-A497-9C13A33DB5CF");
    private class_0931 IIIllIllIIlIlIlIlIllllIIl;
    protected static Random IlIllllllIIlIIllllIIlIIIl = new Random();
    protected int lIlllIlllIIIIlIIlllIllIII = 64;
    private int IllIIIllIIIIlIlIlIllIIlll;
    protected boolean IlIIIIIllllllIIlllIllllll;
    protected boolean lIllllIIlIIIlIllllllIIIll;
    private Item lIIIIlIlIIlllllIIllIIlIII;
    private String llIIlllIllIllllIIIlIIIIII;
    private String llIIllIllIlIIlIIllIllllll;
    protected class_2102 IIIllIIlIIIIIIlIlIIllIIlI;
    protected String IllIIlllllllIIlIIlIIIIlIl;

    public static int lllIIIllIIIIlllIlIIllIIll(Item class_06112) {
        return class_06112 == null ? 0 : lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl(class_06112);
    }

    public static Item lllIIIllIIIIlllIlIIllIIll(int n) {
        return (Item)lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(n);
    }

    public static Item getItemFromBlock(Block class_05492) {
        return Item.lllIIIllIIIIlllIlIIllIIll(Block.lllIIIllIIIIlllIlIIllIIll(class_05492));
    }

    public static void registerItems() {
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(256, "iron_shovel", new class_0978(class_1971.IlIllllllIIlIIllllIIlIIIl).lllIIIllIIIIlllIlIIllIIll("shovelIron").IlIllllllIIlIIllllIIlIIIl("iron_shovel"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(257, "iron_pickaxe", new class_0185(class_1971.IlIllllllIIlIIllllIIlIIIl).lllIIIllIIIIlllIlIIllIIll("pickaxeIron").IlIllllllIIlIIllllIIlIIIl("iron_pickaxe"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(258, "iron_axe", new class_0948(class_1971.IlIllllllIIlIIllllIIlIIIl).lllIIIllIIIIlllIlIIllIIll("hatchetIron").IlIllllllIIlIIllllIIlIIIl("iron_axe"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(259, "flint_and_steel", new class_0913().lllIIIllIIIIlllIlIIllIIll("flintAndSteel").IlIllllllIIlIIllllIIlIIIl("flint_and_steel"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(260, "apple", new class_1949(4, 0.3f, false).lllIIIllIIIIlllIlIIllIIll("apple").IlIllllllIIlIIllllIIlIIIl("apple"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(261, "bow", new class_1964().lllIIIllIIIIlllIlIIllIIll("bow").IlIllllllIIlIIllllIIlIIIl("bow"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(262, "arrow", new Item().lllIIIllIIIIlllIlIIllIIll("arrow").lllIIIllIIIIlllIlIIllIIll(class_0931.IllIIIllIIIIlIlIlIllIIlll).IlIllllllIIlIIllllIIlIIIl("arrow"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(263, "coal", new class_0984().lllIIIllIIIIlllIlIIllIIll("coal").IlIllllllIIlIIllllIIlIIIl("coal"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(264, "diamond", new Item().lllIIIllIIIIlllIlIIllIIll("diamond").lllIIIllIIIIlllIlIIllIIll(class_0931.llIIlllIllIllllIIIlIIIIII).IlIllllllIIlIIllllIIlIIIl("diamond"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(265, "iron_ingot", new Item().lllIIIllIIIIlllIlIIllIIll("ingotIron").lllIIIllIIIIlllIlIIllIIll(class_0931.llIIlllIllIllllIIIlIIIIII).IlIllllllIIlIIllllIIlIIIl("iron_ingot"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(266, "gold_ingot", new Item().lllIIIllIIIIlllIlIIllIIll("ingotGold").lllIIIllIIIIlllIlIIllIIll(class_0931.llIIlllIllIllllIIIlIIIIII).IlIllllllIIlIIllllIIlIIIl("gold_ingot"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(267, "iron_sword", new class_1531(class_1971.IlIllllllIIlIIllllIIlIIIl).lllIIIllIIIIlllIlIIllIIll("swordIron").IlIllllllIIlIIllllIIlIIIl("iron_sword"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(268, "wooden_sword", new class_1531(class_1971.lllIIIllIIIIlllIlIIllIIll).lllIIIllIIIIlllIlIIllIIll("swordWood").IlIllllllIIlIIllllIIlIIIl("wood_sword"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(269, "wooden_shovel", new class_0978(class_1971.lllIIIllIIIIlllIlIIllIIll).lllIIIllIIIIlllIlIIllIIll("shovelWood").IlIllllllIIlIIllllIIlIIIl("wood_shovel"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(270, "wooden_pickaxe", new class_0185(class_1971.lllIIIllIIIIlllIlIIllIIll).lllIIIllIIIIlllIlIIllIIll("pickaxeWood").IlIllllllIIlIIllllIIlIIIl("wood_pickaxe"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(271, "wooden_axe", new class_0948(class_1971.lllIIIllIIIIlllIlIIllIIll).lllIIIllIIIIlllIlIIllIIll("hatchetWood").IlIllllllIIlIIllllIIlIIIl("wood_axe"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(272, "stone_sword", new class_1531(class_1971.lllIlIIlIIIlIlIIIllIlllIl).lllIIIllIIIIlllIlIIllIIll("swordStone").IlIllllllIIlIIllllIIlIIIl("stone_sword"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(273, "stone_shovel", new class_0978(class_1971.lllIlIIlIIIlIlIIIllIlllIl).lllIIIllIIIIlllIlIIllIIll("shovelStone").IlIllllllIIlIIllllIIlIIIl("stone_shovel"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(274, "stone_pickaxe", new class_0185(class_1971.lllIlIIlIIIlIlIIIllIlllIl).lllIIIllIIIIlllIlIIllIIll("pickaxeStone").IlIllllllIIlIIllllIIlIIIl("stone_pickaxe"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(275, "stone_axe", new class_0948(class_1971.lllIlIIlIIIlIlIIIllIlllIl).lllIIIllIIIIlllIlIIllIIll("hatchetStone").IlIllllllIIlIIllllIIlIIIl("stone_axe"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(276, "diamond_sword", new class_1531(class_1971.lIlllIlllIIIIlIIlllIllIII).lllIIIllIIIIlllIlIIllIIll("swordDiamond").IlIllllllIIlIIllllIIlIIIl("diamond_sword"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(277, "diamond_shovel", new class_0978(class_1971.lIlllIlllIIIIlIIlllIllIII).lllIIIllIIIIlllIlIIllIIll("shovelDiamond").IlIllllllIIlIIllllIIlIIIl("diamond_shovel"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(278, "diamond_pickaxe", new class_0185(class_1971.lIlllIlllIIIIlIIlllIllIII).lllIIIllIIIIlllIlIIllIIll("pickaxeDiamond").IlIllllllIIlIIllllIIlIIIl("diamond_pickaxe"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(279, "diamond_axe", new class_0948(class_1971.lIlllIlllIIIIlIIlllIllIII).lllIIIllIIIIlllIlIIllIIll("hatchetDiamond").IlIllllllIIlIIllllIIlIIIl("diamond_axe"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(280, "stick", new Item().IIIllIIlIIIIIIlIlIIllIIlI().lllIIIllIIIIlllIlIIllIIll("stick").lllIIIllIIIIlllIlIIllIIll(class_0931.llIIlllIllIllllIIIlIIIIII).IlIllllllIIlIIllllIIlIIIl("stick"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(281, "bowl", new Item().lllIIIllIIIIlllIlIIllIIll("bowl").lllIIIllIIIIlllIlIIllIIll(class_0931.llIIlllIllIllllIIIlIIIIII).IlIllllllIIlIIllllIIlIIIl("bowl"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(282, "mushroom_stew", new class_1436(6).lllIIIllIIIIlllIlIIllIIll("mushroomStew").IlIllllllIIlIIllllIIlIIIl("mushroom_stew"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(283, "golden_sword", new class_1531(class_1971.IlIIIIIllllllIIlllIllllll).lllIIIllIIIIlllIlIIllIIll("swordGold").IlIllllllIIlIIllllIIlIIIl("gold_sword"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(284, "golden_shovel", new class_0978(class_1971.IlIIIIIllllllIIlllIllllll).lllIIIllIIIIlllIlIIllIIll("shovelGold").IlIllllllIIlIIllllIIlIIIl("gold_shovel"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(285, "golden_pickaxe", new class_0185(class_1971.IlIIIIIllllllIIlllIllllll).lllIIIllIIIIlllIlIIllIIll("pickaxeGold").IlIllllllIIlIIllllIIlIIIl("gold_pickaxe"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(286, "golden_axe", new class_0948(class_1971.IlIIIIIllllllIIlllIllllll).lllIIIllIIIIlllIlIIllIIll("hatchetGold").IlIllllllIIlIIllllIIlIIIl("gold_axe"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(287, "string", new class_1934(Blocks.IIIllIIIlIlllllllIIIlllll).lllIIIllIIIIlllIlIIllIIll("string").lllIIIllIIIIlllIlIIllIIll(class_0931.llIIlllIllIllllIIIlIIIIII).IlIllllllIIlIIllllIIlIIIl("string"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(288, "feather", new Item().lllIIIllIIIIlllIlIIllIIll("feather").lllIIIllIIIIlllIlIIllIIll(class_0931.llIIlllIllIllllIIIlIIIIII).IlIllllllIIlIIllllIIlIIIl("feather"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(289, "gunpowder", new Item().lllIIIllIIIIlllIlIIllIIll("sulphur").lllIlIIlIIIlIlIIIllIlllIl(class_0668.lIIIIlIlIIlllllIIllIIlIII).lllIIIllIIIIlllIlIIllIIll(class_0931.llIIlllIllIllllIIIlIIIIII).IlIllllllIIlIIllllIIlIIIl("gunpowder"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(290, "wooden_hoe", new class_1079(class_1971.lllIIIllIIIIlllIlIIllIIll).lllIIIllIIIIlllIlIIllIIll("hoeWood").IlIllllllIIlIIllllIIlIIIl("wood_hoe"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(291, "stone_hoe", new class_1079(class_1971.lllIlIIlIIIlIlIIIllIlllIl).lllIIIllIIIIlllIlIIllIIll("hoeStone").IlIllllllIIlIIllllIIlIIIl("stone_hoe"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(292, "iron_hoe", new class_1079(class_1971.IlIllllllIIlIIllllIIlIIIl).lllIIIllIIIIlllIlIIllIIll("hoeIron").IlIllllllIIlIIllllIIlIIIl("iron_hoe"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(293, "diamond_hoe", new class_1079(class_1971.lIlllIlllIIIIlIIlllIllIII).lllIIIllIIIIlllIlIIllIIll("hoeDiamond").IlIllllllIIlIIllllIIlIIIl("diamond_hoe"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(294, "golden_hoe", new class_1079(class_1971.IlIIIIIllllllIIlllIllllll).lllIIIllIIIIlllIlIIllIIll("hoeGold").IlIllllllIIlIIllllIIlIIIl("gold_hoe"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(295, "wheat_seeds", new class_1626(Blocks.lllIIIlIIlIlIllIIIIIlIIll, Blocks.IIIlIlIllIlllllIlIllllllI).lllIIIllIIIIlllIlIIllIIll("seeds").IlIllllllIIlIIllllIIlIIIl("seeds_wheat"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(296, "wheat", new Item().lllIIIllIIIIlllIlIIllIIll("wheat").lllIIIllIIIIlllIlIIllIIll(class_0931.llIIlllIllIllllIIIlIIIIII).IlIllllllIIlIIllllIIlIIIl("wheat"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(297, "bread", new class_1949(5, 0.6f, false).lllIIIllIIIIlllIlIIllIIll("bread").IlIllllllIIlIIllllIIlIIIl("bread"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(298, "leather_helmet", new class_0981(class_0557.lllIIIllIIIIlllIlIIllIIll, 0, 0).lllIIIllIIIIlllIlIIllIIll("helmetCloth").IlIllllllIIlIIllllIIlIIIl("leather_helmet"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(299, "leather_chestplate", new class_0981(class_0557.lllIIIllIIIIlllIlIIllIIll, 0, 1).lllIIIllIIIIlllIlIIllIIll("chestplateCloth").IlIllllllIIlIIllllIIlIIIl("leather_chestplate"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(300, "leather_leggings", new class_0981(class_0557.lllIIIllIIIIlllIlIIllIIll, 0, 2).lllIIIllIIIIlllIlIIllIIll("leggingsCloth").IlIllllllIIlIIllllIIlIIIl("leather_leggings"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(301, "leather_boots", new class_0981(class_0557.lllIIIllIIIIlllIlIIllIIll, 0, 3).lllIIIllIIIIlllIlIIllIIll("bootsCloth").IlIllllllIIlIIllllIIlIIIl("leather_boots"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(302, "chainmail_helmet", new class_0981(class_0557.lllIlIIlIIIlIlIIIllIlllIl, 1, 0).lllIIIllIIIIlllIlIIllIIll("helmetChain").IlIllllllIIlIIllllIIlIIIl("chainmail_helmet"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(303, "chainmail_chestplate", new class_0981(class_0557.lllIlIIlIIIlIlIIIllIlllIl, 1, 1).lllIIIllIIIIlllIlIIllIIll("chestplateChain").IlIllllllIIlIIllllIIlIIIl("chainmail_chestplate"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(304, "chainmail_leggings", new class_0981(class_0557.lllIlIIlIIIlIlIIIllIlllIl, 1, 2).lllIIIllIIIIlllIlIIllIIll("leggingsChain").IlIllllllIIlIIllllIIlIIIl("chainmail_leggings"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(305, "chainmail_boots", new class_0981(class_0557.lllIlIIlIIIlIlIIIllIlllIl, 1, 3).lllIIIllIIIIlllIlIIllIIll("bootsChain").IlIllllllIIlIIllllIIlIIIl("chainmail_boots"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(306, "iron_helmet", new class_0981(class_0557.IlIllllllIIlIIllllIIlIIIl, 2, 0).lllIIIllIIIIlllIlIIllIIll("helmetIron").IlIllllllIIlIIllllIIlIIIl("iron_helmet"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(307, "iron_chestplate", new class_0981(class_0557.IlIllllllIIlIIllllIIlIIIl, 2, 1).lllIIIllIIIIlllIlIIllIIll("chestplateIron").IlIllllllIIlIIllllIIlIIIl("iron_chestplate"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(308, "iron_leggings", new class_0981(class_0557.IlIllllllIIlIIllllIIlIIIl, 2, 2).lllIIIllIIIIlllIlIIllIIll("leggingsIron").IlIllllllIIlIIllllIIlIIIl("iron_leggings"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(309, "iron_boots", new class_0981(class_0557.IlIllllllIIlIIllllIIlIIIl, 2, 3).lllIIIllIIIIlllIlIIllIIll("bootsIron").IlIllllllIIlIIllllIIlIIIl("iron_boots"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(310, "diamond_helmet", new class_0981(class_0557.IlIIIIIllllllIIlllIllllll, 3, 0).lllIIIllIIIIlllIlIIllIIll("helmetDiamond").IlIllllllIIlIIllllIIlIIIl("diamond_helmet"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(311, "diamond_chestplate", new class_0981(class_0557.IlIIIIIllllllIIlllIllllll, 3, 1).lllIIIllIIIIlllIlIIllIIll("chestplateDiamond").IlIllllllIIlIIllllIIlIIIl("diamond_chestplate"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(312, "diamond_leggings", new class_0981(class_0557.IlIIIIIllllllIIlllIllllll, 3, 2).lllIIIllIIIIlllIlIIllIIll("leggingsDiamond").IlIllllllIIlIIllllIIlIIIl("diamond_leggings"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(313, "diamond_boots", new class_0981(class_0557.IlIIIIIllllllIIlllIllllll, 3, 3).lllIIIllIIIIlllIlIIllIIll("bootsDiamond").IlIllllllIIlIIllllIIlIIIl("diamond_boots"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(314, "golden_helmet", new class_0981(class_0557.lIlllIlllIIIIlIIlllIllIII, 4, 0).lllIIIllIIIIlllIlIIllIIll("helmetGold").IlIllllllIIlIIllllIIlIIIl("gold_helmet"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(315, "golden_chestplate", new class_0981(class_0557.lIlllIlllIIIIlIIlllIllIII, 4, 1).lllIIIllIIIIlllIlIIllIIll("chestplateGold").IlIllllllIIlIIllllIIlIIIl("gold_chestplate"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(316, "golden_leggings", new class_0981(class_0557.lIlllIlllIIIIlIIlllIllIII, 4, 2).lllIIIllIIIIlllIlIIllIIll("leggingsGold").IlIllllllIIlIIllllIIlIIIl("gold_leggings"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(317, "golden_boots", new class_0981(class_0557.lIlllIlllIIIIlIIlllIllIII, 4, 3).lllIIIllIIIIlllIlIIllIIll("bootsGold").IlIllllllIIlIIllllIIlIIIl("gold_boots"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(318, "flint", new Item().lllIIIllIIIIlllIlIIllIIll("flint").lllIIIllIIIIlllIlIIllIIll(class_0931.llIIlllIllIllllIIIlIIIIII).IlIllllllIIlIIllllIIlIIIl("flint"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(319, "porkchop", new class_1949(3, 0.3f, true).lllIIIllIIIIlllIlIIllIIll("porkchopRaw").IlIllllllIIlIIllllIIlIIIl("porkchop_raw"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(320, "cooked_porkchop", new class_1949(8, 0.8f, true).lllIIIllIIIIlllIlIIllIIll("porkchopCooked").IlIllllllIIlIIllllIIlIIIl("porkchop_cooked"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(321, "painting", new class_0397(class_0146.class).lllIIIllIIIIlllIlIIllIIll("painting").IlIllllllIIlIIllllIIlIIIl("painting"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(322, "golden_apple", new class_0255(4, 1.2f, false).IIlllIlIlllIllIIIlllIIlIl().lllIIIllIIIIlllIlIIllIIll(class_0700.llIIlllIllIllllIIIlIIIIII.IlIlIIlllIllllllllIIIlIlI, 5, 1, 1.0f).lllIIIllIIIIlllIlIIllIIll("appleGold").IlIllllllIIlIIllllIIlIIIl("apple_golden"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(323, "sign", new class_1140().lllIIIllIIIIlllIlIIllIIll("sign").IlIllllllIIlIIllllIIlIIIl("sign"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(324, "wooden_door", new class_0760(class_1855.lIlllIlllIIIIlIIlllIllIII).lllIIIllIIIIlllIlIIllIIll("doorWood").IlIllllllIIlIIllllIIlIIIl("door_wood"));
        Item class_06112 = new class_1057(Blocks.lllIIIllIIIIlllIlIIllIIll).lllIIIllIIIIlllIlIIllIIll("bucket").lllIlIIlIIIlIlIIIllIlllIl(16).IlIllllllIIlIIllllIIlIIIl("bucket_empty");
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(325, "bucket", class_06112);
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(326, "water_bucket", new class_1057(Blocks.IIIllIllIIlIlIlIlIllllIIl).lllIIIllIIIIlllIlIIllIIll("bucketWater").lllIlIIlIIIlIlIIIllIlllIl(class_06112).IlIllllllIIlIIllllIIlIIIl("bucket_water"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(327, "lava_bucket", new class_1057(Blocks.lIIIIlIlIIlllllIIllIIlIII).lllIIIllIIIIlllIlIIllIIll("bucketLava").lllIlIIlIIIlIlIIIllIlllIl(class_06112).IlIllllllIIlIIllllIIlIIIl("bucket_lava"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(328, "minecart", new class_0341(0).lllIIIllIIIIlllIlIIllIIll("minecart").IlIllllllIIlIIllllIIlIIIl("minecart_normal"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(329, "saddle", new class_1809().lllIIIllIIIIlllIlIIllIIll("saddle").IlIllllllIIlIIllllIIlIIIl("saddle"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(330, "iron_door", new class_0760(class_1855.lIllllIIlIIIlIllllllIIIll).lllIIIllIIIIlllIlIIllIIll("doorIron").IlIllllllIIlIIllllIIlIIIl("door_iron"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(331, "redstone", new class_0144().lllIIIllIIIIlllIlIIllIIll("redstone").lllIlIIlIIIlIlIIIllIlllIl(class_0668.IIIllIllIIlIlIlIlIllllIIl).IlIllllllIIlIIllllIIlIIIl("redstone_dust"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(332, "snowball", new class_0988().lllIIIllIIIIlllIlIIllIIll("snowball").IlIllllllIIlIIllllIIlIIIl("snowball"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(333, "boat", new class_2188().lllIIIllIIIIlllIlIIllIIll("boat").IlIllllllIIlIIllllIIlIIIl("boat"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(334, "leather", new Item().lllIIIllIIIIlllIlIIllIIll("leather").lllIIIllIIIIlllIlIIllIIll(class_0931.llIIlllIllIllllIIIlIIIIII).IlIllllllIIlIIllllIIlIIIl("leather"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(335, "milk_bucket", new class_1568().lllIIIllIIIIlllIlIIllIIll("milk").lllIlIIlIIIlIlIIIllIlllIl(class_06112).IlIllllllIIlIIllllIIlIIIl("bucket_milk"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(336, "brick", new Item().lllIIIllIIIIlllIlIIllIIll("brick").lllIIIllIIIIlllIlIIllIIll(class_0931.llIIlllIllIllllIIIlIIIIII).IlIllllllIIlIIllllIIlIIIl("brick"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(337, "clay_ball", new Item().lllIIIllIIIIlllIlIIllIIll("clay").lllIIIllIIIIlllIlIIllIIll(class_0931.llIIlllIllIllllIIIlIIIIII).IlIllllllIIlIIllllIIlIIIl("clay_ball"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(338, "reeds", new class_1934(Blocks.lIIlllIIlIlIlIIIlIlllIIll).lllIIIllIIIIlllIlIIllIIll("reeds").lllIIIllIIIIlllIlIIllIIll(class_0931.llIIlllIllIllllIIIlIIIIII).IlIllllllIIlIIllllIIlIIIl("reeds"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(339, "paper", new Item().lllIIIllIIIIlllIlIIllIIll("paper").lllIIIllIIIIlllIlIIllIIll(class_0931.lIllllIIlIIIlIllllllIIIll).IlIllllllIIlIIllllIIlIIIl("paper"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(340, "book", new class_1262().lllIIIllIIIIlllIlIIllIIll("book").lllIIIllIIIIlllIlIIllIIll(class_0931.lIllllIIlIIIlIllllllIIIll).IlIllllllIIlIIllllIIlIIIl("book_normal"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(341, "slime_ball", new Item().lllIIIllIIIIlllIlIIllIIll("slimeball").lllIIIllIIIIlllIlIIllIIll(class_0931.lIllllIIlIIIlIllllllIIIll).IlIllllllIIlIIllllIIlIIIl("slimeball"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(342, "chest_minecart", new class_0341(1).lllIIIllIIIIlllIlIIllIIll("minecartChest").IlIllllllIIlIIllllIIlIIIl("minecart_chest"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(343, "furnace_minecart", new class_0341(2).lllIIIllIIIIlllIlIIllIIll("minecartFurnace").IlIllllllIIlIIllllIIlIIIl("minecart_furnace"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(344, "egg", new class_0507().lllIIIllIIIIlllIlIIllIIll("egg").IlIllllllIIlIIllllIIlIIIl("egg"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(345, "compass", new Item().lllIIIllIIIIlllIlIIllIIll("compass").lllIIIllIIIIlllIlIIllIIll(class_0931.IIIllIllIIlIlIlIlIllllIIl).IlIllllllIIlIIllllIIlIIIl("compass"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(346, "fishing_rod", new class_1748().lllIIIllIIIIlllIlIIllIIll("fishingRod").IlIllllllIIlIIllllIIlIIIl("fishing_rod"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(347, "clock", new Item().lllIIIllIIIIlllIlIIllIIll("clock").lllIIIllIIIIlllIlIIllIIll(class_0931.IIIllIllIIlIlIlIlIllllIIl).IlIllllllIIlIIllllIIlIIIl("clock"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(348, "glowstone_dust", new Item().lllIIIllIIIIlllIlIIllIIll("yellowDust").lllIlIIlIIIlIlIIIllIlllIl(class_0668.IllIIIllIIIIlIlIlIllIIlll).lllIIIllIIIIlllIlIIllIIll(class_0931.llIIlllIllIllllIIIlIIIIII).IlIllllllIIlIIllllIIlIIIl("glowstone_dust"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(349, "fish", new class_2054(false).lllIIIllIIIIlllIlIIllIIll("fish").IlIllllllIIlIIllllIIlIIIl("fish_raw").lllIIIllIIIIlllIlIIllIIll(true));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(350, "cooked_fished", new class_2054(true).lllIIIllIIIIlllIlIIllIIll("fish").IlIllllllIIlIIllllIIlIIIl("fish_cooked").lllIIIllIIIIlllIlIIllIIll(true));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(351, "dye", new class_1908().lllIIIllIIIIlllIlIIllIIll("dyePowder").IlIllllllIIlIIllllIIlIIIl("dye_powder"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(352, "bone", new Item().lllIIIllIIIIlllIlIIllIIll("bone").IIIllIIlIIIIIIlIlIIllIIlI().lllIIIllIIIIlllIlIIllIIll(class_0931.lIllllIIlIIIlIllllllIIIll).IlIllllllIIlIIllllIIlIIIl("bone"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(353, "sugar", new Item().lllIIIllIIIIlllIlIIllIIll("sugar").lllIlIIlIIIlIlIIIllIlllIl(class_0668.lllIlIIlIIIlIlIIIllIlllIl).lllIIIllIIIIlllIlIIllIIll(class_0931.llIIlllIllIllllIIIlIIIIII).IlIllllllIIlIIllllIIlIIIl("sugar"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(354, "cake", new class_1934(Blocks.IllIIIIlIIlllllllllIlIlII).lllIlIIlIIIlIlIIIllIlllIl(1).lllIIIllIIIIlllIlIIllIIll("cake").lllIIIllIIIIlllIlIIllIIll(class_0931.IllIIlllllllIIlIIlIIIIlIl).IlIllllllIIlIIllllIIlIIIl("cake"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(355, "bed", new class_1003().lllIlIIlIIIlIlIIIllIlllIl(1).lllIIIllIIIIlllIlIIllIIll("bed").IlIllllllIIlIIllllIIlIIIl("bed"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(356, "repeater", new class_1934(Blocks.IIIlllIlIIllIIlIlIllIlIIl).lllIIIllIIIIlllIlIIllIIll("diode").lllIIIllIIIIlllIlIIllIIll(class_0931.lIlllIlllIIIIlIIlllIllIII).IlIllllllIIlIIllllIIlIIIl("repeater"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(357, "cookie", new class_1949(2, 0.1f, false).lllIIIllIIIIlllIlIIllIIll("cookie").IlIllllllIIlIIllllIIlIIIl("cookie"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(358, "filled_map", new class_0746().lllIIIllIIIIlllIlIIllIIll("map").IlIllllllIIlIIllllIIlIIIl("map_filled"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(359, "shears", new class_1887().lllIIIllIIIIlllIlIIllIIll("shears").IlIllllllIIlIIllllIIlIIIl("shears"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(360, "melon", new class_1949(2, 0.3f, false).lllIIIllIIIIlllIlIIllIIll("melon").IlIllllllIIlIIllllIIlIIIl("melon"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(361, "pumpkin_seeds", new class_1626(Blocks.lIIIllIlIlIlIIIllIlIlIllI, Blocks.IIIlIlIllIlllllIlIllllllI).lllIIIllIIIIlllIlIIllIIll("seeds_pumpkin").IlIllllllIIlIIllllIIlIIIl("seeds_pumpkin"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(362, "melon_seeds", new class_1626(Blocks.IIIlIllIlllIlIIIlIlIIllII, Blocks.IIIlIlIllIlllllIlIllllllI).lllIIIllIIIIlllIlIIllIIll("seeds_melon").IlIllllllIIlIIllllIIlIIIl("seeds_melon"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(363, "beef", new class_1949(3, 0.3f, true).lllIIIllIIIIlllIlIIllIIll("beefRaw").IlIllllllIIlIIllllIIlIIIl("beef_raw"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(364, "cooked_beef", new class_1949(8, 0.8f, true).lllIIIllIIIIlllIlIIllIIll("beefCooked").IlIllllllIIlIIllllIIlIIIl("beef_cooked"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(365, "chicken", new class_1949(2, 0.3f, true).lllIIIllIIIIlllIlIIllIIll(class_0700.lIIlIIIIIlIlllIlIIlIlIlll.IlIlIIlllIllllllllIIIlIlI, 30, 0, 0.3f).lllIIIllIIIIlllIlIIllIIll("chickenRaw").IlIllllllIIlIIllllIIlIIIl("chicken_raw"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(366, "cooked_chicken", new class_1949(6, 0.6f, true).lllIIIllIIIIlllIlIIllIIll("chickenCooked").IlIllllllIIlIIllllIIlIIIl("chicken_cooked"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(367, "rotten_flesh", new class_1949(4, 0.1f, true).lllIIIllIIIIlllIlIIllIIll(class_0700.lIIlIIIIIlIlllIlIIlIlIlll.IlIlIIlllIllllllllIIIlIlI, 30, 0, 0.8f).lllIIIllIIIIlllIlIIllIIll("rottenFlesh").IlIllllllIIlIIllllIIlIIIl("rotten_flesh"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(368, "ender_pearl", new class_2106().lllIIIllIIIIlllIlIIllIIll("enderPearl").IlIllllllIIlIIllllIIlIIIl("ender_pearl"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(369, "blaze_rod", new Item().lllIIIllIIIIlllIlIIllIIll("blazeRod").lllIIIllIIIIlllIlIIllIIll(class_0931.llIIlllIllIllllIIIlIIIIII).IlIllllllIIlIIllllIIlIIIl("blaze_rod"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(370, "ghast_tear", new Item().lllIIIllIIIIlllIlIIllIIll("ghastTear").lllIlIIlIIIlIlIIIllIlllIl("+0-1-2-3&4-4+13").lllIIIllIIIIlllIlIIllIIll(class_0931.lIIIIlIlIIlllllIIllIIlIII).IlIllllllIIlIIllllIIlIIIl("ghast_tear"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(371, "gold_nugget", new Item().lllIIIllIIIIlllIlIIllIIll("goldNugget").lllIIIllIIIIlllIlIIllIIll(class_0931.llIIlllIllIllllIIIlIIIIII).IlIllllllIIlIIllllIIlIIIl("gold_nugget"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(372, "nether_wart", new class_1626(Blocks.IlllIIIlIIlIIIIllllIllllI, Blocks.llIllllIIIIIlIIlIlllIIlll).lllIIIllIIIIlllIlIIllIIll("netherStalkSeeds").lllIlIIlIIIlIlIIIllIlllIl("+4").IlIllllllIIlIIllllIIlIIIl("nether_wart"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(373, "potion", new class_0483().lllIIIllIIIIlllIlIIllIIll("potion").IlIllllllIIlIIllllIIlIIIl("potion"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(374, "glass_bottle", new class_0569().lllIIIllIIIIlllIlIIllIIll("glassBottle").IlIllllllIIlIIllllIIlIIIl("potion_bottle_empty"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(375, "spider_eye", new class_1949(2, 0.8f, false).lllIIIllIIIIlllIlIIllIIll(class_0700.IlIIIlIIIIllIIIllIIIIIIll.IlIlIIlllIllllllllIIIlIlI, 5, 0, 1.0f).lllIIIllIIIIlllIlIIllIIll("spiderEye").lllIlIIlIIIlIlIIIllIlllIl(class_0668.lIlllIlllIIIIlIIlllIllIII).IlIllllllIIlIIllllIIlIIIl("spider_eye"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(376, "fermented_spider_eye", new Item().lllIIIllIIIIlllIlIIllIIll("fermentedSpiderEye").lllIlIIlIIIlIlIIIllIlllIl(class_0668.IlIIIIIllllllIIlllIllllll).lllIIIllIIIIlllIlIIllIIll(class_0931.lIIIIlIlIIlllllIIllIIlIII).IlIllllllIIlIIllllIIlIIIl("spider_eye_fermented"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(377, "blaze_powder", new Item().lllIIIllIIIIlllIlIIllIIll("blazePowder").lllIlIIlIIIlIlIIIllIlllIl(class_0668.IIIllIIlIIIIIIlIlIIllIIlI).lllIIIllIIIIlllIlIIllIIll(class_0931.lIIIIlIlIIlllllIIllIIlIII).IlIllllllIIlIIllllIIlIIIl("blaze_powder"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(378, "magma_cream", new Item().lllIIIllIIIIlllIlIIllIIll("magmaCream").lllIlIIlIIIlIlIIIllIlllIl(class_0668.IllIIlllllllIIlIIlIIIIlIl).lllIIIllIIIIlllIlIIllIIll(class_0931.lIIIIlIlIIlllllIIllIIlIII).IlIllllllIIlIIllllIIlIIIl("magma_cream"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(379, "brewing_stand", new class_1934(Blocks.lIIlllIIIlIIlIllIIIIIlIlI).lllIIIllIIIIlllIlIIllIIll("brewingStand").lllIIIllIIIIlllIlIIllIIll(class_0931.lIIIIlIlIIlllllIIllIIlIII).IlIllllllIIlIIllllIIlIIIl("brewing_stand"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(380, "cauldron", new class_1934(Blocks.lllIlIIllllIIllIIIIllIlIl).lllIIIllIIIIlllIlIIllIIll("cauldron").lllIIIllIIIIlllIlIIllIIll(class_0931.lIIIIlIlIIlllllIIllIIlIII).IlIllllllIIlIIllllIIlIIIl("cauldron"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(381, "ender_eye", new class_0682().lllIIIllIIIIlllIlIIllIIll("eyeOfEnder").IlIllllllIIlIIllllIIlIIIl("ender_eye"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(382, "speckled_melon", new Item().lllIIIllIIIIlllIlIIllIIll("speckledMelon").lllIlIIlIIIlIlIIIllIlllIl(class_0668.lIllllIIlIIIlIllllllIIIll).lllIIIllIIIIlllIlIIllIIll(class_0931.lIIIIlIlIIlllllIIllIIlIII).IlIllllllIIlIIllllIIlIIIl("melon_speckled"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(383, "spawn_egg", new class_2126().lllIIIllIIIIlllIlIIllIIll("monsterPlacer").IlIllllllIIlIIllllIIlIIIl("spawn_egg"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(384, "experience_bottle", new class_0520().lllIIIllIIIIlllIlIIllIIll("expBottle").IlIllllllIIlIIllllIIlIIIl("experience_bottle"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(385, "fire_charge", new class_2222().lllIIIllIIIIlllIlIIllIIll("fireball").IlIllllllIIlIIllllIIlIIIl("fireball"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(386, "writable_book", new class_0789().lllIIIllIIIIlllIlIIllIIll("writingBook").lllIIIllIIIIlllIlIIllIIll(class_0931.lIllllIIlIIIlIllllllIIIll).IlIllllllIIlIIllllIIlIIIl("book_writable"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(387, "written_book", new class_1827().lllIIIllIIIIlllIlIIllIIll("writtenBook").IlIllllllIIlIIllllIIlIIIl("book_written").lllIlIIlIIIlIlIIIllIlllIl(16));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(388, "emerald", new Item().lllIIIllIIIIlllIlIIllIIll("emerald").lllIIIllIIIIlllIlIIllIIll(class_0931.llIIlllIllIllllIIIlIIIIII).IlIllllllIIlIIllllIIlIIIl("emerald"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(389, "item_frame", new class_0397(class_1094.class).lllIIIllIIIIlllIlIIllIIll("frame").IlIllllllIIlIIllllIIlIIIl("item_frame"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(390, "flower_pot", new class_1934(Blocks.IIIIIllIIlIlIlIIlIlIlIllI).lllIIIllIIIIlllIlIIllIIll("flowerPot").lllIIIllIIIIlllIlIIllIIll(class_0931.IlIllllllIIlIIllllIIlIIIl).IlIllllllIIlIIllllIIlIIIl("flower_pot"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(391, "carrot", new class_0755(4, 0.6f, Blocks.lIlIIlIIlIIIIllIIlIllIlll, Blocks.IIIlIlIllIlllllIlIllllllI).lllIIIllIIIIlllIlIIllIIll("carrots").IlIllllllIIlIIllllIIlIIIl("carrot"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(392, "potato", new class_0755(1, 0.3f, Blocks.lIIlIlIlIlIllIIlIIllllIll, Blocks.IIIlIlIllIlllllIlIllllllI).lllIIIllIIIIlllIlIIllIIll("potato").IlIllllllIIlIIllllIIlIIIl("potato"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(393, "baked_potato", new class_1949(6, 0.6f, false).lllIIIllIIIIlllIlIIllIIll("potatoBaked").IlIllllllIIlIIllllIIlIIIl("potato_baked"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(394, "poisonous_potato", new class_1949(2, 0.3f, false).lllIIIllIIIIlllIlIIllIIll(class_0700.IlIIIlIIIIllIIIllIIIIIIll.IlIlIIlllIllllllllIIIlIlI, 5, 0, 0.6f).lllIIIllIIIIlllIlIIllIIll("potatoPoisonous").IlIllllllIIlIIllllIIlIIIl("potato_poisonous"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(395, "map", new class_1135().lllIIIllIIIIlllIlIIllIIll("emptyMap").IlIllllllIIlIIllllIIlIIIl("map_empty"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(396, "golden_carrot", new class_1949(6, 1.2f, false).lllIIIllIIIIlllIlIIllIIll("carrotGolden").lllIlIIlIIIlIlIIIllIlllIl(class_0668.llIIlllIllIllllIIIlIIIIII).IlIllllllIIlIIllllIIlIIIl("carrot_golden"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(397, "skull", new class_0946().lllIIIllIIIIlllIlIIllIIll("skull").IlIllllllIIlIIllllIIlIIIl("skull"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(398, "carrot_on_a_stick", new class_2026().lllIIIllIIIIlllIlIIllIIll("carrotOnAStick").IlIllllllIIlIIllllIIlIIIl("carrot_on_a_stick"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(399, "nether_star", new class_0159().lllIIIllIIIIlllIlIIllIIll("netherStar").lllIIIllIIIIlllIlIIllIIll(class_0931.llIIlllIllIllllIIIlIIIIII).IlIllllllIIlIIllllIIlIIIl("nether_star"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(400, "pumpkin_pie", new class_1949(8, 0.3f, false).lllIIIllIIIIlllIlIIllIIll("pumpkinPie").lllIIIllIIIIlllIlIIllIIll(class_0931.IllIIlllllllIIlIIlIIIIlIl).IlIllllllIIlIIllllIIlIIIl("pumpkin_pie"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(401, "fireworks", new class_1492().lllIIIllIIIIlllIlIIllIIll("fireworks").IlIllllllIIlIIllllIIlIIIl("fireworks"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(402, "firework_charge", new class_0374().lllIIIllIIIIlllIlIIllIIll("fireworksCharge").lllIIIllIIIIlllIlIIllIIll(class_0931.lIllllIIlIIIlIllllllIIIll).IlIllllllIIlIIllllIIlIIIl("fireworks_charge"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(403, "enchanted_book", new class_2153().lllIlIIlIIIlIlIIIllIlllIl(1).lllIIIllIIIIlllIlIIllIIll("enchantedBook").IlIllllllIIlIIllllIIlIIIl("book_enchanted"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(404, "comparator", new class_1934(Blocks.lIllIIlllIIIlIlIIIlllIlIl).lllIIIllIIIIlllIlIIllIIll("comparator").lllIIIllIIIIlllIlIIllIIll(class_0931.lIlllIlllIIIIlIIlllIllIII).IlIllllllIIlIIllllIIlIIIl("comparator"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(405, "netherbrick", new Item().lllIIIllIIIIlllIlIIllIIll("netherbrick").lllIIIllIIIIlllIlIIllIIll(class_0931.llIIlllIllIllllIIIlIIIIII).IlIllllllIIlIIllllIIlIIIl("netherbrick"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(406, "quartz", new Item().lllIIIllIIIIlllIlIIllIIll("netherquartz").lllIIIllIIIIlllIlIIllIIll(class_0931.llIIlllIllIllllIIIlIIIIII).IlIllllllIIlIIllllIIlIIIl("quartz"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(407, "tnt_minecart", new class_0341(3).lllIIIllIIIIlllIlIIllIIll("minecartTnt").IlIllllllIIlIIllllIIlIIIl("minecart_tnt"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(408, "hopper_minecart", new class_0341(5).lllIIIllIIIIlllIlIIllIIll("minecartHopper").IlIllllllIIlIIllllIIlIIIl("minecart_hopper"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(417, "iron_horse_armor", new Item().lllIIIllIIIIlllIlIIllIIll("horsearmormetal").lllIlIIlIIIlIlIIIllIlllIl(1).lllIIIllIIIIlllIlIIllIIll(class_0931.lIllllIIlIIIlIllllllIIIll).IlIllllllIIlIIllllIIlIIIl("iron_horse_armor"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(418, "golden_horse_armor", new Item().lllIIIllIIIIlllIlIIllIIll("horsearmorgold").lllIlIIlIIIlIlIIIllIlllIl(1).lllIIIllIIIIlllIlIIllIIll(class_0931.lIllllIIlIIIlIllllllIIIll).IlIllllllIIlIIllllIIlIIIl("gold_horse_armor"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(419, "diamond_horse_armor", new Item().lllIIIllIIIIlllIlIIllIIll("horsearmordiamond").lllIlIIlIIIlIlIIIllIlllIl(1).lllIIIllIIIIlllIlIIllIIll(class_0931.lIllllIIlIIIlIllllllIIIll).IlIllllllIIlIIllllIIlIIIl("diamond_horse_armor"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(420, "lead", new class_0985().lllIIIllIIIIlllIlIIllIIll("leash").IlIllllllIIlIIllllIIlIIIl("lead"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(421, "name_tag", new class_0657().lllIIIllIIIIlllIlIIllIIll("nameTag").IlIllllllIIlIIllllIIlIIIl("name_tag"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(422, "command_block_minecart", new class_0341(6).lllIIIllIIIIlllIlIIllIIll("minecartCommandBlock").IlIllllllIIlIIllllIIlIIIl("minecart_command_block").lllIIIllIIIIlllIlIIllIIll((class_0931)null));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(2256, "record_13", new class_0306("13").lllIIIllIIIIlllIlIIllIIll("record").IlIllllllIIlIIllllIIlIIIl("record_13"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(2257, "record_cat", new class_0306("cat").lllIIIllIIIIlllIlIIllIIll("record").IlIllllllIIlIIllllIIlIIIl("record_cat"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(2258, "record_blocks", new class_0306("blocks").lllIIIllIIIIlllIlIIllIIll("record").IlIllllllIIlIIllllIIlIIIl("record_blocks"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(2259, "record_chirp", new class_0306("chirp").lllIIIllIIIIlllIlIIllIIll("record").IlIllllllIIlIIllllIIlIIIl("record_chirp"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(2260, "record_far", new class_0306("far").lllIIIllIIIIlllIlIIllIIll("record").IlIllllllIIlIIllllIIlIIIl("record_far"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(2261, "record_mall", new class_0306("mall").lllIIIllIIIIlllIlIIllIIll("record").IlIllllllIIlIIllllIIlIIIl("record_mall"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(2262, "record_mellohi", new class_0306("mellohi").lllIIIllIIIIlllIlIIllIIll("record").IlIllllllIIlIIllllIIlIIIl("record_mellohi"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(2263, "record_stal", new class_0306("stal").lllIIIllIIIIlllIlIIllIIll("record").IlIllllllIIlIIllllIIlIIIl("record_stal"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(2264, "record_strad", new class_0306("strad").lllIIIllIIIIlllIlIIllIIll("record").IlIllllllIIlIIllllIIlIIIl("record_strad"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(2265, "record_ward", new class_0306("ward").lllIIIllIIIIlllIlIIllIIll("record").IlIllllllIIlIIllllIIlIIIl("record_ward"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(2266, "record_11", new class_0306("11").lllIIIllIIIIlllIlIIllIIll("record").IlIllllllIIlIIllllIIlIIIl("record_11"));
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(2267, "record_wait", new class_0306("wait").lllIIIllIIIIlllIlIIllIIll("record").IlIllllllIIlIIllllIIlIIIl("record_wait"));
        HashSet hashSet = Sets.newHashSet((Object[])new Block[]{Blocks.lllIIIllIIIIlllIlIIllIIll, Blocks.lIIlllIIIlIIlIllIIIIIlIlI, Blocks.IllIIIIllIIllIllIlllIlIIl, Blocks.IlllIIIlIIlIIIIllllIllllI, Blocks.lllIlIIllllIIllIIIIllIlIl, Blocks.IIIIIllIIlIlIlIIlIlIlIllI, Blocks.lllIIIlIIlIlIllIIIIIlIIll, Blocks.lIIlllIIlIlIlIIIlIlllIIll, Blocks.IllIIIIlIIlllllllllIlIlII, Blocks.llllIllIIIlIllIllllllIlIl, Blocks.IIllIllIIllIIlllIIIlIlllI, Blocks.lIlIIllllIlIIIIllIIIIlIIl, Blocks.lIlIllIIllIIIIlllIlIlllIl, Blocks.llllIIIlIlIlIlIIlIIIIIlIl, Blocks.lIIIllIlIlIlIIIllIlIlIllI, Blocks.IlIlIllIIlIIIIlllIlIllIlI, Blocks.IIlIlIlIIlllIIIlIIIIlIIIl, Blocks.IIIllIIIlIlllllllIIIlllll, Blocks.lIIIlIllllIlllIIIIIllIIIl, Blocks.IIIlIllIlllIlIIIlIlIIllII, Blocks.IlIIIlIIlllllIIIllIlIlIll, Blocks.lIllIIlllIIIlIlIIIlllIlIl, Blocks.IlIIIlIllIIIllIIIIlIIlIll, Blocks.lIIlIIlIllIlIIlIlIIlIlIlI, Blocks.IIIlllIlIIllIIlIlIllIlIIl, Blocks.IlIIIIIllIlllIIIIlIIIllIl, Blocks.IlIIllIlIlIllIIIlIIlIlIIl});
        for (String string : Block.blockRegistry.IlIllllllIIlIIllllIIlIIIl()) {
            class_1272 class_12722;
            Block class_05492 = (Block) Block.blockRegistry.getObject(string);
            if (class_05492 == Blocks.llllllIlIllllIlIlIlIIIIlI) {
                class_12722 = new class_2266(Blocks.llllllIlIllllIlIlIlIIIIlI).lIlllIlllIIIIlIIlllIllIII("cloth");
            } else if (class_05492 == Blocks.llllIIIllIllIIIllIlIIIIIl) {
                class_12722 = new class_2266(Blocks.llllIIIllIllIIIllIlIIIIIl).lIlllIlllIIIIlIIlllIllIII("clayHardenedStained");
            } else if (class_05492 == Blocks.IIIIlIIIIIIIllIlllIIlllII) {
                class_12722 = new class_2266(Blocks.IIIIlIIIIIIIllIlllIIlllII).lIlllIlllIIIIlIIlllIllIII("stainedGlass");
            } else if (class_05492 == Blocks.IIllllllllIlllIIllllllllI) {
                class_12722 = new class_2266(Blocks.IIllllllllIlllIIllllllllI).lIlllIlllIIIIlIIlllIllIII("stainedGlassPane");
            } else if (class_05492 == Blocks.IllIIIIIllIIlllIlIIIlIlll) {
                class_12722 = new class_2266(Blocks.IllIIIIIllIIlllIlIIIlIlll).lIlllIlllIIIIlIIlllIllIII("woolCarpet");
            } else if (class_05492 == Blocks.lIlllIlllIIIIlIIlllIllIII) {
                class_12722 = new class_0408(Blocks.lIlllIlllIIIIlIIlllIllIII, Blocks.lIlllIlllIIIIlIIlllIllIII, class_0741.llllllIlIllllIlIlIlIIIIlI).lIlllIlllIIIIlIIlllIllIII("dirt");
            } else if (class_05492 == Blocks.llIIllIllIlIIlIIllIllllll) {
                class_12722 = new class_0408(Blocks.llIIllIllIlIIlIIllIllllll, Blocks.llIIllIllIlIIlIIllIllllll, class_0447.llllllIlIllllIlIlIlIIIIlI).lIlllIlllIIIIlIIlllIllIII("sand");
            } else if (class_05492 == Blocks.log) {
                class_12722 = new class_0408(Blocks.log, Blocks.log, class_1184.llIlllIIllIlllIlIlIlIIIll).lIlllIlllIIIIlIIlllIllIII("log");
            } else if (class_05492 == Blocks.lIIlIIIIIlIlllIlIIlIlIlll) {
                class_12722 = new class_0408(Blocks.lIIlIIIIIlIlllIlIIlIlIlll, Blocks.lIIlIIIIIlIlllIlIIlIlIlll, class_0737.llIlllIIllIlllIlIlIlIIIll).lIlllIlllIIIIlIIlllIllIII("log");
            } else if (class_05492 == Blocks.lIllllIIlIIIlIllllllIIIll) {
                class_12722 = new class_0408(Blocks.lIllllIIlIIIlIllllllIIIll, Blocks.lIllllIIlIIIlIllllllIIIll, class_0691.llllllIlIllllIlIlIlIIIIlI).lIlllIlllIIIIlIIlllIllIII("wood");
            } else if (class_05492 == Blocks.lIIIIlIlIlIIIlIIllIIlIlIl) {
                class_12722 = new class_0408(Blocks.lIIIIlIlIlIIIlIIllIIlIlIl, Blocks.lIIIIlIlIlIIIlIIllIIlIlIl, class_0273.llllllIlIllllIlIlIlIIIIlI).lIlllIlllIIIIlIIlllIllIII("monsterStoneEgg");
            } else if (class_05492 == Blocks.lllllIllllIIIIllIIlIlIlII) {
                class_12722 = new class_0408(Blocks.lllllIllllIIIIllIIlIlIlII, Blocks.lllllIllllIIIIllIIlIlIlII, class_1020.llllllIlIllllIlIlIlIIIIlI).lIlllIlllIIIIlIIlllIllIII("stonebricksmooth");
            } else if (class_05492 == Blocks.IlIIlllllIIlIlIlllllIllll) {
                class_12722 = new class_0408(Blocks.IlIIlllllIIlIlIlllllIllll, Blocks.IlIIlllllIIlIlIlllllIllll, class_2125.llllllIlIllllIlIlIlIIIIlI).lIlllIlllIIIIlIIlllIllIII("sandStone");
            } else if (class_05492 == Blocks.IIlIlIIIlIIllIlIlIlIlIIll) {
                class_12722 = new class_0408(Blocks.IIlIlIIIlIIllIlIlIlIlIIll, Blocks.IIlIlIIIlIIllIlIlIlIlIIll, class_0865.llllllIlIllllIlIlIlIIIIlI).lIlllIlllIIIIlIIlllIllIII("quartzBlock");
            } else if (class_05492 == Blocks.IIIIlIlIIlIIIIlIlllIlIIII) {
                class_12722 = new class_0257(Blocks.IIIIlIlIIlIIIIlIlllIlIIII, Blocks.IIIIlIlIIlIIIIlIlllIlIIII, Blocks.llllIlIIIIIIIIIlllIIlIIIl, false).lIlllIlllIIIIlIIlllIllIII("stoneSlab");
            } else if (class_05492 == Blocks.llllIlIIIIIIIIIlllIIlIIIl) {
                class_12722 = new class_0257(Blocks.llllIlIIIIIIIIIlllIIlIIIl, Blocks.IIIIlIlIIlIIIIlIlllIlIIII, Blocks.llllIlIIIIIIIIIlllIIlIIIl, true).lIlllIlllIIIIlIIlllIllIII("stoneSlab");
            } else if (class_05492 == Blocks.lIIlIlllIIlllIIlllIIlIlII) {
                class_12722 = new class_0257(Blocks.lIIlIlllIIlllIIlllIIlIlII, Blocks.lIIlIlllIIlllIIlllIIlIlII, Blocks.lllIIIlllIlllIIlIllllIIlI, false).lIlllIlllIIIIlIIlllIllIII("woodSlab");
            } else if (class_05492 == Blocks.lllIIIlllIlllIIlIllllIIlI) {
                class_12722 = new class_0257(Blocks.lllIIIlllIlllIIlIllllIIlI, Blocks.lIIlIlllIIlllIIlllIIlIlII, Blocks.lllIIIlllIlllIIlIllllIIlI, true).lIlllIlllIIIIlIIlllIllIII("woodSlab");
            } else if (class_05492 == Blocks.IIIllIIlIIIIIIlIlIIllIIlI) {
                class_12722 = new class_0408(Blocks.IIIllIIlIIIIIIlIlIIllIIlI, Blocks.IIIllIIlIIIIIIlIlIIllIIlI, class_1851.llllllIlIllllIlIlIlIIIIlI).lIlllIlllIIIIlIIlllIllIII("sapling");
            } else if (class_05492 == Blocks.lIlIlIIlIIIIlIIIIIlllIIII) {
                class_12722 = new class_2236(Blocks.lIlIlIIlIIIIlIIIIIlllIIII).lIlllIlllIIIIlIIlllIllIII("leaves");
            } else if (class_05492 == Blocks.IlIIIlIIIIllIIIllIIIIIIll) {
                class_12722 = new class_2236(Blocks.IlIIIlIIIIllIIIllIIIIIIll).lIlllIlllIIIIlIIlllIllIII("leaves");
            } else if (class_05492 == Blocks.lIIlIlllIIlIIIIlIlIIIIlll) {
                class_12722 = new class_2033(Blocks.lIIlIlllIIlIIIIlIlIIIIlll, false);
            } else if (class_05492 == Blocks.IlIlIIlllIllllllllIIIlIlI) {
                class_12722 = new class_2033(Blocks.IlIlIIlllIllllllllIIIlIlI, true).lllIIIllIIIIlllIlIIllIIll(new String[]{"shrub", "grass", "fern"});
            } else if (class_05492 == Blocks.llIlllIIllIlllIlIlIlIIIll) {
                class_12722 = new class_0408(Blocks.llIlllIIllIlllIlIlIlIIIll, Blocks.llIlllIIllIlllIlIlIlIIIll, class_1209.lIlIIllllIlIIIIllIIIIlIIl).lIlllIlllIIIIlIIlllIllIII("flower");
            } else if (class_05492 == Blocks.IIIIlIIlIIIllIIIIllIIIlII) {
                class_12722 = new class_0408(Blocks.IIIIlIIlIIIllIIIIllIIIlII, Blocks.IIIIlIIlIIIllIIIIllIIIlII, class_1209.llllllIlIllllIlIlIlIIIIlI).lIlllIlllIIIIlIIlllIllIII("rose");
            } else if (class_05492 == Blocks.lIIllIIlIIIlllIlllIIlIIlI) {
                class_12722 = new class_0888(Blocks.lIIllIIlIIIlllIlllIIlIIlI, Blocks.lIIllIIlIIIlllIlllIIlIIlI);
            } else if (class_05492 == Blocks.IlIIIIIIIIIIlIIlllIIIlIlI) {
                class_12722 = new class_0498(Blocks.IlIIIIIIIIIIlIIlllIIIlIlI);
            } else if (class_05492 == Blocks.llIIIIllIIIIIIIlIIIlIIIIl) {
                class_12722 = new class_2205(Blocks.llIIIIllIIIIIIIlIIIlIIIIl);
            } else if (class_05492 == Blocks.llIIIlllIlllIlIllIIIIllIl) {
                class_12722 = new class_2205(Blocks.llIIIlllIlllIlIllIIIIllIl);
            } else if (class_05492 == Blocks.lIllIIlIlllIllIlIlIlIllII) {
                class_12722 = new class_0408(Blocks.lIllIIlIlllIllIlIlIlIllII, Blocks.lIllIIlIlllIllIlIlIlIllII, class_1482.llllllIlIllllIlIlIlIIIIlI).lIlllIlllIIIIlIIlllIllIII("cobbleWall");
            } else if (class_05492 == Blocks.llIlllllIIlIIlIIllllIllll) {
                class_12722 = new class_1468(Blocks.llIlllllIIlIIlIIllllIllll).lIlllIlllIIIIlIIlllIllIII("anvil");
            } else if (class_05492 == Blocks.IIIlIlIIlIIlIlIIIIIlIlIlI) {
                class_12722 = new class_0473((Block) Blocks.IIIlIlIIlIIlIlIIIIIlIlIlI, Blocks.IIIlIlIIlIIlIlIIIIIlIlIlI, class_1487.llllllIlIllllIlIlIlIIIIlI).lIlllIlllIIIIlIIlllIllIII("doublePlant");
            } else {
                if (hashSet.contains(class_05492)) continue;
                class_12722 = new class_1272(class_05492);
            }
            lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(Block.lllIIIllIIIIlllIlIIllIIll(class_05492), string, class_12722);
        }
    }

    public Item lllIlIIlIIIlIlIIIllIlllIl(int n) {
        this.lIlllIlllIIIIlIIlllIllIII = n;
        return this;
    }

    public int lllIlIIlIIIlIlIIIllIlllIl() {
        return 1;
    }

    public class_2102 IlIllllllIIlIIllllIIlIIIl(int n) {
        return this.IIIllIIlIIIIIIlIlIIllIIlI;
    }

    public final class_2102 lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972) {
        return this.IlIllllllIIlIIllllIIlIIIl(class_08972.IllIIIllIIIIlIlIlIllIIlll());
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, class_0814 class_08142, class_1334 class_13342, int n, int n2, int n3, int n4, float f, float f2, float f3) {
        return false;
    }

    public float lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, Block class_05492) {
        return 1.0f;
    }

    public ItemStack lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, class_1334 class_13342, class_0814 class_08142) {
        return class_08972;
    }

    public ItemStack lllIlIIlIIIlIlIIIllIlllIl(ItemStack class_08972, class_1334 class_13342, class_0814 class_08142) {
        return class_08972;
    }

    public int IlIllllllIIlIIllllIIlIIIl() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    public int lIlllIlllIIIIlIIlllIllIII(int n) {
        return 0;
    }

    public boolean lIlllIlllIIIIlIIlllIllIII() {
        return this.lIllllIIlIIIlIllllllIIIll;
    }

    protected Item lllIIIllIIIIlllIlIIllIIll(boolean bl) {
        this.lIllllIIlIIIlIllllllIIIll = bl;
        return this;
    }

    public int IlIIIIIllllllIIlllIllllll() {
        return this.IllIIIllIIIIlIlIlIllIIlll;
    }

    protected Item IlIIIIIllllllIIlllIllllll(int n) {
        this.IllIIIllIIIIlIlIlIllIIlll = n;
        return this;
    }

    public boolean lIllllIIlIIIlIllllllIIIll() {
        return this.IllIIIllIIIIlIlIlIllIIlll > 0 && !this.lIllllIIlIIIlIllllllIIIll;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, class_1965 class_19652, class_1965 class_19653) {
        return false;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, class_1334 class_13342, Block class_05492, int n, int n2, int n3, class_1965 class_19652) {
        return false;
    }

    public boolean lllIlIIlIIIlIlIIIllIlllIl(Block class_05492) {
        return false;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, class_0814 class_08142, class_1965 class_19652) {
        return false;
    }

    public Item IIIllIIlIIIIIIlIlIIllIIlI() {
        this.IlIIIIIllllllIIlllIllllll = true;
        return this;
    }

    public boolean IllIIlllllllIIlIIlIIIIlIl() {
        return this.IlIIIIIllllllIIlllIllllll;
    }

    public boolean IIIllIllIIlIlIlIlIllllIIl() {
        return false;
    }

    public Item lllIIIllIIIIlllIlIIllIIll(String string) {
        this.llIIllIllIlIIlIIllIllllll = string;
        return this;
    }

    public String lllIlIIlIIIlIlIIIllIlllIl(ItemStack class_08972) {
        String string = this.IlIllllllIIlIIllllIIlIIIl(class_08972);
        return string == null ? "" : class_1586.lllIIIllIIIIlllIlIIllIIll(string);
    }

    public String IllIIIllIIIIlIlIlIllIIlll() {
        return "item." + this.llIIllIllIlIIlIIllIllllll;
    }

    public String IlIllllllIIlIIllllIIlIIIl(ItemStack class_08972) {
        return "item." + this.llIIllIllIlIIlIIllIllllll;
    }

    public Item lllIlIIlIIIlIlIIIllIlllIl(Item class_06112) {
        this.lIIIIlIlIIlllllIIllIIlIII = class_06112;
        return this;
    }

    public boolean lIlllIlllIIIIlIIlllIllIII(ItemStack class_08972) {
        return true;
    }

    public boolean lIIIIlIlIIlllllIIllIIlIII() {
        return true;
    }

    public Item llIIlllIllIllllIIIlIIIIII() {
        return this.lIIIIlIlIIlllllIIllIIlIII;
    }

    public boolean llIIllIllIlIIlIIllIllllll() {
        return this.lIIIIlIlIIlllllIIllIIlIII != null;
    }

    public int lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, int n) {
        return 0xFFFFFF;
    }

    public void lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, class_1334 class_13342, class_1521 class_15212, int n, boolean bl) {
    }

    public void IlIllllllIIlIIllllIIlIIIl(ItemStack class_08972, class_1334 class_13342, class_0814 class_08142) {
    }

    public boolean lllIIlIIIllllllIIIIlIlIlI() {
        return false;
    }

    public class_1484 IlIIIIIllllllIIlllIllllll(ItemStack class_08972) {
        return class_1484.lllIIIllIIIIlllIlIIllIIll;
    }

    public int lIllllIIlIIIlIllllllIIIll(ItemStack class_08972) {
        return 0;
    }

    public void lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, class_1334 class_13342, class_0814 class_08142, int n) {
    }

    protected Item lllIlIIlIIIlIlIIIllIlllIl(String string) {
        this.llIIlllIllIllllIIIlIIIIII = string;
        return this;
    }

    public String IIIllIIlIIIIIIlIlIIllIIlI(ItemStack class_08972) {
        return this.llIIlllIllIllllIIIlIIIIII;
    }

    public boolean IllIIlllllllIIlIIlIIIIlIl(ItemStack class_08972) {
        return this.IIIllIIlIIIIIIlIlIIllIIlI(class_08972) != null;
    }

    public void lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, class_0814 class_08142, List list, boolean bl) {
    }

    public String IIIllIllIIlIlIlIlIllllIIl(ItemStack class_08972) {
        return ("" + class_1586.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl(class_08972) + ".name")).trim();
    }

    public boolean IllIIIllIIIIlIlIlIllIIlll(ItemStack class_08972) {
        return class_08972.llIllllIlIllIIIlIllIIlIlI();
    }

    public class_0552 lIIIIlIlIIlllllIIllIIlIII(ItemStack class_08972) {
        return class_08972.llIllllIlIllIIIlIllIIlIlI() ? class_0552.IlIllllllIIlIIllllIIlIIIl : class_0552.lllIIIllIIIIlllIlIIllIIll;
    }

    public boolean llIIlllIllIllllIIIlIIIIII(ItemStack class_08972) {
        return this.IlIllllllIIlIIllllIIlIIIl() == 1 && this.lIllllIIlIIIlIllllllIIIll();
    }

    protected class_1112 lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, class_0814 class_08142, boolean bl) {
        float f = 1.0f;
        float f2 = class_08142.llIIIIllIIIIIIIlIIIlIIIIl + (class_08142.IlIlIIlllIllllllllIIIlIlI - class_08142.llIIIIllIIIIIIIlIIIlIIIIl) * f;
        float f3 = class_08142.llllIIIIlIIIlIIIIIIlIllll + (class_08142.IIIIlIllIlIIlIIlIllIlIlll - class_08142.llllIIIIlIIIlIIIIIIlIllll) * f;
        double d = class_08142.llIIlIllIllllIlIIIIlIIlll + (class_08142.IlIIlllllIIlIlIlllllIllll - class_08142.llIIlIllIllllIlIIIIlIIlll) * (double)f;
        double d2 = class_08142.llIllllIlIllIIIlIllIIlIlI + (class_08142.llIIlIlIlllIIllIlIlllIllI - class_08142.llIllllIlIllIIIlIllIIlIlI) * (double)f + 1.62 - (double)class_08142.llllIlIIIIIIIIIlllIIlIIIl;
        double d3 = class_08142.lIlllIlllIlIIIIlllIlIlIIl + (class_08142.IllIIIIllIIllIllIlllIlIIl - class_08142.lIlllIlllIlIIIIlllIlIlIIl) * (double)f;
        class_0864 class_08642 = class_0864.lllIIIllIIIIlllIlIIllIIll(d, d2, d3);
        float f4 = MathHelper.lllIlIIlIIIlIlIIIllIlllIl(-f3 * ((float)Math.PI / 180) - (float)Math.PI);
        float f5 = MathHelper.lllIIIllIIIIlllIlIIllIIll(-f3 * ((float)Math.PI / 180) - (float)Math.PI);
        float f6 = -MathHelper.lllIlIIlIIIlIlIIIllIlllIl(-f2 * ((float)Math.PI / 180));
        float f7 = MathHelper.lllIIIllIIIIlllIlIIllIIll(-f2 * ((float)Math.PI / 180));
        float f8 = f5 * f6;
        float f9 = f4 * f6;
        double d4 = 5.0;
        class_0864 class_08643 = class_08642.IlIllllllIIlIIllllIIlIIIl((double)f8 * d4, (double)f7 * d4, (double)f9 * d4);
        return class_13342.lllIIIllIIIIlllIlIIllIIll(class_08642, class_08643, bl, !bl, false);
    }

    public int IlIlllIIIIIIlIIllIIllIlll() {
        return 0;
    }

    public boolean IlIlIIlIlIllIIlIlIIllIIIl() {
        return false;
    }

    public class_2102 lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        return this.IlIllllllIIlIIllllIIlIIIl(n);
    }

    public void lllIIIllIIIIlllIlIIllIIll(Item class_06112, class_0931 class_09312, List list) {
        list.add(new ItemStack(class_06112, 1, 0));
    }

    public class_0931 lllllIlllIIllIlIIlIIIllII() {
        return this.IIIllIllIIlIlIlIlIllllIIl;
    }

    public Item lllIIIllIIIIlllIlIIllIIll(class_0931 class_09312) {
        this.IIIllIllIIlIlIlIlIllllIIl = class_09312;
        return this;
    }

    public boolean IlIlIIlllIIlIllIIIlllllIl() {
        return true;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, ItemStack class_08973) {
        return false;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
        this.IIIllIIlIIIIIIlIlIIllIIlI = class_08872.lllIIIllIIIIlllIlIIllIIll(this.lIlIlIIlIIIIlIIIIIlllIIII());
    }

    public Multimap lIIlIIIIIlIlllIlIIlIlIlll() {
        return HashMultimap.create();
    }

    protected Item IlIllllllIIlIIllllIIlIIIl(String string) {
        this.IllIIlllllllIIlIIlIIIIlIl = string;
        return this;
    }

    protected String lIlIlIIlIIIIlIIIIIlllIIII() {
        return this.IllIIlllllllIIlIIlIIIIlIl == null ? "MISSING_ICON_ITEM_" + lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl(this) + "_" + this.llIIllIllIlIIlIIllIllllll : this.IllIIlllllllIIlIIlIIIIlIl;
    }
}

