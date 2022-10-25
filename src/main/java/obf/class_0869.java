package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.StringUtils
 *  org.lwjgl.opengl.GL11
 */
import com.moonsworth.lunar.client.font.LCFontRenderer;
import org.apache.commons.lang3.StringUtils;
import org.lwjgl.opengl.GL11;

public class class_0869
extends class_0759 {
    private final LCFontRenderer IIIllIIlIIIIIIlIlIIllIIlI;
    private String IllIIlllllllIIlIIlIIIIlIl = "";
    private int IIIllIllIIlIlIlIlIllllIIl = 120;
    private int IllIIIllIIIIlIlIlIllIIlll;
    private boolean lIIIIlIlIIlllllIIllIIlIII = true;
    private boolean llIIlllIllIllllIIIlIIIIII = true;
    private boolean llIIllIllIlIIlIIllIllllll;
    private boolean lllIIlIIIllllllIIIIlIlIlI = true;
    private int IlIlllIIIIIIlIIllIIllIlll;
    private int IlIlIIlIlIllIIlIlIIllIIIl;
    private int lllllIlllIIllIlIIlIIIllII;
    private int IlIlIIlllIIlIllIIIlllllIl = 0xE0E0E0;
    private int lIIlIIIIIlIlllIlIIlIlIlll = 0x707070;
    private boolean lIlIlIIlIIIIlIIIIIlllIIII = true;
    private final int IlIIIlIIIIllIIIllIIIIIIll;
    private final int IIlllIlIlllIllIIIlllIIlIl;
    private final boolean lIlIllIIlIIlIIlIIlIIlIIll;
    private final String llIIlIllIllllIlIIIIlIIlll;

    public class_0869(LCFontRenderer class_09542, String string, int n, int n2) {
        this(class_09542, string, n, n2, false);
    }

    public class_0869(LCFontRenderer class_09542, String string, int n, int n2, boolean bl) {
        this.IIIllIIlIIIIIIlIlIIllIIlI = class_09542;
        this.llIIlIllIllllIlIIIIlIIlll = string;
        this.IlIIIlIIIIllIIIllIIIIIIll = n;
        this.IIlllIlIlllIllIIIlllIIlIl = n2;
        this.lIlIllIIlIIlIIlIIlIIlIIll = bl;
    }

    public void IllIIlllllllIIlIIlIIIIlIl() {
        ++this.IllIIIllIIIIlIlIlIllIIlll;
    }

    public void lllIIIllIIIIlllIlIIllIIll(String string) {
        this.IllIIlllllllIIlIIlIIIIlIl = string.length() > this.IIIllIllIIlIlIlIlIllllIIl ? string.substring(0, this.IIIllIllIIlIlIlIlIllllIIl) : string;
        this.llIIlllIllIllllIIIlIIIIII();
    }

    public String IIIllIllIIlIlIlIlIllllIIl() {
        return this.IllIIlllllllIIlIIlIIIIlIl;
    }

    public String IllIIIllIIIIlIlIlIllIIlll() {
        int n = this.IlIlIIlIlIllIIlIlIIllIIIl < this.lllllIlllIIllIlIIlIIIllII ? this.IlIlIIlIlIllIIlIlIIllIIIl : this.lllllIlllIIllIlIIlIIIllII;
        int n2 = this.IlIlIIlIlIllIIlIlIIllIIIl < this.lllllIlllIIllIlIIlIIIllII ? this.lllllIlllIIllIlIIlIIIllII : this.IlIlIIlIlIllIIlIlIIllIIIl;
        return this.IllIIlllllllIIlIIlIIIIlIl.substring(n, n2);
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(String string) {
        int n;
        String string2 = "";
        String string3 = class_1395.lllIIIllIIIIlllIlIIllIIll(string);
        int n2 = this.IlIlIIlIlIllIIlIlIIllIIIl < this.lllllIlllIIllIlIIlIIIllII ? this.IlIlIIlIlIllIIlIlIIllIIIl : this.lllllIlllIIllIlIIlIIIllII;
        int n3 = this.IlIlIIlIlIllIIlIlIIllIIIl < this.lllllIlllIIllIlIIlIIIllII ? this.lllllIlllIIllIlIIlIIIllII : this.IlIlIIlIlIllIIlIlIIllIIIl;
        int n4 = this.IIIllIllIIlIlIlIlIllllIIl - this.IllIIlllllllIIlIIlIIIIlIl.length() - (n2 - this.lllllIlllIIllIlIIlIIIllII);
        boolean bl = false;
        if (this.IllIIlllllllIIlIIlIIIIlIl.length() > 0) {
            string2 = string2 + this.IllIIlllllllIIlIIlIIIIlIl.substring(0, n2);
        }
        if (n4 < string3.length()) {
            string2 = string2 + string3.substring(0, n4);
            n = n4;
        } else {
            string2 = string2 + string3;
            n = string3.length();
        }
        if (this.IllIIlllllllIIlIIlIIIIlIl.length() > 0 && n3 < this.IllIIlllllllIIlIIlIIIIlIl.length()) {
            string2 = string2 + this.IllIIlllllllIIlIIlIIIIlIl.substring(n3);
        }
        this.IllIIlllllllIIlIIlIIIIlIl = string2;
        this.lIlllIlllIIIIlIIlllIllIII(n2 - this.lllllIlllIIllIlIIlIIIllII + n);
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n) {
        if (this.IllIIlllllllIIlIIlIIIIlIl.length() != 0) {
            if (this.lllllIlllIIllIlIIlIIIllII != this.IlIlIIlIlIllIIlIlIIllIIIl) {
                this.lllIlIIlIIIlIlIIIllIlllIl("");
            } else {
                this.lllIlIIlIIIlIlIIIllIlllIl(this.IlIllllllIIlIIllllIIlIIIl(n) - this.IlIlIIlIlIllIIlIlIIllIIIl);
            }
        }
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(int n) {
        if (this.IllIIlllllllIIlIIlIIIIlIl.length() != 0) {
            if (this.lllllIlllIIllIlIIlIIIllII != this.IlIlIIlIlIllIIlIlIIllIIIl) {
                this.lllIlIIlIIIlIlIIIllIlllIl("");
            } else {
                boolean bl = n < 0;
                int n2 = bl ? this.IlIlIIlIlIllIIlIlIIllIIIl + n : this.IlIlIIlIlIllIIlIlIIllIIIl;
                int n3 = bl ? this.IlIlIIlIlIllIIlIlIIllIIIl : this.IlIlIIlIlIllIIlIlIIllIIIl + n;
                String string = "";
                if (n2 >= 0) {
                    string = this.IllIIlllllllIIlIIlIIIIlIl.substring(0, n2);
                }
                if (n3 < this.IllIIlllllllIIlIIlIIIIlIl.length()) {
                    string = string + this.IllIIlllllllIIlIIlIIIIlIl.substring(n3);
                }
                this.IllIIlllllllIIlIIlIIIIlIl = string;
                if (bl) {
                    this.lIlllIlllIIIIlIIlllIllIII(n);
                }
            }
        }
    }

    public int IlIllllllIIlIIllllIIlIIIl(int n) {
        return this.lllIIIllIIIIlllIlIIllIIll(n, this.IlIlllIIIIIIlIIllIIllIlll());
    }

    public int lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        return this.lllIIIllIIIIlllIlIIllIIll(n, this.IlIlllIIIIIIlIIllIIllIlll(), true);
    }

    public int lllIIIllIIIIlllIlIIllIIll(int n, int n2, boolean bl) {
        int n3 = n2;
        boolean bl2 = n < 0;
        int n4 = Math.abs(n);
        for (int i = 0; i < n4; ++i) {
            if (bl2) {
                while (bl && n3 > 0 && this.IllIIlllllllIIlIIlIIIIlIl.charAt(n3 - 1) == ' ') {
                    --n3;
                }
                while (n3 > 0 && this.IllIIlllllllIIlIIlIIIIlIl.charAt(n3 - 1) != ' ') {
                    --n3;
                }
                continue;
            }
            int n5 = this.IllIIlllllllIIlIIlIIIIlIl.length();
            if ((n3 = this.IllIIlllllllIIlIIlIIIIlIl.indexOf(32, n3)) == -1) {
                n3 = n5;
                continue;
            }
            while (bl && n3 < n5 && this.IllIIlllllllIIlIIlIIIIlIl.charAt(n3) == ' ') {
                ++n3;
            }
        }
        return n3;
    }

    public void lIlllIlllIIIIlIIlllIllIII(int n) {
        this.IlIIIIIllllllIIlllIllllll(this.lllllIlllIIllIlIIlIIIllII + n);
    }

    public void IlIIIIIllllllIIlllIllllll(int n) {
        this.IlIlIIlIlIllIIlIlIIllIIIl = n;
        int n2 = this.IllIIlllllllIIlIIlIIIIlIl.length();
        if (this.IlIlIIlIlIllIIlIlIIllIIIl < 0) {
            this.IlIlIIlIlIllIIlIlIIllIIIl = 0;
        }
        if (this.IlIlIIlIlIllIIlIlIIllIIIl > n2) {
            this.IlIlIIlIlIllIIlIlIIllIIIl = n2;
        }
        this.IIIllIllIIlIlIlIlIllllIIl(this.IlIlIIlIlIllIIlIlIIllIIIl);
    }

    public void lIIIIlIlIIlllllIIllIIlIII() {
        this.IlIIIIIllllllIIlllIllllll(0);
    }

    public void llIIlllIllIllllIIIlIIIIII() {
        this.IlIIIIIllllllIIlllIllllll(this.IllIIlllllllIIlIIlIIIIlIl.length());
    }

    public boolean lllIlIIlIIIlIlIIIllIlllIl(char c, int n) {
        if (!this.llIIllIllIlIIlIIllIllllll) {
            return false;
        }
        switch (c) {
            case '\u0001': {
                this.llIIlllIllIllllIIIlIIIIII();
                this.IIIllIllIIlIlIlIlIllllIIl(0);
                return true;
            }
            case '\u0003': {
                class_0229.IlIllllllIIlIIllllIIlIIIl(this.IllIIIllIIIIlIlIlIllIIlll());
                return true;
            }
            case '\u0016': {
                if (this.lllIIlIIIllllllIIIIlIlIlI) {
                    this.lllIlIIlIIIlIlIIIllIlllIl(class_0229.lIIlIIIIIlIlllIlIIlIlIlll());
                }
                return true;
            }
            case '\u0018': {
                class_0229.IlIllllllIIlIIllllIIlIIIl(this.IllIIIllIIIIlIlIlIllIIlll());
                if (this.lllIIlIIIllllllIIIIlIlIlI) {
                    this.lllIlIIlIIIlIlIIIllIlllIl("");
                }
                return true;
            }
        }
        switch (n) {
            case 14: {
                if (class_0229.llIllllIlIllIIIlIllIIlIlI()) {
                    if (this.lllIIlIIIllllllIIIIlIlIlI) {
                        this.lllIIIllIIIIlllIlIIllIIll(-1);
                    }
                } else if (this.lllIIlIIIllllllIIIIlIlIlI) {
                    this.lllIlIIlIIIlIlIIIllIlllIl(-1);
                }
                return true;
            }
            case 199: {
                if (class_0229.lIlllIlllIlIIIIlllIlIlIIl()) {
                    this.IIIllIllIIlIlIlIlIllllIIl(0);
                } else {
                    this.lIIIIlIlIIlllllIIllIIlIII();
                }
                return true;
            }
            case 203: {
                if (class_0229.lIlllIlllIlIIIIlllIlIlIIl()) {
                    if (class_0229.llIllllIlIllIIIlIllIIlIlI()) {
                        this.IIIllIllIIlIlIlIlIllllIIl(this.lllIIIllIIIIlllIlIIllIIll(-1, this.IlIlIIlllIIlIllIIIlllllIl()));
                    } else {
                        this.IIIllIllIIlIlIlIlIllllIIl(this.IlIlIIlllIIlIllIIIlllllIl() - 1);
                    }
                } else if (class_0229.llIllllIlIllIIIlIllIIlIlI()) {
                    this.IlIIIIIllllllIIlllIllllll(this.IlIllllllIIlIIllllIIlIIIl(-1));
                } else {
                    this.lIlllIlllIIIIlIIlllIllIII(-1);
                }
                return true;
            }
            case 205: {
                if (class_0229.lIlllIlllIlIIIIlllIlIlIIl()) {
                    if (class_0229.llIllllIlIllIIIlIllIIlIlI()) {
                        this.IIIllIllIIlIlIlIlIllllIIl(this.lllIIIllIIIIlllIlIIllIIll(1, this.IlIlIIlllIIlIllIIIlllllIl()));
                    } else {
                        this.IIIllIllIIlIlIlIlIllllIIl(this.IlIlIIlllIIlIllIIIlllllIl() + 1);
                    }
                } else if (class_0229.llIllllIlIllIIIlIllIIlIlI()) {
                    this.IlIIIIIllllllIIlllIllllll(this.IlIllllllIIlIIllllIIlIIIl(1));
                } else {
                    this.lIlllIlllIIIIlIIlllIllIII(1);
                }
                return true;
            }
            case 207: {
                if (class_0229.lIlllIlllIlIIIIlllIlIlIIl()) {
                    this.IIIllIllIIlIlIlIlIllllIIl(this.IllIIlllllllIIlIIlIIIIlIl.length());
                } else {
                    this.llIIlllIllIllllIIIlIIIIII();
                }
                return true;
            }
            case 211: {
                if (class_0229.llIllllIlIllIIIlIllIIlIlI()) {
                    if (this.lllIIlIIIllllllIIIIlIlIlI) {
                        this.lllIIIllIIIIlllIlIIllIIll(1);
                    }
                } else if (this.lllIIlIIIllllllIIIIlIlIlI) {
                    this.lllIlIIlIIIlIlIIIllIlllIl(1);
                }
                return true;
            }
        }
        if (class_1395.lllIIIllIIIIlllIlIIllIIll(c)) {
            if (this.lllIIlIIIllllllIIIIlIlIlI) {
                this.lllIlIIlIIIlIlIIIllIlllIl(Character.toString(c));
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(float f, float f2, int n, boolean bl) {
        boolean bl2;
        if (!bl) {
            this.lllIlIIlIIIlIlIIIllIlllIl(false);
            return true;
        }
        if (n == 1 && this.lllIIIllIIIIlllIlIIllIIll(f, f2)) {
            this.lllIIIllIIIIlllIlIIllIIll("");
        }
        boolean bl3 = bl2 = f >= this.lllIIIllIIIIlllIlIIllIIll && f < this.lllIIIllIIIIlllIlIIllIIll + this.IlIllllllIIlIIllllIIlIIIl && f2 >= this.lllIlIIlIIIlIlIIIllIlllIl && f2 < this.lllIlIIlIIIlIlIIIllIlllIl + this.lIlllIlllIIIIlIIlllIllIII;
        if (this.llIIlllIllIllllIIIlIIIIII) {
            this.lllIlIIlIIIlIlIIIllIlllIl(bl2);
        }
        if (this.llIIllIllIlIIlIIllIllllll && n == 0) {
            float f3 = f - this.lllIIIllIIIIlllIlIIllIIll;
            if (this.lIIIIlIlIIlllllIIllIIlIII) {
                f3 -= 4.0f;
            }
            String string = this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(this.IllIIlllllllIIlIIlIIIIlIl.substring(this.IlIlllIIIIIIlIIllIIllIlll), this.lIIlIIIIIlIlllIlIIlIlIlll());
            this.IlIIIIIllllllIIlllIllllll(this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(string, f3).length() + this.IlIlllIIIIIIlIIllIIllIlll);
        }
        return false;
    }

    public void llIIllIllIlIIlIIllIllllll() {
        if (this.lIlIlIIlIIIIlIIIIIlllIIII()) {
            if (this.IlIlIIlIlIllIIlIlIIllIIIl()) {
                class_0210.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl, this.lllIIIllIIIIlllIlIIllIIll + this.IlIllllllIIlIIllllIIlIIIl, this.lllIlIIlIIIlIlIIIllIlllIl + this.lIlllIlllIIIIlIIlllIllIII, this.IlIIIlIIIIllIIIllIIIIIIll);
            }
            int n = this.lllIIlIIIllllllIIIIlIlIlI ? this.IlIlIIlllIIlIllIIIlllllIl : this.lIIlIIIIIlIlllIlIIlIlIlll;
            int n2 = this.IlIlIIlIlIllIIlIlIIllIIIl - this.IlIlllIIIIIIlIIllIIllIlll;
            int n3 = this.lllllIlllIIllIlIIlIIIllII - this.IlIlllIIIIIIlIIllIIllIlll;
            String string = this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(this.IllIIlllllllIIlIIlIIIIlIl.substring(this.IlIlllIIIIIIlIIllIIllIlll), this.lIIlIIIIIlIlllIlIIlIlIlll());
            if (this.lIlIllIIlIIlIIlIIlIIlIIll) {
                string = StringUtils.repeat((char)'*', (int)string.length());
            }
            boolean bl = n2 >= 0 && n2 <= string.length();
            boolean bl2 = this.llIIllIllIlIIlIIllIllllll && this.IllIIIllIIIIlIlIlIllIIlll / 6 % 2 == 0 && bl;
            float f = this.lIIIIlIlIIlllllIIllIIlIII ? this.lllIIIllIIIIlllIlIIllIIll + 4.0f : this.lllIIIllIIIIlllIlIIllIIll;
            float f2 = this.lIIIIlIlIIlllllIIllIIlIII ? this.lllIlIIlIIIlIlIIIllIlllIl + (this.lIlllIlllIIIIlIIlllIllIII - 8.0f) / 2.0f : this.lllIlIIlIIIlIlIIIllIlllIl;
            float f3 = f;
            if (n3 > string.length()) {
                n3 = string.length();
            }
            if (string.length() > 0) {
                String string2 = bl ? string.substring(0, n2) : string;
                f3 = this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(string2, (double)f, (double)f2, n);
            } else if (!this.lllllIlllIIllIlIIlIIIllII()) {
                this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(this.llIIlIllIllllIlIIIIlIIlll, (double)f, (double)f2, n);
            }
            boolean bl3 = this.IlIlIIlIlIllIIlIlIIllIIIl < this.IllIIlllllllIIlIIlIIIIlIl.length() || this.IllIIlllllllIIlIIlIIIIlIl.length() >= this.lllIIlIIIllllllIIIIlIlIlI();
            float f4 = f3;
            if (!bl) {
                f4 = n2 > 0 ? f + this.IlIllllllIIlIIllllIIlIIIl : f;
            } else if (bl3) {
                f4 = f3 - 1.0f;
                f3 -= 1.0f;
            }
            if (string.length() > 0 && bl && n2 < string.length()) {
                this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(string.substring(n2), (double)f3, (double)f2, n);
            }
            if (bl2) {
                if (bl3) {
                    class_0210.lllIIIllIIIIlllIlIIllIIll(f4, f2 - 1.0f, f4 + 1.0f, f2 + 1.0f + (float)this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(), -3092272);
                } else {
                    this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll("_", (double)f4, (double)f2, n);
                }
            }
            if (n3 != n2) {
                float f5 = f + (float)this.IIIllIIlIIIIIIlIlIIllIIlI.lllIlIIlIIIlIlIIIllIlllIl(string.substring(0, n3));
                this.lllIlIIlIIIlIlIIIllIlllIl(f4, f2 - 1.0f + 2.0f, f5 - 1.0f, f2 + 1.0f + (float)this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll() + 2.0f);
            }
        }
    }

    private void lllIlIIlIIIlIlIIIllIlllIl(float f, float f2, float f3, float f4) {
        float f5;
        if (f < f3) {
            f5 = f;
            f = f3;
            f3 = f5;
        }
        if (f2 < f4) {
            f5 = f2;
            f2 = f4;
            f4 = f5;
        }
        if (f3 > this.lllIIIllIIIIlllIlIIllIIll + this.IlIllllllIIlIIllllIIlIIIl) {
            f3 = this.lllIIIllIIIIlllIlIIllIIll + this.IlIllllllIIlIIllllIIlIIIl;
        }
        if (f > this.lllIIIllIIIIlllIlIIllIIll + this.IlIllllllIIlIIllllIIlIIIl) {
            f = this.lllIIIllIIIIlllIlIIllIIll + this.IlIllllllIIlIIllllIIlIIIl;
        }
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        GL11.glColor4f((float)0.0f, (float)0.0f, (float)255.0f, (float)255.0f);
        GL11.glDisable((int)3553);
        GL11.glEnable((int)3058);
        GL11.glLogicOp((int)5387);
        class_08682.lllIlIIlIIIlIlIIIllIlllIl();
        class_08682.lllIIIllIIIIlllIlIIllIIll((double)f, (double)f4, 0.0);
        class_08682.lllIIIllIIIIlllIlIIllIIll((double)f3, (double)f4, 0.0);
        class_08682.lllIIIllIIIIlllIlIIllIIll((double)f3, (double)f2, 0.0);
        class_08682.lllIIIllIIIIlllIlIIllIIll((double)f, (double)f2, 0.0);
        class_08682.lllIIIllIIIIlllIlIIllIIll();
        GL11.glDisable((int)3058);
        GL11.glEnable((int)3553);
    }

    public void lIllllIIlIIIlIllllllIIIll(int n) {
        this.IIIllIllIIlIlIlIlIllllIIl = n;
        if (this.IllIIlllllllIIlIIlIIIIlIl.length() > n) {
            this.IllIIlllllllIIlIIlIIIIlIl = this.IllIIlllllllIIlIIlIIIIlIl.substring(0, n);
        }
    }

    public int lllIIlIIIllllllIIIIlIlIlI() {
        return this.IIIllIllIIlIlIlIlIllllIIl;
    }

    public int IlIlllIIIIIIlIIllIIllIlll() {
        return this.IlIlIIlIlIllIIlIlIIllIIIl;
    }

    public boolean IlIlIIlIlIllIIlIlIIllIIIl() {
        return this.lIIIIlIlIIlllllIIllIIlIII;
    }

    public void lllIIIllIIIIlllIlIIllIIll(boolean bl) {
        this.lIIIIlIlIIlllllIIllIIlIII = bl;
    }

    public void IIIllIIlIIIIIIlIlIIllIIlI(int n) {
        this.IlIlIIlllIIlIllIIIlllllIl = n;
    }

    public void IllIIlllllllIIlIIlIIIIlIl(int n) {
        this.lIIlIIIIIlIlllIlIIlIlIlll = n;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(boolean bl) {
        if (bl && !this.llIIllIllIlIIlIIllIllllll) {
            this.IllIIIllIIIIlIlIlIllIIlll = 0;
        }
        this.llIIllIllIlIIlIIllIllllll = bl;
    }

    public boolean lllllIlllIIllIlIIlIIIllII() {
        return this.llIIllIllIlIIlIIllIllllll;
    }

    public void IlIllllllIIlIIllllIIlIIIl(boolean bl) {
        this.lllIIlIIIllllllIIIIlIlIlI = bl;
    }

    public int IlIlIIlllIIlIllIIIlllllIl() {
        return this.lllllIlllIIllIlIIlIIIllII;
    }

    public float lIIlIIIIIlIlllIlIIlIlIlll() {
        return this.IlIlIIlIlIllIIlIlIIllIIIl() ? this.IlIllllllIIlIIllllIIlIIIl - 8.0f : this.IlIllllllIIlIIllllIIlIIIl;
    }

    public void IIIllIllIIlIlIlIlIllllIIl(int n) {
        int n2 = this.IllIIlllllllIIlIIlIIIIlIl.length();
        if (n > n2) {
            n = n2;
        }
        if (n < 0) {
            n = 0;
        }
        this.lllllIlllIIllIlIIlIIIllII = n;
        if (this.IIIllIIlIIIIIIlIlIIllIIlI != null) {
            if (this.IlIlllIIIIIIlIIllIIllIlll > n2) {
                this.IlIlllIIIIIIlIIllIIllIlll = n2;
            }
            float f = this.lIIlIIIIIlIlllIlIIlIlIlll();
            String string = this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(this.IllIIlllllllIIlIIlIIIIlIl.substring(this.IlIlllIIIIIIlIIllIIllIlll), f);
            int n3 = string.length() + this.IlIlllIIIIIIlIIllIIllIlll;
            if (n == this.IlIlllIIIIIIlIIllIIllIlll) {
                this.IlIlllIIIIIIlIIllIIllIlll -= this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(this.IllIIlllllllIIlIIlIIIIlIl, f, true).length();
            }
            if (n > n3) {
                this.IlIlllIIIIIIlIIllIIllIlll += n - n3;
            } else if (n <= this.IlIlllIIIIIIlIIllIIllIlll) {
                this.IlIlllIIIIIIlIIllIIllIlll -= this.IlIlllIIIIIIlIIllIIllIlll - n;
            }
            if (this.IlIlllIIIIIIlIIllIIllIlll < 0) {
                this.IlIlllIIIIIIlIIllIIllIlll = 0;
            }
            if (this.IlIlllIIIIIIlIIllIIllIlll > n2) {
                this.IlIlllIIIIIIlIIllIIllIlll = n2;
            }
        }
    }

    public void lIlllIlllIIIIlIIlllIllIII(boolean bl) {
        this.llIIlllIllIllllIIIlIIIIII = bl;
    }

    public boolean lIlIlIIlIIIIlIIIIIlllIIII() {
        return this.lIlIlIIlIIIIlIIIIIlllIIII;
    }

    public void IlIIIIIllllllIIlllIllllll(boolean bl) {
        this.lIlIlIIlIIIIlIIIIIlllIIII = bl;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll() {
        this.IllIIlllllllIIlIIlIIIIlIl();
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(float f, float f2, boolean bl) {
        this.llIIllIllIlIIlIIllIllllll();
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(char c, int n) {
        this.lllIlIIlIIIlIlIIIllIlllIl(c, n);
    }
}

