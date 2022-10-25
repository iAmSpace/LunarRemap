package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Mouse
 */
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.stats.StatBase;
import org.lwjgl.input.Mouse;

abstract class class_0318
extends class_0579 {
    protected int lllIIIllIIIIlllIlIIllIIll;
    protected List lllIlIIlIIIlIlIIIllIlllIl;
    protected Comparator llIIllIllIlIIlIIllIllllll;
    protected int lllIIlIIIllllllIIIIlIlIlI;
    protected int IlIlllIIIIIIlIIllIIllIlll;
    final /* synthetic */ class_0342 IlIlIIlIlIllIIlIlIIllIIIl;

    protected class_0318(class_0342 class_03422) {
        this.IlIlIIlIlIllIIlIlIIllIIIl = class_03422;
        super(class_0342.lllIIIllIIIIlllIlIIllIIll(class_03422), class_03422.IlIlIIlllIIlIllIIIlllllIl, class_03422.lIIlIIIIIlIlllIlIIlIlIlll, 32, class_03422.lIIlIIIIIlIlllIlIIlIlIlll - 64, 20);
        this.lllIIIllIIIIlllIlIIllIIll = -1;
        this.lllIIlIIIllllllIIIIlIlIlI = -1;
        this.lllIIIllIIIIlllIlIIllIIll(false);
        this.lllIIIllIIIIlllIlIIllIIll(true, 20);
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(int n, boolean bl, int n2, int n3) {
    }

    @Override
    protected boolean lllIIIllIIIIlllIlIIllIIll(int n) {
        return false;
    }

    @Override
    protected void IlIllllllIIlIIllllIIlIIIl() {
        this.IlIlIIlIlIllIIlIlIIllIIIl.llIIlIllIllllIlIIIIlIIlll();
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(int n, int n2, class_0868 class_08682) {
        if (!Mouse.isButtonDown((int)0)) {
            this.lllIIIllIIIIlllIlIIllIIll = -1;
        }
        if (this.lllIIIllIIIIlllIlIIllIIll == 0) {
            class_0342.lllIIIllIIIIlllIlIIllIIll(this.IlIlIIlIlIllIIlIlIIllIIIl, n + 115 - 18, n2 + 1, 0, 0);
        } else {
            class_0342.lllIIIllIIIIlllIlIIllIIll(this.IlIlIIlIlIllIIlIlIIllIIIl, n + 115 - 18, n2 + 1, 0, 18);
        }
        if (this.lllIIIllIIIIlllIlIIllIIll == 1) {
            class_0342.lllIIIllIIIIlllIlIIllIIll(this.IlIlIIlIlIllIIlIlIIllIIIl, n + 165 - 18, n2 + 1, 0, 0);
        } else {
            class_0342.lllIIIllIIIIlllIlIIllIIll(this.IlIlIIlIlIllIIlIlIIllIIIl, n + 165 - 18, n2 + 1, 0, 18);
        }
        if (this.lllIIIllIIIIlllIlIIllIIll == 2) {
            class_0342.lllIIIllIIIIlllIlIIllIIll(this.IlIlIIlIlIllIIlIlIIllIIIl, n + 215 - 18, n2 + 1, 0, 0);
        } else {
            class_0342.lllIIIllIIIIlllIlIIllIIll(this.IlIlIIlIlIllIIlIlIIllIIIl, n + 215 - 18, n2 + 1, 0, 18);
        }
        if (this.lllIIlIIIllllllIIIIlIlIlI != -1) {
            int n3 = 79;
            int n4 = 18;
            if (this.lllIIlIIIllllllIIIIlIlIlI == 1) {
                n3 = 129;
            } else if (this.lllIIlIIIllllllIIIIlIlIlI == 2) {
                n3 = 179;
            }
            if (this.IlIlllIIIIIIlIIllIIllIlll == 1) {
                n4 = 36;
            }
            class_0342.lllIIIllIIIIlllIlIIllIIll(this.IlIlIIlIlIllIIlIlIIllIIIl, n + n3, n2 + 1, n4, 0);
        }
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        this.lllIIIllIIIIlllIlIIllIIll = -1;
        if (n >= 79 && n < 115) {
            this.lllIIIllIIIIlllIlIIllIIll = 0;
        } else if (n >= 129 && n < 165) {
            this.lllIIIllIIIIlllIlIIllIIll = 1;
        } else if (n >= 179 && n < 215) {
            this.lllIIIllIIIIlllIlIIllIIll = 2;
        }
        if (this.lllIIIllIIIIlllIlIIllIIll >= 0) {
            this.IIIllIIlIIIIIIlIlIIllIIlI(this.lllIIIllIIIIlllIlIIllIIll);
            class_0342.lllIlIIlIIIlIlIIIllIlllIl(this.IlIlIIlIlIllIIlIlIIllIIIl).IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
        }
    }

    @Override
    protected final int lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIlIIlIIIlIlIIIllIlllIl.size();
    }

    protected final class_1536 lllIlIIlIIIlIlIIIllIlllIl(int n) {
        return (class_1536)this.lllIlIIlIIIlIlIIIllIlllIl.get(n);
    }

    protected abstract String IlIllllllIIlIIllllIIlIIIl(int var1);

    protected void lllIIIllIIIIlllIlIIllIIll(StatBase class_03192, int n, int n2, boolean bl) {
        if (class_03192 != null) {
            String string = class_03192.lllIIIllIIIIlllIlIIllIIll(class_0342.IlIllllllIIlIIllllIIlIIIl(this.IlIlIIlIlIllIIlIlIIllIIIl).lllIIIllIIIIlllIlIIllIIll(class_03192));
            this.IlIlIIlIlIllIIlIlIIllIIIl.lllIlIIlIIIlIlIIIllIlllIl(class_0342.lIlllIlllIIIIlIIlllIllIII(this.IlIlIIlIlIllIIlIlIIllIIIl), string, n - class_0342.IlIIIIIllllllIIlllIllllll(this.IlIlIIlIlIllIIlIlIIllIIIl).lllIIIllIIIIlllIlIIllIIll(string), n2 + 5, bl ? 0xFFFFFF : 0x909090);
        } else {
            String string = "-";
            this.IlIlIIlIlIllIIlIlIIllIIIl.lllIlIIlIIIlIlIIIllIlllIl(class_0342.lIllllIIlIIIlIllllllIIIll(this.IlIlIIlIlIllIIlIlIIllIIIl), string, n - class_0342.IIIllIIlIIIIIIlIlIIllIIlI(this.IlIlIIlIlIllIIlIlIIllIIIl).lllIIIllIIIIlllIlIIllIIll(string), n2 + 5, bl ? 0xFFFFFF : 0x909090);
        }
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl(int n, int n2) {
        if (n2 >= this.lIlllIlllIIIIlIIlllIllIII && n2 <= this.IlIIIIIllllllIIlllIllllll) {
            int n3 = this.IlIllllllIIlIIllllIIlIIIl(n, n2);
            int n4 = this.IlIllllllIIlIIllllIIlIIIl / 2 - 92 - 16;
            if (n3 >= 0) {
                if (n < n4 + 40 || n > n4 + 40 + 20) {
                    return;
                }
                class_1536 class_15362 = this.lllIlIIlIIIlIlIIIllIlllIl(n3);
                this.lllIIIllIIIIlllIlIIllIIll(class_15362, n, n2);
            } else {
                String string = "";
                if (n >= n4 + 115 - 18 && n <= n4 + 115) {
                    string = this.IlIllllllIIlIIllllIIlIIIl(0);
                } else if (n >= n4 + 165 - 18 && n <= n4 + 165) {
                    string = this.IlIllllllIIlIIllllIIlIIIl(1);
                } else {
                    if (n < n4 + 215 - 18 || n > n4 + 215) {
                        return;
                    }
                    string = this.IlIllllllIIlIIllllIIlIIIl(2);
                }
                string = ("" + class_0616.lllIIIllIIIIlllIlIIllIIll(string, new Object[0])).trim();
                if (string.length() > 0) {
                    int n5 = n + 12;
                    int n6 = n2 - 12;
                    int n7 = class_0342.IllIIlllllllIIlIIlIIIIlIl(this.IlIlIIlIlIllIIlIlIIllIIIl).lllIIIllIIIIlllIlIIllIIll(string);
                    class_0342.lllIIIllIIIIlllIlIIllIIll((float)(n5 - 3), (float)(n6 - 3), (float)(n5 + n7 + 3), (float)(n6 + 8 + 3), -1073741824, -1073741824);
                    class_0342.IIIllIllIIlIlIlIlIllllIIl(this.IlIlIIlIlIllIIlIlIIllIIIl).lllIIIllIIIIlllIlIIllIIll(string, (float)n5, (float)n6, -1);
                }
            }
        }
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_1536 class_15362, int n, int n2) {
        if (class_15362 != null) {
            Item class_06112 = class_15362.lllIIIllIIIIlllIlIIllIIll();
            String string = ("" + class_0616.lllIIIllIIIIlllIlIIllIIll(class_06112.IllIIIllIIIIlIlIlIllIIlll() + ".name", new Object[0])).trim();
            if (string.length() > 0) {
                int n3 = n + 12;
                int n4 = n2 - 12;
                int n5 = class_0342.IllIIIllIIIIlIlIlIllIIlll(this.IlIlIIlIlIllIIlIlIIllIIIl).lllIIIllIIIIlllIlIIllIIll(string);
                class_0342.lllIIIllIIIIlllIlIIllIIll((float)(n3 - 3), (float)(n4 - 3), (float)(n3 + n5 + 3), (float)(n4 + 8 + 3), -1073741824, -1073741824);
                class_0342.lIIIIlIlIIlllllIIllIIlIII(this.IlIlIIlIlIllIIlIlIIllIIIl).lllIIIllIIIIlllIlIIllIIll(string, (float)n3, (float)n4, -1);
            }
        }
    }

    protected void IIIllIIlIIIIIIlIlIIllIIlI(int n) {
        if (n != this.lllIIlIIIllllllIIIIlIlIlI) {
            this.lllIIlIIIllllllIIIIlIlIlI = n;
            this.IlIlllIIIIIIlIIllIIllIlll = -1;
        } else if (this.IlIlllIIIIIIlIIllIIllIlll == -1) {
            this.IlIlllIIIIIIlIIllIIllIlll = 1;
        } else {
            this.lllIIlIIIllllllIIIIlIlIlI = -1;
            this.IlIlllIIIIIIlIIllIIllIlll = 0;
        }
        Collections.sort(this.lllIlIIlIIIlIlIIIllIlllIl, this.llIIllIllIlIIlIIllIllllll);
    }
}

