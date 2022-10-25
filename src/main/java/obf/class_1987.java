package obf;

import optifine.Config;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.client.settings.Options;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1987
extends class_0229 {
    private class_0229 lllIlIIlIIIlIlIIIllIlllIl;
    protected String lllIIIllIIIIlllIlIIllIIll = "Video Settings";
    private GameSettings IlIllllllIIlIIllllIIlIIIl;
    private boolean lIlllIlllIIIIlIIlllIllIII;
    private static Options[] IlIIIIIllllllIIlllIllllll = new Options[]{Options.llIIllIllIlIIlIIllIllllll, Options.RENDER_DISTANCE, Options.lllIIlIIIllllllIIIIlIlIlI, Options.IllIIIllIIIIlIlIlIllIIlll, Options.IlllIIIllllIIllIllIlIIlIl, Options.VIEW_BOBBING, Options.IlIlllIIIIIIlIIllIIllIlll, Options.ADVANCED_OPENGL, Options.GAMMA, Options.lIIllllIllIlllllIIllIllIl, Options.IllllIIIIlIIlIIIIlllIIIIl, Options.llllIlIIIIIIIIIlllIIlIIIl, Options.ANAGLYPH};
    private int lIllllIIlIIIlIllllllIIIll = 0;
    private int IIIllIIlIIIIIIlIlIIllIIlI = 0;
    private long IllIIlllllllIIlIIlIIIIlIl = 0L;

    public class_1987(class_0229 class_02292, GameSettings class_17512) {
        this.lllIlIIlIIIlIlIIIllIlllIl = class_02292;
        this.IlIllllllIIlIIllllIIlIIIl = class_17512;
    }

    @Override
    public void n_() {
        int n;
        int n2;
        int n3;
        Options[] arrclass_0728;
        int n4;
        String[] arrstring;
        this.lllIIIllIIIIlllIlIIllIIll = class_0616.lllIIIllIIIIlllIlIIllIIll("options.videoTitle", new Object[0]);
        this.lIlIlIIlIIIIlIIIIIlllIIII.clear();
        this.lIlllIlllIIIIlIIlllIllIII = false;
        String[] arrstring2 = arrstring = new String[]{"sun.arch.data.model", "com.ibm.vm.bitmode", "os.arch"};
        int n5 = arrstring.length;
        for (n4 = 0; n4 < n5; ++n4) {
            String string = arrstring2[n4];
            arrclass_0728 = System.getProperty(string);
            if (arrclass_0728 == null || !arrclass_0728.contains("64")) continue;
            this.lIlllIlllIIIIlIIlllIllIII = true;
            break;
        }
        n4 = 0;
        boolean bl = !this.lIlllIlllIIIIlIIlllIllIII;
        arrclass_0728 = IlIIIIIllllllIIlllIllllll;
        int n6 = arrclass_0728.length;
        boolean bl2 = false;
        for (n3 = 0; n3 < n6; ++n3) {
            Options class_07282 = arrclass_0728[n3];
            if (class_07282 == null) continue;
            n2 = this.IlIlIIlllIIlIllIIIlllllIl / 2 - 155 + n3 % 2 * 160;
            n = this.lIIlIIIIIlIlllIlIIlIlIlll / 6 + 21 * (n3 / 2) - 10;
            if (class_07282.getEnumFloat()) {
                this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1474(class_07282.returnEnumOrdinal(), n2, n, class_07282));
                continue;
            }
            this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1249(class_07282.returnEnumOrdinal(), n2, n, class_07282, this.IlIllllllIIlIIllllIIlIIIl.IlIllllllIIlIIllllIIlIIIl(class_07282)));
        }
        int n7 = this.lIIlIIIIIlIlllIlIIlIlIlll / 6 + 21 * (n3 / 2) - 10;
        n = 0;
        n2 = this.IlIlIIlllIIlIllIIIlllllIl / 2 - 155 + 160;
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1249(202, n2, n7, "Quality..."));
        n2 = this.IlIlIIlllIIlIllIIIlllllIl / 2 - 155 + 0;
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1249(201, n2, n7 += 21, "Details..."));
        n2 = this.IlIlIIlllIIlIllIIIlllllIl / 2 - 155 + 160;
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1249(212, n2, n7, "Performance..."));
        n2 = this.IlIlIIlllIIlIllIIIlllllIl / 2 - 155 + 0;
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1249(211, n2, n7 += 21, "Animations..."));
        n2 = this.IlIlIIlllIIlIllIIIlllllIl / 2 - 155 + 160;
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1249(222, n2, n7, "Other..."));
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1197(200, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 100, this.lIIlIIIIIlIlllIlIIlIlIlll / 6 + 168 + 11, class_0616.lllIIIllIIIIlllIlIIllIIll("gui.done", new Object[0])));
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1197 class_11972) {
        if (class_11972.IllIIIllIIIIlIlIlIllIIlll) {
            Object object;
            if (class_11972.IIIllIllIIlIlIlIlIllllIIl == Options.lIIllllIllIlllllIIllIllIl.ordinal()) {
                return;
            }
            int n = this.IlIllllllIIlIIllllIIlIIIl.IllIIIIIllIIlllIlIIIlIlll;
            if (class_11972.IIIllIllIIlIlIlIlIllllIIl < 200 && class_11972 instanceof class_1249) {
                this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(((class_1249)class_11972).lllIIIllIIIIlllIlIIllIIll(), 1);
                class_11972.IllIIlllllllIIlIIlIIIIlIl = this.IlIllllllIIlIIllllIIlIIIl.IlIllllllIIlIIllllIIlIIIl(Options.getEnumOptions(class_11972.IIIllIllIIlIlIlIlIllllIIl));
            }
            if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 200) {
                this.lllllIlllIIllIlIIlIIIllII.gameSettings.IlIllllllIIlIIllllIIlIIIl();
                this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl);
            }
            if (this.IlIllllllIIlIIllllIIlIIIl.IllIIIIIllIIlllIlIIIlIlll != n) {
                object = new class_0321(this.lllllIlllIIllIlIIlIIIllII, this.lllllIlllIIllIlIIlIIIllII.displayWidth, this.lllllIlllIIllIlIIlIIIllII.displayHeight);
                int n2 = ((class_0321)object).lllIIIllIIIIlllIlIIllIIll();
                int n3 = ((class_0321)object).lllIlIIlIIIlIlIIIllIlllIl();
                this.lllIIIllIIIIlllIlIIllIIll(this.lllllIlllIIllIlIIlIIIllII, n2, n3);
            }
            if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 201) {
                this.lllllIlllIIllIlIIlIIIllII.gameSettings.IlIllllllIIlIIllllIIlIIIl();
                object = new class_0430(this, this.IlIllllllIIlIIllllIIlIIIl);
                this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll((class_0229)object);
            }
            if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 202) {
                this.lllllIlllIIllIlIIlIIIllII.gameSettings.IlIllllllIIlIIllllIIlIIIl();
                object = new class_1884(this, this.IlIllllllIIlIIllllIIlIIIl);
                this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll((class_0229)object);
            }
            if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 211) {
                this.lllllIlllIIllIlIIlIIIllII.gameSettings.IlIllllllIIlIIllllIIlIIIl();
                object = new class_0504(this, this.IlIllllllIIlIIllllIIlIIIl);
                this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll((class_0229)object);
            }
            if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 212) {
                this.lllllIlllIIllIlIIlIIIllII.gameSettings.IlIllllllIIlIIllllIIlIIIl();
                object = new class_0398(this, this.IlIllllllIIlIIllllIIlIIIl);
                this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll((class_0229)object);
            }
            if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 222) {
                this.lllllIlllIIllIlIIlIIIllII.gameSettings.IlIllllllIIlIIllllIIlIIIl();
                object = new class_0839(this, this.IlIllllllIIlIIllllIIlIIIl);
                this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll((class_0229)object);
            }
            if (class_11972.IIIllIllIIlIlIlIlIllllIIl == Options.IlllIIIllllIIllIllIlIIlIl.ordinal()) {
                return;
            }
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
        this.llIIlIllIllllIlIIIIlIIlll();
        this.lllIIIllIIIIlllIlIIllIIll(this.lIlIllIIlIIlIIlIIlIIlIIll, this.lllIIIllIIIIlllIlIIllIIll, this.IlIlIIlllIIlIllIIIlllllIl / 2, this.lIlllIlllIIIIlIIlllIllIII ? 20 : 5, 0xFFFFFF);
        String string = Config.lllIIIllIIIIlllIlIIllIIll();
        String string2 = "HD_U";
        if (string2.equals("HD")) {
            string = "OptiFine HD D6";
        }
        if (string2.equals("HD_U")) {
            string = "OptiFine HD D6 Ultra";
        }
        if (string2.equals("L")) {
            string = "OptiFine D6 Light";
        }
        this.lllIlIIlIIIlIlIIIllIlllIl(this.lIlIllIIlIIlIIlIIlIIlIIll, string, 2, this.lIIlIIIIIlIlllIlIIlIlIlll - 10, 0x808080);
        String string3 = "Minecraft 1.7.10";
        int n3 = this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(string3);
        this.lllIlIIlIIIlIlIIIllIlllIl(this.lIlIllIIlIIlIIlIIlIIlIIll, string3, this.IlIlIIlllIIlIllIIIlllllIl - n3 - 2, this.lIIlIIIIIlIlllIlIIlIlIlll - 10, 0x808080);
        if (this.lIlllIlllIIIIlIIlllIllIII || this.IlIllllllIIlIIllllIIlIIIl.IlIllllllIIlIIllllIIlIIIl > 8) {
            // empty if block
        }
        super.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
        if (Math.abs(n - this.lIllllIIlIIIlIllllllIIIll) <= 5 && Math.abs(n2 - this.IIIllIIlIIIIIIlIlIIllIIlI) <= 5) {
            int n4 = 700;
            if (System.currentTimeMillis() >= this.IllIIlllllllIIlIIlIIIIlIl + (long)n4) {
                int n5 = this.IlIlIIlllIIlIllIIIlllllIl / 2 - 150;
                int n6 = this.lIIlIIIIIlIlllIlIIlIlIlll / 6 - 5;
                if (n2 <= n6 + 98) {
                    n6 += 105;
                }
                int n7 = n5 + 150 + 150;
                int n8 = n6 + 84 + 10;
                class_1197 class_11972 = this.lllIIIllIIIIlllIlIIllIIll(n, n2);
                if (class_11972 != null) {
                    String string4 = this.lllIlIIlIIIlIlIIIllIlllIl(class_11972.IllIIlllllllIIlIIlIIIIlIl);
                    String[] arrstring = this.lllIIIllIIIIlllIlIIllIIll(string4);
                    if (arrstring == null) {
                        return;
                    }
                    class_0210.lllIIIllIIIIlllIlIIllIIll(n5, n6, n7, n8, -536870912);
                    for (int i = 0; i < arrstring.length; ++i) {
                        String string5 = arrstring[i];
                        this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(string5, (float)(n5 + 5), (float)(n6 + 5 + i * 11), 0xDDDDDD);
                    }
                }
            }
        } else {
            this.lIllllIIlIIIlIllllllIIIll = n;
            this.IIIllIIlIIIIIIlIlIIllIIlI = n2;
            this.IllIIlllllllIIlIIlIIIIlIl = System.currentTimeMillis();
        }
    }

    private String[] lllIIIllIIIIlllIlIIllIIll(String string) {
        String[] arrstring;
        if (string.equals("Graphics")) {
            String[] arrstring2 = new String[5];
            arrstring2[0] = "Visual quality";
            arrstring2[1] = "  Fast  - lower quality, faster";
            arrstring2[2] = "  Fancy - higher quality, slower";
            arrstring2[3] = "Changes the appearance of clouds, leaves, water,";
            arrstring = arrstring2;
            arrstring2[4] = "shadows and grass sides.";
        } else if (string.equals("Render Distance")) {
            String[] arrstring3 = new String[8];
            arrstring3[0] = "Visible distance";
            arrstring3[1] = "  2 Tiny - 32m (fastest)";
            arrstring3[2] = "  4 Short - 64m (faster)";
            arrstring3[3] = "  8 Normal - 128m";
            arrstring3[4] = "  16 Far - 256m (slower)";
            arrstring3[5] = "  32 Extreme - 512m (slowest!)";
            arrstring3[6] = "The Extreme view distance is very resource demanding!";
            arrstring = arrstring3;
            arrstring3[7] = "Values over 16 Far are only effective in local worlds.";
        } else if (string.equals("Smooth Lighting")) {
            String[] arrstring4 = new String[4];
            arrstring4[0] = "Smooth lighting";
            arrstring4[1] = "  OFF - no smooth lighting (faster)";
            arrstring4[2] = "  Minimum - simple smooth lighting (slower)";
            arrstring = arrstring4;
            arrstring4[3] = "  Maximum - complex smooth lighting (slowest)";
        } else if (string.equals("Smooth Lighting Level")) {
            String[] arrstring5 = new String[4];
            arrstring5[0] = "Smooth lighting level";
            arrstring5[1] = "  OFF - no smooth lighting (faster)";
            arrstring5[2] = "  1% - light smooth lighting (slower)";
            arrstring = arrstring5;
            arrstring5[3] = "  100% - dark smooth lighting (slower)";
        } else if (string.equals("Max Framerate")) {
            String[] arrstring6 = new String[6];
            arrstring6[0] = "Max framerate";
            arrstring6[1] = "  VSync - limit to monitor framerate (60, 30, 20)";
            arrstring6[2] = "  5-255 - variable";
            arrstring6[3] = "  Unlimited - no limit (fastest)";
            arrstring6[4] = "The framerate limit decreases the FPS even if";
            arrstring = arrstring6;
            arrstring6[5] = "the limit value is not reached.";
        } else if (string.equals("View Bobbing")) {
            String[] arrstring7 = new String[2];
            arrstring7[0] = "More realistic movement.";
            arrstring = arrstring7;
            arrstring7[1] = "When using mipmaps set it to OFF for best results.";
        } else if (string.equals("GUI Scale")) {
            String[] arrstring8 = new String[2];
            arrstring8[0] = "GUI Scale";
            arrstring = arrstring8;
            arrstring8[1] = "Smaller GUI might be faster";
        } else if (string.equals("Server Textures")) {
            String[] arrstring9 = new String[2];
            arrstring9[0] = "Server textures";
            arrstring = arrstring9;
            arrstring9[1] = "Use the resource pack recommended by the server";
        } else if (string.equals("Advanced OpenGL")) {
            String[] arrstring10 = new String[6];
            arrstring10[0] = "Detect and render only visible geometry";
            arrstring10[1] = "  OFF - all geometry is rendered (slower)";
            arrstring10[2] = "  Fast - only visible geometry is rendered (fastest)";
            arrstring10[3] = "  Fancy - conservative, avoids visual artifacts (faster)";
            arrstring10[4] = "The option is available only if it is supported by the ";
            arrstring = arrstring10;
            arrstring10[5] = "graphic card.";
        } else if (string.equals("Fog")) {
            String[] arrstring11 = new String[6];
            arrstring11[0] = "Fog type";
            arrstring11[1] = "  Fast - faster fog";
            arrstring11[2] = "  Fancy - slower fog, looks better";
            arrstring11[3] = "  OFF - no fog, fastest";
            arrstring11[4] = "The fancy fog is available only if it is supported by the ";
            arrstring = arrstring11;
            arrstring11[5] = "graphic card.";
        } else if (string.equals("Fog Start")) {
            String[] arrstring12 = new String[4];
            arrstring12[0] = "Fog start";
            arrstring12[1] = "  0.2 - the fog starts near the player";
            arrstring12[2] = "  0.8 - the fog starts far from the player";
            arrstring = arrstring12;
            arrstring12[3] = "This option usually does not affect the performance.";
        } else if (string.equals("Brightness")) {
            String[] arrstring13 = new String[5];
            arrstring13[0] = "Increases the brightness of darker objects";
            arrstring13[1] = "  OFF - standard brightness";
            arrstring13[2] = "  100% - maximum brightness for darker objects";
            arrstring13[3] = "This options does not change the brightness of ";
            arrstring = arrstring13;
            arrstring13[4] = "fully black objects";
        } else if (string.equals("Chunk Loading")) {
            String[] arrstring14 = new String[8];
            arrstring14[0] = "Chunk Loading";
            arrstring14[1] = "  Default - unstable FPS when loading chunks";
            arrstring14[2] = "  Smooth - stable FPS";
            arrstring14[3] = "  Multi-Core - stable FPS, 3x faster world loading";
            arrstring14[4] = "Smooth and Multi-Core remove the stuttering and ";
            arrstring14[5] = "freezes caused by chunk loading.";
            arrstring14[6] = "Multi-Core can speed up 3x the world loading and";
            arrstring = arrstring14;
            arrstring14[7] = "increase FPS by using a second CPU core.";
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
            boolean bl2 = bl = n >= class_11972.lIllllIIlIIIlIllllllIIIll && n2 >= class_11972.IIIllIIlIIIIIIlIlIIllIIlI && n < class_11972.lIllllIIlIIIlIllllllIIIll + class_11972.lIlllIlllIIIIlIIlllIllIII && n2 < class_11972.IIIllIIlIIIIIIlIlIIllIIlI + class_11972.IlIIIIIllllllIIlllIllllll;
            if (!bl) continue;
            return class_11972;
        }
        return null;
    }

    public static int lllIlIIlIIIlIlIIIllIlllIl(class_1197 class_11972) {
        return class_11972.lIlllIlllIIIIlIIlllIllIII;
    }

    public static int IlIllllllIIlIIllllIIlIIIl(class_1197 class_11972) {
        return class_11972.IlIIIIIllllllIIlllIllllll;
    }
}

