package obf;

import net.minecraft.init.Items;
import net.minecraft.stats.AchievementList;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1628
extends class_1291 {
    private class_0814 lllIIIllIIIIlllIlIIllIIll;
    private int lllIlIIlIIIlIlIIIllIlllIl;

    public class_1628(class_0814 class_08142, class_0850 class_08502, int n, int n2, int n3) {
        super(class_08502, n, n2, n3);
        this.lllIIIllIIIIlllIlIIllIIll = class_08142;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972) {
        return false;
    }

    @Override
    public ItemStack lllIIIllIIIIlllIlIIllIIll(int n) {
        if (this.lllIlIIlIIIlIlIIIllIlllIl()) {
            this.lllIlIIlIIIlIlIIIllIlllIl += Math.min(n, this.lllIIIllIIIIlllIlIIllIIll().lllIlIIlIIIlIlIIIllIlllIl);
        }
        return super.lllIIIllIIIIlllIlIIllIIll(n);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0814 class_08142, ItemStack class_08972) {
        this.lIlllIlllIIIIlIIlllIllIII(class_08972);
        super.lllIIIllIIIIlllIlIIllIIll(class_08142, class_08972);
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, int n) {
        this.lllIlIIlIIIlIlIIIllIlllIl += n;
        this.lIlllIlllIIIIlIIlllIllIII(class_08972);
    }

    @Override
    protected void lIlllIlllIIIIlIIlllIllIII(ItemStack class_08972) {
        class_08972.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll.lIlIllIIlIIlIIlIIlIIlIIll, this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl);
        if (!this.lllIIIllIIIIlllIlIIllIIll.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
            int n;
            int n2 = this.lllIlIIlIIIlIlIIIllIlllIl;
            float f = class_0400.lllIIIllIIIIlllIlIIllIIll().lllIlIIlIIIlIlIIIllIlllIl(class_08972);
            if (f == 0.0f) {
                n2 = 0;
            } else if (f < 1.0f) {
                n = MathHelper.lIlllIlllIIIIlIIlllIllIII((float)n2 * f);
                if (n < MathHelper.lIllllIIlIIIlIllllllIIIll((float)n2 * f) && (float)Math.random() < (float)n2 * f - (float)n) {
                    ++n;
                }
                n2 = n;
            }
            while (n2 > 0) {
                n = class_1138.lllIIIllIIIIlllIlIIllIIll(n2);
                n2 -= n;
                this.lllIIIllIIIIlllIlIIllIIll.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(new class_1138(this.lllIIIllIIIIlllIlIIllIIll.lIlIllIIlIIlIIlIIlIIlIIll, this.lllIIIllIIIIlllIlIIllIIll.IlIIlllllIIlIlIlllllIllll, this.lllIIIllIIIIlllIlIIllIIll.llIIlIlIlllIIllIlIlllIllI + 0.5, this.lllIIIllIIIIlllIlIIllIIll.IllIIIIllIIllIllIlllIlIIl + 0.5, n));
            }
        }
        this.lllIlIIlIIIlIlIIIllIlllIl = 0;
        if (class_08972.lllIIIllIIIIlllIlIIllIIll() == Items.iron_ingot) {
            this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(AchievementList.acquireIron, 1);
        }
        if (class_08972.lllIIIllIIIIlllIlIIllIIll() == Items.cooked_fished) {
            this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(AchievementList.cookFish, 1);
        }
    }
}

