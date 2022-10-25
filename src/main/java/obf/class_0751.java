package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.item.ItemStack;

import java.util.ArrayList;
import java.util.List;

class class_0751
extends class_1071 {
    public List lllIIIllIIIIlllIlIIllIIll = new ArrayList();

    public class_0751(class_0814 class_08142) {
        int n;
        class_0503 class_05032 = class_08142.lllIIlIIIllllllIIIIlIlIlI;
        for (n = 0; n < 5; ++n) {
            for (int i = 0; i < 9; ++i) {
                this.lllIlIIlIIIlIlIIIllIlllIl(new class_1291(class_0528.IIIllIIlIIIIIIlIlIIllIIlI(), n * 9 + i, 9 + i * 18, 18 + n * 18));
            }
        }
        for (n = 0; n < 9; ++n) {
            this.lllIlIIlIIIlIlIIIllIlllIl(new class_1291(class_05032, n, 9 + n * 18, 112));
        }
        this.lllIIIllIIIIlllIlIIllIIll(0.0f);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_0814 class_08142) {
        return true;
    }

    public void lllIIIllIIIIlllIlIIllIIll(float f) {
        int n = this.lllIIIllIIIIlllIlIIllIIll.size() / 9 - 5 + 1;
        int n2 = (int)((double)(f * (float)n) + 0.5);
        if (n2 < 0) {
            n2 = 0;
        }
        for (int i = 0; i < 5; ++i) {
            for (int j = 0; j < 9; ++j) {
                int n3 = j + (i + n2) * 9;
                if (n3 >= 0 && n3 < this.lllIIIllIIIIlllIlIIllIIll.size()) {
                    class_0528.IIIllIIlIIIIIIlIlIIllIIlI().lllIlIIlIIIlIlIIIllIlllIl(j + i * 9, (ItemStack)this.lllIIIllIIIIlllIlIIllIIll.get(n3));
                    continue;
                }
                class_0528.IIIllIIlIIIIIIlIlIIllIIlI().lllIlIIlIIIlIlIIIllIlllIl(j + i * 9, null);
            }
        }
    }

    public boolean lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIIIllIIIIlllIlIIllIIll.size() > 45;
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(int n, int n2, boolean bl, class_0814 class_08142) {
    }

    @Override
    public ItemStack lllIIIllIIIIlllIlIIllIIll(class_0814 class_08142, int n) {
        class_1291 class_12912;
        if (n >= this.IlIllllllIIlIIllllIIlIIIl.size() - 9 && n < this.IlIllllllIIlIIllllIIlIIIl.size() && (class_12912 = (class_1291)this.IlIllllllIIlIIllllIIlIIIl.get(n)) != null && class_12912.lllIlIIlIIIlIlIIIllIlllIl()) {
            class_12912.lllIlIIlIIIlIlIIIllIlllIl(null);
        }
        return null;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, class_1291 class_12912) {
        return class_12912.IIIllIllIIlIlIlIlIllllIIl > 90;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1291 class_12912) {
        return class_12912.lIllllIIlIIIlIllllllIIIll instanceof class_0503 || class_12912.IIIllIllIIlIlIlIlIllllIIl > 90 && class_12912.IllIIlllllllIIlIIlIIIIlIl <= 162;
    }
}

