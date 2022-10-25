package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ChatComponentTranslation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class class_1701
extends class_1246 {
    @Override
    public String lllIIIllIIIIlllIlIIllIIll() {
        return "spreadplayers";
    }

    @Override
    public int lllIlIIlIIIlIlIIIllIlllIl() {
        return 2;
    }

    @Override
    public String lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692) {
        return "commands.spreadplayers.usage";
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692, String[] arrstring) {
        if (arrstring.length < 6) {
            throw new class_0932("commands.spreadplayers.usage", new Object[0]);
        }
        int n = 0;
        int n2 = n + 1;
        double d = class_1701.lllIIIllIIIIlllIlIIllIIll(class_19692, Double.NaN, arrstring[n]);
        double d2 = class_1701.lllIIIllIIIIlllIlIIllIIll(class_19692, Double.NaN, arrstring[n2++]);
        double d3 = class_1701.lllIIIllIIIIlllIlIIllIIll(class_19692, arrstring[n2++], 0.0);
        double d4 = class_1701.lllIIIllIIIIlllIlIIllIIll(class_19692, arrstring[n2++], d3 + 1.0);
        boolean bl = class_1701.IlIllllllIIlIIllllIIlIIIl(class_19692, arrstring[n2++]);
        ArrayList arrayList = Lists.newArrayList();
        while (n2 < arrstring.length) {
            Object object;
            String string;
            if (class_1093.lllIlIIlIIIlIlIIIllIlllIl(string = arrstring[n2++])) {
                object = class_1093.IlIllllllIIlIIllllIIlIIIl(class_19692, string);
                if (object == null || ((class_1822[])object).length == 0) {
                    throw new class_0340();
                }
                Collections.addAll(arrayList, object);
                continue;
            }
            object = class_0220.IlIIlllllIIlIlIlllllIllll().lIIIllIIIIIllllIlIlIllIll().lllIIIllIIIIlllIlIIllIIll(string);
            if (object == null) {
                throw new class_0340();
            }
            arrayList.add(object);
        }
        if (arrayList.isEmpty()) {
            throw new class_0340();
        }
        class_19692.lllIIIllIIIIlllIlIIllIIll(new ChatComponentTranslation("commands.spreadplayers.spreading." + (bl ? "teams" : "players"), arrayList.size(), d4, d, d2, d3));
        this.lllIIIllIIIIlllIlIIllIIll(class_19692, arrayList, new class_1871(d, d2), d3, d4, ((class_1965)arrayList.get((int)0)).lIlIllIIlIIlIIlIIlIIlIIll, bl);
    }

    private void lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692, List list, class_1871 class_18712, double d, double d2, class_1334 class_13342, boolean bl) {
        Random random = new Random();
        double d3 = class_18712.lllIIIllIIIIlllIlIIllIIll - d2;
        double d4 = class_18712.lllIlIIlIIIlIlIIIllIlllIl - d2;
        double d5 = class_18712.lllIIIllIIIIlllIlIIllIIll + d2;
        double d6 = class_18712.lllIlIIlIIIlIlIIIllIlllIl + d2;
        class_1871[] arrclass_1871 = this.lllIIIllIIIIlllIlIIllIIll(random, bl ? this.lllIIIllIIIIlllIlIIllIIll(list) : list.size(), d3, d4, d5, d6);
        int n = this.lllIIIllIIIIlllIlIIllIIll(class_18712, d, class_13342, random, d3, d4, d5, d6, arrclass_1871, bl);
        double d7 = this.lllIIIllIIIIlllIlIIllIIll(list, class_13342, arrclass_1871, bl);
        class_1701.lllIIIllIIIIlllIlIIllIIll(class_19692, (class_0291)this, "commands.spreadplayers.success." + (bl ? "teams" : "players"), arrclass_1871.length, class_18712.lllIIIllIIIIlllIlIIllIIll, class_18712.lllIlIIlIIIlIlIIIllIlllIl);
        if (arrclass_1871.length > 1) {
            class_19692.lllIIIllIIIIlllIlIIllIIll(new ChatComponentTranslation("commands.spreadplayers.info." + (bl ? "teams" : "players"), String.format("%.2f", d7), n));
        }
    }

    private int lllIIIllIIIIlllIlIIllIIll(List list) {
        HashSet hashSet = Sets.newHashSet();
        for (class_1965 class_19652 : list) {
            if (class_19652 instanceof class_0814) {
                hashSet.add(class_19652.llllIllIIIlIllIllllllIlIl());
                continue;
            }
            hashSet.add(null);
        }
        return hashSet.size();
    }

    private int lllIIIllIIIIlllIlIIllIIll(class_1871 class_18712, double d, class_1334 class_13342, Random random, double d2, double d3, double d4, double d5, class_1871[] arrclass_1871, boolean bl) {
        int n;
        boolean bl2 = true;
        double d6 = 3.4028234663852886E38;
        for (n = 0; n < 10000 && bl2; ++n) {
            class_1871 class_18713;
            int n2;
            bl2 = false;
            d6 = 3.4028234663852886E38;
            for (int i = 0; i < arrclass_1871.length; ++i) {
                class_1871 class_18714 = arrclass_1871[i];
                n2 = 0;
                class_18713 = new class_1871();
                for (int j = 0; j < arrclass_1871.length; ++j) {
                    if (i == j) continue;
                    class_1871 class_18715 = arrclass_1871[j];
                    double d7 = class_18714.lllIIIllIIIIlllIlIIllIIll(class_18715);
                    d6 = Math.min(d7, d6);
                    if (!(d7 < d)) continue;
                    ++n2;
                    class_18713.lllIIIllIIIIlllIlIIllIIll += class_18715.lllIIIllIIIIlllIlIIllIIll - class_18714.lllIIIllIIIIlllIlIIllIIll;
                    class_18713.lllIlIIlIIIlIlIIIllIlllIl += class_18715.lllIlIIlIIIlIlIIIllIlllIl - class_18714.lllIlIIlIIIlIlIIIllIlllIl;
                }
                if (n2 > 0) {
                    class_18713.lllIIIllIIIIlllIlIIllIIll /= (double)n2;
                    class_18713.lllIlIIlIIIlIlIIIllIlllIl /= (double)n2;
                    double d8 = class_18713.lllIlIIlIIIlIlIIIllIlllIl();
                    if (d8 > 0.0) {
                        class_18713.lllIIIllIIIIlllIlIIllIIll();
                        class_18714.lllIlIIlIIIlIlIIIllIlllIl(class_18713);
                    } else {
                        class_18714.lllIIIllIIIIlllIlIIllIIll(random, d2, d3, d4, d5);
                    }
                    bl2 = true;
                }
                if (!class_18714.lllIIIllIIIIlllIlIIllIIll(d2, d3, d4, d5)) continue;
                bl2 = true;
            }
            if (bl2) continue;
            class_1871[] arrclass_18712 = arrclass_1871;
            int n3 = arrclass_1871.length;
            for (n2 = 0; n2 < n3; ++n2) {
                class_18713 = arrclass_18712[n2];
                if (class_18713.lllIlIIlIIIlIlIIIllIlllIl(class_13342)) continue;
                class_18713.lllIIIllIIIIlllIlIIllIIll(random, d2, d3, d4, d5);
                bl2 = true;
            }
        }
        if (n >= 10000) {
            throw new class_1953("commands.spreadplayers.failure." + (bl ? "teams" : "players"), arrclass_1871.length, class_18712.lllIIIllIIIIlllIlIIllIIll, class_18712.lllIlIIlIIIlIlIIIllIlllIl, String.format("%.2f", d6));
        }
        return n;
    }

    private double lllIIIllIIIIlllIlIIllIIll(List list, class_1334 class_13342, class_1871[] arrclass_1871, boolean bl) {
        double d = 0.0;
        int n = 0;
        HashMap hashMap = Maps.newHashMap();
        for (int i = 0; i < list.size(); ++i) {
            class_1871 class_18712;
            class_1965 class_19652 = (class_1965)list.get(i);
            if (bl) {
                class_0827 class_08272;
                class_0827 class_08273 = class_08272 = class_19652 instanceof class_0814 ? class_19652.llllIllIIIlIllIllllllIlIl() : null;
                if (!hashMap.containsKey(class_08272)) {
                    hashMap.put(class_08272, arrclass_1871[n++]);
                }
                class_18712 = (class_1871)hashMap.get(class_08272);
            } else {
                class_18712 = arrclass_1871[n++];
            }
            class_19652.IllIIIllIIIIlIlIlIllIIlll((float) MathHelper.IlIllllllIIlIIllllIIlIIIl(class_18712.lllIIIllIIIIlllIlIIllIIll) + 0.5f, class_18712.lllIIIllIIIIlllIlIIllIIll(class_13342), (double) MathHelper.IlIllllllIIlIIllllIIlIIIl(class_18712.lllIlIIlIIIlIlIIIllIlllIl) + 0.5);
            double d2 = Double.MAX_VALUE;
            for (int j = 0; j < arrclass_1871.length; ++j) {
                if (class_18712 == arrclass_1871[j]) continue;
                double d3 = class_18712.lllIIIllIIIIlllIlIIllIIll(arrclass_1871[j]);
                d2 = Math.min(d3, d2);
            }
            d += d2;
        }
        return d /= (double)list.size();
    }

    private class_1871[] lllIIIllIIIIlllIlIIllIIll(Random random, int n, double d, double d2, double d3, double d4) {
        class_1871[] arrclass_1871 = new class_1871[n];
        for (int i = 0; i < arrclass_1871.length; ++i) {
            class_1871 class_18712 = new class_1871();
            class_18712.lllIIIllIIIIlllIlIIllIIll(random, d, d2, d3, d4);
            arrclass_1871[i] = class_18712;
        }
        return arrclass_1871;
    }
}

