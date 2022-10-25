package obf;

import net.minecraft.client.settings.GameSettings;
import net.minecraft.client.settings.Options;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0398
extends class_0229 {
    private class_0229 lllIlIIlIIIlIlIIIllIlllIl;
    protected String lllIIIllIIIIlllIlIIllIIll = "Performance Settings";
    private GameSettings IlIllllllIIlIIllllIIlIIIl;
    private static Options[] lIlllIlllIIIIlIIlllIllIII = new Options[]{Options.IllIIIlllllIlIlllIlllllII, Options.lIIllllllllIlIllllllllIlI, Options.lllIIIIlIlIIlIIlllIIIIIIl, Options.llIlIIlllIIIIIllIIlIlIIII, Options.lIIlIlIIllIIIlIIlIlIIIlII, Options.lIIIlIIllIllIIlIIlIIIllII, Options.IIIlIllIlllIlIIIlIlIIllII, Options.IllIlIlIIIlIllIlIlIIlllII, Options.lIIlIlllIIlIIIIlIlIIIIlll};
    private int IlIIIIIllllllIIlllIllllll = 0;
    private int lIllllIIlIIIlIllllllIIIll = 0;
    private long IIIllIIlIIIIIIlIlIIllIIlI = 0L;

    public class_0398(class_0229 class_02292, GameSettings class_17512) {
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
        if (string.equals("Smooth FPS")) {
            String[] arrstring2 = new String[5];
            arrstring2[0] = "Stabilizes FPS by flushing the graphic driver buffers";
            arrstring2[1] = "  OFF - no stabilization, FPS may fluctuate";
            arrstring2[2] = "  ON - FPS stabilization";
            arrstring2[3] = "This option is graphics driver dependant and its effect";
            arrstring = arrstring2;
            arrstring2[4] = "is not always visible";
        } else if (string.equals("Smooth World")) {
            String[] arrstring3 = new String[5];
            arrstring3[0] = "Removes lag spikes caused by the internal server.";
            arrstring3[1] = "  OFF - no stabilization, FPS may fluctuate";
            arrstring3[2] = "  ON - FPS stabilization";
            arrstring3[3] = "Stabilizes FPS by distributing the internal server load.";
            arrstring = arrstring3;
            arrstring3[4] = "Effective only for local worlds and single-core CPU.";
        } else if (string.equals("Load Far")) {
            String[] arrstring4 = new String[6];
            arrstring4[0] = "Loads the world chunks at distance Far.";
            arrstring4[1] = "Switching the render distance does not cause all chunks ";
            arrstring4[2] = "to be loaded again.";
            arrstring4[3] = "  OFF - world chunks loaded up to render distance";
            arrstring4[4] = "  ON - world chunks loaded at distance Far, allows";
            arrstring = arrstring4;
            arrstring4[5] = "       fast render distance switching";
        } else if (string.equals("Preloaded Chunks")) {
            String[] arrstring5 = new String[6];
            arrstring5[0] = "Defines an area in which no chunks will be loaded";
            arrstring5[1] = "  OFF - after 5m new chunks will be loaded";
            arrstring5[2] = "  2 - after 32m  new chunks will be loaded";
            arrstring5[3] = "  8 - after 128m new chunks will be loaded";
            arrstring5[4] = "Higher values need more time to load all the chunks";
            arrstring = arrstring5;
            arrstring5[5] = "and may decrease the FPS.";
        } else if (string.equals("Chunk Updates")) {
            String[] arrstring6 = new String[6];
            arrstring6[0] = "Chunk updates";
            arrstring6[1] = " 1 - (default) slower world loading, higher FPS";
            arrstring6[2] = " 3 - faster world loading, lower FPS";
            arrstring6[3] = " 5 - fastest world loading, lowest FPS";
            arrstring6[4] = "Number of chunk updates per rendered frame,";
            arrstring = arrstring6;
            arrstring6[5] = "higher values may destabilize the framerate.";
        } else if (string.equals("Dynamic Updates")) {
            String[] arrstring7 = new String[5];
            arrstring7[0] = "Dynamic chunk updates";
            arrstring7[1] = " OFF - (default) standard chunk updates per frame";
            arrstring7[2] = " ON - more updates while the player is standing still";
            arrstring7[3] = "Dynamic updates force more chunk updates while";
            arrstring = arrstring7;
            arrstring7[4] = "the player is standing still to load the world faster.";
        } else if (string.equals("Lazy Chunk Loading")) {
            String[] arrstring8 = new String[7];
            arrstring8[0] = "Lazy Chunk Loading";
            arrstring8[1] = " OFF - default server chunk loading";
            arrstring8[2] = " ON - lazy server chunk loading (smoother)";
            arrstring8[3] = "Smooths the integrated server chunk loading by";
            arrstring8[4] = "distributing the chunks over several ticks.";
            arrstring8[5] = "Turn it OFF if parts of the world do not load correctly.";
            arrstring = arrstring8;
            arrstring8[6] = "Effective only for local worlds and single-core CPU.";
        } else if (string.equals("Fast Math")) {
            String[] arrstring9 = new String[5];
            arrstring9[0] = "Fast Math";
            arrstring9[1] = " OFF - standard math (default)";
            arrstring9[2] = " ON - faster math";
            arrstring9[3] = "Uses optimized sin() and cos() functions which can";
            arrstring = arrstring9;
            arrstring9[4] = "better utilize the CPU cache and increase the FPS.";
        } else if (string.equals("Fast Render")) {
            String[] arrstring10 = new String[6];
            arrstring10[0] = "Fast Render";
            arrstring10[1] = " OFF - standard rendering (default)";
            arrstring10[2] = " ON - faster rendering";
            arrstring10[3] = "Uses optimized rendering algorithm which decreases";
            arrstring10[4] = "the GPU load and may substantionally increase the FPS.";
            arrstring = arrstring10;
            arrstring10[5] = "Not compatible with shaders and some other mods!";
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

