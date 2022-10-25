package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
import java.util.Random;

import net.minecraft.util.MathHelper;
import org.lwjgl.input.Keyboard;

public class class_0697
extends class_0229 {
    private class_0229 lllIlIIlIIIlIlIIIllIlllIl;
    private class_0598 IlIllllllIIlIIllllIIlIIIl;
    private class_0598 lIlllIlllIIIIlIIlllIllIII;
    private String IlIIIIIllllllIIlllIllllll;
    private String lIllllIIlIIIlIllllllIIIll = "survival";
    private boolean IIIllIIlIIIIIIlIlIIllIIlI = true;
    private boolean IllIIlllllllIIlIIlIIIIlIl;
    private boolean IIIllIllIIlIlIlIlIllllIIl;
    private boolean IllIIIllIIIIlIlIlIllIIlll;
    private boolean lIIIIlIlIIlllllIIllIIlIII;
    private boolean lIlllIlllIlIIIIlllIlIlIIl;
    private boolean IlIIlllllIIlIlIlllllIllll;
    private class_1197 llIIlIlIlllIIllIlIlllIllI;
    private class_1197 IllIIIIllIIllIllIlllIlIIl;
    private class_1197 IIIIIIIIlIllIIllIIlllIllI;
    private class_1197 IIlIIlIlIlIllIIlIlIIIIlll;
    private class_1197 llIIIlllIlllIlIllIIIIllIl;
    private class_1197 IIIIlIllIlIIlIIlIllIlIlll;
    private class_1197 IlIlIIlllIllllllllIIIlIlI;
    private String llllIIIIlIIIlIIIIIIlIllll;
    private String llIIIIllIIIIIIIlIIIlIIIIl;
    private String IIllIllIIllIIlllIIIlIlllI;
    private String llllllIlIllllIlIlIlIIIIlI;
    private int lIlIIllllIlIIIIllIIIIlIIl;
    public String lllIIIllIIIIlllIlIIllIIll = "";
    private static final String[] llIlllIIllIlllIlIlIlIIIll = new String[]{"CON", "COM", "PRN", "AUX", "CLOCK$", "NUL", "COM1", "COM2", "COM3", "COM4", "COM5", "COM6", "COM7", "COM8", "COM9", "LPT1", "LPT2", "LPT3", "LPT4", "LPT5", "LPT6", "LPT7", "LPT8", "LPT9"};

    public class_0697(class_0229 class_02292) {
        this.lllIlIIlIIIlIlIIIllIlllIl = class_02292;
        this.IIllIllIIllIIlllIIIlIlllI = "";
        this.llllllIlIllllIlIlIlIIIIlI = class_0616.lllIIIllIIIIlllIlIIllIIll("selectWorld.newWorld", new Object[0]);
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
        this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll();
        this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll();
    }

    @Override
    public void n_() {
        Keyboard.enableRepeatEvents((boolean)true);
        this.lIlIlIIlIIIIlIIIIIlllIIII.clear();
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1197(0, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 155, this.lIIlIIIIIlIlllIlIIlIlIlll - 28, 150, 20, class_0616.lllIIIllIIIIlllIlIIllIIll("selectWorld.create", new Object[0])));
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1197(1, this.IlIlIIlllIIlIllIIIlllllIl / 2 + 5, this.lIIlIIIIIlIlllIlIIlIlIlll - 28, 150, 20, class_0616.lllIIIllIIIIlllIlIIllIIll("gui.cancel", new Object[0])));
        this.llIIlIlIlllIIllIlIlllIllI = new class_1197(2, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 75, 115, 150, 20, class_0616.lllIIIllIIIIlllIlIIllIIll("selectWorld.gameMode", new Object[0]));
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(this.llIIlIlIlllIIllIlIlllIllI);
        this.IllIIIIllIIllIllIlllIlIIl = new class_1197(3, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 75, 187, 150, 20, class_0616.lllIIIllIIIIlllIlIIllIIll("selectWorld.moreWorldOptions", new Object[0]));
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(this.IllIIIIllIIllIllIlllIlIIl);
        this.IIIIIIIIlIllIIllIIlllIllI = new class_1197(4, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 155, 100, 150, 20, class_0616.lllIIIllIIIIlllIlIIllIIll("selectWorld.mapFeatures", new Object[0]));
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(this.IIIIIIIIlIllIIllIIlllIllI);
        this.IIIIIIIIlIllIIllIIlllIllI.lIIIIlIlIIlllllIIllIIlIII = false;
        this.IIlIIlIlIlIllIIlIlIIIIlll = new class_1197(7, this.IlIlIIlllIIlIllIIIlllllIl / 2 + 5, 151, 150, 20, class_0616.lllIIIllIIIIlllIlIIllIIll("selectWorld.bonusItems", new Object[0]));
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(this.IIlIIlIlIlIllIIlIlIIIIlll);
        this.IIlIIlIlIlIllIIlIlIIIIlll.lIIIIlIlIIlllllIIllIIlIII = false;
        this.llIIIlllIlllIlIllIIIIllIl = new class_1197(5, this.IlIlIIlllIIlIllIIIlllllIl / 2 + 5, 100, 150, 20, class_0616.lllIIIllIIIIlllIlIIllIIll("selectWorld.mapType", new Object[0]));
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(this.llIIIlllIlllIlIllIIIIllIl);
        this.llIIIlllIlllIlIllIIIIllIl.lIIIIlIlIIlllllIIllIIlIII = false;
        this.IIIIlIllIlIIlIIlIllIlIlll = new class_1197(6, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 155, 151, 150, 20, class_0616.lllIIIllIIIIlllIlIIllIIll("selectWorld.allowCommands", new Object[0]));
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(this.IIIIlIllIlIIlIIlIllIlIlll);
        this.IIIIlIllIlIIlIIlIllIlIlll.lIIIIlIlIIlllllIIllIIlIII = false;
        this.IlIlIIlllIllllllllIIIlIlI = new class_1197(8, this.IlIlIIlllIIlIllIIIlllllIl / 2 + 5, 120, 150, 20, class_0616.lllIIIllIIIIlllIlIIllIIll("selectWorld.customizeType", new Object[0]));
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(this.IlIlIIlllIllllllllIIIlIlI);
        this.IlIlIIlllIllllllllIIIlIlI.lIIIIlIlIIlllllIIllIIlIII = false;
        this.IlIllllllIIlIIllllIIlIIIl = new class_0598(this.lIlIllIIlIIlIIlIIlIIlIIll, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 100, 60, 200, 20);
        this.IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl(true);
        this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI);
        this.lIlllIlllIIIIlIIlllIllIII = new class_0598(this.lIlIllIIlIIlIIlIIlIIlIIll, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 100, 60, 200, 20);
        this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(this.IIllIllIIllIIlllIIIlIlllI);
        this.lllIIIllIIIIlllIlIIllIIll(this.IlIIlllllIIlIlIlllllIllll);
        this.lIllllIIlIIIlIllllllIIIll();
        this.IIIllIIlIIIIIIlIlIIllIIlI();
    }

    private void lIllllIIlIIIlIllllllIIIll() {
        this.IlIIIIIllllllIIlllIllllll = this.IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl().trim();
        for (char c : class_1395.lllIIIllIIIIlllIlIIllIIll) {
            this.IlIIIIIllllllIIlllIllllll = this.IlIIIIIllllllIIlllIllllll.replace(c, '_');
        }
        if (MathHelper.lllIIIllIIIIlllIlIIllIIll(this.IlIIIIIllllllIIlllIllllll)) {
            this.IlIIIIIllllllIIlllIllllll = "World";
        }
        this.IlIIIIIllllllIIlllIllllll = class_0697.lllIIIllIIIIlllIlIIllIIll(this.lllllIlllIIllIlIIlIIIllII.lIllllIIlIIIlIllllllIIIll(), this.IlIIIIIllllllIIlllIllllll);
    }

    private void IIIllIIlIIIIIIlIlIIllIIlI() {
        this.llIIlIlIlllIIllIlIlllIllI.IllIIlllllllIIlIIlIIIIlIl = class_0616.lllIIIllIIIIlllIlIIllIIll("selectWorld.gameMode", new Object[0]) + " " + class_0616.lllIIIllIIIIlllIlIIllIIll("selectWorld.gameMode." + this.lIllllIIlIIIlIllllllIIIll, new Object[0]);
        this.llllIIIIlIIIlIIIIIIlIllll = class_0616.lllIIIllIIIIlllIlIIllIIll("selectWorld.gameMode." + this.lIllllIIlIIIlIllllllIIIll + ".line1", new Object[0]);
        this.llIIIIllIIIIIIIlIIIlIIIIl = class_0616.lllIIIllIIIIlllIlIIllIIll("selectWorld.gameMode." + this.lIllllIIlIIIlIllllllIIIll + ".line2", new Object[0]);
        this.IIIIIIIIlIllIIllIIlllIllI.IllIIlllllllIIlIIlIIIIlIl = class_0616.lllIIIllIIIIlllIlIIllIIll("selectWorld.mapFeatures", new Object[0]) + " ";
        this.IIIIIIIIlIllIIllIIlllIllI.IllIIlllllllIIlIIlIIIIlIl = this.IIIllIIlIIIIIIlIlIIllIIlI ? this.IIIIIIIIlIllIIllIIlllIllI.IllIIlllllllIIlIIlIIIIlIl + class_0616.lllIIIllIIIIlllIlIIllIIll("options.on", new Object[0]) : this.IIIIIIIIlIllIIllIIlllIllI.IllIIlllllllIIlIIlIIIIlIl + class_0616.lllIIIllIIIIlllIlIIllIIll("options.off", new Object[0]);
        this.IIlIIlIlIlIllIIlIlIIIIlll.IllIIlllllllIIlIIlIIIIlIl = class_0616.lllIIIllIIIIlllIlIIllIIll("selectWorld.bonusItems", new Object[0]) + " ";
        this.IIlIIlIlIlIllIIlIlIIIIlll.IllIIlllllllIIlIIlIIIIlIl = this.IllIIIllIIIIlIlIlIllIIlll && !this.lIIIIlIlIIlllllIIllIIlIII ? this.IIlIIlIlIlIllIIlIlIIIIlll.IllIIlllllllIIlIIlIIIIlIl + class_0616.lllIIIllIIIIlllIlIIllIIll("options.on", new Object[0]) : this.IIlIIlIlIlIllIIlIlIIIIlll.IllIIlllllllIIlIIlIIIIlIl + class_0616.lllIIIllIIIIlllIlIIllIIll("options.off", new Object[0]);
        this.llIIIlllIlllIlIllIIIIllIl.IllIIlllllllIIlIIlIIIIlIl = class_0616.lllIIIllIIIIlllIlIIllIIll("selectWorld.mapType", new Object[0]) + " " + class_0616.lllIIIllIIIIlllIlIIllIIll(class_1074.lllIIIllIIIIlllIlIIllIIll[this.lIlIIllllIlIIIIllIIIIlIIl].lllIlIIlIIIlIlIIIllIlllIl(), new Object[0]);
        this.IIIIlIllIlIIlIIlIllIlIlll.IllIIlllllllIIlIIlIIIIlIl = class_0616.lllIIIllIIIIlllIlIIllIIll("selectWorld.allowCommands", new Object[0]) + " ";
        this.IIIIlIllIlIIlIIlIllIlIlll.IllIIlllllllIIlIIlIIIIlIl = this.IllIIlllllllIIlIIlIIIIlIl && !this.lIIIIlIlIIlllllIIllIIlIII ? this.IIIIlIllIlIIlIIlIllIlIlll.IllIIlllllllIIlIIlIIIIlIl + class_0616.lllIIIllIIIIlllIlIIllIIll("options.on", new Object[0]) : this.IIIIlIllIlIIlIIlIllIlIlll.IllIIlllllllIIlIIlIIIIlIl + class_0616.lllIIIllIIIIlllIlIIllIIll("options.off", new Object[0]);
    }

    public static String lllIIIllIIIIlllIlIIllIIll(class_2055 class_20552, String string) {
        string = string.replaceAll("[\\./\"]", "_");
        for (String string2 : llIlllIIllIlllIlIlIlIIIll) {
            if (!string.equalsIgnoreCase(string2)) continue;
            string = "_" + string + "_";
        }
        while (class_20552.IlIllllllIIlIIllllIIlIIIl(string) != null) {
            string = string + "-";
        }
        return string;
    }

    @Override
    public void o_() {
        super.o_();
        Keyboard.enableRepeatEvents((boolean)false);
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1197 class_11972) {
        if (class_11972.IllIIIllIIIIlIlIlIllIIlll) {
            if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 1) {
                this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl);
            } else if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 0) {
                this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll((class_0229)null);
                if (this.lIlllIlllIlIIIIlllIlIlIIl) {
                    return;
                }
                this.lIlllIlllIlIIIIlllIlIlIIl = true;
                long l = new Random().nextLong();
                String string = this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl();
                if (!MathHelper.lllIIIllIIIIlllIlIIllIIll(string)) {
                    try {
                        long l2 = Long.parseLong(string);
                        if (l2 != 0L) {
                            l = l2;
                        }
                    }
                    catch (NumberFormatException numberFormatException) {
                        l = string.hashCode();
                    }
                }
                class_2243 class_22432 = class_2243.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll);
                class_1078 class_10782 = new class_1078(l, class_22432, this.IIIllIIlIIIIIIlIlIIllIIlI, this.lIIIIlIlIIlllllIIllIIlIII, class_1074.lllIIIllIIIIlllIlIIllIIll[this.lIlIIllllIlIIIIllIIIIlIIl]);
                class_10782.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll);
                if (this.IllIIIllIIIIlIlIlIllIIlll && !this.lIIIIlIlIIlllllIIllIIlIII) {
                    class_10782.lllIIIllIIIIlllIlIIllIIll();
                }
                if (this.IllIIlllllllIIlIIlIIIIlIl && !this.lIIIIlIlIIlllllIIllIIlIII) {
                    class_10782.lllIlIIlIIIlIlIIIllIlllIl();
                }
                this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(this.IlIIIIIllllllIIlllIllllll, this.IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl().trim(), class_10782);
            } else if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 3) {
                this.IllIIlllllllIIlIIlIIIIlIl();
            } else if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 2) {
                if (this.lIllllIIlIIIlIllllllIIIll.equals("survival")) {
                    if (!this.IIIllIllIIlIlIlIlIllllIIl) {
                        this.IllIIlllllllIIlIIlIIIIlIl = false;
                    }
                    this.lIIIIlIlIIlllllIIllIIlIII = false;
                    this.lIllllIIlIIIlIllllllIIIll = "hardcore";
                    this.lIIIIlIlIIlllllIIllIIlIII = true;
                    this.IIIIlIllIlIIlIIlIllIlIlll.IllIIIllIIIIlIlIlIllIIlll = false;
                    this.IIlIIlIlIlIllIIlIlIIIIlll.IllIIIllIIIIlIlIlIllIIlll = false;
                    this.IIIllIIlIIIIIIlIlIIllIIlI();
                } else if (this.lIllllIIlIIIlIllllllIIIll.equals("hardcore")) {
                    if (!this.IIIllIllIIlIlIlIlIllllIIl) {
                        this.IllIIlllllllIIlIIlIIIIlIl = true;
                    }
                    this.lIIIIlIlIIlllllIIllIIlIII = false;
                    this.lIllllIIlIIIlIllllllIIIll = "creative";
                    this.IIIllIIlIIIIIIlIlIIllIIlI();
                    this.lIIIIlIlIIlllllIIllIIlIII = false;
                    this.IIIIlIllIlIIlIIlIllIlIlll.IllIIIllIIIIlIlIlIllIIlll = true;
                    this.IIlIIlIlIlIllIIlIlIIIIlll.IllIIIllIIIIlIlIlIllIIlll = true;
                } else {
                    if (!this.IIIllIllIIlIlIlIlIllllIIl) {
                        this.IllIIlllllllIIlIIlIIIIlIl = false;
                    }
                    this.lIllllIIlIIIlIllllllIIIll = "survival";
                    this.IIIllIIlIIIIIIlIlIIllIIlI();
                    this.IIIIlIllIlIIlIIlIllIlIlll.IllIIIllIIIIlIlIlIllIIlll = true;
                    this.IIlIIlIlIlIllIIlIlIIIIlll.IllIIIllIIIIlIlIlIllIIlll = true;
                    this.lIIIIlIlIIlllllIIllIIlIII = false;
                }
                this.IIIllIIlIIIIIIlIlIIllIIlI();
            } else if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 4) {
                this.IIIllIIlIIIIIIlIlIIllIIlI = !this.IIIllIIlIIIIIIlIlIIllIIlI;
                this.IIIllIIlIIIIIIlIlIIllIIlI();
            } else if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 7) {
                this.IllIIIllIIIIlIlIlIllIIlll = !this.IllIIIllIIIIlIlIlIllIIlll;
                this.IIIllIIlIIIIIIlIlIIllIIlI();
            } else if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 5) {
                ++this.lIlIIllllIlIIIIllIIIIlIIl;
                if (this.lIlIIllllIlIIIIllIIIIlIIl >= class_1074.lllIIIllIIIIlllIlIIllIIll.length) {
                    this.lIlIIllllIlIIIIllIIIIlIIl = 0;
                }
                while (class_1074.lllIIIllIIIIlllIlIIllIIll[this.lIlIIllllIlIIIIllIIIIlIIl] == null || !class_1074.lllIIIllIIIIlllIlIIllIIll[this.lIlIIllllIlIIIIllIIIIlIIl].IlIIIIIllllllIIlllIllllll()) {
                    ++this.lIlIIllllIlIIIIllIIIIlIIl;
                    if (this.lIlIIllllIlIIIIllIIIIlIIl < class_1074.lllIIIllIIIIlllIlIIllIIll.length) continue;
                    this.lIlIIllllIlIIIIllIIIIlIIl = 0;
                }
                this.lllIIIllIIIIlllIlIIllIIll = "";
                this.IIIllIIlIIIIIIlIlIIllIIlI();
                this.lllIIIllIIIIlllIlIIllIIll(this.IlIIlllllIIlIlIlllllIllll);
            } else if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 6) {
                this.IIIllIllIIlIlIlIlIllllIIl = true;
                this.IllIIlllllllIIlIIlIIIIlIl = !this.IllIIlllllllIIlIIlIIIIlIl;
                this.IIIllIIlIIIIIIlIlIIllIIlI();
            } else if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 8) {
                this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(new class_0076(this, this.lllIIIllIIIIlllIlIIllIIll));
            }
        }
    }

    private void IllIIlllllllIIlIIlIIIIlIl() {
        this.lllIIIllIIIIlllIlIIllIIll(!this.IlIIlllllIIlIlIlllllIllll);
    }

    private void lllIIIllIIIIlllIlIIllIIll(boolean bl) {
        this.IlIIlllllIIlIlIlllllIllll = bl;
        this.llIIlIlIlllIIllIlIlllIllI.lIIIIlIlIIlllllIIllIIlIII = !this.IlIIlllllIIlIlIlllllIllll;
        this.IIIIIIIIlIllIIllIIlllIllI.lIIIIlIlIIlllllIIllIIlIII = this.IlIIlllllIIlIlIlllllIllll;
        this.IIlIIlIlIlIllIIlIlIIIIlll.lIIIIlIlIIlllllIIllIIlIII = this.IlIIlllllIIlIlIlllllIllll;
        this.llIIIlllIlllIlIllIIIIllIl.lIIIIlIlIIlllllIIllIIlIII = this.IlIIlllllIIlIlIlllllIllll;
        this.IIIIlIllIlIIlIIlIllIlIlll.lIIIIlIlIIlllllIIllIIlIII = this.IlIIlllllIIlIlIlllllIllll;
        this.IlIlIIlllIllllllllIIIlIlI.lIIIIlIlIIlllllIIllIIlIII = this.IlIIlllllIIlIlIlllllIllll && class_1074.lllIIIllIIIIlllIlIIllIIll[this.lIlIIllllIlIIIIllIIIIlIIl] == class_1074.IlIllllllIIlIIllllIIlIIIl;
        this.IllIIIIllIIllIllIlllIlIIl.IllIIlllllllIIlIIlIIIIlIl = this.IlIIlllllIIlIlIlllllIllll ? class_0616.lllIIIllIIIIlllIlIIllIIll("gui.done", new Object[0]) : class_0616.lllIIIllIIIIlllIlIIllIIll("selectWorld.moreWorldOptions", new Object[0]);
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(char c, int n) {
        if (this.IlIllllllIIlIIllllIIlIIIl.IllIIIllIIIIlIlIlIllIIlll() && !this.IlIIlllllIIlIlIlllllIllll) {
            this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(c, n);
            this.llllllIlIllllIlIlIlIIIIlI = this.IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl();
        } else if (this.lIlllIlllIIIIlIIlllIllIII.IllIIIllIIIIlIlIlIllIIlll() && this.IlIIlllllIIlIlIlllllIllll) {
            this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(c, n);
            this.IIllIllIIllIIlllIIIlIlllI = this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl();
        }
        if (n == 28 || n == 156) {
            this.lllIIIllIIIIlllIlIIllIIll((class_1197)this.lIlIlIIlIIIIlIIIIIlllIIII.get(0));
        }
        ((class_1197)this.lIlIlIIlIIIIlIIIIIlllIIII.get((int)0)).IllIIIllIIIIlIlIlIllIIlll = this.IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl().length() > 0;
        this.lIllllIIlIIIlIllllllIIIll();
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        super.lllIIIllIIIIlllIlIIllIIll(n, n2, n3);
        if (this.IlIIlllllIIlIlIlllllIllll) {
            this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(n, n2, n3);
        } else {
            this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(n, n2, n3);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
        this.llIIlIllIllllIlIIIIlIIlll();
        this.lllIIIllIIIIlllIlIIllIIll(this.lIlIllIIlIIlIIlIIlIIlIIll, class_0616.lllIIIllIIIIlllIlIIllIIll("selectWorld.create", new Object[0]), this.IlIlIIlllIIlIllIIIlllllIl / 2, 20, -1);
        if (this.IlIIlllllIIlIlIlllllIllll) {
            this.lllIlIIlIIIlIlIIIllIlllIl(this.lIlIllIIlIIlIIlIIlIIlIIll, class_0616.lllIIIllIIIIlllIlIIllIIll("selectWorld.enterSeed", new Object[0]), this.IlIlIIlllIIlIllIIIlllllIl / 2 - 100, 47, -6250336);
            this.lllIlIIlIIIlIlIIIllIlllIl(this.lIlIllIIlIIlIIlIIlIIlIIll, class_0616.lllIIIllIIIIlllIlIIllIIll("selectWorld.seedInfo", new Object[0]), this.IlIlIIlllIIlIllIIIlllllIl / 2 - 100, 85, -6250336);
            this.lllIlIIlIIIlIlIIIllIlllIl(this.lIlIllIIlIIlIIlIIlIIlIIll, class_0616.lllIIIllIIIIlllIlIIllIIll("selectWorld.mapFeatures.info", new Object[0]), this.IlIlIIlllIIlIllIIIlllllIl / 2 - 150, 122, -6250336);
            this.lllIlIIlIIIlIlIIIllIlllIl(this.lIlIllIIlIIlIIlIIlIIlIIll, class_0616.lllIIIllIIIIlllIlIIllIIll("selectWorld.allowCommands.info", new Object[0]), this.IlIlIIlllIIlIllIIIlllllIl / 2 - 150, 172, -6250336);
            this.lIlllIlllIIIIlIIlllIllIII.lIllllIIlIIIlIllllllIIIll();
            if (class_1074.lllIIIllIIIIlllIlIIllIIll[this.lIlIIllllIlIIIIllIIIIlIIl].IllIIlllllllIIlIIlIIIIlIl()) {
                this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(class_0616.lllIIIllIIIIlllIlIIllIIll(class_1074.lllIIIllIIIIlllIlIIllIIll[this.lIlIIllllIlIIIIllIIIIlIIl].IlIllllllIIlIIllllIIlIIIl(), new Object[0]), this.llIIIlllIlllIlIllIIIIllIl.lIllllIIlIIIlIllllllIIIll + 2, this.llIIIlllIlllIlIllIIIIllIl.IIIllIIlIIIIIIlIlIIllIIlI + 22, this.llIIIlllIlllIlIllIIIIllIl.IlIIIIIllllllIIlllIllllll(), 0xA0A0A0);
            }
        } else {
            this.lllIlIIlIIIlIlIIIllIlllIl(this.lIlIllIIlIIlIIlIIlIIlIIll, class_0616.lllIIIllIIIIlllIlIIllIIll("selectWorld.enterName", new Object[0]), this.IlIlIIlllIIlIllIIIlllllIl / 2 - 100, 47, -6250336);
            this.lllIlIIlIIIlIlIIIllIlllIl(this.lIlIllIIlIIlIIlIIlIIlIIll, class_0616.lllIIIllIIIIlllIlIIllIIll("selectWorld.resultFolder", new Object[0]) + " " + this.IlIIIIIllllllIIlllIllllll, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 100, 85, -6250336);
            this.IlIllllllIIlIIllllIIlIIIl.lIllllIIlIIIlIllllllIIIll();
            this.lllIlIIlIIIlIlIIIllIlllIl(this.lIlIllIIlIIlIIlIIlIIlIIll, this.llllIIIIlIIIlIIIIIIlIllll, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 100, 137, -6250336);
            this.lllIlIIlIIIlIlIIIllIlllIl(this.lIlIllIIlIIlIIlIIlIIlIIll, this.llIIIIllIIIIIIIlIIIlIIIIl, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 100, 149, -6250336);
        }
        super.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0770 class_07702) {
        this.llllllIlIllllIlIlIlIIIIlI = class_0616.lllIIIllIIIIlllIlIIllIIll("selectWorld.newWorld.copyOf", class_07702.lIIIIlIlIIlllllIIllIIlIII());
        this.IIllIllIIllIIlllIIIlIlllI = class_07702.lllIlIIlIIIlIlIIIllIlllIl() + "";
        this.lIlIIllllIlIIIIllIIIIlIIl = class_07702.IlIIIlIIIIllIIIllIIIIIIll().IIIllIIlIIIIIIlIlIIllIIlI();
        this.lllIIIllIIIIlllIlIIllIIll = class_07702.llIllllIlIllIIIlIllIIlIlI();
        this.IIIllIIlIIIIIIlIlIIllIIlI = class_07702.lIIlIIIIIlIlllIlIIlIlIlll();
        this.IllIIlllllllIIlIIlIIIIlIl = class_07702.IIlllIlIlllIllIIIlllIIlIl();
        if (class_07702.lIlIlIIlIIIIlIIIIIlllIIII()) {
            this.lIllllIIlIIIlIllllllIIIll = "hardcore";
        } else if (class_07702.IlIlIIlllIIlIllIIIlllllIl().IlIIIIIllllllIIlllIllllll()) {
            this.lIllllIIlIIIlIllllllIIIll = "survival";
        } else if (class_07702.IlIlIIlllIIlIllIIIlllllIl().lIlllIlllIIIIlIIlllIllIII()) {
            this.lIllllIIlIIIlIllllllIIIll = "creative";
        }
    }
}

