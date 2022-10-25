package obf;

import net.minecraft.client.settings.GameSettings;
import net.minecraft.client.settings.Options;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1884
extends class_0229 {
    private class_0229 lllIlIIlIIIlIlIIIllIlllIl;
    protected String lllIIIllIIIIlllIlIIllIIll = "Quality Settings";
    private GameSettings IlIllllllIIlIIllllIIlIIIl;
    private static Options[] lIlllIlllIIIIlIIlllIllIII = new Options[]{Options.MIPMAP_LEVELS, Options.IIIIlIlIIlIIIIlIlllIlIIII, Options.ANISOTROPIC_FILTERING, Options.lIIIIlIlIlIIIlIIllIIlIlIl, Options.IlIIIlIIlllllIIIllIlIlIll, Options.IIIIIIlIIIIIIIIIIlIlIlIlI, Options.llllIlIIllIIlllllIIllIIll, Options.lIlIIIllIIllIIlIllllllIll, Options.IllIIIIlIIlllllllllIlIlII, Options.IIIlllIlIIllIIlIlIllIlIIl, Options.IIIIlllIIlIllllllIllIIlll, Options.IllIlllIIIlllllIllIIlIlIl, Options.llIIIlIIllIIllIllIIlIlllI, Options.lIIllIlIllIlIlIIlIlIIIIll, Options.lIIIllIlIlIlIIIllIlIlIllI, Options.lIIIIIlIllIllIlIlIIllllll};
    private int IlIIIIIllllllIIlllIllllll = 0;
    private int lIllllIIlIIIlIllllllIIIll = 0;
    private long IIIllIIlIIIIIIlIlIIllIIlI = 0L;

    public class_1884(class_0229 class_02292, GameSettings class_17512) {
        this.lllIlIIlIIIlIlIIIllIlllIl = class_02292;
        this.IlIllllllIIlIIllllIIlIIIl = class_17512;
    }

    @Override
    public void n_() {
        int n = 0;
        for (Options class_07282 : lIlllIlllIIIIlIIlllIllIII) {
            int n2 = this.IlIlIIlllIIlIllIIIlllllIl / 2 - 155 + n % 2 * 160;
            int n3 = this.lIIlIIIIIlIlllIlIIlIlIlll / 6 + 21 * (n / 2) - 10;
            if (!class_07282.getEnumFloat()) {
                this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1249(class_07282.returnEnumOrdinal(), n2, n3, class_07282, this.IlIllllllIIlIIllllIIlIIIl.IlIllllllIIlIIllllIIlIIIl(class_07282)));
            } else {
                this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1474(class_07282.returnEnumOrdinal(), n2, n3, class_07282));
            }
            ++n;
        }
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1197(200, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 100, this.lIIlIIIIIlIlllIlIIlIlIlll / 6 + 168 + 11, class_0616.lllIIIllIIIIlllIlIIllIIll("gui.done", new Object[0])));
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1197 class_11972) {
        if (class_11972.IllIIIllIIIIlIlIlIllIIlll) {
            if (class_11972.IIIllIllIIlIlIlIlIllllIIl < 200 && class_11972 instanceof class_1249) {
                this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(((class_1249)class_11972).lllIIIllIIIIlllIlIIllIIll(), 1);
                class_11972.IllIIlllllllIIlIIlIIIIlIl = this.IlIllllllIIlIIllllIIlIIIl.IlIllllllIIlIIllllIIlIIIl(Options.getEnumOptions(class_11972.IIIllIllIIlIlIlIlIllllIIl));
            }
            if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 200) {
                this.lllllIlllIIllIlIIlIIIllII.gameSettings.IlIllllllIIlIIllllIIlIIIl();
                this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl);
            }
            if (class_11972.IIIllIllIIlIlIlIlIllllIIl != Options.lIIIllIIIIIllllIlIlIllIll.ordinal()) {
                class_0321 class_03212 = new class_0321(this.lllllIlllIIllIlIIlIIIllII, this.lllllIlllIIllIlIIlIIIllII.displayWidth, this.lllllIlllIIllIlIIlIIIllII.displayHeight);
                int n = class_03212.lllIIIllIIIIlllIlIIllIIll();
                int n2 = class_03212.lllIlIIlIIIlIlIIIllIlllIl();
                this.lllIIIllIIIIlllIlIIllIIll(this.lllllIlllIIllIlIIlIIIllII, n, n2);
            }
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
        this.llIIlIllIllllIlIIIIlIIlll();
        this.lllIIIllIIIIlllIlIIllIIll(this.lIlIllIIlIIlIIlIIlIIlIIll, this.lllIIIllIIIIlllIlIIllIIll, this.IlIlIIlllIIlIllIIIlllllIl / 2, 20, 0xFFFFFF);
        super.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
        if (Math.abs(n - this.IlIIIIIllllllIIlllIllllll) <= 5 && Math.abs(n2 - this.lIllllIIlIIIlIllllllIIIll) <= 5) {
            int n3 = 700;
            if (System.currentTimeMillis() >= this.IIIllIIlIIIIIIlIlIIllIIlI + (long)n3) {
                int n4 = this.IlIlIIlllIIlIllIIIlllllIl / 2 - 150;
                int n5 = this.lIIlIIIIIlIlllIlIIlIlIlll / 6 - 5;
                if (n2 <= n5 + 98) {
                    n5 += 105;
                }
                int n6 = n4 + 150 + 150;
                int n7 = n5 + 84 + 10;
                class_1197 class_11972 = this.lllIIIllIIIIlllIlIIllIIll(n, n2);
                if (class_11972 != null) {
                    String string = this.lllIlIIlIIIlIlIIIllIlllIl(class_11972.IllIIlllllllIIlIIlIIIIlIl);
                    String[] arrstring = this.lllIIIllIIIIlllIlIIllIIll(string);
                    if (arrstring == null) {
                        return;
                    }
                    class_0210.lllIIIllIIIIlllIlIIllIIll(n4, n5, n6, n7, -536870912);
                    for (int i = 0; i < arrstring.length; ++i) {
                        String string2 = arrstring[i];
                        int n8 = 0xDDDDDD;
                        if (string2.endsWith("!")) {
                            n8 = 0xFF2020;
                        }
                        this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(string2, (float)(n4 + 5), (float)(n5 + 5 + i * 11), n8);
                    }
                }
            }
        } else {
            this.IlIIIIIllllllIIlllIllllll = n;
            this.lIllllIIlIIIlIllllllIIIll = n2;
            this.IIIllIIlIIIIIIlIlIIllIIlI = System.currentTimeMillis();
        }
    }

    private String[] lllIIIllIIIIlllIlIIllIIll(String string) {
        String[] arrstring;
        if (string.equals("Mipmap Levels")) {
            String[] arrstring2 = new String[6];
            arrstring2[0] = "Visual effect which makes distant objects look better";
            arrstring2[1] = "by smoothing the texture details";
            arrstring2[2] = "  OFF - no smoothing";
            arrstring2[3] = "  1 - minimum smoothing";
            arrstring2[4] = "  4 - maximum smoothing";
            arrstring = arrstring2;
            arrstring2[5] = "This option usually does not affect the performance.";
        } else if (string.equals("Mipmap Type")) {
            String[] arrstring3 = new String[5];
            arrstring3[0] = "Visual effect which makes distant objects look better";
            arrstring3[1] = "by smoothing the texture details";
            arrstring3[2] = "  Nearest - rough smoothing";
            arrstring3[3] = "  Linear - fine smoothing";
            arrstring = arrstring3;
            arrstring3[4] = "This option usually does not affect the performance.";
        } else if (string.equals("Anisotropic Filtering")) {
            String[] arrstring4 = new String[5];
            arrstring4[0] = "Anisotropic Filtering";
            arrstring4[1] = " OFF - (default) standard texture detail (faster)";
            arrstring4[2] = " 2-16 - finer details in mipmapped textures (slower)";
            arrstring4[3] = "The Anisotropic Filtering restores details in mipmapped";
            arrstring = arrstring4;
            arrstring4[4] = "textures. Higher values may decrease the FPS.";
        } else if (string.equals("Antialiasing")) {
            String[] arrstring5 = new String[8];
            arrstring5[0] = "Antialiasing";
            arrstring5[1] = " OFF - (default) no antialiasing (faster)";
            arrstring5[2] = " 2-16 - antialiased lines and edges (slower)";
            arrstring5[3] = "The Antialiasing smooths jagged lines and ";
            arrstring5[4] = "sharp color transitions.";
            arrstring5[5] = "Higher values may substantially decrease the FPS.";
            arrstring5[6] = "Not all levels are supported by all graphics cards.";
            arrstring = arrstring5;
            arrstring5[7] = "Effective after a RESTART!";
        } else if (string.equals("Clear Water")) {
            String[] arrstring6 = new String[3];
            arrstring6[0] = "Clear Water";
            arrstring6[1] = "  ON - clear, transparent water";
            arrstring = arrstring6;
            arrstring6[2] = "  OFF - default water";
        } else if (string.equals("Better Grass")) {
            String[] arrstring7 = new String[4];
            arrstring7[0] = "Better Grass";
            arrstring7[1] = "  OFF - default side grass texture, fastest";
            arrstring7[2] = "  Fast - full side grass texture, slower";
            arrstring = arrstring7;
            arrstring7[3] = "  Fancy - dynamic side grass texture, slowest";
        } else if (string.equals("Better Snow")) {
            String[] arrstring8 = new String[5];
            arrstring8[0] = "Better Snow";
            arrstring8[1] = "  OFF - default snow, faster";
            arrstring8[2] = "  ON - better snow, slower";
            arrstring8[3] = "Shows snow under transparent blocks (fence, tall grass)";
            arrstring = arrstring8;
            arrstring8[4] = "when bordering with snow blocks";
        } else if (string.equals("Random Mobs")) {
            String[] arrstring9 = new String[5];
            arrstring9[0] = "Random Mobs";
            arrstring9[1] = "  OFF - no random mobs, faster";
            arrstring9[2] = "  ON - random mobs, slower";
            arrstring9[3] = "Random mobs uses random textures for the game creatures.";
            arrstring = arrstring9;
            arrstring9[4] = "It needs a texture pack which has multiple mob textures.";
        } else if (string.equals("Swamp Colors")) {
            String[] arrstring10 = new String[4];
            arrstring10[0] = "Swamp Colors";
            arrstring10[1] = "  ON - use swamp colors (default), slower";
            arrstring10[2] = "  OFF - do not use swamp colors, faster";
            arrstring = arrstring10;
            arrstring10[3] = "The swamp colors affect grass, leaves, vines and water.";
        } else if (string.equals("Smooth Biomes")) {
            String[] arrstring11 = new String[6];
            arrstring11[0] = "Smooth Biomes";
            arrstring11[1] = "  ON - smoothing of biome borders (default), slower";
            arrstring11[2] = "  OFF - no smoothing of biome borders, faster";
            arrstring11[3] = "The smoothing of biome borders is done by sampling and";
            arrstring11[4] = "averaging the color of all surrounding blocks.";
            arrstring = arrstring11;
            arrstring11[5] = "Affected are grass, leaves, vines and water.";
        } else if (string.equals("Custom Fonts")) {
            String[] arrstring12 = new String[5];
            arrstring12[0] = "Custom Fonts";
            arrstring12[1] = "  ON - uses custom fonts (default), slower";
            arrstring12[2] = "  OFF - uses default font, faster";
            arrstring12[3] = "The custom fonts are supplied by the current";
            arrstring = arrstring12;
            arrstring12[4] = "texture pack";
        } else if (string.equals("Custom Colors")) {
            String[] arrstring13 = new String[5];
            arrstring13[0] = "Custom Colors";
            arrstring13[1] = "  ON - uses custom colors (default), slower";
            arrstring13[2] = "  OFF - uses default colors, faster";
            arrstring13[3] = "The custom colors are supplied by the current";
            arrstring = arrstring13;
            arrstring13[4] = "texture pack";
        } else if (string.equals("Show Capes")) {
            String[] arrstring14 = new String[3];
            arrstring14[0] = "Show Capes";
            arrstring14[1] = "  ON - show player capes (default)";
            arrstring = arrstring14;
            arrstring14[2] = "  OFF - do not show player capes";
        } else if (string.equals("Connected Textures")) {
            String[] arrstring15 = new String[8];
            arrstring15[0] = "Connected Textures";
            arrstring15[1] = "  OFF - no connected textures (default)";
            arrstring15[2] = "  Fast - fast connected textures";
            arrstring15[3] = "  Fancy - fancy connected textures";
            arrstring15[4] = "Connected textures joins the textures of glass,";
            arrstring15[5] = "sandstone and bookshelves when placed next to";
            arrstring15[6] = "each other. The connected textures are supplied";
            arrstring = arrstring15;
            arrstring15[7] = "by the current texture pack.";
        } else if (string.equals("Far View")) {
            String[] arrstring16 = new String[7];
            arrstring16[0] = "Far View";
            arrstring16[1] = " OFF - (default) standard view distance";
            arrstring16[2] = " ON - 3x view distance";
            arrstring16[3] = "Far View is very resource demanding!";
            arrstring16[4] = "3x view distance => 9x chunks to be loaded => FPS / 9";
            arrstring16[5] = "Standard view distances: 32, 64, 128, 256";
            arrstring = arrstring16;
            arrstring16[6] = "Far view distances: 96, 192, 384, 512";
        } else if (string.equals("Natural Textures")) {
            String[] arrstring17 = new String[8];
            arrstring17[0] = "Natural Textures";
            arrstring17[1] = "  OFF - no natural textures (default)";
            arrstring17[2] = "  ON - use natural textures";
            arrstring17[3] = "Natural textures remove the gridlike pattern";
            arrstring17[4] = "created by repeating blocks of the same type.";
            arrstring17[5] = "It uses rotated and flipped variants of the base";
            arrstring17[6] = "block texture. The configuration for the natural";
            arrstring = arrstring17;
            arrstring17[7] = "textures is supplied by the current texture pack";
        } else if (string.equals("Custom Sky")) {
            String[] arrstring18 = new String[5];
            arrstring18[0] = "Custom Sky";
            arrstring18[1] = "  ON - custom sky textures (default), slow";
            arrstring18[2] = "  OFF - default sky, faster";
            arrstring18[3] = "The custom sky textures are supplied by the current";
            arrstring = arrstring18;
            arrstring18[4] = "texture pack";
        } else if (string.equals("Dynamic Lights")) {
            String[] arrstring19 = new String[7];
            arrstring19[0] = "Dynamic Lights";
            arrstring19[1] = "  OFF - no dynamic lights (default)";
            arrstring19[2] = "  Fast - fast dynamic lights (updated every 500ms)";
            arrstring19[3] = "  Fancy - fancy dynamic lights (updated in real-time)";
            arrstring19[4] = "Enables light emitting items (torch, glowstone, etc.)";
            arrstring19[5] = "to illuminate everything around them when held in hand,";
            arrstring = arrstring19;
            arrstring19[6] = "equipped by other player or dropped on the ground";
        } else {
            arrstring = null;
        }
        return arrstring;
    }

    private String lllIlIIlIIIlIlIIIllIlllIl(String string) {
        int n = string.indexOf(58);
        return n < 0 ? string : string.substring(0, n);
    }

    private class_1197 lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        for (int i = 0; i < this.lIlIlIIlIIIIlIIIIIlllIIII.size(); ++i) {
            boolean bl;
            class_1197 class_11972 = (class_1197)this.lIlIlIIlIIIIlIIIIIlllIIII.get(i);
            int n3 = class_1987.lllIlIIlIIIlIlIIIllIlllIl(class_11972);
            int n4 = class_1987.IlIllllllIIlIIllllIIlIIIl(class_11972);
            boolean bl2 = bl = n >= class_11972.lIllllIIlIIIlIllllllIIIll && n2 >= class_11972.IIIllIIlIIIIIIlIlIIllIIlI && n < class_11972.lIllllIIlIIIlIllllllIIIll + n3 && n2 < class_11972.IIIllIIlIIIIIIlIlIIllIIlI + n4;
            if (!bl) continue;
            return class_11972;
        }
        return null;
    }
}

