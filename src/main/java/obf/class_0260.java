package obf;

import net.minecraft.util.ResourceLocation;

public enum class_0260 {
    MENU(new ResourceLocation("minecraft:music.menu"), 20, 600),
    GAME(new ResourceLocation("minecraft:music.game"), 12000, 24000),
    CREATIVE(new ResourceLocation("minecraft:music.game.creative"), 1200, 3600),
    CREDITS(new ResourceLocation("minecraft:music.game.end.credits"), Integer.MAX_VALUE, Integer.MAX_VALUE),
    NETHER(new ResourceLocation("minecraft:music.game.nether"), 1200, 3600),
    END_BOSS(new ResourceLocation("minecraft:music.game.end.dragon"), 0, 0),
    END(new ResourceLocation("minecraft:music.game.end"), 6000, 24000);

    private final ResourceLocation field_148645_h;
    private final int field_148646_i;
    private final int field_148643_j;

    class_0260(ResourceLocation p_i45111_3_, int p_i45111_4_, int p_i45111_5_) {
        this.field_148645_h = p_i45111_3_;
        this.field_148646_i = p_i45111_4_;
        this.field_148643_j = p_i45111_5_;
    }

    public ResourceLocation getMusicTickerLocation() {
        return this.field_148645_h;
    }

    public int func_148634_b() {
        return this.field_148646_i;
    }

    public int func_148633_c() {
        return this.field_148643_j;
    }
}

