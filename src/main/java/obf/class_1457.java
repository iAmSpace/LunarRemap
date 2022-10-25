package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import java.util.ArrayList;

public class class_1457
implements class_2098 {
    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_0013 class_00132, class_1334 class_13342) {
        ItemStack class_08972 = null;
        ArrayList<ItemStack> arrayList = new ArrayList<ItemStack>();
        for (int i = 0; i < class_00132.IlIIIIIllllllIIlllIllllll(); ++i) {
            ItemStack class_08973 = class_00132.llIIllIllIlIIlIIllIllllll(i);
            if (class_08973 == null) continue;
            if (class_08973.lllIIIllIIIIlllIlIIllIIll() instanceof class_0981) {
                class_0981 class_09812 = (class_0981)class_08973.lllIIIllIIIIlllIlIIllIIll();
                if (class_09812.IlIIIlIIIIllIIIllIIIIIIll() != class_0557.lllIIIllIIIIlllIlIIllIIll || class_08972 != null) {
                    return false;
                }
                class_08972 = class_08973;
                continue;
            }
            if (class_08973.lllIIIllIIIIlllIlIIllIIll() != Items.dye) {
                return false;
            }
            arrayList.add(class_08973);
        }
        return class_08972 != null && !arrayList.isEmpty();
    }

    @Override
    public ItemStack lllIIIllIIIIlllIlIIllIIll(class_0013 class_00132) {
        int n;
        float f;
        float f2;
        int n2;
        int n3;
        ItemStack class_08972 = null;
        int[] arrn = new int[3];
        int n4 = 0;
        int n5 = 0;
        class_0981 class_09812 = null;
        for (n3 = 0; n3 < class_00132.IlIIIIIllllllIIlllIllllll(); ++n3) {
            ItemStack class_08973 = class_00132.llIIllIllIlIIlIIllIllllll(n3);
            if (class_08973 == null) continue;
            if (class_08973.lllIIIllIIIIlllIlIIllIIll() instanceof class_0981) {
                class_09812 = (class_0981)class_08973.lllIIIllIIIIlllIlIIllIIll();
                if (class_09812.IlIIIlIIIIllIIIllIIIIIIll() != class_0557.lllIIIllIIIIlllIlIIllIIll || class_08972 != null) {
                    return null;
                }
                class_08972 = class_08973.llIIlllIllIllllIIIlIIIIII();
                class_08972.lllIlIIlIIIlIlIIIllIlllIl = 1;
                if (!class_09812.llIIllIllIlIIlIIllIllllll(class_08973)) continue;
                n2 = class_09812.lllIIlIIIllllllIIIIlIlIlI(class_08972);
                f2 = (float)(n2 >> 16 & 0xFF) / 255.0f;
                f = (float)(n2 >> 8 & 0xFF) / 255.0f;
                float f3 = (float)(n2 & 0xFF) / 255.0f;
                n4 = (int)((float)n4 + Math.max(f2, Math.max(f, f3)) * 255.0f);
                arrn[0] = (int)((float)arrn[0] + f2 * 255.0f);
                arrn[1] = (int)((float)arrn[1] + f * 255.0f);
                arrn[2] = (int)((float)arrn[2] + f3 * 255.0f);
                ++n5;
                continue;
            }
            if (class_08973.lllIIIllIIIIlllIlIIllIIll() != Items.dye) {
                return null;
            }
            float[] arrf = class_1317.lIIIlIllllIlllIIIIIllIIIl[class_0974.IllIIlllllllIIlIIlIIIIlIl(class_08973.IllIIIllIIIIlIlIlIllIIlll())];
            int n6 = (int)(arrf[0] * 255.0f);
            int n7 = (int)(arrf[1] * 255.0f);
            n = (int)(arrf[2] * 255.0f);
            n4 += Math.max(n6, Math.max(n7, n));
            arrn[0] = arrn[0] + n6;
            arrn[1] = arrn[1] + n7;
            arrn[2] = arrn[2] + n;
            ++n5;
        }
        if (class_09812 == null) {
            return null;
        }
        n3 = arrn[0] / n5;
        int n8 = arrn[1] / n5;
        n2 = arrn[2] / n5;
        f2 = (float)n4 / (float)n5;
        f = Math.max(n3, Math.max(n8, n2));
        n3 = (int)((float)n3 * f2 / f);
        n8 = (int)((float)n8 * f2 / f);
        n2 = (int)((float)n2 * f2 / f);
        n = (n3 << 8) + n8;
        n = (n << 8) + n2;
        class_09812.lllIlIIlIIIlIlIIIllIlllIl(class_08972, n);
        return class_08972;
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll() {
        return 10;
    }

    @Override
    public ItemStack lllIlIIlIIIlIlIIIllIlllIl() {
        return null;
    }
}

