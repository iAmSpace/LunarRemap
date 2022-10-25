package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.List;

import net.minecraft.util.MathHelper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_2083
extends class_0229
implements class_0945 {
    private static final Logger IlIllllllIIlIIllllIIlIIIl = LogManager.getLogger();
    private final DateFormat lIlllIlllIIIIlIIlllIllIII = new SimpleDateFormat();
    protected class_0229 lllIIIllIIIIlllIlIIllIIll;
    protected String lllIlIIlIIIlIlIIIllIlllIl = "Select world";
    private boolean IlIIIIIllllllIIlllIllllll;
    private int lIllllIIlIIIlIllllllIIIll;
    private List IIIllIIlIIIIIIlIlIIllIIlI;
    private class_0421 IllIIlllllllIIlIIlIIIIlIl;
    private String IIIllIllIIlIlIlIlIllllIIl;
    private String IllIIIllIIIIlIlIlIllIIlll;
    private String[] lIIIIlIlIIlllllIIllIIlIII = new String[3];
    private boolean lIlllIlllIlIIIIlllIlIlIIl;
    private class_1197 IlIIlllllIIlIlIlllllIllll;
    private class_1197 llIIlIlIlllIIllIlIlllIllI;
    private class_1197 IllIIIIllIIllIllIlllIlIIl;
    private class_1197 IIIIIIIIlIllIIllIIlllIllI;

    public class_2083(class_0229 class_02292) {
        this.lllIIIllIIIIlllIlIIllIIll = class_02292;
    }

    @Override
    public void n_() {
        this.lllIlIIlIIIlIlIIIllIlllIl = class_0616.lllIIIllIIIIlllIlIIllIIll("selectWorld.title", new Object[0]);
        try {
            this.IIIllIIlIIIIIIlIlIIllIIlI();
        }
        catch (class_0324 class_03242) {
            IlIllllllIIlIIllllIIlIIIl.error("Couldn't load level list", (Throwable)class_03242);
            this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(new class_0427("Unable to load worlds", class_03242.getMessage()));
            return;
        }
        this.IIIllIllIIlIlIlIlIllllIIl = class_0616.lllIIIllIIIIlllIlIIllIIll("selectWorld.world", new Object[0]);
        this.IllIIIllIIIIlIlIlIllIIlll = class_0616.lllIIIllIIIIlllIlIIllIIll("selectWorld.conversion", new Object[0]);
        this.lIIIIlIlIIlllllIIllIIlIII[class_2243.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll()] = class_0616.lllIIIllIIIIlllIlIIllIIll("gameMode.survival", new Object[0]);
        this.lIIIIlIlIIlllllIIllIIlIII[class_2243.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll()] = class_0616.lllIIIllIIIIlllIlIIllIIll("gameMode.creative", new Object[0]);
        this.lIIIIlIlIIlllllIIllIIlIII[class_2243.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll()] = class_0616.lllIIIllIIIIlllIlIIllIIll("gameMode.adventure", new Object[0]);
        this.IllIIlllllllIIlIIlIIIIlIl = new class_0421(this);
        this.IllIIlllllllIIlIIlIIIIlIl.lIlllIlllIIIIlIIlllIllIII(4, 5);
        this.lIllllIIlIIIlIllllllIIIll();
    }

    private void IIIllIIlIIIIIIlIlIIllIIlI() {
        class_2055 class_20552 = this.lllllIlllIIllIlIIlIIIllII.lIllllIIlIIIlIllllllIIIll();
        this.IIIllIIlIIIIIIlIlIIllIIlI = class_20552.lllIlIIlIIIlIlIIIllIlllIl();
        Collections.sort(this.IIIllIIlIIIIIIlIlIIllIIlI);
        this.lIllllIIlIIIlIllllllIIIll = -1;
    }

    protected String lllIIIllIIIIlllIlIIllIIll(int n) {
        return ((class_0748)this.IIIllIIlIIIIIIlIlIIllIIlI.get(n)).lllIIIllIIIIlllIlIIllIIll();
    }

    protected String lIlllIlllIIIIlIIlllIllIII(int n) {
        String string = ((class_0748)this.IIIllIIlIIIIIIlIlIIllIIlI.get(n)).lllIlIIlIIIlIlIIIllIlllIl();
        if (string == null || MathHelper.lllIIIllIIIIlllIlIIllIIll(string)) {
            string = class_0616.lllIIIllIIIIlllIlIIllIIll("selectWorld.world", new Object[0]) + " " + (n + 1);
        }
        return string;
    }

    public void lIllllIIlIIIlIllllllIIIll() {
        this.llIIlIlIlllIIllIlIlllIllI = new class_1197(1, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 154, this.lIIlIIIIIlIlllIlIIlIlIlll - 52, 150, 20, class_0616.lllIIIllIIIIlllIlIIllIIll("selectWorld.select", new Object[0]));
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(this.llIIlIlIlllIIllIlIlllIllI);
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1197(3, this.IlIlIIlllIIlIllIIIlllllIl / 2 + 4, this.lIIlIIIIIlIlllIlIIlIlIlll - 52, 150, 20, class_0616.lllIIIllIIIIlllIlIIllIIll("selectWorld.create", new Object[0])));
        this.IllIIIIllIIllIllIlllIlIIl = new class_1197(6, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 154, this.lIIlIIIIIlIlllIlIIlIlIlll - 28, 72, 20, class_0616.lllIIIllIIIIlllIlIIllIIll("selectWorld.rename", new Object[0]));
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(this.IllIIIIllIIllIllIlllIlIIl);
        this.IlIIlllllIIlIlIlllllIllll = new class_1197(2, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 76, this.lIIlIIIIIlIlllIlIIlIlIlll - 28, 72, 20, class_0616.lllIIIllIIIIlllIlIIllIIll("selectWorld.delete", new Object[0]));
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(this.IlIIlllllIIlIlIlllllIllll);
        this.IIIIIIIIlIllIIllIIlllIllI = new class_1197(7, this.IlIlIIlllIIlIllIIIlllllIl / 2 + 4, this.lIIlIIIIIlIlllIlIIlIlIlll - 28, 72, 20, class_0616.lllIIIllIIIIlllIlIIllIIll("selectWorld.recreate", new Object[0]));
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(this.IIIIIIIIlIllIIllIIlllIllI);
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1197(0, this.IlIlIIlllIIlIllIIIlllllIl / 2 + 82, this.lIIlIIIIIlIlllIlIIlIlIlll - 28, 72, 20, class_0616.lllIIIllIIIIlllIlIIllIIll("gui.cancel", new Object[0])));
        this.llIIlIlIlllIIllIlIlllIllI.IllIIIllIIIIlIlIlIllIIlll = false;
        this.IlIIlllllIIlIlIlllllIllll.IllIIIllIIIIlIlIlIllIIlll = false;
        this.IllIIIIllIIllIllIlllIlIIl.IllIIIllIIIIlIlIlIllIIlll = false;
        this.IIIIIIIIlIllIIllIIlllIllI.IllIIIllIIIIlIlIlIllIIlll = false;
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1197 class_11972) {
        if (class_11972.IllIIIllIIIIlIlIlIllIIlll) {
            if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 2) {
                String string = this.lIlllIlllIIIIlIIlllIllIII(this.lIllllIIlIIIlIllllllIIIll);
                if (string != null) {
                    this.lIlllIlllIlIIIIlllIlIlIIl = true;
                    class_0923 class_09232 = class_2083.lllIIIllIIIIlllIlIIllIIll(this, string, this.lIllllIIlIIIlIllllllIIIll);
                    this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(class_09232);
                }
            } else if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 1) {
                this.IlIIIIIllllllIIlllIllllll(this.lIllllIIlIIIlIllllllIIIll);
            } else if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 3) {
                this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(new class_0697(this));
            } else if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 6) {
                this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(new class_0644(this, this.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll)));
            } else if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 0) {
                this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll);
            } else if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 7) {
                class_0697 class_06972 = new class_0697(this);
                class_0028 class_00282 = this.lllllIlllIIllIlIIlIIIllII.lIllllIIlIIIlIllllllIIIll().lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll), false);
                class_0770 class_07702 = class_00282.IlIllllllIIlIIllllIIlIIIl();
                class_00282.lllIIIllIIIIlllIlIIllIIll();
                class_06972.lllIIIllIIIIlllIlIIllIIll(class_07702);
                this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(class_06972);
            } else {
                this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(class_11972);
            }
        }
    }

    public void IlIIIIIllllllIIlllIllllll(int n) {
        this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll((class_0229)null);
        if (!this.IlIIIIIllllllIIlllIllllll) {
            String string;
            this.IlIIIIIllllllIIlllIllllll = true;
            String string2 = this.lllIIIllIIIIlllIlIIllIIll(n);
            if (string2 == null) {
                string2 = "World" + n;
            }
            if ((string = this.lIlllIlllIIIIlIIlllIllIII(n)) == null) {
                string = "World" + n;
            }
            if (this.lllllIlllIIllIlIIlIIIllII.lIllllIIlIIIlIllllllIIIll().lIllllIIlIIIlIllllllIIIll(string2)) {
                this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(string2, string, null);
            }
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(boolean bl, int n) {
        if (this.lIlllIlllIlIIIIlllIlIlIIl) {
            this.lIlllIlllIlIIIIlllIlIlIIl = false;
            if (bl) {
                class_2055 class_20552 = this.lllllIlllIIllIlIIlIIIllII.lIllllIIlIIIlIllllllIIIll();
                class_20552.lIlllIlllIIIIlIIlllIllIII();
                class_20552.IlIIIIIllllllIIlllIllllll(this.lllIIIllIIIIlllIlIIllIIll(n));
                try {
                    this.IIIllIIlIIIIIIlIlIIllIIlI();
                }
                catch (class_0324 class_03242) {
                    IlIllllllIIlIIllllIIlIIIl.error("Couldn't load level list", (Throwable)class_03242);
                }
            }
            this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(this);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
        this.lllIIIllIIIIlllIlIIllIIll(this.lIlIllIIlIIlIIlIIlIIlIIll, this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIlIIlllIIlIllIIIlllllIl / 2, 20, 0xFFFFFF);
        super.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
    }

    public static class_0923 lllIIIllIIIIlllIlIIllIIll(class_0945 class_09452, String string, int n) {
        String string2 = class_0616.lllIIIllIIIIlllIlIIllIIll("selectWorld.deleteQuestion", new Object[0]);
        String string3 = "'" + string + "' " + class_0616.lllIIIllIIIIlllIlIIllIIll("selectWorld.deleteWarning", new Object[0]);
        String string4 = class_0616.lllIIIllIIIIlllIlIIllIIll("selectWorld.deleteButton", new Object[0]);
        String string5 = class_0616.lllIIIllIIIIlllIlIIllIIll("gui.cancel", new Object[0]);
        class_0923 class_09232 = new class_0923(class_09452, string2, string3, string4, string5, n);
        return class_09232;
    }

    static /* synthetic */ List lllIIIllIIIIlllIlIIllIIll(class_2083 class_20832) {
        return class_20832.IIIllIIlIIIIIIlIlIIllIIlI;
    }

    static /* synthetic */ int lllIIIllIIIIlllIlIIllIIll(class_2083 class_20832, int n) {
        class_20832.lIllllIIlIIIlIllllllIIIll = n;
        return class_20832.lIllllIIlIIIlIllllllIIIll;
    }

    static /* synthetic */ int lllIlIIlIIIlIlIIIllIlllIl(class_2083 class_20832) {
        return class_20832.lIllllIIlIIIlIllllllIIIll;
    }

    static /* synthetic */ class_1197 IlIllllllIIlIIllllIIlIIIl(class_2083 class_20832) {
        return class_20832.llIIlIlIlllIIllIlIlllIllI;
    }

    static /* synthetic */ class_1197 lIlllIlllIIIIlIIlllIllIII(class_2083 class_20832) {
        return class_20832.IlIIlllllIIlIlIlllllIllll;
    }

    static /* synthetic */ class_1197 IlIIIIIllllllIIlllIllllll(class_2083 class_20832) {
        return class_20832.IllIIIIllIIllIllIlllIlIIl;
    }

    static /* synthetic */ class_1197 lIllllIIlIIIlIllllllIIIll(class_2083 class_20832) {
        return class_20832.IIIIIIIIlIllIIllIIlllIllI;
    }

    static /* synthetic */ String IIIllIIlIIIIIIlIlIIllIIlI(class_2083 class_20832) {
        return class_20832.IIIllIllIIlIlIlIlIllllIIl;
    }

    static /* synthetic */ DateFormat IllIIlllllllIIlIIlIIIIlIl(class_2083 class_20832) {
        return class_20832.lIlllIlllIIIIlIIlllIllIII;
    }

    static /* synthetic */ String IIIllIllIIlIlIlIlIllllIIl(class_2083 class_20832) {
        return class_20832.IllIIIllIIIIlIlIlIllIIlll;
    }

    static /* synthetic */ String[] IllIIIllIIIIlIlIlIllIIlll(class_2083 class_20832) {
        return class_20832.lIIIIlIlIIlllllIIllIIlIII;
    }
}

