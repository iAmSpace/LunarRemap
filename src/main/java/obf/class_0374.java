package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;

public class class_0374
extends Item {
    private class_2102 IIIllIllIIlIlIlIlIllllIIl;

    @Override
    public class_2102 lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        return n2 > 0 ? this.IIIllIllIIlIlIlIlIllllIIl : super.lllIIIllIIIIlllIlIIllIIll(n, n2);
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, int n) {
        if (n != 1) {
            return super.lllIIIllIIIIlllIlIIllIIll(class_08972, n);
        }
        class_2037 class_20372 = class_0374.lllIIIllIIIIlllIlIIllIIll(class_08972, "Colors");
        if (class_20372 != null && class_20372 instanceof class_1794) {
            class_1794 class_17942 = (class_1794)class_20372;
            int[] arrn = class_17942.lIlllIlllIIIIlIIlllIllIII();
            if (arrn.length == 1) {
                return arrn[0];
            }
            int n2 = 0;
            int n3 = 0;
            int n4 = 0;
            int[] arrn2 = arrn;
            int n5 = arrn.length;
            for (int i = 0; i < n5; ++i) {
                int n6 = arrn2[i];
                n2 += (n6 & 0xFF0000) >> 16;
                n3 += (n6 & 0xFF00) >> 8;
                n4 += (n6 & 0xFF) >> 0;
            }
            return (n2 /= arrn.length) << 16 | (n3 /= arrn.length) << 8 | (n4 /= arrn.length);
        }
        return 0x8A8A8A;
    }

    @Override
    public boolean IlIlIIlIlIllIIlIlIIllIIIl() {
        return true;
    }

    public static class_2037 lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, String string) {
        class_0775 class_07752;
        if (class_08972.IlIlIIlIlIllIIlIlIIllIIIl() && (class_07752 = class_08972.lllllIlllIIllIlIIlIIIllII().llIIllIllIlIIlIIllIllllll("Explosion")) != null) {
            return class_07752.lllIIIllIIIIlllIlIIllIIll(string);
        }
        return null;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, class_0814 class_08142, List list, boolean bl) {
        class_0775 class_07752;
        if (class_08972.IlIlIIlIlIllIIlIlIIllIIIl() && (class_07752 = class_08972.lllllIlllIIllIlIIlIIIllII().llIIllIllIlIIlIIllIllllll("Explosion")) != null) {
            class_0374.lllIIIllIIIIlllIlIIllIIll(class_07752, list);
        }
    }

    public static void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752, List list) {
        boolean bl;
        boolean bl2;
        int[] arrn;
        int n;
        int n2;
        int n3;
        int n4;
        Object object;
        byte by = class_07752.lIlllIlllIIIIlIIlllIllIII("Type");
        if (by >= 0 && by <= 4) {
            list.add(class_1586.lllIIIllIIIIlllIlIIllIIll("item.fireworksCharge.type." + by).trim());
        } else {
            list.add(class_1586.lllIIIllIIIIlllIlIIllIIll("item.fireworksCharge.type").trim());
        }
        int[] arrn2 = class_07752.llIIlllIllIllllIIIlIIIIII("Colors");
        if (arrn2.length > 0) {
            boolean bl3 = true;
            String string = "";
            object = arrn2;
            int n5 = arrn2.length;
            for (n4 = 0; n4 < n5; ++n4) {
                n3 = object[n4];
                if (!bl3) {
                    string = string + ", ";
                }
                bl3 = false;
                n2 = 0;
                for (n = 0; n < 16; ++n) {
                    if (n3 != class_1908.lIIIIlIlIIlllllIIllIIlIII[n]) continue;
                    n2 = 1;
                    string = string + class_1586.lllIIIllIIIIlllIlIIllIIll("item.fireworksCharge." + class_1908.IIIllIllIIlIlIlIlIllllIIl[n]);
                    break;
                }
                if (n2 != 0) continue;
                string = string + class_1586.lllIIIllIIIIlllIlIIllIIll("item.fireworksCharge.customColor");
            }
            list.add(string);
        }
        if ((arrn = class_07752.llIIlllIllIllllIIIlIIIIII("FadeColors")).length > 0) {
            boolean bl4 = true;
            object = class_1586.lllIIIllIIIIlllIlIIllIIll("item.fireworksCharge.fadeTo") + " ";
            int[] arrn3 = arrn;
            n4 = arrn.length;
            for (n3 = 0; n3 < n4; ++n3) {
                n2 = arrn3[n3];
                if (!bl4) {
                    object = (String)object + ", ";
                }
                bl4 = false;
                n = 0;
                for (int i = 0; i < 16; ++i) {
                    if (n2 != class_1908.lIIIIlIlIIlllllIIllIIlIII[i]) continue;
                    n = 1;
                    object = (String)object + class_1586.lllIIIllIIIIlllIlIIllIIll("item.fireworksCharge." + class_1908.IIIllIllIIlIlIlIlIllllIIl[i]);
                    break;
                }
                if (n != 0) continue;
                object = (String)object + class_1586.lllIIIllIIIIlllIlIIllIIll("item.fireworksCharge.customColor");
            }
            list.add(object);
        }
        if (bl2 = class_07752.lllIIlIIIllllllIIIIlIlIlI("Trail")) {
            list.add(class_1586.lllIIIllIIIIlllIlIIllIIll("item.fireworksCharge.trail"));
        }
        if (bl = class_07752.lllIIlIIIllllllIIIIlIlIlI("Flicker")) {
            list.add(class_1586.lllIIIllIIIIlllIlIIllIIll("item.fireworksCharge.flicker"));
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
        super.lllIIIllIIIIlllIlIIllIIll(class_08872);
        this.IIIllIllIIlIlIlIlIllllIIl = class_08872.lllIIIllIIIIlllIlIIllIIll(this.lIlIlIIlIIIIlIIIIIlllIIII() + "_overlay");
    }
}

