package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashMultimap
 */
import com.google.common.collect.HashMultimap;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class class_0483
extends Item {
    private HashMap IIIllIllIIlIlIlIlIllllIIl = new HashMap();
    private static final Map IllIIIllIIIIlIlIlIllIIlll = new LinkedHashMap();
    private IIcon lIIIIlIlIIlllllIIllIIlIII;
    private IIcon llIIlllIllIllllIIIlIIIIII;
    private IIcon llIIllIllIlIIlIIllIllllll;

    public class_0483() {
        this.lllIlIIlIIIlIlIIIllIlllIl(1);
        this.lllIIIllIIIIlllIlIIllIIll(true);
        this.IlIIIIIllllllIIlllIllllll(0);
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.lIIIIlIlIIlllllIIllIIlIII);
    }

    public List llIIllIllIlIIlIIllIllllll(ItemStack class_08972) {
        if (class_08972.IlIlIIlIlIllIIlIlIIllIIIl() && class_08972.lllllIlllIIllIlIIlIIIllII().lllIlIIlIIIlIlIIIllIlllIl("CustomPotionEffects", 9)) {
            ArrayList<class_1852> arrayList = new ArrayList<class_1852>();
            class_2145 class_21452 = class_08972.lllllIlllIIllIlIIlIIIllII().IlIllllllIIlIIllllIIlIIIl("CustomPotionEffects", 10);
            for (int i = 0; i < class_21452.lIlllIlllIIIIlIIlllIllIII(); ++i) {
                class_0775 class_07752 = class_21452.lllIlIIlIIIlIlIIIllIlllIl(i);
                class_1852 class_18522 = class_1852.lllIlIIlIIIlIlIIIllIlllIl(class_07752);
                if (class_18522 == null) continue;
                arrayList.add(class_18522);
            }
            return arrayList;
        }
        List list = (List)this.IIIllIllIIlIlIlIlIllllIIl.get(class_08972.IllIIIllIIIIlIlIlIllIIlll());
        if (list == null) {
            list = class_0668.lllIlIIlIIIlIlIIIllIlllIl(class_08972.IllIIIllIIIIlIlIlIllIIlll(), false);
            this.IIIllIllIIlIlIlIlIllllIIl.put(class_08972.IllIIIllIIIIlIlIlIllIIlll(), list);
        }
        return list;
    }

    public List lIllllIIlIIIlIllllllIIIll(int n) {
        List list = (List)this.IIIllIllIIlIlIlIlIllllIIl.get(n);
        if (list == null) {
            list = class_0668.lllIlIIlIIIlIlIIIllIlllIl(n, false);
            this.IIIllIllIIlIlIlIlIllllIIl.put(n, list);
        }
        return list;
    }

    @Override
    public ItemStack lllIlIIlIIIlIlIIIllIlllIl(ItemStack class_08972, class_1334 class_13342, class_0814 class_08142) {
        List list;
        if (!class_08142.lIIlIlIlIlIllIIlIIllllIll.lIlllIlllIIIIlIIlllIllIII) {
            --class_08972.lllIlIIlIIIlIlIIIllIlllIl;
        }
        if (!class_13342.IllIIIIllIIllIllIlllIlIIl && (list = this.llIIllIllIlIIlIIllIllllll(class_08972)) != null) {
            for (class_1852 class_18522 : list) {
                class_08142.lllIIIllIIIIlllIlIIllIIll(new class_1852(class_18522));
            }
        }
        if (!class_08142.lIIlIlIlIlIllIIlIIllllIll.lIlllIlllIIIIlIIlllIllIII) {
            if (class_08972.lllIlIIlIIIlIlIIIllIlllIl <= 0) {
                return new ItemStack(Items.lIIlllIIIlIIlIllIIIIIlIlI);
            }
            class_08142.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Items.lIIlllIIIlIIlIllIIIIIlIlI));
        }
        return class_08972;
    }

    @Override
    public int lIllllIIlIIIlIllllllIIIll(ItemStack class_08972) {
        return 32;
    }

    @Override
    public class_1484 IlIIIIIllllllIIlllIllllll(ItemStack class_08972) {
        return class_1484.IlIllllllIIlIIllllIIlIIIl;
    }

    @Override
    public ItemStack lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, class_1334 class_13342, class_0814 class_08142) {
        if (class_0483.IIIllIIlIIIIIIlIlIIllIIlI(class_08972.IllIIIllIIIIlIlIlIllIIlll())) {
            if (!class_08142.lIIlIlIlIlIllIIlIIllllIll.lIlllIlllIIIIlIIlllIllIII) {
                --class_08972.lllIlIIlIIIlIlIIIllIlllIl;
            }
            class_13342.lllIIIllIIIIlllIlIIllIIll((class_1521)class_08142, "random.bow", 0.5f, 0.4f / (IlIllllllIIlIIllllIIlIIIl.nextFloat() * 0.4f + 0.8f));
            if (!class_13342.IllIIIIllIIllIllIlllIlIIl) {
                class_13342.lllIIIllIIIIlllIlIIllIIll(new class_0426(class_13342, (class_1965)class_08142, class_08972));
            }
            return class_08972;
        }
        class_08142.IlIllllllIIlIIllllIIlIIIl(class_08972, this.lIllllIIlIIIlIllllllIIIll(class_08972));
        return class_08972;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, class_0814 class_08142, class_1334 class_13342, int n, int n2, int n3, int n4, float f, float f2, float f3) {
        return false;
    }

    @Override
    public IIcon IlIllllllIIlIIllllIIlIIIl(int n) {
        return class_0483.IIIllIIlIIIIIIlIlIIllIIlI(n) ? this.lIIIIlIlIIlllllIIllIIlIII : this.llIIlllIllIllllIIIlIIIIII;
    }

    @Override
    public IIcon lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        return n2 == 0 ? this.llIIllIllIlIIlIIllIllllll : super.lllIIIllIIIIlllIlIIllIIll(n, n2);
    }

    public static boolean IIIllIIlIIIIIIlIlIIllIIlI(int n) {
        return (n & 0x4000) != 0;
    }

    public int IllIIlllllllIIlIIlIIIIlIl(int n) {
        return class_0668.lllIIIllIIIIlllIlIIllIIll(n, false);
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, int n) {
        return n > 0 ? 0xFFFFFF : this.IllIIlllllllIIlIIlIIIIlIl(class_08972.IllIIIllIIIIlIlIlIllIIlll());
    }

    @Override
    public boolean IlIlIIlIlIllIIlIlIIllIIIl() {
        return true;
    }

    public boolean IIIllIllIIlIlIlIlIllllIIl(int n) {
        List list = this.lIllllIIlIIIlIllllllIIIll(n);
        if (list != null && !list.isEmpty()) {
            class_1852 class_18522;
            Iterator iterator = list.iterator();
            do {
                if (iterator.hasNext()) continue;
                return false;
            } while (!class_0700.lllIIIllIIIIlllIlIIllIIll[(class_18522 = (class_1852)iterator.next()).lllIIIllIIIIlllIlIIllIIll()].lllIlIIlIIIlIlIIIllIlllIl());
            return true;
        }
        return false;
    }

    @Override
    public String IIIllIllIIlIlIlIlIllllIIl(ItemStack class_08972) {
        List list;
        if (class_08972.IllIIIllIIIIlIlIlIllIIlll() == 0) {
            return class_1586.lllIIIllIIIIlllIlIIllIIll("item.emptyPotion.name").trim();
        }
        String string = "";
        if (class_0483.IIIllIIlIIIIIIlIlIIllIIlI(class_08972.IllIIIllIIIIlIlIlIllIIlll())) {
            string = class_1586.lllIIIllIIIIlllIlIIllIIll("potion.prefix.grenade").trim() + " ";
        }
        if ((list = Items.potionitem.llIIllIllIlIIlIIllIllllll(class_08972)) != null && !list.isEmpty()) {
            String string2 = ((class_1852)list.get(0)).IlIIIIIllllllIIlllIllllll();
            string2 = string2 + ".postfix";
            return string + class_1586.lllIIIllIIIIlllIlIIllIIll(string2).trim();
        }
        String string3 = class_0668.lllIlIIlIIIlIlIIIllIlllIl(class_08972.IllIIIllIIIIlIlIlIllIIlll());
        return class_1586.lllIIIllIIIIlllIlIIllIIll(string3).trim() + " " + super.IIIllIllIIlIlIlIlIllllIIl(class_08972);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, class_0814 class_08142, List list, boolean bl) {
        if (class_08972.IllIIIllIIIIlIlIlIllIIlll() != 0) {
            Object object;
            List list2 = Items.potionitem.llIIllIllIlIIlIIllIllllll(class_08972);
            HashMultimap hashMultimap = HashMultimap.create();
            if (list2 != null && !list2.isEmpty()) {
                for (Object object2 : list2) {
                    object = class_1586.lllIIIllIIIIlllIlIIllIIll(((class_1852)object2).IlIIIIIllllllIIlllIllllll()).trim();
                    class_0700 class_07002 = class_0700.lllIIIllIIIIlllIlIIllIIll[((class_1852)object2).lllIIIllIIIIlllIlIIllIIll()];
                    Map map = class_07002.IllIIIllIIIIlIlIlIllIIlll();
                    if (map != null && map.size() > 0) {
                        for (Map.Entry entry : map.entrySet()) {
                            class_1256 class_12562 = (class_1256)entry.getValue();
                            class_1256 class_12563 = new class_1256(class_12562.lllIlIIlIIIlIlIIIllIlllIl(), class_07002.lllIIIllIIIIlllIlIIllIIll(((class_1852)object2).IlIllllllIIlIIllllIIlIIIl(), class_12562), class_12562.IlIllllllIIlIIllllIIlIIIl());
                            hashMultimap.put((Object)((class_2191)entry.getKey()).lllIIIllIIIIlllIlIIllIIll(), (Object)class_12563);
                        }
                    }
                    if (((class_1852)object2).IlIllllllIIlIIllllIIlIIIl() > 0) {
                        object = (String)object + " " + class_1586.lllIIIllIIIIlllIlIIllIIll("potion.potency." + ((class_1852)object2).IlIllllllIIlIIllllIIlIIIl()).trim();
                    }
                    if (((class_1852)object2).lllIlIIlIIIlIlIIIllIlllIl() > 20) {
                        object = (String)object + " (" + class_0700.lllIIIllIIIIlllIlIIllIIll((class_1852)object2) + ")";
                    }
                    if (class_07002.lIllllIIlIIIlIllllllIIIll()) {
                        list.add((Object)((Object) EnumChatFormatting.RED) + (String)object);
                        continue;
                    }
                    list.add((Object)((Object) EnumChatFormatting.GRAY) + (String)object);
                }
            } else {
                Object object2;
                object2 = class_1586.lllIIIllIIIIlllIlIIllIIll("potion.empty").trim();
                list.add((Object)((Object) EnumChatFormatting.GRAY) + (String)object2);
            }
            if (!hashMultimap.isEmpty()) {
                list.add("");
                list.add((Object)((Object) EnumChatFormatting.DARK_PURPLE) + class_1586.lllIIIllIIIIlllIlIIllIIll("potion.effects.whenDrank"));
                for (Object object2 : hashMultimap.entries()) {
                    object = (class_1256)object2.getValue();
                    double d = ((class_1256)object).lIlllIlllIIIIlIIlllIllIII();
                    double d2 = ((class_1256)object).IlIllllllIIlIIllllIIlIIIl() != 1 && ((class_1256)object).IlIllllllIIlIIllllIIlIIIl() != 2 ? ((class_1256)object).lIlllIlllIIIIlIIlllIllIII() : ((class_1256)object).lIlllIlllIIIIlIIlllIllIII() * 100.0;
                    if (d > 0.0) {
                        list.add((Object)((Object) EnumChatFormatting.BLUE) + class_1586.lllIIIllIIIIlllIlIIllIIll("attribute.modifier.plus." + ((class_1256)object).IlIllllllIIlIIllllIIlIIIl(), ItemStack.lllIIIllIIIIlllIlIIllIIll.format(d2), class_1586.lllIIIllIIIIlllIlIIllIIll("attribute.name." + (String)object2.getKey())));
                        continue;
                    }
                    if (!(d < 0.0)) continue;
                    list.add((Object)((Object) EnumChatFormatting.RED) + class_1586.lllIIIllIIIIlllIlIIllIIll("attribute.modifier.take." + ((class_1256)object).IlIllllllIIlIIllllIIlIIIl(), ItemStack.lllIIIllIIIIlllIlIIllIIll.format(d2 *= -1.0), class_1586.lllIIIllIIIIlllIlIIllIIll("attribute.name." + (String)object2.getKey())));
                }
            }
        }
    }

    @Override
    public boolean IllIIIllIIIIlIlIlIllIIlll(ItemStack class_08972) {
        List list = this.llIIllIllIlIIlIIllIllllll(class_08972);
        return list != null && !list.isEmpty();
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(Item class_06112, class_0931 class_09312, List list) {
        int n;
        super.lllIIIllIIIIlllIlIIllIIll(class_06112, class_09312, list);
        if (IllIIIllIIIIlIlIlIllIIlll.isEmpty()) {
            for (int i = 0; i <= 15; ++i) {
                for (n = 0; n <= 1; ++n) {
                    int n2 = n == 0 ? i | 0x2000 : i | 0x4000;
                    for (int j = 0; j <= 2; ++j) {
                        List list2;
                        int n3 = n2;
                        if (j != 0) {
                            if (j == 1) {
                                n3 = n2 | 0x20;
                            } else if (j == 2) {
                                n3 = n2 | 0x40;
                            }
                        }
                        if ((list2 = class_0668.lllIlIIlIIIlIlIIIllIlllIl(n3, false)) == null || list2.isEmpty()) continue;
                        IllIIIllIIIIlIlIlIllIIlll.put(list2, n3);
                    }
                }
            }
        }
        Iterator iterator = IllIIIllIIIIlIlIlIllIIlll.values().iterator();
        while (iterator.hasNext()) {
            n = (Integer)iterator.next();
            list.add(new ItemStack(class_06112, 1, n));
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
        this.llIIlllIllIllllIIIlIIIIII = class_08872.lllIIIllIIIIlllIlIIllIIll(this.lIlIlIIlIIIIlIIIIIlllIIII() + "_bottle_drinkable");
        this.lIIIIlIlIIlllllIIllIIlIII = class_08872.lllIIIllIIIIlllIlIIllIIll(this.lIlIlIIlIIIIlIIIIIlllIIII() + "_bottle_splash");
        this.llIIllIllIlIIlIIllIllllll = class_08872.lllIIIllIIIIlllIlIIllIIll(this.lIlIlIIlIIIIlIIIIIlllIIII() + "_overlay");
    }

    public static IIcon lIlllIlllIIIIlIIlllIllIII(String string) {
        return string.equals("bottle_drinkable") ? Items.potionitem.llIIlllIllIllllIIIlIIIIII : (string.equals("bottle_splash") ? Items.potionitem.lIIIIlIlIIlllllIIllIIlIII : (string.equals("overlay") ? Items.potionitem.llIIllIllIlIIlIIllIllllll : null));
    }
}

