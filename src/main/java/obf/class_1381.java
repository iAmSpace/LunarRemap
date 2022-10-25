package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Splitter
 *  com.google.common.collect.Lists
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.input.Keyboard
 */
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import java.util.List;

import com.moonsworth.lunar.client.LunarClient;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;

public class class_1381
extends class_0229
implements class_0945 {
    private static final Logger lllIIIllIIIIlllIlIIllIIll = LogManager.getLogger();
    private final class_2245 lllIlIIlIIIlIlIIIllIlllIl = new class_2245();
    private class_0229 IlIllllllIIlIIllllIIlIIIl;
    private class_2159 lIlllIlllIIIIlIIlllIllIII;
    private class_2151 IlIIIIIllllllIIlllIllllll;
    private class_1197 lIllllIIlIIIlIllllllIIIll;
    private class_1197 IIIllIIlIIIIIIlIlIIllIIlI;
    private class_1197 IllIIlllllllIIlIIlIIIIlIl;
    private boolean IIIllIllIIlIlIlIlIllllIIl;
    private boolean IllIIIllIIIIlIlIlIllIIlll;
    private boolean lIIIIlIlIIlllllIIllIIlIII;
    private boolean lIlllIlllIlIIIIlllIlIlIIl;
    private String IlIIlllllIIlIlIlllllIllll;
    private class_1092 llIIlIlIlllIIllIlIlllIllI;
    private class_1422 IllIIIIllIIllIllIlllIlIIl;
    private class_0280 IIIIIIIIlIllIIllIIlllIllI;
    private boolean IIlIIlIlIlIllIIlIlIIIIlll;

    public void lllIIIllIIIIlllIlIIllIIll(class_0924 class_09242) {
        this.lllIIIllIIIIlllIlIIllIIll(class_09242.lllIIIllIIIIlllIlIIllIIll());
    }

    public boolean lllIlIIlIIIlIlIIIllIlllIl(class_0924 class_09242) {
        class_0677 class_06772;
        int n = this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(class_09242);
        class_0677 class_06773 = class_06772 = n < 0 ? null : this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl(n + 1);
        return n > 0 && class_06772 != null && class_06772 instanceof class_0924;
    }

    public void IlIllllllIIlIIllllIIlIIIl(class_0924 class_09242) {
        class_0677 class_06772;
        int n = this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(class_09242);
        class_0677 class_06773 = class_06772 = n < 0 ? null : this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl(n - 1);
        if (n > 0 && class_06772 != null && class_06772 instanceof class_0924) {
            this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(n, n - 1);
            this.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII.lIllllIIlIIIlIllllllIIIll() - 1);
            this.lIlllIlllIIIIlIIlllIllIII.IlIIIIIllllllIIlllIllllll(-this.lIlllIlllIIIIlIIlllIllIII.lIIIIlIlIIlllllIIllIIlIII());
            this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(this.IlIIIIIllllllIIlllIllllll);
        }
    }

    public void lIlllIlllIIIIlIIlllIllIII(class_0924 class_09242) {
        class_0677 class_06772;
        int n = this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(class_09242);
        class_0677 class_06773 = class_06772 = n < 0 ? null : this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl(n + 1);
        if (n > 0 && class_06772 != null && class_06772 instanceof class_0924) {
            this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(n, n + 1);
            this.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII.lIllllIIlIIIlIllllllIIIll() + 1);
            this.lIlllIlllIIIIlIIlllIllIII.IlIIIIIllllllIIlllIllllll(-this.lIlllIlllIIIIlIIlllIllIII.lIIIIlIlIIlllllIIllIIlIII());
            this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(this.IlIIIIIllllllIIlllIllllll);
        }
    }

    public boolean IlIIIIIllllllIIlllIllllll(class_0924 class_09242) {
        try {
            class_0677 class_06772;
            int n = this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(class_09242);
            class_0677 class_06773 = class_06772 = n < 0 ? null : this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl(n - 1);
            if (n > 0 && class_06772 != null && class_06772 instanceof class_0924) {
                return true;
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return false;
    }

    public class_1381(class_0229 class_02292) {
        this.IlIllllllIIlIIllllIIlIIIl = class_02292;
    }

    @Override
    public void n_() {
        Keyboard.enableRepeatEvents((boolean)true);
        this.lIlIlIIlIIIIlIIIIIlllIIII.clear();
        if (!this.IIlIIlIlIlIllIIlIlIIIIlll) {
            this.IIlIIlIlIlIllIIlIlIIIIlll = true;
            this.IlIIIIIllllllIIlllIllllll = new class_2151(this.lllllIlllIIllIlIIlIIIllII);
            this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll();
            this.IllIIIIllIIllIllIlllIlIIl = new class_1422();
            try {
                this.IIIIIIIIlIllIIllIIlllIllI = new class_0280(this.IllIIIIllIIllIllIlllIlIIl);
                this.IIIIIIIIlIllIIllIIlllIllI.start();
            }
            catch (Exception exception) {
                lllIIIllIIIIlllIlIIllIIll.warn("Unable to start LAN server detection: " + exception.getMessage());
            }
            this.lIlllIlllIIIIlIIlllIllIII = new class_2159(this, this.lllllIlllIIllIlIIlIIIllII, this.IlIlIIlllIIlIllIIIlllllIl, this.lIIlIIIIIlIlllIlIIlIlIlll, 32, this.lIIlIIIIIlIlllIlIIlIlIlll - 64, 36);
            this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(this.IlIIIIIllllllIIlllIllllll);
        } else {
            this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(this.IlIlIIlllIIlIllIIIlllllIl, this.lIIlIIIIIlIlllIlIIlIlIlll, 32, this.lIIlIIIIIlIlllIlIIlIlIlll - 64);
        }
        this.lIllllIIlIIIlIllllllIIIll();
    }

    public void lIllllIIlIIIlIllllllIIIll() {
        this.lIllllIIlIIIlIllllllIIIll = new class_1197(7, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 154, this.lIIlIIIIIlIlllIlIIlIlIlll - 28, 70, 20, class_0616.lllIIIllIIIIlllIlIIllIIll("selectServer.edit", new Object[0]));
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(this.lIllllIIlIIIlIllllllIIIll);
        this.IllIIlllllllIIlIIlIIIIlIl = new class_1197(2, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 74, this.lIIlIIIIIlIlllIlIIlIlIlll - 28, 70, 20, class_0616.lllIIIllIIIIlllIlIIllIIll("selectServer.delete", new Object[0]));
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(this.IllIIlllllllIIlIIlIIIIlIl);
        this.IIIllIIlIIIIIIlIlIIllIIlI = new class_1197(1, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 154, this.lIIlIIIIIlIlllIlIIlIlIlll - 52, 100, 20, class_0616.lllIIIllIIIIlllIlIIllIIll("selectServer.select", new Object[0]));
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(this.IIIllIIlIIIIIIlIlIIllIIlI);
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1197(4, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 50, this.lIIlIIIIIlIlllIlIIlIlIlll - 52, 100, 20, class_0616.lllIIIllIIIIlllIlIIllIIll("selectServer.direct", new Object[0])));
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1197(3, this.IlIlIIlllIIlIllIIIlllllIl / 2 + 4 + 50, this.lIIlIIIIIlIlllIlIIlIlIlll - 52, 100, 20, class_0616.lllIIIllIIIIlllIlIIllIIll("selectServer.add", new Object[0])));
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1197(8, this.IlIlIIlllIIlIllIIIlllllIl / 2 + 4, this.lIIlIIIIIlIlllIlIIlIlIlll - 28, 70, 20, class_0616.lllIIIllIIIIlllIlIIllIIll("selectServer.refresh", new Object[0])));
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1197(0, this.IlIlIIlllIIlIllIIIlllllIl / 2 + 4 + 76, this.lIIlIIIIIlIlllIlIIlIlIlll - 28, 75, 20, class_0616.lllIIIllIIIIlllIlIIllIIll("gui.cancel", new Object[0])));
        this.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII.lIllllIIlIIIlIllllllIIIll());
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
        super.IlIllllllIIlIIllllIIlIIIl();
        if (this.IllIIIIllIIllIllIlllIlIIl.lllIIIllIIIIlllIlIIllIIll()) {
            List list = this.IllIIIIllIIllIllIlllIlIIl.IlIllllllIIlIIllllIIlIIIl();
            this.IllIIIIllIIllIllIlllIlIIl.lllIlIIlIIIlIlIIIllIlllIl();
            this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(list);
        }
        this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll();
    }

    @Override
    public void o_() {
        Keyboard.enableRepeatEvents((boolean)false);
        if (this.IIIIIIIIlIllIIllIIlllIllI != null) {
            this.IIIIIIIIlIllIIllIIlllIllI.interrupt();
            this.IIIIIIIIlIllIIllIIlllIllI = null;
        }
        this.lllIlIIlIIIlIlIIIllIlllIl.lllIlIIlIIIlIlIIIllIlllIl();
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1197 class_11972) {
        if (class_11972.IllIIIllIIIIlIlIlIllIIlll) {
            class_0677 class_06772;
            class_0677 class_06773 = class_06772 = this.lIlllIlllIIIIlIIlllIllIII.lIllllIIlIIIlIllllllIIIll() < 0 ? null : this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl(this.lIlllIlllIIIIlIIlllIllIII.lIllllIIlIIIlIllllllIIIll());
            if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 2 && class_06772 instanceof class_0924) {
                String string = ((class_0924)class_06772).lllIIIllIIIIlllIlIIllIIll().lllIIIllIIIIlllIlIIllIIll;
                if (string != null) {
                    this.IIIllIllIIlIlIlIlIllllIIl = true;
                    String string2 = class_0616.lllIIIllIIIIlllIlIIllIIll("selectServer.deleteQuestion", new Object[0]);
                    String string3 = "'" + string + "' " + class_0616.lllIIIllIIIIlllIlIIllIIll("selectServer.deleteWarning", new Object[0]);
                    String string4 = class_0616.lllIIIllIIIIlllIlIIllIIll("selectServer.deleteButton", new Object[0]);
                    String string5 = class_0616.lllIIIllIIIIlllIlIIllIIll("gui.cancel", new Object[0]);
                    class_0923 class_09232 = new class_0923(this, string2, string3, string4, string5, this.lIlllIlllIIIIlIIlllIllIII.lIllllIIlIIIlIllllllIIIll());
                    this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(class_09232);
                }
            } else if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 1) {
                this.IIIllIIlIIIIIIlIlIIllIIlI();
            } else if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 4) {
                this.lIlllIlllIlIIIIlllIlIlIIl = true;
                this.llIIlIlIlllIIllIlIlllIllI = new class_1092(class_0616.lllIIIllIIIIlllIlIIllIIll("selectServer.defaultName", new Object[0]), "");
                this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(new class_0440(this, this.llIIlIlIlllIIllIlIlllIllI));
            } else if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 3) {
                this.IllIIIllIIIIlIlIlIllIIlll = true;
                this.llIIlIlIlllIIllIlIlllIllI = new class_1092(class_0616.lllIIIllIIIIlllIlIIllIIll("selectServer.defaultName", new Object[0]), "");
                this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(new class_2027(this, this.llIIlIlIlllIIllIlIlllIllI));
            } else if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 7 && class_06772 instanceof class_0924) {
                this.lIIIIlIlIIlllllIIllIIlIII = true;
                class_1092 class_10922 = ((class_0924)class_06772).lllIIIllIIIIlllIlIIllIIll();
                this.llIIlIlIlllIIllIlIlllIllI = new class_1092(class_10922.lllIIIllIIIIlllIlIIllIIll, class_10922.lllIlIIlIIIlIlIIIllIlllIl);
                this.llIIlIlIlllIIllIlIlllIllI.lllIIIllIIIIlllIlIIllIIll(class_10922);
                this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(new class_2027(this, this.llIIlIlIlllIIllIlIlllIllI));
            } else if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 0) {
                this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl);
            } else if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 8) {
                this.IllIIIllIIIIlIlIlIllIIlll();
            }
        }
    }

    private void IllIIIllIIIIlIlIlIllIIlll() {
        this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(new class_1381(this.IlIllllllIIlIIllllIIlIIIl));
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(boolean bl, int n) {
        class_0677 class_06772;
        class_0677 class_06773 = class_06772 = this.lIlllIlllIIIIlIIlllIllIII.lIllllIIlIIIlIllllllIIIll() < 0 ? null : this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl(this.lIlllIlllIIIIlIIlllIllIII.lIllllIIlIIIlIllllllIIIll());
        if (this.IIIllIllIIlIlIlIlIllllIIl) {
            this.IIIllIllIIlIlIlIlIllllIIl = false;
            if (bl && class_06772 instanceof class_0924) {
                this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl(this.lIlllIlllIIIIlIIlllIllIII.lIllllIIlIIIlIllllllIIIll());
                this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl();
                this.lIlllIlllIIIIlIIlllIllIII.IlIllllllIIlIIllllIIlIIIl(-1);
                this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(this.IlIIIIIllllllIIlllIllllll);
            }
            this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(this);
        } else if (this.lIlllIlllIlIIIIlllIlIlIIl) {
            this.lIlllIlllIlIIIIlllIlIlIIl = false;
            if (bl) {
                this.lllIIIllIIIIlllIlIIllIIll(this.llIIlIlIlllIIllIlIlllIllI);
            } else {
                this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(this);
            }
        } else if (this.IllIIIllIIIIlIlIlIllIIlll) {
            this.IllIIIllIIIIlIlIlIllIIlll = false;
            if (bl) {
                this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(this.llIIlIlIlllIIllIlIlllIllI);
                this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl();
                this.lIlllIlllIIIIlIIlllIllIII.IlIllllllIIlIIllllIIlIIIl(-1);
                this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(this.IlIIIIIllllllIIlllIllllll);
            }
            this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(this);
        } else if (this.lIIIIlIlIIlllllIIllIIlIII) {
            this.lIIIIlIlIIlllllIIllIIlIII = false;
            if (bl && (class_06772 instanceof class_0924 || class_06772 instanceof class_1303)) {
                class_1092 class_10922 = ((class_0924)class_06772).lllIIIllIIIIlllIlIIllIIll();
                class_10922.lllIIIllIIIIlllIlIIllIIll = this.llIIlIlIlllIIllIlIlllIllI.lllIIIllIIIIlllIlIIllIIll;
                class_10922.lllIlIIlIIIlIlIIIllIlllIl = this.llIIlIlIlllIIllIlIlllIllI.lllIlIIlIIIlIlIIIllIlllIl;
                class_10922.lllIIIllIIIIlllIlIIllIIll(this.llIIlIlIlllIIllIlIlllIllI);
                this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl();
                this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(this.IlIIIIIllllllIIlllIllllll);
            }
            this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(this);
        }
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(char c, int n) {
        class_0677 class_06772;
        int n2 = this.lIlllIlllIIIIlIIlllIllIII.lIllllIIlIIIlIllllllIIIll();
        class_0677 class_06773 = class_06772 = n2 < 0 ? null : this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl(n2);
        if (n == 63) {
            this.IllIIIllIIIIlIlIlIllIIlll();
        } else if (n2 >= 0) {
            if (n == 200) {
                if (class_1381.lIlllIlllIlIIIIlllIlIlIIl()) {
                    if (n2 > 0 && class_06772 instanceof class_0924) {
                        this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(n2, n2 - 1);
                        this.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII.lIllllIIlIIIlIllllllIIIll() - 1);
                        this.lIlllIlllIIIIlIIlllIllIII.IlIIIIIllllllIIlllIllllll(-this.lIlllIlllIIIIlIIlllIllIII.lIIIIlIlIIlllllIIllIIlIII());
                        this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(this.IlIIIIIllllllIIlllIllllll);
                    }
                } else if (n2 > 0) {
                    this.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII.lIllllIIlIIIlIllllllIIIll() - 1);
                    this.lIlllIlllIIIIlIIlllIllIII.IlIIIIIllllllIIlllIllllll(-this.lIlllIlllIIIIlIIlllIllIII.lIIIIlIlIIlllllIIllIIlIII());
                    if (this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl(this.lIlllIlllIIIIlIIlllIllIII.lIllllIIlIIIlIllllllIIIll()) instanceof class_1195) {
                        if (this.lIlllIlllIIIIlIIlllIllIII.lIllllIIlIIIlIllllllIIIll() > 0) {
                            this.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll() - 1);
                            this.lIlllIlllIIIIlIIlllIllIII.IlIIIIIllllllIIlllIllllll(-this.lIlllIlllIIIIlIIlllIllIII.lIIIIlIlIIlllllIIllIIlIII());
                        } else {
                            this.lllIIIllIIIIlllIlIIllIIll(-1);
                        }
                    }
                } else {
                    this.lllIIIllIIIIlllIlIIllIIll(-1);
                }
            } else if (n == 208) {
                if (class_1381.lIlllIlllIlIIIIlllIlIlIIl()) {
                    if (n2 < this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl() - 1) {
                        this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(n2, n2 + 1);
                        this.lllIIIllIIIIlllIlIIllIIll(n2 + 1);
                        this.lIlllIlllIIIIlIIlllIllIII.IlIIIIIllllllIIlllIllllll(this.lIlllIlllIIIIlIIlllIllIII.lIIIIlIlIIlllllIIllIIlIII());
                        this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(this.IlIIIIIllllllIIlllIllllll);
                    }
                } else if (n2 < this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll()) {
                    this.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII.lIllllIIlIIIlIllllllIIIll() + 1);
                    this.lIlllIlllIIIIlIIlllIllIII.IlIIIIIllllllIIlllIllllll(this.lIlllIlllIIIIlIIlllIllIII.lIIIIlIlIIlllllIIllIIlIII());
                    if (this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl(this.lIlllIlllIIIIlIIlllIllIII.lIllllIIlIIIlIllllllIIIll()) instanceof class_1195) {
                        if (this.lIlllIlllIIIIlIIlllIllIII.lIllllIIlIIIlIllllllIIIll() < this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll() - 1) {
                            this.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll() + 1);
                            this.lIlllIlllIIIIlIIlllIllIII.IlIIIIIllllllIIlllIllllll(this.lIlllIlllIIIIlIIlllIllIII.lIIIIlIlIIlllllIIllIIlIII());
                        } else {
                            this.lllIIIllIIIIlllIlIIllIIll(-1);
                        }
                    }
                } else {
                    this.lllIIIllIIIIlllIlIIllIIll(-1);
                }
            } else if (n != 28 && n != 156) {
                super.lllIIIllIIIIlllIlIIllIIll(c, n);
            } else {
                this.lllIIIllIIIIlllIlIIllIIll((class_1197)this.lIlIlIIlIIIIlIIIIIlllIIII.get(2));
            }
        } else {
            super.lllIIIllIIIIlllIlIIllIIll(c, n);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
        this.IlIIlllllIIlIlIlllllIllll = null;
        this.llIIlIllIllllIlIIIIlIIlll();
        this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
        this.lllIIIllIIIIlllIlIIllIIll(this.lIlIllIIlIIlIIlIIlIIlIIll, class_0616.lllIIIllIIIIlllIlIIllIIll("multiplayer.title", new Object[0]), this.IlIlIIlllIIlIllIIIlllllIl / 2, 20, 0xFFFFFF);
        super.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
        if (this.IlIIlllllIIlIlIlllllIllll != null) {
            this.lllIIIllIIIIlllIlIIllIIll(Lists.newArrayList((Iterable)Splitter.on((String)"\n").split((CharSequence)this.IlIIlllllIIlIlIlllllIllll)), n, n2);
        }
    }

    public void IIIllIIlIIIIIIlIlIIllIIlI() {
        class_0677 class_06772;
        class_0677 class_06773 = class_06772 = this.lIlllIlllIIIIlIIlllIllIII.lIllllIIlIIIlIllllllIIIll() < 0 ? null : this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl(this.lIlllIlllIIIIlIIlllIllIII.lIllllIIlIIIlIllllllIIIll());
        if (class_06772 instanceof class_0924) {
            this.lllIIIllIIIIlllIlIIllIIll(((class_0924)class_06772).lllIIIllIIIIlllIlIIllIIll());
        } else if (class_06772 instanceof class_1303) {
            this.lllIIIllIIIIlllIlIIllIIll(((class_1303)class_06772).lllIIIllIIIIlllIlIIllIIll());
        } else if (class_06772 instanceof class_1306) {
            class_0494 class_04942 = ((class_1306)class_06772).lllIIIllIIIIlllIlIIllIIll();
            this.lllIIIllIIIIlllIlIIllIIll(new class_1092(class_04942.lllIIIllIIIIlllIlIIllIIll(), class_04942.lllIlIIlIIIlIlIIIllIlllIl(), true));
        }
    }

    void lllIIIllIIIIlllIlIIllIIll(class_1092 class_10922) {
        if (this.lllllIlllIIllIlIIlIIIllII.IlIllllllIIlIIllllIIlIIIl != null && this.lllllIlllIIllIlIIlIIIllII.theWorld != null) {
            this.lllllIlllIIllIlIIlIIIllII.theWorld.q_();
            this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll((class_0564)null);
        }
        for (String string : LunarClient.getInstance().getSettingsManager().IlIllllllIIlIIllllIIlIIIl()) {
            if (!class_10922.lllIlIIlIIIlIlIIIllIlllIl.startsWith(string) && !class_10922.lllIlIIlIIIlIlIIIllIlllIl.matches("([a-zA-Z0-9]+)" + string + "([a-zA-Z0-9]+)")) continue;
            this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(new class_1753(this, class_10922));
            return;
        }
        this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(new class_0019(this, this.lllllIlllIIllIlIIlIIIllII, class_10922));
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n) {
        this.lIlllIlllIIIIlIIlllIllIII.IlIllllllIIlIIllllIIlIIIl(n);
        class_0677 class_06772 = n < 0 ? null : this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl(n);
        this.IIIllIIlIIIIIIlIlIIllIIlI.IllIIIllIIIIlIlIlIllIIlll = false;
        this.lIllllIIlIIIlIllllllIIIll.IllIIIllIIIIlIlIlIllIIlll = false;
        this.IllIIlllllllIIlIIlIIIIlIl.IllIIIllIIIIlIlIlIllIIlll = false;
        if (class_06772 != null && !(class_06772 instanceof class_1195)) {
            this.IIIllIIlIIIIIIlIlIIllIIlI.IllIIIllIIIIlIlIlIllIIlll = true;
            if (class_06772 instanceof class_0924) {
                this.lIllllIIlIIIlIllllllIIIll.IllIIIllIIIIlIlIlIllIIlll = true;
                this.IllIIlllllllIIlIIlIIIIlIl.IllIIIllIIIIlIlIlIllIIlll = true;
            }
        }
    }

    public class_2245 IllIIlllllllIIlIIlIIIIlIl() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public void lllIIIllIIIIlllIlIIllIIll(String string) {
        this.IlIIlllllIIlIlIlllllIllll = string;
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        super.lllIIIllIIIIlllIlIIllIIll(n, n2, n3);
        this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(n, n2, n3);
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, int n3) {
        super.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3);
        this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3);
    }

    public class_2151 IIIllIllIIlIlIlIlIllllIIl() {
        return this.IlIIIIIllllllIIlllIllllll;
    }
}

