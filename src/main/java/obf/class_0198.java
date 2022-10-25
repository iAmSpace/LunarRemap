package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import net.minecraft.stats.Achievement;
import net.minecraft.stats.AchievementList;
import net.minecraft.stats.StatBase;
import net.minecraft.stats.StatList;

import java.util.ArrayList;
import java.util.List;

public class class_0198
extends class_1246 {
    @Override
    public String lllIIIllIIIIlllIlIIllIIll() {
        return "achievement";
    }

    @Override
    public int lllIlIIlIIIlIlIIIllIlllIl() {
        return 2;
    }

    @Override
    public String lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692) {
        return "commands.achievement.usage";
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692, String[] arrstring) {
        if (arrstring.length >= 2) {
            StatBase class_03192 = StatList.func_151177_a(arrstring[1]);
            if (class_03192 == null && !arrstring[1].equals("*")) {
                throw new class_1953("commands.achievement.unknownAchievement", arrstring[1]);
            }
            class_1822 class_18222 = arrstring.length >= 3 ? class_0198.lIlllIlllIIIIlIIlllIllIII(class_19692, arrstring[2]) : class_0198.IlIllllllIIlIIllllIIlIIIl(class_19692);
            if (arrstring[0].equalsIgnoreCase("give")) {
                if (class_03192 == null) {
                    for (Achievement class_07472 : AchievementList.achievementList) {
                        class_18222.lllIIIllIIIIlllIlIIllIIll(class_07472);
                    }
                    class_0198.lllIIIllIIIIlllIlIIllIIll(class_19692, (class_0291)this, "commands.achievement.give.success.all", class_18222.llllIIIIlIIIlIIIIIIlIllll());
                } else {
                    if (class_03192 instanceof Achievement) {
                        Achievement class_07473 = (Achievement)class_03192;
                        ArrayList arrayList = Lists.newArrayList();
                        while (class_07473.parentAchievement != null && !class_18222.IllIIIIllIIllIllIlllIlIIl().lllIIIllIIIIlllIlIIllIIll(class_07473.parentAchievement)) {
                            arrayList.add(class_07473.parentAchievement);
                            class_07473 = class_07473.parentAchievement;
                        }
                        for (Achievement class_07474 : Lists.reverse((List)arrayList)) {
                            class_18222.lllIIIllIIIIlllIlIIllIIll(class_07474);
                        }
                    }
                    class_18222.lllIIIllIIIIlllIlIIllIIll(class_03192);
                    class_0198.lllIIIllIIIIlllIlIIllIIll(class_19692, (class_0291)this, "commands.achievement.give.success.one", class_18222.llllIIIIlIIIlIIIIIIlIllll(), class_03192.IllIIIllIIIIlIlIlIllIIlll());
                }
                return;
            }
        }
        throw new class_0932("commands.achievement.usage", new Object[0]);
    }

    @Override
    public List lllIlIIlIIIlIlIIIllIlllIl(class_1969 class_19692, String[] arrstring) {
        if (arrstring.length == 1) {
            return class_0198.lllIIIllIIIIlllIlIIllIIll(arrstring, "give");
        }
        if (arrstring.length != 2) {
            return arrstring.length == 3 ? class_0198.lllIIIllIIIIlllIlIIllIIll(arrstring, class_0220.IlIIlllllIIlIlIlllllIllll().llIIlIllIllllIlIIIIlIIlll()) : null;
        }
        ArrayList arrayList = Lists.newArrayList();
        for (StatBase class_03192 : StatList.allStats) {
            arrayList.add(class_03192.statId);
        }
        return class_0198.lllIIIllIIIIlllIlIIllIIll(arrstring, arrayList);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(String[] arrstring, int n) {
        return n == 2;
    }
}

