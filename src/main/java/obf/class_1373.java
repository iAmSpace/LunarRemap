package obf;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.stats.AchievementList;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1373
extends class_1291 {
    private final class_0850 lllIIIllIIIIlllIlIIllIIll;
    private class_0814 lllIlIIlIIIlIlIIIllIlllIl;
    private int IlIllllllIIlIIllllIIlIIIl;

    public class_1373(class_0814 class_08142, class_0850 class_08502, class_0850 class_08503, int n, int n2, int n3) {
        super(class_08503, n, n2, n3);
        this.lllIlIIlIIIlIlIIIllIlllIl = class_08142;
        this.lllIIIllIIIIlllIlIIllIIll = class_08502;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972) {
        return false;
    }

    @Override
    public ItemStack lllIIIllIIIIlllIlIIllIIll(int n) {
        if (this.lllIlIIlIIIlIlIIIllIlllIl()) {
            this.IlIllllllIIlIIllllIIlIIIl += Math.min(n, this.lllIIIllIIIIlllIlIIllIIll().lllIlIIlIIIlIlIIIllIlllIl);
        }
        return super.lllIIIllIIIIlllIlIIllIIll(n);
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, int n) {
        this.IlIllllllIIlIIllllIIlIIIl += n;
        this.lIlllIlllIIIIlIIlllIllIII(class_08972);
    }

    @Override
    protected void lIlllIlllIIIIlIIlllIllIII(ItemStack class_08972) {
        class_08972.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl.lIlIllIIlIIlIIlIIlIIlIIll, this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl);
        this.IlIllllllIIlIIllllIIlIIIl = 0;
        if (class_08972.lllIIIllIIIIlllIlIIllIIll() == Item.getItemFromBlock(Blocks.crafting_table)) {
            this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(AchievementList.buildWorkBench, 1);
        }
        if (class_08972.lllIIIllIIIIlllIlIIllIIll() instanceof class_0185) {
            this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(AchievementList.buildPickaxe, 1);
        }
        if (class_08972.lllIIIllIIIIlllIlIIllIIll() == Item.getItemFromBlock(Blocks.furnace)) {
            this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(AchievementList.buildFurnace, 1);
        }
        if (class_08972.lllIIIllIIIIlllIlIIllIIll() instanceof class_1079) {
            this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(AchievementList.buildHoe, 1);
        }
        if (class_08972.lllIIIllIIIIlllIlIIllIIll() == Items.bread) {
            this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(AchievementList.makeBread, 1);
        }
        if (class_08972.lllIIIllIIIIlllIlIIllIIll() == Items.cake) {
            this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(AchievementList.bakeCake, 1);
        }
        if (class_08972.lllIIIllIIIIlllIlIIllIIll() instanceof class_0185 && ((class_0185)class_08972.lllIIIllIIIIlllIlIIllIIll()).IlIIIlIIIIllIIIllIIIIIIll() != class_1971.lllIIIllIIIIlllIlIIllIIll) {
            this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(AchievementList.buildBetterPickaxe, 1);
        }
        if (class_08972.lllIIIllIIIIlllIlIIllIIll() instanceof class_1531) {
            this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(AchievementList.buildSword, 1);
        }
        if (class_08972.lllIIIllIIIIlllIlIIllIIll() == Item.getItemFromBlock(Blocks.enchanting_table)) {
            this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(AchievementList.enchantments, 1);
        }
        if (class_08972.lllIIIllIIIIlllIlIIllIIll() == Item.getItemFromBlock(Blocks.bookshelf)) {
            this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(AchievementList.bookcase, 1);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0814 class_08142, ItemStack class_08972) {
        this.lIlllIlllIIIIlIIlllIllIII(class_08972);
        for (int i = 0; i < this.lllIIIllIIIIlllIlIIllIIll.IlIIIIIllllllIIlllIllllll(); ++i) {
            ItemStack class_08973 = this.lllIIIllIIIIlllIlIIllIIll.llIIllIllIlIIlIIllIllllll(i);
            if (class_08973 == null) continue;
            this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(i, 1);
            if (!class_08973.lllIIIllIIIIlllIlIIllIIll().llIIllIllIlIIlIIllIllllll()) continue;
            ItemStack class_08974 = new ItemStack(class_08973.lllIIIllIIIIlllIlIIllIIll().llIIlllIllIllllIIIlIIIIII());
            if (class_08973.lllIIIllIIIIlllIlIIllIIll().lIlllIlllIIIIlIIlllIllIII(class_08973) && this.lllIlIIlIIIlIlIIIllIlllIl.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(class_08974)) continue;
            if (this.lllIIIllIIIIlllIlIIllIIll.llIIllIllIlIIlIIllIllllll(i) == null) {
                this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl(i, class_08974);
                continue;
            }
            this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(class_08974, false);
        }
    }
}

