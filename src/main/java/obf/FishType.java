package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import net.minecraft.item.ItemStack;

import java.util.Map;

public enum FishType {
    COD("COD", 0, 0, "cod", 2, 0.1F, 5, 0.6F),
    SALMON("SALMON", 1, 1, "salmon", 2, 0.1F, 6, 0.8F),
    CLOWNFISH("CLOWNFISH", 2, 2, "clownfish", 1, 0.1F),
    PUFFERFISH("PUFFERFISH", 3, 3, "pufferfish", 1, 0.1F);

    private static final Map field_150983_e;
    private final int field_150980_f;
    private final String field_150981_g;
    private IIcon field_150993_h;
    private IIcon field_150994_i;
    private final int field_150991_j;
    private final float field_150992_k;
    private final int field_150989_l;
    private final float field_150990_m;
    private boolean field_150987_n = false;
    private static final FishType[] $VALUES = new FishType[] { COD, SALMON, CLOWNFISH, PUFFERFISH };

    private FishType(String p_i45336_1_, int p_i45336_2_, int p_i45336_3_, String p_i45336_4_, int p_i45336_5_, float p_i45336_6_, int p_i45336_7_, float p_i45336_8_)
    {
        this.field_150980_f = p_i45336_3_;
        this.field_150981_g = p_i45336_4_;
        this.field_150991_j = p_i45336_5_;
        this.field_150992_k = p_i45336_6_;
        this.field_150989_l = p_i45336_7_;
        this.field_150990_m = p_i45336_8_;
        this.field_150987_n = true;
    }

    private FishType(String p_i45337_1_, int p_i45337_2_, int p_i45337_3_, String p_i45337_4_, int p_i45337_5_, float p_i45337_6_)
    {
        this.field_150980_f = p_i45337_3_;
        this.field_150981_g = p_i45337_4_;
        this.field_150991_j = p_i45337_5_;
        this.field_150992_k = p_i45337_6_;
        this.field_150989_l = 0;
        this.field_150990_m = 0.0F;
        this.field_150987_n = false;
    }

    public int lllIIIllIIIIlllIlIIllIIll() {
        return this.field_150980_f;
    }

    public String lllIlIIlIIIlIlIIIllIlllIl() {
        return this.field_150981_g;
    }

    public int IlIllllllIIlIIllllIIlIIIl() {
        return this.field_150991_j;
    }

    public float lIlllIlllIIIIlIIlllIllIII() {
        return this.field_150992_k;
    }

    public int IlIIIIIllllllIIlllIllllll() {
        return this.field_150989_l;
    }

    public float lIllllIIlIIIlIllllllIIIll() {
        return this.field_150990_m;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
        this.field_150993_h = class_08872.lllIIIllIIIIlllIlIIllIIll("fish_" + this.field_150981_g + "_raw");
        if (this.field_150987_n) {
            this.field_150994_i = class_08872.lllIIIllIIIIlllIlIIllIIll("fish_" + this.field_150981_g + "_cooked");
        }
    }

    public IIcon IIIllIIlIIIIIIlIlIIllIIlI() {
        return this.field_150993_h;
    }

    public IIcon IllIIlllllllIIlIIlIIIIlIl() {
        return this.field_150994_i;
    }

    public boolean IIIllIllIIlIlIlIlIllllIIl() {
        return this.field_150987_n;
    }

    public static FishType lllIIIllIIIIlllIlIIllIIll(int n) {
        FishType class_18182 = (FishType)((Object) field_150983_e.get(n));
        return class_18182 == null ? COD : class_18182;
    }

    public static FishType lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972) {
        return class_08972.lllIIIllIIIIlllIlIIllIIll() instanceof class_2054 ? FishType.lllIIIllIIIIlllIlIIllIIll(class_08972.IllIIIllIIIIlIlIlIllIIlll()) : COD;
    }

    static {
        field_150983_e = Maps.newHashMap();
        for (FishType class_18182 : FishType.values()) {
            field_150983_e.put(class_18182.lllIIIllIIIIlllIlIIllIIll(), class_18182);
        }
    }
}

