package net.minecraft.stats;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.IChatComponent;
import obf.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class StatList {
    protected static Map oneShotStats = new HashMap();
    public static List allStats = new ArrayList();
    public static List IlIllllllIIlIIllllIIlIIIl = new ArrayList();
    public static List lIlllIlllIIIIlIIlllIllIII = new ArrayList();
    public static List IlIIIIIllllllIIlllIllllll = new ArrayList();
    public static StatBase lIllllIIlIIIlIllllllIIIll = new class_0320("stat.leaveGame", new ChatComponentTranslation("stat.leaveGame", new Object[0])).IIIllIllIIlIlIlIlIllllIIl().IllIIlllllllIIlIIlIIIIlIl();
    public static StatBase IIIllIIlIIIIIIlIlIIllIIlI = new class_0320("stat.playOneMinute", new ChatComponentTranslation("stat.playOneMinute", new Object[0]), StatBase.IllIIlllllllIIlIIlIIIIlIl).IIIllIllIIlIlIlIlIllllIIl().IllIIlllllllIIlIIlIIIIlIl();
    public static StatBase IllIIlllllllIIlIIlIIIIlIl = new class_0320("stat.walkOneCm", new ChatComponentTranslation("stat.walkOneCm", new Object[0]), StatBase.IIIllIllIIlIlIlIlIllllIIl).IIIllIllIIlIlIlIlIllllIIl().IllIIlllllllIIlIIlIIIIlIl();
    public static StatBase IIIllIllIIlIlIlIlIllllIIl = new class_0320("stat.swimOneCm", new ChatComponentTranslation("stat.swimOneCm", new Object[0]), StatBase.IIIllIllIIlIlIlIlIllllIIl).IIIllIllIIlIlIlIlIllllIIl().IllIIlllllllIIlIIlIIIIlIl();
    public static StatBase IllIIIllIIIIlIlIlIllIIlll = new class_0320("stat.fallOneCm", new ChatComponentTranslation("stat.fallOneCm", new Object[0]), StatBase.IIIllIllIIlIlIlIlIllllIIl).IIIllIllIIlIlIlIlIllllIIl().IllIIlllllllIIlIIlIIIIlIl();
    public static StatBase lIIIIlIlIIlllllIIllIIlIII = new class_0320("stat.climbOneCm", new ChatComponentTranslation("stat.climbOneCm", new Object[0]), StatBase.IIIllIllIIlIlIlIlIllllIIl).IIIllIllIIlIlIlIlIllllIIl().IllIIlllllllIIlIIlIIIIlIl();
    public static StatBase llIIlllIllIllllIIIlIIIIII = new class_0320("stat.flyOneCm", new ChatComponentTranslation("stat.flyOneCm", new Object[0]), StatBase.IIIllIllIIlIlIlIlIllllIIl).IIIllIllIIlIlIlIlIllllIIl().IllIIlllllllIIlIIlIIIIlIl();
    public static StatBase llIIllIllIlIIlIIllIllllll = new class_0320("stat.diveOneCm", new ChatComponentTranslation("stat.diveOneCm", new Object[0]), StatBase.IIIllIllIIlIlIlIlIllllIIl).IIIllIllIIlIlIlIlIllllIIl().IllIIlllllllIIlIIlIIIIlIl();
    public static StatBase lllIIlIIIllllllIIIIlIlIlI = new class_0320("stat.minecartOneCm", new ChatComponentTranslation("stat.minecartOneCm", new Object[0]), StatBase.IIIllIllIIlIlIlIlIllllIIl).IIIllIllIIlIlIlIlIllllIIl().IllIIlllllllIIlIIlIIIIlIl();
    public static StatBase IlIlllIIIIIIlIIllIIllIlll = new class_0320("stat.boatOneCm", new ChatComponentTranslation("stat.boatOneCm", new Object[0]), StatBase.IIIllIllIIlIlIlIlIllllIIl).IIIllIllIIlIlIlIlIllllIIl().IllIIlllllllIIlIIlIIIIlIl();
    public static StatBase IlIlIIlIlIllIIlIlIIllIIIl = new class_0320("stat.pigOneCm", new ChatComponentTranslation("stat.pigOneCm", new Object[0]), StatBase.IIIllIllIIlIlIlIlIllllIIl).IIIllIllIIlIlIlIlIllllIIl().IllIIlllllllIIlIIlIIIIlIl();
    public static StatBase lllllIlllIIllIlIIlIIIllII = new class_0320("stat.horseOneCm", new ChatComponentTranslation("stat.horseOneCm", new Object[0]), StatBase.IIIllIllIIlIlIlIlIllllIIl).IIIllIllIIlIlIlIlIllllIIl().IllIIlllllllIIlIIlIIIIlIl();
    public static StatBase IlIlIIlllIIlIllIIIlllllIl = new class_0320("stat.jump", new ChatComponentTranslation("stat.jump", new Object[0])).IIIllIllIIlIlIlIlIllllIIl().IllIIlllllllIIlIIlIIIIlIl();
    public static StatBase lIIlIIIIIlIlllIlIIlIlIlll = new class_0320("stat.drop", new ChatComponentTranslation("stat.drop", new Object[0])).IIIllIllIIlIlIlIlIllllIIl().IllIIlllllllIIlIIlIIIIlIl();
    public static StatBase lIlIlIIlIIIIlIIIIIlllIIII = new class_0320("stat.damageDealt", new ChatComponentTranslation("stat.damageDealt", new Object[0]), StatBase.IllIIIllIIIIlIlIlIllIIlll).IllIIlllllllIIlIIlIIIIlIl();
    public static StatBase IlIIIlIIIIllIIIllIIIIIIll = new class_0320("stat.damageTaken", new ChatComponentTranslation("stat.damageTaken", new Object[0]), StatBase.IllIIIllIIIIlIlIlIllIIlll).IllIIlllllllIIlIIlIIIIlIl();
    public static StatBase IIlllIlIlllIllIIIlllIIlIl = new class_0320("stat.deaths", new ChatComponentTranslation("stat.deaths", new Object[0])).IllIIlllllllIIlIIlIIIIlIl();
    public static StatBase lIlIllIIlIIlIIlIIlIIlIIll = new class_0320("stat.mobKills", new ChatComponentTranslation("stat.mobKills", new Object[0])).IllIIlllllllIIlIIlIIIIlIl();
    public static StatBase llIIlIllIllllIlIIIIlIIlll = new class_0320("stat.animalsBred", new ChatComponentTranslation("stat.animalsBred", new Object[0])).IllIIlllllllIIlIIlIIIIlIl();
    public static StatBase llIllllIlIllIIIlIllIIlIlI = new class_0320("stat.playerKills", new ChatComponentTranslation("stat.playerKills", new Object[0])).IllIIlllllllIIlIIlIIIIlIl();
    public static StatBase lIlllIlllIlIIIIlllIlIlIIl = new class_0320("stat.fishCaught", new ChatComponentTranslation("stat.fishCaught", new Object[0])).IllIIlllllllIIlIIlIIIIlIl();
    public static StatBase IlIIlllllIIlIlIlllllIllll = new class_0320("stat.junkFished", new ChatComponentTranslation("stat.junkFished", new Object[0])).IllIIlllllllIIlIIlIIIIlIl();
    public static StatBase llIIlIlIlllIIllIlIlllIllI = new class_0320("stat.treasureFished", new ChatComponentTranslation("stat.treasureFished", new Object[0])).IllIIlllllllIIlIIlIIIIlIl();
    public static final StatBase[] IllIIIIllIIllIllIlllIlIIl = new StatBase[4096];
    public static final StatBase[] IIIIIIIIlIllIIllIIlllIllI = new StatBase[32000];
    public static final StatBase[] IIlIIlIlIlIllIIlIlIIIIlll = new StatBase[32000];
    public static final StatBase[] llIIIlllIlllIlIllIIIIllIl = new StatBase[32000];

    public static void func_151178_a() {
        StatList.IlIllllllIIlIIllllIIlIIIl();
        StatList.lIlllIlllIIIIlIIlllIllIII();
        StatList.IlIIIIIllllllIIlllIllllll();
        StatList.lllIlIIlIIIlIlIIIllIlllIl();
        AchievementList.init();
        class_0054.lllIIIllIIIIlllIlIIllIIll();
    }

    private static void lllIlIIlIIIlIlIIIllIlllIl() {
        HashSet<Item> hashSet = new HashSet<Item>();
        for (class_2098 object : class_0172.lllIIIllIIIIlllIlIIllIIll().lllIlIIlIIIlIlIIIllIlllIl()) {
            if (object.lllIlIIlIIIlIlIIIllIlllIl() == null) continue;
            hashSet.add(object.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll());
        }
        for (ItemStack class_08972 : class_0400.lllIIIllIIIIlllIlIIllIIll().lllIlIIlIIIlIlIIIllIlllIl().values()) {
            hashSet.add(class_08972.lllIIIllIIIIlllIlIIllIIll());
        }
        for (Item class_06112 : hashSet) {
            if (class_06112 == null) continue;
            int n = Item.lllIIIllIIIIlllIlIIllIIll(class_06112);
            StatList.IIIIIIIIlIllIIllIIlllIllI[n] = new class_1536("stat.craftItem." + n, (IChatComponent)new ChatComponentTranslation("stat.craftItem", new ItemStack(class_06112).IIlIIlIlIlIllIIlIlIIIIlll()), class_06112).IllIIlllllllIIlIIlIIIIlIl();
        }
        StatList.lllIIIllIIIIlllIlIIllIIll(IIIIIIIIlIllIIllIIlllIllI);
    }

    private static void IlIllllllIIlIIllllIIlIIIl() {
        for (Block class_05492 : Block.blockRegistry) {
            if (Item.getItemFromBlock(class_05492) == null) continue;
            int n = Block.lllIIIllIIIIlllIlIIllIIll(class_05492);
            if (!class_05492.IIIIIIIIlIllIIllIIlllIllI()) continue;
            StatList.IllIIIIllIIllIllIlllIlIIl[n] = new class_1536("stat.mineBlock." + n, (IChatComponent)new ChatComponentTranslation("stat.mineBlock", new ItemStack(class_05492).IIlIIlIlIlIllIIlIlIIIIlll()), Item.getItemFromBlock(class_05492)).IllIIlllllllIIlIIlIIIIlIl();
            IlIIIIIllllllIIlllIllllll.add((class_1536)IllIIIIllIIllIllIlllIlIIl[n]);
        }
        StatList.lllIIIllIIIIlllIlIIllIIll(IllIIIIllIIllIllIlllIlIIl);
    }

    private static void lIlllIlllIIIIlIIlllIllIII() {
        for (Item class_06112 : Item.lllIIIllIIIIlllIlIIllIIll) {
            if (class_06112 == null) continue;
            int n = Item.lllIIIllIIIIlllIlIIllIIll(class_06112);
            StatList.IIlIIlIlIlIllIIlIlIIIIlll[n] = new class_1536("stat.useItem." + n, (IChatComponent)new ChatComponentTranslation("stat.useItem", new ItemStack(class_06112).IIlIIlIlIlIllIIlIlIIIIlll()), class_06112).IllIIlllllllIIlIIlIIIIlIl();
            if (class_06112 instanceof class_1272) continue;
            lIlllIlllIIIIlIIlllIllIII.add((class_1536)IIlIIlIlIlIllIIlIlIIIIlll[n]);
        }
        StatList.lllIIIllIIIIlllIlIIllIIll(IIlIIlIlIlIllIIlIlIIIIlll);
    }

    private static void IlIIIIIllllllIIlllIllllll() {
        for (Item class_06112 : Item.lllIIIllIIIIlllIlIIllIIll) {
            if (class_06112 == null) continue;
            int n = Item.lllIIIllIIIIlllIlIIllIIll(class_06112);
            if (!class_06112.lIllllIIlIIIlIllllllIIIll()) continue;
            StatList.llIIIlllIlllIlIllIIIIllIl[n] = new class_1536("stat.breakItem." + n, (IChatComponent)new ChatComponentTranslation("stat.breakItem", new ItemStack(class_06112).IIlIIlIlIlIllIIlIlIIIIlll()), class_06112).IllIIlllllllIIlIIlIIIIlIl();
        }
        StatList.lllIIIllIIIIlllIlIIllIIll(llIIIlllIlllIlIllIIIIllIl);
    }

    private static void lllIIIllIIIIlllIlIIllIIll(StatBase[] arrclass_0319) {
        StatList.lllIIIllIIIIlllIlIIllIIll(arrclass_0319, Blocks.IllIIIllIIIIlIlIlIllIIlll, Blocks.IIIllIllIIlIlIlIlIllllIIl);
        StatList.lllIIIllIIIIlllIlIIllIIll(arrclass_0319, Blocks.llIIlllIllIllllIIIlIIIIII, Blocks.lIIIIlIlIIlllllIIllIIlIII);
        StatList.lllIIIllIIIIlllIlIIllIIll(arrclass_0319, Blocks.IllIlllIIIlllllIllIIlIlIl, Blocks.lIlIIlllllIlllllIlIIIllll);
        StatList.lllIIIllIIIIlllIlIIllIIll(arrclass_0319, Blocks.llllIlIIllIIlllllIIllIIll, Blocks.furnace);
        StatList.lllIIIllIIIIlllIlIIllIIll(arrclass_0319, Blocks.lIlIllIIllIIIIlllIlIlllIl, Blocks.lIIIlIIllIllIIlIIlIIIllII);
        StatList.lllIIIllIIIIlllIlIIllIIll(arrclass_0319, Blocks.llllIIIlIlIlIlIIlIIIIIlIl, Blocks.IIIlllIlIIllIIlIlIllIlIIl);
        StatList.lllIIIllIIIIlllIlIIllIIll(arrclass_0319, Blocks.IIlIlIlIIlllIIIlIIIIlIIIl, Blocks.lIllIIlllIIIlIlIIIlllIlIl);
        StatList.lllIIIllIIIIlllIlIIllIIll(arrclass_0319, Blocks.lIIllllllllIlIllllllllIlI, Blocks.IlIIIlIIlllllIIIllIlIlIll);
        StatList.lllIIIllIIIIlllIlIIllIIll(arrclass_0319, Blocks.lIIIlIllllIlllIIIIIllIIIl, Blocks.IIllIIIlIIllllIIIIIIIIlll);
        StatList.lllIIIllIIIIlllIlIIllIIll(arrclass_0319, Blocks.llIIlIIllIIllIlIIllIIllII, Blocks.lllIIIIIIlIlllIIlIlIIIllI);
        StatList.lllIIIllIIIIlllIlIIllIIll(arrclass_0319, Blocks.llllIlIIIIIIIIIlllIIlIIIl, Blocks.IIIIlIlIIlIIIIlIlllIlIIII);
        StatList.lllIIIllIIIIlllIlIIllIIll(arrclass_0319, Blocks.lllIIIlllIlllIIlIllllIIlI, Blocks.lIIlIlllIIlllIIlllIIlIlII);
        StatList.lllIIIllIIIIlllIlIIllIIll(arrclass_0319, Blocks.IlIllllllIIlIIllllIIlIIIl, Blocks.lIlllIlllIIIIlIIlllIllIII);
        StatList.lllIIIllIIIIlllIlIIllIIll(arrclass_0319, Blocks.IIIlIlIllIlllllIlIllllllI, Blocks.lIlllIlllIIIIlIIlllIllIII);
    }

    private static void lllIIIllIIIIlllIlIIllIIll(StatBase[] arrclass_0319, Block class_05492, Block class_05493) {
        int n = Block.lllIIIllIIIIlllIlIIllIIll(class_05492);
        int n2 = Block.lllIIIllIIIIlllIlIIllIIll(class_05493);
        if (arrclass_0319[n] != null && arrclass_0319[n2] == null) {
            arrclass_0319[n2] = arrclass_0319[n];
        } else {
            allStats.remove(arrclass_0319[n]);
            IlIIIIIllllllIIlllIllllll.remove(arrclass_0319[n]);
            IlIllllllIIlIIllllIIlIIIl.remove(arrclass_0319[n]);
            arrclass_0319[n] = arrclass_0319[n2];
        }
    }

    public static StatBase lllIIIllIIIIlllIlIIllIIll(class_1128 class_11282) {
        String string = class_0054.lllIlIIlIIIlIlIIIllIlllIl(class_11282.lllIIIllIIIIlllIlIIllIIll);
        return string == null ? null : new StatBase("stat.killEntity." + string, new ChatComponentTranslation("stat.entityKill", new ChatComponentTranslation("entity." + string + ".name", new Object[0]))).IllIIlllllllIIlIIlIIIIlIl();
    }

    public static StatBase lllIlIIlIIIlIlIIIllIlllIl(class_1128 class_11282) {
        String string = class_0054.lllIlIIlIIIlIlIIIllIlllIl(class_11282.lllIIIllIIIIlllIlIIllIIll);
        return string == null ? null : new StatBase("stat.entityKilledBy." + string, new ChatComponentTranslation("stat.entityKilledBy", new ChatComponentTranslation("entity." + string + ".name", new Object[0]))).IllIIlllllllIIlIIlIIIIlIl();
    }

    public static StatBase lllIIIllIIIIlllIlIIllIIll(String string) {
        return (StatBase) oneShotStats.get(string);
    }
}

