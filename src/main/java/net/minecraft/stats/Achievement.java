package net.minecraft.stats;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.IChatComponent;
import obf.*;

/*
 * Decompiled with CFR 0.150.
 */
public class Achievement
extends StatBase {
    public final int displayColumn;
    public final int displayRow;
    public final Achievement parentAchievement;
    private final String achievementDescription;
    private IStatStringFormat llIIlllIllIllllIIIlIIIIII;
    public final ItemStack theItemStack;
    private boolean llIIllIllIlIIlIIllIllllll;

    public Achievement(String string, String string2, int n, int n2, Item class_06112, Achievement class_07472) {
        this(string, string2, n, n2, new ItemStack(class_06112), class_07472);
    }

    public Achievement(String string, String string2, int n, int n2, Block class_05492, Achievement class_07472) {
        this(string, string2, n, n2, new ItemStack(class_05492), class_07472);
    }

    public Achievement(String p_i45302_1_, String p_i45302_2_, int p_i45302_3_, int p_i45302_4_, ItemStack p_i45302_5_, Achievement p_i45302_6_) {
        super(p_i45302_1_, new ChatComponentTranslation("achievement." + p_i45302_2_, new Object[0]));
        this.theItemStack = p_i45302_5_;
        this.achievementDescription = "achievement." + p_i45302_2_ + ".desc";
        this.displayColumn = p_i45302_3_;
        this.displayRow = p_i45302_4_;

        if (p_i45302_3_ < AchievementList.minDisplayColumn) {
            AchievementList.minDisplayColumn = p_i45302_3_;
        }
        if (p_i45302_4_ < AchievementList.minDisplayRow) {
            AchievementList.minDisplayRow = p_i45302_4_;
        }
        if (p_i45302_3_ > AchievementList.maxDisplayColumn) {
            AchievementList.maxDisplayColumn = p_i45302_3_;
        }
        if (p_i45302_4_ > AchievementList.maxDisplayRow) {
            AchievementList.maxDisplayRow = p_i45302_4_;
        }

        this.parentAchievement = p_i45302_6_;
    }

    public Achievement initIndependentStat() {
        this.isIndependent = true;
        return this;
    }

    public Achievement setSpecial() {
        this.llIIllIllIlIIlIIllIllllll = true;
        return this;
    }

    public Achievement registerStat() {
        super.IllIIlllllllIIlIIlIIIIlIl();
        AchievementList.achievementList.add(this);
        return this;
    }

    @Override
    public boolean lIlllIlllIIIIlIIlllIllIII() {
        return true;
    }

    @Override
    public IChatComponent IlIIIIIllllllIIlllIllllll() {
        IChatComponent class_22552 = super.IlIIIIIllllllIIlllIllllll();
        class_22552.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(this.IIIllIIlIIIIIIlIlIIllIIlI() ? class_1227.lIllllIIlIIIlIllllllIIIll : class_1227.lIIIIlIlIIlllllIIllIIlIII);
        return class_22552;
    }

    public Achievement func_150953_b(Class class_) {
        return (Achievement)super.lllIlIIlIIIlIlIIIllIlllIl(class_);
    }

    public String lIllllIIlIIIlIllllllIIIll() {
        return this.llIIlllIllIllllIIIlIIIIII != null ? this.llIIlllIllIllllIIIlIIIIII.formatString(class_1586.lllIIIllIIIIlllIlIIllIIll(this.achievementDescription)) : class_1586.lllIIIllIIIIlllIlIIllIIll(this.achievementDescription);
    }

    public Achievement setStatStringFormatter(IStatStringFormat class_04592) {
        this.llIIlllIllIllllIIIlIIIIII = class_04592;
        return this;
    }

    public boolean IIIllIIlIIIIIIlIlIIllIIlI() {
        return this.llIIllIllIlIIlIIllIllllll;
    }

    @Override
    public /* synthetic */ StatBase lllIlIIlIIIlIlIIIllIlllIl(Class class_) {
        return this.func_150953_b(class_);
    }

    @Override
    public /* synthetic */ StatBase IllIIlllllllIIlIIlIIIIlIl() {
        return this.registerStat();
    }

    @Override
    public /* synthetic */ StatBase IIIllIllIIlIlIlIlIllllIIl() {
        return this.initIndependentStat();
    }
}

