package obf;

import net.minecraft.init.Items;
import net.minecraft.block.BlockDispenser;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public class ItemArmor
extends Item {
    private static final int[] llIIllIllIlIIlIIllIllllll = new int[]{11, 16, 15, 13};
    private static final String[] lllIIlIIIllllllIIIIlIlIlI = new String[]{"leather_helmet_overlay", "leather_chestplate_overlay", "leather_leggings_overlay", "leather_boots_overlay"};
    public static final String[] IIIllIllIIlIlIlIlIllllIIl = new String[]{"empty_armor_slot_helmet", "empty_armor_slot_chestplate", "empty_armor_slot_leggings", "empty_armor_slot_boots"};
    private static final class_1677 IlIlllIIIIIIlIIllIIllIlll = new class_1424();
    public final int IllIIIllIIIIlIlIlIllIIlll;
    public final int lIIIIlIlIIlllllIIllIIlIII;
    public final int llIIlllIllIllllIIIlIIIIII;
    private final ArmorMaterial IlIlIIlIlIllIIlIlIIllIIIl;
    private IIcon lllllIlllIIllIlIIlIIIllII;
    private IIcon IlIlIIlllIIlIllIIIlllllIl;

    public ItemArmor(ArmorMaterial class_05572, int n, int n2) {
        this.IlIlIIlIlIllIIlIlIIllIIIl = class_05572;
        this.IllIIIllIIIIlIlIlIllIIlll = n2;
        this.llIIlllIllIllllIIIlIIIIII = n;
        this.lIIIIlIlIIlllllIIllIIlIII = class_05572.getDamageReductionAmount(n2);
        this.IlIIIIIllllllIIlllIllllll(class_05572.getDurability(n2));
        this.lIlllIlllIIIIlIIlllIllIII = 1;
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.IllIIIllIIIIlIlIlIllIIlll);
        BlockDispenser.dispenseBehaviorRegistry.putObject(this, IlIlllIIIIIIlIIllIIllIlll);
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, int n) {
        if (n > 0) {
            return 0xFFFFFF;
        }
        int n2 = this.lllIIlIIIllllllIIIIlIlIlI(class_08972);
        if (n2 < 0) {
            n2 = 0xFFFFFF;
        }
        return n2;
    }

    @Override
    public boolean IlIlIIlIlIllIIlIlIIllIIIl() {
        return this.IlIlIIlIlIllIIlIlIIllIIIl == ArmorMaterial.CLOTH;
    }

    @Override
    public int IlIlllIIIIIIlIIllIIllIlll() {
        return this.IlIlIIlIlIllIIlIlIIllIIIl.getEnchantability();
    }

    public ArmorMaterial IlIIIlIIIIllIIIllIIIIIIll() {
        return this.IlIlIIlIlIllIIlIlIIllIIIl;
    }

    public boolean llIIllIllIlIIlIIllIllllll(ItemStack class_08972) {
        return this.IlIlIIlIlIllIIlIlIIllIIIl != ArmorMaterial.CLOTH ? false : (!class_08972.IlIlIIlIlIllIIlIlIIllIIIl() ? false : (!class_08972.lllllIlllIIllIlIIlIIIllII().lllIlIIlIIIlIlIIIllIlllIl("display", 10) ? false : class_08972.lllllIlllIIllIlIIlIIIllII().llIIllIllIlIIlIIllIllllll("display").lllIlIIlIIIlIlIIIllIlllIl("color", 3)));
    }

    public int lllIIlIIIllllllIIIIlIlIlI(ItemStack class_08972) {
        if (this.IlIlIIlIlIllIIlIlIIllIIIl != ArmorMaterial.CLOTH) {
            return -1;
        }
        class_0775 class_07752 = class_08972.lllllIlllIIllIlIIlIIIllII();
        if (class_07752 == null) {
            return 10511680;
        }
        class_0775 class_07753 = class_07752.llIIllIllIlIIlIIllIllllll("display");
        return class_07753 == null ? 10511680 : (class_07753.lllIlIIlIIIlIlIIIllIlllIl("color", 3) ? class_07753.lIllllIIlIIIlIllllllIIIll("color") : 10511680);
    }

    @Override
    public IIcon lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        return n2 == 1 ? this.lllllIlllIIllIlIIlIIIllII : super.lllIIIllIIIIlllIlIIllIIll(n, n2);
    }

    public void IlIlllIIIIIIlIIllIIllIlll(ItemStack class_08972) {
        class_0775 class_07752;
        class_0775 class_07753;
        if (this.IlIlIIlIlIllIIlIlIIllIIIl == ArmorMaterial.CLOTH && (class_07753 = class_08972.lllllIlllIIllIlIIlIIIllII()) != null && (class_07752 = class_07753.llIIllIllIlIIlIIllIllllll("display")).IlIllllllIIlIIllllIIlIIIl("color")) {
            class_07752.IlIlllIIIIIIlIIllIIllIlll("color");
        }
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(ItemStack class_08972, int n) {
        if (this.IlIlIIlIlIllIIlIlIIllIIIl != ArmorMaterial.CLOTH) {
            throw new UnsupportedOperationException("Can't dye non-leather!");
        }
        class_0775 class_07752 = class_08972.lllllIlllIIllIlIIlIIIllII();
        if (class_07752 == null) {
            class_07752 = new class_0775();
            class_08972.lIlllIlllIIIIlIIlllIllIII(class_07752);
        }
        class_0775 class_07753 = class_07752.llIIllIllIlIIlIIllIllllll("display");
        if (!class_07752.lllIlIIlIIIlIlIIIllIlllIl("display", 10)) {
            class_07752.lllIIIllIIIIlllIlIIllIIll("display", class_07753);
        }
        class_07753.lllIIIllIIIIlllIlIIllIIll("color", n);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, ItemStack class_08973) {
        return this.IlIlIIlIlIllIIlIlIIllIIIl.func_151685_b() == class_08973.lllIIIllIIIIlllIlIIllIIll() ? true : super.lllIIIllIIIIlllIlIIllIIll(class_08972, class_08973);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
        super.lllIIIllIIIIlllIlIIllIIll(class_08872);
        if (this.IlIlIIlIlIllIIlIlIIllIIIl == ArmorMaterial.CLOTH) {
            this.lllllIlllIIllIlIIlIIIllII = class_08872.lllIIIllIIIIlllIlIIllIIll(lllIIlIIIllllllIIIIlIlIlI[this.IllIIIllIIIIlIlIlIllIIlll]);
        }
        this.IlIlIIlllIIlIllIIIlllllIl = class_08872.lllIIIllIIIIlllIlIIllIIll(IIIllIllIIlIlIlIlIllllIIl[this.IllIIIllIIIIlIlIlIllIIlll]);
    }

    @Override
    public ItemStack lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, class_1334 class_13342, class_0814 class_08142) {
        int n = class_0339.a_(class_08972) - 1;
        ItemStack class_08973 = class_08142.lIIlIIIIIlIlllIlIIlIlIlll(n);
        if (class_08973 == null) {
            class_08142.lllIIIllIIIIlllIlIIllIIll(n, class_08972.llIIlllIllIllllIIIlIIIIII());
            class_08972.lllIlIIlIIIlIlIIIllIlllIl = 0;
        }
        return class_08972;
    }

    public static IIcon lIllllIIlIIIlIllllllIIIll(int n) {
        switch (n) {
            case 0: {
                return Items.IIlIllIIlllllIIlIIllllIIl.IlIlIIlllIIlIllIIIlllllIl;
            }
            case 1: {
                return Items.IllllIIlIIIllIlllIlllIllI.IlIlIIlllIIlIllIIIlllllIl;
            }
            case 2: {
                return Items.IllIlIlIIIlllIIllIIIIlIll.IlIlIIlllIIlIllIIIlllllIl;
            }
            case 3: {
                return Items.diamond_boots.IlIlIIlllIIlIllIIIlllllIl;
            }
        }
        return null;
    }

    static /* synthetic */ int[] getMaxDamageArray() {
        return llIIllIllIlIIlIIllIllllll;
    }
}

