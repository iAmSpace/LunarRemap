package obf;

import net.minecraft.util.MathHelper;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1632 {
    public static final int[] lllIIIllIIIIlllIlIIllIIll = new int[]{0, -1, 0, 1};
    public static final int[] lllIlIIlIIIlIlIIIllIlllIl = new int[]{1, 0, -1, 0};
    public static final String[] IlIllllllIIlIIllllIIlIIIl = new String[]{"SOUTH", "WEST", "NORTH", "EAST"};
    public static final int[] lIlllIlllIIIIlIIlllIllIII = new int[]{3, 4, 2, 5};
    public static final int[] IlIIIIIllllllIIlllIllllll = new int[]{-1, -1, 2, 0, 1, 3};
    public static final int[] lIllllIIlIIIlIllllllIIIll = new int[]{2, 3, 0, 1};
    public static final int[] IIIllIIlIIIIIIlIlIIllIIlI = new int[]{1, 2, 3, 0};
    public static final int[] IllIIlllllllIIlIIlIIIIlIl = new int[]{3, 0, 1, 2};
    public static final int[][] IIIllIllIIlIlIlIlIllllIIl = new int[][]{{1, 0, 3, 2, 5, 4}, {1, 0, 5, 4, 2, 3}, {1, 0, 2, 3, 4, 5}, {1, 0, 4, 5, 3, 2}};

    public static int lllIIIllIIIIlllIlIIllIIll(double d, double d2) {
        return MathHelper.IlIIIIIllllllIIlllIllllll((float)d) > MathHelper.IlIIIIIllllllIIlllIllllll((float)d2) ? (d > 0.0 ? 1 : 3) : (d2 > 0.0 ? 2 : 0);
    }
}

