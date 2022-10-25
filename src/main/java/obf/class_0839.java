package obf;

import net.minecraft.client.settings.GameSettings;
import net.minecraft.client.settings.Options;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0839
extends class_0229
implements class_0945 {
    private class_0229 lllIlIIlIIIlIlIIIllIlllIl;
    protected String lllIIIllIIIIlllIlIIllIIll = "Other Settings";
    private GameSettings IlIllllllIIlIIllllIIlIIIl;
    private static Options[] lIlllIlllIIIIlIIlllIllIII = new Options[]{Options.lllIIIlIIlIlIllIIIIIlIIll, Options.lIIlllIIlIlIlIIIlIlllIIll, Options.llIIIlIlIlIIlIllIIIllIlIl, Options.lIlIllIIllIIIIlllIlIlllIl, Options.USE_FULLSCREEN, Options.lIlIIlllllIlllllIlIIIllll, Options.IIIlIlIllIlllllIlIllllllI, Options.IIIIlIllIlIIIIIllllIIlllI};
    private int IlIIIIIllllllIIlllIllllll = 0;
    private int lIllllIIlIIIlIllllllIIIll = 0;
    private long IIIllIIlIIIIIIlIlIIllIIlI = 0L;

    public class_0839(class_0229 class_02292, GameSettings class_17512) {
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
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1197(210, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 100, this.lIIlIIIIIlIlllIlIIlIlIlll / 6 + 168 + 11 - 44, "Reset Video Settings..."));
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1197(200, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 100, this.lIIlIIIIIlIlllIlIIlIlIlll / 6 + 168 + 11, class_0616.lllIIIllIIIIlllIlIIllIIll("gui.done", new Object[0])));
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1197 class_11972) {
        if (class_11972.IllIIIllIIIIlIlIlIllIIlll) {
            Object object;
            if (class_11972.IIIllIllIIlIlIlIlIllllIIl < 200 && class_11972 instanceof class_1249) {
                this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(((class_1249)class_11972).lllIIIllIIIIlllIlIIllIIll(), 1);
                class_11972.IllIIlllllllIIlIIlIIIIlIl = this.IlIllllllIIlIIllllIIlIIIl.IlIllllllIIlIIllllIIlIIIl(Options.getEnumOptions(class_11972.IIIllIllIIlIlIlIlIllllIIl));
            }
            if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 200) {
                this.lllllIlllIIllIlIIlIIIllII.gameSettings.IlIllllllIIlIIllllIIlIIIl();
                this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl);
            }
            if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 210) {
                this.lllllIlllIIllIlIIlIIIllII.gameSettings.IlIllllllIIlIIllllIIlIIIl();
                object = new class_0923(this, "Reset all video settings to their default values?", "", 9999);
                this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll((class_0229)object);
            }
            if (class_11972.IIIllIllIIlIlIlIlIllllIIl != Options.lIIIllIIIIIllllIlIlIllIll.ordinal()) {
                object = new class_0321(this.lllllIlllIIllIlIIlIIIllII, this.lllllIlllIIllIlIIlIIIllII.displayWidth, this.lllllIlllIIllIlIIlIIIllII.displayHeight);
                int n = ((class_0321)object).lllIIIllIIIIlllIlIIllIIll();
                int n2 = ((class_0321)object).lllIlIIlIIIlIlIIIllIlllIl();
                this.lllIIIllIIIIlllIlIIllIIll(this.lllllIlllIIllIlIIlIIIllII, n, n2);
            }
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(boolean bl, int n) {
        if (bl) {
            this.lllllIlllIIllIlIIlIIIllII.gameSettings.IllIIlllllllIIlIIlIIIIlIl();
        }
        this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(this);
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
        if (string.equals("Autosave")) {
            String[] arrstring2 = new String[3];
            arrstring2[0] = "Autosave interval";
            arrstring2[1] = "Default autosave interval (2s) is NOT RECOMMENDED.";
            arrstring = arrstring2;
            arrstring2[2] = "Autosave causes the famous Lag Spike of Death.";
        } else if (string.equals("Lagometer")) {
            String[] arrstring3 = new String[8];
            arrstring3[0] = "Lagometer";
            arrstring3[1] = " OFF - no lagometer, faster";
            arrstring3[2] = " ON - debug screen with lagometer, slower";
            arrstring3[3] = "Shows the lagometer on the debug screen (F3).";
            arrstring3[4] = "* White - tick";
            arrstring3[5] = "* Red - chunk loading";
            arrstring3[6] = "* Green - frame rendering + internal server";
            arrstring = arrstring3;
            arrstring3[7] = "* Blue - internal server (when Smooth World is ON)";
        } else if (string.equals("Debug Profiler")) {
            String[] arrstring4 = new String[5];
            arrstring4[0] = "Debug Profiler";
            arrstring4[1] = "  ON - debug profiler is active, slower";
            arrstring4[2] = "  OFF - debug profiler is not active, faster";
            arrstring4[3] = "The debug profiler collects and shows debug information";
            arrstring = arrstring4;
            arrstring4[4] = "when the debug screen is open (F3)";
        } else if (string.equals("Time")) {
            String[] arrstring5 = new String[6];
            arrstring5[0] = "Time";
            arrstring5[1] = " Default - normal day/night cycles";
            arrstring5[2] = " Day Only - day only";
            arrstring5[3] = " Night Only - night only";
            arrstring5[4] = "The time setting is only effective in CREATIVE mode";
            arrstring = arrstring5;
            arrstring5[5] = "and for local worlds.";
        } else if (string.equals("Weather")) {
            String[] arrstring6 = new String[5];
            arrstring6[0] = "Weather";
            arrstring6[1] = "  ON - weather is active, slower";
            arrstring6[2] = "  OFF - weather is not active, faster";
            arrstring6[3] = "The weather controls rain, snow and thunderstorms.";
            arrstring = arrstring6;
            arrstring6[4] = "Weather control is only possible for local worlds.";
        } else if (string.equals("Fullscreen")) {
            String[] arrstring7 = new String[5];
            arrstring7[0] = "Fullscreen";
            arrstring7[1] = "  ON - use fullscreen mode";
            arrstring7[2] = "  OFF - use window mode";
            arrstring7[3] = "Fullscreen mode may be faster or slower than";
            arrstring = arrstring7;
            arrstring7[4] = "window mode, depending on the graphics card.";
        } else if (string.equals("Fullscreen Mode")) {
            String[] arrstring8 = new String[5];
            arrstring8[0] = "Fullscreen mode";
            arrstring8[1] = "  Default - use desktop screen resolution, slower";
            arrstring8[2] = "  WxH - use custom screen resolution, may be faster";
            arrstring8[3] = "The selected resolution is used in fullscreen mode (F11).";
            arrstring = arrstring8;
            arrstring8[4] = "Lower resolutions should generally be faster.";
        } else if (string.equals("3D Anaglyph")) {
            String[] arrstring9 = new String[1];
            arrstring = arrstring9;
            arrstring9[0] = "3D mode used with red-cyan 3D glasses.";
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

