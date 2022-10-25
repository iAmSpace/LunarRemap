package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1780 {
    public static class_0443 lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        int n = class_07752.lIllllIIlIIIlIllllllIIIll("xPos");
        int n2 = class_07752.lIllllIIlIIIlIllllllIIIll("zPos");
        class_0443 class_04432 = new class_0443(n, n2);
        class_04432.IIIllIIlIIIIIIlIlIIllIIlI = class_07752.lIIIIlIlIIlllllIIllIIlIII("net.minecraft.init.Blocks");
        class_04432.lIllllIIlIIIlIllllllIIIll = new class_1864(class_07752.lIIIIlIlIIlllllIIllIIlIII("Data"), 7);
        class_04432.IlIIIIIllllllIIlllIllllll = new class_1864(class_07752.lIIIIlIlIIlllllIIllIIlIII("SkyLight"), 7);
        class_04432.lIlllIlllIIIIlIIlllIllIII = new class_1864(class_07752.lIIIIlIlIIlllllIIllIIlIII("BlockLight"), 7);
        class_04432.IlIllllllIIlIIllllIIlIIIl = class_07752.lIIIIlIlIIlllllIIllIIlIII("HeightMap");
        class_04432.lllIlIIlIIIlIlIIIllIlllIl = class_07752.lllIIlIIIllllllIIIIlIlIlI("TerrainPopulated");
        class_04432.IllIIlllllllIIlIIlIIIIlIl = class_07752.IlIllllllIIlIIllllIIlIIIl("Entities", 10);
        class_04432.IIIllIllIIlIlIlIlIllllIIl = class_07752.IlIllllllIIlIIllllIIlIIIl("TileEntities", 10);
        class_04432.IllIIIllIIIIlIlIlIllIIlll = class_07752.IlIllllllIIlIIllllIIlIIIl("TileTicks", 10);
        try {
            class_04432.lllIIIllIIIIlllIlIIllIIll = class_07752.IIIllIIlIIIIIIlIlIIllIIlI("LastUpdate");
        }
        catch (ClassCastException classCastException) {
            class_04432.lllIIIllIIIIlllIlIIllIIll = class_07752.lIllllIIlIIIlIllllllIIIll("LastUpdate");
        }
        return class_04432;
    }

    public static void lllIIIllIIIIlllIlIIllIIll(class_0443 class_04432, class_0775 class_07752, class_1076 class_10762) {
        int n;
        int n2;
        class_07752.lllIIIllIIIIlllIlIIllIIll("xPos", class_04432.lIIIIlIlIIlllllIIllIIlIII);
        class_07752.lllIIIllIIIIlllIlIIllIIll("zPos", class_04432.llIIlllIllIllllIIIlIIIIII);
        class_07752.lllIIIllIIIIlllIlIIllIIll("LastUpdate", class_04432.lllIIIllIIIIlllIlIIllIIll);
        int[] arrn = new int[class_04432.IlIllllllIIlIIllllIIlIIIl.length];
        for (int i = 0; i < class_04432.IlIllllllIIlIIllllIIlIIIl.length; ++i) {
            arrn[i] = class_04432.IlIllllllIIlIIllllIIlIIIl[i];
        }
        class_07752.lllIIIllIIIIlllIlIIllIIll("HeightMap", arrn);
        class_07752.lllIIIllIIIIlllIlIIllIIll("TerrainPopulated", class_04432.lllIlIIlIIIlIlIIIllIlllIl);
        class_2145 class_21452 = new class_2145();
        for (int i = 0; i < 8; ++i) {
            n2 = 1;
            for (n = 0; n < 16 && n2 != 0; ++n) {
                block3: for (int j = 0; j < 16 && n2 != 0; ++j) {
                    for (int k = 0; k < 16; ++k) {
                        int n3 = n << 11 | k << 7 | j + (i << 4);
                        byte by = class_04432.IIIllIIlIIIIIIlIlIIllIIlI[n3];
                        if (by == 0) {
                            continue;
                        }
                        n2 = 0;
                        continue block3;
                    }
                }
            }
            if (n2 != 0) continue;
            byte[] arrby = new byte[4096];
            class_0783 class_07832 = new class_0783(arrby.length, 4);
            class_0783 class_07833 = new class_0783(arrby.length, 4);
            class_0783 class_07834 = new class_0783(arrby.length, 4);
            for (int j = 0; j < 16; ++j) {
                for (int k = 0; k < 16; ++k) {
                    for (int i2 = 0; i2 < 16; ++i2) {
                        int n4 = j << 11 | i2 << 7 | k + (i << 4);
                        byte by = class_04432.IIIllIIlIIIIIIlIlIIllIIlI[n4];
                        arrby[k << 8 | i2 << 4 | j] = (byte)(by & 0xFF);
                        class_07832.lllIIIllIIIIlllIlIIllIIll(j, k, i2, class_04432.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(j, k + (i << 4), i2));
                        class_07833.lllIIIllIIIIlllIlIIllIIll(j, k, i2, class_04432.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(j, k + (i << 4), i2));
                        class_07834.lllIIIllIIIIlllIlIIllIIll(j, k, i2, class_04432.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(j, k + (i << 4), i2));
                    }
                }
            }
            class_0775 class_07753 = new class_0775();
            class_07753.lllIIIllIIIIlllIlIIllIIll("Y", (byte)(i & 0xFF));
            class_07753.lllIIIllIIIIlllIlIIllIIll("net.minecraft.init.Blocks", arrby);
            class_07753.lllIIIllIIIIlllIlIIllIIll("Data", class_07832.lllIIIllIIIIlllIlIIllIIll);
            class_07753.lllIIIllIIIIlllIlIIllIIll("SkyLight", class_07833.lllIIIllIIIIlllIlIIllIIll);
            class_07753.lllIIIllIIIIlllIlIIllIIll("BlockLight", class_07834.lllIIIllIIIIlllIlIIllIIll);
            class_21452.lllIIIllIIIIlllIlIIllIIll(class_07753);
        }
        class_07752.lllIIIllIIIIlllIlIIllIIll("Sections", class_21452);
        byte[] arrby = new byte[256];
        for (n2 = 0; n2 < 16; ++n2) {
            for (n = 0; n < 16; ++n) {
                arrby[n << 4 | n2] = (byte)(class_10762.lllIIIllIIIIlllIlIIllIIll((int)(class_04432.lIIIIlIlIIlllllIIllIIlIII << 4 | n2), (int)(class_04432.llIIlllIllIllllIIIlIIIIII << 4 | n)).lIlIllIIllIIIIlllIlIlllIl & 0xFF);
            }
        }
        class_07752.lllIIIllIIIIlllIlIIllIIll("Biomes", arrby);
        class_07752.lllIIIllIIIIlllIlIIllIIll("Entities", class_04432.IllIIlllllllIIlIIlIIIIlIl);
        class_07752.lllIIIllIIIIlllIlIIllIIll("TileEntities", class_04432.IIIllIllIIlIlIlIlIllllIIl);
        if (class_04432.IllIIIllIIIIlIlIlIllIIlll != null) {
            class_07752.lllIIIllIIIIlllIlIIllIIll("TileTicks", class_04432.IllIIIllIIIIlIlIlIllIIlll);
        }
    }
}

