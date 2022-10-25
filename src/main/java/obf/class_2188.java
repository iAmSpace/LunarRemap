package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;

import java.util.List;

public class class_2188
extends Item {
    public class_2188() {
        this.lIlllIlllIIIIlIIlllIllIII = 1;
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.IlIIIIIllllllIIlllIllllll);
    }

    @Override
    public ItemStack lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, class_1334 class_13342, class_0814 class_08142) {
        Object object;
        int n;
        float f;
        float f2;
        double d;
        float f3;
        float f4 = 1.0f;
        float f5 = class_08142.llIIIIllIIIIIIIlIIIlIIIIl + (class_08142.IlIlIIlllIllllllllIIIlIlI - class_08142.llIIIIllIIIIIIIlIIIlIIIIl) * f4;
        float f6 = class_08142.llllIIIIlIIIlIIIIIIlIllll + (class_08142.IIIIlIllIlIIlIIlIllIlIlll - class_08142.llllIIIIlIIIlIIIIIIlIllll) * f4;
        double d2 = class_08142.llIIlIllIllllIlIIIIlIIlll + (class_08142.IlIIlllllIIlIlIlllllIllll - class_08142.llIIlIllIllllIlIIIIlIIlll) * (double)f4;
        double d3 = class_08142.llIllllIlIllIIIlIllIIlIlI + (class_08142.llIIlIlIlllIIllIlIlllIllI - class_08142.llIllllIlIllIIIlIllIIlIlI) * (double)f4 + 1.62 - (double)class_08142.llllIlIIIIIIIIIlllIIlIIIl;
        double d4 = class_08142.lIlllIlllIlIIIIlllIlIlIIl + (class_08142.IllIIIIllIIllIllIlllIlIIl - class_08142.lIlllIlllIlIIIIlllIlIlIIl) * (double)f4;
        class_0864 class_08642 = class_0864.lllIIIllIIIIlllIlIIllIIll(d2, d3, d4);
        float f7 = MathHelper.lllIlIIlIIIlIlIIIllIlllIl(-f6 * ((float)Math.PI / 180) - (float)Math.PI);
        float f8 = MathHelper.lllIIIllIIIIlllIlIIllIIll(-f6 * ((float)Math.PI / 180) - (float)Math.PI);
        float f9 = f8 * (f3 = -MathHelper.lllIlIIlIIIlIlIIIllIlllIl(-f5 * ((float)Math.PI / 180)));
        class_0864 class_08643 = class_08642.IlIllllllIIlIIllllIIlIIIl((double)f9 * (d = 5.0), (double)(f2 = MathHelper.lllIIIllIIIIlllIlIIllIIll(-f5 * ((float)Math.PI / 180))) * d, (double)(f = f7 * f3) * d);
        class_1112 class_11122 = class_13342.lllIIIllIIIIlllIlIIllIIll(class_08642, class_08643, true);
        if (class_11122 == null) {
            return class_08972;
        }
        class_0864 class_08644 = class_08142.llIIlllIllIllllIIIlIIIIII(f4);
        boolean bl = false;
        float f10 = 1.0f;
        List list = class_13342.lllIlIIlIIIlIlIIIllIlllIl((class_1521)class_08142, class_08142.IIllIllIIllIIlllIIIlIlllI.lllIIIllIIIIlllIlIIllIIll(class_08644.lllIIIllIIIIlllIlIIllIIll * d, class_08644.lllIlIIlIIIlIlIIIllIlllIl * d, class_08644.IlIllllllIIlIIllllIIlIIIl * d).lllIlIIlIIIlIlIIIllIlllIl(f10, f10, f10));
        for (n = 0; n < list.size(); ++n) {
            float f11;
            class_1521 class_15212 = (class_1521)list.get(n);
            if (!class_15212.IllllIIlIIIllIlllIlllIllI() || !((class_1974)(object = class_15212.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl(f11 = class_15212.IlIlIllIIlIIIIlllIlIllIlI(), f11, f11))).lllIIIllIIIIlllIlIIllIIll(class_08642)) continue;
            bl = true;
        }
        if (bl) {
            return class_08972;
        }
        if (class_11122.lllIIIllIIIIlllIlIIllIIll == class_1431.lllIlIIlIIIlIlIIIllIlllIl) {
            n = class_11122.lllIlIIlIIIlIlIIIllIlllIl;
            int n2 = class_11122.IlIllllllIIlIIllllIIlIIIl;
            int n3 = class_11122.lIlllIlllIIIIlIIlllIllIII;
            if (class_13342.a_(n, n2, n3) == Blocks.lIIllIIlIIIlllIlllIIlIIlI) {
                --n2;
            }
            object = new class_2263(class_13342, (float)n + 0.5f, (float)n2 + 1.0f, (float)n3 + 0.5f);
            ((class_2263)object).IIIIlIllIlIIlIIlIllIlIlll = ((MathHelper.IlIllllllIIlIIllllIIlIIIl((double)(class_08142.IIIIlIllIlIIlIIlIllIlIlll * 4.0f / 360.0f) + 0.5) & 3) - 1) * 90;
            if (!class_13342.lllIIIllIIIIlllIlIIllIIll((class_1521)object, ((class_2263)object).IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl(-0.1, -0.1, -0.1)).isEmpty()) {
                return class_08972;
            }
            if (!class_13342.IllIIIIllIIllIllIlllIlIIl) {
                class_13342.lllIIIllIIIIlllIlIIllIIll((class_1521)object);
            }
            if (!class_08142.lIIlIlIlIlIllIIlIIllllIll.lIlllIlllIIIIlIIlllIllIII) {
                --class_08972.lllIlIIlIIIlIlIIIllIlllIl;
            }
        }
        return class_08972;
    }
}

