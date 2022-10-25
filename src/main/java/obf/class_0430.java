package obf;

import net.minecraft.client.settings.GameSettings;
import net.minecraft.client.settings.Options;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0430
extends class_0229 {
    private class_0229 lllIlIIlIIIlIlIIIllIlllIl;
    protected String lllIIIllIIIIlllIlIIllIIll = "Detail Settings";
    private GameSettings IlIllllllIIlIIllllIIlIIIl;
    private static Options[] lIlllIlllIIIIlIIlllIllIII = new Options[]{Options.llIlllIlIIllIlIIIIllIIlIl, Options.lIIIllIIIIIllllIlIlIllIll, Options.lIIIlIIIlIlllIllIIIlIIIlI, Options.lIIlIlllIllIlIlllIIIIIIII, Options.IllllIIlIIIllIlllIlllIllI, Options.IIlIllIIlllllIIlIIllllIIl, Options.lIIlIIlIllIlIIlIlIIlIlIlI, Options.llIIIIIlIIlIIIIllIIIlIIII, Options.lIlIlIIllIIIlllIllIIlIllI, Options.llllIIIlIlIlIlIIlIIIIIlIl, Options.lIIIIllIIllIIIlIIIllIllII, Options.IIIIIlllIIllllIlllIlllIIl, Options.IIIlIIllIIlIlIIlIIllIIIIl, Options.llllIIllllIllIlllllIIlIlI, Options.IlIIIIIllIlllIIIIlIIIllIl, Options.IIIIlIIIllIIIlIIlIIIIIlll};
    private int IlIIIIIllllllIIlllIllllll = 0;
    private int lIllllIIlIIIlIllllllIIIll = 0;
    private long IIIllIIlIIIIIIlIlIIllIIlI = 0L;

    public class_0430(class_0229 class_02292, GameSettings class_17512) {
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
                        this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(string2, (float)(n4 + 5), (float)(n5 + 5 + i * 11), 0xDDDDDD);
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
        if (string.equals("Clouds")) {
            String[] arrstring2 = new String[7];
            arrstring2[0] = "Clouds";
            arrstring2[1] = "  Default - as set by setting Graphics";
            arrstring2[2] = "  Fast - lower quality, faster";
            arrstring2[3] = "  Fancy - higher quality, slower";
            arrstring2[4] = "  OFF - no clouds, fastest";
            arrstring2[5] = "Fast clouds are rendered 2D.";
            arrstring = arrstring2;
            arrstring2[6] = "Fancy clouds are rendered 3D.";
        } else if (string.equals("Cloud Height")) {
            String[] arrstring3 = new String[3];
            arrstring3[0] = "Cloud Height";
            arrstring3[1] = "  OFF - default height";
            arrstring = arrstring3;
            arrstring3[2] = "  100% - above world height limit";
        } else if (string.equals("Trees")) {
            String[] arrstring4 = new String[6];
            arrstring4[0] = "Trees";
            arrstring4[1] = "  Default - as set by setting Graphics";
            arrstring4[2] = "  Fast - lower quality, faster";
            arrstring4[3] = "  Fancy - higher quality, slower";
            arrstring4[4] = "Fast trees have opaque leaves.";
            arrstring = arrstring4;
            arrstring4[5] = "Fancy trees have transparent leaves.";
        } else if (string.equals("Grass")) {
            String[] arrstring5 = new String[6];
            arrstring5[0] = "Grass";
            arrstring5[1] = "  Default - as set by setting Graphics";
            arrstring5[2] = "  Fast - lower quality, faster";
            arrstring5[3] = "  Fancy - higher quality, slower";
            arrstring5[4] = "Fast grass uses default side texture.";
            arrstring = arrstring5;
            arrstring5[5] = "Fancy grass uses biome side texture.";
        } else if (string.equals("Dropped net.minecraft.init.Items")) {
            String[] arrstring6 = new String[4];
            arrstring6[0] = "Dropped net.minecraft.init.Items";
            arrstring6[1] = "  Default - as set by setting Graphics";
            arrstring6[2] = "  Fast - 2D dropped items, faster";
            arrstring = arrstring6;
            arrstring6[3] = "  Fancy - 3D dropped items, slower";
        } else if (string.equals("Water")) {
            String[] arrstring7 = new String[6];
            arrstring7[0] = "Water";
            arrstring7[1] = "  Default - as set by setting Graphics";
            arrstring7[2] = "  Fast  - lower quality, faster";
            arrstring7[3] = "  Fancy - higher quality, slower";
            arrstring7[4] = "Fast water (1 pass) has some visual artifacts";
            arrstring = arrstring7;
            arrstring7[5] = "Fancy water (2 pass) has no visual artifacts";
        } else if (string.equals("Rain & Snow")) {
            String[] arrstring8 = new String[7];
            arrstring8[0] = "Rain & Snow";
            arrstring8[1] = "  Default - as set by setting Graphics";
            arrstring8[2] = "  Fast  - light rain/snow, faster";
            arrstring8[3] = "  Fancy - heavy rain/snow, slower";
            arrstring8[4] = "  OFF - no rain/snow, fastest";
            arrstring8[5] = "When rain is OFF the splashes and rain sounds";
            arrstring = arrstring8;
            arrstring8[6] = "are still active.";
        } else if (string.equals("Sky")) {
            String[] arrstring9 = new String[4];
            arrstring9[0] = "Sky";
            arrstring9[1] = "  ON - sky is visible, slower";
            arrstring9[2] = "  OFF  - sky is not visible, faster";
            arrstring = arrstring9;
            arrstring9[3] = "When sky is OFF the moon and sun are still visible.";
        } else if (string.equals("Sun & Moon")) {
            String[] arrstring10 = new String[3];
            arrstring10[0] = "Sun & Moon";
            arrstring10[1] = "  ON - sun and moon are visible (default)";
            arrstring = arrstring10;
            arrstring10[2] = "  OFF  - sun and moon are not visible (faster)";
        } else if (string.equals("Stars")) {
            String[] arrstring11 = new String[3];
            arrstring11[0] = "Stars";
            arrstring11[1] = "  ON - stars are visible, slower";
            arrstring = arrstring11;
            arrstring11[2] = "  OFF  - stars are not visible, faster";
        } else if (string.equals("Depth Fog")) {
            String[] arrstring12 = new String[3];
            arrstring12[0] = "Depth Fog";
            arrstring12[1] = "  ON - fog moves closer at bedrock levels (default)";
            arrstring = arrstring12;
            arrstring12[2] = "  OFF - same fog at all levels";
        } else if (string.equals("Show Capes")) {
            String[] arrstring13 = new String[3];
            arrstring13[0] = "Show Capes";
            arrstring13[1] = "  ON - show player capes (default)";
            arrstring = arrstring13;
            arrstring13[2] = "  OFF - do not show player capes";
        } else if (string.equals("Held Item Tooltips")) {
            String[] arrstring14 = new String[3];
            arrstring14[0] = "Held item tooltips";
            arrstring14[1] = "  ON - show tooltips for held items (default)";
            arrstring = arrstring14;
            arrstring14[2] = "  OFF - do not show tooltips for held items";
        } else if (string.equals("Translucent net.minecraft.init.Blocks")) {
            String[] arrstring15 = new String[6];
            arrstring15[0] = "Translucent net.minecraft.init.Blocks";
            arrstring15[1] = "  Fancy - correct color blending (default)";
            arrstring15[2] = "  Fast - fast color blending (faster)";
            arrstring15[3] = "Controls the color blending of translucent blocks";
            arrstring15[4] = "with different color (stained glass, water, ice)";
            arrstring = arrstring15;
            arrstring15[5] = "when placed behind each other with air between them.";
        } else if (string.equals("Dynamic FOV")) {
            String[] arrstring16 = new String[5];
            arrstring16[0] = "Dynamic FOV";
            arrstring16[1] = "  ON - enable dynamic FOV (default)";
            arrstring16[2] = "  OFF - disable dynamic FOV";
            arrstring16[3] = "Changes the field of view (FOV) when flying, sprinting";
            arrstring = arrstring16;
            arrstring16[4] = "or pulling a bow.";
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

