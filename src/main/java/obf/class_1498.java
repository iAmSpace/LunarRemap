package obf;

import net.minecraft.block.Block;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1498 {
    public static int lllIIIllIIIIlllIlIIllIIll = 0;
    public static int lllIlIIlIIIlIlIIIllIlllIl = 9;
    public static int IlIllllllIIlIIllllIIlIIIl = 8;
    public static int lIlllIlllIIIIlIIlllIllIII = 11;
    public static int IlIIIIIllllllIIlllIllllll = 10;
    public static int lIllllIIlIIIlIllllllIIIll = 79;
    public static int IIIllIIlIIIIIIlIlIIllIIlI = 2;
    public static int IllIIlllllllIIlIIlIIIIlIl = 18;
    public static int IIIllIllIIlIlIlIlIllllIIl = 31;
    public static int IllIIIllIIIIlIlIlIllIIlll = 83;
    public static int lIIIIlIlIIlllllIIllIIlIII = 106;
    public static int llIIlllIllIllllIIIlIIIIII = 111;
    public static int llIIllIllIlIIlIIllIllllll = 161;
    public static int lllIIlIIIllllllIIIIlIlIlI = 175;
    public static int IlIlllIIIIIIlIIllIIllIlll = 30;
    public static int IlIlIIlIlIllIIlIlIIllIIIl = 55;
    public static int lllllIlllIIllIlIIlIIIllII = 63;
    public static int IlIlIIlllIIlIllIIIlllllIl = 64;
    public static int lIIlIIIIIlIlllIlIIlIlIlll = 65;
    public static int lIlIlIIlIIIIlIIIIIlllIIII = 68;
    public static int IlIIIlIIIIllIIIllIIIIIIll = 71;
    public static int IIlllIlIlllIllIIIlllIIlIl = 77;
    public static int lIlIllIIlIIlIIlIIlIIlIIll = 85;
    public static int llIIlIllIllllIlIIIIlIIlll = 107;
    public static int llIllllIlIllIIIlIllIIlIlI = 113;
    public static int lIlllIlllIlIIIIlllIlIlIIl = 139;
    public static int IlIIlllllIIlIlIlllllIllll = 143;
    public static Integer[] llIIlIlIlllIIllIlIlllIllI = new Integer[]{lllllIlllIIllIlIIlIIIllII, IlIlIIlllIIlIllIIIlllllIl, lIIlIIIIIlIlllIlIIlIlIlll, lIlIlIIlIIIIlIIIIIlllIIII, IlIIIlIIIIllIIIllIIIIIIll, IIlllIlIlllIllIIIlllIIlIl, lIlIllIIlIIlIIlIIlIIlIIll, lIIIIlIlIIlllllIIllIIlIII, llIIlIllIllllIlIIIIlIIlll, llIllllIlIllIIIlIllIIlIlI, lIlllIlllIlIIIIlllIlIlIIl, IlIIlllllIIlIlIlllllIllll};

    public static void lllIIIllIIIIlllIlIIllIIll() {
        lllIIIllIIIIlllIlIIllIIll = Block.blockRegistry.IlIllllllIIlIIllllIIlIIIl(Block.blockRegistry.getObject("minecraft:air"));
        lllIlIIlIIIlIlIIIllIlllIl = Block.blockRegistry.IlIllllllIIlIIllllIIlIIIl(Block.blockRegistry.getObject("minecraft:water"));
        IlIllllllIIlIIllllIIlIIIl = Block.blockRegistry.IlIllllllIIlIIllllIIlIIIl(Block.blockRegistry.getObject("minecraft:flowing_water"));
        lIlllIlllIIIIlIIlllIllIII = Block.blockRegistry.IlIllllllIIlIIllllIIlIIIl(Block.blockRegistry.getObject("minecraft:lava"));
        IlIIIIIllllllIIlllIllllll = Block.blockRegistry.IlIllllllIIlIIllllIIlIIIl(Block.blockRegistry.getObject("minecraft:flowing_lava"));
        lIllllIIlIIIlIllllllIIIll = Block.blockRegistry.IlIllllllIIlIIllllIIlIIIl(Block.blockRegistry.getObject("minecraft:ice"));
        IIIllIIlIIIIIIlIlIIllIIlI = Block.blockRegistry.IlIllllllIIlIIllllIIlIIIl(Block.blockRegistry.getObject("minecraft:grass"));
        IllIIlllllllIIlIIlIIIIlIl = Block.blockRegistry.IlIllllllIIlIIllllIIlIIIl(Block.blockRegistry.getObject("minecraft:leaves"));
        IIIllIllIIlIlIlIlIllllIIl = Block.blockRegistry.IlIllllllIIlIIllllIIlIIIl(Block.blockRegistry.getObject("minecraft:tallgrass"));
        IllIIIllIIIIlIlIlIllIIlll = Block.blockRegistry.IlIllllllIIlIIllllIIlIIIl(Block.blockRegistry.getObject("minecraft:reeds"));
        lIIIIlIlIIlllllIIllIIlIII = Block.blockRegistry.IlIllllllIIlIIllllIIlIIIl(Block.blockRegistry.getObject("minecraft:vine"));
        llIIlllIllIllllIIIlIIIIII = Block.blockRegistry.IlIllllllIIlIIllllIIlIIIl(Block.blockRegistry.getObject("minecraft:waterlily"));
        llIIllIllIlIIlIIllIllllll = Block.blockRegistry.IlIllllllIIlIIllllIIlIIIl(Block.blockRegistry.getObject("minecraft:leaves2"));
        lllIIlIIIllllllIIIIlIlIlI = Block.blockRegistry.IlIllllllIIlIIllllIIlIIIl(Block.blockRegistry.getObject("minecraft:double_plant"));
        IlIlllIIIIIIlIIllIIllIlll = Block.blockRegistry.IlIllllllIIlIIllllIIlIIIl(Block.blockRegistry.getObject("minecraft:web"));
        lllllIlllIIllIlIIlIIIllII = Block.blockRegistry.IlIllllllIIlIIllllIIlIIIl(Block.blockRegistry.getObject("minecraft:standing_sign"));
        IlIlIIlllIIlIllIIIlllllIl = Block.blockRegistry.IlIllllllIIlIIllllIIlIIIl(Block.blockRegistry.getObject("minecraft:wooden_door"));
        lIIlIIIIIlIlllIlIIlIlIlll = Block.blockRegistry.IlIllllllIIlIIllllIIlIIIl(Block.blockRegistry.getObject("minecraft:ladder"));
        lIlIlIIlIIIIlIIIIIlllIIII = Block.blockRegistry.IlIllllllIIlIIllllIIlIIIl(Block.blockRegistry.getObject("minecraft:wall_sign"));
        IlIIIlIIIIllIIIllIIIIIIll = Block.blockRegistry.IlIllllllIIlIIllllIIlIIIl(Block.blockRegistry.getObject("minecraft:iron_door"));
        IIlllIlIlllIllIIIlllIIlIl = Block.blockRegistry.IlIllllllIIlIIllllIIlIIIl(Block.blockRegistry.getObject("minecraft:stone_button"));
        lIlIllIIlIIlIIlIIlIIlIIll = Block.blockRegistry.IlIllllllIIlIIllllIIlIIIl(Block.blockRegistry.getObject("minecraft:fence"));
        llIIlIllIllllIlIIIIlIIlll = Block.blockRegistry.IlIllllllIIlIIllllIIlIIIl(Block.blockRegistry.getObject("minecraft:fence_gate"));
        llIllllIlIllIIIlIllIIlIlI = Block.blockRegistry.IlIllllllIIlIIllllIIlIIIl(Block.blockRegistry.getObject("minecraft:nether_brick_fence"));
        lIlllIlllIlIIIIlllIlIlIIl = Block.blockRegistry.IlIllllllIIlIIllllIIlIIIl(Block.blockRegistry.getObject("minecraft:cobblestone_wall"));
        IlIIlllllIIlIlIlllllIllll = Block.blockRegistry.IlIllllllIIlIIllllIIlIIIl(Block.blockRegistry.getObject("minecraft:wooden_button"));
        llIIlIlIlllIIllIlIlllIllI = new Integer[]{lllllIlllIIllIlIIlIIIllII, IlIlIIlllIIlIllIIIlllllIl, lIIlIIIIIlIlllIlIIlIlIlll, lIlIlIIlIIIIlIIIIIlllIIII, IlIIIlIIIIllIIIllIIIIIIll, IIlllIlIlllIllIIIlllIIlIl, lIlIllIIlIIlIIlIIlIIlIIll, lIIIIlIlIIlllllIIllIIlIII, llIIlIllIllllIlIIIIlIIlll, llIllllIlIllIIIlIllIIlIlI, lIlllIlllIlIIIIlllIlIlIIl, IlIIlllllIIlIlIlllllIllll};
    }
}

