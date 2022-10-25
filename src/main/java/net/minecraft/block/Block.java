package net.minecraft.block;/*
 * Decompiled with CFR 0.150.
 */
import com.moonsworth.lunar.client.LunarClient;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import obf.*;

import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Block {
    public static final class_1921 blockRegistry = new class_0560("air");
    private class_0931 llllllIlIllllIlIlIlIIIIlI;
    protected String lllIlIIlIIIlIlIIIllIlllIl;
    public static final class_1031 IlIllllllIIlIIllllIIlIIIl = new class_1031("stone", 1.0f, 1.0f);
    public static final class_1031 lIlllIlllIIIIlIIlllIllIII = new class_1031("wood", 1.0f, 1.0f);
    public static final class_1031 IlIIIIIllllllIIlllIllllll = new class_1031("gravel", 1.0f, 1.0f);
    public static final class_1031 lIllllIIlIIIlIllllllIIIll = new class_1031("grass", 1.0f, 1.0f);
    public static final class_1031 IIIllIIlIIIIIIlIlIIllIIlI = new class_1031("stone", 1.0f, 1.0f);
    public static final class_1031 IllIIlllllllIIlIIlIIIIlIl = new class_1031("stone", 1.0f, 1.5f);
    public static final class_1031 IIIllIllIIlIlIlIlIllllIIl = new class_1148("stone", 1.0f, 1.0f);
    public static final class_1031 IllIIIllIIIIlIlIlIllIIlll = new class_1031("cloth", 1.0f, 1.0f);
    public static final class_1031 lIIIIlIlIIlllllIIllIIlIII = new class_1031("sand", 1.0f, 1.0f);
    public static final class_1031 llIIlllIllIllllIIIlIIIIII = new class_1031("snow", 1.0f, 1.0f);
    public static final class_1031 llIIllIllIlIIlIIllIllllll = new class_1786("ladder", 1.0f, 1.0f);
    public static final class_1031 lllIIlIIIllllllIIIIlIlIlI = new class_0393("anvil", 0.3f, 1.0f);
    protected boolean IlIlllIIIIIIlIIllIIllIlll;
    protected int IlIlIIlIlIllIIlIlIIllIIIl;
    protected boolean lllllIlllIIllIlIIlIIIllII;
    protected int IlIlIIlllIIlIllIIIlllllIl;
    protected boolean lIIlIIIIIlIlllIlIIlIlIlll;
    protected float lIlIlIIlIIIIlIIIIIlllIIII;
    protected float IlIIIlIIIIllIIIllIIIIIIll;
    protected boolean IIlllIlIlllIllIIIlllIIlIl = true;
    protected boolean lIlIllIIlIIlIIlIIlIIlIIll = true;
    protected boolean llIIlIllIllllIlIIIIlIIlll;
    protected boolean llIllllIlIllIIIlIllIIlIlI;
    protected double lIlllIlllIlIIIIlllIlIlIIl;
    protected double IlIIlllllIIlIlIlllllIllll;
    protected double llIIlIlIlllIIllIlIlllIllI;
    protected double IllIIIIllIIllIllIlllIlIIl;
    protected double IIIIIIIIlIllIIllIIlllIllI;
    protected double IIlIIlIlIlIllIIlIlIIIIlll;
    public class_1031 llIIIlllIlllIlIllIIIIllIl = IlIllllllIIlIIllllIIlIIIl;
    public float IIIIlIllIlIIlIIlIllIlIlll = 1.0f;
    protected final class_1855 IlIlIIlllIllllllllIIIlIlI;
    public float llllIIIIlIIIlIIIIIIlIllll = 0.6f;
    private String lIlIIllllIlIIIIllIIIIlIIl;
    protected IIcon llIIIIllIIIIIIIlIIIlIIIIl;
    public static IIcon IIllIllIIllIIlllIIIlIlllI;

    public static int lllIIIllIIIIlllIlIIllIIll(Block class_05492) {
        return blockRegistry.IlIllllllIIlIIllllIIlIIIl(class_05492);
    }

    public static Block lllIIIllIIIIlllIlIIllIIll(int n) {
        return (Block) blockRegistry.lllIIIllIIIIlllIlIIllIIll(n);
    }

    public static Block lllIIIllIIIIlllIlIIllIIll(Item class_06112) {
        return Block.lllIIIllIIIIlllIlIIllIIll(Item.lllIIIllIIIIlllIlIIllIIll(class_06112));
    }

    public static Block lllIIIllIIIIlllIlIIllIIll(String string) {
        if (blockRegistry.lllIlIIlIIIlIlIIIllIlllIl(string)) {
            return (Block) blockRegistry.getObject(string);
        }
        try {
            return (Block) blockRegistry.lllIIIllIIIIlllIlIIllIIll(Integer.parseInt(string));
        }
        catch (NumberFormatException numberFormatException) {
            return null;
        }
    }

    public boolean lllIIIllIIIIlllIlIIllIIll() {
        return this.IlIlllIIIIIIlIIllIIllIlll;
    }

    public int lllIlIIlIIIlIlIIIllIlllIl() {
        return this.IlIlIIlIlIllIIlIlIIllIIIl;
    }

    public boolean IlIllllllIIlIIllllIIlIIIl() {
        return this.lllllIlllIIllIlIIlIIIllII;
    }

    public int lIlllIlllIIIIlIIlllIllIII() {
        return LunarClient.getInstance().getModuleManager().lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(Block.lllIIIllIIIIlllIlIIllIIll(this), true) ? this.IlIlIIlllIIlIllIIIlllllIl : 15;
    }

    public boolean IlIIIIIllllllIIlllIllllll() {
        return this.lIIlIIIIIlIlllIlIIlIlIlll;
    }

    public class_1855 lIllllIIlIIIlIllllllIIIll() {
        return this.IlIlIIlllIllllllllIIIlIlI;
    }

    public class_1662 lllIlIIlIIIlIlIIIllIlllIl(int n) {
        return this.lIllllIIlIIIlIllllllIIIll().lllllIlllIIllIlIIlIIIllII();
    }

    public static void registerBlocks() {
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(0, "air", new class_0074().lllIlIIlIIIlIlIIIllIlllIl("air"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(1, "stone", new class_0745().IlIllllllIIlIIllllIIlIIIl(1.5f).lllIlIIlIIIlIlIIIllIlllIl(10.0f).lllIIIllIIIIlllIlIIllIIll(IIIllIIlIIIIIIlIlIIllIIlI).lllIlIIlIIIlIlIIIllIlllIl("stone").IlIllllllIIlIIllllIIlIIIl("stone"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(2, "grass", new class_0876().IlIllllllIIlIIllllIIlIIIl(0.6f).lllIIIllIIIIlllIlIIllIIll(lIllllIIlIIIlIllllllIIIll).lllIlIIlIIIlIlIIIllIlllIl("grass").IlIllllllIIlIIllllIIlIIIl("grass"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(3, "dirt", new class_0741().IlIllllllIIlIIllllIIlIIIl(0.5f).lllIIIllIIIIlllIlIIllIIll(IlIIIIIllllllIIlllIllllll).lllIlIIlIIIlIlIIIllIlllIl("dirt").IlIllllllIIlIIllllIIlIIIl("dirt"));
        Block class_05492 = new Block(class_1855.IlIIIIIllllllIIlllIllllll).IlIllllllIIlIIllllIIlIIIl(2.0f).lllIlIIlIIIlIlIIIllIlllIl(10.0f).lllIIIllIIIIlllIlIIllIIll(IIIllIIlIIIIIIlIlIIllIIlI).lllIlIIlIIIlIlIIIllIlllIl("stonebrick").lllIIIllIIIIlllIlIIllIIll(class_0931.lllIlIIlIIIlIlIIIllIlllIl).IlIllllllIIlIIllllIIlIIIl("cobblestone");
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(4, "cobblestone", class_05492);
        Block class_05493 = new class_0691().IlIllllllIIlIIllllIIlIIIl(2.0f).lllIlIIlIIIlIlIIIllIlllIl(5.0f).lllIIIllIIIIlllIlIIllIIll(lIlllIlllIIIIlIIlllIllIII).lllIlIIlIIIlIlIIIllIlllIl("wood").IlIllllllIIlIIllllIIlIIIl("planks");
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(5, "planks", class_05493);
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(6, "sapling", new class_1851().IlIllllllIIlIIllllIIlIIIl(0.0f).lllIIIllIIIIlllIlIIllIIll(lIllllIIlIIIlIllllllIIIll).lllIlIIlIIIlIlIIIllIlllIl("sapling").IlIllllllIIlIIllllIIlIIIl("sapling"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(7, "bedrock", new Block(class_1855.IlIIIIIllllllIIlllIllllll).llIIlllIllIllllIIIlIIIIII().lllIlIIlIIIlIlIIIllIlllIl(6000000.0f).lllIIIllIIIIlllIlIIllIIll(IIIllIIlIIIIIIlIlIIllIIlI).lllIlIIlIIIlIlIIIllIlllIl("bedrock").IIlIIlIlIlIllIIlIlIIIIlll().lllIIIllIIIIlllIlIIllIIll(class_0931.lllIlIIlIIIlIlIIIllIlllIl).IlIllllllIIlIIllllIIlIIIl("bedrock"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(8, "flowing_water", new class_1060(class_1855.IllIIlllllllIIlIIlIIIIlIl).IlIllllllIIlIIllllIIlIIIl(100.0f).IlIllllllIIlIIllllIIlIIIl(3).lllIlIIlIIIlIlIIIllIlllIl("water").IIlIIlIlIlIllIIlIlIIIIlll().IlIllllllIIlIIllllIIlIIIl("water_flow"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(9, "water", new class_1856(class_1855.IllIIlllllllIIlIIlIIIIlIl).IlIllllllIIlIIllllIIlIIIl(100.0f).IlIllllllIIlIIllllIIlIIIl(3).lllIlIIlIIIlIlIIIllIlllIl("water").IIlIIlIlIlIllIIlIlIIIIlll().IlIllllllIIlIIllllIIlIIIl("water_still"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(10, "flowing_lava", new class_1060(class_1855.IIIllIllIIlIlIlIlIllllIIl).IlIllllllIIlIIllllIIlIIIl(100.0f).lllIIIllIIIIlllIlIIllIIll(1.0f).lllIlIIlIIIlIlIIIllIlllIl("lava").IIlIIlIlIlIllIIlIlIIIIlll().IlIllllllIIlIIllllIIlIIIl("lava_flow"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(11, "lava", new class_1856(class_1855.IIIllIllIIlIlIlIlIllllIIl).IlIllllllIIlIIllllIIlIIIl(100.0f).lllIIIllIIIIlllIlIIllIIll(1.0f).lllIlIIlIIIlIlIIIllIlllIl("lava").IIlIIlIlIlIllIIlIlIIIIlll().IlIllllllIIlIIllllIIlIIIl("lava_still"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(12, "sand", new class_0447().IlIllllllIIlIIllllIIlIIIl(0.5f).lllIIIllIIIIlllIlIIllIIll(lIIIIlIlIIlllllIIllIIlIII).lllIlIIlIIIlIlIIIllIlllIl("sand").IlIllllllIIlIIllllIIlIIIl("sand"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(13, "gravel", new class_0740().IlIllllllIIlIIllllIIlIIIl(0.6f).lllIIIllIIIIlllIlIIllIIll(IlIIIIIllllllIIlllIllllll).lllIlIIlIIIlIlIIIllIlllIl("gravel").IlIllllllIIlIIllllIIlIIIl("gravel"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(14, "gold_ore", new class_2130().IlIllllllIIlIIllllIIlIIIl(3.0f).lllIlIIlIIIlIlIIIllIlllIl(5.0f).lllIIIllIIIIlllIlIIllIIll(IIIllIIlIIIIIIlIlIIllIIlI).lllIlIIlIIIlIlIIIllIlllIl("oreGold").IlIllllllIIlIIllllIIlIIIl("gold_ore"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(15, "iron_ore", new class_2130().IlIllllllIIlIIllllIIlIIIl(3.0f).lllIlIIlIIIlIlIIIllIlllIl(5.0f).lllIIIllIIIIlllIlIIllIIll(IIIllIIlIIIIIIlIlIIllIIlI).lllIlIIlIIIlIlIIIllIlllIl("oreIron").IlIllllllIIlIIllllIIlIIIl("iron_ore"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(16, "coal_ore", new class_2130().IlIllllllIIlIIllllIIlIIIl(3.0f).lllIlIIlIIIlIlIIIllIlllIl(5.0f).lllIIIllIIIIlllIlIIllIIll(IIIllIIlIIIIIIlIlIIllIIlI).lllIlIIlIIIlIlIIIllIlllIl("oreCoal").IlIllllllIIlIIllllIIlIIIl("coal_ore"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(17, "log", new class_1184().lllIlIIlIIIlIlIIIllIlllIl("log").IlIllllllIIlIIllllIIlIIIl("log"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(18, "leaves", new class_0133().lllIlIIlIIIlIlIIIllIlllIl("leaves").IlIllllllIIlIIllllIIlIIIl("leaves"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(19, "sponge", new class_1897().IlIllllllIIlIIllllIIlIIIl(0.6f).lllIIIllIIIIlllIlIIllIIll(lIllllIIlIIIlIllllllIIIll).lllIlIIlIIIlIlIIIllIlllIl("sponge").IlIllllllIIlIIllllIIlIIIl("sponge"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(20, "glass", new class_0166(class_1855.lIIlIIIIIlIlllIlIIlIlIlll, false).IlIllllllIIlIIllllIIlIIIl(0.3f).lllIIIllIIIIlllIlIIllIIll(IIIllIllIIlIlIlIlIllllIIl).lllIlIIlIIIlIlIIIllIlllIl("glass").IlIllllllIIlIIllllIIlIIIl("glass"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(21, "lapis_ore", new class_2130().IlIllllllIIlIIllllIIlIIIl(3.0f).lllIlIIlIIIlIlIIIllIlllIl(5.0f).lllIIIllIIIIlllIlIIllIIll(IIIllIIlIIIIIIlIlIIllIIlI).lllIlIIlIIIlIlIIIllIlllIl("oreLapis").IlIllllllIIlIIllllIIlIIIl("lapis_ore"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(22, "lapis_block", new class_1534(class_1662.IlIlIIlllIllllllllIIIlIlI).IlIllllllIIlIIllllIIlIIIl(3.0f).lllIlIIlIIIlIlIIIllIlllIl(5.0f).lllIIIllIIIIlllIlIIllIIll(IIIllIIlIIIIIIlIlIIllIIlI).lllIlIIlIIIlIlIIIllIlllIl("blockLapis").lllIIIllIIIIlllIlIIllIIll(class_0931.lllIlIIlIIIlIlIIIllIlllIl).IlIllllllIIlIIllllIIlIIIl("lapis_block"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(23, "dispenser", new BlockDispenser().IlIllllllIIlIIllllIIlIIIl(3.5f).lllIIIllIIIIlllIlIIllIIll(IIIllIIlIIIIIIlIlIIllIIlI).lllIlIIlIIIlIlIIIllIlllIl("dispenser").IlIllllllIIlIIllllIIlIIIl("dispenser"));
        Block class_05494 = new class_2125().lllIIIllIIIIlllIlIIllIIll(IIIllIIlIIIIIIlIlIIllIIlI).IlIllllllIIlIIllllIIlIIIl(0.8f).lllIlIIlIIIlIlIIIllIlllIl("sandStone").IlIllllllIIlIIllllIIlIIIl("sandstone");
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(24, "sandstone", class_05494);
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(25, "noteblock", new class_0639().IlIllllllIIlIIllllIIlIIIl(0.8f).lllIlIIlIIIlIlIIIllIlllIl("musicBlock").IlIllllllIIlIIllllIIlIIIl("noteblock"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(26, "bed", new class_0736().IlIllllllIIlIIllllIIlIIIl(0.2f).lllIlIIlIIIlIlIIIllIlllIl("bed").IIlIIlIlIlIllIIlIlIIIIlll().IlIllllllIIlIIllllIIlIIIl("bed"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(27, "golden_rail", new class_1604().IlIllllllIIlIIllllIIlIIIl(0.7f).lllIIIllIIIIlllIlIIllIIll(IllIIlllllllIIlIIlIIIIlIl).lllIlIIlIIIlIlIIIllIlllIl("goldenRail").IlIllllllIIlIIllllIIlIIIl("rail_golden"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(28, "detector_rail", new class_1990().IlIllllllIIlIIllllIIlIIIl(0.7f).lllIIIllIIIIlllIlIIllIIll(IllIIlllllllIIlIIlIIIIlIl).lllIlIIlIIIlIlIIIllIlllIl("detectorRail").IlIllllllIIlIIllllIIlIIIl("rail_detector"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(29, "sticky_piston", new class_1039(true).lllIlIIlIIIlIlIIIllIlllIl("pistonStickyBase"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(30, "web", new class_1875().IlIllllllIIlIIllllIIlIIIl(1).IlIllllllIIlIIllllIIlIIIl(4.0f).lllIlIIlIIIlIlIIIllIlllIl("web").IlIllllllIIlIIllllIIlIIIl("web"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(31, "tallgrass", new class_0373().IlIllllllIIlIIllllIIlIIIl(0.0f).lllIIIllIIIIlllIlIIllIIll(lIllllIIlIIIlIllllllIIIll).lllIlIIlIIIlIlIIIllIlllIl("tallgrass"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(32, "deadbush", new class_1125().IlIllllllIIlIIllllIIlIIIl(0.0f).lllIIIllIIIIlllIlIIllIIll(lIllllIIlIIIlIllllllIIIll).lllIlIIlIIIlIlIIIllIlllIl("deadbush").IlIllllllIIlIIllllIIlIIIl("deadbush"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(33, "piston", new class_1039(false).lllIlIIlIIIlIlIIIllIlllIl("pistonBase"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(34, "piston_head", new class_1042());
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(35, "wool", new class_0974(class_1855.lllIIlIIIllllllIIIIlIlIlI).IlIllllllIIlIIllllIIlIIIl(0.8f).lllIIIllIIIIlllIlIIllIIll(IllIIIllIIIIlIlIlIllIIlll).lllIlIIlIIIlIlIIIllIlllIl("cloth").IlIllllllIIlIIllllIIlIIIl("wool_colored"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(36, "piston_extension", new class_1293());
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(37, "yellow_flower", new class_1209(0).IlIllllllIIlIIllllIIlIIIl(0.0f).lllIIIllIIIIlllIlIIllIIll(lIllllIIlIIIlIllllllIIIll).lllIlIIlIIIlIlIIIllIlllIl("flower1").IlIllllllIIlIIllllIIlIIIl("flower_dandelion"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(38, "red_flower", new class_1209(1).IlIllllllIIlIIllllIIlIIIl(0.0f).lllIIIllIIIIlllIlIIllIIll(lIllllIIlIIIlIllllllIIIll).lllIlIIlIIIlIlIIIllIlllIl("flower2").IlIllllllIIlIIllllIIlIIIl("flower_rose"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(39, "brown_mushroom", new class_1390().IlIllllllIIlIIllllIIlIIIl(0.0f).lllIIIllIIIIlllIlIIllIIll(lIllllIIlIIIlIllllllIIIll).lllIIIllIIIIlllIlIIllIIll(0.125f).lllIlIIlIIIlIlIIIllIlllIl("mushroom").IlIllllllIIlIIllllIIlIIIl("mushroom_brown"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(40, "red_mushroom", new class_1390().IlIllllllIIlIIllllIIlIIIl(0.0f).lllIIIllIIIIlllIlIIllIIll(lIllllIIlIIIlIllllllIIIll).lllIlIIlIIIlIlIIIllIlllIl("mushroom").IlIllllllIIlIIllllIIlIIIl("mushroom_red"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(41, "gold_block", new class_1534(class_1662.llIIIlllIlllIlIllIIIIllIl).IlIllllllIIlIIllllIIlIIIl(3.0f).lllIlIIlIIIlIlIIIllIlllIl(10.0f).lllIIIllIIIIlllIlIIllIIll(IllIIlllllllIIlIIlIIIIlIl).lllIlIIlIIIlIlIIIllIlllIl("blockGold").IlIllllllIIlIIllllIIlIIIl("gold_block"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(42, "iron_block", new class_1534(class_1662.IllIIlllllllIIlIIlIIIIlIl).IlIllllllIIlIIllllIIlIIIl(5.0f).lllIlIIlIIIlIlIIIllIlllIl(10.0f).lllIIIllIIIIlllIlIIllIIll(IllIIlllllllIIlIIlIIIIlIl).lllIlIIlIIIlIlIIIllIlllIl("blockIron").IlIllllllIIlIIllllIIlIIIl("iron_block"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(43, "double_stone_slab", new class_0989(true).IlIllllllIIlIIllllIIlIIIl(2.0f).lllIlIIlIIIlIlIIIllIlllIl(10.0f).lllIIIllIIIIlllIlIIllIIll(IIIllIIlIIIIIIlIlIIllIIlI).lllIlIIlIIIlIlIIIllIlllIl("stoneSlab"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(44, "stone_slab", new class_0989(false).IlIllllllIIlIIllllIIlIIIl(2.0f).lllIlIIlIIIlIlIIIllIlllIl(10.0f).lllIIIllIIIIlllIlIIllIIll(IIIllIIlIIIIIIlIlIIllIIlI).lllIlIIlIIIlIlIIIllIlllIl("stoneSlab"));
        Block class_05495 = new Block(class_1855.IlIIIIIllllllIIlllIllllll).IlIllllllIIlIIllllIIlIIIl(2.0f).lllIlIIlIIIlIlIIIllIlllIl(10.0f).lllIIIllIIIIlllIlIIllIIll(IIIllIIlIIIIIIlIlIIllIIlI).lllIlIIlIIIlIlIIIllIlllIl("brick").lllIIIllIIIIlllIlIIllIIll(class_0931.lllIlIIlIIIlIlIIIllIlllIl).IlIllllllIIlIIllllIIlIIIl("brick");
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(45, "brick_block", class_05495);
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(46, "tnt", new class_2244().IlIllllllIIlIIllllIIlIIIl(0.0f).lllIIIllIIIIlllIlIIllIIll(lIllllIIlIIIlIllllllIIIll).lllIlIIlIIIlIlIIIllIlllIl("tnt").IlIllllllIIlIIllllIIlIIIl("tnt"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(47, "bookshelf", new class_0959().IlIllllllIIlIIllllIIlIIIl(1.5f).lllIIIllIIIIlllIlIIllIIll(lIlllIlllIIIIlIIlllIllIII).lllIlIIlIIIlIlIIIllIlllIl("bookshelf").IlIllllllIIlIIllllIIlIIIl("bookshelf"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(48, "mossy_cobblestone", new Block(class_1855.IlIIIIIllllllIIlllIllllll).IlIllllllIIlIIllllIIlIIIl(2.0f).lllIlIIlIIIlIlIIIllIlllIl(10.0f).lllIIIllIIIIlllIlIIllIIll(IIIllIIlIIIIIIlIlIIllIIlI).lllIlIIlIIIlIlIIIllIlllIl("stoneMoss").lllIIIllIIIIlllIlIIllIIll(class_0931.lllIlIIlIIIlIlIIIllIlllIl).IlIllllllIIlIIllllIIlIIIl("cobblestone_mossy"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(49, "obsidian", new class_1032().IlIllllllIIlIIllllIIlIIIl(50.0f).lllIlIIlIIIlIlIIIllIlllIl(2000.0f).lllIIIllIIIIlllIlIIllIIll(IIIllIIlIIIIIIlIlIIllIIlI).lllIlIIlIIIlIlIIIllIlllIl("obsidian").IlIllllllIIlIIllllIIlIIIl("obsidian"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(50, "torch", new class_1976().IlIllllllIIlIIllllIIlIIIl(0.0f).lllIIIllIIIIlllIlIIllIIll(0.9375f).lllIIIllIIIIlllIlIIllIIll(lIlllIlllIIIIlIIlllIllIII).lllIlIIlIIIlIlIIIllIlllIl("torch").IlIllllllIIlIIllllIIlIIIl("torch_on"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(51, "fire", new BlockFire().IlIllllllIIlIIllllIIlIIIl(0.0f).lllIIIllIIIIlllIlIIllIIll(1.0f).lllIIIllIIIIlllIlIIllIIll(lIlllIlllIIIIlIIlllIllIII).lllIlIIlIIIlIlIIIllIlllIl("fire").IIlIIlIlIlIllIIlIlIIIIlll().IlIllllllIIlIIllllIIlIIIl("fire"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(52, "mob_spawner", new class_1613().IlIllllllIIlIIllllIIlIIIl(5.0f).lllIIIllIIIIlllIlIIllIIll(IllIIlllllllIIlIIlIIIIlIl).lllIlIIlIIIlIlIIIllIlllIl("mobSpawner").IIlIIlIlIlIllIIlIlIIIIlll().IlIllllllIIlIIllllIIlIIIl("mob_spawner"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(53, "oak_stairs", new class_1254(class_05493, 0).lllIlIIlIIIlIlIIIllIlllIl("stairsWood"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(54, "chest", new class_1041(0).IlIllllllIIlIIllllIIlIIIl(2.5f).lllIIIllIIIIlllIlIIllIIll(lIlllIlllIIIIlIIlllIllIII).lllIlIIlIIIlIlIIIllIlllIl("chest"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(55, "redstone_wire", new class_1640().IlIllllllIIlIIllllIIlIIIl(0.0f).lllIIIllIIIIlllIlIIllIIll(IlIllllllIIlIIllllIIlIIIl).lllIlIIlIIIlIlIIIllIlllIl("redstoneDust").IIlIIlIlIlIllIIlIlIIIIlll().IlIllllllIIlIIllllIIlIIIl("redstone_dust"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(56, "diamond_ore", new class_2130().IlIllllllIIlIIllllIIlIIIl(3.0f).lllIlIIlIIIlIlIIIllIlllIl(5.0f).lllIIIllIIIIlllIlIIllIIll(IIIllIIlIIIIIIlIlIIllIIlI).lllIlIIlIIIlIlIIIllIlllIl("oreDiamond").IlIllllllIIlIIllllIIlIIIl("diamond_ore"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(57, "diamond_block", new class_1534(class_1662.IIIIlIllIlIIlIIlIllIlIlll).IlIllllllIIlIIllllIIlIIIl(5.0f).lllIlIIlIIIlIlIIIllIlllIl(10.0f).lllIIIllIIIIlllIlIIllIIll(IllIIlllllllIIlIIlIIIIlIl).lllIlIIlIIIlIlIIIllIlllIl("blockDiamond").IlIllllllIIlIIllllIIlIIIl("diamond_block"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(58, "crafting_table", new class_1841().IlIllllllIIlIIllllIIlIIIl(2.5f).lllIIIllIIIIlllIlIIllIIll(lIlllIlllIIIIlIIlllIllIII).lllIlIIlIIIlIlIIIllIlllIl("workbench").IlIllllllIIlIIllllIIlIIIl("crafting_table"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(59, "wheat", new class_0435().lllIlIIlIIIlIlIIIllIlllIl("crops").IlIllllllIIlIIllllIIlIIIl("wheat"));
        Block class_05496 = new class_1171().IlIllllllIIlIIllllIIlIIIl(0.6f).lllIIIllIIIIlllIlIIllIIll(IlIIIIIllllllIIlllIllllll).lllIlIIlIIIlIlIIIllIlllIl("farmland").IlIllllllIIlIIllllIIlIIIl("farmland");
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(60, "farmland", class_05496);
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(61, "furnace", new class_1608(false).IlIllllllIIlIIllllIIlIIIl(3.5f).lllIIIllIIIIlllIlIIllIIll(IIIllIIlIIIIIIlIlIIllIIlI).lllIlIIlIIIlIlIIIllIlllIl("furnace").lllIIIllIIIIlllIlIIllIIll(class_0931.IlIllllllIIlIIllllIIlIIIl));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(62, "lit_furnace", new class_1608(true).IlIllllllIIlIIllllIIlIIIl(3.5f).lllIIIllIIIIlllIlIIllIIll(IIIllIIlIIIIIIlIlIIllIIlI).lllIIIllIIIIlllIlIIllIIll(0.875f).lllIlIIlIIIlIlIIIllIlllIl("furnace"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(63, "standing_sign", new class_1638(class_2219.class, true).IlIllllllIIlIIllllIIlIIIl(1.0f).lllIIIllIIIIlllIlIIllIIll(lIlllIlllIIIIlIIlllIllIII).lllIlIIlIIIlIlIIIllIlllIl("sign").IIlIIlIlIlIllIIlIlIIIIlll());
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(64, "wooden_door", new class_2089(class_1855.lIlllIlllIIIIlIIlllIllIII).IlIllllllIIlIIllllIIlIIIl(3.0f).lllIIIllIIIIlllIlIIllIIll(lIlllIlllIIIIlIIlllIllIII).lllIlIIlIIIlIlIIIllIlllIl("doorWood").IIlIIlIlIlIllIIlIlIIIIlll().IlIllllllIIlIIllllIIlIIIl("door_wood"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(65, "ladder", new class_1928().IlIllllllIIlIIllllIIlIIIl(0.4f).lllIIIllIIIIlllIlIIllIIll(llIIllIllIlIIlIIllIllllll).lllIlIIlIIIlIlIIIllIlllIl("ladder").IlIllllllIIlIIllllIIlIIIl("ladder"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(66, "rail", new class_1119().IlIllllllIIlIIllllIIlIIIl(0.7f).lllIIIllIIIIlllIlIIllIIll(IllIIlllllllIIlIIlIIIIlIl).lllIlIIlIIIlIlIIIllIlllIl("rail").IlIllllllIIlIIllllIIlIIIl("rail_normal"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(67, "stone_stairs", new class_1254(class_05492, 0).lllIlIIlIIIlIlIIIllIlllIl("stairsStone"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(68, "wall_sign", new class_1638(class_2219.class, false).IlIllllllIIlIIllllIIlIIIl(1.0f).lllIIIllIIIIlllIlIIllIIll(lIlllIlllIIIIlIIlllIllIII).lllIlIIlIIIlIlIIIllIlllIl("sign").IIlIIlIlIlIllIIlIlIIIIlll());
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(69, "lever", new class_0446().IlIllllllIIlIIllllIIlIIIl(0.5f).lllIIIllIIIIlllIlIIllIIll(lIlllIlllIIIIlIIlllIllIII).lllIlIIlIIIlIlIIIllIlllIl("lever").IlIllllllIIlIIllllIIlIIIl("lever"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(70, "stone_pressure_plate", new class_2136("stone", class_1855.IlIIIIIllllllIIlllIllllll, class_1276.lllIlIIlIIIlIlIIIllIlllIl).IlIllllllIIlIIllllIIlIIIl(0.5f).lllIIIllIIIIlllIlIIllIIll(IIIllIIlIIIIIIlIlIIllIIlI).lllIlIIlIIIlIlIIIllIlllIl("pressurePlate"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(71, "iron_door", new class_2089(class_1855.lIllllIIlIIIlIllllllIIIll).IlIllllllIIlIIllllIIlIIIl(5.0f).lllIIIllIIIIlllIlIIllIIll(IllIIlllllllIIlIIlIIIIlIl).lllIlIIlIIIlIlIIIllIlllIl("doorIron").IIlIIlIlIlIllIIlIlIIIIlll().IlIllllllIIlIIllllIIlIIIl("door_iron"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(72, "wooden_pressure_plate", new class_2136("planks_oak", class_1855.lIlllIlllIIIIlIIlllIllIII, class_1276.lllIIIllIIIIlllIlIIllIIll).IlIllllllIIlIIllllIIlIIIl(0.5f).lllIIIllIIIIlllIlIIllIIll(lIlllIlllIIIIlIIlllIllIII).lllIlIIlIIIlIlIIIllIlllIl("pressurePlate"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(73, "redstone_ore", new class_0130(false).IlIllllllIIlIIllllIIlIIIl(3.0f).lllIlIIlIIIlIlIIIllIlllIl(5.0f).lllIIIllIIIIlllIlIIllIIll(IIIllIIlIIIIIIlIlIIllIIlI).lllIlIIlIIIlIlIIIllIlllIl("oreRedstone").lllIIIllIIIIlllIlIIllIIll(class_0931.lllIlIIlIIIlIlIIIllIlllIl).IlIllllllIIlIIllllIIlIIIl("redstone_ore"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(74, "lit_redstone_ore", new class_0130(true).lllIIIllIIIIlllIlIIllIIll(0.625f).IlIllllllIIlIIllllIIlIIIl(3.0f).lllIlIIlIIIlIlIIIllIlllIl(5.0f).lllIIIllIIIIlllIlIIllIIll(IIIllIIlIIIIIIlIlIIllIIlI).lllIlIIlIIIlIlIIIllIlllIl("oreRedstone").IlIllllllIIlIIllllIIlIIIl("redstone_ore"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(75, "unlit_redstone_torch", new class_1795(false).IlIllllllIIlIIllllIIlIIIl(0.0f).lllIIIllIIIIlllIlIIllIIll(lIlllIlllIIIIlIIlllIllIII).lllIlIIlIIIlIlIIIllIlllIl("notGate").IlIllllllIIlIIllllIIlIIIl("redstone_torch_off"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(76, "redstone_torch", new class_1795(true).IlIllllllIIlIIllllIIlIIIl(0.0f).lllIIIllIIIIlllIlIIllIIll(0.5f).lllIIIllIIIIlllIlIIllIIll(lIlllIlllIIIIlIIlllIllIII).lllIlIIlIIIlIlIIIllIlllIl("notGate").lllIIIllIIIIlllIlIIllIIll(class_0931.lIlllIlllIIIIlIIlllIllIII).IlIllllllIIlIIllllIIlIIIl("redstone_torch_on"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(77, "stone_button", new class_2260().IlIllllllIIlIIllllIIlIIIl(0.5f).lllIIIllIIIIlllIlIIllIIll(IIIllIIlIIIIIIlIlIIllIIlI).lllIlIIlIIIlIlIIIllIlllIl("button"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(78, "snow_layer", new class_0337().IlIllllllIIlIIllllIIlIIIl(0.1f).lllIIIllIIIIlllIlIIllIIll(llIIlllIllIllllIIIlIIIIII).lllIlIIlIIIlIlIIIllIlllIl("snow").IlIllllllIIlIIllllIIlIIIl(0).IlIllllllIIlIIllllIIlIIIl("snow"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(79, "ice", new class_1308().IlIllllllIIlIIllllIIlIIIl(0.5f).IlIllllllIIlIIllllIIlIIIl(3).lllIIIllIIIIlllIlIIllIIll(IIIllIllIIlIlIlIlIllllIIl).lllIlIIlIIIlIlIIIllIlllIl("ice").IlIllllllIIlIIllllIIlIIIl("ice"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(80, "snow", new class_1181().IlIllllllIIlIIllllIIlIIIl(0.2f).lllIIIllIIIIlllIlIIllIIll(llIIlllIllIllllIIIlIIIIII).lllIlIIlIIIlIlIIIllIlllIl("snow").IlIllllllIIlIIllllIIlIIIl("snow"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(81, "cactus", new class_1840().IlIllllllIIlIIllllIIlIIIl(0.4f).lllIIIllIIIIlllIlIIllIIll(IllIIIllIIIIlIlIlIllIIlll).lllIlIIlIIIlIlIIIllIlllIl("cactus").IlIllllllIIlIIllllIIlIIIl("cactus"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(82, "clay", new class_0457().IlIllllllIIlIIllllIIlIIIl(0.6f).lllIIIllIIIIlllIlIIllIIll(IlIIIIIllllllIIlllIllllll).lllIlIIlIIIlIlIIIllIlllIl("clay").IlIllllllIIlIIllllIIlIIIl("clay"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(83, "reeds", new class_0212().IlIllllllIIlIIllllIIlIIIl(0.0f).lllIIIllIIIIlllIlIIllIIll(lIllllIIlIIIlIllllllIIIll).lllIlIIlIIIlIlIIIllIlllIl("reeds").IIlIIlIlIlIllIIlIlIIIIlll().IlIllllllIIlIIllllIIlIIIl("reeds"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(84, "jukebox", new class_0761().IlIllllllIIlIIllllIIlIIIl(2.0f).lllIlIIlIIIlIlIIIllIlllIl(10.0f).lllIIIllIIIIlllIlIIllIIll(IIIllIIlIIIIIIlIlIIllIIlI).lllIlIIlIIIlIlIIIllIlllIl("jukebox").IlIllllllIIlIIllllIIlIIIl("jukebox"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(85, "fence", new class_1417("planks_oak", class_1855.lIlllIlllIIIIlIIlllIllIII).IlIllllllIIlIIllllIIlIIIl(2.0f).lllIlIIlIIIlIlIIIllIlllIl(5.0f).lllIIIllIIIIlllIlIIllIIll(lIlllIlllIIIIlIIlllIllIII).lllIlIIlIIIlIlIIIllIlllIl("fence"));
        Block class_05497 = new class_0061(false).IlIllllllIIlIIllllIIlIIIl(1.0f).lllIIIllIIIIlllIlIIllIIll(lIlllIlllIIIIlIIlllIllIII).lllIlIIlIIIlIlIIIllIlllIl("pumpkin").IlIllllllIIlIIllllIIlIIIl("pumpkin");
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(86, "pumpkin", class_05497);
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(87, "netherrack", new class_1905().IlIllllllIIlIIllllIIlIIIl(0.4f).lllIIIllIIIIlllIlIIllIIll(IIIllIIlIIIIIIlIlIIllIIlI).lllIlIIlIIIlIlIIIllIlllIl("hellrock").IlIllllllIIlIIllllIIlIIIl("netherrack"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(88, "soul_sand", new class_0794().IlIllllllIIlIIllllIIlIIIl(0.5f).lllIIIllIIIIlllIlIIllIIll(lIIIIlIlIIlllllIIllIIlIII).lllIlIIlIIIlIlIIIllIlllIl("hellsand").IlIllllllIIlIIllllIIlIIIl("soul_sand"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(89, "glowstone", new class_1117(class_1855.lIIlIIIIIlIlllIlIIlIlIlll).IlIllllllIIlIIllllIIlIIIl(0.3f).lllIIIllIIIIlllIlIIllIIll(IIIllIllIIlIlIlIlIllllIIl).lllIIIllIIIIlllIlIIllIIll(1.0f).lllIlIIlIIIlIlIIIllIlllIl("lightgem").IlIllllllIIlIIllllIIlIIIl("glowstone"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(90, "portal", new class_1610().IlIllllllIIlIIllllIIlIIIl(-1.0f).lllIIIllIIIIlllIlIIllIIll(IIIllIllIIlIlIlIlIllllIIl).lllIIIllIIIIlllIlIIllIIll(0.75f).lllIlIIlIIIlIlIIIllIlllIl("portal").IlIllllllIIlIIllllIIlIIIl("portal"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(91, "lit_pumpkin", new class_0061(true).IlIllllllIIlIIllllIIlIIIl(1.0f).lllIIIllIIIIlllIlIIllIIll(lIlllIlllIIIIlIIlllIllIII).lllIIIllIIIIlllIlIIllIIll(1.0f).lllIlIIlIIIlIlIIIllIlllIl("litpumpkin").IlIllllllIIlIIllllIIlIIIl("pumpkin"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(92, "cake", new class_2060().IlIllllllIIlIIllllIIlIIIl(0.5f).lllIIIllIIIIlllIlIIllIIll(IllIIIllIIIIlIlIlIllIIlll).lllIlIIlIIIlIlIIIllIlllIl("cake").IIlIIlIlIlIllIIlIlIIIIlll().IlIllllllIIlIIllllIIlIIIl("cake"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(93, "unpowered_repeater", new class_1342(false).IlIllllllIIlIIllllIIlIIIl(0.0f).lllIIIllIIIIlllIlIIllIIll(lIlllIlllIIIIlIIlllIllIII).lllIlIIlIIIlIlIIIllIlllIl("diode").IIlIIlIlIlIllIIlIlIIIIlll().IlIllllllIIlIIllllIIlIIIl("repeater_off"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(94, "powered_repeater", new class_1342(true).IlIllllllIIlIIllllIIlIIIl(0.0f).lllIIIllIIIIlllIlIIllIIll(0.625f).lllIIIllIIIIlllIlIIllIIll(lIlllIlllIIIIlIIlllIllIII).lllIlIIlIIIlIlIIIllIlllIl("diode").IIlIIlIlIlIllIIlIlIIIIlll().IlIllllllIIlIIllllIIlIIIl("repeater_on"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(95, "stained_glass", new class_2258(class_1855.lIIlIIIIIlIlllIlIIlIlIlll).IlIllllllIIlIIllllIIlIIIl(0.3f).lllIIIllIIIIlllIlIIllIIll(IIIllIllIIlIlIlIlIllllIIl).lllIlIIlIIIlIlIIIllIlllIl("stainedGlass").IlIllllllIIlIIllllIIlIIIl("glass"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(96, "trapdoor", new class_0539(class_1855.lIlllIlllIIIIlIIlllIllIII).IlIllllllIIlIIllllIIlIIIl(3.0f).lllIIIllIIIIlllIlIIllIIll(lIlllIlllIIIIlIIlllIllIII).lllIlIIlIIIlIlIIIllIlllIl("trapdoor").IIlIIlIlIlIllIIlIlIIIIlll().IlIllllllIIlIIllllIIlIIIl("trapdoor"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(97, "monster_egg", new class_0273().IlIllllllIIlIIllllIIlIIIl(0.75f).lllIlIIlIIIlIlIIIllIlllIl("monsterStoneEgg"));
        Block class_05498 = new class_1020().IlIllllllIIlIIllllIIlIIIl(1.5f).lllIlIIlIIIlIlIIIllIlllIl(10.0f).lllIIIllIIIIlllIlIIllIIll(IIIllIIlIIIIIIlIlIIllIIlI).lllIlIIlIIIlIlIIIllIlllIl("stonebricksmooth").IlIllllllIIlIIllllIIlIIIl("stonebrick");
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(98, "stonebrick", class_05498);
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(99, "brown_mushroom_block", new class_1695(class_1855.lIlllIlllIIIIlIIlllIllIII, 0).IlIllllllIIlIIllllIIlIIIl(0.2f).lllIIIllIIIIlllIlIIllIIll(lIlllIlllIIIIlIIlllIllIII).lllIlIIlIIIlIlIIIllIlllIl("mushroom").IlIllllllIIlIIllllIIlIIIl("mushroom_block"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(100, "red_mushroom_block", new class_1695(class_1855.lIlllIlllIIIIlIIlllIllIII, 1).IlIllllllIIlIIllllIIlIIIl(0.2f).lllIIIllIIIIlllIlIIllIIll(lIlllIlllIIIIlIIlllIllIII).lllIlIIlIIIlIlIIIllIlllIl("mushroom").IlIllllllIIlIIllllIIlIIIl("mushroom_block"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(101, "iron_bars", new class_2092("iron_bars", "iron_bars", class_1855.lIllllIIlIIIlIllllllIIIll, true).IlIllllllIIlIIllllIIlIIIl(5.0f).lllIlIIlIIIlIlIIIllIlllIl(10.0f).lllIIIllIIIIlllIlIIllIIll(IllIIlllllllIIlIIlIIIIlIl).lllIlIIlIIIlIlIIIllIlllIl("fenceIron"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(102, "glass_pane", new class_2092("glass", "glass_pane_top", class_1855.lIIlIIIIIlIlllIlIIlIlIlll, false).IlIllllllIIlIIllllIIlIIIl(0.3f).lllIIIllIIIIlllIlIIllIIll(IIIllIllIIlIlIlIlIllllIIl).lllIlIIlIIIlIlIIIllIlllIl("thinGlass"));
        Block class_05499 = new class_2246().IlIllllllIIlIIllllIIlIIIl(1.0f).lllIIIllIIIIlllIlIIllIIll(lIlllIlllIIIIlIIlllIllIII).lllIlIIlIIIlIlIIIllIlllIl("melon").IlIllllllIIlIIllllIIlIIIl("melon");
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(103, "melon_block", class_05499);
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(104, "pumpkin_stem", new class_0895(class_05497).IlIllllllIIlIIllllIIlIIIl(0.0f).lllIIIllIIIIlllIlIIllIIll(lIlllIlllIIIIlIIlllIllIII).lllIlIIlIIIlIlIIIllIlllIl("pumpkinStem").IlIllllllIIlIIllllIIlIIIl("pumpkin_stem"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(105, "melon_stem", new class_0895(class_05499).IlIllllllIIlIIllllIIlIIIl(0.0f).lllIIIllIIIIlllIlIIllIIll(lIlllIlllIIIIlIIlllIllIII).lllIlIIlIIIlIlIIIllIlllIl("pumpkinStem").IlIllllllIIlIIllllIIlIIIl("melon_stem"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(106, "vine", new class_0001().IlIllllllIIlIIllllIIlIIIl(0.2f).lllIIIllIIIIlllIlIIllIIll(lIllllIIlIIIlIllllllIIIll).lllIlIIlIIIlIlIIIllIlllIl("vine").IlIllllllIIlIIllllIIlIIIl("vine"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(107, "fence_gate", new class_2172().IlIllllllIIlIIllllIIlIIIl(2.0f).lllIlIIlIIIlIlIIIllIlllIl(5.0f).lllIIIllIIIIlllIlIIllIIll(lIlllIlllIIIIlIIlllIllIII).lllIlIIlIIIlIlIIIllIlllIl("fenceGate"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(108, "brick_stairs", new class_1254(class_05495, 0).lllIlIIlIIIlIlIIIllIlllIl("stairsBrick"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(109, "stone_brick_stairs", new class_1254(class_05498, 0).lllIlIIlIIIlIlIIIllIlllIl("stairsStoneBrickSmooth"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(110, "mycelium", new class_1930().IlIllllllIIlIIllllIIlIIIl(0.6f).lllIIIllIIIIlllIlIIllIIll(lIllllIIlIIIlIllllllIIIll).lllIlIIlIIIlIlIIIllIlllIl("mycel").IlIllllllIIlIIllllIIlIIIl("mycelium"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(111, "waterlily", new class_0352().IlIllllllIIlIIllllIIlIIIl(0.0f).lllIIIllIIIIlllIlIIllIIll(lIllllIIlIIIlIllllllIIIll).lllIlIIlIIIlIlIIIllIlllIl("waterlily").IlIllllllIIlIIllllIIlIIIl("waterlily"));
        Block class_054910 = new Block(class_1855.IlIIIIIllllllIIlllIllllll).IlIllllllIIlIIllllIIlIIIl(2.0f).lllIlIIlIIIlIlIIIllIlllIl(10.0f).lllIIIllIIIIlllIlIIllIIll(IIIllIIlIIIIIIlIlIIllIIlI).lllIlIIlIIIlIlIIIllIlllIl("netherBrick").lllIIIllIIIIlllIlIIllIIll(class_0931.lllIlIIlIIIlIlIIIllIlllIl).IlIllllllIIlIIllllIIlIIIl("nether_brick");
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(112, "nether_brick", class_054910);
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(113, "nether_brick_fence", new class_1417("nether_brick", class_1855.IlIIIIIllllllIIlllIllllll).IlIllllllIIlIIllllIIlIIIl(2.0f).lllIlIIlIIIlIlIIIllIlllIl(10.0f).lllIIIllIIIIlllIlIIllIIll(IIIllIIlIIIIIIlIlIIllIIlI).lllIlIIlIIIlIlIIIllIlllIl("netherFence"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(114, "nether_brick_stairs", new class_1254(class_054910, 0).lllIlIIlIIIlIlIIIllIlllIl("stairsNetherBrick"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(115, "nether_wart", new class_0021().lllIlIIlIIIlIlIIIllIlllIl("netherStalk").IlIllllllIIlIIllllIIlIIIl("nether_wart"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(116, "enchanting_table", new class_0495().IlIllllllIIlIIllllIIlIIIl(5.0f).lllIlIIlIIIlIlIIIllIlllIl(2000.0f).lllIlIIlIIIlIlIIIllIlllIl("enchantmentTable").IlIllllllIIlIIllllIIlIIIl("enchanting_table"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(117, "brewing_stand", new class_1870().IlIllllllIIlIIllllIIlIIIl(0.5f).lllIIIllIIIIlllIlIIllIIll(0.125f).lllIlIIlIIIlIlIIIllIlllIl("brewingStand").IlIllllllIIlIIllllIIlIIIl("brewing_stand"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(118, "cauldron", new class_0706().IlIllllllIIlIIllllIIlIIIl(2.0f).lllIlIIlIIIlIlIIIllIlllIl("cauldron").IlIllllllIIlIIllllIIlIIIl("cauldron"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(119, "end_portal", new class_0182(class_1855.IIlIIlIlIlIllIIlIlIIIIlll).IlIllllllIIlIIllllIIlIIIl(-1.0f).lllIlIIlIIIlIlIIIllIlllIl(6000000.0f));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(120, "end_portal_frame", new class_1865().lllIIIllIIIIlllIlIIllIIll(IIIllIllIIlIlIlIlIllllIIl).lllIIIllIIIIlllIlIIllIIll(0.125f).IlIllllllIIlIIllllIIlIIIl(-1.0f).lllIlIIlIIIlIlIIIllIlllIl("endPortalFrame").lllIlIIlIIIlIlIIIllIlllIl(6000000.0f).lllIIIllIIIIlllIlIIllIIll(class_0931.IlIllllllIIlIIllllIIlIIIl).IlIllllllIIlIIllllIIlIIIl("endframe"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(121, "end_stone", new Block(class_1855.IlIIIIIllllllIIlllIllllll).IlIllllllIIlIIllllIIlIIIl(3.0f).lllIlIIlIIIlIlIIIllIlllIl(15.0f).lllIIIllIIIIlllIlIIllIIll(IIIllIIlIIIIIIlIlIIllIIlI).lllIlIIlIIIlIlIIIllIlllIl("whiteStone").lllIIIllIIIIlllIlIIllIIll(class_0931.lllIlIIlIIIlIlIIIllIlllIl).IlIllllllIIlIIllllIIlIIIl("end_stone"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(122, "dragon_egg", new class_1141().IlIllllllIIlIIllllIIlIIIl(3.0f).lllIlIIlIIIlIlIIIllIlllIl(15.0f).lllIIIllIIIIlllIlIIllIIll(IIIllIIlIIIIIIlIlIIllIIlI).lllIIIllIIIIlllIlIIllIIll(0.125f).lllIlIIlIIIlIlIIIllIlllIl("dragonEgg").IlIllllllIIlIIllllIIlIIIl("dragon_egg"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(123, "redstone_lamp", new class_0193(false).IlIllllllIIlIIllllIIlIIIl(0.3f).lllIIIllIIIIlllIlIIllIIll(IIIllIllIIlIlIlIlIllllIIl).lllIlIIlIIIlIlIIIllIlllIl("redstoneLight").lllIIIllIIIIlllIlIIllIIll(class_0931.lIlllIlllIIIIlIIlllIllIII).IlIllllllIIlIIllllIIlIIIl("redstone_lamp_off"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(124, "lit_redstone_lamp", new class_0193(true).IlIllllllIIlIIllllIIlIIIl(0.3f).lllIIIllIIIIlllIlIIllIIll(IIIllIllIIlIlIlIlIllllIIl).lllIlIIlIIIlIlIIIllIlllIl("redstoneLight").IlIllllllIIlIIllllIIlIIIl("redstone_lamp_on"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(125, "double_wooden_slab", new class_2261(true).IlIllllllIIlIIllllIIlIIIl(2.0f).lllIlIIlIIIlIlIIIllIlllIl(5.0f).lllIIIllIIIIlllIlIIllIIll(lIlllIlllIIIIlIIlllIllIII).lllIlIIlIIIlIlIIIllIlllIl("woodSlab"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(126, "wooden_slab", new class_2261(false).IlIllllllIIlIIllllIIlIIIl(2.0f).lllIlIIlIIIlIlIIIllIlllIl(5.0f).lllIIIllIIIIlllIlIIllIIll(lIlllIlllIIIIlIIlllIllIII).lllIlIIlIIIlIlIIIllIlllIl("woodSlab"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(127, "cocoa", new class_1084().IlIllllllIIlIIllllIIlIIIl(0.2f).lllIlIIlIIIlIlIIIllIlllIl(5.0f).lllIIIllIIIIlllIlIIllIIll(lIlllIlllIIIIlIIlllIllIII).lllIlIIlIIIlIlIIIllIlllIl("cocoa").IlIllllllIIlIIllllIIlIIIl("cocoa"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(128, "sandstone_stairs", new class_1254(class_05494, 0).lllIlIIlIIIlIlIIIllIlllIl("stairsSandStone"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(129, "emerald_ore", new class_2130().IlIllllllIIlIIllllIIlIIIl(3.0f).lllIlIIlIIIlIlIIIllIlllIl(5.0f).lllIIIllIIIIlllIlIIllIIll(IIIllIIlIIIIIIlIlIIllIIlI).lllIlIIlIIIlIlIIIllIlllIl("oreEmerald").IlIllllllIIlIIllllIIlIIIl("emerald_ore"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(130, "ender_chest", new class_0553().IlIllllllIIlIIllllIIlIIIl(22.5f).lllIlIIlIIIlIlIIIllIlllIl(1000.0f).lllIIIllIIIIlllIlIIllIIll(IIIllIIlIIIIIIlIlIIllIIlI).lllIlIIlIIIlIlIIIllIlllIl("enderChest").lllIIIllIIIIlllIlIIllIIll(0.5f));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(131, "tripwire_hook", new class_1512().lllIlIIlIIIlIlIIIllIlllIl("tripWireSource").IlIllllllIIlIIllllIIlIIIl("trip_wire_source"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(132, "tripwire", new class_2109().lllIlIIlIIIlIlIIIllIlllIl("tripWire").IlIllllllIIlIIllllIIlIIIl("trip_wire"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(133, "emerald_block", new class_1534(class_1662.llllIIIIlIIIlIIIIIIlIllll).IlIllllllIIlIIllllIIlIIIl(5.0f).lllIlIIlIIIlIlIIIllIlllIl(10.0f).lllIIIllIIIIlllIlIIllIIll(IllIIlllllllIIlIIlIIIIlIl).lllIlIIlIIIlIlIIIllIlllIl("blockEmerald").IlIllllllIIlIIllllIIlIIIl("emerald_block"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(134, "spruce_stairs", new class_1254(class_05493, 1).lllIlIIlIIIlIlIIIllIlllIl("stairsWoodSpruce"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(135, "birch_stairs", new class_1254(class_05493, 2).lllIlIIlIIIlIlIIIllIlllIl("stairsWoodBirch"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(136, "jungle_stairs", new class_1254(class_05493, 3).lllIlIIlIIIlIlIIIllIlllIl("stairsWoodJungle"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(137, "command_block", new class_0719().llIIlllIllIllllIIIlIIIIII().lllIlIIlIIIlIlIIIllIlllIl(6000000.0f).lllIlIIlIIIlIlIIIllIlllIl("commandBlock").IlIllllllIIlIIllllIIlIIIl("command_block"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(138, "beacon", new class_0587().lllIlIIlIIIlIlIIIllIlllIl("beacon").lllIIIllIIIIlllIlIIllIIll(1.0f).IlIllllllIIlIIllllIIlIIIl("beacon"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(139, "cobblestone_wall", new class_1482(class_05492).lllIlIIlIIIlIlIIIllIlllIl("cobbleWall"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(140, "flower_pot", new class_1709().IlIllllllIIlIIllllIIlIIIl(0.0f).lllIIIllIIIIlllIlIIllIIll(IlIllllllIIlIIllllIIlIIIl).lllIlIIlIIIlIlIIIllIlllIl("flowerPot").IlIllllllIIlIIllllIIlIIIl("flower_pot"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(141, "carrots", new class_2070().lllIlIIlIIIlIlIIIllIlllIl("carrots").IlIllllllIIlIIllllIIlIIIl("carrots"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(142, "potatoes", new class_0348().lllIlIIlIIIlIlIIIllIlllIl("potatoes").IlIllllllIIlIIllllIIlIIIl("potatoes"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(143, "wooden_button", new class_0060().IlIllllllIIlIIllllIIlIIIl(0.5f).lllIIIllIIIIlllIlIIllIIll(lIlllIlllIIIIlIIlllIllIII).lllIlIIlIIIlIlIIIllIlllIl("button"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(144, "skull", new class_1710().IlIllllllIIlIIllllIIlIIIl(1.0f).lllIIIllIIIIlllIlIIllIIll(IIIllIIlIIIIIIlIlIIllIIlI).lllIlIIlIIIlIlIIIllIlllIl("skull").IlIllllllIIlIIllllIIlIIIl("skull"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(145, "anvil", new class_0628().IlIllllllIIlIIllllIIlIIIl(5.0f).lllIIIllIIIIlllIlIIllIIll(lllIIlIIIllllllIIIIlIlIlI).lllIlIIlIIIlIlIIIllIlllIl(2000.0f).lllIlIIlIIIlIlIIIllIlllIl("anvil"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(146, "trapped_chest", new class_1041(1).IlIllllllIIlIIllllIIlIIIl(2.5f).lllIIIllIIIIlllIlIIllIIll(lIlllIlllIIIIlIIlllIllIII).lllIlIIlIIIlIlIIIllIlllIl("chestTrap"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(147, "light_weighted_pressure_plate", new class_1766("gold_block", class_1855.lIllllIIlIIIlIllllllIIIll, 15).IlIllllllIIlIIllllIIlIIIl(0.5f).lllIIIllIIIIlllIlIIllIIll(lIlllIlllIIIIlIIlllIllIII).lllIlIIlIIIlIlIIIllIlllIl("weightedPlate_light"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(148, "heavy_weighted_pressure_plate", new class_1766("iron_block", class_1855.lIllllIIlIIIlIllllllIIIll, 150).IlIllllllIIlIIllllIIlIIIl(0.5f).lllIIIllIIIIlllIlIIllIIll(lIlllIlllIIIIlIIlllIllIII).lllIlIIlIIIlIlIIIllIlllIl("weightedPlate_heavy"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(149, "unpowered_comparator", new class_1298(false).IlIllllllIIlIIllllIIlIIIl(0.0f).lllIIIllIIIIlllIlIIllIIll(lIlllIlllIIIIlIIlllIllIII).lllIlIIlIIIlIlIIIllIlllIl("comparator").IIlIIlIlIlIllIIlIlIIIIlll().IlIllllllIIlIIllllIIlIIIl("comparator_off"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(150, "powered_comparator", new class_1298(true).IlIllllllIIlIIllllIIlIIIl(0.0f).lllIIIllIIIIlllIlIIllIIll(0.625f).lllIIIllIIIIlllIlIIllIIll(lIlllIlllIIIIlIIlllIllIII).lllIlIIlIIIlIlIIIllIlllIl("comparator").IIlIIlIlIlIllIIlIlIIIIlll().IlIllllllIIlIIllllIIlIIIl("comparator_on"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(151, "daylight_detector", new class_0191().IlIllllllIIlIIllllIIlIIIl(0.2f).lllIIIllIIIIlllIlIIllIIll(lIlllIlllIIIIlIIlllIllIII).lllIlIIlIIIlIlIIIllIlllIl("daylightDetector").IlIllllllIIlIIllllIIlIIIl("daylight_detector"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(152, "redstone_block", new class_1411(class_1662.lIllllIIlIIIlIllllllIIIll).IlIllllllIIlIIllllIIlIIIl(5.0f).lllIlIIlIIIlIlIIIllIlllIl(10.0f).lllIIIllIIIIlllIlIIllIIll(IllIIlllllllIIlIIlIIIIlIl).lllIlIIlIIIlIlIIIllIlllIl("blockRedstone").IlIllllllIIlIIllllIIlIIIl("redstone_block"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(153, "quartz_ore", new class_2130().IlIllllllIIlIIllllIIlIIIl(3.0f).lllIlIIlIIIlIlIIIllIlllIl(5.0f).lllIIIllIIIIlllIlIIllIIll(IIIllIIlIIIIIIlIlIIllIIlI).lllIlIIlIIIlIlIIIllIlllIl("netherquartz").IlIllllllIIlIIllllIIlIIIl("quartz_ore"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(154, "hopper", new class_1700().IlIllllllIIlIIllllIIlIIIl(3.0f).lllIlIIlIIIlIlIIIllIlllIl(8.0f).lllIIIllIIIIlllIlIIllIIll(lIlllIlllIIIIlIIlllIllIII).lllIlIIlIIIlIlIIIllIlllIl("hopper").IlIllllllIIlIIllllIIlIIIl("hopper"));
        Block class_054911 = new class_0865().lllIIIllIIIIlllIlIIllIIll(IIIllIIlIIIIIIlIlIIllIIlI).IlIllllllIIlIIllllIIlIIIl(0.8f).lllIlIIlIIIlIlIIIllIlllIl("quartzBlock").IlIllllllIIlIIllllIIlIIIl("quartz_block");
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(155, "quartz_block", class_054911);
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(156, "quartz_stairs", new class_1254(class_054911, 0).lllIlIIlIIIlIlIIIllIlllIl("stairsQuartz"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(157, "activator_rail", new class_1604().IlIllllllIIlIIllllIIlIIIl(0.7f).lllIIIllIIIIlllIlIIllIIll(IllIIlllllllIIlIIlIIIIlIl).lllIlIIlIIIlIlIIIllIlllIl("activatorRail").IlIllllllIIlIIllllIIlIIIl("rail_activator"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(158, "dropper", new class_1241().IlIllllllIIlIIllllIIlIIIl(3.5f).lllIIIllIIIIlllIlIIllIIll(IIIllIIlIIIIIIlIlIIllIIlI).lllIlIIlIIIlIlIIIllIlllIl("dropper").IlIllllllIIlIIllllIIlIIIl("dropper"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(159, "stained_hardened_clay", new class_0974(class_1855.IlIIIIIllllllIIlllIllllll).IlIllllllIIlIIllllIIlIIIl(1.25f).lllIlIIlIIIlIlIIIllIlllIl(7.0f).lllIIIllIIIIlllIlIIllIIll(IIIllIIlIIIIIIlIlIIllIIlI).lllIlIIlIIIlIlIIIllIlllIl("clayHardenedStained").IlIllllllIIlIIllllIIlIIIl("hardened_clay_stained"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(160, "stained_glass_pane", new class_0937().IlIllllllIIlIIllllIIlIIIl(0.3f).lllIIIllIIIIlllIlIIllIIll(IIIllIllIIlIlIlIlIllllIIl).lllIlIIlIIIlIlIIIllIlllIl("thinStainedGlass").IlIllllllIIlIIllllIIlIIIl("glass"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(161, "leaves2", new class_0088().lllIlIIlIIIlIlIIIllIlllIl("leaves").IlIllllllIIlIIllllIIlIIIl("leaves"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(162, "log2", new class_0737().lllIlIIlIIIlIlIIIllIlllIl("log").IlIllllllIIlIIllllIIlIIIl("log"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(163, "acacia_stairs", new class_1254(class_05493, 4).lllIlIIlIIIlIlIIIllIlllIl("stairsWoodAcacia"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(164, "dark_oak_stairs", new class_1254(class_05493, 5).lllIlIIlIIIlIlIIIllIlllIl("stairsWoodDarkOak"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(170, "hay_block", new class_1862().IlIllllllIIlIIllllIIlIIIl(0.5f).lllIIIllIIIIlllIlIIllIIll(lIllllIIlIIIlIllllllIIIll).lllIlIIlIIIlIlIIIllIlllIl("hayBlock").lllIIIllIIIIlllIlIIllIIll(class_0931.lllIlIIlIIIlIlIIIllIlllIl).IlIllllllIIlIIllllIIlIIIl("hay_block"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(171, "carpet", new class_1073().IlIllllllIIlIIllllIIlIIIl(0.1f).lllIIIllIIIIlllIlIIllIIll(IllIIIllIIIIlIlIlIllIIlll).lllIlIIlIIIlIlIIIllIlllIl("woolCarpet").IlIllllllIIlIIllllIIlIIIl(0));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(172, "hardened_clay", new class_1010().IlIllllllIIlIIllllIIlIIIl(1.25f).lllIlIIlIIIlIlIIIllIlllIl(7.0f).lllIIIllIIIIlllIlIIllIIll(IIIllIIlIIIIIIlIlIIllIIlI).lllIlIIlIIIlIlIIIllIlllIl("clayHardened").IlIllllllIIlIIllllIIlIIIl("hardened_clay"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(173, "coal_block", new Block(class_1855.IlIIIIIllllllIIlllIllllll).IlIllllllIIlIIllllIIlIIIl(5.0f).lllIlIIlIIIlIlIIIllIlllIl(10.0f).lllIIIllIIIIlllIlIIllIIll(IIIllIIlIIIIIIlIlIIllIIlI).lllIlIIlIIIlIlIIIllIlllIl("blockCoal").lllIIIllIIIIlllIlIIllIIll(class_0931.lllIlIIlIIIlIlIIIllIlllIl).IlIllllllIIlIIllllIIlIIIl("coal_block"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(174, "packed_ice", new class_0523().IlIllllllIIlIIllllIIlIIIl(0.5f).lllIIIllIIIIlllIlIIllIIll(IIIllIllIIlIlIlIlIllllIIl).lllIlIIlIIIlIlIIIllIlllIl("icePacked").IlIllllllIIlIIllllIIlIIIl("ice_packed"));
        blockRegistry.lllIIIllIIIIlllIlIIllIIll(175, "double_plant", new class_1487());
        for (Block class_054912 : blockRegistry) {
            boolean bl;
            if (class_054912.IlIlIIlllIllllllllIIIlIlI == class_1855.lllIIIllIIIIlllIlIIllIIll) {
                class_054912.lIIlIIIIIlIlllIlIIlIlIlll = false;
                continue;
            }
            boolean bl2 = false;
            boolean bl3 = class_054912.lIIIIlIlIIlllllIIllIIlIII() == 10;
            boolean bl4 = class_054912 instanceof class_2209;
            boolean bl5 = class_054912 == class_05496;
            boolean bl6 = class_054912.lllllIlllIIllIlIIlIIIllII;
            boolean bl7 = bl = class_054912.IlIlIIlIlIllIIlIlIIllIIIl == 0;
            if (bl3 || bl4 || bl5 || bl6 || bl) {
                bl2 = true;
            }
            class_054912.lIIlIIIIIlIlllIlIIlIlIlll = bl2;
        }
    }

    protected Block(class_1855 class_18552) {
        this.IlIlIIlllIllllllllIIIlIlI = class_18552;
        this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        this.IlIlllIIIIIIlIIllIIllIlll = this.IlIlllIIIIIIlIIllIIllIlll();
        this.IlIlIIlIlIllIIlIlIIllIIIl = this.IlIlllIIIIIIlIIllIIllIlll() ? 255 : 0;
        this.lllllIlllIIllIlIIlIIIllII = !class_18552.IlIllllllIIlIIllllIIlIIIl();
    }

    protected Block lllIIIllIIIIlllIlIIllIIll(class_1031 class_10312) {
        this.llIIIlllIlllIlIllIIIIllIl = class_10312;
        return this;
    }

    public Block IlIllllllIIlIIllllIIlIIIl(int n) {
        this.IlIlIIlIlIllIIlIlIIllIIIl = n;
        return this;
    }

    protected Block lllIIIllIIIIlllIlIIllIIll(float f) {
        this.IlIlIIlllIIlIllIIIlllllIl = (int)(15.0f * f);
        return this;
    }

    protected Block lllIlIIlIIIlIlIIIllIlllIl(float f) {
        this.IlIIIlIIIIllIIIllIIIIIIll = f * 3.0f;
        return this;
    }

    public boolean IllIIlllllllIIlIIlIIIIlIl() {
        return this.IlIlIIlllIllllllllIIIlIlI.lIlllIlllIIIIlIIlllIllIII() && this.IllIIIllIIIIlIlIlIllIIlll();
    }

    public boolean IIIllIllIIlIlIlIlIllllIIl() {
        return this.IlIlIIlllIllllllllIIIlIlI.IllIIIllIIIIlIlIlIllIIlll() && this.IllIIIllIIIIlIlIlIllIIlll() && !this.llIllllIlIllIIIlIllIIlIlI();
    }

    public boolean IllIIIllIIIIlIlIlIllIIlll() {
        return true;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_1843 class_18432, int n, int n2, int n3) {
        return !this.IlIlIIlllIllllllllIIIlIlI.lIlllIlllIIIIlIIlllIllIII();
    }

    public int lIIIIlIlIIlllllIIllIIlIII() {
        return 0;
    }

    protected Block IlIllllllIIlIIllllIIlIIIl(float f) {
        this.lIlIlIIlIIIIlIIIIIlllIIII = f;
        if (this.IlIIIlIIIIllIIIllIIIIIIll < f * 5.0f) {
            this.IlIIIlIIIIllIIIllIIIIIIll = f * 5.0f;
        }
        return this;
    }

    protected Block llIIlllIllIllllIIIlIIIIII() {
        this.IlIllllllIIlIIllllIIlIIIl(-1.0f);
        return this;
    }

    public float lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3) {
        return this.lIlIlIIlIIIIlIIIIIlllIIII;
    }

    protected Block lllIIIllIIIIlllIlIIllIIll(boolean bl) {
        this.llIIlIllIllllIlIIIIlIIlll = bl;
        return this;
    }

    public boolean llIIllIllIlIIlIIllIllllll() {
        return this.llIIlIllIllllIlIIIIlIIlll;
    }

    public boolean lllIIlIIIllllllIIIIlIlIlI() {
        return this.llIllllIlIllIIIlIllIIlIlI;
    }

    protected final void lllIIIllIIIIlllIlIIllIIll(float f, float f2, float f3, float f4, float f5, float f6) {
        this.lIlllIlllIlIIIIlllIlIlIIl = f;
        this.IlIIlllllIIlIlIlllllIllll = f2;
        this.llIIlIlIlllIIllIlIlllIllI = f3;
        this.IllIIIIllIIllIllIlllIlIIl = f4;
        this.IIIIIIIIlIllIIllIIlllIllI = f5;
        this.IIlIIlIlIlIllIIlIlIIIIlll = f6;
    }

    public int lllIlIIlIIIlIlIIIllIlllIl(class_1843 class_18432, int n, int n2, int n3) {
        Block class_05492 = class_18432.a_(n, n2, n3);
        int n4 = class_18432.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, class_05492.lIlllIlllIIIIlIIlllIllIII());
        if (n4 == 0 && class_05492 instanceof class_2209) {
            class_05492 = class_18432.a_(n, --n2, n3);
            return class_18432.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, class_05492.lIlllIlllIIIIlIIlllIllIII());
        }
        return n4;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_1843 class_18432, int n, int n2, int n3, int n4) {
        return n4 == 0 && this.IlIIlllllIIlIlIlllllIllll > 0.0 ? true : (n4 == 1 && this.IIIIIIIIlIllIIllIIlllIllI < 1.0 ? true : (n4 == 2 && this.llIIlIlIlllIIllIlIlllIllI > 0.0 ? true : (n4 == 3 && this.IIlIIlIlIlIllIIlIlIIIIlll < 1.0 ? true : (n4 == 4 && this.lIlllIlllIlIIIIlllIlIlIIl > 0.0 ? true : (n4 == 5 && this.IllIIIIllIIllIllIlllIlIIl < 1.0 ? true : !class_18432.a_(n, n2, n3).IlIlllIIIIIIlIIllIIllIlll())))));
    }

    public boolean lllIlIIlIIIlIlIIIllIlllIl(class_1843 class_18432, int n, int n2, int n3, int n4) {
        return class_18432.a_(n, n2, n3).lIllllIIlIIIlIllllllIIIll().lllIlIIlIIIlIlIIIllIlllIl();
    }

    public IIcon IlIllllllIIlIIllllIIlIIIl(class_1843 class_18432, int n, int n2, int n3, int n4) {
        return this.lllIIIllIIIIlllIlIIllIIll(n4, class_18432.IlIllllllIIlIIllllIIlIIIl(n, n2, n3));
    }

    public IIcon lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        return this.llIIIIllIIIIIIIlIIIlIIIIl;
    }

    public final IIcon lIlllIlllIIIIlIIlllIllIII(int n) {
        return this.lllIIIllIIIIlllIlIIllIIll(n, 0);
    }

    public class_1974 lllIlIIlIIIlIlIIIllIlllIl(class_1334 class_13342, int n, int n2, int n3) {
        return class_1974.lllIIIllIIIIlllIlIIllIIll((double)n + this.lIlllIlllIlIIIIlllIlIlIIl, (double)n2 + this.IlIIlllllIIlIlIlllllIllll, (double)n3 + this.llIIlIlIlllIIllIlIlllIllI, (double)n + this.IllIIIIllIIllIllIlllIlIIl, (double)n2 + this.IIIIIIIIlIllIIllIIlllIllI, (double)n3 + this.IIlIIlIlIlIllIIlIlIIIIlll);
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_1974 class_19742, List list, class_1521 class_15212) {
        class_1974 class_19743 = this.IlIllllllIIlIIllllIIlIIIl(class_13342, n, n2, n3);
        class_0540 class_05402 = new class_0540(list, n, n2, n3);
        LunarClient.getInstance().getEventBus().callEvent(class_05402);
        if (!class_05402.lllIIIllIIIIlllIlIIllIIll() && class_19743 != null && class_19742.lllIlIIlIIIlIlIIIllIlllIl(class_19743)) {
            list.add(class_19743);
        }
    }

    public class_1974 IlIllllllIIlIIllllIIlIIIl(class_1334 class_13342, int n, int n2, int n3) {
        return class_1974.lllIIIllIIIIlllIlIIllIIll((double)n + this.lIlllIlllIlIIIIlllIlIlIIl, (double)n2 + this.IlIIlllllIIlIlIlllllIllll, (double)n3 + this.llIIlIlIlllIIllIlIlllIllI, (double)n + this.IllIIIIllIIllIllIlllIlIIl, (double)n2 + this.IIIIIIIIlIllIIllIIlllIllI, (double)n3 + this.IIlIIlIlIlIllIIlIlIIIIlll);
    }

    public boolean IlIlllIIIIIIlIIllIIllIlll() {
        return true;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(int n, boolean bl) {
        return this.IlIlIIlIlIllIIlIlIIllIIIl();
    }

    public boolean IlIlIIlIlIllIIlIlIIllIIIl() {
        return true;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Random random) {
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(class_1334 class_13342, int n, int n2, int n3, Random random) {
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, int n4) {
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Block class_05492) {
    }

    public int lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342) {
        return 10;
    }

    public void lIlllIlllIIIIlIIlllIllIII(class_1334 class_13342, int n, int n2, int n3) {
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Block class_05492, int n4) {
    }

    public int lllIIIllIIIIlllIlIIllIIll(Random random) {
        return 1;
    }

    public Item lllIIIllIIIIlllIlIIllIIll(int n, Random random, int n2) {
        return Item.getItemFromBlock(this);
    }

    public float lllIIIllIIIIlllIlIIllIIll(class_0814 class_08142, class_1334 class_13342, int n, int n2, int n3) {
        float f = this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3);
        return f < 0.0f ? 0.0f : (!class_08142.lllIIIllIIIIlllIlIIllIIll(this) ? class_08142.lllIIIllIIIIlllIlIIllIIll(this, false) / f / 100.0f : class_08142.lllIIIllIIIIlllIlIIllIIll(this, true) / f / 30.0f);
    }

    public final void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, int n4, int n5) {
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, n4, 1.0f, n5);
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, int n4, float f, int n5) {
        if (!class_13342.IllIIIIllIIllIllIlllIlIIl) {
            int n6 = this.lllIIIllIIIIlllIlIIllIIll(n5, class_13342.lllllIlllIIllIlIIlIIIllII);
            for (int i = 0; i < n6; ++i) {
                Item class_06112;
                if (!(class_13342.lllllIlllIIllIlIIlIIIllII.nextFloat() <= f) || (class_06112 = this.lllIIIllIIIIlllIlIIllIIll(n4, class_13342.lllllIlllIIllIlIIlIIIllII, n5)) == null) continue;
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, new ItemStack(class_06112, 1, this.IlIIIIIllllllIIlllIllllll(n4)));
            }
        }
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, ItemStack class_08972) {
        if (!class_13342.IllIIIIllIIllIllIlllIlIIl && class_13342.IlIIlllllIIlIlIlllllIllll().lllIlIIlIIIlIlIIIllIlllIl("doTileDrops")) {
            float f = 0.7f;
            double d = (double)(class_13342.lllllIlllIIllIlIIlIIIllII.nextFloat() * f) + (double)(1.0f - f) * 0.5;
            double d2 = (double)(class_13342.lllllIlllIIllIlIIlIIIllII.nextFloat() * f) + (double)(1.0f - f) * 0.5;
            double d3 = (double)(class_13342.lllllIlllIIllIlIIlIIIllII.nextFloat() * f) + (double)(1.0f - f) * 0.5;
            class_1781 class_17812 = new class_1781(class_13342, (double)n + d, (double)n2 + d2, (double)n3 + d3, class_08972);
            class_17812.lllIlIIlIIIlIlIIIllIlllIl = 10;
            class_13342.lllIIIllIIIIlllIlIIllIIll(class_17812);
        }
    }

    protected void lllIlIIlIIIlIlIIIllIlllIl(class_1334 class_13342, int n, int n2, int n3, int n4) {
        if (!class_13342.IllIIIIllIIllIllIlllIlIIl) {
            while (n4 > 0) {
                int n5 = class_1138.lllIIIllIIIIlllIlIIllIIll(n4);
                n4 -= n5;
                class_13342.lllIIIllIIIIlllIlIIllIIll(new class_1138(class_13342, (double)n + 0.5, (double)n2 + 0.5, (double)n3 + 0.5, n5));
            }
        }
    }

    public int IlIIIIIllllllIIlllIllllll(int n) {
        return 0;
    }

    public float lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212) {
        return this.IlIIIlIIIIllIIIllIIIIIIll / 5.0f;
    }

    public class_1112 lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_0864 class_08642, class_0864 class_08643) {
        this.IlIllllllIIlIIllllIIlIIIl((class_1843)class_13342, n, n2, n3);
        class_08642 = class_08642.IlIllllllIIlIIllllIIlIIIl(-n, -n2, -n3);
        class_08643 = class_08643.IlIllllllIIlIIllllIIlIIIl(-n, -n2, -n3);
        class_0864 class_08644 = class_08642.lllIIIllIIIIlllIlIIllIIll(class_08643, this.lIlllIlllIlIIIIlllIlIlIIl);
        class_0864 class_08645 = class_08642.lllIIIllIIIIlllIlIIllIIll(class_08643, this.IllIIIIllIIllIllIlllIlIIl);
        class_0864 class_08646 = class_08642.lllIlIIlIIIlIlIIIllIlllIl(class_08643, this.IlIIlllllIIlIlIlllllIllll);
        class_0864 class_08647 = class_08642.lllIlIIlIIIlIlIIIllIlllIl(class_08643, this.IIIIIIIIlIllIIllIIlllIllI);
        class_0864 class_08648 = class_08642.IlIllllllIIlIIllllIIlIIIl(class_08643, this.llIIlIlIlllIIllIlIlllIllI);
        class_0864 class_08649 = class_08642.IlIllllllIIlIIllllIIlIIIl(class_08643, this.IIlIIlIlIlIllIIlIlIIIIlll);
        if (!this.lllIIIllIIIIlllIlIIllIIll(class_08644)) {
            class_08644 = null;
        }
        if (!this.lllIIIllIIIIlllIlIIllIIll(class_08645)) {
            class_08645 = null;
        }
        if (!this.lllIlIIlIIIlIlIIIllIlllIl(class_08646)) {
            class_08646 = null;
        }
        if (!this.lllIlIIlIIIlIlIIIllIlllIl(class_08647)) {
            class_08647 = null;
        }
        if (!this.IlIllllllIIlIIllllIIlIIIl(class_08648)) {
            class_08648 = null;
        }
        if (!this.IlIllllllIIlIIllllIIlIIIl(class_08649)) {
            class_08649 = null;
        }
        class_0864 class_086410 = null;
        if (class_08644 != null && (class_086410 == null || class_08642.IlIIIIIllllllIIlllIllllll(class_08644) < class_08642.IlIIIIIllllllIIlllIllllll(class_086410))) {
            class_086410 = class_08644;
        }
        if (class_08645 != null && (class_086410 == null || class_08642.IlIIIIIllllllIIlllIllllll(class_08645) < class_08642.IlIIIIIllllllIIlllIllllll(class_086410))) {
            class_086410 = class_08645;
        }
        if (class_08646 != null && (class_086410 == null || class_08642.IlIIIIIllllllIIlllIllllll(class_08646) < class_08642.IlIIIIIllllllIIlllIllllll(class_086410))) {
            class_086410 = class_08646;
        }
        if (class_08647 != null && (class_086410 == null || class_08642.IlIIIIIllllllIIlllIllllll(class_08647) < class_08642.IlIIIIIllllllIIlllIllllll(class_086410))) {
            class_086410 = class_08647;
        }
        if (class_08648 != null && (class_086410 == null || class_08642.IlIIIIIllllllIIlllIllllll(class_08648) < class_08642.IlIIIIIllllllIIlllIllllll(class_086410))) {
            class_086410 = class_08648;
        }
        if (class_08649 != null && (class_086410 == null || class_08642.IlIIIIIllllllIIlllIllllll(class_08649) < class_08642.IlIIIIIllllllIIlllIllllll(class_086410))) {
            class_086410 = class_08649;
        }
        if (class_086410 == null) {
            return null;
        }
        int n4 = -1;
        if (class_086410 == class_08644) {
            n4 = 4;
        }
        if (class_086410 == class_08645) {
            n4 = 5;
        }
        if (class_086410 == class_08646) {
            n4 = 0;
        }
        if (class_086410 == class_08647) {
            n4 = 1;
        }
        if (class_086410 == class_08648) {
            n4 = 2;
        }
        if (class_086410 == class_08649) {
            n4 = 3;
        }
        return new class_1112(n, n2, n3, n4, class_086410.IlIllllllIIlIIllllIIlIIIl(n, n2, n3));
    }

    private boolean lllIIIllIIIIlllIlIIllIIll(class_0864 class_08642) {
        return class_08642 == null ? false : class_08642.lllIlIIlIIIlIlIIIllIlllIl >= this.IlIIlllllIIlIlIlllllIllll && class_08642.lllIlIIlIIIlIlIIIllIlllIl <= this.IIIIIIIIlIllIIllIIlllIllI && class_08642.IlIllllllIIlIIllllIIlIIIl >= this.llIIlIlIlllIIllIlIlllIllI && class_08642.IlIllllllIIlIIllllIIlIIIl <= this.IIlIIlIlIlIllIIlIlIIIIlll;
    }

    private boolean lllIlIIlIIIlIlIIIllIlllIl(class_0864 class_08642) {
        return class_08642 == null ? false : class_08642.lllIIIllIIIIlllIlIIllIIll >= this.lIlllIlllIlIIIIlllIlIlIIl && class_08642.lllIIIllIIIIlllIlIIllIIll <= this.IllIIIIllIIllIllIlllIlIIl && class_08642.IlIllllllIIlIIllllIIlIIIl >= this.llIIlIlIlllIIllIlIlllIllI && class_08642.IlIllllllIIlIIllllIIlIIIl <= this.IIlIIlIlIlIllIIlIlIIIIlll;
    }

    private boolean IlIllllllIIlIIllllIIlIIIl(class_0864 class_08642) {
        return class_08642 == null ? false : class_08642.lllIIIllIIIIlllIlIIllIIll >= this.lIlllIlllIlIIIIlllIlIlIIl && class_08642.lllIIIllIIIIlllIlIIllIIll <= this.IllIIIIllIIllIllIlllIlIIl && class_08642.lllIlIIlIIIlIlIIIllIlllIl >= this.IlIIlllllIIlIlIlllllIllll && class_08642.lllIlIIlIIIlIlIIIllIlllIl <= this.IIIIIIIIlIllIIllIIlllIllI;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_1013 class_10132) {
    }

    public int lllllIlllIIllIlIIlIIIllII() {
        return LunarClient.getInstance().getModuleManager().lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(Block.lllIIIllIIIIlllIlIIllIIll(this), true) ? 0 : 1;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, int n4, ItemStack class_08972) {
        return this.IlIllllllIIlIIllllIIlIIIl(class_13342, n, n2, n3, n4);
    }

    public boolean IlIllllllIIlIIllllIIlIIIl(class_1334 class_13342, int n, int n2, int n3, int n4) {
        return this.IlIIIIIllllllIIlllIllllll(class_13342, n, n2, n3);
    }

    public boolean IlIIIIIllllllIIlllIllllll(class_1334 class_13342, int n, int n2, int n3) {
        return class_13342.a_((int)n, (int)n2, (int)n3).IlIlIIlllIllllllllIIIlIlI.IIIllIllIIlIlIlIlIllllIIl();
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_0814 class_08142, int n4, float f, float f2, float f3) {
        return false;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_1521 class_15212) {
    }

    public int lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, int n4, float f, float f2, float f3, int n5) {
        return n5;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_0814 class_08142) {
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_1521 class_15212, class_0864 class_08642) {
    }

    public void IlIllllllIIlIIllllIIlIIIl(class_1843 class_18432, int n, int n2, int n3) {
    }

    public final double IlIlIIlllIIlIllIIIlllllIl() {
        return this.lIlllIlllIlIIIIlllIlIlIIl;
    }

    public final double lIIlIIIIIlIlllIlIIlIlIlll() {
        return this.IllIIIIllIIllIllIlllIlIIl;
    }

    public final double lIlIlIIlIIIIlIIIIIlllIIII() {
        return this.IlIIlllllIIlIlIlllllIllll;
    }

    public final double IlIIIlIIIIllIIIllIIIIIIll() {
        return this.IIIIIIIIlIllIIllIIlllIllI;
    }

    public final double IIlllIlIlllIllIIIlllIIlIl() {
        return this.llIIlIlIlllIIllIlIlllIllI;
    }

    public final double lIlIllIIlIIlIIlIIlIIlIIll() {
        return this.IIlIIlIlIlIllIIlIlIIIIlll;
    }

    public int llIIlIllIllllIlIIIIlIIlll() {
        return 0xFFFFFF;
    }

    public int lIllllIIlIIIlIllllllIIIll(int n) {
        return 0xFFFFFF;
    }

    public int lIlllIlllIIIIlIIlllIllIII(class_1843 class_18432, int n, int n2, int n3) {
        return 0xFFFFFF;
    }

    public int lIlllIlllIIIIlIIlllIllIII(class_1843 class_18432, int n, int n2, int n3, int n4) {
        return 0;
    }

    public boolean llIllllIlIllIIIlIllIIlIlI() {
        return false;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(class_1334 class_13342, int n, int n2, int n3, class_1521 class_15212) {
    }

    public int IlIIIIIllllllIIlllIllllll(class_1843 class_18432, int n, int n2, int n3, int n4) {
        return 0;
    }

    public void lIlllIlllIlIIIIlllIlIlIIl() {
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, class_0814 class_08142, int n, int n2, int n3, int n4) {
        class_08142.lllIIIllIIIIlllIlIIllIIll(StatList.IllIIIIllIIllIllIlllIlIIl[Block.lllIIIllIIIIlllIlIIllIIll(this)], 1);
        class_08142.IlIIIIIllllllIIlllIllllll(0.025f);
        if (this.IlIIlllllIIlIlIlllllIllll() && class_1250.lIlllIlllIIIIlIIlllIllIII(class_08142)) {
            ItemStack class_08972 = this.IIIllIIlIIIIIIlIlIIllIIlI(n4);
            if (class_08972 != null) {
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_08972);
            }
        } else {
            int n5 = class_1250.IlIIIIIllllllIIlllIllllll(class_08142);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, n4, n5);
        }
    }

    protected boolean IlIIlllllIIlIlIlllllIllll() {
        return this.IllIIIllIIIIlIlIlIllIIlll() && !this.llIllllIlIllIIIlIllIIlIlI;
    }

    protected ItemStack IIIllIIlIIIIIIlIlIIllIIlI(int n) {
        int n2 = 0;
        Item class_06112 = Item.getItemFromBlock(this);
        if (class_06112 != null && class_06112.lIlllIlllIIIIlIIlllIllIII()) {
            n2 = n;
        }
        return new ItemStack(class_06112, 1, n2);
    }

    public int lllIIIllIIIIlllIlIIllIIll(int n, Random random) {
        return this.lllIIIllIIIIlllIlIIllIIll(random);
    }

    public boolean lIllllIIlIIIlIllllllIIIll(class_1334 class_13342, int n, int n2, int n3) {
        return true;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_1965 class_19652, ItemStack class_08972) {
    }

    public void lIlllIlllIIIIlIIlllIllIII(class_1334 class_13342, int n, int n2, int n3, int n4) {
    }

    public Block lllIlIIlIIIlIlIIIllIlllIl(String string) {
        this.lIlIIllllIlIIIIllIIIIlIIl = string;
        return this;
    }

    public String llIIlIlIlllIIllIlIlllIllI() {
        return class_1586.lllIIIllIIIIlllIlIIllIIll(this.IllIIIIllIIllIllIlllIlIIl() + ".name");
    }

    public String IllIIIIllIIllIllIlllIlIIl() {
        return "tile." + this.lIlIIllllIlIIIIllIIIIlIIl;
    }

    public boolean lllIlIIlIIIlIlIIIllIlllIl(class_1334 class_13342, int n, int n2, int n3, int n4, int n5) {
        return false;
    }

    public boolean IIIIIIIIlIllIIllIIlllIllI() {
        return this.lIlIllIIlIIlIIlIIlIIlIIll;
    }

    protected Block IIlIIlIlIlIllIIlIlIIIIlll() {
        this.lIlIllIIlIIlIIlIIlIIlIIll = false;
        return this;
    }

    public int llIIIlllIlllIlIllIIIIllIl() {
        return this.IlIlIIlllIllllllllIIIlIlI.llIIlllIllIllllIIIlIIIIII();
    }

    public float IIIIlIllIlIIlIIlIllIlIlll() {
        return this.IllIIlllllllIIlIIlIIIIlIl() ? 0.2f : 1.0f;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_1521 class_15212, float f) {
    }

    public Item IIIllIIlIIIIIIlIlIIllIIlI(class_1334 class_13342, int n, int n2, int n3) {
        return Item.getItemFromBlock(this);
    }

    public int IllIIlllllllIIlIIlIIIIlIl(class_1334 class_13342, int n, int n2, int n3) {
        return this.IlIIIIIllllllIIlllIllllll(class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3));
    }

    public void lllIIIllIIIIlllIlIIllIIll(Item class_06112, class_0931 class_09312, List list) {
        list.add(new ItemStack(class_06112, 1, 0));
    }

    public class_0931 IlIlIIlllIllllllllIIIlIlI() {
        return this.llllllIlIllllIlIlIlIIIIlI;
    }

    public Block lllIIIllIIIIlllIlIIllIIll(class_0931 class_09312) {
        this.llllllIlIllllIlIlIlIIIIlI = class_09312;
        return this;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, int n4, class_0814 class_08142) {
    }

    public void IlIIIIIllllllIIlllIllllll(class_1334 class_13342, int n, int n2, int n3, int n4) {
    }

    public void IIIllIllIIlIlIlIlIllllIIl(class_1334 class_13342, int n, int n2, int n3) {
    }

    public boolean llllIIIIlIIIlIIIIIIlIllll() {
        return false;
    }

    public boolean llIIIIllIIIIIIIlIIIlIIIIl() {
        return true;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_1013 class_10132) {
        return true;
    }

    public boolean lllIlIIlIIIlIlIIIllIlllIl(Block class_05492) {
        return this == class_05492;
    }

    public static boolean lllIIIllIIIIlllIlIIllIIll(Block class_05492, Block class_05493) {
        return class_05492 != null && class_05493 != null ? (class_05492 == class_05493 ? true : class_05492.lllIlIIlIIIlIlIIIllIlllIl(class_05493)) : false;
    }

    public boolean IIllIllIIllIIlllIIIlIlllI() {
        return false;
    }

    public int lIllllIIlIIIlIllllllIIIll(class_1334 class_13342, int n, int n2, int n3, int n4) {
        return 0;
    }

    protected Block IlIllllllIIlIIllllIIlIIIl(String string) {
        this.lllIlIIlIIIlIlIIIllIlllIl = string;
        return this;
    }

    public String llllllIlIllllIlIlIlIIIIlI() {
        return this.lllIlIIlIIIlIlIIIllIlllIl == null ? "MISSING_ICON_BLOCK_" + Block.lllIIIllIIIIlllIlIIllIIll(this) + "_" + this.lIlIIllllIlIIIIllIIIIlIIl : this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public IIcon lllIlIIlIIIlIlIIIllIlllIl(int n, int n2) {
        return this.lllIIIllIIIIlllIlIIllIIll(n, n2);
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
        if (Objects.equals(this.lllIlIIlIIIlIlIIIllIlllIl, "trip_wire")) {
            IIllIllIIllIIlllIIIlIlllI = class_08872.lllIIIllIIIIlllIlIIllIIll("trip_wire_full");
        }
        this.llIIIIllIIIIIIIlIIIlIIIIl = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI());
    }

    public String lIlIIllllIlIIIIllIIIIlIIl() {
        return null;
    }
}

