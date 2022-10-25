package obf;

import net.minecraft.init.Items;
import net.minecraft.item.Item;

public enum ArmorMaterial {
    CLOTH("CLOTH", 0, 5, new int[] { 1, 3, 2, 1 }, 15),
    CHAIN("CHAIN", 1, 15, new int[] { 2, 5, 4, 1 }, 12),
    IRON("IRON", 2, 15, new int[] { 2, 6, 5, 2 }, 9),
    GOLD("GOLD", 3, 7, new int[] { 2, 5, 3, 1 }, 25),
    DIAMOND("DIAMOND", 4, 33, new int[] { 3, 8, 6, 3 }, 10);

    private int maxDamageFactor;
    private int[] damageReductionAmountArray;
    private int enchantability;

    private ArmorMaterial(String p_i1827_1_, int p_i1827_2_, int p_i1827_3_, int[] p_i1827_4_, int p_i1827_5_)
    {
        this.maxDamageFactor = p_i1827_3_;
        this.damageReductionAmountArray = p_i1827_4_;
        this.enchantability = p_i1827_5_;
    }

    public int getDurability(int n) {
        return ItemArmor.getMaxDamageArray()[n] * this.maxDamageFactor;
    }

    public int getDamageReductionAmount(int n) {
        return this.damageReductionAmountArray[n];
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public Item func_151685_b() {
        return this == CLOTH ? Items.leather : (this == CHAIN ? Items.iron_ingot : (this == GOLD ? Items.lIIIIlIlIIlllllIIllIIlIII : (this == IRON ? Items.iron_ingot : (this == DIAMOND ? Items.diamond : null))));
    }
}

