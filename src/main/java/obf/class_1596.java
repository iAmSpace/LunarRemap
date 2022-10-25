package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.item.ItemStack;

import java.util.ArrayList;

public class class_1596
extends ArrayList {
    public class_1596() {
    }

    public class_1596(class_0775 class_07752) {
        this.lllIIIllIIIIlllIlIIllIIll(class_07752);
    }

    public class_2187 lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, ItemStack class_08973, int n) {
        if (n > 0 && n < this.size()) {
            class_2187 class_21872 = (class_2187)this.get(n);
            return class_08972.lllIIIllIIIIlllIlIIllIIll() == class_21872.lllIIIllIIIIlllIlIIllIIll().lllIIIllIIIIlllIlIIllIIll() && (class_08973 == null && !class_21872.IlIllllllIIlIIllllIIlIIIl() || class_21872.IlIllllllIIlIIllllIIlIIIl() && class_08973 != null && class_21872.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll() == class_08973.lllIIIllIIIIlllIlIIllIIll()) && class_08972.lllIlIIlIIIlIlIIIllIlllIl >= class_21872.lllIIIllIIIIlllIlIIllIIll().lllIlIIlIIIlIlIIIllIlllIl && (!class_21872.IlIllllllIIlIIllllIIlIIIl() || class_08973.lllIlIIlIIIlIlIIIllIlllIl >= class_21872.lllIlIIlIIIlIlIIIllIlllIl().lllIlIIlIIIlIlIIIllIlllIl) ? class_21872 : null;
        }
        for (int i = 0; i < this.size(); ++i) {
            class_2187 class_21873 = (class_2187)this.get(i);
            if (class_08972.lllIIIllIIIIlllIlIIllIIll() != class_21873.lllIIIllIIIIlllIlIIllIIll().lllIIIllIIIIlllIlIIllIIll() || class_08972.lllIlIIlIIIlIlIIIllIlllIl < class_21873.lllIIIllIIIIlllIlIIllIIll().lllIlIIlIIIlIlIIIllIlllIl || (class_21873.IlIllllllIIlIIllllIIlIIIl() || class_08973 != null) && (!class_21873.IlIllllllIIlIIllllIIlIIIl() || class_08973 == null || class_21873.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll() != class_08973.lllIIIllIIIIlllIlIIllIIll() || class_08973.lllIlIIlIIIlIlIIIllIlllIl < class_21873.lllIlIIlIIIlIlIIIllIlllIl().lllIlIIlIIIlIlIIIllIlllIl)) continue;
            return class_21873;
        }
        return null;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_2187 class_21872) {
        for (int i = 0; i < this.size(); ++i) {
            class_2187 class_21873 = (class_2187)this.get(i);
            if (!class_21872.lllIIIllIIIIlllIlIIllIIll(class_21873)) continue;
            if (class_21872.lllIlIIlIIIlIlIIIllIlllIl(class_21873)) {
                this.set(i, class_21872);
            }
            return;
        }
        this.add(class_21872);
    }

    public void lllIIIllIIIIlllIlIIllIIll(PacketBuffer class_01812) {
        class_01812.writeByte((byte)(this.size() & 0xFF));
        for (int i = 0; i < this.size(); ++i) {
            class_2187 class_21872 = (class_2187)this.get(i);
            class_01812.lllIIIllIIIIlllIlIIllIIll(class_21872.lllIIIllIIIIlllIlIIllIIll());
            class_01812.lllIIIllIIIIlllIlIIllIIll(class_21872.lIlllIlllIIIIlIIlllIllIII());
            ItemStack class_08972 = class_21872.lllIlIIlIIIlIlIIIllIlllIl();
            class_01812.writeBoolean(class_08972 != null);
            if (class_08972 != null) {
                class_01812.lllIIIllIIIIlllIlIIllIIll(class_08972);
            }
            class_01812.writeBoolean(class_21872.lIllllIIlIIIlIllllllIIIll());
        }
    }

    public static class_1596 lllIlIIlIIIlIlIIIllIlllIl(PacketBuffer class_01812) {
        class_1596 class_15962 = new class_1596();
        int n = class_01812.readByte() & 0xFF;
        for (int i = 0; i < n; ++i) {
            ItemStack class_08972 = class_01812.IlIllllllIIlIIllllIIlIIIl();
            ItemStack class_08973 = class_01812.IlIllllllIIlIIllllIIlIIIl();
            ItemStack class_08974 = null;
            if (class_01812.readBoolean()) {
                class_08974 = class_01812.IlIllllllIIlIIllllIIlIIIl();
            }
            boolean bl = class_01812.readBoolean();
            class_2187 class_21872 = new class_2187(class_08972, class_08974, class_08973);
            if (bl) {
                class_21872.IIIllIIlIIIIIIlIlIIllIIlI();
            }
            class_15962.add(class_21872);
        }
        return class_15962;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        class_2145 class_21452 = class_07752.IlIllllllIIlIIllllIIlIIIl("Recipes", 10);
        for (int i = 0; i < class_21452.lIlllIlllIIIIlIIlllIllIII(); ++i) {
            class_0775 class_07753 = class_21452.lllIlIIlIIIlIlIIIllIlllIl(i);
            this.add(new class_2187(class_07753));
        }
    }

    public class_0775 lllIIIllIIIIlllIlIIllIIll() {
        class_0775 class_07752 = new class_0775();
        class_2145 class_21452 = new class_2145();
        for (int i = 0; i < this.size(); ++i) {
            class_2187 class_21872 = (class_2187)this.get(i);
            class_21452.lllIIIllIIIIlllIlIIllIIll(class_21872.IllIIlllllllIIlIIlIIIIlIl());
        }
        class_07752.lllIIIllIIIIlllIlIIllIIll("Recipes", class_21452);
        return class_07752;
    }
}

